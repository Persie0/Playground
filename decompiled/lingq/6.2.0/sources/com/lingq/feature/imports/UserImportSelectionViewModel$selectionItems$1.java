package com.lingq.feature.imports;

import com.lingq.feature.imports.data.UserImportDetailType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.e83;
import p000.fv8;
import p000.gla;
import p000.hla;
import p000.v91;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.imports.UserImportSelectionViewModel$selectionItems$1", m4291f = "UserImportSelectionViewModel.kt", m4292l = {81}, m4293m = "invokeSuspend", m4294v = 2)
final class UserImportSelectionViewModel$selectionItems$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f26066a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f26067b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ List f26068c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2108e f26069d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserImportSelectionViewModel$selectionItems$1(C2108e c2108e, Continuation continuation) {
        super(3, continuation);
        this.f26069d = c2108e;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        UserImportSelectionViewModel$selectionItems$1 userImportSelectionViewModel$selectionItems$1 = new UserImportSelectionViewModel$selectionItems$1(this.f26069d, (Continuation) obj3);
        userImportSelectionViewModel$selectionItems$1.f26067b = (e83) obj;
        userImportSelectionViewModel$selectionItems$1.f26068c = (List) obj2;
        return userImportSelectionViewModel$selectionItems$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f26067b;
        List list = this.f26068c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26066a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            ArrayList arrayList = new ArrayList();
            List list2 = list;
            ArrayList arrayList2 = new ArrayList(v91.m23189q0(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(new hla((fv8) it.next()));
            }
            arrayList.addAll(arrayList2);
            C2108e c2108e = this.f26069d;
            UserImportDetailType userImportDetailType = c2108e.f26161i;
            if (userImportDetailType == UserImportDetailType.Tags || userImportDetailType == UserImportDetailType.Course) {
                arrayList.add(0, new gla((String) c2108e.f26164l.getValue()));
            }
            this.f26067b = null;
            this.f26068c = null;
            this.f26066a = 1;
            if (e83Var.emit(arrayList, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
