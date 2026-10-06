package p000;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mon {

    /* JADX INFO: renamed from: a */
    int f41200a;

    /* JADX INFO: renamed from: b */
    final int f41201b;

    /* JADX INFO: renamed from: c */
    mon f41202c;

    /* JADX INFO: renamed from: d */
    final Map f41203d = new HashMap(0);

    public mon(int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException();
        }
        this.f41200a = i;
        this.f41201b = i2;
        this.f41202c = null;
    }

    public final String toString() {
        return "Node" + System.identityHashCode(this);
    }
}
