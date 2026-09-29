package p000;

import android.view.View;
import com.lingq.R$id;
import com.lingq.feature.reader.old.ReaderFragment;
import com.lingq.p020ui.HomeFragment;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes2.dex */
public final class wf0 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66747a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f66748b;

    public /* synthetic */ wf0(Object obj, int i) {
        this.f66747a = i;
        this.f66748b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.f66747a;
        Object obj = this.f66748b;
        switch (i9) {
            case 0:
                throw null;
            case 1:
                view.removeOnLayoutChangeListener(this);
                bh4[] bh4VarArr = HomeFragment.f33886N0;
                ((HomeFragment) obj).m9797j0().f59103a.setSelectedItemId(R$id.nav_graph_playlist);
                return;
            case 2:
                view.removeOnLayoutChangeListener(this);
                bh4[] bh4VarArr2 = ReaderFragment.f28218P0;
                C3244l c3244l = ((ReaderFragment) obj).m9290W0().f29263B0;
                Boolean bool = Boolean.TRUE;
                c3244l.getClass();
                c3244l.m15572j(null, bool);
                return;
            default:
                d6a d6aVar = (d6a) obj;
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                d6aVar.f35060o0 = iArr[0];
                view.getWindowVisibleDisplayFrame(d6aVar.f35053h0);
                return;
        }
    }
}
