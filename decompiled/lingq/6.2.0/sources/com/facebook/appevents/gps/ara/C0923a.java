package com.facebook.appevents.gps.ara;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.facebook.appevents.AppEvent;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Set;
import kotlin.sequences.AbstractC3204c;
import org.json.JSONObject;
import p000.RunnableC3470pr;
import p000.fa4;
import p000.lp1;
import p000.sy2;
import p000.ua1;
import p000.vi3;
import p000.vk9;
import p000.yo3;
import p000.zo3;

/* JADX INFO: renamed from: com.facebook.appevents.gps.ara.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0923a {

    /* JADX INFO: renamed from: a */
    public static final C0923a f11395a = new C0923a();

    /* JADX INFO: renamed from: b */
    public static final String f11396b;

    /* JADX INFO: renamed from: c */
    public static boolean f11397c;

    /* JADX INFO: renamed from: d */
    public static zo3 f11398d;

    /* JADX INFO: renamed from: e */
    public static String f11399e;

    static {
        String string = C0923a.class.toString();
        string.getClass();
        f11396b = string;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5186a() {
        String str = f11396b;
        if (lp1.f49971a.contains(this)) {
            return false;
        }
        try {
            if (!f11397c || Build.VERSION.SDK_INT < 33) {
                return false;
            }
            try {
                Class.forName("android.adservices.measurement.MeasurementManager");
                Class.forName("android.os.OutcomeReceiver");
                return true;
            } catch (Error e) {
                Log.i(str, "FAILURE_NO_MEASUREMENT_MANAGER_CLASS");
                zo3 zo3Var = f11398d;
                if (zo3Var == null) {
                    fa4.m11636J("gpsDebugLogger");
                    throw null;
                }
                Bundle bundle = new Bundle();
                bundle.putString("gps_ara_failed_reason", e.toString());
                zo3Var.m25724a("gps_ara_failed", bundle);
                return false;
            } catch (Exception e2) {
                Log.i(str, "FAILURE_NO_MEASUREMENT_MANAGER_CLASS");
                zo3 zo3Var2 = f11398d;
                if (zo3Var2 == null) {
                    fa4.m11636J("gpsDebugLogger");
                    throw null;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("gps_ara_failed_reason", e2.toString());
                zo3Var2.m25724a("gps_ara_failed", bundle2);
                return false;
            }
        } catch (Throwable th) {
            lp1.m16420a(this, th);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.String] */
    /* JADX INFO: renamed from: b */
    public final String m5187b(AppEvent appEvent) {
        if (lp1.f49971a.contains(this)) {
            return null;
        }
        try {
            final JSONObject jSONObject = appEvent.f11380a;
            if (jSONObject != null && jSONObject.length() != 0) {
                Iterator<String> itKeys = jSONObject.keys();
                itKeys.getClass();
                this = AbstractC3204c.m15419o0(AbstractC3204c.m15420p0(AbstractC3204c.m15413i0(itKeys), new vi3() { // from class: com.facebook.appevents.gps.ara.GpsAraTriggersManager$getEventParameters$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        String str = (String) obj;
                        Object objOpt = jSONObject.opt(str);
                        if (objOpt == null) {
                            return null;
                        }
                        try {
                            return URLEncoder.encode(str, "UTF-8") + '=' + URLEncoder.encode(objOpt.toString(), "UTF-8");
                        } catch (Exception unused) {
                            return null;
                        }
                    }
                }), "&");
                return this;
            }
            return "";
        } catch (Throwable th) {
            lp1.m16420a(this, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5188c(String str, AppEvent appEvent) {
        String str2 = f11396b;
        Set set = lp1.f49971a;
        if (set.contains(this)) {
            return;
        }
        try {
            if (set.contains(this)) {
                return;
            }
            try {
                String string = appEvent.f11380a.getString("_eventName");
                if (fa4.m11650l(string, "_removed_")) {
                    return;
                }
                string.getClass();
                if (!vk9.m23380c0(string, "gps", false) && m5186a()) {
                    Context contextM21766a = sy2.m21766a();
                    try {
                        MeasurementManager measurementManagerM22655d = ua1.m22655d(contextM21766a.getSystemService(ua1.m22658g()));
                        if (measurementManagerM22655d == null) {
                            measurementManagerM22655d = MeasurementManager.get(contextM21766a.getApplicationContext());
                        }
                        if (measurementManagerM22655d == null) {
                            Log.w(str2, "FAILURE_GET_MEASUREMENT_MANAGER");
                            zo3 zo3Var = f11398d;
                            if (zo3Var == null) {
                                fa4.m11636J("gpsDebugLogger");
                                throw null;
                            }
                            Bundle bundle = new Bundle();
                            bundle.putString("gps_ara_failed_reason", "Failed to get measurement manager");
                            zo3Var.m25724a("gps_ara_failed", bundle);
                            return;
                        }
                        String strM5187b = m5187b(appEvent);
                        StringBuilder sb = new StringBuilder();
                        String str3 = f11399e;
                        if (str3 == null) {
                            fa4.m11636J("serverUri");
                            throw null;
                        }
                        sb.append(str3);
                        sb.append("?app_id=");
                        sb.append(str);
                        sb.append('&');
                        sb.append(strM5187b);
                        Uri uri = Uri.parse(sb.toString());
                        uri.getClass();
                        measurementManagerM22655d.registerTrigger(uri, sy2.m21768c(), new yo3());
                    } catch (Error e) {
                        Log.w(str2, "FAILURE_TRIGGER_REGISTRATION_FAILED");
                        zo3 zo3Var2 = f11398d;
                        if (zo3Var2 == null) {
                            fa4.m11636J("gpsDebugLogger");
                            throw null;
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("gps_ara_failed_reason", e.toString());
                        zo3Var2.m25724a("gps_ara_failed", bundle2);
                    } catch (Exception e2) {
                        Log.w(str2, "FAILURE_TRIGGER_REGISTRATION_FAILED");
                        zo3 zo3Var3 = f11398d;
                        if (zo3Var3 == null) {
                            fa4.m11636J("gpsDebugLogger");
                            throw null;
                        }
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("gps_ara_failed_reason", e2.toString());
                        zo3Var3.m25724a("gps_ara_failed", bundle3);
                    }
                }
            } catch (Throwable th) {
                lp1.m16420a(this, th);
            }
        } catch (Throwable th2) {
            lp1.m16420a(this, th2);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m5189d(String str, AppEvent appEvent) {
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            sy2.m21768c().execute(new RunnableC3470pr(16, str, appEvent));
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }
}
