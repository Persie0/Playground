package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jao {

    /* JADX INFO: renamed from: a */
    public final Map f33610a;

    /* JADX INFO: renamed from: b */
    public final long f33611b;

    /* JADX INFO: renamed from: c */
    public final long f33612c;

    /* JADX INFO: renamed from: d */
    public final int f33613d;

    /* JADX INFO: renamed from: e */
    public final boolean f33614e;

    public jao(izr izrVar, Map map, long j, boolean z, long j2, int i) {
        String strM12786a;
        String strM12786a2;
        jib.m13205j(map);
        this.f33612c = j;
        this.f33614e = z;
        this.f33611b = j2;
        this.f33613d = i;
        Collections.emptyList();
        TextUtils.isEmpty(null);
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (m12788c(entry.getKey()) && (strM12786a2 = m12786a(izrVar, entry.getKey())) != null) {
                map2.put(strM12786a2, m12787b(izrVar, entry.getValue()));
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (!m12788c(entry2.getKey()) && (strM12786a = m12786a(izrVar, entry2.getKey())) != null) {
                map2.put(strM12786a, m12787b(izrVar, entry2.getValue()));
            }
        }
        if (!TextUtils.isEmpty(null)) {
            throw null;
        }
        this.f33610a = Collections.unmodifiableMap(map2);
    }

    /* JADX INFO: renamed from: a */
    private static String m12786a(izr izrVar, Object obj) {
        if (obj == null) {
            return null;
        }
        String string = obj.toString();
        if (string.startsWith("&")) {
            string = string.substring(1);
        }
        int length = string.length();
        if (length > 256) {
            string = string.substring(0, 256);
            izrVar.m11941v("Hit param name is too long and will be trimmed", Integer.valueOf(length), string);
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }

    /* JADX INFO: renamed from: c */
    private static boolean m12788c(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj.toString().startsWith("&");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ht=");
        sb.append(this.f33612c);
        if (this.f33611b != 0) {
            sb.append(", dbId=");
            sb.append(this.f33611b);
        }
        if (this.f33613d != 0) {
            sb.append(", appUID=");
            sb.append(this.f33613d);
        }
        ArrayList arrayList = new ArrayList(this.f33610a.keySet());
        Collections.sort(arrayList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            sb.append(", ");
            sb.append(str);
            sb.append("=");
            sb.append((String) this.f33610a.get(str));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    private static String m12787b(izr izrVar, Object obj) {
        String string = obj == null ? "" : obj.toString();
        int length = string.length();
        if (length <= 8192) {
            return string;
        }
        String strSubstring = string.substring(0, 8192);
        izrVar.m11941v("Hit param value is too long and will be trimmed", Integer.valueOf(length), strSubstring);
        return strSubstring;
    }
}
