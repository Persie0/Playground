package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mxg implements Serializable {

    /* JADX INFO: renamed from: a */
    private final mws f41758a;

    public mxg(mws mwsVar) {
        this.f41758a = mwsVar;
    }

    Object readResolve() {
        if (this.f41758a.isEmpty()) {
            return mxh.f41759a;
        }
        return mkv.m16505M(this.f41758a, mws.m17097l(mzj.f41841a)) ? mxh.f41760b : new mxh(this.f41758a);
    }
}
