package com.lingq.core.datastore;

import androidx.datastore.preferences.core.MutablePreferences;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.datastore.UtilStoreImpl$setDismissedCupBanner$2", m4291f = "UtilStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class UtilStoreImpl$setDismissedCupBanner$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18219a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1371d f18220b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f18221c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilStoreImpl$setDismissedCupBanner$2(C1371d c1371d, String str, Continuation continuation) {
        super(2, continuation);
        this.f18220b = c1371d;
        this.f18221c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UtilStoreImpl$setDismissedCupBanner$2 utilStoreImpl$setDismissedCupBanner$2 = new UtilStoreImpl$setDismissedCupBanner$2(this.f18220b, this.f18221c, continuation);
        utilStoreImpl$setDismissedCupBanner$2.f18219a = obj;
        return utilStoreImpl$setDismissedCupBanner$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        UtilStoreImpl$setDismissedCupBanner$2 utilStoreImpl$setDismissedCupBanner$2 = (UtilStoreImpl$setDismissedCupBanner$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        utilStoreImpl$setDismissedCupBanner$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f18219a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        mutablePreferences.set(this.f18220b.f18572i, this.f18221c);
        return xfa.f68157a;
    }
}
