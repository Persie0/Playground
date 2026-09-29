package org.joda.time.chrono;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.PreciseDurationField;
import p000.C3386nv;
import p000.bi7;
import p000.ra0;
import p000.ux5;
import p000.ybb;

/* JADX INFO: loaded from: classes.dex */
abstract class BasicChronology extends AssembledChronology {

    /* JADX INFO: renamed from: f0 */
    public static final PreciseDurationField f54884f0;

    /* JADX INFO: renamed from: g0 */
    public static final PreciseDurationField f54885g0;

    /* JADX INFO: renamed from: h0 */
    public static final PreciseDurationField f54886h0;

    /* JADX INFO: renamed from: i0 */
    public static final PreciseDurationField f54887i0;

    /* JADX INFO: renamed from: j0 */
    public static final PreciseDurationField f54888j0;

    /* JADX INFO: renamed from: k0 */
    public static final PreciseDurationField f54889k0;

    /* JADX INFO: renamed from: l0 */
    public static final bi7 f54890l0;

    /* JADX INFO: renamed from: m0 */
    public static final bi7 f54891m0;

    /* JADX INFO: renamed from: n0 */
    public static final bi7 f54892n0;

    /* JADX INFO: renamed from: o0 */
    public static final bi7 f54893o0;

    /* JADX INFO: renamed from: p0 */
    public static final bi7 f54894p0;

    /* JADX INFO: renamed from: q0 */
    public static final bi7 f54895q0;

    /* JADX INFO: renamed from: r0 */
    public static final bi7 f54896r0;

    /* JADX INFO: renamed from: s0 */
    public static final bi7 f54897s0;
    private static final long serialVersionUID = 8283225332206808863L;

    /* JADX INFO: renamed from: t0 */
    public static final ybb f54898t0;

    /* JADX INFO: renamed from: u0 */
    public static final ybb f54899u0;

    /* JADX INFO: renamed from: v0 */
    public static final C3425a f54900v0;

    /* JADX INFO: renamed from: e0 */
    public final transient ra0[] f54901e0;
    private final int iMinDaysInFirstWeek;

    static {
        PreciseDurationField preciseDurationField = new PreciseDurationField(DurationFieldType.f54844k, 1000L);
        f54884f0 = preciseDurationField;
        PreciseDurationField preciseDurationField2 = new PreciseDurationField(DurationFieldType.f54843j, 60000L);
        f54885g0 = preciseDurationField2;
        PreciseDurationField preciseDurationField3 = new PreciseDurationField(DurationFieldType.f54842i, 3600000L);
        f54886h0 = preciseDurationField3;
        PreciseDurationField preciseDurationField4 = new PreciseDurationField(DurationFieldType.f54841h, 43200000L);
        f54887i0 = preciseDurationField4;
        PreciseDurationField preciseDurationField5 = new PreciseDurationField(DurationFieldType.f54840g, 86400000L);
        f54888j0 = preciseDurationField5;
        f54889k0 = new PreciseDurationField(DurationFieldType.f54839f, 604800000L);
        DateTimeFieldType dateTimeFieldType = DateTimeFieldType.f54815R;
        MillisDurationField millisDurationField = MillisDurationField.f54920a;
        f54890l0 = new bi7(dateTimeFieldType, millisDurationField, preciseDurationField);
        f54891m0 = new bi7(DateTimeFieldType.f54814Q, millisDurationField, preciseDurationField5);
        f54892n0 = new bi7(DateTimeFieldType.f54813P, preciseDurationField, preciseDurationField2);
        f54893o0 = new bi7(DateTimeFieldType.f54812O, preciseDurationField, preciseDurationField5);
        f54894p0 = new bi7(DateTimeFieldType.f54811N, preciseDurationField2, preciseDurationField3);
        f54895q0 = new bi7(DateTimeFieldType.f54810M, preciseDurationField2, preciseDurationField5);
        bi7 bi7Var = new bi7(DateTimeFieldType.f54809L, preciseDurationField3, preciseDurationField5);
        f54896r0 = bi7Var;
        bi7 bi7Var2 = new bi7(DateTimeFieldType.f54806I, preciseDurationField3, preciseDurationField4);
        f54897s0 = bi7Var2;
        f54898t0 = new ybb(bi7Var, DateTimeFieldType.f54808K);
        f54899u0 = new ybb(bi7Var2, DateTimeFieldType.f54807J);
        f54900v0 = new C3425a(DateTimeFieldType.f54805H, f54887i0, f54888j0);
    }

    public BasicChronology(ZonedChronology zonedChronology, int i) {
        super(zonedChronology, null);
        this.f54901e0 = new ra0[1024];
        if (i < 1 || i > 7) {
            C3386nv.m17626m(ux5.m22988k(i, "Invalid min days in first week: "));
            throw null;
        }
        this.iMinDaysInFirstWeek = i;
    }

    /* JADX INFO: renamed from: R */
    public static int m18419R(long j) {
        long j2;
        if (j >= 0) {
            j2 = j / 86400000;
        } else {
            j2 = (j - 86399999) / 86400000;
            if (j2 < -3) {
                return ((int) ((j2 + 4) % 7)) + 7;
            }
        }
        return ((int) ((j2 + 3) % 7)) + 1;
    }

