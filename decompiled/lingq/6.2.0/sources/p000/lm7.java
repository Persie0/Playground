package p000;

import com.lingq.core.domain.model.user.Login;
import com.lingq.core.domain.model.user.Profile;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.domain.model.user.ProfileSettings;
import com.lingq.core.network.adapters.NetworkResponse;
import com.lingq.core.network.api.requests.RequestEmailLogin;
import com.lingq.core.network.api.requests.RequestMoreLingQs;
import com.lingq.core.network.api.requests.RequestPurchase;
import com.lingq.core.network.api.requests.RequestPushNotificationRegistration;
import com.lingq.core.network.api.requests.RequestUserUpdate;
import com.lingq.core.network.api.result.ResultProfileMessage;
import com.lingq.core.network.api.result.ResultRegistrationValidation;
import com.lingq.core.network.api.result.ResultSubscriptionDetails;
import com.lingq.core.network.api.result.Results;
import java.util.List;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public interface lm7 {
    @ay1("api/v2/profiles/{pk}/")
    /* JADX INFO: renamed from: a */
    Object m16366a(@e57("pk") int i, Continuation<? super NetworkResponse<xfa>> continuation);

    @j17("api/v2/facebook/signup/")
    @kc3
    /* JADX INFO: renamed from: b */
    Object m16367b(@b33("access_token") String str, @b33("dictionary_locale") String str2, Continuation<? super NetworkResponse<Login>> continuation);

    @g17("api/v2/profiles/{pk}/")
    /* JADX INFO: renamed from: c */
    Object m16368c(@e57("pk") Integer num, @be0 RequestUserUpdate requestUserUpdate, Continuation<? super NetworkResponse<Profile>> continuation);

    @j17("api/v2/api-token-auth/")
    @kc3
    /* JADX INFO: renamed from: d */
    Object m16369d(@b33("auth_code") String str, Continuation<? super NetworkResponse<Login>> continuation);

    @mj3("en/accounts/validate-field")
    /* JADX INFO: renamed from: e */
    Object m16370e(@sp7("username") String str, @sp7("email") String str2, Continuation<? super NetworkResponse<ResultRegistrationValidation>> continuation);

    @mj3("api/v2/subscription")
    /* JADX INFO: renamed from: f */
    Object m16371f(Continuation<? super NetworkResponse<ResultSubscriptionDetails>> continuation);

    @mj3("api/v2/profiles/{pk}/jsonbox/")
    /* JADX INFO: renamed from: g */
    Object m16372g(@e57("pk") Integer num, Continuation<? super NetworkResponse<ProfileSettings>> continuation);

    @mj3("api/v3/profiles/messages/?contextual=true")
    /* JADX INFO: renamed from: h */
    Object m16373h(Continuation<? super NetworkResponse<? extends List<ResultProfileMessage>>> continuation);

    @mj3("api/v3/profiles/{pk}")
    /* JADX INFO: renamed from: i */
    Object m16374i(@e57("pk") Integer num, Continuation<? super NetworkResponse<Profile>> continuation);

    @j17("api/recover-password/")
    @kc3
    /* JADX INFO: renamed from: j */
    Object m16375j(@b33("email") String str, Continuation<? super NetworkResponse<xfa>> continuation);

    @j17("api/v2/api-token-auth/")
    @kc3
    /* JADX INFO: renamed from: k */
    Object m16376k(@b33("username") String str, @b33("password") String str2, Continuation<? super NetworkResponse<Login>> continuation);

    @g17("api/v2/profiles/{pk}/jsonbox/")
    /* JADX INFO: renamed from: l */
    Object m16377l(@e57("pk") Integer num, @be0 ProfileSettings profileSettings, Continuation<? super NetworkResponse<xfa>> continuation);

    @j17("api/v2/google/signup/")
    @kc3
    /* JADX INFO: renamed from: m */
    Object m16378m(@b33("code") String str, @b33("native_language") String str2, @b33("dictionary_locale") String str3, @b33("language") String str4, @b33("level") Integer num, Continuation<? super NetworkResponse<Login>> continuation);

    @mj3("api/v3/profiles/")
    /* JADX INFO: renamed from: n */
    Object m16379n(Continuation<? super NetworkResponse<Results<Profile>>> continuation);

    @j17("api/v2/api-email-auth/")
    /* JADX INFO: renamed from: o */
    Object m16380o(@be0 RequestEmailLogin requestEmailLogin, Continuation<? super NetworkResponse<xfa>> continuation);

    @j17("api/signup/?device=android")
    @kc3
    /* JADX INFO: renamed from: p */
    Object m16381p(@b33("username") String str, @b33("email") String str2, @b33("password") String str3, @b33("first_name") String str4, @b33("country") String str5, @b33("province") String str6, @b33("level") Integer num, @b33("native_language") String str7, @b33("dictionary_locale") String str8, @b33("language") String str9, @b33("coupon") String str10, @b33("accent") String str11, Continuation<? super NetworkResponse<xfa>> continuation);

    @j17("api/v2/facebook/signup/")
    @kc3
    /* JADX INFO: renamed from: q */
    Object m16382q(@b33("access_token") String str, @b33("native_language") String str2, @b33("dictionary_locale") String str3, @b33("language") String str4, @b33("level") Integer num, Continuation<? super NetworkResponse<Login>> continuation);

    @j17("api/v2/profiles/{pk}/free-cards/")
    /* JADX INFO: renamed from: r */
    Object m16383r(@e57("pk") Integer num, @be0 RequestMoreLingQs requestMoreLingQs, Continuation<? super NetworkResponse<xfa>> continuation);

    @mj3("api/v2/profiles/{pk}/account/")
    /* JADX INFO: renamed from: s */
    Object m16384s(@e57("pk") Integer num, Continuation<? super NetworkResponse<ProfileAccount>> continuation);

    @j17("api/v2/google/signup/")
    @kc3
    /* JADX INFO: renamed from: t */
    Object m16385t(@b33("code") String str, Continuation<? super NetworkResponse<Login>> continuation);

    @j17("api/v2/android/purchase/")
    /* JADX INFO: renamed from: u */
    Object m16386u(@be0 RequestPurchase requestPurchase, Continuation<? super NetworkResponse<xfa>> continuation);

    @j17("api/v2/android-devices/")
    /* JADX INFO: renamed from: v */
    Object m16387v(@be0 RequestPushNotificationRegistration requestPushNotificationRegistration, Continuation<? super NetworkResponse<xfa>> continuation);
}
