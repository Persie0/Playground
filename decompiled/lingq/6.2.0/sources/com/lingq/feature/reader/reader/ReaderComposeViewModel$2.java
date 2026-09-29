package com.lingq.feature.reader.reader;

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
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$2", m4291f = "ReaderComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderComposeViewModel$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ int f29952a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2493a f29953b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.reader.ReaderComposeViewModel$2$1 */
    @c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$2$1", m4291f = "ReaderComposeViewModel.kt", m4292l = {232}, m4293m = "invokeSuspend", m4294v = 2)
    final class C24761 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f29954a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2493a f29955b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f29956c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f29957d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24761(C2493a c2493a, int i, String str, Continuation continuation) {
            super(2, continuation);
            this.f29955b = c2493a;
            this.f29956c = i;
            this.f29957d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C24761(this.f29955b, this.f29956c, this.f29957d, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C24761) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f29954a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C2497a c2497a = this.f29955b.f30182D;
                this.f29954a = 1;
                if (c2497a.m9398a(this.f29956c, this.f29957d, this) == coroutineSingletons) {
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
    public ReaderComposeViewModel$2(C2493a c2493a, Continuation continuation) {
        super(2, continuation);
        this.f29953b = c2493a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReaderComposeViewModel$2 readerComposeViewModel$2 = new ReaderComposeViewModel$2(this.f29953b, continuation);
        readerComposeViewModel$2.f29952a = ((Number) obj).intValue();
        return readerComposeViewModel$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReaderComposeViewModel$2 readerComposeViewModel$2 = (ReaderComposeViewModel$2) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        readerComposeViewModel$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.f29952a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (i > 0) {
            C2493a c2493a = this.f29953b;
            String strMo4589b2 = c2493a.f30206b.mo4589b2();
            if (!vk9.m23391n0(strMo4589b2)) {
                wfb.m23926u(lda.m16103C(c2493a), null, null, new C24761(c2493a, i, strMo4589b2, null), 3);
            }
        }
        return xfa.f68157a;
    }
}
