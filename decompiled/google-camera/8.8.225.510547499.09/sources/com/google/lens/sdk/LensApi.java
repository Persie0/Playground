package com.google.lens.sdk;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import p000.iuw;
import p000.iva;
import p000.ivc;
import p000.ivj;
import p000.kha;
import p000.kuq;
import p000.kur;
import p000.kut;
import p000.kuv;
import p000.kuz;
import p000.lle;
import p000.lmg;
import p000.nvf;
import p000.nvg;
import p000.nvk;
import p000.nvl;
import p000.nvm;
import p000.nvn;
import p000.nxl;
import p000.nxn;
import p000.ofk;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class LensApi {

    /* JADX INFO: renamed from: a */
    static final Uri f8406a = Uri.parse("googleapp://lens");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f8407d = 0;

    /* JADX INFO: renamed from: b */
    public final kut f8408b;

    /* JADX INFO: renamed from: c */
    public final KeyguardManager f8409c;

    /* JADX INFO: renamed from: e */
    private final kuq f8410e;

    /* JADX INFO: compiled from: PG */
    /* JADX INFO: loaded from: classes2.dex */
    public interface LensAvailabilityCallback {
        void onAvailabilityStatusFetched(int i);
    }

    /* JADX INFO: compiled from: PG */
    public @interface LensAvailabilityStatus {
        public static final int LENS_AVAILABILITY_UNKNOWN = -1;
        public static final int LENS_READY = 0;
        public static final int LENS_UNAVAILABLE = 1;
        public static final int LENS_UNAVAILABLE_AGSA_OUTDATED = 6;

        @Deprecated
        public static final int LENS_UNAVAILABLE_ASSISTANT_EYES_FLAG_DISABLED = 8;
        public static final int LENS_UNAVAILABLE_DEVICE_INCOMPATIBLE = 3;
        public static final int LENS_UNAVAILABLE_DEVICE_LOCKED = 5;
        public static final int LENS_UNAVAILABLE_FEATURE_UNAVAILABLE = 11;
        public static final int LENS_UNAVAILABLE_INVALID_CURSOR = 4;

        @Deprecated
        public static final int LENS_UNAVAILABLE_LOCALE_NOT_SUPPORTED = 2;
        public static final int LENS_UNAVAILABLE_SERVICE_BUSY_FAILURE = 10;
        public static final int LENS_UNAVAILABLE_SERVICE_UNAVAILABLE = 9;
        public static final int LENS_UNAVAILABLE_UNKNOWN_ERROR_CODE = 12;
    }

    /* JADX INFO: compiled from: PG */
    public @interface LensFeature {
        public static final int LENS_AR_STICKERS = 1;
        public static final int LENS_CORE = 0;
    }

    /* JADX INFO: compiled from: PG */
    /* JADX INFO: loaded from: classes2.dex */
    public @interface LensLaunchStatus {
        public static final int LAUNCH_FAILURE_UNLOCK_FAILED = 1;
        public static final int LAUNCH_SUCCESS = 0;
    }

    /* JADX INFO: compiled from: PG */
    /* JADX INFO: loaded from: classes2.dex */
    public interface LensLaunchStatusCallback {
        void onLaunchStatusFetched(int i);
    }

    public LensApi(Context context) {
        this.f8409c = (KeyguardManager) context.getSystemService("keyguard");
        kuq kuqVar = new kuq(context);
        this.f8410e = kuqVar;
        this.f8408b = new kut(context, kuqVar);
    }

    /* JADX INFO: renamed from: h */
    public static final void m5163h(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(f8406a);
        activity.startActivityForResult(intent, 0);
    }

    /* JADX INFO: renamed from: i */
    private final void m5164i(Activity activity, LensLaunchStatusCallback lensLaunchStatusCallback, Runnable runnable) {
        if (!this.f8409c.isKeyguardLocked()) {
            runnable.run();
            if (lensLaunchStatusCallback != null) {
                lensLaunchStatusCallback.onLaunchStatusFetched(0);
                return;
            }
            return;
        }
        if (activity != null) {
            m5168c(activity, lensLaunchStatusCallback, runnable);
            return;
        }
        Log.e("LensApi", "Cannot start Lens when device is locked with Android " + Build.VERSION.SDK_INT);
        if (lensLaunchStatusCallback != null) {
            lensLaunchStatusCallback.onLaunchStatusFetched(1);
        }
    }

    /* JADX INFO: renamed from: j */
    private final boolean m5165j(String str) {
        String str2 = this.f8410e.f37252f.f37313c;
        if (TextUtils.isEmpty(str2)) {
            return true;
        }
        String[] strArrSplit = str2.split("\\.", -1);
        String[] strArrSplit2 = str.split("\\.", -1);
        int iMin = Math.min(strArrSplit.length, strArrSplit2.length);
        for (int i = 0; i < iMin; i++) {
            int i2 = Integer.parseInt(strArrSplit[i]);
            int i3 = Integer.parseInt(strArrSplit2[i]);
            if (i2 < i3) {
                return true;
            }
            if (i2 > i3) {
                return false;
            }
        }
        return strArrSplit.length < strArrSplit2.length;
    }

    /* JADX INFO: renamed from: a */
    public final ivj m5166a() {
        kut kutVar = this.f8408b;
        lle.m15692l();
        lle.m15693m(kutVar.f37257a.mo14916f(), "getLensCapabilities() called when Lens is not ready.");
        if (!kutVar.f37257a.mo14916f()) {
            return ivj.f32272c;
        }
        kuv kuvVar = kutVar.f37257a;
        lle.m15692l();
        kuz kuzVar = (kuz) kuvVar;
        lle.m15693m(kuzVar.m14924l(), "Attempted to use LensCapabilities before ready.");
        return kuzVar.f37272g;
    }

    /* JADX INFO: renamed from: b */
    public final void m5167b(Bitmap bitmap, nvn nvnVar) {
        if (this.f8408b.m14910e() != 2) {
            return;
        }
        ofk ofkVarM17746d = nvnVar.m17746d();
        ofkVarM17746d.f45859g = bitmap;
        m5169d(ofkVarM17746d.m18465b());
    }

    /* JADX INFO: renamed from: c */
    public final void m5168c(Activity activity, LensLaunchStatusCallback lensLaunchStatusCallback, Runnable runnable) {
        this.f8409c.requestDismissKeyguard(activity, new nvl(runnable, lensLaunchStatusCallback));
    }

    public void checkArStickersAvailability(LensAvailabilityCallback lensAvailabilityCallback) {
        this.f8410e.m14903a(new nvm(lensAvailabilityCallback, 1));
    }

    public void checkLensAvailability(LensAvailabilityCallback lensAvailabilityCallback) {
        this.f8409c.isKeyguardLocked();
        if (m5165j("8.3")) {
            lensAvailabilityCallback.onAvailabilityStatusFetched(6);
        } else {
            this.f8410e.m14903a(new nvm(lensAvailabilityCallback, 0));
        }
    }

    public void checkPendingIntentAvailability(LensAvailabilityCallback lensAvailabilityCallback) {
        this.f8409c.isKeyguardLocked();
        if (m5165j("9.72")) {
            lensAvailabilityCallback.onAvailabilityStatusFetched(6);
            return;
        }
        kut kutVar = this.f8408b;
        nvk nvkVar = new nvk(lensAvailabilityCallback, 1);
        lle.m15692l();
        kutVar.m14909d(new kur(kutVar, nvkVar, 0));
    }

    public void checkPostCaptureAvailability(LensAvailabilityCallback lensAvailabilityCallback) {
        this.f8409c.isKeyguardLocked();
        if (m5165j("8.19")) {
            lensAvailabilityCallback.onAvailabilityStatusFetched(6);
            return;
        }
        kut kutVar = this.f8408b;
        nvk nvkVar = new nvk(lensAvailabilityCallback, 0);
        lle.m15692l();
        kutVar.m14909d(new kur(kutVar, nvkVar, 1));
    }

    /* JADX INFO: renamed from: e */
    public final boolean m5170e() {
        return (m5166a().f32274a & 2) != 0;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m5171f(Bitmap bitmap, nvn nvnVar) {
        if (bitmap == null) {
            Log.w("LensApi", "launchLensActivityWithBitmap: bitmap should not be null.");
        }
        if (this.f8409c.isKeyguardLocked()) {
            Log.e("LensApi", "Cannot start Lens with Bitmap when device is locked.");
            return false;
        }
        if (this.f8408b.m14910e() != 2) {
            return false;
        }
        ofk ofkVarM17746d = nvnVar.m17746d();
        ofkVarM17746d.f45859g = bitmap;
        m5169d(ofkVarM17746d.m18465b());
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m5172g(nvn nvnVar, PendingIntentConsumer pendingIntentConsumer) {
        if (this.f8408b.m14911f() != 2) {
            return false;
        }
        kut kutVar = this.f8408b;
        kutVar.m14908c(nvnVar.m17744a(kutVar.m14906a()));
        kut kutVar2 = this.f8408b;
        kutVar2.m14906a();
        Bundle bundleM17745b = nvnVar.m17745b();
        lle.m15692l();
        kutVar2.f37258b = pendingIntentConsumer;
        if (kutVar2.f37257a.mo14916f()) {
            nxn nxnVar = (nxn) ivc.f32254c.m18137O();
            if (!nxnVar.f44974b.m18142ac()) {
                nxnVar.mo18106p();
            }
            ivc ivcVar = (ivc) nxnVar.f44974b;
            ivcVar.f32257b = 412;
            ivcVar.f32256a |= 1;
            try {
                kutVar2.f37257a.mo14913c(((ivc) nxnVar.mo18103l()).mo17760J(), new iva(bundleM17745b));
                return true;
            } catch (RemoteException | SecurityException e) {
                Log.e("LensServiceBridge", "Failed to send Lens service client event", e);
            }
        }
        Log.e("LensApi", "Failed to request pending intent.");
        return false;
    }

    @Deprecated
    public void launchLensActivity(Activity activity) {
        m5164i(activity, null, new lmg(activity, 18));
    }

    public boolean launchLensActivityWithBitmap(Bitmap bitmap) {
        if (this.f8409c.isKeyguardLocked()) {
            Log.e("LensApi", "Cannot start Lens with Bitmap when device is locked.");
            return false;
        }
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        ofk ofkVarM17743c = nvn.m17743c();
        ofkVarM17743c.f45855c = Long.valueOf(jElapsedRealtimeNanos);
        return m5171f(bitmap, ofkVarM17743c.m18465b());
    }

    public boolean launchLensActivityWithBitmapForTranslate(Bitmap bitmap) {
        if (!m5170e()) {
            Log.e("LensApi", "Translate is not supported.");
            return false;
        }
        nxl nxlVarM18137O = nvg.f44740c.m18137O();
        nvf nvfVar = nvf.f44738a;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nvg nvgVar = (nvg) nxlVarM18137O.f44974b;
        nvfVar.getClass();
        nvgVar.f44743b = nvfVar;
        nvgVar.f44742a = 2;
        nvg nvgVar2 = (nvg) nxlVarM18137O.mo18103l();
        ofk ofkVarM17743c = nvn.m17743c();
        ofkVarM17743c.f45856d = 5;
        ofkVarM17743c.f45854b = nvgVar2;
        return m5171f(bitmap, ofkVarM17743c.m18465b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.ServiceConnection, kuv] */
    public void onPause() {
        kut kutVar = this.f8408b;
        lle.m15692l();
        ?? r1 = kutVar.f37257a;
        lle.m15692l();
        kuz kuzVar = (kuz) r1;
        if (kuzVar.m14924l()) {
            nxn nxnVar = (nxn) ivc.f32254c.m18137O();
            if (!nxnVar.f44974b.m18142ac()) {
                nxnVar.mo18106p();
            }
            ivc ivcVar = (ivc) nxnVar.f44974b;
            ivcVar.f32257b = 345;
            ivcVar.f32256a |= 1;
            ivc ivcVar2 = (ivc) nxnVar.mo18103l();
            try {
                iuw iuwVar = ((kuz) r1).f37275j;
                lle.m15694n(iuwVar);
                iuwVar.m11800e(ivcVar2.mo17760J());
            } catch (RemoteException | SecurityException e) {
                Log.e("LensServiceConnImpl", "Unable to end Lens service session.", e);
            }
            kuzVar.f37275j = null;
            kuzVar.f37270e = 0;
            kuzVar.f37271f = null;
            kuzVar.f37272g = null;
        }
        if (kuzVar.m14923k()) {
            try {
                ((kuz) r1).f37267b.unbindService(r1);
            } catch (IllegalArgumentException e2) {
                Log.w("LensServiceConnImpl", "Unable to unbind, service is not registered.");
            }
            kuzVar.f37274i = null;
        }
        kuzVar.f37273h = 1;
        kuzVar.m14921i(1);
        kutVar.f37258b = null;
    }

    public void onResume() {
        kut kutVar = this.f8408b;
        lle.m15692l();
        ((kuz) kutVar.f37257a).m14925m();
    }

    public boolean requestLensActivityPendingIntent(PendingIntentConsumer pendingIntentConsumer) {
        return m5172g(nvn.m17743c().m18465b(), pendingIntentConsumer);
    }

    public boolean requestLensActivityPendingIntentWithBitmap(Bitmap bitmap, PendingIntentConsumer pendingIntentConsumer) {
        ofk ofkVarM17743c = nvn.m17743c();
        ofkVarM17743c.f45859g = bitmap;
        return m5172g(ofkVarM17743c.m18465b(), pendingIntentConsumer);
    }

    public boolean requestLensActivityPendingIntentWithBitmapUri(Context context, Uri uri, PendingIntentConsumer pendingIntentConsumer) {
        if (context != null) {
            context.grantUriPermission("com.google.android.googlequicksearchbox", uri, 1);
        }
        ofk ofkVarM17743c = nvn.m17743c();
        ofkVarM17743c.f45858f = uri;
        return m5172g(ofkVarM17743c.m18465b(), pendingIntentConsumer);
    }

    @Deprecated
    public void launchLensActivity(Activity activity, int i) {
        switch (i) {
            case 0:
                m5164i(activity, null, new lmg(activity, 19));
                break;
            case 1:
                int iM15691k = lle.m15691k(this.f8410e.f37252f.f37315e);
                if (iM15691k != 0 && iM15691k == 2) {
                    Intent intent = new Intent();
                    intent.setClassName("com.google.ar.lens", "com.google.vr.apps.ornament.app.MainActivity");
                    activity.startActivity(intent);
                }
                break;
            default:
                Log.w("LensApi", "Invalid lens activity: " + i);
                break;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m5169d(nvn nvnVar) {
        if (nvnVar.f44759a != null || nvnVar.f44760b != null) {
            kut kutVar = this.f8408b;
            if (!kutVar.m14908c(nvnVar.m17744a(kutVar.m14906a()))) {
                return;
            }
        }
        kut kutVar2 = this.f8408b;
        kutVar2.m14906a();
        Bundle bundleM17745b = nvnVar.m17745b();
        lle.m15692l();
        if (kutVar2.f37257a.mo14916f()) {
            nxn nxnVar = (nxn) ivc.f32254c.m18137O();
            if (!nxnVar.f44974b.m18142ac()) {
                nxnVar.mo18106p();
            }
            ivc ivcVar = (ivc) nxnVar.f44974b;
            ivcVar.f32257b = 355;
            ivcVar.f32256a |= 1;
            try {
                kutVar2.f37257a.mo14913c(((ivc) nxnVar.mo18103l()).mo17760J(), new iva(bundleM17745b));
                kutVar2.f37257a.mo14914d();
                return;
            } catch (RemoteException | SecurityException e) {
                Log.e("LensServiceBridge", "Failed to start Lens", e);
            }
        }
        Log.e("LensApi", "Failed to start lens.");
    }

    public void launchLensActivity(Activity activity, LensLaunchStatusCallback lensLaunchStatusCallback) {
        m5164i(activity, lensLaunchStatusCallback, new kha(this, activity, nvn.m17743c().m18465b(), 11));
    }
}
