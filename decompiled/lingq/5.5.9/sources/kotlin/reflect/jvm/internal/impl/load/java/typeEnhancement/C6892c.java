package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import ae.C0062b;
import bn.C1621e;
import bn.InterfaceC1617a;
import bn.InterfaceC1622f;
import cm.InterfaceC2052l;
import cn.C2064a;
import dm.C5206f;
import dm.C5207g;
import dm.C5209i;
import gn.InterfaceC5820a;
import hn.C6083c;
import hn.C6084d;
import hn.C6085e;
import hn.C6086f;
import hn.C6088h;
import hn.C6089i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState;
import kotlin.reflect.jvm.internal.impl.load.java.ReportLevel;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import mn.C7646c;
import mn.C7648e;
import p102eo.InterfaceC5436a;
import p139go.C5859m;
import p139go.InterfaceC5852f;
import p139go.InterfaceC5856j;
import p139go.InterfaceC5857k;
import p260m8.C7499b;
import p266n.C7669f;
import p347qm.C8646c;
import p372rm.InterfaceC8829b0;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8835e0;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8847k0;
import p372rm.InterfaceC8853n0;
import p385sf.C9000b;
import p420um.AbstractC9571i;
import p420um.C9564e0;
import p543do.AbstractC5257t;
import p543do.AbstractC5262v0;
import p543do.C5258t0;
import p543do.InterfaceC5263w;
import sm.C9078f;
import sm.InterfaceC9073a;
import sm.InterfaceC9075c;
import sm.InterfaceC9077e;
import sn.C9081b;
import tl.C9325m;
import zm.C10517b;
import zm.C10520e;
import zm.C10526k;
import zm.C10530o;
import zm.C10532q;
import zm.C10535t;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C6892c {

    /* JADX INFO: renamed from: a */
    public final C6891b f38891a;

    public C6892c(C6891b c6891b) {
        this.f38891a = c6891b;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01db  */
    /* JADX WARN: Code duplicated, block: B:107:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:110:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:114:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:117:0x0201  */
    /* JADX WARN: Code duplicated, block: B:118:0x020a  */
    /* JADX WARN: Code duplicated, block: B:120:0x020e  */
    /* JADX WARN: Code duplicated, block: B:121:0x0213  */
    /* JADX WARN: Code duplicated, block: B:124:0x0219  */
    /* JADX WARN: Code duplicated, block: B:125:0x0222 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x0224  */
    /* JADX WARN: Code duplicated, block: B:127:0x0227  */
    /* JADX WARN: Code duplicated, block: B:129:0x022b  */
    /* JADX WARN: Code duplicated, block: B:130:0x022e  */
    /* JADX WARN: Code duplicated, block: B:133:0x0233  */
    /* JADX WARN: Code duplicated, block: B:134:0x0235  */
    /* JADX WARN: Code duplicated, block: B:138:0x0240  */
    /* JADX WARN: Code duplicated, block: B:142:0x0246  */
    /* JADX WARN: Code duplicated, block: B:149:0x025e  */
    /* JADX WARN: Code duplicated, block: B:152:0x0263 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:154:0x0266  */
    /* JADX WARN: Code duplicated, block: B:158:0x026f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:159:0x0271 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:161:0x0274  */
    /* JADX WARN: Code duplicated, block: B:164:0x027f  */
    /* JADX WARN: Code duplicated, block: B:166:0x0285  */
    /* JADX WARN: Code duplicated, block: B:169:0x028a  */
    /* JADX WARN: Code duplicated, block: B:170:0x028d  */
    /* JADX WARN: Code duplicated, block: B:172:0x0291  */
    /* JADX WARN: Code duplicated, block: B:174:0x0296  */
    /* JADX WARN: Code duplicated, block: B:175:0x0298  */
    /* JADX WARN: Code duplicated, block: B:20:0x0072  */
    /* JADX WARN: Code duplicated, block: B:227:0x0348  */
    /* JADX WARN: Code duplicated, block: B:274:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:291:0x042c  */
    /* JADX WARN: Code duplicated, block: B:330:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:333:0x017c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:335:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:50:0x0109  */
    /* JADX WARN: Code duplicated, block: B:53:0x0112  */
    /* JADX WARN: Code duplicated, block: B:54:0x0115  */
    /* JADX WARN: Code duplicated, block: B:58:0x011b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x011d  */
    /* JADX WARN: Code duplicated, block: B:64:0x012f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0153  */
    /* JADX WARN: Code duplicated, block: B:71:0x0167  */
    /* JADX WARN: Code duplicated, block: B:72:0x016a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0172  */
    /* JADX WARN: Code duplicated, block: B:84:0x019c  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:99:0x01cc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r2v13, types: [zm.b] */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v73 */
    /* JADX INFO: renamed from: a */
    public final AbstractC5257t m13742a(final C6088h c6088h, AbstractC5257t abstractC5257t, List<? extends AbstractC5257t> list, C6089i c6089i, boolean z10) {
        boolean z11;
        boolean z12;
        InterfaceC5852f interfaceC5852f;
        Iterable iterableMo11289w;
        Iterable iterableM13436d0;
        InterfaceC8847k0 interfaceC8847k0M11654y;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType;
        int i10;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType2;
        boolean z13;
        ArrayList arrayList;
        Iterator it;
        C6083c[] c6083cArr;
        MutabilityQualifier mutabilityQualifier;
        ?? r10;
        InterfaceC9073a interfaceC9073a;
        C10517b c10517b;
        InterfaceC2052l<Object, Boolean> interfaceC2052l;
        Iterator it2;
        C6085e c6085e;
        C7669f c7669f;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType3;
        C10532q c10532q;
        C10526k c10526k;
        C6085e c6085eM13738b;
        C6085e c6085eM12518a;
        NullabilityQualifier nullabilityQualifier;
        boolean z14;
        C6085e c6085eM13738b2;
        C6083c c6083c;
        NullabilityQualifier nullabilityQualifier2;
        boolean z15;
        boolean z16;
        NullabilityQualifier nullabilityQualifier3;
        NullabilityQualifier nullabilityQualifier4;
        boolean z17;
        C6083c c6083c2;
        NullabilityQualifier nullabilityQualifier5;
        NullabilityQualifier nullabilityQualifier6;
        boolean z18;
        C6085e c6085eM13665c;
        C10517b c10517b2;
        InterfaceC2052l<Object, Boolean> interfaceC2052l2;
        C7646c c7646cMo13667e;
        MutabilityQualifier mutabilityQualifier2;
        Iterable iterableMo11289w2;
        InterfaceC5856j interfaceC5856jM11636l0;
        boolean z19;
        NullabilityQualifier nullabilityQualifier7;
        NullabilityQualifier nullabilityQualifier8;
        boolean z20;
        boolean z21;
        C6083c c6083c3;
        InterfaceC5852f interfaceC5852f2;
        NullabilityQualifier nullabilityQualifierM13737c;
        TypeVariance typeVarianceM12291a;
        boolean z22;
        C5207g.m11111f(abstractC5257t, "<this>");
        C5207g.m11111f(list, "overrides");
        ArrayList arrayListM13739d = c6088h.m13739d(abstractC5257t);
        ArrayList arrayList2 = new ArrayList(C9325m.m17681z(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList2.add(c6088h.m13739d((InterfaceC5852f) it3.next()));
        }
        C7669f c7669f2 = c6088h.f35837c;
        boolean z23 = c6088h.f35836b;
        if (z23) {
            if (list.isEmpty()) {
                z22 = false;
                break;
            }
            Iterator it4 = list.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    z22 = false;
                    break;
                }
                InterfaceC5852f interfaceC5852f3 = (InterfaceC5852f) it4.next();
                C5207g.m11111f(interfaceC5852f3, "other");
                if (!((C2064a) c7669f2.f42146a).f10515u.mo11657a(abstractC5257t, (AbstractC5257t) interfaceC5852f3)) {
                    z22 = true;
                    break;
                }
            }
            if (z22) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        int size = z11 ? 1 : arrayListM13739d.size();
        C6083c[] c6083cArr2 = new C6083c[size];
        int i11 = 0;
        while (i11 < size) {
            AbstractC6890a.a aVar = (AbstractC6890a.a) arrayListM13739d.get(i11);
            InterfaceC5852f interfaceC5852f4 = aVar.f38882a;
            C5206f c5206f = C5206f.f33268c;
            InterfaceC9073a interfaceC9073a2 = c6088h.f35835a;
            InterfaceC5857k interfaceC5857k = aVar.f38884c;
            if (interfaceC5852f4 != null) {
                if (interfaceC5857k == null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                interfaceC5852f = aVar.f38882a;
                if (interfaceC5852f != null) {
                    iterableMo11289w = ((AbstractC5257t) interfaceC5852f).mo11289w();
                } else {
                    iterableMo11289w = EmptyList.f38032a;
                }
                iterableM13436d0 = iterableMo11289w;
                if (interfaceC5852f != null || (interfaceC5856jM11636l0 = InterfaceC5436a.a.m11636l0(c5206f, interfaceC5852f)) == null) {
                    interfaceC8847k0M11654y = null;
                } else {
                    interfaceC8847k0M11654y = InterfaceC5436a.a.m11654y(interfaceC5856jM11636l0);
                }
                annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS;
                i10 = size;
                annotationQualifierApplicabilityType2 = c6088h.f35838d;
                if (annotationQualifierApplicabilityType2 == annotationQualifierApplicabilityType) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z12) {
                    if (!z13) {
                        ((C2064a) c7669f2.f42146a).f10514t.mo6213c();
                    }
                    if (interfaceC9073a2 != null || (iterableMo11289w2 = interfaceC9073a2.mo11289w()) == null) {
                        iterableMo11289w2 = EmptyList.f38032a;
                    }
                    iterableM13436d0 = C6752c.m13436d0(iterableMo11289w2, iterableM13436d0);
                }
                C10517b c10517b3 = ((C2064a) c7669f2.f42146a).f10511q;
                c10517b3.getClass();
                arrayList = arrayListM13739d;
                C5207g.m11111f(iterableM13436d0, "annotations");
                it = iterableM13436d0.iterator();
                c6083cArr = c6083cArr2;
                mutabilityQualifier = null;
                r10 = c10517b3;
                while (true) {
                    if (it.hasNext()) {
                        interfaceC9073a = interfaceC9073a2;
                        break;
                    }
                    interfaceC9073a = interfaceC9073a2;
                    c7646cMo13667e = r10.mo13667e(it.next());
                    ?? r21 = r10;
                    if (C10535t.f52562l.contains(c7646cMo13667e)) {
                        mutabilityQualifier2 = MutabilityQualifier.READ_ONLY;
                    } else {
                        if (C10535t.f52563m.contains(c7646cMo13667e)) {
                            mutabilityQualifier2 = MutabilityQualifier.MUTABLE;
                        } else {
                            continue;
                        }
                        interfaceC9073a2 = interfaceC9073a;
                        r10 = r21;
                    }
                    if (mutabilityQualifier == null && mutabilityQualifier != mutabilityQualifier2) {
                        mutabilityQualifier = null;
                        break;
                    }
                    mutabilityQualifier = mutabilityQualifier2;
                    interfaceC9073a2 = interfaceC9073a;
                    r10 = r21;
                }
                c10517b = ((C2064a) c7669f2.f42146a).f10511q;
                interfaceC2052l = new InterfaceC2052l<Object, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$extractQualifiersFromAnnotations$annotationsNullability$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final Boolean mo528n(Object obj) {
                        boolean z24;
                        C5207g.m11111f(obj, "$this$extractNullability");
                        C6088h c6088h2 = (C6088h) c6088h;
                        c6088h2.getClass();
                        InterfaceC9075c interfaceC9075c = (InterfaceC9075c) obj;
                        if ((interfaceC9075c instanceof InterfaceC1622f) && ((InterfaceC1622f) interfaceC9075c).mo5290k()) {
                            z24 = true;
                        } else {
                            if (interfaceC9075c instanceof LazyJavaAnnotationDescriptor) {
                                ((C2064a) c6088h2.f35837c.f42146a).f10514t.mo6213c();
                                if (!((LazyJavaAnnotationDescriptor) interfaceC9075c).f38700h) {
                                    if (c6088h2.f35838d == AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS) {
                                    }
                                }
                                z24 = true;
                            }
                            z24 = false;
                        }
                        return Boolean.valueOf(z24);
                    }
                };
                c10517b.getClass();
                it2 = iterableM13436d0.iterator();
                c6085e = null;
                while (true) {
                    if (it2.hasNext()) {
                        c7669f = c7669f2;
                        break;
                    }
                    c7669f = c7669f2;
                    c6085eM13665c = c10517b.m13665c(it2.next(), interfaceC2052l);
                    if (c6085e == null) {
                        c10517b2 = c10517b;
                        interfaceC2052l2 = interfaceC2052l;
                    } else {
                        if (c6085eM13665c != null || C5207g.m11106a(c6085eM13665c, c6085e)) {
                            c10517b2 = c10517b;
                            interfaceC2052l2 = interfaceC2052l;
                        } else {
                            c10517b2 = c10517b;
                            boolean z24 = c6085e.f35826b;
                            interfaceC2052l2 = interfaceC2052l;
                            boolean z25 = c6085eM13665c.f35826b;
                            if (!z25 || z24) {
                                if (z25 || !z24) {
                                    c6085e = null;
                                    break;
                                }
                            }
                        }
                        c7669f2 = c7669f;
                        c10517b = c10517b2;
                        interfaceC2052l = interfaceC2052l2;
                    }
                    c6085e = c6085eM13665c;
                    c7669f2 = c7669f;
                    c10517b = c10517b2;
                    interfaceC2052l = interfaceC2052l2;
                }
                if (c6085e != null) {
                    nullabilityQualifier5 = NullabilityQualifier.NOT_NULL;
                    nullabilityQualifier6 = c6085e.f35825a;
                    if (nullabilityQualifier6 == nullabilityQualifier5 || interfaceC8847k0M11654y == null) {
                        z18 = false;
                    } else {
                        z18 = true;
                    }
                    c6083c2 = new C6083c(nullabilityQualifier6, mutabilityQualifier, z18, c6085e.f35826b);
                    c6083c = c6083c2;
                    z15 = true;
                } else {
                    if (!z12 || z13) {
                        annotationQualifierApplicabilityType3 = annotationQualifierApplicabilityType2;
                    } else {
                        annotationQualifierApplicabilityType3 = AnnotationQualifierApplicabilityType.TYPE_USE;
                    }
                    c10532q = aVar.f38883b;
                    if (c10532q != null) {
                        c10526k = c10532q.f52531a.get(annotationQualifierApplicabilityType3);
                    } else {
                        c10526k = null;
                    }
                    if (interfaceC8847k0M11654y != null) {
                        c6085eM13738b = c6088h.m13738b(interfaceC8847k0M11654y);
                    } else {
                        c6085eM13738b = null;
                    }
                    if (c6085eM13738b != null) {
                        c6085eM12518a = C6085e.m12518a(c6085eM13738b, NullabilityQualifier.NOT_NULL, false, 2);
                    } else if (c10526k != null) {
                        c6085eM12518a = c10526k.f52517a;
                    } else {
                        c6085eM12518a = null;
                    }
                    if (c6085eM13738b != null) {
                        nullabilityQualifier = c6085eM13738b.f35825a;
                    } else {
                        nullabilityQualifier = null;
                    }
                    if (nullabilityQualifier == NullabilityQualifier.NOT_NULL) {
                        if (interfaceC8847k0M11654y != null) {
                            if (c10526k == null && c10526k.f52519c) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            z14 = z17;
                        }
                    }
                    if (interfaceC5857k != null || (c6085eM13738b2 = c6088h.m13738b(interfaceC5857k)) == null) {
                        c6085eM13738b2 = null;
                    } else if (c6085eM13738b2.f35825a == NullabilityQualifier.NULLABLE) {
                        c6085eM13738b2 = C6085e.m12518a(c6085eM13738b2, NullabilityQualifier.FORCE_FLEXIBILITY, false, 2);
                    }
                    if (c6085eM13738b2 != null) {
                        if (c6085eM12518a == null) {
                            c6085eM12518a = c6085eM13738b2;
                        } else {
                            boolean z26 = c6085eM12518a.f35826b;
                            z16 = c6085eM13738b2.f35826b;
                            if (z16 || z26) {
                                if (z16 && z26) {
                                    c6085eM12518a = c6085eM13738b2;
                                } else {
                                    nullabilityQualifier3 = c6085eM13738b2.f35825a;
                                    nullabilityQualifier4 = c6085eM12518a.f35825a;
                                    if (nullabilityQualifier3.compareTo(nullabilityQualifier4) >= 0 && nullabilityQualifier3.compareTo(nullabilityQualifier4) > 0) {
                                        c6085eM12518a = c6085eM13738b2;
                                    }
                                }
                            }
                        }
                    }
                    if (c6085eM12518a != null) {
                        nullabilityQualifier2 = c6085eM12518a.f35825a;
                    } else {
                        nullabilityQualifier2 = null;
                    }
                    if (c6085eM12518a != null) {
                        boolean z27 = c6085eM12518a.f35826b;
                        z15 = true;
                        boolean z28 = z27;
                        c6083c = new C6083c(nullabilityQualifier2, mutabilityQualifier, z14, z28);
                    } else {
                        z15 = true;
                    }
                    c6083c = new C6083c(nullabilityQualifier2, mutabilityQualifier, z14, z28);
                }
            } else {
                if (interfaceC5857k == null) {
                    typeVarianceM12291a = null;
                } else {
                    if (!(interfaceC5857k instanceof InterfaceC8847k0)) {
                        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5857k + ", " + C5209i.m11118a(interfaceC5857k.getClass())).toString());
                    }
                    Variance varianceMo17088n = ((InterfaceC8847k0) interfaceC5857k).mo17088n();
                    C5207g.m11110e(varianceMo17088n, "this.variance");
                    typeVarianceM12291a = C5859m.m12291a(varianceMo17088n);
                }
                if (typeVarianceM12291a == TypeVariance.IN) {
                    c6083c2 = C6083c.f35819e;
                    i10 = size;
                    arrayList = arrayListM13739d;
                    c7669f = c7669f2;
                    c6083cArr = c6083cArr2;
                    interfaceC9073a = interfaceC9073a2;
                } else {
                    if (interfaceC5857k == null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    interfaceC5852f = aVar.f38882a;
                    if (interfaceC5852f != null) {
                        iterableMo11289w = ((AbstractC5257t) interfaceC5852f).mo11289w();
                    } else {
                        iterableMo11289w = EmptyList.f38032a;
                    }
                    iterableM13436d0 = iterableMo11289w;
                    if (interfaceC5852f != null) {
                        interfaceC8847k0M11654y = null;
                    } else {
                        interfaceC8847k0M11654y = null;
                    }
                    annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS;
                    i10 = size;
                    annotationQualifierApplicabilityType2 = c6088h.f35838d;
                    if (annotationQualifierApplicabilityType2 == annotationQualifierApplicabilityType) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z12) {
                        if (!z13) {
                            ((C2064a) c7669f2.f42146a).f10514t.mo6213c();
                        }
                        if (interfaceC9073a2 != null) {
                            iterableMo11289w2 = EmptyList.f38032a;
                        } else {
                            iterableMo11289w2 = EmptyList.f38032a;
                        }
                        iterableM13436d0 = C6752c.m13436d0(iterableMo11289w2, iterableM13436d0);
                    }
                    C10517b c10517b4 = ((C2064a) c7669f2.f42146a).f10511q;
                    c10517b4.getClass();
                    arrayList = arrayListM13739d;
                    C5207g.m11111f(iterableM13436d0, "annotations");
                    it = iterableM13436d0.iterator();
                    c6083cArr = c6083cArr2;
                    mutabilityQualifier = null;
                    r10 = c10517b4;
                    while (true) {
                        if (it.hasNext()) {
                            interfaceC9073a = interfaceC9073a2;
                            break;
                        }
                        interfaceC9073a = interfaceC9073a2;
                        c7646cMo13667e = r10.mo13667e(it.next());
                        ?? r22 = r10;
                        if (C10535t.f52562l.contains(c7646cMo13667e)) {
                            mutabilityQualifier2 = MutabilityQualifier.READ_ONLY;
                        } else {
                            if (C10535t.f52563m.contains(c7646cMo13667e)) {
                                mutabilityQualifier2 = MutabilityQualifier.MUTABLE;
                            } else {
                                continue;
                            }
                            interfaceC9073a2 = interfaceC9073a;
                            r10 = r22;
                        }
                        if (mutabilityQualifier == null) {
                        }
                        mutabilityQualifier = mutabilityQualifier2;
                        interfaceC9073a2 = interfaceC9073a;
                        r10 = r22;
                    }
                    c10517b = ((C2064a) c7669f2.f42146a).f10511q;
                    interfaceC2052l = new InterfaceC2052l<Object, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$extractQualifiersFromAnnotations$annotationsNullability$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final Boolean mo528n(Object obj) {
                            boolean z29;
                            C5207g.m11111f(obj, "$this$extractNullability");
                            C6088h c6088h2 = (C6088h) c6088h;
                            c6088h2.getClass();
                            InterfaceC9075c interfaceC9075c = (InterfaceC9075c) obj;
                            if ((interfaceC9075c instanceof InterfaceC1622f) && ((InterfaceC1622f) interfaceC9075c).mo5290k()) {
                                z29 = true;
                            } else {
                                if (interfaceC9075c instanceof LazyJavaAnnotationDescriptor) {
                                    ((C2064a) c6088h2.f35837c.f42146a).f10514t.mo6213c();
                                    if (!((LazyJavaAnnotationDescriptor) interfaceC9075c).f38700h) {
                                        if (c6088h2.f35838d == AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS) {
                                        }
                                    }
                                    z29 = true;
                                }
                                z29 = false;
                            }
                            return Boolean.valueOf(z29);
                        }
                    };
                    c10517b.getClass();
                    it2 = iterableM13436d0.iterator();
                    c6085e = null;
                    while (true) {
                        if (it2.hasNext()) {
                            c7669f = c7669f2;
                            break;
                        }
                        c7669f = c7669f2;
                        c6085eM13665c = c10517b.m13665c(it2.next(), interfaceC2052l);
                        if (c6085e == null) {
                            c10517b2 = c10517b;
                            interfaceC2052l2 = interfaceC2052l;
                        } else {
                            if (c6085eM13665c != null) {
                                c10517b2 = c10517b;
                                interfaceC2052l2 = interfaceC2052l;
                            } else {
                                c10517b2 = c10517b;
                                interfaceC2052l2 = interfaceC2052l;
                            }
                            c7669f2 = c7669f;
                            c10517b = c10517b2;
                            interfaceC2052l = interfaceC2052l2;
                        }
                        c6085e = c6085eM13665c;
                        c7669f2 = c7669f;
                        c10517b = c10517b2;
                        interfaceC2052l = interfaceC2052l2;
                    }
                    if (c6085e != null) {
                        nullabilityQualifier5 = NullabilityQualifier.NOT_NULL;
                        nullabilityQualifier6 = c6085e.f35825a;
                        if (nullabilityQualifier6 == nullabilityQualifier5) {
                            z18 = false;
                        } else {
                            z18 = false;
                        }
                        c6083c2 = new C6083c(nullabilityQualifier6, mutabilityQualifier, z18, c6085e.f35826b);
                    } else {
                        if (z12) {
                            annotationQualifierApplicabilityType3 = annotationQualifierApplicabilityType2;
                        } else {
                            annotationQualifierApplicabilityType3 = annotationQualifierApplicabilityType2;
                        }
                        c10532q = aVar.f38883b;
                        if (c10532q != null) {
                            c10526k = c10532q.f52531a.get(annotationQualifierApplicabilityType3);
                        } else {
                            c10526k = null;
                        }
                        if (interfaceC8847k0M11654y != null) {
                            c6085eM13738b = c6088h.m13738b(interfaceC8847k0M11654y);
                        } else {
                            c6085eM13738b = null;
                        }
                        if (c6085eM13738b != null) {
                            c6085eM12518a = C6085e.m12518a(c6085eM13738b, NullabilityQualifier.NOT_NULL, false, 2);
                        } else if (c10526k != null) {
                            c6085eM12518a = c10526k.f52517a;
                        } else {
                            c6085eM12518a = null;
                        }
                        if (c6085eM13738b != null) {
                            nullabilityQualifier = c6085eM13738b.f35825a;
                        } else {
                            nullabilityQualifier = null;
                        }
                        if (nullabilityQualifier == NullabilityQualifier.NOT_NULL) {
                            if (interfaceC8847k0M11654y != null) {
                                if (c10526k == null) {
                                    z17 = false;
                                } else {
                                    z17 = false;
                                }
                                if (z17) {
                                }
                            }
                        }
                        if (interfaceC5857k != null) {
                            c6085eM13738b2 = null;
                        } else {
                            c6085eM13738b2 = null;
                        }
                        if (c6085eM13738b2 != null) {
                            if (c6085eM12518a == null) {
                                c6085eM12518a = c6085eM13738b2;
                            } else {
                                boolean z29 = c6085eM12518a.f35826b;
                                z16 = c6085eM13738b2.f35826b;
                                if (z16) {
                                    if (z16) {
                                        nullabilityQualifier3 = c6085eM13738b2.f35825a;
                                        nullabilityQualifier4 = c6085eM12518a.f35825a;
                                        if (nullabilityQualifier3.compareTo(nullabilityQualifier4) >= 0) {
                                            c6085eM12518a = c6085eM13738b2;
                                        }
                                    } else {
                                        nullabilityQualifier3 = c6085eM13738b2.f35825a;
                                        nullabilityQualifier4 = c6085eM12518a.f35825a;
                                        if (nullabilityQualifier3.compareTo(nullabilityQualifier4) >= 0) {
                                            c6085eM12518a = c6085eM13738b2;
                                        }
                                    }
                                } else if (z16) {
                                    nullabilityQualifier3 = c6085eM13738b2.f35825a;
                                    nullabilityQualifier4 = c6085eM12518a.f35825a;
                                    if (nullabilityQualifier3.compareTo(nullabilityQualifier4) >= 0) {
                                        c6085eM12518a = c6085eM13738b2;
                                    }
                                } else {
                                    nullabilityQualifier3 = c6085eM13738b2.f35825a;
                                    nullabilityQualifier4 = c6085eM12518a.f35825a;
                                    if (nullabilityQualifier3.compareTo(nullabilityQualifier4) >= 0) {
                                        c6085eM12518a = c6085eM13738b2;
                                    }
                                }
                            }
                        }
                        if (c6085eM12518a != null) {
                            nullabilityQualifier2 = c6085eM12518a.f35825a;
                        } else {
                            nullabilityQualifier2 = null;
                        }
                        if (c6085eM12518a != null) {
                            boolean z210 = c6085eM12518a.f35826b;
                            z15 = true;
                            if (z210) {
                            }
                            c6083c = new C6083c(nullabilityQualifier2, mutabilityQualifier, z14, z28);
                        } else {
                            z15 = true;
                        }
                        c6083c = new C6083c(nullabilityQualifier2, mutabilityQualifier, z14, z28);
                    }
                }
                c6083c = c6083c2;
                z15 = true;
            }
            ArrayList<C6083c> arrayList3 = new ArrayList();
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                AbstractC6890a.a aVar2 = (AbstractC6890a.a) C6752c.m13426T(i11, (List) it5.next());
                if (aVar2 == null || (interfaceC5852f2 = aVar2.f38882a) == null) {
                    c6083c3 = null;
                } else {
                    NullabilityQualifier nullabilityQualifierM13737c2 = AbstractC6890a.m13737c(interfaceC5852f2);
                    if (nullabilityQualifierM13737c2 == null) {
                        AbstractC5257t abstractC5257tM346f1 = C0062b.m346f1((AbstractC5257t) interfaceC5852f2);
                        nullabilityQualifierM13737c = abstractC5257tM346f1 != null ? AbstractC6890a.m13737c(abstractC5257tM346f1) : null;
                    } else {
                        nullabilityQualifierM13737c = nullabilityQualifierM13737c2;
                    }
                    String str = C8646c.f46201a;
                    c6083c3 = new C6083c(nullabilityQualifierM13737c, C8646c.f46211k.containsKey(c6088h.m12523e(InterfaceC5436a.a.m11614a0(c5206f, interfaceC5852f2))) ? MutabilityQualifier.READ_ONLY : C8646c.f46210j.containsKey(c6088h.m12523e(InterfaceC5436a.a.m11642o0(c5206f, interfaceC5852f2))) ? MutabilityQualifier.MUTABLE : null, (InterfaceC5436a.a.m11597K(c5206f, interfaceC5852f2) || (((AbstractC5257t) interfaceC5852f2).mo11288a1() instanceof C6084d)) ? z15 : false, nullabilityQualifierM13737c != nullabilityQualifierM13737c2 ? z15 : false);
                }
                if (c6083c3 != null) {
                    arrayList3.add(c6083c3);
                }
            }
            boolean z30 = (i11 == 0 && z23) ? z15 : false;
            if (i11 == 0) {
                InterfaceC9073a interfaceC9073a3 = interfaceC9073a;
                if ((!(interfaceC9073a3 instanceof InterfaceC8853n0) || ((InterfaceC8853n0) interfaceC9073a3).mo13647r0() == null) ? false : z15) {
                    z19 = z15;
                } else {
                    z19 = false;
                }
            } else {
                z19 = false;
            }
            ArrayList arrayList4 = new ArrayList();
            for (C6083c c6083c4 : arrayList3) {
                NullabilityQualifier nullabilityQualifier9 = c6083c4.f35823d ? null : c6083c4.f35820a;
                if (nullabilityQualifier9 != null) {
                    arrayList4.add(nullabilityQualifier9);
                }
            }
            Set setM13457y0 = C6752c.m13457y0(arrayList4);
            boolean z31 = c6083c.f35823d;
            NullabilityQualifier nullabilityQualifier10 = c6083c.f35820a;
            NullabilityQualifier nullabilityQualifier11 = z31 ? null : nullabilityQualifier10;
            NullabilityQualifier nullabilityQualifier12 = NullabilityQualifier.FORCE_FLEXIBILITY;
            if (nullabilityQualifier11 != nullabilityQualifier12) {
                nullabilityQualifier12 = (NullabilityQualifier) C0062b.m329Z1(setM13457y0, NullabilityQualifier.NOT_NULL, NullabilityQualifier.NULLABLE, nullabilityQualifier11, z30);
            }
            if (nullabilityQualifier12 == null) {
                ArrayList arrayList5 = new ArrayList();
                Iterator it6 = arrayList3.iterator();
                while (it6.hasNext()) {
                    NullabilityQualifier nullabilityQualifier13 = ((C6083c) it6.next()).f35820a;
                    if (nullabilityQualifier13 != null) {
                        arrayList5.add(nullabilityQualifier13);
                    }
                }
                Set setM13457y1 = C6752c.m13457y0(arrayList5);
                nullabilityQualifier7 = NullabilityQualifier.FORCE_FLEXIBILITY;
                if (nullabilityQualifier10 != nullabilityQualifier7) {
                    nullabilityQualifier7 = (NullabilityQualifier) C0062b.m329Z1(setM13457y1, NullabilityQualifier.NOT_NULL, NullabilityQualifier.NULLABLE, nullabilityQualifier10, z30);
                }
            } else {
                nullabilityQualifier7 = nullabilityQualifier12;
            }
            ArrayList arrayList6 = new ArrayList();
            Iterator it7 = arrayList3.iterator();
            while (it7.hasNext()) {
                MutabilityQualifier mutabilityQualifier3 = ((C6083c) it7.next()).f35821b;
                if (mutabilityQualifier3 != null) {
                    arrayList6.add(mutabilityQualifier3);
                }
            }
            MutabilityQualifier mutabilityQualifier4 = (MutabilityQualifier) C0062b.m329Z1(C6752c.m13457y0(arrayList6), MutabilityQualifier.MUTABLE, MutabilityQualifier.READ_ONLY, c6083c.f35821b, z30);
            if (nullabilityQualifier7 == null) {
                nullabilityQualifier8 = null;
            } else if ((z10 || (z19 && nullabilityQualifier7 == NullabilityQualifier.NULLABLE)) ? z15 : false) {
                nullabilityQualifier8 = null;
            } else {
                nullabilityQualifier8 = nullabilityQualifier7;
            }
            if (nullabilityQualifier8 != NullabilityQualifier.NOT_NULL) {
                z20 = false;
            } else {
                if (!c6083c.f35822c) {
                    if (arrayList3.isEmpty()) {
                        z21 = false;
                        break;
                    }
                    Iterator it8 = arrayList3.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            z21 = false;
                            break;
                        }
                        if (((C6083c) it8.next()).f35822c) {
                            z21 = z15;
                            break;
                        }
                    }
                    if (!z21) {
                        z20 = false;
                    }
                }
                z20 = z15;
            }
            c6083cArr[i11] = new C6083c(nullabilityQualifier8, mutabilityQualifier4, z20, (nullabilityQualifier8 == null || nullabilityQualifier12 == nullabilityQualifier7) ? false : z15);
            i11++;
            size = i10;
            arrayListM13739d = arrayList;
            c6083cArr2 = c6083cArr;
            c7669f2 = c7669f;
        }
        AbstractSignatureParts$computeIndexedQualifiers$1 abstractSignatureParts$computeIndexedQualifiers$1 = new AbstractSignatureParts$computeIndexedQualifiers$1(c6089i, c6083cArr2);
        C6891b c6891b = this.f38891a;
        c6891b.getClass();
        return c6891b.m13741b(abstractC5257t.mo11288a1(), abstractSignatureParts$computeIndexedQualifiers$1, 0, c6088h.f35839e).f38886a;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC5257t m13743b(CallableMemberDescriptor callableMemberDescriptor, InterfaceC9073a interfaceC9073a, boolean z10, C7669f c7669f, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, C6089i c6089i, boolean z11, InterfaceC2052l<? super CallableMemberDescriptor, ? extends AbstractC5257t> interfaceC2052l) {
        C6088h c6088h = new C6088h(interfaceC9073a, z10, c7669f, annotationQualifierApplicabilityType);
        AbstractC5257t abstractC5257tMo528n = interfaceC2052l.mo528n(callableMemberDescriptor);
        Collection<? extends CallableMemberDescriptor> collectionMo11893p = callableMemberDescriptor.mo11893p();
        C5207g.m11110e(collectionMo11893p, "overriddenDescriptors");
        ArrayList arrayList = new ArrayList(C9325m.m17681z(collectionMo11893p, 10));
        for (CallableMemberDescriptor callableMemberDescriptor2 : collectionMo11893p) {
            C5207g.m11110e(callableMemberDescriptor2, "it");
            arrayList.add(interfaceC2052l.mo528n(callableMemberDescriptor2));
        }
        return m13742a(c6088h, abstractC5257tMo528n, arrayList, c6089i, z11);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:103:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:104:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:108:0x021e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0220  */
    /* JADX WARN: Code duplicated, block: B:115:0x022d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0231  */
    /* JADX WARN: Code duplicated, block: B:118:0x0234  */
    /* JADX WARN: Code duplicated, block: B:121:0x023b  */
    /* JADX WARN: Code duplicated, block: B:122:0x023f  */
    /* JADX WARN: Code duplicated, block: B:125:0x025d  */
    /* JADX WARN: Code duplicated, block: B:12:0x004a  */
    /* JADX WARN: Code duplicated, block: B:130:0x026e  */
    /* JADX WARN: Code duplicated, block: B:132:0x0272  */
    /* JADX WARN: Code duplicated, block: B:135:0x0282  */
    /* JADX WARN: Code duplicated, block: B:138:0x028c  */
    /* JADX WARN: Code duplicated, block: B:141:0x02a5 A[EDGE_INSN: B:141:0x02a5->B:142:0x02a7 BREAK  A[LOOP:2: B:136:0x0286->B:200:?]] */
    /* JADX WARN: Code duplicated, block: B:144:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:145:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:147:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:148:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:168:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:169:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:171:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:172:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:173:0x02fc A[PHI: r19
      0x02fc: PHI (r19v2 do.t) = (r19v1 do.t), (r19v3 do.t) binds: [B:168:0x02ec, B:171:0x02f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:177:0x0317  */
    /* JADX WARN: Code duplicated, block: B:179:0x031f  */
    /* JADX WARN: Code duplicated, block: B:181:0x0323  */
    /* JADX WARN: Code duplicated, block: B:186:0x0341  */
    /* JADX WARN: Code duplicated, block: B:191:0x033a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x02a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x02a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:? A[LOOP:2: B:136:0x0286->B:200:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x033f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x0336 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:74:0x015a  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c9  */
    /* JADX INFO: renamed from: c */
    public final ArrayList m13744c(C7669f c7669f, Collection collection) {
        int i10;
        InterfaceC9077e c9078f;
        CallableMemberDescriptor callableMemberDescriptor;
        AbstractC5257t abstractC5257tMo11884c;
        C6086f c6086f;
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2;
        C6086f c6086f2;
        CallableMemberDescriptor callableMemberDescriptor2;
        InterfaceC8829b0 interfaceC8829b0;
        boolean z11;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType;
        C6089i c6089i;
        AbstractC5257t abstractC5257tM13743b;
        AbstractC5257t abstractC5257tMo11900y;
        SignatureEnhancement$containsFunctionN$1 signatureEnhancement$containsFunctionN$1;
        boolean z12;
        Pair pair;
        AbstractC5257t abstractC5257t;
        ArrayList arrayList3;
        Iterator it;
        int i11;
        Object next;
        AbstractC5257t abstractC5257tMo11884c2;
        InterfaceC8835e0 interfaceC8835e0Mo11896s0;
        InterfaceC8835e0 interfaceC8835e0Mo11896s1;
        boolean zM11292c;
        List<InterfaceC8853n0> listMo11889i;
        boolean z13;
        Iterator<T> it2;
        AbstractC5257t abstractC5257tMo11884c3;
        AbstractC5257t abstractC5257tMo11884c4;
        C6089i c6089i2;
        C7669f c7669fM13682b;
        List<C6089i> list;
        C5207g.m11111f(c7669f, "c");
        C5207g.m11111f(collection, "platformSignatures");
        int i12 = 10;
        ArrayList arrayList4 = new ArrayList(C9325m.m17681z(collection, 10));
        Iterator it3 = collection.iterator();
        while (it3.hasNext()) {
            CallableMemberDescriptor callableMemberDescriptorMo5275D0 = (CallableMemberDescriptor) it3.next();
            if (callableMemberDescriptorMo5275D0 instanceof InterfaceC1617a) {
                InterfaceC1617a interfaceC1617a = (InterfaceC1617a) callableMemberDescriptorMo5275D0;
                boolean z14 = true;
                if (interfaceC1617a.mo11897u() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE && interfaceC1617a.mo18004P0().mo11893p().size() == 1) {
                    i10 = i12;
                } else {
                    InterfaceC8834e interfaceC8834eM11005a1 = C5206f.m11005a1(callableMemberDescriptorMo5275D0);
                    int i13 = 0;
                    if (interfaceC8834eM11005a1 == null) {
                        c9078f = callableMemberDescriptorMo5275D0.mo11289w();
                    } else {
                        LazyJavaClassDescriptor lazyJavaClassDescriptor = interfaceC8834eM11005a1 instanceof LazyJavaClassDescriptor ? (LazyJavaClassDescriptor) interfaceC8834eM11005a1 : null;
                        List list2 = lazyJavaClassDescriptor != null ? (List) lazyJavaClassDescriptor.f38720l.getValue() : null;
                        if (list2 == null || list2.isEmpty()) {
                            c9078f = callableMemberDescriptorMo5275D0.mo11289w();
                        } else {
                            ArrayList arrayList5 = new ArrayList(C9325m.m17681z(list2, i12));
                            Iterator it4 = list2.iterator();
                            while (it4.hasNext()) {
                                arrayList5.add(new LazyJavaAnnotationDescriptor(c7669f, (InterfaceC5820a) it4.next(), true));
                            }
                            ArrayList arrayListM13436d0 = C6752c.m13436d0(callableMemberDescriptorMo5275D0.mo11289w(), arrayList5);
                            c9078f = arrayListM13436d0.isEmpty() ? InterfaceC9077e.a.f47365a : new C9078f(arrayListM13436d0);
                        }
                    }
                    C7669f c7669fM13682b2 = ContextKt.m13682b(c7669f, c9078f);
                    if (callableMemberDescriptorMo5275D0 instanceof C1621e) {
                        C9564e0 c9564e0 = ((C1621e) callableMemberDescriptorMo5275D0).f49163S;
                        if ((c9564e0 == null || c9564e0.f49144e) ? false : true) {
                            C5207g.m11108c(c9564e0);
                            callableMemberDescriptor = c9564e0;
                        } else {
                            callableMemberDescriptor = callableMemberDescriptorMo5275D0;
                        }
                    } else {
                        callableMemberDescriptor = callableMemberDescriptorMo5275D0;
                    }
                    InterfaceC1617a interfaceC1617a2 = (InterfaceC1617a) callableMemberDescriptorMo5275D0;
                    if (interfaceC1617a2.mo11896s0() != null) {
                        InterfaceC6822c interfaceC6822c = (InterfaceC6822c) (!(callableMemberDescriptor instanceof InterfaceC6822c) ? null : callableMemberDescriptor);
                        InterfaceC9073a interfaceC9073a = interfaceC6822c != null ? (InterfaceC8853n0) interfaceC6822c.mo5289p0(JavaMethodDescriptor.f38656b0) : null;
                        abstractC5257tMo11884c = m13743b(callableMemberDescriptorMo5275D0, interfaceC9073a, false, interfaceC9073a != null ? ContextKt.m13682b(c7669fM13682b2, interfaceC9073a.mo11289w()) : c7669fM13682b2, AnnotationQualifierApplicabilityType.VALUE_PARAMETER, null, false, new InterfaceC2052l<CallableMemberDescriptor, AbstractC5257t>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final AbstractC5257t mo528n(CallableMemberDescriptor callableMemberDescriptor3) {
                                CallableMemberDescriptor callableMemberDescriptor4 = callableMemberDescriptor3;
                                C5207g.m11111f(callableMemberDescriptor4, "it");
                                InterfaceC8835e0 interfaceC8835e0Mo11896s2 = callableMemberDescriptor4.mo11896s0();
                                C5207g.m11108c(interfaceC8835e0Mo11896s2);
                                AbstractC5257t abstractC5257tMo11884c5 = interfaceC8835e0Mo11896s2.mo11884c();
                                C5207g.m11110e(abstractC5257tMo11884c5, "it.extensionReceiverParameter!!.type");
                                return abstractC5257tMo11884c5;
                            }
                        });
                    } else {
                        abstractC5257tMo11884c = null;
                    }
                    JavaMethodDescriptor javaMethodDescriptor = callableMemberDescriptorMo5275D0 instanceof JavaMethodDescriptor ? (JavaMethodDescriptor) callableMemberDescriptorMo5275D0 : null;
                    if (javaMethodDescriptor != null) {
                        InterfaceC8838g interfaceC8838gMo11876g = javaMethodDescriptor.mo11876g();
                        C5207g.m11109d(interfaceC8838gMo11876g, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        String strM344e2 = C0062b.m344e2((InterfaceC8830c) interfaceC8838gMo11876g, C7499b.m14957p(javaMethodDescriptor, 3));
                        if (strM344e2 != null) {
                            c6086f = (C6086f) PredefinedEnhancementInfoKt.f38843d.get(strM344e2);
                        } else {
                            c6086f = null;
                        }
                    } else {
                        c6086f = null;
                    }
                    if (c6086f != null) {
                        c6086f.f35828b.size();
                        interfaceC1617a2.mo11889i().size();
                    }
                    JavaTypeEnhancementState javaTypeEnhancementState = ((C2064a) c7669f.f42146a).f10516v;
                    C5207g.m11111f(javaTypeEnhancementState, "javaTypeEnhancementState");
                    if (javaTypeEnhancementState.f38605b.mo528n(C10530o.f52524a) == ReportLevel.STRICT) {
                        z10 = (callableMemberDescriptorMo5275D0 instanceof InterfaceC6822c) && C5207g.m11106a(callableMemberDescriptorMo5275D0.mo5289p0(JavaMethodDescriptor.f38657c0), Boolean.TRUE);
                        List<InterfaceC8853n0> listMo11889i2 = callableMemberDescriptor.mo11889i();
                        C5207g.m11110e(listMo11889i2, "annotationOwnerForMember.valueParameters");
                        arrayList = new ArrayList(C9325m.m17681z(listMo11889i2, i12));
                        for (final InterfaceC8853n0 interfaceC8853n0 : listMo11889i2) {
                            if (c6086f != null || (list = c6086f.f35828b) == null) {
                                c6089i2 = null;
                            } else {
                                c6089i2 = (C6089i) C6752c.m13426T(interfaceC8853n0.getIndex(), list);
                            }
                            InterfaceC2052l<? super CallableMemberDescriptor, ? extends AbstractC5257t> interfaceC2052l = new InterfaceC2052l<CallableMemberDescriptor, AbstractC5257t>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$valueParameterEnhancements$1$1
                                {
                                    super(1);
                                }

                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final AbstractC5257t mo528n(CallableMemberDescriptor callableMemberDescriptor3) {
                                    CallableMemberDescriptor callableMemberDescriptor4 = callableMemberDescriptor3;
                                    C5207g.m11111f(callableMemberDescriptor4, "it");
                                    AbstractC5257t abstractC5257tMo11884c5 = callableMemberDescriptor4.mo11889i().get(interfaceC8853n0.getIndex()).mo11884c();
                                    C5207g.m11110e(abstractC5257tMo11884c5, "it.valueParameters[p.index].type");
                                    return abstractC5257tMo11884c5;
                                }
                            };
                            if (interfaceC8853n0 != null) {
                                c7669fM13682b = ContextKt.m13682b(c7669fM13682b2, interfaceC8853n0.mo11289w());
                            } else {
                                c7669fM13682b = c7669fM13682b2;
                            }
                            ArrayList arrayList6 = arrayList;
                            arrayList6.add(m13743b(callableMemberDescriptorMo5275D0, interfaceC8853n0, false, c7669fM13682b, AnnotationQualifierApplicabilityType.VALUE_PARAMETER, c6089i2, z10, interfaceC2052l));
                            arrayList = arrayList6;
                            c6086f = c6086f;
                        }
                        arrayList2 = arrayList;
                        c6086f2 = c6086f;
                        if (callableMemberDescriptorMo5275D0 instanceof InterfaceC8829b0) {
                            callableMemberDescriptor2 = callableMemberDescriptorMo5275D0;
                        } else {
                            callableMemberDescriptor2 = null;
                        }
                        interfaceC8829b0 = (InterfaceC8829b0) callableMemberDescriptor2;
                        if (interfaceC8829b0 == null && C0062b.m418y1(interfaceC8829b0)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.FIELD;
                        } else {
                            annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE;
                        }
                        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType2 = annotationQualifierApplicabilityType;
                        if (c6086f2 != null) {
                            c6089i = c6086f2.f35827a;
                        } else {
                            c6089i = null;
                        }
                        abstractC5257tM13743b = m13743b(callableMemberDescriptorMo5275D0, callableMemberDescriptor, true, c7669fM13682b2, annotationQualifierApplicabilityType2, c6089i, false, new InterfaceC2052l<CallableMemberDescriptor, AbstractC5257t>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final AbstractC5257t mo528n(CallableMemberDescriptor callableMemberDescriptor3) {
                                CallableMemberDescriptor callableMemberDescriptor4 = callableMemberDescriptor3;
                                C5207g.m11111f(callableMemberDescriptor4, "it");
                                AbstractC5257t abstractC5257tMo11900y2 = callableMemberDescriptor4.mo11900y();
                                C5207g.m11108c(abstractC5257tMo11900y2);
                                return abstractC5257tMo11900y2;
                            }
                        });
                        abstractC5257tMo11900y = interfaceC1617a2.mo11900y();
                        C5207g.m11108c(abstractC5257tMo11900y);
                        signatureEnhancement$containsFunctionN$1 = new InterfaceC2052l<AbstractC5262v0, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$containsFunctionN$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final Boolean mo528n(AbstractC5262v0 abstractC5262v0) {
                                InterfaceC8834e interfaceC8834eMo11235q = abstractC5262v0.mo11250X0().mo11235q();
                                if (interfaceC8834eMo11235q == null) {
                                    return Boolean.FALSE;
                                }
                                C7648e c7648eMo11874a = interfaceC8834eMo11235q.mo11874a();
                                C7646c c7646c = C8646c.f46206f;
                                return Boolean.valueOf(C5207g.m11106a(c7648eMo11874a, c7646c.m15218f()) && C5207g.m11106a(DescriptorUtilsKt.m14106c(interfaceC8834eMo11235q), c7646c));
                            }
                        };
                        if (C5258t0.m11292c(abstractC5257tMo11900y, signatureEnhancement$containsFunctionN$1)) {
                            z12 = true;
                        } else {
                            interfaceC8835e0Mo11896s1 = interfaceC1617a2.mo11896s0();
                            if (interfaceC8835e0Mo11896s1 != null || (abstractC5257tMo11884c4 = interfaceC8835e0Mo11896s1.mo11884c()) == null) {
                                zM11292c = false;
                            } else {
                                zM11292c = C5258t0.m11292c(abstractC5257tMo11884c4, signatureEnhancement$containsFunctionN$1);
                            }
                            if (zM11292c) {
                                z12 = true;
                            } else {
                                listMo11889i = interfaceC1617a2.mo11889i();
                                C5207g.m11110e(listMo11889i, "valueParameters");
                                if (listMo11889i.isEmpty()) {
                                    z13 = false;
                                    break;
                                }
                                it2 = listMo11889i.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        z13 = false;
                                        break;
                                    }
                                    abstractC5257tMo11884c3 = ((InterfaceC8853n0) it2.next()).mo11884c();
                                    C5207g.m11110e(abstractC5257tMo11884c3, "it.type");
                                    if (C5258t0.m11292c(abstractC5257tMo11884c3, new InterfaceC2052l<AbstractC5262v0, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$containsFunctionN$1
                                        @Override // cm.InterfaceC2052l
                                        /* JADX INFO: renamed from: n */
                                        public final Boolean mo528n(AbstractC5262v0 abstractC5262v0) {
                                            InterfaceC8834e interfaceC8834eMo11235q = abstractC5262v0.mo11250X0().mo11235q();
                                            if (interfaceC8834eMo11235q == null) {
                                                return Boolean.FALSE;
                                            }
                                            C7648e c7648eMo11874a = interfaceC8834eMo11235q.mo11874a();
                                            C7646c c7646c = C8646c.f46206f;
                                            return Boolean.valueOf(C5207g.m11106a(c7648eMo11874a, c7646c.m15218f()) && C5207g.m11106a(DescriptorUtilsKt.m14106c(interfaceC8834eMo11235q), c7646c));
                                        }
                                    })) {
                                        z13 = true;
                                        break;
                                    }
                                }
                                if (z13) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                            }
                        }
                        if (z12) {
                            pair = new Pair(C9081b.f47369a, new C10520e(callableMemberDescriptorMo5275D0));
                        } else {
                            pair = null;
                        }
                        if (abstractC5257tMo11884c == null && abstractC5257tM13743b == null) {
                            if (arrayList2.isEmpty()) {
                                z14 = false;
                                break;
                            }
                            Iterator it5 = arrayList2.iterator();
                            do {
                                if (!it5.hasNext()) {
                                    z14 = false;
                                    break;
                                }
                            } while (!(((AbstractC5257t) it5.next()) != null));
                            if (z14 || pair != null) {
                                if (abstractC5257tMo11884c != null) {
                                    abstractC5257t = abstractC5257tMo11884c;
                                } else {
                                    interfaceC8835e0Mo11896s0 = interfaceC1617a2.mo11896s0();
                                    if (interfaceC8835e0Mo11896s0 != null) {
                                        abstractC5257tMo11884c = interfaceC8835e0Mo11896s0.mo11884c();
                                        abstractC5257t = abstractC5257tMo11884c;
                                    } else {
                                        abstractC5257t = null;
                                    }
                                }
                                i10 = 10;
                                arrayList3 = new ArrayList(C9325m.m17681z(arrayList2, 10));
                                it = arrayList2.iterator();
                                while (true) {
                                    i11 = i13;
                                    if (it.hasNext()) {
                                        if (abstractC5257tM13743b == null) {
                                            abstractC5257tM13743b = interfaceC1617a2.mo11900y();
                                            C5207g.m11108c(abstractC5257tM13743b);
                                        }
                                        callableMemberDescriptorMo5275D0 = interfaceC1617a2.mo5275D0(abstractC5257t, arrayList3, abstractC5257tM13743b, pair);
                                        C5207g.m11109d(callableMemberDescriptorMo5275D0, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
                                        break;
                                        break;
                                    }
                                    next = it.next();
                                    i13 = i11 + 1;
                                    if (i11 >= 0) {
                                        C9000b.m17257w();
                                        throw null;
                                    }
                                    abstractC5257tMo11884c2 = (AbstractC5257t) next;
                                    if (abstractC5257tMo11884c2 == null) {
                                        abstractC5257tMo11884c2 = interfaceC1617a2.mo11889i().get(i11).mo11884c();
                                        C5207g.m11110e(abstractC5257tMo11884c2, "valueParameters[index].type");
                                    }
                                    arrayList3.add(abstractC5257tMo11884c2);
                                }
                            } else {
                                i10 = 10;
                            }
                        } else {
                            if (abstractC5257tMo11884c != null) {
                                abstractC5257t = abstractC5257tMo11884c;
                            } else {
                                interfaceC8835e0Mo11896s0 = interfaceC1617a2.mo11896s0();
                                if (interfaceC8835e0Mo11896s0 != null) {
                                    abstractC5257tMo11884c = interfaceC8835e0Mo11896s0.mo11884c();
                                    abstractC5257t = abstractC5257tMo11884c;
                                } else {
                                    abstractC5257t = null;
                                }
                            }
                            i10 = 10;
                            arrayList3 = new ArrayList(C9325m.m17681z(arrayList2, 10));
                            it = arrayList2.iterator();
                            while (true) {
                                i11 = i13;
                                if (it.hasNext()) {
                                    if (abstractC5257tM13743b == null) {
                                        abstractC5257tM13743b = interfaceC1617a2.mo11900y();
                                        C5207g.m11108c(abstractC5257tM13743b);
                                    }
                                    callableMemberDescriptorMo5275D0 = interfaceC1617a2.mo5275D0(abstractC5257t, arrayList3, abstractC5257tM13743b, pair);
                                    C5207g.m11109d(callableMemberDescriptorMo5275D0, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
                                    break;
                                }
                                next = it.next();
                                i13 = i11 + 1;
                                if (i11 >= 0) {
                                    C9000b.m17257w();
                                    throw null;
                                }
                                abstractC5257tMo11884c2 = (AbstractC5257t) next;
                                if (abstractC5257tMo11884c2 == null) {
                                    abstractC5257tMo11884c2 = interfaceC1617a2.mo11889i().get(i11).mo11884c();
                                    C5207g.m11110e(abstractC5257tMo11884c2, "valueParameters[index].type");
                                }
                                arrayList3.add(abstractC5257tMo11884c2);
                            }
                        }
                    } else {
                        ((C2064a) c7669fM13682b2.f42146a).f10514t.mo6212b();
                    }
                    List<InterfaceC8853n0> listMo11889i3 = callableMemberDescriptor.mo11889i();
                    C5207g.m11110e(listMo11889i3, "annotationOwnerForMember.valueParameters");
                    arrayList = new ArrayList(C9325m.m17681z(listMo11889i3, i12));
                    while (r21.hasNext()) {
                        if (c6086f != null) {
                            c6089i2 = null;
                        } else {
                            c6089i2 = null;
                        }
                        InterfaceC2052l<? super CallableMemberDescriptor, ? extends AbstractC5257t> interfaceC2052l2 = new InterfaceC2052l<CallableMemberDescriptor, AbstractC5257t>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$valueParameterEnhancements$1$1
                            {
                                super(1);
                            }

                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final AbstractC5257t mo528n(CallableMemberDescriptor callableMemberDescriptor3) {
                                CallableMemberDescriptor callableMemberDescriptor4 = callableMemberDescriptor3;
                                C5207g.m11111f(callableMemberDescriptor4, "it");
                                AbstractC5257t abstractC5257tMo11884c5 = callableMemberDescriptor4.mo11889i().get(interfaceC8853n0.getIndex()).mo11884c();
                                C5207g.m11110e(abstractC5257tMo11884c5, "it.valueParameters[p.index].type");
                                return abstractC5257tMo11884c5;
                            }
                        };
                        if (interfaceC8853n0 != null) {
                            c7669fM13682b = ContextKt.m13682b(c7669fM13682b2, interfaceC8853n0.mo11289w());
                        } else {
                            c7669fM13682b = c7669fM13682b2;
                        }
                        ArrayList arrayList7 = arrayList;
                        arrayList7.add(m13743b(callableMemberDescriptorMo5275D0, interfaceC8853n0, false, c7669fM13682b, AnnotationQualifierApplicabilityType.VALUE_PARAMETER, c6089i2, z10, interfaceC2052l2));
                        arrayList = arrayList7;
                        c6086f = c6086f;
                    }
                    arrayList2 = arrayList;
                    c6086f2 = c6086f;
                    if (callableMemberDescriptorMo5275D0 instanceof InterfaceC8829b0) {
                        callableMemberDescriptor2 = null;
                    } else {
                        callableMemberDescriptor2 = callableMemberDescriptorMo5275D0;
                    }
                    interfaceC8829b0 = (InterfaceC8829b0) callableMemberDescriptor2;
                    if (interfaceC8829b0 == null) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.FIELD;
                    } else {
                        annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE;
                    }
                    AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType3 = annotationQualifierApplicabilityType;
                    if (c6086f2 != null) {
                        c6089i = c6086f2.f35827a;
                    } else {
                        c6089i = null;
                    }
                    abstractC5257tM13743b = m13743b(callableMemberDescriptorMo5275D0, callableMemberDescriptor, true, c7669fM13682b2, annotationQualifierApplicabilityType3, c6089i, false, new InterfaceC2052l<CallableMemberDescriptor, AbstractC5257t>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final AbstractC5257t mo528n(CallableMemberDescriptor callableMemberDescriptor3) {
                            CallableMemberDescriptor callableMemberDescriptor4 = callableMemberDescriptor3;
                            C5207g.m11111f(callableMemberDescriptor4, "it");
                            AbstractC5257t abstractC5257tMo11900y2 = callableMemberDescriptor4.mo11900y();
                            C5207g.m11108c(abstractC5257tMo11900y2);
                            return abstractC5257tMo11900y2;
                        }
                    });
                    abstractC5257tMo11900y = interfaceC1617a2.mo11900y();
                    C5207g.m11108c(abstractC5257tMo11900y);
                    signatureEnhancement$containsFunctionN$1 = new InterfaceC2052l<AbstractC5262v0, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$containsFunctionN$1
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final Boolean mo528n(AbstractC5262v0 abstractC5262v0) {
                            InterfaceC8834e interfaceC8834eMo11235q = abstractC5262v0.mo11250X0().mo11235q();
                            if (interfaceC8834eMo11235q == null) {
                                return Boolean.FALSE;
                            }
                            C7648e c7648eMo11874a = interfaceC8834eMo11235q.mo11874a();
                            C7646c c7646c = C8646c.f46206f;
                            return Boolean.valueOf(C5207g.m11106a(c7648eMo11874a, c7646c.m15218f()) && C5207g.m11106a(DescriptorUtilsKt.m14106c(interfaceC8834eMo11235q), c7646c));
                        }
                    };
                    if (C5258t0.m11292c(abstractC5257tMo11900y, signatureEnhancement$containsFunctionN$1)) {
                        z12 = true;
                    } else {
                        interfaceC8835e0Mo11896s1 = interfaceC1617a2.mo11896s0();
                        if (interfaceC8835e0Mo11896s1 != null) {
                            zM11292c = false;
                        } else {
                            zM11292c = false;
                        }
                        if (zM11292c) {
                            listMo11889i = interfaceC1617a2.mo11889i();
                            C5207g.m11110e(listMo11889i, "valueParameters");
                            if (listMo11889i.isEmpty()) {
                                z13 = false;
                                break;
                            }
                            it2 = listMo11889i.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    z13 = false;
                                    break;
                                }
                                abstractC5257tMo11884c3 = ((InterfaceC8853n0) it2.next()).mo11884c();
                                C5207g.m11110e(abstractC5257tMo11884c3, "it.type");
                                if (C5258t0.m11292c(abstractC5257tMo11884c3, new InterfaceC2052l<AbstractC5262v0, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$containsFunctionN$1
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final Boolean mo528n(AbstractC5262v0 abstractC5262v0) {
                                        InterfaceC8834e interfaceC8834eMo11235q = abstractC5262v0.mo11250X0().mo11235q();
                                        if (interfaceC8834eMo11235q == null) {
                                            return Boolean.FALSE;
                                        }
                                        C7648e c7648eMo11874a = interfaceC8834eMo11235q.mo11874a();
                                        C7646c c7646c = C8646c.f46206f;
                                        return Boolean.valueOf(C5207g.m11106a(c7648eMo11874a, c7646c.m15218f()) && C5207g.m11106a(DescriptorUtilsKt.m14106c(interfaceC8834eMo11235q), c7646c));
                                    }
                                })) {
                                    z13 = true;
                                    break;
                                }
                            }
                            if (z13) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        } else {
                            z12 = true;
                        }
                    }
                    if (z12) {
                        pair = new Pair(C9081b.f47369a, new C10520e(callableMemberDescriptorMo5275D0));
                    } else {
                        pair = null;
                    }
                    if (abstractC5257tMo11884c == null) {
                        if (abstractC5257tMo11884c != null) {
                            abstractC5257t = abstractC5257tMo11884c;
                        } else {
                            interfaceC8835e0Mo11896s0 = interfaceC1617a2.mo11896s0();
                            if (interfaceC8835e0Mo11896s0 != null) {
                                abstractC5257tMo11884c = interfaceC8835e0Mo11896s0.mo11884c();
                                abstractC5257t = abstractC5257tMo11884c;
                            } else {
                                abstractC5257t = null;
                            }
                        }
                        i10 = 10;
                        arrayList3 = new ArrayList(C9325m.m17681z(arrayList2, 10));
                        it = arrayList2.iterator();
                        while (true) {
                            i11 = i13;
                            if (it.hasNext()) {
                                if (abstractC5257tM13743b == null) {
                                    abstractC5257tM13743b = interfaceC1617a2.mo11900y();
                                    C5207g.m11108c(abstractC5257tM13743b);
                                }
                                callableMemberDescriptorMo5275D0 = interfaceC1617a2.mo5275D0(abstractC5257t, arrayList3, abstractC5257tM13743b, pair);
                                C5207g.m11109d(callableMemberDescriptorMo5275D0, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
                                break;
                                break;
                            }
                            next = it.next();
                            i13 = i11 + 1;
                            if (i11 >= 0) {
                                C9000b.m17257w();
                                throw null;
                            }
                            abstractC5257tMo11884c2 = (AbstractC5257t) next;
                            if (abstractC5257tMo11884c2 == null) {
                                abstractC5257tMo11884c2 = interfaceC1617a2.mo11889i().get(i11).mo11884c();
                                C5207g.m11110e(abstractC5257tMo11884c2, "valueParameters[index].type");
                            }
                            arrayList3.add(abstractC5257tMo11884c2);
                        }
                    } else {
                        if (abstractC5257tMo11884c != null) {
                            abstractC5257t = abstractC5257tMo11884c;
                        } else {
                            interfaceC8835e0Mo11896s0 = interfaceC1617a2.mo11896s0();
                            if (interfaceC8835e0Mo11896s0 != null) {
                                abstractC5257tMo11884c = interfaceC8835e0Mo11896s0.mo11884c();
                                abstractC5257t = abstractC5257tMo11884c;
                            } else {
                                abstractC5257t = null;
                            }
                        }
                        i10 = 10;
                        arrayList3 = new ArrayList(C9325m.m17681z(arrayList2, 10));
                        it = arrayList2.iterator();
                        while (true) {
                            i11 = i13;
                            if (it.hasNext()) {
                                if (abstractC5257tM13743b == null) {
                                    abstractC5257tM13743b = interfaceC1617a2.mo11900y();
                                    C5207g.m11108c(abstractC5257tM13743b);
                                }
                                callableMemberDescriptorMo5275D0 = interfaceC1617a2.mo5275D0(abstractC5257t, arrayList3, abstractC5257tM13743b, pair);
                                C5207g.m11109d(callableMemberDescriptorMo5275D0, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
                                break;
                                break;
                            }
                            next = it.next();
                            i13 = i11 + 1;
                            if (i11 >= 0) {
                                C9000b.m17257w();
                                throw null;
                            }
                            abstractC5257tMo11884c2 = (AbstractC5257t) next;
                            if (abstractC5257tMo11884c2 == null) {
                                abstractC5257tMo11884c2 = interfaceC1617a2.mo11889i().get(i11).mo11884c();
                                C5207g.m11110e(abstractC5257tMo11884c2, "valueParameters[index].type");
                            }
                            arrayList3.add(abstractC5257tMo11884c2);
                        }
                    }
                }
            } else {
                i10 = i12;
            }
            arrayList4.add(callableMemberDescriptorMo5275D0);
            i12 = i10;
        }
        return arrayList4;
    }

    /* JADX INFO: renamed from: d */
    public final ArrayList m13745d(AbstractC9571i abstractC9571i, List list, C7669f c7669f) {
        AbstractC5257t abstractC5257tM13742a;
        C5207g.m11111f(abstractC9571i, "typeParameter");
        C5207g.m11111f(list, "bounds");
        C5207g.m11111f(c7669f, "context");
        ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC5257t abstractC5257t = (AbstractC5257t) it.next();
            if (!TypeUtilsKt.m14225b(abstractC5257t, new InterfaceC2052l<AbstractC5262v0, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceTypeParameterBounds$1$1
                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final Boolean mo528n(AbstractC5262v0 abstractC5262v0) {
                    AbstractC5262v0 abstractC5262v1 = abstractC5262v0;
                    C5207g.m11111f(abstractC5262v1, "it");
                    return Boolean.valueOf(abstractC5262v1 instanceof InterfaceC5263w);
                }
            }) && (abstractC5257tM13742a = m13742a(new C6088h(abstractC9571i, false, c7669f, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS), abstractC5257t, EmptyList.f38032a, null, false)) != null) {
                abstractC5257t = abstractC5257tM13742a;
            }
            arrayList.add(abstractC5257t);
        }
        return arrayList;
    }
}
