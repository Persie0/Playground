package p272n6;

/* JADX INFO: renamed from: n6.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7712d {

    /* JADX INFO: renamed from: n6.d$a */
    public static class a extends AbstractC7712d {

        /* JADX INFO: renamed from: a */
        public volatile boolean f42240a;

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public final void m15304a() {
            if (this.f42240a) {
                throw new IllegalStateException("Already released");
            }
        }
    }
}
