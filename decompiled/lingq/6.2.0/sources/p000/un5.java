package p000;

import com.lingq.core.domain.model.chat.LynxReasoningEffort;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class un5 {
    /* JADX INFO: renamed from: a */
    public static LynxReasoningEffort m22838a(String str) {
        Object next;
        Iterator<E> it = LynxReasoningEffort.getEntries().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (fa4.m11650l(((LynxReasoningEffort) next).getValue(), str)) {
                return (LynxReasoningEffort) next;
            }
        }
        next = null;
        return (LynxReasoningEffort) next;
    }
}
