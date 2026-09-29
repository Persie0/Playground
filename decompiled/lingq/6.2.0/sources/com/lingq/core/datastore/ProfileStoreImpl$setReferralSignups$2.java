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
@c32(m4290c = "com.lingq.core.datastore.ProfileStoreImpl$setReferralSignups$2", m4291f = "ProfileStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ProfileStoreImpl$setReferralSignups$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17962a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1369b f17963b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f17964c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileStoreImpl$setReferralSignups$2(C1369b c1369b, int i, Continuation continuation) {
        super(2, continuation);
        this.f17963b = c1369b;
        this.f17964c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ProfileStoreImpl$setReferralSignups$2 profileStoreImpl$setReferralSignups$2 = new ProfileStoreImpl$setReferralSignups$2(this.f17963b, this.f17964c, continuation);
        profileStoreImpl$setReferralSignups$2.f17962a = obj;
        return profileStoreImpl$setReferralSignups$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ProfileStoreImpl$setReferralSignups$2 profileStoreImpl$setReferralSignups$2 = (ProfileStoreImpl$setReferralSignups$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        profileStoreImpl$setReferralSignups$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f17962a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        mutablePreferences.set(this.f17963b.f18476i, new Integer(this.f17964c));
        return xfa.f68157a;
    }
}
