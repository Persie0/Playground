package p102eo;

import dm.C5207g;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.C7057a;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import p260m8.C7499b;
import p543do.AbstractC5257t;
import p543do.AbstractC5262v0;

/* JADX INFO: renamed from: eo.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C5443h implements InterfaceC5442g {

    /* JADX INFO: renamed from: c */
    public final AbstractC5439d f33994c;

    /* JADX INFO: renamed from: d */
    public final KotlinTypePreparator f33995d;

    /* JADX INFO: renamed from: e */
    public final OverridingUtil f33996e;

    public C5443h(AbstractC5439d.a aVar) {
        KotlinTypePreparator.C7059a c7059a = KotlinTypePreparator.C7059a.f39903a;
        C5207g.m11111f(aVar, "kotlinTypeRefiner");
        C5207g.m11111f(c7059a, "kotlinTypePreparator");
        this.f33994c = aVar;
        this.f33995d = c7059a;
        this.f33996e = new OverridingUtil(OverridingUtil.f39633g, aVar, c7059a);
    }

    @Override // p102eo.InterfaceC5438c
    /* JADX INFO: renamed from: a */
    public final boolean mo11657a(AbstractC5257t abstractC5257t, AbstractC5257t abstractC5257t2) {
        C5207g.m11111f(abstractC5257t, "a");
        C5207g.m11111f(abstractC5257t2, "b");
        TypeCheckerState typeCheckerStateM14965t = C7499b.m14965t(false, false, null, this.f33995d, this.f33994c, 6);
        AbstractC5262v0 abstractC5262v0Mo11288a1 = abstractC5257t.mo11288a1();
        AbstractC5262v0 abstractC5262v0Mo11288a2 = abstractC5257t2.mo11288a1();
        C5207g.m11111f(abstractC5262v0Mo11288a1, "a");
        C5207g.m11111f(abstractC5262v0Mo11288a2, "b");
        return C7057a.m14211e(typeCheckerStateM14965t, abstractC5262v0Mo11288a1, abstractC5262v0Mo11288a2);
    }

    @Override // p102eo.InterfaceC5442g
    /* JADX INFO: renamed from: b */
    public final OverridingUtil mo11665b() {
        return this.f33996e;
    }

    @Override // p102eo.InterfaceC5442g
    /* JADX INFO: renamed from: c */
    public final AbstractC5439d mo11666c() {
        return this.f33994c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m11667d(AbstractC5257t abstractC5257t, AbstractC5257t abstractC5257t2) {
        C5207g.m11111f(abstractC5257t, "subtype");
        C5207g.m11111f(abstractC5257t2, "supertype");
        TypeCheckerState typeCheckerStateM14965t = C7499b.m14965t(true, false, null, this.f33995d, this.f33994c, 6);
        AbstractC5262v0 abstractC5262v0Mo11288a1 = abstractC5257t.mo11288a1();
        AbstractC5262v0 abstractC5262v0Mo11288a2 = abstractC5257t2.mo11288a1();
        C5207g.m11111f(abstractC5262v0Mo11288a1, "subType");
        C5207g.m11111f(abstractC5262v0Mo11288a2, "superType");
        return C7057a.m14215i(C7057a.f39897a, typeCheckerStateM14965t, abstractC5262v0Mo11288a1, abstractC5262v0Mo11288a2);
    }
}
