package com.lingq.feature.reader.old;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.C3540rl;
import p000.bj3;
import p000.c32;
import p000.e83;
import p000.go3;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$11", m4291f = "ReaderViewModel.kt", m4292l = {928}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$11 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28795a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f28796b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderViewModel$11$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$11$1", m4291f = "ReaderViewModel.kt", m4292l = {926}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23721 extends SuspendLambda implements bj3 {

        /* JADX INFO: renamed from: a */
        public int f28797a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ e83 f28798b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ go3 f28799c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ boolean f28800d;

        @Override // p000.bj3
        /* JADX INFO: renamed from: e */
        public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
            C23721 c23721 = new C23721(4, (Continuation) obj4);
            c23721.f28798b = (e83) obj;
            c23721.f28799c = (go3) obj2;
            c23721.f28800d = zBooleanValue;
            return c23721.invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            e83 e83Var = this.f28798b;
            go3 go3Var = this.f28799c;
            boolean z = this.f28800d;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f28797a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                if (z) {
                    this.f28798b = null;
                    this.f28799c = null;
                    this.f28800d = z;
                    this.f28797a = 1;
                    if (e83Var.emit(go3Var, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderViewModel$11$2 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$11$2", m4291f = "ReaderViewModel.kt", m4292l = {929}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23732 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f28801a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f28802b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C2412n f28803c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23732(C2412n c2412n, Continuation continuation) {
            super(2, continuation);
            this.f28803c = c2412n;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23732 c23732 = new C23732(this.f28803c, continuation);
            c23732.f28802b = obj;
            return c23732;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C23732) create((go3) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            go3 go3Var = (go3) this.f28802b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f28801a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C3211a c3211a = this.f28803c.f29386m1;
                this.f28802b = null;
                this.f28801a = 1;
                if (c3211a.mo4678m(go3Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$11(C2412n c2412n, Continuation continuation) {
        super(2, continuation);
        this.f28796b = c2412n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$11(this.f28796b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$11) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28795a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2412n c2412n = this.f28796b;
            C3540rl c3540rl = new C3540rl(AbstractC3224d.m15534m(c2412n.f29356f.mo7006Q1(), c2412n.f29382l1, new C23721(4, null)), 5);
            C23732 c23732 = new C23732(c2412n, null);
            this.f28795a = 1;
            if (AbstractC3224d.m15529h(c3540rl, c23732, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
