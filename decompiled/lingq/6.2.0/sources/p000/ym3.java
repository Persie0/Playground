package p000;

import com.lingq.core.data.repository.C1296l;
import com.lingq.core.domain.library.C1389d;
import com.lingq.core.domain.model.library.LibraryItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class ym3 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f70064a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1389d f70065b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f70066c;

    public /* synthetic */ ym3(C1389d c1389d, List list, int i) {
        this.f70064a = i;
        this.f70065b = c1389d;
        this.f70066c = list;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f70064a;
        List list = this.f70066c;
        C1389d c1389d = this.f70065b;
        switch (i) {
            case 0:
                y95 y95Var = c1389d.f18834a;
                List<LibraryItem> list2 = list;
                ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
                for (LibraryItem libraryItem : list2) {
                    arrayList.add(new Pair(Integer.valueOf(libraryItem.f19426a), libraryItem.f19428b));
                }
                return ((C1296l) y95Var).m7317l(arrayList);
            default:
                y95 y95Var2 = c1389d.f18834a;
                List<LibraryItem> list3 = list;
                ArrayList arrayList2 = new ArrayList(v91.m23189q0(list3, 10));
                for (LibraryItem libraryItem2 : list3) {
                    arrayList2.add(new Pair(Integer.valueOf(libraryItem2.f19426a), libraryItem2.f19428b));
                }
                return ((C1296l) y95Var2).m7317l(arrayList2);
        }
    }
}
