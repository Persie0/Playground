package p000;

import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: nq */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ViewOnClickListenerC0858nq implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    final C0213gk f44044a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C0860ns f44045b;

    public ViewOnClickListenerC0858nq(C0860ns c0860ns) {
        this.f44045b = c0860ns;
        this.f44044a = new C0213gk(c0860ns.f44333a.getContext(), c0860ns.f44335c);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0860ns c0860ns = this.f44045b;
        Window.Callback callback = c0860ns.f44336d;
        if (callback == null || !c0860ns.f44337e) {
            return;
        }
        callback.onMenuItemSelected(0, this.f44044a);
    }
}
