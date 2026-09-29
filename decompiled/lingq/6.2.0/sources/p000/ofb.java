package p000;

import com.google.common.collect.ImmutableSet;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ofb {

    /* JADX INFO: renamed from: d */
    public static final ImmutableSet f54285d = ImmutableSet.m6307m(new Object[]{"_syn", "_err", "_el"}, 3);

    /* JADX INFO: renamed from: a */
    public String f54286a;

    /* JADX INFO: renamed from: b */
    public final long f54287b;

    /* JADX INFO: renamed from: c */
    public final HashMap f54288c;

    public ofb(String str, long j, HashMap map) {
        this.f54286a = str;
        this.f54287b = j;
        HashMap map2 = new HashMap();
        this.f54288c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    /* JADX INFO: renamed from: e */
    public static Object m17966e(String str, Object obj, Object obj2) {
        if (f54285d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (!(obj instanceof String) && obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    /* JADX INFO: renamed from: a */
    public final long m17967a() {
        return this.f54287b;
    }

    /* JADX INFO: renamed from: b */
    public final String m17968b() {
        return this.f54286a;
    }

    /* JADX INFO: renamed from: c */
    public final HashMap m17969c() {
        return this.f54288c;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final ofb clone() {
        return new ofb(this.f54286a, this.f54287b, new HashMap(this.f54288c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofb)) {
            return false;
        }
        ofb ofbVar = (ofb) obj;
        if (this.f54287b == ofbVar.f54287b && this.f54286a.equals(ofbVar.f54286a)) {
            return this.f54288c.equals(ofbVar.f54288c);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f54286a.hashCode() * 31;
        long j = this.f54287b;
        return this.f54288c.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.f54286a;
        String string = this.f54288c.toString();
        int length = String.valueOf(str).length();
        long j = this.f54287b;
        StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(j).length() + 9 + string.length() + 1);
        sb.append("Event{name='");
        sb.append(str);
        sb.append("', timestamp=");
        sb.append(j);
        sb.append(", params=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
