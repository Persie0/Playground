package p000;

import com.lingq.core.network.adapters.NetworkResponse;
import com.lingq.core.network.api.requests.RequestBookmarkLesson;
import com.lingq.core.network.api.requests.RequestGentts;
import com.lingq.core.network.api.requests.RequestLessonComplete;
import com.lingq.core.network.api.requests.RequestLessonImport;
import com.lingq.core.network.api.requests.RequestLessonUpdateSave;
import com.lingq.core.network.api.requests.RequestLessonUpdateStats;
import com.lingq.core.network.api.requests.RequestLipp;
import com.lingq.core.network.api.requests.RequestRefreshTranslateSentence;
import com.lingq.core.network.api.requests.RequestTranslationSentence;
import com.lingq.core.network.api.result.ResultLesson;
import com.lingq.core.network.api.result.ResultLessonBookmark;
import com.lingq.core.network.api.result.ResultLessonComplete;
import com.lingq.core.network.api.result.ResultLessonInfo;
import com.lingq.core.network.api.result.ResultLessonStats;
import com.lingq.core.network.api.result.ResultLessonTags;
import com.lingq.core.network.api.result.ResultLessonText;
import com.lingq.core.network.api.result.ResultLessonUpload;
import com.lingq.core.network.api.result.ResultLessonWordsCards;
import com.lingq.core.network.api.result.ResultLipp;
import com.lingq.core.network.api.result.ResultSharedByUser;
import com.lingq.core.network.api.result.ResultTranslationSentence;
import com.lingq.core.network.api.result.ResultTranslationSentenceV3;
import com.lingq.core.network.api.result.Results;
import java.util.List;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes2.dex */
public interface k65 {
    @mj3("api/v3/{language}/lessons/{lessonId}/sentences/")
    /* JADX INFO: renamed from: A */
    Object m14889A(@e57("language") String str, @e57("lessonId") Integer num, @sp7("doNotOpen") boolean z, Continuation<? super NetworkResponse<? extends List<ResultTranslationSentence>>> continuation);

    @mj3("api/v2/{language}/lesson-stats/{lessonId}/")
    /* JADX INFO: renamed from: B */
    Object m14890B(@e57("language") String str, @e57("lessonId") Integer num, Continuation<? super ResultLessonStats> continuation);

    @ay1("api/v2/{language}/lessons/{lessonId}/give_rose/")
    /* JADX INFO: renamed from: C */
    Object m14891C(@e57("language") String str, @e57("lessonId") Integer num, Continuation<? super m88> continuation);

    @j17("api/v3/{language}/lessons/{lessonId}/sentences/")
    /* JADX INFO: renamed from: D */
    Object m14892D(@e57("language") String str, @e57("lessonId") Integer num, @be0 RequestTranslationSentence requestTranslationSentence, Continuation<? super m88> continuation);

    @uq3(hasBody = true, method = "DELETE", path = "api/v2/contexts/{context}/lesson/")
    /* JADX INFO: renamed from: F */
    Object m14893F(@e57("context") Integer num, @be0 RequestLessonUpdateSave requestLessonUpdateSave, Continuation<? super m88> continuation);

    @mj3("api/v2/lesson-tags/")
    /* JADX INFO: renamed from: G */
    Object m14894G(@sp7("page_size") int i, @sp7("search_criteria") String str, @sp7("q") String str2, Continuation<? super Results<ResultLessonTags>> continuation);

    @j17("api/v3/{language}/lessons/import/")
    @k56
    /* JADX INFO: renamed from: H */
    Object m14895H(@e57("language") String str, @u47 l56 l56Var, @u47("save") z68 z68Var, @u47("source") z68 z68Var2, @u47("status") z68 z68Var3, @u47("title") z68 z68Var4, @u47("collection_title") z68 z68Var5, @u47("level") z68 z68Var6, @u47("url") z68 z68Var7, @u47("external_image") z68 z68Var8, @u47("tags") z68 z68Var9, Continuation<? super ResultLesson> continuation);

    @j17("api/v3/{language}/lessons/{lessonId}/simplify/")
    /* JADX INFO: renamed from: I */
    Object m14896I(@e57("language") String str, @e57("lessonId") Integer num, Continuation<? super ResultLesson> continuation);

    @j17("api/v3/{language}/lessons/{lessonId}/lipp/")
    /* JADX INFO: renamed from: J */
    Object m14897J(@e57("language") String str, @e57("lessonId") int i, @be0 RequestLipp requestLipp, Continuation<? super NetworkResponse<ResultLipp>> continuation);

    @j17("api/v2/{language}/lesson-stats/{lessonId}/take/")
    /* JADX INFO: renamed from: b */
    Object m14898b(@e57("language") String str, @e57("lessonId") Integer num, Continuation<? super m88> continuation);

    @mj3("api/v2/{language}/lessons/{lessonId}/simple/")
    /* JADX INFO: renamed from: c */
    Object m14899c(@e57("language") String str, @e57("lessonId") Integer num, @sp7("doNotOpen") boolean z, Continuation<? super ResultLessonInfo> continuation);

