package com.lingq.feature.library;

import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.data.repository.C1299o;
import com.lingq.core.domain.library.C1387b;
import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.library.LibraryShelf;
import com.lingq.core.domain.model.library.LibraryTab;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3423or;
import p000.AbstractC3584sr;
import p000.C3309ls;
import p000.C3386nv;
import p000.C3540rl;
import p000.am4;
import p000.bl2;
import p000.c32;
import p000.dp5;
import p000.f95;
import p000.ja5;
import p000.lda;
import p000.lm6;
import p000.m83;
import p000.mm6;
import p000.ph2;
import p000.pn1;
import p000.ui5;
import p000.un1;
import p000.v72;
import p000.wfb;
import p000.xfa;
import p000.xq3;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.feature.library.LibraryUpdateViewModel$1", m4291f = "LibraryUpdateViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LibraryUpdateViewModel$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f26464a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2146e f26465b;

    /* JADX INFO: renamed from: com.lingq.feature.library.LibraryUpdateViewModel$1$2 */
    @c32(m4290c = "com.lingq.feature.library.LibraryUpdateViewModel$1$2", m4291f = "LibraryUpdateViewModel.kt", m4292l = {233}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21362 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f26466a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f26467b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C2146e f26468c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Language f26469d;

        /* JADX INFO: renamed from: com.lingq.feature.library.LibraryUpdateViewModel$1$2$2, reason: invalid class name */
        @c32(m4290c = "com.lingq.feature.library.LibraryUpdateViewModel$1$2$2", m4291f = "LibraryUpdateViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
        final class AnonymousClass2 extends SuspendLambda implements zi3 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C2146e f26470a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Language f26471b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ List f26472c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(C2146e c2146e, Language language, List list, Continuation continuation) {
                super(2, continuation);
                this.f26470a = c2146e;
                this.f26471b = language;
                this.f26472c = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass2(this.f26470a, this.f26471b, this.f26472c, continuation);
            }

            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) throws Throwable {
                AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((un1) obj, (Continuation) obj2);
                xfa xfaVar = xfa.f68157a;
                anonymousClass2.invokeSuspend(xfaVar);
                return xfaVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object value;
                String str;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                AbstractC3193b.m15359b(obj);
                C2146e c2146e = this.f26470a;
                for (LibraryShelf libraryShelf : (Iterable) c2146e.f26660I.getValue()) {
                    Iterator it = libraryShelf.f19495c.iterator();
                    while (it.hasNext()) {
                        String strM18220E = AbstractC3423or.m18220E(libraryShelf, (LibraryTab) it.next());
                        ConcurrentHashMap concurrentHashMap = pn1.f56492a;
                        pn1.m19405a(lda.m16103C(c2146e), "shelf_content_".concat(strM18220E));
                    }
                }
                C3244l c3244l = c2146e.f26669R;
                do {
                    value = c3244l.getValue();
                    ((Boolean) value).getClass();
                } while (!c3244l.m15570h(value, Boolean.TRUE));
                C3244l c3244l2 = c2146e.f26661J;
                Map mapM15360M = AbstractC3194a.m15360M();
                c3244l2.getClass();
                c3244l2.m15572j(null, mapM15360M);
                C3244l c3244l3 = c2146e.f26662K;
                f95 f95Var = new f95(0, 0, 0, 0, null, 0, true, 191);
                c3244l3.getClass();
                c3244l3.m15572j(null, f95Var);
                Language language = this.f26471b;
                String str2 = language.f19024a;
                c2146e.m9067Y2(str2);
                c2146e.m9065W2(language, this.f26472c);
                if (language.f19025b != 0) {
                    bl2 bl2Var = c2146e.f26684i;
                    bl2Var.getClass();
                    language.getClass();
                    AbstractC1263a.m7050e(new m83(((C1387b) bl2Var.f8656b).m8001a(language.f19025b, language.f19024a), new LibraryUpdateViewModel$observeAndLoadBlacklists$1(c2146e, null), 2), lda.m16103C(c2146e), "blacklists");
                }
                str2.getClass();
                C3309ls c3309ls = c2146e.f26687l;
                c3309ls.getClass();
                C1299o c1299o = (C1299o) ((mm6) c3309ls.f50064b);
                c1299o.getClass();
                lm6 lm6Var = c1299o.f16523a;
                try {
                    str = new SimpleDateFormat("yyyy-MM-dd'T'H:m:s").format(Calendar.getInstance().getTime());
                    str.getClass();
                } catch (Exception unused) {
                    str = "";
                }
                lm6Var.getClass();
                AbstractC3224d.m15545x(new C3228h(AbstractC3224d.m15536o(AbstractC3584sr.m21590A(lm6Var.f49834K, true, new String[]{"NoticeEntity"}, new ui5(2, str2, str))), c2146e.f26697v.m7997a(language), new LibraryUpdateViewModel$observeAndHandleNotifications$1(c2146e, language, null)), lda.m16103C(c2146e));
                AbstractC1263a.m7050e(new m83(new C3540rl(c2146e.f26693r.m8010a(str2), 5), new LibraryUpdateViewModel$observeAndHandleNotifications$2(c2146e, null), 2), lda.m16103C(c2146e), "streak_repair");
                c2146e.m9077i3(language);
                return xfa.f68157a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21362(C2146e c2146e, Language language, Continuation continuation) {
            super(2, continuation);
            this.f26468c = c2146e;
            this.f26469d = language;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C21362 c21362 = new C21362(this.f26468c, this.f26469d, continuation);
            c21362.f26467b = obj;
            return c21362;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C21362) create((List) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            List list = (List) this.f26467b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f26466a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C2146e c2146e = this.f26468c;
                C3244l c3244l = c2146e.f26671T;
                do {
                    value = c3244l.getValue();
                } while (!c3244l.m15570h(value, list));
                v72 v72Var = ph2.f56212a;
                xq3 xq3Var = dp5.f36000a;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(c2146e, this.f26469d, list, null);
                this.f26467b = null;
                this.f26466a = 1;
                if (wfb.m23905G(anonymousClass2, xq3Var, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUpdateViewModel$1(C2146e c2146e, Continuation continuation) {
        super(2, continuation);
        this.f26465b = c2146e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LibraryUpdateViewModel$1 libraryUpdateViewModel$1 = new LibraryUpdateViewModel$1(this.f26465b, continuation);
        libraryUpdateViewModel$1.f26464a = obj;
        return libraryUpdateViewModel$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LibraryUpdateViewModel$1) create((Language) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Language language = (Language) this.f26464a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C2146e c2146e = this.f26465b;
        C3244l c3244l = c2146e.f26658G;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, ja5.m14361a((ja5) value, new am4(language.f19024a), null, false, null, false, null, null, null, false, false, false, 2046)));
        return AbstractC1263a.m7049d(new m83(c2146e.f26696u.m7998b(language.f19024a), new C21362(c2146e, language, null), 2), lda.m16103C(c2146e), "levels", ph2.f56212a);
    }
}
