package com.lingq.p055ui.token;

import ae.C0062b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.DisplayMetrics;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.C0762b;
import androidx.recyclerview.widget.RecyclerView;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputLayout;
import com.lingq.p055ui.tooltips.TooltipStep;
import com.lingq.shared.uimodel.CardStatus;
import com.lingq.util.C4924a;
import com.lingq.util.ViewsUtilsKt;
import com.linguist.R;
import dm.C5207g;
import fk.ViewOnClickListenerC5565g;
import java.util.ArrayList;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import li.C7374a;
import li.C7375b;
import li.C7378e;
import li.InterfaceC7379f;
import no.C7828f;
import no.InterfaceC7882z;
import p096ei.C5408a;
import p225kk.C6716m;
import p254m2.C7472a;
import p260m8.C7499b;
import p278nh.C7777d;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import ph.C8371v1;
import si.ViewOnClickListenerC9029m;
import sj.ViewOnClickListenerC9058q;
import sl.C9072e;
import vi.ViewOnClickListenerC9734i;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenFragment$onViewCreated$10$1", m19206f = "TokenFragment.kt", m19207l = {475}, m19208m = "invokeSuspend")
public final class TokenFragment$onViewCreated$10$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31241e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TokenFragment f31242f;

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenFragment$onViewCreated$10$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lli/f;", "data", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenFragment$onViewCreated$10$1$1", m19206f = "TokenFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C48011 extends SuspendLambda implements InterfaceC2056p<InterfaceC7379f, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f31243e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ TokenFragment f31244f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48011(TokenFragment tokenFragment, InterfaceC9968c<? super C48011> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f31244f = tokenFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C48011 c48011 = new C48011(this.f31244f, interfaceC9968c);
            c48011.f31243e = obj;
            return c48011;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7379f interfaceC7379f, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C48011) mo1336a(interfaceC7379f, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            boolean z10;
            C8371v1 c8371v1;
            ViewLearnProgress viewLearnProgress;
            ViewLearnProgress viewLearnProgress2;
            int iM13316a;
            String str;
            String str2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            InterfaceC7379f interfaceC7379f = (InterfaceC7379f) this.f31243e;
            if (interfaceC7379f != null) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
                TokenFragment tokenFragment = this.f31244f;
                tokenFragment.getClass();
                boolean zBooleanValue = ((Boolean) C7828f.m15572f(EmptyCoroutineContext.f38093a, new TokenFragment$updateUiWithToken$statusBar$1(tokenFragment, null))).booleanValue();
                C8371v1 c8371v1M10362n0 = tokenFragment.m10362n0();
                if (zBooleanValue) {
                    ViewLearnProgress viewLearnProgress3 = c8371v1M10362n0.f45374V;
                    C5207g.m11110e(viewLearnProgress3, "viewLearnCollapsed");
                    C4924a.m10457e0(viewLearnProgress3);
                    ImageButton imageButton = c8371v1M10362n0.f45385g;
                    C5207g.m11110e(imageButton, "btnStatusWithImage");
                    C4924a.m10442U(imageButton);
                    TextView textView = c8371v1M10362n0.f45386h;
                    C5207g.m11110e(textView, "btnStatusWithText");
                    C4924a.m10442U(textView);
                    LinearLayout linearLayout = c8371v1M10362n0.f45378Z;
                    C5207g.m11110e(linearLayout, "viewWordStatus");
                    C4924a.m10442U(linearLayout);
                } else {
                    ViewLearnProgress viewLearnProgress4 = c8371v1M10362n0.f45374V;
                    C5207g.m11110e(viewLearnProgress4, "viewLearnCollapsed");
                    C4924a.m10442U(viewLearnProgress4);
                }
                c8371v1M10362n0.f45389k.setOnClickListener(new ViewOnClickListenerC5565g(tokenFragment, 1));
                int iMo14777f = interfaceC7379f.mo14777f();
                TextView textView2 = c8371v1M10362n0.f45354B;
                TextView textView3 = c8371v1M10362n0.f45355C;
                if (iMo14777f > 0) {
                    C5207g.m11110e(textView2, "tvCoins");
                    C4924a.m10457e0(textView2);
                    List<String> listMo14773b = interfaceC7379f.mo14773b();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : listMo14773b) {
                        if (!(((String) obj2).length() == 0)) {
                            arrayList.add(obj2);
                        }
                    }
                    boolean z11 = !arrayList.isEmpty();
                    RecyclerView recyclerView = c8371v1M10362n0.f45401w;
                    if (z11 || (interfaceC7379f instanceof C7374a)) {
                        C5207g.m11110e(textView3, "tvCoinsSeparator");
                        C4924a.m10457e0(textView3);
                        C5207g.m11110e(recyclerView, "rvTags");
                        C4924a.m10457e0(recyclerView);
                    } else {
                        C5207g.m11110e(textView3, "tvCoinsSeparator");
                        C4924a.m10442U(textView3);
                        C5207g.m11110e(recyclerView, "rvTags");
                        C4924a.m10442U(recyclerView);
                    }
                    textView2.setText(String.valueOf(interfaceC7379f.mo14777f()));
                } else {
                    C5207g.m11110e(textView3, "tvCoinsSeparator");
                    C4924a.m10442U(textView3);
                    C5207g.m11110e(textView2, "tvCoins");
                    C4924a.m10442U(textView2);
                }
                TokenControllerType tokenControllerType = tokenFragment.m10363o0().f31431U.f34366a.f31181g;
                TokenControllerType tokenControllerType2 = TokenControllerType.Lesson;
                TextView textView4 = c8371v1M10362n0.f45361I;
                TextView textView5 = c8371v1M10362n0.f45360H;
                RecyclerView recyclerView2 = c8371v1M10362n0.f45399u;
                if (tokenControllerType == tokenControllerType2 || tokenFragment.m10363o0().f31431U.f34366a.f31181g == TokenControllerType.LessonExpanded) {
                    C5207g.m11110e(recyclerView2, "rvRelatedPhrases");
                    C5207g.m11110e(textView5, "tvRelatedPhrasesEmpty");
                    recyclerView2.setVisibility(Boolean.valueOf((textView5.getVisibility() == 0) ^ true).booleanValue() ? 0 : 4);
                    C5207g.m11110e(textView4, "tvRelatedPhrasesTitle");
                    C4924a.m10457e0(textView4);
                } else if (tokenFragment.m10363o0().f31431U.f34366a.f31181g == TokenControllerType.Vocabulary || tokenFragment.m10363o0().f31431U.f34366a.f31181g == TokenControllerType.Review) {
                    C5207g.m11110e(recyclerView2, "rvRelatedPhrases");
                    C4924a.m10442U(recyclerView2);
                    C5207g.m11110e(textView5, "tvRelatedPhrasesEmpty");
                    C4924a.m10442U(textView5);
                    C5207g.m11110e(textView4, "tvRelatedPhrasesTitle");
                    C4924a.m10442U(textView4);
                }
                boolean z12 = interfaceC7379f instanceof C7374a;
                ViewLearnProgress viewLearnProgress5 = c8371v1M10362n0.f45374V;
                ViewLearnProgress viewLearnProgress6 = c8371v1M10362n0.f45373U;
                LinearLayout linearLayout2 = c8371v1M10362n0.f45367O;
                TextView textView6 = c8371v1M10362n0.f45356D;
                RecyclerView recyclerView3 = c8371v1M10362n0.f45400v;
                TextView textView7 = c8371v1M10362n0.f45362J;
                TextInputLayout textInputLayout = c8371v1M10362n0.f45404z;
                if (z12) {
                    if (interfaceC7379f.mo14772a().isEmpty()) {
                        C5207g.m11110e(textInputLayout, "tlMeaning");
                        C4924a.m10457e0(textInputLayout);
                        z10 = z12;
                        ColorStateList colorStateListM14842b = C7472a.m14842b(R.color.dr_token_meaning_stroke_color, tokenFragment.m3578a0());
                        C5207g.m11108c(colorStateListM14842b);
                        textInputLayout.setBoxStrokeColorStateList(colorStateListM14842b);
                        C5207g.m11110e(textView7, "tvSavedMeaningsLabel");
                        C4924a.m10442U(textView7);
                        C5207g.m11110e(recyclerView3, "rvSavedMeanings");
                        C4924a.m10442U(recyclerView3);
                        C5207g.m11110e(textView6, "tvDictionariesAndMeanings");
                        C4924a.m10442U(textView6);
                        C5207g.m11110e(linearLayout2, "viewDictionariesAndMeanings");
                        C4924a.m10457e0(linearLayout2);
                    } else {
                        z10 = z12;
                        C5207g.m11110e(textView7, "tvSavedMeaningsLabel");
                        C4924a.m10457e0(textView7);
                        C5207g.m11110e(recyclerView3, "rvSavedMeanings");
                        C4924a.m10457e0(recyclerView3);
                        if (!((Boolean) tokenFragment.m10363o0().f31474z0.getValue()).booleanValue()) {
                            C5207g.m11110e(textView6, "tvDictionariesAndMeanings");
                            C4924a.m10457e0(textView6);
                            C5207g.m11110e(linearLayout2, "viewDictionariesAndMeanings");
                            C4924a.m10442U(linearLayout2);
                            C5207g.m11110e(textInputLayout, "tlMeaning");
                            C4924a.m10442U(textInputLayout);
                        }
                    }
                    if (interfaceC7379f.mo14776e()) {
                        C5207g.m11110e(textView5, "tvRelatedPhrasesEmpty");
                        C4924a.m10442U(textView5);
                        C5207g.m11110e(recyclerView2, "rvRelatedPhrases");
                        C4924a.m10442U(recyclerView2);
                        C5207g.m11110e(textView4, "tvRelatedPhrasesTitle");
                        C4924a.m10442U(textView4);
                    }
                    C7374a c7374a = (C7374a) interfaceC7379f;
                    int i10 = c7374a.f41150i;
                    Integer num = c7374a.f41151j;
                    viewLearnProgress6.m10386b(i10, num);
                    viewLearnProgress5.m10386b(i10, num);
                    c8371v1 = c8371v1M10362n0;
                } else {
                    z10 = z12;
                    c8371v1 = c8371v1M10362n0;
                    boolean z13 = interfaceC7379f instanceof C7378e;
                    if (z13 ? true : interfaceC7379f instanceof C7375b) {
                        C5207g.m11110e(textInputLayout, "tlMeaning");
                        C4924a.m10457e0(textInputLayout);
                        ColorStateList colorStateListM14842b2 = C7472a.m14842b(R.color.dr_token_meaning_stroke_color, tokenFragment.m3578a0());
                        C5207g.m11108c(colorStateListM14842b2);
                        textInputLayout.setBoxStrokeColorStateList(colorStateListM14842b2);
                        C5207g.m11110e(textView7, "tvSavedMeaningsLabel");
                        C4924a.m10442U(textView7);
                        C5207g.m11110e(recyclerView3, "rvSavedMeanings");
                        C4924a.m10442U(recyclerView3);
                        C5207g.m11110e(textView6, "tvDictionariesAndMeanings");
                        C4924a.m10442U(textView6);
                        C5207g.m11110e(linearLayout2, "viewDictionariesAndMeanings");
                        C4924a.m10457e0(linearLayout2);
                        if (interfaceC7379f instanceof C7375b) {
                            C5207g.m11110e(textView5, "tvRelatedPhrasesEmpty");
                            C4924a.m10442U(textView5);
                            C5207g.m11110e(recyclerView2, "rvRelatedPhrases");
                            C4924a.m10442U(recyclerView2);
                            C5207g.m11110e(textView4, "tvRelatedPhrasesTitle");
                            C4924a.m10442U(textView4);
                            viewLearnProgress2 = viewLearnProgress6;
                            viewLearnProgress2.m10387c("");
                            viewLearnProgress = viewLearnProgress5;
                            viewLearnProgress.m10387c("");
                        } else {
                            viewLearnProgress = viewLearnProgress5;
                            viewLearnProgress2 = viewLearnProgress6;
                        }
                        if (z13) {
                            String str3 = ((C7378e) interfaceC7379f).f41174h;
                            viewLearnProgress2.m10387c(str3);
                            viewLearnProgress.m10387c(str3);
                        }
                    }
                }
                String strMo14774c = interfaceC7379f.mo14774c();
                List<String> listMo14775d = interfaceC7379f.mo14775d();
                if (listMo14775d.isEmpty()) {
                    listMo14775d = interfaceC7379f.mo14773b();
                }
                String strM10452c = C4924a.m10452c(listMo14775d, strMo14774c);
                C8371v1 c8371v2 = c8371v1;
                c8371v2.f45363K.setText(strM10452c);
                LinearLayout linearLayout3 = c8371v2.f45378Z;
                ImageButton imageButton2 = c8371v2.f45385g;
                TextView textView8 = c8371v2.f45386h;
                if (z10) {
                    C7374a c7374a2 = (C7374a) interfaceC7379f;
                    int i11 = c7374a2.f41150i;
                    Integer num2 = c7374a2.f41151j;
                    int iM11568a = C5408a.m11568a(i11, num2);
                    if (zBooleanValue) {
                        C5207g.m11110e(linearLayout3, "viewWordStatus");
                        C4924a.m10442U(linearLayout3);
                    } else {
                        C5207g.m11110e(linearLayout3, "viewWordStatus");
                        C4924a.m10422A(linearLayout3);
                    }
                    if (iM11568a == CardStatus.Ignored.getValue() || iM11568a == CardStatus.Known.getValue()) {
                        str = "btnStatusWithImage";
                        str2 = "btnStatusWithText";
                        C5207g.m11110e(textView8, str2);
                        C4924a.m10442U(textView8);
                        if (C5207g.m11106a((TokenViewState) tokenFragment.m10363o0().f31473y0.getValue(), TokenViewState.Collapsed.f31716a) && !zBooleanValue) {
                            C5207g.m11110e(imageButton2, str);
                            C4924a.m10457e0(imageButton2);
                        }
                        List<Integer> list = C6716m.f37937a;
                        Context contextM3578a0 = tokenFragment.m3578a0();
                        C5207g.m11110e(imageButton2, str);
                        C6716m.m13323h(contextM3578a0, iM11568a, imageButton2);
                        tokenFragment.f31216N0 = imageButton2;
                        imageButton2.setOnClickListener(new ViewOnClickListenerC9029m(tokenFragment, 21, interfaceC7379f));
                    } else {
                        if (!C5207g.m11106a((TokenViewState) tokenFragment.m10363o0().f31473y0.getValue(), TokenViewState.Collapsed.f31716a) || zBooleanValue) {
                            str2 = "btnStatusWithText";
                        } else {
                            str2 = "btnStatusWithText";
                            C5207g.m11110e(textView8, str2);
                            C4924a.m10457e0(textView8);
                        }
                        str = "btnStatusWithImage";
                        C5207g.m11110e(imageButton2, str);
                        C4924a.m10442U(imageButton2);
                        List<Integer> list2 = C6716m.f37937a;
                        C5207g.m11110e(textView8, str2);
                        C6716m.m13324i(textView8, iM11568a);
                        tokenFragment.f31216N0 = textView8;
                        textView8.setOnClickListener(new ViewOnClickListenerC9734i(tokenFragment, 19, interfaceC7379f));
                    }
                    C5207g.m11110e(textView8, str2);
                    List<Integer> list3 = C6716m.f37937a;
                    C4924a.m10455d0(textView8, C6716m.m13333r(ViewsUtilsKt.m10416b(i11, num2), tokenFragment.m3578a0()));
                    textView8.setActivated(true);
                    C5207g.m11110e(imageButton2, str);
                    C4924a.m10455d0(imageButton2, C6716m.m13333r(ViewsUtilsKt.m10416b(i11, num2), tokenFragment.m3578a0()));
                    imageButton2.setActivated(true);
                    AppCompatEditText appCompatEditText = c8371v2.f45392n;
                    if (!appCompatEditText.hasFocus()) {
                        appCompatEditText.setText(c7374a2.f41153l);
                    }
                } else if (interfaceC7379f instanceof C7378e ? true : interfaceC7379f instanceof C7375b) {
                    C5207g.m11110e(textView8, "btnStatusWithText");
                    C4924a.m10442U(textView8);
                    C5207g.m11110e(imageButton2, "btnStatusWithImage");
                    C4924a.m10442U(imageButton2);
                    if (C5207g.m11106a((TokenViewState) tokenFragment.m10363o0().f31473y0.getValue(), TokenViewState.Collapsed.f31716a) && !zBooleanValue) {
                        C5207g.m11110e(linearLayout3, "viewWordStatus");
                        C4924a.m10457e0(linearLayout3);
                    }
                    c8371v2.f45387i.setOnClickListener(new ViewOnClickListenerC9058q(4, tokenFragment));
                    c8371v2.f45388j.setOnClickListener(new ViewOnClickListenerC5565g(tokenFragment, 2));
                    C5207g.m11110e(linearLayout3, "viewWordStatus");
                    tokenFragment.f31216N0 = linearLayout3;
                    if (C5207g.m11106a(tokenFragment.m10363o0().f31473y0.getValue(), TokenViewState.Expanded.f31717a)) {
                        C4924a.m10422A(linearLayout3);
                    }
                }
                int iMo14777f2 = interfaceC7379f.mo14777f();
                LinearLayout linearLayout4 = c8371v2.f45366N;
                if (iMo14777f2 == 0 && ((List) tokenFragment.m10363o0().f31432U0.getValue()).isEmpty() && !z10) {
                    C5207g.m11110e(linearLayout4, "viewCoinsTags");
                    C4924a.m10442U(linearLayout4);
                }
                if (((Boolean) tokenFragment.m10363o0().f31435W.getValue()).booleanValue()) {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    tokenFragment.m3576Y().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                    int i12 = displayMetrics.heightPixels;
                    int measuredHeight = tokenFragment.m10362n0().f45390l.getMeasuredHeight();
                    int i13 = tokenFragment.f31203A0;
                    if (i13 > i12 / 2) {
                        int i14 = tokenFragment.f31204B0 - measuredHeight;
                        List<Integer> list4 = C6716m.f37937a;
                        iM13316a = i14 - ((int) C6716m.m13316a(60));
                        if (iM13316a < 0) {
                            iM13316a = (int) C6716m.m13316a(32);
                        }
                    } else {
                        List<Integer> list5 = C6716m.f37937a;
                        int iM13316a2 = i13 + ((int) C6716m.m13316a(60));
                        iM13316a = iM13316a2 + measuredHeight > i12 - ((int) C6716m.m13316a(32)) ? (i12 - measuredHeight) - ((int) C6716m.m13316a(60)) : iM13316a2;
                    }
                    C8371v1 c8371v1M10362n1 = tokenFragment.m10362n0();
                    C0762b c0762bM2809z = c8371v1M10362n1.f45395q.m2809z(R.id.collapsedTransition);
                    MaterialCardView materialCardView = c8371v1M10362n1.f45390l;
                    LinearLayout linearLayout5 = c8371v1M10362n1.f45377Y;
                    if (c0762bM2809z != null) {
                        c0762bM2809z.m2899q(linearLayout5.getId(), iM13316a);
                        c0762bM2809z.m2899q(materialCardView.getId(), iM13316a);
                    }
                    TokenMotionLayout tokenMotionLayout = c8371v1M10362n1.f45395q;
                    C0762b c0762bM2809z2 = tokenMotionLayout.m2809z(R.id.rightTransition);
                    if (c0762bM2809z2 != null) {
                        c0762bM2809z2.m2899q(linearLayout5.getId(), iM13316a);
                        c0762bM2809z2.m2899q(materialCardView.getId(), iM13316a);
                    }
                    C0762b c0762bM2809z3 = tokenMotionLayout.m2809z(R.id.leftTransition);
                    if (c0762bM2809z3 != null) {
                        c0762bM2809z3.m2899q(linearLayout5.getId(), iM13316a);
                        c0762bM2809z3.m2899q(materialCardView.getId(), iM13316a);
                    }
                    C0762b c0762bM2809z4 = tokenMotionLayout.m2809z(R.id.downTransition);
                    if (c0762bM2809z4 != null) {
                        int id2 = linearLayout5.getId();
                        List<Integer> list6 = C6716m.f37937a;
                        c0762bM2809z4.m2899q(id2, ((int) C6716m.m13316a(300)) + iM13316a);
                        c0762bM2809z4.m2899q(materialCardView.getId(), iM13316a + ((int) C6716m.m13316a(300)));
                    }
                    tokenFragment.m10363o0().f31435W.setValue(Boolean.FALSE);
                }
                if (!tokenFragment.m10363o0().mo9741p0(TooltipStep.LingQExpanded) && tokenFragment.m10363o0().f31431U.f34366a.f31181g == tokenControllerType2) {
                    RecyclerView recyclerView4 = c8371v2.f45397s;
                    C5207g.m11110e(recyclerView4, "rvDictionariesSmall");
                    C4924a.m10442U(recyclerView4);
                    C5207g.m11110e(linearLayout4, "viewCoinsTags");
                    C4924a.m10442U(linearLayout4);
                }
                if (!C7777d.m15481b(tokenFragment)) {
                    TokenViewModel tokenViewModelM10363o0 = tokenFragment.m10363o0();
                    C7828f.m15570d(C8573r0.m16767w0(tokenViewModelM10363o0), null, null, new TokenViewModel$showTutorials$1(tokenViewModelM10363o0, null), 3);
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenFragment$onViewCreated$10$1(TokenFragment tokenFragment, InterfaceC9968c<? super TokenFragment$onViewCreated$10$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31242f = tokenFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new TokenFragment$onViewCreated$10$1(this.f31242f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((TokenFragment$onViewCreated$10$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31241e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
            TokenFragment tokenFragment = this.f31242f;
            TokenViewModel tokenViewModelM10363o0 = tokenFragment.m10363o0();
            C48011 c48011 = new C48011(tokenFragment, null);
            this.f31241e = 1;
            if (C0062b.m369m0(tokenViewModelM10363o0.f31437X, c48011, this) == coroutineSingletons) {
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
