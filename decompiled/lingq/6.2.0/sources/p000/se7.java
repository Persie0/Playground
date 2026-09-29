package p000;

import com.lingq.core.network.api.requests.RequestPlaylistCreate;
import com.lingq.core.network.api.requests.RequestPlaylistLessonAction;
import com.lingq.core.network.api.requests.RequestPlaylistOrder;
import com.lingq.core.network.api.result.ResultPlaylist;
import com.lingq.core.network.api.result.ResultPlaylistFolder;
import com.lingq.core.network.api.result.Results;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public interface se7 {
    @j17("api/v3/{language}/folders/{id}/archive/")
    /* JADX INFO: renamed from: a */
    Object m21310a(@e57("language") String str, @e57("id") int i, Continuation<? super m88> continuation);

    @mj3("api/v3/{language}/folders/")
    /* JADX INFO: renamed from: b */
    Object m21311b(@e57("language") String str, @sp7("page") Integer num, @sp7("page_size") Integer num2, Continuation<? super Results<ResultPlaylistFolder>> continuation);

    @j17("api/v3/{language}/folders/{id}/items/")
    /* JADX INFO: renamed from: c */
    Object m21312c(@e57("language") String str, @e57("id") String str2, @be0 RequestPlaylistLessonAction requestPlaylistLessonAction, Continuation<? super m88> continuation);

    @ay1("api/v3/{language}/folders/{id}/")
    /* JADX INFO: renamed from: d */
    Object m21313d(@e57("language") String str, @e57("id") String str2, Continuation<? super m88> continuation);

    @j17("api/v2/{language}/lessons/{lessonId}/favorite/")
    /* JADX INFO: renamed from: e */
    Object m21314e(@e57("language") String str, @e57("lessonId") Integer num, Continuation<? super m88> continuation);

    @mj3("api/v3/{language}/folders/{id}/items/")
    /* JADX INFO: renamed from: f */
    Object m21315f(@e57("language") String str, @e57("id") String str2, @sp7("page") Integer num, @sp7("page_size") Integer num2, Continuation<? super Results<ResultPlaylist>> continuation);

    @g17("api/v3/{language}/folders/{id}/")
    /* JADX INFO: renamed from: g */
    Object m21316g(@e57("language") String str, @e57("id") String str2, @be0 RequestPlaylistCreate requestPlaylistCreate, Continuation<? super m88> continuation);

    @j17("api/v2/{language}/lessons/favorite/")
    /* JADX INFO: renamed from: h */
    Object m21317h(@e57("language") String str, @be0 RequestPlaylistOrder requestPlaylistOrder, Continuation<? super m88> continuation);

    @j17("api/v3/{language}/folders/{id}/unarchive/")
    /* JADX INFO: renamed from: i */
    Object m21318i(@e57("language") String str, @e57("id") int i, Continuation<? super m88> continuation);

    @ay1("api/v2/{language}/lessons/{lessonId}/favorite/")
    /* JADX INFO: renamed from: j */
    Object m21319j(@e57("language") String str, @e57("lessonId") Integer num, Continuation<? super m88> continuation);

    @j17("api/v3/{language}/folders/")
    /* JADX INFO: renamed from: k */
    Object m21320k(@e57("language") String str, @be0 RequestPlaylistCreate requestPlaylistCreate, Continuation<? super ResultPlaylistFolder> continuation);
}
