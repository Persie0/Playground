package p000;

import com.lingq.core.network.api.requests.RequestShelfPinUpdate;
import com.lingq.core.network.api.result.ResultLibraryCounter;
import com.lingq.core.network.api.result.ResultLibraryItem;
import com.lingq.core.network.api.result.ResultPlaylistFolder;
import com.lingq.core.network.api.result.ResultShelf;
import com.lingq.core.network.api.result.Results;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public interface ca5 {
    @mj3("api/v2/{language}/collections/{collectionId}/buy/")
    /* JADX INFO: renamed from: a */
    Object m4461a(@e57("language") String str, @e57("collectionId") Integer num, Continuation<? super i88<xfa>> continuation);

    @mj3
    /* JADX INFO: renamed from: b */
    Object m4462b(@kja String str, Continuation<? super Results<ResultPlaylistFolder>> continuation);

    @mj3("api/v3/{language}/lessons/counters/")
    /* JADX INFO: renamed from: d */
    Object m4463d(@e57("language") String str, @sp7("lesson") List<Integer> list, Continuation<? super Map<Integer, ResultLibraryCounter>> continuation);

    @j17("api/v3/{language}/shelves/unpin/")
    /* JADX INFO: renamed from: e */
    Object m4464e(@e57("language") String str, @be0 RequestShelfPinUpdate requestShelfPinUpdate, Continuation<? super m88> continuation);

    @mj3("api/v3/{language}/shelves/")
    /* JADX INFO: renamed from: f */
    Object m4465f(@e57("language") String str, @sp7("suppress") List<String> list, @sp7("level") List<String> list2, Continuation<? super List<ResultShelf>> continuation);

    @mj3
    /* JADX INFO: renamed from: g */
    Object m4466g(@kja String str, Continuation<? super Results<ResultLibraryItem>> continuation);

    @mj3("api/v3/{language}/search/")
    /* JADX INFO: renamed from: h */
    Object m4467h(@e57("language") String str, @sp7("collection") Integer num, @sp7("sortBy") String str2, @sp7("type") String str3, @sp7("page_size") int i, @sp7("page") int i2, @sp7("suppress") List<String> list, Continuation<? super Results<ResultLibraryItem>> continuation);

    @mj3("api/v3/{language}/search/")
    /* JADX INFO: renamed from: i */
    Object m4468i(@e57("language") String str, @sp7("page_size") Integer num, @sp7("sortBy") String str2, @sp7("type") String str3, @sp7("level") Set<Integer> set, @sp7("shelf") String str4, @sp7("resource") Set<String> set2, @sp7("q") String str5, @sp7("isExternal") Boolean bool, @sp7("isPersonal") Boolean bool2, @sp7("provider") Integer num2, @sp7("tag") List<String> list, @sp7("accent") List<String> list2, @sp7("sharedBy") Integer num3, @sp7("isPending") Boolean bool3, @sp7("page") int i, @sp7("suppress") List<String> list3, Continuation<? super Results<ResultLibraryItem>> continuation);

    @mj3("api/v3/{language}/collections/counters/")
    /* JADX INFO: renamed from: j */
    Object m4469j(@e57("language") String str, @sp7("collection") List<Integer> list, Continuation<? super Map<Integer, ResultLibraryCounter>> continuation);

    @j17("api/v3/{language}/shelves/pin/")
    /* JADX INFO: renamed from: k */
    Object m4470k(@e57("language") String str, @be0 RequestShelfPinUpdate requestShelfPinUpdate, Continuation<? super m88> continuation);
}
