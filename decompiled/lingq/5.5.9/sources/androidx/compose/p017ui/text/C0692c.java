package androidx.compose.p017ui.text;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.support.v4.media.AbstractC0140a;
import androidx.compose.p017ui.text.android.C0690a;
import androidx.compose.p017ui.text.platform.C0708a;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C6752c;
import p231l1.C7208b;
import p231l1.C7209c;
import p231l1.InterfaceC7207a;
import p231l1.InterfaceC7210d;
import p260m8.C7499b;
import p338qd.C8584v;
import p375s0.C8942d;
import p385sf.C9000b;
import p387t0.AbstractC9150i0;
import p387t0.AbstractC9161o;
import p387t0.C9152j0;
import p387t0.C9156l0;
import p387t0.C9163p;
import p387t0.InterfaceC9165q;
import p445w1.C9798h;
import p470x1.C10013a;
import p470x1.C10014b;
import tl.C9327o;

/* JADX INFO: renamed from: androidx.compose.ui.text.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0692c {

    /* JADX INFO: renamed from: a */
    public final MultiParagraphIntrinsics f4556a;

    /* JADX INFO: renamed from: b */
    public final int f4557b;

    /* JADX INFO: renamed from: c */
    public final boolean f4558c;

    /* JADX INFO: renamed from: d */
    public final float f4559d;

    /* JADX INFO: renamed from: e */
    public final float f4560e;

    /* JADX INFO: renamed from: f */
    public final int f4561f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f4562g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f4563h;

    public C0692c(MultiParagraphIntrinsics multiParagraphIntrinsics, long j10, int i10, boolean z10) {
        boolean z11;
        int iM18602g;
        this.f4556a = multiParagraphIntrinsics;
        this.f4557b = i10;
        if (!(C10013a.m18605j(j10) == 0 && C10013a.m18604i(j10) == 0)) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = multiParagraphIntrinsics.f4460e;
        int size = arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        float f3 = 0.0f;
        while (true) {
            if (i11 >= size) {
                z11 = false;
                break;
            }
            C7209c c7209c = (C7209c) arrayList2.get(i11);
            InterfaceC7210d interfaceC7210d = c7209c.f40555a;
            int iM18603h = C10013a.m18603h(j10);
            if (C10013a.m18598c(j10)) {
                iM18602g = C10013a.m18602g(j10) - ((int) Math.ceil(f3));
                if (iM18602g < 0) {
                    iM18602g = 0;
                }
            } else {
                iM18602g = C10013a.m18602g(j10);
            }
            long jM18612b = C10014b.m18612b(iM18603h, iM18602g, 5);
            int i13 = this.f4557b - i12;
            C5207g.m11111f(interfaceC7210d, "paragraphIntrinsics");
            AndroidParagraph androidParagraph = new AndroidParagraph((C0708a) interfaceC7210d, i13, z10, jM18612b);
            float fMo2544a = androidParagraph.mo2544a() + f3;
            C0690a c0690a = androidParagraph.f4451d;
            int i14 = i12 + c0690a.f4545e;
            arrayList.add(new C7208b(androidParagraph, c7209c.f40556b, c7209c.f40557c, i12, i14, f3, fMo2544a));
            if (c0690a.f4543c) {
                i12 = i14;
            } else {
                i12 = i14;
                if (i12 != this.f4557b || i11 == C9000b.m17249o(this.f4556a.f4460e)) {
                    i11++;
                    f3 = fMo2544a;
                }
            }
            f3 = fMo2544a;
            z11 = true;
            break;
        }
        this.f4560e = f3;
        this.f4561f = i12;
        this.f4558c = z11;
        this.f4563h = arrayList;
        this.f4559d = C10013a.m18603h(j10);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i15 = 0; i15 < size2; i15++) {
            C7208b c7208b = (C7208b) arrayList.get(i15);
            List<C8942d> listMo2554k = c7208b.f40548a.mo2554k();
            ArrayList arrayList4 = new ArrayList(listMo2554k.size());
            int size3 = listMo2554k.size();
            for (int i16 = 0; i16 < size3; i16++) {
                C8942d c8942d = listMo2554k.get(i16);
                arrayList4.add(c8942d != null ? c8942d.m17173d(C7499b.m14932c(0.0f, c7208b.f40553f)) : null);
            }
            C9327o.m17684D(arrayList4, arrayList3);
        }
        if (arrayList3.size() < this.f4556a.f4457b.size()) {
            int size4 = this.f4556a.f4457b.size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i17 = 0; i17 < size4; i17++) {
                arrayList5.add(null);
            }
            arrayList3 = C6752c.m13438f0(arrayList5, arrayList3);
        }
        this.f4562g = arrayList3;
    }

    /* JADX INFO: renamed from: a */
    public static void m2584a(C0692c c0692c, InterfaceC9165q interfaceC9165q, long j10, C9152j0 c9152j0, C9798h c9798h, AbstractC0140a abstractC0140a) {
        c0692c.getClass();
        interfaceC9165q.mo17420d();
        ArrayList arrayList = c0692c.f4563h;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C7208b c7208b = (C7208b) arrayList.get(i10);
            c7208b.f40548a.mo2558o(interfaceC9165q, j10, c9152j0, c9798h, abstractC0140a, 3);
            interfaceC9165q.mo17427n(0.0f, c7208b.f40548a.mo2544a());
        }
        interfaceC9165q.mo17428o();
    }

    /* JADX INFO: renamed from: b */
    public static void m2585b(C0692c c0692c, InterfaceC9165q interfaceC9165q, AbstractC9161o abstractC9161o, float f3, C9152j0 c9152j0, C9798h c9798h, AbstractC0140a abstractC0140a) {
        c0692c.getClass();
        interfaceC9165q.mo17420d();
        ArrayList arrayList = c0692c.f4563h;
        if (arrayList.size() <= 1 || (abstractC9161o instanceof C9156l0)) {
            C9000b.m17243i(c0692c, interfaceC9165q, abstractC9161o, f3, c9152j0, c9798h, abstractC0140a, 3);
        } else if (abstractC9161o instanceof AbstractC9150i0) {
            int size = arrayList.size();
            float fMax = 0.0f;
            float fMo2544a = 0.0f;
            for (int i10 = 0; i10 < size; i10++) {
                C7208b c7208b = (C7208b) arrayList.get(i10);
                fMo2544a += c7208b.f40548a.mo2544a();
                fMax = Math.max(fMax, c7208b.f40548a.mo2545b());
            }
            C8584v.m16788m(fMax, fMo2544a);
            Shader shaderMo17469b = ((AbstractC9150i0) abstractC9161o).mo17469b();
            Matrix matrix = new Matrix();
            shaderMo17469b.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                C7208b c7208b2 = (C7208b) arrayList.get(i11);
                c7208b2.f40548a.mo2546c(interfaceC9165q, new C9163p(shaderMo17469b), f3, c9152j0, c9798h, abstractC0140a, 3);
                InterfaceC7207a interfaceC7207a = c7208b2.f40548a;
                interfaceC9165q.mo17427n(0.0f, interfaceC7207a.mo2544a());
                matrix.setTranslate(0.0f, -interfaceC7207a.mo2544a());
                shaderMo17469b.setLocalMatrix(matrix);
            }
        }
        interfaceC9165q.mo17428o();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public final void m2586c(int i10) {
        int i11 = this.f4561f;
        boolean z10 = false;
        if (i10 >= 0 && i10 < i11) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(("lineIndex(" + i10 + ") is out of bounds [0, " + i11 + ')').toString());
    }
}
