package p000;

import android.os.Bundle;
import java.util.HashSet;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public final class i80 {

    /* JADX INFO: renamed from: b */
    public static boolean f43674b;

    /* JADX INFO: renamed from: a */
    public static final i80 f43673a = new i80();

    /* JADX INFO: renamed from: c */
    public static HashSet f43675c = new HashSet();

    /* JADX INFO: renamed from: a */
    public static final void m13716a(Bundle bundle) {
        if (lp1.f49971a.contains(i80.class)) {
            return;
        }
        try {
            if (f43674b && bundle != null) {
                JSONArray jSONArray = new JSONArray();
                for (String str : f43675c) {
                    if (bundle.containsKey(str)) {
                        bundle.remove(str);
                        jSONArray.put(str);
                    }
                }
                if (jSONArray.length() > 0) {
                    bundle.putString("_bannedParams", jSONArray.toString());
                }
            }
        } catch (Throwable th) {
            lp1.m16420a(i80.class, th);
        }
    }
}
