package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jus implements kba {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f34853a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f34854b;

    /* JADX INFO: renamed from: c */
    private final Object f34855c;

    public jus(chx chxVar, jvb jvbVar, int i) {
        this.f34854b = i;
        this.f34853a = chxVar;
        this.f34855c = jvbVar;
    }

    public jus(jut jutVar, int i) {
        this.f34854b = i;
        this.f34853a = jutVar;
        this.f34855c = new AtomicBoolean(false);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        switch (this.f34854b) {
            case 0:
                boolean z = true;
                if (((AtomicBoolean) this.f34855c).getAndSet(true)) {
                    return;
                }
                synchronized (((jut) this.f34853a).f34859d) {
                    Object obj = this.f34853a;
                    int i = ((jut) obj).f34857b - 1;
                    ((jut) obj).f34857b = i;
                    lku.m15670x(i >= 0, "The number of handles should never be negative.");
                    break;
                }
                Object obj2 = this.f34853a;
                jut jutVar = (jut) obj2;
                synchronized (jutVar.f34859d) {
                    if (((jut) obj2).f34861f) {
                        return;
                    }
                    if (((jut) obj2).f34857b == 0) {
                        jvt jvtVar = ((jut) obj2).f34858c;
                        if (jvtVar != null) {
                            jvtVar.m13587b(((jut) obj2).f34860e);
                            z = false;
                        } else {
                            ((jut) obj2).f34861f = true;
                        }
                    } else {
                        z = false;
                    }
                    if (z) {
                        jutVar.f34856a.close();
                        return;
                    }
                    return;
                }
            default:
                synchronized (((chx) this.f34853a).f5766a) {
                    ((jvb) this.f34855c).close();
                    break;
                }
                return;
        }
    }
}
