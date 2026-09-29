package org.joda.time.chrono;

import java.util.HashMap;
import java.util.Locale;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.IllegalInstantException;
import org.joda.time.field.AbstractC8118a;
import org.joda.time.field.BaseDurationField;
import p163hp.AbstractC6094a;
import p163hp.AbstractC6095b;
import p163hp.AbstractC6097d;

/* JADX INFO: loaded from: classes2.dex */
public final class ZonedChronology extends AssembledChronology {
    private static final long serialVersionUID = -1079258847191166848L;

    public static class ZonedDurationField extends BaseDurationField {
        private static final long serialVersionUID = -485345310999208286L;
        final AbstractC6097d iField;
        final boolean iTimeField;
        final DateTimeZone iZone;

        public ZonedDurationField(AbstractC6097d abstractC6097d, DateTimeZone dateTimeZone) {
            super(abstractC6097d.mo12593q());
            if (!abstractC6097d.mo12596w()) {
                throw new IllegalArgumentException();
            }
            this.iField = abstractC6097d;
            this.iTimeField = abstractC6097d.mo12594s() < 43200000;
            this.iZone = dateTimeZone;
        }

        @Override // p163hp.AbstractC6097d
        /* JADX INFO: renamed from: a */
        public final long mo12591a(int i10, long j10) {
            int iM16079y = m16079y(j10);
            long jMo12591a = this.iField.mo12591a(i10, j10 + ((long) iM16079y));
            if (!this.iTimeField) {
                iM16079y = m16078x(jMo12591a);
            }
            return jMo12591a - ((long) iM16079y);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ZonedDurationField)) {
                return false;
            }
            ZonedDurationField zonedDurationField = (ZonedDurationField) obj;
            return this.iField.equals(zonedDurationField.iField) && this.iZone.equals(zonedDurationField.iZone);
        }

        public final int hashCode() {
            return this.iField.hashCode() ^ this.iZone.hashCode();
        }

        @Override // p163hp.AbstractC6097d
        /* JADX INFO: renamed from: l */
        public final long mo12592l(long j10, long j11) {
            int iM16079y = m16079y(j10);
            long jMo12592l = this.iField.mo12592l(j10 + ((long) iM16079y), j11);
            if (!this.iTimeField) {
                iM16079y = m16078x(jMo12592l);
            }
            return jMo12592l - ((long) iM16079y);
        }

        @Override // p163hp.AbstractC6097d
        /* JADX INFO: renamed from: s */
        public final long mo12594s() {
            return this.iField.mo12594s();
        }

        @Override // p163hp.AbstractC6097d
        /* JADX INFO: renamed from: t */
        public final boolean mo12595t() {
            if (this.iTimeField) {
                return this.iField.mo12595t();
            }
            return this.iField.mo12595t() && this.iZone.mo16029w();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: x */
        public final int m16078x(long j10) {
            int iMo16026q = this.iZone.mo16026q(j10);
            long j11 = iMo16026q;
            if (((j10 - j11) ^ j10) < 0 && (j10 ^ j11) < 0) {
                throw new ArithmeticException("Subtracting time zone offset caused overflow");
            }
            return iMo16026q;
        }

        /* JADX INFO: renamed from: y */
        public final int m16079y(long j10) {
            int iMo16025n = this.iZone.mo16025n(j10);
            long j11 = iMo16025n;
            if (((j10 + j11) ^ j10) >= 0 || (j10 ^ j11) < 0) {
                return iMo16025n;
            }
            throw new ArithmeticException("Adding time zone offset caused overflow");
        }
    }

    /* JADX INFO: renamed from: org.joda.time.chrono.ZonedChronology$a */
    public static final class C8107a extends AbstractC8118a {

        /* JADX INFO: renamed from: b */
        public final AbstractC6095b f44069b;

        /* JADX INFO: renamed from: c */
        public final DateTimeZone f44070c;

        /* JADX INFO: renamed from: d */
        public final AbstractC6097d f44071d;

        /* JADX INFO: renamed from: e */
        public final boolean f44072e;

        /* JADX INFO: renamed from: f */
        public final AbstractC6097d f44073f;

        /* JADX INFO: renamed from: g */
        public final AbstractC6097d f44074g;

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public C8107a(AbstractC6095b abstractC6095b, DateTimeZone dateTimeZone, AbstractC6097d abstractC6097d, AbstractC6097d abstractC6097d2, AbstractC6097d abstractC6097d3) {
            super(abstractC6095b.mo12585w());
            if (!abstractC6095b.mo12588z()) {
                throw new IllegalArgumentException();
            }
            this.f44069b = abstractC6095b;
            this.f44070c = dateTimeZone;
            this.f44071d = abstractC6097d;
            this.f44072e = abstractC6097d != null && abstractC6097d.mo12594s() < 43200000;
            this.f44073f = abstractC6097d2;
            this.f44074g = abstractC6097d3;
        }

        @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
        /* JADX INFO: renamed from: A */
        public final long mo12562A(long j10) {
            return this.f44069b.mo12562A(this.f44070c.m16021b(j10));
        }

        @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
        /* JADX INFO: renamed from: C */
        public final long mo12563C(long j10) {
            boolean z10 = this.f44072e;
            AbstractC6095b abstractC6095b = this.f44069b;
            if (z10) {
                long jM16080U = m16080U(j10);
                return abstractC6095b.mo12563C(j10 + jM16080U) - jM16080U;
            }
            DateTimeZone dateTimeZone = this.f44070c;
            return dateTimeZone.m16020a(abstractC6095b.mo12563C(dateTimeZone.m16021b(j10)), j10);
        }

        @Override // p163hp.AbstractC6095b
        /* JADX INFO: renamed from: D */
        public final long mo12564D(long j10) {
            boolean z10 = this.f44072e;
            AbstractC6095b abstractC6095b = this.f44069b;
            if (z10) {
                long jM16080U = m16080U(j10);
                return abstractC6095b.mo12564D(j10 + jM16080U) - jM16080U;
            }
            DateTimeZone dateTimeZone = this.f44070c;
            return dateTimeZone.m16020a(abstractC6095b.mo12564D(dateTimeZone.m16021b(j10)), j10);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p163hp.AbstractC6095b
        /* JADX INFO: renamed from: J */
        public final long mo12568J(int i10, long j10) {
            DateTimeZone dateTimeZone = this.f44070c;
            long jM16021b = dateTimeZone.m16021b(j10);
            AbstractC6095b abstractC6095b = this.f44069b;
            long jMo12568J = abstractC6095b.mo12568J(i10, jM16021b);
            long jM16020a = dateTimeZone.m16020a(jMo12568J, j10);
            if (mo12572b(jM16020a) == i10) {
                return jM16020a;
            }
            IllegalInstantException illegalInstantException = new IllegalInstantException(dateTimeZone.m16022h(), jMo12568J);
            IllegalFieldValueException illegalFieldValueException = new IllegalFieldValueException(abstractC6095b.mo12585w(), Integer.valueOf(i10), illegalInstantException.getMessage());
            illegalFieldValueException.initCause(illegalInstantException);
            throw illegalFieldValueException;
        }

        @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
        /* JADX INFO: renamed from: M */
        public final long mo12569M(long j10, String str, Locale locale) {
            DateTimeZone dateTimeZone = this.f44070c;
            return dateTimeZone.m16020a(this.f44069b.mo12569M(dateTimeZone.m16021b(j10), str, locale), j10);
        }

        /* JADX INFO: renamed from: U */
        public final int m16080U(long j10) {
            int iMo16025n = this.f44070c.mo16025n(j10);
            long j11 = iMo16025n;
            if (((j10 + j11) ^ j10) < 0 && (j10 ^ j11) >= 0) {
                throw new ArithmeticException("Adding time zone offset caused overflow");
            }
            return iMo16025n;
        }

        @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
        /* JADX INFO: renamed from: a */
        public final long mo12571a(int i10, long j10) {
            boolean z10 = this.f44072e;
            AbstractC6095b abstractC6095b = this.f44069b;
            if (z10) {
                long jM16080U = m16080U(j10);
                return abstractC6095b.mo12571a(i10, j10 + jM16080U) - jM16080U;
            }
            DateTimeZone dateTimeZone = this.f44070c;
            return dateTimeZone.m16020a(abstractC6095b.mo12571a(i10, dateTimeZone.m16021b(j10)), j10);
        }

        @Override // p163hp.AbstractC6095b
        /* JADX INFO: renamed from: b */
        public final int mo12572b(long j10) {
            return this.f44069b.mo12572b(this.f44070c.m16021b(j10));
        }

        @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
        /* JADX INFO: renamed from: c */
        public final String mo12573c(int i10, Locale locale) {
            return this.f44069b.mo12573c(i10, locale);
        }

        @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
        /* JADX INFO: renamed from: d */
        public final String mo12574d(long j10, Locale locale) {
            return this.f44069b.mo12574d(this.f44070c.m16021b(j10), locale);
        }

        @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
        /* JADX INFO: renamed from: e */
        public final String mo12575e(int i10, Locale locale) {
            return this.f44069b.mo12575e(i10, locale);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8107a)) {
                return false;
            }
            C8107a c8107a = (C8107a) obj;
            return this.f44069b.equals(c8107a.f44069b) && this.f44070c.equals(c8107a.f44070c) && this.f44071d.equals(c8107a.f44071d) && this.f44073f.equals(c8107a.f44073f);
        }

        @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
        /* JADX INFO: renamed from: h */
        public final String mo12576h(long j10, Locale locale) {
            return this.f44069b.mo12576h(this.f44070c.m16021b(j10), locale);
        }

        public final int hashCode() {
            return this.f44069b.hashCode() ^ this.f44070c.hashCode();
        }

        @Override // p163hp.AbstractC6095b
        /* JADX INFO: renamed from: j */
        public final AbstractC6097d mo12577j() {
            return this.f44071d;
        }

        @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
        /* JADX INFO: renamed from: k */
        public final AbstractC6097d mo12578k() {
            return this.f44074g;
        }

        @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
        /* JADX INFO: renamed from: l */
        public final int mo12579l(Locale locale) {
            return this.f44069b.mo12579l(locale);
        }

        @Override // p163hp.AbstractC6095b
        /* JADX INFO: renamed from: n */
        public final int mo12580n() {
            return this.f44069b.mo12580n();
        }

        @Override // p163hp.AbstractC6095b
        /* JADX INFO: renamed from: r */
        public final int mo12582r() {
            return this.f44069b.mo12582r();
        }

        @Override // p163hp.AbstractC6095b
        /* JADX INFO: renamed from: t */
        public final AbstractC6097d mo12584t() {
            return this.f44073f;
        }

        @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
        /* JADX INFO: renamed from: x */
        public final boolean mo12586x(long j10) {
            return this.f44069b.mo12586x(this.f44070c.m16021b(j10));
        }

        @Override // p163hp.AbstractC6095b
        /* JADX INFO: renamed from: y */
        public final boolean mo12587y() {
            return this.f44069b.mo12587y();
        }
    }

    public ZonedChronology(AbstractC6094a abstractC6094a, DateTimeZone dateTimeZone) {
        super(abstractC6094a, dateTimeZone);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: m0 */
    public static ZonedChronology m16075m0(AssembledChronology assembledChronology, DateTimeZone dateTimeZone) {
        if (assembledChronology == null) {
            throw new IllegalArgumentException("Must supply a chronology");
        }
        AbstractC6094a abstractC6094aMo12539a0 = assembledChronology.mo12539a0();
        if (abstractC6094aMo12539a0 == null) {
            throw new IllegalArgumentException("UTC chronology must not be null");
        }
        if (dateTimeZone != null) {
            return new ZonedChronology(abstractC6094aMo12539a0, dateTimeZone);
        }
        throw new IllegalArgumentException("DateTimeZone must not be null");
    }

    @Override // p163hp.AbstractC6094a
    /* JADX INFO: renamed from: b0 */
    public final AbstractC6094a mo12541b0(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.m16016e();
        }
        if (dateTimeZone == m16044i0()) {
            return this;
        }
        return dateTimeZone == DateTimeZone.f43949a ? m16043h0() : new ZonedChronology(m16043h0(), dateTimeZone);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZonedChronology)) {
            return false;
        }
        ZonedChronology zonedChronology = (ZonedChronology) obj;
        return m16043h0().equals(zonedChronology.m16043h0()) && mo12554q().equals(zonedChronology.mo12554q());
    }

    @Override // org.joda.time.chrono.AssembledChronology
    /* JADX INFO: renamed from: g0 */
    public final void mo16042g0(AssembledChronology.C8104a c8104a) {
        HashMap<Object, Object> map = new HashMap<>();
        c8104a.f44024l = m16077l0(c8104a.f44024l, map);
        c8104a.f44023k = m16077l0(c8104a.f44023k, map);
        c8104a.f44022j = m16077l0(c8104a.f44022j, map);
        c8104a.f44021i = m16077l0(c8104a.f44021i, map);
        c8104a.f44020h = m16077l0(c8104a.f44020h, map);
        c8104a.f44019g = m16077l0(c8104a.f44019g, map);
        c8104a.f44018f = m16077l0(c8104a.f44018f, map);
        c8104a.f44017e = m16077l0(c8104a.f44017e, map);
        c8104a.f44016d = m16077l0(c8104a.f44016d, map);
        c8104a.f44015c = m16077l0(c8104a.f44015c, map);
        c8104a.f44014b = m16077l0(c8104a.f44014b, map);
        c8104a.f44013a = m16077l0(c8104a.f44013a, map);
        c8104a.f44008E = m16076k0(c8104a.f44008E, map);
        c8104a.f44009F = m16076k0(c8104a.f44009F, map);
        c8104a.f44010G = m16076k0(c8104a.f44010G, map);
        c8104a.f44011H = m16076k0(c8104a.f44011H, map);
        c8104a.f44012I = m16076k0(c8104a.f44012I, map);
        c8104a.f44036x = m16076k0(c8104a.f44036x, map);
        c8104a.f44037y = m16076k0(c8104a.f44037y, map);
        c8104a.f44038z = m16076k0(c8104a.f44038z, map);
        c8104a.f44007D = m16076k0(c8104a.f44007D, map);
        c8104a.f44004A = m16076k0(c8104a.f44004A, map);
        c8104a.f44005B = m16076k0(c8104a.f44005B, map);
        c8104a.f44006C = m16076k0(c8104a.f44006C, map);
        c8104a.f44025m = m16076k0(c8104a.f44025m, map);
        c8104a.f44026n = m16076k0(c8104a.f44026n, map);
        c8104a.f44027o = m16076k0(c8104a.f44027o, map);
        c8104a.f44028p = m16076k0(c8104a.f44028p, map);
        c8104a.f44029q = m16076k0(c8104a.f44029q, map);
        c8104a.f44030r = m16076k0(c8104a.f44030r, map);
        c8104a.f44031s = m16076k0(c8104a.f44031s, map);
        c8104a.f44033u = m16076k0(c8104a.f44033u, map);
        c8104a.f44032t = m16076k0(c8104a.f44032t, map);
        c8104a.f44034v = m16076k0(c8104a.f44034v, map);
        c8104a.f44035w = m16076k0(c8104a.f44035w, map);
    }

    public final int hashCode() {
        return (m16043h0().hashCode() * 7) + (mo12554q().hashCode() * 11) + 326565;
    }

    /* JADX INFO: renamed from: k0 */
    public final AbstractC6095b m16076k0(AbstractC6095b abstractC6095b, HashMap<Object, Object> map) {
        if (abstractC6095b != null && abstractC6095b.mo12588z()) {
            if (map.containsKey(abstractC6095b)) {
                return (AbstractC6095b) map.get(abstractC6095b);
            }
            C8107a c8107a = new C8107a(abstractC6095b, mo12554q(), m16077l0(abstractC6095b.mo12577j(), map), m16077l0(abstractC6095b.mo12584t(), map), m16077l0(abstractC6095b.mo12578k(), map));
            map.put(abstractC6095b, c8107a);
            return c8107a;
        }
        return abstractC6095b;
    }

    /* JADX INFO: renamed from: l0 */
    public final AbstractC6097d m16077l0(AbstractC6097d abstractC6097d, HashMap<Object, Object> map) {
        if (abstractC6097d != null && abstractC6097d.mo12596w()) {
            if (map.containsKey(abstractC6097d)) {
                return (AbstractC6097d) map.get(abstractC6097d);
            }
            ZonedDurationField zonedDurationField = new ZonedDurationField(abstractC6097d, mo12554q());
            map.put(abstractC6097d, zonedDurationField);
            return zonedDurationField;
        }
        return abstractC6097d;
    }

    @Override // org.joda.time.chrono.AssembledChronology, p163hp.AbstractC6094a
    /* JADX INFO: renamed from: q */
    public final DateTimeZone mo12554q() {
        return (DateTimeZone) m16044i0();
    }

    public final String toString() {
        return "ZonedChronology[" + m16043h0() + ", " + mo12554q().m16022h() + ']';
    }
}
