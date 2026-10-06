package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mzi extends mzh implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final mzh f41840a = new mzi();
    private static final long serialVersionUID = 0;

    private mzi() {
    }

    @Override // p000.mzh, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        mzj mzjVar = (mzj) obj;
        mzj mzjVar2 = (mzj) obj2;
        return mut.f41666b.mo16978b(mzjVar.f41842b, mzjVar2.f41842b).mo16978b(mzjVar.f41843c, mzjVar2.f41843c).mo16977a();
    }
}
