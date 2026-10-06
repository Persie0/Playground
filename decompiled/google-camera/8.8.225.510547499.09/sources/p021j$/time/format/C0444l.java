package p021j$.time.format;

import p021j$.time.C0417b;
import p021j$.time.temporal.InterfaceC0483l;

/* JADX INFO: renamed from: j$.time.format.l */
/* JADX INFO: loaded from: classes3.dex */
class C0444l implements InterfaceC0439g {

    /* JADX INFO: renamed from: f */
    static final long[] f32945f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};

    /* JADX INFO: renamed from: a */
    final InterfaceC0483l f32946a;

    /* JADX INFO: renamed from: b */
    final int f32947b;

    /* JADX INFO: renamed from: c */
    final int f32948c;

    /* JADX INFO: renamed from: d */
    private final EnumC0431B f32949d;

    /* JADX INFO: renamed from: e */
    final int f32950e;

    C0444l(InterfaceC0483l interfaceC0483l, int i, int i2, EnumC0431B enumC0431B) {
        this.f32946a = interfaceC0483l;
        this.f32947b = i;
        this.f32948c = i2;
        this.f32949d = enumC0431B;
        this.f32950e = 0;
    }

    @Override // p021j$.time.format.InterfaceC0439g
    /* JADX INFO: renamed from: a */
    public boolean mo12277a(C0455w c0455w, StringBuilder sb) {
        InterfaceC0483l interfaceC0483l = this.f32946a;
        Long lM12313e = c0455w.m12313e(interfaceC0483l);
        if (lM12313e == null) {
            return false;
        }
        long jMo12283c = mo12283c(c0455w, lM12313e.longValue());
        C0458z c0458zM12310b = c0455w.m12310b();
        String string = jMo12283c == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jMo12283c));
        int length = string.length();
        int i = this.f32948c;
        if (length > i) {
            throw new C0417b("Field " + String.valueOf(interfaceC0483l) + " cannot be printed as the value " + jMo12283c + " exceeds the maximum print width of " + i);
        }
        c0458zM12310b.getClass();
        int i2 = this.f32947b;
        EnumC0431B enumC0431B = this.f32949d;
        if (jMo12283c >= 0) {
            int i3 = AbstractC0436d.f32935a[enumC0431B.ordinal()];
            if (i3 == 1 ? !(i2 >= 19 || jMo12283c < f32945f[i2]) : i3 == 2) {
                sb.append('+');
            }
        } else {
            int i4 = AbstractC0436d.f32935a[enumC0431B.ordinal()];
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                sb.append('-');
            } else if (i4 == 4) {
                throw new C0417b("Field " + String.valueOf(interfaceC0483l) + " cannot be printed as the value " + jMo12283c + " cannot be negative according to the SignStyle");
            }
        }
        for (int i5 = 0; i5 < i2 - string.length(); i5++) {
            sb.append('0');
        }
        sb.append(string);
        return true;
    }

    /* JADX INFO: renamed from: c */
    long mo12283c(C0455w c0455w, long j) {
        return j;
    }

    /* JADX INFO: renamed from: d */
    C0444l mo12279d() {
        return this.f32950e == -1 ? this : new C0444l(this.f32946a, this.f32947b, this.f32948c, this.f32949d, -1);
    }

    /* JADX INFO: renamed from: e */
    C0444l mo12280e(int i) {
        return new C0444l(this.f32946a, this.f32947b, this.f32948c, this.f32949d, this.f32950e + i);
    }

    public String toString() {
        EnumC0431B enumC0431B = this.f32949d;
        InterfaceC0483l interfaceC0483l = this.f32946a;
        int i = this.f32948c;
        int i2 = this.f32947b;
        if (i2 == 1 && i == 19 && enumC0431B == EnumC0431B.NORMAL) {
            return "Value(" + String.valueOf(interfaceC0483l) + ")";
        }
        if (i2 == i && enumC0431B == EnumC0431B.NOT_NEGATIVE) {
            return "Value(" + String.valueOf(interfaceC0483l) + "," + i2 + ")";
        }
        return "Value(" + String.valueOf(interfaceC0483l) + "," + i2 + "," + i + "," + String.valueOf(enumC0431B) + ")";
    }

    protected C0444l(InterfaceC0483l interfaceC0483l, int i, int i2, EnumC0431B enumC0431B, int i3) {
        this.f32946a = interfaceC0483l;
        this.f32947b = i;
        this.f32948c = i2;
        this.f32949d = enumC0431B;
        this.f32950e = i3;
    }
}
