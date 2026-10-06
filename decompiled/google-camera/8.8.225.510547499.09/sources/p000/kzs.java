package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kzs implements lab {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f37787a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f37788b;

    public kzs(kzx kzxVar, int i) {
        this.f37788b = i;
        this.f37787a = kzxVar;
    }

    public kzs(lhz lhzVar, int i, byte[] bArr) {
        this.f37788b = i;
        this.f37787a = lhzVar;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kzx] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kzx] */
    @Override // p000.lab
    /* JADX INFO: renamed from: a */
    public final kzx mo15098a(Object obj, Executor executor) {
        switch (this.f37788b) {
            case 0:
                return ((lhz) this.f37787a).m15365f().mo15102a(executor, lqi.m15873r(obj));
            case 1:
                return ((lhz) this.f37787a).m15365f().mo15102a(executor, lqi.m15873r(obj));
            case 2:
                return this.f37787a;
            default:
                return this.f37787a.mo15102a(executor, new lac(obj, 2));
        }
    }
}
