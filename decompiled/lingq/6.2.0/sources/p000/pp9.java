package p000;

import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class pp9 {

    /* JADX INFO: renamed from: a */
    public Message f56637a;

    /* JADX INFO: renamed from: a */
    public final void m19439a() {
        this.f56637a = null;
        ArrayList arrayList = qp9.f58032b;
        synchronized (arrayList) {
            try {
                if (arrayList.size() < 50) {
                    arrayList.add(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m19440b() {
        Message message = this.f56637a;
        message.getClass();
        message.sendToTarget();
        m19439a();
    }
}
