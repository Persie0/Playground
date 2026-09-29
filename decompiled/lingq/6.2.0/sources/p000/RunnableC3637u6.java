package p000;

import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEventsLogger$FlushBehavior;
import com.facebook.appevents.FlushReason;
import com.facebook.internal.FeatureManager$Feature;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: u6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3637u6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63469a;

    public /* synthetic */ RunnableC3637u6(int i) {
        this.f63469a = i;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x00e3 A[Catch: all -> 0x00ad, Exception -> 0x010b, TryCatch #15 {Exception -> 0x010b, all -> 0x00ad, blocks: (B:46:0x0090, B:48:0x00a0, B:51:0x00a7, B:55:0x00b4, B:57:0x00c0, B:59:0x00c6, B:75:0x0101, B:70:0x00e0, B:71:0x00e3, B:74:0x00ea, B:54:0x00af), top: B:197:0x0090 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ea A[Catch: all -> 0x00ad, Exception -> 0x010b, TryCatch #15 {Exception -> 0x010b, all -> 0x00ad, blocks: (B:46:0x0090, B:48:0x00a0, B:51:0x00a7, B:55:0x00b4, B:57:0x00c0, B:59:0x00c6, B:75:0x0101, B:70:0x00e0, B:71:0x00e3, B:74:0x00ea, B:54:0x00af), top: B:197:0x0090 }] */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        C3488q8 c3488q8 = null;
        setM20077w = null;
        Set setM20077w = null;
        c3488q8 = null;
        c3488q8 = null;
        int i = 0;
        switch (this.f63469a) {
            case 0:
                z24.m25417d();
                return;
            case 1:
                if (AbstractC3785y6.f69344g == null) {
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(sy2.m21766a());
                    long j = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
                    long j2 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
                    String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
                    if (j != 0 && j2 != 0 && string != null) {
                        c3488q8 = new C3488q8(Long.valueOf(j), Long.valueOf(j2));
                        c3488q8.f57368b = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
                        c3488q8.f57373g = v3d.m23092b();
                        c3488q8.f57372f = Long.valueOf(System.currentTimeMillis());
                        UUID uuidFromString = UUID.fromString(string);
                        uuidFromString.getClass();
                        c3488q8.f57371e = uuidFromString;
                    }
                    AbstractC3785y6.f69344g = c3488q8;
                    return;
                }
                return;
            case 2:
                AbstractC3609tf.m22023a();
                return;
            case 3:
                h66 h66Var = ViewTreeObserverOnGlobalLayoutListenerC0391c.f4638e1;
                synchronized (h66Var) {
                    try {
                        int i2 = Build.VERSION.SDK_INT;
                        Object[] objArr = h66Var.f1293a;
                        int i3 = h66Var.f1294b;
                        if (i2 < 30) {
                            while (i < i3) {
                                ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c = (ViewTreeObserverOnGlobalLayoutListenerC0391c) objArr[i];
                                boolean showLayoutBounds = viewTreeObserverOnGlobalLayoutListenerC0391c.getShowLayoutBounds();
                                Class cls = ViewTreeObserverOnGlobalLayoutListenerC0391c.f4635b1;
                                viewTreeObserverOnGlobalLayoutListenerC0391c.setShowLayoutBounds(AbstractC3184kh.m15222p());
                                if (showLayoutBounds != viewTreeObserverOnGlobalLayoutListenerC0391c.getShowLayoutBounds()) {
                                    viewTreeObserverOnGlobalLayoutListenerC0391c.post(new RunnableC3647ug(viewTreeObserverOnGlobalLayoutListenerC0391c, 2));
                                }
                                i++;
                            }
                        } else {
                            while (i < i3) {
                                ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c2 = (ViewTreeObserverOnGlobalLayoutListenerC0391c) objArr[i];
                                viewTreeObserverOnGlobalLayoutListenerC0391c2.post(new RunnableC3647ug(viewTreeObserverOnGlobalLayoutListenerC0391c2, 3));
                                i++;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 4:
                if (lp1.f49971a.contains(AbstractC3546rr.class)) {
                    return;
                }
                try {
                    AbstractC3546rr.f59734c = null;
                    String str2 = C3012fs.f39540c;
                    if (iy5.m14194i() != AppEventsLogger$FlushBehavior.EXPLICIT_ONLY) {
                        AbstractC3546rr.m20755d(FlushReason.TIMER);
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    lp1.m16420a(AbstractC3546rr.class, th2);
                    return;
                }
            case 5:
                if (lp1.f49971a.contains(AbstractC3546rr.class)) {
                    return;
                }
                try {
                    AbstractC3584sr.m21613Z(AbstractC3546rr.f59732a);
                    AbstractC3546rr.f59732a = new qn3(10);
                    return;
                } catch (Throwable th3) {
                    lp1.m16420a(AbstractC3546rr.class, th3);
                    return;
                }
            case 6:
                HashSet hashSet = new HashSet();
                qn3 qn3Var = AbstractC3546rr.f59732a;
                if (!lp1.f49971a.contains(AbstractC3546rr.class)) {
                    try {
                        setM20077w = AbstractC3546rr.f59732a.m20077w();
                    } catch (Throwable th4) {
                        lp1.m16420a(AbstractC3546rr.class, th4);
                    }
                    break;
                }
                Iterator it = setM20077w.iterator();
                while (it.hasNext()) {
                    hashSet.add(((AccessTokenAppIdPair) it.next()).f11376a);
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    y23.m24862k((String) it2.next(), true);
                }
                return;
            case 7:
                Set set = lp1.f49971a;
                if (set.contains(iy5.class)) {
                    return;
                }
                try {
                    C3388nx c3388nxM19782l = AbstractC3489q9.m19782l(sy2.m21766a());
                    if (c3388nxM19782l == null || !c3388nxM19782l.f53350e) {
                        iy5 iy5Var = iy5.f44766b;
                        if (!set.contains(iy5Var)) {
                            try {
                                w23 w23VarM24862k = y23.m24862k(sy2.m21767b(), false);
                                if (w23VarM24862k != null && (str = w23VarM24862k.f66261j) != null) {
                                    try {
                                        py5.m19568a().clear();
                                        l70.m15949l(new JSONObject(str));
                                        break;
                                    } catch (JSONException unused) {
                                    }
                                }
                            } catch (Throwable th5) {
                                lp1.m16420a(iy5Var, th5);
                            }
                        }
                        iy5.f44767c = true;
                        return;
                    }
                    return;
                } catch (Throwable th6) {
                    lp1.m16420a(iy5.class, th6);
                    return;
                }
            case 8:
                y06 y06Var = y06.f69052a;
                Set set2 = lp1.f49971a;
                if (set2.contains(y06.class)) {
                    return;
                }
                try {
                    SharedPreferences sharedPreferences = sy2.m21766a().getSharedPreferences("com.facebook.internal.MODEL_STORE", 0);
                    String string2 = sharedPreferences.getString("models", null);
                    JSONObject jSONObject = (string2 == null || string2.length() == 0) ? new JSONObject() : new JSONObject(string2);
                    long j3 = sharedPreferences.getLong("model_request_timestamp", 0L);
                    if (!p13.m18852b(FeatureManager$Feature.ModelRequest) || jSONObject.length() == 0 || set2.contains(y06Var) || j3 == 0) {
                        jSONObject = y06Var.m24818c();
                        if (jSONObject == null) {
                            return;
                        } else {
                            sharedPreferences.edit().putString("models", jSONObject.toString()).putLong("model_request_timestamp", System.currentTimeMillis()).apply();
                        }
                    } else {
                        try {
                            if (System.currentTimeMillis() - j3 >= 259200000) {
                                jSONObject = y06Var.m24818c();
                                if (jSONObject == null) {
                                    return;
                                } else {
                                    sharedPreferences.edit().putString("models", jSONObject.toString()).putLong("model_request_timestamp", System.currentTimeMillis()).apply();
                                }
                            }
                        } catch (Throwable th7) {
                            lp1.m16420a(y06Var, th7);
                        }
                    }
                    y06Var.m24816a(jSONObject);
                    y06Var.m24817b();
                    return;
                } catch (Exception unused2) {
                    return;
                } catch (Throwable th8) {
                    lp1.m16420a(y06.class, th8);
                    return;
                }
            case 9:
                if (lp1.f49971a.contains(y06.class)) {
                    return;
                }
                try {
                    jn9.m14557a();
                    return;
                } catch (Throwable th9) {
                    lp1.m16420a(y06.class, th9);
                    return;
                }
            case 10:
                Set set3 = lp1.f49971a;
                if (set3.contains(y06.class)) {
                    return;
                }
                try {
                    if (set3.contains(p84.class)) {
                        return;
                    }
                    try {
                        p84.f55741c = true;
                        p84.f55742d = v23.m23054b("FBSDKFeatureIntegritySample", sy2.m21767b(), false);
                        return;
                    } catch (Throwable th10) {
                        lp1.m16420a(p84.class, th10);
                        return;
                    }
                } catch (Throwable th11) {
                    lp1.m16420a(y06.class, th11);
                    return;
                }
            default:
                AtomicBoolean atomicBoolean = s76.f60469c;
                if (lp1.f49971a.contains(s76.class)) {
                    return;
                }
                try {
                    try {
                        Iterator it3 = s76.f60468b.iterator();
                        while (it3.hasNext()) {
                            ((r76) it3.next()).m20434a(true);
                        }
                        atomicBoolean.set(false);
                        return;
                    } catch (Throwable th12) {
                        atomicBoolean.set(false);
                        throw th12;
                    }
                } catch (Throwable th13) {
                    lp1.m16420a(s76.class, th13);
                    return;
                }
        }
    }
}
