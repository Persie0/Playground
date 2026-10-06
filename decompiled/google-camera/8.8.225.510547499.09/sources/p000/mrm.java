package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class mrm implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: h */
    public static mrm m16828h(Object obj) {
        return obj == null ? mqu.f41450a : new mrq(obj);
    }

    /* JADX INFO: renamed from: i */
    public static mrm m16829i(Object obj) {
        obj.getClass();
        return new mrq(obj);
    }

    /* JADX INFO: renamed from: a */
    public abstract mrm mo16807a(mrm mrmVar);

    /* JADX INFO: renamed from: b */
    public abstract mrm mo16808b(mrf mrfVar);

    /* JADX INFO: renamed from: c */
    public abstract Object mo16809c();

    /* JADX INFO: renamed from: d */
    public abstract Object mo16810d(msi msiVar);

    /* JADX INFO: renamed from: e */
    public abstract Object mo16811e(Object obj);

    public abstract boolean equals(Object obj);

    /* JADX INFO: renamed from: f */
    public abstract Object mo16812f();

    /* JADX INFO: renamed from: g */
    public abstract boolean mo16813g();

    public abstract int hashCode();

    public abstract String toString();
}
