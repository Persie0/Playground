package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bfy {

    /* JADX INFO: renamed from: a */
    private final List f3147a = new ArrayList(5);

    /* JADX INFO: renamed from: a */
    public final int m2369a() {
        return this.f3147a.size();
    }

    /* JADX INFO: renamed from: b */
    public final bfz m2370b(int i) {
        return (bfz) this.f3147a.get(i);
    }

    /* JADX INFO: renamed from: c */
    public final void m2371c(bfz bfzVar) {
        this.f3147a.add(bfzVar);
    }

    public final String toString() {
        int i;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 1; i2 < m2369a(); i2++) {
            stringBuffer.append(m2370b(i2));
            if (i2 < m2369a() - 1 && ((i = m2370b(i2 + 1).f3149b) == 1 || i == 2)) {
                stringBuffer.append('/');
            }
        }
        return stringBuffer.toString();
    }
}
