package com.lingq.feature.challenges;

import com.lingq.core.analytics.C1240a;
import com.lingq.core.datastore.C1369b;
import com.lingq.core.domain.model.challenge.Challenge;
import com.lingq.core.domain.model.user.Profile;
import com.lingq.core.p012ui.UpgradeReason;
import com.lingq.core.p012ui.challenges.ChallengeType;
import com.lingq.core.p012ui.challenges.LeaderboardMetric;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.cma;
import p000.g9a;
import p000.hm5;
import p000.or0;
import p000.qm7;
import p000.un1;
import p000.wq0;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.ChallengeDetailsViewModel$updateJoin$1", m4291f = "ChallengeDetailsViewModel.kt", m4292l = {394, 396, 401, 412}, m4293m = "invokeSuspend", m4294v = 2)
final class ChallengeDetailsViewModel$updateJoin$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public C1962b f24406a;

    /* JADX INFO: renamed from: b */
    public Challenge f24407b;

    /* JADX INFO: renamed from: c */
    public int f24408c;

    /* JADX INFO: renamed from: d */
    public int f24409d;

    /* JADX INFO: renamed from: e */
    public int f24410e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1962b f24411f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeDetailsViewModel$updateJoin$1(C1962b c1962b, Continuation continuation) {
        super(2, continuation);
        this.f24411f = c1962b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChallengeDetailsViewModel$updateJoin$1(this.f24411f, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChallengeDetailsViewModel$updateJoin$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0089  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a2  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009f, code lost:
    
        if (((com.lingq.core.data.repository.C1288d) r0).m7136c(r13, r3, r12) == r2) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ba, code lost:
    
        if (((com.lingq.core.data.repository.C1288d) r0).m7137d(r13, r3, r4, r12) == r2) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f9, code lost:
    
        if (((com.lingq.core.data.repository.C1288d) r1).m7135b(r6, r7, r8, r9, r12) == r2) goto L34;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Challenge challenge;
        int i;
        int i2;
        Profile profile;
        wq0 wq0Var;
        cma cmaVar;
        Object value;
        ChallengeType challengeType;
        C1962b c1962b = this.f24411f;
        hm5 hm5Var = c1962b.f24494e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.f24410e;
        if (i3 != 0) {
            if (i3 == 1) {
                int i4 = this.f24409d;
                i2 = this.f24408c;
                C1962b c1962b2 = this.f24406a;
                AbstractC3193b.m15359b(obj);
                i = i4;
                c1962b = c1962b2;
                profile = (Profile) obj;
                C3244l c3244l = c1962b.f24507r;
                wq0Var = c1962b.f24500k;
                cmaVar = c1962b.f24491b;
                value = c3244l.getValue();
                challengeType = ChallengeType.BookChallenge;
                or0 or0Var = c1962b.f24493d;
                if (value == challengeType) {
                    String strMo4589b2 = cmaVar.mo4589b2();
                    String str = wq0Var.f67168a;
                    this.f24406a = null;
                    this.f24407b = null;
                    this.f24408c = i2;
                    this.f24409d = i;
                    this.f24410e = 2;
                } else {
                    String strMo4589b3 = cmaVar.mo4589b2();
                    String str2 = wq0Var.f67168a;
                    int i5 = profile.f19652a;
                    this.f24406a = null;
                    this.f24407b = null;
                    this.f24408c = i2;
                    this.f24409d = i;
                    this.f24410e = 3;
                }
            } else if (i3 == 2 || i3 == 3) {
                AbstractC3193b.m15359b(obj);
            } else {
                if (i3 != 4) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Challenge challenge2 = this.f24407b;
                C1962b c1962b3 = this.f24406a;
                AbstractC3193b.m15359b(obj);
                challenge = challenge2;
                c1962b = c1962b3;
                if (c1962b.f24491b.mo4598w2()) {
                    c1962b.f24501l.mo4677k(new Pair(challenge.f18854b, challenge.f18855c));
                } else {
                    c1962b.mo3737M1(UpgradeReason.CHALLENGES);
                }
            }
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(obj);
        challenge = (Challenge) c1962b.f24508s.getValue();
        if (challenge != null) {
            String str3 = challenge.f18855c;
            i = 0;
            if (challenge.f18862j) {
                ((C1240a) hm5Var).m7025f("Challenge left", g9a.m12429f("Challenge", str3));
                qm7 qm7Var = ((C1369b) c1962b.f24495f).f18480m;
                this.f24406a = c1962b;
                this.f24407b = null;
                this.f24408c = 0;
                this.f24409d = 0;
                this.f24410e = 1;
                obj = AbstractC3224d.m15541t(qm7Var, this);
                if (obj != coroutineSingletons) {
                    i2 = 0;
                    profile = (Profile) obj;
                    C3244l c3244l2 = c1962b.f24507r;
                    wq0Var = c1962b.f24500k;
                    cmaVar = c1962b.f24491b;
                    value = c3244l2.getValue();
                    challengeType = ChallengeType.BookChallenge;
                    or0 or0Var2 = c1962b.f24493d;
                    if (value == challengeType) {
                        String strMo4589b4 = cmaVar.mo4589b2();
                        String str4 = wq0Var.f67168a;
                        this.f24406a = null;
                        this.f24407b = null;
                        this.f24408c = i2;
                        this.f24409d = i;
                        this.f24410e = 2;
                    } else {
                        String strMo4589b5 = cmaVar.mo4589b2();
                        String str5 = wq0Var.f67168a;
                        int i6 = profile.f19652a;
                        this.f24406a = null;
                        this.f24407b = null;
                        this.f24408c = i2;
                        this.f24409d = i;
                        this.f24410e = 3;
                    }
                }
            } else {
                ((C1240a) hm5Var).m7025f("Challenge joined", g9a.m12429f("Challenge", str3));
                or0 or0Var3 = c1962b.f24493d;
                String strMo4589b6 = c1962b.f24491b.mo4589b2();
                String str6 = c1962b.f24500k.f67168a;
                String str7 = challenge.f18859g;
                if (str7 == null) {
                    str7 = "";
                }
                String str8 = str7;
                String key = ((LeaderboardMetric) c1962b.f24503n.getValue()).getKey();
                this.f24406a = c1962b;
                this.f24407b = challenge;
                this.f24408c = 0;
                this.f24409d = 0;
                this.f24410e = 4;
            }
            return coroutineSingletons;
        }
        return xfa.f68157a;
    }
}
