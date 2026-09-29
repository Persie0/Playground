package com.lingq.feature.reader.old;

import com.google.android.material.R$attr;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.abd;
import p000.bh4;
import p000.c18;
import p000.c32;
import p000.jfa;
import p000.nz9;
import p000.u91;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$10", m4291f = "ReaderFragment.kt", m4292l = {2110}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderFragment$onViewCreated$5$10 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28255a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f28256b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$10$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$10$1", m4291f = "ReaderFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C22771 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28257a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderFragment f28258b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22771(ReaderFragment readerFragment, Continuation continuation) {
            super(2, continuation);
            this.f28258b = readerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C22771 c22771 = new C22771(this.f28258b, continuation);
            c22771.f28257a = obj;
            return c22771;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C22771 c22771 = (C22771) create((nz9) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c22771.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            nz9 nz9Var = (nz9) this.f28257a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            String str = (String) u91.m22591I0(nz9Var.f53460f.f70706b);
            ReaderFragment readerFragment = this.f28258b;
            int iM253i = str != null ? abd.m253i(str) : jfa.m14431n(readerFragment.m2090R(), R$attr.colorSurface);
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            readerFragment.m9288U0().f66684E.setBackgroundColor(iM253i);
            readerFragment.m9288U0().f66702h.setCardBackgroundColor(iM253i);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderFragment$onViewCreated$5$10(ReaderFragment readerFragment, Continuation continuation) {
        super(2, continuation);
        this.f28256b = readerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderFragment$onViewCreated$5$10(this.f28256b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderFragment$onViewCreated$5$10) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28255a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            ReaderFragment readerFragment = this.f28256b;
            c18 c18Var = readerFragment.m9290W0().f29383l2;
            C22771 c22771 = new C22771(readerFragment, null);
            c18Var.getClass();
            this.f28255a = 1;
            if (AbstractC3224d.m15529h(c18Var, c22771, this) == coroutineSingletons) {
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
