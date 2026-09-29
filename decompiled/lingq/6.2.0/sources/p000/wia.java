package p000;

import com.lingq.core.premium.UpgradeUserType;
import com.lingq.core.premium.delegate.UpgradeTier;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class wia {

    /* JADX INFO: renamed from: a */
    public final String f66876a;

    /* JADX INFO: renamed from: b */
    public final String f66877b;

    /* JADX INFO: renamed from: c */
    public final List f66878c;

    /* JADX INFO: renamed from: d */
    public final boolean f66879d;

    /* JADX INFO: renamed from: e */
    public final vk8 f66880e;

    /* JADX INFO: renamed from: f */
    public final UpgradeTier f66881f;

    /* JADX INFO: renamed from: g */
    public final String f66882g;

    /* JADX INFO: renamed from: h */
    public final boolean f66883h;

    /* JADX INFO: renamed from: i */
    public final UpgradeUserType f66884i;

    /* JADX INFO: renamed from: j */
    public final String f66885j;

    /* JADX INFO: renamed from: k */
    public final String f66886k;

    /* JADX INFO: renamed from: l */
    public final String f66887l;

    /* JADX INFO: renamed from: m */
    public final String f66888m;

    /* JADX INFO: renamed from: n */
    public final String f66889n;

    /* JADX INFO: renamed from: o */
    public final String f66890o;

    /* JADX INFO: renamed from: p */
    public final boolean f66891p;

    /* JADX INFO: renamed from: q */
    public final boolean f66892q;

    /* JADX INFO: renamed from: r */
    public final boolean f66893r;

    /* JADX INFO: renamed from: s */
    public final up6 f66894s;

    /* JADX INFO: renamed from: t */
    public final boolean f66895t;

    /* JADX INFO: renamed from: u */
    public final boolean f66896u;

    public wia(String str, String str2, List list, boolean z, vk8 vk8Var, UpgradeTier upgradeTier, String str3, boolean z2, UpgradeUserType upgradeUserType, String str4, String str5, String str6, String str7, String str8, String str9, boolean z3, boolean z4, boolean z5, up6 up6Var, boolean z6, boolean z7) {
        str.getClass();
        upgradeTier.getClass();
        upgradeUserType.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        str9.getClass();
        this.f66876a = str;
        this.f66877b = str2;
        this.f66878c = list;
        this.f66879d = z;
        this.f66880e = vk8Var;
        this.f66881f = upgradeTier;
        this.f66882g = str3;
        this.f66883h = z2;
        this.f66884i = upgradeUserType;
        this.f66885j = str4;
        this.f66886k = str5;
        this.f66887l = str6;
        this.f66888m = str7;
        this.f66889n = str8;
        this.f66890o = str9;
        this.f66891p = z3;
        this.f66892q = z4;
        this.f66893r = z5;
        this.f66894s = up6Var;
        this.f66895t = z6;
        this.f66896u = z7;
    }

    /* JADX INFO: renamed from: a */
    public static wia m23988a(wia wiaVar, String str, String str2, List list, boolean z, vk8 vk8Var, String str3, boolean z2, UpgradeUserType upgradeUserType, String str4, String str5, boolean z3, boolean z4, boolean z5, up6 up6Var, boolean z6, int i) {
        String str6 = (i & 1) != 0 ? wiaVar.f66876a : str;
        String str7 = (i & 2) != 0 ? wiaVar.f66877b : str2;
        List list2 = (i & 4) != 0 ? wiaVar.f66878c : list;
        boolean z7 = (i & 8) != 0 ? wiaVar.f66879d : z;
        vk8 vk8Var2 = (i & 16) != 0 ? wiaVar.f66880e : vk8Var;
        UpgradeTier upgradeTier = wiaVar.f66881f;
        String str8 = (i & 64) != 0 ? wiaVar.f66882g : str3;
        boolean z8 = (i & 128) != 0 ? wiaVar.f66883h : z2;
        UpgradeUserType upgradeUserType2 = (i & 256) != 0 ? wiaVar.f66884i : upgradeUserType;
        String str9 = (i & 512) != 0 ? wiaVar.f66885j : str4;
        String str10 = (i & 1024) != 0 ? wiaVar.f66886k : str5;
        String str11 = wiaVar.f66887l;
        String str12 = wiaVar.f66888m;
        String str13 = wiaVar.f66889n;
        String str14 = wiaVar.f66890o;
        boolean z9 = (i & 32768) != 0 ? wiaVar.f66891p : z3;
        boolean z10 = (i & 65536) != 0 ? wiaVar.f66892q : z4;
        boolean z11 = (i & 131072) != 0 ? wiaVar.f66893r : z5;
        up6 up6Var2 = (i & 262144) != 0 ? wiaVar.f66894s : up6Var;
        boolean z12 = wiaVar.f66895t;
        boolean z13 = (i & 1048576) != 0 ? wiaVar.f66896u : z6;
        wiaVar.getClass();
        str6.getClass();
        str7.getClass();
        list2.getClass();
        vk8Var2.getClass();
        upgradeTier.getClass();
        str8.getClass();
        upgradeUserType2.getClass();
        str9.getClass();
        str10.getClass();
        str11.getClass();
        str12.getClass();
        str13.getClass();
        str14.getClass();
        return new wia(str6, str7, list2, z7, vk8Var2, upgradeTier, str8, z8, upgradeUserType2, str9, str10, str11, str12, str13, str14, z9, z10, z11, up6Var2, z12, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wia)) {
            return false;
        }
        wia wiaVar = (wia) obj;
        return fa4.m11650l(this.f66876a, wiaVar.f66876a) && fa4.m11650l(this.f66877b, wiaVar.f66877b) && fa4.m11650l(this.f66878c, wiaVar.f66878c) && this.f66879d == wiaVar.f66879d && fa4.m11650l(this.f66880e, wiaVar.f66880e) && this.f66881f == wiaVar.f66881f && fa4.m11650l(this.f66882g, wiaVar.f66882g) && this.f66883h == wiaVar.f66883h && this.f66884i == wiaVar.f66884i && fa4.m11650l(this.f66885j, wiaVar.f66885j) && fa4.m11650l(this.f66886k, wiaVar.f66886k) && fa4.m11650l(this.f66887l, wiaVar.f66887l) && fa4.m11650l(this.f66888m, wiaVar.f66888m) && fa4.m11650l(this.f66889n, wiaVar.f66889n) && fa4.m11650l(this.f66890o, wiaVar.f66890o) && this.f66891p == wiaVar.f66891p && this.f66892q == wiaVar.f66892q && this.f66893r == wiaVar.f66893r && fa4.m11650l(this.f66894s, wiaVar.f66894s) && this.f66895t == wiaVar.f66895t && this.f66896u == wiaVar.f66896u;
    }

    public final int hashCode() {
        int iM12428e = g9a.m12428e(g9a.m12428e(g9a.m12428e(ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c((this.f66884i.hashCode() + g9a.m12428e(ux5.m22980c((this.f66881f.hashCode() + ((this.f66880e.hashCode() + g9a.m12428e(ux5.m22979b(ux5.m22980c(this.f66876a.hashCode() * 31, this.f66877b, 31), 31, this.f66878c), 31, this.f66879d)) * 31)) * 31, this.f66882g, 31), 31, this.f66883h)) * 31, this.f66885j, 31), this.f66886k, 31), this.f66887l, 31), this.f66888m, 31), this.f66889n, 31), this.f66890o, 31), 31, this.f66891p), 31, this.f66892q), 31, this.f66893r);
        up6 up6Var = this.f66894s;
        return Boolean.hashCode(this.f66896u) + g9a.m12428e((iM12428e + (up6Var == null ? 0 : up6Var.hashCode())) * 31, 31, this.f66895t);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("UpgradeScreenUiState(language=", this.f66876a, ", locale=", this.f66877b, ", productDetails=");
        sbM23000w.append(this.f66878c);
        sbM23000w.append(", offerIsActive=");
        sbM23000w.append(this.f66879d);
        sbM23000w.append(", timeRemaining=");
        sbM23000w.append(this.f66880e);
        sbM23000w.append(", tier=");
        sbM23000w.append(this.f66881f);
        sbM23000w.append(", offer=");
        ux5.m22976C(this.f66882g, ", isLoadingUpgrade=", ", isExistingSub=", sbM23000w, this.f66883h);
        sbM23000w.append(this.f66884i);
        sbM23000w.append(", premiumMonthId=");
        sbM23000w.append(this.f66885j);
        sbM23000w.append(", premiumOneYearId=");
        AbstractC3393o1.m17725C(sbM23000w, this.f66886k, ", premiumMonthBaseId=", this.f66887l, ", premiumOneYearBaseId=");
        AbstractC3393o1.m17725C(sbM23000w, this.f66888m, ", premiumMonthPlusBaseId=", this.f66889n, ", premiumOneYearPlusBaseId=");
        ux5.m22976C(this.f66890o, ", onUpgradeSuccess=", ", onUpgradeError=", sbM23000w, this.f66891p);
        wq1.m24101A(sbM23000w, this.f66892q, ", isPlus=", this.f66893r, ", activeOffer=");
        sbM23000w.append(this.f66894s);
        sbM23000w.append(", isOnboardingRegistrationVariant=");
        sbM23000w.append(this.f66895t);
        sbM23000w.append(", canAccessFreeTrial=");
        return AbstractC3393o1.m17740o(sbM23000w, this.f66896u, ")");
    }
}
