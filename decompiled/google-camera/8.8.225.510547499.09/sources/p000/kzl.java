package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kzl extends AtomicReference {
    public kzl() {
    }

    /* JADX INFO: renamed from: a */
    public final void m15091a(kzf kzfVar) {
        kzf kzfVar2 = (kzf) getAndSet(kzfVar);
        if (kzfVar2 == null || kzfVar2 == kzfVar) {
            return;
        }
        kzfVar2.close();
    }

    public kzl(byte[] bArr) {
        super(null);
    }
}
