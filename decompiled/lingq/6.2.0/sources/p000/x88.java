package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.network.api.result.C1616a1;
import com.lingq.core.network.api.result.C1630c1;
import com.lingq.core.network.api.result.C1638d2;
import com.lingq.core.network.api.result.C1652f3;
import com.lingq.core.network.api.result.C1657g2;
import com.lingq.core.network.api.result.C1658g3;
import com.lingq.core.network.api.result.C1668i1;
import com.lingq.core.network.api.result.C1675j2;
import com.lingq.core.network.api.result.C1676j3;
import com.lingq.core.network.api.result.C1681k2;
import com.lingq.core.network.api.result.C1686l1;
import com.lingq.core.network.api.result.C1700n3;
import com.lingq.core.network.api.result.C1711p2;
import com.lingq.core.network.api.result.C1741u2;
import com.lingq.core.network.api.result.C1746v1;
import com.lingq.core.network.api.result.C1779x1;
import com.lingq.core.network.api.result.C1785y1;
import com.lingq.core.network.api.result.C1786y2;
import com.lingq.core.network.api.result.FastSearchResult$$serializer;
import com.lingq.core.network.api.result.MoreLesson$$serializer;
import com.lingq.core.network.api.result.ResultChatPhrase$$serializer;
import com.lingq.core.network.api.result.ResultCourse;
import com.lingq.core.network.api.result.ResultDictionariesAvailable;
import com.lingq.core.network.api.result.ResultDictionaryData$$serializer;
import com.lingq.core.network.api.result.ResultErrorLogin;
import com.lingq.core.network.api.result.ResultFastSearch;
import com.lingq.core.network.api.result.ResultLesson;
import com.lingq.core.network.api.result.ResultLesson$$serializer;
import com.lingq.core.network.api.result.ResultLessonComplete;
import com.lingq.core.network.api.result.ResultLessonInfo;
import com.lingq.core.network.api.result.ResultLessonSentencesTranslation;
import com.lingq.core.network.api.result.ResultLessonText;
import com.lingq.core.network.api.result.ResultLessonUserCompleted;
import com.lingq.core.network.api.result.ResultLessonUserLiked;
import com.lingq.core.network.api.result.ResultLipp;
import com.lingq.core.network.api.result.ResultLippSentenceTranslation$$serializer;
import com.lingq.core.network.api.result.ResultMilestone$$serializer;
import com.lingq.core.network.api.result.ResultMilestones;
import com.lingq.core.network.api.result.ResultNotification$$serializer;
import com.lingq.core.network.api.result.ResultNotifications;
import com.lingq.core.network.api.result.ResultPhrases;
import com.lingq.core.network.api.result.ResultPlaylist;
import com.lingq.core.network.api.result.ResultPreferredTtsVoice$$serializer;
import com.lingq.core.network.api.result.ResultPreferredTtsVoices;
import com.lingq.core.network.api.result.ResultRegistrationError;
import com.lingq.core.network.api.result.worldcup.C1767l;
import com.lingq.core.network.api.result.worldcup.C1769n;
import com.lingq.core.network.api.result.worldcup.C1775t;
import com.lingq.core.network.api.result.worldcup.C1776u;
import com.lingq.core.network.api.result.worldcup.ResultCupBadge$$serializer;
import com.lingq.core.network.api.result.worldcup.ResultCupContributor$$serializer;
import com.lingq.core.network.api.result.worldcup.ResultCupMy;
import com.lingq.core.network.api.result.worldcup.ResultCupPrize$$serializer;
import com.lingq.core.network.api.result.worldcup.ResultCupPrizes;
import com.lingq.core.network.api.result.worldcup.ResultCupTeamStanding$$serializer;
import com.lingq.core.network.api.result.worldcup.ResultCupTopContributors;
import com.lingq.core.network.api.result.worldcup.ResultCupTopTeams;
import java.util.Date;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class x88 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67934a;

    public /* synthetic */ x88(int i) {
        this.f67934a = i;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        switch (this.f67934a) {
            case 0:
                C1616a1 c1616a1 = ResultCourse.Companion;
                return new C2978ev(thb.m22059r(ResultLesson$$serializer.INSTANCE));
            case 1:
                C1767l c1767l = ResultCupMy.Companion;
                return new C2978ev(ResultCupBadge$$serializer.INSTANCE);
            case 2:
                C1769n c1769n = ResultCupPrizes.Companion;
                return new C2978ev(ResultCupPrize$$serializer.INSTANCE);
            case 3:
                C1775t c1775t = ResultCupTopContributors.Companion;
                return new C2978ev(ResultCupContributor$$serializer.INSTANCE);
            case 4:
                C1776u c1776u = ResultCupTopTeams.Companion;
                return new C2978ev(ResultCupTeamStanding$$serializer.INSTANCE);
            case 5:
                C1630c1 c1630c1 = ResultDictionariesAvailable.Companion;
                return new C2978ev(ResultDictionaryData$$serializer.INSTANCE);
            case 6:
                C1668i1 c1668i1 = ResultErrorLogin.Companion;
                return new C2978ev(sk9.f60959a);
            case 7:
                C1686l1 c1686l1 = ResultFastSearch.Companion;
                return new C2978ev(FastSearchResult$$serializer.INSTANCE);
            case 8:
                C1686l1 c1686l2 = ResultFastSearch.Companion;
                return new je5(sk9.f60959a, l84.f49294a);
            case 9:
                C1686l1 c1686l3 = ResultFastSearch.Companion;
                return new je5(sk9.f60959a, l84.f49294a);
            case 10:
                C1686l1 c1686l4 = ResultFastSearch.Companion;
                return new je5(sk9.f60959a, l84.f49294a);
            case 11:
                C1746v1 c1746v1 = ResultLesson.Companion;
                return new C2978ev(e98.f36886a);
            case 12:
                C1746v1 c1746v2 = ResultLesson.Companion;
                return new C2978ev(sk9.f60959a);
            case 13:
                C1779x1 c1779x1 = ResultLessonComplete.Companion;
                return new C2978ev(thb.m22059r(MoreLesson$$serializer.INSTANCE));
            case 14:
                C1785y1 c1785y1 = ResultLessonInfo.Companion;
                return new C2978ev(sk9.f60959a);
            case 15:
                C1785y1 c1785y2 = ResultLessonInfo.Companion;
                return new C2978ev(sk9.f60959a);
            case 16:
                C1638d2 c1638d2 = ResultLessonSentencesTranslation.Companion;
                return new C2978ev(thb.m22059r(sk9.f60959a));
            case 17:
                C1657g2 c1657g2 = ResultLessonText.Companion;
                return new C2978ev(e98.f36886a);
            case 18:
                C1657g2 c1657g3 = ResultLessonText.Companion;
                return new C2978ev(sk9.f60959a);
            case 19:
                C1675j2 c1675j2 = ResultLessonUserCompleted.Companion;
                return new am1(y38.m24933a(Date.class), null, new KSerializer[0]);
            case 20:
                C1681k2 c1681k2 = ResultLessonUserLiked.Companion;
                return new am1(y38.m24933a(Date.class), null, new KSerializer[0]);
            case 21:
                C1711p2 c1711p2 = ResultLipp.Companion;
                return new C2978ev(e98.f36886a);
            case 22:
                C1711p2 c1711p3 = ResultLipp.Companion;
                return new C2978ev(ResultLippSentenceTranslation$$serializer.INSTANCE);
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                C1741u2 c1741u2 = ResultMilestones.Companion;
                return new C2978ev(ResultMilestone$$serializer.INSTANCE);
            case 24:
                C1786y2 c1786y2 = ResultNotifications.Companion;
                return new C2978ev(ResultNotification$$serializer.INSTANCE);
            case 25:
                C1652f3 c1652f3 = ResultPhrases.Companion;
                return new C2978ev(ResultChatPhrase$$serializer.INSTANCE);
            case 26:
                C1658g3 c1658g3 = ResultPlaylist.Companion;
                return new C2978ev(e98.f36886a);
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                C1658g3 c1658g4 = ResultPlaylist.Companion;
                return new C2978ev(sk9.f60959a);
            case 28:
                C1676j3 c1676j3 = ResultPreferredTtsVoices.Companion;
                return new C2978ev(ResultPreferredTtsVoice$$serializer.INSTANCE);
            default:
                C1700n3 c1700n3 = ResultRegistrationError.Companion;
                return new C2978ev(sk9.f60959a);
        }
    }
}
