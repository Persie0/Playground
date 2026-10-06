package p000;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import android.hardware.camera2.params.MeteringRectangle;
import androidx.work.impl.diagnostics.p003tK.KMNlNMe;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gsr implements Comparable, kba {

    /* JADX INFO: renamed from: E */
    private static final MeteringRectangle[] f26236E = {new MeteringRectangle(0, 0, 0, 0, 0)};

    /* JADX INFO: renamed from: A */
    public final float f26237A;

    /* JADX INFO: renamed from: B */
    public final byte f26238B;

    /* JADX INFO: renamed from: C */
    public final MeteringRectangle[] f26239C;

    /* JADX INFO: renamed from: D */
    public final Map f26240D;

    /* JADX INFO: renamed from: a */
    public final kpl f26241a;

    /* JADX INFO: renamed from: b */
    public final String f26242b;

    /* JADX INFO: renamed from: c */
    public final long f26243c;

    /* JADX INFO: renamed from: d */
    public final long f26244d;

    /* JADX INFO: renamed from: e */
    public final long f26245e;

    /* JADX INFO: renamed from: f */
    public final int f26246f;

    /* JADX INFO: renamed from: g */
    public final int f26247g;

    /* JADX INFO: renamed from: h */
    public final float f26248h;

    /* JADX INFO: renamed from: i */
    public final float f26249i;

    /* JADX INFO: renamed from: j */
    public final int f26250j;

    /* JADX INFO: renamed from: k */
    public final int f26251k;

    /* JADX INFO: renamed from: l */
    public final int f26252l;

    /* JADX INFO: renamed from: m */
    public final int f26253m;

    /* JADX INFO: renamed from: n */
    public final long f26254n;

    /* JADX INFO: renamed from: o */
    public final Rect f26255o;

    /* JADX INFO: renamed from: p */
    public final float f26256p;

    /* JADX INFO: renamed from: q */
    public final gsu[] f26257q;

    /* JADX INFO: renamed from: r */
    public final boolean f26258r;

    /* JADX INFO: renamed from: s */
    public final int f26259s;

    /* JADX INFO: renamed from: t */
    public final Rect f26260t;

    /* JADX INFO: renamed from: u */
    public final int f26261u;

    /* JADX INFO: renamed from: v */
    public final int f26262v;

    /* JADX INFO: renamed from: w */
    public final int f26263w;

    /* JADX INFO: renamed from: x */
    public final int f26264x;

    /* JADX INFO: renamed from: y */
    public final boolean f26265y;

    /* JADX INFO: renamed from: z */
    public final boolean f26266z;

    public gsr(kpl kplVar, int i, Rect rect) {
        this(kplVar, i, rect, null, (Rect) kplVar.mo9517d(CaptureResult.SCALER_CROP_REGION));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0049  */
    /* JADX INFO: renamed from: a */
    public static gsr m9709a(kpp kppVar, imu imuVar, int i) {
        kpl kplVar;
        String str;
        kpl kplVar2;
        String str2 = (String) kppVar.mo9517d(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
        Rect rect = null;
        if (str2 != null) {
            Map mapMo9520g = kppVar.mo9520g();
            if (mapMo9520g.isEmpty()) {
                kplVar = kppVar;
                str = str2;
            } else {
                if (mapMo9520g.containsKey(str2)) {
                    kplVar2 = (kpl) mapMo9520g.get(str2);
                } else {
                    Map.Entry entry = (Map.Entry) ((mwx) mapMo9520g).entrySet().iterator().next();
                    str2 = (String) entry.getKey();
                    kplVar2 = (kpl) entry.getValue();
                }
                rect = (Rect) kplVar2.mo9517d(CaptureResult.SCALER_CROP_REGION);
                kplVar = kplVar2;
                str = str2;
            }
        } else {
            kplVar = kppVar;
            str = str2;
        }
        Rect rect2 = (Rect) imuVar.m11486a(str).mo14559l(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        return new gsr(kplVar, i, rect2, str, rect == null ? rect2 : rect);
    }

    /* JADX INFO: renamed from: b */
    private static Object m9710b(Object obj, Object obj2) {
        return obj == null ? obj2 : obj;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return (this.f26243c > ((gsr) obj).f26243c ? 1 : (this.f26243c == ((gsr) obj).f26243c ? 0 : -1));
    }

    public final String toString() {
        long j = this.f26243c;
        long j2 = this.f26244d;
        long j3 = this.f26245e;
        float f = this.f26248h;
        int i = this.f26246f;
        float f2 = this.f26249i;
        int i2 = this.f26250j;
        int i3 = this.f26251k;
        int i4 = this.f26252l;
        int i5 = this.f26253m;
        String strValueOf = String.valueOf(this.f26255o);
        long j4 = this.f26254n;
        float f3 = this.f26256p;
        String string = Arrays.toString(this.f26257q);
        int i6 = this.f26259s;
        String strValueOf2 = String.valueOf(this.f26260t);
        String str = this.f26242b;
        int i7 = this.f26261u;
        int i8 = this.f26262v;
        int i9 = this.f26263w;
        int i10 = this.f26264x;
        boolean z = this.f26265y;
        boolean z2 = this.f26266z;
        float f4 = this.f26237A;
        byte b = this.f26238B;
        return "CameraMetadata{, timestampNs=" + j + ", exposureTime=" + j2 + ", rollingShutterTime=" + j3 + ", focalLength=" + f + ", sensorSensitivity=" + i + ", focusDistance=" + f2 + ", aFStatus=" + i2 + ", aEStatus=" + i3 + ", aWBStatus=" + i4 + ", lensStatus=" + i5 + ", cropRegion=" + strValueOf + ", mTimestampBootime=" + j4 + ", subjectMotion=" + f3 + ", faces=" + string + ", rotationDegrees=" + i6 + KMNlNMe.orAyTPgInitVZP + strValueOf2 + ", physicalId=" + str + ", controlMode=" + i7 + ", aeMode=" + i8 + ", aFMode=" + i9 + ", aWBMode=" + i10 + ", aELock=" + z + ", aWBLock=" + z2 + ", lenseAperture=" + f4 + ", jpegQuality=" + ((int) b) + ", autoFocusRegions=" + Arrays.toString(this.f26239C) + "}";
    }

    public gsr(kpl kplVar, int i, Rect rect, String str, Rect rect2) {
        MeteringRectangle[] meteringRectangleArr;
        byte[] bArr;
        this.f26241a = kplVar;
        this.f26242b = str;
        long jLongValue = ((Long) m9710b((Long) kplVar.mo9517d(CaptureResult.SENSOR_TIMESTAMP), 0L)).longValue();
        this.f26243c = jLongValue;
        this.f26244d = ((Long) m9710b((Long) kplVar.mo9517d(CaptureResult.SENSOR_EXPOSURE_TIME), 0L)).longValue();
        this.f26245e = ((Long) m9710b((Long) kplVar.mo9517d(CaptureResult.SENSOR_ROLLING_SHUTTER_SKEW), 0L)).longValue();
        this.f26246f = ((Integer) m9710b((Integer) kplVar.mo9517d(CaptureResult.SENSOR_SENSITIVITY), 0)).intValue();
        this.f26247g = ((Integer) m9710b((Integer) kplVar.mo9517d(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST), 0)).intValue();
        Float f = (Float) kplVar.mo9517d(CaptureResult.LENS_FOCAL_LENGTH);
        Float fValueOf = Float.valueOf(0.0f);
        this.f26248h = ((Float) m9710b(f, fValueOf)).floatValue();
        this.f26249i = ((Float) m9710b((Float) kplVar.mo9517d(CaptureResult.LENS_FOCUS_DISTANCE), fValueOf)).floatValue();
        this.f26250j = ((Integer) m9710b((Integer) kplVar.mo9517d(CaptureResult.CONTROL_AF_STATE), 0)).intValue();
        this.f26251k = ((Integer) m9710b((Integer) kplVar.mo9517d(CaptureResult.CONTROL_AE_STATE), 0)).intValue();
        this.f26252l = ((Integer) m9710b((Integer) kplVar.mo9517d(CaptureResult.CONTROL_AWB_STATE), 0)).intValue();
        this.f26253m = ((Integer) m9710b((Integer) kplVar.mo9517d(CaptureResult.LENS_STATE), 1)).intValue();
        this.f26255o = rect2;
        if (ivs.f32323c != null) {
            this.f26254n = ((Long) m9710b((Long) kplVar.mo9517d(ivs.f32323c), 0L)).longValue();
        } else {
            this.f26254n = jLongValue;
        }
        CaptureResult.Key key = ivs.f32337q;
        if (key != null) {
            this.f26256p = ((Float) m9710b((Float) kplVar.mo9517d(key), Float.valueOf(1.0f))).floatValue();
        } else {
            this.f26256p = 1.0f;
        }
        this.f26259s = i;
        this.f26260t = (Rect) m9710b(rect, new Rect());
        if (ivt.f32359m == null || kplVar.mo9517d(ivt.f32359m) == null) {
            Face[] faceArr = (Face[]) kplVar.mo9517d(CaptureResult.STATISTICS_FACES);
            int length = faceArr != null ? faceArr.length : 0;
            this.f26257q = new gsu[length];
            int i2 = 0;
            while (i2 < length) {
                gsu[] gsuVarArr = this.f26257q;
                kpe kpeVarM14671a = kpe.m14671a(faceArr[i2]);
                Rect rect3 = kpeVarM14671a.f36797c;
                Point point = kpeVarM14671a.f36798d;
                Point point2 = kpeVarM14671a.f36799e;
                Face[] faceArr2 = faceArr;
                Point point3 = kpeVarM14671a.f36800f;
                int i3 = length;
                gsuVarArr[i2] = new gsu(kpeVarM14671a.f36795a, rect3 != null ? gsv.m9714b(rect3, rect2, rect) : null, kpeVarM14671a.f36796b, point != null ? gsv.m9713a(new PointF(point), rect2, rect) : null, point2 != null ? gsv.m9713a(new PointF(point2), rect2, rect) : null, point3 != null ? gsv.m9713a(new PointF(point3), rect2, rect) : null, null, null, null, 0.0f, 0.0f, 0.0f);
                i2++;
                faceArr = faceArr2;
                length = i3;
            }
        } else {
            List listM14672h = kpm.m14672h(kplVar);
            int size = listM14672h.size();
            this.f26257q = new gsu[size];
            int i4 = 0;
            while (i4 < size) {
                gsu[] gsuVarArr2 = this.f26257q;
                kpm kpmVar = (kpm) listM14672h.get(i4);
                Rect rect4 = kpmVar.f36801a.f36797c;
                gsuVarArr2[i4] = new gsu(kpmVar.f36801a.f36795a, rect4 != null ? gsv.m9714b(rect4, rect2, rect) : null, kpmVar.f36801a.f36796b, kpmVar.m14675c() != null ? gsv.m9713a(kpmVar.m14675c(), rect2, rect) : null, kpmVar.m14679g() != null ? gsv.m9713a(kpmVar.m14679g(), rect2, rect) : null, kpmVar.m14676d() != null ? gsv.m9713a(kpmVar.m14676d(), rect2, rect) : null, kpmVar.m14677e() != null ? gsv.m9713a(kpmVar.m14677e(), rect2, rect) : null, kpmVar.m14674b() != null ? gsv.m9713a(kpmVar.m14674b(), rect2, rect) : null, kpmVar.m14678f() != null ? gsv.m9713a(kpmVar.m14678f(), rect2, rect) : null, kpmVar.f36802b, kpmVar.f36803c, kpmVar.f36804d);
                i4++;
                listM14672h = listM14672h;
            }
        }
        CaptureResult.Key key2 = ivt.f32358l;
        if (key2 != null) {
            this.f26258r = ((Boolean) m9710b((Boolean) this.f26241a.mo9517d(key2), false)).booleanValue();
        } else {
            this.f26258r = false;
        }
        this.f26261u = ((Integer) m9710b((Integer) this.f26241a.mo9517d(CaptureResult.CONTROL_MODE), 2)).intValue();
        this.f26262v = ((Integer) m9710b((Integer) this.f26241a.mo9517d(CaptureResult.CONTROL_AE_MODE), 1)).intValue();
        try {
            meteringRectangleArr = (MeteringRectangle[]) this.f26241a.mo9517d(CaptureResult.CONTROL_AF_REGIONS);
        } catch (IllegalArgumentException e) {
            meteringRectangleArr = null;
        }
        this.f26239C = (MeteringRectangle[]) m9710b(meteringRectangleArr, f26236E);
        this.f26237A = ((Float) m9710b((Float) this.f26241a.mo9517d(CaptureResult.LENS_APERTURE), fValueOf)).floatValue();
        this.f26263w = ((Integer) m9710b((Integer) this.f26241a.mo9517d(CaptureResult.CONTROL_AF_MODE), 0)).intValue();
        this.f26265y = ((Boolean) m9710b((Boolean) this.f26241a.mo9517d(CaptureResult.CONTROL_AE_LOCK), false)).booleanValue();
        this.f26264x = ((Integer) m9710b((Integer) this.f26241a.mo9517d(CaptureResult.CONTROL_AWB_MODE), 0)).intValue();
        this.f26266z = ((Boolean) m9710b((Boolean) this.f26241a.mo9517d(CaptureResult.CONTROL_AWB_LOCK), false)).booleanValue();
        this.f26238B = ((Byte) m9710b((Byte) this.f26241a.mo9517d(CaptureResult.JPEG_QUALITY), (byte) 0)).byteValue();
        this.f26240D = new HashMap();
        if (ivw.f32419e == null || (bArr = (byte[]) kplVar.mo9517d(ivw.f32419e)) == null) {
            return;
        }
        mws mwsVarM6939b = dyv.m6939b(bArr);
        int i5 = ((mzr) mwsVarM6939b).f41859c;
        for (int i6 = 0; i6 < i5; i6++) {
            dyt dytVar = (dyt) mwsVarM6939b.get(i6);
            this.f26240D.put(Integer.valueOf(dytVar.f12930a), dytVar);
        }
    }
}
