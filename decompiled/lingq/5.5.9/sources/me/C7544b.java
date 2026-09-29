package me;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: me.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7544b {

    /* JADX INFO: renamed from: a */
    public final HashMap f41621a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final int f41622b = 64;

    /* JADX INFO: renamed from: c */
    public final int f41623c;

    public C7544b(int i10) {
        this.f41623c = i10;
    }

    /* JADX INFO: renamed from: a */
    public static String m15052a(String str, int i10) {
        if (str != null) {
            str = str.trim();
            if (str.length() > i10) {
                str = str.substring(0, i10);
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m15053b(Map<String, String> map) {
        int i10 = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key == null) {
                throw new IllegalArgumentException("Custom attribute key must not be null.");
            }
            String strM15052a = m15052a(key, this.f41623c);
            if (this.f41621a.size() < this.f41622b || this.f41621a.containsKey(strM15052a)) {
                String value = entry.getValue();
                this.f41621a.put(strM15052a, value == null ? "" : m15052a(value, this.f41623c));
            } else {
                i10++;
            }
        }
        if (i10 > 0) {
            Log.w("FirebaseCrashlytics", "Ignored " + i10 + " entries when adding custom keys. Maximum allowable: " + this.f41622b, null);
        }
    }
}
