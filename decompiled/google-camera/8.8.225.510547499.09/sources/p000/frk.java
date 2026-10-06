package p000;

import androidx.work.impl.background.systemalarm.vIy.VCYBIzY;
import com.google.android.apps.camera.moments.MomentsUtils;
import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.PostviewParams;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class frk implements fth {

    /* JADX INFO: renamed from: g */
    private static final AtomicInteger f23317g = new AtomicInteger(0);

    /* JADX INFO: renamed from: a */
    public final ecq f23318a;

    /* JADX INFO: renamed from: b */
    public final kmd f23319b;

    /* JADX INFO: renamed from: c */
    public final dhv f23320c;

    /* JADX INFO: renamed from: d */
    public final frl f23321d;

    /* JADX INFO: renamed from: e */
    public final gva f23322e;

    /* JADX INFO: renamed from: f */
    public final bko f23323f;

    /* JADX INFO: renamed from: h */
    private final kbo f23324h;

    /* JADX INFO: renamed from: i */
    private final Executor f23325i;

    public frk(ecq ecqVar, kmd kmdVar, kbo kboVar, dhv dhvVar, frl frlVar, Executor executor, bko bkoVar, gva gvaVar, byte[] bArr, byte[] bArr2) {
        this.f23318a = ecqVar;
        this.f23319b = kmdVar;
        this.f23324h = kboVar.mo6314a("MomentsHdrPLaunch");
        this.f23320c = dhvVar;
        this.f23321d = frlVar;
        this.f23325i = executor;
        this.f23323f = bkoVar;
        this.f23322e = gvaVar;
    }

    @Override // p000.fth
    /* JADX INFO: renamed from: a */
    public final int mo8694a() {
        return 1;
    }

    @Override // p000.fth
    /* JADX INFO: renamed from: b */
    public final boolean mo8695b(key keyVar, gva gvaVar) {
        return true;
    }

    @Override // p000.fth
    /* JADX INFO: renamed from: c */
    public final void mo8696c(final key keyVar, final fua fuaVar, final npk npkVar, final ftg ftgVar) {
        final kbs kbsVarM13951k = kbs.m13951k("launcher shot " + f23317g.getAndIncrement() + " ", this.f23324h);
        kbsVarM13951k.mo13940b("launcher got a HDR+ burst");
        kfd kfdVarMo7041b = keyVar.mo7041b();
        kfdVarMo7041b.getClass();
        kbsVarM13951k.mo13940b("    with frame: " + kfdVarMo7041b.f35811b);
        final byte[] bArr = null;
        final byte[] bArr2 = null;
        this.f23325i.execute(new Runnable(keyVar, kbsVarM13951k, ftgVar, fuaVar, npkVar, bArr, bArr2) { // from class: frg

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ key f23299b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ kbo f23300c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ ftg f23301d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ fua f23302e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ npk f23303f;

            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                kmv kmvVar;
                Throwable th;
                kmv kmvVar2;
                frk frkVar = this.f23298a;
                key keyVar2 = this.f23299b;
                kbo kboVar = this.f23300c;
                ftg ftgVar2 = this.f23301d;
                fua fuaVar2 = this.f23302e;
                npk npkVar2 = this.f23303f;
                try {
                    kpp kppVar = (kpp) MomentsUtils.m4209a(keyVar2).get();
                    kfd kfdVarMo7041b2 = keyVar2.mo7041b();
                    kfdVarMo7041b2.getClass();
                    long j = kfdVarMo7041b2.f35811b;
                    gmc gmcVarM9784a = frkVar.f23322e.m9784a(keyVar2);
                    kpw kpwVarM9496e = gmcVarM9784a.m9496e();
                    kpw kpwVarM9495d = gmcVarM9784a.m9495d();
                    kpw kmuVar = kpwVarM9495d == null ? new kmu(j) : kpwVarM9495d;
                    if (kpwVarM9496e == null) {
                        ftgVar2.mo8683b(new RuntimeException("Could not get a raw image from input frame"));
                        return;
                    }
                    kmv kmvVar3 = new kmv(kpwVarM9496e, 1);
                    try {
                        try {
                            kmv kmvVar4 = new kmv(kmuVar, 1);
                            try {
                                kmvVar2 = kmvVar4;
                                kmvVar = kmvVar3;
                                kpw kpwVar = kmuVar;
                                try {
                                    frh frhVar = new frh(frkVar, npkVar2, j, kppVar, kmvVar2, ftgVar2, null, null);
                                    fri friVar = new fri(frkVar, npkVar2, j, kppVar, kpwVar, kmvVar2, ftgVar2, null, null);
                                    gyu gyuVarM10002a = gyu.m10002a();
                                    kboVar.mo13944f(gyuVarM10002a.toString() + " + used internally by Moments. Not a shutter initiated shot");
                                    een eenVarM2622p = frkVar.f23323f.m2622p(gyuVarM10002a);
                                    dhv dhvVar = frkVar.f23320c;
                                    dhw dhwVar = dij.f11577a;
                                    dhvVar.mo6176d();
                                    PostviewParams postviewParams = new PostviewParams();
                                    kbc kbcVar = nta.m17664g(frkVar.f23319b).f36581b;
                                    int i = kbcVar.f35517a;
                                    if (i > kbcVar.f35518b) {
                                        postviewParams.m5085d(i / 2);
                                        postviewParams.m5084c(0);
                                    } else {
                                        postviewParams.m5085d(0);
                                        postviewParams.m5084c(kbcVar.f35518b / 2);
                                    }
                                    if (!frkVar.f23320c.mo6184l(dij.f11602z) || npkVar2.f44027a) {
                                        postviewParams.m5083b(nrx.f44309b);
                                        if (eenVarM2622p.f13690j == null) {
                                            eenVarM2622p.f13690j = mxk.m17132D();
                                        }
                                        eenVarM2622p.f13690j.mo17072d(friVar);
                                    } else {
                                        postviewParams.m5083b(nrx.f44313f);
                                        if (eenVarM2622p.f13692l == null) {
                                            eenVarM2622p.f13692l = mxk.m17132D();
                                        }
                                        eenVarM2622p.f13692l.mo17072d(frhVar);
                                    }
                                    glk glkVar = new glk(fuaVar2, (gyh) null, new gat(), new gbg());
                                    kmg kmgVarMo14193c = gmcVarM9784a.m9492a().mo14193c();
                                    try {
                                        eem eemVarMo7130E = frkVar.f23318a.mo7130E(kmgVarMo14193c, gyuVarM10002a, glkVar, postviewParams, gcy.OFF, kppVar);
                                        kboVar.mo13940b("launched HDR+ shot");
                                        if (eemVarMo7130E == null) {
                                            kboVar.mo13947i("Failed to initiate HDR plus shot capture.");
                                            ftgVar2.mo8683b(new frj(new RuntimeException("Failed to initiate HDR plus shot capture.")));
                                        } else {
                                            frkVar.f23318a.mo7151r(eemVarMo7130E, new BurstSpec());
                                            kboVar.mo13940b("Submitting payload frame " + j);
                                            frkVar.f23318a.mo7128C(eemVarMo7130E, kmgVarMo14193c, 0, kppVar, nre.f44163c, kmvVar);
                                            if (frkVar.f23318a.mo7157x(eemVarMo7130E)) {
                                                if (!frkVar.f23318a.mo7158y(eemVarMo7130E)) {
                                                    kboVar.mo13942d("Couldn't end capture, aborting shot.");
                                                    frkVar.f23318a.mo7147n(eemVarMo7130E);
                                                    ftgVar2.mo8683b(new frj(new RuntimeException("Couldn't end capture")));
                                                }
                                                kmvVar.m14585k();
                                                kmvVar2.m14585k();
                                            } else {
                                                kboVar.mo13942d("Couldn't end burst payload, aborting shot.");
                                                frkVar.f23318a.mo7147n(eemVarMo7130E);
                                                ftgVar2.mo8683b(new frj(new RuntimeException("Couldn't end burst payload")));
                                            }
                                        }
                                    } catch (InterruptedException e) {
                                        e = e;
                                        kboVar.mo13943e("Couldn't start ZSL capture", e);
                                        ftgVar2.mo8683b(e);
                                    } catch (ExecutionException e2) {
                                        e = e2;
                                        kboVar.mo13943e("Couldn't start ZSL capture", e);
                                        ftgVar2.mo8683b(e);
                                    } catch (kec e3) {
                                        e = e3;
                                        kboVar.mo13943e("Couldn't start ZSL capture", e);
                                        ftgVar2.mo8683b(e);
                                    }
                                    kmvVar2.m14586l();
                                    kmvVar.m14586l();
                                } catch (Throwable th2) {
                                    th = th2;
                                    Throwable th3 = th;
                                    try {
                                        kmvVar2.m14586l();
                                        throw th3;
                                    } catch (Throwable th4) {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                                        throw th3;
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                kmvVar2 = kmvVar4;
                                kmvVar = kmvVar3;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            th = th;
                            try {
                                kmvVar.m14586l();
                                throw th;
                            } catch (Throwable th7) {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th7);
                                throw th;
                            }
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        kmvVar = kmvVar3;
                        th = th;
                        kmvVar.m14586l();
                        throw th;
                    }
                } catch (InterruptedException e4) {
                    kboVar.mo13942d(VCYBIzY.dPwuDIfCTYCWbe);
                    ftgVar2.mo8683b(e4);
                } catch (ExecutionException e5) {
                    kboVar.mo13942d("Failed to acquire metadata from the first frame.");
                    ftgVar2.mo8683b(e5);
                }
            }
        });
    }
}
