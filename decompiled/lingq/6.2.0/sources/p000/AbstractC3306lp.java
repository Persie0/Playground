package p000;

import android.app.LocaleManager;
import android.os.LocaleList;

/* JADX INFO: renamed from: lp */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3306lp {
    /* JADX INFO: renamed from: a */
    public static LocaleList m16418a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    /* JADX INFO: renamed from: b */
    public static void m16419b(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }
}
