package p021j$.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: renamed from: j$.util.o */
/* JADX INFO: loaded from: classes3.dex */
final class C0566o extends C0515S {

    /* JADX INFO: renamed from: f */
    final /* synthetic */ SortedSet f33274f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0566o(SortedSet sortedSet, Collection collection) {
        super(collection, 21);
        this.f33274f = sortedSet;
    }

    @Override // p021j$.util.C0515S, p021j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f33274f.comparator();
    }
}
