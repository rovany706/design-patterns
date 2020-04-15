namespace ObservableStudentJournals
{
    internal interface IObservable
    {
        void Subscribe(IObserver subscriber);

        void Unsubscribe(IObserver subscriber);

        void Notify();
    }
}