package p000;

import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lfd extends lfe {

    /* JADX INFO: renamed from: b */
    private final AutoCloseable f38120b;

    public lfd(lfg lfgVar, AutoCloseable autoCloseable) {
        super(lfgVar);
        this.f38120b = autoCloseable;
    }

    @Override // p000.lfe, p000.lfg
    /* JADX INFO: renamed from: e */
    public final void mo8418e(int i) {
        try {
            this.f38120b.close();
        } catch (Exception e) {
            Log.w("CloseOnStopListener", "Exception while trying to close object.", e);
        }
        super.mo8418e(i);
    }
}
