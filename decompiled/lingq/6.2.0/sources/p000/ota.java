package p000;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.LoggingBehavior;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ota {

    /* JADX INFO: renamed from: e */
    public static final String f54979e;

    /* JADX INFO: renamed from: b */
    public final WeakReference f54981b;

    /* JADX INFO: renamed from: c */
    public Timer f54982c;

    /* JADX INFO: renamed from: d */
    public String f54983d = null;

    /* JADX INFO: renamed from: a */
    public final Handler f54980a = new Handler(Looper.getMainLooper());

    static {
        String canonicalName = ota.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        f54979e = canonicalName;
    }

    public ota(Activity activity) {
        this.f54981b = new WeakReference(activity);
    }

    /* JADX INFO: renamed from: a */
    public static final String m18508a() {
        if (lp1.f49971a.contains(ota.class)) {
            return null;
        }
        try {
            return f54979e;
        } catch (Throwable th) {
            lp1.m16420a(ota.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m18509b(mp3 mp3Var, String str) {
        String str2 = f54979e;
        Set set = lp1.f49971a;
        if (set.contains(this) || mp3Var == null) {
            return;
        }
        try {
            pp3 pp3VarM16982c = mp3Var.m16982c();
            try {
                JSONObject jSONObject = pp3VarM16982c.f56628b;
                if (jSONObject == null) {
                    Log.e(str2, "Error sending UI component tree to Facebook: " + pp3VarM16982c.f56629c);
                    return;
                }
                if ("true".equals(jSONObject.optString("success"))) {
                    iy5 iy5Var = qj5.f57852d;
                    iy5.m14197m(LoggingBehavior.APP_EVENTS, str2, "Successfully send UI component tree to server");
                    this.f54983d = str;
                }
                if (jSONObject.has("is_app_indexing_enabled")) {
                    boolean z = jSONObject.getBoolean("is_app_indexing_enabled");
                    if (set.contains(t41.class)) {
                        return;
                    }
                    try {
                        t41.f61845g.set(z);
                    } catch (Throwable th) {
                        lp1.m16420a(t41.class, th);
                    }
                }
            } catch (JSONException e) {
                Log.e(str2, "Error decoding server response.", e);
            }
        } catch (Throwable th2) {
            lp1.m16420a(this, th2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m18510c() {
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            try {
                sy2.m21768c().execute(new mv5(16, this, new nta(this)));
            } catch (RejectedExecutionException e) {
                Log.e(f54979e, "Error scheduling indexing job", e);
            }
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m18511d() {
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            if (((Activity) this.f54981b.get()) == null) {
                return;
            }
            try {
                Timer timer = this.f54982c;
                if (timer != null) {
                    timer.cancel();
                }
                this.f54982c = null;
            } catch (Exception e) {
                Log.e(f54979e, "Error unscheduling indexing job", e);
            }
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }
}
