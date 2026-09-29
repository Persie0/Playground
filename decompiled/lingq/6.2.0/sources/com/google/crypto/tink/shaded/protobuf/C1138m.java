package com.google.crypto.tink.shaded.protobuf;

import p000.C3846zu;
import p000.g9a;
import p000.ox2;
import p000.rx2;
import p000.sx2;
import p000.wm8;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C1138m implements wm8 {

    /* JADX INFO: renamed from: a */
    public final AbstractC1126a f13613a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1140o f13614b;

    /* JADX INFO: renamed from: c */
    public final rx2 f13615c;

    public C1138m(AbstractC1140o abstractC1140o, rx2 rx2Var, AbstractC1126a abstractC1126a) {
        this.f13614b = abstractC1140o;
        rx2Var.getClass();
        this.f13615c = rx2Var;
        this.f13613a = abstractC1126a;
    }

    /* JADX INFO: renamed from: g */
    public static C1138m m6606g(AbstractC1140o abstractC1140o, rx2 rx2Var, AbstractC1126a abstractC1126a) {
        return new C1138m(abstractC1140o, rx2Var, abstractC1126a);
    }

    @Override // p000.wm8
    /* JADX INFO: renamed from: a */
    public final void mo6586a(Object obj, C1130e c1130e, ox2 ox2Var) {
        this.f13614b.mo6651a(obj);
        ((sx2) this.f13615c).getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // p000.wm8
    /* JADX INFO: renamed from: b */
    public final boolean mo6587b(AbstractC1134i abstractC1134i, AbstractC1134i abstractC1134i2) {
        C1142q c1142q = (C1142q) this.f13614b;
        c1142q.getClass();
        C1141p c1141p = abstractC1134i.unknownFields;
        c1142q.getClass();
        return c1141p.equals(abstractC1134i2.unknownFields);
    }

    @Override // p000.wm8
    /* JADX INFO: renamed from: c */
    public final void mo6588c(Object obj, C1132g c1132g) {
        ((sx2) this.f13615c).getClass();
        g9a.m12435l(obj);
        throw null;
    }

    @Override // p000.wm8
    /* JADX INFO: renamed from: d */
    public final int mo6589d(AbstractC1134i abstractC1134i) {
        ((C1142q) this.f13614b).getClass();
        return abstractC1134i.unknownFields.hashCode();
    }

    @Override // p000.wm8
    /* JADX INFO: renamed from: e */
    public final int mo6590e(AbstractC1134i abstractC1134i) {
        ((C1142q) this.f13614b).getClass();
        C1141p c1141p = abstractC1134i.unknownFields;
        int i = c1141p.f13624d;
        if (i != -1) {
            return i;
        }
        int iM6500a = 0;
        for (int i2 = 0; i2 < c1141p.f13621a; i2++) {
            int i3 = c1141p.f13622b[i2] >>> 3;
            iM6500a += C1131f.m6500a(3, (ByteString) c1141p.f13623c[i2]) + C1131f.m6508i(i3) + C1131f.m6507h(2) + (C1131f.m6507h(1) * 2);
        }
        c1141p.f13624d = iM6500a;
        return iM6500a;
    }

    @Override // p000.wm8
    /* JADX INFO: renamed from: f */
    public final void mo6591f(Object obj, byte[] bArr, int i, int i2, C3846zu c3846zu) {
        AbstractC1134i abstractC1134i = (AbstractC1134i) obj;
        if (abstractC1134i.unknownFields == C1141p.f13620f) {
            abstractC1134i.unknownFields = C1141p.m6653c();
        }
        throw g9a.m12430g(obj);
    }

    @Override // p000.wm8
    public final boolean isInitialized(Object obj) {
        ((sx2) this.f13615c).getClass();
        g9a.m12435l(obj);
        throw null;
    }

    @Override // p000.wm8
    public final void makeImmutable(Object obj) {
        ((C1142q) this.f13614b).getClass();
        ((AbstractC1134i) obj).unknownFields.f13625e = false;
        ((sx2) this.f13615c).getClass();
        g9a.m12435l(obj);
        throw null;
    }

    @Override // p000.wm8
    public final void mergeFrom(Object obj, Object obj2) {
        AbstractC1139n.m6648x(this.f13614b, obj, obj2);
    }

    @Override // p000.wm8
    public final Object newInstance() {
        AbstractC1126a abstractC1126a = this.f13613a;
        return abstractC1126a instanceof AbstractC1134i ? ((AbstractC1134i) abstractC1126a).m6550p() : abstractC1126a.mo6431c().m22172b();
    }
}
