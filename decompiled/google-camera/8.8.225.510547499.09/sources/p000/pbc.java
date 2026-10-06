package p000;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pbc implements paw {

    /* JADX INFO: renamed from: a */
    public final pbg f47311a;

    /* JADX INFO: renamed from: b */
    public final pau f47312b = new pau();

    /* JADX INFO: renamed from: c */
    public boolean f47313c;

    public pbc(pbg pbgVar) {
        this.f47311a = pbgVar;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, p000.pbg
    public final void close() {
        if (this.f47313c) {
            return;
        }
        this.f47313c = true;
        this.f47311a.close();
        this.f47312b.m19268k();
    }

    @Override // p000.paw
    /* JADX INFO: renamed from: d */
    public final long mo19261d(pax paxVar) {
        pax paxVar2;
        long j;
        long j2;
        pbc pbcVar = this;
        pax paxVar3 = paxVar;
        paxVar.getClass();
        if (pbcVar.f47313c) {
            throw new IllegalStateException("closed");
        }
        long j3 = 0;
        long jMax = 0;
        while (true) {
            pau pauVar = pbcVar.f47312b;
            if (paxVar.mo19280b() <= 0) {
                throw new IllegalArgumentException("bytes is empty");
            }
            if (jMax < j3) {
                throw new IllegalArgumentException("fromIndex < 0: " + jMax);
            }
            pbd pbdVar = pauVar.f47298a;
            if (pbdVar != null) {
                long j4 = pauVar.f47299b;
                if (j4 - jMax >= jMax) {
                    long j5 = 0;
                    while (true) {
                        long j6 = ((long) (pbdVar.f47316c - pbdVar.f47315b)) + j5;
                        if (j6 > jMax) {
                            break;
                        }
                        pbdVar = pbdVar.f47319f;
                        pbdVar.getClass();
                        j5 = j6;
                    }
                    paxVar2 = paxVar;
                    if (pbdVar != null) {
                        byte[] bArr = paxVar2.f47301b;
                        byte b = bArr[0];
                        int iMo19280b = paxVar.mo19280b();
                        long j7 = (pauVar.f47299b - ((long) iMo19280b)) + 1;
                        long j8 = jMax;
                        while (true) {
                            if (j5 >= j7) {
                                j = jMax;
                                j2 = -1;
                                break;
                            }
                            byte[] bArr2 = pbdVar.f47314a;
                            j = jMax;
                            int iMin = (int) Math.min(pbdVar.f47316c, (((long) pbdVar.f47315b) + j7) - j5);
                            for (int i = (int) ((((long) pbdVar.f47315b) + j8) - j5); i < iMin; i++) {
                                if (bArr2[i] == b && pbh.m19296a(pbdVar, i + 1, bArr, iMo19280b)) {
                                    j2 = j5 + ((long) (i - pbdVar.f47315b));
                                    break;
                                }
                            }
                            j8 = j5 + ((long) (pbdVar.f47316c - pbdVar.f47315b));
                            pbdVar = pbdVar.f47319f;
                            pbdVar.getClass();
                            j5 = j8;
                            jMax = j;
                        }
                    } else {
                        j = jMax;
                        j2 = -1;
                    }
                } else {
                    while (j4 > jMax) {
                        pbdVar = pbdVar.f47320g;
                        pbdVar.getClass();
                        j4 -= (long) (pbdVar.f47316c - pbdVar.f47315b);
                    }
                    if (pbdVar != null) {
                        byte[] bArr3 = paxVar3.f47301b;
                        byte b2 = bArr3[0];
                        int iMo19280b2 = paxVar.mo19280b();
                        long j9 = (pauVar.f47299b - ((long) iMo19280b2)) + 1;
                        pbd pbdVar2 = pbdVar;
                        long j10 = jMax;
                        while (true) {
                            if (j4 >= j9) {
                                paxVar2 = paxVar;
                                j = jMax;
                                j2 = -1;
                                break;
                            }
                            byte[] bArr4 = pbdVar2.f47314a;
                            int iMin2 = (int) Math.min(pbdVar2.f47316c, (((long) pbdVar2.f47315b) + j9) - j4);
                            for (int i2 = (int) ((((long) pbdVar2.f47315b) + j10) - j4); i2 < iMin2; i2++) {
                                if (bArr4[i2] == b2 && pbh.m19296a(pbdVar2, i2 + 1, bArr3, iMo19280b2)) {
                                    j2 = ((long) (i2 - pbdVar2.f47315b)) + j4;
                                    paxVar2 = paxVar;
                                    j = jMax;
                                    break;
                                }
                            }
                            j10 = j4 + ((long) (pbdVar2.f47316c - pbdVar2.f47315b));
                            pbdVar2 = pbdVar2.f47319f;
                            pbdVar2.getClass();
                            j4 = j10;
                        }
                    } else {
                        paxVar2 = paxVar3;
                        j = jMax;
                        j2 = -1;
                    }
                }
            } else {
                paxVar2 = paxVar3;
                j = jMax;
                j2 = -1;
            }
            if (j2 != -1) {
                return j2;
            }
            pbcVar = this;
            pau pauVar2 = pbcVar.f47312b;
            long j11 = pauVar2.f47299b;
            if (pbcVar.f47311a.mo19277t(pauVar2) == -1) {
                return -1L;
            }
            jMax = Math.max(j, (j11 - ((long) paxVar.mo19280b())) + 1);
            paxVar3 = paxVar2;
            j3 = 0;
        }
    }

    @Override // p000.paw
    /* JADX INFO: renamed from: e */
    public final long mo19262e(pax paxVar) {
        long j;
        paxVar.getClass();
        if (this.f47313c) {
            throw new IllegalStateException("closed");
        }
        long j2 = 0;
        long jMax = 0;
        while (true) {
            pau pauVar = this.f47312b;
            if (jMax < j2) {
                throw new IllegalArgumentException("fromIndex < 0: " + jMax);
            }
            pbd pbdVar = pauVar.f47298a;
            if (pbdVar != null) {
                long j3 = pauVar.f47299b;
                if (j3 - jMax >= jMax) {
                    long j4 = 0;
                    while (true) {
                        long j5 = ((long) (pbdVar.f47316c - pbdVar.f47315b)) + j4;
                        if (j5 > jMax) {
                            break;
                        }
                        pbdVar = pbdVar.f47319f;
                        pbdVar.getClass();
                        j4 = j5;
                    }
                    if (pbdVar == null) {
                        j = -1;
                    } else if (paxVar.mo19280b() != 2) {
                        byte[] bArr = paxVar.f47301b;
                        long j6 = jMax;
                        while (true) {
                            if (j4 >= pauVar.f47299b) {
                                j = -1;
                                break;
                            }
                            byte[] bArr2 = pbdVar.f47314a;
                            long j7 = ((long) pbdVar.f47315b) + j6;
                            int i = pbdVar.f47316c;
                            for (int i2 = (int) (j7 - j4); i2 < i; i2++) {
                                byte b = bArr2[i2];
                                for (byte b2 : bArr) {
                                    if (b == b2) {
                                        j = ((long) (i2 - pbdVar.f47315b)) + j4;
                                        break;
                                    }
                                }
                            }
                            j6 = ((long) (pbdVar.f47316c - pbdVar.f47315b)) + j4;
                            pbdVar = pbdVar.f47319f;
                            pbdVar.getClass();
                            j4 = j6;
                        }
                    } else {
                        byte bMo19279a = paxVar.mo19279a(0);
                        byte bMo19279a2 = paxVar.mo19279a(1);
                        long j8 = jMax;
                        while (true) {
                            if (j4 < pauVar.f47299b) {
                                byte[] bArr3 = pbdVar.f47314a;
                                long j9 = ((long) pbdVar.f47315b) + j8;
                                int i3 = pbdVar.f47316c;
                                int i4 = (int) (j9 - j4);
                                while (true) {
                                    if (i4 >= i3) {
                                        j8 = ((long) (pbdVar.f47316c - pbdVar.f47315b)) + j4;
                                        pbdVar = pbdVar.f47319f;
                                        pbdVar.getClass();
                                        j4 = j8;
                                    } else {
                                        byte b3 = bArr3[i4];
                                        if (b3 == bMo19279a || b3 == bMo19279a2) {
                                            j = ((long) (i4 - pbdVar.f47315b)) + j4;
                                        } else {
                                            i4++;
                                        }
                                    }
                                }
                            } else {
                                j = -1;
                            }
                        }
                    }
                } else {
                    while (j3 > jMax) {
                        pbdVar = pbdVar.f47320g;
                        pbdVar.getClass();
                        j3 -= (long) (pbdVar.f47316c - pbdVar.f47315b);
                    }
                    if (pbdVar == null) {
                        j = -1;
                    } else if (paxVar.mo19280b() != 2) {
                        byte[] bArr4 = paxVar.f47301b;
                        long j10 = jMax;
                        while (true) {
                            if (j3 >= pauVar.f47299b) {
                                j = -1;
                                break;
                            }
                            byte[] bArr5 = pbdVar.f47314a;
                            long j11 = ((long) pbdVar.f47315b) + j10;
                            int i5 = pbdVar.f47316c;
                            for (int i6 = (int) (j11 - j3); i6 < i5; i6++) {
                                byte b4 = bArr5[i6];
                                for (byte b5 : bArr4) {
                                    if (b4 == b5) {
                                        j = ((long) (i6 - pbdVar.f47315b)) + j3;
                                        break;
                                    }
                                }
                            }
                            j10 = ((long) (pbdVar.f47316c - pbdVar.f47315b)) + j3;
                            pbdVar = pbdVar.f47319f;
                            pbdVar.getClass();
                            j3 = j10;
                        }
                    } else {
                        byte bMo19279a3 = paxVar.mo19279a(0);
                        byte bMo19279a4 = paxVar.mo19279a(1);
                        long j12 = jMax;
                        while (true) {
                            if (j3 < pauVar.f47299b) {
                                byte[] bArr6 = pbdVar.f47314a;
                                long j13 = ((long) pbdVar.f47315b) + j12;
                                int i7 = pbdVar.f47316c;
                                int i8 = (int) (j13 - j3);
                                while (true) {
                                    if (i8 >= i7) {
                                        j12 = j3 + ((long) (pbdVar.f47316c - pbdVar.f47315b));
                                        pbdVar = pbdVar.f47319f;
                                        pbdVar.getClass();
                                        j3 = j12;
                                    } else {
                                        byte b6 = bArr6[i8];
                                        if (b6 == bMo19279a3 || b6 == bMo19279a4) {
                                            j = ((long) (i8 - pbdVar.f47315b)) + j3;
                                        } else {
                                            i8++;
                                        }
                                    }
                                }
                            } else {
                                j = -1;
                            }
                        }
                    }
                }
            } else {
                j = -1;
            }
            if (j != -1) {
                return j;
            }
            pau pauVar2 = this.f47312b;
            long j14 = pauVar2.f47299b;
            if (this.f47311a.mo19277t(pauVar2) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j14);
            j2 = 0;
        }
    }

    @Override // p000.paw
    /* JADX INFO: renamed from: f */
    public final InputStream mo19263f() {
        return new pbb(this);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f47313c;
    }

    @Override // p000.paw
    /* JADX INFO: renamed from: m */
    public final boolean mo19270m(long j) {
        pau pauVar;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.f47313c) {
            throw new IllegalStateException("closed");
        }
        do {
            pauVar = this.f47312b;
            if (pauVar.f47299b >= j) {
                return true;
            }
        } while (this.f47311a.mo19277t(pauVar) != -1);
        return false;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        pau pauVar = this.f47312b;
        if (pauVar.f47299b == 0 && this.f47311a.mo19277t(pauVar) == -1) {
            return -1;
        }
        return this.f47312b.read(byteBuffer);
    }

    @Override // p000.pbg
    /* JADX INFO: renamed from: t */
    public final long mo19277t(pau pauVar) {
        throw null;
    }

    public final String toString() {
        return "buffer(" + this.f47311a + ")";
    }
}
