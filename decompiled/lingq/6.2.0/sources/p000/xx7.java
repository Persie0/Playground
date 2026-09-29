package p000;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.designsystem.R$attr;
import com.lingq.core.designsystem.R$color;
import com.lingq.feature.reader.old.C2411m;
import com.lingq.feature.reader.old.ReaderPageFragment;
import com.lingq.feature.reader.pagination.p015ui.LessonTextView;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class xx7 implements ActionMode.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ReaderPageFragment f68927a;

    public xx7(ReaderPageFragment readerPageFragment) {
        this.f68927a = readerPageFragment;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        actionMode.getClass();
        menu.getClass();
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        actionMode.getClass();
        vx7 vx7Var = ReaderPageFragment.Companion;
        ReaderPageFragment readerPageFragment = this.f68927a;
        readerPageFragment.m9298W0().mo8761f();
        readerPageFragment.f28451M0 = null;
        LessonTextView lessonTextView = readerPageFragment.f28444F0;
        if (lessonTextView == null) {
            fa4.m11636J("tvContent");
            throw null;
        }
        lessonTextView.setHighlightColor(readerPageFragment.m2090R().getColor(R$color.transparent));
        readerPageFragment.f28445G0 = null;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        actionMode.getClass();
        menu.getClass();
        ReaderPageFragment readerPageFragment = this.f68927a;
        readerPageFragment.f28445G0 = actionMode;
        xz7 xz7VarM9293R0 = ReaderPageFragment.m9293R0(readerPageFragment);
        C2411m c2411mM9299X0 = readerPageFragment.m9299X0();
        c2411mM9299X0.getClass();
        ArrayList arrayList = new ArrayList();
        ox7 ox7Var = (ox7) c2411mM9299X0.f29254v.getValue();
        if (ox7Var != null) {
            for (xz7 xz7Var : ox7Var.f55132e) {
                if (xz7Var.f69004a >= xz7VarM9293R0.f69004a && xz7Var.f69005b <= xz7VarM9293R0.f69005b) {
                    arrayList.add(xz7Var);
                }
            }
        }
        if (!arrayList.isEmpty() && arrayList.size() < 9) {
            int i = ((xz7) u91.m22589G0(arrayList)).f69010g;
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    LessonTextView lessonTextView = readerPageFragment.f28444F0;
                    if (lessonTextView == null) {
                        fa4.m11636J("tvContent");
                        throw null;
                    }
                    lessonTextView.setHighlightColor(readerPageFragment.m2090R().getColor(R$color.transparent));
                    int size = menu.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        menu.getItem(i2).setVisible(false);
                    }
                    if (!xz7VarM9293R0.equals(readerPageFragment.f28451M0) && xz7VarM9293R0.f69008e.length() > 0) {
                        readerPageFragment.f28451M0 = xz7VarM9293R0;
                        readerPageFragment.m9299X0().m9307b3(xz7VarM9293R0.f69004a, xz7VarM9293R0.f69005b, true);
                    }
                    return true;
                }
            } while (((xz7) it.next()).f69010g == i);
        }
        LessonTextView lessonTextView2 = readerPageFragment.f28444F0;
        if (lessonTextView2 == null) {
            fa4.m11636J("tvContent");
            throw null;
        }
        lessonTextView2.setHighlightColor(jfa.m14431n(readerPageFragment.m2090R(), R$attr.textSelectionColor));
        int size2 = menu.size();
        for (int i3 = 0; i3 < size2; i3++) {
            menu.getItem(i3).setVisible(true);
        }
        C2411m c2411mM9299X1 = readerPageFragment.m9299X0();
        pg9 pg9Var = c2411mM9299X1.f29256x;
        if (pg9Var != null) {
            AbstractC1263a.m7046a(pg9Var);
        }
        c2411mM9299X1.f29212Q.m15571i(null);
        readerPageFragment.m9298W0().mo8776s2(true, false);
        return true;
    }
}
