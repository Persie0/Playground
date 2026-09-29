package p000;

import com.airbnb.lottie.C0868b;

/* JADX INFO: loaded from: classes2.dex */
public final class m49 implements cl1 {

    /* JADX INFO: renamed from: a */
    public final String f50583a;

    /* JADX INFO: renamed from: b */
    public final int f50584b;

    /* JADX INFO: renamed from: c */
    public final C3726wl f50585c;

    /* JADX INFO: renamed from: d */
    public final boolean f50586d;

    public m49(String str, int i, C3726wl c3726wl, boolean z) {
        this.f50583a = str;
        this.f50584b = i;
        this.f50585c = c3726wl;
        this.f50586d = z;
    }

    @Override // p000.cl1
    /* JADX INFO: renamed from: a */
    public final qk1 mo403a(C0868b c0868b, gl5 gl5Var, o90 o90Var) {
        return new t39(c0868b, o90Var, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapePath{name=");
        sb.append(this.f50583a);
        sb.append(", index=");
        return wq1.m24122r(sb, this.f50584b, '}');
    }
}
