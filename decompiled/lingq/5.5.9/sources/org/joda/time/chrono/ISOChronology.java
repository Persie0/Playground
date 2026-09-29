package org.joda.time.chrono;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.field.C8120c;
import org.joda.time.field.C8124g;
import p163hp.AbstractC6094a;

/* JADX INFO: loaded from: classes2.dex */
public final class ISOChronology extends AssembledChronology {

    /* JADX INFO: renamed from: e0 */
    public static final ISOChronology f44066e0;

    /* JADX INFO: renamed from: f0 */
    public static final ConcurrentHashMap<DateTimeZone, ISOChronology> f44067f0;
    private static final long serialVersionUID = -6212696554273812441L;

    public static final class Stub implements Serializable {
        private static final long serialVersionUID = -6212696554273812441L;

        /* JADX INFO: renamed from: a */
        public transient DateTimeZone f44068a;

        public Stub(DateTimeZone dateTimeZone) {
            this.f44068a = dateTimeZone;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            this.f44068a = (DateTimeZone) objectInputStream.readObject();
        }

        private Object readResolve() {
            return ISOChronology.m16074k0(this.f44068a);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.f44068a);
        }
    }

    static {
        ConcurrentHashMap<DateTimeZone, ISOChronology> concurrentHashMap = new ConcurrentHashMap<>();
        f44067f0 = concurrentHashMap;
        ISOChronology iSOChronology = new ISOChronology(GregorianChronology.f44064B0);
        f44066e0 = iSOChronology;
        concurrentHashMap.put(DateTimeZone.f43949a, iSOChronology);
    }

    public ISOChronology(AssembledChronology assembledChronology) {
        super(assembledChronology, null);
    }

    /* JADX INFO: renamed from: k0 */
    public static ISOChronology m16074k0(DateTimeZone dateTimeZone) {
        ISOChronology iSOChronologyPutIfAbsent;
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.m16016e();
        }
        ConcurrentHashMap<DateTimeZone, ISOChronology> concurrentHashMap = f44067f0;
        ISOChronology iSOChronology = concurrentHashMap.get(dateTimeZone);
        if (iSOChronology == null && (iSOChronologyPutIfAbsent = concurrentHashMap.putIfAbsent(dateTimeZone, (iSOChronology = new ISOChronology(ZonedChronology.m16075m0(f44066e0, dateTimeZone))))) != null) {
            iSOChronology = iSOChronologyPutIfAbsent;
        }
        return iSOChronology;
    }

    private Object writeReplace() {
        return new Stub(mo12554q());
    }

    @Override // org.joda.time.chrono.AssembledChronology, p163hp.AbstractC6094a
    /* JADX INFO: renamed from: a0 */
    public final AbstractC6094a mo12539a0() {
        return f44066e0;
    }

    @Override // p163hp.AbstractC6094a
    /* JADX INFO: renamed from: b0 */
    public final AbstractC6094a mo12541b0(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.m16016e();
        }
        return dateTimeZone == mo12554q() ? this : m16074k0(dateTimeZone);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ISOChronology) {
            return mo12554q().equals(((ISOChronology) obj).mo12554q());
        }
        return false;
    }

    @Override // org.joda.time.chrono.AssembledChronology
    /* JADX INFO: renamed from: g0 */
    public final void mo16042g0(AssembledChronology.C8104a c8104a) {
        if (m16043h0().mo12554q() == DateTimeZone.f43949a) {
            C8117j c8117j = C8117j.f44100c;
            DateTimeFieldType dateTimeFieldType = DateTimeFieldType.f43936a;
            C8120c c8120c = new C8120c(c8117j);
            c8104a.f44011H = c8120c;
            c8104a.f44023k = c8120c.f44109d;
            c8104a.f44010G = new C8124g(c8120c, DateTimeFieldType.f43939d);
            c8104a.f44006C = new C8124g((C8120c) c8104a.f44011H, c8104a.f44020h, DateTimeFieldType.f43944i);
        }
    }

    public final int hashCode() {
        return mo12554q().hashCode() + 800855;
    }

    public final String toString() {
        DateTimeZone dateTimeZoneMo12554q = mo12554q();
        if (dateTimeZoneMo12554q == null) {
            return "ISOChronology";
        }
        return "ISOChronology[" + dateTimeZoneMo12554q.m16022h() + ']';
    }
}
