package p000;

import java.io.EOFException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Regex;
import okio.ByteString;

/* JADX INFO: loaded from: classes2.dex */
public final class m56 extends z68 {

    /* JADX INFO: renamed from: f */
    public static final xv5 f50604f;

    /* JADX INFO: renamed from: g */
    public static final xv5 f50605g;

    /* JADX INFO: renamed from: h */
    public static final byte[] f50606h;

    /* JADX INFO: renamed from: i */
    public static final byte[] f50607i;

    /* JADX INFO: renamed from: j */
    public static final byte[] f50608j;

    /* JADX INFO: renamed from: b */
    public final ByteString f50609b;

    /* JADX INFO: renamed from: c */
    public final List f50610c;

    /* JADX INFO: renamed from: d */
    public final xv5 f50611d;

    /* JADX INFO: renamed from: e */
    public long f50612e;

    static {
        Regex regex = xv5.f68845e;
        f50604f = AbstractC3122is.m14103q("multipart/mixed");
        AbstractC3122is.m14103q("multipart/alternative");
        AbstractC3122is.m14103q("multipart/digest");
        AbstractC3122is.m14103q("multipart/parallel");
        f50605g = AbstractC3122is.m14103q("multipart/form-data");
        f50606h = new byte[]{58, 32};
        f50607i = new byte[]{13, 10};
        f50608j = new byte[]{45, 45};
    }

    public m56(ByteString byteString, xv5 xv5Var, List list) {
        byteString.getClass();
        xv5Var.getClass();
        this.f50609b = byteString;
        this.f50610c = list;
        Regex regex = xv5.f68845e;
        this.f50611d = AbstractC3122is.m14103q(xv5Var + "; boundary=" + byteString.m18089r());
        this.f50612e = -1L;
    }

    @Override // p000.z68
    /* JADX INFO: renamed from: a */
    public final long mo159a() throws EOFException {
        long j = this.f50612e;
        if (j != -1) {
            return j;
        }
        long jM16637e = m16637e(null, true);
        this.f50612e = jM16637e;
        return jM16637e;
    }

    @Override // p000.z68
    /* JADX INFO: renamed from: b */
    public final xv5 mo160b() {
        return this.f50611d;
    }

    @Override // p000.z68
    /* JADX INFO: renamed from: c */
    public final boolean mo16636c() {
        List list = this.f50610c;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((l56) it.next()).f49084b.mo16636c()) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.z68
    /* JADX INFO: renamed from: d */
    public final void mo161d(gj0 gj0Var) throws EOFException {
        m16637e(gj0Var, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public final long m16637e(gj0 gj0Var, boolean z) throws EOFException {
        aj0 aj0Var;
        gj0 aj0Var2;
        if (z) {
            aj0Var2 = new aj0();
            aj0Var = aj0Var2;
        } else {
            aj0Var = 0;
            aj0Var2 = gj0Var;
        }
        List list = this.f50610c;
        int size = list.size();
        long j = 0;
        int i = 0;
        while (true) {
            ByteString byteString = this.f50609b;
            byte[] bArr = f50608j;
            byte[] bArr2 = f50607i;
            if (i >= size) {
                aj0Var2.getClass();
                aj0Var2.write(bArr);
                aj0Var2.mo468U(byteString);
                aj0Var2.write(bArr);
                aj0Var2.write(bArr2);
                if (!z) {
                    return j;
                }
                aj0Var.getClass();
                long j2 = j + aj0Var.f723b;
                aj0Var.m473a();
                return j2;
            }
            l56 l56Var = (l56) list.get(i);
            qr3 qr3Var = l56Var.f49083a;
            z68 z68Var = l56Var.f49084b;
            aj0Var2.getClass();
            aj0Var2.write(bArr);
            aj0Var2.mo468U(byteString);
            aj0Var2.write(bArr2);
            int size2 = qr3Var.size();
            for (int i2 = 0; i2 < size2; i2++) {
                aj0Var2.mo461H(qr3Var.m20122f(i2)).write(f50606h).mo461H(qr3Var.m20124h(i2)).write(bArr2);
            }
            xv5 xv5VarMo160b = z68Var.mo160b();
            if (xv5VarMo160b != null) {
                aj0Var2.mo461H("Content-Type: ").mo461H(xv5VarMo160b.f68847a).write(bArr2);
            }
            long jMo159a = z68Var.mo159a();
            if (jMo159a == -1 && z) {
                aj0Var.getClass();
                aj0Var.m473a();
                return -1L;
            }
            aj0Var2.write(bArr2);
            if (z) {
                j += jMo159a;
            } else {
                z68Var.mo161d(aj0Var2);
            }
            aj0Var2.write(bArr2);
            i++;
        }
    }
}
