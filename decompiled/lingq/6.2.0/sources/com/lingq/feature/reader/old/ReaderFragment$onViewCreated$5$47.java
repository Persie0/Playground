package com.lingq.feature.reader.old;

import androidx.fragment.app.FragmentContainerView;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c18;
import p000.c32;
import p000.jfa;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$47", m4291f = "ReaderFragment.kt", m4292l = {2110}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderFragment$onViewCreated$5$47 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28406a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f28407b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$47$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$47$1", m4291f = "ReaderFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23181 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ boolean f28408a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderFragment f28409b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23181(ReaderFragment readerFragment, Continuation continuation) {
            super(2, continuation);
            this.f28409b = readerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23181 c23181 = new C23181(this.f28409b, continuation);
            c23181.f28408a = ((Boolean) obj).booleanValue();
            return c23181;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            C23181 c23181 = (C23181) create(bool, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23181.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z = this.f28408a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ReaderFragment readerFragment = this.f28409b;
            if (z) {
                bh4[] bh4VarArr = ReaderFragment.f28218P0;
                FragmentContainerView fragmentContainerView = readerFragment.m9288U0().f66703i;
                if (fragmentContainerView != null) {
                    jfa.m14429l(fragmentContainerView);
                }
            } else {
                bh4[] bh4VarArr2 = ReaderFragment.f28218P0;
                FragmentContainerView fragmentContainerView2 = readerFragment.m9288U0().f66703i;
                if (fragmentContainerView2 != null) {
                    jfa.m14425h(fragmentContainerView2);
                }
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderFragment$onViewCreated$5$47(ReaderFragment readerFragment, Continuation continuation) {
        super(2, continuation);
        this.f28407b = readerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderFragment$onViewCreated$5$47(this.f28407b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderFragment$onViewCreated$5$47) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28406a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            ReaderFragment readerFragment = this.f28407b;
            c18 c18Var = readerFragment.m9290W0().f29299N0;
            C23181 c23181 = new C23181(readerFragment, null);
            c18Var.getClass();
            this.f28406a = 1;
            if (AbstractC3224d.m15529h(c18Var, c23181, this) == coroutineSingletons) {
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
