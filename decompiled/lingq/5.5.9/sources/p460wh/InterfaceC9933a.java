package p460wh;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.network.requests.RequestClozeTest;
import com.lingq.shared.network.requests.RequestDataCard;
import com.lingq.shared.network.result.ResultCardReview;
import com.lingq.shared.network.result.ResultVocabularyCard;
import com.lingq.shared.network.result.Results;
import java.util.List;
import jp.C6553u;
import kotlin.Metadata;
import p250lp.InterfaceC7424a;
import p250lp.InterfaceC7429f;
import p250lp.InterfaceC7437n;
import p250lp.InterfaceC7438o;
import p250lp.InterfaceC7442s;
import p250lp.InterfaceC7443t;
import p464wl.InterfaceC9968c;
import so.AbstractC9107y;

/* JADX INFO: renamed from: wh.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J+\u0010\u0007\u001a\u00020\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u000b\u001a\u00020\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJÃ\u0001\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u001b2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0012\b\u0001\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00122\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0010\b\u0001\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00122\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\tH§@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010\u001f\u001a\u00020\u001e2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\tH§@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J+\u0010\"\u001a\u00020!2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\tH§@ø\u0001\u0000¢\u0006\u0004\b\"\u0010 J?\u0010%\u001a\u00020$2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\b\u0001\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00122\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b%\u0010&JE\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020'2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\b\u0001\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00122\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b(\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, m13365d2 = {"Lwh/a;", "", "", "language", "Lcom/lingq/shared/network/requests/RequestDataCard;", "dataCard", "Lcom/lingq/shared/network/result/ResultVocabularyCard;", "a", "(Ljava/lang/String;Lcom/lingq/shared/network/requests/RequestDataCard;Lwl/c;)Ljava/lang/Object;", "", "cardId", "g", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/lingq/shared/network/requests/RequestDataCard;Lwl/c;)Ljava/lang/Object;", "page", "pageSize", "term", "searchCriteria", "sortBy", "", "status", "", "srsDue", "phrases", "srsDate", "tags", "course", "lesson", "Lcom/lingq/shared/network/result/Results;", "c", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Lwl/c;)Ljava/lang/Object;", "Lcom/lingq/shared/network/result/ResultCardReview;", "b", "(Ljava/lang/String;Ljava/lang/Integer;Lwl/c;)Ljava/lang/Object;", "Lcom/lingq/shared/network/requests/RequestClozeTest;", "d", "exportType", "Lso/y;", "e", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lwl/c;)Ljava/lang/Object;", "Ljp/u;", "f", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public interface InterfaceC9933a {
    @InterfaceC7438o("api/v3/{language}/cards/")
    /* JADX INFO: renamed from: a */
    Object m18416a(@InterfaceC7442s("language") String str, @InterfaceC7424a RequestDataCard requestDataCard, InterfaceC9968c<? super ResultVocabularyCard> interfaceC9968c);

    @InterfaceC7438o("api/v3/{language}/cards/{pk}/review/")
    /* JADX INFO: renamed from: b */
    Object m18417b(@InterfaceC7442s("language") String str, @InterfaceC7442s("pk") Integer num, InterfaceC9968c<? super ResultCardReview> interfaceC9968c);

    @InterfaceC7429f("api/v3/{language}/cards/")
    /* JADX INFO: renamed from: c */
    Object m18418c(@InterfaceC7442s("language") String str, @InterfaceC7443t("page") Integer num, @InterfaceC7443t("page_size") Integer num2, @InterfaceC7443t("search") String str2, @InterfaceC7443t("search_criteria") String str3, @InterfaceC7443t("sort") String str4, @InterfaceC7443t("status") List<Integer> list, @InterfaceC7443t("srs_due") Boolean bool, @InterfaceC7443t("phrases") Boolean bool2, @InterfaceC7443t("lotd_date") String str5, @InterfaceC7443t("tag") List<String> list2, @InterfaceC7443t("collection_id") Integer num3, @InterfaceC7443t("content_id") Integer num4, InterfaceC9968c<? super Results<ResultVocabularyCard>> interfaceC9968c);

    @InterfaceC7429f("api/v3/{language}/cards/{pk}/activity/cloze/")
    /* JADX INFO: renamed from: d */
    Object m18419d(@InterfaceC7442s("language") String str, @InterfaceC7442s("pk") Integer num, InterfaceC9968c<? super RequestClozeTest> interfaceC9968c);

    @InterfaceC7429f("api/v2/{language}/cards/export/")
    /* JADX INFO: renamed from: e */
    Object m18420e(@InterfaceC7442s("language") String str, @InterfaceC7443t("cards") List<Integer> list, @InterfaceC7443t("export_type") String str2, InterfaceC9968c<? super AbstractC9107y> interfaceC9968c);

    @InterfaceC7429f("api/v2/{language}/cards/export/")
    /* JADX INFO: renamed from: f */
    Object m18421f(@InterfaceC7442s("language") String str, @InterfaceC7443t("status") List<Integer> list, @InterfaceC7443t("export_type") String str2, InterfaceC9968c<? super C6553u<String>> interfaceC9968c);

    @InterfaceC7437n("api/v3/{language}/cards/{cardId}/")
    /* JADX INFO: renamed from: g */
    Object m18422g(@InterfaceC7442s("language") String str, @InterfaceC7442s("cardId") Integer num, @InterfaceC7424a RequestDataCard requestDataCard, InterfaceC9968c<? super ResultVocabularyCard> interfaceC9968c);
}
