package p000;

import com.lingq.core.domain.model.chat.LynxChatModel;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class dn5 {
    /* JADX INFO: renamed from: a */
    public static LynxChatModel m10491a(String str) {
        Object next;
        Iterator<E> it = LynxChatModel.getEntries().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (fa4.m11650l(((LynxChatModel) next).getId(), str)) {
                return (LynxChatModel) next;
            }
        }
        next = null;
        return (LynxChatModel) next;
    }
}
