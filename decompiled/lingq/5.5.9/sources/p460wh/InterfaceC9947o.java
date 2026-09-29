package p460wh;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.network.result.ResultFastSearch;
import java.util.List;
import kotlin.Metadata;
import p250lp.InterfaceC7429f;
import p250lp.InterfaceC7442s;
import p250lp.InterfaceC7443t;
import p464wl.InterfaceC9968c;

/* JADX INFO: renamed from: wh.o */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JG\u0010\n\u001a\u00020\t2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H§@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m13365d2 = {"Lwh/o;", "", "", "language", "", "pageSize", "query", "", "suppressed", "Lcom/lingq/shared/network/result/ResultFastSearch;", "a", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lwl/c;)Ljava/lang/Object;", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public interface InterfaceC9947o {
    @InterfaceC7429f("api/v3/{language}/search/fast/")
    /* JADX INFO: renamed from: a */
    Object m18523a(@InterfaceC7442s("language") String str, @InterfaceC7443t("limit") Integer num, @InterfaceC7443t("q") String str2, @InterfaceC7443t("suppress") List<String> list, InterfaceC9968c<? super ResultFastSearch> interfaceC9968c);
}
