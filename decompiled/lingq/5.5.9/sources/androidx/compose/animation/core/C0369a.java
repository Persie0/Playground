package androidx.compose.animation.core;

import ae.C0062b;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import dm.C5207g;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p260m8.C7499b;
import p338qd.C8573r0;
import p374s.AbstractC8911i;
import p374s.C8903e;
import p374s.C8908g0;
import p374s.C8936x;
import p374s.C8937y;
import p374s.InterfaceC8901d;
import p374s.InterfaceC8906f0;
import p464wl.InterfaceC9968c;
import p470x1.C10017e;
import sl.C9072e;

/* JADX INFO: renamed from: androidx.compose.animation.core.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0369a<T, V extends AbstractC8911i> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8906f0<T, V> f1653a;

    /* JADX INFO: renamed from: b */
    public final T f1654b;

    /* JADX INFO: renamed from: c */
    public final C8903e<T, V> f1655c;

    /* JADX INFO: renamed from: d */
    public final ParcelableSnapshotMutableState f1656d;

    /* JADX INFO: renamed from: e */
    public final ParcelableSnapshotMutableState f1657e;

    /* JADX INFO: renamed from: f */
    public final C0371c f1658f;

    /* JADX INFO: renamed from: g */
    public final V f1659g;

    /* JADX INFO: renamed from: h */
    public final V f1660h;

    /* JADX INFO: renamed from: i */
    public final V f1661i;

    /* JADX INFO: renamed from: j */
    public final V f1662j;

    /* JADX WARN: Multi-variable type inference failed */
    public C0369a(Comparable comparable, C8908g0 c8908g0, Object obj, String str) {
        C5207g.m11111f(c8908g0, "typeConverter");
        C5207g.m11111f(str, "label");
        this.f1653a = c8908g0;
        this.f1654b = obj;
        this.f1655c = new C8903e<>(c8908g0, comparable, null, 60);
        this.f1656d = C8573r0.m16684L0(Boolean.FALSE);
        this.f1657e = C8573r0.m16684L0(comparable);
        this.f1658f = new C0371c();
        new C8936x(obj, 3);
        V v10 = (V) c8908g0.mo17140a().mo528n(comparable);
        int iMo17136b = v10.mo17136b();
        for (int i10 = 0; i10 < iMo17136b; i10++) {
            v10.mo17139e(i10, Float.NEGATIVE_INFINITY);
        }
        this.f1659g = v10;
        V vMo528n = this.f1653a.mo17140a().mo528n(comparable);
        int iMo17136b2 = vMo528n.mo17136b();
        for (int i11 = 0; i11 < iMo17136b2; i11++) {
            vMo528n.mo17139e(i11, Float.POSITIVE_INFINITY);
        }
        this.f1660h = vMo528n;
        this.f1661i = v10;
        this.f1662j = vMo528n;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0369a(C10017e c10017e, C8908g0 c8908g0) {
        this(c10017e, c8908g0, null, "Animatable");
        C5207g.m11111f(c8908g0, "typeConverter");
    }

    /* JADX INFO: renamed from: a */
    public static final Object m1381a(C0369a c0369a, Object obj) {
        V v10 = c0369a.f1659g;
        V v11 = c0369a.f1661i;
        boolean zM11106a = C5207g.m11106a(v11, v10);
        V v12 = c0369a.f1662j;
        if (zM11106a && C5207g.m11106a(v12, c0369a.f1660h)) {
            return obj;
        }
        InterfaceC8906f0<T, V> interfaceC8906f0 = c0369a.f1653a;
        V vMo528n = interfaceC8906f0.mo17140a().mo528n(obj);
        int iMo17136b = vMo528n.mo17136b();
        boolean z10 = false;
        for (int i10 = 0; i10 < iMo17136b; i10++) {
            if (vMo528n.mo17135a(i10) < v11.mo17135a(i10) || vMo528n.mo17135a(i10) > v12.mo17135a(i10)) {
                vMo528n.mo17139e(i10, C0062b.m357j0(vMo528n.mo17135a(i10), v11.mo17135a(i10), v12.mo17135a(i10)));
                z10 = true;
            }
        }
        return z10 ? interfaceC8906f0.mo17141b().mo528n(vMo528n) : obj;
    }

    /* JADX INFO: renamed from: b */
    public static Object m1382b(C0369a c0369a, Comparable comparable, InterfaceC8901d interfaceC8901d, InterfaceC9968c interfaceC9968c) {
        T tMo528n = c0369a.f1653a.mo17141b().mo528n(c0369a.f1655c.f46800c);
        Object objM1383c = c0369a.m1383c();
        C5207g.m11111f(interfaceC8901d, "animationSpec");
        InterfaceC8906f0<T, V> interfaceC8906f0 = c0369a.f1653a;
        C5207g.m11111f(interfaceC8906f0, "typeConverter");
        Animatable$runAnimation$2 animatable$runAnimation$2 = new Animatable$runAnimation$2(c0369a, tMo528n, new C8937y(interfaceC8901d, interfaceC8906f0, objM1383c, comparable, interfaceC8906f0.mo17140a().mo528n(tMo528n)), c0369a.f1655c.f46801d, null, null);
        MutatePriority mutatePriority = MutatePriority.Default;
        C0371c c0371c = c0369a.f1658f;
        c0371c.getClass();
        return C7499b.m14963s(new MutatorMutex$mutate$2(mutatePriority, c0371c, animatable$runAnimation$2, null), interfaceC9968c);
    }

    /* JADX INFO: renamed from: c */
    public final T m1383c() {
        return this.f1655c.getValue();
    }

    /* JADX INFO: renamed from: d */
    public final Object m1384d(C10017e c10017e, InterfaceC9968c interfaceC9968c) throws Throwable {
        Animatable$snapTo$2 animatable$snapTo$2 = new Animatable$snapTo$2(this, c10017e, null);
        MutatePriority mutatePriority = MutatePriority.Default;
        C0371c c0371c = this.f1658f;
        c0371c.getClass();
        Object objM14963s = C7499b.m14963s(new MutatorMutex$mutate$2(mutatePriority, c0371c, animatable$snapTo$2, null), interfaceC9968c);
        return objM14963s == CoroutineSingletons.COROUTINE_SUSPENDED ? objM14963s : C9072e.f47360a;
    }
}
