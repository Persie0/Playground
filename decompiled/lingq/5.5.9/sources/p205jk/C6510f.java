package p205jk;

import java.util.Comparator;
import java.util.List;
import p260m8.C7499b;

/* JADX INFO: renamed from: jk.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C6510f<T> implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f37139a;

    public C6510f(List list) {
        this.f37139a = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t10, T t11) {
        String str = ((C6514j) t10).f37142a;
        List list = this.f37139a;
        return C7499b.m14951m(Integer.valueOf(list.indexOf(str)), Integer.valueOf(list.indexOf(((C6514j) t11).f37142a)));
    }
}
