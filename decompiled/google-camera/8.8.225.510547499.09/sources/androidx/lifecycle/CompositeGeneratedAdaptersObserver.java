package androidx.lifecycle;

import java.util.HashMap;
import p000.akm;
import p000.akq;
import p000.akt;
import p000.akv;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class CompositeGeneratedAdaptersObserver implements akt {

    /* JADX INFO: renamed from: a */
    private final akm[] f1514a;

    public CompositeGeneratedAdaptersObserver(akm[] akmVarArr) {
        akmVarArr.getClass();
        this.f1514a = akmVarArr;
    }

    @Override // p000.akt
    /* JADX INFO: renamed from: a */
    public final void mo883a(akv akvVar, akq akqVar) {
        new HashMap();
        for (akm akmVar : this.f1514a) {
            akmVar.m868a();
        }
        for (akm akmVar2 : this.f1514a) {
            akmVar2.m868a();
        }
    }
}
