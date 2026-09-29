package kotlinx.coroutines.flow;

import ae.C0062b;
import dm.C5207g;
import java.util.Arrays;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.internal.C7168r;
import no.C7831g;
import no.C7843k;
import no.InterfaceC7838i0;
import no.InterfaceC7875v0;
import p260m8.C7499b;
import p349qo.AbstractC8655a;
import p349qo.AbstractC8657c;
import p349qo.C8656b;
import p349qo.C8658d;
import p349qo.InterfaceC8661g;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.s */
/* JADX INFO: loaded from: classes2.dex */
public class C7138s<T> extends AbstractC8655a<C7139t> implements InterfaceC7132m<T>, InterfaceC7116c, InterfaceC8661g<T> {

    /* JADX INFO: renamed from: e */
    public final int f40372e;

    /* JADX INFO: renamed from: f */
    public final int f40373f;

    /* JADX INFO: renamed from: g */
    public final BufferOverflow f40374g;

    /* JADX INFO: renamed from: h */
    public Object[] f40375h;

    /* JADX INFO: renamed from: i */
    public long f40376i;

    /* JADX INFO: renamed from: j */
    public long f40377j;

    /* JADX INFO: renamed from: k */
    public int f40378k;

    /* JADX INFO: renamed from: l */
    public int f40379l;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.s$a */
    public static final class a implements InterfaceC7838i0 {

        /* JADX INFO: renamed from: a */
        public final C7138s<?> f40380a;

        /* JADX INFO: renamed from: b */
        public final long f40381b;

        /* JADX INFO: renamed from: c */
        public final Object f40382c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC9968c<C9072e> f40383d;

        public a(C7138s c7138s, long j10, Object obj, C7843k c7843k) {
            this.f40380a = c7138s;
            this.f40381b = j10;
            this.f40382c = obj;
            this.f40383d = c7843k;
        }

