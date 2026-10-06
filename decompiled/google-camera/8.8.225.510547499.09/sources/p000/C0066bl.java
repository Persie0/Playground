package p000;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: renamed from: bl */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0066bl extends AbstractC0083cb {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AbstractC0083cb f3675a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ DialogInterfaceOnCancelListenerC0067bm f3676b;

    public C0066bl(DialogInterfaceOnCancelListenerC0067bm dialogInterfaceOnCancelListenerC0067bm, AbstractC0083cb abstractC0083cb) {
        this.f3676b = dialogInterfaceOnCancelListenerC0067bm;
        this.f3675a = abstractC0083cb;
    }

    @Override // p000.AbstractC0083cb
    /* JADX INFO: renamed from: a */
    public final View mo2638a(int i) {
        AbstractC0083cb abstractC0083cb = this.f3675a;
        if (abstractC0083cb.mo2639b()) {
            return abstractC0083cb.mo2638a(i);
        }
        Dialog dialog = this.f3676b.f3750c;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // p000.AbstractC0083cb
    /* JADX INFO: renamed from: b */
    public final boolean mo2639b() {
        return this.f3675a.mo2639b() || this.f3676b.f3751d;
    }
}
