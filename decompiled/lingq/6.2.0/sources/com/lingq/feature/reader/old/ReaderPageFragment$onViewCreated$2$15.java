package com.lingq.feature.reader.old;

import java.util.Arrays;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bj3;
import p000.c32;
import p000.e83;
import p000.jfa;
import p000.kk8;
import p000.un1;
import p000.vk9;
import p000.vx7;
import p000.xfa;
import p000.zi3;
import p000.zx7;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$15", m4291f = "ReaderPageFragment.kt", m4292l = {608}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageFragment$onViewCreated$2$15 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28496a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderPageFragment f28497b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$15$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$15$1", m4291f = "ReaderPageFragment.kt", m4292l = {607}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23341 extends SuspendLambda implements bj3 {

        /* JADX INFO: renamed from: a */
        public int f28498a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ e83 f28499b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ String f28500c;

        @Override // p000.bj3
        /* JADX INFO: renamed from: e */
        public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
            C23341 c23341 = new C23341(4, (Continuation) obj4);
            c23341.f28499b = (e83) obj;
            c23341.f28500c = (String) obj3;
            return c23341.invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            e83 e83Var = this.f28499b;
            String str = this.f28500c;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f28498a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                this.f28499b = null;
                this.f28500c = null;
                this.f28498a = 1;
                if (e83Var.emit(str, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$15$2 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$15$2", m4291f = "ReaderPageFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23352 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28501a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderPageFragment f28502b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23352(ReaderPageFragment readerPageFragment, Continuation continuation) {
            super(2, continuation);
            this.f28502b = readerPageFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23352 c23352 = new C23352(this.f28502b, continuation);
            c23352.f28501a = obj;
            return c23352;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23352 c23352 = (C23352) create((String) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23352.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str = (String) this.f28501a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            vx7 vx7Var = ReaderPageFragment.Companion;
            ReaderPageFragment readerPageFragment = this.f28502b;
            C2412n c2412nM9298W0 = readerPageFragment.m9298W0();
            str.getClass();
            int iIndexOf = ((List) c2412nM9298W0.f29308Q0.getValue()).indexOf(str) + 1;
            if (vk9.m23391n0(str) || iIndexOf <= 0) {
                jfa.m14425h(readerPageFragment.m9297V0().f69712c);
                jfa.m14425h(readerPageFragment.m9297V0().f69721l);
            } else {
                readerPageFragment.m9297V0().f69721l.setText(str);
                jfa.m14429l(readerPageFragment.m9297V0().f69712c);
                readerPageFragment.m9297V0().f69712c.setText(String.format("%d", Arrays.copyOf(new Object[]{new Integer(iIndexOf)}, 1)));
                readerPageFragment.m9297V0().f69712c.setOnClickListener(new zx7(readerPageFragment, 0));
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageFragment$onViewCreated$2$15(ReaderPageFragment readerPageFragment, Continuation continuation) {
        super(2, continuation);
        this.f28497b = readerPageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderPageFragment$onViewCreated$2$15(this.f28497b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderPageFragment$onViewCreated$2$15) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28496a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            vx7 vx7Var = ReaderPageFragment.Companion;
            ReaderPageFragment readerPageFragment = this.f28497b;
            kk8 kk8VarM15543v = AbstractC3224d.m15543v(readerPageFragment.m9298W0().f29311R0, readerPageFragment.m9299X0().f29230e0, new C23341(4, null));
            C23352 c23352 = new C23352(readerPageFragment, null);
            this.f28496a = 1;
            if (AbstractC3224d.m15529h(kk8VarM15543v, c23352, this) == coroutineSingletons) {
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
