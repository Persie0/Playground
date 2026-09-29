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
import p081e0.InterfaceC5336s0;
import p374s.C8903e;
import p423v.C9606d;
import p423v.C9608f;
import p423v.C9615m;
import p423v.InterfaceC9610h;
import p423v.InterfaceC9612j;
import p470x1.C10017e;
import sl.C9072e;

/* JADX INFO: renamed from: androidx.compose.material3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0462a {

    /* JADX INFO: renamed from: a */
    public final float f2859a;

    /* JADX INFO: renamed from: b */
    public final float f2860b;

    /* JADX INFO: renamed from: c */
    public final float f2861c;

    /* JADX INFO: renamed from: d */
    public final float f2862d;

    /* JADX INFO: renamed from: e */
    public final float f2863e;

    public C0462a(float f3, float f10, float f11, float f12, float f13) {
        this.f2859a = f3;
        this.f2860b = f10;
        this.f2861c = f11;
        this.f2862d = f12;
        this.f2863e = f13;
    }

    /* JADX INFO: renamed from: a */
    public final C8903e m1577a(boolean z10, InterfaceC9612j interfaceC9612j, InterfaceC0476a interfaceC0476a, int i10) {
        float f3;
        interfaceC0476a.mo1622c(-1312510462);
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
            objMo1624d2 = new ButtonElevation$animateElevation$1$1(interfaceC9612j, snapshotStateList, null);
            interfaceC0476a.mo1655t(objMo1624d2);
        }
        interfaceC0476a.mo1661w();
        C5333r.m11460b(interfaceC9612j, (InterfaceC2056p) objMo1624d2, interfaceC0476a);
        InterfaceC9610h interfaceC9610h = (InterfaceC9610h) C6752c.m13433a0(snapshotStateList);
        if (!z10) {
            f3 = this.f2863e;
        } else if (interfaceC9610h instanceof C9615m) {
            f3 = this.f2860b;
        } else if (interfaceC9610h instanceof C9608f) {
            f3 = this.f2862d;
        } else {
            f3 = interfaceC9610h instanceof C9606d ? this.f2861c : this.f2859a;
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
        if (z10) {
            interfaceC0476a.mo1622c(-719929769);
            C5333r.m11460b(new C10017e(f10), new ButtonElevation$animateElevation$3(c0369a, this, f10, interfaceC9610h, null), interfaceC0476a);
            interfaceC0476a.mo1661w();
        } else {
            interfaceC0476a.mo1622c(-719929912);
            C5333r.m11460b(new C10017e(f10), new ButtonElevation$animateElevation$2(c0369a, f10, null), interfaceC0476a);
            interfaceC0476a.mo1661w();
        }
        C8903e<T, V> c8903e = c0369a.f1655c;
        interfaceC0476a.mo1661w();
        return c8903e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0462a)) {
            return false;
        }
        C0462a c0462a = (C0462a) obj;
        return C10017e.m18618a(this.f2859a, c0462a.f2859a) && C10017e.m18618a(this.f2860b, c0462a.f2860b) && C10017e.m18618a(this.f2861c, c0462a.f2861c) && C10017e.m18618a(this.f2862d, c0462a.f2862d) && C10017e.m18618a(this.f2863e, c0462a.f2863e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f2863e) + C0204c.m846e(this.f2862d, C0204c.m846e(this.f2861c, C0204c.m846e(this.f2860b, Float.hashCode(this.f2859a) * 31, 31), 31), 31);
    }
}
