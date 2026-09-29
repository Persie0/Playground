package p000;

/* JADX INFO: loaded from: classes2.dex */
public abstract class enc implements Runnable {

    /* JADX INFO: renamed from: a */
    public final wr9 f37583a;

    public enc() {
        this.f37583a = null;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo3295a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo3295a();
        } catch (Exception e) {
            wr9 wr9Var = this.f37583a;
            if (wr9Var != null) {
                wr9Var.m24139c(e);
            }
        }
    }

    public enc(wr9 wr9Var) {
        this.f37583a = wr9Var;
    }
}
