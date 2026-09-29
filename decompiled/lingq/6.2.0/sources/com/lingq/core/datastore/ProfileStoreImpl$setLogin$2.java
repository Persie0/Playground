package com.lingq.core.datastore;

import androidx.datastore.preferences.core.MutablePreferences;
import com.lingq.core.domain.model.user.Login;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.datastore.ProfileStoreImpl$setLogin$2", m4291f = "ProfileStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ProfileStoreImpl$setLogin$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17950a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1369b f17951b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Login f17952c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileStoreImpl$setLogin$2(C1369b c1369b, Login login, Continuation continuation) {
        super(2, continuation);
        this.f17951b = c1369b;
        this.f17952c = login;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ProfileStoreImpl$setLogin$2 profileStoreImpl$setLogin$2 = new ProfileStoreImpl$setLogin$2(this.f17951b, this.f17952c, continuation);
        profileStoreImpl$setLogin$2.f17950a = obj;
        return profileStoreImpl$setLogin$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ProfileStoreImpl$setLogin$2 profileStoreImpl$setLogin$2 = (ProfileStoreImpl$setLogin$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        profileStoreImpl$setLogin$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f17950a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C1369b c1369b = this.f17951b;
        mutablePreferences.set(c1369b.f18473f, c1369b.f18468a.m10322b(Login.Companion.serializer(), this.f17952c));
        return xfa.f68157a;
    }
}
