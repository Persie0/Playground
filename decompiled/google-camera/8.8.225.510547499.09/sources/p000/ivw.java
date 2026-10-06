package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import com.google.android.camera.experimental2021.ExperimentalKeys;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ivw {

    /* JADX INFO: renamed from: a */
    public static final CaptureRequest.Key f32415a;

    /* JADX INFO: renamed from: b */
    public static final CaptureRequest.Key f32416b;

    /* JADX INFO: renamed from: c */
    public static final CaptureResult.Key f32417c;

    /* JADX INFO: renamed from: d */
    public static final CaptureRequest.Key f32418d;

    /* JADX INFO: renamed from: e */
    public static final CaptureResult.Key f32419e;

    /* JADX INFO: renamed from: f */
    public static final CaptureRequest.Key f32420f;

    /* JADX INFO: renamed from: g */
    public static final CaptureRequest.Key f32421g;

    /* JADX INFO: renamed from: h */
    public static final CaptureRequest.Key f32422h;

    /* JADX INFO: renamed from: i */
    public static final CaptureRequest.Key f32423i;

    /* JADX INFO: renamed from: j */
    public static final CaptureRequest.Key f32424j;

    /* JADX INFO: renamed from: k */
    public static final CaptureResult.Key f32425k;

    /* JADX INFO: renamed from: l */
    public static final CameraCharacteristics.Key f32426l;

    /* JADX INFO: renamed from: m */
    public static final CameraCharacteristics.Key f32427m;

    /* JADX INFO: renamed from: n */
    public static final CaptureRequest.Key f32428n;

    /* JADX INFO: renamed from: o */
    public static final CaptureRequest.Key f32429o;

    /* JADX INFO: renamed from: p */
    public static final CaptureResult.Key f32430p;

    /* JADX INFO: renamed from: q */
    public static final CaptureResult.Key f32431q;

    /* JADX INFO: renamed from: r */
    public static final CaptureResult.Key f32432r;

    /* JADX INFO: renamed from: s */
    public static final CaptureResult.Key f32433s;

    /* JADX INFO: renamed from: t */
    public static final CaptureRequest.Key f32434t;

    /* JADX INFO: renamed from: u */
    private static final boolean f32435u = ivz.m11820b(7);

    /* JADX INFO: renamed from: v */
    private static final boolean f32436v;

    /* JADX INFO: renamed from: w */
    private static final boolean f32437w;

    static {
        CaptureRequest.Key key;
        CaptureRequest.Key key2;
        CaptureResult.Key key3;
        CaptureRequest.Key key4;
        CaptureResult.Key key5;
        CaptureRequest.Key key6;
        CaptureRequest.Key key7;
        CaptureRequest.Key key8;
        CaptureRequest.Key key9;
        CaptureRequest.Key key10;
        CaptureResult.Key key11;
        CameraCharacteristics.Key key12;
        CameraCharacteristics.Key key13;
        CaptureRequest.Key key14;
        CaptureRequest.Key key15;
        CaptureResult.Key key16;
        CaptureResult.Key key17;
        CaptureResult.Key key18;
        CaptureResult.Key key19;
        boolean zM11820b = ivz.m11820b(8);
        f32436v = zM11820b;
        boolean zM11820b2 = ivz.m11820b(10);
        f32437w = zM11820b2;
        CaptureRequest.Key key20 = null;
        if (m11816a(1)) {
            key = ExperimentalKeys.REQUEST_MANUAL_AWB_CONTROL_MODE;
        } else if (zM11820b) {
            key = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_MANUAL_AWB_CONTROL_MODE;
        } else {
            key = zM11820b2 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_MANUAL_AWB_CONTROL_MODE : null;
        }
        f32415a = key;
        if (m11816a(1)) {
            CaptureResult.Key key21 = ExperimentalKeys.RESULT_MANUAL_AWB_CONTROL_MODE;
        } else if (zM11820b) {
            CaptureResult.Key key22 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_MANUAL_AWB_CONTROL_MODE;
        } else if (zM11820b2) {
            CaptureResult.Key key23 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_MANUAL_AWB_CONTROL_MODE;
        }
        if (m11816a(1)) {
            key2 = ExperimentalKeys.REQUEST_MANUAL_AWB_CONTROL_FACTORS;
        } else if (zM11820b) {
            key2 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_MANUAL_AWB_CONTROL_FACTORS;
        } else {
            key2 = zM11820b2 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_MANUAL_AWB_CONTROL_FACTORS : null;
        }
        f32416b = key2;
        if (m11816a(1)) {
            CaptureResult.Key key24 = ExperimentalKeys.RESULT_MANUAL_AWB_CONTROL_FACTORS;
        } else if (zM11820b) {
            CaptureResult.Key key25 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_MANUAL_AWB_CONTROL_FACTORS;
        } else if (zM11820b2) {
            CaptureResult.Key key26 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_MANUAL_AWB_CONTROL_FACTORS;
        }
        if (m11816a(2)) {
            CaptureResult.Key key27 = ExperimentalKeys.RESULT_BABY_MODE_ENABLED;
        } else if (zM11820b) {
            CaptureResult.Key key28 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_BABY_MODE_ENABLED;
        } else if (zM11820b2) {
            CaptureResult.Key key29 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_BABY_MODE_ENABLED;
        }
        if (m11816a(3)) {
            CaptureRequest.Key key30 = ExperimentalKeys.REQUEST_DYNAMIC_PROFILING_ENABLED;
        } else if (zM11820b) {
            CaptureRequest.Key key31 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_DYNAMIC_PROFILING_ENABLED;
        } else if (zM11820b2) {
            CaptureRequest.Key key32 = com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_DYNAMIC_PROFILING_ENABLED;
        }
        if (m11816a(3)) {
            CaptureResult.Key key33 = ExperimentalKeys.RESULT_DYNAMIC_PROFILING_ENABLED;
        } else if (zM11820b) {
            CaptureResult.Key key34 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_DYNAMIC_PROFILING_ENABLED;
        } else if (zM11820b2) {
            CaptureResult.Key key35 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_DYNAMIC_PROFILING_ENABLED;
        }
        if (!m11816a(19)) {
            if (m11816a(4)) {
                CaptureRequest.Key key36 = ExperimentalKeys.REQUEST_MOTION_DEBLUR_ENABLED;
            } else if (zM11820b) {
                CaptureRequest.Key key37 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_MOTION_DEBLUR_ENABLED;
            } else if (zM11820b2) {
                CaptureRequest.Key key38 = com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_MOTION_DEBLUR_ENABLED;
            }
        }
        if (!m11816a(19)) {
            if (m11816a(4)) {
                CaptureResult.Key key39 = ExperimentalKeys.RESULT_MOTION_DEBLUR_ENABLED;
            } else if (zM11820b) {
                CaptureResult.Key key40 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_MOTION_DEBLUR_ENABLED;
            } else if (zM11820b2) {
                CaptureResult.Key key41 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_MOTION_DEBLUR_ENABLED;
            }
        }
        if (m11816a(4)) {
            key3 = ExperimentalKeys.RESULT_MOTION_DEBLUR_VALID_PHYSICAL_RESULT;
        } else if (zM11820b) {
            key3 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_MOTION_DEBLUR_VALID_PHYSICAL_RESULT;
        } else {
            key3 = zM11820b2 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_MOTION_DEBLUR_VALID_PHYSICAL_RESULT : null;
        }
        f32417c = key3;
        if (m11816a(5)) {
            CaptureRequest.Key key42 = ExperimentalKeys.REQUEST_SIMPLE_COMPUTER_VISION_MODE_ENABLE;
        } else if (zM11820b) {
            CaptureRequest.Key key43 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_SIMPLE_COMPUTER_VISION_MODE_ENABLE;
        } else if (zM11820b2) {
            CaptureRequest.Key key44 = com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_SIMPLE_COMPUTER_VISION_MODE_ENABLE;
        }
        if (m11816a(6)) {
            CaptureResult.Key key45 = ExperimentalKeys.RESULT_SIMPLE_COMPUTER_VISION_MODE_ENABLE;
        } else if (zM11820b) {
            CaptureResult.Key key46 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_SIMPLE_COMPUTER_VISION_MODE_ENABLE;
        } else if (zM11820b2) {
            CaptureResult.Key key47 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_SIMPLE_COMPUTER_VISION_MODE_ENABLE;
        }
        if (m11816a(7)) {
            CaptureRequest.Key key48 = ExperimentalKeys.REQUEST_FACE_AUTH_USE_CASE;
        } else if (zM11820b) {
            CaptureRequest.Key key49 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_FACE_AUTH_USE_CASE;
        } else if (zM11820b2) {
            CaptureRequest.Key key50 = com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_FACE_AUTH_USE_CASE;
        }
        if (m11816a(7)) {
            CaptureResult.Key key51 = ExperimentalKeys.RESULT_FACE_AUTH_USE_CASE;
        } else if (zM11820b) {
            CaptureResult.Key key52 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_FACE_AUTH_USE_CASE;
        } else if (zM11820b2) {
            CaptureResult.Key key53 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FACE_AUTH_USE_CASE;
        }
        if (m11816a(7)) {
            CaptureRequest.Key key54 = ExperimentalKeys.REQUEST_FACEAUTH_FACE_REGIONS;
        } else if (zM11820b) {
            CaptureRequest.Key key55 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_FACEAUTH_FACE_REGIONS;
        } else if (zM11820b2) {
            CaptureRequest.Key key56 = com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_FACEAUTH_FACE_REGIONS;
        }
        if (m11816a(7)) {
            CaptureResult.Key key57 = ExperimentalKeys.RESULT_FACEAUTH_FACE_REGIONS;
        } else if (zM11820b) {
            CaptureResult.Key key58 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_FACEAUTH_FACE_REGIONS;
        } else if (zM11820b2) {
            CaptureResult.Key key59 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FACEAUTH_FACE_REGIONS;
        }
        if (m11816a(8)) {
            key4 = ExperimentalKeys.REQUEST_FAMILIAR_FACE_TRUETONE;
        } else if (zM11820b) {
            key4 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_FAMILIAR_FACE_TRUETONE;
        } else {
            key4 = zM11820b2 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_FAMILIAR_FACE_TRUETONE : null;
        }
        f32418d = key4;
        if (m11816a(8)) {
            key5 = ExperimentalKeys.RESULT_FAMILIAR_FACE_TRUETONE;
        } else if (zM11820b) {
            key5 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_FAMILIAR_FACE_TRUETONE;
        } else {
            key5 = zM11820b2 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FAMILIAR_FACE_TRUETONE : null;
        }
        f32419e = key5;
        if (m11816a(9)) {
            key6 = ExperimentalKeys.REQUEST_LOOKAHEAD_EIS_MODE_ENABLED;
        } else if (zM11820b) {
            key6 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_LOOKAHEAD_EIS_MODE_ENABLED;
        } else {
            key6 = zM11820b2 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_LOOKAHEAD_EIS_MODE_ENABLED : null;
        }
        f32420f = key6;
        if (m11816a(9)) {
            CaptureResult.Key key60 = ExperimentalKeys.RESULT_LOOKAHEAD_EIS_MODE_ENABLED;
        } else if (zM11820b) {
            CaptureResult.Key key61 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_LOOKAHEAD_EIS_MODE_ENABLED;
        } else if (zM11820b2) {
            CaptureResult.Key key62 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_LOOKAHEAD_EIS_MODE_ENABLED;
        }
        if (m11816a(10)) {
            key7 = ExperimentalKeys.REQUEST_DISTANCE_WATER_LEVEL;
        } else if (zM11820b) {
            key7 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_DISTANCE_WATER_LEVEL;
        } else {
            key7 = zM11820b2 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_DISTANCE_WATER_LEVEL : null;
        }
        f32421g = key7;
        if (m11816a(10)) {
            CaptureResult.Key key63 = ExperimentalKeys.RESULT_DISTANCE_WATER_LEVEL;
        } else if (zM11820b) {
            CaptureResult.Key key64 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_DISTANCE_WATER_LEVEL;
        } else if (zM11820b2) {
            CaptureResult.Key key65 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_DISTANCE_WATER_LEVEL;
        }
        if (m11816a(11)) {
            CaptureRequest.Key key66 = ExperimentalKeys.REQUEST_DEBUG_UI_ENABLED;
        } else if (zM11820b) {
            CaptureRequest.Key key67 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_DEBUG_UI_ENABLED;
        } else if (zM11820b2) {
            CaptureRequest.Key key68 = com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_DEBUG_UI_ENABLED;
        }
        if (m11816a(11)) {
            CaptureResult.Key key69 = ExperimentalKeys.RESULT_DEBUG_UI_ENABLED;
        } else if (zM11820b) {
            CaptureResult.Key key70 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_DEBUG_UI_ENABLED;
        } else if (zM11820b2) {
            CaptureResult.Key key71 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_DEBUG_UI_ENABLED;
        }
        if (m11816a(11)) {
            CaptureResult.Key key72 = ExperimentalKeys.RESULT_AF_DEBUG_UI_BLOB;
        } else if (zM11820b) {
            CaptureResult.Key key73 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_AF_DEBUG_UI_BLOB;
        } else if (zM11820b2) {
            CaptureResult.Key key74 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_AF_DEBUG_UI_BLOB;
        }
        if (m11816a(12)) {
            key8 = ExperimentalKeys.REQUEST_OIS_JITTER_MODE_ENABLED;
        } else if (zM11820b) {
            key8 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_OIS_JITTER_MODE_ENABLED;
        } else {
            key8 = zM11820b2 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_OIS_JITTER_MODE_ENABLED : null;
        }
        f32422h = key8;
        if (m11816a(12)) {
            CaptureResult.Key key75 = ExperimentalKeys.RESULT_OIS_JITTER_MODE_ENABLED;
        } else if (zM11820b) {
            CaptureResult.Key key76 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_OIS_JITTER_MODE_ENABLED;
        } else if (zM11820b2) {
            CaptureResult.Key key77 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_OIS_JITTER_MODE_ENABLED;
        }
        if (m11816a(13)) {
            key9 = ExperimentalKeys.REQUEST_GCAM_AE_MOTION_METERING_OPTIONS;
        } else if (zM11820b) {
            key9 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_GCAM_AE_MOTION_METERING_OPTIONS;
        } else {
            key9 = zM11820b2 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_GCAM_AE_MOTION_METERING_OPTIONS : null;
        }
        f32423i = key9;
        if (m11816a(13)) {
            CaptureResult.Key key78 = ExperimentalKeys.RESULT_GCAM_AE_MOTION_METERING_OPTIONS;
        } else if (zM11820b) {
            CaptureResult.Key key79 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_GCAM_AE_MOTION_METERING_OPTIONS;
        } else if (zM11820b2) {
            CaptureResult.Key key80 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_GCAM_AE_MOTION_METERING_OPTIONS;
        }
        if (m11816a(14)) {
            key10 = ExperimentalKeys.REQUEST_SEGMENTATION_MASK_PORTRAIT_REQUESTED;
        } else if (zM11820b) {
            key10 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_SEGMENTATION_MASK_PORTRAIT_REQUESTED;
        } else {
            key10 = zM11820b2 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_SEGMENTATION_MASK_PORTRAIT_REQUESTED : null;
        }
        f32424j = key10;
        if (m11816a(14)) {
            CaptureResult.Key key81 = ExperimentalKeys.RESULT_SEGMENTATION_MASK_PORTRAIT_REQUESTED;
        } else if (zM11820b) {
            CaptureResult.Key key82 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_SEGMENTATION_MASK_PORTRAIT_REQUESTED;
        } else if (zM11820b2) {
            CaptureResult.Key key83 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_SEGMENTATION_MASK_PORTRAIT_REQUESTED;
        }
        if (m11816a(14)) {
            key11 = ExperimentalKeys.RESULT_SEGMENTATION_MASK_PORTRAIT;
        } else if (zM11820b) {
            key11 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_SEGMENTATION_MASK_PORTRAIT;
        } else {
            key11 = zM11820b2 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_SEGMENTATION_MASK_PORTRAIT : null;
        }
        f32425k = key11;
        if (m11816a(15)) {
            key12 = ExperimentalKeys.CHARACTERISTICS_FLOAT_SENSOR_INFO_SENSITIVITY_RANGE;
        } else if (zM11820b) {
            key12 = com.google.android.camera.experimental2022.ExperimentalKeys.CHARACTERISTICS_FLOAT_SENSOR_INFO_SENSITIVITY_RANGE;
        } else {
            key12 = zM11820b2 ? com.google.android.camera.experimental2023.ExperimentalKeys.CHARACTERISTICS_FLOAT_SENSOR_INFO_SENSITIVITY_RANGE : null;
        }
        f32426l = key12;
        if (m11816a(15)) {
            key13 = ExperimentalKeys.CHARACTERISTICS_FLOAT_SENSOR_MAX_ANALOG_SENSITIVITY;
        } else if (zM11820b) {
            key13 = com.google.android.camera.experimental2022.ExperimentalKeys.CHARACTERISTICS_FLOAT_SENSOR_MAX_ANALOG_SENSITIVITY;
        } else {
            key13 = zM11820b2 ? com.google.android.camera.experimental2023.ExperimentalKeys.CHARACTERISTICS_FLOAT_SENSOR_MAX_ANALOG_SENSITIVITY : null;
        }
        f32427m = key13;
        if (m11816a(16)) {
            key14 = ExperimentalKeys.REQUEST_MOTION_DEBLUR_FOLLOWER_ENABLED;
        } else if (zM11820b) {
            key14 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_MOTION_DEBLUR_FOLLOWER_ENABLED;
        } else {
            key14 = zM11820b2 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_MOTION_DEBLUR_FOLLOWER_ENABLED : null;
        }
        f32428n = key14;
        if (m11816a(16)) {
            CaptureResult.Key key84 = ExperimentalKeys.RESULT_MOTION_DEBLUR_FOLLOWER_ENABLED;
        } else if (zM11820b) {
            CaptureResult.Key key85 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_MOTION_DEBLUR_FOLLOWER_ENABLED;
        } else if (zM11820b2) {
            CaptureResult.Key key86 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_MOTION_DEBLUR_FOLLOWER_ENABLED;
        }
        if (m11816a(17)) {
            CaptureRequest.Key key87 = ExperimentalKeys.REQUEST_HIGH_FREQUENCY_LENS_INFO_ENABLED;
        } else if (zM11820b) {
            CaptureRequest.Key key88 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_HIGH_FREQUENCY_LENS_INFO_ENABLED;
        } else if (zM11820b2) {
            CaptureRequest.Key key89 = com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_HIGH_FREQUENCY_LENS_INFO_ENABLED;
        }
        if (m11816a(17)) {
            CaptureResult.Key key90 = ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_INFO_ENABLED;
        } else if (zM11820b) {
            CaptureResult.Key key91 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_INFO_ENABLED;
        } else if (zM11820b2) {
            CaptureResult.Key key92 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_INFO_ENABLED;
        }
        if (m11816a(17)) {
            CaptureResult.Key key93 = ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_INTRINSIC_CALIBRATION;
        } else if (zM11820b) {
            CaptureResult.Key key94 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_INTRINSIC_CALIBRATION;
        } else if (zM11820b2) {
            CaptureResult.Key key95 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_INTRINSIC_CALIBRATION;
        }
        if (m11816a(17)) {
            CaptureResult.Key key96 = ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_POSE_ROTATION;
        } else if (zM11820b) {
            CaptureResult.Key key97 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_POSE_ROTATION;
        } else if (zM11820b2) {
            CaptureResult.Key key98 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_POSE_ROTATION;
        }
        if (m11816a(17)) {
            CaptureResult.Key key99 = ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_POSE_TRANSLATION;
        } else if (zM11820b) {
            CaptureResult.Key key100 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_POSE_TRANSLATION;
        } else if (zM11820b2) {
            CaptureResult.Key key101 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_POSE_TRANSLATION;
        }
        if (m11816a(20)) {
            CaptureResult.Key key102 = ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_INFO_TIMESTAMP;
        } else if (zM11820b) {
            CaptureResult.Key key103 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_INFO_TIMESTAMP;
        } else if (zM11820b2) {
            CaptureResult.Key key104 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_INFO_TIMESTAMP;
        }
        if (m11816a(18)) {
            CaptureResult.Key key105 = ExperimentalKeys.RESULT_RANGE_SENSOR_ENABLED;
        } else if (zM11820b) {
            CaptureResult.Key key106 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_RANGE_SENSOR_ENABLED;
        } else if (zM11820b2) {
            CaptureResult.Key key107 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_RANGE_SENSOR_ENABLED;
        }
        if (m11816a(19)) {
            key15 = ExperimentalKeys.REQUEST_MOTION_DEBLUR_MODE;
        } else if (zM11820b) {
            key15 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_MOTION_DEBLUR_MODE;
        } else {
            key15 = zM11820b2 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_MOTION_DEBLUR_MODE : null;
        }
        f32429o = key15;
        if (m11816a(19)) {
            key16 = ExperimentalKeys.RESULT_MOTION_DEBLUR_MODE;
        } else if (zM11820b) {
            key16 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_MOTION_DEBLUR_MODE;
        } else {
            key16 = zM11820b2 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_MOTION_DEBLUR_MODE : null;
        }
        f32430p = key16;
        if (m11816a(21)) {
            CaptureRequest.Key key108 = ExperimentalKeys.REQUEST_PD_DUMP_START;
        } else if (zM11820b) {
            CaptureRequest.Key key109 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_PD_DUMP_START;
        } else if (zM11820b2) {
            CaptureRequest.Key key110 = com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_PD_DUMP_START;
        }
        if (m11816a(21)) {
            CaptureResult.Key key111 = ExperimentalKeys.RESULT_PD_DUMP_START;
        } else if (zM11820b) {
            CaptureResult.Key key112 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_PD_DUMP_START;
        } else if (zM11820b2) {
            CaptureResult.Key key113 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_PD_DUMP_START;
        }
        if (m11816a(22)) {
            key17 = ExperimentalKeys.RESULT_OIS_TIMESTAMPS;
        } else if (zM11820b) {
            key17 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_OIS_TIMESTAMPS;
        } else {
            key17 = zM11820b2 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_OIS_TIMESTAMPS : null;
        }
        f32431q = key17;
        if (m11816a(22)) {
            key18 = ExperimentalKeys.RESULT_OIS_SHIFT_DAC_X;
        } else if (zM11820b) {
            key18 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_OIS_SHIFT_DAC_X;
        } else {
            key18 = zM11820b2 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_OIS_SHIFT_DAC_X : null;
        }
        f32432r = key18;
        if (m11816a(22)) {
            key19 = ExperimentalKeys.RESULT_OIS_SHIFT_DAC_Y;
        } else if (zM11820b) {
            key19 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_OIS_SHIFT_DAC_Y;
        } else {
            key19 = zM11820b2 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_OIS_SHIFT_DAC_Y : null;
        }
        f32433s = key19;
        if (m11816a(23)) {
            key20 = ExperimentalKeys.REQUEST_CAPTURE_STATUS;
        } else if (zM11820b) {
            key20 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_CAPTURE_STATUS;
        } else if (zM11820b2) {
            key20 = com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_CAPTURE_STATUS;
        }
        f32434t = key20;
        if (m11816a(23)) {
            CaptureResult.Key key114 = ExperimentalKeys.RESULT_CAPTURE_STATUS;
        } else if (zM11820b) {
            CaptureResult.Key key115 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_CAPTURE_STATUS;
        } else if (zM11820b2) {
            CaptureResult.Key key116 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_CAPTURE_STATUS;
        }
        if (m11816a(24)) {
            CaptureRequest.Key key117 = ExperimentalKeys.REQUEST_LYRIC_EXIF_MAKER_NOTE;
        } else if (zM11820b) {
            CaptureRequest.Key key118 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_LYRIC_EXIF_MAKER_NOTE;
        } else if (zM11820b2) {
            CaptureRequest.Key key119 = com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_LYRIC_EXIF_MAKER_NOTE;
        }
        if (m11816a(24)) {
            CaptureResult.Key key120 = ExperimentalKeys.RESULT_REQUEST_LYRIC_EXIF_MAKER_NOTE;
        } else if (zM11820b) {
            CaptureResult.Key key121 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_REQUEST_LYRIC_EXIF_MAKER_NOTE;
        } else if (zM11820b2) {
            CaptureResult.Key key122 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_REQUEST_LYRIC_EXIF_MAKER_NOTE;
        }
        if (m11816a(24)) {
            CaptureResult.Key key123 = ExperimentalKeys.RESULT_LYRIC_EXIF_MAKER_NOTE;
        } else if (zM11820b) {
            CaptureResult.Key key124 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_LYRIC_EXIF_MAKER_NOTE;
        } else if (zM11820b2) {
            CaptureResult.Key key125 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_LYRIC_EXIF_MAKER_NOTE;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m11816a(int i) {
        if (!f32435u) {
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
