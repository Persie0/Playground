package kotlin.reflect.jvm.internal.impl.load.java;

import cm.InterfaceC2052l;
import dm.C5207g;
import hn.C6085e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.C6744b;
import kotlin.collections.C6752c;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import mn.C7646c;
import p372rm.InterfaceC8830c;
import tl.C9338z;
import zm.C10516a;
import zm.C10526k;
import zm.C10532q;
import zm.C10535t;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6840a<TAnnotation> {

    /* JADX INFO: renamed from: c */
    @Deprecated
    public static final LinkedHashMap f38629c;

    /* JADX INFO: renamed from: a */
    public final JavaTypeEnhancementState f38630a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap<Object, TAnnotation> f38631b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType : AnnotationQualifierApplicabilityType.values()) {
            String javaTarget = annotationQualifierApplicabilityType.getJavaTarget();
            if (linkedHashMap.get(javaTarget) == null) {
                linkedHashMap.put(javaTarget, annotationQualifierApplicabilityType);
            }
        }
        f38629c = linkedHashMap;
    }

    public AbstractC6840a(JavaTypeEnhancementState javaTypeEnhancementState) {
        C5207g.m11111f(javaTypeEnhancementState, "javaTypeEnhancementState");
        this.f38630a = javaTypeEnhancementState;
        this.f38631b = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: a */
    public abstract ArrayList mo13663a(Object obj, boolean z10);

    /* JADX WARN: Code duplicated, block: B:54:0x00dd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final C10532q m13664b(C10532q c10532q, Iterable<? extends TAnnotation> iterable) {
        boolean z10;
        EnumMap<AnnotationQualifierApplicabilityType, C10526k> enumMap;
        C10526k c10526k;
        Pair pair;
        C6085e c6085eM13665c;
        TAnnotation tannotationM13666d;
        TAnnotation next;
        C10526k c10526k2;
        ReportLevel reportLevelM13672j;
        C5207g.m11111f(iterable, "annotations");
        JavaTypeEnhancementState javaTypeEnhancementState = this.f38630a;
        if (javaTypeEnhancementState.f38606c) {
            return c10532q;
        }
        ArrayList<C10526k> arrayList = new ArrayList();
        Iterator<? extends TAnnotation> it = iterable.iterator();
        while (true) {
            z10 = false;
            if (!it.hasNext()) {
                break;
            }
            TAnnotation next2 = it.next();
            C10526k c10526k3 = null;
            if (javaTypeEnhancementState.f38606c || (c10526k2 = (C10526k) C10516a.f52503g.get(mo13667e(next2))) == null) {
                c10526k = null;
            } else {
                C7646c c7646cMo13667e = mo13667e(next2);
                if (c7646cMo13667e == null || !C10516a.f52502f.containsKey(c7646cMo13667e)) {
                    reportLevelM13672j = m13672j(next2);
                    if (reportLevelM13672j == null) {
                        reportLevelM13672j = javaTypeEnhancementState.f38604a.f38632a;
                    }
                } else {
                    reportLevelM13672j = javaTypeEnhancementState.f38605b.mo528n(c7646cMo13667e);
                }
                if (!(reportLevelM13672j != ReportLevel.IGNORE)) {
                    reportLevelM13672j = null;
                }
                if (reportLevelM13672j == null) {
                    c10526k = null;
                } else {
                    C6085e c6085eM12518a = C6085e.m12518a(c10526k2.f52517a, null, reportLevelM13672j.isWarning(), 1);
                    Collection<AnnotationQualifierApplicabilityType> collection = c10526k2.f52518b;
                    C5207g.m11111f(collection, "qualifierApplicabilityTypes");
                    c10526k = new C10526k(c6085eM12518a, collection, c10526k2.f52519c);
                }
            }
            if (c10526k != null) {
                c10526k3 = c10526k;
            } else {
                if (javaTypeEnhancementState.f38604a.f38635d || (tannotationM13666d = m13666d(next2, C10516a.f52499c)) == null) {
                    pair = null;
                } else {
                    Iterator<TAnnotation> it2 = mo13669g(next2).iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!(m13673k(next) != null));
                    if (next == null) {
                        pair = null;
                    } else {
                        ArrayList arrayListMo13663a = mo13663a(tannotationM13666d, true);
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        Iterator it3 = arrayListMo13663a.iterator();
                        while (it3.hasNext()) {
                            AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = (AnnotationQualifierApplicabilityType) f38629c.get((String) it3.next());
                            if (annotationQualifierApplicabilityType != null) {
                                linkedHashSet.add(annotationQualifierApplicabilityType);
                            }
                        }
                        if (linkedHashSet.contains(AnnotationQualifierApplicabilityType.TYPE_USE)) {
                            linkedHashSet = C9338z.m17691N0(C9338z.m17689L0(C6744b.m13393y0(AnnotationQualifierApplicabilityType.values()), AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS), linkedHashSet);
                        }
                        pair = new Pair(next, linkedHashSet);
                    }
                }
                if (pair != null) {
                    Set set = (Set) pair.f38013b;
                    ReportLevel reportLevelM13672j2 = m13672j(next2);
                    A a10 = pair.f38012a;
                    if (reportLevelM13672j2 == null) {
                        reportLevelM13672j2 = m13672j(a10);
                        if (reportLevelM13672j2 == null) {
                            reportLevelM13672j2 = javaTypeEnhancementState.f38604a.f38632a;
                        }
                    }
                    if (!reportLevelM13672j2.isIgnore() && (c6085eM13665c = m13665c(a10, new InterfaceC2052l<Object, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver$extractDefaultQualifiers$nullabilityQualifier$1
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final Boolean mo528n(Object obj) {
                            C5207g.m11111f(obj, "$this$extractNullability");
                            return Boolean.FALSE;
                        }
                    })) != null) {
                        c10526k3 = new C10526k(C6085e.m12518a(c6085eM13665c, null, reportLevelM13672j2.isWarning(), 1), set);
                    }
                }
            }
            if (c10526k3 != null) {
                arrayList.add(c10526k3);
            }
        }
        if (arrayList.isEmpty()) {
            return c10532q;
        }
        EnumMap enumMap2 = (c10532q == null || (enumMap = c10532q.f52531a) == null) ? new EnumMap(AnnotationQualifierApplicabilityType.class) : new EnumMap((EnumMap) enumMap);
        for (C10526k c10526k4 : arrayList) {
            Iterator<AnnotationQualifierApplicabilityType> it4 = c10526k4.f52518b.iterator();
            while (it4.hasNext()) {
                enumMap2.put(it4.next(), c10526k4);
                z10 = true;
            }
        }
        return !z10 ? c10532q : new C10532q(enumMap2);
    }

    /* JADX INFO: renamed from: c */
    public final C6085e m13665c(TAnnotation tannotation, InterfaceC2052l<? super TAnnotation, Boolean> interfaceC2052l) {
        C6085e c6085eM13671i = m13671i(tannotation, interfaceC2052l.mo528n(tannotation).booleanValue());
        if (c6085eM13671i != null) {
            return c6085eM13671i;
        }
        TAnnotation tannotationM13673k = m13673k(tannotation);
        C6085e c6085eM12518a = null;
        if (tannotationM13673k == null) {
            return null;
        }
        ReportLevel reportLevelM13672j = m13672j(tannotation);
        if (reportLevelM13672j == null) {
            reportLevelM13672j = this.f38630a.f38604a.f38632a;
        }
        if (reportLevelM13672j.isIgnore()) {
            return null;
        }
        C6085e c6085eM13671i2 = m13671i(tannotationM13673k, interfaceC2052l.mo528n(tannotationM13673k).booleanValue());
        if (c6085eM13671i2 != null) {
            c6085eM12518a = C6085e.m12518a(c6085eM13671i2, null, reportLevelM13672j.isWarning(), 1);
        }
        return c6085eM12518a;
    }

    /* JADX INFO: renamed from: d */
    public final TAnnotation m13666d(TAnnotation tannotation, C7646c c7646c) {
        for (TAnnotation tannotation2 : mo13669g(tannotation)) {
            if (C5207g.m11106a(mo13667e(tannotation2), c7646c)) {
                return tannotation2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public abstract C7646c mo13667e(TAnnotation tannotation);

    /* JADX INFO: renamed from: f */
    public abstract InterfaceC8830c mo13668f(Object obj);

    /* JADX INFO: renamed from: g */
    public abstract Iterable<TAnnotation> mo13669g(TAnnotation tannotation);

    /* JADX INFO: renamed from: h */
    public final boolean m13670h(TAnnotation tannotation, C7646c c7646c) {
        Iterable<TAnnotation> iterableMo13669g = mo13669g(tannotation);
        boolean z10 = false;
        if (!(iterableMo13669g instanceof Collection) || !((Collection) iterableMo13669g).isEmpty()) {
            Iterator<TAnnotation> it = iterableMo13669g.iterator();
            while (it.hasNext()) {
                if (C5207g.m11106a(mo13667e(it.next()), c7646c)) {
                    z10 = true;
                    break;
                }
            }
        }
        return z10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: i */
    public final C6085e m13671i(TAnnotation tannotation, boolean z10) {
        NullabilityQualifier nullabilityQualifier;
        C7646c c7646cMo13667e = mo13667e(tannotation);
        if (c7646cMo13667e == null) {
            return null;
        }
        ReportLevel reportLevelMo528n = this.f38630a.f38605b.mo528n(c7646cMo13667e);
        if (reportLevelMo528n.isIgnore()) {
            return null;
        }
        boolean z11 = false;
        if (C10535t.f52554d.contains(c7646cMo13667e)) {
            nullabilityQualifier = NullabilityQualifier.NULLABLE;
        } else if (C10535t.f52557g.contains(c7646cMo13667e)) {
            nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        } else if (C5207g.m11106a(c7646cMo13667e, C10535t.f52551a)) {
            nullabilityQualifier = NullabilityQualifier.NULLABLE;
        } else if (C5207g.m11106a(c7646cMo13667e, C10535t.f52552b)) {
            nullabilityQualifier = NullabilityQualifier.FORCE_FLEXIBILITY;
        } else if (C5207g.m11106a(c7646cMo13667e, C10535t.f52555e)) {
            String str = (String) C6752c.m13424R(mo13663a(tannotation, false));
            if (str != null) {
                switch (str.hashCode()) {
                    case 73135176:
                        if (!str.equals("MAYBE")) {
                            return null;
                        }
                        nullabilityQualifier = NullabilityQualifier.NULLABLE;
                        break;
                    case 74175084:
                        if (!str.equals("NEVER")) {
                            return null;
                        }
                        nullabilityQualifier = NullabilityQualifier.NULLABLE;
                        break;
                    case 433141802:
                        if (!str.equals("UNKNOWN")) {
                            return null;
                        }
                        nullabilityQualifier = NullabilityQualifier.FORCE_FLEXIBILITY;
                        break;
                        break;
                    case 1933739535:
                        if (!str.equals("ALWAYS")) {
                            return null;
                        }
                        break;
                    default:
                        return null;
                }
            }
            nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        } else if (C5207g.m11106a(c7646cMo13667e, C10535t.f52558h)) {
            nullabilityQualifier = NullabilityQualifier.NULLABLE;
        } else if (C5207g.m11106a(c7646cMo13667e, C10535t.f52559i) || C5207g.m11106a(c7646cMo13667e, C10535t.f52561k)) {
            nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        } else {
            if (!C5207g.m11106a(c7646cMo13667e, C10535t.f52560j)) {
                return null;
            }
            nullabilityQualifier = NullabilityQualifier.NULLABLE;
        }
        if (reportLevelMo528n.isWarning() || z10) {
            z11 = true;
        }
        return new C6085e(nullabilityQualifier, z11);
    }

    /* JADX INFO: renamed from: j */
    public final ReportLevel m13672j(TAnnotation tannotation) {
        ReportLevel reportLevel;
        ArrayList arrayListMo13663a;
        String str;
        JavaTypeEnhancementState javaTypeEnhancementState = this.f38630a;
        ReportLevel reportLevel2 = javaTypeEnhancementState.f38604a.f38634c.get(mo13667e(tannotation));
        if (reportLevel2 != null) {
            return reportLevel2;
        }
        TAnnotation tannotationM13666d = m13666d(tannotation, C10516a.f52500d);
        if (tannotationM13666d != null && (arrayListMo13663a = mo13663a(tannotationM13666d, false)) != null && (str = (String) C6752c.m13424R(arrayListMo13663a)) != null) {
            reportLevel = javaTypeEnhancementState.f38604a.f38633b;
            if (reportLevel == null) {
                int iHashCode = str.hashCode();
                if (iHashCode != -2137067054) {
                    if (iHashCode != -1838656823) {
                        if (iHashCode == 2656902 && str.equals("WARN")) {
                            return ReportLevel.WARN;
                        }
                    } else if (str.equals("STRICT")) {
                        return ReportLevel.STRICT;
                    }
                } else if (str.equals("IGNORE")) {
                    return ReportLevel.IGNORE;
                }
            }
            return reportLevel;
        }
        reportLevel = null;
        return reportLevel;
    }

    /* JADX INFO: renamed from: k */
    public final TAnnotation m13673k(TAnnotation tannotation) {
        TAnnotation tannotationM13673k;
        C5207g.m11111f(tannotation, "annotation");
        if (this.f38630a.f38604a.f38635d) {
            return null;
        }
        if (C6752c.m13415I(C10516a.f52504h, mo13667e(tannotation)) || m13670h(tannotation, C10516a.f52498b)) {
            return tannotation;
        }
        if (!m13670h(tannotation, C10516a.f52497a)) {
            return null;
        }
        ConcurrentHashMap<Object, TAnnotation> concurrentHashMap = this.f38631b;
        InterfaceC8830c interfaceC8830cMo13668f = mo13668f(tannotation);
        TAnnotation tannotation2 = concurrentHashMap.get(interfaceC8830cMo13668f);
        if (tannotation2 != null) {
            return tannotation2;
        }
        Iterator<TAnnotation> it = mo13669g(tannotation).iterator();
        do {
            if (!it.hasNext()) {
                tannotationM13673k = null;
                break;
            }
            tannotationM13673k = m13673k(it.next());
        } while (tannotationM13673k == null);
        if (tannotationM13673k == null) {
            return null;
        }
        TAnnotation tannotationPutIfAbsent = concurrentHashMap.putIfAbsent(interfaceC8830cMo13668f, tannotationM13673k);
        return tannotationPutIfAbsent == null ? tannotationM13673k : tannotationPutIfAbsent;
    }
}
