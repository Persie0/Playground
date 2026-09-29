package p000;

import com.lingq.core.domain.model.theme.LqTheme;

/* JADX INFO: loaded from: classes2.dex */
public final class eo5 {

    /* JADX INFO: renamed from: a */
    public final boolean f37608a;

    /* JADX INFO: renamed from: b */
    public final boolean f37609b;

    /* JADX INFO: renamed from: c */
    public final LqTheme f37610c;

    /* JADX INFO: renamed from: d */
    public final boolean f37611d;

    /* JADX INFO: renamed from: e */
    public final boolean f37612e;

    public eo5(boolean z, boolean z2, LqTheme lqTheme, boolean z3, boolean z4) {
        lqTheme.getClass();
        this.f37608a = z;
        this.f37609b = z2;
        this.f37610c = lqTheme;
        this.f37611d = z3;
        this.f37612e = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eo5)) {
            return false;
        }
        eo5 eo5Var = (eo5) obj;
        return this.f37608a == eo5Var.f37608a && this.f37609b == eo5Var.f37609b && this.f37610c == eo5Var.f37610c && this.f37611d == eo5Var.f37611d && this.f37612e == eo5Var.f37612e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f37612e) + g9a.m12428e((this.f37610c.hashCode() + g9a.m12428e(Boolean.hashCode(this.f37608a) * 31, 31, this.f37609b)) * 31, 31, this.f37611d);
    }

    public final String toString() {
        StringBuilder sbM13357g = hn1.m13357g("LynxSettingsUiState(autoplayTts=", ", autoOpenTranslation=", ", theme=", this.f37608a, this.f37609b);
        sbM13357g.append(this.f37610c);
        sbM13357g.append(", memoryEnabled=");
        sbM13357g.append(this.f37611d);
        sbM13357g.append(", dataImprovementOptIn=");
        return AbstractC3393o1.m17740o(sbM13357g, this.f37612e, ")");
    }
}
