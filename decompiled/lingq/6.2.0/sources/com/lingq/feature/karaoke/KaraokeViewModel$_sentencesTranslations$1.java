package com.lingq.feature.karaoke;

import com.lingq.core.data.repository.C1295k;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.c83;
import p000.d65;
import p000.e83;
import p000.l83;
import p000.un1;
import p000.vz1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.karaoke.KaraokeViewModel$_sentencesTranslations$1", m4291f = "KaraokeViewModel.kt", m4292l = {103}, m4293m = "invokeSuspend", m4294v = 2)
final class KaraokeViewModel$_sentencesTranslations$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f26237a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f26238b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ int f26239c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2118c f26240d;

    /* JADX INFO: renamed from: com.lingq.feature.karaoke.KaraokeViewModel$_sentencesTranslations$1$1 */
    @c32(m4290c = "com.lingq.feature.karaoke.KaraokeViewModel$_sentencesTranslations$1$1", m4291f = "KaraokeViewModel.kt", m4292l = {104, 105, 107, 124}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21141 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public l83 f26241a;

        /* JADX INFO: renamed from: b */
        public int f26242b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f26243c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ e83 f26244d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C2118c f26245e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f26246f;

        /* JADX INFO: renamed from: com.lingq.feature.karaoke.KaraokeViewModel$_sentencesTranslations$1$1$1, reason: invalid class name */
        @c32(m4290c = "com.lingq.feature.karaoke.KaraokeViewModel$_sentencesTranslations$1$1$1", m4291f = "KaraokeViewModel.kt", m4292l = {112}, m4293m = "invokeSuspend", m4294v = 2)
        final class AnonymousClass1 extends SuspendLambda implements zi3 {

            /* JADX INFO: renamed from: a */
            public int f26247a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C2118c f26248b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ int f26249c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C2118c c2118c, int i, Continuation continuation) {
                super(2, continuation);
                this.f26248b = c2118c;
                this.f26249c = i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.f26248b, this.f26249c, continuation);
            }

            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.f26247a;
                C2118c c2118c = this.f26248b;
                try {
                    if (i == 0) {
                        AbstractC3193b.m15359b(obj);
                        d65 d65Var = c2118c.f26291e;
                        String strMo4589b2 = c2118c.f26288b.mo4589b2();
                        int i2 = this.f26249c;
                        this.f26247a = 1;
                        if (((C1295k) d65Var).m7265W(i2, strMo4589b2, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC3193b.m15359b(obj);
                    }
                } catch (Exception unused) {
                }
                C3244l c3244l = c2118c.f26306t;
                Boolean bool = Boolean.FALSE;
                c3244l.getClass();
                c3244l.m15572j(null, bool);
                return xfa.f68157a;
            }
        }

        /* JADX INFO: renamed from: com.lingq.feature.karaoke.KaraokeViewModel$_sentencesTranslations$1$1$2, reason: invalid class name */
        @c32(m4290c = "com.lingq.feature.karaoke.KaraokeViewModel$_sentencesTranslations$1$1$2", m4291f = "KaraokeViewModel.kt", m4292l = {120}, m4293m = "invokeSuspend", m4294v = 2)
        final class AnonymousClass2 extends SuspendLambda implements zi3 {

            /* JADX INFO: renamed from: a */
            public int f26250a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C2118c f26251b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ int f26252c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(C2118c c2118c, int i, Continuation continuation) {
                super(2, continuation);
                this.f26251b = c2118c;
                this.f26252c = i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass2(this.f26251b, this.f26252c, continuation);
            }

            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.f26250a;
                try {
                    if (i == 0) {
                        AbstractC3193b.m15359b(obj);
                        C2118c c2118c = this.f26251b;
                        d65 d65Var = c2118c.f26291e;
                        String strMo4589b2 = c2118c.f26288b.mo4589b2();
                        int i2 = this.f26252c;
                        this.f26250a = 1;
                        if (((C1295k) d65Var).m7265W(i2, strMo4589b2, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC3193b.m15359b(obj);
                    }
                } catch (Exception unused) {
                }
                return xfa.f68157a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21141(e83 e83Var, C2118c c2118c, int i, Continuation continuation) {
            super(2, continuation);
            this.f26244d = e83Var;
            this.f26245e = c2118c;
            this.f26246f = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C21141 c21141 = new C21141(this.f26244d, this.f26245e, this.f26246f, continuation);
            c21141.f26243c = obj;
            return c21141;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C21141) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0079  */
        /* JADX WARN: Code duplicated, block: B:26:0x0084  */
        /* JADX WARN: Code duplicated, block: B:27:0x0095  */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00af, code lost:
        
            if (kotlinx.coroutines.flow.AbstractC3224d.m15537p(r3, r2, r11) == r1) goto L30;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            l83 l83Var;
            l83 l83Var2;
            boolean zIsEmpty;
            C3244l c3244l;
            un1 un1Var = (un1) this.f26243c;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f26242b;
            e83 e83Var = this.f26244d;
            int i2 = this.f26246f;
            C2118c c2118c = this.f26245e;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                this.f26243c = un1Var;
                this.f26242b = 1;
                if (e83Var.emit(EmptyList.f47638a, this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
            } else {
                if (i == 2) {
                    AbstractC3193b.m15359b(obj);
                    l83Var = new l83((c83) obj, new KaraokeViewModel$_sentencesTranslations$1$1$dbFlow$1(3, null), 1);
                    this.f26243c = un1Var;
                    this.f26241a = l83Var;
                    this.f26242b = 3;
                    obj = AbstractC3224d.m15541t(l83Var, this);
                    if (obj != coroutineSingletons) {
                        l83Var2 = l83Var;
                        zIsEmpty = ((List) obj).isEmpty();
                        c3244l = c2118c.f26306t;
                        if (zIsEmpty) {
                            Boolean bool = Boolean.TRUE;
                            c3244l.getClass();
                            c3244l.m15572j(null, bool);
                            wfb.m23926u(un1Var, null, null, new AnonymousClass1(c2118c, i2, null), 3);
                        } else {
                            Boolean bool2 = Boolean.FALSE;
                            c3244l.getClass();
                            c3244l.m15572j(null, bool2);
                            wfb.m23926u(un1Var, null, null, new AnonymousClass2(c2118c, i2, null), 3);
                        }
                        this.f26243c = null;
                        this.f26241a = null;
                        this.f26242b = 4;
                    }
                    return coroutineSingletons;
                }
                if (i == 3) {
                    l83Var2 = this.f26241a;
                    AbstractC3193b.m15359b(obj);
                    zIsEmpty = ((List) obj).isEmpty();
                    c3244l = c2118c.f26306t;
                    if (zIsEmpty) {
                        Boolean bool3 = Boolean.TRUE;
                        c3244l.getClass();
                        c3244l.m15572j(null, bool3);
                        wfb.m23926u(un1Var, null, null, new AnonymousClass1(c2118c, i2, null), 3);
                    } else {
                        Boolean bool4 = Boolean.FALSE;
                        c3244l.getClass();
                        c3244l.m15572j(null, bool4);
                        wfb.m23926u(un1Var, null, null, new AnonymousClass2(c2118c, i2, null), 3);
                    }
                    this.f26243c = null;
                    this.f26241a = null;
                    this.f26242b = 4;
                } else {
                    if (i != 4) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj);
                }
            }
            return xfa.f68157a;
            d65 d65Var = c2118c.f26291e;
            c2118c.f26288b.mo4589b2();
            this.f26243c = un1Var;
            this.f26242b = 2;
            obj = AbstractC3224d.m15536o(((C1295k) d65Var).f16498b.mo7487D0(i2));
            if (obj != coroutineSingletons) {
                l83Var = new l83((c83) obj, new KaraokeViewModel$_sentencesTranslations$1$1$dbFlow$1(3, null), 1);
                this.f26243c = un1Var;
                this.f26241a = l83Var;
                this.f26242b = 3;
                obj = AbstractC3224d.m15541t(l83Var, this);
                if (obj != coroutineSingletons) {
                    l83Var2 = l83Var;
                    zIsEmpty = ((List) obj).isEmpty();
                    c3244l = c2118c.f26306t;
                    if (zIsEmpty) {
                        Boolean bool5 = Boolean.TRUE;
                        c3244l.getClass();
                        c3244l.m15572j(null, bool5);
                        wfb.m23926u(un1Var, null, null, new AnonymousClass1(c2118c, i2, null), 3);
                    } else {
                        Boolean bool6 = Boolean.FALSE;
                        c3244l.getClass();
                        c3244l.m15572j(null, bool6);
                        wfb.m23926u(un1Var, null, null, new AnonymousClass2(c2118c, i2, null), 3);
                    }
                    this.f26243c = null;
                    this.f26241a = null;
                    this.f26242b = 4;
                }
            }
            return coroutineSingletons;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KaraokeViewModel$_sentencesTranslations$1(C2118c c2118c, Continuation continuation) {
        super(3, continuation);
        this.f26240d = c2118c;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        KaraokeViewModel$_sentencesTranslations$1 karaokeViewModel$_sentencesTranslations$1 = new KaraokeViewModel$_sentencesTranslations$1(this.f26240d, (Continuation) obj3);
        karaokeViewModel$_sentencesTranslations$1.f26238b = (e83) obj;
        karaokeViewModel$_sentencesTranslations$1.f26239c = iIntValue;
        return karaokeViewModel$_sentencesTranslations$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f26238b;
        int i = this.f26239c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f26237a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            C21141 c21141 = new C21141(e83Var, this.f26240d, i, null);
            this.f26238b = null;
            this.f26239c = i;
            this.f26237a = 1;
            if (vz1.m23649s(c21141, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
