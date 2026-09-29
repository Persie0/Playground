package com.clevertap.android.sdk.inapp;

import androidx.fragment.app.ActivityC0979t;
import androidx.fragment.app.C0940a;
import androidx.fragment.app.FragmentManager;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import p290o6.C7979r0;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2221h extends AbstractC2211c {
    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: J */
    public final void mo3562J() {
        this.f6090a0 = true;
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: O */
    public final void mo3566O() {
        this.f6090a0 = true;
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: S */
    public final void mo3570S() {
        this.f6090a0 = true;
        if (this.f11179A0.get()) {
            mo6512m0();
        }
    }

    @Override // com.clevertap.android.sdk.inapp.AbstractC2211c
    /* JADX INFO: renamed from: m0 */
    final void mo6512m0() {
        FragmentManager fragmentManager;
        ActivityC0979t activityC0979tM3582e = m3582e();
        boolean z10 = C7979r0.f43406a;
        boolean z11 = activityC0979tM3582e == null || activityC0979tM3582e.isFinishing() || activityC0979tM3582e.isDestroyed();
        AtomicBoolean atomicBoolean = this.f11179A0;
        if (!z11 && !atomicBoolean.get() && (fragmentManager = this.f6077O) != null) {
            C0940a c0940a = new C0940a(fragmentManager);
            try {
                c0940a.m3700l(this);
                c0940a.m3697i();
            } catch (IllegalStateException unused) {
                C0940a c0940a2 = new C0940a(fragmentManager);
                c0940a2.m3700l(this);
                c0940a2.m3698j(true);
            }
        }
        atomicBoolean.set(true);
    }

    @Override // com.clevertap.android.sdk.inapp.AbstractC2211c
    /* JADX INFO: renamed from: p0 */
    public final void mo6515p0() {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f11183w0;
        if (cleverTapInstanceConfig != null) {
            this.f11180B0 = new WeakReference<>(CleverTapAPI.m6423j(this.f11184x0, cleverTapInstanceConfig, null).f10981b.f43478h);
        }
    }
}
