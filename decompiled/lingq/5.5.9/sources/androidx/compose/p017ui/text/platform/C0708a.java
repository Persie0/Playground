package androidx.compose.p017ui.text.platform;

import android.graphics.Typeface;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import androidx.compose.p017ui.text.C0689a;
import androidx.compose.p017ui.text.font.AbstractC0696b;
import androidx.compose.p017ui.text.font.InterfaceC0703i;
import androidx.compose.p017ui.text.platform.extensions.C0709a;
import androidx.emoji2.text.AbstractC0898l;
import androidx.emoji2.text.C0892f;
import cm.InterfaceC2058r;
import com.kochava.tracker.BuildConfig;
import dm.C5206f;
import dm.C5207g;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;
import kotlin.Pair;
import p081e0.InterfaceC5301c1;
import p231l1.C7211e;
import p231l1.C7213g;
import p231l1.C7214h;
import p231l1.C7218l;
import p231l1.InterfaceC7210d;
import p253m1.C7457d;
import p253m1.C7460g;
import p253m1.C7461h;
import p285o1.C7894g;
import p328q1.C8471h;
import p328q1.C8472i;
import p328q1.C8476m;
import p338qd.C8573r0;
import p375s0.C8944f;
import p376s1.C8945a;
import p376s1.C8948d;
import p376s1.C8950f;
import p376s1.InterfaceC8949e;
import p387t0.C9147h;
import p387t0.C9152j0;
import p387t0.C9169u;
import p388t1.C9176b;
import p388t1.C9177c;
import p388t1.C9178d;
import p388t1.C9179e;
import p388t1.C9181g;
import p403u1.C9378a;
import p403u1.C9379b;
import p403u1.C9380c;
import p426v2.C9633g;
import p445w1.C9791a;
import p445w1.C9798h;
import p445w1.C9799i;
import p445w1.C9800j;
import p445w1.C9801k;
import p445w1.C9802l;
import p470x1.C10023k;
import p470x1.C10024l;
import p470x1.InterfaceC10015c;

