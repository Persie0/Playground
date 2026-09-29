package p000;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.appevents.p008ml.ModelManager$Task;
import com.facebook.internal.FeatureManager$Feature;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class y06 {

    /* JADX INFO: renamed from: a */
    public static final y06 f69052a = new y06();

    /* JADX INFO: renamed from: b */
    public static final ConcurrentHashMap f69053b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    public static final List f69054c = vz1.m23605K("other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout");

    /* JADX INFO: renamed from: d */
    public static final List f69055d = vz1.m23605K("none", "address", "health");

    /* JADX INFO: renamed from: d */
    public static final File m24814d(ModelManager$Task modelManager$Task) {
        if (!lp1.f49971a.contains(y06.class)) {
            try {
                modelManager$Task.getClass();
                w06 w06Var = (w06) f69053b.get(modelManager$Task.toUseCase());
                if (w06Var != null) {
                    return w06Var.m23664c();
                }
            } catch (Throwable th) {
                lp1.m16420a(y06.class, th);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static final String[] m24815f(ModelManager$Task modelManager$Task, float[][] fArr, String[] strArr) {
        t06 t06VarM23663b;
        if (!lp1.f49971a.contains(y06.class)) {
            try {
                modelManager$Task.getClass();
                w06 w06Var = (w06) f69053b.get(modelManager$Task.toUseCase());
                if (w06Var != null && (t06VarM23663b = w06Var.m23663b()) != null) {
                    float[] fArrM23665d = w06Var.m23665d();
                    int length = strArr.length;
                    int length2 = fArr[0].length;
                    io5 io5Var = new io5(new int[]{length, length2});
                    for (int i = 0; i < length; i++) {
                        System.arraycopy(fArr[i], 0, io5Var.m14051a(), i * length2, length2);
                    }
                    io5 io5VarM21806a = t06VarM23663b.m21806a(io5Var, strArr, modelManager$Task.toKey());
                    if (io5VarM21806a != null && fArrM23665d != null && io5VarM21806a.m14051a().length != 0 && fArrM23665d.length != 0) {
                        int i2 = x06.f67591a[modelManager$Task.ordinal()];
                        y06 y06Var = f69052a;
                        if (i2 == 1) {
                            return y06Var.m24821h(io5VarM21806a, fArrM23665d);
                        }
                        if (i2 == 2) {
                            return y06Var.m24820g(io5VarM21806a, fArrM23665d);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } catch (Throwable th) {
                lp1.m16420a(y06.class, th);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m24816a(JSONObject jSONObject) {
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                try {
                    w06 w06VarM25270a = ypb.m25270a(jSONObject.getJSONObject(itKeys.next()));
                    if (w06VarM25270a != null) {
                        f69053b.put(w06VarM25270a.m23666e(), w06VarM25270a);
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0086 A[Catch: all -> 0x0094, TryCatch #2 {all -> 0x0094, blocks: (B:5:0x000a, B:6:0x001d, B:8:0x0023, B:10:0x0042, B:12:0x0056, B:24:0x0086, B:23:0x0082, B:27:0x0096, B:29:0x00a2, B:31:0x00b6, B:34:0x00c9, B:36:0x00cf, B:15:0x005f, B:19:0x0071), top: B:42:0x000a, inners: #0 }] */
    /* JADX INFO: renamed from: b */
    public final void m24817b() {
        Locale locale;
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            int iMax = 0;
            String strM23662a = null;
            for (Map.Entry entry : f69053b.entrySet()) {
                String str = (String) entry.getKey();
                w06 w06Var = (w06) entry.getValue();
                if (fa4.m11650l(str, ModelManager$Task.MTML_APP_EVENT_PREDICTION.toUseCase())) {
                    strM23662a = w06Var.m23662a();
                    iMax = Math.max(iMax, w06Var.m23667f());
                    if (p13.m18852b(FeatureManager$Feature.SuggestedEvents) && !lp1.f49971a.contains(this)) {
                        try {
                            try {
                                locale = sy2.m21766a().getResources().getConfiguration().locale;
                            } catch (Throwable th) {
                                lp1.m16420a(this, th);
                            }
                        } catch (Exception unused) {
                            locale = null;
                        }
                        if (locale != null) {
                            String language = locale.getLanguage();
                            language.getClass();
                            if (vk9.m23380c0(language, "en", false)) {
                                w06Var.m23668g(new RunnableC3637u6(9));
                                arrayList.add(w06Var);
                            }
                        } else {
                            w06Var.m23668g(new RunnableC3637u6(9));
                            arrayList.add(w06Var);
                        }
                    }
                }
                if (fa4.m11650l(str, ModelManager$Task.MTML_INTEGRITY_DETECT.toUseCase())) {
                    strM23662a = w06Var.m23662a();
                    iMax = Math.max(iMax, w06Var.m23667f());
                    if (p13.m18852b(FeatureManager$Feature.IntelligentIntegrity)) {
                        w06Var.m23668g(new RunnableC3637u6(10));
                        arrayList.add(w06Var);
                    }
                }
            }
            if (strM23662a == null || iMax <= 0 || arrayList.isEmpty()) {
                return;
            }
            ypb.m25271b(new w06("MTML", strM23662a, null, iMax, null), arrayList);
        } catch (Throwable th2) {
            lp1.m16420a(this, th2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final JSONObject m24818c() {
        if (!lp1.f49971a.contains(this)) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("fields", TextUtils.join(",", new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
                String str = mp3.f51688j;
                mp3 mp3VarM21068p = s46.m21068p(null, "app/model_asset", null);
                mp3VarM21068p.f51694d = bundle;
                JSONObject jSONObject = mp3VarM21068p.m16982c().f56628b;
                if (jSONObject != null) {
                    return m24819e(jSONObject);
                }
            } catch (Throwable th) {
                lp1.m16420a(this, th);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final JSONObject m24819e(JSONObject jSONObject) {
        if (lp1.f49971a.contains(this)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("data");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("version_id", jSONObject3.getString("version_id"));
                    jSONObject4.put("use_case", jSONObject3.getString("use_case"));
                    jSONObject4.put("thresholds", jSONObject3.getJSONArray("thresholds"));
                    jSONObject4.put("asset_uri", jSONObject3.getString("asset_uri"));
                    if (jSONObject3.has("rules_uri")) {
                        jSONObject4.put("rules_uri", jSONObject3.getString("rules_uri"));
                    }
                    jSONObject2.put(jSONObject3.getString("use_case"), jSONObject4);
                }
                return jSONObject2;
            } catch (JSONException unused) {
                return new JSONObject();
            }
        } catch (Throwable th) {
            lp1.m16420a(this, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final String[] m24820g(io5 io5Var, float[] fArr) {
        if (!lp1.f49971a.contains(this)) {
            try {
                int iM14052b = io5Var.m14052b(0);
                int iM14052b2 = io5Var.m14052b(1);
                float[] fArrM14051a = io5Var.m14051a();
                if (iM14052b2 == fArr.length) {
                    i84 i84VarM15922M = l70.m15922M(0, iM14052b);
                    ArrayList arrayList = new ArrayList(v91.m23189q0(i84VarM15922M, 10));
                    Iterator it = i84VarM15922M.iterator();
                    while (((h84) it).f41941c) {
                        int iNextInt = ((a84) it).nextInt();
                        Object obj = "none";
                        int length = fArr.length;
                        int i = 0;
                        int i2 = 0;
                        while (i < length) {
                            int i3 = i2 + 1;
                            if (fArrM14051a[(iNextInt * iM14052b2) + i2] >= fArr[i]) {
                                obj = f69055d.get(i2);
                            }
                            i++;
                            i2 = i3;
                        }
                        arrayList.add((String) obj);
                    }
                    return (String[]) arrayList.toArray(new String[0]);
                }
            } catch (Throwable th) {
                lp1.m16420a(this, th);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final String[] m24821h(io5 io5Var, float[] fArr) {
        if (!lp1.f49971a.contains(this)) {
            try {
                int iM14052b = io5Var.m14052b(0);
                int iM14052b2 = io5Var.m14052b(1);
                float[] fArrM14051a = io5Var.m14051a();
                if (iM14052b2 == fArr.length) {
                    i84 i84VarM15922M = l70.m15922M(0, iM14052b);
                    ArrayList arrayList = new ArrayList(v91.m23189q0(i84VarM15922M, 10));
                    Iterator it = i84VarM15922M.iterator();
                    while (((h84) it).f41941c) {
                        int iNextInt = ((a84) it).nextInt();
                        Object obj = "other";
                        int length = fArr.length;
                        int i = 0;
                        int i2 = 0;
                        while (i < length) {
                            int i3 = i2 + 1;
                            if (fArrM14051a[(iNextInt * iM14052b2) + i2] >= fArr[i]) {
                                obj = f69054c.get(i2);
                            }
                            i++;
                            i2 = i3;
                        }
                        arrayList.add((String) obj);
                    }
                    return (String[]) arrayList.toArray(new String[0]);
                }
            } catch (Throwable th) {
                lp1.m16420a(this, th);
                return null;
            }
        }
        return null;
    }
}
