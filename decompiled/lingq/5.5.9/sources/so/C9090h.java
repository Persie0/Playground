package so;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import dm.C5207g;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.C7076b;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p493xo.C10263c;
import to.C9347b;

/* JADX INFO: renamed from: so.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C9090h {

    /* JADX INFO: renamed from: j */
    public static final Pattern f47430j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: k */
    public static final Pattern f47431k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: l */
    public static final Pattern f47432l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: m */
    public static final Pattern f47433m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a */
    public final String f47434a;

    /* JADX INFO: renamed from: b */
    public final String f47435b;

    /* JADX INFO: renamed from: c */
    public final long f47436c;

    /* JADX INFO: renamed from: d */
    public final String f47437d;

    /* JADX INFO: renamed from: e */
    public final String f47438e;

    /* JADX INFO: renamed from: f */
    public final boolean f47439f;

    /* JADX INFO: renamed from: g */
    public final boolean f47440g;

    /* JADX INFO: renamed from: h */
    public final boolean f47441h;

    /* JADX INFO: renamed from: i */
    public final boolean f47442i;

    /* JADX INFO: renamed from: so.h$a */
    public static final class a {
        /* JADX WARN: Code duplicated, block: B:32:0x0059  */
        /* JADX INFO: renamed from: a */
        public static int m17302a(int i10, int i11, String str, boolean z10) {
            boolean z11;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char cCharAt = str.charAt(i10);
                if ((cCharAt >= ' ' || cCharAt == '\t') && cCharAt < 127) {
                    if (!(cCharAt <= '9' && '0' <= cCharAt)) {
                        if (!(cCharAt <= 'z' && 'a' <= cCharAt)) {
                            z11 = (cCharAt <= 'Z' && 'A' <= cCharAt) || cCharAt == ':';
                        }
                    }
                }
                if (z11 == (!z10)) {
                    return i10;
                }
                i10 = i12;
            }
            return i11;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x00a9  */
        /* JADX INFO: renamed from: b */
        public static long m17303b(String str, int i10) {
            int iM17302a = m17302a(0, i10, str, false);
            Matcher matcher = C9090h.f47433m.matcher(str);
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int iM14285e3 = -1;
            int i14 = -1;
            int i15 = -1;
            while (iM17302a < i10) {
                int iM17302a2 = m17302a(iM17302a + 1, i10, str, true);
                matcher.region(iM17302a, iM17302a2);
                if (i12 == -1 && matcher.usePattern(C9090h.f47433m).matches()) {
                    String strGroup = matcher.group(1);
                    C5207g.m11110e(strGroup, "matcher.group(1)");
                    i12 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    C5207g.m11110e(strGroup2, "matcher.group(2)");
                    i14 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    C5207g.m11110e(strGroup3, "matcher.group(3)");
                    i15 = Integer.parseInt(strGroup3);
                } else if (i13 == -1 && matcher.usePattern(C9090h.f47432l).matches()) {
                    String strGroup4 = matcher.group(1);
                    C5207g.m11110e(strGroup4, "matcher.group(1)");
                    i13 = Integer.parseInt(strGroup4);
                } else if (iM14285e3 == -1) {
                    Pattern pattern = C9090h.f47431k;
                    if (matcher.usePattern(pattern).matches()) {
                        String strGroup5 = matcher.group(1);
                        C5207g.m11110e(strGroup5, "matcher.group(1)");
                        Locale locale = Locale.US;
                        C5207g.m11110e(locale, "US");
                        String lowerCase = strGroup5.toLowerCase(locale);
                        C5207g.m11110e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        String strPattern = pattern.pattern();
                        C5207g.m11110e(strPattern, "MONTH_PATTERN.pattern()");
                        iM14285e3 = C7076b.m14285e3(strPattern, lowerCase, 0, false, 6) / 4;
                    } else if (i11 != -1 && matcher.usePattern(C9090h.f47430j).matches()) {
                        String strGroup6 = matcher.group(1);
                        C5207g.m11110e(strGroup6, "matcher.group(1)");
                        i11 = Integer.parseInt(strGroup6);
                    }
                } else if (i11 != -1) {
                }
                iM17302a = m17302a(iM17302a2 + 1, i10, str, false);
            }
            if (70 <= i11 && i11 < 100) {
                i11 += 1900;
            }
            if (i11 >= 0 && i11 < 70) {
                i11 += 2000;
            }
            if (!(i11 >= 1601)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(iM14285e3 != -1)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(1 <= i13 && i13 < 32)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i12 >= 0 && i12 < 24)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i14 >= 0 && i14 < 60)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i15 >= 0 && i15 < 60)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(C9347b.f48086e);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i11);
            gregorianCalendar.set(2, iM14285e3 - 1);
            gregorianCalendar.set(5, i13);
            gregorianCalendar.set(11, i12);
            gregorianCalendar.set(12, i14);
            gregorianCalendar.set(13, i15);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    public C9090h(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f47434a = str;
        this.f47435b = str2;
        this.f47436c = j10;
        this.f47437d = str3;
        this.f47438e = str4;
        this.f47439f = z10;
        this.f47440g = z11;
        this.f47441h = z12;
        this.f47442i = z13;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9090h) {
            C9090h c9090h = (C9090h) obj;
            if (C5207g.m11106a(c9090h.f47434a, this.f47434a) && C5207g.m11106a(c9090h.f47435b, this.f47435b) && c9090h.f47436c == this.f47436c && C5207g.m11106a(c9090h.f47437d, this.f47437d) && C5207g.m11106a(c9090h.f47438e, this.f47438e) && c9090h.f47439f == this.f47439f && c9090h.f47440g == this.f47440g && c9090h.f47441h == this.f47441h && c9090h.f47442i == this.f47442i) {
                return true;
            }
        }
        return false;
    }

    @IgnoreJRERequirement
    public final int hashCode() {
        return Boolean.hashCode(this.f47442i) + ((Boolean.hashCode(this.f47441h) + ((Boolean.hashCode(this.f47440g) + ((Boolean.hashCode(this.f47439f) + C0166e.m758d(this.f47438e, C0166e.m758d(this.f47437d, C0204c.m847f(this.f47436c, C0166e.m758d(this.f47435b, C0166e.m758d(this.f47434a, 527, 31), 31), 31), 31), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f47434a);
        sb2.append('=');
        sb2.append(this.f47435b);
        if (this.f47441h) {
            long j10 = this.f47436c;
            if (j10 == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                String str = C10263c.f51694a.get().format(new Date(j10));
                C5207g.m11110e(str, "STANDARD_DATE_FORMAT.get().format(this)");
                sb2.append(str);
            }
        }
        if (!this.f47442i) {
            sb2.append("; domain=");
            sb2.append(this.f47437d);
        }
        sb2.append("; path=");
        sb2.append(this.f47438e);
        if (this.f47439f) {
            sb2.append("; secure");
        }
        if (this.f47440g) {
            sb2.append("; httponly");
        }
        String string = sb2.toString();
        C5207g.m11110e(string, "toString()");
        return string;
    }
}
