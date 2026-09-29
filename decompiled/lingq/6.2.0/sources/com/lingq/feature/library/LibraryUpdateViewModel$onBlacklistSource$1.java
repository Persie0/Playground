package com.lingq.feature.library;

import com.lingq.core.data.repository.C1286b;
import com.lingq.core.domain.model.language.Language;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.cma;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.library.LibraryUpdateViewModel$onBlacklistSource$1", m4291f = "LibraryUpdateViewModel.kt", m4292l = {1132}, m4293m = "invokeSuspend", m4294v = 2)
final class LibraryUpdateViewModel$onBlacklistSource$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26520a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2146e f26521b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f26522c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUpdateViewModel$onBlacklistSource$1(C2146e c2146e, String str, Continuation continuation) {
        super(2, continuation);
        this.f26521b = c2146e;
        this.f26522c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LibraryUpdateViewModel$onBlacklistSource$1(this.f26521b, this.f26522c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LibraryUpdateViewModel$onBlacklistSource$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2146e c2146e = this.f26521b;
        cma cmaVar = c2146e.f26677b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26520a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            String strMo4589b2 = cmaVar.mo4589b2();
            Language language = (Language) cmaVar.mo4572B0().getValue();
            int i2 = language != null ? language.f19025b : 0;
            this.f26520a = 1;
            Object objM7100b = ((C1286b) c2146e.f26684i.f8655a).m7100b(i2, strMo4589b2, this.f26522c, this);
            if (objM7100b != CoroutineSingletons.COROUTINE_SUSPENDED) {
                objM7100b = xfaVar;
            }
            if (objM7100b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfaVar;
    }
}
