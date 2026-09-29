package org.joda.time.chrono;

import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.field.MillisDurationField;
import p000.C3386nv;
import p000.C3847zv;
import p000.en2;
import p000.f12;
import p000.gi2;
import p000.hq6;
import p000.s11;
import p000.u48;
import p000.ux5;

/* JADX INFO: loaded from: classes.dex */
public final class GregorianChronology extends BasicGJChronology {
    private static final long serialVersionUID = -861407383323710522L;

    /* JADX INFO: renamed from: B0 */
    public static final ConcurrentHashMap f54907B0 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: A0 */
    public static final GregorianChronology f54906A0 = m18436h0(DateTimeZone.f54829a, 4);

    /* JADX INFO: renamed from: h0 */
    public static GregorianChronology m18436h0(DateTimeZone dateTimeZone, int i) {
        GregorianChronology gregorianChronology;
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.m18340f();
        }
        ConcurrentHashMap concurrentHashMap = f54907B0;
        GregorianChronology[] gregorianChronologyArr = (GregorianChronology[]) concurrentHashMap.get(dateTimeZone);
        if (gregorianChronologyArr == null) {
            gregorianChronologyArr = new GregorianChronology[7];
            GregorianChronology[] gregorianChronologyArr2 = (GregorianChronology[]) concurrentHashMap.putIfAbsent(dateTimeZone, gregorianChronologyArr);
            if (gregorianChronologyArr2 != null) {
                gregorianChronologyArr = gregorianChronologyArr2;
            }
        }
        int i2 = i - 1;
        try {
            GregorianChronology gregorianChronology2 = gregorianChronologyArr[i2];
            if (gregorianChronology2 != null) {
                return gregorianChronology2;
            }
            synchronized (gregorianChronologyArr) {
                try {
                    gregorianChronology = gregorianChronologyArr[i2];
                    if (gregorianChronology == null) {
                        DateTimeZone dateTimeZone2 = DateTimeZone.f54829a;
                        gregorianChronology = dateTimeZone == dateTimeZone2 ? new GregorianChronology(null, i) : new GregorianChronology(ZonedChronology.m18439S(m18436h0(dateTimeZone2, i), dateTimeZone), i);
                        gregorianChronologyArr[i2] = gregorianChronology;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return gregorianChronology;
        } catch (ArrayIndexOutOfBoundsException unused) {
            C3386nv.m17626m(ux5.m22988k(i, "Invalid min days in first week: "));
            return null;
        }
    }

    private Object readResolve() {
        s11 s11VarM18391N = m18391N();
        int iM18423U = super.m18423U();
        if (iM18423U == 0) {
            iM18423U = 4;
        }
        return s11VarM18391N == null ? m18436h0(DateTimeZone.f54829a, iM18423U) : m18436h0(s11VarM18391N.mo18360k(), iM18423U);
    }

    @Override // org.joda.time.chrono.AssembledChronology, p000.s11
    /* JADX INFO: renamed from: G */
    public final s11 mo18358G() {
        return f54906A0;
    }

    @Override // p000.s11
    /* JADX INFO: renamed from: H */
    public final s11 mo18359H(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.m18340f();
        }
        return dateTimeZone == mo18360k() ? this : m18436h0(dateTimeZone, 4);
    }

    @Override // org.joda.time.chrono.AssembledChronology
    /* JADX INFO: renamed from: M */
    public final void mo18390M(C3847zv c3847zv) {
        if (m18391N() == null) {
            c3847zv.f72224a = MillisDurationField.f54920a;
            c3847zv.f72225b = BasicChronology.f54884f0;
            c3847zv.f72226c = BasicChronology.f54885g0;
            c3847zv.f72227d = BasicChronology.f54886h0;
            c3847zv.f72228e = BasicChronology.f54887i0;
            c3847zv.f72229f = BasicChronology.f54888j0;
            c3847zv.f72230g = BasicChronology.f54889k0;
            c3847zv.f72236m = BasicChronology.f54890l0;
            c3847zv.f72237n = BasicChronology.f54891m0;
            c3847zv.f72238o = BasicChronology.f54892n0;
            c3847zv.f72239p = BasicChronology.f54893o0;
            c3847zv.f72240q = BasicChronology.f54894p0;
            c3847zv.f72241r = BasicChronology.f54895q0;
            c3847zv.f72242s = BasicChronology.f54896r0;
            c3847zv.f72244u = BasicChronology.f54897s0;
            c3847zv.f72243t = BasicChronology.f54898t0;
            c3847zv.f72245v = BasicChronology.f54899u0;
            c3847zv.f72246w = BasicChronology.f54900v0;
            C3427c c3427c = new C3427c(this, 1);
            c3847zv.f72219E = c3427c;
            C3430f c3430f = new C3430f(c3427c, this);
            c3847zv.f72220F = c3430f;
            hq6 hq6Var = new hq6(c3430f, DateTimeFieldType.f54817b, 99);
            DateTimeFieldType dateTimeFieldType = DateTimeFieldType.f54816a;
            gi2 gi2Var = new gi2(hq6Var);
            c3847zv.f72222H = gi2Var;
            c3847zv.f72234k = gi2Var.f40847d;
            c3847zv.f72221G = new hq6(new u48(gi2Var, gi2Var.f57184b.mo4682i(), gi2Var.f66506a), DateTimeFieldType.f54819d, 1);
            c3847zv.f72223I = new C3428d(this);
            c3847zv.f72247x = new C3426b(this, c3847zv.f72229f, 3);
            c3847zv.f72248y = new C3426b(this, c3847zv.f72229f, 0);
            c3847zv.f72249z = new C3426b(this, c3847zv.f72229f, 1);
            c3847zv.f72218D = new C3429e(this);
            c3847zv.f72216B = new C3427c(this, 0);
            c3847zv.f72215A = new C3426b(this, c3847zv.f72230g, 2);
            f12 f12Var = c3847zv.f72216B;
            en2 en2Var = c3847zv.f72234k;
            c3847zv.f72217C = new hq6(new u48(f12Var, en2Var), DateTimeFieldType.f54824i, 1);
            c3847zv.f72233j = c3847zv.f72219E.mo4682i();
            c3847zv.f72232i = c3847zv.f72218D.mo4682i();
            c3847zv.f72231h = c3847zv.f72216B.mo4682i();
        }
    }

    @Override // org.joda.time.chrono.BasicChronology
    /* JADX INFO: renamed from: c0 */
    public final boolean mo18431c0(int i) {
        if ((i & 3) == 0) {
            return i % 100 != 0 || i % 400 == 0;
        }
        return false;
    }

    @Override // org.joda.time.chrono.BasicChronology, org.joda.time.chrono.AssembledChronology, p000.s11
    /* JADX INFO: renamed from: k */
    public final DateTimeZone mo18360k() {
        s11 s11VarM18391N = m18391N();
        return s11VarM18391N != null ? s11VarM18391N.mo18360k() : DateTimeZone.f54829a;
    }
}
