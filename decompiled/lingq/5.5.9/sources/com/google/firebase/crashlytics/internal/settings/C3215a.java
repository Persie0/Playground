package com.google.firebase.crashlytics.internal.settings;

import android.content.Context;
import android.support.v4.media.session.C0166e;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import p115fb.C5502r;
import p136gc.AbstractC5751g;
import p136gc.C5752h;
import p136gc.C5761q;
import p241le.C7323a0;
import p241le.C7337h0;
import p241le.C7341l;
import p387t0.C9166r;
import p402u0.C9370m;
import se.C8991a;
import se.C8992b;
import se.C8993c;
import se.C8994d;
import se.C8997g;
import se.InterfaceC8996f;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.settings.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3215a implements InterfaceC8996f {

    /* JADX INFO: renamed from: a */
    public final Context f16226a;

    /* JADX INFO: renamed from: b */
    public final C8997g f16227b;

    /* JADX INFO: renamed from: c */
    public final C8994d f16228c;

    /* JADX INFO: renamed from: d */
    public final C7341l f16229d;

    /* JADX INFO: renamed from: e */
    public final C9166r f16230e;

    /* JADX INFO: renamed from: f */
    public final C5502r f16231f;

    /* JADX INFO: renamed from: g */
    public final C7323a0 f16232g;

    /* JADX INFO: renamed from: h */
    public final AtomicReference<C8992b> f16233h;

    /* JADX INFO: renamed from: i */
    public final AtomicReference<C5752h<C8992b>> f16234i;

    public C3215a(Context context, C8997g c8997g, C7341l c7341l, C8994d c8994d, C9166r c9166r, C5502r c5502r, C7323a0 c7323a0) {
        AtomicReference<C8992b> atomicReference = new AtomicReference<>();
        this.f16233h = atomicReference;
        this.f16234i = new AtomicReference<>(new C5752h());
        this.f16226a = context;
        this.f16227b = c8997g;
        this.f16229d = c7341l;
        this.f16228c = c8994d;
        this.f16230e = c9166r;
        this.f16231f = c5502r;
        this.f16232g = c7323a0;
        atomicReference.set(C8991a.m17233b(c7341l));
    }

    /* JADX INFO: renamed from: d */
    public static void m9169d(String str, JSONObject jSONObject) throws JSONException {
        StringBuilder sbM771r = C0166e.m771r(str);
        sbM771r.append(jSONObject.toString());
        String string = sbM771r.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", string, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0069 A[Catch: Exception -> 0x006f, TRY_LEAVE, TryCatch #0 {Exception -> 0x006f, blocks: (B:21:0x005e, B:23:0x0069), top: B:36:0x005e }] */
    /* JADX INFO: renamed from: a */
    public final C8992b m9170a(SettingsCacheBehavior settingsCacheBehavior) throws Throwable {
        C8992b c8992b = null;
        try {
            if (!SettingsCacheBehavior.SKIP_CACHE_LOOKUP.equals(settingsCacheBehavior)) {
                JSONObject jSONObjectM17491v = this.f16230e.m17491v();
                if (jSONObjectM17491v != null) {
                    C8992b c8992bM17235a = this.f16228c.m17235a(jSONObjectM17491v);
                    if (c8992bM17235a != null) {
                        m9169d("Loaded cached settings: ", jSONObjectM17491v);
                        this.f16229d.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION.equals(settingsCacheBehavior)) {
                            try {
                                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                    Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                                }
                                c8992b = c8992bM17235a;
                            } catch (Exception e10) {
                                e = e10;
                                c8992b = c8992bM17235a;
                                Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            }
                        } else {
                            if (!(c8992bM17235a.f47177c < jCurrentTimeMillis)) {
                                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                    Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                                }
                                c8992b = c8992bM17235a;
                            } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                            }
                        }
                    } else {
                        Log.e("FirebaseCrashlytics", "Failed to parse cached settings data.", null);
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
        } catch (Exception e11) {
            e = e11;
        }
        return c8992b;
    }

    /* JADX INFO: renamed from: b */
    public final C8992b m9171b() {
        return this.f16233h.get();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public final C5761q m9172c(ExecutorService executorService) throws Throwable {
        C5761q c5761q;
        AbstractC5751g abstractC5751gMo12112n;
        C8992b c8992bM9170a;
        SettingsCacheBehavior settingsCacheBehavior = SettingsCacheBehavior.USE_CACHE;
        boolean z10 = !this.f16226a.getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(this.f16227b.f47192f);
        AtomicReference<C5752h<C8992b>> atomicReference = this.f16234i;
        AtomicReference<C8992b> atomicReference2 = this.f16233h;
        if (z10 || (c8992bM9170a = m9170a(settingsCacheBehavior)) == null) {
            C8992b c8992bM9170a2 = m9170a(SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION);
            if (c8992bM9170a2 != null) {
                atomicReference2.set(c8992bM9170a2);
                atomicReference.get().m12116d(c8992bM9170a2);
            }
            C7323a0 c7323a0 = this.f16232g;
            C5761q c5761q2 = c7323a0.f41026f.f34812a;
            synchronized (c7323a0.f41022b) {
                c5761q = c7323a0.f41023c.f34812a;
            }
            ExecutorService executorService2 = C7337h0.f41062a;
            C5752h c5752h = new C5752h();
            C9370m c9370m = new C9370m(9, c5752h);
            c5761q2.mo12104f(executorService, c9370m);
            c5761q.mo12104f(executorService, c9370m);
            abstractC5751gMo12112n = c5752h.f34812a.mo12112n(executorService, new C8993c(this));
        } else {
            atomicReference2.set(c8992bM9170a);
            atomicReference.get().m12116d(c8992bM9170a);
            abstractC5751gMo12112n = Tasks.m8539c(null);
        }
        return (C5761q) abstractC5751gMo12112n;
    }
}
