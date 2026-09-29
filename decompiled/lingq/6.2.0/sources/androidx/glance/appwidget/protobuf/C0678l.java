package androidx.glance.appwidget.protobuf;

import p000.C0787av;
import p000.g9a;
import p000.qx2;
import p000.ux2;
import p000.vj6;
import p000.vk3;
import p000.ym8;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C0678l implements ym8 {

    /* JADX INFO: renamed from: a */
    public final AbstractC0667a f6094a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0680n f6095b;

    /* JADX INFO: renamed from: c */
    public final ux2 f6096c;

    public C0678l(AbstractC0680n abstractC0680n, ux2 ux2Var, AbstractC0667a abstractC0667a) {
        this.f6095b = abstractC0680n;
        ux2Var.getClass();
        this.f6096c = ux2Var;
        this.f6094a = abstractC0667a;
    }

    @Override // p000.ym8
    /* JADX INFO: renamed from: a */
    public final int mo2415a(AbstractC0675i abstractC0675i) {
        ((C0682p) this.f6095b).getClass();
        C0681o c0681o = abstractC0675i.unknownFields;
        int i = c0681o.f6104d;
        if (i != -1) {
            return i;
        }
        int iM2370a = 0;
        for (int i2 = 0; i2 < c0681o.f6101a; i2++) {
            int i3 = c0681o.f6102b[i2] >>> 3;
            iM2370a += AbstractC0673g.m2370a(3, (ByteString) c0681o.f6103c[i2]) + AbstractC0673g.m2375f(i3) + AbstractC0673g.m2374e(2) + (AbstractC0673g.m2374e(1) * 2);
        }
        c0681o.f6104d = iM2370a;
        return iM2370a;
    }

    @Override // p000.ym8
    /* JADX INFO: renamed from: b */
    public final int mo2416b(AbstractC0675i abstractC0675i) {
        ((C0682p) this.f6095b).getClass();
        return abstractC0675i.unknownFields.hashCode();
    }

    @Override // p000.ym8
    /* JADX INFO: renamed from: c */
    public final void mo2417c(Object obj, C0670d c0670d, qx2 qx2Var) {
        this.f6095b.mo2466a(obj);
        this.f6096c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // p000.ym8
    /* JADX INFO: renamed from: d */
    public final void mo2418d(Object obj, vj6 vj6Var) {
        this.f6096c.getClass();
        g9a.m12435l(obj);
        throw null;
    }

    @Override // p000.ym8
    /* JADX INFO: renamed from: e */
    public final void mo2419e(Object obj, byte[] bArr, int i, int i2, C0787av c0787av) {
        AbstractC0675i abstractC0675i = (AbstractC0675i) obj;
        if (abstractC0675i.unknownFields == C0681o.f6100f) {
            abstractC0675i.unknownFields = C0681o.m2468c();
        }
        throw g9a.m12430g(obj);
    }

    @Override // p000.ym8
    /* JADX INFO: renamed from: f */
    public final boolean mo2420f(AbstractC0675i abstractC0675i, AbstractC0675i abstractC0675i2) {
        C0682p c0682p = (C0682p) this.f6095b;
        c0682p.getClass();
        C0681o c0681o = abstractC0675i.unknownFields;
        c0682p.getClass();
        return c0681o.equals(abstractC0675i2.unknownFields);
    }

    @Override // p000.ym8
    public final boolean isInitialized(Object obj) {
        this.f6096c.getClass();
        g9a.m12435l(obj);
        throw null;
    }

    @Override // p000.ym8
    public final void makeImmutable(Object obj) {
        ((C0682p) this.f6095b).getClass();
        C0681o c0681o = ((AbstractC0675i) obj).unknownFields;
        if (c0681o.f6105e) {
            c0681o.f6105e = false;
        }
        this.f6096c.getClass();
        g9a.m12435l(obj);
        throw null;
    }

    @Override // p000.ym8
    public final void mergeFrom(Object obj, Object obj2) {
        AbstractC0679m.m2450k(this.f6095b, obj, obj2);
    }

    @Override // p000.ym8
    public final AbstractC0675i newInstance() {
        AbstractC0667a abstractC0667a = this.f6094a;
        if (abstractC0667a instanceof AbstractC0675i) {
            return ((AbstractC0675i) abstractC0667a).m2386j();
        }
        AbstractC0675i abstractC0675i = (AbstractC0675i) abstractC0667a;
        abstractC0675i.getClass();
        return ((vk3) abstractC0675i.mo2383d(GeneratedMessageLite$MethodToInvoke.NEW_BUILDER)).m23360b();
    }
}
