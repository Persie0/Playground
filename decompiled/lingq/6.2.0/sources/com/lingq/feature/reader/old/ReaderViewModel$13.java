package com.lingq.feature.reader.old;

import com.lingq.core.domain.model.lesson.Lesson;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bj3;
import p000.c32;
import p000.e83;
import p000.kk8;
import p000.un1;
import p000.ux5;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$13", m4291f = "ReaderViewModel.kt", m4292l = {949}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$13 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28811a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f28812b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderViewModel$13$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$13$1", m4291f = "ReaderViewModel.kt", m4292l = {948}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23751 extends SuspendLambda implements bj3 {

        /* JADX INFO: renamed from: a */
        public int f28813a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ e83 f28814b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ int f28815c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Lesson f28816d;

        @Override // p000.bj3
        /* JADX INFO: renamed from: e */
        public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
            int iIntValue = ((Number) obj2).intValue();
            C23751 c23751 = new C23751(4, (Continuation) obj4);
            c23751.f28814b = (e83) obj;
            c23751.f28815c = iIntValue;
            c23751.f28816d = (Lesson) obj3;
            return c23751.invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x002a  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z;
            e83 e83Var = this.f28814b;
            int i = this.f28815c;
            Lesson lesson = this.f28816d;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.f28813a;
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                if (i > 0) {
                    z = true;
                } else {
                    if ((lesson != null ? lesson.f19147f : null) != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                this.f28814b = null;
                this.f28816d = null;
                this.f28815c = i;
                this.f28813a = 1;
                if (e83Var.emit(boolValueOf, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderViewModel$13$2 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$13$2", m4291f = "ReaderViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23762 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ boolean f28817a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2412n f28818b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23762(C2412n c2412n, Continuation continuation) {
            super(2, continuation);
            this.f28818b = c2412n;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23762 c23762 = new C23762(this.f28818b, continuation);
            c23762.f28817a = ((Boolean) obj).booleanValue();
            return c23762;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            C23762 c23762 = (C23762) create(bool, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23762.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z = this.f28817a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ux5.m22977D(z, this.f28818b.f29324V1, null);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$13(C2412n c2412n, Continuation continuation) {
        super(2, continuation);
        this.f28812b = c2412n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$13(this.f28812b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$13) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28811a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2412n c2412n = this.f28812b;
            kk8 kk8VarM15534m = AbstractC3224d.m15534m(c2412n.f29409u.m7396k(c2412n.f29340b.mo4589b2()), c2412n.f29381l0, new C23751(4, null));
            C23762 c23762 = new C23762(c2412n, null);
            this.f28811a = 1;
            if (AbstractC3224d.m15529h(kk8VarM15534m, c23762, this) == coroutineSingletons) {
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
