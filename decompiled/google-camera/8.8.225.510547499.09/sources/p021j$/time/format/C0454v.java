package p021j$.time.format;

import p021j$.p024io.AbstractC0304a;
import p021j$.time.C0459g;
import p021j$.time.ZoneId;
import p021j$.time.chrono.InterfaceC0420b;
import p021j$.time.chrono.InterfaceC0425g;
import p021j$.time.temporal.AbstractC0485n;
import p021j$.time.temporal.C0488q;
import p021j$.time.temporal.InterfaceC0483l;
import p021j$.time.temporal.InterfaceC0486o;
import p021j$.time.temporal.TemporalAccessor;

/* JADX INFO: renamed from: j$.time.format.v */
/* JADX INFO: loaded from: classes3.dex */
final class C0454v implements TemporalAccessor {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ InterfaceC0420b f32984a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ TemporalAccessor f32985b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ InterfaceC0425g f32986c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ ZoneId f32987d;

    C0454v(C0459g c0459g, TemporalAccessor temporalAccessor, InterfaceC0425g interfaceC0425g, ZoneId zoneId) {
        this.f32984a = c0459g;
        this.f32985b = temporalAccessor;
        this.f32986c = interfaceC0425g;
        this.f32987d = zoneId;
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int mo12247f(InterfaceC0483l interfaceC0483l) {
        return AbstractC0304a.m12049a(this, interfaceC0483l);
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: h */
    public final boolean mo12248h(InterfaceC0483l interfaceC0483l) {
        InterfaceC0420b interfaceC0420b = this.f32984a;
        return (interfaceC0420b == null || !interfaceC0483l.mo12422c()) ? this.f32985b.mo12248h(interfaceC0483l) : ((C0459g) interfaceC0420b).mo12248h(interfaceC0483l);
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: j */
    public final C0488q mo12250j(InterfaceC0483l interfaceC0483l) {
        InterfaceC0420b interfaceC0420b = this.f32984a;
        return (interfaceC0420b == null || !interfaceC0483l.mo12422c()) ? this.f32985b.mo12250j(interfaceC0483l) : ((C0459g) interfaceC0420b).mo12250j(interfaceC0483l);
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: k */
    public final long mo12251k(InterfaceC0483l interfaceC0483l) {
        InterfaceC0420b interfaceC0420b = this.f32984a;
        return (interfaceC0420b == null || !interfaceC0483l.mo12422c()) ? this.f32985b.mo12251k(interfaceC0483l) : ((C0459g) interfaceC0420b).mo12251k(interfaceC0483l);
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: m */
    public final Object mo12253m(InterfaceC0486o interfaceC0486o) {
        if (interfaceC0486o == AbstractC0485n.m12439a()) {
            return this.f32986c;
        }
        if (interfaceC0486o == AbstractC0485n.m12445g()) {
            return this.f32987d;
        }
        return interfaceC0486o == AbstractC0485n.m12443e() ? this.f32985b.mo12253m(interfaceC0486o) : interfaceC0486o.mo12274a(this);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f32985b);
        InterfaceC0425g interfaceC0425g = this.f32986c;
        String strConcat = interfaceC0425g != null ? " with chronology ".concat(String.valueOf(interfaceC0425g)) : "";
        ZoneId zoneId = this.f32987d;
        return strValueOf + strConcat + (zoneId != null ? " with zone ".concat(String.valueOf(zoneId)) : "");
    }
}
