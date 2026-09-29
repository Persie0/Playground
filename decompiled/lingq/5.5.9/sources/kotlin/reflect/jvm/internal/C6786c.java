package kotlin.reflect.jvm.internal;

import cm.InterfaceC2052l;
import dm.C5207g;
import dm.C5210j;
import dm.InterfaceC5205e;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.List;
import km.InterfaceC6719b;
import km.InterfaceC6721d;
import km.InterfaceC6722e;
import km.InterfaceC6723f;
import km.InterfaceC6724g;
import km.InterfaceC6725h;
import km.InterfaceC6726i;
import kotlin.collections.C6752c;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference2;
import kotlin.reflect.jvm.C6764a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.pcollections.C7071a;
import p247lm.C7391d;
import p247lm.C7398k;
import p372rm.InterfaceC8853n0;
import p543do.AbstractC5257t;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.c */
/* JADX INFO: loaded from: classes2.dex */
public class C6786c extends C5210j {
    /* JADX INFO: renamed from: j */
    public static KDeclarationContainerImpl m13521j(CallableReference callableReference) {
        InterfaceC6721d interfaceC6721dMo13479d = callableReference.mo13479d();
        return interfaceC6721dMo13479d instanceof KDeclarationContainerImpl ? (KDeclarationContainerImpl) interfaceC6721dMo13479d : C6784a.f38294b;
    }

    @Override // dm.C5210j
    /* JADX INFO: renamed from: a */
    public final InterfaceC6722e mo11121a(FunctionReference functionReference) {
        KDeclarationContainerImpl kDeclarationContainerImplM13521j = m13521j(functionReference);
        String strMo13336a = functionReference.mo13336a();
        String strMo13480e = functionReference.mo13480e();
        Object obj = functionReference.f38112b;
        C5207g.m11111f(kDeclarationContainerImplM13521j, "container");
        C5207g.m11111f(strMo13336a, "name");
        C5207g.m11111f(strMo13480e, "signature");
        return new KFunctionImpl(kDeclarationContainerImplM13521j, strMo13336a, strMo13480e, null, obj);
    }

    @Override // dm.C5210j
    /* JADX INFO: renamed from: b */
    public final InterfaceC6719b mo11122b(Class cls) {
        C7071a<String, Object> c7071a = C7391d.f41202a;
        C5207g.m11111f(cls, "jClass");
        String name = cls.getName();
        Object objM14246a = C7391d.f41202a.m14246a(name);
        if (objM14246a instanceof WeakReference) {
            KClassImpl kClassImpl = (KClassImpl) ((WeakReference) objM14246a).get();
            if (C5207g.m11106a(kClassImpl != null ? kClassImpl.f38153b : null, cls)) {
                return kClassImpl;
            }
        } else if (objM14246a != null) {
            for (WeakReference weakReference : (WeakReference[]) objM14246a) {
                KClassImpl kClassImpl2 = (KClassImpl) weakReference.get();
                if (C5207g.m11106a(kClassImpl2 != null ? kClassImpl2.f38153b : null, cls)) {
                    return kClassImpl2;
                }
            }
            int length = ((Object[]) objM14246a).length;
            WeakReference[] weakReferenceArr = new WeakReference[length + 1];
            System.arraycopy(objM14246a, 0, weakReferenceArr, 0, length);
            KClassImpl kClassImpl3 = new KClassImpl(cls);
            weakReferenceArr[length] = new WeakReference(kClassImpl3);
            C7391d.f41202a = C7391d.f41202a.m14247b(name, weakReferenceArr);
            return kClassImpl3;
        }
        KClassImpl kClassImpl4 = new KClassImpl(cls);
        C7391d.f41202a = C7391d.f41202a.m14247b(name, new WeakReference(kClassImpl4));
        return kClassImpl4;
    }

    @Override // dm.C5210j
    /* JADX INFO: renamed from: c */
    public final InterfaceC6721d mo11123c(Class cls, String str) {
        return new KPackageImpl(cls);
    }

    @Override // dm.C5210j
    /* JADX INFO: renamed from: d */
    public final InterfaceC6723f mo11124d(MutablePropertyReference1 mutablePropertyReference1) {
        return new KMutableProperty1Impl(m13521j(mutablePropertyReference1), mutablePropertyReference1.f38114d, mutablePropertyReference1.f38115e, mutablePropertyReference1.f38112b);
    }

    @Override // dm.C5210j
    /* JADX INFO: renamed from: e */
    public final InterfaceC6724g mo11125e(PropertyReference0 propertyReference0) {
        return new KProperty0Impl(m13521j(propertyReference0), propertyReference0.f38114d, propertyReference0.f38115e, propertyReference0.f38112b);
    }

    @Override // dm.C5210j
    /* JADX INFO: renamed from: f */
    public final InterfaceC6725h mo11126f(PropertyReference1 propertyReference1) {
        return new KProperty1Impl(m13521j(propertyReference1), propertyReference1.f38114d, propertyReference1.f38115e, propertyReference1.f38112b);
    }

    @Override // dm.C5210j
    /* JADX INFO: renamed from: g */
    public final InterfaceC6726i mo11127g(PropertyReference2 propertyReference2) {
        return new KProperty2Impl(m13521j(propertyReference2), propertyReference2.f38114d, propertyReference2.f38115e);
    }

    @Override // dm.C5210j
    /* JADX INFO: renamed from: h */
    public final String mo11128h(InterfaceC5205e interfaceC5205e) throws IOException {
        KFunctionImpl kFunctionImplM14790a;
        KFunctionImpl kFunctionImplM13484a = C6764a.m13484a(interfaceC5205e);
        if (kFunctionImplM13484a == null || (kFunctionImplM14790a = C7398k.m14790a(kFunctionImplM13484a)) == null) {
            return super.mo11128h(interfaceC5205e);
        }
        DescriptorRendererImpl descriptorRendererImpl = ReflectionObjectRenderer.f38289a;
        InterfaceC6822c interfaceC6822cM13508j = kFunctionImplM14790a.mo13488e();
        StringBuilder sb2 = new StringBuilder();
        ReflectionObjectRenderer.m13517a(sb2, interfaceC6822cM13508j);
        List<InterfaceC8853n0> listMo11889i = interfaceC6822cM13508j.mo11889i();
        C5207g.m11110e(listMo11889i, "invoke.valueParameters");
        C6752c.m13429W(listMo11889i, sb2, ", ", "(", ")", new InterfaceC2052l<InterfaceC8853n0, CharSequence>() { // from class: kotlin.reflect.jvm.internal.ReflectionObjectRenderer$renderLambda$1$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final CharSequence mo528n(InterfaceC8853n0 interfaceC8853n0) {
                DescriptorRendererImpl descriptorRendererImpl2 = ReflectionObjectRenderer.f38289a;
                AbstractC5257t abstractC5257tMo11884c = interfaceC8853n0.mo11884c();
                C5207g.m11110e(abstractC5257tMo11884c, "it.type");
                return ReflectionObjectRenderer.m13520d(abstractC5257tMo11884c);
            }
        }, 48);
        sb2.append(" -> ");
        AbstractC5257t abstractC5257tMo11900y = interfaceC6822cM13508j.mo11900y();
        C5207g.m11108c(abstractC5257tMo11900y);
        sb2.append(ReflectionObjectRenderer.m13520d(abstractC5257tMo11900y));
        String string = sb2.toString();
        C5207g.m11110e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // dm.C5210j
    /* JADX INFO: renamed from: i */
    public final String mo11129i(Lambda lambda) {
        return mo11128h(lambda);
    }
}
