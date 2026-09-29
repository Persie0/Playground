package kotlin.reflect.jvm.internal;

import cm.InterfaceC2041a;
import dm.C5207g;
import dm.C5209i;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import mn.C7648e;
import p247lm.C7396i;
import p247lm.C7398k;
import p372rm.InterfaceC8827a0;
import p372rm.InterfaceC8829b0;
import p372rm.InterfaceC8853n0;

/* JADX INFO: loaded from: classes2.dex */
public final class KParameterImpl implements KParameter {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f38234e = {C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(KParameterImpl.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(KParameterImpl.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* JADX INFO: renamed from: a */
    public final KCallableImpl<?> f38235a;

    /* JADX INFO: renamed from: b */
    public final int f38236b;

    /* JADX INFO: renamed from: c */
    public final KParameter.Kind f38237c;

    /* JADX INFO: renamed from: d */
    public final C7396i.a f38238d;

    public KParameterImpl(KCallableImpl<?> kCallableImpl, int i10, KParameter.Kind kind, InterfaceC2041a<? extends InterfaceC8827a0> interfaceC2041a) {
        C5207g.m11111f(kCallableImpl, "callable");
        C5207g.m11111f(kind, "kind");
        this.f38235a = kCallableImpl;
        this.f38236b = i10;
        this.f38237c = kind;
        this.f38238d = C7396i.m14785c(interfaceC2041a);
        C7396i.m14785c(new InterfaceC2041a<List<? extends Annotation>>() { // from class: kotlin.reflect.jvm.internal.KParameterImpl$annotations$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final List<? extends Annotation> mo807E() {
                KParameterImpl kParameterImpl = this.f38239b;
                kParameterImpl.getClass();
                InterfaceC6727j<Object> interfaceC6727j = KParameterImpl.f38234e[0];
                Object objMo807E = kParameterImpl.f38238d.mo807E();
                C5207g.m11110e(objMo807E, "<get-descriptor>(...)");
                return C7398k.m14791b((InterfaceC8827a0) objMo807E);
            }
        });
    }

    @Override // kotlin.reflect.KParameter
    /* JADX INFO: renamed from: a */
    public final String mo13483a() {
        InterfaceC6727j<Object> interfaceC6727j = f38234e[0];
        Object objMo807E = this.f38238d.mo807E();
        C5207g.m11110e(objMo807E, "<get-descriptor>(...)");
        InterfaceC8827a0 interfaceC8827a0 = (InterfaceC8827a0) objMo807E;
        InterfaceC8853n0 interfaceC8853n0 = interfaceC8827a0 instanceof InterfaceC8853n0 ? (InterfaceC8853n0) interfaceC8827a0 : null;
        if (interfaceC8853n0 == null || interfaceC8853n0.mo11876g().mo5278M()) {
            return null;
        }
        C7648e c7648eMo11874a = interfaceC8853n0.mo11874a();
        C5207g.m11110e(c7648eMo11874a, "valueParameter.name");
        if (c7648eMo11874a.f42087b) {
            return null;
        }
        return c7648eMo11874a.m15235f();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof KParameterImpl) {
            KParameterImpl kParameterImpl = (KParameterImpl) obj;
            if (C5207g.m11106a(this.f38235a, kParameterImpl.f38235a)) {
                if (this.f38236b == kParameterImpl.f38236b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.valueOf(this.f38236b).hashCode() + (this.f38235a.hashCode() * 31);
    }

    public final String toString() throws IOException {
        String strM13518b;
        DescriptorRendererImpl descriptorRendererImpl = ReflectionObjectRenderer.f38289a;
        StringBuilder sb2 = new StringBuilder();
        int i10 = ReflectionObjectRenderer.C6783a.f38290a[this.f38237c.ordinal()];
        if (i10 == 1) {
            sb2.append("extension receiver parameter");
        } else if (i10 == 2) {
            sb2.append("instance parameter");
        } else if (i10 == 3) {
            sb2.append("parameter #" + this.f38236b + ' ' + mo13483a());
        }
        sb2.append(" of ");
        CallableMemberDescriptor callableMemberDescriptorMo13488e = this.f38235a.mo13488e();
        if (callableMemberDescriptorMo13488e instanceof InterfaceC8829b0) {
            strM13518b = ReflectionObjectRenderer.m13519c((InterfaceC8829b0) callableMemberDescriptorMo13488e);
        } else {
            if (!(callableMemberDescriptorMo13488e instanceof InterfaceC6822c)) {
                throw new IllegalStateException(("Illegal callable: " + callableMemberDescriptorMo13488e).toString());
            }
            strM13518b = ReflectionObjectRenderer.m13518b((InterfaceC6822c) callableMemberDescriptorMo13488e);
        }
        sb2.append(strM13518b);
        String string = sb2.toString();
        C5207g.m11110e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
