package tl;

import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p385sf.C9000b;

/* JADX INFO: renamed from: tl.m */
/* JADX INFO: loaded from: classes2.dex */
public class C9325m extends C9000b {
    /* JADX INFO: renamed from: A */
    public static final ArrayList m17680A(Collection collection) {
        C5207g.m11111f(collection, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C9327o.m17684D((Iterable) it.next(), arrayList);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: z */
    public static final int m17681z(Iterable iterable, int i10) {
        C5207g.m11111f(iterable, "<this>");
        if (iterable instanceof Collection) {
            i10 = ((Collection) iterable).size();
        }
        return i10;
    }
}
