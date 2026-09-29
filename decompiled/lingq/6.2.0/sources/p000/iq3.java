package p000;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public final class iq3 implements yd9 {

    /* JADX INFO: renamed from: a */
    public byte f44421a;

    /* JADX INFO: renamed from: b */
    public final e18 f44422b;

    /* JADX INFO: renamed from: c */
    public final Inflater f44423c;

    /* JADX INFO: renamed from: d */
    public final n44 f44424d;

    /* JADX INFO: renamed from: e */
    public final CRC32 f44425e;

    public iq3(hj0 hj0Var) {
        hj0Var.getClass();
        e18 e18Var = new e18(hj0Var);
        this.f44422b = e18Var;
        Inflater inflater = new Inflater(true);
        this.f44423c = inflater;
        this.f44424d = new n44(e18Var, inflater);
        this.f44425e = new CRC32();
    }

    /* JADX INFO: renamed from: a */
    public static void m14073a(int i, String str, int i2) throws IOException {
        if (i2 == i) {
            return;
        }
        StringBuilder sbM22999v = ux5.m22999v(str, ": actual 0x");
        sbM22999v.append(vk9.m23396s0(8, te1.m21984Q(i2)));
        sbM22999v.append(" != expected 0x");
        sbM22999v.append(vk9.m23396s0(8, te1.m21984Q(i)));
        throw new IOException(sbM22999v.toString());
    }

    @Override // p000.yd9
    /* JADX INFO: renamed from: F */
    public final long mo459F(aj0 aj0Var, long j) throws IOException {
        iq3 iq3Var = this;
        aj0Var.getClass();
        if (j < 0) {
            C3386nv.m17624j(wq1.m24116l("byteCount < 0: ", j));
            return 0L;
        }
        if (j == 0) {
            return 0L;
        }
        byte b = iq3Var.f44421a;
        CRC32 crc32 = iq3Var.f44425e;
        e18 e18Var = iq3Var.f44422b;
        if (b == 0) {
            e18Var.mo475b0(10L);
            aj0 aj0Var2 = e18Var.f36575b;
            byte bM494q = aj0Var2.m494q(3L);
            boolean z = ((bM494q >> 1) & 1) == 1;
            if (z) {
                iq3Var.m14074b(aj0Var2, 0L, 10L);
            }
            m14073a(8075, "ID1ID2", e18Var.readShort());
            e18Var.skip(8L);
            if (((bM494q >> 2) & 1) == 1) {
                e18Var.mo475b0(2L);
                if (z) {
                    m14074b(aj0Var2, 0L, 2L);
                }
                long jMo469V = aj0Var2.mo469V() & 65535;
                e18Var.mo475b0(jMo469V);
                if (z) {
                    m14074b(aj0Var2, 0L, jMo469V);
                }
                e18Var.skip(jMo469V);
            }
            if (((bM494q >> 3) & 1) == 1) {
                long jM10788b = e18Var.m10788b((byte) 0, 0L, Long.MAX_VALUE);
                if (jM10788b == -1) {
                    throw new EOFException();
                }
                if (z) {
                    m14074b(aj0Var2, 0L, jM10788b + 1);
                }
                e18Var.skip(jM10788b + 1);
            }
            if (((bM494q >> 4) & 1) == 1) {
                long jM10788b2 = e18Var.m10788b((byte) 0, 0L, Long.MAX_VALUE);
                if (jM10788b2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    iq3Var = this;
                    iq3Var.m14074b(aj0Var2, 0L, jM10788b2 + 1);
                } else {
                    iq3Var = this;
                }
                e18Var.skip(jM10788b2 + 1);
            } else {
                iq3Var = this;
            }
            if (z) {
                m14073a(e18Var.mo469V(), "FHCRC", (short) crc32.getValue());
                crc32.reset();
            }
            iq3Var.f44421a = (byte) 1;
        }
        if (iq3Var.f44421a == 1) {
            long j2 = aj0Var.f723b;
            long jMo459F = iq3Var.f44424d.mo459F(aj0Var, j);
            if (jMo459F != -1) {
                iq3Var.m14074b(aj0Var, j2, jMo459F);
                return jMo459F;
            }
            iq3Var.f44421a = (byte) 2;
        }
        if (iq3Var.f44421a == 2) {
            m14073a(e18Var.mo465Q(), "CRC", (int) crc32.getValue());
            m14073a(e18Var.mo465Q(), "ISIZE", (int) iq3Var.f44423c.getBytesWritten());
            iq3Var.f44421a = (byte) 3;
            if (!e18Var.m10787a()) {
                v63.m23133k("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }

    /* JADX INFO: renamed from: b */
    public final void m14074b(aj0 aj0Var, long j, long j2) {
        zt8 zt8Var = aj0Var.f722a;
        zt8Var.getClass();
        while (true) {
            int i = zt8Var.f72155c;
            int i2 = zt8Var.f72154b;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            zt8Var = zt8Var.f72158f;
            zt8Var.getClass();
        }
        while (j2 > 0) {
            int i3 = (int) (((long) zt8Var.f72154b) + j);
            int iMin = (int) Math.min(zt8Var.f72155c - i3, j2);
            this.f44425e.update(zt8Var.f72153a, i3, iMin);
            j2 -= (long) iMin;
            zt8Var = zt8Var.f72158f;
            zt8Var.getClass();
            j = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f44424d.close();
    }

    @Override // p000.yd9, p000.t89
    /* JADX INFO: renamed from: i */
    public final c1a mo484i() {
        return this.f44422b.f36574a.mo484i();
    }
}
