package com.lingq.core.premium;

import android.widget.Toast;
import java.util.Arrays;
import java.util.Locale;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.ce5;
import p000.du0;
import p000.id3;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.premium.LingQsOfferFragment$onViewCreated$2$2", m4291f = "LingQsOfferFragment.kt", m4292l = {93}, m4293m = "invokeSuspend", m4294v = 2)
final class LingQsOfferFragment$onViewCreated$2$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22359a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LingQsOfferFragment f22360b;

    /* JADX INFO: renamed from: com.lingq.core.premium.LingQsOfferFragment$onViewCreated$2$2$1 */
    @c32(m4290c = "com.lingq.core.premium.LingQsOfferFragment$onViewCreated$2$2$1", m4291f = "LingQsOfferFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C18361 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ int f22361a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LingQsOfferFragment f22362b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18361(LingQsOfferFragment lingQsOfferFragment, Continuation continuation) {
            super(2, continuation);
            this.f22362b = lingQsOfferFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C18361 c18361 = new C18361(this.f22362b, continuation);
            c18361.f22361a = ((Number) obj).intValue();
            return c18361;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C18361 c18361 = (C18361) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c18361.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.f22361a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            LingQsOfferFragment lingQsOfferFragment = this.f22362b;
            id3 id3VarM2089Q = lingQsOfferFragment.m2089Q();
            Locale locale = Locale.getDefault();
            String strM2111m = lingQsOfferFragment.m2111m(com.lingq.core.p012ui.R$string.upgrade_more_lingqs_success);
            strM2111m.getClass();
            Toast.makeText(id3VarM2089Q, String.format(locale, strM2111m, Arrays.copyOf(new Object[]{new Integer(i)}, 1)), 1).show();
            lingQsOfferFragment.m2109k().m2148U(LingQsOfferFragment.class.getName());
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LingQsOfferFragment$onViewCreated$2$2(LingQsOfferFragment lingQsOfferFragment, Continuation continuation) {
        super(2, continuation);
        this.f22360b = lingQsOfferFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LingQsOfferFragment$onViewCreated$2$2(this.f22360b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LingQsOfferFragment$onViewCreated$2$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22359a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            LingQsOfferFragment lingQsOfferFragment = this.f22360b;
            du0 du0Var = ((ce5) lingQsOfferFragment.f22347C0.getValue()).f9980i;
            C18361 c18361 = new C18361(lingQsOfferFragment, null);
            this.f22359a = 1;
            if (AbstractC3224d.m15529h(du0Var, c18361, this) == coroutineSingletons) {
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
