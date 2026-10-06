package p000;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import com.google.android.camera.experimental2016.ExperimentalKeys;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ivr {

    /* JADX INFO: renamed from: a */
    public static final CaptureRequest.Key f32309a;

    /* JADX INFO: renamed from: b */
    public static final CaptureResult.Key f32310b;

    /* JADX INFO: renamed from: c */
    private static final boolean f32311c;

    /* JADX INFO: renamed from: d */
    private static final boolean f32312d;

    /* JADX INFO: renamed from: e */
    private static final boolean f32313e;

    /* JADX INFO: renamed from: f */
    private static final boolean f32314f;

    /* JADX INFO: renamed from: g */
    private static final boolean f32315g;

    /* JADX INFO: renamed from: h */
    private static final boolean f32316h;

    /* JADX INFO: renamed from: i */
    private static final boolean f32317i;

    /* JADX INFO: renamed from: j */
    private static final boolean f32318j;

    /* JADX INFO: renamed from: k */
    private static final boolean f32319k;

    /* JADX INFO: renamed from: l */
    private static final boolean f32320l;

    static {
        CaptureRequest.Key key;
        boolean zM11820b = ivz.m11820b(1);
        f32311c = zM11820b;
        boolean zM11820b2 = ivz.m11820b(2);
        f32312d = zM11820b2;
        boolean zM11820b3 = ivz.m11820b(3);
        f32313e = zM11820b3;
        boolean zM11820b4 = ivz.m11820b(4);
        f32314f = zM11820b4;
        boolean zM11820b5 = ivz.m11820b(5);
        f32315g = zM11820b5;
        boolean zM11820b6 = ivz.m11820b(6);
        f32316h = zM11820b6;
        boolean zM11820b7 = ivz.m11820b(7);
        f32317i = zM11820b7;
        boolean zM11820b8 = ivz.m11820b(8);
        f32318j = zM11820b8;
        boolean zM11820b9 = ivz.m11820b(10);
        f32319k = zM11820b9;
        f32320l = true;
        if (zM11820b) {
            key = ExperimentalKeys.EXPERIMENTAL_CONTROL_HYBRID_AE;
        } else if (zM11820b2) {
            key = com.google.android.camera.experimental2017.ExperimentalKeys.EXPERIMENTAL_CONTROL_HYBRID_AE;
        } else if (zM11820b3) {
            key = com.google.android.camera.experimental2018.ExperimentalKeys.EXPERIMENTAL_CONTROL_HYBRID_AE;
        } else if (zM11820b4) {
            key = com.google.android.camera.experimental2019.ExperimentalKeys.REQUEST_HYBRID_AE_ENABLE;
        } else if (zM11820b5) {
            key = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_HYBRID_AE_ENABLE;
        } else if (zM11820b6) {
            key = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_HYBRID_AE_ENABLE;
        } else if (zM11820b7) {
            key = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_HYBRID_AE_ENABLE;
        } else if (zM11820b8) {
            key = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_HYBRID_AE_ENABLE;
        } else {
            key = zM11820b9 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_HYBRID_AE_ENABLE : null;
        }
        f32309a = key;
        if (zM11820b) {
            CaptureResult.Key key2 = ExperimentalKeys.EXPERIMENTAL_DYNAMIC_HYBRID_AE;
        } else if (zM11820b2) {
            CaptureResult.Key key3 = com.google.android.camera.experimental2017.ExperimentalKeys.EXPERIMENTAL_DYNAMIC_HYBRID_AE;
        } else if (zM11820b3) {
            CaptureResult.Key key4 = com.google.android.camera.experimental2018.ExperimentalKeys.EXPERIMENTAL_DYNAMIC_HYBRID_AE;
        } else if (zM11820b4) {
            CaptureResult.Key key5 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_HYBRID_AE_ENABLE;
        } else if (zM11820b5) {
            CaptureResult.Key key6 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_HYBRID_AE_ENABLE;
        } else if (zM11820b6) {
            CaptureResult.Key key7 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_HYBRID_AE_ENABLE;
        } else if (zM11820b7) {
            CaptureResult.Key key8 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_HYBRID_AE_ENABLE;
        } else if (zM11820b8) {
            CaptureResult.Key key9 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_HYBRID_AE_ENABLE;
        } else if (zM11820b9) {
            CaptureResult.Key key10 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_HYBRID_AE_ENABLE;
        }
        f32310b = CaptureResult.CONTROL_AF_SCENE_CHANGE;
    }
}
