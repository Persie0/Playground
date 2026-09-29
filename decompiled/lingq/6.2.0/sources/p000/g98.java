package p000;

import androidx.compose.runtime.AbstractC0278f;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.network.api.result.C1620a5;
import com.lingq.core.network.api.result.C1647e4;
import com.lingq.core.network.api.result.C1665h4;
import com.lingq.core.network.api.result.C1683k4;
import com.lingq.core.network.api.result.C1689l4;
import com.lingq.core.network.api.result.C1695m4;
import com.lingq.core.network.api.result.C1700n3;
import com.lingq.core.network.api.result.C1712p3;
import com.lingq.core.network.api.result.C1718q3;
import com.lingq.core.network.api.result.C1742u3;
import com.lingq.core.network.api.result.C1781x3;
import com.lingq.core.network.api.result.C1782x4;
import com.lingq.core.network.api.result.C1788y4;
import com.lingq.core.network.api.result.C1794z4;
import com.lingq.core.network.api.result.ResultMeaning$$serializer;
import com.lingq.core.network.api.result.ResultNote$$serializer;
import com.lingq.core.network.api.result.ResultRegistrationError;
import com.lingq.core.network.api.result.ResultRelatedPhrase;
import com.lingq.core.network.api.result.ResultSentence;
import com.lingq.core.network.api.result.ResultSkritterExport;
import com.lingq.core.network.api.result.ResultSkritterVocab$$serializer;
import com.lingq.core.network.api.result.ResultStatsCalendar;
import com.lingq.core.network.api.result.ResultStatsCalendarDay$$serializer;
import com.lingq.core.network.api.result.ResultTextToken;
import com.lingq.core.network.api.result.ResultTextToken$$serializer;
import com.lingq.core.network.api.result.ResultTokenMeaning$$serializer;
import com.lingq.core.network.api.result.ResultTokenReadings;
import com.lingq.core.network.api.result.ResultTranslation$$serializer;
import com.lingq.core.network.api.result.ResultTranslationGoogle;
import com.lingq.core.network.api.result.ResultTranslationSentence;
import com.lingq.core.network.api.result.ResultTranslationSentenceV3;
import com.lingq.core.network.api.result.ResultTranslationSimple$$serializer;
import com.lingq.core.network.api.result.ResultTranslationV3$$serializer;
import com.lingq.core.network.api.result.ResultVocabularyCard;
import com.lingq.core.network.api.result.ResultVocabularyCourse;
import com.lingq.core.network.api.result.ResultWord;
import com.lingq.core.network.api.result.ResultWord$$serializer;
import com.lingq.core.network.api.result.ResultWords;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g98 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40424a;

    public /* synthetic */ g98(int i) {
        this.f40424a = i;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        switch (this.f40424a) {
            case 0:
                C1700n3 c1700n3 = ResultRegistrationError.Companion;
                return new C2978ev(sk9.f60959a);
            case 1:
                C1712p3 c1712p3 = ResultRelatedPhrase.Companion;
                return new C2978ev(ResultMeaning$$serializer.INSTANCE);
            case 2:
                C1718q3 c1718q3 = ResultSentence.Companion;
                return new C2978ev(ResultTextToken$$serializer.INSTANCE);
            case 3:
                C1718q3 c1718q4 = ResultSentence.Companion;
                return new C2978ev(thb.m22059r(l73.f49244a));
            case 4:
                C1742u3 c1742u3 = ResultSkritterExport.Companion;
                return new C2978ev(ResultSkritterVocab$$serializer.INSTANCE);
            case 5:
                C1781x3 c1781x3 = ResultStatsCalendar.Companion;
                return new C2978ev(ResultStatsCalendarDay$$serializer.INSTANCE);
            case 6:
                C1647e4 c1647e4 = ResultTextToken.Companion;
                sk9 sk9Var = sk9.f60959a;
                return new je5(sk9Var, sk9Var);
            case 7:
                C1665h4 c1665h4 = ResultTokenReadings.Companion;
                return new C2978ev(sk9.f60959a);
            case 8:
                C1665h4 c1665h5 = ResultTokenReadings.Companion;
                return new C2978ev(sk9.f60959a);
            case 9:
                C1665h4 c1665h6 = ResultTokenReadings.Companion;
                return new C2978ev(sk9.f60959a);
            case 10:
                C1665h4 c1665h7 = ResultTokenReadings.Companion;
                return new C2978ev(sk9.f60959a);
            case 11:
                C1665h4 c1665h8 = ResultTokenReadings.Companion;
                return new C2978ev(sk9.f60959a);
            case 12:
                C1665h4 c1665h9 = ResultTokenReadings.Companion;
                return new C2978ev(sk9.f60959a);
            case 13:
                C1683k4 c1683k4 = ResultTranslationGoogle.Companion;
                return new C2978ev(ResultTranslationSimple$$serializer.INSTANCE);
            case 14:
                C1689l4 c1689l4 = ResultTranslationSentence.Companion;
                return new C2978ev(thb.m22059r(dj2.f35711a));
            case 15:
                C1689l4 c1689l5 = ResultTranslationSentence.Companion;
                return new C2978ev(ResultTranslation$$serializer.INSTANCE);
            case 16:
                C1689l4 c1689l6 = ResultTranslationSentence.Companion;
                return new C2978ev(ResultNote$$serializer.INSTANCE);
            case 17:
                C1695m4 c1695m4 = ResultTranslationSentenceV3.Companion;
                return new C2978ev(thb.m22059r(dj2.f35711a));
            case 18:
                C1695m4 c1695m5 = ResultTranslationSentenceV3.Companion;
                return new C2978ev(thb.m22059r(ResultTranslationV3$$serializer.INSTANCE));
            case 19:
                C1782x4 c1782x4 = ResultVocabularyCard.Companion;
                return new C2978ev(ResultTokenMeaning$$serializer.INSTANCE);
            case 20:
                C1782x4 c1782x5 = ResultVocabularyCard.Companion;
                return new C2978ev(sk9.f60959a);
            case 21:
                C1782x4 c1782x6 = ResultVocabularyCard.Companion;
                return new C2978ev(sk9.f60959a);
            case 22:
                C1782x4 c1782x7 = ResultVocabularyCard.Companion;
                return new C2978ev(sk9.f60959a);
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                C1788y4 c1788y4 = ResultVocabularyCourse.Companion;
                return new C2978ev(sk9.f60959a);
            case 24:
                C1794z4 c1794z4 = ResultWord.Companion;
                return new C2978ev(thb.m22059r(ResultTokenMeaning$$serializer.INSTANCE));
            case 25:
                C1794z4 c1794z5 = ResultWord.Companion;
                return new C2978ev(sk9.f60959a);
            case 26:
                C1620a5 c1620a5 = ResultWords.Companion;
                return new C2978ev(ResultWord$$serializer.INSTANCE);
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                return AbstractC0278f.m1260j(Boolean.FALSE);
            case 28:
                return AbstractC0278f.m1257g(-1);
            default:
                return AbstractC0278f.m1260j("");
        }
    }
}
