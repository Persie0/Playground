package p534zf;

import com.kochava.core.json.internal.JsonType;
import org.json.JSONObject;
import p349qo.C8656b;

/* JADX INFO: renamed from: zf.c */
/* JADX INFO: loaded from: classes.dex */
public final class C10485c implements InterfaceC10486d {

    /* JADX INFO: renamed from: b */
    public static final Object f52415b = JSONObject.NULL;

    /* JADX INFO: renamed from: c */
    public static final Object f52416c = new Object();

    /* JADX INFO: renamed from: a */
    public final Object f52417a;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C10485c(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Argument cannot be null");
        }
        this.f52417a = obj;
    }

    /* JADX INFO: renamed from: b */
    public static C10485c m19439b(boolean z10) {
        return new C10485c(Boolean.valueOf(z10));
    }

    /* JADX INFO: renamed from: c */
    public static C10485c m19440c(int i10) {
        return new C10485c(Integer.valueOf(i10));
    }

    /* JADX INFO: renamed from: d */
    public static C10485c m19441d() {
        return new C10485c(f52415b);
    }

    /* JADX INFO: renamed from: e */
    public static C10485c m19442e(Object obj) {
        JsonType type = JsonType.getType(obj);
        if (obj != null && type != JsonType.Null) {
            return type == JsonType.Invalid ? new C10485c(f52416c) : new C10485c(obj);
        }
        return new C10485c(f52415b);
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC10488f m19443a() {
        return C8656b.m16887N(this.f52417a, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C10485c.class == obj.getClass()) {
            C10485c c10485c = (C10485c) obj;
            JsonType jsonTypeM19444f = m19444f();
            if (jsonTypeM19444f != c10485c.m19444f()) {
                return false;
            }
            if (jsonTypeM19444f == JsonType.Invalid || jsonTypeM19444f == JsonType.Null) {
                return true;
            }
            return C8656b.m16875B(this.f52417a, c10485c.f52417a);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final JsonType m19444f() {
        return JsonType.getType(this.f52417a);
    }

    public final int hashCode() {
        JsonType jsonTypeM19444f = m19444f();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(jsonTypeM19444f == JsonType.Invalid ? "invalid" : this.f52417a.toString());
        sb2.append(jsonTypeM19444f.toString());
        return sb2.toString().hashCode();
    }

    public final String toString() {
        return m19444f() == JsonType.Invalid ? "invalid" : this.f52417a.toString();
    }
}
