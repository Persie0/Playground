package p000;

import com.lingq.core.network.adapters.NetworkResponse;
import com.lingq.core.network.api.result.ResultFastSearch;
import java.util.List;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes2.dex */
public interface ys8 {
    @mj3("api/v3/{language}/search/fast/")
    /* JADX INFO: renamed from: a */
    Object m25307a(@e57("language") String str, @sp7("limit") Integer num, @sp7("q") String str2, @sp7("suppress") List<String> list, Continuation<? super NetworkResponse<ResultFastSearch>> continuation);
}
