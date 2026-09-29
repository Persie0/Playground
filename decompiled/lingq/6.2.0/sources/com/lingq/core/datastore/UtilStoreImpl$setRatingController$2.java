package com.lingq.core.datastore;

import androidx.datastore.preferences.core.MutablePreferences;
import com.lingq.core.domain.model.onboarding.RatingController;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.datastore.UtilStoreImpl$setRatingController$2", m4291f = "UtilStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class UtilStoreImpl$setRatingController$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18234a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1371d f18235b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ RatingController f18236c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilStoreImpl$setRatingController$2(C1371d c1371d, RatingController ratingController, Continuation continuation) {
        super(2, continuation);
        this.f18235b = c1371d;
        this.f18236c = ratingController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UtilStoreImpl$setRatingController$2 utilStoreImpl$setRatingController$2 = new UtilStoreImpl$setRatingController$2(this.f18235b, this.f18236c, continuation);
        utilStoreImpl$setRatingController$2.f18234a = obj;
        return utilStoreImpl$setRatingController$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        UtilStoreImpl$setRatingController$2 utilStoreImpl$setRatingController$2 = (UtilStoreImpl$setRatingController$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        utilStoreImpl$setRatingController$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f18234a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C1371d c1371d = this.f18235b;
        mutablePreferences.set(c1371d.f18579p, c1371d.f18564a.m10322b(RatingController.Companion.serializer(), this.f18236c));
        return xfa.f68157a;
    }
}
