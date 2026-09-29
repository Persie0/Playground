package p000;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class yi5 {

    /* JADX INFO: renamed from: b */
    public static final yi5 f69867b = new yi5(new zi5(new LocaleList(new Locale[0])));

    /* JADX INFO: renamed from: a */
    public final zi5 f69868a;

    public yi5(zi5 zi5Var) {
        this.f69868a = zi5Var;
    }

    /* JADX INFO: renamed from: a */
    public static yi5 m25154a(String str) {
        if (str == null || str.isEmpty()) {
            return f69867b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Locale.forLanguageTag(strArrSplit[i]);
        }
        return new yi5(new zi5(new LocaleList(localeArr)));
    }

    /* JADX INFO: renamed from: b */
    public final Locale m25155b(int i) {
        return this.f69868a.f71609a.get(i);
    }

    /* JADX INFO: renamed from: c */
    public final int m25156c() {
        return this.f69868a.f71609a.size();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yi5) {
            return this.f69868a.equals(((yi5) obj).f69868a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f69868a.f71609a.hashCode();
    }

    public final String toString() {
        return this.f69868a.f71609a.toString();
    }
}
