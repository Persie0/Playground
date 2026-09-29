package p000;

import android.app.Activity;
import com.facebook.appevents.p008ml.ModelManager$Task;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class jn9 {

    /* JADX INFO: renamed from: a */
    public static final jn9 f45878a = new jn9();

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f45879b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public static final LinkedHashSet f45880c = new LinkedHashSet();

    /* JADX INFO: renamed from: d */
    public static final LinkedHashSet f45881d = new LinkedHashSet();

    /* JADX INFO: renamed from: a */
    public static final synchronized void m14557a() {
        if (lp1.f49971a.contains(jn9.class)) {
            return;
        }
        try {
            sy2.m21768c().execute(new RunnableC3094i(5));
        } catch (Throwable th) {
            lp1.m16420a(jn9.class, th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m14558d(Activity activity) {
        if (lp1.f49971a.contains(jn9.class)) {
            return;
        }
        try {
            if (!f45879b.get() || !j13.m14253k() || (f45880c.isEmpty() && f45881d.isEmpty())) {
                HashMap map = eua.f37916d;
                jga.m14444d(activity);
                return;
            }
            HashMap map2 = eua.f37916d;
            jga.m14443c(activity);
        } catch (Exception unused) {
        } catch (Throwable th) {
            lp1.m16420a(jn9.class, th);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m14559b() {
        String str;
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            w23 w23VarM24862k = y23.m24862k(sy2.m21767b(), false);
            if (w23VarM24862k != null && (str = w23VarM24862k.f66262k) != null) {
                m14560c(str);
                if (f45880c.isEmpty() && f45881d.isEmpty()) {
                    return;
                }
                File fileM24814d = y06.m24814d(ModelManager$Task.MTML_APP_EVENT_PREDICTION);
                if (fileM24814d == null) {
                    return;
                }
                j13.m14251i(fileM24814d);
                WeakReference weakReference = AbstractC3785y6.f69349l;
                Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
                if (activity != null) {
                    m14558d(activity);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m14560c(String str) {
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("production_events")) {
                JSONArray jSONArray = jSONObject.getJSONArray("production_events");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    LinkedHashSet linkedHashSet = f45880c;
                    String string = jSONArray.getString(i);
                    string.getClass();
                    linkedHashSet.add(string);
                }
            }
            if (jSONObject.has("eligible_for_prediction_events")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("eligible_for_prediction_events");
                int length2 = jSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    LinkedHashSet linkedHashSet2 = f45881d;
                    String string2 = jSONArray2.getString(i2);
                    string2.getClass();
                    linkedHashSet2.add(string2);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }
}
