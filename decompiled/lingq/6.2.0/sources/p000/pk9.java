package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.util.Log;
import androidx.compose.p002ui.layout.AbstractC0337d;
import androidx.compose.runtime.C0272a;
import androidx.compose.runtime.internal.C0282a;
import androidx.glance.layout.AbstractC0686a;
import androidx.glance.text.AbstractC0704a;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.LoggingBehavior;
import com.facebook.internal.FeatureManager$Feature;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes.dex */
public abstract class pk9 {

    /* JADX INFO: renamed from: e */
    public static final sq5 f56360e;

    /* JADX INFO: renamed from: f */
    public static sq5 f56361f;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ int f56372q = 0;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ int f56373r = 0;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ int f56374s = 0;

    /* JADX INFO: renamed from: t */
    public static boolean f56375t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ int f56376u = 0;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ int f56377v = 0;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ int f56378w = 0;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ int f56379x = 0;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ int f56380y = 0;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ int f56381z = 0;

    /* JADX INFO: renamed from: a */
    public static final C0282a f56356a = new C0282a(-1079932747, false, new C2914d4(6));

    /* JADX INFO: renamed from: b */
    public static final C0282a f56357b = new C0282a(-1727796308, false, new C2914d4(7));

    /* JADX INFO: renamed from: c */
    public static final C0282a f56358c = new C0282a(2128720833, false, new oh0(13));

    /* JADX INFO: renamed from: d */
    public static final ln1 f56359d = new ln1(3);

    /* JADX INFO: renamed from: g */
    public static final fs6 f56362g = new fs6(19, new ln1(22), new vp6(26));

    /* JADX INFO: renamed from: h */
    public static final jda f56363h = new jda(new wx8(20), new foa(7));

    /* JADX INFO: renamed from: i */
    public static final jda f56364i = new jda(new wx8(21), new wx8(22));

    /* JADX INFO: renamed from: j */
    public static final jda f56365j = new jda(new wx8(23), new wx8(24));

    /* JADX INFO: renamed from: k */
    public static final jda f56366k = new jda(new wx8(25), new wx8(26));

    /* JADX INFO: renamed from: l */
    public static final jda f56367l = new jda(new wx8(27), new wx8(28));

    /* JADX INFO: renamed from: m */
    public static final jda f56368m = new jda(new wx8(29), new foa(0));

    /* JADX INFO: renamed from: n */
    public static final jda f56369n = new jda(new foa(1), new foa(2));

    /* JADX INFO: renamed from: o */
    public static final jda f56370o = new jda(new foa(3), new foa(4));

    /* JADX INFO: renamed from: p */
    public static final jda f56371p = new jda(new foa(5), new foa(6));

    static {
        Object obj = null;
        f56360e = new sq5(obj, obj, obj, 2);
    }

