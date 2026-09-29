package p374s;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import cm.InterfaceC2041a;
import dm.C5207g;
import p338qd.C8573r0;
import p374s.AbstractC8911i;
import sl.C9072e;

/* JADX INFO: renamed from: s.c */
/* JADX INFO: loaded from: classes.dex */
public final class C8899c<T, V extends AbstractC8911i> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8906f0<T, V> f46787a;

    /* JADX INFO: renamed from: b */
    public final T f46788b;

    /* JADX INFO: renamed from: c */
    public final long f46789c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2041a<C9072e> f46790d;

    /* JADX INFO: renamed from: e */
    public final ParcelableSnapshotMutableState f46791e;

    /* JADX INFO: renamed from: f */
    public V f46792f;

    /* JADX INFO: renamed from: g */
    public long f46793g;

    /* JADX INFO: renamed from: h */
    public long f46794h;

    /* JADX INFO: renamed from: i */
    public final ParcelableSnapshotMutableState f46795i;

    /* JADX WARN: Multi-variable type inference failed */
    public C8899c(Object obj, InterfaceC8906f0 interfaceC8906f0, AbstractC8911i abstractC8911i, long j10, Object obj2, long j11, InterfaceC2041a interfaceC2041a) {
        C5207g.m11111f(interfaceC8906f0, "typeConverter");
        C5207g.m11111f(abstractC8911i, "initialVelocityVector");
        this.f46787a = interfaceC8906f0;
        this.f46788b = obj2;
        this.f46789c = j11;
        this.f46790d = interfaceC2041a;
        this.f46791e = C8573r0.m16684L0(obj);
        this.f46792f = (V) C8573r0.m16709Y(abstractC8911i);
        this.f46793g = j10;
        this.f46794h = Long.MIN_VALUE;
        this.f46795i = C8573r0.m16684L0(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: a */
    public final T m17133a() {
        return this.f46791e.getValue();
    }
}
