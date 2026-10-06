package p000;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nam extends nar implements NavigableSet {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    transient NavigableSet f41900a;

    public nam(NavigableSet navigableSet, Object obj) {
        super(navigableSet, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p000.nar
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final NavigableSet mo17199a() {
        return (NavigableSet) super.mo17199a();
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        Object objCeiling;
        synchronized (this.f41902h) {
            objCeiling = mo17199a().ceiling(obj);
        }
        return objCeiling;
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return mo17199a().descendingIterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        synchronized (this.f41902h) {
            NavigableSet navigableSet = this.f41900a;
            if (navigableSet != null) {
                return navigableSet;
            }
            NavigableSet navigableSetM16780s = mpw.m16780s(mo17199a().descendingSet(), this.f41902h);
            this.f41900a = navigableSetM16780s;
            return navigableSetM16780s;
        }
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        Object objFloor;
        synchronized (this.f41902h) {
            objFloor = mo17199a().floor(obj);
        }
        return objFloor;
    }

    @Override // p000.nar, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        Object objHigher;
        synchronized (this.f41902h) {
            objHigher = mo17199a().higher(obj);
        }
        return objHigher;
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        Object objLower;
        synchronized (this.f41902h) {
            objLower = mo17199a().lower(obj);
        }
        return objLower;
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        Object objPollFirst;
        synchronized (this.f41902h) {
            objPollFirst = mo17199a().pollFirst();
        }
        return objPollFirst;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Object objPollLast;
        synchronized (this.f41902h) {
            objPollLast = mo17199a().pollLast();
        }
        return objPollLast;
    }

    @Override // p000.nar, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // p000.nar, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        NavigableSet navigableSetM16780s;
        synchronized (this.f41902h) {
            navigableSetM16780s = mpw.m16780s(mo17199a().headSet(obj, z), this.f41902h);
        }
        return navigableSetM16780s;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        NavigableSet navigableSetM16780s;
        synchronized (this.f41902h) {
            navigableSetM16780s = mpw.m16780s(mo17199a().subSet(obj, z, obj2, z2), this.f41902h);
        }
        return navigableSetM16780s;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        NavigableSet navigableSetM16780s;
        synchronized (this.f41902h) {
            navigableSetM16780s = mpw.m16780s(mo17199a().tailSet(obj, z), this.f41902h);
        }
        return navigableSetM16780s;
    }
}
