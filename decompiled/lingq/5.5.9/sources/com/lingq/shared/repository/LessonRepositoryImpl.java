package com.lingq.shared.repository;

import ae.C0062b;
import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.room.RoomDatabaseKt;
import androidx.work.BackoffPolicy;
import androidx.work.C1244b;
import androidx.work.NetworkType;
import bi.AbstractC1388a;
import bi.AbstractC1454i2;
import bi.AbstractC1495o1;
import bi.AbstractC1562x5;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.Lesson;
import com.lingq.entity.LessonBookmark;
import com.lingq.entity.LessonTag;
import com.lingq.entity.LibraryCounter;
import com.lingq.entity.LibraryData;
import com.lingq.entity.SharedByUser;
import com.lingq.entity.SharedByUserAndQueryJoin;
import com.lingq.entity.Translation;
import com.lingq.entity.TranslationSentence;
import com.lingq.shared.network.requests.RequestBookmarkLesson;
import com.lingq.shared.network.requests.RequestLessonImport;
import com.lingq.shared.network.requests.RequestLessonUpdateSave;
import com.lingq.shared.network.requests.RequestLessonUpdateStats;
import com.lingq.shared.network.requests.RequestTranslateSentence;
import com.lingq.shared.network.requests.RequestTranslation;
import com.lingq.shared.network.requests.RequestTranslationSentence;
import com.lingq.shared.network.result.ResultLesson;
import com.lingq.shared.network.result.ResultLessonBookmark;
import com.lingq.shared.network.result.ResultLessonInfo;
import com.lingq.shared.network.result.ResultLessonTags;
import com.lingq.shared.network.result.ResultLessonUpload;
import com.lingq.shared.network.result.ResultLibraryCounter;
import com.lingq.shared.network.result.ResultSharedByUser;
import com.lingq.shared.network.result.ResultTranslationSentence;
import com.lingq.shared.network.result.ResultTranslationSentenceV2;
import com.lingq.shared.network.result.ResultTranslationV2;
import com.lingq.shared.network.result.Results;
import com.lingq.shared.network.workers.LessonAudioUploadWorker;
import com.lingq.shared.network.workers.LessonBookmarkWorker;
import com.lingq.shared.network.workers.LessonCompleteWorker;
import com.lingq.shared.network.workers.LessonDeleteRoseWorker;
import com.lingq.shared.network.workers.LessonGiveRoseWorker;
import com.lingq.shared.network.workers.LessonSaveRemoveWorker;
import com.lingq.shared.network.workers.LessonUpdateStatsWorker;
import com.lingq.shared.persistent.LingQDatabase;
import com.lingq.shared.uimodel.lesson.LessonStudy;
import com.lingq.shared.uimodel.lesson.LessonStudyBookmark;
import com.lingq.shared.uimodel.lesson.LessonStudySentence;
import com.lingq.shared.uimodel.lesson.LessonStudyTranslationSentence;
import com.lingq.shared.uimodel.library.CollectionsFilterLessonTag;
import com.lingq.shared.uimodel.library.CollectionsFilterUser;
import com.lingq.shared.uimodel.library.LessonInfo;
import com.lingq.shared.uimodel.library.LibraryItemType;
import dm.C5206f;
import dm.C5207g;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import ki.C6695a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.p228io.C6763a;
import kotlin.text.C7075a;
import kotlin.text.C7076b;
import kotlin.text.Regex;
import kotlinx.coroutines.flow.C7136q;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import mo.C7653a;
import mo.C7661i;
import ni.C7793a;
import ni.C7796d;
import p026b5.AbstractC1317j;
import p026b5.C1309b;
import p026b5.C1315h;
import p124fp.InterfaceC5610g;
import p159hi.C6050a;
import p260m8.C7499b;
import p338qd.C8573r0;
import p349qo.C8656b;
import p367rh.C8802p;
import p385sf.C9000b;
import p460wh.InterfaceC9938f;
import p460wh.InterfaceC9939g;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import so.AbstractC9107y;
import so.C9095m;
import so.C9098p;
import so.C9099q;
import so.C9102t;
import tl.C9325m;

/* JADX INFO: loaded from: classes.dex */
public final class LessonRepositoryImpl implements InterfaceC3324a {

    /* JADX INFO: renamed from: a */
    public final LingQDatabase f19827a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1495o1 f19828b;

    /* JADX INFO: renamed from: c */
    public final AbstractC1388a f19829c;

    /* JADX INFO: renamed from: d */
    public final AbstractC1562x5 f19830d;

    /* JADX INFO: renamed from: e */
    public final AbstractC1454i2 f19831e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC9938f f19832f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC9939g f19833g;

    /* JADX INFO: renamed from: h */
    public final C7796d f19834h;

    /* JADX INFO: renamed from: i */
    public final AbstractC1317j f19835i;

