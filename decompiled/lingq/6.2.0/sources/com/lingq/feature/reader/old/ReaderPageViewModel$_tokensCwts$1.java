package com.lingq.feature.reader.old;

import com.lingq.core.data.repository.C1306v;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.status.WordStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.internal.AbstractC3238h;
import p000.C3386nv;
import p000.b91;
import p000.c32;
import p000.c83;
import p000.cma;
import p000.dj3;
import p000.e83;
import p000.fa4;
import p000.ox7;
import p000.u91;
import p000.v91;
import p000.vz1;
import p000.w3a;
import p000.xfa;
import p000.xz7;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageViewModel$_tokensCwts$1", m4291f = "ReaderPageViewModel.kt", m4292l = {194}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageViewModel$_tokensCwts$1 extends SuspendLambda implements dj3 {

    /* JADX INFO: renamed from: a */
    public int f28641a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f28642b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Map f28643c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ ox7 f28644d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2411m f28645e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageViewModel$_tokensCwts$1(C2411m c2411m, Continuation continuation) {
        super(6, continuation);
        this.f28645e = c2411m;
    }

    @Override // p000.dj3
    /* JADX INFO: renamed from: h */
    public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        ((Boolean) obj2).getClass();
        ((Boolean) obj3).getClass();
        ReaderPageViewModel$_tokensCwts$1 readerPageViewModel$_tokensCwts$1 = new ReaderPageViewModel$_tokensCwts$1(this.f28645e, (Continuation) obj6);
        readerPageViewModel$_tokensCwts$1.f28642b = (e83) obj;
        readerPageViewModel$_tokensCwts$1.f28643c = (Map) obj4;
        readerPageViewModel$_tokensCwts$1.f28644d = (ox7) obj5;
        return readerPageViewModel$_tokensCwts$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2411m c2411m = this.f28645e;
        Locale locale = c2411m.f29253u;
        e83 e83Var = this.f28642b;
        Map map = this.f28643c;
        ox7 ox7Var = this.f28644d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28641a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            List<xz7> list = ox7Var.f55132e;
            ArrayList<xz7> arrayList = new ArrayList();
            for (xz7 xz7Var : list) {
                String str = xz7Var.f69008e;
                locale.getClass();
                LessonWord lessonWord = (LessonWord) map.get(vz1.m23610P(str, locale));
                if (lessonWord == null || !fa4.m11650l(lessonWord.f19322i, WordStatus.New.getValue())) {
                    xz7Var = null;
                }
                if (xz7Var != null) {
                    arrayList.add(xz7Var);
                }
            }
            ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
            for (xz7 xz7Var2 : arrayList) {
                w3a w3aVar = c2411m.f29239j;
                cma cmaVar = c2411m.f29223b;
                String strMo4589b2 = cmaVar.mo4589b2();
                String strMo4580K1 = cmaVar.mo4580K1();
                int i2 = c2411m.f29248p;
                String str2 = xz7Var2.f69008e;
                locale.getClass();
                arrayList2.add(((C1306v) w3aVar).m7382h(i2, xz7Var2.f69010g, xz7Var2.f69011h, strMo4589b2, strMo4580K1, vz1.m23610P(str2, locale)));
            }
            c83[] c83VarArr = (c83[]) u91.m22622n1(arrayList2).toArray(new c83[0]);
            this.f28642b = null;
            this.f28643c = null;
            this.f28644d = null;
            this.f28641a = 1;
            AbstractC3224d.m15539r(e83Var);
            Object objM15568a = AbstractC3238h.m15568a(e83Var, new b91(c83VarArr, 8), new C2365x9f023a3b(c2411m, null), this, c83VarArr);
            if (objM15568a != CoroutineSingletons.COROUTINE_SUSPENDED) {
                objM15568a = xfaVar;
            }
            if (objM15568a != CoroutineSingletons.COROUTINE_SUSPENDED) {
                objM15568a = xfaVar;
            }
            if (objM15568a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfaVar;
    }
}
