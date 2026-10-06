package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class juc extends jua {
    public juc(jez jezVar) {
        super(jezVar);
    }

    @Override // p000.jsy
    /* JADX INFO: renamed from: c */
    public final void mo13496c(jsq jsqVar) {
        ArrayList arrayList = new ArrayList();
        List list = jsqVar.f34739b;
        if (list != null) {
            arrayList.addAll(list);
        }
        m13503f(new jrp(jvh.m13564l(jsqVar.f34738a), arrayList, 2));
    }
}
