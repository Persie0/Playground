package p389t2;

import android.os.LocaleList;
import java.util.Locale;
import p426v2.C9629c;

/* JADX INFO: renamed from: t2.g */
/* JADX INFO: loaded from: classes.dex */
public final class C9188g {

    /* JADX INFO: renamed from: b */
    public static final C9188g f47727b = new C9188g(new C9190i(b.m17526a(new Locale[0])));

    /* JADX INFO: renamed from: a */
    public final InterfaceC9189h f47728a;

    /* JADX INFO: renamed from: t2.g$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final Locale[] f47729a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        /* JADX INFO: renamed from: a */
        public static Locale m17524a(String str) {
            return Locale.forLanguageTag(str);
        }

        /* JADX INFO: renamed from: b */
        public static boolean m17525b(Locale locale, Locale locale2) {
            boolean z10;
            boolean z11;
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage())) {
                return false;
            }
            Locale[] localeArr = f47729a;
            int length = localeArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    z10 = false;
                    break;
                }
                if (localeArr[i10].equals(locale)) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            if (!z10) {
                int length2 = localeArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length2) {
                        z11 = false;
                        break;
                    }
                    if (localeArr[i11].equals(locale2)) {
                        z11 = true;
                        break;
                    }
                    i11++;
                }
                if (!z11) {
                    String strM18104c = C9629c.m18104c(C9629c.m18102a(C9629c.m18103b(locale)));
                    if (!strM18104c.isEmpty()) {
                        return strM18104c.equals(C9629c.m18104c(C9629c.m18102a(C9629c.m18103b(locale2))));
                    }
                    String country = locale.getCountry();
                    return country.isEmpty() || country.equals(locale2.getCountry());
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: t2.g$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static LocaleList m17526a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        /* JADX INFO: renamed from: b */
        public static LocaleList m17527b() {
            return LocaleList.getAdjustedDefault();
        }

        /* JADX INFO: renamed from: c */
        public static LocaleList m17528c() {
            return LocaleList.getDefault();
        }
    }

    public C9188g(C9190i c9190i) {
        this.f47728a = c9190i;
    }

    /* JADX INFO: renamed from: a */
    public static C9188g m17523a(String str) {
        if (str == null || str.isEmpty()) {
            return f47727b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i10 = 0; i10 < length; i10++) {
            localeArr[i10] = a.m17524a(strArrSplit[i10]);
        }
        return new C9188g(new C9190i(b.m17526a(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9188g) {
            if (this.f47728a.equals(((C9188g) obj).f47728a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f47728a.hashCode();
    }

    public final String toString() {
        return this.f47728a.toString();
    }
}
