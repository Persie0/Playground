package p021j$.util.stream;

import java.util.function.IntFunction;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.E0 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0584E0 implements InterfaceC0641X1 {

    /* JADX INFO: renamed from: a */
    private static final C0671h0 f33304a = new C0671h0();

    /* JADX INFO: renamed from: b */
    private static final InterfaceC0604L f33305b = new C0665f0();

    /* JADX INFO: renamed from: c */
    private static final InterfaceC0607M f33306c = new C0668g0();

    /* JADX INFO: renamed from: d */
    private static final InterfaceC0601K f33307d = new C0662e0();

    /* JADX INFO: renamed from: e */
    private static final int[] f33308e = new int[0];

    /* JADX INFO: renamed from: f */
    private static final long[] f33309f = new long[0];

    /* JADX INFO: renamed from: g */
    private static final double[] f33310g = new double[0];

    public AbstractC0584E0(EnumC0714v1 enumC0714v1) {
    }

    /* JADX INFO: renamed from: g */
    static InterfaceC0598J m12628g(long j, IntFunction intFunction) {
        return (j < 0 || j >= 2147483639) ? new C0572A0() : new C0677j0(j, intFunction);
    }

    /* JADX INFO: renamed from: h */
    public static InterfaceC0613O m12629h(AbstractC0586F abstractC0586F, Spliterator spliterator, boolean z, IntFunction intFunction) {
        long jMo12664w = abstractC0586F.mo12664w(spliterator);
        if (jMo12664w < 0 || !spliterator.hasCharacteristics(16384)) {
            InterfaceC0613O interfaceC0613O = (InterfaceC0613O) new C0630U(spliterator, abstractC0586F, intFunction).invoke();
            return z ? m12634m(interfaceC0613O, intFunction) : interfaceC0613O;
        }
        if (jMo12664w >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jMo12664w);
        new C0722y0(spliterator, abstractC0586F, objArr).invoke();
        return new C0624S(objArr);
    }

    /* JADX INFO: renamed from: i */
    public static InterfaceC0604L m12630i(AbstractC0586F abstractC0586F, Spliterator spliterator, boolean z) {
        long jMo12664w = abstractC0586F.mo12664w(spliterator);
        if (jMo12664w >= 0 && spliterator.hasCharacteristics(16384)) {
            if (jMo12664w >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            int[] iArr = new int[(int) jMo12664w];
            new C0716w0(spliterator, abstractC0586F, iArr).invoke();
            return new C0680k0(iArr);
        }
        InterfaceC0604L interfaceC0604L = (InterfaceC0604L) new C0630U(0, spliterator, abstractC0586F).invoke();
        if (!z || interfaceC0604L.mo12604u() <= 0) {
            return interfaceC0604L;
        }
        long jCount = interfaceC0604L.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr2 = new int[(int) jCount];
        new C0575B0(interfaceC0604L, iArr2).invoke();
        return new C0680k0(iArr2);
    }

    /* JADX INFO: renamed from: j */
    public static InterfaceC0607M m12631j(AbstractC0586F abstractC0586F, Spliterator spliterator, boolean z) {
        long jMo12664w = abstractC0586F.mo12664w(spliterator);
        if (jMo12664w >= 0 && spliterator.hasCharacteristics(16384)) {
            if (jMo12664w >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            long[] jArr = new long[(int) jMo12664w];
            new C0719x0(spliterator, abstractC0586F, jArr).invoke();
            return new C0707t0(jArr);
        }
        InterfaceC0607M interfaceC0607M = (InterfaceC0607M) new C0630U(1, spliterator, abstractC0586F).invoke();
        if (!z || interfaceC0607M.mo12604u() <= 0) {
            return interfaceC0607M;
        }
        long jCount = interfaceC0607M.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr2 = new long[(int) jCount];
        new C0575B0(interfaceC0607M, jArr2).invoke();
        return new C0707t0(jArr2);
    }

    /* JADX INFO: renamed from: k */
    static AbstractC0619Q m12632k(EnumC0714v1 enumC0714v1, InterfaceC0613O interfaceC0613O, InterfaceC0613O interfaceC0613O2) {
        int i = AbstractC0616P.f33335a[enumC0714v1.ordinal()];
        if (i == 1) {
            return new C0649a0(interfaceC0613O, interfaceC0613O2);
        }
        if (i == 2) {
            return new C0639X((InterfaceC0604L) interfaceC0613O, (InterfaceC0604L) interfaceC0613O2);
        }
        if (i == 3) {
            return new C0642Y((InterfaceC0607M) interfaceC0613O, (InterfaceC0607M) interfaceC0613O2);
        }
        if (i == 4) {
            return new C0636W((InterfaceC0601K) interfaceC0613O, (InterfaceC0601K) interfaceC0613O2);
        }
        throw new IllegalStateException("Unknown shape ".concat(String.valueOf(enumC0714v1)));
    }

    /* JADX INFO: renamed from: l */
    static AbstractC0674i0 m12633l(EnumC0714v1 enumC0714v1) {
        InterfaceC0613O interfaceC0613O;
        int i = AbstractC0616P.f33335a[enumC0714v1.ordinal()];
        if (i == 1) {
            return f33304a;
        }
        if (i == 2) {
            interfaceC0613O = f33305b;
        } else if (i == 3) {
            interfaceC0613O = f33306c;
        } else {
            if (i != 4) {
                throw new IllegalStateException("Unknown shape ".concat(String.valueOf(enumC0714v1)));
            }
            interfaceC0613O = f33307d;
        }
        return (AbstractC0674i0) interfaceC0613O;
    }

    /* JADX INFO: renamed from: m */
    public static InterfaceC0613O m12634m(InterfaceC0613O interfaceC0613O, IntFunction intFunction) {
        if (interfaceC0613O.mo12604u() <= 0) {
            return interfaceC0613O;
        }
        long jCount = interfaceC0613O.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        new C0578C0(interfaceC0613O, objArr).invoke();
        return new C0624S(objArr);
    }

    /* JADX INFO: renamed from: n */
    static InterfaceC0592H m12635n(long j) {
        return (j < 0 || j >= 2147483639) ? new C0686m0() : new C0683l0(j);
    }

    /* JADX INFO: renamed from: o */
    static InterfaceC0595I m12636o(long j) {
        return (j < 0 || j >= 2147483639) ? new C0713v0() : new C0710u0(j);
    }

    @Override // p021j$.util.stream.InterfaceC0641X1
    /* JADX INFO: renamed from: b */
    public /* synthetic */ int mo12618b() {
        return 0;
    }

    @Override // p021j$.util.stream.InterfaceC0641X1
    /* JADX INFO: renamed from: c */
    public Object mo12619c(AbstractC0586F abstractC0586F, Spliterator spliterator) {
        return ((InterfaceC0608M0) new C0617P0(this, abstractC0586F, spliterator).invoke()).get();
    }

    @Override // p021j$.util.stream.InterfaceC0641X1
    /* JADX INFO: renamed from: d */
    public Object mo12620d(AbstractC0586F abstractC0586F, Spliterator spliterator) {
        InterfaceC0608M0 interfaceC0608M0Mo12637p = mo12637p();
        abstractC0586F.mo12660A(spliterator, interfaceC0608M0Mo12637p);
        return interfaceC0608M0Mo12637p.get();
    }

    /* JADX INFO: renamed from: p */
    public abstract InterfaceC0608M0 mo12637p();
}
