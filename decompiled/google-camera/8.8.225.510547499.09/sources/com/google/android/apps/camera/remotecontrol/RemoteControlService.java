package com.google.android.apps.camera.remotecontrol;

import android.app.Service;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.apps.camera.cameravisionkit.olQ.BEeWZPor;
import p000.amp;
import p000.dhv;
import p000.dib;
import p000.dja;
import p000.emv;
import p000.fao;
import p000.fbt;
import p000.gui;
import p000.guk;
import p000.gum;
import p000.gun;
import p000.ivp;
import p000.lku;
import p000.mnp;
import p000.nbe;
import p000.nbh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class RemoteControlService extends Service {

    /* JADX INFO: renamed from: a */
    public static final nbh f6895a = nbh.m17259h("com/google/android/apps/camera/remotecontrol/RemoteControlService");

    /* JADX INFO: renamed from: b */
    public fao f6896b;

    /* JADX INFO: renamed from: d */
    public int f6898d;

    /* JADX INFO: renamed from: e */
    public dhv f6899e;

    /* JADX INFO: renamed from: f */
    public dja f6900f;

    /* JADX INFO: renamed from: g */
    public guk f6901g;

    /* JADX INFO: renamed from: i */
    private PackageManager f6903i;

    /* JADX INFO: renamed from: k */
    private amp f6905k;

    /* JADX INFO: renamed from: j */
    private int f6904j = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: h */
    public ivp f6902h = null;

    /* JADX INFO: renamed from: c */
    public boolean f6897c = false;

    /* JADX INFO: renamed from: l */
    private final ServiceConnection f6906l = new mnp(this, 1);

    /* JADX INFO: renamed from: m */
    private final gui f6907m = new gui(this);

    /* JADX INFO: renamed from: a */
    protected final synchronized dhv m4281a() {
        if (this.f6899e == null) {
            Object applicationContext = getApplicationContext();
            applicationContext.getClass();
            ((gum) ((emv) applicationContext).mo4193e(gum.class)).mo7823r(this);
        }
        return this.f6899e;
    }

    /* JADX INFO: renamed from: b */
    protected final synchronized dja m4282b() {
        if (this.f6900f == null) {
            Object applicationContext = getApplicationContext();
            applicationContext.getClass();
            ((gum) ((emv) applicationContext).mo4193e(gum.class)).mo7823r(this);
        }
        return this.f6900f;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized guk m4283c() {
        if (this.f6901g == null) {
            Object applicationContext = getApplicationContext();
            applicationContext.getClass();
            ((gum) ((emv) applicationContext).mo4193e(gum.class)).mo7823r(this);
        }
        return this.f6901g;
    }

    /* JADX INFO: renamed from: d */
    public final void m4284d(int i, boolean z) {
        Intent intent = new Intent("com.google.android.apps.camera.remotecontrol.remotekey");
        intent.putExtra(BEeWZPor.TWNenpfjmrdKroO, i);
        intent.putExtra("key_down", z);
        this.f6905k.m964d(intent);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m4286f() {
        int callingUid = Binder.getCallingUid();
        boolean z = false;
        if (!m4281a().mo6184l(dib.f11343bx)) {
            ((nbe) ((nbe) f6895a.m17251b()).mo17276G((char) 3274)).mo17290o("Feature not enabled.");
            return false;
        }
        if (this.f6904j == callingUid) {
            return true;
        }
        String[] packagesForUid = this.f6903i.getPackagesForUid(callingUid);
        if (packagesForUid == null || packagesForUid.length == 0) {
            ((nbe) ((nbe) f6895a.m17251b()).mo17276G((char) 3272)).mo17290o("Failed to get calling package name.");
            return false;
        }
        if (m4282b() != dja.ENG) {
            int i = gun.f26442a;
            if (!gun.m9780a(packagesForUid[0], this.f6903i)) {
                ((nbe) ((nbe) f6895a.m17251b()).mo17276G((char) 3273)).mo17290o("Failed to verify calling package.");
                return false;
            }
        }
        int iCheckPermission = this.f6903i.checkPermission("android.permission.CAMERA", packagesForUid[0]);
        int iCheckPermission2 = this.f6903i.checkPermission("android.permission.RECORD_AUDIO", packagesForUid[0]);
        boolean z2 = this.f6903i.checkPermission("android.permission.ACCESS_FINE_LOCATION", packagesForUid[0]) == 0 || this.f6903i.checkPermission("android.permission.ACCESS_COARSE_LOCATION", packagesForUid[0]) == 0;
        if (iCheckPermission == 0 && iCheckPermission2 == 0 && z2) {
            z = true;
        }
        if (z) {
            this.f6904j = callingUid;
        }
        return z;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (!m4281a().mo6184l(dib.f11343bx)) {
            return null;
        }
        this.f6904j = Integer.MIN_VALUE;
        return this.f6907m;
    }

    @Override // android.app.Service
    public final void onCreate() {
        this.f6903i = getPackageManager();
        this.f6896b = ((fbt) getApplication()).f21200j;
        super.onCreate();
        this.f6905k = amp.m961a(this);
        this.f6898d = 0;
        guk gukVarM4283c = m4283c();
        gukVarM4283c.f26433a = false;
        gukVarM4283c.f26435c = Integer.MIN_VALUE;
        gukVarM4283c.f26436d = Float.MIN_VALUE;
        gukVarM4283c.f26437e = 0L;
        gukVarM4283c.f26438f = Float.MIN_VALUE;
        gukVarM4283c.f26439g = 0L;
        this.f6901g.m9778c(true);
        Intent intent = new Intent();
        intent.setClassName("com.google.android.apps.photos", "com.google.android.apps.photos.cameraassistant.CameraAssistantService");
        bindService(intent, this.f6906l, 1);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        ServiceConnection serviceConnection = this.f6906l;
        lku.m15662p(serviceConnection);
        unbindService(serviceConnection);
        this.f6901g.m9778c(false);
        super.onDestroy();
    }

    /* JADX INFO: renamed from: e */
    public final void m4285e(boolean z) {
        ivp ivpVar;
        if (!this.f6897c || (ivpVar = this.f6902h) == null) {
            return;
        }
        try {
            if (z) {
                ivpVar.m3397A(1, ivpVar.m3398a());
            } else {
                ivpVar.m3397A(2, ivpVar.m3398a());
            }
        } catch (RemoteException e) {
            ((nbe) ((nbe) f6895a.m17251b()).mo17276G((char) 3270)).mo17290o("Error when calling into Photos service");
            e.printStackTrace();
        }
    }
}
