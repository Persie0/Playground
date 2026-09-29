package p000;

import com.lingq.feature.onboarding.R$string;
import com.lingq.feature.onboarding.p014v2.OnboardingYesNoQuestion;

/* JADX INFO: loaded from: classes3.dex */
public final class oab {

    /* JADX INFO: renamed from: a */
    public final int f54113a;

    /* JADX INFO: renamed from: b */
    public final OnboardingYesNoQuestion f54114b;

    /* JADX INFO: renamed from: c */
    public final boolean f54115c;

    /* JADX INFO: renamed from: d */
    public final int f54116d;

    /* JADX INFO: renamed from: e */
    public final int f54117e;

    /* JADX INFO: renamed from: f */
    public final String f54118f;

    /* JADX INFO: renamed from: g */
    public final String f54119g;

    /* JADX INFO: renamed from: h */
    public final boolean f54120h;

    public oab(int i, OnboardingYesNoQuestion onboardingYesNoQuestion, int i2, int i3, int i4) {
        boolean z = (i4 & 4) == 0;
        i2 = (i4 & 8) != 0 ? R$string.onboarding_v2_yes : i2;
        i3 = (i4 & 16) != 0 ? R$string.onboarding_v2_no : i3;
        String str = (i4 & 32) != 0 ? "👍" : "😎";
        String str2 = (i4 & 64) != 0 ? "👎" : "😬";
        boolean z2 = (i4 & 128) == 0;
        onboardingYesNoQuestion.getClass();
        this.f54113a = i;
        this.f54114b = onboardingYesNoQuestion;
        this.f54115c = z;
        this.f54116d = i2;
        this.f54117e = i3;
        this.f54118f = str;
        this.f54119g = str2;
        this.f54120h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oab)) {
            return false;
        }
        oab oabVar = (oab) obj;
        return this.f54113a == oabVar.f54113a && this.f54114b == oabVar.f54114b && this.f54115c == oabVar.f54115c && this.f54116d == oabVar.f54116d && this.f54117e == oabVar.f54117e && this.f54118f.equals(oabVar.f54118f) && this.f54119g.equals(oabVar.f54119g) && this.f54120h == oabVar.f54120h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f54120h) + ux5.m22980c(ux5.m22980c(wq1.m24106b(this.f54117e, wq1.m24106b(this.f54116d, g9a.m12428e((this.f54114b.hashCode() + (Integer.hashCode(this.f54113a) * 31)) * 31, 31, this.f54115c), 31), 31), this.f54118f, 31), this.f54119g, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("YesNoPageConfig(titleRes=");
        sb.append(this.f54113a);
        sb.append(", question=");
        sb.append(this.f54114b);
        sb.append(", interpolateLanguage=");
        hn1.m13373w(sb, this.f54115c, ", yesLabelRes=", this.f54116d, ", noLabelRes=");
        hn1.m13361k(this.f54117e, ", yesEmoji=", this.f54118f, ", noEmoji=", sb);
        sb.append(this.f54119g);
        sb.append(", negativeFirst=");
        sb.append(this.f54120h);
        sb.append(")");
        return sb.toString();
    }
}
