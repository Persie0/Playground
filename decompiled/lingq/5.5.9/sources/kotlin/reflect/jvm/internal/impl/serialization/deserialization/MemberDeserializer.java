package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import ae.C0062b;
import android.support.v4.media.session.C0166e;
import bo.C1623a;
import bo.C1625c;
import bo.C1629g;
import bo.C1630h;
import bo.C1631i;
import bo.C1632j;
import bo.InterfaceC1626d;
import cm.InterfaceC2041a;
import co.InterfaceC2074f;
import co.InterfaceC2076h;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kn.AbstractC6731a;
import kn.C6732b;
import kn.C6735e;
import kn.C6736f;
import kn.InterfaceC6733c;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C6830d;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import mn.C7646c;
import mn.C7648e;
import p260m8.C7499b;
import p338qd.C8578t;
import p372rm.AbstractC8848l;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8835e0;
import p372rm.InterfaceC8837f0;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8847k0;
import p372rm.InterfaceC8853n0;
import p372rm.InterfaceC8865w;
import p373rn.AbstractC8875g;
import p385sf.C9000b;
import p420um.C9564e0;
import p420um.C9566f0;
import p420um.C9568g0;
import p420um.C9586s;
import p541zn.AbstractC10554r;
import p541zn.C10539c;
import p541zn.C10544h;
import p541zn.C10555s;
import p541zn.C10556t;
import p541zn.C10557u;
import p541zn.InterfaceC10537a;
import p543do.AbstractC5257t;
import p543do.AbstractC5265x;
import pn.C8412c;
import sm.C9078f;
import sm.InterfaceC9075c;
import sm.InterfaceC9077e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
public final class MemberDeserializer {

    /* JADX INFO: renamed from: a */
    public final C8578t f39700a;

    /* JADX INFO: renamed from: b */
    public final C10539c f39701b;

