package p000;

import com.google.android.apps.camera.hdrplus.deblurfusion.DeblurFusionControllerImpl;
import com.google.android.apps.camera.hdrplus.fusion.api.FusionProgressCallback;
import com.pairip.VMRunner;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class efg implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ long f13815a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ egj f13816b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ egj f13817c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ kbc f13818d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ FusionProgressCallback f13819e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ nqf f13820f;

    /* JADX INFO: renamed from: g */
    final /* synthetic */ DeblurFusionControllerImpl f13821g;

    /* JADX INFO: renamed from: h */
    final /* synthetic */ fvu f13822h;

    public efg(DeblurFusionControllerImpl deblurFusionControllerImpl, long j, egj egjVar, egj egjVar2, fvu fvuVar, kbc kbcVar, FusionProgressCallback fusionProgressCallback, nqf nqfVar) {
        this.f13821g = deblurFusionControllerImpl;
        this.f13815a = j;
        this.f13816b = egjVar;
        this.f13817c = egjVar2;
        this.f13822h = fvuVar;
        this.f13818d = kbcVar;
        this.f13819e = fusionProgressCallback;
        this.f13820f = nqfVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        VMRunner.invoke("Yiy9HpzUy5Viq9Oj", new Object[]{this});
    }
}
