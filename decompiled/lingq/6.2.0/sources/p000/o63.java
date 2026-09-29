package p000;

import androidx.media3.common.C0713b;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class o63 extends ik9 {

    /* JADX INFO: renamed from: n */
    public p63 f53889n;

    /* JADX INFO: renamed from: o */
    public vh0 f53890o;

    @Override // p000.ik9
    /* JADX INFO: renamed from: b */
    public final long mo13996b(k47 k47Var) {
        byte[] bArr = k47Var.f46700a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            k47Var.m14819N(4);
            k47Var.m14813H();
        }
        int iM17391b = ndd.m17391b(i, k47Var);
        k47Var.m14818M(0);
        return iM17391b;
    }

    @Override // p000.ik9
    /* JADX INFO: renamed from: c */
    public final boolean mo13997c(k47 k47Var, long j, p33 p33Var) {
        byte[] bArr = k47Var.f46700a;
        p63 p63Var = this.f53889n;
        if (p63Var == null) {
            p63 p63Var2 = new p63(17, bArr);
            this.f53889n = p63Var2;
            lc3 lc3VarM2520a = p63Var2.m18920c(Arrays.copyOfRange(bArr, 9, k47Var.f46702c), null).m2520a();
            lc3VarM2520a.f49452m = ez5.m11402l("audio/ogg");
            p33Var.f55513b = new C0713b(lc3VarM2520a);
            return true;
        }
        byte b = bArr[0];
        if ((b & 127) != 3) {
            if (b != -1) {
                return true;
            }
            vh0 vh0Var = this.f53890o;
            if (vh0Var != null) {
                vh0Var.f65365a = j;
                p33Var.f55514c = vh0Var;
            }
            ((C0713b) p33Var.f55513b).getClass();
            return false;
        }
        p33 p33VarM17941a = odd.m17941a(k47Var);
        p63 p63Var3 = new p63(p63Var.f55632a, p63Var.f55633b, p63Var.f55634c, p63Var.f55635d, p63Var.f55636e, p63Var.f55638g, p63Var.f55639h, p63Var.f55641j, p33VarM17941a, p63Var.f55643l);
        this.f53889n = p63Var3;
        vh0 vh0Var2 = new vh0();
        vh0Var2.f65367c = p63Var3;
        vh0Var2.f65368d = p33VarM17941a;
        vh0Var2.f65365a = -1L;
        vh0Var2.f65366b = -1L;
        this.f53890o = vh0Var2;
        return true;
    }

    @Override // p000.ik9
    /* JADX INFO: renamed from: d */
    public final void mo13998d(boolean z) {
        super.mo13998d(z);
        if (z) {
            this.f53889n = null;
            this.f53890o = null;
        }
    }
}
