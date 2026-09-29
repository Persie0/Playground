package p000;

import com.lingq.feature.onboarding.R$string;

/* JADX INFO: loaded from: classes3.dex */
public final class tab {

    /* JADX INFO: renamed from: a */
    public final int f62065a;

    /* JADX INFO: renamed from: b */
    public final boolean f62066b;

    /* JADX INFO: renamed from: c */
    public final int f62067c;

    /* JADX INFO: renamed from: d */
    public final int f62068d;

    public tab(int i, int i2, int i3, int i4) {
        boolean z = (i4 & 2) == 0;
        i2 = (i4 & 4) != 0 ? R$string.onboarding_v2_yes : i2;
        i3 = (i4 & 8) != 0 ? R$string.onboarding_v2_no : i3;
        this.f62065a = i;
        this.f62066b = z;
        this.f62067c = i2;
        this.f62068d = i3;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m21922a() {
        return this.f62066b;
    }

    /* JADX INFO: renamed from: b */
    public final int m21923b() {
        return this.f62068d;
    }

    /* JADX INFO: renamed from: c */
    public final int m21924c() {
        return this.f62065a;
    }

    /* JADX INFO: renamed from: d */
    public final int m21925d() {
        return this.f62067c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tab)) {
            return false;
        }
        tab tabVar = (tab) obj;
        return this.f62065a == tabVar.f62065a && this.f62066b == tabVar.f62066b && this.f62067c == tabVar.f62067c && this.f62068d == tabVar.f62068d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f62068d) + wq1.m24106b(this.f62067c, g9a.m12428e(Integer.hashCode(this.f62065a) * 31, 31, this.f62066b), 31);
    }

    public final String toString() {
        return "YesNoText(titleRes=" + this.f62065a + ", interpolateLanguage=" + this.f62066b + ", yesLabelRes=" + this.f62067c + ", noLabelRes=" + this.f62068d + ")";
    }
}
