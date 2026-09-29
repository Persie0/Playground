package p195j9;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.audio.InterfaceC2368b;
import p454wa.InterfaceC9878c;
import p479xa.C10134c0;

/* JADX INFO: renamed from: j9.i */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC6432i implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36930a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f36931b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f36932c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f36933d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f36934e;

    public /* synthetic */ RunnableC6432i(Object obj, int i10, long j10, long j11, int i11) {
        this.f36930a = i11;
        this.f36934e = obj;
        this.f36931b = i10;
        this.f36932c = j10;
        this.f36933d = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f36930a;
        Object obj = this.f36934e;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                int i11 = this.f36931b;
                long j10 = this.f36932c;
                long j11 = this.f36933d;
                InterfaceC2368b interfaceC2368b = ((InterfaceC2368b.a) obj).f11946b;
                int i12 = C10134c0.f51354a;
                interfaceC2368b.mo6849t(i11, j10, j11);
                break;
            default:
                ((InterfaceC9878c.a.C10676a.C10677a) obj).f50420b.mo12826L(this.f36931b, this.f36932c, this.f36933d);
                break;
        }
    }
}
