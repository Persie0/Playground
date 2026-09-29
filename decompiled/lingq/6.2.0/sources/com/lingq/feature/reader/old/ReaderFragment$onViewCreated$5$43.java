package com.lingq.feature.reader.old;

import com.lingq.feature.reader.R$string;
import java.util.Arrays;
import kotlin.AbstractC3193b;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c32;
import p000.du0;
import p000.fr5;
import p000.iw7;
import p000.ow7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$43", m4291f = "ReaderFragment.kt", m4292l = {1715}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderFragment$onViewCreated$5$43 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28391a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f28392b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$43$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$43$1", m4291f = "ReaderFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23141 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28393a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderFragment f28394b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23141(ReaderFragment readerFragment, Continuation continuation) {
            super(2, continuation);
            this.f28394b = readerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23141 c23141 = new C23141(this.f28394b, continuation);
            c23141.f28393a = obj;
            return c23141;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23141 c23141 = (C23141) create((Triple) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23141.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Triple triple = (Triple) this.f28393a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            int iIntValue = ((Number) triple.f47633a).intValue();
            int iIntValue2 = ((Number) triple.f47634b).intValue();
            String str = (String) triple.f47635c;
            ReaderFragment readerFragment = this.f28394b;
            fr5 fr5Var = new fr5(readerFragment.m2089Q(), 0);
            fr5Var.m12028k(R$string.texts_update_lesson_position_title);
            String strM2111m = readerFragment.m2111m(R$string.texts_update_lesson_position);
            strM2111m.getClass();
            fr5Var.f71376a.f65209g = String.format(strM2111m, Arrays.copyOf(new Object[]{String.valueOf(iIntValue + 1), String.valueOf(iIntValue2 + 1), str}, 3));
            fr5Var.m12022e(com.lingq.core.p012ui.R$string.ui_no, ow7.f55077c).m12025h(com.lingq.core.p012ui.R$string.ui_yes, new iw7(3, readerFragment)).m25557a();
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderFragment$onViewCreated$5$43(ReaderFragment readerFragment, Continuation continuation) {
        super(2, continuation);
        this.f28392b = readerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderFragment$onViewCreated$5$43(this.f28392b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderFragment$onViewCreated$5$43) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28391a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            ReaderFragment readerFragment = this.f28392b;
            du0 du0Var = readerFragment.m9290W0().f29413v0;
            C23141 c23141 = new C23141(readerFragment, null);
            this.f28391a = 1;
            if (AbstractC3224d.m15529h(du0Var, c23141, this) == coroutineSingletons) {
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
