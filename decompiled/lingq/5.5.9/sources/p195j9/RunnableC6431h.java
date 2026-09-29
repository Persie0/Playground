package p195j9;

import ae.C0065e;
import android.text.TextUtils;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.audio.InterfaceC2368b;
import com.google.firebase.installations.C3219a;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.local.C3220a;
import com.google.firebase.installations.local.PersistedInstallation;
import java.io.IOException;
import java.util.Iterator;
import p094ef.InterfaceC5402a;
import p290o6.C7968m;
import p479xa.C10134c0;

/* JADX INFO: renamed from: j9.h */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC6431h implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36927a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f36928b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f36929c;

    public /* synthetic */ RunnableC6431h(int i10, Object obj, boolean z10) {
        this.f36927a = i10;
        this.f36929c = obj;
        this.f36928b = z10;
    }

    /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
    @Override // java.lang.Runnable
    public final void run() {
        C3220a c3220aM9200c;
        C3220a c3220aM9195f;
        switch (this.f36927a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                InterfaceC2368b.a aVar = (InterfaceC2368b.a) this.f36929c;
                aVar.getClass();
                int i10 = C10134c0.f51354a;
                aVar.f11946b.mo6844k(this.f36928b);
                return;
            default:
                C3219a c3219a = (C3219a) this.f36929c;
                boolean z10 = this.f36928b;
                Object obj = C3219a.f16252m;
                c3219a.getClass();
                Object obj2 = C3219a.f16252m;
                synchronized (obj2) {
                    C0065e c0065e = c3219a.f16253a;
                    c0065e.m437a();
                    C7968m c7968mM15816d = C7968m.m15816d(c0065e.f171a);
                    try {
                        c3220aM9200c = c3219a.f16255c.m9200c();
                        if (c7968mM15816d != null) {
                            c7968mM15816d.m15818f();
                        }
                    } catch (Throwable th2) {
                        if (c7968mM15816d != null) {
                            c7968mM15816d.m15818f();
                        }
                        throw th2;
                    }
                }
                try {
                    boolean z11 = true;
                    if (c3220aM9200c.mo9206f() == PersistedInstallation.RegistrationStatus.REGISTER_ERROR) {
                        c3220aM9195f = c3219a.m9195f(c3220aM9200c);
                    } else {
                        if (c3220aM9200c.mo9206f() == PersistedInstallation.RegistrationStatus.UNREGISTERED) {
                            c3220aM9195f = c3219a.m9195f(c3220aM9200c);
                        } else {
                            if (!z10 && !c3219a.f16256d.m10944a(c3220aM9200c)) {
                                return;
                            }
                            c3220aM9195f = c3219a.m9192c(c3220aM9200c);
                        }
                    }
                    synchronized (obj2) {
                        C0065e c0065e2 = c3219a.f16253a;
                        c0065e2.m437a();
                        C7968m c7968mM15816d2 = C7968m.m15816d(c0065e2.f171a);
                        try {
                            c3219a.f16255c.m9199b(c3220aM9195f);
                            if (c7968mM15816d2 != null) {
                                c7968mM15816d2.m15818f();
                            }
                        } catch (Throwable th3) {
                            if (c7968mM15816d2 != null) {
                                c7968mM15816d2.m15818f();
                            }
                            throw th3;
                        }
                    }
                    synchronized (c3219a) {
                        if (c3219a.f16263k.size() != 0 && !TextUtils.equals(c3220aM9200c.f16269b, c3220aM9195f.f16269b)) {
                            Iterator it = c3219a.f16263k.iterator();
                            while (it.hasNext()) {
                                ((InterfaceC5402a) it.next()).m11563a();
                            }
                        }
                    }
                    if (c3220aM9195f.mo9206f() == PersistedInstallation.RegistrationStatus.REGISTERED) {
                        String str = c3220aM9195f.f16269b;
                        synchronized (c3219a) {
                            c3219a.f16262j = str;
                        }
                    }
                    if (c3220aM9195f.mo9206f() == PersistedInstallation.RegistrationStatus.REGISTER_ERROR) {
                        FirebaseInstallationsException.Status status = FirebaseInstallationsException.Status.BAD_CONFIG;
                        c3219a.m9196g(new FirebaseInstallationsException());
                        return;
                    }
                    PersistedInstallation.RegistrationStatus registrationStatus = PersistedInstallation.RegistrationStatus.NOT_GENERATED;
                    PersistedInstallation.RegistrationStatus registrationStatus2 = c3220aM9195f.f16270c;
                    if (registrationStatus2 != registrationStatus) {
                        z11 = registrationStatus2 == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION;
                    }
                    if (z11) {
                        c3219a.m9196g(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        c3219a.m9197h(c3220aM9195f);
                        return;
                    }
                } catch (FirebaseInstallationsException e10) {
                    c3219a.m9196g(e10);
                    return;
                }
        }
    }
}
