package p000;

import com.lingq.core.network.api.requests.RequestNotice;
import com.lingq.core.network.api.result.ResultNotice;
import com.lingq.core.network.api.result.Results;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes2.dex */
public interface nm6 {
    @j17("api/v2/notices/hide/")
    /* JADX INFO: renamed from: a */
    Object m17496a(@be0 RequestNotice requestNotice, Continuation<? super i88<xfa>> continuation);

    @mj3("api/v2/notices")
    /* JADX INFO: renamed from: b */
    Object m17497b(Continuation<? super Results<ResultNotice>> continuation);
}
