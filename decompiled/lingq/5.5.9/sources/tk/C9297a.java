package tk;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: tk.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C9297a extends AbstractC9301e<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Constructor f48025a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Class f48026b;

    public C9297a(Constructor constructor, Class cls) {
        this.f48025a = constructor;
        this.f48026b = cls;
    }

    @Override // tk.AbstractC9301e
    /* JADX INFO: renamed from: a */
    public final Object mo17646a() throws IllegalAccessException, InstantiationException, InvocationTargetException {
        return this.f48025a.newInstance(null);
    }

    public final String toString() {
        return this.f48026b.getName();
    }
}