/* JADX INFO: renamed from: androidx.compose.ui.text.platform.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0708a implements InterfaceC7210d {

    /* JADX INFO: renamed from: a */
    public final String f4674a;

    /* JADX INFO: renamed from: b */
    public final C7218l f4675b;

    /* JADX INFO: renamed from: c */
    public final List<C0689a.b<C7214h>> f4676c;

    /* JADX INFO: renamed from: d */
    public final List<C0689a.b<C7213g>> f4677d;

    /* JADX INFO: renamed from: e */
    public final AbstractC0696b.a f4678e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC10015c f4679f;

    /* JADX INFO: renamed from: g */
    public final C9177c f4680g;

    /* JADX INFO: renamed from: h */
    public final CharSequence f4681h;

    /* JADX INFO: renamed from: i */
    public final C7460g f4682i;

    /* JADX INFO: renamed from: j */
    public C9181g f4683j;

    /* JADX INFO: renamed from: k */
    public final boolean f4684k;

    /* JADX INFO: renamed from: l */
    public final int f4685l;

    /* JADX WARN: Code duplicated, block: B:133:0x025b  */
    /* JADX WARN: Code duplicated, block: B:135:0x026a  */
    /* JADX WARN: Code duplicated, block: B:145:0x0294  */
    /* JADX WARN: Code duplicated, block: B:160:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List] */
    public C0708a(C7218l c7218l, AbstractC0696b.a aVar, InterfaceC10015c interfaceC10015c, String str, List list, List list2) {
        int i10;
        boolean z10;
        boolean z11;
        C7214h c7214h;
        ?? arrayList;
        CharSequence charSequence;
        int i11;
        ?? r10;
        long j10;
        float fMo1459A0;
        CharSequence charSequence2;
        Typeface typeface;
        Locale locale;
        final C0708a c0708a = this;
        C5207g.m11111f(str, "text");
        C5207g.m11111f(c7218l, "style");
        C5207g.m11111f(aVar, "fontFamilyResolver");
        C5207g.m11111f(interfaceC10015c, "density");
        c0708a.f4674a = str;
        c0708a.f4675b = c7218l;
        c0708a.f4676c = list;
        c0708a.f4677d = list2;
        c0708a.f4678e = aVar;
        c0708a.f4679f = interfaceC10015c;
        C9177c c9177c = new C9177c(interfaceC10015c.getDensity());
        c0708a.f4680g = c9177c;
        C9178d c9178d = C9179e.f47718a;
        C9178d c9178d2 = C9179e.f47718a;
        InterfaceC5301c1<Boolean> interfaceC5301c1M17511a = c9178d2.f47715a;
        if (interfaceC5301c1M17511a == null) {
            if (C0892f.m3520c()) {
                interfaceC5301c1M17511a = c9178d2.m17511a();
                c9178d2.f47715a = interfaceC5301c1M17511a;
            } else {
                interfaceC5301c1M17511a = C5206f.f33275j;
            }
        }
        c0708a.f4684k = interfaceC5301c1M17511a.getValue().booleanValue();
        C7211e c7211e = c7218l.f40601b;
        C9799i c9799i = c7211e.f40559b;
        C7214h c7214h2 = c7218l.f40600a;
        C8948d c8948d = c7214h2.f40580k;
        int i12 = c9799i != null ? c9799i.f49915a : 3;
        if (i12 == 4) {
            i10 = 2;
        } else {
            if (i12 == 5) {
                i10 = 3;
            } else {
                if (i12 == 1) {
                    i10 = 0;
                } else {
                    if (i12 == 2) {
                        i10 = 1;
                    } else {
                        if (!(i12 == 3)) {
                            throw new IllegalStateException("Invalid TextDirection.".toString());
                        }
                        if (c8948d != null) {
                            InterfaceC8949e interfaceC8949e = c8948d.f46915a.get(0).f46914a;
                            C5207g.m11109d(interfaceC8949e, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
                            locale = ((C8945a) interfaceC8949e).f46910a;
                            locale = locale == null ? Locale.getDefault() : locale;
                        }
                        int i13 = C9633g.f49328a;
                        int iM18109a = C9633g.a.m18109a(locale);
                        if (iM18109a == 0 || iM18109a != 1) {
                            i10 = 2;
                        } else {
                            i10 = 3;
                        }
                    }
                }
            }
        }
        c0708a.f4685l = i10;
        InterfaceC2058r<AbstractC0696b, C8476m, C8471h, C8472i, Typeface> interfaceC2058r = new InterfaceC2058r<AbstractC0696b, C8476m, C8471h, C8472i, Typeface>() { // from class: androidx.compose.ui.text.platform.AndroidParagraphIntrinsics$resolveTypeface$1
            {
                super(4);
            }

            @Override // cm.InterfaceC2058r
            /* JADX INFO: renamed from: T */
            public final Typeface mo1851T(AbstractC0696b abstractC0696b, C8476m c8476m, C8471h c8471h, C8472i c8472i) {
                C8476m c8476m2 = c8476m;
                int i14 = c8471h.f45643a;
                int i15 = c8472i.f45644a;
                C5207g.m11111f(c8476m2, "fontWeight");
                C0708a c0708a2 = this.f4673b;
                InterfaceC0703i interfaceC0703iMo2595a = c0708a2.f4678e.mo2595a(abstractC0696b, c8476m2, i14, i15);
                if (interfaceC0703iMo2595a instanceof InterfaceC0703i.b) {
                    Object value = interfaceC0703iMo2595a.getValue();
                    C5207g.m11109d(value, "null cannot be cast to non-null type android.graphics.Typeface");
                    return (Typeface) value;
                }
                C9181g c9181g = new C9181g(interfaceC0703iMo2595a, c0708a2.f4683j);
                c0708a2.f4683j = c9181g;
                Object obj = c9181g.f47723d;
                C5207g.m11109d(obj, "null cannot be cast to non-null type android.graphics.Typeface");
                return (Typeface) obj;
            }
        };
        C9802l c9802l = c7211e.f40564g;
        c9802l = c9802l == null ? C9802l.f49922c : c9802l;
        c9177c.setFlags(c9802l.f49925b ? c9177c.getFlags() | BuildConfig.SDK_TRUNCATE_LENGTH : c9177c.getFlags() & (-129));
        int i14 = c9802l.f49924a;
        if (i14 == 1) {
            c9177c.setFlags(c9177c.getFlags() | 64);
            c9177c.setHinting(0);
        } else {
            if (i14 == 2) {
                c9177c.getFlags();
                c9177c.setHinting(1);
            } else {
                if (i14 == 3) {
                    c9177c.getFlags();
                    c9177c.setHinting(0);
                } else {
                    c9177c.getFlags();
                }
            }
        }
        boolean z12 = !list.isEmpty();
        long j11 = c7214h2.f40571b;
        long jM18631b = C10023k.m18631b(j11);
        if (C10024l.m18634a(jM18631b, 4294967296L)) {
            c9177c.setTextSize(interfaceC10015c.mo1459A0(j11));
        } else if (C10024l.m18634a(jM18631b, 8589934592L)) {
            c9177c.setTextSize(C10023k.m18632c(j11) * c9177c.getTextSize());
        }
        if (C9380c.m17751a(c7214h2)) {
            C8476m c8476m = c7214h2.f40572c;
            c8476m = c8476m == null ? C8476m.f45650f : c8476m;
            C8471h c8471h = c7214h2.f40573d;
            int i15 = c8471h != null ? c8471h.f45643a : 0;
            C8472i c8472i = c7214h2.f40574e;
            int i16 = c8472i != null ? c8472i.f45644a : 1;
            C5207g.m11111f(c8476m, "fontWeight");
            InterfaceC0703i interfaceC0703iMo2595a = aVar.mo2595a(c7214h2.f40575f, c8476m, i15, i16);
            if (interfaceC0703iMo2595a instanceof InterfaceC0703i.b) {
                Object value = interfaceC0703iMo2595a.getValue();
                C5207g.m11109d(value, "null cannot be cast to non-null type android.graphics.Typeface");
                typeface = (Typeface) value;
            } else {
                C9181g c9181g = new C9181g(interfaceC0703iMo2595a, c0708a.f4683j);
                c0708a.f4683j = c9181g;
                Object obj = c9181g.f47723d;
                C5207g.m11109d(obj, "null cannot be cast to non-null type android.graphics.Typeface");
                typeface = (Typeface) obj;
            }
            c9177c.setTypeface(typeface);
        }
        C8948d c8948d2 = c7214h2.f40580k;
        if (c8948d2 != null && !C5207g.m11106a(c8948d2, C8950f.f46917a.m17181a())) {
            C9378a.f48170a.m17749b(c9177c, c8948d2);
        }
        String str2 = c7214h2.f40576g;
        if (str2 != null && !C5207g.m11106a(str2, "")) {
            c9177c.setFontFeatureSettings(str2);
        }
        C9800j c9800j = c7214h2.f40579j;
        if (c9800j != null && !C5207g.m11106a(c9800j, C9800j.f49916c)) {
            c9177c.setTextScaleX(c9177c.getTextScaleX() * c9800j.f49917a);
            c9177c.setTextSkewX(c9177c.getTextSkewX() + c9800j.f49918b);
        }
        long jM14529b = c7214h2.m14529b();
        long j12 = C9169u.f47703f;
        if (jM14529b != j12) {
            C9147h c9147h = c9177c.f47711a;
            c9147h.m17444f(jM14529b);
            c9147h.m17446h(null);
        }
        c9177c.m17507a(c7214h2.m14528a(), C8944f.f46907c, c7214h2.f40570a.mo2614A());
        c9177c.m17509c(c7214h2.f40583n);
        c9177c.m17510d(c7214h2.f40582m);
        c9177c.m17508b(c7214h2.f40584o);
        long j13 = c7214h2.f40577h;
        if (C10024l.m18634a(C10023k.m18631b(j13), 4294967296L)) {
            if (!(C10023k.m18632c(j13) == 0.0f)) {
                float textScaleX = c9177c.getTextScaleX() * c9177c.getTextSize();
                float fMo1459A1 = interfaceC10015c.mo1459A0(j13);
                if (!(textScaleX == 0.0f)) {
                    c9177c.setLetterSpacing(fMo1459A1 / textScaleX);
                }
            } else if (C10024l.m18634a(C10023k.m18631b(j13), 8589934592L)) {
                c9177c.setLetterSpacing(C10023k.m18632c(j13));
            }
        } else if (C10024l.m18634a(C10023k.m18631b(j13), 8589934592L)) {
            c9177c.setLetterSpacing(C10023k.m18632c(j13));
        }
        if (z12 && C10024l.m18634a(C10023k.m18631b(j13), 4294967296L)) {
            if (C10023k.m18632c(j13) == 0.0f) {
                z10 = false;
            } else {
                z10 = true;
            }
        } else {
            z10 = false;
        }
        long j14 = c7214h2.f40581l;
        boolean z13 = (C9169u.m17497c(j14, j12) || C9169u.m17497c(j14, C9169u.f47702e)) ? false : true;
        C9791a c9791a = c7214h2.f40578i;
        if (c9791a == null) {
            z11 = false;
        } else {
            if (Float.compare(c9791a.f49900a, 0.0f) == 0) {
                z11 = false;
            } else {
                z11 = true;
            }
        }
        if (z10 || z13 || z11) {
            c7214h = new C7214h(0L, 0L, (C8476m) null, (C8471h) null, (C8472i) null, (AbstractC0696b) null, (String) null, z10 ? j13 : C10023k.f50982c, z11 ? c9791a : null, (C9800j) null, (C8948d) null, z13 ? j14 : j12, (C9798h) null, (C9152j0) null, 13951);
        } else {
            c7214h = null;
        }
        if (c7214h != null) {
            int size = list.size() + 1;
            arrayList = new ArrayList(size);
            int i17 = 0;
            while (i17 < size) {
                arrayList.add(i17 == 0 ? new C0689a.b<>(0, c0708a.f4674a.length(), c7214h) : c0708a.f4676c.get(i17 - 1));
                i17++;
            }
        } else {
            arrayList = list;
        }
        String str3 = c0708a.f4674a;
        float textSize = c0708a.f4680g.getTextSize();
        C7218l c7218l2 = c0708a.f4675b;
        List<C0689a.b<C7213g>> list3 = c0708a.f4677d;
        InterfaceC10015c interfaceC10015c2 = c0708a.f4679f;
        boolean z14 = c0708a.f4684k;
        C9176b.a aVar2 = C9176b.f47710a;
        C5207g.m11111f(str3, "text");
        C5207g.m11111f(c7218l2, "contextTextStyle");
        C5207g.m11111f(list3, "placeholders");
        C5207g.m11111f(interfaceC10015c2, "density");
        if (z14 && C0892f.m3520c()) {
            CharSequence charSequenceM3526h = C0892f.m3519a().m3526h(str3);
            C5207g.m11108c(charSequenceM3526h);
            charSequence = charSequenceM3526h;
        } else {
            charSequence = str3;
        }
        boolean zIsEmpty = arrayList.isEmpty();
        C7211e c7211e2 = c7218l2.f40601b;
        if (!zIsEmpty || !list3.isEmpty() || !C5207g.m11106a(c7211e2.f40561d, C9801k.f49919c) || !C8573r0.m16670E0(c7211e2.f40560c)) {
            charSequence2 = charSequence;
            Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
            if (C5207g.m11106a(c7218l2.f40600a.f40582m, C9798h.f49912c)) {
                C0709a.m2612e(spannableString, C9176b.f47710a, 0, str3.length());
            }
            c7211e2.getClass();
            float fM2608a = C0709a.m2608a(c7211e2.f40560c, textSize, interfaceC10015c2);
            if (Float.isNaN(fM2608a)) {
                i11 = 0;
            } else {
                i11 = 0;
                C0709a.m2612e(spannableString, new C7894g(fM2608a), 0, spannableString.length());
            }
            C9801k c9801k = c7211e2.f40561d;
            if (c9801k != null) {
                long jM16765v0 = C8573r0.m16765v0(i11);
                long j15 = c9801k.f49920a;
                boolean zM18630a = C10023k.m18630a(j15, jM16765v0);
                long j16 = c9801k.f49921b;
                if ((zM18630a && C10023k.m18630a(j16, C8573r0.m16765v0(i11))) || C8573r0.m16670E0(j15) || C8573r0.m16670E0(j16)) {
                    i11 = 0;
                } else {
                    long jM18631b2 = C10023k.m18631b(j15);
                    if (C10024l.m18634a(jM18631b2, 4294967296L)) {
                        fMo1459A0 = interfaceC10015c2.mo1459A0(j15);
                        j10 = 8589934592L;
                    } else {
                        float fM18632c = C10024l.m18634a(jM18631b2, 8589934592L) ? C10023k.m18632c(j15) * textSize : 0.0f;
                        j10 = 8589934592L;
                        fMo1459A0 = fM18632c;
                    }
                    long jM18631b3 = C10023k.m18631b(j16);
                    C0709a.m2612e(spannableString, new LeadingMarginSpan.Standard((int) Math.ceil(fMo1459A0), (int) Math.ceil(C10024l.m18634a(jM18631b3, 4294967296L) ? interfaceC10015c2.mo1459A0(j16) : C10024l.m18634a(jM18631b3, j10) ? textSize * C10023k.m18632c(j16) : 0.0f)), 0, spannableString.length());
                    i11 = 0;
                }
                r10 = arrayList;
            } else {
                c7218l2 = c7218l2;
                r10 = arrayList;
            }
            C0709a.m2613f(spannableString, c7218l2, r10, interfaceC10015c2, interfaceC2058r);
            if (list3.size() > 0) {
                C0689a.b<C7213g> bVar = list3.get(i11);
                C7213g c7213g = bVar.f4536a;
                Object[] spans = spannableString.getSpans(bVar.f4537b, bVar.f4538c, AbstractC0898l.class);
                C5207g.m11110e(spans, "getSpans(start, end, EmojiSpan::class.java)");
                int length = spans.length;
                while (i11 < length) {
                    spannableString.removeSpan((AbstractC0898l) spans[i11]);
                    i11++;
                }
                c7213g.getClass();
                C10023k.m18632c(0L);
                C9379b.m17750a();
                C10023k.m18632c(0L);
                C9379b.m17750a();
                interfaceC10015c2.mo1462c0();
                interfaceC10015c2.getDensity();
                throw new IllegalStateException("Invalid PlaceholderVerticalAlign".toString());
            }
            c0708a = this;
            charSequence2 = spannableString;
        }
        charSequence2 = charSequence;
        c0708a.f4681h = charSequence2;
        c0708a.f4682i = new C7460g(charSequence2, c0708a.f4680g, c0708a.f4685l);
    }

    @Override // p231l1.InterfaceC7210d
    /* JADX INFO: renamed from: a */
    public final boolean mo2562a() {
        C9181g c9181g = this.f4683j;
        boolean z10 = false;
        if (c9181g != null ? c9181g.m17513b() : false) {
            z10 = true;
        } else if (!this.f4684k) {
            this.f4675b.getClass();
            C9178d c9178d = C9179e.f47718a;
            C9178d c9178d2 = C9179e.f47718a;
            InterfaceC5301c1<Boolean> interfaceC5301c1M17511a = c9178d2.f47715a;
            if (interfaceC5301c1M17511a == null) {
                if (C0892f.m3520c()) {
                    interfaceC5301c1M17511a = c9178d2.m17511a();
                    c9178d2.f47715a = interfaceC5301c1M17511a;
                } else {
                    interfaceC5301c1M17511a = C5206f.f33275j;
                }
            }
            if (interfaceC5301c1M17511a.getValue().booleanValue()) {
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p231l1.InterfaceC7210d
    /* JADX INFO: renamed from: b */
    public final float mo2563b() {
        C7460g c7460g = this.f4682i;
        if (!Float.isNaN(c7460g.f41291e)) {
            return c7460g.f41291e;
        }
        CharSequence charSequence = c7460g.f41287a;
        C5207g.m11111f(charSequence, "text");
        TextPaint textPaint = c7460g.f41288b;
        C5207g.m11111f(textPaint, "paint");
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        lineInstance.setText(new C7457d(charSequence, charSequence.length()));
        int i10 = 0;
        PriorityQueue<Pair> priorityQueue = new PriorityQueue(10, new C7461h(0));
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new Pair(Integer.valueOf(i10), Integer.valueOf(next)));
            } else {
                Pair pair = (Pair) priorityQueue.peek();
                if (pair != null && ((Number) pair.f38013b).intValue() - ((Number) pair.f38012a).intValue() < next - i10) {
                    priorityQueue.poll();
                    priorityQueue.add(new Pair(Integer.valueOf(i10), Integer.valueOf(next)));
                }
            }
            i10 = next;
        }
        float fMax = 0.0f;
        for (Pair pair2 : priorityQueue) {
            fMax = Math.max(fMax, Layout.getDesiredWidth(charSequence, ((Number) pair2.f38012a).intValue(), ((Number) pair2.f38013b).intValue(), textPaint));
        }
        c7460g.f41291e = fMax;
        return fMax;
    }

    @Override // p231l1.InterfaceC7210d
    /* JADX INFO: renamed from: c */
    public final float mo2564c() {
        return this.f4682i.m14832b();
    }
}
