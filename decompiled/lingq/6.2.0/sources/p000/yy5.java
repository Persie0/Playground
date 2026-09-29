package p000;

import com.lingq.core.network.adapters.NetworkResponse;
import com.lingq.core.network.api.result.ResultBadge;
import com.lingq.core.network.api.result.ResultMilestones;
import com.lingq.core.network.api.result.Results;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public interface yy5 {
    @mj3("api/v3/{language}/milestones/")
    /* JADX INFO: renamed from: a */
    Object m25382a(@e57("language") String str, Continuation<? super ResultMilestones> continuation);

    @j17("api/v3/{language}/milestones/badges/")
    @kc3
    /* JADX INFO: renamed from: b */
    Object m25383b(@e57("language") String str, @b33("slug") String str2, Continuation<? super m88> continuation);

    @mj3("api/v3/profiles/badges/")
    /* JADX INFO: renamed from: c */
    Object m25384c(@sp7("language") String str, @sp7("page_size") int i, @sp7("sort") String str2, Continuation<? super NetworkResponse<Results<ResultBadge>>> continuation);
}
