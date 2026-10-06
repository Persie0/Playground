package p021j$.time.format;

import java.util.Locale;
import p021j$.time.C0417b;
import p021j$.time.C0459g;
import p021j$.time.C0468p;
import p021j$.time.C0471s;
import p021j$.time.Instant;
import p021j$.time.ZoneId;
import p021j$.time.chrono.C0426h;
import p021j$.time.chrono.InterfaceC0425g;
import p021j$.time.temporal.AbstractC0485n;
import p021j$.time.temporal.EnumC0472a;
import p021j$.time.temporal.InterfaceC0483l;
import p021j$.time.temporal.InterfaceC0486o;
import p021j$.time.temporal.TemporalAccessor;
import p021j$.time.zone.C0493c;
import p021j$.time.zone.C0494d;
import p021j$.util.Objects;

/* JADX INFO: renamed from: j$.time.format.w */
/* JADX INFO: loaded from: classes3.dex */
final class C0455w {

    /* JADX INFO: renamed from: a */
    private TemporalAccessor f32988a;

    /* JADX INFO: renamed from: b */
    private DateTimeFormatter f32989b;

    /* JADX INFO: renamed from: c */
    private int f32990c;

    /* JADX WARN: Code duplicated, block: B:38:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:63:0x010c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x00d1, please report this as an issue */
    C0455w(TemporalAccessor temporalAccessor, DateTimeFormatter dateTimeFormatter) {
        int i;
        ZoneId zoneIdM12490d;
        InterfaceC0425g interfaceC0425gM12269a = dateTimeFormatter.m12269a();
        ZoneId zoneIdM12272d = dateTimeFormatter.m12272d();
        if (interfaceC0425gM12269a != null || zoneIdM12272d != null) {
            InterfaceC0425g interfaceC0425g = (InterfaceC0425g) temporalAccessor.mo12253m(AbstractC0485n.m12439a());
            ZoneId zoneId = (ZoneId) temporalAccessor.mo12253m(AbstractC0485n.m12445g());
            C0459g c0459gM12325s = null;
            interfaceC0425gM12269a = Objects.equals(interfaceC0425gM12269a, interfaceC0425g) ? null : interfaceC0425gM12269a;
            zoneIdM12272d = Objects.equals(zoneIdM12272d, zoneId) ? null : zoneIdM12272d;
            if (interfaceC0425gM12269a != null || zoneIdM12272d != null) {
                InterfaceC0425g interfaceC0425g2 = interfaceC0425gM12269a != null ? interfaceC0425gM12269a : interfaceC0425g;
                if (zoneIdM12272d == null) {
                    zoneId = zoneIdM12272d != null ? zoneIdM12272d : zoneId;
                    if (interfaceC0425gM12269a != null) {
                        if (temporalAccessor.mo12248h(EnumC0472a.EPOCH_DAY)) {
                            ((C0426h) interfaceC0425g2).getClass();
                            c0459gM12325s = C0459g.m12325s(temporalAccessor);
                        } else if (interfaceC0425gM12269a == C0426h.f32915a || interfaceC0425g != null) {
                            for (EnumC0472a enumC0472a : EnumC0472a.values()) {
                                if (!enumC0472a.mo12422c() && temporalAccessor.mo12248h(enumC0472a)) {
                                    throw new C0417b("Unable to apply override chronology '" + String.valueOf(interfaceC0425gM12269a) + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + String.valueOf(temporalAccessor));
                                }
                            }
                        }
                    }
                    temporalAccessor = new C0454v(c0459gM12325s, temporalAccessor, interfaceC0425g2, zoneId);
                } else if (temporalAccessor.mo12248h(EnumC0472a.INSTANT_SECONDS)) {
                    temporalAccessor = C0471s.m12405r(Instant.m12241q(temporalAccessor), zoneIdM12272d);
                } else {
                    try {
                        C0493c c0493cMo12261r = zoneIdM12272d.mo12261r();
                        zoneIdM12490d = c0493cMo12261r.m12494i() ? c0493cMo12261r.m12490d(Instant.EPOCH) : zoneIdM12272d;
                    } catch (C0494d unused) {
                    }
                    if (zoneIdM12490d instanceof C0468p) {
                        EnumC0472a enumC0472a2 = EnumC0472a.OFFSET_SECONDS;
                        if (temporalAccessor.mo12248h(enumC0472a2) && temporalAccessor.mo12247f(enumC0472a2) != zoneIdM12272d.mo12261r().m12490d(Instant.EPOCH).m12402z()) {
                            throw new C0417b("Unable to apply override zone '" + String.valueOf(zoneIdM12272d) + "' because the temporal object being formatted has a different offset but does not represent an instant: " + String.valueOf(temporalAccessor));
                        }
                    }
                    if (zoneIdM12272d != null) {
                    }
                    if (interfaceC0425gM12269a != null) {
                        if (temporalAccessor.mo12248h(EnumC0472a.EPOCH_DAY)) {
                            ((C0426h) interfaceC0425g2).getClass();
                            c0459gM12325s = C0459g.m12325s(temporalAccessor);
                        } else if (interfaceC0425gM12269a == C0426h.f32915a) {
                            while (i < r2) {
                                if (!enumC0472a.mo12422c()) {
                                }
                            }
                        } else {
                            while (i < r2) {
                                if (!enumC0472a.mo12422c()) {
                                }
                            }
                        }
                    }
                    temporalAccessor = new C0454v(c0459gM12325s, temporalAccessor, interfaceC0425g2, zoneId);
                }
            }
        }
        this.f32988a = temporalAccessor;
        this.f32989b = dateTimeFormatter;
    }

    /* JADX INFO: renamed from: a */
    final void m12309a() {
        this.f32990c--;
    }

    /* JADX INFO: renamed from: b */
    final C0458z m12310b() {
        return this.f32989b.m12270b();
    }

    /* JADX INFO: renamed from: c */
    final Locale m12311c() {
        return this.f32989b.m12271c();
    }

    /* JADX INFO: renamed from: d */
    final TemporalAccessor m12312d() {
        return this.f32988a;
    }

    /* JADX INFO: renamed from: e */
    final Long m12313e(InterfaceC0483l interfaceC0483l) {
        if (this.f32990c <= 0 || this.f32988a.mo12248h(interfaceC0483l)) {
            return Long.valueOf(this.f32988a.mo12251k(interfaceC0483l));
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    final Object m12314f(InterfaceC0486o interfaceC0486o) {
        Object objMo12253m = this.f32988a.mo12253m(interfaceC0486o);
        if (objMo12253m != null || this.f32990c != 0) {
            return objMo12253m;
        }
        throw new C0417b("Unable to extract " + String.valueOf(interfaceC0486o) + " from temporal " + String.valueOf(this.f32988a));
    }

    /* JADX INFO: renamed from: g */
    final void m12315g() {
        this.f32990c++;
    }

    public final String toString() {
        return this.f32988a.toString();
    }
}
