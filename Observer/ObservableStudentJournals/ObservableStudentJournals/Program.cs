using System.Collections.Generic;

namespace ObservableStudentJournals
{
    internal class Program
    {
        private static void Main(string[] args)
        {
            Student studentA = new Student
            {
                Name = "Alice",
                StudentId = 1
            };

            Student studentB = new Student
            {
                Name = "Bob",
                StudentId = 2
            };

            Student studentC = new Student
            {
                Name = "Chris",
                StudentId = 3
            };

            Journal math = new MathJournal();
            Journal literature = new LiteratureJournal();

            math.Subscribe(studentA);
            math.Subscribe(studentB);
            math.Subscribe(studentC);

            literature.Subscribe(studentA);
            literature.Subscribe(studentB);
            literature.Subscribe(studentC);

            Dictionary<int, int> mathScores = new Dictionary<int, int>
            {
                {studentA.StudentId, 5},
                {studentB.StudentId, 3},
                {studentC.StudentId, 4}
            };

            Dictionary<int, int> literatureScores = new Dictionary<int, int>
            {
                {studentA.StudentId, 2},
                {studentB.StudentId, 5},
                {studentC.StudentId, 1}
            };

            math.ScoreJournal = mathScores;
            literature.ScoreJournal = literatureScores;

            // Students got new scores
            mathScores = new Dictionary<int, int>
            {
                {studentA.StudentId, 3},
                {studentB.StudentId, 2},
                {studentC.StudentId, 2}
            };

            literatureScores = new Dictionary<int, int>
            {
                {studentA.StudentId, 5},
                {studentB.StudentId, 2},
                {studentC.StudentId, 4}
            };

            // Student C decided to expel
            math.Unsubscribe(studentC);
            literature.Unsubscribe(studentC);

            math.ScoreJournal = mathScores;
            literature.ScoreJournal = literatureScores;
        }
    }
}