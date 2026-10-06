package p000;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* JADX INFO: renamed from: ey */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0173ey {

    /* JADX INFO: renamed from: a */
    private BroadcastReceiver f20934a;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ LayoutInflaterFactory2C0179fd f20935c;

    public AbstractC0173ey(LayoutInflaterFactory2C0179fd layoutInflaterFactory2C0179fd) {
        this.f20935c = layoutInflaterFactory2C0179fd;
    }

    /* JADX INFO: renamed from: a */
    public abstract IntentFilter mo7933a();

    /* JADX INFO: renamed from: b */
    public abstract void mo7934b();

    /* JADX INFO: renamed from: c */
    final void m8037c() {
        BroadcastReceiver broadcastReceiver = this.f20934a;
        if (broadcastReceiver != null) {
            try {
                this.f20935c.f21374i.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException e) {
            }
            this.f20934a = null;
        }
    }

    /* JADX INFO: renamed from: d */
    final void m8038d() {
        m8037c();
        IntentFilter intentFilterMo7933a = mo7933a();
        if (intentFilterMo7933a.countActions() == 0) {
            return;
        }
        if (this.f20934a == null) {
            this.f20934a = new C0172ex(this);
        }
        this.f20935c.f21374i.registerReceiver(this.f20934a, intentFilterMo7933a);
    }
}
