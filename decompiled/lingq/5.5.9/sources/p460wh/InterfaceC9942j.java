package p460wh;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.network.requests.RequestNotification;
import com.lingq.shared.network.result.ResultNotifications;
import jp.C6553u;
import kotlin.Metadata;
import p250lp.InterfaceC7424a;
import p250lp.InterfaceC7429f;
import p250lp.InterfaceC7438o;
import p250lp.InterfaceC7442s;
import p250lp.InterfaceC7443t;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: wh.j */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J7\u0010\b\u001a\u00020\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH§@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m13365d2 = {"Lwh/j;", "", "", "language", "", "page", "pageSize", "Lcom/lingq/shared/network/result/ResultNotifications;", "a", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lwl/c;)Ljava/lang/Object;", "Lcom/lingq/shared/network/requests/RequestNotification;", "requestNotification", "Ljp/u;", "Lsl/e;", "b", "(Ljava/lang/String;Lcom/lingq/shared/network/requests/RequestNotification;Lwl/c;)Ljava/lang/Object;", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public interface InterfaceC9942j {
    @InterfaceC7429f("api/v2/{language}/timeline-events/simple/")
    /* JADX INFO: renamed from: a */
    Object m18491a(@InterfaceC7442s("language") String str, @InterfaceC7443t("page") Integer num, @InterfaceC7443t("page_size") Integer num2, InterfaceC9968c<? super ResultNotifications> interfaceC9968c);

    @InterfaceC7438o("api/v2/{language}/timeline-events/mark_viewed/")
    /* JADX INFO: renamed from: b */
    Object m18492b(@InterfaceC7442s("language") String str, @InterfaceC7424a RequestNotification requestNotification, InterfaceC9968c<? super C6553u<C9072e>> interfaceC9968c);
}
