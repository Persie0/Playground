package com.google.firebase.crashlytics.internal.settings;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.concurrency.C1149a;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import p000.AbstractC3584sr;
import p000.C0842cc;
import p000.fs6;
import p000.i09;
import p000.nj0;
import p000.or3;
import p000.qn3;
import p000.s29;
import p000.tld;
import p000.tz1;
import p000.ux5;
import p000.wr9;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.settings.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1150a {

    /* JADX INFO: renamed from: a */
    public final Context f13671a;

    /* JADX INFO: renamed from: b */
    public final s29 f13672b;

    /* JADX INFO: renamed from: c */
    public final or3 f13673c;

    /* JADX INFO: renamed from: d */
    public final nj0 f13674d;

    /* JADX INFO: renamed from: e */
    public final qn3 f13675e;

    /* JADX INFO: renamed from: f */
    public final C0842cc f13676f;

    /* JADX INFO: renamed from: g */
    public final tz1 f13677g;

    /* JADX INFO: renamed from: h */
    public final AtomicReference f13678h;

    /* JADX INFO: renamed from: i */
    public final AtomicReference f13679i;

    public C1150a(Context context, s29 s29Var, nj0 nj0Var, or3 or3Var, qn3 qn3Var, C0842cc c0842cc, tz1 tz1Var) {
        AtomicReference atomicReference = new AtomicReference();
        this.f13678h = atomicReference;
        this.f13679i = new AtomicReference(new wr9());
        this.f13671a = context;
        this.f13672b = s29Var;
        this.f13674d = nj0Var;
        this.f13673c = or3Var;
        this.f13675e = qn3Var;
        this.f13676f = c0842cc;
        this.f13677g = tz1Var;
        atomicReference.set(nj0.m17450l(nj0Var));
    }

    /* JADX INFO: renamed from: d */
    public static void m6682d(String str, JSONObject jSONObject) {
        StringBuilder sbM22997t = ux5.m22997t(str);
        sbM22997t.append(jSONObject.toString());
        String string = sbM22997t.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", string, null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final i09 m6683a(SettingsCacheBehavior settingsCacheBehavior) throws Throwable {
        i09 i09Var = null;
        try {
            if (!SettingsCacheBehavior.SKIP_CACHE_LOOKUP.equals(settingsCacheBehavior)) {
                JSONObject jSONObjectM20050D = this.f13675e.m20050D();
                if (jSONObjectM20050D != null) {
                    i09 i09VarM18298K = this.f13673c.m18298K(jSONObjectM20050D);
                    m6682d("Loaded cached settings: ", jSONObjectM20050D);
                    this.f13674d.getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION.equals(settingsCacheBehavior) || i09VarM18298K.f43296c >= jCurrentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return i09VarM18298K;
                        } catch (Exception e) {
                            e = e;
                            i09Var = i09VarM18298K;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return i09Var;
                        }
                    }
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                        return null;
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
            return null;
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final i09 m6684b() {
        return (i09) this.f13678h.get();
    }

    /* JADX INFO: renamed from: c */
    public final Task m6685c(C1149a c1149a) throws Throwable {
        tld tldVar;
        i09 i09VarM6683a;
        SettingsCacheBehavior settingsCacheBehavior = SettingsCacheBehavior.USE_CACHE;
        AtomicReference atomicReference = this.f13679i;
        AtomicReference atomicReference2 = this.f13678h;
        if (this.f13671a.getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(this.f13672b.f60215f) && (i09VarM6683a = m6683a(settingsCacheBehavior)) != null) {
            atomicReference2.set(i09VarM6683a);
            ((wr9) atomicReference.get()).m24140d(i09VarM6683a);
            return Tasks.m5975c(null);
        }
        i09 i09VarM6683a2 = m6683a(SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION);
        if (i09VarM6683a2 != null) {
            atomicReference2.set(i09VarM6683a2);
            ((wr9) atomicReference.get()).m24140d(i09VarM6683a2);
        }
        tz1 tz1Var = this.f13677g;
        tld tldVar2 = ((wr9) tz1Var.f63126e).f67208a;
        synchronized (tz1Var.f63124c) {
            tldVar = ((wr9) tz1Var.f63125d).f67208a;
        }
        return AbstractC3584sr.m21619c0(tldVar2, tldVar).mo5972n(c1149a.f13668a, new fs6(this, c1149a));
    }
}
