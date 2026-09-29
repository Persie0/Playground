package p460wh;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.network.requests.RequestPlaylistCreate;
import com.lingq.shared.network.requests.RequestPlaylistLessonAction;
import com.lingq.shared.network.requests.RequestPlaylistOrder;
import com.lingq.shared.network.result.ResultPlaylist;
import com.lingq.shared.network.result.ResultPlaylistFolder;
import com.lingq.shared.network.result.Results;
import kotlin.Metadata;
import p250lp.InterfaceC7424a;
import p250lp.InterfaceC7425b;
import p250lp.InterfaceC7429f;
import p250lp.InterfaceC7437n;
import p250lp.InterfaceC7438o;
import p250lp.InterfaceC7442s;
import p250lp.InterfaceC7443t;
import p464wl.InterfaceC9968c;
import so.AbstractC9107y;

/* JADX INFO: renamed from: wh.k */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J+\u0010\u0007\u001a\u00020\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000b\u001a\u00020\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\tH§@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\r\u001a\u00020\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\tH§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\fJ=\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\tH§@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0016\u001a\u00020\u00112\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u0014H§@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J5\u0010\u001b\u001a\u00020\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u001a\u001a\u00020\u0019H§@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJI\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00102\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\tH§@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J+\u0010\"\u001a\u00020\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J5\u0010$\u001a\u00020\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u0014H§@ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, m13365d2 = {"Lwh/k;", "", "", "language", "Lcom/lingq/shared/network/requests/RequestPlaylistOrder;", "lessons", "Lso/y;", "h", "(Ljava/lang/String;Lcom/lingq/shared/network/requests/RequestPlaylistOrder;Lwl/c;)Ljava/lang/Object;", "", "lessonId", "d", "(Ljava/lang/String;Ljava/lang/Integer;Lwl/c;)Ljava/lang/Object;", "g", "page", "pageSize", "Lcom/lingq/shared/network/result/Results;", "Lcom/lingq/shared/network/result/ResultPlaylistFolder;", "a", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lwl/c;)Ljava/lang/Object;", "Lcom/lingq/shared/network/requests/RequestPlaylistCreate;", "requestPlaylistCreate", "b", "(Ljava/lang/String;Lcom/lingq/shared/network/requests/RequestPlaylistCreate;Lwl/c;)Ljava/lang/Object;", "id", "Lcom/lingq/shared/network/requests/RequestPlaylistLessonAction;", "requestPlaylistLessonAction", "e", "(Ljava/lang/String;Ljava/lang/String;Lcom/lingq/shared/network/requests/RequestPlaylistLessonAction;Lwl/c;)Ljava/lang/Object;", "folderId", "Lcom/lingq/shared/network/result/ResultPlaylist;", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lwl/c;)Ljava/lang/Object;", "playlistId", "c", "(Ljava/lang/String;Ljava/lang/String;Lwl/c;)Ljava/lang/Object;", "i", "(Ljava/lang/String;Ljava/lang/String;Lcom/lingq/shared/network/requests/RequestPlaylistCreate;Lwl/c;)Ljava/lang/Object;", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public interface InterfaceC9943k {
    @InterfaceC7429f("api/v3/{language}/folders/")
    /* JADX INFO: renamed from: a */
    Object m18493a(@InterfaceC7442s("language") String str, @InterfaceC7443t("page") Integer num, @InterfaceC7443t("page_size") Integer num2, InterfaceC9968c<? super Results<ResultPlaylistFolder>> interfaceC9968c);

    @InterfaceC7438o("api/v3/{language}/folders/")
    /* JADX INFO: renamed from: b */
    Object m18494b(@InterfaceC7442s("language") String str, @InterfaceC7424a RequestPlaylistCreate requestPlaylistCreate, InterfaceC9968c<? super ResultPlaylistFolder> interfaceC9968c);

    @InterfaceC7425b("api/v3/{language}/folders/{id}/")
    /* JADX INFO: renamed from: c */
    Object m18495c(@InterfaceC7442s("language") String str, @InterfaceC7442s("id") String str2, InterfaceC9968c<? super AbstractC9107y> interfaceC9968c);

    @InterfaceC7438o("api/v2/{language}/lessons/{lessonId}/favorite/")
    /* JADX INFO: renamed from: d */
    Object m18496d(@InterfaceC7442s("language") String str, @InterfaceC7442s("lessonId") Integer num, InterfaceC9968c<? super AbstractC9107y> interfaceC9968c);

    @InterfaceC7438o("api/v3/{language}/folders/{id}/items/")
    /* JADX INFO: renamed from: e */
    Object m18497e(@InterfaceC7442s("language") String str, @InterfaceC7442s("id") String str2, @InterfaceC7424a RequestPlaylistLessonAction requestPlaylistLessonAction, InterfaceC9968c<? super AbstractC9107y> interfaceC9968c);

    @InterfaceC7429f("api/v3/{language}/folders/{id}/items/")
    /* JADX INFO: renamed from: f */
    Object m18498f(@InterfaceC7442s("language") String str, @InterfaceC7442s("id") String str2, @InterfaceC7443t("page") Integer num, @InterfaceC7443t("page_size") Integer num2, InterfaceC9968c<? super Results<ResultPlaylist>> interfaceC9968c);

    @InterfaceC7425b("api/v2/{language}/lessons/{lessonId}/favorite/")
    /* JADX INFO: renamed from: g */
    Object m18499g(@InterfaceC7442s("language") String str, @InterfaceC7442s("lessonId") Integer num, InterfaceC9968c<? super AbstractC9107y> interfaceC9968c);

    @InterfaceC7438o("api/v2/{language}/lessons/favorite/")
    /* JADX INFO: renamed from: h */
    Object m18500h(@InterfaceC7442s("language") String str, @InterfaceC7424a RequestPlaylistOrder requestPlaylistOrder, InterfaceC9968c<? super AbstractC9107y> interfaceC9968c);

    @InterfaceC7437n("api/v3/{language}/folders/{id}/")
    /* JADX INFO: renamed from: i */
    Object m18501i(@InterfaceC7442s("language") String str, @InterfaceC7442s("id") String str2, @InterfaceC7424a RequestPlaylistCreate requestPlaylistCreate, InterfaceC9968c<? super AbstractC9107y> interfaceC9968c);
}
