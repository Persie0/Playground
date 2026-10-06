package p000;

import android.media.MediaFormat;
import com.google.android.apps.camera.moments.MomentsUtils;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fqg implements fth {

    /* JADX INFO: renamed from: b */
    private static final AtomicInteger f23213b = new AtomicInteger(0);

    /* JADX INFO: renamed from: a */
    public final frl f23214a;

    /* JADX INFO: renamed from: c */
    private final fsz f23215c;

    /* JADX INFO: renamed from: d */
    private final kbo f23216d;

    /* JADX INFO: renamed from: e */
    private final dhv f23217e;

    /* JADX INFO: renamed from: f */
    private final MediaFormat f23218f;

    /* JADX INFO: renamed from: g */
    private final MediaFormat f23219g;

    /* JADX INFO: renamed from: h */
    private final long f23220h;

    /* JADX INFO: renamed from: i */
    private final mrm f23221i;

    /* JADX INFO: renamed from: j */
    private final gjj f23222j;

    /* JADX INFO: renamed from: k */
    private final gva f23223k;

    public fqg(gjj gjjVar, fsz fszVar, kbo kboVar, dhv dhvVar, frl frlVar, MediaFormat mediaFormat, MediaFormat mediaFormat2, long j, gva gvaVar, mrm mrmVar, byte[] bArr) {
        this.f23222j = gjjVar;
        this.f23215c = fszVar;
        this.f23216d = kboVar.mo6314a(frk.class.getSimpleName());
        this.f23217e = dhvVar;
        this.f23214a = frlVar;
        this.f23218f = mediaFormat;
        this.f23219g = mediaFormat2;
        this.f23220h = j;
        this.f23223k = gvaVar;
        this.f23221i = mrmVar;
    }

    /* JADX INFO: renamed from: d */
    private static int m8703d(boolean z, boolean z2) {
        if (z) {
            return z2 ? 2 : 1;
        }
        return 0;
    }

    @Override // p000.fth
    /* JADX INFO: renamed from: a */
    public final int mo8694a() {
        return 1;
    }

    @Override // p000.fth
    /* JADX INFO: renamed from: b */
    public final boolean mo8695b(key keyVar, gva gvaVar) {
        return this.f23215c.mo4208c(keyVar, gvaVar);
    }

    @Override // p000.fth
    /* JADX INFO: renamed from: c */
    public final void mo8696c(key keyVar, fua fuaVar, npk npkVar, ftg ftgVar) throws Throwable {
        kmv kmvVar;
        Throwable th;
        kmv kmvVar2;
        Throwable th2;
        int iM8703d;
        String str;
        kbs kbsVarM13951k = kbs.m13951k("fast launcher shot " + f23213b.getAndIncrement() + " ", this.f23216d);
        kbsVarM13951k.mo13940b("launcher got a HDR+ burst");
        kfd kfdVarMo7041b = keyVar.mo7041b();
        kfdVarMo7041b.getClass();
        kbsVarM13951k.mo13940b("    with frame: " + kfdVarMo7041b.f35811b);
        try {
            kpp kppVar = (kpp) MomentsUtils.m4209a(keyVar).get(5000L, TimeUnit.MILLISECONDS);
            kfd kfdVarMo7041b2 = keyVar.mo7041b();
            kfdVarMo7041b2.getClass();
            long j = kfdVarMo7041b2.f35811b;
            gmc gmcVarM9784a = this.f23223k.m9784a(keyVar);
            kpw kpwVarM9496e = gmcVarM9784a.m9496e();
            kpw kpwVarM9495d = gmcVarM9784a.m9495d();
            kpw kmuVar = kpwVarM9495d == null ? new kmu(j) : kpwVarM9495d;
            keyVar.close();
            if (kpwVarM9496e == null) {
                ftgVar.mo8683b(new RuntimeException("Could not get a raw image from input frame"));
                return;
            }
            kmv kmvVar3 = new kmv(kpwVarM9496e, 1);
            try {
                try {
                    kmv kmvVar4 = new kmv(kmuVar, 1);
                    try {
                        kbsVarM13951k.mo13940b("Acquired frame metadata successfully.");
                        kpw kpwVarM14585k = kmvVar4.m14585k();
                        if (kpwVarM14585k == null) {
                            try {
                                kbsVarM13951k.mo13942d("Failed to fork PD image");
                                try {
                                    kmvVar4.m14586l();
                                    kmvVar3.m14586l();
                                    return;
                                } catch (Throwable th3) {
                                    th = th3;
                                    kmvVar = kmvVar3;
                                    try {
                                        kmvVar.m14586l();
                                        throw th;
                                    } catch (Throwable th4) {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th4);
                                        throw th;
                                    }
                                }
                            } catch (Throwable th5) {
                                th2 = th5;
                                kmvVar2 = kmvVar4;
                                kmvVar = kmvVar3;
                                kmvVar2.m14586l();
                                throw th2;
                            }
                        }
                        kmvVar2 = kmvVar4;
                        int i = 1;
                        kmvVar = kmvVar3;
                        try {
                            fqf fqfVar = new fqf(this, kmvVar3, npkVar, j, kppVar, kmuVar, kpwVarM14585k, ftgVar, kbsVarM13951k, null, null);
                            fta ftaVarM9333a = this.f23222j.m9333a(gmcVarM9784a.m9492a().mo14193c(), kppVar, fuaVar.f23573a);
                            kbc kbcVar = fuaVar.f23581i ? new kbc(this.f23219g.getInteger("width"), this.f23219g.getInteger("height")) : new kbc(this.f23218f.getInteger("width"), this.f23218f.getInteger("height"));
                            boolean z = false;
                            if (fuaVar.f23581i) {
                                if (this.f23217e.mo6184l(dij.f11596t) && !this.f23217e.mo6184l(dij.f11566P)) {
                                    z = true;
                                }
                                iM8703d = m8703d(z, this.f23217e.mo6184l(dij.f11597u));
                            } else {
                                dhv dhvVar = this.f23217e;
                                dhw dhwVar = dij.f11577a;
                                dhvVar.mo6177e();
                                this.f23217e.mo6177e();
                                iM8703d = m8703d(false, false);
                            }
                            boolean zMo6184l = this.f23217e.mo6184l(dij.f11602z);
                            int i2 = 3;
                            if (!zMo6184l) {
                                i = 3;
                            } else if (this.f23217e.mo6184l(dij.f11573W)) {
                                i = 2;
                            }
                            if (!npkVar.f44027a || !this.f23221i.mo16813g()) {
                                i2 = i;
                            }
                            jfz jfzVar = new jfz(kbcVar, iM8703d, i2, zMo6184l ? 0L : this.f23220h);
                            kpw kpwVarM14585k2 = kmvVar.m14585k();
                            if (kpwVarM14585k2 == null) {
                                kbsVarM13951k.mo13942d("Failed to fork raw image");
                                kmvVar2.m14586l();
                                kmvVar.m14586l();
                                return;
                            }
                            this.f23215c.mo4207b(kpwVarM14585k2, ftaVarM9333a, jfzVar, fqfVar);
                            switch (i2) {
                                case 1:
                                    str = "RGBA_HARDWARE_BUFFER";
                                    break;
                                case 2:
                                    str = "YUV_HARDWARE_BUFFER";
                                    break;
                                default:
                                    str = "YUV_IMAGE";
                                    break;
                            }
                            kbsVarM13951k.mo13940b("launched FastMomentsHdr shot, outputFormat = " + str);
                            kmvVar2.m14586l();
                            kmvVar.m14586l();
                            return;
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        kmvVar2 = kmvVar4;
                        kmvVar = kmvVar3;
                    }
                    th2 = th;
                    try {
                        kmvVar2.m14586l();
                        throw th2;
                    } catch (Throwable th8) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th8);
                        throw th2;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    th = th;
                    kmvVar.m14586l();
                    throw th;
                }
            } catch (Throwable th10) {
                th = th10;
                kmvVar = kmvVar3;
                th = th;
                kmvVar.m14586l();
                throw th;
            }
        } catch (InterruptedException e) {
            kbsVarM13951k.mo13942d("metadata get interrupted");
            keyVar.close();
            ftgVar.mo8683b(e);
        } catch (ExecutionException e2) {
            kbsVarM13951k.mo13942d("Failed to acquire metadata from the first frame.");
            keyVar.close();
            ftgVar.mo8683b(e2);
        } catch (TimeoutException e3) {
            kbsVarM13951k.mo13942d("Timed out waiting for metadata.");
            keyVar.close();
            ftgVar.mo8683b(e3);
        }
    }
}
