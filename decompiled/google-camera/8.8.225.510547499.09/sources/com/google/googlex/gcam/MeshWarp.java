package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class MeshWarp {

    /* JADX INFO: renamed from: a */
    public transient long f8318a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8319b;

    public MeshWarp() {
        this(GcamModuleJNI.new_MeshWarp(), true);
    }

    public MeshWarp(long j, boolean z) {
        this.f8319b = z;
        this.f8318a = j;
    }

    /* JADX INFO: renamed from: a */
    public final int m5044a() {
        return GcamModuleJNI.MeshWarp_grid_cols_get(this.f8318a, this);
    }

    /* JADX INFO: renamed from: b */
    public final int m5045b() {
        return GcamModuleJNI.MeshWarp_grid_rows_get(this.f8318a, this);
    }

    /* JADX INFO: renamed from: c */
    public final FloatVector m5046c() {
        long jMeshWarp_mesh_warp_data_get = GcamModuleJNI.MeshWarp_mesh_warp_data_get(this.f8318a, this);
        if (jMeshWarp_mesh_warp_data_get == 0) {
            return null;
        }
        return new FloatVector(jMeshWarp_mesh_warp_data_get, false);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m5047d() {
        long j = this.f8318a;
        if (j != 0) {
            if (this.f8319b) {
                this.f8319b = false;
                GcamModuleJNI.delete_MeshWarp(j);
            }
            this.f8318a = 0L;
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m5048e() {
        return GcamModuleJNI.MeshWarp_is_forward_mesh_get(this.f8318a, this);
    }

    protected final void finalize() {
        m5047d();
    }
}
