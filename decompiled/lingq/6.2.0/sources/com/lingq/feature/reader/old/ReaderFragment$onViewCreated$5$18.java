package com.lingq.feature.reader.old;

import androidx.fragment.app.AbstractC0638f;
import com.lingq.core.token.TokenPopupHostFragment;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c32;
import p000.c83;
import p000.jfa;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$18", m4291f = "ReaderFragment.kt", m4292l = {1026}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderFragment$onViewCreated$5$18 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28284a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f28285b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$18$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$18$1", m4291f = "ReaderFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C22851 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ int f28286a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderFragment f28287b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22851(ReaderFragment readerFragment, Continuation continuation) {
            super(2, continuation);
            this.f28287b = readerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C22851 c22851 = new C22851(this.f28287b, continuation);
            c22851.f28286a = ((Number) obj).intValue();
            return c22851;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C22851 c22851 = (C22851) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c22851.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.f28286a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ReaderFragment readerFragment = this.f28287b;
            AbstractC0638f abstractC0638fM14427j = jfa.m14427j(readerFragment);
            if (((TokenPopupHostFragment) (abstractC0638fM14427j != null ? abstractC0638fM14427j.m2137E(TokenPopupHostFragment.class.getName()) : null)) != null) {
                bh4[] bh4VarArr = ReaderFragment.f28218P0;
                readerFragment.m9290W0().mo8747U1();
            }
            if (i < 0) {
                bh4[] bh4VarArr2 = ReaderFragment.f28218P0;
                readerFragment.m9288U0().f66709o.m2892c(readerFragment.m9290W0().m9323d3() - 1, true);
            } else {
                bh4[] bh4VarArr3 = ReaderFragment.f28218P0;
                readerFragment.m9288U0().f66709o.m2892c(readerFragment.m9290W0().m9323d3() + 1, true);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderFragment$onViewCreated$5$18(ReaderFragment readerFragment, Continuation continuation) {
        super(2, continuation);
        this.f28285b = readerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderFragment$onViewCreated$5$18(this.f28285b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderFragment$onViewCreated$5$18) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28284a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            ReaderFragment readerFragment = this.f28285b;
            c83 c83VarMo8746T = readerFragment.m9290W0().f29344c.mo8746T();
            C22851 c22851 = new C22851(readerFragment, null);
            this.f28284a = 1;
            if (AbstractC3224d.m15529h(c83VarMo8746T, c22851, this) == coroutineSingletons) {
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
