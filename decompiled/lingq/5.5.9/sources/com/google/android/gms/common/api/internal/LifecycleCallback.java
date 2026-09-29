package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.fragment.app.ActivityC0979t;
import androidx.fragment.app.C0940a;
import androidx.fragment.app.C0949e0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p152hb.C5964d2;
import p152hb.C5965e;
import p152hb.FragmentC5956b2;
import p152hb.InterfaceC5968f;
import p176ib.C6272i;

/* JADX INFO: loaded from: classes.dex */
public class LifecycleCallback {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5968f f13913a;

    public LifecycleCallback(InterfaceC5968f interfaceC5968f) {
        this.f13913a = interfaceC5968f;
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: c */
    public static InterfaceC5968f m7571c(C5965e c5965e) {
        FragmentC5956b2 fragmentC5956b2;
        C5964d2 c5964d2;
        Activity activity = c5965e.f35462a;
        if (!(activity instanceof ActivityC0979t)) {
            if (!(activity instanceof Activity)) {
                throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
            }
            WeakHashMap weakHashMap = FragmentC5956b2.f35423d;
            WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
            if (weakReference == null || (fragmentC5956b2 = (FragmentC5956b2) weakReference.get()) == null) {
                try {
                    fragmentC5956b2 = (FragmentC5956b2) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                    if (fragmentC5956b2 == null || fragmentC5956b2.isRemoving()) {
                        fragmentC5956b2 = new FragmentC5956b2();
                        activity.getFragmentManager().beginTransaction().add(fragmentC5956b2, "LifecycleFragmentImpl").commitAllowingStateLoss();
                    }
                    weakHashMap.put(activity, new WeakReference(fragmentC5956b2));
                } catch (ClassCastException e10) {
                    throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e10);
                }
            }
            return fragmentC5956b2;
        }
        ActivityC0979t activityC0979t = (ActivityC0979t) activity;
        WeakHashMap weakHashMap2 = C5964d2.f35458y0;
        WeakReference weakReference2 = (WeakReference) weakHashMap2.get(activityC0979t);
        if (weakReference2 == null || (c5964d2 = (C5964d2) weakReference2.get()) == null) {
            try {
                c5964d2 = (C5964d2) activityC0979t.m3805K().m3616D("SupportLifecycleFragmentImpl");
                if (c5964d2 == null || c5964d2.f6070H) {
                    c5964d2 = new C5964d2();
                    C0949e0 c0949e0M3805K = activityC0979t.m3805K();
                    c0949e0M3805K.getClass();
                    C0940a c0940a = new C0940a(c0949e0M3805K);
                    c0940a.mo3695f(0, c5964d2, "SupportLifecycleFragmentImpl", 1);
                    c0940a.m3698j(true);
                }
                weakHashMap2.put(activityC0979t, new WeakReference(c5964d2));
            } catch (ClassCastException e11) {
                throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e11);
            }
        }
        return c5964d2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Keep
    private static InterfaceC5968f getChimeraLifecycleFragmentImpl(C5965e c5965e) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    /* JADX INFO: renamed from: a */
    public void mo7572a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* JADX INFO: renamed from: b */
    public final Activity m7573b() {
        Activity activityMo12396e = this.f13913a.mo12396e();
        C6272i.m12915i(activityMo12396e);
        return activityMo12396e;
    }

    /* JADX INFO: renamed from: d */
    public void mo7574d(int i10, int i11, Intent intent) {
    }

    /* JADX INFO: renamed from: e */
    public void mo7575e(Bundle bundle) {
    }

    /* JADX INFO: renamed from: f */
    public void mo7576f() {
    }

    /* JADX INFO: renamed from: g */
    public void mo7577g(Bundle bundle) {
    }

    /* JADX INFO: renamed from: h */
    public void mo7578h() {
    }

    /* JADX INFO: renamed from: i */
    public void mo7579i() {
    }
}
