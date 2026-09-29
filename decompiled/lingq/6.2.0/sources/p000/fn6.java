package p000;

import com.lingq.core.network.api.requests.RequestNotification;
import com.lingq.core.network.api.result.ResultNotifications;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public interface fn6 {
    @j17("api/v2/{language}/timeline-events/mark_viewed/")
    /* JADX INFO: renamed from: a */
    Object m11953a(@e57("language") String str, @be0 RequestNotification requestNotification, Continuation<? super i88<xfa>> continuation);

    @mj3("api/v2/{language}/timeline-events/simple/")
    /* JADX INFO: renamed from: b */
    Object m11954b(@e57("language") String str, @sp7("page") Integer num, @sp7("page_size") Integer num2, Continuation<? super ResultNotifications> continuation);
}
