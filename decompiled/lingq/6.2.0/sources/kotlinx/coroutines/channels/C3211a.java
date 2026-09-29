package kotlinx.coroutines.channels;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.AbstractC3193b;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.selects.C3247b;
import kotlinx.coroutines.selects.TrySelectDetailedResult;
import p000.AbstractC3184kh;
import p000.AbstractC3352my;
import p000.AbstractC3584sr;
import p000.C0842cc;
import p000.C3386nv;
import p000.a2b;
import p000.au8;
import p000.cu0;
import p000.do7;
import p000.ej0;
import p000.fa4;
import p000.fj0;
import p000.gg1;
import p000.gm5;
import p000.gu8;
import p000.hn1;
import p000.ho2;
import p000.hu0;
import p000.ig9;
import p000.ij6;
import p000.iu0;
import p000.ju0;
import p000.ku0;
import p000.lda;
import p000.m7d;
import p000.ny8;
import p000.qm0;
import p000.ri0;
import p000.sm0;
import p000.uk9;
import p000.ux5;
import p000.vi3;
import p000.vk9;
import p000.vz1;
import p000.w18;
import p000.xfa;
import p000.z1b;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.a */
/* JADX INFO: loaded from: classes.dex */
public class C3211a implements cu0 {

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ long f47781H;

    /* JADX INFO: renamed from: I */
    public static final /* synthetic */ long f47782I;

