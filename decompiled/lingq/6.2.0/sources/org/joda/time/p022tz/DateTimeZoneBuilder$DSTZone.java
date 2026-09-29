package org.joda.time.p022tz;

import java.util.Arrays;
import org.joda.time.DateTimeZone;
import p000.v22;

/* JADX INFO: loaded from: classes.dex */
final class DateTimeZoneBuilder$DSTZone extends DateTimeZone {
    private static final long serialVersionUID = 6941492635554961361L;
    final v22 iEndRecurrence;
    final int iStandardOffset;
    final v22 iStartRecurrence;

    public DateTimeZoneBuilder$DSTZone(String str, int i, v22 v22Var, v22 v22Var2) {
        super(str);
        this.iStandardOffset = i;
        this.iStartRecurrence = v22Var;
        this.iEndRecurrence = v22Var2;
    }

    @Override // org.joda.time.DateTimeZone
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DateTimeZoneBuilder$DSTZone) {
            DateTimeZoneBuilder$DSTZone dateTimeZoneBuilder$DSTZone = (DateTimeZoneBuilder$DSTZone) obj;
            if (m18348g().equals(dateTimeZoneBuilder$DSTZone.m18348g()) && this.iStandardOffset == dateTimeZoneBuilder$DSTZone.iStandardOffset && this.iStartRecurrence.equals(dateTimeZoneBuilder$DSTZone.iStartRecurrence) && this.iEndRecurrence.equals(dateTimeZoneBuilder$DSTZone.iEndRecurrence)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.joda.time.DateTimeZone
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.iStandardOffset), this.iStartRecurrence, this.iEndRecurrence});
    }

    @Override // org.joda.time.DateTimeZone
    /* JADX INFO: renamed from: i */
    public final String mo18350i(long j) {
        return m18454v(j).f64721b;
    }

    @Override // org.joda.time.DateTimeZone
    /* JADX INFO: renamed from: k */
    public final int mo18351k(long j) {
        return this.iStandardOffset + m18454v(j).f64722c;
    }

    @Override // org.joda.time.DateTimeZone
    /* JADX INFO: renamed from: o */
    public final int mo18354o(long j) {
        return this.iStandardOffset;
    }

    @Override // org.joda.time.DateTimeZone
    /* JADX INFO: renamed from: p */
    public final boolean mo18355p() {
        return false;
    }

    @Override // org.joda.time.DateTimeZone
    /* JADX INFO: renamed from: q */
    public final long mo18356q(long j) {
        long jM23051a;
        int i = this.iStandardOffset;
        v22 v22Var = this.iStartRecurrence;
        v22 v22Var2 = this.iEndRecurrence;
        try {
            jM23051a = v22Var.m23051a(j, i, v22Var2.f64722c);
            if (j > 0 && jM23051a < 0) {
                jM23051a = j;
            }
        } catch (ArithmeticException | IllegalArgumentException unused) {
        }
        try {
            long jM23051a2 = v22Var2.m23051a(j, i, v22Var.f64722c);
            if (j <= 0 || jM23051a2 >= 0) {
                j = jM23051a2;
            }
        } catch (ArithmeticException | IllegalArgumentException unused2) {
        }
        return jM23051a > j ? j : jM23051a;
    }

    @Override // org.joda.time.DateTimeZone
    /* JADX INFO: renamed from: s */
    public final long mo18357s(long j) {
        long jM23052b;
        long j2 = j + 1;
        int i = this.iStandardOffset;
        v22 v22Var = this.iStartRecurrence;
        v22 v22Var2 = this.iEndRecurrence;
        try {
            jM23052b = v22Var.m23052b(j2, i, v22Var2.f64722c);
            if (j2 < 0 && jM23052b > 0) {
                jM23052b = j2;
            }
        } catch (ArithmeticException | IllegalArgumentException unused) {
        }
        try {
            long jM23052b2 = v22Var2.m23052b(j2, i, v22Var.f64722c);
            if (j2 >= 0 || jM23052b2 <= 0) {
                j2 = jM23052b2;
            }
        } catch (ArithmeticException | IllegalArgumentException unused2) {
        }
        if (jM23052b <= j2) {
            jM23052b = j2;
        }
        return jM23052b - 1;
    }

    /* JADX INFO: renamed from: v */
    public final v22 m18454v(long j) {
        long jM23051a;
        int i = this.iStandardOffset;
        v22 v22Var = this.iStartRecurrence;
        v22 v22Var2 = this.iEndRecurrence;
        try {
            jM23051a = v22Var.m23051a(j, i, v22Var2.f64722c);
        } catch (ArithmeticException | IllegalArgumentException unused) {
            jM23051a = j;
        }
        try {
            j = v22Var2.m23051a(j, i, v22Var.f64722c);
        } catch (ArithmeticException | IllegalArgumentException unused2) {
        }
        return jM23051a > j ? v22Var : v22Var2;
    }
}
