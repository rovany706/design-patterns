namespace BrainfuckInterpreter.Expressions
{
    internal class DecrementPointerExpression : IExpression
    {
        public void Interpret(Context context)
        {
            context.ptr--;
        }
    }
}