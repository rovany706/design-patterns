namespace ObservableStudentJournals
{
    internal interface IObserver
    {
        void Update(IObservable sender);
    }
}