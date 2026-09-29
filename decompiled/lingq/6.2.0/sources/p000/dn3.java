package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.transition.R$id;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class dn3 extends FrameLayout {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f35888c = 0;

    /* JADX INFO: renamed from: a */
    public ViewGroup f35889a;

    /* JADX INFO: renamed from: b */
    public boolean f35890b;

    /* JADX INFO: renamed from: a */
    public static void m10490a(View view, ArrayList arrayList) {
        Object parent = view.getParent();
        if (parent instanceof ViewGroup) {
            m10490a((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        if (this.f35890b) {
            super.onViewAdded(view);
        } else {
            C3386nv.m17633t("This GhostViewHolder is detached!");
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        ViewGroup viewGroup = this.f35889a;
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            viewGroup.setTag(R$id.ghost_view_holder, null);
            viewGroup.getOverlay().remove(this);
            this.f35890b = false;
        }
    }
}
