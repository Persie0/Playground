package p000;

import com.lingq.core.network.api.result.ResultFreeAiTts;
import com.lingq.core.network.api.result.ResultPreferredTtsVoices;
import com.lingq.core.network.api.result.ResultTtsUtterance;
import com.lingq.core.network.api.result.ResultTtsVoice;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public interface cda {
    @mj3("api/v2/tts/supported-voices")
    /* JADX INFO: renamed from: a */
    Object m4548a(@sp7("language") String str, @sp7("visibility") String str2, Continuation<? super List<ResultTtsVoice>> continuation);

    @mj3("api/v3/{language}/tts/")
    /* JADX INFO: renamed from: b */
    Object m4549b(@e57("language") String str, @sp7("text") String str2, @sp7("app_name") String str3, @sp7("voice") String str4, @sp7("type") String str5, Continuation<? super ResultTtsUtterance> continuation);

    @j17("api/v3/{language}/tts/batch/")
    @kc3
    /* JADX INFO: renamed from: c */
    Object m4550c(@e57("language") String str, @b33("app_name") String str2, @b33("voice") String str3, @b33("text") Set<String> set, Continuation<? super List<ResultTtsUtterance>> continuation);

    @j17("api/v2/{language}/tts-voices/")
    @kc3
    /* JADX INFO: renamed from: d */
    Object m4551d(@e57("language") String str, @b33("app_name") String str2, @b33("voice") String str3, @b33("if_exists_update") boolean z, Continuation<? super xfa> continuation);

    @mj3("api/v2/{language}/tts-voices/")
    /* JADX INFO: renamed from: e */
    Object m4552e(@e57("language") String str, Continuation<? super ResultPreferredTtsVoices> continuation);

    @j17("api/v2/tts/free-ai-tts/")
    @kc3
    /* JADX INFO: renamed from: f */
    Object m4553f(@b33("language") String str, Continuation<? super ResultFreeAiTts> continuation);
}
