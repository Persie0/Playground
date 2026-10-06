package p000;

import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
abstract class moe extends mnz {

    /* JADX INFO: renamed from: a */
    private final mol f41177a;

    public moe(String str, moq moqVar, mol molVar) {
        super(str, moqVar);
        lku.m15669w(molVar.f41195b);
        this.f41177a = molVar;
    }

    @Override // p000.moq
    /* JADX INFO: renamed from: f */
    public final mol mo16704f() {
        return this.f41177a;
    }

    public moe(String str, UUID uuid, mol molVar) {
        super(str, uuid);
        lku.m15669w(molVar.f41195b);
        this.f41177a = molVar;
    }
}
