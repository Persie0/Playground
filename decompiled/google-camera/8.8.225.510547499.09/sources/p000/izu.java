package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class izu implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ izv f32726a;

    public izu(izv izvVar) {
        this.f32726a = izvVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        jar jarVar = this.f32726a.f32731d;
        if (jarVar != null) {
            jarVar.m11934o("Job execution failed", th);
        }
    }
}
