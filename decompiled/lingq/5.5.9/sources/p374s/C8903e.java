package p374s;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import dm.C5207g;
import dm.C5212l;
import p081e0.InterfaceC5301c1;
import p338qd.C8573r0;
import p374s.AbstractC8911i;

/* JADX INFO: renamed from: s.e */
/* JADX INFO: loaded from: classes.dex */
public final class C8903e<T, V extends AbstractC8911i> implements InterfaceC5301c1<T> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8906f0<T, V> f46798a;

    /* JADX INFO: renamed from: b */
    public final ParcelableSnapshotMutableState f46799b;

    /* JADX INFO: renamed from: c */
    public V f46800c;

    /* JADX INFO: renamed from: d */
    public long f46801d;

    /* JADX INFO: renamed from: e */
    public long f46802e;

    /* JADX INFO: renamed from: f */
    public boolean f46803f;

    public C8903e(InterfaceC8906f0<T, V> interfaceC8906f0, T t10, V v10, long j10, long j11, boolean z10) {
        C5207g.m11111f(interfaceC8906f0, "typeConverter");
        this.f46798a = interfaceC8906f0;
        this.f46799b = C8573r0.m16684L0(t10);
        this.f46800c = v10 != null ? (V) C8573r0.m16709Y(v10) : (V) C5212l.m11135G(interfaceC8906f0, t10);
        this.f46801d = j10;
        this.f46802e = j11;
        this.f46803f = z10;
    }

    public /* synthetic */ C8903e(C8908g0 c8908g0, Comparable comparable, AbstractC8911i abstractC8911i, int i10) {
        this(c8908g0, comparable, (i10 & 4) != 0 ? null : abstractC8911i, (i10 & 8) != 0 ? Long.MIN_VALUE : 0L, (i10 & 16) != 0 ? Long.MIN_VALUE : 0L, false);
    }

    @Override // p081e0.InterfaceC5301c1
    public final T getValue() {
        return this.f46799b.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + getValue() + ", velocity=" + this.f46798a.mo17141b().mo528n(this.f46800c) + ", isRunning=" + this.f46803f + ", lastFrameTimeNanos=" + this.f46801d + ", finishedTimeNanos=" + this.f46802e + ')';
    }
}
