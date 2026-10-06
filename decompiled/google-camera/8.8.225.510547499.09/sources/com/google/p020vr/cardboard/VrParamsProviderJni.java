package com.google.p020vr.cardboard;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import p000.lij;
import p000.lkm;
import p000.ngy;
import p000.nxf;
import p000.nxl;
import p000.nxq;
import p000.nyb;
import p000.oew;
import p000.ofm;
import p000.ofq;
import p000.ofu;
import p000.ofv;
import p000.ofw;
import p000.ofx;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class VrParamsProviderJni {
    /* JADX INFO: renamed from: a */
    private static void m5186a(long j, DisplayMetrics displayMetrics, float f, int i) {
        nativeUpdateNativeDisplayParamsPointer(j, displayMetrics.widthPixels, displayMetrics.heightPixels, displayMetrics.xdpi, displayMetrics.ydpi, f, i);
    }

    private static native void nativeUpdateNativeDisplayParamsPointer(long j, int i, int i2, float f, float f2, float f3, int i3);

    private static byte[] readDeviceParams(Context context) {
        ofm ofmVarM15570K = lkm.m15570K(context);
        ofu ofuVarMo18451b = ofmVarM15570K.mo18451b();
        ofmVarM15570K.mo18454e();
        if (ofuVarMo18451b == null) {
            return null;
        }
        return ofuVarMo18451b.mo17760J();
    }

    private static void readDisplayParams(Context context, long j) {
        if (context == null) {
            Log.w("VrParamsProviderJni", "Missing context for phone params lookup. Results may be invalid.");
            m5186a(j, Resources.getSystem().getDisplayMetrics(), lij.m15402J(null), 0);
            return;
        }
        ofm ofmVarM15570K = lkm.m15570K(context);
        ofv ofvVarMo18452c = ofmVarM15570K.mo18452c();
        ofmVarM15570K.mo18454e();
        Display displayM15404L = lij.m15404L(context);
        DisplayMetrics displayMetricsM15403K = lij.m15403K(displayM15404L);
        if (ofvVarMo18452c != null) {
            if ((ofvVarMo18452c.f45885a & 1) != 0) {
                displayMetricsM15403K.xdpi = ofvVarMo18452c.f45886b;
            }
            if ((ofvVarMo18452c.f45885a & 2) != 0) {
                displayMetricsM15403K.ydpi = ofvVarMo18452c.f45887c;
            }
        }
        float fM15402J = lij.m15402J(ofvVarMo18452c);
        int i = oew.f45814a;
        DisplayCutout cutout = displayM15404L.getCutout();
        m5186a(j, displayMetricsM15403K, fM15402J, context.getResources().getConfiguration().orientation == 1 ? oew.m18445a("getSafeInsetTop", cutout) + oew.m18445a("getSafeInsetBottom", cutout) : oew.m18445a("getSafeInsetLeft", cutout) + oew.m18445a("getSafeInsetRight", cutout));
    }

    private static byte[] readSdkConfigurationParams(Context context) {
        ngy ngyVar;
        ngy ngyVar2 = ofq.f45867a;
        synchronized (ofq.class) {
            ngyVar = ofq.f45868b;
            if (ngyVar == null) {
                ofm ofmVarM15570K = lkm.m15570K(context);
                nxl nxlVarM18137O = ofx.f45891d.m18137O();
                ngy ngyVar3 = ofq.f45867a;
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nxq nxqVar = nxlVarM18137O.f44974b;
                ofx ofxVar = (ofx) nxqVar;
                ngyVar3.getClass();
                ofxVar.f45895c = ngyVar3;
                ofxVar.f45893a |= 2;
                if (!nxqVar.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ofx ofxVar2 = (ofx) nxlVarM18137O.f44974b;
                ofxVar2.f45893a |= 1;
                ofxVar2.f45894b = "1.228.0";
                ngy ngyVarMo18450a = ofmVarM15570K.mo18450a((ofx) nxlVarM18137O.mo18103l());
                if (ngyVarMo18450a == null) {
                    Log.w("SdkConfigurationReader", "VrParamsProvider returned null params, using defaults.");
                    ngyVarMo18450a = ofq.f45869c;
                } else {
                    ngyVarMo18450a.toString();
                }
                synchronized (ofq.class) {
                    ofq.f45868b = ngyVarMo18450a;
                }
                ofmVarM15570K.mo18454e();
                ngyVar = ofq.f45868b;
            }
        }
        return ngyVar.mo17760J();
    }

    private static byte[] readUserPrefs(Context context) {
        ofm ofmVarM15570K = lkm.m15570K(context);
        ofw ofwVarMo18453d = ofmVarM15570K.mo18453d();
        ofmVarM15570K.mo18454e();
        if (ofwVarMo18453d == null) {
            return null;
        }
        return ofwVarMo18453d.mo17760J();
    }

    private static boolean writeDeviceParams(Context context, byte[] bArr) {
        ofu ofuVar;
        ofm ofmVarM15570K = lkm.m15570K(context);
        if (bArr != null) {
            try {
                nxq nxqVarM18123Q = nxq.m18123Q(ofu.f45881a, bArr, 0, bArr.length, nxf.m18011a());
                nxq.m18132ae(nxqVarM18123Q);
                ofuVar = (ofu) nxqVarM18123Q;
            } catch (nyb e) {
                Log.w("VrParamsProviderJni", "Error parsing protocol buffer: " + e.toString());
                return false;
            } finally {
                ofmVarM15570K.mo18454e();
            }
        } else {
            ofuVar = null;
        }
        return ofmVarM15570K.mo18455f(ofuVar);
    }
}
