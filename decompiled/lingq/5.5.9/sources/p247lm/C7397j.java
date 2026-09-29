package p247lm;

import bn.C1618b;
import bn.C1621e;
import bo.C1629g;
import bo.InterfaceC1624b;
import dm.C5207g;
import java.lang.reflect.Method;
import kotlin.reflect.jvm.internal.JvmFunctionSignature;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C6831a;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.C6993d;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import mn.C7645b;
import mn.C7646c;
import p123fn.InterfaceC5593a;
import p248ln.AbstractC7403d;
import p248ln.C7407h;
import p260m8.C7499b;
import p347qm.C8644a;
import p372rm.InterfaceC8829b0;
import p372rm.InterfaceC8831c0;
import p372rm.InterfaceC8833d0;
import p372rm.InterfaceC8837f0;
import p372rm.InterfaceC8838g;
import p420um.C9564e0;
import p491xm.AbstractC10238m;
import p491xm.C10237l;
import p491xm.C10240o;
import p491xm.C10243r;
import pn.C8412c;
import pn.C8413d;
import pn.C8414e;
import zm.C10533r;

/* JADX INFO: renamed from: lm.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C7397j {

    /* JADX INFO: renamed from: a */
    public static final C7645b f41210a = C7645b.m15203l(new C7646c("java.lang.Void"));

    /* JADX INFO: renamed from: a */
    public static JvmFunctionSignature.C6768c m14787a(InterfaceC6822c interfaceC6822c) {
        String strM13658a = SpecialBuiltinMembers.m13658a(interfaceC6822c);
        if (strM13658a == null) {
            if (interfaceC6822c instanceof InterfaceC8831c0) {
                String strM15235f = DescriptorUtilsKt.m14115l(interfaceC6822c).mo11874a().m15235f();
                C5207g.m11110e(strM15235f, "descriptor.propertyIfAccessor.name.asString()");
                strM13658a = C10533r.m19507a(strM15235f);
            } else if (interfaceC6822c instanceof InterfaceC8833d0) {
                String strM15235f2 = DescriptorUtilsKt.m14115l(interfaceC6822c).mo11874a().m15235f();
                C5207g.m11110e(strM15235f2, "descriptor.propertyIfAccessor.name.asString()");
                strM13658a = C10533r.m19508b(strM15235f2);
            } else {
                strM13658a = interfaceC6822c.mo11874a().m15235f();
                C5207g.m11110e(strM13658a, "descriptor.name.asString()");
            }
        }
        return new JvmFunctionSignature.C6768c(new AbstractC7403d.b(strM13658a, C7499b.m14957p(interfaceC6822c, 1)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static AbstractC7389b m14788b(InterfaceC8829b0 interfaceC8829b0) {
        C5207g.m11111f(interfaceC8829b0, "possiblyOverriddenProperty");
        InterfaceC8829b0 interfaceC8829b0Mo18004P0 = ((InterfaceC8829b0) C8413d.m16462u(interfaceC8829b0)).mo18004P0();
        C5207g.m11110e(interfaceC8829b0Mo18004P0, "unwrapFakeOverride(possi…rriddenProperty).original");
        Method method = null;
        if (interfaceC8829b0Mo18004P0 instanceof C1629g) {
            C1629g c1629g = (C1629g) interfaceC8829b0Mo18004P0;
            GeneratedMessageLite.C6985e<ProtoBuf$Property, JvmProtoBuf.JvmPropertySignature> c6985e = JvmProtoBuf.f39401d;
            C5207g.m11110e(c6985e, "propertySignature");
            ProtoBuf$Property protoBuf$Property = c1629g.f9155W;
            JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) C7499b.m14902F(protoBuf$Property, c6985e);
            if (jvmPropertySignature != null) {
                return new AbstractC7389b.c(interfaceC8829b0Mo18004P0, protoBuf$Property, jvmPropertySignature, c1629g.f9156X, c1629g.f9157Y);
            }
        } else if (interfaceC8829b0Mo18004P0 instanceof C1621e) {
            InterfaceC8837f0 interfaceC8837f0Mo11890j = ((C1621e) interfaceC8829b0Mo18004P0).mo11890j();
            InterfaceC5593a interfaceC5593a = interfaceC8837f0Mo11890j instanceof InterfaceC5593a ? (InterfaceC5593a) interfaceC8837f0Mo11890j : null;
            AbstractC10238m abstractC10238mMo11842b = interfaceC5593a != null ? interfaceC5593a.mo11842b() : null;
            if (abstractC10238mMo11842b instanceof C10240o) {
                return new AbstractC7389b.a(((C10240o) abstractC10238mMo11842b).f51671a);
            }
            if (!(abstractC10238mMo11842b instanceof C10243r)) {
                throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java field " + interfaceC8829b0Mo18004P0 + " (source = " + abstractC10238mMo11842b + ')');
            }
            Method method2 = ((C10243r) abstractC10238mMo11842b).f51673a;
            InterfaceC8833d0 interfaceC8833d0Mo11887g0 = interfaceC8829b0Mo18004P0.mo11887g0();
            InterfaceC8837f0 interfaceC8837f0Mo11890j2 = interfaceC8833d0Mo11887g0 != null ? interfaceC8833d0Mo11887g0.mo11890j() : null;
            InterfaceC5593a interfaceC5593a2 = interfaceC8837f0Mo11890j2 instanceof InterfaceC5593a ? (InterfaceC5593a) interfaceC8837f0Mo11890j2 : null;
            AbstractC10238m abstractC10238mMo11842b2 = interfaceC5593a2 != null ? interfaceC5593a2.mo11842b() : null;
            C10243r c10243r = abstractC10238mMo11842b2 instanceof C10243r ? (C10243r) abstractC10238mMo11842b2 : null;
            if (c10243r != null) {
                method = c10243r.f51673a;
            }
            return new AbstractC7389b.b(method2, method);
        }
        C9564e0 c9564e0Mo11888h = interfaceC8829b0Mo18004P0.mo11888h();
        C5207g.m11108c(c9564e0Mo11888h);
        JvmFunctionSignature.C6768c c6768cM14787a = m14787a(c9564e0Mo11888h);
        InterfaceC8833d0 interfaceC8833d0Mo11887g1 = interfaceC8829b0Mo18004P0.mo11887g0();
        JvmFunctionSignature.C6768c c6768cM14787a2 = method;
        if (interfaceC8833d0Mo11887g1 != null) {
            c6768cM14787a2 = m14787a(interfaceC8833d0Mo11887g1);
        }
        return new AbstractC7389b.d(c6768cM14787a, c6768cM14787a2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public static JvmFunctionSignature m14789c(InterfaceC6822c interfaceC6822c) {
        Method method;
        C5207g.m11111f(interfaceC6822c, "possiblySubstitutedFunction");
        InterfaceC6822c interfaceC6822cMo18004P0 = ((InterfaceC6822c) C8413d.m16462u(interfaceC6822c)).mo18004P0();
        C5207g.m11110e(interfaceC6822cMo18004P0, "unwrapFakeOverride(possi…titutedFunction).original");
        if (interfaceC6822cMo18004P0 instanceof InterfaceC1624b) {
            InterfaceC1624b interfaceC1624b = (InterfaceC1624b) interfaceC6822cMo18004P0;
            InterfaceC6997h interfaceC6997hMo5295K = interfaceC1624b.mo5295K();
            if (interfaceC6997hMo5295K instanceof ProtoBuf$Function) {
                C6993d c6993d = C7407h.f41229a;
                AbstractC7403d.b bVarM14809c = C7407h.m14809c((ProtoBuf$Function) interfaceC6997hMo5295K, interfaceC1624b.mo5298h0(), interfaceC1624b.mo5297a0());
                if (bVarM14809c != null) {
                    return new JvmFunctionSignature.C6768c(bVarM14809c);
                }
            }
            if (interfaceC6997hMo5295K instanceof ProtoBuf$Constructor) {
                C6993d c6993d2 = C7407h.f41229a;
                AbstractC7403d.b bVarM14807a = C7407h.m14807a((ProtoBuf$Constructor) interfaceC6997hMo5295K, interfaceC1624b.mo5298h0(), interfaceC1624b.mo5297a0());
                if (bVarM14807a != null) {
                    InterfaceC8838g interfaceC8838gMo11876g = interfaceC6822c.mo11876g();
                    C5207g.m11110e(interfaceC8838gMo11876g, "possiblySubstitutedFunction.containingDeclaration");
                    return C8414e.m16465b(interfaceC8838gMo11876g) ? new JvmFunctionSignature.C6768c(bVarM14807a) : new JvmFunctionSignature.C6767b(bVarM14807a);
                }
            }
            return m14787a(interfaceC6822cMo18004P0);
        }
        if (interfaceC6822cMo18004P0 instanceof JavaMethodDescriptor) {
            InterfaceC8837f0 interfaceC8837f0Mo11890j = ((JavaMethodDescriptor) interfaceC6822cMo18004P0).mo11890j();
            InterfaceC5593a interfaceC5593a = interfaceC8837f0Mo11890j instanceof InterfaceC5593a ? (InterfaceC5593a) interfaceC8837f0Mo11890j : null;
            AbstractC10238m abstractC10238mMo11842b = interfaceC5593a != null ? interfaceC5593a.mo11842b() : null;
            C10243r c10243r = abstractC10238mMo11842b instanceof C10243r ? (C10243r) abstractC10238mMo11842b : null;
            if (c10243r != null && (method = c10243r.f51673a) != null) {
                return new JvmFunctionSignature.C6766a(method);
            }
            throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java method " + interfaceC6822cMo18004P0);
        }
        if (interfaceC6822cMo18004P0 instanceof C1618b) {
            InterfaceC8837f0 interfaceC8837f0Mo11890j2 = ((C1618b) interfaceC6822cMo18004P0).mo11890j();
            InterfaceC5593a interfaceC5593a2 = interfaceC8837f0Mo11890j2 instanceof InterfaceC5593a ? (InterfaceC5593a) interfaceC8837f0Mo11890j2 : null;
            AbstractC10238m abstractC10238mMo11842b2 = interfaceC5593a2 != null ? interfaceC5593a2.mo11842b() : null;
            if (abstractC10238mMo11842b2 instanceof C10237l) {
                return new JvmFunctionSignature.JavaConstructor(((C10237l) abstractC10238mMo11842b2).f51669a);
            }
            if (abstractC10238mMo11842b2 instanceof C6831a) {
                C6831a c6831a = (C6831a) abstractC10238mMo11842b2;
                if (c6831a.mo12256t()) {
                    return new JvmFunctionSignature.FakeJavaAnnotationConstructor(c6831a.f38594a);
                }
            }
            throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java constructor " + interfaceC6822cMo18004P0 + " (" + abstractC10238mMo11842b2 + ')');
        }
        boolean z10 = false;
        if ((interfaceC6822cMo18004P0.mo11874a().equals(C6797e.f38336b) && C8412c.m16441j(interfaceC6822cMo18004P0)) == true) {
            z10 = true;
        } else {
            if ((interfaceC6822cMo18004P0.mo11874a().equals(C6797e.f38335a) && C8412c.m16441j(interfaceC6822cMo18004P0)) == true) {
                z10 = true;
            } else if (C5207g.m11106a(interfaceC6822cMo18004P0.mo11874a(), C8644a.f46199e) && interfaceC6822cMo18004P0.mo11889i().isEmpty()) {
                z10 = true;
            }
        }
        if (z10) {
            return m14787a(interfaceC6822cMo18004P0);
        }
        throw new KotlinReflectionInternalError("Unknown origin of " + interfaceC6822cMo18004P0 + " (" + interfaceC6822cMo18004P0.getClass() + ')');
    }
}
