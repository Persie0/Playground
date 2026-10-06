package p000;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
final class akj {

    /* JADX INFO: renamed from: a */
    final int f587a;

    /* JADX INFO: renamed from: b */
    final Method f588b;

    public akj(int i, Method method) {
        this.f587a = i;
        this.f588b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akj)) {
            return false;
        }
        akj akjVar = (akj) obj;
        return this.f587a == akjVar.f587a && this.f588b.getName().equals(akjVar.f588b.getName());
    }

    public final int hashCode() {
        return (this.f587a * 31) + this.f588b.getName().hashCode();
    }
}
