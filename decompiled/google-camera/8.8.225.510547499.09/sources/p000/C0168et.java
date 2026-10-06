package p000;

import android.content.res.Configuration;
import android.os.LocaleList;
import android.view.View;
import java.io.UnsupportedEncodingException;
import java.util.Locale;

/* JADX INFO: renamed from: et */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0168et {
    /* JADX INFO: renamed from: a */
    static adn m7832a(Configuration configuration) {
        String languageTags = configuration.getLocales().toLanguageTags();
        adn adnVar = adn.f164a;
        if (languageTags == null || languageTags.isEmpty()) {
            return adn.f164a;
        }
        String[] strArrSplit = languageTags.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = adl.m294a(strArrSplit[i]);
        }
        return adn.m300a(localeArr);
    }

    /* JADX INFO: renamed from: b */
    static void m7833b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    /* JADX INFO: renamed from: c */
    public static void m7834c(adn adnVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(adnVar.m302c()));
    }

    /* JADX INFO: renamed from: d */
    static void m7835d(Configuration configuration, adn adnVar) {
        configuration.setLocales(LocaleList.forLanguageTags(adnVar.m302c()));
    }

    /* JADX INFO: renamed from: e */
    public static int m7836e(C0826ml c0826ml, AbstractC0803lp abstractC0803lp, View view, View view2, AbstractC0812ly abstractC0812ly, boolean z) {
        if (abstractC0812ly.m16164aj() == 0 || c0826ml.m16585a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(AbstractC0812ly.m16136be(view) - AbstractC0812ly.m16136be(view2)) + 1;
        }
        return Math.min(abstractC0803lp.mo15756k(), abstractC0803lp.mo15746a(view2) - abstractC0803lp.mo15749d(view));
    }

    /* JADX INFO: renamed from: f */
    public static int m7837f(C0826ml c0826ml, AbstractC0803lp abstractC0803lp, View view, View view2, AbstractC0812ly abstractC0812ly, boolean z, boolean z2) {
        if (abstractC0812ly.m16164aj() == 0 || c0826ml.m16585a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (c0826ml.m16585a() - Math.max(AbstractC0812ly.m16136be(view), AbstractC0812ly.m16136be(view2))) - 1) : Math.max(0, Math.min(AbstractC0812ly.m16136be(view), AbstractC0812ly.m16136be(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(abstractC0803lp.mo15746a(view2) - abstractC0803lp.mo15749d(view)) / (Math.abs(AbstractC0812ly.m16136be(view) - AbstractC0812ly.m16136be(view2)) + 1))) + (abstractC0803lp.mo15755j() - abstractC0803lp.mo15749d(view)));
        }
        return iMax;
    }

    /* JADX INFO: renamed from: g */
    public static int m7838g(C0826ml c0826ml, AbstractC0803lp abstractC0803lp, View view, View view2, AbstractC0812ly abstractC0812ly, boolean z) {
        if (abstractC0812ly.m16164aj() == 0 || c0826ml.m16585a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return c0826ml.m16585a();
        }
        return (int) (((abstractC0803lp.mo15746a(view2) - abstractC0803lp.mo15749d(view)) / (Math.abs(AbstractC0812ly.m16136be(view) - AbstractC0812ly.m16136be(view2)) + 1)) * c0826ml.m16585a());
    }

    /* JADX INFO: renamed from: h */
    public static void m7839h(String str) throws bfc {
        if (str.length() == 0) {
            throw new bfc("Empty array name", 4);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m7840i(Object obj) throws bfc {
        if (obj == null) {
            throw new bfc("Parameter must not be null", 4);
        }
        if ((obj instanceof String) && ((String) obj).length() == 0) {
            throw new bfc("Parameter must not be null or empty", 4);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m7841j(String str) throws bfc {
        if (str.length() == 0) {
            throw new bfc("Empty property name", 4);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m7842k(String str) throws bfc {
        if (str == null || str.length() == 0) {
            throw new bfc("Empty schema namespace URI", 4);
        }
    }

    /* JADX INFO: renamed from: l */
    public static byte[] m7843l(byte b) {
        int i = b & 255;
        if (i >= 128) {
            try {
                return (i == 129 || i == 141 || i == 143 || i == 144 || i == 157) ? new byte[]{32} : new String(new byte[]{b}, "cp1252").getBytes("UTF-8");
            } catch (UnsupportedEncodingException e) {
            }
        }
        return new byte[]{b};
    }
}
