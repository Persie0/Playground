package com.lingq.feature.reader.old;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.token.TokenPopupData;
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
import p000.kj3;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$16", m4291f = "ReaderFragment.kt", m4292l = {DescriptorProtos.Edition.EDITION_2023_VALUE}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderFragment$onViewCreated$5$16 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28277a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f28278b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$16$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$16$1", m4291f = "ReaderFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C22831 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28279a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderFragment f28280b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22831(ReaderFragment readerFragment, Continuation continuation) {
            super(2, continuation);
            this.f28280b = readerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C22831 c22831 = new C22831(this.f28280b, continuation);
            c22831.f28279a = obj;
            return c22831;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C22831 c22831 = (C22831) create((TokenPopupData) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c22831.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            TokenPopupData tokenPopupData = (TokenPopupData) this.f28279a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ReaderFragment readerFragment = this.f28280b;
            ded.m10315a(readerFragment.m2106h(), !readerFragment.m9292Y0());
            readerFragment.m9288U0().f66709o.postDelayed(new kj3(6, readerFragment, tokenPopupData), 400L);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderFragment$onViewCreated$5$16(ReaderFragment readerFragment, Continuation continuation) {
        super(2, continuation);
        this.f28278b = readerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderFragment$onViewCreated$5$16(this.f28278b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderFragment$onViewCreated$5$16) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28277a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            ReaderFragment readerFragment = this.f28278b;
            c83 c83VarMo8773q2 = readerFragment.m9290W0().f29344c.mo8773q2();
            C22831 c22831 = new C22831(readerFragment, null);
            this.f28277a = 1;
            if (AbstractC3224d.m15529h(c83VarMo8773q2, c22831, this) == coroutineSingletons) {
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
