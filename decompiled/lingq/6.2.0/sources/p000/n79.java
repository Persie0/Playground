package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class n79 extends Thread {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ o79 f52463a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n79(o79 o79Var) {
        super("ExoPlayer:SimpleDecoder");
        this.f52463a = o79Var;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        do {
            try {
            } catch (InterruptedException e) {
                uk9.m22779n(e);
                return;
            }
        } while (this.f52463a.m17831k());
    }
}
