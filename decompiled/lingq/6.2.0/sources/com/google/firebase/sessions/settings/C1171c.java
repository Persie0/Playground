package com.google.firebase.sessions.settings;

import android.util.Log;
import androidx.datastore.core.DataStore;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC3193b;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.kn1;
import p000.r0a;
import p000.ry8;
import p000.vz1;
import p000.wfb;
import p000.xfa;

/* JADX INFO: renamed from: com.google.firebase.sessions.settings.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1171c {

    /* JADX INFO: renamed from: a */
    public final r0a f13903a;

    /* JADX INFO: renamed from: b */
    public final DataStore f13904b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference f13905c;

    public C1171c(kn1 kn1Var, r0a r0aVar, DataStore dataStore) {
        kn1Var.getClass();
        r0aVar.getClass();
        dataStore.getClass();
        this.f13903a = r0aVar;
        this.f13904b = dataStore;
        this.f13905c = new AtomicReference();
        wfb.m23926u(vz1.m23619a(kn1Var), null, null, new SettingsCacheImpl$1(this, null), 3);
    }

    /* JADX INFO: renamed from: a */
    public final ry8 m6767a() throws Throwable {
        AtomicReference atomicReference = this.f13905c;
        if (atomicReference.get() == null) {
            Object objM23900B = wfb.m23900B(EmptyCoroutineContext.f47685a, new SettingsCacheImpl$sessionConfigs$1(this, null));
            while (!atomicReference.compareAndSet(null, objM23900B) && atomicReference.get() == null) {
            }
        }
        Object obj = atomicReference.get();
        obj.getClass();
        return (ry8) obj;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m6768b() {
        Long l = m6767a().f60048e;
        Integer num = m6767a().f60047d;
        if (l == null || num == null) {
            return true;
        }
        this.f13903a.getClass();
        return r0a.m20228a().f46521c - l.longValue() >= ((long) num.intValue());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m6769c(ry8 ry8Var, ContinuationImpl continuationImpl) throws Throwable {
        SettingsCacheImpl$updateConfigs$1 settingsCacheImpl$updateConfigs$1;
        if (continuationImpl instanceof SettingsCacheImpl$updateConfigs$1) {
            settingsCacheImpl$updateConfigs$1 = (SettingsCacheImpl$updateConfigs$1) continuationImpl;
            int i = settingsCacheImpl$updateConfigs$1.f13891c;
            if ((i & Integer.MIN_VALUE) != 0) {
                settingsCacheImpl$updateConfigs$1.f13891c = i - Integer.MIN_VALUE;
            } else {
                settingsCacheImpl$updateConfigs$1 = new SettingsCacheImpl$updateConfigs$1(this, continuationImpl);
            }
        } else {
            settingsCacheImpl$updateConfigs$1 = new SettingsCacheImpl$updateConfigs$1(this, continuationImpl);
        }
        Object obj = settingsCacheImpl$updateConfigs$1.f13889a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = settingsCacheImpl$updateConfigs$1.f13891c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                DataStore dataStore = this.f13904b;
                SettingsCacheImpl$updateConfigs$2 settingsCacheImpl$updateConfigs$2 = new SettingsCacheImpl$updateConfigs$2(ry8Var, null);
                settingsCacheImpl$updateConfigs$1.f13891c = 1;
                if (dataStore.updateData(settingsCacheImpl$updateConfigs$2, settingsCacheImpl$updateConfigs$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
        } catch (IOException e) {
            Log.w("FirebaseSessions", "Failed to update config values: " + e);
        }
        return xfa.f68157a;
    }
}
