package p000;

import com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus;

/* JADX INFO: loaded from: classes.dex */
public final class gm3 implements mh9 {

    /* JADX INFO: renamed from: a */
    public final wr9 f41005a;

    public gm3(wr9 wr9Var) {
        this.f41005a = wr9Var;
    }

    @Override // p000.mh9
    /* JADX INFO: renamed from: a */
    public final boolean mo12748a(Exception exc) {
        return false;
    }

    @Override // p000.mh9
    /* JADX INFO: renamed from: b */
    public final boolean mo12749b(c50 c50Var) {
        PersistedInstallation$RegistrationStatus persistedInstallation$RegistrationStatus = c50Var.f9503b;
        if (persistedInstallation$RegistrationStatus != PersistedInstallation$RegistrationStatus.UNREGISTERED && persistedInstallation$RegistrationStatus != PersistedInstallation$RegistrationStatus.REGISTERED && persistedInstallation$RegistrationStatus != PersistedInstallation$RegistrationStatus.REGISTER_ERROR) {
            return false;
        }
        this.f41005a.m24140d(c50Var.f9502a);
        return true;
    }
}
