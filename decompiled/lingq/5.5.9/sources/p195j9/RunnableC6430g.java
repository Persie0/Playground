package p195j9;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.audio.InterfaceC2368b;
import p479xa.C10134c0;
import p505ya.InterfaceC10331m;

/* JADX INFO: renamed from: j9.g */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC6430g implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36922a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f36923b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f36924c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f36925d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f36926e;

    public /* synthetic */ RunnableC6430g(Object obj, String str, long j10, long j11, int i10) {
        this.f36922a = i10;
        this.f36926e = obj;
        this.f36923b = str;
        this.f36924c = j10;
        this.f36925d = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f36922a;
        Object obj = this.f36926e;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                String str = this.f36923b;
                long j10 = this.f36924c;
                long j11 = this.f36925d;
                InterfaceC2368b interfaceC2368b = ((InterfaceC2368b.a) obj).f11946b;
                int i11 = C10134c0.f51354a;
                interfaceC2368b.mo6850v(j10, j11, str);
                break;
            default:
                String str2 = this.f36923b;
                long j12 = this.f36924c;
                long j13 = this.f36925d;
                InterfaceC10331m interfaceC10331m = ((InterfaceC10331m.a) obj).f52010b;
                int i12 = C10134c0.f51354a;
                interfaceC10331m.mo7052s(j12, j13, str2);
                break;
        }
    }
}
