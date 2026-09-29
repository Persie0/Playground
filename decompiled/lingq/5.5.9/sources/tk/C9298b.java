package tk;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: tk.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C9298b extends AbstractC9301e<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Method f48027a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f48028b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Class f48029c;

    public C9298b(Method method, Object obj, Class cls) {
        this.f48027a = method;
        this.f48028b = obj;
        this.f48029c = cls;
    }

    @Override // tk.AbstractC9301e
    /* JADX INFO: renamed from: a */
    public final Object mo17646a() throws IllegalAccessException, InvocationTargetException {
        return this.f48027a.invoke(this.f48028b, this.f48029c);
    }

    public final String toString() {
        return this.f48029c.getName();
    }
}
