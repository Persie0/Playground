package p000;

import android.graphics.BlendModeColorFilter;

/* JADX INFO: loaded from: classes.dex */
public final class qd0 extends fa1 {

    /* JADX INFO: renamed from: b */
    public final long f57603b;

    /* JADX INFO: renamed from: c */
    public final int f57604c;

    public qd0(int i, long j) {
        super(new BlendModeColorFilter(d32.m10042h0(j), pb1.m19030R(i)));
        this.f57603b = j;
        this.f57604c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd0)) {
            return false;
        }
        qd0 qd0Var = (qd0) obj;
        return aa1.m199c(this.f57603b, qd0Var.f57603b) && this.f57604c == qd0Var.f57604c;
    }

    public final int hashCode() {
        int i = aa1.f413l;
        return Integer.hashCode(this.f57604c) + (Long.hashCode(this.f57603b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        ux5.m23002y(this.f57603b, ", blendMode=", sb);
        sb.append((Object) pd0.m19073a(this.f57604c));
        sb.append(')');
        return sb.toString();
    }
}
