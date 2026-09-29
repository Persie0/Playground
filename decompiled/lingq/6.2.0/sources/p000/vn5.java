package p000;

import com.lingq.core.domain.model.theme.LqTheme;

/* JADX INFO: loaded from: classes2.dex */
public final class vn5 {

    /* JADX INFO: renamed from: a */
    public final boolean f65660a;

    /* JADX INFO: renamed from: b */
    public final boolean f65661b;

    /* JADX INFO: renamed from: c */
    public final LqTheme f65662c;

    /* JADX INFO: renamed from: d */
    public final boolean f65663d;

    /* JADX INFO: renamed from: e */
    public final boolean f65664e;

    public vn5(boolean z, boolean z2, LqTheme lqTheme, boolean z3, boolean z4) {
        lqTheme.getClass();
        this.f65660a = z;
        this.f65661b = z2;
        this.f65662c = lqTheme;
        this.f65663d = z3;
        this.f65664e = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vn5)) {
            return false;
        }
        vn5 vn5Var = (vn5) obj;
        return this.f65660a == vn5Var.f65660a && this.f65661b == vn5Var.f65661b && this.f65662c == vn5Var.f65662c && this.f65663d == vn5Var.f65663d && this.f65664e == vn5Var.f65664e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f65664e) + g9a.m12428e((this.f65662c.hashCode() + g9a.m12428e(Boolean.hashCode(this.f65660a) * 31, 31, this.f65661b)) * 31, 31, this.f65663d);
    }

    public final String toString() {
        StringBuilder sbM13357g = hn1.m13357g("LynxSettings(autoplayTts=", ", autoOpenTranslation=", ", theme=", this.f65660a, this.f65661b);
        sbM13357g.append(this.f65662c);
        sbM13357g.append(", memoryEnabled=");
        sbM13357g.append(this.f65663d);
        sbM13357g.append(", dataImprovementOptIn=");
        return AbstractC3393o1.m17740o(sbM13357g, this.f65664e, ")");
    }
}
