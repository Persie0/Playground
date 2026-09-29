package com.lingq.feature.reader.old;

import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.C3540rl;
import p000.bj3;
import p000.c32;
import p000.e83;
import p000.kk8;
import p000.un1;
import p000.vx7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$3", m4291f = "ReaderPageFragment.kt", m4292l = {390}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageFragment$onViewCreated$2$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28552a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderPageFragment f28553b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$3$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$3$1", m4291f = "ReaderPageFragment.kt", m4292l = {389}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23481 extends SuspendLambda implements bj3 {

        /* JADX INFO: renamed from: a */
        public int f28554a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ e83 f28555b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Map f28556c;

        @Override // p000.bj3
        /* JADX INFO: renamed from: e */
        public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
            C23481 c23481 = new C23481(4, (Continuation) obj4);
            c23481.f28555b = (e83) obj;
            c23481.f28556c = (Map) obj2;
            return c23481.invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            e83 e83Var = this.f28555b;
            Map map = this.f28556c;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f28554a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                this.f28555b = null;
                this.f28556c = null;
                this.f28554a = 1;
                if (e83Var.emit(map, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$3$2 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$3$2", m4291f = "ReaderPageFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23492 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28557a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderPageFragment f28558b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23492(ReaderPageFragment readerPageFragment, Continuation continuation) {
            super(2, continuation);
            this.f28558b = readerPageFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23492 c23492 = new C23492(this.f28558b, continuation);
            c23492.f28557a = obj;
            return c23492;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23492 c23492 = (C23492) create((Map) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23492.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Map map = (Map) this.f28557a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            vx7 vx7Var = ReaderPageFragment.Companion;
            C2411m c2411mM9299X0 = this.f28558b.m9299X0();
            c2411mM9299X0.getClass();
            map.getClass();
            C3244l c3244l = c2411mM9299X0.f29198C;
            c3244l.getClass();
            c3244l.m15572j(null, map);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageFragment$onViewCreated$2$3(ReaderPageFragment readerPageFragment, Continuation continuation) {
        super(2, continuation);
        this.f28553b = readerPageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderPageFragment$onViewCreated$2$3(this.f28553b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderPageFragment$onViewCreated$2$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28552a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            vx7 vx7Var = ReaderPageFragment.Companion;
            ReaderPageFragment readerPageFragment = this.f28553b;
            kk8 kk8VarM15543v = AbstractC3224d.m15543v(readerPageFragment.m9298W0().f29293L0, new C3540rl(readerPageFragment.m9299X0().f29255w, 5), new C23481(4, null));
            C23492 c23492 = new C23492(readerPageFragment, null);
            this.f28552a = 1;
            if (AbstractC3224d.m15529h(kk8VarM15543v, c23492, this) == coroutineSingletons) {
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
