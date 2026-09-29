package p000;

import com.lingq.core.network.api.result.ResultCollectionSubscription;
import com.lingq.core.network.api.result.ResultCourseForImport;
import com.lingq.core.network.api.result.ResultLibraryItem;
import com.lingq.core.network.api.result.ResultVocabularyCourse;
import com.lingq.core.network.api.result.Results;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public interface zo1 {
    @mj3("api/v3/{language}/collections/{collectionId}/")
    /* JADX INFO: renamed from: a */
    Object m25706a(@e57("language") String str, @e57("collectionId") Integer num, Continuation<? super ResultLibraryItem> continuation);

    @j17("api/v3/{language}/collections/{collectionId}/archive/")
    /* JADX INFO: renamed from: b */
    Object m25707b(@e57("language") String str, @e57("collectionId") int i, Continuation<? super m88> continuation);

    @mj3("api/v3/{language}/search/")
    /* JADX INFO: renamed from: c */
    Object m25708c(@e57("language") String str, @sp7("page") Integer num, @sp7("page_size") Integer num2, @sp7("type") String str2, @sp7("shelf") String str3, Continuation<? super Results<ResultVocabularyCourse>> continuation);

    @j17("api/v3/{language}/collections/{collectionId}/unarchive/")
    /* JADX INFO: renamed from: d */
    Object m25709d(@e57("language") String str, @e57("collectionId") int i, Continuation<? super m88> continuation);

    @j17("api/v3/{language}/collections/{collectionId}/subscribe/")
    /* JADX INFO: renamed from: e */
    Object m25710e(@e57("language") String str, @e57("collectionId") Integer num, Continuation<? super m88> continuation);

    @mj3("api/v3/challenges/book_journey/books/")
    /* JADX INFO: renamed from: f */
    Object m25711f(@sp7("language") String str, @sp7("category") String str2, @sp7("q") String str3, @sp7("page") int i, @sp7("page_size") int i2, Continuation<? super Results<ResultVocabularyCourse>> continuation);

    @ay1("api/v3/{language}/collections/{collectionId}/subscribe/")
    /* JADX INFO: renamed from: g */
    Object m25712g(@e57("language") String str, @e57("collectionId") Integer num, Continuation<? super m88> continuation);

    @mj3("api/v3/{language}/collections/subscriptions/")
    /* JADX INFO: renamed from: h */
    Object m25713h(@e57("language") String str, @sp7("page") int i, Continuation<? super Results<ResultCollectionSubscription>> continuation);

    @j17("api/v3/{language}/collections/{collectionId}/give_rose/")
    /* JADX INFO: renamed from: i */
    Object m25714i(@e57("language") String str, @e57("collectionId") Integer num, Continuation<? super m88> continuation);

    @mj3("api/v2/{language}/collections/recent/")
    /* JADX INFO: renamed from: j */
    Object m25715j(@e57("language") String str, Continuation<? super Results<ResultCourseForImport>> continuation);

    @ay1("api/v3/{language}/collections/{collectionId}/give_rose/")
    /* JADX INFO: renamed from: k */
    Object m25716k(@e57("language") String str, @e57("collectionId") Integer num, Continuation<? super m88> continuation);
}
