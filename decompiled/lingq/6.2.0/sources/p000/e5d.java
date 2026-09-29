package p000;

import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.designsystem.R$color;
import com.lingq.core.p012ui.R$drawable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e5d {
    /* JADX INFO: renamed from: a */
    public static final void m10857a(e16 e16Var, int i, int i2, String str, boolean z, boolean z2, boolean z3, ye1 ye1Var, int i3) {
        b16 b16Var;
        boolean z4;
        str.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-291593717);
        int i4 = i3 | (tj3Var.m22120g(e16Var) ? 4 : 2) | (tj3Var.m22116e(i) ? 32 : 16) | (tj3Var.m22116e(i2) ? 256 : 128) | (tj3Var.m22120g(str) ? 2048 : 1024) | (tj3Var.m22122h(z) ? 16384 : 8192) | (tj3Var.m22122h(z2) ? 131072 : 65536) | (tj3Var.m22122h(z3) ? 1048576 : 524288);
        if (tj3Var.m22099R(i4 & 1, (599187 & i4) != 599186)) {
            e16 e16VarM21611X = AbstractC3584sr.m21611X(e16Var, 0.0f, 0.0f, 0.0f, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38956e, 7);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52792K, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21611X);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var3, numValueOf);
            vi3 vi3Var = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            b16 b16Var2 = b16.f7762a;
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, b16Var2);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, ht5VarM19966d);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            if (z) {
                tj3Var.m22111b0(954219019);
                bq1.m4042R(AbstractC3423or.m18236U(R$drawable.ic_close_s, tj3Var, 0), null, AbstractC3584sr.m21609V(c99.m4422o(b16Var2, 60.0f), 8.0f, 0.0f, 2), null, null, 0.0f, new qd0(5, j8d.m14343a(tj3Var, R$color.grey_light)), tj3Var, 440, 56);
                tj3Var.m22139q(false);
                b16Var = b16Var2;
                z4 = true;
            } else {
                tj3Var.m22111b0(954628405);
                b16Var = b16Var2;
                z4 = true;
                a5d.m126a(AbstractC3584sr.m21609V(c99.m4422o(b16Var2, 60.0f), z3 ? 0.0f : 4.0f, 0.0f, 2), i, i2, z2, z3 && i < i2, 0.0f, tj3Var, (i4 & 1008) | ((i4 >> 6) & 7168), 32);
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(z4);
            e16 e16VarM4429v = c99.m4429v(b16Var);
            vh9 vh9Var = ps5.f56764b;
            g4d.m12360a(str, e16VarM4429v, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55873q, null, 0L, 0, false, 1, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71406j, z3 ? bc3.f8323i : bc3.f8319e, tj3Var, ((i4 >> 9) & 14) | 12582960, 120);
            tj3Var.m22139q(z4);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ba5(e16Var, i, i2, str, z, z2, z3, i3);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m10858b(e16 e16Var, uj9 uj9Var, ye1 ye1Var, int i, int i2) {
        int i3;
        uj9Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1715981395);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i;
        }
        int i5 = i3 | (tj3Var.m22124i(uj9Var) ? 32 : 16);
        if (tj3Var.m22099R(i5 & 1, (i5 & 19) != 18)) {
            if (i4 != 0) {
                e16Var = b16.f7762a;
            }
            r46.m20381f(AbstractC3423or.m18285y(c99.m4412e(e16Var, 1.0f), IntrinsicSize.Min), null, null, null, ci8.m4703P(1989206275, new iz4(22, uj9Var, y02.m24803a()), tj3Var), tj3Var, 24576, 14);
        } else {
            tj3Var.m22102U();
        }
        e16 e16Var2 = e16Var;
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new qa4(i, i2, 3, e16Var2, uj9Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m10859c(ArrayDeque arrayDeque, int i) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m10860d(tk0 tk0Var) throws IOException {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i = 0;
        while (i < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i2 = 0;
            while (i2 < iMin2) {
                int i3 = tk0Var.read(bArr, i2, iMin2 - i2);
                if (i3 == -1) {
                    return m10859c(arrayDeque, i);
                }
                i2 += i3;
                i += i3;
            }
            long j = ((long) iMin) * ((long) (iMin < 4096 ? 4 : 2));
            if (j > 2147483647L) {
                iMin = Integer.MAX_VALUE;
            } else {
                iMin = j < -2147483648L ? Integer.MIN_VALUE : (int) j;
            }
        }
        if (tk0Var.read() == -1) {
            return m10859c(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
