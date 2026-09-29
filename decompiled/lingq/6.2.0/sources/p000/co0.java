package p000;

import com.lingq.core.network.adapters.NetworkResponse;
import com.lingq.core.network.api.requests.RequestClozeTest;
import com.lingq.core.network.api.requests.RequestDataCard;
import com.lingq.core.network.api.result.ResultCardReview;
import com.lingq.core.network.api.result.ResultSkritterExport;
import com.lingq.core.network.api.result.ResultVocabularyCard;
import com.lingq.core.network.api.result.Results;
import java.util.List;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public interface co0 {
    @j17("api/v3/{language}/cards/{pk}/review/")
    /* JADX INFO: renamed from: a */
    Object m4905a(@e57("language") String str, @e57("pk") Integer num, Continuation<? super ResultCardReview> continuation);

    @mj3("api/v3/{language}/cards/")
    /* JADX INFO: renamed from: b */
    Object m4906b(@e57("language") String str, @sp7("page") Integer num, @sp7("page_size") Integer num2, @sp7("search") String str2, @sp7("search_criteria") String str3, @sp7("sort") String str4, @sp7("status") List<Integer> list, @sp7("srs_due") Boolean bool, @sp7("phrases") Boolean bool2, @sp7("lotd_date") String str5, @sp7("tag") List<String> list2, @sp7("collection_id") Integer num3, @sp7("content_id") Integer num4, Continuation<? super Results<ResultVocabularyCard>> continuation);

    @mj3("api/v2/{language}/cards/export/")
    /* JADX INFO: renamed from: c */
    Object m4907c(@e57("language") String str, @sp7("cards") List<Integer> list, @sp7("export_type") String str2, Continuation<? super NetworkResponse<ResultSkritterExport>> continuation);

    @mj3("api/v3/{language}/cards/{pk}/activity/cloze/")
    /* JADX INFO: renamed from: d */
    Object m4908d(@e57("language") String str, @e57("pk") Integer num, Continuation<? super RequestClozeTest> continuation);

    @mj3("api/v2/{language}/cards/export/")
    /* JADX INFO: renamed from: e */
    Object m4909e(@e57("language") String str, @sp7("cards") List<Integer> list, @sp7("export_type") String str2, Continuation<? super m88> continuation);

    @mj3("api/v2/{language}/cards/export/")
    /* JADX INFO: renamed from: f */
    Object m4910f(@e57("language") String str, @sp7("status") List<Integer> list, @sp7("export_type") String str2, Continuation<? super i88<String>> continuation);

    @g17("api/v3/{language}/cards/{cardId}/")
    /* JADX INFO: renamed from: g */
    Object m4911g(@e57("language") String str, @e57("cardId") Integer num, @be0 RequestDataCard requestDataCard, Continuation<? super ResultVocabularyCard> continuation);

    @j17("api/v3/{language}/cards/")
    /* JADX INFO: renamed from: h */
    Object m4912h(@e57("language") String str, @be0 RequestDataCard requestDataCard, Continuation<? super ResultVocabularyCard> continuation);
}
