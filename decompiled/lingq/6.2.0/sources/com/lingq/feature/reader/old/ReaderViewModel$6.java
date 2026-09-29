package com.lingq.feature.reader.old;

import com.lingq.core.datastore.C1368a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.C3540rl;
import p000.c32;
import p000.c83;
import p000.si7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$6", m4291f = "ReaderViewModel.kt", m4292l = {811}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$6 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28881a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f28882b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderViewModel$6$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$6$1", m4291f = "ReaderViewModel.kt", m4292l = {812}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23901 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f28883a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ int f28884b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C2412n f28885c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23901(C2412n c2412n, Continuation continuation) {
            super(2, continuation);
            this.f28885c = c2412n;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23901 c23901 = new C23901(this.f28885c, continuation);
            c23901.f28884b = ((Number) obj).intValue();
            return c23901;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C23901) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.f28884b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.f28883a;
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                si7 si7Var = this.f28885c.f29271E;
                this.f28884b = i;
                this.f28883a = 1;
                if (((C1368a) si7Var).m7855N(i, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$6(C2412n c2412n, Continuation continuation) {
        super(2, continuation);
        this.f28882b = c2412n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$6(this.f28882b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$6) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28881a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2412n c2412n = this.f28882b;
            c83 c83VarM15535n = AbstractC3224d.m15535n(new C3540rl(c2412n.f29275F0, 5), 200L);
            C23901 c23901 = new C23901(c2412n, null);
            this.f28881a = 1;
            if (AbstractC3224d.m15529h(c83VarM15535n, c23901, this) == coroutineSingletons) {
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
