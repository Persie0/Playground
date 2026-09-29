package androidx.compose.p017ui.text;

import android.support.v4.media.AbstractC0140a;
import androidx.compose.p017ui.text.font.AbstractC0696b;
import androidx.compose.p017ui.text.style.TextForegroundStyle;
import androidx.compose.p017ui.unit.LayoutDirection;
import cm.InterfaceC2041a;
import dm.C5207g;
import kotlin.NoWhenBranchMatchedException;
import p231l1.C7211e;
import p231l1.C7212f;
import p231l1.C7214h;
import p231l1.C7215i;
import p231l1.C7218l;
import p328q1.C8471h;
import p328q1.C8472i;
import p328q1.C8476m;
import p338qd.C8573r0;
import p376s1.C8948d;
import p376s1.C8950f;
import p387t0.C9152j0;
import p387t0.C9169u;
import p424v0.C9623g;
import p445w1.C9791a;
import p445w1.C9793c;
import p445w1.C9794d;
import p445w1.C9795e;
import p445w1.C9797g;
import p445w1.C9798h;
import p445w1.C9799i;
import p445w1.C9800j;
import p445w1.C9801k;
import p445w1.C9802l;

/* JADX INFO: renamed from: androidx.compose.ui.text.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0694e {

    /* JADX INFO: renamed from: androidx.compose.ui.text.e$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f4574a;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f4574a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final C7218l m2587a(C7218l c7218l, LayoutDirection layoutDirection) {
        C5207g.m11111f(c7218l, "style");
        C5207g.m11111f(layoutDirection, "direction");
        int i10 = C7215i.f40589e;
        C7214h c7214h = c7218l.f40600a;
        C5207g.m11111f(c7214h, "style");
        TextForegroundStyle textForegroundStyleM2616b = c7214h.f40570a.m2616b(new InterfaceC2041a<TextForegroundStyle>() { // from class: androidx.compose.ui.text.SpanStyleKt$resolveSpanStyleDefaults$1
            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final TextForegroundStyle mo807E() {
                long j10 = C7215i.f40588d;
                return (j10 > C9169u.f47703f ? 1 : (j10 == C9169u.f47703f ? 0 : -1)) != 0 ? new C9793c(j10) : TextForegroundStyle.C0710a.f4688a;
            }
        });
        long j10 = c7214h.f40571b;
        if (C8573r0.m16670E0(j10)) {
            j10 = C7215i.f40585a;
        }
        long j11 = j10;
        C8476m c8476m = c7214h.f40572c;
        if (c8476m == null) {
            c8476m = C8476m.f45650f;
        }
        C8476m c8476m2 = c8476m;
        C8471h c8471h = c7214h.f40573d;
        C8471h c8471h2 = new C8471h(c8471h != null ? c8471h.f45643a : 0);
        C8472i c8472i = c7214h.f40574e;
        C8472i c8472i2 = new C8472i(c8472i != null ? c8472i.f45644a : 1);
        AbstractC0696b abstractC0696b = c7214h.f40575f;
        if (abstractC0696b == null) {
            abstractC0696b = AbstractC0696b.f4628a;
        }
        AbstractC0696b abstractC0696b2 = abstractC0696b;
        String str = c7214h.f40576g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j12 = c7214h.f40577h;
        if (C8573r0.m16670E0(j12)) {
            j12 = C7215i.f40586b;
        }
        long j13 = j12;
        C9791a c9791a = c7214h.f40578i;
        C9791a c9791a2 = new C9791a(c9791a != null ? c9791a.f49900a : 0.0f);
        C9800j c9800j = c7214h.f40579j;
        if (c9800j == null) {
            c9800j = C9800j.f49916c;
        }
        C9800j c9800j2 = c9800j;
        C8948d c8948dM17181a = c7214h.f40580k;
        if (c8948dM17181a == null) {
            c8948dM17181a = C8950f.f46917a.m17181a();
        }
        C8948d c8948d = c8948dM17181a;
        long j14 = C9169u.f47703f;
        long j15 = c7214h.f40581l;
        if (!(j15 != j14)) {
            j15 = C7215i.f40587c;
        }
        long j16 = j15;
        C9798h c9798h = c7214h.f40582m;
        if (c9798h == null) {
            c9798h = C9798h.f49911b;
        }
        C9798h c9798h2 = c9798h;
        C9152j0 c9152j0 = c7214h.f40583n;
        if (c9152j0 == null) {
            c9152j0 = C9152j0.f47679d;
        }
        C9152j0 c9152j1 = c9152j0;
        AbstractC0140a abstractC0140a = c7214h.f40584o;
        if (abstractC0140a == null) {
            abstractC0140a = C9623g.f49295a;
        }
        C7214h c7214h2 = new C7214h(textForegroundStyleM2616b, j11, c8476m2, c8471h2, c8472i2, abstractC0696b2, str2, j13, c9791a2, c9800j2, c8948d, j16, c9798h2, c9152j1, abstractC0140a);
        int i11 = C7212f.f40569b;
        C7211e c7211e = c7218l.f40601b;
        C5207g.m11111f(c7211e, "style");
        C9797g c9797g = new C9797g(c7211e.f40565h);
        C9799i c9799i = c7211e.f40559b;
        int i12 = 2;
        if (c9799i != null && c9799i.f49915a == 3) {
            int i13 = a.f4574a[layoutDirection.ordinal()];
            if (i13 == 1) {
                i12 = 4;
            } else {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i12 = 5;
            }
        } else if (c9799i == null) {
            int i14 = a.f4574a[layoutDirection.ordinal()];
            if (i14 == 1) {
                i12 = 1;
            } else if (i14 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i12 = c9799i.f49915a;
        }
        C9799i c9799i2 = new C9799i(i12);
        long j17 = c7211e.f40560c;
        if (C8573r0.m16670E0(j17)) {
            j17 = C7212f.f40568a;
        }
        long j18 = j17;
        C9801k c9801k = c7211e.f40561d;
        if (c9801k == null) {
            c9801k = C9801k.f49919c;
        }
        C9801k c9801k2 = c9801k;
        c7211e.getClass();
        C9795e c9795e = new C9795e(c7211e.f40566i);
        C9794d c9794d = new C9794d(c7211e.f40567j);
        C9802l c9802l = c7211e.f40564g;
        if (c9802l == null) {
            c9802l = C9802l.f49922c;
        }
        C7211e c7211e2 = new C7211e(c9797g, c9799i2, j18, c9801k2, null, c9795e, c9794d, c9802l);
        c7218l.getClass();
        return new C7218l(c7214h2, c7211e2, null);
    }
}
