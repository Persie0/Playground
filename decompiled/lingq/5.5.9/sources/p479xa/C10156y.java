package p479xa;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: renamed from: xa.y */
/* JADX INFO: loaded from: classes.dex */
public final class C10156y implements InterfaceC10142k {

    /* JADX INFO: renamed from: b */
    public static final ArrayList f51453b = new ArrayList(50);

    /* JADX INFO: renamed from: a */
    public final Handler f51454a;

    /* JADX INFO: renamed from: xa.y$a */
    public static final class a implements InterfaceC10142k.a {

        /* JADX INFO: renamed from: a */
        public Message f51455a;

        /* JADX INFO: renamed from: a */
        public final void m19164a() {
            Message message = this.f51455a;
            message.getClass();
            message.sendToTarget();
            this.f51455a = null;
            ArrayList arrayList = C10156y.f51453b;
            synchronized (arrayList) {
                if (arrayList.size() < 50) {
                    arrayList.add(this);
                }
            }
        }
    }

    public C10156y(Handler handler) {
        this.f51454a = handler;
    }

    /* JADX INFO: renamed from: m */
    public static a m19163m() {
        a aVar;
        ArrayList arrayList = f51453b;
        synchronized (arrayList) {
            aVar = arrayList.isEmpty() ? new a() : (a) arrayList.remove(arrayList.size() - 1);
        }
        return aVar;
    }

    @Override // p479xa.InterfaceC10142k
    /* JADX INFO: renamed from: a */
    public final boolean mo19075a() {
        return this.f51454a.hasMessages(0);
    }

    @Override // p479xa.InterfaceC10142k
    /* JADX INFO: renamed from: b */
    public final a mo19076b(int i10, int i11, int i12) {
        a aVarM19163m = m19163m();
        aVarM19163m.f51455a = this.f51454a.obtainMessage(i10, i11, i12);
        return aVarM19163m;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p479xa.InterfaceC10142k
    /* JADX INFO: renamed from: c */
    public final boolean mo19077c(InterfaceC10142k.a aVar) {
        a aVar2 = (a) aVar;
        Message message = aVar2.f51455a;
        message.getClass();
        boolean zSendMessageAtFrontOfQueue = this.f51454a.sendMessageAtFrontOfQueue(message);
        aVar2.f51455a = null;
        ArrayList arrayList = f51453b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(aVar2);
            }
        }
        return zSendMessageAtFrontOfQueue;
    }

    @Override // p479xa.InterfaceC10142k
    /* JADX INFO: renamed from: d */
    public final a mo19078d(Object obj, int i10, int i11, int i12) {
        a aVarM19163m = m19163m();
        aVarM19163m.f51455a = this.f51454a.obtainMessage(i10, i11, i12, obj);
        return aVarM19163m;
    }

    @Override // p479xa.InterfaceC10142k
    /* JADX INFO: renamed from: e */
    public final boolean mo19079e(Runnable runnable) {
        return this.f51454a.post(runnable);
    }

    @Override // p479xa.InterfaceC10142k
    /* JADX INFO: renamed from: f */
    public final a mo19080f(int i10) {
        a aVarM19163m = m19163m();
        aVarM19163m.f51455a = this.f51454a.obtainMessage(i10);
        return aVarM19163m;
    }

    @Override // p479xa.InterfaceC10142k
    /* JADX INFO: renamed from: g */
    public final void mo19081g() {
        this.f51454a.removeCallbacksAndMessages(null);
    }

    @Override // p479xa.InterfaceC10142k
    /* JADX INFO: renamed from: h */
    public final boolean mo19082h(long j10) {
        return this.f51454a.sendEmptyMessageAtTime(2, j10);
    }

    @Override // p479xa.InterfaceC10142k
    /* JADX INFO: renamed from: i */
    public final boolean mo19083i(int i10) {
        return this.f51454a.sendEmptyMessage(i10);
    }

    @Override // p479xa.InterfaceC10142k
    /* JADX INFO: renamed from: j */
    public final void mo19084j(int i10) {
        this.f51454a.removeMessages(i10);
    }

    @Override // p479xa.InterfaceC10142k
    /* JADX INFO: renamed from: k */
    public final a mo19085k(int i10, Object obj) {
        a aVarM19163m = m19163m();
        aVarM19163m.f51455a = this.f51454a.obtainMessage(i10, obj);
        return aVarM19163m;
    }

    @Override // p479xa.InterfaceC10142k
    /* JADX INFO: renamed from: l */
    public final Looper mo19086l() {
        return this.f51454a.getLooper();
    }
}
