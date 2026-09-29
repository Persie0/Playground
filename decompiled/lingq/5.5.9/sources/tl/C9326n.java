package tl;

import dm.C5207g;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: tl.n */
/* JADX INFO: loaded from: classes2.dex */
public class C9326n extends C9325m {
    /* JADX INFO: renamed from: B */
    public static final <T> void m17682B(List<T> list, Comparator<? super T> comparator) {
        C5207g.m11111f(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