    public MemberDeserializer(C8578t c8578t) {
        C5207g.m11111f(c8578t, "c");
        this.f39700a = c8578t;
        Object obj = c8578t.f45999a;
        this.f39701b = new C10539c(((C10544h) obj).f52580b, ((C10544h) obj).f52590l);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC10554r m14124a(InterfaceC8838g interfaceC8838g) {
        if (interfaceC8838g instanceof InterfaceC8865w) {
            C7646c c7646cMo17120e = ((InterfaceC8865w) interfaceC8838g).mo17120e();
            C8578t c8578t = this.f39700a;
            return new AbstractC10554r.b(c7646cMo17120e, (InterfaceC6733c) c8578t.f46000b, (C6735e) c8578t.f46002d, (InterfaceC1626d) c8578t.f46005g);
        }
        if (interfaceC8838g instanceof DeserializedClassDescriptor) {
            return ((DeserializedClassDescriptor) interfaceC8838g).f39760R;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC9077e m14125b(final InterfaceC6997h interfaceC6997h, int i10, final AnnotatedCallableKind annotatedCallableKind) {
        return !C6732b.f37965c.m13346c(i10).booleanValue() ? InterfaceC9077e.a.f47365a : new C1632j(this.f39700a.m16778c(), new InterfaceC2041a<List<? extends InterfaceC9075c>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$getAnnotations$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final List<? extends InterfaceC9075c> mo807E() {
                MemberDeserializer memberDeserializer = this.f39702b;
                AbstractC10554r abstractC10554rM14124a = memberDeserializer.m14124a((InterfaceC8838g) memberDeserializer.f39700a.f46001c);
                List<? extends InterfaceC9075c> listM13453u0 = abstractC10554rM14124a != null ? C6752c.m13453u0(((C10544h) memberDeserializer.f39700a.f45999a).f52583e.mo13754b(abstractC10554rM14124a, interfaceC6997h, annotatedCallableKind)) : null;
                if (listM13453u0 == null) {
                    listM13453u0 = EmptyList.f38032a;
                }
                return listM13453u0;
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC9077e m14126c(final ProtoBuf$Property protoBuf$Property, final boolean z10) {
        return !C6732b.f37965c.m13346c(protoBuf$Property.f39193d).booleanValue() ? InterfaceC9077e.a.f47365a : new C1632j(this.f39700a.m16778c(), new InterfaceC2041a<List<? extends InterfaceC9075c>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$getPropertyFieldAnnotations$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final List<? extends InterfaceC9075c> mo807E() {
                List<? extends InterfaceC9075c> listM13453u0;
                MemberDeserializer memberDeserializer = this.f39705b;
                AbstractC10554r abstractC10554rM14124a = memberDeserializer.m14124a((InterfaceC8838g) memberDeserializer.f39700a.f46001c);
                if (abstractC10554rM14124a != null) {
                    C8578t c8578t = memberDeserializer.f39700a;
                    boolean z11 = z10;
                    ProtoBuf$Property protoBuf$Property2 = protoBuf$Property;
                    listM13453u0 = z11 ? C6752c.m13453u0(((C10544h) c8578t.f45999a).f52583e.mo13758f(abstractC10554rM14124a, protoBuf$Property2)) : C6752c.m13453u0(((C10544h) c8578t.f45999a).f52583e.mo13760i(abstractC10554rM14124a, protoBuf$Property2));
                } else {
                    listM13453u0 = null;
                }
                if (listM13453u0 == null) {
                    listM13453u0 = EmptyList.f38032a;
                }
                return listM13453u0;
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final C1625c m14127d(ProtoBuf$Constructor protoBuf$Constructor, boolean z10) {
        C8578t c8578t = this.f39700a;
        InterfaceC8838g interfaceC8838g = (InterfaceC8838g) c8578t.f46001c;
        C5207g.m11109d(interfaceC8838g, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        InterfaceC8830c interfaceC8830c = (InterfaceC8830c) interfaceC8838g;
        int i10 = protoBuf$Constructor.f39051d;
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        C1625c c1625c = new C1625c(interfaceC8830c, null, m14125b(protoBuf$Constructor, i10, annotatedCallableKind), z10, CallableMemberDescriptor.Kind.DECLARATION, protoBuf$Constructor, (InterfaceC6733c) c8578t.f46000b, (C6735e) c8578t.f46002d, (C6736f) c8578t.f46003e, (InterfaceC1626d) c8578t.f46005g, null);
        MemberDeserializer memberDeserializer = (MemberDeserializer) c8578t.m16777a(c1625c, EmptyList.f38032a, (InterfaceC6733c) c8578t.f46000b, (C6735e) c8578t.f46002d, (C6736f) c8578t.f46003e, (AbstractC6731a) c8578t.f46004f).f46007i;
        List<ProtoBuf$ValueParameter> list = protoBuf$Constructor.f39052e;
        C5207g.m11110e(list, "proto.valueParameterList");
        c1625c.m18029g1(memberDeserializer.m14131h(list, protoBuf$Constructor, annotatedCallableKind), C10556t.m19526a((ProtoBuf$Visibility) C6732b.f37966d.m13348c(protoBuf$Constructor.f39051d)));
        c1625c.m13639d1(interfaceC8830c.mo5316v());
        c1625c.f38519M = interfaceC8830c.mo11882T();
        c1625c.f38524R = !C6732b.f37976n.m13346c(protoBuf$Constructor.f39051d).booleanValue();
        return c1625c;
    }

    /* JADX INFO: renamed from: e */
    public final C1630h m14128e(ProtoBuf$Function protoBuf$Function) {
        int i10;
        AbstractC5257t abstractC5257tM14139g;
        C5207g.m11111f(protoBuf$Function, "proto");
        boolean z10 = true;
        if ((protoBuf$Function.f39124c & 1) == 1) {
            i10 = protoBuf$Function.f39125d;
        } else {
            int i11 = protoBuf$Function.f39126e;
            i10 = ((i11 >> 8) << 6) + (i11 & 63);
        }
        int i12 = i10;
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        InterfaceC9077e interfaceC9077eM14125b = m14125b(protoBuf$Function, i12, annotatedCallableKind);
        int i13 = protoBuf$Function.f39124c;
        if (!((i13 & 32) == 32)) {
            if (!((i13 & 64) == 64)) {
                z10 = false;
            }
        }
        InterfaceC9077e.a.C10670a c10670a = InterfaceC9077e.a.f47365a;
        C8578t c8578t = this.f39700a;
        InterfaceC9077e c1623a = z10 ? new C1623a(c8578t.m16778c(), new MemberDeserializer$getReceiverParameterAnnotations$1(this, protoBuf$Function, annotatedCallableKind)) : c10670a;
        C7646c c7646cM14110g = DescriptorUtilsKt.m14110g((InterfaceC8838g) c8578t.f46001c);
        Object obj = c8578t.f46000b;
        C6736f c6736f = C5207g.m11106a(c7646cM14110g.m15215c(C7499b.m14910J((InterfaceC6733c) obj, protoBuf$Function.f39127f)), C10557u.f52627a) ? C6736f.f37996b : (C6736f) c8578t.f46003e;
        InterfaceC8838g interfaceC8838g = (InterfaceC8838g) c8578t.f46001c;
        C7648e c7648eM14910J = C7499b.m14910J((InterfaceC6733c) obj, protoBuf$Function.f39127f);
        CallableMemberDescriptor.Kind kindM19527b = C10556t.m19527b((ProtoBuf$MemberKind) C6732b.f37977o.m13348c(i12));
        InterfaceC6733c interfaceC6733c = (InterfaceC6733c) obj;
        Object obj2 = c8578t.f46002d;
        InterfaceC9077e interfaceC9077e = c1623a;
        C1630h c1630h = new C1630h(interfaceC8838g, null, interfaceC9077eM14125b, c7648eM14910J, kindM19527b, protoBuf$Function, interfaceC6733c, (C6735e) obj2, c6736f, (InterfaceC1626d) c8578t.f46005g, null);
        List<ProtoBuf$TypeParameter> list = protoBuf$Function.f39130i;
        C5207g.m11110e(list, "proto.typeParameterList");
        C8578t c8578tM16777a = c8578t.m16777a(c1630h, list, (InterfaceC6733c) c8578t.f46000b, (C6735e) c8578t.f46002d, (C6736f) c8578t.f46003e, (AbstractC6731a) c8578t.f46004f);
        ProtoBuf$Type protoBuf$TypeM290M1 = C0062b.m290M1(protoBuf$Function, (C6735e) obj2);
        Object obj3 = c8578tM16777a.f46006h;
        C9568g0 c9568g0M16438g = (protoBuf$TypeM290M1 == null || (abstractC5257tM14139g = ((TypeDeserializer) obj3).m14139g(protoBuf$TypeM290M1)) == null) ? null : C8412c.m16438g(c1630h, abstractC5257tM14139g, interfaceC9077e);
        InterfaceC8838g interfaceC8838g2 = (InterfaceC8838g) c8578t.f46001c;
        InterfaceC8830c interfaceC8830c = interfaceC8838g2 instanceof InterfaceC8830c ? (InterfaceC8830c) interfaceC8838g2 : null;
        InterfaceC8835e0 interfaceC8835e0Mo17092U0 = interfaceC8830c != null ? interfaceC8830c.mo17092U0() : null;
        List<ProtoBuf$Type> list2 = protoBuf$Function.f39133l;
        C5207g.m11110e(list2, "proto.contextReceiverTypeList");
        ArrayList arrayList = new ArrayList();
        for (ProtoBuf$Type protoBuf$Type : list2) {
            C5207g.m11110e(protoBuf$Type, "it");
            C9568g0 c9568g0M16433b = C8412c.m16433b(c1630h, ((TypeDeserializer) obj3).m14139g(protoBuf$Type), c10670a);
            if (c9568g0M16433b != null) {
                arrayList.add(c9568g0M16433b);
            }
        }
        TypeDeserializer typeDeserializer = (TypeDeserializer) obj3;
        List<InterfaceC8847k0> listM14136b = typeDeserializer.m14136b();
        MemberDeserializer memberDeserializer = (MemberDeserializer) c8578tM16777a.f46007i;
        List<ProtoBuf$ValueParameter> list3 = protoBuf$Function.f39117J;
        C5207g.m11110e(list3, "proto.valueParameterList");
        c1630h.mo13679i1(c9568g0M16438g, interfaceC8835e0Mo17092U0, arrayList, listM14136b, memberDeserializer.m14131h(list3, protoBuf$Function, AnnotatedCallableKind.FUNCTION), typeDeserializer.m14139g(C0062b.m311T1(protoBuf$Function, (C6735e) obj2)), C10555s.m19525a((ProtoBuf$Modality) C6732b.f37967e.m13348c(i12)), C10556t.m19526a((ProtoBuf$Visibility) C6732b.f37966d.m13348c(i12)), C6753d.m13459L0());
        c1630h.f38514H = C0166e.m779z(C6732b.f37978p, i12, "IS_OPERATOR.get(flags)");
        c1630h.f38515I = C0166e.m779z(C6732b.f37979q, i12, "IS_INFIX.get(flags)");
        c1630h.f38516J = C0166e.m779z(C6732b.f37982t, i12, "IS_EXTERNAL_FUNCTION.get(flags)");
        c1630h.f38517K = C0166e.m779z(C6732b.f37980r, i12, "IS_INLINE.get(flags)");
        c1630h.f38518L = C0166e.m779z(C6732b.f37981s, i12, "IS_TAILREC.get(flags)");
        c1630h.f38523Q = C0166e.m779z(C6732b.f37983u, i12, "IS_SUSPEND.get(flags)");
        c1630h.f38519M = C0166e.m779z(C6732b.f37984v, i12, "IS_EXPECT_FUNCTION.get(flags)");
        c1630h.f38524R = !C6732b.f37985w.m13346c(i12).booleanValue();
        ((C10544h) c8578t.f45999a).f52591m.mo19513a(protoBuf$Function, c1630h, (C6735e) obj2, typeDeserializer);
        return c1630h;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0107  */
    /* JADX WARN: Code duplicated, block: B:27:0x0120  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public final C1629g m14129f(final ProtoBuf$Property protoBuf$Property) {
        int i10;
        MemberDeserializer memberDeserializer;
        InterfaceC9077e c1623a;
        C6732b.b bVar;
        boolean z10;
        C9564e0 c9564e0M16434c;
        final MemberDeserializer memberDeserializer2;
        C9566f0 c9566f0M16435d;
        AbstractC5257t abstractC5257tM14139g;
        boolean z11;
        C5207g.m11111f(protoBuf$Property, "proto");
        if ((protoBuf$Property.f39192c & 1) == 1) {
            i10 = protoBuf$Property.f39193d;
        } else {
            int i11 = protoBuf$Property.f39194e;
            i10 = ((i11 >> 8) << 6) + (i11 & 63);
        }
        int i12 = i10;
        C8578t c8578t = this.f39700a;
        InterfaceC8838g interfaceC8838g = (InterfaceC8838g) c8578t.f46001c;
        InterfaceC9077e interfaceC9077eM14125b = m14125b(protoBuf$Property, i12, AnnotatedCallableKind.PROPERTY);
        Modality modalityM19525a = C10555s.m19525a((ProtoBuf$Modality) C6732b.f37967e.m13348c(i12));
        AbstractC8848l abstractC8848lM19526a = C10556t.m19526a((ProtoBuf$Visibility) C6732b.f37966d.m13348c(i12));
        boolean zM779z = C0166e.m779z(C6732b.f37986x, i12, "IS_VAR.get(flags)");
        Object obj = c8578t.f46000b;
        Object obj2 = c8578t.f46002d;
        final C1629g c1629g = new C1629g(interfaceC8838g, null, interfaceC9077eM14125b, modalityM19525a, abstractC8848lM19526a, zM779z, C7499b.m14910J((InterfaceC6733c) obj, protoBuf$Property.f39195f), C10556t.m19527b((ProtoBuf$MemberKind) C6732b.f37977o.m13348c(i12)), C0166e.m779z(C6732b.f37951B, i12, "IS_LATEINIT.get(flags)"), C0166e.m779z(C6732b.f37950A, i12, "IS_CONST.get(flags)"), C0166e.m779z(C6732b.f37953D, i12, "IS_EXTERNAL_PROPERTY.get(flags)"), C0166e.m779z(C6732b.f37954E, i12, "IS_DELEGATED.get(flags)"), C0166e.m779z(C6732b.f37955F, i12, "IS_EXPECT_PROPERTY.get(flags)"), protoBuf$Property, (InterfaceC6733c) obj, (C6735e) obj2, (C6736f) c8578t.f46003e, (InterfaceC1626d) c8578t.f46005g);
        List<ProtoBuf$TypeParameter> list = protoBuf$Property.f39198i;
        C5207g.m11110e(list, "proto.typeParameterList");
        C8578t c8578tM16777a = c8578t.m16777a(c1629g, list, (InterfaceC6733c) c8578t.f46000b, (C6735e) c8578t.f46002d, (C6736f) c8578t.f46003e, (AbstractC6731a) c8578t.f46004f);
        boolean zM779z2 = C0166e.m779z(C6732b.f37987y, i12, "HAS_GETTER.get(flags)");
        InterfaceC9077e.a.C10670a c10670a = InterfaceC9077e.a.f47365a;
        if (zM779z2) {
            int i13 = protoBuf$Property.f39192c;
            if ((i13 & 32) == 32) {
                z11 = true;
            } else if ((i13 & 64) == 64) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                memberDeserializer = this;
                c1623a = new C1623a(c8578t.m16778c(), new MemberDeserializer$getReceiverParameterAnnotations$1(memberDeserializer, protoBuf$Property, AnnotatedCallableKind.PROPERTY_GETTER));
            } else {
                memberDeserializer = this;
                c1623a = c10670a;
            }
        } else {
            memberDeserializer = this;
            c1623a = c10670a;
        }
        Object obj3 = c8578tM16777a.f46006h;
        TypeDeserializer typeDeserializer = (TypeDeserializer) obj3;
        AbstractC5257t abstractC5257tM14139g2 = typeDeserializer.m14139g(C0062b.m314U1(protoBuf$Property, r22));
        List<InterfaceC8847k0> listM14136b = typeDeserializer.m14136b();
        InterfaceC8838g interfaceC8838g2 = (InterfaceC8838g) c8578t.f46001c;
        InterfaceC8830c interfaceC8830c = interfaceC8838g2 instanceof InterfaceC8830c ? (InterfaceC8830c) interfaceC8838g2 : null;
        InterfaceC8835e0 interfaceC8835e0Mo17092U0 = interfaceC8830c != null ? interfaceC8830c.mo17092U0() : null;
        C6735e c6735e = (C6735e) obj2;
        C5207g.m11111f(c6735e, "typeTable");
        int i14 = protoBuf$Property.f39192c;
        ProtoBuf$Type protoBuf$TypeM13355a = (i14 & 32) == 32 ? protoBuf$Property.f39199j : (i14 & 64) == 64 ? c6735e.m13355a(protoBuf$Property.f39200k) : null;
        C9568g0 c9568g0M16438g = (protoBuf$TypeM13355a == null || (abstractC5257tM14139g = typeDeserializer.m14139g(protoBuf$TypeM13355a)) == null) ? null : C8412c.m16438g(c1629g, abstractC5257tM14139g, c1623a);
        List<ProtoBuf$Type> list2 = protoBuf$Property.f39201l;
        C5207g.m11110e(list2, "proto.contextReceiverTypeList");
        ArrayList arrayList = new ArrayList(C9325m.m17681z(list2, 10));
        for (ProtoBuf$Type protoBuf$Type : list2) {
            C5207g.m11110e(protoBuf$Type, "it");
            arrayList.add(C8412c.m16433b(c1629g, ((TypeDeserializer) obj3).m14139g(protoBuf$Type), c10670a));
        }
        c1629g.m18011a1(abstractC5257tM14139g2, listM14136b, interfaceC8835e0Mo17092U0, c9568g0M16438g, arrayList);
        C6732b.a aVar = C6732b.f37965c;
        boolean zM779z3 = C0166e.m779z(aVar, i12, "HAS_ANNOTATIONS.get(flags)");
        C6732b.b bVar2 = C6732b.f37966d;
        ProtoBuf$Visibility protoBuf$Visibility = (ProtoBuf$Visibility) bVar2.m13348c(i12);
        C6732b.b bVar3 = C6732b.f37967e;
        ProtoBuf$Modality protoBuf$Modality = (ProtoBuf$Modality) bVar3.m13348c(i12);
        if (protoBuf$Visibility == null) {
            C6732b.m13345a(10);
            throw null;
        }
        if (protoBuf$Modality == null) {
            C6732b.m13345a(11);
            throw null;
        }
        int iM13347d = aVar.m13347d(Boolean.valueOf(zM779z3)) | (protoBuf$Modality.getNumber() << bVar3.f37990a) | (protoBuf$Visibility.getNumber() << bVar2.f37990a);
        C6732b.a aVar2 = C6732b.f37959J;
        Boolean bool = Boolean.FALSE;
        int iM13347d2 = iM13347d | aVar2.m13347d(bool);
        C6732b.a aVar3 = C6732b.f37960K;
        int iM13347d3 = iM13347d2 | aVar3.m13347d(bool);
        C6732b.a aVar4 = C6732b.f37961L;
        int iM13347d4 = iM13347d3 | aVar4.m13347d(bool);
        InterfaceC8837f0.a aVar5 = InterfaceC8837f0.f46730a;
        if (zM779z2) {
            int i15 = (protoBuf$Property.f39192c & 256) == 256 ? protoBuf$Property.f39186K : iM13347d4;
            boolean zM779z4 = C0166e.m779z(aVar2, i15, "IS_NOT_DEFAULT.get(getterFlags)");
            boolean zM779z5 = C0166e.m779z(aVar3, i15, "IS_EXTERNAL_ACCESSOR.get(getterFlags)");
            boolean zM779z6 = C0166e.m779z(aVar4, i15, "IS_INLINE_ACCESSOR.get(getterFlags)");
            InterfaceC9077e interfaceC9077eM14125b2 = memberDeserializer.m14125b(protoBuf$Property, i15, AnnotatedCallableKind.PROPERTY_GETTER);
            if (zM779z4) {
                z10 = true;
                bVar = bVar2;
                c9564e0M16434c = new C9564e0(c1629g, interfaceC9077eM14125b2, C10555s.m19525a((ProtoBuf$Modality) bVar3.m13348c(i15)), C10556t.m19526a((ProtoBuf$Visibility) bVar2.m13348c(i15)), !zM779z4, zM779z5, zM779z6, c1629g.mo11897u(), null, aVar5);
            } else {
                bVar = bVar2;
                z10 = true;
                c9564e0M16434c = C8412c.m16434c(c1629g, interfaceC9077eM14125b2);
            }
            c9564e0M16434c.m18016X0(c1629g.mo11900y());
        } else {
            iM13347d4 = iM13347d4;
            aVar4 = aVar4;
            bVar3 = bVar3;
            bVar = bVar2;
            aVar3 = aVar3;
            z10 = true;
            c9564e0M16434c = null;
        }
        C9564e0 c9564e0 = c9564e0M16434c;
        boolean z12 = z10;
        if (C0166e.m779z(C6732b.f37988z, i12, "HAS_SETTER.get(flags)")) {
            int i16 = (protoBuf$Property.f39192c & 512) == 512 ? z12 : false ? protoBuf$Property.f39187L : iM13347d4;
            boolean zM779z7 = C0166e.m779z(aVar2, i16, "IS_NOT_DEFAULT.get(setterFlags)");
            boolean zM779z8 = C0166e.m779z(aVar3, i16, "IS_EXTERNAL_ACCESSOR.get(setterFlags)");
            boolean zM779z9 = C0166e.m779z(aVar4, i16, "IS_INLINE_ACCESSOR.get(setterFlags)");
            AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.PROPERTY_SETTER;
            InterfaceC9077e interfaceC9077eM14125b3 = m14125b(protoBuf$Property, i16, annotatedCallableKind);
            if (zM779z7) {
                memberDeserializer2 = this;
                C9566f0 c9566f0 = new C9566f0(c1629g, interfaceC9077eM14125b3, C10555s.m19525a((ProtoBuf$Modality) bVar3.m13348c(i16)), C10556t.m19526a((ProtoBuf$Visibility) bVar.m13348c(i16)), !zM779z7, zM779z8, zM779z9, c1629g.mo11897u(), null, aVar5);
                InterfaceC8853n0 interfaceC8853n0 = (InterfaceC8853n0) C6752c.m13443k0(((MemberDeserializer) c8578tM16777a.m16777a(c9566f0, EmptyList.f38032a, (InterfaceC6733c) c8578tM16777a.f46000b, (C6735e) c8578tM16777a.f46002d, (C6736f) c8578tM16777a.f46003e, (AbstractC6731a) c8578tM16777a.f46004f).f46007i).m14131h(C9000b.m17251q(protoBuf$Property.f39185J), protoBuf$Property, annotatedCallableKind));
                if (interfaceC8853n0 == null) {
                    C9566f0.m18017N(6);
                    throw null;
                }
                c9566f0.f49188H = interfaceC8853n0;
                c9566f0M16435d = c9566f0;
            } else {
                memberDeserializer2 = this;
                c9566f0M16435d = C8412c.m16435d(c1629g, interfaceC9077eM14125b3);
            }
        } else {
            memberDeserializer2 = this;
            c9566f0M16435d = null;
        }
        if (C0166e.m779z(C6732b.f37952C, i12, "HAS_CONSTANT.get(flags)")) {
            c1629g.m18041P0(null, new InterfaceC2041a<InterfaceC2074f<? extends AbstractC8875g<?>>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$loadProperty$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final InterfaceC2074f<? extends AbstractC8875g<?>> mo807E() {
                    final MemberDeserializer memberDeserializer3 = this.f39711b;
                    InterfaceC2076h interfaceC2076hM16778c = memberDeserializer3.f39700a.m16778c();
                    final ProtoBuf$Property protoBuf$Property2 = protoBuf$Property;
                    final C1629g c1629g2 = c1629g;
                    return interfaceC2076hM16778c.mo6219d(new InterfaceC2041a<AbstractC8875g<?>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$loadProperty$4.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final AbstractC8875g<?> mo807E() {
                            MemberDeserializer memberDeserializer4 = memberDeserializer3;
                            AbstractC10554r abstractC10554rM14124a = memberDeserializer4.m14124a((InterfaceC8838g) memberDeserializer4.f39700a.f46001c);
                            C5207g.m11108c(abstractC10554rM14124a);
                            InterfaceC10537a<InterfaceC9075c, AbstractC8875g<?>> interfaceC10537a = ((C10544h) memberDeserializer4.f39700a.f45999a).f52583e;
                            AbstractC5257t abstractC5257tMo11900y = c1629g2.mo11900y();
                            C5207g.m11110e(abstractC5257tMo11900y, "property.returnType");
                            return interfaceC10537a.mo13746g(abstractC10554rM14124a, protoBuf$Property2, abstractC5257tMo11900y);
                        }
                    });
                }
            });
        }
        InterfaceC8838g interfaceC8838g3 = (InterfaceC8838g) c8578t.f46001c;
        InterfaceC8830c interfaceC8830c2 = interfaceC8838g3 instanceof InterfaceC8830c ? (InterfaceC8830c) interfaceC8838g3 : null;
        if ((interfaceC8830c2 != null ? interfaceC8830c2.mo13602u() : null) == ClassKind.ANNOTATION_CLASS) {
            c1629g.m18041P0(null, new InterfaceC2041a<InterfaceC2074f<? extends AbstractC8875g<?>>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$loadProperty$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final InterfaceC2074f<? extends AbstractC8875g<?>> mo807E() {
                    final MemberDeserializer memberDeserializer3 = this.f39717b;
                    InterfaceC2076h interfaceC2076hM16778c = memberDeserializer3.f39700a.m16778c();
                    final ProtoBuf$Property protoBuf$Property2 = protoBuf$Property;
                    final C1629g c1629g2 = c1629g;
                    return interfaceC2076hM16778c.mo6219d(new InterfaceC2041a<AbstractC8875g<?>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$loadProperty$5.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final AbstractC8875g<?> mo807E() {
                            MemberDeserializer memberDeserializer4 = memberDeserializer3;
                            AbstractC10554r abstractC10554rM14124a = memberDeserializer4.m14124a((InterfaceC8838g) memberDeserializer4.f39700a.f46001c);
                            C5207g.m11108c(abstractC10554rM14124a);
                            InterfaceC10537a<InterfaceC9075c, AbstractC8875g<?>> interfaceC10537a = ((C10544h) memberDeserializer4.f39700a.f45999a).f52583e;
                            AbstractC5257t abstractC5257tMo11900y = c1629g2.mo11900y();
                            C5207g.m11110e(abstractC5257tMo11900y, "property.returnType");
                            return interfaceC10537a.mo13747k(abstractC10554rM14124a, protoBuf$Property2, abstractC5257tMo11900y);
                        }
                    });
                }
            });
        }
        c1629g.m18010Y0(c9564e0, c9566f0M16435d, new C9586s(c1629g, memberDeserializer2.m14126c(protoBuf$Property, false)), new C9586s(c1629g, memberDeserializer2.m14126c(protoBuf$Property, z12)));
        return c1629g;
    }

    /* JADX INFO: renamed from: g */
    public final C1631i m14130g(ProtoBuf$TypeAlias protoBuf$TypeAlias) {
        C8578t c8578t;
        ProtoBuf$Type protoBuf$TypeM13355a;
        ProtoBuf$Type protoBuf$TypeM13355a2;
        C5207g.m11111f(protoBuf$TypeAlias, "proto");
        List<ProtoBuf$Annotation> list = protoBuf$TypeAlias.f39308k;
        C5207g.m11110e(list, "proto.annotationList");
        ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c8578t = this.f39700a;
            if (!zHasNext) {
                break;
            }
            ProtoBuf$Annotation protoBuf$Annotation = (ProtoBuf$Annotation) it.next();
            C5207g.m11110e(protoBuf$Annotation, "it");
            arrayList.add(this.f39701b.m19510a(protoBuf$Annotation, (InterfaceC6733c) c8578t.f46000b));
        }
        InterfaceC9077e c9078f = arrayList.isEmpty() ? InterfaceC9077e.a.f47365a : new C9078f(arrayList);
        AbstractC8848l abstractC8848lM19526a = C10556t.m19526a((ProtoBuf$Visibility) C6732b.f37966d.m13348c(protoBuf$TypeAlias.f39301d));
        InterfaceC2076h interfaceC2076hM16778c = c8578t.m16778c();
        InterfaceC8838g interfaceC8838g = (InterfaceC8838g) c8578t.f46001c;
        Object obj = c8578t.f46000b;
        Object obj2 = c8578t.f46002d;
        C1631i c1631i = new C1631i(interfaceC2076hM16778c, interfaceC8838g, c9078f, C7499b.m14910J((InterfaceC6733c) obj, protoBuf$TypeAlias.f39302e), abstractC8848lM19526a, protoBuf$TypeAlias, (InterfaceC6733c) obj, (C6735e) obj2, (C6736f) c8578t.f46003e, (InterfaceC1626d) c8578t.f46005g);
        List<ProtoBuf$TypeParameter> list2 = protoBuf$TypeAlias.f39303f;
        C5207g.m11110e(list2, "proto.typeParameterList");
        TypeDeserializer typeDeserializer = (TypeDeserializer) c8578t.m16777a(c1631i, list2, (InterfaceC6733c) c8578t.f46000b, (C6735e) c8578t.f46002d, (C6736f) c8578t.f46003e, (AbstractC6731a) c8578t.f46004f).f46006h;
        List<InterfaceC8847k0> listM14136b = typeDeserializer.m14136b();
        C6735e c6735e = (C6735e) obj2;
        C5207g.m11111f(c6735e, "typeTable");
        int i10 = protoBuf$TypeAlias.f39300c;
        if ((i10 & 4) == 4) {
            protoBuf$TypeM13355a = protoBuf$TypeAlias.f39304g;
            C5207g.m11110e(protoBuf$TypeM13355a, "underlyingType");
        } else {
            if (!((i10 & 8) == 8)) {
                throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias".toString());
            }
            protoBuf$TypeM13355a = c6735e.m13355a(protoBuf$TypeAlias.f39305h);
        }
        AbstractC5265x abstractC5265xM14138d = typeDeserializer.m14138d(protoBuf$TypeM13355a, false);
        C6735e c6735e2 = (C6735e) obj2;
        C5207g.m11111f(c6735e2, "typeTable");
        int i11 = protoBuf$TypeAlias.f39300c;
        if ((i11 & 16) == 16) {
            protoBuf$TypeM13355a2 = protoBuf$TypeAlias.f39306i;
            C5207g.m11110e(protoBuf$TypeM13355a2, "expandedType");
        } else {
            if (!((i11 & 32) == 32)) {
                throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias".toString());
            }
            protoBuf$TypeM13355a2 = c6735e2.m13355a(protoBuf$TypeAlias.f39307j);
        }
        c1631i.m5311V0(listM14136b, abstractC5265xM14138d, typeDeserializer.m14138d(protoBuf$TypeM13355a2, false));
        return c1631i;
    }

    /* JADX INFO: renamed from: h */
    public final List<InterfaceC8853n0> m14131h(List<ProtoBuf$ValueParameter> list, final InterfaceC6997h interfaceC6997h, final AnnotatedCallableKind annotatedCallableKind) {
        InterfaceC9077e c1632j;
        C8578t c8578t = this.f39700a;
        InterfaceC8838g interfaceC8838g = (InterfaceC8838g) c8578t.f46001c;
        C5207g.m11109d(interfaceC8838g, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        InterfaceC6816a interfaceC6816a = (InterfaceC6816a) interfaceC8838g;
        InterfaceC8838g interfaceC8838gMo11876g = interfaceC6816a.mo11876g();
        C5207g.m11110e(interfaceC8838gMo11876g, "callableDescriptor.containingDeclaration");
        final AbstractC10554r abstractC10554rM14124a = m14124a(interfaceC8838gMo11876g);
        ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C9000b.m17257w();
                throw null;
            }
            final ProtoBuf$ValueParameter protoBuf$ValueParameter = (ProtoBuf$ValueParameter) obj;
            int i12 = (protoBuf$ValueParameter.f39355c & 1) == 1 ? protoBuf$ValueParameter.f39356d : 0;
            if (abstractC10554rM14124a == null || !C0166e.m779z(C6732b.f37965c, i12, "HAS_ANNOTATIONS.get(flags)")) {
                c1632j = InterfaceC9077e.a.f47365a;
            } else {
                final int i13 = i10;
                c1632j = new C1632j(c8578t.m16778c(), new InterfaceC2041a<List<? extends InterfaceC9075c>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$valueParameters$1$annotations$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final List<? extends InterfaceC9075c> mo807E() {
                        return C6752c.m13453u0(((C10544h) this.f39723b.f39700a.f45999a).f52583e.mo13755c(abstractC10554rM14124a, interfaceC6997h, annotatedCallableKind, i13, protoBuf$ValueParameter));
                    }
                });
            }
            C7648e c7648eM14910J = C7499b.m14910J((InterfaceC6733c) c8578t.f46000b, protoBuf$ValueParameter.f39357e);
            Object obj2 = c8578t.f46006h;
            Object obj3 = c8578t.f46002d;
            AbstractC5257t abstractC5257tM14139g = ((TypeDeserializer) obj2).m14139g(C0062b.m407v2(protoBuf$ValueParameter, (C6735e) obj3));
            boolean zM779z = C0166e.m779z(C6732b.f37956G, i12, "DECLARES_DEFAULT_VALUE.get(flags)");
            boolean zM779z2 = C0166e.m779z(C6732b.f37957H, i12, "IS_CROSSINLINE.get(flags)");
            boolean zM779z3 = C0166e.m779z(C6732b.f37958I, i12, "IS_NOINLINE.get(flags)");
            C6735e c6735e = (C6735e) obj3;
            C5207g.m11111f(c6735e, "typeTable");
            int i14 = protoBuf$ValueParameter.f39355c;
            ProtoBuf$Type protoBuf$TypeM13355a = (i14 & 16) == 16 ? protoBuf$ValueParameter.f39360h : (i14 & 32) == 32 ? c6735e.m13355a(protoBuf$ValueParameter.f39361i) : null;
            AbstractC5257t abstractC5257tM14139g2 = protoBuf$TypeM13355a != null ? ((TypeDeserializer) obj2).m14139g(protoBuf$TypeM13355a) : null;
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new C6830d(interfaceC6816a, null, i10, c1632j, c7648eM14910J, abstractC5257tM14139g, zM779z, zM779z2, zM779z3, abstractC5257tM14139g2, InterfaceC8837f0.f46730a));
            arrayList = arrayList2;
            i10 = i11;
        }
        return C6752c.m13453u0(arrayList);
    }
}
