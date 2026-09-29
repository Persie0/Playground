package p000;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class tba implements Iterator, tg4 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f62117a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public Iterator f62118b;

    public tba(C3705w0 c3705w0) {
        this.f62118b = c3705w0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f62118b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.f62118b.next();
        View view = (View) next;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        C3705w0 c3705w0 = viewGroup != null ? new C3705w0(viewGroup, 4) : null;
        ArrayList arrayList = this.f62117a;
        if (c3705w0 != null && c3705w0.hasNext()) {
            arrayList.add(this.f62118b);
            this.f62118b = c3705w0;
            return next;
        }
        while (!this.f62118b.hasNext() && !arrayList.isEmpty()) {
            this.f62118b = (Iterator) u91.m22597O0(arrayList);
            u91.m22608Z0(arrayList);
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
