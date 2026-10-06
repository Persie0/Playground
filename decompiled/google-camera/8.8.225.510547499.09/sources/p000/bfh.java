package p000;

import androidx.work.impl.workers.NHKG.pIeXJQLZLfgIN;
import com.google.android.clockwork.common.wearable.wearmaterial.time.HuCi.yTyWiTtGtnBhy;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bfh {

    /* JADX INFO: renamed from: a */
    public byte[] f3087a;

    /* JADX INFO: renamed from: b */
    public int f3088b;

    /* JADX INFO: renamed from: c */
    private String f3089c;

    public bfh(int i) {
        this.f3089c = null;
        this.f3087a = new byte[i];
        this.f3088b = 0;
    }

    /* JADX INFO: renamed from: a */
    public final InputStream m2304a() {
        return new ByteArrayInputStream(this.f3087a, 0, this.f3088b);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005d A[PHI: r1
      0x005d: PHI (r1v4 java.lang.String) = (r1v1 java.lang.String), (r1v3 java.lang.String) binds: [B:33:0x005b, B:36:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: b */
    public final String m2305b() {
        if (this.f3089c == null) {
            int i = this.f3088b;
            String str = pIeXJQLZLfgIN.zZItJdkSrR;
            if (i < 2) {
                this.f3089c = str;
            } else {
                byte[] bArr = this.f3087a;
                byte b = bArr[0];
                if (b != 0) {
                    int i2 = b & 255;
                    if (i2 < 128) {
                        if (bArr[1] != 0) {
                            this.f3089c = str;
                        } else {
                            this.f3089c = (i < 4 || bArr[2] != 0) ? "UTF-16LE" : "UTF-32LE";
                        }
                    } else if (i2 == 239) {
                        this.f3089c = str;
                    } else {
                        str = yTyWiTtGtnBhy.dLQagYns;
                        if (i2 == 254) {
                            this.f3089c = str;
                        } else if (i < 4 || bArr[2] != 0) {
                            this.f3089c = str;
                        } else {
                            this.f3089c = "UTF-32";
                        }
                    }
                } else if (i < 4 || bArr[1] != 0) {
                    this.f3089c = "UTF-16BE";
                } else if ((bArr[2] & 255) == 254 && (bArr[3] & 255) == 255) {
                    this.f3089c = "UTF-32BE";
                } else {
                    this.f3089c = "UTF-32";
                }
            }
        }
        return this.f3089c;
    }

    /* JADX INFO: renamed from: c */
    public final void m2306c(byte[] bArr) {
        m2308e(bArr, bArr.length);
    }

    /* JADX INFO: renamed from: d */
    public final void m2307d(int i) {
        byte[] bArr = this.f3087a;
        int length = bArr.length;
        if (i > length) {
            byte[] bArr2 = new byte[length + length];
            this.f3087a = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, length);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2308e(byte[] bArr, int i) {
        m2307d(this.f3088b + i);
        System.arraycopy(bArr, 0, this.f3087a, this.f3088b, i);
        this.f3088b += i;
    }

    public bfh(InputStream inputStream) throws IOException {
        this.f3089c = null;
        this.f3088b = 0;
        this.f3087a = new byte[16384];
        while (true) {
            int i = inputStream.read(this.f3087a, this.f3088b, 16384);
            if (i <= 0) {
                return;
            }
            int i2 = this.f3088b + i;
            this.f3088b = i2;
            if (i != 16384) {
                return;
            } else {
                m2307d(i2 + 16384);
            }
        }
    }

    public bfh(byte[] bArr) {
        this.f3089c = null;
        this.f3087a = bArr;
        this.f3088b = bArr.length;
    }
}
