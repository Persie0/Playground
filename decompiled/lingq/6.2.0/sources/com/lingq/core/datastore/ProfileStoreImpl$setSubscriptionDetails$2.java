package com.lingq.core.datastore;

import androidx.datastore.preferences.core.MutablePreferences;
import com.lingq.core.domain.model.user.SubscriptionDetails;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.datastore.ProfileStoreImpl$setSubscriptionDetails$2", m4291f = "ProfileStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ProfileStoreImpl$setSubscriptionDetails$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17965a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1369b f17966b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SubscriptionDetails f17967c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileStoreImpl$setSubscriptionDetails$2(C1369b c1369b, SubscriptionDetails subscriptionDetails, Continuation continuation) {
        super(2, continuation);
        this.f17966b = c1369b;
        this.f17967c = subscriptionDetails;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ProfileStoreImpl$setSubscriptionDetails$2 profileStoreImpl$setSubscriptionDetails$2 = new ProfileStoreImpl$setSubscriptionDetails$2(this.f17966b, this.f17967c, continuation);
        profileStoreImpl$setSubscriptionDetails$2.f17965a = obj;
        return profileStoreImpl$setSubscriptionDetails$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ProfileStoreImpl$setSubscriptionDetails$2 profileStoreImpl$setSubscriptionDetails$2 = (ProfileStoreImpl$setSubscriptionDetails$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        profileStoreImpl$setSubscriptionDetails$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f17965a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C1369b c1369b = this.f17966b;
        mutablePreferences.set(c1369b.f18474g, c1369b.f18468a.m10322b(SubscriptionDetails.Companion.serializer(), this.f17967c));
        return xfa.f68157a;
    }
}
