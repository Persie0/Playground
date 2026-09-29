package p519z;

import ae.C0062b;
import androidx.compose.p017ui.text.C0689a;
import androidx.compose.p017ui.text.C0692c;
import androidx.compose.p017ui.text.C0693d;
import androidx.compose.p017ui.text.C0694e;
import androidx.compose.p017ui.text.MultiParagraphIntrinsics;
import androidx.compose.p017ui.text.font.AbstractC0696b;
import androidx.compose.p017ui.unit.LayoutDirection;
import dm.C5207g;
import dm.C5212l;
import java.util.List;
import kotlin.collections.EmptyList;
import p231l1.C7213g;
import p231l1.C7216j;
import p231l1.C7218l;
import p385sf.C9000b;
import p470x1.C10013a;
import p470x1.C10014b;
import p470x1.InterfaceC10015c;

/* JADX INFO: renamed from: z.b */
/* JADX INFO: loaded from: classes.dex */
public final class C10423b {

    /* JADX INFO: renamed from: a */
    public final C0689a f52258a;

    /* JADX INFO: renamed from: b */
    public final C7218l f52259b;

    /* JADX INFO: renamed from: c */
    public final int f52260c;

    /* JADX INFO: renamed from: d */
    public final int f52261d;

    /* JADX INFO: renamed from: e */
    public final boolean f52262e;

    /* JADX INFO: renamed from: f */
    public final int f52263f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC10015c f52264g;

    /* JADX INFO: renamed from: h */
    public final AbstractC0696b.a f52265h;

    /* JADX INFO: renamed from: i */
    public final List<C0689a.b<C7213g>> f52266i;

    /* JADX INFO: renamed from: j */
    public MultiParagraphIntrinsics f52267j;

    /* JADX INFO: renamed from: k */
    public LayoutDirection f52268k;

