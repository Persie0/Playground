package com.google.android.apps.camera.wear.wearv2;

import android.app.KeyguardManager;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.diagnostics.p003tK.KMNlNMe;
import p000.irg;
import p000.jrd;
import p000.jtk;
import p000.nbe;
import p000.nbh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class DataLayerListenerService extends jrd {

    /* JADX INFO: renamed from: f */
    private static final nbh f7321f = nbh.m17259h(KMNlNMe.wsyHmUQhm);

    @Override // p000.jrd, p000.jqv
    /* JADX INFO: renamed from: a */
    public final void mo4518a(jtk jtkVar) {
        if (!"/sending_time".equals(jtkVar.f34778b)) {
            String str = jtkVar.f34778b;
        }
        if (!"/start-activity".equals(jtkVar.f34778b)) {
            ((nbe) ((nbe) f7321f.m17252c()).mo17276G(4375)).mo17293r("Unsupported message path :%s", jtkVar.f34778b);
            return;
        }
        if (irg.f31863b) {
            return;
        }
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(268435466, "Camera:ScreenOnForWearable");
        wakeLockNewWakeLock.acquire(1000L);
        try {
            wakeLockNewWakeLock.release();
        } catch (RuntimeException e) {
            ((nbe) ((nbe) ((nbe) f7321f.m17252c()).mo17283h(e)).mo17276G((char) 4373)).mo17290o("Failed to release wakelock");
        }
        KeyguardManager keyguardManager = (KeyguardManager) getSystemService("keyguard");
        startActivity(new Intent((keyguardManager == null || !keyguardManager.isKeyguardLocked()) ? "android.media.action.STILL_IMAGE_CAMERA" : "android.media.action.STILL_IMAGE_CAMERA_SECURE").addFlags(268435456).putExtra("extra_turn_screen_on", true).putExtra("extra_launch_fom_wear", true).setPackage(getPackageName()));
    }
}
