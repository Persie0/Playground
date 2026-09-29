package p000;

import com.lingq.core.domain.model.onboarding.TooltipStep;

/* JADX INFO: loaded from: classes3.dex */
public final class c7a {

    /* JADX INFO: renamed from: a */
    public final TooltipStep f9664a;

    /* JADX INFO: renamed from: b */
    public final e28 f9665b;

    /* JADX INFO: renamed from: c */
    public final boolean f9666c;

    /* JADX INFO: renamed from: d */
    public final boolean f9667d;

    /* JADX INFO: renamed from: e */
    public final float f9668e;

    public c7a(TooltipStep tooltipStep, e28 e28Var, boolean z, boolean z2, float f, int i) {
        f = (i & 64) != 0 ? 0.0f : f;
        tooltipStep.getClass();
        e28Var.getClass();
        this.f9664a = tooltipStep;
        this.f9665b = e28Var;
        this.f9666c = z;
        this.f9667d = z2;
        this.f9668e = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7a)) {
            return false;
        }
        c7a c7aVar = (c7a) obj;
        return this.f9664a == c7aVar.f9664a && fa4.m11650l(this.f9665b, c7aVar.f9665b) && this.f9666c == c7aVar.f9666c && this.f9667d == c7aVar.f9667d && Float.compare(this.f9668e, c7aVar.f9668e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9668e) + g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e((this.f9665b.hashCode() + (this.f9664a.hashCode() * 31)) * 31, 31, this.f9666c), 31, false), 31, false), 31, this.f9667d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TooltipUiState(tooltip=");
        sb.append(this.f9664a);
        sb.append(", anchorBounds=");
        sb.append(this.f9665b);
        sb.append(", withOverlay=");
        wq1.m24101A(sb, this.f9666c, ", tooltipFloat=false, showClose=false, dismissOnOutsideTap=", this.f9667d, ", cutoutPaddingPx=");
        return wq1.m24121q(sb, this.f9668e, ")");
    }
}
