package p033bl;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.tonyodev.fetch2.NetworkType;
import com.tonyodev.fetch2.PrioritySort;
import com.tonyodev.fetch2.database.DownloadInfo;
import dm.C5207g;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.TypeCastException;
import kotlin.collections.EmptyList;
import p041c5.C1702c;
import p077dl.C5200a;
import p122fl.C5579b;
import p385sf.C9000b;
import p489xk.C10221i;

/* JADX INFO: renamed from: bl.d */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC1613d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1614e f9115a;

    public RunnableC1613d(C1614e c1614e) {
        this.f9115a = c1614e;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x013a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x011c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0121  */
    /* JADX WARN: Code duplicated, block: B:64:0x012f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0138  */
    /* JADX WARN: Code duplicated, block: B:70:0x0143  */
    /* JADX WARN: Code duplicated, block: B:72:0x0149  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // java.lang.Runnable
    public final void run() {
        List<DownloadInfo> listMo10622f0;
        NetworkType networkTypeMo10580P;
        boolean z10;
        Object systemService;
        if (C1614e.m5269a(this.f9115a)) {
            if (this.f9115a.f9132k.mo19487l0() && C1614e.m5269a(this.f9115a)) {
                C1614e c1614e = this.f9115a;
                synchronized (c1614e.f9122a) {
                    try {
                        try {
                            C1702c c1702c = c1614e.f9131j;
                            PrioritySort prioritySort = c1614e.f9121M;
                            c1702c.getClass();
                            C5207g.m11112g(prioritySort, "prioritySort");
                            listMo10622f0 = ((C10221i) c1702c.f9487a).mo10622f0(prioritySort);
                        } catch (Exception e10) {
                            c1614e.f9116H.mo11830c(e10);
                            listMo10622f0 = EmptyList.f38032a;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                boolean z11 = true;
                boolean z12 = listMo10622f0.isEmpty() || !this.f9115a.f9133l.m10971b();
                if (z12) {
                    z11 = z12;
                } else {
                    int iM17249o = C9000b.m17249o(listMo10622f0);
                    if (iM17249o >= 0) {
                        boolean z13 = true;
                        int i10 = 0;
                        while (this.f9115a.f9132k.mo19487l0() && C1614e.m5269a(this.f9115a)) {
                            DownloadInfo downloadInfo = listMo10622f0.get(i10);
                            boolean zM11826r = C5579b.m11826r(downloadInfo.mo10577L());
                            if ((!zM11826r && !this.f9115a.f9133l.m10971b()) || !C1614e.m5269a(this.f9115a)) {
                                break;
                            }
                            NetworkType networkType = this.f9115a.f9123b;
                            NetworkType networkType2 = NetworkType.GLOBAL_OFF;
                            if (networkType != networkType2) {
                                networkTypeMo10580P = this.f9115a.f9123b;
                            } else {
                                networkTypeMo10580P = downloadInfo.mo10580P() == networkType2 ? NetworkType.ALL : downloadInfo.mo10580P();
                            }
                            C5200a c5200a = this.f9115a.f9133l;
                            c5200a.getClass();
                            C5207g.m11112g(networkTypeMo10580P, "networkType");
                            NetworkType networkType3 = NetworkType.WIFI_ONLY;
                            Context context = c5200a.f33256g;
                            if (networkTypeMo10580P == networkType3) {
                                C5207g.m11112g(context, "$this$isOnWiFi");
                                Object systemService2 = context.getSystemService("connectivity");
                                if (systemService2 == null) {
                                    throw new TypeCastException("null cannot be cast to non-null type android.net.ConnectivityManager");
                                }
                                NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService2).getActiveNetworkInfo();
                                if (!(activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1)) {
                                    if (networkTypeMo10580P == NetworkType.UNMETERED) {
                                        C5207g.m11112g(context, "$this$isOnMeteredConnection");
                                        systemService = context.getSystemService("connectivity");
                                        if (systemService != null) {
                                            throw new TypeCastException("null cannot be cast to non-null type android.net.ConnectivityManager");
                                        }
                                        if (!((ConnectivityManager) systemService).isActiveNetworkMetered()) {
                                            if (networkTypeMo10580P == NetworkType.ALL || !C9000b.m17250p(context)) {
                                                z10 = false;
                                            }
                                        }
                                    } else {
                                        if (networkTypeMo10580P == NetworkType.ALL) {
                                        }
                                        z10 = false;
                                    }
                                }
                                z10 = true;
                            } else if (networkTypeMo10580P == NetworkType.UNMETERED) {
                                C5207g.m11112g(context, "$this$isOnMeteredConnection");
                                systemService = context.getSystemService("connectivity");
                                if (systemService != null) {
                                    throw new TypeCastException("null cannot be cast to non-null type android.net.ConnectivityManager");
                                }
                                if (!((ConnectivityManager) systemService).isActiveNetworkMetered()) {
                                    if (networkTypeMo10580P == NetworkType.ALL) {
                                    }
                                    z10 = false;
                                }
                                z10 = true;
                            } else {
                                if (networkTypeMo10580P == NetworkType.ALL) {
                                }
                                z10 = false;
                            }
                            if (!z10) {
                                this.f9115a.f9117I.f32447g.mo10661m(downloadInfo);
                            }
                            if (zM11826r || z10) {
                                if (!this.f9115a.f9132k.mo19486g0(downloadInfo.getF32331a()) && C1614e.m5269a(this.f9115a)) {
                                    this.f9115a.f9132k.mo19484T0(downloadInfo);
                                }
                                z13 = false;
                            }
                            if (i10 == iM17249o) {
                                break;
                            } else {
                                i10++;
                            }
                        }
                        z11 = z13;
                    }
                }
                if (z11) {
                    C1614e c1614e2 = this.f9115a;
                    c1614e2.f9126e = c1614e2.f9126e == 500 ? 60000L : c1614e2.f9126e * 2;
                    long minutes = TimeUnit.MILLISECONDS.toMinutes(c1614e2.f9126e);
                    c1614e2.f9116H.mo11829b("PriorityIterator backoffTime increased to " + minutes + " minute(s)");
                }
            }
            if (C1614e.m5269a(this.f9115a)) {
                this.f9115a.m5270b();
            }
        }
    }
}
