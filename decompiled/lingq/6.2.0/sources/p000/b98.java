package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.database.entity.C1351n0;
import com.lingq.core.database.entity.StudyStatsEntity;
import com.lingq.core.domain.model.language.StudyStatsScores$$serializer;
import com.lingq.core.domain.model.token.TextToSpeechAppVoice$$serializer;
import com.lingq.core.domain.model.user.AndroidDetails;
import com.lingq.core.domain.model.user.AndroidDetails$$serializer;
import com.lingq.core.domain.model.user.AppleDetails;
import com.lingq.core.domain.model.user.AppleDetails$$serializer;
import com.lingq.core.domain.model.user.FreeTrialDetails;
import com.lingq.core.domain.model.user.FreeTrialDetails$$serializer;
import com.lingq.core.domain.model.user.Invoice;
import com.lingq.core.domain.model.user.Invoice$$serializer;
import com.lingq.core.domain.model.user.Tier;
import com.lingq.core.domain.model.user.Tier$$serializer;
import com.lingq.core.domain.model.vocabulary.C1514a;
import com.lingq.core.domain.model.vocabulary.VocabularySearch;
import com.lingq.core.domain.model.vocabulary.VocabularySearchQuery;
import com.lingq.core.domain.model.vocabulary.VocabularySort;
import com.lingq.core.network.api.result.C1619a4;
import com.lingq.core.network.api.result.C1633c4;
import com.lingq.core.network.api.result.C1730s3;
import com.lingq.core.network.api.result.C1743u4;
import com.lingq.core.network.api.result.C1792z2;
import com.lingq.core.network.api.result.ResultLibraryTab$$serializer;
import com.lingq.core.network.api.result.ResultOffer;
import com.lingq.core.network.api.result.ResultOfferBanner$$serializer;
import com.lingq.core.network.api.result.ResultShelf;
import com.lingq.core.network.api.result.ResultStudyStats;
import com.lingq.core.network.api.result.ResultStudyStatsScores$$serializer;
import com.lingq.core.network.api.result.ResultSubscriptionDetail;
import com.lingq.core.network.api.result.ResultTtsVoice;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b98 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8178a;

    public /* synthetic */ b98(int i) {
        this.f8178a = i;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        switch (this.f8178a) {
            case 0:
                C1792z2 c1792z2 = ResultOffer.Companion;
                return new C2978ev(ResultOfferBanner$$serializer.INSTANCE);
            case 1:
                C1730s3 c1730s3 = ResultShelf.Companion;
                z21 z21VarM24933a = y38.m24933a(List.class);
                ResultLibraryTab$$serializer resultLibraryTab$$serializer = ResultLibraryTab$$serializer.INSTANCE;
                return new am1(z21VarM24933a, new C2978ev(resultLibraryTab$$serializer), new KSerializer[]{resultLibraryTab$$serializer});
            case 2:
                C1619a4 c1619a4 = ResultStudyStats.Companion;
                return new C2978ev(ResultStudyStatsScores$$serializer.INSTANCE);
            case 3:
                C1633c4 c1633c4 = ResultSubscriptionDetail.Companion;
                return new am1(y38.m24933a(Tier.class), thb.m22059r(Tier$$serializer.INSTANCE), new KSerializer[0]);
            case 4:
                C1633c4 c1633c5 = ResultSubscriptionDetail.Companion;
                return new am1(y38.m24933a(Invoice.class), thb.m22059r(Invoice$$serializer.INSTANCE), new KSerializer[0]);
            case 5:
                C1633c4 c1633c6 = ResultSubscriptionDetail.Companion;
                return new am1(y38.m24933a(FreeTrialDetails.class), thb.m22059r(FreeTrialDetails$$serializer.INSTANCE), new KSerializer[0]);
            case 6:
                C1633c4 c1633c7 = ResultSubscriptionDetail.Companion;
                return new am1(y38.m24933a(AppleDetails.class), thb.m22059r(AppleDetails$$serializer.INSTANCE), new KSerializer[0]);
            case 7:
                C1633c4 c1633c8 = ResultSubscriptionDetail.Companion;
                return new am1(y38.m24933a(AndroidDetails.class), thb.m22059r(AndroidDetails$$serializer.INSTANCE), new KSerializer[0]);
            case 8:
                C1743u4 c1743u4 = ResultTtsVoice.Companion;
                return new C2978ev(TextToSpeechAppVoice$$serializer.INSTANCE);
            case 9:
                C1743u4 c1743u5 = ResultTtsVoice.Companion;
                return new C2978ev(sk9.f60959a);
            case 10:
                C1743u4 c1743u6 = ResultTtsVoice.Companion;
                return new C2978ev(sk9.f60959a);
            case 11:
                zf1 zf1Var = gh8.f40823a;
                return r46.f58685o;
            case 12:
                return new gl8(new LinkedHashMap());
            case 13:
                vh9 vh9Var = kl8.f47496a;
                return null;
            case 14:
                return new yn8(0);
            case 15:
                zf1 zf1Var2 = hv8.f42994a;
                return null;
            case 16:
                return new je5(sk9.f60959a, vk7.f65541a);
            case 17:
                return new v49();
            case 18:
                return new fe9(268435455);
            case 19:
                C1351n0 c1351n0 = StudyStatsEntity.Companion;
                return new C2978ev(StudyStatsScores$$serializer.INSTANCE);
            case 20:
                return new xj2(0.0f);
            case 21:
                zf1 zf1Var3 = lt9.f50118a;
                return null;
            case 22:
                return dea.f35533a;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return new f84(0L);
            case 24:
                return new f84(0L);
            case 25:
                return v82.f65004a;
            case 26:
                return new zda();
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                C1514a c1514a = VocabularySearchQuery.Companion;
                VocabularySearch[] vocabularySearchArrValues = VocabularySearch.values();
                vocabularySearchArrValues.getClass();
                return new zs2("com.lingq.core.domain.model.vocabulary.VocabularySearch", vocabularySearchArrValues);
            case 28:
                C1514a c1514a2 = VocabularySearchQuery.Companion;
                VocabularySort[] vocabularySortArrValues = VocabularySort.values();
                vocabularySortArrValues.getClass();
                return new zs2("com.lingq.core.domain.model.vocabulary.VocabularySort", vocabularySortArrValues);
            default:
                C1514a c1514a3 = VocabularySearchQuery.Companion;
                return new C2978ev(sk9.f60959a);
        }
    }
}
