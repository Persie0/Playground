package p491xm;

import dm.C5207g;
import gn.InterfaceC5828h;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;
import mn.C7648e;

/* JADX INFO: renamed from: xm.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C10235j extends AbstractC10230e implements InterfaceC5828h {

    /* JADX INFO: renamed from: b */
    public final Class<?> f51666b;

    public C10235j(C7648e c7648e, Class<?> cls) {
        super(c7648e);
        this.f51666b = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gn.InterfaceC5828h
    /* JADX INFO: renamed from: d */
    public final AbstractC10248w mo12260d() {
        Class<?> cls = this.f51666b;
        C5207g.m11111f(cls, "type");
        if (cls.isPrimitive()) {
            return new C10246u(cls);
        }
        if (!(cls instanceof GenericArrayType) && !cls.isArray()) {
            return cls instanceof WildcardType ? new C10251z((WildcardType) cls) : new C10236k(cls);
        }
        return new C10234i(cls);
    }
}
