package p021j$.time.temporal;

import p021j$.time.C0459g;
import p021j$.time.C0463k;
import p021j$.time.C0468p;
import p021j$.time.ZoneId;
import p021j$.time.chrono.InterfaceC0425g;

/* JADX INFO: renamed from: j$.time.temporal.m */
/* JADX INFO: loaded from: classes3.dex */
final class C0484m implements InterfaceC0486o {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33060a;

    public /* synthetic */ C0484m(int i) {
        this.f33060a = i;
    }

    @Override // p021j$.time.temporal.InterfaceC0486o
    /* JADX INFO: renamed from: a */
    public final Object mo12274a(TemporalAccessor temporalAccessor) {
        switch (this.f33060a) {
            case 0:
                return m12438b(temporalAccessor);
            case 1:
                return (InterfaceC0425g) temporalAccessor.mo12253m(AbstractC0485n.f33062b);
            case 2:
                return (TemporalUnit) temporalAccessor.mo12253m(AbstractC0485n.f33063c);
            case 3:
                EnumC0472a enumC0472a = EnumC0472a.OFFSET_SECONDS;
                if (temporalAccessor.mo12248h(enumC0472a)) {
                    return C0468p.m12399C(temporalAccessor.mo12247f(enumC0472a));
                }
                return null;
            case 4:
                return m12438b(temporalAccessor);
            case 5:
                EnumC0472a enumC0472a2 = EnumC0472a.EPOCH_DAY;
                if (temporalAccessor.mo12248h(enumC0472a2)) {
                    return C0459g.m12323J(temporalAccessor.mo12251k(enumC0472a2));
                }
                return null;
            default:
                EnumC0472a enumC0472a3 = EnumC0472a.NANO_OF_DAY;
                if (temporalAccessor.mo12248h(enumC0472a3)) {
                    return C0463k.m12371C(temporalAccessor.mo12251k(enumC0472a3));
                }
                return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final ZoneId m12438b(TemporalAccessor temporalAccessor) {
        InterfaceC0486o interfaceC0486o = AbstractC0485n.f33061a;
        switch (this.f33060a) {
            case 0:
                return (ZoneId) temporalAccessor.mo12253m(interfaceC0486o);
            default:
                ZoneId zoneId = (ZoneId) temporalAccessor.mo12253m(interfaceC0486o);
                return zoneId != null ? zoneId : (ZoneId) temporalAccessor.mo12253m(AbstractC0485n.f33064d);
        }
    }

    public final String toString() {
        switch (this.f33060a) {
            case 0:
                return "ZoneId";
            case 1:
                return "Chronology";
            case 2:
                return "Precision";
            case 3:
                return "ZoneOffset";
            case 4:
                return "Zone";
            case 5:
                return "LocalDate";
            default:
                return "LocalTime";
        }
    }
}