    /* JADX INFO: renamed from: J */
    public static final /* synthetic */ long f47783J;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicLongFieldUpdater f47784b = AtomicLongFieldUpdater.newUpdater(C3211a.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicLongFieldUpdater f47785c = AtomicLongFieldUpdater.newUpdater(C3211a.class, "receivers$volatile");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicLongFieldUpdater f47786d = AtomicLongFieldUpdater.newUpdater(C3211a.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicLongFieldUpdater f47787e = AtomicLongFieldUpdater.newUpdater(C3211a.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f47788f = AtomicReferenceFieldUpdater.newUpdater(C3211a.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f47789g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f47790h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f47791i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f47792j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ long f47793k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ long f47794l;
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* JADX INFO: renamed from: a */
    public final int f47795a;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    static {
        Unsafe unsafe = m7d.f50741a;
        f47783J = unsafe.objectFieldOffset(C3211a.class.getDeclaredField("sendSegment$volatile"));
        f47789g = AtomicReferenceFieldUpdater.newUpdater(C3211a.class, Object.class, "receiveSegment$volatile");
        f47782I = unsafe.objectFieldOffset(C3211a.class.getDeclaredField("receiveSegment$volatile"));
        f47790h = AtomicReferenceFieldUpdater.newUpdater(C3211a.class, Object.class, "bufferEndSegment$volatile");
        f47794l = unsafe.objectFieldOffset(C3211a.class.getDeclaredField("bufferEndSegment$volatile"));
        f47791i = AtomicReferenceFieldUpdater.newUpdater(C3211a.class, Object.class, "_closeCause$volatile");
        f47793k = unsafe.objectFieldOffset(C3211a.class.getDeclaredField("_closeCause$volatile"));
        f47792j = AtomicReferenceFieldUpdater.newUpdater(C3211a.class, Object.class, "closeHandler$volatile");
        f47781H = unsafe.objectFieldOffset(C3211a.class.getDeclaredField("closeHandler$volatile"));
    }

    public C3211a(int i) {
        this.f47795a = i;
        if (i < 0) {
            C3386nv.m17624j(ux5.m22989l("Invalid channel capacity: ", i, ", should be >=0"));
            throw null;
        }
        ku0 ku0Var = fj0.f39170a;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f47786d.get(this);
        ku0 ku0Var2 = new ku0(0L, null, this, 3);
        this.sendSegment$volatile = ku0Var2;
        this.receiveSegment$volatile = ku0Var2;
        if (m15458F()) {
            ku0Var2 = fj0.f39170a;
            ku0Var2.getClass();
        }
        this.bufferEndSegment$volatile = ku0Var2;
        this._closeCause$volatile = fj0.f39188s;
    }

    /* JADX INFO: renamed from: I */
    public static Object m15448I(C3211a c3211a, SuspendLambda suspendLambda) throws Throwable {
        ku0 ku0Var;
        Throwable th;
        ku0 ku0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f47789g;
        atomicReferenceFieldUpdater.getClass();
        if (c3211a == null) {
            ho2.m13383c();
            return null;
        }
        ku0 ku0Var3 = (ku0) m7d.f50741a.getObjectVolatile(c3211a, f47782I);
        while (!c3211a.m15456C()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f47785c;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(c3211a);
            long j = fj0.f39171b;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (ku0Var3.f7522e != j2) {
                ku0 ku0VarM15476r = c3211a.m15476r(j2, ku0Var3);
                if (ku0VarM15476r == null) {
                    continue;
                } else {
                    ku0Var = ku0VarM15476r;
                }
            } else {
                ku0Var = ku0Var3;
            }
            C3211a c3211a2 = c3211a;
            Object objM15466Q = c3211a2.m15466Q(ku0Var, i, andIncrement, null);
            C0842cc c0842cc = fj0.f39182m;
            if (objM15466Q == c0842cc) {
                C3386nv.m17633t("unexpected");
                return null;
            }
            C0842cc c0842cc2 = fj0.f39184o;
            if (objM15466Q == c0842cc2) {
                if (andIncrement < c3211a2.m15481w()) {
                    ku0Var.m12572a();
                }
                c3211a = c3211a2;
                ku0Var3 = ku0Var;
            } else {
                if (objM15466Q != fj0.f39183n) {
                    ku0Var.m12572a();
                    return objM15466Q;
                }
                sm0 sm0VarM17086E = AbstractC3352my.m17086E(AbstractC3584sr.m21600K(suspendLambda));
                try {
                    Object objM15466Q2 = c3211a2.m15466Q(ku0Var, i, andIncrement, sm0VarM17086E);
                    if (objM15466Q2 != c0842cc) {
                        if (objM15466Q2 == c0842cc2) {
                            if (andIncrement < c3211a2.m15481w()) {
                                ku0Var.m12572a();
                            }
                            ku0 ku0Var4 = (ku0) atomicReferenceFieldUpdater.get(c3211a2);
                            while (true) {
                                if (c3211a2.m15456C()) {
                                    sm0VarM17086E.resumeWith(new Result.Failure(c3211a2.m15479u()));
                                    break;
                                }
                                sm0 sm0Var = sm0VarM17086E;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(c3211a2);
                                    long j3 = fj0.f39171b;
                                    long j4 = andIncrement2 / j3;
                                    int i2 = (int) (andIncrement2 % j3);
                                    if (ku0Var4.f7522e != j4) {
                                        try {
                                            ku0 ku0VarM15476r2 = c3211a2.m15476r(j4, ku0Var4);
                                            if (ku0VarM15476r2 == null) {
                                                sm0VarM17086E = sm0Var;
                                            } else {
                                                ku0Var2 = ku0VarM15476r2;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            sm0VarM17086E = sm0Var;
                                            sm0VarM17086E.m21455C();
                                            throw th;
                                        }
                                    } else {
                                        ku0Var2 = ku0Var4;
                                    }
                                    C3211a c3211a3 = c3211a2;
                                    objM15466Q2 = c3211a3.m15466Q(ku0Var2, i2, andIncrement2, sm0Var);
                                    c3211a2 = c3211a3;
                                    ku0 ku0Var5 = ku0Var2;
                                    sm0VarM17086E = sm0Var;
                                    if (objM15466Q2 == fj0.f39182m) {
                                        sm0VarM17086E.mo10138a(ku0Var5, i2);
                                        break;
                                    }
                                    if (objM15466Q2 == fj0.f39184o) {
                                        if (andIncrement2 < c3211a2.m15481w()) {
                                            ku0Var5.m12572a();
                                        }
                                        ku0Var4 = ku0Var5;
                                    } else {
                                        if (objM15466Q2 == fj0.f39183n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        ku0Var5.m12572a();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    sm0VarM17086E = sm0Var;
                                    th = th;
                                    sm0VarM17086E.m21455C();
                                    throw th;
                                }
                            }
                        } else {
                            ku0Var.m12572a();
                        }
                        sm0VarM17086E.mo10140j(objM15466Q2, null);
                        break;
                    }
                    sm0VarM17086E.mo10138a(ku0Var, i);
                    Object objM21466r = sm0VarM17086E.m21466r();
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    return objM21466r;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable thM15479u = c3211a.m15479u();
        int i3 = ig9.f44092a;
        throw thM15479u;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: J */
    public static Object m15449J(C3211a c3211a, ContinuationImpl continuationImpl) {
        BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$1;
        ku0 ku0Var;
        if (continuationImpl instanceof BufferedChannel$receiveCatching$1) {
            bufferedChannel$receiveCatching$1 = (BufferedChannel$receiveCatching$1) continuationImpl;
            int i = bufferedChannel$receiveCatching$1.f47770c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bufferedChannel$receiveCatching$1.f47770c = i - Integer.MIN_VALUE;
            } else {
                bufferedChannel$receiveCatching$1 = new BufferedChannel$receiveCatching$1(c3211a, continuationImpl);
            }
        } else {
            bufferedChannel$receiveCatching$1 = new BufferedChannel$receiveCatching$1(c3211a, continuationImpl);
        }
        BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$2 = bufferedChannel$receiveCatching$1;
        Object obj = bufferedChannel$receiveCatching$2.f47768a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bufferedChannel$receiveCatching$2.f47770c;
        if (i2 != 0) {
            if (i2 == 1) {
                AbstractC3193b.m15359b(obj);
                return ((ju0) obj).f46151a;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        f47789g.getClass();
        if (c3211a == null) {
            ho2.m13383c();
            return null;
        }
        ku0 ku0Var2 = (ku0) m7d.f50741a.getObjectVolatile(c3211a, f47782I);
        while (!c3211a.m15456C()) {
            long andIncrement = f47785c.getAndIncrement(c3211a);
            long j = fj0.f39171b;
            long j2 = andIncrement / j;
            int i3 = (int) (andIncrement % j);
            if (ku0Var2.f7522e != j2) {
                ku0 ku0VarM15476r = c3211a.m15476r(j2, ku0Var2);
                if (ku0VarM15476r == null) {
                    continue;
                } else {
                    ku0Var = ku0VarM15476r;
                }
            } else {
                ku0Var = ku0Var2;
            }
            C3211a c3211a2 = c3211a;
            Object objM15466Q = c3211a2.m15466Q(ku0Var, i3, andIncrement, null);
            if (objM15466Q == fj0.f39182m) {
                C3386nv.m17633t("unexpected");
                return null;
            }
            if (objM15466Q != fj0.f39184o) {
                if (objM15466Q != fj0.f39183n) {
                    ku0Var.m12572a();
                    return objM15466Q;
                }
                bufferedChannel$receiveCatching$2.f47770c = 1;
                Object objM15461K = c3211a2.m15461K(ku0Var, i3, andIncrement, bufferedChannel$receiveCatching$2);
                return objM15461K == coroutineSingletons ? coroutineSingletons : objM15461K;
            }
            if (andIncrement < c3211a2.m15481w()) {
                ku0Var.m12572a();
            }
            c3211a = c3211a2;
            ku0Var2 = ku0Var;
        }
        return new hu0(c3211a.m15478t());
    }

    /* JADX WARN: Code duplicated, block: B:85:0x0153  */
    /* JADX WARN: Code duplicated, block: B:87:0x0156 A[RETURN] */
    /* JADX INFO: renamed from: N */
    public static Object m15450N(C3211a c3211a, Object obj, Continuation continuation) {
        xfa xfaVar;
        Object objM21466r;
        CoroutineSingletons coroutineSingletons;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f47788f;
        atomicReferenceFieldUpdater.getClass();
        ku0 ku0Var = (ku0) m7d.f50741a.getObjectVolatile(c3211a, f47783J);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f47784b;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(c3211a);
            long j = andIncrement & 1152921504606846975L;
            boolean zM15455B = c3211a.m15455B(andIncrement, false);
            int i = fj0.f39171b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            long j4 = ku0Var.f7522e;
            xfaVar = xfa.f68157a;
            if (j4 != j3) {
                ku0 ku0VarM15477s = c3211a.m15477s(j3, ku0Var);
                if (ku0VarM15477s != null) {
                    ku0Var = ku0VarM15477s;
                } else if (zM15455B) {
                    Object objM15460H = c3211a.m15460H(obj, continuation);
                    if (objM15460H == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return objM15460H;
                    }
                }
            }
            int iM15452c = m15452c(c3211a, ku0Var, i2, obj, j, null, zM15455B);
            if (iM15452c == 0) {
                ku0Var.m12572a();
                return xfaVar;
            }
            if (iM15452c != 1) {
                if (iM15452c == 2) {
                    if (!zM15455B) {
                        break;
                    }
                    ku0Var.m3064n();
                    Object objM15460H2 = c3211a.m15460H(obj, continuation);
                    if (objM15460H2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return objM15460H2;
                    }
                } else {
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = f47785c;
                    if (iM15452c == 3) {
                        sm0 sm0VarM17086E = AbstractC3352my.m17086E(AbstractC3584sr.m21600K(continuation));
                        try {
                            int iM15452c2 = m15452c(c3211a, ku0Var, i2, obj, j, sm0VarM17086E, false);
                            if (iM15452c2 != 0) {
                                if (iM15452c2 != 1) {
                                    if (iM15452c2 != 2) {
                                        if (iM15452c2 != 4) {
                                            String str = "unexpected";
                                            if (iM15452c2 != 5) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            ku0Var.m12572a();
                                            ku0 ku0Var2 = (ku0) atomicReferenceFieldUpdater.get(c3211a);
                                            while (true) {
                                                long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(c3211a);
                                                long j5 = andIncrement2 & 1152921504606846975L;
                                                boolean zM15455B2 = c3211a.m15455B(andIncrement2, false);
                                                int i3 = fj0.f39171b;
                                                str = str;
                                                long j6 = i3;
                                                atomicLongFieldUpdater2 = atomicLongFieldUpdater2;
                                                long j7 = j5 / j6;
                                                int i4 = (int) (j5 % j6);
                                                if (ku0Var2.f7522e != j7) {
                                                    ku0 ku0VarM15477s2 = c3211a.m15477s(j7, ku0Var2);
                                                    if (ku0VarM15477s2 != null) {
                                                        ku0Var2 = ku0VarM15477s2;
                                                    } else if (zM15455B2) {
                                                    }
                                                }
                                                int iM15452c3 = m15452c(c3211a, ku0Var2, i4, obj, j5, sm0VarM17086E, zM15455B2);
                                                if (iM15452c3 == 0) {
                                                    ku0Var2.m12572a();
                                                } else if (iM15452c3 != 1) {
                                                    if (iM15452c3 == 2) {
                                                        if (!zM15455B2) {
                                                            sm0VarM17086E.mo10138a(ku0Var2, i4 + i3);
                                                            break;
                                                        }
                                                        ku0Var2.m3064n();
                                                    } else {
                                                        if (iM15452c3 == 3) {
                                                            throw new IllegalStateException(str);
                                                        }
                                                        if (iM15452c3 != 4) {
                                                            if (iM15452c3 == 5) {
                                                                ku0Var2.m12572a();
                                                            }
                                                        } else if (j5 < atomicLongFieldUpdater2.get(c3211a)) {
                                                            ku0Var2.m12572a();
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (j < atomicLongFieldUpdater2.get(c3211a)) {
                                            ku0Var.m12572a();
                                        }
                                        m15451b(c3211a, obj, sm0VarM17086E);
                                        break;
                                    } else {
                                        sm0VarM17086E.mo10138a(ku0Var, i2 + i);
                                    }
                                }
                                objM21466r = sm0VarM17086E.m21466r();
                                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                if (objM21466r != coroutineSingletons) {
                                    objM21466r = xfaVar;
                                }
                                if (objM21466r == coroutineSingletons) {
                                    return objM21466r;
                                }
                            } else {
                                ku0Var.m12572a();
                            }
                            sm0VarM17086E.resumeWith(xfaVar);
                            objM21466r = sm0VarM17086E.m21466r();
                            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            if (objM21466r != coroutineSingletons) {
                                objM21466r = xfaVar;
                            }
                            if (objM21466r == coroutineSingletons) {
                                return objM21466r;
                            }
                        } catch (Throwable th) {
                            sm0VarM17086E.m21455C();
                            throw th;
                        }
                    } else if (iM15452c == 4) {
                        if (j < atomicLongFieldUpdater2.get(c3211a)) {
                            ku0Var.m12572a();
                        }
                        Object objM15460H3 = c3211a.m15460H(obj, continuation);
                        if (objM15460H3 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                            return objM15460H3;
                        }
                    } else if (iM15452c == 5) {
                        ku0Var.m12572a();
                    }
                }
            } else {
                break;
            }
        }
        return xfaVar;
    }

    /* JADX INFO: renamed from: b */
    public static final void m15451b(C3211a c3211a, Object obj, sm0 sm0Var) {
        sm0Var.resumeWith(new Result.Failure(c3211a.m15480v()));
    }

    /* JADX INFO: renamed from: c */
    public static final int m15452c(C3211a c3211a, ku0 ku0Var, int i, Object obj, long j, Object obj2, boolean z) {
        ku0Var.m15693s(i, obj);
        if (z) {
            return c3211a.m15467R(ku0Var, i, obj, j, obj2, z);
        }
        Object objM15691q = ku0Var.m15691q(i);
        if (objM15691q == null) {
            if (c3211a.m15469d(j)) {
                if (ku0Var.m15690p(i, null, fj0.f39173d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (ku0Var.m15690p(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (objM15691q instanceof z1b) {
            ku0Var.m15693s(i, null);
            if (c3211a.m15464O(objM15691q, obj)) {
                ku0Var.m15694t(i, fj0.f39178i);
                return 0;
            }
            C0842cc c0842cc = fj0.f39180k;
            if (ku0Var.f48424h.getAndSet((i * 2) + 1, c0842cc) == c0842cc) {
                return 5;
            }
            ku0Var.m15692r(i, true);
            return 5;
        }
        return c3211a.m15467R(ku0Var, i, obj, j, obj2, z);
    }

    /* JADX INFO: renamed from: y */
    public static void m15453y(C3211a c3211a) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f47787e;
        if ((atomicLongFieldUpdater.addAndGet(c3211a, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(c3211a) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m15454A(ri0 ri0Var) {
        Unsafe unsafe;
        while (true) {
            f47792j.getClass();
            Unsafe unsafe2 = m7d.f50741a;
            C3211a c3211a = this;
            if (unsafe2.compareAndSwapObject(c3211a, f47781H, (Object) null, ri0Var)) {
                return;
            }
            long j = f47781H;
            if (unsafe2.getObjectVolatile(c3211a, j) != null) {
                while (true) {
                    Object objectVolatile = m7d.f50741a.getObjectVolatile(c3211a, j);
                    C0842cc c0842cc = fj0.f39186q;
                    if (objectVolatile != c0842cc) {
                        if (objectVolatile == fj0.f39187r) {
                            C3386nv.m17633t("Another handler was already registered and successfully invoked");
                            return;
                        } else {
                            C3386nv.m17632s(objectVolatile, "Another handler is already registered: ");
                            return;
                        }
                    }
                    C0842cc c0842cc2 = fj0.f39187r;
                    do {
                        C3211a c3211a2 = c3211a;
                        unsafe = m7d.f50741a;
                        boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(c3211a2, f47781H, c0842cc, c0842cc2);
                        c3211a = c3211a2;
                        if (zCompareAndSwapObject) {
                            ri0Var.invoke(c3211a.m15478t());
                            return;
                        }
                    } while (unsafe.getObjectVolatile(c3211a, j) == c0842cc);
                }
            } else {
                this = c3211a;
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final boolean m15455B(long j, boolean z) {
        int i = (int) (j >> 60);
        if (i != 0 && i != 1) {
            if (i == 2) {
                m15472l(j & 1152921504606846975L);
                if (!z || !m15482x()) {
                }
            } else {
                if (i != 3) {
                    gm5.m12751g(ux5.m22988k(i, "unexpected close status: "));
                    return false;
                }
                ku0 ku0VarM15472l = m15472l(j & 1152921504606846975L);
                Object objM10548x = null;
                loop0: do {
                    for (int i2 = fj0.f39171b - 1; -1 < i2; i2--) {
                        long j2 = (ku0VarM15472l.f7522e * ((long) fj0.f39171b)) + ((long) i2);
                        while (true) {
                            Object objM15691q = ku0VarM15472l.m15691q(i2);
                            if (objM15691q == fj0.f39178i) {
                                break loop0;
                            }
                            C0842cc c0842cc = fj0.f39173d;
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f47785c;
                            if (objM15691q != c0842cc) {
                                if (objM15691q != fj0.f39174e && objM15691q != null) {
                                    if (!(objM15691q instanceof z1b) && !(objM15691q instanceof a2b)) {
                                        C0842cc c0842cc2 = fj0.f39176g;
                                        if (objM15691q == c0842cc2 || objM15691q == fj0.f39175f) {
                                            break loop0;
                                        }
                                        if (objM15691q != c0842cc2) {
                                            break;
                                        }
                                    } else {
                                        if (j2 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        z1b z1bVar = objM15691q instanceof a2b ? ((a2b) objM15691q).f136a : (z1b) objM15691q;
                                        if (ku0VarM15472l.m15690p(i2, objM15691q, fj0.f39181l)) {
                                            objM10548x = do7.m10548x(objM10548x, z1bVar);
                                            ku0VarM15472l.m15693s(i2, null);
                                            ku0VarM15472l.m3064n();
                                            break;
                                        }
                                    }
                                } else {
                                    if (ku0VarM15472l.m15690p(i2, objM15691q, fj0.f39181l)) {
                                        ku0VarM15472l.m3064n();
                                        break;
                                    }
                                }
                            } else {
                                if (j2 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (ku0VarM15472l.m15690p(i2, objM15691q, fj0.f39181l)) {
                                    ku0VarM15472l.m15693s(i2, null);
                                    ku0VarM15472l.m3064n();
                                    break;
                                }
                            }
                        }
                    }
                    ku0VarM15472l = (ku0) ku0VarM15472l.m12576f();
                } while (ku0VarM15472l != null);
                if (objM10548x != null) {
                    if (objM10548x instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objM10548x;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            m15463M((z1b) arrayList.get(size), false);
                        }
                    } else {
                        m15463M((z1b) objM10548x, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m15456C() {
        return m15455B(f47784b.get(this), true);
    }

    /* JADX INFO: renamed from: D */
    public final boolean m15457D() {
        return m15455B(f47784b.get(this), false);
    }

    /* JADX INFO: renamed from: E */
    public boolean mo4675E() {
        return false;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m15458F() {
        long j = f47786d.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: G */
    public final void m15459G(long j, ku0 ku0Var) {
        ku0 ku0Var2;
        ku0 ku0Var3;
        while (ku0Var.f7522e < j && (ku0Var3 = (ku0) ku0Var.m12574d()) != null) {
            ku0Var = ku0Var3;
        }
        while (true) {
            if (!ku0Var.mo3060g() || (ku0Var2 = (ku0) ku0Var.m12574d()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f47790h;
                    atomicReferenceFieldUpdater.getClass();
                    au8 au8Var = (au8) m7d.f50741a.getObjectVolatile(this, f47794l);
                    if (au8Var.f7522e >= ku0Var.f7522e) {
                        return;
                    }
                    if (!ku0Var.m3065o()) {
                        break;
                    }
                    if (hn1.m13350C(atomicReferenceFieldUpdater, this, au8Var, ku0Var)) {
                        if (au8Var.m3061k()) {
                            au8Var.m12578i();
                            return;
                        }
                        return;
                    } else if (ku0Var.m3061k()) {
                        ku0Var.m12578i();
                    }
                }
            } else {
                ku0Var = ku0Var2;
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final Object m15460H(Object obj, Continuation continuation) {
        sm0 sm0Var = new sm0(1, AbstractC3584sr.m21600K(continuation));
        sm0Var.m21468u();
        sm0Var.resumeWith(new Result.Failure(m15480v()));
        Object objM21466r = sm0Var.m21466r();
        return objM21466r == CoroutineSingletons.COROUTINE_SUSPENDED ? objM21466r : xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: K */
    public final Object m15461K(ku0 ku0Var, int i, long j, ContinuationImpl continuationImpl) throws Throwable {
        BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 bufferedChannel$receiveCatchingOnNoWaiterSuspend$1;
        ju0 ju0Var;
        ku0 ku0Var2;
        if (continuationImpl instanceof BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) {
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = (BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) continuationImpl;
            int i2 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.f47773c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.f47773c = i2 - Integer.MIN_VALUE;
            } else {
                bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = new BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(this, continuationImpl);
            }
        } else {
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = new BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(this, continuationImpl);
        }
        Object objM21466r = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.f47771a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.f47773c;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM21466r);
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.f47773c = 1;
            sm0 sm0VarM17086E = AbstractC3352my.m17086E(AbstractC3584sr.m21600K(bufferedChannel$receiveCatchingOnNoWaiterSuspend$1));
            try {
                w18 w18Var = new w18(sm0VarM17086E);
                Object objM15466Q = m15466Q(ku0Var, i, j, w18Var);
                if (objM15466Q != fj0.f39182m) {
                    if (objM15466Q == fj0.f39184o) {
                        if (j < m15481w()) {
                            ku0Var.m12572a();
                        }
                        ku0 ku0Var3 = (ku0) f47789g.get(this);
                        while (true) {
                            if (m15456C()) {
                                sm0VarM17086E.resumeWith(new ju0(new hu0(m15478t())));
                                break;
                            }
                            long andIncrement = f47785c.getAndIncrement(this);
                            long j2 = fj0.f39171b;
                            long j3 = andIncrement / j2;
                            int i4 = (int) (andIncrement % j2);
                            if (ku0Var3.f7522e != j3) {
                                ku0 ku0VarM15476r = m15476r(j3, ku0Var3);
                                if (ku0VarM15476r != null) {
                                    ku0Var2 = ku0VarM15476r;
                                }
                            } else {
                                ku0Var2 = ku0Var3;
                            }
                            Object objM15466Q2 = m15466Q(ku0Var2, i4, andIncrement, w18Var);
                            ku0 ku0Var4 = ku0Var2;
                            if (objM15466Q2 == fj0.f39182m) {
                                w18Var.mo10138a(ku0Var4, i4);
                                break;
                            }
                            if (objM15466Q2 == fj0.f39184o) {
                                if (andIncrement < m15481w()) {
                                    ku0Var4.m12572a();
                                }
                                ku0Var3 = ku0Var4;
                            } else {
                                if (objM15466Q2 == fj0.f39183n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                ku0Var4.m12572a();
                                ju0Var = new ju0(objM15466Q2);
                            }
                        }
                    } else {
                        ku0Var.m12572a();
                        ju0Var = new ju0(objM15466Q);
                    }
                    sm0VarM17086E.mo10140j(ju0Var, null);
                    break;
                }
                w18Var.mo10138a(ku0Var, i);
                objM21466r = sm0VarM17086E.m21466r();
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (objM21466r == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } catch (Throwable th) {
                sm0VarM17086E.m21455C();
                throw th;
            }
        } else {
            if (i3 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM21466r);
        }
        return ((ju0) objM21466r).f46151a;
    }

    /* JADX INFO: renamed from: L */
    public final void m15462L(gu8 gu8Var) {
        ku0 ku0Var;
        Object obj;
        f47789g.getClass();
        ku0 ku0Var2 = (ku0) m7d.f50741a.getObjectVolatile(this, f47782I);
        while (!this.m15456C()) {
            long andIncrement = f47785c.getAndIncrement(this);
            long j = fj0.f39171b;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (ku0Var2.f7522e != j2) {
                ku0 ku0VarM15476r = this.m15476r(j2, ku0Var2);
                if (ku0VarM15476r == null) {
                    continue;
                } else {
                    ku0Var = ku0VarM15476r;
                }
            } else {
                ku0Var = ku0Var2;
            }
            Object objM15466Q = this.m15466Q(ku0Var, i, andIncrement, gu8Var);
            ku0Var2 = ku0Var;
            if (objM15466Q == fj0.f39182m) {
                z1b z1bVar = gu8Var instanceof z1b ? (z1b) obj : null;
                if (z1bVar == null) {
                    obj = gu8Var;
                    return;
                } else {
                    obj = gu8Var;
                    z1bVar.mo10138a(ku0Var2, i);
                    return;
                }
            }
            if (objM15466Q != fj0.f39184o) {
                if (objM15466Q == fj0.f39183n) {
                    C3386nv.m17633t("unexpected");
                    return;
                } else {
                    ku0Var2.m12572a();
                    ((C3247b) gu8Var).f48174e = objM15466Q;
                    return;
                }
            }
            if (andIncrement < this.m15481w()) {
                ku0Var2.m12572a();
            }
            this = this;
            gu8Var = gu8Var;
        }
        ((C3247b) gu8Var).f48174e = fj0.f39181l;
    }

    /* JADX INFO: renamed from: M */
    public final void m15463M(z1b z1bVar, boolean z) {
        if (z1bVar instanceof qm0) {
            ((Continuation) z1bVar).resumeWith(new Result.Failure(z ? m15479u() : m15480v()));
            return;
        }
        if (z1bVar instanceof w18) {
            ((w18) z1bVar).f66225a.resumeWith(new ju0(new hu0(m15478t())));
            return;
        }
        if (!(z1bVar instanceof ej0)) {
            if (z1bVar instanceof gu8) {
                ((C3247b) ((gu8) z1bVar)).m15593i(this, fj0.f39181l);
                return;
            } else {
                C3386nv.m17632s(z1bVar, "Unexpected waiter: ");
                return;
            }
        }
        ej0 ej0Var = (ej0) z1bVar;
        sm0 sm0Var = ej0Var.f37316b;
        sm0Var.getClass();
        ej0Var.f37316b = null;
        ej0Var.f37315a = fj0.f39181l;
        Throwable thM15478t = ej0Var.f37317c.m15478t();
        if (thM15478t == null) {
            sm0Var.resumeWith(Boolean.FALSE);
        } else {
            sm0Var.resumeWith(new Result.Failure(thM15478t));
        }
    }

    /* JADX INFO: renamed from: O */
    public final boolean m15464O(Object obj, Object obj2) {
        if (obj instanceof gu8) {
            return ((C3247b) ((gu8) obj)).m15593i(this, obj2) == 0;
        }
        if (obj instanceof w18) {
            return fj0.m11887a(((w18) obj).f66225a, new ju0(obj2), null);
        }
        if (!(obj instanceof ej0)) {
            if (obj instanceof qm0) {
                return fj0.m11887a((qm0) obj, obj2, null);
            }
            C3386nv.m17632s(obj, "Unexpected receiver type: ");
            return false;
        }
        ej0 ej0Var = (ej0) obj;
        sm0 sm0Var = ej0Var.f37316b;
        sm0Var.getClass();
        ej0Var.f37316b = null;
        ej0Var.f37315a = obj2;
        Boolean bool = Boolean.TRUE;
        ej0Var.f37317c.getClass();
        return fj0.m11887a(sm0Var, bool, null);
    }

    /* JADX INFO: renamed from: P */
    public final boolean m15465P(Object obj, ku0 ku0Var, int i) {
        TrySelectDetailedResult trySelectDetailedResult;
        boolean z = obj instanceof qm0;
        xfa xfaVar = xfa.f68157a;
        if (z) {
            return fj0.m11887a((qm0) obj, xfaVar, null);
        }
        if (!(obj instanceof gu8)) {
            C3386nv.m17632s(obj, "Unexpected waiter: ");
            return false;
        }
        int iM15593i = ((C3247b) obj).m15593i(this, xfaVar);
        if (iM15593i == 0) {
            trySelectDetailedResult = TrySelectDetailedResult.SUCCESSFUL;
        } else if (iM15593i == 1) {
            trySelectDetailedResult = TrySelectDetailedResult.REREGISTER;
        } else if (iM15593i == 2) {
            trySelectDetailedResult = TrySelectDetailedResult.CANCELLED;
        } else {
            if (iM15593i != 3) {
                ij6.m13948e(iM15593i, "Unexpected internal result: ");
                return false;
            }
            trySelectDetailedResult = TrySelectDetailedResult.ALREADY_SELECTED;
        }
        if (trySelectDetailedResult == TrySelectDetailedResult.REREGISTER) {
            ku0Var.m15693s(i, null);
        }
        return trySelectDetailedResult == TrySelectDetailedResult.SUCCESSFUL;
    }

    /* JADX INFO: renamed from: Q */
    public final Object m15466Q(ku0 ku0Var, int i, long j, Object obj) {
        Object objM15691q = ku0Var.m15691q(i);
        AtomicReferenceArray atomicReferenceArray = ku0Var.f48424h;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f47784b;
        if (objM15691q == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return fj0.f39183n;
                }
                if (ku0Var.m15690p(i, objM15691q, obj)) {
                    m15474p();
                    return fj0.f39182m;
                }
            }
        } else if (objM15691q == fj0.f39173d && ku0Var.m15690p(i, objM15691q, fj0.f39178i)) {
            m15474p();
            Object obj2 = atomicReferenceArray.get(i * 2);
            ku0Var.m15693s(i, null);
            return obj2;
        }
        while (true) {
            Object objM15691q2 = ku0Var.m15691q(i);
            if (objM15691q2 == null || objM15691q2 == fj0.f39174e) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (ku0Var.m15690p(i, objM15691q2, fj0.f39177h)) {
                        m15474p();
                        return fj0.f39184o;
                    }
                } else {
                    if (obj == null) {
                        return fj0.f39183n;
                    }
                    if (ku0Var.m15690p(i, objM15691q2, obj)) {
                        m15474p();
                        return fj0.f39182m;
                    }
                }
            } else {
                if (objM15691q2 != fj0.f39173d) {
                    C0842cc c0842cc = fj0.f39179j;
                    if (objM15691q2 != c0842cc && objM15691q2 != fj0.f39177h) {
                        if (objM15691q2 == fj0.f39181l) {
                            m15474p();
                            return fj0.f39184o;
                        }
                        if (objM15691q2 != fj0.f39176g && ku0Var.m15690p(i, objM15691q2, fj0.f39175f)) {
                            boolean z = objM15691q2 instanceof a2b;
                            if (z) {
                                objM15691q2 = ((a2b) objM15691q2).f136a;
                            }
                            if (m15465P(objM15691q2, ku0Var, i)) {
                                ku0Var.m15694t(i, fj0.f39178i);
                                m15474p();
                                Object obj3 = atomicReferenceArray.get(i * 2);
                                ku0Var.m15693s(i, null);
                                return obj3;
                            }
                            ku0Var.m15694t(i, c0842cc);
                            ku0Var.m3064n();
                            if (z) {
                                m15474p();
                            }
                            return fj0.f39184o;
                        }
                    }
                    return fj0.f39184o;
                }
                if (ku0Var.m15690p(i, objM15691q2, fj0.f39178i)) {
                    m15474p();
                    Object obj4 = atomicReferenceArray.get(i * 2);
                    ku0Var.m15693s(i, null);
                    return obj4;
                }
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final int m15467R(ku0 ku0Var, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object objM15691q = ku0Var.m15691q(i);
            if (objM15691q == null) {
                if (!m15469d(j) || z) {
                    if (z) {
                        if (ku0Var.m15690p(i, null, fj0.f39179j)) {
                            ku0Var.m3064n();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (ku0Var.m15690p(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (ku0Var.m15690p(i, null, fj0.f39173d)) {
                    break;
                }
            } else {
                if (objM15691q != fj0.f39174e) {
                    C0842cc c0842cc = fj0.f39180k;
                    if (objM15691q == c0842cc) {
                        ku0Var.m15693s(i, null);
                        return 5;
                    }
                    if (objM15691q == fj0.f39177h) {
                        ku0Var.m15693s(i, null);
                        return 5;
                    }
                    if (objM15691q == fj0.f39181l) {
                        ku0Var.m15693s(i, null);
                        m15457D();
                        return 4;
                    }
                    ku0Var.m15693s(i, null);
                    if (objM15691q instanceof a2b) {
                        objM15691q = ((a2b) objM15691q).f136a;
                    }
                    if (m15464O(objM15691q, obj)) {
                        ku0Var.m15694t(i, fj0.f39178i);
                        return 0;
                    }
                    if (ku0Var.f48424h.getAndSet((i * 2) + 1, c0842cc) != c0842cc) {
                        ku0Var.m15692r(i, true);
                    }
                    return 5;
                }
                if (ku0Var.m15690p(i, objM15691q, fj0.f39173d)) {
                    break;
                }
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: S */
    public final void m15468S(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        C3211a c3211a = this;
        if (c3211a.m15458F()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f47786d;
            if (atomicLongFieldUpdater.get(c3211a) > j) {
                break;
            } else {
                c3211a = this;
            }
        }
        int i = fj0.f39172c;
        int i2 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f47787e;
            if (i2 < i) {
                long j2 = atomicLongFieldUpdater.get(c3211a);
                if (j2 == (4611686018427387903L & atomicLongFieldUpdater2.get(c3211a)) && j2 == atomicLongFieldUpdater.get(c3211a)) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    long j3 = atomicLongFieldUpdater2.get(c3211a);
                    if (atomicLongFieldUpdater2.compareAndSet(c3211a, j3, (j3 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        c3211a = this;
                    }
                }
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(c3211a);
                    long j5 = atomicLongFieldUpdater2.get(c3211a);
                    long j6 = j5 & 4611686018427387903L;
                    boolean z = (j5 & 4611686018427387904L) != 0;
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(c3211a)) {
                        break;
                    }
                    if (z) {
                        c3211a = this;
                    } else {
                        c3211a = this;
                        atomicLongFieldUpdater2.compareAndSet(c3211a, j5, 4611686018427387904L + j6);
                    }
                }
                while (true) {
                    long j7 = atomicLongFieldUpdater2.get(c3211a);
                    if (atomicLongFieldUpdater2.compareAndSet(c3211a, j7, j7 & 4611686018427387903L)) {
                        return;
                    } else {
                        c3211a = this;
                    }
                }
            }
        }
    }

    @Override // p000.cu0
    /* JADX INFO: renamed from: a */
    public final void mo4537a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        m15471j(cancellationException, true);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m15469d(long j) {
        return j < f47786d.get(this) || j < f47785c.get(this) + ((long) this.f47795a);
    }

    /* JADX INFO: renamed from: e */
    public final ku0 m15470e() {
        f47790h.getClass();
        Unsafe unsafe = m7d.f50741a;
        Object objectVolatile = unsafe.getObjectVolatile(this, f47794l);
        f47788f.getClass();
        ku0 ku0Var = (ku0) unsafe.getObjectVolatile(this, f47783J);
        if (ku0Var.f7522e > ((ku0) objectVolatile).f7522e) {
            objectVolatile = ku0Var;
        }
        f47789g.getClass();
        ku0 ku0Var2 = (ku0) unsafe.getObjectVolatile(this, f47782I);
        if (ku0Var2.f7522e > ((ku0) objectVolatile).f7522e) {
            objectVolatile = ku0Var2;
        }
        gg1 gg1Var = (gg1) objectVolatile;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = gg1.f40757a;
            Object objM12575e = gg1Var.m12575e();
            if (objM12575e == AbstractC3184kh.f47264f) {
                break;
            }
            gg1 gg1Var2 = (gg1) objM12575e;
            if (gg1Var2 != null) {
                gg1Var = gg1Var2;
            } else if (gg1Var.m12577h()) {
                break;
            }
        }
        return (ku0) gg1Var;
    }

    @Override // p000.cu0
    /* JADX INFO: renamed from: f */
    public final ny8 mo9889f() {
        BufferedChannel$onReceiveCatching$1 bufferedChannel$onReceiveCatching$1 = BufferedChannel$onReceiveCatching$1.f47766i;
        lda.m16119e(3, bufferedChannel$onReceiveCatching$1);
        BufferedChannel$onReceiveCatching$2 bufferedChannel$onReceiveCatching$2 = BufferedChannel$onReceiveCatching$2.f47767i;
        lda.m16119e(3, bufferedChannel$onReceiveCatching$2);
        return new ny8(this, bufferedChannel$onReceiveCatching$1, bufferedChannel$onReceiveCatching$2, null, 11);
    }

    @Override // p000.cu0
    /* JADX INFO: renamed from: g */
    public final Object mo9890g() {
        ku0 ku0Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f47785c;
        long j = atomicLongFieldUpdater.get(this);
        long j2 = f47784b.get(this);
        if (m15455B(j2, true)) {
            return new hu0(m15478t());
        }
        long j3 = j2 & 1152921504606846975L;
        iu0 iu0Var = ju0.f46150b;
        if (j >= j3) {
            return iu0Var;
        }
        Object obj = fj0.f39180k;
        f47789g.getClass();
        ku0 ku0Var2 = (ku0) m7d.f50741a.getObjectVolatile(this, f47782I);
        while (!this.m15456C()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = fj0.f39171b;
            long j5 = andIncrement / j4;
            int i = (int) (andIncrement % j4);
            if (ku0Var2.f7522e != j5) {
                ku0 ku0VarM15476r = this.m15476r(j5, ku0Var2);
                if (ku0VarM15476r == null) {
                    continue;
                } else {
                    ku0Var = ku0VarM15476r;
                }
            } else {
                ku0Var = ku0Var2;
            }
            C3211a c3211a = this;
            Object objM15466Q = c3211a.m15466Q(ku0Var, i, andIncrement, obj);
            ku0Var2 = ku0Var;
            if (objM15466Q == fj0.f39182m) {
                z1b z1bVar = obj instanceof z1b ? (z1b) obj : null;
                if (z1bVar != null) {
                    z1bVar.mo10138a(ku0Var2, i);
                }
                c3211a.m15468S(andIncrement);
                ku0Var2.m3064n();
                return iu0Var;
            }
            if (objM15466Q != fj0.f39184o) {
                if (objM15466Q != fj0.f39183n) {
                    ku0Var2.m12572a();
                    return objM15466Q;
                }
                C3386nv.m17633t("unexpected");
                return null;
            }
            if (andIncrement < c3211a.m15481w()) {
                ku0Var2.m12572a();
            }
            this = c3211a;
        }
        return new hu0(this.m15478t());
    }

    @Override // p000.cu0
    /* JADX INFO: renamed from: h */
    public final Object mo9891h(Continuation continuation) {
        return m15449J(this, (ContinuationImpl) continuation);
    }

    @Override // p000.yv8
    /* JADX INFO: renamed from: i */
    public final boolean mo15331i(Throwable th) {
        return m15471j(th, false);
    }

    @Override // p000.cu0
    public final ej0 iterator() {
        return new ej0(this);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m15471j(Throwable th, boolean z) {
        C3211a c3211a;
        boolean z2;
        long j;
        long j2;
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f47784b;
        if (!z) {
            c3211a = this;
            break;
        }
        while (true) {
            long j4 = atomicLongFieldUpdater.get(this);
            if (((int) (j4 >> 60)) != 0) {
                c3211a = this;
                break;
            }
            ku0 ku0Var = fj0.f39170a;
            c3211a = this;
            if (atomicLongFieldUpdater.compareAndSet(c3211a, j4, (j4 & 1152921504606846975L) + 1152921504606846976L)) {
                break;
            }
            this = c3211a;
        }
        C0842cc c0842cc = fj0.f39188s;
        while (true) {
            f47791i.getClass();
            C3211a c3211a2 = c3211a;
            Unsafe unsafe = m7d.f50741a;
            long j5 = f47793k;
            Throwable th2 = th;
            boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(c3211a2, j5, c0842cc, th2);
            c3211a = c3211a2;
            if (zCompareAndSwapObject) {
                z2 = true;
                break;
            }
            if (unsafe.getObjectVolatile(c3211a, j5) != c0842cc) {
                z2 = false;
                break;
            }
            th = th2;
        }
        if (z) {
            do {
                j3 = atomicLongFieldUpdater.get(c3211a);
            } while (!atomicLongFieldUpdater.compareAndSet(c3211a, j3, 3458764513820540928L + (j3 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(c3211a);
                int i = (int) (j >> 60);
                if (i == 0) {
                    j2 = (j & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = (j & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(c3211a, j, j2));
        }
        c3211a.m15457D();
        if (z2) {
            c3211a.m15483z();
        }
        return z2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0072  */
    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    /* JADX WARN: Code duplicated, block: B:37:0x008f  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x0072, please report this as an issue */
    @Override // p000.yv8
    /* JADX INFO: renamed from: k */
    public Object mo4677k(Object obj) {
        int iM15452c;
        xfa xfaVar;
        z1b z1bVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f47784b;
        long j = atomicLongFieldUpdater.get(this);
        boolean z = false;
        long j2 = 1152921504606846975L;
        boolean z2 = m15455B(j, false) ? false : !m15469d(j & 1152921504606846975L);
        iu0 iu0Var = ju0.f46150b;
        if (z2) {
            return iu0Var;
        }
        Object obj2 = fj0.f39179j;
        f47788f.getClass();
        ku0 ku0Var = (ku0) m7d.f50741a.getObjectVolatile(this, f47783J);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = andIncrement & j2;
            boolean zM15455B = m15455B(andIncrement, z);
            int i = fj0.f39171b;
            long j4 = i;
            long j5 = j3 / j4;
            int i2 = (int) (j3 % j4);
            if (ku0Var.f7522e == j5) {
                iM15452c = m15452c(this, ku0Var, i2, obj, j3, obj2, zM15455B);
                xfaVar = xfa.f68157a;
                if (iM15452c != 0) {
                    ku0Var.m12572a();
                    return xfaVar;
                }
                if (iM15452c != 1) {
                    return xfaVar;
                }
                if (iM15452c != 2) {
                    if (zM15455B) {
                        ku0Var.m3064n();
                        return new hu0(m15480v());
                    }
                    z1bVar = obj2 instanceof z1b ? (z1b) obj2 : null;
                    if (z1bVar != null) {
                        z1bVar.mo10138a(ku0Var, i2 + i);
                    }
                    ku0Var.m3064n();
                    return iu0Var;
                }
                if (iM15452c != 3) {
                    C3386nv.m17633t("unexpected");
                    return null;
                }
                if (iM15452c != 4) {
                    if (j3 < f47785c.get(this)) {
                        ku0Var.m12572a();
                    }
                    return new hu0(m15480v());
                }
                if (iM15452c == 5) {
                    ku0Var.m12572a();
                }
                z = false;
            } else {
                ku0 ku0VarM15477s = m15477s(j5, ku0Var);
                if (ku0VarM15477s != null) {
                    ku0Var = ku0VarM15477s;
                    iM15452c = m15452c(this, ku0Var, i2, obj, j3, obj2, zM15455B);
                    xfaVar = xfa.f68157a;
                    if (iM15452c != 0) {
                        ku0Var.m12572a();
                        return xfaVar;
                    }
                    if (iM15452c != 1) {
                        return xfaVar;
                    }
                    if (iM15452c != 2) {
                        if (zM15455B) {
                            ku0Var.m3064n();
                            return new hu0(m15480v());
                        }
                        if (obj2 instanceof z1b) {
                        }
                        if (z1bVar != null) {
                            z1bVar.mo10138a(ku0Var, i2 + i);
                        }
                        ku0Var.m3064n();
                        return iu0Var;
                    }
                    if (iM15452c != 3) {
                        C3386nv.m17633t("unexpected");
                        return null;
                    }
                    if (iM15452c != 4) {
                        if (j3 < f47785c.get(this)) {
                            ku0Var.m12572a();
                        }
                        return new hu0(m15480v());
                    }
                    if (iM15452c == 5) {
                        ku0Var.m12572a();
                    }
                    z = false;
                } else {
                    if (zM15455B) {
                        return new hu0(m15480v());
                    }
                    z = false;
                }
            }
            j2 = 1152921504606846975L;
        }
    }

    /* JADX INFO: renamed from: l */
    public final ku0 m15472l(long j) {
        long j2;
        ku0 ku0VarM15470e = m15470e();
        if (mo4675E()) {
            ku0 ku0Var = ku0VarM15470e;
            loop0: while (true) {
                int i = fj0.f39171b - 1;
                while (true) {
                    if (-1 < i) {
                        j2 = (ku0Var.f7522e * ((long) fj0.f39171b)) + ((long) i);
                        if (j2 >= f47785c.get(this)) {
                            while (true) {
                                Object objM15691q = ku0Var.m15691q(i);
                                if (objM15691q != null && objM15691q != fj0.f39174e) {
                                    if (objM15691q != fj0.f39173d) {
                                        break;
                                    }
                                    break loop0;
                                }
                                if (ku0Var.m15690p(i, objM15691q, fj0.f39181l)) {
                                    ku0Var.m3064n();
                                    break;
                                }
                            }
                            i--;
                        }
                    } else {
                        ku0Var = (ku0) ku0Var.m12576f();
                        if (ku0Var == null) {
                        }
                    }
                    j2 = -1;
                    break loop0;
                }
            }
            if (j2 != -1) {
                m15473n(j2);
            }
        }
        Object objM10548x = null;
        loop3: for (ku0 ku0Var2 = ku0VarM15470e; ku0Var2 != null; ku0Var2 = (ku0) ku0Var2.m12576f()) {
            for (int i2 = fj0.f39171b - 1; -1 < i2; i2--) {
                if ((ku0Var2.f7522e * ((long) fj0.f39171b)) + ((long) i2) < j) {
                    break loop3;
                }
                while (true) {
                    Object objM15691q2 = ku0Var2.m15691q(i2);
                    if (objM15691q2 != null && objM15691q2 != fj0.f39174e) {
                        if (!(objM15691q2 instanceof a2b)) {
                            if (!(objM15691q2 instanceof z1b)) {
                                break;
                            }
                            if (ku0Var2.m15690p(i2, objM15691q2, fj0.f39181l)) {
                                objM10548x = do7.m10548x(objM10548x, objM15691q2);
                                ku0Var2.m15692r(i2, true);
                                break;
                            }
                        } else {
                            if (ku0Var2.m15690p(i2, objM15691q2, fj0.f39181l)) {
                                objM10548x = do7.m10548x(objM10548x, ((a2b) objM15691q2).f136a);
                                ku0Var2.m15692r(i2, true);
                                break;
                            }
                        }
                    } else {
                        if (ku0Var2.m15690p(i2, objM15691q2, fj0.f39181l)) {
                            ku0Var2.m3064n();
                            break;
                        }
                    }
                }
            }
        }
        if (objM10548x != null) {
            if (!(objM10548x instanceof ArrayList)) {
                m15463M((z1b) objM10548x, true);
                return ku0VarM15470e;
            }
            ArrayList arrayList = (ArrayList) objM10548x;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                m15463M((z1b) arrayList.get(size), true);
            }
        }
        return ku0VarM15470e;
    }

    @Override // p000.yv8
    /* JADX INFO: renamed from: m */
    public Object mo4678m(Object obj, Continuation continuation) {
        return m15450N(this, obj, continuation);
    }

    /* JADX INFO: renamed from: n */
    public final void m15473n(long j) {
        f47789g.getClass();
        ku0 ku0Var = (ku0) m7d.f50741a.getObjectVolatile(this, f47782I);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f47785c;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(((long) this.f47795a) + j2, f47786d.get(this))) {
                return;
            }
            this = this;
            if (atomicLongFieldUpdater.compareAndSet(this, j2, 1 + j2)) {
                long j3 = fj0.f39171b;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (ku0Var.f7522e != j4) {
                    ku0 ku0VarM15476r = this.m15476r(j4, ku0Var);
                    if (ku0VarM15476r != null) {
                        ku0Var = ku0VarM15476r;
                    }
                }
                ku0 ku0Var2 = ku0Var;
                if (this.m15466Q(ku0Var2, i, j2, null) != fj0.f39184o || j2 < this.m15481w()) {
                    ku0Var2.m12572a();
                }
                ku0Var = ku0Var2;
            }
        }
    }

    @Override // p000.cu0
    /* JADX INFO: renamed from: o */
    public final Object mo9892o(SuspendLambda suspendLambda) {
        return m15448I(this, suspendLambda);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00b3 A[EDGE_INSN: B:43:0x00b3->B:46:0x00c0 BREAK  A[LOOP:1: B:31:0x0080->B:92:0x0080]] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00f1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x00c0 A[EDGE_INSN: B:89:0x00c0->B:46:0x00c0 BREAK  A[LOOP:1: B:31:0x0080->B:92:0x0080], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: p */
    public final void m15474p() {
        int i;
        boolean z;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        Object objM15691q;
        if (m15458F()) {
            return;
        }
        f47790h.getClass();
        ku0 ku0Var = (ku0) m7d.f50741a.getObjectVolatile(this, f47794l);
        while (true) {
            long andIncrement = f47786d.getAndIncrement(this);
            long j = fj0.f39171b;
            long j2 = andIncrement / j;
            if (this.m15481w() <= andIncrement) {
                if (ku0Var.f7522e < j2 && ku0Var.m12574d() != null) {
                    this.m15459G(j2, ku0Var);
                }
                m15453y(this);
                return;
            }
            C3211a c3211a = this;
            if (ku0Var.f7522e == j2) {
                i = (int) (andIncrement % j);
                Object objM15691q2 = ku0Var.m15691q(i);
                z = objM15691q2 instanceof z1b;
                atomicLongFieldUpdater = f47785c;
                if (z || andIncrement < atomicLongFieldUpdater.get(c3211a) || !ku0Var.m15690p(i, objM15691q2, fj0.f39176g)) {
                    while (true) {
                        objM15691q = ku0Var.m15691q(i);
                        if (objM15691q instanceof z1b) {
                            if (andIncrement < atomicLongFieldUpdater.get(c3211a)) {
                                if (ku0Var.m15690p(i, objM15691q, new a2b((z1b) objM15691q))) {
                                    m15453y(c3211a);
                                    return;
                                }
                            } else if (ku0Var.m15690p(i, objM15691q, fj0.f39176g)) {
                                if (!c3211a.m15465P(objM15691q, ku0Var, i)) {
                                    ku0Var.m15694t(i, fj0.f39179j);
                                    ku0Var.m3064n();
                                    break;
                                } else {
                                    ku0Var.m15694t(i, fj0.f39173d);
                                    m15453y(c3211a);
                                    return;
                                }
                            }
                        } else {
                            if (objM15691q == fj0.f39179j) {
                                break;
                            }
                            if (objM15691q == null) {
                                if (ku0Var.m15690p(i, objM15691q, fj0.f39174e)) {
                                    m15453y(c3211a);
                                    return;
                                }
                            } else if (objM15691q != fj0.f39173d || objM15691q == fj0.f39177h || objM15691q == fj0.f39178i || objM15691q == fj0.f39180k || objM15691q == fj0.f39181l) {
                                m15453y(c3211a);
                                return;
                            } else if (objM15691q != fj0.f39175f) {
                                C3386nv.m17632s(objM15691q, "Unexpected cell state: ");
                                return;
                            }
                        }
                    }
                    m15453y(c3211a);
                } else if (c3211a.m15465P(objM15691q2, ku0Var, i)) {
                    ku0Var.m15694t(i, fj0.f39173d);
                    m15453y(c3211a);
                    return;
                } else {
                    ku0Var.m15694t(i, fj0.f39179j);
                    ku0Var.m3064n();
                    m15453y(c3211a);
                }
            } else {
                ku0 ku0VarM15475q = c3211a.m15475q(j2, ku0Var, andIncrement);
                if (ku0VarM15475q == null) {
                    continue;
                } else {
                    ku0Var = ku0VarM15475q;
                    i = (int) (andIncrement % j);
                    Object objM15691q3 = ku0Var.m15691q(i);
                    z = objM15691q3 instanceof z1b;
                    atomicLongFieldUpdater = f47785c;
                    if (z) {
                        while (true) {
                            objM15691q = ku0Var.m15691q(i);
                            if (objM15691q instanceof z1b) {
                                if (andIncrement < atomicLongFieldUpdater.get(c3211a)) {
                                    if (ku0Var.m15690p(i, objM15691q, new a2b((z1b) objM15691q))) {
                                        m15453y(c3211a);
                                        return;
                                    }
                                } else if (ku0Var.m15690p(i, objM15691q, fj0.f39176g)) {
                                    if (!c3211a.m15465P(objM15691q, ku0Var, i)) {
                                        ku0Var.m15694t(i, fj0.f39179j);
                                        ku0Var.m3064n();
                                        break;
                                    } else {
                                        ku0Var.m15694t(i, fj0.f39173d);
                                        m15453y(c3211a);
                                        return;
                                    }
                                }
                            } else {
                                if (objM15691q == fj0.f39179j) {
                                    break;
                                    break;
                                }
                                if (objM15691q == null) {
                                    if (objM15691q != fj0.f39173d) {
                                        if (objM15691q != fj0.f39175f) {
                                            C3386nv.m17632s(objM15691q, "Unexpected cell state: ");
                                            return;
                                        }
                                    }
                                    m15453y(c3211a);
                                    return;
                                }
                                if (ku0Var.m15690p(i, objM15691q, fj0.f39174e)) {
                                    m15453y(c3211a);
                                    return;
                                }
                            }
                        }
                        m15453y(c3211a);
                    } else {
                        while (true) {
                            objM15691q = ku0Var.m15691q(i);
                            if (objM15691q instanceof z1b) {
                                if (andIncrement < atomicLongFieldUpdater.get(c3211a)) {
                                    if (ku0Var.m15690p(i, objM15691q, new a2b((z1b) objM15691q))) {
                                        m15453y(c3211a);
                                        return;
                                    }
                                } else if (ku0Var.m15690p(i, objM15691q, fj0.f39176g)) {
                                    if (!c3211a.m15465P(objM15691q, ku0Var, i)) {
                                        ku0Var.m15694t(i, fj0.f39179j);
                                        ku0Var.m3064n();
                                        break;
                                    } else {
                                        ku0Var.m15694t(i, fj0.f39173d);
                                        m15453y(c3211a);
                                        return;
                                    }
                                }
                            } else {
                                if (objM15691q == fj0.f39179j) {
                                    break;
                                    break;
                                }
                                if (objM15691q == null) {
                                    if (objM15691q != fj0.f39173d) {
                                        if (objM15691q != fj0.f39175f) {
                                            C3386nv.m17632s(objM15691q, "Unexpected cell state: ");
                                            return;
                                        }
                                    }
                                    m15453y(c3211a);
                                    return;
                                }
                                if (ku0Var.m15690p(i, objM15691q, fj0.f39174e)) {
                                    m15453y(c3211a);
                                    return;
                                }
                            }
                        }
                        m15453y(c3211a);
                    }
                }
            }
            this = c3211a;
        }
    }

    /* JADX INFO: renamed from: q */
    public final ku0 m15475q(long j, ku0 ku0Var, long j2) {
        Object objM15219m;
        ku0 ku0Var2 = fj0.f39170a;
        BufferedChannelKt$createSegmentFunction$1 bufferedChannelKt$createSegmentFunction$1 = BufferedChannelKt$createSegmentFunction$1.f47774i;
        loop0: while (true) {
            objM15219m = AbstractC3184kh.m15219m(ku0Var, j, bufferedChannelKt$createSegmentFunction$1);
            if (!lda.m16104D(objM15219m)) {
                au8 au8VarM16102B = lda.m16102B(objM15219m);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f47790h;
                    atomicReferenceFieldUpdater.getClass();
                    au8 au8Var = (au8) m7d.f50741a.getObjectVolatile(this, f47794l);
                    if (au8Var.f7522e >= au8VarM16102B.f7522e) {
                        break loop0;
                    }
                    if (!au8VarM16102B.m3065o()) {
                        break;
                    }
                    if (hn1.m13351D(atomicReferenceFieldUpdater, this, au8Var, au8VarM16102B)) {
                        if (!au8Var.m3061k()) {
                            break loop0;
                        }
                        au8Var.m12578i();
                        break loop0;
                    }
                    if (au8VarM16102B.m3061k()) {
                        au8VarM16102B.m12578i();
                    }
                }
            } else {
                break;
            }
        }
        if (lda.m16104D(objM15219m)) {
            m15457D();
            m15459G(j, ku0Var);
            m15453y(this);
            return null;
        }
        ku0 ku0Var3 = (ku0) lda.m16102B(objM15219m);
        long j3 = ku0Var3.f7522e;
        if (j3 <= j) {
            return ku0Var3;
        }
        long j4 = j3 * ((long) fj0.f39171b);
        if (!f47786d.compareAndSet(this, j2 + 1, j4)) {
            m15453y(this);
            return null;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f47787e;
        if ((atomicLongFieldUpdater.addAndGet(this, j4 - j2) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final ku0 m15476r(long j, ku0 ku0Var) {
        Object objM15219m;
        ku0 ku0Var2;
        long j2;
        Unsafe unsafe;
        ku0 ku0Var3 = fj0.f39170a;
        BufferedChannelKt$createSegmentFunction$1 bufferedChannelKt$createSegmentFunction$1 = BufferedChannelKt$createSegmentFunction$1.f47774i;
        loop0: while (true) {
            objM15219m = AbstractC3184kh.m15219m(ku0Var, j, bufferedChannelKt$createSegmentFunction$1);
            if (!lda.m16104D(objM15219m)) {
                au8 au8VarM16102B = lda.m16102B(objM15219m);
                while (true) {
                    f47789g.getClass();
                    Unsafe unsafe2 = m7d.f50741a;
                    long j3 = f47782I;
                    au8 au8Var = (au8) unsafe2.getObjectVolatile(this, j3);
                    if (au8Var.f7522e >= au8VarM16102B.f7522e) {
                        break loop0;
                    }
                    if (!au8VarM16102B.m3065o()) {
                        break;
                    }
                    do {
                        unsafe = m7d.f50741a;
                        if (unsafe.compareAndSwapObject(this, f47782I, au8Var, au8VarM16102B)) {
                            if (!au8Var.m3061k()) {
                                break loop0;
                            }
                            au8Var.m12578i();
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(this, j3) == au8Var);
                    if (au8VarM16102B.m3061k()) {
                        au8VarM16102B.m12578i();
                    }
                }
            } else {
                break;
            }
        }
        if (lda.m16104D(objM15219m)) {
            m15457D();
            if (ku0Var.f7522e * ((long) fj0.f39171b) < m15481w()) {
                ku0Var.m12572a();
                return null;
            }
        } else {
            ku0 ku0Var4 = (ku0) lda.m16102B(objM15219m);
            long j4 = ku0Var4.f7522e;
            if (m15458F() || j > f47786d.get(this) / ((long) fj0.f39171b)) {
                ku0Var2 = ku0Var4;
                break;
            }
            loop3: while (true) {
                f47790h.getClass();
                Unsafe unsafe3 = m7d.f50741a;
                long j5 = f47794l;
                au8 au8Var2 = (au8) unsafe3.getObjectVolatile(this, j5);
                if (au8Var2.f7522e >= j4 || !ku0Var4.m3065o()) {
                    ku0Var2 = ku0Var4;
                    break;
                }
                while (true) {
                    Unsafe unsafe4 = m7d.f50741a;
                    ku0Var2 = ku0Var4;
                    if (unsafe4.compareAndSwapObject(this, f47794l, au8Var2, ku0Var4)) {
                        if (!au8Var2.m3061k()) {
                            break loop3;
                        }
                        au8Var2.m12578i();
                        break loop3;
                    }
                    if (unsafe4.getObjectVolatile(this, j5) != au8Var2) {
                        break;
                    }
                    ku0Var4 = ku0Var2;
                }
                if (ku0Var2.m3061k()) {
                    ku0Var2.m12578i();
                }
                ku0Var4 = ku0Var2;
            }
            if (j4 <= j) {
                return ku0Var2;
            }
            long j6 = j4 * ((long) fj0.f39171b);
            do {
                j2 = f47785c.get(this);
                if (j2 >= j6) {
                    break;
                }
            } while (!f47785c.compareAndSet(this, j2, j6));
            if (j4 * ((long) fj0.f39171b) < m15481w()) {
                ku0Var2.m12572a();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public final ku0 m15477s(long j, ku0 ku0Var) {
        Object objM15219m;
        long j2;
        long j3;
        Unsafe unsafe;
        ku0 ku0Var2 = fj0.f39170a;
        BufferedChannelKt$createSegmentFunction$1 bufferedChannelKt$createSegmentFunction$1 = BufferedChannelKt$createSegmentFunction$1.f47774i;
        loop0: while (true) {
            objM15219m = AbstractC3184kh.m15219m(ku0Var, j, bufferedChannelKt$createSegmentFunction$1);
            if (!lda.m16104D(objM15219m)) {
                au8 au8VarM16102B = lda.m16102B(objM15219m);
                while (true) {
                    f47788f.getClass();
                    Unsafe unsafe2 = m7d.f50741a;
                    long j4 = f47783J;
                    au8 au8Var = (au8) unsafe2.getObjectVolatile(this, j4);
                    if (au8Var.f7522e >= au8VarM16102B.f7522e) {
                        break loop0;
                    }
                    if (!au8VarM16102B.m3065o()) {
                        break;
                    }
                    do {
                        unsafe = m7d.f50741a;
                        if (unsafe.compareAndSwapObject(this, f47783J, au8Var, au8VarM16102B)) {
                            if (!au8Var.m3061k()) {
                                break loop0;
                            }
                            au8Var.m12578i();
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(this, j4) == au8Var);
                    if (au8VarM16102B.m3061k()) {
                        au8VarM16102B.m12578i();
                    }
                }
            } else {
                break;
            }
        }
        boolean zM16104D = lda.m16104D(objM15219m);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f47785c;
        if (zM16104D) {
            m15457D();
            if (ku0Var.f7522e * ((long) fj0.f39171b) < atomicLongFieldUpdater.get(this)) {
                ku0Var.m12572a();
                return null;
            }
        } else {
            ku0 ku0Var3 = (ku0) lda.m16102B(objM15219m);
            long j5 = ku0Var3.f7522e;
            if (j5 <= j) {
                return ku0Var3;
            }
            long j6 = j5 * ((long) fj0.f39171b);
            do {
                j2 = f47784b.get(this);
                j3 = 1152921504606846975L & j2;
                if (j3 >= j6) {
                    break;
                }
            } while (!f47784b.compareAndSet(this, j2, j3 + (((long) ((int) (j2 >> 60))) << 60)));
            if (j5 * ((long) fj0.f39171b) < atomicLongFieldUpdater.get(this)) {
                ku0Var3.m12572a();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public final Throwable m15478t() {
        f47791i.getClass();
        return (Throwable) m7d.f50741a.getObjectVolatile(this, f47793k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        int i;
        String string;
        StringBuilder sb = new StringBuilder();
        int i2 = (int) (f47784b.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f47795a + ',');
        sb.append("data=[");
        f47789g.getClass();
        Unsafe unsafe = m7d.f50741a;
        int i3 = 0;
        f47788f.getClass();
        Object objectVolatile = unsafe.getObjectVolatile(this, f47783J);
        int i4 = 1;
        f47790h.getClass();
        List listM23605K = vz1.m23605K(unsafe.getObjectVolatile(this, f47782I), objectVolatile, unsafe.getObjectVolatile(this, f47794l));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM23605K) {
            if (((ku0) obj) != fj0.f39170a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            uk9.m22784s();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((ku0) next).f7522e;
            do {
                Object next2 = it.next();
                long j2 = ((ku0) next2).f7522e;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        ku0 ku0Var = (ku0) next;
        long j3 = f47785c.get(this);
        long jM15481w = m15481w();
        loop2: while (true) {
            int i5 = fj0.f39171b;
            int i6 = i3;
            while (i6 < i5) {
                i = i4;
                long j4 = (ku0Var.f7522e * ((long) fj0.f39171b)) + ((long) i6);
                if (j4 >= jM15481w && j4 >= j3) {
                    break loop2;
                }
                Object objM15691q = ku0Var.m15691q(i6);
                Object obj2 = ku0Var.f48424h.get(i6 * 2);
                if (objM15691q instanceof qm0) {
                    string = (jM15481w > j4 || j4 >= j3) ? (j3 > j4 || j4 >= jM15481w) ? "cont" : "send" : "receive";
                } else if (objM15691q instanceof gu8) {
                    string = (jM15481w > j4 || j4 >= j3) ? (j3 > j4 || j4 >= jM15481w) ? "select" : "onSend" : "onReceive";
                } else if (objM15691q instanceof w18) {
                    string = "receiveCatching";
                } else if (objM15691q instanceof a2b) {
                    string = "EB(" + objM15691q + ')';
                } else if (fa4.m11650l(objM15691q, fj0.f39175f) || fa4.m11650l(objM15691q, fj0.f39176g)) {
                    string = "resuming_sender";
                } else {
                    if (objM15691q != null && !objM15691q.equals(fj0.f39174e) && !objM15691q.equals(fj0.f39178i) && !objM15691q.equals(fj0.f39177h) && !objM15691q.equals(fj0.f39180k) && !objM15691q.equals(fj0.f39179j) && !objM15691q.equals(fj0.f39181l)) {
                        string = objM15691q.toString();
                    }
                    i6++;
                    i4 = i;
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
                i6++;
                i4 = i;
            }
            i = i4;
            ku0Var = (ku0) ku0Var.m12574d();
            if (ku0Var == null) {
                break;
            }
            i4 = i;
            i3 = 0;
        }
        if (vk9.m23392o0(sb) == ',') {
            sb.deleteCharAt(sb.length() - i).getClass();
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final Throwable m15479u() {
        Throwable thM15478t = m15478t();
        return thM15478t == null ? new ClosedReceiveChannelException() : thM15478t;
    }

    /* JADX INFO: renamed from: v */
    public final Throwable m15480v() {
        Throwable thM15478t = m15478t();
        return thM15478t == null ? new ClosedSendChannelException("Channel was closed") : thM15478t;
    }

    /* JADX INFO: renamed from: w */
    public final long m15481w() {
        return f47784b.get(this) & 1152921504606846975L;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m15482x() {
        while (true) {
            f47789g.getClass();
            Unsafe unsafe = m7d.f50741a;
            long j = f47782I;
            ku0 ku0VarM15476r = (ku0) unsafe.getObjectVolatile(this, j);
            AtomicLongFieldUpdater atomicLongFieldUpdater = f47785c;
            long j2 = atomicLongFieldUpdater.get(this);
            if (m15481w() <= j2) {
                return false;
            }
            long j3 = fj0.f39171b;
            long j4 = j2 / j3;
            if (ku0VarM15476r.f7522e == j4 || (ku0VarM15476r = m15476r(j4, ku0VarM15476r)) != null) {
                ku0VarM15476r.m12572a();
                int i = (int) (j2 % j3);
                while (true) {
                    Object objM15691q = ku0VarM15476r.m15691q(i);
                    if (objM15691q != null && objM15691q != fj0.f39174e) {
                        if (objM15691q != fj0.f39173d) {
                            if (objM15691q != fj0.f39179j && objM15691q != fj0.f39181l && objM15691q != fj0.f39178i && objM15691q != fj0.f39177h) {
                                if (objM15691q != fj0.f39176g) {
                                    if (objM15691q == fj0.f39175f || j2 != atomicLongFieldUpdater.get(this)) {
                                        break;
                                        break;
                                    }
                                    return true;
                                }
                                return true;
                            }
                            break;
                            break;
                            break;
                            break;
                        }
                        return true;
                    }
                    if (ku0VarM15476r.m15690p(i, objM15691q, fj0.f39177h)) {
                        m15474p();
                        break;
                    }
                }
                f47785c.compareAndSet(this, j2, j2 + 1);
            } else if (((ku0) unsafe.getObjectVolatile(this, j)).f7522e < j4) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m15483z() {
        Object objectVolatile;
        C3211a c3211a;
        loop0: while (true) {
            f47792j.getClass();
            Unsafe unsafe = m7d.f50741a;
            long j = f47781H;
            objectVolatile = unsafe.getObjectVolatile(this, j);
            C0842cc c0842cc = objectVolatile == null ? fj0.f39186q : fj0.f39187r;
            while (true) {
                Unsafe unsafe2 = m7d.f50741a;
                c3211a = this;
                if (unsafe2.compareAndSwapObject(c3211a, f47781H, objectVolatile, c0842cc)) {
                    break loop0;
                } else if (unsafe2.getObjectVolatile(c3211a, j) != objectVolatile) {
                    break;
                } else {
                    this = c3211a;
                }
            }
            this = c3211a;
        }
        if (objectVolatile == null) {
            return;
        }
        lda.m16119e(1, objectVolatile);
        ((vi3) objectVolatile).invoke(c3211a.m15478t());
    }
}
