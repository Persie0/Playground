package p000;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c33 {

    /* JADX INFO: renamed from: a */
    public final String f9387a;

    /* JADX INFO: renamed from: b */
    public final Map f9388b;

    public c33(String str, Map map) {
        this.f9387a = str;
        this.f9388b = map;
    }

    /* JADX INFO: renamed from: a */
    public static bl2 m4295a(String str) {
        return new bl2(str);
    }

    /* JADX INFO: renamed from: c */
    public static c33 m4296c(String str) {
        return new c33(str, Collections.EMPTY_MAP);
    }

    /* JADX INFO: renamed from: b */
    public final Annotation m4297b(Class cls) {
        return (Annotation) this.f9388b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c33)) {
            return false;
        }
        c33 c33Var = (c33) obj;
        return this.f9387a.equals(c33Var.f9387a) && this.f9388b.equals(c33Var.f9388b);
    }

    public final int hashCode() {
        return this.f9388b.hashCode() + (this.f9387a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f9387a + ", properties=" + this.f9388b.values() + "}";
    }
}
