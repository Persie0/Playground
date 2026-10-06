package p000;

import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mxo extends mww {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    private final Comparator f41771a;

    public mxo(mxp mxpVar) {
        super(mxpVar);
        this.f41771a = mxpVar.comparator();
    }

    @Override // p000.mww
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ mwt mo17061a(int i) {
        return new mxn(this.f41771a);
    }
}
