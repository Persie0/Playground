package com.lingq.core.datastore;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import com.lingq.core.domain.store.Web2WaveDeferredLoginStatus;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.c83;
import p000.nn1;
import p000.s2b;
import p000.u2b;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.core.datastore.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1372e implements s2b {

    /* JADX INFO: renamed from: a */
    public final DataStore f18590a;

    /* JADX INFO: renamed from: b */
    public final Preferences.Key f18591b = PreferencesKeys.stringKey("web2wave_user_id");

    /* JADX INFO: renamed from: c */
    public final Preferences.Key f18592c = PreferencesKeys.stringKey("web2wave_email");

    /* JADX INFO: renamed from: d */
    public final Preferences.Key f18593d = PreferencesKeys.booleanKey("web2wave_has_active_subscription");

    /* JADX INFO: renamed from: e */
    public final Preferences.Key f18594e = PreferencesKeys.stringKey("web2wave_deferred_login_status");

    /* JADX INFO: renamed from: f */
    public final c83 f18595f;

    /* JADX INFO: renamed from: g */
    public final c83 f18596g;

    /* JADX INFO: renamed from: h */
    public final c83 f18597h;

    public C1372e(DataStore dataStore, nn1 nn1Var) {
        this.f18590a = dataStore;
        this.f18595f = AbstractC3224d.m15544w(new u2b(dataStore.getData(), this, 0), nn1Var);
        this.f18596g = AbstractC3224d.m15544w(new u2b(dataStore.getData(), this, 1), nn1Var);
        AbstractC3224d.m15544w(new u2b(dataStore.getData(), this, 2), nn1Var);
        this.f18597h = AbstractC3224d.m15544w(new u2b(dataStore.getData(), this, 3), nn1Var);
    }

    /* JADX INFO: renamed from: a */
    public final Object m7975a(String str, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f18590a, new Web2WaveStoreImpl$setDeferredLoginIdentity$2(this, str, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: b */
    public final Object m7976b(Web2WaveDeferredLoginStatus web2WaveDeferredLoginStatus, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f18590a, new Web2WaveStoreImpl$setDeferredLoginStatus$2(this, web2WaveDeferredLoginStatus, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: c */
    public final Object m7977c(boolean z, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f18590a, new Web2WaveStoreImpl$setHasActiveSubscription$2(this, z, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: d */
    public final Object m7978d(String str, String str2, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f18590a, new Web2WaveStoreImpl$setIdentity$2(this, str, str2, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }
}
