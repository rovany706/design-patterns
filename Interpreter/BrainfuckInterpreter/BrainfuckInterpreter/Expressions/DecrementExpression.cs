namespace BrainfuckInterpreter.Expressions
{
    internal class DecrementExpression : IExpression
    {
        public void Interpret(Context context)
        {
            context.Memory[context.ptr]--;
        }
    }
}