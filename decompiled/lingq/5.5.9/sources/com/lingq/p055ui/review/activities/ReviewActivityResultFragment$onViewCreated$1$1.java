package com.lingq.p055ui.review.activities;

import ae.C0062b;
import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.controllers.InterfaceC3275c;
import com.lingq.p055ui.review.ReviewViewModel;
import com.lingq.p055ui.review.data.ReviewActivityResult;
import com.lingq.p055ui.token.TokenData;
import com.lingq.p055ui.token.ViewLearnProgress;
import com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$19;
import com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$20;
import com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$21;
import com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$22;
import com.lingq.shared.storage.ReviewStoreImpl$special$$inlined$map$12;
import com.lingq.shared.storage.ReviewStoreImpl$special$$inlined$map$13;
import com.lingq.shared.storage.ReviewStoreImpl$special$$inlined$map$14;
import com.lingq.shared.storage.ReviewStoreImpl$special$$inlined$map$15;
import com.lingq.shared.storage.ReviewStoreImpl$special$$inlined$map$20;
import com.lingq.shared.storage.ReviewStoreImpl$special$$inlined$map$21;
import com.lingq.shared.storage.ReviewStoreImpl$special$$inlined$map$22;
import com.lingq.shared.storage.ReviewStoreImpl$special$$inlined$map$23;
import com.lingq.shared.uimodel.LanguageLearn;
import com.lingq.shared.uimodel.LanguageLearnBeta;
import com.lingq.shared.uimodel.lesson.LessonStudyTransliteration;
import com.lingq.shared.uimodel.token.TokenMeaning;
import com.lingq.shared.uimodel.token.TokenType;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.util.List;
import java.util.Locale;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import li.C7374a;
import no.C7828f;
import no.InterfaceC7882z;
import p076di.InterfaceC5179a;
import p096ei.C5408a;
import p225kk.C6716m;
import p260m8.C7499b;
import p338qd.C8573r0;
import p462wj.AbstractC9953a;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import ph.C8317l1;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivityResultFragment$onViewCreated$1$1", m19206f = "ReviewActivityResultFragment.kt", m19207l = {77}, m19208m = "invokeSuspend")
public final class ReviewActivityResultFragment$onViewCreated$1$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29945e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ReviewActivityResultFragment f29946f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AbstractC9953a f29947g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ReviewActivityResult f29948h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f29949i;

    /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivityResultFragment$onViewCreated$1$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lli/a;", "card", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivityResultFragment$onViewCreated$1$1$1", m19206f = "ReviewActivityResultFragment.kt", m19207l = {84, 97, 110, 123, 180, 187, 192, 197, 203, 210, 215, 220}, m19208m = "invokeSuspend")
    public static final class C46081 extends SuspendLambda implements InterfaceC2056p<C7374a, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ ReviewActivityResultFragment f29950H;

        /* JADX INFO: renamed from: I */
        public final /* synthetic */ AbstractC9953a f29951I;

        /* JADX INFO: renamed from: J */
        public final /* synthetic */ ReviewActivityResult f29952J;

        /* JADX INFO: renamed from: K */
        public final /* synthetic */ String f29953K;

        /* JADX INFO: renamed from: e */
        public Object f29954e;

        /* JADX INFO: renamed from: f */
        public Object f29955f;

        /* JADX INFO: renamed from: g */
        public Object f29956g;

        /* JADX INFO: renamed from: h */
        public String f29957h;

        /* JADX INFO: renamed from: i */
        public C8317l1 f29958i;

        /* JADX INFO: renamed from: j */
        public String f29959j;

        /* JADX INFO: renamed from: k */
        public int f29960k;

        /* JADX INFO: renamed from: l */
        public /* synthetic */ Object f29961l;

        /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivityResultFragment$onViewCreated$1$1$1$a */
        public static final class a implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ReviewActivityResultFragment f29962a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C7374a f29963b;

            public a(ReviewActivityResultFragment reviewActivityResultFragment, C7374a c7374a) {
                this.f29962a = reviewActivityResultFragment;
                this.f29963b = c7374a;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewActivityResultFragment reviewActivityResultFragment = this.f29962a;
                InterfaceC3275c.a.m9347b(ReviewActivityResultFragment.m10277o0(reviewActivityResultFragment), reviewActivityResultFragment.m10278p0().mo498E1(), this.f29963b.f41142a, true, 0.0f, 8);
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivityResultFragment$onViewCreated$1$1$1$b */
        public static final class b implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ReviewActivityResultFragment f29964a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C7374a f29965b;

            public b(ReviewActivityResultFragment reviewActivityResultFragment, C7374a c7374a) {
                this.f29964a = reviewActivityResultFragment;
                this.f29965b = c7374a;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewActivityResultFragment.f29925G0;
                ReviewViewModel reviewViewModelM10278p0 = this.f29964a.m10278p0();
                reviewViewModelM10278p0.f29608H.mo10048f2(new TokenData(this.f29965b.f41142a, TokenType.CardType, 0, 0, null, null, null, null, 0, null, 1020));
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivityResultFragment$onViewCreated$1$1$1$c */
        public static final class c implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ReviewActivityResultFragment f29966a;

            public c(ReviewActivityResultFragment reviewActivityResultFragment) {
                this.f29966a = reviewActivityResultFragment;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewActivityResultFragment.f29925G0;
                this.f29966a.m10278p0().f29656i0.mo14371k(C9072e.f47360a);
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivityResultFragment$onViewCreated$1$1$1$d */
        public static final class d implements ViewLearnProgress.InterfaceC4863a {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ReviewActivityResultFragment f29967a;

            public d(ReviewActivityResultFragment reviewActivityResultFragment) {
                this.f29967a = reviewActivityResultFragment;
            }

            @Override // com.lingq.p055ui.token.ViewLearnProgress.InterfaceC4863a
            /* JADX INFO: renamed from: a */
            public final void mo10269a(int i10) {
                ReviewActivityViewModel reviewActivityViewModelM10277o0 = ReviewActivityResultFragment.m10277o0(this.f29967a);
                C7828f.m15570d(C8573r0.m16767w0(reviewActivityViewModelM10277o0), null, null, new ReviewActivityViewModel$updateCardStatus$1(reviewActivityViewModelM10277o0, i10, null), 3);
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivityResultFragment$onViewCreated$1$1$1$e */
        public /* synthetic */ class e {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f29968a;

            static {
                int[] iArr = new int[ReviewActivityResult.values().length];
                try {
                    iArr[ReviewActivityResult.Correct.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ReviewActivityResult.Incorrect.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ReviewActivityResult.Almost.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ReviewActivityResult.None.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f29968a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46081(ReviewActivityResultFragment reviewActivityResultFragment, AbstractC9953a abstractC9953a, ReviewActivityResult reviewActivityResult, String str, InterfaceC9968c<? super C46081> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f29950H = reviewActivityResultFragment;
            this.f29951I = abstractC9953a;
            this.f29952J = reviewActivityResult;
            this.f29953K = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C46081 c46081 = new C46081(this.f29950H, this.f29951I, this.f29952J, this.f29953K, interfaceC9968c);
            c46081.f29961l = obj;
            return c46081;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(C7374a c7374a, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C46081) mo1336a(c7374a, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Code duplicated, block: B:101:0x0302  */
        /* JADX WARN: Code duplicated, block: B:103:0x0307  */
        /* JADX WARN: Code duplicated, block: B:110:0x0317  */
        /* JADX WARN: Code duplicated, block: B:113:0x0320  */
        /* JADX WARN: Code duplicated, block: B:115:0x0324  */
        /* JADX WARN: Code duplicated, block: B:116:0x0327  */
        /* JADX WARN: Code duplicated, block: B:119:0x0332  */
        /* JADX WARN: Code duplicated, block: B:121:0x0336  */
        /* JADX WARN: Code duplicated, block: B:122:0x0339  */
        /* JADX WARN: Code duplicated, block: B:136:0x0383  */
        /* JADX WARN: Code duplicated, block: B:138:0x0388  */
        /* JADX WARN: Code duplicated, block: B:146:0x039b  */
        /* JADX WARN: Code duplicated, block: B:147:0x039f  */
        /* JADX WARN: Code duplicated, block: B:150:0x03a7  */
        /* JADX WARN: Code duplicated, block: B:153:0x03b1  */
        /* JADX WARN: Code duplicated, block: B:155:0x03b5  */
        /* JADX WARN: Code duplicated, block: B:156:0x03b9  */
        /* JADX WARN: Code duplicated, block: B:163:0x03e6  */
        /* JADX WARN: Code duplicated, block: B:166:0x0427  */
        /* JADX WARN: Code duplicated, block: B:170:0x042e  */
        /* JADX WARN: Code duplicated, block: B:172:0x0431  */
        /* JADX WARN: Code duplicated, block: B:175:0x0456  */
        /* JADX WARN: Code duplicated, block: B:180:0x0462  */
        /* JADX WARN: Code duplicated, block: B:182:0x0483 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:183:0x0484  */
        /* JADX WARN: Code duplicated, block: B:186:0x048e  */
        /* JADX WARN: Code duplicated, block: B:187:0x049f  */
        /* JADX WARN: Code duplicated, block: B:190:0x04c8 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:191:0x04c9  */
        /* JADX WARN: Code duplicated, block: B:194:0x04d2  */
        /* JADX WARN: Code duplicated, block: B:195:0x04dd  */
        /* JADX WARN: Code duplicated, block: B:198:0x0500 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:199:0x0501  */
        /* JADX WARN: Code duplicated, block: B:202:0x050a  */
        /* JADX WARN: Code duplicated, block: B:203:0x0515  */
        /* JADX WARN: Code duplicated, block: B:206:0x053b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:207:0x053c  */
        /* JADX WARN: Code duplicated, block: B:210:0x0545  */
        /* JADX WARN: Code duplicated, block: B:211:0x0550  */
        /* JADX WARN: Code duplicated, block: B:213:0x0560  */
        /* JADX WARN: Code duplicated, block: B:215:0x056a  */
        /* JADX WARN: Code duplicated, block: B:217:0x058e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:218:0x058f  */
        /* JADX WARN: Code duplicated, block: B:221:0x0599  */
        /* JADX WARN: Code duplicated, block: B:222:0x05aa  */
        /* JADX WARN: Code duplicated, block: B:225:0x05d6 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:226:0x05d7  */
        /* JADX WARN: Code duplicated, block: B:229:0x05e0  */
        /* JADX WARN: Code duplicated, block: B:230:0x05e9  */
        /* JADX WARN: Code duplicated, block: B:233:0x060d A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:234:0x060e  */
        /* JADX WARN: Code duplicated, block: B:237:0x0617  */
        /* JADX WARN: Code duplicated, block: B:238:0x0620  */
        /* JADX WARN: Code duplicated, block: B:241:0x0644 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:242:0x0645  */
        /* JADX WARN: Code duplicated, block: B:245:0x064e  */
        /* JADX WARN: Code duplicated, block: B:246:0x0658  */
        /* JADX WARN: Code duplicated, block: B:247:0x0662  */
        /* JADX WARN: Code duplicated, block: B:250:0x0678  */
        /* JADX WARN: Code duplicated, block: B:252:0x067c  */
        /* JADX WARN: Code duplicated, block: B:254:0x067f  */
        /* JADX WARN: Code duplicated, block: B:257:0x0685  */
        /* JADX WARN: Code duplicated, block: B:258:0x068e  */
        /* JADX WARN: Code duplicated, block: B:259:0x06b3  */
        /* JADX WARN: Code duplicated, block: B:260:0x06d8  */
        /* JADX WARN: Code duplicated, block: B:262:0x06fe  */
        /* JADX WARN: Code duplicated, block: B:266:0x0707  */
        /* JADX WARN: Code duplicated, block: B:269:0x070d  */
        /* JADX WARN: Code duplicated, block: B:270:0x0716  */
        /* JADX WARN: Code duplicated, block: B:30:0x0206  */
        /* JADX WARN: Code duplicated, block: B:32:0x020b  */
        /* JADX WARN: Code duplicated, block: B:38:0x0218 A[PHI: r2 r6 r12 r13 r14 r15 r17 r18 r19
          0x0218: PHI (r2v39 li.a) = (r2v5 li.a), (r2v56 li.a) binds: [B:36:0x0215, B:148:0x03a3] A[DONT_GENERATE, DONT_INLINE]
          0x0218: PHI (r6v12 java.lang.String) = (r6v2 java.lang.String), (r6v17 java.lang.String) binds: [B:36:0x0215, B:148:0x03a3] A[DONT_GENERATE, DONT_INLINE]
          0x0218: PHI (r12v10 ph.l1) = (r12v1 ph.l1), (r12v15 ph.l1) binds: [B:36:0x0215, B:148:0x03a3] A[DONT_GENERATE, DONT_INLINE]
          0x0218: PHI (r13v21 com.lingq.ui.review.data.ReviewActivityResult) = (r13v11 com.lingq.ui.review.data.ReviewActivityResult), (r13v27 com.lingq.ui.review.data.ReviewActivityResult) binds: [B:36:0x0215, B:148:0x03a3] A[DONT_GENERATE, DONT_INLINE]
          0x0218: PHI (r14v21 wj.a) = (r14v12 wj.a), (r14v24 wj.a) binds: [B:36:0x0215, B:148:0x03a3] A[DONT_GENERATE, DONT_INLINE]
          0x0218: PHI (r15v13 com.lingq.ui.review.activities.ReviewActivityResultFragment) = 
          (r15v2 com.lingq.ui.review.activities.ReviewActivityResultFragment)
          (r15v18 com.lingq.ui.review.activities.ReviewActivityResultFragment)
         binds: [B:36:0x0215, B:148:0x03a3] A[DONT_GENERATE, DONT_INLINE]
          0x0218: PHI (r17v8 java.lang.String) = (r17v1 java.lang.String), (r17v13 java.lang.String) binds: [B:36:0x0215, B:148:0x03a3] A[DONT_GENERATE, DONT_INLINE]
          0x0218: PHI (r18v7 java.lang.String) = (r18v1 java.lang.String), (r18v12 java.lang.String) binds: [B:36:0x0215, B:148:0x03a3] A[DONT_GENERATE, DONT_INLINE]
          0x0218: PHI (r19v7 java.lang.String) = (r19v1 java.lang.String), (r19v12 java.lang.String) binds: [B:36:0x0215, B:148:0x03a3] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:39:0x021b  */
        /* JADX WARN: Code duplicated, block: B:42:0x0224  */
        /* JADX WARN: Code duplicated, block: B:44:0x0228  */
        /* JADX WARN: Code duplicated, block: B:45:0x022b  */
        /* JADX WARN: Code duplicated, block: B:48:0x0232  */
        /* JADX WARN: Code duplicated, block: B:50:0x0236  */
        /* JADX WARN: Code duplicated, block: B:51:0x0239  */
        /* JADX WARN: Code duplicated, block: B:66:0x0285  */
        /* JADX WARN: Code duplicated, block: B:68:0x028a  */
        /* JADX WARN: Code duplicated, block: B:76:0x029b  */
        /* JADX WARN: Code duplicated, block: B:77:0x029e  */
        /* JADX WARN: Code duplicated, block: B:80:0x02a5  */
        /* JADX WARN: Code duplicated, block: B:81:0x02a7  */
        /* JADX WARN: Code duplicated, block: B:83:0x02ad  */
        /* JADX WARN: Code duplicated, block: B:84:0x02b0  */
        /* JADX WARN: Code duplicated, block: B:86:0x02b4  */
        /* JADX WARN: Code duplicated, block: B:87:0x02b7  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            C7374a c7374a;
            ReviewActivityResultFragment reviewActivityResultFragment;
            C8317l1 c8317l1M10276n0;
            String str;
            AbstractC9953a abstractC9953a;
            String str2;
            ReviewActivityResult reviewActivityResult;
            String str3;
            String str4;
            String str5;
            Object objM14360a;
            ReviewActivityResult reviewActivityResult2;
            AbstractC9953a abstractC9953a2;
            String str6;
            Object objM14360a2;
            String str7;
            AbstractC9953a abstractC9953a3;
            ReviewActivityResultFragment reviewActivityResultFragment2;
            C7374a c7374a2;
            String str8;
            Object objM14360a3;
            ReviewActivityResult reviewActivityResult3;
            C7374a c7374a3;
            String str9;
            Object objM14360a4;
            String str10;
            int iHashCode;
            LessonStudyTransliteration lessonStudyTransliteration;
            String str11;
            LessonStudyTransliteration lessonStudyTransliteration2;
            String str12;
            String str13;
            int iHashCode2;
            LessonStudyTransliteration lessonStudyTransliteration3;
            String str14;
            LessonStudyTransliteration lessonStudyTransliteration4;
            String str15;
            int iHashCode3;
            LessonStudyTransliteration lessonStudyTransliteration5;
            LessonStudyTransliteration lessonStudyTransliteration6;
            boolean z10;
            boolean z11;
            TokenMeaning tokenMeaning;
            String str16;
            String str17;
            String str18;
            Object objM14360a5;
            ReviewActivityResult reviewActivityResult4;
            String str19;
            Object objM14360a6;
            String str20;
            String str21;
            int iHashCode4;
            LessonStudyTransliteration lessonStudyTransliteration7;
            LessonStudyTransliteration lessonStudyTransliteration8;
            Object objM14360a7;
            ReviewActivityResultFragment reviewActivityResultFragment3;
            Object objM14360a8;
            ReviewActivityResultFragment reviewActivityResultFragment4;
            Object objM14360a9;
            C8317l1 c8317l1;
            Object objM14360a10;
            ReviewActivityResultFragment reviewActivityResultFragment5;
            Object objM14360a11;
            Object objM14360a12;
            int i10;
            boolean z12;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            String str22 = "";
            switch (this.f29960k) {
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    C7499b.m14977z0(obj);
                    c7374a = (C7374a) this.f29961l;
                    if (c7374a != null) {
                        reviewActivityResultFragment = this.f29950H;
                        c8317l1M10276n0 = ReviewActivityResultFragment.m10276n0(reviewActivityResultFragment);
                        String strMo498E1 = reviewActivityResultFragment.m10278p0().mo498E1();
                        boolean zM11106a = C5207g.m11106a(strMo498E1, C5408a.m11569b(LanguageLearn.Mandarin));
                        str = "viewBottom";
                        abstractC9953a = this.f29951I;
                        str2 = "tvPhrase";
                        reviewActivityResult = this.f29952J;
                        str3 = "tvTranslation";
                        str4 = this.f29953K;
                        if (zM11106a) {
                            InterfaceC5179a interfaceC5179a = reviewActivityResultFragment.f29930E0;
                            if (interfaceC5179a == null) {
                                C5207g.m11117l("preferenceStore");
                                throw null;
                            }
                            PreferenceStoreImpl$special$$inlined$map$19 preferenceStoreImpl$special$$inlined$map$19Mo9565L = interfaceC5179a.mo9565L();
                            this.f29961l = c7374a;
                            this.f29954e = reviewActivityResultFragment;
                            this.f29955f = abstractC9953a;
                            this.f29956g = reviewActivityResult;
                            this.f29957h = str4;
                            this.f29958i = c8317l1M10276n0;
                            this.f29959j = "";
                            this.f29960k = 1;
                            objM14360a4 = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$19Mo9565L, this);
                            if (objM14360a4 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            reviewActivityResult2 = reviewActivityResult;
                            abstractC9953a2 = abstractC9953a;
                            str6 = "";
                            str10 = (String) objM14360a4;
                            iHashCode = str10.hashCode();
                            if (iHashCode != -1904268855) {
                                if (iHashCode != -469838457) {
                                    if (iHashCode == 79183 && str10.equals("Off")) {
                                        str6 = "";
                                    }
                                } else if (str10.equals("Traditional")) {
                                    lessonStudyTransliteration2 = c7374a.f41155n;
                                    if (lessonStudyTransliteration2 != null) {
                                        str11 = lessonStudyTransliteration2.f21910d;
                                    } else {
                                        str11 = null;
                                    }
                                    str6 = str11;
                                }
                            } else if (str10.equals("Pinyin")) {
                                lessonStudyTransliteration = c7374a.f41155n;
                                if (lessonStudyTransliteration != null) {
                                    str11 = lessonStudyTransliteration.f21909c;
                                } else {
                                    str11 = null;
                                }
                                str6 = str11;
                            }
                            reviewActivityResult = reviewActivityResult2;
                            abstractC9953a = abstractC9953a2;
                            str5 = str6;
                        } else if (C5207g.m11106a(strMo498E1, C5408a.m11570c(LanguageLearnBeta.ChineseTraditional))) {
                            InterfaceC5179a interfaceC5179a2 = reviewActivityResultFragment.f29930E0;
                            if (interfaceC5179a2 == null) {
                                C5207g.m11117l("preferenceStore");
                                throw null;
                            }
                            PreferenceStoreImpl$special$$inlined$map$21 preferenceStoreImpl$special$$inlined$map$21Mo9586d = interfaceC5179a2.mo9586d();
                            this.f29961l = c7374a;
                            this.f29954e = reviewActivityResultFragment;
                            this.f29955f = abstractC9953a;
                            this.f29956g = reviewActivityResult;
                            this.f29957h = str4;
                            this.f29958i = c8317l1M10276n0;
                            this.f29959j = "";
                            this.f29960k = 2;
                            objM14360a3 = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$21Mo9586d, this);
                            if (objM14360a3 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            reviewActivityResult3 = reviewActivityResult;
                            c7374a3 = c7374a;
                            str9 = "";
                            str12 = (String) objM14360a3;
                            str13 = str9;
                            iHashCode2 = str12.hashCode();
                            String str23 = str4;
                            if (iHashCode2 != -1904268855) {
                                if (iHashCode2 != 79183) {
                                    if (iHashCode2 != 566114168 && str12.equals("Simplified")) {
                                        lessonStudyTransliteration4 = c7374a3.f41155n;
                                        if (lessonStudyTransliteration4 != null) {
                                            str14 = lessonStudyTransliteration4.f21911e;
                                        } else {
                                            str14 = null;
                                        }
                                    } else {
                                        str14 = str13;
                                    }
                                } else if (str12.equals("Off")) {
                                    str14 = "";
                                } else {
                                    str14 = str13;
                                }
                            } else if (str12.equals("Pinyin")) {
                                lessonStudyTransliteration3 = c7374a3.f41155n;
                                if (lessonStudyTransliteration3 != null) {
                                    str14 = lessonStudyTransliteration3.f21909c;
                                } else {
                                    str14 = null;
                                }
                            } else {
                                str14 = str13;
                            }
                            str5 = str14;
                            c7374a = c7374a3;
                            reviewActivityResult = reviewActivityResult3;
                            str4 = str23;
                        } else if (C5207g.m11106a(strMo498E1, C5408a.m11569b(LanguageLearn.Japanese))) {
                            InterfaceC5179a interfaceC5179a3 = reviewActivityResultFragment.f29930E0;
                            if (interfaceC5179a3 == null) {
                                C5207g.m11117l("preferenceStore");
                                throw null;
                            }
                            PreferenceStoreImpl$special$$inlined$map$20 preferenceStoreImpl$special$$inlined$map$20Mo9591f0 = interfaceC5179a3.mo9591f0();
                            this.f29961l = c7374a;
                            this.f29954e = reviewActivityResultFragment;
                            this.f29955f = abstractC9953a;
                            this.f29956g = reviewActivityResult;
                            this.f29957h = str4;
                            this.f29958i = c8317l1M10276n0;
                            this.f29959j = "";
                            this.f29960k = 3;
                            objM14360a2 = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$20Mo9591f0, this);
                            if (objM14360a2 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            str7 = str4;
                            abstractC9953a3 = abstractC9953a;
                            reviewActivityResultFragment2 = reviewActivityResultFragment;
                            c7374a2 = c7374a;
                            str8 = "";
                            str15 = (String) objM14360a2;
                            iHashCode3 = str15.hashCode();
                            if (iHashCode3 != -1841522256) {
                                if (iHashCode3 != -1311598819) {
                                    if (iHashCode3 == 79183 && str15.equals("Off")) {
                                        str6 = "";
                                    }
                                } else if (str15.equals("Hiragana")) {
                                    lessonStudyTransliteration6 = c7374a2.f41155n;
                                    if (lessonStudyTransliteration6 != null) {
                                        str8 = lessonStudyTransliteration6.f21907a;
                                    } else {
                                        str8 = null;
                                    }
                                }
                                str6 = str8;
                            } else {
                                if (str15.equals("Romaji")) {
                                    lessonStudyTransliteration5 = c7374a2.f41155n;
                                    if (lessonStudyTransliteration5 != null) {
                                        str8 = lessonStudyTransliteration5.f21908b;
                                    } else {
                                        str8 = null;
                                    }
                                }
                                str6 = str8;
                            }
                            str4 = str7;
                            abstractC9953a = abstractC9953a3;
                            c7374a = c7374a2;
                            reviewActivityResultFragment = reviewActivityResultFragment2;
                            str5 = str6;
                        } else if (C5207g.m11106a(strMo498E1, C5408a.m11570c(LanguageLearnBeta.Cantonese))) {
                            InterfaceC5179a interfaceC5179a4 = reviewActivityResultFragment.f29930E0;
                            if (interfaceC5179a4 == null) {
                                C5207g.m11117l("preferenceStore");
                                throw null;
                            }
                            PreferenceStoreImpl$special$$inlined$map$22 preferenceStoreImpl$special$$inlined$map$22Mo9555B = interfaceC5179a4.mo9555B();
                            this.f29961l = c7374a;
                            this.f29954e = reviewActivityResultFragment;
                            this.f29955f = abstractC9953a;
                            this.f29956g = reviewActivityResult;
                            this.f29957h = str4;
                            this.f29958i = c8317l1M10276n0;
                            this.f29959j = "";
                            this.f29960k = 4;
                            objM14360a = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$22Mo9555B, this);
                            if (objM14360a == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            reviewActivityResult2 = reviewActivityResult;
                            abstractC9953a2 = abstractC9953a;
                            str6 = "";
                            str21 = (String) objM14360a;
                            iHashCode4 = str21.hashCode();
                            if (iHashCode4 != -702078272) {
                                if (iHashCode4 != 79183) {
                                    if (iHashCode4 == 566114168 && str21.equals("Simplified")) {
                                        lessonStudyTransliteration8 = c7374a.f41155n;
                                        if (lessonStudyTransliteration8 != null) {
                                            str11 = lessonStudyTransliteration8.f21911e;
                                        } else {
                                            str11 = null;
                                        }
                                        str6 = str11;
                                    }
                                } else if (str21.equals("Off")) {
                                    str6 = "";
                                }
                            } else if (str21.equals("Jyutping")) {
                                lessonStudyTransliteration7 = c7374a.f41155n;
                                if (lessonStudyTransliteration7 != null) {
                                    str11 = lessonStudyTransliteration7.f21912f;
                                } else {
                                    str11 = null;
                                }
                                str6 = str11;
                            }
                            reviewActivityResult = reviewActivityResult2;
                            abstractC9953a = abstractC9953a2;
                            str5 = str6;
                        } else {
                            str5 = "";
                        }
                        c8317l1M10276n0.f45001g.setText(C4924a.m10452c(c7374a.f41144c, C4924a.m10454d(c7374a.f41142a)));
                        c8317l1M10276n0.f44999e.setText(c7374a.f41148g);
                        c8317l1M10276n0.f44997c.setText(str5);
                        if (!reviewActivityResultFragment.f29929D0) {
                            InterfaceC3275c.a.m9347b((ReviewActivityViewModel) reviewActivityResultFragment.f29927B0.getValue(), reviewActivityResultFragment.m10278p0().mo498E1(), C4924a.m10454d(c7374a.f41142a), true, 0.0f, 8);
                            reviewActivityResultFragment.f29929D0 = true;
                        }
                        c8317l1M10276n0.f44995a.setOnClickListener(new a(reviewActivityResultFragment, c7374a));
                        c8317l1M10276n0.f44996b.setOnClickListener(new b(reviewActivityResultFragment, c7374a));
                        z10 = abstractC9953a instanceof AbstractC9953a.d;
                        if (!z10 || (abstractC9953a instanceof AbstractC9953a.e)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            c8317l1M10276n0.f45005k.setOnClickListener(new c(reviewActivityResultFragment));
                        }
                        int i11 = c7374a.f41150i;
                        Integer num = c7374a.f41151j;
                        ViewLearnProgress viewLearnProgress = c8317l1M10276n0.f45004j;
                        viewLearnProgress.m10386b(i11, num);
                        viewLearnProgress.setOnChangeStatusListener(new d(reviewActivityResultFragment));
                        tokenMeaning = (TokenMeaning) C6752c.m13425S(c7374a.f41146e);
                        if (tokenMeaning != null && (str20 = tokenMeaning.f22090c) != null) {
                            str22 = str20;
                        }
                        c8317l1M10276n0.f45002h.setText(str22);
                        if (z10) {
                            ReviewStoreImpl$special$$inlined$map$12 reviewStoreImpl$special$$inlined$map$12Mo9675y = reviewActivityResultFragment.m10279q0().mo9675y();
                            this.f29961l = reviewActivityResultFragment;
                            this.f29954e = reviewActivityResult;
                            this.f29955f = str4;
                            this.f29956g = c8317l1M10276n0;
                            this.f29957h = null;
                            this.f29958i = null;
                            this.f29959j = null;
                            this.f29960k = 5;
                            objM14360a6 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$12Mo9675y, this);
                            if (objM14360a6 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            reviewActivityResult4 = reviewActivityResult;
                            str19 = str4;
                            if (((Boolean) objM14360a6).booleanValue()) {
                                ImageButton imageButton = c8317l1M10276n0.f44995a;
                                C5207g.m11110e(imageButton, "btnTts");
                                C4924a.m10457e0(imageButton);
                                TextView textView = c8317l1M10276n0.f45001g;
                                C5207g.m11110e(textView, "tvTerm");
                                C4924a.m10457e0(textView);
                            } else {
                                ImageButton imageButton2 = c8317l1M10276n0.f44995a;
                                C5207g.m11110e(imageButton2, "btnTts");
                                C4924a.m10422A(imageButton2);
                                TextView textView2 = c8317l1M10276n0.f45001g;
                                C5207g.m11110e(textView2, "tvTerm");
                                C4924a.m10422A(textView2);
                            }
                            ReviewStoreImpl$special$$inlined$map$13 reviewStoreImpl$special$$inlined$map$13Mo9635K = reviewActivityResultFragment.m10279q0().mo9635K();
                            this.f29961l = reviewActivityResultFragment;
                            this.f29954e = reviewActivityResult4;
                            this.f29955f = str19;
                            this.f29956g = c8317l1M10276n0;
                            this.f29960k = 6;
                            objM14360a7 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$13Mo9635K, this);
                            if (objM14360a7 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            reviewActivityResultFragment3 = reviewActivityResultFragment;
                            if (((Boolean) objM14360a7).booleanValue()) {
                                TextView textView3 = c8317l1M10276n0.f45002h;
                                C5207g.m11110e(textView3, str3);
                                C4924a.m10457e0(textView3);
                            } else {
                                TextView textView4 = c8317l1M10276n0.f45002h;
                                C5207g.m11110e(textView4, str3);
                                C4924a.m10422A(textView4);
                            }
                            ReviewStoreImpl$special$$inlined$map$14 reviewStoreImpl$special$$inlined$map$14Mo9646V = reviewActivityResultFragment3.m10279q0().mo9646V();
                            this.f29961l = reviewActivityResultFragment3;
                            this.f29954e = reviewActivityResult4;
                            this.f29955f = str19;
                            this.f29956g = c8317l1M10276n0;
                            this.f29960k = 7;
                            objM14360a8 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$14Mo9646V, this);
                            if (objM14360a8 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            reviewActivityResultFragment4 = reviewActivityResultFragment3;
                            if (((Boolean) objM14360a8).booleanValue()) {
                                TextView textView5 = c8317l1M10276n0.f44999e;
                                C5207g.m11110e(textView5, str2);
                                C4924a.m10457e0(textView5);
                            } else {
                                TextView textView6 = c8317l1M10276n0.f44999e;
                                C5207g.m11110e(textView6, str2);
                                C4924a.m10422A(textView6);
                            }
                            ReviewStoreImpl$special$$inlined$map$15 reviewStoreImpl$special$$inlined$map$15Mo9654d = reviewActivityResultFragment4.m10279q0().mo9654d();
                            this.f29961l = reviewActivityResultFragment4;
                            this.f29954e = reviewActivityResult4;
                            this.f29955f = str19;
                            this.f29956g = c8317l1M10276n0;
                            this.f29960k = 8;
                            objM14360a9 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$15Mo9654d, this);
                            if (objM14360a9 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            c8317l1 = c8317l1M10276n0;
                            if (((Boolean) objM14360a9).booleanValue()) {
                                LinearLayout linearLayout = c8317l1.f45003i;
                                C5207g.m11110e(linearLayout, str);
                                C4924a.m10457e0(linearLayout);
                            } else {
                                LinearLayout linearLayout2 = c8317l1.f45003i;
                                C5207g.m11110e(linearLayout2, str);
                                C4924a.m10422A(linearLayout2);
                            }
                            c8317l1M10276n0 = c8317l1;
                            reviewActivityResult = reviewActivityResult4;
                            reviewActivityResultFragment = reviewActivityResultFragment4;
                            str4 = str19;
                        } else {
                            str16 = str;
                            str17 = str2;
                            str18 = str3;
                            if (abstractC9953a instanceof AbstractC9953a.e) {
                                ReviewStoreImpl$special$$inlined$map$20 reviewStoreImpl$special$$inlined$map$20Mo9676z = reviewActivityResultFragment.m10279q0().mo9676z();
                                this.f29961l = reviewActivityResultFragment;
                                this.f29954e = reviewActivityResult;
                                this.f29955f = str4;
                                this.f29956g = c8317l1M10276n0;
                                this.f29957h = null;
                                this.f29958i = null;
                                this.f29959j = null;
                                this.f29960k = 9;
                                objM14360a5 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$20Mo9676z, this);
                                if (objM14360a5 == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                reviewActivityResult4 = reviewActivityResult;
                                str19 = str4;
                                if (((Boolean) objM14360a5).booleanValue()) {
                                    ImageButton imageButton3 = c8317l1M10276n0.f44995a;
                                    C5207g.m11110e(imageButton3, "btnTts");
                                    C4924a.m10457e0(imageButton3);
                                    TextView textView7 = c8317l1M10276n0.f45001g;
                                    C5207g.m11110e(textView7, "tvTerm");
                                    C4924a.m10457e0(textView7);
                                } else {
                                    ImageButton imageButton4 = c8317l1M10276n0.f44995a;
                                    C5207g.m11110e(imageButton4, "btnTts");
                                    C4924a.m10422A(imageButton4);
                                    TextView textView8 = c8317l1M10276n0.f45001g;
                                    C5207g.m11110e(textView8, "tvTerm");
                                    C4924a.m10422A(textView8);
                                }
                                ReviewStoreImpl$special$$inlined$map$21 reviewStoreImpl$special$$inlined$map$21Mo9632H = reviewActivityResultFragment.m10279q0().mo9632H();
                                this.f29961l = reviewActivityResultFragment;
                                this.f29954e = reviewActivityResult4;
                                this.f29955f = str19;
                                this.f29956g = c8317l1M10276n0;
                                this.f29960k = 10;
                                objM14360a10 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$21Mo9632H, this);
                                if (objM14360a10 == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                reviewActivityResultFragment5 = reviewActivityResultFragment;
                                if (((Boolean) objM14360a10).booleanValue()) {
                                    TextView textView9 = c8317l1M10276n0.f45002h;
                                    C5207g.m11110e(textView9, str18);
                                    C4924a.m10457e0(textView9);
                                } else {
                                    TextView textView10 = c8317l1M10276n0.f45002h;
                                    C5207g.m11110e(textView10, str18);
                                    C4924a.m10422A(textView10);
                                }
                                ReviewStoreImpl$special$$inlined$map$22 reviewStoreImpl$special$$inlined$map$22Mo9658h = reviewActivityResultFragment5.m10279q0().mo9658h();
                                this.f29961l = reviewActivityResultFragment5;
                                this.f29954e = reviewActivityResult4;
                                this.f29955f = str19;
                                this.f29956g = c8317l1M10276n0;
                                this.f29960k = 11;
                                objM14360a11 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$22Mo9658h, this);
                                if (objM14360a11 == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                reviewActivityResultFragment4 = reviewActivityResultFragment5;
                                if (((Boolean) objM14360a11).booleanValue()) {
                                    TextView textView11 = c8317l1M10276n0.f44999e;
                                    C5207g.m11110e(textView11, str17);
                                    C4924a.m10457e0(textView11);
                                } else {
                                    TextView textView12 = c8317l1M10276n0.f44999e;
                                    C5207g.m11110e(textView12, str17);
                                    C4924a.m10422A(textView12);
                                }
                                ReviewStoreImpl$special$$inlined$map$23 reviewStoreImpl$special$$inlined$map$23Mo9670t = reviewActivityResultFragment4.m10279q0().mo9670t();
                                this.f29961l = reviewActivityResultFragment4;
                                this.f29954e = reviewActivityResult4;
                                this.f29955f = str19;
                                this.f29956g = c8317l1M10276n0;
                                this.f29960k = 12;
                                objM14360a12 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$23Mo9670t, this);
                                if (objM14360a12 == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                c8317l1 = c8317l1M10276n0;
                                if (((Boolean) objM14360a12).booleanValue()) {
                                    LinearLayout linearLayout3 = c8317l1.f45003i;
                                    C5207g.m11110e(linearLayout3, str16);
                                    C4924a.m10457e0(linearLayout3);
                                } else {
                                    LinearLayout linearLayout4 = c8317l1.f45003i;
                                    C5207g.m11110e(linearLayout4, str16);
                                    C4924a.m10422A(linearLayout4);
                                }
                                c8317l1M10276n0 = c8317l1;
                                reviewActivityResult = reviewActivityResult4;
                                reviewActivityResultFragment = reviewActivityResultFragment4;
                                str4 = str19;
                            } else {
                                LinearLayout linearLayout5 = c8317l1M10276n0.f45003i;
                                C5207g.m11110e(linearLayout5, str16);
                                C4924a.m10457e0(linearLayout5);
                            }
                        }
                        i10 = e.f29968a[reviewActivityResult.ordinal()];
                        if (i10 == 1) {
                            TextView textView13 = c8317l1M10276n0.f45000f;
                            C5207g.m11110e(textView13, "tvResult");
                            C4924a.m10457e0(textView13);
                            String strM3600t = reviewActivityResultFragment.m3600t(R.string.activities_correct);
                            TextView textView14 = c8317l1M10276n0.f45000f;
                            textView14.setText(strM3600t);
                            List<Integer> list = C6716m.f37937a;
                            textView14.setTextColor(C6716m.m13333r(R.attr.greenTint, reviewActivityResultFragment.m3578a0()));
                        } else if (i10 == 2) {
                            TextView textView15 = c8317l1M10276n0.f45000f;
                            C5207g.m11110e(textView15, "tvResult");
                            C4924a.m10457e0(textView15);
                            String strM3600t2 = reviewActivityResultFragment.m3600t(R.string.activities_incorrect);
                            TextView textView16 = c8317l1M10276n0.f45000f;
                            textView16.setText(strM3600t2);
                            List<Integer> list2 = C6716m.f37937a;
                            textView16.setTextColor(C6716m.m13333r(R.attr.redTint, reviewActivityResultFragment.m3578a0()));
                        } else if (i10 == 3) {
                            TextView textView17 = c8317l1M10276n0.f45000f;
                            C5207g.m11110e(textView17, "tvResult");
                            C4924a.m10457e0(textView17);
                            String strM3600t3 = reviewActivityResultFragment.m3600t(R.string.activities_almost);
                            TextView textView18 = c8317l1M10276n0.f45000f;
                            textView18.setText(strM3600t3);
                            List<Integer> list3 = C6716m.f37937a;
                            textView18.setTextColor(C6716m.m13333r(R.attr.secondaryTextColor, reviewActivityResultFragment.m3578a0()));
                        } else if (i10 == 4) {
                            TextView textView19 = c8317l1M10276n0.f45000f;
                            C5207g.m11110e(textView19, "tvResult");
                            C4924a.m10422A(textView19);
                        }
                        if (str4 != null || str4.length() == 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            TextView textView20 = c8317l1M10276n0.f44998d;
                            C5207g.m11110e(textView20, "tvAnswered");
                            C4924a.m10422A(textView20);
                        } else {
                            TextView textView21 = c8317l1M10276n0.f44998d;
                            C5207g.m11110e(textView21, "tvAnswered");
                            C4924a.m10457e0(textView21);
                            c8317l1M10276n0.f44998d.setText(C0141b.m613i(new Object[]{str4}, 1, Locale.getDefault(), C0166e.m765k(reviewActivityResultFragment.m3600t(R.string.activities_you_answered), ": %s"), "format(locale, format, *args)"));
                        }
                    }
                    return C9072e.f47360a;
                case 1:
                    String str24 = this.f29959j;
                    C8317l1 c8317l2 = this.f29958i;
                    String str25 = this.f29957h;
                    reviewActivityResult2 = (ReviewActivityResult) this.f29956g;
                    abstractC9953a2 = (AbstractC9953a) this.f29955f;
                    reviewActivityResultFragment = (ReviewActivityResultFragment) this.f29954e;
                    str6 = str24;
                    c7374a = (C7374a) this.f29961l;
                    C7499b.m14977z0(obj);
                    str2 = "tvPhrase";
                    str3 = "tvTranslation";
                    str = "viewBottom";
                    str4 = str25;
                    c8317l1M10276n0 = c8317l2;
                    objM14360a4 = obj;
                    str10 = (String) objM14360a4;
                    iHashCode = str10.hashCode();
                    if (iHashCode != -1904268855) {
                        if (iHashCode != -469838457) {
                            if (iHashCode == 79183) {
                                str6 = "";
                            }
                        } else if (str10.equals("Traditional")) {
                            lessonStudyTransliteration2 = c7374a.f41155n;
                            if (lessonStudyTransliteration2 != null) {
                                str11 = lessonStudyTransliteration2.f21910d;
                            } else {
                                str11 = null;
                            }
                            str6 = str11;
                        }
                    } else if (str10.equals("Pinyin")) {
                        lessonStudyTransliteration = c7374a.f41155n;
                        if (lessonStudyTransliteration != null) {
                            str11 = lessonStudyTransliteration.f21909c;
                        } else {
                            str11 = null;
                        }
                        str6 = str11;
                    }
                    reviewActivityResult = reviewActivityResult2;
                    abstractC9953a = abstractC9953a2;
                    str5 = str6;
                    c8317l1M10276n0.f45001g.setText(C4924a.m10452c(c7374a.f41144c, C4924a.m10454d(c7374a.f41142a)));
                    c8317l1M10276n0.f44999e.setText(c7374a.f41148g);
                    c8317l1M10276n0.f44997c.setText(str5);
                    if (!reviewActivityResultFragment.f29929D0) {
                        InterfaceC3275c.a.m9347b((ReviewActivityViewModel) reviewActivityResultFragment.f29927B0.getValue(), reviewActivityResultFragment.m10278p0().mo498E1(), C4924a.m10454d(c7374a.f41142a), true, 0.0f, 8);
                        reviewActivityResultFragment.f29929D0 = true;
                    }
                    c8317l1M10276n0.f44995a.setOnClickListener(new a(reviewActivityResultFragment, c7374a));
                    c8317l1M10276n0.f44996b.setOnClickListener(new b(reviewActivityResultFragment, c7374a));
                    z10 = abstractC9953a instanceof AbstractC9953a.d;
                    if (z10) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (z11) {
                        c8317l1M10276n0.f45005k.setOnClickListener(new c(reviewActivityResultFragment));
                    }
                    int i12 = c7374a.f41150i;
                    Integer num2 = c7374a.f41151j;
                    ViewLearnProgress viewLearnProgress2 = c8317l1M10276n0.f45004j;
                    viewLearnProgress2.m10386b(i12, num2);
                    viewLearnProgress2.setOnChangeStatusListener(new d(reviewActivityResultFragment));
                    tokenMeaning = (TokenMeaning) C6752c.m13425S(c7374a.f41146e);
                    if (tokenMeaning != null) {
                        str22 = str20;
                    }
                    c8317l1M10276n0.f45002h.setText(str22);
                    if (z10) {
                        ReviewStoreImpl$special$$inlined$map$12 reviewStoreImpl$special$$inlined$map$12Mo9675y2 = reviewActivityResultFragment.m10279q0().mo9675y();
                        this.f29961l = reviewActivityResultFragment;
                        this.f29954e = reviewActivityResult;
                        this.f29955f = str4;
                        this.f29956g = c8317l1M10276n0;
                        this.f29957h = null;
                        this.f29958i = null;
                        this.f29959j = null;
                        this.f29960k = 5;
                        objM14360a6 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$12Mo9675y2, this);
                        if (objM14360a6 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        reviewActivityResult4 = reviewActivityResult;
                        str19 = str4;
                        if (((Boolean) objM14360a6).booleanValue()) {
                            ImageButton imageButton5 = c8317l1M10276n0.f44995a;
                            C5207g.m11110e(imageButton5, "btnTts");
                            C4924a.m10457e0(imageButton5);
                            TextView textView22 = c8317l1M10276n0.f45001g;
                            C5207g.m11110e(textView22, "tvTerm");
                            C4924a.m10457e0(textView22);
                        } else {
                            ImageButton imageButton6 = c8317l1M10276n0.f44995a;
                            C5207g.m11110e(imageButton6, "btnTts");
                            C4924a.m10422A(imageButton6);
                            TextView textView23 = c8317l1M10276n0.f45001g;
                            C5207g.m11110e(textView23, "tvTerm");
                            C4924a.m10422A(textView23);
                        }
                        ReviewStoreImpl$special$$inlined$map$13 reviewStoreImpl$special$$inlined$map$13Mo9635K2 = reviewActivityResultFragment.m10279q0().mo9635K();
                        this.f29961l = reviewActivityResultFragment;
                        this.f29954e = reviewActivityResult4;
                        this.f29955f = str19;
                        this.f29956g = c8317l1M10276n0;
                        this.f29960k = 6;
                        objM14360a7 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$13Mo9635K2, this);
                        if (objM14360a7 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        reviewActivityResultFragment3 = reviewActivityResultFragment;
                        if (((Boolean) objM14360a7).booleanValue()) {
                            TextView textView24 = c8317l1M10276n0.f45002h;
                            C5207g.m11110e(textView24, str3);
                            C4924a.m10422A(textView24);
                        } else {
                            TextView textView25 = c8317l1M10276n0.f45002h;
                            C5207g.m11110e(textView25, str3);
                            C4924a.m10457e0(textView25);
                        }
                        ReviewStoreImpl$special$$inlined$map$14 reviewStoreImpl$special$$inlined$map$14Mo9646V2 = reviewActivityResultFragment3.m10279q0().mo9646V();
                        this.f29961l = reviewActivityResultFragment3;
                        this.f29954e = reviewActivityResult4;
                        this.f29955f = str19;
                        this.f29956g = c8317l1M10276n0;
                        this.f29960k = 7;
                        objM14360a8 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$14Mo9646V2, this);
                        if (objM14360a8 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        reviewActivityResultFragment4 = reviewActivityResultFragment3;
                        if (((Boolean) objM14360a8).booleanValue()) {
                            TextView textView26 = c8317l1M10276n0.f44999e;
                            C5207g.m11110e(textView26, str2);
                            C4924a.m10422A(textView26);
                        } else {
                            TextView textView27 = c8317l1M10276n0.f44999e;
                            C5207g.m11110e(textView27, str2);
                            C4924a.m10457e0(textView27);
                        }
                        ReviewStoreImpl$special$$inlined$map$15 reviewStoreImpl$special$$inlined$map$15Mo9654d2 = reviewActivityResultFragment4.m10279q0().mo9654d();
                        this.f29961l = reviewActivityResultFragment4;
                        this.f29954e = reviewActivityResult4;
                        this.f29955f = str19;
                        this.f29956g = c8317l1M10276n0;
                        this.f29960k = 8;
                        objM14360a9 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$15Mo9654d2, this);
                        if (objM14360a9 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        c8317l1 = c8317l1M10276n0;
                        if (((Boolean) objM14360a9).booleanValue()) {
                            LinearLayout linearLayout6 = c8317l1.f45003i;
                            C5207g.m11110e(linearLayout6, str);
                            C4924a.m10422A(linearLayout6);
                        } else {
                            LinearLayout linearLayout7 = c8317l1.f45003i;
                            C5207g.m11110e(linearLayout7, str);
                            C4924a.m10457e0(linearLayout7);
                        }
                        c8317l1M10276n0 = c8317l1;
                        reviewActivityResult = reviewActivityResult4;
                        reviewActivityResultFragment = reviewActivityResultFragment4;
                        str4 = str19;
                    } else {
                        str16 = str;
                        str17 = str2;
                        str18 = str3;
                        if (abstractC9953a instanceof AbstractC9953a.e) {
                            ReviewStoreImpl$special$$inlined$map$20 reviewStoreImpl$special$$inlined$map$20Mo9676z2 = reviewActivityResultFragment.m10279q0().mo9676z();
                            this.f29961l = reviewActivityResultFragment;
                            this.f29954e = reviewActivityResult;
                            this.f29955f = str4;
                            this.f29956g = c8317l1M10276n0;
                            this.f29957h = null;
                            this.f29958i = null;
                            this.f29959j = null;
                            this.f29960k = 9;
                            objM14360a5 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$20Mo9676z2, this);
                            if (objM14360a5 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            reviewActivityResult4 = reviewActivityResult;
                            str19 = str4;
                            if (((Boolean) objM14360a5).booleanValue()) {
                                ImageButton imageButton7 = c8317l1M10276n0.f44995a;
                                C5207g.m11110e(imageButton7, "btnTts");
                                C4924a.m10457e0(imageButton7);
                                TextView textView28 = c8317l1M10276n0.f45001g;
                                C5207g.m11110e(textView28, "tvTerm");
                                C4924a.m10457e0(textView28);
                            } else {
                                ImageButton imageButton8 = c8317l1M10276n0.f44995a;
                                C5207g.m11110e(imageButton8, "btnTts");
                                C4924a.m10422A(imageButton8);
                                TextView textView29 = c8317l1M10276n0.f45001g;
                                C5207g.m11110e(textView29, "tvTerm");
                                C4924a.m10422A(textView29);
                            }
                            ReviewStoreImpl$special$$inlined$map$21 reviewStoreImpl$special$$inlined$map$21Mo9632H2 = reviewActivityResultFragment.m10279q0().mo9632H();
                            this.f29961l = reviewActivityResultFragment;
                            this.f29954e = reviewActivityResult4;
                            this.f29955f = str19;
                            this.f29956g = c8317l1M10276n0;
                            this.f29960k = 10;
                            objM14360a10 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$21Mo9632H2, this);
                            if (objM14360a10 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            reviewActivityResultFragment5 = reviewActivityResultFragment;
                            if (((Boolean) objM14360a10).booleanValue()) {
                                TextView textView110 = c8317l1M10276n0.f45002h;
                                C5207g.m11110e(textView110, str18);
                                C4924a.m10422A(textView110);
                            } else {
                                TextView textView30 = c8317l1M10276n0.f45002h;
                                C5207g.m11110e(textView30, str18);
                                C4924a.m10457e0(textView30);
                            }
                            ReviewStoreImpl$special$$inlined$map$22 reviewStoreImpl$special$$inlined$map$22Mo9658h2 = reviewActivityResultFragment5.m10279q0().mo9658h();
                            this.f29961l = reviewActivityResultFragment5;
                            this.f29954e = reviewActivityResult4;
                            this.f29955f = str19;
                            this.f29956g = c8317l1M10276n0;
                            this.f29960k = 11;
                            objM14360a11 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$22Mo9658h2, this);
                            if (objM14360a11 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            reviewActivityResultFragment4 = reviewActivityResultFragment5;
                            if (((Boolean) objM14360a11).booleanValue()) {
                                TextView textView111 = c8317l1M10276n0.f44999e;
                                C5207g.m11110e(textView111, str17);
                                C4924a.m10422A(textView111);
                            } else {
                                TextView textView112 = c8317l1M10276n0.f44999e;
                                C5207g.m11110e(textView112, str17);
                                C4924a.m10457e0(textView112);
                            }
                            ReviewStoreImpl$special$$inlined$map$23 reviewStoreImpl$special$$inlined$map$23Mo9670t2 = reviewActivityResultFragment4.m10279q0().mo9670t();
                            this.f29961l = reviewActivityResultFragment4;
                            this.f29954e = reviewActivityResult4;
                            this.f29955f = str19;
                            this.f29956g = c8317l1M10276n0;
                            this.f29960k = 12;
                            objM14360a12 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$23Mo9670t2, this);
                            if (objM14360a12 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            c8317l1 = c8317l1M10276n0;
                            if (((Boolean) objM14360a12).booleanValue()) {
                                LinearLayout linearLayout8 = c8317l1.f45003i;
                                C5207g.m11110e(linearLayout8, str16);
                                C4924a.m10422A(linearLayout8);
                            } else {
                                LinearLayout linearLayout9 = c8317l1.f45003i;
                                C5207g.m11110e(linearLayout9, str16);
                                C4924a.m10457e0(linearLayout9);
                            }
                            c8317l1M10276n0 = c8317l1;
                            reviewActivityResult = reviewActivityResult4;
                            reviewActivityResultFragment = reviewActivityResultFragment4;
                            str4 = str19;
                        } else {
                            LinearLayout linearLayout10 = c8317l1M10276n0.f45003i;
                            C5207g.m11110e(linearLayout10, str16);
                            C4924a.m10457e0(linearLayout10);
                        }
                    }
                    i10 = e.f29968a[reviewActivityResult.ordinal()];
                    if (i10 == 1) {
                        TextView textView113 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView113, "tvResult");
                        C4924a.m10457e0(textView113);
                        String strM3600t4 = reviewActivityResultFragment.m3600t(R.string.activities_correct);
                        TextView textView114 = c8317l1M10276n0.f45000f;
                        textView114.setText(strM3600t4);
                        List<Integer> list4 = C6716m.f37937a;
                        textView114.setTextColor(C6716m.m13333r(R.attr.greenTint, reviewActivityResultFragment.m3578a0()));
                    } else if (i10 == 2) {
                        TextView textView115 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView115, "tvResult");
                        C4924a.m10457e0(textView115);
                        String strM3600t5 = reviewActivityResultFragment.m3600t(R.string.activities_incorrect);
                        TextView textView116 = c8317l1M10276n0.f45000f;
                        textView116.setText(strM3600t5);
                        List<Integer> list5 = C6716m.f37937a;
                        textView116.setTextColor(C6716m.m13333r(R.attr.redTint, reviewActivityResultFragment.m3578a0()));
                    } else if (i10 == 3) {
                        TextView textView117 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView117, "tvResult");
                        C4924a.m10457e0(textView117);
                        String strM3600t6 = reviewActivityResultFragment.m3600t(R.string.activities_almost);
                        TextView textView118 = c8317l1M10276n0.f45000f;
                        textView118.setText(strM3600t6);
                        List<Integer> list6 = C6716m.f37937a;
                        textView118.setTextColor(C6716m.m13333r(R.attr.secondaryTextColor, reviewActivityResultFragment.m3578a0()));
                    } else if (i10 == 4) {
                        TextView textView119 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView119, "tvResult");
                        C4924a.m10422A(textView119);
                    }
                    if (str4 != null) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (z12) {
                        TextView textView210 = c8317l1M10276n0.f44998d;
                        C5207g.m11110e(textView210, "tvAnswered");
                        C4924a.m10422A(textView210);
                    } else {
                        TextView textView211 = c8317l1M10276n0.f44998d;
                        C5207g.m11110e(textView211, "tvAnswered");
                        C4924a.m10457e0(textView211);
                        c8317l1M10276n0.f44998d.setText(C0141b.m613i(new Object[]{str4}, 1, Locale.getDefault(), C0166e.m765k(reviewActivityResultFragment.m3600t(R.string.activities_you_answered), ": %s"), "format(locale, format, *args)"));
                    }
                    return C9072e.f47360a;
                case 2:
                    String str26 = this.f29959j;
                    c8317l1M10276n0 = this.f29958i;
                    String str27 = this.f29957h;
                    reviewActivityResult3 = (ReviewActivityResult) this.f29956g;
                    AbstractC9953a abstractC9953a4 = (AbstractC9953a) this.f29955f;
                    ReviewActivityResultFragment reviewActivityResultFragment6 = (ReviewActivityResultFragment) this.f29954e;
                    C7374a c7374a4 = (C7374a) this.f29961l;
                    C7499b.m14977z0(obj);
                    str2 = "tvPhrase";
                    str3 = "tvTranslation";
                    str4 = str27;
                    objM14360a3 = obj;
                    c7374a3 = c7374a4;
                    str9 = str26;
                    str = "viewBottom";
                    abstractC9953a = abstractC9953a4;
                    reviewActivityResultFragment = reviewActivityResultFragment6;
                    str12 = (String) objM14360a3;
                    str13 = str9;
                    iHashCode2 = str12.hashCode();
                    String str28 = str4;
                    if (iHashCode2 != -1904268855) {
                        if (iHashCode2 != 79183) {
                            if (iHashCode2 != 566114168) {
                                str14 = str13;
                            } else {
                                lessonStudyTransliteration4 = c7374a3.f41155n;
                                if (lessonStudyTransliteration4 != null) {
                                    str14 = lessonStudyTransliteration4.f21911e;
                                } else {
                                    str14 = null;
                                }
                            }
                        } else if (str12.equals("Off")) {
                            str14 = str13;
                        } else {
                            str14 = "";
                        }
                    } else if (str12.equals("Pinyin")) {
                        str14 = str13;
                    } else {
                        lessonStudyTransliteration3 = c7374a3.f41155n;
                        if (lessonStudyTransliteration3 != null) {
                            str14 = lessonStudyTransliteration3.f21909c;
                        } else {
                            str14 = null;
                        }
                    }
                    str5 = str14;
                    c7374a = c7374a3;
                    reviewActivityResult = reviewActivityResult3;
                    str4 = str28;
                    c8317l1M10276n0.f45001g.setText(C4924a.m10452c(c7374a.f41144c, C4924a.m10454d(c7374a.f41142a)));
                    c8317l1M10276n0.f44999e.setText(c7374a.f41148g);
                    c8317l1M10276n0.f44997c.setText(str5);
                    if (!reviewActivityResultFragment.f29929D0) {
                        InterfaceC3275c.a.m9347b((ReviewActivityViewModel) reviewActivityResultFragment.f29927B0.getValue(), reviewActivityResultFragment.m10278p0().mo498E1(), C4924a.m10454d(c7374a.f41142a), true, 0.0f, 8);
                        reviewActivityResultFragment.f29929D0 = true;
                    }
                    c8317l1M10276n0.f44995a.setOnClickListener(new a(reviewActivityResultFragment, c7374a));
                    c8317l1M10276n0.f44996b.setOnClickListener(new b(reviewActivityResultFragment, c7374a));
                    z10 = abstractC9953a instanceof AbstractC9953a.d;
                    if (z10) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (z11) {
                        c8317l1M10276n0.f45005k.setOnClickListener(new c(reviewActivityResultFragment));
                    }
                    int i13 = c7374a.f41150i;
                    Integer num3 = c7374a.f41151j;
                    ViewLearnProgress viewLearnProgress3 = c8317l1M10276n0.f45004j;
                    viewLearnProgress3.m10386b(i13, num3);
                    viewLearnProgress3.setOnChangeStatusListener(new d(reviewActivityResultFragment));
                    tokenMeaning = (TokenMeaning) C6752c.m13425S(c7374a.f41146e);
                    if (tokenMeaning != null) {
                        str22 = str20;
                    }
                    c8317l1M10276n0.f45002h.setText(str22);
                    if (z10) {
                        ReviewStoreImpl$special$$inlined$map$12 reviewStoreImpl$special$$inlined$map$12Mo9675y3 = reviewActivityResultFragment.m10279q0().mo9675y();
                        this.f29961l = reviewActivityResultFragment;
                        this.f29954e = reviewActivityResult;
                        this.f29955f = str4;
                        this.f29956g = c8317l1M10276n0;
                        this.f29957h = null;
                        this.f29958i = null;
                        this.f29959j = null;
                        this.f29960k = 5;
                        objM14360a6 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$12Mo9675y3, this);
                        if (objM14360a6 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        reviewActivityResult4 = reviewActivityResult;
                        str19 = str4;
                        if (((Boolean) objM14360a6).booleanValue()) {
                            ImageButton imageButton9 = c8317l1M10276n0.f44995a;
                            C5207g.m11110e(imageButton9, "btnTts");
                            C4924a.m10457e0(imageButton9);
                            TextView textView212 = c8317l1M10276n0.f45001g;
                            C5207g.m11110e(textView212, "tvTerm");
                            C4924a.m10457e0(textView212);
                        } else {
                            ImageButton imageButton10 = c8317l1M10276n0.f44995a;
                            C5207g.m11110e(imageButton10, "btnTts");
                            C4924a.m10422A(imageButton10);
                            TextView textView213 = c8317l1M10276n0.f45001g;
                            C5207g.m11110e(textView213, "tvTerm");
                            C4924a.m10422A(textView213);
                        }
                        ReviewStoreImpl$special$$inlined$map$13 reviewStoreImpl$special$$inlined$map$13Mo9635K3 = reviewActivityResultFragment.m10279q0().mo9635K();
                        this.f29961l = reviewActivityResultFragment;
                        this.f29954e = reviewActivityResult4;
                        this.f29955f = str19;
                        this.f29956g = c8317l1M10276n0;
                        this.f29960k = 6;
                        objM14360a7 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$13Mo9635K3, this);
                        if (objM14360a7 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        reviewActivityResultFragment3 = reviewActivityResultFragment;
                        if (((Boolean) objM14360a7).booleanValue()) {
                            TextView textView214 = c8317l1M10276n0.f45002h;
                            C5207g.m11110e(textView214, str3);
                            C4924a.m10422A(textView214);
                        } else {
                            TextView textView215 = c8317l1M10276n0.f45002h;
                            C5207g.m11110e(textView215, str3);
                            C4924a.m10457e0(textView215);
                        }
                        ReviewStoreImpl$special$$inlined$map$14 reviewStoreImpl$special$$inlined$map$14Mo9646V3 = reviewActivityResultFragment3.m10279q0().mo9646V();
                        this.f29961l = reviewActivityResultFragment3;
                        this.f29954e = reviewActivityResult4;
                        this.f29955f = str19;
                        this.f29956g = c8317l1M10276n0;
                        this.f29960k = 7;
                        objM14360a8 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$14Mo9646V3, this);
                        if (objM14360a8 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        reviewActivityResultFragment4 = reviewActivityResultFragment3;
                        if (((Boolean) objM14360a8).booleanValue()) {
                            TextView textView216 = c8317l1M10276n0.f44999e;
                            C5207g.m11110e(textView216, str2);
                            C4924a.m10422A(textView216);
                        } else {
                            TextView textView217 = c8317l1M10276n0.f44999e;
                            C5207g.m11110e(textView217, str2);
                            C4924a.m10457e0(textView217);
                        }
                        ReviewStoreImpl$special$$inlined$map$15 reviewStoreImpl$special$$inlined$map$15Mo9654d3 = reviewActivityResultFragment4.m10279q0().mo9654d();
                        this.f29961l = reviewActivityResultFragment4;
                        this.f29954e = reviewActivityResult4;
                        this.f29955f = str19;
                        this.f29956g = c8317l1M10276n0;
                        this.f29960k = 8;
                        objM14360a9 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$15Mo9654d3, this);
                        if (objM14360a9 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        c8317l1 = c8317l1M10276n0;
                        if (((Boolean) objM14360a9).booleanValue()) {
                            LinearLayout linearLayout11 = c8317l1.f45003i;
                            C5207g.m11110e(linearLayout11, str);
                            C4924a.m10422A(linearLayout11);
                        } else {
                            LinearLayout linearLayout12 = c8317l1.f45003i;
                            C5207g.m11110e(linearLayout12, str);
                            C4924a.m10457e0(linearLayout12);
                        }
                        c8317l1M10276n0 = c8317l1;
                        reviewActivityResult = reviewActivityResult4;
                        reviewActivityResultFragment = reviewActivityResultFragment4;
                        str4 = str19;
                    } else {
                        str16 = str;
                        str17 = str2;
                        str18 = str3;
                        if (abstractC9953a instanceof AbstractC9953a.e) {
                            ReviewStoreImpl$special$$inlined$map$20 reviewStoreImpl$special$$inlined$map$20Mo9676z3 = reviewActivityResultFragment.m10279q0().mo9676z();
                            this.f29961l = reviewActivityResultFragment;
                            this.f29954e = reviewActivityResult;
                            this.f29955f = str4;
                            this.f29956g = c8317l1M10276n0;
                            this.f29957h = null;
                            this.f29958i = null;
                            this.f29959j = null;
                            this.f29960k = 9;
                            objM14360a5 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$20Mo9676z3, this);
                            if (objM14360a5 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            reviewActivityResult4 = reviewActivityResult;
                            str19 = str4;
                            if (((Boolean) objM14360a5).booleanValue()) {
                                ImageButton imageButton11 = c8317l1M10276n0.f44995a;
                                C5207g.m11110e(imageButton11, "btnTts");
                                C4924a.m10457e0(imageButton11);
                                TextView textView218 = c8317l1M10276n0.f45001g;
                                C5207g.m11110e(textView218, "tvTerm");
                                C4924a.m10457e0(textView218);
                            } else {
                                ImageButton imageButton12 = c8317l1M10276n0.f44995a;
                                C5207g.m11110e(imageButton12, "btnTts");
                                C4924a.m10422A(imageButton12);
                                TextView textView219 = c8317l1M10276n0.f45001g;
                                C5207g.m11110e(textView219, "tvTerm");
                                C4924a.m10422A(textView219);
                            }
                            ReviewStoreImpl$special$$inlined$map$21 reviewStoreImpl$special$$inlined$map$21Mo9632H3 = reviewActivityResultFragment.m10279q0().mo9632H();
                            this.f29961l = reviewActivityResultFragment;
                            this.f29954e = reviewActivityResult4;
                            this.f29955f = str19;
                            this.f29956g = c8317l1M10276n0;
                            this.f29960k = 10;
                            objM14360a10 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$21Mo9632H3, this);
                            if (objM14360a10 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            reviewActivityResultFragment5 = reviewActivityResultFragment;
                            if (((Boolean) objM14360a10).booleanValue()) {
                                TextView textView1110 = c8317l1M10276n0.f45002h;
                                C5207g.m11110e(textView1110, str18);
                                C4924a.m10422A(textView1110);
                            } else {
                                TextView textView31 = c8317l1M10276n0.f45002h;
                                C5207g.m11110e(textView31, str18);
                                C4924a.m10457e0(textView31);
                            }
                            ReviewStoreImpl$special$$inlined$map$22 reviewStoreImpl$special$$inlined$map$22Mo9658h3 = reviewActivityResultFragment5.m10279q0().mo9658h();
                            this.f29961l = reviewActivityResultFragment5;
                            this.f29954e = reviewActivityResult4;
                            this.f29955f = str19;
                            this.f29956g = c8317l1M10276n0;
                            this.f29960k = 11;
                            objM14360a11 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$22Mo9658h3, this);
                            if (objM14360a11 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            reviewActivityResultFragment4 = reviewActivityResultFragment5;
                            if (((Boolean) objM14360a11).booleanValue()) {
                                TextView textView1111 = c8317l1M10276n0.f44999e;
                                C5207g.m11110e(textView1111, str17);
                                C4924a.m10422A(textView1111);
                            } else {
                                TextView textView1112 = c8317l1M10276n0.f44999e;
                                C5207g.m11110e(textView1112, str17);
                                C4924a.m10457e0(textView1112);
                            }
                            ReviewStoreImpl$special$$inlined$map$23 reviewStoreImpl$special$$inlined$map$23Mo9670t3 = reviewActivityResultFragment4.m10279q0().mo9670t();
                            this.f29961l = reviewActivityResultFragment4;
                            this.f29954e = reviewActivityResult4;
                            this.f29955f = str19;
                            this.f29956g = c8317l1M10276n0;
                            this.f29960k = 12;
                            objM14360a12 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$23Mo9670t3, this);
                            if (objM14360a12 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            c8317l1 = c8317l1M10276n0;
                            if (((Boolean) objM14360a12).booleanValue()) {
                                LinearLayout linearLayout13 = c8317l1.f45003i;
                                C5207g.m11110e(linearLayout13, str16);
                                C4924a.m10422A(linearLayout13);
                            } else {
                                LinearLayout linearLayout14 = c8317l1.f45003i;
                                C5207g.m11110e(linearLayout14, str16);
                                C4924a.m10457e0(linearLayout14);
                            }
                            c8317l1M10276n0 = c8317l1;
                            reviewActivityResult = reviewActivityResult4;
                            reviewActivityResultFragment = reviewActivityResultFragment4;
                            str4 = str19;
                        } else {
                            LinearLayout linearLayout15 = c8317l1M10276n0.f45003i;
                            C5207g.m11110e(linearLayout15, str16);
                            C4924a.m10457e0(linearLayout15);
                        }
                    }
                    i10 = e.f29968a[reviewActivityResult.ordinal()];
                    if (i10 == 1) {
                        TextView textView1113 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView1113, "tvResult");
                        C4924a.m10457e0(textView1113);
                        String strM3600t7 = reviewActivityResultFragment.m3600t(R.string.activities_correct);
                        TextView textView1114 = c8317l1M10276n0.f45000f;
                        textView1114.setText(strM3600t7);
                        List<Integer> list7 = C6716m.f37937a;
                        textView1114.setTextColor(C6716m.m13333r(R.attr.greenTint, reviewActivityResultFragment.m3578a0()));
                    } else if (i10 == 2) {
                        TextView textView1115 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView1115, "tvResult");
                        C4924a.m10457e0(textView1115);
                        String strM3600t8 = reviewActivityResultFragment.m3600t(R.string.activities_incorrect);
                        TextView textView1116 = c8317l1M10276n0.f45000f;
                        textView1116.setText(strM3600t8);
                        List<Integer> list8 = C6716m.f37937a;
                        textView1116.setTextColor(C6716m.m13333r(R.attr.redTint, reviewActivityResultFragment.m3578a0()));
                    } else if (i10 == 3) {
                        TextView textView1117 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView1117, "tvResult");
                        C4924a.m10457e0(textView1117);
                        String strM3600t9 = reviewActivityResultFragment.m3600t(R.string.activities_almost);
                        TextView textView1118 = c8317l1M10276n0.f45000f;
                        textView1118.setText(strM3600t9);
                        List<Integer> list9 = C6716m.f37937a;
                        textView1118.setTextColor(C6716m.m13333r(R.attr.secondaryTextColor, reviewActivityResultFragment.m3578a0()));
                    } else if (i10 == 4) {
                        TextView textView1119 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView1119, "tvResult");
                        C4924a.m10422A(textView1119);
                    }
                    if (str4 != null) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (z12) {
                        TextView textView2110 = c8317l1M10276n0.f44998d;
                        C5207g.m11110e(textView2110, "tvAnswered");
                        C4924a.m10422A(textView2110);
                    } else {
                        TextView textView2111 = c8317l1M10276n0.f44998d;
                        C5207g.m11110e(textView2111, "tvAnswered");
                        C4924a.m10457e0(textView2111);
                        c8317l1M10276n0.f44998d.setText(C0141b.m613i(new Object[]{str4}, 1, Locale.getDefault(), C0166e.m765k(reviewActivityResultFragment.m3600t(R.string.activities_you_answered), ": %s"), "format(locale, format, *args)"));
                    }
                    return C9072e.f47360a;
                case 3:
                    str8 = this.f29959j;
                    C8317l1 c8317l3 = this.f29958i;
                    str7 = this.f29957h;
                    ReviewActivityResult reviewActivityResult5 = (ReviewActivityResult) this.f29956g;
                    abstractC9953a3 = (AbstractC9953a) this.f29955f;
                    reviewActivityResultFragment2 = (ReviewActivityResultFragment) this.f29954e;
                    c7374a2 = (C7374a) this.f29961l;
                    C7499b.m14977z0(obj);
                    str2 = "tvPhrase";
                    str3 = "tvTranslation";
                    str = "viewBottom";
                    reviewActivityResult = reviewActivityResult5;
                    c8317l1M10276n0 = c8317l3;
                    objM14360a2 = obj;
                    str15 = (String) objM14360a2;
                    iHashCode3 = str15.hashCode();
                    if (iHashCode3 != -1841522256) {
                        if (iHashCode3 != -1311598819) {
                            if (iHashCode3 == 79183) {
                                str6 = "";
                            }
                        } else if (str15.equals("Hiragana")) {
                            lessonStudyTransliteration6 = c7374a2.f41155n;
                            if (lessonStudyTransliteration6 != null) {
                                str8 = lessonStudyTransliteration6.f21907a;
                            } else {
                                str8 = null;
                            }
                        }
                        str6 = str8;
                    } else {
                        if (str15.equals("Romaji")) {
                            lessonStudyTransliteration5 = c7374a2.f41155n;
                            if (lessonStudyTransliteration5 != null) {
                                str8 = lessonStudyTransliteration5.f21908b;
                            } else {
                                str8 = null;
                            }
                        }
                        str6 = str8;
                    }
                    str4 = str7;
                    abstractC9953a = abstractC9953a3;
                    c7374a = c7374a2;
                    reviewActivityResultFragment = reviewActivityResultFragment2;
                    str5 = str6;
                    c8317l1M10276n0.f45001g.setText(C4924a.m10452c(c7374a.f41144c, C4924a.m10454d(c7374a.f41142a)));
                    c8317l1M10276n0.f44999e.setText(c7374a.f41148g);
                    c8317l1M10276n0.f44997c.setText(str5);
                    if (!reviewActivityResultFragment.f29929D0) {
                        InterfaceC3275c.a.m9347b((ReviewActivityViewModel) reviewActivityResultFragment.f29927B0.getValue(), reviewActivityResultFragment.m10278p0().mo498E1(), C4924a.m10454d(c7374a.f41142a), true, 0.0f, 8);
                        reviewActivityResultFragment.f29929D0 = true;
                    }
                    c8317l1M10276n0.f44995a.setOnClickListener(new a(reviewActivityResultFragment, c7374a));
                    c8317l1M10276n0.f44996b.setOnClickListener(new b(reviewActivityResultFragment, c7374a));
                    z10 = abstractC9953a instanceof AbstractC9953a.d;
                    if (z10) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (z11) {
                        c8317l1M10276n0.f45005k.setOnClickListener(new c(reviewActivityResultFragment));
                    }
                    int i14 = c7374a.f41150i;
                    Integer num4 = c7374a.f41151j;
                    ViewLearnProgress viewLearnProgress4 = c8317l1M10276n0.f45004j;
                    viewLearnProgress4.m10386b(i14, num4);
                    viewLearnProgress4.setOnChangeStatusListener(new d(reviewActivityResultFragment));
                    tokenMeaning = (TokenMeaning) C6752c.m13425S(c7374a.f41146e);
                    if (tokenMeaning != null) {
                        str22 = str20;
                    }
                    c8317l1M10276n0.f45002h.setText(str22);
                    if (z10) {
                        ReviewStoreImpl$special$$inlined$map$12 reviewStoreImpl$special$$inlined$map$12Mo9675y4 = reviewActivityResultFragment.m10279q0().mo9675y();
                        this.f29961l = reviewActivityResultFragment;
                        this.f29954e = reviewActivityResult;
                        this.f29955f = str4;
                        this.f29956g = c8317l1M10276n0;
                        this.f29957h = null;
                        this.f29958i = null;
                        this.f29959j = null;
                        this.f29960k = 5;
                        objM14360a6 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$12Mo9675y4, this);
                        if (objM14360a6 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        reviewActivityResult4 = reviewActivityResult;
                        str19 = str4;
                        if (((Boolean) objM14360a6).booleanValue()) {
                            ImageButton imageButton13 = c8317l1M10276n0.f44995a;
                            C5207g.m11110e(imageButton13, "btnTts");
                            C4924a.m10457e0(imageButton13);
                            TextView textView2112 = c8317l1M10276n0.f45001g;
                            C5207g.m11110e(textView2112, "tvTerm");
                            C4924a.m10457e0(textView2112);
                        } else {
                            ImageButton imageButton14 = c8317l1M10276n0.f44995a;
                            C5207g.m11110e(imageButton14, "btnTts");
                            C4924a.m10422A(imageButton14);
                            TextView textView2113 = c8317l1M10276n0.f45001g;
                            C5207g.m11110e(textView2113, "tvTerm");
                            C4924a.m10422A(textView2113);
                        }
                        ReviewStoreImpl$special$$inlined$map$13 reviewStoreImpl$special$$inlined$map$13Mo9635K4 = reviewActivityResultFragment.m10279q0().mo9635K();
                        this.f29961l = reviewActivityResultFragment;
                        this.f29954e = reviewActivityResult4;
                        this.f29955f = str19;
                        this.f29956g = c8317l1M10276n0;
                        this.f29960k = 6;
                        objM14360a7 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$13Mo9635K4, this);
                        if (objM14360a7 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        reviewActivityResultFragment3 = reviewActivityResultFragment;
                        if (((Boolean) objM14360a7).booleanValue()) {
                            TextView textView2114 = c8317l1M10276n0.f45002h;
                            C5207g.m11110e(textView2114, str3);
                            C4924a.m10422A(textView2114);
                        } else {
                            TextView textView2115 = c8317l1M10276n0.f45002h;
                            C5207g.m11110e(textView2115, str3);
                            C4924a.m10457e0(textView2115);
                        }
                        ReviewStoreImpl$special$$inlined$map$14 reviewStoreImpl$special$$inlined$map$14Mo9646V4 = reviewActivityResultFragment3.m10279q0().mo9646V();
                        this.f29961l = reviewActivityResultFragment3;
                        this.f29954e = reviewActivityResult4;
                        this.f29955f = str19;
                        this.f29956g = c8317l1M10276n0;
                        this.f29960k = 7;
                        objM14360a8 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$14Mo9646V4, this);
                        if (objM14360a8 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        reviewActivityResultFragment4 = reviewActivityResultFragment3;
                        if (((Boolean) objM14360a8).booleanValue()) {
                            TextView textView2116 = c8317l1M10276n0.f44999e;
                            C5207g.m11110e(textView2116, str2);
                            C4924a.m10422A(textView2116);
                        } else {
                            TextView textView2117 = c8317l1M10276n0.f44999e;
                            C5207g.m11110e(textView2117, str2);
                            C4924a.m10457e0(textView2117);
                        }
                        ReviewStoreImpl$special$$inlined$map$15 reviewStoreImpl$special$$inlined$map$15Mo9654d4 = reviewActivityResultFragment4.m10279q0().mo9654d();
                        this.f29961l = reviewActivityResultFragment4;
                        this.f29954e = reviewActivityResult4;
                        this.f29955f = str19;
                        this.f29956g = c8317l1M10276n0;
                        this.f29960k = 8;
                        objM14360a9 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$15Mo9654d4, this);
                        if (objM14360a9 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        c8317l1 = c8317l1M10276n0;
                        if (((Boolean) objM14360a9).booleanValue()) {
                            LinearLayout linearLayout16 = c8317l1.f45003i;
                            C5207g.m11110e(linearLayout16, str);
                            C4924a.m10422A(linearLayout16);
                        } else {
                            LinearLayout linearLayout17 = c8317l1.f45003i;
                            C5207g.m11110e(linearLayout17, str);
                            C4924a.m10457e0(linearLayout17);
                        }
                        c8317l1M10276n0 = c8317l1;
                        reviewActivityResult = reviewActivityResult4;
                        reviewActivityResultFragment = reviewActivityResultFragment4;
                        str4 = str19;
                    } else {
                        str16 = str;
                        str17 = str2;
                        str18 = str3;
                        if (abstractC9953a instanceof AbstractC9953a.e) {
                            ReviewStoreImpl$special$$inlined$map$20 reviewStoreImpl$special$$inlined$map$20Mo9676z4 = reviewActivityResultFragment.m10279q0().mo9676z();
                            this.f29961l = reviewActivityResultFragment;
                            this.f29954e = reviewActivityResult;
                            this.f29955f = str4;
                            this.f29956g = c8317l1M10276n0;
                            this.f29957h = null;
                            this.f29958i = null;
                            this.f29959j = null;
                            this.f29960k = 9;
                            objM14360a5 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$20Mo9676z4, this);
                            if (objM14360a5 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            reviewActivityResult4 = reviewActivityResult;
                            str19 = str4;
                            if (((Boolean) objM14360a5).booleanValue()) {
                                ImageButton imageButton15 = c8317l1M10276n0.f44995a;
                                C5207g.m11110e(imageButton15, "btnTts");
                                C4924a.m10457e0(imageButton15);
                                TextView textView2118 = c8317l1M10276n0.f45001g;
                                C5207g.m11110e(textView2118, "tvTerm");
                                C4924a.m10457e0(textView2118);
                            } else {
                                ImageButton imageButton16 = c8317l1M10276n0.f44995a;
                                C5207g.m11110e(imageButton16, "btnTts");
                                C4924a.m10422A(imageButton16);
                                TextView textView2119 = c8317l1M10276n0.f45001g;
                                C5207g.m11110e(textView2119, "tvTerm");
                                C4924a.m10422A(textView2119);
                            }
                            ReviewStoreImpl$special$$inlined$map$21 reviewStoreImpl$special$$inlined$map$21Mo9632H4 = reviewActivityResultFragment.m10279q0().mo9632H();
                            this.f29961l = reviewActivityResultFragment;
                            this.f29954e = reviewActivityResult4;
                            this.f29955f = str19;
                            this.f29956g = c8317l1M10276n0;
                            this.f29960k = 10;
                            objM14360a10 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$21Mo9632H4, this);
                            if (objM14360a10 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            reviewActivityResultFragment5 = reviewActivityResultFragment;
                            if (((Boolean) objM14360a10).booleanValue()) {
                                TextView textView11110 = c8317l1M10276n0.f45002h;
                                C5207g.m11110e(textView11110, str18);
                                C4924a.m10422A(textView11110);
                            } else {
                                TextView textView32 = c8317l1M10276n0.f45002h;
                                C5207g.m11110e(textView32, str18);
                                C4924a.m10457e0(textView32);
                            }
                            ReviewStoreImpl$special$$inlined$map$22 reviewStoreImpl$special$$inlined$map$22Mo9658h4 = reviewActivityResultFragment5.m10279q0().mo9658h();
                            this.f29961l = reviewActivityResultFragment5;
                            this.f29954e = reviewActivityResult4;
                            this.f29955f = str19;
                            this.f29956g = c8317l1M10276n0;
                            this.f29960k = 11;
                            objM14360a11 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$22Mo9658h4, this);
                            if (objM14360a11 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            reviewActivityResultFragment4 = reviewActivityResultFragment5;
                            if (((Boolean) objM14360a11).booleanValue()) {
                                TextView textView11111 = c8317l1M10276n0.f44999e;
                                C5207g.m11110e(textView11111, str17);
                                C4924a.m10422A(textView11111);
                            } else {
                                TextView textView11112 = c8317l1M10276n0.f44999e;
                                C5207g.m11110e(textView11112, str17);
                                C4924a.m10457e0(textView11112);
                            }
                            ReviewStoreImpl$special$$inlined$map$23 reviewStoreImpl$special$$inlined$map$23Mo9670t4 = reviewActivityResultFragment4.m10279q0().mo9670t();
                            this.f29961l = reviewActivityResultFragment4;
                            this.f29954e = reviewActivityResult4;
                            this.f29955f = str19;
                            this.f29956g = c8317l1M10276n0;
                            this.f29960k = 12;
                            objM14360a12 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$23Mo9670t4, this);
                            if (objM14360a12 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            c8317l1 = c8317l1M10276n0;
                            if (((Boolean) objM14360a12).booleanValue()) {
                                LinearLayout linearLayout18 = c8317l1.f45003i;
                                C5207g.m11110e(linearLayout18, str16);
                                C4924a.m10422A(linearLayout18);
                            } else {
                                LinearLayout linearLayout19 = c8317l1.f45003i;
                                C5207g.m11110e(linearLayout19, str16);
                                C4924a.m10457e0(linearLayout19);
                            }
                            c8317l1M10276n0 = c8317l1;
                            reviewActivityResult = reviewActivityResult4;
                            reviewActivityResultFragment = reviewActivityResultFragment4;
                            str4 = str19;
                        } else {
                            LinearLayout linearLayout110 = c8317l1M10276n0.f45003i;
                            C5207g.m11110e(linearLayout110, str16);
                            C4924a.m10457e0(linearLayout110);
                        }
                    }
                    i10 = e.f29968a[reviewActivityResult.ordinal()];
                    if (i10 == 1) {
                        TextView textView11113 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView11113, "tvResult");
                        C4924a.m10457e0(textView11113);
                        String strM3600t10 = reviewActivityResultFragment.m3600t(R.string.activities_correct);
                        TextView textView11114 = c8317l1M10276n0.f45000f;
                        textView11114.setText(strM3600t10);
                        List<Integer> list10 = C6716m.f37937a;
                        textView11114.setTextColor(C6716m.m13333r(R.attr.greenTint, reviewActivityResultFragment.m3578a0()));
                    } else if (i10 == 2) {
                        TextView textView11115 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView11115, "tvResult");
                        C4924a.m10457e0(textView11115);
                        String strM3600t11 = reviewActivityResultFragment.m3600t(R.string.activities_incorrect);
                        TextView textView11116 = c8317l1M10276n0.f45000f;
                        textView11116.setText(strM3600t11);
                        List<Integer> list11 = C6716m.f37937a;
                        textView11116.setTextColor(C6716m.m13333r(R.attr.redTint, reviewActivityResultFragment.m3578a0()));
                    } else if (i10 == 3) {
                        TextView textView11117 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView11117, "tvResult");
                        C4924a.m10457e0(textView11117);
                        String strM3600t12 = reviewActivityResultFragment.m3600t(R.string.activities_almost);
                        TextView textView11118 = c8317l1M10276n0.f45000f;
                        textView11118.setText(strM3600t12);
                        List<Integer> list12 = C6716m.f37937a;
                        textView11118.setTextColor(C6716m.m13333r(R.attr.secondaryTextColor, reviewActivityResultFragment.m3578a0()));
                    } else if (i10 == 4) {
                        TextView textView11119 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView11119, "tvResult");
                        C4924a.m10422A(textView11119);
                    }
                    if (str4 != null) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (z12) {
                        TextView textView21110 = c8317l1M10276n0.f44998d;
                        C5207g.m11110e(textView21110, "tvAnswered");
                        C4924a.m10422A(textView21110);
                    } else {
                        TextView textView21111 = c8317l1M10276n0.f44998d;
                        C5207g.m11110e(textView21111, "tvAnswered");
                        C4924a.m10457e0(textView21111);
                        c8317l1M10276n0.f44998d.setText(C0141b.m613i(new Object[]{str4}, 1, Locale.getDefault(), C0166e.m765k(reviewActivityResultFragment.m3600t(R.string.activities_you_answered), ": %s"), "format(locale, format, *args)"));
                    }
                    return C9072e.f47360a;
                case 4:
                    String str29 = this.f29959j;
                    C8317l1 c8317l4 = this.f29958i;
                    String str30 = this.f29957h;
                    reviewActivityResult2 = (ReviewActivityResult) this.f29956g;
                    abstractC9953a2 = (AbstractC9953a) this.f29955f;
                    reviewActivityResultFragment = (ReviewActivityResultFragment) this.f29954e;
                    str6 = str29;
                    c7374a = (C7374a) this.f29961l;
                    C7499b.m14977z0(obj);
                    str2 = "tvPhrase";
                    str3 = "tvTranslation";
                    str = "viewBottom";
                    str4 = str30;
                    c8317l1M10276n0 = c8317l4;
                    objM14360a = obj;
                    str21 = (String) objM14360a;
                    iHashCode4 = str21.hashCode();
                    if (iHashCode4 != -702078272) {
                        if (iHashCode4 != 79183) {
                            if (iHashCode4 == 566114168) {
                                lessonStudyTransliteration8 = c7374a.f41155n;
                                if (lessonStudyTransliteration8 != null) {
                                    str11 = lessonStudyTransliteration8.f21911e;
                                } else {
                                    str11 = null;
                                }
                                str6 = str11;
                            }
                        } else if (str21.equals("Off")) {
                            str6 = "";
                        }
                    } else if (str21.equals("Jyutping")) {
                        lessonStudyTransliteration7 = c7374a.f41155n;
                        if (lessonStudyTransliteration7 != null) {
                            str11 = lessonStudyTransliteration7.f21912f;
                        } else {
                            str11 = null;
                        }
                        str6 = str11;
                    }
                    reviewActivityResult = reviewActivityResult2;
                    abstractC9953a = abstractC9953a2;
                    str5 = str6;
                    c8317l1M10276n0.f45001g.setText(C4924a.m10452c(c7374a.f41144c, C4924a.m10454d(c7374a.f41142a)));
                    c8317l1M10276n0.f44999e.setText(c7374a.f41148g);
                    c8317l1M10276n0.f44997c.setText(str5);
                    if (!reviewActivityResultFragment.f29929D0) {
                        InterfaceC3275c.a.m9347b((ReviewActivityViewModel) reviewActivityResultFragment.f29927B0.getValue(), reviewActivityResultFragment.m10278p0().mo498E1(), C4924a.m10454d(c7374a.f41142a), true, 0.0f, 8);
                        reviewActivityResultFragment.f29929D0 = true;
                    }
                    c8317l1M10276n0.f44995a.setOnClickListener(new a(reviewActivityResultFragment, c7374a));
                    c8317l1M10276n0.f44996b.setOnClickListener(new b(reviewActivityResultFragment, c7374a));
                    z10 = abstractC9953a instanceof AbstractC9953a.d;
                    if (z10) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (z11) {
                        c8317l1M10276n0.f45005k.setOnClickListener(new c(reviewActivityResultFragment));
                    }
                    int i15 = c7374a.f41150i;
                    Integer num5 = c7374a.f41151j;
                    ViewLearnProgress viewLearnProgress5 = c8317l1M10276n0.f45004j;
                    viewLearnProgress5.m10386b(i15, num5);
                    viewLearnProgress5.setOnChangeStatusListener(new d(reviewActivityResultFragment));
                    tokenMeaning = (TokenMeaning) C6752c.m13425S(c7374a.f41146e);
                    if (tokenMeaning != null) {
                        str22 = str20;
                    }
                    c8317l1M10276n0.f45002h.setText(str22);
                    if (z10) {
                        ReviewStoreImpl$special$$inlined$map$12 reviewStoreImpl$special$$inlined$map$12Mo9675y5 = reviewActivityResultFragment.m10279q0().mo9675y();
                        this.f29961l = reviewActivityResultFragment;
                        this.f29954e = reviewActivityResult;
                        this.f29955f = str4;
                        this.f29956g = c8317l1M10276n0;
                        this.f29957h = null;
                        this.f29958i = null;
                        this.f29959j = null;
                        this.f29960k = 5;
                        objM14360a6 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$12Mo9675y5, this);
                        if (objM14360a6 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        reviewActivityResult4 = reviewActivityResult;
                        str19 = str4;
                        if (((Boolean) objM14360a6).booleanValue()) {
                            ImageButton imageButton17 = c8317l1M10276n0.f44995a;
                            C5207g.m11110e(imageButton17, "btnTts");
                            C4924a.m10457e0(imageButton17);
                            TextView textView21112 = c8317l1M10276n0.f45001g;
                            C5207g.m11110e(textView21112, "tvTerm");
                            C4924a.m10457e0(textView21112);
                        } else {
                            ImageButton imageButton18 = c8317l1M10276n0.f44995a;
                            C5207g.m11110e(imageButton18, "btnTts");
                            C4924a.m10422A(imageButton18);
                            TextView textView21113 = c8317l1M10276n0.f45001g;
                            C5207g.m11110e(textView21113, "tvTerm");
                            C4924a.m10422A(textView21113);
                        }
                        ReviewStoreImpl$special$$inlined$map$13 reviewStoreImpl$special$$inlined$map$13Mo9635K5 = reviewActivityResultFragment.m10279q0().mo9635K();
                        this.f29961l = reviewActivityResultFragment;
                        this.f29954e = reviewActivityResult4;
                        this.f29955f = str19;
                        this.f29956g = c8317l1M10276n0;
                        this.f29960k = 6;
                        objM14360a7 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$13Mo9635K5, this);
                        if (objM14360a7 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        reviewActivityResultFragment3 = reviewActivityResultFragment;
                        if (((Boolean) objM14360a7).booleanValue()) {
                            TextView textView21114 = c8317l1M10276n0.f45002h;
                            C5207g.m11110e(textView21114, str3);
                            C4924a.m10422A(textView21114);
                        } else {
                            TextView textView21115 = c8317l1M10276n0.f45002h;
                            C5207g.m11110e(textView21115, str3);
                            C4924a.m10457e0(textView21115);
                        }
                        ReviewStoreImpl$special$$inlined$map$14 reviewStoreImpl$special$$inlined$map$14Mo9646V5 = reviewActivityResultFragment3.m10279q0().mo9646V();
                        this.f29961l = reviewActivityResultFragment3;
                        this.f29954e = reviewActivityResult4;
                        this.f29955f = str19;
                        this.f29956g = c8317l1M10276n0;
                        this.f29960k = 7;
                        objM14360a8 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$14Mo9646V5, this);
                        if (objM14360a8 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        reviewActivityResultFragment4 = reviewActivityResultFragment3;
                        if (((Boolean) objM14360a8).booleanValue()) {
                            TextView textView21116 = c8317l1M10276n0.f44999e;
                            C5207g.m11110e(textView21116, str2);
                            C4924a.m10422A(textView21116);
                        } else {
                            TextView textView21117 = c8317l1M10276n0.f44999e;
                            C5207g.m11110e(textView21117, str2);
                            C4924a.m10457e0(textView21117);
                        }
                        ReviewStoreImpl$special$$inlined$map$15 reviewStoreImpl$special$$inlined$map$15Mo9654d5 = reviewActivityResultFragment4.m10279q0().mo9654d();
                        this.f29961l = reviewActivityResultFragment4;
                        this.f29954e = reviewActivityResult4;
                        this.f29955f = str19;
                        this.f29956g = c8317l1M10276n0;
                        this.f29960k = 8;
                        objM14360a9 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$15Mo9654d5, this);
                        if (objM14360a9 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        c8317l1 = c8317l1M10276n0;
                        if (((Boolean) objM14360a9).booleanValue()) {
                            LinearLayout linearLayout111 = c8317l1.f45003i;
                            C5207g.m11110e(linearLayout111, str);
                            C4924a.m10422A(linearLayout111);
                        } else {
                            LinearLayout linearLayout112 = c8317l1.f45003i;
                            C5207g.m11110e(linearLayout112, str);
                            C4924a.m10457e0(linearLayout112);
                        }
                        c8317l1M10276n0 = c8317l1;
                        reviewActivityResult = reviewActivityResult4;
                        reviewActivityResultFragment = reviewActivityResultFragment4;
                        str4 = str19;
                    } else {
                        str16 = str;
                        str17 = str2;
                        str18 = str3;
                        if (abstractC9953a instanceof AbstractC9953a.e) {
                            ReviewStoreImpl$special$$inlined$map$20 reviewStoreImpl$special$$inlined$map$20Mo9676z5 = reviewActivityResultFragment.m10279q0().mo9676z();
                            this.f29961l = reviewActivityResultFragment;
                            this.f29954e = reviewActivityResult;
                            this.f29955f = str4;
                            this.f29956g = c8317l1M10276n0;
                            this.f29957h = null;
                            this.f29958i = null;
                            this.f29959j = null;
                            this.f29960k = 9;
                            objM14360a5 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$20Mo9676z5, this);
                            if (objM14360a5 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            reviewActivityResult4 = reviewActivityResult;
                            str19 = str4;
                            if (((Boolean) objM14360a5).booleanValue()) {
                                ImageButton imageButton19 = c8317l1M10276n0.f44995a;
                                C5207g.m11110e(imageButton19, "btnTts");
                                C4924a.m10457e0(imageButton19);
                                TextView textView21118 = c8317l1M10276n0.f45001g;
                                C5207g.m11110e(textView21118, "tvTerm");
                                C4924a.m10457e0(textView21118);
                            } else {
                                ImageButton imageButton110 = c8317l1M10276n0.f44995a;
                                C5207g.m11110e(imageButton110, "btnTts");
                                C4924a.m10422A(imageButton110);
                                TextView textView21119 = c8317l1M10276n0.f45001g;
                                C5207g.m11110e(textView21119, "tvTerm");
                                C4924a.m10422A(textView21119);
                            }
                            ReviewStoreImpl$special$$inlined$map$21 reviewStoreImpl$special$$inlined$map$21Mo9632H5 = reviewActivityResultFragment.m10279q0().mo9632H();
                            this.f29961l = reviewActivityResultFragment;
                            this.f29954e = reviewActivityResult4;
                            this.f29955f = str19;
                            this.f29956g = c8317l1M10276n0;
                            this.f29960k = 10;
                            objM14360a10 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$21Mo9632H5, this);
                            if (objM14360a10 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            reviewActivityResultFragment5 = reviewActivityResultFragment;
                            if (((Boolean) objM14360a10).booleanValue()) {
                                TextView textView111110 = c8317l1M10276n0.f45002h;
                                C5207g.m11110e(textView111110, str18);
                                C4924a.m10422A(textView111110);
                            } else {
                                TextView textView33 = c8317l1M10276n0.f45002h;
                                C5207g.m11110e(textView33, str18);
                                C4924a.m10457e0(textView33);
                            }
                            ReviewStoreImpl$special$$inlined$map$22 reviewStoreImpl$special$$inlined$map$22Mo9658h5 = reviewActivityResultFragment5.m10279q0().mo9658h();
                            this.f29961l = reviewActivityResultFragment5;
                            this.f29954e = reviewActivityResult4;
                            this.f29955f = str19;
                            this.f29956g = c8317l1M10276n0;
                            this.f29960k = 11;
                            objM14360a11 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$22Mo9658h5, this);
                            if (objM14360a11 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            reviewActivityResultFragment4 = reviewActivityResultFragment5;
                            if (((Boolean) objM14360a11).booleanValue()) {
                                TextView textView111111 = c8317l1M10276n0.f44999e;
                                C5207g.m11110e(textView111111, str17);
                                C4924a.m10422A(textView111111);
                            } else {
                                TextView textView111112 = c8317l1M10276n0.f44999e;
                                C5207g.m11110e(textView111112, str17);
                                C4924a.m10457e0(textView111112);
                            }
                            ReviewStoreImpl$special$$inlined$map$23 reviewStoreImpl$special$$inlined$map$23Mo9670t5 = reviewActivityResultFragment4.m10279q0().mo9670t();
                            this.f29961l = reviewActivityResultFragment4;
                            this.f29954e = reviewActivityResult4;
                            this.f29955f = str19;
                            this.f29956g = c8317l1M10276n0;
                            this.f29960k = 12;
                            objM14360a12 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$23Mo9670t5, this);
                            if (objM14360a12 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            c8317l1 = c8317l1M10276n0;
                            if (((Boolean) objM14360a12).booleanValue()) {
                                LinearLayout linearLayout113 = c8317l1.f45003i;
                                C5207g.m11110e(linearLayout113, str16);
                                C4924a.m10422A(linearLayout113);
                            } else {
                                LinearLayout linearLayout114 = c8317l1.f45003i;
                                C5207g.m11110e(linearLayout114, str16);
                                C4924a.m10457e0(linearLayout114);
                            }
                            c8317l1M10276n0 = c8317l1;
                            reviewActivityResult = reviewActivityResult4;
                            reviewActivityResultFragment = reviewActivityResultFragment4;
                            str4 = str19;
                        } else {
                            LinearLayout linearLayout115 = c8317l1M10276n0.f45003i;
                            C5207g.m11110e(linearLayout115, str16);
                            C4924a.m10457e0(linearLayout115);
                        }
                    }
                    i10 = e.f29968a[reviewActivityResult.ordinal()];
                    if (i10 == 1) {
                        TextView textView111113 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView111113, "tvResult");
                        C4924a.m10457e0(textView111113);
                        String strM3600t13 = reviewActivityResultFragment.m3600t(R.string.activities_correct);
                        TextView textView111114 = c8317l1M10276n0.f45000f;
                        textView111114.setText(strM3600t13);
                        List<Integer> list13 = C6716m.f37937a;
                        textView111114.setTextColor(C6716m.m13333r(R.attr.greenTint, reviewActivityResultFragment.m3578a0()));
                    } else if (i10 == 2) {
                        TextView textView111115 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView111115, "tvResult");
                        C4924a.m10457e0(textView111115);
                        String strM3600t14 = reviewActivityResultFragment.m3600t(R.string.activities_incorrect);
                        TextView textView111116 = c8317l1M10276n0.f45000f;
                        textView111116.setText(strM3600t14);
                        List<Integer> list14 = C6716m.f37937a;
                        textView111116.setTextColor(C6716m.m13333r(R.attr.redTint, reviewActivityResultFragment.m3578a0()));
                    } else if (i10 == 3) {
                        TextView textView111117 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView111117, "tvResult");
                        C4924a.m10457e0(textView111117);
                        String strM3600t15 = reviewActivityResultFragment.m3600t(R.string.activities_almost);
                        TextView textView111118 = c8317l1M10276n0.f45000f;
                        textView111118.setText(strM3600t15);
                        List<Integer> list15 = C6716m.f37937a;
                        textView111118.setTextColor(C6716m.m13333r(R.attr.secondaryTextColor, reviewActivityResultFragment.m3578a0()));
                    } else if (i10 == 4) {
                        TextView textView111119 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView111119, "tvResult");
                        C4924a.m10422A(textView111119);
                    }
                    if (str4 != null) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (z12) {
                        TextView textView211110 = c8317l1M10276n0.f44998d;
                        C5207g.m11110e(textView211110, "tvAnswered");
                        C4924a.m10422A(textView211110);
                    } else {
                        TextView textView211111 = c8317l1M10276n0.f44998d;
                        C5207g.m11110e(textView211111, "tvAnswered");
                        C4924a.m10457e0(textView211111);
                        c8317l1M10276n0.f44998d.setText(C0141b.m613i(new Object[]{str4}, 1, Locale.getDefault(), C0166e.m765k(reviewActivityResultFragment.m3600t(R.string.activities_you_answered), ": %s"), "format(locale, format, *args)"));
                    }
                    return C9072e.f47360a;
                case 5:
                    C8317l1 c8317l5 = (C8317l1) this.f29956g;
                    str19 = (String) this.f29955f;
                    reviewActivityResult4 = (ReviewActivityResult) this.f29954e;
                    ReviewActivityResultFragment reviewActivityResultFragment7 = (ReviewActivityResultFragment) this.f29961l;
                    C7499b.m14977z0(obj);
                    c8317l1M10276n0 = c8317l5;
                    str2 = "tvPhrase";
                    str3 = "tvTranslation";
                    reviewActivityResultFragment = reviewActivityResultFragment7;
                    str = "viewBottom";
                    objM14360a6 = obj;
                    if (((Boolean) objM14360a6).booleanValue()) {
                        ImageButton imageButton111 = c8317l1M10276n0.f44995a;
                        C5207g.m11110e(imageButton111, "btnTts");
                        C4924a.m10457e0(imageButton111);
                        TextView textView211112 = c8317l1M10276n0.f45001g;
                        C5207g.m11110e(textView211112, "tvTerm");
                        C4924a.m10457e0(textView211112);
                    } else {
                        ImageButton imageButton112 = c8317l1M10276n0.f44995a;
                        C5207g.m11110e(imageButton112, "btnTts");
                        C4924a.m10422A(imageButton112);
                        TextView textView211113 = c8317l1M10276n0.f45001g;
                        C5207g.m11110e(textView211113, "tvTerm");
                        C4924a.m10422A(textView211113);
                    }
                    ReviewStoreImpl$special$$inlined$map$13 reviewStoreImpl$special$$inlined$map$13Mo9635K6 = reviewActivityResultFragment.m10279q0().mo9635K();
                    this.f29961l = reviewActivityResultFragment;
                    this.f29954e = reviewActivityResult4;
                    this.f29955f = str19;
                    this.f29956g = c8317l1M10276n0;
                    this.f29960k = 6;
                    objM14360a7 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$13Mo9635K6, this);
                    if (objM14360a7 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    reviewActivityResultFragment3 = reviewActivityResultFragment;
                    if (((Boolean) objM14360a7).booleanValue()) {
                        TextView textView211114 = c8317l1M10276n0.f45002h;
                        C5207g.m11110e(textView211114, str3);
                        C4924a.m10422A(textView211114);
                    } else {
                        TextView textView211115 = c8317l1M10276n0.f45002h;
                        C5207g.m11110e(textView211115, str3);
                        C4924a.m10457e0(textView211115);
                    }
                    ReviewStoreImpl$special$$inlined$map$14 reviewStoreImpl$special$$inlined$map$14Mo9646V6 = reviewActivityResultFragment3.m10279q0().mo9646V();
                    this.f29961l = reviewActivityResultFragment3;
                    this.f29954e = reviewActivityResult4;
                    this.f29955f = str19;
                    this.f29956g = c8317l1M10276n0;
                    this.f29960k = 7;
                    objM14360a8 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$14Mo9646V6, this);
                    if (objM14360a8 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    reviewActivityResultFragment4 = reviewActivityResultFragment3;
                    if (((Boolean) objM14360a8).booleanValue()) {
                        TextView textView211116 = c8317l1M10276n0.f44999e;
                        C5207g.m11110e(textView211116, str2);
                        C4924a.m10422A(textView211116);
                    } else {
                        TextView textView211117 = c8317l1M10276n0.f44999e;
                        C5207g.m11110e(textView211117, str2);
                        C4924a.m10457e0(textView211117);
                    }
                    ReviewStoreImpl$special$$inlined$map$15 reviewStoreImpl$special$$inlined$map$15Mo9654d6 = reviewActivityResultFragment4.m10279q0().mo9654d();
                    this.f29961l = reviewActivityResultFragment4;
                    this.f29954e = reviewActivityResult4;
                    this.f29955f = str19;
                    this.f29956g = c8317l1M10276n0;
                    this.f29960k = 8;
                    objM14360a9 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$15Mo9654d6, this);
                    if (objM14360a9 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    c8317l1 = c8317l1M10276n0;
                    if (((Boolean) objM14360a9).booleanValue()) {
                        LinearLayout linearLayout116 = c8317l1.f45003i;
                        C5207g.m11110e(linearLayout116, str);
                        C4924a.m10422A(linearLayout116);
                    } else {
                        LinearLayout linearLayout117 = c8317l1.f45003i;
                        C5207g.m11110e(linearLayout117, str);
                        C4924a.m10457e0(linearLayout117);
                    }
                    c8317l1M10276n0 = c8317l1;
                    reviewActivityResult = reviewActivityResult4;
                    reviewActivityResultFragment = reviewActivityResultFragment4;
                    str4 = str19;
                    i10 = e.f29968a[reviewActivityResult.ordinal()];
                    if (i10 == 1) {
                        TextView textView1111110 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView1111110, "tvResult");
                        C4924a.m10457e0(textView1111110);
                        String strM3600t16 = reviewActivityResultFragment.m3600t(R.string.activities_correct);
                        TextView textView1111111 = c8317l1M10276n0.f45000f;
                        textView1111111.setText(strM3600t16);
                        List<Integer> list16 = C6716m.f37937a;
                        textView1111111.setTextColor(C6716m.m13333r(R.attr.greenTint, reviewActivityResultFragment.m3578a0()));
                    } else if (i10 == 2) {
                        TextView textView1111112 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView1111112, "tvResult");
                        C4924a.m10457e0(textView1111112);
                        String strM3600t17 = reviewActivityResultFragment.m3600t(R.string.activities_incorrect);
                        TextView textView1111113 = c8317l1M10276n0.f45000f;
                        textView1111113.setText(strM3600t17);
                        List<Integer> list17 = C6716m.f37937a;
                        textView1111113.setTextColor(C6716m.m13333r(R.attr.redTint, reviewActivityResultFragment.m3578a0()));
                    } else if (i10 == 3) {
                        TextView textView1111114 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView1111114, "tvResult");
                        C4924a.m10457e0(textView1111114);
                        String strM3600t18 = reviewActivityResultFragment.m3600t(R.string.activities_almost);
                        TextView textView1111115 = c8317l1M10276n0.f45000f;
                        textView1111115.setText(strM3600t18);
                        List<Integer> list18 = C6716m.f37937a;
                        textView1111115.setTextColor(C6716m.m13333r(R.attr.secondaryTextColor, reviewActivityResultFragment.m3578a0()));
                    } else if (i10 == 4) {
                        TextView textView1111116 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView1111116, "tvResult");
                        C4924a.m10422A(textView1111116);
                    }
                    if (str4 != null) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (z12) {
                        TextView textView211118 = c8317l1M10276n0.f44998d;
                        C5207g.m11110e(textView211118, "tvAnswered");
                        C4924a.m10422A(textView211118);
                    } else {
                        TextView textView211119 = c8317l1M10276n0.f44998d;
                        C5207g.m11110e(textView211119, "tvAnswered");
                        C4924a.m10457e0(textView211119);
                        c8317l1M10276n0.f44998d.setText(C0141b.m613i(new Object[]{str4}, 1, Locale.getDefault(), C0166e.m765k(reviewActivityResultFragment.m3600t(R.string.activities_you_answered), ": %s"), "format(locale, format, *args)"));
                    }
                    return C9072e.f47360a;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    C8317l1 c8317l6 = (C8317l1) this.f29956g;
                    str19 = (String) this.f29955f;
                    reviewActivityResult4 = (ReviewActivityResult) this.f29954e;
                    reviewActivityResultFragment3 = (ReviewActivityResultFragment) this.f29961l;
                    C7499b.m14977z0(obj);
                    c8317l1M10276n0 = c8317l6;
                    str2 = "tvPhrase";
                    str3 = "tvTranslation";
                    str = "viewBottom";
                    objM14360a7 = obj;
                    if (((Boolean) objM14360a7).booleanValue()) {
                        TextView textView2111110 = c8317l1M10276n0.f45002h;
                        C5207g.m11110e(textView2111110, str3);
                        C4924a.m10422A(textView2111110);
                    } else {
                        TextView textView2111111 = c8317l1M10276n0.f45002h;
                        C5207g.m11110e(textView2111111, str3);
                        C4924a.m10457e0(textView2111111);
                    }
                    ReviewStoreImpl$special$$inlined$map$14 reviewStoreImpl$special$$inlined$map$14Mo9646V7 = reviewActivityResultFragment3.m10279q0().mo9646V();
                    this.f29961l = reviewActivityResultFragment3;
                    this.f29954e = reviewActivityResult4;
                    this.f29955f = str19;
                    this.f29956g = c8317l1M10276n0;
                    this.f29960k = 7;
                    objM14360a8 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$14Mo9646V7, this);
                    if (objM14360a8 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    reviewActivityResultFragment4 = reviewActivityResultFragment3;
                    if (((Boolean) objM14360a8).booleanValue()) {
                        TextView textView2111112 = c8317l1M10276n0.f44999e;
                        C5207g.m11110e(textView2111112, str2);
                        C4924a.m10422A(textView2111112);
                    } else {
                        TextView textView2111113 = c8317l1M10276n0.f44999e;
                        C5207g.m11110e(textView2111113, str2);
                        C4924a.m10457e0(textView2111113);
                    }
                    ReviewStoreImpl$special$$inlined$map$15 reviewStoreImpl$special$$inlined$map$15Mo9654d7 = reviewActivityResultFragment4.m10279q0().mo9654d();
                    this.f29961l = reviewActivityResultFragment4;
                    this.f29954e = reviewActivityResult4;
                    this.f29955f = str19;
                    this.f29956g = c8317l1M10276n0;
                    this.f29960k = 8;
                    objM14360a9 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$15Mo9654d7, this);
                    if (objM14360a9 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    c8317l1 = c8317l1M10276n0;
                    if (((Boolean) objM14360a9).booleanValue()) {
                        LinearLayout linearLayout118 = c8317l1.f45003i;
                        C5207g.m11110e(linearLayout118, str);
                        C4924a.m10422A(linearLayout118);
                    } else {
                        LinearLayout linearLayout119 = c8317l1.f45003i;
                        C5207g.m11110e(linearLayout119, str);
                        C4924a.m10457e0(linearLayout119);
                    }
                    c8317l1M10276n0 = c8317l1;
                    reviewActivityResult = reviewActivityResult4;
                    reviewActivityResultFragment = reviewActivityResultFragment4;
                    str4 = str19;
                    i10 = e.f29968a[reviewActivityResult.ordinal()];
                    if (i10 == 1) {
                        TextView textView1111117 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView1111117, "tvResult");
                        C4924a.m10457e0(textView1111117);
                        String strM3600t19 = reviewActivityResultFragment.m3600t(R.string.activities_correct);
                        TextView textView1111118 = c8317l1M10276n0.f45000f;
                        textView1111118.setText(strM3600t19);
                        List<Integer> list19 = C6716m.f37937a;
                        textView1111118.setTextColor(C6716m.m13333r(R.attr.greenTint, reviewActivityResultFragment.m3578a0()));
                    } else if (i10 == 2) {
                        TextView textView1111119 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView1111119, "tvResult");
                        C4924a.m10457e0(textView1111119);
                        String strM3600t110 = reviewActivityResultFragment.m3600t(R.string.activities_incorrect);
                        TextView textView11111110 = c8317l1M10276n0.f45000f;
                        textView11111110.setText(strM3600t110);
                        List<Integer> list110 = C6716m.f37937a;
                        textView11111110.setTextColor(C6716m.m13333r(R.attr.redTint, reviewActivityResultFragment.m3578a0()));
                    } else if (i10 == 3) {
                        TextView textView11111111 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView11111111, "tvResult");
                        C4924a.m10457e0(textView11111111);
                        String strM3600t111 = reviewActivityResultFragment.m3600t(R.string.activities_almost);
                        TextView textView11111112 = c8317l1M10276n0.f45000f;
                        textView11111112.setText(strM3600t111);
                        List<Integer> list111 = C6716m.f37937a;
                        textView11111112.setTextColor(C6716m.m13333r(R.attr.secondaryTextColor, reviewActivityResultFragment.m3578a0()));
                    } else if (i10 == 4) {
                        TextView textView11111113 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView11111113, "tvResult");
                        C4924a.m10422A(textView11111113);
                    }
                    if (str4 != null) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (z12) {
                        TextView textView2111114 = c8317l1M10276n0.f44998d;
                        C5207g.m11110e(textView2111114, "tvAnswered");
                        C4924a.m10422A(textView2111114);
                    } else {
                        TextView textView2111115 = c8317l1M10276n0.f44998d;
                        C5207g.m11110e(textView2111115, "tvAnswered");
                        C4924a.m10457e0(textView2111115);
                        c8317l1M10276n0.f44998d.setText(C0141b.m613i(new Object[]{str4}, 1, Locale.getDefault(), C0166e.m765k(reviewActivityResultFragment.m3600t(R.string.activities_you_answered), ": %s"), "format(locale, format, *args)"));
                    }
                    return C9072e.f47360a;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    C8317l1 c8317l7 = (C8317l1) this.f29956g;
                    str19 = (String) this.f29955f;
                    reviewActivityResult4 = (ReviewActivityResult) this.f29954e;
                    reviewActivityResultFragment4 = (ReviewActivityResultFragment) this.f29961l;
                    C7499b.m14977z0(obj);
                    c8317l1M10276n0 = c8317l7;
                    str2 = "tvPhrase";
                    str = "viewBottom";
                    objM14360a8 = obj;
                    if (((Boolean) objM14360a8).booleanValue()) {
                        TextView textView2111116 = c8317l1M10276n0.f44999e;
                        C5207g.m11110e(textView2111116, str2);
                        C4924a.m10422A(textView2111116);
                    } else {
                        TextView textView2111117 = c8317l1M10276n0.f44999e;
                        C5207g.m11110e(textView2111117, str2);
                        C4924a.m10457e0(textView2111117);
                    }
                    ReviewStoreImpl$special$$inlined$map$15 reviewStoreImpl$special$$inlined$map$15Mo9654d8 = reviewActivityResultFragment4.m10279q0().mo9654d();
                    this.f29961l = reviewActivityResultFragment4;
                    this.f29954e = reviewActivityResult4;
                    this.f29955f = str19;
                    this.f29956g = c8317l1M10276n0;
                    this.f29960k = 8;
                    objM14360a9 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$15Mo9654d8, this);
                    if (objM14360a9 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    c8317l1 = c8317l1M10276n0;
                    if (((Boolean) objM14360a9).booleanValue()) {
                        LinearLayout linearLayout1110 = c8317l1.f45003i;
                        C5207g.m11110e(linearLayout1110, str);
                        C4924a.m10422A(linearLayout1110);
                    } else {
                        LinearLayout linearLayout1111 = c8317l1.f45003i;
                        C5207g.m11110e(linearLayout1111, str);
                        C4924a.m10457e0(linearLayout1111);
                    }
                    c8317l1M10276n0 = c8317l1;
                    reviewActivityResult = reviewActivityResult4;
                    reviewActivityResultFragment = reviewActivityResultFragment4;
                    str4 = str19;
                    i10 = e.f29968a[reviewActivityResult.ordinal()];
                    if (i10 == 1) {
                        TextView textView11111114 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView11111114, "tvResult");
                        C4924a.m10457e0(textView11111114);
                        String strM3600t112 = reviewActivityResultFragment.m3600t(R.string.activities_correct);
                        TextView textView11111115 = c8317l1M10276n0.f45000f;
                        textView11111115.setText(strM3600t112);
                        List<Integer> list112 = C6716m.f37937a;
                        textView11111115.setTextColor(C6716m.m13333r(R.attr.greenTint, reviewActivityResultFragment.m3578a0()));
                    } else if (i10 == 2) {
                        TextView textView11111116 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView11111116, "tvResult");
                        C4924a.m10457e0(textView11111116);
                        String strM3600t113 = reviewActivityResultFragment.m3600t(R.string.activities_incorrect);
                        TextView textView11111117 = c8317l1M10276n0.f45000f;
                        textView11111117.setText(strM3600t113);
                        List<Integer> list113 = C6716m.f37937a;
                        textView11111117.setTextColor(C6716m.m13333r(R.attr.redTint, reviewActivityResultFragment.m3578a0()));
                    } else if (i10 == 3) {
                        TextView textView11111118 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView11111118, "tvResult");
                        C4924a.m10457e0(textView11111118);
                        String strM3600t114 = reviewActivityResultFragment.m3600t(R.string.activities_almost);
                        TextView textView11111119 = c8317l1M10276n0.f45000f;
                        textView11111119.setText(strM3600t114);
                        List<Integer> list114 = C6716m.f37937a;
                        textView11111119.setTextColor(C6716m.m13333r(R.attr.secondaryTextColor, reviewActivityResultFragment.m3578a0()));
                    } else if (i10 == 4) {
                        TextView textView111111110 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView111111110, "tvResult");
                        C4924a.m10422A(textView111111110);
                    }
                    if (str4 != null) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (z12) {
                        TextView textView2111118 = c8317l1M10276n0.f44998d;
                        C5207g.m11110e(textView2111118, "tvAnswered");
                        C4924a.m10422A(textView2111118);
                    } else {
                        TextView textView2111119 = c8317l1M10276n0.f44998d;
                        C5207g.m11110e(textView2111119, "tvAnswered");
                        C4924a.m10457e0(textView2111119);
                        c8317l1M10276n0.f44998d.setText(C0141b.m613i(new Object[]{str4}, 1, Locale.getDefault(), C0166e.m765k(reviewActivityResultFragment.m3600t(R.string.activities_you_answered), ": %s"), "format(locale, format, *args)"));
                    }
                    return C9072e.f47360a;
                case 8:
                    c8317l1 = (C8317l1) this.f29956g;
                    String str31 = (String) this.f29955f;
                    ReviewActivityResult reviewActivityResult6 = (ReviewActivityResult) this.f29954e;
                    ReviewActivityResultFragment reviewActivityResultFragment8 = (ReviewActivityResultFragment) this.f29961l;
                    C7499b.m14977z0(obj);
                    reviewActivityResultFragment4 = reviewActivityResultFragment8;
                    str = "viewBottom";
                    reviewActivityResult4 = reviewActivityResult6;
                    str19 = str31;
                    objM14360a9 = obj;
                    if (((Boolean) objM14360a9).booleanValue()) {
                        LinearLayout linearLayout1112 = c8317l1.f45003i;
                        C5207g.m11110e(linearLayout1112, str);
                        C4924a.m10422A(linearLayout1112);
                    } else {
                        LinearLayout linearLayout1113 = c8317l1.f45003i;
                        C5207g.m11110e(linearLayout1113, str);
                        C4924a.m10457e0(linearLayout1113);
                    }
                    c8317l1M10276n0 = c8317l1;
                    reviewActivityResult = reviewActivityResult4;
                    reviewActivityResultFragment = reviewActivityResultFragment4;
                    str4 = str19;
                    i10 = e.f29968a[reviewActivityResult.ordinal()];
                    if (i10 == 1) {
                        TextView textView111111111 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView111111111, "tvResult");
                        C4924a.m10457e0(textView111111111);
                        String strM3600t115 = reviewActivityResultFragment.m3600t(R.string.activities_correct);
                        TextView textView111111112 = c8317l1M10276n0.f45000f;
                        textView111111112.setText(strM3600t115);
                        List<Integer> list115 = C6716m.f37937a;
                        textView111111112.setTextColor(C6716m.m13333r(R.attr.greenTint, reviewActivityResultFragment.m3578a0()));
                    } else if (i10 == 2) {
                        TextView textView111111113 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView111111113, "tvResult");
                        C4924a.m10457e0(textView111111113);
                        String strM3600t116 = reviewActivityResultFragment.m3600t(R.string.activities_incorrect);
                        TextView textView111111114 = c8317l1M10276n0.f45000f;
                        textView111111114.setText(strM3600t116);
                        List<Integer> list116 = C6716m.f37937a;
                        textView111111114.setTextColor(C6716m.m13333r(R.attr.redTint, reviewActivityResultFragment.m3578a0()));
                    } else if (i10 == 3) {
                        TextView textView111111115 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView111111115, "tvResult");
                        C4924a.m10457e0(textView111111115);
                        String strM3600t117 = reviewActivityResultFragment.m3600t(R.string.activities_almost);
                        TextView textView111111116 = c8317l1M10276n0.f45000f;
                        textView111111116.setText(strM3600t117);
                        List<Integer> list117 = C6716m.f37937a;
                        textView111111116.setTextColor(C6716m.m13333r(R.attr.secondaryTextColor, reviewActivityResultFragment.m3578a0()));
                    } else if (i10 == 4) {
                        TextView textView111111117 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView111111117, "tvResult");
                        C4924a.m10422A(textView111111117);
                    }
                    if (str4 != null) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (z12) {
                        TextView textView21111110 = c8317l1M10276n0.f44998d;
                        C5207g.m11110e(textView21111110, "tvAnswered");
                        C4924a.m10422A(textView21111110);
                    } else {
                        TextView textView21111111 = c8317l1M10276n0.f44998d;
                        C5207g.m11110e(textView21111111, "tvAnswered");
                        C4924a.m10457e0(textView21111111);
                        c8317l1M10276n0.f44998d.setText(C0141b.m613i(new Object[]{str4}, 1, Locale.getDefault(), C0166e.m765k(reviewActivityResultFragment.m3600t(R.string.activities_you_answered), ": %s"), "format(locale, format, *args)"));
                    }
                    return C9072e.f47360a;
                case 9:
                    C8317l1 c8317l8 = (C8317l1) this.f29956g;
                    str19 = (String) this.f29955f;
                    reviewActivityResult4 = (ReviewActivityResult) this.f29954e;
                    ReviewActivityResultFragment reviewActivityResultFragment9 = (ReviewActivityResultFragment) this.f29961l;
                    C7499b.m14977z0(obj);
                    c8317l1M10276n0 = c8317l8;
                    str17 = "tvPhrase";
                    reviewActivityResultFragment = reviewActivityResultFragment9;
                    str16 = "viewBottom";
                    objM14360a5 = obj;
                    str18 = "tvTranslation";
                    if (((Boolean) objM14360a5).booleanValue()) {
                        ImageButton imageButton113 = c8317l1M10276n0.f44995a;
                        C5207g.m11110e(imageButton113, "btnTts");
                        C4924a.m10457e0(imageButton113);
                        TextView textView211120 = c8317l1M10276n0.f45001g;
                        C5207g.m11110e(textView211120, "tvTerm");
                        C4924a.m10457e0(textView211120);
                    } else {
                        ImageButton imageButton114 = c8317l1M10276n0.f44995a;
                        C5207g.m11110e(imageButton114, "btnTts");
                        C4924a.m10422A(imageButton114);
                        TextView textView211121 = c8317l1M10276n0.f45001g;
                        C5207g.m11110e(textView211121, "tvTerm");
                        C4924a.m10422A(textView211121);
                    }
                    ReviewStoreImpl$special$$inlined$map$21 reviewStoreImpl$special$$inlined$map$21Mo9632H6 = reviewActivityResultFragment.m10279q0().mo9632H();
                    this.f29961l = reviewActivityResultFragment;
                    this.f29954e = reviewActivityResult4;
                    this.f29955f = str19;
                    this.f29956g = c8317l1M10276n0;
                    this.f29960k = 10;
                    objM14360a10 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$21Mo9632H6, this);
                    if (objM14360a10 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    reviewActivityResultFragment5 = reviewActivityResultFragment;
                    if (((Boolean) objM14360a10).booleanValue()) {
                        TextView textView1111120 = c8317l1M10276n0.f45002h;
                        C5207g.m11110e(textView1111120, str18);
                        C4924a.m10422A(textView1111120);
                    } else {
                        TextView textView34 = c8317l1M10276n0.f45002h;
                        C5207g.m11110e(textView34, str18);
                        C4924a.m10457e0(textView34);
                    }
                    ReviewStoreImpl$special$$inlined$map$22 reviewStoreImpl$special$$inlined$map$22Mo9658h6 = reviewActivityResultFragment5.m10279q0().mo9658h();
                    this.f29961l = reviewActivityResultFragment5;
                    this.f29954e = reviewActivityResult4;
                    this.f29955f = str19;
                    this.f29956g = c8317l1M10276n0;
                    this.f29960k = 11;
                    objM14360a11 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$22Mo9658h6, this);
                    if (objM14360a11 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    reviewActivityResultFragment4 = reviewActivityResultFragment5;
                    if (((Boolean) objM14360a11).booleanValue()) {
                        TextView textView1111121 = c8317l1M10276n0.f44999e;
                        C5207g.m11110e(textView1111121, str17);
                        C4924a.m10422A(textView1111121);
                    } else {
                        TextView textView1111122 = c8317l1M10276n0.f44999e;
                        C5207g.m11110e(textView1111122, str17);
                        C4924a.m10457e0(textView1111122);
                    }
                    ReviewStoreImpl$special$$inlined$map$23 reviewStoreImpl$special$$inlined$map$23Mo9670t6 = reviewActivityResultFragment4.m10279q0().mo9670t();
                    this.f29961l = reviewActivityResultFragment4;
                    this.f29954e = reviewActivityResult4;
                    this.f29955f = str19;
                    this.f29956g = c8317l1M10276n0;
                    this.f29960k = 12;
                    objM14360a12 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$23Mo9670t6, this);
                    if (objM14360a12 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    c8317l1 = c8317l1M10276n0;
                    if (((Boolean) objM14360a12).booleanValue()) {
                        LinearLayout linearLayout1114 = c8317l1.f45003i;
                        C5207g.m11110e(linearLayout1114, str16);
                        C4924a.m10422A(linearLayout1114);
                    } else {
                        LinearLayout linearLayout1115 = c8317l1.f45003i;
                        C5207g.m11110e(linearLayout1115, str16);
                        C4924a.m10457e0(linearLayout1115);
                    }
                    c8317l1M10276n0 = c8317l1;
                    reviewActivityResult = reviewActivityResult4;
                    reviewActivityResultFragment = reviewActivityResultFragment4;
                    str4 = str19;
                    i10 = e.f29968a[reviewActivityResult.ordinal()];
                    if (i10 == 1) {
                        TextView textView111111118 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView111111118, "tvResult");
                        C4924a.m10457e0(textView111111118);
                        String strM3600t118 = reviewActivityResultFragment.m3600t(R.string.activities_correct);
                        TextView textView111111119 = c8317l1M10276n0.f45000f;
                        textView111111119.setText(strM3600t118);
                        List<Integer> list118 = C6716m.f37937a;
                        textView111111119.setTextColor(C6716m.m13333r(R.attr.greenTint, reviewActivityResultFragment.m3578a0()));
                    } else if (i10 == 2) {
                        TextView textView1111111110 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView1111111110, "tvResult");
                        C4924a.m10457e0(textView1111111110);
                        String strM3600t119 = reviewActivityResultFragment.m3600t(R.string.activities_incorrect);
                        TextView textView1111111111 = c8317l1M10276n0.f45000f;
                        textView1111111111.setText(strM3600t119);
                        List<Integer> list119 = C6716m.f37937a;
                        textView1111111111.setTextColor(C6716m.m13333r(R.attr.redTint, reviewActivityResultFragment.m3578a0()));
                    } else if (i10 == 3) {
                        TextView textView1111111112 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView1111111112, "tvResult");
                        C4924a.m10457e0(textView1111111112);
                        String strM3600t1110 = reviewActivityResultFragment.m3600t(R.string.activities_almost);
                        TextView textView1111111113 = c8317l1M10276n0.f45000f;
                        textView1111111113.setText(strM3600t1110);
                        List<Integer> list1110 = C6716m.f37937a;
                        textView1111111113.setTextColor(C6716m.m13333r(R.attr.secondaryTextColor, reviewActivityResultFragment.m3578a0()));
                    } else if (i10 == 4) {
                        TextView textView1111111114 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView1111111114, "tvResult");
                        C4924a.m10422A(textView1111111114);
                    }
                    if (str4 != null) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (z12) {
                        TextView textView21111112 = c8317l1M10276n0.f44998d;
                        C5207g.m11110e(textView21111112, "tvAnswered");
                        C4924a.m10422A(textView21111112);
                    } else {
                        TextView textView21111113 = c8317l1M10276n0.f44998d;
                        C5207g.m11110e(textView21111113, "tvAnswered");
                        C4924a.m10457e0(textView21111113);
                        c8317l1M10276n0.f44998d.setText(C0141b.m613i(new Object[]{str4}, 1, Locale.getDefault(), C0166e.m765k(reviewActivityResultFragment.m3600t(R.string.activities_you_answered), ": %s"), "format(locale, format, *args)"));
                    }
                    return C9072e.f47360a;
                case 10:
                    C8317l1 c8317l9 = (C8317l1) this.f29956g;
                    str19 = (String) this.f29955f;
                    reviewActivityResult4 = (ReviewActivityResult) this.f29954e;
                    reviewActivityResultFragment5 = (ReviewActivityResultFragment) this.f29961l;
                    C7499b.m14977z0(obj);
                    c8317l1M10276n0 = c8317l9;
                    str17 = "tvPhrase";
                    str18 = "tvTranslation";
                    str16 = "viewBottom";
                    objM14360a10 = obj;
                    if (((Boolean) objM14360a10).booleanValue()) {
                        TextView textView1111123 = c8317l1M10276n0.f45002h;
                        C5207g.m11110e(textView1111123, str18);
                        C4924a.m10422A(textView1111123);
                    } else {
                        TextView textView35 = c8317l1M10276n0.f45002h;
                        C5207g.m11110e(textView35, str18);
                        C4924a.m10457e0(textView35);
                    }
                    ReviewStoreImpl$special$$inlined$map$22 reviewStoreImpl$special$$inlined$map$22Mo9658h7 = reviewActivityResultFragment5.m10279q0().mo9658h();
                    this.f29961l = reviewActivityResultFragment5;
                    this.f29954e = reviewActivityResult4;
                    this.f29955f = str19;
                    this.f29956g = c8317l1M10276n0;
                    this.f29960k = 11;
                    objM14360a11 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$22Mo9658h7, this);
                    if (objM14360a11 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    reviewActivityResultFragment4 = reviewActivityResultFragment5;
                    if (((Boolean) objM14360a11).booleanValue()) {
                        TextView textView1111124 = c8317l1M10276n0.f44999e;
                        C5207g.m11110e(textView1111124, str17);
                        C4924a.m10422A(textView1111124);
                    } else {
                        TextView textView1111125 = c8317l1M10276n0.f44999e;
                        C5207g.m11110e(textView1111125, str17);
                        C4924a.m10457e0(textView1111125);
                    }
                    ReviewStoreImpl$special$$inlined$map$23 reviewStoreImpl$special$$inlined$map$23Mo9670t7 = reviewActivityResultFragment4.m10279q0().mo9670t();
                    this.f29961l = reviewActivityResultFragment4;
                    this.f29954e = reviewActivityResult4;
                    this.f29955f = str19;
                    this.f29956g = c8317l1M10276n0;
                    this.f29960k = 12;
                    objM14360a12 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$23Mo9670t7, this);
                    if (objM14360a12 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    c8317l1 = c8317l1M10276n0;
                    if (((Boolean) objM14360a12).booleanValue()) {
                        LinearLayout linearLayout1116 = c8317l1.f45003i;
                        C5207g.m11110e(linearLayout1116, str16);
                        C4924a.m10422A(linearLayout1116);
                    } else {
                        LinearLayout linearLayout1117 = c8317l1.f45003i;
                        C5207g.m11110e(linearLayout1117, str16);
                        C4924a.m10457e0(linearLayout1117);
                    }
                    c8317l1M10276n0 = c8317l1;
                    reviewActivityResult = reviewActivityResult4;
                    reviewActivityResultFragment = reviewActivityResultFragment4;
                    str4 = str19;
                    i10 = e.f29968a[reviewActivityResult.ordinal()];
                    if (i10 == 1) {
                        TextView textView1111111115 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView1111111115, "tvResult");
                        C4924a.m10457e0(textView1111111115);
                        String strM3600t1111 = reviewActivityResultFragment.m3600t(R.string.activities_correct);
                        TextView textView1111111116 = c8317l1M10276n0.f45000f;
                        textView1111111116.setText(strM3600t1111);
                        List<Integer> list1111 = C6716m.f37937a;
                        textView1111111116.setTextColor(C6716m.m13333r(R.attr.greenTint, reviewActivityResultFragment.m3578a0()));
                    } else if (i10 == 2) {
                        TextView textView1111111117 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView1111111117, "tvResult");
                        C4924a.m10457e0(textView1111111117);
                        String strM3600t1112 = reviewActivityResultFragment.m3600t(R.string.activities_incorrect);
                        TextView textView1111111118 = c8317l1M10276n0.f45000f;
                        textView1111111118.setText(strM3600t1112);
                        List<Integer> list1112 = C6716m.f37937a;
                        textView1111111118.setTextColor(C6716m.m13333r(R.attr.redTint, reviewActivityResultFragment.m3578a0()));
                    } else if (i10 == 3) {
                        TextView textView1111111119 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView1111111119, "tvResult");
                        C4924a.m10457e0(textView1111111119);
                        String strM3600t1113 = reviewActivityResultFragment.m3600t(R.string.activities_almost);
                        TextView textView11111111110 = c8317l1M10276n0.f45000f;
                        textView11111111110.setText(strM3600t1113);
                        List<Integer> list1113 = C6716m.f37937a;
                        textView11111111110.setTextColor(C6716m.m13333r(R.attr.secondaryTextColor, reviewActivityResultFragment.m3578a0()));
                    } else if (i10 == 4) {
                        TextView textView11111111111 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView11111111111, "tvResult");
                        C4924a.m10422A(textView11111111111);
                    }
                    if (str4 != null) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (z12) {
                        TextView textView21111114 = c8317l1M10276n0.f44998d;
                        C5207g.m11110e(textView21111114, "tvAnswered");
                        C4924a.m10422A(textView21111114);
                    } else {
                        TextView textView21111115 = c8317l1M10276n0.f44998d;
                        C5207g.m11110e(textView21111115, "tvAnswered");
                        C4924a.m10457e0(textView21111115);
                        c8317l1M10276n0.f44998d.setText(C0141b.m613i(new Object[]{str4}, 1, Locale.getDefault(), C0166e.m765k(reviewActivityResultFragment.m3600t(R.string.activities_you_answered), ": %s"), "format(locale, format, *args)"));
                    }
                    return C9072e.f47360a;
                case 11:
                    C8317l1 c8317l10 = (C8317l1) this.f29956g;
                    str19 = (String) this.f29955f;
                    reviewActivityResult4 = (ReviewActivityResult) this.f29954e;
                    reviewActivityResultFragment4 = (ReviewActivityResultFragment) this.f29961l;
                    C7499b.m14977z0(obj);
                    c8317l1M10276n0 = c8317l10;
                    str17 = "tvPhrase";
                    str16 = "viewBottom";
                    objM14360a11 = obj;
                    if (((Boolean) objM14360a11).booleanValue()) {
                        TextView textView1111126 = c8317l1M10276n0.f44999e;
                        C5207g.m11110e(textView1111126, str17);
                        C4924a.m10422A(textView1111126);
                    } else {
                        TextView textView1111127 = c8317l1M10276n0.f44999e;
                        C5207g.m11110e(textView1111127, str17);
                        C4924a.m10457e0(textView1111127);
                    }
                    ReviewStoreImpl$special$$inlined$map$23 reviewStoreImpl$special$$inlined$map$23Mo9670t8 = reviewActivityResultFragment4.m10279q0().mo9670t();
                    this.f29961l = reviewActivityResultFragment4;
                    this.f29954e = reviewActivityResult4;
                    this.f29955f = str19;
                    this.f29956g = c8317l1M10276n0;
                    this.f29960k = 12;
                    objM14360a12 = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$23Mo9670t8, this);
                    if (objM14360a12 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    c8317l1 = c8317l1M10276n0;
                    if (((Boolean) objM14360a12).booleanValue()) {
                        LinearLayout linearLayout1118 = c8317l1.f45003i;
                        C5207g.m11110e(linearLayout1118, str16);
                        C4924a.m10422A(linearLayout1118);
                    } else {
                        LinearLayout linearLayout1119 = c8317l1.f45003i;
                        C5207g.m11110e(linearLayout1119, str16);
                        C4924a.m10457e0(linearLayout1119);
                    }
                    c8317l1M10276n0 = c8317l1;
                    reviewActivityResult = reviewActivityResult4;
                    reviewActivityResultFragment = reviewActivityResultFragment4;
                    str4 = str19;
                    i10 = e.f29968a[reviewActivityResult.ordinal()];
                    if (i10 == 1) {
                        TextView textView11111111112 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView11111111112, "tvResult");
                        C4924a.m10457e0(textView11111111112);
                        String strM3600t1114 = reviewActivityResultFragment.m3600t(R.string.activities_correct);
                        TextView textView11111111113 = c8317l1M10276n0.f45000f;
                        textView11111111113.setText(strM3600t1114);
                        List<Integer> list1114 = C6716m.f37937a;
                        textView11111111113.setTextColor(C6716m.m13333r(R.attr.greenTint, reviewActivityResultFragment.m3578a0()));
                    } else if (i10 == 2) {
                        TextView textView11111111114 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView11111111114, "tvResult");
                        C4924a.m10457e0(textView11111111114);
                        String strM3600t1115 = reviewActivityResultFragment.m3600t(R.string.activities_incorrect);
                        TextView textView11111111115 = c8317l1M10276n0.f45000f;
                        textView11111111115.setText(strM3600t1115);
                        List<Integer> list1115 = C6716m.f37937a;
                        textView11111111115.setTextColor(C6716m.m13333r(R.attr.redTint, reviewActivityResultFragment.m3578a0()));
                    } else if (i10 == 3) {
                        TextView textView11111111116 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView11111111116, "tvResult");
                        C4924a.m10457e0(textView11111111116);
                        String strM3600t1116 = reviewActivityResultFragment.m3600t(R.string.activities_almost);
                        TextView textView11111111117 = c8317l1M10276n0.f45000f;
                        textView11111111117.setText(strM3600t1116);
                        List<Integer> list1116 = C6716m.f37937a;
                        textView11111111117.setTextColor(C6716m.m13333r(R.attr.secondaryTextColor, reviewActivityResultFragment.m3578a0()));
                    } else if (i10 == 4) {
                        TextView textView11111111118 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView11111111118, "tvResult");
                        C4924a.m10422A(textView11111111118);
                    }
                    if (str4 != null) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (z12) {
                        TextView textView21111116 = c8317l1M10276n0.f44998d;
                        C5207g.m11110e(textView21111116, "tvAnswered");
                        C4924a.m10422A(textView21111116);
                    } else {
                        TextView textView21111117 = c8317l1M10276n0.f44998d;
                        C5207g.m11110e(textView21111117, "tvAnswered");
                        C4924a.m10457e0(textView21111117);
                        c8317l1M10276n0.f44998d.setText(C0141b.m613i(new Object[]{str4}, 1, Locale.getDefault(), C0166e.m765k(reviewActivityResultFragment.m3600t(R.string.activities_you_answered), ": %s"), "format(locale, format, *args)"));
                    }
                    return C9072e.f47360a;
                case 12:
                    c8317l1 = (C8317l1) this.f29956g;
                    String str32 = (String) this.f29955f;
                    ReviewActivityResult reviewActivityResult7 = (ReviewActivityResult) this.f29954e;
                    ReviewActivityResultFragment reviewActivityResultFragment10 = (ReviewActivityResultFragment) this.f29961l;
                    C7499b.m14977z0(obj);
                    reviewActivityResultFragment4 = reviewActivityResultFragment10;
                    str16 = "viewBottom";
                    reviewActivityResult4 = reviewActivityResult7;
                    str19 = str32;
                    objM14360a12 = obj;
                    if (((Boolean) objM14360a12).booleanValue()) {
                        LinearLayout linearLayout11110 = c8317l1.f45003i;
                        C5207g.m11110e(linearLayout11110, str16);
                        C4924a.m10422A(linearLayout11110);
                    } else {
                        LinearLayout linearLayout11111 = c8317l1.f45003i;
                        C5207g.m11110e(linearLayout11111, str16);
                        C4924a.m10457e0(linearLayout11111);
                    }
                    c8317l1M10276n0 = c8317l1;
                    reviewActivityResult = reviewActivityResult4;
                    reviewActivityResultFragment = reviewActivityResultFragment4;
                    str4 = str19;
                    i10 = e.f29968a[reviewActivityResult.ordinal()];
                    if (i10 == 1) {
                        TextView textView11111111119 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView11111111119, "tvResult");
                        C4924a.m10457e0(textView11111111119);
                        String strM3600t1117 = reviewActivityResultFragment.m3600t(R.string.activities_correct);
                        TextView textView111111111110 = c8317l1M10276n0.f45000f;
                        textView111111111110.setText(strM3600t1117);
                        List<Integer> list1117 = C6716m.f37937a;
                        textView111111111110.setTextColor(C6716m.m13333r(R.attr.greenTint, reviewActivityResultFragment.m3578a0()));
                    } else if (i10 == 2) {
                        TextView textView111111111111 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView111111111111, "tvResult");
                        C4924a.m10457e0(textView111111111111);
                        String strM3600t1118 = reviewActivityResultFragment.m3600t(R.string.activities_incorrect);
                        TextView textView111111111112 = c8317l1M10276n0.f45000f;
                        textView111111111112.setText(strM3600t1118);
                        List<Integer> list1118 = C6716m.f37937a;
                        textView111111111112.setTextColor(C6716m.m13333r(R.attr.redTint, reviewActivityResultFragment.m3578a0()));
                    } else if (i10 == 3) {
                        TextView textView111111111113 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView111111111113, "tvResult");
                        C4924a.m10457e0(textView111111111113);
                        String strM3600t1119 = reviewActivityResultFragment.m3600t(R.string.activities_almost);
                        TextView textView111111111114 = c8317l1M10276n0.f45000f;
                        textView111111111114.setText(strM3600t1119);
                        List<Integer> list1119 = C6716m.f37937a;
                        textView111111111114.setTextColor(C6716m.m13333r(R.attr.secondaryTextColor, reviewActivityResultFragment.m3578a0()));
                    } else if (i10 == 4) {
                        TextView textView111111111115 = c8317l1M10276n0.f45000f;
                        C5207g.m11110e(textView111111111115, "tvResult");
                        C4924a.m10422A(textView111111111115);
                    }
                    if (str4 != null) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (z12) {
                        TextView textView21111118 = c8317l1M10276n0.f44998d;
                        C5207g.m11110e(textView21111118, "tvAnswered");
                        C4924a.m10422A(textView21111118);
                    } else {
                        TextView textView21111119 = c8317l1M10276n0.f44998d;
                        C5207g.m11110e(textView21111119, "tvAnswered");
                        C4924a.m10457e0(textView21111119);
                        c8317l1M10276n0.f44998d.setText(C0141b.m613i(new Object[]{str4}, 1, Locale.getDefault(), C0166e.m765k(reviewActivityResultFragment.m3600t(R.string.activities_you_answered), ": %s"), "format(locale, format, *args)"));
                    }
                    return C9072e.f47360a;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityResultFragment$onViewCreated$1$1(ReviewActivityResultFragment reviewActivityResultFragment, AbstractC9953a abstractC9953a, ReviewActivityResult reviewActivityResult, String str, InterfaceC9968c<? super ReviewActivityResultFragment$onViewCreated$1$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f29946f = reviewActivityResultFragment;
        this.f29947g = abstractC9953a;
        this.f29948h = reviewActivityResult;
        this.f29949i = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ReviewActivityResultFragment$onViewCreated$1$1(this.f29946f, this.f29947g, this.f29948h, this.f29949i, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ReviewActivityResultFragment$onViewCreated$1$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29945e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            ReviewActivityViewModel reviewActivityViewModelM10277o0 = ReviewActivityResultFragment.m10277o0(this.f29946f);
            C46081 c46081 = new C46081(this.f29946f, this.f29947g, this.f29948h, this.f29949i, null);
            this.f29945e = 1;
            if (C0062b.m369m0(reviewActivityViewModelM10277o0.f30151I, c46081, this) == coroutineSingletons) {
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
