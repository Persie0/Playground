package ug;

import ag.C0075b;
import ag.C0076c;
import android.content.Context;
import com.huawei.hms.ads.installreferrer.api.InstallReferrerClient;
import com.huawei.hms.ads.installreferrer.api.InstallReferrerStateListener;
import com.kochava.core.task.internal.TaskQueue;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.huaweireferrer.internal.HuaweiReferrerStatus;
import dm.C5206f;
import java.lang.ref.WeakReference;
import kg.C6670c;
import p003a2.C0009a;
import p201jg.C6476a;
import p201jg.InterfaceC6477b;
import p243lg.C7360b;
import p243lg.InterfaceC7361c;
import p535zg.C10489a;

/* JADX INFO: renamed from: ug.b */
/* JADX INFO: loaded from: classes.dex */
public final class C9524b implements InterfaceC6477b {

    /* JADX INFO: renamed from: I */
    public static final C0076c f49043I;

    /* JADX INFO: renamed from: a */
    public final Context f49045a;

    /* JADX INFO: renamed from: b */
    public final WeakReference<InterfaceC9525c> f49046b;

    /* JADX INFO: renamed from: c */
    public final int f49047c;

    /* JADX INFO: renamed from: d */
    public final long f49048d;

    /* JADX INFO: renamed from: e */
    public final long f49049e;

    /* JADX INFO: renamed from: f */
    public final C6670c f49050f;

    /* JADX INFO: renamed from: g */
    public final C6670c f49051g;

    /* JADX INFO: renamed from: h */
    public boolean f49052h = false;

    /* JADX INFO: renamed from: i */
    public InstallReferrerClient f49053i = null;

    /* JADX INFO: renamed from: j */
    public HuaweiReferrerStatus f49054j = HuaweiReferrerStatus.TimedOut;

    /* JADX INFO: renamed from: k */
    public final String f49055k = "";

    /* JADX INFO: renamed from: l */
    public final long f49056l = -1;

    /* JADX INFO: renamed from: H */
    public final long f49044H = -1;

    /* JADX INFO: renamed from: ug.b$a */
    public class a implements InterfaceC6477b {
        public a() {
        }

        @Override // p201jg.InterfaceC6477b
        /* JADX INFO: renamed from: b */
        public final void mo11769b() {
            synchronized (C9524b.this) {
                C9524b.f49043I.m459c("Huawei Referrer timed out, aborting");
                C9524b.this.m17987c();
            }
        }
    }

    /* JADX INFO: renamed from: ug.b$b */
    public class b implements InstallReferrerStateListener {
    }

    static {
        C0075b c0075bM19476b = C10489a.m19476b();
        f49043I = C0009a.m17e(c0075bM19476b, c0075bM19476b, BuildConfig.SDK_MODULE_NAME, "HuaweiReferrerHelper");
    }

    public C9524b(Context context, InterfaceC7361c interfaceC7361c, InterfaceC9525c interfaceC9525c, int i10, long j10, long j11) {
        this.f49045a = context;
        this.f49046b = new WeakReference<>(interfaceC9525c);
        this.f49047c = i10;
        this.f49048d = j10;
        this.f49049e = j11;
        TaskQueue taskQueue = TaskQueue.IO;
        C7360b c7360b = (C7360b) interfaceC7361c;
        this.f49050f = c7360b.m14765b(taskQueue, new C6476a(this));
        this.f49051g = c7360b.m14765b(taskQueue, new C6476a(new a()));
    }

    /* JADX INFO: renamed from: a */
    public final void m17986a() {
        try {
            InstallReferrerClient installReferrerClient = this.f49053i;
            if (installReferrerClient != null) {
                installReferrerClient.endConnection();
            }
        } catch (Throwable th2) {
            f49043I.m459c("Unable to close the referrer client: " + th2.getMessage());
        }
        this.f49053i = null;
    }

    @Override // p201jg.InterfaceC6477b
    /* JADX INFO: renamed from: b */
    public final void mo11769b() {
        try {
            InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(this.f49045a).build();
            this.f49053i = installReferrerClientBuild;
            installReferrerClientBuild.startConnection(new b());
        } catch (Throwable th2) {
            f49043I.m459c("Unable to create referrer client: " + th2.getMessage());
            this.f49054j = HuaweiReferrerStatus.MissingDependency;
            m17987c();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m17987c() {
        if (this.f49052h) {
            return;
        }
        this.f49052h = true;
        this.f49050f.m13291c();
        this.f49051g.m13291c();
        m17986a();
        double dM11011j1 = C5206f.m11011j1(System.currentTimeMillis() - this.f49048d);
        WeakReference<InterfaceC9525c> weakReference = this.f49046b;
        InterfaceC9525c interfaceC9525c = weakReference.get();
        if (interfaceC9525c == null) {
            return;
        }
        HuaweiReferrerStatus huaweiReferrerStatus = this.f49054j;
        HuaweiReferrerStatus huaweiReferrerStatus2 = HuaweiReferrerStatus.Ok;
        if (huaweiReferrerStatus != huaweiReferrerStatus2) {
            interfaceC9525c.mo17988h(new C9523a(this.f49047c, dM11011j1, huaweiReferrerStatus, null, null, null));
        } else {
            interfaceC9525c.mo17988h(new C9523a(this.f49047c, dM11011j1, huaweiReferrerStatus2, this.f49055k, Long.valueOf(this.f49056l), Long.valueOf(this.f49044H)));
        }
        weakReference.clear();
    }
}
