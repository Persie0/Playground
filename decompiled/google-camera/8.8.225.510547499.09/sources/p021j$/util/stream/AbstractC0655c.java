package p021j$.util.stream;

import java.util.function.IntFunction;
import java.util.function.Supplier;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.c */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0655c extends AbstractC0586F implements BaseStream {

    /* JADX INFO: renamed from: a */
    private final AbstractC0655c f33382a;

    /* JADX INFO: renamed from: b */
    private final AbstractC0655c f33383b;

    /* JADX INFO: renamed from: c */
    protected final int f33384c;

    /* JADX INFO: renamed from: d */
    private AbstractC0655c f33385d;

    /* JADX INFO: renamed from: e */
    private int f33386e;

    /* JADX INFO: renamed from: f */
    private int f33387f;

    /* JADX INFO: renamed from: g */
    private Spliterator f33388g;

    /* JADX INFO: renamed from: h */
    private Supplier f33389h;

    /* JADX INFO: renamed from: i */
    private boolean f33390i;

    /* JADX INFO: renamed from: j */
    private boolean f33391j;

    /* JADX INFO: renamed from: k */
    private Runnable f33392k;

    /* JADX INFO: renamed from: l */
    private boolean f33393l;

    AbstractC0655c(Spliterator spliterator, int i, boolean z) {
        this.f33383b = null;
        this.f33388g = spliterator;
        this.f33382a = this;
        int i2 = EnumC0711u1.f33490g & i;
        this.f33384c = i2;
        this.f33387f = ((i2 << 1) ^ (-1)) & EnumC0711u1.f33495l;
        this.f33386e = 0;
        this.f33393l = z;
    }

    /* JADX INFO: renamed from: Q */
    private Spliterator m12688Q(int i) {
        int i2;
        int i3;
        AbstractC0655c abstractC0655c = this.f33382a;
        Spliterator spliteratorMo12687N = abstractC0655c.f33388g;
        if (spliteratorMo12687N != null) {
            abstractC0655c.f33388g = null;
        } else {
            Supplier supplier = abstractC0655c.f33389h;
            if (supplier == null) {
                throw new IllegalStateException("source already consumed or closed");
            }
            spliteratorMo12687N = (Spliterator) supplier.get();
            this.f33382a.f33389h = null;
        }
        AbstractC0655c abstractC0655c2 = this.f33382a;
        if (abstractC0655c2.f33393l && abstractC0655c2.f33391j) {
            AbstractC0655c abstractC0655c3 = abstractC0655c2.f33385d;
            int i4 = 1;
            while (abstractC0655c2 != this) {
                int i5 = abstractC0655c3.f33384c;
                if (abstractC0655c3.mo12674O()) {
                    if (EnumC0711u1.SHORT_CIRCUIT.m12740e(i5)) {
                        i5 &= EnumC0711u1.f33503t ^ (-1);
                    }
                    spliteratorMo12687N = abstractC0655c3.mo12687N(abstractC0655c2, spliteratorMo12687N);
                    if (spliteratorMo12687N.hasCharacteristics(64)) {
                        i2 = (EnumC0711u1.f33502s ^ (-1)) & i5;
                        i3 = EnumC0711u1.f33501r;
                    } else {
                        i2 = (EnumC0711u1.f33501r ^ (-1)) & i5;
                        i3 = EnumC0711u1.f33502s;
                    }
                    i5 = i3 | i2;
                    i4 = 0;
                }
                abstractC0655c3.f33386e = i4;
                abstractC0655c3.f33387f = EnumC0711u1.m12736a(i5, abstractC0655c2.f33387f);
                i4++;
                AbstractC0655c abstractC0655c4 = abstractC0655c3;
                abstractC0655c3 = abstractC0655c3.f33385d;
                abstractC0655c2 = abstractC0655c4;
            }
        }
        if (i != 0) {
            this.f33387f = EnumC0711u1.m12736a(i, this.f33387f);
        }
        return spliteratorMo12687N;
    }

    @Override // p021j$.util.stream.AbstractC0586F
    /* JADX INFO: renamed from: A */
    final InterfaceC0646Z0 mo12660A(Spliterator spliterator, InterfaceC0646Z0 interfaceC0646Z0) {
        interfaceC0646Z0.getClass();
        mo12662u(spliterator, mo12661B(interfaceC0646Z0));
        return interfaceC0646Z0;
    }

    @Override // p021j$.util.stream.AbstractC0586F
    /* JADX INFO: renamed from: B */
    final InterfaceC0646Z0 mo12661B(InterfaceC0646Z0 interfaceC0646Z0) {
        interfaceC0646Z0.getClass();
        for (AbstractC0655c abstractC0655c = this; abstractC0655c.f33386e > 0; abstractC0655c = abstractC0655c.f33383b) {
            interfaceC0646Z0 = abstractC0655c.mo12675P(abstractC0655c.f33383b.f33387f, interfaceC0646Z0);
        }
        return interfaceC0646Z0;
    }

    /* JADX INFO: renamed from: C */
    final InterfaceC0613O m12689C(Spliterator spliterator, boolean z, IntFunction intFunction) {
        if (this.f33382a.f33393l) {
            return mo12590F(this, spliterator, z, intFunction);
        }
        InterfaceC0598J interfaceC0598JMo12595y = mo12595y(mo12664w(spliterator), intFunction);
        mo12660A(spliterator, interfaceC0598JMo12595y);
        return interfaceC0598JMo12595y.mo12596a();
    }

    /* JADX INFO: renamed from: D */
    final Object m12690D(InterfaceC0641X1 interfaceC0641X1) {
        if (this.f33390i) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f33390i = true;
        return this.f33382a.f33393l ? interfaceC0641X1.mo12619c(this, m12688Q(interfaceC0641X1.mo12618b())) : interfaceC0641X1.mo12620d(this, m12688Q(interfaceC0641X1.mo12618b()));
    }

    /* JADX INFO: renamed from: E */
    final InterfaceC0613O m12691E(IntFunction intFunction) {
        if (this.f33390i) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f33390i = true;
        if (!this.f33382a.f33393l || this.f33383b == null || !mo12674O()) {
            return m12689C(m12688Q(0), true, intFunction);
        }
        this.f33386e = 0;
        AbstractC0655c abstractC0655c = this.f33383b;
        return mo12686M(abstractC0655c.m12688Q(0), abstractC0655c, intFunction);
    }

    /* JADX INFO: renamed from: F */
    abstract InterfaceC0613O mo12590F(AbstractC0586F abstractC0586F, Spliterator spliterator, boolean z, IntFunction intFunction);

    /* JADX INFO: renamed from: G */
    abstract boolean mo12591G(Spliterator spliterator, InterfaceC0646Z0 interfaceC0646Z0);

    /* JADX INFO: renamed from: H */
    abstract EnumC0714v1 mo12592H();

    /* JADX INFO: renamed from: I */
    final EnumC0714v1 m12692I() {
        AbstractC0655c abstractC0655c = this;
        while (abstractC0655c.f33386e > 0) {
            abstractC0655c = abstractC0655c.f33383b;
        }
        return abstractC0655c.mo12592H();
    }

    /* JADX INFO: renamed from: J */
    final boolean m12693J() {
        return EnumC0711u1.ORDERED.m12740e(this.f33387f);
    }

    /* JADX INFO: renamed from: K */
    final /* synthetic */ Spliterator m12694K() {
        return m12688Q(0);
    }

    /* JADX INFO: renamed from: L */
    abstract Spliterator mo12593L(Supplier supplier);

    /* JADX INFO: renamed from: M */
    InterfaceC0613O mo12686M(Spliterator spliterator, AbstractC0655c abstractC0655c, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    /* JADX INFO: renamed from: N */
    Spliterator mo12687N(AbstractC0655c abstractC0655c, Spliterator spliterator) {
        return mo12686M(spliterator, abstractC0655c, new C0652b(0)).spliterator();
    }

    /* JADX INFO: renamed from: O */
    abstract boolean mo12674O();

    /* JADX INFO: renamed from: P */
    abstract InterfaceC0646Z0 mo12675P(int i, InterfaceC0646Z0 interfaceC0646Z0);

    /* JADX INFO: renamed from: R */
    final Spliterator m12695R() {
        AbstractC0655c abstractC0655c = this.f33382a;
        if (this != abstractC0655c) {
            throw new IllegalStateException();
        }
        if (this.f33390i) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f33390i = true;
        Spliterator spliterator = abstractC0655c.f33388g;
        if (spliterator != null) {
            abstractC0655c.f33388g = null;
            return spliterator;
        }
        Supplier supplier = abstractC0655c.f33389h;
        if (supplier == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        Spliterator spliterator2 = (Spliterator) supplier.get();
        this.f33382a.f33389h = null;
        return spliterator2;
    }

    /* JADX INFO: renamed from: S */
    abstract Spliterator mo12594S(AbstractC0586F abstractC0586F, C0648a c0648a, boolean z);

    /* JADX INFO: renamed from: T */
    final Spliterator m12696T(Spliterator spliterator) {
        return this.f33386e == 0 ? spliterator : mo12594S(this, new C0648a(0, spliterator), this.f33382a.f33393l);
    }

    @Override // p021j$.util.stream.BaseStream
    /* JADX INFO: renamed from: a */
    public final boolean mo12606a() {
        return this.f33382a.f33393l;
    }

    @Override // p021j$.util.stream.BaseStream, java.lang.AutoCloseable
    public final void close() {
        this.f33390i = true;
        this.f33389h = null;
        this.f33388g = null;
        AbstractC0655c abstractC0655c = this.f33382a;
        Runnable runnable = abstractC0655c.f33392k;
        if (runnable != null) {
            abstractC0655c.f33392k = null;
            runnable.run();
        }
    }

    @Override // p021j$.util.stream.BaseStream
    public final BaseStream onClose(Runnable runnable) {
        if (this.f33390i) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        runnable.getClass();
        AbstractC0655c abstractC0655c = this.f33382a;
        Runnable runnable2 = abstractC0655c.f33392k;
        if (runnable2 != null) {
            runnable = new RunnableC0635V1(0, runnable2, runnable);
        }
        abstractC0655c.f33392k = runnable;
        return this;
    }

    public Spliterator spliterator() {
        if (this.f33390i) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        int i = 1;
        this.f33390i = true;
        AbstractC0655c abstractC0655c = this.f33382a;
        if (this != abstractC0655c) {
            return mo12594S(this, new C0648a(i, this), abstractC0655c.f33393l);
        }
        Spliterator spliterator = abstractC0655c.f33388g;
        if (spliterator != null) {
            abstractC0655c.f33388g = null;
            return spliterator;
        }
        Supplier supplier = abstractC0655c.f33389h;
        if (supplier == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        abstractC0655c.f33389h = null;
        return mo12593L(supplier);
    }

    @Override // p021j$.util.stream.AbstractC0586F
    /* JADX INFO: renamed from: u */
    final void mo12662u(Spliterator spliterator, InterfaceC0646Z0 interfaceC0646Z0) {
        interfaceC0646Z0.getClass();
        if (EnumC0711u1.SHORT_CIRCUIT.m12740e(this.f33387f)) {
            mo12663v(spliterator, interfaceC0646Z0);
            return;
        }
        interfaceC0646Z0.mo12599h(spliterator.getExactSizeIfKnown());
        spliterator.forEachRemaining(interfaceC0646Z0);
        interfaceC0646Z0.mo12598f();
    }

    @Override // p021j$.util.stream.AbstractC0586F
    /* JADX INFO: renamed from: v */
    final boolean mo12663v(Spliterator spliterator, InterfaceC0646Z0 interfaceC0646Z0) {
        AbstractC0655c abstractC0655c = this;
        while (abstractC0655c.f33386e > 0) {
            abstractC0655c = abstractC0655c.f33383b;
        }
        interfaceC0646Z0.mo12599h(spliterator.getExactSizeIfKnown());
        boolean zMo12591G = abstractC0655c.mo12591G(spliterator, interfaceC0646Z0);
        interfaceC0646Z0.mo12598f();
        return zMo12591G;
    }

    @Override // p021j$.util.stream.AbstractC0586F
    /* JADX INFO: renamed from: w */
    final long mo12664w(Spliterator spliterator) {
        if (EnumC0711u1.SIZED.m12740e(this.f33387f)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // p021j$.util.stream.AbstractC0586F
    /* JADX INFO: renamed from: x */
    final int mo12665x() {
        return this.f33387f;
    }

    AbstractC0655c(AbstractC0655c abstractC0655c, int i) {
        if (abstractC0655c.f33390i) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        abstractC0655c.f33390i = true;
        abstractC0655c.f33385d = this;
        this.f33383b = abstractC0655c;
        this.f33384c = EnumC0711u1.f33491h & i;
        this.f33387f = EnumC0711u1.m12736a(i, abstractC0655c.f33387f);
        AbstractC0655c abstractC0655c2 = abstractC0655c.f33382a;
        this.f33382a = abstractC0655c2;
        if (mo12674O()) {
            abstractC0655c2.f33391j = true;
        }
        this.f33386e = abstractC0655c.f33386e + 1;
    }

    AbstractC0655c(Supplier supplier, int i, boolean z) {
        this.f33383b = null;
        this.f33389h = supplier;
        this.f33382a = this;
        int i2 = EnumC0711u1.f33490g & i;
        this.f33384c = i2;
        this.f33387f = ((i2 << 1) ^ (-1)) & EnumC0711u1.f33495l;
        this.f33386e = 0;
        this.f33393l = z;
    }
}
