using System;

namespace BrainfuckInterpreter.Expressions
{
    internal class PrintExpression : IExpression
    {
        public void Interpret(Context context)
        {
            Console.Write((char)context.Memory[context.ptr]);
        }
    }
}