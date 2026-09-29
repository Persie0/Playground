package td;

import com.google.android.play.core.assetpacks.C3113d;
import com.google.android.play.core.internal.zzck;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import p338qd.C8558m0;

/* JADX INFO: renamed from: td.m */
/* JADX INFO: loaded from: classes.dex */
public final class C9265m {
    /* JADX INFO: renamed from: a */
    public static void m17626a(C3113d c3113d, InputStream inputStream, C8558m0 c8558m0, long j10) throws IOException {
        byte[] bArr = new byte[16384];
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream, 4096));
        int i10 = dataInputStream.readInt();
        if (i10 != -771763713) {
            String strValueOf = String.valueOf(String.format("%x", Integer.valueOf(i10)));
            throw new zzck(strValueOf.length() != 0 ? "Unexpected magic=".concat(strValueOf) : new String("Unexpected magic="));
        }
        int i11 = dataInputStream.read();
        if (i11 != 4) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Unexpected version=");
            sb2.append(i11);
            throw new zzck(sb2.toString());
        }
        long j11 = 0;
        while (true) {
            long j12 = j10 - j11;
            try {
                int unsignedShort = dataInputStream.read();
                if (unsignedShort == -1) {
                    throw new IOException("Patch file overrun");
                }
                if (unsignedShort == 0) {
                    c8558m0.flush();
                    return;
                }
                switch (unsignedShort) {
                    case 247:
                        unsignedShort = dataInputStream.readUnsignedShort();
                        m17628c(bArr, dataInputStream, c8558m0, unsignedShort, j12);
                        break;
                    case 248:
                        unsignedShort = dataInputStream.readInt();
                        m17628c(bArr, dataInputStream, c8558m0, unsignedShort, j12);
                        break;
                    case 249:
                        long unsignedShort2 = dataInputStream.readUnsignedShort();
                        unsignedShort = dataInputStream.read();
                        if (unsignedShort == -1) {
                            throw new IOException("Unexpected end of patch");
                        }
                        m17627b(bArr, c3113d, c8558m0, unsignedShort2, unsignedShort, j12);
                        break;
                        break;
                    case 250:
                        long unsignedShort3 = dataInputStream.readUnsignedShort();
                        unsignedShort = dataInputStream.readUnsignedShort();
                        m17627b(bArr, c3113d, c8558m0, unsignedShort3, unsignedShort, j12);
                        break;
                    case 251:
                        long unsignedShort4 = dataInputStream.readUnsignedShort();
                        unsignedShort = dataInputStream.readInt();
                        m17627b(bArr, c3113d, c8558m0, unsignedShort4, unsignedShort, j12);
                        break;
                    case 252:
                        long j13 = dataInputStream.readInt();
                        unsignedShort = dataInputStream.read();
                        if (unsignedShort == -1) {
                            throw new IOException("Unexpected end of patch");
                        }
                        m17627b(bArr, c3113d, c8558m0, j13, unsignedShort, j12);
                        break;
                        break;
                    case 253:
                        long j14 = dataInputStream.readInt();
                        unsignedShort = dataInputStream.readUnsignedShort();
                        m17627b(bArr, c3113d, c8558m0, j14, unsignedShort, j12);
                        break;
                    case 254:
                        long j15 = dataInputStream.readInt();
                        unsignedShort = dataInputStream.readInt();
                        m17627b(bArr, c3113d, c8558m0, j15, unsignedShort, j12);
                        break;
                    case 255:
                        long j16 = dataInputStream.readLong();
                        unsignedShort = dataInputStream.readInt();
                        m17627b(bArr, c3113d, c8558m0, j16, unsignedShort, j12);
                        break;
                    default:
                        m17628c(bArr, dataInputStream, c8558m0, unsignedShort, j12);
                        break;
                }
                j11 += (long) unsignedShort;
            } catch (Throwable th2) {
                c8558m0.flush();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m17627b(byte[] bArr, C3113d c3113d, C8558m0 c8558m0, long j10, int i10, long j11) throws IOException {
        InputStream inputStreamMo8980b;
        int i11 = i10;
        if (i11 < 0) {
            throw new IOException("copyLength negative");
        }
        if (j10 < 0) {
            throw new IOException("inputOffset negative");
        }
        long j12 = i11;
        if (j12 > j11) {
            throw new IOException("Output length overrun");
        }
        try {
            C9267o c9267o = new C9267o(c3113d, j10, j12);
            synchronized (c9267o) {
                inputStreamMo8980b = c9267o.mo8980b(0L, c9267o.f47969c - c9267o.f47968b);
            }
            while (i11 > 0) {
                try {
                    int iMin = Math.min(i11, 16384);
                    int i12 = 0;
                    while (i12 < iMin) {
                        int i13 = inputStreamMo8980b.read(bArr, i12, iMin - i12);
                        if (i13 == -1) {
                            throw new IOException("truncated input stream");
                        }
                        i12 += i13;
                    }
                    c8558m0.write(bArr, 0, iMin);
                    i11 -= iMin;
                } catch (Throwable th2) {
                    try {
                        inputStreamMo8980b.close();
                    } catch (Throwable unused) {
                    }
                    throw th2;
                }
            }
            inputStreamMo8980b.close();
        } catch (EOFException e10) {
            throw new IOException("patch underrun", e10);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: c */
    public static void m17628c(byte[] bArr, DataInputStream dataInputStream, C8558m0 c8558m0, int i10, long j10) throws IOException {
        if (i10 < 0) {
            throw new IOException("copyLength negative");
        }
        if (i10 > j10) {
            throw new IOException("Output length overrun");
        }
        while (i10 > 0) {
            try {
                int iMin = Math.min(i10, 16384);
                dataInputStream.readFully(bArr, 0, iMin);
                c8558m0.write(bArr, 0, iMin);
                i10 -= iMin;
            } catch (EOFException unused) {
                throw new IOException("patch underrun");
            }
        }
    }
}
