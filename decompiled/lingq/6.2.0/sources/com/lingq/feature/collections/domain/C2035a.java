package com.lingq.feature.collections.domain;

import com.lingq.core.data.repository.C1295k;
import com.lingq.core.data.repository.C1296l;
import com.lingq.core.datastore.C1369b;
import com.lingq.core.domain.model.library.LessonInfo;
import com.lingq.core.domain.model.user.Profile;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.d65;
import p000.nm7;
import p000.qm7;
import p000.y95;

/* JADX INFO: renamed from: com.lingq.feature.collections.domain.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C2035a {

    /* JADX INFO: renamed from: a */
    public final y95 f25637a;

    /* JADX INFO: renamed from: b */
    public final Object f25638b;

    public C2035a(d65 d65Var, y95 y95Var) {
        d65Var.getClass();
        y95Var.getClass();
        this.f25638b = d65Var;
        this.f25637a = y95Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0094, code lost:
    
        if (((com.lingq.core.datastore.C1369b) r0).m7920g(r12, r1) == r2) goto L29;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m8955a(int i, int i2, String str, ContinuationImpl continuationImpl) throws Throwable {
        BuyCollectionCourseUseCase$invoke$1 buyCollectionCourseUseCase$invoke$1;
        boolean zBooleanValue;
        int i3;
        int i4;
        nm7 nm7Var = (nm7) this.f25638b;
        if (continuationImpl instanceof BuyCollectionCourseUseCase$invoke$1) {
            buyCollectionCourseUseCase$invoke$1 = (BuyCollectionCourseUseCase$invoke$1) continuationImpl;
            int i5 = buyCollectionCourseUseCase$invoke$1.f25602f;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                buyCollectionCourseUseCase$invoke$1.f25602f = i5 - Integer.MIN_VALUE;
            } else {
                buyCollectionCourseUseCase$invoke$1 = new BuyCollectionCourseUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            buyCollectionCourseUseCase$invoke$1 = new BuyCollectionCourseUseCase$invoke$1(this, continuationImpl);
        }
        Object objM7307b = buyCollectionCourseUseCase$invoke$1.f25600d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = buyCollectionCourseUseCase$invoke$1.f25602f;
        if (i6 == 0) {
            AbstractC3193b.m15359b(objM7307b);
            buyCollectionCourseUseCase$invoke$1.f25597a = i;
            buyCollectionCourseUseCase$invoke$1.f25598b = i2;
            buyCollectionCourseUseCase$invoke$1.f25602f = 1;
            objM7307b = ((C1296l) this.f25637a).m7307b(i, str, buyCollectionCourseUseCase$invoke$1);
            if (objM7307b != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i6 == 1) {
            i2 = buyCollectionCourseUseCase$invoke$1.f25598b;
            i = buyCollectionCourseUseCase$invoke$1.f25597a;
            AbstractC3193b.m15359b(objM7307b);
        } else if (i6 == 2) {
            zBooleanValue = buyCollectionCourseUseCase$invoke$1.f25599c;
            i4 = buyCollectionCourseUseCase$invoke$1.f25598b;
            i3 = buyCollectionCourseUseCase$invoke$1.f25597a;
            AbstractC3193b.m15359b(objM7307b);
            Profile profile = (Profile) objM7307b;
            profile.f19671t -= i4;
            buyCollectionCourseUseCase$invoke$1.f25597a = i3;
            buyCollectionCourseUseCase$invoke$1.f25598b = i4;
            buyCollectionCourseUseCase$invoke$1.f25599c = zBooleanValue;
            buyCollectionCourseUseCase$invoke$1.f25602f = 3;
        } else {
            if (i6 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zBooleanValue = buyCollectionCourseUseCase$invoke$1.f25599c;
            AbstractC3193b.m15359b(objM7307b);
        }
        return Boolean.valueOf(zBooleanValue);
        zBooleanValue = ((Boolean) objM7307b).booleanValue();
        if (zBooleanValue) {
            qm7 qm7Var = ((C1369b) nm7Var).f18480m;
            buyCollectionCourseUseCase$invoke$1.f25597a = i;
            buyCollectionCourseUseCase$invoke$1.f25598b = i2;
            buyCollectionCourseUseCase$invoke$1.f25599c = zBooleanValue;
            buyCollectionCourseUseCase$invoke$1.f25602f = 2;
            objM7307b = AbstractC3224d.m15541t(qm7Var, buyCollectionCourseUseCase$invoke$1);
            if (objM7307b != coroutineSingletons) {
                int i7 = i2;
                i3 = i;
                i4 = i7;
                Profile profile2 = (Profile) objM7307b;
                profile2.f19671t -= i4;
                buyCollectionCourseUseCase$invoke$1.f25597a = i3;
                buyCollectionCourseUseCase$invoke$1.f25598b = i4;
                buyCollectionCourseUseCase$invoke$1.f25599c = zBooleanValue;
                buyCollectionCourseUseCase$invoke$1.f25602f = 3;
            }
            return coroutineSingletons;
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m8956b(int i, ContinuationImpl continuationImpl) throws Throwable {
        GetCollectionLessonInfoUseCase$invoke$1 getCollectionLessonInfoUseCase$invoke$1;
        if (continuationImpl instanceof GetCollectionLessonInfoUseCase$invoke$1) {
            getCollectionLessonInfoUseCase$invoke$1 = (GetCollectionLessonInfoUseCase$invoke$1) continuationImpl;
            int i2 = getCollectionLessonInfoUseCase$invoke$1.f25629d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getCollectionLessonInfoUseCase$invoke$1.f25629d = i2 - Integer.MIN_VALUE;
            } else {
                getCollectionLessonInfoUseCase$invoke$1 = new GetCollectionLessonInfoUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getCollectionLessonInfoUseCase$invoke$1 = new GetCollectionLessonInfoUseCase$invoke$1(this, continuationImpl);
        }
        Object objM7245C = getCollectionLessonInfoUseCase$invoke$1.f25627b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = getCollectionLessonInfoUseCase$invoke$1.f25629d;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM7245C);
            d65 d65Var = (d65) this.f25638b;
            getCollectionLessonInfoUseCase$invoke$1.f25626a = i;
            getCollectionLessonInfoUseCase$invoke$1.f25629d = 1;
            objM7245C = ((C1295k) d65Var).m7245C(i, getCollectionLessonInfoUseCase$invoke$1);
            if (objM7245C != coroutineSingletons) {
            }
        }
        if (i3 != 1) {
            if (i3 == 2) {
                AbstractC3193b.m15359b(objM7245C);
                return objM7245C;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = getCollectionLessonInfoUseCase$invoke$1.f25626a;
        AbstractC3193b.m15359b(objM7245C);
        LessonInfo lessonInfo = (LessonInfo) objM7245C;
        if (lessonInfo != null) {
            return lessonInfo;
        }
        getCollectionLessonInfoUseCase$invoke$1.f25626a = i;
        getCollectionLessonInfoUseCase$invoke$1.f25629d = 2;
        Object objM7313h = ((C1296l) this.f25637a).m7313h(i, getCollectionLessonInfoUseCase$invoke$1);
        return objM7313h == coroutineSingletons ? coroutineSingletons : objM7313h;
    }

    public C2035a(y95 y95Var, nm7 nm7Var) {
        y95Var.getClass();
        nm7Var.getClass();
        this.f25637a = y95Var;
        this.f25638b = nm7Var;
    }
}
