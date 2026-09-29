package p000;

import android.net.Uri;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gdd {
    /* JADX INFO: renamed from: a */
    public static mp2 m12505a(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("name");
        if (bna.m3945d0(strOptString)) {
            return null;
        }
        strOptString.getClass();
        List listM23365A0 = vk9.m23365A0(strOptString, new String[]{"|"}, 0, 6);
        if (listM23365A0.size() != 2) {
            return null;
        }
        String str = (String) u91.m22589G0(listM23365A0);
        String str2 = (String) u91.m22597O0(listM23365A0);
        if (bna.m3945d0(str) || bna.m3945d0(str2)) {
            return null;
        }
        String strOptString2 = jSONObject.optString("url");
        if (!bna.m3945d0(strOptString2)) {
            Uri.parse(strOptString2);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("versions");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                int i2 = -1;
                int iOptInt = jSONArrayOptJSONArray.optInt(i, -1);
                if (iOptInt == -1) {
                    String strOptString3 = jSONArrayOptJSONArray.optString(i);
                    if (!bna.m3945d0(strOptString3)) {
                        try {
                            strOptString3.getClass();
                            i2 = Integer.parseInt(strOptString3);
                        } catch (NumberFormatException unused) {
                            sy2 sy2Var = sy2.f61585a;
                        }
                        iOptInt = i2;
                    }
                }
                iArr[i] = iOptInt;
            }
        }
        return new mp2(str, 1, str2);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m12506b(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, ytb ytbVar, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(ytbVar, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(ytbVar) != obj && atomicReferenceFieldUpdater.get(ytbVar) != obj) {
                return false;
            }
        }
        return true;
    }
}
