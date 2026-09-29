package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class und {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64120a;

    public /* synthetic */ und(int i) {
        this.f64120a = i;
    }

    /* JADX INFO: renamed from: b */
    private final void m22841b(end endVar, Iterator it, qnd qndVar) {
    }

    /* JADX INFO: renamed from: a */
    public final void m22842a(end endVar, Iterator it, qnd qndVar) {
        switch (this.f64120a) {
            case 0:
                break;
            default:
                if (!endVar.f37586c) {
                    C3386nv.m17633t("non repeating key");
                } else if (endVar.f37587d && ((ugb) ugb.f63908b.get()).f63909a > 20) {
                    while (it.hasNext()) {
                        qndVar.m20086a(it.next(), endVar.f37584a);
                    }
                } else {
                    endVar.mo11276a(it, qndVar);
                }
                break;
        }
    }
}
