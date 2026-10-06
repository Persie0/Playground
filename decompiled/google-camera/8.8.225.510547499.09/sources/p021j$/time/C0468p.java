package p021j$.time;

import p021j$.p024io.AbstractC0304a;
import p021j$.time.temporal.AbstractC0485n;
import p021j$.time.temporal.C0487p;
import p021j$.time.temporal.C0488q;
import p021j$.time.temporal.EnumC0472a;
import p021j$.time.temporal.InterfaceC0483l;
import p021j$.time.temporal.InterfaceC0486o;
import p021j$.time.temporal.TemporalAccessor;
import p021j$.time.zone.C0493c;
import p021j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: j$.time.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C0468p extends ZoneId implements TemporalAccessor, Comparable {

    /* JADX INFO: renamed from: d */
    private static final ConcurrentHashMap f33022d = new ConcurrentHashMap(16, 0.75f, 4);

    /* JADX INFO: renamed from: e */
    private static final ConcurrentHashMap f33023e = new ConcurrentHashMap(16, 0.75f, 4);

    /* JADX INFO: renamed from: f */
    public static final C0468p f33024f = m12399C(0);

    /* JADX INFO: renamed from: g */
    public static final C0468p f33025g = m12399C(-64800);

    /* JADX INFO: renamed from: h */
    public static final C0468p f33026h = m12399C(64800);

    /* JADX INFO: renamed from: b */
    private final int f33027b;

    /* JADX INFO: renamed from: c */
    private final transient String f33028c;

    private C0468p(int i) {
        String string;
        this.f33027b = i;
        if (i == 0) {
            string = "Z";
        } else {
            int iAbs = Math.abs(i);
            StringBuilder sb = new StringBuilder();
            int i2 = iAbs / 3600;
            int i3 = (iAbs / 60) % 60;
            sb.append(i < 0 ? "-" : "+");
            sb.append(i2 < 10 ? "0" : "");
            sb.append(i2);
            sb.append(i3 < 10 ? ":0" : ":");
            sb.append(i3);
            int i4 = iAbs % 60;
            if (i4 != 0) {
                sb.append(i4 >= 10 ? ":" : ":0");
                sb.append(i4);
            }
            string = sb.toString();
        }
        this.f33028c = string;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public static C0468p m12397A(String str) {
        int iM12400D;
        int iM12400D2;
        int iM12400D3;
        char cCharAt;
        if (str == null) {
            throw new NullPointerException("offsetId");
        }
        C0468p c0468p = (C0468p) f33023e.get(str);
        if (c0468p != null) {
            return c0468p;
        }
        int length = str.length();
        if (length != 2) {
            if (length != 3) {
                if (length != 5) {
                    if (length == 6) {
                        iM12400D = m12400D(str, 1, false);
                        iM12400D2 = m12400D(str, 4, true);
                    } else if (length == 7) {
                        iM12400D = m12400D(str, 1, false);
                        iM12400D2 = m12400D(str, 3, false);
                        iM12400D3 = m12400D(str, 5, false);
                    } else {
                        if (length != 9) {
                            throw new C0417b("Invalid ID for ZoneOffset, invalid format: ".concat(str));
                        }
                        iM12400D = m12400D(str, 1, false);
                        iM12400D2 = m12400D(str, 4, true);
                        iM12400D3 = m12400D(str, 7, true);
                    }
                    cCharAt = str.charAt(0);
                    if (cCharAt != '+' || cCharAt == '-') {
                        return cCharAt == '-' ? m12398B(-iM12400D, -iM12400D2, -iM12400D3) : m12398B(iM12400D, iM12400D2, iM12400D3);
                    }
                    throw new C0417b("Invalid ID for ZoneOffset, plus/minus not found when expected: ".concat(str));
                }
                iM12400D = m12400D(str, 1, false);
                iM12400D2 = m12400D(str, 3, false);
            }
            iM12400D3 = 0;
            cCharAt = str.charAt(0);
            if (cCharAt != '+') {
            }
            if (cCharAt == '-') {
            }
        }
        str = str.charAt(0) + "0" + str.charAt(1);
        iM12400D = m12400D(str, 1, false);
        iM12400D2 = 0;
        iM12400D3 = 0;
        cCharAt = str.charAt(0);
        if (cCharAt != '+') {
        }
        if (cCharAt == '-') {
        }
    }

    /* JADX INFO: renamed from: B */
    public static C0468p m12398B(int i, int i2, int i3) {
        if (i < -18 || i > 18) {
            throw new C0417b("Zone offset hours not in valid range: value " + i + " is not in the range -18 to 18");
        }
        if (i > 0) {
            if (i2 < 0 || i3 < 0) {
                throw new C0417b("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i < 0) {
            if (i2 > 0 || i3 > 0) {
                throw new C0417b("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i2 > 0 && i3 < 0) || (i2 < 0 && i3 > 0)) {
            throw new C0417b("Zone offset minutes and seconds must have the same sign");
        }
        if (i2 < -59 || i2 > 59) {
            throw new C0417b("Zone offset minutes not in valid range: value " + i2 + " is not in the range -59 to 59");
        }
        if (i3 < -59 || i3 > 59) {
            throw new C0417b("Zone offset seconds not in valid range: value " + i3 + " is not in the range -59 to 59");
        }
        if (Math.abs(i) == 18 && (i2 | i3) != 0) {
            throw new C0417b("Zone offset not in valid range: -18:00 to +18:00");
        }
        return m12399C((i2 * 60) + (i * 3600) + i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C */
    public static C0468p m12399C(int i) {
        if (i < -64800 || i > 64800) {
            throw new C0417b("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i % 900 != 0) {
            return new C0468p(i);
        }
        Integer numValueOf = Integer.valueOf(i);
        ConcurrentHashMap concurrentHashMap = f33022d;
        C0468p c0468p = (C0468p) concurrentHashMap.get(numValueOf);
        if (c0468p != null) {
            return c0468p;
        }
        concurrentHashMap.putIfAbsent(numValueOf, new C0468p(i));
        C0468p c0468p2 = (C0468p) concurrentHashMap.get(numValueOf);
        f33023e.putIfAbsent(c0468p2.f33028c, c0468p2);
        return c0468p2;
    }

    /* JADX INFO: renamed from: D */
    private static int m12400D(CharSequence charSequence, int i, boolean z) {
        if (z && charSequence.charAt(i - 1) != ':') {
            throw new C0417b("Invalid ID for ZoneOffset, colon not found when expected: ".concat(String.valueOf(charSequence)));
        }
        char cCharAt = charSequence.charAt(i);
        char cCharAt2 = charSequence.charAt(i + 1);
        if (cCharAt < '0' || cCharAt > '9' || cCharAt2 < '0' || cCharAt2 > '9') {
            throw new C0417b("Invalid ID for ZoneOffset, non numeric characters found: ".concat(String.valueOf(charSequence)));
        }
        return (cCharAt2 - '0') + ((cCharAt - '0') * 10);
    }

    /* JADX INFO: renamed from: y */
    public static C0468p m12401y(TemporalAccessor temporalAccessor) {
        if (temporalAccessor == null) {
            throw new NullPointerException("temporal");
        }
        C0468p c0468p = (C0468p) temporalAccessor.mo12253m(AbstractC0485n.m12442d());
        if (c0468p != null) {
            return c0468p;
        }
        throw new C0417b("Unable to obtain ZoneOffset from TemporalAccessor: " + String.valueOf(temporalAccessor) + " of type " + temporalAccessor.getClass().getName());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((C0468p) obj).f33027b - this.f33027b;
    }

    @Override // p021j$.time.ZoneId
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0468p) {
            return this.f33027b == ((C0468p) obj).f33027b;
        }
        return false;
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: f */
    public final int mo12247f(InterfaceC0483l interfaceC0483l) {
        if (interfaceC0483l == EnumC0472a.OFFSET_SECONDS) {
            return this.f33027b;
        }
        if (interfaceC0483l instanceof EnumC0472a) {
            throw new C0487p("Unsupported field: ".concat(String.valueOf(interfaceC0483l)));
        }
        return AbstractC0304a.m12051c(this, interfaceC0483l).m12450a(mo12251k(interfaceC0483l), interfaceC0483l);
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: h */
    public final boolean mo12248h(InterfaceC0483l interfaceC0483l) {
        if (interfaceC0483l instanceof EnumC0472a) {
            return interfaceC0483l == EnumC0472a.OFFSET_SECONDS;
        }
        return interfaceC0483l != null && interfaceC0483l.mo12425h(this);
    }

    @Override // p021j$.time.ZoneId
    public final int hashCode() {
        return this.f33027b;
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: j */
    public final C0488q mo12250j(InterfaceC0483l interfaceC0483l) {
        return AbstractC0304a.m12051c(this, interfaceC0483l);
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: k */
    public final long mo12251k(InterfaceC0483l interfaceC0483l) {
        if (interfaceC0483l == EnumC0472a.OFFSET_SECONDS) {
            return this.f33027b;
        }
        if (interfaceC0483l instanceof EnumC0472a) {
            throw new C0487p("Unsupported field: ".concat(String.valueOf(interfaceC0483l)));
        }
        return interfaceC0483l.mo12423e(this);
    }

    @Override // p021j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: m */
    public final Object mo12253m(InterfaceC0486o interfaceC0486o) {
        return (interfaceC0486o == AbstractC0485n.m12442d() || interfaceC0486o == AbstractC0485n.m12444f()) ? this : AbstractC0304a.m12050b(this, interfaceC0486o);
    }

    @Override // p021j$.time.ZoneId
    /* JADX INFO: renamed from: q */
    public final String mo12260q() {
        return this.f33028c;
    }

    @Override // p021j$.time.ZoneId
    /* JADX INFO: renamed from: r */
    public final C0493c mo12261r() {
        return C0493c.m12488j(this);
    }

    @Override // p021j$.time.ZoneId
    public final String toString() {
        return this.f33028c;
    }

    /* JADX INFO: renamed from: z */
    public final int m12402z() {
        return this.f33027b;
    }
}
