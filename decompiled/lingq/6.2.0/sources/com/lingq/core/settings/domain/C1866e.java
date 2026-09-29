package com.lingq.core.settings.domain;

import com.lingq.core.analytics.C1240a;
import com.lingq.core.datastore.C1369b;
import com.lingq.core.datastore.C1370c;
import com.lingq.core.domain.model.user.Profile;
import com.lingq.core.domain.model.user.ProfileSetting;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.g9a;
import p000.hm5;
import p000.ig8;
import p000.km7;
import p000.nm7;
import p000.qm7;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.core.settings.domain.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C1866e {

    /* JADX INFO: renamed from: a */
    public final ig8 f22936a;

    /* JADX INFO: renamed from: b */
    public final km7 f22937b;

    /* JADX INFO: renamed from: c */
    public final nm7 f22938c;

    /* JADX INFO: renamed from: d */
    public final hm5 f22939d;

    public C1866e(ig8 ig8Var, km7 km7Var, nm7 nm7Var, hm5 hm5Var) {
        ig8Var.getClass();
        km7Var.getClass();
        nm7Var.getClass();
        hm5Var.getClass();
        this.f22936a = ig8Var;
        this.f22937b = km7Var;
        this.f22938c = nm7Var;
        this.f22939d = hm5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a5, code lost:
    
        if (((com.lingq.core.data.profile.C1267a) r9.f22937b).m7091u(r11, r4, r0) == r1) goto L27;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8627a(int i, ContinuationImpl continuationImpl) throws Throwable {
        SetCardsPerSessionUseCase$invoke$1 setCardsPerSessionUseCase$invoke$1;
        int iAbs;
        int i2;
        int i3;
        if (continuationImpl instanceof SetCardsPerSessionUseCase$invoke$1) {
            setCardsPerSessionUseCase$invoke$1 = (SetCardsPerSessionUseCase$invoke$1) continuationImpl;
            int i4 = setCardsPerSessionUseCase$invoke$1.f22800e;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                setCardsPerSessionUseCase$invoke$1.f22800e = i4 - Integer.MIN_VALUE;
            } else {
                setCardsPerSessionUseCase$invoke$1 = new SetCardsPerSessionUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            setCardsPerSessionUseCase$invoke$1 = new SetCardsPerSessionUseCase$invoke$1(this, continuationImpl);
        }
        Object obj = setCardsPerSessionUseCase$invoke$1.f22798c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = setCardsPerSessionUseCase$invoke$1.f22800e;
        if (i5 == 0) {
            AbstractC3193b.m15359b(obj);
            iAbs = Math.abs(i);
            ((C1240a) this.f22939d).m7025f("Review setting changed", g9a.m12429f("setting changed", "Cards per session"));
            setCardsPerSessionUseCase$invoke$1.f22796a = i;
            setCardsPerSessionUseCase$invoke$1.f22797b = iAbs;
            setCardsPerSessionUseCase$invoke$1.f22800e = 1;
            if (((C1370c) this.f22936a).m7935a(iAbs, setCardsPerSessionUseCase$invoke$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i5 == 1) {
            int i6 = setCardsPerSessionUseCase$invoke$1.f22797b;
            int i7 = setCardsPerSessionUseCase$invoke$1.f22796a;
            AbstractC3193b.m15359b(obj);
            iAbs = i6;
            i = i7;
        } else if (i5 == 2) {
            i3 = setCardsPerSessionUseCase$invoke$1.f22797b;
            i2 = setCardsPerSessionUseCase$invoke$1.f22796a;
            AbstractC3193b.m15359b(obj);
            ProfileSetting profileSetting = new ProfileSetting();
            profileSetting.f19699i = new Integer(i3);
            int i8 = ((Profile) obj).f19652a;
            setCardsPerSessionUseCase$invoke$1.f22796a = i2;
            setCardsPerSessionUseCase$invoke$1.f22797b = i3;
            setCardsPerSessionUseCase$invoke$1.f22800e = 3;
        } else {
            if (i5 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
        qm7 qm7Var = ((C1369b) this.f22938c).f18480m;
        setCardsPerSessionUseCase$invoke$1.f22796a = i;
        setCardsPerSessionUseCase$invoke$1.f22797b = iAbs;
        setCardsPerSessionUseCase$invoke$1.f22800e = 2;
        Object objM15541t = AbstractC3224d.m15541t(qm7Var, setCardsPerSessionUseCase$invoke$1);
        if (objM15541t != coroutineSingletons) {
            i2 = i;
            i3 = iAbs;
            obj = objM15541t;
            ProfileSetting profileSetting2 = new ProfileSetting();
            profileSetting2.f19699i = new Integer(i3);
            int i9 = ((Profile) obj).f19652a;
            setCardsPerSessionUseCase$invoke$1.f22796a = i2;
            setCardsPerSessionUseCase$invoke$1.f22797b = i3;
            setCardsPerSessionUseCase$invoke$1.f22800e = 3;
        }
        return coroutineSingletons;
    }
}
