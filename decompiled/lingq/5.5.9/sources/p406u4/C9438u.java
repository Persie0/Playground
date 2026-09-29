package p406u4;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.linguist.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: u4.u */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
public final class C9438u extends FrameLayout {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f48411c = 0;

    /* JADX INFO: renamed from: a */
    public final ViewGroup f48412a;

    /* JADX INFO: renamed from: b */
    public boolean f48413b;

    public C9438u(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.f48412a = viewGroup;
        viewGroup.setTag(R.id.ghost_view_holder, this);
        viewGroup.getOverlay().add(this);
        this.f48413b = true;
    }

    /* JADX INFO: renamed from: a */
    public static void m17838a(View view, ArrayList<View> arrayList) {
        Object parent = view.getParent();
        if (parent instanceof ViewGroup) {
            m17838a((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        if (!this.f48413b) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        super.onViewAdded(view);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (getChildCount() != 1 || getChildAt(0) != view) {
            if (getChildCount() != 0) {
                return;
            }
        }
        ViewGroup viewGroup = this.f48412a;
        viewGroup.setTag(R.id.ghost_view_holder, null);
        viewGroup.getOverlay().remove(this);
        this.f48413b = false;
    }
}
