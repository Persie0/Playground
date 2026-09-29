package com.lingq.feature.library;

import com.lingq.core.analytics.C1240a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.fb4;
import p000.hm5;
import p000.qb4;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.feature.library.LibraryUpdateViewModel$refreshProfileData$1", m4291f = "LibraryUpdateViewModel.kt", m4292l = {364}, m4293m = "invokeSuspend", m4294v = 2)
final class LibraryUpdateViewModel$refreshProfileData$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26572a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2146e f26573b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUpdateViewModel$refreshProfileData$1(C2146e c2146e, Continuation continuation) {
        super(2, continuation);
        this.f26573b = c2146e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LibraryUpdateViewModel$refreshProfileData$1(this.f26573b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LibraryUpdateViewModel$refreshProfileData$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        xfa xfaVar = xfa.f68157a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26572a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2146e c2146e = this.f26573b;
            this.f26572a = 1;
            ((C1240a) ((hm5) c2146e.f26685j.f66365a)).getClass();
            qb4 qb4VarM11694e = fb4.f38769t.m11694e();
            qb4VarM11694e.getClass();
            qb4.m19846c(qb4VarM11694e);
            if (xfaVar == coroutineSingletons) {
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
