package androidx.datastore.core.okio;

import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.InterProcessCoordinatorKt;
import p000.d57;
import p000.gz8;

/* JADX INFO: loaded from: classes2.dex */
public final class OkioStorageKt {
    public static final InterProcessCoordinator createSingleProcessCoordinator(d57 d57Var) {
        d57Var.getClass();
        return InterProcessCoordinatorKt.createSingleProcessCoordinator(gz8.m12976h(d57Var.f35014a.m18089r(), true).f35014a.m18089r());
    }
}