    public LessonRepositoryImpl(LingQDatabase lingQDatabase, AbstractC1495o1 abstractC1495o1, AbstractC1388a abstractC1388a, AbstractC1562x5 abstractC1562x5, AbstractC1454i2 abstractC1454i2, InterfaceC9938f interfaceC9938f, InterfaceC9939g interfaceC9939g, C7796d c7796d, AbstractC1317j abstractC1317j) {
        C5207g.m11111f(lingQDatabase, "db");
        C5207g.m11111f(abstractC1495o1, "lessonDao");
        C5207g.m11111f(abstractC1388a, "cardDao");
        C5207g.m11111f(abstractC1562x5, "wordDao");
        C5207g.m11111f(abstractC1454i2, "libraryDao");
        C5207g.m11111f(interfaceC9938f, "lessonService");
        C5207g.m11111f(interfaceC9939g, "libraryService");
        C5207g.m11111f(c7796d, "analytics");
        C5207g.m11111f(abstractC1317j, "workManager");
        this.f19827a = lingQDatabase;
        this.f19828b = abstractC1495o1;
        this.f19829c = abstractC1388a;
        this.f19830d = abstractC1562x5;
        this.f19831e = abstractC1454i2;
        this.f19832f = interfaceC9938f;
        this.f19833g = interfaceC9939g;
        this.f19834h = c7796d;
        this.f19835i = abstractC1317j;
    }

    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: A */
    public final InterfaceC7116c<LessonStudyTranslationSentence> mo9479A(int i10, int i11) {
        return C0062b.m273H0(this.f19828b.mo5160z0(i10, i11 + 1));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: B */
    public final Object mo9480B(String str, String str2, String str3, InterfaceC9968c<? super LessonStudy> interfaceC9968c) throws Throwable {
        LessonRepositoryImpl$networkImportLesson$1 lessonRepositoryImpl$networkImportLesson$1;
        LessonRepositoryImpl lessonRepositoryImpl;
        ResultLesson resultLesson;
        if (interfaceC9968c instanceof LessonRepositoryImpl$networkImportLesson$1) {
            lessonRepositoryImpl$networkImportLesson$1 = (LessonRepositoryImpl$networkImportLesson$1) interfaceC9968c;
            int i10 = lessonRepositoryImpl$networkImportLesson$1.f19877h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$networkImportLesson$1.f19877h = i10 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$networkImportLesson$1 = new LessonRepositoryImpl$networkImportLesson$1(this, interfaceC9968c);
            }
        } else {
            lessonRepositoryImpl$networkImportLesson$1 = new LessonRepositoryImpl$networkImportLesson$1(this, interfaceC9968c);
        }
        Object objM18476r = lessonRepositoryImpl$networkImportLesson$1.f19875f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = lessonRepositoryImpl$networkImportLesson$1.f19877h;
        if (i11 != 0) {
            if (i11 == 1) {
                LessonRepositoryImpl lessonRepositoryImpl2 = lessonRepositoryImpl$networkImportLesson$1.f19873d;
                C7499b.m14977z0(objM18476r);
                lessonRepositoryImpl = lessonRepositoryImpl2;
            } else if (i11 == 2) {
                resultLesson = lessonRepositoryImpl$networkImportLesson$1.f19874e;
                lessonRepositoryImpl = lessonRepositoryImpl$networkImportLesson$1.f19873d;
                C7499b.m14977z0(objM18476r);
                AbstractC1495o1 abstractC1495o1 = lessonRepositoryImpl.f19828b;
                int i12 = resultLesson.f18520a;
                lessonRepositoryImpl$networkImportLesson$1.f19873d = null;
                lessonRepositoryImpl$networkImportLesson$1.f19874e = null;
                lessonRepositoryImpl$networkImportLesson$1.f19877h = 3;
                objM18476r = abstractC1495o1.mo5157w0(i12, lessonRepositoryImpl$networkImportLesson$1);
                if (objM18476r == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objM18476r);
            }
            return objM18476r;
        }
        C7499b.m14977z0(objM18476r);
        RequestLessonImport requestLessonImport = new RequestLessonImport();
        requestLessonImport.f18098a = str2;
        requestLessonImport.f18103f = "true";
        requestLessonImport.f18104g = "private";
        requestLessonImport.f18105h = "App";
        requestLessonImport.f18107j = str3;
        lessonRepositoryImpl$networkImportLesson$1.f19873d = this;
        lessonRepositoryImpl$networkImportLesson$1.f19877h = 1;
        objM18476r = this.f19832f.m18476r(str, requestLessonImport, lessonRepositoryImpl$networkImportLesson$1);
        if (objM18476r == coroutineSingletons) {
            return coroutineSingletons;
        }
        lessonRepositoryImpl = this;
        resultLesson = (ResultLesson) objM18476r;
        AbstractC1495o1 abstractC1495o2 = lessonRepositoryImpl.f19828b;
        Lesson lessonM16902j = C8656b.m16902j(resultLesson);
        lessonRepositoryImpl$networkImportLesson$1.f19873d = lessonRepositoryImpl;
        lessonRepositoryImpl$networkImportLesson$1.f19874e = resultLesson;
        lessonRepositoryImpl$networkImportLesson$1.f19877h = 2;
        if (abstractC1495o2.mo598h0(lessonM16902j, lessonRepositoryImpl$networkImportLesson$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        AbstractC1495o1 abstractC1495o3 = lessonRepositoryImpl.f19828b;
        int i13 = resultLesson.f18520a;
        lessonRepositoryImpl$networkImportLesson$1.f19873d = null;
        lessonRepositoryImpl$networkImportLesson$1.f19874e = null;
        lessonRepositoryImpl$networkImportLesson$1.f19877h = 3;
        objM18476r = abstractC1495o3.mo5157w0(i13, lessonRepositoryImpl$networkImportLesson$1);
        if (objM18476r == coroutineSingletons) {
            return coroutineSingletons;
        }
        return objM18476r;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: C */
    public final Object mo9481C(int i10, boolean z10, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        LessonRepositoryImpl$updateIsTaken$1 lessonRepositoryImpl$updateIsTaken$1;
        LessonRepositoryImpl lessonRepositoryImpl;
        int i11;
        boolean z11;
        LessonRepositoryImpl lessonRepositoryImpl2;
        LibraryData libraryData;
        if (interfaceC9968c instanceof LessonRepositoryImpl$updateIsTaken$1) {
            lessonRepositoryImpl$updateIsTaken$1 = (LessonRepositoryImpl$updateIsTaken$1) interfaceC9968c;
            int i12 = lessonRepositoryImpl$updateIsTaken$1.f19952i;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$updateIsTaken$1.f19952i = i12 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$updateIsTaken$1 = new LessonRepositoryImpl$updateIsTaken$1(this, interfaceC9968c);
            }
        } else {
            lessonRepositoryImpl$updateIsTaken$1 = new LessonRepositoryImpl$updateIsTaken$1(this, interfaceC9968c);
        }
        Object objMo5149o0 = lessonRepositoryImpl$updateIsTaken$1.f19950g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i13 = lessonRepositoryImpl$updateIsTaken$1.f19952i;
        if (i13 != 0) {
            if (i13 == 1) {
                z10 = lessonRepositoryImpl$updateIsTaken$1.f19949f;
                i10 = lessonRepositoryImpl$updateIsTaken$1.f19948e;
                lessonRepositoryImpl = lessonRepositoryImpl$updateIsTaken$1.f19947d;
                C7499b.m14977z0(objMo5149o0);
            } else {
                if (i13 == 2) {
                    z11 = lessonRepositoryImpl$updateIsTaken$1.f19949f;
                    i11 = lessonRepositoryImpl$updateIsTaken$1.f19948e;
                    lessonRepositoryImpl = lessonRepositoryImpl$updateIsTaken$1.f19947d;
                    C7499b.m14977z0(objMo5149o0);
                    C5206f.m11026v0(((Number) objMo5149o0).longValue());
                    AbstractC1454i2 abstractC1454i2 = lessonRepositoryImpl.f19831e;
                    lessonRepositoryImpl$updateIsTaken$1.f19947d = lessonRepositoryImpl;
                    lessonRepositoryImpl$updateIsTaken$1.f19949f = z11;
                    lessonRepositoryImpl$updateIsTaken$1.f19952i = 3;
                    objMo5149o0 = abstractC1454i2.mo5079w0(i11, lessonRepositoryImpl$updateIsTaken$1);
                    if (objMo5149o0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lessonRepositoryImpl2 = lessonRepositoryImpl;
                    libraryData = (LibraryData) objMo5149o0;
                    if (libraryData != null) {
                        libraryData.f17229H = Boolean.valueOf(z11);
                        AbstractC1454i2 abstractC1454i3 = lessonRepositoryImpl2.f19831e;
                        lessonRepositoryImpl$updateIsTaken$1.f19947d = null;
                        lessonRepositoryImpl$updateIsTaken$1.f19952i = 4;
                        objMo5149o0 = abstractC1454i3.mo598h0(libraryData, lessonRepositoryImpl$updateIsTaken$1);
                        if (objMo5149o0 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return C9072e.f47360a;
                }
                if (i13 == 3) {
                    z11 = lessonRepositoryImpl$updateIsTaken$1.f19949f;
                    lessonRepositoryImpl2 = lessonRepositoryImpl$updateIsTaken$1.f19947d;
                    C7499b.m14977z0(objMo5149o0);
                    libraryData = (LibraryData) objMo5149o0;
                    if (libraryData != null) {
                        libraryData.f17229H = Boolean.valueOf(z11);
                        AbstractC1454i2 abstractC1454i4 = lessonRepositoryImpl2.f19831e;
                        lessonRepositoryImpl$updateIsTaken$1.f19947d = null;
                        lessonRepositoryImpl$updateIsTaken$1.f19952i = 4;
                        objMo5149o0 = abstractC1454i4.mo598h0(libraryData, lessonRepositoryImpl$updateIsTaken$1);
                        if (objMo5149o0 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return C9072e.f47360a;
                }
                if (i13 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objMo5149o0);
            }
            C5206f.m11026v0(((Number) objMo5149o0).longValue());
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objMo5149o0);
        lessonRepositoryImpl$updateIsTaken$1.f19947d = this;
        lessonRepositoryImpl$updateIsTaken$1.f19948e = i10;
        lessonRepositoryImpl$updateIsTaken$1.f19949f = z10;
        lessonRepositoryImpl$updateIsTaken$1.f19952i = 1;
        objMo5149o0 = this.f19828b.mo5149o0(i10, lessonRepositoryImpl$updateIsTaken$1);
        if (objMo5149o0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        lessonRepositoryImpl = this;
        Lesson lesson = (Lesson) objMo5149o0;
        if (lesson != null) {
            lesson.f17136v0 = Boolean.valueOf(z10);
            AbstractC1495o1 abstractC1495o1 = lessonRepositoryImpl.f19828b;
            lessonRepositoryImpl$updateIsTaken$1.f19947d = lessonRepositoryImpl;
            lessonRepositoryImpl$updateIsTaken$1.f19948e = i10;
            lessonRepositoryImpl$updateIsTaken$1.f19949f = z10;
            lessonRepositoryImpl$updateIsTaken$1.f19952i = 2;
            objMo5149o0 = abstractC1495o1.mo598h0(lesson, lessonRepositoryImpl$updateIsTaken$1);
            if (objMo5149o0 == coroutineSingletons) {
                return coroutineSingletons;
            }
            boolean z12 = z10;
            i11 = i10;
            z11 = z12;
            C5206f.m11026v0(((Number) objMo5149o0).longValue());
        } else {
            boolean z13 = z10;
            i11 = i10;
            z11 = z13;
        }
        AbstractC1454i2 abstractC1454i5 = lessonRepositoryImpl.f19831e;
        lessonRepositoryImpl$updateIsTaken$1.f19947d = lessonRepositoryImpl;
        lessonRepositoryImpl$updateIsTaken$1.f19949f = z11;
        lessonRepositoryImpl$updateIsTaken$1.f19952i = 3;
        objMo5149o0 = abstractC1454i5.mo5079w0(i11, lessonRepositoryImpl$updateIsTaken$1);
        if (objMo5149o0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        lessonRepositoryImpl2 = lessonRepositoryImpl;
        libraryData = (LibraryData) objMo5149o0;
        if (libraryData != null) {
            libraryData.f17229H = Boolean.valueOf(z11);
            AbstractC1454i2 abstractC1454i6 = lessonRepositoryImpl2.f19831e;
            lessonRepositoryImpl$updateIsTaken$1.f19947d = null;
            lessonRepositoryImpl$updateIsTaken$1.f19952i = 4;
            objMo5149o0 = abstractC1454i6.mo598h0(libraryData, lessonRepositoryImpl$updateIsTaken$1);
            if (objMo5149o0 == coroutineSingletons) {
                return coroutineSingletons;
            }
            C5206f.m11026v0(((Number) objMo5149o0).longValue());
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0095  */
    /* JADX WARN: Code duplicated, block: B:34:0x009b  */
    /* JADX WARN: Code duplicated, block: B:36:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:44:0x0102 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x0116  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: D */
    public final Object mo9482D(int i10, String str, InterfaceC9968c interfaceC9968c) throws Throwable {
        LessonRepositoryImpl$updateLessonPreview$1 lessonRepositoryImpl$updateLessonPreview$1;
        LessonRepositoryImpl lessonRepositoryImpl;
        AbstractC9107y abstractC9107y;
        Lesson lesson;
        AbstractC9107y.a aVar;
        C9098p c9098pMo13137l;
        Charset charsetM17338a;
        if (interfaceC9968c instanceof LessonRepositoryImpl$updateLessonPreview$1) {
            lessonRepositoryImpl$updateLessonPreview$1 = (LessonRepositoryImpl$updateLessonPreview$1) interfaceC9968c;
            int i11 = lessonRepositoryImpl$updateLessonPreview$1.f19988i;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$updateLessonPreview$1.f19988i = i11 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$updateLessonPreview$1 = new LessonRepositoryImpl$updateLessonPreview$1(this, interfaceC9968c);
            }
        } else {
            lessonRepositoryImpl$updateLessonPreview$1 = new LessonRepositoryImpl$updateLessonPreview$1(this, interfaceC9968c);
        }
        Object objM18469k = lessonRepositoryImpl$updateLessonPreview$1.f19986g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = lessonRepositoryImpl$updateLessonPreview$1.f19988i;
        if (i12 != 0) {
            if (i12 == 1) {
                i10 = lessonRepositoryImpl$updateLessonPreview$1.f19985f;
                lessonRepositoryImpl = lessonRepositoryImpl$updateLessonPreview$1.f19983d;
                C7499b.m14977z0(objM18469k);
            } else {
                if (i12 == 2) {
                    abstractC9107y = lessonRepositoryImpl$updateLessonPreview$1.f19984e;
                    lessonRepositoryImpl = lessonRepositoryImpl$updateLessonPreview$1.f19983d;
                    C7499b.m14977z0(objM18469k);
                    lesson = (Lesson) objM18469k;
                    if (lesson == null) {
                        aVar = abstractC9107y.f47588a;
                        if (aVar == null) {
                            InterfaceC5610g interfaceC5610gMo13138q = abstractC9107y.mo13138q();
                            c9098pMo13137l = abstractC9107y.mo13137l();
                            if (c9098pMo13137l == null) {
                                charsetM17338a = null;
                            } else {
                                charsetM17338a = c9098pMo13137l.m17338a(C7653a.f42116b);
                            }
                            if (charsetM17338a == null) {
                                charsetM17338a = C7653a.f42116b;
                            }
                            aVar = new AbstractC9107y.a(interfaceC5610gMo13138q, charsetM17338a);
                            abstractC9107y.f47588a = aVar;
                        }
                        try {
                            String strM13477b = C6763a.m13477b(aVar);
                            C5206f.m11032z0(aVar, null);
                            String string = C7076b.m14277B3(C7075a.m14274I2(new Regex("(?m)^[ \t]*\r?\n").m14272c(strM13477b, ""))).toString();
                            C5207g.m11111f(string, "<set-?>");
                            lesson.f17134u0 = string;
                            AbstractC1495o1 abstractC1495o1 = lessonRepositoryImpl.f19828b;
                            lessonRepositoryImpl$updateLessonPreview$1.f19983d = null;
                            lessonRepositoryImpl$updateLessonPreview$1.f19984e = null;
                            lessonRepositoryImpl$updateLessonPreview$1.f19988i = 3;
                            objM18469k = abstractC1495o1.mo598h0(lesson, lessonRepositoryImpl$updateLessonPreview$1);
                            if (objM18469k == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                C5206f.m11032z0(aVar, th2);
                                throw th3;
                            }
                        }
                    }
                    return C9072e.f47360a;
                }
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objM18469k);
            }
            C5206f.m11026v0(((Number) objM18469k).longValue());
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objM18469k);
        InterfaceC9938f interfaceC9938f = this.f19832f;
        Integer num = new Integer(i10);
        lessonRepositoryImpl$updateLessonPreview$1.f19983d = this;
        lessonRepositoryImpl$updateLessonPreview$1.f19985f = i10;
        lessonRepositoryImpl$updateLessonPreview$1.f19988i = 1;
        objM18469k = interfaceC9938f.m18469k(str, num, "text", true, lessonRepositoryImpl$updateLessonPreview$1);
        if (objM18469k == coroutineSingletons) {
            return coroutineSingletons;
        }
        lessonRepositoryImpl = this;
        AbstractC9107y abstractC9107y2 = (AbstractC9107y) objM18469k;
        AbstractC1495o1 abstractC1495o2 = lessonRepositoryImpl.f19828b;
        lessonRepositoryImpl$updateLessonPreview$1.f19983d = lessonRepositoryImpl;
        lessonRepositoryImpl$updateLessonPreview$1.f19984e = abstractC9107y2;
        lessonRepositoryImpl$updateLessonPreview$1.f19988i = 2;
        Object objMo5149o0 = abstractC1495o2.mo5149o0(i10, lessonRepositoryImpl$updateLessonPreview$1);
        if (objMo5149o0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        objM18469k = objMo5149o0;
        abstractC9107y = abstractC9107y2;
        lesson = (Lesson) objM18469k;
        if (lesson == null) {
            aVar = abstractC9107y.f47588a;
            if (aVar == null) {
                InterfaceC5610g interfaceC5610gMo13138q2 = abstractC9107y.mo13138q();
                c9098pMo13137l = abstractC9107y.mo13137l();
                if (c9098pMo13137l == null) {
                    charsetM17338a = null;
                } else {
                    charsetM17338a = c9098pMo13137l.m17338a(C7653a.f42116b);
                }
                if (charsetM17338a == null) {
                    charsetM17338a = C7653a.f42116b;
                }
                aVar = new AbstractC9107y.a(interfaceC5610gMo13138q2, charsetM17338a);
                abstractC9107y.f47588a = aVar;
            }
            String strM13477b2 = C6763a.m13477b(aVar);
            C5206f.m11032z0(aVar, null);
            String string2 = C7076b.m14277B3(C7075a.m14274I2(new Regex("(?m)^[ \t]*\r?\n").m14272c(strM13477b2, ""))).toString();
            C5207g.m11111f(string2, "<set-?>");
            lesson.f17134u0 = string2;
            AbstractC1495o1 abstractC1495o3 = lessonRepositoryImpl.f19828b;
            lessonRepositoryImpl$updateLessonPreview$1.f19983d = null;
            lessonRepositoryImpl$updateLessonPreview$1.f19984e = null;
            lessonRepositoryImpl$updateLessonPreview$1.f19988i = 3;
            objM18469k = abstractC1495o3.mo598h0(lesson, lessonRepositoryImpl$updateLessonPreview$1);
            if (objM18469k == coroutineSingletons) {
                return coroutineSingletons;
            }
            C5206f.m11026v0(((Number) objM18469k).longValue());
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0075  */
    /* JADX WARN: Code duplicated, block: B:29:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:? A[LOOP:0: B:21:0x006f->B:31:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: E */
    public final Object mo9483E(int i10, int i11, String str, InterfaceC9968c interfaceC9968c, boolean z10) throws Throwable {
        LessonRepositoryImpl$updateSaveAllLessons$1 lessonRepositoryImpl$updateSaveAllLessons$1;
        LessonRepositoryImpl lessonRepositoryImpl;
        LessonRepositoryImpl lessonRepositoryImpl2;
        int i12;
        boolean z11;
        String str2;
        Iterator it;
        int iIntValue;
        if (interfaceC9968c instanceof LessonRepositoryImpl$updateSaveAllLessons$1) {
            lessonRepositoryImpl$updateSaveAllLessons$1 = (LessonRepositoryImpl$updateSaveAllLessons$1) interfaceC9968c;
            int i13 = lessonRepositoryImpl$updateSaveAllLessons$1.f20054k;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$updateSaveAllLessons$1.f20054k = i13 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$updateSaveAllLessons$1 = new LessonRepositoryImpl$updateSaveAllLessons$1(this, interfaceC9968c);
            }
        } else {
            lessonRepositoryImpl$updateSaveAllLessons$1 = new LessonRepositoryImpl$updateSaveAllLessons$1(this, interfaceC9968c);
        }
        Object objMo5078u0 = lessonRepositoryImpl$updateSaveAllLessons$1.f20052i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i14 = lessonRepositoryImpl$updateSaveAllLessons$1.f20054k;
        if (i14 != 0) {
            if (i14 == 1) {
                z10 = lessonRepositoryImpl$updateSaveAllLessons$1.f20051h;
                i10 = lessonRepositoryImpl$updateSaveAllLessons$1.f20050g;
                str = lessonRepositoryImpl$updateSaveAllLessons$1.f20048e;
                LessonRepositoryImpl lessonRepositoryImpl3 = lessonRepositoryImpl$updateSaveAllLessons$1.f20047d;
                C7499b.m14977z0(objMo5078u0);
                lessonRepositoryImpl = lessonRepositoryImpl3;
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z11 = lessonRepositoryImpl$updateSaveAllLessons$1.f20051h;
                i12 = lessonRepositoryImpl$updateSaveAllLessons$1.f20050g;
                it = lessonRepositoryImpl$updateSaveAllLessons$1.f20049f;
                str2 = lessonRepositoryImpl$updateSaveAllLessons$1.f20048e;
                LessonRepositoryImpl lessonRepositoryImpl4 = lessonRepositoryImpl$updateSaveAllLessons$1.f20047d;
                C7499b.m14977z0(objMo5078u0);
                lessonRepositoryImpl2 = lessonRepositoryImpl4;
            }
            while (it.hasNext()) {
                iIntValue = ((Number) it.next()).intValue();
                lessonRepositoryImpl$updateSaveAllLessons$1.f20047d = lessonRepositoryImpl2;
                lessonRepositoryImpl$updateSaveAllLessons$1.f20048e = str2;
                lessonRepositoryImpl$updateSaveAllLessons$1.f20049f = it;
                lessonRepositoryImpl$updateSaveAllLessons$1.f20050g = i12;
                lessonRepositoryImpl$updateSaveAllLessons$1.f20051h = z11;
                lessonRepositoryImpl$updateSaveAllLessons$1.f20054k = 2;
                if (lessonRepositoryImpl2.mo9490L(i12, iIntValue, str2, lessonRepositoryImpl$updateSaveAllLessons$1, z11) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objMo5078u0);
        lessonRepositoryImpl$updateSaveAllLessons$1.f20047d = this;
        lessonRepositoryImpl$updateSaveAllLessons$1.f20048e = str;
        lessonRepositoryImpl$updateSaveAllLessons$1.f20050g = i10;
        lessonRepositoryImpl$updateSaveAllLessons$1.f20051h = z10;
        lessonRepositoryImpl$updateSaveAllLessons$1.f20054k = 1;
        objMo5078u0 = this.f19831e.mo5078u0(i11, LibraryItemType.Content.getValue(), lessonRepositoryImpl$updateSaveAllLessons$1);
        if (objMo5078u0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        lessonRepositoryImpl = this;
        Iterator it2 = ((List) objMo5078u0).iterator();
        lessonRepositoryImpl2 = lessonRepositoryImpl;
        i12 = i10;
        z11 = z10;
        str2 = str;
        it = it2;
        while (it.hasNext()) {
            iIntValue = ((Number) it.next()).intValue();
            lessonRepositoryImpl$updateSaveAllLessons$1.f20047d = lessonRepositoryImpl2;
            lessonRepositoryImpl$updateSaveAllLessons$1.f20048e = str2;
            lessonRepositoryImpl$updateSaveAllLessons$1.f20049f = it;
            lessonRepositoryImpl$updateSaveAllLessons$1.f20050g = i12;
            lessonRepositoryImpl$updateSaveAllLessons$1.f20051h = z11;
            lessonRepositoryImpl$updateSaveAllLessons$1.f20054k = 2;
            if (lessonRepositoryImpl2.mo9490L(i12, iIntValue, str2, lessonRepositoryImpl$updateSaveAllLessons$1, z11) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: F */
    public final Object mo9484F(int i10, boolean z10, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        LessonRepositoryImpl$updateLessonCounterIsTaken$1 lessonRepositoryImpl$updateLessonCounterIsTaken$1;
        LessonRepositoryImpl lessonRepositoryImpl;
        if (interfaceC9968c instanceof LessonRepositoryImpl$updateLessonCounterIsTaken$1) {
            lessonRepositoryImpl$updateLessonCounterIsTaken$1 = (LessonRepositoryImpl$updateLessonCounterIsTaken$1) interfaceC9968c;
            int i11 = lessonRepositoryImpl$updateLessonCounterIsTaken$1.f19971h;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$updateLessonCounterIsTaken$1.f19971h = i11 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$updateLessonCounterIsTaken$1 = new LessonRepositoryImpl$updateLessonCounterIsTaken$1(this, interfaceC9968c);
            }
        } else {
            lessonRepositoryImpl$updateLessonCounterIsTaken$1 = new LessonRepositoryImpl$updateLessonCounterIsTaken$1(this, interfaceC9968c);
        }
        Object objMo5082z0 = lessonRepositoryImpl$updateLessonCounterIsTaken$1.f19969f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = lessonRepositoryImpl$updateLessonCounterIsTaken$1.f19971h;
        if (i12 != 0) {
            if (i12 == 1) {
                z10 = lessonRepositoryImpl$updateLessonCounterIsTaken$1.f19968e;
                lessonRepositoryImpl = lessonRepositoryImpl$updateLessonCounterIsTaken$1.f19967d;
                C7499b.m14977z0(objMo5082z0);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objMo5082z0);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objMo5082z0);
        String value = LibraryItemType.Content.getValue();
        lessonRepositoryImpl$updateLessonCounterIsTaken$1.f19967d = this;
        lessonRepositoryImpl$updateLessonCounterIsTaken$1.f19968e = z10;
        lessonRepositoryImpl$updateLessonCounterIsTaken$1.f19971h = 1;
        objMo5082z0 = this.f19831e.mo5082z0(i10, value, lessonRepositoryImpl$updateLessonCounterIsTaken$1);
        if (objMo5082z0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        lessonRepositoryImpl = this;
        LibraryCounter libraryCounter = (LibraryCounter) objMo5082z0;
        if (libraryCounter != null) {
            libraryCounter.f17206g = z10;
            AbstractC1454i2 abstractC1454i2 = lessonRepositoryImpl.f19831e;
            lessonRepositoryImpl$updateLessonCounterIsTaken$1.f19967d = null;
            lessonRepositoryImpl$updateLessonCounterIsTaken$1.f19971h = 2;
            if (abstractC1454i2.mo5066Q0(libraryCounter, lessonRepositoryImpl$updateLessonCounterIsTaken$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: G */
    public final Object mo9485G(int i10, int i11, int i12, int i13, InterfaceC9968c interfaceC9968c) throws Throwable {
        LessonRepositoryImpl$updateLessonSentenceAudio$1 lessonRepositoryImpl$updateLessonSentenceAudio$1;
        int i14;
        int i15;
        Object objMo5154t0;
        LessonRepositoryImpl lessonRepositoryImpl;
        double dDoubleValue;
        double dDoubleValue2;
        if (interfaceC9968c instanceof LessonRepositoryImpl$updateLessonSentenceAudio$1) {
            lessonRepositoryImpl$updateLessonSentenceAudio$1 = (LessonRepositoryImpl$updateLessonSentenceAudio$1) interfaceC9968c;
            int i16 = lessonRepositoryImpl$updateLessonSentenceAudio$1.f19999i;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$updateLessonSentenceAudio$1.f19999i = i16 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$updateLessonSentenceAudio$1 = new LessonRepositoryImpl$updateLessonSentenceAudio$1(this, interfaceC9968c);
            }
        } else {
            lessonRepositoryImpl$updateLessonSentenceAudio$1 = new LessonRepositoryImpl$updateLessonSentenceAudio$1(this, interfaceC9968c);
        }
        Object obj = lessonRepositoryImpl$updateLessonSentenceAudio$1.f19997g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i17 = lessonRepositoryImpl$updateLessonSentenceAudio$1.f19999i;
        if (i17 != 0) {
            if (i17 == 1) {
                i15 = lessonRepositoryImpl$updateLessonSentenceAudio$1.f19996f;
                int i18 = lessonRepositoryImpl$updateLessonSentenceAudio$1.f19995e;
                lessonRepositoryImpl = lessonRepositoryImpl$updateLessonSentenceAudio$1.f19994d;
                C7499b.m14977z0(obj);
                objMo5154t0 = obj;
                i14 = i18;
            } else {
                if (i17 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        lessonRepositoryImpl$updateLessonSentenceAudio$1.f19994d = this;
        i14 = i12;
        lessonRepositoryImpl$updateLessonSentenceAudio$1.f19995e = i14;
        i15 = i13;
        lessonRepositoryImpl$updateLessonSentenceAudio$1.f19996f = i15;
        lessonRepositoryImpl$updateLessonSentenceAudio$1.f19999i = 1;
        objMo5154t0 = this.f19828b.mo5154t0(i10, i11, lessonRepositoryImpl$updateLessonSentenceAudio$1);
        if (objMo5154t0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        lessonRepositoryImpl = this;
        TranslationSentence translationSentence = (TranslationSentence) objMo5154t0;
        if (translationSentence != null) {
            Double d10 = translationSentence.f17535c;
            Double d11 = translationSentence.f17536d;
            if (i15 == 0) {
                if (d10 != null) {
                    dDoubleValue2 = (((double) i14) / 100.0d) + d10.doubleValue();
                } else {
                    dDoubleValue2 = (((double) i14) / 100.0d) + 0.0d;
                }
                if (dDoubleValue2 < 0.0d) {
                    dDoubleValue2 = 0.0d;
                }
                dDoubleValue = d11 != null ? d11.doubleValue() : 0.0d;
                if (dDoubleValue < dDoubleValue2) {
                    dDoubleValue = dDoubleValue2 + 3.0d;
                }
            } else {
                double dDoubleValue3 = d11 != null ? (((double) i14) / 100.0d) + d11.doubleValue() : (((double) i14) / 100.0d) + 0.0d;
                if (dDoubleValue3 < 0.0d) {
                    dDoubleValue3 = 0.0d;
                }
                dDoubleValue = d10 != null ? d10.doubleValue() : 0.0d;
                dDoubleValue2 = dDoubleValue > dDoubleValue3 ? dDoubleValue3 - 3.0d : dDoubleValue;
                dDoubleValue = dDoubleValue3;
            }
            AbstractC1495o1 abstractC1495o1 = lessonRepositoryImpl.f19828b;
            TranslationSentence translationSentenceM9388a = TranslationSentence.m9388a(translationSentence, new Double(dDoubleValue2), new Double(dDoubleValue), null, null, 51);
            lessonRepositoryImpl$updateLessonSentenceAudio$1.f19994d = null;
            lessonRepositoryImpl$updateLessonSentenceAudio$1.f19999i = 2;
            if (abstractC1495o1.mo5143P0(translationSentenceM9388a, lessonRepositoryImpl$updateLessonSentenceAudio$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }

    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: H */
    public final InterfaceC7116c<String> mo9486H(String str, int i10) {
        C5207g.m11111f(str, "language");
        return C0062b.m273H0(this.f19828b.mo5153s0(i10));
    }

    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: I */
    public final InterfaceC7116c<List<CollectionsFilterUser>> mo9487I(String str, String str2) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(str2, "query");
        return C0062b.m273H0(this.f19828b.mo5146l0(str2, str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: J */
    public final void mo9488J(String str, int i10, String str2) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(str2, "fileName");
        NetworkType networkType = NetworkType.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        NetworkType networkType2 = NetworkType.CONNECTED;
        C5207g.m11111f(networkType2, "networkType");
        C1309b c1309b = new C1309b(networkType2, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet));
        C1315h.a aVar = (C1315h.a) new C1315h.a(LessonAudioUploadWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
        aVar.f8071c.f37533j = c1309b;
        Pair[] pairArr = {new Pair("language", str), new Pair("lessonId", Integer.valueOf(i10)), new Pair("fileName", str2)};
        C1244b.a aVar2 = new C1244b.a();
        for (int i11 = 0; i11 < 3; i11++) {
            Pair pair = pairArr[i11];
            aVar2.m4709b(pair.f38013b, (String) pair.f38012a);
        }
        aVar.f8071c.f37528e = aVar2.m4708a();
        this.f19835i.m4877b(aVar.m4879a());
    }

    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: K */
    public final Object mo9489K(int i10, int i11, InterfaceC9968c<? super LessonStudySentence> interfaceC9968c) {
        return this.f19828b.mo5155u0(i10, i11, interfaceC9968c);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0091  */
    /* JADX WARN: Code duplicated, block: B:28:0x010e A[LOOP:0: B:27:0x010c->B:28:0x010e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: L */
    public final Object mo9490L(int i10, int i11, String str, InterfaceC9968c interfaceC9968c, boolean z10) throws Throwable {
        LessonRepositoryImpl$updateSaveRemove$1 lessonRepositoryImpl$updateSaveRemove$1;
        String str2;
        int i12;
        LessonRepositoryImpl lessonRepositoryImpl;
        int i13;
        LessonRepositoryImpl lessonRepositoryImpl2;
        String str3;
        int i14;
        boolean z11;
        Pair[] pairArr;
        int i15;
        C1244b.a aVar;
        int i16 = i11;
        boolean z12 = z10;
        if (interfaceC9968c instanceof LessonRepositoryImpl$updateSaveRemove$1) {
            lessonRepositoryImpl$updateSaveRemove$1 = (LessonRepositoryImpl$updateSaveRemove$1) interfaceC9968c;
            int i17 = lessonRepositoryImpl$updateSaveRemove$1.f20062k;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$updateSaveRemove$1.f20062k = i17 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$updateSaveRemove$1 = new LessonRepositoryImpl$updateSaveRemove$1(this, interfaceC9968c);
            }
        } else {
            lessonRepositoryImpl$updateSaveRemove$1 = new LessonRepositoryImpl$updateSaveRemove$1(this, interfaceC9968c);
        }
        Object obj = lessonRepositoryImpl$updateSaveRemove$1.f20060i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i18 = lessonRepositoryImpl$updateSaveRemove$1.f20062k;
        if (i18 != 0) {
            if (i18 == 1) {
                boolean z13 = lessonRepositoryImpl$updateSaveRemove$1.f20059h;
                int i19 = lessonRepositoryImpl$updateSaveRemove$1.f20058g;
                i12 = lessonRepositoryImpl$updateSaveRemove$1.f20057f;
                String str4 = lessonRepositoryImpl$updateSaveRemove$1.f20056e;
                lessonRepositoryImpl = lessonRepositoryImpl$updateSaveRemove$1.f20055d;
                C7499b.m14977z0(obj);
                str2 = str4;
                z12 = z13;
                i16 = i19;
            } else {
                if (i18 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z11 = lessonRepositoryImpl$updateSaveRemove$1.f20059h;
                i14 = lessonRepositoryImpl$updateSaveRemove$1.f20058g;
                i13 = lessonRepositoryImpl$updateSaveRemove$1.f20057f;
                str3 = lessonRepositoryImpl$updateSaveRemove$1.f20056e;
                lessonRepositoryImpl2 = lessonRepositoryImpl$updateSaveRemove$1.f20055d;
                C7499b.m14977z0(obj);
            }
            if (!z11) {
                lessonRepositoryImpl2.f19831e.mo5070m0(C0166e.m765k(str3, "_my_lessons_"), i14, LibraryItemType.Content.getValue());
            }
            lessonRepositoryImpl2.getClass();
            NetworkType networkType = NetworkType.NOT_REQUIRED;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            NetworkType networkType2 = NetworkType.CONNECTED;
            C5207g.m11111f(networkType2, "networkType");
            C1309b c1309b = new C1309b(networkType2, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet));
            C1315h.a aVar2 = (C1315h.a) new C1315h.a(LessonSaveRemoveWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
            aVar2.f8071c.f37533j = c1309b;
            Pair pair = new Pair("contextId", Integer.valueOf(i13));
            pairArr = new Pair[]{pair, new Pair("lessonId", Integer.valueOf(i14)), new Pair("save", Boolean.valueOf(z11))};
            aVar = new C1244b.a();
            for (i15 = 0; i15 < 3; i15++) {
                Pair pair2 = pairArr[i15];
                aVar.m4709b(pair2.f38013b, (String) pair2.f38012a);
            }
            aVar2.f8071c.f37528e = aVar.m4708a();
            lessonRepositoryImpl2.f19835i.m4877b(aVar2.m4879a());
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        lessonRepositoryImpl$updateSaveRemove$1.f20055d = this;
        str2 = str;
        lessonRepositoryImpl$updateSaveRemove$1.f20056e = str2;
        i12 = i10;
        lessonRepositoryImpl$updateSaveRemove$1.f20057f = i12;
        lessonRepositoryImpl$updateSaveRemove$1.f20058g = i16;
        lessonRepositoryImpl$updateSaveRemove$1.f20059h = z12;
        lessonRepositoryImpl$updateSaveRemove$1.f20062k = 1;
        if (mo9481C(i16, z12, lessonRepositoryImpl$updateSaveRemove$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        lessonRepositoryImpl = this;
        lessonRepositoryImpl$updateSaveRemove$1.f20055d = lessonRepositoryImpl;
        lessonRepositoryImpl$updateSaveRemove$1.f20056e = str2;
        lessonRepositoryImpl$updateSaveRemove$1.f20057f = i12;
        lessonRepositoryImpl$updateSaveRemove$1.f20058g = i16;
        lessonRepositoryImpl$updateSaveRemove$1.f20059h = z12;
        lessonRepositoryImpl$updateSaveRemove$1.f20062k = 2;
        if (lessonRepositoryImpl.mo9484F(i16, z12, lessonRepositoryImpl$updateSaveRemove$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        i13 = i12;
        lessonRepositoryImpl2 = lessonRepositoryImpl;
        str3 = str2;
        boolean z14 = z12;
        i14 = i16;
        z11 = z14;
        if (!z11) {
            lessonRepositoryImpl2.f19831e.mo5070m0(C0166e.m765k(str3, "_my_lessons_"), i14, LibraryItemType.Content.getValue());
        }
        lessonRepositoryImpl2.getClass();
        NetworkType networkType3 = NetworkType.NOT_REQUIRED;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        NetworkType networkType4 = NetworkType.CONNECTED;
        C5207g.m11111f(networkType4, "networkType");
        C1309b c1309b2 = new C1309b(networkType4, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet2));
        C1315h.a aVar3 = (C1315h.a) new C1315h.a(LessonSaveRemoveWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
        aVar3.f8071c.f37533j = c1309b2;
        Pair pair3 = new Pair("contextId", Integer.valueOf(i13));
        pairArr = new Pair[]{pair3, new Pair("lessonId", Integer.valueOf(i14)), new Pair("save", Boolean.valueOf(z11))};
        aVar = new C1244b.a();
        while (i15 < 3) {
            Pair pair4 = pairArr[i15];
            aVar.m4709b(pair4.f38013b, (String) pair4.f38012a);
        }
        aVar3.f8071c.f37528e = aVar.m4708a();
        lessonRepositoryImpl2.f19835i.m4877b(aVar3.m4879a());
        return C9072e.f47360a;
    }

    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: M */
    public final Object mo9491M(int i10, String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM18474p = this.f19832f.m18474p(str, new Integer(i10), interfaceC9968c);
        return objM18474p == CoroutineSingletons.COROUTINE_SUSPENDED ? objM18474p : C9072e.f47360a;
    }

    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: N */
    public final Object mo9492N(int i10, String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM18466h = this.f19832f.m18466h(str, new Integer(i10), interfaceC9968c);
        return objM18466h == CoroutineSingletons.COROUTINE_SUSPENDED ? objM18466h : C9072e.f47360a;
    }

    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: O */
    public final Object mo9493O(int i10, int i11, boolean z10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        RequestLessonUpdateSave requestLessonUpdateSave = new RequestLessonUpdateSave();
        requestLessonUpdateSave.f18111a = i11;
        InterfaceC9938f interfaceC9938f = this.f19832f;
        if (z10) {
            Object objM18472n = interfaceC9938f.m18472n(new Integer(i10), requestLessonUpdateSave, interfaceC9968c);
            return objM18472n == CoroutineSingletons.COROUTINE_SUSPENDED ? objM18472n : C9072e.f47360a;
        }
        Object objM18465g = interfaceC9938f.m18465g(new Integer(i10), requestLessonUpdateSave, interfaceC9968c);
        return objM18465g == CoroutineSingletons.COROUTINE_SUSPENDED ? objM18465g : C9072e.f47360a;
    }

    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: P */
    public final InterfaceC7116c<C6695a> mo9494P(int i10) {
        return C0062b.m273H0(this.f19828b.mo5152r0(i10));
    }

    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: Q */
    public final Object mo9495Q(double d10, double d11, int i10, String str, InterfaceC9968c interfaceC9968c, boolean z10) {
        Object objM18478t = this.f19832f.m18478t(str, new Integer(i10), new RequestLessonUpdateStats(d11, d10, z10), interfaceC9968c);
        return objM18478t == CoroutineSingletons.COROUTINE_SUSPENDED ? objM18478t : C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: R */
    public final Object mo9496R(int i10, int i11, double d10, int i12, InterfaceC9968c interfaceC9968c) throws Throwable {
        LessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1 lessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1;
        int i13;
        Object objMo5154t0;
        double d11;
        LessonRepositoryImpl lessonRepositoryImpl;
        double dDoubleValue;
        double d12;
        if (interfaceC9968c instanceof LessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1) {
            lessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1 = (LessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1) interfaceC9968c;
            int i14 = lessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1.f20016i;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1.f20016i = i14 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1 = new LessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1(this, interfaceC9968c);
            }
        } else {
            lessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1 = new LessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1(this, interfaceC9968c);
        }
        Object obj = lessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1.f20014g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i15 = lessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1.f20016i;
        if (i15 != 0) {
            if (i15 == 1) {
                int i16 = lessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1.f20013f;
                d11 = lessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1.f20012e;
                lessonRepositoryImpl = lessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1.f20011d;
                C7499b.m14977z0(obj);
                objMo5154t0 = obj;
                i13 = i16;
            } else {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        lessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1.f20011d = this;
        lessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1.f20012e = d10;
        i13 = i12;
        lessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1.f20013f = i13;
        lessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1.f20016i = 1;
        objMo5154t0 = this.f19828b.mo5154t0(i10, i11, lessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1);
        if (objMo5154t0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        d11 = d10;
        lessonRepositoryImpl = this;
        TranslationSentence translationSentence = (TranslationSentence) objMo5154t0;
        if (translationSentence != null) {
            if (i13 == 0) {
                Double d13 = translationSentence.f17536d;
                dDoubleValue = d13 != null ? d13.doubleValue() : 0.0d;
                d12 = dDoubleValue < d11 ? 3.0d + d11 : dDoubleValue;
            } else {
                Double d14 = translationSentence.f17535c;
                dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
                if (dDoubleValue > d11) {
                    double d15 = d11;
                    d11 -= 3.0d;
                    d12 = d15;
                } else {
                    d12 = d11;
                    d11 = dDoubleValue;
                }
            }
            AbstractC1495o1 abstractC1495o1 = lessonRepositoryImpl.f19828b;
            TranslationSentence translationSentenceM9388a = TranslationSentence.m9388a(translationSentence, new Double(d11), new Double(d12), null, null, 51);
            lessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1.f20011d = null;
            lessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1.f20016i = 2;
            if (abstractC1495o1.mo5143P0(translationSentenceM9388a, lessonRepositoryImpl$updateLessonSentenceSetAudioTimestamp$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: S */
    public final Object mo9497S(int i10, String str, InterfaceC9968c interfaceC9968c) throws Throwable {
        LessonRepositoryImpl$networkLessonBookmark$1 lessonRepositoryImpl$networkLessonBookmark$1;
        LessonRepositoryImpl lessonRepositoryImpl;
        if (interfaceC9968c instanceof LessonRepositoryImpl$networkLessonBookmark$1) {
            lessonRepositoryImpl$networkLessonBookmark$1 = (LessonRepositoryImpl$networkLessonBookmark$1) interfaceC9968c;
            int i11 = lessonRepositoryImpl$networkLessonBookmark$1.f19887h;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$networkLessonBookmark$1.f19887h = i11 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$networkLessonBookmark$1 = new LessonRepositoryImpl$networkLessonBookmark$1(this, interfaceC9968c);
            }
        } else {
            lessonRepositoryImpl$networkLessonBookmark$1 = new LessonRepositoryImpl$networkLessonBookmark$1(this, interfaceC9968c);
        }
        Object objM18468j = lessonRepositoryImpl$networkLessonBookmark$1.f19885f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = lessonRepositoryImpl$networkLessonBookmark$1.f19887h;
        try {
            if (i12 != 0) {
                if (i12 == 1) {
                    i10 = lessonRepositoryImpl$networkLessonBookmark$1.f19884e;
                    lessonRepositoryImpl = lessonRepositoryImpl$networkLessonBookmark$1.f19883d;
                    C7499b.m14977z0(objM18468j);
                } else {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(objM18468j);
                }
                return C9072e.f47360a;
            }
            C7499b.m14977z0(objM18468j);
            InterfaceC9938f interfaceC9938f = this.f19832f;
            Integer num = new Integer(i10);
            lessonRepositoryImpl$networkLessonBookmark$1.f19883d = this;
            lessonRepositoryImpl$networkLessonBookmark$1.f19884e = i10;
            lessonRepositoryImpl$networkLessonBookmark$1.f19887h = 1;
            objM18468j = interfaceC9938f.m18468j(str, num, lessonRepositoryImpl$networkLessonBookmark$1);
            if (objM18468j == coroutineSingletons) {
                return coroutineSingletons;
            }
            lessonRepositoryImpl = this;
            AbstractC1495o1 abstractC1495o1 = lessonRepositoryImpl.f19828b;
            LessonBookmark lessonBookmarkM16910r = C8656b.m16910r((ResultLessonBookmark) objM18468j, i10);
            lessonRepositoryImpl$networkLessonBookmark$1.f19883d = null;
            lessonRepositoryImpl$networkLessonBookmark$1.f19887h = 2;
            if (abstractC1495o1.mo5131D0(lessonBookmarkM16910r, lessonRepositoryImpl$networkLessonBookmark$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return C9072e.f47360a;
    }

    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: T */
    public final InterfaceC7116c<C6695a> mo9498T(int i10) {
        return C0062b.m273H0(this.f19831e.mo5081y0(i10));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009a  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: U */
    public final Object mo9499U(int i10, int i11, InterfaceC9968c interfaceC9968c) throws Throwable {
        LessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1 lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1;
        Object obj;
        int i12;
        LessonRepositoryImpl lessonRepositoryImpl;
        TranslationSentence translationSentence;
        TranslationSentence translationSentence2;
        AbstractC1495o1 abstractC1495o1;
        TranslationSentence translationSentenceM9388a;
        if (interfaceC9968c instanceof LessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1) {
            lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1 = (LessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1) interfaceC9968c;
            int i13 = lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f20006j;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f20006j = i13 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1 = new LessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1(this, interfaceC9968c);
            }
        } else {
            lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1 = new LessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1(this, interfaceC9968c);
        }
        Object objMo5154t0 = lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f20004h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i14 = lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f20006j;
        if (i14 != 0) {
            if (i14 == 1) {
                int i15 = lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f20003g;
                i10 = lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f20002f;
                LessonRepositoryImpl lessonRepositoryImpl2 = lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f20000d;
                C7499b.m14977z0(objMo5154t0);
                i12 = i15;
                lessonRepositoryImpl = lessonRepositoryImpl2;
                obj = objMo5154t0;
            } else if (i14 == 2) {
                TranslationSentence translationSentence3 = lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f20001e;
                lessonRepositoryImpl = lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f20000d;
                C7499b.m14977z0(objMo5154t0);
                translationSentence = translationSentence3;
                translationSentence2 = (TranslationSentence) objMo5154t0;
                if (translationSentence2 != null) {
                    abstractC1495o1 = lessonRepositoryImpl.f19828b;
                    translationSentenceM9388a = TranslationSentence.m9388a(translationSentence, translationSentence2.f17536d, null, null, null, 59);
                    lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f20000d = null;
                    lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f20001e = null;
                    lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f20006j = 3;
                    if (abstractC1495o1.mo5143P0(translationSentenceM9388a, lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objMo5154t0);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objMo5154t0);
        lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f20000d = this;
        lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f20002f = i10;
        lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f20003g = i11;
        lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f20006j = 1;
        Object objMo5154t1 = this.f19828b.mo5154t0(i10, i11, lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1);
        if (objMo5154t1 == coroutineSingletons) {
            return coroutineSingletons;
        }
        obj = objMo5154t1;
        i12 = i11;
        lessonRepositoryImpl = this;
        TranslationSentence translationSentence4 = (TranslationSentence) obj;
        if (translationSentence4 != null) {
            lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f20000d = lessonRepositoryImpl;
            lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f20001e = translationSentence4;
            lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f20006j = 2;
            objMo5154t0 = lessonRepositoryImpl.f19828b.mo5154t0(i10, i12 - 1, lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1);
            if (objMo5154t0 == coroutineSingletons) {
                return coroutineSingletons;
            }
            translationSentence = translationSentence4;
            translationSentence2 = (TranslationSentence) objMo5154t0;
            if (translationSentence2 != null) {
                abstractC1495o1 = lessonRepositoryImpl.f19828b;
                translationSentenceM9388a = TranslationSentence.m9388a(translationSentence, translationSentence2.f17536d, null, null, null, 59);
                lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f20000d = null;
                lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f20001e = null;
                lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1.f20006j = 3;
                if (abstractC1495o1.mo5143P0(translationSentenceM9388a, lessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: V */
    public final Object mo9500V(int i10, int i11, String str, InterfaceC9968c interfaceC9968c) throws Throwable {
        LessonRepositoryImpl$updateLessonSentence$1 lessonRepositoryImpl$updateLessonSentence$1;
        LessonRepositoryImpl lessonRepositoryImpl;
        if (interfaceC9968c instanceof LessonRepositoryImpl$updateLessonSentence$1) {
            lessonRepositoryImpl$updateLessonSentence$1 = (LessonRepositoryImpl$updateLessonSentence$1) interfaceC9968c;
            int i12 = lessonRepositoryImpl$updateLessonSentence$1.f19993h;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$updateLessonSentence$1.f19993h = i12 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$updateLessonSentence$1 = new LessonRepositoryImpl$updateLessonSentence$1(this, interfaceC9968c);
            }
        } else {
            lessonRepositoryImpl$updateLessonSentence$1 = new LessonRepositoryImpl$updateLessonSentence$1(this, interfaceC9968c);
        }
        Object objMo5154t0 = lessonRepositoryImpl$updateLessonSentence$1.f19991f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i13 = lessonRepositoryImpl$updateLessonSentence$1.f19993h;
        if (i13 != 0) {
            if (i13 == 1) {
                str = lessonRepositoryImpl$updateLessonSentence$1.f19990e;
                lessonRepositoryImpl = lessonRepositoryImpl$updateLessonSentence$1.f19989d;
                C7499b.m14977z0(objMo5154t0);
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objMo5154t0);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objMo5154t0);
        lessonRepositoryImpl$updateLessonSentence$1.f19989d = this;
        lessonRepositoryImpl$updateLessonSentence$1.f19990e = str;
        lessonRepositoryImpl$updateLessonSentence$1.f19993h = 1;
        objMo5154t0 = this.f19828b.mo5154t0(i10, i11, lessonRepositoryImpl$updateLessonSentence$1);
        if (objMo5154t0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        lessonRepositoryImpl = this;
        String str2 = str;
        TranslationSentence translationSentence = (TranslationSentence) objMo5154t0;
        if (translationSentence != null) {
            AbstractC1495o1 abstractC1495o1 = lessonRepositoryImpl.f19828b;
            TranslationSentence translationSentenceM9388a = TranslationSentence.m9388a(translationSentence, null, null, str2, null, 47);
            lessonRepositoryImpl$updateLessonSentence$1.f19989d = null;
            lessonRepositoryImpl$updateLessonSentence$1.f19990e = null;
            lessonRepositoryImpl$updateLessonSentence$1.f19993h = 2;
            if (abstractC1495o1.mo5143P0(translationSentenceM9388a, lessonRepositoryImpl$updateLessonSentence$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00c1 A[Catch: Exception -> 0x0116, TryCatch #0 {Exception -> 0x0116, blocks: (B:16:0x003d, B:55:0x0113, B:22:0x0052, B:51:0x00ff, B:25:0x005d, B:40:0x00b7, B:42:0x00c1, B:43:0x00d4, B:45:0x00da, B:46:0x00ec, B:36:0x009c), top: B:59:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00da A[Catch: Exception -> 0x0116, LOOP:0: B:43:0x00d4->B:45:0x00da, LOOP_END, TryCatch #0 {Exception -> 0x0116, blocks: (B:16:0x003d, B:55:0x0113, B:22:0x0052, B:51:0x00ff, B:25:0x005d, B:40:0x00b7, B:42:0x00c1, B:43:0x00d4, B:45:0x00da, B:46:0x00ec, B:36:0x009c), top: B:59:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:53:0x0111  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: W */
    public final Object mo9501W(int i10, String str, InterfaceC9968c interfaceC9968c) throws Throwable {
        LessonRepositoryImpl$fetchLessonSentences$1 lessonRepositoryImpl$fetchLessonSentences$1;
        LessonRepositoryImpl lessonRepositoryImpl;
        LessonRepositoryImpl lessonRepositoryImpl2;
        List list;
        ArrayList arrayList;
        Iterator it;
        AbstractC1495o1 abstractC1495o1;
        if (interfaceC9968c instanceof LessonRepositoryImpl$fetchLessonSentences$1) {
            lessonRepositoryImpl$fetchLessonSentences$1 = (LessonRepositoryImpl$fetchLessonSentences$1) interfaceC9968c;
            int i11 = lessonRepositoryImpl$fetchLessonSentences$1.f19841i;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$fetchLessonSentences$1.f19841i = i11 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$fetchLessonSentences$1 = new LessonRepositoryImpl$fetchLessonSentences$1(this, interfaceC9968c);
            }
        } else {
            lessonRepositoryImpl$fetchLessonSentences$1 = new LessonRepositoryImpl$fetchLessonSentences$1(this, interfaceC9968c);
        }
        Object objM14360a = lessonRepositoryImpl$fetchLessonSentences$1.f19839g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = lessonRepositoryImpl$fetchLessonSentences$1.f19841i;
        try {
            if (i12 != 0) {
                if (i12 == 1) {
                    i10 = lessonRepositoryImpl$fetchLessonSentences$1.f19838f;
                    str = lessonRepositoryImpl$fetchLessonSentences$1.f19837e;
                    lessonRepositoryImpl = lessonRepositoryImpl$fetchLessonSentences$1.f19836d;
                    C7499b.m14977z0(objM14360a);
                } else if (i12 == 2) {
                    i10 = lessonRepositoryImpl$fetchLessonSentences$1.f19838f;
                    lessonRepositoryImpl2 = lessonRepositoryImpl$fetchLessonSentences$1.f19836d;
                    C7499b.m14977z0(objM14360a);
                    list = (List) objM14360a;
                    if (!list.isEmpty()) {
                        arrayList = new ArrayList(C9325m.m17681z(list, 10));
                        it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(C8573r0.m16732j1((ResultTranslationSentence) it.next(), i10));
                        }
                        abstractC1495o1 = lessonRepositoryImpl2.f19828b;
                        lessonRepositoryImpl$fetchLessonSentences$1.f19836d = lessonRepositoryImpl2;
                        lessonRepositoryImpl$fetchLessonSentences$1.f19838f = i10;
                        lessonRepositoryImpl$fetchLessonSentences$1.f19841i = 3;
                        if (abstractC1495o1.mo5139L0(arrayList, lessonRepositoryImpl$fetchLessonSentences$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    C7136q c7136qMo5128A0 = lessonRepositoryImpl2.f19828b.mo5128A0(i10);
                    lessonRepositoryImpl$fetchLessonSentences$1.f19836d = null;
                    lessonRepositoryImpl$fetchLessonSentences$1.f19841i = 4;
                    objM14360a = FlowKt__ReduceKt.m14360a(c7136qMo5128A0, lessonRepositoryImpl$fetchLessonSentences$1);
                    if (objM14360a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (i12 == 3) {
                    i10 = lessonRepositoryImpl$fetchLessonSentences$1.f19838f;
                    lessonRepositoryImpl2 = lessonRepositoryImpl$fetchLessonSentences$1.f19836d;
                    C7499b.m14977z0(objM14360a);
                    C7136q c7136qMo5128A1 = lessonRepositoryImpl2.f19828b.mo5128A0(i10);
                    lessonRepositoryImpl$fetchLessonSentences$1.f19836d = null;
                    lessonRepositoryImpl$fetchLessonSentences$1.f19841i = 4;
                    objM14360a = FlowKt__ReduceKt.m14360a(c7136qMo5128A1, lessonRepositoryImpl$fetchLessonSentences$1);
                    if (objM14360a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i12 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(objM14360a);
                }
                return (List) objM14360a;
            }
            C7499b.m14977z0(objM14360a);
            C7136q c7136qMo5128A2 = this.f19828b.mo5128A0(i10);
            lessonRepositoryImpl$fetchLessonSentences$1.f19836d = this;
            lessonRepositoryImpl$fetchLessonSentences$1.f19837e = str;
            lessonRepositoryImpl$fetchLessonSentences$1.f19838f = i10;
            lessonRepositoryImpl$fetchLessonSentences$1.f19841i = 1;
            objM14360a = FlowKt__ReduceKt.m14360a(c7136qMo5128A2, lessonRepositoryImpl$fetchLessonSentences$1);
            if (objM14360a == coroutineSingletons) {
                return coroutineSingletons;
            }
            lessonRepositoryImpl = this;
            List list2 = (List) objM14360a;
            if (!list2.isEmpty()) {
                return list2;
            }
            InterfaceC9938f interfaceC9938f = lessonRepositoryImpl.f19832f;
            Integer num = new Integer(i10);
            lessonRepositoryImpl$fetchLessonSentences$1.f19836d = lessonRepositoryImpl;
            lessonRepositoryImpl$fetchLessonSentences$1.f19837e = null;
            lessonRepositoryImpl$fetchLessonSentences$1.f19838f = i10;
            lessonRepositoryImpl$fetchLessonSentences$1.f19841i = 2;
            objM14360a = interfaceC9938f.m18473o(str, num, true, lessonRepositoryImpl$fetchLessonSentences$1);
            if (objM14360a == coroutineSingletons) {
                return coroutineSingletons;
            }
            lessonRepositoryImpl2 = lessonRepositoryImpl;
            list = (List) objM14360a;
            if (!list.isEmpty()) {
                arrayList = new ArrayList(C9325m.m17681z(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(C8573r0.m16732j1((ResultTranslationSentence) it.next(), i10));
                }
                abstractC1495o1 = lessonRepositoryImpl2.f19828b;
                lessonRepositoryImpl$fetchLessonSentences$1.f19836d = lessonRepositoryImpl2;
                lessonRepositoryImpl$fetchLessonSentences$1.f19838f = i10;
                lessonRepositoryImpl$fetchLessonSentences$1.f19841i = 3;
                if (abstractC1495o1.mo5139L0(arrayList, lessonRepositoryImpl$fetchLessonSentences$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            C7136q c7136qMo5128A3 = lessonRepositoryImpl2.f19828b.mo5128A0(i10);
            lessonRepositoryImpl$fetchLessonSentences$1.f19836d = null;
            lessonRepositoryImpl$fetchLessonSentences$1.f19841i = 4;
            objM14360a = FlowKt__ReduceKt.m14360a(c7136qMo5128A3, lessonRepositoryImpl$fetchLessonSentences$1);
            if (objM14360a == coroutineSingletons) {
                return coroutineSingletons;
            }
            return (List) objM14360a;
        } catch (Exception unused) {
            return EmptyList.f38032a;
        }
    }

    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: X */
    public final InterfaceC7116c mo9502X(int i10) {
        final C7136q c7136qMo5141N0 = this.f19828b.mo5141N0(i10);
        return C0062b.m273H0(new InterfaceC7116c<Boolean>() { // from class: com.lingq.shared.repository.LessonRepositoryImpl$isLessonDownloaded$$inlined$map$1

            /* JADX INFO: renamed from: com.lingq.shared.repository.LessonRepositoryImpl$isLessonDownloaded$$inlined$map$1$2 */
            public static final class C33192<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f19848a;

                /* JADX INFO: renamed from: com.lingq.shared.repository.LessonRepositoryImpl$isLessonDownloaded$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.repository.LessonRepositoryImpl$isLessonDownloaded$$inlined$map$1$2", m19206f = "LessonRepository.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f19849d;

                    /* JADX INFO: renamed from: e */
                    public int f19850e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f19849d = obj;
                        this.f19850e |= Integer.MIN_VALUE;
                        return C33192.this.mo1339r(null, this);
                    }
                }

                public C33192(InterfaceC7117d interfaceC7117d) {
                    this.f19848a = interfaceC7117d;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0018  */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f19850e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f19850e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f19849d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f19850e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        Boolean boolValueOf = Boolean.valueOf(((Integer) obj) != null);
                        anonymousClass1.f19850e = 1;
                        if (this.f19848a.mo1339r(boolValueOf, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7499b.m14977z0(obj2);
                    }
                    return C9072e.f47360a;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC7116c
            /* JADX INFO: renamed from: a */
            public final Object mo9539a(InterfaceC7117d<? super Boolean> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = c7136qMo5141N0.mo9539a(new C33192(interfaceC7117d), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        });
    }

    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: Y */
    public final Object mo9503Y(int i10, int i11, String str, String str2, InterfaceC9968c interfaceC9968c) {
        RequestBookmarkLesson requestBookmarkLesson = new RequestBookmarkLesson();
        requestBookmarkLesson.f18030a = i11;
        requestBookmarkLesson.f18031b = str2;
        Object objM18463e = this.f19832f.m18463e(str, new Integer(i10), requestBookmarkLesson, interfaceC9968c);
        return objM18463e == CoroutineSingletons.COROUTINE_SUSPENDED ? objM18463e : C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: Z */
    public final Object mo9504Z(int i10, int i11, String str, String str2, InterfaceC9968c interfaceC9968c) throws Throwable {
        LessonRepositoryImpl$updateLessonSentenceTranslation$1 lessonRepositoryImpl$updateLessonSentenceTranslation$1;
        LessonRepositoryImpl lessonRepositoryImpl;
        Object next;
        if (interfaceC9968c instanceof LessonRepositoryImpl$updateLessonSentenceTranslation$1) {
            lessonRepositoryImpl$updateLessonSentenceTranslation$1 = (LessonRepositoryImpl$updateLessonSentenceTranslation$1) interfaceC9968c;
            int i12 = lessonRepositoryImpl$updateLessonSentenceTranslation$1.f20022i;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$updateLessonSentenceTranslation$1.f20022i = i12 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$updateLessonSentenceTranslation$1 = new LessonRepositoryImpl$updateLessonSentenceTranslation$1(this, interfaceC9968c);
            }
        } else {
            lessonRepositoryImpl$updateLessonSentenceTranslation$1 = new LessonRepositoryImpl$updateLessonSentenceTranslation$1(this, interfaceC9968c);
        }
        Object objMo5154t0 = lessonRepositoryImpl$updateLessonSentenceTranslation$1.f20020g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i13 = lessonRepositoryImpl$updateLessonSentenceTranslation$1.f20022i;
        if (i13 != 0) {
            if (i13 == 1) {
                str2 = lessonRepositoryImpl$updateLessonSentenceTranslation$1.f20019f;
                str = lessonRepositoryImpl$updateLessonSentenceTranslation$1.f20018e;
                lessonRepositoryImpl = lessonRepositoryImpl$updateLessonSentenceTranslation$1.f20017d;
                C7499b.m14977z0(objMo5154t0);
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objMo5154t0);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objMo5154t0);
        lessonRepositoryImpl$updateLessonSentenceTranslation$1.f20017d = this;
        lessonRepositoryImpl$updateLessonSentenceTranslation$1.f20018e = str;
        lessonRepositoryImpl$updateLessonSentenceTranslation$1.f20019f = str2;
        lessonRepositoryImpl$updateLessonSentenceTranslation$1.f20022i = 1;
        objMo5154t0 = this.f19828b.mo5154t0(i10, i11, lessonRepositoryImpl$updateLessonSentenceTranslation$1);
        if (objMo5154t0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        lessonRepositoryImpl = this;
        TranslationSentence translationSentence = (TranslationSentence) objMo5154t0;
        if (translationSentence != null) {
            List<Translation> list = translationSentence.f17538f;
            ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
            for (Translation translation : list) {
                if (C5207g.m11106a(translation.f17524b, str)) {
                    C5207g.m11111f(str2, "text");
                    String str3 = translation.f17524b;
                    C5207g.m11111f(str3, "language");
                    translation = new Translation(str2, str3, translation.f17525c);
                }
                arrayList.add(translation);
            }
            ArrayList arrayListM13454v0 = C6752c.m13454v0(arrayList);
            Iterator it = arrayListM13454v0.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!C5207g.m11106a(((Translation) next).f17524b, str));
            if (next == null) {
                arrayListM13454v0.add(new Translation(str2, str, false));
            }
            AbstractC1495o1 abstractC1495o1 = lessonRepositoryImpl.f19828b;
            TranslationSentence translationSentenceM9388a = TranslationSentence.m9388a(translationSentence, null, null, null, arrayListM13454v0, 31);
            lessonRepositoryImpl$updateLessonSentenceTranslation$1.f20017d = null;
            lessonRepositoryImpl$updateLessonSentenceTranslation$1.f20018e = null;
            lessonRepositoryImpl$updateLessonSentenceTranslation$1.f20019f = null;
            lessonRepositoryImpl$updateLessonSentenceTranslation$1.f20022i = 2;
            if (abstractC1495o1.mo5143P0(translationSentenceM9388a, lessonRepositoryImpl$updateLessonSentenceTranslation$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }

    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: a */
    public final Object mo9505a(int i10, InterfaceC9968c<? super LessonInfo> interfaceC9968c) {
        return this.f19828b.mo5151q0(i10, interfaceC9968c);
    }

    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: a0 */
    public final Object mo9506a0(int i10, String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM18461c = this.f19832f.m18461c(str, new Integer(i10), interfaceC9968c);
        return objM18461c == CoroutineSingletons.COROUTINE_SUSPENDED ? objM18461c : C9072e.f47360a;
    }

    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: b */
    public final InterfaceC7116c<LessonInfo> mo9507b(int i10) {
        return C0062b.m273H0(this.f19828b.mo5145k0(i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b0 */
    public final void m9508b0(String str, int i10) {
        NetworkType networkType = NetworkType.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        NetworkType networkType2 = NetworkType.CONNECTED;
        C5207g.m11111f(networkType2, "networkType");
        C1309b c1309b = new C1309b(networkType2, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet));
        C1315h.a aVar = (C1315h.a) new C1315h.a(LessonDeleteRoseWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
        aVar.f8071c.f37533j = c1309b;
        Pair pair = new Pair("language", str);
        Pair[] pairArr = {pair, new Pair("lessonId", Integer.valueOf(i10))};
        C1244b.a aVar2 = new C1244b.a();
        for (int i11 = 0; i11 < 2; i11++) {
            Pair pair2 = pairArr[i11];
            aVar2.m4709b(pair2.f38013b, (String) pair2.f38012a);
        }
        aVar.f8071c.f37528e = aVar2.m4708a();
        this.f19835i.m4877b(aVar.m4879a());
    }

    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: c */
    public final Object mo9509c(int i10, String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM18459a = this.f19832f.m18459a(str, new Integer(i10), interfaceC9968c);
        return objM18459a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM18459a : C9072e.f47360a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c0 */
    public final void m9510c0(String str, int i10) {
        NetworkType networkType = NetworkType.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        NetworkType networkType2 = NetworkType.CONNECTED;
        C5207g.m11111f(networkType2, "networkType");
        C1309b c1309b = new C1309b(networkType2, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet));
        C1315h.a aVar = (C1315h.a) new C1315h.a(LessonGiveRoseWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
        aVar.f8071c.f37533j = c1309b;
        Pair pair = new Pair("language", str);
        Pair[] pairArr = {pair, new Pair("lessonId", Integer.valueOf(i10))};
        C1244b.a aVar2 = new C1244b.a();
        for (int i11 = 0; i11 < 2; i11++) {
            Pair pair2 = pairArr[i11];
            aVar2.m4709b(pair2.f38013b, (String) pair2.f38012a);
        }
        aVar.f8071c.f37528e = aVar2.m4708a();
        this.f19835i.m4877b(aVar.m4879a());
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: d */
    public final Object mo9511d(int i10, String str, InterfaceC9968c interfaceC9968c) throws Throwable {
        LessonRepositoryImpl$networkDownloadLesson$1 lessonRepositoryImpl$networkDownloadLesson$1;
        ?? r10;
        Object objMo9524l;
        LessonRepositoryImpl lessonRepositoryImpl;
        List listM17251q;
        LessonRepositoryImpl lessonRepositoryImpl2;
        if (interfaceC9968c instanceof LessonRepositoryImpl$networkDownloadLesson$1) {
            lessonRepositoryImpl$networkDownloadLesson$1 = (LessonRepositoryImpl$networkDownloadLesson$1) interfaceC9968c;
            int i11 = lessonRepositoryImpl$networkDownloadLesson$1.f19868i;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$networkDownloadLesson$1.f19868i = i11 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$networkDownloadLesson$1 = new LessonRepositoryImpl$networkDownloadLesson$1(this, interfaceC9968c);
            }
        } else {
            lessonRepositoryImpl$networkDownloadLesson$1 = new LessonRepositoryImpl$networkDownloadLesson$1(this, interfaceC9968c);
        }
        Object obj = lessonRepositoryImpl$networkDownloadLesson$1.f19866g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        LessonRepositoryImpl lessonRepositoryImpl3 = lessonRepositoryImpl$networkDownloadLesson$1.f19868i;
        try {
            try {
                try {
                    if (lessonRepositoryImpl3 != 0) {
                        if (lessonRepositoryImpl3 == 1) {
                            i10 = lessonRepositoryImpl$networkDownloadLesson$1.f19865f;
                            str = lessonRepositoryImpl$networkDownloadLesson$1.f19864e;
                            LessonRepositoryImpl lessonRepositoryImpl4 = lessonRepositoryImpl$networkDownloadLesson$1.f19863d;
                            C7499b.m14977z0(obj);
                            lessonRepositoryImpl2 = lessonRepositoryImpl4;
                        } else if (lessonRepositoryImpl3 == 2) {
                            i10 = lessonRepositoryImpl$networkDownloadLesson$1.f19865f;
                            str = lessonRepositoryImpl$networkDownloadLesson$1.f19864e;
                            LessonRepositoryImpl lessonRepositoryImpl5 = lessonRepositoryImpl$networkDownloadLesson$1.f19863d;
                            C7499b.m14977z0(obj);
                            lessonRepositoryImpl3 = lessonRepositoryImpl5;
                            lessonRepositoryImpl$networkDownloadLesson$1.f19863d = lessonRepositoryImpl3;
                            lessonRepositoryImpl$networkDownloadLesson$1.f19864e = str;
                            lessonRepositoryImpl$networkDownloadLesson$1.f19865f = i10;
                            lessonRepositoryImpl$networkDownloadLesson$1.f19868i = 3;
                            objMo9524l = lessonRepositoryImpl3.mo9524l(str, i10, false, lessonRepositoryImpl$networkDownloadLesson$1);
                            r10 = lessonRepositoryImpl3;
                            if (objMo9524l == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            lessonRepositoryImpl = r10;
                            listM17251q = C9000b.m17251q(new Integer(i10));
                            lessonRepositoryImpl$networkDownloadLesson$1.f19863d = null;
                            lessonRepositoryImpl$networkDownloadLesson$1.f19864e = null;
                            lessonRepositoryImpl$networkDownloadLesson$1.f19868i = 4;
                            if (lessonRepositoryImpl.m9514e0(str, listM17251q, lessonRepositoryImpl$networkDownloadLesson$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else if (lessonRepositoryImpl3 == 3) {
                            i10 = lessonRepositoryImpl$networkDownloadLesson$1.f19865f;
                            str = lessonRepositoryImpl$networkDownloadLesson$1.f19864e;
                            LessonRepositoryImpl lessonRepositoryImpl6 = lessonRepositoryImpl$networkDownloadLesson$1.f19863d;
                            C7499b.m14977z0(obj);
                            lessonRepositoryImpl = lessonRepositoryImpl6;
                            listM17251q = C9000b.m17251q(new Integer(i10));
                            lessonRepositoryImpl$networkDownloadLesson$1.f19863d = null;
                            lessonRepositoryImpl$networkDownloadLesson$1.f19864e = null;
                            lessonRepositoryImpl$networkDownloadLesson$1.f19868i = 4;
                            if (lessonRepositoryImpl.m9514e0(str, listM17251q, lessonRepositoryImpl$networkDownloadLesson$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (lessonRepositoryImpl3 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            C7499b.m14977z0(obj);
                        }
                        return C9072e.f47360a;
                    }
                    C7499b.m14977z0(obj);
                    C8802p c8802p = new C8802p(i10, str, LibraryItemType.Content.getValue(), false);
                    lessonRepositoryImpl$networkDownloadLesson$1.f19863d = this;
                    lessonRepositoryImpl$networkDownloadLesson$1.f19864e = str;
                    lessonRepositoryImpl$networkDownloadLesson$1.f19865f = i10;
                    lessonRepositoryImpl$networkDownloadLesson$1.f19868i = 1;
                    if (this.f19831e.mo5055F0(c8802p, lessonRepositoryImpl$networkDownloadLesson$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lessonRepositoryImpl2 = this;
                    lessonRepositoryImpl$networkDownloadLesson$1.f19863d = lessonRepositoryImpl2;
                    lessonRepositoryImpl$networkDownloadLesson$1.f19864e = str;
                    lessonRepositoryImpl$networkDownloadLesson$1.f19865f = i10;
                    lessonRepositoryImpl$networkDownloadLesson$1.f19868i = 2;
                    Object objM9516f0 = lessonRepositoryImpl2.m9516f0(i10, str, lessonRepositoryImpl$networkDownloadLesson$1);
                    lessonRepositoryImpl3 = lessonRepositoryImpl2;
                    if (objM9516f0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                r10 = lessonRepositoryImpl3;
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        lessonRepositoryImpl$networkDownloadLesson$1.f19863d = lessonRepositoryImpl3;
        lessonRepositoryImpl$networkDownloadLesson$1.f19864e = str;
        lessonRepositoryImpl$networkDownloadLesson$1.f19865f = i10;
        lessonRepositoryImpl$networkDownloadLesson$1.f19868i = 3;
        objMo9524l = lessonRepositoryImpl3.mo9524l(str, i10, false, lessonRepositoryImpl$networkDownloadLesson$1);
        r10 = lessonRepositoryImpl3;
        if (objMo9524l == coroutineSingletons) {
            return coroutineSingletons;
        }
        lessonRepositoryImpl = r10;
        listM17251q = C9000b.m17251q(new Integer(i10));
        lessonRepositoryImpl$networkDownloadLesson$1.f19863d = null;
        lessonRepositoryImpl$networkDownloadLesson$1.f19864e = null;
        lessonRepositoryImpl$networkDownloadLesson$1.f19868i = 4;
        if (lessonRepositoryImpl.m9514e0(str, listM17251q, lessonRepositoryImpl$networkDownloadLesson$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d0 */
    public final void m9512d0(String str, int i10, double d10, double d11, boolean z10) {
        NetworkType networkType = NetworkType.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        NetworkType networkType2 = NetworkType.CONNECTED;
        C5207g.m11111f(networkType2, "networkType");
        C1309b c1309b = new C1309b(networkType2, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet));
        C1315h.a aVar = (C1315h.a) new C1315h.a(LessonUpdateStatsWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
        aVar.f8071c.f37533j = c1309b;
        Pair[] pairArr = {new Pair("language", str), new Pair("lessonId", Integer.valueOf(i10)), new Pair("listenTimes", Double.valueOf(d10)), new Pair("readTimes", Double.valueOf(d11)), new Pair("automatic", Boolean.valueOf(z10))};
        C1244b.a aVar2 = new C1244b.a();
        for (int i11 = 0; i11 < 5; i11++) {
            Pair pair = pairArr[i11];
            aVar2.m4709b(pair.f38013b, (String) pair.f38012a);
        }
        aVar.f8071c.f37528e = aVar2.m4708a();
        this.f19835i.m4877b(aVar.m4879a());
    }

    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: e */
    public final InterfaceC7116c<C6050a> mo9513e(int i10) {
        return C0062b.m273H0(this.f19828b.mo5159y0(i10));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e0 */
    public final Object m9514e0(String str, List<Integer> list, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        LessonRepositoryImpl$networkLibraryCounters$1 lessonRepositoryImpl$networkLibraryCounters$1;
        LessonRepositoryImpl lessonRepositoryImpl;
        if (interfaceC9968c instanceof LessonRepositoryImpl$networkLibraryCounters$1) {
            lessonRepositoryImpl$networkLibraryCounters$1 = (LessonRepositoryImpl$networkLibraryCounters$1) interfaceC9968c;
            int i10 = lessonRepositoryImpl$networkLibraryCounters$1.f19895g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$networkLibraryCounters$1.f19895g = i10 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$networkLibraryCounters$1 = new LessonRepositoryImpl$networkLibraryCounters$1(this, interfaceC9968c);
            }
        } else {
            lessonRepositoryImpl$networkLibraryCounters$1 = new LessonRepositoryImpl$networkLibraryCounters$1(this, interfaceC9968c);
        }
        Object objM18480b = lessonRepositoryImpl$networkLibraryCounters$1.f19893e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = lessonRepositoryImpl$networkLibraryCounters$1.f19895g;
        if (i11 != 0) {
            if (i11 == 1) {
                lessonRepositoryImpl = lessonRepositoryImpl$networkLibraryCounters$1.f19892d;
                C7499b.m14977z0(objM18480b);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objM18480b);
            }
        }
        C7499b.m14977z0(objM18480b);
        lessonRepositoryImpl$networkLibraryCounters$1.f19892d = this;
        lessonRepositoryImpl$networkLibraryCounters$1.f19895g = 1;
        objM18480b = this.f19833g.m18480b(str, list, lessonRepositoryImpl$networkLibraryCounters$1);
        if (objM18480b == coroutineSingletons) {
            return coroutineSingletons;
        }
        lessonRepositoryImpl = this;
        Map map = (Map) objM18480b;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(C8573r0.m16715b0((ResultLibraryCounter) entry.getValue(), ((Number) entry.getKey()).intValue(), LibraryItemType.Content.getValue()));
        }
        AbstractC1454i2 abstractC1454i2 = lessonRepositoryImpl.f19831e;
        lessonRepositoryImpl$networkLibraryCounters$1.f19892d = null;
        lessonRepositoryImpl$networkLibraryCounters$1.f19895g = 2;
        return abstractC1454i2.mo5054E0(arrayList, lessonRepositoryImpl$networkLibraryCounters$1) == coroutineSingletons ? coroutineSingletons : C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: f */
    public final Object mo9515f(String str, InterfaceC9968c<? super Integer> interfaceC9968c) throws Throwable {
        LessonRepositoryImpl$networkGetLessonTags$1 lessonRepositoryImpl$networkGetLessonTags$1;
        LessonRepositoryImpl lessonRepositoryImpl;
        Results results;
        Results results2;
        if (interfaceC9968c instanceof LessonRepositoryImpl$networkGetLessonTags$1) {
            lessonRepositoryImpl$networkGetLessonTags$1 = (LessonRepositoryImpl$networkGetLessonTags$1) interfaceC9968c;
            int i10 = lessonRepositoryImpl$networkGetLessonTags$1.f19872g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$networkGetLessonTags$1.f19872g = i10 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$networkGetLessonTags$1 = new LessonRepositoryImpl$networkGetLessonTags$1(this, interfaceC9968c);
            }
        } else {
            lessonRepositoryImpl$networkGetLessonTags$1 = new LessonRepositoryImpl$networkGetLessonTags$1(this, interfaceC9968c);
        }
        Object objM18477s = lessonRepositoryImpl$networkGetLessonTags$1.f19870e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = lessonRepositoryImpl$networkGetLessonTags$1.f19872g;
        if (i11 != 0) {
            if (i11 == 1) {
                lessonRepositoryImpl = (LessonRepositoryImpl) lessonRepositoryImpl$networkGetLessonTags$1.f19869d;
                C7499b.m14977z0(objM18477s);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                results2 = (Results) lessonRepositoryImpl$networkGetLessonTags$1.f19869d;
                C7499b.m14977z0(objM18477s);
            }
            results = results2;
            return new Integer(results.f19133a);
        }
        C7499b.m14977z0(objM18477s);
        lessonRepositoryImpl$networkGetLessonTags$1.f19869d = this;
        lessonRepositoryImpl$networkGetLessonTags$1.f19872g = 1;
        objM18477s = this.f19832f.m18477s(20, "startsWith", str, lessonRepositoryImpl$networkGetLessonTags$1);
        if (objM18477s == coroutineSingletons) {
            return coroutineSingletons;
        }
        lessonRepositoryImpl = this;
        results = (Results) objM18477s;
        Collection<ResultLessonTags> collection = results.f19136d;
        if (collection != null) {
            ArrayList arrayList = new ArrayList(C9325m.m17681z(collection, 10));
            for (ResultLessonTags resultLessonTags : collection) {
                C5207g.m11111f(resultLessonTags, "<this>");
                String str2 = resultLessonTags.f18655a;
                if (str2 == null) {
                    str2 = "";
                }
                arrayList.add(new LessonTag(str2));
            }
            AbstractC1495o1 abstractC1495o1 = lessonRepositoryImpl.f19828b;
            lessonRepositoryImpl$networkGetLessonTags$1.f19869d = results;
            lessonRepositoryImpl$networkGetLessonTags$1.f19872g = 2;
            if (abstractC1495o1.mo5130C0(arrayList, lessonRepositoryImpl$networkGetLessonTags$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            results2 = results;
            results = results2;
        }
        return new Integer(results.f19133a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f0 */
    public final Object m9516f0(int i10, String str, InterfaceC9968c interfaceC9968c) throws Throwable {
        LessonRepositoryImpl$networkLoadLesson$1 lessonRepositoryImpl$networkLoadLesson$1;
        LessonRepositoryImpl lessonRepositoryImpl;
        if (interfaceC9968c instanceof LessonRepositoryImpl$networkLoadLesson$1) {
            lessonRepositoryImpl$networkLoadLesson$1 = (LessonRepositoryImpl$networkLoadLesson$1) interfaceC9968c;
            int i11 = lessonRepositoryImpl$networkLoadLesson$1.f19901i;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$networkLoadLesson$1.f19901i = i11 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$networkLoadLesson$1 = new LessonRepositoryImpl$networkLoadLesson$1(this, interfaceC9968c);
            }
        } else {
            lessonRepositoryImpl$networkLoadLesson$1 = new LessonRepositoryImpl$networkLoadLesson$1(this, interfaceC9968c);
        }
        Object objM18470l = lessonRepositoryImpl$networkLoadLesson$1.f19899g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = lessonRepositoryImpl$networkLoadLesson$1.f19901i;
        if (i12 != 0) {
            if (i12 == 1) {
                i10 = lessonRepositoryImpl$networkLoadLesson$1.f19898f;
                str = lessonRepositoryImpl$networkLoadLesson$1.f19897e;
                lessonRepositoryImpl = lessonRepositoryImpl$networkLoadLesson$1.f19896d;
                C7499b.m14977z0(objM18470l);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objM18470l);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objM18470l);
        Integer num = new Integer(i10);
        lessonRepositoryImpl$networkLoadLesson$1.f19896d = this;
        lessonRepositoryImpl$networkLoadLesson$1.f19897e = str;
        lessonRepositoryImpl$networkLoadLesson$1.f19898f = i10;
        lessonRepositoryImpl$networkLoadLesson$1.f19901i = 1;
        objM18470l = this.f19832f.m18470l(str, num, true, lessonRepositoryImpl$networkLoadLesson$1);
        if (objM18470l == coroutineSingletons) {
            return coroutineSingletons;
        }
        lessonRepositoryImpl = this;
        lessonRepositoryImpl$networkLoadLesson$1.f19896d = null;
        lessonRepositoryImpl$networkLoadLesson$1.f19897e = null;
        lessonRepositoryImpl$networkLoadLesson$1.f19901i = 2;
        lessonRepositoryImpl.getClass();
        Object objM4573a = RoomDatabaseKt.m4573a(lessonRepositoryImpl.f19827a, new LessonRepositoryImpl$storeLessonData$2(i10, (ResultLesson) objM18470l, lessonRepositoryImpl, str, null), lessonRepositoryImpl$networkLoadLesson$1);
        if (objM4573a != coroutineSingletons) {
            objM4573a = C9072e.f47360a;
        }
        if (objM4573a == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0096  */
    /* JADX WARN: Code duplicated, block: B:23:0x00ce A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:29:0x011c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x011d  */
    /* JADX WARN: Code duplicated, block: B:32:0x014f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x011d -> B:31:0x0122). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x014f -> B:19:0x0090). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: g */
    public final java.lang.Object mo9517g(int r28, java.lang.String r29, java.util.ArrayList r30, p464wl.InterfaceC9968c r31) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.shared.repository.LessonRepositoryImpl.mo9517g(int, java.lang.String, java.util.ArrayList, wl.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007a A[Catch: Exception -> 0x00b4, TryCatch #0 {Exception -> 0x00b4, blocks: (B:13:0x003d, B:26:0x00a9, B:19:0x0074, B:21:0x007a, B:29:0x00b6, B:18:0x0058), top: B:34:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00a4 -> B:26:0x00a9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: g0 */
    public final java.lang.Object m9518g0(int r11, java.lang.String r12, java.util.List<com.lingq.shared.network.requests.RequestLessonUpdateTimestamps> r13, p464wl.InterfaceC9968c<? super sl.C9072e> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.lingq.shared.repository.LessonRepositoryImpl$networkUpdateSentenceTimestamps$1
            if (r0 == 0) goto L18
            r9 = 3
            r0 = r14
            com.lingq.shared.repository.LessonRepositoryImpl$networkUpdateSentenceTimestamps$1 r0 = (com.lingq.shared.repository.LessonRepositoryImpl$networkUpdateSentenceTimestamps$1) r0
            int r1 = r0.f19932l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            r9 = 4
            if (r3 == 0) goto L18
            r9 = 5
            int r1 = r1 - r2
            r9 = 6
            r0.f19932l = r1
            r9 = 3
            goto L1e
        L18:
            com.lingq.shared.repository.LessonRepositoryImpl$networkUpdateSentenceTimestamps$1 r0 = new com.lingq.shared.repository.LessonRepositoryImpl$networkUpdateSentenceTimestamps$1
            r0.<init>(r10, r14)
            r9 = 5
        L1e:
            java.lang.Object r14 = r0.f19930j
            r9 = 2
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r9 = 3
            int r2 = r0.f19932l
            r8 = 1
            r3 = r8
            if (r2 == 0) goto L51
            r9 = 4
            if (r2 != r3) goto L46
            r9 = 4
            int r11 = r0.f19929i
            r9 = 2
            java.util.Collection r12 = r0.f19928h
            r9 = 6
            java.util.Iterator r13 = r0.f19927g
            java.util.Collection r2 = r0.f19926f
            java.lang.String r4 = r0.f19925e
            com.lingq.shared.repository.LessonRepositoryImpl r5 = r0.f19924d
            r9 = 6
            p260m8.C7499b.m14977z0(r14)     // Catch: java.lang.Exception -> Lb4
            r7 = r0
            r0 = r13
            r13 = r4
            r4 = r1
            r1 = r7
            goto La9
        L46:
            r9 = 3
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r9 = 6
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            r9 = 5
            throw r11
        L51:
            r9 = 6
            p260m8.C7499b.m14977z0(r14)
            r14 = 100
            r9 = 4
            r9 = 6
            java.util.ArrayList r13 = kotlin.collections.C6752c.m13414H(r13, r14)     // Catch: java.lang.Exception -> Lb4
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lb4
            r9 = 1
            r2 = 10
            int r8 = tl.C9325m.m17681z(r13, r2)     // Catch: java.lang.Exception -> Lb4
            r2 = r8
            r14.<init>(r2)     // Catch: java.lang.Exception -> Lb4
            java.util.Iterator r8 = r13.iterator()     // Catch: java.lang.Exception -> Lb4
            r13 = r8
            r5 = r10
            r7 = r13
            r13 = r12
            r12 = r14
            r14 = r7
        L74:
            boolean r2 = r14.hasNext()     // Catch: java.lang.Exception -> Lb4
            if (r2 == 0) goto Lb6
            r9 = 4
            java.lang.Object r2 = r14.next()     // Catch: java.lang.Exception -> Lb4
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Exception -> Lb4
            r9 = 3
            wh.f r4 = r5.f19832f     // Catch: java.lang.Exception -> Lb4
            java.lang.Integer r6 = new java.lang.Integer     // Catch: java.lang.Exception -> Lb4
            r9 = 1
            r6.<init>(r11)     // Catch: java.lang.Exception -> Lb4
            r9 = 7
            r0.f19924d = r5     // Catch: java.lang.Exception -> Lb4
            r0.f19925e = r13     // Catch: java.lang.Exception -> Lb4
            r9 = 1
            r0.f19926f = r12     // Catch: java.lang.Exception -> Lb4
            r0.f19927g = r14     // Catch: java.lang.Exception -> Lb4
            r0.f19928h = r12     // Catch: java.lang.Exception -> Lb4
            r9 = 4
            r0.f19929i = r11     // Catch: java.lang.Exception -> Lb4
            r0.f19932l = r3     // Catch: java.lang.Exception -> Lb4
            r9 = 1
            java.lang.Object r2 = r4.m18475q(r13, r6, r2, r0)     // Catch: java.lang.Exception -> Lb4
            if (r2 != r1) goto La4
            r9 = 7
            return r1
        La4:
            r4 = r1
            r1 = r0
            r0 = r14
            r14 = r2
            r2 = r12
        La9:
            so.y r14 = (so.AbstractC9107y) r14     // Catch: java.lang.Exception -> Lb4
            r9 = 4
            r12.add(r14)     // Catch: java.lang.Exception -> Lb4
            r14 = r0
            r0 = r1
            r12 = r2
            r1 = r4
            goto L74
        Lb4:
            r11 = move-exception
            goto Lba
        Lb6:
            r9 = 2
            java.util.List r12 = (java.util.List) r12     // Catch: java.lang.Exception -> Lb4
            goto Lbe
        Lba:
            r11.printStackTrace()
            r9 = 7
        Lbe:
            sl.e r11 = sl.C9072e.f47360a
            r9 = 7
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.shared.repository.LessonRepositoryImpl.m9518g0(int, java.lang.String, java.util.List, wl.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0117 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x0118  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: h */
    public final Object mo9519h(String str, String str2, InterfaceC9968c<? super Integer> interfaceC9968c) throws Throwable {
        LessonRepositoryImpl$networkSearchUserForSharedBy$1 lessonRepositoryImpl$networkSearchUserForSharedBy$1;
        String str3;
        LessonRepositoryImpl lessonRepositoryImpl;
        Object obj;
        String str4;
        Results results;
        List<SharedByUser> list;
        AbstractC1495o1 abstractC1495o1;
        Results results2;
        if (interfaceC9968c instanceof LessonRepositoryImpl$networkSearchUserForSharedBy$1) {
            lessonRepositoryImpl$networkSearchUserForSharedBy$1 = (LessonRepositoryImpl$networkSearchUserForSharedBy$1) interfaceC9968c;
            int i10 = lessonRepositoryImpl$networkSearchUserForSharedBy$1.f19907i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$networkSearchUserForSharedBy$1.f19907i = i10 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$networkSearchUserForSharedBy$1 = new LessonRepositoryImpl$networkSearchUserForSharedBy$1(this, interfaceC9968c);
            }
        } else {
            lessonRepositoryImpl$networkSearchUserForSharedBy$1 = new LessonRepositoryImpl$networkSearchUserForSharedBy$1(this, interfaceC9968c);
        }
        Object obj2 = lessonRepositoryImpl$networkSearchUserForSharedBy$1.f19905g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = lessonRepositoryImpl$networkSearchUserForSharedBy$1.f19907i;
        if (i11 != 0) {
            if (i11 == 1) {
                str4 = (String) lessonRepositoryImpl$networkSearchUserForSharedBy$1.f19904f;
                String str5 = (String) lessonRepositoryImpl$networkSearchUserForSharedBy$1.f19903e;
                lessonRepositoryImpl = (LessonRepositoryImpl) lessonRepositoryImpl$networkSearchUserForSharedBy$1.f19902d;
                C7499b.m14977z0(obj2);
                obj = obj2;
                str3 = str5;
            } else if (i11 == 2) {
                list = (List) lessonRepositoryImpl$networkSearchUserForSharedBy$1.f19904f;
                results = (Results) lessonRepositoryImpl$networkSearchUserForSharedBy$1.f19903e;
                lessonRepositoryImpl = (LessonRepositoryImpl) lessonRepositoryImpl$networkSearchUserForSharedBy$1.f19902d;
                C7499b.m14977z0(obj2);
                abstractC1495o1 = lessonRepositoryImpl.f19828b;
                lessonRepositoryImpl$networkSearchUserForSharedBy$1.f19902d = results;
                lessonRepositoryImpl$networkSearchUserForSharedBy$1.f19903e = null;
                lessonRepositoryImpl$networkSearchUserForSharedBy$1.f19904f = null;
                lessonRepositoryImpl$networkSearchUserForSharedBy$1.f19907i = 3;
                if (abstractC1495o1.mo5133F0(list, lessonRepositoryImpl$networkSearchUserForSharedBy$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                results2 = results;
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                results2 = (Results) lessonRepositoryImpl$networkSearchUserForSharedBy$1.f19902d;
                C7499b.m14977z0(obj2);
            }
            results = results2;
            return new Integer(results.f19133a);
        }
        C7499b.m14977z0(obj2);
        InterfaceC9938f interfaceC9938f = this.f19832f;
        lessonRepositoryImpl$networkSearchUserForSharedBy$1.f19902d = this;
        str3 = str;
        lessonRepositoryImpl$networkSearchUserForSharedBy$1.f19903e = str3;
        lessonRepositoryImpl$networkSearchUserForSharedBy$1.f19904f = str2;
        lessonRepositoryImpl$networkSearchUserForSharedBy$1.f19907i = 1;
        Object objM18471m = interfaceC9938f.m18471m(1, 25, str2, "username", "startsWith", str, lessonRepositoryImpl$networkSearchUserForSharedBy$1);
        if (objM18471m == coroutineSingletons) {
            return coroutineSingletons;
        }
        lessonRepositoryImpl = this;
        obj = objM18471m;
        str4 = str2;
        results = (Results) obj;
        Collection collection = results.f19136d;
        if (collection != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ResultSharedByUser resultSharedByUser = (ResultSharedByUser) it.next();
                C5207g.m11111f(resultSharedByUser, "<this>");
                C5207g.m11111f(str3, "language");
                Iterator it2 = it;
                arrayList.add(new SharedByUser(resultSharedByUser.f18939a, str3, resultSharedByUser.f18940b, resultSharedByUser.f18941c, resultSharedByUser.f18942d, resultSharedByUser.f18943e, resultSharedByUser.f18944f));
                arrayList2.add(new SharedByUserAndQueryJoin(str3, resultSharedByUser.f18939a, str4 == null ? "" : str4));
                it = it2;
            }
            AbstractC1495o1 abstractC1495o2 = lessonRepositoryImpl.f19828b;
            lessonRepositoryImpl$networkSearchUserForSharedBy$1.f19902d = lessonRepositoryImpl;
            lessonRepositoryImpl$networkSearchUserForSharedBy$1.f19903e = results;
            lessonRepositoryImpl$networkSearchUserForSharedBy$1.f19904f = arrayList;
            lessonRepositoryImpl$networkSearchUserForSharedBy$1.f19907i = 2;
            if (abstractC1495o2.mo5132E0(arrayList2, lessonRepositoryImpl$networkSearchUserForSharedBy$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            list = arrayList;
            abstractC1495o1 = lessonRepositoryImpl.f19828b;
            lessonRepositoryImpl$networkSearchUserForSharedBy$1.f19902d = results;
            lessonRepositoryImpl$networkSearchUserForSharedBy$1.f19903e = null;
            lessonRepositoryImpl$networkSearchUserForSharedBy$1.f19904f = null;
            lessonRepositoryImpl$networkSearchUserForSharedBy$1.f19907i = 3;
            if (abstractC1495o1.mo5133F0(list, lessonRepositoryImpl$networkSearchUserForSharedBy$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            results2 = results;
            results = results2;
        }
        return new Integer(results.f19133a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: h0 */
    public final Object m9520h0(int i10, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        LessonRepositoryImpl$updateLessonCounterLike$1 lessonRepositoryImpl$updateLessonCounterLike$1;
        LessonRepositoryImpl lessonRepositoryImpl;
        if (interfaceC9968c instanceof LessonRepositoryImpl$updateLessonCounterLike$1) {
            lessonRepositoryImpl$updateLessonCounterLike$1 = (LessonRepositoryImpl$updateLessonCounterLike$1) interfaceC9968c;
            int i11 = lessonRepositoryImpl$updateLessonCounterLike$1.f19975g;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$updateLessonCounterLike$1.f19975g = i11 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$updateLessonCounterLike$1 = new LessonRepositoryImpl$updateLessonCounterLike$1(this, interfaceC9968c);
            }
        } else {
            lessonRepositoryImpl$updateLessonCounterLike$1 = new LessonRepositoryImpl$updateLessonCounterLike$1(this, interfaceC9968c);
        }
        Object objMo5082z0 = lessonRepositoryImpl$updateLessonCounterLike$1.f19973e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = lessonRepositoryImpl$updateLessonCounterLike$1.f19975g;
        if (i12 != 0) {
            if (i12 == 1) {
                lessonRepositoryImpl = lessonRepositoryImpl$updateLessonCounterLike$1.f19972d;
                C7499b.m14977z0(objMo5082z0);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objMo5082z0);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objMo5082z0);
        String value = LibraryItemType.Content.getValue();
        lessonRepositoryImpl$updateLessonCounterLike$1.f19972d = this;
        lessonRepositoryImpl$updateLessonCounterLike$1.f19975g = 1;
        objMo5082z0 = this.f19831e.mo5082z0(i10, value, lessonRepositoryImpl$updateLessonCounterLike$1);
        if (objMo5082z0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        lessonRepositoryImpl = this;
        LibraryCounter libraryCounter = (LibraryCounter) objMo5082z0;
        if (libraryCounter != null) {
            if (libraryCounter.f17202c) {
                libraryCounter.f17202c = false;
                libraryCounter.f17208i--;
            } else {
                libraryCounter.f17202c = true;
                libraryCounter.f17208i++;
            }
            AbstractC1454i2 abstractC1454i2 = lessonRepositoryImpl.f19831e;
            lessonRepositoryImpl$updateLessonCounterLike$1.f19972d = null;
            lessonRepositoryImpl$updateLessonCounterLike$1.f19975g = 2;
            if (abstractC1454i2.mo5066Q0(libraryCounter, lessonRepositoryImpl$updateLessonCounterLike$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }

    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: i */
    public final InterfaceC7116c mo9521i(String str) {
        C5207g.m11111f(str, "language");
        return C0062b.m273H0(this.f19831e.mo5052C0(C7793a.m15498b(str, "my_lessons_type=lessons_level=nullsearch"), LibraryItemType.Content.getValue()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: j */
    public final Object mo9522j(int i10, String str, InterfaceC9968c interfaceC9968c) throws Throwable {
        LessonRepositoryImpl$networkLessonInfo$1 lessonRepositoryImpl$networkLessonInfo$1;
        LessonRepositoryImpl lessonRepositoryImpl;
        if (interfaceC9968c instanceof LessonRepositoryImpl$networkLessonInfo$1) {
            lessonRepositoryImpl$networkLessonInfo$1 = (LessonRepositoryImpl$networkLessonInfo$1) interfaceC9968c;
            int i11 = lessonRepositoryImpl$networkLessonInfo$1.f19891g;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$networkLessonInfo$1.f19891g = i11 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$networkLessonInfo$1 = new LessonRepositoryImpl$networkLessonInfo$1(this, interfaceC9968c);
            }
        } else {
            lessonRepositoryImpl$networkLessonInfo$1 = new LessonRepositoryImpl$networkLessonInfo$1(this, interfaceC9968c);
        }
        Object objM18460b = lessonRepositoryImpl$networkLessonInfo$1.f19889e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = lessonRepositoryImpl$networkLessonInfo$1.f19891g;
        if (i12 != 0) {
            if (i12 == 1) {
                lessonRepositoryImpl = lessonRepositoryImpl$networkLessonInfo$1.f19888d;
                C7499b.m14977z0(objM18460b);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objM18460b);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objM18460b);
        Integer num = new Integer(i10);
        lessonRepositoryImpl$networkLessonInfo$1.f19888d = this;
        lessonRepositoryImpl$networkLessonInfo$1.f19891g = 1;
        objM18460b = this.f19832f.m18460b(str, num, true, lessonRepositoryImpl$networkLessonInfo$1);
        if (objM18460b == coroutineSingletons) {
            return coroutineSingletons;
        }
        lessonRepositoryImpl = this;
        ResultLessonInfo resultLessonInfo = (ResultLessonInfo) objM18460b;
        C5207g.m11111f(resultLessonInfo, "<this>");
        int i13 = resultLessonInfo.f18594a;
        String str2 = resultLessonInfo.f18596b;
        int i14 = resultLessonInfo.f18598c;
        String str3 = resultLessonInfo.f18600d;
        String str4 = resultLessonInfo.f18602e;
        String str5 = resultLessonInfo.f18604f;
        String str6 = resultLessonInfo.f18606g;
        String str7 = resultLessonInfo.f18608h;
        int i15 = resultLessonInfo.f18611j;
        String str8 = resultLessonInfo.f18612k;
        String str9 = resultLessonInfo.f18613l;
        String str10 = resultLessonInfo.f18614m;
        int i16 = resultLessonInfo.f18615n;
        int i17 = resultLessonInfo.f18616o;
        int i18 = resultLessonInfo.f18617p;
        double d10 = resultLessonInfo.f18618q;
        double d11 = resultLessonInfo.f18619r;
        int i19 = resultLessonInfo.f18620s;
        String str11 = resultLessonInfo.f18621t;
        String str12 = resultLessonInfo.f18622u;
        Integer num2 = resultLessonInfo.f18624w;
        Integer num3 = resultLessonInfo.f18625x;
        double d12 = resultLessonInfo.f18626y;
        double d13 = resultLessonInfo.f18627z;
        boolean z10 = resultLessonInfo.f18568A;
        int i20 = resultLessonInfo.f18569B;
        int i21 = resultLessonInfo.f18570C;
        boolean z11 = resultLessonInfo.f18571D;
        String str13 = resultLessonInfo.f18572E;
        int i22 = resultLessonInfo.f18573F;
        boolean z12 = resultLessonInfo.f18574G;
        double d14 = resultLessonInfo.f18575H;
        String str14 = resultLessonInfo.f18576I;
        String str15 = resultLessonInfo.f18589V;
        boolean z13 = resultLessonInfo.f18577J;
        String str16 = resultLessonInfo.f18578K;
        String str17 = resultLessonInfo.f18579L;
        String str18 = resultLessonInfo.f18580M;
        String str19 = resultLessonInfo.f18581N;
        int i23 = resultLessonInfo.f18582O;
        String str20 = resultLessonInfo.f18584Q;
        String str21 = resultLessonInfo.f18585R;
        String str22 = resultLessonInfo.f18587T;
        String str23 = resultLessonInfo.f18590W;
        boolean z14 = resultLessonInfo.f18592Y;
        boolean z15 = resultLessonInfo.f18593Z;
        int i24 = resultLessonInfo.f18595a0;
        int i25 = resultLessonInfo.f18597b0;
        String str24 = resultLessonInfo.f18599c0;
        List<String> list = resultLessonInfo.f18601d0;
        EmptyList emptyList = EmptyList.f38032a;
        double d15 = resultLessonInfo.f18605f0;
        Boolean bool = resultLessonInfo.f18607g0;
        Lesson lesson = new Lesson(i13, null, str2, i14, str3, str4, str5, str6, str7, i15, str8, str9, str10, i16, i17, i18, d10, d11, i19, str11, null, null, null, null, null, str12, resultLessonInfo.f18623v, num2, num3, d12, d13, z10, i20, i21, z11, str13, i22, z12, d14, str14, z13, str16, str17, str18, str19, i23, null, str20, str21, resultLessonInfo.f18586S, str22, resultLessonInfo.f18588U, str15, str23, resultLessonInfo.f18591X, z14, z15, false, false, i24, i25, str24, list, 0, null, emptyList, null, null, null, Boolean.FALSE, d15, 0, null, bool, null, Boolean.valueOf(resultLessonInfo.f18609h0), 32505858, -2046803968, 1281, null);
        AbstractC1495o1 abstractC1495o1 = lessonRepositoryImpl.f19828b;
        lessonRepositoryImpl$networkLessonInfo$1.f19888d = null;
        lessonRepositoryImpl$networkLessonInfo$1.f19891g = 2;
        if (abstractC1495o1.mo598h0(lesson, lessonRepositoryImpl$networkLessonInfo$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }

    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: k */
    public final C7136q mo9523k(String str, int i10, boolean z10) {
        return new C7136q(new LessonRepositoryImpl$loadLesson$2(this, i10, z10, str, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: l */
    public final Object mo9524l(String str, int i10, boolean z10, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        LessonRepositoryImpl$networkUpdateLessonSentences$1 lessonRepositoryImpl$networkUpdateLessonSentences$1;
        LessonRepositoryImpl lessonRepositoryImpl;
        if (interfaceC9968c instanceof LessonRepositoryImpl$networkUpdateLessonSentences$1) {
            lessonRepositoryImpl$networkUpdateLessonSentences$1 = (LessonRepositoryImpl$networkUpdateLessonSentences$1) interfaceC9968c;
            int i11 = lessonRepositoryImpl$networkUpdateLessonSentences$1.f19917h;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$networkUpdateLessonSentences$1.f19917h = i11 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$networkUpdateLessonSentences$1 = new LessonRepositoryImpl$networkUpdateLessonSentences$1(this, interfaceC9968c);
            }
        } else {
            lessonRepositoryImpl$networkUpdateLessonSentences$1 = new LessonRepositoryImpl$networkUpdateLessonSentences$1(this, interfaceC9968c);
        }
        Object objM18473o = lessonRepositoryImpl$networkUpdateLessonSentences$1.f19915f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = lessonRepositoryImpl$networkUpdateLessonSentences$1.f19917h;
        if (i12 != 0) {
            if (i12 == 1) {
                i10 = lessonRepositoryImpl$networkUpdateLessonSentences$1.f19914e;
                lessonRepositoryImpl = lessonRepositoryImpl$networkUpdateLessonSentences$1.f19913d;
                C7499b.m14977z0(objM18473o);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objM18473o);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objM18473o);
        Integer num = new Integer(i10);
        lessonRepositoryImpl$networkUpdateLessonSentences$1.f19913d = this;
        lessonRepositoryImpl$networkUpdateLessonSentences$1.f19914e = i10;
        lessonRepositoryImpl$networkUpdateLessonSentences$1.f19917h = 1;
        objM18473o = this.f19832f.m18473o(str, num, z10, lessonRepositoryImpl$networkUpdateLessonSentences$1);
        if (objM18473o == coroutineSingletons) {
            return coroutineSingletons;
        }
        lessonRepositoryImpl = this;
        List list = (List) objM18473o;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C8573r0.m16732j1((ResultTranslationSentence) it.next(), i10));
            }
            AbstractC1495o1 abstractC1495o1 = lessonRepositoryImpl.f19828b;
            lessonRepositoryImpl$networkUpdateLessonSentences$1.f19913d = null;
            lessonRepositoryImpl$networkUpdateLessonSentences$1.f19917h = 2;
            if (abstractC1495o1.mo5139L0(arrayList, lessonRepositoryImpl$networkUpdateLessonSentences$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }

    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: m */
    public final Object mo9525m(int i10, InterfaceC9968c<? super LessonStudyBookmark> interfaceC9968c) {
        return this.f19828b.mo5150p0(i10, interfaceC9968c);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0129 A[LOOP:0: B:33:0x0127->B:34:0x0129, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: n */
    public final Object mo9526n(int i10, String str, InterfaceC9968c interfaceC9968c) throws Throwable {
        LessonRepositoryImpl$updateLessonComplete$1 lessonRepositoryImpl$updateLessonComplete$1;
        String str2;
        Object objMo5149o0;
        LessonRepositoryImpl lessonRepositoryImpl;
        String str3;
        LessonRepositoryImpl lessonRepositoryImpl2;
        Pair[] pairArr;
        int i11;
        C1244b.a aVar;
        int i12 = i10;
        if (interfaceC9968c instanceof LessonRepositoryImpl$updateLessonComplete$1) {
            lessonRepositoryImpl$updateLessonComplete$1 = (LessonRepositoryImpl$updateLessonComplete$1) interfaceC9968c;
            int i13 = lessonRepositoryImpl$updateLessonComplete$1.f19966i;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$updateLessonComplete$1.f19966i = i13 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$updateLessonComplete$1 = new LessonRepositoryImpl$updateLessonComplete$1(this, interfaceC9968c);
            }
        } else {
            lessonRepositoryImpl$updateLessonComplete$1 = new LessonRepositoryImpl$updateLessonComplete$1(this, interfaceC9968c);
        }
        Object obj = lessonRepositoryImpl$updateLessonComplete$1.f19964g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i14 = lessonRepositoryImpl$updateLessonComplete$1.f19966i;
        if (i14 != 0) {
            if (i14 == 1) {
                i12 = lessonRepositoryImpl$updateLessonComplete$1.f19963f;
                String str4 = lessonRepositoryImpl$updateLessonComplete$1.f19962e;
                lessonRepositoryImpl = lessonRepositoryImpl$updateLessonComplete$1.f19961d;
                C7499b.m14977z0(obj);
                objMo5149o0 = obj;
                str2 = str4;
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i12 = lessonRepositoryImpl$updateLessonComplete$1.f19963f;
                str3 = lessonRepositoryImpl$updateLessonComplete$1.f19962e;
                lessonRepositoryImpl2 = lessonRepositoryImpl$updateLessonComplete$1.f19961d;
                C7499b.m14977z0(obj);
            }
            lessonRepositoryImpl2.getClass();
            NetworkType networkType = NetworkType.NOT_REQUIRED;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            NetworkType networkType2 = NetworkType.CONNECTED;
            C5207g.m11111f(networkType2, "networkType");
            C1309b c1309b = new C1309b(networkType2, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet));
            C1315h.a aVar2 = (C1315h.a) new C1315h.a(LessonCompleteWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
            aVar2.f8071c.f37533j = c1309b;
            Pair pair = new Pair("language", str3);
            pairArr = new Pair[]{pair, new Pair("lessonId", Integer.valueOf(i12))};
            aVar = new C1244b.a();
            for (i11 = 0; i11 < 2; i11++) {
                Pair pair2 = pairArr[i11];
                aVar.m4709b(pair2.f38013b, (String) pair2.f38012a);
            }
            aVar2.f8071c.f37528e = aVar.m4708a();
            lessonRepositoryImpl2.f19835i.m4877b(aVar2.m4879a());
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        lessonRepositoryImpl$updateLessonComplete$1.f19961d = this;
        str2 = str;
        lessonRepositoryImpl$updateLessonComplete$1.f19962e = str2;
        lessonRepositoryImpl$updateLessonComplete$1.f19963f = i12;
        lessonRepositoryImpl$updateLessonComplete$1.f19966i = 1;
        objMo5149o0 = this.f19828b.mo5149o0(i12, lessonRepositoryImpl$updateLessonComplete$1);
        if (objMo5149o0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        lessonRepositoryImpl = this;
        Lesson lesson = (Lesson) objMo5149o0;
        if (lesson != null && !lesson.f17072F) {
            Bundle bundle = new Bundle();
            bundle.putString("Lesson ID", String.valueOf(lesson.f17093a));
            bundle.putString("Lesson name", lesson.f17101e);
            bundle.putString("Lesson language", str2);
            bundle.putString("Lesson level", lesson.f17112j0);
            bundle.putString("Collection", lesson.f17131t);
            List<String> list = lesson.f17114k0;
            bundle.putString("Tags", list != null ? C6752c.m13430X(list, null, null, null, null, 63) : null);
            lessonRepositoryImpl.f19834h.m15505b(bundle, "complete_lesson");
            lesson.f17072F = true;
            lessonRepositoryImpl$updateLessonComplete$1.f19961d = lessonRepositoryImpl;
            lessonRepositoryImpl$updateLessonComplete$1.f19962e = str2;
            lessonRepositoryImpl$updateLessonComplete$1.f19963f = i12;
            lessonRepositoryImpl$updateLessonComplete$1.f19966i = 2;
            if (lessonRepositoryImpl.f19828b.mo598h0(lesson, lessonRepositoryImpl$updateLessonComplete$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            str3 = str2;
            lessonRepositoryImpl2 = lessonRepositoryImpl;
            lessonRepositoryImpl2.getClass();
            NetworkType networkType3 = NetworkType.NOT_REQUIRED;
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            NetworkType networkType4 = NetworkType.CONNECTED;
            C5207g.m11111f(networkType4, "networkType");
            C1309b c1309b2 = new C1309b(networkType4, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet2));
            C1315h.a aVar3 = (C1315h.a) new C1315h.a(LessonCompleteWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
            aVar3.f8071c.f37533j = c1309b2;
            Pair pair3 = new Pair("language", str3);
            pairArr = new Pair[]{pair3, new Pair("lessonId", Integer.valueOf(i12))};
            aVar = new C1244b.a();
            while (i11 < 2) {
                Pair pair4 = pairArr[i11];
                aVar.m4709b(pair4.f38013b, (String) pair4.f38012a);
            }
            aVar3.f8071c.f37528e = aVar.m4708a();
            lessonRepositoryImpl2.f19835i.m4877b(aVar3.m4879a());
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: o */
    public final Object mo9527o(int i10, int i11, String str, InterfaceC9968c interfaceC9968c) throws Throwable {
        LessonRepositoryImpl$networkUpdateSentence$1 lessonRepositoryImpl$networkUpdateSentence$1;
        String str2;
        LessonRepositoryImpl lessonRepositoryImpl;
        ArrayList arrayList;
        int i12 = i10;
        if (interfaceC9968c instanceof LessonRepositoryImpl$networkUpdateSentence$1) {
            lessonRepositoryImpl$networkUpdateSentence$1 = (LessonRepositoryImpl$networkUpdateSentence$1) interfaceC9968c;
            int i13 = lessonRepositoryImpl$networkUpdateSentence$1.f19923i;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$networkUpdateSentence$1.f19923i = i13 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$networkUpdateSentence$1 = new LessonRepositoryImpl$networkUpdateSentence$1(this, interfaceC9968c);
            }
        } else {
            lessonRepositoryImpl$networkUpdateSentence$1 = new LessonRepositoryImpl$networkUpdateSentence$1(this, interfaceC9968c);
        }
        Object objMo5154t0 = lessonRepositoryImpl$networkUpdateSentence$1.f19921g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i14 = lessonRepositoryImpl$networkUpdateSentence$1.f19923i;
        try {
            if (i14 != 0) {
                if (i14 == 1) {
                    i12 = lessonRepositoryImpl$networkUpdateSentence$1.f19920f;
                    str2 = lessonRepositoryImpl$networkUpdateSentence$1.f19919e;
                    lessonRepositoryImpl = lessonRepositoryImpl$networkUpdateSentence$1.f19918d;
                    C7499b.m14977z0(objMo5154t0);
                } else {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(objMo5154t0);
                }
                return C9072e.f47360a;
            }
            C7499b.m14977z0(objMo5154t0);
            AbstractC1495o1 abstractC1495o1 = this.f19828b;
            lessonRepositoryImpl$networkUpdateSentence$1.f19918d = this;
            str2 = str;
            lessonRepositoryImpl$networkUpdateSentence$1.f19919e = str2;
            lessonRepositoryImpl$networkUpdateSentence$1.f19920f = i12;
            lessonRepositoryImpl$networkUpdateSentence$1.f19923i = 1;
            objMo5154t0 = abstractC1495o1.mo5154t0(i12, i11, lessonRepositoryImpl$networkUpdateSentence$1);
            if (objMo5154t0 == coroutineSingletons) {
                return coroutineSingletons;
            }
            lessonRepositoryImpl = this;
            TranslationSentence translationSentence = (TranslationSentence) objMo5154t0;
            if (translationSentence != null) {
                List<Translation> list = translationSentence.f17538f;
                InterfaceC9938f interfaceC9938f = lessonRepositoryImpl.f19832f;
                Integer num = new Integer(i12);
                int i15 = translationSentence.f17533a;
                Double[] dArr = new Double[2];
                Double d10 = translationSentence.f17535c;
                dArr[0] = new Double(d10 != null ? d10.doubleValue() : 0.0d);
                Double d11 = translationSentence.f17536d;
                dArr[1] = new Double(d11 != null ? d11.doubleValue() : 0.0d);
                List listM17252r = C9000b.m17252r(dArr);
                String str3 = translationSentence.f17537e;
                if (!list.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList(C9325m.m17681z(list, 10));
                    for (Translation translation : list) {
                        arrayList2.add(new RequestTranslation(translation.f17523a, translation.f17524b, translation.f17525c ? "Google" : null));
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                }
                RequestTranslationSentence requestTranslationSentence = new RequestTranslationSentence(i15, listM17252r, str3, arrayList, false, null, 48, null);
                lessonRepositoryImpl$networkUpdateSentence$1.f19918d = null;
                lessonRepositoryImpl$networkUpdateSentence$1.f19919e = null;
                lessonRepositoryImpl$networkUpdateSentence$1.f19923i = 2;
                objMo5154t0 = interfaceC9938f.m18462d(str2, num, requestTranslationSentence, lessonRepositoryImpl$networkUpdateSentence$1);
                if (objMo5154t0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: p */
    public final Object mo9528p(int i10, int i11, InterfaceC9968c interfaceC9968c) throws Throwable {
        LessonRepositoryImpl$updateLessonSentenceAudioStartPlusThree$1 lessonRepositoryImpl$updateLessonSentenceAudioStartPlusThree$1;
        LessonRepositoryImpl lessonRepositoryImpl;
        if (interfaceC9968c instanceof LessonRepositoryImpl$updateLessonSentenceAudioStartPlusThree$1) {
            lessonRepositoryImpl$updateLessonSentenceAudioStartPlusThree$1 = (LessonRepositoryImpl$updateLessonSentenceAudioStartPlusThree$1) interfaceC9968c;
            int i12 = lessonRepositoryImpl$updateLessonSentenceAudioStartPlusThree$1.f20010g;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$updateLessonSentenceAudioStartPlusThree$1.f20010g = i12 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$updateLessonSentenceAudioStartPlusThree$1 = new LessonRepositoryImpl$updateLessonSentenceAudioStartPlusThree$1(this, interfaceC9968c);
            }
        } else {
            lessonRepositoryImpl$updateLessonSentenceAudioStartPlusThree$1 = new LessonRepositoryImpl$updateLessonSentenceAudioStartPlusThree$1(this, interfaceC9968c);
        }
        Object objMo5154t0 = lessonRepositoryImpl$updateLessonSentenceAudioStartPlusThree$1.f20008e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i13 = lessonRepositoryImpl$updateLessonSentenceAudioStartPlusThree$1.f20010g;
        if (i13 != 0) {
            if (i13 == 1) {
                lessonRepositoryImpl = lessonRepositoryImpl$updateLessonSentenceAudioStartPlusThree$1.f20007d;
                C7499b.m14977z0(objMo5154t0);
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objMo5154t0);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objMo5154t0);
        lessonRepositoryImpl$updateLessonSentenceAudioStartPlusThree$1.f20007d = this;
        lessonRepositoryImpl$updateLessonSentenceAudioStartPlusThree$1.f20010g = 1;
        objMo5154t0 = this.f19828b.mo5154t0(i10, i11, lessonRepositoryImpl$updateLessonSentenceAudioStartPlusThree$1);
        if (objMo5154t0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        lessonRepositoryImpl = this;
        TranslationSentence translationSentence = (TranslationSentence) objMo5154t0;
        if (translationSentence != null) {
            AbstractC1495o1 abstractC1495o1 = lessonRepositoryImpl.f19828b;
            Double d10 = translationSentence.f17535c;
            TranslationSentence translationSentenceM9388a = TranslationSentence.m9388a(translationSentence, null, d10 != null ? new Double(d10.doubleValue() + 3.0d) : null, null, null, 55);
            lessonRepositoryImpl$updateLessonSentenceAudioStartPlusThree$1.f20007d = null;
            lessonRepositoryImpl$updateLessonSentenceAudioStartPlusThree$1.f20010g = 2;
            if (abstractC1495o1.mo5143P0(translationSentenceM9388a, lessonRepositoryImpl$updateLessonSentenceAudioStartPlusThree$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: q */
    public final Object mo9529q(String str, String str2, String str3, String str4, boolean z10, int i10, String str5, InterfaceC9968c<? super LessonStudy> interfaceC9968c) throws Throwable {
        LessonRepositoryImpl$networkImportUserLesson$1 lessonRepositoryImpl$networkImportUserLesson$1;
        LessonRepositoryImpl lessonRepositoryImpl;
        ResultLesson resultLesson;
        if (interfaceC9968c instanceof LessonRepositoryImpl$networkImportUserLesson$1) {
            lessonRepositoryImpl$networkImportUserLesson$1 = (LessonRepositoryImpl$networkImportUserLesson$1) interfaceC9968c;
            int i11 = lessonRepositoryImpl$networkImportUserLesson$1.f19882h;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$networkImportUserLesson$1.f19882h = i11 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$networkImportUserLesson$1 = new LessonRepositoryImpl$networkImportUserLesson$1(this, interfaceC9968c);
            }
        } else {
            lessonRepositoryImpl$networkImportUserLesson$1 = new LessonRepositoryImpl$networkImportUserLesson$1(this, interfaceC9968c);
        }
        Object objM18476r = lessonRepositoryImpl$networkImportUserLesson$1.f19880f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = lessonRepositoryImpl$networkImportUserLesson$1.f19882h;
        if (i12 != 0) {
            if (i12 == 1) {
                LessonRepositoryImpl lessonRepositoryImpl2 = lessonRepositoryImpl$networkImportUserLesson$1.f19878d;
                C7499b.m14977z0(objM18476r);
                lessonRepositoryImpl = lessonRepositoryImpl2;
            } else if (i12 == 2) {
                resultLesson = lessonRepositoryImpl$networkImportUserLesson$1.f19879e;
                lessonRepositoryImpl = lessonRepositoryImpl$networkImportUserLesson$1.f19878d;
                C7499b.m14977z0(objM18476r);
                AbstractC1495o1 abstractC1495o1 = lessonRepositoryImpl.f19828b;
                int i13 = resultLesson.f18520a;
                lessonRepositoryImpl$networkImportUserLesson$1.f19878d = null;
                lessonRepositoryImpl$networkImportUserLesson$1.f19879e = null;
                lessonRepositoryImpl$networkImportUserLesson$1.f19882h = 3;
                objM18476r = abstractC1495o1.mo5157w0(i13, lessonRepositoryImpl$networkImportUserLesson$1);
                if (objM18476r == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objM18476r);
            }
            return objM18476r;
        }
        C7499b.m14977z0(objM18476r);
        RequestLessonImport requestLessonImport = new RequestLessonImport();
        if (z10) {
            requestLessonImport.f18098a = str3;
        } else {
            requestLessonImport.f18100c = str5;
        }
        requestLessonImport.f18103f = "true";
        requestLessonImport.f18104g = "private";
        requestLessonImport.f18105h = "App";
        if (C7661i.m15250P2(str2)) {
            str2 = null;
        }
        requestLessonImport.f18099b = str2;
        requestLessonImport.f18101d = new Integer(i10);
        requestLessonImport.f18107j = str4;
        lessonRepositoryImpl$networkImportUserLesson$1.f19878d = this;
        lessonRepositoryImpl$networkImportUserLesson$1.f19882h = 1;
        objM18476r = this.f19832f.m18476r(str, requestLessonImport, lessonRepositoryImpl$networkImportUserLesson$1);
        if (objM18476r == coroutineSingletons) {
            return coroutineSingletons;
        }
        lessonRepositoryImpl = this;
        resultLesson = (ResultLesson) objM18476r;
        AbstractC1495o1 abstractC1495o2 = lessonRepositoryImpl.f19828b;
        Lesson lessonM16902j = C8656b.m16902j(resultLesson);
        lessonRepositoryImpl$networkImportUserLesson$1.f19878d = lessonRepositoryImpl;
        lessonRepositoryImpl$networkImportUserLesson$1.f19879e = resultLesson;
        lessonRepositoryImpl$networkImportUserLesson$1.f19882h = 2;
        if (abstractC1495o2.mo598h0(lessonM16902j, lessonRepositoryImpl$networkImportUserLesson$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        AbstractC1495o1 abstractC1495o3 = lessonRepositoryImpl.f19828b;
        int i14 = resultLesson.f18520a;
        lessonRepositoryImpl$networkImportUserLesson$1.f19878d = null;
        lessonRepositoryImpl$networkImportUserLesson$1.f19879e = null;
        lessonRepositoryImpl$networkImportUserLesson$1.f19882h = 3;
        objM18476r = abstractC1495o3.mo5157w0(i14, lessonRepositoryImpl$networkImportUserLesson$1);
        if (objM18476r == coroutineSingletons) {
            return coroutineSingletons;
        }
        return objM18476r;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0331  */
    /* JADX WARN: Code duplicated, block: B:105:0x035b  */
    /* JADX WARN: Code duplicated, block: B:107:0x036b  */
    /* JADX WARN: Code duplicated, block: B:109:0x0371  */
    /* JADX WARN: Code duplicated, block: B:111:0x0376  */
    /* JADX WARN: Code duplicated, block: B:114:0x037e  */
    /* JADX WARN: Code duplicated, block: B:116:0x038e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0399  */
    /* JADX WARN: Code duplicated, block: B:123:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:125:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:128:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:130:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:133:0x03de A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:134:0x03df  */
    /* JADX WARN: Code duplicated, block: B:137:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:140:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:142:0x0403  */
    /* JADX WARN: Code duplicated, block: B:144:0x0421 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:145:0x0422  */
    /* JADX WARN: Code duplicated, block: B:147:0x0428  */
    /* JADX WARN: Code duplicated, block: B:26:0x014b  */
    /* JADX WARN: Code duplicated, block: B:28:0x016c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0191  */
    /* JADX WARN: Code duplicated, block: B:39:0x019b  */
    /* JADX WARN: Code duplicated, block: B:41:0x01af  */
    /* JADX WARN: Code duplicated, block: B:45:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:46:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:49:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:51:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:54:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:56:0x01de  */
    /* JADX WARN: Code duplicated, block: B:59:0x0206 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x0207  */
    /* JADX WARN: Code duplicated, block: B:63:0x023b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x023c  */
    /* JADX WARN: Code duplicated, block: B:67:0x024a  */
    /* JADX WARN: Code duplicated, block: B:68:0x024f  */
    /* JADX WARN: Code duplicated, block: B:71:0x025f  */
    /* JADX WARN: Code duplicated, block: B:73:0x026a  */
    /* JADX WARN: Code duplicated, block: B:75:0x028e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:76:0x028f  */
    /* JADX WARN: Code duplicated, block: B:79:0x02af  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:83:0x02ce A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:84:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:87:0x02f9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:88:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:91:0x0303  */
    /* JADX WARN: Code duplicated, block: B:93:0x0307  */
    /* JADX WARN: Code duplicated, block: B:96:0x0313  */
    /* JADX WARN: Code duplicated, block: B:99:0x0320  */
    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: r */
    public final Object mo9530r(double d10, double d11, int i10, String str, InterfaceC9968c interfaceC9968c, boolean z10) throws Throwable {
        LessonRepositoryImpl$updateLessonStats$1 lessonRepositoryImpl$updateLessonStats$1;
        LessonRepositoryImpl lessonRepositoryImpl;
        int i11;
        boolean z11;
        String str2;
        double d12;
        double d13;
        Lesson lesson;
        boolean z12;
        CoroutineSingletons coroutineSingletons;
        double dM16708X0;
        double dM16708X1;
        double d14;
        double d15;
        double d16;
        double d17;
        AbstractC1495o1 abstractC1495o1;
        double d18;
        double d19;
        String str3;
        LessonRepositoryImpl lessonRepositoryImpl2;
        int i12;
        double d20;
        double d21;
        double d22;
        double d23;
        double dM16708X2;
        double dM16708X3;
        String str4;
        CoroutineSingletons coroutineSingletons2;
        int i13;
        Lesson lesson2;
        double d24;
        String str5;
        double d25;
        double d26;
        LibraryCounter libraryCounter;
        double d27;
        double d28;
        double d29;
        AbstractC1454i2 abstractC1454i2;
        double d30;
        int i14;
        String str6;
        LessonRepositoryImpl lessonRepositoryImpl3;
        double d31;
        LibraryData libraryData;
        Object objMo5082z0;
        LibraryData libraryData2;
        LibraryCounter libraryCounter2;
        double dDoubleValue;
        double dMax;
        int i15;
        double dDoubleValue2;
        double dMax2;
        double dM16708X4;
        double d32;
        double dM16708X5;
        double dM16708X6;
        AbstractC1454i2 abstractC1454i3;
        CoroutineSingletons coroutineSingletons3;
        LibraryData libraryData3;
        LibraryCounter libraryCounter3;
        int i16;
        boolean z13;
        String str7;
        double d33;
        double d34;
        double dM16708X7;
        Double d35;
        Double d36;
        int i17;
        AbstractC1454i2 abstractC1454i4;
        LessonRepositoryImpl lessonRepositoryImpl4;
        String str8;
        if (interfaceC9968c instanceof LessonRepositoryImpl$updateLessonStats$1) {
            lessonRepositoryImpl$updateLessonStats$1 = (LessonRepositoryImpl$updateLessonStats$1) interfaceC9968c;
            int i18 = lessonRepositoryImpl$updateLessonStats$1.f20037K;
            if ((i18 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$updateLessonStats$1.f20037K = i18 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$updateLessonStats$1 = new LessonRepositoryImpl$updateLessonStats$1(this, interfaceC9968c);
            }
        } else {
            lessonRepositoryImpl$updateLessonStats$1 = new LessonRepositoryImpl$updateLessonStats$1(this, interfaceC9968c);
        }
        Object objMo5082z1 = lessonRepositoryImpl$updateLessonStats$1.f20035I;
        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (lessonRepositoryImpl$updateLessonStats$1.f20037K) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C7499b.m14977z0(objMo5082z1);
                lessonRepositoryImpl$updateLessonStats$1.f20038d = this;
                lessonRepositoryImpl$updateLessonStats$1.f20039e = str;
                lessonRepositoryImpl$updateLessonStats$1.f20042h = i10;
                lessonRepositoryImpl$updateLessonStats$1.f20043i = d10;
                lessonRepositoryImpl$updateLessonStats$1.f20044j = d11;
                lessonRepositoryImpl$updateLessonStats$1.f20034H = z10;
                lessonRepositoryImpl$updateLessonStats$1.f20037K = 1;
                Object objMo5149o0 = this.f19828b.mo5149o0(i10, lessonRepositoryImpl$updateLessonStats$1);
                if (objMo5149o0 == coroutineSingletons4) {
                    return coroutineSingletons4;
                }
                lessonRepositoryImpl = this;
                i11 = i10;
                z11 = z10;
                str2 = str;
                objMo5082z1 = objMo5149o0;
                d12 = d11;
                d13 = d10;
                lesson = (Lesson) objMo5082z1;
                if (lesson != null) {
                    dM16708X0 = ((double) C8573r0.m16708X0((lesson.f17070D + d12) * 100.0d)) / 100.0d;
                    boolean z14 = z11;
                    dM16708X1 = ((double) C8573r0.m16708X0((lesson.f17071E + d13) * 100.0d)) / 100.0d;
                    if (dM16708X0 < 0.0d) {
                        dM16708X3 = ((double) C8573r0.m16708X0((-lesson.f17070D) * 100.0d)) / 100.0d;
                        if (!Double.isNaN(dM16708X3) || Double.isInfinite(dM16708X3)) {
                            dM16708X0 = 0.0d;
                            d16 = 0.0d;
                            d15 = 0.0d;
                        } else {
                            d14 = dM16708X3;
                            dM16708X0 = 0.0d;
                        }
                        if (dM16708X1 < d16) {
                            dM16708X2 = ((double) C8573r0.m16708X0((-lesson.f17071E) * 100.0d)) / 100.0d;
                            if (!Double.isNaN(dM16708X2) || Double.isInfinite(dM16708X2)) {
                                dM16708X1 = 0.0d;
                                d17 = 0.0d;
                            } else {
                                d17 = dM16708X2;
                                dM16708X1 = 0.0d;
                            }
                        } else {
                            d17 = d13;
                        }
                        if (Double.isNaN(dM16708X0) || Double.isInfinite(dM16708X0)) {
                            dM16708X0 = 0.0d;
                        }
                        lesson.f17070D = dM16708X0;
                        if (Double.isNaN(dM16708X1) || Double.isInfinite(dM16708X1)) {
                            dM16708X1 = 0.0d;
                        }
                        lesson.f17071E = dM16708X1;
                        abstractC1495o1 = lessonRepositoryImpl.f19828b;
                        lessonRepositoryImpl$updateLessonStats$1.f20038d = lessonRepositoryImpl;
                        lessonRepositoryImpl$updateLessonStats$1.f20039e = str2;
                        lessonRepositoryImpl$updateLessonStats$1.f20040f = lesson;
                        lessonRepositoryImpl$updateLessonStats$1.f20042h = i11;
                        lessonRepositoryImpl$updateLessonStats$1.f20043i = d13;
                        lessonRepositoryImpl$updateLessonStats$1.f20044j = d12;
                        lessonRepositoryImpl$updateLessonStats$1.f20034H = z14;
                        d18 = d15;
                        lessonRepositoryImpl$updateLessonStats$1.f20045k = d18;
                        z12 = z14;
                        d19 = d17;
                        lessonRepositoryImpl$updateLessonStats$1.f20046l = d19;
                        lessonRepositoryImpl$updateLessonStats$1.f20037K = 2;
                        if (abstractC1495o1.mo598h0(lesson, lessonRepositoryImpl$updateLessonStats$1) == coroutineSingletons4) {
                            return coroutineSingletons4;
                        }
                        str3 = str2;
                        lessonRepositoryImpl2 = lessonRepositoryImpl;
                        i12 = i11;
                        d20 = d12;
                        d21 = d13;
                        d22 = d18;
                        d23 = d19;
                        AbstractC1454i2 abstractC1454i5 = lessonRepositoryImpl2.f19831e;
                        String value = LibraryItemType.Content.getValue();
                        lessonRepositoryImpl$updateLessonStats$1.f20038d = lessonRepositoryImpl2;
                        lessonRepositoryImpl$updateLessonStats$1.f20039e = str3;
                        lessonRepositoryImpl$updateLessonStats$1.f20040f = lesson;
                        lessonRepositoryImpl$updateLessonStats$1.f20042h = i12;
                        lessonRepositoryImpl$updateLessonStats$1.f20043i = d21;
                        lessonRepositoryImpl$updateLessonStats$1.f20044j = d20;
                        lessonRepositoryImpl$updateLessonStats$1.f20034H = z12;
                        lessonRepositoryImpl$updateLessonStats$1.f20045k = d22;
                        lessonRepositoryImpl$updateLessonStats$1.f20046l = d23;
                        str4 = str3;
                        lessonRepositoryImpl$updateLessonStats$1.f20037K = 3;
                        objMo5082z1 = abstractC1454i5.mo5082z0(i12, value, lessonRepositoryImpl$updateLessonStats$1);
                        coroutineSingletons2 = coroutineSingletons4;
                        if (objMo5082z1 == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        i13 = i12;
                        double d37 = d22;
                        lesson2 = lesson;
                        d24 = d21;
                        str5 = str4;
                        d25 = d20;
                        d26 = d37;
                        libraryCounter = (LibraryCounter) objMo5082z1;
                        if (libraryCounter == null) {
                            libraryCounter.f17205f = new Double(lesson2.f17070D);
                        }
                        if (libraryCounter != null) {
                            libraryCounter.f17204e = new Double(lesson2.f17071E);
                        }
                        if (libraryCounter != null) {
                            abstractC1454i2 = lessonRepositoryImpl2.f19831e;
                            lessonRepositoryImpl$updateLessonStats$1.f20038d = lessonRepositoryImpl2;
                            lessonRepositoryImpl$updateLessonStats$1.f20039e = str5;
                            lessonRepositoryImpl$updateLessonStats$1.f20040f = lesson2;
                            lessonRepositoryImpl$updateLessonStats$1.f20042h = i13;
                            lessonRepositoryImpl$updateLessonStats$1.f20043i = d24;
                            lessonRepositoryImpl$updateLessonStats$1.f20044j = d25;
                            lessonRepositoryImpl$updateLessonStats$1.f20034H = z12;
                            lessonRepositoryImpl$updateLessonStats$1.f20045k = d26;
                            lessonRepositoryImpl$updateLessonStats$1.f20046l = d27;
                            lessonRepositoryImpl$updateLessonStats$1.f20037K = 4;
                            coroutineSingletons = coroutineSingletons2;
                            if (abstractC1454i2.mo5066Q0(libraryCounter, lessonRepositoryImpl$updateLessonStats$1) == coroutineSingletons) {
                                d27 = d23;
                                return coroutineSingletons;
                            }
                        } else {
                            d27 = d23;
                            coroutineSingletons = coroutineSingletons2;
                        }
                        d27 = d23;
                        d28 = d27;
                        d29 = d26;
                        lessonRepositoryImpl2.m9512d0(str5, i13, d28, d29, z12);
                        i11 = i13;
                        str2 = str5;
                        d12 = d25;
                        lessonRepositoryImpl = lessonRepositoryImpl2;
                        lesson = lesson2;
                        d13 = d24;
                    } else {
                        d14 = d12;
                    }
                    d15 = d14;
                    d16 = 0.0d;
                    if (dM16708X1 < d16) {
                        dM16708X2 = ((double) C8573r0.m16708X0((-lesson.f17071E) * 100.0d)) / 100.0d;
                        if (Double.isNaN(dM16708X2)) {
                            dM16708X1 = 0.0d;
                            d17 = 0.0d;
                        } else {
                            dM16708X1 = 0.0d;
                            d17 = 0.0d;
                        }
                    } else {
                        d17 = d13;
                    }
                    if (Double.isNaN(dM16708X0)) {
                        dM16708X0 = 0.0d;
                    } else {
                        dM16708X0 = 0.0d;
                    }
                    lesson.f17070D = dM16708X0;
                    if (Double.isNaN(dM16708X1)) {
                        dM16708X1 = 0.0d;
                    } else {
                        dM16708X1 = 0.0d;
                    }
                    lesson.f17071E = dM16708X1;
                    abstractC1495o1 = lessonRepositoryImpl.f19828b;
                    lessonRepositoryImpl$updateLessonStats$1.f20038d = lessonRepositoryImpl;
                    lessonRepositoryImpl$updateLessonStats$1.f20039e = str2;
                    lessonRepositoryImpl$updateLessonStats$1.f20040f = lesson;
                    lessonRepositoryImpl$updateLessonStats$1.f20042h = i11;
                    lessonRepositoryImpl$updateLessonStats$1.f20043i = d13;
                    lessonRepositoryImpl$updateLessonStats$1.f20044j = d12;
                    lessonRepositoryImpl$updateLessonStats$1.f20034H = z14;
                    d18 = d15;
                    lessonRepositoryImpl$updateLessonStats$1.f20045k = d18;
                    z12 = z14;
                    d19 = d17;
                    lessonRepositoryImpl$updateLessonStats$1.f20046l = d19;
                    lessonRepositoryImpl$updateLessonStats$1.f20037K = 2;
                    if (abstractC1495o1.mo598h0(lesson, lessonRepositoryImpl$updateLessonStats$1) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                    str3 = str2;
                    lessonRepositoryImpl2 = lessonRepositoryImpl;
                    i12 = i11;
                    d20 = d12;
                    d21 = d13;
                    d22 = d18;
                    d23 = d19;
                    AbstractC1454i2 abstractC1454i6 = lessonRepositoryImpl2.f19831e;
                    String value2 = LibraryItemType.Content.getValue();
                    lessonRepositoryImpl$updateLessonStats$1.f20038d = lessonRepositoryImpl2;
                    lessonRepositoryImpl$updateLessonStats$1.f20039e = str3;
                    lessonRepositoryImpl$updateLessonStats$1.f20040f = lesson;
                    lessonRepositoryImpl$updateLessonStats$1.f20042h = i12;
                    lessonRepositoryImpl$updateLessonStats$1.f20043i = d21;
                    lessonRepositoryImpl$updateLessonStats$1.f20044j = d20;
                    lessonRepositoryImpl$updateLessonStats$1.f20034H = z12;
                    lessonRepositoryImpl$updateLessonStats$1.f20045k = d22;
                    lessonRepositoryImpl$updateLessonStats$1.f20046l = d23;
                    str4 = str3;
                    lessonRepositoryImpl$updateLessonStats$1.f20037K = 3;
                    objMo5082z1 = abstractC1454i6.mo5082z0(i12, value2, lessonRepositoryImpl$updateLessonStats$1);
                    coroutineSingletons2 = coroutineSingletons4;
                    if (objMo5082z1 == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                    i13 = i12;
                    double d38 = d22;
                    lesson2 = lesson;
                    d24 = d21;
                    str5 = str4;
                    d25 = d20;
                    d26 = d38;
                    libraryCounter = (LibraryCounter) objMo5082z1;
                    if (libraryCounter == null) {
                        libraryCounter.f17205f = new Double(lesson2.f17070D);
                    }
                    if (libraryCounter != null) {
                        libraryCounter.f17204e = new Double(lesson2.f17071E);
                    }
                    if (libraryCounter != null) {
                        abstractC1454i2 = lessonRepositoryImpl2.f19831e;
                        lessonRepositoryImpl$updateLessonStats$1.f20038d = lessonRepositoryImpl2;
                        lessonRepositoryImpl$updateLessonStats$1.f20039e = str5;
                        lessonRepositoryImpl$updateLessonStats$1.f20040f = lesson2;
                        lessonRepositoryImpl$updateLessonStats$1.f20042h = i13;
                        lessonRepositoryImpl$updateLessonStats$1.f20043i = d24;
                        lessonRepositoryImpl$updateLessonStats$1.f20044j = d25;
                        lessonRepositoryImpl$updateLessonStats$1.f20034H = z12;
                        lessonRepositoryImpl$updateLessonStats$1.f20045k = d26;
                        lessonRepositoryImpl$updateLessonStats$1.f20046l = d27;
                        lessonRepositoryImpl$updateLessonStats$1.f20037K = 4;
                        coroutineSingletons = coroutineSingletons2;
                        if (abstractC1454i2.mo5066Q0(libraryCounter, lessonRepositoryImpl$updateLessonStats$1) == coroutineSingletons) {
                            d27 = d23;
                            return coroutineSingletons;
                        }
                    } else {
                        d27 = d23;
                        coroutineSingletons = coroutineSingletons2;
                    }
                    d27 = d23;
                    d28 = d27;
                    d29 = d26;
                    lessonRepositoryImpl2.m9512d0(str5, i13, d28, d29, z12);
                    i11 = i13;
                    str2 = str5;
                    d12 = d25;
                    lessonRepositoryImpl = lessonRepositoryImpl2;
                    lesson = lesson2;
                    d13 = d24;
                } else {
                    z12 = z11;
                    coroutineSingletons = coroutineSingletons4;
                }
                if (lesson == null) {
                    AbstractC1454i2 abstractC1454i7 = lessonRepositoryImpl.f19831e;
                    lessonRepositoryImpl$updateLessonStats$1.f20038d = lessonRepositoryImpl;
                    lessonRepositoryImpl$updateLessonStats$1.f20039e = str2;
                    lessonRepositoryImpl$updateLessonStats$1.f20040f = null;
                    lessonRepositoryImpl$updateLessonStats$1.f20042h = i11;
                    lessonRepositoryImpl$updateLessonStats$1.f20043i = d13;
                    lessonRepositoryImpl$updateLessonStats$1.f20044j = d12;
                    lessonRepositoryImpl$updateLessonStats$1.f20034H = z12;
                    lessonRepositoryImpl$updateLessonStats$1.f20037K = 5;
                    objMo5082z1 = abstractC1454i7.mo5079w0(i11, lessonRepositoryImpl$updateLessonStats$1);
                    if (objMo5082z1 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    d30 = d13;
                    double d39 = d12;
                    i14 = i11;
                    str6 = str2;
                    lessonRepositoryImpl3 = lessonRepositoryImpl;
                    d31 = d39;
                    libraryData = (LibraryData) objMo5082z1;
                    AbstractC1454i2 abstractC1454i8 = lessonRepositoryImpl3.f19831e;
                    String value3 = LibraryItemType.Content.getValue();
                    lessonRepositoryImpl$updateLessonStats$1.f20038d = lessonRepositoryImpl3;
                    lessonRepositoryImpl$updateLessonStats$1.f20039e = str6;
                    lessonRepositoryImpl$updateLessonStats$1.f20040f = libraryData;
                    lessonRepositoryImpl$updateLessonStats$1.f20042h = i14;
                    lessonRepositoryImpl$updateLessonStats$1.f20043i = d30;
                    lessonRepositoryImpl$updateLessonStats$1.f20044j = d31;
                    lessonRepositoryImpl$updateLessonStats$1.f20034H = z12;
                    lessonRepositoryImpl$updateLessonStats$1.f20037K = 6;
                    objMo5082z0 = abstractC1454i8.mo5082z0(i14, value3, lessonRepositoryImpl$updateLessonStats$1);
                    if (objMo5082z0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    objMo5082z1 = objMo5082z0;
                    libraryData2 = libraryData;
                    libraryCounter2 = (LibraryCounter) objMo5082z1;
                    if (libraryData2 != null) {
                        double d40 = libraryData2.f17234M;
                        if (libraryCounter2 != null || (d36 = libraryCounter2.f17205f) == null) {
                            dDoubleValue = 0.0d;
                        } else {
                            dDoubleValue = d36.doubleValue();
                        }
                        dMax = Math.max(d40, dDoubleValue);
                        double d41 = libraryData2.f17233L;
                        i15 = i14;
                        if (libraryCounter2 != null || (d35 = libraryCounter2.f17204e) == null) {
                            dDoubleValue2 = 0.0d;
                        } else {
                            dDoubleValue2 = d35.doubleValue();
                        }
                        dMax2 = Math.max(d41, dDoubleValue2);
                        dM16708X4 = ((double) C8573r0.m16708X0((dMax + d31) * 100.0d)) / 100.0d;
                        d32 = d31;
                        dM16708X5 = ((double) C8573r0.m16708X0((dMax2 + d30) * 100.0d)) / 100.0d;
                        if (dM16708X4 < 0.0d) {
                            dM16708X6 = ((double) C8573r0.m16708X0((-dMax) * 100.0d)) / 100.0d;
                            if (Double.isNaN(dM16708X6) || Double.isInfinite(dM16708X6)) {
                                dM16708X6 = 0.0d;
                            }
                            dM16708X4 = 0.0d;
                        } else {
                            dM16708X6 = d32;
                        }
                        if (dM16708X5 < 0.0d) {
                            dM16708X7 = ((double) C8573r0.m16708X0((-dMax2) * 100.0d)) / 100.0d;
                            if (!Double.isNaN(dM16708X7) || Double.isInfinite(dM16708X7)) {
                                dM16708X5 = 0.0d;
                                d30 = 0.0d;
                            } else {
                                d30 = dM16708X7;
                                dM16708X5 = 0.0d;
                            }
                        }
                        if (Double.isNaN(dM16708X4) || Double.isInfinite(dM16708X4)) {
                            dM16708X4 = 0.0d;
                        }
                        libraryData2.f17234M = dM16708X4;
                        if (Double.isNaN(dM16708X5) || Double.isInfinite(dM16708X5)) {
                            dM16708X5 = 0.0d;
                        }
                        libraryData2.f17233L = dM16708X5;
                        abstractC1454i3 = lessonRepositoryImpl3.f19831e;
                        lessonRepositoryImpl$updateLessonStats$1.f20038d = lessonRepositoryImpl3;
                        lessonRepositoryImpl$updateLessonStats$1.f20039e = str6;
                        lessonRepositoryImpl$updateLessonStats$1.f20040f = libraryData2;
                        lessonRepositoryImpl$updateLessonStats$1.f20041g = libraryCounter2;
                        lessonRepositoryImpl$updateLessonStats$1.f20042h = i15;
                        lessonRepositoryImpl$updateLessonStats$1.f20034H = z12;
                        lessonRepositoryImpl$updateLessonStats$1.f20043i = dM16708X6;
                        lessonRepositoryImpl$updateLessonStats$1.f20044j = d30;
                        lessonRepositoryImpl$updateLessonStats$1.f20037K = 7;
                        coroutineSingletons3 = coroutineSingletons;
                        if (abstractC1454i3.mo598h0(libraryData2, lessonRepositoryImpl$updateLessonStats$1) == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                        libraryData3 = libraryData2;
                        libraryCounter3 = libraryCounter2;
                        i16 = i15;
                        z13 = z12;
                        double d42 = d30;
                        str7 = str6;
                        d33 = dM16708X6;
                        d34 = d42;
                        if (libraryCounter3 != null) {
                            libraryCounter3.f17205f = new Double(libraryData3.f17234M);
                        }
                        if (libraryCounter3 != null) {
                            libraryCounter3.f17204e = new Double(libraryData3.f17233L);
                        }
                        if (libraryCounter3 != null) {
                            abstractC1454i4 = lessonRepositoryImpl3.f19831e;
                            lessonRepositoryImpl$updateLessonStats$1.f20038d = lessonRepositoryImpl3;
                            lessonRepositoryImpl$updateLessonStats$1.f20039e = str7;
                            lessonRepositoryImpl$updateLessonStats$1.f20040f = null;
                            lessonRepositoryImpl$updateLessonStats$1.f20041g = null;
                            lessonRepositoryImpl$updateLessonStats$1.f20042h = i16;
                            lessonRepositoryImpl$updateLessonStats$1.f20034H = z13;
                            lessonRepositoryImpl$updateLessonStats$1.f20043i = d33;
                            lessonRepositoryImpl$updateLessonStats$1.f20044j = d34;
                            lessonRepositoryImpl$updateLessonStats$1.f20037K = 8;
                            if (abstractC1454i4.mo5066Q0(libraryCounter3, lessonRepositoryImpl$updateLessonStats$1) == coroutineSingletons3) {
                                return coroutineSingletons3;
                            }
                            i17 = i16;
                            lessonRepositoryImpl4 = lessonRepositoryImpl3;
                            str8 = str7;
                            str7 = str8;
                            lessonRepositoryImpl3 = lessonRepositoryImpl4;
                        } else {
                            i17 = i16;
                        }
                        lessonRepositoryImpl3.m9512d0(str7, i17, d34, d33, z13);
                    }
                }
                return C9072e.f47360a;
            case 1:
                z11 = lessonRepositoryImpl$updateLessonStats$1.f20034H;
                d12 = lessonRepositoryImpl$updateLessonStats$1.f20044j;
                d13 = lessonRepositoryImpl$updateLessonStats$1.f20043i;
                i11 = lessonRepositoryImpl$updateLessonStats$1.f20042h;
                str2 = lessonRepositoryImpl$updateLessonStats$1.f20039e;
                lessonRepositoryImpl = lessonRepositoryImpl$updateLessonStats$1.f20038d;
                C7499b.m14977z0(objMo5082z1);
                lesson = (Lesson) objMo5082z1;
                if (lesson != null) {
                    dM16708X0 = ((double) C8573r0.m16708X0((lesson.f17070D + d12) * 100.0d)) / 100.0d;
                    boolean z15 = z11;
                    dM16708X1 = ((double) C8573r0.m16708X0((lesson.f17071E + d13) * 100.0d)) / 100.0d;
                    if (dM16708X0 < 0.0d) {
                        dM16708X3 = ((double) C8573r0.m16708X0((-lesson.f17070D) * 100.0d)) / 100.0d;
                        if (Double.isNaN(dM16708X3)) {
                        }
                        dM16708X0 = 0.0d;
                        d16 = 0.0d;
                        d15 = 0.0d;
                        if (dM16708X1 < d16) {
                            dM16708X2 = ((double) C8573r0.m16708X0((-lesson.f17071E) * 100.0d)) / 100.0d;
                            if (Double.isNaN(dM16708X2)) {
                                dM16708X1 = 0.0d;
                                d17 = 0.0d;
                            } else {
                                dM16708X1 = 0.0d;
                                d17 = 0.0d;
                            }
                        } else {
                            d17 = d13;
                        }
                        if (Double.isNaN(dM16708X0)) {
                            dM16708X0 = 0.0d;
                        } else {
                            dM16708X0 = 0.0d;
                        }
                        lesson.f17070D = dM16708X0;
                        if (Double.isNaN(dM16708X1)) {
                            dM16708X1 = 0.0d;
                        } else {
                            dM16708X1 = 0.0d;
                        }
                        lesson.f17071E = dM16708X1;
                        abstractC1495o1 = lessonRepositoryImpl.f19828b;
                        lessonRepositoryImpl$updateLessonStats$1.f20038d = lessonRepositoryImpl;
                        lessonRepositoryImpl$updateLessonStats$1.f20039e = str2;
                        lessonRepositoryImpl$updateLessonStats$1.f20040f = lesson;
                        lessonRepositoryImpl$updateLessonStats$1.f20042h = i11;
                        lessonRepositoryImpl$updateLessonStats$1.f20043i = d13;
                        lessonRepositoryImpl$updateLessonStats$1.f20044j = d12;
                        lessonRepositoryImpl$updateLessonStats$1.f20034H = z15;
                        d18 = d15;
                        lessonRepositoryImpl$updateLessonStats$1.f20045k = d18;
                        z12 = z15;
                        d19 = d17;
                        lessonRepositoryImpl$updateLessonStats$1.f20046l = d19;
                        lessonRepositoryImpl$updateLessonStats$1.f20037K = 2;
                        if (abstractC1495o1.mo598h0(lesson, lessonRepositoryImpl$updateLessonStats$1) == coroutineSingletons4) {
                            return coroutineSingletons4;
                        }
                        str3 = str2;
                        lessonRepositoryImpl2 = lessonRepositoryImpl;
                        i12 = i11;
                        d20 = d12;
                        d21 = d13;
                        d22 = d18;
                        d23 = d19;
                        AbstractC1454i2 abstractC1454i9 = lessonRepositoryImpl2.f19831e;
                        String value4 = LibraryItemType.Content.getValue();
                        lessonRepositoryImpl$updateLessonStats$1.f20038d = lessonRepositoryImpl2;
                        lessonRepositoryImpl$updateLessonStats$1.f20039e = str3;
                        lessonRepositoryImpl$updateLessonStats$1.f20040f = lesson;
                        lessonRepositoryImpl$updateLessonStats$1.f20042h = i12;
                        lessonRepositoryImpl$updateLessonStats$1.f20043i = d21;
                        lessonRepositoryImpl$updateLessonStats$1.f20044j = d20;
                        lessonRepositoryImpl$updateLessonStats$1.f20034H = z12;
                        lessonRepositoryImpl$updateLessonStats$1.f20045k = d22;
                        lessonRepositoryImpl$updateLessonStats$1.f20046l = d23;
                        str4 = str3;
                        lessonRepositoryImpl$updateLessonStats$1.f20037K = 3;
                        objMo5082z1 = abstractC1454i9.mo5082z0(i12, value4, lessonRepositoryImpl$updateLessonStats$1);
                        coroutineSingletons2 = coroutineSingletons4;
                        if (objMo5082z1 == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        i13 = i12;
                        double d310 = d22;
                        lesson2 = lesson;
                        d24 = d21;
                        str5 = str4;
                        d25 = d20;
                        d26 = d310;
                        libraryCounter = (LibraryCounter) objMo5082z1;
                        if (libraryCounter == null) {
                            libraryCounter.f17205f = new Double(lesson2.f17070D);
                        }
                        if (libraryCounter != null) {
                            libraryCounter.f17204e = new Double(lesson2.f17071E);
                        }
                        if (libraryCounter != null) {
                            abstractC1454i2 = lessonRepositoryImpl2.f19831e;
                            lessonRepositoryImpl$updateLessonStats$1.f20038d = lessonRepositoryImpl2;
                            lessonRepositoryImpl$updateLessonStats$1.f20039e = str5;
                            lessonRepositoryImpl$updateLessonStats$1.f20040f = lesson2;
                            lessonRepositoryImpl$updateLessonStats$1.f20042h = i13;
                            lessonRepositoryImpl$updateLessonStats$1.f20043i = d24;
                            lessonRepositoryImpl$updateLessonStats$1.f20044j = d25;
                            lessonRepositoryImpl$updateLessonStats$1.f20034H = z12;
                            lessonRepositoryImpl$updateLessonStats$1.f20045k = d26;
                            lessonRepositoryImpl$updateLessonStats$1.f20046l = d27;
                            lessonRepositoryImpl$updateLessonStats$1.f20037K = 4;
                            coroutineSingletons = coroutineSingletons2;
                            if (abstractC1454i2.mo5066Q0(libraryCounter, lessonRepositoryImpl$updateLessonStats$1) == coroutineSingletons) {
                                d27 = d23;
                                return coroutineSingletons;
                            }
                        } else {
                            d27 = d23;
                            coroutineSingletons = coroutineSingletons2;
                        }
                        d27 = d23;
                        d28 = d27;
                        d29 = d26;
                        lessonRepositoryImpl2.m9512d0(str5, i13, d28, d29, z12);
                        i11 = i13;
                        str2 = str5;
                        d12 = d25;
                        lessonRepositoryImpl = lessonRepositoryImpl2;
                        lesson = lesson2;
                        d13 = d24;
                    } else {
                        d14 = d12;
                    }
                    d15 = d14;
                    d16 = 0.0d;
                    if (dM16708X1 < d16) {
                        dM16708X2 = ((double) C8573r0.m16708X0((-lesson.f17071E) * 100.0d)) / 100.0d;
                        if (Double.isNaN(dM16708X2)) {
                            dM16708X1 = 0.0d;
                            d17 = 0.0d;
                        } else {
                            dM16708X1 = 0.0d;
                            d17 = 0.0d;
                        }
                    } else {
                        d17 = d13;
                    }
                    if (Double.isNaN(dM16708X0)) {
                        dM16708X0 = 0.0d;
                    } else {
                        dM16708X0 = 0.0d;
                    }
                    lesson.f17070D = dM16708X0;
                    if (Double.isNaN(dM16708X1)) {
                        dM16708X1 = 0.0d;
                    } else {
                        dM16708X1 = 0.0d;
                    }
                    lesson.f17071E = dM16708X1;
                    abstractC1495o1 = lessonRepositoryImpl.f19828b;
                    lessonRepositoryImpl$updateLessonStats$1.f20038d = lessonRepositoryImpl;
                    lessonRepositoryImpl$updateLessonStats$1.f20039e = str2;
                    lessonRepositoryImpl$updateLessonStats$1.f20040f = lesson;
                    lessonRepositoryImpl$updateLessonStats$1.f20042h = i11;
                    lessonRepositoryImpl$updateLessonStats$1.f20043i = d13;
                    lessonRepositoryImpl$updateLessonStats$1.f20044j = d12;
                    lessonRepositoryImpl$updateLessonStats$1.f20034H = z15;
                    d18 = d15;
                    lessonRepositoryImpl$updateLessonStats$1.f20045k = d18;
                    z12 = z15;
                    d19 = d17;
                    lessonRepositoryImpl$updateLessonStats$1.f20046l = d19;
                    lessonRepositoryImpl$updateLessonStats$1.f20037K = 2;
                    if (abstractC1495o1.mo598h0(lesson, lessonRepositoryImpl$updateLessonStats$1) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                    str3 = str2;
                    lessonRepositoryImpl2 = lessonRepositoryImpl;
                    i12 = i11;
                    d20 = d12;
                    d21 = d13;
                    d22 = d18;
                    d23 = d19;
                    AbstractC1454i2 abstractC1454i10 = lessonRepositoryImpl2.f19831e;
                    String value5 = LibraryItemType.Content.getValue();
                    lessonRepositoryImpl$updateLessonStats$1.f20038d = lessonRepositoryImpl2;
                    lessonRepositoryImpl$updateLessonStats$1.f20039e = str3;
                    lessonRepositoryImpl$updateLessonStats$1.f20040f = lesson;
                    lessonRepositoryImpl$updateLessonStats$1.f20042h = i12;
                    lessonRepositoryImpl$updateLessonStats$1.f20043i = d21;
                    lessonRepositoryImpl$updateLessonStats$1.f20044j = d20;
                    lessonRepositoryImpl$updateLessonStats$1.f20034H = z12;
                    lessonRepositoryImpl$updateLessonStats$1.f20045k = d22;
                    lessonRepositoryImpl$updateLessonStats$1.f20046l = d23;
                    str4 = str3;
                    lessonRepositoryImpl$updateLessonStats$1.f20037K = 3;
                    objMo5082z1 = abstractC1454i10.mo5082z0(i12, value5, lessonRepositoryImpl$updateLessonStats$1);
                    coroutineSingletons2 = coroutineSingletons4;
                    if (objMo5082z1 == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                    i13 = i12;
                    double d311 = d22;
                    lesson2 = lesson;
                    d24 = d21;
                    str5 = str4;
                    d25 = d20;
                    d26 = d311;
                    libraryCounter = (LibraryCounter) objMo5082z1;
                    if (libraryCounter == null) {
                        libraryCounter.f17205f = new Double(lesson2.f17070D);
                    }
                    if (libraryCounter != null) {
                        libraryCounter.f17204e = new Double(lesson2.f17071E);
                    }
                    if (libraryCounter != null) {
                        abstractC1454i2 = lessonRepositoryImpl2.f19831e;
                        lessonRepositoryImpl$updateLessonStats$1.f20038d = lessonRepositoryImpl2;
                        lessonRepositoryImpl$updateLessonStats$1.f20039e = str5;
                        lessonRepositoryImpl$updateLessonStats$1.f20040f = lesson2;
                        lessonRepositoryImpl$updateLessonStats$1.f20042h = i13;
                        lessonRepositoryImpl$updateLessonStats$1.f20043i = d24;
                        lessonRepositoryImpl$updateLessonStats$1.f20044j = d25;
                        lessonRepositoryImpl$updateLessonStats$1.f20034H = z12;
                        lessonRepositoryImpl$updateLessonStats$1.f20045k = d26;
                        lessonRepositoryImpl$updateLessonStats$1.f20046l = d27;
                        lessonRepositoryImpl$updateLessonStats$1.f20037K = 4;
                        coroutineSingletons = coroutineSingletons2;
                        if (abstractC1454i2.mo5066Q0(libraryCounter, lessonRepositoryImpl$updateLessonStats$1) == coroutineSingletons) {
                            d27 = d23;
                            return coroutineSingletons;
                        }
                    } else {
                        d27 = d23;
                        coroutineSingletons = coroutineSingletons2;
                    }
                    d27 = d23;
                    d28 = d27;
                    d29 = d26;
                    lessonRepositoryImpl2.m9512d0(str5, i13, d28, d29, z12);
                    i11 = i13;
                    str2 = str5;
                    d12 = d25;
                    lessonRepositoryImpl = lessonRepositoryImpl2;
                    lesson = lesson2;
                    d13 = d24;
                    break;
                } else {
                    z12 = z11;
                    coroutineSingletons = coroutineSingletons4;
                }
                if (lesson == null) {
                    AbstractC1454i2 abstractC1454i11 = lessonRepositoryImpl.f19831e;
                    lessonRepositoryImpl$updateLessonStats$1.f20038d = lessonRepositoryImpl;
                    lessonRepositoryImpl$updateLessonStats$1.f20039e = str2;
                    lessonRepositoryImpl$updateLessonStats$1.f20040f = null;
                    lessonRepositoryImpl$updateLessonStats$1.f20042h = i11;
                    lessonRepositoryImpl$updateLessonStats$1.f20043i = d13;
                    lessonRepositoryImpl$updateLessonStats$1.f20044j = d12;
                    lessonRepositoryImpl$updateLessonStats$1.f20034H = z12;
                    lessonRepositoryImpl$updateLessonStats$1.f20037K = 5;
                    objMo5082z1 = abstractC1454i11.mo5079w0(i11, lessonRepositoryImpl$updateLessonStats$1);
                    if (objMo5082z1 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    d30 = d13;
                    double d312 = d12;
                    i14 = i11;
                    str6 = str2;
                    lessonRepositoryImpl3 = lessonRepositoryImpl;
                    d31 = d312;
                    libraryData = (LibraryData) objMo5082z1;
                    AbstractC1454i2 abstractC1454i12 = lessonRepositoryImpl3.f19831e;
                    String value6 = LibraryItemType.Content.getValue();
                    lessonRepositoryImpl$updateLessonStats$1.f20038d = lessonRepositoryImpl3;
                    lessonRepositoryImpl$updateLessonStats$1.f20039e = str6;
                    lessonRepositoryImpl$updateLessonStats$1.f20040f = libraryData;
                    lessonRepositoryImpl$updateLessonStats$1.f20042h = i14;
                    lessonRepositoryImpl$updateLessonStats$1.f20043i = d30;
                    lessonRepositoryImpl$updateLessonStats$1.f20044j = d31;
                    lessonRepositoryImpl$updateLessonStats$1.f20034H = z12;
                    lessonRepositoryImpl$updateLessonStats$1.f20037K = 6;
                    objMo5082z0 = abstractC1454i12.mo5082z0(i14, value6, lessonRepositoryImpl$updateLessonStats$1);
                    if (objMo5082z0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    objMo5082z1 = objMo5082z0;
                    libraryData2 = libraryData;
                    libraryCounter2 = (LibraryCounter) objMo5082z1;
                    if (libraryData2 != null) {
                        double d43 = libraryData2.f17234M;
                        if (libraryCounter2 != null) {
                            dDoubleValue = 0.0d;
                        } else {
                            dDoubleValue = 0.0d;
                        }
                        dMax = Math.max(d43, dDoubleValue);
                        double d44 = libraryData2.f17233L;
                        i15 = i14;
                        if (libraryCounter2 != null) {
                            dDoubleValue2 = 0.0d;
                        } else {
                            dDoubleValue2 = 0.0d;
                        }
                        dMax2 = Math.max(d44, dDoubleValue2);
                        dM16708X4 = ((double) C8573r0.m16708X0((dMax + d31) * 100.0d)) / 100.0d;
                        d32 = d31;
                        dM16708X5 = ((double) C8573r0.m16708X0((dMax2 + d30) * 100.0d)) / 100.0d;
                        if (dM16708X4 < 0.0d) {
                            dM16708X6 = ((double) C8573r0.m16708X0((-dMax) * 100.0d)) / 100.0d;
                            if (Double.isNaN(dM16708X6)) {
                                dM16708X6 = 0.0d;
                            } else {
                                dM16708X6 = 0.0d;
                            }
                            dM16708X4 = 0.0d;
                        } else {
                            dM16708X6 = d32;
                        }
                        if (dM16708X5 < 0.0d) {
                            dM16708X7 = ((double) C8573r0.m16708X0((-dMax2) * 100.0d)) / 100.0d;
                            if (Double.isNaN(dM16708X7)) {
                                dM16708X5 = 0.0d;
                                d30 = 0.0d;
                            } else {
                                dM16708X5 = 0.0d;
                                d30 = 0.0d;
                            }
                        }
                        if (Double.isNaN(dM16708X4)) {
                            dM16708X4 = 0.0d;
                        } else {
                            dM16708X4 = 0.0d;
                        }
                        libraryData2.f17234M = dM16708X4;
                        if (Double.isNaN(dM16708X5)) {
                            dM16708X5 = 0.0d;
                        } else {
                            dM16708X5 = 0.0d;
                        }
                        libraryData2.f17233L = dM16708X5;
                        abstractC1454i3 = lessonRepositoryImpl3.f19831e;
                        lessonRepositoryImpl$updateLessonStats$1.f20038d = lessonRepositoryImpl3;
                        lessonRepositoryImpl$updateLessonStats$1.f20039e = str6;
                        lessonRepositoryImpl$updateLessonStats$1.f20040f = libraryData2;
                        lessonRepositoryImpl$updateLessonStats$1.f20041g = libraryCounter2;
                        lessonRepositoryImpl$updateLessonStats$1.f20042h = i15;
                        lessonRepositoryImpl$updateLessonStats$1.f20034H = z12;
                        lessonRepositoryImpl$updateLessonStats$1.f20043i = dM16708X6;
                        lessonRepositoryImpl$updateLessonStats$1.f20044j = d30;
                        lessonRepositoryImpl$updateLessonStats$1.f20037K = 7;
                        coroutineSingletons3 = coroutineSingletons;
                        if (abstractC1454i3.mo598h0(libraryData2, lessonRepositoryImpl$updateLessonStats$1) == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                        libraryData3 = libraryData2;
                        libraryCounter3 = libraryCounter2;
                        i16 = i15;
                        z13 = z12;
                        double d45 = d30;
                        str7 = str6;
                        d33 = dM16708X6;
                        d34 = d45;
                        if (libraryCounter3 != null) {
                            libraryCounter3.f17205f = new Double(libraryData3.f17234M);
                        }
                        if (libraryCounter3 != null) {
                            libraryCounter3.f17204e = new Double(libraryData3.f17233L);
                        }
                        if (libraryCounter3 != null) {
                            abstractC1454i4 = lessonRepositoryImpl3.f19831e;
                            lessonRepositoryImpl$updateLessonStats$1.f20038d = lessonRepositoryImpl3;
                            lessonRepositoryImpl$updateLessonStats$1.f20039e = str7;
                            lessonRepositoryImpl$updateLessonStats$1.f20040f = null;
                            lessonRepositoryImpl$updateLessonStats$1.f20041g = null;
                            lessonRepositoryImpl$updateLessonStats$1.f20042h = i16;
                            lessonRepositoryImpl$updateLessonStats$1.f20034H = z13;
                            lessonRepositoryImpl$updateLessonStats$1.f20043i = d33;
                            lessonRepositoryImpl$updateLessonStats$1.f20044j = d34;
                            lessonRepositoryImpl$updateLessonStats$1.f20037K = 8;
                            if (abstractC1454i4.mo5066Q0(libraryCounter3, lessonRepositoryImpl$updateLessonStats$1) == coroutineSingletons3) {
                                return coroutineSingletons3;
                            }
                            i17 = i16;
                            lessonRepositoryImpl4 = lessonRepositoryImpl3;
                            str8 = str7;
                            str7 = str8;
                            lessonRepositoryImpl3 = lessonRepositoryImpl4;
                        } else {
                            i17 = i16;
                        }
                        lessonRepositoryImpl3.m9512d0(str7, i17, d34, d33, z13);
                    }
                }
                return C9072e.f47360a;
            case 2:
                d23 = lessonRepositoryImpl$updateLessonStats$1.f20046l;
                d22 = lessonRepositoryImpl$updateLessonStats$1.f20045k;
                boolean z16 = lessonRepositoryImpl$updateLessonStats$1.f20034H;
                d20 = lessonRepositoryImpl$updateLessonStats$1.f20044j;
                d21 = lessonRepositoryImpl$updateLessonStats$1.f20043i;
                i12 = lessonRepositoryImpl$updateLessonStats$1.f20042h;
                lesson = (Lesson) lessonRepositoryImpl$updateLessonStats$1.f20040f;
                String str9 = lessonRepositoryImpl$updateLessonStats$1.f20039e;
                lessonRepositoryImpl2 = lessonRepositoryImpl$updateLessonStats$1.f20038d;
                C7499b.m14977z0(objMo5082z1);
                str3 = str9;
                z12 = z16;
                AbstractC1454i2 abstractC1454i13 = lessonRepositoryImpl2.f19831e;
                String value7 = LibraryItemType.Content.getValue();
                lessonRepositoryImpl$updateLessonStats$1.f20038d = lessonRepositoryImpl2;
                lessonRepositoryImpl$updateLessonStats$1.f20039e = str3;
                lessonRepositoryImpl$updateLessonStats$1.f20040f = lesson;
                lessonRepositoryImpl$updateLessonStats$1.f20042h = i12;
                lessonRepositoryImpl$updateLessonStats$1.f20043i = d21;
                lessonRepositoryImpl$updateLessonStats$1.f20044j = d20;
                lessonRepositoryImpl$updateLessonStats$1.f20034H = z12;
                lessonRepositoryImpl$updateLessonStats$1.f20045k = d22;
                lessonRepositoryImpl$updateLessonStats$1.f20046l = d23;
                str4 = str3;
                lessonRepositoryImpl$updateLessonStats$1.f20037K = 3;
                objMo5082z1 = abstractC1454i13.mo5082z0(i12, value7, lessonRepositoryImpl$updateLessonStats$1);
                coroutineSingletons2 = coroutineSingletons4;
                if (objMo5082z1 == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                i13 = i12;
                double d313 = d22;
                lesson2 = lesson;
                d24 = d21;
                str5 = str4;
                d25 = d20;
                d26 = d313;
                libraryCounter = (LibraryCounter) objMo5082z1;
                if (libraryCounter == null) {
                    libraryCounter.f17205f = new Double(lesson2.f17070D);
                }
                if (libraryCounter != null) {
                    libraryCounter.f17204e = new Double(lesson2.f17071E);
                }
                if (libraryCounter != null) {
                    abstractC1454i2 = lessonRepositoryImpl2.f19831e;
                    lessonRepositoryImpl$updateLessonStats$1.f20038d = lessonRepositoryImpl2;
                    lessonRepositoryImpl$updateLessonStats$1.f20039e = str5;
                    lessonRepositoryImpl$updateLessonStats$1.f20040f = lesson2;
                    lessonRepositoryImpl$updateLessonStats$1.f20042h = i13;
                    lessonRepositoryImpl$updateLessonStats$1.f20043i = d24;
                    lessonRepositoryImpl$updateLessonStats$1.f20044j = d25;
                    lessonRepositoryImpl$updateLessonStats$1.f20034H = z12;
                    lessonRepositoryImpl$updateLessonStats$1.f20045k = d26;
                    lessonRepositoryImpl$updateLessonStats$1.f20046l = d27;
                    lessonRepositoryImpl$updateLessonStats$1.f20037K = 4;
                    coroutineSingletons = coroutineSingletons2;
                    if (abstractC1454i2.mo5066Q0(libraryCounter, lessonRepositoryImpl$updateLessonStats$1) == coroutineSingletons) {
                        d27 = d23;
                        return coroutineSingletons;
                    }
                } else {
                    d27 = d23;
                    coroutineSingletons = coroutineSingletons2;
                }
                d27 = d23;
                d28 = d27;
                d29 = d26;
                lessonRepositoryImpl2.m9512d0(str5, i13, d28, d29, z12);
                i11 = i13;
                str2 = str5;
                d12 = d25;
                lessonRepositoryImpl = lessonRepositoryImpl2;
                lesson = lesson2;
                d13 = d24;
                if (lesson == null) {
                    AbstractC1454i2 abstractC1454i14 = lessonRepositoryImpl.f19831e;
                    lessonRepositoryImpl$updateLessonStats$1.f20038d = lessonRepositoryImpl;
                    lessonRepositoryImpl$updateLessonStats$1.f20039e = str2;
                    lessonRepositoryImpl$updateLessonStats$1.f20040f = null;
                    lessonRepositoryImpl$updateLessonStats$1.f20042h = i11;
                    lessonRepositoryImpl$updateLessonStats$1.f20043i = d13;
                    lessonRepositoryImpl$updateLessonStats$1.f20044j = d12;
                    lessonRepositoryImpl$updateLessonStats$1.f20034H = z12;
                    lessonRepositoryImpl$updateLessonStats$1.f20037K = 5;
                    objMo5082z1 = abstractC1454i14.mo5079w0(i11, lessonRepositoryImpl$updateLessonStats$1);
                    if (objMo5082z1 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    d30 = d13;
                    double d314 = d12;
                    i14 = i11;
                    str6 = str2;
                    lessonRepositoryImpl3 = lessonRepositoryImpl;
                    d31 = d314;
                    libraryData = (LibraryData) objMo5082z1;
                    AbstractC1454i2 abstractC1454i15 = lessonRepositoryImpl3.f19831e;
                    String value8 = LibraryItemType.Content.getValue();
                    lessonRepositoryImpl$updateLessonStats$1.f20038d = lessonRepositoryImpl3;
                    lessonRepositoryImpl$updateLessonStats$1.f20039e = str6;
                    lessonRepositoryImpl$updateLessonStats$1.f20040f = libraryData;
                    lessonRepositoryImpl$updateLessonStats$1.f20042h = i14;
                    lessonRepositoryImpl$updateLessonStats$1.f20043i = d30;
                    lessonRepositoryImpl$updateLessonStats$1.f20044j = d31;
                    lessonRepositoryImpl$updateLessonStats$1.f20034H = z12;
                    lessonRepositoryImpl$updateLessonStats$1.f20037K = 6;
                    objMo5082z0 = abstractC1454i15.mo5082z0(i14, value8, lessonRepositoryImpl$updateLessonStats$1);
                    if (objMo5082z0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    objMo5082z1 = objMo5082z0;
                    libraryData2 = libraryData;
                    libraryCounter2 = (LibraryCounter) objMo5082z1;
                    if (libraryData2 != null) {
                        double d46 = libraryData2.f17234M;
                        if (libraryCounter2 != null) {
                            dDoubleValue = 0.0d;
                        } else {
                            dDoubleValue = 0.0d;
                        }
                        dMax = Math.max(d46, dDoubleValue);
                        double d47 = libraryData2.f17233L;
                        i15 = i14;
                        if (libraryCounter2 != null) {
                            dDoubleValue2 = 0.0d;
                        } else {
                            dDoubleValue2 = 0.0d;
                        }
                        dMax2 = Math.max(d47, dDoubleValue2);
                        dM16708X4 = ((double) C8573r0.m16708X0((dMax + d31) * 100.0d)) / 100.0d;
                        d32 = d31;
                        dM16708X5 = ((double) C8573r0.m16708X0((dMax2 + d30) * 100.0d)) / 100.0d;
                        if (dM16708X4 < 0.0d) {
                            dM16708X6 = ((double) C8573r0.m16708X0((-dMax) * 100.0d)) / 100.0d;
                            if (Double.isNaN(dM16708X6)) {
                                dM16708X6 = 0.0d;
                            } else {
                                dM16708X6 = 0.0d;
                            }
                            dM16708X4 = 0.0d;
                        } else {
                            dM16708X6 = d32;
                        }
                        if (dM16708X5 < 0.0d) {
                            dM16708X7 = ((double) C8573r0.m16708X0((-dMax2) * 100.0d)) / 100.0d;
                            if (Double.isNaN(dM16708X7)) {
                                dM16708X5 = 0.0d;
                                d30 = 0.0d;
                            } else {
                                dM16708X5 = 0.0d;
                                d30 = 0.0d;
                            }
                        }
                        if (Double.isNaN(dM16708X4)) {
                            dM16708X4 = 0.0d;
                        } else {
                            dM16708X4 = 0.0d;
                        }
                        libraryData2.f17234M = dM16708X4;
                        if (Double.isNaN(dM16708X5)) {
                            dM16708X5 = 0.0d;
                        } else {
                            dM16708X5 = 0.0d;
                        }
                        libraryData2.f17233L = dM16708X5;
                        abstractC1454i3 = lessonRepositoryImpl3.f19831e;
                        lessonRepositoryImpl$updateLessonStats$1.f20038d = lessonRepositoryImpl3;
                        lessonRepositoryImpl$updateLessonStats$1.f20039e = str6;
                        lessonRepositoryImpl$updateLessonStats$1.f20040f = libraryData2;
                        lessonRepositoryImpl$updateLessonStats$1.f20041g = libraryCounter2;
                        lessonRepositoryImpl$updateLessonStats$1.f20042h = i15;
                        lessonRepositoryImpl$updateLessonStats$1.f20034H = z12;
                        lessonRepositoryImpl$updateLessonStats$1.f20043i = dM16708X6;
                        lessonRepositoryImpl$updateLessonStats$1.f20044j = d30;
                        lessonRepositoryImpl$updateLessonStats$1.f20037K = 7;
                        coroutineSingletons3 = coroutineSingletons;
                        if (abstractC1454i3.mo598h0(libraryData2, lessonRepositoryImpl$updateLessonStats$1) == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                        libraryData3 = libraryData2;
                        libraryCounter3 = libraryCounter2;
                        i16 = i15;
                        z13 = z12;
                        double d48 = d30;
                        str7 = str6;
                        d33 = dM16708X6;
                        d34 = d48;
                        if (libraryCounter3 != null) {
                            libraryCounter3.f17205f = new Double(libraryData3.f17234M);
                        }
                        if (libraryCounter3 != null) {
                            libraryCounter3.f17204e = new Double(libraryData3.f17233L);
                        }
                        if (libraryCounter3 != null) {
                            abstractC1454i4 = lessonRepositoryImpl3.f19831e;
                            lessonRepositoryImpl$updateLessonStats$1.f20038d = lessonRepositoryImpl3;
                            lessonRepositoryImpl$updateLessonStats$1.f20039e = str7;
                            lessonRepositoryImpl$updateLessonStats$1.f20040f = null;
                            lessonRepositoryImpl$updateLessonStats$1.f20041g = null;
                            lessonRepositoryImpl$updateLessonStats$1.f20042h = i16;
                            lessonRepositoryImpl$updateLessonStats$1.f20034H = z13;
                            lessonRepositoryImpl$updateLessonStats$1.f20043i = d33;
                            lessonRepositoryImpl$updateLessonStats$1.f20044j = d34;
                            lessonRepositoryImpl$updateLessonStats$1.f20037K = 8;
                            if (abstractC1454i4.mo5066Q0(libraryCounter3, lessonRepositoryImpl$updateLessonStats$1) == coroutineSingletons3) {
                                return coroutineSingletons3;
                            }
                            i17 = i16;
                            lessonRepositoryImpl4 = lessonRepositoryImpl3;
                            str8 = str7;
                            str7 = str8;
                            lessonRepositoryImpl3 = lessonRepositoryImpl4;
                        } else {
                            i17 = i16;
                        }
                        lessonRepositoryImpl3.m9512d0(str7, i17, d34, d33, z13);
                    }
                }
                return C9072e.f47360a;
            case 3:
                d23 = lessonRepositoryImpl$updateLessonStats$1.f20046l;
                double d49 = lessonRepositoryImpl$updateLessonStats$1.f20045k;
                boolean z17 = lessonRepositoryImpl$updateLessonStats$1.f20034H;
                double d50 = lessonRepositoryImpl$updateLessonStats$1.f20044j;
                double d51 = lessonRepositoryImpl$updateLessonStats$1.f20043i;
                int i19 = lessonRepositoryImpl$updateLessonStats$1.f20042h;
                Lesson lesson3 = (Lesson) lessonRepositoryImpl$updateLessonStats$1.f20040f;
                String str10 = lessonRepositoryImpl$updateLessonStats$1.f20039e;
                lessonRepositoryImpl2 = lessonRepositoryImpl$updateLessonStats$1.f20038d;
                C7499b.m14977z0(objMo5082z1);
                coroutineSingletons2 = coroutineSingletons4;
                i13 = i19;
                z12 = z17;
                lesson2 = lesson3;
                d24 = d51;
                str5 = str10;
                d25 = d50;
                d26 = d49;
                libraryCounter = (LibraryCounter) objMo5082z1;
                if (libraryCounter == null) {
                    libraryCounter.f17205f = new Double(lesson2.f17070D);
                }
                if (libraryCounter != null) {
                    libraryCounter.f17204e = new Double(lesson2.f17071E);
                }
                if (libraryCounter != null) {
                    abstractC1454i2 = lessonRepositoryImpl2.f19831e;
                    lessonRepositoryImpl$updateLessonStats$1.f20038d = lessonRepositoryImpl2;
                    lessonRepositoryImpl$updateLessonStats$1.f20039e = str5;
                    lessonRepositoryImpl$updateLessonStats$1.f20040f = lesson2;
                    lessonRepositoryImpl$updateLessonStats$1.f20042h = i13;
                    lessonRepositoryImpl$updateLessonStats$1.f20043i = d24;
                    lessonRepositoryImpl$updateLessonStats$1.f20044j = d25;
                    lessonRepositoryImpl$updateLessonStats$1.f20034H = z12;
                    lessonRepositoryImpl$updateLessonStats$1.f20045k = d26;
                    lessonRepositoryImpl$updateLessonStats$1.f20046l = d27;
                    lessonRepositoryImpl$updateLessonStats$1.f20037K = 4;
                    coroutineSingletons = coroutineSingletons2;
                    if (abstractC1454i2.mo5066Q0(libraryCounter, lessonRepositoryImpl$updateLessonStats$1) == coroutineSingletons) {
                        d27 = d23;
                        return coroutineSingletons;
                    }
                } else {
                    d27 = d23;
                    coroutineSingletons = coroutineSingletons2;
                }
                d27 = d23;
                d28 = d27;
                d29 = d26;
                lessonRepositoryImpl2.m9512d0(str5, i13, d28, d29, z12);
                i11 = i13;
                str2 = str5;
                d12 = d25;
                lessonRepositoryImpl = lessonRepositoryImpl2;
                lesson = lesson2;
                d13 = d24;
                if (lesson == null) {
                    AbstractC1454i2 abstractC1454i16 = lessonRepositoryImpl.f19831e;
                    lessonRepositoryImpl$updateLessonStats$1.f20038d = lessonRepositoryImpl;
                    lessonRepositoryImpl$updateLessonStats$1.f20039e = str2;
                    lessonRepositoryImpl$updateLessonStats$1.f20040f = null;
                    lessonRepositoryImpl$updateLessonStats$1.f20042h = i11;
                    lessonRepositoryImpl$updateLessonStats$1.f20043i = d13;
                    lessonRepositoryImpl$updateLessonStats$1.f20044j = d12;
                    lessonRepositoryImpl$updateLessonStats$1.f20034H = z12;
                    lessonRepositoryImpl$updateLessonStats$1.f20037K = 5;
                    objMo5082z1 = abstractC1454i16.mo5079w0(i11, lessonRepositoryImpl$updateLessonStats$1);
                    if (objMo5082z1 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    d30 = d13;
                    double d315 = d12;
                    i14 = i11;
                    str6 = str2;
                    lessonRepositoryImpl3 = lessonRepositoryImpl;
                    d31 = d315;
                    libraryData = (LibraryData) objMo5082z1;
                    AbstractC1454i2 abstractC1454i17 = lessonRepositoryImpl3.f19831e;
                    String value9 = LibraryItemType.Content.getValue();
                    lessonRepositoryImpl$updateLessonStats$1.f20038d = lessonRepositoryImpl3;
                    lessonRepositoryImpl$updateLessonStats$1.f20039e = str6;
                    lessonRepositoryImpl$updateLessonStats$1.f20040f = libraryData;
                    lessonRepositoryImpl$updateLessonStats$1.f20042h = i14;
                    lessonRepositoryImpl$updateLessonStats$1.f20043i = d30;
                    lessonRepositoryImpl$updateLessonStats$1.f20044j = d31;
                    lessonRepositoryImpl$updateLessonStats$1.f20034H = z12;
                    lessonRepositoryImpl$updateLessonStats$1.f20037K = 6;
                    objMo5082z0 = abstractC1454i17.mo5082z0(i14, value9, lessonRepositoryImpl$updateLessonStats$1);
                    if (objMo5082z0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    objMo5082z1 = objMo5082z0;
                    libraryData2 = libraryData;
                    libraryCounter2 = (LibraryCounter) objMo5082z1;
                    if (libraryData2 != null) {
                        double d410 = libraryData2.f17234M;
                        if (libraryCounter2 != null) {
                            dDoubleValue = 0.0d;
                        } else {
                            dDoubleValue = 0.0d;
                        }
                        dMax = Math.max(d410, dDoubleValue);
                        double d411 = libraryData2.f17233L;
                        i15 = i14;
                        if (libraryCounter2 != null) {
                            dDoubleValue2 = 0.0d;
                        } else {
                            dDoubleValue2 = 0.0d;
                        }
                        dMax2 = Math.max(d411, dDoubleValue2);
                        dM16708X4 = ((double) C8573r0.m16708X0((dMax + d31) * 100.0d)) / 100.0d;
                        d32 = d31;
                        dM16708X5 = ((double) C8573r0.m16708X0((dMax2 + d30) * 100.0d)) / 100.0d;
                        if (dM16708X4 < 0.0d) {
                            dM16708X6 = ((double) C8573r0.m16708X0((-dMax) * 100.0d)) / 100.0d;
                            if (Double.isNaN(dM16708X6)) {
                                dM16708X6 = 0.0d;
                            } else {
                                dM16708X6 = 0.0d;
                            }
                            dM16708X4 = 0.0d;
                        } else {
                            dM16708X6 = d32;
                        }
                        if (dM16708X5 < 0.0d) {
                            dM16708X7 = ((double) C8573r0.m16708X0((-dMax2) * 100.0d)) / 100.0d;
                            if (Double.isNaN(dM16708X7)) {
                                dM16708X5 = 0.0d;
                                d30 = 0.0d;
                            } else {
                                dM16708X5 = 0.0d;
                                d30 = 0.0d;
                            }
                        }
                        if (Double.isNaN(dM16708X4)) {
                            dM16708X4 = 0.0d;
                        } else {
                            dM16708X4 = 0.0d;
                        }
                        libraryData2.f17234M = dM16708X4;
                        if (Double.isNaN(dM16708X5)) {
                            dM16708X5 = 0.0d;
                        } else {
                            dM16708X5 = 0.0d;
                        }
                        libraryData2.f17233L = dM16708X5;
                        abstractC1454i3 = lessonRepositoryImpl3.f19831e;
                        lessonRepositoryImpl$updateLessonStats$1.f20038d = lessonRepositoryImpl3;
                        lessonRepositoryImpl$updateLessonStats$1.f20039e = str6;
                        lessonRepositoryImpl$updateLessonStats$1.f20040f = libraryData2;
                        lessonRepositoryImpl$updateLessonStats$1.f20041g = libraryCounter2;
                        lessonRepositoryImpl$updateLessonStats$1.f20042h = i15;
                        lessonRepositoryImpl$updateLessonStats$1.f20034H = z12;
                        lessonRepositoryImpl$updateLessonStats$1.f20043i = dM16708X6;
                        lessonRepositoryImpl$updateLessonStats$1.f20044j = d30;
                        lessonRepositoryImpl$updateLessonStats$1.f20037K = 7;
                        coroutineSingletons3 = coroutineSingletons;
                        if (abstractC1454i3.mo598h0(libraryData2, lessonRepositoryImpl$updateLessonStats$1) == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                        libraryData3 = libraryData2;
                        libraryCounter3 = libraryCounter2;
                        i16 = i15;
                        z13 = z12;
                        double d412 = d30;
                        str7 = str6;
                        d33 = dM16708X6;
                        d34 = d412;
                        if (libraryCounter3 != null) {
                            libraryCounter3.f17205f = new Double(libraryData3.f17234M);
                        }
                        if (libraryCounter3 != null) {
                            libraryCounter3.f17204e = new Double(libraryData3.f17233L);
                        }
                        if (libraryCounter3 != null) {
                            abstractC1454i4 = lessonRepositoryImpl3.f19831e;
                            lessonRepositoryImpl$updateLessonStats$1.f20038d = lessonRepositoryImpl3;
                            lessonRepositoryImpl$updateLessonStats$1.f20039e = str7;
                            lessonRepositoryImpl$updateLessonStats$1.f20040f = null;
                            lessonRepositoryImpl$updateLessonStats$1.f20041g = null;
                            lessonRepositoryImpl$updateLessonStats$1.f20042h = i16;
                            lessonRepositoryImpl$updateLessonStats$1.f20034H = z13;
                            lessonRepositoryImpl$updateLessonStats$1.f20043i = d33;
                            lessonRepositoryImpl$updateLessonStats$1.f20044j = d34;
                            lessonRepositoryImpl$updateLessonStats$1.f20037K = 8;
                            if (abstractC1454i4.mo5066Q0(libraryCounter3, lessonRepositoryImpl$updateLessonStats$1) == coroutineSingletons3) {
                                return coroutineSingletons3;
                            }
                            i17 = i16;
                            lessonRepositoryImpl4 = lessonRepositoryImpl3;
                            str8 = str7;
                            str7 = str8;
                            lessonRepositoryImpl3 = lessonRepositoryImpl4;
                        } else {
                            i17 = i16;
                        }
                        lessonRepositoryImpl3.m9512d0(str7, i17, d34, d33, z13);
                    }
                }
                return C9072e.f47360a;
            case 4:
                double d52 = lessonRepositoryImpl$updateLessonStats$1.f20046l;
                double d53 = lessonRepositoryImpl$updateLessonStats$1.f20045k;
                boolean z18 = lessonRepositoryImpl$updateLessonStats$1.f20034H;
                d25 = lessonRepositoryImpl$updateLessonStats$1.f20044j;
                d24 = lessonRepositoryImpl$updateLessonStats$1.f20043i;
                int i20 = lessonRepositoryImpl$updateLessonStats$1.f20042h;
                lesson2 = (Lesson) lessonRepositoryImpl$updateLessonStats$1.f20040f;
                str5 = lessonRepositoryImpl$updateLessonStats$1.f20039e;
                LessonRepositoryImpl lessonRepositoryImpl5 = lessonRepositoryImpl$updateLessonStats$1.f20038d;
                C7499b.m14977z0(objMo5082z1);
                lessonRepositoryImpl2 = lessonRepositoryImpl5;
                coroutineSingletons = coroutineSingletons4;
                d28 = d52;
                d29 = d53;
                i13 = i20;
                z12 = z18;
                lessonRepositoryImpl2.m9512d0(str5, i13, d28, d29, z12);
                i11 = i13;
                str2 = str5;
                d12 = d25;
                lessonRepositoryImpl = lessonRepositoryImpl2;
                lesson = lesson2;
                d13 = d24;
                if (lesson == null) {
                    AbstractC1454i2 abstractC1454i18 = lessonRepositoryImpl.f19831e;
                    lessonRepositoryImpl$updateLessonStats$1.f20038d = lessonRepositoryImpl;
                    lessonRepositoryImpl$updateLessonStats$1.f20039e = str2;
                    lessonRepositoryImpl$updateLessonStats$1.f20040f = null;
                    lessonRepositoryImpl$updateLessonStats$1.f20042h = i11;
                    lessonRepositoryImpl$updateLessonStats$1.f20043i = d13;
                    lessonRepositoryImpl$updateLessonStats$1.f20044j = d12;
                    lessonRepositoryImpl$updateLessonStats$1.f20034H = z12;
                    lessonRepositoryImpl$updateLessonStats$1.f20037K = 5;
                    objMo5082z1 = abstractC1454i18.mo5079w0(i11, lessonRepositoryImpl$updateLessonStats$1);
                    if (objMo5082z1 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    d30 = d13;
                    double d316 = d12;
                    i14 = i11;
                    str6 = str2;
                    lessonRepositoryImpl3 = lessonRepositoryImpl;
                    d31 = d316;
                    libraryData = (LibraryData) objMo5082z1;
                    AbstractC1454i2 abstractC1454i19 = lessonRepositoryImpl3.f19831e;
                    String value10 = LibraryItemType.Content.getValue();
                    lessonRepositoryImpl$updateLessonStats$1.f20038d = lessonRepositoryImpl3;
                    lessonRepositoryImpl$updateLessonStats$1.f20039e = str6;
                    lessonRepositoryImpl$updateLessonStats$1.f20040f = libraryData;
                    lessonRepositoryImpl$updateLessonStats$1.f20042h = i14;
                    lessonRepositoryImpl$updateLessonStats$1.f20043i = d30;
                    lessonRepositoryImpl$updateLessonStats$1.f20044j = d31;
                    lessonRepositoryImpl$updateLessonStats$1.f20034H = z12;
                    lessonRepositoryImpl$updateLessonStats$1.f20037K = 6;
                    objMo5082z0 = abstractC1454i19.mo5082z0(i14, value10, lessonRepositoryImpl$updateLessonStats$1);
                    if (objMo5082z0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    objMo5082z1 = objMo5082z0;
                    libraryData2 = libraryData;
                    libraryCounter2 = (LibraryCounter) objMo5082z1;
                    if (libraryData2 != null) {
                        double d413 = libraryData2.f17234M;
                        if (libraryCounter2 != null) {
                            dDoubleValue = 0.0d;
                        } else {
                            dDoubleValue = 0.0d;
                        }
                        dMax = Math.max(d413, dDoubleValue);
                        double d414 = libraryData2.f17233L;
                        i15 = i14;
                        if (libraryCounter2 != null) {
                            dDoubleValue2 = 0.0d;
                        } else {
                            dDoubleValue2 = 0.0d;
                        }
                        dMax2 = Math.max(d414, dDoubleValue2);
                        dM16708X4 = ((double) C8573r0.m16708X0((dMax + d31) * 100.0d)) / 100.0d;
                        d32 = d31;
                        dM16708X5 = ((double) C8573r0.m16708X0((dMax2 + d30) * 100.0d)) / 100.0d;
                        if (dM16708X4 < 0.0d) {
                            dM16708X6 = ((double) C8573r0.m16708X0((-dMax) * 100.0d)) / 100.0d;
                            if (Double.isNaN(dM16708X6)) {
                                dM16708X6 = 0.0d;
                            } else {
                                dM16708X6 = 0.0d;
                            }
                            dM16708X4 = 0.0d;
                        } else {
                            dM16708X6 = d32;
                        }
                        if (dM16708X5 < 0.0d) {
                            dM16708X7 = ((double) C8573r0.m16708X0((-dMax2) * 100.0d)) / 100.0d;
                            if (Double.isNaN(dM16708X7)) {
                                dM16708X5 = 0.0d;
                                d30 = 0.0d;
                            } else {
                                dM16708X5 = 0.0d;
                                d30 = 0.0d;
                            }
                        }
                        if (Double.isNaN(dM16708X4)) {
                            dM16708X4 = 0.0d;
                        } else {
                            dM16708X4 = 0.0d;
                        }
                        libraryData2.f17234M = dM16708X4;
                        if (Double.isNaN(dM16708X5)) {
                            dM16708X5 = 0.0d;
                        } else {
                            dM16708X5 = 0.0d;
                        }
                        libraryData2.f17233L = dM16708X5;
                        abstractC1454i3 = lessonRepositoryImpl3.f19831e;
                        lessonRepositoryImpl$updateLessonStats$1.f20038d = lessonRepositoryImpl3;
                        lessonRepositoryImpl$updateLessonStats$1.f20039e = str6;
                        lessonRepositoryImpl$updateLessonStats$1.f20040f = libraryData2;
                        lessonRepositoryImpl$updateLessonStats$1.f20041g = libraryCounter2;
                        lessonRepositoryImpl$updateLessonStats$1.f20042h = i15;
                        lessonRepositoryImpl$updateLessonStats$1.f20034H = z12;
                        lessonRepositoryImpl$updateLessonStats$1.f20043i = dM16708X6;
                        lessonRepositoryImpl$updateLessonStats$1.f20044j = d30;
                        lessonRepositoryImpl$updateLessonStats$1.f20037K = 7;
                        coroutineSingletons3 = coroutineSingletons;
                        if (abstractC1454i3.mo598h0(libraryData2, lessonRepositoryImpl$updateLessonStats$1) == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                        libraryData3 = libraryData2;
                        libraryCounter3 = libraryCounter2;
                        i16 = i15;
                        z13 = z12;
                        double d415 = d30;
                        str7 = str6;
                        d33 = dM16708X6;
                        d34 = d415;
                        if (libraryCounter3 != null) {
                            libraryCounter3.f17205f = new Double(libraryData3.f17234M);
                        }
                        if (libraryCounter3 != null) {
                            libraryCounter3.f17204e = new Double(libraryData3.f17233L);
                        }
                        if (libraryCounter3 != null) {
                            abstractC1454i4 = lessonRepositoryImpl3.f19831e;
                            lessonRepositoryImpl$updateLessonStats$1.f20038d = lessonRepositoryImpl3;
                            lessonRepositoryImpl$updateLessonStats$1.f20039e = str7;
                            lessonRepositoryImpl$updateLessonStats$1.f20040f = null;
                            lessonRepositoryImpl$updateLessonStats$1.f20041g = null;
                            lessonRepositoryImpl$updateLessonStats$1.f20042h = i16;
                            lessonRepositoryImpl$updateLessonStats$1.f20034H = z13;
                            lessonRepositoryImpl$updateLessonStats$1.f20043i = d33;
                            lessonRepositoryImpl$updateLessonStats$1.f20044j = d34;
                            lessonRepositoryImpl$updateLessonStats$1.f20037K = 8;
                            if (abstractC1454i4.mo5066Q0(libraryCounter3, lessonRepositoryImpl$updateLessonStats$1) == coroutineSingletons3) {
                                return coroutineSingletons3;
                            }
                            i17 = i16;
                            lessonRepositoryImpl4 = lessonRepositoryImpl3;
                            str8 = str7;
                            str7 = str8;
                            lessonRepositoryImpl3 = lessonRepositoryImpl4;
                        } else {
                            i17 = i16;
                        }
                        lessonRepositoryImpl3.m9512d0(str7, i17, d34, d33, z13);
                    }
                }
                return C9072e.f47360a;
            case 5:
                boolean z19 = lessonRepositoryImpl$updateLessonStats$1.f20034H;
                double d54 = lessonRepositoryImpl$updateLessonStats$1.f20044j;
                double d55 = lessonRepositoryImpl$updateLessonStats$1.f20043i;
                int i21 = lessonRepositoryImpl$updateLessonStats$1.f20042h;
                String str11 = lessonRepositoryImpl$updateLessonStats$1.f20039e;
                LessonRepositoryImpl lessonRepositoryImpl6 = lessonRepositoryImpl$updateLessonStats$1.f20038d;
                C7499b.m14977z0(objMo5082z1);
                z12 = z19;
                coroutineSingletons = coroutineSingletons4;
                i14 = i21;
                str6 = str11;
                d31 = d54;
                lessonRepositoryImpl3 = lessonRepositoryImpl6;
                d30 = d55;
                libraryData = (LibraryData) objMo5082z1;
                AbstractC1454i2 abstractC1454i110 = lessonRepositoryImpl3.f19831e;
                String value11 = LibraryItemType.Content.getValue();
                lessonRepositoryImpl$updateLessonStats$1.f20038d = lessonRepositoryImpl3;
                lessonRepositoryImpl$updateLessonStats$1.f20039e = str6;
                lessonRepositoryImpl$updateLessonStats$1.f20040f = libraryData;
                lessonRepositoryImpl$updateLessonStats$1.f20042h = i14;
                lessonRepositoryImpl$updateLessonStats$1.f20043i = d30;
                lessonRepositoryImpl$updateLessonStats$1.f20044j = d31;
                lessonRepositoryImpl$updateLessonStats$1.f20034H = z12;
                lessonRepositoryImpl$updateLessonStats$1.f20037K = 6;
                objMo5082z0 = abstractC1454i110.mo5082z0(i14, value11, lessonRepositoryImpl$updateLessonStats$1);
                if (objMo5082z0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                objMo5082z1 = objMo5082z0;
                libraryData2 = libraryData;
                libraryCounter2 = (LibraryCounter) objMo5082z1;
                if (libraryData2 != null) {
                    double d416 = libraryData2.f17234M;
                    if (libraryCounter2 != null) {
                        dDoubleValue = 0.0d;
                    } else {
                        dDoubleValue = 0.0d;
                    }
                    dMax = Math.max(d416, dDoubleValue);
                    double d417 = libraryData2.f17233L;
                    i15 = i14;
                    if (libraryCounter2 != null) {
                        dDoubleValue2 = 0.0d;
                    } else {
                        dDoubleValue2 = 0.0d;
                    }
                    dMax2 = Math.max(d417, dDoubleValue2);
                    dM16708X4 = ((double) C8573r0.m16708X0((dMax + d31) * 100.0d)) / 100.0d;
                    d32 = d31;
                    dM16708X5 = ((double) C8573r0.m16708X0((dMax2 + d30) * 100.0d)) / 100.0d;
                    if (dM16708X4 < 0.0d) {
                        dM16708X6 = ((double) C8573r0.m16708X0((-dMax) * 100.0d)) / 100.0d;
                        if (Double.isNaN(dM16708X6)) {
                            dM16708X6 = 0.0d;
                        } else {
                            dM16708X6 = 0.0d;
                        }
                        dM16708X4 = 0.0d;
                    } else {
                        dM16708X6 = d32;
                    }
                    if (dM16708X5 < 0.0d) {
                        dM16708X7 = ((double) C8573r0.m16708X0((-dMax2) * 100.0d)) / 100.0d;
                        if (Double.isNaN(dM16708X7)) {
                            dM16708X5 = 0.0d;
                            d30 = 0.0d;
                        } else {
                            dM16708X5 = 0.0d;
                            d30 = 0.0d;
                        }
                    }
                    if (Double.isNaN(dM16708X4)) {
                        dM16708X4 = 0.0d;
                    } else {
                        dM16708X4 = 0.0d;
                    }
                    libraryData2.f17234M = dM16708X4;
                    if (Double.isNaN(dM16708X5)) {
                        dM16708X5 = 0.0d;
                    } else {
                        dM16708X5 = 0.0d;
                    }
                    libraryData2.f17233L = dM16708X5;
                    abstractC1454i3 = lessonRepositoryImpl3.f19831e;
                    lessonRepositoryImpl$updateLessonStats$1.f20038d = lessonRepositoryImpl3;
                    lessonRepositoryImpl$updateLessonStats$1.f20039e = str6;
                    lessonRepositoryImpl$updateLessonStats$1.f20040f = libraryData2;
                    lessonRepositoryImpl$updateLessonStats$1.f20041g = libraryCounter2;
                    lessonRepositoryImpl$updateLessonStats$1.f20042h = i15;
                    lessonRepositoryImpl$updateLessonStats$1.f20034H = z12;
                    lessonRepositoryImpl$updateLessonStats$1.f20043i = dM16708X6;
                    lessonRepositoryImpl$updateLessonStats$1.f20044j = d30;
                    lessonRepositoryImpl$updateLessonStats$1.f20037K = 7;
                    coroutineSingletons3 = coroutineSingletons;
                    if (abstractC1454i3.mo598h0(libraryData2, lessonRepositoryImpl$updateLessonStats$1) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                    libraryData3 = libraryData2;
                    libraryCounter3 = libraryCounter2;
                    i16 = i15;
                    z13 = z12;
                    double d418 = d30;
                    str7 = str6;
                    d33 = dM16708X6;
                    d34 = d418;
                    if (libraryCounter3 != null) {
                        libraryCounter3.f17205f = new Double(libraryData3.f17234M);
                    }
                    if (libraryCounter3 != null) {
                        libraryCounter3.f17204e = new Double(libraryData3.f17233L);
                    }
                    if (libraryCounter3 != null) {
                        abstractC1454i4 = lessonRepositoryImpl3.f19831e;
                        lessonRepositoryImpl$updateLessonStats$1.f20038d = lessonRepositoryImpl3;
                        lessonRepositoryImpl$updateLessonStats$1.f20039e = str7;
                        lessonRepositoryImpl$updateLessonStats$1.f20040f = null;
                        lessonRepositoryImpl$updateLessonStats$1.f20041g = null;
                        lessonRepositoryImpl$updateLessonStats$1.f20042h = i16;
                        lessonRepositoryImpl$updateLessonStats$1.f20034H = z13;
                        lessonRepositoryImpl$updateLessonStats$1.f20043i = d33;
                        lessonRepositoryImpl$updateLessonStats$1.f20044j = d34;
                        lessonRepositoryImpl$updateLessonStats$1.f20037K = 8;
                        if (abstractC1454i4.mo5066Q0(libraryCounter3, lessonRepositoryImpl$updateLessonStats$1) == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                        i17 = i16;
                        lessonRepositoryImpl4 = lessonRepositoryImpl3;
                        str8 = str7;
                        str7 = str8;
                        lessonRepositoryImpl3 = lessonRepositoryImpl4;
                    } else {
                        i17 = i16;
                    }
                    lessonRepositoryImpl3.m9512d0(str7, i17, d34, d33, z13);
                }
                return C9072e.f47360a;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                boolean z20 = lessonRepositoryImpl$updateLessonStats$1.f20034H;
                d31 = lessonRepositoryImpl$updateLessonStats$1.f20044j;
                d30 = lessonRepositoryImpl$updateLessonStats$1.f20043i;
                i14 = lessonRepositoryImpl$updateLessonStats$1.f20042h;
                LibraryData libraryData4 = (LibraryData) lessonRepositoryImpl$updateLessonStats$1.f20040f;
                str6 = lessonRepositoryImpl$updateLessonStats$1.f20039e;
                lessonRepositoryImpl3 = lessonRepositoryImpl$updateLessonStats$1.f20038d;
                C7499b.m14977z0(objMo5082z1);
                libraryData2 = libraryData4;
                z12 = z20;
                coroutineSingletons = coroutineSingletons4;
                libraryCounter2 = (LibraryCounter) objMo5082z1;
                if (libraryData2 != null) {
                    double d419 = libraryData2.f17234M;
                    if (libraryCounter2 != null) {
                        dDoubleValue = 0.0d;
                    } else {
                        dDoubleValue = 0.0d;
                    }
                    dMax = Math.max(d419, dDoubleValue);
                    double d4110 = libraryData2.f17233L;
                    i15 = i14;
                    if (libraryCounter2 != null) {
                        dDoubleValue2 = 0.0d;
                    } else {
                        dDoubleValue2 = 0.0d;
                    }
                    dMax2 = Math.max(d4110, dDoubleValue2);
                    dM16708X4 = ((double) C8573r0.m16708X0((dMax + d31) * 100.0d)) / 100.0d;
                    d32 = d31;
                    dM16708X5 = ((double) C8573r0.m16708X0((dMax2 + d30) * 100.0d)) / 100.0d;
                    if (dM16708X4 < 0.0d) {
                        dM16708X6 = ((double) C8573r0.m16708X0((-dMax) * 100.0d)) / 100.0d;
                        if (Double.isNaN(dM16708X6)) {
                            dM16708X6 = 0.0d;
                        } else {
                            dM16708X6 = 0.0d;
                        }
                        dM16708X4 = 0.0d;
                    } else {
                        dM16708X6 = d32;
                    }
                    if (dM16708X5 < 0.0d) {
                        dM16708X7 = ((double) C8573r0.m16708X0((-dMax2) * 100.0d)) / 100.0d;
                        if (Double.isNaN(dM16708X7)) {
                            dM16708X5 = 0.0d;
                            d30 = 0.0d;
                        } else {
                            dM16708X5 = 0.0d;
                            d30 = 0.0d;
                        }
                    }
                    if (Double.isNaN(dM16708X4)) {
                        dM16708X4 = 0.0d;
                    } else {
                        dM16708X4 = 0.0d;
                    }
                    libraryData2.f17234M = dM16708X4;
                    if (Double.isNaN(dM16708X5)) {
                        dM16708X5 = 0.0d;
                    } else {
                        dM16708X5 = 0.0d;
                    }
                    libraryData2.f17233L = dM16708X5;
                    abstractC1454i3 = lessonRepositoryImpl3.f19831e;
                    lessonRepositoryImpl$updateLessonStats$1.f20038d = lessonRepositoryImpl3;
                    lessonRepositoryImpl$updateLessonStats$1.f20039e = str6;
                    lessonRepositoryImpl$updateLessonStats$1.f20040f = libraryData2;
                    lessonRepositoryImpl$updateLessonStats$1.f20041g = libraryCounter2;
                    lessonRepositoryImpl$updateLessonStats$1.f20042h = i15;
                    lessonRepositoryImpl$updateLessonStats$1.f20034H = z12;
                    lessonRepositoryImpl$updateLessonStats$1.f20043i = dM16708X6;
                    lessonRepositoryImpl$updateLessonStats$1.f20044j = d30;
                    lessonRepositoryImpl$updateLessonStats$1.f20037K = 7;
                    coroutineSingletons3 = coroutineSingletons;
                    if (abstractC1454i3.mo598h0(libraryData2, lessonRepositoryImpl$updateLessonStats$1) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                    libraryData3 = libraryData2;
                    libraryCounter3 = libraryCounter2;
                    i16 = i15;
                    z13 = z12;
                    double d4111 = d30;
                    str7 = str6;
                    d33 = dM16708X6;
                    d34 = d4111;
                    if (libraryCounter3 != null) {
                        libraryCounter3.f17205f = new Double(libraryData3.f17234M);
                    }
                    if (libraryCounter3 != null) {
                        libraryCounter3.f17204e = new Double(libraryData3.f17233L);
                    }
                    if (libraryCounter3 != null) {
                        abstractC1454i4 = lessonRepositoryImpl3.f19831e;
                        lessonRepositoryImpl$updateLessonStats$1.f20038d = lessonRepositoryImpl3;
                        lessonRepositoryImpl$updateLessonStats$1.f20039e = str7;
                        lessonRepositoryImpl$updateLessonStats$1.f20040f = null;
                        lessonRepositoryImpl$updateLessonStats$1.f20041g = null;
                        lessonRepositoryImpl$updateLessonStats$1.f20042h = i16;
                        lessonRepositoryImpl$updateLessonStats$1.f20034H = z13;
                        lessonRepositoryImpl$updateLessonStats$1.f20043i = d33;
                        lessonRepositoryImpl$updateLessonStats$1.f20044j = d34;
                        lessonRepositoryImpl$updateLessonStats$1.f20037K = 8;
                        if (abstractC1454i4.mo5066Q0(libraryCounter3, lessonRepositoryImpl$updateLessonStats$1) == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                        i17 = i16;
                        lessonRepositoryImpl4 = lessonRepositoryImpl3;
                        str8 = str7;
                        str7 = str8;
                        lessonRepositoryImpl3 = lessonRepositoryImpl4;
                    } else {
                        i17 = i16;
                    }
                    lessonRepositoryImpl3.m9512d0(str7, i17, d34, d33, z13);
                }
                return C9072e.f47360a;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                double d56 = lessonRepositoryImpl$updateLessonStats$1.f20044j;
                double d57 = lessonRepositoryImpl$updateLessonStats$1.f20043i;
                z13 = lessonRepositoryImpl$updateLessonStats$1.f20034H;
                int i22 = lessonRepositoryImpl$updateLessonStats$1.f20042h;
                libraryCounter3 = lessonRepositoryImpl$updateLessonStats$1.f20041g;
                libraryData3 = (LibraryData) lessonRepositoryImpl$updateLessonStats$1.f20040f;
                str7 = lessonRepositoryImpl$updateLessonStats$1.f20039e;
                LessonRepositoryImpl lessonRepositoryImpl7 = lessonRepositoryImpl$updateLessonStats$1.f20038d;
                C7499b.m14977z0(objMo5082z1);
                i16 = i22;
                coroutineSingletons3 = coroutineSingletons4;
                d34 = d56;
                d33 = d57;
                lessonRepositoryImpl3 = lessonRepositoryImpl7;
                if (libraryCounter3 != null) {
                    libraryCounter3.f17205f = new Double(libraryData3.f17234M);
                }
                if (libraryCounter3 != null) {
                    libraryCounter3.f17204e = new Double(libraryData3.f17233L);
                }
                if (libraryCounter3 != null) {
                    abstractC1454i4 = lessonRepositoryImpl3.f19831e;
                    lessonRepositoryImpl$updateLessonStats$1.f20038d = lessonRepositoryImpl3;
                    lessonRepositoryImpl$updateLessonStats$1.f20039e = str7;
                    lessonRepositoryImpl$updateLessonStats$1.f20040f = null;
                    lessonRepositoryImpl$updateLessonStats$1.f20041g = null;
                    lessonRepositoryImpl$updateLessonStats$1.f20042h = i16;
                    lessonRepositoryImpl$updateLessonStats$1.f20034H = z13;
                    lessonRepositoryImpl$updateLessonStats$1.f20043i = d33;
                    lessonRepositoryImpl$updateLessonStats$1.f20044j = d34;
                    lessonRepositoryImpl$updateLessonStats$1.f20037K = 8;
                    if (abstractC1454i4.mo5066Q0(libraryCounter3, lessonRepositoryImpl$updateLessonStats$1) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                    i17 = i16;
                    lessonRepositoryImpl4 = lessonRepositoryImpl3;
                    str8 = str7;
                    str7 = str8;
                    lessonRepositoryImpl3 = lessonRepositoryImpl4;
                } else {
                    i17 = i16;
                }
                lessonRepositoryImpl3.m9512d0(str7, i17, d34, d33, z13);
                return C9072e.f47360a;
            case 8:
                d34 = lessonRepositoryImpl$updateLessonStats$1.f20044j;
                d33 = lessonRepositoryImpl$updateLessonStats$1.f20043i;
                z13 = lessonRepositoryImpl$updateLessonStats$1.f20034H;
                i17 = lessonRepositoryImpl$updateLessonStats$1.f20042h;
                str8 = lessonRepositoryImpl$updateLessonStats$1.f20039e;
                lessonRepositoryImpl4 = lessonRepositoryImpl$updateLessonStats$1.f20038d;
                C7499b.m14977z0(objMo5082z1);
                str7 = str8;
                lessonRepositoryImpl3 = lessonRepositoryImpl4;
                lessonRepositoryImpl3.m9512d0(str7, i17, d34, d33, z13);
                return C9072e.f47360a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00dd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:52:0x010f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x0113  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: s */
    public final Object mo9531s(int i10, String str, InterfaceC9968c interfaceC9968c) throws Throwable {
        LessonRepositoryImpl$updateLessonLike$1 lessonRepositoryImpl$updateLessonLike$1;
        LessonRepositoryImpl lessonRepositoryImpl;
        String str2;
        Lesson lesson;
        LibraryCounter libraryCounter;
        AbstractC1495o1 abstractC1495o1;
        LessonRepositoryImpl lessonRepositoryImpl2;
        if (interfaceC9968c instanceof LessonRepositoryImpl$updateLessonLike$1) {
            lessonRepositoryImpl$updateLessonLike$1 = (LessonRepositoryImpl$updateLessonLike$1) interfaceC9968c;
            int i11 = lessonRepositoryImpl$updateLessonLike$1.f19982j;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$updateLessonLike$1.f19982j = i11 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$updateLessonLike$1 = new LessonRepositoryImpl$updateLessonLike$1(this, interfaceC9968c);
            }
        } else {
            lessonRepositoryImpl$updateLessonLike$1 = new LessonRepositoryImpl$updateLessonLike$1(this, interfaceC9968c);
        }
        Object objMo5149o0 = lessonRepositoryImpl$updateLessonLike$1.f19980h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = lessonRepositoryImpl$updateLessonLike$1.f19982j;
        if (i12 == 0) {
            C7499b.m14977z0(objMo5149o0);
            lessonRepositoryImpl$updateLessonLike$1.f19976d = this;
            lessonRepositoryImpl$updateLessonLike$1.f19977e = str;
            lessonRepositoryImpl$updateLessonLike$1.f19979g = i10;
            lessonRepositoryImpl$updateLessonLike$1.f19982j = 1;
            objMo5149o0 = this.f19828b.mo5149o0(i10, lessonRepositoryImpl$updateLessonLike$1);
            if (objMo5149o0 == coroutineSingletons) {
                return coroutineSingletons;
            }
            lessonRepositoryImpl = this;
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        i10 = lessonRepositoryImpl$updateLessonLike$1.f19979g;
                        lessonRepositoryImpl2 = lessonRepositoryImpl$updateLessonLike$1.f19976d;
                        C7499b.m14977z0(objMo5149o0);
                        lessonRepositoryImpl$updateLessonLike$1.f19976d = null;
                        lessonRepositoryImpl$updateLessonLike$1.f19982j = 4;
                        if (lessonRepositoryImpl2.m9520h0(i10, lessonRepositoryImpl$updateLessonLike$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i12 != 4) {
                            if (i12 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            C7499b.m14977z0(objMo5149o0);
                            return C9072e.f47360a;
                        }
                        C7499b.m14977z0(objMo5149o0);
                    }
                    return C9072e.f47360a;
                }
                i10 = lessonRepositoryImpl$updateLessonLike$1.f19979g;
                lesson = lessonRepositoryImpl$updateLessonLike$1.f19978f;
                String str3 = lessonRepositoryImpl$updateLessonLike$1.f19977e;
                LessonRepositoryImpl lessonRepositoryImpl3 = lessonRepositoryImpl$updateLessonLike$1.f19976d;
                C7499b.m14977z0(objMo5149o0);
                str2 = str3;
                lessonRepositoryImpl = lessonRepositoryImpl3;
                libraryCounter = (LibraryCounter) objMo5149o0;
                if (lesson != null) {
                    if (libraryCounter != null) {
                        return C9072e.f47360a;
                    }
                    if (libraryCounter.f17202c) {
                        libraryCounter.f17202c = false;
                        libraryCounter.f17208i--;
                        lessonRepositoryImpl.m9508b0(str2, i10);
                    } else {
                        libraryCounter.f17202c = true;
                        libraryCounter.f17208i++;
                        lessonRepositoryImpl.f19834h.m15505b(null, "like_lesson");
                        lessonRepositoryImpl.m9510c0(str2, i10);
                    }
                    lessonRepositoryImpl$updateLessonLike$1.f19976d = null;
                    lessonRepositoryImpl$updateLessonLike$1.f19977e = null;
                    lessonRepositoryImpl$updateLessonLike$1.f19978f = null;
                    lessonRepositoryImpl$updateLessonLike$1.f19982j = 5;
                    if (lessonRepositoryImpl.m9520h0(i10, lessonRepositoryImpl$updateLessonLike$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return C9072e.f47360a;
                }
                if (lesson.f17075I) {
                    lesson.f17075I = false;
                    lesson.f17123p--;
                    lessonRepositoryImpl.m9508b0(str2, i10);
                } else {
                    lesson.f17075I = true;
                    lesson.f17123p++;
                    lessonRepositoryImpl.f19834h.m15505b(null, "like_lesson");
                    lessonRepositoryImpl.m9510c0(str2, i10);
                }
                abstractC1495o1 = lessonRepositoryImpl.f19828b;
                lessonRepositoryImpl$updateLessonLike$1.f19976d = lessonRepositoryImpl;
                lessonRepositoryImpl$updateLessonLike$1.f19977e = null;
                lessonRepositoryImpl$updateLessonLike$1.f19978f = null;
                lessonRepositoryImpl$updateLessonLike$1.f19979g = i10;
                lessonRepositoryImpl$updateLessonLike$1.f19982j = 3;
                if (abstractC1495o1.mo598h0(lesson, lessonRepositoryImpl$updateLessonLike$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                lessonRepositoryImpl2 = lessonRepositoryImpl;
                lessonRepositoryImpl$updateLessonLike$1.f19976d = null;
                lessonRepositoryImpl$updateLessonLike$1.f19982j = 4;
                if (lessonRepositoryImpl2.m9520h0(i10, lessonRepositoryImpl$updateLessonLike$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return C9072e.f47360a;
            }
            i10 = lessonRepositoryImpl$updateLessonLike$1.f19979g;
            str = lessonRepositoryImpl$updateLessonLike$1.f19977e;
            lessonRepositoryImpl = lessonRepositoryImpl$updateLessonLike$1.f19976d;
            C7499b.m14977z0(objMo5149o0);
        }
        Lesson lesson2 = (Lesson) objMo5149o0;
        AbstractC1454i2 abstractC1454i2 = lessonRepositoryImpl.f19831e;
        String value = LibraryItemType.Content.getValue();
        lessonRepositoryImpl$updateLessonLike$1.f19976d = lessonRepositoryImpl;
        lessonRepositoryImpl$updateLessonLike$1.f19977e = str;
        lessonRepositoryImpl$updateLessonLike$1.f19978f = lesson2;
        lessonRepositoryImpl$updateLessonLike$1.f19979g = i10;
        lessonRepositoryImpl$updateLessonLike$1.f19982j = 2;
        Object objMo5082z0 = abstractC1454i2.mo5082z0(i10, value, lessonRepositoryImpl$updateLessonLike$1);
        if (objMo5082z0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        str2 = str;
        lesson = lesson2;
        objMo5149o0 = objMo5082z0;
        libraryCounter = (LibraryCounter) objMo5149o0;
        if (lesson != null) {
            if (libraryCounter != null) {
                return C9072e.f47360a;
            }
            if (libraryCounter.f17202c) {
                libraryCounter.f17202c = false;
                libraryCounter.f17208i--;
                lessonRepositoryImpl.m9508b0(str2, i10);
            } else {
                libraryCounter.f17202c = true;
                libraryCounter.f17208i++;
                lessonRepositoryImpl.f19834h.m15505b(null, "like_lesson");
                lessonRepositoryImpl.m9510c0(str2, i10);
            }
            lessonRepositoryImpl$updateLessonLike$1.f19976d = null;
            lessonRepositoryImpl$updateLessonLike$1.f19977e = null;
            lessonRepositoryImpl$updateLessonLike$1.f19978f = null;
            lessonRepositoryImpl$updateLessonLike$1.f19982j = 5;
            if (lessonRepositoryImpl.m9520h0(i10, lessonRepositoryImpl$updateLessonLike$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return C9072e.f47360a;
        }
        if (lesson.f17075I) {
            lesson.f17075I = false;
            lesson.f17123p--;
            lessonRepositoryImpl.m9508b0(str2, i10);
        } else {
            lesson.f17075I = true;
            lesson.f17123p++;
            lessonRepositoryImpl.f19834h.m15505b(null, "like_lesson");
            lessonRepositoryImpl.m9510c0(str2, i10);
        }
        abstractC1495o1 = lessonRepositoryImpl.f19828b;
        lessonRepositoryImpl$updateLessonLike$1.f19976d = lessonRepositoryImpl;
        lessonRepositoryImpl$updateLessonLike$1.f19977e = null;
        lessonRepositoryImpl$updateLessonLike$1.f19978f = null;
        lessonRepositoryImpl$updateLessonLike$1.f19979g = i10;
        lessonRepositoryImpl$updateLessonLike$1.f19982j = 3;
        if (abstractC1495o1.mo598h0(lesson, lessonRepositoryImpl$updateLessonLike$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        lessonRepositoryImpl2 = lessonRepositoryImpl;
        lessonRepositoryImpl$updateLessonLike$1.f19976d = null;
        lessonRepositoryImpl$updateLessonLike$1.f19982j = 4;
        if (lessonRepositoryImpl2.m9520h0(i10, lessonRepositoryImpl$updateLessonLike$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: t */
    public final Object mo9532t(int i10, int i11, String str, String str2, InterfaceC9968c interfaceC9968c) throws Throwable {
        LessonRepositoryImpl$updateLessonBookmark$1 lessonRepositoryImpl$updateLessonBookmark$1;
        String str3;
        String str4;
        LessonRepositoryImpl lessonRepositoryImpl;
        int i12;
        int i13 = i11;
        if (interfaceC9968c instanceof LessonRepositoryImpl$updateLessonBookmark$1) {
            lessonRepositoryImpl$updateLessonBookmark$1 = (LessonRepositoryImpl$updateLessonBookmark$1) interfaceC9968c;
            int i14 = lessonRepositoryImpl$updateLessonBookmark$1.f19960k;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$updateLessonBookmark$1.f19960k = i14 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$updateLessonBookmark$1 = new LessonRepositoryImpl$updateLessonBookmark$1(this, interfaceC9968c);
            }
        } else {
            lessonRepositoryImpl$updateLessonBookmark$1 = new LessonRepositoryImpl$updateLessonBookmark$1(this, interfaceC9968c);
        }
        Object obj = lessonRepositoryImpl$updateLessonBookmark$1.f19958i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i15 = lessonRepositoryImpl$updateLessonBookmark$1.f19960k;
        if (i15 == 0) {
            C7499b.m14977z0(obj);
            LessonBookmark lessonBookmark = new LessonBookmark(i10, new Integer(i13), "Android", str2, str2);
            lessonRepositoryImpl$updateLessonBookmark$1.f19953d = this;
            str3 = str;
            lessonRepositoryImpl$updateLessonBookmark$1.f19954e = str3;
            str4 = str2;
            lessonRepositoryImpl$updateLessonBookmark$1.f19955f = str4;
            lessonRepositoryImpl$updateLessonBookmark$1.f19956g = i10;
            lessonRepositoryImpl$updateLessonBookmark$1.f19957h = i13;
            lessonRepositoryImpl$updateLessonBookmark$1.f19960k = 1;
            if (this.f19828b.mo5131D0(lessonBookmark, lessonRepositoryImpl$updateLessonBookmark$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            lessonRepositoryImpl = this;
            i12 = i10;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = lessonRepositoryImpl$updateLessonBookmark$1.f19957h;
            i12 = lessonRepositoryImpl$updateLessonBookmark$1.f19956g;
            String str5 = lessonRepositoryImpl$updateLessonBookmark$1.f19955f;
            String str6 = lessonRepositoryImpl$updateLessonBookmark$1.f19954e;
            lessonRepositoryImpl = lessonRepositoryImpl$updateLessonBookmark$1.f19953d;
            C7499b.m14977z0(obj);
            str4 = str5;
            str3 = str6;
        }
        lessonRepositoryImpl.getClass();
        NetworkType networkType = NetworkType.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        NetworkType networkType2 = NetworkType.CONNECTED;
        C5207g.m11111f(networkType2, "networkType");
        C1309b c1309b = new C1309b(networkType2, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet));
        C1315h.a aVar = (C1315h.a) new C1315h.a(LessonBookmarkWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
        aVar.f8071c.f37533j = c1309b;
        Pair pair = new Pair("language", str3);
        Pair[] pairArr = {pair, new Pair("lessonId", Integer.valueOf(i12)), new Pair("wordIndex", Integer.valueOf(i13)), new Pair("timestamp", str4)};
        C1244b.a aVar2 = new C1244b.a();
        for (int i16 = 0; i16 < 4; i16++) {
            Pair pair2 = pairArr[i16];
            aVar2.m4709b(pair2.f38013b, (String) pair2.f38012a);
        }
        aVar.f8071c.f37528e = aVar2.m4708a();
        lessonRepositoryImpl.f19835i.m4877b(aVar.m4879a());
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00d1 A[Catch: Exception -> 0x004b, TryCatch #0 {Exception -> 0x004b, blocks: (B:13:0x002c, B:50:0x00f1, B:18:0x003d, B:41:0x00cd, B:43:0x00d1, B:45:0x00d9, B:47:0x00e0, B:21:0x0046, B:37:0x00ba, B:33:0x00a2), top: B:55:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d9 A[Catch: Exception -> 0x004b, TryCatch #0 {Exception -> 0x004b, blocks: (B:13:0x002c, B:50:0x00f1, B:18:0x003d, B:41:0x00cd, B:43:0x00d1, B:45:0x00d9, B:47:0x00e0, B:21:0x0046, B:37:0x00ba, B:33:0x00a2), top: B:55:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00de  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: u */
    public final Object mo9533u(int i10, String str, String str2, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        LessonRepositoryImpl$networkUploadLessonAudio$1 lessonRepositoryImpl$networkUploadLessonAudio$1;
        C9098p c9098pM17339a;
        LessonRepositoryImpl lessonRepositoryImpl;
        ResultLessonUpload resultLessonUpload;
        Lesson lesson;
        Integer num;
        int iIntValue;
        if (interfaceC9968c instanceof LessonRepositoryImpl$networkUploadLessonAudio$1) {
            lessonRepositoryImpl$networkUploadLessonAudio$1 = (LessonRepositoryImpl$networkUploadLessonAudio$1) interfaceC9968c;
            int i11 = lessonRepositoryImpl$networkUploadLessonAudio$1.f19938i;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$networkUploadLessonAudio$1.f19938i = i11 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$networkUploadLessonAudio$1 = new LessonRepositoryImpl$networkUploadLessonAudio$1(this, interfaceC9968c);
            }
        } else {
            lessonRepositoryImpl$networkUploadLessonAudio$1 = new LessonRepositoryImpl$networkUploadLessonAudio$1(this, interfaceC9968c);
        }
        Object objM18467i = lessonRepositoryImpl$networkUploadLessonAudio$1.f19936g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = lessonRepositoryImpl$networkUploadLessonAudio$1.f19938i;
        try {
            if (i12 != 0) {
                if (i12 == 1) {
                    i10 = lessonRepositoryImpl$networkUploadLessonAudio$1.f19935f;
                    lessonRepositoryImpl = lessonRepositoryImpl$networkUploadLessonAudio$1.f19933d;
                    C7499b.m14977z0(objM18467i);
                } else {
                    if (i12 == 2) {
                        resultLessonUpload = lessonRepositoryImpl$networkUploadLessonAudio$1.f19934e;
                        lessonRepositoryImpl = lessonRepositoryImpl$networkUploadLessonAudio$1.f19933d;
                        C7499b.m14977z0(objM18467i);
                        lesson = (Lesson) objM18467i;
                        if (lesson != null) {
                            lesson.f17109i = resultLessonUpload.f18659b;
                            num = resultLessonUpload.f18660c;
                            if (num != null) {
                                iIntValue = num.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            lesson.f17111j = iIntValue;
                            AbstractC1495o1 abstractC1495o1 = lessonRepositoryImpl.f19828b;
                            lessonRepositoryImpl$networkUploadLessonAudio$1.f19933d = null;
                            lessonRepositoryImpl$networkUploadLessonAudio$1.f19934e = null;
                            lessonRepositoryImpl$networkUploadLessonAudio$1.f19938i = 3;
                            objM18467i = abstractC1495o1.mo598h0(lesson, lessonRepositoryImpl$networkUploadLessonAudio$1);
                            if (objM18467i == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        return C9072e.f47360a;
                    }
                    if (i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(objM18467i);
                }
                C5206f.m11026v0(((Number) objM18467i).longValue());
                return C9072e.f47360a;
            }
            C7499b.m14977z0(objM18467i);
            File file = new File(str2);
            String strM762h = C0166e.m762h("tts-generated-", i10, ".mp3");
            Pattern pattern = C9098p.f47473d;
            try {
                c9098pM17339a = C9098p.a.m17339a("audio/mpeg");
            } catch (IllegalArgumentException unused) {
                c9098pM17339a = null;
            }
            C9102t c9102t = new C9102t(file, c9098pM17339a);
            StringBuilder sbM771r = C0166e.m771r("form-data; name=");
            C9098p c9098p = C9099q.f47478e;
            C9099q.b.m17341a("audio", sbM771r);
            if (strM762h != null) {
                sbM771r.append("; filename=");
                C9099q.b.m17341a(strM762h, sbM771r);
            }
            String string = sbM771r.toString();
            C5207g.m11110e(string, "StringBuilder().apply(builderAction).toString()");
            C9095m.a aVar = new C9095m.a();
            C9095m.b.m17317a("Content-Disposition");
            aVar.m17313c("Content-Disposition", string);
            C9099q.c cVarM17342a = C9099q.c.a.m17342a(aVar.m17314d(), c9102t);
            InterfaceC9938f interfaceC9938f = this.f19832f;
            Integer num2 = new Integer(i10);
            lessonRepositoryImpl$networkUploadLessonAudio$1.f19933d = this;
            lessonRepositoryImpl$networkUploadLessonAudio$1.f19935f = i10;
            lessonRepositoryImpl$networkUploadLessonAudio$1.f19938i = 1;
            objM18467i = interfaceC9938f.m18467i(str, num2, cVarM17342a, str, lessonRepositoryImpl$networkUploadLessonAudio$1);
            if (objM18467i == coroutineSingletons) {
                return coroutineSingletons;
            }
            lessonRepositoryImpl = this;
            ResultLessonUpload resultLessonUpload2 = (ResultLessonUpload) objM18467i;
            AbstractC1495o1 abstractC1495o2 = lessonRepositoryImpl.f19828b;
            lessonRepositoryImpl$networkUploadLessonAudio$1.f19933d = lessonRepositoryImpl;
            lessonRepositoryImpl$networkUploadLessonAudio$1.f19934e = resultLessonUpload2;
            lessonRepositoryImpl$networkUploadLessonAudio$1.f19938i = 2;
            objM18467i = abstractC1495o2.mo5149o0(i10, lessonRepositoryImpl$networkUploadLessonAudio$1);
            if (objM18467i == coroutineSingletons) {
                return coroutineSingletons;
            }
            resultLessonUpload = resultLessonUpload2;
            lesson = (Lesson) objM18467i;
            if (lesson != null) {
                lesson.f17109i = resultLessonUpload.f18659b;
                num = resultLessonUpload.f18660c;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                lesson.f17111j = iIntValue;
                AbstractC1495o1 abstractC1495o3 = lessonRepositoryImpl.f19828b;
                lessonRepositoryImpl$networkUploadLessonAudio$1.f19933d = null;
                lessonRepositoryImpl$networkUploadLessonAudio$1.f19934e = null;
                lessonRepositoryImpl$networkUploadLessonAudio$1.f19938i = 3;
                objM18467i = abstractC1495o3.mo598h0(lesson, lessonRepositoryImpl$networkUploadLessonAudio$1);
                if (objM18467i == coroutineSingletons) {
                    return coroutineSingletons;
                }
                C5206f.m11026v0(((Number) objM18467i).longValue());
            }
            return C9072e.f47360a;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: v */
    public final Object mo9534v(int i10, int i11, InterfaceC9968c interfaceC9968c) {
        return this.f19828b.mo5129B0(i10, i11 + 1, i11 + 2, interfaceC9968c);
    }

    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: w */
    public final InterfaceC7116c mo9535w(int i10, String str) {
        final C7136q c7136qMo5140M0 = this.f19828b.mo5140M0(str, i10);
        return C0062b.m273H0(new InterfaceC7116c<Boolean>() { // from class: com.lingq.shared.repository.LessonRepositoryImpl$isLessonAudioDownloaded$$inlined$map$1

            /* JADX INFO: renamed from: com.lingq.shared.repository.LessonRepositoryImpl$isLessonAudioDownloaded$$inlined$map$1$2 */
            public static final class C33182<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f19843a;

                /* JADX INFO: renamed from: com.lingq.shared.repository.LessonRepositoryImpl$isLessonAudioDownloaded$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.repository.LessonRepositoryImpl$isLessonAudioDownloaded$$inlined$map$1$2", m19206f = "LessonRepository.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f19844d;

                    /* JADX INFO: renamed from: e */
                    public int f19845e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f19844d = obj;
                        this.f19845e |= Integer.MIN_VALUE;
                        return C33182.this.mo1339r(null, this);
                    }
                }

                public C33182(InterfaceC7117d interfaceC7117d) {
                    this.f19843a = interfaceC7117d;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0018  */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f19845e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f19845e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f19844d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f19845e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        Boolean boolValueOf = Boolean.valueOf(((Number) obj).intValue() > 0);
                        anonymousClass1.f19845e = 1;
                        if (this.f19843a.mo1339r(boolValueOf, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7499b.m14977z0(obj2);
                    }
                    return C9072e.f47360a;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC7116c
            /* JADX INFO: renamed from: a */
            public final Object mo9539a(InterfaceC7117d<? super Boolean> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = c7136qMo5140M0.mo9539a(new C33182(interfaceC7117d), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: x */
    public final Object mo9536x(int i10, int i11, String str, String str2, InterfaceC9968c interfaceC9968c) throws Throwable {
        LessonRepositoryImpl$networkSentenceTranslation$1 lessonRepositoryImpl$networkSentenceTranslation$1;
        LessonRepositoryImpl lessonRepositoryImpl;
        int i12 = i10;
        if (interfaceC9968c instanceof LessonRepositoryImpl$networkSentenceTranslation$1) {
            lessonRepositoryImpl$networkSentenceTranslation$1 = (LessonRepositoryImpl$networkSentenceTranslation$1) interfaceC9968c;
            int i13 = lessonRepositoryImpl$networkSentenceTranslation$1.f19912h;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lessonRepositoryImpl$networkSentenceTranslation$1.f19912h = i13 - Integer.MIN_VALUE;
            } else {
                lessonRepositoryImpl$networkSentenceTranslation$1 = new LessonRepositoryImpl$networkSentenceTranslation$1(this, interfaceC9968c);
            }
        } else {
            lessonRepositoryImpl$networkSentenceTranslation$1 = new LessonRepositoryImpl$networkSentenceTranslation$1(this, interfaceC9968c);
        }
        Object objM18464f = lessonRepositoryImpl$networkSentenceTranslation$1.f19910f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i14 = lessonRepositoryImpl$networkSentenceTranslation$1.f19912h;
        if (i14 != 0) {
            if (i14 == 1) {
                i12 = lessonRepositoryImpl$networkSentenceTranslation$1.f19909e;
                lessonRepositoryImpl = lessonRepositoryImpl$networkSentenceTranslation$1.f19908d;
                C7499b.m14977z0(objM18464f);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objM18464f);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objM18464f);
        RequestTranslateSentence requestTranslateSentence = new RequestTranslateSentence(str2, i11, true);
        lessonRepositoryImpl$networkSentenceTranslation$1.f19908d = this;
        lessonRepositoryImpl$networkSentenceTranslation$1.f19909e = i12;
        lessonRepositoryImpl$networkSentenceTranslation$1.f19912h = 1;
        objM18464f = this.f19832f.m18464f(str, i12, requestTranslateSentence, lessonRepositoryImpl$networkSentenceTranslation$1);
        if (objM18464f == coroutineSingletons) {
            return coroutineSingletons;
        }
        lessonRepositoryImpl = this;
        int i15 = i12;
        ResultTranslationSentenceV2 resultTranslationSentenceV2 = (ResultTranslationSentenceV2) objM18464f;
        AbstractC1495o1 abstractC1495o1 = lessonRepositoryImpl.f19828b;
        C5207g.m11111f(resultTranslationSentenceV2, "<this>");
        int i16 = resultTranslationSentenceV2.f19003a;
        Double d10 = resultTranslationSentenceV2.f19004b;
        Double d11 = resultTranslationSentenceV2.f19005c;
        String str3 = resultTranslationSentenceV2.f19006d;
        List<ResultTranslationV2> list = resultTranslationSentenceV2.f19007e;
        ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
        for (ResultTranslationV2 resultTranslationV2 : list) {
            arrayList.add(new Translation(resultTranslationV2.f19014a, resultTranslationV2.f19015b, resultTranslationV2.f19016c));
        }
        List listM17251q = C9000b.m17251q(new TranslationSentence(i16, i15, d10, d11, str3, arrayList));
        lessonRepositoryImpl$networkSentenceTranslation$1.f19908d = null;
        lessonRepositoryImpl$networkSentenceTranslation$1.f19912h = 2;
        if (abstractC1495o1.mo5139L0(listM17251q, lessonRepositoryImpl$networkSentenceTranslation$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }

    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: y */
    public final InterfaceC7116c mo9537y(int i10) {
        return C0062b.m273H0(this.f19828b.mo5128A0(i10));
    }

    @Override // com.lingq.shared.repository.InterfaceC3324a
    /* JADX INFO: renamed from: z */
    public final InterfaceC7116c<List<CollectionsFilterLessonTag>> mo9538z(String str) {
        C5207g.m11111f(str, "query");
        return C0062b.m273H0(this.f19828b.mo5158x0(str));
    }
}
