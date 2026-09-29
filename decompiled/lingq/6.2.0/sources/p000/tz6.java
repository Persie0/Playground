package p000;

import androidx.media3.common.C0713b;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class tz6 extends ik9 {

    /* JADX INFO: renamed from: o */
    public static final byte[] f63144o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p */
    public static final byte[] f63145p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: n */
    public boolean f63146n;

    /* JADX INFO: renamed from: e */
    public static boolean m22356e(k47 k47Var, byte[] bArr) {
        if (k47Var.m14820a() < bArr.length) {
            return false;
        }
        int i = k47Var.f46701b;
        byte[] bArr2 = new byte[bArr.length];
        k47Var.m14827k(bArr2, 0, bArr.length);
        k47Var.m14818M(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // p000.ik9
    /* JADX INFO: renamed from: b */
    public final long mo13996b(k47 k47Var) {
        byte[] bArr = k47Var.f46700a;
        return (((long) this.f44232i) * syb.m21777b(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // p000.ik9
    /* JADX INFO: renamed from: c */
    public final boolean mo13997c(k47 k47Var, long j, p33 p33Var) {
        if (m22356e(k47Var, f63144o)) {
            byte[] bArrCopyOf = Arrays.copyOf(k47Var.f46700a, k47Var.f46702c);
            int i = bArrCopyOf[9] & 255;
            ArrayList arrayListM21776a = syb.m21776a(bArrCopyOf);
            if (((C0713b) p33Var.f55513b) == null) {
                lc3 lc3Var = new lc3();
                lc3Var.f49452m = ez5.m11402l("audio/ogg");
                lc3Var.f49453n = ez5.m11402l("audio/opus");
                lc3Var.f49430F = i;
                lc3Var.f49431G = 48000;
                lc3Var.f49456q = arrayListM21776a;
                p33Var.f55513b = new C0713b(lc3Var);
                return true;
            }
        } else {
            if (!m22356e(k47Var, f63145p)) {
                ((C0713b) p33Var.f55513b).getClass();
                return false;
            }
            ((C0713b) p33Var.f55513b).getClass();
            if (!this.f63146n) {
                this.f63146n = true;
                k47Var.m14819N(8);
                ey5 ey5VarM16063c = lbd.m16063c(ImmutableList.m6288s((String[]) lbd.m16064d(k47Var, false, false).f52742a));
                if (ey5VarM16063c != null) {
                    lc3 lc3VarM2520a = ((C0713b) p33Var.f55513b).m2520a();
                    lc3VarM2520a.f49450k = ey5VarM16063c.m11387b(((C0713b) p33Var.f55513b).f6403l);
                    p33Var.f55513b = new C0713b(lc3VarM2520a);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // p000.ik9
    /* JADX INFO: renamed from: d */
    public final void mo13998d(boolean z) {
        super.mo13998d(z);
        if (z) {
            this.f63146n = false;
        }
    }
}
