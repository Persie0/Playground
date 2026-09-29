package p000;

import com.lingq.core.domain.model.settings.CantoneseScript;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class xm0 {
    /* JADX INFO: renamed from: a */
    public static CantoneseScript m24612a(Integer num) {
        Object next;
        Iterator<E> it = CantoneseScript.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int serverId = ((CantoneseScript) next).getServerId();
            if (num != null && serverId == num.intValue()) {
                break;
            }
        }
        CantoneseScript cantoneseScript = (CantoneseScript) next;
        return cantoneseScript == null ? CantoneseScript.Jyutping : cantoneseScript;
    }
}
