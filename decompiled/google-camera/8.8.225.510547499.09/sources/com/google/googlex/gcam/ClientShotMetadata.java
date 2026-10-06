package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ClientShotMetadata {

    /* JADX INFO: renamed from: a */
    protected transient boolean f8236a;

    /* JADX INFO: renamed from: b */
    private transient long f8237b;

    public ClientShotMetadata() {
        long jNew_ClientShotMetadata = GcamModuleJNI.new_ClientShotMetadata();
        this.f8236a = true;
        this.f8237b = jNew_ClientShotMetadata;
    }

    /* JADX INFO: renamed from: a */
    public static long m4913a(ClientShotMetadata clientShotMetadata) {
        if (clientShotMetadata == null) {
            return 0L;
        }
        return clientShotMetadata.f8237b;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m4914b() {
        long j = this.f8237b;
        if (j != 0) {
            if (this.f8236a) {
                this.f8236a = false;
                GcamModuleJNI.delete_ClientShotMetadata(j);
            }
            this.f8237b = 0L;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4915c(LocationData locationData) {
        GcamModuleJNI.ClientShotMetadata_location_set(this.f8237b, this, locationData.f8313a, locationData);
    }

    protected final void finalize() {
        m4914b();
    }
}
