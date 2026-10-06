package p000;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import androidx.wear.ambient.WearableControllerProvider;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class axi implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    private final axj f2652a;

    /* JADX INFO: renamed from: b */
    private final WeakReference f2653b;

    public axi(axj axjVar, Activity activity) {
        this.f2652a = axjVar;
        this.f2653b = new WeakReference(activity);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
        view.removeOnAttachStateChangeListener(this);
        Activity activity = (Activity) this.f2653b.get();
        IBinder iBinderM1666a = WearableControllerProvider.m1666a(activity);
        if (activity == null || iBinderM1666a == null) {
            return;
        }
        this.f2652a.m2085b(iBinderM1666a, activity);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
    }
}
