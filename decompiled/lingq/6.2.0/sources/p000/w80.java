package p000;

import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.LocalDateTime;

/* JADX INFO: loaded from: classes.dex */
public abstract class w80 extends f12 {

    /* JADX INFO: renamed from: a */
    public final DateTimeFieldType f66506a;

    public w80(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            this.f66506a = dateTimeFieldType;
        } else {
            C3386nv.m17626m("The type must not be null");
            throw null;
        }
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: A */
    public long mo11484A(long j) {
        long jMo4687x = mo4687x(j);
        long jMo4686w = mo4686w(j);
        return j - jMo4687x <= jMo4686w - j ? jMo4687x : jMo4686w;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: C */
    public long mo11029C(long j, String str, Locale locale) {
        return mo3733B(mo18444E(str, locale), j);
    }

    /* JADX INFO: renamed from: E */
    public int mo18444E(String str, Locale locale) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new IllegalFieldValueException(this.f66506a, str);
        }
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: a */
    public long mo11031a(int i, long j) {
        return mo4682i().mo11268a(i, j);
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: c */
    public String mo11032c(int i, Locale locale) {
        return mo11034f(i, locale);
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: d */
    public String mo11033d(long j, Locale locale) {
        return mo11032c(mo3734b(j), locale);
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: e */
    public final String mo11486e(LocalDateTime localDateTime, Locale locale) {
        return mo11032c(localDateTime.m18368b(this.f66506a), locale);
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: f */
    public String mo11034f(int i, Locale locale) {
        return Integer.toString(i);
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: g */
    public String mo11035g(long j, Locale locale) {
        return mo11034f(mo3734b(j), locale);
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: h */
    public final String mo11487h(LocalDateTime localDateTime, Locale locale) {
        return mo11034f(localDateTime.m18368b(this.f66506a), locale);
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: j */
    public en2 mo11036j() {
        return null;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: k */
    public int mo11037k(Locale locale) {
        int iMo3735l = mo3735l();
        if (iMo3735l >= 0) {
            if (iMo3735l < 10) {
                return 1;
            }
            if (iMo3735l < 100) {
                return 2;
            }
            if (iMo3735l < 1000) {
                return 3;
            }
        }
        return Integer.toString(iMo3735l).length();
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: p */
    public final String mo11490p() {
        return this.f66506a.m18336c();
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: r */
    public final DateTimeFieldType mo11491r() {
        return this.f66506a;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: s */
    public boolean mo11038s(long j) {
        return false;
    }

    public final String toString() {
        return "DateTimeField[" + this.f66506a.m18336c() + ']';
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: u */
    public final boolean mo11492u() {
        return true;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: v */
    public long mo4685v(long j) {
        return j - mo4687x(j);
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: w */
    public long mo4686w(long j) {
        long jMo4687x = mo4687x(j);
        return jMo4687x != j ? mo11031a(1, jMo4687x) : j;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: y */
    public long mo11493y(long j) {
        long jMo4687x = mo4687x(j);
        long jMo4686w = mo4686w(j);
        return jMo4686w - j <= j - jMo4687x ? jMo4686w : jMo4687x;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: z */
    public long mo11494z(long j) {
        long jMo4687x = mo4687x(j);
        long jMo4686w = mo4686w(j);
        long j2 = j - jMo4687x;
        long j3 = jMo4686w - j;
        return (j2 >= j3 && (j3 < j2 || (mo3734b(jMo4686w) & 1) == 0)) ? jMo4686w : jMo4687x;
    }
}
