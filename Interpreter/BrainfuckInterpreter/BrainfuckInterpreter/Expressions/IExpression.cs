namespace BrainfuckInterpreter.Expressions
{
    internal interface IExpression
    {
        void Interpret(Context context);
    }
}