package com.lingq.core.data.repository;

import androidx.room.util.AbstractC0758a;
import com.lingq.core.database.entity.CourseForImportEntity;
import com.lingq.core.domain.model.library.LibraryItemType;
import com.lingq.core.network.api.result.ResultCourseForImport;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.fo1;
import p000.io1;
import p000.u85;
import p000.v91;
import p000.vi3;
import p000.vz1;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.CourseRepositoryImpl$loadMyCourses$2$1", m4291f = "CourseRepositoryImpl.kt", m4292l = {105, 107}, m4293m = "invokeSuspend", m4294v = 2)
final class CourseRepositoryImpl$loadMyCourses$2$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f15055a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f15056b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1290f f15057c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f15058d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseRepositoryImpl$loadMyCourses$2$1(List list, C1290f c1290f, String str, Continuation continuation) {
        super(1, continuation);
        this.f15056b = list;
        this.f15057c = c1290f;
        this.f15058d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CourseRepositoryImpl$loadMyCourses$2$1(this.f15056b, this.f15057c, this.f15058d, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((CourseRepositoryImpl$loadMyCourses$2$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        io1 io1Var = this.f15057c.f16474b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f15055a;
        xfa xfaVar = xfa.f68157a;
        List list = this.f15056b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            List<ResultCourseForImport> list2 = list;
            ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
            for (ResultCourseForImport resultCourseForImport : list2) {
                resultCourseForImport.getClass();
                arrayList.add(new u85(resultCourseForImport.f20817a, LibraryItemType.Collection.getValue(), resultCourseForImport.f20818b, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, 0, 0, 0, null, null, null, 0.0d, false, null, null, null, null, null, null, null, null, 0.0d, null, null, null, null, null, false, -8, 131071));
            }
            this.f15055a = 1;
            if (io1Var.mo4096w0(arrayList, this) != coroutineSingletons) {
            }
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        List list3 = list;
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(list3, 10));
        int i2 = 0;
        int i3 = 0;
        for (Object obj2 : list3) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                vz1.m23628e0();
                throw null;
            }
            ResultCourseForImport resultCourseForImport2 = (ResultCourseForImport) obj2;
            int i5 = resultCourseForImport2.f20817a;
            String str = resultCourseForImport2.f20818b;
            if (str == null) {
                str = "";
            }
            arrayList2.add(new CourseForImportEntity(this.f15058d, i5, str, i3));
            i3 = i4;
        }
        this.f15055a = 2;
        Object objM2861d = AbstractC0758a.m2861d(new fo1(io1Var, arrayList2, i2), io1Var.f44343K, this, false, true);
        if (objM2861d != CoroutineSingletons.COROUTINE_SUSPENDED) {
            objM2861d = xfaVar;
        }
        return objM2861d == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
