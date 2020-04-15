using System;

namespace ObservableStudentJournals
{
    internal class Student : IObserver
    {
        public int StudentId;
        public string Name;

        public void Update(IObservable sender)
        {
            Journal journal = sender as Journal;
            int score = journal.GetScore(StudentId);

            Console.WriteLine($"{Name} got {score} in {journal.Name}!");
        }
    }
}