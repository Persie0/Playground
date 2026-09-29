package androidx.compose.p017ui.text;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.support.v4.media.AbstractC0140a;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.compose.p017ui.text.android.C0690a;
import androidx.compose.p017ui.text.platform.C0708a;
import androidx.compose.p017ui.text.platform.extensions.C0709a;
import androidx.compose.p017ui.text.style.ResolvedTextDirection;
import cm.InterfaceC2041a;
import dm.C5206f;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import p231l1.C7211e;
import p231l1.C7214h;
import p231l1.C7218l;
import p231l1.InterfaceC7207a;
import p253m1.C7460g;
import p253m1.C7470q;
import p253m1.C7471r;
import p285o1.C7890c;
import p285o1.C7896i;
import p338qd.C8573r0;
import p338qd.C8584v;
import p375s0.C8941c;
import p375s0.C8942d;
import p387t0.AbstractC9161o;
import p387t0.C9139d;
import p387t0.C9141e;
import p387t0.C9147h;
import p387t0.C9152j0;
import p387t0.C9169u;
import p387t0.InterfaceC9165q;
import p388t1.C9176b;
import p388t1.C9177c;
import p425v1.C9626b;
import p445w1.C9794d;
import p445w1.C9795e;
import p445w1.C9797g;
import p445w1.C9798h;
import p470x1.C10013a;
import p470x1.C10023k;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidParagraph implements InterfaceC7207a {

    /* JADX INFO: renamed from: a */
    public final C0708a f4448a;

    /* JADX INFO: renamed from: b */
    public final int f4449b;

    /* JADX INFO: renamed from: c */
    public final long f4450c;

    /* JADX INFO: renamed from: d */
    public final C0690a f4451d;

    /* JADX INFO: renamed from: e */
    public final CharSequence f4452e;

    /* JADX INFO: renamed from: f */
    public final List<C8942d> f4453f;

    /* JADX INFO: renamed from: androidx.compose.ui.text.AndroidParagraph$a */
    public /* synthetic */ class C0686a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f4454a;

        static {
            int[] iArr = new int[ResolvedTextDirection.values().length];
            try {
                iArr[ResolvedTextDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ResolvedTextDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f4454a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:136:0x0153  */
    /* JADX WARN: Code duplicated, block: B:172:0x019f  */
    /* JADX WARN: Code duplicated, block: B:192:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:31:0x0065  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41, types: [android.text.Spannable, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v43 */
    public AndroidParagraph(C0708a c0708a, int i10, boolean z10, long j10) {
        boolean z11;
        int i11;
        int i12;
        int i13;
        int i14;
        C9626b[] c9626bArr;
        List<C8942d> list;
        C8942d c8942d;
        float fM2578f;
        C9797g c9797g;
        this.f4448a = c0708a;
        this.f4449b = i10;
        this.f4450c = j10;
        if (!(C10013a.m18604i(j10) == 0 && C10013a.m18605j(j10) == 0)) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
        }
        if (!(i10 >= 1)) {
            throw new IllegalArgumentException("maxLines should be greater than 0".toString());
        }
        C7218l c7218l = c0708a.f4675b;
        if (!z10 || C10023k.m18630a(c7218l.f40600a.f40577h, C8573r0.m16765v0(0)) || C10023k.m18630a(c7218l.f40600a.f40577h, C10023k.f50982c) || (c9797g = c7218l.f40601b.f40558a) == null) {
            z11 = false;
        } else {
            int i15 = c9797g.f49910a;
            if (i15 == 5) {
                z11 = false;
            } else if (i15 == 4) {
                z11 = false;
            } else {
                z11 = true;
            }
        }
        ?? spannableString = c0708a.f4681h;
        if (z11) {
            if (!(spannableString.length() == 0)) {
                spannableString = spannableString instanceof Spannable ? (Spannable) spannableString : new SpannableString(spannableString);
                C0709a.m2612e(spannableString, new C7890c(), spannableString.length() - 1, spannableString.length() - 1);
            }
        }
        this.f4452e = spannableString;
        C7211e c7211e = c7218l.f40601b;
        C9797g c9797g2 = c7211e.f40558a;
        if (c9797g2 != null && c9797g2.f49910a == 1) {
            i11 = 3;
        } else if (c9797g2 != null && c9797g2.f49910a == 2) {
            i11 = 4;
        } else if (c9797g2 != null && c9797g2.f49910a == 3) {
            i11 = 2;
        } else if (c9797g2 != null && c9797g2.f49910a == 5) {
            i11 = 0;
        } else if (c9797g2 != null && c9797g2.f49910a == 6) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i16 = c9797g2 == null ? 0 : c9797g2.f49910a == 4 ? 1 : 0;
        C9794d c9794d = c7211e.f40563f;
        int i17 = c9794d != null && c9794d.f49904a == 2 ? Build.VERSION.SDK_INT <= 32 ? 1 : 3 : 0;
        C9795e c9795e = c7211e.f40562e;
        C9795e.a aVar = c9795e != null ? new C9795e.a(c9795e.f49906a & 255) : null;
        if (aVar != null && aVar.f49907a == 1) {
            i12 = 0;
        } else if (aVar != null && aVar.f49907a == 2) {
            i12 = 1;
        } else if (aVar != null && aVar.f49907a == 3) {
            i12 = 2;
        } else {
            i12 = 0;
        }
        C9795e.b bVar = c9795e != null ? new C9795e.b((c9795e.f49906a >> 8) & 255) : null;
        if (bVar != null && bVar.f49908a == 1) {
            i13 = 0;
        } else if (bVar != null && bVar.f49908a == 2) {
            i13 = 1;
        } else if (bVar != null && bVar.f49908a == 3) {
            i13 = 2;
        } else if (bVar != null && bVar.f49908a == 4) {
            i13 = 3;
        } else {
            i13 = 0;
        }
        C9795e.c cVar = c9795e != null ? new C9795e.c((c9795e.f49906a >> 16) & 255) : null;
        if (cVar != null && cVar.f49909a == 1) {
            i14 = 0;
        } else if (cVar != null && cVar.f49909a == 2) {
            i14 = 1;
        } else {
            i14 = 0;
        }
        TextUtils.TruncateAt truncateAt = z10 ? TextUtils.TruncateAt.END : null;
        C0690a c0690aM2560q = m2560q(i11, i16, truncateAt, i10, i17, i12, i13, i14);
        if (!z10 || c0690aM2560q.m2573a() <= C10013a.m18602g(j10) || i10 <= 1) {
            this.f4451d = c0690aM2560q;
        } else {
            int iM18602g = C10013a.m18602g(j10);
            int i18 = 0;
            while (true) {
                int i19 = c0690aM2560q.f4545e;
                if (i18 >= i19) {
                    i18 = i19;
                    break;
                } else if (c0690aM2560q.m2575c(i18) > iM18602g) {
                    break;
                } else {
                    i18++;
                }
            }
            if (i18 >= 0 && i18 != this.f4449b) {
                c0690aM2560q = m2560q(i11, i16, truncateAt, i18 < 1 ? 1 : i18, i17, i12, i13, i14);
            }
            this.f4451d = c0690aM2560q;
        }
        C9177c c9177c = this.f4448a.f4680g;
        C7214h c7214h = c7218l.f40600a;
        c9177c.m17507a(c7214h.m14528a(), C8584v.m16788m(mo2545b(), mo2544a()), c7214h.f40570a.mo2614A());
        C0690a c0690a = this.f4451d;
        if (c0690a.m2580h() instanceof Spanned) {
            c9626bArr = (C9626b[]) ((Spanned) c0690a.m2580h()).getSpans(0, c0690a.m2580h().length(), C9626b.class);
            C5207g.m11110e(c9626bArr, "brushSpans");
            if (c9626bArr.length == 0) {
                c9626bArr = new C9626b[0];
            }
        } else {
            c9626bArr = new C9626b[0];
        }
        for (C9626b c9626b : c9626bArr) {
            c9626b.f49303c = C8584v.m16788m(mo2545b(), mo2544a());
        }
        CharSequence charSequence = this.f4452e;
        if (charSequence instanceof Spanned) {
            Object[] spans = ((Spanned) charSequence).getSpans(0, charSequence.length(), C7896i.class);
            C5207g.m11110e(spans, "getSpans(0, length, PlaceholderSpan::class.java)");
            ArrayList arrayList = new ArrayList(spans.length);
            for (Object obj : spans) {
                C7896i c7896i = (C7896i) obj;
                Spanned spanned = (Spanned) charSequence;
                int spanStart = spanned.getSpanStart(c7896i);
                int spanEnd = spanned.getSpanEnd(c7896i);
                int iM2576d = this.f4451d.m2576d(spanStart);
                boolean z12 = iM2576d >= this.f4449b;
                boolean z13 = this.f4451d.f4544d.getEllipsisCount(iM2576d) > 0 && spanEnd > this.f4451d.f4544d.getEllipsisStart(iM2576d);
                Layout layout = this.f4451d.f4544d;
                boolean z14 = spanEnd > (layout.getEllipsisStart(iM2576d) == 0 ? layout.getLineEnd(iM2576d) : layout.getText().length());
                if (z13 || z14 || z12) {
                    c8942d = null;
                } else {
                    int i20 = C0686a.f4454a[(this.f4451d.f4544d.isRtlCharAt(spanStart) ? ResolvedTextDirection.Rtl : ResolvedTextDirection.Ltr).ordinal()];
                    if (i20 == 1) {
                        fM2578f = this.f4451d.m2578f(spanStart, false);
                    } else {
                        if (i20 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fM2578f = this.f4451d.m2578f(spanStart, false) - c7896i.m15662c();
                    }
                    float fM15662c = c7896i.m15662c() + fM2578f;
                    float fM2574b = this.f4451d.m2574b(iM2576d) - c7896i.m15661b();
                    c8942d = new C8942d(fM2578f, fM2574b, fM15662c, c7896i.m15661b() + fM2574b);
                }
                arrayList.add(c8942d);
            }
            list = arrayList;
        } else {
            list = EmptyList.f38032a;
        }
        this.f4453f = list;
        C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<C5206f>() { // from class: androidx.compose.ui.text.AndroidParagraph$wordBoundary$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C5206f mo807E() {
                AndroidParagraph androidParagraph = this.f4455b;
                Locale textLocale = androidParagraph.f4448a.f4680g.getTextLocale();
                C5207g.m11110e(textLocale, "paragraphIntrinsics.textPaint.textLocale");
                return new C5206f(textLocale, androidParagraph.f4451d.m2580h());
            }
        });
    }

    @Override // p231l1.InterfaceC7207a
    /* JADX INFO: renamed from: a */
    public final float mo2544a() {
        return this.f4451d.m2573a();
    }

    @Override // p231l1.InterfaceC7207a
    /* JADX INFO: renamed from: b */
    public final float mo2545b() {
        return C10013a.m18603h(this.f4450c);
    }

    @Override // p231l1.InterfaceC7207a
    /* JADX INFO: renamed from: c */
    public final void mo2546c(InterfaceC9165q interfaceC9165q, AbstractC9161o abstractC9161o, float f3, C9152j0 c9152j0, C9798h c9798h, AbstractC0140a abstractC0140a, int i10) {
        C0708a c0708a = this.f4448a;
        C9177c c9177c = c0708a.f4680g;
        int i11 = c9177c.f47711a.f47652b;
        c9177c.m17507a(abstractC9161o, C8584v.m16788m(mo2545b(), mo2544a()), f3);
        c9177c.m17509c(c9152j0);
        c9177c.m17510d(c9798h);
        c9177c.m17508b(abstractC0140a);
        c9177c.f47711a.m17443e(i10);
        m2561r(interfaceC9165q);
        c0708a.f4680g.f47711a.m17443e(i11);
    }

    @Override // p231l1.InterfaceC7207a
    /* JADX INFO: renamed from: d */
    public final ResolvedTextDirection mo2547d(int i10) {
        C0690a c0690a = this.f4451d;
        return c0690a.f4544d.getParagraphDirection(c0690a.m2576d(i10)) == 1 ? ResolvedTextDirection.Ltr : ResolvedTextDirection.Rtl;
    }

    @Override // p231l1.InterfaceC7207a
    /* JADX INFO: renamed from: e */
    public final float mo2548e(int i10) {
        return this.f4451d.m2577e(i10);
    }

    @Override // p231l1.InterfaceC7207a
    /* JADX INFO: renamed from: f */
    public final float mo2549f() {
        C0690a c0690a = this.f4451d;
        return c0690a.m2574b(c0690a.f4545e - 1);
    }

    @Override // p231l1.InterfaceC7207a
    /* JADX INFO: renamed from: g */
    public final int mo2550g(int i10) {
        return this.f4451d.m2576d(i10);
    }

    @Override // p231l1.InterfaceC7207a
    /* JADX INFO: renamed from: h */
    public final float mo2551h() {
        return this.f4451d.m2574b(0);
    }

    @Override // p231l1.InterfaceC7207a
    /* JADX INFO: renamed from: i */
    public final int mo2552i(long j10) {
        int iM17165d = (int) C8941c.m17165d(j10);
        C0690a c0690a = this.f4451d;
        int lineForVertical = c0690a.f4544d.getLineForVertical(c0690a.f4546f + iM17165d);
        return c0690a.f4544d.getOffsetForHorizontal(lineForVertical, ((lineForVertical == c0690a.f4545e + (-1) ? c0690a.f4548h + c0690a.f4549i : 0.0f) * (-1)) + C8941c.m17164c(j10));
    }

    @Override // p231l1.InterfaceC7207a
    /* JADX INFO: renamed from: j */
    public final C8942d mo2553j(int i10) {
        float fM2579g;
        float fM2579g2;
        float fM2578f;
        float fM2578f2;
        C0690a c0690a = this.f4451d;
        int iM2576d = c0690a.m2576d(i10);
        float fM2577e = c0690a.m2577e(iM2576d);
        float fM2575c = c0690a.m2575c(iM2576d);
        Layout layout = c0690a.f4544d;
        boolean z10 = layout.getParagraphDirection(iM2576d) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(i10);
        if (!z10 || zIsRtlCharAt) {
            if (z10 && zIsRtlCharAt) {
                fM2578f = c0690a.m2579g(i10, false);
                fM2578f2 = c0690a.m2579g(i10 + 1, true);
            } else if (zIsRtlCharAt) {
                fM2578f = c0690a.m2578f(i10, false);
                fM2578f2 = c0690a.m2578f(i10 + 1, true);
            } else {
                fM2579g = c0690a.m2579g(i10, false);
                fM2579g2 = c0690a.m2579g(i10 + 1, true);
            }
            float f3 = fM2578f;
            fM2579g = fM2578f2;
            fM2579g2 = f3;
        } else {
            fM2579g = c0690a.m2578f(i10, false);
            fM2579g2 = c0690a.m2578f(i10 + 1, true);
        }
        RectF rectF = new RectF(fM2579g, fM2577e, fM2579g2, fM2575c);
        return new C8942d(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // p231l1.InterfaceC7207a
    /* JADX INFO: renamed from: k */
    public final List<C8942d> mo2554k() {
        return this.f4453f;
    }

    @Override // p231l1.InterfaceC7207a
    /* JADX INFO: renamed from: l */
    public final boolean mo2555l(int i10) {
        return C7471r.m14840b(this.f4451d.f4544d, i10);
    }

    @Override // p231l1.InterfaceC7207a
    /* JADX INFO: renamed from: m */
    public final int mo2556m(int i10) {
        return this.f4451d.f4544d.getLineStart(i10);
    }

    @Override // p231l1.InterfaceC7207a
    /* JADX INFO: renamed from: n */
    public final int mo2557n(int i10, boolean z10) {
        C0690a c0690a = this.f4451d;
        if (!z10) {
            Layout layout = c0690a.f4544d;
            return layout.getEllipsisStart(i10) == 0 ? layout.getLineEnd(i10) : layout.getText().length();
        }
        Layout layout2 = c0690a.f4544d;
        if (layout2.getEllipsisStart(i10) == 0) {
            return layout2.getLineVisibleEnd(i10);
        }
        return layout2.getEllipsisStart(i10) + layout2.getLineStart(i10);
    }

    @Override // p231l1.InterfaceC7207a
    /* JADX INFO: renamed from: o */
    public final void mo2558o(InterfaceC9165q interfaceC9165q, long j10, C9152j0 c9152j0, C9798h c9798h, AbstractC0140a abstractC0140a, int i10) {
        C0708a c0708a = this.f4448a;
        C9177c c9177c = c0708a.f4680g;
        int i11 = c9177c.f47711a.f47652b;
        c9177c.getClass();
        if (j10 != C9169u.f47703f) {
            C9147h c9147h = c9177c.f47711a;
            c9147h.m17444f(j10);
            c9147h.m17446h(null);
        }
        c9177c.m17509c(c9152j0);
        c9177c.m17510d(c9798h);
        c9177c.m17508b(abstractC0140a);
        c9177c.f47711a.m17443e(i10);
        m2561r(interfaceC9165q);
        c0708a.f4680g.f47711a.m17443e(i11);
    }

    @Override // p231l1.InterfaceC7207a
    /* JADX INFO: renamed from: p */
    public final int mo2559p(float f3) {
        C0690a c0690a = this.f4451d;
        return c0690a.f4544d.getLineForVertical(c0690a.f4546f + ((int) f3));
    }

    /* JADX INFO: renamed from: q */
    public final C0690a m2560q(int i10, int i11, TextUtils.TruncateAt truncateAt, int i12, int i13, int i14, int i15, int i16) {
        CharSequence charSequence = this.f4452e;
        float fMo2545b = mo2545b();
        C0708a c0708a = this.f4448a;
        C9177c c9177c = c0708a.f4680g;
        int i17 = c0708a.f4685l;
        C7460g c7460g = c0708a.f4682i;
        C9176b.a aVar = C9176b.f47710a;
        C5207g.m11111f(c0708a.f4675b, "<this>");
        return new C0690a(charSequence, fMo2545b, c9177c, i10, truncateAt, i17, i12, i14, i15, i16, i13, i11, c7460g);
    }

    /* JADX INFO: renamed from: r */
    public final void m2561r(InterfaceC9165q interfaceC9165q) {
        Canvas canvas = C9141e.f47648a;
        Canvas canvas2 = ((C9139d) interfaceC9165q).f47644a;
        C0690a c0690a = this.f4451d;
        if (c0690a.f4543c) {
            canvas2.save();
            canvas2.clipRect(0.0f, 0.0f, mo2545b(), mo2544a());
        }
        C5207g.m11111f(canvas2, "canvas");
        if (canvas2.getClipBounds(c0690a.f4553m)) {
            int i10 = c0690a.f4546f;
            if (i10 != 0) {
                canvas2.translate(0.0f, i10);
            }
            C7470q c7470q = C7471r.f41320a;
            c7470q.getClass();
            c7470q.f41319a = canvas2;
            c0690a.f4544d.draw(c7470q);
            if (i10 != 0) {
                canvas2.translate(0.0f, (-1) * i10);
            }
        }
        if (c0690a.f4543c) {
            canvas2.restore();
        }
    }
}
