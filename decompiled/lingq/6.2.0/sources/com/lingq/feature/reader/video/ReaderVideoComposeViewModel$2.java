package com.lingq.feature.reader.video;

import com.lingq.feature.reader.reader.domain.C2497a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.lda;
import p000.un1;
import p000.vk9;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.ReaderVideoComposeViewModel$2", m4291f = "ReaderVideoComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderVideoComposeViewModel$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ int f31170a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2583a f31171b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.video.ReaderVideoComposeViewModel$2$1 */
    @c32(m4290c = "com.lingq.feature.reader.video.ReaderVideoComposeViewModel$2$1", m4291f = "ReaderVideoComposeViewModel.kt", m4292l = {334}, m4293m = "invokeSuspend", m4294v = 2)
    final class C25751 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f31172a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2583a f31173b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f31174c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f31175d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25751(C2583a c2583a, int i, String str, Continuation continuation) {
            super(2, continuation);
            this.f31173b = c2583a;
            this.f31174c = i;
            this.f31175d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C25751(this.f31173b, this.f31174c, this.f31175d, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C25751) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f31172a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C2497a c2497a = this.f31173b.f31383p;
                this.f31172a = 1;
                if (c2497a.m9398a(this.f31174c, this.f31175d, this) == coroutineSingletons) {
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
    public ReaderVideoComposeViewModel$2(C2583a c2583a, Continuation continuation) {
        super(2, continuation);
        this.f31171b = c2583a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReaderVideoComposeViewModel$2 readerVideoComposeViewModel$2 = new ReaderVideoComposeViewModel$2(this.f31171b, continuation);
        readerVideoComposeViewModel$2.f31170a = ((Number) obj).intValue();
        return readerVideoComposeViewModel$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReaderVideoComposeViewModel$2 readerVideoComposeViewModel$2 = (ReaderVideoComposeViewModel$2) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        readerVideoComposeViewModel$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.f31170a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (i > 0) {
            C2583a c2583a = this.f31171b;
            String strMo4589b2 = c2583a.f31369b.mo4589b2();
            if (!vk9.m23391n0(strMo4589b2)) {
                wfb.m23926u(lda.m16103C(c2583a), null, null, new C25751(c2583a, i, strMo4589b2, null), 3);
            }
        }
        return xfa.f68157a;
    }
}
