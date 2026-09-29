package p000;

import com.lingq.core.network.api.requests.RequestDictionariesAdd;
import com.lingq.core.network.api.requests.RequestDictionariesOrder;
import com.lingq.core.network.api.result.ResultDictionariesForUser;
import com.lingq.core.network.api.result.ResultDictionaryLocale;
import java.util.List;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public interface yf2 {
    @ay1("api/v2/{language}/user-dictionaries/{pk}/")
    /* JADX INFO: renamed from: a */
    Object m25109a(@e57("language") String str, @e57("pk") Integer num, Continuation<? super i88<xfa>> continuation);

    @pr3({"Cache-Control: no-cache"})
    @mj3("api/v2/{language}/user-dictionaries/")
    /* JADX INFO: renamed from: b */
    Object m25110b(@e57("language") String str, Continuation<? super ResultDictionariesForUser> continuation);

    @j17("api/v2/{language}/user-dictionaries/set_order/")
    /* JADX INFO: renamed from: c */
    Object m25111c(@e57("language") String str, @be0 RequestDictionariesOrder requestDictionariesOrder, Continuation<? super m88> continuation);

    @mj3("api/dictionary-locales/")
    /* JADX INFO: renamed from: d */
    Object m25112d(Continuation<? super List<ResultDictionaryLocale>> continuation);

    @j17("api/v2/{language}/user-dictionaries/")
    /* JADX INFO: renamed from: e */
    Object m25113e(@e57("language") String str, @be0 RequestDictionariesAdd requestDictionariesAdd, Continuation<? super m88> continuation);
}
