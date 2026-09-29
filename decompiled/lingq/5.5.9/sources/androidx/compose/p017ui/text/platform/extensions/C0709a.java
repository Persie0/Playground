package androidx.compose.p017ui.text.platform.extensions;

import android.graphics.Typeface;
import android.support.v4.media.AbstractC0140a;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.p017ui.text.C0689a;
import androidx.compose.p017ui.text.C0691b;
import androidx.compose.p017ui.text.font.AbstractC0696b;
import cm.InterfaceC2057q;
import cm.InterfaceC2058r;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.C6744b;
import p231l1.C7214h;
import p231l1.C7218l;
import p285o1.C7888a;
import p285o1.C7889b;
import p285o1.C7892e;
import p285o1.C7893f;
import p285o1.C7897j;
import p285o1.C7898k;
import p285o1.C7899l;
import p285o1.C7900m;
import p328q1.C8471h;
import p328q1.C8472i;
import p328q1.C8476m;
import p338qd.C8573r0;
import p338qd.C8584v;
import p375s0.C8941c;
import p376s1.C8948d;
import p387t0.AbstractC9150i0;
import p387t0.AbstractC9161o;
import p387t0.C9152j0;
import p387t0.C9156l0;
import p387t0.C9169u;
import p403u1.C9378a;
import p403u1.C9380c;
import p425v1.C9625a;
import p425v1.C9626b;
import p445w1.C9791a;
import p445w1.C9798h;
import p445w1.C9800j;
import p470x1.C10023k;
import p470x1.C10024l;
import p470x1.InterfaceC10015c;
import sl.C9072e;

