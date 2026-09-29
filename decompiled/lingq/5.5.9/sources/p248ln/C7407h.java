package p248ln;

import ae.C0062b;
import dm.C5207g;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kn.C6732b;
import kn.C6735e;
import kn.InterfaceC6733c;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6991b;
import kotlin.reflect.jvm.internal.impl.protobuf.C6992c;
import kotlin.reflect.jvm.internal.impl.protobuf.C6993d;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p260m8.C7499b;
import p385sf.C9000b;
import tl.C9325m;

/* JADX INFO: renamed from: ln.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C7407h {

    /* JADX INFO: renamed from: a */
    public static final C6993d f41229a;

    static {
        C6993d c6993d = new C6993d();
        c6993d.m13958a(JvmProtoBuf.f39398a);
        c6993d.m13958a(JvmProtoBuf.f39399b);
        c6993d.m13958a(JvmProtoBuf.f39400c);
        c6993d.m13958a(JvmProtoBuf.f39401d);
        c6993d.m13958a(JvmProtoBuf.f39402e);
        c6993d.m13958a(JvmProtoBuf.f39403f);
        c6993d.m13958a(JvmProtoBuf.f39404g);
        c6993d.m13958a(JvmProtoBuf.f39405h);
        c6993d.m13958a(JvmProtoBuf.f39406i);
        c6993d.m13958a(JvmProtoBuf.f39407j);
        c6993d.m13958a(JvmProtoBuf.f39408k);
        c6993d.m13958a(JvmProtoBuf.f39409l);
        c6993d.m13958a(JvmProtoBuf.f39410m);
        c6993d.m13958a(JvmProtoBuf.f39411n);
        f41229a = c6993d;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0057  */
    /* JADX WARN: Code duplicated, block: B:21:0x0076  */
    /* JADX WARN: Code duplicated, block: B:25:0x0092 A[LOOP:0: B:19:0x0070->B:25:0x0092, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x008e A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static AbstractC7403d.b m14807a(ProtoBuf$Constructor protoBuf$Constructor, InterfaceC6733c interfaceC6733c, C6735e c6735e) {
        String strMo13351a;
        ArrayList arrayList;
        String strM13430X;
        String strM14811e;
        C5207g.m11111f(protoBuf$Constructor, "proto");
        C5207g.m11111f(interfaceC6733c, "nameResolver");
        C5207g.m11111f(c6735e, "typeTable");
        GeneratedMessageLite.C6985e<ProtoBuf$Constructor, JvmProtoBuf.JvmMethodSignature> c6985e = JvmProtoBuf.f39398a;
        C5207g.m11110e(c6985e, "constructorSignature");
        JvmProtoBuf.JvmMethodSignature jvmMethodSignature = (JvmProtoBuf.JvmMethodSignature) C7499b.m14902F(protoBuf$Constructor, c6985e);
        if (jvmMethodSignature == null) {
            strMo13351a = "<init>";
        } else if ((jvmMethodSignature.f39426b & 1) == 1) {
            strMo13351a = interfaceC6733c.mo13351a(jvmMethodSignature.f39427c);
        } else {
            strMo13351a = "<init>";
        }
        if (jvmMethodSignature == null) {
            List<ProtoBuf$ValueParameter> list = protoBuf$Constructor.f39052e;
            C5207g.m11110e(list, "proto.valueParameterList");
            arrayList = new ArrayList(C9325m.m17681z(list, 10));
            for (ProtoBuf$ValueParameter protoBuf$ValueParameter : list) {
                C5207g.m11110e(protoBuf$ValueParameter, "it");
                strM14811e = m14811e(C0062b.m407v2(protoBuf$ValueParameter, c6735e), interfaceC6733c);
                if (strM14811e == null) {
                    return null;
                }
                arrayList.add(strM14811e);
            }
            strM13430X = C6752c.m13430X(arrayList, "", "(", ")V", null, 56);
        } else {
            if ((jvmMethodSignature.f39426b & 2) == 2) {
                strM13430X = interfaceC6733c.mo13351a(jvmMethodSignature.f39428d);
            } else {
                List<ProtoBuf$ValueParameter> list2 = protoBuf$Constructor.f39052e;
                C5207g.m11110e(list2, "proto.valueParameterList");
                arrayList = new ArrayList(C9325m.m17681z(list2, 10));
                while (r12.hasNext()) {
                    C5207g.m11110e(protoBuf$ValueParameter, "it");
                    strM14811e = m14811e(C0062b.m407v2(protoBuf$ValueParameter, c6735e), interfaceC6733c);
                    if (strM14811e == null) {
                        return null;
                    }
                    arrayList.add(strM14811e);
                }
                strM13430X = C6752c.m13430X(arrayList, "", "(", ")V", null, 56);
            }
        }
        return new AbstractC7403d.b(strMo13351a, strM13430X);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Code duplicated, block: B:33:0x007d A[RETURN] */
    /* JADX INFO: renamed from: b */
    public static AbstractC7403d.a m14808b(ProtoBuf$Property protoBuf$Property, InterfaceC6733c interfaceC6733c, C6735e c6735e, boolean z10) {
        int i10;
        String strM14811e;
        C5207g.m11111f(protoBuf$Property, "proto");
        C5207g.m11111f(interfaceC6733c, "nameResolver");
        C5207g.m11111f(c6735e, "typeTable");
        GeneratedMessageLite.C6985e<ProtoBuf$Property, JvmProtoBuf.JvmPropertySignature> c6985e = JvmProtoBuf.f39401d;
        C5207g.m11110e(c6985e, "propertySignature");
        JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) C7499b.m14902F(protoBuf$Property, c6985e);
        if (jvmPropertySignature == null) {
            return null;
        }
        JvmProtoBuf.JvmFieldSignature jvmFieldSignature = (jvmPropertySignature.f39437b & 1) == 1 ? jvmPropertySignature.f39438c : null;
        if (jvmFieldSignature == null && z10) {
            return null;
        }
        if (jvmFieldSignature == null) {
            i10 = protoBuf$Property.f39195f;
        } else {
            if ((jvmFieldSignature.f39415b & 1) == 1) {
                i10 = jvmFieldSignature.f39416c;
            } else {
                i10 = protoBuf$Property.f39195f;
            }
        }
        if (jvmFieldSignature == null) {
            strM14811e = m14811e(C0062b.m314U1(protoBuf$Property, c6735e), interfaceC6733c);
            if (strM14811e == null) {
                return null;
            }
        } else {
            if ((jvmFieldSignature.f39415b & 2) == 2) {
                strM14811e = interfaceC6733c.mo13351a(jvmFieldSignature.f39417d);
            } else {
                strM14811e = m14811e(C0062b.m314U1(protoBuf$Property, c6735e), interfaceC6733c);
                if (strM14811e == null) {
                    return null;
                }
            }
        }
        return new AbstractC7403d.a(interfaceC6733c.mo13351a(i10), strM14811e);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x0051  */
    /* JADX WARN: Code duplicated, block: B:21:0x007a A[LOOP:0: B:19:0x0074->B:21:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:28:0x00bb A[LOOP:1: B:23:0x00a2->B:28:0x00bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x00cb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ba A[SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static AbstractC7403d.b m14809c(ProtoBuf$Function protoBuf$Function, InterfaceC6733c interfaceC6733c, C6735e c6735e) {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        String strM14811e;
        String strConcat;
        String strM14811e2;
        C5207g.m11111f(protoBuf$Function, "proto");
        C5207g.m11111f(interfaceC6733c, "nameResolver");
        C5207g.m11111f(c6735e, "typeTable");
        GeneratedMessageLite.C6985e<ProtoBuf$Function, JvmProtoBuf.JvmMethodSignature> c6985e = JvmProtoBuf.f39399b;
        C5207g.m11110e(c6985e, "methodSignature");
        JvmProtoBuf.JvmMethodSignature jvmMethodSignature = (JvmProtoBuf.JvmMethodSignature) C7499b.m14902F(protoBuf$Function, c6985e);
        if (jvmMethodSignature == null) {
            i10 = protoBuf$Function.f39127f;
        } else if ((jvmMethodSignature.f39426b & 1) == 1) {
            i10 = jvmMethodSignature.f39427c;
        } else {
            i10 = protoBuf$Function.f39127f;
        }
        if (jvmMethodSignature == null) {
            List listM17253s = C9000b.m17253s(C0062b.m290M1(protoBuf$Function, c6735e));
            List<ProtoBuf$ValueParameter> list = protoBuf$Function.f39117J;
            C5207g.m11110e(list, "proto.valueParameterList");
            arrayList = new ArrayList(C9325m.m17681z(list, 10));
            for (ProtoBuf$ValueParameter protoBuf$ValueParameter : list) {
                C5207g.m11110e(protoBuf$ValueParameter, "it");
                arrayList.add(C0062b.m407v2(protoBuf$ValueParameter, c6735e));
            }
            ArrayList arrayListM13438f0 = C6752c.m13438f0(arrayList, listM17253s);
            arrayList2 = new ArrayList(C9325m.m17681z(arrayListM13438f0, 10));
            it = arrayListM13438f0.iterator();
            while (it.hasNext()) {
                strM14811e2 = m14811e((ProtoBuf$Type) it.next(), interfaceC6733c);
                if (strM14811e2 == null) {
                    return null;
                }
                arrayList2.add(strM14811e2);
            }
            strM14811e = m14811e(C0062b.m311T1(protoBuf$Function, c6735e), interfaceC6733c);
            if (strM14811e == null) {
                return null;
            }
            strConcat = C6752c.m13430X(arrayList2, "", "(", ")", null, 56).concat(strM14811e);
        } else {
            if ((jvmMethodSignature.f39426b & 2) == 2) {
                strConcat = interfaceC6733c.mo13351a(jvmMethodSignature.f39428d);
            } else {
                List listM17253s2 = C9000b.m17253s(C0062b.m290M1(protoBuf$Function, c6735e));
                List<ProtoBuf$ValueParameter> list2 = protoBuf$Function.f39117J;
                C5207g.m11110e(list2, "proto.valueParameterList");
                arrayList = new ArrayList(C9325m.m17681z(list2, 10));
                while (r1.hasNext()) {
                    C5207g.m11110e(protoBuf$ValueParameter, "it");
                    arrayList.add(C0062b.m407v2(protoBuf$ValueParameter, c6735e));
                }
                ArrayList arrayListM13438f1 = C6752c.m13438f0(arrayList, listM17253s2);
                arrayList2 = new ArrayList(C9325m.m17681z(arrayListM13438f1, 10));
                it = arrayListM13438f1.iterator();
                while (it.hasNext()) {
                    strM14811e2 = m14811e((ProtoBuf$Type) it.next(), interfaceC6733c);
                    if (strM14811e2 == null) {
                        return null;
                    }
                    arrayList2.add(strM14811e2);
                }
                strM14811e = m14811e(C0062b.m311T1(protoBuf$Function, c6735e), interfaceC6733c);
                if (strM14811e == null) {
                    return null;
                }
                strConcat = C6752c.m13430X(arrayList2, "", "(", ")", null, 56).concat(strM14811e);
            }
        }
        return new AbstractC7403d.b(interfaceC6733c.mo13351a(i10), strConcat);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m14810d(ProtoBuf$Property protoBuf$Property) {
        C5207g.m11111f(protoBuf$Property, "proto");
        C6732b.a aVar = C7402c.f41217a;
        C6732b.a aVar2 = C7402c.f41217a;
        Object objM13921r = protoBuf$Property.m13921r(JvmProtoBuf.f39402e);
        C5207g.m11110e(objM13921r, "proto.getExtension(JvmProtoBuf.flags)");
        Boolean boolM13346c = aVar2.m13346c(((Number) objM13921r).intValue());
        C5207g.m11110e(boolM13346c, "JvmFlags.IS_MOVED_FROM_I…nsion(JvmProtoBuf.flags))");
        return boolM13346c.booleanValue();
    }

    /* JADX INFO: renamed from: e */
    public static String m14811e(ProtoBuf$Type protoBuf$Type, InterfaceC6733c interfaceC6733c) {
        if (protoBuf$Type.m13847z()) {
            return C7401b.m14802b(interfaceC6733c.mo13352b(protoBuf$Type.f39262i));
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static final Pair<C7405f, ProtoBuf$Class> m14812f(String[] strArr, String[] strArr2) throws InvalidProtocolBufferException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(C7400a.m14800b(strArr));
        C7405f c7405fM14813g = m14813g(byteArrayInputStream, strArr2);
        ProtoBuf$Class.C6915a c6915a = ProtoBuf$Class.f38987f0;
        c6915a.getClass();
        C6992c c6992c = new C6992c(byteArrayInputStream);
        InterfaceC6997h interfaceC6997h = (InterfaceC6997h) c6915a.mo13787a(c6992c, f41229a);
        try {
            c6992c.m13939a(0);
            AbstractC6991b.m13937b(interfaceC6997h);
            return new Pair<>(c7405fM14813g, (ProtoBuf$Class) interfaceC6997h);
        } catch (InvalidProtocolBufferException e10) {
            e10.f39506a = interfaceC6997h;
            throw e10;
        }
    }

    /* JADX INFO: renamed from: g */
    public static C7405f m14813g(ByteArrayInputStream byteArrayInputStream, String[] strArr) {
        JvmProtoBuf.StringTableTypes stringTableTypes = (JvmProtoBuf.StringTableTypes) JvmProtoBuf.StringTableTypes.f39452h.m13938c(byteArrayInputStream, f41229a);
        C5207g.m11110e(stringTableTypes, "parseDelimitedFrom(this, EXTENSION_REGISTRY)");
        return new C7405f(stringTableTypes, strArr);
    }

    /* JADX INFO: renamed from: h */
    public static final Pair<C7405f, ProtoBuf$Package> m14814h(String[] strArr, String[] strArr2) throws InvalidProtocolBufferException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(C7400a.m14800b(strArr));
        C7405f c7405fM14813g = m14813g(byteArrayInputStream, strArr2);
        ProtoBuf$Package.C6934a c6934a = ProtoBuf$Package.f39150l;
        c6934a.getClass();
        C6992c c6992c = new C6992c(byteArrayInputStream);
        InterfaceC6997h interfaceC6997h = (InterfaceC6997h) c6934a.mo13787a(c6992c, f41229a);
        try {
            c6992c.m13939a(0);
            AbstractC6991b.m13937b(interfaceC6997h);
            return new Pair<>(c7405fM14813g, (ProtoBuf$Package) interfaceC6997h);
        } catch (InvalidProtocolBufferException e10) {
            e10.f39506a = interfaceC6997h;
            throw e10;
        }
    }
}
