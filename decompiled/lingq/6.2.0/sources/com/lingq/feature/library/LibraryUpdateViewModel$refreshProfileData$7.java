package com.lingq.feature.library;

import com.lingq.core.data.repository.C1289e;
import com.lingq.core.domain.model.language.Language;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.m58;
import p000.un1;
import p000.xfa;
import p000.zi3;
import p000.zw0;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.feature.library.LibraryUpdateViewModel$refreshProfileData$7", m4291f = "LibraryUpdateViewModel.kt", m4292l = {372}, m4293m = "invokeSuspend", m4294v = 2)
final class LibraryUpdateViewModel$refreshProfileData$7 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26585a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2146e f26586b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Language f26587c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUpdateViewModel$refreshProfileData$7(C2146e c2146e, Language language, Continuation continuation) {
        super(2, continuation);
        this.f26586b = c2146e;
        this.f26587c = language;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LibraryUpdateViewModel$refreshProfileData$7(this.f26586b, this.f26587c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LibraryUpdateViewModel$refreshProfileData$7) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26585a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            m58 m58Var = this.f26586b.f26653B;
            String str = this.f26587c.f19024a;
            this.f26585a = 1;
            Object objM7158h = ((C1289e) ((zw0) m58Var.f50618b)).m7158h(str, null, this);
            if (objM7158h != coroutineSingletons) {
                objM7158h = xfaVar;
            }
            if (objM7158h == coroutineSingletons) {
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
