package org.joda.time.chrono;

import android.support.v4.media.session.C0166e;
import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.field.C8120c;
import org.joda.time.field.C8121d;
import org.joda.time.field.C8122e;
import org.joda.time.field.C8124g;
import org.joda.time.field.C8125h;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.PreciseDurationField;
import p163hp.AbstractC6094a;
import p163hp.AbstractC6095b;
import p163hp.AbstractC6097d;

/* JADX INFO: loaded from: classes2.dex */
abstract class BasicChronology extends AssembledChronology {

    /* JADX INFO: renamed from: f0 */
    public static final MillisDurationField f44039f0;

    /* JADX INFO: renamed from: g0 */
    public static final PreciseDurationField f44040g0;

    /* JADX INFO: renamed from: h0 */
    public static final PreciseDurationField f44041h0;

    /* JADX INFO: renamed from: i0 */
    public static final PreciseDurationField f44042i0;

    /* JADX INFO: renamed from: j0 */
    public static final PreciseDurationField f44043j0;

    /* JADX INFO: renamed from: k0 */
    public static final PreciseDurationField f44044k0;

    /* JADX INFO: renamed from: l0 */
    public static final PreciseDurationField f44045l0;

    /* JADX INFO: renamed from: m0 */
    public static final C8122e f44046m0;

    /* JADX INFO: renamed from: n0 */
    public static final C8122e f44047n0;

    /* JADX INFO: renamed from: o0 */
    public static final C8122e f44048o0;

    /* JADX INFO: renamed from: p0 */
    public static final C8122e f44049p0;

    /* JADX INFO: renamed from: q0 */
    public static final C8122e f44050q0;

    /* JADX INFO: renamed from: r0 */
    public static final C8122e f44051r0;

    /* JADX INFO: renamed from: s0 */
    public static final C8122e f44052s0;
    private static final long serialVersionUID = 8283225332206808863L;

    /* JADX INFO: renamed from: t0 */
    public static final C8122e f44053t0;

    /* JADX INFO: renamed from: u0 */
    public static final C8125h f44054u0;

    /* JADX INFO: renamed from: v0 */
    public static final C8125h f44055v0;

    /* JADX INFO: renamed from: w0 */
    public static final C8105a f44056w0;

    /* JADX INFO: renamed from: e0 */
    public final transient C8106b[] f44057e0;
    private final int iMinDaysInFirstWeek;

    /* JADX INFO: renamed from: org.joda.time.chrono.BasicChronology$a */
    public static class C8105a extends C8122e {
        public C8105a() {
            super(DateTimeFieldType.f43925H, BasicChronology.f44043j0, BasicChronology.f44044k0);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
        /* JADX INFO: renamed from: M */
        public final long mo12569M(long j10, String str, Locale locale) {
            String[] strArr = C8114g.m16085b(locale).f44088f;
            int length = strArr.length;
            do {
                length--;
                if (length < 0) {
                    throw new IllegalFieldValueException(DateTimeFieldType.f43925H, str);
                }
            } while (!strArr[length].equalsIgnoreCase(str));
            return mo12568J(length, j10);
        }

        @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
        /* JADX INFO: renamed from: e */
        public final String mo12575e(int i10, Locale locale) {
            return C8114g.m16085b(locale).f44088f[i10];
        }

        @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
        /* JADX INFO: renamed from: l */
        public final int mo12579l(Locale locale) {
            return C8114g.m16085b(locale).f44095m;
        }
    }

    /* JADX INFO: renamed from: org.joda.time.chrono.BasicChronology$b */
    public static class C8106b {

        /* JADX INFO: renamed from: a */
        public final int f44058a;

        /* JADX INFO: renamed from: b */
        public final long f44059b;

        public C8106b(int i10, long j10) {
            this.f44058a = i10;
            this.f44059b = j10;
        }
    }

