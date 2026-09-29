package p000;

import com.lingq.core.network.api.requests.RequestWordsUpdate;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes2.dex */
public interface t7b {
    @j17("api/v2/{language}/ignored-words/")
    /* JADX INFO: renamed from: a */
    Object m21894a(@e57("language") String str, @be0 RequestWordsUpdate requestWordsUpdate, Continuation<? super m88> continuation);

    @j17("api/v2/{language}/known-words/")
    /* JADX INFO: renamed from: b */
    Object m21895b(@e57("language") String str, @be0 RequestWordsUpdate requestWordsUpdate, Continuation<? super m88> continuation);
}
