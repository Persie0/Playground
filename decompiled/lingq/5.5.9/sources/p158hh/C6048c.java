package p158hh;

import ag.C0075b;
import ag.C0076c;
import android.content.Context;
import com.kochava.core.task.internal.TaskQueue;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.samsungreferrer.SamsungReferrerStatus;
import com.samsung.android.sdk.sinstallreferrer.api.InstallReferrerClient;
import com.samsung.android.sdk.sinstallreferrer.api.InstallReferrerStateListener;
import dm.C5206f;
import java.lang.ref.WeakReference;
import kg.C6670c;
import p003a2.C0009a;
import p201jg.C6476a;
import p201jg.InterfaceC6477b;
import p243lg.C7360b;
import p243lg.InterfaceC7361c;
import p535zg.C10489a;

/* JADX INFO: renamed from: hh.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6048c implements InterfaceC6477b {

    /* JADX INFO: renamed from: I */
    public static final C0076c f35706I;

    /* JADX INFO: renamed from: a */
    public final Context f35708a;

    /* JADX INFO: renamed from: b */
    public final WeakReference<InterfaceC6049d> f35709b;

    /* JADX INFO: renamed from: c */
    public final int f35710c;

    /* JADX INFO: renamed from: d */
    public final long f35711d;

    /* JADX INFO: renamed from: e */
    public final long f35712e;

    /* JADX INFO: renamed from: f */
    public final C6670c f35713f;

    /* JADX INFO: renamed from: g */
    public final C6670c f35714g;

    /* JADX INFO: renamed from: h */
    public boolean f35715h = false;

    /* JADX INFO: renamed from: i */
    public InstallReferrerClient f35716i = null;

    /* JADX INFO: renamed from: j */
    public SamsungReferrerStatus f35717j = SamsungReferrerStatus.TimedOut;

    /* JADX INFO: renamed from: k */
    public final String f35718k = "";

    /* JADX INFO: renamed from: l */
    public final long f35719l = -1;

    /* JADX INFO: renamed from: H */
    public final long f35707H = -1;

    /* JADX INFO: renamed from: hh.c$a */
    public class a implements InterfaceC6477b {
        public a() {
        }

        @Override // p201jg.InterfaceC6477b
        /* JADX INFO: renamed from: b */
        public final void mo11769b() {
            synchronized (C6048c.this) {
                C6048c.f35706I.m459c("Samsung Referrer timed out, aborting");
                C6048c.this.m12495c();
            }
        }
    }

    /* JADX INFO: renamed from: hh.c$b */
    public class b implements InstallReferrerStateListener {
    }

    static {
        C0075b c0075bM19476b = C10489a.m19476b();
        f35706I = C0009a.m17e(c0075bM19476b, c0075bM19476b, BuildConfig.SDK_MODULE_NAME, "SamsungReferrerHelper");
    }

    public C6048c(Context context, InterfaceC7361c interfaceC7361c, InterfaceC6049d interfaceC6049d, int i10, long j10, long j11) {
        this.f35708a = context;
        this.f35709b = new WeakReference<>(interfaceC6049d);
        this.f35710c = i10;
        this.f35711d = j10;
        this.f35712e = j11;
        C7360b c7360b = (C7360b) interfaceC7361c;
        this.f35713f = c7360b.m14765b(TaskQueue.UI, new C6476a(this));
        this.f35714g = c7360b.m14765b(TaskQueue.IO, new C6476a(new a()));
    }

    /* JADX INFO: renamed from: a */
    public final void m12494a() {
        try {
            InstallReferrerClient installReferrerClient = this.f35716i;
            if (installReferrerClient != null) {
                installReferrerClient.endConnection();
            }
        } catch (Throwable th2) {
            f35706I.m459c("Unable to close the referrer client: " + th2.getMessage());
        }
        this.f35716i = null;
    }

    @Override // p201jg.InterfaceC6477b
    /* JADX INFO: renamed from: b */
    public final synchronized void mo11769b() {
        try {
            InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(this.f35708a).build();
            this.f35716i = installReferrerClientBuild;
            installReferrerClientBuild.startConnection(new b());
        } catch (Throwable th2) {
            f35706I.m459c("Unable to create referrer client: " + th2.getMessage());
            this.f35717j = SamsungReferrerStatus.MissingDependency;
            m12495c();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m12495c() {
        if (this.f35715h) {
            return;
        }
        this.f35715h = true;
        this.f35713f.m13291c();
        this.f35714g.m13291c();
        m12494a();
        double dM11011j1 = C5206f.m11011j1(System.currentTimeMillis() - this.f35711d);
        WeakReference<InterfaceC6049d> weakReference = this.f35709b;
        InterfaceC6049d interfaceC6049d = weakReference.get();
        if (interfaceC6049d == null) {
            return;
        }
        SamsungReferrerStatus samsungReferrerStatus = this.f35717j;
        SamsungReferrerStatus samsungReferrerStatus2 = SamsungReferrerStatus.Ok;
        if (samsungReferrerStatus != samsungReferrerStatus2) {
            interfaceC6049d.mo12490d(new C6047b(System.currentTimeMillis(), this.f35710c, dM11011j1, samsungReferrerStatus, null, null, null));
        } else {
            interfaceC6049d.mo12490d(new C6047b(System.currentTimeMillis(), this.f35710c, dM11011j1, samsungReferrerStatus2, this.f35718k, Long.valueOf(this.f35719l), Long.valueOf(this.f35707H)));
        }
        weakReference.clear();
    }
}
