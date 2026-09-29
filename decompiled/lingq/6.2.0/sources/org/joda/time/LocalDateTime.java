package org.joda.time;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.time.chrono.ISOChronology;
import p000.C3386nv;
import p000.b22;
import p000.hy3;
import p000.ir7;
import p000.k12;
import p000.nc3;
import p000.p90;
import p000.s11;
import p000.s94;
import p000.t22;
import p000.ux5;
import p000.v63;

/* JADX INFO: loaded from: classes3.dex */
public final class LocalDateTime extends p90 implements Serializable {
    private static final long serialVersionUID = -268716875315837168L;
    private final s11 iChronology;
    private final long iLocalMillis;

    public LocalDateTime(long j, s11 s11Var) {
        AtomicReference atomicReference = t22.f61763a;
        s11Var = s11Var == null ? ISOChronology.m18437Q() : s11Var;
        DateTimeZone dateTimeZoneMo18360k = s11Var.mo18360k();
        DateTimeZone dateTimeZoneM18340f = DateTimeZone.f54829a;
        dateTimeZoneMo18360k.getClass();
        dateTimeZoneM18340f = dateTimeZoneM18340f == null ? DateTimeZone.m18340f() : dateTimeZoneM18340f;
        this.iLocalMillis = dateTimeZoneM18340f != dateTimeZoneMo18360k ? dateTimeZoneM18340f.m18346a(dateTimeZoneMo18360k.m18347b(j), j) : j;
        this.iChronology = s11Var.mo18358G();
    }

    /* JADX INFO: renamed from: g */
    public static LocalDateTime m18367g(String str) {
        k12 k12Var = hy3.f43183g0;
        s94 s94Var = k12Var.f46545b;
        if (s94Var == null) {
            C3386nv.m17636w("Parsing not supported");
            return null;
        }
        s11 s11VarMo18358G = k12Var.m14768c(null).mo18358G();
        b22 b22Var = new b22(s11VarMo18358G, k12Var.f46546c);
        int into = s94Var.parseInto(b22Var, str, 0);
        if (into < 0) {
            into = ~into;
        } else if (into >= str.length()) {
            long jM3181b = b22Var.m3181b(str);
            Integer num = b22Var.f7785e;
            if (num != null) {
                s11VarMo18358G = s11VarMo18358G.mo18359H(DateTimeZone.m18338d(num.intValue()));
            } else {
                DateTimeZone dateTimeZone = b22Var.f7784d;
                if (dateTimeZone != null) {
                    s11VarMo18358G = s11VarMo18358G.mo18359H(dateTimeZone);
                }
            }
            return new LocalDateTime(jM3181b, s11VarMo18358G);
        }
        C3386nv.m17626m(nc3.m17347c(into, str));
        return null;
    }

    private Object readResolve() {
        s11 s11Var = this.iChronology;
        if (s11Var == null) {
            return new LocalDateTime(this.iLocalMillis, ISOChronology.f54908e0);
        }
        DateTimeZone dateTimeZone = DateTimeZone.f54829a;
        DateTimeZone dateTimeZoneMo18360k = s11Var.mo18360k();
        ((UTCDateTimeZone) dateTimeZone).getClass();
        return !(dateTimeZoneMo18360k instanceof UTCDateTimeZone) ? new LocalDateTime(this.iLocalMillis, this.iChronology.mo18358G()) : this;
    }

