package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import com.google.android.camera.experimental2018.ExperimentalKeys;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ivt {

    /* JADX INFO: renamed from: A */
    private static final boolean f32346A;

    /* JADX INFO: renamed from: a */
    public static final CaptureResult.Key f32347a;

    /* JADX INFO: renamed from: b */
    public static final CameraCharacteristics.Key f32348b;

    /* JADX INFO: renamed from: c */
    public static final CameraCharacteristics.Key f32349c;

    /* JADX INFO: renamed from: d */
    public static final CameraCharacteristics.Key f32350d;

    /* JADX INFO: renamed from: e */
    public static final CameraCharacteristics.Key f32351e;

    /* JADX INFO: renamed from: f */
    public static final CameraCharacteristics.Key f32352f;

    /* JADX INFO: renamed from: g */
    public static final CaptureRequest.Key f32353g;

    /* JADX INFO: renamed from: h */
    public static final CaptureResult.Key f32354h;

    /* JADX INFO: renamed from: i */
    public static final CaptureResult.Key f32355i;

    /* JADX INFO: renamed from: j */
    public static final CaptureResult.Key f32356j;

    /* JADX INFO: renamed from: k */
    public static final CameraCharacteristics.Key f32357k;

    /* JADX INFO: renamed from: l */
    public static final CaptureResult.Key f32358l;

    /* JADX INFO: renamed from: m */
    public static final CaptureResult.Key f32359m;

    /* JADX INFO: renamed from: n */
    public static final CaptureResult.Key f32360n;

    /* JADX INFO: renamed from: o */
    public static final CaptureResult.Key f32361o;

    /* JADX INFO: renamed from: p */
    public static final CaptureResult.Key f32362p;

    /* JADX INFO: renamed from: q */
    public static final CaptureResult.Key f32363q;

    /* JADX INFO: renamed from: r */
    public static final CaptureRequest.Key f32364r;

    /* JADX INFO: renamed from: s */
    public static final CaptureRequest.Key f32365s;

    /* JADX INFO: renamed from: t */
    public static final CaptureResult.Key f32366t;

    /* JADX INFO: renamed from: u */
    private static final boolean f32367u = ivz.m11820b(3);

    /* JADX INFO: renamed from: v */
    private static final boolean f32368v;

    /* JADX INFO: renamed from: w */
    private static final boolean f32369w;

    /* JADX INFO: renamed from: x */
    private static final boolean f32370x;

    /* JADX INFO: renamed from: y */
    private static final boolean f32371y;

    /* JADX INFO: renamed from: z */
    private static final boolean f32372z;

    static {
        CaptureResult.Key key;
        CameraCharacteristics.Key key2;
        CameraCharacteristics.Key key3;
        CameraCharacteristics.Key key4;
        CameraCharacteristics.Key key5;
        CameraCharacteristics.Key key6;
        CaptureRequest.Key key7;
        CaptureResult.Key key8;
        CaptureResult.Key key9;
        CaptureResult.Key key10;
        CameraCharacteristics.Key key11;
        CaptureResult.Key key12;
        CaptureResult.Key key13;
        CaptureResult.Key key14;
        CaptureResult.Key key15;
        CaptureResult.Key key16;
        CaptureResult.Key key17;
        CaptureRequest.Key key18;
        boolean zM11820b = ivz.m11820b(4);
        f32368v = zM11820b;
        boolean zM11820b2 = ivz.m11820b(5);
        f32369w = zM11820b2;
        boolean zM11820b3 = ivz.m11820b(6);
        f32370x = zM11820b3;
        boolean zM11820b4 = ivz.m11820b(7);
        f32371y = zM11820b4;
        boolean zM11820b5 = ivz.m11820b(8);
        f32372z = zM11820b5;
        boolean zM11820b6 = ivz.m11820b(10);
        f32346A = zM11820b6;
        CaptureResult.Key key19 = null;
        if (m11813a(2)) {
            key = ExperimentalKeys.EXPERIMENTAL_FOCUS_OBJ_TOO_CLOSE;
        } else if (zM11820b) {
            key = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_FOCUS_OBJ_TOO_CLOSE;
        } else if (zM11820b2) {
            key = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_FOCUS_OBJ_TOO_CLOSE;
        } else if (zM11820b3) {
            key = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_FOCUS_OBJ_TOO_CLOSE;
        } else if (zM11820b4) {
            key = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FOCUS_OBJ_TOO_CLOSE;
        } else if (zM11820b5) {
            key = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_FOCUS_OBJ_TOO_CLOSE;
        } else {
            key = zM11820b6 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FOCUS_OBJ_TOO_CLOSE : null;
        }
        f32347a = key;
        if (m11813a(5)) {
            CaptureResult.Key key20 = ExperimentalKeys.EXPERIMENTAL_3A_SPECTRAL_DATA;
        }
        if (m11813a(6)) {
            key2 = ExperimentalKeys.EXPERIMENTAL_LENS_DISTORTION_COEFFICIENTS_HIGH_QUALITY;
        } else if (ivv.m11815a(6)) {
            key2 = com.google.android.camera.experimental2020.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_COEFFICIENTS_HIGH_QUALITY;
        } else if (zM11820b4) {
            key2 = com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_COEFFICIENTS_HIGH_QUALITY;
        } else if (zM11820b5) {
            key2 = com.google.android.camera.experimental2022.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_COEFFICIENTS_HIGH_QUALITY;
        } else {
            key2 = zM11820b6 ? com.google.android.camera.experimental2023.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_COEFFICIENTS_HIGH_QUALITY : null;
        }
        f32348b = key2;
        if (m11813a(6)) {
            key3 = ExperimentalKeys.EXPERIMENTAL_LENS_DISTORTION_OPTICAL_CENTER_HIGH_QUALITY;
        } else if (ivv.m11815a(6)) {
            key3 = com.google.android.camera.experimental2020.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_OPTICAL_CENTER_HIGH_QUALITY;
        } else if (zM11820b4) {
            key3 = com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_OPTICAL_CENTER_HIGH_QUALITY;
        } else if (zM11820b5) {
            key3 = com.google.android.camera.experimental2022.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_OPTICAL_CENTER_HIGH_QUALITY;
        } else {
            key3 = zM11820b6 ? com.google.android.camera.experimental2023.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_OPTICAL_CENTER_HIGH_QUALITY : null;
        }
        f32349c = key3;
        if (m11813a(6)) {
            key4 = ExperimentalKeys.EXPERIMENTAL_LENS_DISTORTION_NORMALIZATION_HIGH_QUALITY;
        } else if (ivv.m11815a(6)) {
            key4 = com.google.android.camera.experimental2020.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_NORMALIZATION_HIGH_QUALITY;
        } else if (zM11820b4) {
            key4 = com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_NORMALIZATION_HIGH_QUALITY;
        } else if (zM11820b5) {
            key4 = com.google.android.camera.experimental2022.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_NORMALIZATION_HIGH_QUALITY;
        } else {
            key4 = zM11820b6 ? com.google.android.camera.experimental2023.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_NORMALIZATION_HIGH_QUALITY : null;
        }
        f32350d = key4;
        if (m11813a(6)) {
            key5 = ExperimentalKeys.EXPERIMENTAL_LENS_DISTORTION_ACTIVE_RECTANGLE_HIGH_QUALITY;
        } else if (ivv.m11815a(6)) {
            key5 = com.google.android.camera.experimental2020.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_ACTIVE_RECTANGLE_HIGH_QUALITY;
        } else if (zM11820b4) {
            key5 = com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_ACTIVE_RECTANGLE_HIGH_QUALITY;
        } else if (zM11820b5) {
            key5 = com.google.android.camera.experimental2022.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_ACTIVE_RECTANGLE_HIGH_QUALITY;
        } else {
            key5 = zM11820b6 ? com.google.android.camera.experimental2023.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_ACTIVE_RECTANGLE_HIGH_QUALITY : null;
        }
        f32351e = key5;
        if (m11813a(6)) {
            key6 = ExperimentalKeys.EXPERIMENTAL_LENS_DISTORTION_VALID_RECTANGLE_HIGH_QUALITY;
        } else if (ivv.m11815a(6)) {
            key6 = com.google.android.camera.experimental2020.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_VALID_RECTANGLE_HIGH_QUALITY;
        } else if (zM11820b4) {
            key6 = com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_VALID_RECTANGLE_HIGH_QUALITY;
        } else if (zM11820b5) {
            key6 = com.google.android.camera.experimental2022.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_VALID_RECTANGLE_HIGH_QUALITY;
        } else {
            key6 = zM11820b6 ? com.google.android.camera.experimental2023.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_VALID_RECTANGLE_HIGH_QUALITY : null;
        }
        f32352f = key6;
        if (m11813a(13)) {
            CameraCharacteristics.Key key21 = ExperimentalKeys.NEXUS_EXPERIMENTAL_FRONT_STEREO_CAL;
        }
        if (m11813a(7)) {
            CaptureRequest.Key key22 = ExperimentalKeys.EXPERIMENTAL_REQUEST_BAYER_GRID_STATS;
        }
        if (m11813a(7)) {
            CaptureResult.Key key23 = ExperimentalKeys.EXPERIMENTAL_BAYER_GRID_STATS;
        }
        if (m11813a(8)) {
            CaptureResult.Key key24 = ExperimentalKeys.EXPERIMENTAL_THERMAL_INFO;
        }
        if (m11813a(9)) {
            key7 = ExperimentalKeys.EXPERIMENTAL_3A_METADATA_ENABLED;
        } else if (zM11820b) {
            key7 = com.google.android.camera.experimental2019.ExperimentalKeys.REQUEST_3A_METADATA_ENABLED;
        } else if (zM11820b2) {
            key7 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_3A_METADATA_ENABLED;
        } else if (zM11820b3) {
            key7 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_3A_METADATA_ENABLED;
        } else if (zM11820b4) {
            key7 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_3A_METADATA_ENABLED;
        } else if (zM11820b5) {
            key7 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_3A_METADATA_ENABLED;
        } else {
            key7 = zM11820b6 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_3A_METADATA_ENABLED : null;
        }
        f32353g = key7;
        if (m11813a(9)) {
            key8 = ExperimentalKeys.EXPERIMENTAL_3A_METADATA_AEC;
        } else if (zM11820b) {
            key8 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_3A_METADATA_AEC;
        } else if (zM11820b2) {
            key8 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_3A_METADATA_AEC;
        } else if (zM11820b3) {
            key8 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_3A_METADATA_AEC;
        } else if (zM11820b4) {
            key8 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_3A_METADATA_AEC;
        } else if (zM11820b5) {
            key8 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_3A_METADATA_AEC;
        } else {
            key8 = zM11820b6 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_3A_METADATA_AEC : null;
        }
        f32354h = key8;
        if (m11813a(9)) {
            key9 = ExperimentalKeys.EXPERIMENTAL_3A_METADATA_AF;
        } else if (zM11820b) {
            key9 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_3A_METADATA_AF;
        } else if (zM11820b2) {
            key9 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_3A_METADATA_AF;
        } else if (zM11820b3) {
            key9 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_3A_METADATA_AF;
        } else if (zM11820b4) {
            key9 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_3A_METADATA_AF;
        } else if (zM11820b5) {
            key9 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_3A_METADATA_AF;
        } else {
            key9 = zM11820b6 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_3A_METADATA_AF : null;
        }
        f32355i = key9;
        if (m11813a(9)) {
            key10 = ExperimentalKeys.EXPERIMENTAL_3A_METADATA_AWB;
        } else if (zM11820b) {
            key10 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_3A_METADATA_AWB;
        } else if (zM11820b2) {
            key10 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_3A_METADATA_AWB;
        } else if (zM11820b3) {
            key10 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_3A_METADATA_AWB;
        } else if (zM11820b4) {
            key10 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_3A_METADATA_AWB;
        } else if (zM11820b5) {
            key10 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_3A_METADATA_AWB;
        } else {
            key10 = zM11820b6 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_3A_METADATA_AWB : null;
        }
        f32356j = key10;
        if (m11813a(12)) {
            key11 = ExperimentalKeys.EXPERIMENTAL_FACE_LANDMARK_AVAILABLE_IDS;
        } else if (zM11820b) {
            key11 = com.google.android.camera.experimental2019.ExperimentalKeys.CHARACTERISTICS_FACE_LANDMARK_AVAILABLE_IDS;
        } else if (zM11820b2) {
            key11 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.CHARACTERISTICS_FACE_LANDMARK_AVAILABLE_IDS;
        } else if (zM11820b3) {
            key11 = com.google.android.camera.experimental2020.ExperimentalKeys.CHARACTERISTICS_FACE_LANDMARK_AVAILABLE_IDS;
        } else if (zM11820b4) {
            key11 = com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_FACE_LANDMARK_AVAILABLE_IDS;
        } else if (zM11820b5) {
            key11 = com.google.android.camera.experimental2022.ExperimentalKeys.CHARACTERISTICS_FACE_LANDMARK_AVAILABLE_IDS;
        } else {
            key11 = zM11820b6 ? com.google.android.camera.experimental2023.ExperimentalKeys.CHARACTERISTICS_FACE_LANDMARK_AVAILABLE_IDS : null;
        }
        f32357k = key11;
        if (m11813a(12)) {
            key12 = ExperimentalKeys.EXPERIMENTAL_FACE_SKIPFRAME;
        } else if (zM11820b) {
            key12 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_FACE_SKIPFRAME;
        } else if (zM11820b2) {
            key12 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_FACE_SKIPFRAME;
        } else if (zM11820b3) {
            key12 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_FACE_SKIPFRAME;
        } else if (zM11820b4) {
            key12 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FACE_SKIPFRAME;
        } else if (zM11820b5) {
            key12 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_FACE_SKIPFRAME;
        } else {
            key12 = zM11820b6 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FACE_SKIPFRAME : null;
        }
        f32358l = key12;
        if (m11813a(12)) {
            key13 = ExperimentalKeys.EXPERIMENTAL_FACE_LANDMARK_COUNT;
        } else if (zM11820b) {
            key13 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_FACE_LANDMARK_COUNT;
        } else if (zM11820b2) {
            key13 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_FACE_LANDMARK_COUNT;
        } else if (zM11820b3) {
            key13 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_FACE_LANDMARK_COUNT;
        } else if (zM11820b4) {
            key13 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FACE_LANDMARK_COUNT;
        } else if (zM11820b5) {
            key13 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_FACE_LANDMARK_COUNT;
        } else {
            key13 = zM11820b6 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FACE_LANDMARK_COUNT : null;
        }
        f32359m = key13;
        if (m11813a(12)) {
            key14 = ExperimentalKeys.EXPERIMENTAL_FACE_LANDMARK_IDS;
        } else if (zM11820b) {
            key14 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_FACE_LANDMARK_IDS;
        } else if (zM11820b2) {
            key14 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_FACE_LANDMARK_IDS;
        } else if (zM11820b3) {
            key14 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_FACE_LANDMARK_IDS;
        } else if (zM11820b4) {
            key14 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FACE_LANDMARK_IDS;
        } else if (zM11820b5) {
            key14 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_FACE_LANDMARK_IDS;
        } else {
            key14 = zM11820b6 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FACE_LANDMARK_IDS : null;
        }
        f32360n = key14;
        if (m11813a(12)) {
            key15 = ExperimentalKeys.EXPERIMENTAL_FACE_LANDMARK_XY;
        } else if (zM11820b) {
            key15 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_FACE_LANDMARK_XY;
        } else if (zM11820b2) {
            key15 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_FACE_LANDMARK_XY;
        } else if (zM11820b3) {
            key15 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_FACE_LANDMARK_XY;
        } else if (zM11820b4) {
            key15 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FACE_LANDMARK_XY;
        } else if (zM11820b5) {
            key15 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_FACE_LANDMARK_XY;
        } else {
            key15 = zM11820b6 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FACE_LANDMARK_XY : null;
        }
        f32361o = key15;
        if (m11813a(12)) {
            key16 = ExperimentalKeys.EXPERIMENTAL_FACE_LANDMARK_DEPTH;
        } else if (zM11820b) {
            key16 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_FACE_LANDMARK_DEPTH;
        } else if (zM11820b2) {
            key16 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_FACE_LANDMARK_DEPTH;
        } else if (zM11820b3) {
            key16 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_FACE_LANDMARK_DEPTH;
        } else if (zM11820b4) {
            key16 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FACE_LANDMARK_DEPTH;
        } else if (zM11820b5) {
            key16 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_FACE_LANDMARK_DEPTH;
        } else {
            key16 = zM11820b6 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FACE_LANDMARK_DEPTH : null;
        }
        f32362p = key16;
        if (m11813a(12)) {
            key17 = ExperimentalKeys.EXPERIMENTAL_FACE_ORIENTATION;
        } else if (zM11820b) {
            key17 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_FACE_ORIENTATION;
        } else if (zM11820b2) {
            key17 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_FACE_ORIENTATION;
        } else if (zM11820b3) {
            key17 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_FACE_ORIENTATION;
        } else if (zM11820b4) {
            key17 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FACE_ORIENTATION;
        } else if (zM11820b5) {
            key17 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_FACE_ORIENTATION;
        } else {
            key17 = zM11820b6 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FACE_ORIENTATION : null;
        }
        f32363q = key17;
        f32364r = m11813a(11) ? ExperimentalKeys.EXPERIMENTAL_PD_BACK_CAL_INDEX : null;
        if (m11813a(11)) {
            CaptureResult.Key key25 = ExperimentalKeys.EXPERIMENTAL_PD_BACK_CAL_DATA;
        }
        if (m11813a(16)) {
            key18 = ExperimentalKeys.EXPERIMENTAL_BGSTATS_AWB_ENABLED;
        } else if (zM11820b) {
            key18 = com.google.android.camera.experimental2019.ExperimentalKeys.REQUEST_BGSTATS_AWB_ENABLED;
        } else if (zM11820b2) {
            key18 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_BGSTATS_AWB_ENABLED;
        } else if (zM11820b3) {
            key18 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_BGSTATS_AWB_ENABLED;
        } else if (zM11820b4) {
            key18 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_BGSTATS_AWB_ENABLED;
        } else if (zM11820b5) {
            key18 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_BGSTATS_AWB_ENABLED;
        } else {
            key18 = zM11820b6 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_BGSTATS_AWB_ENABLED : null;
        }
        f32365s = key18;
        if (m11813a(16)) {
            key19 = ExperimentalKeys.EXPERIMENTAL_BGSTATS_AWB;
        } else if (zM11820b) {
            key19 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_BGSTATS_AWB;
        } else if (zM11820b2) {
            key19 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_BGSTATS_AWB;
        } else if (zM11820b3) {
            key19 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_BGSTATS_AWB;
        } else if (zM11820b4) {
            key19 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_BGSTATS_AWB;
        } else if (zM11820b5) {
            key19 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_BGSTATS_AWB;
        } else if (zM11820b6) {
            key19 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_BGSTATS_AWB;
        }
        f32366t = key19;
        if (m11813a(16)) {
            CaptureRequest.Key key26 = ExperimentalKeys.EXPERIMENTAL_BGSTATS_AE_ENABLED;
        } else if (zM11820b) {
            CaptureRequest.Key key27 = com.google.android.camera.experimental2019.ExperimentalKeys.REQUEST_BGSTATS_AE_ENABLED;
        } else if (zM11820b2) {
            CaptureRequest.Key key28 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_BGSTATS_AE_ENABLED;
        } else if (zM11820b3) {
            CaptureRequest.Key key29 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_BGSTATS_AE_ENABLED;
        } else if (zM11820b4) {
            CaptureRequest.Key key30 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_BGSTATS_AE_ENABLED;
        } else if (zM11820b5) {
            CaptureRequest.Key key31 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_BGSTATS_AE_ENABLED;
        } else if (zM11820b6) {
            CaptureRequest.Key key32 = com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_BGSTATS_AE_ENABLED;
        }
        if (m11813a(16)) {
            CaptureResult.Key key33 = ExperimentalKeys.EXPERIMENTAL_BGSTATS_AE;
            return;
        }
        if (zM11820b) {
            CaptureResult.Key key34 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_BGSTATS_AE;
            return;
        }
        if (zM11820b2) {
            CaptureResult.Key key35 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_BGSTATS_AE;
            return;
        }
        if (zM11820b3) {
            CaptureResult.Key key36 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_BGSTATS_AE;
            return;
        }
        if (zM11820b4) {
            CaptureResult.Key key37 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_BGSTATS_AE;
        } else if (zM11820b5) {
            CaptureResult.Key key38 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_BGSTATS_AE;
        } else if (zM11820b6) {
            CaptureResult.Key key39 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_BGSTATS_AE;
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m11813a(int i) {
        if (!f32367u) {
            return false;
        }
        try {
            return i <= ExperimentalKeys.getLibraryVersion();
        } catch (NoSuchFieldError e) {
            return false;
        } catch (NoSuchMethodError e2) {
            return false;
        }
    }
}
