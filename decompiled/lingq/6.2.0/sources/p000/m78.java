package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.user.ProfileSetting;
import com.lingq.core.domain.model.user.ProfileSetting$$serializer;
import com.lingq.core.network.api.requests.C1563c1;
import com.lingq.core.network.api.requests.C1566d1;
import com.lingq.core.network.api.requests.C1572f1;
import com.lingq.core.network.api.requests.C1599s0;
import com.lingq.core.network.api.requests.C1607w0;
import com.lingq.core.network.api.requests.C1611y0;
import com.lingq.core.network.api.requests.RequestNote$$serializer;
import com.lingq.core.network.api.requests.RequestOnboardingSurveyItem$$serializer;
import com.lingq.core.network.api.requests.RequestQuery;
import com.lingq.core.network.api.requests.RequestSeedOnboarding;
import com.lingq.core.network.api.requests.RequestTopics;
import com.lingq.core.network.api.requests.RequestTranslation$$serializer;
import com.lingq.core.network.api.requests.RequestTranslationSentence;
import com.lingq.core.network.api.requests.RequestUserUpdate;
import com.lingq.core.network.api.requests.RequestWordsUpdate;
import com.lingq.core.network.api.result.C1679k0;
import com.lingq.core.network.api.result.C1685l0;
import com.lingq.core.network.api.result.C1697n0;
import com.lingq.core.network.api.result.C1721r0;
import com.lingq.core.network.api.result.C1733t0;
import com.lingq.core.network.api.result.C1744v;
import com.lingq.core.network.api.result.C1750w;
import com.lingq.core.network.api.result.C1783y;
import com.lingq.core.network.api.result.C1789z;
import com.lingq.core.network.api.result.ResultCard;
import com.lingq.core.network.api.result.ResultCard$$serializer;
import com.lingq.core.network.api.result.ResultCardChat;
import com.lingq.core.network.api.result.ResultCardChat$$serializer;
import com.lingq.core.network.api.result.ResultCards;
import com.lingq.core.network.api.result.ResultCardsChat;
import com.lingq.core.network.api.result.ResultChatHistory;
import com.lingq.core.network.api.result.ResultChatHistorySimple;
import com.lingq.core.network.api.result.ResultChatMessage;
import com.lingq.core.network.api.result.ResultChatMessage$$serializer;
import com.lingq.core.network.api.result.ResultChatPhrase;
import com.lingq.core.network.api.result.ResultChatPhrase$$serializer;
import com.lingq.core.network.api.result.ResultChatSentence;
import com.lingq.core.network.api.result.ResultMeaning$$serializer;
import com.lingq.core.network.api.result.ResultTextToken$$serializer;
import com.lingq.core.network.api.result.ResultTokenMeaning$$serializer;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m78 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50735a;

    public /* synthetic */ m78(int i) {
        this.f50735a = i;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        switch (this.f50735a) {
            case 0:
                C1599s0 c1599s0 = RequestQuery.Companion;
                return new ke5(sk9.f60959a);
            case 1:
                C1599s0 c1599s1 = RequestQuery.Companion;
                return new ke5(sk9.f60959a);
            case 2:
                C1599s0 c1599s2 = RequestQuery.Companion;
                return new ke5(l84.f49294a);
            case 3:
                C1599s0 c1599s3 = RequestQuery.Companion;
                return new C2978ev(sk9.f60959a);
            case 4:
                C1599s0 c1599s4 = RequestQuery.Companion;
                return new C2978ev(sk9.f60959a);
            case 5:
                C1607w0 c1607w0 = RequestSeedOnboarding.Companion;
                return new C2978ev(RequestOnboardingSurveyItem$$serializer.INSTANCE);
            case 6:
                C1611y0 c1611y0 = RequestTopics.Companion;
                return new C2978ev(thb.m22059r(sk9.f60959a));
            case 7:
                C1563c1 c1563c1 = RequestTranslationSentence.Companion;
                return new C2978ev(thb.m22059r(dj2.f35711a));
            case 8:
                C1563c1 c1563c2 = RequestTranslationSentence.Companion;
                return new C2978ev(RequestTranslation$$serializer.INSTANCE);
            case 9:
                C1563c1 c1563c3 = RequestTranslationSentence.Companion;
                return new C2978ev(RequestNote$$serializer.INSTANCE);
            case 10:
                C1566d1 c1566d1 = RequestUserUpdate.Companion;
                return new C2978ev(sk9.f60959a);
            case 11:
                C1566d1 c1566d2 = RequestUserUpdate.Companion;
                return new am1(y38.m24933a(ProfileSetting.class), thb.m22059r(ProfileSetting$$serializer.INSTANCE), new KSerializer[0]);
            case 12:
                C1572f1 c1572f1 = RequestWordsUpdate.Companion;
                return new C2978ev(l84.f49294a);
            case 13:
                C1744v c1744v = ResultCard.Companion;
                return new C2978ev(ResultTokenMeaning$$serializer.INSTANCE);
            case 14:
                C1744v c1744v2 = ResultCard.Companion;
                return new C2978ev(sk9.f60959a);
            case 15:
                C1744v c1744v3 = ResultCard.Companion;
                return new C2978ev(sk9.f60959a);
            case 16:
                C1744v c1744v4 = ResultCard.Companion;
                return new C2978ev(sk9.f60959a);
            case 17:
                C1750w c1750w = ResultCardChat.Companion;
                return new C2978ev(ResultTokenMeaning$$serializer.INSTANCE);
            case 18:
                C1750w c1750w2 = ResultCardChat.Companion;
                return new C2978ev(sk9.f60959a);
            case 19:
                C1750w c1750w3 = ResultCardChat.Companion;
                return new C2978ev(sk9.f60959a);
            case 20:
                C1750w c1750w4 = ResultCardChat.Companion;
                return new C2978ev(sk9.f60959a);
            case 21:
                C1783y c1783y = ResultCards.Companion;
                return new C2978ev(ResultCard$$serializer.INSTANCE);
            case 22:
                C1789z c1789z = ResultCardsChat.Companion;
                return new C2978ev(ResultCardChat$$serializer.INSTANCE);
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                C1679k0 c1679k0 = ResultChatHistory.Companion;
                return new C2978ev(ResultChatMessage$$serializer.INSTANCE);
            case 24:
                C1685l0 c1685l0 = ResultChatHistorySimple.Companion;
                return new C2978ev(ResultChatMessage$$serializer.INSTANCE);
            case 25:
                C1697n0 c1697n0 = ResultChatMessage.Companion;
                return new C2978ev(ResultChatPhrase$$serializer.INSTANCE);
            case 26:
                C1697n0 c1697n1 = ResultChatMessage.Companion;
                return new C2978ev(w88.f66527a);
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                C1721r0 c1721r0 = ResultChatPhrase.Companion;
                return new C2978ev(ResultMeaning$$serializer.INSTANCE);
            case 28:
                C1733t0 c1733t0 = ResultChatSentence.Companion;
                return new C2978ev(ResultTextToken$$serializer.INSTANCE);
            default:
                C1733t0 c1733t1 = ResultChatSentence.Companion;
                return new C2978ev(thb.m22059r(l73.f49244a));
        }
    }
}
