package p021j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.d1 */
/* JADX INFO: loaded from: classes3.dex */
final class C0660d1 extends AbstractC0658d {

    /* JADX INFO: renamed from: j */
    private final AbstractC0655c f33397j;

    /* JADX INFO: renamed from: k */
    private final IntFunction f33398k;

    /* JADX INFO: renamed from: l */
    private final long f33399l;

    /* JADX INFO: renamed from: m */
    private final long f33400m;

    /* JADX INFO: renamed from: n */
    private long f33401n;

    /* JADX INFO: renamed from: o */
    private volatile boolean f33402o;

    C0660d1(AbstractC0655c abstractC0655c, AbstractC0655c abstractC0655c2, Spliterator spliterator, IntFunction intFunction, long j, long j2) {
        super(abstractC0655c2, spliterator);
        this.f33397j = abstractC0655c;
        this.f33398k = intFunction;
        this.f33399l = j;
        this.f33400m = j2;
    }

    /* JADX INFO: renamed from: k */
    private long m12705k(long j) {
        if (this.f33402o) {
            return this.f33401n;
        }
        C0660d1 c0660d1 = (C0660d1) this.f33412d;
        C0660d1 c0660d2 = (C0660d1) this.f33413e;
        if (c0660d1 == null || c0660d2 == null) {
            return this.f33401n;
        }
        long jM12705k = c0660d1.m12705k(j);
        return jM12705k >= j ? jM12705k : jM12705k + c0660d2.m12705k(j);
    }

    @Override // p021j$.util.stream.AbstractC0664f
    /* JADX INFO: renamed from: a */
    protected final Object mo12622a() {
        if (m12710d() == null) {
            InterfaceC0598J interfaceC0598JMo12595y = this.f33397j.mo12595y(EnumC0711u1.SIZED.m12741f(this.f33397j.f33384c) ? this.f33397j.mo12664w(this.f33410b) : -1L, this.f33398k);
            InterfaceC0646Z0 interfaceC0646Z0Mo12675P = this.f33397j.mo12675P(this.f33409a.mo12665x(), interfaceC0598JMo12595y);
            AbstractC0586F abstractC0586F = this.f33409a;
            abstractC0586F.mo12663v(this.f33410b, abstractC0586F.mo12661B(interfaceC0646Z0Mo12675P));
            return interfaceC0598JMo12595y.mo12596a();
        }
        InterfaceC0598J interfaceC0598JMo12595y2 = this.f33397j.mo12595y(-1L, this.f33398k);
        if (this.f33399l == 0) {
            InterfaceC0646Z0 interfaceC0646Z0Mo12675P2 = this.f33397j.mo12675P(this.f33409a.mo12665x(), interfaceC0598JMo12595y2);
            AbstractC0586F abstractC0586F2 = this.f33409a;
            abstractC0586F2.mo12663v(this.f33410b, abstractC0586F2.mo12661B(interfaceC0646Z0Mo12675P2));
        } else {
            this.f33409a.mo12660A(this.f33410b, interfaceC0598JMo12595y2);
        }
        InterfaceC0613O interfaceC0613OMo12596a = interfaceC0598JMo12595y2.mo12596a();
        this.f33401n = interfaceC0613OMo12596a.count();
        this.f33402o = true;
        this.f33410b = null;
        return interfaceC0613OMo12596a;
    }

    @Override // p021j$.util.stream.AbstractC0664f
    /* JADX INFO: renamed from: e */
    protected final AbstractC0664f mo12623e(Spliterator spliterator) {
        return new C0660d1(this, spliterator);
    }

    @Override // p021j$.util.stream.AbstractC0658d
    /* JADX INFO: renamed from: h */
    protected final void mo12700h() {
        this.f33396i = true;
        if (this.f33402o) {
            mo12699f(mo12624j());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p021j$.util.stream.AbstractC0658d
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final AbstractC0674i0 mo12624j() {
        return AbstractC0584E0.m12633l(this.f33397j.mo12592H());
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0067  */
    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    @Override // p021j$.util.stream.AbstractC0664f, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        C0660d1 c0660d1;
        InterfaceC0613O interfaceC0613OM12632k;
        InterfaceC0613O interfaceC0613OMo12602q;
        boolean z;
        long jMin;
        AbstractC0664f abstractC0664f = this.f33412d;
        boolean z2 = true;
        if (!(abstractC0664f == null)) {
            this.f33401n = ((C0660d1) abstractC0664f).f33401n + ((C0660d1) this.f33413e).f33401n;
            if (this.f33396i) {
                this.f33401n = 0L;
            } else {
                if (this.f33401n != 0) {
                    interfaceC0613OM12632k = ((C0660d1) this.f33412d).f33401n == 0 ? (InterfaceC0613O) ((C0660d1) this.f33413e).mo12698c() : AbstractC0584E0.m12632k(this.f33397j.mo12592H(), (InterfaceC0613O) ((C0660d1) this.f33412d).mo12698c(), (InterfaceC0613O) ((C0660d1) this.f33413e).mo12698c());
                }
                interfaceC0613OMo12602q = interfaceC0613OM12632k;
                if (m12710d() == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (this.f33400m >= 0) {
                        jMin = Math.min(interfaceC0613OMo12602q.count(), this.f33399l + this.f33400m);
                    } else {
                        jMin = this.f33401n;
                    }
                    interfaceC0613OMo12602q = interfaceC0613OMo12602q.mo12602q(this.f33399l, jMin, this.f33398k);
                }
                mo12699f(interfaceC0613OMo12602q);
                this.f33402o = true;
            }
            interfaceC0613OM12632k = mo12624j();
            interfaceC0613OMo12602q = interfaceC0613OM12632k;
            if (m12710d() == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (this.f33400m >= 0) {
                    jMin = Math.min(interfaceC0613OMo12602q.count(), this.f33399l + this.f33400m);
                } else {
                    jMin = this.f33401n;
                }
                interfaceC0613OMo12602q = interfaceC0613OMo12602q.mo12602q(this.f33399l, jMin, this.f33398k);
            }
            mo12699f(interfaceC0613OMo12602q);
            this.f33402o = true;
        }
        if (this.f33400m >= 0) {
            if (!(m12710d() == null)) {
                long j = this.f33399l + this.f33400m;
                long jM12705k = this.f33402o ? this.f33401n : m12705k(j);
                if (jM12705k < j) {
                    C0660d1 c0660d2 = (C0660d1) m12710d();
                    Object obj = this;
                    while (true) {
                        if (c0660d2 == null) {
                            if (jM12705k >= j) {
                                break;
                            }
                            z2 = false;
                            break;
                        } else {
                            if (obj == c0660d2.f33413e && (c0660d1 = (C0660d1) c0660d2.f33412d) != null) {
                                jM12705k += c0660d1.m12705k(j);
                                if (jM12705k >= j) {
                                    break;
                                }
                            }
                            obj = c0660d2;
                            c0660d2 = (C0660d1) c0660d2.m12710d();
                        }
                    }
                }
                if (z2) {
                    m12701i();
                }
            }
        }
        super.onCompletion(countedCompleter);
    }

    C0660d1(C0660d1 c0660d1, Spliterator spliterator) {
        super(c0660d1, spliterator);
        this.f33397j = c0660d1.f33397j;
        this.f33398k = c0660d1.f33398k;
        this.f33399l = c0660d1.f33399l;
        this.f33400m = c0660d1.f33400m;
    }
}
