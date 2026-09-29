package com.lingq.feature.reader.old;

import com.lingq.core.domain.model.lesson.LessonWord;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.C3540rl;
import p000.bj3;
import p000.c32;
import p000.e83;
import p000.kk8;
import p000.ox7;
import p000.un1;
import p000.v91;
import p000.vx7;
import p000.vz1;
import p000.xfa;
import p000.xz7;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$2", m4291f = "ReaderPageFragment.kt", m4292l = {381}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageFragment$onViewCreated$2$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28520a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderPageFragment f28521b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$2$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$2$1", m4291f = "ReaderPageFragment.kt", m4292l = {380}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23401 extends SuspendLambda implements bj3 {

        /* JADX INFO: renamed from: a */
        public int f28522a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ e83 f28523b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Map f28524c;

        @Override // p000.bj3
        /* JADX INFO: renamed from: e */
        public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
            C23401 c23401 = new C23401(4, (Continuation) obj4);
            c23401.f28523b = (e83) obj;
            c23401.f28524c = (Map) obj2;
            return c23401.invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            e83 e83Var = this.f28523b;
            Map map = this.f28524c;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f28522a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                this.f28523b = null;
                this.f28524c = null;
                this.f28522a = 1;
                if (e83Var.emit(map, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$2$2 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$2$2", m4291f = "ReaderPageFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23412 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28525a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderPageFragment f28526b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23412(ReaderPageFragment readerPageFragment, Continuation continuation) {
            super(2, continuation);
            this.f28526b = readerPageFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23412 c23412 = new C23412(this.f28526b, continuation);
            c23412.f28525a = obj;
            return c23412;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23412 c23412 = (C23412) create((Map) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23412.invokeSuspend(xfaVar);
            return xfaVar;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Map mapM15360M;
            Map map = (Map) this.f28525a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            vx7 vx7Var = ReaderPageFragment.Companion;
            C2411m c2411mM9299X0 = this.f28526b.m9299X0();
            Locale locale = c2411mM9299X0.f29253u;
            map.getClass();
            C3244l c3244l = c2411mM9299X0.f29197B;
            ox7 ox7Var = (ox7) c2411mM9299X0.f29254v.getValue();
            if (ox7Var != null) {
                List list = ox7Var.f55132e;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = ((xz7) it.next()).f69008e;
                    locale.getClass();
                    LessonWord lessonWord = (LessonWord) map.get(vz1.m23610P(str, locale));
                    if (lessonWord != null) {
                        arrayList.add(lessonWord);
                    }
                }
                int iM15363P = AbstractC3194a.m15363P(v91.m23189q0(arrayList, 10));
                if (iM15363P < 16) {
                    iM15363P = 16;
                }
                mapM15360M = new LinkedHashMap(iM15363P);
                for (Object obj2 : arrayList) {
                    String str2 = ((LessonWord) obj2).f19314a;
                    locale.getClass();
                    mapM15360M.put(vz1.m23610P(str2, locale), obj2);
                }
            } else {
                mapM15360M = AbstractC3194a.m15360M();
            }
            c3244l.getClass();
            c3244l.m15572j(null, mapM15360M);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageFragment$onViewCreated$2$2(ReaderPageFragment readerPageFragment, Continuation continuation) {
        super(2, continuation);
        this.f28521b = readerPageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderPageFragment$onViewCreated$2$2(this.f28521b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderPageFragment$onViewCreated$2$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28520a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            vx7 vx7Var = ReaderPageFragment.Companion;
            ReaderPageFragment readerPageFragment = this.f28521b;
            kk8 kk8VarM15543v = AbstractC3224d.m15543v(readerPageFragment.m9298W0().f29290K0, new C3540rl(readerPageFragment.m9299X0().f29255w, 5), new C23401(4, null));
            C23412 c23412 = new C23412(readerPageFragment, null);
            this.f28520a = 1;
            if (AbstractC3224d.m15529h(kk8VarM15543v, c23412, this) == coroutineSingletons) {
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
