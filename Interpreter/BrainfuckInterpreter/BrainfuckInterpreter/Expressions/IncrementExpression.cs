namespace BrainfuckInterpreter.Expressions
{
    internal class IncrementExpression : IExpression
    {
        public void Interpret(Context context)
        {
            context.Memory[context.ptr]++;
        }
    }
}