package p021j$.util.stream;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.Predicate;
import p021j$.desugar.sun.nio.p023fs.C0300n;
import p021j$.util.InterfaceC0569r;
import p021j$.util.InterfaceC0728u;
import p021j$.util.InterfaceC0731x;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.F */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC0586F {
    /* JADX INFO: renamed from: b */
    public static void m12640b() {
        throw new IllegalStateException("called wrong accept method");
    }

    /* JADX INFO: renamed from: c */
    public static void m12641c(InterfaceC0640X0 interfaceC0640X0, Integer num) {
        if (AbstractC0651a2.f33376a) {
            AbstractC0651a2.m12681a(interfaceC0640X0.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
        interfaceC0640X0.accept(num.intValue());
    }

    /* JADX INFO: renamed from: e */
    public static void m12643e(InterfaceC0643Y0 interfaceC0643Y0, Long l) {
        if (AbstractC0651a2.f33376a) {
            AbstractC0651a2.m12681a(interfaceC0643Y0.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
        interfaceC0643Y0.accept(l.longValue());
    }

    /* JADX INFO: renamed from: g */
    public static void m12645g() {
        throw new IllegalStateException("called wrong accept method");
    }

    /* JADX INFO: renamed from: h */
    public static Object[] m12646h(InterfaceC0610N interfaceC0610N, IntFunction intFunction) {
        if (AbstractC0651a2.f33376a) {
            AbstractC0651a2.m12681a(interfaceC0610N.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        }
        if (interfaceC0610N.count() >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) interfaceC0610N.count());
        interfaceC0610N.mo12603r(objArr, 0);
        return objArr;
    }

    /* JADX INFO: renamed from: i */
    public static void m12647i(InterfaceC0601K interfaceC0601K, Double[] dArr, int i) {
        if (AbstractC0651a2.f33376a) {
            AbstractC0651a2.m12681a(interfaceC0601K.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) interfaceC0601K.mo12671i();
        for (int i2 = 0; i2 < dArr2.length; i2++) {
            dArr[i + i2] = Double.valueOf(dArr2[i2]);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m12648j(InterfaceC0604L interfaceC0604L, Integer[] numArr, int i) {
        if (AbstractC0651a2.f33376a) {
            AbstractC0651a2.m12681a(interfaceC0604L.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) interfaceC0604L.mo12671i();
        for (int i2 = 0; i2 < iArr.length; i2++) {
            numArr[i + i2] = Integer.valueOf(iArr[i2]);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m12649k(InterfaceC0607M interfaceC0607M, Long[] lArr, int i) {
        if (AbstractC0651a2.f33376a) {
            AbstractC0651a2.m12681a(interfaceC0607M.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) interfaceC0607M.mo12671i();
        for (int i2 = 0; i2 < jArr.length; i2++) {
            lArr[i + i2] = Long.valueOf(jArr[i2]);
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m12650l(InterfaceC0601K interfaceC0601K, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            interfaceC0601K.mo12672k((DoubleConsumer) consumer);
        } else {
            if (AbstractC0651a2.f33376a) {
                AbstractC0651a2.m12681a(interfaceC0601K.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((InterfaceC0569r) interfaceC0601K.spliterator()).forEachRemaining(consumer);
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m12651m(InterfaceC0604L interfaceC0604L, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            interfaceC0604L.mo12672k((IntConsumer) consumer);
        } else {
            if (AbstractC0651a2.f33376a) {
                AbstractC0651a2.m12681a(interfaceC0604L.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                throw null;
            }
            ((InterfaceC0728u) interfaceC0604L.spliterator()).forEachRemaining(consumer);
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m12652n(InterfaceC0607M interfaceC0607M, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            interfaceC0607M.mo12672k((LongConsumer) consumer);
        } else {
            if (AbstractC0651a2.f33376a) {
                AbstractC0651a2.m12681a(interfaceC0607M.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((InterfaceC0731x) interfaceC0607M.spliterator()).forEachRemaining(consumer);
        }
    }

    /* JADX INFO: renamed from: o */
    public static InterfaceC0601K m12653o(InterfaceC0601K interfaceC0601K, long j, long j2) {
        if (j == 0 && j2 == interfaceC0601K.count()) {
            return interfaceC0601K;
        }
        long j3 = j2 - j;
        InterfaceC0569r interfaceC0569r = (InterfaceC0569r) interfaceC0601K.spliterator();
        InterfaceC0589G c0659d0 = (j3 < 0 || j3 >= 2147483639) ? new C0659d0() : new C0656c0(j3);
        c0659d0.mo12599h(j3);
        for (int i = 0; i < j && interfaceC0569r.tryAdvance(new C0594H1(1)); i++) {
        }
        if (j2 == interfaceC0601K.count()) {
            interfaceC0569r.forEachRemaining((DoubleConsumer) c0659d0);
        } else {
            for (int i2 = 0; i2 < j3 && interfaceC0569r.tryAdvance((DoubleConsumer) c0659d0); i2++) {
            }
        }
        c0659d0.mo12598f();
        return c0659d0.mo12596a();
    }

    /* JADX INFO: renamed from: p */
    public static InterfaceC0604L m12654p(InterfaceC0604L interfaceC0604L, long j, long j2) {
        if (j == 0 && j2 == interfaceC0604L.count()) {
            return interfaceC0604L;
        }
        long j3 = j2 - j;
        InterfaceC0728u interfaceC0728u = (InterfaceC0728u) interfaceC0604L.spliterator();
        InterfaceC0592H interfaceC0592HM12635n = AbstractC0584E0.m12635n(j3);
        interfaceC0592HM12635n.mo12599h(j3);
        for (int i = 0; i < j && interfaceC0728u.tryAdvance((IntConsumer) new C0600J1(1)); i++) {
        }
        if (j2 == interfaceC0604L.count()) {
            interfaceC0728u.forEachRemaining((IntConsumer) interfaceC0592HM12635n);
        } else {
            for (int i2 = 0; i2 < j3 && interfaceC0728u.tryAdvance((IntConsumer) interfaceC0592HM12635n); i2++) {
            }
        }
        interfaceC0592HM12635n.mo12598f();
        return interfaceC0592HM12635n.mo12596a();
    }

    /* JADX INFO: renamed from: q */
    public static InterfaceC0607M m12655q(InterfaceC0607M interfaceC0607M, long j, long j2) {
        if (j == 0 && j2 == interfaceC0607M.count()) {
            return interfaceC0607M;
        }
        long j3 = j2 - j;
        InterfaceC0731x interfaceC0731x = (InterfaceC0731x) interfaceC0607M.spliterator();
        InterfaceC0595I interfaceC0595IM12636o = AbstractC0584E0.m12636o(j3);
        interfaceC0595IM12636o.mo12599h(j3);
        for (int i = 0; i < j && interfaceC0731x.tryAdvance((LongConsumer) new C0606L1(1)); i++) {
        }
        if (j2 == interfaceC0607M.count()) {
            interfaceC0731x.forEachRemaining((LongConsumer) interfaceC0595IM12636o);
        } else {
            for (int i2 = 0; i2 < j3 && interfaceC0731x.tryAdvance((LongConsumer) interfaceC0595IM12636o); i2++) {
            }
        }
        interfaceC0595IM12636o.mo12598f();
        return interfaceC0595IM12636o.mo12596a();
    }

    /* JADX INFO: renamed from: r */
    public static InterfaceC0613O m12656r(InterfaceC0613O interfaceC0613O, long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == interfaceC0613O.count()) {
            return interfaceC0613O;
        }
        Spliterator spliterator = interfaceC0613O.spliterator();
        long j3 = j2 - j;
        InterfaceC0598J interfaceC0598JM12628g = AbstractC0584E0.m12628g(j3, intFunction);
        interfaceC0598JM12628g.mo12599h(j3);
        for (int i = 0; i < j && spliterator.tryAdvance(new C0300n()); i++) {
        }
        if (j2 == interfaceC0613O.count()) {
            spliterator.forEachRemaining(interfaceC0598JM12628g);
        } else {
            for (int i2 = 0; i2 < j3 && spliterator.tryAdvance(interfaceC0598JM12628g); i2++) {
            }
        }
        interfaceC0598JM12628g.mo12598f();
        return interfaceC0598JM12628g.mo12596a();
    }

    /* JADX INFO: renamed from: s */
    static long m12657s(long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        if (j3 >= 0) {
            return j3;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: t */
    static Spliterator m12658t(EnumC0714v1 enumC0714v1, Spliterator spliterator, long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        long j4 = j3 >= 0 ? j3 : Long.MAX_VALUE;
        int i = AbstractC0657c1.f33394a[enumC0714v1.ordinal()];
        if (i == 1) {
            return new C0615O1(spliterator, j, j4);
        }
        if (i == 2) {
            return new C0603K1((InterfaceC0728u) spliterator, j, j4);
        }
        if (i == 3) {
            return new C0609M1((InterfaceC0731x) spliterator, j, j4);
        }
        if (i == 4) {
            return new C0597I1((InterfaceC0569r) spliterator, j, j4);
        }
        throw new IllegalStateException("Unknown shape ".concat(String.valueOf(enumC0714v1)));
    }

    /* JADX INFO: renamed from: z */
    public static C0580D m12659z(EnumC0577C enumC0577C, Predicate predicate) {
        predicate.getClass();
        enumC0577C.getClass();
        return new C0580D(EnumC0714v1.REFERENCE, enumC0577C, new C0673i(1, enumC0577C, predicate));
    }

    /* JADX INFO: renamed from: A */
    abstract InterfaceC0646Z0 mo12660A(Spliterator spliterator, InterfaceC0646Z0 interfaceC0646Z0);

    /* JADX INFO: renamed from: B */
    abstract InterfaceC0646Z0 mo12661B(InterfaceC0646Z0 interfaceC0646Z0);

    /* JADX INFO: renamed from: u */
    abstract void mo12662u(Spliterator spliterator, InterfaceC0646Z0 interfaceC0646Z0);

    /* JADX INFO: renamed from: v */
    abstract boolean mo12663v(Spliterator spliterator, InterfaceC0646Z0 interfaceC0646Z0);

    /* JADX INFO: renamed from: w */
    abstract long mo12664w(Spliterator spliterator);

    /* JADX INFO: renamed from: x */
    abstract int mo12665x();

    /* JADX INFO: renamed from: y */
    abstract InterfaceC0598J mo12595y(long j, IntFunction intFunction);
}
