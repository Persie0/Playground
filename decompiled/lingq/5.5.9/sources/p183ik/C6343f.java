package p183ik;

import android.graphics.Rect;
import android.view.ViewGroup;
import cm.InterfaceC2041a;
import com.lingq.p055ui.tooltips.TooltipStep;
import dm.C5207g;
import sl.C9072e;

/* JADX INFO: renamed from: ik.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C6343f {

    /* JADX INFO: renamed from: a */
    public final TooltipStep f36654a;

    /* JADX INFO: renamed from: b */
    public final Rect f36655b;

    /* JADX INFO: renamed from: c */
    public final Rect f36656c;

    /* JADX INFO: renamed from: d */
    public final ViewGroup f36657d;

    /* JADX INFO: renamed from: e */
    public final boolean f36658e;

    /* JADX INFO: renamed from: f */
    public final boolean f36659f;

    /* JADX INFO: renamed from: g */
    public final boolean f36660g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC2041a<C9072e> f36661h;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C6343f() {
        throw null;
    }

    public C6343f(TooltipStep tooltipStep, Rect rect, Rect rect2, boolean z10, boolean z11, boolean z12, InterfaceC2041a interfaceC2041a) {
        C5207g.m11111f(tooltipStep, "step");
        C5207g.m11111f(rect, "viewRect");
        C5207g.m11111f(rect2, "tooltipRect");
        C5207g.m11111f(interfaceC2041a, "action");
        this.f36654a = tooltipStep;
        this.f36655b = rect;
        this.f36656c = rect2;
        this.f36657d = null;
        this.f36658e = z10;
        this.f36659f = z11;
        this.f36660g = z12;
        this.f36661h = interfaceC2041a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6343f)) {
            return false;
        }
        C6343f c6343f = (C6343f) obj;
        return this.f36654a == c6343f.f36654a && C5207g.m11106a(this.f36655b, c6343f.f36655b) && C5207g.m11106a(this.f36656c, c6343f.f36656c) && C5207g.m11106a(this.f36657d, c6343f.f36657d) && this.f36658e == c6343f.f36658e && this.f36659f == c6343f.f36659f && this.f36660g == c6343f.f36660g && C5207g.m11106a(this.f36661h, c6343f.f36661h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final int hashCode() {
        int iHashCode = (this.f36656c.hashCode() + ((this.f36655b.hashCode() + (this.f36654a.hashCode() * 31)) * 31)) * 31;
        ViewGroup viewGroup = this.f36657d;
        int iHashCode2 = (iHashCode + (viewGroup == null ? 0 : viewGroup.hashCode())) * 31;
        ?? r10 = 1;
        boolean z10 = this.f36658e;
        ?? r11 = z10;
        if (z10) {
            r11 = 1;
        }
        int i10 = (iHashCode2 + r11) * 31;
        boolean z11 = this.f36659f;
        ?? r12 = z11;
        if (z11) {
            r12 = 1;
        }
        int i11 = (i10 + r12) * 31;
        boolean z12 = this.f36660g;
        if (!z12) {
            r10 = z12;
        }
        return this.f36661h.hashCode() + ((i11 + r10) * 31);
    }

    public final String toString() {
        return "TooltipData(step=" + this.f36654a + ", viewRect=" + this.f36655b + ", tooltipRect=" + this.f36656c + ", parentView=" + this.f36657d + ", withOverlay=" + this.f36658e + ", centered=" + this.f36659f + ", tooltipFloat=" + this.f36660g + ", action=" + this.f36661h + ")";
    }
}
