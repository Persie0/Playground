package p040c4;

import android.os.Bundle;
import cm.InterfaceC2041a;
import dm.C5206f;
import dm.C5207g;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import km.InterfaceC6719b;
import p040c4.InterfaceC1680e;
import p326q.C8446b;
import sl.InterfaceC9070c;

/* JADX INFO: renamed from: c4.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1681f<Args extends InterfaceC1680e> implements InterfaceC9070c<Args> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6719b<Args> f9402a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2041a<Bundle> f9403b;

    /* JADX INFO: renamed from: c */
    public Args f9404c;

    public C1681f(InterfaceC6719b<Args> interfaceC6719b, InterfaceC2041a<Bundle> interfaceC2041a) {
        C5207g.m11111f(interfaceC6719b, "navArgsClass");
        this.f9402a = interfaceC6719b;
        this.f9403b = interfaceC2041a;
    }

    @Override // sl.InterfaceC9070c
    /* JADX INFO: renamed from: b */
    public final boolean mo3942b() {
        throw null;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // sl.InterfaceC9070c
    public final Object getValue() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Args args = this.f9404c;
        if (args != null) {
            return args;
        }
        Bundle bundleMo807E = this.f9403b.mo807E();
        C8446b<InterfaceC6719b<? extends InterfaceC1680e>, Method> c8446b = C1682g.f9406b;
        InterfaceC6719b<Args> interfaceC6719b = this.f9402a;
        Method orDefault = c8446b.getOrDefault(interfaceC6719b, null);
        if (orDefault == null) {
            orDefault = C5206f.m10998T0(interfaceC6719b).getMethod("fromBundle", (Class[]) Arrays.copyOf(C1682g.f9405a, 1));
            c8446b.put((InterfaceC6719b<? extends InterfaceC1680e>) interfaceC6719b, orDefault);
            C5207g.m11110e(orDefault, "navArgsClass.java.getMet…hod\n                    }");
        }
        Object objInvoke = orDefault.invoke(null, bundleMo807E);
        if (objInvoke == null) {
            throw new NullPointerException("null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
        }
        Args args2 = (Args) objInvoke;
        this.f9404c = args2;
        return args2;
    }
}
