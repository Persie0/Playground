package androidx.compose.p017ui.text;

import ae.C0062b;
import androidx.compose.p017ui.text.font.AbstractC0696b;
import androidx.compose.runtime.saveable.SaverKt;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import p231l1.C7211e;
import p231l1.C7214h;
import p231l1.C7217k;
import p231l1.C7220n;
import p231l1.C7221o;
import p252m0.C7452c;
import p252m0.InterfaceC7453d;
import p260m8.C7499b;
import p328q1.C8471h;
import p328q1.C8472i;
import p328q1.C8476m;
import p338qd.C8573r0;
import p375s0.C8941c;
import p376s1.C8945a;
import p376s1.C8947c;
import p376s1.C8948d;
import p376s1.C8950f;
import p385sf.C9000b;
import p387t0.C9152j0;
import p387t0.C9169u;
import p445w1.C9791a;
import p445w1.C9797g;
import p445w1.C9798h;
import p445w1.C9799i;
import p445w1.C9800j;
import p445w1.C9801k;
import p470x1.C10023k;
import p470x1.C10024l;
import sl.C9071d;

/* JADX INFO: loaded from: classes.dex */
public final class SaversKt {

    /* JADX INFO: renamed from: a */
    public static final C7452c f4463a = SaverKt.m1859a(new InterfaceC2056p<InterfaceC7453d, C0689a, Object>() { // from class: androidx.compose.ui.text.SaversKt$AnnotatedStringSaver$1
        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7453d interfaceC7453d, C0689a c0689a) {
            InterfaceC7453d interfaceC7453d2 = interfaceC7453d;
            C0689a c0689a2 = c0689a;
            C5207g.m11111f(interfaceC7453d2, "$this$Saver");
            C5207g.m11111f(c0689a2, "it");
            Object[] objArr = new Object[4];
            C7452c c7452c = SaversKt.f4463a;
            objArr[0] = c0689a2.f4523a;
            Object obj = c0689a2.f4524b;
            if (obj == null) {
                obj = EmptyList.f38032a;
            }
            C7452c c7452c2 = SaversKt.f4464b;
            objArr[1] = SaversKt.m2565a(obj, c7452c2, interfaceC7453d2);
            Object obj2 = c0689a2.f4525c;
            if (obj2 == null) {
                obj2 = EmptyList.f38032a;
            }
            objArr[2] = SaversKt.m2565a(obj2, c7452c2, interfaceC7453d2);
            objArr[3] = SaversKt.m2565a(c0689a2.f4526d, c7452c2, interfaceC7453d2);
            return C9000b.m17237c(objArr);
        }
    }, new InterfaceC2052l<Object, C0689a>() { // from class: androidx.compose.ui.text.SaversKt$AnnotatedStringSaver$2
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C0689a mo528n(Object obj) {
            C5207g.m11111f(obj, "it");
            List list = (List) obj;
            Object obj2 = list.get(1);
            C7452c c7452c = SaversKt.f4464b;
            Boolean bool = Boolean.FALSE;
            List list2 = null;
            List list3 = (C5207g.m11106a(obj2, bool) || obj2 == null) ? null : (List) c7452c.f41273b.mo528n(obj2);
            Object obj3 = list.get(2);
            List list4 = (C5207g.m11106a(obj3, bool) || obj3 == null) ? null : (List) c7452c.f41273b.mo528n(obj3);
            Object obj4 = list.get(0);
            String str = obj4 != null ? (String) obj4 : null;
            C5207g.m11108c(str);
            if (list3 == null || list3.isEmpty()) {
                list3 = null;
            }
            if (list4 == null || list4.isEmpty()) {
                list4 = null;
            }
            Object obj5 = list.get(3);
            if (!C5207g.m11106a(obj5, bool)) {
                list2 = obj5 != null ? (List) c7452c.f41273b.mo528n(obj5) : null;
            }
            return new C0689a(str, list3, list4, list2);
        }
    });

    /* JADX INFO: renamed from: b */
    public static final C7452c f4464b = SaverKt.m1859a(new InterfaceC2056p<InterfaceC7453d, List<? extends C0689a.b<? extends Object>>, Object>() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeListSaver$1
        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7453d interfaceC7453d, List<? extends C0689a.b<? extends Object>> list) {
            InterfaceC7453d interfaceC7453d2 = interfaceC7453d;
            List<? extends C0689a.b<? extends Object>> list2 = list;
            C5207g.m11111f(interfaceC7453d2, "$this$Saver");
            C5207g.m11111f(list2, "it");
            ArrayList arrayList = new ArrayList(list2.size());
            int size = list2.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(SaversKt.m2565a(list2.get(i10), SaversKt.f4465c, interfaceC7453d2));
            }
            return arrayList;
        }
    }, new InterfaceC2052l<Object, List<? extends C0689a.b<? extends Object>>>() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeListSaver$2
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final List<? extends C0689a.b<? extends Object>> mo528n(Object obj) {
            C5207g.m11111f(obj, "it");
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                C0689a.b bVar = (C5207g.m11106a(obj2, Boolean.FALSE) || obj2 == null) ? null : (C0689a.b) SaversKt.f4465c.f41273b.mo528n(obj2);
                C5207g.m11108c(bVar);
                arrayList.add(bVar);
            }
            return arrayList;
        }
    });

    /* JADX INFO: renamed from: c */
    public static final C7452c f4465c = SaverKt.m1859a(new InterfaceC2056p<InterfaceC7453d, C0689a.b<? extends Object>, Object>() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$1

        /* JADX INFO: renamed from: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$1$a */
        public /* synthetic */ class C0687a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f4487a;

            static {
                int[] iArr = new int[AnnotationType.values().length];
                try {
                    iArr[AnnotationType.Paragraph.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AnnotationType.Span.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AnnotationType.VerbatimTts.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AnnotationType.Url.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AnnotationType.String.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f4487a = iArr;
            }
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7453d interfaceC7453d, C0689a.b<? extends Object> bVar) {
            AnnotationType annotationType;
            InterfaceC7453d interfaceC7453d2 = interfaceC7453d;
            C0689a.b<? extends Object> bVar2 = bVar;
            C5207g.m11111f(interfaceC7453d2, "$this$Saver");
            C5207g.m11111f(bVar2, "it");
            Object objM2565a = bVar2.f4536a;
            if (objM2565a instanceof C7211e) {
                annotationType = AnnotationType.Paragraph;
            } else if (objM2565a instanceof C7214h) {
                annotationType = AnnotationType.Span;
            } else if (objM2565a instanceof C7221o) {
                annotationType = AnnotationType.VerbatimTts;
            } else {
                annotationType = objM2565a instanceof C7220n ? AnnotationType.Url : AnnotationType.String;
            }
            int i10 = C0687a.f4487a[annotationType.ordinal()];
            if (i10 == 1) {
                C5207g.m11109d(objM2565a, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                objM2565a = SaversKt.m2565a((C7211e) objM2565a, SaversKt.f4468f, interfaceC7453d2);
            } else if (i10 == 2) {
                C5207g.m11109d(objM2565a, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                objM2565a = SaversKt.m2565a((C7214h) objM2565a, SaversKt.f4469g, interfaceC7453d2);
            } else if (i10 == 3) {
                C5207g.m11109d(objM2565a, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                objM2565a = SaversKt.m2565a((C7221o) objM2565a, SaversKt.f4466d, interfaceC7453d2);
            } else if (i10 == 4) {
                C5207g.m11109d(objM2565a, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                objM2565a = SaversKt.m2565a((C7220n) objM2565a, SaversKt.f4467e, interfaceC7453d2);
            } else {
                if (i10 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                C7452c c7452c = SaversKt.f4463a;
            }
            return C9000b.m17237c(annotationType, objM2565a, Integer.valueOf(bVar2.f4537b), Integer.valueOf(bVar2.f4538c), bVar2.f4539d);
        }
    }, new InterfaceC2052l<Object, C0689a.b<? extends Object>>() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$2

        /* JADX INFO: renamed from: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$2$a */
        public /* synthetic */ class C0688a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f4489a;

            static {
                int[] iArr = new int[AnnotationType.values().length];
                try {
                    iArr[AnnotationType.Paragraph.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AnnotationType.Span.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AnnotationType.VerbatimTts.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AnnotationType.Url.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AnnotationType.String.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f4489a = iArr;
            }
        }

        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C0689a.b<? extends Object> mo528n(Object obj) {
            C5207g.m11111f(obj, "it");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Object obj3 = null;
            AnnotationType annotationType = obj2 != null ? (AnnotationType) obj2 : null;
            C5207g.m11108c(annotationType);
            Object obj4 = list.get(2);
            Integer num = obj4 != null ? (Integer) obj4 : null;
            C5207g.m11108c(num);
            int iIntValue = num.intValue();
            Object obj5 = list.get(3);
            Integer num2 = obj5 != null ? (Integer) obj5 : null;
            C5207g.m11108c(num2);
            int iIntValue2 = num2.intValue();
            Object obj6 = list.get(4);
            String str = obj6 != null ? (String) obj6 : null;
            C5207g.m11108c(str);
            int i10 = C0688a.f4489a[annotationType.ordinal()];
            if (i10 == 1) {
                Object obj7 = list.get(1);
                C7452c c7452c = SaversKt.f4468f;
                if (!C5207g.m11106a(obj7, Boolean.FALSE) && obj7 != null) {
                    obj3 = (C7211e) c7452c.f41273b.mo528n(obj7);
                }
                C5207g.m11108c(obj3);
                return new C0689a.b<>(iIntValue, iIntValue2, obj3, str);
            }
            if (i10 == 2) {
                Object obj8 = list.get(1);
                C7452c c7452c2 = SaversKt.f4469g;
                if (!C5207g.m11106a(obj8, Boolean.FALSE) && obj8 != null) {
                    obj3 = (C7214h) c7452c2.f41273b.mo528n(obj8);
                }
                C5207g.m11108c(obj3);
                return new C0689a.b<>(iIntValue, iIntValue2, obj3, str);
            }
            if (i10 == 3) {
                Object obj9 = list.get(1);
                C7452c c7452c3 = SaversKt.f4466d;
                if (!C5207g.m11106a(obj9, Boolean.FALSE)) {
                    obj3 = obj9 != null ? (C7221o) c7452c3.f41273b.mo528n(obj9) : null;
                }
                C5207g.m11108c(obj3);
                return new C0689a.b<>(iIntValue, iIntValue2, obj3, str);
            }
            if (i10 != 4) {
                if (i10 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                Object obj10 = list.get(1);
                obj3 = obj10 != null ? (String) obj10 : null;
                C5207g.m11108c(obj3);
                return new C0689a.b<>(iIntValue, iIntValue2, obj3, str);
            }
            Object obj11 = list.get(1);
            C7452c c7452c4 = SaversKt.f4467e;
            if (!C5207g.m11106a(obj11, Boolean.FALSE) && obj11 != null) {
                obj3 = (C7220n) c7452c4.f41273b.mo528n(obj11);
            }
            C5207g.m11108c(obj3);
            return new C0689a.b<>(iIntValue, iIntValue2, obj3, str);
        }
    });

    /* JADX INFO: renamed from: d */
    public static final C7452c f4466d = SaverKt.m1859a(new InterfaceC2056p<InterfaceC7453d, C7221o, Object>() { // from class: androidx.compose.ui.text.SaversKt$VerbatimTtsAnnotationSaver$1
        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7453d interfaceC7453d, C7221o c7221o) {
            C7221o c7221o2 = c7221o;
            C5207g.m11111f(interfaceC7453d, "$this$Saver");
            C5207g.m11111f(c7221o2, "it");
            C7452c c7452c = SaversKt.f4463a;
            return c7221o2.f40603a;
        }
    }, new InterfaceC2052l<Object, C7221o>() { // from class: androidx.compose.ui.text.SaversKt$VerbatimTtsAnnotationSaver$2
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C7221o mo528n(Object obj) {
            C5207g.m11111f(obj, "it");
            return new C7221o((String) obj);
        }
    });

    /* JADX INFO: renamed from: e */
    public static final C7452c f4467e = SaverKt.m1859a(new InterfaceC2056p<InterfaceC7453d, C7220n, Object>() { // from class: androidx.compose.ui.text.SaversKt$UrlAnnotationSaver$1
        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7453d interfaceC7453d, C7220n c7220n) {
            C7220n c7220n2 = c7220n;
            C5207g.m11111f(interfaceC7453d, "$this$Saver");
            C5207g.m11111f(c7220n2, "it");
            C7452c c7452c = SaversKt.f4463a;
            return c7220n2.f40602a;
        }
    }, new InterfaceC2052l<Object, C7220n>() { // from class: androidx.compose.ui.text.SaversKt$UrlAnnotationSaver$2
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C7220n mo528n(Object obj) {
            C5207g.m11111f(obj, "it");
            return new C7220n((String) obj);
        }
    });

    /* JADX INFO: renamed from: f */
    public static final C7452c f4468f = SaverKt.m1859a(new InterfaceC2056p<InterfaceC7453d, C7211e, Object>() { // from class: androidx.compose.ui.text.SaversKt$ParagraphStyleSaver$1
        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7453d interfaceC7453d, C7211e c7211e) {
            InterfaceC7453d interfaceC7453d2 = interfaceC7453d;
            C7211e c7211e2 = c7211e;
            C5207g.m11111f(interfaceC7453d2, "$this$Saver");
            C5207g.m11111f(c7211e2, "it");
            C7452c c7452c = SaversKt.f4463a;
            C9801k c9801k = C9801k.f49919c;
            return C9000b.m17237c(c7211e2.f40558a, c7211e2.f40559b, SaversKt.m2565a(new C10023k(c7211e2.f40560c), SaversKt.f4478p, interfaceC7453d2), SaversKt.m2565a(c7211e2.f40561d, SaversKt.f4472j, interfaceC7453d2));
        }
    }, new InterfaceC2052l<Object, C7211e>() { // from class: androidx.compose.ui.text.SaversKt$ParagraphStyleSaver$2
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C7211e mo528n(Object obj) {
            C5207g.m11111f(obj, "it");
            List list = (List) obj;
            Object obj2 = list.get(0);
            C9797g c9797g = obj2 != null ? (C9797g) obj2 : null;
            Object obj3 = list.get(1);
            C9799i c9799i = obj3 != null ? (C9799i) obj3 : null;
            Object obj4 = list.get(2);
            C10024l[] c10024lArr = C10023k.f50981b;
            C7452c c7452c = SaversKt.f4478p;
            Boolean bool = Boolean.FALSE;
            C10023k c10023k = (C5207g.m11106a(obj4, bool) || obj4 == null) ? null : (C10023k) c7452c.f41273b.mo528n(obj4);
            C5207g.m11108c(c10023k);
            long j10 = c10023k.f50983a;
            Object obj5 = list.get(3);
            C9801k c9801k = C9801k.f49919c;
            return new C7211e(c9797g, c9799i, j10, (C5207g.m11106a(obj5, bool) || obj5 == null) ? null : (C9801k) SaversKt.f4472j.f41273b.mo528n(obj5), null, null, null);
        }
    });

    /* JADX INFO: renamed from: g */
    public static final C7452c f4469g = SaverKt.m1859a(new InterfaceC2056p<InterfaceC7453d, C7214h, Object>() { // from class: androidx.compose.ui.text.SaversKt$SpanStyleSaver$1
        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7453d interfaceC7453d, C7214h c7214h) {
            InterfaceC7453d interfaceC7453d2 = interfaceC7453d;
            C7214h c7214h2 = c7214h;
            C5207g.m11111f(interfaceC7453d2, "$this$Saver");
            C5207g.m11111f(c7214h2, "it");
            C9169u c9169u = new C9169u(c7214h2.m14529b());
            C7452c c7452c = SaversKt.f4477o;
            C10023k c10023k = new C10023k(c7214h2.f40571b);
            C7452c c7452c2 = SaversKt.f4478p;
            C8476m c8476m = C8476m.f45646b;
            C7452c c7452c3 = SaversKt.f4473k;
            C7452c c7452c4 = SaversKt.f4474l;
            C7452c c7452c5 = SaversKt.f4471i;
            C7452c c7452c6 = SaversKt.f4480r;
            C7452c c7452c7 = SaversKt.f4470h;
            C9152j0 c9152j0 = C9152j0.f47679d;
            return C9000b.m17237c(SaversKt.m2565a(c9169u, c7452c, interfaceC7453d2), SaversKt.m2565a(c10023k, c7452c2, interfaceC7453d2), SaversKt.m2565a(c7214h2.f40572c, c7452c3, interfaceC7453d2), c7214h2.f40573d, c7214h2.f40574e, -1, c7214h2.f40576g, SaversKt.m2565a(new C10023k(c7214h2.f40577h), c7452c2, interfaceC7453d2), SaversKt.m2565a(c7214h2.f40578i, c7452c4, interfaceC7453d2), SaversKt.m2565a(c7214h2.f40579j, c7452c5, interfaceC7453d2), SaversKt.m2565a(c7214h2.f40580k, c7452c6, interfaceC7453d2), SaversKt.m2565a(new C9169u(c7214h2.f40581l), c7452c, interfaceC7453d2), SaversKt.m2565a(c7214h2.f40582m, c7452c7, interfaceC7453d2), SaversKt.m2565a(c7214h2.f40583n, SaversKt.f4476n, interfaceC7453d2));
        }
    }, new InterfaceC2052l<Object, C7214h>() { // from class: androidx.compose.ui.text.SaversKt$SpanStyleSaver$2
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C7214h mo528n(Object obj) {
            C5207g.m11111f(obj, "it");
            List list = (List) obj;
            Object obj2 = list.get(0);
            int i10 = C9169u.f47704g;
            C7452c c7452c = SaversKt.f4477o;
            Boolean bool = Boolean.FALSE;
            C9169u c9169u = (C5207g.m11106a(obj2, bool) || obj2 == null) ? null : (C9169u) c7452c.f41273b.mo528n(obj2);
            C5207g.m11108c(c9169u);
            long j10 = c9169u.f47705a;
            Object obj3 = list.get(1);
            C10024l[] c10024lArr = C10023k.f50981b;
            C7452c c7452c2 = SaversKt.f4478p;
            C10023k c10023k = (C5207g.m11106a(obj3, bool) || obj3 == null) ? null : (C10023k) c7452c2.f41273b.mo528n(obj3);
            C5207g.m11108c(c10023k);
            long j11 = c10023k.f50983a;
            Object obj4 = list.get(2);
            C8476m c8476m = C8476m.f45646b;
            C8476m c8476m2 = (C5207g.m11106a(obj4, bool) || obj4 == null) ? null : (C8476m) SaversKt.f4473k.f41273b.mo528n(obj4);
            Object obj5 = list.get(3);
            C8471h c8471h = obj5 != null ? (C8471h) obj5 : null;
            Object obj6 = list.get(4);
            C8472i c8472i = obj6 != null ? (C8472i) obj6 : null;
            Object obj7 = list.get(6);
            String str = obj7 != null ? (String) obj7 : null;
            Object obj8 = list.get(7);
            C10023k c10023k2 = (C5207g.m11106a(obj8, bool) || obj8 == null) ? null : (C10023k) c7452c2.f41273b.mo528n(obj8);
            C5207g.m11108c(c10023k2);
            long j12 = c10023k2.f50983a;
            Object obj9 = list.get(8);
            C9791a c9791a = (C5207g.m11106a(obj9, bool) || obj9 == null) ? null : (C9791a) SaversKt.f4474l.f41273b.mo528n(obj9);
            Object obj10 = list.get(9);
            C9800j c9800j = (C5207g.m11106a(obj10, bool) || obj10 == null) ? null : (C9800j) SaversKt.f4471i.f41273b.mo528n(obj10);
            Object obj11 = list.get(10);
            C8948d c8948d = (C5207g.m11106a(obj11, bool) || obj11 == null) ? null : (C8948d) SaversKt.f4480r.f41273b.mo528n(obj11);
            Object obj12 = list.get(11);
            C9169u c9169u2 = (C5207g.m11106a(obj12, bool) || obj12 == null) ? null : (C9169u) c7452c.f41273b.mo528n(obj12);
            C5207g.m11108c(c9169u2);
            long j13 = c9169u2.f47705a;
            Object obj13 = list.get(12);
            C9798h c9798h = (C5207g.m11106a(obj13, bool) || obj13 == null) ? null : (C9798h) SaversKt.f4470h.f41273b.mo528n(obj13);
            Object obj14 = list.get(13);
            C9152j0 c9152j0 = C9152j0.f47679d;
            return new C7214h(j10, j11, c8476m2, c8471h, c8472i, (AbstractC0696b) null, str, j12, c9791a, c9800j, c8948d, j13, c9798h, (C5207g.m11106a(obj14, bool) || obj14 == null) ? null : (C9152j0) SaversKt.f4476n.f41273b.mo528n(obj14), 32);
        }
    });

    /* JADX INFO: renamed from: h */
    public static final C7452c f4470h = SaverKt.m1859a(new InterfaceC2056p<InterfaceC7453d, C9798h, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextDecorationSaver$1
        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7453d interfaceC7453d, C9798h c9798h) {
            C9798h c9798h2 = c9798h;
            C5207g.m11111f(interfaceC7453d, "$this$Saver");
            C5207g.m11111f(c9798h2, "it");
            return Integer.valueOf(c9798h2.f49914a);
        }
    }, new InterfaceC2052l<Object, C9798h>() { // from class: androidx.compose.ui.text.SaversKt$TextDecorationSaver$2
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C9798h mo528n(Object obj) {
            C5207g.m11111f(obj, "it");
            return new C9798h(((Integer) obj).intValue());
        }
    });

    /* JADX INFO: renamed from: i */
    public static final C7452c f4471i = SaverKt.m1859a(new InterfaceC2056p<InterfaceC7453d, C9800j, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextGeometricTransformSaver$1
        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7453d interfaceC7453d, C9800j c9800j) {
            C9800j c9800j2 = c9800j;
            C5207g.m11111f(interfaceC7453d, "$this$Saver");
            C5207g.m11111f(c9800j2, "it");
            return C9000b.m17237c(Float.valueOf(c9800j2.f49917a), Float.valueOf(c9800j2.f49918b));
        }
    }, new InterfaceC2052l<Object, C9800j>() { // from class: androidx.compose.ui.text.SaversKt$TextGeometricTransformSaver$2
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C9800j mo528n(Object obj) {
            C5207g.m11111f(obj, "it");
            List list = (List) obj;
            return new C9800j(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
        }
    });

    /* JADX INFO: renamed from: j */
    public static final C7452c f4472j = SaverKt.m1859a(new InterfaceC2056p<InterfaceC7453d, C9801k, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextIndentSaver$1
        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7453d interfaceC7453d, C9801k c9801k) {
            InterfaceC7453d interfaceC7453d2 = interfaceC7453d;
            C9801k c9801k2 = c9801k;
            C5207g.m11111f(interfaceC7453d2, "$this$Saver");
            C5207g.m11111f(c9801k2, "it");
            C10023k c10023k = new C10023k(c9801k2.f49920a);
            C7452c c7452c = SaversKt.f4478p;
            return C9000b.m17237c(SaversKt.m2565a(c10023k, c7452c, interfaceC7453d2), SaversKt.m2565a(new C10023k(c9801k2.f49921b), c7452c, interfaceC7453d2));
        }
    }, new InterfaceC2052l<Object, C9801k>() { // from class: androidx.compose.ui.text.SaversKt$TextIndentSaver$2
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C9801k mo528n(Object obj) {
            C5207g.m11111f(obj, "it");
            List list = (List) obj;
            Object obj2 = list.get(0);
            C10024l[] c10024lArr = C10023k.f50981b;
            C7452c c7452c = SaversKt.f4478p;
            Boolean bool = Boolean.FALSE;
            C10023k c10023k = null;
            C10023k c10023k2 = (C5207g.m11106a(obj2, bool) || obj2 == null) ? null : (C10023k) c7452c.f41273b.mo528n(obj2);
            C5207g.m11108c(c10023k2);
            Object obj3 = list.get(1);
            if (!C5207g.m11106a(obj3, bool) && obj3 != null) {
                c10023k = (C10023k) c7452c.f41273b.mo528n(obj3);
            }
            C5207g.m11108c(c10023k);
            return new C9801k(c10023k2.f50983a, c10023k.f50983a);
        }
    });

    /* JADX INFO: renamed from: k */
    public static final C7452c f4473k = SaverKt.m1859a(new InterfaceC2056p<InterfaceC7453d, C8476m, Object>() { // from class: androidx.compose.ui.text.SaversKt$FontWeightSaver$1
        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7453d interfaceC7453d, C8476m c8476m) {
            C8476m c8476m2 = c8476m;
            C5207g.m11111f(interfaceC7453d, "$this$Saver");
            C5207g.m11111f(c8476m2, "it");
            return Integer.valueOf(c8476m2.f45655a);
        }
    }, new InterfaceC2052l<Object, C8476m>() { // from class: androidx.compose.ui.text.SaversKt$FontWeightSaver$2
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C8476m mo528n(Object obj) {
            C5207g.m11111f(obj, "it");
            return new C8476m(((Integer) obj).intValue());
        }
    });

    /* JADX INFO: renamed from: l */
    public static final C7452c f4474l = SaverKt.m1859a(new InterfaceC2056p<InterfaceC7453d, C9791a, Object>() { // from class: androidx.compose.ui.text.SaversKt$BaselineShiftSaver$1
        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7453d interfaceC7453d, C9791a c9791a) {
            float f3 = c9791a.f49900a;
            C5207g.m11111f(interfaceC7453d, "$this$Saver");
            return Float.valueOf(f3);
        }
    }, new InterfaceC2052l<Object, C9791a>() { // from class: androidx.compose.ui.text.SaversKt$BaselineShiftSaver$2
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C9791a mo528n(Object obj) {
            C5207g.m11111f(obj, "it");
            return new C9791a(((Float) obj).floatValue());
        }
    });

    /* JADX INFO: renamed from: m */
    public static final C7452c f4475m = SaverKt.m1859a(new InterfaceC2056p<InterfaceC7453d, C7217k, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextRangeSaver$1
        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7453d interfaceC7453d, C7217k c7217k) {
            long j10 = c7217k.f40598a;
            C5207g.m11111f(interfaceC7453d, "$this$Saver");
            int i10 = C7217k.f40597c;
            Integer numValueOf = Integer.valueOf((int) (j10 >> 32));
            C7452c c7452c = SaversKt.f4463a;
            return C9000b.m17237c(numValueOf, Integer.valueOf(C7217k.m14539a(j10)));
        }
    }, new InterfaceC2052l<Object, C7217k>() { // from class: androidx.compose.ui.text.SaversKt$TextRangeSaver$2
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C7217k mo528n(Object obj) {
            C5207g.m11111f(obj, "it");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Integer num = null;
            Integer num2 = obj2 != null ? (Integer) obj2 : null;
            C5207g.m11108c(num2);
            int iIntValue = num2.intValue();
            Object obj3 = list.get(1);
            if (obj3 != null) {
                num = (Integer) obj3;
            }
            C5207g.m11108c(num);
            return new C7217k(C0062b.m384q(iIntValue, num.intValue()));
        }
    });

    /* JADX INFO: renamed from: n */
    public static final C7452c f4476n = SaverKt.m1859a(new InterfaceC2056p<InterfaceC7453d, C9152j0, Object>() { // from class: androidx.compose.ui.text.SaversKt$ShadowSaver$1
        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7453d interfaceC7453d, C9152j0 c9152j0) {
            InterfaceC7453d interfaceC7453d2 = interfaceC7453d;
            C9152j0 c9152j1 = c9152j0;
            C5207g.m11111f(interfaceC7453d2, "$this$Saver");
            C5207g.m11111f(c9152j1, "it");
            return C9000b.m17237c(SaversKt.m2565a(new C9169u(c9152j1.f47680a), SaversKt.f4477o, interfaceC7453d2), SaversKt.m2565a(new C8941c(c9152j1.f47681b), SaversKt.f4479q, interfaceC7453d2), Float.valueOf(c9152j1.f47682c));
        }
    }, new InterfaceC2052l<Object, C9152j0>() { // from class: androidx.compose.ui.text.SaversKt$ShadowSaver$2
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C9152j0 mo528n(Object obj) {
            C5207g.m11111f(obj, "it");
            List list = (List) obj;
            Object obj2 = list.get(0);
            int i10 = C9169u.f47704g;
            C7452c c7452c = SaversKt.f4477o;
            Boolean bool = Boolean.FALSE;
            Float f3 = null;
            C9169u c9169u = (C5207g.m11106a(obj2, bool) || obj2 == null) ? null : (C9169u) c7452c.f41273b.mo528n(obj2);
            C5207g.m11108c(c9169u);
            long j10 = c9169u.f47705a;
            Object obj3 = list.get(1);
            int i11 = C8941c.f46891e;
            C8941c c8941c = (C5207g.m11106a(obj3, bool) || obj3 == null) ? null : (C8941c) SaversKt.f4479q.f41273b.mo528n(obj3);
            C5207g.m11108c(c8941c);
            long j11 = c8941c.f46892a;
            Object obj4 = list.get(2);
            if (obj4 != null) {
                f3 = (Float) obj4;
            }
            C5207g.m11108c(f3);
            return new C9152j0(j10, j11, f3.floatValue());
        }
    });

    /* JADX INFO: renamed from: o */
    public static final C7452c f4477o = SaverKt.m1859a(new InterfaceC2056p<InterfaceC7453d, C9169u, Object>() { // from class: androidx.compose.ui.text.SaversKt$ColorSaver$1
        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7453d interfaceC7453d, C9169u c9169u) {
            long j10 = c9169u.f47705a;
            C5207g.m11111f(interfaceC7453d, "$this$Saver");
            return new C9071d(j10);
        }
    }, new InterfaceC2052l<Object, C9169u>() { // from class: androidx.compose.ui.text.SaversKt$ColorSaver$2
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C9169u mo528n(Object obj) {
            C5207g.m11111f(obj, "it");
            return new C9169u(((C9071d) obj).f47359a);
        }
    });

    /* JADX INFO: renamed from: p */
    public static final C7452c f4478p = SaverKt.m1859a(new InterfaceC2056p<InterfaceC7453d, C10023k, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextUnitSaver$1
        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7453d interfaceC7453d, C10023k c10023k) {
            long j10 = c10023k.f50983a;
            C5207g.m11111f(interfaceC7453d, "$this$Saver");
            Float fValueOf = Float.valueOf(C10023k.m18632c(j10));
            C7452c c7452c = SaversKt.f4463a;
            return C9000b.m17237c(fValueOf, new C10024l(C10023k.m18631b(j10)));
        }
    }, new InterfaceC2052l<Object, C10023k>() { // from class: androidx.compose.ui.text.SaversKt$TextUnitSaver$2
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C10023k mo528n(Object obj) {
            C5207g.m11111f(obj, "it");
            List list = (List) obj;
            Object obj2 = list.get(0);
            C10024l c10024l = null;
            Float f3 = obj2 != null ? (Float) obj2 : null;
            C5207g.m11108c(f3);
            float fFloatValue = f3.floatValue();
            Object obj3 = list.get(1);
            if (obj3 != null) {
                c10024l = (C10024l) obj3;
            }
            C5207g.m11108c(c10024l);
            return new C10023k(C8573r0.m16690O0(fFloatValue, c10024l.f50984a));
        }
    });

    /* JADX INFO: renamed from: q */
    public static final C7452c f4479q = SaverKt.m1859a(new InterfaceC2056p<InterfaceC7453d, C8941c, Object>() { // from class: androidx.compose.ui.text.SaversKt$OffsetSaver$1
        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7453d interfaceC7453d, C8941c c8941c) {
            long j10 = c8941c.f46892a;
            C5207g.m11111f(interfaceC7453d, "$this$Saver");
            if (C8941c.m17162a(j10, C8941c.f46890d)) {
                return Boolean.FALSE;
            }
            Float fValueOf = Float.valueOf(C8941c.m17164c(j10));
            C7452c c7452c = SaversKt.f4463a;
            return C9000b.m17237c(fValueOf, Float.valueOf(C8941c.m17165d(j10)));
        }
    }, new InterfaceC2052l<Object, C8941c>() { // from class: androidx.compose.ui.text.SaversKt$OffsetSaver$2
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C8941c mo528n(Object obj) {
            C5207g.m11111f(obj, "it");
            if (C5207g.m11106a(obj, Boolean.FALSE)) {
                return new C8941c(C8941c.f46890d);
            }
            List list = (List) obj;
            Object obj2 = list.get(0);
            Float f3 = null;
            Float f10 = obj2 != null ? (Float) obj2 : null;
            C5207g.m11108c(f10);
            float fFloatValue = f10.floatValue();
            Object obj3 = list.get(1);
            if (obj3 != null) {
                f3 = (Float) obj3;
            }
            C5207g.m11108c(f3);
            return new C8941c(C7499b.m14932c(fFloatValue, f3.floatValue()));
        }
    });

    /* JADX INFO: renamed from: r */
    public static final C7452c f4480r = SaverKt.m1859a(new InterfaceC2056p<InterfaceC7453d, C8948d, Object>() { // from class: androidx.compose.ui.text.SaversKt$LocaleListSaver$1
        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7453d interfaceC7453d, C8948d c8948d) {
            InterfaceC7453d interfaceC7453d2 = interfaceC7453d;
            C8948d c8948d2 = c8948d;
            C5207g.m11111f(interfaceC7453d2, "$this$Saver");
            C5207g.m11111f(c8948d2, "it");
            List<C8947c> list = c8948d2.f46915a;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(SaversKt.m2565a(list.get(i10), SaversKt.f4481s, interfaceC7453d2));
            }
            return arrayList;
        }
    }, new InterfaceC2052l<Object, C8948d>() { // from class: androidx.compose.ui.text.SaversKt$LocaleListSaver$2
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C8948d mo528n(Object obj) {
            C5207g.m11111f(obj, "it");
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                C8947c c8947c = (C5207g.m11106a(obj2, Boolean.FALSE) || obj2 == null) ? null : (C8947c) SaversKt.f4481s.f41273b.mo528n(obj2);
                C5207g.m11108c(c8947c);
                arrayList.add(c8947c);
            }
            return new C8948d(arrayList);
        }
    });

    /* JADX INFO: renamed from: s */
    public static final C7452c f4481s = SaverKt.m1859a(new InterfaceC2056p<InterfaceC7453d, C8947c, Object>() { // from class: androidx.compose.ui.text.SaversKt$LocaleSaver$1
        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7453d interfaceC7453d, C8947c c8947c) {
            C8947c c8947c2 = c8947c;
            C5207g.m11111f(interfaceC7453d, "$this$Saver");
            C5207g.m11111f(c8947c2, "it");
            return c8947c2.f46914a.mo17180a();
        }
    }, new InterfaceC2052l<Object, C8947c>() { // from class: androidx.compose.ui.text.SaversKt$LocaleSaver$2
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C8947c mo528n(Object obj) {
            C5207g.m11111f(obj, "it");
            C8950f.f46917a.getClass();
            Locale localeForLanguageTag = Locale.forLanguageTag((String) obj);
            C5207g.m11110e(localeForLanguageTag, "forLanguageTag(languageTag)");
            return new C8947c(new C8945a(localeForLanguageTag));
        }
    });

    /* JADX INFO: renamed from: a */
    public static final Object m2565a(Object obj, C7452c c7452c, InterfaceC7453d interfaceC7453d) {
        Object objMo14823a;
        C5207g.m11111f(c7452c, "saver");
        C5207g.m11111f(interfaceC7453d, "scope");
        return (obj == null || (objMo14823a = c7452c.mo14823a(interfaceC7453d, obj)) == null) ? Boolean.FALSE : objMo14823a;
    }
}