    static {
        MillisDurationField millisDurationField = MillisDurationField.f44103a;
        f44039f0 = millisDurationField;
        PreciseDurationField preciseDurationField = new PreciseDurationField(DurationFieldType.f43966k, 1000L);
        f44040g0 = preciseDurationField;
        PreciseDurationField preciseDurationField2 = new PreciseDurationField(DurationFieldType.f43965j, 60000L);
        f44041h0 = preciseDurationField2;
        PreciseDurationField preciseDurationField3 = new PreciseDurationField(DurationFieldType.f43964i, 3600000L);
        f44042i0 = preciseDurationField3;
        PreciseDurationField preciseDurationField4 = new PreciseDurationField(DurationFieldType.f43963h, 43200000L);
        f44043j0 = preciseDurationField4;
        PreciseDurationField preciseDurationField5 = new PreciseDurationField(DurationFieldType.f43962g, 86400000L);
        f44044k0 = preciseDurationField5;
        f44045l0 = new PreciseDurationField(DurationFieldType.f43961f, 604800000L);
        f44046m0 = new C8122e(DateTimeFieldType.f43935R, millisDurationField, preciseDurationField);
        f44047n0 = new C8122e(DateTimeFieldType.f43934Q, millisDurationField, preciseDurationField5);
        f44048o0 = new C8122e(DateTimeFieldType.f43933P, preciseDurationField, preciseDurationField2);
        f44049p0 = new C8122e(DateTimeFieldType.f43932O, preciseDurationField, preciseDurationField5);
        f44050q0 = new C8122e(DateTimeFieldType.f43931N, preciseDurationField2, preciseDurationField3);
        f44051r0 = new C8122e(DateTimeFieldType.f43930M, preciseDurationField2, preciseDurationField5);
        C8122e c8122e = new C8122e(DateTimeFieldType.f43929L, preciseDurationField3, preciseDurationField5);
        f44052s0 = c8122e;
        C8122e c8122e2 = new C8122e(DateTimeFieldType.f43926I, preciseDurationField3, preciseDurationField4);
        f44053t0 = c8122e2;
        f44054u0 = new C8125h(c8122e, DateTimeFieldType.f43928K);
        f44055v0 = new C8125h(c8122e2, DateTimeFieldType.f43927J);
        f44056w0 = new C8105a();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public BasicChronology(ZonedChronology zonedChronology, int i10) {
        super(zonedChronology, null);
        this.f44057e0 = new C8106b[1024];
        if (i10 < 1 || i10 > 7) {
            throw new IllegalArgumentException(C0166e.m761g("Invalid min days in first week: ", i10));
        }
        this.iMinDaysInFirstWeek = i10;
    }

    /* JADX INFO: renamed from: q0 */
    public static int m16048q0(long j10) {
        long j11;
        if (j10 >= 0) {
            j11 = j10 / 86400000;
        } else {
            j11 = (j10 - 86399999) / 86400000;
            if (j11 < -3) {
                return ((int) ((j11 + 4) % 7)) + 7;
            }
        }
        return ((int) ((j11 + 3) % 7)) + 1;
    }

    /* JADX INFO: renamed from: v0 */
    public static int m16049v0(long j10) {
        return j10 >= 0 ? (int) (j10 % 86400000) : ((int) ((j10 + 1) % 86400000)) + 86399999;
    }

    /* JADX INFO: renamed from: A0 */
    public final int m16050A0(int i10, long j10) {
        long jM16067t0 = m16067t0(i10);
        if (j10 < jM16067t0) {
            return m16051B0(i10 - 1);
        }
        if (j10 >= m16067t0(i10 + 1)) {
            return 1;
        }
        return ((int) ((j10 - jM16067t0) / 604800000)) + 1;
    }

    /* JADX INFO: renamed from: B0 */
    public final int m16051B0(int i10) {
        return (int) ((m16067t0(i10 + 1) - m16067t0(i10)) / 604800000);
    }

    /* JADX INFO: renamed from: C0 */
    public final int m16052C0(long j10) {
        int iM16053D0 = m16053D0(j10);
        int iM16050A0 = m16050A0(iM16053D0, j10);
        if (iM16050A0 == 1) {
            return m16053D0(j10 + 604800000);
        }
        return iM16050A0 > 51 ? m16053D0(j10 - 1209600000) : iM16053D0;
    }

    /* JADX INFO: renamed from: D0 */
    public final int m16053D0(long j10) {
        mo16063o0();
        mo16060l0();
        long j11 = (j10 >> 1) + 31083597720000L;
        if (j11 < 0) {
            j11 = (j11 - 15778476000L) + 1;
        }
        int i10 = (int) (j11 / 15778476000L);
        long jM16054E0 = m16054E0(i10);
        long j12 = j10 - jM16054E0;
        if (j12 < 0) {
            return i10 - 1;
        }
        if (j12 >= 31536000000L) {
            if (jM16054E0 + (mo16057H0(i10) ? 31622400000L : 31536000000L) <= j10) {
                i10++;
            }
        }
        return i10;
    }

    /* JADX INFO: renamed from: E0 */
    public final long m16054E0(int i10) {
        int i11 = i10 & 1023;
        C8106b[] c8106bArr = this.f44057e0;
        C8106b c8106b = c8106bArr[i11];
        if (c8106b == null || c8106b.f44058a != i10) {
            c8106b = new C8106b(i10, mo16059k0(i10));
            c8106bArr[i11] = c8106b;
        }
        return c8106b.f44059b;
    }

    /* JADX INFO: renamed from: F0 */
    public final long m16055F0(int i10, int i11, int i12) {
        return (((long) (i12 - 1)) * 86400000) + m16054E0(i10) + mo16072z0(i10, i11);
    }

    /* JADX INFO: renamed from: G0 */
    public boolean mo16056G0(long j10) {
        return false;
    }

    /* JADX INFO: renamed from: H0 */
    public abstract boolean mo16057H0(int i10);

    /* JADX INFO: renamed from: I0 */
    public abstract long mo16058I0(int i10, long j10);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BasicChronology basicChronology = (BasicChronology) obj;
        return this.iMinDaysInFirstWeek == basicChronology.iMinDaysInFirstWeek && mo12554q().equals(basicChronology.mo12554q());
    }

