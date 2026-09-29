package p460wh;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Login;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.network.requests.RequestEmailLogin;
import com.lingq.shared.network.requests.RequestMoreLingQs;
import com.lingq.shared.network.requests.RequestPurchase;
import com.lingq.shared.network.requests.RequestPushNotificationRegistration;
import com.lingq.shared.network.requests.RequestUserUpdate;
import com.lingq.shared.network.result.ResultRegistrationValidation;
import com.lingq.shared.network.result.Results;
import jp.C6553u;
import kotlin.Metadata;
import p250lp.InterfaceC7424a;
import p250lp.InterfaceC7426c;
import p250lp.InterfaceC7428e;
import p250lp.InterfaceC7429f;
import p250lp.InterfaceC7437n;
import p250lp.InterfaceC7438o;
import p250lp.InterfaceC7442s;
import p250lp.InterfaceC7443t;
import p464wl.InterfaceC9968c;
import sl.C9072e;
import so.AbstractC9107y;

/* JADX INFO: renamed from: wh.l */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\b\u001a\u00020\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H§@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\n2\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H§@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\tJ+\u0010\u000e\u001a\u00020\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\fH§@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u008d\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00102\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00102\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00102\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00102\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00102\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u00102\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0010H§@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010!\u001a\u00020 2\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u00102\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00102\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u0010H§@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J7\u0010$\u001a\u00020 2\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u00102\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00102\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u0010H§@ø\u0001\u0000¢\u0006\u0004\b$\u0010\"J+\u0010&\u001a\u00020%2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0010H§@ø\u0001\u0000¢\u0006\u0004\b&\u0010'J-\u0010(\u001a\u0004\u0018\u00010 2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0010H§@ø\u0001\u0000¢\u0006\u0004\b(\u0010'J!\u0010*\u001a\u0004\u0018\u00010 2\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\u0010H§@ø\u0001\u0000¢\u0006\u0004\b*\u0010+J#\u00100\u001a\b\u0012\u0004\u0012\u00020/0.2\b\b\u0001\u0010-\u001a\u00020,H§@ø\u0001\u0000¢\u0006\u0004\b0\u00101J!\u00102\u001a\u0004\u0018\u00010 2\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0010H§@ø\u0001\u0000¢\u0006\u0004\b2\u0010+J!\u00103\u001a\u0004\u0018\u00010 2\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u0010H§@ø\u0001\u0000¢\u0006\u0004\b3\u0010+J%\u00104\u001a\b\u0012\u0004\u0012\u00020/0.2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0010H§@ø\u0001\u0000¢\u0006\u0004\b4\u0010+J!\u00107\u001a\u0004\u0018\u00010\u001b2\n\b\u0001\u00106\u001a\u0004\u0018\u000105H§@ø\u0001\u0000¢\u0006\u0004\b7\u00108J\u001f\u0010;\u001a\u00020\u001b2\n\b\u0001\u0010:\u001a\u0004\u0018\u000109H§@ø\u0001\u0000¢\u0006\u0004\b;\u0010<J-\u0010?\u001a\u0004\u0018\u00010\u001b2\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010>\u001a\u0004\u0018\u00010=H§@ø\u0001\u0000¢\u0006\u0004\b?\u0010@\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006A"}, m13365d2 = {"Lwh/l;", "", "Lcom/lingq/shared/network/result/Results;", "Lcom/lingq/shared/domain/Profile;", "p", "(Lwl/c;)Ljava/lang/Object;", "", "profileIdentifier", "m", "(Ljava/lang/Integer;Lwl/c;)Ljava/lang/Object;", "Lcom/lingq/shared/domain/ProfileAccount;", "q", "Lcom/lingq/shared/network/requests/RequestUserUpdate;", "userUpdate", "l", "(Ljava/lang/Integer;Lcom/lingq/shared/network/requests/RequestUserUpdate;Lwl/c;)Ljava/lang/Object;", "", "username", "email", "password", "name", "country", "province", "level", "nativeLanguage", "languageToLearn", "coupon", "Lso/y;", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lwl/c;)Ljava/lang/Object;", "code", "language", "Lcom/lingq/shared/domain/Login;", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lwl/c;)Ljava/lang/Object;", "accessToken", "b", "Lcom/lingq/shared/network/result/ResultRegistrationValidation;", "k", "(Ljava/lang/String;Ljava/lang/String;Lwl/c;)Ljava/lang/Object;", "c", "authCode", "h", "(Ljava/lang/String;Lwl/c;)Ljava/lang/Object;", "Lcom/lingq/shared/network/requests/RequestEmailLogin;", "requestEmailLogin", "Ljp/u;", "Lsl/e;", "n", "(Lcom/lingq/shared/network/requests/RequestEmailLogin;Lwl/c;)Ljava/lang/Object;", "f", "a", "o", "Lcom/lingq/shared/network/requests/RequestPurchase;", "requestPurchase", "d", "(Lcom/lingq/shared/network/requests/RequestPurchase;Lwl/c;)Ljava/lang/Object;", "Lcom/lingq/shared/network/requests/RequestPushNotificationRegistration;", "requestPushNotificationRegistration", "j", "(Lcom/lingq/shared/network/requests/RequestPushNotificationRegistration;Lwl/c;)Ljava/lang/Object;", "Lcom/lingq/shared/network/requests/RequestMoreLingQs;", "requestMoreLingQs", "i", "(Ljava/lang/Integer;Lcom/lingq/shared/network/requests/RequestMoreLingQs;Lwl/c;)Ljava/lang/Object;", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public interface InterfaceC9944l {
    @InterfaceC7428e
    @InterfaceC7438o("api/v2/facebook/signup/")
    /* JADX INFO: renamed from: a */
    Object m18502a(@InterfaceC7426c("access_token") String str, InterfaceC9968c<? super Login> interfaceC9968c);

    @InterfaceC7428e
    @InterfaceC7438o("api/v2/facebook/signup/")
    /* JADX INFO: renamed from: b */
    Object m18503b(@InterfaceC7426c("access_token") String str, @InterfaceC7426c("native_language") String str2, @InterfaceC7426c("language") String str3, InterfaceC9968c<? super Login> interfaceC9968c);

    @InterfaceC7428e
    @InterfaceC7438o("api/v2/api-token-auth/")
    /* JADX INFO: renamed from: c */
    Object m18504c(@InterfaceC7426c("username") String str, @InterfaceC7426c("password") String str2, InterfaceC9968c<? super Login> interfaceC9968c);

    @InterfaceC7438o("api/v2/android/purchase/")
    /* JADX INFO: renamed from: d */
    Object m18505d(@InterfaceC7424a RequestPurchase requestPurchase, InterfaceC9968c<? super AbstractC9107y> interfaceC9968c);

    @InterfaceC7428e
    @InterfaceC7438o("api/signup/?device=android")
    /* JADX INFO: renamed from: e */
    Object m18506e(@InterfaceC7426c("username") String str, @InterfaceC7426c("email") String str2, @InterfaceC7426c("password") String str3, @InterfaceC7426c("first_name") String str4, @InterfaceC7426c("country") String str5, @InterfaceC7426c("province") String str6, @InterfaceC7426c("level") Integer num, @InterfaceC7426c("native_language") String str7, @InterfaceC7426c("language") String str8, @InterfaceC7426c("coupon") String str9, InterfaceC9968c<? super AbstractC9107y> interfaceC9968c);

    @InterfaceC7428e
    @InterfaceC7438o("api/v2/google/signup/")
    /* JADX INFO: renamed from: f */
    Object m18507f(@InterfaceC7426c("code") String str, InterfaceC9968c<? super Login> interfaceC9968c);

    @InterfaceC7428e
    @InterfaceC7438o("api/v2/google/signup/")
    /* JADX INFO: renamed from: g */
    Object m18508g(@InterfaceC7426c("code") String str, @InterfaceC7426c("native_language") String str2, @InterfaceC7426c("language") String str3, InterfaceC9968c<? super Login> interfaceC9968c);

    @InterfaceC7428e
    @InterfaceC7438o("api/v2/api-token-auth/")
    /* JADX INFO: renamed from: h */
    Object m18509h(@InterfaceC7426c("auth_code") String str, InterfaceC9968c<? super Login> interfaceC9968c);

    @InterfaceC7438o("api/v2/profiles/{pk}/free-cards/")
    /* JADX INFO: renamed from: i */
    Object m18510i(@InterfaceC7442s("pk") Integer num, @InterfaceC7424a RequestMoreLingQs requestMoreLingQs, InterfaceC9968c<? super AbstractC9107y> interfaceC9968c);

    @InterfaceC7438o("api/v2/android-devices/")
    /* JADX INFO: renamed from: j */
    Object m18511j(@InterfaceC7424a RequestPushNotificationRegistration requestPushNotificationRegistration, InterfaceC9968c<? super AbstractC9107y> interfaceC9968c);

    @InterfaceC7429f("en/accounts/validate-field")
    /* JADX INFO: renamed from: k */
    Object m18512k(@InterfaceC7443t("username") String str, @InterfaceC7443t("email") String str2, InterfaceC9968c<? super ResultRegistrationValidation> interfaceC9968c);

    @InterfaceC7437n("api/v2/profiles/{pk}/")
    /* JADX INFO: renamed from: l */
    Object m18513l(@InterfaceC7442s("pk") Integer num, @InterfaceC7424a RequestUserUpdate requestUserUpdate, InterfaceC9968c<? super Profile> interfaceC9968c);

    @InterfaceC7429f("api/v2/profiles/{pk}")
    /* JADX INFO: renamed from: m */
    Object m18514m(@InterfaceC7442s("pk") Integer num, InterfaceC9968c<? super Profile> interfaceC9968c);

    @InterfaceC7438o("api/v2/api-email-auth/")
    /* JADX INFO: renamed from: n */
    Object m18515n(@InterfaceC7424a RequestEmailLogin requestEmailLogin, InterfaceC9968c<? super C6553u<C9072e>> interfaceC9968c);

    @InterfaceC7428e
    @InterfaceC7438o("api/recover-password/")
    /* JADX INFO: renamed from: o */
    Object m18516o(@InterfaceC7426c("email") String str, InterfaceC9968c<? super C6553u<C9072e>> interfaceC9968c);

    @InterfaceC7429f("api/v2/profiles/")
    /* JADX INFO: renamed from: p */
    Object m18517p(InterfaceC9968c<? super Results<Profile>> interfaceC9968c);

    @InterfaceC7429f("api/v2/profiles/{pk}/account/")
    /* JADX INFO: renamed from: q */
    Object m18518q(@InterfaceC7442s("pk") Integer num, InterfaceC9968c<? super ProfileAccount> interfaceC9968c);
}
