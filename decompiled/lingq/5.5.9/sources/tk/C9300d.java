package tk;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: tk.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C9300d extends AbstractC9301e<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Method f48033a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Class f48034b;

    public C9300d(Method method, Class cls) {
        this.f48033a = method;
        this.f48034b = cls;
    }

    @Override // tk.AbstractC9301e
    /* JADX INFO: renamed from: a */
    public final Object mo17646a() throws IllegalAccessException, InvocationTargetException {
        return this.f48033a.invoke(null, this.f48034b, Object.class);
    }

    public final String toString() {
        return this.f48034b.getName();
    }
}
