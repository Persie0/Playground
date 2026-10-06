package com.google.android.apps.camera.legacy.lightcycle.panorama;

import java.util.Map;
import p000.exg;
import p000.exh;
import p000.eya;
import p000.kbb;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class LightCycle$LightCycleProgressCallback {
    private LightCycle$LightCycleProgressCallback() {
    }

    public /* synthetic */ LightCycle$LightCycleProgressCallback(exg exgVar) {
        this();
    }

    public static void onProgress(int i, int i2) {
        Map map = exh.f20736c;
        Integer numValueOf = Integer.valueOf(i);
        if (map.containsKey(numValueOf)) {
            eya eyaVar = (eya) exh.f20736c.get(numValueOf);
            synchronized (eyaVar.f20939d.f20942b) {
                if (eyaVar.f20939d.f20942b.get()) {
                    return;
                }
                eyaVar.f20939d.f20941a.f6801b.mo9652b(kbb.m13897c(i2));
                long length = eyaVar.f20938c.length();
                if (length != eyaVar.f20936a) {
                    eyaVar.f20939d.f20941a.f6801b.m9945K();
                    eyaVar.f20936a = length;
                }
                eyaVar.f20939d.m8039h();
            }
        }
    }
}
