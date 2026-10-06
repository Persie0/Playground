package p000;

import android.view.View;

/* JADX INFO: renamed from: dk */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0132dk extends C0133dl {

    /* JADX INFO: renamed from: g */
    private final jew f11843g;

    public C0132dk(int i, int i2, jew jewVar, exz exzVar, byte[] bArr) {
        super(i, i2, (ComponentCallbacksC0077bw) jewVar.f33848c, exzVar, null);
        this.f11843g = jewVar;
    }

    @Override // p000.C0133dl
    /* JADX INFO: renamed from: a */
    public final void mo6274a() {
        super.mo6274a();
        this.f11843g.m13002e();
    }

    @Override // p000.C0133dl
    /* JADX INFO: renamed from: b */
    public final void mo6275b() {
        int i = this.f11920f;
        if (i != 2) {
            if (i == 3) {
                Object obj = this.f11843g.f33848c;
                View viewRequireView = ((ComponentCallbacksC0077bw) obj).requireView();
                if (C0111cq.m5275S(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Clearing focus ");
                    sb.append(viewRequireView.findFocus());
                    sb.append(" on view ");
                    sb.append(viewRequireView);
                    sb.append(" for Fragment ");
                    sb.append(obj);
                }
                viewRequireView.clearFocus();
                return;
            }
            return;
        }
        Object obj2 = this.f11843g.f33848c;
        ComponentCallbacksC0077bw componentCallbacksC0077bw = (ComponentCallbacksC0077bw) obj2;
        View viewFindFocus = componentCallbacksC0077bw.f4586N.findFocus();
        if (viewFindFocus != null) {
            componentCallbacksC0077bw.m3123r(viewFindFocus);
            if (C0111cq.m5275S(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Saved focused view ");
                sb2.append(viewFindFocus);
                sb2.append(" for Fragment ");
                sb2.append(obj2);
            }
        }
        View viewRequireView2 = this.f11915a.requireView();
        if (viewRequireView2.getParent() == null) {
            this.f11843g.m12999b();
            viewRequireView2.setAlpha(0.0f);
        }
        if (viewRequireView2.getAlpha() == 0.0f && viewRequireView2.getVisibility() == 0) {
            viewRequireView2.setVisibility(4);
        }
        C0073bs c0073bs = componentCallbacksC0077bw.f4589Q;
        viewRequireView2.setAlpha(c0073bs == null ? 1.0f : c0073bs.f4271q);
    }
}
