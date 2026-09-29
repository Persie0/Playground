package com.lingq.feature.reader.progress.domain;

import com.lingq.core.datastore.C1371d;
import com.lingq.core.domain.model.lesson.LessonBookmark;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.ISOChronology;
import p000.C3386nv;
import p000.c83;
import p000.hy3;
import p000.t22;
import p000.vma;

/* JADX INFO: renamed from: com.lingq.feature.reader.progress.domain.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2473c {

    /* JADX INFO: renamed from: a */
    public final vma f29914a;

    public C2473c(vma vmaVar) {
        vmaVar.getClass();
        this.f29914a = vmaVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m9381a(int i, int i2, ContinuationImpl continuationImpl) throws Throwable {
        PersistLessonPageBookmarkLocallyUseCase$invoke$1 persistLessonPageBookmarkLocallyUseCase$invoke$1;
        LessonBookmark lessonBookmark;
        int i3;
        if (continuationImpl instanceof PersistLessonPageBookmarkLocallyUseCase$invoke$1) {
            persistLessonPageBookmarkLocallyUseCase$invoke$1 = (PersistLessonPageBookmarkLocallyUseCase$invoke$1) continuationImpl;
            int i4 = persistLessonPageBookmarkLocallyUseCase$invoke$1.f29902f;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                persistLessonPageBookmarkLocallyUseCase$invoke$1.f29902f = i4 - Integer.MIN_VALUE;
            } else {
                persistLessonPageBookmarkLocallyUseCase$invoke$1 = new PersistLessonPageBookmarkLocallyUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            persistLessonPageBookmarkLocallyUseCase$invoke$1 = new PersistLessonPageBookmarkLocallyUseCase$invoke$1(this, continuationImpl);
        }
        Object objM15541t = persistLessonPageBookmarkLocallyUseCase$invoke$1.f29900d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = persistLessonPageBookmarkLocallyUseCase$invoke$1.f29902f;
        vma vmaVar = this.f29914a;
        if (i5 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            DateTimeZone dateTimeZone = DateTimeZone.f54829a;
            if (dateTimeZone == null) {
                C3386nv.m17635v("Zone must not be null");
                return null;
            }
            AtomicReference atomicReference = t22.f61763a;
            String strM14766a = hy3.f43148E.m14766a(new DateTime(System.currentTimeMillis(), ISOChronology.m18438R(dateTimeZone)));
            LessonBookmark lessonBookmark2 = new LessonBookmark(i, new Integer(i2), strM14766a, strM14766a, 68);
            c83 c83Var = ((C1371d) vmaVar).f18583t;
            persistLessonPageBookmarkLocallyUseCase$invoke$1.f29899c = lessonBookmark2;
            persistLessonPageBookmarkLocallyUseCase$invoke$1.f29897a = i;
            persistLessonPageBookmarkLocallyUseCase$invoke$1.f29898b = i2;
            persistLessonPageBookmarkLocallyUseCase$invoke$1.f29902f = 1;
            objM15541t = AbstractC3224d.m15541t(c83Var, persistLessonPageBookmarkLocallyUseCase$invoke$1);
            if (objM15541t != coroutineSingletons) {
                lessonBookmark = lessonBookmark2;
                i3 = i;
            }
        }
        if (i5 != 1) {
            if (i5 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            LessonBookmark lessonBookmark3 = persistLessonPageBookmarkLocallyUseCase$invoke$1.f29899c;
            AbstractC3193b.m15359b(objM15541t);
            return lessonBookmark3;
        }
        i2 = persistLessonPageBookmarkLocallyUseCase$invoke$1.f29898b;
        i3 = persistLessonPageBookmarkLocallyUseCase$invoke$1.f29897a;
        lessonBookmark = persistLessonPageBookmarkLocallyUseCase$invoke$1.f29899c;
        AbstractC3193b.m15359b(objM15541t);
        LinkedHashMap linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) objM15541t);
        linkedHashMapM15372Y.put(new Integer(i3), lessonBookmark);
        persistLessonPageBookmarkLocallyUseCase$invoke$1.f29899c = lessonBookmark;
        persistLessonPageBookmarkLocallyUseCase$invoke$1.f29897a = i3;
        persistLessonPageBookmarkLocallyUseCase$invoke$1.f29898b = i2;
        persistLessonPageBookmarkLocallyUseCase$invoke$1.f29902f = 2;
        return ((C1371d) vmaVar).m7965e(linkedHashMapM15372Y, persistLessonPageBookmarkLocallyUseCase$invoke$1) == coroutineSingletons ? coroutineSingletons : lessonBookmark;
    }
}