        @Override // no.InterfaceC7838i0
        /* JADX INFO: renamed from: a */
        public final void mo14330a() {
            C7138s<?> c7138s = this.f40380a;
            synchronized (c7138s) {
                try {
                    if (this.f40381b < c7138s.m14395q()) {
                        return;
                    }
                    Object[] objArr = c7138s.f40375h;
                    C5207g.m11108c(objArr);
                    int i10 = (int) this.f40381b;
                    if (objArr[(objArr.length - 1) & i10] != this) {
                        return;
                    }
                    objArr[i10 & (objArr.length - 1)] = C0062b.f163j;
                    c7138s.m14391i();
                    C9072e c9072e = C9072e.f47360a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.s$b */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f40384a;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
            iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            f40384a = iArr;
        }
    }

    public C7138s(int i10, int i11, BufferOverflow bufferOverflow) {
        this.f40372e = i10;
        this.f40373f = i11;
        this.f40374g = bufferOverflow;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00cc A[Catch: all -> 0x0052, TryCatch #2 {all -> 0x0052, blocks: (B:19:0x004d, B:40:0x00ab, B:42:0x00b5, B:47:0x00cc, B:50:0x00d4, B:51:0x00da, B:53:0x00dc), top: B:65:0x004d }] */
    /* JADX WARN: Code duplicated, block: B:69:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: m */
    public static CoroutineSingletons m14389m(C7138s c7138s, InterfaceC7117d interfaceC7117d, InterfaceC9968c interfaceC9968c) throws Throwable {
        SharedFlowImpl$collect$1 sharedFlowImpl$collect$1;
        C7139t c7139t;
        InterfaceC7117d interfaceC7117d2;
        C7139t c7139t2;
        C7138s c7138s2;
        Throwable th2;
        InterfaceC7875v0 interfaceC7875v0;
        InterfaceC7117d interfaceC7117d3;
        Object objM14399v;
        C7138s c7138s3 = c7138s;
        if (interfaceC9968c instanceof SharedFlowImpl$collect$1) {
            sharedFlowImpl$collect$1 = (SharedFlowImpl$collect$1) interfaceC9968c;
            int i10 = sharedFlowImpl$collect$1.f40248j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                sharedFlowImpl$collect$1.f40248j = i10 - Integer.MIN_VALUE;
            } else {
                sharedFlowImpl$collect$1 = new SharedFlowImpl$collect$1(c7138s3, interfaceC9968c);
            }
        } else {
            sharedFlowImpl$collect$1 = new SharedFlowImpl$collect$1(c7138s3, interfaceC9968c);
        }
        Object obj = sharedFlowImpl$collect$1.f40246h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = sharedFlowImpl$collect$1.f40248j;
        if (i11 == 0) {
            C7499b.m14977z0(obj);
            c7139t = (C7139t) c7138s3.m16871d();
            try {
                if (interfaceC7117d instanceof C7144y) {
                    sharedFlowImpl$collect$1.f40242d = c7138s3;
                    sharedFlowImpl$collect$1.f40243e = interfaceC7117d;
                    sharedFlowImpl$collect$1.f40244f = c7139t;
                    sharedFlowImpl$collect$1.f40248j = 1;
                    if (((C7144y) interfaceC7117d).m14404a(sharedFlowImpl$collect$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                interfaceC7117d2 = interfaceC7117d;
                c7139t2 = c7139t;
                CoroutineContext coroutineContext = sharedFlowImpl$collect$1.f38105b;
                C5207g.m11108c(coroutineContext);
                c7138s2 = c7138s3;
                interfaceC7875v0 = (InterfaceC7875v0) coroutineContext.mo1474w(InterfaceC7875v0.b.f42976a);
                interfaceC7117d3 = interfaceC7117d2;
                while (true) {
                    objM14399v = c7138s2.m14399v(c7139t2);
                    if (objM14399v == C0062b.f163j) {
                        sharedFlowImpl$collect$1.f40242d = c7138s2;
                        sharedFlowImpl$collect$1.f40243e = interfaceC7117d3;
                        sharedFlowImpl$collect$1.f40244f = c7139t2;
                        sharedFlowImpl$collect$1.f40245g = interfaceC7875v0;
                        sharedFlowImpl$collect$1.f40248j = 2;
                        if (c7138s2.m14390h(c7139t2, sharedFlowImpl$collect$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (interfaceC7875v0 != null) {
                            throw interfaceC7875v0.mo15617Q();
                        }
                        sharedFlowImpl$collect$1.f40242d = c7138s2;
                        sharedFlowImpl$collect$1.f40243e = interfaceC7117d3;
                        sharedFlowImpl$collect$1.f40244f = c7139t2;
                        sharedFlowImpl$collect$1.f40245g = interfaceC7875v0;
                        sharedFlowImpl$collect$1.f40248j = 3;
                        if (interfaceC7117d3.mo1339r(objM14399v, sharedFlowImpl$collect$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else if (i11 == 1) {
            c7139t2 = sharedFlowImpl$collect$1.f40244f;
            InterfaceC7117d interfaceC7117d4 = sharedFlowImpl$collect$1.f40243e;
            C7138s c7138s4 = sharedFlowImpl$collect$1.f40242d;
            try {
                C7499b.m14977z0(obj);
                interfaceC7117d2 = interfaceC7117d4;
                c7138s3 = c7138s4;
                try {
                    CoroutineContext coroutineContext2 = sharedFlowImpl$collect$1.f38105b;
                    C5207g.m11108c(coroutineContext2);
                    c7138s2 = c7138s3;
                    interfaceC7875v0 = (InterfaceC7875v0) coroutineContext2.mo1474w(InterfaceC7875v0.b.f42976a);
                    interfaceC7117d3 = interfaceC7117d2;
                    while (true) {
                        objM14399v = c7138s2.m14399v(c7139t2);
                        if (objM14399v == C0062b.f163j) {
                            sharedFlowImpl$collect$1.f40242d = c7138s2;
                            sharedFlowImpl$collect$1.f40243e = interfaceC7117d3;
                            sharedFlowImpl$collect$1.f40244f = c7139t2;
                            sharedFlowImpl$collect$1.f40245g = interfaceC7875v0;
                            sharedFlowImpl$collect$1.f40248j = 2;
                            if (c7138s2.m14390h(c7139t2, sharedFlowImpl$collect$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (interfaceC7875v0 != null) {
                                throw interfaceC7875v0.mo15617Q();
                            }
                            sharedFlowImpl$collect$1.f40242d = c7138s2;
                            sharedFlowImpl$collect$1.f40243e = interfaceC7117d3;
                            sharedFlowImpl$collect$1.f40244f = c7139t2;
                            sharedFlowImpl$collect$1.f40245g = interfaceC7875v0;
                            sharedFlowImpl$collect$1.f40248j = 3;
                            if (interfaceC7117d3.mo1339r(objM14399v, sharedFlowImpl$collect$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    c7138s2 = c7138s3;
                    th2 = th4;
                    c7139t = c7139t2;
                    th = th2;
                    c7138s3 = c7138s2;
                    c7138s3.m16872g(c7139t);
                    throw th;
                }
            } catch (Throwable th5) {
                c7139t = c7139t2;
                th = th5;
                c7138s3 = c7138s4;
            }
        } else {
            if (i11 != 2 && i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC7875v0 = sharedFlowImpl$collect$1.f40245g;
            c7139t2 = sharedFlowImpl$collect$1.f40244f;
            InterfaceC7117d interfaceC7117d5 = sharedFlowImpl$collect$1.f40243e;
            c7138s2 = sharedFlowImpl$collect$1.f40242d;
            try {
                C7499b.m14977z0(obj);
                interfaceC7117d3 = interfaceC7117d5;
                while (true) {
                    objM14399v = c7138s2.m14399v(c7139t2);
                    if (objM14399v == C0062b.f163j) {
                        sharedFlowImpl$collect$1.f40242d = c7138s2;
                        sharedFlowImpl$collect$1.f40243e = interfaceC7117d3;
                        sharedFlowImpl$collect$1.f40244f = c7139t2;
                        sharedFlowImpl$collect$1.f40245g = interfaceC7875v0;
                        sharedFlowImpl$collect$1.f40248j = 2;
                        if (c7138s2.m14390h(c7139t2, sharedFlowImpl$collect$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (interfaceC7875v0 != null && !interfaceC7875v0.mo15547b()) {
                            throw interfaceC7875v0.mo15617Q();
                        }
                        sharedFlowImpl$collect$1.f40242d = c7138s2;
                        sharedFlowImpl$collect$1.f40243e = interfaceC7117d3;
                        sharedFlowImpl$collect$1.f40244f = c7139t2;
                        sharedFlowImpl$collect$1.f40245g = interfaceC7875v0;
                        sharedFlowImpl$collect$1.f40248j = 3;
                        if (interfaceC7117d3.mo1339r(objM14399v, sharedFlowImpl$collect$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
            } catch (Throwable th6) {
                th2 = th6;
                c7139t = c7139t2;
                th = th2;
                c7138s3 = c7138s2;
                c7138s3.m16872g(c7139t);
                throw th;
            }
        }
        c7138s3.m16872g(c7139t);
        throw th;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC7116c
    /* JADX INFO: renamed from: a */
    public final Object mo9539a(InterfaceC7117d<? super T> interfaceC7117d, InterfaceC9968c<?> interfaceC9968c) {
        return m14389m(this, interfaceC7117d, interfaceC9968c);
    }

    @Override // p349qo.InterfaceC8661g
    /* JADX INFO: renamed from: b */
    public final InterfaceC7116c<T> mo14365b(CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow) {
        if (i10 == 0 || i10 == -3) {
            if (bufferOverflow == BufferOverflow.SUSPEND) {
                return this;
            }
        }
        return new C8658d(i10, coroutineContext, bufferOverflow, this);
    }

    @Override // p349qo.AbstractC8655a
    /* JADX INFO: renamed from: e */
    public final AbstractC8657c mo14367e() {
        return new C7139t();
    }

    @Override // p349qo.AbstractC8655a
    /* JADX INFO: renamed from: f */
    public final AbstractC8657c[] mo14368f() {
        return new C7139t[2];
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h */
    public final Object m14390h(C7139t c7139t, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        C7843k c7843k = new C7843k(1, C8656b.m16874A(interfaceC9968c));
        c7843k.m15594r();
        synchronized (this) {
            try {
                if (m14398u(c7139t) < 0) {
                    c7139t.f40386b = c7843k;
                } else {
                    c7843k.mo2031y(C9072e.f47360a);
                }
                C9072e c9072e = C9072e.f47360a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object objM15593p = c7843k.m15593p();
        return objM15593p == CoroutineSingletons.COROUTINE_SUSPENDED ? objM15593p : C9072e.f47360a;
    }

    /* JADX INFO: renamed from: i */
    public final void m14391i() {
        if (this.f40373f != 0 || this.f40379l > 1) {
            Object[] objArr = this.f40375h;
            C5207g.m11108c(objArr);
            while (this.f40379l > 0) {
                long jM14395q = m14395q();
                int i10 = this.f40378k;
                int i11 = this.f40379l;
                if (objArr[((int) ((jM14395q + ((long) (i10 + i11))) - 1)) & (objArr.length - 1)] != C0062b.f163j) {
                    return;
                }
                this.f40379l = i11 - 1;
                objArr[((int) (m14395q() + ((long) (this.f40378k + this.f40379l)))) & (objArr.length - 1)] = null;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlinx.coroutines.flow.InterfaceC7132m
    /* JADX INFO: renamed from: j */
    public final void mo14370j() {
        synchronized (this) {
            m14400w(m14395q() + ((long) this.f40378k), this.f40377j, m14395q() + ((long) this.f40378k), m14395q() + ((long) this.f40378k) + ((long) this.f40379l));
            C9072e c9072e = C9072e.f47360a;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlinx.coroutines.flow.InterfaceC7132m
    /* JADX INFO: renamed from: k */
    public final boolean mo14371k(T t10) {
        int i10;
        boolean z10;
        InterfaceC9968c<C9072e>[] interfaceC9968cArrM14394p = C8656b.f46236d;
        synchronized (this) {
            if (m14397t(t10)) {
                interfaceC9968cArrM14394p = m14394p(interfaceC9968cArrM14394p);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (InterfaceC9968c<C9072e> interfaceC9968c : interfaceC9968cArrM14394p) {
            if (interfaceC9968c != null) {
                interfaceC9968c.mo2031y(C9072e.f47360a);
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: n */
    public final void m14392n() {
        Object[] objArr;
        Object[] objArr2 = this.f40375h;
        C5207g.m11108c(objArr2);
        objArr2[((int) m14395q()) & (objArr2.length - 1)] = null;
        this.f40378k--;
        long jM14395q = m14395q() + 1;
        if (this.f40376i < jM14395q) {
            this.f40376i = jM14395q;
        }
        if (this.f40377j < jM14395q) {
            if (this.f46233b != 0 && (objArr = this.f46232a) != null) {
                for (Object obj : objArr) {
                    if (obj != null) {
                        C7139t c7139t = (C7139t) obj;
                        long j10 = c7139t.f40385a;
                        if (j10 >= 0 && j10 < jM14395q) {
                            c7139t.f40385a = jM14395q;
                        }
                    }
                }
            }
            this.f40377j = jM14395q;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m14393o(Object obj) {
        int i10 = this.f40378k + this.f40379l;
        Object[] objArrM14396s = this.f40375h;
        if (objArrM14396s == null) {
            objArrM14396s = m14396s(0, 2, null);
        } else if (i10 >= objArrM14396s.length) {
            objArrM14396s = m14396s(i10, objArrM14396s.length * 2, objArrM14396s);
        }
        objArrM14396s[((int) (m14395q() + ((long) i10))) & (objArrM14396s.length - 1)] = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [wl.c<sl.e>[]] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX INFO: renamed from: p */
    public final InterfaceC9968c<C9072e>[] m14394p(InterfaceC9968c<C9072e>[] interfaceC9968cArr) {
        Object[] objArr;
        ?? r14;
        int length = interfaceC9968cArr.length;
        if (this.f46233b != 0 && (objArr = this.f46232a) != null) {
            int length2 = objArr.length;
            int i10 = 0;
            while (i10 < length2) {
                Object obj = objArr[i10];
                if (obj == null) {
                    interfaceC9968cArr = interfaceC9968cArr;
                    interfaceC9968cArr = interfaceC9968cArr;
                    interfaceC9968cArr = interfaceC9968cArr;
                    interfaceC9968cArr = interfaceC9968cArr;
                    interfaceC9968cArr = interfaceC9968cArr;
                } else {
                    C7139t c7139t = (C7139t) obj;
                    C7843k c7843k = c7139t.f40386b;
                    if (c7843k == null) {
                        interfaceC9968cArr = interfaceC9968cArr;
                        interfaceC9968cArr = interfaceC9968cArr;
                    } else {
                        if (m14398u(c7139t) >= 0) {
                            if (length >= interfaceC9968cArr.length) {
                                interfaceC9968cArr = interfaceC9968cArr;
                                interfaceC9968cArr = interfaceC9968cArr;
                                interfaceC9968cArr = interfaceC9968cArr;
                                r14 = interfaceC9968cArr;
                                Object[] objArrCopyOf = Arrays.copyOf((Object[]) interfaceC9968cArr, Math.max(2, interfaceC9968cArr.length * 2));
                                C5207g.m11110e(objArrCopyOf, "copyOf(this, newSize)");
                                r14 = objArrCopyOf;
                            }
                            interfaceC9968cArr = interfaceC9968cArr;
                            interfaceC9968cArr = interfaceC9968cArr;
                            interfaceC9968cArr = interfaceC9968cArr;
                            r14 = interfaceC9968cArr;
                            ((InterfaceC9968c[]) r14)[length] = c7843k;
                            c7139t.f40386b = null;
                            length++;
                            interfaceC9968cArr = r14;
                        }
                        interfaceC9968cArr = interfaceC9968cArr;
                        interfaceC9968cArr = interfaceC9968cArr;
                        interfaceC9968cArr = interfaceC9968cArr;
                        interfaceC9968cArr = interfaceC9968cArr;
                        interfaceC9968cArr = interfaceC9968cArr;
                    }
                }
                i10++;
                interfaceC9968cArr = interfaceC9968cArr;
            }
            interfaceC9968cArr = interfaceC9968cArr;
        }
        return (InterfaceC9968c[]) interfaceC9968cArr;
    }

    /* JADX INFO: renamed from: q */
    public final long m14395q() {
        return Math.min(this.f40377j, this.f40376i);
    }

    @Override // kotlinx.coroutines.flow.InterfaceC7117d
    /* JADX INFO: renamed from: r */
    public final Object mo1339r(T t10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        InterfaceC9968c<C9072e>[] interfaceC9968cArrM14394p;
        a aVar;
        if (mo14371k(t10)) {
            return C9072e.f47360a;
        }
        C7843k c7843k = new C7843k(1, C8656b.m16874A(interfaceC9968c));
        c7843k.m15594r();
        InterfaceC9968c<C9072e>[] interfaceC9968cArrM14394p2 = C8656b.f46236d;
        synchronized (this) {
            try {
                if (m14397t(t10)) {
                    c7843k.mo2031y(C9072e.f47360a);
                    interfaceC9968cArrM14394p = m14394p(interfaceC9968cArrM14394p2);
                    aVar = null;
                } else {
                    a aVar2 = new a(this, ((long) (this.f40378k + this.f40379l)) + m14395q(), t10, c7843k);
                    m14393o(aVar2);
                    this.f40379l++;
                    if (this.f40373f == 0) {
                        interfaceC9968cArrM14394p2 = m14394p(interfaceC9968cArrM14394p2);
                    }
                    interfaceC9968cArrM14394p = interfaceC9968cArrM14394p2;
                    aVar = aVar2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (aVar != null) {
            c7843k.mo15577R(new C7831g(1, aVar));
        }
        for (InterfaceC9968c<C9072e> interfaceC9968c2 : interfaceC9968cArrM14394p) {
            if (interfaceC9968c2 != null) {
                interfaceC9968c2.mo2031y(C9072e.f47360a);
            }
        }
        Object objM15593p = c7843k.m15593p();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (objM15593p != coroutineSingletons) {
            objM15593p = C9072e.f47360a;
        }
        return objM15593p == coroutineSingletons ? objM15593p : C9072e.f47360a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: s */
    public final Object[] m14396s(int i10, int i11, Object[] objArr) {
        if (!(i11 > 0)) {
            throw new IllegalStateException("Buffer size overflow".toString());
        }
        Object[] objArr2 = new Object[i11];
        this.f40375h = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long jM14395q = m14395q();
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = (int) (((long) i12) + jM14395q);
            objArr2[i13 & (i11 - 1)] = objArr[(objArr.length - 1) & i13];
        }
        return objArr2;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m14397t(T t10) {
        int i10 = this.f46233b;
        int i11 = this.f40372e;
        if (i10 == 0) {
            if (i11 != 0) {
                m14393o(t10);
                int i12 = this.f40378k + 1;
                this.f40378k = i12;
                if (i12 > i11) {
                    m14392n();
                }
                this.f40377j = m14395q() + ((long) this.f40378k);
            }
            return true;
        }
        int i13 = this.f40378k;
        int i14 = this.f40373f;
        if (i13 >= i14 && this.f40377j <= this.f40376i) {
            int i15 = b.f40384a[this.f40374g.ordinal()];
            if (i15 == 1) {
                return false;
            }
            if (i15 == 2) {
                return true;
            }
        }
        m14393o(t10);
        int i16 = this.f40378k + 1;
        this.f40378k = i16;
        if (i16 > i14) {
            m14392n();
        }
        long jM14395q = m14395q() + ((long) this.f40378k);
        long j10 = this.f40376i;
        if (((int) (jM14395q - j10)) > i11) {
            m14400w(j10 + 1, this.f40377j, m14395q() + ((long) this.f40378k), m14395q() + ((long) this.f40378k) + ((long) this.f40379l));
        }
        return true;
    }

    /* JADX INFO: renamed from: u */
    public final long m14398u(C7139t c7139t) {
        long j10 = c7139t.f40385a;
        if (j10 < m14395q() + ((long) this.f40378k)) {
            return j10;
        }
        if (this.f40373f <= 0 && j10 <= m14395q() && this.f40379l != 0) {
            return j10;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: v */
    public final Object m14399v(C7139t c7139t) {
        Object obj;
        InterfaceC9968c<C9072e>[] interfaceC9968cArrM14401x = C8656b.f46236d;
        synchronized (this) {
            try {
                long jM14398u = m14398u(c7139t);
                if (jM14398u < 0) {
                    obj = C0062b.f163j;
                } else {
                    long j10 = c7139t.f40385a;
                    Object[] objArr = this.f40375h;
                    C5207g.m11108c(objArr);
                    Object obj2 = objArr[((int) jM14398u) & (objArr.length - 1)];
                    if (obj2 instanceof a) {
                        obj2 = ((a) obj2).f40382c;
                    }
                    c7139t.f40385a = jM14398u + 1;
                    Object obj3 = obj2;
                    interfaceC9968cArrM14401x = m14401x(j10);
                    obj = obj3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (InterfaceC9968c<C9072e> interfaceC9968c : interfaceC9968cArrM14401x) {
            if (interfaceC9968c != null) {
                interfaceC9968c.mo2031y(C9072e.f47360a);
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: w */
    public final void m14400w(long j10, long j11, long j12, long j13) {
        long jMin = Math.min(j11, j10);
        for (long jM14395q = m14395q(); jM14395q < jMin; jM14395q++) {
            Object[] objArr = this.f40375h;
            C5207g.m11108c(objArr);
            objArr[((int) jM14395q) & (objArr.length - 1)] = null;
        }
        this.f40376i = j10;
        this.f40377j = j11;
        this.f40378k = (int) (j12 - jMin);
        this.f40379l = (int) (j13 - j12);
    }

    /* JADX INFO: renamed from: x */
    public final InterfaceC9968c<C9072e>[] m14401x(long j10) {
        long j11;
        long j12;
        long j13;
        Object[] objArr;
        long j14 = this.f40377j;
        InterfaceC9968c<C9072e>[] interfaceC9968cArr = C8656b.f46236d;
        if (j10 > j14) {
            return interfaceC9968cArr;
        }
        long jM14395q = m14395q();
        long j15 = ((long) this.f40378k) + jM14395q;
        int i10 = this.f40373f;
        if (i10 == 0 && this.f40379l > 0) {
            j15++;
        }
        if (this.f46233b != 0 && (objArr = this.f46232a) != null) {
            for (Object obj : objArr) {
                if (obj != null) {
                    long j16 = ((C7139t) obj).f40385a;
                    if (j16 >= 0 && j16 < j15) {
                        j15 = j16;
                    }
                }
            }
        }
        if (j15 <= this.f40377j) {
            return interfaceC9968cArr;
        }
        long jM14395q2 = m14395q() + ((long) this.f40378k);
        int iMin = this.f46233b > 0 ? Math.min(this.f40379l, i10 - ((int) (jM14395q2 - j15))) : this.f40379l;
        long j17 = ((long) this.f40379l) + jM14395q2;
        C7168r c7168r = C0062b.f163j;
        if (iMin > 0) {
            interfaceC9968cArr = new InterfaceC9968c[iMin];
            Object[] objArr2 = this.f40375h;
            C5207g.m11108c(objArr2);
            long j18 = jM14395q2;
            int i11 = 0;
            while (true) {
                if (jM14395q2 >= j17) {
                    j11 = j15;
                    j12 = j17;
                    break;
                }
                j11 = j15;
                int i12 = (int) jM14395q2;
                Object obj2 = objArr2[(objArr2.length - 1) & i12];
                if (obj2 == c7168r) {
                    j12 = j17;
                    j13 = 1;
                } else {
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    }
                    a aVar = (a) obj2;
                    j12 = j17;
                    int i13 = i11 + 1;
                    interfaceC9968cArr[i11] = aVar.f40383d;
                    objArr2[i12 & (objArr2.length - 1)] = c7168r;
                    objArr2[((int) j18) & (objArr2.length - 1)] = aVar.f40382c;
                    j13 = 1;
                    j18++;
                    if (i13 >= iMin) {
                        break;
                    }
                    i11 = i13;
                }
                jM14395q2 += j13;
                j15 = j11;
                j17 = j12;
            }
            jM14395q2 = j18;
        } else {
            j11 = j15;
            j12 = j17;
        }
        InterfaceC9968c<C9072e>[] interfaceC9968cArr2 = interfaceC9968cArr;
        int i14 = (int) (jM14395q2 - jM14395q);
        long j19 = this.f46233b == 0 ? jM14395q2 : j11;
        long jMax = Math.max(this.f40376i, jM14395q2 - ((long) Math.min(this.f40372e, i14)));
        if (i10 == 0 && jMax < j12) {
            Object[] objArr3 = this.f40375h;
            C5207g.m11108c(objArr3);
            if (C5207g.m11106a(objArr3[((int) jMax) & (objArr3.length - 1)], c7168r)) {
                jM14395q2++;
                jMax++;
            }
        }
        m14400w(jMax, j19, jM14395q2, j12);
        m14391i();
        return (interfaceC9968cArr2.length == 0) ^ true ? m14394p(interfaceC9968cArr2) : interfaceC9968cArr2;
    }
}