    @Override // org.joda.time.chrono.AssembledChronology
    /* JADX INFO: renamed from: g0 */
    public void mo16042g0(AssembledChronology.C8104a c8104a) {
        c8104a.f44013a = f44039f0;
        c8104a.f44014b = f44040g0;
        c8104a.f44015c = f44041h0;
        c8104a.f44016d = f44042i0;
        c8104a.f44017e = f44043j0;
        c8104a.f44018f = f44044k0;
        c8104a.f44019g = f44045l0;
        c8104a.f44025m = f44046m0;
        c8104a.f44026n = f44047n0;
        c8104a.f44027o = f44048o0;
        c8104a.f44028p = f44049p0;
        c8104a.f44029q = f44050q0;
        c8104a.f44030r = f44051r0;
        c8104a.f44031s = f44052s0;
        c8104a.f44033u = f44053t0;
        c8104a.f44032t = f44054u0;
        c8104a.f44034v = f44055v0;
        c8104a.f44035w = f44056w0;
        C8112e c8112e = new C8112e(this);
        c8104a.f44008E = c8112e;
        C8116i c8116i = new C8116i(c8112e, this);
        c8104a.f44009F = c8116i;
        C8121d c8121d = new C8121d(c8116i, c8116i.f44106a, 99);
        DateTimeFieldType dateTimeFieldType = DateTimeFieldType.f43936a;
        C8120c c8120c = new C8120c(c8121d);
        c8104a.f44011H = c8120c;
        c8104a.f44023k = c8120c.f44109d;
        c8104a.f44010G = new C8121d(new C8124g(c8120c, c8120c.f44106a), DateTimeFieldType.f43939d, 1);
        c8104a.f44012I = new C8113f(this);
        c8104a.f44036x = new C8109b(this, c8104a.f44018f, 1);
        c8104a.f44037y = new C8108a(this, c8104a.f44018f);
        c8104a.f44038z = new C8109b(this, c8104a.f44018f, 0);
        c8104a.f44007D = new C8115h(this);
        c8104a.f44005B = new C8111d(this);
        c8104a.f44004A = new C8110c(this, c8104a.f44019g);
        AbstractC6095b abstractC6095b = c8104a.f44005B;
        AbstractC6097d abstractC6097d = c8104a.f44023k;
        c8104a.f44006C = new C8121d(new C8124g(abstractC6095b, abstractC6097d), DateTimeFieldType.f43944i, 1);
        c8104a.f44022j = c8104a.f44008E.mo12577j();
        c8104a.f44021i = c8104a.f44007D.mo12577j();
        c8104a.f44020h = c8104a.f44005B.mo12577j();
    }

