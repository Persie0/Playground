package p000;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class sa4 {

    /* JADX INFO: renamed from: a */
    public final Class f60584a;

    /* JADX INFO: renamed from: b */
    public final Object f60585b;

    /* JADX INFO: renamed from: c */
    public final Method f60586c;

    /* JADX INFO: renamed from: d */
    public final List f60587d;

    public sa4(Class cls, Object obj, Method method, ArrayList arrayList) {
        this.f60584a = cls;
        this.f60585b = obj;
        this.f60586c = method;
        this.f60587d = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        return String.format("%s.%s() %s", this.f60584a.getName(), this.f60586c.getName(), this.f60587d);
    }
}