/* JADX INFO: renamed from: androidx.compose.ui.text.platform.extensions.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0709a {
    /* JADX INFO: renamed from: a */
    public static final float m2608a(long j10, float f3, InterfaceC10015c interfaceC10015c) {
        long jM18631b = C10023k.m18631b(j10);
        if (C10024l.m18634a(jM18631b, 4294967296L)) {
            return interfaceC10015c.mo1459A0(j10);
        }
        if (C10024l.m18634a(jM18631b, 8589934592L)) {
            return C10023k.m18632c(j10) * f3;
        }
        return Float.NaN;
    }

    /* JADX INFO: renamed from: b */
    public static final void m2609b(Spannable spannable, long j10, int i10, int i11) {
        if (j10 != C9169u.f47703f) {
            m2612e(spannable, new BackgroundColorSpan(C8584v.m16780C(j10)), i10, i11);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m2610c(Spannable spannable, long j10, int i10, int i11) {
        if (j10 != C9169u.f47703f) {
            m2612e(spannable, new ForegroundColorSpan(C8584v.m16780C(j10)), i10, i11);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m2611d(Spannable spannable, long j10, InterfaceC10015c interfaceC10015c, int i10, int i11) {
        C5207g.m11111f(interfaceC10015c, "density");
        long jM18631b = C10023k.m18631b(j10);
        if (C10024l.m18634a(jM18631b, 4294967296L)) {
            m2612e(spannable, new AbsoluteSizeSpan(C8573r0.m16710Y0(interfaceC10015c.mo1459A0(j10)), false), i10, i11);
        } else {
            if (C10024l.m18634a(jM18631b, 8589934592L)) {
                m2612e(spannable, new RelativeSizeSpan(C10023k.m18632c(j10)), i10, i11);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m2612e(Spannable spannable, Object obj, int i10, int i11) {
        C5207g.m11111f(spannable, "<this>");
        C5207g.m11111f(obj, "span");
        spannable.setSpan(obj, i10, i11, 33);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static final void m2613f(final Spannable spannable, C7218l c7218l, List<C0689a.b<C7214h>> list, InterfaceC10015c interfaceC10015c, final InterfaceC2058r<? super AbstractC0696b, ? super C8476m, ? super C8471h, ? super C8472i, ? extends Typeface> interfaceC2058r) {
        long j10;
        int i10;
        int i11;
        boolean z10;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            boolean z11 = true;
            if (i13 >= size) {
                break;
            }
            C0689a.b<C7214h> bVar = list.get(i13);
            C0689a.b<C7214h> bVar2 = bVar;
            if (!C9380c.m17751a(bVar2.f4536a) && bVar2.f4536a.f40574e == null) {
                z11 = false;
            }
            if (z11) {
                arrayList.add(bVar);
            }
            i13++;
        }
        C7214h c7214h = c7218l.f40600a;
        C7214h c7214h2 = C9380c.m17751a(c7214h) || c7214h.f40574e != null ? new C7214h(0L, 0L, c7214h.f40572c, c7214h.f40573d, c7214h.f40574e, c7214h.f40575f, (String) null, 0L, (C9791a) null, (C9800j) null, (C8948d) null, 0L, (C9798h) null, (C9152j0) null, 16323) : null;
        InterfaceC2057q<C7214h, Integer, Integer, C9072e> interfaceC2057q = new InterfaceC2057q<C7214h, Integer, Integer, C9072e>() { // from class: androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt$setFontAttributes$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // cm.InterfaceC2057q
            /* JADX INFO: renamed from: M */
            public final C9072e mo1343M(C7214h c7214h3, Integer num, Integer num2) {
                C7214h c7214h4 = c7214h3;
                int iIntValue = num.intValue();
                int iIntValue2 = num2.intValue();
                C5207g.m11111f(c7214h4, "spanStyle");
                C8476m c8476m = c7214h4.f40572c;
                if (c8476m == null) {
                    c8476m = C8476m.f45650f;
                }
                C8471h c8471h = c7214h4.f40573d;
                C8471h c8471h2 = new C8471h(c8471h != null ? c8471h.f45643a : 0);
                C8472i c8472i = c7214h4.f40574e;
                spannable.setSpan(new C7900m(interfaceC2058r.mo1851T(c7214h4.f40575f, c8476m, c8471h2, new C8472i(c8472i != null ? c8472i.f45644a : 1))), iIntValue, iIntValue2, 33);
                return C9072e.f47360a;
            }
        };
        if (arrayList.size() > 1) {
            int size2 = arrayList.size();
            int i14 = size2 * 2;
            Integer[] numArr = new Integer[i14];
            for (int i15 = 0; i15 < i14; i15++) {
                numArr[i15] = 0;
            }
            int size3 = arrayList.size();
            for (int i16 = 0; i16 < size3; i16++) {
                C0689a.b bVar3 = (C0689a.b) arrayList.get(i16);
                numArr[i16] = Integer.valueOf(bVar3.f4537b);
                numArr[i16 + size2] = Integer.valueOf(bVar3.f4538c);
            }
            Integer[] numArr2 = numArr;
            if (numArr2.length > 1) {
                Arrays.sort(numArr2);
            }
            int iIntValue = ((Number) C6744b.m13379k0(numArr)).intValue();
            int i17 = 0;
            while (i17 < i14) {
                int iIntValue2 = numArr[i17].intValue();
                if (iIntValue2 != iIntValue) {
                    int size4 = arrayList.size();
                    C7214h c7214h3 = c7214h2;
                    for (int i18 = i12; i18 < size4; i18++) {
                        C0689a.b bVar4 = (C0689a.b) arrayList.get(i18);
                        int i19 = bVar4.f4537b;
                        int i20 = bVar4.f4538c;
                        if (i19 != i20 && C0691b.m2583c(iIntValue, iIntValue2, i19, i20)) {
                            C7214h c7214hM14531d = (C7214h) bVar4.f4536a;
                            if (c7214h3 != null) {
                                c7214hM14531d = c7214h3.m14531d(c7214hM14531d);
                            }
                            c7214h3 = c7214hM14531d;
                        }
                    }
                    if (c7214h3 != null) {
                        interfaceC2057q.mo1343M(c7214h3, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
                    }
                    iIntValue = iIntValue2;
                }
                i17++;
                i12 = 0;
            }
        } else if (!arrayList.isEmpty()) {
            C7214h c7214hM14531d2 = (C7214h) ((C0689a.b) arrayList.get(0)).f4536a;
            if (c7214h2 != null) {
                c7214hM14531d2 = c7214h2.m14531d(c7214hM14531d2);
            }
            interfaceC2057q.mo1343M(c7214hM14531d2, Integer.valueOf(((C0689a.b) arrayList.get(0)).f4537b), Integer.valueOf(((C0689a.b) arrayList.get(0)).f4538c));
        }
        int size5 = list.size();
        int i21 = 0;
        boolean z12 = false;
        while (true) {
            j10 = 4294967296L;
            if (i21 >= size5) {
                break;
            }
            C0689a.b<C7214h> bVar5 = list.get(i21);
            int i22 = bVar5.f4537b;
            if (i22 >= 0 && i22 < spannable.length() && (i11 = bVar5.f4538c) > i22 && i11 <= spannable.length()) {
                int i23 = bVar5.f4537b;
                int i24 = bVar5.f4538c;
                C7214h c7214h4 = bVar5.f4536a;
                C9791a c9791a = c7214h4.f40578i;
                if (c9791a != null) {
                    m2612e(spannable, new C7888a(c9791a.f49900a), i23, i24);
                }
                m2610c(spannable, c7214h4.m14529b(), i23, i24);
                AbstractC9161o abstractC9161oM14528a = c7214h4.m14528a();
                float fMo2614A = c7214h4.f40570a.mo2614A();
                if (abstractC9161oM14528a != null) {
                    if (abstractC9161oM14528a instanceof C9156l0) {
                        m2610c(spannable, ((C9156l0) abstractC9161oM14528a).f47684a, i23, i24);
                    } else if (abstractC9161oM14528a instanceof AbstractC9150i0) {
                        m2612e(spannable, new C9626b((AbstractC9150i0) abstractC9161oM14528a, fMo2614A), i23, i24);
                    }
                }
                C9798h c9798h = c7214h4.f40582m;
                if (c9798h != null) {
                    int i25 = c9798h.f49914a;
                    z10 = true;
                    m2612e(spannable, new C7899l((1 | i25) == i25, (2 | i25) == i25), i23, i24);
                } else {
                    z10 = true;
                }
                m2611d(spannable, c7214h4.f40571b, interfaceC10015c, i23, i24);
                String str = c7214h4.f40576g;
                if (str != null) {
                    m2612e(spannable, new C7889b(str), i23, i24);
                }
                C9800j c9800j = c7214h4.f40579j;
                if (c9800j != null) {
                    m2612e(spannable, new ScaleXSpan(c9800j.f49917a), i23, i24);
                    m2612e(spannable, new C7898k(c9800j.f49918b), i23, i24);
                }
                C8948d c8948d = c7214h4.f40580k;
                if (c8948d != null) {
                    m2612e(spannable, C9378a.f48170a.m17748a(c8948d), i23, i24);
                }
                m2609b(spannable, c7214h4.f40581l, i23, i24);
                C9152j0 c9152j0 = c7214h4.f40583n;
                if (c9152j0 != null) {
                    int iM16780C = C8584v.m16780C(c9152j0.f47680a);
                    long j11 = c9152j0.f47681b;
                    float fM17164c = C8941c.m17164c(j11);
                    float fM17165d = C8941c.m17165d(j11);
                    float f3 = c9152j0.f47682c;
                    if (f3 == 0.0f ? z10 : false) {
                        f3 = Float.MIN_VALUE;
                    }
                    m2612e(spannable, new C7897j(fM17164c, fM17165d, f3, iM16780C), i23, i24);
                }
                AbstractC0140a abstractC0140a = c7214h4.f40584o;
                if (abstractC0140a != null) {
                    m2612e(spannable, new C9625a(abstractC0140a), i23, i24);
                }
                if ((C10024l.m18634a(C10023k.m18631b(c7214h4.f40577h), 4294967296L) || C10024l.m18634a(C10023k.m18631b(c7214h4.f40577h), 8589934592L)) ? z10 : false) {
                    z12 = z10;
                }
            }
            i21++;
        }
        if (z12) {
            int size6 = list.size();
            int i26 = 0;
            while (i26 < size6) {
                C0689a.b<C7214h> bVar6 = list.get(i26);
                int i27 = bVar6.f4537b;
                C7214h c7214h5 = bVar6.f4536a;
                if (i27 >= 0 && i27 < spannable.length() && (i10 = bVar6.f4538c) > i27 && i10 <= spannable.length()) {
                    long j12 = c7214h5.f40577h;
                    long jM18631b = C10023k.m18631b(j12);
                    Object c7893f = C10024l.m18634a(jM18631b, j10) ? new C7893f(interfaceC10015c.mo1459A0(j12)) : C10024l.m18634a(jM18631b, 8589934592L) ? new C7892e(C10023k.m18632c(j12)) : null;
                    if (c7893f != null) {
                        m2612e(spannable, c7893f, i27, i10);
                    }
                }
                i26++;
                j10 = 4294967296L;
            }
        }
    }
}
