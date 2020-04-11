using System;

namespace BrainfuckInterpreter.Expressions
{
    internal class ReadExpression : IExpression
    {
        public void Interpret(Context context)
        {
            byte symbol = (byte)Console.Read();
            context.Memory[context.ptr] = symbol;
        }
    }
}