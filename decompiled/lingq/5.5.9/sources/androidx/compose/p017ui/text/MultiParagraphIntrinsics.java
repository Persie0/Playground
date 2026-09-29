package androidx.compose.p017ui.text;

import androidx.compose.p017ui.text.font.AbstractC0696b;
import androidx.compose.p017ui.text.platform.C0708a;
import cm.InterfaceC2041a;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p231l1.C7209c;
import p231l1.C7211e;
import p231l1.C7213g;
import p231l1.C7218l;
import p231l1.InterfaceC7210d;
import p385sf.C9000b;
import p445w1.C9797g;
import p445w1.C9799i;
import p445w1.C9801k;
import p470x1.InterfaceC10015c;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes.dex */
public final class MultiParagraphIntrinsics implements InterfaceC7210d {

    /* JADX INFO: renamed from: a */
    public final C0689a f4456a;

    /* JADX INFO: renamed from: b */
    public final List<C0689a.b<C7213g>> f4457b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC9070c f4458c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC9070c f4459d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f4460e;

    /* JADX WARN: Multi-variable type inference failed */
    public MultiParagraphIntrinsics(C0689a c0689a, C7218l c7218l, List<C0689a.b<C7213g>> list, InterfaceC10015c interfaceC10015c, AbstractC0696b.a aVar) {
        int i10;
        String strSubstring;
        int i11;
        C0689a c0689a2 = c0689a;
        C7218l c7218l2 = c7218l;
        C5207g.m11111f(c0689a2, "annotatedString");
        C5207g.m11111f(list, "placeholders");
        C5207g.m11111f(interfaceC10015c, "density");
        C5207g.m11111f(aVar, "fontFamilyResolver");
        this.f4456a = c0689a2;
        this.f4457b = list;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f4458c = C6740a.m13373b(lazyThreadSafetyMode, new InterfaceC2041a<Float>() { // from class: androidx.compose.ui.text.MultiParagraphIntrinsics$minIntrinsicWidth$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Float mo807E() {
                Object obj;
                InterfaceC7210d interfaceC7210d;
                ArrayList arrayList = this.f4462b.f4460e;
                if (arrayList.isEmpty()) {
                    obj = null;
                } else {
                    Object obj2 = arrayList.get(0);
                    float fMo2563b = ((C7209c) obj2).f40555a.mo2563b();
                    int iM17249o = C9000b.m17249o(arrayList);
                    int i12 = 1;
                    if (1 <= iM17249o) {
                        while (true) {
                            Object obj3 = arrayList.get(i12);
                            float fMo2563b2 = ((C7209c) obj3).f40555a.mo2563b();
                            if (Float.compare(fMo2563b, fMo2563b2) < 0) {
                                obj2 = obj3;
                                fMo2563b = fMo2563b2;
                            }
                            if (i12 == iM17249o) {
                                break;
                            }
                            i12++;
                        }
                    }
                    obj = obj2;
                }
                C7209c c7209c = (C7209c) obj;
                return Float.valueOf((c7209c == null || (interfaceC7210d = c7209c.f40555a) == null) ? 0.0f : interfaceC7210d.mo2563b());
            }
        });
        this.f4459d = C6740a.m13373b(lazyThreadSafetyMode, new InterfaceC2041a<Float>() { // from class: androidx.compose.ui.text.MultiParagraphIntrinsics$maxIntrinsicWidth$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Float mo807E() {
                Object obj;
                InterfaceC7210d interfaceC7210d;
                ArrayList arrayList = this.f4461b.f4460e;
                if (arrayList.isEmpty()) {
                    obj = null;
                } else {
                    Object obj2 = arrayList.get(0);
                    float fMo2564c = ((C7209c) obj2).f40555a.mo2564c();
                    int iM17249o = C9000b.m17249o(arrayList);
                    int i12 = 1;
                    if (1 <= iM17249o) {
                        while (true) {
                            Object obj3 = arrayList.get(i12);
                            float fMo2564c2 = ((C7209c) obj3).f40555a.mo2564c();
                            if (Float.compare(fMo2564c, fMo2564c2) < 0) {
                                obj2 = obj3;
                                fMo2564c = fMo2564c2;
                            }
                            if (i12 == iM17249o) {
                                break;
                            }
                            i12++;
                        }
                    }
                    obj = obj2;
                }
                C7209c c7209c = (C7209c) obj;
                return Float.valueOf((c7209c == null || (interfaceC7210d = c7209c.f40555a) == null) ? 0.0f : interfaceC7210d.mo2564c());
            }
        });
        int i12 = C0691b.f4555a;
        C7211e c7211e = c7218l2.f40601b;
        C5207g.m11111f(c7211e, "defaultParagraphStyle");
        String str = c0689a2.f4523a;
        int length = str.length();
        List list2 = c0689a2.f4525c;
        list2 = list2 == null ? EmptyList.f38032a : list2;
        ArrayList arrayList = new ArrayList();
        int size = list2.size();
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            C0689a.b bVar = (C0689a.b) list2.get(i13);
            C7211e c7211e2 = (C7211e) bVar.f4536a;
            int i15 = bVar.f4537b;
            List list3 = list2;
            if (i15 != i14) {
                arrayList.add(new C0689a.b(i14, i15, c7211e));
            }
            C7211e c7211eM14527a = c7211e.m14527a(c7211e2);
            int i16 = bVar.f4538c;
            arrayList.add(new C0689a.b(i15, i16, c7211eM14527a));
            i13++;
            list2 = list3;
            i14 = i16;
        }
        if (i14 != length) {
            arrayList.add(new C0689a.b(i14, length, c7211e));
        }
        if (arrayList.isEmpty()) {
            i10 = 0;
            arrayList.add(new C0689a.b(0, 0, c7211e));
        } else {
            i10 = 0;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        int i17 = i10;
        while (i17 < size2) {
            C0689a.b bVar2 = (C0689a.b) arrayList.get(i17);
            int i18 = bVar2.f4537b;
            int i19 = bVar2.f4538c;
            if (i18 != i19) {
                strSubstring = str.substring(i18, i19);
                C5207g.m11110e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                strSubstring = "";
            }
            String str2 = strSubstring;
            List listM2582b = C0691b.m2582b(c0689a2, i18, i19);
            C7211e c7211e3 = (C7211e) bVar2.f4536a;
            if (c7211e3.f40559b == null) {
                C9799i c9799i = c7211e.f40559b;
                C9797g c9797g = c7211e3.f40558a;
                long j10 = c7211e3.f40560c;
                C9801k c9801k = c7211e3.f40561d;
                c7211e3.getClass();
                c7211e3 = new C7211e(c9797g, c9799i, j10, c9801k, null, c7211e3.f40562e, c7211e3.f40563f, c7211e3.f40564g);
            }
            C7218l c7218l3 = new C7218l(c7218l2.f40600a, c7211e.m14527a(c7211e3));
            List list4 = listM2582b == null ? EmptyList.f38032a : listM2582b;
            List<C0689a.b<C7213g>> list5 = this.f4457b;
            ArrayList arrayList3 = new ArrayList(list5.size());
            int size3 = list5.size();
            int i20 = 0;
            while (true) {
                i11 = bVar2.f4537b;
                if (i20 >= size3) {
                    break;
                }
                C0689a.b<C7213g> bVar3 = list5.get(i20);
                C0689a.b<C7213g> bVar4 = bVar3;
                C7211e c7211e4 = c7211e;
                if (C0691b.m2583c(i11, i19, bVar4.f4537b, bVar4.f4538c)) {
                    arrayList3.add(bVar3);
                }
                i20++;
                c7211e = c7211e4;
            }
            C7211e c7211e5 = c7211e;
            ArrayList arrayList4 = new ArrayList(arrayList3.size());
            int size4 = arrayList3.size();
            for (int i21 = 0; i21 < size4; i21++) {
                C0689a.b bVar5 = (C0689a.b) arrayList3.get(i21);
                int i22 = bVar5.f4537b;
                int i23 = bVar5.f4538c;
                if (!(i11 <= i22 && i23 <= i19)) {
                    throw new IllegalArgumentException("placeholder can not overlap with paragraph.".toString());
                }
                arrayList4.add(new C0689a.b(i22 - i11, i23 - i11, bVar5.f4536a));
            }
            C5207g.m11111f(list4, "spanStyles");
            arrayList2.add(new C7209c(new C0708a(c7218l3, aVar, interfaceC10015c, str2, list4, arrayList4), i11, i19));
            i17++;
            c0689a2 = c0689a;
            c7218l2 = c7218l;
            size2 = size2;
            c7211e = c7211e5;
            str = str;
        }
        this.f4460e = arrayList2;
    }

    @Override // p231l1.InterfaceC7210d
    /* JADX INFO: renamed from: a */
    public final boolean mo2562a() {
        ArrayList arrayList = this.f4460e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((C7209c) arrayList.get(i10)).f40555a.mo2562a()) {
                return true;
            }
        }
        return false;
    }

    @Override // p231l1.InterfaceC7210d
    /* JADX INFO: renamed from: b */
    public final float mo2563b() {
        return ((Number) this.f4458c.getValue()).floatValue();
    }

    @Override // p231l1.InterfaceC7210d
    /* JADX INFO: renamed from: c */
    public final float mo2564c() {
        return ((Number) this.f4459d.getValue()).floatValue();
    }
}
