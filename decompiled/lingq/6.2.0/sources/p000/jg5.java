package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jg5 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45519a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AtomicBoolean f45520b;

    public /* synthetic */ jg5(AtomicBoolean atomicBoolean, int i) {
        this.f45519a = i;
        this.f45520b = atomicBoolean;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f45519a;
        AtomicBoolean atomicBoolean = this.f45520b;
        switch (i) {
            case 0:
                atomicBoolean.set(true);
                break;
            default:
                atomicBoolean.set(true);
                break;
        }
    }
}
