package tk;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: tk.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C9299c extends AbstractC9301e<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Method f48030a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Class f48031b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f48032c;

    public C9299c(Method method, Class cls, int i10) {
        this.f48030a = method;
        this.f48031b = cls;
        this.f48032c = i10;
    }

    @Override // tk.AbstractC9301e
    /* JADX INFO: renamed from: a */
    public final Object mo17646a() throws IllegalAccessException, InvocationTargetException {
        return this.f48030a.invoke(null, this.f48031b, Integer.valueOf(this.f48032c));
    }

    public final String toString() {
        return this.f48031b.getName();
    }
}