    /* JADX INFO: renamed from: T */
    public static int m18420T(long j) {
        return j >= 0 ? (int) (j % 86400000) : ((int) ((j + 1) % 86400000)) + 86399999;
    }

    /* JADX INFO: renamed from: Q */
    public final int m18421Q(long j, int i, int i2) {
        return ((int) ((j - (m18429a0(i) + mo18424V(i, i2))) / 86400000)) + 1;
    }

    /* JADX INFO: renamed from: S */
    public final long m18422S(int i) {
        long jM18429a0 = m18429a0(i);
        int iM18419R = m18419R(jM18429a0);
        return iM18419R > 8 - this.iMinDaysInFirstWeek ? (((long) (8 - iM18419R)) * 86400000) + jM18429a0 : jM18429a0 - (((long) (iM18419R - 1)) * 86400000);
    }

    /* JADX INFO: renamed from: U */
    public int m18423U() {
        return this.iMinDaysInFirstWeek;
    }

    /* JADX INFO: renamed from: V */
    public abstract long mo18424V(int i, int i2);

    /* JADX INFO: renamed from: W */
    public final int m18425W(int i, long j) {
        long jM18422S = m18422S(i);
        if (j < jM18422S) {
            return m18426X(i - 1);
        }
        if (j >= m18422S(i + 1)) {
            return 1;
        }
        return ((int) ((j - jM18422S) / 604800000)) + 1;
    }

    /* JADX INFO: renamed from: X */
    public final int m18426X(int i) {
        return (int) ((m18422S(i + 1) - m18422S(i)) / 604800000);
    }

    /* JADX INFO: renamed from: Y */
    public final int m18427Y(long j) {
        int iM18428Z = m18428Z(j);
        int iM18425W = m18425W(iM18428Z, j);
        if (iM18425W == 1) {
            return m18428Z(j + 604800000);
        }
        return iM18425W > 51 ? m18428Z(j - 1209600000) : iM18428Z;
    }

    /* JADX INFO: renamed from: Z */
    public final int m18428Z(long j) {
        long j2 = j >> 1;
        long j3 = 31083597720000L + j2;
        if (j3 < 0) {
            j3 = 31067819244001L + j2;
        }
        int i = (int) (j3 / 15778476000L);
        long jM18429a0 = m18429a0(i);
        long j4 = j - jM18429a0;
        if (j4 < 0) {
            return i - 1;
        }
        if (j4 >= 31536000000L) {
            return jM18429a0 + (mo18431c0(i) ? 31622400000L : 31536000000L) <= j ? i + 1 : i;
        }
        return i;
    }

    /* JADX INFO: renamed from: a0 */
    public final long m18429a0(int i) {
        int i2;
        int i3 = i & 1023;
        ra0[] ra0VarArr = this.f54901e0;
        ra0 ra0Var = ra0VarArr[i3];
        if (ra0Var == null || ra0Var.f58957a != i) {
            GregorianChronology gregorianChronology = (GregorianChronology) this;
            int i4 = i / 100;
            if (i < 0) {
                i2 = ((((i + 3) >> 2) - i4) + ((i4 + 3) >> 2)) - 1;
            } else {
                int i5 = (i4 >> 2) + ((i >> 2) - i4);
                i2 = gregorianChronology.mo18431c0(i) ? i5 - 1 : i5;
            }
            ra0Var = new ra0(i, ((((long) i) * 365) + ((long) (i2 - 719527))) * 86400000);
            ra0VarArr[i3] = ra0Var;
        }
        return ra0Var.f58958b;
    }

    /* JADX INFO: renamed from: b0 */
    public final long m18430b0(int i, int i2, int i3) {
        return (((long) (i3 - 1)) * 86400000) + m18429a0(i) + mo18424V(i, i2);
    }

    /* JADX INFO: renamed from: c0 */
    public abstract boolean mo18431c0(int i);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BasicChronology basicChronology = (BasicChronology) obj;
        return m18423U() == basicChronology.m18423U() && mo18360k().equals(basicChronology.mo18360k());
    }

    public int hashCode() {
        return mo18360k().hashCode() + (getClass().getName().hashCode() * 11) + m18423U();
    }

    @Override // org.joda.time.chrono.AssembledChronology, p000.s11
    /* JADX INFO: renamed from: k */
    public abstract DateTimeZone mo18360k();

    public String toString() {
        StringBuilder sb = new StringBuilder(60);
        String name = getClass().getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            name = name.substring(iLastIndexOf + 1);
        }
        sb.append(name);
        sb.append('[');
        DateTimeZone dateTimeZoneMo18360k = mo18360k();
        if (dateTimeZoneMo18360k != null) {
            sb.append(dateTimeZoneMo18360k.m18348g());
        }
        if (m18423U() != 4) {
            sb.append(",mdfw=");
            sb.append(m18423U());
        }
        sb.append(']');
        return sb.toString();
    }
}
