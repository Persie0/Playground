package com.lingq.shared.repository;

import ae.C0062b;
import androidx.room.RoomDatabaseKt;
import androidx.work.BackoffPolicy;
import androidx.work.C1244b;
import androidx.work.NetworkType;
import bi.AbstractC1413d0;
import bi.AbstractC1454i2;
import ci.InterfaceC2010c;
import com.lingq.entity.LibraryCounter;
import com.lingq.entity.LibraryData;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.network.result.ResultLibraryItem;
import com.lingq.shared.network.result.Results;
import com.lingq.shared.network.workers.CourseDeleteRoseWorker;
import com.lingq.shared.network.workers.CourseGiveRoseWorker;
import com.lingq.shared.persistent.LingQDatabase;
import com.lingq.shared.uimodel.language.UserCourseForImport;
import com.lingq.shared.uimodel.library.LibraryItemType;
import dm.C5206f;
import dm.C5207g;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import ki.C6697c;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.InterfaceC7116c;
import p026b5.AbstractC1317j;
import p026b5.C1309b;
import p026b5.C1315h;
import p260m8.C7499b;
import p264mi.C7565e;
import p460wh.InterfaceC9935c;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class CourseRepositoryImpl implements InterfaceC2010c {

    /* JADX INFO: renamed from: a */
    public final LingQDatabase f19591a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1413d0 f19592b;

    /* JADX INFO: renamed from: c */
    public final AbstractC1454i2 f19593c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC9935c f19594d;

    /* JADX INFO: renamed from: e */
    public final AbstractC1317j f19595e;

    public CourseRepositoryImpl(LingQDatabase lingQDatabase, AbstractC1413d0 abstractC1413d0, AbstractC1454i2 abstractC1454i2, InterfaceC9935c interfaceC9935c, AbstractC1317j abstractC1317j) {
        C5207g.m11111f(lingQDatabase, "db");
        C5207g.m11111f(abstractC1413d0, "courseDao");
        C5207g.m11111f(abstractC1454i2, "libraryDao");
        C5207g.m11111f(interfaceC9935c, "courseService");
        C5207g.m11111f(abstractC1317j, "workManager");
        this.f19591a = lingQDatabase;
        this.f19592b = abstractC1413d0;
        this.f19593c = abstractC1454i2;
        this.f19594d = interfaceC9935c;
        this.f19595e = abstractC1317j;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009a  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // ci.InterfaceC2010c
    /* JADX INFO: renamed from: a */
    public final Object mo5992a(int i10, String str, InterfaceC9968c interfaceC9968c) throws Throwable {
        CourseRepositoryImpl$networkCourse$1 courseRepositoryImpl$networkCourse$1;
        CourseRepositoryImpl courseRepositoryImpl;
        ResultLibraryItem resultLibraryItem;
        ResultLibraryItem resultLibraryItem2;
        if (interfaceC9968c instanceof CourseRepositoryImpl$networkCourse$1) {
            courseRepositoryImpl$networkCourse$1 = (CourseRepositoryImpl$networkCourse$1) interfaceC9968c;
            int i11 = courseRepositoryImpl$networkCourse$1.f19608g;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                courseRepositoryImpl$networkCourse$1.f19608g = i11 - Integer.MIN_VALUE;
            } else {
                courseRepositoryImpl$networkCourse$1 = new CourseRepositoryImpl$networkCourse$1(this, interfaceC9968c);
            }
        } else {
            courseRepositoryImpl$networkCourse$1 = new CourseRepositoryImpl$networkCourse$1(this, interfaceC9968c);
        }
        Object objM18432a = courseRepositoryImpl$networkCourse$1.f19606e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = courseRepositoryImpl$networkCourse$1.f19608g;
        if (i12 != 0) {
            if (i12 == 1) {
                courseRepositoryImpl = (CourseRepositoryImpl) courseRepositoryImpl$networkCourse$1.f19605d;
                C7499b.m14977z0(objM18432a);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                resultLibraryItem2 = (ResultLibraryItem) courseRepositoryImpl$networkCourse$1.f19605d;
                C7499b.m14977z0(objM18432a);
            }
            C5206f.m11026v0(((Number) objM18432a).longValue());
            resultLibraryItem = resultLibraryItem2;
            return new Integer(resultLibraryItem == null ? 0 : 1);
        }
        C7499b.m14977z0(objM18432a);
        Integer num = new Integer(i10);
        courseRepositoryImpl$networkCourse$1.f19605d = this;
        courseRepositoryImpl$networkCourse$1.f19608g = 1;
        objM18432a = this.f19594d.m18432a(str, num, courseRepositoryImpl$networkCourse$1);
        if (objM18432a == coroutineSingletons) {
            return coroutineSingletons;
        }
        courseRepositoryImpl = this;
        resultLibraryItem = (ResultLibraryItem) objM18432a;
        if (resultLibraryItem != null) {
            LibraryData libraryDataM294O = C0062b.m294O(resultLibraryItem);
            AbstractC1413d0 abstractC1413d0 = courseRepositoryImpl.f19592b;
            courseRepositoryImpl$networkCourse$1.f19605d = resultLibraryItem;
            courseRepositoryImpl$networkCourse$1.f19608g = 2;
            objM18432a = abstractC1413d0.mo598h0(libraryDataM294O, courseRepositoryImpl$networkCourse$1);
            if (objM18432a == coroutineSingletons) {
                return coroutineSingletons;
            }
            resultLibraryItem2 = resultLibraryItem;
            C5206f.m11026v0(((Number) objM18432a).longValue());
            resultLibraryItem = resultLibraryItem2;
        }
        return new Integer(resultLibraryItem == null ? 0 : 1);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // ci.InterfaceC2010c
    /* JADX INFO: renamed from: b */
    public final Object mo5993b(String str, InterfaceC9968c<? super Integer> interfaceC9968c) throws Throwable {
        CourseRepositoryImpl$networkVocabularyCourses$1 courseRepositoryImpl$networkVocabularyCourses$1;
        CourseRepositoryImpl courseRepositoryImpl;
        Results results;
        Results results2;
        List<? extends ResultType> list;
        int size;
        if (interfaceC9968c instanceof CourseRepositoryImpl$networkVocabularyCourses$1) {
            courseRepositoryImpl$networkVocabularyCourses$1 = (CourseRepositoryImpl$networkVocabularyCourses$1) interfaceC9968c;
            int i10 = courseRepositoryImpl$networkVocabularyCourses$1.f19613h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                courseRepositoryImpl$networkVocabularyCourses$1.f19613h = i10 - Integer.MIN_VALUE;
            } else {
                courseRepositoryImpl$networkVocabularyCourses$1 = new CourseRepositoryImpl$networkVocabularyCourses$1(this, interfaceC9968c);
            }
        } else {
            courseRepositoryImpl$networkVocabularyCourses$1 = new CourseRepositoryImpl$networkVocabularyCourses$1(this, interfaceC9968c);
        }
        Object objM18433b = courseRepositoryImpl$networkVocabularyCourses$1.f19611f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = courseRepositoryImpl$networkVocabularyCourses$1.f19613h;
        if (i11 != 0) {
            if (i11 == 1) {
                str = courseRepositoryImpl$networkVocabularyCourses$1.f19610e;
                courseRepositoryImpl = (CourseRepositoryImpl) courseRepositoryImpl$networkVocabularyCourses$1.f19609d;
                C7499b.m14977z0(objM18433b);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                results2 = (Results) courseRepositoryImpl$networkVocabularyCourses$1.f19609d;
                C7499b.m14977z0(objM18433b);
            }
            results = results2;
            list = results.f19136d;
            if (list != 0) {
                size = list.size();
            } else {
                size = 0;
            }
            return new Integer(size);
        }
        C7499b.m14977z0(objM18433b);
        InterfaceC9935c interfaceC9935c = this.f19594d;
        courseRepositoryImpl$networkVocabularyCourses$1.f19609d = this;
        courseRepositoryImpl$networkVocabularyCourses$1.f19610e = str;
        courseRepositoryImpl$networkVocabularyCourses$1.f19613h = 1;
        objM18433b = interfaceC9935c.m18433b(str, 1, 50, "collection", "my_lessons", courseRepositoryImpl$networkVocabularyCourses$1);
        if (objM18433b == coroutineSingletons) {
            return coroutineSingletons;
        }
        courseRepositoryImpl = this;
        results = (Results) objM18433b;
        List<? extends ResultType> list2 = results.f19136d;
        if (list2 != 0) {
            LingQDatabase lingQDatabase = courseRepositoryImpl.f19591a;
            CourseRepositoryImpl$networkVocabularyCourses$2$1 courseRepositoryImpl$networkVocabularyCourses$2$1 = new CourseRepositoryImpl$networkVocabularyCourses$2$1(list2, courseRepositoryImpl, str, null);
            courseRepositoryImpl$networkVocabularyCourses$1.f19609d = results;
            courseRepositoryImpl$networkVocabularyCourses$1.f19610e = null;
            courseRepositoryImpl$networkVocabularyCourses$1.f19613h = 2;
            if (RoomDatabaseKt.m4573a(lingQDatabase, courseRepositoryImpl$networkVocabularyCourses$2$1, courseRepositoryImpl$networkVocabularyCourses$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            results2 = results;
            results = results2;
        }
        list = results.f19136d;
        if (list != 0) {
            size = list.size();
        } else {
            size = 0;
        }
        return new Integer(size);
    }

    @Override // ci.InterfaceC2010c
    /* JADX INFO: renamed from: c */
    public final InterfaceC7116c mo5994c(String str) {
        return C0062b.m273H0(this.f19592b.mo5019o0(str, LibraryItemType.Collection.getValue()));
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00f4 A[LOOP:1: B:31:0x00f2->B:32:0x00f4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x0188 A[LOOP:0: B:39:0x0186->B:40:0x0188, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ci.InterfaceC2010c
    /* JADX INFO: renamed from: d */
    public final Object mo5995d(int i10, String str, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        CourseRepositoryImpl$updateCourseLike$1 courseRepositoryImpl$updateCourseLike$1;
        String str2;
        CourseRepositoryImpl courseRepositoryImpl;
        String str3;
        CourseRepositoryImpl courseRepositoryImpl2;
        String str4;
        CourseRepositoryImpl courseRepositoryImpl3;
        Pair[] pairArr;
        C1244b.a aVar;
        Pair[] pairArr2;
        C1244b.a aVar2;
        int i11 = i10;
        if (interfaceC9968c instanceof CourseRepositoryImpl$updateCourseLike$1) {
            courseRepositoryImpl$updateCourseLike$1 = (CourseRepositoryImpl$updateCourseLike$1) interfaceC9968c;
            int i12 = courseRepositoryImpl$updateCourseLike$1.f19624i;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                courseRepositoryImpl$updateCourseLike$1.f19624i = i12 - Integer.MIN_VALUE;
            } else {
                courseRepositoryImpl$updateCourseLike$1 = new CourseRepositoryImpl$updateCourseLike$1(this, interfaceC9968c);
            }
        } else {
            courseRepositoryImpl$updateCourseLike$1 = new CourseRepositoryImpl$updateCourseLike$1(this, interfaceC9968c);
        }
        Object objMo5082z0 = courseRepositoryImpl$updateCourseLike$1.f19622g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i13 = courseRepositoryImpl$updateCourseLike$1.f19624i;
        int i14 = 0;
        if (i13 == 0) {
            C7499b.m14977z0(objMo5082z0);
            String value = LibraryItemType.Collection.getValue();
            courseRepositoryImpl$updateCourseLike$1.f19619d = this;
            str2 = str;
            courseRepositoryImpl$updateCourseLike$1.f19620e = str2;
            courseRepositoryImpl$updateCourseLike$1.f19621f = i11;
            courseRepositoryImpl$updateCourseLike$1.f19624i = 1;
            objMo5082z0 = this.f19593c.mo5082z0(i11, value, courseRepositoryImpl$updateCourseLike$1);
            if (objMo5082z0 == coroutineSingletons) {
                return coroutineSingletons;
            }
            courseRepositoryImpl = this;
        } else {
            if (i13 != 1) {
                if (i13 == 2) {
                    i11 = courseRepositoryImpl$updateCourseLike$1.f19621f;
                    str4 = courseRepositoryImpl$updateCourseLike$1.f19620e;
                    courseRepositoryImpl3 = courseRepositoryImpl$updateCourseLike$1.f19619d;
                    C7499b.m14977z0(objMo5082z0);
                    courseRepositoryImpl3.getClass();
                    NetworkType networkType = NetworkType.NOT_REQUIRED;
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    NetworkType networkType2 = NetworkType.CONNECTED;
                    C5207g.m11111f(networkType2, "networkType");
                    C1309b c1309b = new C1309b(networkType2, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet));
                    C1315h.a aVar3 = (C1315h.a) new C1315h.a(CourseDeleteRoseWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
                    aVar3.f8071c.f37533j = c1309b;
                    pairArr = new Pair[]{new Pair("language", str4), new Pair("collectionId", Integer.valueOf(i11))};
                    aVar = new C1244b.a();
                    while (i14 < 2) {
                        Pair pair = pairArr[i14];
                        aVar.m4709b(pair.f38013b, (String) pair.f38012a);
                        i14++;
                    }
                    aVar3.f8071c.f37528e = aVar.m4708a();
                    courseRepositoryImpl3.f19595e.m4877b(aVar3.m4879a());
                    return C9072e.f47360a;
                }
                if (i13 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i11 = courseRepositoryImpl$updateCourseLike$1.f19621f;
                str3 = courseRepositoryImpl$updateCourseLike$1.f19620e;
                courseRepositoryImpl2 = courseRepositoryImpl$updateCourseLike$1.f19619d;
                C7499b.m14977z0(objMo5082z0);
                courseRepositoryImpl2.getClass();
                NetworkType networkType3 = NetworkType.NOT_REQUIRED;
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                NetworkType networkType4 = NetworkType.CONNECTED;
                C5207g.m11111f(networkType4, "networkType");
                C1309b c1309b2 = new C1309b(networkType4, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet2));
                C1315h.a aVar4 = (C1315h.a) new C1315h.a(CourseGiveRoseWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
                aVar4.f8071c.f37533j = c1309b2;
                pairArr2 = new Pair[]{new Pair("language", str3), new Pair("collectionId", Integer.valueOf(i11))};
                aVar2 = new C1244b.a();
                while (i14 < 2) {
                    Pair pair2 = pairArr2[i14];
                    aVar2.m4709b(pair2.f38013b, (String) pair2.f38012a);
                    i14++;
                }
                aVar4.f8071c.f37528e = aVar2.m4708a();
                courseRepositoryImpl2.f19595e.m4877b(aVar4.m4879a());
                return C9072e.f47360a;
            }
            i11 = courseRepositoryImpl$updateCourseLike$1.f19621f;
            str2 = courseRepositoryImpl$updateCourseLike$1.f19620e;
            courseRepositoryImpl = courseRepositoryImpl$updateCourseLike$1.f19619d;
            C7499b.m14977z0(objMo5082z0);
        }
        LibraryCounter libraryCounter = (LibraryCounter) objMo5082z0;
        if (libraryCounter != null) {
            if (libraryCounter.f17202c) {
                libraryCounter.f17202c = false;
                libraryCounter.f17208i--;
                AbstractC1454i2 abstractC1454i2 = courseRepositoryImpl.f19593c;
                courseRepositoryImpl$updateCourseLike$1.f19619d = courseRepositoryImpl;
                courseRepositoryImpl$updateCourseLike$1.f19620e = str2;
                courseRepositoryImpl$updateCourseLike$1.f19621f = i11;
                courseRepositoryImpl$updateCourseLike$1.f19624i = 2;
                if (abstractC1454i2.mo5066Q0(libraryCounter, courseRepositoryImpl$updateCourseLike$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str4 = str2;
                courseRepositoryImpl3 = courseRepositoryImpl;
                courseRepositoryImpl3.getClass();
                NetworkType networkType5 = NetworkType.NOT_REQUIRED;
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                NetworkType networkType6 = NetworkType.CONNECTED;
                C5207g.m11111f(networkType6, "networkType");
                C1309b c1309b3 = new C1309b(networkType6, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet3));
                C1315h.a aVar5 = (C1315h.a) new C1315h.a(CourseDeleteRoseWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
                aVar5.f8071c.f37533j = c1309b3;
                pairArr = new Pair[]{new Pair("language", str4), new Pair("collectionId", Integer.valueOf(i11))};
                aVar = new C1244b.a();
                while (i14 < 2) {
                    Pair pair3 = pairArr[i14];
                    aVar.m4709b(pair3.f38013b, (String) pair3.f38012a);
                    i14++;
                }
                aVar5.f8071c.f37528e = aVar.m4708a();
                courseRepositoryImpl3.f19595e.m4877b(aVar5.m4879a());
            } else {
                libraryCounter.f17202c = true;
                libraryCounter.f17208i++;
                AbstractC1454i2 abstractC1454i3 = courseRepositoryImpl.f19593c;
                courseRepositoryImpl$updateCourseLike$1.f19619d = courseRepositoryImpl;
                courseRepositoryImpl$updateCourseLike$1.f19620e = str2;
                courseRepositoryImpl$updateCourseLike$1.f19621f = i11;
                courseRepositoryImpl$updateCourseLike$1.f19624i = 3;
                if (abstractC1454i3.mo5066Q0(libraryCounter, courseRepositoryImpl$updateCourseLike$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str3 = str2;
                courseRepositoryImpl2 = courseRepositoryImpl;
                courseRepositoryImpl2.getClass();
                NetworkType networkType7 = NetworkType.NOT_REQUIRED;
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                NetworkType networkType8 = NetworkType.CONNECTED;
                C5207g.m11111f(networkType8, "networkType");
                C1309b c1309b4 = new C1309b(networkType8, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet4));
                C1315h.a aVar6 = (C1315h.a) new C1315h.a(CourseGiveRoseWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
                aVar6.f8071c.f37533j = c1309b4;
                pairArr2 = new Pair[]{new Pair("language", str3), new Pair("collectionId", Integer.valueOf(i11))};
                aVar2 = new C1244b.a();
                while (i14 < 2) {
                    Pair pair4 = pairArr2[i14];
                    aVar2.m4709b(pair4.f38013b, (String) pair4.f38012a);
                    i14++;
                }
                aVar6.f8071c.f37528e = aVar2.m4708a();
                courseRepositoryImpl2.f19595e.m4877b(aVar6.m4879a());
            }
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // ci.InterfaceC2010c
    /* JADX INFO: renamed from: e */
    public final Object mo5996e(String str, InterfaceC9968c<? super Resource<? extends List<UserCourseForImport>>> interfaceC9968c) throws Throwable {
        CourseRepositoryImpl$loadMyCourses$1 courseRepositoryImpl$loadMyCourses$1;
        CourseRepositoryImpl courseRepositoryImpl;
        Resource.C3303a c3303a;
        Object objMo5017m0;
        Resource.C3303a c3303a2;
        if (interfaceC9968c instanceof CourseRepositoryImpl$loadMyCourses$1) {
            courseRepositoryImpl$loadMyCourses$1 = (CourseRepositoryImpl$loadMyCourses$1) interfaceC9968c;
            int i10 = courseRepositoryImpl$loadMyCourses$1.f19600h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                courseRepositoryImpl$loadMyCourses$1.f19600h = i10 - Integer.MIN_VALUE;
            } else {
                courseRepositoryImpl$loadMyCourses$1 = new CourseRepositoryImpl$loadMyCourses$1(this, interfaceC9968c);
            }
        } else {
            courseRepositoryImpl$loadMyCourses$1 = new CourseRepositoryImpl$loadMyCourses$1(this, interfaceC9968c);
        }
        Object objM18435d = courseRepositoryImpl$loadMyCourses$1.f19598f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = courseRepositoryImpl$loadMyCourses$1.f19600h;
        if (i11 != 0) {
            if (i11 == 1) {
                str = courseRepositoryImpl$loadMyCourses$1.f19597e;
                courseRepositoryImpl = (CourseRepositoryImpl) courseRepositoryImpl$loadMyCourses$1.f19596d;
                C7499b.m14977z0(objM18435d);
            } else if (i11 == 2) {
                str = courseRepositoryImpl$loadMyCourses$1.f19597e;
                courseRepositoryImpl = (CourseRepositoryImpl) courseRepositoryImpl$loadMyCourses$1.f19596d;
                C7499b.m14977z0(objM18435d);
                c3303a = Resource.f17861d;
                AbstractC1413d0 abstractC1413d0 = courseRepositoryImpl.f19592b;
                courseRepositoryImpl$loadMyCourses$1.f19596d = c3303a;
                courseRepositoryImpl$loadMyCourses$1.f19597e = null;
                courseRepositoryImpl$loadMyCourses$1.f19600h = 3;
                objMo5017m0 = abstractC1413d0.mo5017m0(str, courseRepositoryImpl$loadMyCourses$1);
                if (objMo5017m0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                objM18435d = objMo5017m0;
                c3303a2 = c3303a;
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c3303a2 = (Resource.C3303a) courseRepositoryImpl$loadMyCourses$1.f19596d;
                C7499b.m14977z0(objM18435d);
            }
            c3303a2.getClass();
            return Resource.C3303a.m9437c(objM18435d);
        }
        C7499b.m14977z0(objM18435d);
        courseRepositoryImpl$loadMyCourses$1.f19596d = this;
        courseRepositoryImpl$loadMyCourses$1.f19597e = str;
        courseRepositoryImpl$loadMyCourses$1.f19600h = 1;
        objM18435d = this.f19594d.m18435d(str, courseRepositoryImpl$loadMyCourses$1);
        if (objM18435d == coroutineSingletons) {
            return coroutineSingletons;
        }
        courseRepositoryImpl = this;
        List<? extends ResultType> list = ((Results) objM18435d).f19136d;
        if (list != 0) {
            LingQDatabase lingQDatabase = courseRepositoryImpl.f19591a;
            CourseRepositoryImpl$loadMyCourses$2$1 courseRepositoryImpl$loadMyCourses$2$1 = new CourseRepositoryImpl$loadMyCourses$2$1(list, courseRepositoryImpl, str, null);
            courseRepositoryImpl$loadMyCourses$1.f19596d = courseRepositoryImpl;
            courseRepositoryImpl$loadMyCourses$1.f19597e = str;
            courseRepositoryImpl$loadMyCourses$1.f19600h = 2;
            if (RoomDatabaseKt.m4573a(lingQDatabase, courseRepositoryImpl$loadMyCourses$2$1, courseRepositoryImpl$loadMyCourses$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        c3303a = Resource.f17861d;
        AbstractC1413d0 abstractC1413d1 = courseRepositoryImpl.f19592b;
        courseRepositoryImpl$loadMyCourses$1.f19596d = c3303a;
        courseRepositoryImpl$loadMyCourses$1.f19597e = null;
        courseRepositoryImpl$loadMyCourses$1.f19600h = 3;
        objMo5017m0 = abstractC1413d1.mo5017m0(str, courseRepositoryImpl$loadMyCourses$1);
        if (objMo5017m0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        objM18435d = objMo5017m0;
        c3303a2 = c3303a;
        c3303a2.getClass();
        return Resource.C3303a.m9437c(objM18435d);
    }

    @Override // ci.InterfaceC2010c
    /* JADX INFO: renamed from: f */
    public final InterfaceC7116c<List<C6697c>> mo5997f(int i10) {
        return C0062b.m273H0(this.f19592b.mo5018n0(LibraryItemType.Content.getValue(), i10));
    }

    @Override // ci.InterfaceC2010c
    /* JADX INFO: renamed from: g */
    public final Object mo5998g(int i10, String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM18436e = this.f19594d.m18436e(str, new Integer(i10), interfaceC9968c);
        return objM18436e == CoroutineSingletons.COROUTINE_SUSPENDED ? objM18436e : C9072e.f47360a;
    }

    @Override // ci.InterfaceC2010c
    /* JADX INFO: renamed from: h */
    public final InterfaceC7116c<List<C7565e>> mo5999h(int i10) {
        return C0062b.m273H0(this.f19592b.mo5016l0(LibraryItemType.Content.getValue(), i10));
    }

    @Override // ci.InterfaceC2010c
    /* JADX INFO: renamed from: i */
    public final Object mo6000i(int i10, String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM18434c = this.f19594d.m18434c(str, new Integer(i10), interfaceC9968c);
        return objM18434c == CoroutineSingletons.COROUTINE_SUSPENDED ? objM18434c : C9072e.f47360a;
    }
}
