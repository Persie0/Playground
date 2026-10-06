package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lrs extends amj {

    /* JADX INFO: renamed from: i */
    private List f39102i;

    public lrs(Context context) {
        super(context.getApplicationContext());
    }

    @Override // p000.amj
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo948a() {
        TreeSet treeSet = new TreeSet();
        String[] strArrSplit = lqi.m15858c(this.f700c.getApplicationContext(), "third_party_license_metadata", 0L, -1).split("\n");
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str : strArrSplit) {
            int iIndexOf = str.indexOf(32);
            String[] strArrSplit2 = str.substring(0, iIndexOf).split(":");
            lku.m15614I(strArrSplit2.length == 2 && iIndexOf > 0, "Invalid license meta-data line:\n".concat(String.valueOf(str)));
            arrayList.add(new lrr(str.substring(iIndexOf + 1), Long.parseLong(strArrSplit2[0]), Integer.parseInt(strArrSplit2[1])));
        }
        Collections.sort(arrayList);
        treeSet.addAll(arrayList);
        return Collections.unmodifiableList(new ArrayList(treeSet));
    }

    @Override // p000.amk
    /* JADX INFO: renamed from: i */
    public final void mo957i() {
        mo953f();
    }

    @Override // p000.amk
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void mo955g(List list) {
        this.f39102i = list;
        super.mo955g(list);
    }

    @Override // p000.amk
    /* JADX INFO: renamed from: h */
    public final void mo956h() {
        List list = this.f39102i;
        if (list != null) {
            mo955g(list);
        } else {
            mo950c();
        }
    }
}
