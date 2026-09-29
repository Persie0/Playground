package p000;

import androidx.compose.runtime.AbstractC0278f;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.database.entity.C1324a;
import com.lingq.core.database.entity.C1330d;
import com.lingq.core.database.entity.C1332e;
import com.lingq.core.database.entity.CardEntity;
import com.lingq.core.database.entity.ChatHistoryEntity;
import com.lingq.core.database.entity.ChatSentenceEntity;
import com.lingq.core.domain.model.challenge.C1396b;
import com.lingq.core.domain.model.challenge.ChallengeJoinedStats;
import com.lingq.core.domain.model.challenge.ChallengeStats$$serializer;
import com.lingq.core.domain.model.chat.C1400a;
import com.lingq.core.domain.model.chat.C1403d;
import com.lingq.core.domain.model.chat.C1405f;
import com.lingq.core.domain.model.chat.C1407h;
import com.lingq.core.domain.model.chat.ChatHistory;
import com.lingq.core.domain.model.chat.ChatMessage;
import com.lingq.core.domain.model.chat.ChatMessage$$serializer;
import com.lingq.core.domain.model.chat.ChatMessagePhrases;
import com.lingq.core.domain.model.chat.ChatPhrase;
import com.lingq.core.domain.model.chat.ChatPhrase$$serializer;
import com.lingq.core.domain.model.chat.ChatSentence;
import com.lingq.core.domain.model.lesson.LessonTextToken$$serializer;
import com.lingq.core.domain.model.offer.BannerType;
import com.lingq.core.domain.model.token.TokenMeaning$$serializer;
import com.lingq.core.network.api.result.C1635d;
import com.lingq.core.network.api.result.CardLessonTransliteration;

/* JADX INFO: renamed from: he */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3072he implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42231a;

    public /* synthetic */ C3072he(int i) {
        this.f42231a = i;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        switch (this.f42231a) {
            case 0:
                x17 x17Var = AbstractC3369ne.f52629a;
                return v52.f64880a;
            case 1:
                return new l7a(-3.4028235E38f, 0.0f, 0.0f);
            case 2:
                return BannerType._init_$_anonymous_();
            case 3:
                C1324a c1324a = CardEntity.Companion;
                return new C2978ev(TokenMeaning$$serializer.INSTANCE);
            case 4:
                C1324a c1324a2 = CardEntity.Companion;
                return new C2978ev(sk9.f60959a);
            case 5:
                C1324a c1324a3 = CardEntity.Companion;
                return new C2978ev(sk9.f60959a);
            case 6:
                C1324a c1324a4 = CardEntity.Companion;
                return new C2978ev(sk9.f60959a);
            case 7:
                C1635d c1635d = CardLessonTransliteration.Companion;
                return new C2978ev(sk9.f60959a);
            case 8:
                C1635d c1635d2 = CardLessonTransliteration.Companion;
                return new C2978ev(sk9.f60959a);
            case 9:
                C1635d c1635d3 = CardLessonTransliteration.Companion;
                return new C2978ev(sk9.f60959a);
            case 10:
                C1635d c1635d4 = CardLessonTransliteration.Companion;
                return new C2978ev(sk9.f60959a);
            case 11:
                C1635d c1635d5 = CardLessonTransliteration.Companion;
                return new C2978ev(sk9.f60959a);
            case 12:
                C1635d c1635d6 = CardLessonTransliteration.Companion;
                return new C2978ev(sk9.f60959a);
            case 13:
                C1635d c1635d7 = CardLessonTransliteration.Companion;
                return new C2978ev(thb.m22059r(a98.f384a));
            case 14:
                C1635d c1635d8 = CardLessonTransliteration.Companion;
                return new C2978ev(sk9.f60959a);
            case 15:
                C1396b c1396b = ChallengeJoinedStats.Companion;
                return new C2978ev(ChallengeStats$$serializer.INSTANCE);
            case 16:
                C1400a c1400a = ChatHistory.Companion;
                return new C2978ev(ChatMessage$$serializer.INSTANCE);
            case 17:
                C1330d c1330d = ChatHistoryEntity.Companion;
                return new C2978ev(ChatMessage$$serializer.INSTANCE);
            case 18:
                cs4[] cs4VarArr = ChatMessage.f18919j;
                return new C2978ev(ChatPhrase$$serializer.INSTANCE);
            case 19:
                C1403d c1403d = ChatMessagePhrases.Companion;
                return new C2978ev(ChatPhrase$$serializer.INSTANCE);
            case 20:
                C1405f c1405f = ChatPhrase.Companion;
                return new C2978ev(TokenMeaning$$serializer.INSTANCE);
            case 21:
                return AbstractC0278f.m1260j("");
            case 22:
                C1407h c1407h = ChatSentence.Companion;
                return new C2978ev(LessonTextToken$$serializer.INSTANCE);
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                C1407h c1407h2 = ChatSentence.Companion;
                return new C2978ev(l73.f49244a);
            case 24:
                C1332e c1332e = ChatSentenceEntity.Companion;
                return new C2978ev(LessonTextToken$$serializer.INSTANCE);
            case 25:
                C1332e c1332e2 = ChatSentenceEntity.Companion;
                return new C2978ev(l73.f49244a);
            case 26:
                return AbstractC0278f.m1260j(Boolean.FALSE);
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                return AbstractC0278f.m1257g(-1);
            case 28:
                return AbstractC0278f.m1260j("");
            default:
                return AbstractC0278f.m1260j(Boolean.FALSE);
        }
    }
}
