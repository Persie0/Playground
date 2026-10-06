package com.google.android.apps.camera.stats.timing;

import p000.hkv;
import p000.hlc;
import p000.kbz;
import p000.kcc;
import p000.ksa;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class OneCameraTiming extends hlc {

    /* JADX INFO: renamed from: a */
    public final kbz f6970a;

    /* JADX INFO: renamed from: b */
    public kcc f6971b;

    public OneCameraTiming(ksa ksaVar, kbz kbzVar) {
        super(ksaVar, hkv.values());
        this.f6971b = kcc.f35555b;
        this.f6970a = kbzVar;
    }

    public long getOneCameraCreateNs() {
        return m10436g(hkv.ONECAMERA_CREATE);
    }

    public long getOneCameraCreatedNs() {
        return m10436g(hkv.ONECAMERA_CREATED);
    }
}
