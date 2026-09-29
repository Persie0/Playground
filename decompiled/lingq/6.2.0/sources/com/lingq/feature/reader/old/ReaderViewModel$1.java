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
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$1", m4291f = "ReaderViewModel.kt", m4292l = {772}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28787a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f28788b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderViewModel$1$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$1$1", m4291f = "ReaderViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23701 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ boolean f28789a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2412n f28790b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23701(C2412n c2412n, Continuation continuation) {
            super(2, continuation);
            this.f28790b = c2412n;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23701 c23701 = new C23701(this.f28790b, continuation);
            c23701.f28789a = ((Boolean) obj).booleanValue();
            return c23701;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            C23701 c23701 = (C23701) create(bool, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23701.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z = this.f28789a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ux5.m22977D(z, this.f28790b.f29357f0, null);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$1(C2412n c2412n, Continuation continuation) {
        super(2, continuation);
        this.f28788b = c2412n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$1(this.f28788b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28787a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2412n c2412n = this.f28788b;
            c83 c83VarM15536o = AbstractC3224d.m15536o(((C1368a) c2412n.f29271E).f18413h1);
            C23701 c23701 = new C23701(c2412n, null);
            this.f28787a = 1;
            if (AbstractC3224d.m15529h(c83VarM15536o, c23701, this) == coroutineSingletons) {
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
