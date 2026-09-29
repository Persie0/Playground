package com.lingq.shared.repository;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.room.RoomDatabaseKt;
import bi.AbstractC1495o1;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.network.result.ResultLesson;
import com.lingq.shared.uimodel.lesson.LessonStudy;
import com.lingq.shared.uimodel.lesson.LessonStudyBookmark;
import com.lingq.shared.uimodel.lesson.LessonStudySentence;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p460wh.InterfaceC9938f;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\b\u001a\u00020\u0007*(\u0012$\u0012\"\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/domain/Resource;", "Lkotlin/Triple;", "Lcom/lingq/shared/uimodel/lesson/LessonStudy;", "", "Lcom/lingq/shared/uimodel/lesson/LessonStudySentence;", "Lcom/lingq/shared/uimodel/lesson/LessonStudyBookmark;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LessonRepositoryImpl$loadLesson$2", m19206f = "LessonRepository.kt", m19207l = {330, 331, 332, 334, 338, 340, 341, 343, 344, 345, 347, 351, 353}, m19208m = "invokeSuspend")
final class LessonRepositoryImpl$loadLesson$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super Resource<? extends Triple<? extends LessonStudy, ? extends List<? extends LessonStudySentence>, ? extends LessonStudyBookmark>>>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int f19852H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ boolean f19853I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ String f19854J;

    /* JADX INFO: renamed from: e */
    public LessonStudy f19855e;

    /* JADX INFO: renamed from: f */
    public List f19856f;

    /* JADX INFO: renamed from: g */
    public LessonStudyBookmark f19857g;

    /* JADX INFO: renamed from: h */
    public LessonStudy f19858h;

    /* JADX INFO: renamed from: i */
    public List f19859i;

    /* JADX INFO: renamed from: j */
    public int f19860j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ Object f19861k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ LessonRepositoryImpl f19862l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$loadLesson$2(LessonRepositoryImpl lessonRepositoryImpl, int i10, boolean z10, String str, InterfaceC9968c<? super LessonRepositoryImpl$loadLesson$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f19862l = lessonRepositoryImpl;
        this.f19852H = i10;
        this.f19853I = z10;
        this.f19854J = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        LessonRepositoryImpl$loadLesson$2 lessonRepositoryImpl$loadLesson$2 = new LessonRepositoryImpl$loadLesson$2(this.f19862l, this.f19852H, this.f19853I, this.f19854J, interfaceC9968c);
        lessonRepositoryImpl$loadLesson$2.f19861k = obj;
        return lessonRepositoryImpl$loadLesson$2;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7117d<? super Resource<? extends Triple<? extends LessonStudy, ? extends List<? extends LessonStudySentence>, ? extends LessonStudyBookmark>>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonRepositoryImpl$loadLesson$2) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0270  */
    /* JADX WARN: Code duplicated, block: B:108:0x029e  */
    /* JADX WARN: Code duplicated, block: B:110:0x02ba A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x0110 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x0111  */
    /* JADX WARN: Code duplicated, block: B:46:0x012a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x012b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0135 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:55:0x015d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x0165 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:63:0x018b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x01a7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d3 A[Catch: Exception -> 0x0264, TRY_LEAVE, TryCatch #4 {Exception -> 0x0264, blocks: (B:69:0x01c7, B:72:0x01d3), top: B:121:0x01c7 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x01d7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:75:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:78:0x01f1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:81:0x020a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:84:0x0226 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:87:0x022b A[Catch: Exception -> 0x0257, TryCatch #2 {Exception -> 0x0257, blocks: (B:85:0x0227, B:87:0x022b, B:89:0x0232), top: B:117:0x0227 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0256 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v26 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        InterfaceC7117d interfaceC7117d;
        LessonStudy lessonStudy;
        List list;
        Resource resourceM9436b;
        InterfaceC7117d interfaceC7117d2;
        Object objMo5157w0;
        LessonStudy lessonStudy2;
        Object objMo5156v0;
        InterfaceC7117d interfaceC7117d3;
        LessonStudy lessonStudy3;
        List list2;
        Object objMo5150p0;
        LessonStudy lessonStudy4;
        InterfaceC7117d interfaceC7117d4;
        List list3;
        LessonStudyBookmark lessonStudyBookmark;
        InterfaceC7117d interfaceC7117d5;
        LessonStudyBookmark lessonStudyBookmark2;
        Resource resourceM9437c;
        Resource resource;
        LessonStudyBookmark lessonStudyBookmark3;
        Object objM18470l;
        LessonStudyBookmark lessonStudyBookmark4;
        List list4;
        LessonStudy lessonStudy5;
        InterfaceC7117d interfaceC7117d6;
        InterfaceC7117d interfaceC7117d7;
        Object objM4573a;
        LessonStudyBookmark lessonStudyBookmark5;
        List list5;
        LessonStudy lessonStudy6;
        InterfaceC7117d interfaceC7117d8;
        Object objMo5157w1;
        LessonStudy lessonStudy7;
        Object objMo5156v1;
        InterfaceC7117d interfaceC7117d9;
        LessonStudy lessonStudy8;
        List list6;
        LessonStudyBookmark lessonStudyBookmark6;
        LessonStudy lessonStudy9;
        List list7;
        Object objMo5150p1;
        InterfaceC7117d interfaceC7117d10;
        LessonStudyBookmark lessonStudyBookmark7;
        Resource resourceM9437c2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f19860j;
        String str = this.f19854J;
        int i11 = this.f19852H;
        Object obj2 = this.f19853I;
        LessonRepositoryImpl lessonRepositoryImpl = this.f19862l;
        try {
            switch (i10) {
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    C7499b.m14977z0(obj);
                    interfaceC7117d2 = (InterfaceC7117d) this.f19861k;
                    AbstractC1495o1 abstractC1495o1 = lessonRepositoryImpl.f19828b;
                    this.f19861k = interfaceC7117d2;
                    this.f19860j = 1;
                    objMo5157w0 = abstractC1495o1.mo5157w0(i11, this);
                    if (objMo5157w0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lessonStudy2 = (LessonStudy) objMo5157w0;
                    AbstractC1495o1 abstractC1495o2 = lessonRepositoryImpl.f19828b;
                    this.f19861k = interfaceC7117d2;
                    this.f19855e = lessonStudy2;
                    this.f19860j = 2;
                    objMo5156v0 = abstractC1495o2.mo5156v0(i11, this);
                    if (objMo5156v0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC7117d3 = interfaceC7117d2;
                    lessonStudy3 = lessonStudy2;
                    list2 = (List) objMo5156v0;
                    this.f19861k = interfaceC7117d3;
                    this.f19855e = lessonStudy3;
                    this.f19856f = list2;
                    this.f19860j = 3;
                    objMo5150p0 = lessonRepositoryImpl.f19828b.mo5150p0(i11, this);
                    if (objMo5150p0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lessonStudy4 = lessonStudy3;
                    interfaceC7117d4 = interfaceC7117d3;
                    list3 = list2;
                    lessonStudyBookmark = (LessonStudyBookmark) objMo5150p0;
                    if (obj2 == 0 && lessonStudy4 != null && (!list3.isEmpty())) {
                        Resource.C3303a c3303a = Resource.f17861d;
                        Triple triple = new Triple(lessonStudy4, list3, lessonStudyBookmark);
                        c3303a.getClass();
                        resourceM9437c = Resource.C3303a.m9437c(triple);
                        this.f19861k = interfaceC7117d4;
                        this.f19855e = lessonStudy4;
                        this.f19856f = list3;
                        this.f19857g = lessonStudyBookmark;
                        this.f19860j = 4;
                        if (interfaceC7117d4.mo1339r(resourceM9437c, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    interfaceC7117d5 = interfaceC7117d4;
                    lessonStudyBookmark2 = lessonStudyBookmark;
                    if (obj2 == 0 || lessonStudy4 == null || list3.isEmpty()) {
                        Resource.f17861d.getClass();
                        resource = new Resource(Resource.Status.LOADING, null, null);
                        this.f19861k = interfaceC7117d5;
                        this.f19855e = lessonStudy4;
                        this.f19856f = list3;
                        this.f19857g = lessonStudyBookmark2;
                        this.f19860j = 5;
                        if (interfaceC7117d5.mo1339r(resource, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        lessonStudyBookmark3 = lessonStudyBookmark2;
                        InterfaceC9938f interfaceC9938f = lessonRepositoryImpl.f19832f;
                        Integer num = new Integer(i11);
                        this.f19861k = interfaceC7117d5;
                        this.f19855e = lessonStudy4;
                        this.f19856f = list3;
                        this.f19857g = lessonStudyBookmark3;
                        this.f19860j = 6;
                        objM18470l = interfaceC9938f.m18470l(str, num, false, this);
                        if (objM18470l == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        lessonStudyBookmark4 = lessonStudyBookmark3;
                        list4 = list3;
                        lessonStudy5 = lessonStudy4;
                        interfaceC7117d6 = interfaceC7117d5;
                        try {
                            ResultLesson resultLesson = (ResultLesson) objM18470l;
                            this.f19861k = interfaceC7117d6;
                            this.f19855e = lessonStudy5;
                            this.f19856f = list4;
                            this.f19857g = lessonStudyBookmark4;
                            this.f19860j = 7;
                            lessonRepositoryImpl.getClass();
                            interfaceC7117d7 = interfaceC7117d6;
                            try {
                                objM4573a = RoomDatabaseKt.m4573a(lessonRepositoryImpl.f19827a, new LessonRepositoryImpl$storeLessonData$2(i11, resultLesson, lessonRepositoryImpl, str, null), this);
                                if (objM4573a != coroutineSingletons) {
                                    objM4573a = C9072e.f47360a;
                                    break;
                                }
                                if (objM4573a == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                lessonStudyBookmark5 = lessonStudyBookmark4;
                                list5 = list4;
                                lessonStudy6 = lessonStudy5;
                                interfaceC7117d8 = interfaceC7117d7;
                                AbstractC1495o1 abstractC1495o3 = lessonRepositoryImpl.f19828b;
                                this.f19861k = interfaceC7117d8;
                                this.f19855e = lessonStudy6;
                                this.f19856f = list5;
                                this.f19857g = lessonStudyBookmark5;
                                this.f19860j = 8;
                                objMo5157w1 = abstractC1495o3.mo5157w0(i11, this);
                                if (objMo5157w1 == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                lessonStudy7 = (LessonStudy) objMo5157w1;
                                AbstractC1495o1 abstractC1495o4 = lessonRepositoryImpl.f19828b;
                                this.f19861k = interfaceC7117d8;
                                this.f19855e = lessonStudy6;
                                this.f19856f = list5;
                                this.f19857g = lessonStudyBookmark5;
                                this.f19858h = lessonStudy7;
                                this.f19860j = 9;
                                objMo5156v1 = abstractC1495o4.mo5156v0(i11, this);
                                if (objMo5156v1 == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                interfaceC7117d9 = interfaceC7117d8;
                                lessonStudy8 = lessonStudy6;
                                list6 = list5;
                                lessonStudyBookmark6 = lessonStudyBookmark5;
                                lessonStudy9 = lessonStudy7;
                                try {
                                    list7 = (List) objMo5156v1;
                                    this.f19861k = interfaceC7117d9;
                                    this.f19855e = lessonStudy8;
                                    this.f19856f = list6;
                                    this.f19857g = lessonStudyBookmark6;
                                    this.f19858h = lessonStudy9;
                                    this.f19859i = list7;
                                    this.f19860j = 10;
                                    objMo5150p1 = lessonRepositoryImpl.f19828b.mo5150p0(i11, this);
                                    if (objMo5150p1 == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    try {
                                        lessonStudyBookmark7 = (LessonStudyBookmark) objMo5150p1;
                                        if (lessonStudy9 != null && (!list7.isEmpty())) {
                                            Resource.C3303a c3303a2 = Resource.f17861d;
                                            Triple triple2 = new Triple(lessonStudy9, list7, lessonStudyBookmark7);
                                            c3303a2.getClass();
                                            resourceM9437c2 = Resource.C3303a.m9437c(triple2);
                                            this.f19861k = interfaceC7117d9;
                                            this.f19855e = lessonStudy8;
                                            this.f19856f = list6;
                                            this.f19857g = lessonStudyBookmark6;
                                            this.f19858h = null;
                                            this.f19859i = null;
                                            this.f19860j = 11;
                                            if (interfaceC7117d9.mo1339r(resourceM9437c2, this) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                        }
                                    } catch (Exception e10) {
                                        e = e10;
                                        interfaceC7117d10 = interfaceC7117d9;
                                        obj2 = lessonStudyBookmark6;
                                        list = list6;
                                        lessonStudy = lessonStudy8;
                                        interfaceC7117d = interfaceC7117d10;
                                        if (lessonStudy == null) {
                                            resourceM9436b = Resource.C3303a.m9436b(Resource.f17861d, e);
                                            this.f19861k = null;
                                            this.f19855e = null;
                                            this.f19856f = null;
                                            this.f19857g = null;
                                            this.f19858h = null;
                                            this.f19859i = null;
                                            this.f19860j = 13;
                                            if (interfaceC7117d.mo1339r(resourceM9436b, this) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                        } else {
                                            resourceM9436b = Resource.C3303a.m9436b(Resource.f17861d, e);
                                            this.f19861k = null;
                                            this.f19855e = null;
                                            this.f19856f = null;
                                            this.f19857g = null;
                                            this.f19858h = null;
                                            this.f19859i = null;
                                            this.f19860j = 13;
                                            if (interfaceC7117d.mo1339r(resourceM9436b, this) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                        }
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    obj2 = lessonStudyBookmark6;
                                    list = list6;
                                    lessonStudy = lessonStudy8;
                                    interfaceC7117d = interfaceC7117d9;
                                    if (lessonStudy == null && (!list.isEmpty())) {
                                        Resource.C3303a c3303a3 = Resource.f17861d;
                                        Triple triple3 = new Triple(lessonStudy, list, obj2);
                                        c3303a3.getClass();
                                        Resource resourceM9437c3 = Resource.C3303a.m9437c(triple3);
                                        this.f19861k = null;
                                        this.f19855e = null;
                                        this.f19856f = null;
                                        this.f19857g = null;
                                        this.f19858h = null;
                                        this.f19859i = null;
                                        this.f19860j = 12;
                                        if (interfaceC7117d.mo1339r(resourceM9437c3, this) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                    } else {
                                        resourceM9436b = Resource.C3303a.m9436b(Resource.f17861d, e);
                                        this.f19861k = null;
                                        this.f19855e = null;
                                        this.f19856f = null;
                                        this.f19857g = null;
                                        this.f19858h = null;
                                        this.f19859i = null;
                                        this.f19860j = 13;
                                        if (interfaceC7117d.mo1339r(resourceM9436b, this) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                    }
                                }
                            } catch (Exception e12) {
                                e = e12;
                                obj2 = lessonStudyBookmark4;
                                list = list4;
                                lessonStudy = lessonStudy5;
                                interfaceC7117d = interfaceC7117d7;
                                if (lessonStudy == null) {
                                    resourceM9436b = Resource.C3303a.m9436b(Resource.f17861d, e);
                                    this.f19861k = null;
                                    this.f19855e = null;
                                    this.f19856f = null;
                                    this.f19857g = null;
                                    this.f19858h = null;
                                    this.f19859i = null;
                                    this.f19860j = 13;
                                    if (interfaceC7117d.mo1339r(resourceM9436b, this) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                } else {
                                    resourceM9436b = Resource.C3303a.m9436b(Resource.f17861d, e);
                                    this.f19861k = null;
                                    this.f19855e = null;
                                    this.f19856f = null;
                                    this.f19857g = null;
                                    this.f19858h = null;
                                    this.f19859i = null;
                                    this.f19860j = 13;
                                    if (interfaceC7117d.mo1339r(resourceM9436b, this) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                                return C9072e.f47360a;
                            }
                        } catch (Exception e13) {
                            e = e13;
                            interfaceC7117d7 = interfaceC7117d6;
                        }
                    }
                    return C9072e.f47360a;
                case 1:
                    interfaceC7117d2 = (InterfaceC7117d) this.f19861k;
                    C7499b.m14977z0(obj);
                    objMo5157w0 = obj;
                    lessonStudy2 = (LessonStudy) objMo5157w0;
                    AbstractC1495o1 abstractC1495o5 = lessonRepositoryImpl.f19828b;
                    this.f19861k = interfaceC7117d2;
                    this.f19855e = lessonStudy2;
                    this.f19860j = 2;
                    objMo5156v0 = abstractC1495o5.mo5156v0(i11, this);
                    if (objMo5156v0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC7117d3 = interfaceC7117d2;
                    lessonStudy3 = lessonStudy2;
                    list2 = (List) objMo5156v0;
                    this.f19861k = interfaceC7117d3;
                    this.f19855e = lessonStudy3;
                    this.f19856f = list2;
                    this.f19860j = 3;
                    objMo5150p0 = lessonRepositoryImpl.f19828b.mo5150p0(i11, this);
                    if (objMo5150p0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lessonStudy4 = lessonStudy3;
                    interfaceC7117d4 = interfaceC7117d3;
                    list3 = list2;
                    lessonStudyBookmark = (LessonStudyBookmark) objMo5150p0;
                    if (obj2 == 0) {
                        Resource.C3303a c3303a4 = Resource.f17861d;
                        Triple triple4 = new Triple(lessonStudy4, list3, lessonStudyBookmark);
                        c3303a4.getClass();
                        resourceM9437c = Resource.C3303a.m9437c(triple4);
                        this.f19861k = interfaceC7117d4;
                        this.f19855e = lessonStudy4;
                        this.f19856f = list3;
                        this.f19857g = lessonStudyBookmark;
                        this.f19860j = 4;
                        if (interfaceC7117d4.mo1339r(resourceM9437c, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    interfaceC7117d5 = interfaceC7117d4;
                    lessonStudyBookmark2 = lessonStudyBookmark;
                    if (obj2 == 0) {
                    }
                    Resource.f17861d.getClass();
                    resource = new Resource(Resource.Status.LOADING, null, null);
                    this.f19861k = interfaceC7117d5;
                    this.f19855e = lessonStudy4;
                    this.f19856f = list3;
                    this.f19857g = lessonStudyBookmark2;
                    this.f19860j = 5;
                    if (interfaceC7117d5.mo1339r(resource, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lessonStudyBookmark3 = lessonStudyBookmark2;
                    InterfaceC9938f interfaceC9938f2 = lessonRepositoryImpl.f19832f;
                    Integer num2 = new Integer(i11);
                    this.f19861k = interfaceC7117d5;
                    this.f19855e = lessonStudy4;
                    this.f19856f = list3;
                    this.f19857g = lessonStudyBookmark3;
                    this.f19860j = 6;
                    objM18470l = interfaceC9938f2.m18470l(str, num2, false, this);
                    if (objM18470l == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lessonStudyBookmark4 = lessonStudyBookmark3;
                    list4 = list3;
                    lessonStudy5 = lessonStudy4;
                    interfaceC7117d6 = interfaceC7117d5;
                    ResultLesson resultLesson2 = (ResultLesson) objM18470l;
                    this.f19861k = interfaceC7117d6;
                    this.f19855e = lessonStudy5;
                    this.f19856f = list4;
                    this.f19857g = lessonStudyBookmark4;
                    this.f19860j = 7;
                    lessonRepositoryImpl.getClass();
                    interfaceC7117d7 = interfaceC7117d6;
                    objM4573a = RoomDatabaseKt.m4573a(lessonRepositoryImpl.f19827a, new LessonRepositoryImpl$storeLessonData$2(i11, resultLesson2, lessonRepositoryImpl, str, null), this);
                    if (objM4573a != coroutineSingletons) {
                        objM4573a = C9072e.f47360a;
                        break;
                    }
                    if (objM4573a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lessonStudyBookmark5 = lessonStudyBookmark4;
                    list5 = list4;
                    lessonStudy6 = lessonStudy5;
                    interfaceC7117d8 = interfaceC7117d7;
                    AbstractC1495o1 abstractC1495o6 = lessonRepositoryImpl.f19828b;
                    this.f19861k = interfaceC7117d8;
                    this.f19855e = lessonStudy6;
                    this.f19856f = list5;
                    this.f19857g = lessonStudyBookmark5;
                    this.f19860j = 8;
                    objMo5157w1 = abstractC1495o6.mo5157w0(i11, this);
                    if (objMo5157w1 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lessonStudy7 = (LessonStudy) objMo5157w1;
                    AbstractC1495o1 abstractC1495o7 = lessonRepositoryImpl.f19828b;
                    this.f19861k = interfaceC7117d8;
                    this.f19855e = lessonStudy6;
                    this.f19856f = list5;
                    this.f19857g = lessonStudyBookmark5;
                    this.f19858h = lessonStudy7;
                    this.f19860j = 9;
                    objMo5156v1 = abstractC1495o7.mo5156v0(i11, this);
                    if (objMo5156v1 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC7117d9 = interfaceC7117d8;
                    lessonStudy8 = lessonStudy6;
                    list6 = list5;
                    lessonStudyBookmark6 = lessonStudyBookmark5;
                    lessonStudy9 = lessonStudy7;
                    list7 = (List) objMo5156v1;
                    this.f19861k = interfaceC7117d9;
                    this.f19855e = lessonStudy8;
                    this.f19856f = list6;
                    this.f19857g = lessonStudyBookmark6;
                    this.f19858h = lessonStudy9;
                    this.f19859i = list7;
                    this.f19860j = 10;
                    objMo5150p1 = lessonRepositoryImpl.f19828b.mo5150p0(i11, this);
                    if (objMo5150p1 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lessonStudyBookmark7 = (LessonStudyBookmark) objMo5150p1;
                    if (lessonStudy9 != null) {
                        Resource.C3303a c3303a5 = Resource.f17861d;
                        Triple triple5 = new Triple(lessonStudy9, list7, lessonStudyBookmark7);
                        c3303a5.getClass();
                        resourceM9437c2 = Resource.C3303a.m9437c(triple5);
                        this.f19861k = interfaceC7117d9;
                        this.f19855e = lessonStudy8;
                        this.f19856f = list6;
                        this.f19857g = lessonStudyBookmark6;
                        this.f19858h = null;
                        this.f19859i = null;
                        this.f19860j = 11;
                        if (interfaceC7117d9.mo1339r(resourceM9437c2, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return C9072e.f47360a;
                case 2:
                    lessonStudy3 = this.f19855e;
                    interfaceC7117d3 = (InterfaceC7117d) this.f19861k;
                    C7499b.m14977z0(obj);
                    objMo5156v0 = obj;
                    list2 = (List) objMo5156v0;
                    this.f19861k = interfaceC7117d3;
                    this.f19855e = lessonStudy3;
                    this.f19856f = list2;
                    this.f19860j = 3;
                    objMo5150p0 = lessonRepositoryImpl.f19828b.mo5150p0(i11, this);
                    if (objMo5150p0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lessonStudy4 = lessonStudy3;
                    interfaceC7117d4 = interfaceC7117d3;
                    list3 = list2;
                    lessonStudyBookmark = (LessonStudyBookmark) objMo5150p0;
                    if (obj2 == 0) {
                        Resource.C3303a c3303a6 = Resource.f17861d;
                        Triple triple6 = new Triple(lessonStudy4, list3, lessonStudyBookmark);
                        c3303a6.getClass();
                        resourceM9437c = Resource.C3303a.m9437c(triple6);
                        this.f19861k = interfaceC7117d4;
                        this.f19855e = lessonStudy4;
                        this.f19856f = list3;
                        this.f19857g = lessonStudyBookmark;
                        this.f19860j = 4;
                        if (interfaceC7117d4.mo1339r(resourceM9437c, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    interfaceC7117d5 = interfaceC7117d4;
                    lessonStudyBookmark2 = lessonStudyBookmark;
                    if (obj2 == 0) {
                    }
                    Resource.f17861d.getClass();
                    resource = new Resource(Resource.Status.LOADING, null, null);
                    this.f19861k = interfaceC7117d5;
                    this.f19855e = lessonStudy4;
                    this.f19856f = list3;
                    this.f19857g = lessonStudyBookmark2;
                    this.f19860j = 5;
                    if (interfaceC7117d5.mo1339r(resource, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lessonStudyBookmark3 = lessonStudyBookmark2;
                    InterfaceC9938f interfaceC9938f3 = lessonRepositoryImpl.f19832f;
                    Integer num3 = new Integer(i11);
                    this.f19861k = interfaceC7117d5;
                    this.f19855e = lessonStudy4;
                    this.f19856f = list3;
                    this.f19857g = lessonStudyBookmark3;
                    this.f19860j = 6;
                    objM18470l = interfaceC9938f3.m18470l(str, num3, false, this);
                    if (objM18470l == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lessonStudyBookmark4 = lessonStudyBookmark3;
                    list4 = list3;
                    lessonStudy5 = lessonStudy4;
                    interfaceC7117d6 = interfaceC7117d5;
                    ResultLesson resultLesson3 = (ResultLesson) objM18470l;
                    this.f19861k = interfaceC7117d6;
                    this.f19855e = lessonStudy5;
                    this.f19856f = list4;
                    this.f19857g = lessonStudyBookmark4;
                    this.f19860j = 7;
                    lessonRepositoryImpl.getClass();
                    interfaceC7117d7 = interfaceC7117d6;
                    objM4573a = RoomDatabaseKt.m4573a(lessonRepositoryImpl.f19827a, new LessonRepositoryImpl$storeLessonData$2(i11, resultLesson3, lessonRepositoryImpl, str, null), this);
                    if (objM4573a != coroutineSingletons) {
                        objM4573a = C9072e.f47360a;
                        break;
                    }
                    if (objM4573a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lessonStudyBookmark5 = lessonStudyBookmark4;
                    list5 = list4;
                    lessonStudy6 = lessonStudy5;
                    interfaceC7117d8 = interfaceC7117d7;
                    AbstractC1495o1 abstractC1495o8 = lessonRepositoryImpl.f19828b;
                    this.f19861k = interfaceC7117d8;
                    this.f19855e = lessonStudy6;
                    this.f19856f = list5;
                    this.f19857g = lessonStudyBookmark5;
                    this.f19860j = 8;
                    objMo5157w1 = abstractC1495o8.mo5157w0(i11, this);
                    if (objMo5157w1 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lessonStudy7 = (LessonStudy) objMo5157w1;
                    AbstractC1495o1 abstractC1495o9 = lessonRepositoryImpl.f19828b;
                    this.f19861k = interfaceC7117d8;
                    this.f19855e = lessonStudy6;
                    this.f19856f = list5;
                    this.f19857g = lessonStudyBookmark5;
                    this.f19858h = lessonStudy7;
                    this.f19860j = 9;
                    objMo5156v1 = abstractC1495o9.mo5156v0(i11, this);
                    if (objMo5156v1 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC7117d9 = interfaceC7117d8;
                    lessonStudy8 = lessonStudy6;
                    list6 = list5;
                    lessonStudyBookmark6 = lessonStudyBookmark5;
                    lessonStudy9 = lessonStudy7;
                    list7 = (List) objMo5156v1;
                    this.f19861k = interfaceC7117d9;
                    this.f19855e = lessonStudy8;
                    this.f19856f = list6;
                    this.f19857g = lessonStudyBookmark6;
                    this.f19858h = lessonStudy9;
                    this.f19859i = list7;
                    this.f19860j = 10;
                    objMo5150p1 = lessonRepositoryImpl.f19828b.mo5150p0(i11, this);
                    if (objMo5150p1 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lessonStudyBookmark7 = (LessonStudyBookmark) objMo5150p1;
                    if (lessonStudy9 != null) {
                        Resource.C3303a c3303a7 = Resource.f17861d;
                        Triple triple7 = new Triple(lessonStudy9, list7, lessonStudyBookmark7);
                        c3303a7.getClass();
                        resourceM9437c2 = Resource.C3303a.m9437c(triple7);
                        this.f19861k = interfaceC7117d9;
                        this.f19855e = lessonStudy8;
                        this.f19856f = list6;
                        this.f19857g = lessonStudyBookmark6;
                        this.f19858h = null;
                        this.f19859i = null;
                        this.f19860j = 11;
                        if (interfaceC7117d9.mo1339r(resourceM9437c2, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return C9072e.f47360a;
                case 3:
                    List list8 = this.f19856f;
                    LessonStudy lessonStudy10 = this.f19855e;
                    InterfaceC7117d interfaceC7117d11 = (InterfaceC7117d) this.f19861k;
                    C7499b.m14977z0(obj);
                    objMo5150p0 = obj;
                    list3 = list8;
                    interfaceC7117d4 = interfaceC7117d11;
                    lessonStudy4 = lessonStudy10;
                    lessonStudyBookmark = (LessonStudyBookmark) objMo5150p0;
                    if (obj2 == 0) {
                        Resource.C3303a c3303a8 = Resource.f17861d;
                        Triple triple8 = new Triple(lessonStudy4, list3, lessonStudyBookmark);
                        c3303a8.getClass();
                        resourceM9437c = Resource.C3303a.m9437c(triple8);
                        this.f19861k = interfaceC7117d4;
                        this.f19855e = lessonStudy4;
                        this.f19856f = list3;
                        this.f19857g = lessonStudyBookmark;
                        this.f19860j = 4;
                        if (interfaceC7117d4.mo1339r(resourceM9437c, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    interfaceC7117d5 = interfaceC7117d4;
                    lessonStudyBookmark2 = lessonStudyBookmark;
                    if (obj2 == 0) {
                    }
                    Resource.f17861d.getClass();
                    resource = new Resource(Resource.Status.LOADING, null, null);
                    this.f19861k = interfaceC7117d5;
                    this.f19855e = lessonStudy4;
                    this.f19856f = list3;
                    this.f19857g = lessonStudyBookmark2;
                    this.f19860j = 5;
                    if (interfaceC7117d5.mo1339r(resource, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lessonStudyBookmark3 = lessonStudyBookmark2;
                    InterfaceC9938f interfaceC9938f4 = lessonRepositoryImpl.f19832f;
                    Integer num4 = new Integer(i11);
                    this.f19861k = interfaceC7117d5;
                    this.f19855e = lessonStudy4;
                    this.f19856f = list3;
                    this.f19857g = lessonStudyBookmark3;
                    this.f19860j = 6;
                    objM18470l = interfaceC9938f4.m18470l(str, num4, false, this);
                    if (objM18470l == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lessonStudyBookmark4 = lessonStudyBookmark3;
                    list4 = list3;
                    lessonStudy5 = lessonStudy4;
                    interfaceC7117d6 = interfaceC7117d5;
                    ResultLesson resultLesson4 = (ResultLesson) objM18470l;
                    this.f19861k = interfaceC7117d6;
                    this.f19855e = lessonStudy5;
                    this.f19856f = list4;
                    this.f19857g = lessonStudyBookmark4;
                    this.f19860j = 7;
                    lessonRepositoryImpl.getClass();
                    interfaceC7117d7 = interfaceC7117d6;
                    objM4573a = RoomDatabaseKt.m4573a(lessonRepositoryImpl.f19827a, new LessonRepositoryImpl$storeLessonData$2(i11, resultLesson4, lessonRepositoryImpl, str, null), this);
                    if (objM4573a != coroutineSingletons) {
                        objM4573a = C9072e.f47360a;
                        break;
                    }
                    if (objM4573a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lessonStudyBookmark5 = lessonStudyBookmark4;
                    list5 = list4;
                    lessonStudy6 = lessonStudy5;
                    interfaceC7117d8 = interfaceC7117d7;
                    AbstractC1495o1 abstractC1495o10 = lessonRepositoryImpl.f19828b;
                    this.f19861k = interfaceC7117d8;
                    this.f19855e = lessonStudy6;
                    this.f19856f = list5;
                    this.f19857g = lessonStudyBookmark5;
                    this.f19860j = 8;
                    objMo5157w1 = abstractC1495o10.mo5157w0(i11, this);
                    if (objMo5157w1 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lessonStudy7 = (LessonStudy) objMo5157w1;
                    AbstractC1495o1 abstractC1495o11 = lessonRepositoryImpl.f19828b;
                    this.f19861k = interfaceC7117d8;
                    this.f19855e = lessonStudy6;
                    this.f19856f = list5;
                    this.f19857g = lessonStudyBookmark5;
                    this.f19858h = lessonStudy7;
                    this.f19860j = 9;
                    objMo5156v1 = abstractC1495o11.mo5156v0(i11, this);
                    if (objMo5156v1 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC7117d9 = interfaceC7117d8;
                    lessonStudy8 = lessonStudy6;
                    list6 = list5;
                    lessonStudyBookmark6 = lessonStudyBookmark5;
                    lessonStudy9 = lessonStudy7;
                    list7 = (List) objMo5156v1;
                    this.f19861k = interfaceC7117d9;
                    this.f19855e = lessonStudy8;
                    this.f19856f = list6;
                    this.f19857g = lessonStudyBookmark6;
                    this.f19858h = lessonStudy9;
                    this.f19859i = list7;
                    this.f19860j = 10;
                    objMo5150p1 = lessonRepositoryImpl.f19828b.mo5150p0(i11, this);
                    if (objMo5150p1 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lessonStudyBookmark7 = (LessonStudyBookmark) objMo5150p1;
                    if (lessonStudy9 != null) {
                        Resource.C3303a c3303a9 = Resource.f17861d;
                        Triple triple9 = new Triple(lessonStudy9, list7, lessonStudyBookmark7);
                        c3303a9.getClass();
                        resourceM9437c2 = Resource.C3303a.m9437c(triple9);
                        this.f19861k = interfaceC7117d9;
                        this.f19855e = lessonStudy8;
                        this.f19856f = list6;
                        this.f19857g = lessonStudyBookmark6;
                        this.f19858h = null;
                        this.f19859i = null;
                        this.f19860j = 11;
                        if (interfaceC7117d9.mo1339r(resourceM9437c2, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return C9072e.f47360a;
                case 4:
                    lessonStudyBookmark2 = this.f19857g;
                    list3 = this.f19856f;
                    lessonStudy4 = this.f19855e;
                    interfaceC7117d5 = (InterfaceC7117d) this.f19861k;
                    C7499b.m14977z0(obj);
                    if (obj2 == 0) {
                    }
                    Resource.f17861d.getClass();
                    resource = new Resource(Resource.Status.LOADING, null, null);
                    this.f19861k = interfaceC7117d5;
                    this.f19855e = lessonStudy4;
                    this.f19856f = list3;
                    this.f19857g = lessonStudyBookmark2;
                    this.f19860j = 5;
                    if (interfaceC7117d5.mo1339r(resource, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lessonStudyBookmark3 = lessonStudyBookmark2;
                    InterfaceC9938f interfaceC9938f5 = lessonRepositoryImpl.f19832f;
                    Integer num5 = new Integer(i11);
                    this.f19861k = interfaceC7117d5;
                    this.f19855e = lessonStudy4;
                    this.f19856f = list3;
                    this.f19857g = lessonStudyBookmark3;
                    this.f19860j = 6;
                    objM18470l = interfaceC9938f5.m18470l(str, num5, false, this);
                    if (objM18470l == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lessonStudyBookmark4 = lessonStudyBookmark3;
                    list4 = list3;
                    lessonStudy5 = lessonStudy4;
                    interfaceC7117d6 = interfaceC7117d5;
                    ResultLesson resultLesson5 = (ResultLesson) objM18470l;
                    this.f19861k = interfaceC7117d6;
                    this.f19855e = lessonStudy5;
                    this.f19856f = list4;
                    this.f19857g = lessonStudyBookmark4;
                    this.f19860j = 7;
                    lessonRepositoryImpl.getClass();
                    interfaceC7117d7 = interfaceC7117d6;
                    objM4573a = RoomDatabaseKt.m4573a(lessonRepositoryImpl.f19827a, new LessonRepositoryImpl$storeLessonData$2(i11, resultLesson5, lessonRepositoryImpl, str, null), this);
                    if (objM4573a != coroutineSingletons) {
                        objM4573a = C9072e.f47360a;
                        break;
                    }
                    if (objM4573a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lessonStudyBookmark5 = lessonStudyBookmark4;
                    list5 = list4;
                    lessonStudy6 = lessonStudy5;
                    interfaceC7117d8 = interfaceC7117d7;
                    AbstractC1495o1 abstractC1495o12 = lessonRepositoryImpl.f19828b;
                    this.f19861k = interfaceC7117d8;
                    this.f19855e = lessonStudy6;
                    this.f19856f = list5;
                    this.f19857g = lessonStudyBookmark5;
                    this.f19860j = 8;
                    objMo5157w1 = abstractC1495o12.mo5157w0(i11, this);
                    if (objMo5157w1 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lessonStudy7 = (LessonStudy) objMo5157w1;
                    AbstractC1495o1 abstractC1495o13 = lessonRepositoryImpl.f19828b;
                    this.f19861k = interfaceC7117d8;
                    this.f19855e = lessonStudy6;
                    this.f19856f = list5;
                    this.f19857g = lessonStudyBookmark5;
                    this.f19858h = lessonStudy7;
                    this.f19860j = 9;
                    objMo5156v1 = abstractC1495o13.mo5156v0(i11, this);
                    if (objMo5156v1 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC7117d9 = interfaceC7117d8;
                    lessonStudy8 = lessonStudy6;
                    list6 = list5;
                    lessonStudyBookmark6 = lessonStudyBookmark5;
                    lessonStudy9 = lessonStudy7;
                    list7 = (List) objMo5156v1;
                    this.f19861k = interfaceC7117d9;
                    this.f19855e = lessonStudy8;
                    this.f19856f = list6;
                    this.f19857g = lessonStudyBookmark6;
                    this.f19858h = lessonStudy9;
                    this.f19859i = list7;
                    this.f19860j = 10;
                    objMo5150p1 = lessonRepositoryImpl.f19828b.mo5150p0(i11, this);
                    if (objMo5150p1 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lessonStudyBookmark7 = (LessonStudyBookmark) objMo5150p1;
                    if (lessonStudy9 != null) {
                        Resource.C3303a c3303a10 = Resource.f17861d;
                        Triple triple10 = new Triple(lessonStudy9, list7, lessonStudyBookmark7);
                        c3303a10.getClass();
                        resourceM9437c2 = Resource.C3303a.m9437c(triple10);
                        this.f19861k = interfaceC7117d9;
                        this.f19855e = lessonStudy8;
                        this.f19856f = list6;
                        this.f19857g = lessonStudyBookmark6;
                        this.f19858h = null;
                        this.f19859i = null;
                        this.f19860j = 11;
                        if (interfaceC7117d9.mo1339r(resourceM9437c2, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return C9072e.f47360a;
                case 5:
                    lessonStudyBookmark2 = this.f19857g;
                    List list9 = this.f19856f;
                    LessonStudy lessonStudy11 = this.f19855e;
                    InterfaceC7117d interfaceC7117d12 = (InterfaceC7117d) this.f19861k;
                    C7499b.m14977z0(obj);
                    interfaceC7117d5 = interfaceC7117d12;
                    lessonStudy4 = lessonStudy11;
                    list3 = list9;
                    lessonStudyBookmark3 = lessonStudyBookmark2;
                    InterfaceC9938f interfaceC9938f6 = lessonRepositoryImpl.f19832f;
                    Integer num6 = new Integer(i11);
                    this.f19861k = interfaceC7117d5;
                    this.f19855e = lessonStudy4;
                    this.f19856f = list3;
                    this.f19857g = lessonStudyBookmark3;
                    this.f19860j = 6;
                    objM18470l = interfaceC9938f6.m18470l(str, num6, false, this);
                    if (objM18470l == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lessonStudyBookmark4 = lessonStudyBookmark3;
                    list4 = list3;
                    lessonStudy5 = lessonStudy4;
                    interfaceC7117d6 = interfaceC7117d5;
                    ResultLesson resultLesson6 = (ResultLesson) objM18470l;
                    this.f19861k = interfaceC7117d6;
                    this.f19855e = lessonStudy5;
                    this.f19856f = list4;
                    this.f19857g = lessonStudyBookmark4;
                    this.f19860j = 7;
                    lessonRepositoryImpl.getClass();
                    interfaceC7117d7 = interfaceC7117d6;
                    objM4573a = RoomDatabaseKt.m4573a(lessonRepositoryImpl.f19827a, new LessonRepositoryImpl$storeLessonData$2(i11, resultLesson6, lessonRepositoryImpl, str, null), this);
                    if (objM4573a != coroutineSingletons) {
                        objM4573a = C9072e.f47360a;
                        break;
                    }
                    if (objM4573a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lessonStudyBookmark5 = lessonStudyBookmark4;
                    list5 = list4;
                    lessonStudy6 = lessonStudy5;
                    interfaceC7117d8 = interfaceC7117d7;
                    AbstractC1495o1 abstractC1495o14 = lessonRepositoryImpl.f19828b;
                    this.f19861k = interfaceC7117d8;
                    this.f19855e = lessonStudy6;
                    this.f19856f = list5;
                    this.f19857g = lessonStudyBookmark5;
                    this.f19860j = 8;
                    objMo5157w1 = abstractC1495o14.mo5157w0(i11, this);
                    if (objMo5157w1 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lessonStudy7 = (LessonStudy) objMo5157w1;
                    AbstractC1495o1 abstractC1495o15 = lessonRepositoryImpl.f19828b;
                    this.f19861k = interfaceC7117d8;
                    this.f19855e = lessonStudy6;
                    this.f19856f = list5;
                    this.f19857g = lessonStudyBookmark5;
                    this.f19858h = lessonStudy7;
                    this.f19860j = 9;
                    objMo5156v1 = abstractC1495o15.mo5156v0(i11, this);
                    if (objMo5156v1 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC7117d9 = interfaceC7117d8;
                    lessonStudy8 = lessonStudy6;
                    list6 = list5;
                    lessonStudyBookmark6 = lessonStudyBookmark5;
                    lessonStudy9 = lessonStudy7;
                    list7 = (List) objMo5156v1;
                    this.f19861k = interfaceC7117d9;
                    this.f19855e = lessonStudy8;
                    this.f19856f = list6;
                    this.f19857g = lessonStudyBookmark6;
                    this.f19858h = lessonStudy9;
                    this.f19859i = list7;
                    this.f19860j = 10;
                    objMo5150p1 = lessonRepositoryImpl.f19828b.mo5150p0(i11, this);
                    if (objMo5150p1 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lessonStudyBookmark7 = (LessonStudyBookmark) objMo5150p1;
                    if (lessonStudy9 != null) {
                        Resource.C3303a c3303a11 = Resource.f17861d;
                        Triple triple11 = new Triple(lessonStudy9, list7, lessonStudyBookmark7);
                        c3303a11.getClass();
                        resourceM9437c2 = Resource.C3303a.m9437c(triple11);
                        this.f19861k = interfaceC7117d9;
                        this.f19855e = lessonStudy8;
                        this.f19856f = list6;
                        this.f19857g = lessonStudyBookmark6;
                        this.f19858h = null;
                        this.f19859i = null;
                        this.f19860j = 11;
                        if (interfaceC7117d9.mo1339r(resourceM9437c2, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return C9072e.f47360a;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    lessonStudyBookmark3 = this.f19857g;
                    list3 = this.f19856f;
                    lessonStudy4 = this.f19855e;
                    interfaceC7117d5 = (InterfaceC7117d) this.f19861k;
                    C7499b.m14977z0(obj);
                    objM18470l = obj;
                    lessonStudyBookmark4 = lessonStudyBookmark3;
                    list4 = list3;
                    lessonStudy5 = lessonStudy4;
                    interfaceC7117d6 = interfaceC7117d5;
                    ResultLesson resultLesson7 = (ResultLesson) objM18470l;
                    this.f19861k = interfaceC7117d6;
                    this.f19855e = lessonStudy5;
                    this.f19856f = list4;
                    this.f19857g = lessonStudyBookmark4;
                    this.f19860j = 7;
                    lessonRepositoryImpl.getClass();
                    interfaceC7117d7 = interfaceC7117d6;
                    objM4573a = RoomDatabaseKt.m4573a(lessonRepositoryImpl.f19827a, new LessonRepositoryImpl$storeLessonData$2(i11, resultLesson7, lessonRepositoryImpl, str, null), this);
                    if (objM4573a != coroutineSingletons) {
                        objM4573a = C9072e.f47360a;
                        break;
                    }
                    if (objM4573a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lessonStudyBookmark5 = lessonStudyBookmark4;
                    list5 = list4;
                    lessonStudy6 = lessonStudy5;
                    interfaceC7117d8 = interfaceC7117d7;
                    AbstractC1495o1 abstractC1495o16 = lessonRepositoryImpl.f19828b;
                    this.f19861k = interfaceC7117d8;
                    this.f19855e = lessonStudy6;
                    this.f19856f = list5;
                    this.f19857g = lessonStudyBookmark5;
                    this.f19860j = 8;
                    objMo5157w1 = abstractC1495o16.mo5157w0(i11, this);
                    if (objMo5157w1 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lessonStudy7 = (LessonStudy) objMo5157w1;
                    AbstractC1495o1 abstractC1495o17 = lessonRepositoryImpl.f19828b;
                    this.f19861k = interfaceC7117d8;
                    this.f19855e = lessonStudy6;
                    this.f19856f = list5;
                    this.f19857g = lessonStudyBookmark5;
                    this.f19858h = lessonStudy7;
                    this.f19860j = 9;
                    objMo5156v1 = abstractC1495o17.mo5156v0(i11, this);
                    if (objMo5156v1 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC7117d9 = interfaceC7117d8;
                    lessonStudy8 = lessonStudy6;
                    list6 = list5;
                    lessonStudyBookmark6 = lessonStudyBookmark5;
                    lessonStudy9 = lessonStudy7;
                    list7 = (List) objMo5156v1;
                    this.f19861k = interfaceC7117d9;
                    this.f19855e = lessonStudy8;
                    this.f19856f = list6;
                    this.f19857g = lessonStudyBookmark6;
                    this.f19858h = lessonStudy9;
                    this.f19859i = list7;
                    this.f19860j = 10;
                    objMo5150p1 = lessonRepositoryImpl.f19828b.mo5150p0(i11, this);
                    if (objMo5150p1 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lessonStudyBookmark7 = (LessonStudyBookmark) objMo5150p1;
                    if (lessonStudy9 != null) {
                        Resource.C3303a c3303a12 = Resource.f17861d;
                        Triple triple12 = new Triple(lessonStudy9, list7, lessonStudyBookmark7);
                        c3303a12.getClass();
                        resourceM9437c2 = Resource.C3303a.m9437c(triple12);
                        this.f19861k = interfaceC7117d9;
                        this.f19855e = lessonStudy8;
                        this.f19856f = list6;
                        this.f19857g = lessonStudyBookmark6;
                        this.f19858h = null;
                        this.f19859i = null;
                        this.f19860j = 11;
                        if (interfaceC7117d9.mo1339r(resourceM9437c2, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return C9072e.f47360a;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    lessonStudyBookmark5 = this.f19857g;
                    list5 = this.f19856f;
                    lessonStudy6 = this.f19855e;
                    interfaceC7117d8 = (InterfaceC7117d) this.f19861k;
                    C7499b.m14977z0(obj);
                    AbstractC1495o1 abstractC1495o18 = lessonRepositoryImpl.f19828b;
                    this.f19861k = interfaceC7117d8;
                    this.f19855e = lessonStudy6;
                    this.f19856f = list5;
                    this.f19857g = lessonStudyBookmark5;
                    this.f19860j = 8;
                    objMo5157w1 = abstractC1495o18.mo5157w0(i11, this);
                    if (objMo5157w1 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lessonStudy7 = (LessonStudy) objMo5157w1;
                    AbstractC1495o1 abstractC1495o19 = lessonRepositoryImpl.f19828b;
                    this.f19861k = interfaceC7117d8;
                    this.f19855e = lessonStudy6;
                    this.f19856f = list5;
                    this.f19857g = lessonStudyBookmark5;
                    this.f19858h = lessonStudy7;
                    this.f19860j = 9;
                    objMo5156v1 = abstractC1495o19.mo5156v0(i11, this);
                    if (objMo5156v1 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC7117d9 = interfaceC7117d8;
                    lessonStudy8 = lessonStudy6;
                    list6 = list5;
                    lessonStudyBookmark6 = lessonStudyBookmark5;
                    lessonStudy9 = lessonStudy7;
                    list7 = (List) objMo5156v1;
                    this.f19861k = interfaceC7117d9;
                    this.f19855e = lessonStudy8;
                    this.f19856f = list6;
                    this.f19857g = lessonStudyBookmark6;
                    this.f19858h = lessonStudy9;
                    this.f19859i = list7;
                    this.f19860j = 10;
                    objMo5150p1 = lessonRepositoryImpl.f19828b.mo5150p0(i11, this);
                    if (objMo5150p1 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lessonStudyBookmark7 = (LessonStudyBookmark) objMo5150p1;
                    if (lessonStudy9 != null) {
                        Resource.C3303a c3303a13 = Resource.f17861d;
                        Triple triple13 = new Triple(lessonStudy9, list7, lessonStudyBookmark7);
                        c3303a13.getClass();
                        resourceM9437c2 = Resource.C3303a.m9437c(triple13);
                        this.f19861k = interfaceC7117d9;
                        this.f19855e = lessonStudy8;
                        this.f19856f = list6;
                        this.f19857g = lessonStudyBookmark6;
                        this.f19858h = null;
                        this.f19859i = null;
                        this.f19860j = 11;
                        if (interfaceC7117d9.mo1339r(resourceM9437c2, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return C9072e.f47360a;
                case 8:
                    lessonStudyBookmark5 = this.f19857g;
                    list5 = this.f19856f;
                    lessonStudy6 = this.f19855e;
                    interfaceC7117d8 = (InterfaceC7117d) this.f19861k;
                    C7499b.m14977z0(obj);
                    objMo5157w1 = obj;
                    lessonStudy7 = (LessonStudy) objMo5157w1;
                    AbstractC1495o1 abstractC1495o110 = lessonRepositoryImpl.f19828b;
                    this.f19861k = interfaceC7117d8;
                    this.f19855e = lessonStudy6;
                    this.f19856f = list5;
                    this.f19857g = lessonStudyBookmark5;
                    this.f19858h = lessonStudy7;
                    this.f19860j = 9;
                    objMo5156v1 = abstractC1495o110.mo5156v0(i11, this);
                    if (objMo5156v1 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC7117d9 = interfaceC7117d8;
                    lessonStudy8 = lessonStudy6;
                    list6 = list5;
                    lessonStudyBookmark6 = lessonStudyBookmark5;
                    lessonStudy9 = lessonStudy7;
                    list7 = (List) objMo5156v1;
                    this.f19861k = interfaceC7117d9;
                    this.f19855e = lessonStudy8;
                    this.f19856f = list6;
                    this.f19857g = lessonStudyBookmark6;
                    this.f19858h = lessonStudy9;
                    this.f19859i = list7;
                    this.f19860j = 10;
                    objMo5150p1 = lessonRepositoryImpl.f19828b.mo5150p0(i11, this);
                    if (objMo5150p1 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lessonStudyBookmark7 = (LessonStudyBookmark) objMo5150p1;
                    if (lessonStudy9 != null) {
                        Resource.C3303a c3303a14 = Resource.f17861d;
                        Triple triple14 = new Triple(lessonStudy9, list7, lessonStudyBookmark7);
                        c3303a14.getClass();
                        resourceM9437c2 = Resource.C3303a.m9437c(triple14);
                        this.f19861k = interfaceC7117d9;
                        this.f19855e = lessonStudy8;
                        this.f19856f = list6;
                        this.f19857g = lessonStudyBookmark6;
                        this.f19858h = null;
                        this.f19859i = null;
                        this.f19860j = 11;
                        if (interfaceC7117d9.mo1339r(resourceM9437c2, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return C9072e.f47360a;
                case 9:
                    lessonStudy7 = this.f19858h;
                    lessonStudyBookmark5 = this.f19857g;
                    list5 = this.f19856f;
                    lessonStudy6 = this.f19855e;
                    interfaceC7117d8 = (InterfaceC7117d) this.f19861k;
                    C7499b.m14977z0(obj);
                    objMo5156v1 = obj;
                    interfaceC7117d9 = interfaceC7117d8;
                    lessonStudy8 = lessonStudy6;
                    list6 = list5;
                    lessonStudyBookmark6 = lessonStudyBookmark5;
                    lessonStudy9 = lessonStudy7;
                    list7 = (List) objMo5156v1;
                    this.f19861k = interfaceC7117d9;
                    this.f19855e = lessonStudy8;
                    this.f19856f = list6;
                    this.f19857g = lessonStudyBookmark6;
                    this.f19858h = lessonStudy9;
                    this.f19859i = list7;
                    this.f19860j = 10;
                    objMo5150p1 = lessonRepositoryImpl.f19828b.mo5150p0(i11, this);
                    if (objMo5150p1 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lessonStudyBookmark7 = (LessonStudyBookmark) objMo5150p1;
                    if (lessonStudy9 != null) {
                        Resource.C3303a c3303a15 = Resource.f17861d;
                        Triple triple15 = new Triple(lessonStudy9, list7, lessonStudyBookmark7);
                        c3303a15.getClass();
                        resourceM9437c2 = Resource.C3303a.m9437c(triple15);
                        this.f19861k = interfaceC7117d9;
                        this.f19855e = lessonStudy8;
                        this.f19856f = list6;
                        this.f19857g = lessonStudyBookmark6;
                        this.f19858h = null;
                        this.f19859i = null;
                        this.f19860j = 11;
                        if (interfaceC7117d9.mo1339r(resourceM9437c2, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return C9072e.f47360a;
                case 10:
                    list7 = this.f19859i;
                    lessonStudy9 = this.f19858h;
                    lessonStudyBookmark6 = this.f19857g;
                    list6 = this.f19856f;
                    lessonStudy8 = this.f19855e;
                    interfaceC7117d10 = (InterfaceC7117d) this.f19861k;
                    try {
                        C7499b.m14977z0(obj);
                        interfaceC7117d9 = interfaceC7117d10;
                        objMo5150p1 = obj;
                        lessonStudyBookmark7 = (LessonStudyBookmark) objMo5150p1;
                        if (lessonStudy9 != null) {
                            Resource.C3303a c3303a16 = Resource.f17861d;
                            Triple triple16 = new Triple(lessonStudy9, list7, lessonStudyBookmark7);
                            c3303a16.getClass();
                            resourceM9437c2 = Resource.C3303a.m9437c(triple16);
                            this.f19861k = interfaceC7117d9;
                            this.f19855e = lessonStudy8;
                            this.f19856f = list6;
                            this.f19857g = lessonStudyBookmark6;
                            this.f19858h = null;
                            this.f19859i = null;
                            this.f19860j = 11;
                            if (interfaceC7117d9.mo1339r(resourceM9437c2, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    } catch (Exception e14) {
                        e = e14;
                        obj2 = lessonStudyBookmark6;
                        list = list6;
                        lessonStudy = lessonStudy8;
                        interfaceC7117d = interfaceC7117d10;
                        if (lessonStudy == null) {
                            resourceM9436b = Resource.C3303a.m9436b(Resource.f17861d, e);
                            this.f19861k = null;
                            this.f19855e = null;
                            this.f19856f = null;
                            this.f19857g = null;
                            this.f19858h = null;
                            this.f19859i = null;
                            this.f19860j = 13;
                            if (interfaceC7117d.mo1339r(resourceM9436b, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            resourceM9436b = Resource.C3303a.m9436b(Resource.f17861d, e);
                            this.f19861k = null;
                            this.f19855e = null;
                            this.f19856f = null;
                            this.f19857g = null;
                            this.f19858h = null;
                            this.f19859i = null;
                            this.f19860j = 13;
                            if (interfaceC7117d.mo1339r(resourceM9436b, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        return C9072e.f47360a;
                    }
                    return C9072e.f47360a;
                case 11:
                    LessonStudyBookmark lessonStudyBookmark8 = this.f19857g;
                    List list10 = this.f19856f;
                    LessonStudy lessonStudy12 = this.f19855e;
                    C7499b.m14977z0(obj);
                    return C9072e.f47360a;
                case 12:
                case 13:
                    C7499b.m14977z0(obj);
                    return C9072e.f47360a;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Exception e15) {
            e = e15;
        }
    }
}
