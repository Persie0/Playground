package p000;

import com.lingq.core.domain.model.chat.ChatMessageRating;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class pw0 {
    /* JADX INFO: renamed from: a */
    public static ChatMessageRating m19535a(String str) {
        Object next;
        str.getClass();
        Iterator<E> it = ChatMessageRating.getEntries().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (fa4.m11650l(((ChatMessageRating) next).getValue(), str)) {
                return (ChatMessageRating) next;
            }
        }
        next = null;
        return (ChatMessageRating) next;
    }
}
