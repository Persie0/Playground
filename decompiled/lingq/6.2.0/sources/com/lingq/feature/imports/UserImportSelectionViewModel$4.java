package com.lingq.feature.imports;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.cl9;
import p000.fa4;
import p000.fv8;
import p000.ika;
import p000.u91;
import p000.un1;
import p000.v91;
import p000.vk9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.imports.UserImportSelectionViewModel$4", m4291f = "UserImportSelectionViewModel.kt", m4292l = {290}, m4293m = "invokeSuspend", m4294v = 2)
final class UserImportSelectionViewModel$4 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26051a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2108e f26052b;

    /* JADX INFO: renamed from: com.lingq.feature.imports.UserImportSelectionViewModel$4$1 */
    @c32(m4290c = "com.lingq.feature.imports.UserImportSelectionViewModel$4$1", m4291f = "UserImportSelectionViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20951 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f26053a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2108e f26054b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20951(C2108e c2108e, Continuation continuation) {
            super(2, continuation);
            this.f26054b = c2108e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C20951 c20951 = new C20951(this.f26054b, continuation);
            c20951.f26053a = obj;
            return c20951;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C20951 c20951 = (C20951) create((String) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c20951.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Set setM22627s1;
            String str = (String) this.f26053a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2108e c2108e = this.f26054b;
            Set set = (Set) c2108e.f26168p.getValue();
            if (!set.isEmpty()) {
                if (vk9.m23391n0(str)) {
                    setM22627s1 = set;
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : set) {
                        if (vk9.m23380c0((String) obj2, str, true)) {
                            arrayList.add(obj2);
                        }
                    }
                    setM22627s1 = u91.m22627s1(arrayList);
                }
                Set<String> set2 = setM22627s1;
                ArrayList arrayList2 = new ArrayList(v91.m23189q0(set2, 10));
                for (String str2 : set2) {
                    arrayList2.add(new fv8(1, null, str2, str2, fa4.m11650l(str2, ((ika) c2108e.f26154b.mo9014u2().getValue()).f44239c)));
                }
                ArrayList arrayList3 = new ArrayList(arrayList2);
                if (!vk9.m23391n0(str)) {
                    Set set3 = set;
                    if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                        Iterator it = set3.iterator();
                        do {
                            if (!it.hasNext()) {
                                String string = c2108e.f26156d.getString(R$string.import_create_course, str);
                                string.getClass();
                                arrayList3.add(new fv8(1, null, string, "__CREATE_NEW_COURSE__", false));
                                break;
                            }
                        } while (!cl9.m4834Q((String) it.next(), str, true));
                    } else {
                        String string2 = c2108e.f26156d.getString(R$string.import_create_course, str);
                        string2.getClass();
                        arrayList3.add(new fv8(1, null, string2, "__CREATE_NEW_COURSE__", false));
                        break;
                    }
                }
                C3244l c3244l = c2108e.f26167o;
                c3244l.getClass();
                c3244l.m15572j(null, arrayList3);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserImportSelectionViewModel$4(C2108e c2108e, Continuation continuation) {
        super(2, continuation);
        this.f26052b = c2108e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserImportSelectionViewModel$4(this.f26052b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((UserImportSelectionViewModel$4) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26051a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2108e c2108e = this.f26052b;
            C3244l c3244l = c2108e.f26164l;
            C20951 c20951 = new C20951(c2108e, null);
            c3244l.getClass();
            this.f26051a = 1;
            if (AbstractC3224d.m15529h(c3244l, c20951, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3386nv.m17633t("SharedFlow never completes, this call should never return.");
        return null;
    }
}
