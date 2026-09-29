package p000;

import com.lingq.core.network.api.requests.RequestBlacklist;
import com.lingq.core.network.api.result.ResultBlacklist;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public interface od0 {
    @j17("api/v2/contexts/{context}/blacklist/")
    /* JADX INFO: renamed from: a */
    Object m17930a(@e57("context") Integer num, @be0 RequestBlacklist requestBlacklist, Continuation<? super m88> continuation);

    @ay1("api/v2/contexts/{context}/blacklist/")
    /* JADX INFO: renamed from: b */
    Object m17931b(@e57("context") Integer num, Continuation<? super m88> continuation);

    @mj3("api/v2/contexts/{context}/blacklist/")
    /* JADX INFO: renamed from: c */
    Object m17932c(@e57("context") Integer num, Continuation<? super ResultBlacklist> continuation);
}
