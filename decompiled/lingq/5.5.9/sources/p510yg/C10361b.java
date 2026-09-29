package p510yg;

import ag.C0075b;
import ag.C0076c;
import android.content.Context;
import com.android.installreferrer.api.C2078a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.kochava.core.task.internal.TaskQueue;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.installreferrer.internal.InstallReferrerStatus;
import dm.C5206f;
import java.lang.ref.WeakReference;
import kg.C6670c;
import p003a2.C0009a;
import p201jg.C6476a;
import p201jg.InterfaceC6477b;
import p243lg.C7360b;
import p243lg.InterfaceC7361c;
import p535zg.C10489a;

/* JADX INFO: renamed from: yg.b */
/* JADX INFO: loaded from: classes.dex */
public final class C10361b implements InterfaceC6477b {

    /* JADX INFO: renamed from: M */
    public static final C0076c f52095M;

    /* JADX INFO: renamed from: a */
    public final Context f52101a;

    /* JADX INFO: renamed from: b */
    public final WeakReference<InterfaceC10362c> f52102b;

    /* JADX INFO: renamed from: c */
    public final int f52103c;

    /* JADX INFO: renamed from: d */
    public final long f52104d;

    /* JADX INFO: renamed from: e */
    public final long f52105e;

    /* JADX INFO: renamed from: f */
    public final C6670c f52106f;

    /* JADX INFO: renamed from: g */
    public final C6670c f52107g;

    /* JADX INFO: renamed from: h */
    public boolean f52108h = false;

    /* JADX INFO: renamed from: i */
    public C2078a f52109i = null;

    /* JADX INFO: renamed from: j */
    public InstallReferrerStatus f52110j = InstallReferrerStatus.TimedOut;

    /* JADX INFO: renamed from: k */
    public String f52111k = "";

    /* JADX INFO: renamed from: l */
    public long f52112l = -1;

    /* JADX INFO: renamed from: H */
    public long f52096H = -1;

    /* JADX INFO: renamed from: I */
    public Boolean f52097I = null;

    /* JADX INFO: renamed from: J */
    public Long f52098J = null;

    /* JADX INFO: renamed from: K */
    public Long f52099K = null;

    /* JADX INFO: renamed from: L */
    public String f52100L = null;

    /* JADX INFO: renamed from: yg.b$a */
    public class a implements InterfaceC6477b {
        public a() {
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p201jg.InterfaceC6477b
        /* JADX INFO: renamed from: b */
        public final void mo11769b() {
            synchronized (C10361b.this) {
                C10361b.f52095M.m459c("Install Referrer timed out, aborting");
                C10361b.this.m19385a();
            }
        }
    }

