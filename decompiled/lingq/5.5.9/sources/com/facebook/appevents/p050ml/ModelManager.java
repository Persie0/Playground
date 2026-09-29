package com.facebook.appevents.p050ml;

import ae.C0062b;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.GraphRequest;
import com.facebook.internal.FeatureManager;
import dm.C5207g;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import jm.C6525h;
import jm.C6526i;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.C7076b;
import mo.C7661i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p067d8.C5086z;
import p173i8.C6205a;
import p291o7.C8004n;
import p333q7.RunnableC8499a;
import p385sf.C9000b;
import p431v7.RunnableC9660d;
import p476x7.AsyncTaskC10108g;
import p502y7.C10300a;
import p502y7.C10301b;
import p502y7.C10302c;
import p502y7.C10304e;
import tl.C9325m;

/* JADX INFO: loaded from: classes.dex */
public final class ModelManager {

    /* JADX INFO: renamed from: a */
    public static final ModelManager f11524a = new ModelManager();

    /* JADX INFO: renamed from: b */
    public static final ConcurrentHashMap f11525b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    public static final List<String> f11526c = C9000b.m17252r("other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout");

    /* JADX INFO: renamed from: d */
    public static final List<String> f11527d = C9000b.m17252r("none", "address", "health");

    @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m13365d2 = {"Lcom/facebook/appevents/ml/ModelManager$Task;", "", "(Ljava/lang/String;I)V", "toKey", "", "toUseCase", "MTML_INTEGRITY_DETECT", "MTML_APP_EVENT_PREDICTION", "facebook-core_release"}, m13366k = 1, m13367mv = {1, 5, 1}, m13369xi = 48)
    public enum Task {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        /* JADX INFO: renamed from: com.facebook.appevents.ml.ModelManager$Task$a */
        public /* synthetic */ class C2296a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f11528a;

            static {
                int[] iArr = new int[Task.valuesCustom().length];
                iArr[Task.MTML_INTEGRITY_DETECT.ordinal()] = 1;
                iArr[Task.MTML_APP_EVENT_PREDICTION.ordinal()] = 2;
                f11528a = iArr;
            }
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static Task[] valuesCustom() {
            Task[] taskArrValuesCustom = values();
            return (Task[]) Arrays.copyOf(taskArrValuesCustom, taskArrValuesCustom.length);
        }

        public final String toKey() {
            int i10 = C2296a.f11528a[ordinal()];
            if (i10 == 1) {
                return "integrity_detect";
            }
            if (i10 == 2) {
                return "app_event_pred";
            }
            throw new NoWhenBranchMatchedException();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public final String toUseCase() {
            int i10 = C2296a.f11528a[ordinal()];
            if (i10 == 1) {
                return "MTML_INTEGRITY_DETECT";
            }
            if (i10 == 2) {
                return "MTML_APP_EVENT_PRED";
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.ml.ModelManager$a */
    public static final class C2297a {

        /* JADX INFO: renamed from: a */
        public final String f11529a;

        /* JADX INFO: renamed from: b */
        public final String f11530b;

        /* JADX INFO: renamed from: c */
        public final String f11531c;

        /* JADX INFO: renamed from: d */
        public final int f11532d;

        /* JADX INFO: renamed from: e */
        public final float[] f11533e;

        /* JADX INFO: renamed from: f */
        public File f11534f;

        /* JADX INFO: renamed from: g */
        public C10301b f11535g;

        /* JADX INFO: renamed from: h */
        public Runnable f11536h;

        /* JADX INFO: renamed from: com.facebook.appevents.ml.ModelManager$a$a */
        public static final class a {
            /* JADX INFO: renamed from: a */
            public static C2297a m6657a(JSONObject jSONObject) {
                float[] fArr;
                if (jSONObject == null) {
                    return null;
                }
                try {
                    String string = jSONObject.getString("use_case");
                    String string2 = jSONObject.getString("asset_uri");
                    String strOptString = jSONObject.optString("rules_uri", null);
                    int i10 = jSONObject.getInt("version_id");
                    ModelManager modelManager = ModelManager.f11524a;
                    JSONArray jSONArray = jSONObject.getJSONArray("thresholds");
                    if (!C6205a.m12742b(ModelManager.class)) {
                        try {
                            modelManager.getClass();
                            if (!C6205a.m12742b(modelManager) && jSONArray != null) {
                                try {
                                    fArr = new float[jSONArray.length()];
                                    int length = jSONArray.length();
                                    if (length > 0) {
                                        int i11 = 0;
                                        while (true) {
                                            int i12 = i11 + 1;
                                            try {
                                                String string3 = jSONArray.getString(i11);
                                                C5207g.m11110e(string3, "jsonArray.getString(i)");
                                                fArr[i11] = Float.parseFloat(string3);
                                            } catch (JSONException unused) {
                                            }
                                            if (i12 >= length) {
                                                break;
                                            }
                                            i11 = i12;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    C6205a.m12741a(modelManager, th2);
                                    fArr = null;
                                    C5207g.m11110e(string, "useCase");
                                    C5207g.m11110e(string2, "assetUri");
                                    return new C2297a(string, string2, strOptString, i10, fArr);
                                }
                            }
                        } catch (Throwable th3) {
                            C6205a.m12741a(ModelManager.class, th3);
                            fArr = null;
                        }
                        C5207g.m11110e(string, "useCase");
                        C5207g.m11110e(string2, "assetUri");
                        return new C2297a(string, string2, strOptString, i10, fArr);
                    }
                    fArr = null;
                    C5207g.m11110e(string, "useCase");
                    C5207g.m11110e(string2, "assetUri");
                    return new C2297a(string, string2, strOptString, i10, fArr);
                } catch (Exception unused2) {
                    return null;
                }
            }

            /* JADX INFO: renamed from: b */
            public static void m6658b(String str, String str2, AsyncTaskC10108g.a aVar) {
                File file = new File(C10304e.m19310a(), str2);
                if (str == null || file.exists()) {
                    aVar.mo17198a(file);
                } else {
                    new AsyncTaskC10108g(str, file, aVar).execute(new String[0]);
                }
            }

            /* JADX INFO: renamed from: c */
            public static void m6659c(C2297a c2297a, ArrayList arrayList) {
                File[] fileArrListFiles;
                File fileM19310a = C10304e.m19310a();
                int i10 = c2297a.f11532d;
                String str = c2297a.f11529a;
                if (fileM19310a != null && (fileArrListFiles = fileM19310a.listFiles()) != null) {
                    if (!(fileArrListFiles.length == 0)) {
                        String str2 = str + '_' + i10;
                        int length = fileArrListFiles.length;
                        int i11 = 0;
                        loop0: while (true) {
                            while (i11 < length) {
                                File file = fileArrListFiles[i11];
                                i11++;
                                String name = file.getName();
                                C5207g.m11110e(name, "name");
                                if (C7661i.m15256V2(name, str, false) && !C7661i.m15256V2(name, str2, false)) {
                                    file.delete();
                                }
                            }
                            break loop0;
                        }
                    }
                }
                m6658b(c2297a.f11530b, str + '_' + i10, new C10302c(arrayList));
            }
        }

        public C2297a(String str, String str2, String str3, int i10, float[] fArr) {
            this.f11529a = str;
            this.f11530b = str2;
            this.f11531c = str3;
            this.f11532d = i10;
            this.f11533e = fArr;
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.ml.ModelManager$b */
    public /* synthetic */ class C2298b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11537a;

        static {
            int[] iArr = new int[Task.valuesCustom().length];
            iArr[Task.MTML_APP_EVENT_PREDICTION.ordinal()] = 1;
            iArr[Task.MTML_INTEGRITY_DETECT.ordinal()] = 2;
            f11537a = iArr;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final File m6649d(Task task) {
        if (C6205a.m12742b(ModelManager.class)) {
            return null;
        }
        try {
            C5207g.m11111f(task, "task");
            C2297a c2297a = (C2297a) f11525b.get(task.toUseCase());
            if (c2297a == null) {
                return null;
            }
            return c2297a.f11534f;
        } catch (Throwable th2) {
            C6205a.m12741a(ModelManager.class, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final String[] m6650f(Task task, float[][] fArr, String[] strArr) {
        if (C6205a.m12742b(ModelManager.class)) {
            return null;
        }
        try {
            C5207g.m11111f(task, "task");
            C2297a c2297a = (C2297a) f11525b.get(task.toUseCase());
            C10301b c10301b = c2297a == null ? null : c2297a.f11535g;
            if (c10301b == null) {
                return null;
            }
            float[] fArr2 = c2297a.f11533e;
            int length = strArr.length;
            int length2 = fArr[0].length;
            C10300a c10300a = new C10300a(new int[]{length, length2});
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    System.arraycopy(fArr[i10], 0, c10300a.f51817c, i10 * length2, length2);
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            C10300a c10300aM19297a = c10301b.m19297a(c10300a, strArr, task.toKey());
            if (c10300aM19297a == null || fArr2 == null) {
                return null;
            }
            if (c10300aM19297a.f51817c.length == 0) {
                return null;
            }
            if (fArr2.length == 0) {
                return null;
            }
            int i12 = C2298b.f11537a[task.ordinal()];
            ModelManager modelManager = f11524a;
            if (i12 == 1) {
                return modelManager.m6656h(c10300aM19297a, fArr2);
            }
            if (i12 == 2) {
                return modelManager.m6655g(c10300aM19297a, fArr2);
            }
            throw new NoWhenBranchMatchedException();
        } catch (Throwable th2) {
            C6205a.m12741a(ModelManager.class, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m6651a(JSONObject jSONObject) {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                try {
                    C2297a c2297aM6657a = C2297a.a.m6657a(jSONObject.getJSONObject(itKeys.next()));
                    if (c2297aM6657a != null) {
                        f11525b.put(c2297aM6657a.f11529a, c2297aM6657a);
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6652b() {
        Locale locale;
        boolean z10;
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            String str = null;
            int iMax = 0;
            for (Map.Entry entry : f11525b.entrySet()) {
                String str2 = (String) entry.getKey();
                C2297a c2297a = (C2297a) entry.getValue();
                if (C5207g.m11106a(str2, Task.MTML_APP_EVENT_PREDICTION.toUseCase())) {
                    str = c2297a.f11530b;
                    iMax = Math.max(iMax, c2297a.f11532d);
                    FeatureManager featureManager = FeatureManager.f11546a;
                    if (FeatureManager.m6666c(FeatureManager.Feature.SuggestedEvents)) {
                        int i10 = 1;
                        if (C6205a.m12742b(this)) {
                            z10 = false;
                        } else {
                            try {
                                C5086z c5086z = C5086z.f33015a;
                                try {
                                    locale = C8004n.m15871a().getResources().getConfiguration().locale;
                                } catch (Exception unused) {
                                    locale = null;
                                }
                                if (locale != null) {
                                    String language = locale.getLanguage();
                                    C5207g.m11110e(language, "locale.language");
                                    if (!C7076b.m14278X2(language, "en", false)) {
                                        z10 = false;
                                    }
                                }
                                z10 = true;
                            } catch (Throwable th2) {
                                C6205a.m12741a(this, th2);
                            }
                        }
                        if (z10) {
                            c2297a.f11536h = new RunnableC9660d(i10);
                            arrayList.add(c2297a);
                        }
                    }
                }
                if (C5207g.m11106a(str2, Task.MTML_INTEGRITY_DETECT.toUseCase())) {
                    str = c2297a.f11530b;
                    iMax = Math.max(iMax, c2297a.f11532d);
                    FeatureManager featureManager2 = FeatureManager.f11546a;
                    if (FeatureManager.m6666c(FeatureManager.Feature.IntelligentIntegrity)) {
                        c2297a.f11536h = new RunnableC8499a(3);
                        arrayList.add(c2297a);
                    }
                }
            }
            if (str == null || iMax <= 0 || arrayList.isEmpty()) {
                return;
            }
            C2297a.a.m6659c(new C2297a("MTML", str, null, iMax, null), arrayList);
        } catch (Throwable th3) {
            C6205a.m12741a(this, th3);
        }
    }

    /* JADX INFO: renamed from: c */
    public final JSONObject m6653c() {
        if (C6205a.m12742b(this)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fields", TextUtils.join(",", new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
            String str = GraphRequest.f11448j;
            GraphRequest graphRequestM6621g = GraphRequest.C2279c.m6621g(null, "app/model_asset", null);
            graphRequestM6621g.f11454d = bundle;
            JSONObject jSONObject = graphRequestM6621g.m6606c().f43587b;
            if (jSONObject == null) {
                return null;
            }
            return m6654e(jSONObject);
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final JSONObject m6654e(JSONObject jSONObject) {
        if (C6205a.m12742b(this)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("data");
                int length = jSONArray.length();
                if (length <= 0) {
                    return jSONObject2;
                }
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("version_id", jSONObject3.getString("version_id"));
                    jSONObject4.put("use_case", jSONObject3.getString("use_case"));
                    jSONObject4.put("thresholds", jSONObject3.getJSONArray("thresholds"));
                    jSONObject4.put("asset_uri", jSONObject3.getString("asset_uri"));
                    if (jSONObject3.has("rules_uri")) {
                        jSONObject4.put("rules_uri", jSONObject3.getString("rules_uri"));
                    }
                    jSONObject2.put(jSONObject3.getString("use_case"), jSONObject4);
                    if (i11 >= length) {
                        return jSONObject2;
                    }
                    i10 = i11;
                }
            } catch (JSONException unused) {
                return new JSONObject();
            }
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final String[] m6655g(C10300a c10300a, float[] fArr) {
        if (C6205a.m12742b(this)) {
            return null;
        }
        try {
            int[] iArr = c10300a.f51815a;
            int i10 = iArr[0];
            int i11 = iArr[1];
            float[] fArr2 = c10300a.f51817c;
            if (i11 != fArr.length) {
                return null;
            }
            C6526i c6526iM411w2 = C0062b.m411w2(0, i10);
            ArrayList arrayList = new ArrayList(C9325m.m17681z(c6526iM411w2, 10));
            C6525h it = c6526iM411w2.iterator();
            while (it.f37168c) {
                int iMo13105a = it.mo13105a();
                String str = "none";
                int length = fArr.length;
                int i12 = 0;
                int i13 = 0;
                while (i12 < length) {
                    int i14 = i13 + 1;
                    if (fArr2[(iMo13105a * i11) + i13] >= fArr[i12]) {
                        str = f11527d.get(i13);
                    }
                    i12++;
                    i13 = i14;
                }
                arrayList.add(str);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final String[] m6656h(C10300a c10300a, float[] fArr) {
        if (C6205a.m12742b(this)) {
            return null;
        }
        try {
            int[] iArr = c10300a.f51815a;
            int i10 = iArr[0];
            int i11 = iArr[1];
            float[] fArr2 = c10300a.f51817c;
            if (i11 != fArr.length) {
                return null;
            }
            C6526i c6526iM411w2 = C0062b.m411w2(0, i10);
            ArrayList arrayList = new ArrayList(C9325m.m17681z(c6526iM411w2, 10));
            C6525h it = c6526iM411w2.iterator();
            while (it.f37168c) {
                int iMo13105a = it.mo13105a();
                String str = "other";
                int length = fArr.length;
                int i12 = 0;
                int i13 = 0;
                while (i12 < length) {
                    int i14 = i13 + 1;
                    if (fArr2[(iMo13105a * i11) + i13] >= fArr[i12]) {
                        str = f11526c.get(i13);
                    }
                    i12++;
                    i13 = i14;
                }
                arrayList.add(str);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return null;
        }
    }
}
