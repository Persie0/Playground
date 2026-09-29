package p000;

import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.network.api.result.worldcup.ResultCupContributor;
import com.lingq.core.network.api.result.worldcup.ResultCupContributorProfile;
import com.lingq.core.network.api.result.worldcup.ResultCupMeSummary;
import com.lingq.core.network.api.result.worldcup.ResultCupTopContributors;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zqc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f71989a = new C0282a(1138195317, false, new fe1(28));

    /* JADX INFO: renamed from: a */
    public static final ArrayList m25748a(ResultCupTopContributors resultCupTopContributors, String str) {
        resultCupTopContributors.getClass();
        List<ResultCupContributor> list = resultCupTopContributors.f21830a;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list, 10));
        for (ResultCupContributor resultCupContributor : list) {
            resultCupContributor.getClass();
            int i = resultCupContributor.f21760a;
            Integer num = resultCupContributor.f21761b;
            Integer num2 = resultCupContributor.f21762c;
            ResultCupContributorProfile resultCupContributorProfile = resultCupContributor.f21763d;
            int i2 = resultCupContributorProfile.f21766a;
            String str2 = resultCupContributorProfile.f21767b;
            String str3 = resultCupContributorProfile.f21768c;
            String str4 = resultCupContributor.f21764e;
            int i3 = resultCupContributor.f21765f;
            str2.getClass();
            str4.getClass();
            arrayList.add(new ct1(str, i2, i, num, num2, str2, str3, str4, i3));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static final dt1 m25749b(ResultCupTopContributors resultCupTopContributors, String str) {
        resultCupTopContributors.getClass();
        ResultCupMeSummary resultCupMeSummary = resultCupTopContributors.f21831b;
        if (resultCupMeSummary == null) {
            return null;
        }
        return new dt1(resultCupMeSummary.f21779b, resultCupMeSummary.f21778a, str);
    }
}
