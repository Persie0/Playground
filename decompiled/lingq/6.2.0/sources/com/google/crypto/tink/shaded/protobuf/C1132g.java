package com.google.crypto.tink.shaded.protobuf;

import p000.o94;
import p000.wm8;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1132g {

    /* JADX INFO: renamed from: a */
    public final C1131f f13592a;

    public C1132g(C1131f c1131f) {
        o94.m17872a(c1131f, "output");
        this.f13592a = c1131f;
        c1131f.f13588a = this;
    }

    /* JADX INFO: renamed from: a */
    public final void m6521a(int i, boolean z) throws CodedOutputStream$OutOfSpaceException {
        C1131f c1131f = this.f13592a;
        c1131f.m6517r(i, 0);
        c1131f.m6510k(z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: b */
    public final void m6522b(int i, ByteString byteString) throws CodedOutputStream$OutOfSpaceException {
        C1131f c1131f = this.f13592a;
        c1131f.m6517r(i, 2);
        c1131f.m6518s(byteString.size());
        ByteString.LiteralByteString literalByteString = (ByteString.LiteralByteString) byteString;
        c1131f.m6511l(literalByteString.f13560d, literalByteString.mo6413k(), literalByteString.size());
    }

    /* JADX INFO: renamed from: c */
    public final void m6523c(int i, double d) throws CodedOutputStream$OutOfSpaceException {
        C1131f c1131f = this.f13592a;
        c1131f.getClass();
        c1131f.m6514o(i, Double.doubleToRawLongBits(d));
    }

    /* JADX INFO: renamed from: d */
    public final void m6524d(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        C1131f c1131f = this.f13592a;
        c1131f.m6517r(i, 0);
        c1131f.m6516q(i2);
    }

    /* JADX INFO: renamed from: e */
    public final void m6525e(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        this.f13592a.m6512m(i, i2);
    }

    /* JADX INFO: renamed from: f */
    public final void m6526f(int i, long j) throws CodedOutputStream$OutOfSpaceException {
        this.f13592a.m6514o(i, j);
    }

    /* JADX INFO: renamed from: g */
    public final void m6527g(int i, float f) throws CodedOutputStream$OutOfSpaceException {
        C1131f c1131f = this.f13592a;
        c1131f.getClass();
        c1131f.m6512m(i, Float.floatToRawIntBits(f));
    }

    /* JADX INFO: renamed from: h */
    public final void m6528h(int i, Object obj, wm8 wm8Var) throws CodedOutputStream$OutOfSpaceException {
        C1131f c1131f = this.f13592a;
        c1131f.m6517r(i, 3);
        wm8Var.mo6588c((AbstractC1126a) obj, c1131f.f13588a);
        c1131f.m6517r(i, 4);
    }

    /* JADX INFO: renamed from: i */
    public final void m6529i(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        C1131f c1131f = this.f13592a;
        c1131f.m6517r(i, 0);
        c1131f.m6516q(i2);
    }

    /* JADX INFO: renamed from: j */
    public final void m6530j(int i, long j) throws CodedOutputStream$OutOfSpaceException {
        this.f13592a.m6519t(i, j);
    }

    /* JADX INFO: renamed from: k */
    public final void m6531k(int i, Object obj, wm8 wm8Var) throws CodedOutputStream$OutOfSpaceException {
        AbstractC1126a abstractC1126a = (AbstractC1126a) obj;
        C1131f c1131f = this.f13592a;
        c1131f.m6517r(i, 2);
        c1131f.m6518s(abstractC1126a.mo6429a(wm8Var));
        wm8Var.mo6588c(abstractC1126a, c1131f.f13588a);
    }

    /* JADX INFO: renamed from: l */
    public final void m6532l(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        this.f13592a.m6512m(i, i2);
    }

    /* JADX INFO: renamed from: m */
    public final void m6533m(int i, long j) throws CodedOutputStream$OutOfSpaceException {
        this.f13592a.m6514o(i, j);
    }

    /* JADX INFO: renamed from: n */
    public final void m6534n(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        C1131f c1131f = this.f13592a;
        c1131f.m6517r(i, 0);
        c1131f.m6518s((i2 >> 31) ^ (i2 << 1));
    }

    /* JADX INFO: renamed from: o */
    public final void m6535o(int i, long j) throws CodedOutputStream$OutOfSpaceException {
        C1131f c1131f = this.f13592a;
        c1131f.m6519t(i, (j >> 63) ^ (j << 1));
    }

    /* JADX INFO: renamed from: p */
    public final void m6536p(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        C1131f c1131f = this.f13592a;
        c1131f.m6517r(i, 0);
        c1131f.m6518s(i2);
    }

    /* JADX INFO: renamed from: q */
    public final void m6537q(int i, long j) throws CodedOutputStream$OutOfSpaceException {
        this.f13592a.m6519t(i, j);
    }
}
