package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import com.google.android.camera.experimental2020.ExperimentalKeys;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ivv {

    /* JADX INFO: renamed from: a */
    public static final CaptureRequest.Key f32392a;

    /* JADX INFO: renamed from: b */
    public static final CaptureRequest.Key f32393b;

    /* JADX INFO: renamed from: c */
    public static final CaptureRequest.Key f32394c;

    /* JADX INFO: renamed from: d */
    public static final CameraCharacteristics.Key f32395d;

    /* JADX INFO: renamed from: e */
    public static final CaptureRequest.Key f32396e;

    /* JADX INFO: renamed from: f */
    public static final CaptureResult.Key f32397f;

    /* JADX INFO: renamed from: g */
    public static final CaptureResult.Key f32398g;

    /* JADX INFO: renamed from: h */
    public static final CaptureResult.Key f32399h;

    /* JADX INFO: renamed from: i */
    public static final CaptureRequest.Key f32400i;

    /* JADX INFO: renamed from: j */
    public static final CaptureResult.Key f32401j;

    /* JADX INFO: renamed from: k */
    public static final CaptureResult.Key f32402k;

    /* JADX INFO: renamed from: l */
    public static final CaptureResult.Key f32403l;

    /* JADX INFO: renamed from: m */
    public static final CaptureRequest.Key f32404m;

    /* JADX INFO: renamed from: n */
    public static final CaptureResult.Key f32405n;

    /* JADX INFO: renamed from: o */
    public static final CaptureResult.Key f32406o;

    /* JADX INFO: renamed from: p */
    public static final CaptureResult.Key f32407p;

    /* JADX INFO: renamed from: q */
    public static final CaptureRequest.Key f32408q;

    /* JADX INFO: renamed from: r */
    public static final CaptureRequest.Key f32409r;

    /* JADX INFO: renamed from: s */
    public static final CaptureResult.Key f32410s;

    /* JADX INFO: renamed from: t */
    private static final boolean f32411t;

    /* JADX INFO: renamed from: u */
    private static final boolean f32412u;

    /* JADX INFO: renamed from: v */
    private static final boolean f32413v;

    /* JADX INFO: renamed from: w */
    private static final boolean f32414w;

    static {
        CaptureRequest.Key key;
        CaptureRequest.Key key2;
        CaptureRequest.Key key3;
        CameraCharacteristics.Key key4;
        CaptureRequest.Key key5;
        CaptureResult.Key key6;
        CaptureResult.Key key7;
        CaptureResult.Key key8;
        CaptureRequest.Key key9;
        CaptureResult.Key key10;
        CaptureResult.Key key11;
        CaptureResult.Key key12;
        CaptureRequest.Key key13;
        CaptureResult.Key key14;
        CaptureResult.Key key15;
        CaptureResult.Key key16;
        CaptureRequest.Key key17;
        CaptureRequest.Key key18;
        ivz.m11820b(5);
        f32411t = ivz.m11820b(6);
        boolean zM11820b = ivz.m11820b(7);
        f32412u = zM11820b;
        boolean zM11820b2 = ivz.m11820b(8);
        f32413v = zM11820b2;
        boolean zM11820b3 = ivz.m11820b(10);
        f32414w = zM11820b3;
        if (m11815a(1)) {
            CaptureRequest.Key key19 = ExperimentalKeys.REQUEST_FAMILIAR_FACE;
        } else if (zM11820b) {
            CaptureRequest.Key key20 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_FAMILIAR_FACE;
        } else if (zM11820b2) {
            CaptureRequest.Key key21 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_FAMILIAR_FACE;
        } else if (zM11820b3) {
            CaptureRequest.Key key22 = com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_FAMILIAR_FACE;
        }
        if (m11815a(1)) {
            CaptureResult.Key key23 = ExperimentalKeys.RESULT_FAMILIAR_FACE;
        } else if (zM11820b) {
            CaptureResult.Key key24 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FAMILIAR_FACE;
        } else if (zM11820b2) {
            CaptureResult.Key key25 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_FAMILIAR_FACE;
        } else if (zM11820b3) {
            CaptureResult.Key key26 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FAMILIAR_FACE;
        }
        CaptureResult.Key key27 = null;
        if (m11815a(1)) {
            key = ExperimentalKeys.REQUEST_FAMILIAR_FACE_ENABLED;
        } else if (zM11820b) {
            key = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_FAMILIAR_FACE_ENABLED;
        } else if (zM11820b2) {
            key = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_FAMILIAR_FACE_ENABLED;
        } else {
            key = zM11820b3 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_FAMILIAR_FACE_ENABLED : null;
        }
        f32392a = key;
        if (m11815a(1)) {
            CaptureResult.Key key28 = ExperimentalKeys.RESULT_FAMILIAR_FACE_ENABLED;
        } else if (zM11820b) {
            CaptureResult.Key key29 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FAMILIAR_FACE_ENABLED;
        } else if (zM11820b2) {
            CaptureResult.Key key30 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_FAMILIAR_FACE_ENABLED;
        } else if (zM11820b3) {
            CaptureResult.Key key31 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FAMILIAR_FACE_ENABLED;
        }
        if (m11815a(2)) {
            key2 = ExperimentalKeys.REQUEST_FLASHLIGHT_BRIGHTNESS;
        } else if (zM11820b) {
            key2 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_FLASHLIGHT_BRIGHTNESS;
        } else if (zM11820b2) {
            key2 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_FLASHLIGHT_BRIGHTNESS;
        } else {
            key2 = zM11820b3 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_FLASHLIGHT_BRIGHTNESS : null;
        }
        f32393b = key2;
        if (m11815a(2)) {
            CaptureResult.Key key32 = ExperimentalKeys.RESULT_FLASHLIGHT_BRIGHTNESS;
        } else if (zM11820b) {
            CaptureResult.Key key33 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FLASHLIGHT_BRIGHTNESS;
        } else if (zM11820b2) {
            CaptureResult.Key key34 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_FLASHLIGHT_BRIGHTNESS;
        } else if (zM11820b3) {
            CaptureResult.Key key35 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FLASHLIGHT_BRIGHTNESS;
        }
        if (m11815a(2)) {
            key3 = ExperimentalKeys.REQUEST_FLASHLIGHT_BRIGHTNESS_ENABLED;
        } else if (zM11820b) {
            key3 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_FLASHLIGHT_BRIGHTNESS_ENABLED;
        } else if (zM11820b2) {
            key3 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_FLASHLIGHT_BRIGHTNESS_ENABLED;
        } else {
            key3 = zM11820b3 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_FLASHLIGHT_BRIGHTNESS_ENABLED : null;
        }
        f32394c = key3;
        if (m11815a(2)) {
            CaptureResult.Key key36 = ExperimentalKeys.RESULT_FLASHLIGHT_BRIGHTNESS_ENABLED;
        } else if (zM11820b) {
            CaptureResult.Key key37 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FLASHLIGHT_BRIGHTNESS_ENABLED;
        } else if (zM11820b2) {
            CaptureResult.Key key38 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_FLASHLIGHT_BRIGHTNESS_ENABLED;
        } else if (zM11820b3) {
            CaptureResult.Key key39 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FLASHLIGHT_BRIGHTNESS_ENABLED;
        }
        if (m11815a(2)) {
            key4 = ExperimentalKeys.CHARACTERISTICS_FLASHLIGHT_BRIGHTNESS_LEVEL_MAX;
        } else if (zM11820b) {
            key4 = com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_FLASHLIGHT_BRIGHTNESS_LEVEL_MAX;
        } else if (zM11820b2) {
            key4 = com.google.android.camera.experimental2022.ExperimentalKeys.CHARACTERISTICS_FLASHLIGHT_BRIGHTNESS_LEVEL_MAX;
        } else {
            key4 = zM11820b3 ? com.google.android.camera.experimental2023.ExperimentalKeys.CHARACTERISTICS_FLASHLIGHT_BRIGHTNESS_LEVEL_MAX : null;
        }
        f32395d = key4;
        if (m11815a(4)) {
            key5 = ExperimentalKeys.REQUEST_SMOOTHY_MODE;
        } else if (zM11820b) {
            key5 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_SMOOTHY_MODE;
        } else if (zM11820b2) {
            key5 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_SMOOTHY_MODE;
        } else {
            key5 = zM11820b3 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_SMOOTHY_MODE : null;
        }
        f32396e = key5;
        if (m11815a(4)) {
            CaptureResult.Key key40 = ExperimentalKeys.RESULT_SMOOTHY_MODE;
        } else if (zM11820b) {
            CaptureResult.Key key41 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_SMOOTHY_MODE;
        } else if (zM11820b2) {
            CaptureResult.Key key42 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_SMOOTHY_MODE;
        } else if (zM11820b3) {
            CaptureResult.Key key43 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_SMOOTHY_MODE;
        }
        if (m11815a(5)) {
            key6 = ExperimentalKeys.RESULT_FACE_DETECTION_TIMESTAMP;
        } else if (zM11820b) {
            key6 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FACE_DETECTION_TIMESTAMP;
        } else if (zM11820b2) {
            key6 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_FACE_DETECTION_TIMESTAMP;
        } else {
            key6 = zM11820b3 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FACE_DETECTION_TIMESTAMP : null;
        }
        f32397f = key6;
        if (m11815a(7)) {
            CameraCharacteristics.Key key44 = ExperimentalKeys.CHARACTERISTICS_FACE_ATTRIBUTE_AVAILABLE_IDS;
        } else if (zM11820b) {
            CameraCharacteristics.Key key45 = com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_FACE_ATTRIBUTE_AVAILABLE_IDS;
        } else if (zM11820b2) {
            CameraCharacteristics.Key key46 = com.google.android.camera.experimental2022.ExperimentalKeys.CHARACTERISTICS_FACE_ATTRIBUTE_AVAILABLE_IDS;
        } else if (zM11820b3) {
            CameraCharacteristics.Key key47 = com.google.android.camera.experimental2023.ExperimentalKeys.CHARACTERISTICS_FACE_ATTRIBUTE_AVAILABLE_IDS;
        }
        if (m11815a(7)) {
            CaptureResult.Key key48 = ExperimentalKeys.RESULT_FACE_ATTRIBUTE_COUNT;
        } else if (zM11820b) {
            CaptureResult.Key key49 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FACE_ATTRIBUTE_COUNT;
        } else if (zM11820b2) {
            CaptureResult.Key key50 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_FACE_ATTRIBUTE_COUNT;
        } else if (zM11820b3) {
            CaptureResult.Key key51 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FACE_ATTRIBUTE_COUNT;
        }
        if (m11815a(7)) {
            CaptureResult.Key key52 = ExperimentalKeys.RESULT_FACE_ATTRIBUTE_IDS;
        } else if (zM11820b) {
            CaptureResult.Key key53 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FACE_ATTRIBUTE_IDS;
        } else if (zM11820b2) {
            CaptureResult.Key key54 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_FACE_ATTRIBUTE_IDS;
        } else if (zM11820b3) {
            CaptureResult.Key key55 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FACE_ATTRIBUTE_IDS;
        }
        if (m11815a(7)) {
            CaptureResult.Key key56 = ExperimentalKeys.RESULT_FACE_ATTRIBUTE_SCORES;
        } else if (zM11820b) {
            CaptureResult.Key key57 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FACE_ATTRIBUTE_SCORES;
        } else if (zM11820b2) {
            CaptureResult.Key key58 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_FACE_ATTRIBUTE_SCORES;
        } else if (zM11820b3) {
            CaptureResult.Key key59 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FACE_ATTRIBUTE_SCORES;
        }
        if (m11815a(7)) {
            CaptureResult.Key key60 = ExperimentalKeys.RESULT_FACE_ATTRIBUTE_VALUE;
        } else if (zM11820b) {
            CaptureResult.Key key61 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FACE_ATTRIBUTE_VALUE;
        } else if (zM11820b2) {
            CaptureResult.Key key62 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_FACE_ATTRIBUTE_VALUE;
        } else if (zM11820b3) {
            CaptureResult.Key key63 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FACE_ATTRIBUTE_VALUE;
        }
        if (m11815a(6)) {
            CaptureResult.Key key64 = ExperimentalKeys.RESULT_LENS_DISTORTION_COEFFICIENTS_HIGH_QUALITY;
        } else if (zM11820b) {
            CaptureResult.Key key65 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_LENS_DISTORTION_COEFFICIENTS_HIGH_QUALITY;
        } else if (zM11820b2) {
            CaptureResult.Key key66 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_LENS_DISTORTION_COEFFICIENTS_HIGH_QUALITY;
        } else if (zM11820b3) {
            CaptureResult.Key key67 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_LENS_DISTORTION_COEFFICIENTS_HIGH_QUALITY;
        }
        if (m11815a(6)) {
            CaptureResult.Key key68 = ExperimentalKeys.RESULT_LENS_DISTORTION_OPTICAL_CENTER_HIGH_QUALITY;
        } else if (zM11820b) {
            CaptureResult.Key key69 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_LENS_DISTORTION_OPTICAL_CENTER_HIGH_QUALITY;
        } else if (zM11820b2) {
            CaptureResult.Key key70 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_LENS_DISTORTION_OPTICAL_CENTER_HIGH_QUALITY;
        } else if (zM11820b3) {
            CaptureResult.Key key71 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_LENS_DISTORTION_OPTICAL_CENTER_HIGH_QUALITY;
        }
        if (m11815a(6)) {
            CaptureResult.Key key72 = ExperimentalKeys.RESULT_LENS_DISTORTION_NORMALIZATION_HIGH_QUALITY;
        } else if (zM11820b) {
            CaptureResult.Key key73 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_LENS_DISTORTION_NORMALIZATION_HIGH_QUALITY;
        } else if (zM11820b2) {
            CaptureResult.Key key74 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_LENS_DISTORTION_NORMALIZATION_HIGH_QUALITY;
        } else if (zM11820b3) {
            CaptureResult.Key key75 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_LENS_DISTORTION_NORMALIZATION_HIGH_QUALITY;
        }
        if (m11815a(6)) {
            CaptureResult.Key key76 = ExperimentalKeys.RESULT_LENS_DISTORTION_ACTIVE_RECTANGLE_HIGH_QUALITY;
        } else if (zM11820b) {
            CaptureResult.Key key77 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_LENS_DISTORTION_ACTIVE_RECTANGLE_HIGH_QUALITY;
        } else if (zM11820b2) {
            CaptureResult.Key key78 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_LENS_DISTORTION_ACTIVE_RECTANGLE_HIGH_QUALITY;
        } else if (zM11820b3) {
            CaptureResult.Key key79 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_LENS_DISTORTION_ACTIVE_RECTANGLE_HIGH_QUALITY;
        }
        if (m11815a(6)) {
            CaptureResult.Key key80 = ExperimentalKeys.RESULT_LENS_DISTORTION_VALID_RECTANGLE_HIGH_QUALITY;
        } else if (zM11820b) {
            CaptureResult.Key key81 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_LENS_DISTORTION_VALID_RECTANGLE_HIGH_QUALITY;
        } else if (zM11820b2) {
            CaptureResult.Key key82 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_LENS_DISTORTION_VALID_RECTANGLE_HIGH_QUALITY;
        } else if (zM11820b3) {
            CaptureResult.Key key83 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_LENS_DISTORTION_VALID_RECTANGLE_HIGH_QUALITY;
        }
        if (m11815a(8)) {
            key7 = ExperimentalKeys.RESULT_FLICKER_FREQ_HIGH_RES;
        } else if (zM11820b) {
            key7 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FLICKER_FREQ_HIGH_RES;
        } else if (zM11820b2) {
            key7 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_FLICKER_FREQ_HIGH_RES;
        } else {
            key7 = zM11820b3 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FLICKER_FREQ_HIGH_RES : null;
        }
        f32398g = key7;
        if (m11815a(8)) {
            key8 = ExperimentalKeys.RESULT_FLICKER_CONF_HIGH_RES;
        } else if (zM11820b) {
            key8 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FLICKER_CONF_HIGH_RES;
        } else if (zM11820b2) {
            key8 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_FLICKER_CONF_HIGH_RES;
        } else {
            key8 = zM11820b3 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FLICKER_CONF_HIGH_RES : null;
        }
        f32399h = key8;
        if (m11815a(9)) {
            key9 = ExperimentalKeys.REQUEST_3A_LOGGING_STATS_ENABLED;
        } else if (zM11820b) {
            key9 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_3A_LOGGING_STATS_ENABLED;
        } else if (zM11820b2) {
            key9 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_3A_LOGGING_STATS_ENABLED;
        } else {
            key9 = zM11820b3 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_3A_LOGGING_STATS_ENABLED : null;
        }
        f32400i = key9;
        if (m11815a(9)) {
            CaptureResult.Key key84 = ExperimentalKeys.RESULT_3A_LOGGING_STATS_ENABLED;
        } else if (zM11820b) {
            CaptureResult.Key key85 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_3A_LOGGING_STATS_ENABLED;
        } else if (zM11820b2) {
            CaptureResult.Key key86 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_3A_LOGGING_STATS_ENABLED;
        } else if (zM11820b3) {
            CaptureResult.Key key87 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_3A_LOGGING_STATS_ENABLED;
        }
        if (m11815a(9)) {
            key10 = ExperimentalKeys.RESULT_AEC_LOGGING_STATS_BLOB;
        } else if (zM11820b) {
            key10 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_AEC_LOGGING_STATS_BLOB;
        } else if (zM11820b2) {
            key10 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_AEC_LOGGING_STATS_BLOB;
        } else {
            key10 = zM11820b3 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_AEC_LOGGING_STATS_BLOB : null;
        }
        f32401j = key10;
        if (m11815a(9)) {
            key11 = ExperimentalKeys.RESULT_AF_LOGGING_STATS_BLOB;
        } else if (zM11820b) {
            key11 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_AF_LOGGING_STATS_BLOB;
        } else if (zM11820b2) {
            key11 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_AF_LOGGING_STATS_BLOB;
        } else {
            key11 = zM11820b3 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_AF_LOGGING_STATS_BLOB : null;
        }
        f32402k = key11;
        if (m11815a(9)) {
            key12 = ExperimentalKeys.RESULT_AWB_LOGGING_STATS_BLOB;
        } else if (zM11820b) {
            key12 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_AWB_LOGGING_STATS_BLOB;
        } else if (zM11820b2) {
            key12 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_AWB_LOGGING_STATS_BLOB;
        } else {
            key12 = zM11820b3 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_AWB_LOGGING_STATS_BLOB : null;
        }
        f32403l = key12;
        if (m11815a(9)) {
            key13 = ExperimentalKeys.REQUEST_3A_VIDEO_METADATA_ENABLED;
        } else if (zM11820b) {
            key13 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_3A_VIDEO_METADATA_ENABLED;
        } else if (zM11820b2) {
            key13 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_3A_VIDEO_METADATA_ENABLED;
        } else {
            key13 = zM11820b3 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_3A_VIDEO_METADATA_ENABLED : null;
        }
        f32404m = key13;
        if (m11815a(9)) {
            CaptureResult.Key key88 = ExperimentalKeys.RESULT_3A_VIDEO_METADATA_ENABLED;
        } else if (zM11820b) {
            CaptureResult.Key key89 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_3A_VIDEO_METADATA_ENABLED;
        } else if (zM11820b2) {
            CaptureResult.Key key90 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_3A_VIDEO_METADATA_ENABLED;
        } else if (zM11820b3) {
            CaptureResult.Key key91 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_3A_VIDEO_METADATA_ENABLED;
        }
        if (m11815a(9)) {
            key14 = ExperimentalKeys.RESULT_AEC_VIDEO_DEBUG_BLOB;
        } else if (zM11820b) {
            key14 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_AEC_VIDEO_DEBUG_BLOB;
        } else if (zM11820b2) {
            key14 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_AEC_VIDEO_DEBUG_BLOB;
        } else {
            key14 = zM11820b3 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_AEC_VIDEO_DEBUG_BLOB : null;
        }
        f32405n = key14;
        if (m11815a(9)) {
            key15 = ExperimentalKeys.RESULT_AF_VIDEO_DEBUG_BLOB;
        } else if (zM11820b) {
            key15 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_AF_VIDEO_DEBUG_BLOB;
        } else if (zM11820b2) {
            key15 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_AF_VIDEO_DEBUG_BLOB;
        } else {
            key15 = zM11820b3 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_AF_VIDEO_DEBUG_BLOB : null;
        }
        f32406o = key15;
        if (m11815a(9)) {
            key16 = ExperimentalKeys.RESULT_AWB_VIDEO_DEBUG_BLOB;
        } else if (zM11820b) {
            key16 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_AWB_VIDEO_DEBUG_BLOB;
        } else if (zM11820b2) {
            key16 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_AWB_VIDEO_DEBUG_BLOB;
        } else {
            key16 = zM11820b3 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_AWB_VIDEO_DEBUG_BLOB : null;
        }
        f32407p = key16;
        if (m11815a(10)) {
            CaptureResult.Key key92 = ExperimentalKeys.RESULT_STOKES_THERMAL_STATUS;
        } else if (zM11820b) {
            CaptureResult.Key key93 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_STOKES_THERMAL_STATUS;
        } else if (zM11820b2) {
            CaptureResult.Key key94 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_STOKES_THERMAL_STATUS;
        } else if (zM11820b3) {
            CaptureResult.Key key95 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_STOKES_THERMAL_STATUS;
        }
        if (m11815a(11)) {
            key17 = ExperimentalKeys.REQUEST_EIS_MODE;
        } else if (zM11820b) {
            key17 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_EIS_MODE;
        } else if (zM11820b2) {
            key17 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_EIS_MODE;
        } else {
            key17 = zM11820b3 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_EIS_MODE : null;
        }
        f32408q = key17;
        if (m11815a(11)) {
            CaptureResult.Key key96 = ExperimentalKeys.RESULT_EIS_MODE;
        } else if (zM11820b) {
            CaptureResult.Key key97 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_EIS_MODE;
        } else if (zM11820b2) {
            CaptureResult.Key key98 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_EIS_MODE;
        } else if (zM11820b3) {
            CaptureResult.Key key99 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_EIS_MODE;
        }
        if (m11815a(12)) {
            key18 = ExperimentalKeys.REQUEST_SKIP_3A_PROCESS;
        } else if (zM11820b) {
            key18 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_SKIP_3A_PROCESS;
        } else if (zM11820b2) {
            key18 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_SKIP_3A_PROCESS;
        } else {
            key18 = zM11820b3 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_SKIP_3A_PROCESS : null;
        }
        f32409r = key18;
        if (m11815a(12)) {
            CaptureResult.Key key100 = ExperimentalKeys.RESULT_SKIP_3A_PROCESS;
        } else if (zM11820b) {
            CaptureResult.Key key101 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_SKIP_3A_PROCESS;
        } else if (zM11820b2) {
            CaptureResult.Key key102 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_SKIP_3A_PROCESS;
        } else if (zM11820b3) {
            CaptureResult.Key key103 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_SKIP_3A_PROCESS;
        }
        if (m11815a(13)) {
            key27 = ExperimentalKeys.RESULT_FLOAT_SENSOR_SENSITIVITY;
        } else if (zM11820b) {
            key27 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FLOAT_SENSOR_SENSITIVITY;
        } else if (zM11820b2) {
            key27 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_FLOAT_SENSOR_SENSITIVITY;
        } else if (zM11820b3) {
            key27 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FLOAT_SENSOR_SENSITIVITY;
        }
        f32410s = key27;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m11815a(int i) {
        if (!f32411t) {
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
