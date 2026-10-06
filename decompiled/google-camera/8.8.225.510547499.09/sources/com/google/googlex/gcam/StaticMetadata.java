package com.google.googlex.gcam;

import p000.nrp;
import p000.nse;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class StaticMetadata {

    /* JADX INFO: renamed from: a */
    public transient long f8364a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8365b;

    public StaticMetadata() {
        this(GcamModuleJNI.new_StaticMetadata__SWIG_0(), true);
    }

    public StaticMetadata(long j, boolean z) {
        this.f8365b = z;
        this.f8364a = j;
    }

    /* JADX INFO: renamed from: a */
    public static long m5118a(StaticMetadata staticMetadata) {
        if (staticMetadata == null) {
            return 0L;
        }
        return staticMetadata.f8364a;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    /* JADX WARN: Code duplicated, block: B:15:0x0022 A[LOOP:0: B:10:0x0017->B:15:0x0022, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0025 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0021 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public final nrp m5119b() {
        nrp[] nrpVarArr;
        nrp nrpVar;
        int iStaticMetadata_lens_facing_get = GcamModuleJNI.StaticMetadata_lens_facing_get(this.f8364a, this);
        nrp[] nrpVarArr2 = nrp.f44271e;
        int i = 0;
        if (iStaticMetadata_lens_facing_get >= 4 || iStaticMetadata_lens_facing_get < 0) {
            while (true) {
                nrpVarArr = nrp.f44271e;
                if (i < 4) {
                    throw new IllegalArgumentException("No enum " + nrp.class.toString() + " with value " + iStaticMetadata_lens_facing_get);
                }
                nrpVar = nrpVarArr[i];
                if (nrpVar.f44272f == iStaticMetadata_lens_facing_get) {
                    i++;
                }
            }
        } else {
            nrpVar = nrpVarArr2[iStaticMetadata_lens_facing_get];
            if (nrpVar.f44272f != iStaticMetadata_lens_facing_get) {
                while (true) {
                    nrpVarArr = nrp.f44271e;
                    if (i < 4) {
                        throw new IllegalArgumentException("No enum " + nrp.class.toString() + " with value " + iStaticMetadata_lens_facing_get);
                    }
                    nrpVar = nrpVarArr[i];
                    if (nrpVar.f44272f == iStaticMetadata_lens_facing_get) {
                        i++;
                    }
                }
            }
        }
        return nrpVar;
    }

    /* JADX INFO: renamed from: c */
    public final PixelRect m5120c() {
        long jStaticMetadata_active_area_get = GcamModuleJNI.StaticMetadata_active_area_get(this.f8364a, this);
        if (jStaticMetadata_active_area_get == 0) {
            return null;
        }
        return new PixelRect(jStaticMetadata_active_area_get, false);
    }

    /* JADX INFO: renamed from: d */
    public final nse m5121d() {
        return nse.m17643a(GcamModuleJNI.StaticMetadata_sensor_id_get(this.f8364a, this));
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m5122e() {
        long j = this.f8364a;
        if (j != 0) {
            if (this.f8365b) {
                this.f8365b = false;
                GcamModuleJNI.delete_StaticMetadata(j);
            }
            this.f8364a = 0L;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m5123f(int i) {
        GcamModuleJNI.StaticMetadata_frame_raw_max_height_set(this.f8364a, this, i);
    }

    protected final void finalize() {
        m5122e();
    }

    /* JADX INFO: renamed from: g */
    public final void m5124g(nse nseVar) {
        GcamModuleJNI.StaticMetadata_sensor_id_set(this.f8364a, this, nseVar.f44379q);
    }
}
