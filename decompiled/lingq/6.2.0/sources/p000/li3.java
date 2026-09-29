package p000;

import com.lingq.core.premium.FreeTrialOnboardingPage;
import com.lingq.core.premium.domain.TrialReminderChoice;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class li3 {

    /* JADX INFO: renamed from: a */
    public final String f49698a;

    /* JADX INFO: renamed from: b */
    public final String f49699b;

    /* JADX INFO: renamed from: c */
    public final String f49700c;

    /* JADX INFO: renamed from: d */
    public final List f49701d;

    /* JADX INFO: renamed from: e */
    public final boolean f49702e;

    /* JADX INFO: renamed from: f */
    public final String f49703f;

    /* JADX INFO: renamed from: g */
    public final boolean f49704g;

    /* JADX INFO: renamed from: h */
    public final Integer f49705h;

    /* JADX INFO: renamed from: i */
    public final boolean f49706i;

    /* JADX INFO: renamed from: j */
    public final boolean f49707j;

    /* JADX INFO: renamed from: k */
    public final boolean f49708k;

    /* JADX INFO: renamed from: l */
    public final boolean f49709l;

    /* JADX INFO: renamed from: m */
    public final FreeTrialOnboardingPage f49710m;

    /* JADX INFO: renamed from: n */
    public final TrialReminderChoice f49711n;

    /* JADX INFO: renamed from: o */
    public final String f49712o;

    /* JADX INFO: renamed from: p */
    public final String f49713p;

    /* JADX INFO: renamed from: q */
    public final String f49714q;

    /* JADX INFO: renamed from: r */
    public final String f49715r;

    /* JADX INFO: renamed from: s */
    public final Integer f49716s;

    public li3(String str, String str2, String str3, List list, boolean z, String str4, boolean z2, Integer num, boolean z3, boolean z4, boolean z5, boolean z6, FreeTrialOnboardingPage freeTrialOnboardingPage, TrialReminderChoice trialReminderChoice, String str5, String str6, String str7, String str8, Integer num2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        freeTrialOnboardingPage.getClass();
        trialReminderChoice.getClass();
        str5.getClass();
        str6.getClass();
        this.f49698a = str;
        this.f49699b = str2;
        this.f49700c = str3;
        this.f49701d = list;
        this.f49702e = z;
        this.f49703f = str4;
        this.f49704g = z2;
        this.f49705h = num;
        this.f49706i = z3;
        this.f49707j = z4;
        this.f49708k = z5;
        this.f49709l = z6;
        this.f49710m = freeTrialOnboardingPage;
        this.f49711n = trialReminderChoice;
        this.f49712o = str5;
        this.f49713p = str6;
        this.f49714q = str7;
        this.f49715r = str8;
        this.f49716s = num2;
    }

    /* JADX INFO: renamed from: a */
    public static li3 m16234a(li3 li3Var, String str, String str2, String str3, List list, boolean z, String str4, boolean z2, Integer num, boolean z3, boolean z4, FreeTrialOnboardingPage freeTrialOnboardingPage, TrialReminderChoice trialReminderChoice, String str5, String str6, Integer num2, int i) {
        String str7 = (i & 1) != 0 ? li3Var.f49698a : str;
        String str8 = (i & 2) != 0 ? li3Var.f49699b : str2;
        String str9 = (i & 4) != 0 ? li3Var.f49700c : str3;
        List list2 = (i & 8) != 0 ? li3Var.f49701d : list;
        boolean z5 = (i & 16) != 0 ? li3Var.f49702e : z;
        String str10 = (i & 32) != 0 ? li3Var.f49703f : str4;
        boolean z6 = (i & 64) != 0 ? li3Var.f49704g : z2;
        Integer num3 = (i & 128) != 0 ? li3Var.f49705h : num;
        boolean z7 = (i & 256) != 0 ? li3Var.f49706i : z3;
        boolean z8 = (i & 512) != 0 ? li3Var.f49707j : z4;
        boolean z9 = li3Var.f49708k;
        boolean z10 = li3Var.f49709l;
        FreeTrialOnboardingPage freeTrialOnboardingPage2 = (i & 4096) != 0 ? li3Var.f49710m : freeTrialOnboardingPage;
        TrialReminderChoice trialReminderChoice2 = (i & 8192) != 0 ? li3Var.f49711n : trialReminderChoice;
        String str11 = li3Var.f49712o;
        String str12 = li3Var.f49713p;
        String str13 = (i & 65536) != 0 ? li3Var.f49714q : str5;
        String str14 = (i & 131072) != 0 ? li3Var.f49715r : str6;
        Integer num4 = (i & 262144) != 0 ? li3Var.f49716s : num2;
        li3Var.getClass();
        str7.getClass();
        str8.getClass();
        str9.getClass();
        list2.getClass();
        str10.getClass();
        freeTrialOnboardingPage2.getClass();
        trialReminderChoice2.getClass();
        str11.getClass();
        str12.getClass();
        str13.getClass();
        str14.getClass();
        return new li3(str7, str8, str9, list2, z5, str10, z6, num3, z7, z8, z9, z10, freeTrialOnboardingPage2, trialReminderChoice2, str11, str12, str13, str14, num4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof li3)) {
            return false;
        }
        li3 li3Var = (li3) obj;
        return fa4.m11650l(this.f49698a, li3Var.f49698a) && fa4.m11650l(this.f49699b, li3Var.f49699b) && fa4.m11650l(this.f49700c, li3Var.f49700c) && fa4.m11650l(this.f49701d, li3Var.f49701d) && this.f49702e == li3Var.f49702e && fa4.m11650l(this.f49703f, li3Var.f49703f) && this.f49704g == li3Var.f49704g && fa4.m11650l(this.f49705h, li3Var.f49705h) && this.f49706i == li3Var.f49706i && this.f49707j == li3Var.f49707j && this.f49708k == li3Var.f49708k && this.f49709l == li3Var.f49709l && this.f49710m == li3Var.f49710m && this.f49711n == li3Var.f49711n && fa4.m11650l(this.f49712o, li3Var.f49712o) && fa4.m11650l(this.f49713p, li3Var.f49713p) && fa4.m11650l(this.f49714q, li3Var.f49714q) && fa4.m11650l(this.f49715r, li3Var.f49715r) && fa4.m11650l(this.f49716s, li3Var.f49716s);
    }

    public final int hashCode() {
        int iM12428e = g9a.m12428e(ux5.m22980c(g9a.m12428e(ux5.m22979b(ux5.m22980c(ux5.m22980c(this.f49698a.hashCode() * 31, this.f49699b, 31), this.f49700c, 31), 31, this.f49701d), 31, this.f49702e), this.f49703f, 31), 31, this.f49704g);
        Integer num = this.f49705h;
        int iM22980c = ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c((this.f49711n.hashCode() + ((this.f49710m.hashCode() + g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e((iM12428e + (num == null ? 0 : num.hashCode())) * 31, 31, this.f49706i), 31, this.f49707j), 31, this.f49708k), 31, this.f49709l)) * 31)) * 31, this.f49712o, 31), this.f49713p, 31), this.f49714q, 31), this.f49715r, 31);
        Integer num2 = this.f49716s;
        return iM22980c + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("FreeTrialScreenState(priceYear=", this.f49698a, ", priceYearFull=", this.f49699b, ", priceMonth=");
        hn1.m13366p(this.f49700c, ", steps=", ", isLoading=", sbM23000w, this.f49701d);
        hn1.m13367q(", offer=", this.f49703f, ", showNotification=", sbM23000w, this.f49702e);
        sbM23000w.append(this.f49704g);
        sbM23000w.append(", error=");
        sbM23000w.append(this.f49705h);
        sbM23000w.append(", isPromo=");
        wq1.m24101A(sbM23000w, this.f49706i, ", isPlus=", this.f49707j, ", isOnboardingRegistrationVariant=");
        wq1.m24101A(sbM23000w, this.f49708k, ", isReminderChoiceVariant=", this.f49709l, ", onboardingPage=");
        sbM23000w.append(this.f49710m);
        sbM23000w.append(", reminderChoice=");
        sbM23000w.append(this.f49711n);
        sbM23000w.append(", twoDaysBeforeDate=");
        AbstractC3393o1.m17725C(sbM23000w, this.f49712o, ", threeDaysBeforeDate=", this.f49713p, ", trialBannerUrl=");
        AbstractC3393o1.m17725C(sbM23000w, this.f49714q, ", trialHeader=", this.f49715r, ", trialHeaderResource=");
        sbM23000w.append(this.f49716s);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }
}
