package p099el;

import dm.C5207g;
import kotlin.TypeCastException;

/* JADX INFO: renamed from: el.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C5426a {
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C5207g.m11106a(C5426a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tonyodev.fetch2.util.ActiveDownloadInfo");
        }
        return !(C5207g.m11106a(null, null) ^ true);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "ActiveDownloadInfo(fetchObserver=null, includeAddedDownloads=false)";
    }
}
