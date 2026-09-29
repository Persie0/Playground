package cc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: cc.s3 */
/* JADX INFO: loaded from: classes.dex */
public final class C1932s3 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final C1846i7 f10178a;

    /* JADX INFO: renamed from: b */
    public boolean f10179b;

    /* JADX INFO: renamed from: c */
    public boolean f10180c;

    public C1932s3(C1846i7 c1846i7) {
        this.f10178a = c1846i7;
    }

    /* JADX INFO: renamed from: a */
    public final void m5863a() {
        C1846i7 c1846i7 = this.f10178a;
        c1846i7.m5648g();
        c1846i7.mo5518f().mo5748g();
        c1846i7.mo5518f().mo5748g();
        if (this.f10179b) {
            c1846i7.mo5517e().f9938I.m5623a("Unregistering connectivity change receiver");
            this.f10179b = false;
            this.f10180c = false;
            try {
                c1846i7.f9902l.f10076a.unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                c1846i7.mo5517e().f9942f.m5624b(e10, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C1846i7 c1846i7 = this.f10178a;
        c1846i7.m5648g();
        String action = intent.getAction();
        c1846i7.mo5517e().f9938I.m5624b(action, "NetworkBroadcastReceiver received action");
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            c1846i7.mo5517e().f9945i.m5624b(action, "NetworkBroadcastReceiver received unknown action");
            return;
        }
        C1905p3 c1905p3 = c1846i7.f9892b;
        C1846i7.m5629H(c1905p3);
        boolean zM5850l = c1905p3.m5850l();
        if (this.f10180c != zM5850l) {
            this.f10180c = zM5850l;
            c1846i7.mo5518f().m5753p(new RunnableC1923r3(0, this, zM5850l));
        }
    }
}
