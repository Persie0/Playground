package p000;

import com.lingq.core.domain.model.offer.BannerType;
import com.lingq.core.domain.model.offer.OfferBanner;
import com.lingq.core.domain.model.offer.OfferType;
import com.lingq.core.domain.model.offer.OfferVisibility;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class up6 {

    /* JADX INFO: renamed from: a */
    public final int f64173a;

    /* JADX INFO: renamed from: b */
    public final String f64174b;

    /* JADX INFO: renamed from: c */
    public final String f64175c;

    /* JADX INFO: renamed from: d */
    public final OfferType f64176d;

    /* JADX INFO: renamed from: e */
    public final OfferVisibility f64177e;

    /* JADX INFO: renamed from: f */
    public final String f64178f;

    /* JADX INFO: renamed from: g */
    public final String f64179g;

    /* JADX INFO: renamed from: h */
    public final String f64180h;

    /* JADX INFO: renamed from: i */
    public final boolean f64181i;

    /* JADX INFO: renamed from: j */
    public final boolean f64182j;

    /* JADX INFO: renamed from: k */
    public final boolean f64183k;

    /* JADX INFO: renamed from: l */
    public final Integer f64184l;

    /* JADX INFO: renamed from: m */
    public final String f64185m;

    /* JADX INFO: renamed from: n */
    public final String f64186n;

    /* JADX INFO: renamed from: o */
    public final String f64187o;

    /* JADX INFO: renamed from: p */
    public final String f64188p;

    /* JADX INFO: renamed from: q */
    public final String f64189q;

    /* JADX INFO: renamed from: r */
    public final String f64190r;

    /* JADX INFO: renamed from: s */
    public final List f64191s;

    public up6(int i, String str, String str2, OfferType offerType, OfferVisibility offerVisibility, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, Integer num, String str6, String str7, String str8, String str9, String str10, String str11, List list) {
        str.getClass();
        str2.getClass();
        offerType.getClass();
        offerVisibility.getClass();
        str3.getClass();
        ux5.m22975B(str4, str8, str9, str10, str11);
        list.getClass();
        this.f64173a = i;
        this.f64174b = str;
        this.f64175c = str2;
        this.f64176d = offerType;
        this.f64177e = offerVisibility;
        this.f64178f = str3;
        this.f64179g = str4;
        this.f64180h = str5;
        this.f64181i = z;
        this.f64182j = z2;
        this.f64183k = z3;
        this.f64184l = num;
        this.f64185m = str6;
        this.f64186n = str7;
        this.f64187o = str8;
        this.f64188p = str9;
        this.f64189q = str10;
        this.f64190r = str11;
        this.f64191s = list;
    }

    /* JADX INFO: renamed from: a */
    public final OfferBanner m22853a(BannerType bannerType, String str) {
        OfferBanner offerBanner;
        Object next;
        String strM8104a;
        Object next2;
        bannerType.getClass();
        str.getClass();
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String strM4839V = cl9.m4839V(lowerCase, "_", "-");
        String str2 = (String) u91.m22591I0(vk9.m23365A0(strM4839V, new String[]{"-"}, 0, 6));
        if (str2 == null) {
            str2 = strM4839V;
        }
        boolean zM4842Y = cl9.m4842Y(strM4839V, "zh-", false);
        List list = this.f64191s;
        Object obj = null;
        if (zM4842Y) {
            offerBanner = null;
        } else {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
                OfferBanner offerBanner2 = (OfferBanner) next2;
                if (offerBanner2.m8106c() == bannerType) {
                    String lowerCase2 = offerBanner2.m8105b().toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                    if (lowerCase2.equals(str2)) {
                        break;
                    }
                }
            }
            offerBanner = (OfferBanner) next2;
        }
        List list2 = list;
        Iterator it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            OfferBanner offerBanner3 = (OfferBanner) next;
            if (offerBanner3.m8106c() == bannerType) {
                String lowerCase3 = offerBanner3.m8105b().toLowerCase(Locale.ROOT);
                lowerCase3.getClass();
                if (cl9.m4839V(lowerCase3, "_", "-").equals(strM4839V)) {
                    break;
                }
            }
        }
        OfferBanner offerBanner4 = (OfferBanner) next;
        if (offerBanner4 != null) {
            offerBanner = offerBanner4;
        } else if (offerBanner == null) {
            for (Object obj2 : list2) {
                OfferBanner offerBanner5 = (OfferBanner) obj2;
                if (offerBanner5.m8106c() == bannerType) {
                    String lowerCase4 = offerBanner5.m8105b().toLowerCase(Locale.ROOT);
                    lowerCase4.getClass();
                    if (lowerCase4.equals("en")) {
                        obj = obj2;
                        break;
                    }
                }
            }
            offerBanner = (OfferBanner) obj;
        }
        if (offerBanner == null || (strM8104a = offerBanner.m8104a()) == null) {
            strM8104a = "null";
        }
        String strM22596N0 = u91.m22596N0(list2, null, null, null, new lz5(19), 31);
        StringBuilder sb = new StringBuilder("[Offers] getBanner code=");
        sb.append(this.f64175c);
        sb.append(" type=");
        sb.append(bannerType);
        sb.append(" locale=");
        AbstractC3393o1.m17725C(sb, str, " → ", strM8104a, " (have ");
        sb.append(strM22596N0);
        sb.append(")");
        System.out.println((Object) "D/LingQ: ".concat(sb.toString()));
        return offerBanner;
    }

    /* JADX INFO: renamed from: b */
    public final String m22854b() {
        String str = this.f64186n;
        if (str == null) {
            str = this.f64175c;
        }
        return AbstractC3393o1.m17734i("lq-", str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof up6)) {
            return false;
        }
        up6 up6Var = (up6) obj;
        return this.f64173a == up6Var.f64173a && fa4.m11650l(this.f64174b, up6Var.f64174b) && fa4.m11650l(this.f64175c, up6Var.f64175c) && this.f64176d == up6Var.f64176d && this.f64177e == up6Var.f64177e && fa4.m11650l(this.f64178f, up6Var.f64178f) && fa4.m11650l(this.f64179g, up6Var.f64179g) && fa4.m11650l(this.f64180h, up6Var.f64180h) && this.f64181i == up6Var.f64181i && this.f64182j == up6Var.f64182j && this.f64183k == up6Var.f64183k && fa4.m11650l(this.f64184l, up6Var.f64184l) && fa4.m11650l(this.f64185m, up6Var.f64185m) && fa4.m11650l(this.f64186n, up6Var.f64186n) && fa4.m11650l(this.f64187o, up6Var.f64187o) && fa4.m11650l(this.f64188p, up6Var.f64188p) && fa4.m11650l(this.f64189q, up6Var.f64189q) && fa4.m11650l(this.f64190r, up6Var.f64190r) && fa4.m11650l(this.f64191s, up6Var.f64191s);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(ux5.m22980c((this.f64177e.hashCode() + ((this.f64176d.hashCode() + ux5.m22980c(ux5.m22980c(Integer.hashCode(this.f64173a) * 31, this.f64174b, 31), this.f64175c, 31)) * 31)) * 31, this.f64178f, 31), this.f64179g, 31);
        String str = this.f64180h;
        int iM12428e = g9a.m12428e(g9a.m12428e(g9a.m12428e((iM22980c + (str == null ? 0 : str.hashCode())) * 31, 31, this.f64181i), 31, this.f64182j), 31, this.f64183k);
        Integer num = this.f64184l;
        int iHashCode = (iM12428e + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f64185m;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f64186n;
        return this.f64191s.hashCode() + ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, this.f64187o, 31), this.f64188p, 31), this.f64189q, 31), this.f64190r, 31);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f64173a, "Offer(id=", ", title=", this.f64174b, ", code=");
        sbM22995r.append(this.f64175c);
        sbM22995r.append(", type=");
        sbM22995r.append(this.f64176d);
        sbM22995r.append(", visibility=");
        sbM22995r.append(this.f64177e);
        sbM22995r.append(", dateStart=");
        sbM22995r.append(this.f64178f);
        sbM22995r.append(", dateEnd=");
        AbstractC3393o1.m17725C(sbM22995r, this.f64179g, ", dateCountdown=", this.f64180h, ", countdownEnabled=");
        wq1.m24101A(sbM22995r, this.f64181i, ", countdownEnded=", this.f64182j, ", isActive=");
        sbM22995r.append(this.f64183k);
        sbM22995r.append(", tier=");
        sbM22995r.append(this.f64184l);
        sbM22995r.append(", ctaText=");
        AbstractC3393o1.m17725C(sbM22995r, this.f64185m, ", androidCoupon=", this.f64186n, ", discount=");
        AbstractC3393o1.m17725C(sbM22995r, this.f64187o, ", accentColorLight=", this.f64188p, ", accentColorDark=");
        AbstractC3393o1.m17725C(sbM22995r, this.f64189q, ", trialHeader=", this.f64190r, ", banners=");
        return hn1.m13356f(sbM22995r, this.f64191s, ")");
    }
}
