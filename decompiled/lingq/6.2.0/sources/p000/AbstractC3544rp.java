package p000;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: renamed from: rp */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3544rp {
    /* JADX INFO: renamed from: a */
    public static void m20735a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    /* JADX INFO: renamed from: b */
    public static yi5 m20736b(Configuration configuration) {
        return yi5.m25154a(configuration.getLocales().toLanguageTags());
    }

    /* JADX INFO: renamed from: c */
    public static void m20737c(yi5 yi5Var) {
        LocaleList.setDefault(LocaleList.forLanguageTags(yi5Var.f69868a.f71609a.toLanguageTags()));
    }

    /* JADX INFO: renamed from: d */
    public static void m20738d(Configuration configuration, yi5 yi5Var) {
        configuration.setLocales(LocaleList.forLanguageTags(yi5Var.f69868a.f71609a.toLanguageTags()));
    }
}
