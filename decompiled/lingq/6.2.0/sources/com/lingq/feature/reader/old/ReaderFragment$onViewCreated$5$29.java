package com.lingq.feature.reader.old;

import android.os.Bundle;
import androidx.fragment.app.AbstractC0638f;
import com.lingq.core.premium.LingQsOfferFragment;
import com.lingq.feature.reader.R$id;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c32;
import p000.c83;
import p000.ded;
import p000.jfa;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$29", m4291f = "ReaderFragment.kt", m4292l = {1266}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderFragment$onViewCreated$5$29 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28331a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f28332b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$29$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$29$1", m4291f = "ReaderFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C22971 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ReaderFragment f28333a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22971(ReaderFragment readerFragment, Continuation continuation) {
            super(2, continuation);
            this.f28333a = readerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C22971(this.f28333a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C22971 c22971 = (C22971) create((xfa) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c22971.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            AbstractC0638f abstractC0638fM14427j = jfa.m14427j(this.f28333a);
            int i = R$id.fragment_upgrade;
            Bundle bundle = new Bundle();
            if (((LingQsOfferFragment) (abstractC0638fM14427j != null ? abstractC0638fM14427j.m2137E(LingQsOfferFragment.class.getName()) : null)) == null) {
                LingQsOfferFragment lingQsOfferFragment = new LingQsOfferFragment();
                lingQsOfferFragment.m2095W(bundle);
                if (abstractC0638fM14427j != null) {
                    ded.m10316b(abstractC0638fM14427j, lingQsOfferFragment, i, LingQsOfferFragment.class.getName(), true);
                }
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderFragment$onViewCreated$5$29(ReaderFragment readerFragment, Continuation continuation) {
        super(2, continuation);
        this.f28332b = readerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderFragment$onViewCreated$5$29(this.f28332b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderFragment$onViewCreated$5$29) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28331a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            ReaderFragment readerFragment = this.f28332b;
            c83 c83VarMo3742s0 = readerFragment.m9290W0().f29372j.mo3742s0();
            C22971 c22971 = new C22971(readerFragment, null);
            this.f28331a = 1;
            if (AbstractC3224d.m15529h(c83VarMo3742s0, c22971, this) == coroutineSingletons) {
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
