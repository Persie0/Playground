package p176ib;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: ib.r0 */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC6291r0 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final int f36493a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC6251a f36494b;

    public ServiceConnectionC6291r0(AbstractC6251a abstractC6251a, int i10) {
        this.f36494b = abstractC6251a;
        this.f36493a = i10;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i10;
        int i11;
        AbstractC6251a abstractC6251a = this.f36494b;
        if (iBinder == null) {
            synchronized (abstractC6251a.f36427l) {
                try {
                    i10 = abstractC6251a.f36406N;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (i10 == 3) {
                abstractC6251a.f36413U = true;
                i11 = 5;
            } else {
                i11 = 4;
            }
            HandlerC6285o0 handlerC6285o0 = abstractC6251a.f36426k;
            handlerC6285o0.sendMessage(handlerC6285o0.obtainMessage(i11, abstractC6251a.f36415W.get(), 16));
            return;
        }
        synchronized (abstractC6251a.f36400H) {
            AbstractC6251a abstractC6251a2 = this.f36494b;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            abstractC6251a2.f36401I = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC6266f)) ? new C6273i0(iBinder) : (InterfaceC6266f) iInterfaceQueryLocalInterface;
        }
        AbstractC6251a abstractC6251a3 = this.f36494b;
        int i12 = this.f36493a;
        abstractC6251a3.getClass();
        C6295t0 c6295t0 = new C6295t0(abstractC6251a3, 0);
        HandlerC6285o0 handlerC6285o1 = abstractC6251a3.f36426k;
        handlerC6285o1.sendMessage(handlerC6285o1.obtainMessage(7, i12, -1, c6295t0));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC6251a abstractC6251a;
        synchronized (this.f36494b.f36400H) {
            try {
                abstractC6251a = this.f36494b;
                abstractC6251a.f36401I = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        HandlerC6285o0 handlerC6285o0 = abstractC6251a.f36426k;
        handlerC6285o0.sendMessage(handlerC6285o0.obtainMessage(6, this.f36493a, 1));
    }
}
