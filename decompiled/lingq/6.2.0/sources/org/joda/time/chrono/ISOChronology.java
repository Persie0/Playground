package org.joda.time.chrono;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import p000.C3847zv;
import p000.gi2;
import p000.iy3;
import p000.s11;
import p000.u48;

/* JADX INFO: loaded from: classes.dex */
public final class ISOChronology extends AssembledChronology {

    /* JADX INFO: renamed from: e0 */
    public static final ISOChronology f54908e0;

    /* JADX INFO: renamed from: f0 */
    public static final ConcurrentHashMap f54909f0;
    private static final long serialVersionUID = -6212696554273812441L;

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Stub implements Serializable {
        private static final long serialVersionUID = -6212696554273812441L;

        /* JADX INFO: renamed from: a */
        public transient DateTimeZone f54910a;

        public Stub(DateTimeZone dateTimeZone) {
            this.f54910a = dateTimeZone;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            this.f54910a = (DateTimeZone) objectInputStream.readObject();
        }

        private Object readResolve() {
            return ISOChronology.m18438R(this.f54910a);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.f54910a);
        }
    }

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f54909f0 = concurrentHashMap;
        ISOChronology iSOChronology = new ISOChronology(GregorianChronology.f54906A0, null);
        f54908e0 = iSOChronology;
        concurrentHashMap.put(DateTimeZone.f54829a, iSOChronology);
    }

    /* JADX INFO: renamed from: Q */
    public static ISOChronology m18437Q() {
        return m18438R(DateTimeZone.m18340f());
    }

    /* JADX INFO: renamed from: R */
    public static ISOChronology m18438R(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.m18340f();
        }
        ConcurrentHashMap concurrentHashMap = f54909f0;
        ISOChronology iSOChronology = (ISOChronology) concurrentHashMap.get(dateTimeZone);
        if (iSOChronology == null) {
            iSOChronology = new ISOChronology(ZonedChronology.m18439S(f54908e0, dateTimeZone), null);
            ISOChronology iSOChronology2 = (ISOChronology) concurrentHashMap.putIfAbsent(dateTimeZone, iSOChronology);
            if (iSOChronology2 != null) {
                return iSOChronology2;
            }
        }
        return iSOChronology;
    }

    private Object writeReplace() {
        return new Stub(mo18360k());
    }

    @Override // org.joda.time.chrono.AssembledChronology, p000.s11
    /* JADX INFO: renamed from: G */
    public final s11 mo18358G() {
        return f54908e0;
    }

    @Override // p000.s11
    /* JADX INFO: renamed from: H */
    public final s11 mo18359H(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.m18340f();
        }
        return dateTimeZone == mo18360k() ? this : m18438R(dateTimeZone);
    }

    @Override // org.joda.time.chrono.AssembledChronology
    /* JADX INFO: renamed from: M */
    public final void mo18390M(C3847zv c3847zv) {
        if (m18391N().mo18360k() == DateTimeZone.f54829a) {
            iy3 iy3Var = iy3.f44757c;
            DateTimeFieldType dateTimeFieldType = DateTimeFieldType.f54816a;
            gi2 gi2Var = new gi2(iy3Var);
            c3847zv.f72222H = gi2Var;
            c3847zv.f72234k = gi2Var.f40847d;
            c3847zv.f72221G = new u48(gi2Var, gi2Var.f57184b.mo4682i(), DateTimeFieldType.f54819d);
            c3847zv.f72217C = new u48((gi2) c3847zv.f72222H, c3847zv.f72231h, DateTimeFieldType.f54824i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ISOChronology) {
            return mo18360k().equals(((ISOChronology) obj).mo18360k());
        }
        return false;
    }

    public final int hashCode() {
        return mo18360k().hashCode() + 800855;
    }

    public final String toString() {
        DateTimeZone dateTimeZoneMo18360k = mo18360k();
        if (dateTimeZoneMo18360k == null) {
            return "ISOChronology";
        }
        return "ISOChronology[" + dateTimeZoneMo18360k.m18348g() + ']';
    }
}
