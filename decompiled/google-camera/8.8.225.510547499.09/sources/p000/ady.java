package p000;

import android.icu.util.ULocale;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ady {
    /* JADX INFO: renamed from: a */
    public static ULocale m312a(Object obj) {
        return ULocale.addLikelySubtags((ULocale) obj);
    }

    /* JADX INFO: renamed from: b */
    public static ULocale m313b(Locale locale) {
        return ULocale.forLocale(locale);
    }

    /* JADX INFO: renamed from: c */
    public static String m314c(Object obj) {
        return ((ULocale) obj).getScript();
    }

    /* JADX INFO: renamed from: d */
    public static final oqo m315d(apt aptVar) {
        Map map = aptVar.f2071j;
        Object objM18931l = map.get("TransactionDispatcher");
        if (objM18931l == null) {
            objM18931l = oqv.m18931l(aptVar.m1821i());
            map.put("TransactionDispatcher", objM18931l);
        }
        return (oqo) objM18931l;
    }
}
