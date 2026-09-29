package p000;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class t76 implements Comparator {

    /* JADX INFO: renamed from: b */
    public static final t76 f61938b = new t76(0);

    /* JADX INFO: renamed from: c */
    public static final t76 f61939c = new t76(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61940a;

    public /* synthetic */ t76(int i) {
        this.f61940a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f61940a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                comparable4.getClass();
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f61940a) {
            case 0:
                return f61939c;
            default:
                return f61938b;
        }
    }
}
