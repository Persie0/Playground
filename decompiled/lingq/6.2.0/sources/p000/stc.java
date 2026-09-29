package p000;

import com.lingq.core.domain.model.notification.MessageType;
import com.lingq.core.network.api.result.MessageProfile;
import com.lingq.core.network.api.result.ResultProfileMessage;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class stc {

    /* JADX INFO: renamed from: a */
    public static final ma3 f61404a = new ma3(15);

    /* JADX INFO: renamed from: a */
    public static final fm7 m21742a(ResultProfileMessage resultProfileMessage) {
        String str;
        Object next;
        Map map;
        String str2;
        String str3;
        String str4;
        resultProfileMessage.getClass();
        MessageProfile messageProfile = resultProfileMessage.f21469a;
        Iterator<E> it = MessageType.getEntries().iterator();
        do {
            str = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!fa4.m11650l(((MessageType) next).getLevel(), resultProfileMessage.f21470b));
        MessageType messageType = (MessageType) next;
        if (messageType == null) {
            messageType = MessageType.INFO;
        }
        MessageType messageType2 = messageType;
        String str5 = "";
        String str6 = (messageProfile == null || (str4 = messageProfile.f20560c) == null) ? "" : str4;
        String str7 = (messageProfile == null || (str3 = messageProfile.f20558a) == null) ? "" : str3;
        Set setM20855w0 = AbstractC3550rv.m20855w0(new String[]{"challenge-hit", "challenge-progress", "challenge-over", "challenge-success"});
        if (messageProfile != null && (str2 = messageProfile.f20561d) != null) {
            str5 = str2;
        }
        boolean zContains = setM20855w0.contains(str5);
        String str8 = messageProfile != null ? messageProfile.f20559b : null;
        String str9 = messageProfile != null ? messageProfile.f20562e : null;
        if (messageProfile != null && (map = messageProfile.f20563f) != null) {
            str = (String) map.get("challengeType");
        }
        return new fm7(messageType2, str6, str7, zContains, str8, str9, str);
    }
}
