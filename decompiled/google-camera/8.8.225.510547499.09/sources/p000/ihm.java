package p000;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ihm implements kba {

    /* JADX INFO: renamed from: i */
    private static int f30969i = 0;

    /* JADX INFO: renamed from: a */
    public final kbo f30970a;

    /* JADX INFO: renamed from: b */
    public final SurfaceView f30971b;

    /* JADX INFO: renamed from: c */
    public final mrm f30972c;

    /* JADX INFO: renamed from: d */
    public final kbz f30973d;

    /* JADX INFO: renamed from: e */
    public final ihx f30974e;

    /* JADX INFO: renamed from: f */
    public boolean f30975f = false;

    /* JADX INFO: renamed from: g */
    public nqf f30976g;

    /* JADX INFO: renamed from: h */
    public final hlc f30977h;

    /* JADX INFO: renamed from: j */
    private final FrameLayout f30978j;

    /* JADX INFO: renamed from: k */
    private final SurfaceHolder.Callback2 f30979k;

    public ihm(Context context, kbn kbnVar, iid iidVar, CameraActivityTiming cameraActivityTiming, hkx hkxVar, ihx ihxVar, dhv dhvVar, kbz kbzVar, mrm mrmVar, ihn ihnVar) {
        FrameLayout frameLayout = iidVar.f31067d;
        this.f30978j = frameLayout;
        SurfaceView surfaceView = new SurfaceView(context);
        this.f30971b = surfaceView;
        this.f30974e = ihxVar;
        this.f30973d = kbzVar;
        this.f30977h = (hlc) hkxVar.mo10394a();
        this.f30972c = mrmVar;
        int i = f30969i;
        f30969i = i + 1;
        this.f30970a = kbnVar.mo6314a("ViewfinderSV" + i);
        SurfaceHolder holder = surfaceView.getHolder();
        mrm mrmVar2 = ihxVar.f31021c;
        this.f30976g = nqf.m17621g();
        ihl ihlVar = new ihl(this);
        this.f30979k = ihlVar;
        holder.addCallback(ihlVar);
        holder.addCallback(ihnVar);
        kbc kbcVar = ihxVar.f31019a;
        holder.setFixedSize(kbcVar.f35517a, kbcVar.f35518b);
        if (dhvVar.mo6184l(dib.f11336bq) && ihxVar.f31020b.equals(kan.f35487b)) {
            surfaceView.setBackground(context.getResources().getDrawable(C0100R.drawable.viewfinder_rounded_background, null));
            surfaceView.setClipToOutline(true);
        }
        frameLayout.addView(surfaceView, new FrameLayout.LayoutParams(-1, -1));
        cameraActivityTiming.m10438i(hkp.ACTIVITY_SURFACE_VIEW_CREATED, CameraActivityTiming.f6961a);
    }

    /* JADX INFO: renamed from: a */
    public final void m11359a(String str) {
        jvd.m13538a();
        nqf nqfVar = this.f30976g;
        if (nqfVar == null || nqfVar.isDone()) {
            return;
        }
        kbo kboVar = this.f30970a;
        kboVar.getClass();
        kboVar.mo13940b("Previous request exists, returning exception. Reason: ".concat(str));
        this.f30976g.mo8566a(new kec(str));
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        jvd.m13538a();
        m11359a("Closed");
        this.f30971b.getHolder().removeCallback(this.f30979k);
        this.f30978j.removeView(this.f30971b);
        this.f30975f = true;
    }
}
