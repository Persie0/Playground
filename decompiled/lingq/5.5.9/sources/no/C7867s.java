package no;

import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.concurrent.CancellationException;
import sl.C9072e;

/* JADX INFO: renamed from: no.s */
/* JADX INFO: loaded from: classes2.dex */
public final class C7867s {

    /* JADX INFO: renamed from: a */
    public final Object f42960a;

    /* JADX INFO: renamed from: b */
    public final AbstractC7834h f42961b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2052l<Throwable, C9072e> f42962c;

    /* JADX INFO: renamed from: d */
    public final Object f42963d;

    /* JADX INFO: renamed from: e */
    public final Throwable f42964e;

    /* JADX WARN: Multi-variable type inference failed */
    public C7867s(Object obj, AbstractC7834h abstractC7834h, InterfaceC2052l<? super Throwable, C9072e> interfaceC2052l, Object obj2, Throwable th2) {
        this.f42960a = obj;
        this.f42961b = abstractC7834h;
        this.f42962c = interfaceC2052l;
        this.f42963d = obj2;
        this.f42964e = th2;
    }

    public /* synthetic */ C7867s(Object obj, AbstractC7834h abstractC7834h, InterfaceC2052l interfaceC2052l, Object obj2, CancellationException cancellationException, int i10) {
        this(obj, (i10 & 2) != 0 ? null : abstractC7834h, (i10 & 4) != 0 ? null : interfaceC2052l, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : cancellationException);
    }

    /* JADX INFO: renamed from: a */
    public static C7867s m15613a(C7867s c7867s, AbstractC7834h abstractC7834h, CancellationException cancellationException, int i10) {
        Object obj = (i10 & 1) != 0 ? c7867s.f42960a : null;
        if ((i10 & 2) != 0) {
            abstractC7834h = c7867s.f42961b;
        }
        AbstractC7834h abstractC7834h2 = abstractC7834h;
        InterfaceC2052l<Throwable, C9072e> interfaceC2052l = (i10 & 4) != 0 ? c7867s.f42962c : null;
        Object obj2 = (i10 & 8) != 0 ? c7867s.f42963d : null;
        Throwable th2 = cancellationException;
        if ((i10 & 16) != 0) {
            th2 = c7867s.f42964e;
        }
        c7867s.getClass();
        return new C7867s(obj, abstractC7834h2, interfaceC2052l, obj2, th2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7867s)) {
            return false;
        }
        C7867s c7867s = (C7867s) obj;
        return C5207g.m11106a(this.f42960a, c7867s.f42960a) && C5207g.m11106a(this.f42961b, c7867s.f42961b) && C5207g.m11106a(this.f42962c, c7867s.f42962c) && C5207g.m11106a(this.f42963d, c7867s.f42963d) && C5207g.m11106a(this.f42964e, c7867s.f42964e);
    }

    public final int hashCode() {
        Object obj = this.f42960a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        AbstractC7834h abstractC7834h = this.f42961b;
        int iHashCode2 = (iHashCode + (abstractC7834h == null ? 0 : abstractC7834h.hashCode())) * 31;
        InterfaceC2052l<Throwable, C9072e> interfaceC2052l = this.f42962c;
        int iHashCode3 = (iHashCode2 + (interfaceC2052l == null ? 0 : interfaceC2052l.hashCode())) * 31;
        Object obj2 = this.f42963d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th2 = this.f42964e;
        return iHashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f42960a + ", cancelHandler=" + this.f42961b + ", onCancellation=" + this.f42962c + ", idempotentResume=" + this.f42963d + ", cancelCause=" + this.f42964e + ')';
    }
}
