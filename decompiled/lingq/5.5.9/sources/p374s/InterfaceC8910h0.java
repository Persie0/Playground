package p374s;

import dm.C5207g;
import p374s.AbstractC8911i;

/* JADX INFO: renamed from: s.h0 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8910h0<V extends AbstractC8911i> {
    /* JADX INFO: renamed from: a */
    void mo17142a();

    /* JADX INFO: renamed from: b */
    long mo17143b(V v10, V v11, V v12);

    /* JADX INFO: renamed from: c */
    V mo17144c(long j10, V v10, V v11, V v12);

    /* JADX INFO: renamed from: d */
    V mo17145d(long j10, V v10, V v11, V v12);

    /* JADX INFO: renamed from: e */
    default V mo17146e(V v10, V v11, V v12) {
        C5207g.m11111f(v10, "initialValue");
        C5207g.m11111f(v11, "targetValue");
        return (V) mo17144c(mo17143b(v10, v11, v12), v10, v11, v12);
    }
}
