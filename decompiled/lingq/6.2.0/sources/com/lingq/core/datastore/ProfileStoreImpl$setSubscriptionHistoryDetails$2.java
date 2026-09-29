package com.lingq.core.datastore;

import androidx.datastore.preferences.core.MutablePreferences;
import com.lingq.core.domain.model.user.SubscriptionDetails;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C2978ev;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.datastore.ProfileStoreImpl$setSubscriptionHistoryDetails$2", m4291f = "ProfileStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ProfileStoreImpl$setSubscriptionHistoryDetails$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17968a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1369b f17969b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileStoreImpl$setSubscriptionHistoryDetails$2(C1369b c1369b, Continuation continuation) {
        super(2, continuation);
        this.f17969b = c1369b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ProfileStoreImpl$setSubscriptionHistoryDetails$2 profileStoreImpl$setSubscriptionHistoryDetails$2 = new ProfileStoreImpl$setSubscriptionHistoryDetails$2(this.f17969b, continuation);
        profileStoreImpl$setSubscriptionHistoryDetails$2.f17968a = obj;
        return profileStoreImpl$setSubscriptionHistoryDetails$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ProfileStoreImpl$setSubscriptionHistoryDetails$2 profileStoreImpl$setSubscriptionHistoryDetails$2 = (ProfileStoreImpl$setSubscriptionHistoryDetails$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        profileStoreImpl$setSubscriptionHistoryDetails$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f17968a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C1369b c1369b = this.f17969b;
        mutablePreferences.set(c1369b.f18475h, c1369b.f18468a.m10322b(new C2978ev(SubscriptionDetails.Companion.serializer()), EmptyList.f47638a));
        return xfa.f68157a;
    }
}
