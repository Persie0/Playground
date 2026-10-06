package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class izs extends izr {

    /* JADX INFO: renamed from: a */
    private boolean f32724a;

    protected izs(izv izvVar) {
        super(izvVar);
    }

    /* JADX INFO: renamed from: A */
    public final void m11944A() {
        mo11918a();
        this.f32724a = true;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m11945B() {
        return this.f32724a;
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo11918a();

    /* JADX INFO: renamed from: z */
    public final void m11946z() {
        if (!m11945B()) {
            throw new IllegalStateException("Not initialized");
        }
    }
}
