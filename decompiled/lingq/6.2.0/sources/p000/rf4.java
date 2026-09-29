package p000;

import com.kochava.core.json.internal.JsonType;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class rf4 {

    /* JADX INFO: renamed from: b */
    public static final Object f59201b = JSONObject.NULL;

    /* JADX INFO: renamed from: c */
    public static final Object f59202c = new Object();

    /* JADX INFO: renamed from: a */
    public final Object f59203a;

    public rf4(Object obj) {
        if (obj != null) {
            this.f59203a = obj;
        } else {
            C3386nv.m17626m("Argument cannot be null");
            throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static rf4 m20642b(boolean z) {
        return new rf4(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: c */
    public static rf4 m20643c(int i) {
        return new rf4(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: d */
    public static rf4 m20644d() {
        return new rf4(f59201b);
    }

    /* JADX INFO: renamed from: e */
    public static rf4 m20645e(Object obj) {
        JsonType type = JsonType.getType(obj);
        if (obj == null || type == JsonType.Null) {
            return new rf4(f59201b);
        }
        return type == JsonType.Invalid ? new rf4(f59202c) : new rf4(obj);
    }

    /* JADX INFO: renamed from: a */
    public final eg4 m20646a() {
        return b34.m3215J(this.f59203a, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rf4.class != obj.getClass()) {
            return false;
        }
        Object obj2 = ((rf4) obj).f59203a;
        Object obj3 = this.f59203a;
        JsonType type = JsonType.getType(obj3);
        if (type != JsonType.getType(obj2)) {
            return false;
        }
        if (type == JsonType.Invalid || type == JsonType.Null) {
            return true;
        }
        return b34.m3254v(obj3, obj2);
    }

    public final int hashCode() {
        Object obj = this.f59203a;
        JsonType type = JsonType.getType(obj);
        StringBuilder sb = new StringBuilder();
        sb.append(type == JsonType.Invalid ? "invalid" : obj.toString());
        sb.append(type);
        return sb.toString().hashCode();
    }

    public final String toString() {
        Object obj = this.f59203a;
        return JsonType.getType(obj) == JsonType.Invalid ? "invalid" : obj.toString();
    }
}