    public C10423b(C0689a c0689a, C7218l c7218l, int i10, int i11, boolean z10, int i12, InterfaceC10015c interfaceC10015c, AbstractC0696b.a aVar) {
        this(c0689a, c7218l, i10, i11, z10, i12, interfaceC10015c, aVar, EmptyList.f38032a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C10423b(C0689a c0689a, C7218l c7218l, int i10, int i11, boolean z10, int i12, InterfaceC10015c interfaceC10015c, AbstractC0696b.a aVar, List list) {
        this.f52258a = c0689a;
        this.f52259b = c7218l;
        this.f52260c = i10;
        this.f52261d = i11;
        this.f52262e = z10;
        this.f52263f = i12;
        this.f52264g = interfaceC10015c;
        this.f52265h = aVar;
        this.f52266i = list;
        boolean z11 = true;
        if (!(i10 > 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(i11 > 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (i11 > i10) {
            z11 = false;
        }
        if (!z11) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:65:0x0129  */
    /* JADX WARN: Code duplicated, block: B:78:0x0149  */
    /* JADX INFO: renamed from: a */
    public final C7216j m19401a(long j10, LayoutDirection layoutDirection, C7216j c7216j) {
        boolean z10;
        boolean z11;
        boolean z12;
        C5207g.m11111f(layoutDirection, "layoutDirection");
        int i10 = this.f52260c;
        boolean z13 = this.f52262e;
        int i11 = this.f52263f;
        if (c7216j != null) {
            C0689a c0689a = this.f52258a;
            C5207g.m11111f(c0689a, "text");
            C7218l c7218l = this.f52259b;
            C5207g.m11111f(c7218l, "style");
            List<C0689a.b<C7213g>> list = this.f52266i;
            C5207g.m11111f(list, "placeholders");
            InterfaceC10015c interfaceC10015c = this.f52264g;
            C5207g.m11111f(interfaceC10015c, "density");
            AbstractC0696b.a aVar = this.f52265h;
            C5207g.m11111f(aVar, "fontFamilyResolver");
            C0692c c0692c = c7216j.f40591b;
            boolean zMo2562a = c0692c.f4556a.mo2562a();
            C0693d c0693d = c7216j.f40590a;
            if (!zMo2562a && C5207g.m11106a(c0693d.f4564a, c0689a)) {
                C7218l c7218l2 = c0693d.f4565b;
                c7218l2.getClass();
                if ((c7218l2 == c7218l || (C5207g.m11106a(c7218l2.f40601b, c7218l.f40601b) && c7218l2.f40600a.m14530c(c7218l.f40600a))) && C5207g.m11106a(c0693d.f4566c, list) && c0693d.f4567d == i10 && c0693d.f4568e == z13) {
                    if ((c0693d.f4569f == i11) && C5207g.m11106a(c0693d.f4570g, interfaceC10015c) && c0693d.f4571h == layoutDirection && C5207g.m11106a(c0693d.f4572i, aVar)) {
                        int iM18605j = C10013a.m18605j(j10);
                        long j11 = c0693d.f4573j;
                        if (iM18605j != C10013a.m18605j(j11)) {
                            z12 = false;
                        } else if (!z13) {
                            if (i11 == 2) {
                                if (C10013a.m18603h(j10) == C10013a.m18603h(j11)) {
                                }
                                z12 = false;
                            }
                            z12 = true;
                        } else if (C10013a.m18603h(j10) == C10013a.m18603h(j11) || C10013a.m18602g(j10) != C10013a.m18602g(j11)) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                    } else {
                        z12 = false;
                    }
                } else {
                    z12 = false;
                }
            } else {
                z12 = false;
            }
            if (z12) {
                return new C7216j(new C0693d(c0693d.f4564a, this.f52259b, c0693d.f4566c, c0693d.f4567d, c0693d.f4568e, c0693d.f4569f, c0693d.f4570g, c0693d.f4571h, c0693d.f4572i, j10), c0692c, C10014b.m18613c(j10, C9000b.m17236a(C5212l.m11186z(c0692c.f4559d), C5212l.m11186z(c0692c.f4560e))));
            }
        }
        m19402b(layoutDirection);
        int iM18605j2 = C10013a.m18605j(j10);
        if (z13) {
            z10 = true;
        } else {
            if (i11 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        int iM18603h = (z10 && C10013a.m18599d(j10)) ? C10013a.m18603h(j10) : Integer.MAX_VALUE;
        if (z13) {
            z11 = false;
        } else {
            if (i11 == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        int i12 = z11 ? 1 : i10;
        if (iM18605j2 != iM18603h) {
            MultiParagraphIntrinsics multiParagraphIntrinsics = this.f52267j;
            if (multiParagraphIntrinsics == null) {
                throw new IllegalStateException("layoutIntrinsics must be called first");
            }
            iM18603h = C0062b.m361k0(C5212l.m11186z(multiParagraphIntrinsics.mo2564c()), iM18605j2, iM18603h);
        }
        MultiParagraphIntrinsics multiParagraphIntrinsics2 = this.f52267j;
        if (multiParagraphIntrinsics2 == null) {
            throw new IllegalStateException("layoutIntrinsics must be called first");
        }
        C0692c c0692c2 = new C0692c(multiParagraphIntrinsics2, C10014b.m18612b(iM18603h, C10013a.m18602g(j10), 5), i12, i11 == 2);
        return new C7216j(new C0693d(this.f52258a, this.f52259b, this.f52266i, this.f52260c, this.f52262e, this.f52263f, this.f52264g, layoutDirection, this.f52265h, j10), c0692c2, C10014b.m18613c(j10, C9000b.m17236a(C5212l.m11186z(c0692c2.f4559d), C5212l.m11186z(c0692c2.f4560e))));
    }

    /* JADX INFO: renamed from: b */
    public final void m19402b(LayoutDirection layoutDirection) {
        C5207g.m11111f(layoutDirection, "layoutDirection");
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.f52267j;
        if (multiParagraphIntrinsics == null || layoutDirection != this.f52268k || multiParagraphIntrinsics.mo2562a()) {
            this.f52268k = layoutDirection;
            multiParagraphIntrinsics = new MultiParagraphIntrinsics(this.f52258a, C0694e.m2587a(this.f52259b, layoutDirection), this.f52266i, this.f52264g, this.f52265h);
        }
        this.f52267j = multiParagraphIntrinsics;
    }
}
