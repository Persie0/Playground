package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import ae.C0062b;
import cm.InterfaceC2052l;
import cn.C2064a;
import dm.C5206f;
import dm.C5207g;
import hn.C6085e;
import hn.C6088h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p078dn.C5218d;
import p102eo.InterfaceC5436a;
import p139go.InterfaceC5852f;
import p139go.InterfaceC5857k;
import p266n.C7669f;
import p543do.AbstractC5257t;
import sl.InterfaceC9070c;
import zm.C10517b;
import zm.C10532q;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6890a<TAnnotation> {

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final InterfaceC5852f f38882a;

        /* JADX INFO: renamed from: b */
        public final C10532q f38883b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC5857k f38884c;

        public a(InterfaceC5852f interfaceC5852f, C10532q c10532q, InterfaceC5857k interfaceC5857k) {
            this.f38882a = interfaceC5852f;
            this.f38883b = c10532q;
            this.f38884c = interfaceC5857k;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m13736a(Object obj, ArrayList arrayList, InterfaceC2052l interfaceC2052l) {
        arrayList.add(obj);
        Iterable<? extends a> iterableMo528n = ((AbstractSignatureParts$toIndexed$1$1) interfaceC2052l).mo528n(obj);
        if (iterableMo528n != null) {
            Iterator<? extends a> it = iterableMo528n.iterator();
            while (it.hasNext()) {
                m13736a(it.next(), arrayList, interfaceC2052l);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static NullabilityQualifier m13737c(InterfaceC5852f interfaceC5852f) {
        C5206f c5206f = C5206f.f33268c;
        if (InterfaceC5436a.a.m11603Q(InterfaceC5436a.a.m11614a0(c5206f, interfaceC5852f))) {
            return NullabilityQualifier.NULLABLE;
        }
        if (InterfaceC5436a.a.m11603Q(InterfaceC5436a.a.m11642o0(c5206f, interfaceC5852f))) {
            return null;
        }
        return NullabilityQualifier.NOT_NULL;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    /* JADX WARN: Code duplicated, block: B:19:0x003d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    /* JADX WARN: Code duplicated, block: B:22:0x0046  */
    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0062  */
    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    /* JADX WARN: Code duplicated, block: B:33:0x006e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0071  */
    /* JADX WARN: Code duplicated, block: B:37:0x007c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0088  */
    /* JADX WARN: Code duplicated, block: B:42:0x009c  */
    /* JADX WARN: Code duplicated, block: B:43:0x009f  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a5 A[EDGE_INSN: B:46:0x00a5->B:47:0x00a6 BREAK  A[LOOP:1: B:38:0x0081->B:82:?]] */
    /* JADX WARN: Code duplicated, block: B:48:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d0 A[LOOP:3: B:50:0x00b3->B:54:0x00d0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f9 A[EDGE_INSN: B:66:0x00f9->B:67:0x00fa BREAK  A[LOOP:0: B:60:0x00e1->B:77:?]] */
    /* JADX WARN: Code duplicated, block: B:68:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:69:0x0100  */
    /* JADX WARN: Code duplicated, block: B:72:0x0106  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:? A[LOOP:0: B:60:0x00e1->B:77:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:? A[LOOP:1: B:38:0x0081->B:82:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00d4 A[EDGE_INSN: B:83:0x00d4->B:55:0x00d4 BREAK  A[LOOP:2: B:49:0x00b2->B:84:?, LOOP_LABEL: LOOP:2: B:49:0x00b2->B:84:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:? A[LOOP:2: B:49:0x00b2->B:84:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:? A[LOOP:4: B:23:0x004a->B:89:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public final C6085e m13738b(InterfaceC5857k interfaceC5857k) {
        boolean z10;
        Iterator it;
        boolean z11;
        boolean z12;
        boolean z13;
        ArrayList arrayList;
        Iterator it2;
        AbstractC5257t abstractC5257tM346f1;
        Iterator it3;
        InterfaceC5852f interfaceC5852f;
        boolean z14;
        Collection collection;
        boolean z15;
        NullabilityQualifier nullabilityQualifier;
        Iterator it4;
        if (!(interfaceC5857k instanceof C5218d)) {
            return null;
        }
        List listM11587A = InterfaceC5436a.a.m11587A(interfaceC5857k);
        boolean z16 = false;
        if (!listM11587A.isEmpty()) {
            Iterator it5 = listM11587A.iterator();
            while (true) {
                if (it5.hasNext()) {
                    if (!InterfaceC5436a.a.m11599M((InterfaceC5852f) it5.next())) {
                        z10 = false;
                        break;
                    }
                }
            }
            if (z10) {
                return null;
            }
            if (listM11587A.isEmpty()) {
                it = listM11587A.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (m13737c((InterfaceC5852f) it.next()) != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            z12 = true;
                            break;
                        }
                    }
                }
                if (z12) {
                    collection = listM11587A;
                } else {
                    if (listM11587A.isEmpty()) {
                        it3 = listM11587A.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                z13 = false;
                                break;
                            }
                            interfaceC5852f = (InterfaceC5852f) it3.next();
                            C5207g.m11111f(interfaceC5852f, "<this>");
                            if (C0062b.m346f1((AbstractC5257t) interfaceC5852f) != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (z14) {
                                z13 = true;
                                break;
                            }
                        }
                    } else {
                        z13 = false;
                        break;
                    }
                    if (z13) {
                        return null;
                    }
                    arrayList = new ArrayList();
                    it2 = listM11587A.iterator();
                    loop2: while (true) {
                        while (true) {
                            if (it2.hasNext()) {
                                break loop2;
                            }
                            InterfaceC5852f interfaceC5852f2 = (InterfaceC5852f) it2.next();
                            C5207g.m11111f(interfaceC5852f2, "<this>");
                            abstractC5257tM346f1 = C0062b.m346f1((AbstractC5257t) interfaceC5852f2);
                            if (abstractC5257tM346f1 != null) {
                                arrayList.add(abstractC5257tM346f1);
                            }
                        }
                    }
                    collection = arrayList;
                }
                if (collection.isEmpty()) {
                    it4 = collection.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            z15 = true;
                            break;
                        }
                        if (!InterfaceC5436a.a.m11605S((InterfaceC5852f) it4.next())) {
                            z15 = false;
                            break;
                        }
                    }
                } else {
                    z15 = true;
                    break;
                }
                if (z15) {
                    nullabilityQualifier = NullabilityQualifier.NULLABLE;
                } else {
                    nullabilityQualifier = NullabilityQualifier.NOT_NULL;
                }
                if (collection != listM11587A) {
                    z16 = true;
                }
                return new C6085e(nullabilityQualifier, z16);
            }
            z12 = false;
            if (z12) {
                collection = listM11587A;
            } else {
                if (listM11587A.isEmpty()) {
                    it3 = listM11587A.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            z13 = false;
                            break;
                        }
                        interfaceC5852f = (InterfaceC5852f) it3.next();
                        C5207g.m11111f(interfaceC5852f, "<this>");
                        if (C0062b.m346f1((AbstractC5257t) interfaceC5852f) != null) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z14) {
                            z13 = true;
                            break;
                        }
                    }
                } else {
                    z13 = false;
                    break;
                }
                if (z13) {
                    return null;
                }
                arrayList = new ArrayList();
                it2 = listM11587A.iterator();
                loop2: while (true) {
                    while (true) {
                        if (it2.hasNext()) {
                            break loop2;
                            break loop2;
                        }
                        InterfaceC5852f interfaceC5852f3 = (InterfaceC5852f) it2.next();
                        C5207g.m11111f(interfaceC5852f3, "<this>");
                        abstractC5257tM346f1 = C0062b.m346f1((AbstractC5257t) interfaceC5852f3);
                        if (abstractC5257tM346f1 != null) {
                            arrayList.add(abstractC5257tM346f1);
                        }
                    }
                }
                collection = arrayList;
            }
            if (collection.isEmpty()) {
                it4 = collection.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        z15 = true;
                        break;
                    }
                    if (!InterfaceC5436a.a.m11605S((InterfaceC5852f) it4.next())) {
                        z15 = false;
                        break;
                    }
                }
            } else {
                z15 = true;
                break;
            }
            if (z15) {
                nullabilityQualifier = NullabilityQualifier.NULLABLE;
            } else {
                nullabilityQualifier = NullabilityQualifier.NOT_NULL;
            }
            if (collection != listM11587A) {
                z16 = true;
            }
            return new C6085e(nullabilityQualifier, z16);
        }
        z10 = true;
        if (z10) {
            return null;
        }
        if (listM11587A.isEmpty()) {
            it = listM11587A.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (m13737c((InterfaceC5852f) it.next()) != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        z12 = true;
                        break;
                    }
                }
            }
            if (z12) {
                collection = listM11587A;
            } else {
                if (listM11587A.isEmpty()) {
                    it3 = listM11587A.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            z13 = false;
                            break;
                        }
                        interfaceC5852f = (InterfaceC5852f) it3.next();
                        C5207g.m11111f(interfaceC5852f, "<this>");
                        if (C0062b.m346f1((AbstractC5257t) interfaceC5852f) != null) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z14) {
                            z13 = true;
                            break;
                        }
                    }
                } else {
                    z13 = false;
                    break;
                }
                if (z13) {
                    return null;
                }
                arrayList = new ArrayList();
                it2 = listM11587A.iterator();
                loop2: while (true) {
                    while (true) {
                        if (it2.hasNext()) {
                            break loop2;
                            break loop2;
                        }
                        InterfaceC5852f interfaceC5852f4 = (InterfaceC5852f) it2.next();
                        C5207g.m11111f(interfaceC5852f4, "<this>");
                        abstractC5257tM346f1 = C0062b.m346f1((AbstractC5257t) interfaceC5852f4);
                        if (abstractC5257tM346f1 != null) {
                            arrayList.add(abstractC5257tM346f1);
                        }
                    }
                }
                collection = arrayList;
            }
            if (collection.isEmpty()) {
                it4 = collection.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        z15 = true;
                        break;
                    }
                    if (!InterfaceC5436a.a.m11605S((InterfaceC5852f) it4.next())) {
                        z15 = false;
                        break;
                    }
                }
            } else {
                z15 = true;
                break;
            }
            if (z15) {
                nullabilityQualifier = NullabilityQualifier.NULLABLE;
            } else {
                nullabilityQualifier = NullabilityQualifier.NOT_NULL;
            }
            if (collection != listM11587A) {
                z16 = true;
            }
            return new C6085e(nullabilityQualifier, z16);
        }
        z12 = false;
        if (z12) {
            collection = listM11587A;
        } else {
            if (listM11587A.isEmpty()) {
                it3 = listM11587A.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        z13 = false;
                        break;
                    }
                    interfaceC5852f = (InterfaceC5852f) it3.next();
                    C5207g.m11111f(interfaceC5852f, "<this>");
                    if (C0062b.m346f1((AbstractC5257t) interfaceC5852f) != null) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        z13 = true;
                        break;
                    }
                }
            } else {
                z13 = false;
                break;
            }
            if (z13) {
                return null;
            }
            arrayList = new ArrayList();
            it2 = listM11587A.iterator();
            loop2: while (true) {
                while (true) {
                    if (it2.hasNext()) {
                        break loop2;
                        break loop2;
                    }
                    InterfaceC5852f interfaceC5852f5 = (InterfaceC5852f) it2.next();
                    C5207g.m11111f(interfaceC5852f5, "<this>");
                    abstractC5257tM346f1 = C0062b.m346f1((AbstractC5257t) interfaceC5852f5);
                    if (abstractC5257tM346f1 != null) {
                        arrayList.add(abstractC5257tM346f1);
                    }
                }
            }
            collection = arrayList;
        }
        if (collection.isEmpty()) {
            it4 = collection.iterator();
            while (true) {
                if (it4.hasNext()) {
                    z15 = true;
                    break;
                }
                if (!InterfaceC5436a.a.m11605S((InterfaceC5852f) it4.next())) {
                    z15 = false;
                    break;
                }
            }
        } else {
            z15 = true;
            break;
        }
        if (z15) {
            nullabilityQualifier = NullabilityQualifier.NULLABLE;
        } else {
            nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        }
        if (collection != listM11587A) {
            z16 = true;
        }
        return new C6085e(nullabilityQualifier, z16);
    }

    /* JADX INFO: renamed from: d */
    public final ArrayList m13739d(InterfaceC5852f interfaceC5852f) {
        C7669f c7669f = ((C6088h) this).f35837c;
        C10532q c10532q = (C10532q) ((InterfaceC9070c) c7669f.f42149d).getValue();
        C10517b c10517b = ((C2064a) c7669f.f42146a).f10511q;
        C5207g.m11111f(interfaceC5852f, "<this>");
        a aVar = new a(interfaceC5852f, c10517b.m13664b(c10532q, ((AbstractC5257t) interfaceC5852f).mo11289w()), null);
        AbstractSignatureParts$toIndexed$1$1 abstractSignatureParts$toIndexed$1$1 = new AbstractSignatureParts$toIndexed$1$1(this);
        ArrayList arrayList = new ArrayList(1);
        m13736a(aVar, arrayList, abstractSignatureParts$toIndexed$1$1);
        return arrayList;
    }
}
