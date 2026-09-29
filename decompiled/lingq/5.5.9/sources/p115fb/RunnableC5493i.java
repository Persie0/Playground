package p115fb;

import android.os.Bundle;
import cc.C1782b6;
import cc.C1860k3;
import cc.C1881m6;
import cc.C1897o4;
import cc.C1934s5;
import cc.C1953u6;
import cc.C1971w6;
import cc.C1986y3;
import cc.RunnableC1944t6;
import cc.ServiceConnectionC1872l6;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.common.C2550e;
import com.google.android.play.core.assetpacks.C3112c;
import java.io.File;
import java.io.IOException;
import p152hb.C5966e0;
import p290o6.C7968m;

/* JADX INFO: renamed from: fb.i */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC5493i implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34089a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f34090b;

    public /* synthetic */ RunnableC5493i(int i10, Object obj) {
        this.f34089a = i10;
        this.f34090b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f34089a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                ServiceConnectionC5495k serviceConnectionC5495k = (ServiceConnectionC5495k) this.f34090b;
                synchronized (serviceConnectionC5495k) {
                    try {
                        if (serviceConnectionC5495k.f34094a == 1) {
                            serviceConnectionC5495k.m11718a("Timed out while binding", 1);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            case 1:
                C5966e0 c5966e0 = (C5966e0) this.f34090b;
                c5966e0.f35466d.getClass();
                C2550e.cancelAvailabilityErrorNotifications(c5966e0.f35465c);
                return;
            case 2:
                C1782b6 c1782b6 = (C1782b6) this.f34090b;
                c1782b6.f9687e = c1782b6.f9692j;
                return;
            case 3:
                C1881m6 c1881m6 = ((ServiceConnectionC1872l6) this.f34090b).f9984c;
                c1881m6.f10007d = null;
                c1881m6.m5764r();
                return;
            case 4:
                RunnableC1944t6 runnableC1944t6 = (RunnableC1944t6) this.f34090b;
                C7968m c7968m = runnableC1944t6.f10215c;
                long j10 = runnableC1944t6.f10213a;
                ((C1971w6) c7968m.f43384b).mo5748g();
                C1860k3 c1860k3 = ((C1897o4) ((C1971w6) c7968m.f43384b).f10430a).f10086i;
                C1897o4.m5776k(c1860k3);
                c1860k3.f9937H.m5623a("Application going to the background");
                C1986y3 c1986y3 = ((C1897o4) ((C1971w6) c7968m.f43384b).f10430a).f10085h;
                C1897o4.m5774i(c1986y3);
                c1986y3.f10394L.m5889a(true);
                Bundle bundle = new Bundle();
                if (!((C1897o4) ((C1971w6) c7968m.f43384b).f10430a).f10084g.m5583r()) {
                    C1953u6 c1953u6 = ((C1971w6) c7968m.f43384b).f10279e;
                    long j11 = runnableC1944t6.f10214b;
                    c1953u6.f10244c.m5745a();
                    ((C1971w6) c7968m.f43384b).f10279e.m5895a(j11, false, false);
                }
                C1934s5 c1934s5 = ((C1897o4) ((C1971w6) c7968m.f43384b).f10430a).f10060K;
                C1897o4.m5775j(c1934s5);
                c1934s5.m5872p(j10, bundle, "auto", "_ab");
                return;
            default:
                C3112c c3112c = (C3112c) this.f34090b;
                for (File file : c3112c.m8971e()) {
                    if (file.listFiles() != null) {
                        C3112c.m8966f(file);
                        long jM8965b = C3112c.m8965b(file, false);
                        if (c3112c.f15907b.m16652a() != jM8965b) {
                            try {
                                new File(new File(file, String.valueOf(jM8965b)), "stale.tmp").createNewFile();
                            } catch (IOException unused) {
                                C3112c.f15905c.m15812m("Could not write staleness marker.", new Object[0]);
                            }
                            break;
                        }
                        for (File file2 : file.listFiles()) {
                            C3112c.m8966f(file2);
                        }
                    }
                }
                return;
        }
    }
}
