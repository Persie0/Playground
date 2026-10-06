package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lad implements lab {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f37804a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f37805b;

    public lad(kzx kzxVar, int i) {
        this.f37805b = i;
        this.f37804a = kzxVar;
    }

    public lad(lcc lccVar, int i) {
        this.f37805b = i;
        this.f37804a = lccVar;
    }

    public lad(lhz lhzVar, int i, byte[] bArr) {
        this.f37805b = i;
        this.f37804a = lhzVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kzx] */
    @Override // p000.lab
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ kzx mo15098a(Object obj, Executor executor) {
        switch (this.f37805b) {
            case 0:
                kzy kzyVar = (kzy) obj;
                return this.f37804a.mo15104c(executor, new kzc(kzyVar, 2), new lac(kzyVar, 0));
            case 1:
                kzy kzyVar2 = (kzy) obj;
                return ((lhz) this.f37804a).m15365f().mo15104c(executor, lqi.m15874s(kzyVar2), lqi.m15872q(kzyVar2));
            default:
                ((lcc) this.f37804a).f37905c = false;
                ((lcc) this.f37804a).m15162l();
                return ((lcc) this.f37804a).mo15161k();
        }
    }
}
