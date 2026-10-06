package p021j$.time;

import p021j$.p024io.AbstractC0304a;
import p021j$.time.temporal.AbstractC0485n;
import p021j$.time.temporal.C0487p;
import p021j$.time.temporal.C0488q;
import p021j$.time.temporal.ChronoUnit;
import p021j$.time.temporal.EnumC0472a;
import p021j$.time.temporal.InterfaceC0483l;
import p021j$.time.temporal.InterfaceC0486o;
import p021j$.time.temporal.TemporalAccessor;

/* JADX INFO: renamed from: j$.time.c */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC0418c implements TemporalAccessor {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;


    /* JADX INFO: renamed from: a */
    private static final EnumC0418c[] f32912a = values();

    /* JADX INFO: renamed from: q */
    public static EnumC0418c m12262q(int i) {
        if (i >= 1 && i <= 7) {
            return f32912a[i - 1];
        }
        throw new C0417b("Invalid value for DayOfWeek: " + i);
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: f */
    public final int mo12247f(InterfaceC0483l interfaceC0483l) {
        return interfaceC0483l == EnumC0472a.DAY_OF_WEEK ? m12263n() : AbstractC0304a.m12049a(this, interfaceC0483l);
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: h */
    public final boolean mo12248h(InterfaceC0483l interfaceC0483l) {
        if (interfaceC0483l instanceof EnumC0472a) {
            return interfaceC0483l == EnumC0472a.DAY_OF_WEEK;
        }
        return interfaceC0483l != null && interfaceC0483l.mo12425h(this);
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: j */
    public final C0488q mo12250j(InterfaceC0483l interfaceC0483l) {
        return interfaceC0483l == EnumC0472a.DAY_OF_WEEK ? interfaceC0483l.mo12424f() : AbstractC0304a.m12051c(this, interfaceC0483l);
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: k */
    public final long mo12251k(InterfaceC0483l interfaceC0483l) {
        if (interfaceC0483l == EnumC0472a.DAY_OF_WEEK) {
            return m12263n();
        }
        if (interfaceC0483l instanceof EnumC0472a) {
            throw new C0487p("Unsupported field: ".concat(String.valueOf(interfaceC0483l)));
        }
        return interfaceC0483l.mo12423e(this);
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: m */
    public final Object mo12253m(InterfaceC0486o interfaceC0486o) {
        return interfaceC0486o == AbstractC0485n.m12443e() ? ChronoUnit.DAYS : AbstractC0304a.m12050b(this, interfaceC0486o);
    }

    /* JADX INFO: renamed from: n */
    public final int m12263n() {
        return ordinal() + 1;
    }

    /* JADX INFO: renamed from: r */
    public final EnumC0418c m12264r(long j) {
        return f32912a[((((int) (j % 7)) + 7) + ordinal()) % 7];
    }
}
