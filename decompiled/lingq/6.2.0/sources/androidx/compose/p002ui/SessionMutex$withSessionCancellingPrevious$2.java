package androidx.compose.p002ui;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.c32;
import p000.cd4;
import p000.kz8;
import p000.un1;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2", m4291f = "SessionMutex.kt", m4292l = {61, 63}, m4293m = "invokeSuspend", m4294v = 1)
final class SessionMutex$withSessionCancellingPrevious$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f3808a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f3809b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f3810c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AtomicReference f3811d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zi3 f3812e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionMutex$withSessionCancellingPrevious$2(vi3 vi3Var, AtomicReference atomicReference, zi3 zi3Var, Continuation continuation) {
        super(2, continuation);
        this.f3810c = vi3Var;
        this.f3811d = atomicReference;
        this.f3812e = zi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SessionMutex$withSessionCancellingPrevious$2 sessionMutex$withSessionCancellingPrevious$2 = new SessionMutex$withSessionCancellingPrevious$2(this.f3810c, this.f3811d, this.f3812e, continuation);
        sessionMutex$withSessionCancellingPrevious$2.f3809b = obj;
        return sessionMutex$withSessionCancellingPrevious$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SessionMutex$withSessionCancellingPrevious$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        kz8 kz8Var;
        kz8 kz8Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3808a;
        AtomicReference atomicReference = this.f3811d;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                un1 un1Var = (un1) this.f3809b;
                kz8Var = new kz8(AbstractC3208a.m15441h(un1Var.mo1309x()), this.f3810c.invoke(un1Var));
                kz8 kz8Var3 = (kz8) atomicReference.getAndSet(kz8Var);
                if (kz8Var3 != null) {
                    cd4 cd4Var = kz8Var3.f48819a;
                    this.f3809b = kz8Var;
                    this.f3808a = 1;
                    cd4Var.mo4537a(null);
                    Object objMo4539q = cd4Var.mo4539q(this);
                    if (objMo4539q != coroutineSingletons) {
                        objMo4539q = xfa.f68157a;
                    }
                    if (objMo4539q != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kz8Var2 = (kz8) this.f3809b;
                try {
                    AbstractC3193b.m15359b(obj);
                    while (!atomicReference.compareAndSet(kz8Var2, null) && atomicReference.get() == kz8Var2) {
                    }
                    return obj;
                } catch (Throwable th) {
                    th = th;
                    while (!atomicReference.compareAndSet(kz8Var2, null) && atomicReference.get() == kz8Var2) {
                    }
                    throw th;
                }
            }
            kz8Var = (kz8) this.f3809b;
            AbstractC3193b.m15359b(obj);
            zi3 zi3Var = this.f3812e;
            Object obj2 = kz8Var.f48820b;
            this.f3809b = kz8Var;
            this.f3808a = 2;
            obj = zi3Var.invoke(obj2, this);
            if (obj != coroutineSingletons) {
                kz8Var2 = kz8Var;
                while (!atomicReference.compareAndSet(kz8Var2, null)) {
                }
                return obj;
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            kz8Var2 = kz8Var;
            while (!atomicReference.compareAndSet(kz8Var2, null)) {
            }
            throw th;
        }
    }
}
