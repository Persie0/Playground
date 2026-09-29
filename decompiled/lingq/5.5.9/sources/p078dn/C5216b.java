package p078dn;

import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.Collection;
import java.util.Set;
import jo.C6530b;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p372rm.InterfaceC8830c;
import sl.C9072e;

/* JADX INFO: renamed from: dn.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C5216b extends C6530b.a<InterfaceC8830c, C9072e> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC8830c f33296a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Set<Object> f33297b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC2052l<MemberScope, Collection<Object>> f33298c;

    public C5216b(LazyJavaClassDescriptor lazyJavaClassDescriptor, Set set, InterfaceC2052l interfaceC2052l) {
        this.f33296a = lazyJavaClassDescriptor;
        this.f33297b = set;
        this.f33298c = interfaceC2052l;
    }

    @Override // jo.C6530b.c
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11208a() {
        return C9072e.f47360a;
    }

    @Override // jo.C6530b.c
    /* JADX INFO: renamed from: c */
    public final boolean mo11209c(Object obj) {
        InterfaceC8830c interfaceC8830c = (InterfaceC8830c) obj;
        C5207g.m11111f(interfaceC8830c, "current");
        if (interfaceC8830c != this.f33296a) {
            MemberScope memberScopeMo13598Z = interfaceC8830c.mo13598Z();
            C5207g.m11110e(memberScopeMo13598Z, "current.staticScope");
            if (memberScopeMo13598Z instanceof AbstractC5217c) {
                this.f33297b.addAll(this.f33298c.mo528n(memberScopeMo13598Z));
                return false;
            }
        }
        return true;
    }
}
