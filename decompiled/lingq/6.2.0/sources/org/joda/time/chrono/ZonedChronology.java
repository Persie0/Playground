package org.joda.time.chrono;

import java.util.HashMap;
import org.joda.time.DateTimeZone;
import org.joda.time.field.BaseDurationField;
import p000.C3386nv;
import p000.C3847zv;
import p000.ecb;
import p000.en2;
import p000.f12;
import p000.ij6;
import p000.s11;

/* JADX INFO: loaded from: classes.dex */
public final class ZonedChronology extends AssembledChronology {
    private static final long serialVersionUID = -1079258847191166848L;

    public static class ZonedDurationField extends BaseDurationField {
        private static final long serialVersionUID = -485345310999208286L;
        final en2 iField;
        final boolean iTimeField;
        final DateTimeZone iZone;

        public ZonedDurationField(en2 en2Var, DateTimeZone dateTimeZone) {
            super(en2Var.mo11270c());
            if (!en2Var.mo11273f()) {
                ij6.m13959q();
                throw null;
            }
            this.iField = en2Var;
            this.iTimeField = en2Var.mo11271d() < 43200000;
            this.iZone = dateTimeZone;
        }

        @Override // p000.en2
        /* JADX INFO: renamed from: a */
        public final long mo11268a(int i, long j) {
            int iM18443i = m18443i(j);
            long jMo11268a = this.iField.mo11268a(i, j + ((long) iM18443i));
            if (!this.iTimeField) {
                iM18443i = m18442h(jMo11268a);
            }
            return jMo11268a - ((long) iM18443i);
        }

        @Override // p000.en2
        /* JADX INFO: renamed from: b */
        public final long mo11269b(long j, long j2) {
            int iM18443i = m18443i(j);
            long jMo11269b = this.iField.mo11269b(j + ((long) iM18443i), j2);
            if (!this.iTimeField) {
                iM18443i = m18442h(jMo11269b);
            }
            return jMo11269b - ((long) iM18443i);
        }

        @Override // p000.en2
        /* JADX INFO: renamed from: d */
        public final long mo11271d() {
            return this.iField.mo11271d();
        }

        @Override // p000.en2
        /* JADX INFO: renamed from: e */
        public final boolean mo11272e() {
            boolean z = this.iTimeField;
            en2 en2Var = this.iField;
            if (z) {
                return en2Var.mo11272e();
            }
            return en2Var.mo11272e() && this.iZone.mo18355p();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ZonedDurationField) {
                ZonedDurationField zonedDurationField = (ZonedDurationField) obj;
                if (this.iField.equals(zonedDurationField.iField) && this.iZone.equals(zonedDurationField.iZone)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: h */
        public final int m18442h(long j) {
            int iMo18352l = this.iZone.mo18352l(j);
            long j2 = iMo18352l;
            if (((j - j2) ^ j) >= 0 || (j ^ j2) >= 0) {
                return iMo18352l;
            }
            throw new ArithmeticException("Subtracting time zone offset caused overflow");
        }

        public final int hashCode() {
            return this.iZone.hashCode() ^ this.iField.hashCode();
        }

        /* JADX INFO: renamed from: i */
        public final int m18443i(long j) {
            int iMo18351k = this.iZone.mo18351k(j);
            long j2 = iMo18351k;
            if (((j + j2) ^ j) >= 0 || (j ^ j2) < 0) {
                return iMo18351k;
            }
            throw new ArithmeticException("Adding time zone offset caused overflow");
        }
    }

    /* JADX INFO: renamed from: S */
    public static ZonedChronology m18439S(s11 s11Var, DateTimeZone dateTimeZone) {
        if (s11Var == null) {
            C3386nv.m17626m("Must supply a chronology");
            return null;
        }
        s11 s11VarMo18358G = s11Var.mo18358G();
        if (s11VarMo18358G == null) {
            C3386nv.m17626m("UTC chronology must not be null");
            return null;
        }
        if (dateTimeZone != null) {
            return new ZonedChronology(s11VarMo18358G, dateTimeZone);
        }
        C3386nv.m17626m("DateTimeZone must not be null");
        return null;
    }

    @Override // p000.s11
    /* JADX INFO: renamed from: H */
    public final s11 mo18359H(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.m18340f();
        }
        if (dateTimeZone == m18392O()) {
            return this;
        }
        return dateTimeZone == DateTimeZone.f54829a ? m18391N() : new ZonedChronology(m18391N(), dateTimeZone);
    }

