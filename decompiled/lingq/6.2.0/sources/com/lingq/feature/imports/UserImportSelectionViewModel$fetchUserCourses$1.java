package com.lingq.feature.imports;

import com.lingq.core.data.repository.C1290f;
import com.lingq.core.domain.model.language.CourseForImport;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.fa4;
import p000.fv8;
import p000.ika;
import p000.jka;
import p000.u91;
import p000.un1;
import p000.v91;
import p000.xfa;
import p000.xo1;
import p000.zi3;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.imports.UserImportSelectionViewModel$fetchUserCourses$1", m4291f = "UserImportSelectionViewModel.kt", m4292l = {184}, m4293m = "invokeSuspend", m4294v = 2)
final class UserImportSelectionViewModel$fetchUserCourses$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26061a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2108e f26062b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserImportSelectionViewModel$fetchUserCourses$1(C2108e c2108e, Continuation continuation) {
        super(2, continuation);
        this.f26062b = c2108e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserImportSelectionViewModel$fetchUserCourses$1(this.f26062b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((UserImportSelectionViewModel$fetchUserCourses$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2108e c2108e = this.f26062b;
        jka jkaVar = c2108e.f26154b;
        C3244l c3244l = c2108e.f26162j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26061a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                Boolean bool = Boolean.TRUE;
                c3244l.getClass();
                c3244l.m15572j(null, bool);
                xo1 xo1Var = c2108e.f26157e;
                String str = ((ika) jkaVar.mo9014u2().getValue()).f44237a;
                this.f26061a = 1;
                obj = ((C1290f) xo1Var).m7181e(str, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            Boolean bool2 = Boolean.FALSE;
            c3244l.getClass();
            c3244l.m15572j(null, bool2);
            ArrayList arrayListM22587E0 = u91.m22587E0((List) obj);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : arrayListM22587E0) {
                if (((CourseForImport) obj2).f19006b != 0) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((CourseForImport) it.next()).f19007c);
            }
            Set<String> setM22626r1 = u91.m22626r1(arrayList2);
            setM22626r1.add("Quick Imports");
            setM22626r1.add(((ika) jkaVar.mo9014u2().getValue()).f44239c);
            C3244l c3244l2 = c2108e.f26168p;
            c3244l2.getClass();
            c3244l2.m15572j(null, setM22626r1);
            C3244l c3244l3 = c2108e.f26167o;
            ArrayList arrayList3 = new ArrayList(v91.m23189q0(setM22626r1, 10));
            for (String str2 : setM22626r1) {
                arrayList3.add(new fv8(1, null, str2, str2, fa4.m11650l(str2, ((ika) jkaVar.mo9014u2().getValue()).f44239c)));
            }
            c3244l3.getClass();
            c3244l3.m15572j(null, arrayList3);
        } catch (Exception e) {
            Boolean bool3 = Boolean.FALSE;
            c3244l.getClass();
            c3244l.m15572j(null, bool3);
            e.printStackTrace();
            if (e instanceof HttpException) {
                C3244l c3244l4 = c2108e.f26165m;
                c3244l4.getClass();
                c3244l4.m15572j(null, e);
            }
        }
        return xfa.f68157a;
    }
}
