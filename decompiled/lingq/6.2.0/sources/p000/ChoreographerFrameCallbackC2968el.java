package p000;

import android.view.Choreographer;
import androidx.compose.p002ui.platform.C0397i;
import java.util.ArrayList;

/* JADX INFO: renamed from: el */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC2968el implements Choreographer.FrameCallback, Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0397i f37403a;

    public ChoreographerFrameCallbackC2968el(C0397i c0397i) {
        this.f37403a = c0397i;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f37403a.f4773d.removeCallbacks(this);
        C0397i.m1798g0(this.f37403a);
        C0397i c0397i = this.f37403a;
        synchronized (c0397i.f4774e) {
            if (c0397i.f4779j) {
                c0397i.f4779j = false;
                ArrayList arrayList = c0397i.f4776g;
                c0397i.f4776g = c0397i.f4777h;
                c0397i.f4777h = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0397i.m1798g0(this.f37403a);
        C0397i c0397i = this.f37403a;
        synchronized (c0397i.f4774e) {
            if (c0397i.f4776g.isEmpty()) {
                c0397i.f4772c.removeFrameCallback(this);
                c0397i.f4779j = false;
            }
        }
    }
}
