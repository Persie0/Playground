package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class do9 implements ik8 {

    /* JADX INFO: renamed from: a */
    public final xg3 f35967a;

    /* JADX INFO: renamed from: b */
    public final String f35968b;

    /* JADX INFO: renamed from: c */
    public boolean f35969c;

    public do9(xg3 xg3Var, String str) {
        this.f35967a = xg3Var;
        this.f35968b = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m10551a() {
        if (this.f35969c) {
            AbstractC3695vr.m23485C(21, "statement is closed");
            throw null;
        }
    }

    @Override // p000.ik8
    /* JADX INFO: renamed from: o */
    public void mo3998o() {
        m10551a();
    }

    @Override // p000.ik8
    public void reset() {
        m10551a();
    }
}
