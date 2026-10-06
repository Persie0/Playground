package p000;

import android.app.Activity;
import android.app.KeyguardManager;
import android.graphics.Bitmap;
import android.graphics.PointF;
import com.google.lens.sdk.LensApi;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iad {

    /* JADX INFO: renamed from: a */
    public static final nbh f30123a = nbh.m17259h("com/google/android/apps/camera/ui/lens/LensUtil");

    /* JADX INFO: renamed from: b */
    public final Activity f30124b;

    /* JADX INFO: renamed from: c */
    public final jvd f30125c;

    /* JADX INFO: renamed from: d */
    public final msi f30126d;

    /* JADX INFO: renamed from: e */
    public volatile nqf f30127e;

    /* JADX INFO: renamed from: f */
    public volatile nqf f30128f;

    /* JADX INFO: renamed from: g */
    public final gvo f30129g;

    /* JADX INFO: renamed from: h */
    public nvn f30130h;

    /* JADX INFO: renamed from: i */
    private final dhv f30131i;

    /* JADX INFO: renamed from: j */
    private boolean f30132j = false;

    public iad(Activity activity, jvd jvdVar, Executor executor, dhv dhvVar, gvo gvoVar, msi msiVar) {
        this.f30124b = activity;
        this.f30125c = jvdVar;
        this.f30131i = dhvVar;
        this.f30129g = gvoVar;
        this.f30126d = lku.m15663q(msiVar);
        executor.execute(new huh(this, 14));
    }

    /* JADX INFO: renamed from: a */
    public final nps m10975a() {
        if (!this.f30131i.mo6184l(dib.f11246aF)) {
            return kxk.m14965K(false);
        }
        m10981g();
        return this.f30127e;
    }

    /* JADX INFO: renamed from: b */
    public final nps m10976b() {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        nvn nvnVar = this.f30130h;
        final Bitmap bitmap = nvnVar == null ? null : nvnVar.f44760b;
        if (bitmap == null) {
            return m10977c(new huh(this, 13));
        }
        PointF pointF = nvnVar.f44765g;
        nvg nvgVar = nvnVar.f44762d;
        Integer num = nvnVar.f44764f;
        m10980f();
        final ofk ofkVarM17743c = nvn.m17743c();
        ofkVarM17743c.f45853a = 1;
        if (pointF != null) {
            ofkVarM17743c.f45857e = pointF;
        }
        if (nvgVar != null) {
            ofkVarM17743c.f45854b = nvgVar;
        }
        if (num != null) {
            ofkVarM17743c.f45856d = num;
        }
        m10979e().onResume();
        final byte[] bArr = null;
        return C0930qh.m19342b(new InterfaceC1134xw(bitmap, ofkVarM17743c, jCurrentTimeMillis, bArr) { // from class: hzy

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Bitmap f30107b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ long f30108c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ ofk f30109d;

            @Override // p000.InterfaceC1134xw
            /* JADX INFO: renamed from: a */
            public final Object mo10974a(final C1132xu c1132xu) {
                final iad iadVar = this.f30106a;
                final Bitmap bitmap2 = this.f30107b;
                final ofk ofkVar = this.f30109d;
                final long j = this.f30108c;
                final byte[] bArr2 = null;
                iadVar.m10979e().checkPostCaptureAvailability(new LensApi.LensAvailabilityCallback(bitmap2, ofkVar, j, c1132xu, bArr2) { // from class: iab

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ Bitmap f30117b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ long f30118c;

                    /* JADX INFO: renamed from: d */
                    public final /* synthetic */ C1132xu f30119d;

                    /* JADX INFO: renamed from: e */
                    public final /* synthetic */ ofk f30120e;

                    @Override // com.google.lens.sdk.LensApi.LensAvailabilityCallback
                    public final void onAvailabilityStatusFetched(int i) {
                        iad iadVar2 = this.f30116a;
                        Bitmap bitmap3 = this.f30117b;
                        ofk ofkVar2 = this.f30120e;
                        C1132xu c1132xu2 = this.f30119d;
                        if (i == 0) {
                            kxk.m14975U(iadVar2.m10977c(new gxn(iadVar2, bitmap3, ofkVar2, 12, (byte[]) null)), new cmo(c1132xu2, 19), not.INSTANCE);
                        } else {
                            iadVar2.m10979e().onPause();
                        }
                    }
                });
                return "LensApi#checkPostCaptureAvailability for launchLensWithBitmap";
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final nps m10977c(final Runnable runnable) {
        final nqf nqfVarM17621g = nqf.m17621g();
        this.f30125c.execute(new Runnable() { // from class: hzx
            @Override // java.lang.Runnable
            public final void run() {
                iad iadVar = this.f30103a;
                Runnable runnable2 = runnable;
                nqf nqfVar = nqfVarM17621g;
                if (((KeyguardManager) iadVar.f30124b.getSystemService("keyguard")).isKeyguardLocked()) {
                    iadVar.f30129g.mo9794b(iadVar.f30124b, new iac(runnable2, nqfVar));
                } else {
                    runnable2.run();
                    nqfVar.mo14894e(true);
                }
            }
        });
        return nqfVarM17621g;
    }

    /* JADX INFO: renamed from: d */
    public final nps m10978d() {
        m10981g();
        return this.f30128f;
    }

    /* JADX INFO: renamed from: e */
    public final LensApi m10979e() {
        return (LensApi) this.f30126d.mo6051a();
    }

    /* JADX INFO: renamed from: f */
    public final void m10980f() {
        this.f30130h = null;
    }

    /* JADX INFO: renamed from: g */
    public final void m10981g() {
        synchronized (this) {
            if (this.f30132j) {
                return;
            }
            this.f30127e = nqf.m17621g();
            this.f30128f = nqf.m17621g();
            this.f30132j = true;
            this.f30125c.m13541c(new huh(this, 15));
        }
    }
}
