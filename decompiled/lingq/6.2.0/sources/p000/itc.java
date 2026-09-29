package p000;

import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.domain.model.offer.BannerType;
import com.lingq.core.domain.model.offer.OfferBanner;
import com.lingq.core.network.api.result.ResultOffer;
import com.lingq.core.network.api.result.ResultOfferAccentColor;
import com.lingq.core.network.api.result.ResultOfferBanner;
import com.lingq.core.network.api.result.ResultOfferCoupon;
import com.lingq.core.network.api.result.ResultOfferDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class itc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f44563a = new C0282a(-373652425, false, new je1(11));

    /* JADX WARN: Code duplicated, block: B:42:0x00c9 A[PHI: r21
      0x00c9: PHI (r21v5 java.lang.String) = (r21v4 java.lang.String), (r21v6 java.lang.String) binds: [B:40:0x00c6, B:37:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d6 A[PHI: r21
      0x00d6: PHI (r21v10 java.lang.String) = 
      (r21v3 java.lang.String)
      (r21v4 java.lang.String)
      (r21v6 java.lang.String)
      (r21v7 java.lang.String)
      (r21v8 java.lang.String)
      (r21v11 java.lang.String)
     binds: [B:44:0x00d4, B:40:0x00c6, B:37:0x00bb, B:33:0x00ad, B:29:0x009f, B:27:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    public static final yp6 m14144a(ResultOffer resultOffer) {
        String str;
        String str2;
        BannerType bannerType;
        resultOffer.getClass();
        int i = resultOffer.f21359a;
        String str3 = resultOffer.f21360b;
        String str4 = resultOffer.f21361c;
        String str5 = resultOffer.f21362d;
        if (str5 == null) {
            str5 = "";
            str = str5;
        } else {
            str = "";
        }
        String str6 = resultOffer.f21363e;
        ResultOfferDate resultOfferDate = resultOffer.f21364f;
        String str7 = str;
        String str8 = resultOfferDate.f21384a;
        String str9 = resultOfferDate.f21385b;
        String str10 = resultOfferDate.f21386c;
        boolean z = resultOffer.f21369k;
        boolean z2 = resultOfferDate.f21387d;
        boolean z3 = resultOffer.f21370l;
        Integer num = resultOffer.f21366h;
        String str11 = resultOffer.f21371m;
        ResultOfferCoupon resultOfferCoupon = resultOffer.f21365g;
        String str12 = resultOfferCoupon.f21383c;
        if (str12 == null) {
            str12 = resultOfferCoupon.f21382b;
        }
        String str13 = resultOffer.f21368j;
        if (str13 == null) {
            str13 = str7;
        }
        String str14 = str12;
        ResultOfferAccentColor resultOfferAccentColor = resultOffer.f21373o;
        String str15 = resultOfferAccentColor.f21376a;
        if (str15 == null) {
            str15 = str7;
        }
        String str16 = resultOfferAccentColor.f21377b;
        String str17 = str16 == null ? str7 : str16;
        String str18 = resultOffer.f21374p;
        if (str18 == null) {
            str18 = str7;
        }
        List list = resultOffer.f21375q;
        String str19 = str18;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ResultOfferBanner resultOfferBanner = (ResultOfferBanner) it.next();
            resultOfferBanner.getClass();
            Iterator it2 = it;
            j80 j80Var = BannerType.Companion;
            String str20 = str15;
            String str21 = resultOfferBanner.f21378a;
            j80Var.getClass();
            str21.getClass();
            switch (str21.hashCode()) {
                case -1300331528:
                    str2 = str4;
                    if (!str21.equals("Library-Tablet")) {
                        bannerType = BannerType.UNKNOWN;
                    } else {
                        bannerType = BannerType.LIBRARY_TABLET;
                    }
                    break;
                case -909044221:
                    str2 = str4;
                    if (!str21.equals("Trial-Banner")) {
                        bannerType = BannerType.UNKNOWN;
                    } else {
                        bannerType = BannerType.TRIAL;
                    }
                    break;
                case -157231677:
                    str2 = str4;
                    if (!str21.equals("trial-banner")) {
                        bannerType = BannerType.UNKNOWN;
                    } else {
                        bannerType = BannerType.TRIAL;
                    }
                    break;
                case 1433481724:
                    str2 = str4;
                    if (!str21.equals("Upgrade")) {
                        bannerType = BannerType.UNKNOWN;
                    } else {
                        bannerType = BannerType.UPGRADE;
                    }
                    break;
                case 1830861979:
                    str2 = str4;
                    if (!str21.equals("Library")) {
                        bannerType = BannerType.UNKNOWN;
                    } else {
                        bannerType = BannerType.LIBRARY;
                    }
                    break;
                default:
                    str2 = str4;
                    bannerType = BannerType.UNKNOWN;
                    break;
            }
            arrayList.add(new OfferBanner(bannerType, resultOfferBanner.f21379b, resultOfferBanner.f21380c));
            it = it2;
            str4 = str2;
            str15 = str20;
        }
        return new yp6(i, str3, str4, str5, str6, str8, str9, str10, z, z2, z3, num, str11, str14, str13, str15, str17, str19, arrayList);
    }
}
