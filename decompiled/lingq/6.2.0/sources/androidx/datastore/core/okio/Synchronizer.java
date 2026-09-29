package androidx.datastore.core.okio;

import p000.ui3;

/* JADX INFO: loaded from: classes2.dex */
public final class Synchronizer {
    public final <T> T withLock(ui3 ui3Var) {
        T t;
        ui3Var.getClass();
        synchronized (this) {
            t = (T) ui3Var.mo0a();
        }
        return t;
    }
}
