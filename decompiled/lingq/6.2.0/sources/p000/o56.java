package p000;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class o56 extends AbstractC3027g6 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f53865a;

    public o56(LinkedHashMap linkedHashMap) {
        this.f53865a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o56) {
            return this.f53865a.equals(((o56) obj).f53865a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f53865a.hashCode();
    }

    public final String toString() {
        return this.f53865a.toString();
    }
}
