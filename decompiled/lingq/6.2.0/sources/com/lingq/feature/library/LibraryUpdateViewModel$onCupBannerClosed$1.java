package com.lingq.feature.library;

import com.lingq.core.datastore.C1371d;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.e85;
import p000.m58;
import p000.un1;
import p000.vma;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.library.LibraryUpdateViewModel$onCupBannerClosed$1", m4291f = "LibraryUpdateViewModel.kt", m4292l = {945}, m4293m = "invokeSuspend", m4294v = 2)
final class LibraryUpdateViewModel$onCupBannerClosed$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26526a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2146e f26527b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ e85 f26528c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUpdateViewModel$onCupBannerClosed$1(C2146e c2146e, e85 e85Var, Continuation continuation) {
        super(2, continuation);
        this.f26527b = c2146e;
        this.f26528c = e85Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LibraryUpdateViewModel$onCupBannerClosed$1(this.f26527b, this.f26528c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LibraryUpdateViewModel$onCupBannerClosed$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26526a;
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
        m58 m58Var = this.f26527b.f26700y;
        String str = this.f26528c.f36838a.f67232h;
        if (str == null) {
            str = "";
        }
        this.f26526a = 1;
        Object objM7963c = ((C1371d) ((vma) m58Var.f50618b)).m7963c(str, this);
        if (objM7963c != coroutineSingletons) {
            objM7963c = xfaVar;
        }
        return objM7963c == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
