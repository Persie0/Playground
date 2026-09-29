package p000;

import androidx.compose.runtime.InvalidationResult;

/* JADX INFO: loaded from: classes.dex */
public final class x18 {

    /* JADX INFO: renamed from: a */
    public pf1 f67639a;

    /* JADX INFO: renamed from: b */
    public int f67640b;

    /* JADX INFO: renamed from: c */
    public oj3 f67641c;

    /* JADX INFO: renamed from: d */
    public zi3 f67642d;

    /* JADX INFO: renamed from: e */
    public int f67643e;

    /* JADX INFO: renamed from: f */
    public d66 f67644f;

    /* JADX INFO: renamed from: g */
    public n66 f67645g;

    public x18(pf1 pf1Var) {
        this.f67639a = pf1Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m24235a() {
        if (this.f67639a != null) {
            oj3 oj3Var = this.f67641c;
            if (oj3Var != null ? oj3Var.m18039a() : false) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final InvalidationResult m24236b(Object obj) {
        InvalidationResult invalidationResultM19103s;
        pf1 pf1Var = this.f67639a;
        return (pf1Var == null || (invalidationResultM19103s = pf1Var.m19103s(this, obj)) == null) ? InvalidationResult.IGNORED : invalidationResultM19103s;
    }

    /* JADX INFO: renamed from: c */
    public final void m24237c() {
        pf1 pf1Var = this.f67639a;
        if (pf1Var != null) {
            pf1Var.f56029J = true;
            pf1Var.f56034O.m16642e();
        }
        this.f67639a = null;
        this.f67644f = null;
        this.f67645g = null;
        this.f67642d = null;
    }

    /* JADX INFO: renamed from: d */
    public final void m24238d(boolean z) {
        int i = this.f67640b;
        this.f67640b = z ? i | 32 : i & (-33);
    }
}
