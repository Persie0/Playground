package p000;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class rb1 extends tb1 {
    /* JADX INFO: renamed from: f */
    public static tb1 m20563f(int i) {
        if (i < 0) {
            return tb1.f62091b;
        }
        return i > 0 ? tb1.f62092c : tb1.f62090a;
    }

    @Override // p000.tb1
    /* JADX INFO: renamed from: a */
    public final tb1 mo20564a(int i, int i2) {
        return m20563f(Integer.compare(i, i2));
    }

    @Override // p000.tb1
    /* JADX INFO: renamed from: b */
    public final tb1 mo20565b(Object obj, Object obj2, Comparator comparator) {
        return m20563f(comparator.compare(obj, obj2));
    }

    @Override // p000.tb1
    /* JADX INFO: renamed from: c */
    public final tb1 mo20566c(boolean z, boolean z2) {
        return m20563f(Boolean.compare(z, z2));
    }

    @Override // p000.tb1
    /* JADX INFO: renamed from: d */
    public final tb1 mo20567d(boolean z, boolean z2) {
        return m20563f(Boolean.compare(z2, z));
    }

    @Override // p000.tb1
    /* JADX INFO: renamed from: e */
    public final int mo20568e() {
        return 0;
    }
}
