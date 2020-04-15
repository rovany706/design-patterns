using System.Collections.Generic;

namespace ObservableStudentJournals
{
    internal abstract class Journal : IObservable
    {
        public string Name; // Journal name
        private List<IObserver> subscribers;
        private Dictionary<int, int> _journal;

        public Dictionary<int, int> ScoreJournal
        {
            get
            {
                return _journal;
            }
            set
            {
                _journal = value;
                Notify();
            }
        }

        public Journal()
        {
            subscribers = new List<IObserver>();
            _journal = new Dictionary<int, int>();
        }

        public int GetScore(int studentId)
        {
            int score = -1;
            _journal.TryGetValue(studentId, out score);

            return score;
        }

        public void Notify()
        {
            foreach (IObserver subscriber in subscribers)
            {
                subscriber.Update(this);
            }
        }

        public void Subscribe(IObserver subscriber)
        {
            subscribers.Add(subscriber);
        }

        public void Unsubscribe(IObserver subscriber)
        {
            subscribers.Remove(subscriber);
        }
    }
}