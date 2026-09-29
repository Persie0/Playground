package p000;

import com.lingq.core.domain.model.settings.ChineseScript;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class w01 {
    /* JADX INFO: renamed from: a */
    public static ChineseScript m23661a(Integer num) {
        Object next;
        Iterator<E> it = ChineseScript.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int serverId = ((ChineseScript) next).getServerId();
            if (num != null && serverId == num.intValue()) {
                break;
            }
        }
        ChineseScript chineseScript = (ChineseScript) next;
        return chineseScript == null ? ChineseScript.Pinyin : chineseScript;
    }
}
