package p406u4;

import android.view.View;
import android.view.ViewGroup;
import com.linguist.R;

/* JADX INFO: renamed from: u4.x0 */
/* JADX INFO: loaded from: classes.dex */
public final class C9445x0 extends C9417j0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewGroup f48426a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f48427b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f48428c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC9447y0 f48429d;

    public C9445x0(AbstractC9447y0 abstractC9447y0, ViewGroup viewGroup, View view, View view2) {
        this.f48429d = abstractC9447y0;
        this.f48426a = viewGroup;
        this.f48427b = view;
        this.f48428c = view2;
    }

    @Override // p406u4.C9417j0, p406u4.AbstractC9409f0.e
    /* JADX INFO: renamed from: a */
    public final void mo17765a() {
        this.f48426a.getOverlay().remove(this.f48427b);
    }

    @Override // p406u4.C9417j0, p406u4.AbstractC9409f0.e
    /* JADX INFO: renamed from: d */
    public final void mo17767d() {
        View view = this.f48427b;
        if (view.getParent() == null) {
            this.f48426a.getOverlay().add(view);
        } else {
            this.f48429d.cancel();
        }
    }

    @Override // p406u4.AbstractC9409f0.e
    /* JADX INFO: renamed from: e */
    public final void mo17768e(AbstractC9409f0 abstractC9409f0) {
        this.f48428c.setTag(R.id.save_overlay_view, null);
        this.f48426a.getOverlay().remove(this.f48427b);
        abstractC9409f0.mo17779F(this);
    }
}
