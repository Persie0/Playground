package p000;

import com.lingq.core.domain.model.settings.JapaneseScript;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class xc4 {
    /* JADX INFO: renamed from: a */
    public static JapaneseScript m24447a(Integer num) {
        Object next;
        Iterator<E> it = JapaneseScript.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int serverId = ((JapaneseScript) next).getServerId();
            if (num != null && serverId == num.intValue()) {
                break;
            }
        }
        JapaneseScript japaneseScript = (JapaneseScript) next;
        return japaneseScript == null ? JapaneseScript.Romaji : japaneseScript;
    }
}
