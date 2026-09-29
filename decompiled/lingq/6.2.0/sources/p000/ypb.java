package p000;

import androidx.compose.runtime.internal.C0282a;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ypb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f70278a = new C0282a(-1484129928, false, new od1(6));

    /* JADX INFO: renamed from: a */
    public static w06 m25270a(JSONObject jSONObject) {
        float[] fArr;
        float[] fArr2;
        if (jSONObject == null) {
            return null;
        }
        try {
            String string = jSONObject.getString("use_case");
            String string2 = jSONObject.getString("asset_uri");
            String strOptString = jSONObject.optString("rules_uri", null);
            int i = jSONObject.getInt("version_id");
            y06 y06Var = y06.f69052a;
            JSONArray jSONArray = jSONObject.getJSONArray("thresholds");
            Set set = lp1.f49971a;
            if (set.contains(y06.class)) {
                fArr2 = null;
            } else {
                try {
                    if (set.contains(y06Var) || jSONArray == null) {
                        fArr = null;
                        fArr2 = fArr;
                    } else {
                        try {
                            fArr = new float[jSONArray.length()];
                            int length = jSONArray.length();
                            for (int i2 = 0; i2 < length; i2++) {
                                try {
                                    String string3 = jSONArray.getString(i2);
                                    string3.getClass();
                                    fArr[i2] = Float.parseFloat(string3);
                                } catch (JSONException unused) {
                                }
                            }
                        } catch (Throwable th) {
                            lp1.m16420a(y06Var, th);
                            fArr = null;
                        }
                        fArr2 = fArr;
                    }
                } catch (Throwable th2) {
                    lp1.m16420a(y06.class, th2);
                    fArr2 = null;
                }
            }
            string.getClass();
            string2.getClass();
            return new w06(string, string2, strOptString, i, fArr2);
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m25271b(w06 w06Var, ArrayList arrayList) {
        File[] fileArrListFiles;
        String str = w06Var.f66172a;
        int i = w06Var.f66175d;
        File fileM12765j = gna.m12765j();
        if (fileM12765j != null && (fileArrListFiles = fileM12765j.listFiles()) != null && fileArrListFiles.length != 0) {
            String str2 = str + '_' + i;
            for (File file : fileArrListFiles) {
                String name = file.getName();
                name.getClass();
                if (cl9.m4842Y(name, str, false) && !cl9.m4842Y(name, str2, false)) {
                    file.delete();
                }
            }
        }
        String str3 = str + '_' + i;
        String str4 = w06Var.f66173b;
        C3440oy c3440oy = new C3440oy(arrayList, 25);
        File file2 = new File(gna.m12765j(), str3);
        if (file2.exists()) {
            c3440oy.mo13636b(file2);
        } else {
            new j33(str4, file2, c3440oy).execute(new String[0]);
        }
    }
}
