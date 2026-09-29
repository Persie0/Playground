package p000;

import com.lingq.core.settings.theme.ThemeSettingsTab;

/* JADX INFO: loaded from: classes3.dex */
public final class dsa {

    /* JADX INFO: renamed from: a */
    public final boolean f36181a;

    /* JADX INFO: renamed from: b */
    public final boolean f36182b;

    /* JADX INFO: renamed from: c */
    public final boolean f36183c;

    /* JADX INFO: renamed from: d */
    public final boolean f36184d;

    /* JADX INFO: renamed from: e */
    public final ThemeSettingsTab f36185e;

    public dsa(boolean z, boolean z2, boolean z3, boolean z4, ThemeSettingsTab themeSettingsTab) {
        themeSettingsTab.getClass();
        this.f36181a = z;
        this.f36182b = z2;
        this.f36183c = z3;
        this.f36184d = z4;
        this.f36185e = themeSettingsTab;
    }

    /* JADX INFO: renamed from: a */
    public static dsa m10615a(dsa dsaVar, boolean z, boolean z2, boolean z3, boolean z4, ThemeSettingsTab themeSettingsTab, int i) {
        if ((i & 1) != 0) {
            z = dsaVar.f36181a;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            z2 = dsaVar.f36182b;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = dsaVar.f36183c;
        }
        boolean z7 = z3;
        if ((i & 8) != 0) {
            z4 = dsaVar.f36184d;
        }
        boolean z8 = z4;
        if ((i & 16) != 0) {
            themeSettingsTab = dsaVar.f36185e;
        }
        ThemeSettingsTab themeSettingsTab2 = themeSettingsTab;
        dsaVar.getClass();
        themeSettingsTab2.getClass();
        return new dsa(z5, z6, z7, z8, themeSettingsTab2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsa)) {
            return false;
        }
        dsa dsaVar = (dsa) obj;
        return this.f36181a == dsaVar.f36181a && this.f36182b == dsaVar.f36182b && this.f36183c == dsaVar.f36183c && this.f36184d == dsaVar.f36184d && this.f36185e == dsaVar.f36185e;
    }

    public final int hashCode() {
        return this.f36185e.hashCode() + g9a.m12428e(g9a.m12428e(g9a.m12428e(Boolean.hashCode(this.f36181a) * 31, 31, this.f36182b), 31, this.f36183c), 31, this.f36184d);
    }

    public final String toString() {
        StringBuilder sbM13357g = hn1.m13357g("VideoReaderState(isSettingsVisible=", ", isMenuVisible=", ", isReviewMenuVisible=", this.f36181a, this.f36182b);
        wq1.m24101A(sbM13357g, this.f36183c, ", isFullscreen=", this.f36184d, ", themeSettingsTab=");
        sbM13357g.append(this.f36185e);
        sbM13357g.append(")");
        return sbM13357g.toString();
    }

    public /* synthetic */ dsa() {
        this(false, false, false, false, ThemeSettingsTab.Theme);
    }
}
