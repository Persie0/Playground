package p000;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kmc implements kmd {

    /* JADX INFO: renamed from: a */
    public final kmg f36525a;

    /* JADX INFO: renamed from: b */
    public final mxk f36526b;

    /* JADX INFO: renamed from: h */
    private final kpb f36528h;

    /* JADX INFO: renamed from: i */
    private final kbz f36529i;

    /* JADX INFO: renamed from: j */
    private final kbo f36530j;

    /* JADX INFO: renamed from: l */
    private final kah f36532l;

    /* JADX INFO: renamed from: k */
    private StreamConfigurationMap f36531k = null;

    /* JADX INFO: renamed from: g */
    private final Object f36527g = new Object();

    public kmc(kmg kmgVar, kah kahVar, Set set, kpb kpbVar, kbz kbzVar, kbo kboVar) {
        this.f36525a = kmgVar;
        this.f36532l = kahVar;
        this.f36526b = mxk.m17134F(set);
        this.f36528h = kpbVar;
        this.f36529i = kbzVar;
        this.f36530j = kboVar.mo6314a("Characteristics");
    }

    /* JADX INFO: renamed from: Q */
    private final StreamConfigurationMap m14531Q() {
        StreamConfigurationMap streamConfigurationMap;
        synchronized (this.f36527g) {
            try {
                if (this.f36531k == null) {
                    try {
                        this.f36529i.mo13961e("StreamConfigurationMap(" + this.f36525a.f36540a + ")#create");
                        this.f36531k = (StreamConfigurationMap) mo14559l(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                        this.f36529i.mo13962f();
                    } catch (Exception e) {
                        this.f36530j.mo13943e("Unable to obtain StreamConfigurationMap for camera " + this.f36525a.f36540a, e);
                        this.f36529i.mo13962f();
                        return null;
                    }
                }
                streamConfigurationMap = this.f36531k;
            } catch (Throwable th) {
                this.f36529i.mo13962f();
                throw th;
            }
        }
        return streamConfigurationMap;
    }

    @Override // p000.kmd
    /* JADX INFO: renamed from: A */
    public final Set mo14532A() {
        return this.f36532l.f35479a.mo19377d();
    }

    @Override // p000.kmd
    /* JADX INFO: renamed from: B */
    public final Set mo14533B() {
        return this.f36526b;
    }

    @Override // p000.kmd
    /* JADX INFO: renamed from: C */
    public final boolean mo14534C() {
        return mo14544M() && mo14535D() && mo14567t().size() > 1;
    }

    @Override // p000.kmd
    /* JADX INFO: renamed from: D */
    public final boolean mo14535D() {
        return (this.f36528h.f36776i && mo14558k().equals(kmq.f36557a)) ? false : true;
    }

    @Override // p000.kmd
    /* JADX INFO: renamed from: E */
    public final boolean mo14536E() {
        Integer num = (Integer) mo14559l(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        return num != null && num.intValue() > 0;
    }

    @Override // p000.kmd
    /* JADX INFO: renamed from: F */
    public final boolean mo14537F() {
        Integer num = (Integer) mo14559l(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        Float f = (Float) mo14559l(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
        return num != null && num.intValue() > 0 && f != null && f.floatValue() > 0.0f;
    }

    @Override // p000.kmd
    /* JADX INFO: renamed from: G */
    public final boolean mo14538G() {
        Float f = (Float) mo14559l(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
        if (f != null) {
            return f.floatValue() > 0.0f;
        }
        List listMo14563p = mo14563p();
        return listMo14563p.contains(1) || listMo14563p.contains(2) || listMo14563p.contains(4) || listMo14563p.contains(3);
    }

    @Override // p000.kmd
    /* JADX INFO: renamed from: H */
    public final boolean mo14539H() {
        Range range = (Range) mo14559l(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        if (range == null) {
            return false;
        }
        if (range.getLower() == null || ((Integer) range.getLower()).intValue() == 0) {
            return (range.getUpper() == null || ((Integer) range.getUpper()).intValue() == 0) ? false : true;
        }
        return true;
    }

    @Override // p000.kmd
    /* JADX INFO: renamed from: I */
    public final boolean mo14540I() {
        return mo14541J() || mo14558k() == kmq.f36557a;
    }

    @Override // p000.kmd
    /* JADX INFO: renamed from: J */
    public final boolean mo14541J() {
        return ((Boolean) mo14560m(CameraCharacteristics.FLASH_INFO_AVAILABLE, false)).booleanValue();
    }

    @Override // p000.kmd
    /* JADX INFO: renamed from: K */
    public final boolean mo14542K() {
        try {
            return mo14573z().contains(CaptureRequest.CONTROL_ENABLE_ZSL);
        } catch (NoSuchFieldError e) {
            return false;
        }
    }

    @Override // p000.kmd
    /* JADX INFO: renamed from: L */
    public final boolean mo14543L() {
        for (int i : (int[]) mo14560m(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES, f36533c)) {
            if (i == 9) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.kmd
    /* JADX INFO: renamed from: M */
    public final boolean mo14544M() {
        for (int i : (int[]) mo14560m(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES, f36533c)) {
            if (i == 11) {
                return this.f36526b.size() > 1;
            }
        }
        return false;
    }

    @Override // p000.kmd
    /* JADX INFO: renamed from: N */
    public final boolean mo14545N() {
        for (int i : (int[]) mo14560m(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES, f36533c)) {
            if (i == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.kmd
    /* JADX INFO: renamed from: O */
    public final byte[] mo14546O() {
        return ivs.f32321a != null ? (byte[]) mo14560m(ivs.f32321a, f36536f) : f36536f;
    }

    @Override // p000.kmd
    /* JADX INFO: renamed from: P */
    public final int mo14547P() {
        int iIntValue = ((Integer) mo14561n(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue();
        switch (iIntValue) {
            case 0:
                return 2;
            case 1:
                return 1;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            default:
                throw new IllegalStateException("Invalid or Unknown INFO_SUPPORTED_HARDWARE_LEVEL: " + iIntValue);
        }
    }

    @Override // p000.kmd
    /* JADX INFO: renamed from: a */
    public final float mo14548a() {
        if (!mo14539H()) {
            return -1.0f;
        }
        Rational rational = (Rational) mo14560m(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP, Rational.ZERO);
        return rational.getNumerator() / rational.getDenominator();
    }

    @Override // p000.kmd
    /* JADX INFO: renamed from: b */
    public final float mo14549b() {
        Range range = (Range) mo14559l(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        return range != null ? ((Float) range.getUpper()).floatValue() : ((Float) mo14560m(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM, Float.valueOf(1.0f))).floatValue();
    }

    @Override // p000.kmd
    /* JADX INFO: renamed from: c */
    public final float mo14550c() {
        Range range = (Range) mo14559l(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        if (range != null) {
            return ((Float) range.getLower()).floatValue();
        }
        return 1.0f;
    }

    @Override // p000.kmd
    /* JADX INFO: renamed from: d */
    public final int mo14551d() {
        if (mo14539H()) {
            return ((Integer) ((Range) mo14561n(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)).getUpper()).intValue();
        }
        return -1;
    }

    @Override // p000.kmd
    /* JADX INFO: renamed from: e */
    public final int mo14552e() {
        if (mo14539H()) {
            return ((Integer) ((Range) mo14561n(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)).getLower()).intValue();
        }
        return -1;
    }

    @Override // p000.kmd
    /* JADX INFO: renamed from: f */
    public final int mo14553f() {
        return ((Integer) mo14561n(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
    }

    @Override // p000.kmd
    /* JADX INFO: renamed from: g */
    public final long mo14554g(int i, kbc kbcVar) {
        StreamConfigurationMap streamConfigurationMapM14531Q = m14531Q();
        if (streamConfigurationMapM14531Q == null) {
            return 0L;
        }
        return streamConfigurationMapM14531Q.getOutputMinFrameDuration(i, kbd.m13912a(kbcVar));
    }

    @Override // p000.kmd
    /* JADX INFO: renamed from: h */
    public final Rect mo14555h() {
        return (Rect) mo14561n(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
    }

    @Override // p000.kmd
    /* JADX INFO: renamed from: i */
    public final kmg mo14556i() {
        return this.f36525a;
    }

    @Override // p000.kmd
    /* JADX INFO: renamed from: j */
    public final kmp mo14557j() {
        kmp kmpVar;
        int[] iArr = (int[]) mo14560m(CameraCharacteristics.STATISTICS_INFO_AVAILABLE_FACE_DETECT_MODES, f36533c);
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            switch (i) {
                case 1:
                    kmpVar = kmp.SIMPLE;
                    break;
                case 2:
                    kmpVar = kmp.FULL;
                    break;
                case 128:
                    kmpVar = kmp.EXTENDED;
                    break;
                default:
                    kmpVar = kmp.NONE;
                    break;
            }
            arrayList.add(kmpVar);
        }
        if (arrayList.contains(kmp.FULL)) {
            return kmp.FULL;
        }
        return arrayList.contains(kmp.SIMPLE) ? kmp.SIMPLE : kmp.NONE;
    }

    @Override // p000.kmd
    /* JADX INFO: renamed from: k */
    public final kmq mo14558k() {
        int iIntValue = ((Integer) mo14561n(CameraCharacteristics.LENS_FACING)).intValue();
        if (iIntValue == 1) {
            return kmq.BACK;
        }
        return iIntValue == 0 ? kmq.f36557a : kmq.EXTERNAL;
    }

    @Override // p000.kmd
    /* JADX INFO: renamed from: l */
    public final Object mo14559l(CameraCharacteristics.Key key) {
        return this.f36532l.m13865a(key);
    }

    @Override // p000.kmd
    /* JADX INFO: renamed from: m */
    public final Object mo14560m(CameraCharacteristics.Key key, Object obj) {
        kah kahVar = this.f36532l;
        key.getClass();
        obj.getClass();
        Object objMo19374a = kahVar.f35479a.mo19374a(key);
        return objMo19374a == null ? obj : objMo19374a;
    }

    @Override // p000.kmd
    /* JADX INFO: renamed from: n */
    public final Object mo14561n(CameraCharacteristics.Key key) {
        kah kahVar = this.f36532l;
        key.getClass();
        Object objMo19374a = kahVar.f35479a.mo19374a(key);
        if (objMo19374a != null) {
            return objMo19374a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("CameraMetadata missing value for key-");
        sb.append(key);
        throw new kam("CameraMetadata missing value for key-".concat(key.toString()));
    }

    @Override // p000.kmd
    /* JADX INFO: renamed from: o */
    public final List mo14562o() {
        return kxk.m14985ac((int[]) mo14560m(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES, f36533c));
    }

    @Override // p000.kmd
    /* JADX INFO: renamed from: p */
    public final List mo14563p() {
        return kxk.m14985ac((int[]) mo14560m(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES, f36533c));
    }

    @Override // p000.kmd
    /* JADX INFO: renamed from: q */
    public final List mo14564q() {
        return kxk.m14985ac((int[]) mo14560m(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES, f36533c));
    }

    @Override // p000.kmd
    /* JADX INFO: renamed from: r */
    public final List mo14565r() {
        return kxk.m14989ag((float[]) mo14560m(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS, f36534d));
    }

    @Override // p000.kmd
    /* JADX INFO: renamed from: s */
    public final List mo14566s() {
        return kbd.m13916e((Size[]) mo14560m(CameraCharacteristics.JPEG_AVAILABLE_THUMBNAIL_SIZES, f36535e));
    }

    @Override // p000.kmd
    /* JADX INFO: renamed from: t */
    public final List mo14567t() {
        float[] fArr = (float[]) this.f36532l.m13865a(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
        fArr.getClass();
        Arrays.sort(fArr);
        ArrayList arrayListM16498F = mkv.m16498F();
        for (float f : fArr) {
            arrayListM16498F.add(Float.valueOf(f));
        }
        return arrayListM16498F;
    }

    @Override // p000.kmd
    /* JADX INFO: renamed from: u */
    public final List mo14568u() {
        return Arrays.asList((Range[]) mo14561n(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
    }

    @Override // p000.kmd
    /* JADX INFO: renamed from: v */
    public final List mo14569v(kbc kbcVar) {
        StreamConfigurationMap streamConfigurationMapM14531Q = m14531Q();
        if (streamConfigurationMapM14531Q == null) {
            return Collections.emptyList();
        }
        Range<Integer>[] highSpeedVideoFpsRangesFor = streamConfigurationMapM14531Q.getHighSpeedVideoFpsRangesFor(kbd.m13912a(kbcVar));
        return highSpeedVideoFpsRangesFor == null ? Collections.emptyList() : Arrays.asList(highSpeedVideoFpsRangesFor);
    }

    @Override // p000.kmd
    /* JADX INFO: renamed from: w */
    public final List mo14570w() {
        StreamConfigurationMap streamConfigurationMapM14531Q = m14531Q();
        if (streamConfigurationMapM14531Q == null) {
            return Collections.emptyList();
        }
        Size[] highSpeedVideoSizes = streamConfigurationMapM14531Q.getHighSpeedVideoSizes();
        if (highSpeedVideoSizes == null) {
            return Collections.emptyList();
        }
        List listM13916e = kbd.m13916e(highSpeedVideoSizes);
        return Arrays.asList((kbc[]) listM13916e.toArray(new kbc[listM13916e.size()]));
    }

    @Override // p000.kmd
    /* JADX INFO: renamed from: x */
    public final List mo14571x(int i) {
        StreamConfigurationMap streamConfigurationMapM14531Q = m14531Q();
        return streamConfigurationMapM14531Q == null ? Collections.emptyList() : kbd.m13916e(streamConfigurationMapM14531Q.getOutputSizes(i));
    }

    @Override // p000.kmd
    /* JADX INFO: renamed from: y */
    public final List mo14572y() {
        StreamConfigurationMap streamConfigurationMapM14531Q = m14531Q();
        return streamConfigurationMapM14531Q == null ? Collections.emptyList() : kbd.m13916e(streamConfigurationMapM14531Q.getOutputSizes(SurfaceTexture.class));
    }

    @Override // p000.kmd
    /* JADX INFO: renamed from: z */
    public final Set mo14573z() {
        return this.f36532l.f35479a.mo19376c();
    }
}
