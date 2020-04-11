namespace BrainfuckInterpreter.Expressions
{
    internal class IncrementPointerExpression : IExpression
    {
        public void Interpret(Context context)
        {
            context.ptr++;
        }
    }
}