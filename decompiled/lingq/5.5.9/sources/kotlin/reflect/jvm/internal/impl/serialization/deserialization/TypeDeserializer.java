package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import ae.C0062b;
import android.support.v4.media.session.C0166e;
import bo.C1623a;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import co.InterfaceC2072d;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import fo.C5602h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kn.C6732b;
import kn.C6735e;
import kn.InterfaceC6733c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.sequences.C7073a;
import kotlin.sequences.SequencesKt__SequencesKt;
import mn.C7645b;
import mn.C7646c;
import p260m8.C7499b;
import p338qd.C8578t;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8845j0;
import p372rm.InterfaceC8847k0;
import p372rm.InterfaceC8863u;
import p385sf.C9000b;
import p541zn.C10544h;
import p541zn.C10555s;
import p541zn.C10557u;
import p541zn.C10558v;
import p543do.AbstractC5248o0;
import p543do.AbstractC5257t;
import p543do.AbstractC5265x;
import p543do.C5222b0;
import p543do.C5237j;
import p543do.C5238j0;
import p543do.C5250p0;
import p543do.C5258t0;
import p543do.InterfaceC5236i0;
import p543do.InterfaceC5240k0;
import p543do.InterfaceC5246n0;
import sm.C9078f;
import sm.InterfaceC9075c;
import sm.InterfaceC9077e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeDeserializer {

    /* JADX INFO: renamed from: a */
    public final C8578t f39729a;

    /* JADX INFO: renamed from: b */
    public final TypeDeserializer f39730b;

    /* JADX INFO: renamed from: c */
    public final String f39731c;

    /* JADX INFO: renamed from: d */
    public final String f39732d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2072d f39733e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2072d f39734f;

    /* JADX INFO: renamed from: g */
    public final Map<Integer, InterfaceC8847k0> f39735g;

    public TypeDeserializer(C8578t c8578t, TypeDeserializer typeDeserializer, List<ProtoBuf$TypeParameter> list, String str, String str2) {
        Map<Integer, InterfaceC8847k0> linkedHashMap;
        C5207g.m11111f(c8578t, "c");
        C5207g.m11111f(list, "typeParameterProtos");
        C5207g.m11111f(str, "debugName");
        this.f39729a = c8578t;
        this.f39730b = typeDeserializer;
        this.f39731c = str;
        this.f39732d = str2;
        this.f39733e = c8578t.m16778c().mo6222g(new InterfaceC2052l<Integer, InterfaceC8834e>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$classifierDescriptors$1
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final InterfaceC8834e mo528n(Integer num) {
                int iIntValue = num.intValue();
                C8578t c8578t2 = this.f39736b.f39729a;
                C7645b c7645bM14896C = C7499b.m14896C((InterfaceC6733c) c8578t2.f46000b, iIntValue);
                boolean z10 = c7645bM14896C.f42075c;
                Object obj = c8578t2.f45999a;
                return z10 ? ((C10544h) obj).m19515b(c7645bM14896C) : FindClassInModuleKt.m13585b(((C10544h) obj).f52580b, c7645bM14896C);
            }
        });
        this.f39734f = c8578t.m16778c().mo6222g(new InterfaceC2052l<Integer, InterfaceC8834e>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$typeAliasDescriptors$1
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final InterfaceC8834e mo528n(Integer num) {
                int iIntValue = num.intValue();
                C8578t c8578t2 = this.f39739b.f39729a;
                C7645b c7645bM14896C = C7499b.m14896C((InterfaceC6733c) c8578t2.f46000b, iIntValue);
                if (!c7645bM14896C.f42075c) {
                    InterfaceC8863u interfaceC8863u = ((C10544h) c8578t2.f45999a).f52580b;
                    C5207g.m11111f(interfaceC8863u, "<this>");
                    InterfaceC8834e interfaceC8834eM13585b = FindClassInModuleKt.m13585b(interfaceC8863u, c7645bM14896C);
                    if (interfaceC8834eM13585b instanceof InterfaceC8845j0) {
                        return (InterfaceC8845j0) interfaceC8834eM13585b;
                    }
                }
                return null;
            }
        });
        if (list.isEmpty()) {
            linkedHashMap = C6753d.m13459L0();
        } else {
            linkedHashMap = new LinkedHashMap<>();
            int i10 = 0;
            for (ProtoBuf$TypeParameter protoBuf$TypeParameter : list) {
                linkedHashMap.put(Integer.valueOf(protoBuf$TypeParameter.f39324d), new DeserializedTypeParameterDescriptor(this.f39729a, protoBuf$TypeParameter, i10));
                i10++;
            }
        }
        this.f39735g = linkedHashMap;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC5265x m14132a(AbstractC5265x abstractC5265x, AbstractC5257t abstractC5257t) {
        AbstractC6795c abstractC6795cM14230g = TypeUtilsKt.m14230g(abstractC5265x);
        InterfaceC9077e interfaceC9077eMo11289w = abstractC5265x.mo11289w();
        AbstractC5257t abstractC5257tM362k1 = C0062b.m362k1(abstractC5265x);
        List listM343e1 = C0062b.m343e1(abstractC5265x);
        List listM13418L = C6752c.m13418L(C0062b.m370m1(abstractC5265x));
        ArrayList arrayList = new ArrayList(C9325m.m17681z(listM13418L, 10));
        Iterator it = listM13418L.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC5246n0) it.next()).mo11236c());
        }
        return C0062b.m261E0(abstractC6795cM14230g, interfaceC9077eMo11289w, abstractC5257tM362k1, listM343e1, arrayList, abstractC5257t, true).mo11217b1(abstractC5265x.mo11242Y0());
    }

    /* JADX INFO: renamed from: e */
    public static final ArrayList m14133e(ProtoBuf$Type protoBuf$Type, TypeDeserializer typeDeserializer) {
        List<ProtoBuf$Type.Argument> list = protoBuf$Type.f39257d;
        C5207g.m11110e(list, "argumentList");
        ProtoBuf$Type protoBuf$TypeM278I1 = C0062b.m278I1(protoBuf$Type, (C6735e) typeDeserializer.f39729a.f46002d);
        Iterable iterableM14133e = protoBuf$TypeM278I1 != null ? m14133e(protoBuf$TypeM278I1, typeDeserializer) : null;
        if (iterableM14133e == null) {
            iterableM14133e = EmptyList.f38032a;
        }
        return C6752c.m13438f0(iterableM14133e, list);
    }

    /* JADX INFO: renamed from: f */
    public static C5238j0 m14134f(List list, InterfaceC9077e interfaceC9077e, InterfaceC5240k0 interfaceC5240k0, InterfaceC8838g interfaceC8838g) {
        ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC5236i0) it.next()).mo11270a(interfaceC9077e));
        }
        ArrayList arrayListM17680A = C9325m.m17680A(arrayList);
        C5238j0.f33329b.getClass();
        return C5238j0.a.m11272c(arrayListM17680A);
    }

    /* JADX INFO: renamed from: h */
    public static final InterfaceC8830c m14135h(final TypeDeserializer typeDeserializer, ProtoBuf$Type protoBuf$Type, int i10) {
        C7645b c7645bM14896C = C7499b.m14896C((InterfaceC6733c) typeDeserializer.f39729a.f46000b, i10);
        List<Integer> listM14267b3 = C7073a.m14267b3(C7073a.m14261V2(SequencesKt__SequencesKt.m14252M2(protoBuf$Type, new InterfaceC2052l<ProtoBuf$Type, ProtoBuf$Type>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$1
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final ProtoBuf$Type mo528n(ProtoBuf$Type protoBuf$Type2) {
                ProtoBuf$Type protoBuf$Type3 = protoBuf$Type2;
                C5207g.m11111f(protoBuf$Type3, "it");
                return C0062b.m278I1(protoBuf$Type3, (C6735e) this.f39741b.f39729a.f46002d);
            }
        }), new InterfaceC2052l<ProtoBuf$Type, Integer>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$2
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Integer mo528n(ProtoBuf$Type protoBuf$Type2) {
                ProtoBuf$Type protoBuf$Type3 = protoBuf$Type2;
                C5207g.m11111f(protoBuf$Type3, "it");
                return Integer.valueOf(protoBuf$Type3.f39257d.size());
            }
        }));
        Iterator it = SequencesKt__SequencesKt.m14252M2(c7645bM14896C, C7020x1c22db09.f39740j).iterator();
        int i11 = 0;
        while (it.hasNext()) {
            it.next();
            i11++;
            if (i11 < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        while (true) {
            ArrayList arrayList = (ArrayList) listM14267b3;
            if (arrayList.size() >= i11) {
                return ((C10544h) typeDeserializer.f39729a.f45999a).f52590l.m13588a(c7645bM14896C, listM14267b3);
            }
            arrayList.add(0);
        }
    }

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC8847k0> m14136b() {
        return C6752c.m13453u0(this.f39735g.values());
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC8847k0 m14137c(int i10) {
        InterfaceC8847k0 interfaceC8847k0 = this.f39735g.get(Integer.valueOf(i10));
        if (interfaceC8847k0 != null) {
            return interfaceC8847k0;
        }
        TypeDeserializer typeDeserializer = this.f39730b;
        if (typeDeserializer != null) {
            return typeDeserializer.m14137c(i10);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:120:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:122:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:125:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:128:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:130:0x0306  */
    /* JADX WARN: Code duplicated, block: B:131:0x030b  */
    /* JADX WARN: Code duplicated, block: B:134:0x0310  */
    /* JADX WARN: Code duplicated, block: B:135:0x0312  */
    /* JADX WARN: Code duplicated, block: B:138:0x0318  */
    /* JADX WARN: Code duplicated, block: B:145:0x0335  */
    /* JADX WARN: Code duplicated, block: B:146:0x033a  */
    /* JADX WARN: Code duplicated, block: B:149:0x0347  */
    /* JADX WARN: Code duplicated, block: B:156:0x0371  */
    /* JADX WARN: Code duplicated, block: B:159:0x0376  */
    /* JADX WARN: Code duplicated, block: B:160:0x037b  */
    /* JADX WARN: Code duplicated, block: B:163:0x0385  */
    /* JADX WARN: Code duplicated, block: B:164:0x038a  */
    /* JADX WARN: Code duplicated, block: B:165:0x038f  */
    /* JADX WARN: Code duplicated, block: B:167:0x0396  */
    /* JADX WARN: Code duplicated, block: B:168:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:170:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:172:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:174:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:175:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:180:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:181:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:183:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:184:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:187:0x0401  */
    /* JADX WARN: Code duplicated, block: B:189:0x0404  */
    /* JADX WARN: Code duplicated, block: B:191:0x040c  */
    /* JADX WARN: Code duplicated, block: B:194:0x041b  */
    /* JADX WARN: Code duplicated, block: B:196:0x042e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:197:0x01df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x025d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x0257 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0134  */
    /* JADX WARN: Code duplicated, block: B:58:0x0152  */
    /* JADX WARN: Code duplicated, block: B:61:0x018d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0195  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:72:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:76:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:80:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:82:0x0202  */
    /* JADX WARN: Code duplicated, block: B:85:0x0211  */
    /* JADX WARN: Code duplicated, block: B:86:0x0214  */
    /* JADX WARN: Code duplicated, block: B:88:0x0217  */
    /* JADX WARN: Code duplicated, block: B:89:0x021a  */
    /* JADX WARN: Code duplicated, block: B:91:0x021f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0221  */
    /* JADX WARN: Code duplicated, block: B:94:0x0224  */
    /* JADX WARN: Code duplicated, block: B:95:0x022b  */
    /* JADX WARN: Code duplicated, block: B:97:0x022e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0245  */
    /* JADX WARN: Instruction removed from duplicated block: B:175:0x03c5, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:78:0x01e8, please report this as an issue */
    /* JADX INFO: renamed from: d */
    public final AbstractC5265x m14138d(final ProtoBuf$Type protoBuf$Type, boolean z10) {
        InterfaceC5240k0 interfaceC5240k0M11913d;
        InterfaceC8834e interfaceC8834eM14135h;
        Object next;
        Object obj;
        Object obj2;
        C5238j0 c5238j0M14134f;
        ArrayList arrayList;
        Iterator it;
        boolean zHasNext;
        Object obj3;
        List listM13453u0;
        AbstractC5265x abstractC5265xM14187f;
        boolean z11;
        ProtoBuf$Type protoBuf$TypeM13355a;
        C5237j c5237jM11271a;
        boolean z12;
        int size;
        AbstractC5265x abstractC5265xM14187f2;
        InterfaceC8834e interfaceC8834eMo11235q;
        FunctionClassKind functionClassKindM349g1;
        boolean z13;
        InterfaceC5246n0 interfaceC5246n0;
        AbstractC5257t abstractC5257tMo11236c;
        InterfaceC8834e interfaceC8834eMo11235q2;
        C7646c c7646cM14110g;
        boolean z14;
        AbstractC5257t abstractC5257tMo11236c2;
        InterfaceC8838g interfaceC8838g;
        InterfaceC6816a interfaceC6816a;
        C7646c c7646cM14106c;
        int size2;
        C6735e c6735e;
        int i10;
        boolean z15;
        Object next2;
        int i11;
        ProtoBuf$Type.Argument argument;
        InterfaceC8847k0 interfaceC8847k0;
        ProtoBuf$Type.Argument.Projection projection;
        int i12;
        Variance variance;
        C6735e c6735e2;
        int i13;
        boolean z16;
        boolean z17;
        ProtoBuf$Type protoBuf$TypeM13355a2;
        AbstractC5248o0 c5250p0;
        C5207g.m11111f(protoBuf$Type, "proto");
        boolean zM13847z = protoBuf$Type.m13847z();
        C8578t c8578t = this.f39729a;
        int i14 = 0;
        if (!zM13847z) {
            if (((protoBuf$Type.f39256c & BuildConfig.SDK_TRUNCATE_LENGTH) == 128) && C7499b.m14896C((InterfaceC6733c) c8578t.f46000b, protoBuf$Type.f39265l).f42075c) {
                ((C10544h) c8578t.f45999a).f52585g.mo19523a();
            }
        } else if (C7499b.m14896C((InterfaceC6733c) c8578t.f46000b, protoBuf$Type.f39262i).f42075c) {
            ((C10544h) c8578t.f45999a).f52585g.mo19523a();
        }
        if (protoBuf$Type.m13847z()) {
            interfaceC8834eM14135h = (InterfaceC8834e) this.f39733e.mo528n(Integer.valueOf(protoBuf$Type.f39262i));
            if (interfaceC8834eM14135h == null) {
                interfaceC8834eM14135h = m14135h(this, protoBuf$Type, protoBuf$Type.f39262i);
            }
        } else {
            int i15 = protoBuf$Type.f39256c;
            if ((i15 & 32) == 32) {
                interfaceC8834eM14135h = m14137c(protoBuf$Type.f39263j);
                if (interfaceC8834eM14135h == null) {
                    C5602h c5602h = C5602h.f34418a;
                    interfaceC5240k0M11913d = C5602h.m11913d(ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, String.valueOf(protoBuf$Type.f39263j), this.f39732d);
                }
            } else {
                if ((i15 & 64) == 64) {
                    String strMo13351a = ((InterfaceC6733c) c8578t.f46000b).mo13351a(protoBuf$Type.f39264k);
                    Iterator<T> it2 = m14136b().iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!C5207g.m11106a(((InterfaceC8847k0) next).mo11874a().m15235f(), strMo13351a));
                    InterfaceC8847k0 interfaceC8847k1 = (InterfaceC8847k0) next;
                    if (interfaceC8847k1 == null) {
                        C5602h c5602h2 = C5602h.f34418a;
                        interfaceC5240k0M11913d = C5602h.m11913d(ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, strMo13351a, ((InterfaceC8838g) c8578t.f46001c).toString());
                    } else {
                        interfaceC8834eM14135h = interfaceC8847k1;
                    }
                } else {
                    if ((i15 & BuildConfig.SDK_TRUNCATE_LENGTH) == 128) {
                        interfaceC8834eM14135h = (InterfaceC8834e) this.f39734f.mo528n(Integer.valueOf(protoBuf$Type.f39265l));
                        if (interfaceC8834eM14135h == null) {
                            interfaceC8834eM14135h = m14135h(this, protoBuf$Type, protoBuf$Type.f39265l);
                        }
                    } else {
                        C5602h c5602h3 = C5602h.f34418a;
                        interfaceC5240k0M11913d = C5602h.m11913d(ErrorTypeKind.UNKNOWN_TYPE, new String[0]);
                    }
                }
            }
            if (C5602h.m11915f(interfaceC5240k0M11913d.mo11235q())) {
                C5602h c5602h4 = C5602h.f34418a;
                ErrorTypeKind errorTypeKind = ErrorTypeKind.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR;
                String[] strArr = {interfaceC5240k0M11913d.toString()};
                C5207g.m11111f(errorTypeKind, "kind");
                return C5602h.m11914e(errorTypeKind, EmptyList.f38032a, interfaceC5240k0M11913d, (String[]) Arrays.copyOf(strArr, 1));
            }
            C1623a c1623a = new C1623a(c8578t.m16778c(), new InterfaceC2041a<List<? extends InterfaceC9075c>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$simpleType$annotations$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final List<? extends InterfaceC9075c> mo807E() {
                    C8578t c8578t2 = this.f39729a;
                    return ((C10544h) c8578t2.f45999a).f52583e.mo13753a(protoBuf$Type, (InterfaceC6733c) c8578t2.f46000b);
                }
            });
            obj = c8578t.f45999a;
            List<InterfaceC5236i0> list = ((C10544h) obj).f52597s;
            obj2 = c8578t.f46001c;
            c5238j0M14134f = m14134f(list, c1623a, interfaceC5240k0M11913d, (InterfaceC8838g) obj2);
            ArrayList arrayListM14133e = m14133e(protoBuf$Type, this);
            arrayList = new ArrayList(C9325m.m17681z(arrayListM14133e, 10));
            it = arrayListM14133e.iterator();
            while (true) {
                zHasNext = it.hasNext();
                obj3 = c8578t.f46002d;
                if (zHasNext) {
                    listM13453u0 = C6752c.m13453u0(arrayList);
                    InterfaceC8834e interfaceC8834eMo11235q3 = interfaceC5240k0M11913d.mo11235q();
                    if (!z10 && (interfaceC8834eMo11235q3 instanceof InterfaceC8845j0)) {
                        int i16 = KotlinTypeFactory.f39870a;
                        AbstractC5265x abstractC5265xM14183b = KotlinTypeFactory.m14183b((InterfaceC8845j0) interfaceC8834eMo11235q3, listM13453u0);
                        List<InterfaceC5236i0> list2 = ((C10544h) obj).f52597s;
                        ArrayList arrayListM13436d0 = C6752c.m13436d0(c1623a, abstractC5265xM14183b.mo11289w());
                        abstractC5265xM14187f = abstractC5265xM14183b.mo11217b1(C5258t0.m11296g(abstractC5265xM14183b) || protoBuf$Type.f39258e).mo11243d1(m14134f(list2, arrayListM13436d0.isEmpty() ? InterfaceC9077e.a.f47365a : new C9078f(arrayListM13436d0), interfaceC5240k0M11913d, (InterfaceC8838g) obj2));
                        protoBuf$TypeM13355a = null;
                        z11 = true;
                    } else if (C0166e.m779z(C6732b.f37963a, protoBuf$Type.f39252L, "SUSPEND_TYPE.get(proto.flags)")) {
                        z12 = protoBuf$Type.f39258e;
                        size = interfaceC5240k0M11913d.mo11260r().size() - listM13453u0.size();
                        if (size == 0) {
                            abstractC5265xM14187f2 = KotlinTypeFactory.m14187f(c5238j0M14134f, interfaceC5240k0M11913d, listM13453u0, z12, null);
                            interfaceC8834eMo11235q = abstractC5265xM14187f2.mo11250X0().mo11235q();
                            if (interfaceC8834eMo11235q != null) {
                                functionClassKindM349g1 = C0062b.m349g1(interfaceC8834eMo11235q);
                            } else {
                                functionClassKindM349g1 = null;
                            }
                            if (functionClassKindM349g1 == FunctionClassKind.Function) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13 || (interfaceC5246n0 = (InterfaceC5246n0) C6752c.m13433a0(C0062b.m370m1(abstractC5265xM14187f2))) == null || (abstractC5257tMo11236c = interfaceC5246n0.mo11236c()) == null) {
                                z14 = true;
                                abstractC5265xM14187f2 = null;
                            } else {
                                interfaceC8834eMo11235q2 = abstractC5257tMo11236c.mo11250X0().mo11235q();
                                if (interfaceC8834eMo11235q2 != null) {
                                    c7646cM14110g = DescriptorUtilsKt.m14110g(interfaceC8834eMo11235q2);
                                } else {
                                    c7646cM14110g = null;
                                }
                                z14 = true;
                                if (abstractC5257tMo11236c.mo11240V0().size() == 1 && (C5207g.m11106a(c7646cM14110g, C6797e.f38339e) || C5207g.m11106a(c7646cM14110g, C10558v.f52628a))) {
                                    abstractC5257tMo11236c2 = ((InterfaceC5246n0) C6752c.m13443k0(abstractC5257tMo11236c.mo11240V0())).mo11236c();
                                    C5207g.m11110e(abstractC5257tMo11236c2, "continuationArgumentType.arguments.single().type");
                                    interfaceC8838g = (InterfaceC8838g) obj2;
                                    if (!(interfaceC8838g instanceof InterfaceC6816a)) {
                                        interfaceC8838g = null;
                                    }
                                    interfaceC6816a = (InterfaceC6816a) interfaceC8838g;
                                    if (interfaceC6816a != null) {
                                        c7646cM14106c = DescriptorUtilsKt.m14106c(interfaceC6816a);
                                    } else {
                                        c7646cM14106c = null;
                                    }
                                    if (C5207g.m11106a(c7646cM14106c, C10557u.f52627a)) {
                                        abstractC5265xM14187f2 = m14132a(abstractC5265xM14187f2, abstractC5257tMo11236c2);
                                    } else {
                                        abstractC5265xM14187f2 = m14132a(abstractC5265xM14187f2, abstractC5257tMo11236c2);
                                    }
                                }
                            }
                        } else if (size != 1 && (size2 = listM13453u0.size() - 1) >= 0) {
                            InterfaceC5240k0 interfaceC5240k0Mo13600k = interfaceC5240k0M11913d.mo11234o().m13564w(size2).mo13600k();
                            C5207g.m11110e(interfaceC5240k0Mo13600k, "functionTypeConstructor.…on(arity).typeConstructor");
                            abstractC5265xM14187f2 = KotlinTypeFactory.m14187f(c5238j0M14134f, interfaceC5240k0Mo13600k, listM13453u0, z12, null);
                            z14 = true;
                        } else {
                            z14 = true;
                            abstractC5265xM14187f2 = null;
                        }
                        if (abstractC5265xM14187f2 == null) {
                            C5602h c5602h5 = C5602h.f34418a;
                            abstractC5265xM14187f = C5602h.m11914e(ErrorTypeKind.INCONSISTENT_SUSPEND_FUNCTION, listM13453u0, interfaceC5240k0M11913d, new String[0]);
                        } else {
                            abstractC5265xM14187f = abstractC5265xM14187f2;
                        }
                        protoBuf$TypeM13355a = null;
                        z11 = z14;
                    } else {
                        abstractC5265xM14187f = KotlinTypeFactory.m14187f(c5238j0M14134f, interfaceC5240k0M11913d, listM13453u0, protoBuf$Type.f39258e, null);
                        if (C0166e.m779z(C6732b.f37964b, protoBuf$Type.f39252L, "DEFINITELY_NOT_NULL_TYPE.get(proto.flags)")) {
                            c5237jM11271a = C5237j.a.m11271a(abstractC5265xM14187f, false);
                            if (c5237jM11271a == null) {
                                throw new IllegalStateException(("null DefinitelyNotNullType for '" + abstractC5265xM14187f + '\'').toString());
                            }
                            abstractC5265xM14187f = c5237jM11271a;
                        }
                        z11 = true;
                        protoBuf$TypeM13355a = null;
                    }
                    c6735e = (C6735e) obj3;
                    C5207g.m11111f(c6735e, "typeTable");
                    i10 = protoBuf$Type.f39256c;
                    if ((i10 & 1024) == 1024) {
                        z15 = z11;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        protoBuf$TypeM13355a = protoBuf$Type.f39250J;
                    } else {
                        if ((i10 & 2048) != 2048) {
                            z11 = false;
                        }
                        if (z11) {
                            protoBuf$TypeM13355a = c6735e.m13355a(protoBuf$Type.f39251K);
                        }
                    }
                    if (protoBuf$TypeM13355a != null) {
                        abstractC5265xM14187f = C0062b.m423z2(abstractC5265xM14187f, m14138d(protoBuf$TypeM13355a, false));
                    }
                    if (protoBuf$Type.m13847z()) {
                        return ((C10544h) obj).f52596r.mo17692a(C7499b.m14896C((InterfaceC6733c) c8578t.f46000b, protoBuf$Type.f39262i), abstractC5265xM14187f);
                    }
                    return abstractC5265xM14187f;
                }
                next2 = it.next();
                i11 = i14 + 1;
                if (i14 >= 0) {
                    C9000b.m17257w();
                    throw null;
                }
                argument = (ProtoBuf$Type.Argument) next2;
                List<InterfaceC8847k0> listMo11260r = interfaceC5240k0M11913d.mo11260r();
                Iterator it3 = it;
                C5207g.m11110e(listMo11260r, "constructor.parameters");
                interfaceC8847k0 = (InterfaceC8847k0) C6752c.m13426T(i14, listMo11260r);
                projection = argument.f39270c;
                if (projection == ProtoBuf$Type.Argument.Projection.STAR) {
                    C5207g.m11110e(projection, "typeArgumentProto.projection");
                    i12 = C10555s.a.f52624d[projection.ordinal()];
                    if (i12 != 1) {
                        variance = Variance.IN_VARIANCE;
                    } else if (i12 != 2) {
                        variance = Variance.OUT_VARIANCE;
                    } else {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw new IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: " + projection);
                        }
                        variance = Variance.INVARIANT;
                    }
                    c6735e2 = (C6735e) obj3;
                    C5207g.m11111f(c6735e2, "typeTable");
                    i13 = argument.f39269b;
                    if ((i13 & 2) == 2) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (z16) {
                        protoBuf$TypeM13355a2 = argument.f39271d;
                    } else {
                        if ((i13 & 4) == 4) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (z17) {
                            protoBuf$TypeM13355a2 = c6735e2.m13355a(argument.f39272e);
                        } else {
                            protoBuf$TypeM13355a2 = null;
                        }
                    }
                    if (protoBuf$TypeM13355a2 == null) {
                        c5250p0 = new C5250p0(C5602h.m11912c(ErrorTypeKind.NO_RECORDED_TYPE, argument.toString()));
                    } else {
                        c5250p0 = new C5250p0(m14139g(protoBuf$TypeM13355a2), variance);
                    }
                } else if (interfaceC8847k0 == null) {
                    c5250p0 = new C5222b0(((C10544h) obj).f52580b.mo11877o());
                } else {
                    c5250p0 = new StarProjectionImpl(interfaceC8847k0);
                }
                arrayList.add(c5250p0);
                i14 = i11;
                it = it3;
            }
        }
        interfaceC5240k0M11913d = interfaceC8834eM14135h.mo13600k();
        C5207g.m11110e(interfaceC5240k0M11913d, "classifier.typeConstructor");
        if (C5602h.m11915f(interfaceC5240k0M11913d.mo11235q())) {
            C5602h c5602h6 = C5602h.f34418a;
            ErrorTypeKind errorTypeKind2 = ErrorTypeKind.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR;
            String[] strArr2 = {interfaceC5240k0M11913d.toString()};
            C5207g.m11111f(errorTypeKind2, "kind");
            return C5602h.m11914e(errorTypeKind2, EmptyList.f38032a, interfaceC5240k0M11913d, (String[]) Arrays.copyOf(strArr2, 1));
        }
        C1623a c1623a2 = new C1623a(c8578t.m16778c(), new InterfaceC2041a<List<? extends InterfaceC9075c>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$simpleType$annotations$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final List<? extends InterfaceC9075c> mo807E() {
                C8578t c8578t2 = this.f39729a;
                return ((C10544h) c8578t2.f45999a).f52583e.mo13753a(protoBuf$Type, (InterfaceC6733c) c8578t2.f46000b);
            }
        });
        obj = c8578t.f45999a;
        List<InterfaceC5236i0> list3 = ((C10544h) obj).f52597s;
        obj2 = c8578t.f46001c;
        c5238j0M14134f = m14134f(list3, c1623a2, interfaceC5240k0M11913d, (InterfaceC8838g) obj2);
        ArrayList arrayListM14133e2 = m14133e(protoBuf$Type, this);
        arrayList = new ArrayList(C9325m.m17681z(arrayListM14133e2, 10));
        it = arrayListM14133e2.iterator();
        while (true) {
            zHasNext = it.hasNext();
            obj3 = c8578t.f46002d;
            if (zHasNext) {
                listM13453u0 = C6752c.m13453u0(arrayList);
                InterfaceC8834e interfaceC8834eMo11235q4 = interfaceC5240k0M11913d.mo11235q();
                if (!z10) {
                    if (C0166e.m779z(C6732b.f37963a, protoBuf$Type.f39252L, "SUSPEND_TYPE.get(proto.flags)")) {
                        z12 = protoBuf$Type.f39258e;
                        size = interfaceC5240k0M11913d.mo11260r().size() - listM13453u0.size();
                        if (size == 0) {
                            abstractC5265xM14187f2 = KotlinTypeFactory.m14187f(c5238j0M14134f, interfaceC5240k0M11913d, listM13453u0, z12, null);
                            interfaceC8834eMo11235q = abstractC5265xM14187f2.mo11250X0().mo11235q();
                            if (interfaceC8834eMo11235q != null) {
                                functionClassKindM349g1 = C0062b.m349g1(interfaceC8834eMo11235q);
                            } else {
                                functionClassKindM349g1 = null;
                            }
                            if (functionClassKindM349g1 == FunctionClassKind.Function) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                z14 = true;
                                abstractC5265xM14187f2 = null;
                            } else {
                                interfaceC8834eMo11235q2 = abstractC5257tMo11236c.mo11250X0().mo11235q();
                                if (interfaceC8834eMo11235q2 != null) {
                                    c7646cM14110g = DescriptorUtilsKt.m14110g(interfaceC8834eMo11235q2);
                                } else {
                                    c7646cM14110g = null;
                                }
                                z14 = true;
                                if (abstractC5257tMo11236c.mo11240V0().size() == 1) {
                                    abstractC5257tMo11236c2 = ((InterfaceC5246n0) C6752c.m13443k0(abstractC5257tMo11236c.mo11240V0())).mo11236c();
                                    C5207g.m11110e(abstractC5257tMo11236c2, "continuationArgumentType.arguments.single().type");
                                    interfaceC8838g = (InterfaceC8838g) obj2;
                                    if (!(interfaceC8838g instanceof InterfaceC6816a)) {
                                        interfaceC8838g = null;
                                    }
                                    interfaceC6816a = (InterfaceC6816a) interfaceC8838g;
                                    if (interfaceC6816a != null) {
                                        c7646cM14106c = DescriptorUtilsKt.m14106c(interfaceC6816a);
                                    } else {
                                        c7646cM14106c = null;
                                    }
                                    if (C5207g.m11106a(c7646cM14106c, C10557u.f52627a)) {
                                        abstractC5265xM14187f2 = m14132a(abstractC5265xM14187f2, abstractC5257tMo11236c2);
                                    } else {
                                        abstractC5265xM14187f2 = m14132a(abstractC5265xM14187f2, abstractC5257tMo11236c2);
                                    }
                                }
                            }
                        } else if (size != 1) {
                            z14 = true;
                            abstractC5265xM14187f2 = null;
                        } else {
                            InterfaceC5240k0 interfaceC5240k0Mo13600k2 = interfaceC5240k0M11913d.mo11234o().m13564w(size2).mo13600k();
                            C5207g.m11110e(interfaceC5240k0Mo13600k2, "functionTypeConstructor.…on(arity).typeConstructor");
                            abstractC5265xM14187f2 = KotlinTypeFactory.m14187f(c5238j0M14134f, interfaceC5240k0Mo13600k2, listM13453u0, z12, null);
                            z14 = true;
                        }
                        if (abstractC5265xM14187f2 == null) {
                            C5602h c5602h7 = C5602h.f34418a;
                            abstractC5265xM14187f = C5602h.m11914e(ErrorTypeKind.INCONSISTENT_SUSPEND_FUNCTION, listM13453u0, interfaceC5240k0M11913d, new String[0]);
                        } else {
                            abstractC5265xM14187f = abstractC5265xM14187f2;
                        }
                        protoBuf$TypeM13355a = null;
                        z11 = z14;
                    } else {
                        abstractC5265xM14187f = KotlinTypeFactory.m14187f(c5238j0M14134f, interfaceC5240k0M11913d, listM13453u0, protoBuf$Type.f39258e, null);
                        if (C0166e.m779z(C6732b.f37964b, protoBuf$Type.f39252L, "DEFINITELY_NOT_NULL_TYPE.get(proto.flags)")) {
                            c5237jM11271a = C5237j.a.m11271a(abstractC5265xM14187f, false);
                            if (c5237jM11271a == null) {
                                throw new IllegalStateException(("null DefinitelyNotNullType for '" + abstractC5265xM14187f + '\'').toString());
                            }
                            abstractC5265xM14187f = c5237jM11271a;
                        }
                        z11 = true;
                        protoBuf$TypeM13355a = null;
                    }
                } else if (C0166e.m779z(C6732b.f37963a, protoBuf$Type.f39252L, "SUSPEND_TYPE.get(proto.flags)")) {
                    z12 = protoBuf$Type.f39258e;
                    size = interfaceC5240k0M11913d.mo11260r().size() - listM13453u0.size();
                    if (size == 0) {
                        abstractC5265xM14187f2 = KotlinTypeFactory.m14187f(c5238j0M14134f, interfaceC5240k0M11913d, listM13453u0, z12, null);
                        interfaceC8834eMo11235q = abstractC5265xM14187f2.mo11250X0().mo11235q();
                        if (interfaceC8834eMo11235q != null) {
                            functionClassKindM349g1 = C0062b.m349g1(interfaceC8834eMo11235q);
                        } else {
                            functionClassKindM349g1 = null;
                        }
                        if (functionClassKindM349g1 == FunctionClassKind.Function) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            z14 = true;
                            abstractC5265xM14187f2 = null;
                        } else {
                            interfaceC8834eMo11235q2 = abstractC5257tMo11236c.mo11250X0().mo11235q();
                            if (interfaceC8834eMo11235q2 != null) {
                                c7646cM14110g = DescriptorUtilsKt.m14110g(interfaceC8834eMo11235q2);
                            } else {
                                c7646cM14110g = null;
                            }
                            z14 = true;
                            if (abstractC5257tMo11236c.mo11240V0().size() == 1) {
                                abstractC5257tMo11236c2 = ((InterfaceC5246n0) C6752c.m13443k0(abstractC5257tMo11236c.mo11240V0())).mo11236c();
                                C5207g.m11110e(abstractC5257tMo11236c2, "continuationArgumentType.arguments.single().type");
                                interfaceC8838g = (InterfaceC8838g) obj2;
                                if (!(interfaceC8838g instanceof InterfaceC6816a)) {
                                    interfaceC8838g = null;
                                }
                                interfaceC6816a = (InterfaceC6816a) interfaceC8838g;
                                if (interfaceC6816a != null) {
                                    c7646cM14106c = DescriptorUtilsKt.m14106c(interfaceC6816a);
                                } else {
                                    c7646cM14106c = null;
                                }
                                if (C5207g.m11106a(c7646cM14106c, C10557u.f52627a)) {
                                    abstractC5265xM14187f2 = m14132a(abstractC5265xM14187f2, abstractC5257tMo11236c2);
                                } else {
                                    abstractC5265xM14187f2 = m14132a(abstractC5265xM14187f2, abstractC5257tMo11236c2);
                                }
                            }
                        }
                    } else if (size != 1) {
                        z14 = true;
                        abstractC5265xM14187f2 = null;
                    } else {
                        InterfaceC5240k0 interfaceC5240k0Mo13600k3 = interfaceC5240k0M11913d.mo11234o().m13564w(size2).mo13600k();
                        C5207g.m11110e(interfaceC5240k0Mo13600k3, "functionTypeConstructor.…on(arity).typeConstructor");
                        abstractC5265xM14187f2 = KotlinTypeFactory.m14187f(c5238j0M14134f, interfaceC5240k0Mo13600k3, listM13453u0, z12, null);
                        z14 = true;
                    }
                    if (abstractC5265xM14187f2 == null) {
                        C5602h c5602h8 = C5602h.f34418a;
                        abstractC5265xM14187f = C5602h.m11914e(ErrorTypeKind.INCONSISTENT_SUSPEND_FUNCTION, listM13453u0, interfaceC5240k0M11913d, new String[0]);
                    } else {
                        abstractC5265xM14187f = abstractC5265xM14187f2;
                    }
                    protoBuf$TypeM13355a = null;
                    z11 = z14;
                } else {
                    abstractC5265xM14187f = KotlinTypeFactory.m14187f(c5238j0M14134f, interfaceC5240k0M11913d, listM13453u0, protoBuf$Type.f39258e, null);
                    if (C0166e.m779z(C6732b.f37964b, protoBuf$Type.f39252L, "DEFINITELY_NOT_NULL_TYPE.get(proto.flags)")) {
                        c5237jM11271a = C5237j.a.m11271a(abstractC5265xM14187f, false);
                        if (c5237jM11271a == null) {
                            throw new IllegalStateException(("null DefinitelyNotNullType for '" + abstractC5265xM14187f + '\'').toString());
                        }
                        abstractC5265xM14187f = c5237jM11271a;
                    }
                    z11 = true;
                    protoBuf$TypeM13355a = null;
                }
                c6735e = (C6735e) obj3;
                C5207g.m11111f(c6735e, "typeTable");
                i10 = protoBuf$Type.f39256c;
                if ((i10 & 1024) == 1024) {
                    z15 = z11;
                } else {
                    z15 = false;
                }
                if (z15) {
                    protoBuf$TypeM13355a = protoBuf$Type.f39250J;
                } else {
                    if ((i10 & 2048) != 2048) {
                        z11 = false;
                    }
                    if (z11) {
                        protoBuf$TypeM13355a = c6735e.m13355a(protoBuf$Type.f39251K);
                    }
                }
                if (protoBuf$TypeM13355a != null) {
                    abstractC5265xM14187f = C0062b.m423z2(abstractC5265xM14187f, m14138d(protoBuf$TypeM13355a, false));
                }
                if (protoBuf$Type.m13847z()) {
                    return ((C10544h) obj).f52596r.mo17692a(C7499b.m14896C((InterfaceC6733c) c8578t.f46000b, protoBuf$Type.f39262i), abstractC5265xM14187f);
                }
                return abstractC5265xM14187f;
            }
            next2 = it.next();
            i11 = i14 + 1;
            if (i14 >= 0) {
                C9000b.m17257w();
                throw null;
            }
            argument = (ProtoBuf$Type.Argument) next2;
            List<InterfaceC8847k0> listMo11260r2 = interfaceC5240k0M11913d.mo11260r();
            Iterator it4 = it;
            C5207g.m11110e(listMo11260r2, "constructor.parameters");
            interfaceC8847k0 = (InterfaceC8847k0) C6752c.m13426T(i14, listMo11260r2);
            projection = argument.f39270c;
            if (projection == ProtoBuf$Type.Argument.Projection.STAR) {
                C5207g.m11110e(projection, "typeArgumentProto.projection");
                i12 = C10555s.a.f52624d[projection.ordinal()];
                if (i12 != 1) {
                    variance = Variance.IN_VARIANCE;
                } else if (i12 != 2) {
                    variance = Variance.OUT_VARIANCE;
                } else {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: " + projection);
                    }
                    variance = Variance.INVARIANT;
                }
                c6735e2 = (C6735e) obj3;
                C5207g.m11111f(c6735e2, "typeTable");
                i13 = argument.f39269b;
                if ((i13 & 2) == 2) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (z16) {
                    protoBuf$TypeM13355a2 = argument.f39271d;
                } else {
                    if ((i13 & 4) == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (z17) {
                        protoBuf$TypeM13355a2 = c6735e2.m13355a(argument.f39272e);
                    } else {
                        protoBuf$TypeM13355a2 = null;
                    }
                }
                if (protoBuf$TypeM13355a2 == null) {
                    c5250p0 = new C5250p0(C5602h.m11912c(ErrorTypeKind.NO_RECORDED_TYPE, argument.toString()));
                } else {
                    c5250p0 = new C5250p0(m14139g(protoBuf$TypeM13355a2), variance);
                }
            } else if (interfaceC8847k0 == null) {
                c5250p0 = new C5222b0(((C10544h) obj).f52580b.mo11877o());
            } else {
                c5250p0 = new StarProjectionImpl(interfaceC8847k0);
            }
            arrayList.add(c5250p0);
            i14 = i11;
            it = it4;
        }
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC5257t m14139g(ProtoBuf$Type protoBuf$Type) {
        ProtoBuf$Type protoBuf$TypeM13355a;
        C5207g.m11111f(protoBuf$Type, "proto");
        boolean z10 = false;
        if (!((protoBuf$Type.f39256c & 2) == 2)) {
            return m14138d(protoBuf$Type, true);
        }
        C8578t c8578t = this.f39729a;
        String strMo13351a = ((InterfaceC6733c) c8578t.f46000b).mo13351a(protoBuf$Type.f39259f);
        AbstractC5265x abstractC5265xM14138d = m14138d(protoBuf$Type, true);
        C6735e c6735e = (C6735e) c8578t.f46002d;
        C5207g.m11111f(c6735e, "typeTable");
        int i10 = protoBuf$Type.f39256c;
        if ((i10 & 4) == 4) {
            protoBuf$TypeM13355a = protoBuf$Type.f39260g;
        } else {
            if ((i10 & 8) == 8) {
                z10 = true;
            }
            protoBuf$TypeM13355a = z10 ? c6735e.m13355a(protoBuf$Type.f39261h) : null;
        }
        C5207g.m11108c(protoBuf$TypeM13355a);
        return ((C10544h) c8578t.f45999a).f52588j.mo16775c(protoBuf$Type, strMo13351a, abstractC5265xM14138d, m14138d(protoBuf$TypeM13355a, true));
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f39731c);
        TypeDeserializer typeDeserializer = this.f39730b;
        if (typeDeserializer == null) {
            str = "";
        } else {
            str = ". Child of " + typeDeserializer.f39731c;
        }
        sb2.append(str);
        return sb2.toString();
    }
}
