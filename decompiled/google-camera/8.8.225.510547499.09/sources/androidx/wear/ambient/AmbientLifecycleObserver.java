package androidx.wear.ambient;

import android.app.Activity;
import android.os.Bundle;
import java.util.concurrent.Executor;
import p000.akv;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class AmbientLifecycleObserver implements AmbientLifecycleObserverInterface {

    /* JADX INFO: renamed from: a */
    private final AmbientDelegate f1688a;

    /* JADX INFO: renamed from: b */
    private final AmbientLifecycleObserver$callbackTranslator$1 f1689b;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.wear.ambient.AmbientDelegate$AmbientCallback, androidx.wear.ambient.AmbientLifecycleObserver$callbackTranslator$1] */
    public AmbientLifecycleObserver(Activity activity, final AmbientLifecycleObserverInterface.AmbientLifecycleCallback ambientLifecycleCallback) {
        activity.getClass();
        ambientLifecycleCallback.getClass();
        ?? r0 = new AmbientDelegate.AmbientCallback() { // from class: androidx.wear.ambient.AmbientLifecycleObserver$callbackTranslator$1
            @Override // androidx.wear.ambient.AmbientDelegate.AmbientCallback
            public final void onAmbientOffloadInvalidated() {
            }

            @Override // androidx.wear.ambient.AmbientDelegate.AmbientCallback
            public final void onEnterAmbient(Bundle bundle) {
                ambientLifecycleCallback.onEnterAmbient(new AmbientLifecycleObserverInterface.AmbientDetails(bundle != null ? bundle.getBoolean("com.google.android.wearable.compat.extra.BURN_IN_PROTECTION") : false, bundle != null ? bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT") : false));
            }

            @Override // androidx.wear.ambient.AmbientDelegate.AmbientCallback
            public final void onExitAmbient() {
                ambientLifecycleCallback.onExitAmbient();
            }

            @Override // androidx.wear.ambient.AmbientDelegate.AmbientCallback
            public final void onUpdateAmbient() {
                ambientLifecycleCallback.onUpdateAmbient();
            }
        };
        this.f1689b = r0;
        this.f1688a = new AmbientDelegate(activity, (AmbientDelegate.AmbientCallback) r0);
    }

    /* JADX INFO: renamed from: a */
    public static final void m1624a(Runnable runnable) {
        runnable.run();
    }

    @Override // androidx.wear.ambient.AmbientLifecycleObserverInterface
    public final boolean isAmbient() {
        return this.f1688a.m1605h();
    }

    @Override // p000.akl
    public final void onCreate(akv akvVar) {
        akvVar.getClass();
        this.f1688a.m1599b();
        this.f1688a.m1604g();
    }

    @Override // p000.akl
    public final void onDestroy(akv akvVar) {
        akvVar.getClass();
        this.f1688a.m1600c();
    }

    @Override // p000.akl
    public final void onPause(akv akvVar) {
        akvVar.getClass();
        this.f1688a.m1601d();
    }

    @Override // p000.akl
    public final void onResume(akv akvVar) {
        akvVar.getClass();
        this.f1688a.m1602e();
    }

    @Override // p000.akl
    public final /* synthetic */ void onStart(akv akvVar) {
        akvVar.getClass();
    }

    @Override // p000.akl
    public final void onStop(akv akvVar) {
        akvVar.getClass();
        this.f1688a.m1603f();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.wear.ambient.AmbientDelegate$AmbientCallback, androidx.wear.ambient.AmbientLifecycleObserver$callbackTranslator$1] */
    public AmbientLifecycleObserver(Activity activity, Executor executor, final AmbientLifecycleObserverInterface.AmbientLifecycleCallback ambientLifecycleCallback) {
        activity.getClass();
        executor.getClass();
        ambientLifecycleCallback.getClass();
        ?? r2 = new AmbientDelegate.AmbientCallback() { // from class: androidx.wear.ambient.AmbientLifecycleObserver$callbackTranslator$1
            @Override // androidx.wear.ambient.AmbientDelegate.AmbientCallback
            public final void onAmbientOffloadInvalidated() {
            }

            @Override // androidx.wear.ambient.AmbientDelegate.AmbientCallback
            public final void onEnterAmbient(Bundle bundle) {
                ambientLifecycleCallback.onEnterAmbient(new AmbientLifecycleObserverInterface.AmbientDetails(bundle != null ? bundle.getBoolean("com.google.android.wearable.compat.extra.BURN_IN_PROTECTION") : false, bundle != null ? bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT") : false));
            }

            @Override // androidx.wear.ambient.AmbientDelegate.AmbientCallback
            public final void onExitAmbient() {
                ambientLifecycleCallback.onExitAmbient();
            }

            @Override // androidx.wear.ambient.AmbientDelegate.AmbientCallback
            public final void onUpdateAmbient() {
                ambientLifecycleCallback.onUpdateAmbient();
            }
        };
        this.f1689b = r2;
        this.f1688a = new AmbientDelegate(activity, (AmbientDelegate.AmbientCallback) r2);
    }
}
