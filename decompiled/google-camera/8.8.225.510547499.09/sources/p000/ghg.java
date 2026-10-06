package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ghg implements ggx {

    /* JADX INFO: renamed from: a */
    private final kbz f24740a;

    /* JADX INFO: renamed from: b */
    private final kbo f24741b;

    /* JADX INFO: renamed from: c */
    private final jwn f24742c;

    /* JADX INFO: renamed from: d */
    private final jwn f24743d;

    /* JADX INFO: renamed from: e */
    private final imu f24744e;

    /* JADX INFO: renamed from: f */
    private final boolean f24745f;

    /* JADX INFO: renamed from: g */
    private final int f24746g;

    /* JADX INFO: renamed from: h */
    private final boolean f24747h;

    /* JADX INFO: renamed from: i */
    private final mrm f24748i;

    /* JADX INFO: renamed from: j */
    private final ggs f24749j;

    /* JADX INFO: renamed from: k */
    private final npu f24750k;

    /* JADX INFO: renamed from: l */
    private final bkn f24751l;

    public ghg(kbz kbzVar, kbn kbnVar, bkn bknVar, jwn jwnVar, jwn jwnVar2, imu imuVar, dhv dhvVar, fvu fvuVar, oju ojuVar, ggs ggsVar, jvb jvbVar, npu npuVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        mrm mrmVarM16829i;
        this.f24740a = kbzVar;
        kbo kboVarMo6314a = kbnVar.mo6314a("PckConv3A");
        this.f24741b = kboVarMo6314a;
        this.f24751l = bknVar;
        this.f24742c = jwnVar;
        this.f24743d = jwnVar2;
        this.f24744e = imuVar;
        this.f24745f = dhvVar.mo6184l(did.f11437ap);
        this.f24746g = ((Integer) dhvVar.mo6173a(did.f11466t).orElse(3000)).intValue();
        boolean zMo6184l = dhvVar.mo6184l(dhu.f11207i);
        this.f24747h = zMo6184l;
        this.f24749j = ggsVar;
        this.f24750k = npuVar;
        if (zMo6184l) {
            eat eatVar = (eat) ojuVar.get();
            String strValueOf = String.valueOf(String.valueOf(fvuVar.mo14558k()));
            cci cciVar = new cci(fvuVar, eatVar, kboVarMo6314a, "conv3A-".concat(strValueOf), ((Float) dhvVar.mo6180h(dhu.f11208j).orElse(Float.valueOf(300.0f))).floatValue());
            jvbVar.m13537d(cciVar);
            cciVar.m3434b();
            mrmVarM16829i = mrm.m16829i(cciVar);
        } else {
            mrmVarM16829i = mqu.f41450a;
        }
        this.f24748i = mrmVarM16829i;
    }

    @Override // p000.ggx
    /* JADX INFO: renamed from: a */
    public final nps mo9235a(kfo kfoVar, kge kgeVar) {
        return this.f24750k.submit(new ghf(this, kfoVar, kgeVar, 0));
    }

    /* JADX INFO: renamed from: b */
    public final fuw m9251b(kfo kfoVar, kge kgeVar) {
        long j;
        mrm mrmVarM16829i;
        kgd kgdVarM14187a = kge.m14187a();
        kgdVarM14187a.m14184c(((Boolean) ((jwf) this.f24751l.f3651a).f34942d).booleanValue() ? 1 : kgeVar.f35880c);
        kgdVarM14187a.m14183b(kgeVar.f35879b);
        kgdVarM14187a.m14186e(kgeVar.f35881d);
        kgdVarM14187a.m14185d(kgeVar.f35878a);
        kge kgeVarM14182a = kgdVarM14187a.m14182a();
        try {
            try {
                this.f24741b.mo13940b("Acquiring 3A lock.");
                this.f24740a.mo13961e("3A");
                boolean z = this.f24744e.m11486a((String) this.f24743d.mo3831be()).mo14538G() && kgeVarM14182a.f35880c != 1;
                long j2 = -1;
                if (z) {
                    int i = kgeVarM14182a.f35880c;
                    kew kewVarMo14152a = kfoVar.mo14152a();
                    if (i == 3) {
                        this.f24741b.mo13940b("Switching AF Mode to AUTO for AF requirement CONVERGED");
                        ((kir) kewVarMo14152a).f36196b = 1;
                        mrmVarM16829i = mrm.m16829i((kfd) kfoVar.mo14155d(((kir) kewVarMo14152a).m14365d()).get());
                    } else if (m9250c(i)) {
                        this.f24741b.mo13940b("AF was in implicit manual mode, changing AF to continuous mode and locking immediately.");
                        kew kewVarMo14152a2 = kfoVar.mo14152a();
                        ((kir) kewVarMo14152a2).f36196b = 4;
                        mrmVarM16829i = mrm.m16829i((kfd) kfoVar.mo14159h(((kir) kewVarMo14152a2).m14365d()).get());
                    } else {
                        mrmVarM16829i = mqu.f41450a;
                    }
                    if (mrmVarM16829i.mo16813g()) {
                        j2 = ((kfd) mrmVarM16829i.mo16809c()).f35812c;
                    }
                }
                boolean z2 = z && !m9250c(kgeVarM14182a.f35880c);
                int i2 = kgeVarM14182a.f35879b;
                boolean z3 = i2 == 3 || i2 == 4;
                boolean z4 = kgeVarM14182a.f35881d == 3;
                if (z2 || z3 || z4) {
                    this.f24741b.mo13940b("triggering af and locking ae/awb as needed, afTrigger=" + z2 + ", lockAe=" + z3 + ", lockAwb=" + z4);
                    kgd kgdVarM14187a2 = kge.m14187a();
                    kgdVarM14187a2.m14184c(z2 ? kgeVarM14182a.f35880c : 1);
                    kgdVarM14187a2.m14183b(z3 ? kgeVarM14182a.f35879b : 1);
                    kgdVarM14187a2.m14186e(z4 ? kgeVarM14182a.f35881d : 1);
                    int i3 = kgeVarM14182a.f35879b;
                    boolean z5 = i3 == 3;
                    Long l = null;
                    if (i3 == 0) {
                        throw null;
                    }
                    kgdVarM14187a2.m14185d(z5);
                    nps npsVarM14309c = ((khm) kfoVar).f36060a.m14309c(kgdVarM14187a2.m14182a(), false);
                    int i4 = kgeVarM14182a.f35880c;
                    if (this.f24747h) {
                        mrm mrmVar = this.f24748i;
                        if (mrmVar.mo16813g() && i4 == 2) {
                            if (((cci) mrmVar.mo16809c()).m3435c()) {
                                this.f24741b.mo13940b("Too much motion. Not safe to skip Af lock.");
                            } else {
                                ggw ggwVar = new ggw();
                                this.f24741b.mo13940b("Waiting for Af to converge.");
                                this.f24749j.m9230n(ggwVar);
                                try {
                                    synchronized (ggwVar) {
                                        while (ggwVar.f24706a) {
                                            ggwVar.wait();
                                        }
                                    }
                                    Long l2 = ggwVar.f24707b;
                                    this.f24741b.mo13940b("Done waiting for Af to converge.");
                                    this.f24741b.mo13940b("Remove af convergence listener.");
                                    this.f24749j.m9231o(ggwVar);
                                    l = l2;
                                } catch (Throwable th) {
                                    this.f24741b.mo13940b("Remove af convergence listener.");
                                    this.f24749j.m9231o(ggwVar);
                                    throw th;
                                }
                            }
                        }
                    }
                    if (l != null) {
                        long jLongValue = l.longValue();
                        this.f24741b.mo13940b("Safe to skip waiting for AF lock. converged frame number=" + jLongValue);
                        j = jLongValue;
                    } else if (this.f24745f && z2 && kgeVarM14182a.f35880c == 2) {
                        try {
                            j = ((kfd) npsVarM14309c.get(this.f24746g, TimeUnit.MILLISECONDS)).f35812c;
                        } catch (TimeoutException e) {
                            this.f24741b.mo13940b("Timeout of " + this.f24746g + "ms caught when waiting for AF lock. Locking AF again immediately.");
                            kew kewVarMo14152a3 = kfoVar.mo14152a();
                            ((kir) kewVarMo14152a3).f36196b = 0;
                            kfoVar.mo14159h(((kir) kewVarMo14152a3).m14365d());
                            kew kewVarMo14152a4 = kfoVar.mo14152a();
                            ((kir) kewVarMo14152a4).f36196b = 4;
                            j = ((kfd) kfoVar.mo14159h(((kir) kewVarMo14152a4).m14365d()).get()).f35812c;
                        }
                    } else {
                        j = ((kfd) npsVarM14309c.get()).f35812c;
                    }
                } else {
                    j = j2;
                }
                this.f24741b.mo13940b("3A lock acquired at frame " + j);
                ghh ghhVar = new ghh(kfoVar, j, z, z3, z4);
                this.f24740a.mo13962f();
                return ghhVar;
            } catch (Throwable th2) {
                this.f24740a.mo13962f();
                throw th2;
            }
        } catch (CancellationException | ExecutionException e2) {
            throw new InterruptedException("Failed to acquire 3A lock. " + String.valueOf(e2.getCause()));
        }
    }

    /* JADX INFO: renamed from: c */
    private final boolean m9250c(int i) {
        if (i == 0) {
            throw null;
        }
        boolean z = i == 4 || i == 2;
        return z && ((gzk) this.f24742c.mo3831be()).equals(gzk.ON_LOCKED);
    }
}
