package p000;

import android.app.Activity;
import android.os.Process;
import android.os.StrictMode;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class lmm extends lme implements ljh, lhv {

    /* JADX INFO: renamed from: b */
    private final lhz f38690b;

    /* JADX INFO: renamed from: c */
    private final oju f38691c;

    /* JADX INFO: renamed from: d */
    private final oju f38692d;

    /* JADX INFO: renamed from: e */
    private final oju f38693e;

    /* JADX INFO: renamed from: f */
    private final AtomicBoolean f38694f = new AtomicBoolean();

    public lmm(lhz lhzVar, oju ojuVar, oju ojuVar2, oju ojuVar3) {
        this.f38690b = lhzVar;
        this.f38691c = ojuVar;
        this.f38692d = ojuVar2;
        this.f38693e = ojuVar3;
    }

    /* JADX INFO: renamed from: m */
    private static long m15731m(Long l, long j) {
        return l == null ? j : Math.min(l.longValue(), j);
    }

    /* JADX INFO: renamed from: n */
    private static ozv m15732n(lmc lmcVar) {
        nxl nxlVarM18137O = ozv.f47090f.m18137O();
        if (lmcVar.f38646a != null) {
            String str = lmcVar.f38646a;
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozv ozvVar = (ozv) nxlVarM18137O.f44974b;
            str.getClass();
            ozvVar.f47092a |= 1;
            ozvVar.f47093b = str;
        }
        if (lmcVar.f38647b != null) {
            long jLongValue = lmcVar.f38647b.longValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozv ozvVar2 = (ozv) nxlVarM18137O.f44974b;
            ozvVar2.f47092a |= 2;
            ozvVar2.f47094c = jLongValue;
        }
        if (lmcVar.f38648c != null) {
            long jLongValue2 = lmcVar.f38648c.longValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozv ozvVar3 = (ozv) nxlVarM18137O.f44974b;
            ozvVar3.f47092a |= 4;
            ozvVar3.f47095d = jLongValue2;
        }
        if (lmcVar.f38649d != null) {
            long jLongValue3 = lmcVar.f38649d.longValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ozv ozvVar4 = (ozv) nxlVarM18137O.f44974b;
            ozvVar4.f47092a |= 8;
            ozvVar4.f47096e = jLongValue3;
        }
        return (ozv) nxlVarM18137O.mo18103l();
    }

    @Override // p000.ljh
    /* JADX INFO: renamed from: ao */
    public final void mo15463ao() {
        this.f38690b.m15360a(this);
    }

    /* JADX WARN: Code duplicated, block: B:68:0x012f  */
    @Override // p000.lhv
    /* JADX INFO: renamed from: d */
    public final void mo15356d(Activity activity) {
        Long lValueOf;
        long j;
        mrm mrmVarM16829i;
        mrm mrmVarM16829i2;
        this.f38690b.m15361b(this);
        lmk lmkVar = lmk.f38672a;
        if (lmkVar.f38678g > 0 || lmkVar.f38679h > 0) {
            long j2 = lmkVar.f38673b ? lmkVar.f38674c : lmkVar.f38676e;
            if (j2 <= 0) {
                return;
            }
            if (lmkVar.f38678g >= j2 || lmkVar.f38679h >= j2) {
                nxl nxlVarM18137O = ozx.f47098w.m18137O();
                boolean z = lmkVar.f38673b;
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ozx ozxVar = (ozx) nxlVarM18137O.f44974b;
                ozxVar.f47100a |= 65536;
                ozxVar.f47116q = z;
                if (lmkVar.f38673b) {
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    ozx ozxVar2 = (ozx) nxlVarM18137O.f44974b;
                    ozxVar2.f47117r = 1;
                    ozxVar2.f47100a = 131072 | ozxVar2.f47100a;
                } else {
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    ozx ozxVar3 = (ozx) nxlVarM18137O.f44974b;
                    ozxVar3.f47117r = 2;
                    ozxVar3.f47100a = 131072 | ozxVar3.f47100a;
                }
                lmj lmjVar = lmkVar.f38683l;
                if (lmjVar.f38661a) {
                    long j3 = lmkVar.f38674c;
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    ozx ozxVar4 = (ozx) nxlVarM18137O.f44974b;
                    ozxVar4.f47100a |= 16;
                    ozxVar4.f47104e = j3;
                    lValueOf = Long.valueOf(j3);
                } else {
                    lValueOf = null;
                }
                if (lmjVar.f38662b) {
                    long j4 = lmkVar.f38675d;
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    ozx ozxVar5 = (ozx) nxlVarM18137O.f44974b;
                    ozxVar5.f47100a |= 128;
                    ozxVar5.f47107h = j4;
                    lValueOf = Long.valueOf(m15731m(lValueOf, j4));
                }
                boolean z2 = lmjVar.f38663c;
                boolean z3 = lmjVar.f38664d;
                boolean z4 = lmjVar.f38665e;
                if (lmjVar.f38666f) {
                    long j5 = lmkVar.f38676e;
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    ozx ozxVar6 = (ozx) nxlVarM18137O.f44974b;
                    ozxVar6.f47100a |= 512;
                    ozxVar6.f47109j = j5;
                    lValueOf = Long.valueOf(m15731m(lValueOf, j5));
                }
                switch (((Long) this.f38693e.get()).intValue()) {
                    case 1:
                        if (!lmjVar.f38669i) {
                            j = -1;
                        } else {
                            j = lmkVar.f38679h;
                        }
                        break;
                    case 2:
                        if (!lmjVar.f38670j) {
                            j = -1;
                        } else {
                            j = lmkVar.f38680i;
                        }
                        break;
                    case 3:
                        if (!lmjVar.f38667g) {
                            j = -1;
                        } else {
                            j = lmkVar.f38678g;
                        }
                        break;
                    case 4:
                        if (!lmjVar.f38668h) {
                            j = -1;
                        } else {
                            j = lmkVar.f38677f;
                        }
                        break;
                    default:
                        j = -1;
                        break;
                }
                if (j != -1) {
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    ozx ozxVar7 = (ozx) nxlVarM18137O.f44974b;
                    ozxVar7.f47100a |= 1024;
                    ozxVar7.f47110k = j;
                    lValueOf = Long.valueOf(m15731m(lValueOf, j));
                }
                if (lmjVar.f38667g) {
                    long j6 = lmkVar.f38678g;
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    ozx ozxVar8 = (ozx) nxlVarM18137O.f44974b;
                    ozxVar8.f47100a |= 8192;
                    ozxVar8.f47113n = j6;
                    lValueOf = Long.valueOf(m15731m(lValueOf, j6));
                }
                if (lmjVar.f38668h) {
                    long j7 = lmkVar.f38677f;
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    ozx ozxVar9 = (ozx) nxlVarM18137O.f44974b;
                    ozxVar9.f47100a |= 16384;
                    ozxVar9.f47114o = j7;
                    lValueOf = Long.valueOf(m15731m(lValueOf, j7));
                }
                if (lmjVar.f38669i) {
                    long j8 = lmkVar.f38679h;
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    ozx ozxVar10 = (ozx) nxlVarM18137O.f44974b;
                    ozxVar10.f47100a |= 2048;
                    ozxVar10.f47111l = j8;
                    lValueOf = Long.valueOf(m15731m(lValueOf, j8));
                }
                if (lmjVar.f38670j) {
                    long j9 = lmkVar.f38680i;
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    ozx ozxVar11 = (ozx) nxlVarM18137O.f44974b;
                    ozxVar11.f47100a |= 4096;
                    ozxVar11.f47112m = j9;
                    lValueOf = Long.valueOf(m15731m(lValueOf, j9));
                }
                if (lmjVar.f38671k) {
                    long j10 = lmkVar.f38681j;
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    ozx ozxVar12 = (ozx) nxlVarM18137O.f44974b;
                    ozxVar12.f47100a |= 32768;
                    ozxVar12.f47115p = j10;
                    lValueOf = Long.valueOf(m15731m(lValueOf, j10));
                }
                if (lmkVar.f38684m.f38647b != null) {
                    ozv ozvVarM15732n = m15732n(lmkVar.f38684m);
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    ozx ozxVar13 = (ozx) nxlVarM18137O.f44974b;
                    ozvVarM15732n.getClass();
                    ozxVar13.f47119t = ozvVarM15732n;
                    ozxVar13.f47100a |= 524288;
                    if ((ozvVarM15732n.f47092a & 2) != 0) {
                        lValueOf = Long.valueOf(m15731m(lValueOf, ozvVarM15732n.f47094c));
                    }
                    if ((ozvVarM15732n.f47092a & 4) != 0) {
                        lValueOf = Long.valueOf(m15731m(lValueOf, ozvVarM15732n.f47095d));
                    }
                    if ((ozvVarM15732n.f47092a & 8) != 0) {
                        lValueOf = Long.valueOf(m15731m(lValueOf, ozvVarM15732n.f47096e));
                    }
                }
                if (lmkVar.f38685n.f38647b != null) {
                    ozv ozvVarM15732n2 = m15732n(lmkVar.f38685n);
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    ozx ozxVar14 = (ozx) nxlVarM18137O.f44974b;
                    ozvVarM15732n2.getClass();
                    ozxVar14.f47120u = ozvVarM15732n2;
                    ozxVar14.f47100a |= 1048576;
                    if ((ozvVarM15732n2.f47092a & 2) != 0) {
                        lValueOf = Long.valueOf(m15731m(lValueOf, ozvVarM15732n2.f47094c));
                    }
                    if ((ozvVarM15732n2.f47092a & 4) != 0) {
                        lValueOf = Long.valueOf(m15731m(lValueOf, ozvVarM15732n2.f47095d));
                    }
                    if ((ozvVarM15732n2.f47092a & 8) != 0) {
                        lValueOf = Long.valueOf(m15731m(lValueOf, ozvVarM15732n2.f47096e));
                    }
                }
                mrm mrmVarM16829i3 = lmn.f38695a;
                if (mrmVarM16829i3 == null) {
                    long jSysconf = Os.sysconf(OsConstants._SC_CLK_TCK);
                    mrm mrmVarM16829i4 = jSysconf > 0 ? mrm.m16829i(Long.valueOf(jSysconf)) : mqu.f41450a;
                    if (mrmVarM16829i4.mo16813g()) {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        byte[] bArr = new byte[440];
                        boolean z5 = false;
                        try {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(new File("/proc/self/stat"));
                                try {
                                    int i = fileInputStream.read(bArr);
                                    fileInputStream.close();
                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                    mrmVarM16829i = mrm.m16829i(ByteBuffer.wrap(bArr, 0, i));
                                } catch (Throwable th) {
                                    try {
                                        fileInputStream.close();
                                        throw th;
                                    } catch (Throwable th2) {
                                        try {
                                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                            throw th;
                                        } catch (Exception e) {
                                            throw th;
                                        }
                                    }
                                }
                            } catch (Throwable th3) {
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                throw th3;
                            }
                        } catch (IOException e2) {
                            mrmVarM16829i = mqu.f41450a;
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        }
                        if (mrmVarM16829i.mo16813g()) {
                            ByteBuffer byteBuffer = (ByteBuffer) mrmVarM16829i.mo16809c();
                            while (true) {
                                if (byteBuffer.remaining() > 17) {
                                    if (byteBuffer.get() == 40) {
                                        int i2 = 16;
                                        while (true) {
                                            if (i2 >= 0) {
                                                if (byteBuffer.get(byteBuffer.position() + i2) == 41) {
                                                    byteBuffer.position(byteBuffer.position() + i2 + 1);
                                                    if (byteBuffer.get() == 32 && lmn.m15733a(byteBuffer, 1) && lmn.m15733a(byteBuffer, 18)) {
                                                        long j11 = 0;
                                                        while (true) {
                                                            if (byteBuffer.hasRemaining()) {
                                                                byte b = byteBuffer.get();
                                                                if (b == 32) {
                                                                    if (z5) {
                                                                        mrmVarM16829i2 = mrm.m16829i(Long.valueOf(j11));
                                                                    }
                                                                } else if (b >= 48 && b <= 57 && j11 <= 922337203685477580L) {
                                                                    j11 = (j11 * 10) + ((long) (b - 48));
                                                                    z5 = true;
                                                                }
                                                            }
                                                            mrmVarM16829i2 = mqu.f41450a;
                                                        }
                                                    }
                                                } else {
                                                    i2--;
                                                }
                                            }
                                        }
                                    }
                                }
                                mrmVarM16829i2 = mqu.f41450a;
                            }
                            mrmVarM16829i3 = !mrmVarM16829i2.mo16813g() ? mqu.f41450a : mrm.m16829i(Long.valueOf(TimeUnit.SECONDS.toMillis(((Long) mrmVarM16829i2.mo16809c()).longValue()) / ((Long) mrmVarM16829i4.mo16809c()).longValue()));
                        } else {
                            mrmVarM16829i3 = mqu.f41450a;
                        }
                    } else {
                        mrmVarM16829i3 = mqu.f41450a;
                    }
                    lmn.f38695a = mrmVarM16829i3;
                }
                if (mrmVarM16829i3.mo16813g()) {
                    Long l = (Long) mrmVarM16829i3.mo16809c();
                    long jLongValue = l.longValue();
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    ozx ozxVar15 = (ozx) nxlVarM18137O.f44974b;
                    ozxVar15.f47100a |= 2;
                    ozxVar15.f47102c = jLongValue;
                    lValueOf = Long.valueOf(m15731m(lValueOf, l.longValue()));
                }
                long startElapsedRealtime = Process.getStartElapsedRealtime();
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ozx ozxVar16 = (ozx) nxlVarM18137O.f44974b;
                ozxVar16.f47100a |= 4;
                ozxVar16.f47103d = startElapsedRealtime;
                Long lValueOf2 = Long.valueOf(m15731m(lValueOf, startElapsedRealtime));
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ozx ozxVar17 = (ozx) nxlVarM18137O.f44974b;
                ozxVar17.f47100a |= 262144;
                ozxVar17.f47118s = true;
                long jLongValue2 = lValueOf2.longValue();
                boolean zBooleanValue = ((Boolean) this.f38692d.get()).booleanValue();
                if (jLongValue2 != 0) {
                    if (!zBooleanValue) {
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        ozx ozxVar18 = (ozx) nxlVarM18137O.f44974b;
                        ozxVar18.f47100a |= 1;
                        ozxVar18.f47101b = jLongValue2;
                    }
                    nxq nxqVar = nxlVarM18137O.f44974b;
                    ozx ozxVar19 = (ozx) nxqVar;
                    if ((ozxVar19.f47100a & 16) != 0) {
                        long j12 = ozxVar19.f47104e - jLongValue2;
                        if (!nxqVar.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        ozx ozxVar20 = (ozx) nxlVarM18137O.f44974b;
                        ozxVar20.f47100a |= 16;
                        ozxVar20.f47104e = j12;
                    }
                    nxq nxqVar2 = nxlVarM18137O.f44974b;
                    ozx ozxVar21 = (ozx) nxqVar2;
                    if ((ozxVar21.f47100a & 128) != 0) {
                        long j13 = ozxVar21.f47107h - jLongValue2;
                        if (!nxqVar2.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        ozx ozxVar22 = (ozx) nxlVarM18137O.f44974b;
                        ozxVar22.f47100a |= 128;
                        ozxVar22.f47107h = j13;
                    }
                    nxq nxqVar3 = nxlVarM18137O.f44974b;
                    ozx ozxVar23 = (ozx) nxqVar3;
                    if ((ozxVar23.f47100a & 256) != 0) {
                        long j14 = ozxVar23.f47108i - jLongValue2;
                        if (!nxqVar3.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        ozx ozxVar24 = (ozx) nxlVarM18137O.f44974b;
                        ozxVar24.f47100a |= 256;
                        ozxVar24.f47108i = j14;
                    }
                    nxq nxqVar4 = nxlVarM18137O.f44974b;
                    ozx ozxVar25 = (ozx) nxqVar4;
                    if ((ozxVar25.f47100a & 32) != 0) {
                        long j15 = ozxVar25.f47105f - jLongValue2;
                        if (!nxqVar4.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        ozx ozxVar26 = (ozx) nxlVarM18137O.f44974b;
                        ozxVar26.f47100a |= 32;
                        ozxVar26.f47105f = j15;
                    }
                    nxq nxqVar5 = nxlVarM18137O.f44974b;
                    ozx ozxVar27 = (ozx) nxqVar5;
                    if ((ozxVar27.f47100a & 64) != 0) {
                        long j16 = ozxVar27.f47106g - jLongValue2;
                        if (!nxqVar5.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        ozx ozxVar28 = (ozx) nxlVarM18137O.f44974b;
                        ozxVar28.f47100a |= 64;
                        ozxVar28.f47106g = j16;
                    }
                    nxq nxqVar6 = nxlVarM18137O.f44974b;
                    ozx ozxVar29 = (ozx) nxqVar6;
                    if ((ozxVar29.f47100a & 512) != 0) {
                        long j17 = ozxVar29.f47109j - jLongValue2;
                        if (!nxqVar6.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        ozx ozxVar30 = (ozx) nxlVarM18137O.f44974b;
                        ozxVar30.f47100a |= 512;
                        ozxVar30.f47109j = j17;
                    }
                    nxq nxqVar7 = nxlVarM18137O.f44974b;
                    ozx ozxVar31 = (ozx) nxqVar7;
                    if ((ozxVar31.f47100a & 1024) != 0) {
                        long j18 = ozxVar31.f47110k - jLongValue2;
                        if (!nxqVar7.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        ozx ozxVar32 = (ozx) nxlVarM18137O.f44974b;
                        ozxVar32.f47100a |= 1024;
                        ozxVar32.f47110k = j18;
                    }
                    nxq nxqVar8 = nxlVarM18137O.f44974b;
                    ozx ozxVar33 = (ozx) nxqVar8;
                    if ((ozxVar33.f47100a & 2048) != 0) {
                        long j19 = ozxVar33.f47111l - jLongValue2;
                        if (!nxqVar8.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        ozx ozxVar34 = (ozx) nxlVarM18137O.f44974b;
                        ozxVar34.f47100a |= 2048;
                        ozxVar34.f47111l = j19;
                    }
                    nxq nxqVar9 = nxlVarM18137O.f44974b;
                    ozx ozxVar35 = (ozx) nxqVar9;
                    if ((ozxVar35.f47100a & 4096) != 0) {
                        long j20 = ozxVar35.f47112m - jLongValue2;
                        if (!nxqVar9.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        ozx ozxVar36 = (ozx) nxlVarM18137O.f44974b;
                        ozxVar36.f47100a |= 4096;
                        ozxVar36.f47112m = j20;
                    }
                    nxq nxqVar10 = nxlVarM18137O.f44974b;
                    ozx ozxVar37 = (ozx) nxqVar10;
                    if ((ozxVar37.f47100a & 8192) != 0) {
                        long j21 = ozxVar37.f47113n - jLongValue2;
                        if (!nxqVar10.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        ozx ozxVar38 = (ozx) nxlVarM18137O.f44974b;
                        ozxVar38.f47100a |= 8192;
                        ozxVar38.f47113n = j21;
                    }
                    nxq nxqVar11 = nxlVarM18137O.f44974b;
                    ozx ozxVar39 = (ozx) nxqVar11;
                    if ((ozxVar39.f47100a & 16384) != 0) {
                        long j22 = ozxVar39.f47114o - jLongValue2;
                        if (!nxqVar11.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        ozx ozxVar40 = (ozx) nxlVarM18137O.f44974b;
                        ozxVar40.f47100a |= 16384;
                        ozxVar40.f47114o = j22;
                    }
                    nxq nxqVar12 = nxlVarM18137O.f44974b;
                    ozx ozxVar41 = (ozx) nxqVar12;
                    if ((ozxVar41.f47100a & 32768) != 0) {
                        long j23 = ozxVar41.f47115p - jLongValue2;
                        if (!nxqVar12.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        ozx ozxVar42 = (ozx) nxlVarM18137O.f44974b;
                        ozxVar42.f47100a |= 32768;
                        ozxVar42.f47115p = j23;
                    }
                    ozx ozxVar43 = (ozx) nxlVarM18137O.f44974b;
                    if ((ozxVar43.f47100a & 524288) != 0) {
                        ozv ozvVar = ozxVar43.f47119t;
                        if (ozvVar == null) {
                            ozvVar = ozv.f47090f;
                        }
                        ozv ozvVarM15575b = lkm.m15575b(ozvVar, jLongValue2);
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        ozx ozxVar44 = (ozx) nxlVarM18137O.f44974b;
                        ozvVarM15575b.getClass();
                        ozxVar44.f47119t = ozvVarM15575b;
                        ozxVar44.f47100a |= 524288;
                    }
                    ozx ozxVar45 = (ozx) nxlVarM18137O.f44974b;
                    if ((ozxVar45.f47100a & 1048576) != 0) {
                        ozv ozvVar2 = ozxVar45.f47120u;
                        if (ozvVar2 == null) {
                            ozvVar2 = ozv.f47090f;
                        }
                        ozv ozvVarM15575b2 = lkm.m15575b(ozvVar2, jLongValue2);
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        ozx ozxVar46 = (ozx) nxlVarM18137O.f44974b;
                        ozvVarM15575b2.getClass();
                        ozxVar46.f47120u = ozvVarM15575b2;
                        ozxVar46.f47100a |= 1048576;
                    }
                    nxq nxqVar13 = nxlVarM18137O.f44974b;
                    ozx ozxVar47 = (ozx) nxqVar13;
                    if ((ozxVar47.f47100a & 4) != 0) {
                        long j24 = ozxVar47.f47103d - jLongValue2;
                        if (!nxqVar13.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        ozx ozxVar48 = (ozx) nxlVarM18137O.f44974b;
                        ozxVar48.f47100a |= 4;
                        ozxVar48.f47103d = j24;
                    }
                    nxq nxqVar14 = nxlVarM18137O.f44974b;
                    ozx ozxVar49 = (ozx) nxqVar14;
                    if ((ozxVar49.f47100a & 2) != 0) {
                        long j25 = ozxVar49.f47102c - jLongValue2;
                        if (!nxqVar14.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        ozx ozxVar50 = (ozx) nxlVarM18137O.f44974b;
                        ozxVar50.f47100a |= 2;
                        ozxVar50.f47102c = j25;
                    }
                }
                lgp lgpVar = lmkVar.f38682k;
                if (this.f38694f.getAndSet(true)) {
                    nps npsVar = npp.f44031a;
                } else {
                    lml lmlVar = (lml) this.f38691c.get();
                    kxk.m14970P(new cnn(lmlVar, nxlVarM18137O, 8), lmlVar.f38688c);
                }
            }
        }
    }
}
