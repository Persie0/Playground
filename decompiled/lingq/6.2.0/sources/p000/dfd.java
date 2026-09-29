package p000;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dfd {
    /* JADX INFO: renamed from: a */
    public static xt3 m10324a(JSONObject jSONObject) {
        return new xt3(jSONObject.getLong("count"), jSONObject.getDouble("min"), jSONObject.getDouble("max"), jSONObject.getDouble("sum"));
    }

    /* JADX INFO: renamed from: b */
    public static int m10325b(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }
}
