package no;

import cm.InterfaceC2052l;
import dm.C5207g;
import sl.C9072e;

/* JADX INFO: renamed from: no.u */
/* JADX INFO: loaded from: classes2.dex */
public final class C7872u {

    /* JADX INFO: renamed from: a */
    public final Object f42972a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2052l<Throwable, C9072e> f42973b;

    /* JADX WARN: Multi-variable type inference failed */
    public C7872u(Object obj, InterfaceC2052l<? super Throwable, C9072e> interfaceC2052l) {
        this.f42972a = obj;
        this.f42973b = interfaceC2052l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7872u)) {
            return false;
        }
        C7872u c7872u = (C7872u) obj;
        return C5207g.m11106a(this.f42972a, c7872u.f42972a) && C5207g.m11106a(this.f42973b, c7872u.f42973b);
    }

    public final int hashCode() {
        Object obj = this.f42972a;
        return this.f42973b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f42972a + ", onCancellation=" + this.f42973b + ')';
    }
}
