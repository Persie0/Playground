package p460wh;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.network.requests.RequestNotice;
import com.lingq.shared.network.result.ResultNotice;
import com.lingq.shared.network.result.Results;
import jp.C6553u;
import kotlin.Metadata;
import p250lp.InterfaceC7424a;
import p250lp.InterfaceC7429f;
import p250lp.InterfaceC7438o;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: wh.i */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m13365d2 = {"Lwh/i;", "", "Lcom/lingq/shared/network/result/Results;", "Lcom/lingq/shared/network/result/ResultNotice;", "a", "(Lwl/c;)Ljava/lang/Object;", "Lcom/lingq/shared/network/requests/RequestNotice;", "requestNotice", "Ljp/u;", "Lsl/e;", "b", "(Lcom/lingq/shared/network/requests/RequestNotice;Lwl/c;)Ljava/lang/Object;", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public interface InterfaceC9941i {
    @InterfaceC7429f("api/v2/notices")
    /* JADX INFO: renamed from: a */
    Object m18489a(InterfaceC9968c<? super Results<ResultNotice>> interfaceC9968c);

    @InterfaceC7438o("api/v2/notices/hide/")
    /* JADX INFO: renamed from: b */
    Object m18490b(@InterfaceC7424a RequestNotice requestNotice, InterfaceC9968c<? super C6553u<C9072e>> interfaceC9968c);
}
