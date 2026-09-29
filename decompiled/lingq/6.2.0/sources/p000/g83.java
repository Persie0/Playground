package p000;

import kotlinx.coroutines.flow.internal.ChildCancelledException;

/* JADX INFO: loaded from: classes.dex */
public final class g83 extends cn8 {
    @Override // kotlinx.coroutines.C3213d
    /* JADX INFO: renamed from: E */
    public final boolean mo12414E(Throwable th) {
        if (th instanceof ChildCancelledException) {
            return true;
        }
        return m15518y(th);
    }
}
