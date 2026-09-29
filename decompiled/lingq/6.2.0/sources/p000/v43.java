package p000;

import android.text.TextUtils;
import com.google.firebase.installations.C1154a;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v43 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64834a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1154a f64835b;

    public /* synthetic */ v43(C1154a c1154a, int i) {
        this.f64834a = i;
        this.f64835b = c1154a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c50 c50VarM12093H;
        c50 c50VarM6701g;
        int i = this.f64834a;
        C1154a c1154a = this.f64835b;
        switch (i) {
            case 0:
                c1154a.m6695a();
                return;
            case 1:
                c1154a.m6695a();
                return;
            default:
                Object obj = C1154a.f13703m;
                synchronized (obj) {
                    try {
                        q43 q43Var = c1154a.f13704a;
                        q43Var.m19644a();
                        b64 b64VarM3348b = b64.m3348b(q43Var.f57252a);
                        try {
                            c50VarM12093H = c1154a.f13706c.m12093H();
                            if (b64VarM3348b != null) {
                                b64VarM3348b.m3368u();
                            }
                        } catch (Throwable th) {
                            if (b64VarM3348b != null) {
                                b64VarM3348b.m3368u();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    PersistedInstallation$RegistrationStatus persistedInstallation$RegistrationStatus = c50VarM12093H.f9503b;
                    PersistedInstallation$RegistrationStatus persistedInstallation$RegistrationStatus2 = PersistedInstallation$RegistrationStatus.REGISTER_ERROR;
                    if (persistedInstallation$RegistrationStatus == persistedInstallation$RegistrationStatus2) {
                        c50VarM6701g = c1154a.m6701g(c50VarM12093H);
                    } else {
                        if (persistedInstallation$RegistrationStatus == PersistedInstallation$RegistrationStatus.UNREGISTERED) {
                            c50VarM6701g = c1154a.m6701g(c50VarM12093H);
                        } else if (!c1154a.f13707d.m14039a(c50VarM12093H)) {
                            return;
                        } else {
                            c50VarM6701g = c1154a.m6696b(c50VarM12093H);
                        }
                    }
                    synchronized (obj) {
                        try {
                            q43 q43Var2 = c1154a.f13704a;
                            q43Var2.m19644a();
                            b64 b64VarM3348b2 = b64.m3348b(q43Var2.f57252a);
                            try {
                                c1154a.f13706c.m12118y(c50VarM6701g);
                                if (b64VarM3348b2 != null) {
                                    b64VarM3348b2.m3368u();
                                }
                            } catch (Throwable th3) {
                                if (b64VarM3348b2 != null) {
                                    b64VarM3348b2.m3368u();
                                }
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    synchronized (c1154a) {
                        try {
                            if (c1154a.f13714k.size() != 0 && !TextUtils.equals(c50VarM12093H.f9502a, c50VarM6701g.f9502a)) {
                                Iterator it = c1154a.f13714k.iterator();
                                if (it.hasNext()) {
                                    if (it.next() != null) {
                                        throw new ClassCastException();
                                    }
                                    throw null;
                                }
                            }
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                    if (c50VarM6701g.f9503b == PersistedInstallation$RegistrationStatus.REGISTERED) {
                        String str = c50VarM6701g.f9502a;
                        synchronized (c1154a) {
                            c1154a.f13713j = str;
                        }
                    }
                    PersistedInstallation$RegistrationStatus persistedInstallation$RegistrationStatus3 = c50VarM6701g.f9503b;
                    if (persistedInstallation$RegistrationStatus3 == persistedInstallation$RegistrationStatus2) {
                        FirebaseInstallationsException.Status status = FirebaseInstallationsException.Status.BAD_CONFIG;
                        c1154a.m6702h(new FirebaseInstallationsException());
                        return;
                    } else if (persistedInstallation$RegistrationStatus3 == PersistedInstallation$RegistrationStatus.NOT_GENERATED || persistedInstallation$RegistrationStatus3 == PersistedInstallation$RegistrationStatus.ATTEMPT_MIGRATION) {
                        c1154a.m6702h(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        c1154a.m6703i(c50VarM6701g);
                        return;
                    }
                } catch (FirebaseInstallationsException e) {
                    c1154a.m6702h(e);
                    return;
                }
        }
    }
}
