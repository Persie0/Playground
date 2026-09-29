package p426v2;

import android.icu.util.ULocale;
import java.util.Locale;

/* JADX INFO: renamed from: v2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C9629c {
    /* JADX INFO: renamed from: a */
    public static ULocale m18102a(Object obj) {
        return ULocale.addLikelySubtags((ULocale) obj);
    }

    /* JADX INFO: renamed from: b */
    public static ULocale m18103b(Locale locale) {
        return ULocale.forLocale(locale);
    }

    /* JADX INFO: renamed from: c */
    public static String m18104c(Object obj) {
        return ((ULocale) obj).getScript();
    }
}
