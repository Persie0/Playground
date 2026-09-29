package p374s;

import p374s.AbstractC8911i;

/* JADX INFO: renamed from: s.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8895a<T, V extends AbstractC8911i> {
    /* JADX INFO: renamed from: a */
    boolean mo17126a();

    /* JADX INFO: renamed from: b */
    long mo17127b();

    /* JADX INFO: renamed from: c */
    InterfaceC8906f0<T, V> mo17128c();

    /* JADX INFO: renamed from: d */
    V mo17129d(long j10);

    /* JADX INFO: renamed from: e */
    default boolean m17130e(long j10) {
        return j10 >= mo17127b();
    }

    /* JADX INFO: renamed from: f */
    T mo17131f(long j10);

    /* JADX INFO: renamed from: g */
    T mo17132g();
}
