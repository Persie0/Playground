package p000;

import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class qob extends ooc {

    /* JADX INFO: renamed from: c */
    public long f58021c;

    /* JADX INFO: renamed from: d */
    public String f58022d;

    @Override // p000.ooc
    /* JADX INFO: renamed from: E */
    public final boolean mo12250E() {
        Calendar calendar = Calendar.getInstance();
        this.f58021c = ((long) (calendar.get(16) + calendar.get(15))) / 60000;
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.f58022d = AbstractC3393o1.m17739n(new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()), lowerCase, "-", lowerCase2);
        return false;
    }

    /* JADX INFO: renamed from: H */
    public final long m20091H() {
        m18192F();
        return this.f58021c;
    }

    /* JADX INFO: renamed from: I */
    public final String m20092I() {
        m18192F();
        return this.f58022d;
    }
}
