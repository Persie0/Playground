package p000;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class j67 implements x48 {

    /* JADX INFO: renamed from: a */
    public final Set f45119a;

    /* JADX INFO: renamed from: b */
    public final x66 f45120b = new x66(new xj3[16]);

    public j67(Set set) {
        this.f45119a = set;
    }

    @Override // p000.x48
    /* JADX INFO: renamed from: d */
    public final void mo1245d() {
    }

    @Override // p000.x48
    /* JADX INFO: renamed from: f */
    public final void mo1246f() {
    }

    @Override // p000.x48
    /* JADX INFO: renamed from: g */
    public final void mo1247g() {
        x66 x66Var = this.f45120b;
        Object[] objArr = x66Var.f67830a;
        int i = x66Var.f67832c;
        for (int i2 = 0; i2 < i; i2++) {
            x48 x48Var = ((xj3) objArr[i2]).f68286a;
            this.f45119a.remove(x48Var);
            x48Var.mo1247g();
        }
    }
}
