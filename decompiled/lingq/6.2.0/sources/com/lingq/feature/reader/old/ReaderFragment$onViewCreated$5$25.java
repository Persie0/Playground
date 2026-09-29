package com.lingq.feature.reader.old;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.b34;
import p000.bh4;
import p000.c32;
import p000.du0;
import p000.jfa;
import p000.un1;
import p000.vw7;
import p000.xfa;
import p000.yw7;
import p000.zi3;
import p000.zw7;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$25", m4291f = "ReaderFragment.kt", m4292l = {1191}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderFragment$onViewCreated$5$25 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28315a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f28316b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$25$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$25$1", m4291f = "ReaderFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C22931 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28317a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderFragment f28318b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22931(ReaderFragment readerFragment, Continuation continuation) {
            super(2, continuation);
            this.f28318b = readerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C22931 c22931 = new C22931(this.f28318b, continuation);
            c22931.f28317a = obj;
            return c22931;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C22931 c22931 = (C22931) create((Pair) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c22931.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Pair pair = (Pair) this.f28317a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            int iIntValue = ((Number) pair.f47623a).intValue();
            List list = (List) pair.f47624b;
            yw7 yw7Var = zw7.Companion;
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            ReaderFragment readerFragment = this.f28318b;
            int iM9332l3 = readerFragment.m9290W0().m9332l3();
            String[] strArr = (String[]) list.toArray(new String[0]);
            yw7Var.getClass();
            strArr.getClass();
            jfa.m14428k(b34.m3244j(readerFragment), new vw7(iM9332l3, iIntValue, strArr), null);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderFragment$onViewCreated$5$25(ReaderFragment readerFragment, Continuation continuation) {
        super(2, continuation);
        this.f28316b = readerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderFragment$onViewCreated$5$25(this.f28316b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderFragment$onViewCreated$5$25) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28315a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            ReaderFragment readerFragment = this.f28316b;
            du0 du0Var = readerFragment.m9290W0().f29261A1;
            C22931 c22931 = new C22931(readerFragment, null);
            this.f28315a = 1;
            if (AbstractC3224d.m15529h(du0Var, c22931, this) == coroutineSingletons) {
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
