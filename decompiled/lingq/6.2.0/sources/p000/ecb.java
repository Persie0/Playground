package p000;

import java.util.Locale;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.IllegalInstantException;
import org.joda.time.Instant;
import org.joda.time.format.AbstractC3432a;

/* JADX INFO: loaded from: classes.dex */
public final class ecb extends w80 {

    /* JADX INFO: renamed from: b */
    public final f12 f37020b;

    /* JADX INFO: renamed from: c */
    public final DateTimeZone f37021c;

    /* JADX INFO: renamed from: d */
    public final en2 f37022d;

    /* JADX INFO: renamed from: e */
    public final boolean f37023e;

    /* JADX INFO: renamed from: f */
    public final en2 f37024f;

    /* JADX INFO: renamed from: g */
    public final en2 f37025g;

    public ecb(f12 f12Var, DateTimeZone dateTimeZone, en2 en2Var, en2 en2Var2, en2 en2Var3) {
        super(f12Var.mo11491r());
        if (!f12Var.mo11492u()) {
            ij6.m13959q();
            throw null;
        }
        this.f37020b = f12Var;
        this.f37021c = dateTimeZone;
        this.f37022d = en2Var;
        this.f37023e = en2Var != null && en2Var.mo11271d() < 43200000;
        this.f37024f = en2Var2;
        this.f37025g = en2Var3;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: B */
    public final long mo3733B(int i, long j) {
        DateTimeZone dateTimeZone = this.f37021c;
        long jM18347b = dateTimeZone.m18347b(j);
        f12 f12Var = this.f37020b;
        long jMo3733B = f12Var.mo3733B(i, jM18347b);
        long jM18346a = dateTimeZone.m18346a(jMo3733B, j);
        if (mo3734b(jM18346a) == i) {
            return jM18346a;
        }
        String strM18348g = dateTimeZone.m18348g();
        IllegalInstantException illegalInstantException = new IllegalInstantException(wq1.m24118n("Illegal instant due to time zone offset transition (daylight savings time 'gap'): ", AbstractC3432a.m18451a("yyyy-MM-dd'T'HH:mm:ss.SSS").m14766a(new Instant(jMo3733B)), strM18348g != null ? wq1.m24118n(" (", strM18348g, ")") : ""));
        IllegalFieldValueException illegalFieldValueException = new IllegalFieldValueException(f12Var.mo11491r(), Integer.valueOf(i), illegalInstantException.getMessage());
        illegalFieldValueException.initCause(illegalInstantException);
        throw illegalFieldValueException;
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: C */
    public final long mo11029C(long j, String str, Locale locale) {
        DateTimeZone dateTimeZone = this.f37021c;
        return dateTimeZone.m18346a(this.f37020b.mo11029C(dateTimeZone.m18347b(j), str, locale), j);
    }

    /* JADX INFO: renamed from: F */
    public final int m11030F(long j) {
        int iMo18351k = this.f37021c.mo18351k(j);
        long j2 = iMo18351k;
        if (((j + j2) ^ j) >= 0 || (j ^ j2) < 0) {
            return iMo18351k;
        }
        throw new ArithmeticException("Adding time zone offset caused overflow");
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: a */
    public final long mo11031a(int i, long j) {
        boolean z = this.f37023e;
        f12 f12Var = this.f37020b;
        if (z) {
            long jM11030F = m11030F(j);
            return f12Var.mo11031a(i, j + jM11030F) - jM11030F;
        }
        DateTimeZone dateTimeZone = this.f37021c;
        return dateTimeZone.m18346a(f12Var.mo11031a(i, dateTimeZone.m18347b(j)), j);
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: b */
    public final int mo3734b(long j) {
        return this.f37020b.mo3734b(this.f37021c.m18347b(j));
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: c */
    public final String mo11032c(int i, Locale locale) {
        return this.f37020b.mo11032c(i, locale);
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: d */
    public final String mo11033d(long j, Locale locale) {
        return this.f37020b.mo11033d(this.f37021c.m18347b(j), locale);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ecb) {
            ecb ecbVar = (ecb) obj;
            if (this.f37020b.equals(ecbVar.f37020b) && this.f37021c.equals(ecbVar.f37021c) && this.f37022d.equals(ecbVar.f37022d) && this.f37024f.equals(ecbVar.f37024f)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: f */
    public final String mo11034f(int i, Locale locale) {
        return this.f37020b.mo11034f(i, locale);
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: g */
    public final String mo11035g(long j, Locale locale) {
        return this.f37020b.mo11035g(this.f37021c.m18347b(j), locale);
    }

    public final int hashCode() {
        return this.f37021c.hashCode() ^ this.f37020b.hashCode();
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: i */
    public final en2 mo4682i() {
        return this.f37022d;
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: j */
    public final en2 mo11036j() {
        return this.f37025g;
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: k */
    public final int mo11037k(Locale locale) {
        return this.f37020b.mo11037k(locale);
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: l */
    public final int mo3735l() {
        return this.f37020b.mo3735l();
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: o */
    public final int mo4683o() {
        return this.f37020b.mo4683o();
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: q */
    public final en2 mo3736q() {
        return this.f37024f;
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: s */
    public final boolean mo11038s(long j) {
        return this.f37020b.mo11038s(this.f37021c.m18347b(j));
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: t */
    public final boolean mo4684t() {
        return this.f37020b.mo4684t();
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: v */
    public final long mo4685v(long j) {
        return this.f37020b.mo4685v(this.f37021c.m18347b(j));
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: w */
    public final long mo4686w(long j) {
        boolean z = this.f37023e;
        f12 f12Var = this.f37020b;
        if (z) {
            long jM11030F = m11030F(j);
            return f12Var.mo4686w(j + jM11030F) - jM11030F;
        }
        DateTimeZone dateTimeZone = this.f37021c;
        return dateTimeZone.m18346a(f12Var.mo4686w(dateTimeZone.m18347b(j)), j);
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: x */
    public final long mo4687x(long j) {
        boolean z = this.f37023e;
        f12 f12Var = this.f37020b;
        if (z) {
            long jM11030F = m11030F(j);
            return f12Var.mo4687x(j + jM11030F) - jM11030F;
        }
        DateTimeZone dateTimeZone = this.f37021c;
        return dateTimeZone.m18346a(f12Var.mo4687x(dateTimeZone.m18347b(j)), j);
    }
}
