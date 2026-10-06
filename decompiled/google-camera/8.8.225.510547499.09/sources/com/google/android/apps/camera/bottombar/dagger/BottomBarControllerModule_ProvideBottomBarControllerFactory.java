package com.google.android.apps.camera.bottombar.dagger;

import com.google.android.apps.camera.bottombar.BottomBarController;
import p000.dhv;
import p000.iid;
import p000.ohi;
import p000.oju;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class BottomBarControllerModule_ProvideBottomBarControllerFactory implements ohi {
    private final oju cameraUiProvider;
    private final oju gcaConfigProvider;
    private final BottomBarControllerModule module;

    public BottomBarControllerModule_ProvideBottomBarControllerFactory(BottomBarControllerModule bottomBarControllerModule, oju ojuVar, oju ojuVar2) {
        this.module = bottomBarControllerModule;
        this.cameraUiProvider = ojuVar;
        this.gcaConfigProvider = ojuVar2;
    }

    public static BottomBarControllerModule_ProvideBottomBarControllerFactory create(BottomBarControllerModule bottomBarControllerModule, oju ojuVar, oju ojuVar2) {
        return new BottomBarControllerModule_ProvideBottomBarControllerFactory(bottomBarControllerModule, ojuVar, ojuVar2);
    }

    public static BottomBarController provideBottomBarController(BottomBarControllerModule bottomBarControllerModule, iid iidVar, dhv dhvVar) {
        BottomBarController bottomBarControllerProvideBottomBarController = bottomBarControllerModule.provideBottomBarController(iidVar, dhvVar);
        bottomBarControllerProvideBottomBarController.getClass();
        return bottomBarControllerProvideBottomBarController;
    }

    @Override // p000.oju
    public BottomBarController get() {
        return provideBottomBarController(this.module, (iid) this.cameraUiProvider.get(), (dhv) this.gcaConfigProvider.get());
    }
}
