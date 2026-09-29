package p000;

/* JADX INFO: loaded from: classes.dex */
final class eha extends i16 {

    /* JADX INFO: renamed from: b */
    public final float f37265b;

    /* JADX INFO: renamed from: c */
    public final float f37266c;

    public eha(float f, float f2) {
        this.f37265b = f;
        this.f37266c = f2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eha)) {
            return false;
        }
        eha ehaVar = (eha) obj;
        return xj2.m24560b(this.f37265b, ehaVar.f37265b) && xj2.m24560b(this.f37266c, ehaVar.f37266c);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        fha fhaVar = new fha();
        fhaVar.f39112J = this.f37265b;
        fhaVar.f39113K = this.f37266c;
        return fhaVar;
    }

    public final int hashCode() {
        return Float.hashCode(this.f37266c) + (Float.hashCode(this.f37265b) * 31);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "defaultMinSize";
        z91 z91Var = y64Var.f69367c;
        z91Var.m25511b(new xj2(this.f37265b), "minWidth");
        z91Var.m25511b(new xj2(this.f37266c), "minHeight");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        fha fhaVar = (fha) d16Var;
        fhaVar.f39112J = this.f37265b;
        fhaVar.f39113K = this.f37266c;
    }
}
