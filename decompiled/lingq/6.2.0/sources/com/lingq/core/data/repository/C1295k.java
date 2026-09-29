package com.lingq.core.data.repository;

import android.os.Bundle;
import androidx.room.AbstractC0747e;
import androidx.room.util.AbstractC0758a;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.impl.C0773b;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.data.domain.C1266a;
import com.lingq.core.data.domain.YouTubeSubtitleFormat;
import com.lingq.core.data.workers.LessonBookmarkWorker;
import com.lingq.core.data.workers.LessonCompleteWorker;
import com.lingq.core.data.workers.LessonDeleteRoseWorker;
import com.lingq.core.data.workers.LessonGiveRoseWorker;
import com.lingq.core.data.workers.LessonSaveRemoveWorker;
import com.lingq.core.data.workers.LessonUpdateStatsWorker;
import com.lingq.core.database.LingQDatabase;
import com.lingq.core.database.dao.AbstractC1320h;
import com.lingq.core.database.dao.C1321i;
import com.lingq.core.database.entity.LessonBookmarkEntity;
import com.lingq.core.database.entity.LessonEntity;
import com.lingq.core.database.entity.LessonSentenceEntity;
import com.lingq.core.database.entity.LessonStatsEntity;
import com.lingq.core.database.entity.LessonsSimplifiedJoin;
import com.lingq.core.database.entity.LibraryCounterEntity;
import com.lingq.core.database.entity.SharedByUserAndQueryJoin;
import com.lingq.core.database.entity.TranslationSentenceEntity;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.core.domain.model.lesson.LessonBookmark;
import com.lingq.core.domain.model.lesson.LessonMetadata;
import com.lingq.core.domain.model.lesson.LessonProcessingStatus;
import com.lingq.core.domain.model.lesson.LessonStatus;
import com.lingq.core.domain.model.lesson.LessonTextToken;
import com.lingq.core.domain.model.lesson.Note;
import com.lingq.core.domain.model.lesson.Translation;
import com.lingq.core.domain.model.library.LibraryItemType;
import com.lingq.core.domain.model.repo.NetworkErrorType;
import com.lingq.core.network.adapters.AbstractC1554b;
import com.lingq.core.network.adapters.NetworkResponse;
import com.lingq.core.network.api.requests.RequestGentts;
import com.lingq.core.network.api.requests.RequestLessonComplete;
import com.lingq.core.network.api.requests.RequestLessonImport;
import com.lingq.core.network.api.requests.RequestLessonUpdateSave;
import com.lingq.core.network.api.requests.RequestLipp;
import com.lingq.core.network.api.requests.RequestNote;
import com.lingq.core.network.api.requests.RequestRefreshTranslateSentence;
import com.lingq.core.network.api.requests.RequestTranslation;
import com.lingq.core.network.api.requests.RequestTranslationSentence;
import com.lingq.core.network.api.result.MoreLesson;
import com.lingq.core.network.api.result.ResultErrorLesson;
import com.lingq.core.network.api.result.ResultErrorLessonProcessing;
import com.lingq.core.network.api.result.ResultLesson;
import com.lingq.core.network.api.result.ResultLessonBookmark;
import com.lingq.core.network.api.result.ResultLessonComplete;
import com.lingq.core.network.api.result.ResultLessonInfo;
import com.lingq.core.network.api.result.ResultLessonStats;
import com.lingq.core.network.api.result.ResultLessonTags;
import com.lingq.core.network.api.result.ResultLessonText;
import com.lingq.core.network.api.result.ResultLessonUpload;
import com.lingq.core.network.api.result.ResultLessonWordsCards;
import com.lingq.core.network.api.result.ResultLibraryCounter;
import com.lingq.core.network.api.result.ResultLipp;
import com.lingq.core.network.api.result.ResultLippSentenceTranslation;
import com.lingq.core.network.api.result.ResultSentence;
import com.lingq.core.network.api.result.ResultSharedByUser;
import com.lingq.core.network.api.result.ResultTextToken;
import com.lingq.core.network.api.result.ResultTranslationSentence;
import com.lingq.core.network.api.result.Results;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Triple;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import kotlinx.coroutines.sync.C3248a;
import p000.AbstractC3122is;
import p000.AbstractC3184kh;
import p000.AbstractC3393o1;
import p000.AbstractC3423or;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.auc;
import p000.bq1;
import p000.bsc;
import p000.c25;
import p000.c76;
import p000.c83;
import p000.ca5;
import p000.d25;
import p000.d32;
import p000.d65;
import p000.d98;
import p000.df4;
import p000.e25;
import p000.e65;
import p000.esc;
import p000.f05;
import p000.f25;
import p000.f5d;
import p000.fa4;
import p000.g05;
import p000.g25;
import p000.gm5;
import p000.h05;
import p000.h0a;
import p000.h25;
import p000.h85;
import p000.hi8;
import p000.hj0;
import p000.hm5;
import p000.hn1;
import p000.hpc;
import p000.hsc;
import p000.huc;
import p000.i05;
import p000.i25;
import p000.i88;
import p000.i93;
import p000.icb;
import p000.ijd;
import p000.j05;
import p000.j65;
import p000.jjd;
import p000.k05;
import p000.k65;
import p000.k88;
import p000.ke2;
import p000.l56;
import p000.l65;
import p000.lda;
import p000.lsc;
import p000.m55;
import p000.m88;
import p000.md0;
import p000.mqb;
import p000.mv0;
import p000.nn1;
import p000.nob;
import p000.o7b;
import p000.od0;
import p000.oe5;
import p000.puc;
import p000.q05;
import p000.ql4;
import p000.r45;
import p000.rm5;
import p000.si7;
import p000.sm5;
import p000.sp0;
import p000.t91;
import p000.tid;
import p000.tuc;
import p000.tx6;
import p000.u85;
import p000.u91;
import p000.um5;
import p000.un0;
import p000.un1;
import p000.ux5;
import p000.ux6;
import p000.v85;
import p000.v91;
import p000.vi7;
import p000.vk9;
import p000.vz1;
import p000.wk9;
import p000.x45;
import p000.x68;
import p000.xfa;
import p000.xj1;
import p000.xm5;
import p000.xrc;
import p000.xv5;
import p000.y02;
import p000.y68;
import p000.yu0;
import p000.z68;
import p000.zj6;
import retrofit2.HttpException;

/* JADX INFO: renamed from: com.lingq.core.data.repository.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1295k implements d65 {

    /* JADX INFO: renamed from: a */
    public final LingQDatabase f16497a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1320h f16498b;

    /* JADX INFO: renamed from: c */
    public final un0 f16499c;

    /* JADX INFO: renamed from: d */
    public final o7b f16500d;

    /* JADX INFO: renamed from: e */
    public final C1321i f16501e;

    /* JADX INFO: renamed from: f */
    public final k65 f16502f;

    /* JADX INFO: renamed from: g */
    public final ca5 f16503g;

    /* JADX INFO: renamed from: h */
    public final od0 f16504h;

    /* JADX INFO: renamed from: i */
    public final hm5 f16505i;

    /* JADX INFO: renamed from: j */
    public final C0773b f16506j;

    /* JADX INFO: renamed from: k */
    public final df4 f16507k;

    /* JADX INFO: renamed from: l */
    public final si7 f16508l;

    /* JADX INFO: renamed from: m */
    public final C3248a f16509m;

    /* JADX INFO: renamed from: n */
    public final LinkedHashSet f16510n;

    public C1295k(LingQDatabase lingQDatabase, AbstractC1320h abstractC1320h, un0 un0Var, o7b o7bVar, C1321i c1321i, k65 k65Var, ca5 ca5Var, od0 od0Var, hm5 hm5Var, C0773b c0773b, df4 df4Var, si7 si7Var, un1 un1Var, nn1 nn1Var) {
        lingQDatabase.getClass();
        abstractC1320h.getClass();
        un0Var.getClass();
        o7bVar.getClass();
        c1321i.getClass();
        k65Var.getClass();
        ca5Var.getClass();
        od0Var.getClass();
        hm5Var.getClass();
        c0773b.getClass();
        df4Var.getClass();
        si7Var.getClass();
        un1Var.getClass();
        this.f16497a = lingQDatabase;
        this.f16498b = abstractC1320h;
        this.f16499c = un0Var;
        this.f16500d = o7bVar;
        this.f16501e = c1321i;
        this.f16502f = k65Var;
        this.f16503g = ca5Var;
        this.f16504h = od0Var;
        this.f16505i = hm5Var;
        this.f16506j = c0773b;
        this.f16507k = df4Var;
        this.f16508l = si7Var;
        this.f16509m = new C3248a();
        this.f16510n = new LinkedHashSet();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0095  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bb, code lost:
    
        if (r2 == r4) goto L32;
     */
    /* JADX INFO: renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7243A(int i, String str, String str2, String str3, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$generateTts$1 lessonRepositoryImpl$generateTts$1;
        int i2;
        ResultLesson resultLesson;
        int i3;
        ResultLesson resultLesson2;
        LessonEntity lessonEntity;
        if (continuationImpl instanceof LessonRepositoryImpl$generateTts$1) {
            lessonRepositoryImpl$generateTts$1 = (LessonRepositoryImpl$generateTts$1) continuationImpl;
            int i4 = lessonRepositoryImpl$generateTts$1.f15405e;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$generateTts$1.f15405e = i4 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$generateTts$1 = new LessonRepositoryImpl$generateTts$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$generateTts$1 = new LessonRepositoryImpl$generateTts$1(this, continuationImpl);
        }
        Object objM14900d = lessonRepositoryImpl$generateTts$1.f15403c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = lessonRepositoryImpl$generateTts$1.f15405e;
        xfa xfaVar = xfa.f68157a;
        AbstractC1320h abstractC1320h = this.f16498b;
        if (i5 == 0) {
            AbstractC3193b.m15359b(objM14900d);
            Integer num = new Integer(i);
            RequestGentts requestGentts = new RequestGentts(str2, str3);
            lessonRepositoryImpl$generateTts$1.f15402b = i;
            lessonRepositoryImpl$generateTts$1.f15405e = 1;
            objM14900d = this.f16502f.m14900d(str, num, requestGentts, lessonRepositoryImpl$generateTts$1);
            if (objM14900d != coroutineSingletons) {
                i2 = i;
            }
            return coroutineSingletons;
        }
        if (i5 == 1) {
            i2 = lessonRepositoryImpl$generateTts$1.f15402b;
            AbstractC3193b.m15359b(objM14900d);
        } else {
            if (i5 == 2) {
                i2 = lessonRepositoryImpl$generateTts$1.f15402b;
                resultLesson = lessonRepositoryImpl$generateTts$1.f15401a;
                AbstractC3193b.m15359b(objM14900d);
                ResultLesson resultLesson3 = resultLesson;
                i3 = i2;
                resultLesson2 = resultLesson3;
                lessonEntity = (LessonEntity) objM14900d;
                if (lessonEntity != null) {
                    LessonEntity lessonEntityM7642a = LessonEntity.m7642a(lessonEntity, null, 0, 0, 0.0d, 0.0d, 0, false, null, resultLesson2.m8365c(), -1, -1, 4063231);
                    lessonRepositoryImpl$generateTts$1.f15401a = resultLesson2;
                    lessonRepositoryImpl$generateTts$1.f15402b = i3;
                    lessonRepositoryImpl$generateTts$1.f15405e = 3;
                    objM14900d = abstractC1320h.mo4095v0(lessonEntityM7642a, lessonRepositoryImpl$generateTts$1);
                }
                return fa4.m11650l(resultLesson2.m8365c(), LessonStatus.GENERATE_TTS.getValue()) ? new xm5(xfaVar) : new um5(c25.f9351a);
            }
            if (i5 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            resultLesson2 = lessonRepositoryImpl$generateTts$1.f15401a;
            AbstractC3193b.m15359b(objM14900d);
        }
        lda.m16122h(((Number) objM14900d).longValue());
        if (fa4.m11650l(resultLesson2.m8365c(), LessonStatus.GENERATE_TTS.getValue())) {
        }
        NetworkResponse networkResponse = (NetworkResponse) objM14900d;
        if (networkResponse instanceof NetworkResponse.Success) {
            resultLesson = (ResultLesson) ((NetworkResponse.Success) networkResponse).getData();
            lessonRepositoryImpl$generateTts$1.f15401a = resultLesson;
            lessonRepositoryImpl$generateTts$1.f15402b = i2;
            lessonRepositoryImpl$generateTts$1.f15405e = 2;
            objM14900d = abstractC1320h.mo7500z0(i2, lessonRepositoryImpl$generateTts$1);
            if (objM14900d != coroutineSingletons) {
                ResultLesson resultLesson4 = resultLesson;
                i3 = i2;
                resultLesson2 = resultLesson4;
                lessonEntity = (LessonEntity) objM14900d;
                if (lessonEntity != null) {
                    LessonEntity lessonEntityM7642a2 = LessonEntity.m7642a(lessonEntity, null, 0, 0, 0.0d, 0.0d, 0, false, null, resultLesson2.m8365c(), -1, -1, 4063231);
                    lessonRepositoryImpl$generateTts$1.f15401a = resultLesson2;
                    lessonRepositoryImpl$generateTts$1.f15402b = i3;
                    lessonRepositoryImpl$generateTts$1.f15405e = 3;
                    objM14900d = abstractC1320h.mo4095v0(lessonEntityM7642a2, lessonRepositoryImpl$generateTts$1);
                }
                if (fa4.m11650l(resultLesson2.m8365c(), LessonStatus.GENERATE_TTS.getValue())) {
                }
            }
            return coroutineSingletons;
        }
        if (!(networkResponse instanceof NetworkResponse.Error)) {
            gm5.m12750e();
            return null;
        }
        NetworkResponse.Error error = (NetworkResponse.Error) networkResponse;
        Integer code = error.getCode();
        String body = error.getBody();
        if (body == null) {
            body = "";
        }
        if (code != null && code.intValue() == 409) {
            return new xm5(xfaVar);
        }
        if (vk9.m23380c0(body, "wrong voice", true) || vk9.m23380c0(body, "invalid voice", true) || vk9.m23380c0(body, "voice not found", true)) {
            return new um5(d25.f34866a);
        }
        Throwable throwable = error.getThrowable();
        if (throwable != null) {
            throwable.printStackTrace();
        }
        return new um5(new i25(NetworkErrorType.UNKNOWN));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0097  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: B */
    public final Object m7244B(int i, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$getCachedLessonData$1 lessonRepositoryImpl$getCachedLessonData$1;
        LessonEntity lessonEntity;
        List list;
        Lesson lessonM22081a;
        Object objMo7484A0;
        List list2;
        Lesson lesson;
        if (continuationImpl instanceof LessonRepositoryImpl$getCachedLessonData$1) {
            lessonRepositoryImpl$getCachedLessonData$1 = (LessonRepositoryImpl$getCachedLessonData$1) continuationImpl;
            int i2 = lessonRepositoryImpl$getCachedLessonData$1.f15412g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$getCachedLessonData$1.f15412g = i2 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$getCachedLessonData$1 = new LessonRepositoryImpl$getCachedLessonData$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$getCachedLessonData$1 = new LessonRepositoryImpl$getCachedLessonData$1(this, continuationImpl);
        }
        Object objMo7486C0 = lessonRepositoryImpl$getCachedLessonData$1.f15410e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = lessonRepositoryImpl$getCachedLessonData$1.f15412g;
        AbstractC1320h abstractC1320h = this.f16498b;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objMo7486C0);
            lessonRepositoryImpl$getCachedLessonData$1.f15406a = i;
            lessonRepositoryImpl$getCachedLessonData$1.f15412g = 1;
            objMo7486C0 = abstractC1320h.mo7486C0(i, lessonRepositoryImpl$getCachedLessonData$1);
            if (objMo7486C0 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            i = lessonRepositoryImpl$getCachedLessonData$1.f15406a;
            AbstractC3193b.m15359b(objMo7486C0);
        } else {
            if (i3 == 2) {
                i = lessonRepositoryImpl$getCachedLessonData$1.f15406a;
                lessonEntity = lessonRepositoryImpl$getCachedLessonData$1.f15407b;
                AbstractC3193b.m15359b(objMo7486C0);
                list = (List) objMo7486C0;
                if (!list.isEmpty()) {
                    lessonM22081a = tid.m22081a(lessonEntity);
                    lessonRepositoryImpl$getCachedLessonData$1.f15407b = null;
                    lessonRepositoryImpl$getCachedLessonData$1.f15408c = lessonM22081a;
                    lessonRepositoryImpl$getCachedLessonData$1.f15409d = list;
                    lessonRepositoryImpl$getCachedLessonData$1.f15406a = i;
                    lessonRepositoryImpl$getCachedLessonData$1.f15412g = 3;
                    objMo7484A0 = abstractC1320h.mo7484A0(i, lessonRepositoryImpl$getCachedLessonData$1);
                    if (objMo7484A0 != coroutineSingletons) {
                        objMo7486C0 = objMo7484A0;
                        list2 = list;
                        lesson = lessonM22081a;
                    }
                    return coroutineSingletons;
                }
                return null;
            }
            if (i3 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list2 = lessonRepositoryImpl$getCachedLessonData$1.f15409d;
            lesson = lessonRepositoryImpl$getCachedLessonData$1.f15408c;
            AbstractC3193b.m15359b(objMo7486C0);
        }
        return new x45(lesson, list2, (LessonBookmark) objMo7486C0);
        lessonEntity = (LessonEntity) objMo7486C0;
        if (lessonEntity != null) {
            lessonRepositoryImpl$getCachedLessonData$1.f15407b = lessonEntity;
            lessonRepositoryImpl$getCachedLessonData$1.f15406a = i;
            lessonRepositoryImpl$getCachedLessonData$1.f15412g = 2;
            q05 q05Var = (q05) abstractC1320h;
            objMo7486C0 = AbstractC0758a.m2861d(new h05(i, q05Var, 5), q05Var.f57071K, lessonRepositoryImpl$getCachedLessonData$1, true, true);
            if (objMo7486C0 != coroutineSingletons) {
                list = (List) objMo7486C0;
                if (!list.isEmpty()) {
                    lessonM22081a = tid.m22081a(lessonEntity);
                    lessonRepositoryImpl$getCachedLessonData$1.f15407b = null;
                    lessonRepositoryImpl$getCachedLessonData$1.f15408c = lessonM22081a;
                    lessonRepositoryImpl$getCachedLessonData$1.f15409d = list;
                    lessonRepositoryImpl$getCachedLessonData$1.f15406a = i;
                    lessonRepositoryImpl$getCachedLessonData$1.f15412g = 3;
                    objMo7484A0 = abstractC1320h.mo7484A0(i, lessonRepositoryImpl$getCachedLessonData$1);
                    if (objMo7484A0 != coroutineSingletons) {
                        objMo7486C0 = objMo7484A0;
                        list2 = list;
                        lesson = lessonM22081a;
                        return new x45(lesson, list2, (LessonBookmark) objMo7486C0);
                    }
                }
            }
            return coroutineSingletons;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: C */
    public final Object m7245C(int i, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$getLessonInfo$1 lessonRepositoryImpl$getLessonInfo$1;
        if (continuationImpl instanceof LessonRepositoryImpl$getLessonInfo$1) {
            lessonRepositoryImpl$getLessonInfo$1 = (LessonRepositoryImpl$getLessonInfo$1) continuationImpl;
            int i2 = lessonRepositoryImpl$getLessonInfo$1.f15421c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$getLessonInfo$1.f15421c = i2 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$getLessonInfo$1 = new LessonRepositoryImpl$getLessonInfo$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$getLessonInfo$1 = new LessonRepositoryImpl$getLessonInfo$1(this, continuationImpl);
        }
        Object objM2861d = lessonRepositoryImpl$getLessonInfo$1.f15419a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = lessonRepositoryImpl$getLessonInfo$1.f15421c;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM2861d);
            lessonRepositoryImpl$getLessonInfo$1.f15421c = 1;
            q05 q05Var = (q05) this.f16498b;
            objM2861d = AbstractC0758a.m2861d(new h05(i, q05Var, 6), q05Var.f57071K, lessonRepositoryImpl$getLessonInfo$1, true, false);
            if (objM2861d == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM2861d);
        }
        LessonEntity lessonEntity = (LessonEntity) objM2861d;
        if (lessonEntity != null) {
            return AbstractC3423or.m18269n0(lessonEntity);
        }
        return null;
    }

    /* JADX INFO: renamed from: D */
    public final h25 m7246D(String str) {
        Object failure;
        String strM8357b;
        String strM8357b2;
        try {
            try {
                df4 df4Var = this.f16507k;
                df4Var.getClass();
                failure = (ResultErrorLessonProcessing) df4Var.m10321a(str, ResultErrorLessonProcessing.Companion.serializer());
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            ResultErrorLessonProcessing resultErrorLessonProcessing = (ResultErrorLessonProcessing) failure;
            if (resultErrorLessonProcessing != null && (((strM8357b2 = resultErrorLessonProcessing.m8357b()) == null || vk9.m23391n0(strM8357b2)) && fa4.m11650l(resultErrorLessonProcessing.m8356a(), "importFailed"))) {
                LessonProcessingStatus lessonProcessingStatus = LessonProcessingStatus.ERROR;
                lessonProcessingStatus.getClass();
                return new h25(lessonProcessingStatus);
            }
            if (resultErrorLessonProcessing == null || (strM8357b = resultErrorLessonProcessing.m8357b()) == null || !(!vk9.m23391n0(strM8357b)) || !fa4.m11650l(resultErrorLessonProcessing.m8356a(), "locked")) {
                return new h25(LessonProcessingStatus.ERROR);
            }
            String strM8357b3 = resultErrorLessonProcessing.m8357b();
            LessonProcessingStatus lessonProcessingStatus2 = LessonProcessingStatus.AI;
            if (fa4.m11650l(strM8357b3, lessonProcessingStatus2.getValue())) {
                return new h25(lessonProcessingStatus2);
            }
            LessonProcessingStatus lessonProcessingStatus3 = LessonProcessingStatus.TRANSCRIBE;
            if (fa4.m11650l(strM8357b3, lessonProcessingStatus3.getValue())) {
                return new h25(lessonProcessingStatus3);
            }
            LessonProcessingStatus lessonProcessingStatus4 = LessonProcessingStatus.IMPORT;
            if (fa4.m11650l(strM8357b3, lessonProcessingStatus4.getValue())) {
                return new h25(lessonProcessingStatus4);
            }
            LessonProcessingStatus lessonProcessingStatus5 = LessonProcessingStatus.TIMESTAMPS;
            if (fa4.m11650l(strM8357b3, lessonProcessingStatus5.getValue())) {
                return new h25(lessonProcessingStatus5);
            }
            LessonProcessingStatus lessonProcessingStatus6 = LessonProcessingStatus.AI_SPLITTING;
            if (fa4.m11650l(strM8357b3, lessonProcessingStatus6.getValue())) {
                return new h25(lessonProcessingStatus6);
            }
            LessonProcessingStatus lessonProcessingStatus7 = LessonProcessingStatus.DOWNLOAD_AUDIO;
            if (fa4.m11650l(strM8357b3, lessonProcessingStatus7.getValue())) {
                return new h25(lessonProcessingStatus7);
            }
            LessonProcessingStatus lessonProcessingStatus8 = LessonProcessingStatus.TRANSLATIONS;
            if (fa4.m11650l(strM8357b3, lessonProcessingStatus8.getValue())) {
                return new h25(lessonProcessingStatus8);
            }
            LessonProcessingStatus lessonProcessingStatus9 = LessonProcessingStatus.NORMALIZE;
            if (fa4.m11650l(strM8357b3, lessonProcessingStatus9.getValue())) {
                return new h25(lessonProcessingStatus9);
            }
            LessonProcessingStatus lessonProcessingStatus10 = LessonProcessingStatus.EDIT_TEXT;
            if (fa4.m11650l(strM8357b3, lessonProcessingStatus10.getValue())) {
                return new h25(lessonProcessingStatus10);
            }
            LessonProcessingStatus lessonProcessingStatus11 = LessonProcessingStatus.GENERATE_TTS;
            return fa4.m11650l(strM8357b3, lessonProcessingStatus11.getValue()) ? new h25(lessonProcessingStatus11) : new h25(LessonProcessingStatus.ERROR);
        } catch (Exception unused) {
            return new h25(LessonProcessingStatus.ERROR);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
    
        if (r12 == r1) goto L26;
     */
    /* JADX INFO: renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7247E(String str, String str2, String str3, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$importLesson$1 lessonRepositoryImpl$importLesson$1;
        ResultLesson resultLesson;
        if (continuationImpl instanceof LessonRepositoryImpl$importLesson$1) {
            lessonRepositoryImpl$importLesson$1 = (LessonRepositoryImpl$importLesson$1) continuationImpl;
            int i = lessonRepositoryImpl$importLesson$1.f15425d;
            if ((i & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$importLesson$1.f15425d = i - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$importLesson$1 = new LessonRepositoryImpl$importLesson$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$importLesson$1 = new LessonRepositoryImpl$importLesson$1(this, continuationImpl);
        }
        Object objM14906n = lessonRepositoryImpl$importLesson$1.f15423b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = lessonRepositoryImpl$importLesson$1.f15425d;
        AbstractC1320h abstractC1320h = this.f16498b;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM14906n);
            RequestLessonImport requestLessonImport = new RequestLessonImport();
            requestLessonImport.m8260i(str2);
            requestLessonImport.m8254c();
            requestLessonImport.m8256e();
            requestLessonImport.m8255d();
            requestLessonImport.m8252a(str3);
            lessonRepositoryImpl$importLesson$1.f15425d = 1;
            objM14906n = this.f16502f.m14906n(str, requestLessonImport, lessonRepositoryImpl$importLesson$1);
            if (objM14906n != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            AbstractC3193b.m15359b(objM14906n);
        } else if (i2 == 2) {
            resultLesson = lessonRepositoryImpl$importLesson$1.f15422a;
            AbstractC3193b.m15359b(objM14906n);
            int iM8364b = resultLesson.m8364b();
            lessonRepositoryImpl$importLesson$1.f15422a = null;
            lessonRepositoryImpl$importLesson$1.f15425d = 3;
            objM14906n = abstractC1320h.mo7486C0(iM8364b, lessonRepositoryImpl$importLesson$1);
        } else {
            if (i2 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM14906n);
        }
        LessonEntity lessonEntity = (LessonEntity) objM14906n;
        if (lessonEntity != null) {
            return tid.m22081a(lessonEntity);
        }
        return null;
        resultLesson = (ResultLesson) objM14906n;
        LessonEntity lessonEntityM11330b = esc.m11330b(resultLesson);
        lessonRepositoryImpl$importLesson$1.f15422a = resultLesson;
        lessonRepositoryImpl$importLesson$1.f15425d = 2;
        if (abstractC1320h.mo4095v0(lessonEntityM11330b, lessonRepositoryImpl$importLesson$1) != coroutineSingletons) {
            int iM8364b2 = resultLesson.m8364b();
            lessonRepositoryImpl$importLesson$1.f15422a = null;
            lessonRepositoryImpl$importLesson$1.f15425d = 3;
            objM14906n = abstractC1320h.mo7486C0(iM8364b2, lessonRepositoryImpl$importLesson$1);
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c8, code lost:
    
        if (r2 == r4) goto L37;
     */
    /* JADX INFO: renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7248F(String str, String str2, String str3, String str4, boolean z, int i, String str5, List list, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$importUserLesson$1 lessonRepositoryImpl$importUserLesson$1;
        boolean z2;
        int i2;
        ResultLesson resultLesson;
        if (continuationImpl instanceof LessonRepositoryImpl$importUserLesson$1) {
            lessonRepositoryImpl$importUserLesson$1 = (LessonRepositoryImpl$importUserLesson$1) continuationImpl;
            int i3 = lessonRepositoryImpl$importUserLesson$1.f15431f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$importUserLesson$1.f15431f = i3 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$importUserLesson$1 = new LessonRepositoryImpl$importUserLesson$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$importUserLesson$1 = new LessonRepositoryImpl$importUserLesson$1(this, continuationImpl);
        }
        Object objM14906n = lessonRepositoryImpl$importUserLesson$1.f15429d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = lessonRepositoryImpl$importUserLesson$1.f15431f;
        AbstractC1320h abstractC1320h = this.f16498b;
        if (i4 != 0) {
            if (i4 == 1) {
                i2 = lessonRepositoryImpl$importUserLesson$1.f15428c;
                z2 = lessonRepositoryImpl$importUserLesson$1.f15427b;
                AbstractC3193b.m15359b(objM14906n);
            } else if (i4 == 2) {
                i2 = lessonRepositoryImpl$importUserLesson$1.f15428c;
                z2 = lessonRepositoryImpl$importUserLesson$1.f15427b;
                resultLesson = lessonRepositoryImpl$importUserLesson$1.f15426a;
                AbstractC3193b.m15359b(objM14906n);
                int iM8364b = resultLesson.m8364b();
                lessonRepositoryImpl$importUserLesson$1.f15426a = null;
                lessonRepositoryImpl$importUserLesson$1.f15427b = z2;
                lessonRepositoryImpl$importUserLesson$1.f15428c = i2;
                lessonRepositoryImpl$importUserLesson$1.f15431f = 3;
                objM14906n = abstractC1320h.mo7486C0(iM8364b, lessonRepositoryImpl$importUserLesson$1);
            } else {
                if (i4 != 3) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM14906n);
            }
            LessonEntity lessonEntity = (LessonEntity) objM14906n;
            if (lessonEntity != null) {
                return tid.m22081a(lessonEntity);
            }
            return null;
        }
        AbstractC3193b.m15359b(objM14906n);
        RequestLessonImport requestLessonImport = new RequestLessonImport();
        if (z) {
            requestLessonImport.m8260i(str3);
        } else {
            requestLessonImport.m8258g(str5);
        }
        requestLessonImport.m8254c();
        requestLessonImport.m8256e();
        requestLessonImport.m8255d();
        if (vk9.m23391n0(str2)) {
            str2 = null;
        }
        requestLessonImport.m8259h(str2);
        requestLessonImport.m8253b(new Integer(i));
        requestLessonImport.m8252a(str4);
        List list2 = list;
        if (list2.isEmpty()) {
            list2 = null;
        }
        requestLessonImport.m8257f(list2);
        lessonRepositoryImpl$importUserLesson$1.f15427b = z;
        lessonRepositoryImpl$importUserLesson$1.f15428c = i;
        lessonRepositoryImpl$importUserLesson$1.f15431f = 1;
        objM14906n = this.f16502f.m14906n(str, requestLessonImport, lessonRepositoryImpl$importUserLesson$1);
        if (objM14906n != coroutineSingletons) {
            z2 = z;
            i2 = i;
        }
        return coroutineSingletons;
        resultLesson = (ResultLesson) objM14906n;
        LessonEntity lessonEntityM11330b = esc.m11330b(resultLesson);
        lessonRepositoryImpl$importUserLesson$1.f15426a = resultLesson;
        lessonRepositoryImpl$importUserLesson$1.f15427b = z2;
        lessonRepositoryImpl$importUserLesson$1.f15428c = i2;
        lessonRepositoryImpl$importUserLesson$1.f15431f = 2;
        if (abstractC1320h.mo4095v0(lessonEntityM11330b, lessonRepositoryImpl$importUserLesson$1) != coroutineSingletons) {
            int iM8364b2 = resultLesson.m8364b();
            lessonRepositoryImpl$importUserLesson$1.f15426a = null;
            lessonRepositoryImpl$importUserLesson$1.f15427b = z2;
            lessonRepositoryImpl$importUserLesson$1.f15428c = i2;
            lessonRepositoryImpl$importUserLesson$1.f15431f = 3;
            objM14906n = abstractC1320h.mo7486C0(iM8364b2, lessonRepositoryImpl$importUserLesson$1);
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0126, code lost:
    
        if (r3 == r4) goto L41;
     */
    /* JADX INFO: renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7249G(String str, String str2, String str3, String str4, byte[] bArr, int i, List list, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$importUserLessonFile$1 lessonRepositoryImpl$importUserLessonFile$1;
        int i2;
        Object objM14895H;
        ResultLesson resultLesson;
        if (continuationImpl instanceof LessonRepositoryImpl$importUserLessonFile$1) {
            lessonRepositoryImpl$importUserLessonFile$1 = (LessonRepositoryImpl$importUserLessonFile$1) continuationImpl;
            int i3 = lessonRepositoryImpl$importUserLessonFile$1.f15436e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$importUserLessonFile$1.f15436e = i3 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$importUserLessonFile$1 = new LessonRepositoryImpl$importUserLessonFile$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$importUserLessonFile$1 = new LessonRepositoryImpl$importUserLessonFile$1(this, continuationImpl);
        }
        LessonRepositoryImpl$importUserLessonFile$1 lessonRepositoryImpl$importUserLessonFile$2 = lessonRepositoryImpl$importUserLessonFile$1;
        Object objMo7486C0 = lessonRepositoryImpl$importUserLessonFile$2.f15434c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = lessonRepositoryImpl$importUserLessonFile$2.f15436e;
        AbstractC1320h abstractC1320h = this.f16498b;
        ResultLesson resultLesson2 = null;
        if (i4 == 0) {
            AbstractC3193b.m15359b(objMo7486C0);
            int i5 = z68.f70989a;
            int length = bArr.length;
            icb.m13765a(bArr.length, 0L, length);
            l56 l56VarM17007a = mqb.m17007a(f5d.m11562d(str3) ? "audio" : "file", str3, new y68(null, length, bArr));
            Regex regex = xv5.f68845e;
            y68 y68VarM13428a = hpc.m13428a("true", AbstractC3122is.m14103q("text/plain"));
            y68 y68VarM13428a2 = hpc.m13428a("App", AbstractC3122is.m14103q("text/plain"));
            y68 y68VarM13428a3 = hpc.m13428a("private", AbstractC3122is.m14103q("text/plain"));
            y68 y68VarM13428a4 = str2 != null ? hpc.m13428a(str2, AbstractC3122is.m14103q("text/plain")) : null;
            y68 y68VarM13428a5 = hpc.m13428a(str4, AbstractC3122is.m14103q("text/plain"));
            y68 y68VarM13428a6 = hpc.m13428a(String.valueOf(i), AbstractC3122is.m14103q("text/plain"));
            y68 y68VarM13428a7 = list != null ? hpc.m13428a(u91.m22596N0(list, null, null, null, null, 63), AbstractC3122is.m14103q("text/plain")) : null;
            i2 = i;
            lessonRepositoryImpl$importUserLessonFile$2.f15433b = i2;
            lessonRepositoryImpl$importUserLessonFile$2.f15436e = 1;
            objM14895H = this.f16502f.m14895H(str, l56VarM17007a, y68VarM13428a, y68VarM13428a2, y68VarM13428a3, y68VarM13428a4, y68VarM13428a5, y68VarM13428a6, null, null, y68VarM13428a7, lessonRepositoryImpl$importUserLessonFile$2);
            if (objM14895H != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i4 == 1) {
            int i6 = lessonRepositoryImpl$importUserLessonFile$2.f15433b;
            AbstractC3193b.m15359b(objMo7486C0);
            objM14895H = objMo7486C0;
            i2 = i6;
        } else if (i4 == 2) {
            int i7 = lessonRepositoryImpl$importUserLessonFile$2.f15433b;
            ResultLesson resultLesson3 = lessonRepositoryImpl$importUserLessonFile$2.f15432a;
            AbstractC3193b.m15359b(objMo7486C0);
            i2 = i7;
            resultLesson = resultLesson3;
            abstractC1320h = abstractC1320h;
            resultLesson2 = null;
            int iM8364b = resultLesson.m8364b();
            lessonRepositoryImpl$importUserLessonFile$2.f15432a = resultLesson2;
            lessonRepositoryImpl$importUserLessonFile$2.f15433b = i2;
            lessonRepositoryImpl$importUserLessonFile$2.f15436e = 3;
            objMo7486C0 = abstractC1320h.mo7486C0(iM8364b, lessonRepositoryImpl$importUserLessonFile$2);
        } else {
            if (i4 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objMo7486C0);
            resultLesson2 = null;
        }
        LessonEntity lessonEntity = (LessonEntity) objMo7486C0;
        return lessonEntity != null ? tid.m22081a(lessonEntity) : resultLesson2;
        resultLesson = (ResultLesson) objM14895H;
        LessonEntity lessonEntityM11330b = esc.m11330b(resultLesson);
        lessonRepositoryImpl$importUserLessonFile$2.f15432a = resultLesson;
        lessonRepositoryImpl$importUserLessonFile$2.f15433b = i2;
        lessonRepositoryImpl$importUserLessonFile$2.f15436e = 2;
        if (abstractC1320h.mo4095v0(lessonEntityM11330b, lessonRepositoryImpl$importUserLessonFile$2) != coroutineSingletons) {
            int iM8364b2 = resultLesson.m8364b();
            lessonRepositoryImpl$importUserLessonFile$2.f15432a = resultLesson2;
            lessonRepositoryImpl$importUserLessonFile$2.f15433b = i2;
            lessonRepositoryImpl$importUserLessonFile$2.f15436e = 3;
            objMo7486C0 = abstractC1320h.mo7486C0(iM8364b2, lessonRepositoryImpl$importUserLessonFile$2);
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Integer, java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [com.lingq.core.network.api.result.ResultLesson, java.lang.Integer, java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX INFO: renamed from: H */
    public final Object m7250H(String str, String str2, String str3, String str4, String str5, Integer num, List list, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$importYoutubeLesson$1 lessonRepositoryImpl$importYoutubeLesson$1;
        Integer num2;
        String str6;
        String str7;
        String str8;
        String str9;
        List list2;
        CoroutineSingletons coroutineSingletons;
        ?? r4;
        int i;
        int i2;
        Object objM14895H;
        LessonRepositoryImpl$importYoutubeLesson$1 lessonRepositoryImpl$importYoutubeLesson$2;
        String strValueOf;
        ResultLesson resultLesson;
        LessonEntity lessonEntityM11330b;
        ?? r5;
        ?? r6;
        LessonEntity lessonEntity;
        if (continuationImpl instanceof LessonRepositoryImpl$importYoutubeLesson$1) {
            lessonRepositoryImpl$importYoutubeLesson$1 = (LessonRepositoryImpl$importYoutubeLesson$1) continuationImpl;
            int i3 = lessonRepositoryImpl$importYoutubeLesson$1.f15446j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$importYoutubeLesson$1.f15446j = i3 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$importYoutubeLesson$1 = new LessonRepositoryImpl$importYoutubeLesson$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$importYoutubeLesson$1 = new LessonRepositoryImpl$importYoutubeLesson$1(this, continuationImpl);
        }
        Object objM7056d = lessonRepositoryImpl$importYoutubeLesson$1.f15444h;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = lessonRepositoryImpl$importYoutubeLesson$1.f15446j;
        AbstractC1320h abstractC1320h = this.f16498b;
        if (i4 != 0) {
            if (i4 == 1) {
                List list3 = lessonRepositoryImpl$importYoutubeLesson$1.f15442f;
                Integer num3 = lessonRepositoryImpl$importYoutubeLesson$1.f15441e;
                String str10 = lessonRepositoryImpl$importYoutubeLesson$1.f15440d;
                str9 = lessonRepositoryImpl$importYoutubeLesson$1.f15439c;
                str8 = lessonRepositoryImpl$importYoutubeLesson$1.f15438b;
                String str11 = lessonRepositoryImpl$importYoutubeLesson$1.f15437a;
                AbstractC3193b.m15359b(objM7056d);
                list2 = list3;
                str7 = str10;
                str6 = str11;
                num2 = num3;
            } else if (i4 == 2) {
                List list4 = lessonRepositoryImpl$importYoutubeLesson$1.f15442f;
                AbstractC3193b.m15359b(objM7056d);
                lessonRepositoryImpl$importYoutubeLesson$2 = lessonRepositoryImpl$importYoutubeLesson$1;
                coroutineSingletons = coroutineSingletons2;
                i = 4;
                r4 = 0;
                objM14895H = objM7056d;
                i2 = 3;
                resultLesson = (ResultLesson) objM14895H;
                lessonEntityM11330b = esc.m11330b(resultLesson);
                lessonRepositoryImpl$importYoutubeLesson$2.f15437a = r4;
                lessonRepositoryImpl$importYoutubeLesson$2.f15438b = r4;
                lessonRepositoryImpl$importYoutubeLesson$2.f15439c = r4;
                lessonRepositoryImpl$importYoutubeLesson$2.f15440d = r4;
                lessonRepositoryImpl$importYoutubeLesson$2.f15441e = r4;
                lessonRepositoryImpl$importYoutubeLesson$2.f15442f = r4;
                lessonRepositoryImpl$importYoutubeLesson$2.f15443g = resultLesson;
                lessonRepositoryImpl$importYoutubeLesson$2.f15446j = i2;
                r5 = r4;
                if (abstractC1320h.mo4095v0(lessonEntityM11330b, lessonRepositoryImpl$importYoutubeLesson$2) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                int iM8364b = resultLesson.m8364b();
                lessonRepositoryImpl$importYoutubeLesson$2.f15437a = r5;
                lessonRepositoryImpl$importYoutubeLesson$2.f15438b = r5;
                lessonRepositoryImpl$importYoutubeLesson$2.f15439c = r5;
                lessonRepositoryImpl$importYoutubeLesson$2.f15440d = r5;
                lessonRepositoryImpl$importYoutubeLesson$2.f15441e = r5;
                lessonRepositoryImpl$importYoutubeLesson$2.f15442f = r5;
                lessonRepositoryImpl$importYoutubeLesson$2.f15443g = r5;
                lessonRepositoryImpl$importYoutubeLesson$2.f15446j = i;
                objM7056d = abstractC1320h.mo7486C0(iM8364b, lessonRepositoryImpl$importYoutubeLesson$2);
                r6 = r5;
                if (objM7056d == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i4 == 3) {
                ResultLesson resultLesson2 = lessonRepositoryImpl$importYoutubeLesson$1.f15443g;
                List list5 = lessonRepositoryImpl$importYoutubeLesson$1.f15442f;
                AbstractC3193b.m15359b(objM7056d);
                resultLesson = resultLesson2;
                coroutineSingletons = coroutineSingletons2;
                lessonRepositoryImpl$importYoutubeLesson$2 = lessonRepositoryImpl$importYoutubeLesson$1;
                abstractC1320h = abstractC1320h;
                i = 4;
                r5 = 0;
                int iM8364b2 = resultLesson.m8364b();
                lessonRepositoryImpl$importYoutubeLesson$2.f15437a = r5;
                lessonRepositoryImpl$importYoutubeLesson$2.f15438b = r5;
                lessonRepositoryImpl$importYoutubeLesson$2.f15439c = r5;
                lessonRepositoryImpl$importYoutubeLesson$2.f15440d = r5;
                lessonRepositoryImpl$importYoutubeLesson$2.f15441e = r5;
                lessonRepositoryImpl$importYoutubeLesson$2.f15442f = r5;
                lessonRepositoryImpl$importYoutubeLesson$2.f15443g = r5;
                lessonRepositoryImpl$importYoutubeLesson$2.f15446j = i;
                objM7056d = abstractC1320h.mo7486C0(iM8364b2, lessonRepositoryImpl$importYoutubeLesson$2);
                r6 = r5;
                if (objM7056d == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i4 != 4) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                List list6 = lessonRepositoryImpl$importYoutubeLesson$1.f15442f;
                AbstractC3193b.m15359b(objM7056d);
                r6 = 0;
            }
            lessonEntity = (LessonEntity) objM7056d;
            if (lessonEntity != null) {
                return tid.m22081a(lessonEntity);
            }
            return r6;
        }
        AbstractC3193b.m15359b(objM7056d);
        C1266a c1266a = C1266a.f14422a;
        lessonRepositoryImpl$importYoutubeLesson$1.f15437a = str;
        lessonRepositoryImpl$importYoutubeLesson$1.f15438b = str2;
        lessonRepositoryImpl$importYoutubeLesson$1.f15439c = str3;
        lessonRepositoryImpl$importYoutubeLesson$1.f15440d = str5;
        num2 = num;
        lessonRepositoryImpl$importYoutubeLesson$1.f15441e = num2;
        lessonRepositoryImpl$importYoutubeLesson$1.f15442f = list;
        lessonRepositoryImpl$importYoutubeLesson$1.f15446j = 1;
        objM7056d = c1266a.m7056d(str3, str4, str, lessonRepositoryImpl$importYoutubeLesson$1);
        if (objM7056d == coroutineSingletons2) {
            return coroutineSingletons2;
        }
        str6 = str;
        str7 = str5;
        str8 = str2;
        str9 = str3;
        list2 = list;
        Triple triple = (Triple) objM7056d;
        if (triple == null) {
            return null;
        }
        String str12 = (String) triple.f47633a;
        String str13 = (String) triple.f47634b;
        YouTubeSubtitleFormat youTubeSubtitleFormat = (YouTubeSubtitleFormat) triple.f47635c;
        String strM17734i = AbstractC3393o1.m17734i("subs.", youTubeSubtitleFormat.getFormat());
        int i5 = z68.f70989a;
        Regex regex = xv5.f68845e;
        l56 l56VarM17007a = mqb.m17007a("file", strM17734i, hpc.m13428a(str12, AbstractC3122is.m14103q(youTubeSubtitleFormat.getContentType())));
        y68 y68VarM13428a = hpc.m13428a("true", AbstractC3122is.m14103q("text/plain"));
        y68 y68VarM13428a2 = hpc.m13428a("App", AbstractC3122is.m14103q("text/plain"));
        List list7 = list2;
        y68 y68VarM13428a3 = hpc.m13428a("private", AbstractC3122is.m14103q("text/plain"));
        y68 y68VarM13428a4 = hpc.m13428a(str13, AbstractC3122is.m14103q("text/plain"));
        y68 y68VarM13428a5 = hpc.m13428a(str8, AbstractC3122is.m14103q("text/plain"));
        y68 y68VarM13428a6 = hpc.m13428a(str9, AbstractC3122is.m14103q("text/plain"));
        y68 y68VarM13428a7 = str7 != null ? hpc.m13428a(str7, AbstractC3122is.m14103q("text/plain")) : null;
        y68 y68VarM13428a8 = (num2 == null || (strValueOf = String.valueOf(num2.intValue())) == null) ? null : hpc.m13428a(strValueOf, AbstractC3122is.m14103q("text/plain"));
        y68 y68VarM13428a9 = list7 != null ? hpc.m13428a(u91.m22596N0(list7, null, null, null, null, 63), AbstractC3122is.m14103q("text/plain")) : null;
        lessonRepositoryImpl$importYoutubeLesson$1.f15437a = null;
        lessonRepositoryImpl$importYoutubeLesson$1.f15438b = null;
        lessonRepositoryImpl$importYoutubeLesson$1.f15439c = null;
        lessonRepositoryImpl$importYoutubeLesson$1.f15440d = null;
        lessonRepositoryImpl$importYoutubeLesson$1.f15441e = null;
        lessonRepositoryImpl$importYoutubeLesson$1.f15442f = null;
        lessonRepositoryImpl$importYoutubeLesson$1.f15446j = 2;
        coroutineSingletons = coroutineSingletons2;
        LessonRepositoryImpl$importYoutubeLesson$1 lessonRepositoryImpl$importYoutubeLesson$3 = lessonRepositoryImpl$importYoutubeLesson$1;
        r4 = 0;
        i = 4;
        i2 = 3;
        objM14895H = this.f16502f.m14895H(str6, l56VarM17007a, y68VarM13428a, y68VarM13428a2, y68VarM13428a3, y68VarM13428a7, y68VarM13428a5, y68VarM13428a8, y68VarM13428a6, y68VarM13428a4, y68VarM13428a9, lessonRepositoryImpl$importYoutubeLesson$3);
        lessonRepositoryImpl$importYoutubeLesson$2 = lessonRepositoryImpl$importYoutubeLesson$3;
        if (objM14895H == coroutineSingletons) {
            return coroutineSingletons;
        }
        resultLesson = (ResultLesson) objM14895H;
        lessonEntityM11330b = esc.m11330b(resultLesson);
        lessonRepositoryImpl$importYoutubeLesson$2.f15437a = r4;
        lessonRepositoryImpl$importYoutubeLesson$2.f15438b = r4;
        lessonRepositoryImpl$importYoutubeLesson$2.f15439c = r4;
        lessonRepositoryImpl$importYoutubeLesson$2.f15440d = r4;
        lessonRepositoryImpl$importYoutubeLesson$2.f15441e = r4;
        lessonRepositoryImpl$importYoutubeLesson$2.f15442f = r4;
        lessonRepositoryImpl$importYoutubeLesson$2.f15443g = resultLesson;
        lessonRepositoryImpl$importYoutubeLesson$2.f15446j = i2;
        r5 = r4;
        if (abstractC1320h.mo4095v0(lessonEntityM11330b, lessonRepositoryImpl$importYoutubeLesson$2) == coroutineSingletons) {
            return coroutineSingletons;
        }
        int iM8364b3 = resultLesson.m8364b();
        lessonRepositoryImpl$importYoutubeLesson$2.f15437a = r5;
        lessonRepositoryImpl$importYoutubeLesson$2.f15438b = r5;
        lessonRepositoryImpl$importYoutubeLesson$2.f15439c = r5;
        lessonRepositoryImpl$importYoutubeLesson$2.f15440d = r5;
        lessonRepositoryImpl$importYoutubeLesson$2.f15441e = r5;
        lessonRepositoryImpl$importYoutubeLesson$2.f15442f = r5;
        lessonRepositoryImpl$importYoutubeLesson$2.f15443g = r5;
        lessonRepositoryImpl$importYoutubeLesson$2.f15446j = i;
        objM7056d = abstractC1320h.mo7486C0(iM8364b3, lessonRepositoryImpl$importYoutubeLesson$2);
        r6 = r5;
        if (objM7056d == coroutineSingletons) {
            return coroutineSingletons;
        }
        lessonEntity = (LessonEntity) objM7056d;
        if (lessonEntity != null) {
            return tid.m22081a(lessonEntity);
        }
        return r6;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0246  */
    /* JADX WARN: Code duplicated, block: B:103:0x0249  */
    /* JADX WARN: Code duplicated, block: B:105:0x024f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0278  */
    /* JADX WARN: Code duplicated, block: B:114:0x0279  */
    /* JADX WARN: Code duplicated, block: B:117:0x027e A[Catch: Exception -> 0x02ac, TryCatch #1 {Exception -> 0x02ac, blocks: (B:111:0x0274, B:115:0x027a, B:117:0x027e, B:119:0x0288, B:121:0x028e, B:124:0x0297, B:126:0x02a6, B:110:0x026e, B:107:0x0259), top: B:142:0x024d, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:134:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:136:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:150:0x0259 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x009b A[PHI: r0 r1 r3 r4 r5 r13
      0x009b: PHI (r0v37 int) = (r0v34 int), (r0v47 int) binds: [B:56:0x0157, B:32:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r1v25 java.lang.Object) = (r1v20 java.lang.Object), (r1v1 java.lang.Object) binds: [B:56:0x0157, B:32:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r3v20 com.lingq.core.database.entity.LessonEntity) = (r3v16 com.lingq.core.database.entity.LessonEntity), (r3v23 com.lingq.core.database.entity.LessonEntity) binds: [B:56:0x0157, B:32:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r4v14 com.lingq.core.domain.model.lesson.LessonBookmark) = (r4v12 com.lingq.core.domain.model.lesson.LessonBookmark), (r4v18 com.lingq.core.domain.model.lesson.LessonBookmark) binds: [B:56:0x0157, B:32:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r5v12 java.util.List) = (r5v9 java.util.List), (r5v18 java.util.List) binds: [B:56:0x0157, B:32:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r13v5 java.lang.String) = (r13v3 java.lang.String), (r13v7 java.lang.String) binds: [B:56:0x0157, B:32:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:47:0x0119  */
    /* JADX WARN: Code duplicated, block: B:50:0x0122  */
    /* JADX WARN: Code duplicated, block: B:55:0x013c A[Catch: Exception -> 0x0075, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x0075, blocks: (B:24:0x006f, B:29:0x0085, B:32:0x0098, B:55:0x013c), top: B:147:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:60:0x017f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0180 A[Catch: Exception -> 0x0213, TRY_LEAVE, TryCatch #5 {Exception -> 0x0213, blocks: (B:58:0x015b, B:61:0x0180), top: B:148:0x015b }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0185  */
    /* JADX WARN: Code duplicated, block: B:67:0x019e  */
    /* JADX WARN: Code duplicated, block: B:68:0x019f A[Catch: Exception -> 0x020b, PHI: r0 r1 r4 r5 r15
      0x019f: PHI (r0v50 int) = (r0v48 int), (r0v51 int) binds: [B:66:0x019c, B:25:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x019f: PHI (r1v32 java.lang.Object) = (r1v31 java.lang.Object), (r1v1 java.lang.Object) binds: [B:66:0x019c, B:25:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x019f: PHI (r4v21 com.lingq.core.domain.model.lesson.LessonBookmark) = (r4v43 com.lingq.core.domain.model.lesson.LessonBookmark), (r4v44 com.lingq.core.domain.model.lesson.LessonBookmark) binds: [B:66:0x019c, B:25:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x019f: PHI (r5v22 java.util.List) = (r5v43 java.util.List), (r5v44 java.util.List) binds: [B:66:0x019c, B:25:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x019f: PHI (r15v6 com.lingq.core.database.entity.LessonEntity) = (r15v4 com.lingq.core.database.entity.LessonEntity), (r15v7 com.lingq.core.database.entity.LessonEntity) binds: [B:66:0x019c, B:25:0x0072] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {Exception -> 0x020b, blocks: (B:72:0x01ca, B:68:0x019f, B:65:0x0188), top: B:143:0x0188 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:75:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:78:0x01f3 A[Catch: Exception -> 0x0049, TryCatch #3 {Exception -> 0x0049, blocks: (B:14:0x0044, B:76:0x01ef, B:78:0x01f3, B:80:0x01fc), top: B:145:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:90:0x021a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0236  */
    /* JADX WARN: Code duplicated, block: B:98:0x023d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.lingq.core.domain.model.lesson.LessonBookmark] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.lingq.core.database.entity.LessonEntity] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX INFO: renamed from: I */
    public final Object m7251I(int i, String str, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$loadLesson$1 lessonRepositoryImpl$loadLesson$1;
        int i2;
        Exception exc;
        ?? r6;
        ?? r5;
        ?? r4;
        HttpException httpException;
        i88 i88Var;
        String strM16682n;
        Object failure;
        ResultErrorLesson resultErrorLesson;
        i88 i88Var2;
        m88 m88Var;
        String str2;
        Object objMo7486C0;
        LessonEntity lessonEntity;
        Object objM2861d;
        String str3;
        List list;
        Object objMo7484A0;
        List list2;
        String str4;
        LessonBookmark lessonBookmark;
        LessonBookmark lessonBookmark2;
        LessonEntity lessonEntity2;
        List list3;
        int i3;
        LessonBookmark lessonBookmark3;
        List list4;
        Object objM2849b;
        int i4;
        LessonBookmark lessonBookmark4;
        List list5;
        List list6;
        LessonBookmark lessonBookmark5;
        LessonEntity lessonEntity3;
        Object objM2861d2;
        LessonEntity lessonEntity4;
        List list7;
        Object objMo7484A1;
        List list8;
        LessonEntity lessonEntity5;
        List list9;
        LessonBookmark lessonBookmark6;
        LessonBookmark lessonBookmark7;
        int i5;
        int i6 = i;
        if (continuationImpl instanceof LessonRepositoryImpl$loadLesson$1) {
            lessonRepositoryImpl$loadLesson$1 = (LessonRepositoryImpl$loadLesson$1) continuationImpl;
            i5 = lessonRepositoryImpl$loadLesson$1.f15462j;
            r5 = -2147483648;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                int i7 = i5 - Integer.MIN_VALUE;
                lessonRepositoryImpl$loadLesson$1.f15462j = i7;
                i2 = i7;
            } else {
                lessonRepositoryImpl$loadLesson$1 = new LessonRepositoryImpl$loadLesson$1(this, continuationImpl);
                i2 = i5;
            }
        } else {
            lessonRepositoryImpl$loadLesson$1 = new LessonRepositoryImpl$loadLesson$1(this, continuationImpl);
            i2 = i5;
        }
        LessonRepositoryImpl$loadLesson$1 lessonRepositoryImpl$loadLesson$2 = lessonRepositoryImpl$loadLesson$1;
        Object objM14908p = lessonRepositoryImpl$loadLesson$2.f15460h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r3 = lessonRepositoryImpl$loadLesson$2.f15462j;
        int i8 = 5;
        g25 g25Var = g25.f40076a;
        AbstractC1320h abstractC1320h = this.f16498b;
        Object obj = null;
        try {
            switch (r3) {
                case 0:
                    AbstractC3193b.m15359b(objM14908p);
                    str2 = str;
                    lessonRepositoryImpl$loadLesson$2.f15453a = str2;
                    lessonRepositoryImpl$loadLesson$2.f15459g = i6;
                    lessonRepositoryImpl$loadLesson$2.f15462j = 1;
                    objMo7486C0 = abstractC1320h.mo7486C0(i6, lessonRepositoryImpl$loadLesson$2);
                    if (objMo7486C0 != coroutineSingletons) {
                        lessonEntity = (LessonEntity) objMo7486C0;
                        lessonRepositoryImpl$loadLesson$2.f15453a = str2;
                        lessonRepositoryImpl$loadLesson$2.f15454b = lessonEntity;
                        lessonRepositoryImpl$loadLesson$2.f15459g = i6;
                        lessonRepositoryImpl$loadLesson$2.f15462j = 2;
                        q05 q05Var = (q05) abstractC1320h;
                        objM2861d = AbstractC0758a.m2861d(new h05(i6, q05Var, i8), q05Var.f57071K, lessonRepositoryImpl$loadLesson$2, true, true);
                        if (objM2861d != coroutineSingletons) {
                            str3 = str2;
                            objM14908p = objM2861d;
                            list = (List) objM14908p;
                            lessonRepositoryImpl$loadLesson$2.f15453a = str3;
                            lessonRepositoryImpl$loadLesson$2.f15454b = lessonEntity;
                            lessonRepositoryImpl$loadLesson$2.f15455c = list;
                            lessonRepositoryImpl$loadLesson$2.f15459g = i6;
                            lessonRepositoryImpl$loadLesson$2.f15462j = 3;
                            objMo7484A0 = abstractC1320h.mo7484A0(i6, lessonRepositoryImpl$loadLesson$2);
                            if (objMo7484A0 != coroutineSingletons) {
                                list2 = list;
                                objM14908p = objMo7484A0;
                                str4 = str3;
                                lessonBookmark = (LessonBookmark) objM14908p;
                                if (lessonEntity == null && !list2.isEmpty()) {
                                    return new xm5(new x45(tid.m22081a(lessonEntity), list2, lessonBookmark));
                                }
                                if (lessonEntity == null) {
                                    k65 k65Var = this.f16502f;
                                    Integer num = new Integer(i6);
                                    lessonRepositoryImpl$loadLesson$2.f15453a = str4;
                                    lessonRepositoryImpl$loadLesson$2.f15454b = lessonEntity;
                                    lessonRepositoryImpl$loadLesson$2.f15455c = list2;
                                    lessonRepositoryImpl$loadLesson$2.f15456d = lessonBookmark;
                                    lessonRepositoryImpl$loadLesson$2.f15459g = i6;
                                    lessonRepositoryImpl$loadLesson$2.f15462j = 4;
                                    objM14908p = k65Var.m14908p(str4, num, false, lessonRepositoryImpl$loadLesson$2);
                                    if (objM14908p != coroutineSingletons) {
                                        String str5 = str4;
                                        lessonBookmark2 = lessonBookmark;
                                        lessonEntity2 = lessonEntity;
                                        list3 = list2;
                                        i3 = i6;
                                        try {
                                            lessonRepositoryImpl$loadLesson$2.f15453a = null;
                                            lessonRepositoryImpl$loadLesson$2.f15454b = lessonEntity2;
                                            lessonRepositoryImpl$loadLesson$2.f15455c = list3;
                                            lessonRepositoryImpl$loadLesson$2.f15456d = lessonBookmark2;
                                            lessonRepositoryImpl$loadLesson$2.f15459g = i3;
                                            lessonRepositoryImpl$loadLesson$2.f15462j = 5;
                                            objM2849b = AbstractC0747e.m2849b(this.f16497a, new LessonRepositoryImpl$storeLessonData$2((ResultLesson) objM14908p, this, i3, str5, null), lessonRepositoryImpl$loadLesson$2);
                                            if (objM2849b != coroutineSingletons) {
                                                objM2849b = xfa.f68157a;
                                                break;
                                            }
                                            if (objM2849b != coroutineSingletons) {
                                                i4 = i3;
                                                lessonBookmark4 = lessonBookmark2;
                                                list5 = list3;
                                                try {
                                                    lessonRepositoryImpl$loadLesson$2.f15453a = null;
                                                    lessonRepositoryImpl$loadLesson$2.f15454b = lessonEntity2;
                                                    lessonRepositoryImpl$loadLesson$2.f15455c = list5;
                                                    lessonRepositoryImpl$loadLesson$2.f15456d = lessonBookmark4;
                                                    lessonRepositoryImpl$loadLesson$2.f15459g = i4;
                                                    lessonRepositoryImpl$loadLesson$2.f15462j = 6;
                                                    objM14908p = abstractC1320h.mo7486C0(i4, lessonRepositoryImpl$loadLesson$2);
                                                    lessonBookmark5 = lessonBookmark4;
                                                    list6 = list5;
                                                    if (objM14908p == coroutineSingletons) {
                                                        lessonEntity3 = (LessonEntity) objM14908p;
                                                        lessonRepositoryImpl$loadLesson$2.f15453a = null;
                                                        lessonRepositoryImpl$loadLesson$2.f15454b = lessonEntity2;
                                                        lessonRepositoryImpl$loadLesson$2.f15455c = list6;
                                                        lessonRepositoryImpl$loadLesson$2.f15456d = lessonBookmark5;
                                                        lessonRepositoryImpl$loadLesson$2.f15457e = lessonEntity3;
                                                        lessonRepositoryImpl$loadLesson$2.f15459g = i4;
                                                        lessonRepositoryImpl$loadLesson$2.f15462j = 7;
                                                        q05 q05Var2 = (q05) abstractC1320h;
                                                        objM2861d2 = AbstractC0758a.m2861d(new h05(i4, q05Var2, i8), q05Var2.f57071K, lessonRepositoryImpl$loadLesson$2, true, true);
                                                        if (objM2861d2 != coroutineSingletons) {
                                                            lessonEntity4 = lessonEntity3;
                                                            objM14908p = objM2861d2;
                                                            lessonBookmark4 = lessonBookmark5;
                                                            list5 = list6;
                                                            list7 = (List) objM14908p;
                                                            lessonRepositoryImpl$loadLesson$2.f15453a = null;
                                                            lessonRepositoryImpl$loadLesson$2.f15454b = lessonEntity2;
                                                            lessonRepositoryImpl$loadLesson$2.f15455c = list5;
                                                            lessonRepositoryImpl$loadLesson$2.f15456d = lessonBookmark4;
                                                            lessonRepositoryImpl$loadLesson$2.f15457e = lessonEntity4;
                                                            lessonRepositoryImpl$loadLesson$2.f15458f = list7;
                                                            lessonRepositoryImpl$loadLesson$2.f15459g = i4;
                                                            lessonRepositoryImpl$loadLesson$2.f15462j = 8;
                                                            objMo7484A1 = abstractC1320h.mo7484A0(i4, lessonRepositoryImpl$loadLesson$2);
                                                            if (objMo7484A1 != coroutineSingletons) {
                                                                objM14908p = objMo7484A1;
                                                                list8 = list7;
                                                                lessonEntity5 = lessonEntity2;
                                                                lessonBookmark6 = lessonBookmark4;
                                                                list9 = list5;
                                                                lessonBookmark7 = (LessonBookmark) objM14908p;
                                                                if (lessonEntity4 != null && !list8.isEmpty()) {
                                                                    return new xm5(new x45(tid.m22081a(lessonEntity4), list8, lessonBookmark7));
                                                                }
                                                            }
                                                        }
                                                    }
                                                } catch (Exception e) {
                                                    exc = e;
                                                    lessonBookmark3 = lessonBookmark4;
                                                    list4 = list5;
                                                    r6 = lessonEntity2;
                                                    r4 = lessonBookmark3;
                                                    r5 = list4;
                                                    exc.printStackTrace();
                                                    if (r6 == 0) {
                                                    }
                                                    if (exc instanceof HttpException) {
                                                        httpException = (HttpException) exc;
                                                        i88Var = httpException.f59170b;
                                                        if (i88Var != null) {
                                                            strM16682n = null;
                                                        } else {
                                                            strM16682n = null;
                                                        }
                                                        if (strM16682n != null) {
                                                            try {
                                                                if (httpException.f59169a == 400) {
                                                                    return new um5(m7246D(strM16682n));
                                                                }
                                                                try {
                                                                    df4 df4Var = this.f16507k;
                                                                    df4Var.getClass();
                                                                    failure = (ResultErrorLesson) df4Var.m10321a(strM16682n, ResultErrorLesson.Companion.serializer());
                                                                    break;
                                                                } catch (Throwable th) {
                                                                    failure = new Result.Failure(th);
                                                                }
                                                                if (failure instanceof Result.Failure) {
                                                                    obj = failure;
                                                                }
                                                                resultErrorLesson = (ResultErrorLesson) obj;
                                                                if (resultErrorLesson != null) {
                                                                    return new um5(new f25(resultErrorLesson.m8355a()));
                                                                }
                                                                return new um5(g25Var);
                                                            } catch (Exception unused) {
                                                                return new um5(g25Var);
                                                            }
                                                        }
                                                    }
                                                    if (exc instanceof IOException) {
                                                        return new um5(new i25(NetworkErrorType.TIMEOUT));
                                                    }
                                                    if (exc instanceof CancellationException) {
                                                        return new um5(e25.f36618a);
                                                    }
                                                    break;
                                                }
                                            }
                                        } catch (Exception e2) {
                                            exc = e2;
                                            lessonBookmark3 = lessonBookmark2;
                                            list4 = list3;
                                            r6 = lessonEntity2;
                                            r4 = lessonBookmark3;
                                            r5 = list4;
                                            exc.printStackTrace();
                                            if (r6 == 0) {
                                            }
                                            if (exc instanceof HttpException) {
                                                httpException = (HttpException) exc;
                                                i88Var = httpException.f59170b;
                                                if (i88Var != null) {
                                                    strM16682n = null;
                                                } else {
                                                    strM16682n = null;
                                                }
                                                if (strM16682n != null) {
                                                    if (httpException.f59169a == 400) {
                                                        return new um5(m7246D(strM16682n));
                                                    }
                                                    df4 df4Var2 = this.f16507k;
                                                    df4Var2.getClass();
                                                    failure = (ResultErrorLesson) df4Var2.m10321a(strM16682n, ResultErrorLesson.Companion.serializer());
                                                    if (failure instanceof Result.Failure) {
                                                        obj = failure;
                                                    }
                                                    resultErrorLesson = (ResultErrorLesson) obj;
                                                    if (resultErrorLesson != null) {
                                                        return new um5(new f25(resultErrorLesson.m8355a()));
                                                    }
                                                    return new um5(g25Var);
                                                }
                                            }
                                            if (exc instanceof IOException) {
                                                return new um5(new i25(NetworkErrorType.TIMEOUT));
                                            }
                                            if (exc instanceof CancellationException) {
                                                return new um5(e25.f36618a);
                                            }
                                            break;
                                        }
                                    }
                                }
                                return new um5(g25Var);
                            }
                        }
                    }
                    return coroutineSingletons;
                case 1:
                    i6 = lessonRepositoryImpl$loadLesson$2.f15459g;
                    String str6 = lessonRepositoryImpl$loadLesson$2.f15453a;
                    AbstractC3193b.m15359b(objM14908p);
                    objMo7486C0 = objM14908p;
                    str2 = str6;
                    lessonEntity = (LessonEntity) objMo7486C0;
                    lessonRepositoryImpl$loadLesson$2.f15453a = str2;
                    lessonRepositoryImpl$loadLesson$2.f15454b = lessonEntity;
                    lessonRepositoryImpl$loadLesson$2.f15459g = i6;
                    lessonRepositoryImpl$loadLesson$2.f15462j = 2;
                    q05 q05Var3 = (q05) abstractC1320h;
                    objM2861d = AbstractC0758a.m2861d(new h05(i6, q05Var3, i8), q05Var3.f57071K, lessonRepositoryImpl$loadLesson$2, true, true);
                    if (objM2861d != coroutineSingletons) {
                        str3 = str2;
                        objM14908p = objM2861d;
                        list = (List) objM14908p;
                        lessonRepositoryImpl$loadLesson$2.f15453a = str3;
                        lessonRepositoryImpl$loadLesson$2.f15454b = lessonEntity;
                        lessonRepositoryImpl$loadLesson$2.f15455c = list;
                        lessonRepositoryImpl$loadLesson$2.f15459g = i6;
                        lessonRepositoryImpl$loadLesson$2.f15462j = 3;
                        objMo7484A0 = abstractC1320h.mo7484A0(i6, lessonRepositoryImpl$loadLesson$2);
                        if (objMo7484A0 != coroutineSingletons) {
                            list2 = list;
                            objM14908p = objMo7484A0;
                            str4 = str3;
                            lessonBookmark = (LessonBookmark) objM14908p;
                            if (lessonEntity == null) {
                                break;
                            }
                            if (lessonEntity == null) {
                                k65 k65Var2 = this.f16502f;
                                Integer num2 = new Integer(i6);
                                lessonRepositoryImpl$loadLesson$2.f15453a = str4;
                                lessonRepositoryImpl$loadLesson$2.f15454b = lessonEntity;
                                lessonRepositoryImpl$loadLesson$2.f15455c = list2;
                                lessonRepositoryImpl$loadLesson$2.f15456d = lessonBookmark;
                                lessonRepositoryImpl$loadLesson$2.f15459g = i6;
                                lessonRepositoryImpl$loadLesson$2.f15462j = 4;
                                objM14908p = k65Var2.m14908p(str4, num2, false, lessonRepositoryImpl$loadLesson$2);
                                if (objM14908p != coroutineSingletons) {
                                    String str7 = str4;
                                    lessonBookmark2 = lessonBookmark;
                                    lessonEntity2 = lessonEntity;
                                    list3 = list2;
                                    i3 = i6;
                                    lessonRepositoryImpl$loadLesson$2.f15453a = null;
                                    lessonRepositoryImpl$loadLesson$2.f15454b = lessonEntity2;
                                    lessonRepositoryImpl$loadLesson$2.f15455c = list3;
                                    lessonRepositoryImpl$loadLesson$2.f15456d = lessonBookmark2;
                                    lessonRepositoryImpl$loadLesson$2.f15459g = i3;
                                    lessonRepositoryImpl$loadLesson$2.f15462j = 5;
                                    objM2849b = AbstractC0747e.m2849b(this.f16497a, new LessonRepositoryImpl$storeLessonData$2((ResultLesson) objM14908p, this, i3, str7, null), lessonRepositoryImpl$loadLesson$2);
                                    if (objM2849b != coroutineSingletons) {
                                        objM2849b = xfa.f68157a;
                                        break;
                                    }
                                    if (objM2849b != coroutineSingletons) {
                                        i4 = i3;
                                        lessonBookmark4 = lessonBookmark2;
                                        list5 = list3;
                                        lessonRepositoryImpl$loadLesson$2.f15453a = null;
                                        lessonRepositoryImpl$loadLesson$2.f15454b = lessonEntity2;
                                        lessonRepositoryImpl$loadLesson$2.f15455c = list5;
                                        lessonRepositoryImpl$loadLesson$2.f15456d = lessonBookmark4;
                                        lessonRepositoryImpl$loadLesson$2.f15459g = i4;
                                        lessonRepositoryImpl$loadLesson$2.f15462j = 6;
                                        objM14908p = abstractC1320h.mo7486C0(i4, lessonRepositoryImpl$loadLesson$2);
                                        lessonBookmark5 = lessonBookmark4;
                                        list6 = list5;
                                        if (objM14908p == coroutineSingletons) {
                                            lessonEntity3 = (LessonEntity) objM14908p;
                                            lessonRepositoryImpl$loadLesson$2.f15453a = null;
                                            lessonRepositoryImpl$loadLesson$2.f15454b = lessonEntity2;
                                            lessonRepositoryImpl$loadLesson$2.f15455c = list6;
                                            lessonRepositoryImpl$loadLesson$2.f15456d = lessonBookmark5;
                                            lessonRepositoryImpl$loadLesson$2.f15457e = lessonEntity3;
                                            lessonRepositoryImpl$loadLesson$2.f15459g = i4;
                                            lessonRepositoryImpl$loadLesson$2.f15462j = 7;
                                            q05 q05Var4 = (q05) abstractC1320h;
                                            objM2861d2 = AbstractC0758a.m2861d(new h05(i4, q05Var4, i8), q05Var4.f57071K, lessonRepositoryImpl$loadLesson$2, true, true);
                                            if (objM2861d2 != coroutineSingletons) {
                                                lessonEntity4 = lessonEntity3;
                                                objM14908p = objM2861d2;
                                                lessonBookmark4 = lessonBookmark5;
                                                list5 = list6;
                                                list7 = (List) objM14908p;
                                                lessonRepositoryImpl$loadLesson$2.f15453a = null;
                                                lessonRepositoryImpl$loadLesson$2.f15454b = lessonEntity2;
                                                lessonRepositoryImpl$loadLesson$2.f15455c = list5;
                                                lessonRepositoryImpl$loadLesson$2.f15456d = lessonBookmark4;
                                                lessonRepositoryImpl$loadLesson$2.f15457e = lessonEntity4;
                                                lessonRepositoryImpl$loadLesson$2.f15458f = list7;
                                                lessonRepositoryImpl$loadLesson$2.f15459g = i4;
                                                lessonRepositoryImpl$loadLesson$2.f15462j = 8;
                                                objMo7484A1 = abstractC1320h.mo7484A0(i4, lessonRepositoryImpl$loadLesson$2);
                                                if (objMo7484A1 != coroutineSingletons) {
                                                    objM14908p = objMo7484A1;
                                                    list8 = list7;
                                                    lessonEntity5 = lessonEntity2;
                                                    lessonBookmark6 = lessonBookmark4;
                                                    list9 = list5;
                                                    lessonBookmark7 = (LessonBookmark) objM14908p;
                                                    if (lessonEntity4 != null) {
                                                        return new xm5(new x45(tid.m22081a(lessonEntity4), list8, lessonBookmark7));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return new um5(g25Var);
                        }
                    }
                    return coroutineSingletons;
                case 2:
                    i6 = lessonRepositoryImpl$loadLesson$2.f15459g;
                    lessonEntity = lessonRepositoryImpl$loadLesson$2.f15454b;
                    str3 = lessonRepositoryImpl$loadLesson$2.f15453a;
                    AbstractC3193b.m15359b(objM14908p);
                    list = (List) objM14908p;
                    lessonRepositoryImpl$loadLesson$2.f15453a = str3;
                    lessonRepositoryImpl$loadLesson$2.f15454b = lessonEntity;
                    lessonRepositoryImpl$loadLesson$2.f15455c = list;
                    lessonRepositoryImpl$loadLesson$2.f15459g = i6;
                    lessonRepositoryImpl$loadLesson$2.f15462j = 3;
                    objMo7484A0 = abstractC1320h.mo7484A0(i6, lessonRepositoryImpl$loadLesson$2);
                    if (objMo7484A0 != coroutineSingletons) {
                        list2 = list;
                        objM14908p = objMo7484A0;
                        str4 = str3;
                        lessonBookmark = (LessonBookmark) objM14908p;
                        if (lessonEntity == null) {
                            break;
                        }
                        if (lessonEntity == null) {
                            k65 k65Var3 = this.f16502f;
                            Integer num3 = new Integer(i6);
                            lessonRepositoryImpl$loadLesson$2.f15453a = str4;
                            lessonRepositoryImpl$loadLesson$2.f15454b = lessonEntity;
                            lessonRepositoryImpl$loadLesson$2.f15455c = list2;
                            lessonRepositoryImpl$loadLesson$2.f15456d = lessonBookmark;
                            lessonRepositoryImpl$loadLesson$2.f15459g = i6;
                            lessonRepositoryImpl$loadLesson$2.f15462j = 4;
                            objM14908p = k65Var3.m14908p(str4, num3, false, lessonRepositoryImpl$loadLesson$2);
                            if (objM14908p != coroutineSingletons) {
                                String str8 = str4;
                                lessonBookmark2 = lessonBookmark;
                                lessonEntity2 = lessonEntity;
                                list3 = list2;
                                i3 = i6;
                                lessonRepositoryImpl$loadLesson$2.f15453a = null;
                                lessonRepositoryImpl$loadLesson$2.f15454b = lessonEntity2;
                                lessonRepositoryImpl$loadLesson$2.f15455c = list3;
                                lessonRepositoryImpl$loadLesson$2.f15456d = lessonBookmark2;
                                lessonRepositoryImpl$loadLesson$2.f15459g = i3;
                                lessonRepositoryImpl$loadLesson$2.f15462j = 5;
                                objM2849b = AbstractC0747e.m2849b(this.f16497a, new LessonRepositoryImpl$storeLessonData$2((ResultLesson) objM14908p, this, i3, str8, null), lessonRepositoryImpl$loadLesson$2);
                                if (objM2849b != coroutineSingletons) {
                                    objM2849b = xfa.f68157a;
                                    break;
                                }
                                if (objM2849b != coroutineSingletons) {
                                    i4 = i3;
                                    lessonBookmark4 = lessonBookmark2;
                                    list5 = list3;
                                    lessonRepositoryImpl$loadLesson$2.f15453a = null;
                                    lessonRepositoryImpl$loadLesson$2.f15454b = lessonEntity2;
                                    lessonRepositoryImpl$loadLesson$2.f15455c = list5;
                                    lessonRepositoryImpl$loadLesson$2.f15456d = lessonBookmark4;
                                    lessonRepositoryImpl$loadLesson$2.f15459g = i4;
                                    lessonRepositoryImpl$loadLesson$2.f15462j = 6;
                                    objM14908p = abstractC1320h.mo7486C0(i4, lessonRepositoryImpl$loadLesson$2);
                                    lessonBookmark5 = lessonBookmark4;
                                    list6 = list5;
                                    if (objM14908p == coroutineSingletons) {
                                        lessonEntity3 = (LessonEntity) objM14908p;
                                        lessonRepositoryImpl$loadLesson$2.f15453a = null;
                                        lessonRepositoryImpl$loadLesson$2.f15454b = lessonEntity2;
                                        lessonRepositoryImpl$loadLesson$2.f15455c = list6;
                                        lessonRepositoryImpl$loadLesson$2.f15456d = lessonBookmark5;
                                        lessonRepositoryImpl$loadLesson$2.f15457e = lessonEntity3;
                                        lessonRepositoryImpl$loadLesson$2.f15459g = i4;
                                        lessonRepositoryImpl$loadLesson$2.f15462j = 7;
                                        q05 q05Var5 = (q05) abstractC1320h;
                                        objM2861d2 = AbstractC0758a.m2861d(new h05(i4, q05Var5, i8), q05Var5.f57071K, lessonRepositoryImpl$loadLesson$2, true, true);
                                        if (objM2861d2 != coroutineSingletons) {
                                            lessonEntity4 = lessonEntity3;
                                            objM14908p = objM2861d2;
                                            lessonBookmark4 = lessonBookmark5;
                                            list5 = list6;
                                            list7 = (List) objM14908p;
                                            lessonRepositoryImpl$loadLesson$2.f15453a = null;
                                            lessonRepositoryImpl$loadLesson$2.f15454b = lessonEntity2;
                                            lessonRepositoryImpl$loadLesson$2.f15455c = list5;
                                            lessonRepositoryImpl$loadLesson$2.f15456d = lessonBookmark4;
                                            lessonRepositoryImpl$loadLesson$2.f15457e = lessonEntity4;
                                            lessonRepositoryImpl$loadLesson$2.f15458f = list7;
                                            lessonRepositoryImpl$loadLesson$2.f15459g = i4;
                                            lessonRepositoryImpl$loadLesson$2.f15462j = 8;
                                            objMo7484A1 = abstractC1320h.mo7484A0(i4, lessonRepositoryImpl$loadLesson$2);
                                            if (objMo7484A1 != coroutineSingletons) {
                                                objM14908p = objMo7484A1;
                                                list8 = list7;
                                                lessonEntity5 = lessonEntity2;
                                                lessonBookmark6 = lessonBookmark4;
                                                list9 = list5;
                                                lessonBookmark7 = (LessonBookmark) objM14908p;
                                                if (lessonEntity4 != null) {
                                                    return new xm5(new x45(tid.m22081a(lessonEntity4), list8, lessonBookmark7));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return new um5(g25Var);
                    }
                    return coroutineSingletons;
                case 3:
                    i6 = lessonRepositoryImpl$loadLesson$2.f15459g;
                    List list10 = lessonRepositoryImpl$loadLesson$2.f15455c;
                    LessonEntity lessonEntity6 = lessonRepositoryImpl$loadLesson$2.f15454b;
                    String str9 = lessonRepositoryImpl$loadLesson$2.f15453a;
                    AbstractC3193b.m15359b(objM14908p);
                    str4 = str9;
                    list2 = list10;
                    lessonEntity = lessonEntity6;
                    lessonBookmark = (LessonBookmark) objM14908p;
                    if (lessonEntity == null) {
                        break;
                    }
                    if (lessonEntity == null) {
                        k65 k65Var4 = this.f16502f;
                        Integer num4 = new Integer(i6);
                        lessonRepositoryImpl$loadLesson$2.f15453a = str4;
                        lessonRepositoryImpl$loadLesson$2.f15454b = lessonEntity;
                        lessonRepositoryImpl$loadLesson$2.f15455c = list2;
                        lessonRepositoryImpl$loadLesson$2.f15456d = lessonBookmark;
                        lessonRepositoryImpl$loadLesson$2.f15459g = i6;
                        lessonRepositoryImpl$loadLesson$2.f15462j = 4;
                        objM14908p = k65Var4.m14908p(str4, num4, false, lessonRepositoryImpl$loadLesson$2);
                        if (objM14908p != coroutineSingletons) {
                            String str10 = str4;
                            lessonBookmark2 = lessonBookmark;
                            lessonEntity2 = lessonEntity;
                            list3 = list2;
                            i3 = i6;
                            lessonRepositoryImpl$loadLesson$2.f15453a = null;
                            lessonRepositoryImpl$loadLesson$2.f15454b = lessonEntity2;
                            lessonRepositoryImpl$loadLesson$2.f15455c = list3;
                            lessonRepositoryImpl$loadLesson$2.f15456d = lessonBookmark2;
                            lessonRepositoryImpl$loadLesson$2.f15459g = i3;
                            lessonRepositoryImpl$loadLesson$2.f15462j = 5;
                            objM2849b = AbstractC0747e.m2849b(this.f16497a, new LessonRepositoryImpl$storeLessonData$2((ResultLesson) objM14908p, this, i3, str10, null), lessonRepositoryImpl$loadLesson$2);
                            if (objM2849b != coroutineSingletons) {
                                objM2849b = xfa.f68157a;
                                break;
                            }
                            if (objM2849b != coroutineSingletons) {
                                i4 = i3;
                                lessonBookmark4 = lessonBookmark2;
                                list5 = list3;
                                lessonRepositoryImpl$loadLesson$2.f15453a = null;
                                lessonRepositoryImpl$loadLesson$2.f15454b = lessonEntity2;
                                lessonRepositoryImpl$loadLesson$2.f15455c = list5;
                                lessonRepositoryImpl$loadLesson$2.f15456d = lessonBookmark4;
                                lessonRepositoryImpl$loadLesson$2.f15459g = i4;
                                lessonRepositoryImpl$loadLesson$2.f15462j = 6;
                                objM14908p = abstractC1320h.mo7486C0(i4, lessonRepositoryImpl$loadLesson$2);
                                lessonBookmark5 = lessonBookmark4;
                                list6 = list5;
                                if (objM14908p == coroutineSingletons) {
                                    lessonEntity3 = (LessonEntity) objM14908p;
                                    lessonRepositoryImpl$loadLesson$2.f15453a = null;
                                    lessonRepositoryImpl$loadLesson$2.f15454b = lessonEntity2;
                                    lessonRepositoryImpl$loadLesson$2.f15455c = list6;
                                    lessonRepositoryImpl$loadLesson$2.f15456d = lessonBookmark5;
                                    lessonRepositoryImpl$loadLesson$2.f15457e = lessonEntity3;
                                    lessonRepositoryImpl$loadLesson$2.f15459g = i4;
                                    lessonRepositoryImpl$loadLesson$2.f15462j = 7;
                                    q05 q05Var6 = (q05) abstractC1320h;
                                    objM2861d2 = AbstractC0758a.m2861d(new h05(i4, q05Var6, i8), q05Var6.f57071K, lessonRepositoryImpl$loadLesson$2, true, true);
                                    if (objM2861d2 != coroutineSingletons) {
                                        lessonEntity4 = lessonEntity3;
                                        objM14908p = objM2861d2;
                                        lessonBookmark4 = lessonBookmark5;
                                        list5 = list6;
                                        list7 = (List) objM14908p;
                                        lessonRepositoryImpl$loadLesson$2.f15453a = null;
                                        lessonRepositoryImpl$loadLesson$2.f15454b = lessonEntity2;
                                        lessonRepositoryImpl$loadLesson$2.f15455c = list5;
                                        lessonRepositoryImpl$loadLesson$2.f15456d = lessonBookmark4;
                                        lessonRepositoryImpl$loadLesson$2.f15457e = lessonEntity4;
                                        lessonRepositoryImpl$loadLesson$2.f15458f = list7;
                                        lessonRepositoryImpl$loadLesson$2.f15459g = i4;
                                        lessonRepositoryImpl$loadLesson$2.f15462j = 8;
                                        objMo7484A1 = abstractC1320h.mo7484A0(i4, lessonRepositoryImpl$loadLesson$2);
                                        if (objMo7484A1 != coroutineSingletons) {
                                            objM14908p = objMo7484A1;
                                            list8 = list7;
                                            lessonEntity5 = lessonEntity2;
                                            lessonBookmark6 = lessonBookmark4;
                                            list9 = list5;
                                            lessonBookmark7 = (LessonBookmark) objM14908p;
                                            if (lessonEntity4 != null) {
                                                return new xm5(new x45(tid.m22081a(lessonEntity4), list8, lessonBookmark7));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                    return new um5(g25Var);
                case 4:
                    i6 = lessonRepositoryImpl$loadLesson$2.f15459g;
                    lessonBookmark = lessonRepositoryImpl$loadLesson$2.f15456d;
                    list2 = lessonRepositoryImpl$loadLesson$2.f15455c;
                    lessonEntity = lessonRepositoryImpl$loadLesson$2.f15454b;
                    str4 = lessonRepositoryImpl$loadLesson$2.f15453a;
                    AbstractC3193b.m15359b(objM14908p);
                    String str11 = str4;
                    lessonBookmark2 = lessonBookmark;
                    lessonEntity2 = lessonEntity;
                    list3 = list2;
                    i3 = i6;
                    lessonRepositoryImpl$loadLesson$2.f15453a = null;
                    lessonRepositoryImpl$loadLesson$2.f15454b = lessonEntity2;
                    lessonRepositoryImpl$loadLesson$2.f15455c = list3;
                    lessonRepositoryImpl$loadLesson$2.f15456d = lessonBookmark2;
                    lessonRepositoryImpl$loadLesson$2.f15459g = i3;
                    lessonRepositoryImpl$loadLesson$2.f15462j = 5;
                    objM2849b = AbstractC0747e.m2849b(this.f16497a, new LessonRepositoryImpl$storeLessonData$2((ResultLesson) objM14908p, this, i3, str11, null), lessonRepositoryImpl$loadLesson$2);
                    if (objM2849b != coroutineSingletons) {
                        objM2849b = xfa.f68157a;
                        break;
                    }
                    if (objM2849b != coroutineSingletons) {
                        i4 = i3;
                        lessonBookmark4 = lessonBookmark2;
                        list5 = list3;
                        lessonRepositoryImpl$loadLesson$2.f15453a = null;
                        lessonRepositoryImpl$loadLesson$2.f15454b = lessonEntity2;
                        lessonRepositoryImpl$loadLesson$2.f15455c = list5;
                        lessonRepositoryImpl$loadLesson$2.f15456d = lessonBookmark4;
                        lessonRepositoryImpl$loadLesson$2.f15459g = i4;
                        lessonRepositoryImpl$loadLesson$2.f15462j = 6;
                        objM14908p = abstractC1320h.mo7486C0(i4, lessonRepositoryImpl$loadLesson$2);
                        lessonBookmark5 = lessonBookmark4;
                        list6 = list5;
                        if (objM14908p == coroutineSingletons) {
                            lessonEntity3 = (LessonEntity) objM14908p;
                            lessonRepositoryImpl$loadLesson$2.f15453a = null;
                            lessonRepositoryImpl$loadLesson$2.f15454b = lessonEntity2;
                            lessonRepositoryImpl$loadLesson$2.f15455c = list6;
                            lessonRepositoryImpl$loadLesson$2.f15456d = lessonBookmark5;
                            lessonRepositoryImpl$loadLesson$2.f15457e = lessonEntity3;
                            lessonRepositoryImpl$loadLesson$2.f15459g = i4;
                            lessonRepositoryImpl$loadLesson$2.f15462j = 7;
                            q05 q05Var7 = (q05) abstractC1320h;
                            objM2861d2 = AbstractC0758a.m2861d(new h05(i4, q05Var7, i8), q05Var7.f57071K, lessonRepositoryImpl$loadLesson$2, true, true);
                            if (objM2861d2 != coroutineSingletons) {
                                lessonEntity4 = lessonEntity3;
                                objM14908p = objM2861d2;
                                lessonBookmark4 = lessonBookmark5;
                                list5 = list6;
                                list7 = (List) objM14908p;
                                lessonRepositoryImpl$loadLesson$2.f15453a = null;
                                lessonRepositoryImpl$loadLesson$2.f15454b = lessonEntity2;
                                lessonRepositoryImpl$loadLesson$2.f15455c = list5;
                                lessonRepositoryImpl$loadLesson$2.f15456d = lessonBookmark4;
                                lessonRepositoryImpl$loadLesson$2.f15457e = lessonEntity4;
                                lessonRepositoryImpl$loadLesson$2.f15458f = list7;
                                lessonRepositoryImpl$loadLesson$2.f15459g = i4;
                                lessonRepositoryImpl$loadLesson$2.f15462j = 8;
                                objMo7484A1 = abstractC1320h.mo7484A0(i4, lessonRepositoryImpl$loadLesson$2);
                                if (objMo7484A1 != coroutineSingletons) {
                                    objM14908p = objMo7484A1;
                                    list8 = list7;
                                    lessonEntity5 = lessonEntity2;
                                    lessonBookmark6 = lessonBookmark4;
                                    list9 = list5;
                                    lessonBookmark7 = (LessonBookmark) objM14908p;
                                    if (lessonEntity4 != null) {
                                        return new xm5(new x45(tid.m22081a(lessonEntity4), list8, lessonBookmark7));
                                    }
                                    return new um5(g25Var);
                                }
                            }
                        }
                    }
                    return coroutineSingletons;
                case 5:
                    i4 = lessonRepositoryImpl$loadLesson$2.f15459g;
                    LessonBookmark lessonBookmark8 = lessonRepositoryImpl$loadLesson$2.f15456d;
                    List list11 = lessonRepositoryImpl$loadLesson$2.f15455c;
                    LessonEntity lessonEntity7 = lessonRepositoryImpl$loadLesson$2.f15454b;
                    AbstractC3193b.m15359b(objM14908p);
                    lessonEntity2 = lessonEntity7;
                    lessonBookmark4 = lessonBookmark8;
                    list5 = list11;
                    lessonRepositoryImpl$loadLesson$2.f15453a = null;
                    lessonRepositoryImpl$loadLesson$2.f15454b = lessonEntity2;
                    lessonRepositoryImpl$loadLesson$2.f15455c = list5;
                    lessonRepositoryImpl$loadLesson$2.f15456d = lessonBookmark4;
                    lessonRepositoryImpl$loadLesson$2.f15459g = i4;
                    lessonRepositoryImpl$loadLesson$2.f15462j = 6;
                    objM14908p = abstractC1320h.mo7486C0(i4, lessonRepositoryImpl$loadLesson$2);
                    lessonBookmark5 = lessonBookmark4;
                    list6 = list5;
                    if (objM14908p == coroutineSingletons) {
                        lessonEntity3 = (LessonEntity) objM14908p;
                        lessonRepositoryImpl$loadLesson$2.f15453a = null;
                        lessonRepositoryImpl$loadLesson$2.f15454b = lessonEntity2;
                        lessonRepositoryImpl$loadLesson$2.f15455c = list6;
                        lessonRepositoryImpl$loadLesson$2.f15456d = lessonBookmark5;
                        lessonRepositoryImpl$loadLesson$2.f15457e = lessonEntity3;
                        lessonRepositoryImpl$loadLesson$2.f15459g = i4;
                        lessonRepositoryImpl$loadLesson$2.f15462j = 7;
                        q05 q05Var8 = (q05) abstractC1320h;
                        objM2861d2 = AbstractC0758a.m2861d(new h05(i4, q05Var8, i8), q05Var8.f57071K, lessonRepositoryImpl$loadLesson$2, true, true);
                        if (objM2861d2 != coroutineSingletons) {
                            lessonEntity4 = lessonEntity3;
                            objM14908p = objM2861d2;
                            lessonBookmark4 = lessonBookmark5;
                            list5 = list6;
                            list7 = (List) objM14908p;
                            lessonRepositoryImpl$loadLesson$2.f15453a = null;
                            lessonRepositoryImpl$loadLesson$2.f15454b = lessonEntity2;
                            lessonRepositoryImpl$loadLesson$2.f15455c = list5;
                            lessonRepositoryImpl$loadLesson$2.f15456d = lessonBookmark4;
                            lessonRepositoryImpl$loadLesson$2.f15457e = lessonEntity4;
                            lessonRepositoryImpl$loadLesson$2.f15458f = list7;
                            lessonRepositoryImpl$loadLesson$2.f15459g = i4;
                            lessonRepositoryImpl$loadLesson$2.f15462j = 8;
                            objMo7484A1 = abstractC1320h.mo7484A0(i4, lessonRepositoryImpl$loadLesson$2);
                            if (objMo7484A1 != coroutineSingletons) {
                                objM14908p = objMo7484A1;
                                list8 = list7;
                                lessonEntity5 = lessonEntity2;
                                lessonBookmark6 = lessonBookmark4;
                                list9 = list5;
                                lessonBookmark7 = (LessonBookmark) objM14908p;
                                if (lessonEntity4 != null) {
                                    return new xm5(new x45(tid.m22081a(lessonEntity4), list8, lessonBookmark7));
                                }
                                return new um5(g25Var);
                            }
                        }
                    }
                    return coroutineSingletons;
                case 6:
                    i4 = lessonRepositoryImpl$loadLesson$2.f15459g;
                    LessonBookmark lessonBookmark9 = lessonRepositoryImpl$loadLesson$2.f15456d;
                    List list12 = lessonRepositoryImpl$loadLesson$2.f15455c;
                    LessonEntity lessonEntity8 = lessonRepositoryImpl$loadLesson$2.f15454b;
                    AbstractC3193b.m15359b(objM14908p);
                    lessonEntity2 = lessonEntity8;
                    lessonBookmark5 = lessonBookmark9;
                    list6 = list12;
                    lessonEntity3 = (LessonEntity) objM14908p;
                    lessonRepositoryImpl$loadLesson$2.f15453a = null;
                    lessonRepositoryImpl$loadLesson$2.f15454b = lessonEntity2;
                    lessonRepositoryImpl$loadLesson$2.f15455c = list6;
                    lessonRepositoryImpl$loadLesson$2.f15456d = lessonBookmark5;
                    lessonRepositoryImpl$loadLesson$2.f15457e = lessonEntity3;
                    lessonRepositoryImpl$loadLesson$2.f15459g = i4;
                    lessonRepositoryImpl$loadLesson$2.f15462j = 7;
                    q05 q05Var9 = (q05) abstractC1320h;
                    objM2861d2 = AbstractC0758a.m2861d(new h05(i4, q05Var9, i8), q05Var9.f57071K, lessonRepositoryImpl$loadLesson$2, true, true);
                    if (objM2861d2 != coroutineSingletons) {
                        lessonEntity4 = lessonEntity3;
                        objM14908p = objM2861d2;
                        lessonBookmark4 = lessonBookmark5;
                        list5 = list6;
                        list7 = (List) objM14908p;
                        lessonRepositoryImpl$loadLesson$2.f15453a = null;
                        lessonRepositoryImpl$loadLesson$2.f15454b = lessonEntity2;
                        lessonRepositoryImpl$loadLesson$2.f15455c = list5;
                        lessonRepositoryImpl$loadLesson$2.f15456d = lessonBookmark4;
                        lessonRepositoryImpl$loadLesson$2.f15457e = lessonEntity4;
                        lessonRepositoryImpl$loadLesson$2.f15458f = list7;
                        lessonRepositoryImpl$loadLesson$2.f15459g = i4;
                        lessonRepositoryImpl$loadLesson$2.f15462j = 8;
                        objMo7484A1 = abstractC1320h.mo7484A0(i4, lessonRepositoryImpl$loadLesson$2);
                        if (objMo7484A1 != coroutineSingletons) {
                            objM14908p = objMo7484A1;
                            list8 = list7;
                            lessonEntity5 = lessonEntity2;
                            lessonBookmark6 = lessonBookmark4;
                            list9 = list5;
                            lessonBookmark7 = (LessonBookmark) objM14908p;
                            if (lessonEntity4 != null) {
                                return new xm5(new x45(tid.m22081a(lessonEntity4), list8, lessonBookmark7));
                            }
                            return new um5(g25Var);
                        }
                    }
                    return coroutineSingletons;
                case 7:
                    i4 = lessonRepositoryImpl$loadLesson$2.f15459g;
                    lessonEntity4 = lessonRepositoryImpl$loadLesson$2.f15457e;
                    LessonBookmark lessonBookmark10 = lessonRepositoryImpl$loadLesson$2.f15456d;
                    List list13 = lessonRepositoryImpl$loadLesson$2.f15455c;
                    LessonEntity lessonEntity9 = lessonRepositoryImpl$loadLesson$2.f15454b;
                    try {
                        AbstractC3193b.m15359b(objM14908p);
                        lessonEntity2 = lessonEntity9;
                        lessonBookmark4 = lessonBookmark10;
                        list5 = list13;
                        list7 = (List) objM14908p;
                        lessonRepositoryImpl$loadLesson$2.f15453a = null;
                        lessonRepositoryImpl$loadLesson$2.f15454b = lessonEntity2;
                        lessonRepositoryImpl$loadLesson$2.f15455c = list5;
                        lessonRepositoryImpl$loadLesson$2.f15456d = lessonBookmark4;
                        lessonRepositoryImpl$loadLesson$2.f15457e = lessonEntity4;
                        lessonRepositoryImpl$loadLesson$2.f15458f = list7;
                        lessonRepositoryImpl$loadLesson$2.f15459g = i4;
                        lessonRepositoryImpl$loadLesson$2.f15462j = 8;
                        objMo7484A1 = abstractC1320h.mo7484A0(i4, lessonRepositoryImpl$loadLesson$2);
                        if (objMo7484A1 != coroutineSingletons) {
                            objM14908p = objMo7484A1;
                            list8 = list7;
                            lessonEntity5 = lessonEntity2;
                            lessonBookmark6 = lessonBookmark4;
                            list9 = list5;
                            lessonBookmark7 = (LessonBookmark) objM14908p;
                            if (lessonEntity4 != null) {
                                return new xm5(new x45(tid.m22081a(lessonEntity4), list8, lessonBookmark7));
                            }
                            return new um5(g25Var);
                        }
                        return coroutineSingletons;
                    } catch (Exception e3) {
                        exc = e3;
                        r6 = lessonEntity9;
                        r4 = lessonBookmark10;
                        r5 = list13;
                        exc.printStackTrace();
                        if (r6 == 0 && !((Collection) r5).isEmpty()) {
                            return new xm5(new x45(tid.m22081a(r6), r5, r4));
                        }
                        if (exc instanceof HttpException) {
                            httpException = (HttpException) exc;
                            i88Var = httpException.f59170b;
                            if (i88Var != null || (m88Var = i88Var.f43691c) == null) {
                                strM16682n = null;
                            } else {
                                strM16682n = m88Var.m16682n();
                            }
                            if (strM16682n != null) {
                                if (httpException.f59169a == 400) {
                                    return new um5(m7246D(strM16682n));
                                }
                                df4 df4Var3 = this.f16507k;
                                df4Var3.getClass();
                                failure = (ResultErrorLesson) df4Var3.m10321a(strM16682n, ResultErrorLesson.Companion.serializer());
                                if (failure instanceof Result.Failure) {
                                    obj = failure;
                                }
                                resultErrorLesson = (ResultErrorLesson) obj;
                                if (resultErrorLesson != null && !vk9.m23391n0(resultErrorLesson.m8355a()) && ((i88Var2 = ((HttpException) exc).f59170b) == null || i88Var2.f43689a.f45204d != 401)) {
                                    return new um5(new f25(resultErrorLesson.m8355a()));
                                }
                                return new um5(g25Var);
                            }
                        }
                        if (exc instanceof IOException) {
                            return new um5(new i25(NetworkErrorType.TIMEOUT));
                        }
                        if (exc instanceof CancellationException) {
                            return new um5(e25.f36618a);
                        }
                    }
                case 8:
                    list8 = lessonRepositoryImpl$loadLesson$2.f15458f;
                    lessonEntity4 = lessonRepositoryImpl$loadLesson$2.f15457e;
                    lessonBookmark6 = lessonRepositoryImpl$loadLesson$2.f15456d;
                    list9 = lessonRepositoryImpl$loadLesson$2.f15455c;
                    lessonEntity5 = lessonRepositoryImpl$loadLesson$2.f15454b;
                    try {
                        AbstractC3193b.m15359b(objM14908p);
                        lessonBookmark6 = lessonBookmark6;
                        list9 = list9;
                        lessonEntity5 = lessonEntity5;
                        lessonBookmark7 = (LessonBookmark) objM14908p;
                        if (lessonEntity4 != null) {
                            return new xm5(new x45(tid.m22081a(lessonEntity4), list8, lessonBookmark7));
                        }
                    } catch (Exception e4) {
                        exc = e4;
                        r4 = lessonBookmark6;
                        r5 = list9;
                        r6 = lessonEntity5;
                        exc.printStackTrace();
                        if (r6 == 0) {
                        }
                        if (exc instanceof HttpException) {
                            httpException = (HttpException) exc;
                            i88Var = httpException.f59170b;
                            if (i88Var != null) {
                                strM16682n = null;
                            } else {
                                strM16682n = null;
                            }
                            if (strM16682n != null) {
                                if (httpException.f59169a == 400) {
                                    return new um5(m7246D(strM16682n));
                                }
                                df4 df4Var4 = this.f16507k;
                                df4Var4.getClass();
                                failure = (ResultErrorLesson) df4Var4.m10321a(strM16682n, ResultErrorLesson.Companion.serializer());
                                if (failure instanceof Result.Failure) {
                                    obj = failure;
                                }
                                resultErrorLesson = (ResultErrorLesson) obj;
                                if (resultErrorLesson != null) {
                                    return new um5(new f25(resultErrorLesson.m8355a()));
                                }
                                return new um5(g25Var);
                            }
                        }
                        if (exc instanceof IOException) {
                            return new um5(new i25(NetworkErrorType.TIMEOUT));
                        }
                        if (exc instanceof CancellationException) {
                            return new um5(e25.f36618a);
                        }
                        break;
                    }
                    return new um5(g25Var);
                default:
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (Exception e5) {
            exc = e5;
            r6 = r3;
            r4 = i2;
        }
    }

    /* JADX INFO: renamed from: J */
    public final c83 m7252J(int i) {
        q05 q05Var = (q05) this.f16498b;
        return AbstractC3224d.m15536o(AbstractC3584sr.m21590A(q05Var.f57071K, false, new String[]{"LessonAndCardsFromJoin", "CardEntity"}, new h05(i, q05Var, 0)));
    }

    /* JADX INFO: renamed from: K */
    public final c83 m7253K(int i, int i2) {
        q05 q05Var = (q05) this.f16498b;
        return AbstractC3224d.m15536o(AbstractC3584sr.m21590A(q05Var.f57071K, true, new String[]{"TranslationSentenceEntity"}, new f05(i, i2 + 1, q05Var, 0)));
    }

    /* JADX INFO: renamed from: L */
    public final c83 m7254L(int i, List list) {
        list.getClass();
        ArrayList arrayListM22632y0 = u91.m22632y0(list, 500);
        int size = arrayListM22632y0.size();
        AbstractC1320h abstractC1320h = this.f16498b;
        if (size <= 1) {
            return AbstractC3224d.m15536o(abstractC1320h.mo7488E0(i, list));
        }
        ArrayList arrayList = new ArrayList(v91.m23189q0(arrayListM22632y0, 10));
        Iterator it = arrayListM22632y0.iterator();
        while (it.hasNext()) {
            arrayList.add(abstractC1320h.mo7488E0(i, (List) it.next()));
        }
        return AbstractC3224d.m15536o(new t91((c83[]) u91.m22622n1(arrayList).toArray(new c83[0]), 2));
    }

    /* JADX INFO: renamed from: M */
    public final c83 m7255M(int i, String str) {
        str.getClass();
        return AbstractC3224d.m15536o(AbstractC3584sr.m21590A(((q05) this.f16498b).f57071K, true, new String[]{"LessonStatsEntity"}, new mv0(i, 5)));
    }

    /* JADX INFO: renamed from: N */
    public final c83 m7256N(int i) {
        q05 q05Var = (q05) this.f16498b;
        return AbstractC3224d.m15536o(AbstractC3584sr.m21590A(q05Var.f57071K, false, new String[]{"LessonAndWordsFromJoin", "WordEntity"}, new h05(i, q05Var, 4)));
    }

    /* JADX INFO: renamed from: O */
    public final c83 m7257O(String str) {
        str.getClass();
        String strM23629f = vz1.m23629f(str, "my_lessons_type=lessons_level=nullsearch");
        String value = LibraryItemType.Content.getValue();
        C1321i c1321i = this.f16501e;
        c1321i.getClass();
        value.getClass();
        return AbstractC3224d.m15536o(AbstractC3584sr.m21590A(c1321i.f17034K, true, new String[]{"LibraryDataEntity", "LibraryShelfAndContentJoin"}, new md0(strM23629f, 14, value)));
    }

    /* JADX INFO: renamed from: P */
    public final c83 m7258P(String str) {
        str.getClass();
        q05 q05Var = (q05) this.f16498b;
        q05Var.getClass();
        return AbstractC3224d.m15536o(AbstractC3584sr.m21590A(q05Var.f57071K, true, new String[]{"LessonTagEntity"}, new ql4(str, 2)));
    }

    /* JADX INFO: renamed from: Q */
    public final c83 m7259Q(int i, String str) {
        str.getClass();
        AbstractC1320h abstractC1320h = this.f16498b;
        return AbstractC3224d.m15536o(new C3228h(AbstractC3584sr.m21590A(((q05) abstractC1320h).f57071K, false, new String[]{"LessonSentenceTranslationEntity"}, new mv0(i, 6)), abstractC1320h.mo7487D0(i), new LessonRepositoryImpl$observeSentenceTranslations$1(str, null)));
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f6, code lost:
    
        if (r7 == r5) goto L43;
     */
    /* JADX INFO: renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7260R(String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$searchUserForSharedBy$1 lessonRepositoryImpl$searchUserForSharedBy$1;
        String str3;
        Results results;
        ArrayList arrayList;
        Results results2;
        int i;
        Object objM2861d;
        String str4 = str;
        if (continuationImpl instanceof LessonRepositoryImpl$searchUserForSharedBy$1) {
            lessonRepositoryImpl$searchUserForSharedBy$1 = (LessonRepositoryImpl$searchUserForSharedBy$1) continuationImpl;
            int i2 = lessonRepositoryImpl$searchUserForSharedBy$1.f15488h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$searchUserForSharedBy$1.f15488h = i2 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$searchUserForSharedBy$1 = new LessonRepositoryImpl$searchUserForSharedBy$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$searchUserForSharedBy$1 = new LessonRepositoryImpl$searchUserForSharedBy$1(this, continuationImpl);
        }
        Object objM14910r = lessonRepositoryImpl$searchUserForSharedBy$1.f15486f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = lessonRepositoryImpl$searchUserForSharedBy$1.f15488h;
        Object obj = xfa.f68157a;
        AbstractC1320h abstractC1320h = this.f16498b;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM14910r);
            lessonRepositoryImpl$searchUserForSharedBy$1.f15481a = str4;
            lessonRepositoryImpl$searchUserForSharedBy$1.f15482b = str2;
            lessonRepositoryImpl$searchUserForSharedBy$1.f15488h = 1;
            objM14910r = this.f16502f.m14910r(1, 25, str2, "username", "startsWith", str4, lessonRepositoryImpl$searchUserForSharedBy$1);
            if (objM14910r != coroutineSingletons) {
                str3 = str2;
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            str3 = lessonRepositoryImpl$searchUserForSharedBy$1.f15482b;
            str4 = lessonRepositoryImpl$searchUserForSharedBy$1.f15481a;
            AbstractC3193b.m15359b(objM14910r);
        } else if (i3 == 2) {
            int i4 = lessonRepositoryImpl$searchUserForSharedBy$1.f15485e;
            ArrayList arrayList2 = lessonRepositoryImpl$searchUserForSharedBy$1.f15484d;
            Results results3 = lessonRepositoryImpl$searchUserForSharedBy$1.f15483c;
            AbstractC3193b.m15359b(objM14910r);
            arrayList = arrayList2;
            i = i4;
            results2 = results3;
            lessonRepositoryImpl$searchUserForSharedBy$1.f15481a = null;
            lessonRepositoryImpl$searchUserForSharedBy$1.f15482b = null;
            lessonRepositoryImpl$searchUserForSharedBy$1.f15483c = results2;
            lessonRepositoryImpl$searchUserForSharedBy$1.f15484d = null;
            lessonRepositoryImpl$searchUserForSharedBy$1.f15485e = i;
            lessonRepositoryImpl$searchUserForSharedBy$1.f15488h = 3;
            q05 q05Var = (q05) abstractC1320h;
            objM2861d = AbstractC0758a.m2861d(new i05(q05Var, arrayList, 4), q05Var.f57071K, lessonRepositoryImpl$searchUserForSharedBy$1, false, true);
            if (objM2861d == CoroutineSingletons.COROUTINE_SUSPENDED) {
                obj = objM2861d;
            }
        } else {
            if (i3 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            results2 = lessonRepositoryImpl$searchUserForSharedBy$1.f15483c;
            AbstractC3193b.m15359b(objM14910r);
        }
        results = results2;
        return new Integer(results.f21736a);
        results = (Results) objM14910r;
        List<ResultSharedByUser> list = results.f21739d;
        if (list != null) {
            arrayList = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (ResultSharedByUser resultSharedByUser : list) {
                arrayList.add(auc.m3078f(resultSharedByUser, str4));
                arrayList3.add(new SharedByUserAndQueryJoin(str4, resultSharedByUser.m8391a(), str3 == null ? "" : str3));
            }
            lessonRepositoryImpl$searchUserForSharedBy$1.f15481a = null;
            lessonRepositoryImpl$searchUserForSharedBy$1.f15482b = null;
            lessonRepositoryImpl$searchUserForSharedBy$1.f15483c = results;
            lessonRepositoryImpl$searchUserForSharedBy$1.f15484d = arrayList;
            lessonRepositoryImpl$searchUserForSharedBy$1.f15485e = 0;
            lessonRepositoryImpl$searchUserForSharedBy$1.f15488h = 2;
            q05 q05Var2 = (q05) abstractC1320h;
            Object objM2861d2 = AbstractC0758a.m2861d(new g05(q05Var2, arrayList3, 3), q05Var2.f57071K, lessonRepositoryImpl$searchUserForSharedBy$1, false, true);
            if (objM2861d2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                objM2861d2 = obj;
            }
            if (objM2861d2 != coroutineSingletons) {
                results2 = results;
                i = 0;
                lessonRepositoryImpl$searchUserForSharedBy$1.f15481a = null;
                lessonRepositoryImpl$searchUserForSharedBy$1.f15482b = null;
                lessonRepositoryImpl$searchUserForSharedBy$1.f15483c = results2;
                lessonRepositoryImpl$searchUserForSharedBy$1.f15484d = null;
                lessonRepositoryImpl$searchUserForSharedBy$1.f15485e = i;
                lessonRepositoryImpl$searchUserForSharedBy$1.f15488h = 3;
                q05 q05Var3 = (q05) abstractC1320h;
                objM2861d = AbstractC0758a.m2861d(new i05(q05Var3, arrayList, 4), q05Var3.f57071K, lessonRepositoryImpl$searchUserForSharedBy$1, false, true);
                if (objM2861d == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    obj = objM2861d;
                }
            }
            return coroutineSingletons;
        }
        return new Integer(results.f21736a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r9 == r1) goto L26;
     */
    /* JADX INFO: renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7261S(String str, int i, boolean z, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$setArchived$1 lessonRepositoryImpl$setArchived$1;
        if (continuationImpl instanceof LessonRepositoryImpl$setArchived$1) {
            lessonRepositoryImpl$setArchived$1 = (LessonRepositoryImpl$setArchived$1) continuationImpl;
            int i2 = lessonRepositoryImpl$setArchived$1.f15491c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$setArchived$1.f15491c = i2 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$setArchived$1 = new LessonRepositoryImpl$setArchived$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$setArchived$1 = new LessonRepositoryImpl$setArchived$1(this, continuationImpl);
        }
        Object objM14917z = lessonRepositoryImpl$setArchived$1.f15489a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = lessonRepositoryImpl$setArchived$1.f15491c;
        try {
            if (i3 == 0) {
                AbstractC3193b.m15359b(objM14917z);
                k65 k65Var = this.f16502f;
                if (z) {
                    lessonRepositoryImpl$setArchived$1.f15491c = 1;
                    objM14917z = k65Var.m14916y(str, i, lessonRepositoryImpl$setArchived$1);
                    if (objM14917z == coroutineSingletons) {
                    }
                } else {
                    lessonRepositoryImpl$setArchived$1.f15491c = 2;
                    objM14917z = k65Var.m14917z(str, i, lessonRepositoryImpl$setArchived$1);
                }
                return coroutineSingletons;
            }
            if (i3 == 1) {
                AbstractC3193b.m15359b(objM14917z);
            } else {
                if (i3 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM14917z);
            }
            return new xm5(xfa.f68157a);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            rm5 rm5Var = sm5.Companion;
            String str2 = "LessonRepository: setArchived failed - " + e2.getMessage();
            rm5Var.getClass();
            h0a.f41641a.mo11433g(str2, new Object[0]);
            return new um5(zj6.f71653a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0086, code lost:
    
        if (m7266X(r10, r11, r12, r0) == r1) goto L30;
     */
    /* JADX INFO: renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7262T(String str, int i, boolean z, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$simplifyLesson$1 lessonRepositoryImpl$simplifyLesson$1;
        String str2;
        boolean z2;
        if (continuationImpl instanceof LessonRepositoryImpl$simplifyLesson$1) {
            lessonRepositoryImpl$simplifyLesson$1 = (LessonRepositoryImpl$simplifyLesson$1) continuationImpl;
            int i2 = lessonRepositoryImpl$simplifyLesson$1.f15497f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$simplifyLesson$1.f15497f = i2 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$simplifyLesson$1 = new LessonRepositoryImpl$simplifyLesson$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$simplifyLesson$1 = new LessonRepositoryImpl$simplifyLesson$1(this, continuationImpl);
        }
        Object objMo7500z0 = lessonRepositoryImpl$simplifyLesson$1.f15495d;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = lessonRepositoryImpl$simplifyLesson$1.f15497f;
        AbstractC1320h abstractC1320h = this.f16498b;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objMo7500z0);
            lessonRepositoryImpl$simplifyLesson$1.f15492a = str;
            lessonRepositoryImpl$simplifyLesson$1.f15493b = i;
            lessonRepositoryImpl$simplifyLesson$1.f15494c = z;
            lessonRepositoryImpl$simplifyLesson$1.f15497f = 1;
            objMo7500z0 = abstractC1320h.mo7500z0(i, lessonRepositoryImpl$simplifyLesson$1);
            if (objMo7500z0 != obj) {
            }
            return obj;
        }
        if (i3 == 1) {
            z = lessonRepositoryImpl$simplifyLesson$1.f15494c;
            i = lessonRepositoryImpl$simplifyLesson$1.f15493b;
            str = lessonRepositoryImpl$simplifyLesson$1.f15492a;
            AbstractC3193b.m15359b(objMo7500z0);
        } else if (i3 == 2) {
            z2 = lessonRepositoryImpl$simplifyLesson$1.f15494c;
            i = lessonRepositoryImpl$simplifyLesson$1.f15493b;
            str2 = lessonRepositoryImpl$simplifyLesson$1.f15492a;
            AbstractC3193b.m15359b(objMo7500z0);
            String str3 = str2;
            z = z2;
            str = str3;
            lessonRepositoryImpl$simplifyLesson$1.f15492a = null;
            lessonRepositoryImpl$simplifyLesson$1.f15493b = i;
            lessonRepositoryImpl$simplifyLesson$1.f15494c = z;
            lessonRepositoryImpl$simplifyLesson$1.f15497f = 3;
        } else {
            if (i3 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objMo7500z0);
        }
        return xfa.f68157a;
        if (((LessonEntity) objMo7500z0) != null) {
            LessonsSimplifiedJoin lessonsSimplifiedJoin = new LessonsSimplifiedJoin(i);
            lessonRepositoryImpl$simplifyLesson$1.f15492a = str;
            lessonRepositoryImpl$simplifyLesson$1.f15493b = i;
            lessonRepositoryImpl$simplifyLesson$1.f15494c = z;
            lessonRepositoryImpl$simplifyLesson$1.f15497f = 2;
            if (abstractC1320h.mo7492I0(lessonsSimplifiedJoin, lessonRepositoryImpl$simplifyLesson$1) != obj) {
                boolean z3 = z;
                str2 = str;
                z2 = z3;
                String str4 = str2;
                z = z2;
                str = str4;
                lessonRepositoryImpl$simplifyLesson$1.f15492a = null;
                lessonRepositoryImpl$simplifyLesson$1.f15493b = i;
                lessonRepositoryImpl$simplifyLesson$1.f15494c = z;
                lessonRepositoryImpl$simplifyLesson$1.f15497f = 3;
            }
        } else {
            lessonRepositoryImpl$simplifyLesson$1.f15492a = null;
            lessonRepositoryImpl$simplifyLesson$1.f15493b = i;
            lessonRepositoryImpl$simplifyLesson$1.f15494c = z;
            lessonRepositoryImpl$simplifyLesson$1.f15497f = 3;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: U */
    public final Object m7263U(String str, int i, double d, Integer num, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$syncLessonAudioProgress$1 lessonRepositoryImpl$syncLessonAudioProgress$1;
        String str2;
        Integer numM8029b;
        double d2;
        Object objMo7484A0;
        int i2;
        String str3;
        int i3;
        double d3;
        String str4;
        int i4;
        Integer numM8032e;
        String strM8030c;
        String strM8031d;
        int i5 = i;
        if (continuationImpl instanceof LessonRepositoryImpl$syncLessonAudioProgress$1) {
            lessonRepositoryImpl$syncLessonAudioProgress$1 = (LessonRepositoryImpl$syncLessonAudioProgress$1) continuationImpl;
            int i6 = lessonRepositoryImpl$syncLessonAudioProgress$1.f15537j;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$syncLessonAudioProgress$1.f15537j = i6 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$syncLessonAudioProgress$1 = new LessonRepositoryImpl$syncLessonAudioProgress$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$syncLessonAudioProgress$1 = new LessonRepositoryImpl$syncLessonAudioProgress$1(this, continuationImpl);
        }
        Object obj = lessonRepositoryImpl$syncLessonAudioProgress$1.f15535h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = lessonRepositoryImpl$syncLessonAudioProgress$1.f15537j;
        AbstractC1320h abstractC1320h = this.f16498b;
        if (i7 == 0) {
            AbstractC3193b.m15359b(obj);
            str2 = str;
            lessonRepositoryImpl$syncLessonAudioProgress$1.f15528a = str2;
            numM8029b = num;
            lessonRepositoryImpl$syncLessonAudioProgress$1.f15529b = numM8029b;
            lessonRepositoryImpl$syncLessonAudioProgress$1.f15531d = i5;
            d2 = d;
            lessonRepositoryImpl$syncLessonAudioProgress$1.f15534g = d2;
            lessonRepositoryImpl$syncLessonAudioProgress$1.f15537j = 1;
            objMo7484A0 = abstractC1320h.mo7484A0(i5, lessonRepositoryImpl$syncLessonAudioProgress$1);
            if (objMo7484A0 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i7 == 1) {
            d2 = lessonRepositoryImpl$syncLessonAudioProgress$1.f15534g;
            i5 = lessonRepositoryImpl$syncLessonAudioProgress$1.f15531d;
            numM8029b = lessonRepositoryImpl$syncLessonAudioProgress$1.f15529b;
            String str5 = lessonRepositoryImpl$syncLessonAudioProgress$1.f15528a;
            AbstractC3193b.m15359b(obj);
            objMo7484A0 = obj;
            str2 = str5;
        } else {
            if (i7 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i8 = lessonRepositoryImpl$syncLessonAudioProgress$1.f15533f;
            i3 = lessonRepositoryImpl$syncLessonAudioProgress$1.f15532e;
            d3 = lessonRepositoryImpl$syncLessonAudioProgress$1.f15534g;
            int i9 = lessonRepositoryImpl$syncLessonAudioProgress$1.f15531d;
            String str6 = lessonRepositoryImpl$syncLessonAudioProgress$1.f15530c;
            String str7 = lessonRepositoryImpl$syncLessonAudioProgress$1.f15528a;
            AbstractC3193b.m15359b(obj);
            i2 = i8;
            str3 = str7;
            i4 = i9;
            str4 = str6;
        }
        m7282j(str3, i4, i2, i3, d3, str4);
        return xfa.f68157a;
        double d4 = d2;
        int i10 = i5;
        LessonBookmark lessonBookmark = (LessonBookmark) objMo7484A0;
        int iIntValue = 0;
        int iIntValue2 = (numM8029b == null && (lessonBookmark == null || (numM8029b = lessonBookmark.m8029b()) == null)) ? 0 : numM8029b.intValue();
        String str8 = (lessonBookmark == null || (strM8031d = lessonBookmark.m8031d()) == null) ? "" : strM8031d;
        String str9 = (lessonBookmark == null || (strM8030c = lessonBookmark.m8030c()) == null) ? "" : strM8030c;
        if (lessonBookmark != null && (numM8032e = lessonBookmark.m8032e()) != null) {
            iIntValue = numM8032e.intValue();
        }
        LessonBookmarkEntity lessonBookmarkEntity = new LessonBookmarkEntity(i10, new Double(d4), new Integer(iIntValue), new Integer(iIntValue2), "Android", str8, str9);
        String str10 = str8;
        lessonRepositoryImpl$syncLessonAudioProgress$1.f15528a = str2;
        lessonRepositoryImpl$syncLessonAudioProgress$1.f15529b = null;
        lessonRepositoryImpl$syncLessonAudioProgress$1.f15530c = str10;
        lessonRepositoryImpl$syncLessonAudioProgress$1.f15531d = i10;
        lessonRepositoryImpl$syncLessonAudioProgress$1.f15534g = d4;
        lessonRepositoryImpl$syncLessonAudioProgress$1.f15532e = iIntValue2;
        lessonRepositoryImpl$syncLessonAudioProgress$1.f15533f = iIntValue;
        lessonRepositoryImpl$syncLessonAudioProgress$1.f15537j = 2;
        if (abstractC1320h.mo7489F0(lessonBookmarkEntity, lessonRepositoryImpl$syncLessonAudioProgress$1) != coroutineSingletons) {
            i2 = iIntValue;
            str3 = str2;
            i3 = iIntValue2;
            d3 = d4;
            str4 = str10;
            i4 = i10;
            m7282j(str3, i4, i2, i3, d3, str4);
            return xfa.f68157a;
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00dc A[Catch: all -> 0x0105, TryCatch #0 {all -> 0x0105, blocks: (B:60:0x013a, B:43:0x00d6, B:45:0x00dc, B:46:0x00f1, B:48:0x00f7, B:53:0x010e, B:52:0x010b), top: B:78:0x00d6 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00f7 A[Catch: all -> 0x0105, LOOP:0: B:46:0x00f1->B:48:0x00f7, LOOP_END, TryCatch #0 {all -> 0x0105, blocks: (B:60:0x013a, B:43:0x00d6, B:45:0x00dc, B:46:0x00f1, B:48:0x00f7, B:53:0x010e, B:52:0x010b), top: B:78:0x00d6 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x010b A[Catch: all -> 0x0105, TryCatch #0 {all -> 0x0105, blocks: (B:60:0x013a, B:43:0x00d6, B:45:0x00dc, B:46:0x00f1, B:48:0x00f7, B:53:0x010e, B:52:0x010b), top: B:78:0x00d6 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0134  */
    /* JADX WARN: Code duplicated, block: B:56:0x0135  */
    /* JADX WARN: Code duplicated, block: B:58:0x0138  */
    /* JADX WARN: Code duplicated, block: B:59:0x0139  */
    /* JADX WARN: Code duplicated, block: B:63:0x015f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0163  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [k65] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [c76] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [c76] */
    /* JADX WARN: Type inference failed for: r14v9, types: [c76] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [c76] */
    /* JADX WARN: Type inference failed for: r15v2, types: [c76] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.lingq.core.data.repository.LessonRepositoryImpl$syncLessonComplete$1, kotlin.coroutines.Continuation, kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARN: Type inference failed for: r2v3, types: [c76] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v1, types: [c76, kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: V */
    public final Object m7264V(int i, String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        ?? lessonRepositoryImpl$syncLessonComplete$1;
        String str3;
        String str4;
        ?? r15;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        ?? r14;
        List listM8366a;
        List list;
        Object objM2861d;
        int i7;
        ArrayList arrayList;
        Iterator it;
        Object objM2861d2;
        ?? r2;
        ?? r16;
        if (continuationImpl instanceof LessonRepositoryImpl$syncLessonComplete$1) {
            LessonRepositoryImpl$syncLessonComplete$1 lessonRepositoryImpl$syncLessonComplete$2 = (LessonRepositoryImpl$syncLessonComplete$1) continuationImpl;
            int i8 = lessonRepositoryImpl$syncLessonComplete$2.f15547j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$syncLessonComplete$2.f15547j = i8 - Integer.MIN_VALUE;
                lessonRepositoryImpl$syncLessonComplete$1 = lessonRepositoryImpl$syncLessonComplete$2;
            } else {
                lessonRepositoryImpl$syncLessonComplete$1 = new LessonRepositoryImpl$syncLessonComplete$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$syncLessonComplete$1 = new LessonRepositoryImpl$syncLessonComplete$1(this, continuationImpl);
        }
        Object objM14903j = lessonRepositoryImpl$syncLessonComplete$1.f15545h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = lessonRepositoryImpl$syncLessonComplete$1.f15547j;
        AbstractC1320h abstractC1320h = this.f16498b;
        LinkedHashSet linkedHashSet = this.f16510n;
        xfa xfaVar = xfa.f68157a;
        try {
            try {
                if (i9 == 0) {
                    AbstractC3193b.m15359b(objM14903j);
                    str3 = str;
                    lessonRepositoryImpl$syncLessonComplete$1.f15541d = str3;
                    str4 = str2;
                    lessonRepositoryImpl$syncLessonComplete$1.f15542e = str4;
                    ?? r7 = this.f16509m;
                    lessonRepositoryImpl$syncLessonComplete$1.f15543f = r7;
                    lessonRepositoryImpl$syncLessonComplete$1.f15538a = i;
                    lessonRepositoryImpl$syncLessonComplete$1.f15539b = 0;
                    lessonRepositoryImpl$syncLessonComplete$1.f15547j = 1;
                    if (r7.mo4388c(lessonRepositoryImpl$syncLessonComplete$1) != coroutineSingletons) {
                        r15 = r7;
                        i2 = i;
                        i3 = 0;
                    }
                    return coroutineSingletons;
                }
                if (i9 != 1) {
                    if (i9 == 2) {
                        i6 = lessonRepositoryImpl$syncLessonComplete$1.f15540c;
                        i5 = lessonRepositoryImpl$syncLessonComplete$1.f15539b;
                        i4 = lessonRepositoryImpl$syncLessonComplete$1.f15538a;
                        r14 = lessonRepositoryImpl$syncLessonComplete$1.f15543f;
                        try {
                            AbstractC3193b.m15359b(objM14903j);
                            r14 = r14;
                            try {
                                listM8366a = ((ResultLessonComplete) objM14903j).m8366a();
                                if (listM8366a != null) {
                                    ArrayList arrayListM22587E0 = u91.m22587E0(listM8366a);
                                    arrayList = new ArrayList(v91.m23189q0(arrayListM22587E0, 10));
                                    it = arrayListM22587E0.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(xrc.m24660a((MoreLesson) it.next(), i4));
                                    }
                                    list = arrayList;
                                } else {
                                    list = EmptyList.f47638a;
                                }
                                lessonRepositoryImpl$syncLessonComplete$1.f15541d = null;
                                lessonRepositoryImpl$syncLessonComplete$1.f15542e = null;
                                lessonRepositoryImpl$syncLessonComplete$1.f15543f = r14;
                                lessonRepositoryImpl$syncLessonComplete$1.f15544g = list;
                                lessonRepositoryImpl$syncLessonComplete$1.f15538a = i4;
                                lessonRepositoryImpl$syncLessonComplete$1.f15539b = i5;
                                lessonRepositoryImpl$syncLessonComplete$1.f15540c = i6;
                                lessonRepositoryImpl$syncLessonComplete$1.f15547j = 3;
                                objM2861d = AbstractC0758a.m2861d(new mv0(i4, 15), ((q05) abstractC1320h).f57071K, lessonRepositoryImpl$syncLessonComplete$1, false, true);
                                if (objM2861d == CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    objM2861d = xfaVar;
                                }
                                if (objM2861d == coroutineSingletons) {
                                    i7 = i4;
                                    r14 = r14;
                                    lessonRepositoryImpl$syncLessonComplete$1.f15541d = null;
                                    lessonRepositoryImpl$syncLessonComplete$1.f15542e = null;
                                    lessonRepositoryImpl$syncLessonComplete$1.f15543f = r14;
                                    lessonRepositoryImpl$syncLessonComplete$1.f15544g = null;
                                    lessonRepositoryImpl$syncLessonComplete$1.f15538a = i7;
                                    lessonRepositoryImpl$syncLessonComplete$1.f15539b = i5;
                                    lessonRepositoryImpl$syncLessonComplete$1.f15540c = i6;
                                    lessonRepositoryImpl$syncLessonComplete$1.f15547j = 4;
                                    q05 q05Var = (q05) abstractC1320h;
                                    objM2861d2 = AbstractC0758a.m2861d(new i05(q05Var, list, 7), q05Var.f57071K, lessonRepositoryImpl$syncLessonComplete$1, false, true);
                                    if (objM2861d2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        objM2861d2 = xfaVar;
                                    }
                                    if (objM2861d2 != coroutineSingletons) {
                                        r2 = r14;
                                    }
                                }
                                return coroutineSingletons;
                            } catch (Throwable th) {
                                th = th;
                                lessonRepositoryImpl$syncLessonComplete$1 = r14;
                                lessonRepositoryImpl$syncLessonComplete$1.mo4387b(null);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            linkedHashSet.remove(new Integer(i4));
                            throw th;
                        }
                    }
                    if (i9 == 3) {
                        i6 = lessonRepositoryImpl$syncLessonComplete$1.f15540c;
                        i5 = lessonRepositoryImpl$syncLessonComplete$1.f15539b;
                        i7 = lessonRepositoryImpl$syncLessonComplete$1.f15538a;
                        list = (List) lessonRepositoryImpl$syncLessonComplete$1.f15544g;
                        c76 c76Var = lessonRepositoryImpl$syncLessonComplete$1.f15543f;
                        try {
                            AbstractC3193b.m15359b(objM14903j);
                            r14 = c76Var;
                            lessonRepositoryImpl$syncLessonComplete$1.f15541d = null;
                            lessonRepositoryImpl$syncLessonComplete$1.f15542e = null;
                            lessonRepositoryImpl$syncLessonComplete$1.f15543f = r14;
                            lessonRepositoryImpl$syncLessonComplete$1.f15544g = null;
                            lessonRepositoryImpl$syncLessonComplete$1.f15538a = i7;
                            lessonRepositoryImpl$syncLessonComplete$1.f15539b = i5;
                            lessonRepositoryImpl$syncLessonComplete$1.f15540c = i6;
                            lessonRepositoryImpl$syncLessonComplete$1.f15547j = 4;
                            q05 q05Var2 = (q05) abstractC1320h;
                            objM2861d2 = AbstractC0758a.m2861d(new i05(q05Var2, list, 7), q05Var2.f57071K, lessonRepositoryImpl$syncLessonComplete$1, false, true);
                            if (objM2861d2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                objM2861d2 = xfaVar;
                            }
                            if (objM2861d2 != coroutineSingletons) {
                                r2 = r14;
                            }
                            return coroutineSingletons;
                        } catch (Throwable th3) {
                            th = th3;
                            lessonRepositoryImpl$syncLessonComplete$1 = c76Var;
                            lessonRepositoryImpl$syncLessonComplete$1.mo4387b(null);
                            throw th;
                        }
                    }
                    if (i9 != 4) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c76 c76Var2 = lessonRepositoryImpl$syncLessonComplete$1.f15543f;
                    AbstractC3193b.m15359b(objM14903j);
                    r2 = c76Var2;
                    r16 = r2;
                    r16.mo4387b(null);
                    return xfaVar;
                }
                int i10 = lessonRepositoryImpl$syncLessonComplete$1.f15539b;
                i2 = lessonRepositoryImpl$syncLessonComplete$1.f15538a;
                c76 c76Var3 = lessonRepositoryImpl$syncLessonComplete$1.f15543f;
                String str5 = lessonRepositoryImpl$syncLessonComplete$1.f15542e;
                String str6 = lessonRepositoryImpl$syncLessonComplete$1.f15541d;
                AbstractC3193b.m15359b(objM14903j);
                i3 = i10;
                str4 = str5;
                str3 = str6;
                r15 = c76Var3;
                r16 = r15;
                if (linkedHashSet.add(new Integer(i2))) {
                    try {
                        ?? r0 = this.f16502f;
                        Integer num = new Integer(i2);
                        RequestLessonComplete requestLessonComplete = new RequestLessonComplete(str4);
                        lessonRepositoryImpl$syncLessonComplete$1.f15541d = null;
                        lessonRepositoryImpl$syncLessonComplete$1.f15542e = null;
                        lessonRepositoryImpl$syncLessonComplete$1.f15543f = r15;
                        lessonRepositoryImpl$syncLessonComplete$1.f15538a = i2;
                        lessonRepositoryImpl$syncLessonComplete$1.f15539b = i3;
                        lessonRepositoryImpl$syncLessonComplete$1.f15540c = 0;
                        lessonRepositoryImpl$syncLessonComplete$1.f15547j = 2;
                        objM14903j = r0.m14903j(str3, num, requestLessonComplete, lessonRepositoryImpl$syncLessonComplete$1);
                        if (objM14903j != coroutineSingletons) {
                            i5 = i3;
                            i6 = 0;
                            i4 = i2;
                            r14 = r15;
                            listM8366a = ((ResultLessonComplete) objM14903j).m8366a();
                            if (listM8366a != null) {
                                ArrayList arrayListM22587E1 = u91.m22587E0(listM8366a);
                                arrayList = new ArrayList(v91.m23189q0(arrayListM22587E1, 10));
                                it = arrayListM22587E1.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(xrc.m24660a((MoreLesson) it.next(), i4));
                                }
                                list = arrayList;
                            } else {
                                list = EmptyList.f47638a;
                            }
                            lessonRepositoryImpl$syncLessonComplete$1.f15541d = null;
                            lessonRepositoryImpl$syncLessonComplete$1.f15542e = null;
                            lessonRepositoryImpl$syncLessonComplete$1.f15543f = r14;
                            lessonRepositoryImpl$syncLessonComplete$1.f15544g = list;
                            lessonRepositoryImpl$syncLessonComplete$1.f15538a = i4;
                            lessonRepositoryImpl$syncLessonComplete$1.f15539b = i5;
                            lessonRepositoryImpl$syncLessonComplete$1.f15540c = i6;
                            lessonRepositoryImpl$syncLessonComplete$1.f15547j = 3;
                            objM2861d = AbstractC0758a.m2861d(new mv0(i4, 15), ((q05) abstractC1320h).f57071K, lessonRepositoryImpl$syncLessonComplete$1, false, true);
                            if (objM2861d == CoroutineSingletons.COROUTINE_SUSPENDED) {
                                objM2861d = xfaVar;
                            }
                            if (objM2861d == coroutineSingletons) {
                                i7 = i4;
                                r14 = r14;
                                lessonRepositoryImpl$syncLessonComplete$1.f15541d = null;
                                lessonRepositoryImpl$syncLessonComplete$1.f15542e = null;
                                lessonRepositoryImpl$syncLessonComplete$1.f15543f = r14;
                                lessonRepositoryImpl$syncLessonComplete$1.f15544g = null;
                                lessonRepositoryImpl$syncLessonComplete$1.f15538a = i7;
                                lessonRepositoryImpl$syncLessonComplete$1.f15539b = i5;
                                lessonRepositoryImpl$syncLessonComplete$1.f15540c = i6;
                                lessonRepositoryImpl$syncLessonComplete$1.f15547j = 4;
                                q05 q05Var3 = (q05) abstractC1320h;
                                objM2861d2 = AbstractC0758a.m2861d(new i05(q05Var3, list, 7), q05Var3.f57071K, lessonRepositoryImpl$syncLessonComplete$1, false, true);
                                if (objM2861d2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    objM2861d2 = xfaVar;
                                }
                                if (objM2861d2 != coroutineSingletons) {
                                    r2 = r14;
                                    r16 = r2;
                                }
                            }
                        }
                        return coroutineSingletons;
                    } catch (Throwable th4) {
                        th = th4;
                        i4 = i2;
                        linkedHashSet.remove(new Integer(i4));
                        throw th;
                    }
                }
                r16.mo4387b(null);
                return xfaVar;
            } catch (Throwable th5) {
                th = th5;
                lessonRepositoryImpl$syncLessonComplete$1 = r15;
                lessonRepositoryImpl$syncLessonComplete$1.mo4387b(null);
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0093, code lost:
    
        if (r6.f16498b.mo7496M0(r9, r0) == r1) goto L29;
     */
    /* JADX INFO: renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7265W(int i, String str, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$syncLessonSentences$1 lessonRepositoryImpl$syncLessonSentences$1;
        if (continuationImpl instanceof LessonRepositoryImpl$syncLessonSentences$1) {
            lessonRepositoryImpl$syncLessonSentences$1 = (LessonRepositoryImpl$syncLessonSentences$1) continuationImpl;
            int i2 = lessonRepositoryImpl$syncLessonSentences$1.f15551d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$syncLessonSentences$1.f15551d = i2 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$syncLessonSentences$1 = new LessonRepositoryImpl$syncLessonSentences$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$syncLessonSentences$1 = new LessonRepositoryImpl$syncLessonSentences$1(this, continuationImpl);
        }
        Object objM14889A = lessonRepositoryImpl$syncLessonSentences$1.f15549b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = lessonRepositoryImpl$syncLessonSentences$1.f15551d;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM14889A);
            Integer num = new Integer(i);
            lessonRepositoryImpl$syncLessonSentences$1.f15548a = i;
            lessonRepositoryImpl$syncLessonSentences$1.f15551d = 1;
            objM14889A = this.f16502f.m14889A(str, num, false, lessonRepositoryImpl$syncLessonSentences$1);
            if (objM14889A != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            i = lessonRepositoryImpl$syncLessonSentences$1.f15548a;
            AbstractC3193b.m15359b(objM14889A);
        } else {
            if (i3 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM14889A);
        }
        return new xm5(xfa.f68157a);
        NetworkResponse networkResponse = (NetworkResponse) objM14889A;
        if (!(networkResponse instanceof NetworkResponse.Success)) {
            if (networkResponse instanceof NetworkResponse.Error) {
                return new um5(new i25(AbstractC1554b.m8250a((NetworkResponse.Error) networkResponse)));
            }
            gm5.m12750e();
            return null;
        }
        List list = (List) ((NetworkResponse.Success) networkResponse).getData();
        if (!list.isEmpty()) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(puc.m19490g((ResultTranslationSentence) it.next(), i));
            }
            lessonRepositoryImpl$syncLessonSentences$1.f15548a = i;
            lessonRepositoryImpl$syncLessonSentences$1.f15551d = 2;
        }
        return new xm5(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0089 A[Catch: Exception -> 0x010a, TryCatch #0 {Exception -> 0x010a, blocks: (B:14:0x0030, B:37:0x009f, B:39:0x00a3, B:41:0x00d9, B:42:0x00e6, B:19:0x0043, B:33:0x0089, B:22:0x004d, B:28:0x006a, B:25:0x0054), top: B:48:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x009c  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a3 A[Catch: Exception -> 0x010a, TryCatch #0 {Exception -> 0x010a, blocks: (B:14:0x0030, B:37:0x009f, B:39:0x00a3, B:41:0x00d9, B:42:0x00e6, B:19:0x0043, B:33:0x0089, B:22:0x004d, B:28:0x006a, B:25:0x0054), top: B:48:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d9 A[Catch: Exception -> 0x010a, TryCatch #0 {Exception -> 0x010a, blocks: (B:14:0x0030, B:37:0x009f, B:39:0x00a3, B:41:0x00d9, B:42:0x00e6, B:19:0x0043, B:33:0x0089, B:22:0x004d, B:28:0x006a, B:25:0x0054), top: B:48:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: X */
    public final Object m7266X(String str, int i, boolean z, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$syncLessonSimplify$1 lessonRepositoryImpl$syncLessonSimplify$1;
        String str2;
        boolean z2;
        ResultLesson resultLesson;
        int i2;
        ResultLesson resultLesson2;
        String str3;
        LessonEntity lessonEntity;
        if (continuationImpl instanceof LessonRepositoryImpl$syncLessonSimplify$1) {
            lessonRepositoryImpl$syncLessonSimplify$1 = (LessonRepositoryImpl$syncLessonSimplify$1) continuationImpl;
            int i3 = lessonRepositoryImpl$syncLessonSimplify$1.f15558g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$syncLessonSimplify$1.f15558g = i3 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$syncLessonSimplify$1 = new LessonRepositoryImpl$syncLessonSimplify$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$syncLessonSimplify$1 = new LessonRepositoryImpl$syncLessonSimplify$1(this, continuationImpl);
        }
        Object objM14896I = lessonRepositoryImpl$syncLessonSimplify$1.f15556e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = lessonRepositoryImpl$syncLessonSimplify$1.f15558g;
        try {
            if (i4 == 0) {
                AbstractC3193b.m15359b(objM14896I);
                k65 k65Var = this.f16502f;
                Integer num = new Integer(i);
                lessonRepositoryImpl$syncLessonSimplify$1.f15552a = str;
                lessonRepositoryImpl$syncLessonSimplify$1.f15554c = i;
                lessonRepositoryImpl$syncLessonSimplify$1.f15555d = z;
                lessonRepositoryImpl$syncLessonSimplify$1.f15558g = 1;
                objM14896I = k65Var.m14896I(str, num, lessonRepositoryImpl$syncLessonSimplify$1);
                if (objM14896I == coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i4 == 1) {
                z = lessonRepositoryImpl$syncLessonSimplify$1.f15555d;
                i = lessonRepositoryImpl$syncLessonSimplify$1.f15554c;
                str = lessonRepositoryImpl$syncLessonSimplify$1.f15552a;
                AbstractC3193b.m15359b(objM14896I);
            } else {
                if (i4 == 2) {
                    z2 = lessonRepositoryImpl$syncLessonSimplify$1.f15555d;
                    i = lessonRepositoryImpl$syncLessonSimplify$1.f15554c;
                    resultLesson = lessonRepositoryImpl$syncLessonSimplify$1.f15553b;
                    str2 = lessonRepositoryImpl$syncLessonSimplify$1.f15552a;
                    AbstractC3193b.m15359b(objM14896I);
                    if (z2) {
                        AbstractC1320h abstractC1320h = this.f16498b;
                        lessonRepositoryImpl$syncLessonSimplify$1.f15552a = str2;
                        lessonRepositoryImpl$syncLessonSimplify$1.f15553b = resultLesson;
                        lessonRepositoryImpl$syncLessonSimplify$1.f15554c = i;
                        lessonRepositoryImpl$syncLessonSimplify$1.f15555d = z2;
                        lessonRepositoryImpl$syncLessonSimplify$1.f15558g = 3;
                        objM14896I = abstractC1320h.mo7500z0(i, lessonRepositoryImpl$syncLessonSimplify$1);
                        if (objM14896I != coroutineSingletons) {
                            i2 = i;
                            resultLesson2 = resultLesson;
                            str3 = str2;
                        }
                        return coroutineSingletons;
                    }
                    return xfa.f68157a;
                }
                if (i4 != 3) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = lessonRepositoryImpl$syncLessonSimplify$1.f15554c;
                resultLesson2 = lessonRepositoryImpl$syncLessonSimplify$1.f15553b;
                str3 = lessonRepositoryImpl$syncLessonSimplify$1.f15552a;
                AbstractC3193b.m15359b(objM14896I);
            }
            lessonEntity = (LessonEntity) objM14896I;
            if (lessonEntity != null) {
                Bundle bundle = new Bundle();
                bundle.putInt("source lesson id", i2);
                bundle.putString("source lesson name", lessonEntity.m7710q0());
                bundle.putInt("source course id", lessonEntity.m7695j());
                bundle.putString("source course name", lessonEntity.m7697k());
                bundle.putString("source lesson level", lessonEntity.m7645B());
                List listM7708p0 = lessonEntity.m7708p0();
                bundle.putString("tags", listM7708p0 != null ? u91.m22596N0(listM7708p0, null, null, null, null, 63) : null);
                bundle.putString("source shared by", lessonEntity.m7690g0());
                bundle.putString("lesson language", str3);
                bundle.putInt("simplified lesson id", resultLesson2.m8364b());
                ((C1240a) this.f16505i).m7025f("lesson simplified", bundle);
            }
            return xfa.f68157a;
            ResultLesson resultLesson3 = (ResultLesson) objM14896I;
            LingQDatabase lingQDatabase = this.f16497a;
            LessonRepositoryImpl$syncLessonSimplify$2 lessonRepositoryImpl$syncLessonSimplify$2 = new LessonRepositoryImpl$syncLessonSimplify$2(this, resultLesson3, i, null);
            lessonRepositoryImpl$syncLessonSimplify$1.f15552a = str;
            lessonRepositoryImpl$syncLessonSimplify$1.f15553b = resultLesson3;
            lessonRepositoryImpl$syncLessonSimplify$1.f15554c = i;
            lessonRepositoryImpl$syncLessonSimplify$1.f15555d = z;
            lessonRepositoryImpl$syncLessonSimplify$1.f15558g = 2;
            if (AbstractC0747e.m2849b(lingQDatabase, lessonRepositoryImpl$syncLessonSimplify$2, lessonRepositoryImpl$syncLessonSimplify$1) != coroutineSingletons) {
                str2 = str;
                z2 = z;
                resultLesson = resultLesson3;
                if (z2) {
                    AbstractC1320h abstractC1320h2 = this.f16498b;
                    lessonRepositoryImpl$syncLessonSimplify$1.f15552a = str2;
                    lessonRepositoryImpl$syncLessonSimplify$1.f15553b = resultLesson;
                    lessonRepositoryImpl$syncLessonSimplify$1.f15554c = i;
                    lessonRepositoryImpl$syncLessonSimplify$1.f15555d = z2;
                    lessonRepositoryImpl$syncLessonSimplify$1.f15558g = 3;
                    objM14896I = abstractC1320h2.mo7500z0(i, lessonRepositoryImpl$syncLessonSimplify$1);
                    if (objM14896I != coroutineSingletons) {
                        i2 = i;
                        resultLesson2 = resultLesson;
                        str3 = str2;
                        lessonEntity = (LessonEntity) objM14896I;
                        if (lessonEntity != null) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putInt("source lesson id", i2);
                            bundle2.putString("source lesson name", lessonEntity.m7710q0());
                            bundle2.putInt("source course id", lessonEntity.m7695j());
                            bundle2.putString("source course name", lessonEntity.m7697k());
                            bundle2.putString("source lesson level", lessonEntity.m7645B());
                            List listM7708p1 = lessonEntity.m7708p0();
                            bundle2.putString("tags", listM7708p1 != null ? u91.m22596N0(listM7708p1, null, null, null, null, 63) : null);
                            bundle2.putString("source shared by", lessonEntity.m7690g0());
                            bundle2.putString("lesson language", str3);
                            bundle2.putInt("simplified lesson id", resultLesson2.m8364b());
                            ((C1240a) this.f16505i).m7025f("lesson simplified", bundle2);
                        }
                    }
                }
                return xfa.f68157a;
            }
            return coroutineSingletons;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: Y */
    public final Object m7267Y(int i, int i2, boolean z, ContinuationImpl continuationImpl) {
        RequestLessonUpdateSave requestLessonUpdateSave = new RequestLessonUpdateSave();
        requestLessonUpdateSave.m8261a(i2);
        k65 k65Var = this.f16502f;
        if (z) {
            Object objM14907o = k65Var.m14907o(new Integer(i), requestLessonUpdateSave, continuationImpl);
            if (objM14907o == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objM14907o;
            }
        } else {
            Object objM14893F = k65Var.m14893F(new Integer(i), requestLessonUpdateSave, continuationImpl);
            if (objM14893F == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objM14893F;
            }
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x012f, code lost:
    
        if (r3 == r5) goto L56;
     */
    /* JADX INFO: renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7268Z(int i, int i2, String str, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$syncUpdateSentence$1 lessonRepositoryImpl$syncUpdateSentence$1;
        String str2;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i3 = i;
        int i4 = i2;
        if (continuationImpl instanceof LessonRepositoryImpl$syncUpdateSentence$1) {
            lessonRepositoryImpl$syncUpdateSentence$1 = (LessonRepositoryImpl$syncUpdateSentence$1) continuationImpl;
            int i5 = lessonRepositoryImpl$syncUpdateSentence$1.f15568f;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$syncUpdateSentence$1.f15568f = i5 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$syncUpdateSentence$1 = new LessonRepositoryImpl$syncUpdateSentence$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$syncUpdateSentence$1 = new LessonRepositoryImpl$syncUpdateSentence$1(this, continuationImpl);
        }
        Object objMo7485B0 = lessonRepositoryImpl$syncUpdateSentence$1.f15566d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = lessonRepositoryImpl$syncUpdateSentence$1.f15568f;
        try {
            if (i6 == 0) {
                AbstractC3193b.m15359b(objMo7485B0);
                AbstractC1320h abstractC1320h = this.f16498b;
                str2 = str;
                lessonRepositoryImpl$syncUpdateSentence$1.f15565c = str2;
                lessonRepositoryImpl$syncUpdateSentence$1.f15563a = i3;
                lessonRepositoryImpl$syncUpdateSentence$1.f15564b = i4;
                lessonRepositoryImpl$syncUpdateSentence$1.f15568f = 1;
                objMo7485B0 = abstractC1320h.mo7485B0(i3, i4, lessonRepositoryImpl$syncUpdateSentence$1);
                if (objMo7485B0 == coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i6 == 1) {
                int i7 = lessonRepositoryImpl$syncUpdateSentence$1.f15564b;
                int i8 = lessonRepositoryImpl$syncUpdateSentence$1.f15563a;
                str2 = lessonRepositoryImpl$syncUpdateSentence$1.f15565c;
                AbstractC3193b.m15359b(objMo7485B0);
                i4 = i7;
                i3 = i8;
            } else {
                if (i6 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objMo7485B0);
            }
            return xfa.f68157a;
            TranslationSentenceEntity translationSentenceEntity = (TranslationSentenceEntity) objMo7485B0;
            if (translationSentenceEntity != null) {
                k65 k65Var = this.f16502f;
                Integer num = new Integer(i3);
                int iM7816d = translationSentenceEntity.m7816d();
                List listM23605K = vz1.m23605K(translationSentenceEntity.m7814b(), translationSentenceEntity.m7815c());
                String strM7819g = translationSentenceEntity.m7819g();
                List listM7820h = translationSentenceEntity.m7820h();
                if (listM7820h.isEmpty()) {
                    listM7820h = null;
                }
                if (listM7820h != null) {
                    List<Translation> list = listM7820h;
                    ArrayList arrayList3 = new ArrayList(v91.m23189q0(list, 10));
                    for (Translation translation : list) {
                        TranslationSentenceEntity translationSentenceEntity2 = translationSentenceEntity;
                        arrayList3.add(new RequestTranslation(translation.m8079b(), translation.m8078a(), translation.m8080c() ? "Google" : null));
                        translationSentenceEntity = translationSentenceEntity2;
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                List listM7818f = translationSentenceEntity.m7818f();
                if (listM7818f.isEmpty()) {
                    listM7818f = null;
                }
                if (listM7818f != null) {
                    List<Note> list2 = listM7818f;
                    ArrayList arrayList4 = new ArrayList(v91.m23189q0(list2, 10));
                    for (Note note : list2) {
                        arrayList4.add(new RequestNote(note.m8076b(), note.m8077c()));
                    }
                    arrayList2 = arrayList4;
                } else {
                    arrayList2 = null;
                }
                RequestTranslationSentence requestTranslationSentence = new RequestTranslationSentence(iM7816d, listM23605K, strM7819g, arrayList, arrayList2);
                lessonRepositoryImpl$syncUpdateSentence$1.f15565c = null;
                lessonRepositoryImpl$syncUpdateSentence$1.f15563a = i3;
                lessonRepositoryImpl$syncUpdateSentence$1.f15564b = i4;
                lessonRepositoryImpl$syncUpdateSentence$1.f15568f = 2;
                objMo7485B0 = k65Var.m14892D(str2, num, requestTranslationSentence, lessonRepositoryImpl$syncUpdateSentence$1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a2 A[Catch: Exception -> 0x00e5, TryCatch #1 {Exception -> 0x00e5, blocks: (B:14:0x0034, B:46:0x00db, B:19:0x0043, B:36:0x009d, B:38:0x00a2, B:40:0x00ac, B:43:0x00b5, B:22:0x0049, B:33:0x008d, B:29:0x0076), top: B:54:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ac A[Catch: Exception -> 0x00e5, TryCatch #1 {Exception -> 0x00e5, blocks: (B:14:0x0034, B:46:0x00db, B:19:0x0043, B:36:0x009d, B:38:0x00a2, B:40:0x00ac, B:43:0x00b5, B:22:0x0049, B:33:0x008d, B:29:0x0076), top: B:54:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d8, code lost:
    
        if (r2 == r3) goto L45;
     */
    /* JADX INFO: renamed from: a0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7269a0(int i, String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$syncUploadLessonAudio$1 lessonRepositoryImpl$syncUploadLessonAudio$1;
        xv5 xv5VarM14103q;
        int i2;
        ResultLessonUpload resultLessonUpload;
        LessonEntity lessonEntity;
        Integer numM8368b;
        int iIntValue;
        if (continuationImpl instanceof LessonRepositoryImpl$syncUploadLessonAudio$1) {
            lessonRepositoryImpl$syncUploadLessonAudio$1 = (LessonRepositoryImpl$syncUploadLessonAudio$1) continuationImpl;
            int i3 = lessonRepositoryImpl$syncUploadLessonAudio$1.f15573e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$syncUploadLessonAudio$1.f15573e = i3 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$syncUploadLessonAudio$1 = new LessonRepositoryImpl$syncUploadLessonAudio$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$syncUploadLessonAudio$1 = new LessonRepositoryImpl$syncUploadLessonAudio$1(this, continuationImpl);
        }
        LessonRepositoryImpl$syncUploadLessonAudio$1 lessonRepositoryImpl$syncUploadLessonAudio$2 = lessonRepositoryImpl$syncUploadLessonAudio$1;
        Object objM14913v = lessonRepositoryImpl$syncUploadLessonAudio$2.f15571c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = lessonRepositoryImpl$syncUploadLessonAudio$2.f15573e;
        AbstractC1320h abstractC1320h = this.f16498b;
        try {
            if (i4 == 0) {
                AbstractC3193b.m15359b(objM14913v);
                File file = new File(str2);
                String strM22989l = ux5.m22989l("tts-generated-", i, ".mp3");
                int i5 = z68.f70989a;
                Regex regex = xv5.f68845e;
                try {
                    xv5VarM14103q = AbstractC3122is.m14103q("audio/mpeg");
                } catch (IllegalArgumentException unused) {
                    xv5VarM14103q = null;
                }
                l56 l56VarM17007a = mqb.m17007a("audio", strM22989l, new x68(xv5VarM14103q, file));
                k65 k65Var = this.f16502f;
                Integer num = new Integer(i);
                lessonRepositoryImpl$syncUploadLessonAudio$2.f15569a = i;
                lessonRepositoryImpl$syncUploadLessonAudio$2.f15573e = 1;
                objM14913v = k65Var.m14913v(str, num, l56VarM17007a, str, lessonRepositoryImpl$syncUploadLessonAudio$2);
                if (objM14913v != coroutineSingletons) {
                    i2 = i;
                }
                return coroutineSingletons;
            }
            if (i4 == 1) {
                i2 = lessonRepositoryImpl$syncUploadLessonAudio$2.f15569a;
                AbstractC3193b.m15359b(objM14913v);
            } else {
                if (i4 == 2) {
                    i2 = lessonRepositoryImpl$syncUploadLessonAudio$2.f15569a;
                    resultLessonUpload = lessonRepositoryImpl$syncUploadLessonAudio$2.f15570b;
                    AbstractC3193b.m15359b(objM14913v);
                    lessonEntity = (LessonEntity) objM14913v;
                    if (lessonEntity != null) {
                        String strM8367a = resultLessonUpload.m8367a();
                        numM8368b = resultLessonUpload.m8368b();
                        if (numM8368b != null) {
                            iIntValue = numM8368b.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        LessonEntity lessonEntityM7642a = LessonEntity.m7642a(lessonEntity, strM8367a, iIntValue, 0, 0.0d, 0.0d, 0, false, null, null, -769, -1, 4194303);
                        lessonRepositoryImpl$syncUploadLessonAudio$2.f15570b = null;
                        lessonRepositoryImpl$syncUploadLessonAudio$2.f15569a = i2;
                        lessonRepositoryImpl$syncUploadLessonAudio$2.f15573e = 3;
                        objM14913v = abstractC1320h.mo4095v0(lessonEntityM7642a, lessonRepositoryImpl$syncUploadLessonAudio$2);
                    }
                    return xfa.f68157a;
                }
                if (i4 != 3) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM14913v);
            }
            lda.m16122h(((Number) objM14913v).longValue());
            return xfa.f68157a;
            resultLessonUpload = (ResultLessonUpload) objM14913v;
            lessonRepositoryImpl$syncUploadLessonAudio$2.f15570b = resultLessonUpload;
            lessonRepositoryImpl$syncUploadLessonAudio$2.f15569a = i2;
            lessonRepositoryImpl$syncUploadLessonAudio$2.f15573e = 2;
            objM14913v = abstractC1320h.mo7500z0(i2, lessonRepositoryImpl$syncUploadLessonAudio$2);
            if (objM14913v != coroutineSingletons) {
                lessonEntity = (LessonEntity) objM14913v;
                if (lessonEntity != null) {
                    String strM8367a2 = resultLessonUpload.m8367a();
                    numM8368b = resultLessonUpload.m8368b();
                    if (numM8368b != null) {
                        iIntValue = numM8368b.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    LessonEntity lessonEntityM7642a2 = LessonEntity.m7642a(lessonEntity, strM8367a2, iIntValue, 0, 0.0d, 0.0d, 0, false, null, null, -769, -1, 4194303);
                    lessonRepositoryImpl$syncUploadLessonAudio$2.f15570b = null;
                    lessonRepositoryImpl$syncUploadLessonAudio$2.f15569a = i2;
                    lessonRepositoryImpl$syncUploadLessonAudio$2.f15573e = 3;
                    objM14913v = abstractC1320h.mo4095v0(lessonEntityM7642a2, lessonRepositoryImpl$syncUploadLessonAudio$2);
                }
                return xfa.f68157a;
            }
            return coroutineSingletons;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00be A[PHI: r0 r1 r2
      0x00be: PHI (r0v7 boolean) = (r0v5 boolean), (r0v11 boolean) binds: [B:32:0x00bb, B:17:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x00be: PHI (r1v4 int) = (r1v2 int), (r1v8 int) binds: [B:32:0x00bb, B:17:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x00be: PHI (r2v8 java.lang.Object) = (r2v5 java.lang.Object), (r2v1 java.lang.Object) binds: [B:32:0x00bb, B:17:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00dc, code lost:
    
        if (r2 == r4) goto L38;
     */
    /* JADX INFO: renamed from: b0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7270b0(int i, boolean z, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$updateIsTaken$1 lessonRepositoryImpl$updateIsTaken$1;
        boolean z2;
        Object objMo7500z0;
        boolean z3;
        u85 u85Var;
        int i2 = i;
        if (continuationImpl instanceof LessonRepositoryImpl$updateIsTaken$1) {
            lessonRepositoryImpl$updateIsTaken$1 = (LessonRepositoryImpl$updateIsTaken$1) continuationImpl;
            int i3 = lessonRepositoryImpl$updateIsTaken$1.f15578e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$updateIsTaken$1.f15578e = i3 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$updateIsTaken$1 = new LessonRepositoryImpl$updateIsTaken$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$updateIsTaken$1 = new LessonRepositoryImpl$updateIsTaken$1(this, continuationImpl);
        }
        Object objM7505C0 = lessonRepositoryImpl$updateIsTaken$1.f15576c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = lessonRepositoryImpl$updateIsTaken$1.f15578e;
        C1321i c1321i = this.f16501e;
        AbstractC1320h abstractC1320h = this.f16498b;
        if (i4 == 0) {
            AbstractC3193b.m15359b(objM7505C0);
            lessonRepositoryImpl$updateIsTaken$1.f15574a = i2;
            z2 = z;
            lessonRepositoryImpl$updateIsTaken$1.f15575b = z2;
            lessonRepositoryImpl$updateIsTaken$1.f15578e = 1;
            objMo7500z0 = abstractC1320h.mo7500z0(i2, lessonRepositoryImpl$updateIsTaken$1);
            if (objMo7500z0 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i4 == 1) {
            boolean z4 = lessonRepositoryImpl$updateIsTaken$1.f15575b;
            int i5 = lessonRepositoryImpl$updateIsTaken$1.f15574a;
            AbstractC3193b.m15359b(objM7505C0);
            z2 = z4;
            i2 = i5;
            objMo7500z0 = objM7505C0;
        } else {
            if (i4 == 2) {
                z3 = lessonRepositoryImpl$updateIsTaken$1.f15575b;
                i2 = lessonRepositoryImpl$updateIsTaken$1.f15574a;
                AbstractC3193b.m15359b(objM7505C0);
                lda.m16122h(((Number) objM7505C0).longValue());
                lessonRepositoryImpl$updateIsTaken$1.f15574a = i2;
                lessonRepositoryImpl$updateIsTaken$1.f15575b = z3;
                lessonRepositoryImpl$updateIsTaken$1.f15578e = 3;
                objM7505C0 = c1321i.m7505C0(i2, lessonRepositoryImpl$updateIsTaken$1);
                if (objM7505C0 != coroutineSingletons) {
                    u85Var = (u85) objM7505C0;
                    if (u85Var != null) {
                        u85 u85VarM22536a = u85.m22536a(u85Var, Boolean.valueOf(z3), 0.0d, 0.0d, 131063);
                        lessonRepositoryImpl$updateIsTaken$1.f15574a = i2;
                        lessonRepositoryImpl$updateIsTaken$1.f15575b = z3;
                        lessonRepositoryImpl$updateIsTaken$1.f15578e = 4;
                        objM7505C0 = c1321i.mo4095v0(u85VarM22536a, lessonRepositoryImpl$updateIsTaken$1);
                    }
                    return xfa.f68157a;
                }
                return coroutineSingletons;
            }
            if (i4 == 3) {
                z3 = lessonRepositoryImpl$updateIsTaken$1.f15575b;
                i2 = lessonRepositoryImpl$updateIsTaken$1.f15574a;
                AbstractC3193b.m15359b(objM7505C0);
                u85Var = (u85) objM7505C0;
                if (u85Var != null) {
                    u85 u85VarM22536a2 = u85.m22536a(u85Var, Boolean.valueOf(z3), 0.0d, 0.0d, 131063);
                    lessonRepositoryImpl$updateIsTaken$1.f15574a = i2;
                    lessonRepositoryImpl$updateIsTaken$1.f15575b = z3;
                    lessonRepositoryImpl$updateIsTaken$1.f15578e = 4;
                    objM7505C0 = c1321i.mo4095v0(u85VarM22536a2, lessonRepositoryImpl$updateIsTaken$1);
                }
                return xfa.f68157a;
            }
            if (i4 != 4) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM7505C0);
        }
        lda.m16122h(((Number) objM7505C0).longValue());
        return xfa.f68157a;
        LessonEntity lessonEntity = (LessonEntity) objMo7500z0;
        if (lessonEntity != null) {
            LessonEntity lessonEntityM7642a = LessonEntity.m7642a(lessonEntity, null, 0, 0, 0.0d, 0.0d, 0, false, Boolean.valueOf(z2), null, -1, -1, 4186111);
            lessonRepositoryImpl$updateIsTaken$1.f15574a = i2;
            lessonRepositoryImpl$updateIsTaken$1.f15575b = z2;
            lessonRepositoryImpl$updateIsTaken$1.f15578e = 2;
            Object objMo4095v0 = abstractC1320h.mo4095v0(lessonEntityM7642a, lessonRepositoryImpl$updateIsTaken$1);
            if (objMo4095v0 != coroutineSingletons) {
                boolean z5 = z2;
                objM7505C0 = objMo4095v0;
                z3 = z5;
                lda.m16122h(((Number) objM7505C0).longValue());
                lessonRepositoryImpl$updateIsTaken$1.f15574a = i2;
                lessonRepositoryImpl$updateIsTaken$1.f15575b = z3;
                lessonRepositoryImpl$updateIsTaken$1.f15578e = 3;
                objM7505C0 = c1321i.m7505C0(i2, lessonRepositoryImpl$updateIsTaken$1);
                if (objM7505C0 != coroutineSingletons) {
                    u85Var = (u85) objM7505C0;
                    if (u85Var != null) {
                        u85 u85VarM22536a3 = u85.m22536a(u85Var, Boolean.valueOf(z3), 0.0d, 0.0d, 131063);
                        lessonRepositoryImpl$updateIsTaken$1.f15574a = i2;
                        lessonRepositoryImpl$updateIsTaken$1.f15575b = z3;
                        lessonRepositoryImpl$updateIsTaken$1.f15578e = 4;
                        objM7505C0 = c1321i.mo4095v0(u85VarM22536a3, lessonRepositoryImpl$updateIsTaken$1);
                    }
                    return xfa.f68157a;
                }
            }
        } else {
            z3 = z2;
            lessonRepositoryImpl$updateIsTaken$1.f15574a = i2;
            lessonRepositoryImpl$updateIsTaken$1.f15575b = z3;
            lessonRepositoryImpl$updateIsTaken$1.f15578e = 3;
            objM7505C0 = c1321i.m7505C0(i2, lessonRepositoryImpl$updateIsTaken$1);
            if (objM7505C0 != coroutineSingletons) {
                u85Var = (u85) objM7505C0;
                if (u85Var != null) {
                    u85 u85VarM22536a4 = u85.m22536a(u85Var, Boolean.valueOf(z3), 0.0d, 0.0d, 131063);
                    lessonRepositoryImpl$updateIsTaken$1.f15574a = i2;
                    lessonRepositoryImpl$updateIsTaken$1.f15575b = z3;
                    lessonRepositoryImpl$updateIsTaken$1.f15578e = 4;
                    objM7505C0 = c1321i.mo4095v0(u85VarM22536a4, lessonRepositoryImpl$updateIsTaken$1);
                }
                return xfa.f68157a;
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: c0 */
    public final Object m7271c0(String str, int i, int i2, String str2, Integer num, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$updateLessonBookmark$1 lessonRepositoryImpl$updateLessonBookmark$1;
        Integer num2;
        int i3;
        String str3;
        int i4;
        String str4;
        int iIntValue;
        Integer numM8029b;
        int i5;
        int i6;
        double d;
        String str5;
        String str6;
        int i7;
        Double dM8028a;
        if (continuationImpl instanceof LessonRepositoryImpl$updateLessonBookmark$1) {
            lessonRepositoryImpl$updateLessonBookmark$1 = (LessonRepositoryImpl$updateLessonBookmark$1) continuationImpl;
            int i8 = lessonRepositoryImpl$updateLessonBookmark$1.f15588j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$updateLessonBookmark$1.f15588j = i8 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$updateLessonBookmark$1 = new LessonRepositoryImpl$updateLessonBookmark$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$updateLessonBookmark$1 = new LessonRepositoryImpl$updateLessonBookmark$1(this, continuationImpl);
        }
        Object obj = lessonRepositoryImpl$updateLessonBookmark$1.f15586h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = lessonRepositoryImpl$updateLessonBookmark$1.f15588j;
        AbstractC1320h abstractC1320h = this.f16498b;
        if (i9 == 0) {
            AbstractC3193b.m15359b(obj);
            lessonRepositoryImpl$updateLessonBookmark$1.f15579a = str;
            lessonRepositoryImpl$updateLessonBookmark$1.f15580b = str2;
            num2 = num;
            lessonRepositoryImpl$updateLessonBookmark$1.f15581c = num2;
            lessonRepositoryImpl$updateLessonBookmark$1.f15582d = i;
            lessonRepositoryImpl$updateLessonBookmark$1.f15583e = i2;
            lessonRepositoryImpl$updateLessonBookmark$1.f15588j = 1;
            Object objMo7484A0 = abstractC1320h.mo7484A0(i, lessonRepositoryImpl$updateLessonBookmark$1);
            if (objMo7484A0 != coroutineSingletons) {
                i3 = i;
                str3 = str2;
                i4 = i2;
                str4 = str;
                obj = objMo7484A0;
            }
            return coroutineSingletons;
        }
        if (i9 == 1) {
            i4 = lessonRepositoryImpl$updateLessonBookmark$1.f15583e;
            int i10 = lessonRepositoryImpl$updateLessonBookmark$1.f15582d;
            Integer num3 = lessonRepositoryImpl$updateLessonBookmark$1.f15581c;
            String str7 = lessonRepositoryImpl$updateLessonBookmark$1.f15580b;
            str4 = lessonRepositoryImpl$updateLessonBookmark$1.f15579a;
            AbstractC3193b.m15359b(obj);
            i3 = i10;
            str3 = str7;
            num2 = num3;
        } else {
            if (i9 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            double d2 = lessonRepositoryImpl$updateLessonBookmark$1.f15585g;
            int i11 = lessonRepositoryImpl$updateLessonBookmark$1.f15584f;
            int i12 = lessonRepositoryImpl$updateLessonBookmark$1.f15583e;
            int i13 = lessonRepositoryImpl$updateLessonBookmark$1.f15582d;
            String str8 = lessonRepositoryImpl$updateLessonBookmark$1.f15580b;
            String str9 = lessonRepositoryImpl$updateLessonBookmark$1.f15579a;
            AbstractC3193b.m15359b(obj);
            i6 = i11;
            str6 = str9;
            i5 = i12;
            d = d2;
            i7 = i13;
            str5 = str8;
        }
        m7282j(str6, i7, i5, i6, d, str5);
        return xfa.f68157a;
        LessonBookmark lessonBookmark = (LessonBookmark) obj;
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = (lessonBookmark == null || (numM8029b = lessonBookmark.m8029b()) == null) ? 0 : numM8029b.intValue();
        }
        double dDoubleValue = (lessonBookmark == null || (dM8028a = lessonBookmark.m8028a()) == null) ? 0.0d : dM8028a.doubleValue();
        double d3 = dDoubleValue;
        LessonBookmarkEntity lessonBookmarkEntity = new LessonBookmarkEntity(i3, new Double(dDoubleValue), new Integer(i4), new Integer(iIntValue), "Android", str3, str3);
        String str10 = str3;
        lessonRepositoryImpl$updateLessonBookmark$1.f15579a = str4;
        lessonRepositoryImpl$updateLessonBookmark$1.f15580b = str10;
        lessonRepositoryImpl$updateLessonBookmark$1.f15581c = null;
        lessonRepositoryImpl$updateLessonBookmark$1.f15582d = i3;
        lessonRepositoryImpl$updateLessonBookmark$1.f15583e = i4;
        lessonRepositoryImpl$updateLessonBookmark$1.f15584f = iIntValue;
        lessonRepositoryImpl$updateLessonBookmark$1.f15585g = d3;
        lessonRepositoryImpl$updateLessonBookmark$1.f15588j = 2;
        if (abstractC1320h.mo7489F0(lessonBookmarkEntity, lessonRepositoryImpl$updateLessonBookmark$1) != coroutineSingletons) {
            i5 = i4;
            i6 = iIntValue;
            d = d3;
            str5 = str10;
            str6 = str4;
            i7 = i3;
            m7282j(str6, i7, i5, i6, d, str5);
            return xfa.f68157a;
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x014a A[LOOP:0: B:37:0x0147->B:39:0x014a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: d0 */
    public final Object m7272d0(int i, String str, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$updateLessonComplete$1 lessonRepositoryImpl$updateLessonComplete$1;
        String str2;
        Object objMo7500z0;
        String str3;
        Pair[] pairArr;
        hi8 hi8Var;
        int i2;
        int i3 = i;
        if (continuationImpl instanceof LessonRepositoryImpl$updateLessonComplete$1) {
            lessonRepositoryImpl$updateLessonComplete$1 = (LessonRepositoryImpl$updateLessonComplete$1) continuationImpl;
            int i4 = lessonRepositoryImpl$updateLessonComplete$1.f15593e;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$updateLessonComplete$1.f15593e = i4 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$updateLessonComplete$1 = new LessonRepositoryImpl$updateLessonComplete$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$updateLessonComplete$1 = new LessonRepositoryImpl$updateLessonComplete$1(this, continuationImpl);
        }
        Object obj = lessonRepositoryImpl$updateLessonComplete$1.f15591c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = lessonRepositoryImpl$updateLessonComplete$1.f15593e;
        AbstractC1320h abstractC1320h = this.f16498b;
        if (i5 == 0) {
            AbstractC3193b.m15359b(obj);
            str2 = str;
            lessonRepositoryImpl$updateLessonComplete$1.f15589a = str2;
            lessonRepositoryImpl$updateLessonComplete$1.f15590b = i3;
            lessonRepositoryImpl$updateLessonComplete$1.f15593e = 1;
            objMo7500z0 = abstractC1320h.mo7500z0(i3, lessonRepositoryImpl$updateLessonComplete$1);
            if (objMo7500z0 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i5 == 1) {
            i3 = lessonRepositoryImpl$updateLessonComplete$1.f15590b;
            String str4 = lessonRepositoryImpl$updateLessonComplete$1.f15589a;
            AbstractC3193b.m15359b(obj);
            objMo7500z0 = obj;
            str2 = str4;
        } else {
            if (i5 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i3 = lessonRepositoryImpl$updateLessonComplete$1.f15590b;
            str3 = lessonRepositoryImpl$updateLessonComplete$1.f15589a;
            AbstractC3193b.m15359b(obj);
        }
        String strM24804b = y02.m24804b();
        xj1 xj1Var = new xj1();
        xj1Var.m24558b(NetworkType.CONNECTED);
        tx6 tx6Var = (tx6) ((tx6) new tx6(LessonCompleteWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var.m24557a());
        pairArr = new Pair[]{new Pair("language", str3), new Pair("lessonId", Integer.valueOf(i3)), new Pair("creationDate", strM24804b)};
        hi8Var = new hi8(10);
        for (i2 = 0; i2 < 3; i2++) {
            Pair pair = pairArr[i2];
            hi8Var.m13287x(pair.f47624b, (String) pair.f47623a);
        }
        this.f16506j.m2912a((ux6) ((tx6) tx6Var.m15008g(hi8Var.m13282k())).m15004a());
        return xfa.f68157a;
        LessonEntity lessonEntity = (LessonEntity) objMo7500z0;
        if (lessonEntity != null && !lessonEntity.m7646B0()) {
            Bundle bundle = new Bundle();
            bundle.putInt("Lesson ID", lessonEntity.m7711r());
            bundle.putString("Lesson name", lessonEntity.m7710q0());
            bundle.putString("Lesson language", AbstractC3184kh.m15223q(str2));
            bundle.putString("Lesson level", lessonEntity.m7645B());
            bundle.putString("Course name", lessonEntity.m7697k());
            List listM7708p0 = lessonEntity.m7708p0();
            bundle.putString("Tags", listM7708p0 != null ? u91.m22596N0(listM7708p0, null, null, null, null, 63) : null);
            LessonMetadata lessonMetadataM7653F = lessonEntity.m7653F();
            String strM8043a = lessonMetadataM7653F != null ? lessonMetadataM7653F.m8043a() : null;
            if (strM8043a != null) {
                bundle.putString("original lesson name", strM8043a);
            }
            ((C1240a) this.f16505i).m7025f("Lesson completed", bundle);
            LessonEntity lessonEntityM7642a = LessonEntity.m7642a(lessonEntity, null, 0, 0, 0.0d, 0.0d, 0, false, null, null, -1, -9, 4194303);
            lessonRepositoryImpl$updateLessonComplete$1.f15589a = str2;
            lessonRepositoryImpl$updateLessonComplete$1.f15590b = i3;
            lessonRepositoryImpl$updateLessonComplete$1.f15593e = 2;
            if (abstractC1320h.mo4095v0(lessonEntityM7642a, lessonRepositoryImpl$updateLessonComplete$1) != coroutineSingletons) {
                str3 = str2;
                String strM24804b2 = y02.m24804b();
                xj1 xj1Var2 = new xj1();
                xj1Var2.m24558b(NetworkType.CONNECTED);
                tx6 tx6Var2 = (tx6) ((tx6) new tx6(LessonCompleteWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var2.m24557a());
                pairArr = new Pair[]{new Pair("language", str3), new Pair("lessonId", Integer.valueOf(i3)), new Pair("creationDate", strM24804b2)};
                hi8Var = new hi8(10);
                while (i2 < 3) {
                    Pair pair2 = pairArr[i2];
                    hi8Var.m13287x(pair2.f47624b, (String) pair2.f47623a);
                }
                this.f16506j.m2912a((ux6) ((tx6) tx6Var2.m15008g(hi8Var.m13282k())).m15004a());
            }
            return coroutineSingletons;
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r11.m7510I0(r13, r0) == r1) goto L24;
     */
    /* JADX INFO: renamed from: e0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7273e0(int i, boolean z, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$updateLessonCounterIsTaken$1 lessonRepositoryImpl$updateLessonCounterIsTaken$1;
        if (continuationImpl instanceof LessonRepositoryImpl$updateLessonCounterIsTaken$1) {
            lessonRepositoryImpl$updateLessonCounterIsTaken$1 = (LessonRepositoryImpl$updateLessonCounterIsTaken$1) continuationImpl;
            int i2 = lessonRepositoryImpl$updateLessonCounterIsTaken$1.f15598e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$updateLessonCounterIsTaken$1.f15598e = i2 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$updateLessonCounterIsTaken$1 = new LessonRepositoryImpl$updateLessonCounterIsTaken$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$updateLessonCounterIsTaken$1 = new LessonRepositoryImpl$updateLessonCounterIsTaken$1(this, continuationImpl);
        }
        Object objM7506D0 = lessonRepositoryImpl$updateLessonCounterIsTaken$1.f15596c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = lessonRepositoryImpl$updateLessonCounterIsTaken$1.f15598e;
        C1321i c1321i = this.f16501e;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM7506D0);
            String value = LibraryItemType.Content.getValue();
            lessonRepositoryImpl$updateLessonCounterIsTaken$1.f15594a = i;
            lessonRepositoryImpl$updateLessonCounterIsTaken$1.f15595b = z;
            lessonRepositoryImpl$updateLessonCounterIsTaken$1.f15598e = 1;
            objM7506D0 = c1321i.m7506D0(i, value, lessonRepositoryImpl$updateLessonCounterIsTaken$1);
            if (objM7506D0 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            z = lessonRepositoryImpl$updateLessonCounterIsTaken$1.f15595b;
            i = lessonRepositoryImpl$updateLessonCounterIsTaken$1.f15594a;
            AbstractC3193b.m15359b(objM7506D0);
        } else {
            if (i3 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM7506D0);
        }
        return xfa.f68157a;
        boolean z2 = z;
        LibraryCounterEntity libraryCounterEntity = (LibraryCounterEntity) objM7506D0;
        if (libraryCounterEntity != null) {
            LibraryCounterEntity libraryCounterEntityM7760a = LibraryCounterEntity.m7760a(libraryCounterEntity, false, null, null, z2, 0, 262079);
            lessonRepositoryImpl$updateLessonCounterIsTaken$1.f15594a = i;
            lessonRepositoryImpl$updateLessonCounterIsTaken$1.f15595b = z2;
            lessonRepositoryImpl$updateLessonCounterIsTaken$1.f15598e = 2;
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0080  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m7274f(int i, int i2, boolean z, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$buyLesson$1 lessonRepositoryImpl$buyLesson$1;
        int i3;
        boolean z2;
        if (continuationImpl instanceof LessonRepositoryImpl$buyLesson$1) {
            lessonRepositoryImpl$buyLesson$1 = (LessonRepositoryImpl$buyLesson$1) continuationImpl;
            int i4 = lessonRepositoryImpl$buyLesson$1.f15320f;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$buyLesson$1.f15320f = i4 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$buyLesson$1 = new LessonRepositoryImpl$buyLesson$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$buyLesson$1 = new LessonRepositoryImpl$buyLesson$1(this, continuationImpl);
        }
        Object obj = lessonRepositoryImpl$buyLesson$1.f15318d;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = lessonRepositoryImpl$buyLesson$1.f15320f;
        xfa xfaVar = xfa.f68157a;
        if (i5 == 0) {
            AbstractC3193b.m15359b(obj);
            lessonRepositoryImpl$buyLesson$1.f15315a = i;
            lessonRepositoryImpl$buyLesson$1.f15316b = i2;
            lessonRepositoryImpl$buyLesson$1.f15317c = z;
            lessonRepositoryImpl$buyLesson$1.f15320f = 1;
            if (m7270b0(i2, true, lessonRepositoryImpl$buyLesson$1) != obj2) {
            }
            return obj2;
        }
        if (i5 == 1) {
            z = lessonRepositoryImpl$buyLesson$1.f15317c;
            i2 = lessonRepositoryImpl$buyLesson$1.f15316b;
            i = lessonRepositoryImpl$buyLesson$1.f15315a;
            AbstractC3193b.m15359b(obj);
        } else {
            if (i5 != 2) {
                if (i5 == 3) {
                    AbstractC3193b.m15359b(obj);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = lessonRepositoryImpl$buyLesson$1.f15317c;
            i2 = lessonRepositoryImpl$buyLesson$1.f15316b;
            i3 = lessonRepositoryImpl$buyLesson$1.f15315a;
            AbstractC3193b.m15359b(obj);
        }
        if (z2) {
            m7280i(i3, i2, true);
            return xfaVar;
        }
        lessonRepositoryImpl$buyLesson$1.f15315a = i3;
        lessonRepositoryImpl$buyLesson$1.f15316b = i2;
        lessonRepositoryImpl$buyLesson$1.f15317c = z2;
        lessonRepositoryImpl$buyLesson$1.f15320f = 3;
        if (m7267Y(i3, i2, true, lessonRepositoryImpl$buyLesson$1) != obj2) {
            return obj2;
        }
        return xfaVar;
        lessonRepositoryImpl$buyLesson$1.f15315a = i;
        lessonRepositoryImpl$buyLesson$1.f15316b = i2;
        lessonRepositoryImpl$buyLesson$1.f15317c = z;
        lessonRepositoryImpl$buyLesson$1.f15320f = 2;
        if (m7273e0(i2, true, lessonRepositoryImpl$buyLesson$1) != obj2) {
            boolean z3 = z;
            i3 = i;
            z2 = z3;
            if (z2) {
                m7280i(i3, i2, true);
                return xfaVar;
            }
            lessonRepositoryImpl$buyLesson$1.f15315a = i3;
            lessonRepositoryImpl$buyLesson$1.f15316b = i2;
            lessonRepositoryImpl$buyLesson$1.f15317c = z2;
            lessonRepositoryImpl$buyLesson$1.f15320f = 3;
            if (m7267Y(i3, i2, true, lessonRepositoryImpl$buyLesson$1) != obj2) {
                return xfaVar;
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
    
        if (r13.m7510I0(r15, r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0089, code lost:
    
        if (r13.m7510I0(r15, r0) == r1) goto L30;
     */
    /* JADX INFO: renamed from: f0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7275f0(int i, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$updateLessonCounterLike$1 lessonRepositoryImpl$updateLessonCounterLike$1;
        if (continuationImpl instanceof LessonRepositoryImpl$updateLessonCounterLike$1) {
            lessonRepositoryImpl$updateLessonCounterLike$1 = (LessonRepositoryImpl$updateLessonCounterLike$1) continuationImpl;
            int i2 = lessonRepositoryImpl$updateLessonCounterLike$1.f15602d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$updateLessonCounterLike$1.f15602d = i2 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$updateLessonCounterLike$1 = new LessonRepositoryImpl$updateLessonCounterLike$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$updateLessonCounterLike$1 = new LessonRepositoryImpl$updateLessonCounterLike$1(this, continuationImpl);
        }
        Object objM7506D0 = lessonRepositoryImpl$updateLessonCounterLike$1.f15600b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = lessonRepositoryImpl$updateLessonCounterLike$1.f15602d;
        C1321i c1321i = this.f16501e;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM7506D0);
            String value = LibraryItemType.Content.getValue();
            lessonRepositoryImpl$updateLessonCounterLike$1.f15599a = i;
            lessonRepositoryImpl$updateLessonCounterLike$1.f15602d = 1;
            objM7506D0 = c1321i.m7506D0(i, value, lessonRepositoryImpl$updateLessonCounterLike$1);
            if (objM7506D0 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            i = lessonRepositoryImpl$updateLessonCounterLike$1.f15599a;
            AbstractC3193b.m15359b(objM7506D0);
        } else {
            if (i3 != 2 && i3 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM7506D0);
        }
        return xfa.f68157a;
        LibraryCounterEntity libraryCounterEntity = (LibraryCounterEntity) objM7506D0;
        if (libraryCounterEntity != null) {
            int i4 = libraryCounterEntity.f17365i;
            if (libraryCounterEntity.f17359c) {
                LibraryCounterEntity libraryCounterEntityM7760a = LibraryCounterEntity.m7760a(libraryCounterEntity, false, null, null, false, i4 - 1, 261883);
                lessonRepositoryImpl$updateLessonCounterLike$1.f15599a = i;
                lessonRepositoryImpl$updateLessonCounterLike$1.f15602d = 2;
            } else {
                LibraryCounterEntity libraryCounterEntityM7760a2 = LibraryCounterEntity.m7760a(libraryCounterEntity, true, null, null, false, i4 + 1, 261883);
                lessonRepositoryImpl$updateLessonCounterLike$1.f15599a = i;
                lessonRepositoryImpl$updateLessonCounterLike$1.f15602d = 3;
            }
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: g */
    public final void m7276g(int i, String str) {
        xj1 xj1Var = new xj1();
        xj1Var.m24558b(NetworkType.CONNECTED);
        tx6 tx6Var = (tx6) ((tx6) new tx6(LessonDeleteRoseWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var.m24557a());
        Pair[] pairArr = {new Pair("language", str), new Pair("lessonId", Integer.valueOf(i))};
        hi8 hi8Var = new hi8(10);
        for (int i2 = 0; i2 < 2; i2++) {
            Pair pair = pairArr[i2];
            hi8Var.m13287x(pair.f47624b, (String) pair.f47623a);
        }
        this.f16506j.m2912a((ux6) ((tx6) tx6Var.m15008g(hi8Var.m13282k())).m15004a());
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:35:0x0118 A[PHI: r1 r14
      0x0118: PHI (r1v5 int) = (r1v3 int), (r1v6 int) binds: [B:33:0x0114, B:17:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x0118: PHI (r14v7 java.lang.String) = (r14v4 java.lang.String), (r14v8 java.lang.String) binds: [B:33:0x0114, B:17:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x012b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0131  */
    /* JADX WARN: Code duplicated, block: B:43:0x0166  */
    /* JADX WARN: Code duplicated, block: B:47:0x017a  */
    /* JADX WARN: Code duplicated, block: B:50:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:52:0x01df  */
    /* JADX WARN: Code duplicated, block: B:53:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:55:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:58:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:60:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:63:0x020f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: g0 */
    public final Object m7277g0(int i, String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$updateLessonLike$1 lessonRepositoryImpl$updateLessonLike$1;
        String str3;
        String str4;
        LessonEntity lessonEntity;
        Object objM7506D0;
        LessonEntity lessonEntity2;
        LibraryCounterEntity libraryCounterEntity;
        String str5;
        String str6;
        String str7;
        LessonEntity lessonEntityM7642a;
        String str8;
        LessonEntity lessonEntityM7642a2;
        String str9;
        String str10;
        LessonEntity lessonEntity3;
        int i2 = i;
        if (continuationImpl instanceof LessonRepositoryImpl$updateLessonLike$1) {
            lessonRepositoryImpl$updateLessonLike$1 = (LessonRepositoryImpl$updateLessonLike$1) continuationImpl;
            int i3 = lessonRepositoryImpl$updateLessonLike$1.f15609g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$updateLessonLike$1.f15609g = i3 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$updateLessonLike$1 = new LessonRepositoryImpl$updateLessonLike$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$updateLessonLike$1 = new LessonRepositoryImpl$updateLessonLike$1(this, continuationImpl);
        }
        Object obj = lessonRepositoryImpl$updateLessonLike$1.f15607e;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = lessonRepositoryImpl$updateLessonLike$1.f15609g;
        hm5 hm5Var = this.f16505i;
        AbstractC1320h abstractC1320h = this.f16498b;
        switch (i4) {
            case 0:
                AbstractC3193b.m15359b(obj);
                lessonRepositoryImpl$updateLessonLike$1.f15603a = str;
                str3 = str2;
                lessonRepositoryImpl$updateLessonLike$1.f15604b = str3;
                lessonRepositoryImpl$updateLessonLike$1.f15606d = i2;
                lessonRepositoryImpl$updateLessonLike$1.f15609g = 1;
                Object objMo7500z0 = abstractC1320h.mo7500z0(i2, lessonRepositoryImpl$updateLessonLike$1);
                if (objMo7500z0 != obj2) {
                    str4 = str;
                    obj = objMo7500z0;
                    lessonEntity = (LessonEntity) obj;
                    String value = LibraryItemType.Content.getValue();
                    lessonRepositoryImpl$updateLessonLike$1.f15603a = str4;
                    lessonRepositoryImpl$updateLessonLike$1.f15604b = str3;
                    lessonRepositoryImpl$updateLessonLike$1.f15605c = lessonEntity;
                    lessonRepositoryImpl$updateLessonLike$1.f15606d = i2;
                    lessonRepositoryImpl$updateLessonLike$1.f15609g = 2;
                    objM7506D0 = this.f16501e.m7506D0(i2, value, lessonRepositoryImpl$updateLessonLike$1);
                    if (objM7506D0 != obj2) {
                        lessonEntity2 = lessonEntity;
                        obj = objM7506D0;
                        libraryCounterEntity = (LibraryCounterEntity) obj;
                        if (lessonEntity2 == null) {
                            if (libraryCounterEntity != null) {
                                if (libraryCounterEntity.f17359c) {
                                    lessonRepositoryImpl$updateLessonLike$1.f15603a = str4;
                                    lessonRepositoryImpl$updateLessonLike$1.f15604b = null;
                                    lessonRepositoryImpl$updateLessonLike$1.f15605c = null;
                                    lessonRepositoryImpl$updateLessonLike$1.f15606d = i2;
                                    lessonRepositoryImpl$updateLessonLike$1.f15609g = 7;
                                    if (m7275f0(i2, lessonRepositoryImpl$updateLessonLike$1) != obj2) {
                                        str7 = str4;
                                        m7276g(i2, str7);
                                    }
                                } else {
                                    lessonRepositoryImpl$updateLessonLike$1.f15603a = str4;
                                    lessonRepositoryImpl$updateLessonLike$1.f15604b = str3;
                                    lessonRepositoryImpl$updateLessonLike$1.f15605c = null;
                                    lessonRepositoryImpl$updateLessonLike$1.f15606d = i2;
                                    lessonRepositoryImpl$updateLessonLike$1.f15609g = 8;
                                    if (m7275f0(i2, lessonRepositoryImpl$updateLessonLike$1) != obj2) {
                                        str5 = str3;
                                        str6 = str4;
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("Lesson ID", i2);
                                        bundle.putString("Lesson language", AbstractC3184kh.m15223q(str6));
                                        bundle.putString("like location", str5);
                                        ((C1240a) hm5Var).m7025f("Lesson liked", bundle);
                                        m7278h(i2, str6);
                                    }
                                }
                            }
                            return xfa.f68157a;
                        }
                        if (lessonEntity2.m7656G0()) {
                            lessonEntityM7642a2 = LessonEntity.m7642a(lessonEntity2, null, 0, lessonEntity2.m7684d0() - 1, 0.0d, 0.0d, 0, false, null, null, -32769, -65, 4194303);
                            lessonRepositoryImpl$updateLessonLike$1.f15603a = str4;
                            lessonRepositoryImpl$updateLessonLike$1.f15604b = null;
                            lessonRepositoryImpl$updateLessonLike$1.f15605c = null;
                            lessonRepositoryImpl$updateLessonLike$1.f15606d = i2;
                            lessonRepositoryImpl$updateLessonLike$1.f15609g = 3;
                            if (abstractC1320h.mo4095v0(lessonEntityM7642a2, lessonRepositoryImpl$updateLessonLike$1) != obj2) {
                                lessonRepositoryImpl$updateLessonLike$1.f15603a = str4;
                                lessonRepositoryImpl$updateLessonLike$1.f15604b = null;
                                lessonRepositoryImpl$updateLessonLike$1.f15605c = null;
                                lessonRepositoryImpl$updateLessonLike$1.f15606d = i2;
                                lessonRepositoryImpl$updateLessonLike$1.f15609g = 4;
                                if (m7275f0(i2, lessonRepositoryImpl$updateLessonLike$1) != obj2) {
                                    str9 = str4;
                                    m7276g(i2, str9);
                                    return xfa.f68157a;
                                }
                            }
                        } else {
                            lessonEntityM7642a = LessonEntity.m7642a(lessonEntity2, null, 0, lessonEntity2.m7684d0() + 1, 0.0d, 0.0d, 0, true, null, null, -32769, -65, 4194303);
                            lessonRepositoryImpl$updateLessonLike$1.f15603a = str4;
                            lessonRepositoryImpl$updateLessonLike$1.f15604b = str3;
                            lessonRepositoryImpl$updateLessonLike$1.f15605c = lessonEntity2;
                            lessonRepositoryImpl$updateLessonLike$1.f15606d = i2;
                            lessonRepositoryImpl$updateLessonLike$1.f15609g = 5;
                            if (abstractC1320h.mo4095v0(lessonEntityM7642a, lessonRepositoryImpl$updateLessonLike$1) != obj2) {
                                str8 = str4;
                                lessonRepositoryImpl$updateLessonLike$1.f15603a = str8;
                                lessonRepositoryImpl$updateLessonLike$1.f15604b = str3;
                                lessonRepositoryImpl$updateLessonLike$1.f15605c = lessonEntity2;
                                lessonRepositoryImpl$updateLessonLike$1.f15606d = i2;
                                lessonRepositoryImpl$updateLessonLike$1.f15609g = 6;
                                if (m7275f0(i2, lessonRepositoryImpl$updateLessonLike$1) != obj2) {
                                    str10 = str8;
                                    lessonEntity3 = lessonEntity2;
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putInt("Lesson ID", i2);
                                    bundle2.putString("Lesson language", AbstractC3184kh.m15223q(str10));
                                    bundle2.putString("Lesson name", lessonEntity3.m7710q0());
                                    bundle2.putString("Lesson level", lessonEntity3.m7645B());
                                    List listM7708p0 = lessonEntity3.m7708p0();
                                    bundle2.putString("Tags", listM7708p0 != null ? u91.m22596N0(listM7708p0, null, null, null, null, 63) : null);
                                    bundle2.putString("Shared By", lessonEntity3.m7690g0());
                                    bundle2.putString("Course name", lessonEntity3.m7697k());
                                    bundle2.putInt("Course ID", lessonEntity3.m7695j());
                                    bundle2.putString("like location", str3);
                                    ((C1240a) hm5Var).m7025f("Lesson liked", bundle2);
                                    m7278h(i2, str10);
                                    return xfa.f68157a;
                                }
                            }
                        }
                    }
                }
                return obj2;
            case 1:
                i2 = lessonRepositoryImpl$updateLessonLike$1.f15606d;
                str3 = lessonRepositoryImpl$updateLessonLike$1.f15604b;
                str4 = lessonRepositoryImpl$updateLessonLike$1.f15603a;
                AbstractC3193b.m15359b(obj);
                lessonEntity = (LessonEntity) obj;
                String value2 = LibraryItemType.Content.getValue();
                lessonRepositoryImpl$updateLessonLike$1.f15603a = str4;
                lessonRepositoryImpl$updateLessonLike$1.f15604b = str3;
                lessonRepositoryImpl$updateLessonLike$1.f15605c = lessonEntity;
                lessonRepositoryImpl$updateLessonLike$1.f15606d = i2;
                lessonRepositoryImpl$updateLessonLike$1.f15609g = 2;
                objM7506D0 = this.f16501e.m7506D0(i2, value2, lessonRepositoryImpl$updateLessonLike$1);
                if (objM7506D0 != obj2) {
                    lessonEntity2 = lessonEntity;
                    obj = objM7506D0;
                    libraryCounterEntity = (LibraryCounterEntity) obj;
                    if (lessonEntity2 == null) {
                        if (libraryCounterEntity != null) {
                            if (libraryCounterEntity.f17359c) {
                                lessonRepositoryImpl$updateLessonLike$1.f15603a = str4;
                                lessonRepositoryImpl$updateLessonLike$1.f15604b = null;
                                lessonRepositoryImpl$updateLessonLike$1.f15605c = null;
                                lessonRepositoryImpl$updateLessonLike$1.f15606d = i2;
                                lessonRepositoryImpl$updateLessonLike$1.f15609g = 7;
                                if (m7275f0(i2, lessonRepositoryImpl$updateLessonLike$1) != obj2) {
                                    str7 = str4;
                                    m7276g(i2, str7);
                                }
                            } else {
                                lessonRepositoryImpl$updateLessonLike$1.f15603a = str4;
                                lessonRepositoryImpl$updateLessonLike$1.f15604b = str3;
                                lessonRepositoryImpl$updateLessonLike$1.f15605c = null;
                                lessonRepositoryImpl$updateLessonLike$1.f15606d = i2;
                                lessonRepositoryImpl$updateLessonLike$1.f15609g = 8;
                                if (m7275f0(i2, lessonRepositoryImpl$updateLessonLike$1) != obj2) {
                                    str5 = str3;
                                    str6 = str4;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putInt("Lesson ID", i2);
                                    bundle3.putString("Lesson language", AbstractC3184kh.m15223q(str6));
                                    bundle3.putString("like location", str5);
                                    ((C1240a) hm5Var).m7025f("Lesson liked", bundle3);
                                    m7278h(i2, str6);
                                }
                            }
                        }
                        return xfa.f68157a;
                    }
                    if (lessonEntity2.m7656G0()) {
                        lessonEntityM7642a2 = LessonEntity.m7642a(lessonEntity2, null, 0, lessonEntity2.m7684d0() - 1, 0.0d, 0.0d, 0, false, null, null, -32769, -65, 4194303);
                        lessonRepositoryImpl$updateLessonLike$1.f15603a = str4;
                        lessonRepositoryImpl$updateLessonLike$1.f15604b = null;
                        lessonRepositoryImpl$updateLessonLike$1.f15605c = null;
                        lessonRepositoryImpl$updateLessonLike$1.f15606d = i2;
                        lessonRepositoryImpl$updateLessonLike$1.f15609g = 3;
                        if (abstractC1320h.mo4095v0(lessonEntityM7642a2, lessonRepositoryImpl$updateLessonLike$1) != obj2) {
                            lessonRepositoryImpl$updateLessonLike$1.f15603a = str4;
                            lessonRepositoryImpl$updateLessonLike$1.f15604b = null;
                            lessonRepositoryImpl$updateLessonLike$1.f15605c = null;
                            lessonRepositoryImpl$updateLessonLike$1.f15606d = i2;
                            lessonRepositoryImpl$updateLessonLike$1.f15609g = 4;
                            if (m7275f0(i2, lessonRepositoryImpl$updateLessonLike$1) != obj2) {
                                str9 = str4;
                                m7276g(i2, str9);
                                return xfa.f68157a;
                            }
                        }
                    } else {
                        lessonEntityM7642a = LessonEntity.m7642a(lessonEntity2, null, 0, lessonEntity2.m7684d0() + 1, 0.0d, 0.0d, 0, true, null, null, -32769, -65, 4194303);
                        lessonRepositoryImpl$updateLessonLike$1.f15603a = str4;
                        lessonRepositoryImpl$updateLessonLike$1.f15604b = str3;
                        lessonRepositoryImpl$updateLessonLike$1.f15605c = lessonEntity2;
                        lessonRepositoryImpl$updateLessonLike$1.f15606d = i2;
                        lessonRepositoryImpl$updateLessonLike$1.f15609g = 5;
                        if (abstractC1320h.mo4095v0(lessonEntityM7642a, lessonRepositoryImpl$updateLessonLike$1) != obj2) {
                            str8 = str4;
                            lessonRepositoryImpl$updateLessonLike$1.f15603a = str8;
                            lessonRepositoryImpl$updateLessonLike$1.f15604b = str3;
                            lessonRepositoryImpl$updateLessonLike$1.f15605c = lessonEntity2;
                            lessonRepositoryImpl$updateLessonLike$1.f15606d = i2;
                            lessonRepositoryImpl$updateLessonLike$1.f15609g = 6;
                            if (m7275f0(i2, lessonRepositoryImpl$updateLessonLike$1) != obj2) {
                                str10 = str8;
                                lessonEntity3 = lessonEntity2;
                                Bundle bundle4 = new Bundle();
                                bundle4.putInt("Lesson ID", i2);
                                bundle4.putString("Lesson language", AbstractC3184kh.m15223q(str10));
                                bundle4.putString("Lesson name", lessonEntity3.m7710q0());
                                bundle4.putString("Lesson level", lessonEntity3.m7645B());
                                List listM7708p1 = lessonEntity3.m7708p0();
                                bundle4.putString("Tags", listM7708p1 != null ? u91.m22596N0(listM7708p1, null, null, null, null, 63) : null);
                                bundle4.putString("Shared By", lessonEntity3.m7690g0());
                                bundle4.putString("Course name", lessonEntity3.m7697k());
                                bundle4.putInt("Course ID", lessonEntity3.m7695j());
                                bundle4.putString("like location", str3);
                                ((C1240a) hm5Var).m7025f("Lesson liked", bundle4);
                                m7278h(i2, str10);
                                return xfa.f68157a;
                            }
                        }
                    }
                }
                return obj2;
            case 2:
                i2 = lessonRepositoryImpl$updateLessonLike$1.f15606d;
                LessonEntity lessonEntity4 = lessonRepositoryImpl$updateLessonLike$1.f15605c;
                String str11 = lessonRepositoryImpl$updateLessonLike$1.f15604b;
                String str12 = lessonRepositoryImpl$updateLessonLike$1.f15603a;
                AbstractC3193b.m15359b(obj);
                lessonEntity2 = lessonEntity4;
                str3 = str11;
                str4 = str12;
                libraryCounterEntity = (LibraryCounterEntity) obj;
                if (lessonEntity2 == null) {
                    if (libraryCounterEntity != null) {
                        if (libraryCounterEntity.f17359c) {
                            lessonRepositoryImpl$updateLessonLike$1.f15603a = str4;
                            lessonRepositoryImpl$updateLessonLike$1.f15604b = null;
                            lessonRepositoryImpl$updateLessonLike$1.f15605c = null;
                            lessonRepositoryImpl$updateLessonLike$1.f15606d = i2;
                            lessonRepositoryImpl$updateLessonLike$1.f15609g = 7;
                            if (m7275f0(i2, lessonRepositoryImpl$updateLessonLike$1) != obj2) {
                                str7 = str4;
                                m7276g(i2, str7);
                            }
                        } else {
                            lessonRepositoryImpl$updateLessonLike$1.f15603a = str4;
                            lessonRepositoryImpl$updateLessonLike$1.f15604b = str3;
                            lessonRepositoryImpl$updateLessonLike$1.f15605c = null;
                            lessonRepositoryImpl$updateLessonLike$1.f15606d = i2;
                            lessonRepositoryImpl$updateLessonLike$1.f15609g = 8;
                            if (m7275f0(i2, lessonRepositoryImpl$updateLessonLike$1) != obj2) {
                                str5 = str3;
                                str6 = str4;
                                Bundle bundle5 = new Bundle();
                                bundle5.putInt("Lesson ID", i2);
                                bundle5.putString("Lesson language", AbstractC3184kh.m15223q(str6));
                                bundle5.putString("like location", str5);
                                ((C1240a) hm5Var).m7025f("Lesson liked", bundle5);
                                m7278h(i2, str6);
                            }
                        }
                    }
                    return xfa.f68157a;
                }
                if (lessonEntity2.m7656G0()) {
                    lessonEntityM7642a2 = LessonEntity.m7642a(lessonEntity2, null, 0, lessonEntity2.m7684d0() - 1, 0.0d, 0.0d, 0, false, null, null, -32769, -65, 4194303);
                    lessonRepositoryImpl$updateLessonLike$1.f15603a = str4;
                    lessonRepositoryImpl$updateLessonLike$1.f15604b = null;
                    lessonRepositoryImpl$updateLessonLike$1.f15605c = null;
                    lessonRepositoryImpl$updateLessonLike$1.f15606d = i2;
                    lessonRepositoryImpl$updateLessonLike$1.f15609g = 3;
                    if (abstractC1320h.mo4095v0(lessonEntityM7642a2, lessonRepositoryImpl$updateLessonLike$1) != obj2) {
                        lessonRepositoryImpl$updateLessonLike$1.f15603a = str4;
                        lessonRepositoryImpl$updateLessonLike$1.f15604b = null;
                        lessonRepositoryImpl$updateLessonLike$1.f15605c = null;
                        lessonRepositoryImpl$updateLessonLike$1.f15606d = i2;
                        lessonRepositoryImpl$updateLessonLike$1.f15609g = 4;
                        if (m7275f0(i2, lessonRepositoryImpl$updateLessonLike$1) != obj2) {
                            str9 = str4;
                            m7276g(i2, str9);
                            return xfa.f68157a;
                        }
                    }
                } else {
                    lessonEntityM7642a = LessonEntity.m7642a(lessonEntity2, null, 0, lessonEntity2.m7684d0() + 1, 0.0d, 0.0d, 0, true, null, null, -32769, -65, 4194303);
                    lessonRepositoryImpl$updateLessonLike$1.f15603a = str4;
                    lessonRepositoryImpl$updateLessonLike$1.f15604b = str3;
                    lessonRepositoryImpl$updateLessonLike$1.f15605c = lessonEntity2;
                    lessonRepositoryImpl$updateLessonLike$1.f15606d = i2;
                    lessonRepositoryImpl$updateLessonLike$1.f15609g = 5;
                    if (abstractC1320h.mo4095v0(lessonEntityM7642a, lessonRepositoryImpl$updateLessonLike$1) != obj2) {
                        str8 = str4;
                        lessonRepositoryImpl$updateLessonLike$1.f15603a = str8;
                        lessonRepositoryImpl$updateLessonLike$1.f15604b = str3;
                        lessonRepositoryImpl$updateLessonLike$1.f15605c = lessonEntity2;
                        lessonRepositoryImpl$updateLessonLike$1.f15606d = i2;
                        lessonRepositoryImpl$updateLessonLike$1.f15609g = 6;
                        if (m7275f0(i2, lessonRepositoryImpl$updateLessonLike$1) != obj2) {
                            str10 = str8;
                            lessonEntity3 = lessonEntity2;
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("Lesson ID", i2);
                            bundle6.putString("Lesson language", AbstractC3184kh.m15223q(str10));
                            bundle6.putString("Lesson name", lessonEntity3.m7710q0());
                            bundle6.putString("Lesson level", lessonEntity3.m7645B());
                            List listM7708p2 = lessonEntity3.m7708p0();
                            bundle6.putString("Tags", listM7708p2 != null ? u91.m22596N0(listM7708p2, null, null, null, null, 63) : null);
                            bundle6.putString("Shared By", lessonEntity3.m7690g0());
                            bundle6.putString("Course name", lessonEntity3.m7697k());
                            bundle6.putInt("Course ID", lessonEntity3.m7695j());
                            bundle6.putString("like location", str3);
                            ((C1240a) hm5Var).m7025f("Lesson liked", bundle6);
                            m7278h(i2, str10);
                            return xfa.f68157a;
                        }
                    }
                }
                return obj2;
            case 3:
                i2 = lessonRepositoryImpl$updateLessonLike$1.f15606d;
                String str13 = lessonRepositoryImpl$updateLessonLike$1.f15603a;
                AbstractC3193b.m15359b(obj);
                str4 = str13;
                lessonRepositoryImpl$updateLessonLike$1.f15603a = str4;
                lessonRepositoryImpl$updateLessonLike$1.f15604b = null;
                lessonRepositoryImpl$updateLessonLike$1.f15605c = null;
                lessonRepositoryImpl$updateLessonLike$1.f15606d = i2;
                lessonRepositoryImpl$updateLessonLike$1.f15609g = 4;
                if (m7275f0(i2, lessonRepositoryImpl$updateLessonLike$1) != obj2) {
                    str9 = str4;
                    m7276g(i2, str9);
                    return xfa.f68157a;
                }
                return obj2;
            case 4:
                i2 = lessonRepositoryImpl$updateLessonLike$1.f15606d;
                str9 = lessonRepositoryImpl$updateLessonLike$1.f15603a;
                AbstractC3193b.m15359b(obj);
                m7276g(i2, str9);
                return xfa.f68157a;
            case 5:
                i2 = lessonRepositoryImpl$updateLessonLike$1.f15606d;
                LessonEntity lessonEntity5 = lessonRepositoryImpl$updateLessonLike$1.f15605c;
                String str14 = lessonRepositoryImpl$updateLessonLike$1.f15604b;
                str8 = lessonRepositoryImpl$updateLessonLike$1.f15603a;
                AbstractC3193b.m15359b(obj);
                lessonEntity2 = lessonEntity5;
                str3 = str14;
                lessonRepositoryImpl$updateLessonLike$1.f15603a = str8;
                lessonRepositoryImpl$updateLessonLike$1.f15604b = str3;
                lessonRepositoryImpl$updateLessonLike$1.f15605c = lessonEntity2;
                lessonRepositoryImpl$updateLessonLike$1.f15606d = i2;
                lessonRepositoryImpl$updateLessonLike$1.f15609g = 6;
                if (m7275f0(i2, lessonRepositoryImpl$updateLessonLike$1) != obj2) {
                    str10 = str8;
                    lessonEntity3 = lessonEntity2;
                    Bundle bundle7 = new Bundle();
                    bundle7.putInt("Lesson ID", i2);
                    bundle7.putString("Lesson language", AbstractC3184kh.m15223q(str10));
                    bundle7.putString("Lesson name", lessonEntity3.m7710q0());
                    bundle7.putString("Lesson level", lessonEntity3.m7645B());
                    List listM7708p3 = lessonEntity3.m7708p0();
                    bundle7.putString("Tags", listM7708p3 != null ? u91.m22596N0(listM7708p3, null, null, null, null, 63) : null);
                    bundle7.putString("Shared By", lessonEntity3.m7690g0());
                    bundle7.putString("Course name", lessonEntity3.m7697k());
                    bundle7.putInt("Course ID", lessonEntity3.m7695j());
                    bundle7.putString("like location", str3);
                    ((C1240a) hm5Var).m7025f("Lesson liked", bundle7);
                    m7278h(i2, str10);
                    return xfa.f68157a;
                }
                return obj2;
            case 6:
                i2 = lessonRepositoryImpl$updateLessonLike$1.f15606d;
                lessonEntity3 = lessonRepositoryImpl$updateLessonLike$1.f15605c;
                str3 = lessonRepositoryImpl$updateLessonLike$1.f15604b;
                str10 = lessonRepositoryImpl$updateLessonLike$1.f15603a;
                AbstractC3193b.m15359b(obj);
                Bundle bundle8 = new Bundle();
                bundle8.putInt("Lesson ID", i2);
                bundle8.putString("Lesson language", AbstractC3184kh.m15223q(str10));
                bundle8.putString("Lesson name", lessonEntity3.m7710q0());
                bundle8.putString("Lesson level", lessonEntity3.m7645B());
                List listM7708p4 = lessonEntity3.m7708p0();
                bundle8.putString("Tags", listM7708p4 != null ? u91.m22596N0(listM7708p4, null, null, null, null, 63) : null);
                bundle8.putString("Shared By", lessonEntity3.m7690g0());
                bundle8.putString("Course name", lessonEntity3.m7697k());
                bundle8.putInt("Course ID", lessonEntity3.m7695j());
                bundle8.putString("like location", str3);
                ((C1240a) hm5Var).m7025f("Lesson liked", bundle8);
                m7278h(i2, str10);
                return xfa.f68157a;
            case 7:
                i2 = lessonRepositoryImpl$updateLessonLike$1.f15606d;
                str7 = lessonRepositoryImpl$updateLessonLike$1.f15603a;
                AbstractC3193b.m15359b(obj);
                m7276g(i2, str7);
                return xfa.f68157a;
            case 8:
                i2 = lessonRepositoryImpl$updateLessonLike$1.f15606d;
                str5 = lessonRepositoryImpl$updateLessonLike$1.f15604b;
                str6 = lessonRepositoryImpl$updateLessonLike$1.f15603a;
                AbstractC3193b.m15359b(obj);
                Bundle bundle9 = new Bundle();
                bundle9.putInt("Lesson ID", i2);
                bundle9.putString("Lesson language", AbstractC3184kh.m15223q(str6));
                bundle9.putString("like location", str5);
                ((C1240a) hm5Var).m7025f("Lesson liked", bundle9);
                m7278h(i2, str6);
                return xfa.f68157a;
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m7278h(int i, String str) {
        xj1 xj1Var = new xj1();
        xj1Var.m24558b(NetworkType.CONNECTED);
        tx6 tx6Var = (tx6) ((tx6) new tx6(LessonGiveRoseWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var.m24557a());
        Pair[] pairArr = {new Pair("language", str), new Pair("lessonId", Integer.valueOf(i))};
        hi8 hi8Var = new hi8(10);
        for (int i2 = 0; i2 < 2; i2++) {
            Pair pair = pairArr[i2];
            hi8Var.m13287x(pair.f47624b, (String) pair.f47623a);
        }
        this.f16506j.m2912a((ux6) ((tx6) tx6Var.m15008g(hi8Var.m13282k())).m15004a());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h0 */
    public final Object m7279h0(int i, String str, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$updateLessonPreview$1 lessonRepositoryImpl$updateLessonPreview$1;
        k88 k88Var;
        Charset charsetM24709a;
        if (continuationImpl instanceof LessonRepositoryImpl$updateLessonPreview$1) {
            lessonRepositoryImpl$updateLessonPreview$1 = (LessonRepositoryImpl$updateLessonPreview$1) continuationImpl;
            int i2 = lessonRepositoryImpl$updateLessonPreview$1.f15613d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$updateLessonPreview$1.f15613d = i2 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$updateLessonPreview$1 = new LessonRepositoryImpl$updateLessonPreview$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$updateLessonPreview$1 = new LessonRepositoryImpl$updateLessonPreview$1(this, continuationImpl);
        }
        Object objM14909q = lessonRepositoryImpl$updateLessonPreview$1.f15611b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = lessonRepositoryImpl$updateLessonPreview$1.f15613d;
        xfa xfaVar = xfa.f68157a;
        try {
            if (i3 == 0) {
                AbstractC3193b.m15359b(objM14909q);
                Integer num = new Integer(i);
                lessonRepositoryImpl$updateLessonPreview$1.f15610a = i;
                lessonRepositoryImpl$updateLessonPreview$1.f15613d = 1;
                objM14909q = this.f16502f.m14909q(str, num, "text", true, lessonRepositoryImpl$updateLessonPreview$1);
                if (objM14909q != coroutineSingletons) {
                }
            }
            if (i3 != 1) {
                if (i3 == 2) {
                    AbstractC3193b.m15359b(objM14909q);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = lessonRepositoryImpl$updateLessonPreview$1.f15610a;
            AbstractC3193b.m15359b(objM14909q);
            String strM4066s0 = bq1.m4066s0(k88Var);
            k88Var.close();
            m55 m55Var = new m55(i, vk9.m23376L0(wk9.m24029L(new Regex("(?m)^[ \t]*\r?\n").m15428g(strM4066s0, ""))).toString());
            lessonRepositoryImpl$updateLessonPreview$1.f15610a = i;
            lessonRepositoryImpl$updateLessonPreview$1.f15613d = 2;
            q05 q05Var = (q05) this.f16498b;
            Object objM2861d = AbstractC0758a.m2861d(new ke2(26, q05Var, m55Var), q05Var.f57071K, lessonRepositoryImpl$updateLessonPreview$1, false, true);
            if (objM2861d != coroutineSingletons) {
                objM2861d = xfaVar;
            }
            return objM2861d == coroutineSingletons ? coroutineSingletons : xfaVar;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3584sr.m21646y(k88Var, th);
                throw th2;
            }
        }
        m88 m88Var = (m88) objM14909q;
        k88Var = m88Var.f50760a;
        if (k88Var == null) {
            hj0 hj0VarMo3003e = m88Var.mo3003e();
            xv5 xv5VarMo3002c = m88Var.mo3002c();
            if (xv5VarMo3002c == null || (charsetM24709a = xv5.m24709a(xv5VarMo3002c)) == null) {
                charsetM24709a = yu0.f70463a;
            }
            k88Var = new k88(hj0VarMo3003e, charsetM24709a);
            m88Var.f50760a = k88Var;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m7280i(int i, int i2, boolean z) {
        xj1 xj1Var = new xj1();
        xj1Var.m24558b(NetworkType.CONNECTED);
        tx6 tx6Var = (tx6) ((tx6) new tx6(LessonSaveRemoveWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var.m24557a());
        Pair[] pairArr = {new Pair("contextId", Integer.valueOf(i)), new Pair("lessonId", Integer.valueOf(i2)), new Pair("save", Boolean.valueOf(z))};
        hi8 hi8Var = new hi8(10);
        for (int i3 = 0; i3 < 3; i3++) {
            Pair pair = pairArr[i3];
            hi8Var.m13287x(pair.f47624b, (String) pair.f47623a);
        }
        this.f16506j.m2912a((ux6) ((tx6) tx6Var.m15008g(hi8Var.m13282k())).m15004a());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        if (r0.mo7497N0(r3, r4) == r5) goto L24;
     */
    /* JADX INFO: renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7281i0(int i, int i2, String str, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$updateLessonSentence$1 lessonRepositoryImpl$updateLessonSentence$1;
        String str2;
        int i3 = i;
        int i4 = i2;
        if (continuationImpl instanceof LessonRepositoryImpl$updateLessonSentence$1) {
            lessonRepositoryImpl$updateLessonSentence$1 = (LessonRepositoryImpl$updateLessonSentence$1) continuationImpl;
            int i5 = lessonRepositoryImpl$updateLessonSentence$1.f15619f;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$updateLessonSentence$1.f15619f = i5 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$updateLessonSentence$1 = new LessonRepositoryImpl$updateLessonSentence$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$updateLessonSentence$1 = new LessonRepositoryImpl$updateLessonSentence$1(this, continuationImpl);
        }
        Object obj = lessonRepositoryImpl$updateLessonSentence$1.f15617d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = lessonRepositoryImpl$updateLessonSentence$1.f15619f;
        AbstractC1320h abstractC1320h = this.f16498b;
        if (i6 == 0) {
            AbstractC3193b.m15359b(obj);
            lessonRepositoryImpl$updateLessonSentence$1.f15614a = str;
            lessonRepositoryImpl$updateLessonSentence$1.f15615b = i3;
            lessonRepositoryImpl$updateLessonSentence$1.f15616c = i4;
            lessonRepositoryImpl$updateLessonSentence$1.f15619f = 1;
            Object objMo7485B0 = abstractC1320h.mo7485B0(i3, i4, lessonRepositoryImpl$updateLessonSentence$1);
            if (objMo7485B0 != coroutineSingletons) {
                str2 = str;
                obj = objMo7485B0;
            }
            return coroutineSingletons;
        }
        if (i6 == 1) {
            int i7 = lessonRepositoryImpl$updateLessonSentence$1.f15616c;
            int i8 = lessonRepositoryImpl$updateLessonSentence$1.f15615b;
            String str3 = lessonRepositoryImpl$updateLessonSentence$1.f15614a;
            AbstractC3193b.m15359b(obj);
            i4 = i7;
            i3 = i8;
            str2 = str3;
        } else {
            if (i6 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
        TranslationSentenceEntity translationSentenceEntity = (TranslationSentenceEntity) obj;
        if (translationSentenceEntity != null) {
            TranslationSentenceEntity translationSentenceEntityM7813a = TranslationSentenceEntity.m7813a(translationSentenceEntity, null, null, str2, null, null, 111);
            lessonRepositoryImpl$updateLessonSentence$1.f15614a = null;
            lessonRepositoryImpl$updateLessonSentence$1.f15615b = i3;
            lessonRepositoryImpl$updateLessonSentence$1.f15616c = i4;
            lessonRepositoryImpl$updateLessonSentence$1.f15619f = 2;
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: j */
    public final void m7282j(String str, int i, int i2, int i3, double d, String str2) {
        xj1 xj1Var = new xj1();
        xj1Var.m24558b(NetworkType.CONNECTED);
        tx6 tx6Var = (tx6) ((tx6) new tx6(LessonBookmarkWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var.m24557a());
        Pair[] pairArr = {new Pair("language", str), new Pair("lessonId", Integer.valueOf(i)), new Pair("wordIndex", Integer.valueOf(i2)), new Pair("completedWordIndex", Integer.valueOf(i3)), new Pair("audioPosition", Double.valueOf(d)), new Pair("timestamp", str2)};
        hi8 hi8Var = new hi8(10);
        for (int i4 = 0; i4 < 6; i4++) {
            Pair pair = pairArr[i4];
            hi8Var.m13287x(pair.f47624b, (String) pair.f47623a);
        }
        this.f16506j.m2912a((ux6) ((tx6) tx6Var.m15008g(hi8Var.m13282k())).m15004a());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fa, code lost:
    
        if (r0.mo7497N0(r8, r4) == r5) goto L54;
     */
    /* JADX INFO: renamed from: j0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7283j0(int i, int i2, int i3, int i4, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$updateLessonSentenceAudio$1 lessonRepositoryImpl$updateLessonSentenceAudio$1;
        int i5;
        int i6;
        Object objMo7485B0;
        double dDoubleValue;
        double dM14509a;
        int i7 = i;
        int i8 = i2;
        if (continuationImpl instanceof LessonRepositoryImpl$updateLessonSentenceAudio$1) {
            lessonRepositoryImpl$updateLessonSentenceAudio$1 = (LessonRepositoryImpl$updateLessonSentenceAudio$1) continuationImpl;
            int i9 = lessonRepositoryImpl$updateLessonSentenceAudio$1.f15626g;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$updateLessonSentenceAudio$1.f15626g = i9 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$updateLessonSentenceAudio$1 = new LessonRepositoryImpl$updateLessonSentenceAudio$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$updateLessonSentenceAudio$1 = new LessonRepositoryImpl$updateLessonSentenceAudio$1(this, continuationImpl);
        }
        Object obj = lessonRepositoryImpl$updateLessonSentenceAudio$1.f15624e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = lessonRepositoryImpl$updateLessonSentenceAudio$1.f15626g;
        AbstractC1320h abstractC1320h = this.f16498b;
        if (i10 == 0) {
            AbstractC3193b.m15359b(obj);
            lessonRepositoryImpl$updateLessonSentenceAudio$1.f15620a = i7;
            lessonRepositoryImpl$updateLessonSentenceAudio$1.f15621b = i8;
            i5 = i3;
            lessonRepositoryImpl$updateLessonSentenceAudio$1.f15622c = i5;
            i6 = i4;
            lessonRepositoryImpl$updateLessonSentenceAudio$1.f15623d = i6;
            lessonRepositoryImpl$updateLessonSentenceAudio$1.f15626g = 1;
            objMo7485B0 = abstractC1320h.mo7485B0(i7, i8, lessonRepositoryImpl$updateLessonSentenceAudio$1);
            if (objMo7485B0 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i10 == 1) {
            int i11 = lessonRepositoryImpl$updateLessonSentenceAudio$1.f15623d;
            int i12 = lessonRepositoryImpl$updateLessonSentenceAudio$1.f15622c;
            int i13 = lessonRepositoryImpl$updateLessonSentenceAudio$1.f15621b;
            int i14 = lessonRepositoryImpl$updateLessonSentenceAudio$1.f15620a;
            AbstractC3193b.m15359b(obj);
            i6 = i11;
            i7 = i14;
            objMo7485B0 = obj;
            i5 = i12;
            i8 = i13;
        } else {
            if (i10 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
        TranslationSentenceEntity translationSentenceEntity = (TranslationSentenceEntity) objMo7485B0;
        if (translationSentenceEntity != null) {
            if (i6 == 0) {
                Double dM7814b = translationSentenceEntity.m7814b();
                dM14509a = jjd.m14509a((((double) i5) / 100.0d) + (dM7814b != null ? dM7814b.doubleValue() : 0.0d));
                if (dM14509a < 0.0d) {
                    dM14509a = 0.0d;
                }
                Double dM7815c = translationSentenceEntity.m7815c();
                dDoubleValue = dM7815c != null ? dM7815c.doubleValue() : 0.0d;
                if (dDoubleValue < dM14509a) {
                    dDoubleValue = dM14509a + 3.0d;
                }
            } else {
                Double dM7815c2 = translationSentenceEntity.m7815c();
                double dM14509a2 = jjd.m14509a((((double) i5) / 100.0d) + (dM7815c2 != null ? dM7815c2.doubleValue() : 0.0d));
                if (dM14509a2 < 0.0d) {
                    dM14509a2 = 0.0d;
                }
                Double dM7814b2 = translationSentenceEntity.m7814b();
                dDoubleValue = dM7814b2 != null ? dM7814b2.doubleValue() : 0.0d;
                if (dDoubleValue > dM14509a2) {
                    dDoubleValue = dM14509a2;
                    dM14509a = dM14509a2 - 3.0d;
                } else {
                    double d = dDoubleValue;
                    dDoubleValue = dM14509a2;
                    dM14509a = d;
                }
            }
            TranslationSentenceEntity translationSentenceEntityM7813a = TranslationSentenceEntity.m7813a(translationSentenceEntity, new Double(dM14509a), new Double(dDoubleValue), null, null, null, 115);
            lessonRepositoryImpl$updateLessonSentenceAudio$1.f15620a = i7;
            lessonRepositoryImpl$updateLessonSentenceAudio$1.f15621b = i8;
            lessonRepositoryImpl$updateLessonSentenceAudio$1.f15622c = i5;
            lessonRepositoryImpl$updateLessonSentenceAudio$1.f15623d = i6;
            lessonRepositoryImpl$updateLessonSentenceAudio$1.f15626g = 2;
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: k */
    public final void m7284k(String str, int i, double d, double d2, boolean z, String str2) {
        xj1 xj1Var = new xj1();
        xj1Var.m24558b(NetworkType.CONNECTED);
        tx6 tx6Var = (tx6) ((tx6) new tx6(LessonUpdateStatsWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var.m24557a());
        Pair[] pairArr = {new Pair("language", str), new Pair("lessonId", Integer.valueOf(i)), new Pair("listenTimes", Double.valueOf(d)), new Pair("readTimes", Double.valueOf(d2)), new Pair("automatic", Boolean.valueOf(z)), new Pair("creationDate", str2)};
        hi8 hi8Var = new hi8(10);
        for (int i2 = 0; i2 < 6; i2++) {
            Pair pair = pairArr[i2];
            hi8Var.m13287x(pair.f47624b, (String) pair.f47623a);
        }
        this.f16506j.m2912a((ux6) ((tx6) tx6Var.m15008g(hi8Var.m13282k())).m15004a());
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0089  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a6, code lost:
    
        if (r0.mo7497N0(r3, r4) == r5) goto L31;
     */
    /* JADX INFO: renamed from: k0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7285k0(int i, int i2, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1 lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1;
        TranslationSentenceEntity translationSentenceEntity;
        int i3;
        int i4;
        TranslationSentenceEntity translationSentenceEntity2;
        int i5 = i;
        int i6 = i2;
        if (continuationImpl instanceof LessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1) {
            lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1 = (LessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1) continuationImpl;
            int i7 = lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f15633g;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f15633g = i7 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1 = new LessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1 = new LessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1(this, continuationImpl);
        }
        Object objMo7485B0 = lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f15631e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f15633g;
        AbstractC1320h abstractC1320h = this.f16498b;
        if (i8 == 0) {
            AbstractC3193b.m15359b(objMo7485B0);
            lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f15628b = i5;
            lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f15629c = i6;
            lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f15633g = 1;
            objMo7485B0 = abstractC1320h.mo7485B0(i5, i6, lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1);
            if (objMo7485B0 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i8 == 1) {
            int i9 = lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f15629c;
            int i10 = lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f15628b;
            AbstractC3193b.m15359b(objMo7485B0);
            i6 = i9;
            i5 = i10;
        } else if (i8 == 2) {
            i4 = lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f15630d;
            i6 = lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f15629c;
            i3 = lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f15628b;
            TranslationSentenceEntity translationSentenceEntity3 = lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f15627a;
            AbstractC3193b.m15359b(objMo7485B0);
            translationSentenceEntity = translationSentenceEntity3;
            translationSentenceEntity2 = (TranslationSentenceEntity) objMo7485B0;
            if (translationSentenceEntity2 != null) {
                TranslationSentenceEntity translationSentenceEntityM7813a = TranslationSentenceEntity.m7813a(translationSentenceEntity, translationSentenceEntity2.m7815c(), null, null, null, null, 123);
                lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f15627a = null;
                lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f15628b = i3;
                lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f15629c = i6;
                lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f15630d = i4;
                lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f15633g = 3;
            }
        } else {
            if (i8 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objMo7485B0);
        }
        return xfa.f68157a;
        TranslationSentenceEntity translationSentenceEntity4 = (TranslationSentenceEntity) objMo7485B0;
        if (translationSentenceEntity4 != null) {
            lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f15627a = translationSentenceEntity4;
            lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f15628b = i5;
            lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f15629c = i6;
            lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f15630d = 0;
            lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f15633g = 2;
            Object objMo7485B1 = abstractC1320h.mo7485B0(i5, i6 - 1, lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1);
            if (objMo7485B1 != coroutineSingletons) {
                translationSentenceEntity = translationSentenceEntity4;
                objMo7485B0 = objMo7485B1;
                i3 = i5;
                i4 = 0;
                translationSentenceEntity2 = (TranslationSentenceEntity) objMo7485B0;
                if (translationSentenceEntity2 != null) {
                    TranslationSentenceEntity translationSentenceEntityM7813a2 = TranslationSentenceEntity.m7813a(translationSentenceEntity, translationSentenceEntity2.m7815c(), null, null, null, null, 123);
                    lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f15627a = null;
                    lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f15628b = i3;
                    lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f15629c = i6;
                    lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f15630d = i4;
                    lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f15633g = 3;
                }
            }
            return coroutineSingletons;
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00bc A[Catch: Exception -> 0x0051, PHI: r2 r6
      0x00bc: PHI (r2v8 int) = (r2v19 int), (r2v13 int) binds: [B:48:0x00b9, B:26:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x00bc: PHI (r6v10 ??) = (r6v17 ??), (r6v13 ??) binds: [B:48:0x00b9, B:26:0x0054] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0051, blocks: (B:22:0x004c, B:50:0x00bc), top: B:60:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c6, code lost:
    
        if (r0 == r5) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e0, code lost:
    
        if (m7304x(r6, r0, r4) == r5) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [com.lingq.core.data.repository.k, d65] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v0, types: [int] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.String] */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7286l(int i, String str, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$downloadLesson$1 lessonRepositoryImpl$downloadLesson$1;
        ?? r3;
        int i2;
        ?? r6;
        ?? r7;
        int i3;
        Object objM7265W;
        ?? r8;
        int i4;
        int i5 = i;
        ?? r2 = str;
        if (continuationImpl instanceof LessonRepositoryImpl$downloadLesson$1) {
            lessonRepositoryImpl$downloadLesson$1 = (LessonRepositoryImpl$downloadLesson$1) continuationImpl;
            int i6 = lessonRepositoryImpl$downloadLesson$1.f15325e;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$downloadLesson$1.f15325e = i6 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$downloadLesson$1 = new LessonRepositoryImpl$downloadLesson$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$downloadLesson$1 = new LessonRepositoryImpl$downloadLesson$1(this, continuationImpl);
        }
        Object obj = lessonRepositoryImpl$downloadLesson$1.f15323c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r9 = lessonRepositoryImpl$downloadLesson$1.f15325e;
        xfa xfaVar = xfa.f68157a;
        int i7 = 4;
        try {
            try {
                try {
                    if (r9 == 0) {
                        AbstractC3193b.m15359b(obj);
                        v85 v85Var = new v85(r2, i5, LibraryItemType.Content.getValue(), false);
                        lessonRepositoryImpl$downloadLesson$1.f15321a = r2;
                        lessonRepositoryImpl$downloadLesson$1.f15322b = i5;
                        lessonRepositoryImpl$downloadLesson$1.f15325e = 1;
                        C1321i c1321i = this.f16501e;
                        Object objM2861d = AbstractC0758a.m2861d(new h85(i7, c1321i, v85Var), c1321i.f17034K, lessonRepositoryImpl$downloadLesson$1, false, true);
                        if (objM2861d != coroutineSingletons) {
                            objM2861d = xfaVar;
                        }
                        if (objM2861d != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    if (r9 == 1) {
                        i5 = lessonRepositoryImpl$downloadLesson$1.f15322b;
                        r2 = lessonRepositoryImpl$downloadLesson$1.f15321a;
                        AbstractC3193b.m15359b(obj);
                    } else {
                        if (r9 == 2) {
                            i2 = lessonRepositoryImpl$downloadLesson$1.f15322b;
                            r6 = lessonRepositoryImpl$downloadLesson$1.f15321a;
                            try {
                                AbstractC3193b.m15359b(obj);
                                i3 = i2;
                                r7 = r6;
                            } catch (Exception e) {
                                e = e;
                                e.printStackTrace();
                                i3 = i2;
                                r7 = r6;
                            }
                            lessonRepositoryImpl$downloadLesson$1.f15321a = r7;
                            lessonRepositoryImpl$downloadLesson$1.f15322b = i3 == true ? 1 : 0;
                            lessonRepositoryImpl$downloadLesson$1.f15325e = 3;
                            objM7265W = ((C1295k) this).m7265W(i3 == true ? 1 : 0, r7, lessonRepositoryImpl$downloadLesson$1);
                            i4 = i3;
                            r8 = r7;
                            if (objM7265W != coroutineSingletons) {
                                lessonRepositoryImpl$downloadLesson$1.f15321a = r8;
                                lessonRepositoryImpl$downloadLesson$1.f15322b = i4;
                                lessonRepositoryImpl$downloadLesson$1.f15325e = 4;
                                Object objM7288m = m7288m(i4, r8, lessonRepositoryImpl$downloadLesson$1);
                                r2 = i4;
                                r9 = r8;
                            }
                            return coroutineSingletons;
                        }
                        if (r9 == 3) {
                            int i8 = lessonRepositoryImpl$downloadLesson$1.f15322b;
                            String str2 = lessonRepositoryImpl$downloadLesson$1.f15321a;
                            AbstractC3193b.m15359b(obj);
                            r8 = str2;
                            i4 = i8;
                            lessonRepositoryImpl$downloadLesson$1.f15321a = r8;
                            lessonRepositoryImpl$downloadLesson$1.f15322b = i4;
                            lessonRepositoryImpl$downloadLesson$1.f15325e = 4;
                            Object objM7288m2 = m7288m(i4, r8, lessonRepositoryImpl$downloadLesson$1);
                            r2 = i4;
                            r9 = r8;
                        } else if (r9 == 4) {
                            int i9 = lessonRepositoryImpl$downloadLesson$1.f15322b;
                            String str3 = lessonRepositoryImpl$downloadLesson$1.f15321a;
                            AbstractC3193b.m15359b(obj);
                            r2 = i9;
                            r9 = str3;
                            List listM23604J = vz1.m23604J(new Integer((int) r2));
                            lessonRepositoryImpl$downloadLesson$1.f15321a = null;
                            lessonRepositoryImpl$downloadLesson$1.f15322b = r2;
                            lessonRepositoryImpl$downloadLesson$1.f15325e = 5;
                        } else {
                            if (r9 != 5) {
                                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            AbstractC3193b.m15359b(obj);
                        }
                    }
                    return xfaVar;
                    lessonRepositoryImpl$downloadLesson$1.f15321a = r3;
                    lessonRepositoryImpl$downloadLesson$1.f15322b = i2;
                    lessonRepositoryImpl$downloadLesson$1.f15325e = 2;
                    if (m7251I(i2, r3, lessonRepositoryImpl$downloadLesson$1) != coroutineSingletons) {
                        r7 = r3;
                        i3 = i2;
                        lessonRepositoryImpl$downloadLesson$1.f15321a = r7;
                        lessonRepositoryImpl$downloadLesson$1.f15322b = i3 == true ? 1 : 0;
                        lessonRepositoryImpl$downloadLesson$1.f15325e = 3;
                        objM7265W = ((C1295k) this).m7265W(i3 == true ? 1 : 0, r7, lessonRepositoryImpl$downloadLesson$1);
                        i4 = i3;
                        r8 = r7;
                        if (objM7265W != coroutineSingletons) {
                            lessonRepositoryImpl$downloadLesson$1.f15321a = r8;
                            lessonRepositoryImpl$downloadLesson$1.f15322b = i4;
                            lessonRepositoryImpl$downloadLesson$1.f15325e = 4;
                            Object objM7288m3 = m7288m(i4, r8, lessonRepositoryImpl$downloadLesson$1);
                            r2 = i4;
                            r9 = r8;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    r6 = r3;
                    e.printStackTrace();
                    i3 = i2;
                    r7 = r6;
                }
                r3 = r2;
                i2 = i5;
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
    
        if (r0.mo7497N0(r3, r4) == r5) goto L27;
     */
    /* JADX INFO: renamed from: l0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7287l0(int i, int i2, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$updateLessonSentenceAudioStartPlusThree$1 lessonRepositoryImpl$updateLessonSentenceAudioStartPlusThree$1;
        int i3 = i;
        int i4 = i2;
        if (continuationImpl instanceof LessonRepositoryImpl$updateLessonSentenceAudioStartPlusThree$1) {
            lessonRepositoryImpl$updateLessonSentenceAudioStartPlusThree$1 = (LessonRepositoryImpl$updateLessonSentenceAudioStartPlusThree$1) continuationImpl;
            int i5 = lessonRepositoryImpl$updateLessonSentenceAudioStartPlusThree$1.f15638e;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$updateLessonSentenceAudioStartPlusThree$1.f15638e = i5 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$updateLessonSentenceAudioStartPlusThree$1 = new LessonRepositoryImpl$updateLessonSentenceAudioStartPlusThree$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$updateLessonSentenceAudioStartPlusThree$1 = new LessonRepositoryImpl$updateLessonSentenceAudioStartPlusThree$1(this, continuationImpl);
        }
        Object objMo7485B0 = lessonRepositoryImpl$updateLessonSentenceAudioStartPlusThree$1.f15636c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = lessonRepositoryImpl$updateLessonSentenceAudioStartPlusThree$1.f15638e;
        AbstractC1320h abstractC1320h = this.f16498b;
        if (i6 == 0) {
            AbstractC3193b.m15359b(objMo7485B0);
            lessonRepositoryImpl$updateLessonSentenceAudioStartPlusThree$1.f15634a = i3;
            lessonRepositoryImpl$updateLessonSentenceAudioStartPlusThree$1.f15635b = i4;
            lessonRepositoryImpl$updateLessonSentenceAudioStartPlusThree$1.f15638e = 1;
            objMo7485B0 = abstractC1320h.mo7485B0(i3, i4, lessonRepositoryImpl$updateLessonSentenceAudioStartPlusThree$1);
            if (objMo7485B0 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i6 == 1) {
            int i7 = lessonRepositoryImpl$updateLessonSentenceAudioStartPlusThree$1.f15635b;
            int i8 = lessonRepositoryImpl$updateLessonSentenceAudioStartPlusThree$1.f15634a;
            AbstractC3193b.m15359b(objMo7485B0);
            i4 = i7;
            i3 = i8;
        } else {
            if (i6 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objMo7485B0);
        }
        return xfa.f68157a;
        TranslationSentenceEntity translationSentenceEntity = (TranslationSentenceEntity) objMo7485B0;
        if (translationSentenceEntity != null) {
            Double dM7814b = translationSentenceEntity.m7814b();
            TranslationSentenceEntity translationSentenceEntityM7813a = TranslationSentenceEntity.m7813a(translationSentenceEntity, null, dM7814b != null ? new Double(dM7814b.doubleValue() + 3.0d) : null, null, null, null, 119);
            lessonRepositoryImpl$updateLessonSentenceAudioStartPlusThree$1.f15634a = i3;
            lessonRepositoryImpl$updateLessonSentenceAudioStartPlusThree$1.f15635b = i4;
            lessonRepositoryImpl$updateLessonSentenceAudioStartPlusThree$1.f15638e = 2;
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00e4 -> B:41:0x00e6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: m */
    public final java.lang.Object m7288m(int r12, java.lang.String r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.core.data.repository.C1295k.m7288m(int, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cd, code lost:
    
        if (r0.mo7497N0(r6, r4) == r5) goto L40;
     */
    /* JADX INFO: renamed from: m0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7289m0(int i, int i2, double d, int i3, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1 lessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1;
        double d2;
        int i4;
        Object objMo7485B0;
        double dDoubleValue;
        double d3;
        int i5 = i;
        int i6 = i2;
        if (continuationImpl instanceof LessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1) {
            lessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1 = (LessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1) continuationImpl;
            int i7 = lessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1.f15645g;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1.f15645g = i7 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1 = new LessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1 = new LessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1(this, continuationImpl);
        }
        Object obj = lessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1.f15643e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = lessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1.f15645g;
        AbstractC1320h abstractC1320h = this.f16498b;
        if (i8 == 0) {
            AbstractC3193b.m15359b(obj);
            lessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1.f15639a = i5;
            lessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1.f15640b = i6;
            d2 = d;
            lessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1.f15642d = d2;
            i4 = i3;
            lessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1.f15641c = i4;
            lessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1.f15645g = 1;
            objMo7485B0 = abstractC1320h.mo7485B0(i5, i6, lessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1);
            if (objMo7485B0 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i8 == 1) {
            int i9 = lessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1.f15641c;
            double d4 = lessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1.f15642d;
            i6 = lessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1.f15640b;
            int i10 = lessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1.f15639a;
            AbstractC3193b.m15359b(obj);
            i4 = i9;
            i5 = i10;
            objMo7485B0 = obj;
            d2 = d4;
        } else {
            if (i8 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
        TranslationSentenceEntity translationSentenceEntity = (TranslationSentenceEntity) objMo7485B0;
        if (translationSentenceEntity != null) {
            if (i4 == 0) {
                double dM14509a = jjd.m14509a(d2);
                Double dM7815c = translationSentenceEntity.m7815c();
                dDoubleValue = dM7815c != null ? dM7815c.doubleValue() : 0.0d;
                if (dDoubleValue < dM14509a) {
                    dDoubleValue = dM14509a + 3.0d;
                }
                d3 = dM14509a;
            } else {
                double dM14509a2 = jjd.m14509a(d2);
                Double dM7814b = translationSentenceEntity.m7814b();
                dDoubleValue = dM7814b != null ? dM7814b.doubleValue() : 0.0d;
                d3 = dDoubleValue > dM14509a2 ? dM14509a2 - 3.0d : dDoubleValue;
                dDoubleValue = dM14509a2;
            }
            TranslationSentenceEntity translationSentenceEntityM7813a = TranslationSentenceEntity.m7813a(translationSentenceEntity, new Double(d3), new Double(dDoubleValue), null, null, null, 115);
            lessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1.f15639a = i5;
            lessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1.f15640b = i6;
            lessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1.f15642d = d2;
            lessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1.f15641c = i4;
            lessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1.f15645g = 2;
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: n */
    public final Object m7290n(int i, String str, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$fetchLesson$1 lessonRepositoryImpl$fetchLesson$1;
        if (continuationImpl instanceof LessonRepositoryImpl$fetchLesson$1) {
            lessonRepositoryImpl$fetchLesson$1 = (LessonRepositoryImpl$fetchLesson$1) continuationImpl;
            int i2 = lessonRepositoryImpl$fetchLesson$1.f15337e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$fetchLesson$1.f15337e = i2 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$fetchLesson$1 = new LessonRepositoryImpl$fetchLesson$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$fetchLesson$1 = new LessonRepositoryImpl$fetchLesson$1(this, continuationImpl);
        }
        Object objM14908p = lessonRepositoryImpl$fetchLesson$1.f15335c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = lessonRepositoryImpl$fetchLesson$1.f15337e;
        xfa xfaVar = xfa.f68157a;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM14908p);
            Integer num = new Integer(i);
            lessonRepositoryImpl$fetchLesson$1.f15333a = str;
            lessonRepositoryImpl$fetchLesson$1.f15334b = i;
            lessonRepositoryImpl$fetchLesson$1.f15337e = 1;
            objM14908p = this.f16502f.m14908p(str, num, true, lessonRepositoryImpl$fetchLesson$1);
            if (objM14908p != coroutineSingletons) {
            }
        }
        if (i3 == 1) {
            i = lessonRepositoryImpl$fetchLesson$1.f15334b;
            str = lessonRepositoryImpl$fetchLesson$1.f15333a;
            AbstractC3193b.m15359b(objM14908p);
        } else {
            if (i3 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM14908p);
        }
        int i4 = i;
        String str2 = str;
        lessonRepositoryImpl$fetchLesson$1.f15333a = null;
        lessonRepositoryImpl$fetchLesson$1.f15334b = i4;
        lessonRepositoryImpl$fetchLesson$1.f15337e = 2;
        Object objM2849b = AbstractC0747e.m2849b(this.f16497a, new LessonRepositoryImpl$storeLessonData$2((ResultLesson) objM14908p, this, i4, str2, null), lessonRepositoryImpl$fetchLesson$1);
        if (objM2849b != coroutineSingletons) {
            objM2849b = xfaVar;
        }
        return objM2849b == coroutineSingletons ? coroutineSingletons : xfaVar;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0160  */
    /* JADX WARN: Code duplicated, block: B:57:0x016d  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: n0 */
    public final Object m7291n0(int i, int i2, String str, String str2, boolean z, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$updateLessonSentenceTranslation$1 lessonRepositoryImpl$updateLessonSentenceTranslation$1;
        String str3;
        boolean z2;
        Object obj;
        String str4;
        int i3;
        boolean z3;
        String str5;
        String str6;
        boolean z4;
        int i4;
        int i5;
        String str7;
        String str8;
        List listM23604J;
        int i6 = i;
        int i7 = i2;
        if (continuationImpl instanceof LessonRepositoryImpl$updateLessonSentenceTranslation$1) {
            lessonRepositoryImpl$updateLessonSentenceTranslation$1 = (LessonRepositoryImpl$updateLessonSentenceTranslation$1) continuationImpl;
            int i8 = lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15653h;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15653h = i8 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$updateLessonSentenceTranslation$1 = new LessonRepositoryImpl$updateLessonSentenceTranslation$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$updateLessonSentenceTranslation$1 = new LessonRepositoryImpl$updateLessonSentenceTranslation$1(this, continuationImpl);
        }
        Object objM15541t = lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15651f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15653h;
        xfa xfaVar = xfa.f68157a;
        AbstractC1320h abstractC1320h = this.f16498b;
        if (i9 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15646a = str;
            lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15647b = str2;
            lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15648c = i6;
            lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15649d = i7;
            lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15650e = z;
            lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15653h = 1;
            Object objMo7485B0 = abstractC1320h.mo7485B0(i6, i7, lessonRepositoryImpl$updateLessonSentenceTranslation$1);
            if (objMo7485B0 != coroutineSingletons) {
                str3 = str;
                z2 = z;
                obj = objMo7485B0;
                str4 = str2;
            }
            return coroutineSingletons;
        }
        if (i9 == 1) {
            boolean z5 = lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15650e;
            i7 = lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15649d;
            int i10 = lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15648c;
            str4 = lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15647b;
            str3 = lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15646a;
            AbstractC3193b.m15359b(objM15541t);
            obj = objM15541t;
            z2 = z5;
            i6 = i10;
        } else {
            if (i9 == 2) {
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            }
            if (i9 == 3) {
                z3 = lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15650e;
                i7 = lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15649d;
                i3 = lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15648c;
                str5 = lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15647b;
                str6 = lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15646a;
                AbstractC3193b.m15359b(objM15541t);
                vi7 vi7Var = ((C1368a) this.f16508l).f18356L0;
                lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15646a = str6;
                lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15647b = str5;
                lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15648c = i3;
                lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15649d = i7;
                lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15650e = z3;
                lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15653h = 4;
                objM15541t = AbstractC3224d.m15541t(vi7Var, lessonRepositoryImpl$updateLessonSentenceTranslation$1);
                if (objM15541t != coroutineSingletons) {
                    z4 = z3;
                    i4 = i7;
                    i5 = i3;
                    str7 = str5;
                    str8 = str6;
                }
                return coroutineSingletons;
            }
            if (i9 != 4) {
                if (i9 == 5) {
                    AbstractC3193b.m15359b(objM15541t);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z4 = lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15650e;
            i4 = lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15649d;
            i5 = lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15648c;
            str7 = lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15647b;
            str8 = lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15646a;
            AbstractC3193b.m15359b(objM15541t);
        }
        if (fa4.m11650l(str8, (String) objM15541t)) {
            listM23604J = vz1.m23604J(new j65(i5, str7, i4));
            lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15646a = null;
            lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15647b = null;
            lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15648c = i5;
            lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15649d = i4;
            lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15650e = z4;
            lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15653h = 5;
            if (abstractC1320h.mo7498O0(listM23604J, lessonRepositoryImpl$updateLessonSentenceTranslation$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfaVar;
        TranslationSentenceEntity translationSentenceEntity = (TranslationSentenceEntity) obj;
        if (translationSentenceEntity != null) {
            if (z2) {
                ArrayList arrayListM22624p1 = u91.m22624p1(translationSentenceEntity.m7818f());
                Iterator it = arrayListM22624p1.iterator();
                int i11 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i11 = -1;
                        break;
                    }
                    if (fa4.m11650l(((Note) it.next()).m8076b(), str3)) {
                        break;
                    }
                    i11++;
                }
                if (i11 >= 0) {
                    arrayListM22624p1.set(i11, Note.m8075a((Note) arrayListM22624p1.get(i11), str4));
                } else {
                    arrayListM22624p1.add(new Note(str3, str4));
                }
                TranslationSentenceEntity translationSentenceEntityM7813a = TranslationSentenceEntity.m7813a(translationSentenceEntity, null, null, null, null, arrayListM22624p1, 63);
                lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15646a = null;
                lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15647b = null;
                lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15648c = i6;
                lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15649d = i7;
                lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15650e = z2;
                lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15653h = 2;
                if (abstractC1320h.mo7497N0(translationSentenceEntityM7813a, lessonRepositoryImpl$updateLessonSentenceTranslation$1) == coroutineSingletons) {
                }
            } else {
                TranslationSentenceEntity translationSentenceEntityM7813a2 = TranslationSentenceEntity.m7813a(translationSentenceEntity, null, null, null, jjd.m14510b(str3, str4, translationSentenceEntity.m7820h()), null, 95);
                lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15646a = str3;
                lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15647b = str4;
                lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15648c = i6;
                lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15649d = i7;
                lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15650e = z2;
                lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15653h = 3;
                if (abstractC1320h.mo7497N0(translationSentenceEntityM7813a2, lessonRepositoryImpl$updateLessonSentenceTranslation$1) != coroutineSingletons) {
                    i3 = i6;
                    z3 = z2;
                    str5 = str4;
                    str6 = str3;
                    vi7 vi7Var2 = ((C1368a) this.f16508l).f18356L0;
                    lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15646a = str6;
                    lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15647b = str5;
                    lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15648c = i3;
                    lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15649d = i7;
                    lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15650e = z3;
                    lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15653h = 4;
                    objM15541t = AbstractC3224d.m15541t(vi7Var2, lessonRepositoryImpl$updateLessonSentenceTranslation$1);
                    if (objM15541t != coroutineSingletons) {
                        z4 = z3;
                        i4 = i7;
                        i5 = i3;
                        str7 = str5;
                        str8 = str6;
                        if (fa4.m11650l(str8, (String) objM15541t)) {
                            listM23604J = vz1.m23604J(new j65(i5, str7, i4));
                            lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15646a = null;
                            lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15647b = null;
                            lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15648c = i5;
                            lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15649d = i4;
                            lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15650e = z4;
                            lessonRepositoryImpl$updateLessonSentenceTranslation$1.f15653h = 5;
                            if (abstractC1320h.mo7498O0(listM23604J, lessonRepositoryImpl$updateLessonSentenceTranslation$1) == coroutineSingletons) {
                            }
                        }
                    }
                }
            }
            return coroutineSingletons;
        }
        return xfaVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (r5.mo7489F0(r7, r0) == r1) goto L25;
     */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7292o(int i, String str, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$fetchLessonBookmark$1 lessonRepositoryImpl$fetchLessonBookmark$1;
        if (continuationImpl instanceof LessonRepositoryImpl$fetchLessonBookmark$1) {
            lessonRepositoryImpl$fetchLessonBookmark$1 = (LessonRepositoryImpl$fetchLessonBookmark$1) continuationImpl;
            int i2 = lessonRepositoryImpl$fetchLessonBookmark$1.f15341d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$fetchLessonBookmark$1.f15341d = i2 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$fetchLessonBookmark$1 = new LessonRepositoryImpl$fetchLessonBookmark$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$fetchLessonBookmark$1 = new LessonRepositoryImpl$fetchLessonBookmark$1(this, continuationImpl);
        }
        Object objM14905m = lessonRepositoryImpl$fetchLessonBookmark$1.f15339b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = lessonRepositoryImpl$fetchLessonBookmark$1.f15341d;
        try {
            if (i3 != 0) {
                if (i3 == 1) {
                    i = lessonRepositoryImpl$fetchLessonBookmark$1.f15338a;
                    AbstractC3193b.m15359b(objM14905m);
                } else {
                    if (i3 != 2) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(objM14905m);
                }
                return xfa.f68157a;
            }
            AbstractC3193b.m15359b(objM14905m);
            k65 k65Var = this.f16502f;
            Integer num = new Integer(i);
            lessonRepositoryImpl$fetchLessonBookmark$1.f15338a = i;
            lessonRepositoryImpl$fetchLessonBookmark$1.f15341d = 1;
            objM14905m = k65Var.m14905m(str, num, lessonRepositoryImpl$fetchLessonBookmark$1);
            if (objM14905m == coroutineSingletons) {
            }
            return coroutineSingletons;
            AbstractC1320h abstractC1320h = this.f16498b;
            LessonBookmarkEntity lessonBookmarkEntityM11329a = esc.m11329a((ResultLessonBookmark) objM14905m, i);
            lessonRepositoryImpl$fetchLessonBookmark$1.f15338a = i;
            lessonRepositoryImpl$fetchLessonBookmark$1.f15341d = 2;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0413  */
    /* JADX WARN: Code duplicated, block: B:102:0x042f  */
    /* JADX WARN: Code duplicated, block: B:105:0x048b  */
    /* JADX WARN: Code duplicated, block: B:107:0x04be  */
    /* JADX WARN: Code duplicated, block: B:109:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:113:0x054b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0575  */
    /* JADX WARN: Code duplicated, block: B:118:0x057d  */
    /* JADX WARN: Code duplicated, block: B:121:0x059a  */
    /* JADX WARN: Code duplicated, block: B:177:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:180:0x075d  */
    /* JADX WARN: Code duplicated, block: B:182:0x0767  */
    /* JADX WARN: Code duplicated, block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0243  */
    /* JADX WARN: Code duplicated, block: B:34:0x025f  */
    /* JADX WARN: Code duplicated, block: B:38:0x028a  */
    /* JADX WARN: Code duplicated, block: B:41:0x029d  */
    /* JADX WARN: Code duplicated, block: B:42:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:45:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:48:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:51:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:52:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:55:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:58:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:61:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:63:0x0306  */
    /* JADX WARN: Code duplicated, block: B:67:0x0310  */
    /* JADX WARN: Code duplicated, block: B:68:0x0315  */
    /* JADX WARN: Code duplicated, block: B:71:0x031d  */
    /* JADX WARN: Code duplicated, block: B:73:0x032a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0334  */
    /* JADX WARN: Code duplicated, block: B:78:0x0339  */
    /* JADX WARN: Code duplicated, block: B:81:0x0343  */
    /* JADX WARN: Code duplicated, block: B:85:0x034d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0355  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0361  */
    /* JADX WARN: Code duplicated, block: B:95:0x0369  */
    /* JADX WARN: Code duplicated, block: B:96:0x036e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0410  */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0540, code lost:
    
        if (r0.m7510I0(r2, r4) == r14) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x05bd, code lost:
    
        if (r2 == r14) goto L104;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v25, types: [com.lingq.core.database.entity.LessonEntity, com.lingq.core.database.entity.LibraryCounterEntity, java.lang.Object, u85] */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX INFO: renamed from: o0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7293o0(String str, int i, double d, double d2, boolean z, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$updateLessonStats$1 lessonRepositoryImpl$updateLessonStats$1;
        double d3;
        String str2;
        double d4;
        boolean z2;
        Object obj;
        double d5;
        LessonEntity lessonEntity;
        LessonRepositoryImpl$updateLessonStats$1 lessonRepositoryImpl$updateLessonStats$2;
        CoroutineSingletons coroutineSingletons;
        C1321i c1321i;
        ?? r12;
        double d6;
        double d7;
        Object objM7505C0;
        String str3;
        LessonEntity lessonEntity2;
        int i2;
        int i3;
        boolean z3;
        u85 u85Var;
        Object objM7506D0;
        boolean z4;
        int i4;
        u85 u85Var2;
        boolean z5;
        LessonEntity lessonEntity3;
        LibraryCounterEntity libraryCounterEntity;
        int i5;
        double d8;
        C1321i c1321i2;
        double dDoubleValue;
        double dMax;
        double d9;
        double dDoubleValue2;
        double dMax2;
        double dM17572a;
        double dM17572a2;
        double d10;
        double d11;
        double d12;
        double d13;
        double d14;
        double d15;
        double d16;
        LessonEntity lessonEntityM7642a;
        String str4;
        double d17;
        LessonRepositoryImpl$updateLessonStats$1 lessonRepositoryImpl$updateLessonStats$3;
        u85 u85Var3;
        double d18;
        double d19;
        double d20;
        double d21;
        double d22;
        u85 u85Var4;
        CoroutineSingletons coroutineSingletons2;
        String str5;
        double d23;
        LessonEntity lessonEntity4;
        double d24;
        double d25;
        double d26;
        double d27;
        int i6;
        LibraryCounterEntity libraryCounterEntity2;
        boolean z6;
        double d28;
        double d29;
        double d30;
        Double d31;
        Double d32;
        double d33;
        double d34;
        double d35;
        int i7;
        double d36;
        boolean z7;
        String str6;
        int i8;
        LibraryCounterEntity libraryCounterEntity3;
        LessonEntity lessonEntity5;
        double d37;
        double d38;
        double d39;
        double d40;
        double d41;
        String str7;
        int i9;
        double d42;
        double d43;
        double d44;
        double d45;
        double d46;
        C1321i c1321i3;
        Object objMo4095v0;
        double d47;
        LibraryCounterEntity libraryCounterEntity4;
        boolean z8;
        double d48;
        LessonEntity lessonEntity6;
        double d49;
        Object obj2;
        C1321i c1321i4;
        LessonEntity lessonEntity7;
        String str8;
        Object objM7505C1;
        String str9;
        boolean z9;
        double d50;
        LessonEntity lessonEntity8;
        u85 u85Var5;
        CoroutineSingletons coroutineSingletons3;
        double d51;
        double d52;
        double d53;
        double d54;
        CoroutineSingletons coroutineSingletons4;
        double d55;
        C1321i c1321i5;
        double d56;
        String str10;
        double d57;
        double d58;
        double d59;
        double d60;
        boolean z10;
        int i10;
        double d61;
        int i11;
        double d62;
        double d63;
        LibraryCounterEntity libraryCounterEntity5;
        Double d64;
        Double d65;
        double d66;
        double d67;
        int i12;
        boolean z11;
        String str11;
        LibraryCounterEntity libraryCounterEntityM7760a;
        String str12;
        double d68;
        CoroutineSingletons coroutineSingletons5;
        int i13;
        boolean z12;
        String str13;
        int i14 = i;
        if (continuationImpl instanceof LessonRepositoryImpl$updateLessonStats$1) {
            lessonRepositoryImpl$updateLessonStats$1 = (LessonRepositoryImpl$updateLessonStats$1) continuationImpl;
            int i15 = lessonRepositoryImpl$updateLessonStats$1.f15662P;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$updateLessonStats$1.f15662P = i15 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$updateLessonStats$1 = new LessonRepositoryImpl$updateLessonStats$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$updateLessonStats$1 = new LessonRepositoryImpl$updateLessonStats$1(this, continuationImpl);
        }
        LessonRepositoryImpl$updateLessonStats$1 lessonRepositoryImpl$updateLessonStats$4 = lessonRepositoryImpl$updateLessonStats$1;
        Object objM7506D1 = lessonRepositoryImpl$updateLessonStats$4.f15660N;
        CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i16 = lessonRepositoryImpl$updateLessonStats$4.f15662P;
        AbstractC1320h abstractC1320h = this.f16498b;
        C1321i c1321i6 = this.f16501e;
        switch (i16) {
            case 0:
                d3 = 0.0d;
                AbstractC3193b.m15359b(objM7506D1);
                str2 = str;
                lessonRepositoryImpl$updateLessonStats$4.f15663a = str2;
                lessonRepositoryImpl$updateLessonStats$4.f15668f = i14;
                lessonRepositoryImpl$updateLessonStats$4.f15670h = d;
                d4 = d2;
                lessonRepositoryImpl$updateLessonStats$4.f15671i = d4;
                lessonRepositoryImpl$updateLessonStats$4.f15659M = z;
                lessonRepositoryImpl$updateLessonStats$4.f15662P = 1;
                Object objMo7500z0 = abstractC1320h.mo7500z0(i14, lessonRepositoryImpl$updateLessonStats$4);
                if (objMo7500z0 != coroutineSingletons6) {
                    z2 = z;
                    obj = objMo7500z0;
                    d5 = d;
                    lessonEntity = (LessonEntity) obj;
                    if (lessonEntity != null) {
                        lessonRepositoryImpl$updateLessonStats$4.f15663a = str2;
                        lessonRepositoryImpl$updateLessonStats$4.f15664b = lessonEntity;
                        lessonRepositoryImpl$updateLessonStats$4.f15665c = null;
                        lessonRepositoryImpl$updateLessonStats$4.f15668f = i14;
                        lessonRepositoryImpl$updateLessonStats$4.f15670h = d5;
                        lessonRepositoryImpl$updateLessonStats$4.f15671i = d4;
                        lessonRepositoryImpl$updateLessonStats$4.f15659M = z2;
                        lessonRepositoryImpl$updateLessonStats$4.f15669g = 0;
                        lessonRepositoryImpl$updateLessonStats$4.f15662P = 2;
                        objM7505C0 = c1321i6.m7505C0(i14, lessonRepositoryImpl$updateLessonStats$4);
                        if (objM7505C0 != coroutineSingletons6) {
                            str3 = str2;
                            lessonEntity2 = lessonEntity;
                            i2 = 0;
                            i3 = i14;
                            z3 = z2;
                            objM7506D1 = objM7505C0;
                            u85Var = (u85) objM7506D1;
                            String value = LibraryItemType.Content.getValue();
                            lessonRepositoryImpl$updateLessonStats$4.f15663a = str3;
                            lessonRepositoryImpl$updateLessonStats$4.f15664b = lessonEntity2;
                            lessonRepositoryImpl$updateLessonStats$4.f15665c = null;
                            lessonRepositoryImpl$updateLessonStats$4.f15666d = u85Var;
                            lessonRepositoryImpl$updateLessonStats$4.f15668f = i3;
                            lessonRepositoryImpl$updateLessonStats$4.f15670h = d5;
                            lessonRepositoryImpl$updateLessonStats$4.f15671i = d4;
                            lessonRepositoryImpl$updateLessonStats$4.f15659M = z3;
                            lessonRepositoryImpl$updateLessonStats$4.f15669g = i2;
                            lessonRepositoryImpl$updateLessonStats$4.f15662P = 3;
                            objM7506D0 = c1321i6.m7506D0(i3, value, lessonRepositoryImpl$updateLessonStats$4);
                            if (objM7506D0 != coroutineSingletons6) {
                                z4 = z3;
                                i4 = i2;
                                u85Var2 = u85Var;
                                z5 = z4;
                                lessonEntity3 = lessonEntity2;
                                libraryCounterEntity = (LibraryCounterEntity) objM7506D0;
                                double dM7682c0 = lessonEntity3.m7682c0();
                                i5 = i4;
                                if (u85Var2 != null) {
                                    d8 = u85Var2.f63553O;
                                } else {
                                    d8 = d3;
                                }
                                c1321i2 = c1321i6;
                                if (libraryCounterEntity != null || (d32 = libraryCounterEntity.f17362f) == null) {
                                    dDoubleValue = d3;
                                } else {
                                    dDoubleValue = d32.doubleValue();
                                }
                                dMax = Math.max(dM7682c0, Math.max(d8, dDoubleValue));
                                double dM7647C = lessonEntity3.m7647C();
                                if (u85Var2 != null) {
                                    d9 = u85Var2.f63552N;
                                } else {
                                    d9 = d3;
                                }
                                if (libraryCounterEntity != null || (d31 = libraryCounterEntity.f17361e) == null) {
                                    dDoubleValue2 = d3;
                                } else {
                                    dDoubleValue2 = d31.doubleValue();
                                }
                                dMax2 = Math.max(dM7647C, Math.max(d9, dDoubleValue2));
                                dM17572a = nob.m17572a(9, d4);
                                dM17572a2 = nob.m17572a(9, d5);
                                d10 = dMax + dM17572a;
                                d11 = dMax2 + dM17572a2;
                                if (d10 < d3) {
                                    dM17572a = -nob.m17572a(9, dMax);
                                    if (!Double.isNaN(dM17572a) || Double.isInfinite(dM17572a)) {
                                        d12 = d3;
                                        dM17572a = d12;
                                    } else {
                                        d12 = d3;
                                    }
                                } else {
                                    d12 = d10;
                                }
                                if (d11 < d3) {
                                    d13 = -nob.m17572a(9, dMax2);
                                    if (!Double.isNaN(d13) || Double.isInfinite(d13)) {
                                        d13 = d3;
                                        d14 = d13;
                                    } else {
                                        d14 = d3;
                                    }
                                } else {
                                    d13 = dM17572a2;
                                    d14 = d11;
                                }
                                if (!Double.isNaN(d12) || Double.isInfinite(d12)) {
                                    d15 = d3;
                                } else {
                                    d15 = d12;
                                }
                                if (!Double.isNaN(d14) || Double.isInfinite(d14)) {
                                    d16 = d3;
                                } else {
                                    d16 = d14;
                                }
                                if (d13 == d3) {
                                    rm5 rm5Var = sm5.Companion;
                                    StringBuilder sb = new StringBuilder("[LessonTracking] LESSON_STATS updateLessonStats lessonId=");
                                    sb.append(i3);
                                    sb.append(" existingListen=");
                                    sb.append(dMax2);
                                    hn1.m13370t(sb, " listenTimesAdd=", d13, " newListenTimes=");
                                    sb.append(d16);
                                    String string = sb.toString();
                                    rm5Var.getClass();
                                    h0a.f41641a.mo11431b(string, new Object[0]);
                                }
                                lessonEntityM7642a = LessonEntity.m7642a(lessonEntity3, null, 0, 0, d15, d16, 0, false, null, null, -1, -7, 4194303);
                                str4 = str3;
                                d17 = d15;
                                lessonRepositoryImpl$updateLessonStats$3 = lessonRepositoryImpl$updateLessonStats$4;
                                lessonRepositoryImpl$updateLessonStats$3.f15663a = str4;
                                lessonRepositoryImpl$updateLessonStats$3.f15664b = lessonEntity3;
                                lessonRepositoryImpl$updateLessonStats$3.f15665c = null;
                                lessonRepositoryImpl$updateLessonStats$3.f15666d = u85Var2;
                                lessonRepositoryImpl$updateLessonStats$3.f15667e = libraryCounterEntity;
                                lessonRepositoryImpl$updateLessonStats$3.f15668f = i3;
                                lessonRepositoryImpl$updateLessonStats$3.f15670h = d5;
                                lessonRepositoryImpl$updateLessonStats$3.f15671i = d4;
                                lessonRepositoryImpl$updateLessonStats$3.f15659M = z5;
                                u85Var3 = u85Var2;
                                lessonRepositoryImpl$updateLessonStats$3.f15669g = i5;
                                lessonRepositoryImpl$updateLessonStats$3.f15672j = dMax2;
                                d18 = d4;
                                d19 = dM17572a;
                                lessonRepositoryImpl$updateLessonStats$3.f15673k = d19;
                                lessonRepositoryImpl$updateLessonStats$3.f15674l = d13;
                                d20 = d13;
                                lessonRepositoryImpl$updateLessonStats$3.f15654H = dMax;
                                d21 = d12;
                                lessonRepositoryImpl$updateLessonStats$3.f15655I = d21;
                                d22 = d14;
                                lessonRepositoryImpl$updateLessonStats$3.f15656J = d22;
                                lessonRepositoryImpl$updateLessonStats$3.f15657K = d17;
                                lessonRepositoryImpl$updateLessonStats$3.f15658L = d16;
                                lessonRepositoryImpl$updateLessonStats$3.f15662P = 4;
                                if (abstractC1320h.mo4095v0(lessonEntityM7642a, lessonRepositoryImpl$updateLessonStats$3) == coroutineSingletons6) {
                                    return coroutineSingletons6;
                                }
                                u85Var4 = u85Var3;
                                coroutineSingletons2 = coroutineSingletons6;
                                str5 = str4;
                                d23 = d17;
                                lessonEntity4 = lessonEntity3;
                                d24 = d16;
                                d25 = d21;
                                d26 = d22;
                                d27 = dMax;
                                i6 = i5;
                                libraryCounterEntity2 = libraryCounterEntity;
                                z6 = z5;
                                d28 = d19;
                                d29 = d18;
                                d30 = d20;
                                if (u85Var4 == null) {
                                    coroutineSingletons = coroutineSingletons2;
                                    String str14 = str5;
                                    d33 = d5;
                                    d34 = d27;
                                    d35 = d25;
                                    i7 = i3;
                                    d36 = d29;
                                    z7 = z6;
                                    str6 = str14;
                                    i8 = i6;
                                    libraryCounterEntity3 = libraryCounterEntity2;
                                    lessonEntity5 = lessonEntity4;
                                    d37 = dMax2;
                                    d38 = d26;
                                    d39 = d23;
                                    d40 = d28;
                                    d41 = d24;
                                    if (libraryCounterEntity3 != null) {
                                        LibraryCounterEntity libraryCounterEntityM7760a2 = LibraryCounterEntity.m7760a(libraryCounterEntity3, false, new Double(d41), new Double(d39), false, 0, 262095);
                                        lessonRepositoryImpl$updateLessonStats$3.f15663a = str6;
                                        lessonRepositoryImpl$updateLessonStats$3.f15664b = lessonEntity5;
                                        obj2 = null;
                                        lessonRepositoryImpl$updateLessonStats$3.f15665c = null;
                                        lessonRepositoryImpl$updateLessonStats$3.f15666d = null;
                                        lessonRepositoryImpl$updateLessonStats$3.f15667e = null;
                                        lessonRepositoryImpl$updateLessonStats$3.f15668f = i7;
                                        lessonRepositoryImpl$updateLessonStats$3.f15670h = d33;
                                        lessonRepositoryImpl$updateLessonStats$3.f15671i = d36;
                                        lessonRepositoryImpl$updateLessonStats$3.f15659M = z7;
                                        lessonRepositoryImpl$updateLessonStats$3.f15669g = i8;
                                        lessonRepositoryImpl$updateLessonStats$3.f15672j = d37;
                                        double d69 = d40;
                                        lessonRepositoryImpl$updateLessonStats$3.f15673k = d69;
                                        d49 = d69;
                                        lessonRepositoryImpl$updateLessonStats$3.f15674l = d30;
                                        lessonRepositoryImpl$updateLessonStats$3.f15654H = d34;
                                        lessonRepositoryImpl$updateLessonStats$3.f15655I = d35;
                                        lessonRepositoryImpl$updateLessonStats$3.f15656J = d38;
                                        lessonRepositoryImpl$updateLessonStats$3.f15657K = d39;
                                        lessonRepositoryImpl$updateLessonStats$3.f15658L = d41;
                                        lessonRepositoryImpl$updateLessonStats$3.f15662P = 6;
                                        c1321i4 = c1321i2;
                                    } else {
                                        d49 = d40;
                                        obj2 = null;
                                        c1321i4 = c1321i2;
                                    }
                                    lessonEntity7 = lessonEntity5;
                                    str8 = str6;
                                    d6 = d36;
                                    boolean z13 = z7;
                                    c1321i = c1321i4;
                                    r12 = obj2;
                                    String str15 = str8;
                                    lessonRepositoryImpl$updateLessonStats$2 = lessonRepositoryImpl$updateLessonStats$3;
                                    int i17 = i7;
                                    m7284k(str15, i17, d30, d49, z13, y02.m24804b());
                                    str2 = str15;
                                    i14 = i17;
                                    z2 = z13;
                                    lessonEntity = lessonEntity7;
                                    d7 = d33;
                                    break;
                                } else {
                                    u85 u85VarM22536a = u85.m22536a(u85Var4, null, d24, d23, 130687);
                                    double d70 = d24;
                                    double d71 = d23;
                                    lessonRepositoryImpl$updateLessonStats$3.f15663a = str5;
                                    lessonRepositoryImpl$updateLessonStats$3.f15664b = lessonEntity4;
                                    str7 = str5;
                                    lessonRepositoryImpl$updateLessonStats$3.f15665c = null;
                                    lessonRepositoryImpl$updateLessonStats$3.f15666d = null;
                                    lessonRepositoryImpl$updateLessonStats$3.f15667e = libraryCounterEntity2;
                                    lessonRepositoryImpl$updateLessonStats$3.f15668f = i3;
                                    lessonRepositoryImpl$updateLessonStats$3.f15670h = d5;
                                    lessonRepositoryImpl$updateLessonStats$3.f15671i = d29;
                                    lessonRepositoryImpl$updateLessonStats$3.f15659M = z6;
                                    lessonRepositoryImpl$updateLessonStats$3.f15669g = i6;
                                    lessonRepositoryImpl$updateLessonStats$3.f15672j = dMax2;
                                    lessonRepositoryImpl$updateLessonStats$3.f15673k = d28;
                                    i9 = i6;
                                    lessonRepositoryImpl$updateLessonStats$3.f15674l = d30;
                                    d42 = d27;
                                    lessonRepositoryImpl$updateLessonStats$3.f15654H = d42;
                                    d43 = d25;
                                    lessonRepositoryImpl$updateLessonStats$3.f15655I = d43;
                                    double d72 = d26;
                                    lessonRepositoryImpl$updateLessonStats$3.f15656J = d72;
                                    d44 = d72;
                                    lessonRepositoryImpl$updateLessonStats$3.f15657K = d71;
                                    d45 = d71;
                                    lessonRepositoryImpl$updateLessonStats$3.f15658L = d70;
                                    d46 = d70;
                                    lessonRepositoryImpl$updateLessonStats$3.f15662P = 5;
                                    c1321i3 = c1321i2;
                                    objMo4095v0 = c1321i3.mo4095v0(u85VarM22536a, lessonRepositoryImpl$updateLessonStats$3);
                                    coroutineSingletons = coroutineSingletons2;
                                    if (objMo4095v0 != coroutineSingletons) {
                                        d47 = d42;
                                        LessonEntity lessonEntity9 = lessonEntity4;
                                        objM7506D1 = objMo4095v0;
                                        libraryCounterEntity4 = libraryCounterEntity2;
                                        z8 = z6;
                                        i8 = i9;
                                        d48 = d43;
                                        lessonEntity6 = lessonEntity9;
                                        lda.m16122h(((Number) objM7506D1).longValue());
                                        c1321i2 = c1321i3;
                                        d35 = d48;
                                        d34 = d47;
                                        String str16 = str7;
                                        libraryCounterEntity3 = libraryCounterEntity4;
                                        d33 = d5;
                                        i7 = i3;
                                        d36 = d29;
                                        z7 = z8;
                                        str6 = str16;
                                        lessonEntity5 = lessonEntity6;
                                        d38 = d44;
                                        d37 = dMax2;
                                        d40 = d28;
                                        d41 = d46;
                                        d39 = d45;
                                        if (libraryCounterEntity3 != null) {
                                            LibraryCounterEntity libraryCounterEntityM7760a3 = LibraryCounterEntity.m7760a(libraryCounterEntity3, false, new Double(d41), new Double(d39), false, 0, 262095);
                                            lessonRepositoryImpl$updateLessonStats$3.f15663a = str6;
                                            lessonRepositoryImpl$updateLessonStats$3.f15664b = lessonEntity5;
                                            obj2 = null;
                                            lessonRepositoryImpl$updateLessonStats$3.f15665c = null;
                                            lessonRepositoryImpl$updateLessonStats$3.f15666d = null;
                                            lessonRepositoryImpl$updateLessonStats$3.f15667e = null;
                                            lessonRepositoryImpl$updateLessonStats$3.f15668f = i7;
                                            lessonRepositoryImpl$updateLessonStats$3.f15670h = d33;
                                            lessonRepositoryImpl$updateLessonStats$3.f15671i = d36;
                                            lessonRepositoryImpl$updateLessonStats$3.f15659M = z7;
                                            lessonRepositoryImpl$updateLessonStats$3.f15669g = i8;
                                            lessonRepositoryImpl$updateLessonStats$3.f15672j = d37;
                                            double d610 = d40;
                                            lessonRepositoryImpl$updateLessonStats$3.f15673k = d610;
                                            d49 = d610;
                                            lessonRepositoryImpl$updateLessonStats$3.f15674l = d30;
                                            lessonRepositoryImpl$updateLessonStats$3.f15654H = d34;
                                            lessonRepositoryImpl$updateLessonStats$3.f15655I = d35;
                                            lessonRepositoryImpl$updateLessonStats$3.f15656J = d38;
                                            lessonRepositoryImpl$updateLessonStats$3.f15657K = d39;
                                            lessonRepositoryImpl$updateLessonStats$3.f15658L = d41;
                                            lessonRepositoryImpl$updateLessonStats$3.f15662P = 6;
                                            c1321i4 = c1321i2;
                                        } else {
                                            d49 = d40;
                                            obj2 = null;
                                            c1321i4 = c1321i2;
                                        }
                                        lessonEntity7 = lessonEntity5;
                                        str8 = str6;
                                        d6 = d36;
                                        boolean z14 = z7;
                                        c1321i = c1321i4;
                                        r12 = obj2;
                                        String str17 = str8;
                                        lessonRepositoryImpl$updateLessonStats$2 = lessonRepositoryImpl$updateLessonStats$3;
                                        int i18 = i7;
                                        m7284k(str17, i18, d30, d49, z14, y02.m24804b());
                                        str2 = str17;
                                        i14 = i18;
                                        z2 = z14;
                                        lessonEntity = lessonEntity7;
                                        d7 = d33;
                                    }
                                    break;
                                }
                                return coroutineSingletons;
                            }
                        }
                    } else {
                        lessonRepositoryImpl$updateLessonStats$2 = lessonRepositoryImpl$updateLessonStats$4;
                        coroutineSingletons = coroutineSingletons6;
                        c1321i = c1321i6;
                        r12 = 0;
                        d6 = d4;
                        d7 = d5;
                    }
                    if (lessonEntity == null) {
                        lessonRepositoryImpl$updateLessonStats$2.f15663a = str2;
                        lessonRepositoryImpl$updateLessonStats$2.f15664b = r12;
                        lessonRepositoryImpl$updateLessonStats$2.f15665c = r12;
                        lessonRepositoryImpl$updateLessonStats$2.f15666d = r12;
                        lessonRepositoryImpl$updateLessonStats$2.f15667e = r12;
                        lessonRepositoryImpl$updateLessonStats$2.f15668f = i14;
                        lessonRepositoryImpl$updateLessonStats$2.f15670h = d7;
                        lessonRepositoryImpl$updateLessonStats$2.f15671i = d6;
                        lessonRepositoryImpl$updateLessonStats$2.f15659M = z2;
                        lessonRepositoryImpl$updateLessonStats$2.f15662P = 7;
                        objM7505C1 = c1321i.m7505C0(i14, lessonRepositoryImpl$updateLessonStats$2);
                        if (objM7505C1 != coroutineSingletons) {
                            str9 = str2;
                            z9 = z2;
                            objM7506D1 = objM7505C1;
                            d50 = d6;
                            lessonEntity8 = r12;
                            u85Var5 = (u85) objM7506D1;
                            String value2 = LibraryItemType.Content.getValue();
                            lessonRepositoryImpl$updateLessonStats$2.f15663a = str9;
                            lessonRepositoryImpl$updateLessonStats$2.f15664b = lessonEntity8;
                            lessonRepositoryImpl$updateLessonStats$2.f15665c = u85Var5;
                            lessonRepositoryImpl$updateLessonStats$2.f15668f = i14;
                            lessonRepositoryImpl$updateLessonStats$2.f15670h = d7;
                            lessonRepositoryImpl$updateLessonStats$2.f15671i = d50;
                            lessonRepositoryImpl$updateLessonStats$2.f15659M = z9;
                            lessonRepositoryImpl$updateLessonStats$2.f15662P = 8;
                            objM7506D1 = c1321i.m7506D0(i14, value2, lessonRepositoryImpl$updateLessonStats$2);
                            break;
                        }
                        return coroutineSingletons;
                    }
                    return xfa.f68157a;
                }
                return coroutineSingletons6;
            case 1:
                d3 = 0.0d;
                boolean z15 = lessonRepositoryImpl$updateLessonStats$4.f15659M;
                d4 = lessonRepositoryImpl$updateLessonStats$4.f15671i;
                d5 = lessonRepositoryImpl$updateLessonStats$4.f15670h;
                i14 = lessonRepositoryImpl$updateLessonStats$4.f15668f;
                String str18 = lessonRepositoryImpl$updateLessonStats$4.f15663a;
                AbstractC3193b.m15359b(objM7506D1);
                z2 = z15;
                str2 = str18;
                obj = objM7506D1;
                lessonEntity = (LessonEntity) obj;
                if (lessonEntity != null) {
                    lessonRepositoryImpl$updateLessonStats$4.f15663a = str2;
                    lessonRepositoryImpl$updateLessonStats$4.f15664b = lessonEntity;
                    lessonRepositoryImpl$updateLessonStats$4.f15665c = null;
                    lessonRepositoryImpl$updateLessonStats$4.f15668f = i14;
                    lessonRepositoryImpl$updateLessonStats$4.f15670h = d5;
                    lessonRepositoryImpl$updateLessonStats$4.f15671i = d4;
                    lessonRepositoryImpl$updateLessonStats$4.f15659M = z2;
                    lessonRepositoryImpl$updateLessonStats$4.f15669g = 0;
                    lessonRepositoryImpl$updateLessonStats$4.f15662P = 2;
                    objM7505C0 = c1321i6.m7505C0(i14, lessonRepositoryImpl$updateLessonStats$4);
                    if (objM7505C0 != coroutineSingletons6) {
                        str3 = str2;
                        lessonEntity2 = lessonEntity;
                        i2 = 0;
                        i3 = i14;
                        z3 = z2;
                        objM7506D1 = objM7505C0;
                        u85Var = (u85) objM7506D1;
                        String value3 = LibraryItemType.Content.getValue();
                        lessonRepositoryImpl$updateLessonStats$4.f15663a = str3;
                        lessonRepositoryImpl$updateLessonStats$4.f15664b = lessonEntity2;
                        lessonRepositoryImpl$updateLessonStats$4.f15665c = null;
                        lessonRepositoryImpl$updateLessonStats$4.f15666d = u85Var;
                        lessonRepositoryImpl$updateLessonStats$4.f15668f = i3;
                        lessonRepositoryImpl$updateLessonStats$4.f15670h = d5;
                        lessonRepositoryImpl$updateLessonStats$4.f15671i = d4;
                        lessonRepositoryImpl$updateLessonStats$4.f15659M = z3;
                        lessonRepositoryImpl$updateLessonStats$4.f15669g = i2;
                        lessonRepositoryImpl$updateLessonStats$4.f15662P = 3;
                        objM7506D0 = c1321i6.m7506D0(i3, value3, lessonRepositoryImpl$updateLessonStats$4);
                        if (objM7506D0 != coroutineSingletons6) {
                            z4 = z3;
                            i4 = i2;
                            u85Var2 = u85Var;
                            z5 = z4;
                            lessonEntity3 = lessonEntity2;
                            libraryCounterEntity = (LibraryCounterEntity) objM7506D0;
                            double dM7682c1 = lessonEntity3.m7682c0();
                            i5 = i4;
                            if (u85Var2 != null) {
                                d8 = u85Var2.f63553O;
                            } else {
                                d8 = d3;
                            }
                            c1321i2 = c1321i6;
                            if (libraryCounterEntity != null) {
                                dDoubleValue = d3;
                            } else {
                                dDoubleValue = d3;
                            }
                            dMax = Math.max(dM7682c1, Math.max(d8, dDoubleValue));
                            double dM7647C2 = lessonEntity3.m7647C();
                            if (u85Var2 != null) {
                                d9 = u85Var2.f63552N;
                            } else {
                                d9 = d3;
                            }
                            if (libraryCounterEntity != null) {
                                dDoubleValue2 = d3;
                            } else {
                                dDoubleValue2 = d3;
                            }
                            dMax2 = Math.max(dM7647C2, Math.max(d9, dDoubleValue2));
                            dM17572a = nob.m17572a(9, d4);
                            dM17572a2 = nob.m17572a(9, d5);
                            d10 = dMax + dM17572a;
                            d11 = dMax2 + dM17572a2;
                            if (d10 < d3) {
                                dM17572a = -nob.m17572a(9, dMax);
                                if (Double.isNaN(dM17572a)) {
                                    d12 = d3;
                                    dM17572a = d12;
                                } else {
                                    d12 = d3;
                                    dM17572a = d12;
                                }
                            } else {
                                d12 = d10;
                            }
                            if (d11 < d3) {
                                d13 = -nob.m17572a(9, dMax2);
                                if (Double.isNaN(d13)) {
                                    d13 = d3;
                                    d14 = d13;
                                } else {
                                    d13 = d3;
                                    d14 = d13;
                                }
                            } else {
                                d13 = dM17572a2;
                                d14 = d11;
                            }
                            if (Double.isNaN(d12)) {
                                d15 = d3;
                            } else {
                                d15 = d3;
                            }
                            if (Double.isNaN(d14)) {
                                d16 = d3;
                            } else {
                                d16 = d3;
                            }
                            if (d13 == d3) {
                                rm5 rm5Var2 = sm5.Companion;
                                StringBuilder sb2 = new StringBuilder("[LessonTracking] LESSON_STATS updateLessonStats lessonId=");
                                sb2.append(i3);
                                sb2.append(" existingListen=");
                                sb2.append(dMax2);
                                hn1.m13370t(sb2, " listenTimesAdd=", d13, " newListenTimes=");
                                sb2.append(d16);
                                String string2 = sb2.toString();
                                rm5Var2.getClass();
                                h0a.f41641a.mo11431b(string2, new Object[0]);
                            }
                            lessonEntityM7642a = LessonEntity.m7642a(lessonEntity3, null, 0, 0, d15, d16, 0, false, null, null, -1, -7, 4194303);
                            str4 = str3;
                            d17 = d15;
                            lessonRepositoryImpl$updateLessonStats$3 = lessonRepositoryImpl$updateLessonStats$4;
                            lessonRepositoryImpl$updateLessonStats$3.f15663a = str4;
                            lessonRepositoryImpl$updateLessonStats$3.f15664b = lessonEntity3;
                            lessonRepositoryImpl$updateLessonStats$3.f15665c = null;
                            lessonRepositoryImpl$updateLessonStats$3.f15666d = u85Var2;
                            lessonRepositoryImpl$updateLessonStats$3.f15667e = libraryCounterEntity;
                            lessonRepositoryImpl$updateLessonStats$3.f15668f = i3;
                            lessonRepositoryImpl$updateLessonStats$3.f15670h = d5;
                            lessonRepositoryImpl$updateLessonStats$3.f15671i = d4;
                            lessonRepositoryImpl$updateLessonStats$3.f15659M = z5;
                            u85Var3 = u85Var2;
                            lessonRepositoryImpl$updateLessonStats$3.f15669g = i5;
                            lessonRepositoryImpl$updateLessonStats$3.f15672j = dMax2;
                            d18 = d4;
                            d19 = dM17572a;
                            lessonRepositoryImpl$updateLessonStats$3.f15673k = d19;
                            lessonRepositoryImpl$updateLessonStats$3.f15674l = d13;
                            d20 = d13;
                            lessonRepositoryImpl$updateLessonStats$3.f15654H = dMax;
                            d21 = d12;
                            lessonRepositoryImpl$updateLessonStats$3.f15655I = d21;
                            d22 = d14;
                            lessonRepositoryImpl$updateLessonStats$3.f15656J = d22;
                            lessonRepositoryImpl$updateLessonStats$3.f15657K = d17;
                            lessonRepositoryImpl$updateLessonStats$3.f15658L = d16;
                            lessonRepositoryImpl$updateLessonStats$3.f15662P = 4;
                            if (abstractC1320h.mo4095v0(lessonEntityM7642a, lessonRepositoryImpl$updateLessonStats$3) == coroutineSingletons6) {
                                return coroutineSingletons6;
                            }
                            u85Var4 = u85Var3;
                            coroutineSingletons2 = coroutineSingletons6;
                            str5 = str4;
                            d23 = d17;
                            lessonEntity4 = lessonEntity3;
                            d24 = d16;
                            d25 = d21;
                            d26 = d22;
                            d27 = dMax;
                            i6 = i5;
                            libraryCounterEntity2 = libraryCounterEntity;
                            z6 = z5;
                            d28 = d19;
                            d29 = d18;
                            d30 = d20;
                            if (u85Var4 == null) {
                                coroutineSingletons = coroutineSingletons2;
                                String str19 = str5;
                                d33 = d5;
                                d34 = d27;
                                d35 = d25;
                                i7 = i3;
                                d36 = d29;
                                z7 = z6;
                                str6 = str19;
                                i8 = i6;
                                libraryCounterEntity3 = libraryCounterEntity2;
                                lessonEntity5 = lessonEntity4;
                                d37 = dMax2;
                                d38 = d26;
                                d39 = d23;
                                d40 = d28;
                                d41 = d24;
                                if (libraryCounterEntity3 != null) {
                                    LibraryCounterEntity libraryCounterEntityM7760a4 = LibraryCounterEntity.m7760a(libraryCounterEntity3, false, new Double(d41), new Double(d39), false, 0, 262095);
                                    lessonRepositoryImpl$updateLessonStats$3.f15663a = str6;
                                    lessonRepositoryImpl$updateLessonStats$3.f15664b = lessonEntity5;
                                    obj2 = null;
                                    lessonRepositoryImpl$updateLessonStats$3.f15665c = null;
                                    lessonRepositoryImpl$updateLessonStats$3.f15666d = null;
                                    lessonRepositoryImpl$updateLessonStats$3.f15667e = null;
                                    lessonRepositoryImpl$updateLessonStats$3.f15668f = i7;
                                    lessonRepositoryImpl$updateLessonStats$3.f15670h = d33;
                                    lessonRepositoryImpl$updateLessonStats$3.f15671i = d36;
                                    lessonRepositoryImpl$updateLessonStats$3.f15659M = z7;
                                    lessonRepositoryImpl$updateLessonStats$3.f15669g = i8;
                                    lessonRepositoryImpl$updateLessonStats$3.f15672j = d37;
                                    double d611 = d40;
                                    lessonRepositoryImpl$updateLessonStats$3.f15673k = d611;
                                    d49 = d611;
                                    lessonRepositoryImpl$updateLessonStats$3.f15674l = d30;
                                    lessonRepositoryImpl$updateLessonStats$3.f15654H = d34;
                                    lessonRepositoryImpl$updateLessonStats$3.f15655I = d35;
                                    lessonRepositoryImpl$updateLessonStats$3.f15656J = d38;
                                    lessonRepositoryImpl$updateLessonStats$3.f15657K = d39;
                                    lessonRepositoryImpl$updateLessonStats$3.f15658L = d41;
                                    lessonRepositoryImpl$updateLessonStats$3.f15662P = 6;
                                    c1321i4 = c1321i2;
                                } else {
                                    d49 = d40;
                                    obj2 = null;
                                    c1321i4 = c1321i2;
                                }
                                lessonEntity7 = lessonEntity5;
                                str8 = str6;
                                d6 = d36;
                                boolean z16 = z7;
                                c1321i = c1321i4;
                                r12 = obj2;
                                String str110 = str8;
                                lessonRepositoryImpl$updateLessonStats$2 = lessonRepositoryImpl$updateLessonStats$3;
                                int i19 = i7;
                                m7284k(str110, i19, d30, d49, z16, y02.m24804b());
                                str2 = str110;
                                i14 = i19;
                                z2 = z16;
                                lessonEntity = lessonEntity7;
                                d7 = d33;
                                break;
                            } else {
                                u85 u85VarM22536a2 = u85.m22536a(u85Var4, null, d24, d23, 130687);
                                double d73 = d24;
                                double d74 = d23;
                                lessonRepositoryImpl$updateLessonStats$3.f15663a = str5;
                                lessonRepositoryImpl$updateLessonStats$3.f15664b = lessonEntity4;
                                str7 = str5;
                                lessonRepositoryImpl$updateLessonStats$3.f15665c = null;
                                lessonRepositoryImpl$updateLessonStats$3.f15666d = null;
                                lessonRepositoryImpl$updateLessonStats$3.f15667e = libraryCounterEntity2;
                                lessonRepositoryImpl$updateLessonStats$3.f15668f = i3;
                                lessonRepositoryImpl$updateLessonStats$3.f15670h = d5;
                                lessonRepositoryImpl$updateLessonStats$3.f15671i = d29;
                                lessonRepositoryImpl$updateLessonStats$3.f15659M = z6;
                                lessonRepositoryImpl$updateLessonStats$3.f15669g = i6;
                                lessonRepositoryImpl$updateLessonStats$3.f15672j = dMax2;
                                lessonRepositoryImpl$updateLessonStats$3.f15673k = d28;
                                i9 = i6;
                                lessonRepositoryImpl$updateLessonStats$3.f15674l = d30;
                                d42 = d27;
                                lessonRepositoryImpl$updateLessonStats$3.f15654H = d42;
                                d43 = d25;
                                lessonRepositoryImpl$updateLessonStats$3.f15655I = d43;
                                double d75 = d26;
                                lessonRepositoryImpl$updateLessonStats$3.f15656J = d75;
                                d44 = d75;
                                lessonRepositoryImpl$updateLessonStats$3.f15657K = d74;
                                d45 = d74;
                                lessonRepositoryImpl$updateLessonStats$3.f15658L = d73;
                                d46 = d73;
                                lessonRepositoryImpl$updateLessonStats$3.f15662P = 5;
                                c1321i3 = c1321i2;
                                objMo4095v0 = c1321i3.mo4095v0(u85VarM22536a2, lessonRepositoryImpl$updateLessonStats$3);
                                coroutineSingletons = coroutineSingletons2;
                                if (objMo4095v0 != coroutineSingletons) {
                                    d47 = d42;
                                    LessonEntity lessonEntity10 = lessonEntity4;
                                    objM7506D1 = objMo4095v0;
                                    libraryCounterEntity4 = libraryCounterEntity2;
                                    z8 = z6;
                                    i8 = i9;
                                    d48 = d43;
                                    lessonEntity6 = lessonEntity10;
                                    lda.m16122h(((Number) objM7506D1).longValue());
                                    c1321i2 = c1321i3;
                                    d35 = d48;
                                    d34 = d47;
                                    String str111 = str7;
                                    libraryCounterEntity3 = libraryCounterEntity4;
                                    d33 = d5;
                                    i7 = i3;
                                    d36 = d29;
                                    z7 = z8;
                                    str6 = str111;
                                    lessonEntity5 = lessonEntity6;
                                    d38 = d44;
                                    d37 = dMax2;
                                    d40 = d28;
                                    d41 = d46;
                                    d39 = d45;
                                    if (libraryCounterEntity3 != null) {
                                        LibraryCounterEntity libraryCounterEntityM7760a5 = LibraryCounterEntity.m7760a(libraryCounterEntity3, false, new Double(d41), new Double(d39), false, 0, 262095);
                                        lessonRepositoryImpl$updateLessonStats$3.f15663a = str6;
                                        lessonRepositoryImpl$updateLessonStats$3.f15664b = lessonEntity5;
                                        obj2 = null;
                                        lessonRepositoryImpl$updateLessonStats$3.f15665c = null;
                                        lessonRepositoryImpl$updateLessonStats$3.f15666d = null;
                                        lessonRepositoryImpl$updateLessonStats$3.f15667e = null;
                                        lessonRepositoryImpl$updateLessonStats$3.f15668f = i7;
                                        lessonRepositoryImpl$updateLessonStats$3.f15670h = d33;
                                        lessonRepositoryImpl$updateLessonStats$3.f15671i = d36;
                                        lessonRepositoryImpl$updateLessonStats$3.f15659M = z7;
                                        lessonRepositoryImpl$updateLessonStats$3.f15669g = i8;
                                        lessonRepositoryImpl$updateLessonStats$3.f15672j = d37;
                                        double d612 = d40;
                                        lessonRepositoryImpl$updateLessonStats$3.f15673k = d612;
                                        d49 = d612;
                                        lessonRepositoryImpl$updateLessonStats$3.f15674l = d30;
                                        lessonRepositoryImpl$updateLessonStats$3.f15654H = d34;
                                        lessonRepositoryImpl$updateLessonStats$3.f15655I = d35;
                                        lessonRepositoryImpl$updateLessonStats$3.f15656J = d38;
                                        lessonRepositoryImpl$updateLessonStats$3.f15657K = d39;
                                        lessonRepositoryImpl$updateLessonStats$3.f15658L = d41;
                                        lessonRepositoryImpl$updateLessonStats$3.f15662P = 6;
                                        c1321i4 = c1321i2;
                                    } else {
                                        d49 = d40;
                                        obj2 = null;
                                        c1321i4 = c1321i2;
                                    }
                                    lessonEntity7 = lessonEntity5;
                                    str8 = str6;
                                    d6 = d36;
                                    boolean z17 = z7;
                                    c1321i = c1321i4;
                                    r12 = obj2;
                                    String str112 = str8;
                                    lessonRepositoryImpl$updateLessonStats$2 = lessonRepositoryImpl$updateLessonStats$3;
                                    int i110 = i7;
                                    m7284k(str112, i110, d30, d49, z17, y02.m24804b());
                                    str2 = str112;
                                    i14 = i110;
                                    z2 = z17;
                                    lessonEntity = lessonEntity7;
                                    d7 = d33;
                                }
                                break;
                            }
                            return coroutineSingletons;
                        }
                    }
                    return coroutineSingletons6;
                }
                lessonRepositoryImpl$updateLessonStats$2 = lessonRepositoryImpl$updateLessonStats$4;
                coroutineSingletons = coroutineSingletons6;
                c1321i = c1321i6;
                r12 = 0;
                d6 = d4;
                d7 = d5;
                if (lessonEntity == null) {
                    lessonRepositoryImpl$updateLessonStats$2.f15663a = str2;
                    lessonRepositoryImpl$updateLessonStats$2.f15664b = r12;
                    lessonRepositoryImpl$updateLessonStats$2.f15665c = r12;
                    lessonRepositoryImpl$updateLessonStats$2.f15666d = r12;
                    lessonRepositoryImpl$updateLessonStats$2.f15667e = r12;
                    lessonRepositoryImpl$updateLessonStats$2.f15668f = i14;
                    lessonRepositoryImpl$updateLessonStats$2.f15670h = d7;
                    lessonRepositoryImpl$updateLessonStats$2.f15671i = d6;
                    lessonRepositoryImpl$updateLessonStats$2.f15659M = z2;
                    lessonRepositoryImpl$updateLessonStats$2.f15662P = 7;
                    objM7505C1 = c1321i.m7505C0(i14, lessonRepositoryImpl$updateLessonStats$2);
                    if (objM7505C1 != coroutineSingletons) {
                        str9 = str2;
                        z9 = z2;
                        objM7506D1 = objM7505C1;
                        d50 = d6;
                        lessonEntity8 = r12;
                        u85Var5 = (u85) objM7506D1;
                        String value4 = LibraryItemType.Content.getValue();
                        lessonRepositoryImpl$updateLessonStats$2.f15663a = str9;
                        lessonRepositoryImpl$updateLessonStats$2.f15664b = lessonEntity8;
                        lessonRepositoryImpl$updateLessonStats$2.f15665c = u85Var5;
                        lessonRepositoryImpl$updateLessonStats$2.f15668f = i14;
                        lessonRepositoryImpl$updateLessonStats$2.f15670h = d7;
                        lessonRepositoryImpl$updateLessonStats$2.f15671i = d50;
                        lessonRepositoryImpl$updateLessonStats$2.f15659M = z9;
                        lessonRepositoryImpl$updateLessonStats$2.f15662P = 8;
                        objM7506D1 = c1321i.m7506D0(i14, value4, lessonRepositoryImpl$updateLessonStats$2);
                        break;
                    }
                    return coroutineSingletons;
                }
                return xfa.f68157a;
            case 2:
                d3 = 0.0d;
                i2 = lessonRepositoryImpl$updateLessonStats$4.f15669g;
                z3 = lessonRepositoryImpl$updateLessonStats$4.f15659M;
                d4 = lessonRepositoryImpl$updateLessonStats$4.f15671i;
                d5 = lessonRepositoryImpl$updateLessonStats$4.f15670h;
                i3 = lessonRepositoryImpl$updateLessonStats$4.f15668f;
                LessonEntity lessonEntity11 = lessonRepositoryImpl$updateLessonStats$4.f15664b;
                String str20 = lessonRepositoryImpl$updateLessonStats$4.f15663a;
                AbstractC3193b.m15359b(objM7506D1);
                str3 = str20;
                lessonEntity2 = lessonEntity11;
                u85Var = (u85) objM7506D1;
                String value5 = LibraryItemType.Content.getValue();
                lessonRepositoryImpl$updateLessonStats$4.f15663a = str3;
                lessonRepositoryImpl$updateLessonStats$4.f15664b = lessonEntity2;
                lessonRepositoryImpl$updateLessonStats$4.f15665c = null;
                lessonRepositoryImpl$updateLessonStats$4.f15666d = u85Var;
                lessonRepositoryImpl$updateLessonStats$4.f15668f = i3;
                lessonRepositoryImpl$updateLessonStats$4.f15670h = d5;
                lessonRepositoryImpl$updateLessonStats$4.f15671i = d4;
                lessonRepositoryImpl$updateLessonStats$4.f15659M = z3;
                lessonRepositoryImpl$updateLessonStats$4.f15669g = i2;
                lessonRepositoryImpl$updateLessonStats$4.f15662P = 3;
                objM7506D0 = c1321i6.m7506D0(i3, value5, lessonRepositoryImpl$updateLessonStats$4);
                if (objM7506D0 != coroutineSingletons6) {
                    z4 = z3;
                    i4 = i2;
                    u85Var2 = u85Var;
                    z5 = z4;
                    lessonEntity3 = lessonEntity2;
                    libraryCounterEntity = (LibraryCounterEntity) objM7506D0;
                    double dM7682c2 = lessonEntity3.m7682c0();
                    i5 = i4;
                    if (u85Var2 != null) {
                        d8 = u85Var2.f63553O;
                    } else {
                        d8 = d3;
                    }
                    c1321i2 = c1321i6;
                    if (libraryCounterEntity != null) {
                        dDoubleValue = d3;
                    } else {
                        dDoubleValue = d3;
                    }
                    dMax = Math.max(dM7682c2, Math.max(d8, dDoubleValue));
                    double dM7647C3 = lessonEntity3.m7647C();
                    if (u85Var2 != null) {
                        d9 = u85Var2.f63552N;
                    } else {
                        d9 = d3;
                    }
                    if (libraryCounterEntity != null) {
                        dDoubleValue2 = d3;
                    } else {
                        dDoubleValue2 = d3;
                    }
                    dMax2 = Math.max(dM7647C3, Math.max(d9, dDoubleValue2));
                    dM17572a = nob.m17572a(9, d4);
                    dM17572a2 = nob.m17572a(9, d5);
                    d10 = dMax + dM17572a;
                    d11 = dMax2 + dM17572a2;
                    if (d10 < d3) {
                        dM17572a = -nob.m17572a(9, dMax);
                        if (Double.isNaN(dM17572a)) {
                            d12 = d3;
                            dM17572a = d12;
                        } else {
                            d12 = d3;
                            dM17572a = d12;
                        }
                    } else {
                        d12 = d10;
                    }
                    if (d11 < d3) {
                        d13 = -nob.m17572a(9, dMax2);
                        if (Double.isNaN(d13)) {
                            d13 = d3;
                            d14 = d13;
                        } else {
                            d13 = d3;
                            d14 = d13;
                        }
                    } else {
                        d13 = dM17572a2;
                        d14 = d11;
                    }
                    if (Double.isNaN(d12)) {
                        d15 = d3;
                    } else {
                        d15 = d3;
                    }
                    if (Double.isNaN(d14)) {
                        d16 = d3;
                    } else {
                        d16 = d3;
                    }
                    if (d13 == d3) {
                        rm5 rm5Var3 = sm5.Companion;
                        StringBuilder sb3 = new StringBuilder("[LessonTracking] LESSON_STATS updateLessonStats lessonId=");
                        sb3.append(i3);
                        sb3.append(" existingListen=");
                        sb3.append(dMax2);
                        hn1.m13370t(sb3, " listenTimesAdd=", d13, " newListenTimes=");
                        sb3.append(d16);
                        String string3 = sb3.toString();
                        rm5Var3.getClass();
                        h0a.f41641a.mo11431b(string3, new Object[0]);
                    }
                    lessonEntityM7642a = LessonEntity.m7642a(lessonEntity3, null, 0, 0, d15, d16, 0, false, null, null, -1, -7, 4194303);
                    str4 = str3;
                    d17 = d15;
                    lessonRepositoryImpl$updateLessonStats$3 = lessonRepositoryImpl$updateLessonStats$4;
                    lessonRepositoryImpl$updateLessonStats$3.f15663a = str4;
                    lessonRepositoryImpl$updateLessonStats$3.f15664b = lessonEntity3;
                    lessonRepositoryImpl$updateLessonStats$3.f15665c = null;
                    lessonRepositoryImpl$updateLessonStats$3.f15666d = u85Var2;
                    lessonRepositoryImpl$updateLessonStats$3.f15667e = libraryCounterEntity;
                    lessonRepositoryImpl$updateLessonStats$3.f15668f = i3;
                    lessonRepositoryImpl$updateLessonStats$3.f15670h = d5;
                    lessonRepositoryImpl$updateLessonStats$3.f15671i = d4;
                    lessonRepositoryImpl$updateLessonStats$3.f15659M = z5;
                    u85Var3 = u85Var2;
                    lessonRepositoryImpl$updateLessonStats$3.f15669g = i5;
                    lessonRepositoryImpl$updateLessonStats$3.f15672j = dMax2;
                    d18 = d4;
                    d19 = dM17572a;
                    lessonRepositoryImpl$updateLessonStats$3.f15673k = d19;
                    lessonRepositoryImpl$updateLessonStats$3.f15674l = d13;
                    d20 = d13;
                    lessonRepositoryImpl$updateLessonStats$3.f15654H = dMax;
                    d21 = d12;
                    lessonRepositoryImpl$updateLessonStats$3.f15655I = d21;
                    d22 = d14;
                    lessonRepositoryImpl$updateLessonStats$3.f15656J = d22;
                    lessonRepositoryImpl$updateLessonStats$3.f15657K = d17;
                    lessonRepositoryImpl$updateLessonStats$3.f15658L = d16;
                    lessonRepositoryImpl$updateLessonStats$3.f15662P = 4;
                    if (abstractC1320h.mo4095v0(lessonEntityM7642a, lessonRepositoryImpl$updateLessonStats$3) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                    u85Var4 = u85Var3;
                    coroutineSingletons2 = coroutineSingletons6;
                    str5 = str4;
                    d23 = d17;
                    lessonEntity4 = lessonEntity3;
                    d24 = d16;
                    d25 = d21;
                    d26 = d22;
                    d27 = dMax;
                    i6 = i5;
                    libraryCounterEntity2 = libraryCounterEntity;
                    z6 = z5;
                    d28 = d19;
                    d29 = d18;
                    d30 = d20;
                    if (u85Var4 == null) {
                        coroutineSingletons = coroutineSingletons2;
                        String str113 = str5;
                        d33 = d5;
                        d34 = d27;
                        d35 = d25;
                        i7 = i3;
                        d36 = d29;
                        z7 = z6;
                        str6 = str113;
                        i8 = i6;
                        libraryCounterEntity3 = libraryCounterEntity2;
                        lessonEntity5 = lessonEntity4;
                        d37 = dMax2;
                        d38 = d26;
                        d39 = d23;
                        d40 = d28;
                        d41 = d24;
                        if (libraryCounterEntity3 != null) {
                            LibraryCounterEntity libraryCounterEntityM7760a6 = LibraryCounterEntity.m7760a(libraryCounterEntity3, false, new Double(d41), new Double(d39), false, 0, 262095);
                            lessonRepositoryImpl$updateLessonStats$3.f15663a = str6;
                            lessonRepositoryImpl$updateLessonStats$3.f15664b = lessonEntity5;
                            obj2 = null;
                            lessonRepositoryImpl$updateLessonStats$3.f15665c = null;
                            lessonRepositoryImpl$updateLessonStats$3.f15666d = null;
                            lessonRepositoryImpl$updateLessonStats$3.f15667e = null;
                            lessonRepositoryImpl$updateLessonStats$3.f15668f = i7;
                            lessonRepositoryImpl$updateLessonStats$3.f15670h = d33;
                            lessonRepositoryImpl$updateLessonStats$3.f15671i = d36;
                            lessonRepositoryImpl$updateLessonStats$3.f15659M = z7;
                            lessonRepositoryImpl$updateLessonStats$3.f15669g = i8;
                            lessonRepositoryImpl$updateLessonStats$3.f15672j = d37;
                            double d613 = d40;
                            lessonRepositoryImpl$updateLessonStats$3.f15673k = d613;
                            d49 = d613;
                            lessonRepositoryImpl$updateLessonStats$3.f15674l = d30;
                            lessonRepositoryImpl$updateLessonStats$3.f15654H = d34;
                            lessonRepositoryImpl$updateLessonStats$3.f15655I = d35;
                            lessonRepositoryImpl$updateLessonStats$3.f15656J = d38;
                            lessonRepositoryImpl$updateLessonStats$3.f15657K = d39;
                            lessonRepositoryImpl$updateLessonStats$3.f15658L = d41;
                            lessonRepositoryImpl$updateLessonStats$3.f15662P = 6;
                            c1321i4 = c1321i2;
                            break;
                        } else {
                            d49 = d40;
                            obj2 = null;
                            c1321i4 = c1321i2;
                        }
                        lessonEntity7 = lessonEntity5;
                        str8 = str6;
                        d6 = d36;
                        boolean z18 = z7;
                        c1321i = c1321i4;
                        r12 = obj2;
                        String str114 = str8;
                        lessonRepositoryImpl$updateLessonStats$2 = lessonRepositoryImpl$updateLessonStats$3;
                        int i111 = i7;
                        m7284k(str114, i111, d30, d49, z18, y02.m24804b());
                        str2 = str114;
                        i14 = i111;
                        z2 = z18;
                        lessonEntity = lessonEntity7;
                        d7 = d33;
                        if (lessonEntity == null) {
                            lessonRepositoryImpl$updateLessonStats$2.f15663a = str2;
                            lessonRepositoryImpl$updateLessonStats$2.f15664b = r12;
                            lessonRepositoryImpl$updateLessonStats$2.f15665c = r12;
                            lessonRepositoryImpl$updateLessonStats$2.f15666d = r12;
                            lessonRepositoryImpl$updateLessonStats$2.f15667e = r12;
                            lessonRepositoryImpl$updateLessonStats$2.f15668f = i14;
                            lessonRepositoryImpl$updateLessonStats$2.f15670h = d7;
                            lessonRepositoryImpl$updateLessonStats$2.f15671i = d6;
                            lessonRepositoryImpl$updateLessonStats$2.f15659M = z2;
                            lessonRepositoryImpl$updateLessonStats$2.f15662P = 7;
                            objM7505C1 = c1321i.m7505C0(i14, lessonRepositoryImpl$updateLessonStats$2);
                            if (objM7505C1 != coroutineSingletons) {
                                str9 = str2;
                                z9 = z2;
                                objM7506D1 = objM7505C1;
                                d50 = d6;
                                lessonEntity8 = r12;
                                u85Var5 = (u85) objM7506D1;
                                String value6 = LibraryItemType.Content.getValue();
                                lessonRepositoryImpl$updateLessonStats$2.f15663a = str9;
                                lessonRepositoryImpl$updateLessonStats$2.f15664b = lessonEntity8;
                                lessonRepositoryImpl$updateLessonStats$2.f15665c = u85Var5;
                                lessonRepositoryImpl$updateLessonStats$2.f15668f = i14;
                                lessonRepositoryImpl$updateLessonStats$2.f15670h = d7;
                                lessonRepositoryImpl$updateLessonStats$2.f15671i = d50;
                                lessonRepositoryImpl$updateLessonStats$2.f15659M = z9;
                                lessonRepositoryImpl$updateLessonStats$2.f15662P = 8;
                                objM7506D1 = c1321i.m7506D0(i14, value6, lessonRepositoryImpl$updateLessonStats$2);
                            }
                            break;
                        }
                        return xfa.f68157a;
                    }
                    u85 u85VarM22536a3 = u85.m22536a(u85Var4, null, d24, d23, 130687);
                    double d76 = d24;
                    double d77 = d23;
                    lessonRepositoryImpl$updateLessonStats$3.f15663a = str5;
                    lessonRepositoryImpl$updateLessonStats$3.f15664b = lessonEntity4;
                    str7 = str5;
                    lessonRepositoryImpl$updateLessonStats$3.f15665c = null;
                    lessonRepositoryImpl$updateLessonStats$3.f15666d = null;
                    lessonRepositoryImpl$updateLessonStats$3.f15667e = libraryCounterEntity2;
                    lessonRepositoryImpl$updateLessonStats$3.f15668f = i3;
                    lessonRepositoryImpl$updateLessonStats$3.f15670h = d5;
                    lessonRepositoryImpl$updateLessonStats$3.f15671i = d29;
                    lessonRepositoryImpl$updateLessonStats$3.f15659M = z6;
                    lessonRepositoryImpl$updateLessonStats$3.f15669g = i6;
                    lessonRepositoryImpl$updateLessonStats$3.f15672j = dMax2;
                    lessonRepositoryImpl$updateLessonStats$3.f15673k = d28;
                    i9 = i6;
                    lessonRepositoryImpl$updateLessonStats$3.f15674l = d30;
                    d42 = d27;
                    lessonRepositoryImpl$updateLessonStats$3.f15654H = d42;
                    d43 = d25;
                    lessonRepositoryImpl$updateLessonStats$3.f15655I = d43;
                    double d78 = d26;
                    lessonRepositoryImpl$updateLessonStats$3.f15656J = d78;
                    d44 = d78;
                    lessonRepositoryImpl$updateLessonStats$3.f15657K = d77;
                    d45 = d77;
                    lessonRepositoryImpl$updateLessonStats$3.f15658L = d76;
                    d46 = d76;
                    lessonRepositoryImpl$updateLessonStats$3.f15662P = 5;
                    c1321i3 = c1321i2;
                    objMo4095v0 = c1321i3.mo4095v0(u85VarM22536a3, lessonRepositoryImpl$updateLessonStats$3);
                    coroutineSingletons = coroutineSingletons2;
                    if (objMo4095v0 != coroutineSingletons) {
                        d47 = d42;
                        LessonEntity lessonEntity12 = lessonEntity4;
                        objM7506D1 = objMo4095v0;
                        libraryCounterEntity4 = libraryCounterEntity2;
                        z8 = z6;
                        i8 = i9;
                        d48 = d43;
                        lessonEntity6 = lessonEntity12;
                        lda.m16122h(((Number) objM7506D1).longValue());
                        c1321i2 = c1321i3;
                        d35 = d48;
                        d34 = d47;
                        String str115 = str7;
                        libraryCounterEntity3 = libraryCounterEntity4;
                        d33 = d5;
                        i7 = i3;
                        d36 = d29;
                        z7 = z8;
                        str6 = str115;
                        lessonEntity5 = lessonEntity6;
                        d38 = d44;
                        d37 = dMax2;
                        d40 = d28;
                        d41 = d46;
                        d39 = d45;
                        if (libraryCounterEntity3 != null) {
                            LibraryCounterEntity libraryCounterEntityM7760a7 = LibraryCounterEntity.m7760a(libraryCounterEntity3, false, new Double(d41), new Double(d39), false, 0, 262095);
                            lessonRepositoryImpl$updateLessonStats$3.f15663a = str6;
                            lessonRepositoryImpl$updateLessonStats$3.f15664b = lessonEntity5;
                            obj2 = null;
                            lessonRepositoryImpl$updateLessonStats$3.f15665c = null;
                            lessonRepositoryImpl$updateLessonStats$3.f15666d = null;
                            lessonRepositoryImpl$updateLessonStats$3.f15667e = null;
                            lessonRepositoryImpl$updateLessonStats$3.f15668f = i7;
                            lessonRepositoryImpl$updateLessonStats$3.f15670h = d33;
                            lessonRepositoryImpl$updateLessonStats$3.f15671i = d36;
                            lessonRepositoryImpl$updateLessonStats$3.f15659M = z7;
                            lessonRepositoryImpl$updateLessonStats$3.f15669g = i8;
                            lessonRepositoryImpl$updateLessonStats$3.f15672j = d37;
                            double d614 = d40;
                            lessonRepositoryImpl$updateLessonStats$3.f15673k = d614;
                            d49 = d614;
                            lessonRepositoryImpl$updateLessonStats$3.f15674l = d30;
                            lessonRepositoryImpl$updateLessonStats$3.f15654H = d34;
                            lessonRepositoryImpl$updateLessonStats$3.f15655I = d35;
                            lessonRepositoryImpl$updateLessonStats$3.f15656J = d38;
                            lessonRepositoryImpl$updateLessonStats$3.f15657K = d39;
                            lessonRepositoryImpl$updateLessonStats$3.f15658L = d41;
                            lessonRepositoryImpl$updateLessonStats$3.f15662P = 6;
                            c1321i4 = c1321i2;
                            break;
                        } else {
                            d49 = d40;
                            obj2 = null;
                            c1321i4 = c1321i2;
                        }
                        lessonEntity7 = lessonEntity5;
                        str8 = str6;
                        d6 = d36;
                        boolean z19 = z7;
                        c1321i = c1321i4;
                        r12 = obj2;
                        String str116 = str8;
                        lessonRepositoryImpl$updateLessonStats$2 = lessonRepositoryImpl$updateLessonStats$3;
                        int i112 = i7;
                        m7284k(str116, i112, d30, d49, z19, y02.m24804b());
                        str2 = str116;
                        i14 = i112;
                        z2 = z19;
                        lessonEntity = lessonEntity7;
                        d7 = d33;
                        if (lessonEntity == null) {
                            lessonRepositoryImpl$updateLessonStats$2.f15663a = str2;
                            lessonRepositoryImpl$updateLessonStats$2.f15664b = r12;
                            lessonRepositoryImpl$updateLessonStats$2.f15665c = r12;
                            lessonRepositoryImpl$updateLessonStats$2.f15666d = r12;
                            lessonRepositoryImpl$updateLessonStats$2.f15667e = r12;
                            lessonRepositoryImpl$updateLessonStats$2.f15668f = i14;
                            lessonRepositoryImpl$updateLessonStats$2.f15670h = d7;
                            lessonRepositoryImpl$updateLessonStats$2.f15671i = d6;
                            lessonRepositoryImpl$updateLessonStats$2.f15659M = z2;
                            lessonRepositoryImpl$updateLessonStats$2.f15662P = 7;
                            objM7505C1 = c1321i.m7505C0(i14, lessonRepositoryImpl$updateLessonStats$2);
                            if (objM7505C1 != coroutineSingletons) {
                                str9 = str2;
                                z9 = z2;
                                objM7506D1 = objM7505C1;
                                d50 = d6;
                                lessonEntity8 = r12;
                                u85Var5 = (u85) objM7506D1;
                                String value7 = LibraryItemType.Content.getValue();
                                lessonRepositoryImpl$updateLessonStats$2.f15663a = str9;
                                lessonRepositoryImpl$updateLessonStats$2.f15664b = lessonEntity8;
                                lessonRepositoryImpl$updateLessonStats$2.f15665c = u85Var5;
                                lessonRepositoryImpl$updateLessonStats$2.f15668f = i14;
                                lessonRepositoryImpl$updateLessonStats$2.f15670h = d7;
                                lessonRepositoryImpl$updateLessonStats$2.f15671i = d50;
                                lessonRepositoryImpl$updateLessonStats$2.f15659M = z9;
                                lessonRepositoryImpl$updateLessonStats$2.f15662P = 8;
                                objM7506D1 = c1321i.m7506D0(i14, value7, lessonRepositoryImpl$updateLessonStats$2);
                            }
                            break;
                        }
                        return xfa.f68157a;
                    }
                    return coroutineSingletons;
                }
                return coroutineSingletons6;
            case 3:
                d3 = 0.0d;
                int i20 = lessonRepositoryImpl$updateLessonStats$4.f15669g;
                boolean z20 = lessonRepositoryImpl$updateLessonStats$4.f15659M;
                d4 = lessonRepositoryImpl$updateLessonStats$4.f15671i;
                d5 = lessonRepositoryImpl$updateLessonStats$4.f15670h;
                i3 = lessonRepositoryImpl$updateLessonStats$4.f15668f;
                u85 u85Var6 = (u85) lessonRepositoryImpl$updateLessonStats$4.f15666d;
                lessonEntity2 = lessonRepositoryImpl$updateLessonStats$4.f15664b;
                str3 = lessonRepositoryImpl$updateLessonStats$4.f15663a;
                AbstractC3193b.m15359b(objM7506D1);
                z4 = z20;
                i4 = i20;
                u85Var2 = u85Var6;
                objM7506D0 = objM7506D1;
                z5 = z4;
                lessonEntity3 = lessonEntity2;
                libraryCounterEntity = (LibraryCounterEntity) objM7506D0;
                double dM7682c3 = lessonEntity3.m7682c0();
                i5 = i4;
                if (u85Var2 != null) {
                    d8 = u85Var2.f63553O;
                } else {
                    d8 = d3;
                }
                c1321i2 = c1321i6;
                if (libraryCounterEntity != null) {
                    dDoubleValue = d3;
                } else {
                    dDoubleValue = d3;
                }
                dMax = Math.max(dM7682c3, Math.max(d8, dDoubleValue));
                double dM7647C4 = lessonEntity3.m7647C();
                if (u85Var2 != null) {
                    d9 = u85Var2.f63552N;
                } else {
                    d9 = d3;
                }
                if (libraryCounterEntity != null) {
                    dDoubleValue2 = d3;
                } else {
                    dDoubleValue2 = d3;
                }
                dMax2 = Math.max(dM7647C4, Math.max(d9, dDoubleValue2));
                dM17572a = nob.m17572a(9, d4);
                dM17572a2 = nob.m17572a(9, d5);
                d10 = dMax + dM17572a;
                d11 = dMax2 + dM17572a2;
                if (d10 < d3) {
                    dM17572a = -nob.m17572a(9, dMax);
                    if (Double.isNaN(dM17572a)) {
                        d12 = d3;
                        dM17572a = d12;
                    } else {
                        d12 = d3;
                        dM17572a = d12;
                    }
                } else {
                    d12 = d10;
                }
                if (d11 < d3) {
                    d13 = -nob.m17572a(9, dMax2);
                    if (Double.isNaN(d13)) {
                        d13 = d3;
                        d14 = d13;
                    } else {
                        d13 = d3;
                        d14 = d13;
                    }
                } else {
                    d13 = dM17572a2;
                    d14 = d11;
                }
                if (Double.isNaN(d12)) {
                    d15 = d3;
                } else {
                    d15 = d3;
                }
                if (Double.isNaN(d14)) {
                    d16 = d3;
                } else {
                    d16 = d3;
                }
                if (d13 == d3) {
                    rm5 rm5Var4 = sm5.Companion;
                    StringBuilder sb4 = new StringBuilder("[LessonTracking] LESSON_STATS updateLessonStats lessonId=");
                    sb4.append(i3);
                    sb4.append(" existingListen=");
                    sb4.append(dMax2);
                    hn1.m13370t(sb4, " listenTimesAdd=", d13, " newListenTimes=");
                    sb4.append(d16);
                    String string4 = sb4.toString();
                    rm5Var4.getClass();
                    h0a.f41641a.mo11431b(string4, new Object[0]);
                }
                lessonEntityM7642a = LessonEntity.m7642a(lessonEntity3, null, 0, 0, d15, d16, 0, false, null, null, -1, -7, 4194303);
                str4 = str3;
                d17 = d15;
                lessonRepositoryImpl$updateLessonStats$3 = lessonRepositoryImpl$updateLessonStats$4;
                lessonRepositoryImpl$updateLessonStats$3.f15663a = str4;
                lessonRepositoryImpl$updateLessonStats$3.f15664b = lessonEntity3;
                lessonRepositoryImpl$updateLessonStats$3.f15665c = null;
                lessonRepositoryImpl$updateLessonStats$3.f15666d = u85Var2;
                lessonRepositoryImpl$updateLessonStats$3.f15667e = libraryCounterEntity;
                lessonRepositoryImpl$updateLessonStats$3.f15668f = i3;
                lessonRepositoryImpl$updateLessonStats$3.f15670h = d5;
                lessonRepositoryImpl$updateLessonStats$3.f15671i = d4;
                lessonRepositoryImpl$updateLessonStats$3.f15659M = z5;
                u85Var3 = u85Var2;
                lessonRepositoryImpl$updateLessonStats$3.f15669g = i5;
                lessonRepositoryImpl$updateLessonStats$3.f15672j = dMax2;
                d18 = d4;
                d19 = dM17572a;
                lessonRepositoryImpl$updateLessonStats$3.f15673k = d19;
                lessonRepositoryImpl$updateLessonStats$3.f15674l = d13;
                d20 = d13;
                lessonRepositoryImpl$updateLessonStats$3.f15654H = dMax;
                d21 = d12;
                lessonRepositoryImpl$updateLessonStats$3.f15655I = d21;
                d22 = d14;
                lessonRepositoryImpl$updateLessonStats$3.f15656J = d22;
                lessonRepositoryImpl$updateLessonStats$3.f15657K = d17;
                lessonRepositoryImpl$updateLessonStats$3.f15658L = d16;
                lessonRepositoryImpl$updateLessonStats$3.f15662P = 4;
                if (abstractC1320h.mo4095v0(lessonEntityM7642a, lessonRepositoryImpl$updateLessonStats$3) == coroutineSingletons6) {
                    return coroutineSingletons6;
                }
                u85Var4 = u85Var3;
                coroutineSingletons2 = coroutineSingletons6;
                str5 = str4;
                d23 = d17;
                lessonEntity4 = lessonEntity3;
                d24 = d16;
                d25 = d21;
                d26 = d22;
                d27 = dMax;
                i6 = i5;
                libraryCounterEntity2 = libraryCounterEntity;
                z6 = z5;
                d28 = d19;
                d29 = d18;
                d30 = d20;
                if (u85Var4 == null) {
                    coroutineSingletons = coroutineSingletons2;
                    String str117 = str5;
                    d33 = d5;
                    d34 = d27;
                    d35 = d25;
                    i7 = i3;
                    d36 = d29;
                    z7 = z6;
                    str6 = str117;
                    i8 = i6;
                    libraryCounterEntity3 = libraryCounterEntity2;
                    lessonEntity5 = lessonEntity4;
                    d37 = dMax2;
                    d38 = d26;
                    d39 = d23;
                    d40 = d28;
                    d41 = d24;
                    if (libraryCounterEntity3 != null) {
                        LibraryCounterEntity libraryCounterEntityM7760a8 = LibraryCounterEntity.m7760a(libraryCounterEntity3, false, new Double(d41), new Double(d39), false, 0, 262095);
                        lessonRepositoryImpl$updateLessonStats$3.f15663a = str6;
                        lessonRepositoryImpl$updateLessonStats$3.f15664b = lessonEntity5;
                        obj2 = null;
                        lessonRepositoryImpl$updateLessonStats$3.f15665c = null;
                        lessonRepositoryImpl$updateLessonStats$3.f15666d = null;
                        lessonRepositoryImpl$updateLessonStats$3.f15667e = null;
                        lessonRepositoryImpl$updateLessonStats$3.f15668f = i7;
                        lessonRepositoryImpl$updateLessonStats$3.f15670h = d33;
                        lessonRepositoryImpl$updateLessonStats$3.f15671i = d36;
                        lessonRepositoryImpl$updateLessonStats$3.f15659M = z7;
                        lessonRepositoryImpl$updateLessonStats$3.f15669g = i8;
                        lessonRepositoryImpl$updateLessonStats$3.f15672j = d37;
                        double d615 = d40;
                        lessonRepositoryImpl$updateLessonStats$3.f15673k = d615;
                        d49 = d615;
                        lessonRepositoryImpl$updateLessonStats$3.f15674l = d30;
                        lessonRepositoryImpl$updateLessonStats$3.f15654H = d34;
                        lessonRepositoryImpl$updateLessonStats$3.f15655I = d35;
                        lessonRepositoryImpl$updateLessonStats$3.f15656J = d38;
                        lessonRepositoryImpl$updateLessonStats$3.f15657K = d39;
                        lessonRepositoryImpl$updateLessonStats$3.f15658L = d41;
                        lessonRepositoryImpl$updateLessonStats$3.f15662P = 6;
                        c1321i4 = c1321i2;
                        break;
                    } else {
                        d49 = d40;
                        obj2 = null;
                        c1321i4 = c1321i2;
                    }
                    lessonEntity7 = lessonEntity5;
                    str8 = str6;
                    d6 = d36;
                    boolean z110 = z7;
                    c1321i = c1321i4;
                    r12 = obj2;
                    String str118 = str8;
                    lessonRepositoryImpl$updateLessonStats$2 = lessonRepositoryImpl$updateLessonStats$3;
                    int i113 = i7;
                    m7284k(str118, i113, d30, d49, z110, y02.m24804b());
                    str2 = str118;
                    i14 = i113;
                    z2 = z110;
                    lessonEntity = lessonEntity7;
                    d7 = d33;
                    if (lessonEntity == null) {
                        lessonRepositoryImpl$updateLessonStats$2.f15663a = str2;
                        lessonRepositoryImpl$updateLessonStats$2.f15664b = r12;
                        lessonRepositoryImpl$updateLessonStats$2.f15665c = r12;
                        lessonRepositoryImpl$updateLessonStats$2.f15666d = r12;
                        lessonRepositoryImpl$updateLessonStats$2.f15667e = r12;
                        lessonRepositoryImpl$updateLessonStats$2.f15668f = i14;
                        lessonRepositoryImpl$updateLessonStats$2.f15670h = d7;
                        lessonRepositoryImpl$updateLessonStats$2.f15671i = d6;
                        lessonRepositoryImpl$updateLessonStats$2.f15659M = z2;
                        lessonRepositoryImpl$updateLessonStats$2.f15662P = 7;
                        objM7505C1 = c1321i.m7505C0(i14, lessonRepositoryImpl$updateLessonStats$2);
                        if (objM7505C1 != coroutineSingletons) {
                            str9 = str2;
                            z9 = z2;
                            objM7506D1 = objM7505C1;
                            d50 = d6;
                            lessonEntity8 = r12;
                            u85Var5 = (u85) objM7506D1;
                            String value8 = LibraryItemType.Content.getValue();
                            lessonRepositoryImpl$updateLessonStats$2.f15663a = str9;
                            lessonRepositoryImpl$updateLessonStats$2.f15664b = lessonEntity8;
                            lessonRepositoryImpl$updateLessonStats$2.f15665c = u85Var5;
                            lessonRepositoryImpl$updateLessonStats$2.f15668f = i14;
                            lessonRepositoryImpl$updateLessonStats$2.f15670h = d7;
                            lessonRepositoryImpl$updateLessonStats$2.f15671i = d50;
                            lessonRepositoryImpl$updateLessonStats$2.f15659M = z9;
                            lessonRepositoryImpl$updateLessonStats$2.f15662P = 8;
                            objM7506D1 = c1321i.m7506D0(i14, value8, lessonRepositoryImpl$updateLessonStats$2);
                        }
                        break;
                    }
                    return xfa.f68157a;
                }
                u85 u85VarM22536a4 = u85.m22536a(u85Var4, null, d24, d23, 130687);
                double d79 = d24;
                double d710 = d23;
                lessonRepositoryImpl$updateLessonStats$3.f15663a = str5;
                lessonRepositoryImpl$updateLessonStats$3.f15664b = lessonEntity4;
                str7 = str5;
                lessonRepositoryImpl$updateLessonStats$3.f15665c = null;
                lessonRepositoryImpl$updateLessonStats$3.f15666d = null;
                lessonRepositoryImpl$updateLessonStats$3.f15667e = libraryCounterEntity2;
                lessonRepositoryImpl$updateLessonStats$3.f15668f = i3;
                lessonRepositoryImpl$updateLessonStats$3.f15670h = d5;
                lessonRepositoryImpl$updateLessonStats$3.f15671i = d29;
                lessonRepositoryImpl$updateLessonStats$3.f15659M = z6;
                lessonRepositoryImpl$updateLessonStats$3.f15669g = i6;
                lessonRepositoryImpl$updateLessonStats$3.f15672j = dMax2;
                lessonRepositoryImpl$updateLessonStats$3.f15673k = d28;
                i9 = i6;
                lessonRepositoryImpl$updateLessonStats$3.f15674l = d30;
                d42 = d27;
                lessonRepositoryImpl$updateLessonStats$3.f15654H = d42;
                d43 = d25;
                lessonRepositoryImpl$updateLessonStats$3.f15655I = d43;
                double d711 = d26;
                lessonRepositoryImpl$updateLessonStats$3.f15656J = d711;
                d44 = d711;
                lessonRepositoryImpl$updateLessonStats$3.f15657K = d710;
                d45 = d710;
                lessonRepositoryImpl$updateLessonStats$3.f15658L = d79;
                d46 = d79;
                lessonRepositoryImpl$updateLessonStats$3.f15662P = 5;
                c1321i3 = c1321i2;
                objMo4095v0 = c1321i3.mo4095v0(u85VarM22536a4, lessonRepositoryImpl$updateLessonStats$3);
                coroutineSingletons = coroutineSingletons2;
                if (objMo4095v0 != coroutineSingletons) {
                    d47 = d42;
                    LessonEntity lessonEntity13 = lessonEntity4;
                    objM7506D1 = objMo4095v0;
                    libraryCounterEntity4 = libraryCounterEntity2;
                    z8 = z6;
                    i8 = i9;
                    d48 = d43;
                    lessonEntity6 = lessonEntity13;
                    lda.m16122h(((Number) objM7506D1).longValue());
                    c1321i2 = c1321i3;
                    d35 = d48;
                    d34 = d47;
                    String str119 = str7;
                    libraryCounterEntity3 = libraryCounterEntity4;
                    d33 = d5;
                    i7 = i3;
                    d36 = d29;
                    z7 = z8;
                    str6 = str119;
                    lessonEntity5 = lessonEntity6;
                    d38 = d44;
                    d37 = dMax2;
                    d40 = d28;
                    d41 = d46;
                    d39 = d45;
                    if (libraryCounterEntity3 != null) {
                        LibraryCounterEntity libraryCounterEntityM7760a9 = LibraryCounterEntity.m7760a(libraryCounterEntity3, false, new Double(d41), new Double(d39), false, 0, 262095);
                        lessonRepositoryImpl$updateLessonStats$3.f15663a = str6;
                        lessonRepositoryImpl$updateLessonStats$3.f15664b = lessonEntity5;
                        obj2 = null;
                        lessonRepositoryImpl$updateLessonStats$3.f15665c = null;
                        lessonRepositoryImpl$updateLessonStats$3.f15666d = null;
                        lessonRepositoryImpl$updateLessonStats$3.f15667e = null;
                        lessonRepositoryImpl$updateLessonStats$3.f15668f = i7;
                        lessonRepositoryImpl$updateLessonStats$3.f15670h = d33;
                        lessonRepositoryImpl$updateLessonStats$3.f15671i = d36;
                        lessonRepositoryImpl$updateLessonStats$3.f15659M = z7;
                        lessonRepositoryImpl$updateLessonStats$3.f15669g = i8;
                        lessonRepositoryImpl$updateLessonStats$3.f15672j = d37;
                        double d616 = d40;
                        lessonRepositoryImpl$updateLessonStats$3.f15673k = d616;
                        d49 = d616;
                        lessonRepositoryImpl$updateLessonStats$3.f15674l = d30;
                        lessonRepositoryImpl$updateLessonStats$3.f15654H = d34;
                        lessonRepositoryImpl$updateLessonStats$3.f15655I = d35;
                        lessonRepositoryImpl$updateLessonStats$3.f15656J = d38;
                        lessonRepositoryImpl$updateLessonStats$3.f15657K = d39;
                        lessonRepositoryImpl$updateLessonStats$3.f15658L = d41;
                        lessonRepositoryImpl$updateLessonStats$3.f15662P = 6;
                        c1321i4 = c1321i2;
                        break;
                    } else {
                        d49 = d40;
                        obj2 = null;
                        c1321i4 = c1321i2;
                    }
                    lessonEntity7 = lessonEntity5;
                    str8 = str6;
                    d6 = d36;
                    boolean z111 = z7;
                    c1321i = c1321i4;
                    r12 = obj2;
                    String str1110 = str8;
                    lessonRepositoryImpl$updateLessonStats$2 = lessonRepositoryImpl$updateLessonStats$3;
                    int i114 = i7;
                    m7284k(str1110, i114, d30, d49, z111, y02.m24804b());
                    str2 = str1110;
                    i14 = i114;
                    z2 = z111;
                    lessonEntity = lessonEntity7;
                    d7 = d33;
                    if (lessonEntity == null) {
                        lessonRepositoryImpl$updateLessonStats$2.f15663a = str2;
                        lessonRepositoryImpl$updateLessonStats$2.f15664b = r12;
                        lessonRepositoryImpl$updateLessonStats$2.f15665c = r12;
                        lessonRepositoryImpl$updateLessonStats$2.f15666d = r12;
                        lessonRepositoryImpl$updateLessonStats$2.f15667e = r12;
                        lessonRepositoryImpl$updateLessonStats$2.f15668f = i14;
                        lessonRepositoryImpl$updateLessonStats$2.f15670h = d7;
                        lessonRepositoryImpl$updateLessonStats$2.f15671i = d6;
                        lessonRepositoryImpl$updateLessonStats$2.f15659M = z2;
                        lessonRepositoryImpl$updateLessonStats$2.f15662P = 7;
                        objM7505C1 = c1321i.m7505C0(i14, lessonRepositoryImpl$updateLessonStats$2);
                        if (objM7505C1 != coroutineSingletons) {
                            str9 = str2;
                            z9 = z2;
                            objM7506D1 = objM7505C1;
                            d50 = d6;
                            lessonEntity8 = r12;
                            u85Var5 = (u85) objM7506D1;
                            String value9 = LibraryItemType.Content.getValue();
                            lessonRepositoryImpl$updateLessonStats$2.f15663a = str9;
                            lessonRepositoryImpl$updateLessonStats$2.f15664b = lessonEntity8;
                            lessonRepositoryImpl$updateLessonStats$2.f15665c = u85Var5;
                            lessonRepositoryImpl$updateLessonStats$2.f15668f = i14;
                            lessonRepositoryImpl$updateLessonStats$2.f15670h = d7;
                            lessonRepositoryImpl$updateLessonStats$2.f15671i = d50;
                            lessonRepositoryImpl$updateLessonStats$2.f15659M = z9;
                            lessonRepositoryImpl$updateLessonStats$2.f15662P = 8;
                            objM7506D1 = c1321i.m7506D0(i14, value9, lessonRepositoryImpl$updateLessonStats$2);
                        }
                        break;
                    }
                    return xfa.f68157a;
                }
                return coroutineSingletons;
            case 4:
                d3 = 0.0d;
                double d80 = lessonRepositoryImpl$updateLessonStats$4.f15658L;
                double d81 = lessonRepositoryImpl$updateLessonStats$4.f15657K;
                double d82 = lessonRepositoryImpl$updateLessonStats$4.f15656J;
                double d83 = lessonRepositoryImpl$updateLessonStats$4.f15655I;
                double d84 = lessonRepositoryImpl$updateLessonStats$4.f15654H;
                double d85 = lessonRepositoryImpl$updateLessonStats$4.f15674l;
                double d86 = lessonRepositoryImpl$updateLessonStats$4.f15673k;
                double d87 = lessonRepositoryImpl$updateLessonStats$4.f15672j;
                int i21 = lessonRepositoryImpl$updateLessonStats$4.f15669g;
                boolean z21 = lessonRepositoryImpl$updateLessonStats$4.f15659M;
                double d88 = lessonRepositoryImpl$updateLessonStats$4.f15671i;
                double d89 = lessonRepositoryImpl$updateLessonStats$4.f15670h;
                int i22 = lessonRepositoryImpl$updateLessonStats$4.f15668f;
                LibraryCounterEntity libraryCounterEntity6 = lessonRepositoryImpl$updateLessonStats$4.f15667e;
                u85 u85Var7 = (u85) lessonRepositoryImpl$updateLessonStats$4.f15666d;
                LessonEntity lessonEntity14 = lessonRepositoryImpl$updateLessonStats$4.f15664b;
                str5 = lessonRepositoryImpl$updateLessonStats$4.f15663a;
                AbstractC3193b.m15359b(objM7506D1);
                u85Var4 = u85Var7;
                d23 = d81;
                d26 = d82;
                d25 = d83;
                lessonRepositoryImpl$updateLessonStats$3 = lessonRepositoryImpl$updateLessonStats$4;
                d27 = d84;
                z6 = z21;
                d24 = d80;
                d30 = d85;
                i3 = i22;
                lessonEntity4 = lessonEntity14;
                d29 = d88;
                d5 = d89;
                libraryCounterEntity2 = libraryCounterEntity6;
                coroutineSingletons2 = coroutineSingletons6;
                i6 = i21;
                c1321i2 = c1321i6;
                d28 = d86;
                dMax2 = d87;
                if (u85Var4 == null) {
                    coroutineSingletons = coroutineSingletons2;
                    String str1111 = str5;
                    d33 = d5;
                    d34 = d27;
                    d35 = d25;
                    i7 = i3;
                    d36 = d29;
                    z7 = z6;
                    str6 = str1111;
                    i8 = i6;
                    libraryCounterEntity3 = libraryCounterEntity2;
                    lessonEntity5 = lessonEntity4;
                    d37 = dMax2;
                    d38 = d26;
                    d39 = d23;
                    d40 = d28;
                    d41 = d24;
                    if (libraryCounterEntity3 != null) {
                        LibraryCounterEntity libraryCounterEntityM7760a10 = LibraryCounterEntity.m7760a(libraryCounterEntity3, false, new Double(d41), new Double(d39), false, 0, 262095);
                        lessonRepositoryImpl$updateLessonStats$3.f15663a = str6;
                        lessonRepositoryImpl$updateLessonStats$3.f15664b = lessonEntity5;
                        obj2 = null;
                        lessonRepositoryImpl$updateLessonStats$3.f15665c = null;
                        lessonRepositoryImpl$updateLessonStats$3.f15666d = null;
                        lessonRepositoryImpl$updateLessonStats$3.f15667e = null;
                        lessonRepositoryImpl$updateLessonStats$3.f15668f = i7;
                        lessonRepositoryImpl$updateLessonStats$3.f15670h = d33;
                        lessonRepositoryImpl$updateLessonStats$3.f15671i = d36;
                        lessonRepositoryImpl$updateLessonStats$3.f15659M = z7;
                        lessonRepositoryImpl$updateLessonStats$3.f15669g = i8;
                        lessonRepositoryImpl$updateLessonStats$3.f15672j = d37;
                        double d617 = d40;
                        lessonRepositoryImpl$updateLessonStats$3.f15673k = d617;
                        d49 = d617;
                        lessonRepositoryImpl$updateLessonStats$3.f15674l = d30;
                        lessonRepositoryImpl$updateLessonStats$3.f15654H = d34;
                        lessonRepositoryImpl$updateLessonStats$3.f15655I = d35;
                        lessonRepositoryImpl$updateLessonStats$3.f15656J = d38;
                        lessonRepositoryImpl$updateLessonStats$3.f15657K = d39;
                        lessonRepositoryImpl$updateLessonStats$3.f15658L = d41;
                        lessonRepositoryImpl$updateLessonStats$3.f15662P = 6;
                        c1321i4 = c1321i2;
                        break;
                    } else {
                        d49 = d40;
                        obj2 = null;
                        c1321i4 = c1321i2;
                    }
                    lessonEntity7 = lessonEntity5;
                    str8 = str6;
                    d6 = d36;
                    boolean z112 = z7;
                    c1321i = c1321i4;
                    r12 = obj2;
                    String str1112 = str8;
                    lessonRepositoryImpl$updateLessonStats$2 = lessonRepositoryImpl$updateLessonStats$3;
                    int i115 = i7;
                    m7284k(str1112, i115, d30, d49, z112, y02.m24804b());
                    str2 = str1112;
                    i14 = i115;
                    z2 = z112;
                    lessonEntity = lessonEntity7;
                    d7 = d33;
                    if (lessonEntity == null) {
                        lessonRepositoryImpl$updateLessonStats$2.f15663a = str2;
                        lessonRepositoryImpl$updateLessonStats$2.f15664b = r12;
                        lessonRepositoryImpl$updateLessonStats$2.f15665c = r12;
                        lessonRepositoryImpl$updateLessonStats$2.f15666d = r12;
                        lessonRepositoryImpl$updateLessonStats$2.f15667e = r12;
                        lessonRepositoryImpl$updateLessonStats$2.f15668f = i14;
                        lessonRepositoryImpl$updateLessonStats$2.f15670h = d7;
                        lessonRepositoryImpl$updateLessonStats$2.f15671i = d6;
                        lessonRepositoryImpl$updateLessonStats$2.f15659M = z2;
                        lessonRepositoryImpl$updateLessonStats$2.f15662P = 7;
                        objM7505C1 = c1321i.m7505C0(i14, lessonRepositoryImpl$updateLessonStats$2);
                        if (objM7505C1 != coroutineSingletons) {
                            str9 = str2;
                            z9 = z2;
                            objM7506D1 = objM7505C1;
                            d50 = d6;
                            lessonEntity8 = r12;
                            u85Var5 = (u85) objM7506D1;
                            String value10 = LibraryItemType.Content.getValue();
                            lessonRepositoryImpl$updateLessonStats$2.f15663a = str9;
                            lessonRepositoryImpl$updateLessonStats$2.f15664b = lessonEntity8;
                            lessonRepositoryImpl$updateLessonStats$2.f15665c = u85Var5;
                            lessonRepositoryImpl$updateLessonStats$2.f15668f = i14;
                            lessonRepositoryImpl$updateLessonStats$2.f15670h = d7;
                            lessonRepositoryImpl$updateLessonStats$2.f15671i = d50;
                            lessonRepositoryImpl$updateLessonStats$2.f15659M = z9;
                            lessonRepositoryImpl$updateLessonStats$2.f15662P = 8;
                            objM7506D1 = c1321i.m7506D0(i14, value10, lessonRepositoryImpl$updateLessonStats$2);
                        }
                        break;
                    }
                    return xfa.f68157a;
                }
                u85 u85VarM22536a5 = u85.m22536a(u85Var4, null, d24, d23, 130687);
                double d712 = d24;
                double d713 = d23;
                lessonRepositoryImpl$updateLessonStats$3.f15663a = str5;
                lessonRepositoryImpl$updateLessonStats$3.f15664b = lessonEntity4;
                str7 = str5;
                lessonRepositoryImpl$updateLessonStats$3.f15665c = null;
                lessonRepositoryImpl$updateLessonStats$3.f15666d = null;
                lessonRepositoryImpl$updateLessonStats$3.f15667e = libraryCounterEntity2;
                lessonRepositoryImpl$updateLessonStats$3.f15668f = i3;
                lessonRepositoryImpl$updateLessonStats$3.f15670h = d5;
                lessonRepositoryImpl$updateLessonStats$3.f15671i = d29;
                lessonRepositoryImpl$updateLessonStats$3.f15659M = z6;
                lessonRepositoryImpl$updateLessonStats$3.f15669g = i6;
                lessonRepositoryImpl$updateLessonStats$3.f15672j = dMax2;
                lessonRepositoryImpl$updateLessonStats$3.f15673k = d28;
                i9 = i6;
                lessonRepositoryImpl$updateLessonStats$3.f15674l = d30;
                d42 = d27;
                lessonRepositoryImpl$updateLessonStats$3.f15654H = d42;
                d43 = d25;
                lessonRepositoryImpl$updateLessonStats$3.f15655I = d43;
                double d714 = d26;
                lessonRepositoryImpl$updateLessonStats$3.f15656J = d714;
                d44 = d714;
                lessonRepositoryImpl$updateLessonStats$3.f15657K = d713;
                d45 = d713;
                lessonRepositoryImpl$updateLessonStats$3.f15658L = d712;
                d46 = d712;
                lessonRepositoryImpl$updateLessonStats$3.f15662P = 5;
                c1321i3 = c1321i2;
                objMo4095v0 = c1321i3.mo4095v0(u85VarM22536a5, lessonRepositoryImpl$updateLessonStats$3);
                coroutineSingletons = coroutineSingletons2;
                if (objMo4095v0 != coroutineSingletons) {
                    d47 = d42;
                    LessonEntity lessonEntity15 = lessonEntity4;
                    objM7506D1 = objMo4095v0;
                    libraryCounterEntity4 = libraryCounterEntity2;
                    z8 = z6;
                    i8 = i9;
                    d48 = d43;
                    lessonEntity6 = lessonEntity15;
                    lda.m16122h(((Number) objM7506D1).longValue());
                    c1321i2 = c1321i3;
                    d35 = d48;
                    d34 = d47;
                    String str1113 = str7;
                    libraryCounterEntity3 = libraryCounterEntity4;
                    d33 = d5;
                    i7 = i3;
                    d36 = d29;
                    z7 = z8;
                    str6 = str1113;
                    lessonEntity5 = lessonEntity6;
                    d38 = d44;
                    d37 = dMax2;
                    d40 = d28;
                    d41 = d46;
                    d39 = d45;
                    if (libraryCounterEntity3 != null) {
                        LibraryCounterEntity libraryCounterEntityM7760a11 = LibraryCounterEntity.m7760a(libraryCounterEntity3, false, new Double(d41), new Double(d39), false, 0, 262095);
                        lessonRepositoryImpl$updateLessonStats$3.f15663a = str6;
                        lessonRepositoryImpl$updateLessonStats$3.f15664b = lessonEntity5;
                        obj2 = null;
                        lessonRepositoryImpl$updateLessonStats$3.f15665c = null;
                        lessonRepositoryImpl$updateLessonStats$3.f15666d = null;
                        lessonRepositoryImpl$updateLessonStats$3.f15667e = null;
                        lessonRepositoryImpl$updateLessonStats$3.f15668f = i7;
                        lessonRepositoryImpl$updateLessonStats$3.f15670h = d33;
                        lessonRepositoryImpl$updateLessonStats$3.f15671i = d36;
                        lessonRepositoryImpl$updateLessonStats$3.f15659M = z7;
                        lessonRepositoryImpl$updateLessonStats$3.f15669g = i8;
                        lessonRepositoryImpl$updateLessonStats$3.f15672j = d37;
                        double d618 = d40;
                        lessonRepositoryImpl$updateLessonStats$3.f15673k = d618;
                        d49 = d618;
                        lessonRepositoryImpl$updateLessonStats$3.f15674l = d30;
                        lessonRepositoryImpl$updateLessonStats$3.f15654H = d34;
                        lessonRepositoryImpl$updateLessonStats$3.f15655I = d35;
                        lessonRepositoryImpl$updateLessonStats$3.f15656J = d38;
                        lessonRepositoryImpl$updateLessonStats$3.f15657K = d39;
                        lessonRepositoryImpl$updateLessonStats$3.f15658L = d41;
                        lessonRepositoryImpl$updateLessonStats$3.f15662P = 6;
                        c1321i4 = c1321i2;
                        break;
                    } else {
                        d49 = d40;
                        obj2 = null;
                        c1321i4 = c1321i2;
                    }
                    lessonEntity7 = lessonEntity5;
                    str8 = str6;
                    d6 = d36;
                    boolean z113 = z7;
                    c1321i = c1321i4;
                    r12 = obj2;
                    String str1114 = str8;
                    lessonRepositoryImpl$updateLessonStats$2 = lessonRepositoryImpl$updateLessonStats$3;
                    int i116 = i7;
                    m7284k(str1114, i116, d30, d49, z113, y02.m24804b());
                    str2 = str1114;
                    i14 = i116;
                    z2 = z113;
                    lessonEntity = lessonEntity7;
                    d7 = d33;
                    if (lessonEntity == null) {
                        lessonRepositoryImpl$updateLessonStats$2.f15663a = str2;
                        lessonRepositoryImpl$updateLessonStats$2.f15664b = r12;
                        lessonRepositoryImpl$updateLessonStats$2.f15665c = r12;
                        lessonRepositoryImpl$updateLessonStats$2.f15666d = r12;
                        lessonRepositoryImpl$updateLessonStats$2.f15667e = r12;
                        lessonRepositoryImpl$updateLessonStats$2.f15668f = i14;
                        lessonRepositoryImpl$updateLessonStats$2.f15670h = d7;
                        lessonRepositoryImpl$updateLessonStats$2.f15671i = d6;
                        lessonRepositoryImpl$updateLessonStats$2.f15659M = z2;
                        lessonRepositoryImpl$updateLessonStats$2.f15662P = 7;
                        objM7505C1 = c1321i.m7505C0(i14, lessonRepositoryImpl$updateLessonStats$2);
                        if (objM7505C1 != coroutineSingletons) {
                            str9 = str2;
                            z9 = z2;
                            objM7506D1 = objM7505C1;
                            d50 = d6;
                            lessonEntity8 = r12;
                            u85Var5 = (u85) objM7506D1;
                            String value11 = LibraryItemType.Content.getValue();
                            lessonRepositoryImpl$updateLessonStats$2.f15663a = str9;
                            lessonRepositoryImpl$updateLessonStats$2.f15664b = lessonEntity8;
                            lessonRepositoryImpl$updateLessonStats$2.f15665c = u85Var5;
                            lessonRepositoryImpl$updateLessonStats$2.f15668f = i14;
                            lessonRepositoryImpl$updateLessonStats$2.f15670h = d7;
                            lessonRepositoryImpl$updateLessonStats$2.f15671i = d50;
                            lessonRepositoryImpl$updateLessonStats$2.f15659M = z9;
                            lessonRepositoryImpl$updateLessonStats$2.f15662P = 8;
                            objM7506D1 = c1321i.m7506D0(i14, value11, lessonRepositoryImpl$updateLessonStats$2);
                        }
                        break;
                    }
                    return xfa.f68157a;
                }
                return coroutineSingletons;
            case 5:
                d3 = 0.0d;
                double d90 = lessonRepositoryImpl$updateLessonStats$4.f15658L;
                double d91 = lessonRepositoryImpl$updateLessonStats$4.f15657K;
                double d92 = lessonRepositoryImpl$updateLessonStats$4.f15656J;
                double d93 = lessonRepositoryImpl$updateLessonStats$4.f15655I;
                double d94 = lessonRepositoryImpl$updateLessonStats$4.f15654H;
                double d95 = lessonRepositoryImpl$updateLessonStats$4.f15674l;
                double d96 = lessonRepositoryImpl$updateLessonStats$4.f15673k;
                double d97 = lessonRepositoryImpl$updateLessonStats$4.f15672j;
                int i23 = lessonRepositoryImpl$updateLessonStats$4.f15669g;
                z8 = lessonRepositoryImpl$updateLessonStats$4.f15659M;
                double d98 = lessonRepositoryImpl$updateLessonStats$4.f15671i;
                double d99 = lessonRepositoryImpl$updateLessonStats$4.f15670h;
                int i24 = lessonRepositoryImpl$updateLessonStats$4.f15668f;
                libraryCounterEntity4 = lessonRepositoryImpl$updateLessonStats$4.f15667e;
                lessonEntity6 = lessonRepositoryImpl$updateLessonStats$4.f15664b;
                String str21 = lessonRepositoryImpl$updateLessonStats$4.f15663a;
                AbstractC3193b.m15359b(objM7506D1);
                d45 = d91;
                d44 = d92;
                lessonRepositoryImpl$updateLessonStats$3 = lessonRepositoryImpl$updateLessonStats$4;
                d47 = d94;
                d46 = d90;
                d29 = d98;
                d30 = d95;
                i3 = i24;
                str7 = str21;
                coroutineSingletons = coroutineSingletons6;
                i8 = i23;
                c1321i3 = c1321i6;
                d28 = d96;
                dMax2 = d97;
                d48 = d93;
                d5 = d99;
                lda.m16122h(((Number) objM7506D1).longValue());
                c1321i2 = c1321i3;
                d35 = d48;
                d34 = d47;
                String str1115 = str7;
                libraryCounterEntity3 = libraryCounterEntity4;
                d33 = d5;
                i7 = i3;
                d36 = d29;
                z7 = z8;
                str6 = str1115;
                lessonEntity5 = lessonEntity6;
                d38 = d44;
                d37 = dMax2;
                d40 = d28;
                d41 = d46;
                d39 = d45;
                if (libraryCounterEntity3 != null) {
                    LibraryCounterEntity libraryCounterEntityM7760a12 = LibraryCounterEntity.m7760a(libraryCounterEntity3, false, new Double(d41), new Double(d39), false, 0, 262095);
                    lessonRepositoryImpl$updateLessonStats$3.f15663a = str6;
                    lessonRepositoryImpl$updateLessonStats$3.f15664b = lessonEntity5;
                    obj2 = null;
                    lessonRepositoryImpl$updateLessonStats$3.f15665c = null;
                    lessonRepositoryImpl$updateLessonStats$3.f15666d = null;
                    lessonRepositoryImpl$updateLessonStats$3.f15667e = null;
                    lessonRepositoryImpl$updateLessonStats$3.f15668f = i7;
                    lessonRepositoryImpl$updateLessonStats$3.f15670h = d33;
                    lessonRepositoryImpl$updateLessonStats$3.f15671i = d36;
                    lessonRepositoryImpl$updateLessonStats$3.f15659M = z7;
                    lessonRepositoryImpl$updateLessonStats$3.f15669g = i8;
                    lessonRepositoryImpl$updateLessonStats$3.f15672j = d37;
                    double d619 = d40;
                    lessonRepositoryImpl$updateLessonStats$3.f15673k = d619;
                    d49 = d619;
                    lessonRepositoryImpl$updateLessonStats$3.f15674l = d30;
                    lessonRepositoryImpl$updateLessonStats$3.f15654H = d34;
                    lessonRepositoryImpl$updateLessonStats$3.f15655I = d35;
                    lessonRepositoryImpl$updateLessonStats$3.f15656J = d38;
                    lessonRepositoryImpl$updateLessonStats$3.f15657K = d39;
                    lessonRepositoryImpl$updateLessonStats$3.f15658L = d41;
                    lessonRepositoryImpl$updateLessonStats$3.f15662P = 6;
                    c1321i4 = c1321i2;
                    break;
                } else {
                    d49 = d40;
                    obj2 = null;
                    c1321i4 = c1321i2;
                }
                lessonEntity7 = lessonEntity5;
                str8 = str6;
                d6 = d36;
                boolean z114 = z7;
                c1321i = c1321i4;
                r12 = obj2;
                String str1116 = str8;
                lessonRepositoryImpl$updateLessonStats$2 = lessonRepositoryImpl$updateLessonStats$3;
                int i117 = i7;
                m7284k(str1116, i117, d30, d49, z114, y02.m24804b());
                str2 = str1116;
                i14 = i117;
                z2 = z114;
                lessonEntity = lessonEntity7;
                d7 = d33;
                if (lessonEntity == null) {
                    lessonRepositoryImpl$updateLessonStats$2.f15663a = str2;
                    lessonRepositoryImpl$updateLessonStats$2.f15664b = r12;
                    lessonRepositoryImpl$updateLessonStats$2.f15665c = r12;
                    lessonRepositoryImpl$updateLessonStats$2.f15666d = r12;
                    lessonRepositoryImpl$updateLessonStats$2.f15667e = r12;
                    lessonRepositoryImpl$updateLessonStats$2.f15668f = i14;
                    lessonRepositoryImpl$updateLessonStats$2.f15670h = d7;
                    lessonRepositoryImpl$updateLessonStats$2.f15671i = d6;
                    lessonRepositoryImpl$updateLessonStats$2.f15659M = z2;
                    lessonRepositoryImpl$updateLessonStats$2.f15662P = 7;
                    objM7505C1 = c1321i.m7505C0(i14, lessonRepositoryImpl$updateLessonStats$2);
                    if (objM7505C1 != coroutineSingletons) {
                        str9 = str2;
                        z9 = z2;
                        objM7506D1 = objM7505C1;
                        d50 = d6;
                        lessonEntity8 = r12;
                        u85Var5 = (u85) objM7506D1;
                        String value12 = LibraryItemType.Content.getValue();
                        lessonRepositoryImpl$updateLessonStats$2.f15663a = str9;
                        lessonRepositoryImpl$updateLessonStats$2.f15664b = lessonEntity8;
                        lessonRepositoryImpl$updateLessonStats$2.f15665c = u85Var5;
                        lessonRepositoryImpl$updateLessonStats$2.f15668f = i14;
                        lessonRepositoryImpl$updateLessonStats$2.f15670h = d7;
                        lessonRepositoryImpl$updateLessonStats$2.f15671i = d50;
                        lessonRepositoryImpl$updateLessonStats$2.f15659M = z9;
                        lessonRepositoryImpl$updateLessonStats$2.f15662P = 8;
                        objM7506D1 = c1321i.m7506D0(i14, value12, lessonRepositoryImpl$updateLessonStats$2);
                        break;
                    }
                    return coroutineSingletons;
                }
                return xfa.f68157a;
            case 6:
                double d100 = lessonRepositoryImpl$updateLessonStats$4.f15674l;
                double d101 = lessonRepositoryImpl$updateLessonStats$4.f15673k;
                z7 = lessonRepositoryImpl$updateLessonStats$4.f15659M;
                d36 = lessonRepositoryImpl$updateLessonStats$4.f15671i;
                d3 = 0.0d;
                double d102 = lessonRepositoryImpl$updateLessonStats$4.f15670h;
                i7 = lessonRepositoryImpl$updateLessonStats$4.f15668f;
                lessonEntity7 = lessonRepositoryImpl$updateLessonStats$4.f15664b;
                str8 = lessonRepositoryImpl$updateLessonStats$4.f15663a;
                AbstractC3193b.m15359b(objM7506D1);
                d30 = d100;
                d49 = d101;
                lessonRepositoryImpl$updateLessonStats$3 = lessonRepositoryImpl$updateLessonStats$4;
                c1321i4 = c1321i6;
                d33 = d102;
                obj2 = null;
                coroutineSingletons = coroutineSingletons6;
                d6 = d36;
                boolean z115 = z7;
                c1321i = c1321i4;
                r12 = obj2;
                String str1117 = str8;
                lessonRepositoryImpl$updateLessonStats$2 = lessonRepositoryImpl$updateLessonStats$3;
                int i118 = i7;
                m7284k(str1117, i118, d30, d49, z115, y02.m24804b());
                str2 = str1117;
                i14 = i118;
                z2 = z115;
                lessonEntity = lessonEntity7;
                d7 = d33;
                if (lessonEntity == null) {
                    lessonRepositoryImpl$updateLessonStats$2.f15663a = str2;
                    lessonRepositoryImpl$updateLessonStats$2.f15664b = r12;
                    lessonRepositoryImpl$updateLessonStats$2.f15665c = r12;
                    lessonRepositoryImpl$updateLessonStats$2.f15666d = r12;
                    lessonRepositoryImpl$updateLessonStats$2.f15667e = r12;
                    lessonRepositoryImpl$updateLessonStats$2.f15668f = i14;
                    lessonRepositoryImpl$updateLessonStats$2.f15670h = d7;
                    lessonRepositoryImpl$updateLessonStats$2.f15671i = d6;
                    lessonRepositoryImpl$updateLessonStats$2.f15659M = z2;
                    lessonRepositoryImpl$updateLessonStats$2.f15662P = 7;
                    objM7505C1 = c1321i.m7505C0(i14, lessonRepositoryImpl$updateLessonStats$2);
                    if (objM7505C1 != coroutineSingletons) {
                        str9 = str2;
                        z9 = z2;
                        objM7506D1 = objM7505C1;
                        d50 = d6;
                        lessonEntity8 = r12;
                        u85Var5 = (u85) objM7506D1;
                        String value13 = LibraryItemType.Content.getValue();
                        lessonRepositoryImpl$updateLessonStats$2.f15663a = str9;
                        lessonRepositoryImpl$updateLessonStats$2.f15664b = lessonEntity8;
                        lessonRepositoryImpl$updateLessonStats$2.f15665c = u85Var5;
                        lessonRepositoryImpl$updateLessonStats$2.f15668f = i14;
                        lessonRepositoryImpl$updateLessonStats$2.f15670h = d7;
                        lessonRepositoryImpl$updateLessonStats$2.f15671i = d50;
                        lessonRepositoryImpl$updateLessonStats$2.f15659M = z9;
                        lessonRepositoryImpl$updateLessonStats$2.f15662P = 8;
                        objM7506D1 = c1321i.m7506D0(i14, value13, lessonRepositoryImpl$updateLessonStats$2);
                        break;
                    }
                    return coroutineSingletons;
                }
                return xfa.f68157a;
            case 7:
                z9 = lessonRepositoryImpl$updateLessonStats$4.f15659M;
                d50 = lessonRepositoryImpl$updateLessonStats$4.f15671i;
                d7 = lessonRepositoryImpl$updateLessonStats$4.f15670h;
                i14 = lessonRepositoryImpl$updateLessonStats$4.f15668f;
                String str22 = lessonRepositoryImpl$updateLessonStats$4.f15663a;
                AbstractC3193b.m15359b(objM7506D1);
                str9 = str22;
                lessonRepositoryImpl$updateLessonStats$2 = lessonRepositoryImpl$updateLessonStats$4;
                coroutineSingletons = coroutineSingletons6;
                c1321i = c1321i6;
                lessonEntity8 = 0;
                d3 = 0.0d;
                u85Var5 = (u85) objM7506D1;
                String value14 = LibraryItemType.Content.getValue();
                lessonRepositoryImpl$updateLessonStats$2.f15663a = str9;
                lessonRepositoryImpl$updateLessonStats$2.f15664b = lessonEntity8;
                lessonRepositoryImpl$updateLessonStats$2.f15665c = u85Var5;
                lessonRepositoryImpl$updateLessonStats$2.f15668f = i14;
                lessonRepositoryImpl$updateLessonStats$2.f15670h = d7;
                lessonRepositoryImpl$updateLessonStats$2.f15671i = d50;
                lessonRepositoryImpl$updateLessonStats$2.f15659M = z9;
                lessonRepositoryImpl$updateLessonStats$2.f15662P = 8;
                objM7506D1 = c1321i.m7506D0(i14, value14, lessonRepositoryImpl$updateLessonStats$2);
                break;
            case 8:
                z9 = lessonRepositoryImpl$updateLessonStats$4.f15659M;
                d50 = lessonRepositoryImpl$updateLessonStats$4.f15671i;
                d7 = lessonRepositoryImpl$updateLessonStats$4.f15670h;
                i14 = lessonRepositoryImpl$updateLessonStats$4.f15668f;
                u85Var5 = lessonRepositoryImpl$updateLessonStats$4.f15665c;
                str9 = lessonRepositoryImpl$updateLessonStats$4.f15663a;
                AbstractC3193b.m15359b(objM7506D1);
                lessonRepositoryImpl$updateLessonStats$2 = lessonRepositoryImpl$updateLessonStats$4;
                coroutineSingletons = coroutineSingletons6;
                c1321i = c1321i6;
                d3 = 0.0d;
                Object obj3 = objM7506D1;
                boolean z22 = z9;
                double d103 = d50;
                int i25 = i14;
                LibraryCounterEntity libraryCounterEntity7 = (LibraryCounterEntity) obj3;
                if (u85Var5 != null) {
                    double dMax3 = Math.max(u85Var5.f63553O, (libraryCounterEntity7 == null || (d65 = libraryCounterEntity7.f17362f) == null) ? d3 : d65.doubleValue());
                    u85 u85Var8 = u85Var5;
                    double dMax4 = Math.max(u85Var5.f63552N, (libraryCounterEntity7 == null || (d64 = libraryCounterEntity7.f17361e) == null) ? d3 : d64.doubleValue());
                    coroutineSingletons3 = coroutineSingletons;
                    double dM17572a3 = nob.m17572a(9, dMax3 + d103);
                    double dM17572a4 = nob.m17572a(9, dMax4 + d7);
                    if (dM17572a3 < d3) {
                        double d104 = -nob.m17572a(9, dMax3);
                        if (Double.isNaN(d104) || Double.isInfinite(d104)) {
                            d52 = d3;
                            d51 = d52;
                        } else {
                            d52 = d104;
                            d51 = d3;
                        }
                    } else {
                        d51 = dM17572a3;
                        d52 = d103;
                    }
                    double d105 = d51;
                    if (dM17572a4 < d3) {
                        d54 = -nob.m17572a(9, dMax4);
                        if (Double.isNaN(d54) || Double.isInfinite(d54)) {
                            d54 = d3;
                            d53 = d54;
                        } else {
                            d53 = d3;
                        }
                    } else {
                        d53 = dM17572a4;
                        d54 = d7;
                    }
                    double d106 = (Double.isNaN(d105) || Double.isInfinite(d105)) ? d3 : d105;
                    if (!Double.isNaN(d53) && !Double.isInfinite(d53)) {
                        d3 = d53;
                    }
                    double d107 = d3;
                    double d108 = d106;
                    u85 u85VarM22536a6 = u85.m22536a(u85Var8, null, d107, d108, 130687);
                    lessonRepositoryImpl$updateLessonStats$2.f15663a = str9;
                    String str23 = str9;
                    lessonRepositoryImpl$updateLessonStats$2.f15664b = null;
                    lessonRepositoryImpl$updateLessonStats$2.f15665c = null;
                    lessonRepositoryImpl$updateLessonStats$2.f15666d = libraryCounterEntity7;
                    lessonRepositoryImpl$updateLessonStats$2.f15667e = null;
                    lessonRepositoryImpl$updateLessonStats$2.f15668f = i25;
                    lessonRepositoryImpl$updateLessonStats$2.f15670h = d7;
                    lessonRepositoryImpl$updateLessonStats$2.f15671i = d103;
                    lessonRepositoryImpl$updateLessonStats$2.f15659M = z22;
                    lessonRepositoryImpl$updateLessonStats$2.f15669g = 0;
                    lessonRepositoryImpl$updateLessonStats$2.f15672j = d52;
                    lessonRepositoryImpl$updateLessonStats$2.f15673k = d54;
                    lessonRepositoryImpl$updateLessonStats$2.f15674l = dMax4;
                    double d109 = d52;
                    lessonRepositoryImpl$updateLessonStats$2.f15654H = d105;
                    lessonRepositoryImpl$updateLessonStats$2.f15655I = dMax3;
                    double d110 = d53;
                    lessonRepositoryImpl$updateLessonStats$2.f15656J = d110;
                    lessonRepositoryImpl$updateLessonStats$2.f15657K = d108;
                    lessonRepositoryImpl$updateLessonStats$2.f15658L = d107;
                    lessonRepositoryImpl$updateLessonStats$2.f15662P = 9;
                    C1321i c1321i7 = c1321i;
                    if (c1321i7.mo4095v0(u85VarM22536a6, lessonRepositoryImpl$updateLessonStats$2) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                    d55 = d105;
                    c1321i5 = c1321i7;
                    d56 = d54;
                    str10 = str23;
                    d57 = dMax3;
                    d58 = d110;
                    d59 = d109;
                    d60 = d107;
                    z10 = z22;
                    i10 = i25;
                    d61 = dMax4;
                    i11 = 0;
                    d62 = d103;
                    d63 = d108;
                    libraryCounterEntity5 = libraryCounterEntity7;
                    if (libraryCounterEntity5 != null) {
                        coroutineSingletons4 = coroutineSingletons3;
                        libraryCounterEntityM7760a = LibraryCounterEntity.m7760a(libraryCounterEntity5, false, new Double(d60), new Double(d63), false, 0, 262095);
                        lessonRepositoryImpl$updateLessonStats$2.f15663a = str10;
                        str12 = str10;
                        lessonRepositoryImpl$updateLessonStats$2.f15664b = null;
                        lessonRepositoryImpl$updateLessonStats$2.f15665c = null;
                        lessonRepositoryImpl$updateLessonStats$2.f15666d = null;
                        lessonRepositoryImpl$updateLessonStats$2.f15667e = null;
                        lessonRepositoryImpl$updateLessonStats$2.f15668f = i10;
                        lessonRepositoryImpl$updateLessonStats$2.f15670h = d7;
                        lessonRepositoryImpl$updateLessonStats$2.f15671i = d62;
                        lessonRepositoryImpl$updateLessonStats$2.f15659M = z10;
                        lessonRepositoryImpl$updateLessonStats$2.f15669g = i11;
                        lessonRepositoryImpl$updateLessonStats$2.f15672j = d59;
                        d68 = d56;
                        lessonRepositoryImpl$updateLessonStats$2.f15673k = d68;
                        lessonRepositoryImpl$updateLessonStats$2.f15674l = d61;
                        lessonRepositoryImpl$updateLessonStats$2.f15654H = d55;
                        lessonRepositoryImpl$updateLessonStats$2.f15655I = d57;
                        lessonRepositoryImpl$updateLessonStats$2.f15656J = d58;
                        lessonRepositoryImpl$updateLessonStats$2.f15657K = d63;
                        lessonRepositoryImpl$updateLessonStats$2.f15658L = d60;
                        lessonRepositoryImpl$updateLessonStats$2.f15662P = 10;
                        coroutineSingletons5 = coroutineSingletons4;
                        if (c1321i5.m7510I0(libraryCounterEntityM7760a, lessonRepositoryImpl$updateLessonStats$2) == coroutineSingletons5) {
                            return coroutineSingletons5;
                        }
                        d66 = d68;
                        d67 = d59;
                        i13 = i10;
                        z12 = z10;
                        str13 = str12;
                        i12 = i13;
                        z11 = z12;
                        str11 = str13;
                    } else {
                        coroutineSingletons4 = coroutineSingletons3;
                        d66 = d56;
                        d67 = d59;
                        i12 = i10;
                        z11 = z10;
                        str11 = str10;
                    }
                    m7284k(str11, i12, d66, d67, z11, y02.m24804b());
                }
                return xfa.f68157a;
            case 9:
                double d111 = lessonRepositoryImpl$updateLessonStats$4.f15658L;
                double d112 = lessonRepositoryImpl$updateLessonStats$4.f15657K;
                double d113 = lessonRepositoryImpl$updateLessonStats$4.f15656J;
                double d114 = lessonRepositoryImpl$updateLessonStats$4.f15655I;
                double d115 = lessonRepositoryImpl$updateLessonStats$4.f15654H;
                double d116 = lessonRepositoryImpl$updateLessonStats$4.f15674l;
                double d117 = lessonRepositoryImpl$updateLessonStats$4.f15673k;
                double d118 = lessonRepositoryImpl$updateLessonStats$4.f15672j;
                int i26 = lessonRepositoryImpl$updateLessonStats$4.f15669g;
                z10 = lessonRepositoryImpl$updateLessonStats$4.f15659M;
                double d119 = lessonRepositoryImpl$updateLessonStats$4.f15671i;
                double d120 = lessonRepositoryImpl$updateLessonStats$4.f15670h;
                int i27 = lessonRepositoryImpl$updateLessonStats$4.f15668f;
                LibraryCounterEntity libraryCounterEntity8 = (LibraryCounterEntity) lessonRepositoryImpl$updateLessonStats$4.f15666d;
                str10 = lessonRepositoryImpl$updateLessonStats$4.f15663a;
                AbstractC3193b.m15359b(objM7506D1);
                d57 = d114;
                d55 = d115;
                d58 = d113;
                d7 = d120;
                i10 = i27;
                d60 = d111;
                coroutineSingletons4 = coroutineSingletons6;
                i11 = i26;
                c1321i5 = c1321i6;
                d63 = d112;
                libraryCounterEntity5 = libraryCounterEntity8;
                lessonRepositoryImpl$updateLessonStats$2 = lessonRepositoryImpl$updateLessonStats$4;
                d59 = d118;
                d62 = d119;
                d61 = d116;
                d56 = d117;
                if (libraryCounterEntity5 != null) {
                    coroutineSingletons4 = coroutineSingletons3;
                    libraryCounterEntityM7760a = LibraryCounterEntity.m7760a(libraryCounterEntity5, false, new Double(d60), new Double(d63), false, 0, 262095);
                    lessonRepositoryImpl$updateLessonStats$2.f15663a = str10;
                    str12 = str10;
                    lessonRepositoryImpl$updateLessonStats$2.f15664b = null;
                    lessonRepositoryImpl$updateLessonStats$2.f15665c = null;
                    lessonRepositoryImpl$updateLessonStats$2.f15666d = null;
                    lessonRepositoryImpl$updateLessonStats$2.f15667e = null;
                    lessonRepositoryImpl$updateLessonStats$2.f15668f = i10;
                    lessonRepositoryImpl$updateLessonStats$2.f15670h = d7;
                    lessonRepositoryImpl$updateLessonStats$2.f15671i = d62;
                    lessonRepositoryImpl$updateLessonStats$2.f15659M = z10;
                    lessonRepositoryImpl$updateLessonStats$2.f15669g = i11;
                    lessonRepositoryImpl$updateLessonStats$2.f15672j = d59;
                    d68 = d56;
                    lessonRepositoryImpl$updateLessonStats$2.f15673k = d68;
                    lessonRepositoryImpl$updateLessonStats$2.f15674l = d61;
                    lessonRepositoryImpl$updateLessonStats$2.f15654H = d55;
                    lessonRepositoryImpl$updateLessonStats$2.f15655I = d57;
                    lessonRepositoryImpl$updateLessonStats$2.f15656J = d58;
                    lessonRepositoryImpl$updateLessonStats$2.f15657K = d63;
                    lessonRepositoryImpl$updateLessonStats$2.f15658L = d60;
                    lessonRepositoryImpl$updateLessonStats$2.f15662P = 10;
                    coroutineSingletons5 = coroutineSingletons4;
                    if (c1321i5.m7510I0(libraryCounterEntityM7760a, lessonRepositoryImpl$updateLessonStats$2) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                    d66 = d68;
                    d67 = d59;
                    i13 = i10;
                    z12 = z10;
                    str13 = str12;
                    i12 = i13;
                    z11 = z12;
                    str11 = str13;
                } else {
                    coroutineSingletons4 = coroutineSingletons3;
                    d66 = d56;
                    d67 = d59;
                    i12 = i10;
                    z11 = z10;
                    str11 = str10;
                }
                m7284k(str11, i12, d66, d67, z11, y02.m24804b());
                return xfa.f68157a;
            case 10:
                d66 = lessonRepositoryImpl$updateLessonStats$4.f15673k;
                d67 = lessonRepositoryImpl$updateLessonStats$4.f15672j;
                z12 = lessonRepositoryImpl$updateLessonStats$4.f15659M;
                i13 = lessonRepositoryImpl$updateLessonStats$4.f15668f;
                str13 = lessonRepositoryImpl$updateLessonStats$4.f15663a;
                AbstractC3193b.m15359b(objM7506D1);
                i12 = i13;
                z11 = z12;
                str11 = str13;
                m7284k(str11, i12, d66, d67, z11, y02.m24804b());
                return xfa.f68157a;
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0090 A[Catch: Exception -> 0x00ab, HttpException -> 0x00bc, TryCatch #2 {HttpException -> 0x00bc, Exception -> 0x00ab, blocks: (B:13:0x002c, B:38:0x00a3, B:18:0x003d, B:33:0x0088, B:35:0x0090, B:21:0x0045, B:27:0x0060, B:29:0x0065, B:24:0x004c), top: B:45:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
    
        if (r3.mo4095v0(r11, r0) == r1) goto L37;
     */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7294p(String str, int i, boolean z, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$fetchLessonInfo$1 lessonRepositoryImpl$fetchLessonInfo$1;
        int i2;
        ResultLessonInfo resultLessonInfo;
        boolean z2;
        if (continuationImpl instanceof LessonRepositoryImpl$fetchLessonInfo$1) {
            lessonRepositoryImpl$fetchLessonInfo$1 = (LessonRepositoryImpl$fetchLessonInfo$1) continuationImpl;
            int i3 = lessonRepositoryImpl$fetchLessonInfo$1.f15347f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$fetchLessonInfo$1.f15347f = i3 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$fetchLessonInfo$1 = new LessonRepositoryImpl$fetchLessonInfo$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$fetchLessonInfo$1 = new LessonRepositoryImpl$fetchLessonInfo$1(this, continuationImpl);
        }
        Object objM14899c = lessonRepositoryImpl$fetchLessonInfo$1.f15345d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = lessonRepositoryImpl$fetchLessonInfo$1.f15347f;
        AbstractC1320h abstractC1320h = this.f16498b;
        try {
            if (i4 == 0) {
                AbstractC3193b.m15359b(objM14899c);
                k65 k65Var = this.f16502f;
                Integer num = new Integer(i);
                lessonRepositoryImpl$fetchLessonInfo$1.f15343b = i;
                lessonRepositoryImpl$fetchLessonInfo$1.f15344c = z;
                lessonRepositoryImpl$fetchLessonInfo$1.f15347f = 1;
                objM14899c = k65Var.m14899c(str, num, true, lessonRepositoryImpl$fetchLessonInfo$1);
                if (objM14899c == coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i4 == 1) {
                z = lessonRepositoryImpl$fetchLessonInfo$1.f15344c;
                i = lessonRepositoryImpl$fetchLessonInfo$1.f15343b;
                AbstractC3193b.m15359b(objM14899c);
            } else if (i4 == 2) {
                z2 = lessonRepositoryImpl$fetchLessonInfo$1.f15344c;
                i2 = lessonRepositoryImpl$fetchLessonInfo$1.f15343b;
                resultLessonInfo = lessonRepositoryImpl$fetchLessonInfo$1.f15342a;
                AbstractC3193b.m15359b(objM14899c);
                if (((Number) objM14899c).intValue() == 0) {
                    LessonEntity lessonEntityM4161a = bsc.m4161a(resultLessonInfo);
                    lessonRepositoryImpl$fetchLessonInfo$1.f15342a = null;
                    lessonRepositoryImpl$fetchLessonInfo$1.f15343b = i2;
                    lessonRepositoryImpl$fetchLessonInfo$1.f15344c = z2;
                    lessonRepositoryImpl$fetchLessonInfo$1.f15347f = 3;
                }
            } else {
                if (i4 != 3) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM14899c);
            }
            return new xm5(xfa.f68157a);
            ResultLessonInfo resultLessonInfo2 = (ResultLessonInfo) objM14899c;
            if (z) {
                l65 l65VarM4162b = bsc.m4162b(resultLessonInfo2);
                lessonRepositoryImpl$fetchLessonInfo$1.f15342a = resultLessonInfo2;
                lessonRepositoryImpl$fetchLessonInfo$1.f15343b = i;
                lessonRepositoryImpl$fetchLessonInfo$1.f15344c = z;
                lessonRepositoryImpl$fetchLessonInfo$1.f15347f = 2;
                q05 q05Var = (q05) abstractC1320h;
                objM14899c = AbstractC0758a.m2861d(new ke2(24, q05Var, l65VarM4162b), q05Var.f57071K, lessonRepositoryImpl$fetchLessonInfo$1, false, true);
                if (objM14899c != coroutineSingletons) {
                    i2 = i;
                    resultLessonInfo = resultLessonInfo2;
                    z2 = z;
                    if (((Number) objM14899c).intValue() == 0) {
                        LessonEntity lessonEntityM4161a2 = bsc.m4161a(resultLessonInfo);
                        lessonRepositoryImpl$fetchLessonInfo$1.f15342a = null;
                        lessonRepositoryImpl$fetchLessonInfo$1.f15343b = i2;
                        lessonRepositoryImpl$fetchLessonInfo$1.f15344c = z2;
                        lessonRepositoryImpl$fetchLessonInfo$1.f15347f = 3;
                    }
                }
                return coroutineSingletons;
            }
            return new xm5(xfa.f68157a);
        } catch (HttpException e) {
            e.printStackTrace();
            return new um5(new i25(NetworkErrorType.UNKNOWN));
        } catch (Exception e2) {
            e2.printStackTrace();
            return new um5(new i25(NetworkErrorType.TIMEOUT));
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0071  */
    /* JADX WARN: Code duplicated, block: B:26:0x0092  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        if (r14 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
    
        if (r4.m7297q0(r5, r6, false, r8, r9) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        return r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008d -> B:25:0x0090). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: p0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7295p0(int i, int i2, String str, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$updateSaveAllLessons$1 lessonRepositoryImpl$updateSaveAllLessons$1;
        int i3;
        String str2;
        LessonRepositoryImpl$updateSaveAllLessons$1 lessonRepositoryImpl$updateSaveAllLessons$2;
        int i4;
        Iterator it;
        C1295k c1295k;
        if (continuationImpl instanceof LessonRepositoryImpl$updateSaveAllLessons$1) {
            lessonRepositoryImpl$updateSaveAllLessons$1 = (LessonRepositoryImpl$updateSaveAllLessons$1) continuationImpl;
            int i5 = lessonRepositoryImpl$updateSaveAllLessons$1.f15682h;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$updateSaveAllLessons$1.f15682h = i5 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$updateSaveAllLessons$1 = new LessonRepositoryImpl$updateSaveAllLessons$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$updateSaveAllLessons$1 = new LessonRepositoryImpl$updateSaveAllLessons$1(this, continuationImpl);
        }
        Object objM7501B0 = lessonRepositoryImpl$updateSaveAllLessons$1.f15680f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = lessonRepositoryImpl$updateSaveAllLessons$1.f15682h;
        if (i6 != 0) {
            if (i6 == 1) {
                i2 = lessonRepositoryImpl$updateSaveAllLessons$1.f15676b;
                i = lessonRepositoryImpl$updateSaveAllLessons$1.f15675a;
                str = lessonRepositoryImpl$updateSaveAllLessons$1.f15678d;
                AbstractC3193b.m15359b(objM7501B0);
            } else {
                if (i6 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i4 = lessonRepositoryImpl$updateSaveAllLessons$1.f15677c;
                i2 = lessonRepositoryImpl$updateSaveAllLessons$1.f15676b;
                int i7 = lessonRepositoryImpl$updateSaveAllLessons$1.f15675a;
                it = lessonRepositoryImpl$updateSaveAllLessons$1.f15679e;
                String str3 = lessonRepositoryImpl$updateSaveAllLessons$1.f15678d;
                AbstractC3193b.m15359b(objM7501B0);
                i3 = i7;
                lessonRepositoryImpl$updateSaveAllLessons$2 = lessonRepositoryImpl$updateSaveAllLessons$1;
                str2 = str3;
                c1295k = this;
            }
            this = c1295k;
            if (it.hasNext()) {
                return xfa.f68157a;
            }
            int iIntValue = ((Number) it.next()).intValue();
            lessonRepositoryImpl$updateSaveAllLessons$2.f15678d = str2;
            lessonRepositoryImpl$updateSaveAllLessons$2.f15679e = it;
            lessonRepositoryImpl$updateSaveAllLessons$2.f15675a = i3;
            lessonRepositoryImpl$updateSaveAllLessons$2.f15676b = i2;
            lessonRepositoryImpl$updateSaveAllLessons$2.f15677c = i4;
            lessonRepositoryImpl$updateSaveAllLessons$2.f15682h = 2;
            c1295k = this;
        } else {
            AbstractC3193b.m15359b(objM7501B0);
            lessonRepositoryImpl$updateSaveAllLessons$1.f15678d = str;
            lessonRepositoryImpl$updateSaveAllLessons$1.f15675a = i;
            lessonRepositoryImpl$updateSaveAllLessons$1.f15676b = i2;
            lessonRepositoryImpl$updateSaveAllLessons$1.f15682h = 1;
            objM7501B0 = C1321i.m7501B0(this.f16501e, i2, lessonRepositoryImpl$updateSaveAllLessons$1);
        }
        i3 = i;
        str2 = str;
        lessonRepositoryImpl$updateSaveAllLessons$2 = lessonRepositoryImpl$updateSaveAllLessons$1;
        i4 = 0;
        it = ((List) objM7501B0).iterator();
        if (it.hasNext()) {
            return xfa.f68157a;
        }
        int iIntValue2 = ((Number) it.next()).intValue();
        lessonRepositoryImpl$updateSaveAllLessons$2.f15678d = str2;
        lessonRepositoryImpl$updateSaveAllLessons$2.f15679e = it;
        lessonRepositoryImpl$updateSaveAllLessons$2.f15675a = i3;
        lessonRepositoryImpl$updateSaveAllLessons$2.f15676b = i2;
        lessonRepositoryImpl$updateSaveAllLessons$2.f15677c = i4;
        lessonRepositoryImpl$updateSaveAllLessons$2.f15682h = 2;
        c1295k = this;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008a A[Catch: Exception -> 0x00be, TryCatch #0 {Exception -> 0x00be, blocks: (B:14:0x002d, B:38:0x009b, B:40:0x00a1, B:43:0x00a8, B:46:0x00b2, B:48:0x00b6, B:19:0x003d, B:33:0x0082, B:35:0x008a, B:23:0x0046, B:29:0x005f, B:26:0x004d), top: B:52:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0098, code lost:
    
        if (r3.mo4095v0(r11, r0) == r1) goto L37;
     */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7296q(int i, String str, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$fetchLessonInfoUrl$1 lessonRepositoryImpl$fetchLessonInfoUrl$1;
        ResultLesson resultLesson;
        ResultLesson resultLesson2;
        String strM8363a;
        String strM8363a2;
        if (continuationImpl instanceof LessonRepositoryImpl$fetchLessonInfoUrl$1) {
            lessonRepositoryImpl$fetchLessonInfoUrl$1 = (LessonRepositoryImpl$fetchLessonInfoUrl$1) continuationImpl;
            int i2 = lessonRepositoryImpl$fetchLessonInfoUrl$1.f15352e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$fetchLessonInfoUrl$1.f15352e = i2 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$fetchLessonInfoUrl$1 = new LessonRepositoryImpl$fetchLessonInfoUrl$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$fetchLessonInfoUrl$1 = new LessonRepositoryImpl$fetchLessonInfoUrl$1(this, continuationImpl);
        }
        Object objM14915x = lessonRepositoryImpl$fetchLessonInfoUrl$1.f15350c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = lessonRepositoryImpl$fetchLessonInfoUrl$1.f15352e;
        AbstractC1320h abstractC1320h = this.f16498b;
        try {
            if (i3 == 0) {
                AbstractC3193b.m15359b(objM14915x);
                k65 k65Var = this.f16502f;
                Integer num = new Integer(i);
                lessonRepositoryImpl$fetchLessonInfoUrl$1.f15349b = i;
                lessonRepositoryImpl$fetchLessonInfoUrl$1.f15352e = 1;
                objM14915x = k65Var.m14915x(str, num, lessonRepositoryImpl$fetchLessonInfoUrl$1);
                if (objM14915x == coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i3 == 1) {
                i = lessonRepositoryImpl$fetchLessonInfoUrl$1.f15349b;
                AbstractC3193b.m15359b(objM14915x);
            } else if (i3 == 2) {
                int i4 = lessonRepositoryImpl$fetchLessonInfoUrl$1.f15349b;
                ResultLesson resultLesson3 = lessonRepositoryImpl$fetchLessonInfoUrl$1.f15348a;
                AbstractC3193b.m15359b(objM14915x);
                resultLesson = resultLesson3;
                i = i4;
                resultLesson2 = resultLesson;
                if (((Number) objM14915x).intValue() == 0) {
                    LessonEntity lessonEntityM11330b = esc.m11330b(resultLesson2);
                    lessonRepositoryImpl$fetchLessonInfoUrl$1.f15348a = resultLesson2;
                    lessonRepositoryImpl$fetchLessonInfoUrl$1.f15349b = i;
                    lessonRepositoryImpl$fetchLessonInfoUrl$1.f15352e = 3;
                }
            } else {
                if (i3 != 3) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                resultLesson2 = lessonRepositoryImpl$fetchLessonInfoUrl$1.f15348a;
                AbstractC3193b.m15359b(objM14915x);
            }
            strM8363a = resultLesson2.m8363a();
            if (strM8363a != null && !vk9.m23391n0(strM8363a)) {
                strM8363a2 = resultLesson2.m8363a();
                if (strM8363a2 == null) {
                    strM8363a2 = "";
                }
                return new xm5(strM8363a2);
            }
            return new um5(c25.f9351a);
            ResultLesson resultLesson4 = (ResultLesson) objM14915x;
            r45 r45VarM11335g = esc.m11335g(resultLesson4);
            lessonRepositoryImpl$fetchLessonInfoUrl$1.f15348a = resultLesson4;
            lessonRepositoryImpl$fetchLessonInfoUrl$1.f15349b = i;
            lessonRepositoryImpl$fetchLessonInfoUrl$1.f15352e = 2;
            q05 q05Var = (q05) abstractC1320h;
            Object objM2861d = AbstractC0758a.m2861d(new ke2(22, q05Var, r45VarM11335g), q05Var.f57071K, lessonRepositoryImpl$fetchLessonInfoUrl$1, false, true);
            if (objM2861d != coroutineSingletons) {
                resultLesson = resultLesson4;
                objM14915x = objM2861d;
                resultLesson2 = resultLesson;
                if (((Number) objM14915x).intValue() == 0) {
                    LessonEntity lessonEntityM11330b2 = esc.m11330b(resultLesson2);
                    lessonRepositoryImpl$fetchLessonInfoUrl$1.f15348a = resultLesson2;
                    lessonRepositoryImpl$fetchLessonInfoUrl$1.f15349b = i;
                    lessonRepositoryImpl$fetchLessonInfoUrl$1.f15352e = 3;
                }
                strM8363a = resultLesson2.m8363a();
                if (strM8363a != null) {
                    strM8363a2 = resultLesson2.m8363a();
                    if (strM8363a2 == null) {
                        strM8363a2 = "";
                    }
                    return new xm5(strM8363a2);
                }
                return new um5(c25.f9351a);
            }
            return coroutineSingletons;
        } catch (Exception unused) {
            return new um5(new i25(NetworkErrorType.TIMEOUT));
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007f  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a8, code lost:
    
        if (r13 == r1) goto L31;
     */
    /* JADX INFO: renamed from: q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7297q0(int i, int i2, boolean z, String str, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$updateSaveRemove$1 lessonRepositoryImpl$updateSaveRemove$1;
        int i3;
        boolean z2;
        Object objM2861d;
        if (continuationImpl instanceof LessonRepositoryImpl$updateSaveRemove$1) {
            lessonRepositoryImpl$updateSaveRemove$1 = (LessonRepositoryImpl$updateSaveRemove$1) continuationImpl;
            int i4 = lessonRepositoryImpl$updateSaveRemove$1.f15689g;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$updateSaveRemove$1.f15689g = i4 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$updateSaveRemove$1 = new LessonRepositoryImpl$updateSaveRemove$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$updateSaveRemove$1 = new LessonRepositoryImpl$updateSaveRemove$1(this, continuationImpl);
        }
        Object obj = lessonRepositoryImpl$updateSaveRemove$1.f15687e;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = lessonRepositoryImpl$updateSaveRemove$1.f15689g;
        Object obj3 = xfa.f68157a;
        if (i5 == 0) {
            AbstractC3193b.m15359b(obj);
            lessonRepositoryImpl$updateSaveRemove$1.f15686d = str;
            lessonRepositoryImpl$updateSaveRemove$1.f15683a = i;
            lessonRepositoryImpl$updateSaveRemove$1.f15684b = i2;
            lessonRepositoryImpl$updateSaveRemove$1.f15685c = z;
            lessonRepositoryImpl$updateSaveRemove$1.f15689g = 1;
            if (m7270b0(i2, z, lessonRepositoryImpl$updateSaveRemove$1) != obj2) {
            }
            return obj2;
        }
        if (i5 == 1) {
            z = lessonRepositoryImpl$updateSaveRemove$1.f15685c;
            i2 = lessonRepositoryImpl$updateSaveRemove$1.f15684b;
            i = lessonRepositoryImpl$updateSaveRemove$1.f15683a;
            str = lessonRepositoryImpl$updateSaveRemove$1.f15686d;
            AbstractC3193b.m15359b(obj);
        } else if (i5 == 2) {
            z2 = lessonRepositoryImpl$updateSaveRemove$1.f15685c;
            i2 = lessonRepositoryImpl$updateSaveRemove$1.f15684b;
            i3 = lessonRepositoryImpl$updateSaveRemove$1.f15683a;
            str = lessonRepositoryImpl$updateSaveRemove$1.f15686d;
            AbstractC3193b.m15359b(obj);
            if (!z2) {
                String strM22990m = ux5.m22990m(str, "_my_lessons_");
                lessonRepositoryImpl$updateSaveRemove$1.f15686d = null;
                lessonRepositoryImpl$updateSaveRemove$1.f15683a = i3;
                lessonRepositoryImpl$updateSaveRemove$1.f15684b = i2;
                lessonRepositoryImpl$updateSaveRemove$1.f15685c = z2;
                lessonRepositoryImpl$updateSaveRemove$1.f15689g = 3;
                String value = LibraryItemType.Content.getValue();
                objM2861d = AbstractC0758a.m2861d(new sp0(strM22990m, i2, 5, value), this.f16501e.f17034K, lessonRepositoryImpl$updateSaveRemove$1, false, true);
                if (objM2861d != obj2) {
                    objM2861d = obj3;
                }
            }
        } else {
            if (i5 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = lessonRepositoryImpl$updateSaveRemove$1.f15685c;
            i2 = lessonRepositoryImpl$updateSaveRemove$1.f15684b;
            i3 = lessonRepositoryImpl$updateSaveRemove$1.f15683a;
            AbstractC3193b.m15359b(obj);
        }
        m7280i(i3, i2, z2);
        return obj3;
        lessonRepositoryImpl$updateSaveRemove$1.f15686d = str;
        lessonRepositoryImpl$updateSaveRemove$1.f15683a = i;
        lessonRepositoryImpl$updateSaveRemove$1.f15684b = i2;
        lessonRepositoryImpl$updateSaveRemove$1.f15685c = z;
        lessonRepositoryImpl$updateSaveRemove$1.f15689g = 2;
        if (m7273e0(i2, z, lessonRepositoryImpl$updateSaveRemove$1) != obj2) {
            boolean z3 = z;
            i3 = i;
            z2 = z3;
            if (!z2) {
                String strM22990m2 = ux5.m22990m(str, "_my_lessons_");
                lessonRepositoryImpl$updateSaveRemove$1.f15686d = null;
                lessonRepositoryImpl$updateSaveRemove$1.f15683a = i3;
                lessonRepositoryImpl$updateSaveRemove$1.f15684b = i2;
                lessonRepositoryImpl$updateSaveRemove$1.f15685c = z2;
                lessonRepositoryImpl$updateSaveRemove$1.f15689g = 3;
                String value2 = LibraryItemType.Content.getValue();
                objM2861d = AbstractC0758a.m2861d(new sp0(strM22990m2, i2, 5, value2), this.f16501e.f17034K, lessonRepositoryImpl$updateSaveRemove$1, false, true);
                if (objM2861d != obj2) {
                    objM2861d = obj3;
                }
            }
            m7280i(i3, i2, z2);
            return obj3;
        }
        return obj2;
    }

    /* JADX INFO: renamed from: r */
    public final Object m7298r(int i, int i2, ContinuationImpl continuationImpl) {
        q05 q05Var = (q05) this.f16498b;
        return AbstractC0758a.m2861d(new f05(i, i2, q05Var, 1), q05Var.f57071K, continuationImpl, true, true);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008a  */
    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b2 A[LOOP:0: B:36:0x00ac->B:38:0x00b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x00cd A[PHI: r9
      0x00cd: PHI (r9v6 int) = (r9v3 int), (r9v3 int), (r9v9 int) binds: [B:34:0x0099, B:40:0x00ca, B:18:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00de A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x00df  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: s */
    public final Object m7299s(int i, String str, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$fetchLessonSentences$1 lessonRepositoryImpl$fetchLessonSentences$1;
        int i2;
        NetworkResponse networkResponse;
        List list;
        ArrayList arrayList;
        Iterator it;
        Object objM15541t;
        if (continuationImpl instanceof LessonRepositoryImpl$fetchLessonSentences$1) {
            lessonRepositoryImpl$fetchLessonSentences$1 = (LessonRepositoryImpl$fetchLessonSentences$1) continuationImpl;
            int i3 = lessonRepositoryImpl$fetchLessonSentences$1.f15357e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$fetchLessonSentences$1.f15357e = i3 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$fetchLessonSentences$1 = new LessonRepositoryImpl$fetchLessonSentences$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$fetchLessonSentences$1 = new LessonRepositoryImpl$fetchLessonSentences$1(this, continuationImpl);
        }
        Object objM15541t2 = lessonRepositoryImpl$fetchLessonSentences$1.f15355c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = lessonRepositoryImpl$fetchLessonSentences$1.f15357e;
        AbstractC1320h abstractC1320h = this.f16498b;
        if (i4 == 0) {
            AbstractC3193b.m15359b(objM15541t2);
            i93 i93VarMo7487D0 = abstractC1320h.mo7487D0(i);
            lessonRepositoryImpl$fetchLessonSentences$1.f15353a = str;
            lessonRepositoryImpl$fetchLessonSentences$1.f15354b = i;
            lessonRepositoryImpl$fetchLessonSentences$1.f15357e = 1;
            objM15541t2 = AbstractC3224d.m15541t(i93VarMo7487D0, lessonRepositoryImpl$fetchLessonSentences$1);
            if (objM15541t2 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i4 == 1) {
            i = lessonRepositoryImpl$fetchLessonSentences$1.f15354b;
            str = lessonRepositoryImpl$fetchLessonSentences$1.f15353a;
            AbstractC3193b.m15359b(objM15541t2);
        } else {
            if (i4 == 2) {
                i2 = lessonRepositoryImpl$fetchLessonSentences$1.f15354b;
                AbstractC3193b.m15359b(objM15541t2);
                networkResponse = (NetworkResponse) objM15541t2;
                if (networkResponse instanceof NetworkResponse.Success) {
                    if (networkResponse instanceof NetworkResponse.Error) {
                        return EmptyList.f47638a;
                    }
                    gm5.m12750e();
                    return null;
                }
                list = (List) ((NetworkResponse.Success) networkResponse).getData();
                if (list.isEmpty()) {
                    List list2 = list;
                    arrayList = new ArrayList(v91.m23189q0(list2, 10));
                    it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(puc.m19490g((ResultTranslationSentence) it.next(), i2));
                    }
                    lessonRepositoryImpl$fetchLessonSentences$1.f15353a = null;
                    lessonRepositoryImpl$fetchLessonSentences$1.f15354b = i2;
                    lessonRepositoryImpl$fetchLessonSentences$1.f15357e = 3;
                    if (abstractC1320h.mo7496M0(arrayList, lessonRepositoryImpl$fetchLessonSentences$1) != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i4 != 3) {
                if (i4 == 4) {
                    AbstractC3193b.m15359b(objM15541t2);
                    return objM15541t2;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = lessonRepositoryImpl$fetchLessonSentences$1.f15354b;
            AbstractC3193b.m15359b(objM15541t2);
        }
        i93 i93VarMo7487D1 = abstractC1320h.mo7487D0(i2);
        lessonRepositoryImpl$fetchLessonSentences$1.f15353a = null;
        lessonRepositoryImpl$fetchLessonSentences$1.f15354b = i2;
        lessonRepositoryImpl$fetchLessonSentences$1.f15357e = 4;
        objM15541t = AbstractC3224d.m15541t(i93VarMo7487D1, lessonRepositoryImpl$fetchLessonSentences$1);
        if (objM15541t == coroutineSingletons) {
            return coroutineSingletons;
        }
        return objM15541t;
        List list3 = (List) objM15541t2;
        if (!list3.isEmpty()) {
            return list3;
        }
        Integer num = new Integer(i);
        lessonRepositoryImpl$fetchLessonSentences$1.f15353a = null;
        lessonRepositoryImpl$fetchLessonSentences$1.f15354b = i;
        lessonRepositoryImpl$fetchLessonSentences$1.f15357e = 2;
        objM15541t2 = this.f16502f.m14889A(str, num, true, lessonRepositoryImpl$fetchLessonSentences$1);
        if (objM15541t2 != coroutineSingletons) {
            i2 = i;
            networkResponse = (NetworkResponse) objM15541t2;
            if (networkResponse instanceof NetworkResponse.Success) {
                if (networkResponse instanceof NetworkResponse.Error) {
                    return EmptyList.f47638a;
                }
                gm5.m12750e();
                return null;
            }
            list = (List) ((NetworkResponse.Success) networkResponse).getData();
            if (list.isEmpty()) {
                i93 i93VarMo7487D2 = abstractC1320h.mo7487D0(i2);
                lessonRepositoryImpl$fetchLessonSentences$1.f15353a = null;
                lessonRepositoryImpl$fetchLessonSentences$1.f15354b = i2;
                lessonRepositoryImpl$fetchLessonSentences$1.f15357e = 4;
                objM15541t = AbstractC3224d.m15541t(i93VarMo7487D2, lessonRepositoryImpl$fetchLessonSentences$1);
                if (objM15541t == coroutineSingletons) {
                    return objM15541t;
                }
            } else {
                List list4 = list;
                arrayList = new ArrayList(v91.m23189q0(list4, 10));
                it = list4.iterator();
                while (it.hasNext()) {
                    arrayList.add(puc.m19490g((ResultTranslationSentence) it.next(), i2));
                }
                lessonRepositoryImpl$fetchLessonSentences$1.f15353a = null;
                lessonRepositoryImpl$fetchLessonSentences$1.f15354b = i2;
                lessonRepositoryImpl$fetchLessonSentences$1.f15357e = 3;
                if (abstractC1320h.mo7496M0(arrayList, lessonRepositoryImpl$fetchLessonSentences$1) != coroutineSingletons) {
                    i93 i93VarMo7487D3 = abstractC1320h.mo7487D0(i2);
                    lessonRepositoryImpl$fetchLessonSentences$1.f15353a = null;
                    lessonRepositoryImpl$fetchLessonSentences$1.f15354b = i2;
                    lessonRepositoryImpl$fetchLessonSentences$1.f15357e = 4;
                    objM15541t = AbstractC3224d.m15541t(i93VarMo7487D3, lessonRepositoryImpl$fetchLessonSentences$1);
                    if (objM15541t == coroutineSingletons) {
                        return objM15541t;
                    }
                }
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: t */
    public final Object m7300t(int i, String str, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$fetchLessonStats$1 lessonRepositoryImpl$fetchLessonStats$1;
        if (continuationImpl instanceof LessonRepositoryImpl$fetchLessonStats$1) {
            lessonRepositoryImpl$fetchLessonStats$1 = (LessonRepositoryImpl$fetchLessonStats$1) continuationImpl;
            int i2 = lessonRepositoryImpl$fetchLessonStats$1.f15361d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$fetchLessonStats$1.f15361d = i2 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$fetchLessonStats$1 = new LessonRepositoryImpl$fetchLessonStats$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$fetchLessonStats$1 = new LessonRepositoryImpl$fetchLessonStats$1(this, continuationImpl);
        }
        Object objM14890B = lessonRepositoryImpl$fetchLessonStats$1.f15359b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = lessonRepositoryImpl$fetchLessonStats$1.f15361d;
        xfa xfaVar = xfa.f68157a;
        try {
            if (i3 == 0) {
                AbstractC3193b.m15359b(objM14890B);
                k65 k65Var = this.f16502f;
                Integer num = new Integer(i);
                lessonRepositoryImpl$fetchLessonStats$1.f15358a = i;
                lessonRepositoryImpl$fetchLessonStats$1.f15361d = 1;
                objM14890B = k65Var.m14890B(str, num, lessonRepositoryImpl$fetchLessonStats$1);
                if (objM14890B == coroutineSingletons) {
                }
            }
            if (i3 != 1) {
                if (i3 == 2) {
                    AbstractC3193b.m15359b(objM14890B);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = lessonRepositoryImpl$fetchLessonStats$1.f15358a;
            AbstractC3193b.m15359b(objM14890B);
            AbstractC1320h abstractC1320h = this.f16498b;
            LessonStatsEntity lessonStatsEntityM13453a = hsc.m13453a((ResultLessonStats) objM14890B, i);
            lessonRepositoryImpl$fetchLessonStats$1.f15358a = i;
            lessonRepositoryImpl$fetchLessonStats$1.f15361d = 2;
            q05 q05Var = (q05) abstractC1320h;
            Object objM2861d = AbstractC0758a.m2861d(new ke2(23, q05Var, lessonStatsEntityM13453a), q05Var.f57071K, lessonRepositoryImpl$fetchLessonStats$1, false, true);
            if (objM2861d != coroutineSingletons) {
                objM2861d = xfaVar;
            }
            return objM2861d == coroutineSingletons ? coroutineSingletons : xfaVar;
        } catch (Exception e) {
            e.printStackTrace();
            return xfaVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: u */
    public final Object m7301u(String str, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$fetchLessonTags$1 lessonRepositoryImpl$fetchLessonTags$1;
        Results results;
        Results results2;
        if (continuationImpl instanceof LessonRepositoryImpl$fetchLessonTags$1) {
            lessonRepositoryImpl$fetchLessonTags$1 = (LessonRepositoryImpl$fetchLessonTags$1) continuationImpl;
            int i = lessonRepositoryImpl$fetchLessonTags$1.f15365d;
            if ((i & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$fetchLessonTags$1.f15365d = i - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$fetchLessonTags$1 = new LessonRepositoryImpl$fetchLessonTags$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$fetchLessonTags$1 = new LessonRepositoryImpl$fetchLessonTags$1(this, continuationImpl);
        }
        Object objM14894G = lessonRepositoryImpl$fetchLessonTags$1.f15363b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = lessonRepositoryImpl$fetchLessonTags$1.f15365d;
        int i3 = 1;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM14894G);
            lessonRepositoryImpl$fetchLessonTags$1.f15365d = 1;
            objM14894G = this.f16502f.m14894G(20, "startsWith", str, lessonRepositoryImpl$fetchLessonTags$1);
            if (objM14894G != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            AbstractC3193b.m15359b(objM14894G);
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            results2 = lessonRepositoryImpl$fetchLessonTags$1.f15362a;
            AbstractC3193b.m15359b(objM14894G);
        }
        results = results2;
        return new Integer(results.f21736a);
        results = (Results) objM14894G;
        List list = results.f21739d;
        if (list != null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(lsc.m16528a((ResultLessonTags) it.next()));
            }
            lessonRepositoryImpl$fetchLessonTags$1.f15362a = results;
            lessonRepositoryImpl$fetchLessonTags$1.f15365d = 2;
            q05 q05Var = (q05) this.f16498b;
            Object objM2861d = AbstractC0758a.m2861d(new g05(q05Var, arrayList, i3), q05Var.f57071K, lessonRepositoryImpl$fetchLessonTags$1, false, true);
            if (objM2861d != CoroutineSingletons.COROUTINE_SUSPENDED) {
                objM2861d = xfa.f68157a;
            }
            if (objM2861d != coroutineSingletons) {
                results2 = results;
                results = results2;
            }
            return coroutineSingletons;
        }
        return new Integer(results.f21736a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:102:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:30:0x0092  */
    /* JADX WARN: Code duplicated, block: B:33:0x0099  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00be A[PHI: r8 r9
      0x00be: PHI (r8v11 boolean) = (r8v5 boolean), (r8v13 boolean) binds: [B:37:0x00ba, B:15:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x00be: PHI (r9v7 int) = (r9v4 int), (r9v8 int) binds: [B:37:0x00ba, B:15:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x00df  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ef A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:63:0x011f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0125  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:85:0x0177  */
    /* JADX WARN: Code duplicated, block: B:87:0x017f  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ac  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        if (r11 == r1) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cb, code lost:
    
        if (r11 == r1) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x018e, code lost:
    
        if (r11 == r1) goto L89;
     */
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7302v(String str, int i, boolean z, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$fetchLessonText$1 lessonRepositoryImpl$fetchLessonText$1;
        boolean z2;
        NetworkResponse networkResponse;
        NetworkResponse.Error error;
        String body;
        Throwable throwable;
        Object failure;
        h25 h25VarM7246D;
        h25 h25Var;
        Object objM2849b;
        x45 x45Var;
        if (continuationImpl instanceof LessonRepositoryImpl$fetchLessonText$1) {
            lessonRepositoryImpl$fetchLessonText$1 = (LessonRepositoryImpl$fetchLessonText$1) continuationImpl;
            int i2 = lessonRepositoryImpl$fetchLessonText$1.f15372g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$fetchLessonText$1.f15372g = i2 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$fetchLessonText$1 = new LessonRepositoryImpl$fetchLessonText$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$fetchLessonText$1 = new LessonRepositoryImpl$fetchLessonText$1(this, continuationImpl);
        }
        Object objM7244B = lessonRepositoryImpl$fetchLessonText$1.f15370e;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = lessonRepositoryImpl$fetchLessonText$1.f15372g;
        g25 g25Var = g25.f40076a;
        switch (i3) {
            case 0:
                AbstractC3193b.m15359b(objM7244B);
                if (z) {
                    Integer num = new Integer(i);
                    lessonRepositoryImpl$fetchLessonText$1.f15366a = null;
                    lessonRepositoryImpl$fetchLessonText$1.f15368c = i;
                    lessonRepositoryImpl$fetchLessonText$1.f15369d = z;
                    lessonRepositoryImpl$fetchLessonText$1.f15372g = 2;
                    objM7244B = this.f16502f.m14912t(str, num, false, lessonRepositoryImpl$fetchLessonText$1);
                    if (objM7244B != obj) {
                        z2 = z;
                        networkResponse = (NetworkResponse) objM7244B;
                        if (!(networkResponse instanceof NetworkResponse.Success)) {
                            ResultLessonText resultLessonText = (ResultLessonText) ((NetworkResponse.Success) networkResponse).getData();
                            lessonRepositoryImpl$fetchLessonText$1.f15366a = null;
                            lessonRepositoryImpl$fetchLessonText$1.f15368c = i;
                            lessonRepositoryImpl$fetchLessonText$1.f15369d = z2;
                            lessonRepositoryImpl$fetchLessonText$1.f15372g = 3;
                            objM2849b = AbstractC0747e.m2849b(this.f16497a, new LessonRepositoryImpl$storeLessonTextData$2(resultLessonText, this, i, null), lessonRepositoryImpl$fetchLessonText$1);
                            if (objM2849b != obj) {
                                objM2849b = xfa.f68157a;
                            }
                            if (objM2849b != obj) {
                                lessonRepositoryImpl$fetchLessonText$1.f15366a = null;
                                lessonRepositoryImpl$fetchLessonText$1.f15368c = i;
                                lessonRepositoryImpl$fetchLessonText$1.f15369d = z2;
                                lessonRepositoryImpl$fetchLessonText$1.f15372g = 4;
                                objM7244B = m7244B(i, lessonRepositoryImpl$fetchLessonText$1);
                            }
                        } else {
                            if (!(networkResponse instanceof NetworkResponse.Error)) {
                                gm5.m12750e();
                                return null;
                            }
                            error = (NetworkResponse.Error) networkResponse;
                            body = error.getBody();
                            Integer code = error.getCode();
                            if (body != null || code == null) {
                                throwable = error.getThrowable();
                                if (throwable instanceof IOException) {
                                    return throwable instanceof CancellationException ? new um5(e25.f36618a) : new um5(g25Var);
                                }
                                lessonRepositoryImpl$fetchLessonText$1.f15366a = null;
                                lessonRepositoryImpl$fetchLessonText$1.f15367b = null;
                                lessonRepositoryImpl$fetchLessonText$1.f15368c = i;
                                lessonRepositoryImpl$fetchLessonText$1.f15369d = z2;
                                lessonRepositoryImpl$fetchLessonText$1.f15372g = 6;
                                objM7244B = m7244B(i, lessonRepositoryImpl$fetchLessonText$1);
                            } else {
                                if (code.intValue() == 400) {
                                    h25VarM7246D = m7246D(body);
                                    if (ijd.m13970a(h25VarM7246D.m13002a())) {
                                        lessonRepositoryImpl$fetchLessonText$1.f15366a = null;
                                        lessonRepositoryImpl$fetchLessonText$1.f15367b = h25VarM7246D;
                                        lessonRepositoryImpl$fetchLessonText$1.f15368c = i;
                                        lessonRepositoryImpl$fetchLessonText$1.f15369d = z2;
                                        lessonRepositoryImpl$fetchLessonText$1.f15372g = 5;
                                        objM7244B = m7244B(i, lessonRepositoryImpl$fetchLessonText$1);
                                        if (objM7244B != obj) {
                                            h25Var = h25VarM7246D;
                                            x45Var = (x45) objM7244B;
                                            if (x45Var != null) {
                                                return new xm5(x45Var);
                                            }
                                            h25VarM7246D = h25Var;
                                        }
                                    }
                                    return new um5(h25VarM7246D);
                                }
                                if (code.intValue() != 401) {
                                    try {
                                        try {
                                            df4 df4Var = this.f16507k;
                                            df4Var.getClass();
                                            failure = (ResultErrorLesson) df4Var.m10321a(body, ResultErrorLesson.Companion.serializer());
                                        } catch (Throwable th) {
                                            failure = new Result.Failure(th);
                                        }
                                        if (failure instanceof Result.Failure) {
                                            failure = null;
                                        }
                                        ResultErrorLesson resultErrorLesson = (ResultErrorLesson) failure;
                                        if (resultErrorLesson != null && !vk9.m23391n0(resultErrorLesson.m8355a())) {
                                            return new um5(new f25(resultErrorLesson.m8355a()));
                                        }
                                    } catch (Exception unused) {
                                        return new um5(g25Var);
                                    }
                                }
                                throwable = error.getThrowable();
                                if (throwable instanceof IOException) {
                                    if (throwable instanceof CancellationException) {
                                    }
                                }
                                lessonRepositoryImpl$fetchLessonText$1.f15366a = null;
                                lessonRepositoryImpl$fetchLessonText$1.f15367b = null;
                                lessonRepositoryImpl$fetchLessonText$1.f15368c = i;
                                lessonRepositoryImpl$fetchLessonText$1.f15369d = z2;
                                lessonRepositoryImpl$fetchLessonText$1.f15372g = 6;
                                objM7244B = m7244B(i, lessonRepositoryImpl$fetchLessonText$1);
                            }
                        }
                    }
                    break;
                } else {
                    lessonRepositoryImpl$fetchLessonText$1.f15366a = str;
                    lessonRepositoryImpl$fetchLessonText$1.f15368c = i;
                    lessonRepositoryImpl$fetchLessonText$1.f15369d = z;
                    lessonRepositoryImpl$fetchLessonText$1.f15372g = 1;
                    objM7244B = m7244B(i, lessonRepositoryImpl$fetchLessonText$1);
                    break;
                }
                return obj;
            case 1:
                z = lessonRepositoryImpl$fetchLessonText$1.f15369d;
                i = lessonRepositoryImpl$fetchLessonText$1.f15368c;
                str = lessonRepositoryImpl$fetchLessonText$1.f15366a;
                AbstractC3193b.m15359b(objM7244B);
                x45 x45Var2 = (x45) objM7244B;
                if (x45Var2 != null) {
                    return new xm5(x45Var2);
                }
                Integer num2 = new Integer(i);
                lessonRepositoryImpl$fetchLessonText$1.f15366a = null;
                lessonRepositoryImpl$fetchLessonText$1.f15368c = i;
                lessonRepositoryImpl$fetchLessonText$1.f15369d = z;
                lessonRepositoryImpl$fetchLessonText$1.f15372g = 2;
                objM7244B = this.f16502f.m14912t(str, num2, false, lessonRepositoryImpl$fetchLessonText$1);
                if (objM7244B != obj) {
                    z2 = z;
                    networkResponse = (NetworkResponse) objM7244B;
                    if (!(networkResponse instanceof NetworkResponse.Success)) {
                        ResultLessonText resultLessonText2 = (ResultLessonText) ((NetworkResponse.Success) networkResponse).getData();
                        lessonRepositoryImpl$fetchLessonText$1.f15366a = null;
                        lessonRepositoryImpl$fetchLessonText$1.f15368c = i;
                        lessonRepositoryImpl$fetchLessonText$1.f15369d = z2;
                        lessonRepositoryImpl$fetchLessonText$1.f15372g = 3;
                        objM2849b = AbstractC0747e.m2849b(this.f16497a, new LessonRepositoryImpl$storeLessonTextData$2(resultLessonText2, this, i, null), lessonRepositoryImpl$fetchLessonText$1);
                        if (objM2849b != obj) {
                            objM2849b = xfa.f68157a;
                        }
                        if (objM2849b != obj) {
                            lessonRepositoryImpl$fetchLessonText$1.f15366a = null;
                            lessonRepositoryImpl$fetchLessonText$1.f15368c = i;
                            lessonRepositoryImpl$fetchLessonText$1.f15369d = z2;
                            lessonRepositoryImpl$fetchLessonText$1.f15372g = 4;
                            objM7244B = m7244B(i, lessonRepositoryImpl$fetchLessonText$1);
                        }
                    } else {
                        if (!(networkResponse instanceof NetworkResponse.Error)) {
                            gm5.m12750e();
                            return null;
                        }
                        error = (NetworkResponse.Error) networkResponse;
                        body = error.getBody();
                        Integer code2 = error.getCode();
                        if (body != null) {
                            throwable = error.getThrowable();
                            if (throwable instanceof IOException) {
                                if (throwable instanceof CancellationException) {
                                }
                            }
                            lessonRepositoryImpl$fetchLessonText$1.f15366a = null;
                            lessonRepositoryImpl$fetchLessonText$1.f15367b = null;
                            lessonRepositoryImpl$fetchLessonText$1.f15368c = i;
                            lessonRepositoryImpl$fetchLessonText$1.f15369d = z2;
                            lessonRepositoryImpl$fetchLessonText$1.f15372g = 6;
                            objM7244B = m7244B(i, lessonRepositoryImpl$fetchLessonText$1);
                        } else {
                            throwable = error.getThrowable();
                            if (throwable instanceof IOException) {
                                if (throwable instanceof CancellationException) {
                                }
                            }
                            lessonRepositoryImpl$fetchLessonText$1.f15366a = null;
                            lessonRepositoryImpl$fetchLessonText$1.f15367b = null;
                            lessonRepositoryImpl$fetchLessonText$1.f15368c = i;
                            lessonRepositoryImpl$fetchLessonText$1.f15369d = z2;
                            lessonRepositoryImpl$fetchLessonText$1.f15372g = 6;
                            objM7244B = m7244B(i, lessonRepositoryImpl$fetchLessonText$1);
                        }
                    }
                    break;
                }
                return obj;
            case 2:
                z2 = lessonRepositoryImpl$fetchLessonText$1.f15369d;
                i = lessonRepositoryImpl$fetchLessonText$1.f15368c;
                AbstractC3193b.m15359b(objM7244B);
                networkResponse = (NetworkResponse) objM7244B;
                if (!(networkResponse instanceof NetworkResponse.Success)) {
                    if (!(networkResponse instanceof NetworkResponse.Error)) {
                        gm5.m12750e();
                        return null;
                    }
                    error = (NetworkResponse.Error) networkResponse;
                    body = error.getBody();
                    Integer code3 = error.getCode();
                    if (body != null) {
                        throwable = error.getThrowable();
                        if (throwable instanceof IOException) {
                            if (throwable instanceof CancellationException) {
                            }
                        }
                        lessonRepositoryImpl$fetchLessonText$1.f15366a = null;
                        lessonRepositoryImpl$fetchLessonText$1.f15367b = null;
                        lessonRepositoryImpl$fetchLessonText$1.f15368c = i;
                        lessonRepositoryImpl$fetchLessonText$1.f15369d = z2;
                        lessonRepositoryImpl$fetchLessonText$1.f15372g = 6;
                        objM7244B = m7244B(i, lessonRepositoryImpl$fetchLessonText$1);
                    } else {
                        throwable = error.getThrowable();
                        if (throwable instanceof IOException) {
                            if (throwable instanceof CancellationException) {
                            }
                        }
                        lessonRepositoryImpl$fetchLessonText$1.f15366a = null;
                        lessonRepositoryImpl$fetchLessonText$1.f15367b = null;
                        lessonRepositoryImpl$fetchLessonText$1.f15368c = i;
                        lessonRepositoryImpl$fetchLessonText$1.f15369d = z2;
                        lessonRepositoryImpl$fetchLessonText$1.f15372g = 6;
                        objM7244B = m7244B(i, lessonRepositoryImpl$fetchLessonText$1);
                    }
                    break;
                } else {
                    ResultLessonText resultLessonText3 = (ResultLessonText) ((NetworkResponse.Success) networkResponse).getData();
                    lessonRepositoryImpl$fetchLessonText$1.f15366a = null;
                    lessonRepositoryImpl$fetchLessonText$1.f15368c = i;
                    lessonRepositoryImpl$fetchLessonText$1.f15369d = z2;
                    lessonRepositoryImpl$fetchLessonText$1.f15372g = 3;
                    objM2849b = AbstractC0747e.m2849b(this.f16497a, new LessonRepositoryImpl$storeLessonTextData$2(resultLessonText3, this, i, null), lessonRepositoryImpl$fetchLessonText$1);
                    if (objM2849b != obj) {
                        objM2849b = xfa.f68157a;
                    }
                    if (objM2849b != obj) {
                        lessonRepositoryImpl$fetchLessonText$1.f15366a = null;
                        lessonRepositoryImpl$fetchLessonText$1.f15368c = i;
                        lessonRepositoryImpl$fetchLessonText$1.f15369d = z2;
                        lessonRepositoryImpl$fetchLessonText$1.f15372g = 4;
                        objM7244B = m7244B(i, lessonRepositoryImpl$fetchLessonText$1);
                    }
                    break;
                }
                return obj;
            case 3:
                z2 = lessonRepositoryImpl$fetchLessonText$1.f15369d;
                i = lessonRepositoryImpl$fetchLessonText$1.f15368c;
                AbstractC3193b.m15359b(objM7244B);
                lessonRepositoryImpl$fetchLessonText$1.f15366a = null;
                lessonRepositoryImpl$fetchLessonText$1.f15368c = i;
                lessonRepositoryImpl$fetchLessonText$1.f15369d = z2;
                lessonRepositoryImpl$fetchLessonText$1.f15372g = 4;
                objM7244B = m7244B(i, lessonRepositoryImpl$fetchLessonText$1);
                break;
            case 4:
                AbstractC3193b.m15359b(objM7244B);
                x45 x45Var3 = (x45) objM7244B;
                return x45Var3 != null ? new xm5(x45Var3) : new um5(g25Var);
            case 5:
                h25Var = lessonRepositoryImpl$fetchLessonText$1.f15367b;
                AbstractC3193b.m15359b(objM7244B);
                x45Var = (x45) objM7244B;
                if (x45Var != null) {
                    return new xm5(x45Var);
                }
                h25VarM7246D = h25Var;
                return new um5(h25VarM7246D);
            case 6:
                AbstractC3193b.m15359b(objM7244B);
                x45 x45Var4 = (x45) objM7244B;
                return x45Var4 != null ? new xm5(x45Var4) : new um5(new i25(NetworkErrorType.TIMEOUT));
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        if (r12 == r1) goto L27;
     */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7303w(int i, String str, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$fetchLessonWordsCards$1 lessonRepositoryImpl$fetchLessonWordsCards$1;
        if (continuationImpl instanceof LessonRepositoryImpl$fetchLessonWordsCards$1) {
            lessonRepositoryImpl$fetchLessonWordsCards$1 = (LessonRepositoryImpl$fetchLessonWordsCards$1) continuationImpl;
            int i2 = lessonRepositoryImpl$fetchLessonWordsCards$1.f15377e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$fetchLessonWordsCards$1.f15377e = i2 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$fetchLessonWordsCards$1 = new LessonRepositoryImpl$fetchLessonWordsCards$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$fetchLessonWordsCards$1 = new LessonRepositoryImpl$fetchLessonWordsCards$1(this, continuationImpl);
        }
        Object objM14911s = lessonRepositoryImpl$fetchLessonWordsCards$1.f15375c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = lessonRepositoryImpl$fetchLessonWordsCards$1.f15377e;
        xfa xfaVar = xfa.f68157a;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM14911s);
            Integer num = new Integer(i);
            lessonRepositoryImpl$fetchLessonWordsCards$1.f15373a = str;
            lessonRepositoryImpl$fetchLessonWordsCards$1.f15374b = i;
            lessonRepositoryImpl$fetchLessonWordsCards$1.f15377e = 1;
            objM14911s = this.f16502f.m14911s(str, num, lessonRepositoryImpl$fetchLessonWordsCards$1);
            if (objM14911s != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            i = lessonRepositoryImpl$fetchLessonWordsCards$1.f15374b;
            str = lessonRepositoryImpl$fetchLessonWordsCards$1.f15373a;
            AbstractC3193b.m15359b(objM14911s);
        } else {
            if (i3 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM14911s);
        }
        return new xm5(xfaVar);
        int i4 = i;
        String str2 = str;
        NetworkResponse networkResponse = (NetworkResponse) objM14911s;
        if (!(networkResponse instanceof NetworkResponse.Success)) {
            if (!(networkResponse instanceof NetworkResponse.Error)) {
                gm5.m12750e();
                return null;
            }
            Throwable throwable = ((NetworkResponse.Error) networkResponse).getThrowable();
            if (throwable != null) {
                throwable.printStackTrace();
            }
            return new um5(g25.f40076a);
        }
        ResultLessonWordsCards resultLessonWordsCards = (ResultLessonWordsCards) ((NetworkResponse.Success) networkResponse).getData();
        lessonRepositoryImpl$fetchLessonWordsCards$1.f15373a = null;
        lessonRepositoryImpl$fetchLessonWordsCards$1.f15374b = i4;
        lessonRepositoryImpl$fetchLessonWordsCards$1.f15377e = 2;
        Object objM2849b = AbstractC0747e.m2849b(this.f16497a, new LessonRepositoryImpl$storeWordsCards$2(this, i4, str2, resultLessonWordsCards, null), lessonRepositoryImpl$fetchLessonWordsCards$1);
        if (objM2849b != coroutineSingletons) {
            objM2849b = xfaVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
    
        if (r5.f16501e.m7508F0(r6, r0) == r1) goto L25;
     */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7304x(String str, List list, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$fetchLibraryCounters$1 lessonRepositoryImpl$fetchLibraryCounters$1;
        if (continuationImpl instanceof LessonRepositoryImpl$fetchLibraryCounters$1) {
            lessonRepositoryImpl$fetchLibraryCounters$1 = (LessonRepositoryImpl$fetchLibraryCounters$1) continuationImpl;
            int i = lessonRepositoryImpl$fetchLibraryCounters$1.f15380c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$fetchLibraryCounters$1.f15380c = i - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$fetchLibraryCounters$1 = new LessonRepositoryImpl$fetchLibraryCounters$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$fetchLibraryCounters$1 = new LessonRepositoryImpl$fetchLibraryCounters$1(this, continuationImpl);
        }
        Object objM4463d = lessonRepositoryImpl$fetchLibraryCounters$1.f15378a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = lessonRepositoryImpl$fetchLibraryCounters$1.f15380c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM4463d);
            lessonRepositoryImpl$fetchLibraryCounters$1.f15380c = 1;
            objM4463d = this.f16503g.m4463d(str, list, lessonRepositoryImpl$fetchLibraryCounters$1);
            if (objM4463d != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            AbstractC3193b.m15359b(objM4463d);
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM4463d);
        }
        return xfa.f68157a;
        Map map = (Map) objM4463d;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(AbstractC3122is.m14085D((ResultLibraryCounter) entry.getValue(), ((Number) entry.getKey()).intValue(), LibraryItemType.Content.getValue()));
        }
        lessonRepositoryImpl$fetchLibraryCounters$1.f15380c = 2;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0385 A[LOOP:2: B:98:0x037f->B:100:0x0385, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:104:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:106:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:109:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:112:0x03fd A[LOOP:4: B:107:0x03e4->B:112:0x03fd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x040d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0411  */
    /* JADX WARN: Code duplicated, block: B:119:0x042e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0471  */
    /* JADX WARN: Code duplicated, block: B:126:0x047a  */
    /* JADX WARN: Code duplicated, block: B:129:0x0488  */
    /* JADX WARN: Code duplicated, block: B:132:0x04a3 A[LOOP:1: B:130:0x049d->B:132:0x04a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:136:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:141:0x04f2 A[LOOP:0: B:139:0x04ec->B:141:0x04f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:144:0x0519  */
    /* JADX WARN: Code duplicated, block: B:146:0x051d  */
    /* JADX WARN: Code duplicated, block: B:148:0x0525  */
    /* JADX WARN: Code duplicated, block: B:151:0x0530  */
    /* JADX WARN: Code duplicated, block: B:159:0x0402 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x0405 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x0265 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x011f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:27:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:34:0x0113  */
    /* JADX WARN: Code duplicated, block: B:39:0x0141 A[LOOP:11: B:37:0x013b->B:39:0x0141, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x015b  */
    /* JADX WARN: Code duplicated, block: B:46:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:50:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:52:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:54:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:58:0x01fe A[LOOP:7: B:56:0x01f8->B:58:0x01fe, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x023a  */
    /* JADX WARN: Code duplicated, block: B:64:0x0253  */
    /* JADX WARN: Code duplicated, block: B:69:0x0270  */
    /* JADX WARN: Code duplicated, block: B:73:0x028d  */
    /* JADX WARN: Code duplicated, block: B:76:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:79:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code duplicated, block: B:80:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:83:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:85:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:89:0x02f6 A[LOOP:5: B:87:0x02f0->B:89:0x02f6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:93:0x035d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0375  */
    /* JADX INFO: renamed from: y */
    public final Object m7305y(String str, int i, int i2, int i3, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$fetchLippData$1 lessonRepositoryImpl$fetchLippData$1;
        int i4;
        NetworkResponse networkResponse;
        Throwable throwable;
        ResultLipp resultLipp;
        String strM8369a;
        LinkedHashMap linkedHashMap;
        Iterator it;
        AbstractC1320h abstractC1320h;
        String str2;
        int i5;
        int iIntValue;
        int iIntValue2;
        int i6;
        Object objM2861d;
        int i7;
        ResultLipp resultLipp2;
        Map map;
        int i8;
        int i9;
        Integer numM8389a;
        ArrayList arrayList;
        Iterator it2;
        ArrayList arrayList2;
        Iterator it3;
        CoroutineSingletons coroutineSingletons;
        AbstractC1320h abstractC1320h2;
        Map map2;
        ResultLipp resultLipp3;
        LessonSentenceEntity lessonSentenceEntityM7737a;
        List list;
        CoroutineSingletons coroutineSingletons2;
        int iM15363P;
        LinkedHashMap linkedHashMap2;
        Iterator it4;
        ArrayList arrayList3;
        Iterator it5;
        LessonTextToken lessonTextToken;
        Map map3;
        int i10;
        Map map4;
        int iM15363P2;
        LinkedHashMap linkedHashMap3;
        Object objM2861d2;
        ResultLipp resultLipp4;
        Map map5;
        Object obj;
        int i11;
        LinkedHashMap linkedHashMap4;
        Map map6;
        int iM15363P3;
        LinkedHashMap linkedHashMap5;
        ArrayList arrayList4;
        Iterator it6;
        Map map7;
        int iIntValue3;
        String str3;
        TranslationSentenceEntity translationSentenceEntity;
        Iterator it7;
        ArrayList arrayList5;
        TranslationSentenceEntity translationSentenceEntity2;
        LinkedHashMap linkedHashMap6;
        ArrayList arrayListM22624p1;
        Iterator it8;
        int i12;
        Translation translation;
        ArrayList arrayList6;
        ResultLipp resultLipp5;
        Map map8;
        ArrayList arrayList7;
        Map map9;
        String str4 = str;
        int i13 = i;
        int i14 = i2;
        if (continuationImpl instanceof LessonRepositoryImpl$fetchLippData$1) {
            lessonRepositoryImpl$fetchLippData$1 = (LessonRepositoryImpl$fetchLippData$1) continuationImpl;
            int i15 = lessonRepositoryImpl$fetchLippData$1.f15381H;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$fetchLippData$1.f15381H = i15 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$fetchLippData$1 = new LessonRepositoryImpl$fetchLippData$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$fetchLippData$1 = new LessonRepositoryImpl$fetchLippData$1(this, continuationImpl);
        }
        Object objM14897J = lessonRepositoryImpl$fetchLippData$1.f15392k;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i16 = lessonRepositoryImpl$fetchLippData$1.f15381H;
        AbstractC1320h abstractC1320h3 = this.f16498b;
        int i17 = 10;
        switch (i16) {
            case 0:
                AbstractC3193b.m15359b(objM14897J);
                RequestLipp requestLipp = new RequestLipp(i14, i3);
                lessonRepositoryImpl$fetchLippData$1.f15382a = str4;
                lessonRepositoryImpl$fetchLippData$1.f15387f = i13;
                lessonRepositoryImpl$fetchLippData$1.f15388g = i14;
                lessonRepositoryImpl$fetchLippData$1.f15389h = i3;
                lessonRepositoryImpl$fetchLippData$1.f15381H = 1;
                objM14897J = this.f16502f.m14897J(str4, i13, requestLipp, lessonRepositoryImpl$fetchLippData$1);
                if (objM14897J != coroutineSingletons3) {
                    i4 = i3;
                    networkResponse = (NetworkResponse) objM14897J;
                    if (networkResponse instanceof NetworkResponse.Success) {
                        if (networkResponse instanceof NetworkResponse.Error) {
                            gm5.m12750e();
                            return null;
                        }
                        throwable = ((NetworkResponse.Error) networkResponse).getThrowable();
                        if (throwable != null) {
                            throwable.printStackTrace();
                        }
                        return new um5(g25.f40076a);
                    }
                    resultLipp = (ResultLipp) ((NetworkResponse.Success) networkResponse).getData();
                    strM8369a = resultLipp.m8369a();
                    if (strM8369a != null) {
                        str4 = strM8369a;
                    }
                    linkedHashMap = new LinkedHashMap();
                    it = resultLipp.m8370b().iterator();
                    while (it.hasNext()) {
                        for (ResultSentence resultSentence : ((d98) it.next()).m10169a()) {
                            numM8389a = resultSentence.m8389a();
                            if (numM8389a != null) {
                                Integer num = new Integer(numM8389a.intValue());
                                List listM8390b = resultSentence.m8390b();
                                arrayList = new ArrayList(v91.m23189q0(listM8390b, 10));
                                it2 = listM8390b.iterator();
                                while (it2.hasNext()) {
                                    arrayList.add(huc.m13483a((ResultTextToken) it2.next()));
                                }
                                linkedHashMap.put(num, arrayList);
                            }
                        }
                    }
                    if (linkedHashMap.isEmpty()) {
                        int i18 = i13;
                        abstractC1320h = abstractC1320h3;
                        str2 = str4;
                        i5 = i18;
                        map3 = linkedHashMap;
                        if (resultLipp.m8371c().isEmpty()) {
                            i10 = i4;
                            map4 = map3;
                            map8 = map4;
                            if (!resultLipp.m8371c().isEmpty()) {
                                List<ResultLippSentenceTranslation> listM8371c = resultLipp.m8371c();
                                arrayList6 = new ArrayList(v91.m23189q0(listM8371c, 10));
                                for (ResultLippSentenceTranslation resultLippSentenceTranslation : listM8371c) {
                                    arrayList6.add(new j65(i5, resultLippSentenceTranslation.m8373b(), resultLippSentenceTranslation.m8372a()));
                                }
                                lessonRepositoryImpl$fetchLippData$1.f15382a = null;
                                lessonRepositoryImpl$fetchLippData$1.f15383b = resultLipp;
                                lessonRepositoryImpl$fetchLippData$1.f15384c = null;
                                lessonRepositoryImpl$fetchLippData$1.f15385d = map4;
                                lessonRepositoryImpl$fetchLippData$1.f15386e = null;
                                lessonRepositoryImpl$fetchLippData$1.f15387f = i5;
                                lessonRepositoryImpl$fetchLippData$1.f15388g = i14;
                                lessonRepositoryImpl$fetchLippData$1.f15389h = i10;
                                lessonRepositoryImpl$fetchLippData$1.f15381H = 6;
                                if (abstractC1320h.mo7498O0(arrayList6, lessonRepositoryImpl$fetchLippData$1) != coroutineSingletons3) {
                                    resultLipp5 = resultLipp;
                                    map9 = map4;
                                    resultLipp = resultLipp5;
                                    map8 = map9;
                                }
                            }
                            List<ResultLippSentenceTranslation> listM8371c2 = resultLipp.m8371c();
                            arrayList7 = new ArrayList(v91.m23189q0(listM8371c2, 10));
                            for (ResultLippSentenceTranslation resultLippSentenceTranslation2 : listM8371c2) {
                                arrayList7.add(new Pair(new Integer(resultLippSentenceTranslation2.m8372a()), resultLippSentenceTranslation2.m8373b()));
                            }
                            return new xm5(new oe5(map8, arrayList7));
                        }
                        List<ResultLippSentenceTranslation> listM8371c3 = resultLipp.m8371c();
                        iM15363P2 = AbstractC3194a.m15363P(v91.m23189q0(listM8371c3, 10));
                        if (iM15363P2 < 16) {
                            iM15363P2 = 16;
                        }
                        linkedHashMap3 = new LinkedHashMap(iM15363P2);
                        for (ResultLippSentenceTranslation resultLippSentenceTranslation3 : listM8371c3) {
                            linkedHashMap3.put(new Integer(resultLippSentenceTranslation3.m8372a()), resultLippSentenceTranslation3.m8373b());
                        }
                        List listM22622n1 = u91.m22622n1(linkedHashMap3.keySet());
                        lessonRepositoryImpl$fetchLippData$1.f15382a = null;
                        lessonRepositoryImpl$fetchLippData$1.f15383b = resultLipp;
                        lessonRepositoryImpl$fetchLippData$1.f15384c = str2;
                        lessonRepositoryImpl$fetchLippData$1.f15385d = map3;
                        lessonRepositoryImpl$fetchLippData$1.f15386e = linkedHashMap3;
                        lessonRepositoryImpl$fetchLippData$1.f15387f = i5;
                        lessonRepositoryImpl$fetchLippData$1.f15388g = i14;
                        lessonRepositoryImpl$fetchLippData$1.f15389h = i4;
                        lessonRepositoryImpl$fetchLippData$1.f15381H = 4;
                        q05 q05Var = (q05) abstractC1320h;
                        q05Var.getClass();
                        StringBuilder sb = new StringBuilder();
                        sb.append("SELECT * FROM TranslationSentenceEntity WHERE lessonId = ? AND `index` IN (");
                        d32.m10005B(listM22622n1.size(), sb);
                        sb.append(")");
                        objM2861d2 = AbstractC0758a.m2861d(new k05(sb.toString(), i5, listM22622n1, q05Var, 0), q05Var.f57071K, lessonRepositoryImpl$fetchLippData$1, true, false);
                        if (objM2861d2 != coroutineSingletons3) {
                            Map map10 = map3;
                            resultLipp4 = resultLipp;
                            map5 = map10;
                            obj = objM2861d2;
                            i11 = i14;
                            linkedHashMap4 = linkedHashMap3;
                            List list2 = (List) obj;
                            iM15363P3 = AbstractC3194a.m15363P(v91.m23189q0(list2, 10));
                            if (iM15363P3 < 16) {
                                iM15363P3 = 16;
                            }
                            linkedHashMap5 = new LinkedHashMap(iM15363P3);
                            for (Object obj2 : list2) {
                                linkedHashMap5.put(new Integer(((TranslationSentenceEntity) obj2).m7816d()), obj2);
                            }
                            arrayList4 = new ArrayList(linkedHashMap4.size());
                            it6 = linkedHashMap4.entrySet().iterator();
                            while (it6.hasNext()) {
                                Map.Entry entry = (Map.Entry) it6.next();
                                iIntValue3 = ((Number) entry.getKey()).intValue();
                                str3 = (String) entry.getValue();
                                translationSentenceEntity = (TranslationSentenceEntity) linkedHashMap5.get(new Integer(iIntValue3));
                                if (translationSentenceEntity != null) {
                                    arrayListM22624p1 = u91.m22624p1(translationSentenceEntity.m7820h());
                                    it8 = arrayListM22624p1.iterator();
                                    i12 = 0;
                                    while (true) {
                                        if (it8.hasNext()) {
                                            it7 = it6;
                                            if (fa4.m11650l(((Translation) it8.next()).m8078a(), str2)) {
                                                i12++;
                                                it6 = it7;
                                            }
                                        } else {
                                            it7 = it6;
                                            i12 = -1;
                                        }
                                    }
                                    translation = new Translation(str3, str2, false);
                                    if (i12 >= 0) {
                                        arrayListM22624p1.set(i12, translation);
                                    } else {
                                        arrayListM22624p1.add(translation);
                                    }
                                    ArrayList arrayList8 = arrayList4;
                                    translationSentenceEntity2 = TranslationSentenceEntity.m7813a(translationSentenceEntity, null, null, null, arrayListM22624p1, null, 95);
                                    arrayList5 = arrayList8;
                                    linkedHashMap6 = linkedHashMap5;
                                } else {
                                    it7 = it6;
                                    arrayList5 = arrayList4;
                                    linkedHashMap6 = linkedHashMap5;
                                    translationSentenceEntity2 = new TranslationSentenceEntity(iIntValue3, i5, null, null, "", vz1.m23604J(new Translation(str3, str2, false)));
                                }
                                arrayList5.add(translationSentenceEntity2);
                                arrayList4 = arrayList5;
                                linkedHashMap5 = linkedHashMap6;
                                it6 = it7;
                            }
                            lessonRepositoryImpl$fetchLippData$1.f15382a = null;
                            lessonRepositoryImpl$fetchLippData$1.f15383b = resultLipp4;
                            lessonRepositoryImpl$fetchLippData$1.f15384c = null;
                            lessonRepositoryImpl$fetchLippData$1.f15385d = map5;
                            lessonRepositoryImpl$fetchLippData$1.f15386e = null;
                            lessonRepositoryImpl$fetchLippData$1.f15387f = i5;
                            lessonRepositoryImpl$fetchLippData$1.f15388g = i11;
                            lessonRepositoryImpl$fetchLippData$1.f15389h = i4;
                            lessonRepositoryImpl$fetchLippData$1.f15381H = 5;
                            if (abstractC1320h.mo7496M0(arrayList4, lessonRepositoryImpl$fetchLippData$1) != coroutineSingletons3) {
                                map7 = map5;
                                resultLipp = resultLipp4;
                                int i19 = i11;
                                i10 = i4;
                                map4 = map7;
                                i14 = i19;
                                map8 = map4;
                                if (!resultLipp.m8371c().isEmpty()) {
                                    List<ResultLippSentenceTranslation> listM8371c4 = resultLipp.m8371c();
                                    arrayList6 = new ArrayList(v91.m23189q0(listM8371c4, 10));
                                    while (r5.hasNext()) {
                                        arrayList6.add(new j65(i5, resultLippSentenceTranslation.m8373b(), resultLippSentenceTranslation.m8372a()));
                                    }
                                    lessonRepositoryImpl$fetchLippData$1.f15382a = null;
                                    lessonRepositoryImpl$fetchLippData$1.f15383b = resultLipp;
                                    lessonRepositoryImpl$fetchLippData$1.f15384c = null;
                                    lessonRepositoryImpl$fetchLippData$1.f15385d = map4;
                                    lessonRepositoryImpl$fetchLippData$1.f15386e = null;
                                    lessonRepositoryImpl$fetchLippData$1.f15387f = i5;
                                    lessonRepositoryImpl$fetchLippData$1.f15388g = i14;
                                    lessonRepositoryImpl$fetchLippData$1.f15389h = i10;
                                    lessonRepositoryImpl$fetchLippData$1.f15381H = 6;
                                    if (abstractC1320h.mo7498O0(arrayList6, lessonRepositoryImpl$fetchLippData$1) != coroutineSingletons3) {
                                        resultLipp5 = resultLipp;
                                        map9 = map4;
                                        resultLipp = resultLipp5;
                                        map8 = map9;
                                    }
                                }
                                List<ResultLippSentenceTranslation> listM8371c5 = resultLipp.m8371c();
                                arrayList7 = new ArrayList(v91.m23189q0(listM8371c5, 10));
                                while (r1.hasNext()) {
                                    arrayList7.add(new Pair(new Integer(resultLippSentenceTranslation2.m8372a()), resultLippSentenceTranslation2.m8373b()));
                                }
                                return new xm5(new oe5(map8, arrayList7));
                            }
                        }
                    } else {
                        Set setKeySet = linkedHashMap.keySet();
                        iIntValue = ((Number) u91.m22601S0(setKeySet)).intValue();
                        iIntValue2 = ((Number) u91.m22600R0(setKeySet)).intValue();
                        lessonRepositoryImpl$fetchLippData$1.f15382a = null;
                        lessonRepositoryImpl$fetchLippData$1.f15383b = resultLipp;
                        lessonRepositoryImpl$fetchLippData$1.f15384c = str4;
                        lessonRepositoryImpl$fetchLippData$1.f15385d = linkedHashMap;
                        lessonRepositoryImpl$fetchLippData$1.f15386e = null;
                        lessonRepositoryImpl$fetchLippData$1.f15387f = i13;
                        lessonRepositoryImpl$fetchLippData$1.f15388g = i14;
                        lessonRepositoryImpl$fetchLippData$1.f15389h = i4;
                        lessonRepositoryImpl$fetchLippData$1.f15390i = iIntValue;
                        lessonRepositoryImpl$fetchLippData$1.f15391j = iIntValue2;
                        lessonRepositoryImpl$fetchLippData$1.f15381H = 2;
                        q05 q05Var2 = (q05) abstractC1320h3;
                        i6 = i13;
                        objM2861d = AbstractC0758a.m2861d(new j05(i6, iIntValue, iIntValue2 + 1, q05Var2, 1), q05Var2.f57071K, lessonRepositoryImpl$fetchLippData$1, true, false);
                        if (objM2861d != coroutineSingletons3) {
                            str2 = str4;
                            i7 = i14;
                            resultLipp2 = resultLipp;
                            map = linkedHashMap;
                            objM14897J = objM2861d;
                            i8 = i6;
                            i9 = iIntValue;
                            List list3 = (List) objM14897J;
                            arrayList2 = new ArrayList(v91.m23189q0(list3, 10));
                            it3 = list3.iterator();
                            while (it3.hasNext()) {
                                lessonSentenceEntityM7737a = (LessonSentenceEntity) it3.next();
                                list = (List) e65.m10872d(lessonSentenceEntityM7737a.m7738b(), map);
                                if (list != null) {
                                    List list4 = list;
                                    iM15363P = AbstractC3194a.m15363P(v91.m23189q0(list4, i17));
                                    if (iM15363P < 16) {
                                        iM15363P = 16;
                                    }
                                    linkedHashMap2 = new LinkedHashMap(iM15363P);
                                    it4 = list4.iterator();
                                    while (it4.hasNext()) {
                                        Object next = it4.next();
                                        linkedHashMap2.put(new Integer(((LessonTextToken) next).m8066b()), next);
                                        it4 = it4;
                                        coroutineSingletons3 = coroutineSingletons3;
                                    }
                                    coroutineSingletons2 = coroutineSingletons3;
                                    List listM7745i = lessonSentenceEntityM7737a.m7745i();
                                    arrayList3 = new ArrayList(v91.m23189q0(listM7745i, 10));
                                    it5 = listM7745i.iterator();
                                    while (it5.hasNext()) {
                                        LessonTextToken lessonTextTokenM8065a = (LessonTextToken) it5.next();
                                        Iterator it9 = it5;
                                        lessonTextToken = (LessonTextToken) linkedHashMap2.get(new Integer(lessonTextTokenM8065a.m8066b()));
                                        if (lessonTextToken == null && !lessonTextToken.m8067c().isEmpty()) {
                                            lessonTextTokenM8065a = LessonTextToken.m8065a(lessonTextTokenM8065a, lessonTextToken.m8067c());
                                        }
                                        arrayList3.add(lessonTextTokenM8065a);
                                        it5 = it9;
                                    }
                                    lessonSentenceEntityM7737a = LessonSentenceEntity.m7737a(lessonSentenceEntityM7737a, arrayList3);
                                } else {
                                    coroutineSingletons2 = coroutineSingletons3;
                                }
                                arrayList2.add(lessonSentenceEntityM7737a);
                                it3 = it3;
                                coroutineSingletons3 = coroutineSingletons2;
                                abstractC1320h3 = abstractC1320h3;
                                i17 = 10;
                            }
                            coroutineSingletons = coroutineSingletons3;
                            abstractC1320h2 = abstractC1320h3;
                            if (arrayList2.isEmpty()) {
                                coroutineSingletons3 = coroutineSingletons;
                                abstractC1320h = abstractC1320h2;
                                map2 = map;
                                i5 = i8;
                                resultLipp = resultLipp2;
                                i14 = i7;
                                map3 = map2;
                                if (resultLipp.m8371c().isEmpty()) {
                                    i10 = i4;
                                    map4 = map3;
                                    map8 = map4;
                                    if (!resultLipp.m8371c().isEmpty()) {
                                        List<ResultLippSentenceTranslation> listM8371c6 = resultLipp.m8371c();
                                        arrayList6 = new ArrayList(v91.m23189q0(listM8371c6, 10));
                                        while (r5.hasNext()) {
                                            arrayList6.add(new j65(i5, resultLippSentenceTranslation.m8373b(), resultLippSentenceTranslation.m8372a()));
                                        }
                                        lessonRepositoryImpl$fetchLippData$1.f15382a = null;
                                        lessonRepositoryImpl$fetchLippData$1.f15383b = resultLipp;
                                        lessonRepositoryImpl$fetchLippData$1.f15384c = null;
                                        lessonRepositoryImpl$fetchLippData$1.f15385d = map4;
                                        lessonRepositoryImpl$fetchLippData$1.f15386e = null;
                                        lessonRepositoryImpl$fetchLippData$1.f15387f = i5;
                                        lessonRepositoryImpl$fetchLippData$1.f15388g = i14;
                                        lessonRepositoryImpl$fetchLippData$1.f15389h = i10;
                                        lessonRepositoryImpl$fetchLippData$1.f15381H = 6;
                                        if (abstractC1320h.mo7498O0(arrayList6, lessonRepositoryImpl$fetchLippData$1) != coroutineSingletons3) {
                                            resultLipp5 = resultLipp;
                                            map9 = map4;
                                            resultLipp = resultLipp5;
                                            map8 = map9;
                                        }
                                    }
                                    List<ResultLippSentenceTranslation> listM8371c7 = resultLipp.m8371c();
                                    arrayList7 = new ArrayList(v91.m23189q0(listM8371c7, 10));
                                    while (r1.hasNext()) {
                                        arrayList7.add(new Pair(new Integer(resultLippSentenceTranslation2.m8372a()), resultLippSentenceTranslation2.m8373b()));
                                    }
                                    return new xm5(new oe5(map8, arrayList7));
                                }
                                List<ResultLippSentenceTranslation> listM8371c8 = resultLipp.m8371c();
                                iM15363P2 = AbstractC3194a.m15363P(v91.m23189q0(listM8371c8, 10));
                                if (iM15363P2 < 16) {
                                    iM15363P2 = 16;
                                }
                                linkedHashMap3 = new LinkedHashMap(iM15363P2);
                                while (r1.hasNext()) {
                                    linkedHashMap3.put(new Integer(resultLippSentenceTranslation3.m8372a()), resultLippSentenceTranslation3.m8373b());
                                }
                                List listM22622n2 = u91.m22622n1(linkedHashMap3.keySet());
                                lessonRepositoryImpl$fetchLippData$1.f15382a = null;
                                lessonRepositoryImpl$fetchLippData$1.f15383b = resultLipp;
                                lessonRepositoryImpl$fetchLippData$1.f15384c = str2;
                                lessonRepositoryImpl$fetchLippData$1.f15385d = map3;
                                lessonRepositoryImpl$fetchLippData$1.f15386e = linkedHashMap3;
                                lessonRepositoryImpl$fetchLippData$1.f15387f = i5;
                                lessonRepositoryImpl$fetchLippData$1.f15388g = i14;
                                lessonRepositoryImpl$fetchLippData$1.f15389h = i4;
                                lessonRepositoryImpl$fetchLippData$1.f15381H = 4;
                                q05 q05Var3 = (q05) abstractC1320h;
                                q05Var3.getClass();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("SELECT * FROM TranslationSentenceEntity WHERE lessonId = ? AND `index` IN (");
                                d32.m10005B(listM22622n2.size(), sb2);
                                sb2.append(")");
                                objM2861d2 = AbstractC0758a.m2861d(new k05(sb2.toString(), i5, listM22622n2, q05Var3, 0), q05Var3.f57071K, lessonRepositoryImpl$fetchLippData$1, true, false);
                                if (objM2861d2 != coroutineSingletons3) {
                                    Map map11 = map3;
                                    resultLipp4 = resultLipp;
                                    map5 = map11;
                                    obj = objM2861d2;
                                    i11 = i14;
                                    linkedHashMap4 = linkedHashMap3;
                                    List list5 = (List) obj;
                                    iM15363P3 = AbstractC3194a.m15363P(v91.m23189q0(list5, 10));
                                    if (iM15363P3 < 16) {
                                        iM15363P3 = 16;
                                    }
                                    linkedHashMap5 = new LinkedHashMap(iM15363P3);
                                    while (r8.hasNext()) {
                                        linkedHashMap5.put(new Integer(((TranslationSentenceEntity) obj2).m7816d()), obj2);
                                    }
                                    arrayList4 = new ArrayList(linkedHashMap4.size());
                                    it6 = linkedHashMap4.entrySet().iterator();
                                    while (it6.hasNext()) {
                                        Map.Entry entry2 = (Map.Entry) it6.next();
                                        iIntValue3 = ((Number) entry2.getKey()).intValue();
                                        str3 = (String) entry2.getValue();
                                        translationSentenceEntity = (TranslationSentenceEntity) linkedHashMap5.get(new Integer(iIntValue3));
                                        if (translationSentenceEntity != null) {
                                            arrayListM22624p1 = u91.m22624p1(translationSentenceEntity.m7820h());
                                            it8 = arrayListM22624p1.iterator();
                                            i12 = 0;
                                            while (true) {
                                                if (it8.hasNext()) {
                                                    it7 = it6;
                                                    if (fa4.m11650l(((Translation) it8.next()).m8078a(), str2)) {
                                                        i12++;
                                                        it6 = it7;
                                                    }
                                                } else {
                                                    it7 = it6;
                                                    i12 = -1;
                                                }
                                            }
                                            translation = new Translation(str3, str2, false);
                                            if (i12 >= 0) {
                                                arrayListM22624p1.set(i12, translation);
                                            } else {
                                                arrayListM22624p1.add(translation);
                                            }
                                            ArrayList arrayList9 = arrayList4;
                                            translationSentenceEntity2 = TranslationSentenceEntity.m7813a(translationSentenceEntity, null, null, null, arrayListM22624p1, null, 95);
                                            arrayList5 = arrayList9;
                                            linkedHashMap6 = linkedHashMap5;
                                        } else {
                                            it7 = it6;
                                            arrayList5 = arrayList4;
                                            linkedHashMap6 = linkedHashMap5;
                                            translationSentenceEntity2 = new TranslationSentenceEntity(iIntValue3, i5, null, null, "", vz1.m23604J(new Translation(str3, str2, false)));
                                        }
                                        arrayList5.add(translationSentenceEntity2);
                                        arrayList4 = arrayList5;
                                        linkedHashMap5 = linkedHashMap6;
                                        it6 = it7;
                                    }
                                    lessonRepositoryImpl$fetchLippData$1.f15382a = null;
                                    lessonRepositoryImpl$fetchLippData$1.f15383b = resultLipp4;
                                    lessonRepositoryImpl$fetchLippData$1.f15384c = null;
                                    lessonRepositoryImpl$fetchLippData$1.f15385d = map5;
                                    lessonRepositoryImpl$fetchLippData$1.f15386e = null;
                                    lessonRepositoryImpl$fetchLippData$1.f15387f = i5;
                                    lessonRepositoryImpl$fetchLippData$1.f15388g = i11;
                                    lessonRepositoryImpl$fetchLippData$1.f15389h = i4;
                                    lessonRepositoryImpl$fetchLippData$1.f15381H = 5;
                                    if (abstractC1320h.mo7496M0(arrayList4, lessonRepositoryImpl$fetchLippData$1) != coroutineSingletons3) {
                                        map7 = map5;
                                        resultLipp = resultLipp4;
                                        int i110 = i11;
                                        i10 = i4;
                                        map4 = map7;
                                        i14 = i110;
                                        map8 = map4;
                                        if (!resultLipp.m8371c().isEmpty()) {
                                            List<ResultLippSentenceTranslation> listM8371c9 = resultLipp.m8371c();
                                            arrayList6 = new ArrayList(v91.m23189q0(listM8371c9, 10));
                                            while (r5.hasNext()) {
                                                arrayList6.add(new j65(i5, resultLippSentenceTranslation.m8373b(), resultLippSentenceTranslation.m8372a()));
                                            }
                                            lessonRepositoryImpl$fetchLippData$1.f15382a = null;
                                            lessonRepositoryImpl$fetchLippData$1.f15383b = resultLipp;
                                            lessonRepositoryImpl$fetchLippData$1.f15384c = null;
                                            lessonRepositoryImpl$fetchLippData$1.f15385d = map4;
                                            lessonRepositoryImpl$fetchLippData$1.f15386e = null;
                                            lessonRepositoryImpl$fetchLippData$1.f15387f = i5;
                                            lessonRepositoryImpl$fetchLippData$1.f15388g = i14;
                                            lessonRepositoryImpl$fetchLippData$1.f15389h = i10;
                                            lessonRepositoryImpl$fetchLippData$1.f15381H = 6;
                                            if (abstractC1320h.mo7498O0(arrayList6, lessonRepositoryImpl$fetchLippData$1) != coroutineSingletons3) {
                                                resultLipp5 = resultLipp;
                                                map9 = map4;
                                                resultLipp = resultLipp5;
                                                map8 = map9;
                                            }
                                        }
                                        List<ResultLippSentenceTranslation> listM8371c10 = resultLipp.m8371c();
                                        arrayList7 = new ArrayList(v91.m23189q0(listM8371c10, 10));
                                        while (r1.hasNext()) {
                                            arrayList7.add(new Pair(new Integer(resultLippSentenceTranslation2.m8372a()), resultLippSentenceTranslation2.m8373b()));
                                        }
                                        return new xm5(new oe5(map8, arrayList7));
                                    }
                                }
                            } else {
                                lessonRepositoryImpl$fetchLippData$1.f15382a = null;
                                lessonRepositoryImpl$fetchLippData$1.f15383b = resultLipp2;
                                lessonRepositoryImpl$fetchLippData$1.f15384c = str2;
                                lessonRepositoryImpl$fetchLippData$1.f15385d = map;
                                lessonRepositoryImpl$fetchLippData$1.f15386e = null;
                                lessonRepositoryImpl$fetchLippData$1.f15387f = i8;
                                lessonRepositoryImpl$fetchLippData$1.f15388g = i7;
                                lessonRepositoryImpl$fetchLippData$1.f15389h = i4;
                                lessonRepositoryImpl$fetchLippData$1.f15390i = i9;
                                lessonRepositoryImpl$fetchLippData$1.f15391j = iIntValue2;
                                lessonRepositoryImpl$fetchLippData$1.f15381H = 3;
                                abstractC1320h = abstractC1320h2;
                                coroutineSingletons3 = coroutineSingletons;
                                if (abstractC1320h.mo7490G0(arrayList2, lessonRepositoryImpl$fetchLippData$1) != coroutineSingletons3) {
                                    resultLipp3 = resultLipp2;
                                    map6 = map;
                                    map2 = map6;
                                    i5 = i8;
                                    resultLipp = resultLipp3;
                                    i14 = i7;
                                    map3 = map2;
                                    if (resultLipp.m8371c().isEmpty()) {
                                        i10 = i4;
                                        map4 = map3;
                                        map8 = map4;
                                        if (!resultLipp.m8371c().isEmpty()) {
                                            List<ResultLippSentenceTranslation> listM8371c11 = resultLipp.m8371c();
                                            arrayList6 = new ArrayList(v91.m23189q0(listM8371c11, 10));
                                            while (r5.hasNext()) {
                                                arrayList6.add(new j65(i5, resultLippSentenceTranslation.m8373b(), resultLippSentenceTranslation.m8372a()));
                                            }
                                            lessonRepositoryImpl$fetchLippData$1.f15382a = null;
                                            lessonRepositoryImpl$fetchLippData$1.f15383b = resultLipp;
                                            lessonRepositoryImpl$fetchLippData$1.f15384c = null;
                                            lessonRepositoryImpl$fetchLippData$1.f15385d = map4;
                                            lessonRepositoryImpl$fetchLippData$1.f15386e = null;
                                            lessonRepositoryImpl$fetchLippData$1.f15387f = i5;
                                            lessonRepositoryImpl$fetchLippData$1.f15388g = i14;
                                            lessonRepositoryImpl$fetchLippData$1.f15389h = i10;
                                            lessonRepositoryImpl$fetchLippData$1.f15381H = 6;
                                            if (abstractC1320h.mo7498O0(arrayList6, lessonRepositoryImpl$fetchLippData$1) != coroutineSingletons3) {
                                                resultLipp5 = resultLipp;
                                                map9 = map4;
                                                resultLipp = resultLipp5;
                                                map8 = map9;
                                            }
                                        }
                                        List<ResultLippSentenceTranslation> listM8371c12 = resultLipp.m8371c();
                                        arrayList7 = new ArrayList(v91.m23189q0(listM8371c12, 10));
                                        while (r1.hasNext()) {
                                            arrayList7.add(new Pair(new Integer(resultLippSentenceTranslation2.m8372a()), resultLippSentenceTranslation2.m8373b()));
                                        }
                                        return new xm5(new oe5(map8, arrayList7));
                                    }
                                    List<ResultLippSentenceTranslation> listM8371c13 = resultLipp.m8371c();
                                    iM15363P2 = AbstractC3194a.m15363P(v91.m23189q0(listM8371c13, 10));
                                    if (iM15363P2 < 16) {
                                        iM15363P2 = 16;
                                    }
                                    linkedHashMap3 = new LinkedHashMap(iM15363P2);
                                    while (r1.hasNext()) {
                                        linkedHashMap3.put(new Integer(resultLippSentenceTranslation3.m8372a()), resultLippSentenceTranslation3.m8373b());
                                    }
                                    List listM22622n3 = u91.m22622n1(linkedHashMap3.keySet());
                                    lessonRepositoryImpl$fetchLippData$1.f15382a = null;
                                    lessonRepositoryImpl$fetchLippData$1.f15383b = resultLipp;
                                    lessonRepositoryImpl$fetchLippData$1.f15384c = str2;
                                    lessonRepositoryImpl$fetchLippData$1.f15385d = map3;
                                    lessonRepositoryImpl$fetchLippData$1.f15386e = linkedHashMap3;
                                    lessonRepositoryImpl$fetchLippData$1.f15387f = i5;
                                    lessonRepositoryImpl$fetchLippData$1.f15388g = i14;
                                    lessonRepositoryImpl$fetchLippData$1.f15389h = i4;
                                    lessonRepositoryImpl$fetchLippData$1.f15381H = 4;
                                    q05 q05Var4 = (q05) abstractC1320h;
                                    q05Var4.getClass();
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("SELECT * FROM TranslationSentenceEntity WHERE lessonId = ? AND `index` IN (");
                                    d32.m10005B(listM22622n3.size(), sb3);
                                    sb3.append(")");
                                    objM2861d2 = AbstractC0758a.m2861d(new k05(sb3.toString(), i5, listM22622n3, q05Var4, 0), q05Var4.f57071K, lessonRepositoryImpl$fetchLippData$1, true, false);
                                    if (objM2861d2 != coroutineSingletons3) {
                                        Map map12 = map3;
                                        resultLipp4 = resultLipp;
                                        map5 = map12;
                                        obj = objM2861d2;
                                        i11 = i14;
                                        linkedHashMap4 = linkedHashMap3;
                                        List list6 = (List) obj;
                                        iM15363P3 = AbstractC3194a.m15363P(v91.m23189q0(list6, 10));
                                        if (iM15363P3 < 16) {
                                            iM15363P3 = 16;
                                        }
                                        linkedHashMap5 = new LinkedHashMap(iM15363P3);
                                        while (r8.hasNext()) {
                                            linkedHashMap5.put(new Integer(((TranslationSentenceEntity) obj2).m7816d()), obj2);
                                        }
                                        arrayList4 = new ArrayList(linkedHashMap4.size());
                                        it6 = linkedHashMap4.entrySet().iterator();
                                        while (it6.hasNext()) {
                                            Map.Entry entry3 = (Map.Entry) it6.next();
                                            iIntValue3 = ((Number) entry3.getKey()).intValue();
                                            str3 = (String) entry3.getValue();
                                            translationSentenceEntity = (TranslationSentenceEntity) linkedHashMap5.get(new Integer(iIntValue3));
                                            if (translationSentenceEntity != null) {
                                                arrayListM22624p1 = u91.m22624p1(translationSentenceEntity.m7820h());
                                                it8 = arrayListM22624p1.iterator();
                                                i12 = 0;
                                                while (true) {
                                                    if (it8.hasNext()) {
                                                        it7 = it6;
                                                        if (fa4.m11650l(((Translation) it8.next()).m8078a(), str2)) {
                                                            i12++;
                                                            it6 = it7;
                                                        }
                                                    } else {
                                                        it7 = it6;
                                                        i12 = -1;
                                                    }
                                                }
                                                translation = new Translation(str3, str2, false);
                                                if (i12 >= 0) {
                                                    arrayListM22624p1.set(i12, translation);
                                                } else {
                                                    arrayListM22624p1.add(translation);
                                                }
                                                ArrayList arrayList10 = arrayList4;
                                                translationSentenceEntity2 = TranslationSentenceEntity.m7813a(translationSentenceEntity, null, null, null, arrayListM22624p1, null, 95);
                                                arrayList5 = arrayList10;
                                                linkedHashMap6 = linkedHashMap5;
                                            } else {
                                                it7 = it6;
                                                arrayList5 = arrayList4;
                                                linkedHashMap6 = linkedHashMap5;
                                                translationSentenceEntity2 = new TranslationSentenceEntity(iIntValue3, i5, null, null, "", vz1.m23604J(new Translation(str3, str2, false)));
                                            }
                                            arrayList5.add(translationSentenceEntity2);
                                            arrayList4 = arrayList5;
                                            linkedHashMap5 = linkedHashMap6;
                                            it6 = it7;
                                        }
                                        lessonRepositoryImpl$fetchLippData$1.f15382a = null;
                                        lessonRepositoryImpl$fetchLippData$1.f15383b = resultLipp4;
                                        lessonRepositoryImpl$fetchLippData$1.f15384c = null;
                                        lessonRepositoryImpl$fetchLippData$1.f15385d = map5;
                                        lessonRepositoryImpl$fetchLippData$1.f15386e = null;
                                        lessonRepositoryImpl$fetchLippData$1.f15387f = i5;
                                        lessonRepositoryImpl$fetchLippData$1.f15388g = i11;
                                        lessonRepositoryImpl$fetchLippData$1.f15389h = i4;
                                        lessonRepositoryImpl$fetchLippData$1.f15381H = 5;
                                        if (abstractC1320h.mo7496M0(arrayList4, lessonRepositoryImpl$fetchLippData$1) != coroutineSingletons3) {
                                            map7 = map5;
                                            resultLipp = resultLipp4;
                                            int i111 = i11;
                                            i10 = i4;
                                            map4 = map7;
                                            i14 = i111;
                                            map8 = map4;
                                            if (!resultLipp.m8371c().isEmpty()) {
                                                List<ResultLippSentenceTranslation> listM8371c14 = resultLipp.m8371c();
                                                arrayList6 = new ArrayList(v91.m23189q0(listM8371c14, 10));
                                                while (r5.hasNext()) {
                                                    arrayList6.add(new j65(i5, resultLippSentenceTranslation.m8373b(), resultLippSentenceTranslation.m8372a()));
                                                }
                                                lessonRepositoryImpl$fetchLippData$1.f15382a = null;
                                                lessonRepositoryImpl$fetchLippData$1.f15383b = resultLipp;
                                                lessonRepositoryImpl$fetchLippData$1.f15384c = null;
                                                lessonRepositoryImpl$fetchLippData$1.f15385d = map4;
                                                lessonRepositoryImpl$fetchLippData$1.f15386e = null;
                                                lessonRepositoryImpl$fetchLippData$1.f15387f = i5;
                                                lessonRepositoryImpl$fetchLippData$1.f15388g = i14;
                                                lessonRepositoryImpl$fetchLippData$1.f15389h = i10;
                                                lessonRepositoryImpl$fetchLippData$1.f15381H = 6;
                                                if (abstractC1320h.mo7498O0(arrayList6, lessonRepositoryImpl$fetchLippData$1) != coroutineSingletons3) {
                                                    resultLipp5 = resultLipp;
                                                    map9 = map4;
                                                    resultLipp = resultLipp5;
                                                    map8 = map9;
                                                }
                                            }
                                            List<ResultLippSentenceTranslation> listM8371c15 = resultLipp.m8371c();
                                            arrayList7 = new ArrayList(v91.m23189q0(listM8371c15, 10));
                                            while (r1.hasNext()) {
                                                arrayList7.add(new Pair(new Integer(resultLippSentenceTranslation2.m8372a()), resultLippSentenceTranslation2.m8373b()));
                                            }
                                            return new xm5(new oe5(map8, arrayList7));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons3;
            case 1:
                i4 = lessonRepositoryImpl$fetchLippData$1.f15389h;
                int i20 = lessonRepositoryImpl$fetchLippData$1.f15388g;
                i13 = lessonRepositoryImpl$fetchLippData$1.f15387f;
                String str5 = lessonRepositoryImpl$fetchLippData$1.f15382a;
                AbstractC3193b.m15359b(objM14897J);
                i14 = i20;
                str4 = str5;
                networkResponse = (NetworkResponse) objM14897J;
                if (networkResponse instanceof NetworkResponse.Success) {
                    if (networkResponse instanceof NetworkResponse.Error) {
                        gm5.m12750e();
                        return null;
                    }
                    throwable = ((NetworkResponse.Error) networkResponse).getThrowable();
                    if (throwable != null) {
                        throwable.printStackTrace();
                    }
                    return new um5(g25.f40076a);
                }
                resultLipp = (ResultLipp) ((NetworkResponse.Success) networkResponse).getData();
                strM8369a = resultLipp.m8369a();
                if (strM8369a != null) {
                    str4 = strM8369a;
                }
                linkedHashMap = new LinkedHashMap();
                it = resultLipp.m8370b().iterator();
                while (it.hasNext()) {
                    while (r9.hasNext()) {
                        numM8389a = resultSentence.m8389a();
                        if (numM8389a != null) {
                            Integer num2 = new Integer(numM8389a.intValue());
                            List listM8390b2 = resultSentence.m8390b();
                            arrayList = new ArrayList(v91.m23189q0(listM8390b2, 10));
                            it2 = listM8390b2.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(huc.m13483a((ResultTextToken) it2.next()));
                            }
                            linkedHashMap.put(num2, arrayList);
                        }
                    }
                }
                if (linkedHashMap.isEmpty()) {
                    Set setKeySet2 = linkedHashMap.keySet();
                    iIntValue = ((Number) u91.m22601S0(setKeySet2)).intValue();
                    iIntValue2 = ((Number) u91.m22600R0(setKeySet2)).intValue();
                    lessonRepositoryImpl$fetchLippData$1.f15382a = null;
                    lessonRepositoryImpl$fetchLippData$1.f15383b = resultLipp;
                    lessonRepositoryImpl$fetchLippData$1.f15384c = str4;
                    lessonRepositoryImpl$fetchLippData$1.f15385d = linkedHashMap;
                    lessonRepositoryImpl$fetchLippData$1.f15386e = null;
                    lessonRepositoryImpl$fetchLippData$1.f15387f = i13;
                    lessonRepositoryImpl$fetchLippData$1.f15388g = i14;
                    lessonRepositoryImpl$fetchLippData$1.f15389h = i4;
                    lessonRepositoryImpl$fetchLippData$1.f15390i = iIntValue;
                    lessonRepositoryImpl$fetchLippData$1.f15391j = iIntValue2;
                    lessonRepositoryImpl$fetchLippData$1.f15381H = 2;
                    q05 q05Var5 = (q05) abstractC1320h3;
                    i6 = i13;
                    objM2861d = AbstractC0758a.m2861d(new j05(i6, iIntValue, iIntValue2 + 1, q05Var5, 1), q05Var5.f57071K, lessonRepositoryImpl$fetchLippData$1, true, false);
                    if (objM2861d != coroutineSingletons3) {
                        str2 = str4;
                        i7 = i14;
                        resultLipp2 = resultLipp;
                        map = linkedHashMap;
                        objM14897J = objM2861d;
                        i8 = i6;
                        i9 = iIntValue;
                        List list7 = (List) objM14897J;
                        arrayList2 = new ArrayList(v91.m23189q0(list7, 10));
                        it3 = list7.iterator();
                        while (it3.hasNext()) {
                            lessonSentenceEntityM7737a = (LessonSentenceEntity) it3.next();
                            list = (List) e65.m10872d(lessonSentenceEntityM7737a.m7738b(), map);
                            if (list != null) {
                                List list8 = list;
                                iM15363P = AbstractC3194a.m15363P(v91.m23189q0(list8, i17));
                                if (iM15363P < 16) {
                                    iM15363P = 16;
                                }
                                linkedHashMap2 = new LinkedHashMap(iM15363P);
                                it4 = list8.iterator();
                                while (it4.hasNext()) {
                                    Object next2 = it4.next();
                                    linkedHashMap2.put(new Integer(((LessonTextToken) next2).m8066b()), next2);
                                    it4 = it4;
                                    coroutineSingletons3 = coroutineSingletons3;
                                }
                                coroutineSingletons2 = coroutineSingletons3;
                                List listM7745i2 = lessonSentenceEntityM7737a.m7745i();
                                arrayList3 = new ArrayList(v91.m23189q0(listM7745i2, 10));
                                it5 = listM7745i2.iterator();
                                while (it5.hasNext()) {
                                    LessonTextToken lessonTextTokenM8065a2 = (LessonTextToken) it5.next();
                                    Iterator it10 = it5;
                                    lessonTextToken = (LessonTextToken) linkedHashMap2.get(new Integer(lessonTextTokenM8065a2.m8066b()));
                                    if (lessonTextToken == null) {
                                    }
                                    arrayList3.add(lessonTextTokenM8065a2);
                                    it5 = it10;
                                }
                                lessonSentenceEntityM7737a = LessonSentenceEntity.m7737a(lessonSentenceEntityM7737a, arrayList3);
                            } else {
                                coroutineSingletons2 = coroutineSingletons3;
                            }
                            arrayList2.add(lessonSentenceEntityM7737a);
                            it3 = it3;
                            coroutineSingletons3 = coroutineSingletons2;
                            abstractC1320h3 = abstractC1320h3;
                            i17 = 10;
                        }
                        coroutineSingletons = coroutineSingletons3;
                        abstractC1320h2 = abstractC1320h3;
                        if (arrayList2.isEmpty()) {
                            lessonRepositoryImpl$fetchLippData$1.f15382a = null;
                            lessonRepositoryImpl$fetchLippData$1.f15383b = resultLipp2;
                            lessonRepositoryImpl$fetchLippData$1.f15384c = str2;
                            lessonRepositoryImpl$fetchLippData$1.f15385d = map;
                            lessonRepositoryImpl$fetchLippData$1.f15386e = null;
                            lessonRepositoryImpl$fetchLippData$1.f15387f = i8;
                            lessonRepositoryImpl$fetchLippData$1.f15388g = i7;
                            lessonRepositoryImpl$fetchLippData$1.f15389h = i4;
                            lessonRepositoryImpl$fetchLippData$1.f15390i = i9;
                            lessonRepositoryImpl$fetchLippData$1.f15391j = iIntValue2;
                            lessonRepositoryImpl$fetchLippData$1.f15381H = 3;
                            abstractC1320h = abstractC1320h2;
                            coroutineSingletons3 = coroutineSingletons;
                            if (abstractC1320h.mo7490G0(arrayList2, lessonRepositoryImpl$fetchLippData$1) != coroutineSingletons3) {
                                resultLipp3 = resultLipp2;
                                map6 = map;
                                map2 = map6;
                                i5 = i8;
                                resultLipp = resultLipp3;
                                i14 = i7;
                                map3 = map2;
                                if (resultLipp.m8371c().isEmpty()) {
                                    i10 = i4;
                                    map4 = map3;
                                    map8 = map4;
                                    if (!resultLipp.m8371c().isEmpty()) {
                                        List<ResultLippSentenceTranslation> listM8371c16 = resultLipp.m8371c();
                                        arrayList6 = new ArrayList(v91.m23189q0(listM8371c16, 10));
                                        while (r5.hasNext()) {
                                            arrayList6.add(new j65(i5, resultLippSentenceTranslation.m8373b(), resultLippSentenceTranslation.m8372a()));
                                        }
                                        lessonRepositoryImpl$fetchLippData$1.f15382a = null;
                                        lessonRepositoryImpl$fetchLippData$1.f15383b = resultLipp;
                                        lessonRepositoryImpl$fetchLippData$1.f15384c = null;
                                        lessonRepositoryImpl$fetchLippData$1.f15385d = map4;
                                        lessonRepositoryImpl$fetchLippData$1.f15386e = null;
                                        lessonRepositoryImpl$fetchLippData$1.f15387f = i5;
                                        lessonRepositoryImpl$fetchLippData$1.f15388g = i14;
                                        lessonRepositoryImpl$fetchLippData$1.f15389h = i10;
                                        lessonRepositoryImpl$fetchLippData$1.f15381H = 6;
                                        if (abstractC1320h.mo7498O0(arrayList6, lessonRepositoryImpl$fetchLippData$1) != coroutineSingletons3) {
                                            resultLipp5 = resultLipp;
                                            map9 = map4;
                                            resultLipp = resultLipp5;
                                            map8 = map9;
                                        }
                                    }
                                    List<ResultLippSentenceTranslation> listM8371c17 = resultLipp.m8371c();
                                    arrayList7 = new ArrayList(v91.m23189q0(listM8371c17, 10));
                                    while (r1.hasNext()) {
                                        arrayList7.add(new Pair(new Integer(resultLippSentenceTranslation2.m8372a()), resultLippSentenceTranslation2.m8373b()));
                                    }
                                    return new xm5(new oe5(map8, arrayList7));
                                }
                                List<ResultLippSentenceTranslation> listM8371c18 = resultLipp.m8371c();
                                iM15363P2 = AbstractC3194a.m15363P(v91.m23189q0(listM8371c18, 10));
                                if (iM15363P2 < 16) {
                                    iM15363P2 = 16;
                                }
                                linkedHashMap3 = new LinkedHashMap(iM15363P2);
                                while (r1.hasNext()) {
                                    linkedHashMap3.put(new Integer(resultLippSentenceTranslation3.m8372a()), resultLippSentenceTranslation3.m8373b());
                                }
                                List listM22622n4 = u91.m22622n1(linkedHashMap3.keySet());
                                lessonRepositoryImpl$fetchLippData$1.f15382a = null;
                                lessonRepositoryImpl$fetchLippData$1.f15383b = resultLipp;
                                lessonRepositoryImpl$fetchLippData$1.f15384c = str2;
                                lessonRepositoryImpl$fetchLippData$1.f15385d = map3;
                                lessonRepositoryImpl$fetchLippData$1.f15386e = linkedHashMap3;
                                lessonRepositoryImpl$fetchLippData$1.f15387f = i5;
                                lessonRepositoryImpl$fetchLippData$1.f15388g = i14;
                                lessonRepositoryImpl$fetchLippData$1.f15389h = i4;
                                lessonRepositoryImpl$fetchLippData$1.f15381H = 4;
                                q05 q05Var6 = (q05) abstractC1320h;
                                q05Var6.getClass();
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("SELECT * FROM TranslationSentenceEntity WHERE lessonId = ? AND `index` IN (");
                                d32.m10005B(listM22622n4.size(), sb4);
                                sb4.append(")");
                                objM2861d2 = AbstractC0758a.m2861d(new k05(sb4.toString(), i5, listM22622n4, q05Var6, 0), q05Var6.f57071K, lessonRepositoryImpl$fetchLippData$1, true, false);
                                if (objM2861d2 != coroutineSingletons3) {
                                    Map map13 = map3;
                                    resultLipp4 = resultLipp;
                                    map5 = map13;
                                    obj = objM2861d2;
                                    i11 = i14;
                                    linkedHashMap4 = linkedHashMap3;
                                    List list9 = (List) obj;
                                    iM15363P3 = AbstractC3194a.m15363P(v91.m23189q0(list9, 10));
                                    if (iM15363P3 < 16) {
                                        iM15363P3 = 16;
                                    }
                                    linkedHashMap5 = new LinkedHashMap(iM15363P3);
                                    while (r8.hasNext()) {
                                        linkedHashMap5.put(new Integer(((TranslationSentenceEntity) obj2).m7816d()), obj2);
                                    }
                                    arrayList4 = new ArrayList(linkedHashMap4.size());
                                    it6 = linkedHashMap4.entrySet().iterator();
                                    while (it6.hasNext()) {
                                        Map.Entry entry4 = (Map.Entry) it6.next();
                                        iIntValue3 = ((Number) entry4.getKey()).intValue();
                                        str3 = (String) entry4.getValue();
                                        translationSentenceEntity = (TranslationSentenceEntity) linkedHashMap5.get(new Integer(iIntValue3));
                                        if (translationSentenceEntity != null) {
                                            arrayListM22624p1 = u91.m22624p1(translationSentenceEntity.m7820h());
                                            it8 = arrayListM22624p1.iterator();
                                            i12 = 0;
                                            while (true) {
                                                if (it8.hasNext()) {
                                                    it7 = it6;
                                                    if (fa4.m11650l(((Translation) it8.next()).m8078a(), str2)) {
                                                        i12++;
                                                        it6 = it7;
                                                    }
                                                } else {
                                                    it7 = it6;
                                                    i12 = -1;
                                                }
                                            }
                                            translation = new Translation(str3, str2, false);
                                            if (i12 >= 0) {
                                                arrayListM22624p1.set(i12, translation);
                                            } else {
                                                arrayListM22624p1.add(translation);
                                            }
                                            ArrayList arrayList11 = arrayList4;
                                            translationSentenceEntity2 = TranslationSentenceEntity.m7813a(translationSentenceEntity, null, null, null, arrayListM22624p1, null, 95);
                                            arrayList5 = arrayList11;
                                            linkedHashMap6 = linkedHashMap5;
                                        } else {
                                            it7 = it6;
                                            arrayList5 = arrayList4;
                                            linkedHashMap6 = linkedHashMap5;
                                            translationSentenceEntity2 = new TranslationSentenceEntity(iIntValue3, i5, null, null, "", vz1.m23604J(new Translation(str3, str2, false)));
                                        }
                                        arrayList5.add(translationSentenceEntity2);
                                        arrayList4 = arrayList5;
                                        linkedHashMap5 = linkedHashMap6;
                                        it6 = it7;
                                    }
                                    lessonRepositoryImpl$fetchLippData$1.f15382a = null;
                                    lessonRepositoryImpl$fetchLippData$1.f15383b = resultLipp4;
                                    lessonRepositoryImpl$fetchLippData$1.f15384c = null;
                                    lessonRepositoryImpl$fetchLippData$1.f15385d = map5;
                                    lessonRepositoryImpl$fetchLippData$1.f15386e = null;
                                    lessonRepositoryImpl$fetchLippData$1.f15387f = i5;
                                    lessonRepositoryImpl$fetchLippData$1.f15388g = i11;
                                    lessonRepositoryImpl$fetchLippData$1.f15389h = i4;
                                    lessonRepositoryImpl$fetchLippData$1.f15381H = 5;
                                    if (abstractC1320h.mo7496M0(arrayList4, lessonRepositoryImpl$fetchLippData$1) != coroutineSingletons3) {
                                        map7 = map5;
                                        resultLipp = resultLipp4;
                                        int i112 = i11;
                                        i10 = i4;
                                        map4 = map7;
                                        i14 = i112;
                                        map8 = map4;
                                        if (!resultLipp.m8371c().isEmpty()) {
                                            List<ResultLippSentenceTranslation> listM8371c19 = resultLipp.m8371c();
                                            arrayList6 = new ArrayList(v91.m23189q0(listM8371c19, 10));
                                            while (r5.hasNext()) {
                                                arrayList6.add(new j65(i5, resultLippSentenceTranslation.m8373b(), resultLippSentenceTranslation.m8372a()));
                                            }
                                            lessonRepositoryImpl$fetchLippData$1.f15382a = null;
                                            lessonRepositoryImpl$fetchLippData$1.f15383b = resultLipp;
                                            lessonRepositoryImpl$fetchLippData$1.f15384c = null;
                                            lessonRepositoryImpl$fetchLippData$1.f15385d = map4;
                                            lessonRepositoryImpl$fetchLippData$1.f15386e = null;
                                            lessonRepositoryImpl$fetchLippData$1.f15387f = i5;
                                            lessonRepositoryImpl$fetchLippData$1.f15388g = i14;
                                            lessonRepositoryImpl$fetchLippData$1.f15389h = i10;
                                            lessonRepositoryImpl$fetchLippData$1.f15381H = 6;
                                            if (abstractC1320h.mo7498O0(arrayList6, lessonRepositoryImpl$fetchLippData$1) != coroutineSingletons3) {
                                                resultLipp5 = resultLipp;
                                                map9 = map4;
                                                resultLipp = resultLipp5;
                                                map8 = map9;
                                            }
                                        }
                                        List<ResultLippSentenceTranslation> listM8371c110 = resultLipp.m8371c();
                                        arrayList7 = new ArrayList(v91.m23189q0(listM8371c110, 10));
                                        while (r1.hasNext()) {
                                            arrayList7.add(new Pair(new Integer(resultLippSentenceTranslation2.m8372a()), resultLippSentenceTranslation2.m8373b()));
                                        }
                                        return new xm5(new oe5(map8, arrayList7));
                                    }
                                }
                            }
                        } else {
                            coroutineSingletons3 = coroutineSingletons;
                            abstractC1320h = abstractC1320h2;
                            map2 = map;
                            i5 = i8;
                            resultLipp = resultLipp2;
                            i14 = i7;
                            map3 = map2;
                            if (resultLipp.m8371c().isEmpty()) {
                                i10 = i4;
                                map4 = map3;
                                map8 = map4;
                                if (!resultLipp.m8371c().isEmpty()) {
                                    List<ResultLippSentenceTranslation> listM8371c111 = resultLipp.m8371c();
                                    arrayList6 = new ArrayList(v91.m23189q0(listM8371c111, 10));
                                    while (r5.hasNext()) {
                                        arrayList6.add(new j65(i5, resultLippSentenceTranslation.m8373b(), resultLippSentenceTranslation.m8372a()));
                                    }
                                    lessonRepositoryImpl$fetchLippData$1.f15382a = null;
                                    lessonRepositoryImpl$fetchLippData$1.f15383b = resultLipp;
                                    lessonRepositoryImpl$fetchLippData$1.f15384c = null;
                                    lessonRepositoryImpl$fetchLippData$1.f15385d = map4;
                                    lessonRepositoryImpl$fetchLippData$1.f15386e = null;
                                    lessonRepositoryImpl$fetchLippData$1.f15387f = i5;
                                    lessonRepositoryImpl$fetchLippData$1.f15388g = i14;
                                    lessonRepositoryImpl$fetchLippData$1.f15389h = i10;
                                    lessonRepositoryImpl$fetchLippData$1.f15381H = 6;
                                    if (abstractC1320h.mo7498O0(arrayList6, lessonRepositoryImpl$fetchLippData$1) != coroutineSingletons3) {
                                        resultLipp5 = resultLipp;
                                        map9 = map4;
                                        resultLipp = resultLipp5;
                                        map8 = map9;
                                    }
                                }
                                List<ResultLippSentenceTranslation> listM8371c112 = resultLipp.m8371c();
                                arrayList7 = new ArrayList(v91.m23189q0(listM8371c112, 10));
                                while (r1.hasNext()) {
                                    arrayList7.add(new Pair(new Integer(resultLippSentenceTranslation2.m8372a()), resultLippSentenceTranslation2.m8373b()));
                                }
                                return new xm5(new oe5(map8, arrayList7));
                            }
                            List<ResultLippSentenceTranslation> listM8371c113 = resultLipp.m8371c();
                            iM15363P2 = AbstractC3194a.m15363P(v91.m23189q0(listM8371c113, 10));
                            if (iM15363P2 < 16) {
                                iM15363P2 = 16;
                            }
                            linkedHashMap3 = new LinkedHashMap(iM15363P2);
                            while (r1.hasNext()) {
                                linkedHashMap3.put(new Integer(resultLippSentenceTranslation3.m8372a()), resultLippSentenceTranslation3.m8373b());
                            }
                            List listM22622n5 = u91.m22622n1(linkedHashMap3.keySet());
                            lessonRepositoryImpl$fetchLippData$1.f15382a = null;
                            lessonRepositoryImpl$fetchLippData$1.f15383b = resultLipp;
                            lessonRepositoryImpl$fetchLippData$1.f15384c = str2;
                            lessonRepositoryImpl$fetchLippData$1.f15385d = map3;
                            lessonRepositoryImpl$fetchLippData$1.f15386e = linkedHashMap3;
                            lessonRepositoryImpl$fetchLippData$1.f15387f = i5;
                            lessonRepositoryImpl$fetchLippData$1.f15388g = i14;
                            lessonRepositoryImpl$fetchLippData$1.f15389h = i4;
                            lessonRepositoryImpl$fetchLippData$1.f15381H = 4;
                            q05 q05Var7 = (q05) abstractC1320h;
                            q05Var7.getClass();
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("SELECT * FROM TranslationSentenceEntity WHERE lessonId = ? AND `index` IN (");
                            d32.m10005B(listM22622n5.size(), sb5);
                            sb5.append(")");
                            objM2861d2 = AbstractC0758a.m2861d(new k05(sb5.toString(), i5, listM22622n5, q05Var7, 0), q05Var7.f57071K, lessonRepositoryImpl$fetchLippData$1, true, false);
                            if (objM2861d2 != coroutineSingletons3) {
                                Map map14 = map3;
                                resultLipp4 = resultLipp;
                                map5 = map14;
                                obj = objM2861d2;
                                i11 = i14;
                                linkedHashMap4 = linkedHashMap3;
                                List list10 = (List) obj;
                                iM15363P3 = AbstractC3194a.m15363P(v91.m23189q0(list10, 10));
                                if (iM15363P3 < 16) {
                                    iM15363P3 = 16;
                                }
                                linkedHashMap5 = new LinkedHashMap(iM15363P3);
                                while (r8.hasNext()) {
                                    linkedHashMap5.put(new Integer(((TranslationSentenceEntity) obj2).m7816d()), obj2);
                                }
                                arrayList4 = new ArrayList(linkedHashMap4.size());
                                it6 = linkedHashMap4.entrySet().iterator();
                                while (it6.hasNext()) {
                                    Map.Entry entry5 = (Map.Entry) it6.next();
                                    iIntValue3 = ((Number) entry5.getKey()).intValue();
                                    str3 = (String) entry5.getValue();
                                    translationSentenceEntity = (TranslationSentenceEntity) linkedHashMap5.get(new Integer(iIntValue3));
                                    if (translationSentenceEntity != null) {
                                        arrayListM22624p1 = u91.m22624p1(translationSentenceEntity.m7820h());
                                        it8 = arrayListM22624p1.iterator();
                                        i12 = 0;
                                        while (true) {
                                            if (it8.hasNext()) {
                                                it7 = it6;
                                                if (fa4.m11650l(((Translation) it8.next()).m8078a(), str2)) {
                                                    i12++;
                                                    it6 = it7;
                                                }
                                            } else {
                                                it7 = it6;
                                                i12 = -1;
                                            }
                                        }
                                        translation = new Translation(str3, str2, false);
                                        if (i12 >= 0) {
                                            arrayListM22624p1.set(i12, translation);
                                        } else {
                                            arrayListM22624p1.add(translation);
                                        }
                                        ArrayList arrayList12 = arrayList4;
                                        translationSentenceEntity2 = TranslationSentenceEntity.m7813a(translationSentenceEntity, null, null, null, arrayListM22624p1, null, 95);
                                        arrayList5 = arrayList12;
                                        linkedHashMap6 = linkedHashMap5;
                                    } else {
                                        it7 = it6;
                                        arrayList5 = arrayList4;
                                        linkedHashMap6 = linkedHashMap5;
                                        translationSentenceEntity2 = new TranslationSentenceEntity(iIntValue3, i5, null, null, "", vz1.m23604J(new Translation(str3, str2, false)));
                                    }
                                    arrayList5.add(translationSentenceEntity2);
                                    arrayList4 = arrayList5;
                                    linkedHashMap5 = linkedHashMap6;
                                    it6 = it7;
                                }
                                lessonRepositoryImpl$fetchLippData$1.f15382a = null;
                                lessonRepositoryImpl$fetchLippData$1.f15383b = resultLipp4;
                                lessonRepositoryImpl$fetchLippData$1.f15384c = null;
                                lessonRepositoryImpl$fetchLippData$1.f15385d = map5;
                                lessonRepositoryImpl$fetchLippData$1.f15386e = null;
                                lessonRepositoryImpl$fetchLippData$1.f15387f = i5;
                                lessonRepositoryImpl$fetchLippData$1.f15388g = i11;
                                lessonRepositoryImpl$fetchLippData$1.f15389h = i4;
                                lessonRepositoryImpl$fetchLippData$1.f15381H = 5;
                                if (abstractC1320h.mo7496M0(arrayList4, lessonRepositoryImpl$fetchLippData$1) != coroutineSingletons3) {
                                    map7 = map5;
                                    resultLipp = resultLipp4;
                                    int i113 = i11;
                                    i10 = i4;
                                    map4 = map7;
                                    i14 = i113;
                                    map8 = map4;
                                    if (!resultLipp.m8371c().isEmpty()) {
                                        List<ResultLippSentenceTranslation> listM8371c114 = resultLipp.m8371c();
                                        arrayList6 = new ArrayList(v91.m23189q0(listM8371c114, 10));
                                        while (r5.hasNext()) {
                                            arrayList6.add(new j65(i5, resultLippSentenceTranslation.m8373b(), resultLippSentenceTranslation.m8372a()));
                                        }
                                        lessonRepositoryImpl$fetchLippData$1.f15382a = null;
                                        lessonRepositoryImpl$fetchLippData$1.f15383b = resultLipp;
                                        lessonRepositoryImpl$fetchLippData$1.f15384c = null;
                                        lessonRepositoryImpl$fetchLippData$1.f15385d = map4;
                                        lessonRepositoryImpl$fetchLippData$1.f15386e = null;
                                        lessonRepositoryImpl$fetchLippData$1.f15387f = i5;
                                        lessonRepositoryImpl$fetchLippData$1.f15388g = i14;
                                        lessonRepositoryImpl$fetchLippData$1.f15389h = i10;
                                        lessonRepositoryImpl$fetchLippData$1.f15381H = 6;
                                        if (abstractC1320h.mo7498O0(arrayList6, lessonRepositoryImpl$fetchLippData$1) != coroutineSingletons3) {
                                            resultLipp5 = resultLipp;
                                            map9 = map4;
                                            resultLipp = resultLipp5;
                                            map8 = map9;
                                        }
                                    }
                                    List<ResultLippSentenceTranslation> listM8371c115 = resultLipp.m8371c();
                                    arrayList7 = new ArrayList(v91.m23189q0(listM8371c115, 10));
                                    while (r1.hasNext()) {
                                        arrayList7.add(new Pair(new Integer(resultLippSentenceTranslation2.m8372a()), resultLippSentenceTranslation2.m8373b()));
                                    }
                                    return new xm5(new oe5(map8, arrayList7));
                                }
                            }
                        }
                    }
                } else {
                    int i114 = i13;
                    abstractC1320h = abstractC1320h3;
                    str2 = str4;
                    i5 = i114;
                    map3 = linkedHashMap;
                    if (resultLipp.m8371c().isEmpty()) {
                        i10 = i4;
                        map4 = map3;
                        map8 = map4;
                        if (!resultLipp.m8371c().isEmpty()) {
                            List<ResultLippSentenceTranslation> listM8371c116 = resultLipp.m8371c();
                            arrayList6 = new ArrayList(v91.m23189q0(listM8371c116, 10));
                            while (r5.hasNext()) {
                                arrayList6.add(new j65(i5, resultLippSentenceTranslation.m8373b(), resultLippSentenceTranslation.m8372a()));
                            }
                            lessonRepositoryImpl$fetchLippData$1.f15382a = null;
                            lessonRepositoryImpl$fetchLippData$1.f15383b = resultLipp;
                            lessonRepositoryImpl$fetchLippData$1.f15384c = null;
                            lessonRepositoryImpl$fetchLippData$1.f15385d = map4;
                            lessonRepositoryImpl$fetchLippData$1.f15386e = null;
                            lessonRepositoryImpl$fetchLippData$1.f15387f = i5;
                            lessonRepositoryImpl$fetchLippData$1.f15388g = i14;
                            lessonRepositoryImpl$fetchLippData$1.f15389h = i10;
                            lessonRepositoryImpl$fetchLippData$1.f15381H = 6;
                            if (abstractC1320h.mo7498O0(arrayList6, lessonRepositoryImpl$fetchLippData$1) != coroutineSingletons3) {
                                resultLipp5 = resultLipp;
                                map9 = map4;
                                resultLipp = resultLipp5;
                                map8 = map9;
                            }
                        }
                        List<ResultLippSentenceTranslation> listM8371c117 = resultLipp.m8371c();
                        arrayList7 = new ArrayList(v91.m23189q0(listM8371c117, 10));
                        while (r1.hasNext()) {
                            arrayList7.add(new Pair(new Integer(resultLippSentenceTranslation2.m8372a()), resultLippSentenceTranslation2.m8373b()));
                        }
                        return new xm5(new oe5(map8, arrayList7));
                    }
                    List<ResultLippSentenceTranslation> listM8371c118 = resultLipp.m8371c();
                    iM15363P2 = AbstractC3194a.m15363P(v91.m23189q0(listM8371c118, 10));
                    if (iM15363P2 < 16) {
                        iM15363P2 = 16;
                    }
                    linkedHashMap3 = new LinkedHashMap(iM15363P2);
                    while (r1.hasNext()) {
                        linkedHashMap3.put(new Integer(resultLippSentenceTranslation3.m8372a()), resultLippSentenceTranslation3.m8373b());
                    }
                    List listM22622n6 = u91.m22622n1(linkedHashMap3.keySet());
                    lessonRepositoryImpl$fetchLippData$1.f15382a = null;
                    lessonRepositoryImpl$fetchLippData$1.f15383b = resultLipp;
                    lessonRepositoryImpl$fetchLippData$1.f15384c = str2;
                    lessonRepositoryImpl$fetchLippData$1.f15385d = map3;
                    lessonRepositoryImpl$fetchLippData$1.f15386e = linkedHashMap3;
                    lessonRepositoryImpl$fetchLippData$1.f15387f = i5;
                    lessonRepositoryImpl$fetchLippData$1.f15388g = i14;
                    lessonRepositoryImpl$fetchLippData$1.f15389h = i4;
                    lessonRepositoryImpl$fetchLippData$1.f15381H = 4;
                    q05 q05Var8 = (q05) abstractC1320h;
                    q05Var8.getClass();
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("SELECT * FROM TranslationSentenceEntity WHERE lessonId = ? AND `index` IN (");
                    d32.m10005B(listM22622n6.size(), sb6);
                    sb6.append(")");
                    objM2861d2 = AbstractC0758a.m2861d(new k05(sb6.toString(), i5, listM22622n6, q05Var8, 0), q05Var8.f57071K, lessonRepositoryImpl$fetchLippData$1, true, false);
                    if (objM2861d2 != coroutineSingletons3) {
                        Map map15 = map3;
                        resultLipp4 = resultLipp;
                        map5 = map15;
                        obj = objM2861d2;
                        i11 = i14;
                        linkedHashMap4 = linkedHashMap3;
                        List list11 = (List) obj;
                        iM15363P3 = AbstractC3194a.m15363P(v91.m23189q0(list11, 10));
                        if (iM15363P3 < 16) {
                            iM15363P3 = 16;
                        }
                        linkedHashMap5 = new LinkedHashMap(iM15363P3);
                        while (r8.hasNext()) {
                            linkedHashMap5.put(new Integer(((TranslationSentenceEntity) obj2).m7816d()), obj2);
                        }
                        arrayList4 = new ArrayList(linkedHashMap4.size());
                        it6 = linkedHashMap4.entrySet().iterator();
                        while (it6.hasNext()) {
                            Map.Entry entry6 = (Map.Entry) it6.next();
                            iIntValue3 = ((Number) entry6.getKey()).intValue();
                            str3 = (String) entry6.getValue();
                            translationSentenceEntity = (TranslationSentenceEntity) linkedHashMap5.get(new Integer(iIntValue3));
                            if (translationSentenceEntity != null) {
                                arrayListM22624p1 = u91.m22624p1(translationSentenceEntity.m7820h());
                                it8 = arrayListM22624p1.iterator();
                                i12 = 0;
                                while (true) {
                                    if (it8.hasNext()) {
                                        it7 = it6;
                                        if (fa4.m11650l(((Translation) it8.next()).m8078a(), str2)) {
                                            i12++;
                                            it6 = it7;
                                        }
                                    } else {
                                        it7 = it6;
                                        i12 = -1;
                                    }
                                }
                                translation = new Translation(str3, str2, false);
                                if (i12 >= 0) {
                                    arrayListM22624p1.set(i12, translation);
                                } else {
                                    arrayListM22624p1.add(translation);
                                }
                                ArrayList arrayList13 = arrayList4;
                                translationSentenceEntity2 = TranslationSentenceEntity.m7813a(translationSentenceEntity, null, null, null, arrayListM22624p1, null, 95);
                                arrayList5 = arrayList13;
                                linkedHashMap6 = linkedHashMap5;
                            } else {
                                it7 = it6;
                                arrayList5 = arrayList4;
                                linkedHashMap6 = linkedHashMap5;
                                translationSentenceEntity2 = new TranslationSentenceEntity(iIntValue3, i5, null, null, "", vz1.m23604J(new Translation(str3, str2, false)));
                            }
                            arrayList5.add(translationSentenceEntity2);
                            arrayList4 = arrayList5;
                            linkedHashMap5 = linkedHashMap6;
                            it6 = it7;
                        }
                        lessonRepositoryImpl$fetchLippData$1.f15382a = null;
                        lessonRepositoryImpl$fetchLippData$1.f15383b = resultLipp4;
                        lessonRepositoryImpl$fetchLippData$1.f15384c = null;
                        lessonRepositoryImpl$fetchLippData$1.f15385d = map5;
                        lessonRepositoryImpl$fetchLippData$1.f15386e = null;
                        lessonRepositoryImpl$fetchLippData$1.f15387f = i5;
                        lessonRepositoryImpl$fetchLippData$1.f15388g = i11;
                        lessonRepositoryImpl$fetchLippData$1.f15389h = i4;
                        lessonRepositoryImpl$fetchLippData$1.f15381H = 5;
                        if (abstractC1320h.mo7496M0(arrayList4, lessonRepositoryImpl$fetchLippData$1) != coroutineSingletons3) {
                            map7 = map5;
                            resultLipp = resultLipp4;
                            int i115 = i11;
                            i10 = i4;
                            map4 = map7;
                            i14 = i115;
                            map8 = map4;
                            if (!resultLipp.m8371c().isEmpty()) {
                                List<ResultLippSentenceTranslation> listM8371c119 = resultLipp.m8371c();
                                arrayList6 = new ArrayList(v91.m23189q0(listM8371c119, 10));
                                while (r5.hasNext()) {
                                    arrayList6.add(new j65(i5, resultLippSentenceTranslation.m8373b(), resultLippSentenceTranslation.m8372a()));
                                }
                                lessonRepositoryImpl$fetchLippData$1.f15382a = null;
                                lessonRepositoryImpl$fetchLippData$1.f15383b = resultLipp;
                                lessonRepositoryImpl$fetchLippData$1.f15384c = null;
                                lessonRepositoryImpl$fetchLippData$1.f15385d = map4;
                                lessonRepositoryImpl$fetchLippData$1.f15386e = null;
                                lessonRepositoryImpl$fetchLippData$1.f15387f = i5;
                                lessonRepositoryImpl$fetchLippData$1.f15388g = i14;
                                lessonRepositoryImpl$fetchLippData$1.f15389h = i10;
                                lessonRepositoryImpl$fetchLippData$1.f15381H = 6;
                                if (abstractC1320h.mo7498O0(arrayList6, lessonRepositoryImpl$fetchLippData$1) != coroutineSingletons3) {
                                    resultLipp5 = resultLipp;
                                    map9 = map4;
                                    resultLipp = resultLipp5;
                                    map8 = map9;
                                }
                            }
                            List<ResultLippSentenceTranslation> listM8371c1110 = resultLipp.m8371c();
                            arrayList7 = new ArrayList(v91.m23189q0(listM8371c1110, 10));
                            while (r1.hasNext()) {
                                arrayList7.add(new Pair(new Integer(resultLippSentenceTranslation2.m8372a()), resultLippSentenceTranslation2.m8373b()));
                            }
                            return new xm5(new oe5(map8, arrayList7));
                        }
                    }
                }
                return coroutineSingletons3;
            case 2:
                int i21 = lessonRepositoryImpl$fetchLippData$1.f15391j;
                int i22 = lessonRepositoryImpl$fetchLippData$1.f15390i;
                int i23 = lessonRepositoryImpl$fetchLippData$1.f15389h;
                int i24 = lessonRepositoryImpl$fetchLippData$1.f15388g;
                i8 = lessonRepositoryImpl$fetchLippData$1.f15387f;
                Map map16 = lessonRepositoryImpl$fetchLippData$1.f15385d;
                str2 = lessonRepositoryImpl$fetchLippData$1.f15384c;
                resultLipp2 = lessonRepositoryImpl$fetchLippData$1.f15383b;
                AbstractC3193b.m15359b(objM14897J);
                iIntValue2 = i21;
                i4 = i23;
                i9 = i22;
                i7 = i24;
                map = map16;
                List list12 = (List) objM14897J;
                arrayList2 = new ArrayList(v91.m23189q0(list12, 10));
                it3 = list12.iterator();
                while (it3.hasNext()) {
                    lessonSentenceEntityM7737a = (LessonSentenceEntity) it3.next();
                    list = (List) e65.m10872d(lessonSentenceEntityM7737a.m7738b(), map);
                    if (list != null) {
                        List list13 = list;
                        iM15363P = AbstractC3194a.m15363P(v91.m23189q0(list13, i17));
                        if (iM15363P < 16) {
                            iM15363P = 16;
                        }
                        linkedHashMap2 = new LinkedHashMap(iM15363P);
                        it4 = list13.iterator();
                        while (it4.hasNext()) {
                            Object next3 = it4.next();
                            linkedHashMap2.put(new Integer(((LessonTextToken) next3).m8066b()), next3);
                            it4 = it4;
                            coroutineSingletons3 = coroutineSingletons3;
                        }
                        coroutineSingletons2 = coroutineSingletons3;
                        List listM7745i3 = lessonSentenceEntityM7737a.m7745i();
                        arrayList3 = new ArrayList(v91.m23189q0(listM7745i3, 10));
                        it5 = listM7745i3.iterator();
                        while (it5.hasNext()) {
                            LessonTextToken lessonTextTokenM8065a3 = (LessonTextToken) it5.next();
                            Iterator it11 = it5;
                            lessonTextToken = (LessonTextToken) linkedHashMap2.get(new Integer(lessonTextTokenM8065a3.m8066b()));
                            if (lessonTextToken == null) {
                            }
                            arrayList3.add(lessonTextTokenM8065a3);
                            it5 = it11;
                        }
                        lessonSentenceEntityM7737a = LessonSentenceEntity.m7737a(lessonSentenceEntityM7737a, arrayList3);
                    } else {
                        coroutineSingletons2 = coroutineSingletons3;
                    }
                    arrayList2.add(lessonSentenceEntityM7737a);
                    it3 = it3;
                    coroutineSingletons3 = coroutineSingletons2;
                    abstractC1320h3 = abstractC1320h3;
                    i17 = 10;
                }
                coroutineSingletons = coroutineSingletons3;
                abstractC1320h2 = abstractC1320h3;
                if (arrayList2.isEmpty()) {
                    lessonRepositoryImpl$fetchLippData$1.f15382a = null;
                    lessonRepositoryImpl$fetchLippData$1.f15383b = resultLipp2;
                    lessonRepositoryImpl$fetchLippData$1.f15384c = str2;
                    lessonRepositoryImpl$fetchLippData$1.f15385d = map;
                    lessonRepositoryImpl$fetchLippData$1.f15386e = null;
                    lessonRepositoryImpl$fetchLippData$1.f15387f = i8;
                    lessonRepositoryImpl$fetchLippData$1.f15388g = i7;
                    lessonRepositoryImpl$fetchLippData$1.f15389h = i4;
                    lessonRepositoryImpl$fetchLippData$1.f15390i = i9;
                    lessonRepositoryImpl$fetchLippData$1.f15391j = iIntValue2;
                    lessonRepositoryImpl$fetchLippData$1.f15381H = 3;
                    abstractC1320h = abstractC1320h2;
                    coroutineSingletons3 = coroutineSingletons;
                    if (abstractC1320h.mo7490G0(arrayList2, lessonRepositoryImpl$fetchLippData$1) != coroutineSingletons3) {
                        resultLipp3 = resultLipp2;
                        map6 = map;
                        map2 = map6;
                        i5 = i8;
                        resultLipp = resultLipp3;
                        i14 = i7;
                        map3 = map2;
                        if (resultLipp.m8371c().isEmpty()) {
                            i10 = i4;
                            map4 = map3;
                            map8 = map4;
                            if (!resultLipp.m8371c().isEmpty()) {
                                List<ResultLippSentenceTranslation> listM8371c1111 = resultLipp.m8371c();
                                arrayList6 = new ArrayList(v91.m23189q0(listM8371c1111, 10));
                                while (r5.hasNext()) {
                                    arrayList6.add(new j65(i5, resultLippSentenceTranslation.m8373b(), resultLippSentenceTranslation.m8372a()));
                                }
                                lessonRepositoryImpl$fetchLippData$1.f15382a = null;
                                lessonRepositoryImpl$fetchLippData$1.f15383b = resultLipp;
                                lessonRepositoryImpl$fetchLippData$1.f15384c = null;
                                lessonRepositoryImpl$fetchLippData$1.f15385d = map4;
                                lessonRepositoryImpl$fetchLippData$1.f15386e = null;
                                lessonRepositoryImpl$fetchLippData$1.f15387f = i5;
                                lessonRepositoryImpl$fetchLippData$1.f15388g = i14;
                                lessonRepositoryImpl$fetchLippData$1.f15389h = i10;
                                lessonRepositoryImpl$fetchLippData$1.f15381H = 6;
                                if (abstractC1320h.mo7498O0(arrayList6, lessonRepositoryImpl$fetchLippData$1) != coroutineSingletons3) {
                                    resultLipp5 = resultLipp;
                                    map9 = map4;
                                    resultLipp = resultLipp5;
                                    map8 = map9;
                                }
                            }
                            List<ResultLippSentenceTranslation> listM8371c1112 = resultLipp.m8371c();
                            arrayList7 = new ArrayList(v91.m23189q0(listM8371c1112, 10));
                            while (r1.hasNext()) {
                                arrayList7.add(new Pair(new Integer(resultLippSentenceTranslation2.m8372a()), resultLippSentenceTranslation2.m8373b()));
                            }
                            return new xm5(new oe5(map8, arrayList7));
                        }
                        List<ResultLippSentenceTranslation> listM8371c1113 = resultLipp.m8371c();
                        iM15363P2 = AbstractC3194a.m15363P(v91.m23189q0(listM8371c1113, 10));
                        if (iM15363P2 < 16) {
                            iM15363P2 = 16;
                        }
                        linkedHashMap3 = new LinkedHashMap(iM15363P2);
                        while (r1.hasNext()) {
                            linkedHashMap3.put(new Integer(resultLippSentenceTranslation3.m8372a()), resultLippSentenceTranslation3.m8373b());
                        }
                        List listM22622n7 = u91.m22622n1(linkedHashMap3.keySet());
                        lessonRepositoryImpl$fetchLippData$1.f15382a = null;
                        lessonRepositoryImpl$fetchLippData$1.f15383b = resultLipp;
                        lessonRepositoryImpl$fetchLippData$1.f15384c = str2;
                        lessonRepositoryImpl$fetchLippData$1.f15385d = map3;
                        lessonRepositoryImpl$fetchLippData$1.f15386e = linkedHashMap3;
                        lessonRepositoryImpl$fetchLippData$1.f15387f = i5;
                        lessonRepositoryImpl$fetchLippData$1.f15388g = i14;
                        lessonRepositoryImpl$fetchLippData$1.f15389h = i4;
                        lessonRepositoryImpl$fetchLippData$1.f15381H = 4;
                        q05 q05Var9 = (q05) abstractC1320h;
                        q05Var9.getClass();
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append("SELECT * FROM TranslationSentenceEntity WHERE lessonId = ? AND `index` IN (");
                        d32.m10005B(listM22622n7.size(), sb7);
                        sb7.append(")");
                        objM2861d2 = AbstractC0758a.m2861d(new k05(sb7.toString(), i5, listM22622n7, q05Var9, 0), q05Var9.f57071K, lessonRepositoryImpl$fetchLippData$1, true, false);
                        if (objM2861d2 != coroutineSingletons3) {
                            Map map17 = map3;
                            resultLipp4 = resultLipp;
                            map5 = map17;
                            obj = objM2861d2;
                            i11 = i14;
                            linkedHashMap4 = linkedHashMap3;
                            List list14 = (List) obj;
                            iM15363P3 = AbstractC3194a.m15363P(v91.m23189q0(list14, 10));
                            if (iM15363P3 < 16) {
                                iM15363P3 = 16;
                            }
                            linkedHashMap5 = new LinkedHashMap(iM15363P3);
                            while (r8.hasNext()) {
                                linkedHashMap5.put(new Integer(((TranslationSentenceEntity) obj2).m7816d()), obj2);
                            }
                            arrayList4 = new ArrayList(linkedHashMap4.size());
                            it6 = linkedHashMap4.entrySet().iterator();
                            while (it6.hasNext()) {
                                Map.Entry entry7 = (Map.Entry) it6.next();
                                iIntValue3 = ((Number) entry7.getKey()).intValue();
                                str3 = (String) entry7.getValue();
                                translationSentenceEntity = (TranslationSentenceEntity) linkedHashMap5.get(new Integer(iIntValue3));
                                if (translationSentenceEntity != null) {
                                    arrayListM22624p1 = u91.m22624p1(translationSentenceEntity.m7820h());
                                    it8 = arrayListM22624p1.iterator();
                                    i12 = 0;
                                    while (true) {
                                        if (it8.hasNext()) {
                                            it7 = it6;
                                            if (fa4.m11650l(((Translation) it8.next()).m8078a(), str2)) {
                                                i12++;
                                                it6 = it7;
                                            }
                                        } else {
                                            it7 = it6;
                                            i12 = -1;
                                        }
                                    }
                                    translation = new Translation(str3, str2, false);
                                    if (i12 >= 0) {
                                        arrayListM22624p1.set(i12, translation);
                                    } else {
                                        arrayListM22624p1.add(translation);
                                    }
                                    ArrayList arrayList14 = arrayList4;
                                    translationSentenceEntity2 = TranslationSentenceEntity.m7813a(translationSentenceEntity, null, null, null, arrayListM22624p1, null, 95);
                                    arrayList5 = arrayList14;
                                    linkedHashMap6 = linkedHashMap5;
                                } else {
                                    it7 = it6;
                                    arrayList5 = arrayList4;
                                    linkedHashMap6 = linkedHashMap5;
                                    translationSentenceEntity2 = new TranslationSentenceEntity(iIntValue3, i5, null, null, "", vz1.m23604J(new Translation(str3, str2, false)));
                                }
                                arrayList5.add(translationSentenceEntity2);
                                arrayList4 = arrayList5;
                                linkedHashMap5 = linkedHashMap6;
                                it6 = it7;
                            }
                            lessonRepositoryImpl$fetchLippData$1.f15382a = null;
                            lessonRepositoryImpl$fetchLippData$1.f15383b = resultLipp4;
                            lessonRepositoryImpl$fetchLippData$1.f15384c = null;
                            lessonRepositoryImpl$fetchLippData$1.f15385d = map5;
                            lessonRepositoryImpl$fetchLippData$1.f15386e = null;
                            lessonRepositoryImpl$fetchLippData$1.f15387f = i5;
                            lessonRepositoryImpl$fetchLippData$1.f15388g = i11;
                            lessonRepositoryImpl$fetchLippData$1.f15389h = i4;
                            lessonRepositoryImpl$fetchLippData$1.f15381H = 5;
                            if (abstractC1320h.mo7496M0(arrayList4, lessonRepositoryImpl$fetchLippData$1) != coroutineSingletons3) {
                                map7 = map5;
                                resultLipp = resultLipp4;
                                int i116 = i11;
                                i10 = i4;
                                map4 = map7;
                                i14 = i116;
                                map8 = map4;
                                if (!resultLipp.m8371c().isEmpty()) {
                                    List<ResultLippSentenceTranslation> listM8371c1114 = resultLipp.m8371c();
                                    arrayList6 = new ArrayList(v91.m23189q0(listM8371c1114, 10));
                                    while (r5.hasNext()) {
                                        arrayList6.add(new j65(i5, resultLippSentenceTranslation.m8373b(), resultLippSentenceTranslation.m8372a()));
                                    }
                                    lessonRepositoryImpl$fetchLippData$1.f15382a = null;
                                    lessonRepositoryImpl$fetchLippData$1.f15383b = resultLipp;
                                    lessonRepositoryImpl$fetchLippData$1.f15384c = null;
                                    lessonRepositoryImpl$fetchLippData$1.f15385d = map4;
                                    lessonRepositoryImpl$fetchLippData$1.f15386e = null;
                                    lessonRepositoryImpl$fetchLippData$1.f15387f = i5;
                                    lessonRepositoryImpl$fetchLippData$1.f15388g = i14;
                                    lessonRepositoryImpl$fetchLippData$1.f15389h = i10;
                                    lessonRepositoryImpl$fetchLippData$1.f15381H = 6;
                                    if (abstractC1320h.mo7498O0(arrayList6, lessonRepositoryImpl$fetchLippData$1) != coroutineSingletons3) {
                                        resultLipp5 = resultLipp;
                                        map9 = map4;
                                        resultLipp = resultLipp5;
                                        map8 = map9;
                                    }
                                }
                                List<ResultLippSentenceTranslation> listM8371c1115 = resultLipp.m8371c();
                                arrayList7 = new ArrayList(v91.m23189q0(listM8371c1115, 10));
                                while (r1.hasNext()) {
                                    arrayList7.add(new Pair(new Integer(resultLippSentenceTranslation2.m8372a()), resultLippSentenceTranslation2.m8373b()));
                                }
                                return new xm5(new oe5(map8, arrayList7));
                            }
                        }
                    }
                } else {
                    coroutineSingletons3 = coroutineSingletons;
                    abstractC1320h = abstractC1320h2;
                    map2 = map;
                    i5 = i8;
                    resultLipp = resultLipp2;
                    i14 = i7;
                    map3 = map2;
                    if (resultLipp.m8371c().isEmpty()) {
                        i10 = i4;
                        map4 = map3;
                        map8 = map4;
                        if (!resultLipp.m8371c().isEmpty()) {
                            List<ResultLippSentenceTranslation> listM8371c1116 = resultLipp.m8371c();
                            arrayList6 = new ArrayList(v91.m23189q0(listM8371c1116, 10));
                            while (r5.hasNext()) {
                                arrayList6.add(new j65(i5, resultLippSentenceTranslation.m8373b(), resultLippSentenceTranslation.m8372a()));
                            }
                            lessonRepositoryImpl$fetchLippData$1.f15382a = null;
                            lessonRepositoryImpl$fetchLippData$1.f15383b = resultLipp;
                            lessonRepositoryImpl$fetchLippData$1.f15384c = null;
                            lessonRepositoryImpl$fetchLippData$1.f15385d = map4;
                            lessonRepositoryImpl$fetchLippData$1.f15386e = null;
                            lessonRepositoryImpl$fetchLippData$1.f15387f = i5;
                            lessonRepositoryImpl$fetchLippData$1.f15388g = i14;
                            lessonRepositoryImpl$fetchLippData$1.f15389h = i10;
                            lessonRepositoryImpl$fetchLippData$1.f15381H = 6;
                            if (abstractC1320h.mo7498O0(arrayList6, lessonRepositoryImpl$fetchLippData$1) != coroutineSingletons3) {
                                resultLipp5 = resultLipp;
                                map9 = map4;
                                resultLipp = resultLipp5;
                                map8 = map9;
                            }
                        }
                        List<ResultLippSentenceTranslation> listM8371c1117 = resultLipp.m8371c();
                        arrayList7 = new ArrayList(v91.m23189q0(listM8371c1117, 10));
                        while (r1.hasNext()) {
                            arrayList7.add(new Pair(new Integer(resultLippSentenceTranslation2.m8372a()), resultLippSentenceTranslation2.m8373b()));
                        }
                        return new xm5(new oe5(map8, arrayList7));
                    }
                    List<ResultLippSentenceTranslation> listM8371c1118 = resultLipp.m8371c();
                    iM15363P2 = AbstractC3194a.m15363P(v91.m23189q0(listM8371c1118, 10));
                    if (iM15363P2 < 16) {
                        iM15363P2 = 16;
                    }
                    linkedHashMap3 = new LinkedHashMap(iM15363P2);
                    while (r1.hasNext()) {
                        linkedHashMap3.put(new Integer(resultLippSentenceTranslation3.m8372a()), resultLippSentenceTranslation3.m8373b());
                    }
                    List listM22622n8 = u91.m22622n1(linkedHashMap3.keySet());
                    lessonRepositoryImpl$fetchLippData$1.f15382a = null;
                    lessonRepositoryImpl$fetchLippData$1.f15383b = resultLipp;
                    lessonRepositoryImpl$fetchLippData$1.f15384c = str2;
                    lessonRepositoryImpl$fetchLippData$1.f15385d = map3;
                    lessonRepositoryImpl$fetchLippData$1.f15386e = linkedHashMap3;
                    lessonRepositoryImpl$fetchLippData$1.f15387f = i5;
                    lessonRepositoryImpl$fetchLippData$1.f15388g = i14;
                    lessonRepositoryImpl$fetchLippData$1.f15389h = i4;
                    lessonRepositoryImpl$fetchLippData$1.f15381H = 4;
                    q05 q05Var10 = (q05) abstractC1320h;
                    q05Var10.getClass();
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append("SELECT * FROM TranslationSentenceEntity WHERE lessonId = ? AND `index` IN (");
                    d32.m10005B(listM22622n8.size(), sb8);
                    sb8.append(")");
                    objM2861d2 = AbstractC0758a.m2861d(new k05(sb8.toString(), i5, listM22622n8, q05Var10, 0), q05Var10.f57071K, lessonRepositoryImpl$fetchLippData$1, true, false);
                    if (objM2861d2 != coroutineSingletons3) {
                        Map map18 = map3;
                        resultLipp4 = resultLipp;
                        map5 = map18;
                        obj = objM2861d2;
                        i11 = i14;
                        linkedHashMap4 = linkedHashMap3;
                        List list15 = (List) obj;
                        iM15363P3 = AbstractC3194a.m15363P(v91.m23189q0(list15, 10));
                        if (iM15363P3 < 16) {
                            iM15363P3 = 16;
                        }
                        linkedHashMap5 = new LinkedHashMap(iM15363P3);
                        while (r8.hasNext()) {
                            linkedHashMap5.put(new Integer(((TranslationSentenceEntity) obj2).m7816d()), obj2);
                        }
                        arrayList4 = new ArrayList(linkedHashMap4.size());
                        it6 = linkedHashMap4.entrySet().iterator();
                        while (it6.hasNext()) {
                            Map.Entry entry8 = (Map.Entry) it6.next();
                            iIntValue3 = ((Number) entry8.getKey()).intValue();
                            str3 = (String) entry8.getValue();
                            translationSentenceEntity = (TranslationSentenceEntity) linkedHashMap5.get(new Integer(iIntValue3));
                            if (translationSentenceEntity != null) {
                                arrayListM22624p1 = u91.m22624p1(translationSentenceEntity.m7820h());
                                it8 = arrayListM22624p1.iterator();
                                i12 = 0;
                                while (true) {
                                    if (it8.hasNext()) {
                                        it7 = it6;
                                        if (fa4.m11650l(((Translation) it8.next()).m8078a(), str2)) {
                                            i12++;
                                            it6 = it7;
                                        }
                                    } else {
                                        it7 = it6;
                                        i12 = -1;
                                    }
                                }
                                translation = new Translation(str3, str2, false);
                                if (i12 >= 0) {
                                    arrayListM22624p1.set(i12, translation);
                                } else {
                                    arrayListM22624p1.add(translation);
                                }
                                ArrayList arrayList15 = arrayList4;
                                translationSentenceEntity2 = TranslationSentenceEntity.m7813a(translationSentenceEntity, null, null, null, arrayListM22624p1, null, 95);
                                arrayList5 = arrayList15;
                                linkedHashMap6 = linkedHashMap5;
                            } else {
                                it7 = it6;
                                arrayList5 = arrayList4;
                                linkedHashMap6 = linkedHashMap5;
                                translationSentenceEntity2 = new TranslationSentenceEntity(iIntValue3, i5, null, null, "", vz1.m23604J(new Translation(str3, str2, false)));
                            }
                            arrayList5.add(translationSentenceEntity2);
                            arrayList4 = arrayList5;
                            linkedHashMap5 = linkedHashMap6;
                            it6 = it7;
                        }
                        lessonRepositoryImpl$fetchLippData$1.f15382a = null;
                        lessonRepositoryImpl$fetchLippData$1.f15383b = resultLipp4;
                        lessonRepositoryImpl$fetchLippData$1.f15384c = null;
                        lessonRepositoryImpl$fetchLippData$1.f15385d = map5;
                        lessonRepositoryImpl$fetchLippData$1.f15386e = null;
                        lessonRepositoryImpl$fetchLippData$1.f15387f = i5;
                        lessonRepositoryImpl$fetchLippData$1.f15388g = i11;
                        lessonRepositoryImpl$fetchLippData$1.f15389h = i4;
                        lessonRepositoryImpl$fetchLippData$1.f15381H = 5;
                        if (abstractC1320h.mo7496M0(arrayList4, lessonRepositoryImpl$fetchLippData$1) != coroutineSingletons3) {
                            map7 = map5;
                            resultLipp = resultLipp4;
                            int i117 = i11;
                            i10 = i4;
                            map4 = map7;
                            i14 = i117;
                            map8 = map4;
                            if (!resultLipp.m8371c().isEmpty()) {
                                List<ResultLippSentenceTranslation> listM8371c1119 = resultLipp.m8371c();
                                arrayList6 = new ArrayList(v91.m23189q0(listM8371c1119, 10));
                                while (r5.hasNext()) {
                                    arrayList6.add(new j65(i5, resultLippSentenceTranslation.m8373b(), resultLippSentenceTranslation.m8372a()));
                                }
                                lessonRepositoryImpl$fetchLippData$1.f15382a = null;
                                lessonRepositoryImpl$fetchLippData$1.f15383b = resultLipp;
                                lessonRepositoryImpl$fetchLippData$1.f15384c = null;
                                lessonRepositoryImpl$fetchLippData$1.f15385d = map4;
                                lessonRepositoryImpl$fetchLippData$1.f15386e = null;
                                lessonRepositoryImpl$fetchLippData$1.f15387f = i5;
                                lessonRepositoryImpl$fetchLippData$1.f15388g = i14;
                                lessonRepositoryImpl$fetchLippData$1.f15389h = i10;
                                lessonRepositoryImpl$fetchLippData$1.f15381H = 6;
                                if (abstractC1320h.mo7498O0(arrayList6, lessonRepositoryImpl$fetchLippData$1) != coroutineSingletons3) {
                                    resultLipp5 = resultLipp;
                                    map9 = map4;
                                    resultLipp = resultLipp5;
                                    map8 = map9;
                                }
                            }
                            List<ResultLippSentenceTranslation> listM8371c11110 = resultLipp.m8371c();
                            arrayList7 = new ArrayList(v91.m23189q0(listM8371c11110, 10));
                            while (r1.hasNext()) {
                                arrayList7.add(new Pair(new Integer(resultLippSentenceTranslation2.m8372a()), resultLippSentenceTranslation2.m8373b()));
                            }
                            return new xm5(new oe5(map8, arrayList7));
                        }
                    }
                }
                return coroutineSingletons3;
            case 3:
                i4 = lessonRepositoryImpl$fetchLippData$1.f15389h;
                i7 = lessonRepositoryImpl$fetchLippData$1.f15388g;
                int i25 = lessonRepositoryImpl$fetchLippData$1.f15387f;
                Map map19 = lessonRepositoryImpl$fetchLippData$1.f15385d;
                String str6 = lessonRepositoryImpl$fetchLippData$1.f15384c;
                resultLipp3 = lessonRepositoryImpl$fetchLippData$1.f15383b;
                AbstractC3193b.m15359b(objM14897J);
                str2 = str6;
                i8 = i25;
                abstractC1320h = abstractC1320h3;
                map6 = map19;
                map2 = map6;
                i5 = i8;
                resultLipp = resultLipp3;
                i14 = i7;
                map3 = map2;
                if (resultLipp.m8371c().isEmpty()) {
                    i10 = i4;
                    map4 = map3;
                    map8 = map4;
                    if (!resultLipp.m8371c().isEmpty()) {
                        List<ResultLippSentenceTranslation> listM8371c11111 = resultLipp.m8371c();
                        arrayList6 = new ArrayList(v91.m23189q0(listM8371c11111, 10));
                        while (r5.hasNext()) {
                            arrayList6.add(new j65(i5, resultLippSentenceTranslation.m8373b(), resultLippSentenceTranslation.m8372a()));
                        }
                        lessonRepositoryImpl$fetchLippData$1.f15382a = null;
                        lessonRepositoryImpl$fetchLippData$1.f15383b = resultLipp;
                        lessonRepositoryImpl$fetchLippData$1.f15384c = null;
                        lessonRepositoryImpl$fetchLippData$1.f15385d = map4;
                        lessonRepositoryImpl$fetchLippData$1.f15386e = null;
                        lessonRepositoryImpl$fetchLippData$1.f15387f = i5;
                        lessonRepositoryImpl$fetchLippData$1.f15388g = i14;
                        lessonRepositoryImpl$fetchLippData$1.f15389h = i10;
                        lessonRepositoryImpl$fetchLippData$1.f15381H = 6;
                        if (abstractC1320h.mo7498O0(arrayList6, lessonRepositoryImpl$fetchLippData$1) != coroutineSingletons3) {
                            resultLipp5 = resultLipp;
                            map9 = map4;
                            resultLipp = resultLipp5;
                            map8 = map9;
                        }
                    }
                    List<ResultLippSentenceTranslation> listM8371c11112 = resultLipp.m8371c();
                    arrayList7 = new ArrayList(v91.m23189q0(listM8371c11112, 10));
                    while (r1.hasNext()) {
                        arrayList7.add(new Pair(new Integer(resultLippSentenceTranslation2.m8372a()), resultLippSentenceTranslation2.m8373b()));
                    }
                    return new xm5(new oe5(map8, arrayList7));
                }
                List<ResultLippSentenceTranslation> listM8371c11113 = resultLipp.m8371c();
                iM15363P2 = AbstractC3194a.m15363P(v91.m23189q0(listM8371c11113, 10));
                if (iM15363P2 < 16) {
                    iM15363P2 = 16;
                }
                linkedHashMap3 = new LinkedHashMap(iM15363P2);
                while (r1.hasNext()) {
                    linkedHashMap3.put(new Integer(resultLippSentenceTranslation3.m8372a()), resultLippSentenceTranslation3.m8373b());
                }
                List listM22622n9 = u91.m22622n1(linkedHashMap3.keySet());
                lessonRepositoryImpl$fetchLippData$1.f15382a = null;
                lessonRepositoryImpl$fetchLippData$1.f15383b = resultLipp;
                lessonRepositoryImpl$fetchLippData$1.f15384c = str2;
                lessonRepositoryImpl$fetchLippData$1.f15385d = map3;
                lessonRepositoryImpl$fetchLippData$1.f15386e = linkedHashMap3;
                lessonRepositoryImpl$fetchLippData$1.f15387f = i5;
                lessonRepositoryImpl$fetchLippData$1.f15388g = i14;
                lessonRepositoryImpl$fetchLippData$1.f15389h = i4;
                lessonRepositoryImpl$fetchLippData$1.f15381H = 4;
                q05 q05Var11 = (q05) abstractC1320h;
                q05Var11.getClass();
                StringBuilder sb9 = new StringBuilder();
                sb9.append("SELECT * FROM TranslationSentenceEntity WHERE lessonId = ? AND `index` IN (");
                d32.m10005B(listM22622n9.size(), sb9);
                sb9.append(")");
                objM2861d2 = AbstractC0758a.m2861d(new k05(sb9.toString(), i5, listM22622n9, q05Var11, 0), q05Var11.f57071K, lessonRepositoryImpl$fetchLippData$1, true, false);
                if (objM2861d2 != coroutineSingletons3) {
                    Map map110 = map3;
                    resultLipp4 = resultLipp;
                    map5 = map110;
                    obj = objM2861d2;
                    i11 = i14;
                    linkedHashMap4 = linkedHashMap3;
                    List list16 = (List) obj;
                    iM15363P3 = AbstractC3194a.m15363P(v91.m23189q0(list16, 10));
                    if (iM15363P3 < 16) {
                        iM15363P3 = 16;
                    }
                    linkedHashMap5 = new LinkedHashMap(iM15363P3);
                    while (r8.hasNext()) {
                        linkedHashMap5.put(new Integer(((TranslationSentenceEntity) obj2).m7816d()), obj2);
                    }
                    arrayList4 = new ArrayList(linkedHashMap4.size());
                    it6 = linkedHashMap4.entrySet().iterator();
                    while (it6.hasNext()) {
                        Map.Entry entry9 = (Map.Entry) it6.next();
                        iIntValue3 = ((Number) entry9.getKey()).intValue();
                        str3 = (String) entry9.getValue();
                        translationSentenceEntity = (TranslationSentenceEntity) linkedHashMap5.get(new Integer(iIntValue3));
                        if (translationSentenceEntity != null) {
                            arrayListM22624p1 = u91.m22624p1(translationSentenceEntity.m7820h());
                            it8 = arrayListM22624p1.iterator();
                            i12 = 0;
                            while (true) {
                                if (it8.hasNext()) {
                                    it7 = it6;
                                    if (fa4.m11650l(((Translation) it8.next()).m8078a(), str2)) {
                                        i12++;
                                        it6 = it7;
                                    }
                                } else {
                                    it7 = it6;
                                    i12 = -1;
                                }
                            }
                            translation = new Translation(str3, str2, false);
                            if (i12 >= 0) {
                                arrayListM22624p1.set(i12, translation);
                            } else {
                                arrayListM22624p1.add(translation);
                            }
                            ArrayList arrayList16 = arrayList4;
                            translationSentenceEntity2 = TranslationSentenceEntity.m7813a(translationSentenceEntity, null, null, null, arrayListM22624p1, null, 95);
                            arrayList5 = arrayList16;
                            linkedHashMap6 = linkedHashMap5;
                        } else {
                            it7 = it6;
                            arrayList5 = arrayList4;
                            linkedHashMap6 = linkedHashMap5;
                            translationSentenceEntity2 = new TranslationSentenceEntity(iIntValue3, i5, null, null, "", vz1.m23604J(new Translation(str3, str2, false)));
                        }
                        arrayList5.add(translationSentenceEntity2);
                        arrayList4 = arrayList5;
                        linkedHashMap5 = linkedHashMap6;
                        it6 = it7;
                    }
                    lessonRepositoryImpl$fetchLippData$1.f15382a = null;
                    lessonRepositoryImpl$fetchLippData$1.f15383b = resultLipp4;
                    lessonRepositoryImpl$fetchLippData$1.f15384c = null;
                    lessonRepositoryImpl$fetchLippData$1.f15385d = map5;
                    lessonRepositoryImpl$fetchLippData$1.f15386e = null;
                    lessonRepositoryImpl$fetchLippData$1.f15387f = i5;
                    lessonRepositoryImpl$fetchLippData$1.f15388g = i11;
                    lessonRepositoryImpl$fetchLippData$1.f15389h = i4;
                    lessonRepositoryImpl$fetchLippData$1.f15381H = 5;
                    if (abstractC1320h.mo7496M0(arrayList4, lessonRepositoryImpl$fetchLippData$1) != coroutineSingletons3) {
                        map7 = map5;
                        resultLipp = resultLipp4;
                        int i118 = i11;
                        i10 = i4;
                        map4 = map7;
                        i14 = i118;
                        map8 = map4;
                        if (!resultLipp.m8371c().isEmpty()) {
                            List<ResultLippSentenceTranslation> listM8371c11114 = resultLipp.m8371c();
                            arrayList6 = new ArrayList(v91.m23189q0(listM8371c11114, 10));
                            while (r5.hasNext()) {
                                arrayList6.add(new j65(i5, resultLippSentenceTranslation.m8373b(), resultLippSentenceTranslation.m8372a()));
                            }
                            lessonRepositoryImpl$fetchLippData$1.f15382a = null;
                            lessonRepositoryImpl$fetchLippData$1.f15383b = resultLipp;
                            lessonRepositoryImpl$fetchLippData$1.f15384c = null;
                            lessonRepositoryImpl$fetchLippData$1.f15385d = map4;
                            lessonRepositoryImpl$fetchLippData$1.f15386e = null;
                            lessonRepositoryImpl$fetchLippData$1.f15387f = i5;
                            lessonRepositoryImpl$fetchLippData$1.f15388g = i14;
                            lessonRepositoryImpl$fetchLippData$1.f15389h = i10;
                            lessonRepositoryImpl$fetchLippData$1.f15381H = 6;
                            if (abstractC1320h.mo7498O0(arrayList6, lessonRepositoryImpl$fetchLippData$1) != coroutineSingletons3) {
                                resultLipp5 = resultLipp;
                                map9 = map4;
                                resultLipp = resultLipp5;
                                map8 = map9;
                            }
                        }
                        List<ResultLippSentenceTranslation> listM8371c11115 = resultLipp.m8371c();
                        arrayList7 = new ArrayList(v91.m23189q0(listM8371c11115, 10));
                        while (r1.hasNext()) {
                            arrayList7.add(new Pair(new Integer(resultLippSentenceTranslation2.m8372a()), resultLippSentenceTranslation2.m8373b()));
                        }
                        return new xm5(new oe5(map8, arrayList7));
                    }
                }
                return coroutineSingletons3;
            case 4:
                i4 = lessonRepositoryImpl$fetchLippData$1.f15389h;
                i11 = lessonRepositoryImpl$fetchLippData$1.f15388g;
                int i26 = lessonRepositoryImpl$fetchLippData$1.f15387f;
                linkedHashMap4 = lessonRepositoryImpl$fetchLippData$1.f15386e;
                Map map20 = lessonRepositoryImpl$fetchLippData$1.f15385d;
                String str7 = lessonRepositoryImpl$fetchLippData$1.f15384c;
                ResultLipp resultLipp6 = lessonRepositoryImpl$fetchLippData$1.f15383b;
                AbstractC3193b.m15359b(objM14897J);
                i5 = i26;
                str2 = str7;
                abstractC1320h = abstractC1320h3;
                obj = objM14897J;
                resultLipp4 = resultLipp6;
                map5 = map20;
                List list17 = (List) obj;
                iM15363P3 = AbstractC3194a.m15363P(v91.m23189q0(list17, 10));
                if (iM15363P3 < 16) {
                    iM15363P3 = 16;
                }
                linkedHashMap5 = new LinkedHashMap(iM15363P3);
                while (r8.hasNext()) {
                    linkedHashMap5.put(new Integer(((TranslationSentenceEntity) obj2).m7816d()), obj2);
                }
                arrayList4 = new ArrayList(linkedHashMap4.size());
                it6 = linkedHashMap4.entrySet().iterator();
                while (it6.hasNext()) {
                    Map.Entry entry10 = (Map.Entry) it6.next();
                    iIntValue3 = ((Number) entry10.getKey()).intValue();
                    str3 = (String) entry10.getValue();
                    translationSentenceEntity = (TranslationSentenceEntity) linkedHashMap5.get(new Integer(iIntValue3));
                    if (translationSentenceEntity != null) {
                        arrayListM22624p1 = u91.m22624p1(translationSentenceEntity.m7820h());
                        it8 = arrayListM22624p1.iterator();
                        i12 = 0;
                        while (true) {
                            if (it8.hasNext()) {
                                it7 = it6;
                                if (fa4.m11650l(((Translation) it8.next()).m8078a(), str2)) {
                                    i12++;
                                    it6 = it7;
                                }
                            } else {
                                it7 = it6;
                                i12 = -1;
                            }
                        }
                        translation = new Translation(str3, str2, false);
                        if (i12 >= 0) {
                            arrayListM22624p1.set(i12, translation);
                        } else {
                            arrayListM22624p1.add(translation);
                        }
                        ArrayList arrayList17 = arrayList4;
                        translationSentenceEntity2 = TranslationSentenceEntity.m7813a(translationSentenceEntity, null, null, null, arrayListM22624p1, null, 95);
                        arrayList5 = arrayList17;
                        linkedHashMap6 = linkedHashMap5;
                    } else {
                        it7 = it6;
                        arrayList5 = arrayList4;
                        linkedHashMap6 = linkedHashMap5;
                        translationSentenceEntity2 = new TranslationSentenceEntity(iIntValue3, i5, null, null, "", vz1.m23604J(new Translation(str3, str2, false)));
                    }
                    arrayList5.add(translationSentenceEntity2);
                    arrayList4 = arrayList5;
                    linkedHashMap5 = linkedHashMap6;
                    it6 = it7;
                }
                lessonRepositoryImpl$fetchLippData$1.f15382a = null;
                lessonRepositoryImpl$fetchLippData$1.f15383b = resultLipp4;
                lessonRepositoryImpl$fetchLippData$1.f15384c = null;
                lessonRepositoryImpl$fetchLippData$1.f15385d = map5;
                lessonRepositoryImpl$fetchLippData$1.f15386e = null;
                lessonRepositoryImpl$fetchLippData$1.f15387f = i5;
                lessonRepositoryImpl$fetchLippData$1.f15388g = i11;
                lessonRepositoryImpl$fetchLippData$1.f15389h = i4;
                lessonRepositoryImpl$fetchLippData$1.f15381H = 5;
                if (abstractC1320h.mo7496M0(arrayList4, lessonRepositoryImpl$fetchLippData$1) != coroutineSingletons3) {
                    map7 = map5;
                    resultLipp = resultLipp4;
                    int i119 = i11;
                    i10 = i4;
                    map4 = map7;
                    i14 = i119;
                    map8 = map4;
                    if (!resultLipp.m8371c().isEmpty()) {
                        List<ResultLippSentenceTranslation> listM8371c11116 = resultLipp.m8371c();
                        arrayList6 = new ArrayList(v91.m23189q0(listM8371c11116, 10));
                        while (r5.hasNext()) {
                            arrayList6.add(new j65(i5, resultLippSentenceTranslation.m8373b(), resultLippSentenceTranslation.m8372a()));
                        }
                        lessonRepositoryImpl$fetchLippData$1.f15382a = null;
                        lessonRepositoryImpl$fetchLippData$1.f15383b = resultLipp;
                        lessonRepositoryImpl$fetchLippData$1.f15384c = null;
                        lessonRepositoryImpl$fetchLippData$1.f15385d = map4;
                        lessonRepositoryImpl$fetchLippData$1.f15386e = null;
                        lessonRepositoryImpl$fetchLippData$1.f15387f = i5;
                        lessonRepositoryImpl$fetchLippData$1.f15388g = i14;
                        lessonRepositoryImpl$fetchLippData$1.f15389h = i10;
                        lessonRepositoryImpl$fetchLippData$1.f15381H = 6;
                        if (abstractC1320h.mo7498O0(arrayList6, lessonRepositoryImpl$fetchLippData$1) != coroutineSingletons3) {
                            resultLipp5 = resultLipp;
                            map9 = map4;
                            resultLipp = resultLipp5;
                            map8 = map9;
                        }
                    }
                    List<ResultLippSentenceTranslation> listM8371c11117 = resultLipp.m8371c();
                    arrayList7 = new ArrayList(v91.m23189q0(listM8371c11117, 10));
                    while (r1.hasNext()) {
                        arrayList7.add(new Pair(new Integer(resultLippSentenceTranslation2.m8372a()), resultLippSentenceTranslation2.m8373b()));
                    }
                    return new xm5(new oe5(map8, arrayList7));
                }
                return coroutineSingletons3;
            case 5:
                i4 = lessonRepositoryImpl$fetchLippData$1.f15389h;
                i11 = lessonRepositoryImpl$fetchLippData$1.f15388g;
                int i27 = lessonRepositoryImpl$fetchLippData$1.f15387f;
                Map map21 = lessonRepositoryImpl$fetchLippData$1.f15385d;
                resultLipp = lessonRepositoryImpl$fetchLippData$1.f15383b;
                AbstractC3193b.m15359b(objM14897J);
                i5 = i27;
                abstractC1320h = abstractC1320h3;
                map7 = map21;
                int i1110 = i11;
                i10 = i4;
                map4 = map7;
                i14 = i1110;
                map8 = map4;
                if (!resultLipp.m8371c().isEmpty()) {
                    List<ResultLippSentenceTranslation> listM8371c11118 = resultLipp.m8371c();
                    arrayList6 = new ArrayList(v91.m23189q0(listM8371c11118, 10));
                    while (r5.hasNext()) {
                        arrayList6.add(new j65(i5, resultLippSentenceTranslation.m8373b(), resultLippSentenceTranslation.m8372a()));
                    }
                    lessonRepositoryImpl$fetchLippData$1.f15382a = null;
                    lessonRepositoryImpl$fetchLippData$1.f15383b = resultLipp;
                    lessonRepositoryImpl$fetchLippData$1.f15384c = null;
                    lessonRepositoryImpl$fetchLippData$1.f15385d = map4;
                    lessonRepositoryImpl$fetchLippData$1.f15386e = null;
                    lessonRepositoryImpl$fetchLippData$1.f15387f = i5;
                    lessonRepositoryImpl$fetchLippData$1.f15388g = i14;
                    lessonRepositoryImpl$fetchLippData$1.f15389h = i10;
                    lessonRepositoryImpl$fetchLippData$1.f15381H = 6;
                    if (abstractC1320h.mo7498O0(arrayList6, lessonRepositoryImpl$fetchLippData$1) != coroutineSingletons3) {
                        resultLipp5 = resultLipp;
                        map9 = map4;
                        resultLipp = resultLipp5;
                        map8 = map9;
                    }
                    return coroutineSingletons3;
                }
                List<ResultLippSentenceTranslation> listM8371c11119 = resultLipp.m8371c();
                arrayList7 = new ArrayList(v91.m23189q0(listM8371c11119, 10));
                while (r1.hasNext()) {
                    arrayList7.add(new Pair(new Integer(resultLippSentenceTranslation2.m8372a()), resultLippSentenceTranslation2.m8373b()));
                }
                return new xm5(new oe5(map8, arrayList7));
            case 6:
                Map map22 = lessonRepositoryImpl$fetchLippData$1.f15385d;
                resultLipp5 = lessonRepositoryImpl$fetchLippData$1.f15383b;
                AbstractC3193b.m15359b(objM14897J);
                map9 = map22;
                resultLipp = resultLipp5;
                map8 = map9;
                List<ResultLippSentenceTranslation> listM8371c111110 = resultLipp.m8371c();
                arrayList7 = new ArrayList(v91.m23189q0(listM8371c111110, 10));
                while (r1.hasNext()) {
                    arrayList7.add(new Pair(new Integer(resultLippSentenceTranslation2.m8372a()), resultLippSentenceTranslation2.m8373b()));
                }
                return new xm5(new oe5(map8, arrayList7));
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: z */
    public final Object m7306z(int i, int i2, String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        LessonRepositoryImpl$fetchSentenceTranslation$1 lessonRepositoryImpl$fetchSentenceTranslation$1;
        ArrayList<TranslationSentenceEntity> arrayList;
        int i3;
        String str3;
        ArrayList arrayList2;
        Iterator it;
        Object next;
        Translation translation;
        j65 j65Var;
        if (continuationImpl instanceof LessonRepositoryImpl$fetchSentenceTranslation$1) {
            lessonRepositoryImpl$fetchSentenceTranslation$1 = (LessonRepositoryImpl$fetchSentenceTranslation$1) continuationImpl;
            int i4 = lessonRepositoryImpl$fetchSentenceTranslation$1.f15400g;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$fetchSentenceTranslation$1.f15400g = i4 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$fetchSentenceTranslation$1 = new LessonRepositoryImpl$fetchSentenceTranslation$1(this, continuationImpl);
            }
        } else {
            lessonRepositoryImpl$fetchSentenceTranslation$1 = new LessonRepositoryImpl$fetchSentenceTranslation$1(this, continuationImpl);
        }
        Object objM14914w = lessonRepositoryImpl$fetchSentenceTranslation$1.f15398e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = lessonRepositoryImpl$fetchSentenceTranslation$1.f15400g;
        xfa xfaVar = xfa.f68157a;
        AbstractC1320h abstractC1320h = this.f16498b;
        if (i5 == 0) {
            AbstractC3193b.m15359b(objM14914w);
            RequestRefreshTranslateSentence requestRefreshTranslateSentence = new RequestRefreshTranslateSentence(str2, new Integer(i2), new Integer(3));
            lessonRepositoryImpl$fetchSentenceTranslation$1.f15394a = str2;
            lessonRepositoryImpl$fetchSentenceTranslation$1.f15396c = i;
            lessonRepositoryImpl$fetchSentenceTranslation$1.f15397d = i2;
            lessonRepositoryImpl$fetchSentenceTranslation$1.f15400g = 1;
            objM14914w = this.f16502f.m14914w(str, i, requestRefreshTranslateSentence, lessonRepositoryImpl$fetchSentenceTranslation$1);
            if (objM14914w != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i5 == 1) {
            i2 = lessonRepositoryImpl$fetchSentenceTranslation$1.f15397d;
            i = lessonRepositoryImpl$fetchSentenceTranslation$1.f15396c;
            str2 = lessonRepositoryImpl$fetchSentenceTranslation$1.f15394a;
            AbstractC3193b.m15359b(objM14914w);
        } else {
            if (i5 != 2) {
                if (i5 == 3) {
                    AbstractC3193b.m15359b(objM14914w);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i3 = lessonRepositoryImpl$fetchSentenceTranslation$1.f15397d;
            i = lessonRepositoryImpl$fetchSentenceTranslation$1.f15396c;
            arrayList = lessonRepositoryImpl$fetchSentenceTranslation$1.f15395b;
            str3 = lessonRepositoryImpl$fetchSentenceTranslation$1.f15394a;
            AbstractC3193b.m15359b(objM14914w);
        }
        arrayList2 = new ArrayList();
        for (TranslationSentenceEntity translationSentenceEntity : arrayList) {
            it = translationSentenceEntity.m7820h().iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!fa4.m11650l(((Translation) next).m8078a(), str3));
            translation = (Translation) next;
            if (translation != null || vk9.m23391n0(translation.m8079b())) {
                j65Var = null;
            } else {
                j65Var = new j65(i, translation.m8079b(), translationSentenceEntity.m7816d());
            }
            if (j65Var != null) {
                arrayList2.add(j65Var);
            }
        }
        if (!arrayList2.isEmpty()) {
            lessonRepositoryImpl$fetchSentenceTranslation$1.f15394a = null;
            lessonRepositoryImpl$fetchSentenceTranslation$1.f15395b = null;
            lessonRepositoryImpl$fetchSentenceTranslation$1.f15396c = i;
            lessonRepositoryImpl$fetchSentenceTranslation$1.f15397d = i3;
            lessonRepositoryImpl$fetchSentenceTranslation$1.f15400g = 3;
            if (abstractC1320h.mo7498O0(arrayList2, lessonRepositoryImpl$fetchSentenceTranslation$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfaVar;
        ArrayList arrayListM22311c = tuc.m22311c(i, (List) objM14914w);
        lessonRepositoryImpl$fetchSentenceTranslation$1.f15394a = str2;
        lessonRepositoryImpl$fetchSentenceTranslation$1.f15395b = arrayListM22311c;
        lessonRepositoryImpl$fetchSentenceTranslation$1.f15396c = i;
        lessonRepositoryImpl$fetchSentenceTranslation$1.f15397d = i2;
        lessonRepositoryImpl$fetchSentenceTranslation$1.f15400g = 2;
        if (abstractC1320h.mo7496M0(arrayListM22311c, lessonRepositoryImpl$fetchSentenceTranslation$1) != coroutineSingletons) {
            int i6 = i2;
            arrayList = arrayListM22311c;
            i3 = i6;
            str3 = str2;
            arrayList2 = new ArrayList();
            while (r12.hasNext()) {
                it = translationSentenceEntity.m7820h().iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!fa4.m11650l(((Translation) next).m8078a(), str3));
                translation = (Translation) next;
                if (translation != null) {
                    j65Var = null;
                } else {
                    j65Var = null;
                }
                if (j65Var != null) {
                    arrayList2.add(j65Var);
                }
            }
            if (!arrayList2.isEmpty()) {
                lessonRepositoryImpl$fetchSentenceTranslation$1.f15394a = null;
                lessonRepositoryImpl$fetchSentenceTranslation$1.f15395b = null;
                lessonRepositoryImpl$fetchSentenceTranslation$1.f15396c = i;
                lessonRepositoryImpl$fetchSentenceTranslation$1.f15397d = i3;
                lessonRepositoryImpl$fetchSentenceTranslation$1.f15400g = 3;
                if (abstractC1320h.mo7498O0(arrayList2, lessonRepositoryImpl$fetchSentenceTranslation$1) == coroutineSingletons) {
                }
            }
            return xfaVar;
        }
        return coroutineSingletons;
    }
}
