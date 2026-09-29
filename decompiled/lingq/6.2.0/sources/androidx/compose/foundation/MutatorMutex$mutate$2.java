package androidx.compose.foundation;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.a76;
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
@c32(m4290c = "androidx.compose.foundation.MutatorMutex$mutate$2", m4291f = "MutatorMutex.kt", m4292l = {212, 127}, m4293m = "invokeSuspend", m4294v = 1)
final class MutatorMutex$mutate$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public c76 f1699a;

    /* JADX INFO: renamed from: b */
    public Object f1700b;

    /* JADX INFO: renamed from: c */
    public C0145m f1701c;

    /* JADX INFO: renamed from: d */
    public int f1702d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f1703e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ MutatePriority f1704f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0145m f1705g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ vi3 f1706h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutatorMutex$mutate$2(MutatePriority mutatePriority, C0145m c0145m, vi3 vi3Var, Continuation continuation) {
        super(2, continuation);
        this.f1704f = mutatePriority;
        this.f1705g = c0145m;
        this.f1706h = vi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MutatorMutex$mutate$2 mutatorMutex$mutate$2 = new MutatorMutex$mutate$2(this.f1704f, this.f1705g, this.f1706h, continuation);
        mutatorMutex$mutate$2.f1703e = obj;
        return mutatorMutex$mutate$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((MutatorMutex$mutate$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [c76, int] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        a76 a76Var;
        C0145m c0145m;
        c76 c76Var;
        vi3 vi3Var;
        C0145m c0145m2;
        Throwable th;
        a76 a76Var2;
        c76 c76Var2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.f1702d;
        try {
            try {
                if (r1 == 0) {
                    AbstractC3193b.m15359b(obj);
                    in1 in1Var = ((un1) this.f1703e).mo1309x().get(nj0.f52795N);
                    in1Var.getClass();
                    a76Var = new a76(this.f1704f, (cd4) in1Var);
                    c0145m = this.f1705g;
                    C0145m.m1025a(c0145m, a76Var);
                    c76Var = c0145m.f2622b;
                    this.f1703e = a76Var;
                    this.f1699a = c76Var;
                    vi3 vi3Var2 = this.f1706h;
                    this.f1700b = vi3Var2;
                    this.f1701c = c0145m;
                    this.f1702d = 1;
                    if (c76Var.mo4388c(this) != coroutineSingletons) {
                        vi3Var = vi3Var2;
                    }
                    return coroutineSingletons;
                }
                if (r1 != 1) {
                    if (r1 != 2) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c0145m2 = (C0145m) this.f1700b;
                    c76Var2 = this.f1699a;
                    a76Var2 = (a76) this.f1703e;
                    try {
                        AbstractC3193b.m15359b(obj);
                        atomicReference2 = c0145m2.f2621a;
                        while (!atomicReference2.compareAndSet(a76Var2, null) && atomicReference2.get() == a76Var2) {
                        }
                        c76Var2.mo4387b(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        atomicReference = c0145m2.f2621a;
                        while (!atomicReference.compareAndSet(a76Var2, null)) {
                        }
                        throw th;
                    }
                }
                C0145m c0145m3 = this.f1701c;
                vi3Var = (vi3) this.f1700b;
                c76Var = this.f1699a;
                a76 a76Var3 = (a76) this.f1703e;
                AbstractC3193b.m15359b(obj);
                c0145m = c0145m3;
                a76Var = a76Var3;
                this.f1703e = a76Var;
                this.f1699a = c76Var;
                this.f1700b = c0145m;
                this.f1701c = null;
                this.f1702d = 2;
                Object objInvoke = vi3Var.invoke(this);
                if (objInvoke != coroutineSingletons) {
                    c0145m2 = c0145m;
                    obj = objInvoke;
                    a76Var2 = a76Var;
                    c76Var2 = c76Var;
                    atomicReference2 = c0145m2.f2621a;
                    while (!atomicReference2.compareAndSet(a76Var2, null)) {
                    }
                    c76Var2.mo4387b(null);
                    return obj;
                }
                return coroutineSingletons;
            } catch (Throwable th3) {
                c0145m2 = c0145m;
                th = th3;
                a76Var2 = a76Var;
                atomicReference = c0145m2.f2621a;
                while (!atomicReference.compareAndSet(a76Var2, null) && atomicReference.get() == a76Var2) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            r1.mo4387b(null);
            throw th4;
        }
    }
}
