package p471x2;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import p100em.InterfaceC5429a;

/* JADX INFO: renamed from: x2.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C10041h0 implements Iterator<View>, InterfaceC5429a {

    /* JADX INFO: renamed from: a */
    public int f51033a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewGroup f51034b;

    public C10041h0(ViewGroup viewGroup) {
        this.f51034b = viewGroup;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f51033a < this.f51034b.getChildCount();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.Iterator
    public final View next() {
        int i10 = this.f51033a;
        this.f51033a = i10 + 1;
        View childAt = this.f51034b.getChildAt(i10);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i10 = this.f51033a - 1;
        this.f51033a = i10;
        this.f51034b.removeViewAt(i10);
    }
}
