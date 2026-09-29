package p000;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: loaded from: classes.dex */
public final class oz2 extends sr9 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ lj8 f55320e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ pz2 f55321f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz2(String str, lj8 lj8Var, pz2 pz2Var) {
        super(str);
        this.f55320e = lj8Var;
        this.f55321f = pz2Var;
    }

    @Override // p000.sr9
    /* JADX INFO: renamed from: a */
    public final long mo10391a() throws InterruptedException {
        kj8 kj8Var;
        lj8 lj8Var = this.f55320e;
        try {
            kj8Var = lj8Var.mo11846d();
        } catch (Throwable th) {
            kj8Var = new kj8(lj8Var, th, 2);
        }
        pz2 pz2Var = this.f55321f;
        if (!((CopyOnWriteArrayList) pz2Var.f57025d).contains(lj8Var)) {
            return -1L;
        }
        ((LinkedBlockingDeque) pz2Var.f57026e).put(kj8Var);
        return -1L;
    }
}
