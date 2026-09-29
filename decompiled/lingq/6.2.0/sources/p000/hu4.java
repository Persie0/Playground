package p000;

import androidx.compose.runtime.AbstractC0278f;

/* JADX INFO: loaded from: classes.dex */
public final class hu4 {

    /* JADX INFO: renamed from: a */
    public final Object f42941a;

    /* JADX INFO: renamed from: b */
    public final iu4 f42942b;

    /* JADX INFO: renamed from: d */
    public int f42944d;

    /* JADX INFO: renamed from: e */
    public hu4 f42945e;

    /* JADX INFO: renamed from: f */
    public boolean f42946f;

    /* JADX INFO: renamed from: c */
    public int f42943c = -1;

    /* JADX INFO: renamed from: g */
    public final t66 f42947g = AbstractC0278f.m1260j(null);

    public hu4(Object obj, iu4 iu4Var) {
        this.f42941a = obj;
        this.f42942b = iu4Var;
    }

    /* JADX INFO: renamed from: a */
    public final hu4 m13463a() {
        if (this.f42946f) {
            l54.m15816c("Pin should not be called on an already disposed item ");
        }
        if (this.f42944d == 0) {
            this.f42942b.f44572a.add(this);
            hu4 hu4Var = (hu4) ((xc9) this.f42947g).getValue();
            if (hu4Var != null) {
                hu4Var.m13463a();
            } else {
                hu4Var = null;
            }
            this.f42945e = hu4Var;
        }
        this.f42944d++;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m13464b() {
        if (this.f42946f) {
            return;
        }
        if (this.f42944d <= 0) {
            l54.m15816c("Release should only be called once");
        }
        int i = this.f42944d - 1;
        this.f42944d = i;
        if (i == 0) {
            this.f42942b.f44572a.remove(this);
            hu4 hu4Var = this.f42945e;
            if (hu4Var != null) {
                hu4Var.m13464b();
            }
            this.f42945e = null;
        }
    }
}
