package p000;

import com.lingq.core.domain.model.settings.LatinScript;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class rp4 {
    /* JADX INFO: renamed from: a */
    public static LatinScript m20739a(Integer num) {
        Object next;
        Iterator<E> it = LatinScript.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int serverId = ((LatinScript) next).getServerId();
            if (num != null && serverId == num.intValue()) {
                break;
            }
        }
        LatinScript latinScript = (LatinScript) next;
        return latinScript == null ? LatinScript.Off : latinScript;
    }
}
