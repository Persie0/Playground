package p000;

import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class moh extends moe implements moc {

    /* JADX INFO: renamed from: a */
    private final Exception f41183a;

    /* JADX INFO: renamed from: b */
    private final boolean f41184b;

    public moh(String str, moc mocVar, mol molVar, boolean z) {
        super(str, mocVar, molVar);
        this.f41183a = mocVar.mo16701e();
        this.f41184b = z;
    }

    @Override // p000.moc
    /* JADX INFO: renamed from: d */
    public final moq mo16700d(String str, mol molVar, boolean z) {
        if (z && !this.f41184b) {
            WeakHashMap weakHashMap = moz.f41222a;
        }
        boolean z2 = true;
        if ((!z || this.f41184b) && !this.f41184b) {
            z2 = false;
        }
        return new moh(str, this, molVar, z2);
    }

    @Override // p000.moc
    /* JADX INFO: renamed from: e */
    public final Exception mo16701e() {
        return this.f41183a;
    }

    @Override // p000.moq
    /* JADX INFO: renamed from: g */
    public final moq mo16707g(String str, mol molVar) {
        return mo16700d(str, molVar, true);
    }

    public moh(String str, mol molVar) {
        super(str, mof.f41178a.m16706b(), molVar);
        this.f41183a = mog.f41181a;
        this.f41184b = false;
    }
}
