package p000;

import android.view.View;
import com.amplitude.android.internal.gestures.C0888c;
import curtains.internal.RootViewsSpy$delegatingViewList$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.r4b;
import p000.s4b;

/* JADX INFO: loaded from: classes.dex */
public final class ii8 {

    /* JADX INFO: renamed from: a */
    public final CopyOnWriteArrayList f44147a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b */
    public final RootViewsSpy$delegatingViewList$1 f44148b = new ArrayList<View>() { // from class: curtains.internal.RootViewsSpy$delegatingViewList$1
        @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean add(Object obj) {
            View view = (View) obj;
            view.getClass();
            Iterator it = this.f34567a.f44147a.iterator();
            while (it.hasNext()) {
                C0888c c0888c = ((r4b) it.next()).f58715a;
                c0888c.f10857g.post(new s4b(true, c0888c, view));
            }
            return super.add(view);
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof View) {
                return super.contains((View) obj);
            }
            return false;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof View) {
                return super.indexOf((View) obj);
            }
            return -1;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof View) {
                return super.lastIndexOf((View) obj);
            }
            return -1;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final Object remove(int i) {
            Object objRemove = super.remove(i);
            objRemove.getClass();
            View view = (View) objRemove;
            Iterator it = this.f34567a.f44147a.iterator();
            while (it.hasNext()) {
                C0888c c0888c = ((r4b) it.next()).f58715a;
                c0888c.f10857g.post(new s4b(false, c0888c, view));
            }
            return view;
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean remove(Object obj) {
            if (obj instanceof View) {
                return super.remove((View) obj);
            }
            return false;
        }
    };
}
