package p000;

import android.content.Context;
import android.content.res.Resources;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.hardware.camera2.TotalCaptureResult;
import android.os.SystemClock;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fdq extends hel {

    /* JADX INFO: renamed from: h */
    private static final float f21469h = (float) Math.toRadians(20.0d);

    /* JADX INFO: renamed from: a */
    public final fdv f21470a;

    /* JADX INFO: renamed from: b */
    public final fly f21471b;

    /* JADX INFO: renamed from: c */
    public final SensorManager f21472c;

    /* JADX INFO: renamed from: d */
    public final Sensor f21473d;

    /* JADX INFO: renamed from: e */
    public final Sensor f21474e;

    /* JADX INFO: renamed from: f */
    public final SensorEventListener f21475f;

    /* JADX INFO: renamed from: g */
    public final cna f21476g;

    /* JADX INFO: renamed from: j */
    private kmq f21477j;

    /* JADX INFO: renamed from: k */
    private final Resources f21478k;

    /* JADX INFO: renamed from: l */
    private final hah f21479l;

    /* JADX INFO: renamed from: m */
    private final jwn f21480m;

    public fdq(Resources resources, Context context, hah hahVar, fly flyVar, jfs jfsVar, ScheduledExecutorService scheduledExecutorService, cna cnaVar, jwn jwnVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(scheduledExecutorService, jfsVar, "long_exposure_smarts_chip", null, null, null);
        this.f21478k = resources;
        this.f21470a = new fdv(new float[]{0.0f, 0.0f, 1.0f}, f21469h);
        this.f21479l = hahVar;
        this.f21471b = flyVar;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f21472c = sensorManager;
        this.f21473d = sensorManager.getDefaultSensor(9);
        this.f21474e = sensorManager.getDefaultSensor(4);
        this.f21475f = new dvd(this, 3);
        this.f21476g = cnaVar;
        this.f21480m = jwnVar;
    }

    /* JADX INFO: renamed from: h */
    private final boolean m8277h() {
        kmq kmqVar = this.f21477j;
        return kmqVar != null && kmqVar == kmq.f36557a;
    }

    @Override // p000.hel, p000.her
    /* JADX INFO: renamed from: c */
    public final void mo3952c(kmd kmdVar) {
        super.mo3952c(kmdVar);
        kmq kmqVarMo14558k = kmdVar.mo14558k();
        lku.m15662p(kmqVarMo14558k);
        this.f21477j = kmqVarMo14558k;
    }

    @Override // p000.hel
    /* JADX INFO: renamed from: d */
    protected final hek mo6109d() {
        heu heuVarM10165a = hev.m10165a();
        heuVarM10165a.f27492a = this.f21478k.getString(C0100R.string.longexposure_suggestion_text);
        heuVarM10165a.f27493b = this.f21478k.getDrawable(C0100R.drawable.ic_night_suggestion, null);
        heuVarM10165a.f27494c = new fdo(this, 2);
        heuVarM10165a.f27498g = new fdo(this, 3);
        heuVarM10165a.m10164e(2000L);
        hev hevVarM10160a = heuVarM10165a.m10160a();
        hej hejVarM10157a = hek.m10157a();
        hejVarM10157a.f27464a = hevVarM10160a;
        hejVarM10157a.m10155b(3);
        hejVarM10157a.m10156c(5);
        return hejVarM10157a.m10154a();
    }

    @Override // p000.hel
    /* JADX INFO: renamed from: e */
    protected final boolean mo6110e(kpp kppVar) {
        String str = (String) this.f21479l.mo10031c(gzy.f27060s);
        if (m8277h()) {
            str = (String) this.f21479l.mo10031c(gzy.f27061t);
        }
        if (str.equals("on")) {
            return false;
        }
        fdv fdvVar = this.f21470a;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        return (fdvVar.f21498e < 5 || fdvVar.f21499f < 5 || jElapsedRealtimeNanos - fdvVar.f21496c < 1000000 || jElapsedRealtimeNanos - fdvVar.f21497d < 1000000 || m8277h()) && ((Boolean) this.f21480m.mo3831be()).booleanValue();
    }

    @Override // p000.hel
    /* JADX INFO: renamed from: f */
    protected final boolean mo8278f(kpp kppVar) {
        return ((Long) kppVar.mo9517d(TotalCaptureResult.SENSOR_EXPOSURE_TIME)) == null || ((Integer) kppVar.mo9517d(TotalCaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) == null || ((Integer) kppVar.mo9517d(TotalCaptureResult.SENSOR_SENSITIVITY)) == null;
    }

    @Override // p000.hel, p000.hes
    /* JADX INFO: renamed from: v */
    public final void mo3969v() {
        super.mo3969v();
        this.f27479i.execute(new fdo(this, 4));
    }

    @Override // p000.hel, p000.hes
    /* JADX INFO: renamed from: w */
    public final void mo3970w() {
        this.f27479i.execute(new fdo(this, 5));
    }
}
