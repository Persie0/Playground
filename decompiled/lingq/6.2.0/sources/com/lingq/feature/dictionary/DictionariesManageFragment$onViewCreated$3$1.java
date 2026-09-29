package com.lingq.feature.dictionary;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c18;
import p000.c32;
import p000.fa4;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.dictionary.DictionariesManageFragment$onViewCreated$3$1", m4291f = "DictionariesManageFragment.kt", m4292l = {127}, m4293m = "invokeSuspend", m4294v = 2)
final class DictionariesManageFragment$onViewCreated$3$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25733a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DictionariesManageFragment f25734b;

    /* JADX INFO: renamed from: com.lingq.feature.dictionary.DictionariesManageFragment$onViewCreated$3$1$1 */
    @c32(m4290c = "com.lingq.feature.dictionary.DictionariesManageFragment$onViewCreated$3$1$1", m4291f = "DictionariesManageFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20551 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f25735a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ DictionariesManageFragment f25736b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20551(DictionariesManageFragment dictionariesManageFragment, Continuation continuation) {
            super(2, continuation);
            this.f25736b = dictionariesManageFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C20551 c20551 = new C20551(this.f25736b, continuation);
            c20551.f25735a = obj;
            return c20551;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C20551 c20551 = (C20551) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c20551.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f25735a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2064h c2064h = this.f25736b.f25722S0;
            if (c2064h != null) {
                c2064h.m21309l(list);
                return xfa.f68157a;
            }
            fa4.m11636J("dictionariesManageAdapter");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionariesManageFragment$onViewCreated$3$1(DictionariesManageFragment dictionariesManageFragment, Continuation continuation) {
        super(2, continuation);
        this.f25734b = dictionariesManageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DictionariesManageFragment$onViewCreated$3$1(this.f25734b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((DictionariesManageFragment$onViewCreated$3$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25733a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = DictionariesManageFragment.f25721W0;
            DictionariesManageFragment dictionariesManageFragment = this.f25734b;
            c18 c18Var = dictionariesManageFragment.m8963B0().f25802l;
            C20551 c20551 = new C20551(dictionariesManageFragment, null);
            c18Var.getClass();
            this.f25733a = 1;
            if (AbstractC3224d.m15529h(c18Var, c20551, this) == coroutineSingletons) {
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
