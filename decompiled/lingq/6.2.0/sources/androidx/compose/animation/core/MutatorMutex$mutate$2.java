package androidx.compose.animation.core;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.b76;
import p000.c32;
import p000.c76;
import p000.cd4;
import p000.in1;
import p000.nj0;
import p000.un1;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.animation.core.MutatorMutex$mutate$2", m4291f = "InternalMutatorMutex.kt", m4292l = {178, 126}, m4293m = "invokeSuspend", m4294v = 1)
final class MutatorMutex$mutate$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public c76 f1520a;

    /* JADX INFO: renamed from: b */
    public Object f1521b;

    /* JADX INFO: renamed from: c */
    public C0062d f1522c;

    /* JADX INFO: renamed from: d */
    public int f1523d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f1524e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ MutatePriority f1525f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0062d f1526g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ vi3 f1527h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutatorMutex$mutate$2(MutatePriority mutatePriority, C0062d c0062d, vi3 vi3Var, Continuation continuation) {
        super(2, continuation);
        this.f1525f = mutatePriority;
        this.f1526g = c0062d;
        this.f1527h = vi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MutatorMutex$mutate$2 mutatorMutex$mutate$2 = new MutatorMutex$mutate$2(this.f1525f, this.f1526g, this.f1527h, continuation);
        mutatorMutex$mutate$2.f1524e = obj;
        return mutatorMutex$mutate$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((MutatorMutex$mutate$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [c76, int] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        b76 b76Var;
        C0062d c0062d;
        c76 c76Var;
        vi3 vi3Var;
        C0062d c0062d2;
        Throwable th;
        b76 b76Var2;
        c76 c76Var2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.f1523d;
        try {
            try {
                if (r1 == 0) {
                    AbstractC3193b.m15359b(obj);
                    in1 in1Var = ((un1) this.f1524e).mo1309x().get(nj0.f52795N);
                    in1Var.getClass();
                    b76Var = new b76(this.f1525f, (cd4) in1Var);
                    c0062d = this.f1526g;
                    AtomicReference atomicReference3 = c0062d.f1554a;
                    loop2: while (true) {
                        b76 b76Var3 = (b76) atomicReference3.get();
                        if (b76Var3 != null && b76Var.f8046a.compareTo(b76Var3.f8046a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        do {
                            if (atomicReference3.compareAndSet(b76Var3, b76Var)) {
                                if (b76Var3 != null) {
                                    b76Var3.f8047b.mo4537a(new MutationInterruptedException("Mutation interrupted"));
                                }
                                c76Var = c0062d.f1555b;
                                this.f1524e = b76Var;
                                this.f1520a = c76Var;
                                vi3 vi3Var2 = this.f1527h;
                                this.f1521b = vi3Var2;
                                this.f1522c = c0062d;
                                this.f1523d = 1;
                                if (c76Var.mo4388c(this) != coroutineSingletons) {
                                    vi3Var = vi3Var2;
                                    break loop2;
                                }
                                return coroutineSingletons;
                            }
                        } while (atomicReference3.get() == b76Var3);
                    }
                } else {
                    if (r1 != 1) {
                        if (r1 != 2) {
                            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        c0062d2 = (C0062d) this.f1521b;
                        c76Var2 = this.f1520a;
                        b76Var2 = (b76) this.f1524e;
                        try {
                            AbstractC3193b.m15359b(obj);
                            atomicReference2 = c0062d2.f1554a;
                            while (!atomicReference2.compareAndSet(b76Var2, null) && atomicReference2.get() == b76Var2) {
                            }
                            c76Var2.mo4387b(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            atomicReference = c0062d2.f1554a;
                            while (!atomicReference.compareAndSet(b76Var2, null)) {
                            }
                            throw th;
                        }
                    }
                    C0062d c0062d3 = this.f1522c;
                    vi3Var = (vi3) this.f1521b;
                    c76Var = this.f1520a;
                    b76 b76Var4 = (b76) this.f1524e;
                    AbstractC3193b.m15359b(obj);
                    c0062d = c0062d3;
                    b76Var = b76Var4;
                }
                this.f1524e = b76Var;
                this.f1520a = c76Var;
                this.f1521b = c0062d;
                this.f1522c = null;
                this.f1523d = 2;
                Object objInvoke = vi3Var.invoke(this);
                if (objInvoke != coroutineSingletons) {
                    c0062d2 = c0062d;
                    obj = objInvoke;
                    b76Var2 = b76Var;
                    c76Var2 = c76Var;
                    atomicReference2 = c0062d2.f1554a;
                    while (!atomicReference2.compareAndSet(b76Var2, null)) {
                    }
                    c76Var2.mo4387b(null);
                    return obj;
                }
                return coroutineSingletons;
            } catch (Throwable th3) {
                c0062d2 = c0062d;
                th = th3;
                b76Var2 = b76Var;
                atomicReference = c0062d2.f1554a;
                while (!atomicReference.compareAndSet(b76Var2, null) && atomicReference.get() == b76Var2) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            r1.mo4387b(null);
            throw th4;
        }
    }
}
