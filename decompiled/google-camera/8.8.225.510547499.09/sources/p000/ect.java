package p000;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.HardwareBuffer;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.location.Location;
import android.util.DisplayMetrics;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.legacy.app.activity.main.kuX.PMZiHihxLGEy;
import com.google.android.clockwork.common.wearable.wearmaterial.selectioncontrol.eMjB.VzWFSVj;
import com.google.android.gms.dynamite.p017ho.DNTdN;
import com.google.android.libraries.lens.lenslite.api.arLu.YmzeHXaMYOLk;
import com.google.android.libraries.vision.opengl.MUg.WIxTIdUIdfb;
import com.google.android.material.snackbar.VMX.rgoX;
import com.google.googlex.gcam.AeResults;
import com.google.googlex.gcam.AeShotParams;
import com.google.googlex.gcam.AfMetadata;
import com.google.googlex.gcam.AndroidJniUtils;
import com.google.googlex.gcam.AwbInfo;
import com.google.googlex.gcam.BuildPayloadBurstSpecOptions;
import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.ClientShotMetadata;
import com.google.googlex.gcam.DebugParams;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.FrameMetadataKey;
import com.google.googlex.gcam.Gcam;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.GenerateRgbImageOptions;
import com.google.googlex.gcam.GyroSampleVector;
import com.google.googlex.gcam.ImageSaverParams;
import com.google.googlex.gcam.InitParams;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.LocationData;
import com.google.googlex.gcam.NormalizedRect;
import com.google.googlex.gcam.PhysicalStabilityParams;
import com.google.googlex.gcam.PostShutterAfParams;
import com.google.googlex.gcam.PostviewParams;
import com.google.googlex.gcam.RawWriteView;
import com.google.googlex.gcam.ShotCallbacks;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.ShotParams;
import com.google.googlex.gcam.SpatialGainMap;
import com.google.googlex.gcam.StaticMetadata;
import com.google.googlex.gcam.Tuning;
import com.google.googlex.gcam.ViewfinderResults;
import com.google.googlex.gcam.base.function.IntByteArrayConsumer;
import com.google.googlex.gcam.base.function.IntConsumer;
import com.google.googlex.gcam.base.function.IntFloatConsumer;
import com.google.googlex.gcam.base.function.IntLongConsumer;
import com.google.googlex.gcam.base.function.IntStringConsumer;
import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;
import com.google.googlex.gcam.hdrplus.BaseFrameAeCallback;
import com.google.googlex.gcam.hdrplus.BaseFrameCallback;
import com.google.googlex.gcam.hdrplus.MergedRawCallback;
import com.google.googlex.gcam.hdrplus.MutableMergedRawCallback;
import com.google.googlex.gcam.hdrplus.NativeHdrPlusInterface;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p021j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ect implements ecq {

    /* JADX INFO: renamed from: A */
    private final ebw f13403A;

    /* JADX INFO: renamed from: B */
    private final ebq f13404B;

    /* JADX INFO: renamed from: C */
    private final eby f13405C;

    /* JADX INFO: renamed from: D */
    private final eco f13406D;

    /* JADX INFO: renamed from: E */
    private final jwn f13407E;

    /* JADX INFO: renamed from: F */
    private final fuz f13408F;

    /* JADX INFO: renamed from: G */
    private final eci f13409G;

    /* JADX INFO: renamed from: H */
    private final Executor f13410H;

    /* JADX INFO: renamed from: I */
    private final gtl f13411I;

    /* JADX INFO: renamed from: J */
    private final eet f13412J;

    /* JADX INFO: renamed from: K */
    private final gpw f13413K;

    /* JADX INFO: renamed from: L */
    private final kpb f13414L;

    /* JADX INFO: renamed from: M */
    private final inm f13415M;

    /* JADX INFO: renamed from: N */
    private final jwn f13416N;

    /* JADX INFO: renamed from: O */
    private final kme f13417O;

    /* JADX INFO: renamed from: P */
    private final gcx f13418P;

    /* JADX INFO: renamed from: Q */
    private final eba f13419Q;

    /* JADX INFO: renamed from: R */
    private final hnw f13420R;

    /* JADX INFO: renamed from: S */
    private final dsx f13421S;

    /* JADX INFO: renamed from: T */
    private final ihk f13422T;

    /* JADX INFO: renamed from: U */
    private final bko f13423U;

    /* JADX INFO: renamed from: V */
    private final bko f13424V;

    /* JADX INFO: renamed from: W */
    private final cwd f13425W;

    /* JADX INFO: renamed from: d */
    public final kbz f13426d;

    /* JADX INFO: renamed from: h */
    private final mwx f13429h;

    /* JADX INFO: renamed from: i */
    private final Gcam f13430i;

    /* JADX INFO: renamed from: j */
    private final nsx f13431j;

    /* JADX INFO: renamed from: k */
    private final ebv f13432k;

    /* JADX INFO: renamed from: l */
    private final dhv f13433l;

    /* JADX INFO: renamed from: m */
    private final oju f13434m;

    /* JADX INFO: renamed from: n */
    private final jwn f13435n;

    /* JADX INFO: renamed from: o */
    private final edk f13436o;

    /* JADX INFO: renamed from: p */
    private final DisplayMetrics f13437p;

    /* JADX INFO: renamed from: q */
    private final nta f13438q;

    /* JADX INFO: renamed from: r */
    private final nsz f13439r;

    /* JADX INFO: renamed from: s */
    private final kmd f13440s;

    /* JADX INFO: renamed from: t */
    private final kbc f13441t;

    /* JADX INFO: renamed from: u */
    private final oju f13442u;

    /* JADX INFO: renamed from: v */
    private final jvb f13443v;

    /* JADX INFO: renamed from: w */
    private final fvd f13444w;

    /* JADX INFO: renamed from: x */
    private final oju f13445x;

    /* JADX INFO: renamed from: z */
    private final dja f13447z;

    /* JADX INFO: renamed from: e */
    private static final nbh f13402e = nbh.m17259h("com/google/android/apps/camera/hdrplus/HdrPlusSessionImpl");

    /* JADX INFO: renamed from: b */
    public static final kbc f13400b = kbc.m13903h(1920, 1080);

    /* JADX INFO: renamed from: c */
    public static final kbc f13401c = kbc.m13903h(1920, 1440);

    /* JADX INFO: renamed from: y */
    private String f13446y = null;

    /* JADX INFO: renamed from: f */
    private final String f13427f = GcamModuleJNI.kRequestCameraSecondaryTele_get();

    /* JADX INFO: renamed from: g */
    private final String f13428g = GcamModuleJNI.kRequestCameraSecondaryWide_get();

    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, jwn] */
    public ect(DisplayMetrics displayMetrics, ebv ebvVar, bko bkoVar, nta ntaVar, nsz nszVar, kmd kmdVar, drj drjVar, gdz gdzVar, Gcam gcam, nsx nsxVar, eet eetVar, oju ojuVar, dhv dhvVar, oju ojuVar2, jvb jvbVar, fvd fvdVar, edk edkVar, oju ojuVar3, ihk ihkVar, dja djaVar, dsx dsxVar, ebw ebwVar, ebq ebqVar, eby ebyVar, eco ecoVar, jwn jwnVar, kbz kbzVar, fuz fuzVar, bko bkoVar2, eci eciVar, Executor executor, gtl gtlVar, gpw gpwVar, kpb kpbVar, cwd cwdVar, inm inmVar, jwn jwnVar2, kme kmeVar, gcx gcxVar, eba ebaVar, jwn jwnVar3, hnw hnwVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f13437p = displayMetrics;
        this.f13432k = ebvVar;
        this.f13424V = bkoVar;
        this.f13438q = ntaVar;
        this.f13439r = nszVar;
        this.f13440s = kmdVar;
        this.f13430i = gcam;
        this.f13431j = nsxVar;
        this.f13435n = drjVar.f12397c;
        this.f13433l = dhvVar;
        this.f13434m = ojuVar2;
        this.f13443v = jvbVar;
        this.f13444w = fvdVar;
        this.f13436o = edkVar;
        this.f13445x = ojuVar3;
        this.f13422T = ihkVar;
        this.f13447z = djaVar;
        this.f13421S = dsxVar;
        this.f13403A = ebwVar;
        this.f13404B = ebqVar;
        this.f13407E = jwnVar;
        this.f13405C = ebyVar;
        this.f13406D = ecoVar;
        this.f13408F = fuzVar;
        this.f13423U = bkoVar2;
        this.f13409G = eciVar;
        this.f13410H = executor;
        this.f13411I = gtlVar;
        this.f13413K = gpwVar;
        this.f13414L = kpbVar;
        this.f13415M = inmVar;
        this.f13416N = jwnVar2;
        this.f13417O = kmeVar;
        this.f13412J = eetVar;
        this.f13441t = gdzVar.f24348b;
        this.f13442u = ojuVar;
        this.f13426d = kbzVar;
        this.f13425W = cwdVar;
        this.f13418P = gcxVar;
        this.f13419Q = ebaVar;
        this.f13420R = hnwVar;
        gcam.m4974d(eetVar.mo6051a());
        mwt mwtVar = new mwt();
        for (int i = 0; i < GcamModuleJNI.Gcam_GetNumCameras(gcam.f8271a, gcam); i++) {
            Integer numValueOf = Integer.valueOf(i);
            Tuning tuningM4973c = gcam.m4973c(i);
            mwt mwtVar2 = mwtVar;
            long jTuning_physical_stability_params_get = GcamModuleJNI.Tuning_physical_stability_params_get(tuningM4973c.f8376a, tuningM4973c);
            PhysicalStabilityParams physicalStabilityParams = jTuning_physical_stability_params_get == 0 ? null : new PhysicalStabilityParams(jTuning_physical_stability_params_get);
            Tuning tuningM4973c2 = gcam.m4973c(i);
            long jTuning_post_shutter_af_params_get = GcamModuleJNI.Tuning_post_shutter_af_params_get(tuningM4973c2.f8376a, tuningM4973c2);
            mwtVar = mwtVar2;
            mwtVar.mo17110e(numValueOf, new ecs(physicalStabilityParams, jTuning_post_shutter_af_params_get == 0 ? null : new PostShutterAfParams(jTuning_post_shutter_af_params_get)));
        }
        this.f13429h = mwtVar.mo17059b();
        if (dhvVar.mo6184l(did.f11424ac) && !edkVar.equals(edk.LONG_EXPOSURE)) {
            jvbVar.m13537d(ebyVar.f13316b.mo3830a(new ecr(gcam, eetVar, 0), executor));
        }
        if (ebvVar.f13306h) {
            jvbVar.m13537d(jwnVar3.mo3830a(new ecr(gcam, eetVar, 2), executor));
        }
    }

    /* JADX INFO: renamed from: I */
    private final int m7160I(kpp kppVar, kmg kmgVar) {
        Rect rect = (Rect) nta.m17665h(kppVar, this.f13438q.m17682f(kppVar, kmgVar).mo14556i().f36540a).mo9517d(CaptureResult.SCALER_CROP_REGION);
        rect.getClass();
        lku.m15607B(!rect.isEmpty(), "Invalid scaler crop region: %s", rect);
        return rect.width() * rect.height();
    }

    /* JADX INFO: renamed from: J */
    private final AeShotParams m7161J(float f, boolean z) {
        AeShotParams aeShotParams = new AeShotParams();
        aeShotParams.m4889f(f);
        aeShotParams.m4893j(this.f13441t.f35517a);
        aeShotParams.m4892i(this.f13441t.f35518b);
        edk edkVar = edk.REGULAR;
        gcy gcyVar = gcy.AUTO;
        switch (this.f13436o) {
            case REGULAR:
                aeShotParams.m4894k(nsf.f44381a);
                break;
            case PORTRAIT:
                aeShotParams.m4894k(nsf.f44382b);
                break;
            case LONG_EXPOSURE:
                aeShotParams.m4894k(nsf.f44383c);
                break;
            case MOTION_BLUR:
                aeShotParams.m4894k(nsf.f44384d);
                break;
        }
        GcamModuleJNI.AeShotParams_auto_night_sight_set(aeShotParams.f8226a, aeShotParams, (z ? nrc.f44150b : nrc.f44149a).f44151c);
        GcamModuleJNI.AeShotParams_spoofed_touch_rectangle_set(aeShotParams.f8226a, aeShotParams, this.f13408F.m8821c());
        return aeShotParams;
    }

    /* JADX INFO: renamed from: K */
    private final ShotParams m7162K(float f, int i, gcy gcyVar, int i2, boolean z, boolean z2, boolean z3, mrm mrmVar, boolean z4, boolean z5, boolean z6, int i3, long j, egm egmVar) {
        nrk nrkVar;
        boolean zMo6184l;
        this.f13426d.mo13961e("new");
        ShotParams shotParams = new ShotParams(GcamModuleJNI.new_ShotParams__SWIG_0());
        this.f13426d.mo13963g("setup");
        GcamModuleJNI.ShotParams_zsl_set(shotParams.f8358a, shotParams, z);
        GcamModuleJNI.ShotParams_save_merged_dng_set(shotParams.f8358a, shotParams, z2);
        GcamModuleJNI.ShotParams_compress_merged_dng_set(shotParams.f8358a, shotParams, true);
        GcamModuleJNI.ShotParams_allow_base_frame_reuse_set(shotParams.f8358a, shotParams, z3);
        GcamModuleJNI.ShotParams_image_rotation_set(shotParams.f8358a, shotParams, ntw.m17722h(i).f44260j);
        if (((Integer) this.f13440s.mo14560m(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE, 0)).intValue() == 1 && mrmVar.mo16813g() && ((hkz) mrmVar.mo16809c()).m10428c() > 0 && ((hkz) mrmVar.mo16809c()).m10429d() > 0) {
            GcamModuleJNI.ShotParams_shutter_press_down_timestamp_ns_set(shotParams.f8358a, shotParams, ((hkz) mrmVar.mo16809c()).m10428c());
            GcamModuleJNI.ShotParams_shutter_press_up_timestamp_ns_set(shotParams.f8358a, shotParams, ((hkz) mrmVar.mo16809c()).m10429d());
        }
        if (j > 0) {
            GcamModuleJNI.ShotParams_metering_frame_timestamp_ns_set(shotParams.f8358a, shotParams, j);
        }
        this.f13426d.mo13963g("createAeShotParams");
        AeShotParams aeShotParamsM7161J = m7161J(f, z4);
        GcamModuleJNI.ShotParams_ae_set(shotParams.f8358a, shotParams, aeShotParamsM7161J.f8226a, aeShotParamsM7161J);
        this.f13426d.mo13963g("portraitRelighting");
        shotParams.m5110a().m4891h(this.f13413K.mo9613e(this.f13436o.equals(edk.PORTRAIT)));
        this.f13426d.mo13963g("profile");
        dhv dhvVar = this.f13433l;
        dhx dhxVar = did.f11416a;
        dhvVar.mo6176d();
        this.f13433l.mo6175c();
        this.f13426d.mo13963g("flash");
        gcy gcyVar2 = gcy.AUTO;
        switch (gcyVar) {
            case AUTO:
                nrkVar = nrk.f44226a;
                break;
            case OFF:
            default:
                nrkVar = nrk.f44228c;
                break;
            case ON:
                nrkVar = nrk.f44227b;
                break;
        }
        GcamModuleJNI.ShotParams_flash_mode_set(shotParams.f8358a, shotParams, nrkVar.f44230d);
        boolean z7 = this.f13436o.equals(edk.LONG_EXPOSURE) || z4;
        this.f13426d.mo13963g("wbSource");
        int i4 = new int[]{1, 2, 3}[((Integer) this.f13433l.mo6173a(did.f11448b).orElse(2)).intValue()];
        int i5 = i4 - 1;
        if (i4 == 0) {
            throw null;
        }
        switch (i5) {
            case 0:
                shotParams.m5113d(z7 && !z6);
                break;
            case 1:
                shotParams.m5113d(true);
                break;
            case 2:
                shotParams.m5113d(false);
                break;
        }
        StaticMetadata staticMetadataM4972b = this.f13430i.m4972b(i2);
        nse nseVarM5121d = staticMetadataM4972b.m5121d();
        if (m7166O(hnv.HEAT_MODERATE, egmVar) && nseVarM5121d == nse.f44365d) {
            shotParams.m5114e(nsc.f44356b);
        } else if (this.f13433l.mo6184l(did.f11404O)) {
            shotParams.m5114e(nsc.f44357c);
        }
        this.f13433l.mo6173a(did.f11467u).ifPresent(new dco(shotParams, 6));
        this.f13426d.mo13963g("sabre");
        float fFloatValue = ((Float) this.f13407E.mo3831be()).floatValue();
        this.f13433l.mo6175c();
        boolean zMo6184l2 = this.f13433l.mo6184l(did.f11407R);
        boolean z8 = zMo6184l2 && ((float) (staticMetadataM4972b.m5120c().m5066d() * staticMetadataM4972b.m5120c().m5065c())) / ((float) i3) >= 2.25f;
        boolean z9 = this.f13433l.mo6184l(did.f11406Q) && !this.f13436o.equals(edk.PORTRAIT) && (fFloatValue >= 1.2f || (nseVarM5121d == nse.f44366e && this.f13433l.mo6184l(did.f11409T))) && !zMo6184l2;
        this.f13433l.mo6175c();
        if (this.f13433l.mo6184l(did.f11408S)) {
            GcamModuleJNI.ShotParams_merge_method_override_set(shotParams.f8358a, shotParams, nru.f44291a.f44293b);
        }
        GcamModuleJNI.ShotParams_allow_sabre_set(shotParams.f8358a, shotParams, z9);
        GcamModuleJNI.ShotParams_allow_spatial_rgb_set(shotParams.f8358a, shotParams, z8);
        this.f13426d.mo13963g("shasta");
        if (this.f13436o.equals(edk.REGULAR)) {
            zMo6184l = this.f13433l.mo6184l(did.f11401L);
        } else if (z7) {
            zMo6184l = this.f13433l.mo6184l(did.f11400K);
        } else {
            zMo6184l = this.f13436o.equals(edk.PORTRAIT) ? this.f13433l.mo6184l(dio.f11649F) : false;
        }
        shotParams.m5115f(zMo6184l);
        this.f13433l.mo6180h(did.f11402M).ifPresent(new dco(shotParams, 7));
        this.f13433l.mo6177e();
        GcamModuleJNI.ShotParams_shasta_force_set(shotParams.f8358a, shotParams, false);
        if (z7) {
            this.f13426d.mo13963g("nightSight");
            GcamModuleJNI.ShotParams_motion_ef_enabled_set(shotParams.f8358a, shotParams, true);
            if (this.f13432k.f13304f && this.f13405C.m7100k()) {
                Integer num = (Integer) this.f13440s.mo14559l(CameraCharacteristics.LENS_FACING);
                num.getClass();
                if (num.intValue() == 1) {
                    GcamModuleJNI.ShotParams_device_is_on_tripod_set(shotParams.f8358a, shotParams, true);
                    if (z5) {
                        GcamModuleJNI.ShotParams_downsample_by_2_before_merge_set(shotParams.f8358a, shotParams, true);
                        kbc kbcVar = kan.f35487b.m13883m(kan.m13873j(this.f13441t)) ? f13400b : f13401c;
                        shotParams.m5110a().m4893j(kbcVar.f35517a);
                        shotParams.m5110a().m4892i(kbcVar.f35518b);
                    }
                    shotParams.m5115f(false);
                }
            }
            ebv ebvVar = this.f13432k;
            if (ebvVar.f13299a.mo6173a(did.f11449c).isPresent() && ((Integer) ebvVar.f13299a.mo6173a(did.f11449c).get()).intValue() > 0) {
                this.f13426d.mo13963g("psaf");
                GcamModuleJNI.ShotParams_psaf_frame_count_set(shotParams.f8358a, shotParams, ((Integer) this.f13433l.mo6173a(did.f11449c).orElse(0)).intValue());
                this.f13433l.mo6180h(did.f11394E).ifPresent(new dco(shotParams, 8));
                this.f13433l.mo6180h(did.f11395F).ifPresent(new dco(shotParams, 9));
            }
        }
        if (this.f13433l.mo6184l(dht.f11186n) && m7166O(hnv.HEAT_LIGHT, egmVar)) {
            this.f13433l.mo6177e();
            GcamModuleJNI.ShotParams_gpu_power_boost_set(shotParams.f8358a, shotParams, false);
            this.f13433l.mo6180h(did.f11445ax).ifPresent(new dco(shotParams, 10));
            this.f13433l.mo6180h(did.f11446ay).ifPresent(new dco(shotParams, 11));
            this.f13433l.mo6180h(did.f11447az).ifPresent(new dco(shotParams, 12));
        }
        this.f13426d.mo13963g("finalize");
        GcamModuleJNI.ShotParams_optimize_sky_set(shotParams.f8358a, shotParams, this.f13433l.mo6184l(did.f11390A));
        this.f13433l.mo6176d();
        GcamModuleJNI.ShotParams_nonzsl_extended_base_frame_selection_set(shotParams.f8358a, shotParams, true);
        GcamModuleJNI.ShotParams_rerun_face_detection_set(shotParams.f8358a, shotParams, this.f13433l.mo6184l(did.f11392C));
        GcamModuleJNI.ShotParams_walnut_enabled_set(shotParams.f8358a, shotParams, this.f13433l.mo6184l(did.f11420aD));
        this.f13426d.mo13962f();
        return shotParams;
    }

    /* JADX INFO: renamed from: L */
    private final void m7163L() throws kec {
        if (this.f13443v.mo8995b()) {
            throw new kec("Camera already closed");
        }
    }

    /* JADX INFO: renamed from: M */
    private final boolean m7164M() {
        return this.f13404B.m7074f(this.f13436o);
    }

    /* JADX INFO: renamed from: N */
    private final boolean m7165N() {
        return ((Boolean) this.f13405C.f13316b.mo3831be()).booleanValue();
    }

    /* JADX INFO: renamed from: O */
    private final boolean m7166O(hnv hnvVar, egm egmVar) {
        return egmVar.f13974b.equals(egl.ZOOM) && !this.f13420R.mo10518e().m10520a(hnvVar);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0311  */
    /* JADX WARN: Code duplicated, block: B:107:0x0319  */
    /* JADX WARN: Code duplicated, block: B:108:0x032d  */
    /* JADX WARN: Code duplicated, block: B:111:0x033f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0373  */
    /* JADX WARN: Code duplicated, block: B:116:0x038b  */
    /* JADX WARN: Code duplicated, block: B:119:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:120:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:123:0x041d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0458  */
    /* JADX WARN: Code duplicated, block: B:129:0x0479  */
    /* JADX WARN: Code duplicated, block: B:136:0x0492 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:137:0x0494  */
    /* JADX WARN: Code duplicated, block: B:138:0x049e  */
    /* JADX WARN: Code duplicated, block: B:140:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:148:0x04cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:149:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:152:0x04da  */
    /* JADX WARN: Code duplicated, block: B:156:0x0504  */
    /* JADX WARN: Code duplicated, block: B:159:0x0523  */
    /* JADX WARN: Code duplicated, block: B:162:0x0552  */
    /* JADX WARN: Code duplicated, block: B:165:0x0573  */
    /* JADX WARN: Code duplicated, block: B:168:0x0596  */
    /* JADX WARN: Code duplicated, block: B:170:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:172:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:173:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:176:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:193:0x0627  */
    /* JADX WARN: Code duplicated, block: B:194:0x0629 A[Catch: IOException -> 0x0625, TryCatch #1 {IOException -> 0x0625, blocks: (B:178:0x05d4, B:180:0x05de, B:182:0x05e8, B:184:0x05f2, B:188:0x0602, B:190:0x0607, B:198:0x0661, B:186:0x05fc, B:189:0x0605, B:194:0x0629, B:196:0x0633, B:197:0x0653), top: B:253:0x05d4 }] */
    /* JADX WARN: Code duplicated, block: B:197:0x0653 A[Catch: IOException -> 0x0625, TryCatch #1 {IOException -> 0x0625, blocks: (B:178:0x05d4, B:180:0x05de, B:182:0x05e8, B:184:0x05f2, B:188:0x0602, B:190:0x0607, B:198:0x0661, B:186:0x05fc, B:189:0x0605, B:194:0x0629, B:196:0x0633, B:197:0x0653), top: B:253:0x05d4 }] */
    /* JADX WARN: Code duplicated, block: B:201:0x067a A[Catch: IOException -> 0x068b, TryCatch #2 {IOException -> 0x068b, blocks: (B:199:0x0670, B:201:0x067a, B:203:0x067e), top: B:255:0x0670 }] */
    /* JADX WARN: Code duplicated, block: B:213:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:215:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:218:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:219:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:221:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:222:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:224:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:225:0x06df  */
    /* JADX WARN: Code duplicated, block: B:228:0x0729  */
    /* JADX WARN: Code duplicated, block: B:230:0x0731  */
    /* JADX WARN: Code duplicated, block: B:232:0x073f  */
    /* JADX WARN: Code duplicated, block: B:234:0x0745  */
    /* JADX WARN: Code duplicated, block: B:240:0x077c  */
    /* JADX WARN: Code duplicated, block: B:241:0x077e  */
    /* JADX WARN: Code duplicated, block: B:244:0x078a  */
    /* JADX WARN: Code duplicated, block: B:245:0x078c  */
    /* JADX WARN: Code duplicated, block: B:251:0x0755 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x05d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0100  */
    /* JADX WARN: Code duplicated, block: B:29:0x0102  */
    /* JADX WARN: Code duplicated, block: B:32:0x010f  */
    /* JADX WARN: Code duplicated, block: B:39:0x015c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0163  */
    /* JADX WARN: Code duplicated, block: B:43:0x016d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x016f  */
    /* JADX WARN: Code duplicated, block: B:47:0x018a  */
    /* JADX WARN: Code duplicated, block: B:49:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:57:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:59:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:60:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:62:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:63:0x0204  */
    /* JADX WARN: Code duplicated, block: B:64:0x020f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0213  */
    /* JADX WARN: Code duplicated, block: B:68:0x0228  */
    /* JADX WARN: Code duplicated, block: B:70:0x022f  */
    /* JADX WARN: Code duplicated, block: B:93:0x02db A[PHI: r0
      0x02db: PHI (r0v68 kbc) = (r0v8 kbc), (r0v8 kbc), (r0v8 kbc), (r0v8 kbc), (r0v8 kbc), (r0v8 kbc), (r0v8 kbc), (r0v8 kbc), (r0v8 kbc), (r0v70 kbc) binds: [B:77:0x023c, B:78:0x023e, B:80:0x0248, B:65:0x0211, B:67:0x0226, B:63:0x0204, B:62:0x01f9, B:59:0x01ea, B:54:0x01dc, B:55:0x01de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x02f6  */
    /* JADX WARN: Type inference failed for: r1v5, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v74, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v12, types: [gyh, java.lang.Object] */
    /* JADX INFO: renamed from: P */
    private final eem m7167P(kmg kmgVar, gyu gyuVar, glk glkVar, PostviewParams postviewParams, gcy gcyVar, kpp kppVar, boolean z, int i, int i2, boolean z2, int i3, boolean z3, mrm mrmVar, egm egmVar) {
        boolean z4;
        AwbInfo awbInfoM17666i;
        boolean z5;
        kbc kbcVar;
        nse nseVarM5121d;
        boolean z6;
        kbc kbcVar2;
        egm egmVar2;
        RectF rectF;
        int iM17712U;
        int i4;
        final eem eemVar;
        ShotCallbacks shotCallbacks;
        boolean zMo16813g;
        final byte[] bArr;
        InterleavedU8ClientAllocator interleavedU8ClientAllocator;
        nsq nsqVar;
        final int i5;
        InterleavedU8ClientAllocator interleavedU8ClientAllocator2;
        nsq nsqVar2;
        final int i6;
        glk glkVar2;
        DebugParams debugParams;
        nrx nrxVar;
        int iGcam_StartShotCapture;
        ebw ebwVar;
        oyo oyoVar;
        boolean z7;
        boolean z8;
        mrm mrmVarM8495b;
        ?? r9;
        long jCurrentTimeMillis;
        String strM7072c;
        DebugParams debugParams2;
        IOException e;
        ?? r4;
        AeShotParams aeShotParamsM5110a;
        NormalizedRect normalizedRectM4885b;
        edk edkVar;
        Optional optionalMo6180h;
        kpb kpbVar;
        String str;
        eeo eeoVarM2623q = this.f13423U.m2623q(gyuVar);
        float fM17678a = this.f13438q.m17678a(((Integer) ((jwf) this.f13435n).f34942d).intValue());
        int iM3564b = cem.m3564b(((fua) glkVar.f25503d).f23573a, this.f13415M, this.f13440s, this.f13416N, this.f13433l);
        ?? r1 = glkVar.f25502c;
        mrm mrmVarMo9908n = r1 != 0 ? r1.mo9908n() : mqu.f41450a;
        boolean zMo16813g2 = eeoVarM2623q.m7230c().mo16813g();
        boolean zM7165N = m7165N();
        this.f13426d.mo13961e("shotParams");
        this.f13426d.mo13961e("create");
        int iMo7135b = mo7135b(mo7145l(kppVar, kmgVar));
        Long l = (Long) kppVar.mo9517d(CaptureResult.SENSOR_TIMESTAMP);
        ShotParams shotParamsM7162K = m7162K(fM17678a, iM3564b, gcyVar, iMo7135b, z, zMo16813g2, z3, mrmVarMo9908n, zM7165N, z2, mrmVar.mo16813g(), m7160I(kppVar, kmgVar), l != null ? l.longValue() : -1L, egmVar);
        this.f13426d.mo13963g("setWb");
        GcamModuleJNI.ShotParams_wb_mode_set(shotParamsM7162K.f8358a, shotParamsM7162K, (this.f13444w.mo3831be() == fvc.AUTO ? nsg.f44388a : nsg.f44389b).f44391c);
        this.f13426d.mo13963g("setSuffix");
        String strConcat = true != z ? "n" : "z";
        edk edkVar2 = edk.REGULAR;
        gcy gcyVar2 = gcy.AUTO;
        switch (this.f13436o) {
            case REGULAR:
                str = "d";
                break;
            case PORTRAIT:
                str = "p";
                break;
            case LONG_EXPOSURE:
                str = "l";
                break;
            case MOTION_BLUR:
                str = "m";
                break;
            default:
                GcamModuleJNI.ShotParams_software_suffix_set(shotParamsM7162K.f8358a, shotParamsM7162K, strConcat);
                this.f13426d.mo13963g("setBfIndex");
                if (i2 >= -1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                lku.m15670x(z4, "Incorrect base frame override.");
                GcamModuleJNI.ShotParams_base_frame_override_index_set(shotParamsM7162K.f8358a, shotParamsM7162K, i2);
                if (z) {
                    lku.m15670x(true, "Incorrect base frame hint.");
                    GcamModuleJNI.ShotParams_zsl_base_frame_index_hint_set(shotParamsM7162K.f8358a, shotParamsM7162K, i);
                }
                this.f13426d.mo13963g("AwbInfo");
                awbInfoM17666i = nta.m17666i(kppVar, this.f13438q.m17682f(kppVar, kmgVar));
                this.f13426d.mo13963g("wb");
                int iIntValue = ((Integer) this.f13433l.mo6173a(did.f11448b).orElse(2)).intValue();
                if (!z || GcamModuleJNI.ShotParams_GcamAwbDesired(shotParamsM7162K.f8358a, shotParamsM7162K) || iIntValue == 2) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (mrmVar.mo16813g()) {
                    shotParamsM7162K.m5112c((AwbInfo) mrmVar.mo16809c());
                } else if (z5) {
                    shotParamsM7162K.m5112c(awbInfoM17666i);
                }
                kbcVar = this.f13441t;
                StaticMetadata staticMetadataM4972b = this.f13430i.m4972b(iMo7135b);
                nseVarM5121d = staticMetadataM4972b.m5121d();
                if (this.f13436o.equals(edk.PORTRAIT)) {
                    this.f13426d.mo13963g("updateAndGetPhotoSize");
                    shotParamsM7162K.m5114e(nsc.f44355a);
                    shotParamsM7162K.m5110a().m4893j(0);
                    shotParamsM7162K.m5110a().m4892i(0);
                    if (nseVarM5121d == nse.f44363b) {
                        optionalMo6180h = this.f13433l.mo6180h(dio.f11664f);
                        if (optionalMo6180h.isPresent() || !((Float) optionalMo6180h.get()).equals(Float.valueOf(1.5172f))) {
                            kpbVar = this.f13414L;
                            if (kpbVar.f36781n) {
                                shotParamsM7162K.m5110a().m4890g(gpt.f26024d);
                            } else if (kpbVar.f36782o) {
                                shotParamsM7162K.m5110a().m4890g(gpt.f26025e);
                            } else {
                                shotParamsM7162K.m5110a().m4890g(gpt.f26021a);
                            }
                        } else {
                            shotParamsM7162K.m5110a().m4890g(gpt.f26022b);
                            if (kan.f35487b.m13883m(kan.m13873j(kbcVar))) {
                                kbcVar = gpt.f26026f;
                            }
                        }
                    } else if (nseVarM5121d == nse.f44373l) {
                        shotParamsM7162K.m5110a().m4890g(gpt.f26023c);
                        if (kan.f35487b.m13883m(kan.m13873j(kbcVar))) {
                            kbcVar2 = gpt.f26027g;
                        }
                    }
                    kbcVar2 = kbcVar;
                } else {
                    z6 = nseVarM5121d == nse.f44366e || nseVarM5121d == nse.f44368g;
                    if (!z2 && z6 && this.f13436o.equals(edk.REGULAR)) {
                        Rect rectM13879e = kan.m13873j(kbcVar).m13879e(new kbc(GcamModuleJNI.StaticMetadata_pixel_array_width_get(staticMetadataM4972b.f8364a, staticMetadataM4972b), GcamModuleJNI.StaticMetadata_pixel_array_height_get(staticMetadataM4972b.f8364a, staticMetadataM4972b)));
                        kbc kbcVar3 = new kbc(rectM13879e.width(), rectM13879e.height());
                        float fFloatValue = ((Float) this.f13407E.mo3831be()).floatValue();
                        Optional optionalMo6180h2 = this.f13433l.mo6180h(dht.f11170C);
                        if (!this.f13433l.mo6184l(dht.f11186n) || !optionalMo6180h2.isPresent() || ((Float) optionalMo6180h2.get()).floatValue() <= 0.0f || fFloatValue >= ((Float) optionalMo6180h2.get()).floatValue()) {
                            shotParamsM7162K.m5110a().m4893j(kbcVar3.f35517a);
                            shotParamsM7162K.m5110a().m4892i(kbcVar3.f35518b);
                        } else {
                            shotParamsM7162K.m5110a().m4893j(kbcVar3.f35517a / 2);
                            shotParamsM7162K.m5110a().m4892i(kbcVar3.f35518b / 2);
                        }
                        kbcVar2 = kbcVar3;
                    } else {
                        kbcVar2 = kbcVar;
                    }
                }
                this.f13426d.mo13963g("updateAe");
                this.f13438q.m17688u(kmgVar, shotParamsM7162K.m5110a(), kppVar, this.f13432k.f13305g, kbcVar2);
                if (z2) {
                    edkVar = this.f13436o;
                    if (edkVar != edk.PORTRAIT || (edkVar == edk.REGULAR && this.f13433l.mo6184l(dht.f11176d))) {
                        egmVar2 = egmVar;
                        if (egmVar2.f13974b != egl.ZOOM) {
                            this.f13426d.mo13963g("disableCrop");
                            shotParamsM7162K.m5110a().m4888e(new NormalizedRect());
                        }
                    } else {
                        egmVar2 = egmVar;
                    }
                } else {
                    egmVar2 = egmVar;
                }
                rectF = (RectF) ((fua) glkVar.f25503d).f23582j.mo16812f();
                if (rectF != null) {
                    this.f13426d.mo13963g("overrideMergedCrop");
                    AeShotParams aeShotParamsM5110a2 = shotParamsM7162K.m5110a();
                    NormalizedRect normalizedRect = new NormalizedRect();
                    normalizedRect.m5052c(rectF.left);
                    normalizedRect.m5054e(rectF.top);
                    normalizedRect.m5053d(rectF.right);
                    normalizedRect.m5055f(rectF.bottom);
                    aeShotParamsM5110a2.m4888e(normalizedRect);
                    aeShotParamsM5110a2.m4890g(normalizedRect);
                }
                if (this.f13436o.equals(edk.PORTRAIT)) {
                    this.f13426d.mo13963g(WIxTIdUIdfb.aQRq);
                    aeShotParamsM5110a = shotParamsM7162K.m5110a();
                    normalizedRectM4885b = aeShotParamsM5110a.m4885b();
                    if (!GcamModuleJNI.NormalizedRect_IsEmpty(normalizedRectM4885b.f8322a, normalizedRectM4885b)) {
                        NormalizedRect normalizedRectM4885b2 = aeShotParamsM5110a.m4885b();
                        NormalizedRect normalizedRectM4884a = aeShotParamsM5110a.m4884a();
                        aeShotParamsM5110a.m4890g(new NormalizedRect(GcamModuleJNI.Union(NormalizedRect.m5050a(normalizedRectM4885b2), normalizedRectM4885b2, NormalizedRect.m5050a(normalizedRectM4884a), normalizedRectM4884a), true));
                    }
                }
                this.f13426d.mo13962f();
                this.f13426d.mo13963g("createShot");
                iM17712U = ntw.m17712U(((InitParams) this.f13424V.f3652a).m4995a().f44219f);
                if (iM17712U == 0) {
                    i4 = 1;
                } else {
                    i4 = iM17712U;
                }
                eemVar = new eem(this.f13431j, eeoVarM2623q, this.f13437p, glkVar, i4, this.f13422T, this.f13447z, this.f13421S, shotParamsM7162K, this.f13436o, zM7165N, kppVar, egmVar, kmgVar, this.f13420R.mo10518e(), null, null, null, null);
                this.f13426d.mo13963g("createShotCallbacks");
                shotCallbacks = new ShotCallbacks();
                if (eemVar.f13665l.m7236i().mo16813g()) {
                    ((NativeHdrPlusInterface) eemVar.f13659f).nativeSetProgressCallback(shotCallbacks.f8354a, new IntFloatConsumer() { // from class: eeh
                        @Override // com.google.googlex.gcam.base.function.IntFloatConsumer
                        public final void accept(int i7, float f) {
                            eem eemVar2 = eemVar;
                            lku.m15613H(eemVar2.f13665l.m7236i().mo16813g());
                            ((edf) eemVar2.f13665l.m7236i().mo16809c()).mo7051a(f);
                        }
                    });
                }
                mav mavVar = eemVar.f13674u;
                final eel eelVar = eemVar.f13673t;
                Object obj = mavVar.f39742a;
                long j = shotCallbacks.f8354a;
                eelVar.getClass();
                ((NativeHdrPlusInterface) obj).nativeSetShotStatusCallbacks(j, new IntByteArrayConsumer() { // from class: nte
                    @Override // com.google.googlex.gcam.base.function.IntByteArrayConsumer
                    public final void accept(int i7, byte[] bArr2) {
                        ntu ntuVar;
                        int i8;
                        eel eelVar2 = eelVar;
                        nbh nbhVar = eem.f13654a;
                        lku.m15613H(eelVar2.f13650c.f13672s == 1);
                        eelVar2.f13650c.f13672s = 2;
                        try {
                            nxq nxqVarM18123Q = nxq.m18123Q(ntu.f44557E, bArr2, 0, bArr2.length, nxf.m18011a());
                            nxq.m18132ae(nxqVarM18123Q);
                            ntuVar = (ntu) nxqVarM18123Q;
                        } catch (nyb e2) {
                            ((nbe) ((nbe) ((nbe) eem.f13654a.m17252c()).mo17283h(e2)).mo17276G((char) 1331)).mo17290o("Error deserializing shot log data");
                            ntuVar = ntu.f44557E;
                        }
                        ebp ebpVar = new ebp(ntuVar, eelVar2.f13651d);
                        eeo eeoVar = eelVar2.f13648a;
                        if ((eeoVar.m7241n().mo16813g() || eeoVar.m7238k().mo16813g() || eeoVar.m7239l().mo16813g()) && (i8 = eelVar2.f13651d) != 2) {
                            int iM17712U2 = ntw.m17712U(ntuVar.f44577n);
                            if ((iM17712U2 != 0 ? iM17712U2 : 2) != i8) {
                                nbw nbwVarM17251b = eem.f13654a.m17251b();
                                String str2 = i8 == 3 ? PMZiHihxLGEy.OKlNUt : "Gxp";
                                ((nbe) ((nbe) nbwVarM17251b).mo17276G((char) 1329)).mo17293r("%s failed", str2);
                                if (eelVar2.f13649b != dja.RELEASE && !eem.f13655b.getAndSet(true)) {
                                    eelVar2.f13652e.m6691f(str2.concat(" failed! Please immediately take and file a bug report."));
                                }
                            }
                        }
                        for (int i9 = 0; i9 < ntuVar.f44567d.size(); i9++) {
                            if (ntuVar.f44567d.mo18032d(i9) == 1.0f) {
                                ((nbe) ((nbe) eem.f13654a.m17251b()).mo17276G((char) 1330)).mo17290o("Black frame detected");
                                if (eelVar2.f13649b == dja.RELEASE) {
                                    break;
                                }
                                eelVar2.f13652e.m6691f(VzWFSVj.ERTQKBpF);
                                break;
                            }
                        }
                        hkc hkcVarM11345m = eelVar2.f13653f.m11345m();
                        if (eelVar2.f13648a.m7240m().mo16813g()) {
                            ((edi) eelVar2.f13648a.m7240m().mo16809c()).mo7057b(eelVar2.f13650c, hkcVarM11345m, ebpVar);
                        }
                    }
                }, new IntStringConsumer() { // from class: ntf
                    @Override // com.google.googlex.gcam.base.function.IntStringConsumer
                    public final void accept(int i7, String str2) {
                        eel eelVar2 = eelVar;
                        ((nbe) ((nbe) eem.f13654a.m17251b()).mo17276G(1332)).mo17296u("HDR+ pipeline reported error for shotId %d: %s", i7, str2);
                        lku.m15613H(eelVar2.f13650c.f13672s == 1);
                        eelVar2.f13650c.f13672s = 3;
                        if (eelVar2.f13648a.m7240m().mo16813g()) {
                            ((edi) eelVar2.f13648a.m7240m().mo16809c()).mo7058c(eelVar2.f13650c, new edc(str2));
                        }
                    }
                }, new IntConsumer() { // from class: ntg
                    @Override // com.google.googlex.gcam.base.function.IntConsumer
                    public final void accept(int i7) {
                        eel eelVar2 = eelVar;
                        nbh nbhVar = eem.f13654a;
                        lku.m15613H(eelVar2.f13650c.f13672s == 1);
                        eelVar2.f13650c.f13672s = 4;
                        if (eelVar2.f13648a.m7240m().mo16813g()) {
                            ((edi) eelVar2.f13648a.m7240m().mo16809c()).mo7059p(eelVar2.f13650c);
                        }
                    }
                });
                zMo16813g = eemVar.f13665l.m7228a().mo16813g();
                bArr = null;
                if (zMo16813g) {
                    mav mavVar2 = eemVar.f13674u;
                    final AmbientMode.AmbientController ambientController = new AmbientMode.AmbientController(eemVar);
                    ((NativeHdrPlusInterface) mavVar2.f39742a).nativeSetBaseFrameAeCallback(shotCallbacks.f8354a, new BaseFrameAeCallback(bArr, bArr, bArr) { // from class: ntd
                        @Override // com.google.googlex.gcam.hdrplus.BaseFrameAeCallback
                        public final void accept(int i7, long j2) {
                            AmbientMode.AmbientController ambientController2 = this.f44470a;
                            AeResults aeResults = new AeResults(j2, true);
                            eem eemVar2 = (eem) ambientController2.f1697a;
                            lku.m15613H(eemVar2.f13672s == 1);
                            ((ecx) eemVar2.f13665l.m7228a().mo16809c()).mo7171j(eemVar2, aeResults);
                        }
                    });
                }
                if (eemVar.f13665l.m7229b().mo16813g()) {
                    ((NativeHdrPlusInterface) eemVar.f13659f).nativeSetBaseFrameCallback(shotCallbacks.f8354a, new BaseFrameCallback() { // from class: eej
                        @Override // com.google.googlex.gcam.hdrplus.BaseFrameCallback
                        public final void onBaseFrameSelected(int i7, int i8, long j2) {
                            eem eemVar2 = eemVar;
                            lku.m15613H(eemVar2.f13672s == 1);
                            int size = eemVar2.f13658e.size();
                            lku.m15608C(i8 < size, "Base frame index %s >= payload timestamps size %s", i8, eemVar2.f13658e.size());
                            int size2 = eemVar2.f13657d.size();
                            lku.m15608C(i8 < size2, "Base frame index %s >= payload metadata size %s", i8, eemVar2.f13657d.size());
                            lku.m15614I(((Long) eemVar2.f13658e.get(i8)).longValue() == j2, "Base frame timestamps don't match");
                            ((ecy) eemVar2.f13665l.m7229b().mo16809c()).mo7052a(eemVar2, i8, j2, (kpp) eemVar2.f13657d.get(i8));
                        }
                    });
                }
                interleavedU8ClientAllocator = eemVar.f13660g;
                if (interleavedU8ClientAllocator == null || eemVar.f13661h != null) {
                    if (interleavedU8ClientAllocator != null) {
                        ((NativeHdrPlusInterface) eemVar.f13659f).nativeSetPostviewRgbAllocator(shotCallbacks.f8354a, interleavedU8ClientAllocator);
                    } else {
                        nsqVar = eemVar.f13661h;
                        if (nsqVar != null) {
                            ((NativeHdrPlusInterface) eemVar.f13659f).nativeSetPostviewYuvAllocator(shotCallbacks.f8354a, nsqVar);
                        }
                    }
                    i5 = 1;
                    ((NativeHdrPlusInterface) eemVar.f13674u.f39742a).nativeSetPostviewCallback(shotCallbacks.f8354a, mav.m16284g(new ntj() { // from class: eek
                        @Override // p000.ntj
                        /* JADX INFO: renamed from: a */
                        public final void mo7216a(int i7, long j2, ShotMetadata shotMetadata, nrx nrxVar2) {
                            boolean z9 = false;
                            switch (i5) {
                                case 0:
                                    eem eemVar2 = eemVar;
                                    ntw.m17723i(shotMetadata, eem.m7217d(eemVar2.f13671r));
                                    lku.m15613H(eemVar2.f13672s == 1);
                                    boolean z10 = nrxVar2 == nrx.f44311d || nrxVar2 == nrx.f44313f;
                                    boolean z11 = nrxVar2 == nrx.f44309b || nrxVar2 == nrx.f44310c;
                                    boolean z12 = z10 || z11;
                                    lku.m15670x(z12, "Final image callback only supports PixelFormat.{kRgb, kRgba, kNv12, or kNv21}");
                                    if (z10) {
                                        if (eemVar2.f13665l.m7238k().mo16813g() || eemVar2.f13665l.m7239l().mo16813g()) {
                                            z9 = true;
                                        }
                                        lku.m15614I(z9, "Got RGB image with no downstream callback present.");
                                    }
                                    if (z11) {
                                        lku.m15614I(eemVar2.f13665l.m7241n().mo16813g(), "Got YUV image with no downstream callback present.");
                                    }
                                    if (!z10) {
                                        if (z11) {
                                            ((edj) eemVar2.f13665l.m7241n().mo16809c()).mo7054a(eemVar2, eemVar2.f13663j.m17647a(), shotMetadata);
                                        }
                                    } else if (eemVar2.f13665l.m7238k().mo16813g()) {
                                        nso nsoVar = (nso) eemVar2.f13662i;
                                        edh edhVar = (edh) eemVar2.f13665l.m7238k().mo16809c();
                                        lku.m15614I(nsoVar.f44422b, "doneWriting() must be called before getImage.");
                                        edhVar.mo7055a(eemVar2, nsoVar.f44421a, shotMetadata);
                                    } else if (eemVar2.f13665l.m7239l().mo16813g()) {
                                        ((edb) eemVar2.f13665l.m7239l().mo16809c()).mo7172a(((nsm) eemVar2.f13662i).m17646a(), shotMetadata);
                                    }
                                    break;
                                default:
                                    eem eemVar3 = eemVar;
                                    ntw.m17723i(shotMetadata, eem.m7217d(eemVar3.f13671r));
                                    lku.m15613H(eemVar3.f13672s == 1);
                                    lku.m15669w(i7 != GcamModuleJNI.kInvalidShotId_get());
                                    lku.m15669w(j2 != GcamModuleJNI.kInvalidAllocationId_get());
                                    if (eemVar3.f13665l.m7234g().mo16813g()) {
                                        nsl nslVar = (nsl) eemVar3.f13660g;
                                        if (nslVar.f44411a != null && nslVar.f44412b == null) {
                                            z9 = true;
                                        }
                                        lku.m15614I(z9, "doneWriting() must be called before getImage.");
                                        ((ecz) eemVar3.f13665l.m7234g().mo16809c()).mo7053o(eemVar3, nslVar.f44411a, shotMetadata);
                                    } else if (eemVar3.f13665l.m7233f().mo16813g()) {
                                        ((edb) eemVar3.f13665l.m7233f().mo16809c()).mo7172a(((nsm) eemVar3.f13660g).m17646a(), shotMetadata);
                                    } else if (eemVar3.f13665l.m7235h().mo16813g()) {
                                        ((edj) eemVar3.f13665l.m7235h().mo16809c()).mo7054a(eemVar3, eemVar3.f13661h.m17647a(), shotMetadata);
                                    }
                                    break;
                            }
                        }
                    }));
                } else {
                    i5 = 1;
                }
                interleavedU8ClientAllocator2 = eemVar.f13662i;
                if (interleavedU8ClientAllocator2 == null || eemVar.f13663j != null) {
                    if (interleavedU8ClientAllocator2 != null) {
                        ((NativeHdrPlusInterface) eemVar.f13659f).nativeSetFinalImageRgbAllocator(shotCallbacks.f8354a, interleavedU8ClientAllocator2);
                    }
                    nsqVar2 = eemVar.f13663j;
                    if (nsqVar2 != null) {
                        ((NativeHdrPlusInterface) eemVar.f13659f).nativeSetFinalImageYuvAllocator(shotCallbacks.f8354a, nsqVar2);
                    }
                    i6 = 0;
                    ((NativeHdrPlusInterface) eemVar.f13674u.f39742a).nativeSetFinalImageCallback(shotCallbacks.f8354a, mav.m16284g(new ntj() { // from class: eek
                        @Override // p000.ntj
                        /* JADX INFO: renamed from: a */
                        public final void mo7216a(int i7, long j2, ShotMetadata shotMetadata, nrx nrxVar2) {
                            boolean z9 = false;
                            switch (i6) {
                                case 0:
                                    eem eemVar2 = eemVar;
                                    ntw.m17723i(shotMetadata, eem.m7217d(eemVar2.f13671r));
                                    lku.m15613H(eemVar2.f13672s == 1);
                                    boolean z10 = nrxVar2 == nrx.f44311d || nrxVar2 == nrx.f44313f;
                                    boolean z11 = nrxVar2 == nrx.f44309b || nrxVar2 == nrx.f44310c;
                                    boolean z12 = z10 || z11;
                                    lku.m15670x(z12, "Final image callback only supports PixelFormat.{kRgb, kRgba, kNv12, or kNv21}");
                                    if (z10) {
                                        if (eemVar2.f13665l.m7238k().mo16813g() || eemVar2.f13665l.m7239l().mo16813g()) {
                                            z9 = true;
                                        }
                                        lku.m15614I(z9, "Got RGB image with no downstream callback present.");
                                    }
                                    if (z11) {
                                        lku.m15614I(eemVar2.f13665l.m7241n().mo16813g(), "Got YUV image with no downstream callback present.");
                                    }
                                    if (!z10) {
                                        if (z11) {
                                            ((edj) eemVar2.f13665l.m7241n().mo16809c()).mo7054a(eemVar2, eemVar2.f13663j.m17647a(), shotMetadata);
                                        }
                                    } else if (eemVar2.f13665l.m7238k().mo16813g()) {
                                        nso nsoVar = (nso) eemVar2.f13662i;
                                        edh edhVar = (edh) eemVar2.f13665l.m7238k().mo16809c();
                                        lku.m15614I(nsoVar.f44422b, "doneWriting() must be called before getImage.");
                                        edhVar.mo7055a(eemVar2, nsoVar.f44421a, shotMetadata);
                                    } else if (eemVar2.f13665l.m7239l().mo16813g()) {
                                        ((edb) eemVar2.f13665l.m7239l().mo16809c()).mo7172a(((nsm) eemVar2.f13662i).m17646a(), shotMetadata);
                                    }
                                    break;
                                default:
                                    eem eemVar3 = eemVar;
                                    ntw.m17723i(shotMetadata, eem.m7217d(eemVar3.f13671r));
                                    lku.m15613H(eemVar3.f13672s == 1);
                                    lku.m15669w(i7 != GcamModuleJNI.kInvalidShotId_get());
                                    lku.m15669w(j2 != GcamModuleJNI.kInvalidAllocationId_get());
                                    if (eemVar3.f13665l.m7234g().mo16813g()) {
                                        nsl nslVar = (nsl) eemVar3.f13660g;
                                        if (nslVar.f44411a != null && nslVar.f44412b == null) {
                                            z9 = true;
                                        }
                                        lku.m15614I(z9, "doneWriting() must be called before getImage.");
                                        ((ecz) eemVar3.f13665l.m7234g().mo16809c()).mo7053o(eemVar3, nslVar.f44411a, shotMetadata);
                                    } else if (eemVar3.f13665l.m7233f().mo16813g()) {
                                        ((edb) eemVar3.f13665l.m7233f().mo16809c()).mo7172a(((nsm) eemVar3.f13660g).m17646a(), shotMetadata);
                                    } else if (eemVar3.f13665l.m7235h().mo16813g()) {
                                        ((edj) eemVar3.f13665l.m7235h().mo16809c()).mo7054a(eemVar3, eemVar3.f13661h.m17647a(), shotMetadata);
                                    }
                                    break;
                            }
                        }
                    }));
                } else {
                    i6 = 0;
                }
                if (eemVar.f13665l.m7230c().mo16813g()) {
                    ((NativeHdrPlusInterface) eemVar.f13659f).nativeSetMergedDngCallback(shotCallbacks.f8354a, new nsw(new nsw(eemVar, i5), i6));
                }
                if (eemVar.f13665l.m7237j().mo16813g()) {
                    nsp nspVar = new nsp();
                    ((NativeHdrPlusInterface) eemVar.f13659f).nativeSetMergedRawImageAllocator(shotCallbacks.f8354a, nspVar);
                    mav mavVar3 = eemVar.f13674u;
                    final fya fyaVar = new fya(eemVar, nspVar);
                    ((NativeHdrPlusInterface) mavVar3.f39742a).nativeSetMergedRawImageCallback(shotCallbacks.f8354a, new MergedRawCallback(bArr, bArr) { // from class: nth
                        @Override // com.google.googlex.gcam.hdrplus.MergedRawCallback
                        public final void accept(int i7, long j2, long j3, long j4, int i8) {
                            fya fyaVar2 = this.f44474a;
                            ShotMetadata shotMetadata = new ShotMetadata(j3);
                            nrt nrtVar = new nrt(j4);
                            nrx.m17636a(i8);
                            Object obj2 = fyaVar2.f23858b;
                            Object obj3 = fyaVar2.f23857a;
                            eem eemVar2 = (eem) obj2;
                            ntw.m17723i(shotMetadata, eem.m7217d(eemVar2.f13671r));
                            lku.m15613H(eemVar2.f13672s == 1);
                            lku.m15614I(eemVar2.f13665l.m7237j().mo16813g(), YmzeHXaMYOLk.LaSFw);
                            if (j2 == GcamModuleJNI.kInvalidAllocationId_get()) {
                                ((edg) eemVar2.f13665l.m7237j().mo16809c()).mo7175b(new edc(kfv.m14168E("MergeRaw failed (shotId = %d)", Integer.valueOf(i7))));
                                return;
                            }
                            nsp nspVar2 = (nsp) obj3;
                            lku.m15614I(nspVar2.f44425b, DNTdN.NcWXtP);
                            ((edg) eemVar2.f13665l.m7237j().mo16809c()).mo7174a(eemVar2, nspVar2.f44424a, shotMetadata, nrtVar);
                        }
                    });
                }
                if (eemVar.f13665l.m7231d().mo16813g()) {
                    mav mavVar4 = eemVar.f13674u;
                    final AmbientMode.AmbientController ambientController2 = new AmbientMode.AmbientController(eemVar);
                    ((NativeHdrPlusInterface) mavVar4.f39742a).nativeSetMutableMergedRawCallback(shotCallbacks.f8354a, new MutableMergedRawCallback(bArr, bArr, bArr) { // from class: ntc
                        @Override // com.google.googlex.gcam.hdrplus.MutableMergedRawCallback
                        public final void onImageView(int i7, long j2, long j3) {
                            AmbientMode.AmbientController ambientController3 = this.f44469a;
                            ShotMetadata shotMetadata = new ShotMetadata(j3);
                            eem eemVar2 = (eem) ambientController3.f1697a;
                            ntw.m17723i(shotMetadata, eem.m7217d(eemVar2.f13671r));
                            lku.m15613H(eemVar2.f13672s == 1);
                            lku.m15614I(eemVar2.f13665l.m7231d().mo16813g(), "Got mutable merged RAW callback but no callback present");
                            ((edd) eemVar2.f13665l.m7231d().mo16809c()).mo7173j(eemVar2, j2, shotMetadata);
                        }
                    });
                }
                if (eemVar.f13665l.m7232e().mo16813g()) {
                    ((NativeHdrPlusInterface) eemVar.f13659f).nativeSetMergedPdAllocator(shotCallbacks.f8354a, eemVar.f13664k);
                    ((NativeHdrPlusInterface) eemVar.f13659f).nativeSetMergedPdCallback(shotCallbacks.f8354a, new IntLongConsumer() { // from class: eei
                        @Override // com.google.googlex.gcam.base.function.IntLongConsumer
                        public final void accept(int i7, long j2) {
                            eem eemVar2 = eemVar;
                            lku.m15613H(eemVar2.f13672s == 1);
                            lku.m15614I(eemVar2.f13665l.m7232e().mo16813g(), "Got PD with no callback present");
                            if (j2 == GcamModuleJNI.kInvalidAllocationId_get()) {
                                ((nbe) ((nbe) eem.f13654a.m17252c()).mo17276G(1334)).mo17291p("MergePD failed (shotId = %d)", i7);
                                ((ede) eemVar2.f13665l.m7232e().mo16809c()).mo7061b(new edc(kfv.m14168E("MergePD failed (shotId = %d)", Integer.valueOf(i7))));
                            } else {
                                nsn nsnVar = eemVar2.f13664k;
                                lku.m15614I(nsnVar.f44419b, "doneWriting() must be called before getImage.");
                                ((ede) eemVar2.f13665l.m7232e().mo16809c()).mo7060a(nsnVar.f44418a);
                            }
                        }
                    });
                }
                if (this.f13404B.m7074f(this.f13436o)) {
                    this.f13426d.mo13963g("slowRawSetup");
                    mrmVarM8495b = ((fjp) this.f13442u).m8495b();
                    if (mrmVarM8495b.mo16813g()) {
                        glkVar2 = glkVar;
                        r9 = glkVar2.f25502c;
                        if (r9 != 0) {
                            jCurrentTimeMillis = r9.mo9898d();
                        } else {
                            jCurrentTimeMillis = System.currentTimeMillis();
                        }
                        if (((File) mrmVarM8495b.mo16809c()).getFreeSpace() <= 1073741824) {
                            this.f13421S.m6691f("Cache has less than 1GB free. Slowraw data may be silently deleted.");
                        }
                        if (z2) {
                            try {
                                if (!this.f13436o.equals(edk.PORTRAIT) || this.f13436o.equals(edk.REGULAR)) {
                                    strM7072c = this.f13404B.m7072c((File) mrmVarM8495b.mo16809c(), jCurrentTimeMillis, "camera_" + (((this.f13436o.equals(edk.PORTRAIT) || !this.f13433l.mo6184l(dib.f11273ag)) && egmVar2.f13974b != egl.DEBLUR) ? this.f13427f : this.f13428g));
                                } else if (z2 || !this.f13436o.equals(edk.LONG_EXPOSURE)) {
                                    strM7072c = this.f13404B.m7072c((File) mrmVarM8495b.mo16809c(), jCurrentTimeMillis, "");
                                } else {
                                    strM7072c = this.f13404B.m7072c((File) mrmVarM8495b.mo16809c(), jCurrentTimeMillis, "camera_kepler_" + i3);
                                }
                                this.f13446y = strM7072c;
                                ImageSaverParams imageSaverParams = new ImageSaverParams();
                                imageSaverParams.m4994b(strM7072c);
                                debugParams2 = new DebugParams();
                                try {
                                    debugParams2.m4920d(ebq.f13279e);
                                    debugParams2.m4919c(imageSaverParams);
                                    if (!z2 && (r4 = glkVar2.f25502c) != 0) {
                                        r4.mo9897ac(new cwd(strM7072c));
                                    }
                                    debugParams = debugParams2;
                                } catch (IOException e2) {
                                    e = e2;
                                    ((nbe) ((nbe) ((nbe) f13402e.m17251b()).mo17283h(e)).mo17276G((char) 1294)).mo17293r("%s", "Failed to create Gcam debug data folder!");
                                    String localizedMessage = e.getLocalizedMessage();
                                    this.f13421S.m6691f(localizedMessage != null ? localizedMessage : "Failed to create Gcam debug data folder!");
                                    debugParams = debugParams2;
                                }
                            } catch (IOException e3) {
                                e = e3;
                                debugParams2 = null;
                                ((nbe) ((nbe) ((nbe) f13402e.m17251b()).mo17283h(e)).mo17276G((char) 1294)).mo17293r("%s", "Failed to create Gcam debug data folder!");
                                String localizedMessage2 = e.getLocalizedMessage();
                                this.f13421S.m6691f(localizedMessage2 != null ? localizedMessage2 : "Failed to create Gcam debug data folder!");
                                debugParams = debugParams2;
                                this.f13426d.mo13963g("getPrimaryOutputFormat");
                                if (eeoVarM2623q.m7238k().mo16813g()) {
                                    nrxVar = ebq.f13276b;
                                } else if (eeoVarM2623q.m7239l().mo16813g()) {
                                    nrxVar = ebq.f13277c;
                                } else if (eeoVarM2623q.m7241n().mo16813g()) {
                                    nrxVar = ebq.f13278d;
                                } else {
                                    nrxVar = nrx.f44308a;
                                }
                                this.f13426d.mo13963g("Gcam::StartShotCapture");
                                GcamModuleJNI.ShotCallbacks_final_image_pixel_format_set(shotCallbacks.f8354a, shotCallbacks, nrxVar.f44321l);
                                GcamModuleJNI.ShotCallbacks_postview_params_set(shotCallbacks.f8354a, shotCallbacks, postviewParams.f8341a, postviewParams);
                                Gcam gcam = this.f13430i;
                                iGcam_StartShotCapture = GcamModuleJNI.Gcam_StartShotCapture(gcam.f8271a, gcam, iMo7135b, shotParamsM7162K.f8358a, shotParamsM7162K, shotCallbacks.f8354a, shotCallbacks, DebugParams.m4917a(debugParams), debugParams);
                                this.f13426d.mo13962f();
                                if (iGcam_StartShotCapture == GcamModuleJNI.kInvalidShotId_get()) {
                                    if (this.f13447z != dja.RELEASE) {
                                        throw new IllegalArgumentException("Gcam::StartShotCapture() returned an invalid shot id.");
                                    }
                                    ((nbe) ((nbe) f13402e.m17251b()).mo17276G((char) 1293)).mo17293r("%s", "Gcam::StartShotCapture() returned an invalid shot id.");
                                    return null;
                                }
                                jvb jvbVar = ((fua) glkVar2.f25503d).f23578f;
                                ebwVar = this.f13403A;
                                oyoVar = new oyo(iGcam_StartShotCapture);
                                synchronized (ebwVar.f13309a) {
                                    ebwVar.f13310b.add(oyoVar);
                                    jvbVar.m13537d(new cic(ebwVar, oyoVar, 20, (byte[]) null, (byte[]) null, (byte[]) null));
                                    if (iGcam_StartShotCapture != GcamModuleJNI.kInvalidShotId_get()) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    lku.m15669w(z7);
                                    if (eemVar.f13656c == GcamModuleJNI.kInvalidShotId_get()) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    lku.m15613H(z8);
                                    eemVar.f13656c = iGcam_StartShotCapture;
                                    return eemVar;
                                }
                            }
                        } else {
                            if (z2) {
                                strM7072c = this.f13404B.m7072c((File) mrmVarM8495b.mo16809c(), jCurrentTimeMillis, "");
                            } else {
                                strM7072c = this.f13404B.m7072c((File) mrmVarM8495b.mo16809c(), jCurrentTimeMillis, "");
                            }
                            this.f13446y = strM7072c;
                            ImageSaverParams imageSaverParams2 = new ImageSaverParams();
                            imageSaverParams2.m4994b(strM7072c);
                            debugParams2 = new DebugParams();
                            debugParams2.m4920d(ebq.f13279e);
                            debugParams2.m4919c(imageSaverParams2);
                            if (!z2) {
                                r4.mo9897ac(new cwd(strM7072c));
                            }
                            debugParams = debugParams2;
                        }
                    } else {
                        glkVar2 = glkVar;
                        debugParams = null;
                    }
                    break;
                } else {
                    glkVar2 = glkVar;
                    debugParams = null;
                }
                this.f13426d.mo13963g("getPrimaryOutputFormat");
                if (eeoVarM2623q.m7238k().mo16813g()) {
                    nrxVar = ebq.f13276b;
                } else if (eeoVarM2623q.m7239l().mo16813g()) {
                    nrxVar = ebq.f13277c;
                } else if (eeoVarM2623q.m7241n().mo16813g()) {
                    nrxVar = ebq.f13278d;
                } else {
                    nrxVar = nrx.f44308a;
                }
                this.f13426d.mo13963g("Gcam::StartShotCapture");
                GcamModuleJNI.ShotCallbacks_final_image_pixel_format_set(shotCallbacks.f8354a, shotCallbacks, nrxVar.f44321l);
                GcamModuleJNI.ShotCallbacks_postview_params_set(shotCallbacks.f8354a, shotCallbacks, postviewParams.f8341a, postviewParams);
                Gcam gcam2 = this.f13430i;
                iGcam_StartShotCapture = GcamModuleJNI.Gcam_StartShotCapture(gcam2.f8271a, gcam2, iMo7135b, shotParamsM7162K.f8358a, shotParamsM7162K, shotCallbacks.f8354a, shotCallbacks, DebugParams.m4917a(debugParams), debugParams);
                this.f13426d.mo13962f();
                if (iGcam_StartShotCapture == GcamModuleJNI.kInvalidShotId_get()) {
                    if (this.f13447z != dja.RELEASE) {
                        throw new IllegalArgumentException("Gcam::StartShotCapture() returned an invalid shot id.");
                    }
                    ((nbe) ((nbe) f13402e.m17251b()).mo17276G((char) 1293)).mo17293r("%s", "Gcam::StartShotCapture() returned an invalid shot id.");
                    return null;
                }
                jvb jvbVar2 = ((fua) glkVar2.f25503d).f23578f;
                ebwVar = this.f13403A;
                oyoVar = new oyo(iGcam_StartShotCapture);
                synchronized (ebwVar.f13309a) {
                    ebwVar.f13310b.add(oyoVar);
                    break;
                }
                jvbVar2.m13537d(new cic(ebwVar, oyoVar, 20, (byte[]) null, (byte[]) null, (byte[]) null));
                if (iGcam_StartShotCapture != GcamModuleJNI.kInvalidShotId_get()) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                lku.m15669w(z7);
                if (eemVar.f13656c == GcamModuleJNI.kInvalidShotId_get()) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                lku.m15613H(z8);
                eemVar.f13656c = iGcam_StartShotCapture;
                return eemVar;
        }
        strConcat = strConcat.concat(str);
        GcamModuleJNI.ShotParams_software_suffix_set(shotParamsM7162K.f8358a, shotParamsM7162K, strConcat);
        this.f13426d.mo13963g("setBfIndex");
        if (i2 >= -1) {
            z4 = true;
        } else {
            z4 = false;
        }
        lku.m15670x(z4, "Incorrect base frame override.");
        GcamModuleJNI.ShotParams_base_frame_override_index_set(shotParamsM7162K.f8358a, shotParamsM7162K, i2);
        if (z) {
            lku.m15670x(true, "Incorrect base frame hint.");
            GcamModuleJNI.ShotParams_zsl_base_frame_index_hint_set(shotParamsM7162K.f8358a, shotParamsM7162K, i);
        }
        this.f13426d.mo13963g("AwbInfo");
        awbInfoM17666i = nta.m17666i(kppVar, this.f13438q.m17682f(kppVar, kmgVar));
        this.f13426d.mo13963g("wb");
        int iIntValue2 = ((Integer) this.f13433l.mo6173a(did.f11448b).orElse(2)).intValue();
        if (z) {
            z5 = false;
        } else {
            z5 = false;
        }
        if (mrmVar.mo16813g()) {
            shotParamsM7162K.m5112c((AwbInfo) mrmVar.mo16809c());
        } else if (z5) {
            shotParamsM7162K.m5112c(awbInfoM17666i);
        }
        kbcVar = this.f13441t;
        StaticMetadata staticMetadataM4972b2 = this.f13430i.m4972b(iMo7135b);
        nseVarM5121d = staticMetadataM4972b2.m5121d();
        if (this.f13436o.equals(edk.PORTRAIT)) {
            this.f13426d.mo13963g("updateAndGetPhotoSize");
            shotParamsM7162K.m5114e(nsc.f44355a);
            shotParamsM7162K.m5110a().m4893j(0);
            shotParamsM7162K.m5110a().m4892i(0);
            if (nseVarM5121d == nse.f44363b) {
                optionalMo6180h = this.f13433l.mo6180h(dio.f11664f);
                if (optionalMo6180h.isPresent()) {
                    kpbVar = this.f13414L;
                    if (kpbVar.f36781n) {
                        shotParamsM7162K.m5110a().m4890g(gpt.f26024d);
                    } else if (kpbVar.f36782o) {
                        shotParamsM7162K.m5110a().m4890g(gpt.f26025e);
                    } else {
                        shotParamsM7162K.m5110a().m4890g(gpt.f26021a);
                    }
                } else {
                    kpbVar = this.f13414L;
                    if (kpbVar.f36781n) {
                        shotParamsM7162K.m5110a().m4890g(gpt.f26024d);
                    } else if (kpbVar.f36782o) {
                        shotParamsM7162K.m5110a().m4890g(gpt.f26025e);
                    } else {
                        shotParamsM7162K.m5110a().m4890g(gpt.f26021a);
                    }
                }
            } else if (nseVarM5121d == nse.f44373l) {
                shotParamsM7162K.m5110a().m4890g(gpt.f26023c);
                if (kan.f35487b.m13883m(kan.m13873j(kbcVar))) {
                    kbcVar2 = gpt.f26027g;
                }
            }
            kbcVar2 = kbcVar;
        } else {
            if (nseVarM5121d == nse.f44366e) {
                z6 = true;
            }
            if (!z2) {
                kbcVar2 = kbcVar;
            } else {
                kbcVar2 = kbcVar;
            }
        }
        this.f13426d.mo13963g("updateAe");
        this.f13438q.m17688u(kmgVar, shotParamsM7162K.m5110a(), kppVar, this.f13432k.f13305g, kbcVar2);
        if (z2) {
            edkVar = this.f13436o;
            if (edkVar != edk.PORTRAIT) {
                egmVar2 = egmVar;
                if (egmVar2.f13974b != egl.ZOOM) {
                    this.f13426d.mo13963g("disableCrop");
                    shotParamsM7162K.m5110a().m4888e(new NormalizedRect());
                }
            } else {
                egmVar2 = egmVar;
                if (egmVar2.f13974b != egl.ZOOM) {
                    this.f13426d.mo13963g("disableCrop");
                    shotParamsM7162K.m5110a().m4888e(new NormalizedRect());
                }
            }
        } else {
            egmVar2 = egmVar;
        }
        rectF = (RectF) ((fua) glkVar.f25503d).f23582j.mo16812f();
        if (rectF != null) {
            this.f13426d.mo13963g("overrideMergedCrop");
            AeShotParams aeShotParamsM5110a3 = shotParamsM7162K.m5110a();
            NormalizedRect normalizedRect2 = new NormalizedRect();
            normalizedRect2.m5052c(rectF.left);
            normalizedRect2.m5054e(rectF.top);
            normalizedRect2.m5053d(rectF.right);
            normalizedRect2.m5055f(rectF.bottom);
            aeShotParamsM5110a3.m4888e(normalizedRect2);
            aeShotParamsM5110a3.m4890g(normalizedRect2);
        }
        if (this.f13436o.equals(edk.PORTRAIT)) {
            this.f13426d.mo13963g(WIxTIdUIdfb.aQRq);
            aeShotParamsM5110a = shotParamsM7162K.m5110a();
            normalizedRectM4885b = aeShotParamsM5110a.m4885b();
            if (!GcamModuleJNI.NormalizedRect_IsEmpty(normalizedRectM4885b.f8322a, normalizedRectM4885b)) {
                NormalizedRect normalizedRectM4885b3 = aeShotParamsM5110a.m4885b();
                NormalizedRect normalizedRectM4884a2 = aeShotParamsM5110a.m4884a();
                aeShotParamsM5110a.m4890g(new NormalizedRect(GcamModuleJNI.Union(NormalizedRect.m5050a(normalizedRectM4885b3), normalizedRectM4885b3, NormalizedRect.m5050a(normalizedRectM4884a2), normalizedRectM4884a2), true));
            }
        }
        this.f13426d.mo13962f();
        this.f13426d.mo13963g("createShot");
        iM17712U = ntw.m17712U(((InitParams) this.f13424V.f3652a).m4995a().f44219f);
        if (iM17712U == 0) {
            i4 = 1;
        } else {
            i4 = iM17712U;
        }
        eemVar = new eem(this.f13431j, eeoVarM2623q, this.f13437p, glkVar, i4, this.f13422T, this.f13447z, this.f13421S, shotParamsM7162K, this.f13436o, zM7165N, kppVar, egmVar, kmgVar, this.f13420R.mo10518e(), null, null, null, null);
        this.f13426d.mo13963g("createShotCallbacks");
        shotCallbacks = new ShotCallbacks();
        if (eemVar.f13665l.m7236i().mo16813g()) {
            ((NativeHdrPlusInterface) eemVar.f13659f).nativeSetProgressCallback(shotCallbacks.f8354a, new IntFloatConsumer() { // from class: eeh
                @Override // com.google.googlex.gcam.base.function.IntFloatConsumer
                public final void accept(int i7, float f) {
                    eem eemVar2 = eemVar;
                    lku.m15613H(eemVar2.f13665l.m7236i().mo16813g());
                    ((edf) eemVar2.f13665l.m7236i().mo16809c()).mo7051a(f);
                }
            });
        }
        mav mavVar5 = eemVar.f13674u;
        final eel eelVar2 = eemVar.f13673t;
        Object obj2 = mavVar5.f39742a;
        long j2 = shotCallbacks.f8354a;
        eelVar2.getClass();
        ((NativeHdrPlusInterface) obj2).nativeSetShotStatusCallbacks(j2, new IntByteArrayConsumer() { // from class: nte
            @Override // com.google.googlex.gcam.base.function.IntByteArrayConsumer
            public final void accept(int i7, byte[] bArr2) {
                ntu ntuVar;
                int i8;
                eel eelVar3 = eelVar2;
                nbh nbhVar = eem.f13654a;
                lku.m15613H(eelVar3.f13650c.f13672s == 1);
                eelVar3.f13650c.f13672s = 2;
                try {
                    nxq nxqVarM18123Q = nxq.m18123Q(ntu.f44557E, bArr2, 0, bArr2.length, nxf.m18011a());
                    nxq.m18132ae(nxqVarM18123Q);
                    ntuVar = (ntu) nxqVarM18123Q;
                } catch (nyb e4) {
                    ((nbe) ((nbe) ((nbe) eem.f13654a.m17252c()).mo17283h(e4)).mo17276G((char) 1331)).mo17290o("Error deserializing shot log data");
                    ntuVar = ntu.f44557E;
                }
                ebp ebpVar = new ebp(ntuVar, eelVar3.f13651d);
                eeo eeoVar = eelVar3.f13648a;
                if ((eeoVar.m7241n().mo16813g() || eeoVar.m7238k().mo16813g() || eeoVar.m7239l().mo16813g()) && (i8 = eelVar3.f13651d) != 2) {
                    int iM17712U2 = ntw.m17712U(ntuVar.f44577n);
                    if ((iM17712U2 != 0 ? iM17712U2 : 2) != i8) {
                        nbw nbwVarM17251b = eem.f13654a.m17251b();
                        String str2 = i8 == 3 ? PMZiHihxLGEy.OKlNUt : "Gxp";
                        ((nbe) ((nbe) nbwVarM17251b).mo17276G((char) 1329)).mo17293r("%s failed", str2);
                        if (eelVar3.f13649b != dja.RELEASE && !eem.f13655b.getAndSet(true)) {
                            eelVar3.f13652e.m6691f(str2.concat(" failed! Please immediately take and file a bug report."));
                        }
                    }
                }
                for (int i9 = 0; i9 < ntuVar.f44567d.size(); i9++) {
                    if (ntuVar.f44567d.mo18032d(i9) == 1.0f) {
                        ((nbe) ((nbe) eem.f13654a.m17251b()).mo17276G((char) 1330)).mo17290o("Black frame detected");
                        if (eelVar3.f13649b == dja.RELEASE) {
                            break;
                        }
                        eelVar3.f13652e.m6691f(VzWFSVj.ERTQKBpF);
                        break;
                    }
                }
                hkc hkcVarM11345m = eelVar3.f13653f.m11345m();
                if (eelVar3.f13648a.m7240m().mo16813g()) {
                    ((edi) eelVar3.f13648a.m7240m().mo16809c()).mo7057b(eelVar3.f13650c, hkcVarM11345m, ebpVar);
                }
            }
        }, new IntStringConsumer() { // from class: ntf
            @Override // com.google.googlex.gcam.base.function.IntStringConsumer
            public final void accept(int i7, String str2) {
                eel eelVar3 = eelVar2;
                ((nbe) ((nbe) eem.f13654a.m17251b()).mo17276G(1332)).mo17296u("HDR+ pipeline reported error for shotId %d: %s", i7, str2);
                lku.m15613H(eelVar3.f13650c.f13672s == 1);
                eelVar3.f13650c.f13672s = 3;
                if (eelVar3.f13648a.m7240m().mo16813g()) {
                    ((edi) eelVar3.f13648a.m7240m().mo16809c()).mo7058c(eelVar3.f13650c, new edc(str2));
                }
            }
        }, new IntConsumer() { // from class: ntg
            @Override // com.google.googlex.gcam.base.function.IntConsumer
            public final void accept(int i7) {
                eel eelVar3 = eelVar2;
                nbh nbhVar = eem.f13654a;
                lku.m15613H(eelVar3.f13650c.f13672s == 1);
                eelVar3.f13650c.f13672s = 4;
                if (eelVar3.f13648a.m7240m().mo16813g()) {
                    ((edi) eelVar3.f13648a.m7240m().mo16809c()).mo7059p(eelVar3.f13650c);
                }
            }
        });
        zMo16813g = eemVar.f13665l.m7228a().mo16813g();
        bArr = null;
        if (zMo16813g) {
            mav mavVar6 = eemVar.f13674u;
            final AmbientMode.AmbientController ambientController3 = new AmbientMode.AmbientController(eemVar);
            ((NativeHdrPlusInterface) mavVar6.f39742a).nativeSetBaseFrameAeCallback(shotCallbacks.f8354a, new BaseFrameAeCallback(bArr, bArr, bArr) { // from class: ntd
                @Override // com.google.googlex.gcam.hdrplus.BaseFrameAeCallback
                public final void accept(int i7, long j3) {
                    AmbientMode.AmbientController ambientController4 = this.f44470a;
                    AeResults aeResults = new AeResults(j3, true);
                    eem eemVar2 = (eem) ambientController4.f1697a;
                    lku.m15613H(eemVar2.f13672s == 1);
                    ((ecx) eemVar2.f13665l.m7228a().mo16809c()).mo7171j(eemVar2, aeResults);
                }
            });
        }
        if (eemVar.f13665l.m7229b().mo16813g()) {
            ((NativeHdrPlusInterface) eemVar.f13659f).nativeSetBaseFrameCallback(shotCallbacks.f8354a, new BaseFrameCallback() { // from class: eej
                @Override // com.google.googlex.gcam.hdrplus.BaseFrameCallback
                public final void onBaseFrameSelected(int i7, int i8, long j3) {
                    eem eemVar2 = eemVar;
                    lku.m15613H(eemVar2.f13672s == 1);
                    int size = eemVar2.f13658e.size();
                    lku.m15608C(i8 < size, "Base frame index %s >= payload timestamps size %s", i8, eemVar2.f13658e.size());
                    int size2 = eemVar2.f13657d.size();
                    lku.m15608C(i8 < size2, "Base frame index %s >= payload metadata size %s", i8, eemVar2.f13657d.size());
                    lku.m15614I(((Long) eemVar2.f13658e.get(i8)).longValue() == j3, "Base frame timestamps don't match");
                    ((ecy) eemVar2.f13665l.m7229b().mo16809c()).mo7052a(eemVar2, i8, j3, (kpp) eemVar2.f13657d.get(i8));
                }
            });
        }
        interleavedU8ClientAllocator = eemVar.f13660g;
        if (interleavedU8ClientAllocator == null) {
            if (interleavedU8ClientAllocator != null) {
                ((NativeHdrPlusInterface) eemVar.f13659f).nativeSetPostviewRgbAllocator(shotCallbacks.f8354a, interleavedU8ClientAllocator);
            } else {
                nsqVar = eemVar.f13661h;
                if (nsqVar != null) {
                    ((NativeHdrPlusInterface) eemVar.f13659f).nativeSetPostviewYuvAllocator(shotCallbacks.f8354a, nsqVar);
                }
            }
            i5 = 1;
            ((NativeHdrPlusInterface) eemVar.f13674u.f39742a).nativeSetPostviewCallback(shotCallbacks.f8354a, mav.m16284g(new ntj() { // from class: eek
                @Override // p000.ntj
                /* JADX INFO: renamed from: a */
                public final void mo7216a(int i7, long j3, ShotMetadata shotMetadata, nrx nrxVar2) {
                    boolean z9 = false;
                    switch (i5) {
                        case 0:
                            eem eemVar2 = eemVar;
                            ntw.m17723i(shotMetadata, eem.m7217d(eemVar2.f13671r));
                            lku.m15613H(eemVar2.f13672s == 1);
                            boolean z10 = nrxVar2 == nrx.f44311d || nrxVar2 == nrx.f44313f;
                            boolean z11 = nrxVar2 == nrx.f44309b || nrxVar2 == nrx.f44310c;
                            boolean z12 = z10 || z11;
                            lku.m15670x(z12, "Final image callback only supports PixelFormat.{kRgb, kRgba, kNv12, or kNv21}");
                            if (z10) {
                                if (eemVar2.f13665l.m7238k().mo16813g() || eemVar2.f13665l.m7239l().mo16813g()) {
                                    z9 = true;
                                }
                                lku.m15614I(z9, "Got RGB image with no downstream callback present.");
                            }
                            if (z11) {
                                lku.m15614I(eemVar2.f13665l.m7241n().mo16813g(), "Got YUV image with no downstream callback present.");
                            }
                            if (!z10) {
                                if (z11) {
                                    ((edj) eemVar2.f13665l.m7241n().mo16809c()).mo7054a(eemVar2, eemVar2.f13663j.m17647a(), shotMetadata);
                                }
                            } else if (eemVar2.f13665l.m7238k().mo16813g()) {
                                nso nsoVar = (nso) eemVar2.f13662i;
                                edh edhVar = (edh) eemVar2.f13665l.m7238k().mo16809c();
                                lku.m15614I(nsoVar.f44422b, "doneWriting() must be called before getImage.");
                                edhVar.mo7055a(eemVar2, nsoVar.f44421a, shotMetadata);
                            } else if (eemVar2.f13665l.m7239l().mo16813g()) {
                                ((edb) eemVar2.f13665l.m7239l().mo16809c()).mo7172a(((nsm) eemVar2.f13662i).m17646a(), shotMetadata);
                            }
                            break;
                        default:
                            eem eemVar3 = eemVar;
                            ntw.m17723i(shotMetadata, eem.m7217d(eemVar3.f13671r));
                            lku.m15613H(eemVar3.f13672s == 1);
                            lku.m15669w(i7 != GcamModuleJNI.kInvalidShotId_get());
                            lku.m15669w(j3 != GcamModuleJNI.kInvalidAllocationId_get());
                            if (eemVar3.f13665l.m7234g().mo16813g()) {
                                nsl nslVar = (nsl) eemVar3.f13660g;
                                if (nslVar.f44411a != null && nslVar.f44412b == null) {
                                    z9 = true;
                                }
                                lku.m15614I(z9, "doneWriting() must be called before getImage.");
                                ((ecz) eemVar3.f13665l.m7234g().mo16809c()).mo7053o(eemVar3, nslVar.f44411a, shotMetadata);
                            } else if (eemVar3.f13665l.m7233f().mo16813g()) {
                                ((edb) eemVar3.f13665l.m7233f().mo16809c()).mo7172a(((nsm) eemVar3.f13660g).m17646a(), shotMetadata);
                            } else if (eemVar3.f13665l.m7235h().mo16813g()) {
                                ((edj) eemVar3.f13665l.m7235h().mo16809c()).mo7054a(eemVar3, eemVar3.f13661h.m17647a(), shotMetadata);
                            }
                            break;
                    }
                }
            }));
        } else {
            if (interleavedU8ClientAllocator != null) {
                ((NativeHdrPlusInterface) eemVar.f13659f).nativeSetPostviewRgbAllocator(shotCallbacks.f8354a, interleavedU8ClientAllocator);
            } else {
                nsqVar = eemVar.f13661h;
                if (nsqVar != null) {
                    ((NativeHdrPlusInterface) eemVar.f13659f).nativeSetPostviewYuvAllocator(shotCallbacks.f8354a, nsqVar);
                }
            }
            i5 = 1;
            ((NativeHdrPlusInterface) eemVar.f13674u.f39742a).nativeSetPostviewCallback(shotCallbacks.f8354a, mav.m16284g(new ntj() { // from class: eek
                @Override // p000.ntj
                /* JADX INFO: renamed from: a */
                public final void mo7216a(int i7, long j3, ShotMetadata shotMetadata, nrx nrxVar2) {
                    boolean z9 = false;
                    switch (i5) {
                        case 0:
                            eem eemVar2 = eemVar;
                            ntw.m17723i(shotMetadata, eem.m7217d(eemVar2.f13671r));
                            lku.m15613H(eemVar2.f13672s == 1);
                            boolean z10 = nrxVar2 == nrx.f44311d || nrxVar2 == nrx.f44313f;
                            boolean z11 = nrxVar2 == nrx.f44309b || nrxVar2 == nrx.f44310c;
                            boolean z12 = z10 || z11;
                            lku.m15670x(z12, "Final image callback only supports PixelFormat.{kRgb, kRgba, kNv12, or kNv21}");
                            if (z10) {
                                if (eemVar2.f13665l.m7238k().mo16813g() || eemVar2.f13665l.m7239l().mo16813g()) {
                                    z9 = true;
                                }
                                lku.m15614I(z9, "Got RGB image with no downstream callback present.");
                            }
                            if (z11) {
                                lku.m15614I(eemVar2.f13665l.m7241n().mo16813g(), "Got YUV image with no downstream callback present.");
                            }
                            if (!z10) {
                                if (z11) {
                                    ((edj) eemVar2.f13665l.m7241n().mo16809c()).mo7054a(eemVar2, eemVar2.f13663j.m17647a(), shotMetadata);
                                }
                            } else if (eemVar2.f13665l.m7238k().mo16813g()) {
                                nso nsoVar = (nso) eemVar2.f13662i;
                                edh edhVar = (edh) eemVar2.f13665l.m7238k().mo16809c();
                                lku.m15614I(nsoVar.f44422b, "doneWriting() must be called before getImage.");
                                edhVar.mo7055a(eemVar2, nsoVar.f44421a, shotMetadata);
                            } else if (eemVar2.f13665l.m7239l().mo16813g()) {
                                ((edb) eemVar2.f13665l.m7239l().mo16809c()).mo7172a(((nsm) eemVar2.f13662i).m17646a(), shotMetadata);
                            }
                            break;
                        default:
                            eem eemVar3 = eemVar;
                            ntw.m17723i(shotMetadata, eem.m7217d(eemVar3.f13671r));
                            lku.m15613H(eemVar3.f13672s == 1);
                            lku.m15669w(i7 != GcamModuleJNI.kInvalidShotId_get());
                            lku.m15669w(j3 != GcamModuleJNI.kInvalidAllocationId_get());
                            if (eemVar3.f13665l.m7234g().mo16813g()) {
                                nsl nslVar = (nsl) eemVar3.f13660g;
                                if (nslVar.f44411a != null && nslVar.f44412b == null) {
                                    z9 = true;
                                }
                                lku.m15614I(z9, "doneWriting() must be called before getImage.");
                                ((ecz) eemVar3.f13665l.m7234g().mo16809c()).mo7053o(eemVar3, nslVar.f44411a, shotMetadata);
                            } else if (eemVar3.f13665l.m7233f().mo16813g()) {
                                ((edb) eemVar3.f13665l.m7233f().mo16809c()).mo7172a(((nsm) eemVar3.f13660g).m17646a(), shotMetadata);
                            } else if (eemVar3.f13665l.m7235h().mo16813g()) {
                                ((edj) eemVar3.f13665l.m7235h().mo16809c()).mo7054a(eemVar3, eemVar3.f13661h.m17647a(), shotMetadata);
                            }
                            break;
                    }
                }
            }));
        }
        interleavedU8ClientAllocator2 = eemVar.f13662i;
        if (interleavedU8ClientAllocator2 == null) {
            if (interleavedU8ClientAllocator2 != null) {
                ((NativeHdrPlusInterface) eemVar.f13659f).nativeSetFinalImageRgbAllocator(shotCallbacks.f8354a, interleavedU8ClientAllocator2);
            }
            nsqVar2 = eemVar.f13663j;
            if (nsqVar2 != null) {
                ((NativeHdrPlusInterface) eemVar.f13659f).nativeSetFinalImageYuvAllocator(shotCallbacks.f8354a, nsqVar2);
            }
            i6 = 0;
            ((NativeHdrPlusInterface) eemVar.f13674u.f39742a).nativeSetFinalImageCallback(shotCallbacks.f8354a, mav.m16284g(new ntj() { // from class: eek
                @Override // p000.ntj
                /* JADX INFO: renamed from: a */
                public final void mo7216a(int i7, long j3, ShotMetadata shotMetadata, nrx nrxVar2) {
                    boolean z9 = false;
                    switch (i6) {
                        case 0:
                            eem eemVar2 = eemVar;
                            ntw.m17723i(shotMetadata, eem.m7217d(eemVar2.f13671r));
                            lku.m15613H(eemVar2.f13672s == 1);
                            boolean z10 = nrxVar2 == nrx.f44311d || nrxVar2 == nrx.f44313f;
                            boolean z11 = nrxVar2 == nrx.f44309b || nrxVar2 == nrx.f44310c;
                            boolean z12 = z10 || z11;
                            lku.m15670x(z12, "Final image callback only supports PixelFormat.{kRgb, kRgba, kNv12, or kNv21}");
                            if (z10) {
                                if (eemVar2.f13665l.m7238k().mo16813g() || eemVar2.f13665l.m7239l().mo16813g()) {
                                    z9 = true;
                                }
                                lku.m15614I(z9, "Got RGB image with no downstream callback present.");
                            }
                            if (z11) {
                                lku.m15614I(eemVar2.f13665l.m7241n().mo16813g(), "Got YUV image with no downstream callback present.");
                            }
                            if (!z10) {
                                if (z11) {
                                    ((edj) eemVar2.f13665l.m7241n().mo16809c()).mo7054a(eemVar2, eemVar2.f13663j.m17647a(), shotMetadata);
                                }
                            } else if (eemVar2.f13665l.m7238k().mo16813g()) {
                                nso nsoVar = (nso) eemVar2.f13662i;
                                edh edhVar = (edh) eemVar2.f13665l.m7238k().mo16809c();
                                lku.m15614I(nsoVar.f44422b, "doneWriting() must be called before getImage.");
                                edhVar.mo7055a(eemVar2, nsoVar.f44421a, shotMetadata);
                            } else if (eemVar2.f13665l.m7239l().mo16813g()) {
                                ((edb) eemVar2.f13665l.m7239l().mo16809c()).mo7172a(((nsm) eemVar2.f13662i).m17646a(), shotMetadata);
                            }
                            break;
                        default:
                            eem eemVar3 = eemVar;
                            ntw.m17723i(shotMetadata, eem.m7217d(eemVar3.f13671r));
                            lku.m15613H(eemVar3.f13672s == 1);
                            lku.m15669w(i7 != GcamModuleJNI.kInvalidShotId_get());
                            lku.m15669w(j3 != GcamModuleJNI.kInvalidAllocationId_get());
                            if (eemVar3.f13665l.m7234g().mo16813g()) {
                                nsl nslVar = (nsl) eemVar3.f13660g;
                                if (nslVar.f44411a != null && nslVar.f44412b == null) {
                                    z9 = true;
                                }
                                lku.m15614I(z9, "doneWriting() must be called before getImage.");
                                ((ecz) eemVar3.f13665l.m7234g().mo16809c()).mo7053o(eemVar3, nslVar.f44411a, shotMetadata);
                            } else if (eemVar3.f13665l.m7233f().mo16813g()) {
                                ((edb) eemVar3.f13665l.m7233f().mo16809c()).mo7172a(((nsm) eemVar3.f13660g).m17646a(), shotMetadata);
                            } else if (eemVar3.f13665l.m7235h().mo16813g()) {
                                ((edj) eemVar3.f13665l.m7235h().mo16809c()).mo7054a(eemVar3, eemVar3.f13661h.m17647a(), shotMetadata);
                            }
                            break;
                    }
                }
            }));
        } else {
            if (interleavedU8ClientAllocator2 != null) {
                ((NativeHdrPlusInterface) eemVar.f13659f).nativeSetFinalImageRgbAllocator(shotCallbacks.f8354a, interleavedU8ClientAllocator2);
            }
            nsqVar2 = eemVar.f13663j;
            if (nsqVar2 != null) {
                ((NativeHdrPlusInterface) eemVar.f13659f).nativeSetFinalImageYuvAllocator(shotCallbacks.f8354a, nsqVar2);
            }
            i6 = 0;
            ((NativeHdrPlusInterface) eemVar.f13674u.f39742a).nativeSetFinalImageCallback(shotCallbacks.f8354a, mav.m16284g(new ntj() { // from class: eek
                @Override // p000.ntj
                /* JADX INFO: renamed from: a */
                public final void mo7216a(int i7, long j3, ShotMetadata shotMetadata, nrx nrxVar2) {
                    boolean z9 = false;
                    switch (i6) {
                        case 0:
                            eem eemVar2 = eemVar;
                            ntw.m17723i(shotMetadata, eem.m7217d(eemVar2.f13671r));
                            lku.m15613H(eemVar2.f13672s == 1);
                            boolean z10 = nrxVar2 == nrx.f44311d || nrxVar2 == nrx.f44313f;
                            boolean z11 = nrxVar2 == nrx.f44309b || nrxVar2 == nrx.f44310c;
                            boolean z12 = z10 || z11;
                            lku.m15670x(z12, "Final image callback only supports PixelFormat.{kRgb, kRgba, kNv12, or kNv21}");
                            if (z10) {
                                if (eemVar2.f13665l.m7238k().mo16813g() || eemVar2.f13665l.m7239l().mo16813g()) {
                                    z9 = true;
                                }
                                lku.m15614I(z9, "Got RGB image with no downstream callback present.");
                            }
                            if (z11) {
                                lku.m15614I(eemVar2.f13665l.m7241n().mo16813g(), "Got YUV image with no downstream callback present.");
                            }
                            if (!z10) {
                                if (z11) {
                                    ((edj) eemVar2.f13665l.m7241n().mo16809c()).mo7054a(eemVar2, eemVar2.f13663j.m17647a(), shotMetadata);
                                }
                            } else if (eemVar2.f13665l.m7238k().mo16813g()) {
                                nso nsoVar = (nso) eemVar2.f13662i;
                                edh edhVar = (edh) eemVar2.f13665l.m7238k().mo16809c();
                                lku.m15614I(nsoVar.f44422b, "doneWriting() must be called before getImage.");
                                edhVar.mo7055a(eemVar2, nsoVar.f44421a, shotMetadata);
                            } else if (eemVar2.f13665l.m7239l().mo16813g()) {
                                ((edb) eemVar2.f13665l.m7239l().mo16809c()).mo7172a(((nsm) eemVar2.f13662i).m17646a(), shotMetadata);
                            }
                            break;
                        default:
                            eem eemVar3 = eemVar;
                            ntw.m17723i(shotMetadata, eem.m7217d(eemVar3.f13671r));
                            lku.m15613H(eemVar3.f13672s == 1);
                            lku.m15669w(i7 != GcamModuleJNI.kInvalidShotId_get());
                            lku.m15669w(j3 != GcamModuleJNI.kInvalidAllocationId_get());
                            if (eemVar3.f13665l.m7234g().mo16813g()) {
                                nsl nslVar = (nsl) eemVar3.f13660g;
                                if (nslVar.f44411a != null && nslVar.f44412b == null) {
                                    z9 = true;
                                }
                                lku.m15614I(z9, "doneWriting() must be called before getImage.");
                                ((ecz) eemVar3.f13665l.m7234g().mo16809c()).mo7053o(eemVar3, nslVar.f44411a, shotMetadata);
                            } else if (eemVar3.f13665l.m7233f().mo16813g()) {
                                ((edb) eemVar3.f13665l.m7233f().mo16809c()).mo7172a(((nsm) eemVar3.f13660g).m17646a(), shotMetadata);
                            } else if (eemVar3.f13665l.m7235h().mo16813g()) {
                                ((edj) eemVar3.f13665l.m7235h().mo16809c()).mo7054a(eemVar3, eemVar3.f13661h.m17647a(), shotMetadata);
                            }
                            break;
                    }
                }
            }));
        }
        if (eemVar.f13665l.m7230c().mo16813g()) {
            ((NativeHdrPlusInterface) eemVar.f13659f).nativeSetMergedDngCallback(shotCallbacks.f8354a, new nsw(new nsw(eemVar, i5), i6));
        }
        if (eemVar.f13665l.m7237j().mo16813g()) {
            nsp nspVar2 = new nsp();
            ((NativeHdrPlusInterface) eemVar.f13659f).nativeSetMergedRawImageAllocator(shotCallbacks.f8354a, nspVar2);
            mav mavVar7 = eemVar.f13674u;
            final fya fyaVar2 = new fya(eemVar, nspVar2);
            ((NativeHdrPlusInterface) mavVar7.f39742a).nativeSetMergedRawImageCallback(shotCallbacks.f8354a, new MergedRawCallback(bArr, bArr) { // from class: nth
                @Override // com.google.googlex.gcam.hdrplus.MergedRawCallback
                public final void accept(int i7, long j3, long j4, long j5, int i8) {
                    fya fyaVar3 = this.f44474a;
                    ShotMetadata shotMetadata = new ShotMetadata(j4);
                    nrt nrtVar = new nrt(j5);
                    nrx.m17636a(i8);
                    Object obj3 = fyaVar3.f23858b;
                    Object obj4 = fyaVar3.f23857a;
                    eem eemVar2 = (eem) obj3;
                    ntw.m17723i(shotMetadata, eem.m7217d(eemVar2.f13671r));
                    lku.m15613H(eemVar2.f13672s == 1);
                    lku.m15614I(eemVar2.f13665l.m7237j().mo16813g(), YmzeHXaMYOLk.LaSFw);
                    if (j3 == GcamModuleJNI.kInvalidAllocationId_get()) {
                        ((edg) eemVar2.f13665l.m7237j().mo16809c()).mo7175b(new edc(kfv.m14168E("MergeRaw failed (shotId = %d)", Integer.valueOf(i7))));
                        return;
                    }
                    nsp nspVar3 = (nsp) obj4;
                    lku.m15614I(nspVar3.f44425b, DNTdN.NcWXtP);
                    ((edg) eemVar2.f13665l.m7237j().mo16809c()).mo7174a(eemVar2, nspVar3.f44424a, shotMetadata, nrtVar);
                }
            });
        }
        if (eemVar.f13665l.m7231d().mo16813g()) {
            mav mavVar8 = eemVar.f13674u;
            final AmbientMode.AmbientController ambientController4 = new AmbientMode.AmbientController(eemVar);
            ((NativeHdrPlusInterface) mavVar8.f39742a).nativeSetMutableMergedRawCallback(shotCallbacks.f8354a, new MutableMergedRawCallback(bArr, bArr, bArr) { // from class: ntc
                @Override // com.google.googlex.gcam.hdrplus.MutableMergedRawCallback
                public final void onImageView(int i7, long j3, long j4) {
                    AmbientMode.AmbientController ambientController5 = this.f44469a;
                    ShotMetadata shotMetadata = new ShotMetadata(j4);
                    eem eemVar2 = (eem) ambientController5.f1697a;
                    ntw.m17723i(shotMetadata, eem.m7217d(eemVar2.f13671r));
                    lku.m15613H(eemVar2.f13672s == 1);
                    lku.m15614I(eemVar2.f13665l.m7231d().mo16813g(), "Got mutable merged RAW callback but no callback present");
                    ((edd) eemVar2.f13665l.m7231d().mo16809c()).mo7173j(eemVar2, j3, shotMetadata);
                }
            });
        }
        if (eemVar.f13665l.m7232e().mo16813g()) {
            ((NativeHdrPlusInterface) eemVar.f13659f).nativeSetMergedPdAllocator(shotCallbacks.f8354a, eemVar.f13664k);
            ((NativeHdrPlusInterface) eemVar.f13659f).nativeSetMergedPdCallback(shotCallbacks.f8354a, new IntLongConsumer() { // from class: eei
                @Override // com.google.googlex.gcam.base.function.IntLongConsumer
                public final void accept(int i7, long j3) {
                    eem eemVar2 = eemVar;
                    lku.m15613H(eemVar2.f13672s == 1);
                    lku.m15614I(eemVar2.f13665l.m7232e().mo16813g(), "Got PD with no callback present");
                    if (j3 == GcamModuleJNI.kInvalidAllocationId_get()) {
                        ((nbe) ((nbe) eem.f13654a.m17252c()).mo17276G(1334)).mo17291p("MergePD failed (shotId = %d)", i7);
                        ((ede) eemVar2.f13665l.m7232e().mo16809c()).mo7061b(new edc(kfv.m14168E("MergePD failed (shotId = %d)", Integer.valueOf(i7))));
                    } else {
                        nsn nsnVar = eemVar2.f13664k;
                        lku.m15614I(nsnVar.f44419b, "doneWriting() must be called before getImage.");
                        ((ede) eemVar2.f13665l.m7232e().mo16809c()).mo7060a(nsnVar.f44418a);
                    }
                }
            });
        }
        if (this.f13404B.m7074f(this.f13436o)) {
            this.f13426d.mo13963g("slowRawSetup");
            mrmVarM8495b = ((fjp) this.f13442u).m8495b();
            if (mrmVarM8495b.mo16813g()) {
                glkVar2 = glkVar;
                r9 = glkVar2.f25502c;
                if (r9 != 0) {
                    jCurrentTimeMillis = r9.mo9898d();
                } else {
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
                if (((File) mrmVarM8495b.mo16809c()).getFreeSpace() <= 1073741824) {
                    this.f13421S.m6691f("Cache has less than 1GB free. Slowraw data may be silently deleted.");
                }
                if (z2) {
                    if (this.f13436o.equals(edk.PORTRAIT)) {
                    }
                    if (this.f13436o.equals(edk.PORTRAIT)) {
                    }
                    strM7072c = this.f13404B.m7072c((File) mrmVarM8495b.mo16809c(), jCurrentTimeMillis, "camera_" + (((this.f13436o.equals(edk.PORTRAIT) || !this.f13433l.mo6184l(dib.f11273ag)) && egmVar2.f13974b != egl.DEBLUR) ? this.f13427f : this.f13428g));
                    this.f13446y = strM7072c;
                    ImageSaverParams imageSaverParams3 = new ImageSaverParams();
                    imageSaverParams3.m4994b(strM7072c);
                    debugParams2 = new DebugParams();
                    debugParams2.m4920d(ebq.f13279e);
                    debugParams2.m4919c(imageSaverParams3);
                    if (!z2) {
                        r4.mo9897ac(new cwd(strM7072c));
                    }
                    debugParams = debugParams2;
                } else {
                    if (z2) {
                        strM7072c = this.f13404B.m7072c((File) mrmVarM8495b.mo16809c(), jCurrentTimeMillis, "");
                    } else {
                        strM7072c = this.f13404B.m7072c((File) mrmVarM8495b.mo16809c(), jCurrentTimeMillis, "");
                    }
                    this.f13446y = strM7072c;
                    ImageSaverParams imageSaverParams4 = new ImageSaverParams();
                    imageSaverParams4.m4994b(strM7072c);
                    debugParams2 = new DebugParams();
                    debugParams2.m4920d(ebq.f13279e);
                    debugParams2.m4919c(imageSaverParams4);
                    if (!z2) {
                        r4.mo9897ac(new cwd(strM7072c));
                    }
                    debugParams = debugParams2;
                }
            } else {
                glkVar2 = glkVar;
                debugParams = null;
            }
        } else {
            glkVar2 = glkVar;
            debugParams = null;
        }
        this.f13426d.mo13963g("getPrimaryOutputFormat");
        if (eeoVarM2623q.m7238k().mo16813g()) {
            nrxVar = ebq.f13276b;
        } else if (eeoVarM2623q.m7239l().mo16813g()) {
            nrxVar = ebq.f13277c;
        } else if (eeoVarM2623q.m7241n().mo16813g()) {
            nrxVar = ebq.f13278d;
        } else {
            nrxVar = nrx.f44308a;
        }
        this.f13426d.mo13963g("Gcam::StartShotCapture");
        GcamModuleJNI.ShotCallbacks_final_image_pixel_format_set(shotCallbacks.f8354a, shotCallbacks, nrxVar.f44321l);
        GcamModuleJNI.ShotCallbacks_postview_params_set(shotCallbacks.f8354a, shotCallbacks, postviewParams.f8341a, postviewParams);
        Gcam gcam3 = this.f13430i;
        iGcam_StartShotCapture = GcamModuleJNI.Gcam_StartShotCapture(gcam3.f8271a, gcam3, iMo7135b, shotParamsM7162K.f8358a, shotParamsM7162K, shotCallbacks.f8354a, shotCallbacks, DebugParams.m4917a(debugParams), debugParams);
        this.f13426d.mo13962f();
        if (iGcam_StartShotCapture == GcamModuleJNI.kInvalidShotId_get()) {
            if (this.f13447z != dja.RELEASE) {
                throw new IllegalArgumentException("Gcam::StartShotCapture() returned an invalid shot id.");
            }
            ((nbe) ((nbe) f13402e.m17251b()).mo17276G((char) 1293)).mo17293r("%s", "Gcam::StartShotCapture() returned an invalid shot id.");
            return null;
        }
        jvb jvbVar3 = ((fua) glkVar2.f25503d).f23578f;
        ebwVar = this.f13403A;
        oyoVar = new oyo(iGcam_StartShotCapture);
        synchronized (ebwVar.f13309a) {
            ebwVar.f13310b.add(oyoVar);
            jvbVar3.m13537d(new cic(ebwVar, oyoVar, 20, (byte[]) null, (byte[]) null, (byte[]) null));
            if (iGcam_StartShotCapture != GcamModuleJNI.kInvalidShotId_get()) {
                z7 = true;
            } else {
                z7 = false;
            }
            lku.m15669w(z7);
            if (eemVar.f13656c == GcamModuleJNI.kInvalidShotId_get()) {
                z8 = true;
            } else {
                z8 = false;
            }
            lku.m15613H(z8);
            eemVar.f13656c = iGcam_StartShotCapture;
            return eemVar;
        }
    }

    @Override // p000.ecq
    /* JADX INFO: renamed from: A */
    public final boolean mo7126A(kmg kmgVar, kpp kppVar, kpw kpwVar, kpw kpwVar2, kmg kmgVar2, kpp kppVar2, kpw kpwVar3) {
        this.f13426d.mo13961e("LiveTemporalBinning");
        GyroSampleVector gyroSampleVectorMo7142i = mo7142i(kppVar);
        this.f13426d.mo13961e("metadata");
        FrameMetadata frameMetadataM17683j = this.f13438q.m17683j(kppVar, gyroSampleVectorMo7142i, null, kmgVar);
        this.f13426d.mo13962f();
        RawWriteView rawWriteViewM17649b = this.f13439r.m17649b(kpwVar);
        RawWriteView rawWriteView = kpwVar2 == null ? new RawWriteView() : (RawWriteView) this.f13439r.m17648a(kpwVar2).mo16811e(new RawWriteView());
        drs drsVar = kpwVar2 != null ? new drs(kpwVar2, 20) : null;
        FrameMetadata frameMetadata = (kpwVar3 == null || kppVar2 == null) ? new FrameMetadata() : this.f13438q.m17683j(kppVar2, gyroSampleVectorMo7142i, null, kmgVar2);
        RawWriteView rawWriteViewM17649b2 = kpwVar3 != null ? this.f13439r.m17649b(kpwVar3) : new RawWriteView();
        drs drsVar2 = kpwVar3 != null ? new drs(kpwVar3, 20) : null;
        dhv dhvVar = this.f13433l;
        dhx dhxVar = did.f11416a;
        dhvVar.mo6175c();
        int iMo7134a = mo7134a(kmgVar);
        nsx nsxVar = this.f13431j;
        long jM4971a = Gcam.m4971a(this.f13430i);
        long jM4951b = FrameMetadata.m4951b(frameMetadataM17683j);
        long jM5092c = RawWriteView.m5092c(rawWriteViewM17649b);
        drs drsVar3 = new drs(kpwVar, 20);
        long jM5092c2 = RawWriteView.m5092c(rawWriteView);
        long jM4951b2 = FrameMetadata.m4951b(frameMetadata);
        long jM5092c3 = RawWriteView.m5092c(rawWriteViewM17649b2);
        ebv ebvVar = this.f13432k;
        boolean zNativeTemporallyBinViewfinderFrame = ((NativeHdrPlusInterface) nsxVar).nativeTemporallyBinViewfinderFrame(jM4971a, iMo7134a, jM4951b, jM5092c, drsVar3, jM5092c2, drsVar, jM4951b2, jM5092c3, drsVar2, false, !ebvVar.f13299a.mo6173a(did.f11459m).isPresent() ? -1 : ((Integer) ebvVar.f13299a.mo6173a(did.f11459m).get()).intValue());
        frameMetadataM17683j.toString();
        rawWriteViewM17649b.toString();
        rawWriteView.toString();
        frameMetadata.toString();
        rawWriteViewM17649b2.toString();
        this.f13426d.mo13962f();
        return zNativeTemporallyBinViewfinderFrame;
    }

    @Override // p000.ecq
    /* JADX INFO: renamed from: B */
    public final BurstSpec mo7127B(eem eemVar, kpw kpwVar, kpp kppVar, boolean z, Boolean bool, ebn ebnVar, Optional optional) throws kec {
        boolean z2;
        m7163L();
        this.f13426d.mo13961e("convertFrame");
        edl edlVarMo7138e = mo7138e(kpwVar, kppVar, eemVar.f13667n, this.f13441t);
        this.f13426d.mo13963g("setOptions");
        eba ebaVar = this.f13419Q;
        ebaVar.f13186a = z;
        ebaVar.f13187b = bool;
        ebaVar.f13188c = eemVar.m7220c();
        ShotParams shotParamsM7219b = eemVar.m7219b();
        ebaVar.f13189d = GcamModuleJNI.ShotParams_device_is_on_tripod_get(shotParamsM7219b.f8358a, shotParamsM7219b);
        Iterator it = this.f13406D.f13391b.values().iterator();
        while (it.hasNext()) {
            if (((Long) it.next()).longValue() >= eco.f13390a) {
                z2 = true;
                ebaVar.f13190e = z2;
                ebaVar.f13191f = ebnVar.f13257l;
                ebaVar.f13192g = optional;
                BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptionsM7037a = ebaVar.m7037a();
                this.f13426d.mo13963g("computeSpec");
                Gcam gcam = this.f13430i;
                int iM7218a = eemVar.m7218a();
                RawWriteView rawWriteView = edlVarMo7138e.f13495a;
                FrameMetadata frameMetadata = edlVarMo7138e.f13496b;
                SpatialGainMap spatialGainMap = edlVarMo7138e.f13497c;
                BurstSpec burstSpec = new BurstSpec(GcamModuleJNI.Gcam_BuildPayloadBurstSpec__SWIG_0(gcam.f8271a, gcam, iM7218a, rawWriteView.f8349a, rawWriteView, FrameMetadata.m4951b(frameMetadata), frameMetadata, spatialGainMap.f8362a, spatialGainMap, buildPayloadBurstSpecOptionsM7037a.f8232a, buildPayloadBurstSpecOptionsM7037a));
                this.f13426d.mo13962f();
                return burstSpec;
            }
        }
        z2 = false;
        ebaVar.f13190e = z2;
        ebaVar.f13191f = ebnVar.f13257l;
        ebaVar.f13192g = optional;
        BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptionsM7037a2 = ebaVar.m7037a();
        this.f13426d.mo13963g("computeSpec");
        Gcam gcam2 = this.f13430i;
        int iM7218a2 = eemVar.m7218a();
        RawWriteView rawWriteView2 = edlVarMo7138e.f13495a;
        FrameMetadata frameMetadata2 = edlVarMo7138e.f13496b;
        SpatialGainMap spatialGainMap2 = edlVarMo7138e.f13497c;
        BurstSpec burstSpec2 = new BurstSpec(GcamModuleJNI.Gcam_BuildPayloadBurstSpec__SWIG_0(gcam2.f8271a, gcam2, iM7218a2, rawWriteView2.f8349a, rawWriteView2, FrameMetadata.m4951b(frameMetadata2), frameMetadata2, spatialGainMap2.f8362a, spatialGainMap2, buildPayloadBurstSpecOptionsM7037a2.f8232a, buildPayloadBurstSpecOptionsM7037a2));
        this.f13426d.mo13962f();
        return burstSpec2;
    }

    @Override // p000.ecq
    /* JADX INFO: renamed from: C */
    public final void mo7128C(eem eemVar, kmg kmgVar, int i, kpp kppVar, nre nreVar, kpw kpwVar) {
        mo7148o(eemVar, kmgVar, i, kppVar, nreVar, kpwVar, null, mqu.f41450a);
    }

    @Override // p000.ecq
    /* JADX INFO: renamed from: D */
    public final Bitmap mo7129D(kmg kmgVar, kpw kpwVar, kpp kppVar, gcy gcyVar, boolean z, mrm mrmVar, mrm mrmVar2, mrm mrmVar3) {
        int iMo7136c = mo7136c(kppVar, kmgVar);
        StaticMetadata staticMetadataM4972b = this.f13430i.m4972b(iMo7136c);
        ShotParams shotParamsM7162K = m7162K(this.f13438q.m17678a(((Integer) ((jwf) this.f13435n).f34942d).intValue()), 0, gcyVar, iMo7136c, false, false, false, mqu.f41450a, z, false, false, m7160I(kppVar, kmgVar), -1L, egm.f13973a);
        this.f13438q.m17688u(kmgVar, shotParamsM7162K.m5110a(), kppVar, this.f13432k.f13305g, (kbc) mrmVar.mo16811e(this.f13441t));
        mrq mrqVar = (mrq) mrmVar;
        shotParamsM7162K.m5110a().m4893j(((kbc) mrqVar.f41482a).f35517a);
        shotParamsM7162K.m5110a().m4892i(((kbc) mrqVar.f41482a).f35518b);
        FrameMetadata frameMetadataMo7141h = mo7141h(kppVar, mo7142i(kppVar), kmgVar);
        RawWriteView rawWriteViewM17649b = this.f13439r.m17649b(kpwVar);
        SpatialGainMap spatialGainMapM17686o = this.f13438q.m17686o(kppVar);
        GenerateRgbImageOptions generateRgbImageOptions = new GenerateRgbImageOptions();
        GcamModuleJNI.GenerateRgbImageOptions_expected_number_of_frames_set(generateRgbImageOptions.f8273a, generateRgbImageOptions, ((Integer) ((mrq) mrmVar2).f41482a).intValue());
        GcamModuleJNI.GenerateRgbImageOptions_actual_number_of_frames_set(generateRgbImageOptions.f8273a, generateRgbImageOptions, ((Integer) ((mrq) mrmVar3).f41482a).intValue());
        dhv dhvVar = this.f13433l;
        dhx dhxVar = did.f11416a;
        dhvVar.mo6175c();
        GcamModuleJNI.GenerateRgbImageOptions_verbose_set(generateRgbImageOptions.f8273a, generateRgbImageOptions, false);
        InterleavedImageU8 interleavedImageU8 = new InterleavedImageU8(GcamModuleJNI.Gcam_GenerateRgbImage(StaticMetadata.m5118a(staticMetadataM4972b), staticMetadataM4972b, shotParamsM7162K.f8358a, shotParamsM7162K, FrameMetadata.m4951b(frameMetadataMo7141h), frameMetadataMo7141h, spatialGainMapM17686o.f8362a, spatialGainMapM17686o, RawWriteView.m5092c(rawWriteViewM17649b), rawWriteViewM17649b, ((InitParams) this.f13424V.f3652a).m4995a().f44219f, generateRgbImageOptions.f8273a, generateRgbImageOptions));
        if (interleavedImageU8.m5008h()) {
            return null;
        }
        return this.f13425W.m5654M(interleavedImageU8);
    }

    @Override // p000.ecq
    /* JADX INFO: renamed from: E */
    public final eem mo7130E(kmg kmgVar, gyu gyuVar, glk glkVar, PostviewParams postviewParams, gcy gcyVar, kpp kppVar) throws Throwable {
        ect ectVar;
        this.f13426d.mo13961e("HdrPlus#StartMomentsShotCapture");
        try {
            try {
                eem eemVarM7167P = m7167P(kmgVar, gyuVar, glkVar, postviewParams, gcyVar, kppVar, true, -1, -1, false, -1, true, mqu.f41450a, egm.f13973a);
                this.f13426d.mo13962f();
                return eemVarM7167P;
            } catch (Throwable th) {
                th = th;
                ectVar = this;
                ectVar.f13426d.mo13962f();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            ectVar = this;
        }
    }

    @Override // p000.ecq
    /* JADX INFO: renamed from: F */
    public final eem mo7131F(kmg kmgVar, glk glkVar, PostviewParams postviewParams, gcy gcyVar, kpp kppVar, egm egmVar) {
        return mo7132G(kmgVar, glkVar, postviewParams, gcyVar, kppVar, -1, false, -1, mqu.f41450a, egmVar);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [gyh, java.lang.Object] */
    @Override // p000.ecq
    /* JADX INFO: renamed from: G */
    public final eem mo7132G(kmg kmgVar, glk glkVar, PostviewParams postviewParams, gcy gcyVar, kpp kppVar, int i, boolean z, int i2, mrm mrmVar, egm egmVar) throws Throwable {
        ect ectVar;
        this.f13426d.mo13961e("HdrPlus#StartShotCapture");
        try {
            gyu gyuVarMo9902h = glkVar.f25502c.mo9902h();
            if (!z) {
                this.f13409G.mo7114g(gyuVarMo9902h);
            }
            try {
                eem eemVarM7167P = m7167P(kmgVar, gyuVarMo9902h, glkVar, postviewParams, gcyVar, kppVar, false, -1, i, z, i2, false, mrmVar, egmVar);
                this.f13426d.mo13962f();
                return eemVarM7167P;
            } catch (Throwable th) {
                th = th;
                ectVar = this;
                ectVar.f13426d.mo13962f();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            ectVar = this;
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [gyh, java.lang.Object] */
    @Override // p000.ecq
    /* JADX INFO: renamed from: H */
    public final eem mo7133H(kmg kmgVar, glk glkVar, PostviewParams postviewParams, gcy gcyVar, kpp kppVar, int i, int i2, boolean z, egm egmVar) throws Throwable {
        ect ectVar;
        this.f13426d.mo13961e("HdrPlus#StartZslShotCapture");
        try {
            gyu gyuVarMo9902h = glkVar.f25502c.mo9902h();
            if (!z) {
                this.f13409G.mo7114g(gyuVarMo9902h);
            }
            try {
                eem eemVarM7167P = m7167P(kmgVar, gyuVarMo9902h, glkVar, postviewParams, gcyVar, kppVar, true, i, i2, z, true != z ? -1 : 1, false, mqu.f41450a, egmVar);
                this.f13426d.mo13962f();
                return eemVarM7167P;
            } catch (Throwable th) {
                th = th;
                ectVar = this;
                ectVar.f13426d.mo13962f();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            ectVar = this;
        }
    }

    @Override // p000.ecq
    /* JADX INFO: renamed from: a */
    public final int mo7134a(kmg kmgVar) {
        return mo7135b(nta.m17668m(this.f13417O.mo13854a(kmgVar)));
    }

    @Override // p000.ecq
    /* JADX INFO: renamed from: b */
    public final int mo7135b(nse nseVar) {
        kpb kpbVar = this.f13414L;
        if (!kpbVar.f36776i && !kpbVar.f36782o) {
            lku.m15669w(this.f13430i.m4977g());
        }
        Gcam gcam = this.f13430i;
        int iGcam_FindFirstCamera = GcamModuleJNI.Gcam_FindFirstCamera(gcam.f8271a, gcam, nseVar.f44379q);
        lku.m15669w(iGcam_FindFirstCamera >= 0);
        return iGcam_FindFirstCamera;
    }

    @Override // p000.ecq
    /* JADX INFO: renamed from: c */
    public final int mo7136c(kpp kppVar, kmg kmgVar) {
        return mo7135b(this.f13438q.m17685n(kppVar, kmgVar));
    }

    @Override // p000.ecq
    /* JADX INFO: renamed from: d */
    public final ebv mo7137d() {
        return this.f13432k;
    }

    @Override // p000.ecq
    /* JADX INFO: renamed from: e */
    public final edl mo7138e(kpw kpwVar, kpp kppVar, boolean z, kbc kbcVar) {
        kpwVar.getClass();
        lku.m15613H(this.f13439r.m17651d(kpwVar.mo7245a()));
        RawWriteView rawWriteViewM17649b = this.f13439r.m17649b(kpwVar);
        GyroSampleVector gyroSampleVectorMo7142i = mo7142i(kppVar);
        String strE = kppVar.mo9518e();
        strE.getClass();
        kmg kmgVarM14575b = kmg.m14575b(strE);
        FrameMetadata frameMetadataMo7141h = mo7141h(kppVar, gyroSampleVectorMo7142i, kmgVarM14575b);
        SpatialGainMap spatialGainMapM17686o = this.f13438q.m17686o(kppVar);
        nta ntaVar = this.f13438q;
        Integer num = (Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION);
        num.getClass();
        edl edlVar = new edl(rawWriteViewM17649b, frameMetadataMo7141h, spatialGainMapM17686o, m7161J(ntaVar.m17678a(num.intValue()), z), frameMetadataMo7141h.m4952a() * GcamModuleJNI.FrameMetadata_actual_analog_gain_get(frameMetadataMo7141h.f8263a, frameMetadataMo7141h) * GcamModuleJNI.FrameMetadata_applied_digital_gain_get(frameMetadataMo7141h.f8263a, frameMetadataMo7141h) * GcamModuleJNI.FrameMetadata_post_raw_digital_gain_get(frameMetadataMo7141h.f8263a, frameMetadataMo7141h));
        this.f13438q.m17688u(kmgVarM14575b, edlVar.f13498d, kppVar, this.f13432k.f13305g, kbcVar);
        return edlVar;
    }

    @Override // p000.ecq
    /* JADX INFO: renamed from: f */
    public final AeResults mo7139f(edl edlVar) {
        AeShotParams aeShotParams = edlVar.f13498d;
        RawWriteView rawWriteView = edlVar.f13495a;
        FrameMetadata frameMetadata = edlVar.f13496b;
        SpatialGainMap spatialGainMap = edlVar.f13497c;
        int iMo7135b = mo7135b(frameMetadata.m4960j());
        StaticMetadata staticMetadataM4972b = this.f13430i.m4972b(iMo7135b);
        Tuning tuningM4973c = this.f13430i.m4973c(iMo7135b);
        return new AeResults(GcamModuleJNI.Gcam_ComputeAeResults(StaticMetadata.m5118a(staticMetadataM4972b), staticMetadataM4972b, tuningM4973c.f8376a, tuningM4973c, aeShotParams.f8226a, aeShotParams, rawWriteView.f8349a, rawWriteView, FrameMetadata.m4951b(frameMetadata), frameMetadata, spatialGainMap.f8362a, spatialGainMap, false), true);
    }

    @Override // p000.ecq
    /* JADX INFO: renamed from: g */
    public final BurstSpec mo7140g(eem eemVar, kpw kpwVar, kpp kppVar, mrm mrmVar) throws kec {
        m7163L();
        edl edlVarMo7138e = mo7138e(kpwVar, kppVar, eemVar.f13667n, this.f13441t);
        AfMetadata afMetadataM4955e = edlVarMo7138e.f13496b.m4955e();
        if (mrmVar.mo16813g()) {
            nrb.m17630a(GcamModuleJNI.AfMetadata_state_get(afMetadataM4955e.f8228a, afMetadataM4955e));
            kpl kplVar = (kpl) mrmVar.mo16809c();
            Integer num = (Integer) kplVar.mo9517d(CaptureResult.CONTROL_AF_MODE);
            if (num != null) {
                afMetadataM4955e.m4896b(nra.m17629a(num.intValue()));
            }
            Integer num2 = (Integer) kplVar.mo9517d(CaptureResult.CONTROL_AF_STATE);
            if (num2 != null) {
                afMetadataM4955e.m4897c(nrb.m17630a(num2.intValue()));
            }
            Integer num3 = (Integer) kplVar.mo9517d(CaptureResult.CONTROL_AF_TRIGGER);
            if (num3 != null) {
                afMetadataM4955e.m4898d(num3.intValue());
            }
        }
        Gcam gcam = this.f13430i;
        int iM7218a = eemVar.m7218a();
        RawWriteView rawWriteView = edlVarMo7138e.f13495a;
        FrameMetadata frameMetadata = edlVarMo7138e.f13496b;
        SpatialGainMap spatialGainMap = edlVarMo7138e.f13497c;
        return new BurstSpec(GcamModuleJNI.Gcam_BuildAfBurstSpec(gcam.f8271a, gcam, iM7218a, rawWriteView.f8349a, rawWriteView, FrameMetadata.m4951b(frameMetadata), frameMetadata, spatialGainMap.f8362a, spatialGainMap));
    }

    @Override // p000.ecq
    /* JADX INFO: renamed from: h */
    public final FrameMetadata mo7141h(kpp kppVar, GyroSampleVector gyroSampleVector, kmg kmgVar) {
        gth gthVarMo9759d;
        Long l = (Long) kppVar.mo9517d(CaptureResult.SENSOR_TIMESTAMP);
        HashMap map = null;
        if (l != null && (gthVarMo9759d = this.f13411I.mo9759d(l.longValue())) != null) {
            mrm mrmVar = gthVarMo9759d.f26354p;
            if (mrmVar.mo16813g() && ((gtt) mrmVar.mo16809c()).f26393a.length != 0) {
                map = new HashMap();
                for (gts gtsVar : ((gtt) gthVarMo9759d.f26354p.mo16809c()).f26393a) {
                    if (gtsVar.f26388c > 0.0f) {
                        map.put(Integer.valueOf((int) gtsVar.f26386a), Float.valueOf(gtsVar.f26388c));
                    }
                }
            }
        }
        if (!this.f13433l.mo6184l(did.f11413X)) {
            return this.f13438q.m17683j(kppVar, gyroSampleVector, map, kmgVar);
        }
        FrameMetadataKey frameMetadataKeyM17684k = this.f13438q.m17684k(kppVar, kmgVar);
        if (frameMetadataKeyM17684k == null) {
            return this.f13438q.m17683j(kppVar, gyroSampleVector, map, kmgVar);
        }
        FrameMetadata frameMetadata = new FrameMetadata();
        Gcam gcam = this.f13430i;
        return !GcamModuleJNI.Gcam_OverrideFrameMetadata(gcam.f8271a, gcam, frameMetadataKeyM17684k.f8265a, frameMetadataKeyM17684k, FrameMetadata.m4951b(frameMetadata), frameMetadata) ? this.f13438q.m17683j(kppVar, gyroSampleVector, map, kmgVar) : frameMetadata;
    }

    @Override // p000.ecq
    /* JADX INFO: renamed from: i */
    public final GyroSampleVector mo7142i(kpp kppVar) {
        try {
            Long l = (Long) kppVar.mo9517d(CaptureResult.SENSOR_EXPOSURE_TIME);
            l.getClass();
            long jLongValue = l.longValue();
            long jM17680d = this.f13438q.m17680d(kppVar);
            Long l2 = (Long) kppVar.mo9517d(CaptureResult.SENSOR_TIMESTAMP);
            l2.getClass();
            long jLongValue2 = l2.longValue();
            long j = jLongValue + jLongValue2 + jM17680d;
            GyroSampleVector gyroSampleVector = new GyroSampleVector();
            mrm mrmVar = (mrm) this.f13445x.get();
            if (mrmVar.mo16813g()) {
                knh knhVar = (knh) mrmVar.mo16809c();
                this.f13426d.mo13961e("gyro");
                knhVar.mo6999b(jLongValue2 - 5000000, j + 5000000, new eau(gyroSampleVector, 2));
                this.f13426d.mo13962f();
            }
            return gyroSampleVector;
        } catch (IllegalArgumentException e) {
            ((nbe) ((nbe) ((nbe) f13402e.m17251b()).mo17283h(e)).mo17276G(1299)).mo17293r("Unable to build GyroSampleVector %s", e);
            return null;
        }
    }

    @Override // p000.ecq
    /* JADX INFO: renamed from: j */
    public final PhysicalStabilityParams mo7143j(int i) {
        ecs ecsVar = (ecs) this.f13429h.get(Integer.valueOf(i));
        ecsVar.getClass();
        return ecsVar.f13398a;
    }

    @Override // p000.ecq
    /* JADX INFO: renamed from: k */
    public final PostShutterAfParams mo7144k(int i) {
        ecs ecsVar = (ecs) this.f13429h.get(Integer.valueOf(i));
        ecsVar.getClass();
        return ecsVar.f13399b;
    }

    @Override // p000.ecq
    /* JADX INFO: renamed from: l */
    public final nse mo7145l(kpp kppVar, kmg kmgVar) {
        return this.f13438q.m17685n(kppVar, kmgVar);
    }

    @Override // p000.ecq
    /* JADX INFO: renamed from: m */
    public final ViewfinderResults mo7146m(int i) {
        Gcam gcam = this.f13430i;
        return new ViewfinderResults(GcamModuleJNI.Gcam_GetLatestViewfinderResults(gcam.f8271a, gcam, i));
    }

    @Override // p000.ecq
    /* JADX INFO: renamed from: n */
    public final void mo7147n(eem eemVar) {
        int iM7218a = eemVar.m7218a();
        this.f13426d.mo13961e("AbortShot-" + iM7218a);
        Gcam gcam = this.f13430i;
        GcamModuleJNI.Gcam_AbortShot(gcam.f8271a, gcam, iM7218a);
        this.f13426d.mo13962f();
    }

    @Override // p000.ecq
    /* JADX INFO: renamed from: o */
    public final void mo7148o(eem eemVar, kmg kmgVar, int i, kpp kppVar, nre nreVar, kpw kpwVar, kpw kpwVar2, mrm mrmVar) {
        RawWriteView rawWriteView;
        long j;
        Runnable runnable;
        Runnable runnable2;
        RawWriteView rawWriteView2;
        drs drsVar;
        Runnable drsVar2;
        Runnable runnable3;
        this.f13426d.mo13961e("AddPayloadFrame");
        GyroSampleVector gyroSampleVectorMo7142i = mo7142i(kppVar);
        this.f13426d.mo13961e("metadata");
        FrameMetadata frameMetadata = new FrameMetadata();
        if (kppVar != null) {
            frameMetadata = mo7141h(kppVar, gyroSampleVectorMo7142i, kmgVar);
            GcamModuleJNI.FrameMetadata_burst_frame_type_set(frameMetadata.f8263a, frameMetadata, nreVar.f44171j);
            if (mrmVar.mo16813g()) {
                frameMetadata.m4959i().m5029c(((ecp) mrmVar.mo16809c()).f13392a);
                frameMetadata.m4959i().m5028b(((ecp) mrmVar.mo16809c()).f13393b);
                frameMetadata.m4959i().m5032f(((ecp) mrmVar.mo16809c()).f13392a);
                frameMetadata.m4959i().m5030d(((ecp) mrmVar.mo16809c()).f13393b);
            }
        }
        if (kpwVar != null && m7164M()) {
            String str = this.f13446y;
            str.getClass();
            nro nroVar = nro.f44263b;
            synchronized (ecb.f13333b) {
                ecb.f13332a.add(new eca(str, nroVar, i, kppVar));
            }
        }
        List list = eemVar.f13658e;
        Long l = (Long) kppVar.mo9517d(CaptureResult.SENSOR_TIMESTAMP);
        l.getClass();
        list.add(l);
        eemVar.f13657d.add(kppVar);
        SpatialGainMap spatialGainMapM17686o = this.f13438q.m17686o(kppVar);
        this.f13426d.mo13963g(rgoX.rWEqgjz);
        long aHardwareBufferPtr = 0;
        if (kpwVar != null) {
            rawWriteView = this.f13439r.m17649b(kpwVar);
            HardwareBuffer hardwareBufferMo7250f = kpwVar.mo7250f();
            if (hardwareBufferMo7250f != null) {
                aHardwareBufferPtr = AndroidJniUtils.getAHardwareBufferPtr(hardwareBufferMo7250f);
                nsy nsyVar = new nsy(kpwVar, hardwareBufferMo7250f);
                drsVar2 = nsyVar.f44460e;
                runnable3 = nsyVar.f44461f;
            } else {
                drsVar2 = new drs(kpwVar, 20);
                runnable3 = null;
            }
            j = aHardwareBufferPtr;
            runnable = drsVar2;
            runnable2 = runnable3;
        } else {
            rawWriteView = new RawWriteView();
            j = 0;
            runnable = null;
            runnable2 = null;
        }
        if (kpwVar2 != null) {
            mrm mrmVarM17648a = this.f13439r.m17648a(kpwVar2);
            if (mrmVarM17648a.mo16813g()) {
                rawWriteView2 = (RawWriteView) mrmVarM17648a.mo16809c();
                drsVar = new drs(kpwVar2, 20);
            } else {
                rawWriteView2 = new RawWriteView();
                drsVar = null;
            }
        } else {
            rawWriteView2 = new RawWriteView();
            drsVar = null;
        }
        this.f13426d.mo13963g("addPayloadFrame()");
        if (!((NativeHdrPlusInterface) this.f13431j).nativeAddPayloadFrame(Gcam.m4971a(this.f13430i), eemVar.m7218a(), FrameMetadata.m4951b(frameMetadata), spatialGainMapM17686o.f8362a, RawWriteView.m5092c(rawWriteView), runnable, RawWriteView.m5092c(rawWriteView2), drsVar, j, runnable2)) {
            ((nbe) ((nbe) f13402e.m17251b()).mo17276G(1300)).mo17294s("addPayloadFrame for shot %d failed, closing input images at frame index %d.", eemVar.m7218a(), i);
            if (kpwVar != null) {
                kpwVar.close();
            }
            if (kpwVar2 != null) {
                kpwVar2.close();
            }
        }
        this.f13426d.mo13962f();
        this.f13426d.mo13962f();
    }

    @Override // p000.ecq
    /* JADX INFO: renamed from: p */
    public final void mo7149p(kmg kmgVar, kpw kpwVar, kpp kppVar) {
        boolean zM7165N = m7165N();
        edl edlVarMo7138e = mo7138e(kpwVar, kppVar, zM7165N, this.f13441t);
        int iMo7136c = mo7136c(kppVar, kmgVar);
        ShotParams shotParamsM7162K = m7162K(((Integer) ((jwf) this.f13435n).f34942d).intValue(), 0, (gcy) this.f13418P.mo3831be(), mo7136c(kppVar, kmgVar), false, false, false, mqu.f41450a, zM7165N, false, false, m7160I(kppVar, kmgVar), -1L, egm.f13973a);
        this.f13438q.m17688u(kmgVar, shotParamsM7162K.m5110a(), kppVar, this.f13432k.f13305g, this.f13441t);
        ((NativeHdrPlusInterface) this.f13431j).nativeAddViewfinderFrame(Gcam.m4971a(this.f13430i), iMo7136c, FrameMetadata.m4951b(edlVarMo7138e.f13496b), edlVarMo7138e.f13497c.f8362a, shotParamsM7162K.f8358a, RawWriteView.m5092c(edlVarMo7138e.f13495a), new drs(kpwVar, 20));
    }

    @Override // p000.ecq
    /* JADX INFO: renamed from: q */
    public final void mo7150q(eem eemVar) {
        mo7151r(eemVar, new BurstSpec());
    }

    @Override // p000.ecq
    /* JADX INFO: renamed from: r */
    public final void mo7151r(eem eemVar, BurstSpec burstSpec) {
        this.f13426d.mo13961e("BeginPayloadFrames-" + eemVar.m7218a());
        Gcam gcam = this.f13430i;
        GcamModuleJNI.Gcam_BeginPayloadFrames(gcam.f8271a, gcam, eemVar.m7218a(), burstSpec.f8234a, burstSpec);
        this.f13426d.mo13962f();
    }

    @Override // p000.ecq
    /* JADX INFO: renamed from: s */
    public final void mo7152s(eem eemVar) {
        int iM7218a = eemVar.m7218a();
        Gcam gcam = this.f13430i;
        GcamModuleJNI.Gcam_EndZslPayloadFrames(gcam.f8271a, gcam, iM7218a);
    }

    @Override // p000.ecq
    /* JADX INFO: renamed from: t */
    public final void mo7153t(int i) {
        this.f13430i.m4975e(i);
    }

    @Override // p000.ecq
    /* JADX INFO: renamed from: u */
    public final void mo7154u(kmg kmgVar) {
        this.f13430i.m4975e(mo7134a(kmgVar));
    }

    @Override // p000.ecq
    /* JADX INFO: renamed from: v */
    public final void mo7155v(int i) {
        Gcam gcam = this.f13430i;
        GcamModuleJNI.Gcam_FlushViewfinder(gcam.f8271a, gcam, i);
    }

    @Override // p000.ecq
    /* JADX INFO: renamed from: w */
    public final boolean mo7156w(kpp kppVar, kmg kmgVar) throws IllegalAccessException, InvocationTargetException {
        kby kbyVar = new kby(this.f13426d, "HdrPlusSession#claimFrameForTemporalBinning");
        try {
            FrameMetadataKey frameMetadataKeyM17684k = this.f13438q.m17684k(kppVar, kmgVar);
            if (frameMetadataKeyM17684k == null) {
                kbyVar.close();
                return false;
            }
            Gcam gcam = this.f13430i;
            boolean zGcam_ClaimFrameForBinning = GcamModuleJNI.Gcam_ClaimFrameForBinning(gcam.f8271a, gcam, frameMetadataKeyM17684k.f8265a, frameMetadataKeyM17684k);
            kbyVar.close();
            return zGcam_ClaimFrameForBinning;
        } catch (Throwable th) {
            try {
                kbyVar.close();
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }

    @Override // p000.ecq
    /* JADX INFO: renamed from: x */
    public final boolean mo7157x(eem eemVar) {
        ClientShotMetadata clientShotMetadata;
        int iM7218a = eemVar.m7218a();
        this.f13426d.mo13961e("EndPayloadFrames-" + iM7218a);
        ClientShotMetadata clientShotMetadata2 = null;
        if (((fua) eemVar.f13675v.f25503d).f23580h) {
            this.f13426d.mo13961e("location");
            try {
                mrm mrmVarMo8118e = ((fca) this.f13434m.get()).mo8118e();
                if (mrmVarMo8118e.mo16813g()) {
                    Location location = (Location) mrmVarMo8118e.mo16809c();
                    LocationData locationData = new LocationData();
                    locationData.m5034b(location.getAltitude());
                    locationData.m5035c(location.getAccuracy());
                    locationData.m5036d(location.getLatitude());
                    locationData.m5037e(location.getLongitude());
                    locationData.m5039g(location.getTime() / 1000);
                    String provider = location.getProvider();
                    if (provider != null) {
                        locationData.m5038f(provider);
                    }
                    ClientShotMetadata clientShotMetadata3 = new ClientShotMetadata();
                    clientShotMetadata3.m4915c(locationData);
                    clientShotMetadata2 = clientShotMetadata3;
                }
                this.f13426d.mo13962f();
                clientShotMetadata = clientShotMetadata2;
            } finally {
                this.f13426d.mo13962f();
            }
        } else {
            clientShotMetadata = null;
        }
        Gcam gcam = this.f13430i;
        boolean zGcam_EndPayloadFrames = GcamModuleJNI.Gcam_EndPayloadFrames(gcam.f8271a, gcam, iM7218a, ClientShotMetadata.m4913a(clientShotMetadata), clientShotMetadata);
        if (!zGcam_EndPayloadFrames) {
            ((nbe) ((nbe) f13402e.m17251b()).mo17276G((char) 1306)).mo17290o("EndPayloadFrames() failed.");
        }
        if (m7164M()) {
            this.f13410H.execute(new efd(this, 1));
        }
        return zGcam_EndPayloadFrames;
    }

    @Override // p000.ecq
    /* JADX INFO: renamed from: y */
    public final boolean mo7158y(eem eemVar) {
        int iM7218a = eemVar.m7218a();
        this.f13426d.mo13961e("EndShotCapture-" + iM7218a);
        Gcam gcam = this.f13430i;
        boolean zGcam_EndShotCapture = GcamModuleJNI.Gcam_EndShotCapture(gcam.f8271a, gcam, iM7218a);
        this.f13426d.mo13962f();
        return zGcam_EndShotCapture;
    }

    @Override // p000.ecq
    /* JADX INFO: renamed from: z */
    public final boolean mo7159z(kpp kppVar, kmg kmgVar) throws IllegalAccessException, InvocationTargetException {
        kby kbyVar = new kby(this.f13426d, "HdrPlusSession#lockFrameFromFutureBinning");
        try {
            FrameMetadataKey frameMetadataKeyM17684k = this.f13438q.m17684k(kppVar, kmgVar);
            if (frameMetadataKeyM17684k == null) {
                kbyVar.close();
                return false;
            }
            Gcam gcam = this.f13430i;
            boolean zGcam_LockFrameFromFutureBinning = GcamModuleJNI.Gcam_LockFrameFromFutureBinning(gcam.f8271a, gcam, frameMetadataKeyM17684k.f8265a, frameMetadataKeyM17684k);
            kbyVar.close();
            return zGcam_LockFrameFromFutureBinning;
        } catch (Throwable th) {
            try {
                kbyVar.close();
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }
}