    @Override // org.joda.time.chrono.AssembledChronology
    /* JADX INFO: renamed from: M */
    public final void mo18390M(C3847zv c3847zv) {
        HashMap map = new HashMap();
        c3847zv.f72235l = m18441R(c3847zv.f72235l, map);
        c3847zv.f72234k = m18441R(c3847zv.f72234k, map);
        c3847zv.f72233j = m18441R(c3847zv.f72233j, map);
        c3847zv.f72232i = m18441R(c3847zv.f72232i, map);
        c3847zv.f72231h = m18441R(c3847zv.f72231h, map);
        c3847zv.f72230g = m18441R(c3847zv.f72230g, map);
        c3847zv.f72229f = m18441R(c3847zv.f72229f, map);
        c3847zv.f72228e = m18441R(c3847zv.f72228e, map);
        c3847zv.f72227d = m18441R(c3847zv.f72227d, map);
        c3847zv.f72226c = m18441R(c3847zv.f72226c, map);
        c3847zv.f72225b = m18441R(c3847zv.f72225b, map);
        c3847zv.f72224a = m18441R(c3847zv.f72224a, map);
        c3847zv.f72219E = m18440Q(c3847zv.f72219E, map);
        c3847zv.f72220F = m18440Q(c3847zv.f72220F, map);
        c3847zv.f72221G = m18440Q(c3847zv.f72221G, map);
        c3847zv.f72222H = m18440Q(c3847zv.f72222H, map);
        c3847zv.f72223I = m18440Q(c3847zv.f72223I, map);
        c3847zv.f72247x = m18440Q(c3847zv.f72247x, map);
        c3847zv.f72248y = m18440Q(c3847zv.f72248y, map);
        c3847zv.f72249z = m18440Q(c3847zv.f72249z, map);
        c3847zv.f72218D = m18440Q(c3847zv.f72218D, map);
        c3847zv.f72215A = m18440Q(c3847zv.f72215A, map);
        c3847zv.f72216B = m18440Q(c3847zv.f72216B, map);
        c3847zv.f72217C = m18440Q(c3847zv.f72217C, map);
        c3847zv.f72236m = m18440Q(c3847zv.f72236m, map);
        c3847zv.f72237n = m18440Q(c3847zv.f72237n, map);
        c3847zv.f72238o = m18440Q(c3847zv.f72238o, map);
        c3847zv.f72239p = m18440Q(c3847zv.f72239p, map);
        c3847zv.f72240q = m18440Q(c3847zv.f72240q, map);
        c3847zv.f72241r = m18440Q(c3847zv.f72241r, map);
        c3847zv.f72242s = m18440Q(c3847zv.f72242s, map);
        c3847zv.f72244u = m18440Q(c3847zv.f72244u, map);
        c3847zv.f72243t = m18440Q(c3847zv.f72243t, map);
        c3847zv.f72245v = m18440Q(c3847zv.f72245v, map);
        c3847zv.f72246w = m18440Q(c3847zv.f72246w, map);
    }

    /* JADX INFO: renamed from: Q */
    public final f12 m18440Q(f12 f12Var, HashMap map) {
        if (f12Var == null || !f12Var.mo11492u()) {
            return f12Var;
        }
        if (map.containsKey(f12Var)) {
            return (f12) map.get(f12Var);
        }
        ecb ecbVar = new ecb(f12Var, (DateTimeZone) m18392O(), m18441R(f12Var.mo4682i(), map), m18441R(f12Var.mo3736q(), map), m18441R(f12Var.mo11036j(), map));
        map.put(f12Var, ecbVar);
        return ecbVar;
    }

    /* JADX INFO: renamed from: R */
    public final en2 m18441R(en2 en2Var, HashMap map) {
        if (en2Var == null || !en2Var.mo11273f()) {
            return en2Var;
        }
        if (map.containsKey(en2Var)) {
            return (en2) map.get(en2Var);
        }
        ZonedDurationField zonedDurationField = new ZonedDurationField(en2Var, (DateTimeZone) m18392O());
        map.put(en2Var, zonedDurationField);
        return zonedDurationField;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZonedChronology)) {
            return false;
        }
        ZonedChronology zonedChronology = (ZonedChronology) obj;
        return m18391N().equals(zonedChronology.m18391N()) && ((DateTimeZone) m18392O()).equals((DateTimeZone) zonedChronology.m18392O());
    }

    public final int hashCode() {
        return (m18391N().hashCode() * 7) + (((DateTimeZone) m18392O()).hashCode() * 11) + 326565;
    }

    @Override // org.joda.time.chrono.AssembledChronology, p000.s11
    /* JADX INFO: renamed from: k */
    public final DateTimeZone mo18360k() {
        return (DateTimeZone) m18392O();
    }

    public final String toString() {
        return "ZonedChronology[" + m18391N() + ", " + ((DateTimeZone) m18392O()).m18348g() + ']';
    }
}
