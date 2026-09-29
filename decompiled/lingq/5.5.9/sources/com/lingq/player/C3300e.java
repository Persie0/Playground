package com.lingq.player;

import dm.C5207g;

/* JADX INFO: renamed from: com.lingq.player.e */
/* JADX INFO: loaded from: classes.dex */
public final class C3300e {

    /* JADX INFO: renamed from: a */
    public final AbstractC3299d f17757a;

    /* JADX INFO: renamed from: b */
    public final AbstractC3298c f17758b;

    public C3300e() {
        this(0);
    }

    public /* synthetic */ C3300e(int i10) {
        this(AbstractC3299d.a.f17754a, AbstractC3298c.a.f17752a);
    }

    public C3300e(AbstractC3299d abstractC3299d, AbstractC3298c abstractC3298c) {
        C5207g.m11111f(abstractC3299d, "type");
        C5207g.m11111f(abstractC3298c, "state");
        this.f17757a = abstractC3299d;
        this.f17758b = abstractC3298c;
    }

    /* JADX INFO: renamed from: a */
    public static C3300e m9432a(AbstractC3299d abstractC3299d, AbstractC3298c abstractC3298c) {
        C5207g.m11111f(abstractC3299d, "type");
        C5207g.m11111f(abstractC3298c, "state");
        return new C3300e(abstractC3299d, abstractC3298c);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C3300e m9433b(C3300e c3300e, AbstractC3299d abstractC3299d, AbstractC3298c abstractC3298c, int i10) {
        if ((i10 & 1) != 0) {
            abstractC3299d = c3300e.f17757a;
        }
        if ((i10 & 2) != 0) {
            abstractC3298c = c3300e.f17758b;
        }
        c3300e.getClass();
        return m9432a(abstractC3299d, abstractC3298c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3300e)) {
            return false;
        }
        C3300e c3300e = (C3300e) obj;
        return C5207g.m11106a(this.f17757a, c3300e.f17757a) && C5207g.m11106a(this.f17758b, c3300e.f17758b);
    }

    public final int hashCode() {
        return this.f17758b.hashCode() + (this.f17757a.hashCode() * 31);
    }

    public final String toString() {
        return "PlayerTypeState(type=" + this.f17757a + ", state=" + this.f17758b + ")";
    }
}
