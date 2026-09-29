package com.lingq.p055ui.review.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.fragment.app.Fragment;
import androidx.view.C1038i0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.InterfaceC1037i;
import androidx.view.InterfaceC1048n0;
import androidx.view.Lifecycle;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.controllers.InterfaceC3275c;
import com.lingq.p055ui.review.ReviewViewModel;
import com.lingq.p055ui.review.activities.ReviewActivityMultiAndClozeFragment;
import com.lingq.p055ui.review.data.ReviewActivityResult;
import com.lingq.p055ui.review.data.ReviewActivityShow;
import com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$19;
import com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$20;
import com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$21;
import com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$22;
import com.lingq.shared.uimodel.LanguageLearn;
import com.lingq.shared.uimodel.LanguageLearnBeta;
import com.lingq.shared.uimodel.lesson.LessonStudyTransliteration;
import com.lingq.shared.uimodel.token.TokenMeaning;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.random.Random;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import li.C7374a;
import no.C7828f;
import p003a2.C0009a;
import p076di.InterfaceC5179a;
import p096ei.C5408a;
import p199jd.ViewOnClickListenerC6464i;
import p260m8.C7499b;
import p264mi.C7561a;
import p264mi.C7562b;
import p322pd.C8228i;
import p338qd.C8573r0;
import p385sf.C9000b;
import p408u6.ViewOnClickListenerC9466e;
import p427v3.AbstractC9634a;
import p438vj.AbstractC9743c;
import p462wj.AbstractC9953a;
import p462wj.C9954b;
import p462wj.C9955c;
import p464wl.InterfaceC9968c;
import ph.C8311k1;
import si.ViewOnClickListenerC9029m;
import sl.C9072e;
import sl.InterfaceC9070c;
import vi.ViewOnClickListenerC9734i;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/review/activities/ReviewActivityMultiAndClozeFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ReviewActivityMultiAndClozeFragment extends AbstractC9743c {

    /* JADX INFO: renamed from: H0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f29872H0 = {C0204c.m857q(ReviewActivityMultiAndClozeFragment.class, "getBinding()Lcom/lingq/databinding/FragmentReviewActivityMultiAndClozeBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final FragmentViewBindingDelegate f29873A0;

    /* JADX INFO: renamed from: B0 */
    public final C1038i0 f29874B0;

    /* JADX INFO: renamed from: C0 */
    public final C1038i0 f29875C0;

    /* JADX INFO: renamed from: D0 */
    public final TextView[] f29876D0;

    /* JADX INFO: renamed from: E0 */
    public final View[] f29877E0;

    /* JADX INFO: renamed from: F0 */
    public boolean f29878F0;

    /* JADX INFO: renamed from: G0 */
    public InterfaceC5179a f29879G0;

    /* JADX WARN: Type inference failed for: r0v3, types: [com.lingq.ui.review.activities.ReviewActivityMultiAndClozeFragment$special$$inlined$viewModels$default$1] */
    public ReviewActivityMultiAndClozeFragment() {
        super(R.layout.fragment_review_activity_multi_and_cloze);
        this.f29873A0 = C4924a.m10477o0(this, ReviewActivityMultiAndClozeFragment$binding$2.f29880j);
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.review.activities.ReviewActivityMultiAndClozeFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(lazyThreadSafetyMode, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.review.activities.ReviewActivityMultiAndClozeFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return (InterfaceC1048n0) r10.mo807E();
            }
        });
        this.f29874B0 = C8573r0.m16711Z(this, C5209i.m11118a(ReviewActivityViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.review.activities.ReviewActivityMultiAndClozeFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.review.activities.ReviewActivityMultiAndClozeFragment$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b);
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                AbstractC9634a abstractC9634aMo792j = interfaceC1037i != null ? interfaceC1037i.mo792j() : null;
                return abstractC9634aMo792j == null ? AbstractC9634a.a.f49330b : abstractC9634aMo792j;
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.review.activities.ReviewActivityMultiAndClozeFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1042k0.b mo807E() {
                C1042k0.b bVarMo470i;
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b);
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                if (interfaceC1037i == null || (bVarMo470i = interfaceC1037i.mo470i()) == null) {
                    bVarMo470i = this.mo470i();
                }
                C5207g.m11110e(bVarMo470i, "(owner as? HasDefaultVie…tViewModelProviderFactory");
                return bVarMo470i;
            }
        });
        final InterfaceC2041a<InterfaceC1048n0> interfaceC2041a = new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.review.activities.ReviewActivityMultiAndClozeFragment$parentViewModel$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return this.f29904b.m3579b0().m3579b0();
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b2 = C6740a.m13373b(lazyThreadSafetyMode, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.review.activities.ReviewActivityMultiAndClozeFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return (InterfaceC1048n0) interfaceC2041a.mo807E();
            }
        });
        this.f29875C0 = C8573r0.m16711Z(this, C5209i.m11118a(ReviewViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.review.activities.ReviewActivityMultiAndClozeFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b2, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.review.activities.ReviewActivityMultiAndClozeFragment$special$$inlined$viewModels$default$8
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b2);
                AbstractC9634a abstractC9634aMo792j = null;
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                if (interfaceC1037i != null) {
                    abstractC9634aMo792j = interfaceC1037i.mo792j();
                }
                return abstractC9634aMo792j == null ? AbstractC9634a.a.f49330b : abstractC9634aMo792j;
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.review.activities.ReviewActivityMultiAndClozeFragment$special$$inlined$viewModels$default$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1042k0.b mo807E() {
                C1042k0.b bVarMo470i;
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b2);
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                if (interfaceC1037i == null || (bVarMo470i = interfaceC1037i.mo470i()) == null) {
                    bVarMo470i = this.mo470i();
                }
                C5207g.m11110e(bVarMo470i, "(owner as? HasDefaultVie…tViewModelProviderFactory");
                return bVarMo470i;
            }
        });
        this.f29876D0 = new TextView[4];
        this.f29877E0 = new View[4];
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C8228i c8228iM29r = C0009a.m29r(view, "view", 2, true);
        c8228iM29r.f48293c = 300L;
        m3585f0(c8228iM29r);
        C9955c c9955c = new C9955c(ReviewActivityShow.DoNotKnow);
        C1038i0 c1038i0 = this.f29875C0;
        ((ReviewViewModel) c1038i0.getValue()).f29660k0.setValue(c9955c);
        AbstractC9953a abstractC9953aM10261t2 = ((ReviewViewModel) c1038i0.getValue()).m10261t2();
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C4595x697204df(this, Lifecycle.State.STARTED, null, this, abstractC9953aM10261t2), 3);
    }

    /* JADX INFO: renamed from: n0 */
    public final C8311k1 m10273n0() {
        return (C8311k1) this.f29873A0.m10489a(this, f29872H0[0]);
    }

    /* JADX INFO: renamed from: o0 */
    public final ReviewActivityViewModel m10274o0() {
        return (ReviewActivityViewModel) this.f29874B0.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:108:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:115:0x0208  */
    /* JADX WARN: Code duplicated, block: B:118:0x0212  */
    /* JADX WARN: Code duplicated, block: B:120:0x0216  */
    /* JADX WARN: Code duplicated, block: B:121:0x0219  */
    /* JADX WARN: Code duplicated, block: B:123:0x021f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0229  */
    /* JADX WARN: Code duplicated, block: B:128:0x022d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0230  */
    /* JADX WARN: Code duplicated, block: B:143:0x026f  */
    /* JADX WARN: Code duplicated, block: B:145:0x0274  */
    /* JADX WARN: Code duplicated, block: B:153:0x0285  */
    /* JADX WARN: Code duplicated, block: B:154:0x0288  */
    /* JADX WARN: Code duplicated, block: B:156:0x028c  */
    /* JADX WARN: Code duplicated, block: B:159:0x0293  */
    /* JADX WARN: Code duplicated, block: B:160:0x0296  */
    /* JADX WARN: Code duplicated, block: B:163:0x029f  */
    /* JADX WARN: Code duplicated, block: B:165:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:166:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:173:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:174:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:177:0x030d  */
    /* JADX WARN: Code duplicated, block: B:180:0x0317  */
    /* JADX WARN: Code duplicated, block: B:182:0x0321  */
    /* JADX WARN: Code duplicated, block: B:185:0x0357  */
    /* JADX WARN: Code duplicated, block: B:186:0x035b  */
    /* JADX WARN: Code duplicated, block: B:188:0x0369  */
    /* JADX WARN: Code duplicated, block: B:190:0x036d  */
    /* JADX WARN: Code duplicated, block: B:192:0x038c  */
    /* JADX WARN: Code duplicated, block: B:195:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:197:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:199:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:204:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:206:0x0408  */
    /* JADX WARN: Code duplicated, block: B:208:0x040e  */
    /* JADX WARN: Code duplicated, block: B:210:0x0423  */
    /* JADX WARN: Code duplicated, block: B:212:0x045c  */
    /* JADX WARN: Code duplicated, block: B:214:0x0460  */
    /* JADX WARN: Code duplicated, block: B:216:0x0475  */
    /* JADX WARN: Code duplicated, block: B:221:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:223:0x04be  */
    /* JADX WARN: Code duplicated, block: B:228:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:231:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:232:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:240:0x04eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x04f6 A[EDGE_INSN: B:241:0x04f6->B:238:0x04f6 BREAK  A[LOOP:0: B:219:0x04ae->B:245:0x04ae], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x04f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x04c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x04e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:34:0x0101  */
    /* JADX WARN: Code duplicated, block: B:41:0x0114  */
    /* JADX WARN: Code duplicated, block: B:44:0x011e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0122  */
    /* JADX WARN: Code duplicated, block: B:47:0x0125  */
    /* JADX WARN: Code duplicated, block: B:49:0x012a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0132  */
    /* JADX WARN: Code duplicated, block: B:54:0x0136  */
    /* JADX WARN: Code duplicated, block: B:55:0x0139  */
    /* JADX WARN: Code duplicated, block: B:69:0x0177  */
    /* JADX WARN: Code duplicated, block: B:71:0x017c  */
    /* JADX WARN: Code duplicated, block: B:79:0x018f  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0192  */
    /* JADX WARN: Code duplicated, block: B:82:0x0198  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:92:0x01b3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v45, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v13, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v22, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, java.lang.String] */
    /* JADX INFO: renamed from: p0 */
    public final Object m10275p0(C7374a c7374a, AbstractC9953a abstractC9953a, C7562b c7562b, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        ReviewActivityMultiAndClozeFragment$setupUi$1 reviewActivityMultiAndClozeFragment$setupUi$1;
        Ref$ObjectRef ref$ObjectRef;
        ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment;
        Object objM14360a;
        Object objM14360a2;
        Object objM14360a3;
        Object objM14360a4;
        String str;
        int iHashCode;
        LessonStudyTransliteration lessonStudyTransliteration;
        T t10;
        LessonStudyTransliteration lessonStudyTransliteration2;
        T t11;
        String str2;
        int iHashCode2;
        LessonStudyTransliteration lessonStudyTransliteration3;
        T t12;
        LessonStudyTransliteration lessonStudyTransliteration4;
        T t13;
        String str3;
        int iHashCode3;
        LessonStudyTransliteration lessonStudyTransliteration5;
        T t14;
        LessonStudyTransliteration lessonStudyTransliteration6;
        T t15;
        View[] viewArr;
        TextView[] textViewArr;
        final ArrayList arrayList;
        final Ref$ObjectRef ref$ObjectRef2;
        boolean z10;
        TextView textView;
        TextView textView2;
        TextView textView3;
        ImageButton imageButton;
        int i10;
        TokenMeaning tokenMeaning;
        String strM10454d;
        String str4;
        Iterator it;
        final int i11;
        Object next;
        final String str5;
        TextView textView4;
        TextView textView5;
        View view;
        String strM10454d2;
        List<String> list;
        List<C7561a> list2;
        String str6;
        int iHashCode4;
        LessonStudyTransliteration lessonStudyTransliteration7;
        T t16;
        LessonStudyTransliteration lessonStudyTransliteration8;
        T t17;
        C7374a c7374a2 = c7374a;
        AbstractC9953a abstractC9953a2 = abstractC9953a;
        C7562b c7562b2 = c7562b;
        if (interfaceC9968c instanceof ReviewActivityMultiAndClozeFragment$setupUi$1) {
            reviewActivityMultiAndClozeFragment$setupUi$1 = (ReviewActivityMultiAndClozeFragment$setupUi$1) interfaceC9968c;
            int i12 = reviewActivityMultiAndClozeFragment$setupUi$1.f29912k;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                reviewActivityMultiAndClozeFragment$setupUi$1.f29912k = i12 - Integer.MIN_VALUE;
            } else {
                reviewActivityMultiAndClozeFragment$setupUi$1 = new ReviewActivityMultiAndClozeFragment$setupUi$1(this, interfaceC9968c);
            }
        } else {
            reviewActivityMultiAndClozeFragment$setupUi$1 = new ReviewActivityMultiAndClozeFragment$setupUi$1(this, interfaceC9968c);
        }
        Object obj = reviewActivityMultiAndClozeFragment$setupUi$1.f29910i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i13 = reviewActivityMultiAndClozeFragment$setupUi$1.f29912k;
        if (i13 == 0) {
            C7499b.m14977z0(obj);
            if (c7374a2 != null) {
                ref$ObjectRef = new Ref$ObjectRef();
                ref$ObjectRef.f38127a = "";
                String strMo498E1 = m10274o0().mo498E1();
                if (C5207g.m11106a(strMo498E1, C5408a.m11569b(LanguageLearn.Mandarin))) {
                    InterfaceC5179a interfaceC5179a = this.f29879G0;
                    if (interfaceC5179a == null) {
                        C5207g.m11117l("preferenceStore");
                        throw null;
                    }
                    PreferenceStoreImpl$special$$inlined$map$19 preferenceStoreImpl$special$$inlined$map$19Mo9565L = interfaceC5179a.mo9565L();
                    reviewActivityMultiAndClozeFragment$setupUi$1.f29905d = this;
                    reviewActivityMultiAndClozeFragment$setupUi$1.f29906e = c7374a2;
                    reviewActivityMultiAndClozeFragment$setupUi$1.f29907f = abstractC9953a2;
                    reviewActivityMultiAndClozeFragment$setupUi$1.f29908g = c7562b2;
                    reviewActivityMultiAndClozeFragment$setupUi$1.f29909h = ref$ObjectRef;
                    reviewActivityMultiAndClozeFragment$setupUi$1.f29912k = 1;
                    objM14360a4 = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$19Mo9565L, reviewActivityMultiAndClozeFragment$setupUi$1);
                    if (objM14360a4 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    reviewActivityMultiAndClozeFragment = this;
                    str = (String) objM14360a4;
                    iHashCode = str.hashCode();
                    if (iHashCode != -1904268855) {
                        if (iHashCode != -469838457) {
                            if (iHashCode == 79183) {
                                ref$ObjectRef.f38127a = "";
                            }
                        } else if (str.equals("Traditional")) {
                            lessonStudyTransliteration2 = c7374a2.f41155n;
                            if (lessonStudyTransliteration2 != null) {
                                t11 = lessonStudyTransliteration2.f21910d;
                            } else {
                                t11 = 0;
                            }
                            ref$ObjectRef.f38127a = t11;
                        }
                    } else if (str.equals("Pinyin")) {
                        lessonStudyTransliteration = c7374a2.f41155n;
                        if (lessonStudyTransliteration != null) {
                            t10 = lessonStudyTransliteration.f21909c;
                        } else {
                            t10 = 0;
                        }
                        ref$ObjectRef.f38127a = t10;
                    }
                } else if (C5207g.m11106a(strMo498E1, C5408a.m11570c(LanguageLearnBeta.ChineseTraditional))) {
                    InterfaceC5179a interfaceC5179a2 = this.f29879G0;
                    if (interfaceC5179a2 == null) {
                        C5207g.m11117l("preferenceStore");
                        throw null;
                    }
                    PreferenceStoreImpl$special$$inlined$map$21 preferenceStoreImpl$special$$inlined$map$21Mo9586d = interfaceC5179a2.mo9586d();
                    reviewActivityMultiAndClozeFragment$setupUi$1.f29905d = this;
                    reviewActivityMultiAndClozeFragment$setupUi$1.f29906e = c7374a2;
                    reviewActivityMultiAndClozeFragment$setupUi$1.f29907f = abstractC9953a2;
                    reviewActivityMultiAndClozeFragment$setupUi$1.f29908g = c7562b2;
                    reviewActivityMultiAndClozeFragment$setupUi$1.f29909h = ref$ObjectRef;
                    reviewActivityMultiAndClozeFragment$setupUi$1.f29912k = 2;
                    objM14360a3 = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$21Mo9586d, reviewActivityMultiAndClozeFragment$setupUi$1);
                    if (objM14360a3 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    reviewActivityMultiAndClozeFragment = this;
                    str2 = (String) objM14360a3;
                    iHashCode2 = str2.hashCode();
                    if (iHashCode2 != -1904268855) {
                        if (iHashCode2 != 79183) {
                            if (iHashCode2 == 566114168) {
                                lessonStudyTransliteration4 = c7374a2.f41155n;
                                if (lessonStudyTransliteration4 != null) {
                                    t13 = lessonStudyTransliteration4.f21911e;
                                } else {
                                    t13 = 0;
                                }
                                ref$ObjectRef.f38127a = t13;
                            }
                        } else if (str2.equals("Off")) {
                            ref$ObjectRef.f38127a = "";
                        }
                    } else if (str2.equals("Pinyin")) {
                        lessonStudyTransliteration3 = c7374a2.f41155n;
                        if (lessonStudyTransliteration3 != null) {
                            t12 = lessonStudyTransliteration3.f21909c;
                        } else {
                            t12 = 0;
                        }
                        ref$ObjectRef.f38127a = t12;
                    }
                } else if (C5207g.m11106a(strMo498E1, C5408a.m11569b(LanguageLearn.Japanese))) {
                    InterfaceC5179a interfaceC5179a3 = this.f29879G0;
                    if (interfaceC5179a3 == null) {
                        C5207g.m11117l("preferenceStore");
                        throw null;
                    }
                    PreferenceStoreImpl$special$$inlined$map$20 preferenceStoreImpl$special$$inlined$map$20Mo9591f0 = interfaceC5179a3.mo9591f0();
                    reviewActivityMultiAndClozeFragment$setupUi$1.f29905d = this;
                    reviewActivityMultiAndClozeFragment$setupUi$1.f29906e = c7374a2;
                    reviewActivityMultiAndClozeFragment$setupUi$1.f29907f = abstractC9953a2;
                    reviewActivityMultiAndClozeFragment$setupUi$1.f29908g = c7562b2;
                    reviewActivityMultiAndClozeFragment$setupUi$1.f29909h = ref$ObjectRef;
                    reviewActivityMultiAndClozeFragment$setupUi$1.f29912k = 3;
                    objM14360a2 = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$20Mo9591f0, reviewActivityMultiAndClozeFragment$setupUi$1);
                    if (objM14360a2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    reviewActivityMultiAndClozeFragment = this;
                    str3 = (String) objM14360a2;
                    iHashCode3 = str3.hashCode();
                    if (iHashCode3 != -1841522256) {
                        if (iHashCode3 != -1311598819) {
                            if (iHashCode3 == 79183) {
                                ref$ObjectRef.f38127a = "";
                            }
                        } else if (str3.equals("Hiragana")) {
                            lessonStudyTransliteration6 = c7374a2.f41155n;
                            if (lessonStudyTransliteration6 != null) {
                                t15 = lessonStudyTransliteration6.f21907a;
                            } else {
                                t15 = 0;
                            }
                            ref$ObjectRef.f38127a = t15;
                        }
                    } else if (str3.equals("Romaji")) {
                        lessonStudyTransliteration5 = c7374a2.f41155n;
                        if (lessonStudyTransliteration5 != null) {
                            t14 = lessonStudyTransliteration5.f21908b;
                        } else {
                            t14 = 0;
                        }
                        ref$ObjectRef.f38127a = t14;
                    }
                } else if (C5207g.m11106a(strMo498E1, C5408a.m11570c(LanguageLearnBeta.Cantonese))) {
                    InterfaceC5179a interfaceC5179a4 = this.f29879G0;
                    if (interfaceC5179a4 == null) {
                        C5207g.m11117l("preferenceStore");
                        throw null;
                    }
                    PreferenceStoreImpl$special$$inlined$map$22 preferenceStoreImpl$special$$inlined$map$22Mo9555B = interfaceC5179a4.mo9555B();
                    reviewActivityMultiAndClozeFragment$setupUi$1.f29905d = this;
                    reviewActivityMultiAndClozeFragment$setupUi$1.f29906e = c7374a2;
                    reviewActivityMultiAndClozeFragment$setupUi$1.f29907f = abstractC9953a2;
                    reviewActivityMultiAndClozeFragment$setupUi$1.f29908g = c7562b2;
                    reviewActivityMultiAndClozeFragment$setupUi$1.f29909h = ref$ObjectRef;
                    reviewActivityMultiAndClozeFragment$setupUi$1.f29912k = 4;
                    objM14360a = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$22Mo9555B, reviewActivityMultiAndClozeFragment$setupUi$1);
                    if (objM14360a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    reviewActivityMultiAndClozeFragment = this;
                    str6 = (String) objM14360a;
                    iHashCode4 = str6.hashCode();
                    if (iHashCode4 != -702078272) {
                        if (iHashCode4 != 79183) {
                            if (iHashCode4 == 566114168) {
                                lessonStudyTransliteration8 = c7374a2.f41155n;
                                if (lessonStudyTransliteration8 != null) {
                                    t17 = lessonStudyTransliteration8.f21911e;
                                } else {
                                    t17 = 0;
                                }
                                ref$ObjectRef.f38127a = t17;
                            }
                        } else if (str6.equals("Off")) {
                            ref$ObjectRef.f38127a = "";
                        }
                    } else if (str6.equals("Jyutping")) {
                        lessonStudyTransliteration7 = c7374a2.f41155n;
                        if (lessonStudyTransliteration7 != null) {
                            t16 = lessonStudyTransliteration7.f21912f;
                        } else {
                            t16 = 0;
                        }
                        ref$ObjectRef.f38127a = t16;
                    }
                } else {
                    ref$ObjectRef.f38127a = "";
                    reviewActivityMultiAndClozeFragment = this;
                }
                C8311k1 c8311k1M10273n0 = reviewActivityMultiAndClozeFragment.m10273n0();
                TextView textView6 = c8311k1M10273n0.f44951d;
                viewArr = reviewActivityMultiAndClozeFragment.f29877E0;
                viewArr[0] = textView6;
                TextView textView7 = c8311k1M10273n0.f44953f;
                viewArr[1] = textView7;
                TextView textView8 = c8311k1M10273n0.f44955h;
                viewArr[2] = textView8;
                TextView textView9 = c8311k1M10273n0.f44952e;
                viewArr[3] = textView9;
                textViewArr = reviewActivityMultiAndClozeFragment.f29876D0;
                textViewArr[0] = textView6;
                textViewArr[1] = textView7;
                textViewArr[2] = textView8;
                textViewArr[3] = textView9;
                arrayList = new ArrayList();
                ref$ObjectRef2 = new Ref$ObjectRef();
                ref$ObjectRef2.f38127a = "";
                z10 = abstractC9953a2 instanceof AbstractC9953a.a;
                textView = c8311k1M10273n0.f44950c;
                textView2 = c8311k1M10273n0.f44949b;
                textView3 = c8311k1M10273n0.f44954g;
                imageButton = c8311k1M10273n0.f44948a;
                if (!z10) {
                    if (abstractC9953a2 instanceof AbstractC9953a.g) {
                        textView3.setText(C4924a.m10454d(c7374a2.f41142a));
                        textView2.setText((CharSequence) ref$ObjectRef.f38127a);
                        AbstractC9953a.g gVar = (AbstractC9953a.g) abstractC9953a2;
                        arrayList.addAll(gVar.f50646c);
                        ref$ObjectRef2.f38127a = gVar.f50645b;
                        if (!reviewActivityMultiAndClozeFragment.f29878F0) {
                            InterfaceC3275c.a.m9347b(reviewActivityMultiAndClozeFragment.m10274o0(), reviewActivityMultiAndClozeFragment.m10274o0().mo498E1(), c7374a2.f41142a, true, 0.0f, 8);
                            reviewActivityMultiAndClozeFragment.f29878F0 = true;
                        }
                        imageButton.setOnClickListener(new ViewOnClickListenerC9466e(reviewActivityMultiAndClozeFragment, 15, c7374a2));
                        C4924a.m10457e0(imageButton);
                        textView.setText(reviewActivityMultiAndClozeFragment.m3600t(R.string.activities_select_meaning));
                    } else if (abstractC9953a2 instanceof AbstractC9953a.h) {
                        i10 = 0;
                        tokenMeaning = (TokenMeaning) C6752c.m13426T(0, c7374a2.f41146e);
                        if (tokenMeaning != null) {
                            strM10454d = "";
                        } else {
                            strM10454d = "";
                        }
                        textView3.setText(strM10454d);
                        textView2.setText("");
                        AbstractC9953a.h hVar = (AbstractC9953a.h) abstractC9953a2;
                        arrayList.addAll(hVar.f50649c);
                        ref$ObjectRef2.f38127a = hVar.f50648b;
                        C5207g.m11110e(imageButton, "btnTts");
                        C4924a.m10422A(imageButton);
                        textView.setText(reviewActivityMultiAndClozeFragment.m3600t(R.string.activities_select_meaning_match));
                    } else {
                        i10 = 0;
                        if (abstractC9953a2 instanceof AbstractC9953a.b) {
                            textView3.setText("");
                            textView2.setText("");
                            AbstractC9953a.b bVar = (AbstractC9953a.b) abstractC9953a2;
                            arrayList.addAll(bVar.f50637c);
                            ref$ObjectRef2.f38127a = bVar.f50636b;
                            if (!reviewActivityMultiAndClozeFragment.f29878F0) {
                                InterfaceC3275c.a.m9347b(reviewActivityMultiAndClozeFragment.m10274o0(), reviewActivityMultiAndClozeFragment.m10274o0().mo498E1(), c7374a2.f41142a, true, 0.0f, 8);
                                reviewActivityMultiAndClozeFragment.f29878F0 = true;
                            }
                            imageButton.setOnClickListener(new ViewOnClickListenerC9029m(reviewActivityMultiAndClozeFragment, 17, c7374a2));
                            C4924a.m10457e0(imageButton);
                            textView.setText(reviewActivityMultiAndClozeFragment.m3600t(R.string.activities_select_word_hear));
                        } else if (abstractC9953a2 instanceof AbstractC9953a.c) {
                            textView3.setText("");
                            textView2.setText("");
                            AbstractC9953a.c cVar = (AbstractC9953a.c) abstractC9953a2;
                            arrayList.addAll(cVar.f50640c);
                            ref$ObjectRef2.f38127a = cVar.f50639b;
                            if (!reviewActivityMultiAndClozeFragment.f29878F0) {
                                InterfaceC3275c.a.m9347b(reviewActivityMultiAndClozeFragment.m10274o0(), reviewActivityMultiAndClozeFragment.m10274o0().mo498E1(), c7374a2.f41142a, true, 0.0f, 8);
                                reviewActivityMultiAndClozeFragment.f29878F0 = true;
                            }
                            imageButton.setOnClickListener(new ViewOnClickListenerC9734i(reviewActivityMultiAndClozeFragment, 14, c7374a2));
                            C4924a.m10457e0(imageButton);
                            textView.setText(reviewActivityMultiAndClozeFragment.m3600t(R.string.activities_select_word_meaning_hear));
                        }
                    }
                    it = arrayList.iterator();
                    while (true) {
                        i11 = i10;
                        if (it.hasNext()) {
                            break;
                            break;
                        }
                        next = it.next();
                        i10 = i11 + 1;
                        if (i11 >= 0) {
                            C9000b.m17257w();
                            throw null;
                        }
                        str5 = (String) next;
                        if (C5207g.m11106a(str5, "")) {
                            view = viewArr[i11];
                            if (view == null) {
                                view.setVisibility(4);
                            }
                        } else {
                            textView4 = textViewArr[i11];
                            if (textView4 != null) {
                                textView4.setText(str5);
                            }
                            textView5 = textViewArr[i11];
                            if (textView5 != null) {
                                final ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment2 = reviewActivityMultiAndClozeFragment;
                                textView5.setOnClickListener(new View.OnClickListener() { // from class: vj.i
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        int i14;
                                        InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewActivityMultiAndClozeFragment.f29872H0;
                                        List list3 = arrayList;
                                        C5207g.m11111f(list3, "$answers");
                                        ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment3 = reviewActivityMultiAndClozeFragment2;
                                        C5207g.m11111f(reviewActivityMultiAndClozeFragment3, "this$0");
                                        String str7 = str5;
                                        C5207g.m11111f(str7, "$answer");
                                        Ref$ObjectRef ref$ObjectRef3 = ref$ObjectRef2;
                                        C5207g.m11111f(ref$ObjectRef3, "$correctAnswer");
                                        int size = list3.size();
                                        int i15 = 0;
                                        while (true) {
                                            i14 = i11;
                                            if (i15 >= size) {
                                                break;
                                            }
                                            TextView[] textViewArr2 = reviewActivityMultiAndClozeFragment3.f29876D0;
                                            if (i15 == i14) {
                                                TextView textView10 = textViewArr2[i15];
                                                if (textView10 != null) {
                                                    Boolean boolValueOf = Boolean.valueOf(textView10.isSelected());
                                                    C5207g.m11108c(boolValueOf);
                                                    textView10.setSelected(!boolValueOf.booleanValue());
                                                }
                                            } else {
                                                TextView textView11 = textViewArr2[i15];
                                                if (textView11 != null) {
                                                    textView11.setSelected(false);
                                                }
                                            }
                                            i15++;
                                        }
                                        ((ReviewViewModel) reviewActivityMultiAndClozeFragment3.f29875C0.getValue()).f29663m0.mo14371k(new C9954b((String) list3.get(i14), C5207g.m11106a(str7, ref$ObjectRef3.f38127a) ? ReviewActivityResult.Correct : ReviewActivityResult.Incorrect));
                                    }
                                });
                            }
                        }
                    }
                } else {
                    if (c7562b2 != null) {
                        strM10454d2 = null;
                    } else {
                        strM10454d2 = null;
                    }
                    textView3.setText(strM10454d2);
                    textView2.setText("");
                    if (c7562b2 != null) {
                        list = c7562b2.f41678c;
                        if (!list.isEmpty()) {
                            int iMo12968d = Random.f38128a.mo12968d(0, list.size());
                            arrayList.addAll(list);
                            AbstractC9953a.a aVar = (AbstractC9953a.a) abstractC9953a2;
                            arrayList.add(iMo12968d, aVar.f50634b);
                            ref$ObjectRef2.f38127a = aVar.f50634b;
                        }
                        imageButton.setOnClickListener(new ViewOnClickListenerC6464i(reviewActivityMultiAndClozeFragment, 19, c7562b2));
                        if (C5207g.m11106a(reviewActivityMultiAndClozeFragment.m10274o0().f30156N.getValue(), Boolean.TRUE)) {
                            C4924a.m10457e0(imageButton);
                        } else {
                            C4924a.m10442U(imageButton);
                        }
                        textView.setText(reviewActivityMultiAndClozeFragment.m3600t(R.string.activities_select_missing_word));
                    }
                }
                i10 = 0;
                it = arrayList.iterator();
                while (true) {
                    i11 = i10;
                    if (it.hasNext()) {
                        break;
                        break;
                    }
                    next = it.next();
                    i10 = i11 + 1;
                    if (i11 >= 0) {
                        C9000b.m17257w();
                        throw null;
                    }
                    str5 = (String) next;
                    if (C5207g.m11106a(str5, "")) {
                        textView4 = textViewArr[i11];
                        if (textView4 != null) {
                            textView4.setText(str5);
                        }
                        textView5 = textViewArr[i11];
                        if (textView5 != null) {
                            final ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment3 = reviewActivityMultiAndClozeFragment;
                            textView5.setOnClickListener(new View.OnClickListener() { // from class: vj.i
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    int i14;
                                    InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewActivityMultiAndClozeFragment.f29872H0;
                                    List list3 = arrayList;
                                    C5207g.m11111f(list3, "$answers");
                                    ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment4 = reviewActivityMultiAndClozeFragment3;
                                    C5207g.m11111f(reviewActivityMultiAndClozeFragment4, "this$0");
                                    String str7 = str5;
                                    C5207g.m11111f(str7, "$answer");
                                    Ref$ObjectRef ref$ObjectRef3 = ref$ObjectRef2;
                                    C5207g.m11111f(ref$ObjectRef3, "$correctAnswer");
                                    int size = list3.size();
                                    int i15 = 0;
                                    while (true) {
                                        i14 = i11;
                                        if (i15 >= size) {
                                            break;
                                        }
                                        TextView[] textViewArr2 = reviewActivityMultiAndClozeFragment4.f29876D0;
                                        if (i15 == i14) {
                                            TextView textView10 = textViewArr2[i15];
                                            if (textView10 != null) {
                                                Boolean boolValueOf = Boolean.valueOf(textView10.isSelected());
                                                C5207g.m11108c(boolValueOf);
                                                textView10.setSelected(!boolValueOf.booleanValue());
                                            }
                                        } else {
                                            TextView textView11 = textViewArr2[i15];
                                            if (textView11 != null) {
                                                textView11.setSelected(false);
                                            }
                                        }
                                        i15++;
                                    }
                                    ((ReviewViewModel) reviewActivityMultiAndClozeFragment4.f29875C0.getValue()).f29663m0.mo14371k(new C9954b((String) list3.get(i14), C5207g.m11106a(str7, ref$ObjectRef3.f38127a) ? ReviewActivityResult.Correct : ReviewActivityResult.Incorrect));
                                }
                            });
                        }
                    } else {
                        view = viewArr[i11];
                        if (view == null) {
                            view.setVisibility(4);
                        }
                    }
                }
            }
        } else if (i13 == 1) {
            Ref$ObjectRef ref$ObjectRef3 = reviewActivityMultiAndClozeFragment$setupUi$1.f29909h;
            C7562b c7562b3 = reviewActivityMultiAndClozeFragment$setupUi$1.f29908g;
            AbstractC9953a abstractC9953a3 = reviewActivityMultiAndClozeFragment$setupUi$1.f29907f;
            C7374a c7374a3 = reviewActivityMultiAndClozeFragment$setupUi$1.f29906e;
            ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment4 = reviewActivityMultiAndClozeFragment$setupUi$1.f29905d;
            C7499b.m14977z0(obj);
            ref$ObjectRef = ref$ObjectRef3;
            c7374a2 = c7374a3;
            reviewActivityMultiAndClozeFragment = reviewActivityMultiAndClozeFragment4;
            objM14360a4 = obj;
            c7562b2 = c7562b3;
            abstractC9953a2 = abstractC9953a3;
            str = (String) objM14360a4;
            iHashCode = str.hashCode();
            if (iHashCode != -1904268855) {
                if (iHashCode != -469838457) {
                    if (iHashCode == 79183 && str.equals("Off")) {
                        ref$ObjectRef.f38127a = "";
                    }
                } else if (str.equals("Traditional")) {
                    lessonStudyTransliteration2 = c7374a2.f41155n;
                    if (lessonStudyTransliteration2 != null) {
                        t11 = lessonStudyTransliteration2.f21910d;
                    } else {
                        t11 = 0;
                    }
                    ref$ObjectRef.f38127a = t11;
                }
            } else if (str.equals("Pinyin")) {
                lessonStudyTransliteration = c7374a2.f41155n;
                if (lessonStudyTransliteration != null) {
                    t10 = lessonStudyTransliteration.f21909c;
                } else {
                    t10 = 0;
                }
                ref$ObjectRef.f38127a = t10;
            }
            C8311k1 c8311k1M10273n1 = reviewActivityMultiAndClozeFragment.m10273n0();
            TextView textView10 = c8311k1M10273n1.f44951d;
            viewArr = reviewActivityMultiAndClozeFragment.f29877E0;
            viewArr[0] = textView10;
            TextView textView11 = c8311k1M10273n1.f44953f;
            viewArr[1] = textView11;
            TextView textView12 = c8311k1M10273n1.f44955h;
            viewArr[2] = textView12;
            TextView textView13 = c8311k1M10273n1.f44952e;
            viewArr[3] = textView13;
            textViewArr = reviewActivityMultiAndClozeFragment.f29876D0;
            textViewArr[0] = textView10;
            textViewArr[1] = textView11;
            textViewArr[2] = textView12;
            textViewArr[3] = textView13;
            arrayList = new ArrayList();
            ref$ObjectRef2 = new Ref$ObjectRef();
            ref$ObjectRef2.f38127a = "";
            z10 = abstractC9953a2 instanceof AbstractC9953a.a;
            textView = c8311k1M10273n1.f44950c;
            textView2 = c8311k1M10273n1.f44949b;
            textView3 = c8311k1M10273n1.f44954g;
            imageButton = c8311k1M10273n1.f44948a;
            if (!z10) {
                if (abstractC9953a2 instanceof AbstractC9953a.g) {
                    textView3.setText(C4924a.m10454d(c7374a2.f41142a));
                    textView2.setText((CharSequence) ref$ObjectRef.f38127a);
                    AbstractC9953a.g gVar2 = (AbstractC9953a.g) abstractC9953a2;
                    arrayList.addAll(gVar2.f50646c);
                    ref$ObjectRef2.f38127a = gVar2.f50645b;
                    if (!reviewActivityMultiAndClozeFragment.f29878F0) {
                        InterfaceC3275c.a.m9347b(reviewActivityMultiAndClozeFragment.m10274o0(), reviewActivityMultiAndClozeFragment.m10274o0().mo498E1(), c7374a2.f41142a, true, 0.0f, 8);
                        reviewActivityMultiAndClozeFragment.f29878F0 = true;
                    }
                    imageButton.setOnClickListener(new ViewOnClickListenerC9466e(reviewActivityMultiAndClozeFragment, 15, c7374a2));
                    C4924a.m10457e0(imageButton);
                    textView.setText(reviewActivityMultiAndClozeFragment.m3600t(R.string.activities_select_meaning));
                } else if (abstractC9953a2 instanceof AbstractC9953a.h) {
                    i10 = 0;
                    tokenMeaning = (TokenMeaning) C6752c.m13426T(0, c7374a2.f41146e);
                    if (tokenMeaning != null) {
                        strM10454d = "";
                    } else {
                        strM10454d = "";
                    }
                    textView3.setText(strM10454d);
                    textView2.setText("");
                    AbstractC9953a.h hVar2 = (AbstractC9953a.h) abstractC9953a2;
                    arrayList.addAll(hVar2.f50649c);
                    ref$ObjectRef2.f38127a = hVar2.f50648b;
                    C5207g.m11110e(imageButton, "btnTts");
                    C4924a.m10422A(imageButton);
                    textView.setText(reviewActivityMultiAndClozeFragment.m3600t(R.string.activities_select_meaning_match));
                } else {
                    i10 = 0;
                    if (abstractC9953a2 instanceof AbstractC9953a.b) {
                        textView3.setText("");
                        textView2.setText("");
                        AbstractC9953a.b bVar2 = (AbstractC9953a.b) abstractC9953a2;
                        arrayList.addAll(bVar2.f50637c);
                        ref$ObjectRef2.f38127a = bVar2.f50636b;
                        if (!reviewActivityMultiAndClozeFragment.f29878F0) {
                            InterfaceC3275c.a.m9347b(reviewActivityMultiAndClozeFragment.m10274o0(), reviewActivityMultiAndClozeFragment.m10274o0().mo498E1(), c7374a2.f41142a, true, 0.0f, 8);
                            reviewActivityMultiAndClozeFragment.f29878F0 = true;
                        }
                        imageButton.setOnClickListener(new ViewOnClickListenerC9029m(reviewActivityMultiAndClozeFragment, 17, c7374a2));
                        C4924a.m10457e0(imageButton);
                        textView.setText(reviewActivityMultiAndClozeFragment.m3600t(R.string.activities_select_word_hear));
                    } else if (abstractC9953a2 instanceof AbstractC9953a.c) {
                        textView3.setText("");
                        textView2.setText("");
                        AbstractC9953a.c cVar2 = (AbstractC9953a.c) abstractC9953a2;
                        arrayList.addAll(cVar2.f50640c);
                        ref$ObjectRef2.f38127a = cVar2.f50639b;
                        if (!reviewActivityMultiAndClozeFragment.f29878F0) {
                            InterfaceC3275c.a.m9347b(reviewActivityMultiAndClozeFragment.m10274o0(), reviewActivityMultiAndClozeFragment.m10274o0().mo498E1(), c7374a2.f41142a, true, 0.0f, 8);
                            reviewActivityMultiAndClozeFragment.f29878F0 = true;
                        }
                        imageButton.setOnClickListener(new ViewOnClickListenerC9734i(reviewActivityMultiAndClozeFragment, 14, c7374a2));
                        C4924a.m10457e0(imageButton);
                        textView.setText(reviewActivityMultiAndClozeFragment.m3600t(R.string.activities_select_word_meaning_hear));
                    }
                }
                it = arrayList.iterator();
                while (true) {
                    i11 = i10;
                    if (it.hasNext()) {
                        break;
                        break;
                    }
                    next = it.next();
                    i10 = i11 + 1;
                    if (i11 >= 0) {
                        C9000b.m17257w();
                        throw null;
                    }
                    str5 = (String) next;
                    if (C5207g.m11106a(str5, "")) {
                        textView4 = textViewArr[i11];
                        if (textView4 != null) {
                            textView4.setText(str5);
                        }
                        textView5 = textViewArr[i11];
                        if (textView5 != null) {
                            final ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment5 = reviewActivityMultiAndClozeFragment;
                            textView5.setOnClickListener(new View.OnClickListener() { // from class: vj.i
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    int i14;
                                    InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewActivityMultiAndClozeFragment.f29872H0;
                                    List list3 = arrayList;
                                    C5207g.m11111f(list3, "$answers");
                                    ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment6 = reviewActivityMultiAndClozeFragment5;
                                    C5207g.m11111f(reviewActivityMultiAndClozeFragment6, "this$0");
                                    String str7 = str5;
                                    C5207g.m11111f(str7, "$answer");
                                    Ref$ObjectRef ref$ObjectRef4 = ref$ObjectRef2;
                                    C5207g.m11111f(ref$ObjectRef4, "$correctAnswer");
                                    int size = list3.size();
                                    int i15 = 0;
                                    while (true) {
                                        i14 = i11;
                                        if (i15 >= size) {
                                            break;
                                        }
                                        TextView[] textViewArr2 = reviewActivityMultiAndClozeFragment6.f29876D0;
                                        if (i15 == i14) {
                                            TextView textView14 = textViewArr2[i15];
                                            if (textView14 != null) {
                                                Boolean boolValueOf = Boolean.valueOf(textView14.isSelected());
                                                C5207g.m11108c(boolValueOf);
                                                textView14.setSelected(!boolValueOf.booleanValue());
                                            }
                                        } else {
                                            TextView textView15 = textViewArr2[i15];
                                            if (textView15 != null) {
                                                textView15.setSelected(false);
                                            }
                                        }
                                        i15++;
                                    }
                                    ((ReviewViewModel) reviewActivityMultiAndClozeFragment6.f29875C0.getValue()).f29663m0.mo14371k(new C9954b((String) list3.get(i14), C5207g.m11106a(str7, ref$ObjectRef4.f38127a) ? ReviewActivityResult.Correct : ReviewActivityResult.Incorrect));
                                }
                            });
                        }
                    } else {
                        view = viewArr[i11];
                        if (view == null) {
                            view.setVisibility(4);
                        }
                    }
                }
            } else {
                if (c7562b2 != null) {
                    strM10454d2 = null;
                } else {
                    strM10454d2 = null;
                }
                textView3.setText(strM10454d2);
                textView2.setText("");
                if (c7562b2 != null) {
                    list = c7562b2.f41678c;
                    if (!list.isEmpty()) {
                        int iMo12968d2 = Random.f38128a.mo12968d(0, list.size());
                        arrayList.addAll(list);
                        AbstractC9953a.a aVar2 = (AbstractC9953a.a) abstractC9953a2;
                        arrayList.add(iMo12968d2, aVar2.f50634b);
                        ref$ObjectRef2.f38127a = aVar2.f50634b;
                    }
                    imageButton.setOnClickListener(new ViewOnClickListenerC6464i(reviewActivityMultiAndClozeFragment, 19, c7562b2));
                    if (C5207g.m11106a(reviewActivityMultiAndClozeFragment.m10274o0().f30156N.getValue(), Boolean.TRUE)) {
                        C4924a.m10457e0(imageButton);
                    } else {
                        C4924a.m10442U(imageButton);
                    }
                    textView.setText(reviewActivityMultiAndClozeFragment.m3600t(R.string.activities_select_missing_word));
                }
            }
            i10 = 0;
            it = arrayList.iterator();
            while (true) {
                i11 = i10;
                if (it.hasNext()) {
                    break;
                    break;
                }
                next = it.next();
                i10 = i11 + 1;
                if (i11 >= 0) {
                    C9000b.m17257w();
                    throw null;
                }
                str5 = (String) next;
                if (C5207g.m11106a(str5, "")) {
                    textView4 = textViewArr[i11];
                    if (textView4 != null) {
                        textView4.setText(str5);
                    }
                    textView5 = textViewArr[i11];
                    if (textView5 != null) {
                        final ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment6 = reviewActivityMultiAndClozeFragment;
                        textView5.setOnClickListener(new View.OnClickListener() { // from class: vj.i
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                int i14;
                                InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewActivityMultiAndClozeFragment.f29872H0;
                                List list3 = arrayList;
                                C5207g.m11111f(list3, "$answers");
                                ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment7 = reviewActivityMultiAndClozeFragment6;
                                C5207g.m11111f(reviewActivityMultiAndClozeFragment7, "this$0");
                                String str7 = str5;
                                C5207g.m11111f(str7, "$answer");
                                Ref$ObjectRef ref$ObjectRef4 = ref$ObjectRef2;
                                C5207g.m11111f(ref$ObjectRef4, "$correctAnswer");
                                int size = list3.size();
                                int i15 = 0;
                                while (true) {
                                    i14 = i11;
                                    if (i15 >= size) {
                                        break;
                                    }
                                    TextView[] textViewArr2 = reviewActivityMultiAndClozeFragment7.f29876D0;
                                    if (i15 == i14) {
                                        TextView textView14 = textViewArr2[i15];
                                        if (textView14 != null) {
                                            Boolean boolValueOf = Boolean.valueOf(textView14.isSelected());
                                            C5207g.m11108c(boolValueOf);
                                            textView14.setSelected(!boolValueOf.booleanValue());
                                        }
                                    } else {
                                        TextView textView15 = textViewArr2[i15];
                                        if (textView15 != null) {
                                            textView15.setSelected(false);
                                        }
                                    }
                                    i15++;
                                }
                                ((ReviewViewModel) reviewActivityMultiAndClozeFragment7.f29875C0.getValue()).f29663m0.mo14371k(new C9954b((String) list3.get(i14), C5207g.m11106a(str7, ref$ObjectRef4.f38127a) ? ReviewActivityResult.Correct : ReviewActivityResult.Incorrect));
                            }
                        });
                    }
                } else {
                    view = viewArr[i11];
                    if (view == null) {
                        view.setVisibility(4);
                    }
                }
            }
        } else if (i13 == 2) {
            Ref$ObjectRef ref$ObjectRef4 = reviewActivityMultiAndClozeFragment$setupUi$1.f29909h;
            C7562b c7562b4 = reviewActivityMultiAndClozeFragment$setupUi$1.f29908g;
            AbstractC9953a abstractC9953a4 = reviewActivityMultiAndClozeFragment$setupUi$1.f29907f;
            C7374a c7374a4 = reviewActivityMultiAndClozeFragment$setupUi$1.f29906e;
            ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment7 = reviewActivityMultiAndClozeFragment$setupUi$1.f29905d;
            C7499b.m14977z0(obj);
            ref$ObjectRef = ref$ObjectRef4;
            c7374a2 = c7374a4;
            reviewActivityMultiAndClozeFragment = reviewActivityMultiAndClozeFragment7;
            objM14360a3 = obj;
            c7562b2 = c7562b4;
            abstractC9953a2 = abstractC9953a4;
            str2 = (String) objM14360a3;
            iHashCode2 = str2.hashCode();
            if (iHashCode2 != -1904268855) {
                if (iHashCode2 != 79183) {
                    if (iHashCode2 == 566114168 && str2.equals("Simplified")) {
                        lessonStudyTransliteration4 = c7374a2.f41155n;
                        if (lessonStudyTransliteration4 != null) {
                            t13 = lessonStudyTransliteration4.f21911e;
                        } else {
                            t13 = 0;
                        }
                        ref$ObjectRef.f38127a = t13;
                    }
                } else if (str2.equals("Off")) {
                    ref$ObjectRef.f38127a = "";
                }
            } else if (str2.equals("Pinyin")) {
                lessonStudyTransliteration3 = c7374a2.f41155n;
                if (lessonStudyTransliteration3 != null) {
                    t12 = lessonStudyTransliteration3.f21909c;
                } else {
                    t12 = 0;
                }
                ref$ObjectRef.f38127a = t12;
            }
            C8311k1 c8311k1M10273n2 = reviewActivityMultiAndClozeFragment.m10273n0();
            TextView textView14 = c8311k1M10273n2.f44951d;
            viewArr = reviewActivityMultiAndClozeFragment.f29877E0;
            viewArr[0] = textView14;
            TextView textView15 = c8311k1M10273n2.f44953f;
            viewArr[1] = textView15;
            TextView textView16 = c8311k1M10273n2.f44955h;
            viewArr[2] = textView16;
            TextView textView17 = c8311k1M10273n2.f44952e;
            viewArr[3] = textView17;
            textViewArr = reviewActivityMultiAndClozeFragment.f29876D0;
            textViewArr[0] = textView14;
            textViewArr[1] = textView15;
            textViewArr[2] = textView16;
            textViewArr[3] = textView17;
            arrayList = new ArrayList();
            ref$ObjectRef2 = new Ref$ObjectRef();
            ref$ObjectRef2.f38127a = "";
            z10 = abstractC9953a2 instanceof AbstractC9953a.a;
            textView = c8311k1M10273n2.f44950c;
            textView2 = c8311k1M10273n2.f44949b;
            textView3 = c8311k1M10273n2.f44954g;
            imageButton = c8311k1M10273n2.f44948a;
            if (!z10) {
                if (abstractC9953a2 instanceof AbstractC9953a.g) {
                    textView3.setText(C4924a.m10454d(c7374a2.f41142a));
                    textView2.setText((CharSequence) ref$ObjectRef.f38127a);
                    AbstractC9953a.g gVar3 = (AbstractC9953a.g) abstractC9953a2;
                    arrayList.addAll(gVar3.f50646c);
                    ref$ObjectRef2.f38127a = gVar3.f50645b;
                    if (!reviewActivityMultiAndClozeFragment.f29878F0) {
                        InterfaceC3275c.a.m9347b(reviewActivityMultiAndClozeFragment.m10274o0(), reviewActivityMultiAndClozeFragment.m10274o0().mo498E1(), c7374a2.f41142a, true, 0.0f, 8);
                        reviewActivityMultiAndClozeFragment.f29878F0 = true;
                    }
                    imageButton.setOnClickListener(new ViewOnClickListenerC9466e(reviewActivityMultiAndClozeFragment, 15, c7374a2));
                    C4924a.m10457e0(imageButton);
                    textView.setText(reviewActivityMultiAndClozeFragment.m3600t(R.string.activities_select_meaning));
                } else if (abstractC9953a2 instanceof AbstractC9953a.h) {
                    i10 = 0;
                    tokenMeaning = (TokenMeaning) C6752c.m13426T(0, c7374a2.f41146e);
                    if (tokenMeaning != null) {
                        strM10454d = "";
                    } else {
                        strM10454d = "";
                    }
                    textView3.setText(strM10454d);
                    textView2.setText("");
                    AbstractC9953a.h hVar3 = (AbstractC9953a.h) abstractC9953a2;
                    arrayList.addAll(hVar3.f50649c);
                    ref$ObjectRef2.f38127a = hVar3.f50648b;
                    C5207g.m11110e(imageButton, "btnTts");
                    C4924a.m10422A(imageButton);
                    textView.setText(reviewActivityMultiAndClozeFragment.m3600t(R.string.activities_select_meaning_match));
                } else {
                    i10 = 0;
                    if (abstractC9953a2 instanceof AbstractC9953a.b) {
                        textView3.setText("");
                        textView2.setText("");
                        AbstractC9953a.b bVar3 = (AbstractC9953a.b) abstractC9953a2;
                        arrayList.addAll(bVar3.f50637c);
                        ref$ObjectRef2.f38127a = bVar3.f50636b;
                        if (!reviewActivityMultiAndClozeFragment.f29878F0) {
                            InterfaceC3275c.a.m9347b(reviewActivityMultiAndClozeFragment.m10274o0(), reviewActivityMultiAndClozeFragment.m10274o0().mo498E1(), c7374a2.f41142a, true, 0.0f, 8);
                            reviewActivityMultiAndClozeFragment.f29878F0 = true;
                        }
                        imageButton.setOnClickListener(new ViewOnClickListenerC9029m(reviewActivityMultiAndClozeFragment, 17, c7374a2));
                        C4924a.m10457e0(imageButton);
                        textView.setText(reviewActivityMultiAndClozeFragment.m3600t(R.string.activities_select_word_hear));
                    } else if (abstractC9953a2 instanceof AbstractC9953a.c) {
                        textView3.setText("");
                        textView2.setText("");
                        AbstractC9953a.c cVar3 = (AbstractC9953a.c) abstractC9953a2;
                        arrayList.addAll(cVar3.f50640c);
                        ref$ObjectRef2.f38127a = cVar3.f50639b;
                        if (!reviewActivityMultiAndClozeFragment.f29878F0) {
                            InterfaceC3275c.a.m9347b(reviewActivityMultiAndClozeFragment.m10274o0(), reviewActivityMultiAndClozeFragment.m10274o0().mo498E1(), c7374a2.f41142a, true, 0.0f, 8);
                            reviewActivityMultiAndClozeFragment.f29878F0 = true;
                        }
                        imageButton.setOnClickListener(new ViewOnClickListenerC9734i(reviewActivityMultiAndClozeFragment, 14, c7374a2));
                        C4924a.m10457e0(imageButton);
                        textView.setText(reviewActivityMultiAndClozeFragment.m3600t(R.string.activities_select_word_meaning_hear));
                    }
                }
                it = arrayList.iterator();
                while (true) {
                    i11 = i10;
                    if (it.hasNext()) {
                        break;
                        break;
                    }
                    next = it.next();
                    i10 = i11 + 1;
                    if (i11 >= 0) {
                        C9000b.m17257w();
                        throw null;
                    }
                    str5 = (String) next;
                    if (C5207g.m11106a(str5, "")) {
                        textView4 = textViewArr[i11];
                        if (textView4 != null) {
                            textView4.setText(str5);
                        }
                        textView5 = textViewArr[i11];
                        if (textView5 != null) {
                            final ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment8 = reviewActivityMultiAndClozeFragment;
                            textView5.setOnClickListener(new View.OnClickListener() { // from class: vj.i
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    int i14;
                                    InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewActivityMultiAndClozeFragment.f29872H0;
                                    List list3 = arrayList;
                                    C5207g.m11111f(list3, "$answers");
                                    ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment9 = reviewActivityMultiAndClozeFragment8;
                                    C5207g.m11111f(reviewActivityMultiAndClozeFragment9, "this$0");
                                    String str7 = str5;
                                    C5207g.m11111f(str7, "$answer");
                                    Ref$ObjectRef ref$ObjectRef5 = ref$ObjectRef2;
                                    C5207g.m11111f(ref$ObjectRef5, "$correctAnswer");
                                    int size = list3.size();
                                    int i15 = 0;
                                    while (true) {
                                        i14 = i11;
                                        if (i15 >= size) {
                                            break;
                                        }
                                        TextView[] textViewArr2 = reviewActivityMultiAndClozeFragment9.f29876D0;
                                        if (i15 == i14) {
                                            TextView textView18 = textViewArr2[i15];
                                            if (textView18 != null) {
                                                Boolean boolValueOf = Boolean.valueOf(textView18.isSelected());
                                                C5207g.m11108c(boolValueOf);
                                                textView18.setSelected(!boolValueOf.booleanValue());
                                            }
                                        } else {
                                            TextView textView19 = textViewArr2[i15];
                                            if (textView19 != null) {
                                                textView19.setSelected(false);
                                            }
                                        }
                                        i15++;
                                    }
                                    ((ReviewViewModel) reviewActivityMultiAndClozeFragment9.f29875C0.getValue()).f29663m0.mo14371k(new C9954b((String) list3.get(i14), C5207g.m11106a(str7, ref$ObjectRef5.f38127a) ? ReviewActivityResult.Correct : ReviewActivityResult.Incorrect));
                                }
                            });
                        }
                    } else {
                        view = viewArr[i11];
                        if (view == null) {
                            view.setVisibility(4);
                        }
                    }
                }
            } else {
                if (c7562b2 != null) {
                    strM10454d2 = null;
                } else {
                    strM10454d2 = null;
                }
                textView3.setText(strM10454d2);
                textView2.setText("");
                if (c7562b2 != null) {
                    list = c7562b2.f41678c;
                    if (!list.isEmpty()) {
                        int iMo12968d3 = Random.f38128a.mo12968d(0, list.size());
                        arrayList.addAll(list);
                        AbstractC9953a.a aVar3 = (AbstractC9953a.a) abstractC9953a2;
                        arrayList.add(iMo12968d3, aVar3.f50634b);
                        ref$ObjectRef2.f38127a = aVar3.f50634b;
                    }
                    imageButton.setOnClickListener(new ViewOnClickListenerC6464i(reviewActivityMultiAndClozeFragment, 19, c7562b2));
                    if (C5207g.m11106a(reviewActivityMultiAndClozeFragment.m10274o0().f30156N.getValue(), Boolean.TRUE)) {
                        C4924a.m10457e0(imageButton);
                    } else {
                        C4924a.m10442U(imageButton);
                    }
                    textView.setText(reviewActivityMultiAndClozeFragment.m3600t(R.string.activities_select_missing_word));
                }
            }
            i10 = 0;
            it = arrayList.iterator();
            while (true) {
                i11 = i10;
                if (it.hasNext()) {
                    break;
                    break;
                }
                next = it.next();
                i10 = i11 + 1;
                if (i11 >= 0) {
                    C9000b.m17257w();
                    throw null;
                }
                str5 = (String) next;
                if (C5207g.m11106a(str5, "")) {
                    textView4 = textViewArr[i11];
                    if (textView4 != null) {
                        textView4.setText(str5);
                    }
                    textView5 = textViewArr[i11];
                    if (textView5 != null) {
                        final ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment9 = reviewActivityMultiAndClozeFragment;
                        textView5.setOnClickListener(new View.OnClickListener() { // from class: vj.i
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                int i14;
                                InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewActivityMultiAndClozeFragment.f29872H0;
                                List list3 = arrayList;
                                C5207g.m11111f(list3, "$answers");
                                ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment10 = reviewActivityMultiAndClozeFragment9;
                                C5207g.m11111f(reviewActivityMultiAndClozeFragment10, "this$0");
                                String str7 = str5;
                                C5207g.m11111f(str7, "$answer");
                                Ref$ObjectRef ref$ObjectRef5 = ref$ObjectRef2;
                                C5207g.m11111f(ref$ObjectRef5, "$correctAnswer");
                                int size = list3.size();
                                int i15 = 0;
                                while (true) {
                                    i14 = i11;
                                    if (i15 >= size) {
                                        break;
                                    }
                                    TextView[] textViewArr2 = reviewActivityMultiAndClozeFragment10.f29876D0;
                                    if (i15 == i14) {
                                        TextView textView18 = textViewArr2[i15];
                                        if (textView18 != null) {
                                            Boolean boolValueOf = Boolean.valueOf(textView18.isSelected());
                                            C5207g.m11108c(boolValueOf);
                                            textView18.setSelected(!boolValueOf.booleanValue());
                                        }
                                    } else {
                                        TextView textView19 = textViewArr2[i15];
                                        if (textView19 != null) {
                                            textView19.setSelected(false);
                                        }
                                    }
                                    i15++;
                                }
                                ((ReviewViewModel) reviewActivityMultiAndClozeFragment10.f29875C0.getValue()).f29663m0.mo14371k(new C9954b((String) list3.get(i14), C5207g.m11106a(str7, ref$ObjectRef5.f38127a) ? ReviewActivityResult.Correct : ReviewActivityResult.Incorrect));
                            }
                        });
                    }
                } else {
                    view = viewArr[i11];
                    if (view == null) {
                        view.setVisibility(4);
                    }
                }
            }
        } else if (i13 == 3) {
            Ref$ObjectRef ref$ObjectRef5 = reviewActivityMultiAndClozeFragment$setupUi$1.f29909h;
            C7562b c7562b5 = reviewActivityMultiAndClozeFragment$setupUi$1.f29908g;
            AbstractC9953a abstractC9953a5 = reviewActivityMultiAndClozeFragment$setupUi$1.f29907f;
            C7374a c7374a5 = reviewActivityMultiAndClozeFragment$setupUi$1.f29906e;
            ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment10 = reviewActivityMultiAndClozeFragment$setupUi$1.f29905d;
            C7499b.m14977z0(obj);
            ref$ObjectRef = ref$ObjectRef5;
            c7374a2 = c7374a5;
            reviewActivityMultiAndClozeFragment = reviewActivityMultiAndClozeFragment10;
            objM14360a2 = obj;
            c7562b2 = c7562b5;
            abstractC9953a2 = abstractC9953a5;
            str3 = (String) objM14360a2;
            iHashCode3 = str3.hashCode();
            if (iHashCode3 != -1841522256) {
                if (iHashCode3 != -1311598819) {
                    if (iHashCode3 == 79183 && str3.equals("Off")) {
                        ref$ObjectRef.f38127a = "";
                    }
                } else if (str3.equals("Hiragana")) {
                    lessonStudyTransliteration6 = c7374a2.f41155n;
                    if (lessonStudyTransliteration6 != null) {
                        t15 = lessonStudyTransliteration6.f21907a;
                    } else {
                        t15 = 0;
                    }
                    ref$ObjectRef.f38127a = t15;
                }
            } else if (str3.equals("Romaji")) {
                lessonStudyTransliteration5 = c7374a2.f41155n;
                if (lessonStudyTransliteration5 != null) {
                    t14 = lessonStudyTransliteration5.f21908b;
                } else {
                    t14 = 0;
                }
                ref$ObjectRef.f38127a = t14;
            }
            C8311k1 c8311k1M10273n3 = reviewActivityMultiAndClozeFragment.m10273n0();
            TextView textView18 = c8311k1M10273n3.f44951d;
            viewArr = reviewActivityMultiAndClozeFragment.f29877E0;
            viewArr[0] = textView18;
            TextView textView19 = c8311k1M10273n3.f44953f;
            viewArr[1] = textView19;
            TextView textView110 = c8311k1M10273n3.f44955h;
            viewArr[2] = textView110;
            TextView textView111 = c8311k1M10273n3.f44952e;
            viewArr[3] = textView111;
            textViewArr = reviewActivityMultiAndClozeFragment.f29876D0;
            textViewArr[0] = textView18;
            textViewArr[1] = textView19;
            textViewArr[2] = textView110;
            textViewArr[3] = textView111;
            arrayList = new ArrayList();
            ref$ObjectRef2 = new Ref$ObjectRef();
            ref$ObjectRef2.f38127a = "";
            z10 = abstractC9953a2 instanceof AbstractC9953a.a;
            textView = c8311k1M10273n3.f44950c;
            textView2 = c8311k1M10273n3.f44949b;
            textView3 = c8311k1M10273n3.f44954g;
            imageButton = c8311k1M10273n3.f44948a;
            if (!z10) {
                if (abstractC9953a2 instanceof AbstractC9953a.g) {
                    textView3.setText(C4924a.m10454d(c7374a2.f41142a));
                    textView2.setText((CharSequence) ref$ObjectRef.f38127a);
                    AbstractC9953a.g gVar4 = (AbstractC9953a.g) abstractC9953a2;
                    arrayList.addAll(gVar4.f50646c);
                    ref$ObjectRef2.f38127a = gVar4.f50645b;
                    if (!reviewActivityMultiAndClozeFragment.f29878F0) {
                        InterfaceC3275c.a.m9347b(reviewActivityMultiAndClozeFragment.m10274o0(), reviewActivityMultiAndClozeFragment.m10274o0().mo498E1(), c7374a2.f41142a, true, 0.0f, 8);
                        reviewActivityMultiAndClozeFragment.f29878F0 = true;
                    }
                    imageButton.setOnClickListener(new ViewOnClickListenerC9466e(reviewActivityMultiAndClozeFragment, 15, c7374a2));
                    C4924a.m10457e0(imageButton);
                    textView.setText(reviewActivityMultiAndClozeFragment.m3600t(R.string.activities_select_meaning));
                } else if (abstractC9953a2 instanceof AbstractC9953a.h) {
                    i10 = 0;
                    tokenMeaning = (TokenMeaning) C6752c.m13426T(0, c7374a2.f41146e);
                    if (tokenMeaning != null) {
                        strM10454d = "";
                    } else {
                        strM10454d = "";
                    }
                    textView3.setText(strM10454d);
                    textView2.setText("");
                    AbstractC9953a.h hVar4 = (AbstractC9953a.h) abstractC9953a2;
                    arrayList.addAll(hVar4.f50649c);
                    ref$ObjectRef2.f38127a = hVar4.f50648b;
                    C5207g.m11110e(imageButton, "btnTts");
                    C4924a.m10422A(imageButton);
                    textView.setText(reviewActivityMultiAndClozeFragment.m3600t(R.string.activities_select_meaning_match));
                } else {
                    i10 = 0;
                    if (abstractC9953a2 instanceof AbstractC9953a.b) {
                        textView3.setText("");
                        textView2.setText("");
                        AbstractC9953a.b bVar4 = (AbstractC9953a.b) abstractC9953a2;
                        arrayList.addAll(bVar4.f50637c);
                        ref$ObjectRef2.f38127a = bVar4.f50636b;
                        if (!reviewActivityMultiAndClozeFragment.f29878F0) {
                            InterfaceC3275c.a.m9347b(reviewActivityMultiAndClozeFragment.m10274o0(), reviewActivityMultiAndClozeFragment.m10274o0().mo498E1(), c7374a2.f41142a, true, 0.0f, 8);
                            reviewActivityMultiAndClozeFragment.f29878F0 = true;
                        }
                        imageButton.setOnClickListener(new ViewOnClickListenerC9029m(reviewActivityMultiAndClozeFragment, 17, c7374a2));
                        C4924a.m10457e0(imageButton);
                        textView.setText(reviewActivityMultiAndClozeFragment.m3600t(R.string.activities_select_word_hear));
                    } else if (abstractC9953a2 instanceof AbstractC9953a.c) {
                        textView3.setText("");
                        textView2.setText("");
                        AbstractC9953a.c cVar4 = (AbstractC9953a.c) abstractC9953a2;
                        arrayList.addAll(cVar4.f50640c);
                        ref$ObjectRef2.f38127a = cVar4.f50639b;
                        if (!reviewActivityMultiAndClozeFragment.f29878F0) {
                            InterfaceC3275c.a.m9347b(reviewActivityMultiAndClozeFragment.m10274o0(), reviewActivityMultiAndClozeFragment.m10274o0().mo498E1(), c7374a2.f41142a, true, 0.0f, 8);
                            reviewActivityMultiAndClozeFragment.f29878F0 = true;
                        }
                        imageButton.setOnClickListener(new ViewOnClickListenerC9734i(reviewActivityMultiAndClozeFragment, 14, c7374a2));
                        C4924a.m10457e0(imageButton);
                        textView.setText(reviewActivityMultiAndClozeFragment.m3600t(R.string.activities_select_word_meaning_hear));
                    }
                }
                it = arrayList.iterator();
                while (true) {
                    i11 = i10;
                    if (it.hasNext()) {
                        break;
                        break;
                    }
                    next = it.next();
                    i10 = i11 + 1;
                    if (i11 >= 0) {
                        C9000b.m17257w();
                        throw null;
                    }
                    str5 = (String) next;
                    if (C5207g.m11106a(str5, "")) {
                        textView4 = textViewArr[i11];
                        if (textView4 != null) {
                            textView4.setText(str5);
                        }
                        textView5 = textViewArr[i11];
                        if (textView5 != null) {
                            final ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment11 = reviewActivityMultiAndClozeFragment;
                            textView5.setOnClickListener(new View.OnClickListener() { // from class: vj.i
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    int i14;
                                    InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewActivityMultiAndClozeFragment.f29872H0;
                                    List list3 = arrayList;
                                    C5207g.m11111f(list3, "$answers");
                                    ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment12 = reviewActivityMultiAndClozeFragment11;
                                    C5207g.m11111f(reviewActivityMultiAndClozeFragment12, "this$0");
                                    String str7 = str5;
                                    C5207g.m11111f(str7, "$answer");
                                    Ref$ObjectRef ref$ObjectRef6 = ref$ObjectRef2;
                                    C5207g.m11111f(ref$ObjectRef6, "$correctAnswer");
                                    int size = list3.size();
                                    int i15 = 0;
                                    while (true) {
                                        i14 = i11;
                                        if (i15 >= size) {
                                            break;
                                        }
                                        TextView[] textViewArr2 = reviewActivityMultiAndClozeFragment12.f29876D0;
                                        if (i15 == i14) {
                                            TextView textView112 = textViewArr2[i15];
                                            if (textView112 != null) {
                                                Boolean boolValueOf = Boolean.valueOf(textView112.isSelected());
                                                C5207g.m11108c(boolValueOf);
                                                textView112.setSelected(!boolValueOf.booleanValue());
                                            }
                                        } else {
                                            TextView textView113 = textViewArr2[i15];
                                            if (textView113 != null) {
                                                textView113.setSelected(false);
                                            }
                                        }
                                        i15++;
                                    }
                                    ((ReviewViewModel) reviewActivityMultiAndClozeFragment12.f29875C0.getValue()).f29663m0.mo14371k(new C9954b((String) list3.get(i14), C5207g.m11106a(str7, ref$ObjectRef6.f38127a) ? ReviewActivityResult.Correct : ReviewActivityResult.Incorrect));
                                }
                            });
                        }
                    } else {
                        view = viewArr[i11];
                        if (view == null) {
                            view.setVisibility(4);
                        }
                    }
                }
            } else {
                if (c7562b2 != null) {
                    strM10454d2 = null;
                } else {
                    strM10454d2 = null;
                }
                textView3.setText(strM10454d2);
                textView2.setText("");
                if (c7562b2 != null) {
                    list = c7562b2.f41678c;
                    if (!list.isEmpty()) {
                        int iMo12968d4 = Random.f38128a.mo12968d(0, list.size());
                        arrayList.addAll(list);
                        AbstractC9953a.a aVar4 = (AbstractC9953a.a) abstractC9953a2;
                        arrayList.add(iMo12968d4, aVar4.f50634b);
                        ref$ObjectRef2.f38127a = aVar4.f50634b;
                    }
                    imageButton.setOnClickListener(new ViewOnClickListenerC6464i(reviewActivityMultiAndClozeFragment, 19, c7562b2));
                    if (C5207g.m11106a(reviewActivityMultiAndClozeFragment.m10274o0().f30156N.getValue(), Boolean.TRUE)) {
                        C4924a.m10457e0(imageButton);
                    } else {
                        C4924a.m10442U(imageButton);
                    }
                    textView.setText(reviewActivityMultiAndClozeFragment.m3600t(R.string.activities_select_missing_word));
                }
            }
            i10 = 0;
            it = arrayList.iterator();
            while (true) {
                i11 = i10;
                if (it.hasNext()) {
                    break;
                    break;
                }
                next = it.next();
                i10 = i11 + 1;
                if (i11 >= 0) {
                    C9000b.m17257w();
                    throw null;
                }
                str5 = (String) next;
                if (C5207g.m11106a(str5, "")) {
                    textView4 = textViewArr[i11];
                    if (textView4 != null) {
                        textView4.setText(str5);
                    }
                    textView5 = textViewArr[i11];
                    if (textView5 != null) {
                        final ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment12 = reviewActivityMultiAndClozeFragment;
                        textView5.setOnClickListener(new View.OnClickListener() { // from class: vj.i
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                int i14;
                                InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewActivityMultiAndClozeFragment.f29872H0;
                                List list3 = arrayList;
                                C5207g.m11111f(list3, "$answers");
                                ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment13 = reviewActivityMultiAndClozeFragment12;
                                C5207g.m11111f(reviewActivityMultiAndClozeFragment13, "this$0");
                                String str7 = str5;
                                C5207g.m11111f(str7, "$answer");
                                Ref$ObjectRef ref$ObjectRef6 = ref$ObjectRef2;
                                C5207g.m11111f(ref$ObjectRef6, "$correctAnswer");
                                int size = list3.size();
                                int i15 = 0;
                                while (true) {
                                    i14 = i11;
                                    if (i15 >= size) {
                                        break;
                                    }
                                    TextView[] textViewArr2 = reviewActivityMultiAndClozeFragment13.f29876D0;
                                    if (i15 == i14) {
                                        TextView textView112 = textViewArr2[i15];
                                        if (textView112 != null) {
                                            Boolean boolValueOf = Boolean.valueOf(textView112.isSelected());
                                            C5207g.m11108c(boolValueOf);
                                            textView112.setSelected(!boolValueOf.booleanValue());
                                        }
                                    } else {
                                        TextView textView113 = textViewArr2[i15];
                                        if (textView113 != null) {
                                            textView113.setSelected(false);
                                        }
                                    }
                                    i15++;
                                }
                                ((ReviewViewModel) reviewActivityMultiAndClozeFragment13.f29875C0.getValue()).f29663m0.mo14371k(new C9954b((String) list3.get(i14), C5207g.m11106a(str7, ref$ObjectRef6.f38127a) ? ReviewActivityResult.Correct : ReviewActivityResult.Incorrect));
                            }
                        });
                    }
                } else {
                    view = viewArr[i11];
                    if (view == null) {
                        view.setVisibility(4);
                    }
                }
            }
        } else {
            if (i13 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ref$ObjectRef ref$ObjectRef6 = reviewActivityMultiAndClozeFragment$setupUi$1.f29909h;
            C7562b c7562b6 = reviewActivityMultiAndClozeFragment$setupUi$1.f29908g;
            AbstractC9953a abstractC9953a6 = reviewActivityMultiAndClozeFragment$setupUi$1.f29907f;
            C7374a c7374a6 = reviewActivityMultiAndClozeFragment$setupUi$1.f29906e;
            ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment13 = reviewActivityMultiAndClozeFragment$setupUi$1.f29905d;
            C7499b.m14977z0(obj);
            ref$ObjectRef = ref$ObjectRef6;
            c7374a2 = c7374a6;
            reviewActivityMultiAndClozeFragment = reviewActivityMultiAndClozeFragment13;
            objM14360a = obj;
            c7562b2 = c7562b6;
            abstractC9953a2 = abstractC9953a6;
            str6 = (String) objM14360a;
            iHashCode4 = str6.hashCode();
            if (iHashCode4 != -702078272) {
                if (iHashCode4 != 79183) {
                    if (iHashCode4 == 566114168 && str6.equals("Simplified")) {
                        lessonStudyTransliteration8 = c7374a2.f41155n;
                        if (lessonStudyTransliteration8 != null) {
                            t17 = lessonStudyTransliteration8.f21911e;
                        } else {
                            t17 = 0;
                        }
                        ref$ObjectRef.f38127a = t17;
                    }
                } else if (str6.equals("Off")) {
                    ref$ObjectRef.f38127a = "";
                }
            } else if (str6.equals("Jyutping")) {
                lessonStudyTransliteration7 = c7374a2.f41155n;
                if (lessonStudyTransliteration7 != null) {
                    t16 = lessonStudyTransliteration7.f21912f;
                } else {
                    t16 = 0;
                }
                ref$ObjectRef.f38127a = t16;
            }
            C8311k1 c8311k1M10273n4 = reviewActivityMultiAndClozeFragment.m10273n0();
            TextView textView112 = c8311k1M10273n4.f44951d;
            viewArr = reviewActivityMultiAndClozeFragment.f29877E0;
            viewArr[0] = textView112;
            TextView textView113 = c8311k1M10273n4.f44953f;
            viewArr[1] = textView113;
            TextView textView114 = c8311k1M10273n4.f44955h;
            viewArr[2] = textView114;
            TextView textView115 = c8311k1M10273n4.f44952e;
            viewArr[3] = textView115;
            textViewArr = reviewActivityMultiAndClozeFragment.f29876D0;
            textViewArr[0] = textView112;
            textViewArr[1] = textView113;
            textViewArr[2] = textView114;
            textViewArr[3] = textView115;
            arrayList = new ArrayList();
            ref$ObjectRef2 = new Ref$ObjectRef();
            ref$ObjectRef2.f38127a = "";
            z10 = abstractC9953a2 instanceof AbstractC9953a.a;
            textView = c8311k1M10273n4.f44950c;
            textView2 = c8311k1M10273n4.f44949b;
            textView3 = c8311k1M10273n4.f44954g;
            imageButton = c8311k1M10273n4.f44948a;
            if (!z10) {
                if (abstractC9953a2 instanceof AbstractC9953a.g) {
                    textView3.setText(C4924a.m10454d(c7374a2.f41142a));
                    textView2.setText((CharSequence) ref$ObjectRef.f38127a);
                    AbstractC9953a.g gVar5 = (AbstractC9953a.g) abstractC9953a2;
                    arrayList.addAll(gVar5.f50646c);
                    ref$ObjectRef2.f38127a = gVar5.f50645b;
                    if (!reviewActivityMultiAndClozeFragment.f29878F0) {
                        InterfaceC3275c.a.m9347b(reviewActivityMultiAndClozeFragment.m10274o0(), reviewActivityMultiAndClozeFragment.m10274o0().mo498E1(), c7374a2.f41142a, true, 0.0f, 8);
                        reviewActivityMultiAndClozeFragment.f29878F0 = true;
                    }
                    imageButton.setOnClickListener(new ViewOnClickListenerC9466e(reviewActivityMultiAndClozeFragment, 15, c7374a2));
                    C4924a.m10457e0(imageButton);
                    textView.setText(reviewActivityMultiAndClozeFragment.m3600t(R.string.activities_select_meaning));
                } else if (abstractC9953a2 instanceof AbstractC9953a.h) {
                    i10 = 0;
                    tokenMeaning = (TokenMeaning) C6752c.m13426T(0, c7374a2.f41146e);
                    if (tokenMeaning != null || (str4 = tokenMeaning.f22090c) == null || (strM10454d = C4924a.m10454d(str4)) == null) {
                        strM10454d = "";
                    }
                    textView3.setText(strM10454d);
                    textView2.setText("");
                    AbstractC9953a.h hVar5 = (AbstractC9953a.h) abstractC9953a2;
                    arrayList.addAll(hVar5.f50649c);
                    ref$ObjectRef2.f38127a = hVar5.f50648b;
                    C5207g.m11110e(imageButton, "btnTts");
                    C4924a.m10422A(imageButton);
                    textView.setText(reviewActivityMultiAndClozeFragment.m3600t(R.string.activities_select_meaning_match));
                } else {
                    i10 = 0;
                    if (abstractC9953a2 instanceof AbstractC9953a.b) {
                        textView3.setText("");
                        textView2.setText("");
                        AbstractC9953a.b bVar5 = (AbstractC9953a.b) abstractC9953a2;
                        arrayList.addAll(bVar5.f50637c);
                        ref$ObjectRef2.f38127a = bVar5.f50636b;
                        if (!reviewActivityMultiAndClozeFragment.f29878F0) {
                            InterfaceC3275c.a.m9347b(reviewActivityMultiAndClozeFragment.m10274o0(), reviewActivityMultiAndClozeFragment.m10274o0().mo498E1(), c7374a2.f41142a, true, 0.0f, 8);
                            reviewActivityMultiAndClozeFragment.f29878F0 = true;
                        }
                        imageButton.setOnClickListener(new ViewOnClickListenerC9029m(reviewActivityMultiAndClozeFragment, 17, c7374a2));
                        C4924a.m10457e0(imageButton);
                        textView.setText(reviewActivityMultiAndClozeFragment.m3600t(R.string.activities_select_word_hear));
                    } else if (abstractC9953a2 instanceof AbstractC9953a.c) {
                        textView3.setText("");
                        textView2.setText("");
                        AbstractC9953a.c cVar5 = (AbstractC9953a.c) abstractC9953a2;
                        arrayList.addAll(cVar5.f50640c);
                        ref$ObjectRef2.f38127a = cVar5.f50639b;
                        if (!reviewActivityMultiAndClozeFragment.f29878F0) {
                            InterfaceC3275c.a.m9347b(reviewActivityMultiAndClozeFragment.m10274o0(), reviewActivityMultiAndClozeFragment.m10274o0().mo498E1(), c7374a2.f41142a, true, 0.0f, 8);
                            reviewActivityMultiAndClozeFragment.f29878F0 = true;
                        }
                        imageButton.setOnClickListener(new ViewOnClickListenerC9734i(reviewActivityMultiAndClozeFragment, 14, c7374a2));
                        C4924a.m10457e0(imageButton);
                        textView.setText(reviewActivityMultiAndClozeFragment.m3600t(R.string.activities_select_word_meaning_hear));
                    }
                }
                it = arrayList.iterator();
                while (true) {
                    i11 = i10;
                    if (it.hasNext()) {
                        break;
                    }
                    next = it.next();
                    i10 = i11 + 1;
                    if (i11 >= 0) {
                        C9000b.m17257w();
                        throw null;
                    }
                    str5 = (String) next;
                    if (C5207g.m11106a(str5, "")) {
                        textView4 = textViewArr[i11];
                        if (textView4 != null) {
                            textView4.setText(str5);
                        }
                        textView5 = textViewArr[i11];
                        if (textView5 != null) {
                            final ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment14 = reviewActivityMultiAndClozeFragment;
                            textView5.setOnClickListener(new View.OnClickListener() { // from class: vj.i
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    int i14;
                                    InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewActivityMultiAndClozeFragment.f29872H0;
                                    List list3 = arrayList;
                                    C5207g.m11111f(list3, "$answers");
                                    ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment15 = reviewActivityMultiAndClozeFragment14;
                                    C5207g.m11111f(reviewActivityMultiAndClozeFragment15, "this$0");
                                    String str7 = str5;
                                    C5207g.m11111f(str7, "$answer");
                                    Ref$ObjectRef ref$ObjectRef7 = ref$ObjectRef2;
                                    C5207g.m11111f(ref$ObjectRef7, "$correctAnswer");
                                    int size = list3.size();
                                    int i15 = 0;
                                    while (true) {
                                        i14 = i11;
                                        if (i15 >= size) {
                                            break;
                                        }
                                        TextView[] textViewArr2 = reviewActivityMultiAndClozeFragment15.f29876D0;
                                        if (i15 == i14) {
                                            TextView textView116 = textViewArr2[i15];
                                            if (textView116 != null) {
                                                Boolean boolValueOf = Boolean.valueOf(textView116.isSelected());
                                                C5207g.m11108c(boolValueOf);
                                                textView116.setSelected(!boolValueOf.booleanValue());
                                            }
                                        } else {
                                            TextView textView117 = textViewArr2[i15];
                                            if (textView117 != null) {
                                                textView117.setSelected(false);
                                            }
                                        }
                                        i15++;
                                    }
                                    ((ReviewViewModel) reviewActivityMultiAndClozeFragment15.f29875C0.getValue()).f29663m0.mo14371k(new C9954b((String) list3.get(i14), C5207g.m11106a(str7, ref$ObjectRef7.f38127a) ? ReviewActivityResult.Correct : ReviewActivityResult.Incorrect));
                                }
                            });
                        }
                    } else {
                        view = viewArr[i11];
                        if (view == null) {
                            view.setVisibility(4);
                        }
                    }
                }
            } else {
                if (c7562b2 != null || (list2 = c7562b2.f41677b) == null) {
                    strM10454d2 = null;
                } else {
                    strM10454d2 = C4924a.m10454d(C6752c.m13430X(list2, "", null, null, new InterfaceC2052l<C7561a, CharSequence>() { // from class: com.lingq.ui.review.activities.ReviewActivityMultiAndClozeFragment$setupUi$2$1$1
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final CharSequence mo528n(C7561a c7561a) {
                            C7561a c7561a2 = c7561a;
                            C5207g.m11111f(c7561a2, "it");
                            return c7561a2.f41675b ? "____" : c7561a2.f41674a;
                        }
                    }, 30));
                }
                textView3.setText(strM10454d2);
                textView2.setText("");
                if (c7562b2 != null) {
                    list = c7562b2.f41678c;
                    if (!list.isEmpty()) {
                        int iMo12968d5 = Random.f38128a.mo12968d(0, list.size());
                        arrayList.addAll(list);
                        AbstractC9953a.a aVar5 = (AbstractC9953a.a) abstractC9953a2;
                        arrayList.add(iMo12968d5, aVar5.f50634b);
                        ref$ObjectRef2.f38127a = aVar5.f50634b;
                    }
                    imageButton.setOnClickListener(new ViewOnClickListenerC6464i(reviewActivityMultiAndClozeFragment, 19, c7562b2));
                    if (C5207g.m11106a(reviewActivityMultiAndClozeFragment.m10274o0().f30156N.getValue(), Boolean.TRUE)) {
                        C4924a.m10457e0(imageButton);
                    } else {
                        C4924a.m10442U(imageButton);
                    }
                    textView.setText(reviewActivityMultiAndClozeFragment.m3600t(R.string.activities_select_missing_word));
                }
            }
            i10 = 0;
            it = arrayList.iterator();
            while (true) {
                i11 = i10;
                if (it.hasNext()) {
                    break;
                    break;
                }
                next = it.next();
                i10 = i11 + 1;
                if (i11 >= 0) {
                    C9000b.m17257w();
                    throw null;
                }
                str5 = (String) next;
                if (C5207g.m11106a(str5, "")) {
                    textView4 = textViewArr[i11];
                    if (textView4 != null) {
                        textView4.setText(str5);
                    }
                    textView5 = textViewArr[i11];
                    if (textView5 != null) {
                        final ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment15 = reviewActivityMultiAndClozeFragment;
                        textView5.setOnClickListener(new View.OnClickListener() { // from class: vj.i
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                int i14;
                                InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewActivityMultiAndClozeFragment.f29872H0;
                                List list3 = arrayList;
                                C5207g.m11111f(list3, "$answers");
                                ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment16 = reviewActivityMultiAndClozeFragment15;
                                C5207g.m11111f(reviewActivityMultiAndClozeFragment16, "this$0");
                                String str7 = str5;
                                C5207g.m11111f(str7, "$answer");
                                Ref$ObjectRef ref$ObjectRef7 = ref$ObjectRef2;
                                C5207g.m11111f(ref$ObjectRef7, "$correctAnswer");
                                int size = list3.size();
                                int i15 = 0;
                                while (true) {
                                    i14 = i11;
                                    if (i15 >= size) {
                                        break;
                                    }
                                    TextView[] textViewArr2 = reviewActivityMultiAndClozeFragment16.f29876D0;
                                    if (i15 == i14) {
                                        TextView textView116 = textViewArr2[i15];
                                        if (textView116 != null) {
                                            Boolean boolValueOf = Boolean.valueOf(textView116.isSelected());
                                            C5207g.m11108c(boolValueOf);
                                            textView116.setSelected(!boolValueOf.booleanValue());
                                        }
                                    } else {
                                        TextView textView117 = textViewArr2[i15];
                                        if (textView117 != null) {
                                            textView117.setSelected(false);
                                        }
                                    }
                                    i15++;
                                }
                                ((ReviewViewModel) reviewActivityMultiAndClozeFragment16.f29875C0.getValue()).f29663m0.mo14371k(new C9954b((String) list3.get(i14), C5207g.m11106a(str7, ref$ObjectRef7.f38127a) ? ReviewActivityResult.Correct : ReviewActivityResult.Incorrect));
                            }
                        });
                    }
                } else {
                    view = viewArr[i11];
                    if (view == null) {
                        view.setVisibility(4);
                    }
                }
            }
        }
        return C9072e.f47360a;
    }
}
