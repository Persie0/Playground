package p000;

import com.lingq.core.domain.model.settings.ChineseTraditionalScript;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class y01 {
    /* JADX INFO: renamed from: a */
    public static ChineseTraditionalScript m24802a(Integer num) {
        Object next;
        Iterator<E> it = ChineseTraditionalScript.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int serverId = ((ChineseTraditionalScript) next).getServerId();
            if (num != null && serverId == num.intValue()) {
                break;
            }
        }
        ChineseTraditionalScript chineseTraditionalScript = (ChineseTraditionalScript) next;
        return chineseTraditionalScript == null ? ChineseTraditionalScript.Pinyin : chineseTraditionalScript;
    }
}
