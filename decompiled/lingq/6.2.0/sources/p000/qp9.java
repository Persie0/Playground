package p000;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class qp9 {

    /* JADX INFO: renamed from: b */
    public static final ArrayList f58032b = new ArrayList(50);

    /* JADX INFO: renamed from: a */
    public final Handler f58033a;

    public qp9(Handler handler) {
        this.f58033a = handler;
    }

    /* JADX INFO: renamed from: b */
    public static pp9 m20096b() {
        pp9 pp9Var;
        ArrayList arrayList = f58032b;
        synchronized (arrayList) {
            try {
                pp9Var = arrayList.isEmpty() ? new pp9() : (pp9) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return pp9Var;
    }

    /* JADX INFO: renamed from: a */
    public final pp9 m20097a(int i, Object obj) {
        pp9 pp9VarM20096b = m20096b();
        pp9VarM20096b.f56637a = this.f58033a.obtainMessage(i, obj);
        return pp9VarM20096b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m20098c(Runnable runnable) {
        return this.f58033a.post(runnable);
    }

    /* JADX INFO: renamed from: d */
    public final void m20099d(int i) {
        bna.m3969q(i != 0);
        this.f58033a.removeMessages(i);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m20100e(int i) {
        return this.f58033a.sendEmptyMessage(i);
    }
}
