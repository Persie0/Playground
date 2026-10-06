package com.google.p020vr.ndk.base;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.StrictMode;
import java.util.ArrayList;
import p000.ofn;
import p000.ofp;
import p000.ofr;
import p000.ofs;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class GvrApi {

    /* JADX INFO: compiled from: PG */
    interface IdleListener {
        void onIdleChanged(boolean z);
    }

    /* JADX INFO: compiled from: PG */
    public interface PoseTracker {
        void getHeadPoseInStartSpace(float[] fArr, long j);
    }

    static {
        "robolectric".equals(Build.FINGERPRINT);
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            ofp.m18467a();
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    private static native long nativeGetUserPrefs(long j);

    private static native boolean nativeIsFeatureSupported(long j, int i);

    public static native boolean nativeUserPrefsIsFeatureEnabled(long j, int i);

    private static void requestFeatures(Context context, long j, int[] iArr, int[] iArr2, PendingIntent pendingIntent) {
        ofr[] ofrVarArrM18468a = ofr.m18468a(iArr);
        ofr[] ofrVarArrM18468a2 = ofr.m18468a(iArr2);
        ofs ofsVar = new ofs(nativeGetUserPrefs(j));
        Intent flags = new Intent("com.google.intent.action.vr.REQUEST_FEATURE").setComponent(ofn.f45863a).setFlags(268435456);
        ArrayList arrayList = new ArrayList();
        for (ofr ofrVar : ofrVarArrM18468a) {
            if (nativeIsFeatureSupported(j, ofrVar.f45873c) && !ofsVar.m18469a(ofrVar)) {
                arrayList.add(ofrVar.f45874d);
            }
        }
        if (!arrayList.isEmpty()) {
            flags.putExtra("required_features", (String[]) arrayList.toArray(new String[arrayList.size()]));
        }
        ArrayList arrayList2 = new ArrayList();
        for (ofr ofrVar2 : ofrVarArrM18468a2) {
            if (nativeIsFeatureSupported(j, ofrVar2.f45873c) && !ofsVar.m18469a(ofrVar2)) {
                arrayList2.add(ofrVar2.f45874d);
            }
        }
        if (!arrayList2.isEmpty()) {
            flags.putExtra("optional_features", (String[]) arrayList2.toArray(new String[arrayList2.size()]));
        }
        if (flags.getExtras() != null) {
            flags.putExtra("pending_intent", pendingIntent);
            context.startActivity(flags);
        }
    }

    public long getNativeGvrContext() {
        throw null;
    }
}
