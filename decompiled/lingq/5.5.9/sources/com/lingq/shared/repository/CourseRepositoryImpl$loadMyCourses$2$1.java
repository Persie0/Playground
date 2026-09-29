package com.lingq.shared.repository;

import bi.AbstractC1413d0;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.CourseForImport;
import com.lingq.entity.LibraryData;
import com.lingq.shared.network.result.ResultCourseForImport;
import com.lingq.shared.uimodel.library.LibraryItemType;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.CourseRepositoryImpl$loadMyCourses$2$1", m19206f = "CourseRepository.kt", m19207l = {87, 89}, m19208m = "invokeSuspend")
public final class CourseRepositoryImpl$loadMyCourses$2$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f19601e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ List<ResultCourseForImport> f19602f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ CourseRepositoryImpl f19603g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f19604h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseRepositoryImpl$loadMyCourses$2$1(List<ResultCourseForImport> list, CourseRepositoryImpl courseRepositoryImpl, String str, InterfaceC9968c<? super CourseRepositoryImpl$loadMyCourses$2$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f19602f = list;
        this.f19603g = courseRepositoryImpl;
        this.f19604h = str;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CourseRepositoryImpl$loadMyCourses$2$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new CourseRepositoryImpl$loadMyCourses$2$1(this.f19602f, this.f19603g, this.f19604h, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f19601e;
        CourseRepositoryImpl courseRepositoryImpl = this.f19603g;
        List<ResultCourseForImport> list = this.f19602f;
        if (i10 != 0) {
            if (i10 == 1) {
                C7499b.m14977z0(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
        for (ResultCourseForImport resultCourseForImport : list) {
            C5207g.m11111f(resultCourseForImport, "<this>");
            arrayList.add(new LibraryData(resultCourseForImport.f18381a, LibraryItemType.Collection.getValue(), resultCourseForImport.f18382b, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, 0, 0, 0, null, null, null, 0.0d, false, null, null, null, null, null, null, null, null, 0.0d, 0.0d, false, false, null, -8, 1023, null));
        }
        AbstractC1413d0 abstractC1413d0 = courseRepositoryImpl.f19592b;
        this.f19601e = 1;
        if (abstractC1413d0.mo599i0(arrayList, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        AbstractC1413d0 abstractC1413d1 = courseRepositoryImpl.f19592b;
        ArrayList arrayList2 = new ArrayList(C9325m.m17681z(list, 10));
        for (ResultCourseForImport resultCourseForImport2 : list) {
            int i11 = resultCourseForImport2.f18381a;
            String str = resultCourseForImport2.f18382b;
            if (str == null) {
                str = "";
            }
            arrayList2.add(new CourseForImport(this.f19604h, i11, str));
        }
        this.f19601e = 2;
        if (abstractC1413d1.mo5020p0(arrayList2, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }
}
