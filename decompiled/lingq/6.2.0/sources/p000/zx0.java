package p000;

import com.lingq.core.network.api.requests.RequestChatConfig;
import com.lingq.core.network.api.requests.RequestChatDataUsage;
import com.lingq.core.network.api.requests.RequestChatMemory;
import com.lingq.core.network.api.requests.RequestChatMessageRating;
import com.lingq.core.network.api.requests.RequestChatNew;
import com.lingq.core.network.api.requests.RequestChatReply;
import com.lingq.core.network.api.requests.RequestSeedOnboarding;
import com.lingq.core.network.api.result.ResultChatBot;
import com.lingq.core.network.api.result.ResultChatConfig;
import com.lingq.core.network.api.result.ResultChatDataUsage;
import com.lingq.core.network.api.result.ResultChatHistory;
import com.lingq.core.network.api.result.ResultChatHistorySimple;
import com.lingq.core.network.api.result.ResultChatMemory;
import com.lingq.core.network.api.result.ResultChatMessageRating;
import com.lingq.core.network.api.result.ResultChatModelConfig;
import com.lingq.core.network.api.result.ResultChatOld;
import com.lingq.core.network.api.result.ResultChatStats;
import com.lingq.core.network.api.result.ResultChatSuggestion;
import com.lingq.core.network.api.result.ResultChatWordsCards;
import com.lingq.core.network.api.result.ResultLesson;
import com.lingq.core.network.api.result.ResultPhrases;
import com.lingq.core.network.api.result.ResultTranslationChat;
import com.lingq.core.network.api.result.Results;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.serialization.json.C3263c;

/* JADX INFO: loaded from: classes.dex */
public interface zx0 {
    @mj3("api/v3/{lang}/chat/{id}/words/")
    /* JADX INFO: renamed from: a */
    Object m25812a(@e57("lang") String str, @e57("id") int i, Continuation<? super ResultChatWordsCards> continuation);

    @j17("api/v3/{lang}/chat/{id}/import/")
    /* JADX INFO: renamed from: b */
    Object m25813b(@e57("lang") String str, @e57("id") int i, Continuation<? super ResultLesson> continuation);

    @g17("api/v3/{lang}/chat/{id}/config/")
    /* JADX INFO: renamed from: c */
    Object m25814c(@e57("lang") String str, @e57("id") int i, @be0 C3263c c3263c, Continuation<? super ResultChatModelConfig> continuation);

    @g17("api/v3/{lang}/chat/{id}/config/")
    /* JADX INFO: renamed from: d */
    Object m25815d(@e57("lang") String str, @e57("id") int i, @be0 RequestChatConfig requestChatConfig, Continuation<? super ResultChatConfig> continuation);

    @g17("api/v3/{lang}/chat/memory/")
    /* JADX INFO: renamed from: e */
    Object m25816e(@e57("lang") String str, @be0 RequestChatMemory requestChatMemory, Continuation<? super ResultChatMemory> continuation);

    @mj3("api/v3/{lang}/chat/{id}/messages/{index}/translate/")
    /* JADX INFO: renamed from: f */
    Object m25817f(@e57("lang") String str, @e57("id") int i, @e57("index") int i2, Continuation<? super ResultTranslationChat> continuation);

    @mj3("api/v3/{lang}/chat/")
    /* JADX INFO: renamed from: g */
    Object m25818g(@e57("lang") String str, @sp7("search_criteria") String str2, @sp7("search") String str3, Continuation<? super Results<ResultChatOld>> continuation);

    @ay1("api/v3/{lang}/chat/{id}/")
    /* JADX INFO: renamed from: h */
    Object m25819h(@e57("lang") String str, @e57("id") int i, Continuation<? super xfa> continuation);

    @mj3("api/v3/{lang}/chat/{id}/config/")
    /* JADX INFO: renamed from: i */
    Object m25820i(@e57("lang") String str, @e57("id") int i, Continuation<? super ResultChatModelConfig> continuation);

    @ay1("api/v3/{lang}/chat/{id}/messages/{index}/rate/")
    /* JADX INFO: renamed from: j */
    Object m25821j(@e57("lang") String str, @e57("id") int i, @e57("index") int i2, Continuation<? super xfa> continuation);

    @mj3("api/v3/{lang}/chat/suggestions/")
    /* JADX INFO: renamed from: k */
    Object m25822k(@e57("lang") String str, @sp7("chat_id") Integer num, Continuation<? super List<ResultChatSuggestion>> continuation);

    @mj3("api/v3/{lang}/chat/memory/")
    /* JADX INFO: renamed from: l */
    Object m25823l(@e57("lang") String str, Continuation<? super ResultChatMemory> continuation);

    @mj3("api/v3/{lang}/chat/{id}/")
    /* JADX INFO: renamed from: m */
    Object m25824m(@e57("lang") String str, @e57("id") int i, Continuation<? super ResultChatHistory> continuation);

    @j17("api/v3/{lang}/chat/{id}/respond-stream/")
    @jk9
    /* JADX INFO: renamed from: n */
    ul0<m88> m25825n(@e57("lang") String str, @e57("id") int i, @be0 RequestChatReply requestChatReply);

    @j17("api/v3/{lang}/chat/")
    /* JADX INFO: renamed from: o */
    Object m25826o(@e57("lang") String str, @be0 RequestChatNew requestChatNew, Continuation<? super ResultChatHistorySimple> continuation);

    @mj3("api/v3/{lang}/chat/bots/")
    /* JADX INFO: renamed from: p */
    Object m25827p(@e57("lang") String str, Continuation<? super List<ResultChatBot>> continuation);

    @mj3("api/v3/{lang}/chat/{id}/messages/{index}/phrases/")
    /* JADX INFO: renamed from: q */
    Object m25828q(@e57("lang") String str, @e57("id") int i, @e57("index") int i2, Continuation<? super ResultPhrases> continuation);

    @mj3("api/v3/{lang}/chat/data-usage/")
    /* JADX INFO: renamed from: r */
    Object m25829r(@e57("lang") String str, Continuation<? super ResultChatDataUsage> continuation);

    @j17("api/v3/{lang}/chat/memory/seed-from-onboarding/")
    /* JADX INFO: renamed from: s */
    Object m25830s(@e57("lang") String str, @be0 RequestSeedOnboarding requestSeedOnboarding, Continuation<? super ResultChatMemory> continuation);

    @j17("api/v3/{lang}/chat/{id}/messages/{index}/rate/")
    /* JADX INFO: renamed from: t */
    Object m25831t(@e57("lang") String str, @e57("id") int i, @e57("index") int i2, @be0 RequestChatMessageRating requestChatMessageRating, Continuation<? super ResultChatMessageRating> continuation);

    @j17("api/v3/{lang}/chat/create-stream/")
    @jk9
    /* JADX INFO: renamed from: u */
    ul0<m88> m25832u(@e57("lang") String str, @be0 RequestChatNew requestChatNew);

    @mj3("api/v3/{lang}/chat/")
    /* JADX INFO: renamed from: v */
    Object m25833v(@e57("lang") String str, Continuation<? super Results<ResultChatOld>> continuation);

    @g17("api/v3/{lang}/chat/data-usage/")
    /* JADX INFO: renamed from: w */
    Object m25834w(@e57("lang") String str, @be0 RequestChatDataUsage requestChatDataUsage, Continuation<? super ResultChatDataUsage> continuation);

    @mj3("api/v3/{lang}/chat/{id}/stats/")
    /* JADX INFO: renamed from: x */
    Object m25835x(@e57("lang") String str, @e57("id") int i, Continuation<? super ResultChatStats> continuation);
}
