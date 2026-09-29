package jp;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: jp.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C6541i {

    /* JADX INFO: renamed from: a */
    public final Method f37219a;

    /* JADX INFO: renamed from: b */
    public final List<?> f37220b;

    public C6541i(Method method, ArrayList arrayList) {
        this.f37219a = method;
        this.f37220b = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        Method method = this.f37219a;
        return String.format("%s.%s() %s", method.getDeclaringClass().getName(), method.getName(), this.f37220b);
    }
}
