package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class i16 implements c16, w64 {

    /* JADX INFO: renamed from: a */
    public y64 f43330a;

    /* JADX INFO: renamed from: h */
    public abstract d16 mo21h();

    @Override // p000.w64
    /* JADX INFO: renamed from: l */
    public final ux8 mo1817l() {
        y64 y64Var = this.f43330a;
        if (y64Var == null) {
            y64Var = new y64();
            y64Var.f69365a = y38.m24933a(getClass()).m25414c();
            mo22n(y64Var);
            this.f43330a = y64Var;
        }
        return y64Var.f69367c;
    }

    @Override // p000.w64
    /* JADX INFO: renamed from: m */
    public final String mo1818m() {
        y64 y64Var = this.f43330a;
        if (y64Var == null) {
            y64Var = new y64();
            y64Var.f69365a = y38.m24933a(getClass()).m25414c();
            mo22n(y64Var);
            this.f43330a = y64Var;
        }
        return y64Var.f69365a;
    }

    /* JADX INFO: renamed from: n */
    public abstract void mo22n(y64 y64Var);

    /* JADX INFO: renamed from: o */
    public abstract void mo23o(d16 d16Var);
}
