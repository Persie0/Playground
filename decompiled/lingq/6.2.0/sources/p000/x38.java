package p000;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* JADX INFO: loaded from: classes2.dex */
public final class x38 extends p58 {
    public x38() {
        super(15);
    }

    @Override // p000.p58
    /* JADX INFO: renamed from: d */
    public final String mo18904d(int i, Method method) {
        Parameter parameter = method.getParameters()[i];
        if (!parameter.isNamePresent()) {
            return super.mo18904d(i, method);
        }
        return "parameter '" + parameter.getName() + '\'';
    }

    @Override // p000.p58
    /* JADX INFO: renamed from: n */
    public final Object mo18908n(Class cls, Object obj, Method method, Object[] objArr) {
        return uad.m22663a(cls, obj, method, objArr);
    }

    @Override // p000.p58
    /* JADX INFO: renamed from: o */
    public final boolean mo18909o(Method method) {
        return method.isDefault();
    }
}
