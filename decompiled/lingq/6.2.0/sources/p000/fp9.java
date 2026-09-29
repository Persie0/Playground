package p000;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class fp9 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39430a = 0;

    /* JADX INFO: renamed from: b */
    public final long f39431b;

    /* JADX INFO: renamed from: c */
    public final Object f39432c;

    /* JADX INFO: renamed from: d */
    public final Object f39433d;

    public fp9(FirebaseMessaging firebaseMessaging, long j) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new o76("firebase-iid-executor"));
        this.f39433d = firebaseMessaging;
        this.f39431b = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.f13722b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f39432c = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    /* JADX INFO: renamed from: a */
    public boolean m11986a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.f39433d).f13722b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX INFO: renamed from: b */
    public boolean m11987b() throws IOException {
        try {
            if (((FirebaseMessaging) this.f39433d).m6706a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e) {
            String message = e.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e.getMessage() != null) {
                    throw e;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        switch (this.f39430a) {
            case 0:
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f39432c;
                ny8 ny8VarM17672A = ny8.m17672A();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f39433d;
                if (ny8VarM17672A.m17677D(firebaseMessaging.f13722b)) {
                    wakeLock.acquire();
                }
                try {
                    try {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.f13729i = true;
                        }
                        if (!firebaseMessaging.f13728h.m16249e()) {
                            synchronized (firebaseMessaging) {
                                firebaseMessaging.f13729i = false;
                            }
                            if (!ny8.m17672A().m17677D(firebaseMessaging.f13722b)) {
                                return;
                            }
                        } else if (!ny8.m17672A().m17676C(firebaseMessaging.f13722b) || m11986a()) {
                            if (m11987b()) {
                                synchronized (firebaseMessaging) {
                                    firebaseMessaging.f13729i = false;
                                }
                            } else {
                                firebaseMessaging.m6710g(this.f39431b);
                            }
                            if (!ny8.m17672A().m17677D(firebaseMessaging.f13722b)) {
                                return;
                            }
                        } else {
                            new ep9(this, i).m11312a();
                            if (!ny8.m17672A().m17677D(firebaseMessaging.f13722b)) {
                                return;
                            }
                        }
                    } catch (IOException e) {
                        Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.f13729i = false;
                            if (!ny8.m17672A().m17677D(firebaseMessaging.f13722b)) {
                                return;
                            }
                        }
                    }
                    wakeLock.release();
                    return;
                } catch (Throwable th) {
                    if (ny8.m17672A().m17677D(firebaseMessaging.f13722b)) {
                        wakeLock.release();
                    }
                    throw th;
                }
            default:
                j0d j0dVar = (j0d) this.f39433d;
                j0dVar.m14242M((bzc) this.f39432c, false, this.f39431b);
                j0dVar.f44863e = null;
                v4d v4dVarM15287o = ((kjc) j0dVar.f60774a).m15287o();
                v4dVarM15287o.mo12359D();
                v4dVarM15287o.m13744E();
                v4dVarM15287o.m23117R(new u62(v4dVarM15287o, null));
                return;
        }
    }

    public fp9(j0d j0dVar, bzc bzcVar, long j) {
        this.f39432c = bzcVar;
        this.f39431b = j;
        Objects.requireNonNull(j0dVar);
        this.f39433d = j0dVar;
    }
}
