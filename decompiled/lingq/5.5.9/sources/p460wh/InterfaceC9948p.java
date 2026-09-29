package p460wh;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.Meaning;
import com.lingq.entity.RelatedPhrase;
import com.lingq.entity.TranslationGoogle;
import com.lingq.shared.network.requests.RequestTranslate;
import java.util.List;
import kotlin.Metadata;
import p250lp.InterfaceC7424a;
import p250lp.InterfaceC7429f;
import p250lp.InterfaceC7438o;
import p250lp.InterfaceC7442s;
import p250lp.InterfaceC7443t;
import p464wl.InterfaceC9968c;

/* JADX INFO: renamed from: wh.p */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JI\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H§@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJI\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0016\u001a\u00020\u00152\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0013H§@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, m13365d2 = {"Lwh/p;", "", "", "language", "word", "fragment", "", "start", "", "Lcom/lingq/entity/RelatedPhrase;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lwl/c;)Ljava/lang/Object;", "term", "", "isAll", "locale", "Lcom/lingq/entity/Meaning;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lwl/c;)Ljava/lang/Object;", "Lcom/lingq/shared/network/requests/RequestTranslate;", "translateRequest", "Lcom/lingq/entity/TranslationGoogle;", "a", "(Ljava/lang/String;Lcom/lingq/shared/network/requests/RequestTranslate;Lwl/c;)Ljava/lang/Object;", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public interface InterfaceC9948p {
    @InterfaceC7438o("api/v2/{language}/translate/")
    /* JADX INFO: renamed from: a */
    Object m18524a(@InterfaceC7442s("language") String str, @InterfaceC7424a RequestTranslate requestTranslate, InterfaceC9968c<? super TranslationGoogle> interfaceC9968c);

    @InterfaceC7429f("api/v2/{language}/related-phrases/")
    /* JADX INFO: renamed from: b */
    Object m18525b(@InterfaceC7442s("language") String str, @InterfaceC7443t("word") String str2, @InterfaceC7443t("fragment") String str3, @InterfaceC7443t("start") Integer num, InterfaceC9968c<? super List<RelatedPhrase>> interfaceC9968c);

    @InterfaceC7429f("api/v2/{language}/hints/search/")
    /* JADX INFO: renamed from: c */
    Object m18526c(@InterfaceC7442s("language") String str, @InterfaceC7443t("term") String str2, @InterfaceC7443t("all") Boolean bool, @InterfaceC7443t("locale") String str3, InterfaceC9968c<? super List<Meaning>> interfaceC9968c);
}
