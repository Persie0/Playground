package com.google.firebase.datastorage;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesFactory;
import com.google.firebase.datastorage.C1153a;
import java.util.Map;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.PropertyReference2Impl;
import p000.bh4;
import p000.vi3;
import p000.wfb;
import p000.y38;

/* JADX INFO: renamed from: com.google.firebase.datastorage.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1153a {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ bh4[] f13697d;

    /* JADX INFO: renamed from: a */
    public final String f13698a;

    /* JADX INFO: renamed from: b */
    public final ThreadLocal f13699b;

    /* JADX INFO: renamed from: c */
    public final DataStore f13700c;

    static {
        PropertyReference2Impl propertyReference2Impl = new PropertyReference2Impl(C1153a.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        y38.f69246a.getClass();
        f13697d = new bh4[]{propertyReference2Impl};
    }

    public C1153a(Context context, String str) {
        context.getClass();
        this.f13698a = str;
        this.f13699b = new ThreadLocal();
        final int i = 0;
        final int i2 = 1;
        this.f13700c = (DataStore) PreferenceDataStoreDelegateKt.preferencesDataStore$default(str, new ReplaceFileCorruptionHandler(new vi3(this) { // from class: zc4

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C1153a f71361b;

            {
                this.f71361b = this;
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                int i3 = i;
                C1153a c1153a = this.f71361b;
                switch (i3) {
                    case 0:
                        CorruptionException corruptionException = (CorruptionException) obj;
                        corruptionException.getClass();
                        Log.w(y38.m24933a(C1153a.class).m25414c(), "CorruptionException in " + c1153a.f13698a + " DataStore running in process " + Process.myPid(), corruptionException);
                        return PreferencesFactory.createEmpty();
                    default:
                        Context context2 = (Context) obj;
                        context2.getClass();
                        return vz1.m23604J(SharedPreferencesMigrationKt.SharedPreferencesMigration$default(context2, c1153a.f13698a, null, 4, null));
                }
            }
        }), new vi3(this) { // from class: zc4

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C1153a f71361b;

            {
                this.f71361b = this;
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                int i3 = i2;
                C1153a c1153a = this.f71361b;
                switch (i3) {
                    case 0:
                        CorruptionException corruptionException = (CorruptionException) obj;
                        corruptionException.getClass();
                        Log.w(y38.m24933a(C1153a.class).m25414c(), "CorruptionException in " + c1153a.f13698a + " DataStore running in process " + Process.myPid(), corruptionException);
                        return PreferencesFactory.createEmpty();
                    default:
                        Context context2 = (Context) obj;
                        context2.getClass();
                        return vz1.m23604J(SharedPreferencesMigrationKt.SharedPreferencesMigration$default(context2, c1153a.f13698a, null, 4, null));
                }
            }
        }, null, 8, null).getValue(context, f13697d[0]);
    }

    /* JADX INFO: renamed from: a */
    public final void m6686a(vi3 vi3Var) {
    }

    /* JADX INFO: renamed from: b */
    public final Map m6687b() {
        return (Map) wfb.m23900B(EmptyCoroutineContext.f47685a, new JavaDataStorage$getAllSync$1(this, null));
    }

    /* JADX INFO: renamed from: c */
    public final Object m6688c(Preferences.Key key) {
        key.getClass();
        return wfb.m23900B(EmptyCoroutineContext.f47685a, new JavaDataStorage$getSync$1(this, key, null));
    }

    /* JADX INFO: renamed from: d */
    public final void m6689d(Preferences.Key key, Long l) {
        key.getClass();
    }
}
