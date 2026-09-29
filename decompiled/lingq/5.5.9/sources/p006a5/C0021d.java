package p006a5;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: a5.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0021d implements RecyclerView.InterfaceC1122o {
    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1122o
    /* JADX INFO: renamed from: b */
    public final void mo66b(View view) {
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1122o
    /* JADX INFO: renamed from: d */
    public final void mo67d(View view) {
        RecyclerView.C1121n c1121n = (RecyclerView.C1121n) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) c1121n).width != -1 || ((ViewGroup.MarginLayoutParams) c1121n).height != -1) {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }
}
