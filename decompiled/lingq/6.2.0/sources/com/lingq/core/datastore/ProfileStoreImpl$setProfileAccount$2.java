package com.lingq.core.datastore;

import androidx.datastore.preferences.core.MutablePreferences;
import com.lingq.core.domain.model.user.ProfileAccount;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.datastore.ProfileStoreImpl$setProfileAccount$2", m4291f = "ProfileStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ProfileStoreImpl$setProfileAccount$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17956a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1369b f17957b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ProfileAccount f17958c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileStoreImpl$setProfileAccount$2(C1369b c1369b, ProfileAccount profileAccount, Continuation continuation) {
        super(2, continuation);
        this.f17957b = c1369b;
        this.f17958c = profileAccount;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ProfileStoreImpl$setProfileAccount$2 profileStoreImpl$setProfileAccount$2 = new ProfileStoreImpl$setProfileAccount$2(this.f17957b, this.f17958c, continuation);
        profileStoreImpl$setProfileAccount$2.f17956a = obj;
        return profileStoreImpl$setProfileAccount$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ProfileStoreImpl$setProfileAccount$2 profileStoreImpl$setProfileAccount$2 = (ProfileStoreImpl$setProfileAccount$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        profileStoreImpl$setProfileAccount$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f17956a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C1369b c1369b = this.f17957b;
        mutablePreferences.set(c1369b.f18471d, c1369b.f18468a.m10322b(ProfileAccount.Companion.serializer(), this.f17958c));
        return xfa.f68157a;
    }
}
