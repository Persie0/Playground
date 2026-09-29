package p000;

import com.lingq.core.network.adapters.NetworkResponse;
import com.lingq.core.network.api.result.ResultOffer;
import com.lingq.core.network.api.result.Results;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public interface bq6 {
    @mj3("api/v2/offers/")
    /* JADX INFO: renamed from: a */
    Object m4099a(Continuation<? super NetworkResponse<Results<ResultOffer>>> continuation);
}
