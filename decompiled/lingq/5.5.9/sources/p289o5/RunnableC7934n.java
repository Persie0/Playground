package p289o5;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.internal.play_billing.C2933a;
import kotlinx.coroutines.CoroutineDispatcher;
import no.InterfaceC7840j;
import p457wd.C9905f;
import p457wd.C9910k;
import p457wd.InterfaceC9900a;
import sl.C9072e;

/* JADX INFO: renamed from: o5.n */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC7934n implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43227a;

    /* JADX INFO: renamed from: b */
    public final Object f43228b;

    /* JADX INFO: renamed from: c */
    public final Object f43229c;

    public /* synthetic */ RunnableC7934n(Object obj, int i10, Object obj2) {
        this.f43227a = i10;
        this.f43228b = obj;
        this.f43229c = obj2;
    }

    public RunnableC7934n(C9905f c9905f, C9910k c9910k) {
        this.f43227a = 1;
        this.f43229c = c9905f;
        this.f43228b = c9910k;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // java.lang.Runnable
    public final void run() {
        Exception exc;
        switch (this.f43227a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C7922b c7922b = (C7922b) this.f43228b;
                C7925e c7925e = (C7925e) this.f43229c;
                if (((C7941u) c7922b.f43161d.f33573b).f43259a != null) {
                    ((C7941u) c7922b.f43161d.f33573b).f43259a.mo13091a(c7925e, null);
                    return;
                }
                C7941u c7941u = (C7941u) c7922b.f43161d.f33573b;
                int i10 = C7941u.f43258d;
                c7941u.getClass();
                C2933a.m8515g("BillingClient", "No valid listener is set in BroadcastManager");
                return;
            case 1:
                synchronized (((C9905f) this.f43229c).f50539b) {
                    InterfaceC9900a interfaceC9900a = ((C9905f) this.f43229c).f50540c;
                    if (interfaceC9900a != null) {
                        C9910k c9910k = (C9910k) this.f43228b;
                        synchronized (c9910k.f50543a) {
                            try {
                                exc = c9910k.f50547e;
                            } finally {
                            }
                            break;
                        }
                        interfaceC9900a.mo16774b(exc);
                    }
                }
                return;
            default:
                ((InterfaceC7840j) this.f43229c).mo15576A((CoroutineDispatcher) this.f43228b, C9072e.f47360a);
                return;
        }
    }
}
