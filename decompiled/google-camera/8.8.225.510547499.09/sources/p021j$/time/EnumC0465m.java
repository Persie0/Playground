package p021j$.time;

import p021j$.p024io.AbstractC0304a;
import p021j$.time.chrono.C0426h;
import p021j$.time.temporal.AbstractC0485n;
import p021j$.time.temporal.C0487p;
import p021j$.time.temporal.C0488q;
import p021j$.time.temporal.ChronoUnit;
import p021j$.time.temporal.EnumC0472a;
import p021j$.time.temporal.InterfaceC0483l;
import p021j$.time.temporal.InterfaceC0486o;
import p021j$.time.temporal.TemporalAccessor;

/* JADX INFO: renamed from: j$.time.m */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC0465m implements TemporalAccessor {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;


    /* JADX INFO: renamed from: a */
    private static final EnumC0465m[] f33017a = values();

    /* JADX INFO: renamed from: q */
    public static EnumC0465m m12389q(int i) {
        if (i >= 1 && i <= 12) {
            return f33017a[i - 1];
        }
        throw new C0417b("Invalid value for MonthOfYear: " + i);
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: f */
    public final int mo12247f(InterfaceC0483l interfaceC0483l) {
        return interfaceC0483l == EnumC0472a.MONTH_OF_YEAR ? ordinal() + 1 : AbstractC0304a.m12049a(this, interfaceC0483l);
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: h */
    public final boolean mo12248h(InterfaceC0483l interfaceC0483l) {
        if (interfaceC0483l instanceof EnumC0472a) {
            return interfaceC0483l == EnumC0472a.MONTH_OF_YEAR;
        }
        return interfaceC0483l != null && interfaceC0483l.mo12425h(this);
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: j */
    public final C0488q mo12250j(InterfaceC0483l interfaceC0483l) {
        return interfaceC0483l == EnumC0472a.MONTH_OF_YEAR ? interfaceC0483l.mo12424f() : AbstractC0304a.m12051c(this, interfaceC0483l);
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: k */
    public final long mo12251k(InterfaceC0483l interfaceC0483l) {
        if (interfaceC0483l == EnumC0472a.MONTH_OF_YEAR) {
            return ordinal() + 1;
        }
        if (interfaceC0483l instanceof EnumC0472a) {
            throw new C0487p("Unsupported field: ".concat(String.valueOf(interfaceC0483l)));
        }
        return interfaceC0483l.mo12423e(this);
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: m */
    public final Object mo12253m(InterfaceC0486o interfaceC0486o) {
        if (interfaceC0486o == AbstractC0485n.m12439a()) {
            return C0426h.f32915a;
        }
        return interfaceC0486o == AbstractC0485n.m12443e() ? ChronoUnit.MONTHS : AbstractC0304a.m12050b(this, interfaceC0486o);
    }

    /* JADX INFO: renamed from: n */
    public final int m12390n(boolean z) {
        switch (AbstractC0464l.f33016a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z ? 1 : 0) + 91;
            case 3:
                return (z ? 1 : 0) + 152;
            case 4:
                return (z ? 1 : 0) + 244;
            case 5:
                return (z ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z ? 1 : 0) + 60;
            case 8:
                return (z ? 1 : 0) + 121;
            case 9:
                return (z ? 1 : 0) + 182;
            case 10:
                return (z ? 1 : 0) + 213;
            case 11:
                return (z ? 1 : 0) + 274;
            default:
                return (z ? 1 : 0) + 335;
        }
    }

    /* JADX INFO: renamed from: r */
    public final EnumC0465m m12391r() {
        return f33017a[((((int) 1) + 12) + ordinal()) % 12];
    }
}
