package com.lingq.core.domain.util;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.internal.C3236f;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.i83;
import p000.ll7;
import p000.ph2;
import p000.t62;
import p000.v72;
import p000.vi3;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.domain.util.FlowExtensionsKt$withDataFetchAndResults$refreshResultFlow$1", m4291f = "FlowExtensions.kt", m4292l = {161}, m4293m = "invokeSuspend", m4294v = 2)
final class FlowExtensionsKt$withDataFetchAndResults$refreshResultFlow$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f20138a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f20139b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c83 f20140c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vi3 f20141d;

    /* JADX INFO: renamed from: com.lingq.core.domain.util.FlowExtensionsKt$withDataFetchAndResults$refreshResultFlow$1$1 */
    @c32(m4290c = "com.lingq.core.domain.util.FlowExtensionsKt$withDataFetchAndResults$refreshResultFlow$1$1", m4291f = "FlowExtensions.kt", m4292l = {162, 165}, m4293m = "invokeSuspend", m4294v = 2)
    final class C15411 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f20142a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ll7 f20143b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ vi3 f20144c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15411(ll7 ll7Var, vi3 vi3Var, Continuation continuation) {
            super(2, continuation);
            this.f20143b = ll7Var;
            this.f20144c = vi3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C15411(this.f20143b, this.f20144c, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C15411) create((xfa) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        
            if (((p000.kl7) r6.f20143b).f47495f.mo4678m(r7, r6) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f20142a;
            if (i != 0) {
                if (i == 1) {
                    AbstractC3193b.m15359b(obj);
                } else {
                    if (i != 2) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj);
                }
                return xfa.f68157a;
            }
            AbstractC3193b.m15359b(obj);
            v72 v72Var = ph2.f56212a;
            t62 t62Var = t62.f61909c;
            C1542x98604582 c1542x98604582 = new C1542x98604582(this.f20144c, null);
            this.f20142a = 1;
            obj = wfb.m23905G(c1542x98604582, t62Var, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
            this.f20142a = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtensionsKt$withDataFetchAndResults$refreshResultFlow$1(c83 c83Var, vi3 vi3Var, Continuation continuation) {
        super(2, continuation);
        this.f20140c = c83Var;
        this.f20141d = vi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowExtensionsKt$withDataFetchAndResults$refreshResultFlow$1 flowExtensionsKt$withDataFetchAndResults$refreshResultFlow$1 = new FlowExtensionsKt$withDataFetchAndResults$refreshResultFlow$1(this.f20140c, this.f20141d, continuation);
        flowExtensionsKt$withDataFetchAndResults$refreshResultFlow$1.f20139b = obj;
        return flowExtensionsKt$withDataFetchAndResults$refreshResultFlow$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowExtensionsKt$withDataFetchAndResults$refreshResultFlow$1) create((ll7) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ll7 ll7Var = (ll7) this.f20139b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f20138a;
        xfa xfaVar = xfa.f68157a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        C3236f c3236fM15547z = AbstractC3224d.m15547z(new i83(xfaVar, 1), this.f20140c);
        C15411 c15411 = new C15411(ll7Var, this.f20141d, null);
        this.f20139b = null;
        this.f20138a = 1;
        return AbstractC3224d.m15529h(c3236fM15547z, c15411, this) == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
