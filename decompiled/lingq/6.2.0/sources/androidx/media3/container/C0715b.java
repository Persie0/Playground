package androidx.media3.container;

import java.nio.ByteBuffer;
import p000.bna;
import p000.so0;
import p000.tp6;

/* JADX INFO: renamed from: androidx.media3.container.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C0715b {

    /* JADX INFO: renamed from: a */
    public final boolean f6421a;

    /* JADX INFO: renamed from: b */
    public final boolean f6422b;

    /* JADX INFO: renamed from: c */
    public final boolean f6423c;

    /* JADX INFO: renamed from: d */
    public final boolean f6424d;

    /* JADX INFO: renamed from: e */
    public final boolean f6425e;

    /* JADX INFO: renamed from: f */
    public final int f6426f;

    /* JADX INFO: renamed from: g */
    public final int f6427g;

    /* JADX INFO: renamed from: h */
    public final boolean f6428h;

    /* JADX INFO: renamed from: i */
    public final boolean f6429i;

    /* JADX INFO: renamed from: j */
    public final boolean f6430j;

    /* JADX INFO: renamed from: k */
    public final boolean f6431k;

    /* JADX INFO: renamed from: l */
    public final boolean f6432l;

    /* JADX INFO: renamed from: m */
    public final byte f6433m;

    /* JADX INFO: renamed from: n */
    public final byte f6434n;

    /* JADX INFO: renamed from: o */
    public final byte f6435o;

    public C0715b(tp6 tp6Var) {
        int i = tp6Var.f62698a;
        ByteBuffer byteBuffer = tp6Var.f62699b;
        bna.m3969q(i == 1);
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        so0 so0Var = new so0(iRemaining, bArr);
        this.f6427g = so0Var.m21503g(3);
        so0Var.m21510n();
        boolean zM21502f = so0Var.m21502f();
        this.f6421a = zM21502f;
        if (zM21502f) {
            so0Var.m21503g(5);
            this.f6422b = false;
            this.f6428h = false;
        } else {
            if (so0Var.m21502f()) {
                so0Var.m21511o(64);
                if (so0Var.m21502f()) {
                    int i2 = 0;
                    while (!so0Var.m21502f()) {
                        i2++;
                    }
                    if (i2 < 32) {
                        so0Var.m21511o(i2);
                    }
                }
                boolean zM21502f2 = so0Var.m21502f();
                this.f6422b = zM21502f2;
                if (zM21502f2) {
                    so0Var.m21511o(47);
                }
            } else {
                this.f6422b = false;
            }
            this.f6428h = so0Var.m21502f();
            int iM21503g = so0Var.m21503g(5);
            for (int i3 = 0; i3 <= iM21503g; i3++) {
                so0Var.m21511o(12);
                if (i3 == 0) {
                    if (so0Var.m21503g(5) > 7) {
                        so0Var.m21502f();
                    }
                } else if (so0Var.m21503g(5) > 7) {
                    so0Var.m21510n();
                }
                if (this.f6422b) {
                    so0Var.m21510n();
                }
                if (this.f6428h && so0Var.m21502f()) {
                    if (i3 == 0) {
                        so0Var.m21503g(4);
                    } else {
                        so0Var.m21511o(4);
                    }
                }
            }
        }
        int iM21503g2 = so0Var.m21503g(4);
        int iM21503g3 = so0Var.m21503g(4);
        so0Var.m21511o(iM21503g2 + 1);
        so0Var.m21511o(iM21503g3 + 1);
        if (this.f6421a) {
            this.f6423c = false;
        } else {
            this.f6423c = so0Var.m21502f();
        }
        if (this.f6423c) {
            so0Var.m21511o(4);
            so0Var.m21511o(3);
        }
        so0Var.m21511o(3);
        if (this.f6421a) {
            this.f6425e = true;
            this.f6424d = true;
            this.f6426f = 0;
        } else {
            so0Var.m21511o(4);
            boolean zM21502f3 = so0Var.m21502f();
            if (zM21502f3) {
                so0Var.m21511o(2);
            }
            if (so0Var.m21502f()) {
                this.f6424d = true;
            } else {
                this.f6424d = so0Var.m21502f();
            }
            if (!this.f6424d || so0Var.m21502f()) {
                this.f6425e = true;
            } else {
                this.f6425e = so0Var.m21502f();
            }
            if (zM21502f3) {
                this.f6426f = so0Var.m21503g(3) + 1;
            } else {
                this.f6426f = 0;
            }
        }
        so0Var.m21511o(3);
        boolean zM21502f4 = so0Var.m21502f();
        if (this.f6427g == 2 && zM21502f4) {
            this.f6429i = so0Var.m21502f();
        } else {
            this.f6429i = false;
        }
        if (this.f6427g != 1) {
            this.f6430j = so0Var.m21502f();
        } else {
            this.f6430j = false;
        }
        if (so0Var.m21502f()) {
            this.f6433m = (byte) so0Var.m21503g(8);
            this.f6434n = (byte) so0Var.m21503g(8);
            this.f6435o = (byte) so0Var.m21503g(8);
        } else {
            this.f6433m = (byte) 0;
            this.f6434n = (byte) 0;
            this.f6435o = (byte) 0;
        }
        if (this.f6430j) {
            so0Var.m21510n();
            this.f6431k = false;
            this.f6432l = false;
        } else if (this.f6433m == 1 && this.f6434n == 13 && this.f6435o == 0) {
            this.f6431k = false;
            this.f6432l = false;
        } else {
            so0Var.m21510n();
            int i4 = this.f6427g;
            if (i4 == 0) {
                this.f6431k = true;
                this.f6432l = true;
            } else if (i4 == 1) {
                this.f6431k = false;
                this.f6432l = false;
            } else if (this.f6429i) {
                boolean zM21502f5 = so0Var.m21502f();
                this.f6431k = zM21502f5;
                if (zM21502f5) {
                    this.f6432l = so0Var.m21502f();
                } else {
                    this.f6432l = false;
                }
            } else {
                this.f6431k = true;
                this.f6432l = false;
            }
            if (this.f6431k && this.f6432l) {
                so0Var.m21503g(2);
            }
        }
        so0Var.m21510n();
    }

    /* JADX INFO: renamed from: a */
    public static C0715b m2524a(tp6 tp6Var) {
        try {
            return new C0715b(tp6Var);
        } catch (ObuParser$NotYetImplementedException unused) {
            return null;
        }
    }
}
