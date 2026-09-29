package androidx.appcompat.widget;

import android.view.MenuItem;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0224f;
import com.lingq.p055ui.home.library.CollectionsAdapter;
import com.lingq.shared.uimodel.library.Sort;
import com.lingq.shared.uimodel.library.SortType;
import com.lingq.util.C4924a;
import dm.C5207g;
import java.util.Iterator;
import p181ii.C6335d;
import p290o6.C7946b;

/* JADX INFO: renamed from: androidx.appcompat.widget.o0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0333o0 implements C0224f.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0337q0 f1307a;

    public C0333o0(C0337q0 c0337q0) {
        this.f1307a = c0337q0;
    }

    @Override // androidx.appcompat.view.menu.C0224f.a
    /* JADX INFO: renamed from: a */
    public final boolean mo940a(C0224f c0224f, MenuItem menuItem) {
        Object next;
        C0337q0.a aVar = this.f1307a.f1318c;
        if (aVar == null) {
            return false;
        }
        C7946b c7946b = (C7946b) aVar;
        CollectionsAdapter.AbstractC3740b abstractC3740b = (CollectionsAdapter.AbstractC3740b) c7946b.f43280b;
        CollectionsAdapter collectionsAdapter = (CollectionsAdapter) c7946b.f43281c;
        C5207g.m11111f(abstractC3740b, "$holder");
        C5207g.m11111f(collectionsAdapter, "this$0");
        ((TextView) ((CollectionsAdapter.AbstractC3740b.a) abstractC3740b).f24505u.f45467e).setText(menuItem.getTitle());
        Iterator<T> it = C6335d.m12965a(SortType.Collection).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!C5207g.m11106a(abstractC3740b.f7054a.getContext().getString(C4924a.m10465i0((Sort) next)), menuItem.getTitle()));
        Sort sort = (Sort) next;
        if (sort != null) {
            collectionsAdapter.f24478f.mo9823w(sort);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.C0224f.a
    /* JADX INFO: renamed from: b */
    public final void mo941b(C0224f c0224f) {
    }
}
