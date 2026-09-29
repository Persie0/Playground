package com.google.android.exoplayer2.source;

import android.media.MediaCodec;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p218k9.C6633c;
import p261m9.InterfaceC7522w;
import p454wa.C9876a;
import p454wa.C9885j;
import p454wa.InterfaceC9877b;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10151t;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.o */
/* JADX INFO: loaded from: classes.dex */
public final class C2498o {

    /* JADX INFO: renamed from: a */
    public final InterfaceC9877b f13390a;

    /* JADX INFO: renamed from: b */
    public final int f13391b;

    /* JADX INFO: renamed from: c */
    public final C10151t f13392c;

    /* JADX INFO: renamed from: d */
    public a f13393d;

    /* JADX INFO: renamed from: e */
    public a f13394e;

    /* JADX INFO: renamed from: f */
    public a f13395f;

    /* JADX INFO: renamed from: g */
    public long f13396g;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.o$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public long f13397a;

        /* JADX INFO: renamed from: b */
        public long f13398b;

        /* JADX INFO: renamed from: c */
        public C9876a f13399c;

        /* JADX INFO: renamed from: d */
        public a f13400d;

        public a(int i10, long j10) {
            C10129a.m18992d(this.f13399c == null);
            this.f13397a = j10;
            this.f13398b = j10 + ((long) i10);
        }
    }

    public C2498o(InterfaceC9877b interfaceC9877b) {
        this.f13390a = interfaceC9877b;
        int i10 = ((C9885j) interfaceC9877b).f50447b;
        this.f13391b = i10;
        this.f13392c = new C10151t(32);
        a aVar = new a(i10, 0L);
        this.f13393d = aVar;
        this.f13394e = aVar;
        this.f13395f = aVar;
    }

    /* JADX INFO: renamed from: d */
    public static a m7379d(a aVar, long j10, ByteBuffer byteBuffer, int i10) {
        a aVar2 = aVar;
        while (j10 >= aVar2.f13398b) {
            aVar2 = aVar2.f13400d;
        }
        while (true) {
            while (i10 > 0) {
                int iMin = Math.min(i10, (int) (aVar2.f13398b - j10));
                C9876a c9876a = aVar2.f13399c;
                byteBuffer.put(c9876a.f50416a, ((int) (j10 - aVar2.f13397a)) + c9876a.f50417b, iMin);
                i10 -= iMin;
                j10 += (long) iMin;
                if (j10 == aVar2.f13398b) {
                    aVar2 = aVar2.f13400d;
                }
            }
            return aVar2;
        }
    }

    /* JADX INFO: renamed from: e */
    public static a m7380e(a aVar, long j10, byte[] bArr, int i10) {
        a aVar2 = aVar;
        while (j10 >= aVar2.f13398b) {
            aVar2 = aVar2.f13400d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (aVar2.f13398b - j10));
            C9876a c9876a = aVar2.f13399c;
            System.arraycopy(c9876a.f50416a, ((int) (j10 - aVar2.f13397a)) + c9876a.f50417b, bArr, i10 - i11, iMin);
            i11 -= iMin;
            j10 += (long) iMin;
            if (j10 == aVar2.f13398b) {
                aVar2 = aVar2.f13400d;
            }
        }
        return aVar2;
    }

    /* JADX INFO: renamed from: f */
    public static a m7381f(a aVar, DecoderInputBuffer decoderInputBuffer, C2499p.a aVar2, C10151t c10151t) {
        if (decoderInputBuffer.m13269m(1073741824)) {
            long j10 = aVar2.f13435b;
            int iM19150y = 1;
            c10151t.m19121B(1);
            a aVarM7380e = m7380e(aVar, j10, c10151t.f51438a, 1);
            long j11 = j10 + 1;
            byte b10 = c10151t.f51438a[0];
            boolean z10 = (b10 & 128) != 0;
            int i10 = b10 & 127;
            C6633c c6633c = decoderInputBuffer.f12115b;
            byte[] bArr = c6633c.f37592a;
            if (bArr == null) {
                c6633c.f37592a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            aVar = m7380e(aVarM7380e, j11, c6633c.f37592a, i10);
            long j12 = j11 + ((long) i10);
            if (z10) {
                c10151t.m19121B(2);
                aVar = m7380e(aVar, j12, c10151t.f51438a, 2);
                j12 += 2;
                iM19150y = c10151t.m19150y();
            }
            int[] iArr = c6633c.f37595d;
            if (iArr == null || iArr.length < iM19150y) {
                iArr = new int[iM19150y];
            }
            int[] iArr2 = c6633c.f37596e;
            if (iArr2 == null || iArr2.length < iM19150y) {
                iArr2 = new int[iM19150y];
            }
            if (z10) {
                int i11 = iM19150y * 6;
                c10151t.m19121B(i11);
                aVar = m7380e(aVar, j12, c10151t.f51438a, i11);
                j12 += (long) i11;
                c10151t.m19124E(0);
                for (int i12 = 0; i12 < iM19150y; i12++) {
                    iArr[i12] = c10151t.m19150y();
                    iArr2[i12] = c10151t.m19148w();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = aVar2.f13434a - ((int) (j12 - aVar2.f13435b));
            }
            InterfaceC7522w.a aVar3 = aVar2.f13436c;
            int i13 = C10134c0.f51354a;
            byte[] bArr2 = aVar3.f41525b;
            byte[] bArr3 = c6633c.f37592a;
            c6633c.f37597f = iM19150y;
            c6633c.f37595d = iArr;
            c6633c.f37596e = iArr2;
            c6633c.f37593b = bArr2;
            c6633c.f37592a = bArr3;
            int i14 = aVar3.f41524a;
            c6633c.f37594c = i14;
            int i15 = aVar3.f41526c;
            c6633c.f37598g = i15;
            int i16 = aVar3.f41527d;
            c6633c.f37599h = i16;
            MediaCodec.CryptoInfo cryptoInfo = c6633c.f37600i;
            cryptoInfo.numSubSamples = iM19150y;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i14;
            if (C10134c0.f51354a >= 24) {
                C6633c.a aVar4 = c6633c.f37601j;
                aVar4.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = aVar4.f37603b;
                pattern.set(i15, i16);
                aVar4.f37602a.setPattern(pattern);
            }
            long j13 = aVar2.f13435b;
            int i17 = (int) (j12 - j13);
            aVar2.f13435b = j13 + ((long) i17);
            aVar2.f13434a -= i17;
        }
        if (!decoderInputBuffer.m13269m(268435456)) {
            decoderInputBuffer.m6929s(aVar2.f13434a);
            return m7379d(aVar, aVar2.f13435b, decoderInputBuffer.f12116c, aVar2.f13434a);
        }
        c10151t.m19121B(4);
        a aVarM7380e2 = m7380e(aVar, aVar2.f13435b, c10151t.f51438a, 4);
        int iM19148w = c10151t.m19148w();
        aVar2.f13435b += 4;
        aVar2.f13434a -= 4;
        decoderInputBuffer.m6929s(iM19148w);
        a aVarM7379d = m7379d(aVarM7380e2, aVar2.f13435b, decoderInputBuffer.f12116c, iM19148w);
        aVar2.f13435b += (long) iM19148w;
        int i18 = aVar2.f13434a - iM19148w;
        aVar2.f13434a = i18;
        ByteBuffer byteBuffer = decoderInputBuffer.f12119f;
        if (byteBuffer == null || byteBuffer.capacity() < i18) {
            decoderInputBuffer.f12119f = ByteBuffer.allocate(i18);
        } else {
            decoderInputBuffer.f12119f.clear();
        }
        return m7379d(aVarM7379d, aVar2.f13435b, decoderInputBuffer.f12119f, aVar2.f13434a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final void m7382a(a aVar) {
        if (aVar.f13399c == null) {
            return;
        }
        C9885j c9885j = (C9885j) this.f13390a;
        synchronized (c9885j) {
            a aVar2 = aVar;
            while (true) {
                while (true) {
                    if (aVar2 != null) {
                        try {
                            C9876a[] c9876aArr = c9885j.f50451f;
                            int i10 = c9885j.f50450e;
                            c9885j.f50450e = i10 + 1;
                            C9876a c9876a = aVar2.f13399c;
                            c9876a.getClass();
                            c9876aArr[i10] = c9876a;
                            c9885j.f50449d--;
                            aVar2 = aVar2.f13400d;
                            if (aVar2 == null || aVar2.f13399c == null) {
                                aVar2 = null;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    } else {
                        c9885j.notifyAll();
                    }
                    throw th2;
                }
            }
        }
        aVar.f13399c = null;
        aVar.f13400d = null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final void m7383b(long j10) {
        a aVar;
        if (j10 == -1) {
            return;
        }
        while (true) {
            aVar = this.f13393d;
            if (j10 < aVar.f13398b) {
                break;
            }
            InterfaceC9877b interfaceC9877b = this.f13390a;
            C9876a c9876a = aVar.f13399c;
            C9885j c9885j = (C9885j) interfaceC9877b;
            synchronized (c9885j) {
                C9876a[] c9876aArr = c9885j.f50451f;
                int i10 = c9885j.f50450e;
                c9885j.f50450e = i10 + 1;
                c9876aArr[i10] = c9876a;
                c9885j.f50449d--;
                c9885j.notifyAll();
            }
            a aVar2 = this.f13393d;
            aVar2.f13399c = null;
            a aVar3 = aVar2.f13400d;
            aVar2.f13400d = null;
            this.f13393d = aVar3;
        }
        if (this.f13394e.f13397a < aVar.f13397a) {
            this.f13394e = aVar;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public final int m7384c(int i10) {
        C9876a c9876a;
        a aVar = this.f13395f;
        if (aVar.f13399c == null) {
            C9885j c9885j = (C9885j) this.f13390a;
            synchronized (c9885j) {
                try {
                    int i11 = c9885j.f50449d + 1;
                    c9885j.f50449d = i11;
                    int i12 = c9885j.f50450e;
                    if (i12 > 0) {
                        C9876a[] c9876aArr = c9885j.f50451f;
                        int i13 = i12 - 1;
                        c9885j.f50450e = i13;
                        c9876a = c9876aArr[i13];
                        c9876a.getClass();
                        c9885j.f50451f[c9885j.f50450e] = null;
                    } else {
                        C9876a c9876a2 = new C9876a(new byte[c9885j.f50447b], 0);
                        C9876a[] c9876aArr2 = c9885j.f50451f;
                        if (i11 > c9876aArr2.length) {
                            c9885j.f50451f = (C9876a[]) Arrays.copyOf(c9876aArr2, c9876aArr2.length * 2);
                        }
                        c9876a = c9876a2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            a aVar2 = new a(this.f13391b, this.f13395f.f13398b);
            aVar.f13399c = c9876a;
            aVar.f13400d = aVar2;
        }
        return Math.min(i10, (int) (this.f13395f.f13398b - this.f13396g));
    }
}
