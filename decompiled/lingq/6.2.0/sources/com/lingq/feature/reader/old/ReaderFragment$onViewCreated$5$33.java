package com.lingq.feature.reader.old;

import com.lingq.core.token.edit.TokenEditData;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.b34;
import p000.bd6;
import p000.bh4;
import p000.c32;
import p000.c83;
import p000.jfa;
import p000.un1;
import p000.xfa;
import p000.zc6;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$33", m4291f = "ReaderFragment.kt", m4292l = {1552}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderFragment$onViewCreated$5$33 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28349a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f28350b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$33$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$33$1", m4291f = "ReaderFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23021 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28351a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderFragment f28352b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23021(ReaderFragment readerFragment, Continuation continuation) {
            super(2, continuation);
            this.f28352b = readerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23021 c23021 = new C23021(this.f28352b, continuation);
            c23021.f28351a = obj;
            return c23021;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23021 c23021 = (C23021) create((TokenEditData) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23021.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            TokenEditData tokenEditData = (TokenEditData) this.f28351a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            bd6.Companion.getClass();
            tokenEditData.getClass();
            jfa.m14428k(b34.m3244j(this.f28352b), new zc6(tokenEditData), null);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderFragment$onViewCreated$5$33(ReaderFragment readerFragment, Continuation continuation) {
        super(2, continuation);
        this.f28350b = readerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderFragment$onViewCreated$5$33(this.f28350b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderFragment$onViewCreated$5$33) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28349a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            ReaderFragment readerFragment = this.f28350b;
            c83 c83VarMo8739F = readerFragment.m9290W0().f29344c.mo8739F();
            C23021 c23021 = new C23021(readerFragment, null);
            this.f28349a = 1;
            if (AbstractC3224d.m15529h(c83VarMo8739F, c23021, this) == coroutineSingletons) {
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
