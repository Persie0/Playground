package p000;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C1128c;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class m80 {

    /* JADX INFO: renamed from: a */
    public int f50743a;

    /* JADX INFO: renamed from: b */
    public Object f50744b;

    public m80(pnd pndVar, int i) {
        if (pndVar == null) {
            C3386nv.m17626m("format options cannot be null");
            throw null;
        }
        if (i < 0) {
            C3386nv.m17626m(wq1.m24124t(new StringBuilder(String.valueOf(i).length() + 15), "invalid index: ", i));
            throw null;
        }
        this.f50743a = i;
        this.f50744b = pndVar;
    }

    /* JADX INFO: renamed from: b */
    public static int m16672b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* JADX INFO: renamed from: c */
    public static long m16673c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* JADX INFO: renamed from: f */
    public static C1128c m16674f(byte[] bArr, int i, int i2, boolean z) {
        C1128c c1128c = new C1128c(bArr, i, i2, z);
        try {
            c1128c.mo6450l(i2);
            return c1128c;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: A */
    public abstract String mo6435A();

    /* JADX INFO: renamed from: B */
    public abstract String mo6436B();

    /* JADX INFO: renamed from: C */
    public abstract int mo6437C();

    /* JADX INFO: renamed from: D */
    public abstract int mo6438D();

    /* JADX INFO: renamed from: E */
    public abstract long mo6439E();

    /* JADX INFO: renamed from: F */
    public abstract void mo16675F(nnd nndVar, Object obj);

    /* JADX INFO: renamed from: a */
    public abstract void mo6446a(int i);

    /* JADX INFO: renamed from: d */
    public abstract int mo6447d();

    /* JADX INFO: renamed from: e */
    public abstract boolean mo6448e();

    /* JADX INFO: renamed from: g */
    public void mo14068g(m5b m5bVar) {
    }

    /* JADX INFO: renamed from: h */
    public void mo14069h(m5b m5bVar) {
    }

    /* JADX INFO: renamed from: i */
    public abstract f6b mo14070i(f6b f6bVar, List list);

    /* JADX INFO: renamed from: j */
    public abstract p33 mo14071j(m5b m5bVar, p33 p33Var);

    /* JADX INFO: renamed from: k */
    public abstract void mo6449k(int i);

    /* JADX INFO: renamed from: l */
    public abstract int mo6450l(int i);

    /* JADX INFO: renamed from: m */
    public abstract boolean mo6451m();

    /* JADX INFO: renamed from: n */
    public abstract ByteString mo6452n();

    /* JADX INFO: renamed from: o */
    public abstract double mo6453o();

    /* JADX INFO: renamed from: p */
    public abstract int mo6454p();

    /* JADX INFO: renamed from: q */
    public abstract int mo6455q();

    /* JADX INFO: renamed from: r */
    public abstract long mo6456r();

    /* JADX INFO: renamed from: t */
    public abstract float mo6457t();

    /* JADX INFO: renamed from: u */
    public abstract int mo6458u();

    /* JADX INFO: renamed from: v */
    public abstract long mo6459v();

    /* JADX INFO: renamed from: w */
    public abstract int mo6460w();

    /* JADX INFO: renamed from: x */
    public abstract long mo6461x();

    /* JADX INFO: renamed from: y */
    public abstract int mo6462y();

    /* JADX INFO: renamed from: z */
    public abstract long mo6463z();

    public m80(int i) {
        this.f50743a = i;
    }
}
