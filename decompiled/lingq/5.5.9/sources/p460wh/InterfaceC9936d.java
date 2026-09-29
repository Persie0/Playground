package p460wh;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.DictionaryLocale;
import com.lingq.shared.network.requests.RequestDictionariesAdd;
import com.lingq.shared.network.requests.RequestDictionariesOrder;
import com.lingq.shared.network.result.ResultDictionariesForUser;
import java.util.List;
import jp.C6553u;
import kotlin.Metadata;
import p250lp.InterfaceC7424a;
import p250lp.InterfaceC7425b;
import p250lp.InterfaceC7429f;
import p250lp.InterfaceC7438o;
import p250lp.InterfaceC7442s;
import p464wl.InterfaceC9968c;
import sl.C9072e;
import so.AbstractC9107y;

/* JADX INFO: renamed from: wh.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000e\u001a\u00020\r2\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000bH§@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0012\u001a\u00020\r2\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010H§@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0014H§@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, m13365d2 = {"Lwh/d;", "", "", "Lcom/lingq/entity/DictionaryLocale;", "d", "(Lwl/c;)Ljava/lang/Object;", "", "language", "Lcom/lingq/shared/network/result/ResultDictionariesForUser;", "b", "(Ljava/lang/String;Lwl/c;)Ljava/lang/Object;", "Lcom/lingq/shared/network/requests/RequestDictionariesOrder;", "order", "Lso/y;", "e", "(Ljava/lang/String;Lcom/lingq/shared/network/requests/RequestDictionariesOrder;Lwl/c;)Ljava/lang/Object;", "Lcom/lingq/shared/network/requests/RequestDictionariesAdd;", "id", "c", "(Ljava/lang/String;Lcom/lingq/shared/network/requests/RequestDictionariesAdd;Lwl/c;)Ljava/lang/Object;", "", "Ljp/u;", "Lsl/e;", "a", "(Ljava/lang/String;Ljava/lang/Integer;Lwl/c;)Ljava/lang/Object;", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public interface InterfaceC9936d {
    @InterfaceC7425b("api/v2/{language}/user-dictionaries/{pk}/")
    /* JADX INFO: renamed from: a */
    Object m18437a(@InterfaceC7442s("language") String str, @InterfaceC7442s("pk") Integer num, InterfaceC9968c<? super C6553u<C9072e>> interfaceC9968c);

    @InterfaceC7429f("api/v2/{language}/user-dictionaries/")
    /* JADX INFO: renamed from: b */
    Object m18438b(@InterfaceC7442s("language") String str, InterfaceC9968c<? super ResultDictionariesForUser> interfaceC9968c);

    @InterfaceC7438o("api/v2/{language}/user-dictionaries/")
    /* JADX INFO: renamed from: c */
    Object m18439c(@InterfaceC7442s("language") String str, @InterfaceC7424a RequestDictionariesAdd requestDictionariesAdd, InterfaceC9968c<? super AbstractC9107y> interfaceC9968c);

    @InterfaceC7429f("api/dictionary-locales/")
    /* JADX INFO: renamed from: d */
    Object m18440d(InterfaceC9968c<? super List<DictionaryLocale>> interfaceC9968c);

    @InterfaceC7438o("api/v2/{language}/user-dictionaries/set_order/")
    /* JADX INFO: renamed from: e */
    Object m18441e(@InterfaceC7442s("language") String str, @InterfaceC7424a RequestDictionariesOrder requestDictionariesOrder, InterfaceC9968c<? super AbstractC9107y> interfaceC9968c);
}
