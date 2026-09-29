package com.lingq.feature.reader.old;

import com.lingq.core.domain.model.theme.TextHighlightStyle;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.vx7;
import p000.wi7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$16", m4291f = "ReaderPageFragment.kt", m4292l = {630}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageFragment$onViewCreated$2$16 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28503a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderPageFragment f28504b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$16$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$16$1", m4291f = "ReaderPageFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23361 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28505a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderPageFragment f28506b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23361(ReaderPageFragment readerPageFragment, Continuation continuation) {
            super(2, continuation);
            this.f28506b = readerPageFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23361 c23361 = new C23361(this.f28506b, continuation);
            c23361.f28505a = obj;
            return c23361;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23361 c23361 = (C23361) create((TextHighlightStyle) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23361.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            TextHighlightStyle textHighlightStyle = (TextHighlightStyle) this.f28505a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            vx7 vx7Var = ReaderPageFragment.Companion;
            C2411m c2411mM9299X0 = this.f28506b.m9299X0();
            c2411mM9299X0.getClass();
            textHighlightStyle.getClass();
            C3244l c3244l = c2411mM9299X0.f29214S;
            c3244l.getClass();
            c3244l.m15572j(null, textHighlightStyle);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageFragment$onViewCreated$2$16(ReaderPageFragment readerPageFragment, Continuation continuation) {
        super(2, continuation);
        this.f28504b = readerPageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderPageFragment$onViewCreated$2$16(this.f28504b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderPageFragment$onViewCreated$2$16) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28503a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            vx7 vx7Var = ReaderPageFragment.Companion;
            ReaderPageFragment readerPageFragment = this.f28504b;
            wi7 wi7Var = readerPageFragment.m9299X0().f29240j0;
            C23361 c23361 = new C23361(readerPageFragment, null);
            this.f28503a = 1;
            if (AbstractC3224d.m15529h(wi7Var, c23361, this) == coroutineSingletons) {
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
