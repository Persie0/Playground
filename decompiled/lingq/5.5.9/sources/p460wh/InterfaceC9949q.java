package p460wh;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.TtsVoice;
import com.lingq.shared.network.result.ResultTtsUtterance;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import p250lp.InterfaceC7426c;
import p250lp.InterfaceC7428e;
import p250lp.InterfaceC7429f;
import p250lp.InterfaceC7438o;
import p250lp.InterfaceC7443t;
import p464wl.InterfaceC9968c;

/* JADX INFO: renamed from: wh.q */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J%\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007JG\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ;\u0010\u0010\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m13365d2 = {"Lwh/q;", "", "", "language", "", "Lcom/lingq/entity/TtsVoice;", "a", "(Ljava/lang/String;Lwl/c;)Ljava/lang/Object;", "appName", "voice", "", "texts", "Lcom/lingq/shared/network/result/ResultTtsUtterance;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lwl/c;)Ljava/lang/Object;", "text", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lwl/c;)Ljava/lang/Object;", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public interface InterfaceC9949q {
    @InterfaceC7429f("api/v2/tts/supported-voices")
    /* JADX INFO: renamed from: a */
    Object m18527a(@InterfaceC7443t("language") String str, InterfaceC9968c<? super List<TtsVoice>> interfaceC9968c);

    @InterfaceC7429f("api/v2/tts/")
    /* JADX INFO: renamed from: b */
    Object m18528b(@InterfaceC7443t("language") String str, @InterfaceC7443t("text") String str2, @InterfaceC7443t("app_name") String str3, @InterfaceC7443t("voice") String str4, InterfaceC9968c<? super ResultTtsUtterance> interfaceC9968c);

    @InterfaceC7428e
    @InterfaceC7438o("api/v2/tts/batch/")
    /* JADX INFO: renamed from: c */
    Object m18529c(@InterfaceC7426c("language") String str, @InterfaceC7426c("app_name") String str2, @InterfaceC7426c("voice") String str3, @InterfaceC7426c("text") Set<String> set, InterfaceC9968c<? super List<ResultTtsUtterance>> interfaceC9968c);
}
