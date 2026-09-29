package androidx.compose.p017ui.text.font;

import android.graphics.Typeface;
import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlinx.coroutines.CoroutineStart;
import no.C7814a0;
import no.C7828f;
import p260m8.C7499b;
import p328q1.C8465b;
import p328q1.C8466c;
import p328q1.C8469f;
import p328q1.C8470g;
import p328q1.C8473j;
import p328q1.C8476m;
import p328q1.C8477n;
import p328q1.C8478o;
import p328q1.C8486w;
import p328q1.C8487x;
import p328q1.InterfaceC8468e;
import p328q1.InterfaceC8479p;
import p328q1.InterfaceC8480q;
import p385sf.C9000b;
import sl.C9072e;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0697c implements AbstractC0696b.a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8479p f4630a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0701g f4631b;

    /* JADX INFO: renamed from: c */
    public final C8487x f4632c;

    /* JADX INFO: renamed from: d */
    public final C0699e f4633d;

    /* JADX INFO: renamed from: e */
    public final C0700f f4634e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2052l<C8486w, Object> f4635f;

    public C0697c(AndroidFontLoader androidFontLoader, C8465b c8465b) {
        C8487x c8487x = C8469f.f45639a;
        C0699e c0699e = new C0699e(C8469f.f45640b);
        C0700f c0700f = new C0700f();
        C5207g.m11111f(c8487x, "typefaceRequestCache");
        this.f4630a = androidFontLoader;
        this.f4631b = c8465b;
        this.f4632c = c8487x;
        this.f4633d = c0699e;
        this.f4634e = c0700f;
        this.f4635f = new FontFamilyResolverImpl$createDefaultTypeface$1(this);
    }

    @Override // androidx.compose.p017ui.text.font.AbstractC0696b.a
    /* JADX INFO: renamed from: a */
    public final InterfaceC0703i mo2595a(AbstractC0696b abstractC0696b, C8476m c8476m, int i10, int i11) {
        C5207g.m11111f(c8476m, "fontWeight");
        InterfaceC0701g interfaceC0701g = this.f4631b;
        interfaceC0701g.getClass();
        int i12 = InterfaceC0701g.f4640a;
        C8476m c8476mMo2599a = interfaceC0701g.mo2599a(c8476m);
        this.f4630a.mo2590c();
        return m2596b(new C8486w(abstractC0696b, c8476mMo2599a, i10, i11, null));
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: b */
    public final InterfaceC0703i m2596b(final C8486w c8486w) {
        InterfaceC0703i interfaceC0703iM16201a;
        final C8487x c8487x = this.f4632c;
        InterfaceC2052l<InterfaceC2052l<? super InterfaceC0703i, ? extends C9072e>, InterfaceC0703i> interfaceC2052l = new InterfaceC2052l<InterfaceC2052l<? super InterfaceC0703i, ? extends C9072e>, InterfaceC0703i>() { // from class: androidx.compose.ui.text.font.FontFamilyResolverImpl$resolve$result$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Code duplicated, block: B:15:0x0074  */
            /* JADX WARN: Code duplicated, block: B:256:0x0453  */
            /* JADX WARN: Code duplicated, block: B:257:0x0455  */
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final InterfaceC0703i mo528n(InterfaceC2052l<? super InterfaceC0703i, ? extends C9072e> interfaceC2052l2) {
                ArrayList arrayList;
                Pair pair;
                InterfaceC0703i aVar;
                Object objMo2588a;
                C0695a.a aVarM16201a;
                Object objM14967u;
                ArrayList arrayList2;
                boolean z10;
                Typeface typefaceMo429g;
                InterfaceC2052l<? super InterfaceC0703i, ? extends C9072e> interfaceC2052l3 = interfaceC2052l2;
                C5207g.m11111f(interfaceC2052l3, "onAsyncCompletion");
                C0697c c0697c = this.f4615b;
                C0699e c0699e = c0697c.f4633d;
                C8486w c8486w2 = c8486w;
                InterfaceC8479p interfaceC8479p = c0697c.f4630a;
                InterfaceC2052l<C8486w, Object> interfaceC2052l4 = c0697c.f4635f;
                c0699e.getClass();
                C5207g.m11111f(c8486w2, "typefaceRequest");
                C5207g.m11111f(interfaceC8479p, "platformFontLoader");
                C5207g.m11111f(interfaceC2052l4, "createDefaultTypeface");
                AbstractC0696b abstractC0696b = c8486w2.f45666a;
                InterfaceC0703i.b bVar = null;
                int i10 = 1;
                if (abstractC0696b instanceof C8470g) {
                    ArrayList arrayList3 = ((C8470g) abstractC0696b).f45642d;
                    C8476m c8476m = c8486w2.f45667b;
                    int i11 = c8486w2.f45668c;
                    C5207g.m11111f(arrayList3, "fontList");
                    C5207g.m11111f(c8476m, "fontWeight");
                    ArrayList arrayList4 = new ArrayList(arrayList3.size());
                    int size = arrayList3.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        Object obj = arrayList3.get(i12);
                        InterfaceC8468e interfaceC8468e = (InterfaceC8468e) obj;
                        if (!C5207g.m11106a(interfaceC8468e.mo16544b(), c8476m)) {
                            z10 = false;
                        } else if (interfaceC8468e.mo16545c() == i11) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            arrayList4.add(obj);
                        }
                    }
                    if (!arrayList4.isEmpty()) {
                        arrayList = arrayList4;
                    } else {
                        ArrayList arrayList5 = new ArrayList(arrayList3.size());
                        int size2 = arrayList3.size();
                        for (int i13 = 0; i13 < size2; i13++) {
                            Object obj2 = arrayList3.get(i13);
                            if (((InterfaceC8468e) obj2).mo16545c() == i11) {
                                arrayList5.add(obj2);
                            }
                        }
                        if (!arrayList5.isEmpty()) {
                            arrayList3 = arrayList5;
                        }
                        if (c8476m.compareTo(C8476m.f45646b) < 0) {
                            int size3 = arrayList3.size();
                            C8476m c8476m2 = null;
                            C8476m c8476m3 = null;
                            for (int i14 = 0; i14 < size3; i14++) {
                                C8476m c8476mMo16544b = ((InterfaceC8468e) arrayList3.get(i14)).mo16544b();
                                if (c8476mMo16544b.compareTo(c8476m) >= 0) {
                                    if (c8476mMo16544b.compareTo(c8476m) <= 0) {
                                        c8476m2 = c8476mMo16544b;
                                        c8476m3 = c8476m2;
                                        break;
                                    }
                                    if (c8476m3 == null || c8476mMo16544b.compareTo(c8476m3) < 0) {
                                        c8476m3 = c8476mMo16544b;
                                    }
                                } else if (c8476m2 == null || c8476mMo16544b.compareTo(c8476m2) > 0) {
                                    c8476m2 = c8476mMo16544b;
                                }
                            }
                            if (c8476m2 == null) {
                                c8476m2 = c8476m3;
                            }
                            arrayList2 = new ArrayList(arrayList3.size());
                            int size4 = arrayList3.size();
                            for (int i15 = 0; i15 < size4; i15++) {
                                Object obj3 = arrayList3.get(i15);
                                if (C5207g.m11106a(((InterfaceC8468e) obj3).mo16544b(), c8476m2)) {
                                    arrayList2.add(obj3);
                                }
                            }
                        } else {
                            C8476m c8476m4 = C8476m.f45647c;
                            if (c8476m.compareTo(c8476m4) > 0) {
                                int size5 = arrayList3.size();
                                C8476m c8476m5 = null;
                                C8476m c8476m6 = null;
                                for (int i16 = 0; i16 < size5; i16++) {
                                    C8476m c8476mMo16544b2 = ((InterfaceC8468e) arrayList3.get(i16)).mo16544b();
                                    if (c8476mMo16544b2.compareTo(c8476m) >= 0) {
                                        if (c8476mMo16544b2.compareTo(c8476m) <= 0) {
                                            c8476m5 = c8476mMo16544b2;
                                            c8476m6 = c8476m5;
                                            break;
                                        }
                                        if (c8476m6 == null || c8476mMo16544b2.compareTo(c8476m6) < 0) {
                                            c8476m6 = c8476mMo16544b2;
                                        }
                                    } else if (c8476m5 == null || c8476mMo16544b2.compareTo(c8476m5) > 0) {
                                        c8476m5 = c8476mMo16544b2;
                                    }
                                }
                                if (c8476m6 != null) {
                                    c8476m5 = c8476m6;
                                }
                                arrayList2 = new ArrayList(arrayList3.size());
                                int size6 = arrayList3.size();
                                for (int i17 = 0; i17 < size6; i17++) {
                                    Object obj4 = arrayList3.get(i17);
                                    if (C5207g.m11106a(((InterfaceC8468e) obj4).mo16544b(), c8476m5)) {
                                        arrayList2.add(obj4);
                                    }
                                }
                            } else {
                                int size7 = arrayList3.size();
                                C8476m c8476m7 = null;
                                C8476m c8476m8 = null;
                                for (int i18 = 0; i18 < size7; i18++) {
                                    C8476m c8476mMo16544b3 = ((InterfaceC8468e) arrayList3.get(i18)).mo16544b();
                                    if (c8476mMo16544b3.compareTo(c8476m4) <= 0) {
                                        if (c8476mMo16544b3.compareTo(c8476m) >= 0) {
                                            if (c8476mMo16544b3.compareTo(c8476m) <= 0) {
                                                c8476m7 = c8476mMo16544b3;
                                                c8476m8 = c8476m7;
                                                break;
                                            }
                                            if (c8476m8 == null || c8476mMo16544b3.compareTo(c8476m8) < 0) {
                                                c8476m8 = c8476mMo16544b3;
                                            }
                                        } else if (c8476m7 == null || c8476mMo16544b3.compareTo(c8476m7) > 0) {
                                            c8476m7 = c8476mMo16544b3;
                                        }
                                    }
                                }
                                if (c8476m8 != null) {
                                    c8476m7 = c8476m8;
                                }
                                arrayList = new ArrayList(arrayList3.size());
                                int size8 = arrayList3.size();
                                for (int i19 = 0; i19 < size8; i19++) {
                                    Object obj5 = arrayList3.get(i19);
                                    if (C5207g.m11106a(((InterfaceC8468e) obj5).mo16544b(), c8476m7)) {
                                        arrayList.add(obj5);
                                    }
                                }
                                if (arrayList.isEmpty()) {
                                    C8476m c8476m9 = C8476m.f45647c;
                                    int size9 = arrayList3.size();
                                    C8476m c8476m10 = null;
                                    C8476m c8476m11 = null;
                                    for (int i20 = 0; i20 < size9; i20++) {
                                        C8476m c8476mMo16544b4 = ((InterfaceC8468e) arrayList3.get(i20)).mo16544b();
                                        if (c8476m9 == null || c8476mMo16544b4.compareTo(c8476m9) >= 0) {
                                            if (c8476mMo16544b4.compareTo(c8476m) >= 0) {
                                                if (c8476mMo16544b4.compareTo(c8476m) <= 0) {
                                                    c8476m10 = c8476mMo16544b4;
                                                    c8476m11 = c8476m10;
                                                    break;
                                                }
                                                if (c8476m11 == null || c8476mMo16544b4.compareTo(c8476m11) < 0) {
                                                    c8476m11 = c8476mMo16544b4;
                                                }
                                            } else if (c8476m10 == null || c8476mMo16544b4.compareTo(c8476m10) > 0) {
                                                c8476m10 = c8476mMo16544b4;
                                            }
                                        }
                                    }
                                    if (c8476m11 != null) {
                                        c8476m10 = c8476m11;
                                    }
                                    arrayList2 = new ArrayList(arrayList3.size());
                                    int size10 = arrayList3.size();
                                    for (int i21 = 0; i21 < size10; i21++) {
                                        Object obj6 = arrayList3.get(i21);
                                        if (C5207g.m11106a(((InterfaceC8468e) obj6).mo16544b(), c8476m10)) {
                                            arrayList2.add(obj6);
                                        }
                                    }
                                }
                            }
                        }
                        arrayList4 = arrayList2;
                        arrayList = arrayList4;
                    }
                    C0695a c0695a = c0699e.f4637a;
                    int size11 = arrayList.size();
                    ArrayList arrayListM17254t = null;
                    int i22 = 0;
                    while (true) {
                        if (i22 >= size11) {
                            pair = new Pair(arrayListM17254t, ((FontFamilyResolverImpl$createDefaultTypeface$1) interfaceC2052l4).mo528n(c8486w2));
                            break;
                        }
                        InterfaceC8468e interfaceC8468e2 = (InterfaceC8468e) arrayList.get(i22);
                        int iMo16543a = interfaceC8468e2.mo16543a();
                        if ((iMo16543a == 0 ? i10 : 0) != 0) {
                            synchronized (c0695a.f4624c) {
                                interfaceC8479p.mo2590c();
                                C0695a.b bVar2 = new C0695a.b(interfaceC8468e2, null);
                                C0695a.a aVarM16201a2 = c0695a.f4622a.m16201a(bVar2);
                                if (aVarM16201a2 == null) {
                                    aVarM16201a2 = c0695a.f4623b.m16205a(bVar2);
                                }
                                if (aVarM16201a2 != null) {
                                    objMo2588a = aVarM16201a2.f4625a;
                                } else {
                                    C9072e c9072e = C9072e.f47360a;
                                    try {
                                        objMo2588a = interfaceC8479p.mo2588a(interfaceC8468e2);
                                        C0695a.m2593a(c0695a, interfaceC8468e2, interfaceC8479p, objMo2588a);
                                    } catch (Exception e10) {
                                        throw new IllegalStateException("Unable to load font " + interfaceC8468e2, e10);
                                    }
                                }
                            }
                            if (objMo2588a != null) {
                                pair = new Pair(arrayListM17254t, C8473j.m16548a(c8486w2.f45669d, objMo2588a, interfaceC8468e2, c8486w2.f45667b, c8486w2.f45668c));
                                break;
                            }
                            throw new IllegalStateException("Unable to load font " + interfaceC8468e2);
                        }
                        if ((iMo16543a == i10 ? i10 : 0) != 0) {
                            synchronized (c0695a.f4624c) {
                                interfaceC8479p.mo2590c();
                                C0695a.b bVar3 = new C0695a.b(interfaceC8468e2, null);
                                C0695a.a aVarM16201a3 = c0695a.f4622a.m16201a(bVar3);
                                if (aVarM16201a3 == null) {
                                    aVarM16201a3 = c0695a.f4623b.m16205a(bVar3);
                                }
                                if (aVarM16201a3 != null) {
                                    objM14967u = aVarM16201a3.f4625a;
                                } else {
                                    C9072e c9072e2 = C9072e.f47360a;
                                    try {
                                        objM14967u = interfaceC8479p.mo2588a(interfaceC8468e2);
                                    } catch (Throwable th2) {
                                        objM14967u = C7499b.m14967u(th2);
                                    }
                                    if (objM14967u instanceof Result.Failure) {
                                        objM14967u = null;
                                    }
                                    C0695a.m2593a(c0695a, interfaceC8468e2, interfaceC8479p, objM14967u);
                                }
                            }
                            if (objM14967u != null) {
                                pair = new Pair(arrayListM17254t, C8473j.m16548a(c8486w2.f45669d, objM14967u, interfaceC8468e2, c8486w2.f45667b, c8486w2.f45668c));
                                break;
                            }
                            i22++;
                            i10 = 1;
                        } else {
                            if (!(iMo16543a == 2)) {
                                throw new IllegalStateException("Unknown font type " + interfaceC8468e2);
                            }
                            c0695a.getClass();
                            interfaceC8479p.mo2590c();
                            C0695a.b bVar4 = new C0695a.b(interfaceC8468e2, null);
                            synchronized (c0695a.f4624c) {
                                aVarM16201a = c0695a.f4622a.m16201a(bVar4);
                                if (aVarM16201a == null) {
                                    aVarM16201a = c0695a.f4623b.m16205a(bVar4);
                                }
                            }
                            if (aVarM16201a != null) {
                                Object obj7 = aVarM16201a.f4625a;
                                if (!(obj7 == null) && obj7 != null) {
                                    pair = new Pair(arrayListM17254t, C8473j.m16548a(c8486w2.f45669d, obj7, interfaceC8468e2, c8486w2.f45667b, c8486w2.f45668c));
                                    break;
                                }
                            } else if (arrayListM17254t == null) {
                                arrayListM17254t = C9000b.m17254t(interfaceC8468e2);
                            } else {
                                arrayListM17254t.add(interfaceC8468e2);
                            }
                            i22++;
                            i10 = 1;
                        }
                    }
                    List list = (List) pair.f38012a;
                    B b10 = pair.f38013b;
                    if (list == null) {
                        aVar = new InterfaceC0703i.b(b10, true);
                    } else {
                        AsyncFontListLoader asyncFontListLoader = new AsyncFontListLoader(list, b10, c8486w2, c0699e.f4637a, interfaceC2052l3, interfaceC8479p);
                        C7828f.m15570d(c0699e.f4638b, null, CoroutineStart.UNDISPATCHED, new FontListFontFamilyTypefaceAdapter$resolve$1(asyncFontListLoader, null), 1);
                        aVar = new InterfaceC0703i.a(asyncFontListLoader);
                    }
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    return aVar;
                }
                C0697c c0697c2 = this.f4615b;
                C0700f c0700f = c0697c2.f4634e;
                C8486w c8486w3 = c8486w;
                InterfaceC8479p interfaceC8479p2 = c0697c2.f4630a;
                InterfaceC2052l<C8486w, Object> interfaceC2052l5 = c0697c2.f4635f;
                c0700f.getClass();
                C5207g.m11111f(c8486w3, "typefaceRequest");
                C5207g.m11111f(interfaceC8479p2, "platformFontLoader");
                C5207g.m11111f(interfaceC2052l5, "createDefaultTypeface");
                AbstractC0696b abstractC0696b2 = c8486w3.f45666a;
                boolean z11 = abstractC0696b2 == null ? true : abstractC0696b2 instanceof C8466c;
                InterfaceC8480q interfaceC8480q = c0700f.f4639a;
                int i23 = c8486w3.f45668c;
                C8476m c8476m12 = c8486w3.f45667b;
                if (!z11) {
                    if (abstractC0696b2 instanceof C8477n) {
                        typefaceMo429g = interfaceC8480q.mo429g((C8477n) abstractC0696b2, c8476m12, i23);
                    } else if (abstractC0696b2 instanceof C8478o) {
                        ((C8478o) abstractC0696b2).getClass();
                        C5207g.m11109d(null, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidTypeface");
                        throw null;
                    }
                    if (bVar != null) {
                        return bVar;
                    }
                    throw new IllegalStateException("Could not load font");
                }
                typefaceMo429g = interfaceC8480q.mo432j(c8476m12, i23);
                bVar = new InterfaceC0703i.b(typefaceMo429g, true);
                if (bVar != null) {
                    return bVar;
                }
                throw new IllegalStateException("Could not load font");
            }
        };
        c8487x.getClass();
        synchronized (c8487x.f45671a) {
            try {
                interfaceC0703iM16201a = c8487x.f45672b.m16201a(c8486w);
                if (interfaceC0703iM16201a == null) {
                    try {
                        interfaceC0703iM16201a = (InterfaceC0703i) interfaceC2052l.mo528n(new InterfaceC2052l<InterfaceC0703i, C9072e>() { // from class: androidx.compose.ui.text.font.TypefaceRequestCache$runCached$currentTypefaceResult$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(InterfaceC0703i interfaceC0703i) {
                                InterfaceC0703i interfaceC0703i2 = interfaceC0703i;
                                C5207g.m11111f(interfaceC0703i2, "finalResult");
                                C8487x c8487x2 = c8487x;
                                C7814a0 c7814a0 = c8487x2.f45671a;
                                C8486w c8486w2 = c8486w;
                                synchronized (c7814a0) {
                                    try {
                                        if (interfaceC0703i2.mo2601b()) {
                                            c8487x2.f45672b.m16202b(c8486w2, interfaceC0703i2);
                                        } else {
                                            c8487x2.f45672b.m16203c(c8486w2);
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                return C9072e.f47360a;
                            }
                        });
                        synchronized (c8487x.f45671a) {
                            if (c8487x.f45672b.m16201a(c8486w) == null && interfaceC0703iM16201a.mo2601b()) {
                                c8487x.f45672b.m16202b(c8486w, interfaceC0703iM16201a);
                            }
                            C9072e c9072e = C9072e.f47360a;
                        }
                    } catch (Exception e10) {
                        throw new IllegalStateException("Could not load font", e10);
                    }
                } else if (!interfaceC0703iM16201a.mo2601b()) {
                    c8487x.f45672b.m16203c(c8486w);
                    interfaceC0703iM16201a = (InterfaceC0703i) interfaceC2052l.mo528n(new InterfaceC2052l<InterfaceC0703i, C9072e>() { // from class: androidx.compose.ui.text.font.TypefaceRequestCache$runCached$currentTypefaceResult$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(InterfaceC0703i interfaceC0703i) {
                            InterfaceC0703i interfaceC0703i2 = interfaceC0703i;
                            C5207g.m11111f(interfaceC0703i2, "finalResult");
                            C8487x c8487x2 = c8487x;
                            C7814a0 c7814a0 = c8487x2.f45671a;
                            C8486w c8486w2 = c8486w;
                            synchronized (c7814a0) {
                                try {
                                    if (interfaceC0703i2.mo2601b()) {
                                        c8487x2.f45672b.m16202b(c8486w2, interfaceC0703i2);
                                    } else {
                                        c8487x2.f45672b.m16203c(c8486w2);
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            return C9072e.f47360a;
                        }
                    });
                    synchronized (c8487x.f45671a) {
                        if (c8487x.f45672b.m16201a(c8486w) == null) {
                            c8487x.f45672b.m16202b(c8486w, interfaceC0703iM16201a);
                        }
                        C9072e c9072e2 = C9072e.f47360a;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC0703iM16201a;
    }
}
