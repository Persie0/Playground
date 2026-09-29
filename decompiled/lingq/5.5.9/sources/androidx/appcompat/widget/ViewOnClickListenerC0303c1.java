package androidx.appcompat.widget;

import android.view.View;
import android.view.Window;
import p185j.C6391a;

/* JADX INFO: renamed from: androidx.appcompat.widget.c1 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0303c1 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final C6391a f1140a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0306d1 f1141b;

    public ViewOnClickListenerC0303c1(C0306d1 c0306d1) {
        this.f1141b = c0306d1;
        this.f1140a = new C6391a(c0306d1.f1148a.getContext(), c0306d1.f1156i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0306d1 c0306d1 = this.f1141b;
        Window.Callback callback = c0306d1.f1159l;
        if (callback == null || !c0306d1.f1160m) {
            return;
        }
        callback.onMenuItemSelected(0, this.f1140a);
    }
}
