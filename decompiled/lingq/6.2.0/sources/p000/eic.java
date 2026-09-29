package p000;

/* JADX INFO: loaded from: classes.dex */
public final class eic implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    public final String f37301a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tic f37302b;

    public eic(tic ticVar, String str) {
        this.f37302b = ticVar;
        this.f37301a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        xcc xccVar = ((kjc) this.f37302b.f60774a).f47438f;
        kjc.m15280l(xccVar);
        xccVar.f68080f.m17924b(th, this.f37301a);
    }
}
