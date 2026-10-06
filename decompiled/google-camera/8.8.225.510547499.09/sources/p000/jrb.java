package p000;

import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jrb extends jmx {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ jrd f34628a;

    /* JADX INFO: renamed from: b */
    private boolean f34629b;

    /* JADX INFO: renamed from: c */
    private final jra f34630c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrb(jrd jrdVar, Looper looper) {
        super(looper);
        this.f34628a = jrdVar;
        this.f34630c = new jra(0);
    }

    /* JADX INFO: renamed from: c */
    private final synchronized void m13478c() {
        if (!this.f34629b) {
            jrd jrdVar = this.f34628a;
            jrdVar.bindService(jrdVar.f34634b, this.f34630c, 1);
            this.f34629b = true;
        }
    }

    @Override // p000.jmx
    /* JADX INFO: renamed from: a */
    protected final void mo13380a(Message message) {
        m13478c();
        try {
            super.mo13380a(message);
            if (hasMessages(0)) {
            }
        } finally {
            if (!hasMessages(0)) {
                m13479b();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m13479b() {
        if (this.f34629b) {
            try {
                this.f34628a.unbindService(this.f34630c);
            } catch (RuntimeException e) {
                Log.e("WearableLS", "Exception when unbinding from local service", e);
            }
            this.f34629b = false;
        }
    }
}
