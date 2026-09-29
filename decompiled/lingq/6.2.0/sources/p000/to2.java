package p000;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.airbnb.lottie.parser.moshi.AbstractC0875a;
import com.airbnb.lottie.parser.moshi.JsonReader$Token;
import com.facebook.FacebookException;
import com.facebook.Profile;
import com.google.android.gms.internal.measurement.AbstractC0965i;
import com.google.android.gms.internal.measurement.zzvr;
import com.google.android.gms.internal.measurement.zzxd;
import com.google.common.collect.ImmutableSet;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class to2 implements fm1, coa, yr6, dx5, jn1, ana, lkd {

    /* JADX INFO: renamed from: a */
    public static final to2 f62631a = new to2();

    /* JADX INFO: renamed from: b */
    public static final to2 f62632b = new to2();

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ to2 f62633c = new to2();

    /* JADX INFO: renamed from: d */
    public static final boolean m22254d(String str, String str2) {
        HashSet hashSet = gua.f41351e;
        ni7 ni7Var = ni7.f52759a;
        String str3 = null;
        if (!lp1.f49971a.contains(ni7.class)) {
            try {
                LinkedHashMap linkedHashMap = ni7.f52760b;
                if (linkedHashMap.containsKey(str)) {
                    str3 = (String) linkedHashMap.get(str);
                }
            } catch (Throwable th) {
                lp1.m16420a(ni7.class, th);
            }
        }
        if (str3 == null) {
            return false;
        }
        if (!str3.equals("other")) {
            try {
                sy2.m21768c().execute(new mv5(18, str3, str2));
            } catch (Exception unused) {
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static void m22255e(View view, View view2, String str) {
        HashSet hashSet;
        Field declaredField;
        Field declaredField2;
        Object obj;
        view.getClass();
        int iHashCode = view.hashCode();
        HashSet hashSet2 = gua.f41351e;
        HashSet hashSet3 = null;
        if (lp1.f49971a.contains(gua.class)) {
            hashSet = null;
        } else {
            try {
                hashSet = gua.f41351e;
            } catch (Throwable th) {
                lp1.m16420a(gua.class, th);
                hashSet = null;
            }
        }
        if (hashSet.contains(Integer.valueOf(iHashCode))) {
            return;
        }
        gua guaVar = new gua(view, view2, str);
        if (!lp1.f49971a.contains(mta.class)) {
            try {
                try {
                    declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                    try {
                        declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                    } catch (ClassNotFoundException | NoSuchFieldException unused) {
                        declaredField2 = null;
                    }
                } catch (ClassNotFoundException | NoSuchFieldException unused2) {
                    declaredField = null;
                }
                if (declaredField == null || declaredField2 == null) {
                    view.setOnClickListener(guaVar);
                } else {
                    declaredField.setAccessible(true);
                    declaredField2.setAccessible(true);
                    try {
                        declaredField.setAccessible(true);
                        obj = declaredField.get(view);
                    } catch (IllegalAccessException unused3) {
                        obj = null;
                    }
                    if (obj == null) {
                        view.setOnClickListener(guaVar);
                    } else {
                        declaredField2.set(obj, guaVar);
                    }
                }
            } catch (Exception unused4) {
            } catch (Throwable th2) {
                lp1.m16420a(mta.class, th2);
            }
        }
        if (!lp1.f49971a.contains(gua.class)) {
            try {
                hashSet3 = gua.f41351e;
            } catch (Throwable th3) {
                lp1.m16420a(gua.class, th3);
            }
        }
        hashSet3.add(Integer.valueOf(iHashCode));
    }

    /* JADX INFO: renamed from: k */
    public static void m22256k(String str, String str2, float[] fArr) {
        boolean zContains;
        boolean zContains2;
        jn9 jn9Var = jn9.f45878a;
        if (lp1.f49971a.contains(jn9.class)) {
            zContains = false;
        } else {
            try {
                str.getClass();
                zContains = jn9.f45880c.contains(str);
            } catch (Throwable th) {
                lp1.m16420a(jn9.class, th);
                zContains = false;
            }
        }
        if (zContains) {
            C3012fs c3012fs = new C3012fs(sy2.m21766a(), (String) null);
            if (lp1.f49971a.contains(c3012fs)) {
                return;
            }
            try {
                Bundle bundle = new Bundle();
                bundle.putString("_is_suggested_event", "1");
                bundle.putString("_button_text", str2);
                c3012fs.m12038d(str, bundle);
                return;
            } catch (Throwable th2) {
                lp1.m16420a(c3012fs, th2);
                return;
            }
        }
        if (lp1.f49971a.contains(jn9.class)) {
            zContains2 = false;
        } else {
            try {
                str.getClass();
                zContains2 = jn9.f45881d.contains(str);
            } catch (Throwable th3) {
                lp1.m16420a(jn9.class, th3);
                zContains2 = false;
            }
        }
        if (zContains2) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putString("event_name", str);
                JSONObject jSONObject = new JSONObject();
                StringBuilder sb = new StringBuilder();
                for (float f : fArr) {
                    sb.append(f);
                    sb.append(",");
                }
                jSONObject.put("dense", sb.toString());
                jSONObject.put("button_text", str2);
                bundle2.putString("metadata", jSONObject.toString());
                String str3 = mp3.f51688j;
                mp3 mp3VarM21069q = s46.m21069q(null, String.format(Locale.US, "%s/suggested_events", Arrays.copyOf(new Object[]{sy2.m21767b()}, 1)), null, null);
                mp3VarM21069q.f51694d = bundle2;
                mp3VarM21069q.m16982c();
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static zld m22257l(String str, zzxd zzxdVar) {
        boolean z;
        gmd gmdVarMo17492O;
        cmd cmdVar = bmd.f8701e;
        zzxdVar.getClass();
        fmd fmdVarM20022c = qld.m20022c();
        gmd gmdVar = fmdVarM20022c.f39318b;
        int i = 1;
        if (gmdVar == yld.f70046g) {
            gmdVar = null;
            qld.m20021b(fmdVarM20022c, null);
            z = true;
        } else {
            z = false;
        }
        if (gmdVar == null) {
            UUID uuidM20712b = rld.f59517c.m20712b();
            String strM5415a = AbstractC0965i.m5415a(uuidM20712b);
            zzvr zzvrVar = wld.f67030g;
            ImmutableSet immutableSet = (ImmutableSet) qld.f57920a.get();
            if (!immutableSet.isEmpty()) {
                immutableSet.forEach(new vld(i));
            }
            gmdVarMo17492O = new xld(uuidM20712b, strM5415a, str, cmdVar, zzvrVar, fmdVarM20022c);
        } else {
            gmdVarMo17492O = gmdVar instanceof nld ? ((nld) gmdVar).mo17492O(str, cmdVar, false, fmdVarM20022c) : gmdVar.mo12758M(str, cmdVar, fmdVarM20022c);
        }
        qld.m20021b(fmdVarM20022c, gmdVarMo17492O);
        return new zld(gmdVarMo17492O, z);
    }

    @Override // p000.ana
    /* JADX INFO: renamed from: a */
    public void mo617a(JSONObject jSONObject) {
        String strOptString = jSONObject != null ? jSONObject.optString("id") : null;
        if (strOptString == null) {
            Log.w("Profile", "No user ID returned on Me request");
            return;
        }
        String strOptString2 = jSONObject.optString("link");
        String strOptString3 = jSONObject.optString("profile_picture", null);
        C3309ls.f50061k.m18973k().m16498R(new Profile(strOptString, jSONObject.optString("first_name"), jSONObject.optString("middle_name"), jSONObject.optString("last_name"), jSONObject.optString("name"), strOptString2 != null ? Uri.parse(strOptString2) : null, strOptString3 != null ? Uri.parse(strOptString3) : null), true);
    }

    @Override // p000.dx5
    /* JADX INFO: renamed from: b */
    public void mo10740b(hw5 hw5Var, boolean z) {
    }

    @Override // p000.ana
    /* JADX INFO: renamed from: c */
    public void mo618c(FacebookException facebookException) {
        Log.e("Profile", "Got unexpected exception: " + facebookException);
    }

    @Override // p000.fm1
    public Object convert(Object obj) {
        ((m88) obj).close();
        return null;
    }

    /* JADX INFO: renamed from: f */
    public boolean mo14075f() {
        return this instanceof hq5;
    }

    @Override // p000.coa
    /* JADX INFO: renamed from: g */
    public Object mo87g(AbstractC0875a abstractC0875a, float f) {
        boolean z = abstractC0875a.mo5047z() == JsonReader$Token.BEGIN_ARRAY;
        if (z) {
            abstractC0875a.mo5037a();
        }
        float fMo5044r = (float) abstractC0875a.mo5044r();
        float fMo5044r2 = (float) abstractC0875a.mo5044r();
        while (abstractC0875a.mo5042p()) {
            abstractC0875a.mo5035R();
        }
        if (z) {
            abstractC0875a.mo5039c();
        }
        return new nm8((fMo5044r / 100.0f) * f, (fMo5044r2 / 100.0f) * f);
    }

    @Override // p000.lkd
    /* JADX INFO: renamed from: h */
    public Object mo4203h(Object obj) {
        String str = (String) ((gs9) obj).f48950a;
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: i */
    public void mo13433i(float f, float f2, float f3, l49 l49Var) {
        l49Var.m15799c(f, 0.0f);
    }

    @Override // p000.dx5
    /* JADX INFO: renamed from: j */
    public boolean mo10741j(hw5 hw5Var) {
        return false;
    }

    @Override // p000.yr6
    /* JADX INFO: renamed from: m */
    public void mo321m(Exception exc) {
        mp2 mp2Var = k06.f46482e;
        if (Log.isLoggable(mp2Var.f51686b, 6)) {
            String str = mp2Var.f51687c;
            Log.e("MobileVisionBase", str != null ? str.concat("Error preloading model resource") : "Error preloading model resource", exc);
        }
    }
}
