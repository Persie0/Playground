package p000;

import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.database.entity.ChallengeRankingEntity;
import com.lingq.core.domain.model.challenge.ChallengeProfile;
import com.lingq.core.network.api.result.Book;
import com.lingq.core.network.api.result.BookObject;
import com.lingq.core.network.api.result.Extra;
import com.lingq.core.network.api.result.ResultChallengeProfile;
import com.lingq.core.network.api.result.ResultChallengeRanking;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ypc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f70279a = new C0282a(-1589390730, false, new vd1(2));

    /* JADX INFO: renamed from: a */
    public static final ChallengeRankingEntity m25272a(ResultChallengeRanking resultChallengeRanking, String str, String str2, String str3) {
        ChallengeProfile challengeProfile;
        Book book;
        BookObject bookObject;
        String str4;
        Book book2;
        BookObject bookObject2;
        String str5;
        Integer numM4844a0;
        resultChallengeRanking.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        ResultChallengeProfile resultChallengeProfile = resultChallengeRanking.f20687d;
        if (resultChallengeProfile != null) {
            int i = resultChallengeProfile.f20676a;
            String str6 = resultChallengeProfile.f20677b;
            String str7 = str6 == null ? "" : str6;
            String str8 = resultChallengeProfile.f20678c;
            String str9 = str8 == null ? "" : str8;
            String str10 = resultChallengeProfile.f20679d;
            String str11 = str10 == null ? "" : str10;
            int i2 = resultChallengeProfile.f20680e;
            boolean z = resultChallengeProfile.f20681f;
            String str12 = resultChallengeProfile.f20682g;
            if (str12 == null) {
                str12 = "";
            }
            String str13 = resultChallengeProfile.f20683h;
            challengeProfile = new ChallengeProfile(i, i2, str7, str9, str11, str12, str13 == null ? "" : str13, z);
        } else {
            challengeProfile = null;
        }
        ChallengeProfile challengeProfile2 = challengeProfile;
        int i3 = resultChallengeRanking.f20688e;
        int i4 = (int) resultChallengeRanking.f20689f;
        String str14 = resultChallengeRanking.f20690g;
        int iIntValue = (str14 == null || (numM4844a0 = cl9.m4844a0(str14)) == null) ? 0 : numM4844a0.intValue();
        boolean z2 = resultChallengeRanking.f20685b;
        Extra extra = resultChallengeRanking.f20684a;
        return new ChallengeRankingEntity(str2, str3, i3, str, challengeProfile2, i4, iIntValue, z2, (extra == null || (book2 = extra.f20522a) == null || (bookObject2 = book2.f20498c) == null || (str5 = bookObject2.f20506d) == null) ? "" : str5, (extra == null || (book = extra.f20522a) == null || (bookObject = book.f20498c) == null || (str4 = bookObject.f20505c) == null) ? "" : str4);
    }
}
