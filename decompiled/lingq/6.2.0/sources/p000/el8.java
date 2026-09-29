package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class el8 implements x48 {

    /* JADX INFO: renamed from: a */
    public yl8 f37441a;

    /* JADX INFO: renamed from: b */
    public il8 f37442b;

    /* JADX INFO: renamed from: c */
    public String f37443c;

    /* JADX INFO: renamed from: d */
    public Object f37444d;

    /* JADX INFO: renamed from: e */
    public Object[] f37445e;

    /* JADX INFO: renamed from: f */
    public hl8 f37446f;

    /* JADX INFO: renamed from: g */
    public final y47 f37447g = new y47(this, 5);

    public el8(yl8 yl8Var, il8 il8Var, String str, Object obj, Object[] objArr) {
        this.f37441a = yl8Var;
        this.f37442b = il8Var;
        this.f37443c = str;
        this.f37444d = obj;
        this.f37445e = objArr;
    }

    /* JADX INFO: renamed from: a */
    public final void m11216a() throws NoSuchMethodException, ClassNotFoundException, IOException {
        String strM24783u;
        il8 il8Var = this.f37442b;
        if (this.f37446f != null) {
            v63.m23135m("entry(", this.f37446f, ") is not null");
            return;
        }
        if (il8Var != null) {
            y47 y47Var = this.f37447g;
            Object objMo0a = y47Var.mo0a();
            if (objMo0a == null || il8Var.mo10400b(objMo0a)) {
                this.f37446f = il8Var.mo10399a(this.f37443c, y47Var);
                return;
            }
            if (objMo0a instanceof vc9) {
                vc9 vc9Var = (vc9) objMo0a;
                if (vc9Var.mo19860b() == s46.f60289d || vc9Var.mo19860b() == tr3.f62761g || vc9Var.mo19860b() == s46.f60290e) {
                    strM24783u = "MutableState containing " + vc9Var.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strM24783u = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strM24783u = xwc.m24783u(objMo0a);
            }
            throw new IllegalArgumentException(strM24783u);
        }
    }

    @Override // p000.x48
    /* JADX INFO: renamed from: d */
    public final void mo1245d() {
        hl8 hl8Var = this.f37446f;
        if (hl8Var != null) {
            ((sq5) hl8Var).m21556E();
        }
    }

    @Override // p000.x48
    /* JADX INFO: renamed from: f */
    public final void mo1246f() {
        hl8 hl8Var = this.f37446f;
        if (hl8Var != null) {
            ((sq5) hl8Var).m21556E();
        }
    }

    @Override // p000.x48
    /* JADX INFO: renamed from: g */
    public final void mo1247g() throws NoSuchMethodException, ClassNotFoundException, IOException {
        m11216a();
    }
}
