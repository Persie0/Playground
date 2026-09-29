package p000;

import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
public final class sq2 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61222a;

    /* JADX INFO: renamed from: a */
    private final void m21546a() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f61222a) {
            case 0:
                try {
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (pq2.m19449d()) {
                        pq2.m19448a().m19452e();
                        break;
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
            default:
                return;
        }
    }
}
