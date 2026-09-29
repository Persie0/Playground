package p491xm;

import dm.C5207g;
import gn.InterfaceC5820a;
import gn.InterfaceC5841u;
import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* JADX INFO: renamed from: xm.u */
/* JADX INFO: loaded from: classes2.dex */
public final class C10246u extends AbstractC10248w implements InterfaceC5841u {

    /* JADX INFO: renamed from: a */
    public final Class<?> f51675a;

    /* JADX INFO: renamed from: b */
    public final EmptyList f51676b = EmptyList.f38032a;

    public C10246u(Class<?> cls) {
        this.f51675a = cls;
    }

    @Override // p491xm.AbstractC10248w
    /* JADX INFO: renamed from: Y */
    public final Type mo19213Y() {
        return this.f51675a;
    }

    @Override // gn.InterfaceC5841u
    /* JADX INFO: renamed from: c */
    public final PrimitiveType mo12284c() {
        Class cls = Void.TYPE;
        Class<?> cls2 = this.f51675a;
        if (C5207g.m11106a(cls2, cls)) {
            return null;
        }
        return JvmPrimitiveType.get(cls2.getName()).getPrimitiveType();
    }

    @Override // gn.InterfaceC5824d
    /* JADX INFO: renamed from: w */
    public final Collection<InterfaceC5820a> mo12240w() {
        return this.f51676b;
    }

    @Override // gn.InterfaceC5824d
    /* JADX INFO: renamed from: x */
    public final void mo12241x() {
    }
}
