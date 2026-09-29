package p491xm;

import dm.C5207g;
import gn.InterfaceC5834n;
import gn.InterfaceC5843w;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* JADX INFO: renamed from: xm.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C10240o extends AbstractC10242q implements InterfaceC5834n {

    /* JADX INFO: renamed from: a */
    public final Field f51671a;

    public C10240o(Field field) {
        C5207g.m11111f(field, "member");
        this.f51671a = field;
    }

    @Override // gn.InterfaceC5834n
    /* JADX INFO: renamed from: M */
    public final boolean mo12269M() {
        return this.f51671a.isEnumConstant();
    }

    @Override // gn.InterfaceC5834n
    /* JADX INFO: renamed from: V */
    public final void mo12270V() {
    }

    @Override // p491xm.AbstractC10242q
    /* JADX INFO: renamed from: Y */
    public final Member mo19214Y() {
        return this.f51671a;
    }

    @Override // gn.InterfaceC5834n
    /* JADX INFO: renamed from: c */
    public final InterfaceC5843w mo12271c() {
        InterfaceC5843w c10234i;
        Type genericType = this.f51671a.getGenericType();
        C5207g.m11110e(genericType, "member.genericType");
        boolean z10 = genericType instanceof Class;
        if (z10) {
            Class cls = (Class) genericType;
            if (cls.isPrimitive()) {
                return new C10246u(cls);
            }
        }
        if ((genericType instanceof GenericArrayType) || (z10 && ((Class) genericType).isArray())) {
            c10234i = new C10234i(genericType);
        } else {
            c10234i = genericType instanceof WildcardType ? new C10251z((WildcardType) genericType) : new C10236k(genericType);
        }
        return c10234i;
    }
}
