package p000;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class v5a implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final C3523r5 f64897a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ x5a f64898b;

    public v5a(x5a x5aVar) {
        this.f64898b = x5aVar;
        Context context = x5aVar.f67786a.getContext();
        CharSequence charSequence = x5aVar.f67793h;
        C3523r5 c3523r5 = new C3523r5();
        c3523r5.f58721e = 4096;
        c3523r5.f58723g = 4096;
        c3523r5.f58728l = null;
        c3523r5.f58729m = null;
        c3523r5.f58730n = false;
        c3523r5.f58731o = false;
        c3523r5.f58732p = 16;
        c3523r5.f58725i = context;
        c3523r5.f58717a = charSequence;
        this.f64897a = c3523r5;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        x5a x5aVar = this.f64898b;
        Window.Callback callback = x5aVar.f67796k;
        if (callback == null || !x5aVar.f67797l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f64897a);
    }
}
