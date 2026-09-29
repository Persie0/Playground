package p000;

import com.lingq.core.network.api.requests.RequestReport;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes2.dex */
public interface w68 {
    @j17("api/v3/{language}/collections/{collectionId}/flags/")
    /* JADX INFO: renamed from: a */
    Object m23777a(@e57("language") String str, @e57("collectionId") Integer num, @be0 RequestReport requestReport, Continuation<? super m88> continuation);

    @j17("api/v3/{language}/lessons/{lessonId}/flags/")
    /* JADX INFO: renamed from: b */
    Object m23778b(@e57("language") String str, @e57("lessonId") Integer num, @be0 RequestReport requestReport, Continuation<? super m88> continuation);
}
