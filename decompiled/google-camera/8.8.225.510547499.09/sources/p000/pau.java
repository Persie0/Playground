package p000;

import com.google.android.apps.camera.util.p015ui.mfv.EArqVBjecl;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pau implements Cloneable, ByteChannel, paw, pav {

    /* JADX INFO: renamed from: a */
    public pbd f47298a;

    /* JADX INFO: renamed from: b */
    public long f47299b;

    /* JADX INFO: renamed from: a */
    public final byte m19258a(long j) {
        lku.m15624S(this.f47299b, j, 1L);
        pbd pbdVar = this.f47298a;
        if (pbdVar == null) {
            throw null;
        }
        long j2 = this.f47299b;
        if (j2 - j < j) {
            while (j2 > j) {
                pbdVar = pbdVar.f47320g;
                pbdVar.getClass();
                j2 -= (long) (pbdVar.f47316c - pbdVar.f47315b);
            }
            pbdVar.getClass();
            return pbdVar.f47314a[(int) ((((long) pbdVar.f47315b) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = pbdVar.f47316c;
            int i2 = pbdVar.f47315b;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                pbdVar.getClass();
                return pbdVar.f47314a[(int) ((((long) i2) + j) - j3)];
            }
            pbdVar = pbdVar.f47319f;
            pbdVar.getClass();
            j3 = j4;
        }
    }

    /* JADX INFO: renamed from: b */
    public final byte m19259b() {
        long j = this.f47299b;
        if (j == 0) {
            throw new EOFException();
        }
        pbd pbdVar = this.f47298a;
        pbdVar.getClass();
        int i = pbdVar.f47315b;
        int i2 = i + 1;
        int i3 = pbdVar.f47316c;
        byte b = pbdVar.f47314a[i];
        this.f47299b = j - 1;
        if (i2 == i3) {
            this.f47298a = pbdVar.m19287a();
            pbe.m19292b(pbdVar);
        } else {
            pbdVar.f47315b = i2;
        }
        return b;
    }

    /* JADX INFO: renamed from: c */
    public final int m19260c(byte[] bArr, int i, int i2) {
        lku.m15624S(bArr.length, i, i2);
        pbd pbdVar = this.f47298a;
        if (pbdVar == null) {
            return -1;
        }
        int iMin = Math.min(i2, pbdVar.f47316c - pbdVar.f47315b);
        byte[] bArr2 = pbdVar.f47314a;
        int i3 = pbdVar.f47315b;
        omn.m18691ae(bArr2, bArr, i, i3, i3 + iMin);
        int i4 = pbdVar.f47315b + iMin;
        pbdVar.f47315b = i4;
        this.f47299b -= (long) iMin;
        if (i4 != pbdVar.f47316c) {
            return iMin;
        }
        this.f47298a = pbdVar.m19287a();
        pbe.m19292b(pbdVar);
        return iMin;
    }

    public final /* synthetic */ Object clone() {
        pau pauVar = new pau();
        if (this.f47299b != 0) {
            pbd pbdVar = this.f47298a;
            pbdVar.getClass();
            pbd pbdVarM19288b = pbdVar.m19288b();
            pauVar.f47298a = pbdVarM19288b;
            pbdVarM19288b.f47320g = pbdVarM19288b;
            pbdVarM19288b.f47319f = pbdVarM19288b.f47320g;
            for (pbd pbdVar2 = pbdVar.f47319f; pbdVar2 != pbdVar; pbdVar2 = pbdVar2.f47319f) {
                pbd pbdVar3 = pbdVarM19288b.f47320g;
                pbdVar3.getClass();
                pbdVar2.getClass();
                pbdVar3.m19290d(pbdVar2.m19288b());
            }
            pauVar.f47299b = this.f47299b;
        }
        return pauVar;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, p000.pbg
    public final void close() {
    }

    @Override // p000.paw
    /* JADX INFO: renamed from: d */
    public final long mo19261d(pax paxVar) {
        throw null;
    }

    @Override // p000.paw
    /* JADX INFO: renamed from: e */
    public final long mo19262e(pax paxVar) {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pau)) {
            return false;
        }
        long j = this.f47299b;
        pau pauVar = (pau) obj;
        if (j != pauVar.f47299b) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        pbd pbdVar = this.f47298a;
        pbdVar.getClass();
        pbd pbdVar2 = pauVar.f47298a;
        pbdVar2.getClass();
        int i = pbdVar.f47315b;
        int i2 = pbdVar2.f47315b;
        long j2 = 0;
        while (j2 < this.f47299b) {
            long jMin = Math.min(pbdVar.f47316c - i, pbdVar2.f47316c - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (pbdVar.f47314a[i] != pbdVar2.f47314a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == pbdVar.f47316c) {
                pbdVar = pbdVar.f47319f;
                pbdVar.getClass();
                i = pbdVar.f47315b;
            }
            if (i2 == pbdVar2.f47316c) {
                pbdVar2 = pbdVar2.f47319f;
                pbdVar2.getClass();
                i2 = pbdVar2.f47315b;
            }
            j2 += jMin;
        }
        return true;
    }

    @Override // p000.paw
    /* JADX INFO: renamed from: f */
    public final InputStream mo19263f() {
        throw null;
    }

    @Override // java.io.Flushable
    public final void flush() {
    }

    /* JADX INFO: renamed from: g */
    public final String m19264g(long j, Charset charset) throws EOFException {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException("byteCount: " + j);
        }
        long j2 = this.f47299b;
        if (j2 < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        pbd pbdVar = this.f47298a;
        pbdVar.getClass();
        int i = pbdVar.f47315b;
        int i2 = pbdVar.f47316c;
        if (((long) i) + j > i2) {
            return new String(m19271n(j), charset);
        }
        int i3 = (int) j;
        String str = new String(pbdVar.f47314a, i, i3, charset);
        int i4 = i + i3;
        pbdVar.f47315b = i4;
        this.f47299b = j2 - j;
        if (i4 == i2) {
            this.f47298a = pbdVar.m19287a();
            pbe.m19292b(pbdVar);
        }
        return str;
    }

    /* JADX INFO: renamed from: h */
    public final String m19265h(long j) {
        return m19264g(j, oph.f46377a);
    }

    public final int hashCode() {
        pbd pbdVar = this.f47298a;
        if (pbdVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = pbdVar.f47316c;
            for (int i3 = pbdVar.f47315b; i3 < i2; i3++) {
                i = (i * 31) + pbdVar.f47314a[i3];
            }
            pbdVar = pbdVar.f47319f;
            pbdVar.getClass();
        } while (pbdVar != this.f47298a);
        return i;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final pbd m19267j(int i) {
        pbd pbdVar = this.f47298a;
        if (pbdVar == null) {
            pbd pbdVarM19291a = pbe.m19291a();
            this.f47298a = pbdVarM19291a;
            pbdVarM19291a.f47320g = pbdVarM19291a;
            pbdVarM19291a.f47319f = pbdVarM19291a;
            return pbdVarM19291a;
        }
        pbd pbdVar2 = pbdVar.f47320g;
        pbdVar2.getClass();
        if (pbdVar2.f47316c + i <= 8192 && pbdVar2.f47318e) {
            return pbdVar2;
        }
        pbd pbdVarM19291a2 = pbe.m19291a();
        pbdVar2.m19290d(pbdVarM19291a2);
        return pbdVarM19291a2;
    }

    /* JADX INFO: renamed from: k */
    public final void m19268k() {
        m19269l(this.f47299b);
    }

    @Override // p000.paw
    /* JADX INFO: renamed from: m */
    public final boolean mo19270m(long j) {
        throw null;
    }

    /* JADX INFO: renamed from: n */
    public final byte[] m19271n(long j) throws EOFException {
        if (this.f47299b < j) {
            throw new EOFException();
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int iM19260c = m19260c(bArr, i2, i - i2);
            if (iM19260c == -1) {
                throw new EOFException();
            }
            i2 += iM19260c;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: o */
    public final void m19272o(pbg pbgVar) {
        long j;
        pbd pbdVarM19291a;
        do {
            pau pauVar = (pau) pbgVar;
            long j2 = pauVar.f47299b;
            if (j2 == 0) {
                j = -1;
            } else {
                j = j2 < 8192 ? j2 : 8192L;
                if (pbgVar == this) {
                    throw new IllegalArgumentException("source == this");
                }
                lku.m15624S(j2, 0L, j);
                long j3 = j;
                for (long j4 = 0; j3 > j4; j4 = 0) {
                    pbd pbdVar = pauVar.f47298a;
                    pbdVar.getClass();
                    int i = pbdVar.f47316c;
                    pbdVar.getClass();
                    int i2 = i - pbdVar.f47315b;
                    int i3 = 0;
                    if (j3 < i2) {
                        pbd pbdVar2 = this.f47298a;
                        pbd pbdVar3 = pbdVar2 != null ? pbdVar2.f47320g : null;
                        if (pbdVar3 != null && pbdVar3.f47318e) {
                            if ((((long) pbdVar3.f47316c) + j3) - ((long) (pbdVar3.f47317d ? 0 : pbdVar3.f47315b)) <= 8192) {
                                pbdVar.getClass();
                                pbdVar.m19289c(pbdVar3, (int) j3);
                                pauVar.f47299b -= j3;
                                this.f47299b += j3;
                                break;
                            }
                        }
                        pbdVar.getClass();
                        int i4 = (int) j3;
                        if (i4 > i2) {
                            throw new IllegalArgumentException("byteCount out of range");
                        }
                        if (i4 >= 1024) {
                            pbdVarM19291a = pbdVar.m19288b();
                        } else {
                            pbdVarM19291a = pbe.m19291a();
                            byte[] bArr = pbdVar.f47314a;
                            byte[] bArr2 = pbdVarM19291a.f47314a;
                            int i5 = pbdVar.f47315b;
                            omn.m18691ae(bArr, bArr2, 0, i5, i5 + i4);
                        }
                        pbdVarM19291a.f47316c = pbdVarM19291a.f47315b + i4;
                        pbdVar.f47315b += i4;
                        pbd pbdVar4 = pbdVar.f47320g;
                        pbdVar4.getClass();
                        pbdVar4.m19290d(pbdVarM19291a);
                        pauVar.f47298a = pbdVarM19291a;
                    }
                    pbd pbdVar5 = pauVar.f47298a;
                    pbdVar5.getClass();
                    int i6 = pbdVar5.f47316c - pbdVar5.f47315b;
                    pauVar.f47298a = pbdVar5.m19287a();
                    pbd pbdVar6 = this.f47298a;
                    if (pbdVar6 == null) {
                        this.f47298a = pbdVar5;
                        pbdVar5.f47320g = pbdVar5;
                        pbdVar5.f47319f = pbdVar5.f47320g;
                    } else {
                        pbd pbdVar7 = pbdVar6.f47320g;
                        pbdVar7.getClass();
                        pbdVar7.m19290d(pbdVar5);
                        pbd pbdVar8 = pbdVar5.f47320g;
                        if (pbdVar8 == pbdVar5) {
                            throw new IllegalStateException("cannot compact");
                        }
                        pbdVar8.getClass();
                        if (pbdVar8.f47318e) {
                            int i7 = pbdVar5.f47316c - pbdVar5.f47315b;
                            pbdVar8.getClass();
                            int i8 = 8192 - pbdVar8.f47316c;
                            pbdVar8.getClass();
                            if (!pbdVar8.f47317d) {
                                pbdVar8.getClass();
                                i3 = pbdVar8.f47315b;
                            }
                            if (i7 <= i8 + i3) {
                                pbdVar8.getClass();
                                pbdVar5.m19289c(pbdVar8, i7);
                                pbdVar5.m19287a();
                                pbe.m19292b(pbdVar5);
                            }
                        }
                    }
                    long j5 = i6;
                    pauVar.f47299b -= j5;
                    this.f47299b += j5;
                    j3 -= j5;
                }
            }
        } while (j != -1);
    }

    /* JADX INFO: renamed from: p */
    public final void m19273p(int i) {
        pbd pbdVarM19267j = m19267j(1);
        byte[] bArr = pbdVarM19267j.f47314a;
        int i2 = pbdVarM19267j.f47316c;
        pbdVarM19267j.f47316c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f47299b++;
    }

    @Override // p000.pav
    /* JADX INFO: renamed from: q */
    public final /* bridge */ /* synthetic */ void mo19274q() {
        m19273p(34);
    }

    /* JADX INFO: renamed from: r */
    public final void m19275r(int i) {
        pbd pbdVarM19267j = m19267j(4);
        byte[] bArr = pbdVarM19267j.f47314a;
        int i2 = pbdVarM19267j.f47316c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >> 24);
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i4 = i3 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        int i5 = i4 + 1;
        bArr[i5] = (byte) (i & 255);
        pbdVarM19267j.f47316c = i5 + 1;
        this.f47299b += 4;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        pbd pbdVar = this.f47298a;
        if (pbdVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), pbdVar.f47316c - pbdVar.f47315b);
        byteBuffer.put(pbdVar.f47314a, pbdVar.f47315b, iMin);
        int i = pbdVar.f47315b + iMin;
        pbdVar.f47315b = i;
        this.f47299b -= (long) iMin;
        if (i == pbdVar.f47316c) {
            this.f47298a = pbdVar.m19287a();
            pbe.m19292b(pbdVar);
        }
        return iMin;
    }

    /* JADX INFO: renamed from: s */
    public final void m19276s(String str, int i, int i2) {
        str.getClass();
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i);
        }
        if (i2 < i) {
            throw new IllegalArgumentException(EArqVBjecl.xbG + i2 + " < " + i);
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                pbd pbdVarM19267j = m19267j(1);
                byte[] bArr = pbdVarM19267j.f47314a;
                int i3 = pbdVarM19267j.f47316c - i;
                int iMin = Math.min(i2, 8192 - i3);
                bArr[i + i3] = (byte) cCharAt;
                i++;
                while (i < iMin) {
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    bArr[i + i3] = (byte) cCharAt2;
                    i++;
                }
                int i4 = pbdVarM19267j.f47316c;
                int i5 = (i3 + i) - i4;
                pbdVarM19267j.f47316c = i4 + i5;
                this.f47299b += (long) i5;
            } else if (cCharAt < 2048) {
                pbd pbdVarM19267j2 = m19267j(2);
                byte[] bArr2 = pbdVarM19267j2.f47314a;
                int i6 = pbdVarM19267j2.f47316c;
                bArr2[i6] = (byte) ((cCharAt >> 6) | 192);
                bArr2[i6 + 1] = (byte) ((cCharAt & '?') | 128);
                pbdVarM19267j2.f47316c = i6 + 2;
                this.f47299b += 2;
                i++;
            } else if (cCharAt < 55296 || cCharAt > 57343) {
                pbd pbdVarM19267j3 = m19267j(3);
                byte[] bArr3 = pbdVarM19267j3.f47314a;
                int i7 = pbdVarM19267j3.f47316c;
                bArr3[i7] = (byte) ((cCharAt >> '\f') | 224);
                bArr3[i7 + 1] = (byte) ((63 & (cCharAt >> 6)) | 128);
                bArr3[i7 + 2] = (byte) ((cCharAt & '?') | 128);
                pbdVarM19267j3.f47316c = i7 + 3;
                this.f47299b += 3;
                i++;
            } else {
                int i8 = i + 1;
                char cCharAt3 = i8 < i2 ? str.charAt(i8) : (char) 0;
                if (cCharAt > 56319 || cCharAt3 < 56320 || cCharAt3 >= 57344) {
                    m19273p(63);
                    i = i8;
                } else {
                    pbd pbdVarM19267j4 = m19267j(4);
                    byte[] bArr4 = pbdVarM19267j4.f47314a;
                    int i9 = pbdVarM19267j4.f47316c;
                    int i10 = (((cCharAt & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                    bArr4[i9] = (byte) ((i10 >> 18) | 240);
                    bArr4[i9 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                    bArr4[i9 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                    bArr4[i9 + 3] = (byte) ((i10 & 63) | 128);
                    pbdVarM19267j4.f47316c = i9 + 4;
                    this.f47299b += 4;
                    i += 2;
                }
            }
        }
    }

    @Override // p000.pbg
    /* JADX INFO: renamed from: t */
    public final long mo19277t(pau pauVar) {
        throw null;
    }

    public final String toString() {
        long j = this.f47299b;
        if (j <= 2147483647L) {
            return m19266i((int) j).toString();
        }
        throw new IllegalStateException("size > Int.MAX_VALUE: " + j);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            pbd pbdVarM19267j = m19267j(1);
            int iMin = Math.min(i, 8192 - pbdVarM19267j.f47316c);
            byteBuffer.get(pbdVarM19267j.f47314a, pbdVarM19267j.f47316c, iMin);
            i -= iMin;
            pbdVarM19267j.f47316c += iMin;
        }
        this.f47299b += (long) iRemaining;
        return iRemaining;
    }

    /* JADX INFO: renamed from: l */
    public final void m19269l(long j) {
        while (j > 0) {
            pbd pbdVar = this.f47298a;
            if (pbdVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, pbdVar.f47316c - pbdVar.f47315b);
            long j2 = iMin;
            this.f47299b -= j2;
            j -= j2;
            int i = pbdVar.f47315b + iMin;
            pbdVar.f47315b = i;
            if (i == pbdVar.f47316c) {
                this.f47298a = pbdVar.m19287a();
                pbe.m19292b(pbdVar);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final pax m19266i(int i) {
        if (i == 0) {
            return pax.f47300a;
        }
        lku.m15624S(this.f47299b, 0L, i);
        pbd pbdVar = this.f47298a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            pbdVar.getClass();
            int i5 = pbdVar.f47316c;
            int i6 = pbdVar.f47315b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            pbdVar = pbdVar.f47319f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 + i4];
        pbd pbdVar2 = this.f47298a;
        int i7 = 0;
        while (i2 < i) {
            pbdVar2.getClass();
            bArr[i7] = pbdVar2.f47314a;
            i2 += pbdVar2.f47316c - pbdVar2.f47315b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = pbdVar2.f47315b;
            pbdVar2.f47317d = true;
            i7++;
            pbdVar2 = pbdVar2.f47319f;
        }
        return new pbf(bArr, iArr);
    }
}
