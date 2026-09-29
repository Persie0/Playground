package com.lingq.shared.repository;

import bi.AbstractC1413d0;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.LibraryData;
import com.lingq.shared.network.result.ResultVocabularyCourse;
import com.lingq.shared.uimodel.library.LibraryItemType;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p367rh.C8792f;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.CourseRepositoryImpl$networkVocabularyCourses$2$1", m19206f = "CourseRepository.kt", m19207l = {120, 121}, m19208m = "invokeSuspend")
public final class CourseRepositoryImpl$networkVocabularyCourses$2$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public ArrayList f19614e;

    /* JADX INFO: renamed from: f */
    public int f19615f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ List<ResultVocabularyCourse> f19616g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ CourseRepositoryImpl f19617h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f19618i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseRepositoryImpl$networkVocabularyCourses$2$1(List<ResultVocabularyCourse> list, CourseRepositoryImpl courseRepositoryImpl, String str, InterfaceC9968c<? super CourseRepositoryImpl$networkVocabularyCourses$2$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f19616g = list;
        this.f19617h = courseRepositoryImpl;
        this.f19618i = str;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CourseRepositoryImpl$networkVocabularyCourses$2$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new CourseRepositoryImpl$networkVocabularyCourses$2$1(this.f19616g, this.f19617h, this.f19618i, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CourseRepositoryImpl courseRepositoryImpl;
        ArrayList arrayList;
        CourseRepositoryImpl$networkVocabularyCourses$2$1 courseRepositoryImpl$networkVocabularyCourses$2$1;
        CoroutineSingletons coroutineSingletons;
        CourseRepositoryImpl$networkVocabularyCourses$2$1 courseRepositoryImpl$networkVocabularyCourses$2$2 = this;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = courseRepositoryImpl$networkVocabularyCourses$2$2.f19615f;
        CourseRepositoryImpl courseRepositoryImpl2 = courseRepositoryImpl$networkVocabularyCourses$2$2.f19617h;
        if (i10 != 0) {
            if (i10 == 1) {
                ArrayList arrayList2 = courseRepositoryImpl$networkVocabularyCourses$2$2.f19614e;
                C7499b.m14977z0(obj);
                coroutineSingletons = coroutineSingletons2;
                courseRepositoryImpl = courseRepositoryImpl2;
                arrayList = arrayList2;
                courseRepositoryImpl$networkVocabularyCourses$2$1 = courseRepositoryImpl$networkVocabularyCourses$2$2;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator it = courseRepositoryImpl$networkVocabularyCourses$2$2.f19616g.iterator();
        while (it.hasNext()) {
            ResultVocabularyCourse resultVocabularyCourse = (ResultVocabularyCourse) it.next();
            C5207g.m11111f(resultVocabularyCourse, "<this>");
            int i11 = resultVocabularyCourse.f19080a;
            String str = resultVocabularyCourse.f19082c;
            String str2 = resultVocabularyCourse.f19083d;
            int i12 = resultVocabularyCourse.f19084e;
            String str3 = resultVocabularyCourse.f19085f;
            String str4 = resultVocabularyCourse.f19086g;
            String str5 = resultVocabularyCourse.f19090k;
            String str6 = resultVocabularyCourse.f19091l;
            String str7 = resultVocabularyCourse.f19094o;
            Iterator it2 = it;
            String str8 = resultVocabularyCourse.f19088i;
            CoroutineSingletons coroutineSingletons3 = coroutineSingletons2;
            String str9 = resultVocabularyCourse.f19096q;
            CourseRepositoryImpl courseRepositoryImpl3 = courseRepositoryImpl2;
            int i13 = resultVocabularyCourse.f19097r;
            ArrayList arrayList5 = arrayList4;
            int i14 = resultVocabularyCourse.f19098s;
            String str10 = resultVocabularyCourse.f19099t;
            ArrayList arrayList6 = arrayList3;
            int i15 = resultVocabularyCourse.f19100u;
            int i16 = resultVocabularyCourse.f19101v;
            int i17 = resultVocabularyCourse.f19102w;
            Integer num = resultVocabularyCourse.f19078D;
            double d10 = resultVocabularyCourse.f19103x;
            boolean z10 = resultVocabularyCourse.f19105z;
            String str11 = resultVocabularyCourse.f19093n;
            List<String> list = resultVocabularyCourse.f19077C;
            String str12 = resultVocabularyCourse.f19079E;
            String value = resultVocabularyCourse.f19081b;
            if (value == null) {
                value = LibraryItemType.Collection.getValue();
            }
            arrayList6.add(new LibraryData(i11, value, str, str2, i12, str3, null, str4, null, str8, null, str5, str6, resultVocabularyCourse.f19092m, str11, str7, resultVocabularyCourse.f19095p, str9, i13, i14, str10, i15, i16, i17, num, null, null, d10, z10, list, str12, null, null, null, null, null, null, 0.0d, 0.0d, false, false, null, -2046819008, 1023, null));
            arrayList5.add(new C8792f(this.f19618i, resultVocabularyCourse.f19080a));
            it = it2;
            arrayList4 = arrayList5;
            coroutineSingletons2 = coroutineSingletons3;
            courseRepositoryImpl2 = courseRepositoryImpl3;
            arrayList3 = arrayList6;
            courseRepositoryImpl$networkVocabularyCourses$2$2 = this;
        }
        CoroutineSingletons coroutineSingletons4 = coroutineSingletons2;
        courseRepositoryImpl = courseRepositoryImpl2;
        arrayList = arrayList4;
        ArrayList arrayList7 = arrayList3;
        courseRepositoryImpl$networkVocabularyCourses$2$1 = courseRepositoryImpl$networkVocabularyCourses$2$2;
        AbstractC1413d0 abstractC1413d0 = courseRepositoryImpl.f19592b;
        courseRepositoryImpl$networkVocabularyCourses$2$1.f19614e = arrayList;
        courseRepositoryImpl$networkVocabularyCourses$2$1.f19615f = 1;
        Object objMo599i0 = abstractC1413d0.mo599i0(arrayList7, courseRepositoryImpl$networkVocabularyCourses$2$1);
        coroutineSingletons = coroutineSingletons4;
        if (objMo599i0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        AbstractC1413d0 abstractC1413d1 = courseRepositoryImpl.f19592b;
        courseRepositoryImpl$networkVocabularyCourses$2$1.f19614e = null;
        courseRepositoryImpl$networkVocabularyCourses$2$1.f19615f = 2;
        if (abstractC1413d1.mo5022r0(arrayList, courseRepositoryImpl$networkVocabularyCourses$2$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }
}
