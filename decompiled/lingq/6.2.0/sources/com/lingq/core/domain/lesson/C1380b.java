package com.lingq.core.domain.lesson;

import com.lingq.core.data.repository.C1295k;
import com.lingq.core.domain.util.AbstractC1543a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.bx0;
import p000.c83;
import p000.d65;
import p000.hj2;
import p000.im3;
import p000.ld0;
import p000.mv0;
import p000.q05;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.core.domain.lesson.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C1380b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f18722a;

    /* JADX INFO: renamed from: b */
    public final d65 f18723b;

    public C1380b(d65 d65Var, int i) {
        this.f18722a = i;
        d65Var.getClass();
        switch (i) {
            case 1:
                this.f18723b = d65Var;
                break;
            case 2:
                this.f18723b = d65Var;
                break;
            case 3:
                this.f18723b = d65Var;
                break;
            default:
                this.f18723b = d65Var;
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public c83 m7987a(int i, String str) {
        str.getClass();
        return AbstractC3224d.m15536o(AbstractC1543a.m8226a(new im3(this, i, 1, str), new GetLessonPreviewUseCase$invoke$2(this, str, i, null)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m7988b(int i, String str, String str2, ContinuationImpl continuationImpl, boolean z) throws Throwable {
        DownloadLessonUseCase$invoke$1 downloadLessonUseCase$invoke$1;
        if (continuationImpl instanceof DownloadLessonUseCase$invoke$1) {
            downloadLessonUseCase$invoke$1 = (DownloadLessonUseCase$invoke$1) continuationImpl;
            int i2 = downloadLessonUseCase$invoke$1.f18652f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                downloadLessonUseCase$invoke$1.f18652f = i2 - Integer.MIN_VALUE;
            } else {
                downloadLessonUseCase$invoke$1 = new DownloadLessonUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            downloadLessonUseCase$invoke$1 = new DownloadLessonUseCase$invoke$1(this, continuationImpl);
        }
        Object obj = downloadLessonUseCase$invoke$1.f18650d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = downloadLessonUseCase$invoke$1.f18652f;
        if (i3 == 0) {
            AbstractC3193b.m15359b(obj);
            downloadLessonUseCase$invoke$1.f18647a = str2;
            downloadLessonUseCase$invoke$1.f18648b = i;
            downloadLessonUseCase$invoke$1.f18649c = z;
            downloadLessonUseCase$invoke$1.f18652f = 1;
            if (((C1295k) this.f18723b).m7286l(i, str, downloadLessonUseCase$invoke$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = downloadLessonUseCase$invoke$1.f18649c;
            i = downloadLessonUseCase$invoke$1.f18648b;
            str2 = downloadLessonUseCase$invoke$1.f18647a;
            AbstractC3193b.m15359b(obj);
        }
        return new hj2(str2, i, z);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    /* JADX INFO: renamed from: c */
    public Object m7989c(int i, String str, ContinuationImpl continuationImpl) throws Throwable {
        GetLessonDownloadStateUseCase$invoke$1 getLessonDownloadStateUseCase$invoke$1;
        c83 c83Var;
        UpdateLessonDataUseCase$invoke$1 updateLessonDataUseCase$invoke$1;
        int i2 = this.f18722a;
        d65 d65Var = this.f18723b;
        switch (i2) {
            case 1:
                if (continuationImpl instanceof GetLessonDownloadStateUseCase$invoke$1) {
                    getLessonDownloadStateUseCase$invoke$1 = (GetLessonDownloadStateUseCase$invoke$1) continuationImpl;
                    int i3 = getLessonDownloadStateUseCase$invoke$1.f18676f;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        getLessonDownloadStateUseCase$invoke$1.f18676f = i3 - Integer.MIN_VALUE;
                    } else {
                        getLessonDownloadStateUseCase$invoke$1 = new GetLessonDownloadStateUseCase$invoke$1(this, continuationImpl);
                    }
                } else {
                    getLessonDownloadStateUseCase$invoke$1 = new GetLessonDownloadStateUseCase$invoke$1(this, continuationImpl);
                }
                Object objM15536o = getLessonDownloadStateUseCase$invoke$1.f18674d;
                Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = getLessonDownloadStateUseCase$invoke$1.f18676f;
                if (i4 == 0) {
                    AbstractC3193b.m15359b(objM15536o);
                    getLessonDownloadStateUseCase$invoke$1.f18671a = str;
                    getLessonDownloadStateUseCase$invoke$1.f18673c = i;
                    getLessonDownloadStateUseCase$invoke$1.f18676f = 1;
                    objM15536o = AbstractC3224d.m15536o(new bx0(AbstractC3584sr.m21590A(((q05) ((C1295k) d65Var).f16498b).f57071K, false, new String[]{"LessonsAndWordsJoin"}, new mv0(i, 13)), 10));
                    if (objM15536o != obj) {
                    }
                    return obj;
                }
                if (i4 == 1) {
                    i = getLessonDownloadStateUseCase$invoke$1.f18673c;
                    str = getLessonDownloadStateUseCase$invoke$1.f18671a;
                    AbstractC3193b.m15359b(objM15536o);
                } else {
                    if (i4 != 2) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c83Var = getLessonDownloadStateUseCase$invoke$1.f18672b;
                    AbstractC3193b.m15359b(objM15536o);
                }
                return new C3228h(c83Var, (c83) objM15536o, new GetLessonDownloadStateUseCase$invoke$2(3, null));
                c83 c83Var2 = (c83) objM15536o;
                getLessonDownloadStateUseCase$invoke$1.f18671a = null;
                getLessonDownloadStateUseCase$invoke$1.f18672b = c83Var2;
                getLessonDownloadStateUseCase$invoke$1.f18673c = i;
                getLessonDownloadStateUseCase$invoke$1.f18676f = 2;
                q05 q05Var = (q05) ((C1295k) d65Var).f16498b;
                q05Var.getClass();
                str.getClass();
                int i5 = 9;
                Object objM15536o2 = AbstractC3224d.m15536o(new bx0(AbstractC3584sr.m21590A(q05Var.f57071K, false, new String[]{"LessonAudioDownloadEntity"}, new ld0(str, i, i5)), i5));
                if (objM15536o2 != obj) {
                    c83Var = c83Var2;
                    objM15536o = objM15536o2;
                    return new C3228h(c83Var, (c83) objM15536o, new GetLessonDownloadStateUseCase$invoke$2(3, null));
                }
                return obj;
            default:
                if (continuationImpl instanceof UpdateLessonDataUseCase$invoke$1) {
                    updateLessonDataUseCase$invoke$1 = (UpdateLessonDataUseCase$invoke$1) continuationImpl;
                    int i6 = updateLessonDataUseCase$invoke$1.f18721c;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        updateLessonDataUseCase$invoke$1.f18721c = i6 - Integer.MIN_VALUE;
                    } else {
                        updateLessonDataUseCase$invoke$1 = new UpdateLessonDataUseCase$invoke$1(this, continuationImpl);
                    }
                } else {
                    updateLessonDataUseCase$invoke$1 = new UpdateLessonDataUseCase$invoke$1(this, continuationImpl);
                }
                Object obj2 = updateLessonDataUseCase$invoke$1.f18719a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = updateLessonDataUseCase$invoke$1.f18721c;
                try {
                    if (i7 == 0) {
                        AbstractC3193b.m15359b(obj2);
                        updateLessonDataUseCase$invoke$1.f18721c = 1;
                        if (((C1295k) d65Var).m7290n(i, str, updateLessonDataUseCase$invoke$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i7 != 1) {
                            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC3193b.m15359b(obj2);
                    }
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return xfa.f68157a;
        }
    }
}
