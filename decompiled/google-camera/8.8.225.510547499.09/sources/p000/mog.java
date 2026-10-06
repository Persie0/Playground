package p000;

import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mog extends mnz implements moc {

    /* JADX INFO: renamed from: a */
    static final moa f41181a = new mob();

    /* JADX INFO: renamed from: b */
    public final moa f41182b;

    public mog() {
        super("", mof.f41178a.m16706b());
        this.f41182b = f41181a;
    }

    @Override // p000.moc
    /* JADX INFO: renamed from: d */
    public final moq mo16700d(String str, mol molVar, boolean z) {
        if (z) {
            WeakHashMap weakHashMap = moz.f41222a;
        }
        return new moh(str, this, molVar, z);
    }

    @Override // p000.moc
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Exception mo16701e() {
        return this.f41182b;
    }

    @Override // p000.moq
    /* JADX INFO: renamed from: f */
    public final mol mo16704f() {
        return mok.f41193a;
    }

    @Override // p000.moq
    /* JADX INFO: renamed from: g */
    public final moq mo16707g(String str, mol molVar) {
        WeakHashMap weakHashMap = moz.f41222a;
        return mo16700d(str, molVar, true);
    }
}
