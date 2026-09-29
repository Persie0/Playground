package com.lingq.feature.library;

import com.lingq.core.data.repository.C1290f;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.f23;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.feature.library.LibraryUpdateViewModel$refreshCollectionSubscriptions$1", m4291f = "LibraryUpdateViewModel.kt", m4292l = {810}, m4293m = "invokeSuspend", m4294v = 2)
final class LibraryUpdateViewModel$refreshCollectionSubscriptions$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f26569a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2146e f26570b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f26571c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUpdateViewModel$refreshCollectionSubscriptions$1(C2146e c2146e, String str, Continuation continuation) {
        super(1, continuation);
        this.f26570b = c2146e;
        this.f26571c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LibraryUpdateViewModel$refreshCollectionSubscriptions$1(this.f26570b, this.f26571c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((LibraryUpdateViewModel$refreshCollectionSubscriptions$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26569a;
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
        f23 f23Var = this.f26570b.f26691p;
        this.f26569a = 1;
        Object objM7178b = ((C1290f) f23Var.f38305a).m7178b(this.f26571c, this);
        if (objM7178b != coroutineSingletons) {
            objM7178b = xfaVar;
        }
        return objM7178b == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
