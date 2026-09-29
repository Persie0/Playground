package com.lingq.core.data.repository;

import androidx.room.util.AbstractC0758a;
import com.lingq.core.domain.model.library.LibraryItemType;
import com.lingq.core.network.api.result.ResultVocabularyCourse;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.bp1;
import p000.c32;
import p000.go1;
import p000.io1;
import p000.u85;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.CourseRepositoryImpl$fetchVocabularyCourses$2$1", m4291f = "CourseRepositoryImpl.kt", m4292l = {139, 140}, m4293m = "invokeSuspend", m4294v = 2)
final class CourseRepositoryImpl$fetchVocabularyCourses$2$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public ArrayList f15046a;

    /* JADX INFO: renamed from: b */
    public int f15047b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f15048c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1290f f15049d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f15050e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseRepositoryImpl$fetchVocabularyCourses$2$1(List list, C1290f c1290f, String str, Continuation continuation) {
        super(1, continuation);
        this.f15048c = list;
        this.f15049d = c1290f;
        this.f15050e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CourseRepositoryImpl$fetchVocabularyCourses$2$1(this.f15048c, this.f15049d, this.f15050e, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((CourseRepositoryImpl$fetchVocabularyCourses$2$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        xfa xfaVar;
        boolean z;
        ArrayList arrayList;
        ArrayList arrayList2;
        io1 io1Var = this.f15049d.f16474b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f15047b;
        xfa xfaVar2 = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (ResultVocabularyCourse resultVocabularyCourse : this.f15048c) {
                resultVocabularyCourse.getClass();
                int i2 = resultVocabularyCourse.f21698a;
                String str = resultVocabularyCourse.f21700c;
                String str2 = resultVocabularyCourse.f21701d;
                int i3 = resultVocabularyCourse.f21702e;
                String str3 = resultVocabularyCourse.f21703f;
                String str4 = resultVocabularyCourse.f21704g;
                String str5 = resultVocabularyCourse.f21708k;
                String str6 = resultVocabularyCourse.f21709l;
                xfa xfaVar3 = xfaVar2;
                String str7 = resultVocabularyCourse.f21712o;
                String str8 = resultVocabularyCourse.f21706i;
                String str9 = resultVocabularyCourse.f21714q;
                int i4 = resultVocabularyCourse.f21715r;
                int i5 = resultVocabularyCourse.f21716s;
                String str10 = resultVocabularyCourse.f21717t;
                int i6 = resultVocabularyCourse.f21718u;
                int i7 = resultVocabularyCourse.f21719v;
                int i8 = resultVocabularyCourse.f21720w;
                Integer num = resultVocabularyCourse.f21696D;
                double d = resultVocabularyCourse.f21721x;
                boolean z2 = resultVocabularyCourse.f21723z;
                String str11 = resultVocabularyCourse.f21711n;
                List list = resultVocabularyCourse.f21695C;
                String str12 = resultVocabularyCourse.f21697E;
                String value = resultVocabularyCourse.f21699b;
                if (value == null) {
                    value = LibraryItemType.Collection.getValue();
                }
                arrayList3.add(new u85(i2, value, str, str2, i3, str3, null, null, null, str4, str8, str5, str6, resultVocabularyCourse.f21710m, str11, str7, resultVocabularyCourse.f21713p, str9, i4, i5, str10, i6, i7, i8, num, null, null, d, z2, list, str12, null, null, null, null, null, null, 0.0d, null, null, null, null, null, false, 402658752, 131070));
                arrayList4.add(new bp1(resultVocabularyCourse.f21698a, this.f15050e));
                xfaVar2 = xfaVar3;
            }
            xfaVar = xfaVar2;
            this.f15046a = arrayList4;
            z = true;
            this.f15047b = 1;
            if (io1Var.mo4096w0(arrayList3, this) != coroutineSingletons) {
                arrayList = arrayList4;
                arrayList2 = null;
            }
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC3193b.m15359b(obj);
                return xfaVar2;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        arrayList = this.f15046a;
        AbstractC3193b.m15359b(obj);
        xfaVar = xfaVar2;
        arrayList2 = null;
        z = true;
        this.f15046a = arrayList2;
        this.f15047b = 2;
        Object objM2861d = AbstractC0758a.m2861d(new go1(io1Var, arrayList, 0), io1Var.f44343K, this, false, z);
        if (objM2861d != CoroutineSingletons.COROUTINE_SUSPENDED) {
            objM2861d = xfaVar;
        }
        return objM2861d == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
