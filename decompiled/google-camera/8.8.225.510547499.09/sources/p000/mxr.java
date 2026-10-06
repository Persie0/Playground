package p000;

import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mxr extends mxi {

    /* JADX INFO: renamed from: e */
    private final Comparator f41776e;

    public mxr(Comparator comparator) {
        comparator.getClass();
        this.f41776e = comparator;
    }

    @Override // p000.mxi, p000.mwi
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void mo17072d(Object obj) {
        super.mo17072d(obj);
    }

    @Override // p000.mxi
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final mxt mo17127f() {
        mxt mxtVarM17154P = mxt.m17154P(this.f41776e, this.f41725b, this.f41724a);
        this.f41725b = mxtVarM17154P.size();
        this.f41726c = true;
        return mxtVarM17154P;
    }

    /* JADX INFO: renamed from: k */
    public final void m17153k(Object obj) {
        super.mo17072d(obj);
    }
}
