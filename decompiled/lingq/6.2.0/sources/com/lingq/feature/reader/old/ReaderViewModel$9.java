package com.lingq.feature.reader.old;

import android.os.Bundle;
import com.lingq.core.analytics.C1240a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.hm5;
import p000.un1;
import p000.ux5;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$9", m4291f = "ReaderViewModel.kt", m4292l = {2943}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$9 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28893a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f28894b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderViewModel$9$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$9$1", m4291f = "ReaderViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23931 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ boolean f28895a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2412n f28896b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23931(C2412n c2412n, Continuation continuation) {
            super(2, continuation);
            this.f28896b = c2412n;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23931 c23931 = new C23931(this.f28896b, continuation);
            c23931.f28895a = ((Boolean) obj).booleanValue();
            return c23931;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            C23931 c23931 = (C23931) create(bool, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23931.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z = this.f28895a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2412n c2412n = this.f28896b;
            ux5.m22977D(z, c2412n.f29265C.f27983d, null);
            if (z) {
                hm5 hm5Var = c2412n.f29292L;
                Bundle bundle = new Bundle();
                bundle.putString("Lesson ID", String.valueOf(c2412n.m9332l3()));
                ((C1240a) hm5Var).m7025f("Sentence mode opened", bundle);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$9(C2412n c2412n, Continuation continuation) {
        super(2, continuation);
        this.f28894b = c2412n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$9(this.f28894b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$9) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28893a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2412n c2412n = this.f28894b;
            C3244l c3244l = c2412n.f29313S;
            C23931 c23931 = new C23931(c2412n, null);
            c3244l.getClass();
            this.f28893a = 1;
            if (AbstractC3224d.m15529h(c3244l, c23931, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3386nv.m17633t("SharedFlow never completes, this call should never return.");
        return null;
    }
}