    /* JADX INFO: renamed from: a */
    public static final void m19366a(e16 e16Var, InterfaceC3571se interfaceC3571se, C0282a c0282a, ye1 ye1Var, int i) {
        InterfaceC3571se interfaceC3571se2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(380139498);
        int i2 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i | 432;
        int i3 = 1;
        if (tj3Var.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            gc0 gc0Var = nj0.f52808c;
            ht5 ht5VarM19966d = qh0.m19966d(gc0Var, false);
            boolean zM22120g = tj3Var.m22120g(ht5VarM19966d);
            Object objM22097O = tj3Var.m22097O();
            if (zM22120g || objM22097O == we1.f66679a) {
                objM22097O = new C3794yf(i3, ht5VarM19966d, c0282a);
                tj3Var.m22131l0(objM22097O);
            }
            AbstractC0337d.m1486a(e16Var, (zi3) objM22097O, tj3Var, i2 & 14, 0);
            interfaceC3571se2 = gc0Var;
        } else {
            tj3Var.m22102U();
            interfaceC3571se2 = interfaceC3571se;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new di0(i, 0, e16Var, interfaceC3571se2, c0282a);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m19367b(final C0850ck c0850ck, final String str, final v78 v78Var, final v78 v78Var2, on3 on3Var, final C0282a c0282a, ye1 ye1Var, final int i) {
        on3 on3Var2;
        final on3 on3Var3;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(899455099);
        if (((i | (tj3Var.m22124i(c0850ck) ? 4 : 2) | (tj3Var.m22120g(str) ? 32 : 16) | (tj3Var.m22124i(v78Var) ? 256 : 128) | (tj3Var.m22124i(v78Var2) ? 2048 : 1024) | 221184) & 599187) == 599186 && tj3Var.m22086D()) {
            tj3Var.m22102U();
            on3Var3 = on3Var;
        } else {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                on3Var2 = mn3.f51554a;
            } else {
                tj3Var.m22102U();
                on3Var2 = on3Var;
            }
            tj3Var.m22140r();
            AbstractC0686a.m2487c(wfb.m23929x(ci8.m4735t(on3Var2), 0.0f, 1), 0, 1, ci8.m4703P(-1373567849, new aj3() { // from class: o1a
                @Override // p000.aj3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    uj8 uj8Var = (uj8) obj;
                    ye1 ye1Var2 = (ye1) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    AbstractC0686a.m2485a(wfb.m23931z(ci8.m4706S(mn3.f51554a, 48.0f), 0.0f, 14), C3532re.f59146f, ci8.m4703P(-510985574, new C3794yf(23, v78Var, c0850ck), ye1Var2), ye1Var2, 384, 0);
                    ux9 ux9Var = new ux9(v78Var2, new zx9(d32.m10018P(16)), new ac3(500), 56);
                    uj8Var.getClass();
                    AbstractC0704a.m2506a(str, new m4b(jg2.f45515a), ux9Var, 1, ye1Var2, 3072, 0);
                    c0282a.invoke(uj8Var, ye1Var2, Integer.valueOf(iIntValue & 14));
                    return xfa.f68157a;
                }
            }, tj3Var), tj3Var, 3072, 2);
            on3Var3 = on3Var2;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(str, v78Var, v78Var2, on3Var3, c0282a, i) { // from class: p1a

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f55458b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ v78 f55459c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ v78 f55460d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ on3 f55461e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ C0282a f55462f;

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(1572865);
                    pk9.m19367b(this.f55457a, this.f55458b, this.f55459c, this.f55460d, this.f55461e, this.f55462f, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: e */
    public static ArrayList m19368e(AbstractList abstractList, HttpURLConnection httpURLConnection, FacebookException facebookException) {
        abstractList.getClass();
        ArrayList arrayList = new ArrayList(v91.m23189q0(abstractList, 10));
        Iterator it = abstractList.iterator();
        while (it.hasNext()) {
            arrayList.add(new pp3((mp3) it.next(), httpURLConnection, new FacebookRequestError(facebookException)));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fb A[Catch: JSONException -> 0x0113, TryCatch #0 {JSONException -> 0x0113, blocks: (B:5:0x0017, B:7:0x001d, B:9:0x0027, B:11:0x002b, B:14:0x0038, B:16:0x0042, B:19:0x004c, B:22:0x0056, B:25:0x005e, B:27:0x0064, B:30:0x006e, B:33:0x0078, B:46:0x00df, B:35:0x008a, B:38:0x0097, B:40:0x00a0, B:44:0x00b7, B:52:0x00f3, B:54:0x00fb, B:55:0x0101), top: B:93:0x0017 }] */
    /* JADX INFO: renamed from: g */
    public static pp3 m19369g(mp3 mp3Var, HttpURLConnection httpURLConnection, Object obj, Object obj2) throws JSONException {
        FacebookRequestError facebookRequestError;
        AccessToken accessToken;
        AccessToken accessToken2;
        int iOptInt;
        String strOptString;
        String strOptString2;
        boolean zOptBoolean;
        int iOptInt2;
        boolean z;
        String str;
        String str2;
        Object obj3 = obj;
        if (obj3 instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj3;
            try {
                if (jSONObject.has("code")) {
                    int i = jSONObject.getInt("code");
                    Object objM3936Y = bna.m3936Y(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
                    if (objM3936Y != null && (objM3936Y instanceof JSONObject)) {
                        if (((JSONObject) objM3936Y).has("error")) {
                            JSONObject jSONObject2 = (JSONObject) bna.m3936Y((JSONObject) objM3936Y, "error", null);
                            String strOptString3 = jSONObject2 != null ? jSONObject2.optString("type", null) : null;
                            String strOptString4 = jSONObject2 != null ? jSONObject2.optString("message", null) : null;
                            int iOptInt3 = jSONObject2 != null ? jSONObject2.optInt("code", -1) : -1;
                            int iOptInt4 = jSONObject2 != null ? jSONObject2.optInt("error_subcode", -1) : -1;
                            strOptString2 = jSONObject2 != null ? jSONObject2.optString("error_user_msg", null) : null;
                            strOptString = jSONObject2 != null ? jSONObject2.optString("error_user_title", null) : null;
                            zOptBoolean = jSONObject2 != null ? jSONObject2.optBoolean("is_transient", false) : false;
                            iOptInt2 = iOptInt4;
                            z = true;
                            str = strOptString3;
                            iOptInt = iOptInt3;
                            str2 = strOptString4;
                        } else if (((JSONObject) objM3936Y).has("error_code") || ((JSONObject) objM3936Y).has("error_msg") || ((JSONObject) objM3936Y).has("error_reason")) {
                            String strOptString5 = ((JSONObject) objM3936Y).optString("error_reason", null);
                            String strOptString6 = ((JSONObject) objM3936Y).optString("error_msg", null);
                            iOptInt = ((JSONObject) objM3936Y).optInt("error_code", -1);
                            strOptString = null;
                            strOptString2 = null;
                            zOptBoolean = false;
                            iOptInt2 = ((JSONObject) objM3936Y).optInt("error_subcode", -1);
                            z = true;
                            str = strOptString5;
                            str2 = strOptString6;
                        } else {
                            strOptString = null;
                            strOptString2 = null;
                            z = false;
                            zOptBoolean = false;
                            iOptInt2 = -1;
                            iOptInt = -1;
                            str = null;
                            str2 = null;
                        }
                        if (z) {
                            facebookRequestError = new FacebookRequestError(i, iOptInt, iOptInt2, str, str2, strOptString, strOptString2, obj2, null, zOptBoolean);
                        } else {
                            if (i <= 299) {
                            }
                            if (jSONObject.has("body")) {
                            }
                            facebookRequestError = new FacebookRequestError(i, -1, -1, null, null, null, null, obj2, null, false);
                        }
                    } else if (i <= 299 || 200 > i) {
                        if (jSONObject.has("body")) {
                        }
                        facebookRequestError = new FacebookRequestError(i, -1, -1, null, null, null, null, obj2, null, false);
                    } else {
                        facebookRequestError = null;
                    }
                } else {
                    facebookRequestError = null;
                }
            } catch (JSONException unused) {
            }
            if (facebookRequestError != null) {
                Log.e("pp3", facebookRequestError.toString());
                if (facebookRequestError.f11358b == 190 && (accessToken = mp3Var.f51691a) != null) {
                    Date date = AccessToken.f11306l;
                    if (accessToken.equals(x74.m24363t())) {
                        if (facebookRequestError.f11359c != 493) {
                            x74.m24337D(null);
                        } else {
                            AccessToken accessTokenM24363t = x74.m24363t();
                            if (accessTokenM24363t != null && !new Date().after(accessTokenM24363t.f11307a) && (accessToken2 = (AccessToken) w41.f66361h.m22270m().f66367c) != null) {
                                x74.m24337D(new AccessToken(accessToken2.f11311e, accessToken2.f11314h, accessToken2.f11315i, accessToken2.f11308b, accessToken2.f11309c, accessToken2.f11310d, accessToken2.f11312f, new Date(), new Date(), accessToken2.f11316j, "facebook"));
                            }
                        }
                    }
                }
                return new pp3(mp3Var, httpURLConnection, facebookRequestError);
            }
            Object objM3936Y2 = bna.m3936Y(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
            if (objM3936Y2 instanceof JSONObject) {
                JSONObject jSONObject3 = (JSONObject) objM3936Y2;
                return new pp3(mp3Var, httpURLConnection, jSONObject3.toString(), jSONObject3);
            }
            if (objM3936Y2 instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) objM3936Y2;
                String string = jSONArray.toString();
                mp3Var.getClass();
                string.getClass();
                return new pp3(mp3Var, httpURLConnection, null, jSONArray, null);
            }
            obj3 = JSONObject.NULL;
            obj3.getClass();
        }
        if (obj3 == JSONObject.NULL) {
            return new pp3(mp3Var, httpURLConnection, obj3.toString(), null);
        }
        throw new FacebookException("Got unexpected object type in response, class: ".concat(obj3.getClass().getSimpleName()));
    }

    /* JADX INFO: renamed from: h */
    public static ArrayList m19370h(InputStream inputStream, HttpURLConnection httpURLConnection, op3 op3Var) throws JSONException, IOException {
        Object obj;
        op3Var.getClass();
        String strM3970q0 = bna.m3970q0(inputStream);
        iy5 iy5Var = qj5.f57852d;
        iy5.m14198n(LoggingBehavior.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(strM3970q0.length()), strM3970q0);
        Object objNextValue = new JSONTokener(strM3970q0).nextValue();
        objNextValue.getClass();
        int size = op3Var.f54678c.size();
        ArrayList arrayList = new ArrayList(size);
        if (size == 1) {
            mp3 mp3Var = (mp3) op3Var.get(0);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("body", objNextValue);
                jSONObject.put("code", httpURLConnection.getResponseCode());
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(jSONObject);
                obj = jSONArray;
            } catch (IOException e) {
                arrayList.add(new pp3(mp3Var, httpURLConnection, new FacebookRequestError(e)));
                obj = objNextValue;
            } catch (JSONException e2) {
                arrayList.add(new pp3(mp3Var, httpURLConnection, new FacebookRequestError(e2)));
                obj = objNextValue;
            }
        } else {
            obj = objNextValue;
        }
        if (obj instanceof JSONArray) {
            JSONArray jSONArray2 = (JSONArray) obj;
            if (jSONArray2.length() == size) {
                int length = jSONArray2.length();
                for (int i = 0; i < length; i++) {
                    mp3 mp3Var2 = (mp3) op3Var.get(i);
                    try {
                        Object obj2 = ((JSONArray) obj).get(i);
                        obj2.getClass();
                        arrayList.add(m19369g(mp3Var2, httpURLConnection, obj2, objNextValue));
                    } catch (FacebookException e3) {
                        arrayList.add(new pp3(mp3Var2, httpURLConnection, new FacebookRequestError(e3)));
                    } catch (JSONException e4) {
                        arrayList.add(new pp3(mp3Var2, httpURLConnection, new FacebookRequestError(e4)));
                    }
                }
                iy5 iy5Var2 = qj5.f57852d;
                iy5.m14198n(LoggingBehavior.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", op3Var.f54677b, Integer.valueOf(strM3970q0.length()), arrayList);
                return arrayList;
            }
        }
        throw new FacebookException("Unexpected number of results");
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m19371i(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: j */
    public static final qm5 m19372j(ym5 ym5Var, qm5 qm5Var) {
        qm5 qm5Var2;
        ym5Var.getClass();
        um5 um5Var = ym5Var instanceof um5 ? (um5) ym5Var : null;
        return (um5Var == null || (qm5Var2 = um5Var.f64075a) == null) ? qm5Var : qm5Var2;
    }

    /* JADX INFO: renamed from: k */
    public static final qm5 m19373k(ym5 ym5Var) {
        ym5Var.getClass();
        um5 um5Var = ym5Var instanceof um5 ? (um5) ym5Var : null;
        if (um5Var != null) {
            return um5Var.f64075a;
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static final void m19374l(Throwable th) {
        HashMap map;
        FeatureManager$Feature featureManager$Feature;
        if (f56375t) {
            HashSet hashSet = new HashSet();
            StackTraceElement[] stackTrace = th.getStackTrace();
            stackTrace.getClass();
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                className.getClass();
                synchronized (p13.f55426a) {
                    map = p13.f55427b;
                    if (map.isEmpty()) {
                        map.put(FeatureManager$Feature.AAM, new String[]{"com.facebook.appevents.aam."});
                        map.put(FeatureManager$Feature.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
                        map.put(FeatureManager$Feature.CloudBridge, new String[]{"com.facebook.appevents.cloudbridge."});
                        map.put(FeatureManager$Feature.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
                        map.put(FeatureManager$Feature.AnrReport, new String[]{"com.facebook.internal.instrument.anrreport."});
                        map.put(FeatureManager$Feature.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
                        map.put(FeatureManager$Feature.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
                        map.put(FeatureManager$Feature.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
                        map.put(FeatureManager$Feature.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
                        map.put(FeatureManager$Feature.ProtectedMode, new String[]{"com.facebook.appevents.integrity.ProtectedModeManager"});
                        map.put(FeatureManager$Feature.MACARuleMatching, new String[]{"com.facebook.appevents.integrity.MACARuleMatchingManager"});
                        map.put(FeatureManager$Feature.BlocklistEvents, new String[]{"com.facebook.appevents.integrity.BlocklistEventsManager"});
                        map.put(FeatureManager$Feature.FilterRedactedEvents, new String[]{"com.facebook.appevents.integrity.RedactedEventsManager"});
                        map.put(FeatureManager$Feature.FilterSensitiveParams, new String[]{"com.facebook.appevents.integrity.SensitiveParamsManager"});
                        map.put(FeatureManager$Feature.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
                        map.put(FeatureManager$Feature.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
                        map.put(FeatureManager$Feature.IapLogging, new String[]{"com.facebook.appevents.iap."});
                        map.put(FeatureManager$Feature.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
                        map.put(FeatureManager$Feature.GPSARATriggers, new String[]{"com.facebook.appevents.gps.ara.GpsARAManager"});
                        map.put(FeatureManager$Feature.GPSPACAProcessing, new String[]{"com.facebook.appevents.gps.pa.PACustomAudienceClient"});
                        map.put(FeatureManager$Feature.GPSTopicsObservation, new String[]{"com.facebook.appevents.gps.topics.GpsTopicsManager"});
                    }
                }
                Iterator it = map.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        featureManager$Feature = FeatureManager$Feature.Unknown;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    featureManager$Feature = (FeatureManager$Feature) entry.getKey();
                    for (String str : (String[]) entry.getValue()) {
                        if (cl9.m4842Y(className, str, false)) {
                            break;
                        }
                    }
                }
                if (featureManager$Feature != FeatureManager$Feature.Unknown) {
                    featureManager$Feature.getClass();
                    sy2.m21766a().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString(featureManager$Feature.toKey(), "18.2.3").apply();
                    hashSet.add(featureManager$Feature.toString());
                }
            }
            sy2 sy2Var = sy2.f61585a;
            if (!ema.m11256c() || hashSet.isEmpty()) {
                return;
            }
            egd.m11101c(new JSONArray((Collection) hashSet)).m20433d();
        }
    }

    /* JADX INFO: renamed from: m */
    public static final int m19375m(int i, yt4 yt4Var, Object obj) {
        int iMo15748e;
        return (obj == null || yt4Var.mo15745a() == 0 || (i < yt4Var.mo15745a() && obj.equals(yt4Var.mo15747c(i))) || (iMo15748e = yt4Var.mo15748e(obj)) == -1) ? i : iMo15748e;
    }

    /* JADX INFO: renamed from: p */
    public static final long m19376p(ye1 ye1Var) {
        return ((tj3) ye1Var).f62385T;
    }

    /* JADX INFO: renamed from: r */
    public static final void m19377r() {
        throw new IllegalStateException("Invalid applier");
    }

    /* JADX INFO: renamed from: s */
    public static final ArrayList m19378s(Map map, vi3 vi3Var) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            x76 x76Var = (x76) entry.getValue();
            Boolean boolValueOf = x76Var != null ? Boolean.valueOf(x76Var.f67889b) : null;
            boolValueOf.getClass();
            if (!boolValueOf.booleanValue() && !x76Var.f67890c) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Boolean) vi3Var.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: t */
    public static List m19379t(fb9 fb9Var, int i, fb9 fb9Var2, boolean z, boolean z2, boolean z3) {
        List list;
        boolean z4;
        int iM11746u = fb9Var.m11746u(i);
        int i2 = i + iM11746u;
        int iM11732f = fb9Var.m11732f(i);
        int iM11732f2 = fb9Var.m11732f(i2);
        int i3 = iM11732f2 - iM11732f;
        boolean z5 = i >= 0 && (fb9Var.f38801b[(fb9Var.m11743r(i) * 5) + 1] & 201326592) != 0;
        fb9Var2.m11748w(iM11746u);
        fb9Var2.m11749x(i3, fb9Var2.f38819t);
        if (fb9Var.f38806g < i2) {
            fb9Var.m11707B(i2);
        }
        if (fb9Var.f38810k < iM11732f2) {
            fb9Var.m11708C(iM11732f2, i2);
        }
        int[] iArr = fb9Var2.f38801b;
        int i4 = fb9Var2.f38819t;
        int i5 = i4 * 5;
        AbstractC3550rv.m20825S(i5, i * 5, i2 * 5, fb9Var.f38801b, iArr);
        Object[] objArr = fb9Var2.f38802c;
        int i6 = fb9Var2.f38808i;
        System.arraycopy(fb9Var.f38802c, iM11732f, objArr, i6, i3);
        int i7 = fb9Var2.f38821v;
        iArr[i5 + 2] = i7;
        int i8 = i4 - i;
        int i9 = i4 + iM11746u;
        int iM11733g = i6 - fb9Var2.m11733g(iArr, i4);
        int i10 = fb9Var2.f38812m;
        int i11 = fb9Var2.f38811l;
        int length = objArr.length;
        boolean z6 = z5;
        int i12 = i10;
        int i13 = i4;
        while (i13 < i9) {
            if (i13 != i4) {
                int i14 = (i13 * 5) + 2;
                iArr[i14] = iArr[i14] + i8;
            }
            int[] iArr2 = iArr;
            iArr2[(i13 * 5) + 4] = fb9.m11704i(fb9Var2.m11733g(iArr, i13) + iM11733g, i12 < i13 ? 0 : fb9Var2.f38810k, i11, length);
            if (i13 == i12) {
                i12++;
            }
            i13++;
            i4 = i4;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        fb9Var2.f38812m = i12;
        int iM11010a = eb9.m11010a(fb9Var.f38803d, i, fb9Var.m11741p());
        int iM11010a2 = eb9.m11010a(fb9Var.f38803d, i2, fb9Var.m11741p());
        if (iM11010a < iM11010a2) {
            ArrayList arrayList = fb9Var.f38803d;
            ArrayList arrayList2 = new ArrayList(iM11010a2 - iM11010a);
            for (int i15 = iM11010a; i15 < iM11010a2; i15++) {
                oj3 oj3Var = (oj3) arrayList.get(i15);
                oj3Var.f54459a += i8;
                arrayList2.add(oj3Var);
            }
            fb9Var2.f38803d.addAll(eb9.m11010a(fb9Var2.f38803d, fb9Var2.f38819t, fb9Var2.m11741p()), arrayList2);
            arrayList.subList(iM11010a, iM11010a2).clear();
            list = arrayList2;
        } else {
            list = EmptyList.f47638a;
        }
        List list2 = list;
        if (!list2.isEmpty()) {
            HashMap map = fb9Var.f38804e;
            HashMap map2 = fb9Var2.f38804e;
            if (map != null && map2 != null) {
                int size = list2.size();
                for (int i16 = 0; i16 < size; i16++) {
                }
            }
        }
        int i17 = fb9Var2.f38821v;
        fb9Var2.m11720O(i7);
        int iM11710E = fb9Var.m11710E(fb9Var.f38801b, i);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = iM11710E >= 0;
            if (z7) {
                fb9Var.m11721P();
                fb9Var.m11727a(iM11710E - fb9Var.f38819t);
                fb9Var.m11721P();
            }
            fb9Var.m11727a(i - fb9Var.f38819t);
            boolean zM11713H = fb9Var.m11713H();
            if (z7) {
                fb9Var.m11718M();
                fb9Var.m11735j();
                fb9Var.m11718M();
                fb9Var.m11735j();
            }
            z4 = zM11713H;
        } else {
            boolean zM11714I = fb9Var.m11714I(i, iM11746u);
            fb9Var.m11715J(iM11732f, i3, i - 1);
            z4 = zM11714I;
        }
        if (z4) {
            cf1.m4605a("Unexpectedly removed anchors");
        }
        int i18 = fb9Var2.f38814o;
        int i19 = iArr3[i5 + 1];
        fb9Var2.f38814o = i18 + ((1073741824 & i19) != 0 ? 1 : i19 & 67108863);
        if (z2) {
            fb9Var2.f38819t = i9;
            fb9Var2.f38808i = i6 + i3;
        }
        if (z6) {
            fb9Var2.m11725T(i7);
        }
        return list;
    }

    /* JADX INFO: renamed from: w */
    public static final C0272a m19380w(ye1 ye1Var) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22105X(206, cf1.f9997e);
        if (tj3Var.f62384S) {
            fb9.m11705z(tj3Var.f62374I);
        }
        Object objM22089G = tj3Var.m22089G();
        xj3 p98Var = objM22089G instanceof xj3 ? (xj3) objM22089G : null;
        if (p98Var == null) {
            p98Var = new p98(new rj3(new C0272a(tj3Var, tj3Var.f62385T, tj3Var.f62403q, tj3Var.f62368C, tj3Var.f62394h.f56034O)), -1);
            tj3Var.m22133m0(p98Var);
        }
        x48 x48Var = p98Var.f68286a;
        x48Var.getClass();
        C0272a c0272a = ((rj3) x48Var).f59403a;
        ((xc9) c0272a.f3721f).setValue(tj3Var.m22132m());
        tj3Var.m22139q(false);
        return c0272a;
    }

    /* JADX INFO: renamed from: x */
    public static final Object m19381x(ym5 ym5Var) {
        ym5Var.getClass();
        xm5 xm5Var = ym5Var instanceof xm5 ? (xm5) ym5Var : null;
        if (xm5Var != null) {
            return xm5Var.f68348a;
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    public static String m19382y(long j) {
        return "PointerId(value=" + j + ')';
    }

    /* JADX INFO: renamed from: z */
    public static final int m19383z(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    /* JADX INFO: renamed from: c */
    public co3 mo17372c(Context context, Looper looper, co7 co7Var, Object obj, qo3 qo3Var, ro3 ro3Var) {
        return mo17373d(context, looper, co7Var, obj, (scb) qo3Var, (scb) ro3Var);
    }

    /* JADX INFO: renamed from: d */
    public co3 mo17373d(Context context, Looper looper, co7 co7Var, Object obj, scb scbVar, scb scbVar2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    /* JADX INFO: renamed from: f */
    public abstract Intent mo5255f(Context context, Object obj);

    /* JADX INFO: renamed from: n */
    public abstract Object mo16143n(z21 z21Var);

    /* JADX INFO: renamed from: o */
    public abstract e28 mo19o();

    /* JADX INFO: renamed from: q */
    public hi8 mo12391q(Context context, Object obj) {
        return null;
    }

    /* JADX INFO: renamed from: u */
    public abstract Object mo5256u(Intent intent, int i);

    /* JADX INFO: renamed from: v */
    public abstract pk9 mo16144v(z21 z21Var, Object obj);
}
