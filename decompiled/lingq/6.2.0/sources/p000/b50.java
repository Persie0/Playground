package p000;

import com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus;

/* JADX INFO: loaded from: classes.dex */
public final class b50 {

    /* JADX INFO: renamed from: a */
    public String f7945a;

    /* JADX INFO: renamed from: b */
    public PersistedInstallation$RegistrationStatus f7946b;

    /* JADX INFO: renamed from: c */
    public String f7947c;

    /* JADX INFO: renamed from: d */
    public String f7948d;

    /* JADX INFO: renamed from: e */
    public long f7949e;

    /* JADX INFO: renamed from: f */
    public long f7950f;

    /* JADX INFO: renamed from: g */
    public String f7951g;

    /* JADX INFO: renamed from: h */
    public byte f7952h;

    /* JADX INFO: renamed from: a */
    public final c50 m3298a() {
        if (this.f7952h == 3 && this.f7946b != null) {
            return new c50(this.f7945a, this.f7946b, this.f7947c, this.f7948d, this.f7949e, this.f7950f, this.f7951g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f7946b == null) {
            sb.append(" registrationStatus");
        }
        if ((this.f7952h & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((this.f7952h & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        C3386nv.m17633t(wq1.m24120p("Missing required properties:", sb));
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m3299b(PersistedInstallation$RegistrationStatus persistedInstallation$RegistrationStatus) {
        if (persistedInstallation$RegistrationStatus != null) {
            this.f7946b = persistedInstallation$RegistrationStatus;
        } else {
            C3386nv.m17635v("Null registrationStatus");
        }
    }
}
