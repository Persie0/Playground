package com.lingq.core.web;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.b34;
import p000.bh4;
import p000.c32;
import p000.du0;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.web.WebViewFragment$onViewCreated$5$1", m4291f = "WebViewFragment.kt", m4292l = {160}, m4293m = "invokeSuspend", m4294v = 2)
final class WebViewFragment$onViewCreated$5$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24326a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ WebViewFragment f24327b;

    /* JADX INFO: renamed from: com.lingq.core.web.WebViewFragment$onViewCreated$5$1$1 */
    @c32(m4290c = "com.lingq.core.web.WebViewFragment$onViewCreated$5$1$1", m4291f = "WebViewFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C19411 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ WebViewFragment f24328a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19411(WebViewFragment webViewFragment, Continuation continuation) {
            super(2, continuation);
            this.f24328a = webViewFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C19411(this.f24328a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C19411 c19411 = (C19411) create((xfa) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c19411.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            b34.m3244j(this.f24328a).m22689f();
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewFragment$onViewCreated$5$1(WebViewFragment webViewFragment, Continuation continuation) {
        super(2, continuation);
        this.f24327b = webViewFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebViewFragment$onViewCreated$5$1(this.f24327b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((WebViewFragment$onViewCreated$5$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24326a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = WebViewFragment.f24315V0;
            WebViewFragment webViewFragment = this.f24327b;
            du0 du0Var = ((C1943a) webViewFragment.f24318U0.getValue()).f24344h;
            C19411 c19411 = new C19411(webViewFragment, null);
            this.f24326a = 1;
            if (AbstractC3224d.m15529h(du0Var, c19411, this) == coroutineSingletons) {
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
