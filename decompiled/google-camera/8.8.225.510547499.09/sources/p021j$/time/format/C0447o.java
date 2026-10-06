package p021j$.time.format;

import p021j$.time.C0459g;
import p021j$.time.chrono.AbstractC0422d;
import p021j$.time.chrono.InterfaceC0420b;
import p021j$.time.temporal.InterfaceC0483l;
import p021j$.util.Objects;

/* JADX INFO: renamed from: j$.time.format.o */
/* JADX INFO: loaded from: classes3.dex */
final class C0447o extends C0444l {

    /* JADX INFO: renamed from: i */
    static final C0459g f32959i = C0459g.m12322I(2000, 1, 1);

    /* JADX INFO: renamed from: g */
    private final int f32960g;

    /* JADX INFO: renamed from: h */
    private final InterfaceC0420b f32961h;

    private C0447o(InterfaceC0483l interfaceC0483l, int i, int i2, int i3, InterfaceC0420b interfaceC0420b, int i4) {
        super(interfaceC0483l, i, i2, EnumC0431B.NOT_NEGATIVE, i4);
        this.f32960g = i3;
        this.f32961h = interfaceC0420b;
    }

    @Override // p021j$.time.format.C0444l
    /* JADX INFO: renamed from: c */
    final long mo12283c(C0455w c0455w, long j) {
        int iMo12247f;
        long jAbs = Math.abs(j);
        InterfaceC0420b interfaceC0420b = this.f32961h;
        if (interfaceC0420b != null) {
            AbstractC0422d.m12266b(c0455w.m12312d());
            iMo12247f = C0459g.m12325s(interfaceC0420b).mo12247f(this.f32946a);
        } else {
            iMo12247f = this.f32960g;
        }
        long j2 = iMo12247f;
        long[] jArr = C0444l.f32945f;
        if (j >= j2) {
            long j3 = jArr[this.f32947b];
            if (j < j2 + j3) {
                return jAbs % j3;
            }
        }
        return jAbs % jArr[this.f32948c];
    }

    @Override // p021j$.time.format.C0444l
    /* JADX INFO: renamed from: d */
    final C0444l mo12279d() {
        return this.f32950e == -1 ? this : new C0447o(this.f32946a, this.f32947b, this.f32948c, this.f32960g, this.f32961h, -1);
    }

    @Override // p021j$.time.format.C0444l
    /* JADX INFO: renamed from: e */
    final C0444l mo12280e(int i) {
        return new C0447o(this.f32946a, this.f32947b, this.f32948c, this.f32960g, this.f32961h, this.f32950e + i);
    }

    @Override // p021j$.time.format.C0444l
    public final String toString() {
        return "ReducedValue(" + String.valueOf(this.f32946a) + "," + this.f32947b + "," + this.f32948c + "," + String.valueOf(Objects.m12504a(this.f32961h, Integer.valueOf(this.f32960g))) + ")";
    }

    C0447o(InterfaceC0483l interfaceC0483l, C0459g c0459g) {
        this(interfaceC0483l, 2, 2, 0, c0459g, 0);
    }

    /* synthetic */ C0447o(InterfaceC0483l interfaceC0483l, C0459g c0459g, int i) {
        this(interfaceC0483l, 2, 2, 0, c0459g, i);
    }
}
