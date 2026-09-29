package com.lingq.p055ui.home.challenges;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.language.UserLanguage;
import dm.C5207g;
import fi.C5537a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0000H\u008a@"}, m13365d2 = {"", "Lfi/a;", "activeUserChallenges", "Lcom/lingq/shared/uimodel/language/UserLanguage;", "userLanguages", "", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengesViewModel$_activeChallenges$1", m19206f = "ChallengesViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
final class ChallengesViewModel$_activeChallenges$1 extends SuspendLambda implements InterfaceC2057q<List<? extends C5537a>, List<? extends UserLanguage>, InterfaceC9968c<? super List<C5537a>>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ List f23120e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ List f23121f;

    public ChallengesViewModel$_activeChallenges$1(InterfaceC9968c<? super ChallengesViewModel$_activeChallenges$1> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(List<? extends C5537a> list, List<? extends UserLanguage> list2, InterfaceC9968c<? super List<C5537a>> interfaceC9968c) {
        ChallengesViewModel$_activeChallenges$1 challengesViewModel$_activeChallenges$1 = new ChallengesViewModel$_activeChallenges$1(interfaceC9968c);
        challengesViewModel$_activeChallenges$1.f23120e = list;
        challengesViewModel$_activeChallenges$1.f23121f = list2;
        return challengesViewModel$_activeChallenges$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        Object next;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        List<C5537a> list = this.f23120e;
        List list2 = this.f23121f;
        ArrayList arrayList = new ArrayList();
        for (C5537a c5537a : list) {
            Iterator it = list2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!C5207g.m11106a(((UserLanguage) next).f21726a, c5537a.f34248n));
            UserLanguage userLanguage = (UserLanguage) next;
            if (!C5207g.m11106a(c5537a.f34245k, ChallengeType.ThousandWords.getValue())) {
                arrayList.add(c5537a);
            } else if (userLanguage != null && userLanguage.f21733h < 1000) {
                arrayList.add(c5537a);
            }
        }
        return arrayList;
    }
}
