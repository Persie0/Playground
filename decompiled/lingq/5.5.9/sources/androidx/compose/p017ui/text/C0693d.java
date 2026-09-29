package androidx.compose.p017ui.text;

import androidx.activity.result.C0204c;
import androidx.compose.p017ui.text.font.AbstractC0696b;
import androidx.compose.p017ui.unit.LayoutDirection;
import dm.C5207g;
import java.util.List;
import p003a2.C0009a;
import p231l1.C7213g;
import p231l1.C7218l;
import p470x1.C10013a;
import p470x1.InterfaceC10015c;

/* JADX INFO: renamed from: androidx.compose.ui.text.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0693d {

    /* JADX INFO: renamed from: a */
    public final C0689a f4564a;

    /* JADX INFO: renamed from: b */
    public final C7218l f4565b;

    /* JADX INFO: renamed from: c */
    public final List<C0689a.b<C7213g>> f4566c;

    /* JADX INFO: renamed from: d */
    public final int f4567d;

    /* JADX INFO: renamed from: e */
    public final boolean f4568e;

    /* JADX INFO: renamed from: f */
    public final int f4569f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC10015c f4570g;

    /* JADX INFO: renamed from: h */
    public final LayoutDirection f4571h;

    /* JADX INFO: renamed from: i */
    public final AbstractC0696b.a f4572i;

    /* JADX INFO: renamed from: j */
    public final long f4573j;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C0693d() {
        throw null;
    }

    public C0693d(C0689a c0689a, C7218l c7218l, List list, int i10, boolean z10, int i11, InterfaceC10015c interfaceC10015c, LayoutDirection layoutDirection, AbstractC0696b.a aVar, long j10) {
        this.f4564a = c0689a;
        this.f4565b = c7218l;
        this.f4566c = list;
        this.f4567d = i10;
        this.f4568e = z10;
        this.f4569f = i11;
        this.f4570g = interfaceC10015c;
        this.f4571h = layoutDirection;
        this.f4572i = aVar;
        this.f4573j = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0693d)) {
            return false;
        }
        C0693d c0693d = (C0693d) obj;
        if (C5207g.m11106a(this.f4564a, c0693d.f4564a) && C5207g.m11106a(this.f4565b, c0693d.f4565b) && C5207g.m11106a(this.f4566c, c0693d.f4566c) && this.f4567d == c0693d.f4567d && this.f4568e == c0693d.f4568e) {
            if ((this.f4569f == c0693d.f4569f) && C5207g.m11106a(this.f4570g, c0693d.f4570g) && this.f4571h == c0693d.f4571h && C5207g.m11106a(this.f4572i, c0693d.f4572i) && C10013a.m18597b(this.f4573j, c0693d.f4573j)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4573j) + ((this.f4572i.hashCode() + ((this.f4571h.hashCode() + ((this.f4570g.hashCode() + C0009a.m16d(this.f4569f, (Boolean.hashCode(this.f4568e) + ((C0204c.m848g(this.f4566c, (this.f4565b.hashCode() + (this.f4564a.hashCode() * 31)) * 31, 31) + this.f4567d) * 31)) * 31, 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("TextLayoutInput(text=");
        sb2.append((Object) this.f4564a);
        sb2.append(", style=");
        sb2.append(this.f4565b);
        sb2.append(", placeholders=");
        sb2.append(this.f4566c);
        sb2.append(", maxLines=");
        sb2.append(this.f4567d);
        sb2.append(", softWrap=");
        sb2.append(this.f4568e);
        sb2.append(", overflow=");
        int i10 = this.f4569f;
        boolean z10 = false;
        if (i10 == 1) {
            str = "Clip";
        } else {
            if (i10 == 2) {
                str = "Ellipsis";
            } else {
                if (i10 == 3) {
                    z10 = true;
                }
                str = z10 ? "Visible" : "Invalid";
            }
        }
        sb2.append((Object) str);
        sb2.append(", density=");
        sb2.append(this.f4570g);
        sb2.append(", layoutDirection=");
        sb2.append(this.f4571h);
        sb2.append(", fontFamilyResolver=");
        sb2.append(this.f4572i);
        sb2.append(", constraints=");
        sb2.append((Object) C10013a.m18606k(this.f4573j));
        sb2.append(')');
        return sb2.toString();
    }
}
