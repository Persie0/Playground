package p000;

import com.lingq.core.network.api.requests.RequestHintUpdate;
import com.lingq.core.network.api.requests.RequestTranslate;
import com.lingq.core.network.api.result.ResultExplain;
import com.lingq.core.network.api.result.ResultMeaning;
import com.lingq.core.network.api.result.ResultRelatedPhrase;
import com.lingq.core.network.api.result.ResultTokenCwt;
import com.lingq.core.network.api.result.ResultTranslationGoogle;
import java.util.List;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public interface x3a {
    @mj3("api/v3/{language}/lessons/{lessonId}/explain/")
    /* JADX INFO: renamed from: a */
    Object m24254a(@e57("language") String str, @e57("lessonId") Integer num, @sp7("sentence_idx") Integer num2, @sp7("start_idx") Integer num3, @sp7("end_idx") Integer num4, @sp7("level") String str2, Continuation<? super ResultExplain> continuation);

    @g17("api/v2/hints/{id}/")
    /* JADX INFO: renamed from: b */
    Object m24255b(@e57("id") Integer num, @be0 RequestHintUpdate requestHintUpdate, Continuation<? super m88> continuation);

    @mj3("api/v2/{language}/related-phrases/")
    /* JADX INFO: renamed from: c */
    Object m24256c(@e57("language") String str, @sp7("word") String str2, @sp7("fragment") String str3, @sp7("start") Integer num, Continuation<? super List<ResultRelatedPhrase>> continuation);

    @mj3("api/v2/{language}/hints/search/")
    /* JADX INFO: renamed from: d */
    Object m24257d(@e57("language") String str, @sp7("term") String str2, @sp7("all") Boolean bool, @sp7("locale") String str3, Continuation<? super List<ResultMeaning>> continuation);

    @mj3("api/v3/{language}/lessons/{lessonId}/cwt/")
    /* JADX INFO: renamed from: e */
    Object m24258e(@e57("language") String str, @e57("lessonId") Integer num, @sp7("sentence") Integer num2, @sp7("word") Integer num3, Continuation<? super ResultTokenCwt> continuation);

    @j17("api/v2/{language}/translate/")
    /* JADX INFO: renamed from: f */
    Object m24259f(@e57("language") String str, @be0 RequestTranslate requestTranslate, Continuation<? super ResultTranslationGoogle> continuation);

    @mj3("api/v3/{language}/chat/{id}/messages/{messageIndex}/cwt/")
    /* JADX INFO: renamed from: g */
    Object m24260g(@e57("language") String str, @e57("id") Integer num, @e57("messageIndex") Integer num2, @sp7("sentence") Integer num3, @sp7("word") Integer num4, Continuation<? super ResultTokenCwt> continuation);

    @mj3("api/v3/{language}/chat/{chatId}/messages/{messageIndex}/explain/")
    /* JADX INFO: renamed from: h */
    Object m24261h(@e57("language") String str, @e57("chatId") int i, @e57("messageIndex") int i2, @sp7("sentence_idx") Integer num, @sp7("start_idx") Integer num2, @sp7("end_idx") Integer num3, @sp7("level") String str2, Continuation<? super ResultExplain> continuation);
}
