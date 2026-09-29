package p000;

import com.lingq.core.settings.theme.ThemeSettingsTab;

/* JADX INFO: loaded from: classes3.dex */
public final class f08 {

    /* JADX INFO: renamed from: a */
    public final boolean f38148a;

    /* JADX INFO: renamed from: b */
    public final boolean f38149b;

    /* JADX INFO: renamed from: c */
    public final boolean f38150c;

    /* JADX INFO: renamed from: d */
    public final ThemeSettingsTab f38151d;

    public f08(boolean z, boolean z2, boolean z3, ThemeSettingsTab themeSettingsTab) {
        themeSettingsTab.getClass();
        this.f38148a = z;
        this.f38149b = z2;
        this.f38150c = z3;
        this.f38151d = themeSettingsTab;
    }

    /* JADX INFO: renamed from: a */
    public static f08 m11428a(f08 f08Var, boolean z, boolean z2, boolean z3, ThemeSettingsTab themeSettingsTab, int i) {
        if ((i & 1) != 0) {
            z = f08Var.f38148a;
        }
        if ((i & 2) != 0) {
            z2 = f08Var.f38149b;
        }
        if ((i & 4) != 0) {
            z3 = f08Var.f38150c;
        }
        if ((i & 8) != 0) {
            themeSettingsTab = f08Var.f38151d;
        }
        f08Var.getClass();
        themeSettingsTab.getClass();
        return new f08(z, z2, z3, themeSettingsTab);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f08)) {
            return false;
        }
        f08 f08Var = (f08) obj;
        return this.f38148a == f08Var.f38148a && this.f38149b == f08Var.f38149b && this.f38150c == f08Var.f38150c && this.f38151d == f08Var.f38151d;
    }

    public final int hashCode() {
        return this.f38151d.hashCode() + g9a.m12428e(g9a.m12428e(Boolean.hashCode(this.f38148a) * 31, 31, this.f38149b), 31, this.f38150c);
    }

    public final String toString() {
        StringBuilder sbM13357g = hn1.m13357g("ReaderUiState(isSettingsVisible=", ", isMenuVisible=", ", isReviewMenuVisible=", this.f38148a, this.f38149b);
        sbM13357g.append(this.f38150c);
        sbM13357g.append(", themeSettingsTab=");
        sbM13357g.append(this.f38151d);
        sbM13357g.append(")");
        return sbM13357g.toString();
    }

    public /* synthetic */ f08() {
        this(false, false, false, ThemeSettingsTab.Theme);
    }
}
