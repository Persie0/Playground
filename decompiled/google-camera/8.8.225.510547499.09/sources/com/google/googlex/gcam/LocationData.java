package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class LocationData {

    /* JADX INFO: renamed from: a */
    public transient long f8313a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8314b;

    public LocationData() {
        long jNew_LocationData = GcamModuleJNI.new_LocationData();
        this.f8314b = true;
        this.f8313a = jNew_LocationData;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5033a() {
        long j = this.f8313a;
        if (j != 0) {
            if (this.f8314b) {
                this.f8314b = false;
                GcamModuleJNI.delete_LocationData(j);
            }
            this.f8313a = 0L;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5034b(double d) {
        GcamModuleJNI.LocationData_altitude_set(this.f8313a, this, d);
    }

    /* JADX INFO: renamed from: c */
    public final void m5035c(double d) {
        GcamModuleJNI.LocationData_degree_of_precision_set(this.f8313a, this, d);
    }

    /* JADX INFO: renamed from: d */
    public final void m5036d(double d) {
        GcamModuleJNI.LocationData_latitude_set(this.f8313a, this, d);
    }

    /* JADX INFO: renamed from: e */
    public final void m5037e(double d) {
        GcamModuleJNI.LocationData_longitude_set(this.f8313a, this, d);
    }

    /* JADX INFO: renamed from: f */
    public final void m5038f(String str) {
        GcamModuleJNI.LocationData_processing_method_set(this.f8313a, this, str);
    }

    protected final void finalize() {
        m5033a();
    }

    /* JADX INFO: renamed from: g */
    public final void m5039g(long j) {
        GcamModuleJNI.LocationData_timestamp_unix_set(this.f8313a, this, j);
    }
}
