package p073df;

import com.google.firebase.installations.local.C3220a;
import com.google.firebase.installations.local.PersistedInstallation;
import p136gc.C5752h;

/* JADX INFO: renamed from: df.f */
/* JADX INFO: loaded from: classes.dex */
public final class C5164f implements InterfaceC5167i {

    /* JADX INFO: renamed from: a */
    public final C5752h<String> f33164a;

    public C5164f(C5752h<String> c5752h) {
        this.f33164a = c5752h;
    }

    @Override // p073df.InterfaceC5167i
    /* JADX INFO: renamed from: a */
    public final boolean mo10941a(C3220a c3220a) {
        if (!(c3220a.mo9206f() == PersistedInstallation.RegistrationStatus.UNREGISTERED)) {
            if (!(c3220a.mo9206f() == PersistedInstallation.RegistrationStatus.REGISTERED)) {
                if (!(c3220a.mo9206f() == PersistedInstallation.RegistrationStatus.REGISTER_ERROR)) {
                    return false;
                }
            }
        }
        this.f33164a.m12116d(c3220a.f16269b);
        return true;
    }

    @Override // p073df.InterfaceC5167i
    /* JADX INFO: renamed from: b */
    public final boolean mo10942b(Exception exc) {
        return false;
    }
}
