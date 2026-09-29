package p388t1;

import ae.C0062b;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.p017ui.text.C0689a;
import androidx.compose.p017ui.text.C0691b;
import androidx.compose.p017ui.text.font.AbstractC0696b;
import androidx.compose.p017ui.text.platform.extensions.C0709a;
import androidx.compose.p017ui.text.style.TextForegroundStyle;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import p231l1.AbstractC7219m;
import p231l1.C7214h;
import p231l1.C7220n;
import p231l1.C7221o;
import p328q1.C8471h;
import p328q1.C8476m;
import p376s1.C8948d;
import p387t0.C9169u;
import p403u1.C9378a;
import p445w1.C9793c;
import p445w1.C9798h;
import p445w1.C9800j;
import p470x1.InterfaceC10015c;

/* JADX INFO: renamed from: t1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9175a {
    /* JADX WARN: Code duplicated, block: B:80:0x0198  */
    /* JADX WARN: Code duplicated, block: B:98:0x019b A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: a */
    public static final SpannableString m17506a(C0689a c0689a, InterfaceC10015c interfaceC10015c, AbstractC0696b.a aVar) {
        ?? arrayList;
        int i10;
        List list;
        boolean z10;
        boolean z11;
        C5207g.m11111f(interfaceC10015c, "density");
        C5207g.m11111f(aVar, "fontFamilyResolver");
        SpannableString spannableString = new SpannableString(c0689a.f4523a);
        List<C0689a.b<C7214h>> list2 = c0689a.f4524b;
        if (list2 != null) {
            int size = list2.size();
            int i11 = 0;
            while (i11 < size) {
                C0689a.b<C7214h> bVar = list2.get(i11);
                C7214h c7214h = bVar.f4536a;
                int i12 = bVar.f4537b;
                int i13 = bVar.f4538c;
                long jM14529b = c7214h.m14529b();
                long j10 = c7214h.f40571b;
                List<C0689a.b<C7214h>> list3 = list2;
                C0709a.m2610c(spannableString, (C9169u.m17497c(jM14529b, c7214h.m14529b()) ? c7214h.f40570a : (jM14529b > C9169u.f47703f ? 1 : (jM14529b == C9169u.f47703f ? 0 : -1)) != 0 ? new C9793c(jM14529b) : TextForegroundStyle.C0710a.f4688a).mo2615a(), i12, i13);
                C0709a.m2611d(spannableString, j10, interfaceC10015c, i12, i13);
                C8476m c8476m = c7214h.f40572c;
                C8471h c8471h = c7214h.f40573d;
                if (c8476m != null || c8471h != null) {
                    if (c8476m == null) {
                        c8476m = C8476m.f45650f;
                    }
                    spannableString.setSpan(new StyleSpan(C0062b.m319W0(c8476m, c8471h != null ? c8471h.f45643a : 0)), i12, i13, 33);
                }
                C9798h c9798h = c7214h.f40582m;
                if (c9798h != null) {
                    int i14 = c9798h.f49914a;
                    if ((1 | i14) == i14) {
                        spannableString.setSpan(new UnderlineSpan(), i12, i13, 33);
                    }
                    if ((2 | i14) == i14) {
                        spannableString.setSpan(new StrikethroughSpan(), i12, i13, 33);
                    }
                }
                C9800j c9800j = c7214h.f40579j;
                if (c9800j != null) {
                    spannableString.setSpan(new ScaleXSpan(c9800j.f49917a), i12, i13, 33);
                }
                C8948d c8948d = c7214h.f40580k;
                if (c8948d != null) {
                    C0709a.m2612e(spannableString, C9378a.f48170a.m17748a(c8948d), i12, i13);
                }
                C0709a.m2609b(spannableString, c7214h.f40581l, i12, i13);
                i11++;
                list2 = list3;
            }
        }
        int length = c0689a.length();
        List<C0689a.b<? extends Object>> list4 = c0689a.f4526d;
        if (list4 != null) {
            arrayList = new ArrayList(list4.size());
            int size2 = list4.size();
            for (int i15 = 0; i15 < size2; i15++) {
                C0689a.b<? extends Object> bVar2 = list4.get(i15);
                C0689a.b<? extends Object> bVar3 = bVar2;
                if ((bVar3.f4536a instanceof AbstractC7219m) && C0691b.m2583c(0, length, bVar3.f4537b, bVar3.f4538c)) {
                    arrayList.add(bVar2);
                }
            }
        } else {
            arrayList = EmptyList.f38032a;
        }
        C5207g.m11109d(arrayList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        int size3 = arrayList.size();
        for (int i16 = 0; i16 < size3; i16++) {
            C0689a.b bVar4 = (C0689a.b) arrayList.get(i16);
            AbstractC7219m abstractC7219m = (AbstractC7219m) bVar4.f4536a;
            C5207g.m11111f(abstractC7219m, "<this>");
            if (!(abstractC7219m instanceof C7221o)) {
                throw new NoWhenBranchMatchedException();
            }
            TtsSpan ttsSpanBuild = new TtsSpan.VerbatimBuilder(((C7221o) abstractC7219m).f40603a).build();
            C5207g.m11110e(ttsSpanBuild, "builder.build()");
            spannableString.setSpan(ttsSpanBuild, bVar4.f4537b, bVar4.f4538c, 33);
        }
        int length2 = c0689a.length();
        if (list4 != null) {
            ArrayList arrayList2 = new ArrayList(list4.size());
            int size4 = list4.size();
            for (int i17 = 0; i17 < size4; i17++) {
                C0689a.b<? extends Object> bVar5 = list4.get(i17);
                C0689a.b<? extends Object> bVar6 = bVar5;
                if (bVar6.f4536a instanceof C7220n) {
                    z10 = false;
                    if (C0691b.m2583c(0, length2, bVar6.f4537b, bVar6.f4538c)) {
                        z11 = true;
                    }
                    if (z11) {
                        arrayList2.add(bVar5);
                    }
                } else {
                    z10 = false;
                }
                z11 = z10;
                if (z11) {
                    arrayList2.add(bVar5);
                }
            }
            i10 = 0;
            list = arrayList2;
        } else {
            i10 = 0;
            list = EmptyList.f38032a;
        }
        C5207g.m11109d(list, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        int size5 = list.size();
        while (i10 < size5) {
            C0689a.b bVar7 = (C0689a.b) list.get(i10);
            C7220n c7220n = (C7220n) bVar7.f4536a;
            C5207g.m11111f(c7220n, "<this>");
            spannableString.setSpan(new URLSpan(c7220n.f40602a), bVar7.f4537b, bVar7.f4538c, 33);
            i10++;
        }
        return spannableString;
    }
}
