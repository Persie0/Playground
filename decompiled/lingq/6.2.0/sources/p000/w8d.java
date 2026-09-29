package p000;

import com.google.android.gms.measurement.internal.C1045d;
import com.google.android.gms.measurement.internal.zzjk;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class w8d implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzr f66540a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1045d f66541b;

    public w8d(C1045d c1045d, zzr zzrVar) {
        this.f66540a = zzrVar;
        Objects.requireNonNull(c1045d);
        this.f66541b = c1045d;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        zzr zzrVar = this.f66540a;
        String str = zzrVar.f12432a;
        lda.m16130p(str);
        C1045d c1045d = this.f66541b;
        npc npcVarM5917f = c1045d.m5917f(str);
        zzjk zzjkVar = zzjk.ANALYTICS_STORAGE;
        if (npcVarM5917f.m17590i(zzjkVar) && npc.m17583c(100, zzrVar.f12419N).m17590i(zzjkVar)) {
            return c1045d.m5912c0(zzrVar).m12523F();
        }
        c1045d.mo5909b().f68076I.m17923a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
