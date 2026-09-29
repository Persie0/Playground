package com.lingq.feature.reader.old;

import android.widget.Toast;
import com.lingq.core.p012ui.R$string;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c32;
import p000.d89;
import p000.du0;
import p000.fa4;
import p000.fr5;
import p000.g89;
import p000.gm5;
import p000.j89;
import p000.l89;
import p000.ow7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$45", m4291f = "ReaderFragment.kt", m4292l = {1761}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderFragment$onViewCreated$5$45 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28398a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f28399b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$45$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$45$1", m4291f = "ReaderFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23161 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28400a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderFragment f28401b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23161(ReaderFragment readerFragment, Continuation continuation) {
            super(2, continuation);
            this.f28401b = readerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23161 c23161 = new C23161(this.f28401b, continuation);
            c23161.f28400a = obj;
            return c23161;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23161 c23161 = (C23161) create((l89) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23161.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            l89 l89Var = (l89) this.f28400a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            boolean zM11650l = fa4.m11650l(l89Var, d89.f35183a);
            ReaderFragment readerFragment = this.f28401b;
            if (zM11650l) {
                Toast.makeText(readerFragment.m2090R(), R$string.texts_try_later, 0).show();
            } else if (fa4.m11650l(l89Var, g89.f40390a)) {
                fr5 fr5Var = new fr5(readerFragment.m2090R(), 0);
                fr5Var.m12028k(com.lingq.feature.reader.R$string.lesson_simplify);
                fr5Var.m12020c(com.lingq.feature.reader.R$string.lesson_simplify_not_simplified);
                fr5Var.m12025h(R$string.ui_ok, ow7.f55079e).m25557a();
            } else {
                if (!fa4.m11650l(l89Var, j89.f45213a)) {
                    gm5.m12750e();
                    return null;
                }
                Toast.makeText(readerFragment.m2090R(), com.lingq.feature.reader.R$string.lesson_simplify_started, 0).show();
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderFragment$onViewCreated$5$45(ReaderFragment readerFragment, Continuation continuation) {
        super(2, continuation);
        this.f28399b = readerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderFragment$onViewCreated$5$45(this.f28399b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderFragment$onViewCreated$5$45) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28398a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            ReaderFragment readerFragment = this.f28399b;
            du0 du0Var = readerFragment.m9290W0().f29359f2;
            C23161 c23161 = new C23161(readerFragment, null);
            this.f28398a = 1;
            if (AbstractC3224d.m15529h(du0Var, c23161, this) == coroutineSingletons) {
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
