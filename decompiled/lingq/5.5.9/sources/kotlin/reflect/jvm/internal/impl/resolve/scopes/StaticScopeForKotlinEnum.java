package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import ae.C0062b;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import co.InterfaceC2073e;
import co.InterfaceC2076h;
import dm.C5207g;
import dm.C5209i;
import java.util.Collection;
import java.util.List;
import jo.C6531c;
import km.InterfaceC6727j;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6824e;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import mn.C7648e;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8834e;
import p385sf.C9000b;
import p466wn.AbstractC9984g;
import p466wn.C9981d;
import pn.C8412c;

/* JADX INFO: loaded from: classes2.dex */
public final class StaticScopeForKotlinEnum extends AbstractC9984g {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f39671d = {C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(StaticScopeForKotlinEnum.class), "functions", "getFunctions()Ljava/util/List;"))};

    /* JADX INFO: renamed from: b */
    public final InterfaceC8830c f39672b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2073e f39673c;

    public StaticScopeForKotlinEnum(InterfaceC2076h interfaceC2076h, InterfaceC8830c interfaceC8830c) {
        C5207g.m11111f(interfaceC2076h, "storageManager");
        C5207g.m11111f(interfaceC8830c, "containingClass");
        this.f39672b = interfaceC8830c;
        interfaceC8830c.mo13602u();
        ClassKind classKind = ClassKind.CLASS;
        this.f39673c = interfaceC2076h.mo6217b(new InterfaceC2041a<List<? extends InterfaceC6824e>>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum$functions$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final List<? extends InterfaceC6824e> mo807E() {
                StaticScopeForKotlinEnum staticScopeForKotlinEnum = this.f39674b;
                return C9000b.m17252r(C8412c.m16436e(staticScopeForKotlinEnum.f39672b), C8412c.m16437f(staticScopeForKotlinEnum.f39672b));
            }
        });
    }

    @Override // p466wn.AbstractC9984g, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: b */
    public final Collection mo11904b(C7648e c7648e, NoLookupLocation noLookupLocation) {
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(noLookupLocation, "location");
        List list = (List) C0062b.m366l1(this.f39673c, f39671d[0]);
        C6531c c6531c = new C6531c();
        for (Object obj : list) {
            if (C5207g.m11106a(((InterfaceC6824e) obj).mo11874a(), c7648e)) {
                c6531c.add(obj);
            }
        }
        return c6531c;
    }

    @Override // p466wn.AbstractC9984g, p466wn.InterfaceC9985h
    /* JADX INFO: renamed from: e */
    public final Collection mo5303e(C9981d c9981d, InterfaceC2052l interfaceC2052l) {
        C5207g.m11111f(c9981d, "kindFilter");
        C5207g.m11111f(interfaceC2052l, "nameFilter");
        return (List) C0062b.m366l1(this.f39673c, f39671d[0]);
    }

    @Override // p466wn.AbstractC9984g, p466wn.InterfaceC9985h
    /* JADX INFO: renamed from: g */
    public final InterfaceC8834e mo5304g(C7648e c7648e, NoLookupLocation noLookupLocation) {
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(noLookupLocation, "location");
        return null;
    }
}
