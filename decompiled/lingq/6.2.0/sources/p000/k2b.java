package p000;

import android.util.Pair;
import androidx.media3.common.ParserException;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class k2b implements hy2 {

    /* JADX INFO: renamed from: a */
    public jy2 f46596a;

    /* JADX INFO: renamed from: b */
    public n8a f46597b;

    /* JADX INFO: renamed from: e */
    public i2b f46600e;

    /* JADX INFO: renamed from: c */
    public int f46598c = 0;

    /* JADX INFO: renamed from: d */
    public long f46599d = -1;

    /* JADX INFO: renamed from: f */
    public int f46601f = -1;

    /* JADX INFO: renamed from: g */
    public long f46602g = -1;

    @Override // p000.hy2
    /* JADX INFO: renamed from: a */
    public final void mo109a() {
    }

    /* JADX WARN: Code duplicated, block: B:82:0x021d  */
    @Override // p000.hy2
    /* JADX INFO: renamed from: b */
    public final int mo110b(iy2 iy2Var, n63 n63Var) throws ParserException {
        byte[] bArr;
        int i;
        this.f46597b.getClass();
        String str = uma.f64080a;
        int i2 = this.f46598c;
        int iM22825t = 4;
        if (i2 == 0) {
            bna.m3987z(iy2Var.getPosition() == 0);
            int i3 = this.f46601f;
            if (i3 != -1) {
                iy2Var.mo13082k(i3);
                this.f46598c = 4;
                return 0;
            }
            if (!zxc.m25851a(iy2Var)) {
                throw ParserException.m2516a(null, "Unsupported or unrecognized wav file type.");
            }
            iy2Var.mo13082k((int) (iy2Var.mo13077e() - iy2Var.getPosition()));
            this.f46598c = 1;
            return 0;
        }
        long jM14832p = -1;
        if (i2 == 1) {
            k47 k47Var = new k47(8);
            gh5 gh5VarM12655a = gh5.m12655a(iy2Var, k47Var);
            if (gh5VarM12655a.f40819a != 1685272116) {
                iy2Var.mo13080i();
            } else {
                iy2Var.mo13078f(8);
                k47Var.m14818M(0);
                iy2Var.mo13085o(k47Var.f46700a, 0, 8);
                jM14832p = k47Var.m14832p();
                iy2Var.mo13082k(((int) gh5VarM12655a.f40820b) + 8);
            }
            this.f46599d = jM14832p;
            this.f46598c = 2;
            return 0;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    uk9.m22770c();
                    return 0;
                }
                bna.m3987z(this.f46602g != -1);
                long position = this.f46602g - iy2Var.getPosition();
                i2b i2bVar = this.f46600e;
                i2bVar.getClass();
                return i2bVar.mo13012b(iy2Var, position) ? -1 : 0;
            }
            iy2Var.mo13080i();
            gh5 gh5VarM25852b = zxc.m25852b(1684108385, iy2Var, new k47(8));
            iy2Var.mo13082k(8);
            Pair pairCreate = Pair.create(Long.valueOf(iy2Var.getPosition()), Long.valueOf(gh5VarM25852b.f40820b));
            this.f46601f = ((Long) pairCreate.first).intValue();
            long jLongValue = ((Long) pairCreate.second).longValue();
            long j = this.f46599d;
            if (j != -1 && jLongValue == 4294967295L) {
                jLongValue = j;
            }
            this.f46602g = ((long) this.f46601f) + jLongValue;
            long length = iy2Var.getLength();
            if (length != -1 && this.f46602g > length) {
                ss5.m21707d0("WavExtractor", "Data exceeds input length: " + this.f46602g + ", " + length);
                this.f46602g = length;
            }
            i2b i2bVar2 = this.f46600e;
            i2bVar2.getClass();
            i2bVar2.mo13013c(this.f46601f, this.f46602g);
            this.f46598c = 4;
            return 0;
        }
        k47 k47Var2 = new k47(16);
        long j2 = zxc.m25852b(1718449184, iy2Var, k47Var2).f40820b;
        bna.m3987z(j2 >= 16);
        iy2Var.mo13085o(k47Var2.f46700a, 0, 16);
        k47Var2.m14818M(0);
        int iM14835s = k47Var2.m14835s();
        int iM14835s2 = k47Var2.m14835s();
        int iM14834r = k47Var2.m14834r();
        k47Var2.m14834r();
        int iM14835s3 = k47Var2.m14835s();
        int iM14835s4 = k47Var2.m14835s();
        int i4 = ((int) j2) - 16;
        if (i4 > 0) {
            bArr = new byte[i4];
            iy2Var.mo13085o(bArr, 0, i4);
            if (iM14835s == 65534 && i4 == 24) {
                k47 k47Var3 = new k47(bArr);
                k47Var3.m14835s();
                int iM14835s5 = k47Var3.m14835s();
                if (iM14835s5 != 0 && iM14835s5 != iM14835s4) {
                    throw ParserException.m2517b("validBits ( " + iM14835s5 + ")  != bitsPerSample( " + iM14835s4 + ") are not supported");
                }
                int iM14834r2 = k47Var3.m14834r();
                if ((iM14834r2 >> 18) != 0) {
                    throw ParserException.m2517b("invalid channel mask " + iM14834r2);
                }
                if (iM14834r2 != 0 && Integer.bitCount(iM14834r2) != iM14835s2) {
                    throw ParserException.m2517b("invalid number of channels (" + Integer.bitCount(iM14834r2) + ") in channel mask " + iM14834r2);
                }
                iM14835s = k47Var3.m14835s();
                byte[] bArr2 = new byte[14];
                k47Var3.m14827k(bArr2, 0, 14);
                if (!Arrays.equals(bArr2, zxc.f72363a) && !Arrays.equals(bArr2, zxc.f72364b)) {
                    throw ParserException.m2517b("invalid wav format extension guid");
                }
            }
        } else {
            bArr = uma.f64081b;
        }
        iy2Var.mo13082k((int) (iy2Var.mo13077e() - iy2Var.getPosition()));
        l47 l47Var = new l47();
        l47Var.f49038a = iM14835s2;
        l47Var.f49039b = iM14834r;
        l47Var.f49040c = iM14835s3;
        l47Var.f49041d = iM14835s4;
        l47Var.f49042e = bArr;
        if (iM14835s == 17) {
            this.f46600e = new h2b(this.f46596a, this.f46597b, l47Var);
        } else if (iM14835s == 6) {
            this.f46600e = new j2b(this.f46596a, this.f46597b, l47Var, "audio/g711-alaw", -1);
        } else if (iM14835s == 7) {
            this.f46600e = new j2b(this.f46596a, this.f46597b, l47Var, "audio/g711-mlaw", -1);
        } else {
            if (iM14835s == 1) {
                iM22825t = uma.m22825t(iM14835s4, ByteOrder.LITTLE_ENDIAN);
                i = iM22825t;
            } else {
                if (iM14835s != 3) {
                    if (iM14835s == 65534) {
                        iM22825t = uma.m22825t(iM14835s4, ByteOrder.LITTLE_ENDIAN);
                        i = iM22825t;
                    }
                } else if (iM14835s4 == 32) {
                    i = iM22825t;
                }
                i = 0;
            }
            if (i == 0) {
                throw ParserException.m2517b("Unsupported WAV format type: " + iM14835s);
            }
            this.f46600e = new j2b(this.f46596a, this.f46597b, l47Var, "audio/raw", i);
        }
        this.f46598c = 3;
        return 0;
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: c */
    public final boolean mo111c(iy2 iy2Var) {
        return zxc.m25851a(iy2Var);
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: d */
    public final void mo112d(long j, long j2) {
        this.f46598c = j == 0 ? 0 : 4;
        i2b i2bVar = this.f46600e;
        if (i2bVar != null) {
            i2bVar.mo13011a(j2);
        }
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: f */
    public final void mo113f(jy2 jy2Var) {
        this.f46596a = jy2Var;
        this.f46597b = jy2Var.mo2555n(0, 1);
        jy2Var.mo2551j();
    }
}
