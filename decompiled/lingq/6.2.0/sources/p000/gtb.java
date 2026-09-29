package p000;

import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.domain.model.offer.OfferType;
import com.lingq.core.domain.model.offer.OfferVisibility;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gtb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f41309a = new C0282a(-655766221, false, new td1(7));

    /* JADX INFO: renamed from: b */
    public static final C0282a f41310b = new C0282a(445101523, false, new td1(8));

    /* JADX INFO: renamed from: c */
    public static final C0282a f41311c = new C0282a(2128894706, false, new sd1(9));

    /* JADX INFO: renamed from: d */
    public static final C0282a f41312d = new C0282a(-138658390, false, new sd1(10));

    /* JADX INFO: renamed from: e */
    public static final C0282a f41313e = new C0282a(1270586283, false, new td1(9));

    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX INFO: renamed from: a */
    public static final up6 m12862a(yp6 yp6Var) {
        OfferType offerType;
        yp6Var.getClass();
        int i = yp6Var.f70240a;
        String str = yp6Var.f70241b;
        String str2 = yp6Var.f70242c;
        cq6 cq6Var = OfferType.Companion;
        String str3 = yp6Var.f70243d;
        cq6Var.getClass();
        str3.getClass();
        String lowerCase = str3.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        int iHashCode = lowerCase.hashCode();
        if (iHashCode != -781004401) {
            if (iHashCode != 1650564814) {
                if (iHashCode == 1939947573 && lowerCase.equals("special offer")) {
                    offerType = OfferType.SPECIAL_OFFER;
                } else {
                    offerType = OfferType.UNKNOWN;
                }
            } else if (lowerCase.equals("extended sale")) {
                offerType = OfferType.EXTENDED_SALE;
            } else {
                offerType = OfferType.UNKNOWN;
            }
        } else if (lowerCase.equals("limited time offer")) {
            offerType = OfferType.LIMITED_TIME_OFFER;
        } else {
            offerType = OfferType.UNKNOWN;
        }
        dq6 dq6Var = OfferVisibility.Companion;
        String str4 = yp6Var.f70244e;
        dq6Var.getClass();
        return new up6(i, str, str2, offerType, cl9.m4834Q(str4, "public", true) ? OfferVisibility.PUBLIC : OfferVisibility.DEEPLINK_ONLY, yp6Var.f70245f, yp6Var.f70246g, yp6Var.f70247h, yp6Var.f70248i, yp6Var.f70249j, yp6Var.f70250k, yp6Var.f70251l, yp6Var.f70252m, yp6Var.f70253n, yp6Var.f70254o, yp6Var.f70255p, yp6Var.f70256q, yp6Var.f70257r, yp6Var.f70258s);
    }
}