    @j17("api/v3/{language}/lessons/{lessonId}/gentts/")
    /* JADX INFO: renamed from: d */
    Object m14900d(@e57("language") String str, @e57("lessonId") Integer num, @be0 RequestGentts requestGentts, Continuation<? super NetworkResponse<ResultLesson>> continuation);

    @j17("api/v3/{language}/lessons/{lessonId}/bookmark/")
    /* JADX INFO: renamed from: f */
    Object m14901f(@e57("language") String str, @e57("lessonId") Integer num, @be0 RequestBookmarkLesson requestBookmarkLesson, Continuation<? super m88> continuation);

    @j17("api/v2/{language}/lessons/{lessonId}/give_rose/")
    /* JADX INFO: renamed from: h */
    Object m14902h(@e57("language") String str, @e57("lessonId") Integer num, Continuation<? super m88> continuation);

    @j17("api/v3/{language}/lessons/{lessonId}/complete/")
    /* JADX INFO: renamed from: j */
    Object m14903j(@e57("language") String str, @e57("lessonId") Integer num, @be0 RequestLessonComplete requestLessonComplete, Continuation<? super ResultLessonComplete> continuation);

    @g17("api/v2/{language}/lesson-stats/{lessonId}/")
    /* JADX INFO: renamed from: l */
    Object m14904l(@e57("language") String str, @e57("lessonId") Integer num, @be0 RequestLessonUpdateStats requestLessonUpdateStats, Continuation<? super m88> continuation);

    @mj3("api/v3/{language}/lessons/{lessonId}/bookmark/")
    /* JADX INFO: renamed from: m */
    Object m14905m(@e57("language") String str, @e57("lessonId") Integer num, Continuation<? super ResultLessonBookmark> continuation);

    @j17("api/v3/{language}/lessons/import/")
    /* JADX INFO: renamed from: n */
    Object m14906n(@e57("language") String str, @be0 RequestLessonImport requestLessonImport, Continuation<? super ResultLesson> continuation);

    @j17("api/v2/contexts/{context}/lesson/")
    /* JADX INFO: renamed from: o */
    Object m14907o(@e57("context") Integer num, @be0 RequestLessonUpdateSave requestLessonUpdateSave, Continuation<? super m88> continuation);

    @mj3("api/v3/{language}/lessons/{lessonId}/")
    /* JADX INFO: renamed from: p */
    Object m14908p(@e57("language") String str, @e57("lessonId") Integer num, @sp7("doNotOpen") boolean z, Continuation<? super ResultLesson> continuation);

    @mj3("api/v3/{language}/lessons/{lessonId}/text/")
    /* JADX INFO: renamed from: q */
    Object m14909q(@e57("language") String str, @e57("lessonId") Integer num, @sp7("type") String str2, @sp7("doNotOpen") boolean z, Continuation<? super m88> continuation);

    @mj3("api/v2/users/")
    /* JADX INFO: renamed from: r */
    Object m14910r(@sp7("page") int i, @sp7("page_size") int i2, @sp7("q") String str, @sp7("sortBy") String str2, @sp7("search_criteria") String str3, @sp7("language") String str4, Continuation<? super Results<ResultSharedByUser>> continuation);

    @mj3("api/v3/{language}/lessons/{lessonId}/words/")
    /* JADX INFO: renamed from: s */
    Object m14911s(@e57("language") String str, @e57("lessonId") Integer num, Continuation<? super NetworkResponse<ResultLessonWordsCards>> continuation);

    @mj3("api/v3/{language}/lessons/{lessonId}/simple/")
    /* JADX INFO: renamed from: t */
    Object m14912t(@e57("language") String str, @e57("lessonId") Integer num, @sp7("doNotOpen") boolean z, Continuation<? super NetworkResponse<ResultLessonText>> continuation);

    @g17("api/v3/{language}/lessons/{lessonId}/")
    @k56
    /* JADX INFO: renamed from: v */
    Object m14913v(@e57("language") String str, @e57("lessonId") Integer num, @u47 l56 l56Var, @u47("language") String str2, Continuation<? super ResultLessonUpload> continuation);

    @j17("api/v3/{language}/lessons/{lessonId}/translation/")
    /* JADX INFO: renamed from: w */
    Object m14914w(@e57("language") String str, @e57("lessonId") int i, @be0 RequestRefreshTranslateSentence requestRefreshTranslateSentence, Continuation<? super List<ResultTranslationSentenceV3>> continuation);

    @mj3("api/v3/{language}/lessons/{lessonId}/info/")
    /* JADX INFO: renamed from: x */
    Object m14915x(@e57("language") String str, @e57("lessonId") Integer num, Continuation<? super ResultLesson> continuation);

    @j17("api/v3/{language}/lessons/{lessonId}/archive/")
    /* JADX INFO: renamed from: y */
    Object m14916y(@e57("language") String str, @e57("lessonId") int i, Continuation<? super m88> continuation);

    @j17("api/v3/{language}/lessons/{lessonId}/unarchive/")
    /* JADX INFO: renamed from: z */
    Object m14917z(@e57("language") String str, @e57("lessonId") int i, Continuation<? super m88> continuation);
}
