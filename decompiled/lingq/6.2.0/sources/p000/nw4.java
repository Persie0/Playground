package p000;

import androidx.compose.runtime.AbstractC0278f;

/* JADX INFO: loaded from: classes.dex */
public final class nw4 implements a5b {

    /* JADX INFO: renamed from: a */
    public ui3 f53323a;

    /* JADX INFO: renamed from: b */
    public t66 f53324b;

    /* JADX INFO: renamed from: c */
    public final t66 f53325c = AbstractC0278f.m1260j(Boolean.FALSE);

    /* JADX INFO: renamed from: a */
    public final long m17654a() {
        dc2 dc2Var;
        if (this.f53324b == null) {
            ui3 ui3Var = this.f53323a;
            if (ui3Var == null || (dc2Var = (dc2) ui3Var.mo0a()) == null) {
                dc2Var = dc2.f35376c;
            }
            this.f53324b = AbstractC0278f.m1260j(dc2Var);
            this.f53323a = null;
        }
        t66 t66Var = this.f53324b;
        t66Var.getClass();
        return ((dc2) ((xc9) t66Var).getValue()).f35377a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m17655b() {
        return ((Boolean) ((xc9) this.f53325c).getValue()).booleanValue();
    }
}
