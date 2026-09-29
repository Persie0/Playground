package p374s;

import dm.C5207g;

/* JADX INFO: renamed from: s.s */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8931s extends InterfaceC8901d<Float> {
    @Override // p374s.InterfaceC8901d
    /* JADX INFO: renamed from: a */
    default <V extends AbstractC8911i> C8922n0<V> mo17134a(InterfaceC8906f0<Float, V> interfaceC8906f0) {
        C5207g.m11111f(interfaceC8906f0, "converter");
        return new C8922n0<>(this);
    }

    /* JADX INFO: renamed from: b */
    float mo1385b(long j10, float f3, float f10, float f11);

    /* JADX INFO: renamed from: c */
    long mo1386c(float f3, float f10, float f11);

    /* JADX INFO: renamed from: d */
    default float mo1387d(float f3, float f10, float f11) {
        return mo1385b(mo1386c(f3, f10, f11), f3, f10, f11);
    }

    /* JADX INFO: renamed from: e */
    float mo1388e(long j10, float f3, float f10, float f11);
}
