package p000;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class adn {

    /* JADX INFO: renamed from: a */
    public static final adn f164a = m300a(new Locale[0]);

    /* JADX INFO: renamed from: b */
    public final ado f165b;

    private adn(ado adoVar) {
        this.f165b = adoVar;
    }

    /* JADX INFO: renamed from: a */
    public static adn m300a(Locale... localeArr) {
        return m301b(adm.m297a(localeArr));
    }

    /* JADX INFO: renamed from: b */
    public static adn m301b(LocaleList localeList) {
        return new adn(new ado(localeList));
    }

    /* JADX INFO: renamed from: c */
    public final String m302c() {
        return this.f165b.f166a.toLanguageTags();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof adn) && this.f165b.equals(((adn) obj).f165b);
    }

    public final int hashCode() {
        return this.f165b.hashCode();
    }

    public final String toString() {
        return this.f165b.toString();
    }
}