    public final int hashCode() {
        return mo12554q().hashCode() + (getClass().getName().hashCode() * 11) + this.iMinDaysInFirstWeek;
    }

    /* JADX INFO: renamed from: k0 */
    public abstract long mo16059k0(int i10);

    /* JADX INFO: renamed from: l0 */
    public abstract void mo16060l0();

    /* JADX INFO: renamed from: m0 */
    public abstract void mo16061m0();

    /* JADX INFO: renamed from: n0 */
    public abstract void mo16062n0();

    /* JADX INFO: renamed from: o0 */
    public abstract void mo16063o0();

    /* JADX INFO: renamed from: p0 */
    public final int m16064p0(int i10, int i11, long j10) {
        return ((int) ((j10 - (m16054E0(i10) + mo16072z0(i10, i11))) / 86400000)) + 1;
    }

    @Override // org.joda.time.chrono.AssembledChronology, p163hp.AbstractC6094a
    /* JADX INFO: renamed from: q */
    public final DateTimeZone mo12554q() {
        AbstractC6094a abstractC6094aM16043h0 = m16043h0();
        return abstractC6094aM16043h0 != null ? abstractC6094aM16043h0.mo12554q() : DateTimeZone.f43949a;
    }

    /* JADX INFO: renamed from: r0 */
    public int mo16065r0(int i10, long j10) {
        int iM16053D0 = m16053D0(j10);
        return mo16066s0(iM16053D0, mo16071y0(iM16053D0, j10));
    }

    /* JADX INFO: renamed from: s0 */
    public abstract int mo16066s0(int i10, int i11);

    /* JADX INFO: renamed from: t0 */
    public final long m16067t0(int i10) {
        long jM16054E0 = m16054E0(i10);
        int iM16048q0 = m16048q0(jM16054E0);
        return iM16048q0 > 8 - this.iMinDaysInFirstWeek ? (((long) (8 - iM16048q0)) * 86400000) + jM16054E0 : jM16054E0 - (((long) (iM16048q0 - 1)) * 86400000);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(60);
        String name = getClass().getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            name = name.substring(iLastIndexOf + 1);
        }
        sb2.append(name);
        sb2.append('[');
        DateTimeZone dateTimeZoneMo12554q = mo12554q();
        if (dateTimeZoneMo12554q != null) {
            sb2.append(dateTimeZoneMo12554q.m16022h());
        }
        if (this.iMinDaysInFirstWeek != 4) {
            sb2.append(",mdfw=");
            sb2.append(this.iMinDaysInFirstWeek);
        }
        sb2.append(']');
        return sb2.toString();
    }

    /* JADX INFO: renamed from: u0 */
    public abstract void mo16068u0();

    /* JADX INFO: renamed from: w0 */
    public abstract void mo16069w0();

    /* JADX INFO: renamed from: x0 */
    public final int m16070x0() {
        return this.iMinDaysInFirstWeek;
    }

    /* JADX INFO: renamed from: y0 */
    public abstract int mo16071y0(int i10, long j10);

    /* JADX INFO: renamed from: z0 */
    public abstract long mo16072z0(int i10, int i11);
}
