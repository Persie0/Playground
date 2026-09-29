package com.lingq.feature.library;

import com.lingq.core.data.repository.C1299o;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.m58;
import p000.mm6;
import p000.un1;
import p000.vz1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.library.LibraryUpdateViewModel$hideNotice$1", m4291f = "LibraryUpdateViewModel.kt", m4292l = {1349}, m4293m = "invokeSuspend", m4294v = 2)
final class LibraryUpdateViewModel$hideNotice$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26488a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2146e f26489b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f26490c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUpdateViewModel$hideNotice$1(C2146e c2146e, int i, Continuation continuation) {
        super(2, continuation);
        this.f26489b = c2146e;
        this.f26490c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LibraryUpdateViewModel$hideNotice$1(this.f26489b, this.f26490c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LibraryUpdateViewModel$hideNotice$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26488a;
        xfa xfaVar = xfa.f68157a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        C2146e c2146e = this.f26489b;
        m58 m58Var = c2146e.f26698w;
        String strMo4589b2 = c2146e.f26677b.mo4589b2();
        this.f26488a = 1;
        Object objM7333b = ((C1299o) ((mm6) m58Var.f50618b)).m7333b(strMo4589b2, vz1.m23604J(new Integer(this.f26490c)), this);
        if (objM7333b != coroutineSingletons) {
            objM7333b = xfaVar;
        }
        return objM7333b == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
