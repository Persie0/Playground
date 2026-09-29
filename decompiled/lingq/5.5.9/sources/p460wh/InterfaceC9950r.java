package p460wh;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.network.requests.RequestWordsUpdate;
import kotlin.Metadata;
import p250lp.InterfaceC7424a;
import p250lp.InterfaceC7438o;
import p250lp.InterfaceC7442s;
import p464wl.InterfaceC9968c;
import so.AbstractC9107y;

/* JADX INFO: renamed from: wh.r */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J+\u0010\u0007\u001a\u00020\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\n\u001a\u00020\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, m13365d2 = {"Lwh/r;", "", "", "language", "Lcom/lingq/shared/network/requests/RequestWordsUpdate;", "tempWord", "Lso/y;", "b", "(Ljava/lang/String;Lcom/lingq/shared/network/requests/RequestWordsUpdate;Lwl/c;)Ljava/lang/Object;", "requestWord", "a", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public interface InterfaceC9950r {
    @InterfaceC7438o("api/v2/{language}/ignored-words/")
    /* JADX INFO: renamed from: a */
    Object m18530a(@InterfaceC7442s("language") String str, @InterfaceC7424a RequestWordsUpdate requestWordsUpdate, InterfaceC9968c<? super AbstractC9107y> interfaceC9968c);

    @InterfaceC7438o("api/v2/{language}/known-words/")
    /* JADX INFO: renamed from: b */
    Object m18531b(@InterfaceC7442s("language") String str, @InterfaceC7424a RequestWordsUpdate requestWordsUpdate, InterfaceC9968c<? super AbstractC9107y> interfaceC9968c);
}
