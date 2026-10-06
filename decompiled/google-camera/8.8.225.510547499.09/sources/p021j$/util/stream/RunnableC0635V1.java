package p021j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.V1 */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC0635V1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33363a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f33364b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Object f33365c;

    public /* synthetic */ RunnableC0635V1(int i, Object obj, Object obj2) {
        this.f33363a = i;
        this.f33364b = obj;
        this.f33365c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f33363a;
        Object obj = this.f33364b;
        Object obj2 = this.f33365c;
        switch (i) {
            case 0:
                try {
                    ((Runnable) obj).run();
                    ((Runnable) obj2).run();
                    return;
                } catch (Throwable th) {
                    try {
                        ((Runnable) obj2).run();
                        break;
                    } catch (Throwable th2) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            break;
                        } catch (Throwable unused) {
                        }
                    }
                    throw th;
                }
            default:
                try {
                    ((BaseStream) obj).close();
                    ((BaseStream) obj2).close();
                    return;
                } catch (Throwable th3) {
                    try {
                        ((BaseStream) obj2).close();
                        break;
                    } catch (Throwable th4) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                            break;
                        } catch (Throwable unused2) {
                        }
                    }
                    throw th3;
                }
        }
    }
}
