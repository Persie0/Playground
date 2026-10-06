package p021j$.util;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: renamed from: j$.util.d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0546d implements Comparator, Serializable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Comparator f33240a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Comparator f33241b;

    public /* synthetic */ C0546d(Comparator comparator, Comparator comparator2) {
        this.f33240a = comparator;
        this.f33241b = comparator2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iCompare = this.f33240a.compare(obj, obj2);
        return iCompare != 0 ? iCompare : this.f33241b.compare(obj, obj2);
    }
}