    /* JADX INFO: renamed from: b */
    public final int m18368b(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return dateTimeFieldType.mo18335b(this.iChronology).mo3734b(this.iLocalMillis);
        }
        C3386nv.m17626m("The DateTimeFieldType must not be null");
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final s11 m18369c() {
        return this.iChronology;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0023 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0026  */
    /* JADX WARN: Code duplicated, block: B:19:0x002d  */
    /* JADX WARN: Code duplicated, block: B:21:0x003a A[LOOP:0: B:17:0x002a->B:21:0x003a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063 A[LOOP:1: B:25:0x0046->B:34:0x0063, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x003d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0061 A[SYNTHETIC] */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i;
        int i2;
        LocalDateTime localDateTime;
        ir7 ir7Var = (ir7) obj;
        if (this != ir7Var) {
            if (ir7Var instanceof LocalDateTime) {
                LocalDateTime localDateTime2 = (LocalDateTime) ir7Var;
                if (this.iChronology.equals(localDateTime2.iChronology)) {
                    long j = this.iLocalMillis;
                    long j2 = localDateTime2.iLocalMillis;
                    if (j < j2) {
                        return -1;
                    }
                    if (j != j2) {
                        return 1;
                    }
                } else if (this != ir7Var) {
                    ir7Var.getClass();
                    for (i = 0; i < 4; i++) {
                        if (m18991a(i) == ((p90) ir7Var).m18991a(i)) {
                            throw new ClassCastException("ReadablePartial objects must have matching field types");
                        }
                    }
                    for (i2 = 0; i2 < 4; i2++) {
                        localDateTime = (LocalDateTime) ir7Var;
                        if (m18370d(i2) > localDateTime.m18370d(i2)) {
                            return 1;
                        }
                        if (m18370d(i2) < localDateTime.m18370d(i2)) {
                            return -1;
                        }
                    }
                }
            } else if (this != ir7Var) {
                ir7Var.getClass();
                while (i < 4) {
                    if (m18991a(i) == ((p90) ir7Var).m18991a(i)) {
                        throw new ClassCastException("ReadablePartial objects must have matching field types");
                    }
                }
                while (i2 < 4) {
                    localDateTime = (LocalDateTime) ir7Var;
                    if (m18370d(i2) > localDateTime.m18370d(i2)) {
                        return 1;
                    }
                    if (m18370d(i2) < localDateTime.m18370d(i2)) {
                        return -1;
                    }
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m18370d(int i) {
        if (i == 0) {
            return this.iChronology.mo18386I().mo3734b(this.iLocalMillis);
        }
        if (i == 1) {
            return this.iChronology.mo18415w().mo3734b(this.iLocalMillis);
        }
        if (i == 2) {
            return this.iChronology.mo18398e().mo3734b(this.iLocalMillis);
        }
        if (i == 3) {
            return this.iChronology.mo18410r().mo3734b(this.iLocalMillis);
        }
        v63.m23143u(ux5.m22988k(i, "Invalid index: "));
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m18371e(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            return false;
        }
        return dateTimeFieldType.mo18335b(this.iChronology).mo11492u();
    }

    @Override // p000.p90
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.iChronology.equals(localDateTime.iChronology)) {
                return this.iLocalMillis == localDateTime.iLocalMillis;
            }
        }
        return super.equals(obj);
    }

    /* JADX INFO: renamed from: f */
    public final LocalDateTime m18372f(int i) {
        if (i != 0) {
            long jM11274g = this.iChronology.mo18401h().m11274g(i, this.iLocalMillis);
            if (jM11274g != this.iLocalMillis) {
                return new LocalDateTime(jM11274g, this.iChronology);
            }
        }
        return this;
    }

    public final int hashCode() {
        return this.iChronology.hashCode() + this.iChronology.mo18410r().mo11491r().hashCode() + ((this.iChronology.mo18410r().mo3734b(this.iLocalMillis) + ((this.iChronology.mo18398e().mo11491r().hashCode() + ((this.iChronology.mo18398e().mo3734b(this.iLocalMillis) + ((this.iChronology.mo18415w().mo11491r().hashCode() + ((this.iChronology.mo18415w().mo3734b(this.iLocalMillis) + ((this.iChronology.mo18386I().mo11491r().hashCode() + ((this.iChronology.mo18386I().mo3734b(this.iLocalMillis) + 3611) * 23)) * 23)) * 23)) * 23)) * 23)) * 23)) * 23);
    }

    public final String toString() {
        return hy3.f43148E.m14767b(this);
    }
}
