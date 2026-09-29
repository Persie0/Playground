package androidx.datastore.migrations;

import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractC3194a;
import p000.AbstractC3393o1;
import p000.gm5;
import p000.u91;

/* JADX INFO: loaded from: classes2.dex */
public final class SharedPreferencesView {
    private final Set<String> keySet;
    private final SharedPreferences prefs;

    public SharedPreferencesView(SharedPreferences sharedPreferences, Set<String> set) {
        sharedPreferences.getClass();
        this.prefs = sharedPreferences;
        this.keySet = set;
    }

    private final String checkKey(String str) {
        Set<String> set = this.keySet;
        if (set == null || set.contains(str)) {
            return str;
        }
        gm5.m12751g(AbstractC3393o1.m17734i("Can't access key outside migration: ", str));
        return null;
    }

    public static /* synthetic */ String getString$default(SharedPreferencesView sharedPreferencesView, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return sharedPreferencesView.getString(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Set getStringSet$default(SharedPreferencesView sharedPreferencesView, String str, Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            set = null;
        }
        return sharedPreferencesView.getStringSet(str, set);
    }

    public final boolean contains(String str) {
        str.getClass();
        return this.prefs.contains(checkKey(str));
    }

    public final Map<String, Object> getAll() {
        Map<String, ?> all = this.prefs.getAll();
        all.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Set<String> set = this.keySet;
            if (set != null ? set.contains(key) : true) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC3194a.m15363P(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key2 = entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Set) {
                value = u91.m22627s1((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        return linkedHashMap2;
    }

    public final boolean getBoolean(String str, boolean z) {
        str.getClass();
        return this.prefs.getBoolean(checkKey(str), z);
    }

    public final float getFloat(String str, float f) {
        str.getClass();
        return this.prefs.getFloat(checkKey(str), f);
    }

    public final int getInt(String str, int i) {
        str.getClass();
        return this.prefs.getInt(checkKey(str), i);
    }

    public final long getLong(String str, long j) {
        str.getClass();
        return this.prefs.getLong(checkKey(str), j);
    }

    public final String getString(String str, String str2) {
        str.getClass();
        return this.prefs.getString(checkKey(str), str2);
    }

    public final Set<String> getStringSet(String str, Set<String> set) {
        str.getClass();
        Set<String> stringSet = this.prefs.getStringSet(checkKey(str), set);
        if (stringSet != null) {
            return u91.m22626r1(stringSet);
        }
        return null;
    }
}
