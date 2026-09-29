package p000;

import android.view.View;
import android.view.Window;
import com.amplitude.android.internal.gestures.C0888c;
import curtains.AbstractC2899b;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s4b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f60306a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0888c f60307b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f60308c;

    public /* synthetic */ s4b(boolean z, C0888c c0888c, View view) {
        this.f60306a = z;
        this.f60307b = c0888c;
        this.f60308c = view;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException {
        View view = this.f60308c;
        view.getClass();
        boolean z = this.f60306a;
        C0888c c0888c = this.f60307b;
        if (z) {
            c0888c.m5074a(view);
            return;
        }
        Window windowM9900a = AbstractC2899b.m9900a(view);
        if (windowM9900a != null) {
            c0888c.m5075b(windowM9900a);
        }
    }
}
