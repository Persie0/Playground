package p000;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class mh2 implements bm1 {

    /* JADX INFO: renamed from: a */
    public final List f51321a;

    public mh2(int i, List list) {
        switch (i) {
            case 1:
                this.f51321a = list;
                break;
            default:
                this.f51321a = list;
                break;
        }
    }

    @Override // p000.bm1
    /* JADX INFO: renamed from: e */
    public /* bridge */ /* synthetic */ Object mo393e(Task task) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f51321a);
        return Tasks.m5975c(arrayList);
    }
}
