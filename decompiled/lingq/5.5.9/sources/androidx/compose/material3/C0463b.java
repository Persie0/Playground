package androidx.compose.material3;

import androidx.activity.result.C0204c;
import androidx.compose.animation.core.C0369a;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import kotlin.collections.C6752c;
import p081e0.C5333r;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5301c1;
import p081e0.InterfaceC5312g0;
import p081e0.InterfaceC5336s0;
import p338qd.C8573r0;
import p374s.C8903e;
import p423v.C9604b;
import p423v.C9606d;
import p423v.C9608f;
import p423v.C9615m;
import p423v.InterfaceC9610h;
import p423v.InterfaceC9612j;
import p470x1.C10017e;
import sl.C9072e;

/* JADX INFO: renamed from: androidx.compose.material3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0463b {

    /* JADX INFO: renamed from: a */
    public final float f2864a;

    /* JADX INFO: renamed from: b */
    public final float f2865b;

    /* JADX INFO: renamed from: c */
    public final float f2866c;

    /* JADX INFO: renamed from: d */
    public final float f2867d;

    /* JADX INFO: renamed from: e */
    public final float f2868e;

    /* JADX INFO: renamed from: f */
    public final float f2869f;

    public C0463b(float f3, float f10, float f11, float f12, float f13, float f14) {
        this.f2864a = f3;
        this.f2865b = f10;
        this.f2866c = f11;
        this.f2867d = f12;
        this.f2868e = f13;
        this.f2869f = f14;
    }

    /* JADX INFO: renamed from: a */
    public final C8903e m1578a(boolean z10, InterfaceC9612j interfaceC9612j, InterfaceC0476a interfaceC0476a, int i10) {
        float f3;
        interfaceC0476a.mo1622c(-1421890746);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        interfaceC0476a.mo1622c(-492369756);
        Object objMo1624d = interfaceC0476a.mo1624d();
        Object obj = InterfaceC0476a.a.f3122a;
        if (objMo1624d == obj) {
            objMo1624d = new SnapshotStateList();
            interfaceC0476a.mo1655t(objMo1624d);
        }
        interfaceC0476a.mo1661w();
        SnapshotStateList snapshotStateList = (SnapshotStateList) objMo1624d;
        interfaceC0476a.mo1622c(511388516);
        boolean zMo1665y = interfaceC0476a.mo1665y(interfaceC9612j) | interfaceC0476a.mo1665y(snapshotStateList);
        Object objMo1624d2 = interfaceC0476a.mo1624d();
        if (zMo1665y || objMo1624d2 == obj) {
            objMo1624d2 = new CardElevation$animateElevation$1$1(interfaceC9612j, snapshotStateList, null);
            interfaceC0476a.mo1655t(objMo1624d2);
        }
        interfaceC0476a.mo1661w();
        C5333r.m11460b(interfaceC9612j, (InterfaceC2056p) objMo1624d2, interfaceC0476a);
        InterfaceC9610h interfaceC9610h = (InterfaceC9610h) C6752c.m13433a0(snapshotStateList);
        if (!z10) {
            f3 = this.f2869f;
        } else if (interfaceC9610h instanceof C9615m) {
            f3 = this.f2865b;
        } else if (interfaceC9610h instanceof C9608f) {
            f3 = this.f2867d;
        } else if (interfaceC9610h instanceof C9606d) {
            f3 = this.f2866c;
        } else {
            f3 = interfaceC9610h instanceof C9604b ? this.f2868e : this.f2864a;
        }
        float f10 = f3;
        interfaceC0476a.mo1622c(-492369756);
        Object objMo1624d3 = interfaceC0476a.mo1624d();
        if (objMo1624d3 == obj) {
            objMo1624d3 = new C0369a(new C10017e(f10), VectorConvertersKt.f1628c);
            interfaceC0476a.mo1655t(objMo1624d3);
        }
        interfaceC0476a.mo1661w();
        C0369a c0369a = (C0369a) objMo1624d3;
        C5333r.m11460b(new C10017e(f10), new CardElevation$animateElevation$2(z10, c0369a, this, f10, interfaceC9610h, null), interfaceC0476a);
        C8903e<T, V> c8903e = c0369a.f1655c;
        interfaceC0476a.mo1661w();
        return c8903e;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC5301c1 m1579b(boolean z10, InterfaceC9612j interfaceC9612j, InterfaceC0476a interfaceC0476a, int i10) {
        interfaceC0476a.mo1622c(-1763481333);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        interfaceC0476a.mo1622c(-1409180589);
        if (interfaceC9612j != null) {
            interfaceC0476a.mo1661w();
            C8903e c8903eM1578a = m1578a(z10, interfaceC9612j, interfaceC0476a, (i10 & 896) | (i10 & 14) | (i10 & 112));
            interfaceC0476a.mo1661w();
            return c8903eM1578a;
        }
        interfaceC0476a.mo1622c(-492369756);
        Object objMo1624d = interfaceC0476a.mo1624d();
        if (objMo1624d == InterfaceC0476a.a.f3122a) {
            objMo1624d = C8573r0.m16684L0(new C10017e(this.f2864a));
            interfaceC0476a.mo1655t(objMo1624d);
        }
        interfaceC0476a.mo1661w();
        InterfaceC5312g0 interfaceC5312g0 = (InterfaceC5312g0) objMo1624d;
        interfaceC0476a.mo1661w();
        interfaceC0476a.mo1661w();
        return interfaceC5312g0;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC5301c1 m1580c(boolean z10, InterfaceC9612j interfaceC9612j, InterfaceC0476a interfaceC0476a, int i10) {
        interfaceC0476a.mo1622c(1757792649);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        interfaceC0476a.mo1622c(603878391);
        if (interfaceC9612j != null) {
            interfaceC0476a.mo1661w();
            C8903e c8903eM1578a = m1578a(z10, interfaceC9612j, interfaceC0476a, (i10 & 896) | (i10 & 14) | (i10 & 112));
            interfaceC0476a.mo1661w();
            return c8903eM1578a;
        }
        interfaceC0476a.mo1622c(-492369756);
        Object objMo1624d = interfaceC0476a.mo1624d();
        if (objMo1624d == InterfaceC0476a.a.f3122a) {
            objMo1624d = C8573r0.m16684L0(new C10017e(this.f2864a));
            interfaceC0476a.mo1655t(objMo1624d);
        }
        interfaceC0476a.mo1661w();
        InterfaceC5312g0 interfaceC5312g0 = (InterfaceC5312g0) objMo1624d;
        interfaceC0476a.mo1661w();
        interfaceC0476a.mo1661w();
        return interfaceC5312g0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0463b)) {
            return false;
        }
        C0463b c0463b = (C0463b) obj;
        if (C10017e.m18618a(this.f2864a, c0463b.f2864a) && C10017e.m18618a(this.f2865b, c0463b.f2865b) && C10017e.m18618a(this.f2866c, c0463b.f2866c) && C10017e.m18618a(this.f2867d, c0463b.f2867d) && C10017e.m18618a(this.f2869f, c0463b.f2869f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f2869f) + C0204c.m846e(this.f2867d, C0204c.m846e(this.f2866c, C0204c.m846e(this.f2865b, Float.hashCode(this.f2864a) * 31, 31), 31), 31);
    }
}
