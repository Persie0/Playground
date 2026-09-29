package p000;

/* JADX INFO: loaded from: classes.dex */
public final class um0 {

    /* JADX INFO: renamed from: a */
    public boolean f64056a;

    /* JADX INFO: renamed from: b */
    public ar1 f64057b;

    /* JADX INFO: renamed from: c */
    public boolean f64058c;

    /* JADX INFO: renamed from: a */
    public final void m22792a() {
        synchronized (this) {
            try {
                if (this.f64056a) {
                    return;
                }
                this.f64056a = true;
                this.f64058c = true;
                ar1 ar1Var = this.f64057b;
                if (ar1Var != null) {
                    try {
                        Runnable runnable = (Runnable) ar1Var.f7379b;
                        daa daaVar = (daa) ar1Var.f7380c;
                        Runnable runnable2 = (Runnable) ar1Var.f7381d;
                        if (runnable == null) {
                            daaVar.cancel();
                            runnable2.run();
                        } else {
                            runnable.run();
                        }
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f64058c = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                synchronized (this) {
                    this.f64058c = false;
                    notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
