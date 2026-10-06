package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import com.google.android.camera.experimental2017.ExperimentalKeys;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ivs {

    /* JADX INFO: renamed from: a */
    public static final CameraCharacteristics.Key f32321a;

    /* JADX INFO: renamed from: b */
    public static final CaptureRequest.Key f32322b;

    /* JADX INFO: renamed from: c */
    public static final CaptureResult.Key f32323c;

    /* JADX INFO: renamed from: d */
    public static final CaptureResult.Key f32324d;

    /* JADX INFO: renamed from: e */
    @Deprecated
    public static final CaptureResult.Key f32325e;

    /* JADX INFO: renamed from: f */
    @Deprecated
    public static final CaptureResult.Key f32326f;

    /* JADX INFO: renamed from: g */
    public static final CaptureResult.Key f32327g;

    /* JADX INFO: renamed from: h */
    public static final CaptureResult.Key f32328h;

    /* JADX INFO: renamed from: i */
    public static final CaptureRequest.Key f32329i;

    /* JADX INFO: renamed from: j */
    public static final CaptureRequest.Key f32330j;

    /* JADX INFO: renamed from: k */
    public static final CameraCharacteristics.Key f32331k;

    /* JADX INFO: renamed from: l */
    public static final CameraCharacteristics.Key f32332l;

    /* JADX INFO: renamed from: m */
    public static final CameraCharacteristics.Key f32333m;

    /* JADX INFO: renamed from: n */
    public static final CameraCharacteristics.Key f32334n;

    /* JADX INFO: renamed from: o */
    public static final CaptureRequest.Key f32335o;

    /* JADX INFO: renamed from: p */
    public static final Integer f32336p;

    /* JADX INFO: renamed from: q */
    public static final CaptureResult.Key f32337q;

    /* JADX INFO: renamed from: r */
    private static final boolean f32338r;

    /* JADX INFO: renamed from: s */
    private static final boolean f32339s;

    /* JADX INFO: renamed from: t */
    private static final boolean f32340t;

    /* JADX INFO: renamed from: u */
    private static final boolean f32341u;

    /* JADX INFO: renamed from: v */
    private static final boolean f32342v;

    /* JADX INFO: renamed from: w */
    private static final boolean f32343w;

    /* JADX INFO: renamed from: x */
    private static final boolean f32344x;

    /* JADX INFO: renamed from: y */
    private static final boolean f32345y;

    static {
        CaptureRequest.Key key;
        CameraCharacteristics.Key key2;
        CameraCharacteristics.Key key3;
        CameraCharacteristics.Key key4;
        CameraCharacteristics.Key key5;
        CaptureRequest.Key key6;
        boolean zM11820b = ivz.m11820b(2);
        f32338r = zM11820b;
        boolean zM11820b2 = ivz.m11820b(3);
        f32339s = zM11820b2;
        boolean zM11820b3 = ivz.m11820b(4);
        f32340t = zM11820b3;
        boolean zM11820b4 = ivz.m11820b(5);
        f32341u = zM11820b4;
        boolean zM11820b5 = ivz.m11820b(6);
        f32342v = zM11820b5;
        boolean zM11820b6 = ivz.m11820b(7);
        f32343w = zM11820b6;
        boolean zM11820b7 = ivz.m11820b(8);
        f32344x = zM11820b7;
        boolean zM11820b8 = ivz.m11820b(10);
        f32345y = zM11820b8;
        if (zM11820b) {
            CaptureRequest.Key key7 = ExperimentalKeys.EXPERIMENTAL_STATS_HISTOGRAM_MODE;
        }
        if (zM11820b) {
            CameraCharacteristics.Key key8 = ExperimentalKeys.EXPERIMENTAL_STATS_HISTOGRM_AVAILABLE_HISTOGRAM_BUCKET_COUNTS;
        }
        if (zM11820b) {
            CaptureRequest.Key key9 = ExperimentalKeys.EXPERIMENTAL_STATS_HISTOGRM_BUCKET_COUNT;
        }
        if (zM11820b) {
            CaptureResult.Key key10 = ExperimentalKeys.EXPERIMENTAL_STATS_HISTOGRAM;
        }
        CaptureResult.Key key11 = null;
        f32321a = zM11820b ? ExperimentalKeys.EXPERIMENTAL_SENSOR_EEPROM_INFORMATION : null;
        if (zM11820b && m11810g()) {
            CameraCharacteristics.Key key12 = ExperimentalKeys.EXPERIMENTAL_SENSOR_PD_DIMENSIONS;
        }
        f32322b = (zM11820b && m11810g()) ? ExperimentalKeys.EXPERIMENTAL_SENSOR_PD_ENABLE : null;
        if (zM11820b) {
            CaptureRequest.Key key13 = ExperimentalKeys.EXPERIMENTAL_CONTROL_TRACKING_AF_TRIGGER;
        }
        if (zM11820b) {
            CaptureResult.Key key14 = ExperimentalKeys.EXPERIMENTAL_CONTROL_AF_REGIONS_CONFIDENCE;
        }
        if (zM11820b) {
            CaptureResult.Key key15 = ExperimentalKeys.EXPERIMENTAL_STATS_OIS_FRAME_TIMESTAMP_VSYNC;
        }
        f32323c = zM11820b ? ExperimentalKeys.EXPERIMENTAL_STATS_OIS_FRAME_TIMESTAMP_BOOTTIME : null;
        f32324d = zM11820b ? ExperimentalKeys.EXPERIMENTAL_STATS_OIS_TIMESTAMPS_BOOTTIME : null;
        f32325e = zM11820b ? ExperimentalKeys.EXPERIMENTAL_STATS_OIS_SHIFT_X : null;
        f32326f = zM11820b ? ExperimentalKeys.EXPERIMENTAL_STATS_OIS_SHIFT_Y : null;
        f32327g = (zM11820b && m11808e()) ? ExperimentalKeys.EXPERIMENTAL_STATS_OIS_SHIFT_PIXEL_X : null;
        f32328h = (zM11820b && m11808e()) ? ExperimentalKeys.EXPERIMENTAL_STATS_OIS_SHIFT_PIXEL_Y : null;
        if (zM11820b && m11804a()) {
            CaptureResult.Key key16 = ExperimentalKeys.EXPERIMENTAL_CONTROL_EXP_TIME_BOOST;
        }
        if (m11806c()) {
            CaptureResult.Key key17 = ExperimentalKeys.EXPERIMENTAL_REQUEST_NEXT_STILL_INTENT_REQUEST_READY;
        }
        if (m11806c()) {
            CaptureRequest.Key key18 = ExperimentalKeys.EXPERIMENTAL_REQUEST_POSTVIEW;
        }
        if (m11806c()) {
            CaptureResult.Key key19 = ExperimentalKeys.EXPERIMENTAL_REQUEST_POSTVIEW_CONFIG;
        }
        if (m11806c()) {
            CaptureResult.Key key20 = ExperimentalKeys.EXPERIMENTAL_REQUEST_POSTVIEW_DATA;
        }
        f32329i = m11806c() ? ExperimentalKeys.EXPERIMENTAL_CONTINUOUS_ZSL_CAPTURE : null;
        if (zM11820b && m11805b()) {
            key = ExperimentalKeys.EXPERIMENTAL_DISABLE_HDRPLUS;
        } else if (zM11820b2 && m11805b()) {
            key = com.google.android.camera.experimental2018.ExperimentalKeys.EXPERIMENTAL_DISABLE_HDRPLUS;
        } else if (zM11820b3) {
            key = com.google.android.camera.experimental2019.ExperimentalKeys.REQUEST_DISABLE_HDRPLUS;
        } else if (zM11820b4) {
            key = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_DISABLE_HDRPLUS;
        } else if (zM11820b5) {
            key = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_DISABLE_HDRPLUS;
        } else if (zM11820b6) {
            key = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_DISABLE_HDRPLUS;
        } else if (zM11820b7) {
            key = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_DISABLE_HDRPLUS;
        } else {
            key = zM11820b8 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_DISABLE_HDRPLUS : null;
        }
        f32330j = key;
        if (m11811h()) {
            CaptureResult.Key key21 = ExperimentalKeys.EXPERIMENTAL_CONTROL_SCENE_DISTANCE;
        }
        if (zM11820b && m11809f()) {
            CameraCharacteristics.Key key22 = ExperimentalKeys.EXPERIMENTAL_SENSOR_EEPROM_PDAF_RIGHT_GAIN_MAP;
        }
        if (zM11820b && m11809f()) {
            CameraCharacteristics.Key key23 = ExperimentalKeys.EXPERIMENTAL_SENSOR_EEPROM_PDAF_LEFT_GAIN_MAP;
        }
        if (zM11820b && m11809f()) {
            CameraCharacteristics.Key key24 = ExperimentalKeys.EXPERIMENTAL_SENSOR_EEPROM_PDAF_DCC;
        }
        if (zM11820b && m11812i()) {
            key2 = ExperimentalKeys.NEXUS_EXPERIMENTAL_2017_EEPROM_WB_CALIB_NUM_LIGHTS;
        } else if (zM11820b2 && m11812i()) {
            key2 = com.google.android.camera.experimental2018.ExperimentalKeys.NEXUS_EXPERIMENTAL_EEPROM_WB_CALIB_NUM_LIGHTS;
        } else if (zM11820b3) {
            key2 = com.google.android.camera.experimental2019.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_NUM_LIGHTS;
        } else if (zM11820b4) {
            key2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_NUM_LIGHTS;
        } else if (zM11820b5) {
            key2 = com.google.android.camera.experimental2020.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_NUM_LIGHTS;
        } else if (zM11820b6) {
            key2 = com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_NUM_LIGHTS;
        } else if (zM11820b7) {
            key2 = com.google.android.camera.experimental2022.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_NUM_LIGHTS;
        } else {
            key2 = zM11820b8 ? com.google.android.camera.experimental2023.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_NUM_LIGHTS : null;
        }
        f32331k = key2;
        if (zM11820b && m11812i()) {
            key3 = ExperimentalKeys.NEXUS_EXPERIMENTAL_2017_EEPROM_WB_CALIB_R_OVER_G_RATIOS;
        } else if (zM11820b2 && m11812i()) {
            key3 = com.google.android.camera.experimental2018.ExperimentalKeys.NEXUS_EXPERIMENTAL_EEPROM_WB_CALIB_R_OVER_G_RATIOS;
        } else if (zM11820b3) {
            key3 = com.google.android.camera.experimental2019.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_R_OVER_G_RATIOS;
        } else if (zM11820b4) {
            key3 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_R_OVER_G_RATIOS;
        } else if (zM11820b5) {
            key3 = com.google.android.camera.experimental2020.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_R_OVER_G_RATIOS;
        } else if (zM11820b6) {
            key3 = com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_R_OVER_G_RATIOS;
        } else if (zM11820b7) {
            key3 = com.google.android.camera.experimental2022.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_R_OVER_G_RATIOS;
        } else {
            key3 = zM11820b8 ? com.google.android.camera.experimental2023.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_R_OVER_G_RATIOS : null;
        }
        f32332l = key3;
        if (zM11820b && m11812i()) {
            key4 = ExperimentalKeys.NEXUS_EXPERIMENTAL_2017_EEPROM_WB_CALIB_B_OVER_G_RATIOS;
        } else if (zM11820b2 && m11812i()) {
            key4 = com.google.android.camera.experimental2018.ExperimentalKeys.NEXUS_EXPERIMENTAL_EEPROM_WB_CALIB_B_OVER_G_RATIOS;
        } else if (zM11820b3) {
            key4 = com.google.android.camera.experimental2019.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_B_OVER_G_RATIOS;
        } else if (zM11820b4) {
            key4 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_B_OVER_G_RATIOS;
        } else if (zM11820b5) {
            key4 = com.google.android.camera.experimental2020.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_B_OVER_G_RATIOS;
        } else if (zM11820b6) {
            key4 = com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_B_OVER_G_RATIOS;
        } else if (zM11820b7) {
            key4 = com.google.android.camera.experimental2022.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_B_OVER_G_RATIOS;
        } else {
            key4 = zM11820b8 ? com.google.android.camera.experimental2023.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_B_OVER_G_RATIOS : null;
        }
        f32333m = key4;
        if (zM11820b && m11812i()) {
            key5 = ExperimentalKeys.NEXUS_EXPERIMENTAL_2017_EEPROM_WB_CALIB_GR_OVER_GB_RATIO;
        } else if (zM11820b2 && m11812i()) {
            key5 = com.google.android.camera.experimental2018.ExperimentalKeys.NEXUS_EXPERIMENTAL_EEPROM_WB_CALIB_GR_OVER_GB_RATIO;
        } else if (zM11820b3) {
            key5 = com.google.android.camera.experimental2019.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_GR_OVER_GB_RATIO;
        } else if (zM11820b4) {
            key5 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_GR_OVER_GB_RATIO;
        } else if (zM11820b5) {
            key5 = com.google.android.camera.experimental2020.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_GR_OVER_GB_RATIO;
        } else if (zM11820b6) {
            key5 = com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_GR_OVER_GB_RATIO;
        } else if (zM11820b7) {
            key5 = com.google.android.camera.experimental2022.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_GR_OVER_GB_RATIO;
        } else {
            key5 = zM11820b8 ? com.google.android.camera.experimental2023.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_GR_OVER_GB_RATIO : null;
        }
        f32334n = key5;
        if (zM11820b && m11807d()) {
            key6 = ExperimentalKeys.EXPERIMENTAL_STATS_MOTION_DETECTION_ENABLE;
        } else if (zM11820b2 && m11807d()) {
            key6 = com.google.android.camera.experimental2018.ExperimentalKeys.EXPERIMENTAL_STATS_MOTION_DETECTION_ENABLE;
        } else if (zM11820b3) {
            key6 = com.google.android.camera.experimental2019.ExperimentalKeys.REQUEST_STATS_MOTION_DETECTION_ENABLE;
        } else if (zM11820b4) {
            key6 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_STATS_MOTION_DETECTION_ENABLE;
        } else if (zM11820b5) {
            key6 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_STATS_MOTION_DETECTION_ENABLE;
        } else if (zM11820b6) {
            key6 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_STATS_MOTION_DETECTION_ENABLE;
        } else if (zM11820b7) {
            key6 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_STATS_MOTION_DETECTION_ENABLE;
        } else {
            key6 = zM11820b8 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_STATS_MOTION_DETECTION_ENABLE : null;
        }
        f32335o = key6;
        f32336p = 1;
        if (zM11820b && m11807d()) {
            CaptureResult.Key key25 = ExperimentalKeys.EXPERIMENTAL_STATS_CAMERA_MOTION_X;
        } else if (zM11820b2 && m11807d()) {
            CaptureResult.Key key26 = com.google.android.camera.experimental2018.ExperimentalKeys.EXPERIMENTAL_STATS_CAMERA_MOTION_X;
        } else if (zM11820b3) {
            CaptureResult.Key key27 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_X;
        } else if (zM11820b4) {
            CaptureResult.Key key28 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_X;
        } else if (zM11820b5) {
            CaptureResult.Key key29 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_X;
        } else if (zM11820b6) {
            CaptureResult.Key key30 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_X;
        } else if (zM11820b7) {
            CaptureResult.Key key31 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_X;
        } else if (zM11820b8) {
            CaptureResult.Key key32 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_X;
        }
        if (zM11820b && m11807d()) {
            CaptureResult.Key key33 = ExperimentalKeys.EXPERIMENTAL_STATS_CAMERA_MOTION_Y;
        } else if (zM11820b2 && m11807d()) {
            CaptureResult.Key key34 = com.google.android.camera.experimental2018.ExperimentalKeys.EXPERIMENTAL_STATS_CAMERA_MOTION_Y;
        } else if (zM11820b3) {
            CaptureResult.Key key35 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_Y;
        } else if (zM11820b4) {
            CaptureResult.Key key36 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_Y;
        } else if (zM11820b5) {
            CaptureResult.Key key37 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_Y;
        } else if (zM11820b6) {
            CaptureResult.Key key38 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_Y;
        } else if (zM11820b7) {
            CaptureResult.Key key39 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_Y;
        } else if (zM11820b8) {
            CaptureResult.Key key40 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_Y;
        }
        if (zM11820b && m11807d()) {
            key11 = ExperimentalKeys.EXPERIMENTAL_STATS_SUBJECT_MOTION;
        } else if (zM11820b2 && m11807d()) {
            key11 = com.google.android.camera.experimental2018.ExperimentalKeys.EXPERIMENTAL_STATS_SUBJECT_MOTION;
        } else if (zM11820b3) {
            key11 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_STATS_SUBJECT_MOTION;
        } else if (zM11820b4) {
            key11 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_STATS_SUBJECT_MOTION;
        } else if (zM11820b5) {
            key11 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_STATS_SUBJECT_MOTION;
        } else if (zM11820b6) {
            key11 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_STATS_SUBJECT_MOTION;
        } else if (zM11820b7) {
            key11 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_STATS_SUBJECT_MOTION;
        } else if (zM11820b8) {
            key11 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_STATS_SUBJECT_MOTION;
        }
        f32337q = key11;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m11804a() {
        if (!f32338r) {
            return false;
        }
        try {
            return ExperimentalKeys.getLibraryVersion() >= 2;
        } catch (NoSuchFieldError e) {
            return false;
        } catch (NoSuchMethodError e2) {
            return false;
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0020 -> B:21:0x0021). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: b */
    private static boolean m11805b() {
        boolean z = true;
        try {
            if (f32338r) {
                if (ExperimentalKeys.getLibraryVersion() < 5) {
                    z = false;
                }
            } else if (!f32339s || com.google.android.camera.experimental2018.ExperimentalKeys.getLibraryVersion() < 3) {
                z = false;
            }
        } catch (NoSuchFieldError e) {
        } catch (NoSuchMethodError e2) {
        }
        return z;
    }

    /* JADX INFO: renamed from: c */
    private static boolean m11806c() {
        if (!f32338r) {
            return false;
        }
        try {
            return ExperimentalKeys.getLibraryVersion() >= 4;
        } catch (NoSuchFieldError e) {
            return false;
        } catch (NoSuchMethodError e2) {
            return false;
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0021 -> B:21:0x0022). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: d */
    private static boolean m11807d() {
        boolean z = true;
        try {
            if (f32338r) {
                if (ExperimentalKeys.getLibraryVersion() < 9) {
                    z = false;
                }
            } else if (!f32339s || com.google.android.camera.experimental2018.ExperimentalKeys.getLibraryVersion() < 4) {
                z = false;
            }
        } catch (NoSuchFieldError e) {
        } catch (NoSuchMethodError e2) {
        }
        return z;
    }

    /* JADX INFO: renamed from: e */
    private static boolean m11808e() {
        if (!f32338r) {
            return false;
        }
        try {
            return ExperimentalKeys.getLibraryVersion() >= 3;
        } catch (NoSuchFieldError e) {
            return false;
        } catch (NoSuchMethodError e2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    private static boolean m11809f() {
        if (!f32338r) {
            return false;
        }
        try {
            return ExperimentalKeys.getLibraryVersion() >= 7;
        } catch (NoSuchFieldError e) {
            return false;
        } catch (NoSuchMethodError e2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    private static boolean m11810g() {
        if (!f32338r) {
            return false;
        }
        try {
            return ExperimentalKeys.getLibraryVersion() > 0;
        } catch (NoSuchFieldError e) {
            return false;
        } catch (NoSuchMethodError e2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    private static boolean m11811h() {
        if (!f32338r) {
            return false;
        }
        try {
            return ExperimentalKeys.getLibraryVersion() >= 6;
        } catch (NoSuchFieldError e) {
            return false;
        } catch (NoSuchMethodError e2) {
            return false;
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0020 -> B:20:0x0021). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: i */
    private static boolean m11812i() {
        boolean z = true;
        try {
            if (f32338r) {
                if (ExperimentalKeys.getLibraryVersion() < 10) {
                    z = false;
                }
            } else if (!f32339s || com.google.android.camera.experimental2018.ExperimentalKeys.getLibraryVersion() <= 0) {
                z = false;
            }
        } catch (NoSuchFieldError e) {
        } catch (NoSuchMethodError e2) {
        }
        return z;
    }
}
