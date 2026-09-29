package com.lingq.feature.reader.old;

import com.lingq.core.datastore.C1368a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.un1;
import p000.ux5;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$15", m4291f = "ReaderViewModel.kt", m4292l = {961}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$15 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28823a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f28824b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderViewModel$15$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$15$1", m4291f = "ReaderViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23781 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ boolean f28825a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2412n f28826b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23781(C2412n c2412n, Continuation continuation) {
            super(2, continuation);
            this.f28826b = c2412n;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23781 c23781 = new C23781(this.f28826b, continuation);
            c23781.f28825a = ((Boolean) obj).booleanValue();
            return c23781;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            C23781 c23781 = (C23781) create(bool, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23781.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z = this.f28825a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ux5.m22977D(z, this.f28826b.f29339a2, null);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$15(C2412n c2412n, Continuation continuation) {
        super(2, continuation);
        this.f28824b = c2412n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$15(this.f28824b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$15) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28823a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2412n c2412n = this.f28824b;
            c83 c83VarM15536o = AbstractC3224d.m15536o(((C1368a) c2412n.f29271E).f18410g1);
            C23781 c23781 = new C23781(c2412n, null);
            this.f28823a = 1;
            if (AbstractC3224d.m15529h(c83VarM15536o, c23781, this) == coroutineSingletons) {
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
