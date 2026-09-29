package kotlin.reflect.jvm.internal.impl.builtins;

import cm.InterfaceC2041a;
import java.util.EnumMap;
import java.util.HashMap;
import p543do.AbstractC5265x;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C6794b implements InterfaceC2041a<AbstractC6795c.a> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC6795c f38321a;

    public C6794b(AbstractC6795c abstractC6795c) {
        this.f38321a = abstractC6795c;
    }

    @Override // cm.InterfaceC2041a
    /* JADX INFO: renamed from: E */
    public final AbstractC6795c.a mo807E() {
        EnumMap enumMap = new EnumMap(PrimitiveType.class);
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        for (PrimitiveType primitiveType : PrimitiveType.values()) {
            String strM15235f = primitiveType.getTypeName().m15235f();
            AbstractC6795c abstractC6795c = this.f38321a;
            AbstractC5265x abstractC5265xM13541b = AbstractC6795c.m13541b(abstractC6795c, strM15235f);
            AbstractC5265x abstractC5265xM13541b2 = AbstractC6795c.m13541b(abstractC6795c, primitiveType.getArrayTypeName().m15235f());
            enumMap.put(primitiveType, abstractC5265xM13541b2);
            map.put(abstractC5265xM13541b, abstractC5265xM13541b2);
            map2.put(abstractC5265xM13541b2, abstractC5265xM13541b);
        }
        return new AbstractC6795c.a(enumMap, map, map2);
    }
}
