package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import com.google.android.camera.experimental2019.ExperimentalKeys;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ivu {

    /* JADX INFO: renamed from: a */
    public static final CaptureResult.Key f32373a;

    /* JADX INFO: renamed from: b */
    public static final CaptureRequest.Key f32374b;

    /* JADX INFO: renamed from: c */
    public static final CaptureResult.Key f32375c;

    /* JADX INFO: renamed from: d */
    public static final CameraCharacteristics.Key f32376d;

    /* JADX INFO: renamed from: e */
    public static final CaptureRequest.Key f32377e;

    /* JADX INFO: renamed from: f */
    public static final CaptureResult.Key f32378f;

    /* JADX INFO: renamed from: g */
    public static final CaptureResult.Key f32379g;

    /* JADX INFO: renamed from: h */
    public static final CaptureResult.Key f32380h;

    /* JADX INFO: renamed from: i */
    public static final CaptureResult.Key f32381i;

    /* JADX INFO: renamed from: j */
    public static final CaptureRequest.Key f32382j;

    /* JADX INFO: renamed from: k */
    public static final CaptureRequest.Key f32383k;

    /* JADX INFO: renamed from: l */
    public static final CaptureRequest.Key f32384l;

    /* JADX INFO: renamed from: m */
    public static final CaptureResult.Key f32385m;

    /* JADX INFO: renamed from: n */
    private static final boolean f32386n = ivz.m11820b(4);

    /* JADX INFO: renamed from: o */
    private static final boolean f32387o;

    /* JADX INFO: renamed from: p */
    private static final boolean f32388p;

    /* JADX INFO: renamed from: q */
    private static final boolean f32389q;

    /* JADX INFO: renamed from: r */
    private static final boolean f32390r;

    /* JADX INFO: renamed from: s */
    private static final boolean f32391s;

    static {
        CaptureResult.Key key;
        CaptureRequest.Key key2;
        CaptureResult.Key key3;
        CameraCharacteristics.Key key4;
        CaptureRequest.Key key5;
        CaptureResult.Key key6;
        CaptureResult.Key key7;
        CaptureResult.Key key8;
        CaptureResult.Key key9;
        CaptureRequest.Key key10;
        CaptureRequest.Key key11;
        CaptureRequest.Key key12;
        boolean zM11820b = ivz.m11820b(5);
        f32387o = zM11820b;
        boolean zM11820b2 = ivz.m11820b(6);
        f32388p = zM11820b2;
        boolean zM11820b3 = ivz.m11820b(7);
        f32389q = zM11820b3;
        boolean zM11820b4 = ivz.m11820b(8);
        f32390r = zM11820b4;
        boolean zM11820b5 = ivz.m11820b(10);
        f32391s = zM11820b5;
        if (m11814a(1)) {
            CaptureRequest.Key key13 = ExperimentalKeys.REQUEST_LENS_SHADING_STATS_ENABLED;
        } else if (zM11820b) {
            CaptureRequest.Key key14 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_LENS_SHADING_STATS_ENABLED;
        } else if (zM11820b2) {
            CaptureRequest.Key key15 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_LENS_SHADING_STATS_ENABLED;
        } else if (zM11820b3) {
            CaptureRequest.Key key16 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_LENS_SHADING_STATS_ENABLED;
        } else if (zM11820b4) {
            CaptureRequest.Key key17 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_LENS_SHADING_STATS_ENABLED;
        } else if (zM11820b5) {
            CaptureRequest.Key key18 = com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_LENS_SHADING_STATS_ENABLED;
        }
        if (m11814a(1)) {
            CaptureResult.Key key19 = ExperimentalKeys.RESULT_LENS_SHADING_STATS_ENABLED;
        } else if (zM11820b) {
            CaptureResult.Key key20 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_LENS_SHADING_STATS_ENABLED;
        } else if (zM11820b2) {
            CaptureResult.Key key21 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_LENS_SHADING_STATS_ENABLED;
        } else if (zM11820b3) {
            CaptureResult.Key key22 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_LENS_SHADING_STATS_ENABLED;
        } else if (zM11820b4) {
            CaptureResult.Key key23 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_LENS_SHADING_STATS_ENABLED;
        } else if (zM11820b5) {
            CaptureResult.Key key24 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_LENS_SHADING_STATS_ENABLED;
        }
        if (m11814a(1)) {
            CaptureResult.Key key25 = ExperimentalKeys.RESULT_LENS_SHADING_STATS;
        } else if (zM11820b) {
            CaptureResult.Key key26 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_LENS_SHADING_STATS;
        } else if (zM11820b2) {
            CaptureResult.Key key27 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_LENS_SHADING_STATS;
        } else if (zM11820b3) {
            CaptureResult.Key key28 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_LENS_SHADING_STATS;
        } else if (zM11820b4) {
            CaptureResult.Key key29 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_LENS_SHADING_STATS;
        } else if (zM11820b5) {
            CaptureResult.Key key30 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_LENS_SHADING_STATS;
        }
        if (m11814a(2)) {
            CaptureRequest.Key key31 = ExperimentalKeys.REQUEST_GCAM_AE_MOTION_EF_ENABLED;
        } else if (zM11820b) {
            CaptureRequest.Key key32 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_GCAM_AE_MOTION_EF_ENABLED;
        } else if (zM11820b2) {
            CaptureRequest.Key key33 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_GCAM_AE_MOTION_EF_ENABLED;
        } else if (zM11820b3) {
            CaptureRequest.Key key34 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_GCAM_AE_MOTION_EF_ENABLED;
        } else if (zM11820b4) {
            CaptureRequest.Key key35 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_GCAM_AE_MOTION_EF_ENABLED;
        } else if (zM11820b5) {
            CaptureRequest.Key key36 = com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_GCAM_AE_MOTION_EF_ENABLED;
        }
        if (m11814a(2)) {
            CaptureResult.Key key37 = ExperimentalKeys.RESULT_GCAM_AE_MOTION_EF_ENABLED;
        } else if (zM11820b) {
            CaptureResult.Key key38 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_GCAM_AE_MOTION_EF_ENABLED;
        } else if (zM11820b2) {
            CaptureResult.Key key39 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_GCAM_AE_MOTION_EF_ENABLED;
        } else if (zM11820b3) {
            CaptureResult.Key key40 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_GCAM_AE_MOTION_EF_ENABLED;
        } else if (zM11820b4) {
            CaptureResult.Key key41 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_GCAM_AE_MOTION_EF_ENABLED;
        } else if (zM11820b5) {
            CaptureResult.Key key42 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_GCAM_AE_MOTION_EF_ENABLED;
        }
        CaptureResult.Key key43 = null;
        if (m11814a(2)) {
            key = ExperimentalKeys.RESULT_GCAM_AE_OUTPUT;
        } else if (zM11820b) {
            key = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_GCAM_AE_OUTPUT;
        } else if (zM11820b2) {
            key = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_GCAM_AE_OUTPUT;
        } else if (zM11820b3) {
            key = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_GCAM_AE_OUTPUT;
        } else if (zM11820b4) {
            key = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_GCAM_AE_OUTPUT;
        } else {
            key = zM11820b5 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_GCAM_AE_OUTPUT : null;
        }
        f32373a = key;
        if (m11814a(2)) {
            key2 = ExperimentalKeys.REQUEST_LIVE_HDR_SETTINGS;
        } else if (zM11820b) {
            key2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_LIVE_HDR_SETTINGS;
        } else if (zM11820b2) {
            key2 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_LIVE_HDR_SETTINGS;
        } else if (zM11820b3) {
            key2 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_LIVE_HDR_SETTINGS;
        } else if (zM11820b4) {
            key2 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_LIVE_HDR_SETTINGS;
        } else {
            key2 = zM11820b5 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_LIVE_HDR_SETTINGS : null;
        }
        f32374b = key2;
        if (m11814a(2)) {
            key3 = ExperimentalKeys.RESULT_LIVE_HDR_SETTINGS;
        } else if (zM11820b) {
            key3 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_LIVE_HDR_SETTINGS;
        } else if (zM11820b2) {
            key3 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_LIVE_HDR_SETTINGS;
        } else if (zM11820b3) {
            key3 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_LIVE_HDR_SETTINGS;
        } else if (zM11820b4) {
            key3 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_LIVE_HDR_SETTINGS;
        } else {
            key3 = zM11820b5 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_LIVE_HDR_SETTINGS : null;
        }
        f32375c = key3;
        if (m11814a(3)) {
            CaptureRequest.Key key44 = ExperimentalKeys.REQUEST_IPE_INFO_ENABLED;
        } else if (zM11820b) {
            CaptureRequest.Key key45 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_IPE_INFO_ENABLED;
        } else if (zM11820b2) {
            CaptureRequest.Key key46 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_IPE_INFO_ENABLED;
        }
        if (m11814a(3)) {
            CaptureResult.Key key47 = ExperimentalKeys.RESULT_IPE_INFO_ENABLED;
        } else if (zM11820b) {
            CaptureResult.Key key48 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_IPE_INFO_ENABLED;
        } else if (zM11820b2) {
            CaptureResult.Key key49 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_IPE_INFO_ENABLED;
        }
        if (m11814a(3)) {
            CaptureResult.Key key50 = ExperimentalKeys.RESULT_IPE_INFO;
        } else if (zM11820b) {
            CaptureResult.Key key51 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_IPE_INFO;
        } else if (zM11820b2) {
            CaptureResult.Key key52 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_IPE_INFO;
        }
        if (m11814a(3)) {
            CaptureRequest.Key key53 = ExperimentalKeys.REQUEST_IFE_INFO_ENABLED;
        } else if (zM11820b) {
            CaptureRequest.Key key54 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_IFE_INFO_ENABLED;
        } else if (zM11820b2) {
            CaptureRequest.Key key55 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_IFE_INFO_ENABLED;
        }
        if (m11814a(3)) {
            CaptureResult.Key key56 = ExperimentalKeys.RESULT_IFE_INFO_ENABLED;
        } else if (zM11820b) {
            CaptureResult.Key key57 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_IFE_INFO_ENABLED;
        } else if (zM11820b2) {
            CaptureResult.Key key58 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_IFE_INFO_ENABLED;
        }
        if (m11814a(3)) {
            CaptureResult.Key key59 = ExperimentalKeys.RESULT_IFE_INFO;
        } else if (zM11820b) {
            CaptureResult.Key key60 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_IFE_INFO;
        } else if (zM11820b2) {
            CaptureResult.Key key61 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_IFE_INFO;
        }
        if (m11814a(3)) {
            CaptureRequest.Key key62 = ExperimentalKeys.REQUEST_BPS_INFO_ENABLED;
        } else if (zM11820b) {
            CaptureRequest.Key key63 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_BPS_INFO_ENABLED;
        } else if (zM11820b2) {
            CaptureRequest.Key key64 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_BPS_INFO_ENABLED;
        }
        if (m11814a(3)) {
            CaptureResult.Key key65 = ExperimentalKeys.RESULT_BPS_INFO_ENABLED;
        } else if (zM11820b) {
            CaptureResult.Key key66 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_BPS_INFO_ENABLED;
        } else if (zM11820b2) {
            CaptureResult.Key key67 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_BPS_INFO_ENABLED;
        }
        if (m11814a(3)) {
            CaptureResult.Key key68 = ExperimentalKeys.RESULT_BPS_INFO;
        } else if (zM11820b) {
            CaptureResult.Key key69 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_BPS_INFO;
        } else if (zM11820b2) {
            CaptureResult.Key key70 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_BPS_INFO;
        }
        if (m11814a(4)) {
            key4 = ExperimentalKeys.CHARACTERISTICS_MESH_WARP_AVAILABLE_MODES;
        } else if (zM11820b) {
            key4 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.CHARACTERISTICS_MESH_WARP_AVAILABLE_MODES;
        } else if (zM11820b2) {
            key4 = com.google.android.camera.experimental2020.ExperimentalKeys.CHARACTERISTICS_MESH_WARP_AVAILABLE_MODES;
        } else if (zM11820b3) {
            key4 = com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_MESH_WARP_AVAILABLE_MODES;
        } else if (zM11820b4) {
            key4 = com.google.android.camera.experimental2022.ExperimentalKeys.CHARACTERISTICS_MESH_WARP_AVAILABLE_MODES;
        } else {
            key4 = zM11820b5 ? com.google.android.camera.experimental2023.ExperimentalKeys.CHARACTERISTICS_MESH_WARP_AVAILABLE_MODES : null;
        }
        f32376d = key4;
        if (m11814a(4)) {
            key5 = ExperimentalKeys.REQUEST_MESH_WARP_MODE;
        } else if (zM11820b) {
            key5 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_MESH_WARP_MODE;
        } else if (zM11820b2) {
            key5 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_MESH_WARP_MODE;
        } else if (zM11820b3) {
            key5 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_MESH_WARP_MODE;
        } else if (zM11820b4) {
            key5 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_MESH_WARP_MODE;
        } else {
            key5 = zM11820b5 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_MESH_WARP_MODE : null;
        }
        f32377e = key5;
        if (m11814a(4)) {
            CaptureResult.Key key71 = ExperimentalKeys.RESULT_MESH_WARP_MODE;
        } else if (zM11820b) {
            CaptureResult.Key key72 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_MESH_WARP_MODE;
        } else if (zM11820b2) {
            CaptureResult.Key key73 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_MESH_WARP_MODE;
        } else if (zM11820b3) {
            CaptureResult.Key key74 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_MESH_WARP_MODE;
        } else if (zM11820b4) {
            CaptureResult.Key key75 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_MESH_WARP_MODE;
        } else if (zM11820b5) {
            CaptureResult.Key key76 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_MESH_WARP_MODE;
        }
        if (m11814a(4)) {
            key6 = ExperimentalKeys.RESULT_MESH_WARP_SIZE;
        } else if (zM11820b) {
            key6 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_MESH_WARP_SIZE;
        } else if (zM11820b2) {
            key6 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_MESH_WARP_SIZE;
        } else if (zM11820b3) {
            key6 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_MESH_WARP_SIZE;
        } else if (zM11820b4) {
            key6 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_MESH_WARP_SIZE;
        } else {
            key6 = zM11820b5 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_MESH_WARP_SIZE : null;
        }
        f32378f = key6;
        if (m11814a(4)) {
            key7 = ExperimentalKeys.RESULT_MESH_WARP_CROP_REGION;
        } else if (zM11820b) {
            key7 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_MESH_WARP_CROP_REGION;
        } else if (zM11820b2) {
            key7 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_MESH_WARP_CROP_REGION;
        } else if (zM11820b3) {
            key7 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_MESH_WARP_CROP_REGION;
        } else if (zM11820b4) {
            key7 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_MESH_WARP_CROP_REGION;
        } else {
            key7 = zM11820b5 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_MESH_WARP_CROP_REGION : null;
        }
        f32379g = key7;
        if (m11814a(4)) {
            key8 = ExperimentalKeys.RESULT_MESH_WARP_DATA;
        } else if (zM11820b) {
            key8 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_MESH_WARP_DATA;
        } else if (zM11820b2) {
            key8 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_MESH_WARP_DATA;
        } else if (zM11820b3) {
            key8 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_MESH_WARP_DATA;
        } else if (zM11820b4) {
            key8 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_MESH_WARP_DATA;
        } else {
            key8 = zM11820b5 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_MESH_WARP_DATA : null;
        }
        f32380h = key8;
        if (m11814a(8)) {
            key9 = ExperimentalKeys.RESULT_MESH_WARP_IS_IDENTITY_TRANSFORM;
        } else if (zM11820b) {
            key9 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_MESH_WARP_IS_IDENTITY_TRANSFORM;
        } else if (zM11820b2) {
            key9 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_MESH_WARP_IS_IDENTITY_TRANSFORM;
        } else if (zM11820b3) {
            key9 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_MESH_WARP_IS_IDENTITY_TRANSFORM;
        } else if (zM11820b4) {
            key9 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_MESH_WARP_IS_IDENTITY_TRANSFORM;
        } else {
            key9 = zM11820b5 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_MESH_WARP_IS_IDENTITY_TRANSFORM : null;
        }
        f32381i = key9;
        if (m11814a(5)) {
            key10 = ExperimentalKeys.REQUEST_HDRNET_MODE;
        } else if (zM11820b) {
            key10 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_HDRNET_MODE;
        } else if (zM11820b2) {
            key10 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_HDRNET_MODE;
        } else if (zM11820b3) {
            key10 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_HDRNET_MODE;
        } else if (zM11820b4) {
            key10 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_HDRNET_MODE;
        } else {
            key10 = zM11820b5 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_HDRNET_MODE : null;
        }
        f32382j = key10;
        if (m11814a(5)) {
            CaptureResult.Key key77 = ExperimentalKeys.RESULT_HDRNET_MODE;
        } else if (zM11820b) {
            CaptureResult.Key key78 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_HDRNET_MODE;
        } else if (zM11820b2) {
            CaptureResult.Key key79 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_HDRNET_MODE;
        } else if (zM11820b3) {
            CaptureResult.Key key80 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_HDRNET_MODE;
        } else if (zM11820b4) {
            CaptureResult.Key key81 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_HDRNET_MODE;
        } else if (zM11820b5) {
            CaptureResult.Key key82 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_HDRNET_MODE;
        }
        if (m11814a(6)) {
            key11 = ExperimentalKeys.REQUEST_AUTO_3A_SCENE_MODE;
        } else if (zM11820b) {
            key11 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_AUTO_3A_SCENE_MODE;
        } else if (zM11820b2) {
            key11 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_AUTO_3A_SCENE_MODE;
        } else if (zM11820b3) {
            key11 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_AUTO_3A_SCENE_MODE;
        } else if (zM11820b4) {
            key11 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_AUTO_3A_SCENE_MODE;
        } else {
            key11 = zM11820b5 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_AUTO_3A_SCENE_MODE : null;
        }
        f32383k = key11;
        if (m11814a(6)) {
            CaptureResult.Key key83 = ExperimentalKeys.RESULT_AUTO_3A_SCENE_MODE;
        } else if (zM11820b) {
            CaptureResult.Key key84 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_AUTO_3A_SCENE_MODE;
        } else if (zM11820b2) {
            CaptureResult.Key key85 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_AUTO_3A_SCENE_MODE;
        } else if (zM11820b3) {
            CaptureResult.Key key86 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_AUTO_3A_SCENE_MODE;
        } else if (zM11820b4) {
            CaptureResult.Key key87 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_AUTO_3A_SCENE_MODE;
        } else if (zM11820b5) {
            CaptureResult.Key key88 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_AUTO_3A_SCENE_MODE;
        }
        if (m11814a(7)) {
            key12 = ExperimentalKeys.REQUEST_AF_RESCAN_FRAME_COUNT;
        } else if (zM11820b) {
            key12 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_AF_RESCAN_FRAME_COUNT;
        } else if (zM11820b2) {
            key12 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_AF_RESCAN_FRAME_COUNT;
        } else if (zM11820b3) {
            key12 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_AF_RESCAN_FRAME_COUNT;
        } else if (zM11820b4) {
            key12 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_AF_RESCAN_FRAME_COUNT;
        } else {
            key12 = zM11820b5 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_AF_RESCAN_FRAME_COUNT : null;
        }
        f32384l = key12;
        if (m11814a(7)) {
            key43 = ExperimentalKeys.RESULT_AF_RESCAN_FRAME_COUNT;
        } else if (zM11820b) {
            key43 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_AF_RESCAN_FRAME_COUNT;
        } else if (zM11820b2) {
            key43 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_AF_RESCAN_FRAME_COUNT;
        } else if (zM11820b3) {
            key43 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_AF_RESCAN_FRAME_COUNT;
        } else if (zM11820b4) {
            key43 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_AF_RESCAN_FRAME_COUNT;
        } else if (zM11820b5) {
            key43 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_AF_RESCAN_FRAME_COUNT;
        }
        f32385m = key43;
        if (m11814a(10)) {
            CaptureRequest.Key key89 = ExperimentalKeys.REQUEST_SENSOR_MODE_FULLFOV;
        } else if (zM11820b) {
            CaptureRequest.Key key90 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_SENSOR_MODE_FULLFOV;
        } else if (zM11820b2) {
            CaptureRequest.Key key91 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_SENSOR_MODE_FULLFOV;
        } else if (zM11820b3) {
            CaptureRequest.Key key92 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_SENSOR_MODE_FULLFOV;
        } else if (zM11820b4) {
            CaptureRequest.Key key93 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_SENSOR_MODE_FULLFOV;
        } else if (zM11820b5) {
            CaptureRequest.Key key94 = com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_SENSOR_MODE_FULLFOV;
        }
        if (m11814a(10)) {
            CaptureResult.Key key95 = ExperimentalKeys.RESULT_SENSOR_MODE_FULLFOV;
        } else if (zM11820b) {
            CaptureResult.Key key96 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_SENSOR_MODE_FULLFOV;
        } else if (zM11820b2) {
            CaptureResult.Key key97 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_SENSOR_MODE_FULLFOV;
        } else if (zM11820b3) {
            CaptureResult.Key key98 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_SENSOR_MODE_FULLFOV;
        } else if (zM11820b4) {
            CaptureResult.Key key99 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_SENSOR_MODE_FULLFOV;
        } else if (zM11820b5) {
            CaptureResult.Key key100 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_SENSOR_MODE_FULLFOV;
        }
        if (m11814a(11)) {
            CaptureResult.Key key101 = ExperimentalKeys.RESULT_RLS_ENABLE;
            return;
        }
        if (ivv.m11815a(3)) {
            CaptureResult.Key key102 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_RLS_ENABLE;
            return;
        }
        if (zM11820b3) {
            CaptureResult.Key key103 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_RLS_ENABLE;
        } else if (zM11820b4) {
            CaptureResult.Key key104 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_RLS_ENABLE;
        } else if (zM11820b5) {
            CaptureResult.Key key105 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_RLS_ENABLE;
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m11814a(int i) {
        if (!f32386n) {
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
