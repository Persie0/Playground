package p000;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class c31 {

    /* JADX INFO: renamed from: a */
    public final int f9385a;

    /* JADX INFO: renamed from: b */
    public final Method f9386b;

    public c31(int i, Method method) {
        this.f9385a = i;
        this.f9386b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c31)) {
            return false;
        }
        c31 c31Var = (c31) obj;
        return this.f9385a == c31Var.f9385a && this.f9386b.getName().equals(c31Var.f9386b.getName());
    }

    public final int hashCode() {
        return this.f9386b.getName().hashCode() + (this.f9385a * 31);
    }
}
