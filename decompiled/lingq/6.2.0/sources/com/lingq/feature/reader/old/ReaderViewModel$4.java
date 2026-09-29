package com.lingq.feature.reader.old;

import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.domain.model.language.Language;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.eh9;
import p000.fa4;
import p000.lda;
import p000.nn1;
import p000.tw7;
import p000.un1;
import p000.vk9;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$4", m4291f = "ReaderViewModel.kt", m4292l = {2943}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$4 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28874a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f28875b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderViewModel$4$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$4$1", m4291f = "ReaderViewModel.kt", m4292l = {793}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23881 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f28876a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f28877b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C2412n f28878c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23881(C2412n c2412n, Continuation continuation) {
            super(2, continuation);
            this.f28878c = c2412n;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23881 c23881 = new C23881(this.f28878c, continuation);
            c23881.f28877b = obj;
            return c23881;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C23881) create((Language) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Language language = (Language) this.f28877b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f28876a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                if (language != null) {
                    C2412n c2412n = this.f28878c;
                    nn1 nn1Var = c2412n.f29301O;
                    tw7 tw7Var = c2412n.f29307Q;
                    if (vk9.m23391n0(tw7Var.f63018f) || fa4.m11650l(language.f19024a, tw7Var.f63018f)) {
                        boolean z = !c2412n.m9331k3();
                        AbstractC1263a.m7046a(c2412n.f29312R1);
                        c2412n.f29312R1 = wfb.m23926u(lda.m16103C(c2412n), nn1Var, null, new ReaderViewModel$fetchLesson$1(c2412n, z, null), 2);
                        AbstractC1263a.m7047b(lda.m16103C(c2412n), nn1Var, "streak", new ReaderViewModel$getStreak$1(c2412n, null));
                        AbstractC1263a.m7047b(lda.m16103C(c2412n), nn1Var, "update streak", new ReaderViewModel$updateStreak$1(c2412n, null));
                    } else {
                        String str = tw7Var.f63018f;
                        this.f28877b = null;
                        this.f28876a = 1;
                        if (c2412n.f29340b.mo4576F1(str, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$4(C2412n c2412n, Continuation continuation) {
        super(2, continuation);
        this.f28875b = c2412n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$4(this.f28875b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$4) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28874a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2412n c2412n = this.f28875b;
            eh9 eh9VarMo4572B0 = c2412n.f29340b.mo4572B0();
            C23881 c23881 = new C23881(c2412n, null);
            eh9VarMo4572B0.getClass();
            this.f28874a = 1;
            if (AbstractC3224d.m15529h(eh9VarMo4572B0, c23881, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3386nv.m17633t("SharedFlow never completes, this call should never return.");
        return null;
    }
}
