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
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", m4291f = "MutatorMutex.kt", m4292l = {212, 167}, m4293m = "invokeSuspend", m4294v = 1)
final class MutatorMutex$mutateWith$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public c76 f1707a;

    /* JADX INFO: renamed from: b */
    public Object f1708b;

    /* JADX INFO: renamed from: c */
    public Object f1709c;

    /* JADX INFO: renamed from: d */
    public C0145m f1710d;

    /* JADX INFO: renamed from: e */
    public int f1711e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f1712f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ MutatePriority f1713g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0145m f1714h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ zi3 f1715i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f1716j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutatorMutex$mutateWith$2(MutatePriority mutatePriority, C0145m c0145m, zi3 zi3Var, Object obj, Continuation continuation) {
        super(2, continuation);
        this.f1713g = mutatePriority;
        this.f1714h = c0145m;
        this.f1715i = zi3Var;
        this.f1716j = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MutatorMutex$mutateWith$2 mutatorMutex$mutateWith$2 = new MutatorMutex$mutateWith$2(this.f1713g, this.f1714h, this.f1715i, this.f1716j, continuation);
        mutatorMutex$mutateWith$2.f1712f = obj;
        return mutatorMutex$mutateWith$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((MutatorMutex$mutateWith$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [c76, int] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        a76 a76Var;
        C0145m c0145m;
        c76 c76Var;
        zi3 zi3Var;
        Object obj2;
        C0145m c0145m2;
        Throwable th;
        a76 a76Var2;
        c76 c76Var2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.f1711e;
        try {
            try {
                if (r1 == 0) {
                    AbstractC3193b.m15359b(obj);
                    in1 in1Var = ((un1) this.f1712f).mo1309x().get(nj0.f52795N);
                    in1Var.getClass();
                    a76Var = new a76(this.f1713g, (cd4) in1Var);
                    c0145m = this.f1714h;
                    C0145m.m1025a(c0145m, a76Var);
                    c76Var = c0145m.f2622b;
                    this.f1712f = a76Var;
                    this.f1707a = c76Var;
                    zi3Var = this.f1715i;
                    this.f1708b = zi3Var;
                    Object obj3 = this.f1716j;
                    this.f1709c = obj3;
                    this.f1710d = c0145m;
                    this.f1711e = 1;
                    if (c76Var.mo4388c(this) != coroutineSingletons) {
                        obj2 = obj3;
                    }
                    return coroutineSingletons;
                }
                if (r1 != 1) {
                    if (r1 != 2) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c0145m2 = (C0145m) this.f1708b;
                    c76Var2 = this.f1707a;
                    a76Var2 = (a76) this.f1712f;
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
                C0145m c0145m3 = this.f1710d;
                obj2 = this.f1709c;
                zi3 zi3Var2 = (zi3) this.f1708b;
                c76 c76Var3 = this.f1707a;
                a76 a76Var3 = (a76) this.f1712f;
                AbstractC3193b.m15359b(obj);
                zi3Var = zi3Var2;
                c76Var = c76Var3;
                c0145m = c0145m3;
                a76Var = a76Var3;
                this.f1712f = a76Var;
                this.f1707a = c76Var;
                this.f1708b = c0145m;
                this.f1709c = null;
                this.f1710d = null;
                this.f1711e = 2;
                Object objInvoke = zi3Var.invoke(obj2, this);
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
