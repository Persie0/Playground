package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class e68 implements Comparable {

    /* JADX INFO: renamed from: b */
    public long f36764b = -9223372036854775807L;

    /* JADX INFO: renamed from: a */
    public final ArrayList f36763a = new ArrayList();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f36764b, ((e68) obj).f36764b);
    }
}
