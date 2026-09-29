package p479xa;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: renamed from: xa.x */
/* JADX INFO: loaded from: classes.dex */
public final class C10155x implements InterfaceC10133c {
    @Override // p479xa.InterfaceC10133c
    /* JADX INFO: renamed from: a */
    public final long mo19012a() {
        return SystemClock.uptimeMillis();
    }

    @Override // p479xa.InterfaceC10133c
    /* JADX INFO: renamed from: b */
    public final C10156y mo19013b(Looper looper, Handler.Callback callback) {
        return new C10156y(new Handler(looper, callback));
    }

    @Override // p479xa.InterfaceC10133c
    /* JADX INFO: renamed from: c */
    public final void mo19014c() {
    }

    @Override // p479xa.InterfaceC10133c
    /* JADX INFO: renamed from: d */
    public final long mo19015d() {
        return SystemClock.elapsedRealtime();
    }
}
