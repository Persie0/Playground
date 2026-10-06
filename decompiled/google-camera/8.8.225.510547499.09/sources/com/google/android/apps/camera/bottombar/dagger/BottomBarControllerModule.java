package com.google.android.apps.camera.bottombar.dagger;

import com.google.android.apps.camera.bottombar.BottomBarController;
import p000.dhv;
import p000.iid;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class BottomBarControllerModule {
    public BottomBarController provideBottomBarController(iid iidVar, dhv dhvVar) {
        return new BottomBarController(iidVar.f31069f, dhvVar);
    }
}
