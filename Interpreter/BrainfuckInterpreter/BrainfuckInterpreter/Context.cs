namespace BrainfuckInterpreter
{
    public class Context
    {
        public int ptr { get; set; } // memory pointer
        public byte[] Memory { get; set; }
        public int CodeIndex { get; set; } // index of currently running instruction
        public string Code { get; set; }

        public Context(string code)
        {
            ptr = 0;
            Memory = new byte[30000];
            CodeIndex = 0;
            Code = code;
        }

        public char GetSymbol()
        {
            return Code[CodeIndex];
        }
    }
}