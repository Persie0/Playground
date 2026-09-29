package com.lingq.feature.review.activities;

import android.widget.TextView;
import com.lingq.core.datastore.C1370c;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.settings.ReviewSettingsKeys;
import com.lingq.core.token.components.ViewLearnProgress;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3352my;
import p000.C3386nv;
import p000.ViewOnClickListenerC3135j5;
import p000.bf3;
import p000.bh4;
import p000.c18;
import p000.c32;
import p000.gb8;
import p000.hb8;
import p000.jfa;
import p000.lg8;
import p000.mg8;
import p000.nb8;
import p000.qw7;
import p000.t7d;
import p000.un1;
import p000.vs3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityFlashcardFragment$onViewCreated$2$4", m4291f = "ReviewActivityFlashcardFragment.kt", m4292l = {348}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivityFlashcardFragment$onViewCreated$2$4 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31939a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReviewActivityFlashcardFragment f31940b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nb8 f31941c;

    /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivityFlashcardFragment$onViewCreated$2$4$1 */
    @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityFlashcardFragment$onViewCreated$2$4$1", m4291f = "ReviewActivityFlashcardFragment.kt", m4292l = {258, 265, 270, 275, 280, 286, 293, 298, 303, 308}, m4293m = "invokeSuspend", m4294v = 2)
    final class C26411 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public ReviewActivityFlashcardFragment f31942a;

        /* JADX INFO: renamed from: b */
        public bf3 f31943b;

        /* JADX INFO: renamed from: c */
        public int f31944c;

        /* JADX INFO: renamed from: d */
        public int f31945d;

        /* JADX INFO: renamed from: e */
        public int f31946e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f31947f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ReviewActivityFlashcardFragment f31948g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ nb8 f31949h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26411(nb8 nb8Var, ReviewActivityFlashcardFragment reviewActivityFlashcardFragment, Continuation continuation) {
            super(2, continuation);
            this.f31948g = reviewActivityFlashcardFragment;
            this.f31949h = nb8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C26411 c26411 = new C26411(this.f31949h, this.f31948g, continuation);
            c26411.f31947f = obj;
            return c26411;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C26411) create((LessonCard) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Code duplicated, block: B:102:0x02d7 A[PHI: r2 r5 r6 r7 r14
          0x02d7: PHI (r2v20 int) = (r2v18 int), (r2v22 int) binds: [B:100:0x02d4, B:7:0x001d] A[DONT_GENERATE, DONT_INLINE]
          0x02d7: PHI (r5v17 int) = (r5v15 int), (r5v18 int) binds: [B:100:0x02d4, B:7:0x001d] A[DONT_GENERATE, DONT_INLINE]
          0x02d7: PHI (r6v25 bf3) = (r6v23 bf3), (r6v26 bf3) binds: [B:100:0x02d4, B:7:0x001d] A[DONT_GENERATE, DONT_INLINE]
          0x02d7: PHI (r7v15 com.lingq.feature.review.activities.ReviewActivityFlashcardFragment) = 
          (r7v13 com.lingq.feature.review.activities.ReviewActivityFlashcardFragment)
          (r7v16 com.lingq.feature.review.activities.ReviewActivityFlashcardFragment)
         binds: [B:100:0x02d4, B:7:0x001d] A[DONT_GENERATE, DONT_INLINE]
          0x02d7: PHI (r14v93 java.lang.Object) = (r14v91 java.lang.Object), (r14v0 java.lang.Object) binds: [B:100:0x02d4, B:7:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:104:0x02df  */
        /* JADX WARN: Code duplicated, block: B:105:0x02e5  */
        /* JADX WARN: Code duplicated, block: B:109:0x0307  */
        /* JADX WARN: Code duplicated, block: B:112:0x0311  */
        /* JADX WARN: Code duplicated, block: B:113:0x0318  */
        /* JADX WARN: Code duplicated, block: B:43:0x0140  */
        /* JADX WARN: Code duplicated, block: B:44:0x014b  */
        /* JADX WARN: Code duplicated, block: B:48:0x0172 A[PHI: r2 r5 r6 r7 r14
          0x0172: PHI (r2v7 int) = (r2v5 int), (r2v8 int) binds: [B:46:0x016e, B:14:0x0074] A[DONT_GENERATE, DONT_INLINE]
          0x0172: PHI (r5v5 int) = (r5v3 int), (r5v6 int) binds: [B:46:0x016e, B:14:0x0074] A[DONT_GENERATE, DONT_INLINE]
          0x0172: PHI (r6v13 bf3) = (r6v11 bf3), (r6v14 bf3) binds: [B:46:0x016e, B:14:0x0074] A[DONT_GENERATE, DONT_INLINE]
          0x0172: PHI (r7v3 com.lingq.feature.review.activities.ReviewActivityFlashcardFragment) = 
          (r7v1 com.lingq.feature.review.activities.ReviewActivityFlashcardFragment)
          (r7v4 com.lingq.feature.review.activities.ReviewActivityFlashcardFragment)
         binds: [B:46:0x016e, B:14:0x0074] A[DONT_GENERATE, DONT_INLINE]
          0x0172: PHI (r14v32 java.lang.Object) = (r14v29 java.lang.Object), (r14v0 java.lang.Object) binds: [B:46:0x016e, B:14:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:50:0x017a  */
        /* JADX WARN: Code duplicated, block: B:51:0x0180  */
        /* JADX WARN: Code duplicated, block: B:55:0x01a2 A[PHI: r2 r5 r6 r7 r14
          0x01a2: PHI (r2v9 int) = (r2v7 int), (r2v10 int) binds: [B:53:0x019e, B:13:0x0067] A[DONT_GENERATE, DONT_INLINE]
          0x01a2: PHI (r5v7 int) = (r5v5 int), (r5v8 int) binds: [B:53:0x019e, B:13:0x0067] A[DONT_GENERATE, DONT_INLINE]
          0x01a2: PHI (r6v15 bf3) = (r6v13 bf3), (r6v16 bf3) binds: [B:53:0x019e, B:13:0x0067] A[DONT_GENERATE, DONT_INLINE]
          0x01a2: PHI (r7v5 com.lingq.feature.review.activities.ReviewActivityFlashcardFragment) = 
          (r7v3 com.lingq.feature.review.activities.ReviewActivityFlashcardFragment)
          (r7v6 com.lingq.feature.review.activities.ReviewActivityFlashcardFragment)
         binds: [B:53:0x019e, B:13:0x0067] A[DONT_GENERATE, DONT_INLINE]
          0x01a2: PHI (r14v41 java.lang.Object) = (r14v39 java.lang.Object), (r14v0 java.lang.Object) binds: [B:53:0x019e, B:13:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:57:0x01aa  */
        /* JADX WARN: Code duplicated, block: B:58:0x01b0  */
        /* JADX WARN: Code duplicated, block: B:62:0x01d1 A[PHI: r2 r5 r6 r7 r14
          0x01d1: PHI (r2v11 int) = (r2v9 int), (r2v13 int) binds: [B:60:0x01cd, B:12:0x005a] A[DONT_GENERATE, DONT_INLINE]
          0x01d1: PHI (r5v9 int) = (r5v7 int), (r5v10 int) binds: [B:60:0x01cd, B:12:0x005a] A[DONT_GENERATE, DONT_INLINE]
          0x01d1: PHI (r6v17 bf3) = (r6v15 bf3), (r6v18 bf3) binds: [B:60:0x01cd, B:12:0x005a] A[DONT_GENERATE, DONT_INLINE]
          0x01d1: PHI (r7v7 com.lingq.feature.review.activities.ReviewActivityFlashcardFragment) = 
          (r7v5 com.lingq.feature.review.activities.ReviewActivityFlashcardFragment)
          (r7v8 com.lingq.feature.review.activities.ReviewActivityFlashcardFragment)
         binds: [B:60:0x01cd, B:12:0x005a] A[DONT_GENERATE, DONT_INLINE]
          0x01d1: PHI (r14v50 java.lang.Object) = (r14v48 java.lang.Object), (r14v0 java.lang.Object) binds: [B:60:0x01cd, B:12:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:64:0x01d9  */
        /* JADX WARN: Code duplicated, block: B:65:0x01df  */
        /* JADX WARN: Code duplicated, block: B:69:0x0201  */
        /* JADX WARN: Code duplicated, block: B:72:0x020b  */
        /* JADX WARN: Code duplicated, block: B:73:0x0211  */
        /* JADX WARN: Code duplicated, block: B:83:0x0245  */
        /* JADX WARN: Code duplicated, block: B:84:0x0250  */
        /* JADX WARN: Code duplicated, block: B:88:0x0277 A[PHI: r2 r5 r6 r7 r14
          0x0277: PHI (r2v16 int) = (r2v14 int), (r2v17 int) binds: [B:86:0x0273, B:9:0x0037] A[DONT_GENERATE, DONT_INLINE]
          0x0277: PHI (r5v13 int) = (r5v11 int), (r5v14 int) binds: [B:86:0x0273, B:9:0x0037] A[DONT_GENERATE, DONT_INLINE]
          0x0277: PHI (r6v21 bf3) = (r6v19 bf3), (r6v22 bf3) binds: [B:86:0x0273, B:9:0x0037] A[DONT_GENERATE, DONT_INLINE]
          0x0277: PHI (r7v11 com.lingq.feature.review.activities.ReviewActivityFlashcardFragment) = 
          (r7v9 com.lingq.feature.review.activities.ReviewActivityFlashcardFragment)
          (r7v12 com.lingq.feature.review.activities.ReviewActivityFlashcardFragment)
         binds: [B:86:0x0273, B:9:0x0037] A[DONT_GENERATE, DONT_INLINE]
          0x0277: PHI (r14v75 java.lang.Object) = (r14v72 java.lang.Object), (r14v0 java.lang.Object) binds: [B:86:0x0273, B:9:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:90:0x027f  */
        /* JADX WARN: Code duplicated, block: B:91:0x0285  */
        /* JADX WARN: Code duplicated, block: B:95:0x02a7 A[PHI: r2 r5 r6 r7 r14
          0x02a7: PHI (r2v18 int) = (r2v16 int), (r2v19 int) binds: [B:93:0x02a4, B:8:0x002a] A[DONT_GENERATE, DONT_INLINE]
          0x02a7: PHI (r5v15 int) = (r5v13 int), (r5v16 int) binds: [B:93:0x02a4, B:8:0x002a] A[DONT_GENERATE, DONT_INLINE]
          0x02a7: PHI (r6v23 bf3) = (r6v21 bf3), (r6v24 bf3) binds: [B:93:0x02a4, B:8:0x002a] A[DONT_GENERATE, DONT_INLINE]
          0x02a7: PHI (r7v13 com.lingq.feature.review.activities.ReviewActivityFlashcardFragment) = 
          (r7v11 com.lingq.feature.review.activities.ReviewActivityFlashcardFragment)
          (r7v14 com.lingq.feature.review.activities.ReviewActivityFlashcardFragment)
         binds: [B:93:0x02a4, B:8:0x002a] A[DONT_GENERATE, DONT_INLINE]
          0x02a7: PHI (r14v84 java.lang.Object) = (r14v82 java.lang.Object), (r14v0 java.lang.Object) binds: [B:93:0x02a4, B:8:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:97:0x02af  */
        /* JADX WARN: Code duplicated, block: B:98:0x02b5  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ReviewActivityFlashcardFragment reviewActivityFlashcardFragment;
            bf3 bf3VarM9536R0;
            int i;
            int i2;
            int i3;
            int i4;
            bf3 bf3Var;
            ReviewActivityFlashcardFragment reviewActivityFlashcardFragment2;
            LessonCard lessonCard = (LessonCard) this.f31947f;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = 1;
            switch (this.f31946e) {
                case 0:
                    AbstractC3193b.m15359b(obj);
                    if (lessonCard != null) {
                        bh4[] bh4VarArr = ReviewActivityFlashcardFragment.f31913H0;
                        reviewActivityFlashcardFragment = this.f31948g;
                        C2750e c2750eM9539U0 = reviewActivityFlashcardFragment.m9539U0();
                        nb8 nb8Var = this.f31949h;
                        boolean z = nb8Var instanceof gb8;
                        ReviewSettingsKeys reviewSettingsKeys = (!z && (nb8Var instanceof hb8)) ? ReviewSettingsKeys.ReverseFlashcards : ReviewSettingsKeys.Flashcards;
                        c2750eM9539U0.m9560V2(reviewSettingsKeys);
                        C2750e c2750eM9539U1 = reviewActivityFlashcardFragment.m9539U0();
                        ReviewSettingsKeys reviewSettingsKeys2 = (!z && (nb8Var instanceof hb8)) ? ReviewSettingsKeys.ReverseFlashcardsFrontTransliteration : ReviewSettingsKeys.FlashcardsFrontTransliteration;
                        c2750eM9539U1.m9561W2(reviewSettingsKeys2);
                        bf3VarM9536R0 = reviewActivityFlashcardFragment.m9536R0();
                        TextView textView = bf3VarM9536R0.f8457e;
                        ViewLearnProgress viewLearnProgress = bf3VarM9536R0.f8461i;
                        String str = lessonCard.f19181d;
                        String strM17124i = AbstractC3352my.m17124i(lessonCard.f19178a);
                        List list = lessonCard.f19180c;
                        if (list.isEmpty()) {
                            list = lessonCard.f19179b;
                        }
                        textView.setText(AbstractC3352my.m17122h(str, strM17124i, list));
                        bf3VarM9536R0.f8458f.setText(t7d.m21897b(lessonCard.f19183f));
                        bf3VarM9536R0.f8456d.setText(lessonCard.f19185h);
                        viewLearnProgress.m8708b((vs3) reviewActivityFlashcardFragment.m9539U0().f32367E.getValue(), lessonCard.f19188k, lessonCard.f19189l);
                        viewLearnProgress.setOnChangeStatusListener(new C2746a(0, reviewActivityFlashcardFragment));
                        if (z) {
                            mg8 mg8Var = ((C1370c) reviewActivityFlashcardFragment.m9538T0()).f18507S;
                            this.f31947f = lessonCard;
                            this.f31942a = reviewActivityFlashcardFragment;
                            this.f31943b = bf3VarM9536R0;
                            this.f31944c = 0;
                            this.f31945d = 0;
                            this.f31946e = 1;
                            obj = AbstractC3224d.m15541t(mg8Var, this);
                            if (obj != coroutineSingletons) {
                                i3 = 0;
                                i4 = 0;
                                if (((Boolean) obj).booleanValue()) {
                                    jfa.m14429l(bf3VarM9536R0.f8453a);
                                    jfa.m14429l(bf3VarM9536R0.f8457e);
                                } else {
                                    jfa.m14420c(bf3VarM9536R0.f8453a);
                                    jfa.m14420c(bf3VarM9536R0.f8457e);
                                }
                                mg8 mg8Var2 = ((C1370c) reviewActivityFlashcardFragment.m9538T0()).f18508T;
                                this.f31947f = lessonCard;
                                this.f31942a = reviewActivityFlashcardFragment;
                                this.f31943b = bf3VarM9536R0;
                                this.f31944c = i4;
                                this.f31945d = i3;
                                this.f31946e = 2;
                                obj = AbstractC3224d.m15541t(mg8Var2, this);
                                if (obj != coroutineSingletons) {
                                    if (((Boolean) obj).booleanValue()) {
                                        jfa.m14429l(bf3VarM9536R0.f8458f);
                                    } else {
                                        jfa.m14425h(bf3VarM9536R0.f8458f);
                                    }
                                    lg8 lg8Var = ((C1370c) reviewActivityFlashcardFragment.m9538T0()).f18509U;
                                    this.f31947f = lessonCard;
                                    this.f31942a = reviewActivityFlashcardFragment;
                                    this.f31943b = bf3VarM9536R0;
                                    this.f31944c = i4;
                                    this.f31945d = i3;
                                    this.f31946e = 3;
                                    obj = AbstractC3224d.m15541t(lg8Var, this);
                                    if (obj != coroutineSingletons) {
                                        if (((Boolean) obj).booleanValue()) {
                                            jfa.m14429l(bf3VarM9536R0.f8456d);
                                        } else {
                                            jfa.m14425h(bf3VarM9536R0.f8456d);
                                        }
                                        lg8 lg8Var2 = ((C1370c) reviewActivityFlashcardFragment.m9538T0()).f18510V;
                                        this.f31947f = lessonCard;
                                        this.f31942a = reviewActivityFlashcardFragment;
                                        this.f31943b = bf3VarM9536R0;
                                        this.f31944c = i4;
                                        this.f31945d = i3;
                                        this.f31946e = 4;
                                        obj = AbstractC3224d.m15541t(lg8Var2, this);
                                        if (obj != coroutineSingletons) {
                                            if (((Boolean) obj).booleanValue()) {
                                                jfa.m14429l(bf3VarM9536R0.f8459g);
                                            } else {
                                                jfa.m14420c(bf3VarM9536R0.f8459g);
                                            }
                                            lg8 lg8Var3 = ((C1370c) reviewActivityFlashcardFragment.m9538T0()).f18518b0;
                                            this.f31947f = lessonCard;
                                            this.f31942a = reviewActivityFlashcardFragment;
                                            this.f31943b = bf3VarM9536R0;
                                            this.f31944c = i4;
                                            this.f31945d = i3;
                                            this.f31946e = 5;
                                            obj = AbstractC3224d.m15541t(lg8Var3, this);
                                            if (obj != coroutineSingletons) {
                                                bf3Var = bf3VarM9536R0;
                                                reviewActivityFlashcardFragment2 = reviewActivityFlashcardFragment;
                                                if (((Boolean) obj).booleanValue()) {
                                                    jfa.m14429l(bf3Var.f8454b);
                                                } else {
                                                    jfa.m14425h(bf3Var.f8454b);
                                                }
                                                reviewActivityFlashcardFragment = reviewActivityFlashcardFragment2;
                                                bf3VarM9536R0 = bf3Var;
                                                bf3VarM9536R0.f8453a.setOnClickListener(new qw7(reviewActivityFlashcardFragment, lessonCard, i5));
                                                bf3VarM9536R0.f8460h.setOnClickListener(new ViewOnClickListenerC3135j5(reviewActivityFlashcardFragment, 4));
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (nb8Var instanceof hb8) {
                                lg8 lg8Var4 = ((C1370c) reviewActivityFlashcardFragment.m9538T0()).f18524e0;
                                this.f31947f = lessonCard;
                                this.f31942a = reviewActivityFlashcardFragment;
                                this.f31943b = bf3VarM9536R0;
                                this.f31944c = 0;
                                this.f31945d = 0;
                                this.f31946e = 6;
                                obj = AbstractC3224d.m15541t(lg8Var4, this);
                                if (obj != coroutineSingletons) {
                                    i = 0;
                                    i2 = 0;
                                    if (((Boolean) obj).booleanValue()) {
                                        jfa.m14429l(bf3VarM9536R0.f8453a);
                                        jfa.m14429l(bf3VarM9536R0.f8457e);
                                    } else {
                                        jfa.m14420c(bf3VarM9536R0.f8453a);
                                        jfa.m14420c(bf3VarM9536R0.f8457e);
                                    }
                                    lg8 lg8Var5 = ((C1370c) reviewActivityFlashcardFragment.m9538T0()).f18526f0;
                                    this.f31947f = lessonCard;
                                    this.f31942a = reviewActivityFlashcardFragment;
                                    this.f31943b = bf3VarM9536R0;
                                    this.f31944c = i2;
                                    this.f31945d = i;
                                    this.f31946e = 7;
                                    obj = AbstractC3224d.m15541t(lg8Var5, this);
                                    if (obj != coroutineSingletons) {
                                        if (((Boolean) obj).booleanValue()) {
                                            jfa.m14429l(bf3VarM9536R0.f8458f);
                                        } else {
                                            jfa.m14425h(bf3VarM9536R0.f8458f);
                                        }
                                        lg8 lg8Var6 = ((C1370c) reviewActivityFlashcardFragment.m9538T0()).f18528g0;
                                        this.f31947f = lessonCard;
                                        this.f31942a = reviewActivityFlashcardFragment;
                                        this.f31943b = bf3VarM9536R0;
                                        this.f31944c = i2;
                                        this.f31945d = i;
                                        this.f31946e = 8;
                                        obj = AbstractC3224d.m15541t(lg8Var6, this);
                                        if (obj != coroutineSingletons) {
                                            if (((Boolean) obj).booleanValue()) {
                                                jfa.m14429l(bf3VarM9536R0.f8456d);
                                            } else {
                                                jfa.m14425h(bf3VarM9536R0.f8456d);
                                            }
                                            lg8 lg8Var7 = ((C1370c) reviewActivityFlashcardFragment.m9538T0()).f18530h0;
                                            this.f31947f = lessonCard;
                                            this.f31942a = reviewActivityFlashcardFragment;
                                            this.f31943b = bf3VarM9536R0;
                                            this.f31944c = i2;
                                            this.f31945d = i;
                                            this.f31946e = 9;
                                            obj = AbstractC3224d.m15541t(lg8Var7, this);
                                            if (obj != coroutineSingletons) {
                                                if (((Boolean) obj).booleanValue()) {
                                                    jfa.m14429l(bf3VarM9536R0.f8459g);
                                                } else {
                                                    jfa.m14420c(bf3VarM9536R0.f8459g);
                                                }
                                                lg8 lg8Var8 = ((C1370c) reviewActivityFlashcardFragment.m9538T0()).f18540m0;
                                                this.f31947f = lessonCard;
                                                this.f31942a = reviewActivityFlashcardFragment;
                                                this.f31943b = bf3VarM9536R0;
                                                this.f31944c = i2;
                                                this.f31945d = i;
                                                this.f31946e = 10;
                                                obj = AbstractC3224d.m15541t(lg8Var8, this);
                                                if (obj != coroutineSingletons) {
                                                    bf3Var = bf3VarM9536R0;
                                                    reviewActivityFlashcardFragment2 = reviewActivityFlashcardFragment;
                                                    if (((Boolean) obj).booleanValue()) {
                                                        jfa.m14429l(bf3Var.f8454b);
                                                    } else {
                                                        jfa.m14425h(bf3Var.f8454b);
                                                    }
                                                    reviewActivityFlashcardFragment = reviewActivityFlashcardFragment2;
                                                    bf3VarM9536R0 = bf3Var;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            bf3VarM9536R0.f8453a.setOnClickListener(new qw7(reviewActivityFlashcardFragment, lessonCard, i5));
                            bf3VarM9536R0.f8460h.setOnClickListener(new ViewOnClickListenerC3135j5(reviewActivityFlashcardFragment, 4));
                        }
                        return coroutineSingletons;
                    }
                    return xfa.f68157a;
                case 1:
                    i3 = this.f31945d;
                    i4 = this.f31944c;
                    bf3VarM9536R0 = this.f31943b;
                    reviewActivityFlashcardFragment = this.f31942a;
                    AbstractC3193b.m15359b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        jfa.m14429l(bf3VarM9536R0.f8453a);
                        jfa.m14429l(bf3VarM9536R0.f8457e);
                    } else {
                        jfa.m14420c(bf3VarM9536R0.f8453a);
                        jfa.m14420c(bf3VarM9536R0.f8457e);
                    }
                    mg8 mg8Var3 = ((C1370c) reviewActivityFlashcardFragment.m9538T0()).f18508T;
                    this.f31947f = lessonCard;
                    this.f31942a = reviewActivityFlashcardFragment;
                    this.f31943b = bf3VarM9536R0;
                    this.f31944c = i4;
                    this.f31945d = i3;
                    this.f31946e = 2;
                    obj = AbstractC3224d.m15541t(mg8Var3, this);
                    if (obj != coroutineSingletons) {
                        if (((Boolean) obj).booleanValue()) {
                            jfa.m14425h(bf3VarM9536R0.f8458f);
                        } else {
                            jfa.m14429l(bf3VarM9536R0.f8458f);
                        }
                        lg8 lg8Var9 = ((C1370c) reviewActivityFlashcardFragment.m9538T0()).f18509U;
                        this.f31947f = lessonCard;
                        this.f31942a = reviewActivityFlashcardFragment;
                        this.f31943b = bf3VarM9536R0;
                        this.f31944c = i4;
                        this.f31945d = i3;
                        this.f31946e = 3;
                        obj = AbstractC3224d.m15541t(lg8Var9, this);
                        if (obj != coroutineSingletons) {
                            if (((Boolean) obj).booleanValue()) {
                                jfa.m14425h(bf3VarM9536R0.f8456d);
                            } else {
                                jfa.m14429l(bf3VarM9536R0.f8456d);
                            }
                            lg8 lg8Var10 = ((C1370c) reviewActivityFlashcardFragment.m9538T0()).f18510V;
                            this.f31947f = lessonCard;
                            this.f31942a = reviewActivityFlashcardFragment;
                            this.f31943b = bf3VarM9536R0;
                            this.f31944c = i4;
                            this.f31945d = i3;
                            this.f31946e = 4;
                            obj = AbstractC3224d.m15541t(lg8Var10, this);
                            if (obj != coroutineSingletons) {
                                if (((Boolean) obj).booleanValue()) {
                                    jfa.m14420c(bf3VarM9536R0.f8459g);
                                } else {
                                    jfa.m14429l(bf3VarM9536R0.f8459g);
                                }
                                lg8 lg8Var11 = ((C1370c) reviewActivityFlashcardFragment.m9538T0()).f18518b0;
                                this.f31947f = lessonCard;
                                this.f31942a = reviewActivityFlashcardFragment;
                                this.f31943b = bf3VarM9536R0;
                                this.f31944c = i4;
                                this.f31945d = i3;
                                this.f31946e = 5;
                                obj = AbstractC3224d.m15541t(lg8Var11, this);
                                if (obj != coroutineSingletons) {
                                    bf3Var = bf3VarM9536R0;
                                    reviewActivityFlashcardFragment2 = reviewActivityFlashcardFragment;
                                    if (((Boolean) obj).booleanValue()) {
                                        jfa.m14425h(bf3Var.f8454b);
                                    } else {
                                        jfa.m14429l(bf3Var.f8454b);
                                    }
                                    reviewActivityFlashcardFragment = reviewActivityFlashcardFragment2;
                                    bf3VarM9536R0 = bf3Var;
                                    bf3VarM9536R0.f8453a.setOnClickListener(new qw7(reviewActivityFlashcardFragment, lessonCard, i5));
                                    bf3VarM9536R0.f8460h.setOnClickListener(new ViewOnClickListenerC3135j5(reviewActivityFlashcardFragment, 4));
                                    return xfa.f68157a;
                                }
                            }
                        }
                    }
                    return coroutineSingletons;
                case 2:
                    i3 = this.f31945d;
                    i4 = this.f31944c;
                    bf3VarM9536R0 = this.f31943b;
                    reviewActivityFlashcardFragment = this.f31942a;
                    AbstractC3193b.m15359b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        jfa.m14425h(bf3VarM9536R0.f8458f);
                    } else {
                        jfa.m14429l(bf3VarM9536R0.f8458f);
                    }
                    lg8 lg8Var12 = ((C1370c) reviewActivityFlashcardFragment.m9538T0()).f18509U;
                    this.f31947f = lessonCard;
                    this.f31942a = reviewActivityFlashcardFragment;
                    this.f31943b = bf3VarM9536R0;
                    this.f31944c = i4;
                    this.f31945d = i3;
                    this.f31946e = 3;
                    obj = AbstractC3224d.m15541t(lg8Var12, this);
                    if (obj != coroutineSingletons) {
                        if (((Boolean) obj).booleanValue()) {
                            jfa.m14425h(bf3VarM9536R0.f8456d);
                        } else {
                            jfa.m14429l(bf3VarM9536R0.f8456d);
                        }
                        lg8 lg8Var13 = ((C1370c) reviewActivityFlashcardFragment.m9538T0()).f18510V;
                        this.f31947f = lessonCard;
                        this.f31942a = reviewActivityFlashcardFragment;
                        this.f31943b = bf3VarM9536R0;
                        this.f31944c = i4;
                        this.f31945d = i3;
                        this.f31946e = 4;
                        obj = AbstractC3224d.m15541t(lg8Var13, this);
                        if (obj != coroutineSingletons) {
                            if (((Boolean) obj).booleanValue()) {
                                jfa.m14420c(bf3VarM9536R0.f8459g);
                            } else {
                                jfa.m14429l(bf3VarM9536R0.f8459g);
                            }
                            lg8 lg8Var14 = ((C1370c) reviewActivityFlashcardFragment.m9538T0()).f18518b0;
                            this.f31947f = lessonCard;
                            this.f31942a = reviewActivityFlashcardFragment;
                            this.f31943b = bf3VarM9536R0;
                            this.f31944c = i4;
                            this.f31945d = i3;
                            this.f31946e = 5;
                            obj = AbstractC3224d.m15541t(lg8Var14, this);
                            if (obj != coroutineSingletons) {
                                bf3Var = bf3VarM9536R0;
                                reviewActivityFlashcardFragment2 = reviewActivityFlashcardFragment;
                                if (((Boolean) obj).booleanValue()) {
                                    jfa.m14425h(bf3Var.f8454b);
                                } else {
                                    jfa.m14429l(bf3Var.f8454b);
                                }
                                reviewActivityFlashcardFragment = reviewActivityFlashcardFragment2;
                                bf3VarM9536R0 = bf3Var;
                                bf3VarM9536R0.f8453a.setOnClickListener(new qw7(reviewActivityFlashcardFragment, lessonCard, i5));
                                bf3VarM9536R0.f8460h.setOnClickListener(new ViewOnClickListenerC3135j5(reviewActivityFlashcardFragment, 4));
                                return xfa.f68157a;
                            }
                        }
                    }
                    return coroutineSingletons;
                case 3:
                    i3 = this.f31945d;
                    i4 = this.f31944c;
                    bf3VarM9536R0 = this.f31943b;
                    reviewActivityFlashcardFragment = this.f31942a;
                    AbstractC3193b.m15359b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        jfa.m14425h(bf3VarM9536R0.f8456d);
                    } else {
                        jfa.m14429l(bf3VarM9536R0.f8456d);
                    }
                    lg8 lg8Var15 = ((C1370c) reviewActivityFlashcardFragment.m9538T0()).f18510V;
                    this.f31947f = lessonCard;
                    this.f31942a = reviewActivityFlashcardFragment;
                    this.f31943b = bf3VarM9536R0;
                    this.f31944c = i4;
                    this.f31945d = i3;
                    this.f31946e = 4;
                    obj = AbstractC3224d.m15541t(lg8Var15, this);
                    if (obj != coroutineSingletons) {
                        if (((Boolean) obj).booleanValue()) {
                            jfa.m14420c(bf3VarM9536R0.f8459g);
                        } else {
                            jfa.m14429l(bf3VarM9536R0.f8459g);
                        }
                        lg8 lg8Var16 = ((C1370c) reviewActivityFlashcardFragment.m9538T0()).f18518b0;
                        this.f31947f = lessonCard;
                        this.f31942a = reviewActivityFlashcardFragment;
                        this.f31943b = bf3VarM9536R0;
                        this.f31944c = i4;
                        this.f31945d = i3;
                        this.f31946e = 5;
                        obj = AbstractC3224d.m15541t(lg8Var16, this);
                        if (obj != coroutineSingletons) {
                            bf3Var = bf3VarM9536R0;
                            reviewActivityFlashcardFragment2 = reviewActivityFlashcardFragment;
                            if (((Boolean) obj).booleanValue()) {
                                jfa.m14425h(bf3Var.f8454b);
                            } else {
                                jfa.m14429l(bf3Var.f8454b);
                            }
                            reviewActivityFlashcardFragment = reviewActivityFlashcardFragment2;
                            bf3VarM9536R0 = bf3Var;
                            bf3VarM9536R0.f8453a.setOnClickListener(new qw7(reviewActivityFlashcardFragment, lessonCard, i5));
                            bf3VarM9536R0.f8460h.setOnClickListener(new ViewOnClickListenerC3135j5(reviewActivityFlashcardFragment, 4));
                            return xfa.f68157a;
                        }
                    }
                    return coroutineSingletons;
                case 4:
                    i3 = this.f31945d;
                    i4 = this.f31944c;
                    bf3VarM9536R0 = this.f31943b;
                    reviewActivityFlashcardFragment = this.f31942a;
                    AbstractC3193b.m15359b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        jfa.m14420c(bf3VarM9536R0.f8459g);
                    } else {
                        jfa.m14429l(bf3VarM9536R0.f8459g);
                    }
                    lg8 lg8Var17 = ((C1370c) reviewActivityFlashcardFragment.m9538T0()).f18518b0;
                    this.f31947f = lessonCard;
                    this.f31942a = reviewActivityFlashcardFragment;
                    this.f31943b = bf3VarM9536R0;
                    this.f31944c = i4;
                    this.f31945d = i3;
                    this.f31946e = 5;
                    obj = AbstractC3224d.m15541t(lg8Var17, this);
                    if (obj != coroutineSingletons) {
                        bf3Var = bf3VarM9536R0;
                        reviewActivityFlashcardFragment2 = reviewActivityFlashcardFragment;
                        if (((Boolean) obj).booleanValue()) {
                            jfa.m14425h(bf3Var.f8454b);
                        } else {
                            jfa.m14429l(bf3Var.f8454b);
                        }
                        reviewActivityFlashcardFragment = reviewActivityFlashcardFragment2;
                        bf3VarM9536R0 = bf3Var;
                        bf3VarM9536R0.f8453a.setOnClickListener(new qw7(reviewActivityFlashcardFragment, lessonCard, i5));
                        bf3VarM9536R0.f8460h.setOnClickListener(new ViewOnClickListenerC3135j5(reviewActivityFlashcardFragment, 4));
                        return xfa.f68157a;
                    }
                    return coroutineSingletons;
                case 5:
                    bf3Var = this.f31943b;
                    reviewActivityFlashcardFragment2 = this.f31942a;
                    AbstractC3193b.m15359b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        jfa.m14425h(bf3Var.f8454b);
                    } else {
                        jfa.m14429l(bf3Var.f8454b);
                    }
                    reviewActivityFlashcardFragment = reviewActivityFlashcardFragment2;
                    bf3VarM9536R0 = bf3Var;
                    bf3VarM9536R0.f8453a.setOnClickListener(new qw7(reviewActivityFlashcardFragment, lessonCard, i5));
                    bf3VarM9536R0.f8460h.setOnClickListener(new ViewOnClickListenerC3135j5(reviewActivityFlashcardFragment, 4));
                    return xfa.f68157a;
                case 6:
                    i = this.f31945d;
                    i2 = this.f31944c;
                    bf3VarM9536R0 = this.f31943b;
                    reviewActivityFlashcardFragment = this.f31942a;
                    AbstractC3193b.m15359b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        jfa.m14429l(bf3VarM9536R0.f8453a);
                        jfa.m14429l(bf3VarM9536R0.f8457e);
                    } else {
                        jfa.m14420c(bf3VarM9536R0.f8453a);
                        jfa.m14420c(bf3VarM9536R0.f8457e);
                    }
                    lg8 lg8Var18 = ((C1370c) reviewActivityFlashcardFragment.m9538T0()).f18526f0;
                    this.f31947f = lessonCard;
                    this.f31942a = reviewActivityFlashcardFragment;
                    this.f31943b = bf3VarM9536R0;
                    this.f31944c = i2;
                    this.f31945d = i;
                    this.f31946e = 7;
                    obj = AbstractC3224d.m15541t(lg8Var18, this);
                    if (obj != coroutineSingletons) {
                        if (((Boolean) obj).booleanValue()) {
                            jfa.m14425h(bf3VarM9536R0.f8458f);
                        } else {
                            jfa.m14429l(bf3VarM9536R0.f8458f);
                        }
                        lg8 lg8Var19 = ((C1370c) reviewActivityFlashcardFragment.m9538T0()).f18528g0;
                        this.f31947f = lessonCard;
                        this.f31942a = reviewActivityFlashcardFragment;
                        this.f31943b = bf3VarM9536R0;
                        this.f31944c = i2;
                        this.f31945d = i;
                        this.f31946e = 8;
                        obj = AbstractC3224d.m15541t(lg8Var19, this);
                        if (obj != coroutineSingletons) {
                            if (((Boolean) obj).booleanValue()) {
                                jfa.m14425h(bf3VarM9536R0.f8456d);
                            } else {
                                jfa.m14429l(bf3VarM9536R0.f8456d);
                            }
                            lg8 lg8Var20 = ((C1370c) reviewActivityFlashcardFragment.m9538T0()).f18530h0;
                            this.f31947f = lessonCard;
                            this.f31942a = reviewActivityFlashcardFragment;
                            this.f31943b = bf3VarM9536R0;
                            this.f31944c = i2;
                            this.f31945d = i;
                            this.f31946e = 9;
                            obj = AbstractC3224d.m15541t(lg8Var20, this);
                            if (obj != coroutineSingletons) {
                                if (((Boolean) obj).booleanValue()) {
                                    jfa.m14420c(bf3VarM9536R0.f8459g);
                                } else {
                                    jfa.m14429l(bf3VarM9536R0.f8459g);
                                }
                                lg8 lg8Var21 = ((C1370c) reviewActivityFlashcardFragment.m9538T0()).f18540m0;
                                this.f31947f = lessonCard;
                                this.f31942a = reviewActivityFlashcardFragment;
                                this.f31943b = bf3VarM9536R0;
                                this.f31944c = i2;
                                this.f31945d = i;
                                this.f31946e = 10;
                                obj = AbstractC3224d.m15541t(lg8Var21, this);
                                if (obj != coroutineSingletons) {
                                    bf3Var = bf3VarM9536R0;
                                    reviewActivityFlashcardFragment2 = reviewActivityFlashcardFragment;
                                    if (((Boolean) obj).booleanValue()) {
                                        jfa.m14425h(bf3Var.f8454b);
                                    } else {
                                        jfa.m14429l(bf3Var.f8454b);
                                    }
                                    reviewActivityFlashcardFragment = reviewActivityFlashcardFragment2;
                                    bf3VarM9536R0 = bf3Var;
                                    bf3VarM9536R0.f8453a.setOnClickListener(new qw7(reviewActivityFlashcardFragment, lessonCard, i5));
                                    bf3VarM9536R0.f8460h.setOnClickListener(new ViewOnClickListenerC3135j5(reviewActivityFlashcardFragment, 4));
                                    return xfa.f68157a;
                                }
                            }
                        }
                    }
                    return coroutineSingletons;
                case 7:
                    i = this.f31945d;
                    i2 = this.f31944c;
                    bf3VarM9536R0 = this.f31943b;
                    reviewActivityFlashcardFragment = this.f31942a;
                    AbstractC3193b.m15359b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        jfa.m14425h(bf3VarM9536R0.f8458f);
                    } else {
                        jfa.m14429l(bf3VarM9536R0.f8458f);
                    }
                    lg8 lg8Var110 = ((C1370c) reviewActivityFlashcardFragment.m9538T0()).f18528g0;
                    this.f31947f = lessonCard;
                    this.f31942a = reviewActivityFlashcardFragment;
                    this.f31943b = bf3VarM9536R0;
                    this.f31944c = i2;
                    this.f31945d = i;
                    this.f31946e = 8;
                    obj = AbstractC3224d.m15541t(lg8Var110, this);
                    if (obj != coroutineSingletons) {
                        if (((Boolean) obj).booleanValue()) {
                            jfa.m14425h(bf3VarM9536R0.f8456d);
                        } else {
                            jfa.m14429l(bf3VarM9536R0.f8456d);
                        }
                        lg8 lg8Var22 = ((C1370c) reviewActivityFlashcardFragment.m9538T0()).f18530h0;
                        this.f31947f = lessonCard;
                        this.f31942a = reviewActivityFlashcardFragment;
                        this.f31943b = bf3VarM9536R0;
                        this.f31944c = i2;
                        this.f31945d = i;
                        this.f31946e = 9;
                        obj = AbstractC3224d.m15541t(lg8Var22, this);
                        if (obj != coroutineSingletons) {
                            if (((Boolean) obj).booleanValue()) {
                                jfa.m14420c(bf3VarM9536R0.f8459g);
                            } else {
                                jfa.m14429l(bf3VarM9536R0.f8459g);
                            }
                            lg8 lg8Var23 = ((C1370c) reviewActivityFlashcardFragment.m9538T0()).f18540m0;
                            this.f31947f = lessonCard;
                            this.f31942a = reviewActivityFlashcardFragment;
                            this.f31943b = bf3VarM9536R0;
                            this.f31944c = i2;
                            this.f31945d = i;
                            this.f31946e = 10;
                            obj = AbstractC3224d.m15541t(lg8Var23, this);
                            if (obj != coroutineSingletons) {
                                bf3Var = bf3VarM9536R0;
                                reviewActivityFlashcardFragment2 = reviewActivityFlashcardFragment;
                                if (((Boolean) obj).booleanValue()) {
                                    jfa.m14425h(bf3Var.f8454b);
                                } else {
                                    jfa.m14429l(bf3Var.f8454b);
                                }
                                reviewActivityFlashcardFragment = reviewActivityFlashcardFragment2;
                                bf3VarM9536R0 = bf3Var;
                                bf3VarM9536R0.f8453a.setOnClickListener(new qw7(reviewActivityFlashcardFragment, lessonCard, i5));
                                bf3VarM9536R0.f8460h.setOnClickListener(new ViewOnClickListenerC3135j5(reviewActivityFlashcardFragment, 4));
                                return xfa.f68157a;
                            }
                        }
                    }
                    return coroutineSingletons;
                case 8:
                    i = this.f31945d;
                    i2 = this.f31944c;
                    bf3VarM9536R0 = this.f31943b;
                    reviewActivityFlashcardFragment = this.f31942a;
                    AbstractC3193b.m15359b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        jfa.m14425h(bf3VarM9536R0.f8456d);
                    } else {
                        jfa.m14429l(bf3VarM9536R0.f8456d);
                    }
                    lg8 lg8Var24 = ((C1370c) reviewActivityFlashcardFragment.m9538T0()).f18530h0;
                    this.f31947f = lessonCard;
                    this.f31942a = reviewActivityFlashcardFragment;
                    this.f31943b = bf3VarM9536R0;
                    this.f31944c = i2;
                    this.f31945d = i;
                    this.f31946e = 9;
                    obj = AbstractC3224d.m15541t(lg8Var24, this);
                    if (obj != coroutineSingletons) {
                        if (((Boolean) obj).booleanValue()) {
                            jfa.m14420c(bf3VarM9536R0.f8459g);
                        } else {
                            jfa.m14429l(bf3VarM9536R0.f8459g);
                        }
                        lg8 lg8Var25 = ((C1370c) reviewActivityFlashcardFragment.m9538T0()).f18540m0;
                        this.f31947f = lessonCard;
                        this.f31942a = reviewActivityFlashcardFragment;
                        this.f31943b = bf3VarM9536R0;
                        this.f31944c = i2;
                        this.f31945d = i;
                        this.f31946e = 10;
                        obj = AbstractC3224d.m15541t(lg8Var25, this);
                        if (obj != coroutineSingletons) {
                            bf3Var = bf3VarM9536R0;
                            reviewActivityFlashcardFragment2 = reviewActivityFlashcardFragment;
                            if (((Boolean) obj).booleanValue()) {
                                jfa.m14425h(bf3Var.f8454b);
                            } else {
                                jfa.m14429l(bf3Var.f8454b);
                            }
                            reviewActivityFlashcardFragment = reviewActivityFlashcardFragment2;
                            bf3VarM9536R0 = bf3Var;
                            bf3VarM9536R0.f8453a.setOnClickListener(new qw7(reviewActivityFlashcardFragment, lessonCard, i5));
                            bf3VarM9536R0.f8460h.setOnClickListener(new ViewOnClickListenerC3135j5(reviewActivityFlashcardFragment, 4));
                            return xfa.f68157a;
                        }
                    }
                    return coroutineSingletons;
                case 9:
                    i = this.f31945d;
                    i2 = this.f31944c;
                    bf3VarM9536R0 = this.f31943b;
                    reviewActivityFlashcardFragment = this.f31942a;
                    AbstractC3193b.m15359b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        jfa.m14420c(bf3VarM9536R0.f8459g);
                    } else {
                        jfa.m14429l(bf3VarM9536R0.f8459g);
                    }
                    lg8 lg8Var26 = ((C1370c) reviewActivityFlashcardFragment.m9538T0()).f18540m0;
                    this.f31947f = lessonCard;
                    this.f31942a = reviewActivityFlashcardFragment;
                    this.f31943b = bf3VarM9536R0;
                    this.f31944c = i2;
                    this.f31945d = i;
                    this.f31946e = 10;
                    obj = AbstractC3224d.m15541t(lg8Var26, this);
                    if (obj != coroutineSingletons) {
                        bf3Var = bf3VarM9536R0;
                        reviewActivityFlashcardFragment2 = reviewActivityFlashcardFragment;
                        if (((Boolean) obj).booleanValue()) {
                            jfa.m14425h(bf3Var.f8454b);
                        } else {
                            jfa.m14429l(bf3Var.f8454b);
                        }
                        reviewActivityFlashcardFragment = reviewActivityFlashcardFragment2;
                        bf3VarM9536R0 = bf3Var;
                        bf3VarM9536R0.f8453a.setOnClickListener(new qw7(reviewActivityFlashcardFragment, lessonCard, i5));
                        bf3VarM9536R0.f8460h.setOnClickListener(new ViewOnClickListenerC3135j5(reviewActivityFlashcardFragment, 4));
                        return xfa.f68157a;
                    }
                    return coroutineSingletons;
                case 10:
                    bf3Var = this.f31943b;
                    reviewActivityFlashcardFragment2 = this.f31942a;
                    AbstractC3193b.m15359b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        jfa.m14425h(bf3Var.f8454b);
                    } else {
                        jfa.m14429l(bf3Var.f8454b);
                    }
                    reviewActivityFlashcardFragment = reviewActivityFlashcardFragment2;
                    bf3VarM9536R0 = bf3Var;
                    bf3VarM9536R0.f8453a.setOnClickListener(new qw7(reviewActivityFlashcardFragment, lessonCard, i5));
                    bf3VarM9536R0.f8460h.setOnClickListener(new ViewOnClickListenerC3135j5(reviewActivityFlashcardFragment, 4));
                    return xfa.f68157a;
                default:
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityFlashcardFragment$onViewCreated$2$4(nb8 nb8Var, ReviewActivityFlashcardFragment reviewActivityFlashcardFragment, Continuation continuation) {
        super(2, continuation);
        this.f31940b = reviewActivityFlashcardFragment;
        this.f31941c = nb8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewActivityFlashcardFragment$onViewCreated$2$4(this.f31941c, this.f31940b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewActivityFlashcardFragment$onViewCreated$2$4) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31939a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReviewActivityFlashcardFragment.f31913H0;
            ReviewActivityFlashcardFragment reviewActivityFlashcardFragment = this.f31940b;
            c18 c18Var = reviewActivityFlashcardFragment.m9539U0().f32382o;
            C26411 c26411 = new C26411(this.f31941c, reviewActivityFlashcardFragment, null);
            c18Var.getClass();
            this.f31939a = 1;
            if (AbstractC3224d.m15529h(c18Var, c26411, this) == coroutineSingletons) {
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
