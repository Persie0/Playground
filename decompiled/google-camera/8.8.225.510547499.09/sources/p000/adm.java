package p000;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class adm {
    /* JADX INFO: renamed from: a */
    static LocaleList m297a(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    /* JADX INFO: renamed from: b */
    static LocaleList m298b() {
        return LocaleList.getAdjustedDefault();
    }

    /* JADX INFO: renamed from: c */
    static LocaleList m299c() {
        return LocaleList.getDefault();
    }
}