    /* JADX INFO: renamed from: yg.b$b */
    public class b implements InstallReferrerStateListener {
        public b() {
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerServiceDisconnected() {
            synchronized (C10361b.this) {
                C10361b.f52095M.m459c("Referrer client disconnected");
                C10361b c10361b = C10361b.this;
                c10361b.f52110j = InstallReferrerStatus.ServiceDisconnected;
                c10361b.m19385a();
            }
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerSetupFinished(int i10) {
            C10361b c10361b;
            InstallReferrerStatus installReferrerStatus;
            synchronized (C10361b.this) {
                try {
                    C10361b c10361b2 = C10361b.this;
                    c10361b2.getClass();
                    if (i10 == -1) {
                        installReferrerStatus = InstallReferrerStatus.ServiceDisconnected;
                    } else if (i10 == 0) {
                        installReferrerStatus = InstallReferrerStatus.Ok;
                    } else if (i10 == 1) {
                        installReferrerStatus = InstallReferrerStatus.ServiceUnavailable;
                    } else if (i10 != 2) {
                        installReferrerStatus = i10 != 3 ? InstallReferrerStatus.OtherError : InstallReferrerStatus.DeveloperError;
                    } else {
                        installReferrerStatus = InstallReferrerStatus.FeatureNotSupported;
                    }
                    c10361b2.f52110j = installReferrerStatus;
                    C10361b.f52095M.m459c("Setup finished with status " + C10361b.this.f52110j);
                    C10361b c10361b3 = C10361b.this;
                    if (c10361b3.f52110j == InstallReferrerStatus.Ok) {
                        C10361b.m19384c(c10361b3);
                    }
                    c10361b = C10361b.this;
                } catch (Throwable th2) {
                    try {
                        C10361b.f52095M.m459c("Unable to read the referrer: " + th2.getMessage());
                        c10361b = C10361b.this;
                        c10361b.f52110j = InstallReferrerStatus.MissingDependency;
                    } catch (Throwable th3) {
                        C10361b.this.m19385a();
                        throw th3;
                    }
                }
                c10361b.m19385a();
            }
        }
    }

    static {
        C0075b c0075bM19476b = C10489a.m19476b();
        f52095M = C0009a.m17e(c0075bM19476b, c0075bM19476b, BuildConfig.SDK_MODULE_NAME, "InstallReferrerHelper");
    }

    public C10361b(Context context, InterfaceC7361c interfaceC7361c, InterfaceC10362c interfaceC10362c, int i10, long j10, long j11) {
        this.f52101a = context;
        this.f52102b = new WeakReference<>(interfaceC10362c);
        this.f52103c = i10;
        this.f52104d = j10;
        this.f52105e = j11;
        C7360b c7360b = (C7360b) interfaceC7361c;
        this.f52106f = c7360b.m14765b(TaskQueue.UI, new C6476a(this));
        this.f52107g = c7360b.m14765b(TaskQueue.IO, new C6476a(new a()));
    }

    /* JADX INFO: renamed from: c */
    public static void m19384c(C10361b c10361b) throws Exception {
        C0076c c0076c = f52095M;
        C2078a c2078a = c10361b.f52109i;
        if (c2078a == null) {
            c10361b.f52110j = InstallReferrerStatus.MissingDependency;
            return;
        }
        ReferrerDetails installReferrer = c2078a.getInstallReferrer();
        c10361b.f52110j = InstallReferrerStatus.Ok;
        c10361b.f52111k = installReferrer.getInstallReferrer();
        c10361b.f52112l = installReferrer.getInstallBeginTimestampSeconds();
        c10361b.f52096H = installReferrer.getReferrerClickTimestampSeconds();
        try {
            installReferrer.getClass().getMethod("getGooglePlayInstantParam", new Class[0]);
            c10361b.f52097I = Boolean.valueOf(installReferrer.getGooglePlayInstantParam());
        } catch (Throwable unused) {
            c0076c.m457a("Old version of the Google installreferrer library detected, upgrade to version 2.1 or newer for full functionality");
        }
        try {
            installReferrer.getClass().getMethod("getInstallBeginTimestampServerSeconds", new Class[0]);
            c10361b.f52098J = Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds());
            installReferrer.getClass().getMethod("getReferrerClickTimestampServerSeconds", new Class[0]);
            c10361b.f52099K = Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds());
            installReferrer.getClass().getMethod("getInstallVersion", new Class[0]);
            c10361b.f52100L = installReferrer.getInstallVersion();
        } catch (Throwable unused2) {
            c0076c.m457a("Old version of the Google installreferrer library detected, upgrade to version 2.1 or newer for full functionality");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m19385a() {
        C10361b c10361b = this;
        if (c10361b.f52108h) {
            return;
        }
        c10361b.f52108h = true;
        c10361b.f52106f.m13291c();
        c10361b.f52107g.m13291c();
        try {
            C2078a c2078a = c10361b.f52109i;
            if (c2078a != null) {
                c2078a.endConnection();
            }
        } catch (Throwable th2) {
            f52095M.m459c("Unable to close the referrer client: " + th2.getMessage());
        }
        c10361b.f52109i = null;
        double dM11011j1 = C5206f.m11011j1(System.currentTimeMillis() - c10361b.f52104d);
        WeakReference<InterfaceC10362c> weakReference = c10361b.f52102b;
        InterfaceC10362c interfaceC10362c = weakReference.get();
        if (interfaceC10362c == null) {
            return;
        }
        InstallReferrerStatus installReferrerStatus = c10361b.f52110j;
        InstallReferrerStatus installReferrerStatus2 = InstallReferrerStatus.Ok;
        if (installReferrerStatus == installReferrerStatus2) {
            Boolean bool = c10361b.f52097I;
            if (bool == null) {
                interfaceC10362c.mo19386f(new C10360a(c10361b.f52103c, dM11011j1, installReferrerStatus2, c10361b.f52111k, Long.valueOf(c10361b.f52112l), null, Long.valueOf(c10361b.f52096H), null, null, null));
            } else {
                Long l10 = c10361b.f52098J;
                if (l10 == null || c10361b.f52099K == null) {
                    c10361b = this;
                } else if (c10361b.f52100L != null) {
                    weakReference = weakReference;
                    interfaceC10362c.mo19386f(new C10360a(c10361b.f52103c, dM11011j1, installReferrerStatus2, c10361b.f52111k, Long.valueOf(c10361b.f52112l), Long.valueOf(l10.longValue()), Long.valueOf(c10361b.f52096H), Long.valueOf(c10361b.f52099K.longValue()), Boolean.valueOf(c10361b.f52097I.booleanValue()), c10361b.f52100L));
                }
                interfaceC10362c.mo19386f(new C10360a(c10361b.f52103c, dM11011j1, installReferrerStatus2, c10361b.f52111k, Long.valueOf(c10361b.f52112l), null, Long.valueOf(c10361b.f52096H), null, Boolean.valueOf(bool.booleanValue()), null));
            }
            weakReference.clear();
        }
        interfaceC10362c.mo19386f(new C10360a(c10361b.f52103c, dM11011j1, installReferrerStatus, null, null, null, null, null, null, null));
        weakReference = weakReference;
        weakReference.clear();
    }

    @Override // p201jg.InterfaceC6477b
    /* JADX INFO: renamed from: b */
    public final synchronized void mo11769b() {
        try {
            C2078a c2078aM6226a = InstallReferrerClient.newBuilder(this.f52101a).m6226a();
            this.f52109i = c2078aM6226a;
            c2078aM6226a.startConnection(new b());
        } catch (Throwable th2) {
            f52095M.m459c("Unable to create referrer client: " + th2.getMessage());
            this.f52110j = InstallReferrerStatus.MissingDependency;
            m19385a();
        }
    }
}
