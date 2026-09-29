package p000;

import androidx.datastore.core.MultiProcessCoordinator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b56 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7965a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MultiProcessCoordinator f7966b;

    public /* synthetic */ b56(MultiProcessCoordinator multiProcessCoordinator, int i) {
        this.f7965a = i;
        this.f7966b = multiProcessCoordinator;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f7965a;
        MultiProcessCoordinator multiProcessCoordinator = this.f7966b;
        switch (i) {
            case 0:
                return MultiProcessCoordinator.lockFile_delegate$lambda$0(multiProcessCoordinator);
            case 1:
                return MultiProcessCoordinator.lazySharedCounter$lambda$0(multiProcessCoordinator);
            default:
                return MultiProcessCoordinator.lazySharedCounter$lambda$0$0(multiProcessCoordinator);
        }
    }
}
