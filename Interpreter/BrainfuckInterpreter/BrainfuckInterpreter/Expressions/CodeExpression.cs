using System.Collections.Generic;

namespace BrainfuckInterpreter.Expressions
{
    internal class CodeExpression : IExpression
    {
        private static Dictionary<char, IExpression> Symbols = new Dictionary<char, IExpression>
        {
            {'>', new IncrementPointerExpression() },
            {'<', new DecrementPointerExpression() },
            {'+', new IncrementExpression() },
            {'-', new DecrementExpression() },
            {'.', new PrintExpression() },
            {',', new ReadExpression() }
        };

        public void Interpret(Context context)
        {
            for (; context.CodeIndex < context.Code.Length; context.CodeIndex++)
            {
                IExpression action;
                char currentSymbol = context.GetSymbol();
                if (Symbols.TryGetValue(currentSymbol, out action))
                {
                    action.Interpret(context);
                }
                else
                {
                    if (currentSymbol == '[') // cycle begin
                    {
                        int loopBegin = context.CodeIndex;
                        do
                        {
                            context.CodeIndex = loopBegin + 1;
                            new CodeExpression().Interpret(context);
                        } while (context.Memory[context.ptr] != 0);
                    }
                    else if (currentSymbol == ']') // cycle end
                    {
                        return;
                    }
                }
            }
        }
    }
}