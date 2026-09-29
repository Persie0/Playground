package p460wh;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.network.requests.RequestReport;
import kotlin.Metadata;
import p250lp.InterfaceC7424a;
import p250lp.InterfaceC7438o;
import p250lp.InterfaceC7442s;
import p464wl.InterfaceC9968c;
import so.AbstractC9107y;

/* JADX INFO: renamed from: wh.n */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J5\u0010\t\u001a\u00020\b2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ5\u0010\f\u001a\u00020\b2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, m13365d2 = {"Lwh/n;", "", "", "language", "", "collectionId", "Lcom/lingq/shared/network/requests/RequestReport;", "requestReport", "Lso/y;", "b", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/lingq/shared/network/requests/RequestReport;Lwl/c;)Ljava/lang/Object;", "lessonId", "a", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public interface InterfaceC9946n {
    @InterfaceC7438o("api/v3/{language}/lessons/{lessonId}/flags/")
    /* JADX INFO: renamed from: a */
    Object m18521a(@InterfaceC7442s("language") String str, @InterfaceC7442s("lessonId") Integer num, @InterfaceC7424a RequestReport requestReport, InterfaceC9968c<? super AbstractC9107y> interfaceC9968c);

    @InterfaceC7438o("api/v3/{language}/collections/{collectionId}/flags/")
    /* JADX INFO: renamed from: b */
    Object m18522b(@InterfaceC7442s("language") String str, @InterfaceC7442s("collectionId") Integer num, @InterfaceC7424a RequestReport requestReport, InterfaceC9968c<? super AbstractC9107y> interfaceC9968c);
}
