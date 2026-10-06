package p021j$.time.chrono;

import p021j$.p024io.AbstractC0304a;
import p021j$.time.C0471s;
import p021j$.time.temporal.AbstractC0485n;
import p021j$.time.temporal.C0487p;
import p021j$.time.temporal.EnumC0472a;
import p021j$.time.temporal.InterfaceC0483l;
import p021j$.time.temporal.TemporalAccessor;
import p021j$.util.Objects;

/* JADX INFO: renamed from: j$.time.chrono.d */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC0422d {
    /* JADX INFO: renamed from: a */
    public static int m12265a(InterfaceC0424f interfaceC0424f, InterfaceC0483l interfaceC0483l) {
        if (!(interfaceC0483l instanceof EnumC0472a)) {
            return AbstractC0304a.m12049a(interfaceC0424f, interfaceC0483l);
        }
        int i = AbstractC0423e.f32914a[((EnumC0472a) interfaceC0483l).ordinal()];
        if (i == 1) {
            throw new C0487p("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        }
        C0471s c0471s = (C0471s) interfaceC0424f;
        return i != 2 ? c0471s.m12410C().mo12247f(interfaceC0483l) : c0471s.m12412q().m12402z();
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC0425g m12266b(TemporalAccessor temporalAccessor) {
        if (temporalAccessor != null) {
            return (InterfaceC0425g) Objects.m12504a((InterfaceC0425g) temporalAccessor.mo12253m(AbstractC0485n.m12439a()), C0426h.f32915a);
        }
        throw new NullPointerException("temporal");
    }
}
