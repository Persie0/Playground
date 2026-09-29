package p460wh;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.network.requests.RequestBookmarkLesson;
import com.lingq.shared.network.requests.RequestLessonImport;
import com.lingq.shared.network.requests.RequestLessonUpdateSave;
import com.lingq.shared.network.requests.RequestLessonUpdateStats;
import com.lingq.shared.network.requests.RequestLessonUpdateTimestamps;
import com.lingq.shared.network.requests.RequestTranslateSentence;
import com.lingq.shared.network.requests.RequestTranslationSentence;
import com.lingq.shared.network.result.ResultLesson;
import com.lingq.shared.network.result.ResultLessonBookmark;
import com.lingq.shared.network.result.ResultLessonInfo;
import com.lingq.shared.network.result.ResultLessonTags;
import com.lingq.shared.network.result.ResultLessonUpload;
import com.lingq.shared.network.result.ResultSharedByUser;
import com.lingq.shared.network.result.ResultTranslationSentence;
import com.lingq.shared.network.result.ResultTranslationSentenceV2;
import com.lingq.shared.network.result.Results;
import java.util.List;
import kotlin.Metadata;
import p250lp.InterfaceC7424a;
import p250lp.InterfaceC7425b;
import p250lp.InterfaceC7429f;
import p250lp.InterfaceC7431h;
import p250lp.InterfaceC7435l;
import p250lp.InterfaceC7437n;
import p250lp.InterfaceC7438o;
import p250lp.InterfaceC7440q;
import p250lp.InterfaceC7442s;
import p250lp.InterfaceC7443t;
import p464wl.InterfaceC9968c;
import so.AbstractC9107y;
import so.C9099q;

