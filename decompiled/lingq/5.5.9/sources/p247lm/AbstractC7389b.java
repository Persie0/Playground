package p247lm;

import bo.C1629g;
import bo.InterfaceC1626d;
import dm.C5207g;
import in.C6363g;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kn.C6735e;
import kn.InterfaceC6733c;
import kotlin.reflect.jvm.internal.C6791d;
import kotlin.reflect.jvm.internal.JvmFunctionSignature;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.text.C7076b;
import mn.C7648e;
import mn.C7649f;
import p248ln.AbstractC7403d;
import p248ln.C7407h;
import p260m8.C7499b;
import p372rm.C8850m;
import p372rm.InterfaceC8829b0;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8865w;
import zm.C10533r;

/* JADX INFO: renamed from: lm.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7389b {

    /* JADX INFO: renamed from: lm.b$a */
    public static final class a extends AbstractC7389b {

        /* JADX INFO: renamed from: a */
        public final Field f41191a;

        public a(Field field) {
            C5207g.m11111f(field, "field");
            this.f41191a = field;
        }

        @Override // p247lm.AbstractC7389b
        /* JADX INFO: renamed from: a */
        public final String mo14781a() {
            StringBuilder sb2 = new StringBuilder();
            Field field = this.f41191a;
            String name = field.getName();
            C5207g.m11110e(name, "field.name");
            sb2.append(C10533r.m19507a(name));
            sb2.append("()");
            Class<?> type = field.getType();
            C5207g.m11110e(type, "field.type");
            sb2.append(ReflectClassUtilKt.m13649b(type));
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: lm.b$b */
    public static final class b extends AbstractC7389b {

        /* JADX INFO: renamed from: a */
        public final Method f41192a;

        /* JADX INFO: renamed from: b */
        public final Method f41193b;

        public b(Method method, Method method2) {
            C5207g.m11111f(method, "getterMethod");
            this.f41192a = method;
            this.f41193b = method2;
        }

        @Override // p247lm.AbstractC7389b
        /* JADX INFO: renamed from: a */
        public final String mo14781a() {
            return C6791d.m13526a(this.f41192a);
        }
    }

    /* JADX INFO: renamed from: lm.b$c */
    public static final class c extends AbstractC7389b {

        /* JADX INFO: renamed from: a */
        public final InterfaceC8829b0 f41194a;

        /* JADX INFO: renamed from: b */
        public final ProtoBuf$Property f41195b;

        /* JADX INFO: renamed from: c */
        public final JvmProtoBuf.JvmPropertySignature f41196c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC6733c f41197d;

        /* JADX INFO: renamed from: e */
        public final C6735e f41198e;

        /* JADX INFO: renamed from: f */
        public final String f41199f;

        /* JADX WARN: Code duplicated, block: B:29:0x0119  */
        public c(InterfaceC8829b0 interfaceC8829b0, ProtoBuf$Property protoBuf$Property, JvmProtoBuf.JvmPropertySignature jvmPropertySignature, InterfaceC6733c interfaceC6733c, C6735e c6735e) {
            String string;
            String string2;
            String strMo13351a;
            C5207g.m11111f(protoBuf$Property, "proto");
            C5207g.m11111f(interfaceC6733c, "nameResolver");
            C5207g.m11111f(c6735e, "typeTable");
            this.f41194a = interfaceC8829b0;
            this.f41195b = protoBuf$Property;
            this.f41196c = jvmPropertySignature;
            this.f41197d = interfaceC6733c;
            this.f41198e = c6735e;
            if ((jvmPropertySignature.f39437b & 4) == 4) {
                string2 = interfaceC6733c.mo13351a(jvmPropertySignature.f39440e.f39427c) + interfaceC6733c.mo13351a(jvmPropertySignature.f39440e.f39428d);
            } else {
                AbstractC7403d.a aVarM14808b = C7407h.m14808b(protoBuf$Property, interfaceC6733c, c6735e, true);
                if (aVarM14808b == null) {
                    throw new KotlinReflectionInternalError("No field signature for property: " + interfaceC8829b0);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(C10533r.m19507a(aVarM14808b.f41218a));
                InterfaceC8838g interfaceC8838gMo11876g = interfaceC8829b0.mo11876g();
                C5207g.m11110e(interfaceC8838gMo11876g, "descriptor.containingDeclaration");
                if (C5207g.m11106a(interfaceC8829b0.mo11886f(), C8850m.f46737d) && (interfaceC8838gMo11876g instanceof DeserializedClassDescriptor)) {
                    GeneratedMessageLite.C6985e<ProtoBuf$Class, Integer> c6985e = JvmProtoBuf.f39406i;
                    C5207g.m11110e(c6985e, "classModuleName");
                    Integer num = (Integer) C7499b.m14902F(((DeserializedClassDescriptor) interfaceC8838gMo11876g).f39762e, c6985e);
                    string = "$".concat(C7649f.f42088a.m14272c((num == null || (strMo13351a = interfaceC6733c.mo13351a(num.intValue())) == null) ? "main" : strMo13351a, "_"));
                } else if (C5207g.m11106a(interfaceC8829b0.mo11886f(), C8850m.f46734a) && (interfaceC8838gMo11876g instanceof InterfaceC8865w)) {
                    InterfaceC1626d interfaceC1626d = ((C1629g) interfaceC8829b0).f9159a0;
                    if (interfaceC1626d instanceof C6363g) {
                        C6363g c6363g = (C6363g) interfaceC1626d;
                        if (c6363g.f36741c != null) {
                            StringBuilder sb3 = new StringBuilder("$");
                            String strM18067e = c6363g.f36740b.m18067e();
                            C5207g.m11110e(strM18067e, "className.internalName");
                            sb3.append(C7648e.m15232l(C7076b.m14304x3(strM18067e, '/', strM18067e)).m15235f());
                            string = sb3.toString();
                        } else {
                            string = "";
                        }
                    } else {
                        string = "";
                    }
                } else {
                    string = "";
                }
                sb2.append(string);
                sb2.append("()");
                sb2.append(aVarM14808b.f41219b);
                string2 = sb2.toString();
            }
            this.f41199f = string2;
        }

        @Override // p247lm.AbstractC7389b
        /* JADX INFO: renamed from: a */
        public final String mo14781a() {
            return this.f41199f;
        }
    }

    /* JADX INFO: renamed from: lm.b$d */
    public static final class d extends AbstractC7389b {

        /* JADX INFO: renamed from: a */
        public final JvmFunctionSignature.C6768c f41200a;

        /* JADX INFO: renamed from: b */
        public final JvmFunctionSignature.C6768c f41201b;

        public d(JvmFunctionSignature.C6768c c6768c, JvmFunctionSignature.C6768c c6768c2) {
            this.f41200a = c6768c;
            this.f41201b = c6768c2;
        }

        @Override // p247lm.AbstractC7389b
        /* JADX INFO: renamed from: a */
        public final String mo14781a() {
            return this.f41200a.f38141b;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract String mo14781a();
}
