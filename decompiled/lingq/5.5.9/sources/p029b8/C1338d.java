package p029b8;

import android.app.Activity;
import com.facebook.appevents.p050ml.ModelManager;
import com.facebook.internal.FetchedAppSettingsManager;
import dm.C5207g;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import p067d8.C5074n;
import p173i8.C6205a;
import p291o7.C8004n;
import p317p7.RunnableC8197d;
import p476x7.C10105d;

/* JADX INFO: renamed from: b8.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1338d {

    /* JADX INFO: renamed from: a */
    public static final C1338d f8143a = new C1338d();

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f8144b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public static final LinkedHashSet f8145c = new LinkedHashSet();

    /* JADX INFO: renamed from: d */
    public static final LinkedHashSet f8146d = new LinkedHashSet();

    /* JADX INFO: renamed from: a */
    public static final synchronized void m4914a() {
        try {
            if (C6205a.m12742b(C1338d.class)) {
                return;
            }
            try {
                C8004n.m15873c().execute(new RunnableC8197d(3));
            } catch (Throwable th2) {
                C6205a.m12741a(C1338d.class, th2);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[Catch: Exception -> 0x0058, all -> 0x0059, TryCatch #0 {Exception -> 0x0058, blocks: (B:6:0x0011, B:8:0x001a, B:17:0x0035, B:19:0x003f, B:22:0x0049, B:14:0x002e, B:23:0x0051), top: B:29:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x003f A[Catch: Exception -> 0x0058, all -> 0x0059, TryCatch #0 {Exception -> 0x0058, blocks: (B:6:0x0011, B:8:0x001a, B:17:0x0035, B:19:0x003f, B:22:0x0049, B:14:0x002e, B:23:0x0051), top: B:29:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0048  */
    /* JADX INFO: renamed from: d */
    public static final void m4915d(Activity activity) {
        boolean z10;
        if (C6205a.m12742b(C1338d.class)) {
            return;
        }
        try {
            C5207g.m11111f(activity, "activity");
            try {
                if (f8144b.get()) {
                    C1335a c1335a = C1335a.f8131a;
                    if (!C6205a.m12742b(C1335a.class)) {
                        try {
                            z10 = C1335a.f8136f;
                        } catch (Throwable th2) {
                            C6205a.m12741a(C1335a.class, th2);
                            z10 = false;
                        }
                        if (z10) {
                            if (f8145c.isEmpty()) {
                                if (!f8146d.isEmpty()) {
                                }
                            }
                            HashMap map = ViewTreeObserverOnGlobalLayoutListenerC1339e.f8147d;
                            ViewTreeObserverOnGlobalLayoutListenerC1339e.a.m4919a(activity);
                            return;
                        }
                    }
                    z10 = false;
                    if (z10) {
                        if (f8145c.isEmpty()) {
                            if (!f8146d.isEmpty()) {
                            }
                        }
                        HashMap map2 = ViewTreeObserverOnGlobalLayoutListenerC1339e.f8147d;
                        ViewTreeObserverOnGlobalLayoutListenerC1339e.a.m4919a(activity);
                        return;
                    }
                }
                HashMap map3 = ViewTreeObserverOnGlobalLayoutListenerC1339e.f8147d;
                ViewTreeObserverOnGlobalLayoutListenerC1339e.a.m4920b(activity);
            } catch (Exception unused) {
            }
        } catch (Throwable th3) {
            C6205a.m12741a(C1338d.class, th3);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4916b() {
        String str;
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f11550a;
            C5074n c5074nM6673f = FetchedAppSettingsManager.m6673f(C8004n.m15872b(), false);
            if (c5074nM6673f == null || (str = c5074nM6673f.f32980n) == null) {
                return;
            }
            m4917c(str);
            if (!(!f8145c.isEmpty()) && !(!f8146d.isEmpty())) {
                return;
            }
            ModelManager modelManager = ModelManager.f11524a;
            File fileM6649d = ModelManager.m6649d(ModelManager.Task.MTML_APP_EVENT_PREDICTION);
            if (fileM6649d == null) {
                return;
            }
            C1335a.m4896d(fileM6649d);
            WeakReference<Activity> weakReference = C10105d.f51260l;
            Activity activity = weakReference != null ? weakReference.get() : null;
            if (activity != null) {
                m4915d(activity);
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4917c(String str) {
        JSONArray jSONArray;
        int length;
        JSONArray jSONArray2;
        int length2;
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i10 = 0;
            if (jSONObject.has("production_events") && (length2 = (jSONArray2 = jSONObject.getJSONArray("production_events")).length()) > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    LinkedHashSet linkedHashSet = f8145c;
                    String string = jSONArray2.getString(i11);
                    C5207g.m11110e(string, "jsonArray.getString(i)");
                    linkedHashSet.add(string);
                    if (i12 >= length2) {
                        break;
                    } else {
                        i11 = i12;
                    }
                }
            }
            if (!jSONObject.has("eligible_for_prediction_events") || (length = (jSONArray = jSONObject.getJSONArray("eligible_for_prediction_events")).length()) <= 0) {
                return;
            }
            while (true) {
                int i13 = i10 + 1;
                LinkedHashSet linkedHashSet2 = f8146d;
                String string2 = jSONArray.getString(i10);
                C5207g.m11110e(string2, "jsonArray.getString(i)");
                linkedHashSet2.add(string2);
                if (i13 >= length) {
                    return;
                } else {
                    i10 = i13;
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }
}
