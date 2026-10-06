package com.google.googlex.gcam;

import p000.nrj;
import p000.nse;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class FrameMetadata {

    /* JADX INFO: renamed from: a */
    public transient long f8263a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8264b;

    public FrameMetadata() {
        this(GcamModuleJNI.new_FrameMetadata(), true);
    }

    public FrameMetadata(long j, boolean z) {
        this.f8264b = z;
        this.f8263a = j;
    }

    /* JADX INFO: renamed from: b */
    public static long m4951b(FrameMetadata frameMetadata) {
        if (frameMetadata == null) {
            return 0L;
        }
        return frameMetadata.f8263a;
    }

    /* JADX INFO: renamed from: a */
    public final float m4952a() {
        return GcamModuleJNI.FrameMetadata_actual_exposure_time_ms_get(this.f8263a, this);
    }

    /* JADX INFO: renamed from: c */
    public final long m4953c() {
        return GcamModuleJNI.FrameMetadata_timestamp_ns_get(this.f8263a, this);
    }

    /* JADX INFO: renamed from: d */
    public final AeMetadata m4954d() {
        long jFrameMetadata_ae_get = GcamModuleJNI.FrameMetadata_ae_get(this.f8263a, this);
        if (jFrameMetadata_ae_get == 0) {
            return null;
        }
        return new AeMetadata(jFrameMetadata_ae_get);
    }

    /* JADX INFO: renamed from: e */
    public final AfMetadata m4955e() {
        long jFrameMetadata_af_get = GcamModuleJNI.FrameMetadata_af_get(this.f8263a, this);
        if (jFrameMetadata_af_get == 0) {
            return null;
        }
        return new AfMetadata(jFrameMetadata_af_get);
    }

    /* JADX INFO: renamed from: f */
    public final AwbMetadata m4956f() {
        long jFrameMetadata_awb_get = GcamModuleJNI.FrameMetadata_awb_get(this.f8263a, this);
        if (jFrameMetadata_awb_get == 0) {
            return null;
        }
        return new AwbMetadata(jFrameMetadata_awb_get);
    }

    protected final void finalize() {
        m4961k();
    }

    /* JADX INFO: renamed from: g */
    public final FaceInfoVector m4957g() {
        long jFrameMetadata_faces_get = GcamModuleJNI.FrameMetadata_faces_get(this.f8263a, this);
        if (jFrameMetadata_faces_get == 0) {
            return null;
        }
        return new FaceInfoVector(jFrameMetadata_faces_get, false);
    }

    /* JADX INFO: renamed from: h */
    public final HalAfMetadata m4958h() {
        long jFrameMetadata_hal_af_metadata_get = GcamModuleJNI.FrameMetadata_hal_af_metadata_get(this.f8263a, this);
        if (jFrameMetadata_hal_af_metadata_get == 0) {
            return null;
        }
        return new HalAfMetadata(jFrameMetadata_hal_af_metadata_get, false);
    }

    /* JADX INFO: renamed from: i */
    public final LiveHdrMetadata m4959i() {
        long jFrameMetadata_live_hdr_get = GcamModuleJNI.FrameMetadata_live_hdr_get(this.f8263a, this);
        if (jFrameMetadata_live_hdr_get == 0) {
            return null;
        }
        return new LiveHdrMetadata(jFrameMetadata_live_hdr_get, false);
    }

    /* JADX INFO: renamed from: j */
    public final nse m4960j() {
        return nse.m17643a(GcamModuleJNI.FrameMetadata_sensor_id_get(this.f8263a, this));
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m4961k() {
        long j = this.f8263a;
        if (j != 0) {
            if (this.f8264b) {
                this.f8264b = false;
                GcamModuleJNI.delete_FrameMetadata(j);
            }
            this.f8263a = 0L;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m4962l(FloatArray4 floatArray4) {
        GcamModuleJNI.FrameMetadata_black_levels_bayer_set(this.f8263a, this, floatArray4.f8255a, floatArray4);
    }

    /* JADX INFO: renamed from: m */
    public final void m4963m(nrj nrjVar) {
        GcamModuleJNI.FrameMetadata_flash_set(this.f8263a, this, nrjVar.f44224c);
    }
}
