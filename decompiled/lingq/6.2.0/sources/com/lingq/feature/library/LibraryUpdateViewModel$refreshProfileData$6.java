package com.lingq.feature.library;

import com.lingq.core.data.repository.C1299o;
import com.lingq.core.domain.model.language.Language;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.mm6;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.feature.library.LibraryUpdateViewModel$refreshProfileData$6", m4291f = "LibraryUpdateViewModel.kt", m4292l = {369}, m4293m = "invokeSuspend", m4294v = 2)
final class LibraryUpdateViewModel$refreshProfileData$6 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26582a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2146e f26583b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Language f26584c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUpdateViewModel$refreshProfileData$6(C2146e c2146e, Language language, Continuation continuation) {
        super(2, continuation);
        this.f26583b = c2146e;
        this.f26584c = language;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LibraryUpdateViewModel$refreshProfileData$6(this.f26583b, this.f26584c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LibraryUpdateViewModel$refreshProfileData$6) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26582a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            String str = this.f26584c.f19024a;
            this.f26582a = 1;
            Object objM7332a = ((C1299o) ((mm6) this.f26583b.f26687l.f50064b)).m7332a(str, this);
            if (objM7332a != CoroutineSingletons.COROUTINE_SUSPENDED) {
                objM7332a = xfaVar;
            }
            if (objM7332a == coroutineSingletons) {
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
