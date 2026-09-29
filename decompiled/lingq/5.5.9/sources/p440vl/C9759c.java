package p440vl;

import dm.C5207g;
import java.util.Comparator;

/* JADX INFO: renamed from: vl.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C9759c implements Comparator<Comparable<? super Object>> {

    /* JADX INFO: renamed from: a */
    public static final C9759c f49824a = new C9759c();

    @Override // java.util.Comparator
    public final int compare(Comparable<? super Object> comparable, Comparable<? super Object> comparable2) {
        Comparable<? super Object> comparable3 = comparable;
        Comparable<? super Object> comparable4 = comparable2;
        C5207g.m11111f(comparable3, "a");
        C5207g.m11111f(comparable4, "b");
        return comparable4.compareTo(comparable3);
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return C9758b.f49823a;
    }
}
