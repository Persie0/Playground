package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import com.google.android.camera.experimental2022.ExperimentalKeys;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ivx {

    /* JADX INFO: renamed from: a */
    public static final CaptureResult.Key f32438a;

    /* JADX INFO: renamed from: b */
    public static final CaptureResult.Key f32439b;

    /* JADX INFO: renamed from: c */
    public static final CaptureResult.Key f32440c;

    /* JADX INFO: renamed from: d */
    public static final CaptureRequest.Key f32441d;

    /* JADX INFO: renamed from: e */
    public static final CaptureResult.Key f32442e;

    /* JADX INFO: renamed from: f */
    public static final CaptureRequest.Key f32443f;

    /* JADX INFO: renamed from: g */
    public static final CaptureResult.Key f32444g;

    /* JADX INFO: renamed from: h */
    public static final CaptureRequest.Key f32445h;

    /* JADX INFO: renamed from: i */
    public static final CaptureResult.Key f32446i;

    /* JADX INFO: renamed from: j */
    public static final CaptureRequest.Key f32447j;

    /* JADX INFO: renamed from: k */
    public static final CaptureRequest.Key f32448k;

    /* JADX INFO: renamed from: l */
    public static final CameraCharacteristics.Key f32449l;

    /* JADX INFO: renamed from: m */
    public static final CaptureResult.Key f32450m;

    /* JADX INFO: renamed from: n */
    private static final boolean f32451n = ivz.m11820b(8);

    /* JADX INFO: renamed from: o */
    private static final boolean f32452o;

    static {
        CaptureResult.Key key;
        CaptureResult.Key key2;
        CaptureResult.Key key3;
        CaptureRequest.Key key4;
        CaptureResult.Key key5;
        CaptureRequest.Key key6;
        CaptureResult.Key key7;
        CaptureRequest.Key key8;
        CaptureResult.Key key9;
        CaptureRequest.Key key10;
        CaptureRequest.Key key11;
        CameraCharacteristics.Key key12;
        boolean zM11820b = ivz.m11820b(10);
        f32452o = zM11820b;
        if (m11817a(1)) {
            key = ExperimentalKeys.RESULT_AF_TARGET_FOCUS;
        } else {
            key = zM11820b ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_AF_TARGET_FOCUS : null;
        }
        f32438a = key;
        if (m11817a(1)) {
            key2 = ExperimentalKeys.RESULT_AF_MULTI_DEPTH_FACE_DEBLUR;
        } else {
            key2 = zM11820b ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_AF_MULTI_DEPTH_FACE_DEBLUR : null;
        }
        f32439b = key2;
        if (m11817a(1)) {
            CaptureRequest.Key key13 = ExperimentalKeys.REQUEST_MULTI_DEPTH_FACE_DEBLUR_ACTIVE;
        } else if (zM11820b) {
            CaptureRequest.Key key14 = com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_MULTI_DEPTH_FACE_DEBLUR_ACTIVE;
        }
        if (m11817a(1)) {
            CaptureResult.Key key15 = ExperimentalKeys.RESULT_MULTI_DEPTH_FACE_DEBLUR_ACTIVE;
        } else if (zM11820b) {
            CaptureResult.Key key16 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_MULTI_DEPTH_FACE_DEBLUR_ACTIVE;
        }
        if (m11817a(1)) {
            CaptureRequest.Key key17 = ExperimentalKeys.REQUEST_AF_DEBUG_CONTROL;
        } else if (zM11820b) {
            CaptureRequest.Key key18 = com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_AF_DEBUG_CONTROL;
        }
        if (m11817a(1)) {
            CaptureResult.Key key19 = ExperimentalKeys.RESULT_AF_DEBUG_CONTROL;
        } else if (zM11820b) {
            CaptureResult.Key key20 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_AF_DEBUG_CONTROL;
        }
        if (m11817a(2)) {
            key3 = ExperimentalKeys.RESULT_ULTRAHDR_ENABLED;
        } else {
            key3 = zM11820b ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_ULTRAHDR_ENABLED : null;
        }
        f32440c = key3;
        if (m11817a(3)) {
            key4 = ExperimentalKeys.REQUEST_AF_MACRO_MODE;
        } else {
            key4 = zM11820b ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_AF_MACRO_MODE : null;
        }
        f32441d = key4;
        if (m11817a(3)) {
            CaptureResult.Key key21 = ExperimentalKeys.RESULT_AF_MACRO_MODE;
        } else if (zM11820b) {
            CaptureResult.Key key22 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_AF_MACRO_MODE;
        }
        if (m11817a(4)) {
            CaptureResult.Key key23 = ExperimentalKeys.RESULT_AE_TIMEOUT;
        } else if (zM11820b) {
            CaptureResult.Key key24 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_AE_TIMEOUT;
        }
        if (m11817a(5)) {
            key5 = ExperimentalKeys.RESULT_FACE_RECTANGLE_SKIN_AREA;
        } else {
            key5 = zM11820b ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FACE_RECTANGLE_SKIN_AREA : null;
        }
        f32442e = key5;
        if (m11817a(6)) {
            key6 = ExperimentalKeys.REQUEST_3A_VIDEO_METADATA_MODE;
        } else {
            key6 = zM11820b ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_3A_VIDEO_METADATA_MODE : null;
        }
        f32443f = key6;
        if (m11817a(6)) {
            key7 = ExperimentalKeys.RESULT_3A_VIDEO_METADATA_MODE;
        } else {
            key7 = zM11820b ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_3A_VIDEO_METADATA_MODE : null;
        }
        f32444g = key7;
        if (m11817a(8)) {
            key8 = ExperimentalKeys.REQUEST_MESH_WARP_IS_FORWARD_MESH;
        } else {
            key8 = zM11820b ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_MESH_WARP_IS_FORWARD_MESH : null;
        }
        f32445h = key8;
        if (m11817a(7)) {
            key9 = ExperimentalKeys.RESULT_MESH_WARP_IS_FORWARD_MESH;
        } else {
            key9 = zM11820b ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_MESH_WARP_IS_FORWARD_MESH : null;
        }
        f32446i = key9;
        if (m11817a(9)) {
            CaptureResult.Key key25 = ExperimentalKeys.RESULT_TUNING_USE_CASE;
        } else if (zM11820b) {
            CaptureResult.Key key26 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_TUNING_USE_CASE;
        }
        if (m11817a(10)) {
            CaptureResult.Key key27 = ExperimentalKeys.RESULT_FACE_UNLOCK_AWB_INFORMATION;
        } else if (zM11820b) {
            CaptureResult.Key key28 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FACE_UNLOCK_AWB_INFORMATION;
        }
        if (m11817a(11)) {
            key10 = ExperimentalKeys.REQUEST_FAST_ZOOM_MODE;
        } else {
            key10 = zM11820b ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_FAST_ZOOM_MODE : null;
        }
        f32447j = key10;
        if (m11817a(11)) {
            key11 = ExperimentalKeys.REQUEST_ZOOM_TARGET;
        } else {
            key11 = zM11820b ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_ZOOM_TARGET : null;
        }
        f32448k = key11;
        if (m11817a(12)) {
            key12 = ExperimentalKeys.CHARACTERISTICS_EEPROM_2D_BLC_BLOB;
        } else {
            key12 = zM11820b ? com.google.android.camera.experimental2023.ExperimentalKeys.CHARACTERISTICS_EEPROM_2D_BLC_BLOB : null;
        }
        f32449l = key12;
        if (m11817a(13)) {
            CaptureResult.Key key29 = ExperimentalKeys.RESULT_AF_EYE_ROI;
        }
        f32450m = m11817a(14) ? ExperimentalKeys.RESULT_MULTICAM_LEADCAMID : null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m11817a(int i) {
        if (!f32451n) {
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
