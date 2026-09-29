package androidx.datastore.core;

/* JADX INFO: loaded from: classes.dex */
public final class InterProcessCoordinatorKt {
    public static final InterProcessCoordinator createSingleProcessCoordinator(String str) {
        str.getClass();
        return new SingleProcessCoordinator(str);
    }
}
