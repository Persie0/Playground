package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class hb9 implements dy5 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f42138a;

    public hb9(ArrayList arrayList) {
        this.f42138a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((gb9) arrayList.get(0)).f40504b;
            for (int i = 1; i < arrayList.size(); i++) {
                if (((gb9) arrayList.get(i)).f40503a < j) {
                    z = true;
                    break;
                }
                j = ((gb9) arrayList.get(i)).f40504b;
            }
        }
        bna.m3969q(!z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hb9.class != obj.getClass()) {
            return false;
        }
        return this.f42138a.equals(((hb9) obj).f42138a);
    }

    public final int hashCode() {
        return this.f42138a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f42138a;
    }
}
