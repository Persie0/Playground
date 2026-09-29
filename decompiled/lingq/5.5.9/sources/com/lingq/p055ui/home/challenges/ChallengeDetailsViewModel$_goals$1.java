package com.lingq.p055ui.home.challenges;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.challenge.ChallengeDetail;
import dm.C5207g;
import fi.C5539c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C6744b;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p385sf.C9000b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import si.C9023g;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00002\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u008a@"}, m13365d2 = {"", "Lfi/c;", "stats", "Lcom/lingq/shared/uimodel/challenge/ChallengeDetail;", "detail", "Lsi/g;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengeDetailsViewModel$_goals$1", m19206f = "ChallengeDetailsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
final class ChallengeDetailsViewModel$_goals$1 extends SuspendLambda implements InterfaceC2057q<List<? extends C5539c>, ChallengeDetail, InterfaceC9968c<? super List<? extends C9023g>>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ List f22940e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ ChallengeDetail f22941f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ChallengeDetailsViewModel f22942g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeDetailsViewModel$_goals$1(ChallengeDetailsViewModel challengeDetailsViewModel, InterfaceC9968c<? super ChallengeDetailsViewModel$_goals$1> interfaceC9968c) {
        super(3, interfaceC9968c);
        this.f22942g = challengeDetailsViewModel;
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(List<? extends C5539c> list, ChallengeDetail challengeDetail, InterfaceC9968c<? super List<? extends C9023g>> interfaceC9968c) {
        ChallengeDetailsViewModel$_goals$1 challengeDetailsViewModel$_goals$1 = new ChallengeDetailsViewModel$_goals$1(this.f22942g, interfaceC9968c);
        challengeDetailsViewModel$_goals$1.f22940e = list;
        challengeDetailsViewModel$_goals$1.f22941f = challengeDetail;
        return challengeDetailsViewModel$_goals$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        C9023g c9023g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        List list = this.f22940e;
        ChallengeDetail challengeDetail = this.f22941f;
        ArrayList arrayListM13421O = C6752c.m13421O(list);
        ArrayList arrayList = new ArrayList(C9325m.m17681z(arrayListM13421O, 10));
        int i10 = 0;
        for (Object obj2 : arrayListM13421O) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C9000b.m17257w();
                throw null;
            }
            C5539c c5539c = (C5539c) obj2;
            boolean zM11106a = C5207g.m11106a(challengeDetail != null ? challengeDetail.f21639g : null, ChallengeType.StreakDays.getValue());
            ChallengeDetailsViewModel challengeDetailsViewModel = this.f22942g;
            if (zM11106a) {
                double d10 = c5539c.f34253c;
                String str = c5539c.f34251a;
                Integer[] numArr = challengeDetailsViewModel.f22895L;
                c9023g = new C9023g(d10, 90.0d, str, numArr[i10 % C6744b.m13381m0(numArr)].intValue());
            } else {
                double d11 = c5539c.f34253c;
                double d12 = c5539c.f34254d;
                String str2 = c5539c.f34251a;
                Integer[] numArr2 = challengeDetailsViewModel.f22895L;
                c9023g = new C9023g(d11, d12, str2, numArr2[i10 % C6744b.m13381m0(numArr2)].intValue());
            }
            arrayList.add(c9023g);
            i10 = i11;
        }
        return arrayList;
    }
}
