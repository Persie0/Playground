package cc;

/* JADX INFO: renamed from: cc.j4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1852j4 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    public final String f9917a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1879m4 f9918b;

    public C1852j4(C1879m4 c1879m4, String str) {
        this.f9918b = c1879m4;
        this.f9917a = str;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th2) {
        try {
            C1860k3 c1860k3 = ((C1897o4) this.f9918b.f10430a).f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9942f.m5624b(th2, this.f9917a);
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
