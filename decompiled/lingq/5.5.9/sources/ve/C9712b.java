package ve;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: ve.b */
/* JADX INFO: loaded from: classes.dex */
public final class C9712b {

    /* JADX INFO: renamed from: a */
    public final String f49721a;

    /* JADX INFO: renamed from: b */
    public final Map<Class<?>, Object> f49722b;

    public C9712b(String str, Map<Class<?>, Object> map) {
        this.f49721a = str;
        this.f49722b = map;
    }

    /* JADX INFO: renamed from: a */
    public static C9712b m18217a(String str) {
        return new C9712b(str, Collections.emptyMap());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9712b)) {
            return false;
        }
        C9712b c9712b = (C9712b) obj;
        return this.f49721a.equals(c9712b.f49721a) && this.f49722b.equals(c9712b.f49722b);
    }

    public final int hashCode() {
        return this.f49722b.hashCode() + (this.f49721a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f49721a + ", properties=" + this.f49722b.values() + "}";
    }
}
