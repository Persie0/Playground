package p000;

import android.content.res.Resources;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eqp extends hel {

    /* JADX INFO: renamed from: e */
    private static final int f15199e = Math.round(6.0f);

    /* JADX INFO: renamed from: f */
    private static final int f15200f = (int) Math.min(20.0f, 100.0f);

    /* JADX INFO: renamed from: a */
    public final fly f15201a;

    /* JADX INFO: renamed from: b */
    public final jww f15202b;

    /* JADX INFO: renamed from: c */
    public final cna f15203c;

    /* JADX INFO: renamed from: d */
    public Float f15204d;

    /* JADX INFO: renamed from: g */
    private final Resources f15205g;

    /* JADX INFO: renamed from: h */
    private final msi f15206h;

    /* JADX INFO: renamed from: j */
    private final kbz f15207j;

    /* JADX INFO: renamed from: k */
    private Float f15208k;

    public eqp(Resources resources, fly flyVar, jww jwwVar, msi msiVar, jwn jwnVar, ScheduledExecutorService scheduledExecutorService, cdu cduVar, kbz kbzVar, cna cnaVar, jfs jfsVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(scheduledExecutorService, jfsVar, "motion_blur_smarts_chip", null, null, null);
        this.f15205g = resources;
        this.f15201a = flyVar;
        this.f15202b = jwwVar;
        this.f15206h = msiVar;
        this.f15207j = kbzVar;
        this.f15203c = cnaVar;
        this.f15208k = Float.valueOf(0.0f);
        this.f15204d = Float.valueOf(1.0f);
        cduVar.m3529i().m13537d(jwnVar.mo3830a(new dsu(this, 12), scheduledExecutorService));
    }

    @Override // p000.hel
    /* JADX INFO: renamed from: d */
    protected final hek mo6109d() {
        heu heuVarM10165a = hev.m10165a();
        heuVarM10165a.f27492a = this.f15205g.getString(C0100R.string.moblur_suggestion_text);
        heuVarM10165a.f27493b = this.f15205g.getDrawable(C0100R.drawable.ic_motion_mode_white, null);
        heuVarM10165a.f27494c = new elu(this, 17);
        heuVarM10165a.f27498g = new elu(this, 18);
        heuVarM10165a.m10164e(5000L);
        hev hevVarM10160a = heuVarM10165a.m10160a();
        hej hejVarM10157a = hek.m10157a();
        hejVarM10157a.f27464a = hevVarM10160a;
        hejVarM10157a.m10155b(f15199e);
        hejVarM10157a.m10156c(25);
        return hejVarM10157a.m10154a();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0070  */
    /* JADX WARN: Code duplicated, block: B:29:0x0073  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e6 A[RETURN] */
    @Override // p000.hel
    /* JADX INFO: renamed from: e */
    protected final boolean mo6110e(kpp kppVar) {
        Float f;
        float[] fArr;
        float f2;
        float f3;
        long jLongValue;
        mrm mrmVarM7701b;
        float f4;
        float f5;
        float fMax;
        synchronized (this) {
            f = this.f15204d;
        }
        if (!f.equals(this.f15208k)) {
            this.f15208k = f;
        } else if (f.floatValue() <= 4.2f) {
            MeteringRectangle[] meteringRectangleArr = (MeteringRectangle[]) kppVar.mo9517d(CaptureResult.CONTROL_AE_REGIONS);
            if (meteringRectangleArr != null) {
                for (MeteringRectangle meteringRectangle : meteringRectangleArr) {
                    if (meteringRectangle.getMeteringWeight() <= 0) {
                    }
                }
                if (ivu.f32373a != null && (fArr = (float[]) kppVar.mo9517d(ivu.f32373a)) != null) {
                    float f6 = fArr[6];
                    f2 = fArr[8];
                    f3 = fArr[9];
                    if (f2 >= 0.0f && f6 >= -2.0f) {
                        Long l = (Long) kppVar.mo9517d(CaptureResult.SENSOR_TIMESTAMP);
                        l.getClass();
                        jLongValue = l.longValue();
                        if (this.f15206h.mo6051a() == null) {
                            mrmVarM7701b = mqu.f41450a;
                        } else {
                            this.f15207j.mo13961e("gyro");
                            eqo eqoVar = new eqo();
                            ((knh) this.f15206h.mo6051a()).mo6999b(jLongValue - (((long) f15200f) * 5000000), jLongValue, eqoVar);
                            this.f15207j.mo13962f();
                            mrmVarM7701b = eqoVar.m7701b();
                        }
                        if (mrmVarM7701b.mo16813g()) {
                            f4 = f3 / 1000.0f;
                            f5 = f2 / 80.0f;
                            fMax = Math.max(((Float) mrmVarM7701b.mo16809c()).floatValue() - 0.025f, 0.0f) / 0.125f;
                            if (((Float) mrmVarM7701b.mo16809c()).floatValue() < 0.15f) {
                                if ((f5 * 100.0f) / f4 > ((1.0f - fMax) * 3.0f) + (fMax * 10.0f)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            } else if (ivu.f32373a != null) {
                float f7 = fArr[6];
                f2 = fArr[8];
                f3 = fArr[9];
                if (f2 >= 0.0f) {
                    Long l2 = (Long) kppVar.mo9517d(CaptureResult.SENSOR_TIMESTAMP);
                    l2.getClass();
                    jLongValue = l2.longValue();
                    if (this.f15206h.mo6051a() == null) {
                        mrmVarM7701b = mqu.f41450a;
                    } else {
                        this.f15207j.mo13961e("gyro");
                        eqo eqoVar2 = new eqo();
                        ((knh) this.f15206h.mo6051a()).mo6999b(jLongValue - (((long) f15200f) * 5000000), jLongValue, eqoVar2);
                        this.f15207j.mo13962f();
                        mrmVarM7701b = eqoVar2.m7701b();
                    }
                    if (mrmVarM7701b.mo16813g()) {
                        f4 = f3 / 1000.0f;
                        f5 = f2 / 80.0f;
                        fMax = Math.max(((Float) mrmVarM7701b.mo16809c()).floatValue() - 0.025f, 0.0f) / 0.125f;
                        if (((Float) mrmVarM7701b.mo16809c()).floatValue() < 0.15f) {
                            if ((f5 * 100.0f) / f4 > ((1.0f - fMax) * 3.0f) + (fMax * 10.0f)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
