package p460wh;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.network.result.ResultLibraryCounter;
import com.lingq.shared.network.result.ResultLibraryItem;
import com.lingq.shared.network.result.ResultShelf;
import com.lingq.shared.network.result.Results;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jp.C6553u;
import kotlin.Metadata;
import p250lp.InterfaceC7429f;
import p250lp.InterfaceC7442s;
import p250lp.InterfaceC7443t;
import p250lp.InterfaceC7448y;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: wh.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JE\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJó\u0001\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00022\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0010\b\u0003\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0010\b\u0003\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\n2\b\b\u0003\u0010\u0019\u001a\u00020\n2\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\b\b\u0001\u0010\u001e\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 Jq\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\u0019\u001a\u00020\n2\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J=\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020&0%2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0001\u0010$\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0004H§@ø\u0001\u0000¢\u0006\u0004\b'\u0010(J=\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020&0%2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0001\u0010)\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0004H§@ø\u0001\u0000¢\u0006\u0004\b*\u0010(J3\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\nH§@ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, m13365d2 = {"Lwh/g;", "", "", "language", "", "suppressed", "levels", "Lcom/lingq/shared/network/result/ResultShelf;", "c", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lwl/c;)Ljava/lang/Object;", "", "pageSize", "sortBy", "type", "", "shelf", "resources", "query", "", "isExternal", "isPersonal", "provider", "tags", "accents", "sharedBy", "page", "Lcom/lingq/shared/network/result/Results;", "Lcom/lingq/shared/network/result/ResultLibraryItem;", "e", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;ILjava/util/List;Lwl/c;)Ljava/lang/Object;", "url", "d", "(Ljava/lang/String;Lwl/c;)Ljava/lang/Object;", "collectionId", "f", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;IILjava/util/List;Lwl/c;)Ljava/lang/Object;", "lessonsIds", "", "Lcom/lingq/shared/network/result/ResultLibraryCounter;", "b", "(Ljava/lang/String;Ljava/util/List;Lwl/c;)Ljava/lang/Object;", "collectionsIds", "g", "Ljp/u;", "Lsl/e;", "a", "(Ljava/lang/String;Ljava/lang/Integer;Lwl/c;)Ljava/lang/Object;", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public interface InterfaceC9939g {

    /* JADX INFO: renamed from: wh.g$a */
    public static final class a {
    }

    @InterfaceC7429f("api/v2/{language}/collections/{collectionId}/buy/")
    /* JADX INFO: renamed from: a */
    Object m18479a(@InterfaceC7442s("language") String str, @InterfaceC7442s("collectionId") Integer num, InterfaceC9968c<? super C6553u<C9072e>> interfaceC9968c);

    @InterfaceC7429f("api/v3/{language}/lessons/counters/")
    /* JADX INFO: renamed from: b */
    Object m18480b(@InterfaceC7442s("language") String str, @InterfaceC7443t("lesson") List<Integer> list, InterfaceC9968c<? super Map<Integer, ResultLibraryCounter>> interfaceC9968c);

    @InterfaceC7429f("api/v3/{language}/shelves/")
    /* JADX INFO: renamed from: c */
    Object m18481c(@InterfaceC7442s("language") String str, @InterfaceC7443t("suppress") List<String> list, @InterfaceC7443t("level") List<String> list2, InterfaceC9968c<? super List<ResultShelf>> interfaceC9968c);

    @InterfaceC7429f
    /* JADX INFO: renamed from: d */
    Object m18482d(@InterfaceC7448y String str, InterfaceC9968c<? super Results<ResultLibraryItem>> interfaceC9968c);

    @InterfaceC7429f("api/v3/{language}/search/")
    /* JADX INFO: renamed from: e */
    Object m18483e(@InterfaceC7442s("language") String str, @InterfaceC7443t("page_size") Integer num, @InterfaceC7443t("sortBy") String str2, @InterfaceC7443t("type") String str3, @InterfaceC7443t("level") Set<Integer> set, @InterfaceC7443t("shelf") String str4, @InterfaceC7443t("resource") Set<String> set2, @InterfaceC7443t("q") String str5, @InterfaceC7443t("isExternal") Boolean bool, @InterfaceC7443t("isPersonal") Boolean bool2, @InterfaceC7443t("provider") Integer num2, @InterfaceC7443t("tag") List<String> list, @InterfaceC7443t("accent") List<String> list2, @InterfaceC7443t("sharedBy") Integer num3, @InterfaceC7443t("page") int i10, @InterfaceC7443t("suppress") List<String> list3, InterfaceC9968c<? super Results<ResultLibraryItem>> interfaceC9968c);

    @InterfaceC7429f("api/v3/{language}/search/")
    /* JADX INFO: renamed from: f */
    Object m18484f(@InterfaceC7442s("language") String str, @InterfaceC7443t("collection") Integer num, @InterfaceC7443t("sortBy") String str2, @InterfaceC7443t("type") String str3, @InterfaceC7443t("page_size") int i10, @InterfaceC7443t("page") int i11, @InterfaceC7443t("suppress") List<String> list, InterfaceC9968c<? super Results<ResultLibraryItem>> interfaceC9968c);

    @InterfaceC7429f("api/v3/{language}/collections/counters/")
    /* JADX INFO: renamed from: g */
    Object m18485g(@InterfaceC7442s("language") String str, @InterfaceC7443t("collection") List<Integer> list, InterfaceC9968c<? super Map<Integer, ResultLibraryCounter>> interfaceC9968c);
}
