package p290o6;

import android.os.Bundle;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import java.util.concurrent.Callable;
import p043c7.C1735a;
import p408u6.C9471j;
import p408u6.C9473l;
import p408u6.CallableC9469h;

/* JADX INFO: renamed from: o6.p */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC7974p implements Callable<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CTInboxMessage f43393a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Bundle f43394b = null;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CleverTapAPI f43395c;

    public CallableC7974p(CleverTapAPI cleverTapAPI, CTInboxMessage cTInboxMessage) {
        this.f43395c = cleverTapAPI;
        this.f43393a = cTInboxMessage;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        CTInboxMessage cTInboxMessage;
        C2181a.m6449a("CleverTapAPI:messageDidShow() called  in async with: messageId = [" + this.f43393a.f11287l + "]");
        CleverTapAPI cleverTapAPI = this.f43395c;
        String str = this.f43393a.f11287l;
        cleverTapAPI.getClass();
        C2181a.m6449a("CleverTapAPI:getInboxMessageForId() called with: messageId = [" + str + "]");
        synchronized (cleverTapAPI.f10981b.f43475e.f43257b) {
            try {
                C9471j c9471j = cleverTapAPI.f10981b.f43477g.f43436e;
                if (c9471j != null) {
                    C9473l c9473lM17887c = c9471j.m17887c(str);
                    cTInboxMessage = c9473lM17887c != null ? new CTInboxMessage(c9473lM17887c.m17894d()) : null;
                } else {
                    C2181a c2181aM6429f = cleverTapAPI.m6429f();
                    String strM6428e = cleverTapAPI.m6428e();
                    c2181aM6429f.getClass();
                    C2181a.m6452d(strM6428e, "Notification Inbox not initialized");
                    cTInboxMessage = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!cTInboxMessage.f11286k) {
            CleverTapAPI cleverTapAPI2 = this.f43395c;
            CTInboxMessage cTInboxMessage2 = this.f43393a;
            C9471j c9471j2 = cleverTapAPI2.f10981b.f43477g.f43436e;
            if (c9471j2 != null) {
                C1735a.m5472a(c9471j2.f48559h).m5474b().m6585b("markReadInboxMessage", new CallableC9469h(c9471j2, cTInboxMessage2));
            } else {
                C2181a c2181aM6429f2 = cleverTapAPI2.m6429f();
                String strM6428e2 = cleverTapAPI2.m6428e();
                c2181aM6429f2.getClass();
                C2181a.m6452d(strM6428e2, "Notification Inbox not initialized");
            }
            this.f43395c.f10981b.f43474d.m6414w0(false, this.f43393a, this.f43394b);
        }
        return null;
    }
}
