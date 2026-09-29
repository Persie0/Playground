package com.lingq.feature.review.activities;

import android.widget.TextView;
import com.lingq.core.datastore.C1370c;
import com.lingq.core.designsystem.R$attr;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.settings.ReviewSettingsKeys;
import com.lingq.core.settings.ViewKeys;
import com.lingq.core.token.components.ViewLearnProgress;
import com.lingq.feature.review.R$string;
import com.lingq.feature.review.data.ReviewActivityResult;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3352my;
import p000.C3386nv;
import p000.ViewOnClickListenerC3135j5;
import p000.bh4;
import p000.c18;
import p000.c32;
import p000.c83;
import p000.db8;
import p000.eb8;
import p000.ef3;
import p000.fa4;
import p000.fb8;
import p000.gb8;
import p000.gm5;
import p000.hb8;
import p000.i19;
import p000.jb8;
import p000.jfa;
import p000.kb8;
import p000.lg8;
import p000.nb8;
import p000.t7d;
import p000.ub8;
import p000.un1;
import p000.ux5;
import p000.vb8;
import p000.vk9;
import p000.vs3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityResultFragment$onViewCreated$2$3", m4291f = "ReviewActivityResultFragment.kt", m4292l = {486}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivityResultFragment$onViewCreated$2$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32094a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReviewActivityResultFragment f32095b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nb8 f32096c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ReviewActivityResult f32097d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f32098e;

    /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivityResultFragment$onViewCreated$2$3$1 */
    @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityResultFragment$onViewCreated$2$3$1", m4291f = "ReviewActivityResultFragment.kt", m4292l = {320, 327, 332, 337, 342, 347, 353, 360, 365, 370, 375, 380, 386, 392, 398}, m4293m = "invokeSuspend", m4294v = 2)
    final class C26861 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public ReviewActivityResultFragment f32099a;

        /* JADX INFO: renamed from: b */
        public ReviewActivityResult f32100b;

        /* JADX INFO: renamed from: c */
        public String f32101c;

        /* JADX INFO: renamed from: d */
        public ef3 f32102d;

        /* JADX INFO: renamed from: e */
        public int f32103e;

        /* JADX INFO: renamed from: f */
        public int f32104f;

        /* JADX INFO: renamed from: g */
        public /* synthetic */ Object f32105g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ ReviewActivityResultFragment f32106h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ nb8 f32107i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ ReviewActivityResult f32108j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ String f32109k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26861(nb8 nb8Var, ReviewActivityResultFragment reviewActivityResultFragment, ReviewActivityResult reviewActivityResult, String str, Continuation continuation) {
            super(2, continuation);
            this.f32106h = reviewActivityResultFragment;
            this.f32107i = nb8Var;
            this.f32108j = reviewActivityResult;
            this.f32109k = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C26861 c26861 = new C26861(this.f32107i, this.f32106h, this.f32108j, this.f32109k, continuation);
            c26861.f32105g = obj;
            return c26861;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C26861) create((LessonCard) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Code duplicated, block: B:100:0x02a6  */
        /* JADX WARN: Code duplicated, block: B:104:0x02ca A[PHI: r3 r5 r10 r11 r12 r13
          0x02ca: PHI (r3v10 int) = (r3v8 int), (r3v11 int) binds: [B:102:0x02c6, B:19:0x00ed] A[DONT_GENERATE, DONT_INLINE]
          0x02ca: PHI (r5v37 java.lang.Object) = (r5v34 java.lang.Object), (r5v46 java.lang.Object) binds: [B:102:0x02c6, B:19:0x00ed] A[DONT_GENERATE, DONT_INLINE]
          0x02ca: PHI (r10v8 ef3) = (r10v6 ef3), (r10v9 ef3) binds: [B:102:0x02c6, B:19:0x00ed] A[DONT_GENERATE, DONT_INLINE]
          0x02ca: PHI (r11v8 java.lang.String) = (r11v6 java.lang.String), (r11v9 java.lang.String) binds: [B:102:0x02c6, B:19:0x00ed] A[DONT_GENERATE, DONT_INLINE]
          0x02ca: PHI (r12v7 com.lingq.feature.review.data.ReviewActivityResult) = (r12v5 com.lingq.feature.review.data.ReviewActivityResult), (r12v8 com.lingq.feature.review.data.ReviewActivityResult) binds: [B:102:0x02c6, B:19:0x00ed] A[DONT_GENERATE, DONT_INLINE]
          0x02ca: PHI (r13v6 com.lingq.feature.review.activities.ReviewActivityResultFragment) = 
          (r13v4 com.lingq.feature.review.activities.ReviewActivityResultFragment)
          (r13v7 com.lingq.feature.review.activities.ReviewActivityResultFragment)
         binds: [B:102:0x02c6, B:19:0x00ed] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:106:0x02d2  */
        /* JADX WARN: Code duplicated, block: B:107:0x02d8  */
        /* JADX WARN: Code duplicated, block: B:111:0x02fc A[PHI: r3 r5 r10 r11 r12 r13
          0x02fc: PHI (r3v12 int) = (r3v10 int), (r3v14 int) binds: [B:109:0x02f8, B:18:0x00dc] A[DONT_GENERATE, DONT_INLINE]
          0x02fc: PHI (r5v47 java.lang.Object) = (r5v44 java.lang.Object), (r5v56 java.lang.Object) binds: [B:109:0x02f8, B:18:0x00dc] A[DONT_GENERATE, DONT_INLINE]
          0x02fc: PHI (r10v10 ef3) = (r10v8 ef3), (r10v11 ef3) binds: [B:109:0x02f8, B:18:0x00dc] A[DONT_GENERATE, DONT_INLINE]
          0x02fc: PHI (r11v10 java.lang.String) = (r11v8 java.lang.String), (r11v11 java.lang.String) binds: [B:109:0x02f8, B:18:0x00dc] A[DONT_GENERATE, DONT_INLINE]
          0x02fc: PHI (r12v9 com.lingq.feature.review.data.ReviewActivityResult) = (r12v7 com.lingq.feature.review.data.ReviewActivityResult), (r12v11 com.lingq.feature.review.data.ReviewActivityResult) binds: [B:109:0x02f8, B:18:0x00dc] A[DONT_GENERATE, DONT_INLINE]
          0x02fc: PHI (r13v8 com.lingq.feature.review.activities.ReviewActivityResultFragment) = 
          (r13v6 com.lingq.feature.review.activities.ReviewActivityResultFragment)
          (r13v9 com.lingq.feature.review.activities.ReviewActivityResultFragment)
         binds: [B:109:0x02f8, B:18:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:113:0x0304  */
        /* JADX WARN: Code duplicated, block: B:114:0x030a  */
        /* JADX WARN: Code duplicated, block: B:118:0x032d  */
        /* JADX WARN: Code duplicated, block: B:121:0x0338  */
        /* JADX WARN: Code duplicated, block: B:127:0x0349  */
        /* JADX WARN: Code duplicated, block: B:131:0x036e  */
        /* JADX WARN: Code duplicated, block: B:134:0x0378  */
        /* JADX WARN: Code duplicated, block: B:135:0x037e  */
        /* JADX WARN: Code duplicated, block: B:146:0x03b7  */
        /* JADX WARN: Code duplicated, block: B:147:0x03c2  */
        /* JADX WARN: Code duplicated, block: B:151:0x03ec A[PHI: r3 r4 r5 r10 r11 r12
          0x03ec: PHI (r3v22 int) = (r3v20 int), (r3v23 int) binds: [B:149:0x03e8, B:14:0x0091] A[DONT_GENERATE, DONT_INLINE]
          0x03ec: PHI (r4v33 java.lang.Object) = (r4v28 java.lang.Object), (r4v43 java.lang.Object) binds: [B:149:0x03e8, B:14:0x0091] A[DONT_GENERATE, DONT_INLINE]
          0x03ec: PHI (r5v62 com.lingq.feature.review.data.ReviewActivityResult) = (r5v60 com.lingq.feature.review.data.ReviewActivityResult), (r5v63 com.lingq.feature.review.data.ReviewActivityResult) binds: [B:149:0x03e8, B:14:0x0091] A[DONT_GENERATE, DONT_INLINE]
          0x03ec: PHI (r10v17 java.lang.String) = (r10v15 java.lang.String), (r10v18 java.lang.String) binds: [B:149:0x03e8, B:14:0x0091] A[DONT_GENERATE, DONT_INLINE]
          0x03ec: PHI (r11v19 ef3) = (r11v16 ef3), (r11v21 ef3) binds: [B:149:0x03e8, B:14:0x0091] A[DONT_GENERATE, DONT_INLINE]
          0x03ec: PHI (r12v18 com.lingq.feature.review.activities.ReviewActivityResultFragment) = 
          (r12v16 com.lingq.feature.review.activities.ReviewActivityResultFragment)
          (r12v19 com.lingq.feature.review.activities.ReviewActivityResultFragment)
         binds: [B:149:0x03e8, B:14:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:153:0x03f4  */
        /* JADX WARN: Code duplicated, block: B:154:0x03fa  */
        /* JADX WARN: Code duplicated, block: B:158:0x041f A[PHI: r3 r4 r5 r10 r11 r12
          0x041f: PHI (r3v24 int) = (r3v22 int), (r3v25 int) binds: [B:156:0x041b, B:13:0x007e] A[DONT_GENERATE, DONT_INLINE]
          0x041f: PHI (r4v44 java.lang.Object) = (r4v40 java.lang.Object), (r4v54 java.lang.Object) binds: [B:156:0x041b, B:13:0x007e] A[DONT_GENERATE, DONT_INLINE]
          0x041f: PHI (r5v64 com.lingq.feature.review.data.ReviewActivityResult) = (r5v62 com.lingq.feature.review.data.ReviewActivityResult), (r5v65 com.lingq.feature.review.data.ReviewActivityResult) binds: [B:156:0x041b, B:13:0x007e] A[DONT_GENERATE, DONT_INLINE]
          0x041f: PHI (r10v19 java.lang.String) = (r10v17 java.lang.String), (r10v20 java.lang.String) binds: [B:156:0x041b, B:13:0x007e] A[DONT_GENERATE, DONT_INLINE]
          0x041f: PHI (r11v22 ef3) = (r11v19 ef3), (r11v24 ef3) binds: [B:156:0x041b, B:13:0x007e] A[DONT_GENERATE, DONT_INLINE]
          0x041f: PHI (r12v20 com.lingq.feature.review.activities.ReviewActivityResultFragment) = 
          (r12v18 com.lingq.feature.review.activities.ReviewActivityResultFragment)
          (r12v21 com.lingq.feature.review.activities.ReviewActivityResultFragment)
         binds: [B:156:0x041b, B:13:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:160:0x0427  */
        /* JADX WARN: Code duplicated, block: B:161:0x042d  */
        /* JADX WARN: Code duplicated, block: B:165:0x0452 A[PHI: r3 r4 r5 r10 r11 r12
          0x0452: PHI (r3v26 int) = (r3v24 int), (r3v27 int) binds: [B:163:0x044e, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
          0x0452: PHI (r4v55 java.lang.Object) = (r4v51 java.lang.Object), (r4v65 java.lang.Object) binds: [B:163:0x044e, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
          0x0452: PHI (r5v66 com.lingq.feature.review.data.ReviewActivityResult) = (r5v64 com.lingq.feature.review.data.ReviewActivityResult), (r5v67 com.lingq.feature.review.data.ReviewActivityResult) binds: [B:163:0x044e, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
          0x0452: PHI (r10v21 java.lang.String) = (r10v19 java.lang.String), (r10v22 java.lang.String) binds: [B:163:0x044e, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
          0x0452: PHI (r11v25 ef3) = (r11v22 ef3), (r11v27 ef3) binds: [B:163:0x044e, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
          0x0452: PHI (r12v22 com.lingq.feature.review.activities.ReviewActivityResultFragment) = 
          (r12v20 com.lingq.feature.review.activities.ReviewActivityResultFragment)
          (r12v23 com.lingq.feature.review.activities.ReviewActivityResultFragment)
         binds: [B:163:0x044e, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:167:0x045a  */
        /* JADX WARN: Code duplicated, block: B:168:0x0460  */
        /* JADX WARN: Code duplicated, block: B:172:0x0485  */
        /* JADX WARN: Code duplicated, block: B:175:0x0490  */
        /* JADX WARN: Code duplicated, block: B:181:0x04a1  */
        /* JADX WARN: Code duplicated, block: B:185:0x04c6  */
        /* JADX WARN: Code duplicated, block: B:188:0x04d0  */
        /* JADX WARN: Code duplicated, block: B:192:0x04df  */
        /* JADX WARN: Code duplicated, block: B:202:0x0528  */
        /* JADX WARN: Code duplicated, block: B:203:0x052e  */
        /* JADX WARN: Code duplicated, block: B:222:0x058a  */
        /* JADX WARN: Code duplicated, block: B:223:0x0590  */
        /* JADX WARN: Code duplicated, block: B:230:0x05d0  */
        /* JADX WARN: Code duplicated, block: B:231:0x05d7  */
        /* JADX WARN: Code duplicated, block: B:234:0x05e8  */
        /* JADX WARN: Code duplicated, block: B:236:0x05eb  */
        /* JADX WARN: Code duplicated, block: B:238:0x05ee  */
        /* JADX WARN: Code duplicated, block: B:240:0x05f1  */
        /* JADX WARN: Code duplicated, block: B:241:0x05f7  */
        /* JADX WARN: Code duplicated, block: B:243:0x05fd  */
        /* JADX WARN: Code duplicated, block: B:244:0x0619  */
        /* JADX WARN: Code duplicated, block: B:245:0x0635  */
        /* JADX WARN: Code duplicated, block: B:247:0x0652  */
        /* JADX WARN: Code duplicated, block: B:251:0x0680  */
        /* JADX WARN: Code duplicated, block: B:92:0x0264  */
        /* JADX WARN: Code duplicated, block: B:93:0x026f  */
        /* JADX WARN: Code duplicated, block: B:97:0x0298 A[PHI: r3 r5 r10 r11 r12 r13
          0x0298: PHI (r3v8 int) = (r3v6 int), (r3v9 int) binds: [B:95:0x0294, B:20:0x00fe] A[DONT_GENERATE, DONT_INLINE]
          0x0298: PHI (r5v27 java.lang.Object) = (r5v24 java.lang.Object), (r5v36 java.lang.Object) binds: [B:95:0x0294, B:20:0x00fe] A[DONT_GENERATE, DONT_INLINE]
          0x0298: PHI (r10v6 ef3) = (r10v4 ef3), (r10v7 ef3) binds: [B:95:0x0294, B:20:0x00fe] A[DONT_GENERATE, DONT_INLINE]
          0x0298: PHI (r11v6 java.lang.String) = (r11v4 java.lang.String), (r11v7 java.lang.String) binds: [B:95:0x0294, B:20:0x00fe] A[DONT_GENERATE, DONT_INLINE]
          0x0298: PHI (r12v5 com.lingq.feature.review.data.ReviewActivityResult) = (r12v3 com.lingq.feature.review.data.ReviewActivityResult), (r12v6 com.lingq.feature.review.data.ReviewActivityResult) binds: [B:95:0x0294, B:20:0x00fe] A[DONT_GENERATE, DONT_INLINE]
          0x0298: PHI (r13v4 com.lingq.feature.review.activities.ReviewActivityResultFragment) = 
          (r13v2 com.lingq.feature.review.activities.ReviewActivityResultFragment)
          (r13v5 com.lingq.feature.review.activities.ReviewActivityResultFragment)
         binds: [B:95:0x0294, B:20:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:99:0x02a0  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ReviewActivityResultFragment reviewActivityResultFragment;
            ReviewSettingsKeys reviewSettingsKeys;
            ReviewSettingsKeys reviewSettingsKeys2;
            ef3 ef3VarM9545R0;
            ReviewActivityResult reviewActivityResult;
            String str;
            Object objM15541t;
            String str2;
            ef3 ef3Var;
            Object objM15541t2;
            Object objM15541t3;
            Object objM15541t4;
            ReviewActivityResultFragment reviewActivityResultFragment2;
            String str3;
            ReviewActivityResult reviewActivityResult2;
            int i;
            Object objM15541t5;
            ReviewActivityResult reviewActivityResult3;
            int i2;
            ReviewActivityResultFragment reviewActivityResultFragment3;
            ef3 ef3Var2;
            String str4;
            Object objM15541t6;
            Object objM15541t7;
            Object objM15541t8;
            Object objM15541t9;
            int i3;
            Object objM15541t10;
            ef3 ef3Var3;
            String str5;
            String str6;
            Object objM15541t11;
            Object objM15541t12;
            Object objM15541t13;
            Object objM15541t14;
            ReviewActivityResult reviewActivityResult4;
            String str7;
            Object objM15541t15;
            ReviewActivityResult reviewActivityResult5;
            ef3 ef3Var4;
            String str8;
            int i4;
            LessonCard lessonCard = (LessonCard) this.f32105g;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            switch (this.f32104f) {
                case 0:
                    AbstractC3193b.m15359b(obj);
                    if (lessonCard != null) {
                        String str9 = lessonCard.f19192o;
                        bh4[] bh4VarArr = ReviewActivityResultFragment.f32067H0;
                        reviewActivityResultFragment = this.f32106h;
                        C2750e c2750eM9548U0 = reviewActivityResultFragment.m9548U0();
                        nb8 nb8Var = this.f32107i;
                        boolean z = nb8Var instanceof gb8;
                        if (z) {
                            reviewSettingsKeys = ReviewSettingsKeys.Flashcards;
                        } else if (nb8Var instanceof hb8) {
                            reviewSettingsKeys = ReviewSettingsKeys.ReverseFlashcards;
                        } else if ((nb8Var instanceof jb8) || (nb8Var instanceof kb8)) {
                            reviewSettingsKeys = ReviewSettingsKeys.MultipleChoice;
                        } else if (nb8Var instanceof db8) {
                            reviewSettingsKeys = ReviewSettingsKeys.Cloze;
                        } else {
                            reviewSettingsKeys = ((nb8Var instanceof eb8) || (nb8Var instanceof fb8)) ? ReviewSettingsKeys.Dictation : ReviewSettingsKeys.Flashcards;
                        }
                        c2750eM9548U0.m9560V2(reviewSettingsKeys);
                        C2750e c2750eM9548U1 = reviewActivityResultFragment.m9548U0();
                        if (z) {
                            reviewSettingsKeys2 = ReviewSettingsKeys.FlashcardsBackTransliteration;
                        } else if (nb8Var instanceof hb8) {
                            reviewSettingsKeys2 = ReviewSettingsKeys.ReverseFlashcardsBackTransliteration;
                        } else if ((nb8Var instanceof jb8) || (nb8Var instanceof kb8)) {
                            reviewSettingsKeys2 = ReviewSettingsKeys.MultipleChoiceBackTransliteration;
                        } else if (nb8Var instanceof db8) {
                            reviewSettingsKeys2 = ReviewSettingsKeys.ClozeBackTransliteration;
                        } else {
                            reviewSettingsKeys2 = ((nb8Var instanceof eb8) || (nb8Var instanceof fb8)) ? ReviewSettingsKeys.DictationChoiceBackTransliteration : ReviewSettingsKeys.FlashcardsBackTransliteration;
                        }
                        c2750eM9548U1.m9561W2(reviewSettingsKeys2);
                        ef3VarM9545R0 = reviewActivityResultFragment.m9545R0();
                        TextView textView = ef3VarM9545R0.f37176i;
                        ViewLearnProgress viewLearnProgress = ef3VarM9545R0.f37179l;
                        TextView textView2 = ef3VarM9545R0.f37173f;
                        textView.setText(AbstractC3352my.m17122h(lessonCard.f19181d, AbstractC3352my.m17124i(lessonCard.f19178a), lessonCard.f19180c));
                        ef3VarM9545R0.f37174g.setText(lessonCard.f19185h);
                        ef3VarM9545R0.f37168a.setOnClickListener(new ub8(reviewActivityResultFragment, lessonCard, 0));
                        ef3VarM9545R0.f37169b.setOnClickListener(new ub8(reviewActivityResultFragment, lessonCard, 1));
                        if (z || (nb8Var instanceof hb8)) {
                            ef3VarM9545R0.f37180m.setOnClickListener(new ViewOnClickListenerC3135j5(reviewActivityResultFragment, 5));
                        }
                        viewLearnProgress.m8708b((vs3) reviewActivityResultFragment.m9548U0().f32367E.getValue(), lessonCard.f19188k, lessonCard.f19189l);
                        viewLearnProgress.setOnChangeStatusListener(new C2746a(2, reviewActivityResultFragment));
                        ef3VarM9545R0.f37177j.setText(t7d.m21897b(lessonCard.f19183f));
                        String strM2111m = reviewActivityResultFragment.m2111m(R$string.review_notes);
                        strM2111m.getClass();
                        textView2.setText(String.format(strM2111m, Arrays.copyOf(new Object[]{str9 == null ? "" : str9}, 1)));
                        if (str9 == null || str9.length() == 0) {
                            jfa.m14425h(textView2);
                        } else {
                            jfa.m14429l(textView2);
                        }
                        reviewActivityResult = this.f32108j;
                        str = this.f32109k;
                        if (z) {
                            lg8 lg8Var = ((C1370c) reviewActivityResultFragment.m9547T0()).f18511W;
                            this.f32105g = lessonCard;
                            this.f32099a = reviewActivityResultFragment;
                            this.f32100b = reviewActivityResult;
                            this.f32101c = str;
                            this.f32102d = ef3VarM9545R0;
                            this.f32103e = 0;
                            this.f32104f = 1;
                            objM15541t5 = AbstractC3224d.m15541t(lg8Var, this);
                            if (objM15541t5 != coroutineSingletons) {
                                reviewActivityResult3 = reviewActivityResult;
                                i2 = 0;
                                reviewActivityResultFragment3 = reviewActivityResultFragment;
                                ef3Var2 = ef3VarM9545R0;
                                str4 = str;
                                if (((Boolean) objM15541t5).booleanValue()) {
                                    jfa.m14429l(ef3Var2.f37168a);
                                    jfa.m14429l(ef3Var2.f37176i);
                                } else {
                                    jfa.m14420c(ef3Var2.f37168a);
                                    jfa.m14420c(ef3Var2.f37176i);
                                }
                                lg8 lg8Var2 = ((C1370c) reviewActivityResultFragment3.m9547T0()).f18512X;
                                this.f32105g = lessonCard;
                                this.f32099a = reviewActivityResultFragment3;
                                this.f32100b = reviewActivityResult3;
                                this.f32101c = str4;
                                this.f32102d = ef3Var2;
                                this.f32103e = i2;
                                this.f32104f = 2;
                                objM15541t6 = AbstractC3224d.m15541t(lg8Var2, this);
                                if (objM15541t6 != coroutineSingletons) {
                                    if (((Boolean) objM15541t6).booleanValue()) {
                                        jfa.m14429l(ef3Var2.f37177j);
                                    } else {
                                        jfa.m14425h(ef3Var2.f37177j);
                                    }
                                    lg8 lg8Var3 = ((C1370c) reviewActivityResultFragment3.m9547T0()).f18514Z;
                                    this.f32105g = lessonCard;
                                    this.f32099a = reviewActivityResultFragment3;
                                    this.f32100b = reviewActivityResult3;
                                    this.f32101c = str4;
                                    this.f32102d = ef3Var2;
                                    this.f32103e = i2;
                                    this.f32104f = 3;
                                    objM15541t7 = AbstractC3224d.m15541t(lg8Var3, this);
                                    if (objM15541t7 != coroutineSingletons) {
                                        if (((Boolean) objM15541t7).booleanValue()) {
                                            jfa.m14429l(ef3Var2.f37174g);
                                        } else {
                                            jfa.m14425h(ef3Var2.f37174g);
                                        }
                                        lg8 lg8Var4 = ((C1370c) reviewActivityResultFragment3.m9547T0()).f18516a0;
                                        this.f32105g = lessonCard;
                                        this.f32099a = reviewActivityResultFragment3;
                                        this.f32100b = reviewActivityResult3;
                                        this.f32101c = str4;
                                        this.f32102d = ef3Var2;
                                        this.f32103e = i2;
                                        this.f32104f = 4;
                                        objM15541t8 = AbstractC3224d.m15541t(lg8Var4, this);
                                        if (objM15541t8 != coroutineSingletons) {
                                            if (((Boolean) objM15541t8).booleanValue()) {
                                                jfa.m14429l(ef3Var2.f37178k);
                                            } else {
                                                jfa.m14420c(ef3Var2.f37178k);
                                            }
                                            lg8 lg8Var5 = ((C1370c) reviewActivityResultFragment3.m9547T0()).f18522d0;
                                            this.f32105g = lessonCard;
                                            this.f32099a = reviewActivityResultFragment3;
                                            this.f32100b = reviewActivityResult3;
                                            this.f32101c = str4;
                                            this.f32102d = ef3Var2;
                                            this.f32103e = i2;
                                            this.f32104f = 5;
                                            objM15541t9 = AbstractC3224d.m15541t(lg8Var5, this);
                                            if (objM15541t9 != coroutineSingletons) {
                                                i3 = i2;
                                                reviewActivityResult = reviewActivityResult3;
                                                reviewActivityResultFragment2 = reviewActivityResultFragment3;
                                                if (((Boolean) objM15541t9).booleanValue() || (str6 = lessonCard.f19192o) == null || vk9.m23391n0(str6)) {
                                                    jfa.m14425h(ef3Var2.f37173f);
                                                } else {
                                                    jfa.m14429l(ef3Var2.f37173f);
                                                }
                                                lg8 lg8Var6 = ((C1370c) reviewActivityResultFragment2.m9547T0()).f18520c0;
                                                this.f32105g = null;
                                                this.f32099a = reviewActivityResultFragment2;
                                                this.f32100b = reviewActivityResult;
                                                this.f32101c = str4;
                                                this.f32102d = ef3Var2;
                                                this.f32103e = i3;
                                                this.f32104f = 6;
                                                objM15541t10 = AbstractC3224d.m15541t(lg8Var6, this);
                                                if (objM15541t10 != coroutineSingletons) {
                                                    ef3Var3 = ef3Var2;
                                                    str5 = str4;
                                                    if (((Boolean) objM15541t10).booleanValue()) {
                                                        jfa.m14429l(ef3Var3.f37170c);
                                                    } else {
                                                        jfa.m14425h(ef3Var3.f37170c);
                                                    }
                                                    ef3VarM9545R0 = ef3Var3;
                                                    str = str5;
                                                    reviewActivityResultFragment = reviewActivityResultFragment2;
                                                    i4 = vb8.f65168a[reviewActivityResult.ordinal()];
                                                    if (i4 != 1) {
                                                        TextView textView3 = ef3VarM9545R0.f37175h;
                                                        jfa.m14429l(textView3);
                                                        textView3.setText(reviewActivityResultFragment.m2111m(R$string.activities_correct));
                                                        textView3.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.greenTint));
                                                    } else if (i4 != 2) {
                                                        TextView textView4 = ef3VarM9545R0.f37175h;
                                                        jfa.m14429l(textView4);
                                                        textView4.setText(reviewActivityResultFragment.m2111m(R$string.activities_incorrect));
                                                        textView4.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.redTint));
                                                    } else if (i4 != 3) {
                                                        TextView textView5 = ef3VarM9545R0.f37175h;
                                                        jfa.m14429l(textView5);
                                                        textView5.setText(reviewActivityResultFragment.m2111m(R$string.activities_almost));
                                                        textView5.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.yellowTint));
                                                    } else {
                                                        if (i4 == 4) {
                                                            gm5.m12750e();
                                                            return null;
                                                        }
                                                        jfa.m14425h(ef3VarM9545R0.f37175h);
                                                    }
                                                    if (str != null || str.length() == 0) {
                                                        jfa.m14425h(ef3VarM9545R0.f37172e);
                                                    } else {
                                                        jfa.m14429l(ef3VarM9545R0.f37172e);
                                                        ef3VarM9545R0.f37172e.setText(String.format(Locale.getDefault(), ux5.m22990m(reviewActivityResultFragment.m2111m(R$string.activities_you_answered), ": %s"), Arrays.copyOf(new Object[]{str}, 1)));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (nb8Var instanceof hb8) {
                            lg8 lg8Var7 = ((C1370c) reviewActivityResultFragment.m9547T0()).f18532i0;
                            this.f32105g = lessonCard;
                            this.f32099a = reviewActivityResultFragment;
                            this.f32100b = reviewActivityResult;
                            this.f32101c = str;
                            this.f32102d = ef3VarM9545R0;
                            this.f32103e = 0;
                            this.f32104f = 7;
                            objM15541t4 = AbstractC3224d.m15541t(lg8Var7, this);
                            if (objM15541t4 != coroutineSingletons) {
                                reviewActivityResultFragment2 = reviewActivityResultFragment;
                                str3 = str;
                                reviewActivityResult2 = reviewActivityResult;
                                i = 0;
                                if (((Boolean) objM15541t4).booleanValue()) {
                                    jfa.m14429l(ef3VarM9545R0.f37168a);
                                    jfa.m14429l(ef3VarM9545R0.f37176i);
                                } else {
                                    jfa.m14420c(ef3VarM9545R0.f37168a);
                                    jfa.m14420c(ef3VarM9545R0.f37176i);
                                }
                                lg8 lg8Var8 = ((C1370c) reviewActivityResultFragment2.m9547T0()).f18534j0;
                                this.f32105g = lessonCard;
                                this.f32099a = reviewActivityResultFragment2;
                                this.f32100b = reviewActivityResult2;
                                this.f32101c = str3;
                                this.f32102d = ef3VarM9545R0;
                                this.f32103e = i;
                                this.f32104f = 8;
                                objM15541t11 = AbstractC3224d.m15541t(lg8Var8, this);
                                if (objM15541t11 != coroutineSingletons) {
                                    if (((Boolean) objM15541t11).booleanValue()) {
                                        jfa.m14429l(ef3VarM9545R0.f37177j);
                                    } else {
                                        jfa.m14425h(ef3VarM9545R0.f37177j);
                                    }
                                    lg8 lg8Var9 = ((C1370c) reviewActivityResultFragment2.m9547T0()).f18536k0;
                                    this.f32105g = lessonCard;
                                    this.f32099a = reviewActivityResultFragment2;
                                    this.f32100b = reviewActivityResult2;
                                    this.f32101c = str3;
                                    this.f32102d = ef3VarM9545R0;
                                    this.f32103e = i;
                                    this.f32104f = 9;
                                    objM15541t12 = AbstractC3224d.m15541t(lg8Var9, this);
                                    if (objM15541t12 != coroutineSingletons) {
                                        if (((Boolean) objM15541t12).booleanValue()) {
                                            jfa.m14429l(ef3VarM9545R0.f37174g);
                                        } else {
                                            jfa.m14425h(ef3VarM9545R0.f37174g);
                                        }
                                        lg8 lg8Var10 = ((C1370c) reviewActivityResultFragment2.m9547T0()).f18538l0;
                                        this.f32105g = lessonCard;
                                        this.f32099a = reviewActivityResultFragment2;
                                        this.f32100b = reviewActivityResult2;
                                        this.f32101c = str3;
                                        this.f32102d = ef3VarM9545R0;
                                        this.f32103e = i;
                                        this.f32104f = 10;
                                        objM15541t13 = AbstractC3224d.m15541t(lg8Var10, this);
                                        if (objM15541t13 != coroutineSingletons) {
                                            if (((Boolean) objM15541t13).booleanValue()) {
                                                jfa.m14429l(ef3VarM9545R0.f37178k);
                                            } else {
                                                jfa.m14420c(ef3VarM9545R0.f37178k);
                                            }
                                            lg8 lg8Var11 = ((C1370c) reviewActivityResultFragment2.m9547T0()).f18544o0;
                                            this.f32105g = lessonCard;
                                            this.f32099a = reviewActivityResultFragment2;
                                            this.f32100b = reviewActivityResult2;
                                            this.f32101c = str3;
                                            this.f32102d = ef3VarM9545R0;
                                            this.f32103e = i;
                                            this.f32104f = 11;
                                            objM15541t14 = AbstractC3224d.m15541t(lg8Var11, this);
                                            if (objM15541t14 != coroutineSingletons) {
                                                reviewActivityResult4 = reviewActivityResult2;
                                                int i5 = i;
                                                str7 = str3;
                                                if (((Boolean) objM15541t14).booleanValue() || (str8 = lessonCard.f19192o) == null || vk9.m23391n0(str8)) {
                                                    jfa.m14425h(ef3VarM9545R0.f37173f);
                                                } else {
                                                    jfa.m14429l(ef3VarM9545R0.f37173f);
                                                }
                                                lg8 lg8Var12 = ((C1370c) reviewActivityResultFragment2.m9547T0()).f18542n0;
                                                this.f32105g = lessonCard;
                                                this.f32099a = reviewActivityResultFragment2;
                                                this.f32100b = reviewActivityResult4;
                                                this.f32101c = str7;
                                                this.f32102d = ef3VarM9545R0;
                                                this.f32103e = i5;
                                                this.f32104f = 12;
                                                objM15541t15 = AbstractC3224d.m15541t(lg8Var12, this);
                                                if (objM15541t15 != coroutineSingletons) {
                                                    reviewActivityResult5 = reviewActivityResult4;
                                                    ef3Var4 = ef3VarM9545R0;
                                                    if (((Boolean) objM15541t15).booleanValue() || lessonCard.f19180c.isEmpty()) {
                                                        jfa.m14425h(ef3Var4.f37170c);
                                                    } else {
                                                        jfa.m14429l(ef3Var4.f37170c);
                                                    }
                                                    ef3VarM9545R0 = ef3Var4;
                                                    str = str7;
                                                    reviewActivityResult = reviewActivityResult5;
                                                    reviewActivityResultFragment = reviewActivityResultFragment2;
                                                    i4 = vb8.f65168a[reviewActivityResult.ordinal()];
                                                    if (i4 != 1) {
                                                        TextView textView6 = ef3VarM9545R0.f37175h;
                                                        jfa.m14429l(textView6);
                                                        textView6.setText(reviewActivityResultFragment.m2111m(R$string.activities_correct));
                                                        textView6.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.greenTint));
                                                    } else if (i4 != 2) {
                                                        TextView textView7 = ef3VarM9545R0.f37175h;
                                                        jfa.m14429l(textView7);
                                                        textView7.setText(reviewActivityResultFragment.m2111m(R$string.activities_incorrect));
                                                        textView7.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.redTint));
                                                    } else if (i4 != 3) {
                                                        TextView textView8 = ef3VarM9545R0.f37175h;
                                                        jfa.m14429l(textView8);
                                                        textView8.setText(reviewActivityResultFragment.m2111m(R$string.activities_almost));
                                                        textView8.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.yellowTint));
                                                    } else {
                                                        if (i4 == 4) {
                                                            gm5.m12750e();
                                                            return null;
                                                        }
                                                        jfa.m14425h(ef3VarM9545R0.f37175h);
                                                    }
                                                    if (str != null) {
                                                        jfa.m14425h(ef3VarM9545R0.f37172e);
                                                    } else {
                                                        jfa.m14425h(ef3VarM9545R0.f37172e);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (nb8Var instanceof db8) {
                            c83 c83Var = ((C1370c) reviewActivityResultFragment.m9547T0()).f18554t0;
                            this.f32105g = null;
                            this.f32099a = reviewActivityResultFragment;
                            this.f32100b = reviewActivityResult;
                            this.f32101c = str;
                            this.f32102d = ef3VarM9545R0;
                            this.f32103e = 0;
                            this.f32104f = 13;
                            objM15541t3 = AbstractC3224d.m15541t(c83Var, this);
                            if (objM15541t3 != coroutineSingletons) {
                                str2 = str;
                                ef3Var = ef3VarM9545R0;
                                if (fa4.m11650l(((Map) objM15541t3).get(i19.m13627a(ViewKeys.Cloze).name()), Boolean.FALSE)) {
                                    jfa.m14420c(ef3Var.f37178k);
                                } else {
                                    jfa.m14429l(ef3Var.f37178k);
                                }
                                ef3VarM9545R0 = ef3Var;
                                str = str2;
                                i4 = vb8.f65168a[reviewActivityResult.ordinal()];
                                if (i4 != 1) {
                                    TextView textView9 = ef3VarM9545R0.f37175h;
                                    jfa.m14429l(textView9);
                                    textView9.setText(reviewActivityResultFragment.m2111m(R$string.activities_correct));
                                    textView9.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.greenTint));
                                } else if (i4 != 2) {
                                    TextView textView10 = ef3VarM9545R0.f37175h;
                                    jfa.m14429l(textView10);
                                    textView10.setText(reviewActivityResultFragment.m2111m(R$string.activities_incorrect));
                                    textView10.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.redTint));
                                } else if (i4 != 3) {
                                    TextView textView11 = ef3VarM9545R0.f37175h;
                                    jfa.m14429l(textView11);
                                    textView11.setText(reviewActivityResultFragment.m2111m(R$string.activities_almost));
                                    textView11.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.yellowTint));
                                } else {
                                    if (i4 == 4) {
                                        gm5.m12750e();
                                        return null;
                                    }
                                    jfa.m14425h(ef3VarM9545R0.f37175h);
                                }
                                if (str != null) {
                                    jfa.m14425h(ef3VarM9545R0.f37172e);
                                } else {
                                    jfa.m14425h(ef3VarM9545R0.f37172e);
                                }
                            }
                        } else if ((nb8Var instanceof eb8) || (nb8Var instanceof fb8)) {
                            c83 c83Var2 = ((C1370c) reviewActivityResultFragment.m9547T0()).f18554t0;
                            this.f32105g = null;
                            this.f32099a = reviewActivityResultFragment;
                            this.f32100b = reviewActivityResult;
                            this.f32101c = str;
                            this.f32102d = ef3VarM9545R0;
                            this.f32103e = 0;
                            this.f32104f = 14;
                            objM15541t = AbstractC3224d.m15541t(c83Var2, this);
                            if (objM15541t != coroutineSingletons) {
                                str2 = str;
                                ef3Var = ef3VarM9545R0;
                                if (fa4.m11650l(((Map) objM15541t).get(i19.m13627a(ViewKeys.Dictation).name()), Boolean.FALSE)) {
                                    jfa.m14420c(ef3Var.f37178k);
                                } else {
                                    jfa.m14429l(ef3Var.f37178k);
                                }
                                ef3VarM9545R0 = ef3Var;
                                str = str2;
                                i4 = vb8.f65168a[reviewActivityResult.ordinal()];
                                if (i4 != 1) {
                                    TextView textView12 = ef3VarM9545R0.f37175h;
                                    jfa.m14429l(textView12);
                                    textView12.setText(reviewActivityResultFragment.m2111m(R$string.activities_correct));
                                    textView12.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.greenTint));
                                } else if (i4 != 2) {
                                    TextView textView13 = ef3VarM9545R0.f37175h;
                                    jfa.m14429l(textView13);
                                    textView13.setText(reviewActivityResultFragment.m2111m(R$string.activities_incorrect));
                                    textView13.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.redTint));
                                } else if (i4 != 3) {
                                    TextView textView14 = ef3VarM9545R0.f37175h;
                                    jfa.m14429l(textView14);
                                    textView14.setText(reviewActivityResultFragment.m2111m(R$string.activities_almost));
                                    textView14.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.yellowTint));
                                } else {
                                    if (i4 == 4) {
                                        gm5.m12750e();
                                        return null;
                                    }
                                    jfa.m14425h(ef3VarM9545R0.f37175h);
                                }
                                if (str != null) {
                                    jfa.m14425h(ef3VarM9545R0.f37172e);
                                } else {
                                    jfa.m14425h(ef3VarM9545R0.f37172e);
                                }
                            }
                        } else {
                            if ((nb8Var instanceof jb8) || (nb8Var instanceof kb8)) {
                                c83 c83Var3 = ((C1370c) reviewActivityResultFragment.m9547T0()).f18554t0;
                                this.f32105g = null;
                                this.f32099a = reviewActivityResultFragment;
                                this.f32100b = reviewActivityResult;
                                this.f32101c = str;
                                this.f32102d = ef3VarM9545R0;
                                this.f32103e = 0;
                                this.f32104f = 15;
                                objM15541t2 = AbstractC3224d.m15541t(c83Var3, this);
                                if (objM15541t2 != coroutineSingletons) {
                                    str2 = str;
                                    ef3Var = ef3VarM9545R0;
                                    if (fa4.m11650l(((Map) objM15541t2).get(i19.m13627a(ViewKeys.MultipleChoice).name()), Boolean.FALSE)) {
                                        jfa.m14420c(ef3Var.f37178k);
                                    } else {
                                        jfa.m14429l(ef3Var.f37178k);
                                    }
                                    ef3VarM9545R0 = ef3Var;
                                    str = str2;
                                }
                            } else {
                                jfa.m14429l(ef3VarM9545R0.f37178k);
                            }
                            i4 = vb8.f65168a[reviewActivityResult.ordinal()];
                            if (i4 != 1) {
                                TextView textView15 = ef3VarM9545R0.f37175h;
                                jfa.m14429l(textView15);
                                textView15.setText(reviewActivityResultFragment.m2111m(R$string.activities_correct));
                                textView15.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.greenTint));
                            } else if (i4 != 2) {
                                TextView textView16 = ef3VarM9545R0.f37175h;
                                jfa.m14429l(textView16);
                                textView16.setText(reviewActivityResultFragment.m2111m(R$string.activities_incorrect));
                                textView16.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.redTint));
                            } else if (i4 != 3) {
                                TextView textView17 = ef3VarM9545R0.f37175h;
                                jfa.m14429l(textView17);
                                textView17.setText(reviewActivityResultFragment.m2111m(R$string.activities_almost));
                                textView17.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.yellowTint));
                            } else {
                                if (i4 == 4) {
                                    gm5.m12750e();
                                    return null;
                                }
                                jfa.m14425h(ef3VarM9545R0.f37175h);
                            }
                            if (str != null) {
                                jfa.m14425h(ef3VarM9545R0.f37172e);
                            } else {
                                jfa.m14425h(ef3VarM9545R0.f37172e);
                            }
                        }
                        return coroutineSingletons;
                    }
                    return xfa.f68157a;
                case 1:
                    i2 = this.f32103e;
                    ef3Var2 = this.f32102d;
                    str4 = this.f32101c;
                    reviewActivityResult3 = this.f32100b;
                    reviewActivityResultFragment3 = this.f32099a;
                    AbstractC3193b.m15359b(obj);
                    objM15541t5 = obj;
                    if (((Boolean) objM15541t5).booleanValue()) {
                        jfa.m14429l(ef3Var2.f37168a);
                        jfa.m14429l(ef3Var2.f37176i);
                    } else {
                        jfa.m14420c(ef3Var2.f37168a);
                        jfa.m14420c(ef3Var2.f37176i);
                    }
                    lg8 lg8Var13 = ((C1370c) reviewActivityResultFragment3.m9547T0()).f18512X;
                    this.f32105g = lessonCard;
                    this.f32099a = reviewActivityResultFragment3;
                    this.f32100b = reviewActivityResult3;
                    this.f32101c = str4;
                    this.f32102d = ef3Var2;
                    this.f32103e = i2;
                    this.f32104f = 2;
                    objM15541t6 = AbstractC3224d.m15541t(lg8Var13, this);
                    if (objM15541t6 != coroutineSingletons) {
                        if (((Boolean) objM15541t6).booleanValue()) {
                            jfa.m14425h(ef3Var2.f37177j);
                        } else {
                            jfa.m14429l(ef3Var2.f37177j);
                        }
                        lg8 lg8Var14 = ((C1370c) reviewActivityResultFragment3.m9547T0()).f18514Z;
                        this.f32105g = lessonCard;
                        this.f32099a = reviewActivityResultFragment3;
                        this.f32100b = reviewActivityResult3;
                        this.f32101c = str4;
                        this.f32102d = ef3Var2;
                        this.f32103e = i2;
                        this.f32104f = 3;
                        objM15541t7 = AbstractC3224d.m15541t(lg8Var14, this);
                        if (objM15541t7 != coroutineSingletons) {
                            if (((Boolean) objM15541t7).booleanValue()) {
                                jfa.m14425h(ef3Var2.f37174g);
                            } else {
                                jfa.m14429l(ef3Var2.f37174g);
                            }
                            lg8 lg8Var15 = ((C1370c) reviewActivityResultFragment3.m9547T0()).f18516a0;
                            this.f32105g = lessonCard;
                            this.f32099a = reviewActivityResultFragment3;
                            this.f32100b = reviewActivityResult3;
                            this.f32101c = str4;
                            this.f32102d = ef3Var2;
                            this.f32103e = i2;
                            this.f32104f = 4;
                            objM15541t8 = AbstractC3224d.m15541t(lg8Var15, this);
                            if (objM15541t8 != coroutineSingletons) {
                                if (((Boolean) objM15541t8).booleanValue()) {
                                    jfa.m14420c(ef3Var2.f37178k);
                                } else {
                                    jfa.m14429l(ef3Var2.f37178k);
                                }
                                lg8 lg8Var16 = ((C1370c) reviewActivityResultFragment3.m9547T0()).f18522d0;
                                this.f32105g = lessonCard;
                                this.f32099a = reviewActivityResultFragment3;
                                this.f32100b = reviewActivityResult3;
                                this.f32101c = str4;
                                this.f32102d = ef3Var2;
                                this.f32103e = i2;
                                this.f32104f = 5;
                                objM15541t9 = AbstractC3224d.m15541t(lg8Var16, this);
                                if (objM15541t9 != coroutineSingletons) {
                                    i3 = i2;
                                    reviewActivityResult = reviewActivityResult3;
                                    reviewActivityResultFragment2 = reviewActivityResultFragment3;
                                    if (((Boolean) objM15541t9).booleanValue()) {
                                        jfa.m14425h(ef3Var2.f37173f);
                                    } else {
                                        jfa.m14425h(ef3Var2.f37173f);
                                    }
                                    lg8 lg8Var17 = ((C1370c) reviewActivityResultFragment2.m9547T0()).f18520c0;
                                    this.f32105g = null;
                                    this.f32099a = reviewActivityResultFragment2;
                                    this.f32100b = reviewActivityResult;
                                    this.f32101c = str4;
                                    this.f32102d = ef3Var2;
                                    this.f32103e = i3;
                                    this.f32104f = 6;
                                    objM15541t10 = AbstractC3224d.m15541t(lg8Var17, this);
                                    if (objM15541t10 != coroutineSingletons) {
                                        ef3Var3 = ef3Var2;
                                        str5 = str4;
                                        if (((Boolean) objM15541t10).booleanValue()) {
                                            jfa.m14425h(ef3Var3.f37170c);
                                        } else {
                                            jfa.m14429l(ef3Var3.f37170c);
                                        }
                                        ef3VarM9545R0 = ef3Var3;
                                        str = str5;
                                        reviewActivityResultFragment = reviewActivityResultFragment2;
                                        i4 = vb8.f65168a[reviewActivityResult.ordinal()];
                                        if (i4 != 1) {
                                            TextView textView18 = ef3VarM9545R0.f37175h;
                                            jfa.m14429l(textView18);
                                            textView18.setText(reviewActivityResultFragment.m2111m(R$string.activities_correct));
                                            textView18.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.greenTint));
                                        } else if (i4 != 2) {
                                            TextView textView19 = ef3VarM9545R0.f37175h;
                                            jfa.m14429l(textView19);
                                            textView19.setText(reviewActivityResultFragment.m2111m(R$string.activities_incorrect));
                                            textView19.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.redTint));
                                        } else if (i4 != 3) {
                                            TextView textView110 = ef3VarM9545R0.f37175h;
                                            jfa.m14429l(textView110);
                                            textView110.setText(reviewActivityResultFragment.m2111m(R$string.activities_almost));
                                            textView110.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.yellowTint));
                                        } else {
                                            if (i4 == 4) {
                                                gm5.m12750e();
                                                return null;
                                            }
                                            jfa.m14425h(ef3VarM9545R0.f37175h);
                                        }
                                        if (str != null) {
                                            jfa.m14425h(ef3VarM9545R0.f37172e);
                                        } else {
                                            jfa.m14425h(ef3VarM9545R0.f37172e);
                                        }
                                        return xfa.f68157a;
                                    }
                                }
                            }
                        }
                    }
                    return coroutineSingletons;
                case 2:
                    i2 = this.f32103e;
                    ef3Var2 = this.f32102d;
                    str4 = this.f32101c;
                    reviewActivityResult3 = this.f32100b;
                    reviewActivityResultFragment3 = this.f32099a;
                    AbstractC3193b.m15359b(obj);
                    objM15541t6 = obj;
                    if (((Boolean) objM15541t6).booleanValue()) {
                        jfa.m14425h(ef3Var2.f37177j);
                    } else {
                        jfa.m14429l(ef3Var2.f37177j);
                    }
                    lg8 lg8Var18 = ((C1370c) reviewActivityResultFragment3.m9547T0()).f18514Z;
                    this.f32105g = lessonCard;
                    this.f32099a = reviewActivityResultFragment3;
                    this.f32100b = reviewActivityResult3;
                    this.f32101c = str4;
                    this.f32102d = ef3Var2;
                    this.f32103e = i2;
                    this.f32104f = 3;
                    objM15541t7 = AbstractC3224d.m15541t(lg8Var18, this);
                    if (objM15541t7 != coroutineSingletons) {
                        if (((Boolean) objM15541t7).booleanValue()) {
                            jfa.m14425h(ef3Var2.f37174g);
                        } else {
                            jfa.m14429l(ef3Var2.f37174g);
                        }
                        lg8 lg8Var19 = ((C1370c) reviewActivityResultFragment3.m9547T0()).f18516a0;
                        this.f32105g = lessonCard;
                        this.f32099a = reviewActivityResultFragment3;
                        this.f32100b = reviewActivityResult3;
                        this.f32101c = str4;
                        this.f32102d = ef3Var2;
                        this.f32103e = i2;
                        this.f32104f = 4;
                        objM15541t8 = AbstractC3224d.m15541t(lg8Var19, this);
                        if (objM15541t8 != coroutineSingletons) {
                            if (((Boolean) objM15541t8).booleanValue()) {
                                jfa.m14420c(ef3Var2.f37178k);
                            } else {
                                jfa.m14429l(ef3Var2.f37178k);
                            }
                            lg8 lg8Var110 = ((C1370c) reviewActivityResultFragment3.m9547T0()).f18522d0;
                            this.f32105g = lessonCard;
                            this.f32099a = reviewActivityResultFragment3;
                            this.f32100b = reviewActivityResult3;
                            this.f32101c = str4;
                            this.f32102d = ef3Var2;
                            this.f32103e = i2;
                            this.f32104f = 5;
                            objM15541t9 = AbstractC3224d.m15541t(lg8Var110, this);
                            if (objM15541t9 != coroutineSingletons) {
                                i3 = i2;
                                reviewActivityResult = reviewActivityResult3;
                                reviewActivityResultFragment2 = reviewActivityResultFragment3;
                                if (((Boolean) objM15541t9).booleanValue()) {
                                    jfa.m14425h(ef3Var2.f37173f);
                                } else {
                                    jfa.m14425h(ef3Var2.f37173f);
                                }
                                lg8 lg8Var111 = ((C1370c) reviewActivityResultFragment2.m9547T0()).f18520c0;
                                this.f32105g = null;
                                this.f32099a = reviewActivityResultFragment2;
                                this.f32100b = reviewActivityResult;
                                this.f32101c = str4;
                                this.f32102d = ef3Var2;
                                this.f32103e = i3;
                                this.f32104f = 6;
                                objM15541t10 = AbstractC3224d.m15541t(lg8Var111, this);
                                if (objM15541t10 != coroutineSingletons) {
                                    ef3Var3 = ef3Var2;
                                    str5 = str4;
                                    if (((Boolean) objM15541t10).booleanValue()) {
                                        jfa.m14425h(ef3Var3.f37170c);
                                    } else {
                                        jfa.m14429l(ef3Var3.f37170c);
                                    }
                                    ef3VarM9545R0 = ef3Var3;
                                    str = str5;
                                    reviewActivityResultFragment = reviewActivityResultFragment2;
                                    i4 = vb8.f65168a[reviewActivityResult.ordinal()];
                                    if (i4 != 1) {
                                        TextView textView111 = ef3VarM9545R0.f37175h;
                                        jfa.m14429l(textView111);
                                        textView111.setText(reviewActivityResultFragment.m2111m(R$string.activities_correct));
                                        textView111.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.greenTint));
                                    } else if (i4 != 2) {
                                        TextView textView112 = ef3VarM9545R0.f37175h;
                                        jfa.m14429l(textView112);
                                        textView112.setText(reviewActivityResultFragment.m2111m(R$string.activities_incorrect));
                                        textView112.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.redTint));
                                    } else if (i4 != 3) {
                                        TextView textView113 = ef3VarM9545R0.f37175h;
                                        jfa.m14429l(textView113);
                                        textView113.setText(reviewActivityResultFragment.m2111m(R$string.activities_almost));
                                        textView113.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.yellowTint));
                                    } else {
                                        if (i4 == 4) {
                                            gm5.m12750e();
                                            return null;
                                        }
                                        jfa.m14425h(ef3VarM9545R0.f37175h);
                                    }
                                    if (str != null) {
                                        jfa.m14425h(ef3VarM9545R0.f37172e);
                                    } else {
                                        jfa.m14425h(ef3VarM9545R0.f37172e);
                                    }
                                    return xfa.f68157a;
                                }
                            }
                        }
                    }
                    return coroutineSingletons;
                case 3:
                    i2 = this.f32103e;
                    ef3Var2 = this.f32102d;
                    str4 = this.f32101c;
                    reviewActivityResult3 = this.f32100b;
                    reviewActivityResultFragment3 = this.f32099a;
                    AbstractC3193b.m15359b(obj);
                    objM15541t7 = obj;
                    if (((Boolean) objM15541t7).booleanValue()) {
                        jfa.m14425h(ef3Var2.f37174g);
                    } else {
                        jfa.m14429l(ef3Var2.f37174g);
                    }
                    lg8 lg8Var112 = ((C1370c) reviewActivityResultFragment3.m9547T0()).f18516a0;
                    this.f32105g = lessonCard;
                    this.f32099a = reviewActivityResultFragment3;
                    this.f32100b = reviewActivityResult3;
                    this.f32101c = str4;
                    this.f32102d = ef3Var2;
                    this.f32103e = i2;
                    this.f32104f = 4;
                    objM15541t8 = AbstractC3224d.m15541t(lg8Var112, this);
                    if (objM15541t8 != coroutineSingletons) {
                        if (((Boolean) objM15541t8).booleanValue()) {
                            jfa.m14420c(ef3Var2.f37178k);
                        } else {
                            jfa.m14429l(ef3Var2.f37178k);
                        }
                        lg8 lg8Var113 = ((C1370c) reviewActivityResultFragment3.m9547T0()).f18522d0;
                        this.f32105g = lessonCard;
                        this.f32099a = reviewActivityResultFragment3;
                        this.f32100b = reviewActivityResult3;
                        this.f32101c = str4;
                        this.f32102d = ef3Var2;
                        this.f32103e = i2;
                        this.f32104f = 5;
                        objM15541t9 = AbstractC3224d.m15541t(lg8Var113, this);
                        if (objM15541t9 != coroutineSingletons) {
                            i3 = i2;
                            reviewActivityResult = reviewActivityResult3;
                            reviewActivityResultFragment2 = reviewActivityResultFragment3;
                            if (((Boolean) objM15541t9).booleanValue()) {
                                jfa.m14425h(ef3Var2.f37173f);
                            } else {
                                jfa.m14425h(ef3Var2.f37173f);
                            }
                            lg8 lg8Var114 = ((C1370c) reviewActivityResultFragment2.m9547T0()).f18520c0;
                            this.f32105g = null;
                            this.f32099a = reviewActivityResultFragment2;
                            this.f32100b = reviewActivityResult;
                            this.f32101c = str4;
                            this.f32102d = ef3Var2;
                            this.f32103e = i3;
                            this.f32104f = 6;
                            objM15541t10 = AbstractC3224d.m15541t(lg8Var114, this);
                            if (objM15541t10 != coroutineSingletons) {
                                ef3Var3 = ef3Var2;
                                str5 = str4;
                                if (((Boolean) objM15541t10).booleanValue()) {
                                    jfa.m14425h(ef3Var3.f37170c);
                                } else {
                                    jfa.m14429l(ef3Var3.f37170c);
                                }
                                ef3VarM9545R0 = ef3Var3;
                                str = str5;
                                reviewActivityResultFragment = reviewActivityResultFragment2;
                                i4 = vb8.f65168a[reviewActivityResult.ordinal()];
                                if (i4 != 1) {
                                    TextView textView114 = ef3VarM9545R0.f37175h;
                                    jfa.m14429l(textView114);
                                    textView114.setText(reviewActivityResultFragment.m2111m(R$string.activities_correct));
                                    textView114.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.greenTint));
                                } else if (i4 != 2) {
                                    TextView textView115 = ef3VarM9545R0.f37175h;
                                    jfa.m14429l(textView115);
                                    textView115.setText(reviewActivityResultFragment.m2111m(R$string.activities_incorrect));
                                    textView115.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.redTint));
                                } else if (i4 != 3) {
                                    TextView textView116 = ef3VarM9545R0.f37175h;
                                    jfa.m14429l(textView116);
                                    textView116.setText(reviewActivityResultFragment.m2111m(R$string.activities_almost));
                                    textView116.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.yellowTint));
                                } else {
                                    if (i4 == 4) {
                                        gm5.m12750e();
                                        return null;
                                    }
                                    jfa.m14425h(ef3VarM9545R0.f37175h);
                                }
                                if (str != null) {
                                    jfa.m14425h(ef3VarM9545R0.f37172e);
                                } else {
                                    jfa.m14425h(ef3VarM9545R0.f37172e);
                                }
                                return xfa.f68157a;
                            }
                        }
                    }
                    return coroutineSingletons;
                case 4:
                    i2 = this.f32103e;
                    ef3Var2 = this.f32102d;
                    str4 = this.f32101c;
                    reviewActivityResult3 = this.f32100b;
                    reviewActivityResultFragment3 = this.f32099a;
                    AbstractC3193b.m15359b(obj);
                    objM15541t8 = obj;
                    if (((Boolean) objM15541t8).booleanValue()) {
                        jfa.m14420c(ef3Var2.f37178k);
                    } else {
                        jfa.m14429l(ef3Var2.f37178k);
                    }
                    lg8 lg8Var115 = ((C1370c) reviewActivityResultFragment3.m9547T0()).f18522d0;
                    this.f32105g = lessonCard;
                    this.f32099a = reviewActivityResultFragment3;
                    this.f32100b = reviewActivityResult3;
                    this.f32101c = str4;
                    this.f32102d = ef3Var2;
                    this.f32103e = i2;
                    this.f32104f = 5;
                    objM15541t9 = AbstractC3224d.m15541t(lg8Var115, this);
                    if (objM15541t9 != coroutineSingletons) {
                        i3 = i2;
                        reviewActivityResult = reviewActivityResult3;
                        reviewActivityResultFragment2 = reviewActivityResultFragment3;
                        if (((Boolean) objM15541t9).booleanValue()) {
                            jfa.m14425h(ef3Var2.f37173f);
                        } else {
                            jfa.m14425h(ef3Var2.f37173f);
                        }
                        lg8 lg8Var116 = ((C1370c) reviewActivityResultFragment2.m9547T0()).f18520c0;
                        this.f32105g = null;
                        this.f32099a = reviewActivityResultFragment2;
                        this.f32100b = reviewActivityResult;
                        this.f32101c = str4;
                        this.f32102d = ef3Var2;
                        this.f32103e = i3;
                        this.f32104f = 6;
                        objM15541t10 = AbstractC3224d.m15541t(lg8Var116, this);
                        if (objM15541t10 != coroutineSingletons) {
                            ef3Var3 = ef3Var2;
                            str5 = str4;
                            if (((Boolean) objM15541t10).booleanValue()) {
                                jfa.m14425h(ef3Var3.f37170c);
                            } else {
                                jfa.m14429l(ef3Var3.f37170c);
                            }
                            ef3VarM9545R0 = ef3Var3;
                            str = str5;
                            reviewActivityResultFragment = reviewActivityResultFragment2;
                            i4 = vb8.f65168a[reviewActivityResult.ordinal()];
                            if (i4 != 1) {
                                TextView textView117 = ef3VarM9545R0.f37175h;
                                jfa.m14429l(textView117);
                                textView117.setText(reviewActivityResultFragment.m2111m(R$string.activities_correct));
                                textView117.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.greenTint));
                            } else if (i4 != 2) {
                                TextView textView118 = ef3VarM9545R0.f37175h;
                                jfa.m14429l(textView118);
                                textView118.setText(reviewActivityResultFragment.m2111m(R$string.activities_incorrect));
                                textView118.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.redTint));
                            } else if (i4 != 3) {
                                TextView textView119 = ef3VarM9545R0.f37175h;
                                jfa.m14429l(textView119);
                                textView119.setText(reviewActivityResultFragment.m2111m(R$string.activities_almost));
                                textView119.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.yellowTint));
                            } else {
                                if (i4 == 4) {
                                    gm5.m12750e();
                                    return null;
                                }
                                jfa.m14425h(ef3VarM9545R0.f37175h);
                            }
                            if (str != null) {
                                jfa.m14425h(ef3VarM9545R0.f37172e);
                            } else {
                                jfa.m14425h(ef3VarM9545R0.f37172e);
                            }
                            return xfa.f68157a;
                        }
                    }
                    return coroutineSingletons;
                case 5:
                    int i6 = this.f32103e;
                    ef3 ef3Var5 = this.f32102d;
                    String str10 = this.f32101c;
                    ReviewActivityResult reviewActivityResult6 = this.f32100b;
                    reviewActivityResultFragment2 = this.f32099a;
                    AbstractC3193b.m15359b(obj);
                    i3 = i6;
                    reviewActivityResult = reviewActivityResult6;
                    str4 = str10;
                    ef3Var2 = ef3Var5;
                    objM15541t9 = obj;
                    if (((Boolean) objM15541t9).booleanValue()) {
                        jfa.m14425h(ef3Var2.f37173f);
                    } else {
                        jfa.m14425h(ef3Var2.f37173f);
                    }
                    lg8 lg8Var117 = ((C1370c) reviewActivityResultFragment2.m9547T0()).f18520c0;
                    this.f32105g = null;
                    this.f32099a = reviewActivityResultFragment2;
                    this.f32100b = reviewActivityResult;
                    this.f32101c = str4;
                    this.f32102d = ef3Var2;
                    this.f32103e = i3;
                    this.f32104f = 6;
                    objM15541t10 = AbstractC3224d.m15541t(lg8Var117, this);
                    if (objM15541t10 != coroutineSingletons) {
                        ef3Var3 = ef3Var2;
                        str5 = str4;
                        if (((Boolean) objM15541t10).booleanValue()) {
                            jfa.m14425h(ef3Var3.f37170c);
                        } else {
                            jfa.m14429l(ef3Var3.f37170c);
                        }
                        ef3VarM9545R0 = ef3Var3;
                        str = str5;
                        reviewActivityResultFragment = reviewActivityResultFragment2;
                        i4 = vb8.f65168a[reviewActivityResult.ordinal()];
                        if (i4 != 1) {
                            TextView textView1110 = ef3VarM9545R0.f37175h;
                            jfa.m14429l(textView1110);
                            textView1110.setText(reviewActivityResultFragment.m2111m(R$string.activities_correct));
                            textView1110.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.greenTint));
                        } else if (i4 != 2) {
                            TextView textView1111 = ef3VarM9545R0.f37175h;
                            jfa.m14429l(textView1111);
                            textView1111.setText(reviewActivityResultFragment.m2111m(R$string.activities_incorrect));
                            textView1111.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.redTint));
                        } else if (i4 != 3) {
                            TextView textView1112 = ef3VarM9545R0.f37175h;
                            jfa.m14429l(textView1112);
                            textView1112.setText(reviewActivityResultFragment.m2111m(R$string.activities_almost));
                            textView1112.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.yellowTint));
                        } else {
                            if (i4 == 4) {
                                gm5.m12750e();
                                return null;
                            }
                            jfa.m14425h(ef3VarM9545R0.f37175h);
                        }
                        if (str != null) {
                            jfa.m14425h(ef3VarM9545R0.f37172e);
                        } else {
                            jfa.m14425h(ef3VarM9545R0.f37172e);
                        }
                        return xfa.f68157a;
                    }
                    return coroutineSingletons;
                case 6:
                    ef3Var3 = this.f32102d;
                    str5 = this.f32101c;
                    reviewActivityResult = this.f32100b;
                    ReviewActivityResultFragment reviewActivityResultFragment4 = this.f32099a;
                    AbstractC3193b.m15359b(obj);
                    reviewActivityResultFragment2 = reviewActivityResultFragment4;
                    objM15541t10 = obj;
                    if (((Boolean) objM15541t10).booleanValue()) {
                        jfa.m14425h(ef3Var3.f37170c);
                    } else {
                        jfa.m14429l(ef3Var3.f37170c);
                    }
                    ef3VarM9545R0 = ef3Var3;
                    str = str5;
                    reviewActivityResultFragment = reviewActivityResultFragment2;
                    i4 = vb8.f65168a[reviewActivityResult.ordinal()];
                    if (i4 != 1) {
                        TextView textView1113 = ef3VarM9545R0.f37175h;
                        jfa.m14429l(textView1113);
                        textView1113.setText(reviewActivityResultFragment.m2111m(R$string.activities_correct));
                        textView1113.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.greenTint));
                    } else if (i4 != 2) {
                        TextView textView1114 = ef3VarM9545R0.f37175h;
                        jfa.m14429l(textView1114);
                        textView1114.setText(reviewActivityResultFragment.m2111m(R$string.activities_incorrect));
                        textView1114.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.redTint));
                    } else if (i4 != 3) {
                        TextView textView1115 = ef3VarM9545R0.f37175h;
                        jfa.m14429l(textView1115);
                        textView1115.setText(reviewActivityResultFragment.m2111m(R$string.activities_almost));
                        textView1115.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.yellowTint));
                    } else {
                        if (i4 == 4) {
                            gm5.m12750e();
                            return null;
                        }
                        jfa.m14425h(ef3VarM9545R0.f37175h);
                    }
                    if (str != null) {
                        jfa.m14425h(ef3VarM9545R0.f37172e);
                    } else {
                        jfa.m14425h(ef3VarM9545R0.f37172e);
                    }
                    return xfa.f68157a;
                case 7:
                    i = this.f32103e;
                    ef3 ef3Var6 = this.f32102d;
                    str3 = this.f32101c;
                    ReviewActivityResult reviewActivityResult7 = this.f32100b;
                    reviewActivityResultFragment2 = this.f32099a;
                    AbstractC3193b.m15359b(obj);
                    reviewActivityResult2 = reviewActivityResult7;
                    ef3VarM9545R0 = ef3Var6;
                    objM15541t4 = obj;
                    if (((Boolean) objM15541t4).booleanValue()) {
                        jfa.m14429l(ef3VarM9545R0.f37168a);
                        jfa.m14429l(ef3VarM9545R0.f37176i);
                    } else {
                        jfa.m14420c(ef3VarM9545R0.f37168a);
                        jfa.m14420c(ef3VarM9545R0.f37176i);
                    }
                    lg8 lg8Var20 = ((C1370c) reviewActivityResultFragment2.m9547T0()).f18534j0;
                    this.f32105g = lessonCard;
                    this.f32099a = reviewActivityResultFragment2;
                    this.f32100b = reviewActivityResult2;
                    this.f32101c = str3;
                    this.f32102d = ef3VarM9545R0;
                    this.f32103e = i;
                    this.f32104f = 8;
                    objM15541t11 = AbstractC3224d.m15541t(lg8Var20, this);
                    if (objM15541t11 != coroutineSingletons) {
                        if (((Boolean) objM15541t11).booleanValue()) {
                            jfa.m14425h(ef3VarM9545R0.f37177j);
                        } else {
                            jfa.m14429l(ef3VarM9545R0.f37177j);
                        }
                        lg8 lg8Var21 = ((C1370c) reviewActivityResultFragment2.m9547T0()).f18536k0;
                        this.f32105g = lessonCard;
                        this.f32099a = reviewActivityResultFragment2;
                        this.f32100b = reviewActivityResult2;
                        this.f32101c = str3;
                        this.f32102d = ef3VarM9545R0;
                        this.f32103e = i;
                        this.f32104f = 9;
                        objM15541t12 = AbstractC3224d.m15541t(lg8Var21, this);
                        if (objM15541t12 != coroutineSingletons) {
                            if (((Boolean) objM15541t12).booleanValue()) {
                                jfa.m14425h(ef3VarM9545R0.f37174g);
                            } else {
                                jfa.m14429l(ef3VarM9545R0.f37174g);
                            }
                            lg8 lg8Var118 = ((C1370c) reviewActivityResultFragment2.m9547T0()).f18538l0;
                            this.f32105g = lessonCard;
                            this.f32099a = reviewActivityResultFragment2;
                            this.f32100b = reviewActivityResult2;
                            this.f32101c = str3;
                            this.f32102d = ef3VarM9545R0;
                            this.f32103e = i;
                            this.f32104f = 10;
                            objM15541t13 = AbstractC3224d.m15541t(lg8Var118, this);
                            if (objM15541t13 != coroutineSingletons) {
                                if (((Boolean) objM15541t13).booleanValue()) {
                                    jfa.m14420c(ef3VarM9545R0.f37178k);
                                } else {
                                    jfa.m14429l(ef3VarM9545R0.f37178k);
                                }
                                lg8 lg8Var119 = ((C1370c) reviewActivityResultFragment2.m9547T0()).f18544o0;
                                this.f32105g = lessonCard;
                                this.f32099a = reviewActivityResultFragment2;
                                this.f32100b = reviewActivityResult2;
                                this.f32101c = str3;
                                this.f32102d = ef3VarM9545R0;
                                this.f32103e = i;
                                this.f32104f = 11;
                                objM15541t14 = AbstractC3224d.m15541t(lg8Var119, this);
                                if (objM15541t14 != coroutineSingletons) {
                                    reviewActivityResult4 = reviewActivityResult2;
                                    int i7 = i;
                                    str7 = str3;
                                    if (((Boolean) objM15541t14).booleanValue()) {
                                        jfa.m14425h(ef3VarM9545R0.f37173f);
                                    } else {
                                        jfa.m14425h(ef3VarM9545R0.f37173f);
                                    }
                                    lg8 lg8Var120 = ((C1370c) reviewActivityResultFragment2.m9547T0()).f18542n0;
                                    this.f32105g = lessonCard;
                                    this.f32099a = reviewActivityResultFragment2;
                                    this.f32100b = reviewActivityResult4;
                                    this.f32101c = str7;
                                    this.f32102d = ef3VarM9545R0;
                                    this.f32103e = i7;
                                    this.f32104f = 12;
                                    objM15541t15 = AbstractC3224d.m15541t(lg8Var120, this);
                                    if (objM15541t15 != coroutineSingletons) {
                                        reviewActivityResult5 = reviewActivityResult4;
                                        ef3Var4 = ef3VarM9545R0;
                                        if (((Boolean) objM15541t15).booleanValue()) {
                                            jfa.m14425h(ef3Var4.f37170c);
                                        } else {
                                            jfa.m14425h(ef3Var4.f37170c);
                                        }
                                        ef3VarM9545R0 = ef3Var4;
                                        str = str7;
                                        reviewActivityResult = reviewActivityResult5;
                                        reviewActivityResultFragment = reviewActivityResultFragment2;
                                        i4 = vb8.f65168a[reviewActivityResult.ordinal()];
                                        if (i4 != 1) {
                                            TextView textView1116 = ef3VarM9545R0.f37175h;
                                            jfa.m14429l(textView1116);
                                            textView1116.setText(reviewActivityResultFragment.m2111m(R$string.activities_correct));
                                            textView1116.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.greenTint));
                                        } else if (i4 != 2) {
                                            TextView textView1117 = ef3VarM9545R0.f37175h;
                                            jfa.m14429l(textView1117);
                                            textView1117.setText(reviewActivityResultFragment.m2111m(R$string.activities_incorrect));
                                            textView1117.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.redTint));
                                        } else if (i4 != 3) {
                                            TextView textView1118 = ef3VarM9545R0.f37175h;
                                            jfa.m14429l(textView1118);
                                            textView1118.setText(reviewActivityResultFragment.m2111m(R$string.activities_almost));
                                            textView1118.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.yellowTint));
                                        } else {
                                            if (i4 == 4) {
                                                gm5.m12750e();
                                                return null;
                                            }
                                            jfa.m14425h(ef3VarM9545R0.f37175h);
                                        }
                                        if (str != null) {
                                            jfa.m14425h(ef3VarM9545R0.f37172e);
                                        } else {
                                            jfa.m14425h(ef3VarM9545R0.f37172e);
                                        }
                                        return xfa.f68157a;
                                    }
                                }
                            }
                        }
                    }
                    return coroutineSingletons;
                case 8:
                    i = this.f32103e;
                    ef3 ef3Var7 = this.f32102d;
                    str3 = this.f32101c;
                    ReviewActivityResult reviewActivityResult8 = this.f32100b;
                    reviewActivityResultFragment2 = this.f32099a;
                    AbstractC3193b.m15359b(obj);
                    reviewActivityResult2 = reviewActivityResult8;
                    ef3VarM9545R0 = ef3Var7;
                    objM15541t11 = obj;
                    if (((Boolean) objM15541t11).booleanValue()) {
                        jfa.m14425h(ef3VarM9545R0.f37177j);
                    } else {
                        jfa.m14429l(ef3VarM9545R0.f37177j);
                    }
                    lg8 lg8Var22 = ((C1370c) reviewActivityResultFragment2.m9547T0()).f18536k0;
                    this.f32105g = lessonCard;
                    this.f32099a = reviewActivityResultFragment2;
                    this.f32100b = reviewActivityResult2;
                    this.f32101c = str3;
                    this.f32102d = ef3VarM9545R0;
                    this.f32103e = i;
                    this.f32104f = 9;
                    objM15541t12 = AbstractC3224d.m15541t(lg8Var22, this);
                    if (objM15541t12 != coroutineSingletons) {
                        if (((Boolean) objM15541t12).booleanValue()) {
                            jfa.m14425h(ef3VarM9545R0.f37174g);
                        } else {
                            jfa.m14429l(ef3VarM9545R0.f37174g);
                        }
                        lg8 lg8Var1110 = ((C1370c) reviewActivityResultFragment2.m9547T0()).f18538l0;
                        this.f32105g = lessonCard;
                        this.f32099a = reviewActivityResultFragment2;
                        this.f32100b = reviewActivityResult2;
                        this.f32101c = str3;
                        this.f32102d = ef3VarM9545R0;
                        this.f32103e = i;
                        this.f32104f = 10;
                        objM15541t13 = AbstractC3224d.m15541t(lg8Var1110, this);
                        if (objM15541t13 != coroutineSingletons) {
                            if (((Boolean) objM15541t13).booleanValue()) {
                                jfa.m14420c(ef3VarM9545R0.f37178k);
                            } else {
                                jfa.m14429l(ef3VarM9545R0.f37178k);
                            }
                            lg8 lg8Var1111 = ((C1370c) reviewActivityResultFragment2.m9547T0()).f18544o0;
                            this.f32105g = lessonCard;
                            this.f32099a = reviewActivityResultFragment2;
                            this.f32100b = reviewActivityResult2;
                            this.f32101c = str3;
                            this.f32102d = ef3VarM9545R0;
                            this.f32103e = i;
                            this.f32104f = 11;
                            objM15541t14 = AbstractC3224d.m15541t(lg8Var1111, this);
                            if (objM15541t14 != coroutineSingletons) {
                                reviewActivityResult4 = reviewActivityResult2;
                                int i8 = i;
                                str7 = str3;
                                if (((Boolean) objM15541t14).booleanValue()) {
                                    jfa.m14425h(ef3VarM9545R0.f37173f);
                                } else {
                                    jfa.m14425h(ef3VarM9545R0.f37173f);
                                }
                                lg8 lg8Var121 = ((C1370c) reviewActivityResultFragment2.m9547T0()).f18542n0;
                                this.f32105g = lessonCard;
                                this.f32099a = reviewActivityResultFragment2;
                                this.f32100b = reviewActivityResult4;
                                this.f32101c = str7;
                                this.f32102d = ef3VarM9545R0;
                                this.f32103e = i8;
                                this.f32104f = 12;
                                objM15541t15 = AbstractC3224d.m15541t(lg8Var121, this);
                                if (objM15541t15 != coroutineSingletons) {
                                    reviewActivityResult5 = reviewActivityResult4;
                                    ef3Var4 = ef3VarM9545R0;
                                    if (((Boolean) objM15541t15).booleanValue()) {
                                        jfa.m14425h(ef3Var4.f37170c);
                                    } else {
                                        jfa.m14425h(ef3Var4.f37170c);
                                    }
                                    ef3VarM9545R0 = ef3Var4;
                                    str = str7;
                                    reviewActivityResult = reviewActivityResult5;
                                    reviewActivityResultFragment = reviewActivityResultFragment2;
                                    i4 = vb8.f65168a[reviewActivityResult.ordinal()];
                                    if (i4 != 1) {
                                        TextView textView1119 = ef3VarM9545R0.f37175h;
                                        jfa.m14429l(textView1119);
                                        textView1119.setText(reviewActivityResultFragment.m2111m(R$string.activities_correct));
                                        textView1119.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.greenTint));
                                    } else if (i4 != 2) {
                                        TextView textView11110 = ef3VarM9545R0.f37175h;
                                        jfa.m14429l(textView11110);
                                        textView11110.setText(reviewActivityResultFragment.m2111m(R$string.activities_incorrect));
                                        textView11110.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.redTint));
                                    } else if (i4 != 3) {
                                        TextView textView11111 = ef3VarM9545R0.f37175h;
                                        jfa.m14429l(textView11111);
                                        textView11111.setText(reviewActivityResultFragment.m2111m(R$string.activities_almost));
                                        textView11111.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.yellowTint));
                                    } else {
                                        if (i4 == 4) {
                                            gm5.m12750e();
                                            return null;
                                        }
                                        jfa.m14425h(ef3VarM9545R0.f37175h);
                                    }
                                    if (str != null) {
                                        jfa.m14425h(ef3VarM9545R0.f37172e);
                                    } else {
                                        jfa.m14425h(ef3VarM9545R0.f37172e);
                                    }
                                    return xfa.f68157a;
                                }
                            }
                        }
                    }
                    return coroutineSingletons;
                case 9:
                    i = this.f32103e;
                    ef3 ef3Var8 = this.f32102d;
                    str3 = this.f32101c;
                    ReviewActivityResult reviewActivityResult9 = this.f32100b;
                    reviewActivityResultFragment2 = this.f32099a;
                    AbstractC3193b.m15359b(obj);
                    reviewActivityResult2 = reviewActivityResult9;
                    ef3VarM9545R0 = ef3Var8;
                    objM15541t12 = obj;
                    if (((Boolean) objM15541t12).booleanValue()) {
                        jfa.m14425h(ef3VarM9545R0.f37174g);
                    } else {
                        jfa.m14429l(ef3VarM9545R0.f37174g);
                    }
                    lg8 lg8Var1112 = ((C1370c) reviewActivityResultFragment2.m9547T0()).f18538l0;
                    this.f32105g = lessonCard;
                    this.f32099a = reviewActivityResultFragment2;
                    this.f32100b = reviewActivityResult2;
                    this.f32101c = str3;
                    this.f32102d = ef3VarM9545R0;
                    this.f32103e = i;
                    this.f32104f = 10;
                    objM15541t13 = AbstractC3224d.m15541t(lg8Var1112, this);
                    if (objM15541t13 != coroutineSingletons) {
                        if (((Boolean) objM15541t13).booleanValue()) {
                            jfa.m14420c(ef3VarM9545R0.f37178k);
                        } else {
                            jfa.m14429l(ef3VarM9545R0.f37178k);
                        }
                        lg8 lg8Var1113 = ((C1370c) reviewActivityResultFragment2.m9547T0()).f18544o0;
                        this.f32105g = lessonCard;
                        this.f32099a = reviewActivityResultFragment2;
                        this.f32100b = reviewActivityResult2;
                        this.f32101c = str3;
                        this.f32102d = ef3VarM9545R0;
                        this.f32103e = i;
                        this.f32104f = 11;
                        objM15541t14 = AbstractC3224d.m15541t(lg8Var1113, this);
                        if (objM15541t14 != coroutineSingletons) {
                            reviewActivityResult4 = reviewActivityResult2;
                            int i9 = i;
                            str7 = str3;
                            if (((Boolean) objM15541t14).booleanValue()) {
                                jfa.m14425h(ef3VarM9545R0.f37173f);
                            } else {
                                jfa.m14425h(ef3VarM9545R0.f37173f);
                            }
                            lg8 lg8Var122 = ((C1370c) reviewActivityResultFragment2.m9547T0()).f18542n0;
                            this.f32105g = lessonCard;
                            this.f32099a = reviewActivityResultFragment2;
                            this.f32100b = reviewActivityResult4;
                            this.f32101c = str7;
                            this.f32102d = ef3VarM9545R0;
                            this.f32103e = i9;
                            this.f32104f = 12;
                            objM15541t15 = AbstractC3224d.m15541t(lg8Var122, this);
                            if (objM15541t15 != coroutineSingletons) {
                                reviewActivityResult5 = reviewActivityResult4;
                                ef3Var4 = ef3VarM9545R0;
                                if (((Boolean) objM15541t15).booleanValue()) {
                                    jfa.m14425h(ef3Var4.f37170c);
                                } else {
                                    jfa.m14425h(ef3Var4.f37170c);
                                }
                                ef3VarM9545R0 = ef3Var4;
                                str = str7;
                                reviewActivityResult = reviewActivityResult5;
                                reviewActivityResultFragment = reviewActivityResultFragment2;
                                i4 = vb8.f65168a[reviewActivityResult.ordinal()];
                                if (i4 != 1) {
                                    TextView textView11112 = ef3VarM9545R0.f37175h;
                                    jfa.m14429l(textView11112);
                                    textView11112.setText(reviewActivityResultFragment.m2111m(R$string.activities_correct));
                                    textView11112.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.greenTint));
                                } else if (i4 != 2) {
                                    TextView textView11113 = ef3VarM9545R0.f37175h;
                                    jfa.m14429l(textView11113);
                                    textView11113.setText(reviewActivityResultFragment.m2111m(R$string.activities_incorrect));
                                    textView11113.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.redTint));
                                } else if (i4 != 3) {
                                    TextView textView11114 = ef3VarM9545R0.f37175h;
                                    jfa.m14429l(textView11114);
                                    textView11114.setText(reviewActivityResultFragment.m2111m(R$string.activities_almost));
                                    textView11114.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.yellowTint));
                                } else {
                                    if (i4 == 4) {
                                        gm5.m12750e();
                                        return null;
                                    }
                                    jfa.m14425h(ef3VarM9545R0.f37175h);
                                }
                                if (str != null) {
                                    jfa.m14425h(ef3VarM9545R0.f37172e);
                                } else {
                                    jfa.m14425h(ef3VarM9545R0.f37172e);
                                }
                                return xfa.f68157a;
                            }
                        }
                    }
                    return coroutineSingletons;
                case 10:
                    i = this.f32103e;
                    ef3 ef3Var9 = this.f32102d;
                    str3 = this.f32101c;
                    ReviewActivityResult reviewActivityResult10 = this.f32100b;
                    reviewActivityResultFragment2 = this.f32099a;
                    AbstractC3193b.m15359b(obj);
                    reviewActivityResult2 = reviewActivityResult10;
                    ef3VarM9545R0 = ef3Var9;
                    objM15541t13 = obj;
                    if (((Boolean) objM15541t13).booleanValue()) {
                        jfa.m14420c(ef3VarM9545R0.f37178k);
                    } else {
                        jfa.m14429l(ef3VarM9545R0.f37178k);
                    }
                    lg8 lg8Var1114 = ((C1370c) reviewActivityResultFragment2.m9547T0()).f18544o0;
                    this.f32105g = lessonCard;
                    this.f32099a = reviewActivityResultFragment2;
                    this.f32100b = reviewActivityResult2;
                    this.f32101c = str3;
                    this.f32102d = ef3VarM9545R0;
                    this.f32103e = i;
                    this.f32104f = 11;
                    objM15541t14 = AbstractC3224d.m15541t(lg8Var1114, this);
                    if (objM15541t14 != coroutineSingletons) {
                        reviewActivityResult4 = reviewActivityResult2;
                        int i10 = i;
                        str7 = str3;
                        if (((Boolean) objM15541t14).booleanValue()) {
                            jfa.m14425h(ef3VarM9545R0.f37173f);
                        } else {
                            jfa.m14425h(ef3VarM9545R0.f37173f);
                        }
                        lg8 lg8Var123 = ((C1370c) reviewActivityResultFragment2.m9547T0()).f18542n0;
                        this.f32105g = lessonCard;
                        this.f32099a = reviewActivityResultFragment2;
                        this.f32100b = reviewActivityResult4;
                        this.f32101c = str7;
                        this.f32102d = ef3VarM9545R0;
                        this.f32103e = i10;
                        this.f32104f = 12;
                        objM15541t15 = AbstractC3224d.m15541t(lg8Var123, this);
                        if (objM15541t15 != coroutineSingletons) {
                            reviewActivityResult5 = reviewActivityResult4;
                            ef3Var4 = ef3VarM9545R0;
                            if (((Boolean) objM15541t15).booleanValue()) {
                                jfa.m14425h(ef3Var4.f37170c);
                            } else {
                                jfa.m14425h(ef3Var4.f37170c);
                            }
                            ef3VarM9545R0 = ef3Var4;
                            str = str7;
                            reviewActivityResult = reviewActivityResult5;
                            reviewActivityResultFragment = reviewActivityResultFragment2;
                            i4 = vb8.f65168a[reviewActivityResult.ordinal()];
                            if (i4 != 1) {
                                TextView textView11115 = ef3VarM9545R0.f37175h;
                                jfa.m14429l(textView11115);
                                textView11115.setText(reviewActivityResultFragment.m2111m(R$string.activities_correct));
                                textView11115.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.greenTint));
                            } else if (i4 != 2) {
                                TextView textView11116 = ef3VarM9545R0.f37175h;
                                jfa.m14429l(textView11116);
                                textView11116.setText(reviewActivityResultFragment.m2111m(R$string.activities_incorrect));
                                textView11116.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.redTint));
                            } else if (i4 != 3) {
                                TextView textView11117 = ef3VarM9545R0.f37175h;
                                jfa.m14429l(textView11117);
                                textView11117.setText(reviewActivityResultFragment.m2111m(R$string.activities_almost));
                                textView11117.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.yellowTint));
                            } else {
                                if (i4 == 4) {
                                    gm5.m12750e();
                                    return null;
                                }
                                jfa.m14425h(ef3VarM9545R0.f37175h);
                            }
                            if (str != null) {
                                jfa.m14425h(ef3VarM9545R0.f37172e);
                            } else {
                                jfa.m14425h(ef3VarM9545R0.f37172e);
                            }
                            return xfa.f68157a;
                        }
                    }
                    return coroutineSingletons;
                case 11:
                    i = this.f32103e;
                    ef3 ef3Var10 = this.f32102d;
                    str3 = this.f32101c;
                    ReviewActivityResult reviewActivityResult11 = this.f32100b;
                    reviewActivityResultFragment2 = this.f32099a;
                    AbstractC3193b.m15359b(obj);
                    reviewActivityResult4 = reviewActivityResult11;
                    ef3VarM9545R0 = ef3Var10;
                    objM15541t14 = obj;
                    int i11 = i;
                    str7 = str3;
                    if (((Boolean) objM15541t14).booleanValue()) {
                        jfa.m14425h(ef3VarM9545R0.f37173f);
                    } else {
                        jfa.m14425h(ef3VarM9545R0.f37173f);
                    }
                    lg8 lg8Var124 = ((C1370c) reviewActivityResultFragment2.m9547T0()).f18542n0;
                    this.f32105g = lessonCard;
                    this.f32099a = reviewActivityResultFragment2;
                    this.f32100b = reviewActivityResult4;
                    this.f32101c = str7;
                    this.f32102d = ef3VarM9545R0;
                    this.f32103e = i11;
                    this.f32104f = 12;
                    objM15541t15 = AbstractC3224d.m15541t(lg8Var124, this);
                    if (objM15541t15 != coroutineSingletons) {
                        reviewActivityResult5 = reviewActivityResult4;
                        ef3Var4 = ef3VarM9545R0;
                        if (((Boolean) objM15541t15).booleanValue()) {
                            jfa.m14425h(ef3Var4.f37170c);
                        } else {
                            jfa.m14425h(ef3Var4.f37170c);
                        }
                        ef3VarM9545R0 = ef3Var4;
                        str = str7;
                        reviewActivityResult = reviewActivityResult5;
                        reviewActivityResultFragment = reviewActivityResultFragment2;
                        i4 = vb8.f65168a[reviewActivityResult.ordinal()];
                        if (i4 != 1) {
                            TextView textView11118 = ef3VarM9545R0.f37175h;
                            jfa.m14429l(textView11118);
                            textView11118.setText(reviewActivityResultFragment.m2111m(R$string.activities_correct));
                            textView11118.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.greenTint));
                        } else if (i4 != 2) {
                            TextView textView11119 = ef3VarM9545R0.f37175h;
                            jfa.m14429l(textView11119);
                            textView11119.setText(reviewActivityResultFragment.m2111m(R$string.activities_incorrect));
                            textView11119.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.redTint));
                        } else if (i4 != 3) {
                            TextView textView111110 = ef3VarM9545R0.f37175h;
                            jfa.m14429l(textView111110);
                            textView111110.setText(reviewActivityResultFragment.m2111m(R$string.activities_almost));
                            textView111110.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.yellowTint));
                        } else {
                            if (i4 == 4) {
                                gm5.m12750e();
                                return null;
                            }
                            jfa.m14425h(ef3VarM9545R0.f37175h);
                        }
                        if (str != null) {
                            jfa.m14425h(ef3VarM9545R0.f37172e);
                        } else {
                            jfa.m14425h(ef3VarM9545R0.f37172e);
                        }
                        return xfa.f68157a;
                    }
                    return coroutineSingletons;
                case 12:
                    ef3Var4 = this.f32102d;
                    str7 = this.f32101c;
                    reviewActivityResult5 = this.f32100b;
                    ReviewActivityResultFragment reviewActivityResultFragment5 = this.f32099a;
                    AbstractC3193b.m15359b(obj);
                    reviewActivityResultFragment2 = reviewActivityResultFragment5;
                    objM15541t15 = obj;
                    if (((Boolean) objM15541t15).booleanValue()) {
                        jfa.m14425h(ef3Var4.f37170c);
                    } else {
                        jfa.m14425h(ef3Var4.f37170c);
                    }
                    ef3VarM9545R0 = ef3Var4;
                    str = str7;
                    reviewActivityResult = reviewActivityResult5;
                    reviewActivityResultFragment = reviewActivityResultFragment2;
                    i4 = vb8.f65168a[reviewActivityResult.ordinal()];
                    if (i4 != 1) {
                        TextView textView111111 = ef3VarM9545R0.f37175h;
                        jfa.m14429l(textView111111);
                        textView111111.setText(reviewActivityResultFragment.m2111m(R$string.activities_correct));
                        textView111111.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.greenTint));
                    } else if (i4 != 2) {
                        TextView textView111112 = ef3VarM9545R0.f37175h;
                        jfa.m14429l(textView111112);
                        textView111112.setText(reviewActivityResultFragment.m2111m(R$string.activities_incorrect));
                        textView111112.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.redTint));
                    } else if (i4 != 3) {
                        TextView textView111113 = ef3VarM9545R0.f37175h;
                        jfa.m14429l(textView111113);
                        textView111113.setText(reviewActivityResultFragment.m2111m(R$string.activities_almost));
                        textView111113.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.yellowTint));
                    } else {
                        if (i4 == 4) {
                            gm5.m12750e();
                            return null;
                        }
                        jfa.m14425h(ef3VarM9545R0.f37175h);
                    }
                    if (str != null) {
                        jfa.m14425h(ef3VarM9545R0.f37172e);
                    } else {
                        jfa.m14425h(ef3VarM9545R0.f37172e);
                    }
                    return xfa.f68157a;
                case 13:
                    ef3Var = this.f32102d;
                    str2 = this.f32101c;
                    reviewActivityResult = this.f32100b;
                    ReviewActivityResultFragment reviewActivityResultFragment6 = this.f32099a;
                    AbstractC3193b.m15359b(obj);
                    reviewActivityResultFragment = reviewActivityResultFragment6;
                    objM15541t3 = obj;
                    if (fa4.m11650l(((Map) objM15541t3).get(i19.m13627a(ViewKeys.Cloze).name()), Boolean.FALSE)) {
                        jfa.m14420c(ef3Var.f37178k);
                    } else {
                        jfa.m14429l(ef3Var.f37178k);
                    }
                    ef3VarM9545R0 = ef3Var;
                    str = str2;
                    i4 = vb8.f65168a[reviewActivityResult.ordinal()];
                    if (i4 != 1) {
                        TextView textView111114 = ef3VarM9545R0.f37175h;
                        jfa.m14429l(textView111114);
                        textView111114.setText(reviewActivityResultFragment.m2111m(R$string.activities_correct));
                        textView111114.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.greenTint));
                    } else if (i4 != 2) {
                        TextView textView111115 = ef3VarM9545R0.f37175h;
                        jfa.m14429l(textView111115);
                        textView111115.setText(reviewActivityResultFragment.m2111m(R$string.activities_incorrect));
                        textView111115.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.redTint));
                    } else if (i4 != 3) {
                        TextView textView111116 = ef3VarM9545R0.f37175h;
                        jfa.m14429l(textView111116);
                        textView111116.setText(reviewActivityResultFragment.m2111m(R$string.activities_almost));
                        textView111116.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.yellowTint));
                    } else {
                        if (i4 == 4) {
                            gm5.m12750e();
                            return null;
                        }
                        jfa.m14425h(ef3VarM9545R0.f37175h);
                    }
                    if (str != null) {
                        jfa.m14425h(ef3VarM9545R0.f37172e);
                    } else {
                        jfa.m14425h(ef3VarM9545R0.f37172e);
                    }
                    return xfa.f68157a;
                case 14:
                    ef3Var = this.f32102d;
                    str2 = this.f32101c;
                    reviewActivityResult = this.f32100b;
                    ReviewActivityResultFragment reviewActivityResultFragment7 = this.f32099a;
                    AbstractC3193b.m15359b(obj);
                    reviewActivityResultFragment = reviewActivityResultFragment7;
                    objM15541t = obj;
                    if (fa4.m11650l(((Map) objM15541t).get(i19.m13627a(ViewKeys.Dictation).name()), Boolean.FALSE)) {
                        jfa.m14420c(ef3Var.f37178k);
                    } else {
                        jfa.m14429l(ef3Var.f37178k);
                    }
                    ef3VarM9545R0 = ef3Var;
                    str = str2;
                    i4 = vb8.f65168a[reviewActivityResult.ordinal()];
                    if (i4 != 1) {
                        TextView textView111117 = ef3VarM9545R0.f37175h;
                        jfa.m14429l(textView111117);
                        textView111117.setText(reviewActivityResultFragment.m2111m(R$string.activities_correct));
                        textView111117.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.greenTint));
                    } else if (i4 != 2) {
                        TextView textView111118 = ef3VarM9545R0.f37175h;
                        jfa.m14429l(textView111118);
                        textView111118.setText(reviewActivityResultFragment.m2111m(R$string.activities_incorrect));
                        textView111118.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.redTint));
                    } else if (i4 != 3) {
                        TextView textView111119 = ef3VarM9545R0.f37175h;
                        jfa.m14429l(textView111119);
                        textView111119.setText(reviewActivityResultFragment.m2111m(R$string.activities_almost));
                        textView111119.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.yellowTint));
                    } else {
                        if (i4 == 4) {
                            gm5.m12750e();
                            return null;
                        }
                        jfa.m14425h(ef3VarM9545R0.f37175h);
                    }
                    if (str != null) {
                        jfa.m14425h(ef3VarM9545R0.f37172e);
                    } else {
                        jfa.m14425h(ef3VarM9545R0.f37172e);
                    }
                    return xfa.f68157a;
                case 15:
                    ef3Var = this.f32102d;
                    str2 = this.f32101c;
                    reviewActivityResult = this.f32100b;
                    ReviewActivityResultFragment reviewActivityResultFragment8 = this.f32099a;
                    AbstractC3193b.m15359b(obj);
                    reviewActivityResultFragment = reviewActivityResultFragment8;
                    objM15541t2 = obj;
                    if (fa4.m11650l(((Map) objM15541t2).get(i19.m13627a(ViewKeys.MultipleChoice).name()), Boolean.FALSE)) {
                        jfa.m14420c(ef3Var.f37178k);
                    } else {
                        jfa.m14429l(ef3Var.f37178k);
                    }
                    ef3VarM9545R0 = ef3Var;
                    str = str2;
                    i4 = vb8.f65168a[reviewActivityResult.ordinal()];
                    if (i4 != 1) {
                        TextView textView1111110 = ef3VarM9545R0.f37175h;
                        jfa.m14429l(textView1111110);
                        textView1111110.setText(reviewActivityResultFragment.m2111m(R$string.activities_correct));
                        textView1111110.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.greenTint));
                    } else if (i4 != 2) {
                        TextView textView1111111 = ef3VarM9545R0.f37175h;
                        jfa.m14429l(textView1111111);
                        textView1111111.setText(reviewActivityResultFragment.m2111m(R$string.activities_incorrect));
                        textView1111111.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.redTint));
                    } else if (i4 != 3) {
                        TextView textView1111112 = ef3VarM9545R0.f37175h;
                        jfa.m14429l(textView1111112);
                        textView1111112.setText(reviewActivityResultFragment.m2111m(R$string.activities_almost));
                        textView1111112.setTextColor(jfa.m14431n(reviewActivityResultFragment.m2090R(), R$attr.yellowTint));
                    } else {
                        if (i4 == 4) {
                            gm5.m12750e();
                            return null;
                        }
                        jfa.m14425h(ef3VarM9545R0.f37175h);
                    }
                    if (str != null) {
                        jfa.m14425h(ef3VarM9545R0.f37172e);
                    } else {
                        jfa.m14425h(ef3VarM9545R0.f37172e);
                    }
                    return xfa.f68157a;
                default:
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityResultFragment$onViewCreated$2$3(nb8 nb8Var, ReviewActivityResultFragment reviewActivityResultFragment, ReviewActivityResult reviewActivityResult, String str, Continuation continuation) {
        super(2, continuation);
        this.f32095b = reviewActivityResultFragment;
        this.f32096c = nb8Var;
        this.f32097d = reviewActivityResult;
        this.f32098e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewActivityResultFragment$onViewCreated$2$3(this.f32096c, this.f32095b, this.f32097d, this.f32098e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewActivityResultFragment$onViewCreated$2$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32094a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReviewActivityResultFragment.f32067H0;
            ReviewActivityResultFragment reviewActivityResultFragment = this.f32095b;
            c18 c18Var = reviewActivityResultFragment.m9548U0().f32382o;
            C26861 c26861 = new C26861(this.f32096c, reviewActivityResultFragment, this.f32097d, this.f32098e, null);
            c18Var.getClass();
            this.f32094a = 1;
            if (AbstractC3224d.m15529h(c18Var, c26861, this) == coroutineSingletons) {
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
