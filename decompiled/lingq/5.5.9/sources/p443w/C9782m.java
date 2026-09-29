package p443w;

import androidx.activity.result.C0204c;
import androidx.compose.p017ui.unit.LayoutDirection;
import dm.C5207g;
import p470x1.C10017e;

/* JADX INFO: renamed from: w.m */
/* JADX INFO: loaded from: classes.dex */
public final class C9782m implements InterfaceC9781l {

    /* JADX INFO: renamed from: a */
    public final float f49867a;

    /* JADX INFO: renamed from: b */
    public final float f49868b;

    /* JADX INFO: renamed from: c */
    public final float f49869c;

    /* JADX INFO: renamed from: d */
    public final float f49870d;

    public C9782m(float f3, float f10, float f11, float f12) {
        this.f49867a = f3;
        this.f49868b = f10;
        this.f49869c = f11;
        this.f49870d = f12;
    }

    @Override // p443w.InterfaceC9781l
    /* JADX INFO: renamed from: a */
    public final float mo18274a() {
        return this.f49870d;
    }

    @Override // p443w.InterfaceC9781l
    /* JADX INFO: renamed from: b */
    public final float mo18275b(LayoutDirection layoutDirection) {
        C5207g.m11111f(layoutDirection, "layoutDirection");
        return layoutDirection == LayoutDirection.Ltr ? this.f49867a : this.f49869c;
    }

    @Override // p443w.InterfaceC9781l
    /* JADX INFO: renamed from: c */
    public final float mo18276c(LayoutDirection layoutDirection) {
        C5207g.m11111f(layoutDirection, "layoutDirection");
        return layoutDirection == LayoutDirection.Ltr ? this.f49869c : this.f49867a;
    }

    @Override // p443w.InterfaceC9781l
    /* JADX INFO: renamed from: d */
    public final float mo18277d() {
        return this.f49868b;
    }

    public final boolean equals(Object obj) {
        boolean z10 = false;
        if (!(obj instanceof C9782m)) {
            return false;
        }
        C9782m c9782m = (C9782m) obj;
        if (C10017e.m18618a(this.f49867a, c9782m.f49867a) && C10017e.m18618a(this.f49868b, c9782m.f49868b) && C10017e.m18618a(this.f49869c, c9782m.f49869c) && C10017e.m18618a(this.f49870d, c9782m.f49870d)) {
            z10 = true;
        }
        return z10;
    }

    public final int hashCode() {
        return Float.hashCode(this.f49870d) + C0204c.m846e(this.f49869c, C0204c.m846e(this.f49868b, Float.hashCode(this.f49867a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) C10017e.m18619f(this.f49867a)) + ", top=" + ((Object) C10017e.m18619f(this.f49868b)) + ", end=" + ((Object) C10017e.m18619f(this.f49869c)) + ", bottom=" + ((Object) C10017e.m18619f(this.f49870d)) + ')';
    }
}
