package p000;

/* JADX INFO: loaded from: classes.dex */
public final class zt2 extends bu2 {

    /* JADX INFO: renamed from: c */
    public final sm0 f72138c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ du2 f72139d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt2(du2 du2Var, long j, sm0 sm0Var) {
        super(j);
        this.f72139d = du2Var;
        this.f72138c = sm0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f72138c.m21458F(this.f72139d);
    }

    @Override // p000.bu2
    public final String toString() {
        return super.toString() + this.f72138c;
    }
}
