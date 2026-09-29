package io;

import dm.C5207g;
import java.util.List;
import kotlin.collections.C6752c;
import kotlin.reflect.jvm.internal.impl.builtins.C6796d;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8847k0;
import p372rm.InterfaceC8853n0;
import p372rm.InterfaceC8863u;
import p385sf.C9000b;
import p543do.AbstractC5257t;
import p543do.AbstractC5265x;
import p543do.C5238j0;
import p543do.C5258t0;

/* JADX INFO: renamed from: io.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C6381h implements InterfaceC6378e {

    /* JADX INFO: renamed from: a */
    public static final C6381h f36784a = new C6381h();

    @Override // io.InterfaceC6378e
    /* JADX INFO: renamed from: a */
    public final String mo13009a(InterfaceC6822c interfaceC6822c) {
        return InterfaceC6378e.a.m13012a(this, interfaceC6822c);
    }

    @Override // io.InterfaceC6378e
    /* JADX INFO: renamed from: b */
    public final String mo13010b() {
        return "second parameter must be of type KProperty<*> or its supertype";
    }

    @Override // io.InterfaceC6378e
    /* JADX INFO: renamed from: c */
    public final boolean mo13011c(InterfaceC6822c interfaceC6822c) {
        AbstractC5265x abstractC5265xM14186e;
        C5207g.m11111f(interfaceC6822c, "functionDescriptor");
        InterfaceC8853n0 interfaceC8853n0 = interfaceC6822c.mo11889i().get(1);
        C6796d.b bVar = C6796d.f38330d;
        C5207g.m11110e(interfaceC8853n0, "secondParameter");
        InterfaceC8863u interfaceC8863uM14113j = DescriptorUtilsKt.m14113j(interfaceC8853n0);
        bVar.getClass();
        InterfaceC8830c interfaceC8830cM13584a = FindClassInModuleKt.m13584a(interfaceC8863uM14113j, C6797e.a.f38365Q);
        if (interfaceC8830cM13584a == null) {
            abstractC5265xM14186e = null;
        } else {
            C5238j0.f33329b.getClass();
            C5238j0 c5238j0 = C5238j0.f33330c;
            List<InterfaceC8847k0> listMo11260r = interfaceC8830cM13584a.mo13600k().mo11260r();
            C5207g.m11110e(listMo11260r, "kPropertyClass.typeConstructor.parameters");
            Object objM13443k0 = C6752c.m13443k0(listMo11260r);
            C5207g.m11110e(objM13443k0, "kPropertyClass.typeConstructor.parameters.single()");
            abstractC5265xM14186e = KotlinTypeFactory.m14186e(c5238j0, interfaceC8830cM13584a, C9000b.m17251q(new StarProjectionImpl((InterfaceC8847k0) objM13443k0)));
        }
        if (abstractC5265xM14186e == null) {
            return false;
        }
        AbstractC5257t abstractC5257tMo11884c = interfaceC8853n0.mo11884c();
        C5207g.m11110e(abstractC5257tMo11884c, "secondParameter.type");
        return TypeUtilsKt.m14234k(abstractC5265xM14186e, C5258t0.m11298i(abstractC5257tMo11884c));
    }
}
