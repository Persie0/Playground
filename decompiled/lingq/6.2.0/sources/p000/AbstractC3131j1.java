package p000;

import java.util.Random;

/* JADX INFO: renamed from: j1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3131j1 extends jq7 {
    @Override // p000.jq7
    /* JADX INFO: renamed from: a */
    public final int mo14244a(int i) {
        return pic.m19189c(mo14246d().nextInt(), i);
    }

    @Override // p000.jq7
    /* JADX INFO: renamed from: b */
    public final int mo14245b() {
        return mo14246d().nextInt();
    }

    /* JADX INFO: renamed from: d */
    public abstract Random mo14246d();

    /* JADX INFO: renamed from: e */
    public final int m14247e(int i) {
        return mo14246d().nextInt(i);
    }
}
