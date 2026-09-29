package androidx.activity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.widget.ViewOnLongClickListenerC0312f1;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.emoji2.text.C0899m;
import androidx.work.impl.background.systemalarm.C1252c;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.GraphRequest;
import com.facebook.appevents.FlushReason;
import com.facebook.appevents.cloudbridge.C2294a;
import com.facebook.login.DeviceAuthDialog;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.p051ui.C2517d;
import com.google.android.exoplayer2.source.C2496m;
import com.google.firebase.messaging.C3260w;
import com.google.firebase.messaging.FirebaseMessaging;
import dm.C5207g;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import p026b5.AbstractC1314g;
import p067d8.C5055a;
import p067d8.C5086z;
import p067d8.DialogC5071k;
import p173i8.C6205a;
import p175ia.C6249m;
import p205jk.C6505a;
import p214k5.C6610l;
import p232l2.C7222a;
import p232l2.C7226e;
import p232l2.RunnableC7223b;
import p232l2.RunnableC7224c;
import p235l5.C7254a0;
import p291o7.C8004n;
import p317p7.C8199f;
import p382s7.C8970c;
import p382s7.C8974g;
import p476x7.C10106e;
import va.C9701o;

/* JADX INFO: renamed from: androidx.activity.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0183b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f475a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f476b;

    public /* synthetic */ RunnableC0183b(int i10, Object obj) {
        this.f475a = i10;
        this.f476b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:153:0x0311  */
    /* JADX WARN: Code duplicated, block: B:190:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Locale locale;
        boolean zBooleanValue;
        int i10 = 5;
        boolean z10 = false;
        boolean z11 = true;
        switch (this.f475a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                ((ComponentActivity) this.f476b).invalidateOptionsMenu();
                return;
            case 1:
                ((ViewOnLongClickListenerC0312f1) this.f476b).m1191b(false);
                return;
            case 2:
                Activity activity = (Activity) this.f476b;
                int i11 = C7222a.f40604c;
                if (activity.isFinishing()) {
                    return;
                }
                int i12 = Build.VERSION.SDK_INT;
                if (i12 < 28) {
                    Class<?> cls = C7226e.f40611a;
                    boolean z12 = i12 == 26 || i12 == 27;
                    Method method = C7226e.f40616f;
                    if ((!z12 || method != null) && (C7226e.f40615e != null || C7226e.f40614d != null)) {
                        try {
                            Object obj2 = C7226e.f40613c.get(activity);
                            if (obj2 != null && (obj = C7226e.f40612b.get(activity)) != null) {
                                Application application = activity.getApplication();
                                C7226e.a aVar = new C7226e.a(activity);
                                application.registerActivityLifecycleCallbacks(aVar);
                                Handler handler = C7226e.f40617g;
                                handler.post(new RunnableC7223b(aVar, obj2));
                                try {
                                    if (i12 == 26 || i12 == 27) {
                                        Boolean bool = Boolean.FALSE;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                    } else {
                                        activity.recreate();
                                    }
                                    handler.post(new RunnableC7224c(application, aVar));
                                } catch (Throwable th2) {
                                    handler.post(new RunnableC7224c(application, aVar));
                                    throw th2;
                                }
                                break;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    if (z10) {
                        return;
                    }
                    activity.recreate();
                    return;
                }
                Class<?> cls2 = C7226e.f40611a;
                activity.recreate();
                z10 = true;
                if (z10) {
                    activity.recreate();
                    return;
                }
                return;
            case 3:
                ((C0899m.b) this.f476b).m3539c();
                return;
            case 4:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC0190i(i10, (Context) this.f476b));
                return;
            case 5:
                C1252c c1252c = (C1252c) this.f476b;
                if (c1252c.f7868g != 0) {
                    AbstractC1314g.m4867d().mo4869a(C1252c.f7861H, "Already started work for " + c1252c.f7864c);
                    return;
                }
                c1252c.f7868g = 1;
                AbstractC1314g.m4867d().mo4869a(C1252c.f7861H, "onAllConstraintsMet for " + c1252c.f7864c);
                if (!c1252c.f7865d.f7878d.m5458g(c1252c.f7873l, null)) {
                    c1252c.m4733c();
                    return;
                }
                C7254a0 c7254a0 = c1252c.f7865d.f7877c;
                C6610l c6610l = c1252c.f7864c;
                synchronized (c7254a0.f40740d) {
                    AbstractC1314g.m4867d().mo4869a(C7254a0.f40736e, "Starting timer for " + c6610l);
                    c7254a0.m14601a(c6610l);
                    C7254a0.b bVar = new C7254a0.b(c7254a0, c6610l);
                    c7254a0.f40738b.put(c6610l, bVar);
                    c7254a0.f40739c.put(c6610l, c1252c);
                    ((Handler) c7254a0.f40737a.f9487a).postDelayed(bVar, 600000L);
                    break;
                }
                return;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                FlushReason flushReason = (FlushReason) this.f476b;
                String str = C8199f.f44386a;
                if (C6205a.m12742b(C8199f.class)) {
                    return;
                }
                try {
                    C5207g.m11111f(flushReason, "$reason");
                    C8199f.m16324d(flushReason);
                    return;
                } catch (Throwable th3) {
                    C6205a.m12741a(C8199f.class, th3);
                    return;
                }
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                C2294a.m6644a((GraphRequest) this.f476b);
                return;
            case 8:
                String str2 = (String) this.f476b;
                C8970c c8970c = C8970c.f46998a;
                if (C6205a.m12742b(C8970c.class)) {
                    return;
                }
                try {
                    Bundle bundle = new Bundle();
                    Context contextM15871a = C8004n.m15871a();
                    C5055a c5055a = C5055a.f32901f;
                    C5055a c5055aM10738a = C5055a.a.m10738a(contextM15871a);
                    JSONArray jSONArray = new JSONArray();
                    String str3 = Build.MODEL;
                    if (str3 == null) {
                        str3 = "";
                    }
                    jSONArray.put(str3);
                    if ((c5055aM10738a == null ? null : c5055aM10738a.m10737a()) != null) {
                        jSONArray.put(c5055aM10738a.m10737a());
                    } else {
                        jSONArray.put("");
                    }
                    jSONArray.put("0");
                    jSONArray.put(C10106e.m18964c() ? "1" : "0");
                    C5086z c5086z = C5086z.f33015a;
                    try {
                        locale = C8004n.m15871a().getResources().getConfiguration().locale;
                        break;
                    } catch (Exception unused2) {
                        locale = null;
                    }
                    if (locale == null) {
                        locale = Locale.getDefault();
                        C5207g.m11110e(locale, "getDefault()");
                    }
                    jSONArray.put(locale.getLanguage() + '_' + ((Object) locale.getCountry()));
                    String string = jSONArray.toString();
                    C5207g.m11110e(string, "extInfoArray.toString()");
                    bundle.putString("device_session_id", C8970c.m17200a());
                    bundle.putString("extinfo", string);
                    String str4 = GraphRequest.f11448j;
                    String str5 = String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{str2}, 1));
                    C5207g.m11110e(str5, "java.lang.String.format(locale, format, *args)");
                    JSONObject jSONObject = GraphRequest.C2279c.m6623i(str5, bundle, null).m6606c().f43587b;
                    AtomicBoolean atomicBoolean = C8970c.f47004g;
                    if (jSONObject == null || !jSONObject.optBoolean("is_app_indexing_enabled", false)) {
                        z11 = false;
                    }
                    atomicBoolean.set(z11);
                    if (atomicBoolean.get()) {
                        C8974g c8974g = C8970c.f47001d;
                        if (c8974g != null) {
                            c8974g.m17215c();
                        }
                    } else {
                        C8970c.f47002e = null;
                    }
                    C8970c.f47005h = false;
                    return;
                } catch (Throwable th4) {
                    C6205a.m12741a(C8970c.class, th4);
                    return;
                }
            case 9:
                DialogC5071k.m10767f((DialogC5071k) this.f476b);
                return;
            case 10:
                DeviceAuthDialog deviceAuthDialog = (DeviceAuthDialog) this.f476b;
                int i13 = DeviceAuthDialog.f11572W0;
                C5207g.m11111f(deviceAuthDialog, "this$0");
                deviceAuthDialog.m6689A0();
                return;
            case 11:
                DefaultDrmSessionManager.C2392c c2392c = (DefaultDrmSessionManager.C2392c) this.f476b;
                if (c2392c.f12181c) {
                    return;
                }
                DrmSession drmSession = c2392c.f12180b;
                if (drmSession != null) {
                    drmSession.mo6938h(c2392c.f12179a);
                }
                DefaultDrmSessionManager.this.f12165n.remove(c2392c);
                c2392c.f12181c = true;
                return;
            case 12:
                C2496m c2496m = (C2496m) this.f476b;
                Map<String, String> map = C2496m.f13311h0;
                c2496m.m7372y();
                return;
            case 13:
                C6249m c6249m = (C6249m) this.f476b;
                Set<Integer> set = C6249m.f36330t0;
                c6249m.m12855C();
                return;
            case 14:
                C2517d c2517d = (C2517d) this.f476b;
                float[] fArr = C2517d.f13570S0;
                c2517d.m7445p();
                return;
            case 15:
                ((C9701o) this.f476b).f49653n.start();
                return;
            case 16:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f476b;
                C3260w c3260w = FirebaseMessaging.f16304m;
                FirebaseMessaging.C3229a c3229a = firebaseMessaging.f16313g;
                synchronized (c3229a) {
                    c3229a.m9235a();
                    Boolean bool2 = c3229a.f16320c;
                    zBooleanValue = bool2 != null ? bool2.booleanValue() : FirebaseMessaging.this.f16307a.m440g();
                }
                if (zBooleanValue) {
                    firebaseMessaging.m9232e();
                    return;
                }
                return;
            default:
                C6505a c6505a = (C6505a) this.f476b;
                C5207g.m11111f(c6505a, "this$0");
                C6505a.a aVar2 = c6505a.f37119b;
                if (aVar2 != null) {
                    aVar2.mo9710h();
                }
                RunnableC0190i runnableC0190i = new RunnableC0190i(22, c6505a);
                if (c6505a.f37121d) {
                    runnableC0190i.run();
                    return;
                } else {
                    c6505a.m13092b(runnableC0190i);
                    return;
                }
        }
    }
}
