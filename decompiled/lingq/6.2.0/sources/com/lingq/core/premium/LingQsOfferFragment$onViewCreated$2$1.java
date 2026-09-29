package com.lingq.core.premium;

import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.lingq.core.domain.model.user.LingQsOffer;
import com.lingq.core.domain.model.user.ProfileAccount;
import java.util.Arrays;
import java.util.Locale;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c32;
import p000.c83;
import p000.ce5;
import p000.hg3;
import p000.jfa;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.premium.LingQsOfferFragment$onViewCreated$2$1", m4291f = "LingQsOfferFragment.kt", m4292l = {70}, m4293m = "invokeSuspend", m4294v = 2)
final class LingQsOfferFragment$onViewCreated$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22356a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LingQsOfferFragment f22357b;

    /* JADX INFO: renamed from: com.lingq.core.premium.LingQsOfferFragment$onViewCreated$2$1$1 */
    @c32(m4290c = "com.lingq.core.premium.LingQsOfferFragment$onViewCreated$2$1$1", m4291f = "LingQsOfferFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C18351 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LingQsOfferFragment f22358a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18351(LingQsOfferFragment lingQsOfferFragment, Continuation continuation) {
            super(2, continuation);
            this.f22358a = lingQsOfferFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C18351(this.f22358a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C18351 c18351 = (C18351) create((ProfileAccount) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c18351.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = LingQsOfferFragment.f22346E0;
            LingQsOfferFragment lingQsOfferFragment = this.f22358a;
            hg3 hg3VarM8513R0 = lingQsOfferFragment.m8513R0();
            hg3VarM8513R0.f42323e.m6161b();
            MaterialButton materialButton = hg3VarM8513R0.f42320b;
            jfa.m14429l(materialButton);
            TextView textView = hg3VarM8513R0.f42321c;
            Locale locale = Locale.getDefault();
            String strM2111m = lingQsOfferFragment.m2111m(R$string.upgrade_offer_need_time_desc);
            strM2111m.getClass();
            LingQsOffer lingQsOffer = LingQsOffer.LimitOffer;
            textView.setText(String.format(locale, strM2111m, Arrays.copyOf(new Object[]{new Integer(lingQsOffer.amount())}, 1)));
            Locale locale2 = Locale.getDefault();
            String strM2111m2 = lingQsOfferFragment.m2111m(R$string.upgrade_get_more_lingqs);
            strM2111m2.getClass();
            materialButton.setText(String.format(locale2, strM2111m2, Arrays.copyOf(new Object[]{new Integer(lingQsOffer.amount())}, 1)));
            materialButton.setOnClickListener(new ViewOnClickListenerC1841c(lingQsOfferFragment));
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LingQsOfferFragment$onViewCreated$2$1(LingQsOfferFragment lingQsOfferFragment, Continuation continuation) {
        super(2, continuation);
        this.f22357b = lingQsOfferFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LingQsOfferFragment$onViewCreated$2$1(this.f22357b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LingQsOfferFragment$onViewCreated$2$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22356a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            LingQsOfferFragment lingQsOfferFragment = this.f22357b;
            c83 c83VarMo4583O1 = ((ce5) lingQsOfferFragment.f22347C0.getValue()).f9974c.mo4583O1();
            C18351 c18351 = new C18351(lingQsOfferFragment, null);
            this.f22356a = 1;
            if (AbstractC3224d.m15529h(c83VarMo4583O1, c18351, this) == coroutineSingletons) {
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
