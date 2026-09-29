package kotlin.reflect.jvm.internal.impl.load.kotlin;

import ae.C0062b;
import android.support.v4.media.session.C0166e;
import dm.C5207g;
import in.C6358b;
import in.C6360d;
import in.C6361e;
import in.C6363g;
import in.C6369m;
import in.C6370n;
import in.InterfaceC6366j;
import in.InterfaceC6367k;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kn.C6732b;
import kn.C6735e;
import kn.InterfaceC6733c;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.AbstractC6896a;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.C6993d;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.text.C7076b;
import mn.C7645b;
import mn.C7646c;
import mn.C7648e;
import mo.C7661i;
import p003a2.C0009a;
import p248ln.AbstractC7403d;
import p248ln.C7401b;
import p248ln.C7407h;
import p260m8.C7499b;
import p281nm.C7801a;
import p281nm.C7802b;
import p372rm.InterfaceC8837f0;
import p421un.C9595b;
import p465wm.C9971a;
import p465wm.C9974d;
import p541zn.AbstractC10554r;
import p541zn.InterfaceC10540d;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinaryClassAnnotationLoader<A, S extends AbstractC6896a<? extends A>> implements InterfaceC10540d<A> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6366j f38899a;

    public enum PropertyRelatedElement {
        PROPERTY,
        BACKING_FIELD,
        DELEGATE_FIELD
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader$a */
    public static abstract class AbstractC6896a<A> {
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader$b */
    public /* synthetic */ class C6897b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38900a;

        static {
            int[] iArr = new int[AnnotatedCallableKind.values().length];
            iArr[AnnotatedCallableKind.PROPERTY_GETTER.ordinal()] = 1;
            iArr[AnnotatedCallableKind.PROPERTY_SETTER.ordinal()] = 2;
            iArr[AnnotatedCallableKind.PROPERTY.ordinal()] = 3;
            f38900a = iArr;
        }
    }

    public AbstractBinaryClassAnnotationLoader(C9974d c9974d) {
        this.f38899a = c9974d;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ List m13749m(AbstractBinaryClassAnnotationLoader abstractBinaryClassAnnotationLoader, AbstractC10554r abstractC10554r, C6370n c6370n, boolean z10, Boolean bool, boolean z11, int i10) {
        boolean z12 = (i10 & 4) != 0 ? false : z10;
        if ((i10 & 16) != 0) {
            bool = null;
        }
        return abstractBinaryClassAnnotationLoader.m13762l(abstractC10554r, c6370n, z12, false, bool, (i10 & 32) != 0 ? false : z11);
    }

    /* JADX INFO: renamed from: n */
    public static C6370n m13750n(InterfaceC6997h interfaceC6997h, InterfaceC6733c interfaceC6733c, C6735e c6735e, AnnotatedCallableKind annotatedCallableKind, boolean z10) {
        C6370n c6370n;
        C5207g.m11111f(interfaceC6997h, "proto");
        C5207g.m11111f(interfaceC6733c, "nameResolver");
        C5207g.m11111f(c6735e, "typeTable");
        C5207g.m11111f(annotatedCallableKind, "kind");
        if (interfaceC6997h instanceof ProtoBuf$Constructor) {
            C6993d c6993d = C7407h.f41229a;
            AbstractC7403d.b bVarM14807a = C7407h.m14807a((ProtoBuf$Constructor) interfaceC6997h, interfaceC6733c, c6735e);
            if (bVarM14807a == null) {
                return null;
            }
            return C6370n.a.m13003a(bVarM14807a);
        }
        if (interfaceC6997h instanceof ProtoBuf$Function) {
            C6993d c6993d2 = C7407h.f41229a;
            AbstractC7403d.b bVarM14809c = C7407h.m14809c((ProtoBuf$Function) interfaceC6997h, interfaceC6733c, c6735e);
            if (bVarM14809c == null) {
                return null;
            }
            return C6370n.a.m13003a(bVarM14809c);
        }
        if (!(interfaceC6997h instanceof ProtoBuf$Property)) {
            return null;
        }
        GeneratedMessageLite.C6985e<ProtoBuf$Property, JvmProtoBuf.JvmPropertySignature> c6985e = JvmProtoBuf.f39401d;
        C5207g.m11110e(c6985e, "propertySignature");
        JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) C7499b.m14902F((GeneratedMessageLite.ExtendableMessage) interfaceC6997h, c6985e);
        if (jvmPropertySignature == null) {
            return null;
        }
        int i10 = C6897b.f38900a[annotatedCallableKind.ordinal()];
        boolean z11 = false;
        if (i10 == 1) {
            if ((jvmPropertySignature.f39437b & 4) == 4) {
                z11 = true;
            }
            if (!z11) {
                return null;
            }
            JvmProtoBuf.JvmMethodSignature jvmMethodSignature = jvmPropertySignature.f39440e;
            C5207g.m11110e(jvmMethodSignature, "signature.getter");
            String strMo13351a = interfaceC6733c.mo13351a(jvmMethodSignature.f39427c);
            String strMo13351a2 = interfaceC6733c.mo13351a(jvmMethodSignature.f39428d);
            C5207g.m11111f(strMo13351a, "name");
            C5207g.m11111f(strMo13351a2, "desc");
            c6370n = new C6370n(strMo13351a.concat(strMo13351a2));
        } else {
            if (i10 != 2) {
                if (i10 != 3) {
                    return null;
                }
                return m13751o((ProtoBuf$Property) interfaceC6997h, interfaceC6733c, c6735e, true, true, z10);
            }
            if ((jvmPropertySignature.f39437b & 8) == 8) {
                z11 = true;
            }
            if (!z11) {
                return null;
            }
            JvmProtoBuf.JvmMethodSignature jvmMethodSignature2 = jvmPropertySignature.f39441f;
            C5207g.m11110e(jvmMethodSignature2, "signature.setter");
            String strMo13351a3 = interfaceC6733c.mo13351a(jvmMethodSignature2.f39427c);
            String strMo13351a4 = interfaceC6733c.mo13351a(jvmMethodSignature2.f39428d);
            C5207g.m11111f(strMo13351a3, "name");
            C5207g.m11111f(strMo13351a4, "desc");
            c6370n = new C6370n(strMo13351a3.concat(strMo13351a4));
        }
        return c6370n;
    }

    /* JADX INFO: renamed from: o */
    public static C6370n m13751o(ProtoBuf$Property protoBuf$Property, InterfaceC6733c interfaceC6733c, C6735e c6735e, boolean z10, boolean z11, boolean z12) {
        C5207g.m11111f(protoBuf$Property, "proto");
        C5207g.m11111f(interfaceC6733c, "nameResolver");
        C5207g.m11111f(c6735e, "typeTable");
        GeneratedMessageLite.C6985e<ProtoBuf$Property, JvmProtoBuf.JvmPropertySignature> c6985e = JvmProtoBuf.f39401d;
        C5207g.m11110e(c6985e, "propertySignature");
        JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) C7499b.m14902F(protoBuf$Property, c6985e);
        if (jvmPropertySignature == null) {
            return null;
        }
        if (z10) {
            AbstractC7403d.a aVarM14808b = C7407h.m14808b(protoBuf$Property, interfaceC6733c, c6735e, z12);
            if (aVarM14808b == null) {
                return null;
            }
            return C6370n.a.m13003a(aVarM14808b);
        }
        if (z11) {
            if ((jvmPropertySignature.f39437b & 2) == 2) {
                JvmProtoBuf.JvmMethodSignature jvmMethodSignature = jvmPropertySignature.f39439d;
                C5207g.m11110e(jvmMethodSignature, "signature.syntheticMethod");
                String strMo13351a = interfaceC6733c.mo13351a(jvmMethodSignature.f39427c);
                String strMo13351a2 = interfaceC6733c.mo13351a(jvmMethodSignature.f39428d);
                C5207g.m11111f(strMo13351a, "name");
                C5207g.m11111f(strMo13351a2, "desc");
                return new C6370n(strMo13351a.concat(strMo13351a2));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ C6370n m13752p(AbstractBinaryClassAnnotationLoader abstractBinaryClassAnnotationLoader, ProtoBuf$Property protoBuf$Property, InterfaceC6733c interfaceC6733c, C6735e c6735e, boolean z10, boolean z11, int i10) {
        boolean z12 = (i10 & 8) != 0 ? false : z10;
        boolean z13 = (i10 & 16) != 0 ? false : z11;
        boolean z14 = (i10 & 32) != 0;
        abstractBinaryClassAnnotationLoader.getClass();
        return m13751o(protoBuf$Property, interfaceC6733c, c6735e, z12, z13, z14);
    }

    @Override // p541zn.InterfaceC10540d
    /* JADX INFO: renamed from: a */
    public final ArrayList mo13753a(ProtoBuf$Type protoBuf$Type, InterfaceC6733c interfaceC6733c) {
        C5207g.m11111f(protoBuf$Type, "proto");
        C5207g.m11111f(interfaceC6733c, "nameResolver");
        Object objM13921r = protoBuf$Type.m13921r(JvmProtoBuf.f39403f);
        C5207g.m11110e(objM13921r, "proto.getExtension(JvmProtoBuf.typeAnnotation)");
        Iterable<ProtoBuf$Annotation> iterable = (Iterable) objM13921r;
        ArrayList arrayList = new ArrayList(C9325m.m17681z(iterable, 10));
        for (ProtoBuf$Annotation protoBuf$Annotation : iterable) {
            C5207g.m11110e(protoBuf$Annotation, "it");
            arrayList.add(((C6360d) this).f36722e.m19510a(protoBuf$Annotation, interfaceC6733c));
        }
        return arrayList;
    }

    @Override // p541zn.InterfaceC10540d
    /* JADX INFO: renamed from: b */
    public final List<A> mo13754b(AbstractC10554r abstractC10554r, InterfaceC6997h interfaceC6997h, AnnotatedCallableKind annotatedCallableKind) {
        C5207g.m11111f(interfaceC6997h, "proto");
        C5207g.m11111f(annotatedCallableKind, "kind");
        if (annotatedCallableKind == AnnotatedCallableKind.PROPERTY) {
            return m13766u(abstractC10554r, (ProtoBuf$Property) interfaceC6997h, PropertyRelatedElement.PROPERTY);
        }
        C6370n c6370nM13750n = m13750n(interfaceC6997h, abstractC10554r.f52612a, abstractC10554r.f52613b, annotatedCallableKind, false);
        return c6370nM13750n == null ? EmptyList.f38032a : m13749m(this, abstractC10554r, c6370nM13750n, false, null, false, 60);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0097  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p541zn.InterfaceC10540d
    /* JADX INFO: renamed from: c */
    public final List<A> mo13755c(AbstractC10554r abstractC10554r, InterfaceC6997h interfaceC6997h, AnnotatedCallableKind annotatedCallableKind, int i10, ProtoBuf$ValueParameter protoBuf$ValueParameter) {
        boolean z10;
        boolean z11;
        C5207g.m11111f(abstractC10554r, "container");
        C5207g.m11111f(interfaceC6997h, "callableProto");
        C5207g.m11111f(annotatedCallableKind, "kind");
        C5207g.m11111f(protoBuf$ValueParameter, "proto");
        int i11 = 0;
        C6370n c6370nM13750n = m13750n(interfaceC6997h, abstractC10554r.f52612a, abstractC10554r.f52613b, annotatedCallableKind, false);
        if (c6370nM13750n == null) {
            return EmptyList.f38032a;
        }
        if (interfaceC6997h instanceof ProtoBuf$Function) {
            int i12 = ((ProtoBuf$Function) interfaceC6997h).f39124c;
            if (!((i12 & 32) == 32)) {
                z11 = (i12 & 64) == 64;
            }
            if (z11) {
                i11 = 1;
            }
        } else if (interfaceC6997h instanceof ProtoBuf$Property) {
            int i13 = ((ProtoBuf$Property) interfaceC6997h).f39192c;
            if (!((i13 & 32) == 32)) {
                if (!((i13 & 64) == 64)) {
                    z10 = false;
                }
                if (z10) {
                    i11 = 1;
                }
            }
            z10 = true;
            if (z10) {
                i11 = 1;
            }
        } else {
            if (!(interfaceC6997h instanceof ProtoBuf$Constructor)) {
                throw new UnsupportedOperationException("Unsupported message: " + interfaceC6997h.getClass());
            }
            AbstractC10554r.a aVar = (AbstractC10554r.a) abstractC10554r;
            if (aVar.f52618g == ProtoBuf$Class.Kind.ENUM_CLASS) {
                i11 = 2;
            } else if (aVar.f52619h) {
                i11 = 1;
            }
        }
        return m13749m(this, abstractC10554r, new C6370n(c6370nM13750n.f36759a + '@' + (i10 + i11)), false, null, false, 60);
    }

    @Override // p541zn.InterfaceC10540d
    /* JADX INFO: renamed from: d */
    public final ArrayList mo13756d(ProtoBuf$TypeParameter protoBuf$TypeParameter, InterfaceC6733c interfaceC6733c) {
        C5207g.m11111f(protoBuf$TypeParameter, "proto");
        C5207g.m11111f(interfaceC6733c, "nameResolver");
        Object objM13921r = protoBuf$TypeParameter.m13921r(JvmProtoBuf.f39405h);
        C5207g.m11110e(objM13921r, "proto.getExtension(JvmPr….typeParameterAnnotation)");
        Iterable<ProtoBuf$Annotation> iterable = (Iterable) objM13921r;
        ArrayList arrayList = new ArrayList(C9325m.m17681z(iterable, 10));
        for (ProtoBuf$Annotation protoBuf$Annotation : iterable) {
            C5207g.m11110e(protoBuf$Annotation, "it");
            arrayList.add(((C6360d) this).f36722e.m19510a(protoBuf$Annotation, interfaceC6733c));
        }
        return arrayList;
    }

    @Override // p541zn.InterfaceC10540d
    /* JADX INFO: renamed from: e */
    public final ArrayList mo13757e(AbstractC10554r.a aVar) {
        C5207g.m11111f(aVar, "container");
        InterfaceC8837f0 interfaceC8837f0 = aVar.f52614c;
        C6369m c6369m = interfaceC8837f0 instanceof C6369m ? (C6369m) interfaceC8837f0 : null;
        InterfaceC6367k interfaceC6367k = c6369m != null ? c6369m.f36758b : null;
        if (interfaceC6367k != null) {
            ArrayList arrayList = new ArrayList(1);
            interfaceC6367k.mo13000b(new C6358b(this, arrayList));
            return arrayList;
        }
        throw new IllegalStateException(("Class for loading annotations is not found: " + aVar.mo19524a()).toString());
    }

    @Override // p541zn.InterfaceC10540d
    /* JADX INFO: renamed from: f */
    public final List<A> mo13758f(AbstractC10554r abstractC10554r, ProtoBuf$Property protoBuf$Property) {
        C5207g.m11111f(protoBuf$Property, "proto");
        return m13766u(abstractC10554r, protoBuf$Property, PropertyRelatedElement.DELEGATE_FIELD);
    }

    @Override // p541zn.InterfaceC10540d
    /* JADX INFO: renamed from: h */
    public final List mo13759h(AbstractC10554r.a aVar, ProtoBuf$EnumEntry protoBuf$EnumEntry) {
        C5207g.m11111f(aVar, "container");
        C5207g.m11111f(protoBuf$EnumEntry, "proto");
        String strMo13351a = aVar.f52612a.mo13351a(protoBuf$EnumEntry.f39087d);
        String strM15205c = aVar.f52617f.m15205c();
        C5207g.m11110e(strM15205c, "container as ProtoContai…Class).classId.asString()");
        String strM14802b = C7401b.m14802b(strM15205c);
        C5207g.m11111f(strMo13351a, "name");
        C5207g.m11111f(strM14802b, "desc");
        return m13749m(this, aVar, new C6370n(strMo13351a + '#' + strM14802b), false, null, false, 60);
    }

    @Override // p541zn.InterfaceC10540d
    /* JADX INFO: renamed from: i */
    public final List<A> mo13760i(AbstractC10554r abstractC10554r, ProtoBuf$Property protoBuf$Property) {
        C5207g.m11111f(protoBuf$Property, "proto");
        return m13766u(abstractC10554r, protoBuf$Property, PropertyRelatedElement.BACKING_FIELD);
    }

    @Override // p541zn.InterfaceC10540d
    /* JADX INFO: renamed from: j */
    public final List<A> mo13761j(AbstractC10554r abstractC10554r, InterfaceC6997h interfaceC6997h, AnnotatedCallableKind annotatedCallableKind) {
        C5207g.m11111f(interfaceC6997h, "proto");
        C5207g.m11111f(annotatedCallableKind, "kind");
        C6370n c6370nM13750n = m13750n(interfaceC6997h, abstractC10554r.f52612a, abstractC10554r.f52613b, annotatedCallableKind, false);
        return c6370nM13750n != null ? m13749m(this, abstractC10554r, new C6370n(C0009a.m23l(new StringBuilder(), c6370nM13750n.f36759a, "@0")), false, null, false, 60) : EmptyList.f38032a;
    }

    /* JADX INFO: renamed from: l */
    public final List<A> m13762l(AbstractC10554r abstractC10554r, C6370n c6370n, boolean z10, boolean z11, Boolean bool, boolean z12) {
        InterfaceC6367k interfaceC6367kM13763q = m13763q(abstractC10554r, z10, z11, bool, z12);
        if (interfaceC6367kM13763q == null) {
            if (abstractC10554r instanceof AbstractC10554r.a) {
                InterfaceC8837f0 interfaceC8837f0 = ((AbstractC10554r.a) abstractC10554r).f52614c;
                C6369m c6369m = interfaceC8837f0 instanceof C6369m ? (C6369m) interfaceC8837f0 : null;
                if (c6369m != null) {
                    interfaceC6367kM13763q = c6369m.f36758b;
                }
            }
            interfaceC6367kM13763q = null;
        }
        if (interfaceC6367kM13763q == null) {
            return EmptyList.f38032a;
        }
        List<A> list = ((AbstractBinaryClassAnnotationAndConstantLoader.C6893a) ((LockBasedStorageManager.C7045k) ((AbstractBinaryClassAnnotationAndConstantLoader) this).f38892b).mo528n(interfaceC6367kM13763q)).f38893a.get(c6370n);
        if (list == null) {
            list = EmptyList.f38032a;
        }
        return list;
    }

    /* JADX INFO: renamed from: q */
    public final InterfaceC6367k m13763q(AbstractC10554r abstractC10554r, boolean z10, boolean z11, Boolean bool, boolean z12) {
        AbstractC10554r.a aVar;
        C5207g.m11111f(abstractC10554r, "container");
        InterfaceC6366j interfaceC6366j = this.f38899a;
        InterfaceC8837f0 interfaceC8837f0 = abstractC10554r.f52614c;
        if (z10) {
            if (bool == null) {
                throw new IllegalStateException(("isConst should not be null for property (container=" + abstractC10554r + ')').toString());
            }
            if (abstractC10554r instanceof AbstractC10554r.a) {
                AbstractC10554r.a aVar2 = (AbstractC10554r.a) abstractC10554r;
                if (aVar2.f52618g == ProtoBuf$Class.Kind.INTERFACE) {
                    return C0062b.m301Q0(interfaceC6366j, aVar2.f52617f.m15206d(C7648e.m15232l("DefaultImpls")));
                }
            }
            if (bool.booleanValue() && (abstractC10554r instanceof AbstractC10554r.b)) {
                C6363g c6363g = interfaceC8837f0 instanceof C6363g ? (C6363g) interfaceC8837f0 : null;
                C9595b c9595b = c6363g != null ? c6363g.f36741c : null;
                if (c9595b != null) {
                    String strM18067e = c9595b.m18067e();
                    C5207g.m11110e(strM18067e, "facadeClassName.internalName");
                    return C0062b.m301Q0(interfaceC6366j, C7645b.m15203l(new C7646c(C7661i.m15253S2(strM18067e, '/', '.'))));
                }
            }
        }
        if (z11 && (abstractC10554r instanceof AbstractC10554r.a)) {
            AbstractC10554r.a aVar3 = (AbstractC10554r.a) abstractC10554r;
            if (aVar3.f52618g == ProtoBuf$Class.Kind.COMPANION_OBJECT && (aVar = aVar3.f52616e) != null) {
                ProtoBuf$Class.Kind kind = ProtoBuf$Class.Kind.CLASS;
                ProtoBuf$Class.Kind kind2 = aVar.f52618g;
                if (kind2 == kind || kind2 == ProtoBuf$Class.Kind.ENUM_CLASS || (z12 && (kind2 == ProtoBuf$Class.Kind.INTERFACE || kind2 == ProtoBuf$Class.Kind.ANNOTATION_CLASS))) {
                    InterfaceC8837f0 interfaceC8837f1 = aVar.f52614c;
                    C6369m c6369m = interfaceC8837f1 instanceof C6369m ? (C6369m) interfaceC8837f1 : null;
                    if (c6369m != null) {
                        return c6369m.f36758b;
                    }
                    return null;
                }
            }
        }
        if (!(abstractC10554r instanceof AbstractC10554r.b) || !(interfaceC8837f0 instanceof C6363g)) {
            return null;
        }
        C5207g.m11109d(interfaceC8837f0, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
        C6363g c6363g2 = (C6363g) interfaceC8837f0;
        InterfaceC6367k interfaceC6367k = c6363g2.f36742d;
        return interfaceC6367k == null ? C0062b.m301Q0(interfaceC6366j, c6363g2.m12990d()) : interfaceC6367k;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m13764r(C7645b c7645b) {
        InterfaceC6367k interfaceC6367kM301Q0;
        C5207g.m11111f(c7645b, "classId");
        if (c7645b.m15207g() != null && C5207g.m11106a(c7645b.m15210j().m15235f(), "Container") && (interfaceC6367kM301Q0 = C0062b.m301Q0(this.f38899a, c7645b)) != null) {
            LinkedHashSet linkedHashSet = C7802b.f42880a;
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            interfaceC6367kM301Q0.mo13000b(new C7801a(ref$BooleanRef));
            if (ref$BooleanRef.f38122a) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public abstract C6361e mo12981s(C7645b c7645b, InterfaceC8837f0 interfaceC8837f0, List list);

    /* JADX INFO: renamed from: t */
    public final C6361e m13765t(C7645b c7645b, C9971a c9971a, List list) {
        C5207g.m11111f(list, "result");
        if (C7802b.f42880a.contains(c7645b)) {
            return null;
        }
        return mo12981s(c7645b, c9971a, list);
    }

    /* JADX INFO: renamed from: u */
    public final List<A> m13766u(AbstractC10554r abstractC10554r, ProtoBuf$Property protoBuf$Property, PropertyRelatedElement propertyRelatedElement) {
        boolean zM779z = C0166e.m779z(C6732b.f37950A, protoBuf$Property.f39193d, "IS_CONST.get(proto.flags)");
        boolean zM14810d = C7407h.m14810d(protoBuf$Property);
        if (propertyRelatedElement == PropertyRelatedElement.PROPERTY) {
            C6370n c6370nM13752p = m13752p(this, protoBuf$Property, abstractC10554r.f52612a, abstractC10554r.f52613b, false, true, 40);
            return c6370nM13752p == null ? EmptyList.f38032a : m13749m(this, abstractC10554r, c6370nM13752p, true, Boolean.valueOf(zM779z), zM14810d, 8);
        }
        C6370n c6370nM13752p2 = m13752p(this, protoBuf$Property, abstractC10554r.f52612a, abstractC10554r.f52613b, true, false, 48);
        if (c6370nM13752p2 == null) {
            return EmptyList.f38032a;
        }
        boolean z10 = false;
        boolean zM14278X2 = C7076b.m14278X2(c6370nM13752p2.f36759a, "$delegate", false);
        if (propertyRelatedElement == PropertyRelatedElement.DELEGATE_FIELD) {
            z10 = true;
        }
        return zM14278X2 != z10 ? EmptyList.f38032a : m13762l(abstractC10554r, c6370nM13752p2, true, true, Boolean.valueOf(zM779z), zM14810d);
    }
}
