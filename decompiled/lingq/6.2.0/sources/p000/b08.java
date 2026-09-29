package p000;

import com.lingq.core.domain.model.onboarding.TooltipStep;

/* JADX INFO: loaded from: classes3.dex */
public final class b08 {

    /* JADX INFO: renamed from: a */
    public final e28 f7729a;

    /* JADX INFO: renamed from: b */
    public final TooltipStep f7730b;

    /* JADX INFO: renamed from: c */
    public final boolean f7731c;

    /* JADX INFO: renamed from: d */
    public final boolean f7732d;

    /* JADX INFO: renamed from: e */
    public final float f7733e;

    public /* synthetic */ b08(e28 e28Var, TooltipStep tooltipStep, int i) {
        this(e28Var, tooltipStep, false, (i & 8) != 0, (i & 16) != 0 ? 0.0f : 24.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b08)) {
            return false;
        }
        b08 b08Var = (b08) obj;
        return fa4.m11650l(this.f7729a, b08Var.f7729a) && this.f7730b == b08Var.f7730b && this.f7731c == b08Var.f7731c && this.f7732d == b08Var.f7732d && Float.compare(this.f7733e, b08Var.f7733e) == 0;
    }

    public final int hashCode() {
        e28 e28Var = this.f7729a;
        return Float.hashCode(this.f7733e) + g9a.m12428e(g9a.m12428e((this.f7730b.hashCode() + ((e28Var == null ? 0 : e28Var.hashCode()) * 31)) * 31, 31, this.f7731c), 31, this.f7732d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TooltipCheck(bounds=");
        sb.append(this.f7729a);
        sb.append(", step=");
        sb.append(this.f7730b);
        sb.append(", withOverlay=");
        wq1.m24101A(sb, this.f7731c, ", dismissOnOutsideTap=", this.f7732d, ", cutoutPaddingPx=");
        return wq1.m24121q(sb, this.f7733e, ")");
    }

    public b08(e28 e28Var, TooltipStep tooltipStep, boolean z, boolean z2, float f) {
        tooltipStep.getClass();
        this.f7729a = e28Var;
        this.f7730b = tooltipStep;
        this.f7731c = z;
        this.f7732d = z2;
        this.f7733e = f;
    }
}
