package com.facebook.appevents.integrity;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import kotlin.AbstractC3192a;
import org.json.JSONArray;
import org.json.JSONObject;
import p000.cs4;
import p000.fa4;
import p000.lp1;
import p000.sy2;
import p000.w23;
import p000.y23;

/* JADX INFO: renamed from: com.facebook.appevents.integrity.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0925a {

    /* JADX INFO: renamed from: b */
    public static boolean f11405b;

    /* JADX INFO: renamed from: d */
    public static HashSet f11407d;

    /* JADX INFO: renamed from: a */
    public static final C0925a f11404a = new C0925a();

    /* JADX INFO: renamed from: c */
    public static final cs4 f11406c = AbstractC3192a.m15356a(ProtectedModeManager$defaultStandardParameterNames$2.f11403b);

    /* JADX INFO: renamed from: b */
    public static final void m5191b(Bundle bundle) {
        if (lp1.f49971a.contains(C0925a.class)) {
            return;
        }
        try {
            if (f11405b && bundle != null && !bundle.isEmpty() && f11407d != null) {
                ArrayList<String> arrayList = new ArrayList();
                Set<String> setKeySet = bundle.keySet();
                setKeySet.getClass();
                for (String str : setKeySet) {
                    HashSet hashSet = f11407d;
                    hashSet.getClass();
                    if (!hashSet.contains(str)) {
                        str.getClass();
                        arrayList.add(str);
                    }
                }
                boolean z = false;
                for (String str2 : arrayList) {
                    if (bundle.containsKey(str2)) {
                        bundle.remove(str2);
                        z = true;
                    }
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("cd", z);
                bundle.putString("pm_metadata", jSONObject.toString());
                bundle.putString("pm", "1");
            }
        } catch (Throwable th) {
            lp1.m16420a(C0925a.class, th);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5192a() {
        HashSet hashSet;
        Set set = lp1.f49971a;
        if (set.contains(this)) {
            return;
        }
        try {
            w23 w23VarM24862k = y23.m24862k(sy2.m21767b(), false);
            if (w23VarM24862k == null) {
                return;
            }
            JSONArray jSONArray = w23VarM24862k.f66264m;
            HashSet hashSet2 = null;
            if (set.contains(this) || jSONArray == null) {
                hashSet = null;
            } else {
                try {
                    if (jSONArray.length() != 0) {
                        hashSet = new HashSet();
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            String string = jSONArray.getString(i);
                            string.getClass();
                            hashSet.add(string);
                        }
                    }
                } catch (Throwable th) {
                    lp1.m16420a(this, th);
                }
                hashSet = null;
            }
            if (hashSet == null) {
                if (!lp1.f49971a.contains(this)) {
                    try {
                        hashSet2 = (HashSet) f11406c.getValue();
                    } catch (Throwable th2) {
                        lp1.m16420a(this, th2);
                    }
                }
                hashSet = hashSet2;
            }
            f11407d = hashSet;
        } catch (Throwable th3) {
            lp1.m16420a(this, th3);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m5193c(Bundle bundle) {
        if (lp1.f49971a.contains(this) || bundle == null) {
            return false;
        }
        try {
            return bundle.containsKey("pm") && fa4.m11650l(bundle.get("pm"), "1");
        } catch (Throwable th) {
            lp1.m16420a(this, th);
            return false;
        }
    }
}