/* JADX INFO: renamed from: wh.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J5\u0010\t\u001a\u00020\b2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ5\u0010\f\u001a\u00020\u000b2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\nJ?\u0010\u000f\u001a\u00020\u000e2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\r\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0012\u001a\u00020\u00112\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0016\u001a\u00020\u000e2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0014H§@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0018\u001a\u00020\u000e2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0013J+\u0010\u0019\u001a\u00020\u000e2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0013J+\u0010\u001a\u001a\u00020\u000e2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0013J7\u0010\u001d\u001a\u00020\u000e2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u001bH§@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010\u001f\u001a\u00020\u000e2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0013J+\u0010#\u001a\u00020\u000e2\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010!H§@ø\u0001\u0000¢\u0006\u0004\b#\u0010$J+\u0010%\u001a\u00020\u000e2\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010!H§@ø\u0001\u0000¢\u0006\u0004\b%\u0010$J;\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0004\b(\u0010\nJ7\u0010+\u001a\u00020\u000e2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010*\u001a\u0004\u0018\u00010)H§@ø\u0001\u0000¢\u0006\u0004\b+\u0010,J+\u0010/\u001a\u00020\b2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010.\u001a\u0004\u0018\u00010-H§@ø\u0001\u0000¢\u0006\u0004\b/\u00100J5\u00104\u001a\u0002032\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u00102\u001a\u0004\u0018\u000101H§@ø\u0001\u0000¢\u0006\u0004\b4\u00105J9\u0010;\u001a\b\u0012\u0004\u0012\u00020:092\b\b\u0003\u00106\u001a\u00020\u00042\b\b\u0003\u00107\u001a\u00020\u00022\n\b\u0001\u00108\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b;\u0010<J[\u0010@\u001a\b\u0012\u0004\u0012\u00020?092\b\b\u0003\u0010=\u001a\u00020\u00042\b\b\u0003\u00106\u001a\u00020\u00042\n\b\u0001\u00108\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u00107\u001a\u00020\u00022\n\b\u0003\u0010>\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ?\u0010F\u001a\u00020E2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010C\u001a\u00020B2\b\b\u0001\u0010D\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\bF\u0010GJ=\u0010J\u001a\u00020\u000e2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0001\u0010I\u001a\n\u0012\u0004\u0012\u00020H\u0018\u00010&H§@ø\u0001\u0000¢\u0006\u0004\bJ\u0010K\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006L"}, m13365d2 = {"Lwh/f;", "", "", "language", "", "lessonId", "", "doNotOpen", "Lcom/lingq/shared/network/result/ResultLesson;", "l", "(Ljava/lang/String;Ljava/lang/Integer;ZLwl/c;)Ljava/lang/Object;", "Lcom/lingq/shared/network/result/ResultLessonInfo;", "b", "type", "Lso/y;", "k", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZLwl/c;)Ljava/lang/Object;", "Lcom/lingq/shared/network/result/ResultLessonBookmark;", "j", "(Ljava/lang/String;Ljava/lang/Integer;Lwl/c;)Ljava/lang/Object;", "Lcom/lingq/shared/network/requests/RequestBookmarkLesson;", "requestBookmarkLesson", "e", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/lingq/shared/network/requests/RequestBookmarkLesson;Lwl/c;)Ljava/lang/Object;", "c", "p", "h", "Lcom/lingq/shared/network/requests/RequestLessonUpdateStats;", "requestLessonUpdateStats", "t", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/lingq/shared/network/requests/RequestLessonUpdateStats;Lwl/c;)Ljava/lang/Object;", "a", "contextId", "Lcom/lingq/shared/network/requests/RequestLessonUpdateSave;", "requestLessonUpdateSave", "n", "(Ljava/lang/Integer;Lcom/lingq/shared/network/requests/RequestLessonUpdateSave;Lwl/c;)Ljava/lang/Object;", "g", "", "Lcom/lingq/shared/network/result/ResultTranslationSentence;", "o", "Lcom/lingq/shared/network/requests/RequestTranslationSentence;", "requestTranslationSentence", "d", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/lingq/shared/network/requests/RequestTranslationSentence;Lwl/c;)Ljava/lang/Object;", "Lcom/lingq/shared/network/requests/RequestLessonImport;", "requestLessonImport", "r", "(Ljava/lang/String;Lcom/lingq/shared/network/requests/RequestLessonImport;Lwl/c;)Ljava/lang/Object;", "Lcom/lingq/shared/network/requests/RequestTranslateSentence;", "translateRequest", "Lcom/lingq/shared/network/result/ResultTranslationSentenceV2;", "f", "(Ljava/lang/String;ILcom/lingq/shared/network/requests/RequestTranslateSentence;Lwl/c;)Ljava/lang/Object;", "pageSize", "sortBy", "query", "Lcom/lingq/shared/network/result/Results;", "Lcom/lingq/shared/network/result/ResultLessonTags;", "s", "(ILjava/lang/String;Ljava/lang/String;Lwl/c;)Ljava/lang/Object;", "page", "searchCriteria", "Lcom/lingq/shared/network/result/ResultSharedByUser;", "m", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lwl/c;)Ljava/lang/Object;", "Lso/q$c;", "file", "audioLanguage", "Lcom/lingq/shared/network/result/ResultLessonUpload;", "i", "(Ljava/lang/String;Ljava/lang/Integer;Lso/q$c;Ljava/lang/String;Lwl/c;)Ljava/lang/Object;", "Lcom/lingq/shared/network/requests/RequestLessonUpdateTimestamps;", "requestLessonUpdateTimestamps", "q", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lwl/c;)Ljava/lang/Object;", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public interface InterfaceC9938f {
    @InterfaceC7438o("api/v2/{language}/lesson-stats/{lessonId}/take/")
    /* JADX INFO: renamed from: a */
    Object m18459a(@InterfaceC7442s("language") String str, @InterfaceC7442s("lessonId") Integer num, InterfaceC9968c<? super AbstractC9107y> interfaceC9968c);

    @InterfaceC7429f("api/v2/{language}/lessons/{lessonId}/simple/")
    /* JADX INFO: renamed from: b */
    Object m18460b(@InterfaceC7442s("language") String str, @InterfaceC7442s("lessonId") Integer num, @InterfaceC7443t("doNotOpen") boolean z10, InterfaceC9968c<? super ResultLessonInfo> interfaceC9968c);

    @InterfaceC7438o("api/v2/{language}/lessons/{lessonId}/give_rose/")
    /* JADX INFO: renamed from: c */
    Object m18461c(@InterfaceC7442s("language") String str, @InterfaceC7442s("lessonId") Integer num, InterfaceC9968c<? super AbstractC9107y> interfaceC9968c);

    @InterfaceC7438o("api/v3/{language}/lessons/{lessonId}/sentences/")
    /* JADX INFO: renamed from: d */
    Object m18462d(@InterfaceC7442s("language") String str, @InterfaceC7442s("lessonId") Integer num, @InterfaceC7424a RequestTranslationSentence requestTranslationSentence, InterfaceC9968c<? super AbstractC9107y> interfaceC9968c);

    @InterfaceC7438o("api/v3/{language}/lessons/{lessonId}/bookmark/")
    /* JADX INFO: renamed from: e */
    Object m18463e(@InterfaceC7442s("language") String str, @InterfaceC7442s("lessonId") Integer num, @InterfaceC7424a RequestBookmarkLesson requestBookmarkLesson, InterfaceC9968c<? super AbstractC9107y> interfaceC9968c);

    @InterfaceC7438o("api/v2/{language}/lessons/{lessonId}/sentences/")
    /* JADX INFO: renamed from: f */
    Object m18464f(@InterfaceC7442s("language") String str, @InterfaceC7442s("lessonId") int i10, @InterfaceC7424a RequestTranslateSentence requestTranslateSentence, InterfaceC9968c<? super ResultTranslationSentenceV2> interfaceC9968c);

    @InterfaceC7431h(hasBody = true, method = "DELETE", path = "api/v2/contexts/{context}/lesson/")
    /* JADX INFO: renamed from: g */
    Object m18465g(@InterfaceC7442s("context") Integer num, @InterfaceC7424a RequestLessonUpdateSave requestLessonUpdateSave, InterfaceC9968c<? super AbstractC9107y> interfaceC9968c);

    @InterfaceC7438o("api/v2/{language}/lessons/{lessonId}/complete/")
    /* JADX INFO: renamed from: h */
    Object m18466h(@InterfaceC7442s("language") String str, @InterfaceC7442s("lessonId") Integer num, InterfaceC9968c<? super AbstractC9107y> interfaceC9968c);

    @InterfaceC7437n("api/v3/{language}/lessons/{lessonId}/")
    @InterfaceC7435l
    /* JADX INFO: renamed from: i */
    Object m18467i(@InterfaceC7442s("language") String str, @InterfaceC7442s("lessonId") Integer num, @InterfaceC7440q C9099q.c cVar, @InterfaceC7440q("language") String str2, InterfaceC9968c<? super ResultLessonUpload> interfaceC9968c);

    @InterfaceC7429f("api/v3/{language}/lessons/{lessonId}/bookmark/")
    /* JADX INFO: renamed from: j */
    Object m18468j(@InterfaceC7442s("language") String str, @InterfaceC7442s("lessonId") Integer num, InterfaceC9968c<? super ResultLessonBookmark> interfaceC9968c);

    @InterfaceC7429f("api/v3/{language}/lessons/{lessonId}/text/")
    /* JADX INFO: renamed from: k */
    Object m18469k(@InterfaceC7442s("language") String str, @InterfaceC7442s("lessonId") Integer num, @InterfaceC7443t("type") String str2, @InterfaceC7443t("doNotOpen") boolean z10, InterfaceC9968c<? super AbstractC9107y> interfaceC9968c);

    @InterfaceC7429f("api/v3/{language}/lessons/{lessonId}/")
    /* JADX INFO: renamed from: l */
    Object m18470l(@InterfaceC7442s("language") String str, @InterfaceC7442s("lessonId") Integer num, @InterfaceC7443t("doNotOpen") boolean z10, InterfaceC9968c<? super ResultLesson> interfaceC9968c);

    @InterfaceC7429f("api/v2/users/")
    /* JADX INFO: renamed from: m */
    Object m18471m(@InterfaceC7443t("page") int i10, @InterfaceC7443t("page_size") int i11, @InterfaceC7443t("q") String str, @InterfaceC7443t("sortBy") String str2, @InterfaceC7443t("search_criteria") String str3, @InterfaceC7443t("language") String str4, InterfaceC9968c<? super Results<ResultSharedByUser>> interfaceC9968c);

    @InterfaceC7438o("api/v2/contexts/{context}/lesson/")
    /* JADX INFO: renamed from: n */
    Object m18472n(@InterfaceC7442s("context") Integer num, @InterfaceC7424a RequestLessonUpdateSave requestLessonUpdateSave, InterfaceC9968c<? super AbstractC9107y> interfaceC9968c);

    @InterfaceC7429f("api/v3/{language}/lessons/{lessonId}/sentences/")
    /* JADX INFO: renamed from: o */
    Object m18473o(@InterfaceC7442s("language") String str, @InterfaceC7442s("lessonId") Integer num, @InterfaceC7443t("doNotOpen") boolean z10, InterfaceC9968c<? super List<ResultTranslationSentence>> interfaceC9968c);

    @InterfaceC7425b("api/v2/{language}/lessons/{lessonId}/give_rose/")
    /* JADX INFO: renamed from: p */
    Object m18474p(@InterfaceC7442s("language") String str, @InterfaceC7442s("lessonId") Integer num, InterfaceC9968c<? super AbstractC9107y> interfaceC9968c);

    @InterfaceC7438o("api/v3/{language}/lessons/{lessonId}/timestamps/")
    /* JADX INFO: renamed from: q */
    Object m18475q(@InterfaceC7442s("language") String str, @InterfaceC7442s("lessonId") Integer num, @InterfaceC7424a List<RequestLessonUpdateTimestamps> list, InterfaceC9968c<? super AbstractC9107y> interfaceC9968c);

    @InterfaceC7438o("api/v3/{language}/lessons/import/")
    /* JADX INFO: renamed from: r */
    Object m18476r(@InterfaceC7442s("language") String str, @InterfaceC7424a RequestLessonImport requestLessonImport, InterfaceC9968c<? super ResultLesson> interfaceC9968c);

    @InterfaceC7429f("api/v2/lesson-tags/")
    /* JADX INFO: renamed from: s */
    Object m18477s(@InterfaceC7443t("page_size") int i10, @InterfaceC7443t("search_criteria") String str, @InterfaceC7443t("q") String str2, InterfaceC9968c<? super Results<ResultLessonTags>> interfaceC9968c);

    @InterfaceC7437n("api/v2/{language}/lesson-stats/{lessonId}/")
    /* JADX INFO: renamed from: t */
    Object m18478t(@InterfaceC7442s("language") String str, @InterfaceC7442s("lessonId") Integer num, @InterfaceC7424a RequestLessonUpdateStats requestLessonUpdateStats, InterfaceC9968c<? super AbstractC9107y> interfaceC9968c);
}
