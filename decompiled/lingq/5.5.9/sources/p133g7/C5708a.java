package p133g7;

/* JADX INFO: renamed from: g7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5708a {

    /* JADX INFO: renamed from: b */
    public static C5708a f34716b;

    /* JADX INFO: renamed from: a */
    public final C5709b f34717a = new C5709b();

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static C5708a m12072a() {
        if (f34716b == null) {
            synchronized (C5708a.class) {
                if (f34716b == null) {
                    f34716b = new C5708a();
                }
            }
        }
        return f34716b;
    }
}
