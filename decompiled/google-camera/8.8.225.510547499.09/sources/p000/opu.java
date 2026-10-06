package p000;

import java.util.concurrent.Future;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class opu extends opv {

    /* JADX INFO: renamed from: a */
    private final Future f46405a;

    public opu(Future future) {
        this.f46405a = future;
    }

    @Override // p000.oni
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo1803a(Object obj) {
        mo18869b((Throwable) obj);
        return oki.f46196a;
    }

    @Override // p000.opw
    /* JADX INFO: renamed from: b */
    public final void mo18869b(Throwable th) {
        if (th != null) {
            this.f46405a.cancel(false);
        }
    }

    public final String toString() {
        return "CancelFutureOnCancel[" + this.f46405a + "]";
    }
}
