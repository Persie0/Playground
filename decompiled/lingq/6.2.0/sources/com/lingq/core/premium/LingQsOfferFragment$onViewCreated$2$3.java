package com.lingq.core.premium;

import android.widget.Toast;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.ce5;
import p000.du0;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.premium.LingQsOfferFragment$onViewCreated$2$3", m4291f = "LingQsOfferFragment.kt", m4292l = {112}, m4293m = "invokeSuspend", m4294v = 2)
final class LingQsOfferFragment$onViewCreated$2$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22363a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LingQsOfferFragment f22364b;

    /* JADX INFO: renamed from: com.lingq.core.premium.LingQsOfferFragment$onViewCreated$2$3$1 */
    @c32(m4290c = "com.lingq.core.premium.LingQsOfferFragment$onViewCreated$2$3$1", m4291f = "LingQsOfferFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C18371 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LingQsOfferFragment f22365a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18371(LingQsOfferFragment lingQsOfferFragment, Continuation continuation) {
            super(2, continuation);
            this.f22365a = lingQsOfferFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C18371(this.f22365a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C18371 c18371 = (C18371) create((xfa) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c18371.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            LingQsOfferFragment lingQsOfferFragment = this.f22365a;
            Toast.makeText(lingQsOfferFragment.m2090R(), lingQsOfferFragment.m2111m(com.lingq.core.p012ui.R$string.texts_try_later), 1).show();
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LingQsOfferFragment$onViewCreated$2$3(LingQsOfferFragment lingQsOfferFragment, Continuation continuation) {
        super(2, continuation);
        this.f22364b = lingQsOfferFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LingQsOfferFragment$onViewCreated$2$3(this.f22364b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LingQsOfferFragment$onViewCreated$2$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22363a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            LingQsOfferFragment lingQsOfferFragment = this.f22364b;
            du0 du0Var = ((ce5) lingQsOfferFragment.f22347C0.getValue()).f9982k;
            C18371 c18371 = new C18371(lingQsOfferFragment, null);
            this.f22363a = 1;
            if (AbstractC3224d.m15529h(du0Var, c18371, this) == coroutineSingletons) {
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
