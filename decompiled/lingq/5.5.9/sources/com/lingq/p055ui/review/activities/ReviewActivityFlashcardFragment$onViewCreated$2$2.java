package com.lingq.p055ui.review.activities;

import ae.C0062b;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.controllers.InterfaceC3275c;
import com.lingq.p055ui.token.ViewLearnProgress;
import com.lingq.shared.storage.ReviewStoreImpl$special$$inlined$map$10;
import com.lingq.shared.storage.ReviewStoreImpl$special$$inlined$map$11;
import com.lingq.shared.storage.ReviewStoreImpl$special$$inlined$map$16;
import com.lingq.shared.storage.ReviewStoreImpl$special$$inlined$map$17;
import com.lingq.shared.storage.ReviewStoreImpl$special$$inlined$map$18;
import com.lingq.shared.storage.ReviewStoreImpl$special$$inlined$map$19;
import com.lingq.shared.storage.ReviewStoreImpl$special$$inlined$map$8;
import com.lingq.shared.storage.ReviewStoreImpl$special$$inlined$map$9;
import com.lingq.shared.uimodel.token.TokenMeaning;
import com.lingq.util.C4924a;
import dm.C5207g;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import li.C7374a;
import no.C7828f;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p338qd.C8573r0;
import p462wj.AbstractC9953a;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import ph.C8299i1;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivityFlashcardFragment$onViewCreated$2$2", m19206f = "ReviewActivityFlashcardFragment.kt", m19207l = {66}, m19208m = "invokeSuspend")
public final class ReviewActivityFlashcardFragment$onViewCreated$2$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29792e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ReviewActivityFlashcardFragment f29793f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AbstractC9953a f29794g;

    /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivityFlashcardFragment$onViewCreated$2$2$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lli/a;", "card", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivityFlashcardFragment$onViewCreated$2$2$1", m19206f = "ReviewActivityFlashcardFragment.kt", m19207l = {82, 89, 94, 99, 105, 112, 117, 122}, m19208m = "invokeSuspend")
    public static final class C45701 extends SuspendLambda implements InterfaceC2056p<C7374a, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public ReviewActivityFlashcardFragment f29795e;

        /* JADX INFO: renamed from: f */
        public C8299i1 f29796f;

        /* JADX INFO: renamed from: g */
        public int f29797g;

        /* JADX INFO: renamed from: h */
        public /* synthetic */ Object f29798h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ ReviewActivityFlashcardFragment f29799i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ AbstractC9953a f29800j;

        /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivityFlashcardFragment$onViewCreated$2$2$1$a */
        public static final class a implements ViewLearnProgress.InterfaceC4863a {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ReviewActivityFlashcardFragment f29801a;

            public a(ReviewActivityFlashcardFragment reviewActivityFlashcardFragment) {
                this.f29801a = reviewActivityFlashcardFragment;
            }

            @Override // com.lingq.p055ui.token.ViewLearnProgress.InterfaceC4863a
            /* JADX INFO: renamed from: a */
            public final void mo10269a(int i10) {
                ReviewActivityViewModel reviewActivityViewModel = (ReviewActivityViewModel) this.f29801a.f29777B0.getValue();
                C7828f.m15570d(C8573r0.m16767w0(reviewActivityViewModel), null, null, new ReviewActivityViewModel$updateCardStatus$1(reviewActivityViewModel, i10, null), 3);
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivityFlashcardFragment$onViewCreated$2$2$1$b */
        public static final class b implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ReviewActivityFlashcardFragment f29802a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C7374a f29803b;

            public b(ReviewActivityFlashcardFragment reviewActivityFlashcardFragment, C7374a c7374a) {
                this.f29802a = reviewActivityFlashcardFragment;
                this.f29803b = c7374a;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewActivityFlashcardFragment reviewActivityFlashcardFragment = this.f29802a;
                InterfaceC3275c.a.m9347b((ReviewActivityViewModel) reviewActivityFlashcardFragment.f29777B0.getValue(), reviewActivityFlashcardFragment.m10267n0().mo498E1(), this.f29803b.f41142a, true, 0.0f, 8);
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivityFlashcardFragment$onViewCreated$2$2$1$c */
        public static final class c implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ReviewActivityFlashcardFragment f29804a;

            public c(ReviewActivityFlashcardFragment reviewActivityFlashcardFragment) {
                this.f29804a = reviewActivityFlashcardFragment;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewActivityFlashcardFragment.f29775E0;
                this.f29804a.m10267n0().f29652g0.mo14371k(C9072e.f47360a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45701(ReviewActivityFlashcardFragment reviewActivityFlashcardFragment, AbstractC9953a abstractC9953a, InterfaceC9968c<? super C45701> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f29799i = reviewActivityFlashcardFragment;
            this.f29800j = abstractC9953a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C45701 c45701 = new C45701(this.f29799i, this.f29800j, interfaceC9968c);
            c45701.f29798h = obj;
            return c45701;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(C7374a c7374a, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C45701) mo1336a(c7374a, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Code duplicated, block: B:33:0x0112  */
        /* JADX WARN: Code duplicated, block: B:34:0x0123  */
        /* JADX WARN: Code duplicated, block: B:37:0x014b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:38:0x014c  */
        /* JADX WARN: Code duplicated, block: B:41:0x0156  */
        /* JADX WARN: Code duplicated, block: B:42:0x015f  */
        /* JADX WARN: Code duplicated, block: B:45:0x017e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:46:0x017f  */
        /* JADX WARN: Code duplicated, block: B:49:0x0189  */
        /* JADX WARN: Code duplicated, block: B:50:0x0192  */
        /* JADX WARN: Code duplicated, block: B:53:0x01b2 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:54:0x01b3  */
        /* JADX WARN: Code duplicated, block: B:57:0x01be  */
        /* JADX WARN: Code duplicated, block: B:58:0x01c7  */
        /* JADX WARN: Code duplicated, block: B:68:0x01fe  */
        /* JADX WARN: Code duplicated, block: B:69:0x020f  */
        /* JADX WARN: Code duplicated, block: B:72:0x0236 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:73:0x0237  */
        /* JADX WARN: Code duplicated, block: B:76:0x0241  */
        /* JADX WARN: Code duplicated, block: B:77:0x024a  */
        /* JADX WARN: Code duplicated, block: B:80:0x0269 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:81:0x026a  */
        /* JADX WARN: Code duplicated, block: B:84:0x0274  */
        /* JADX WARN: Code duplicated, block: B:85:0x027d  */
        /* JADX WARN: Code duplicated, block: B:88:0x029d A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:89:0x029e  */
        /* JADX WARN: Code duplicated, block: B:92:0x02a9  */
        /* JADX WARN: Code duplicated, block: B:93:0x02b3  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            C7374a c7374a;
            ReviewActivityFlashcardFragment reviewActivityFlashcardFragment;
            C8299i1 c8299i1;
            String str;
            C7374a c7374a2;
            ReviewActivityFlashcardFragment reviewActivityFlashcardFragment2;
            C8299i1 c8299i2;
            C7374a c7374a3;
            ReviewActivityFlashcardFragment reviewActivityFlashcardFragment3;
            C8299i1 c8299i3;
            ReviewActivityFlashcardFragment reviewActivityFlashcardFragment4;
            C7374a c7374a4;
            ReviewActivityFlashcardFragment reviewActivityFlashcardFragment5;
            C7374a c7374a5;
            C8299i1 c8299i4;
            C7374a c7374a6;
            ReviewActivityFlashcardFragment reviewActivityFlashcardFragment6;
            C7374a c7374a7;
            ReviewActivityFlashcardFragment reviewActivityFlashcardFragment7;
            C7374a c7374a8;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            switch (this.f29797g) {
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    C7499b.m14977z0(obj);
                    c7374a = (C7374a) this.f29798h;
                    if (c7374a != null) {
                        InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewActivityFlashcardFragment.f29775E0;
                        reviewActivityFlashcardFragment = this.f29799i;
                        reviewActivityFlashcardFragment.getClass();
                        c8299i1 = (C8299i1) reviewActivityFlashcardFragment.f29776A0.m10489a(reviewActivityFlashcardFragment, ReviewActivityFlashcardFragment.f29775E0[0]);
                        TextView textView = c8299i1.f44886c;
                        String strM10454d = C4924a.m10454d(c7374a.f41142a);
                        List<String> list = c7374a.f41144c;
                        if (list.isEmpty()) {
                            list = c7374a.f41143b;
                        }
                        textView.setText(C4924a.m10452c(list, strM10454d));
                        TokenMeaning tokenMeaning = (TokenMeaning) C6752c.m13425S(c7374a.f41146e);
                        if (tokenMeaning == null || (str = tokenMeaning.f22090c) == null) {
                            str = "";
                        }
                        c8299i1.f44887d.setText(str);
                        c8299i1.f44885b.setText(c7374a.f41148g);
                        int i10 = c7374a.f41150i;
                        Integer num = c7374a.f41151j;
                        ViewLearnProgress viewLearnProgress = c8299i1.f44890g;
                        viewLearnProgress.m10386b(i10, num);
                        viewLearnProgress.setOnChangeStatusListener(new a(reviewActivityFlashcardFragment));
                        AbstractC9953a abstractC9953a = this.f29800j;
                        if (abstractC9953a instanceof AbstractC9953a.d) {
                            ReviewStoreImpl$special$$inlined$map$8 reviewStoreImpl$special$$inlined$map$8Mo9673w = reviewActivityFlashcardFragment.m10268o0().mo9673w();
                            this.f29798h = c7374a;
                            this.f29795e = reviewActivityFlashcardFragment;
                            this.f29796f = c8299i1;
                            this.f29797g = 1;
                            Object objM14360a = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$8Mo9673w, this);
                            if (objM14360a == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            c7374a3 = c7374a;
                            obj = objM14360a;
                            reviewActivityFlashcardFragment3 = reviewActivityFlashcardFragment;
                            c8299i3 = c8299i1;
                            if (((Boolean) obj).booleanValue()) {
                                ImageButton imageButton = c8299i3.f44884a;
                                C5207g.m11110e(imageButton, "btnTts");
                                C4924a.m10457e0(imageButton);
                                TextView textView2 = c8299i3.f44886c;
                                C5207g.m11110e(textView2, "tvTerm");
                                C4924a.m10457e0(textView2);
                            } else {
                                ImageButton imageButton2 = c8299i3.f44884a;
                                C5207g.m11110e(imageButton2, "btnTts");
                                C4924a.m10422A(imageButton2);
                                TextView textView3 = c8299i3.f44886c;
                                C5207g.m11110e(textView3, "tvTerm");
                                C4924a.m10422A(textView3);
                            }
                            ReviewStoreImpl$special$$inlined$map$9 reviewStoreImpl$special$$inlined$map$9Mo9656f = reviewActivityFlashcardFragment3.m10268o0().mo9656f();
                            this.f29798h = c7374a3;
                            this.f29795e = reviewActivityFlashcardFragment3;
                            this.f29796f = c8299i3;
                            this.f29797g = 2;
                            obj = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$9Mo9656f, this);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            reviewActivityFlashcardFragment4 = reviewActivityFlashcardFragment3;
                            c7374a4 = c7374a3;
                            if (((Boolean) obj).booleanValue()) {
                                TextView textView4 = c8299i3.f44887d;
                                C5207g.m11110e(textView4, "tvTranslation");
                                C4924a.m10457e0(textView4);
                            } else {
                                TextView textView5 = c8299i3.f44887d;
                                C5207g.m11110e(textView5, "tvTranslation");
                                C4924a.m10422A(textView5);
                            }
                            ReviewStoreImpl$special$$inlined$map$10 reviewStoreImpl$special$$inlined$map$10Mo9648X = reviewActivityFlashcardFragment4.m10268o0().mo9648X();
                            this.f29798h = c7374a4;
                            this.f29795e = reviewActivityFlashcardFragment4;
                            this.f29796f = c8299i3;
                            this.f29797g = 3;
                            obj = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$10Mo9648X, this);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            reviewActivityFlashcardFragment5 = reviewActivityFlashcardFragment4;
                            c7374a5 = c7374a4;
                            if (((Boolean) obj).booleanValue()) {
                                TextView textView6 = c8299i3.f44885b;
                                C5207g.m11110e(textView6, "tvPhrase");
                                C4924a.m10457e0(textView6);
                            } else {
                                TextView textView7 = c8299i3.f44885b;
                                C5207g.m11110e(textView7, "tvPhrase");
                                C4924a.m10422A(textView7);
                            }
                            ReviewStoreImpl$special$$inlined$map$11 reviewStoreImpl$special$$inlined$map$11Mo9663m = reviewActivityFlashcardFragment5.m10268o0().mo9663m();
                            this.f29798h = c7374a5;
                            this.f29795e = reviewActivityFlashcardFragment5;
                            this.f29796f = c8299i3;
                            this.f29797g = 4;
                            obj = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$11Mo9663m, this);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            c8299i4 = c8299i3;
                            reviewActivityFlashcardFragment = reviewActivityFlashcardFragment5;
                            c7374a6 = c7374a5;
                            if (((Boolean) obj).booleanValue()) {
                                LinearLayout linearLayout = c8299i4.f44888e;
                                C5207g.m11110e(linearLayout, "viewBottom");
                                C4924a.m10457e0(linearLayout);
                            } else {
                                LinearLayout linearLayout2 = c8299i4.f44888e;
                                C5207g.m11110e(linearLayout2, "viewBottom");
                                C4924a.m10422A(linearLayout2);
                            }
                            c8299i1 = c8299i4;
                            c7374a = c7374a6;
                        } else if (abstractC9953a instanceof AbstractC9953a.e) {
                            ReviewStoreImpl$special$$inlined$map$16 reviewStoreImpl$special$$inlined$map$16Mo9643S = reviewActivityFlashcardFragment.m10268o0().mo9643S();
                            this.f29798h = c7374a;
                            this.f29795e = reviewActivityFlashcardFragment;
                            this.f29796f = c8299i1;
                            this.f29797g = 5;
                            Object objM14360a2 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$16Mo9643S, this);
                            if (objM14360a2 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            c7374a2 = c7374a;
                            obj = objM14360a2;
                            reviewActivityFlashcardFragment2 = reviewActivityFlashcardFragment;
                            c8299i2 = c8299i1;
                            if (((Boolean) obj).booleanValue()) {
                                ImageButton imageButton3 = c8299i2.f44884a;
                                C5207g.m11110e(imageButton3, "btnTts");
                                C4924a.m10457e0(imageButton3);
                                TextView textView8 = c8299i2.f44886c;
                                C5207g.m11110e(textView8, "tvTerm");
                                C4924a.m10457e0(textView8);
                            } else {
                                ImageButton imageButton4 = c8299i2.f44884a;
                                C5207g.m11110e(imageButton4, "btnTts");
                                C4924a.m10422A(imageButton4);
                                TextView textView9 = c8299i2.f44886c;
                                C5207g.m11110e(textView9, "tvTerm");
                                C4924a.m10422A(textView9);
                            }
                            ReviewStoreImpl$special$$inlined$map$17 reviewStoreImpl$special$$inlined$map$17Mo9659i = reviewActivityFlashcardFragment2.m10268o0().mo9659i();
                            this.f29798h = c7374a2;
                            this.f29795e = reviewActivityFlashcardFragment2;
                            this.f29796f = c8299i2;
                            this.f29797g = 6;
                            obj = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$17Mo9659i, this);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            reviewActivityFlashcardFragment6 = reviewActivityFlashcardFragment2;
                            c7374a7 = c7374a2;
                            if (((Boolean) obj).booleanValue()) {
                                TextView textView10 = c8299i2.f44887d;
                                C5207g.m11110e(textView10, "tvTranslation");
                                C4924a.m10457e0(textView10);
                            } else {
                                TextView textView11 = c8299i2.f44887d;
                                C5207g.m11110e(textView11, "tvTranslation");
                                C4924a.m10422A(textView11);
                            }
                            ReviewStoreImpl$special$$inlined$map$18 reviewStoreImpl$special$$inlined$map$18Mo9637M = reviewActivityFlashcardFragment6.m10268o0().mo9637M();
                            this.f29798h = c7374a7;
                            this.f29795e = reviewActivityFlashcardFragment6;
                            this.f29796f = c8299i2;
                            this.f29797g = 7;
                            obj = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$18Mo9637M, this);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            reviewActivityFlashcardFragment7 = reviewActivityFlashcardFragment6;
                            c7374a8 = c7374a7;
                            if (((Boolean) obj).booleanValue()) {
                                TextView textView12 = c8299i2.f44885b;
                                C5207g.m11110e(textView12, "tvPhrase");
                                C4924a.m10457e0(textView12);
                            } else {
                                TextView textView13 = c8299i2.f44885b;
                                C5207g.m11110e(textView13, "tvPhrase");
                                C4924a.m10422A(textView13);
                            }
                            ReviewStoreImpl$special$$inlined$map$19 reviewStoreImpl$special$$inlined$map$19Mo9647W = reviewActivityFlashcardFragment7.m10268o0().mo9647W();
                            this.f29798h = c7374a8;
                            this.f29795e = reviewActivityFlashcardFragment7;
                            this.f29796f = c8299i2;
                            this.f29797g = 8;
                            obj = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$19Mo9647W, this);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            c8299i4 = c8299i2;
                            reviewActivityFlashcardFragment = reviewActivityFlashcardFragment7;
                            c7374a6 = c7374a8;
                            if (((Boolean) obj).booleanValue()) {
                                LinearLayout linearLayout3 = c8299i4.f44888e;
                                C5207g.m11110e(linearLayout3, "viewBottom");
                                C4924a.m10457e0(linearLayout3);
                            } else {
                                LinearLayout linearLayout4 = c8299i4.f44888e;
                                C5207g.m11110e(linearLayout4, "viewBottom");
                                C4924a.m10422A(linearLayout4);
                            }
                            c8299i1 = c8299i4;
                            c7374a = c7374a6;
                        }
                        c8299i1.f44884a.setOnClickListener(new b(reviewActivityFlashcardFragment, c7374a));
                        c8299i1.f44889f.setOnClickListener(new c(reviewActivityFlashcardFragment));
                    }
                    return C9072e.f47360a;
                case 1:
                    c8299i3 = this.f29796f;
                    reviewActivityFlashcardFragment3 = this.f29795e;
                    c7374a3 = (C7374a) this.f29798h;
                    C7499b.m14977z0(obj);
                    if (((Boolean) obj).booleanValue()) {
                        ImageButton imageButton5 = c8299i3.f44884a;
                        C5207g.m11110e(imageButton5, "btnTts");
                        C4924a.m10457e0(imageButton5);
                        TextView textView14 = c8299i3.f44886c;
                        C5207g.m11110e(textView14, "tvTerm");
                        C4924a.m10457e0(textView14);
                    } else {
                        ImageButton imageButton6 = c8299i3.f44884a;
                        C5207g.m11110e(imageButton6, "btnTts");
                        C4924a.m10422A(imageButton6);
                        TextView textView15 = c8299i3.f44886c;
                        C5207g.m11110e(textView15, "tvTerm");
                        C4924a.m10422A(textView15);
                    }
                    ReviewStoreImpl$special$$inlined$map$9 reviewStoreImpl$special$$inlined$map$9Mo9656f2 = reviewActivityFlashcardFragment3.m10268o0().mo9656f();
                    this.f29798h = c7374a3;
                    this.f29795e = reviewActivityFlashcardFragment3;
                    this.f29796f = c8299i3;
                    this.f29797g = 2;
                    obj = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$9Mo9656f2, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    reviewActivityFlashcardFragment4 = reviewActivityFlashcardFragment3;
                    c7374a4 = c7374a3;
                    if (((Boolean) obj).booleanValue()) {
                        TextView textView16 = c8299i3.f44887d;
                        C5207g.m11110e(textView16, "tvTranslation");
                        C4924a.m10422A(textView16);
                    } else {
                        TextView textView17 = c8299i3.f44887d;
                        C5207g.m11110e(textView17, "tvTranslation");
                        C4924a.m10457e0(textView17);
                    }
                    ReviewStoreImpl$special$$inlined$map$10 reviewStoreImpl$special$$inlined$map$10Mo9648X2 = reviewActivityFlashcardFragment4.m10268o0().mo9648X();
                    this.f29798h = c7374a4;
                    this.f29795e = reviewActivityFlashcardFragment4;
                    this.f29796f = c8299i3;
                    this.f29797g = 3;
                    obj = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$10Mo9648X2, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    reviewActivityFlashcardFragment5 = reviewActivityFlashcardFragment4;
                    c7374a5 = c7374a4;
                    if (((Boolean) obj).booleanValue()) {
                        TextView textView18 = c8299i3.f44885b;
                        C5207g.m11110e(textView18, "tvPhrase");
                        C4924a.m10422A(textView18);
                    } else {
                        TextView textView19 = c8299i3.f44885b;
                        C5207g.m11110e(textView19, "tvPhrase");
                        C4924a.m10457e0(textView19);
                    }
                    ReviewStoreImpl$special$$inlined$map$11 reviewStoreImpl$special$$inlined$map$11Mo9663m2 = reviewActivityFlashcardFragment5.m10268o0().mo9663m();
                    this.f29798h = c7374a5;
                    this.f29795e = reviewActivityFlashcardFragment5;
                    this.f29796f = c8299i3;
                    this.f29797g = 4;
                    obj = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$11Mo9663m2, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    c8299i4 = c8299i3;
                    reviewActivityFlashcardFragment = reviewActivityFlashcardFragment5;
                    c7374a6 = c7374a5;
                    if (((Boolean) obj).booleanValue()) {
                        LinearLayout linearLayout5 = c8299i4.f44888e;
                        C5207g.m11110e(linearLayout5, "viewBottom");
                        C4924a.m10422A(linearLayout5);
                    } else {
                        LinearLayout linearLayout6 = c8299i4.f44888e;
                        C5207g.m11110e(linearLayout6, "viewBottom");
                        C4924a.m10457e0(linearLayout6);
                    }
                    c8299i1 = c8299i4;
                    c7374a = c7374a6;
                    c8299i1.f44884a.setOnClickListener(new b(reviewActivityFlashcardFragment, c7374a));
                    c8299i1.f44889f.setOnClickListener(new c(reviewActivityFlashcardFragment));
                    return C9072e.f47360a;
                case 2:
                    c8299i3 = this.f29796f;
                    reviewActivityFlashcardFragment4 = this.f29795e;
                    c7374a4 = (C7374a) this.f29798h;
                    C7499b.m14977z0(obj);
                    if (((Boolean) obj).booleanValue()) {
                        TextView textView110 = c8299i3.f44887d;
                        C5207g.m11110e(textView110, "tvTranslation");
                        C4924a.m10422A(textView110);
                    } else {
                        TextView textView111 = c8299i3.f44887d;
                        C5207g.m11110e(textView111, "tvTranslation");
                        C4924a.m10457e0(textView111);
                    }
                    ReviewStoreImpl$special$$inlined$map$10 reviewStoreImpl$special$$inlined$map$10Mo9648X3 = reviewActivityFlashcardFragment4.m10268o0().mo9648X();
                    this.f29798h = c7374a4;
                    this.f29795e = reviewActivityFlashcardFragment4;
                    this.f29796f = c8299i3;
                    this.f29797g = 3;
                    obj = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$10Mo9648X3, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    reviewActivityFlashcardFragment5 = reviewActivityFlashcardFragment4;
                    c7374a5 = c7374a4;
                    if (((Boolean) obj).booleanValue()) {
                        TextView textView112 = c8299i3.f44885b;
                        C5207g.m11110e(textView112, "tvPhrase");
                        C4924a.m10422A(textView112);
                    } else {
                        TextView textView113 = c8299i3.f44885b;
                        C5207g.m11110e(textView113, "tvPhrase");
                        C4924a.m10457e0(textView113);
                    }
                    ReviewStoreImpl$special$$inlined$map$11 reviewStoreImpl$special$$inlined$map$11Mo9663m3 = reviewActivityFlashcardFragment5.m10268o0().mo9663m();
                    this.f29798h = c7374a5;
                    this.f29795e = reviewActivityFlashcardFragment5;
                    this.f29796f = c8299i3;
                    this.f29797g = 4;
                    obj = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$11Mo9663m3, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    c8299i4 = c8299i3;
                    reviewActivityFlashcardFragment = reviewActivityFlashcardFragment5;
                    c7374a6 = c7374a5;
                    if (((Boolean) obj).booleanValue()) {
                        LinearLayout linearLayout7 = c8299i4.f44888e;
                        C5207g.m11110e(linearLayout7, "viewBottom");
                        C4924a.m10422A(linearLayout7);
                    } else {
                        LinearLayout linearLayout8 = c8299i4.f44888e;
                        C5207g.m11110e(linearLayout8, "viewBottom");
                        C4924a.m10457e0(linearLayout8);
                    }
                    c8299i1 = c8299i4;
                    c7374a = c7374a6;
                    c8299i1.f44884a.setOnClickListener(new b(reviewActivityFlashcardFragment, c7374a));
                    c8299i1.f44889f.setOnClickListener(new c(reviewActivityFlashcardFragment));
                    return C9072e.f47360a;
                case 3:
                    c8299i3 = this.f29796f;
                    reviewActivityFlashcardFragment5 = this.f29795e;
                    c7374a5 = (C7374a) this.f29798h;
                    C7499b.m14977z0(obj);
                    if (((Boolean) obj).booleanValue()) {
                        TextView textView114 = c8299i3.f44885b;
                        C5207g.m11110e(textView114, "tvPhrase");
                        C4924a.m10422A(textView114);
                    } else {
                        TextView textView115 = c8299i3.f44885b;
                        C5207g.m11110e(textView115, "tvPhrase");
                        C4924a.m10457e0(textView115);
                    }
                    ReviewStoreImpl$special$$inlined$map$11 reviewStoreImpl$special$$inlined$map$11Mo9663m4 = reviewActivityFlashcardFragment5.m10268o0().mo9663m();
                    this.f29798h = c7374a5;
                    this.f29795e = reviewActivityFlashcardFragment5;
                    this.f29796f = c8299i3;
                    this.f29797g = 4;
                    obj = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$11Mo9663m4, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    c8299i4 = c8299i3;
                    reviewActivityFlashcardFragment = reviewActivityFlashcardFragment5;
                    c7374a6 = c7374a5;
                    if (((Boolean) obj).booleanValue()) {
                        LinearLayout linearLayout9 = c8299i4.f44888e;
                        C5207g.m11110e(linearLayout9, "viewBottom");
                        C4924a.m10422A(linearLayout9);
                    } else {
                        LinearLayout linearLayout10 = c8299i4.f44888e;
                        C5207g.m11110e(linearLayout10, "viewBottom");
                        C4924a.m10457e0(linearLayout10);
                    }
                    c8299i1 = c8299i4;
                    c7374a = c7374a6;
                    c8299i1.f44884a.setOnClickListener(new b(reviewActivityFlashcardFragment, c7374a));
                    c8299i1.f44889f.setOnClickListener(new c(reviewActivityFlashcardFragment));
                    return C9072e.f47360a;
                case 4:
                    c8299i4 = this.f29796f;
                    reviewActivityFlashcardFragment = this.f29795e;
                    c7374a6 = (C7374a) this.f29798h;
                    C7499b.m14977z0(obj);
                    if (((Boolean) obj).booleanValue()) {
                        LinearLayout linearLayout11 = c8299i4.f44888e;
                        C5207g.m11110e(linearLayout11, "viewBottom");
                        C4924a.m10422A(linearLayout11);
                    } else {
                        LinearLayout linearLayout12 = c8299i4.f44888e;
                        C5207g.m11110e(linearLayout12, "viewBottom");
                        C4924a.m10457e0(linearLayout12);
                    }
                    c8299i1 = c8299i4;
                    c7374a = c7374a6;
                    c8299i1.f44884a.setOnClickListener(new b(reviewActivityFlashcardFragment, c7374a));
                    c8299i1.f44889f.setOnClickListener(new c(reviewActivityFlashcardFragment));
                    return C9072e.f47360a;
                case 5:
                    c8299i2 = this.f29796f;
                    reviewActivityFlashcardFragment2 = this.f29795e;
                    c7374a2 = (C7374a) this.f29798h;
                    C7499b.m14977z0(obj);
                    if (((Boolean) obj).booleanValue()) {
                        ImageButton imageButton7 = c8299i2.f44884a;
                        C5207g.m11110e(imageButton7, "btnTts");
                        C4924a.m10457e0(imageButton7);
                        TextView textView20 = c8299i2.f44886c;
                        C5207g.m11110e(textView20, "tvTerm");
                        C4924a.m10457e0(textView20);
                    } else {
                        ImageButton imageButton8 = c8299i2.f44884a;
                        C5207g.m11110e(imageButton8, "btnTts");
                        C4924a.m10422A(imageButton8);
                        TextView textView21 = c8299i2.f44886c;
                        C5207g.m11110e(textView21, "tvTerm");
                        C4924a.m10422A(textView21);
                    }
                    ReviewStoreImpl$special$$inlined$map$17 reviewStoreImpl$special$$inlined$map$17Mo9659i2 = reviewActivityFlashcardFragment2.m10268o0().mo9659i();
                    this.f29798h = c7374a2;
                    this.f29795e = reviewActivityFlashcardFragment2;
                    this.f29796f = c8299i2;
                    this.f29797g = 6;
                    obj = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$17Mo9659i2, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    reviewActivityFlashcardFragment6 = reviewActivityFlashcardFragment2;
                    c7374a7 = c7374a2;
                    if (((Boolean) obj).booleanValue()) {
                        TextView textView116 = c8299i2.f44887d;
                        C5207g.m11110e(textView116, "tvTranslation");
                        C4924a.m10422A(textView116);
                    } else {
                        TextView textView117 = c8299i2.f44887d;
                        C5207g.m11110e(textView117, "tvTranslation");
                        C4924a.m10457e0(textView117);
                    }
                    ReviewStoreImpl$special$$inlined$map$18 reviewStoreImpl$special$$inlined$map$18Mo9637M2 = reviewActivityFlashcardFragment6.m10268o0().mo9637M();
                    this.f29798h = c7374a7;
                    this.f29795e = reviewActivityFlashcardFragment6;
                    this.f29796f = c8299i2;
                    this.f29797g = 7;
                    obj = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$18Mo9637M2, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    reviewActivityFlashcardFragment7 = reviewActivityFlashcardFragment6;
                    c7374a8 = c7374a7;
                    if (((Boolean) obj).booleanValue()) {
                        TextView textView118 = c8299i2.f44885b;
                        C5207g.m11110e(textView118, "tvPhrase");
                        C4924a.m10422A(textView118);
                    } else {
                        TextView textView119 = c8299i2.f44885b;
                        C5207g.m11110e(textView119, "tvPhrase");
                        C4924a.m10457e0(textView119);
                    }
                    ReviewStoreImpl$special$$inlined$map$19 reviewStoreImpl$special$$inlined$map$19Mo9647W2 = reviewActivityFlashcardFragment7.m10268o0().mo9647W();
                    this.f29798h = c7374a8;
                    this.f29795e = reviewActivityFlashcardFragment7;
                    this.f29796f = c8299i2;
                    this.f29797g = 8;
                    obj = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$19Mo9647W2, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    c8299i4 = c8299i2;
                    reviewActivityFlashcardFragment = reviewActivityFlashcardFragment7;
                    c7374a6 = c7374a8;
                    if (((Boolean) obj).booleanValue()) {
                        LinearLayout linearLayout13 = c8299i4.f44888e;
                        C5207g.m11110e(linearLayout13, "viewBottom");
                        C4924a.m10422A(linearLayout13);
                    } else {
                        LinearLayout linearLayout14 = c8299i4.f44888e;
                        C5207g.m11110e(linearLayout14, "viewBottom");
                        C4924a.m10457e0(linearLayout14);
                    }
                    c8299i1 = c8299i4;
                    c7374a = c7374a6;
                    c8299i1.f44884a.setOnClickListener(new b(reviewActivityFlashcardFragment, c7374a));
                    c8299i1.f44889f.setOnClickListener(new c(reviewActivityFlashcardFragment));
                    return C9072e.f47360a;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    c8299i2 = this.f29796f;
                    reviewActivityFlashcardFragment6 = this.f29795e;
                    c7374a7 = (C7374a) this.f29798h;
                    C7499b.m14977z0(obj);
                    if (((Boolean) obj).booleanValue()) {
                        TextView textView1110 = c8299i2.f44887d;
                        C5207g.m11110e(textView1110, "tvTranslation");
                        C4924a.m10422A(textView1110);
                    } else {
                        TextView textView1111 = c8299i2.f44887d;
                        C5207g.m11110e(textView1111, "tvTranslation");
                        C4924a.m10457e0(textView1111);
                    }
                    ReviewStoreImpl$special$$inlined$map$18 reviewStoreImpl$special$$inlined$map$18Mo9637M3 = reviewActivityFlashcardFragment6.m10268o0().mo9637M();
                    this.f29798h = c7374a7;
                    this.f29795e = reviewActivityFlashcardFragment6;
                    this.f29796f = c8299i2;
                    this.f29797g = 7;
                    obj = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$18Mo9637M3, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    reviewActivityFlashcardFragment7 = reviewActivityFlashcardFragment6;
                    c7374a8 = c7374a7;
                    if (((Boolean) obj).booleanValue()) {
                        TextView textView1112 = c8299i2.f44885b;
                        C5207g.m11110e(textView1112, "tvPhrase");
                        C4924a.m10422A(textView1112);
                    } else {
                        TextView textView1113 = c8299i2.f44885b;
                        C5207g.m11110e(textView1113, "tvPhrase");
                        C4924a.m10457e0(textView1113);
                    }
                    ReviewStoreImpl$special$$inlined$map$19 reviewStoreImpl$special$$inlined$map$19Mo9647W3 = reviewActivityFlashcardFragment7.m10268o0().mo9647W();
                    this.f29798h = c7374a8;
                    this.f29795e = reviewActivityFlashcardFragment7;
                    this.f29796f = c8299i2;
                    this.f29797g = 8;
                    obj = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$19Mo9647W3, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    c8299i4 = c8299i2;
                    reviewActivityFlashcardFragment = reviewActivityFlashcardFragment7;
                    c7374a6 = c7374a8;
                    if (((Boolean) obj).booleanValue()) {
                        LinearLayout linearLayout15 = c8299i4.f44888e;
                        C5207g.m11110e(linearLayout15, "viewBottom");
                        C4924a.m10422A(linearLayout15);
                    } else {
                        LinearLayout linearLayout16 = c8299i4.f44888e;
                        C5207g.m11110e(linearLayout16, "viewBottom");
                        C4924a.m10457e0(linearLayout16);
                    }
                    c8299i1 = c8299i4;
                    c7374a = c7374a6;
                    c8299i1.f44884a.setOnClickListener(new b(reviewActivityFlashcardFragment, c7374a));
                    c8299i1.f44889f.setOnClickListener(new c(reviewActivityFlashcardFragment));
                    return C9072e.f47360a;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    c8299i2 = this.f29796f;
                    reviewActivityFlashcardFragment7 = this.f29795e;
                    c7374a8 = (C7374a) this.f29798h;
                    C7499b.m14977z0(obj);
                    if (((Boolean) obj).booleanValue()) {
                        TextView textView1114 = c8299i2.f44885b;
                        C5207g.m11110e(textView1114, "tvPhrase");
                        C4924a.m10422A(textView1114);
                    } else {
                        TextView textView1115 = c8299i2.f44885b;
                        C5207g.m11110e(textView1115, "tvPhrase");
                        C4924a.m10457e0(textView1115);
                    }
                    ReviewStoreImpl$special$$inlined$map$19 reviewStoreImpl$special$$inlined$map$19Mo9647W4 = reviewActivityFlashcardFragment7.m10268o0().mo9647W();
                    this.f29798h = c7374a8;
                    this.f29795e = reviewActivityFlashcardFragment7;
                    this.f29796f = c8299i2;
                    this.f29797g = 8;
                    obj = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$19Mo9647W4, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    c8299i4 = c8299i2;
                    reviewActivityFlashcardFragment = reviewActivityFlashcardFragment7;
                    c7374a6 = c7374a8;
                    if (((Boolean) obj).booleanValue()) {
                        LinearLayout linearLayout17 = c8299i4.f44888e;
                        C5207g.m11110e(linearLayout17, "viewBottom");
                        C4924a.m10422A(linearLayout17);
                    } else {
                        LinearLayout linearLayout18 = c8299i4.f44888e;
                        C5207g.m11110e(linearLayout18, "viewBottom");
                        C4924a.m10457e0(linearLayout18);
                    }
                    c8299i1 = c8299i4;
                    c7374a = c7374a6;
                    c8299i1.f44884a.setOnClickListener(new b(reviewActivityFlashcardFragment, c7374a));
                    c8299i1.f44889f.setOnClickListener(new c(reviewActivityFlashcardFragment));
                    return C9072e.f47360a;
                case 8:
                    c8299i4 = this.f29796f;
                    reviewActivityFlashcardFragment = this.f29795e;
                    c7374a6 = (C7374a) this.f29798h;
                    C7499b.m14977z0(obj);
                    if (((Boolean) obj).booleanValue()) {
                        LinearLayout linearLayout19 = c8299i4.f44888e;
                        C5207g.m11110e(linearLayout19, "viewBottom");
                        C4924a.m10422A(linearLayout19);
                    } else {
                        LinearLayout linearLayout110 = c8299i4.f44888e;
                        C5207g.m11110e(linearLayout110, "viewBottom");
                        C4924a.m10457e0(linearLayout110);
                    }
                    c8299i1 = c8299i4;
                    c7374a = c7374a6;
                    c8299i1.f44884a.setOnClickListener(new b(reviewActivityFlashcardFragment, c7374a));
                    c8299i1.f44889f.setOnClickListener(new c(reviewActivityFlashcardFragment));
                    return C9072e.f47360a;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityFlashcardFragment$onViewCreated$2$2(ReviewActivityFlashcardFragment reviewActivityFlashcardFragment, AbstractC9953a abstractC9953a, InterfaceC9968c<? super ReviewActivityFlashcardFragment$onViewCreated$2$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f29793f = reviewActivityFlashcardFragment;
        this.f29794g = abstractC9953a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ReviewActivityFlashcardFragment$onViewCreated$2$2(this.f29793f, this.f29794g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ReviewActivityFlashcardFragment$onViewCreated$2$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29792e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            ReviewActivityFlashcardFragment reviewActivityFlashcardFragment = this.f29793f;
            ReviewActivityViewModel reviewActivityViewModel = (ReviewActivityViewModel) reviewActivityFlashcardFragment.f29777B0.getValue();
            C45701 c45701 = new C45701(reviewActivityFlashcardFragment, this.f29794g, null);
            this.f29792e = 1;
            if (C0062b.m369m0(reviewActivityViewModel.f30151I, c45701, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
