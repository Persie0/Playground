package com.lingq.p055ui.token;

import ae.C0062b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.appcompat.app.DialogInterfaceC0215b;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.emoji2.text.RunnableC0893g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C1038i0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.InterfaceC1037i;
import androidx.view.InterfaceC1048n0;
import androidx.view.Lifecycle;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.lingq.commons.controllers.InterfaceC3275c;
import com.lingq.commons.p053ui.views.RecyclerSwipeActionsTouchListener;
import com.lingq.p055ui.token.dictionaries.C4902a;
import com.lingq.shared.uimodel.CardStatus;
import com.lingq.shared.uimodel.LanguageLearn;
import com.lingq.shared.uimodel.language.UserDictionaryData;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.shared.uimodel.token.TokenMeaning;
import com.lingq.shared.uimodel.token.TokenRelatedPhrase;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import fk.AbstractC5560b;
import fk.C5567i;
import fk.C5574p;
import fk.ViewOnClickListenerC5565g;
import fk.ViewOnClickListenerC5566h;
import java.net.URLEncoder;
import java.util.Comparator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.text.C7076b;
import kotlinx.coroutines.flow.C7138s;
import li.InterfaceC7379f;
import mo.C7661i;
import ni.C7796d;
import no.C7828f;
import p003a2.C0009a;
import p067d8.ViewOnClickListenerC5062d0;
import p076di.InterfaceC5179a;
import p096ei.C5408a;
import p138gk.C5811a;
import p138gk.C5812b;
import p138gk.C5814d;
import p138gk.C5816f;
import p138gk.C5817g;
import p225kk.C6716m;
import p254m2.C7472a;
import p260m8.C7499b;
import p278nh.C7777d;
import p278nh.InterfaceC7774a;
import p301oh.C8043b;
import p301oh.C8045d;
import p301oh.C8049h;
import p322pd.C8226g;
import p322pd.C8227h;
import p322pd.C8228i;
import p338qd.C8573r0;
import p385sf.C9000b;
import p402u0.C9369l;
import p427v3.AbstractC9634a;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p537zi.DialogInterfaceOnClickListenerC10505o;
import ph.C8261c;
import ph.C8371v1;
import sl.C9072e;
import sl.InterfaceC9070c;
import tc.C9249b;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/token/TokenFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class TokenFragment extends AbstractC5560b {

    /* JADX INFO: renamed from: R0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f31202R0 = {C0204c.m857q(TokenFragment.class, "getBinding()Lcom/lingq/databinding/FragmentTokenBinding;")};

    /* JADX INFO: renamed from: A0 */
    public int f31203A0;

    /* JADX INFO: renamed from: B0 */
    public int f31204B0;

    /* JADX INFO: renamed from: C0 */
    public final FragmentViewBindingDelegate f31205C0;

    /* JADX INFO: renamed from: D0 */
    public final C1038i0 f31206D0;

    /* JADX INFO: renamed from: E0 */
    public C5816f f31207E0;

    /* JADX INFO: renamed from: F0 */
    public C5812b f31208F0;

    /* JADX INFO: renamed from: G0 */
    public C4902a f31209G0;

    /* JADX INFO: renamed from: H0 */
    public C5814d f31210H0;

    /* JADX INFO: renamed from: I0 */
    public C5817g f31211I0;

    /* JADX INFO: renamed from: J0 */
    public DialogInterfaceC0215b f31212J0;

    /* JADX INFO: renamed from: K0 */
    public C8261c f31213K0;

    /* JADX INFO: renamed from: L0 */
    public C5811a f31214L0;

    /* JADX INFO: renamed from: M0 */
    public ArrayAdapter<String> f31215M0;

    /* JADX INFO: renamed from: N0 */
    public View f31216N0;

    /* JADX INFO: renamed from: O0 */
    public InterfaceC5179a f31217O0;

    /* JADX INFO: renamed from: P0 */
    public InterfaceC3275c f31218P0;

    /* JADX INFO: renamed from: Q0 */
    public C7796d f31219Q0;

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenFragment$a */
    public /* synthetic */ class C4787a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f31220a;

        static {
            int[] iArr = new int[TokenControllerType.values().length];
            try {
                iArr[TokenControllerType.Lesson.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TokenControllerType.LessonExpanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TokenControllerType.Review.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TokenControllerType.Vocabulary.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f31220a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenFragment$b */
    public static final class C4788b implements InterfaceC7774a<UserDictionaryData> {
        public C4788b() {
        }

        @Override // p278nh.InterfaceC7774a
        /* JADX INFO: renamed from: a */
        public final void mo9795a(UserDictionaryData userDictionaryData) {
            String strMo14774c;
            UserDictionaryData userDictionaryData2 = userDictionaryData;
            C5207g.m11111f(userDictionaryData2, "data");
            InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
            TokenViewModel tokenViewModelM10363o0 = TokenFragment.this.m10363o0();
            C7138s c7138s = tokenViewModelM10363o0.f31403F0;
            InterfaceC7379f interfaceC7379f = (InterfaceC7379f) tokenViewModelM10363o0.f31437X.getValue();
            if (interfaceC7379f == null || (strMo14774c = interfaceC7379f.mo14774c()) == null) {
                strMo14774c = "";
            }
            c7138s.mo14371k(new Pair(strMo14774c, userDictionaryData2));
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenFragment$c */
    public static final class C4789c implements InterfaceC7774a<TokenRelatedPhrase> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TokenData f31224b;

        public C4789c(TokenData tokenData) {
            this.f31224b = tokenData;
        }

        @Override // p278nh.InterfaceC7774a
        /* JADX INFO: renamed from: a */
        public final void mo9795a(TokenRelatedPhrase tokenRelatedPhrase) {
            TokenRelatedPhrase tokenRelatedPhrase2 = tokenRelatedPhrase;
            C5207g.m11111f(tokenRelatedPhrase2, "it");
            List<Integer> list = C6716m.f37937a;
            TokenFragment tokenFragment = TokenFragment.this;
            C6716m.m13321f(tokenFragment.m3578a0(), tokenFragment.m3580c0());
            tokenFragment.m3580c0().postDelayed(new RunnableC0893g(3, tokenFragment, tokenRelatedPhrase2, this.f31224b), 100L);
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenFragment$d */
    public static final class C4790d implements TextView.OnEditorActionListener {
        public C4790d() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            if (i10 != 6) {
                return false;
            }
            InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
            TokenFragment tokenFragment = TokenFragment.this;
            TokenViewModel.m10374s2(tokenFragment.m10363o0(), new TokenMeaning(0, tokenFragment.m10363o0().mo507p1(), String.valueOf(textView != null ? textView.getText() : null), 0, false, tokenFragment.m10363o0().mo507p1(), true, 0), true);
            if (textView != null) {
                List<Integer> list = C6716m.f37937a;
                C6716m.m13321f(textView.getContext(), textView);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenFragment$e */
    public static final class C4791e implements TextWatcher {
        public C4791e() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            C5207g.m11111f(editable, "editable");
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            C5207g.m11111f(charSequence, "charSequence");
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            C5207g.m11111f(charSequence, "charSequence");
            InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
            TokenViewModel tokenViewModelM10363o0 = TokenFragment.this.m10363o0();
            String string = charSequence.toString();
            C5207g.m11111f(string, "notes");
            C7828f.m15570d(C8573r0.m16767w0(tokenViewModelM10363o0), null, null, new TokenViewModel$updateNotes$1(tokenViewModelM10363o0, string, null), 3);
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenFragment$f */
    public static final class C4792f implements ViewLearnProgress.InterfaceC4863a {
        public C4792f() {
        }

        @Override // com.lingq.p055ui.token.ViewLearnProgress.InterfaceC4863a
        /* JADX INFO: renamed from: a */
        public final void mo10269a(int i10) {
            InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
            TokenFragment tokenFragment = TokenFragment.this;
            TokenViewModel tokenViewModelM10363o0 = tokenFragment.m10363o0();
            C7828f.m15570d(tokenViewModelM10363o0.f31409J, null, null, new TokenViewModel$updateCardStatus$1(tokenViewModelM10363o0, i10, C7777d.m15481b(tokenFragment), null), 3);
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenFragment$g */
    public static final class C4793g implements ViewLearnProgress.InterfaceC4863a {
        public C4793g() {
        }

        @Override // com.lingq.p055ui.token.ViewLearnProgress.InterfaceC4863a
        /* JADX INFO: renamed from: a */
        public final void mo10269a(int i10) {
            InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
            TokenFragment tokenFragment = TokenFragment.this;
            TokenViewModel tokenViewModelM10363o0 = tokenFragment.m10363o0();
            C7828f.m15570d(tokenViewModelM10363o0.f31409J, null, null, new TokenViewModel$updateCardStatus$1(tokenViewModelM10363o0, i10, C7777d.m15481b(tokenFragment), null), 3);
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenFragment$h */
    public static final class C4794h implements RecyclerSwipeActionsTouchListener.InterfaceC3280a {
        public C4794h() {
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        @Override // com.lingq.commons.p053ui.views.RecyclerSwipeActionsTouchListener.InterfaceC3280a
        /* JADX INFO: renamed from: a */
        public final void mo9366a(int i10, int i11) {
            TokenMeaning tokenMeaning;
            TokenMeaning tokenMeaning2;
            String strMo14774c;
            TokenFragment tokenFragment = TokenFragment.this;
            if (i10 == R.id.ivEditLocale) {
                C5816f c5816f = tokenFragment.f31207E0;
                if (c5816f == null) {
                    C5207g.m11117l("savedMeaningsAdapter");
                    throw null;
                }
                C5816f.a aVar = (C5816f.a) c5816f.f7471d.f7233f.get(i11);
                if (aVar != null && (tokenMeaning2 = aVar.f35112a) != null) {
                    TokenViewModel tokenViewModelM10363o0 = tokenFragment.m10363o0();
                    C7138s c7138s = tokenViewModelM10363o0.f31401D0;
                    InterfaceC7379f interfaceC7379f = (InterfaceC7379f) tokenViewModelM10363o0.f31437X.getValue();
                    if (interfaceC7379f == null || (strMo14774c = interfaceC7379f.mo14774c()) == null) {
                        strMo14774c = "";
                    }
                    c7138s.mo14371k(new Pair(strMo14774c, tokenMeaning2));
                }
            } else if (i10 == R.id.ivDelete) {
                C5816f c5816f2 = tokenFragment.f31207E0;
                if (c5816f2 == null) {
                    C5207g.m11117l("savedMeaningsAdapter");
                    throw null;
                }
                C5816f.a aVar2 = (C5816f.a) c5816f2.f7471d.f7233f.get(i11);
                if (aVar2 != null && (tokenMeaning = aVar2.f35112a) != null) {
                    tokenFragment.m10363o0().f31413L.mo10037V0(tokenMeaning);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenFragment$i */
    public static final class C4795i implements C5816f.c {
        public C4795i() {
        }

        @Override // p138gk.C5816f.c
        /* JADX INFO: renamed from: a */
        public final void mo10365a(TokenMeaning tokenMeaning, String str) {
            C5207g.m11111f(tokenMeaning, "meaning");
            boolean zM15250P2 = C7661i.m15250P2(C7076b.m14277B3(str).toString());
            TokenFragment tokenFragment = TokenFragment.this;
            if (zM15250P2) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
                TokenViewModel tokenViewModelM10363o0 = tokenFragment.m10363o0();
                C7828f.m15570d(tokenViewModelM10363o0.f31409J, null, null, new TokenViewModel$removeTokenMeaning$1(tokenViewModelM10363o0, tokenMeaning, null), 3);
                return;
            }
            InterfaceC6727j<Object>[] interfaceC6727jArr2 = TokenFragment.f31202R0;
            TokenViewModel tokenViewModelM10363o1 = tokenFragment.m10363o0();
            C7828f.m15570d(tokenViewModelM10363o1.f31409J, null, null, new TokenViewModel$updateTokenMeaning$1(tokenViewModelM10363o1, tokenMeaning, str, null), 3);
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenFragment$j */
    public static final class C4796j implements InterfaceC7774a<TokenMeaning> {
        public C4796j() {
        }

        @Override // p278nh.InterfaceC7774a
        /* JADX INFO: renamed from: a */
        public final void mo9795a(TokenMeaning tokenMeaning) {
            TokenMeaning tokenMeaning2 = tokenMeaning;
            C5207g.m11111f(tokenMeaning2, "it");
            InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
            TokenFragment tokenFragment = TokenFragment.this;
            TokenViewModel.m10374s2(tokenFragment.m10363o0(), tokenMeaning2, !C7777d.m15481b(tokenFragment));
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenFragment$k */
    public static final class C4797k implements InterfaceC7774a<String> {
        public C4797k() {
        }

        /* JADX WARN: Code duplicated, block: B:33:0x009d  */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // p278nh.InterfaceC7774a
        /* JADX INFO: renamed from: a */
        public final void mo9795a(String str) {
            String strM770q;
            String str2;
            String str3;
            String str4 = str;
            C5207g.m11111f(str4, "tag");
            InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
            TokenViewModel tokenViewModelM10363o0 = TokenFragment.this.m10363o0();
            if (tokenViewModelM10363o0.m10379t2(str4)) {
                String str5 = "en";
                if (C5207g.m11106a(tokenViewModelM10363o0.mo498E1(), C5408a.m11569b(LanguageLearn.Japanese))) {
                    switch (str4.hashCode()) {
                        case 689615:
                            if (!str4.equals("副詞")) {
                                str2 = "";
                            } else {
                                str2 = "adverbs";
                            }
                            break;
                        case 692777:
                            if (!str4.equals("動詞")) {
                                str2 = "";
                            } else {
                                str2 = "verb-tenses";
                            }
                            break;
                        case 702449:
                            if (!str4.equals("名詞")) {
                                str2 = "";
                            } else {
                                str2 = "nouns";
                            }
                            break;
                        case 20109844:
                            if (!str4.equals("代名詞")) {
                                str2 = "";
                            } else {
                                str2 = "pronouns";
                            }
                            break;
                        case 24229031:
                            if (!str4.equals("形容詞")) {
                                str2 = "";
                            } else {
                                str2 = "adjectives";
                            }
                            break;
                        case 25359787:
                            if (!str4.equals("指示詞")) {
                                str2 = "";
                            } else {
                                str2 = "determiners";
                            }
                            break;
                        default:
                            str2 = "";
                            break;
                    }
                    if (!C7661i.m15250P2(str2)) {
                        Object[] objArr = new Object[2];
                        UserLanguage value = tokenViewModelM10363o0.mo509w0().getValue();
                        if (value != null && (str3 = value.f21734i) != null) {
                            str5 = str3;
                        }
                        objArr[0] = str5;
                        objArr[1] = str2;
                        strM770q = C0166e.m770q(objArr, 2, "https://www.lingq.com/%s/grammar-resource/japanese/%s", "format(format, *args)");
                    } else {
                        strM770q = C0204c.m852k("https://cooljugator.com/ja/", URLEncoder.encode(str4, "utf-8"));
                    }
                } else {
                    Object[] objArr2 = new Object[3];
                    UserLanguage value2 = tokenViewModelM10363o0.mo509w0().getValue();
                    if (value2 != null) {
                        String str6 = value2.f21734i;
                        str5 = str6 != null ? str6 : "en";
                    }
                    objArr2[0] = str5;
                    objArr2[1] = tokenViewModelM10363o0.mo498E1();
                    objArr2[2] = str4;
                    strM770q = C0166e.m770q(objArr2, 3, "https://www.lingq.com/%s/grammar-resource/%s/tag/%s/", "format(format, *args)");
                }
                tokenViewModelM10363o0.f31414L0.mo14371k(strM770q);
            }
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenFragment$l */
    public static final class C4798l implements C5817g.d {
        public C4798l() {
        }

        @Override // p138gk.C5817g.d
        /* JADX INFO: renamed from: a */
        public final void mo10366a() {
            EditText editText;
            InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
            TokenFragment tokenFragment = TokenFragment.this;
            tokenFragment.m10363o0().m10378r2("");
            C8261c c8261c = tokenFragment.f31213K0;
            if (c8261c != null && (editText = (EditText) c8261c.f44631c) != null) {
                editText.setText("");
            }
            DialogInterfaceC0215b dialogInterfaceC0215b = tokenFragment.f31212J0;
            if (dialogInterfaceC0215b != null) {
                dialogInterfaceC0215b.show();
            }
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenFragment$m */
    public static final class C4799m implements Comparator {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC2056p f31234a;

        public C4799m(InterfaceC2056p interfaceC2056p) {
            C5207g.m11111f(interfaceC2056p, "function");
            this.f31234a = interfaceC2056p;
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((Number) this.f31234a.mo1337m0(obj, obj2)).intValue();
        }
    }

    public TokenFragment() {
        super(R.layout.fragment_token);
        this.f31205C0 = C4924a.m10477o0(this, TokenFragment$binding$2.f31222j);
        final InterfaceC2041a<InterfaceC1048n0> interfaceC2041a = new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.token.TokenFragment$viewModel$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return this.f31386b;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.token.TokenFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return (InterfaceC1048n0) interfaceC2041a.mo807E();
            }
        });
        this.f31206D0 = C8573r0.m16711Z(this, C5209i.m11118a(TokenViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.token.TokenFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.token.TokenFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b);
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                AbstractC9634a abstractC9634aMo792j = interfaceC1037i != null ? interfaceC1037i.mo792j() : null;
                if (abstractC9634aMo792j == null) {
                    abstractC9634aMo792j = AbstractC9634a.a.f49330b;
                }
                return abstractC9634aMo792j;
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.token.TokenFragment$special$$inlined$viewModels$default$4
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
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: O */
    public final void mo3566O() {
        this.f6090a0 = true;
        m10363o0().mo9724L();
        List<Integer> list = C6716m.f37937a;
        C6716m.m13321f(m3578a0(), m3580c0());
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        C9369l c9369l = new C9369l(25, this);
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.i.m18727u(view, c9369l);
        TokenData tokenData = m10363o0().f31431U.f34366a;
        int i10 = C4787a.f31220a[tokenData.f31181g.ordinal()];
        int i11 = 0;
        if (i10 == 1 || i10 == 2) {
            if (C7777d.m15481b(this)) {
                C8227h c8227h = new C8227h();
                c8227h.f48293c = 200L;
                m3585f0(c8227h);
                C8226g c8226g = new C8226g();
                c8226g.f48293c = 120L;
                m3591j0(c8226g);
            } else {
                C8227h c8227h2 = new C8227h();
                c8227h2.f48293c = 300L;
                m3585f0(c8227h2);
                C8227h c8227h3 = new C8227h();
                c8227h3.f48293c = 160L;
                m3591j0(c8227h3);
            }
        } else if (i10 == 3) {
            m3585f0(new C8228i(1, true));
            m3591j0(new C8228i(1, false));
        } else if (i10 == 4) {
            C8226g c8226g2 = new C8226g();
            c8226g2.f48293c = 120L;
            m3585f0(c8226g2);
            m10362n0().f45395q.m2796H(R.id.collapsedTransition, R.id.expandedTransition);
            m10362n0().f45395q.m2798J();
            m10362n0().f45390l.setRadius(0.0f);
        }
        C8371v1 c8371v1M10362n0 = m10362n0();
        if (C7777d.m15481b(this)) {
            c8371v1M10362n0.f45390l.setCardElevation(4.0f);
        }
        if (C7777d.m15481b(this) || (C7777d.m15482c(this) && m10363o0().f31431U.f34369d)) {
            m10363o0().m10384z2(TokenViewState.Expanded.f31717a);
            m10362n0().f45395q.setInteractionEnabled(false);
        } else {
            TokenMotionLayout tokenMotionLayout = m10362n0().f45395q;
            C5207g.m11110e(tokenMotionLayout, "binding.motionLayout");
            C4866c c4866c = new C4866c(this);
            if (tokenMotionLayout.f5108y0 == null) {
                tokenMotionLayout.f5108y0 = new CopyOnWriteArrayList<>();
            }
            tokenMotionLayout.f5108y0.add(c4866c);
        }
        ImageButton imageButton = c8371v1M10362n0.f45385g;
        C5207g.m11110e(imageButton, "btnStatusWithImage");
        C4924a.m10442U(imageButton);
        TextView textView = c8371v1M10362n0.f45386h;
        C5207g.m11110e(textView, "btnStatusWithText");
        C4924a.m10442U(textView);
        this.f31216N0 = textView;
        this.f31204B0 = tokenData.f31177c;
        this.f31203A0 = tokenData.f31178d;
        c8371v1M10362n0.f45391m.setOnEditorActionListener(new C4790d());
        c8371v1M10362n0.f45392n.addTextChangedListener(new C4791e());
        c8371v1M10362n0.f45373U.setOnChangeStatusListener(new C4792f());
        c8371v1M10362n0.f45374V.setOnChangeStatusListener(new C4793g());
        m3578a0();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        RecyclerView recyclerView = c8371v1M10362n0.f45400v;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.f6981M.add(new RecyclerSwipeActionsTouchListener(recyclerView, C9000b.m17252r(Integer.valueOf(R.id.ivEditLocale), Integer.valueOf(R.id.ivDelete)), c8371v1M10362n0.f45369Q, new C4794h()));
        C5816f c5816f = new C5816f(new C4795i());
        this.f31207E0 = c5816f;
        recyclerView.setAdapter(c5816f);
        Context contextM3578a0 = m3578a0();
        Object obj = C7472a.f41322a;
        recyclerView.m4199g(new C8043b(C7472a.c.m14849b(contextM3578a0, R.drawable.dr_item_divider), 0));
        recyclerView.setItemAnimator(null);
        m3578a0();
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(1);
        RecyclerView recyclerView2 = c8371v1M10362n0.f45398t;
        recyclerView2.setLayoutManager(linearLayoutManager2);
        recyclerView2.m4199g(new C8043b(C7472a.c.m14849b(m3578a0(), R.drawable.dr_item_divider), 0));
        recyclerView2.setItemAnimator(null);
        C5812b c5812b = new C5812b(new C4796j());
        this.f31208F0 = c5812b;
        recyclerView2.setAdapter(c5812b);
        m3578a0();
        LinearLayoutManager linearLayoutManager3 = new LinearLayoutManager(0);
        RecyclerView recyclerView3 = c8371v1M10362n0.f45401w;
        recyclerView3.setLayoutManager(linearLayoutManager3);
        recyclerView3.m4199g(new C8045d(15));
        C5817g c5817g = new C5817g(new C4797k(), new C4798l());
        this.f31211I0 = c5817g;
        recyclerView3.setAdapter(c5817g);
        recyclerView3.setItemAnimator(null);
        m3578a0();
        LinearLayoutManager linearLayoutManager4 = new LinearLayoutManager(0);
        RecyclerView recyclerView4 = c8371v1M10362n0.f45396r;
        recyclerView4.setLayoutManager(linearLayoutManager4);
        recyclerView4.m4199g(new C8045d(15));
        m3578a0();
        LinearLayoutManager linearLayoutManager5 = new LinearLayoutManager(0);
        RecyclerView recyclerView5 = c8371v1M10362n0.f45397s;
        recyclerView5.setLayoutManager(linearLayoutManager5);
        recyclerView5.m4199g(new C8045d(15));
        C4902a c4902a = new C4902a(new C4788b());
        this.f31209G0 = c4902a;
        recyclerView4.setAdapter(c4902a);
        C4902a c4902a2 = this.f31209G0;
        if (c4902a2 == null) {
            C5207g.m11117l("dictionariesAdapter");
            throw null;
        }
        recyclerView5.setAdapter(c4902a2);
        TokenControllerType tokenControllerType = m10363o0().f31431U.f34366a.f31181g;
        TokenControllerType tokenControllerType2 = TokenControllerType.Lesson;
        RecyclerView recyclerView6 = c8371v1M10362n0.f45399u;
        if (tokenControllerType == tokenControllerType2 || m10363o0().f31431U.f34366a.f31181g == TokenControllerType.LessonExpanded) {
            m3578a0();
            recyclerView6.setLayoutManager(new LinearLayoutManager(1));
            recyclerView6.m4199g(new C8049h(15));
            C5814d c5814d = new C5814d(new C4789c(tokenData));
            this.f31210H0 = c5814d;
            recyclerView6.setAdapter(c5814d);
        } else {
            TextView textView2 = c8371v1M10362n0.f45361I;
            C5207g.m11110e(textView2, "tvRelatedPhrasesTitle");
            C4924a.m10442U(textView2);
            TextView textView3 = c8371v1M10362n0.f45360H;
            C5207g.m11110e(textView3, "tvRelatedPhrasesEmpty");
            C4924a.m10442U(textView3);
            C5207g.m11110e(recyclerView6, "rvRelatedPhrases");
            C4924a.m10442U(recyclerView6);
        }
        c8371v1M10362n0.f45356D.setOnClickListener(new ViewOnClickListenerC5565g(this, i11));
        c8371v1M10362n0.f45380b.setOnClickListener(new ViewOnClickListenerC5062d0(22, this));
        c8371v1M10362n0.f45364L.setOnClickListener(new ViewOnClickListenerC5566h(i11, this));
        this.f31215M0 = new ArrayAdapter<>(m3576Y(), android.R.layout.simple_selectable_list_item);
        C9249b c9249b = new C9249b(m3576Y());
        List<Integer> list = C6716m.f37937a;
        c9249b.setTitle(C6716m.m13320e(R.string.lingq_tags, this));
        View viewInflate = LayoutInflater.from(mo471m()).inflate(R.layout.dialog_add_tags, (ViewGroup) null, false);
        int i12 = R.id.et_tags;
        EditText editText = (EditText) C0062b.m298P0(viewInflate, R.id.et_tags);
        if (editText != null) {
            i12 = R.id.tv_clear;
            TextView textView4 = (TextView) C0062b.m298P0(viewInflate, R.id.tv_clear);
            if (textView4 != null) {
                i12 = R.id.viewProgress;
                CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C0062b.m298P0(viewInflate, R.id.viewProgress);
                if (circularProgressIndicator != null) {
                    i12 = R.id.view_tags;
                    RecyclerView recyclerView7 = (RecyclerView) C0062b.m298P0(viewInflate, R.id.view_tags);
                    if (recyclerView7 != null) {
                        LinearLayout linearLayout = (LinearLayout) viewInflate;
                        this.f31213K0 = new C8261c(linearLayout, editText, textView4, circularProgressIndicator, recyclerView7);
                        editText.addTextChangedListener(new C5567i(this));
                        editText.setOnEditorActionListener(new C4867d(this));
                        C4924a.m10442U(textView4);
                        m3578a0();
                        recyclerView7.setLayoutManager(new LinearLayoutManager(1));
                        C5811a c5811a = new C5811a(new C4904e(this));
                        this.f31214L0 = c5811a;
                        recyclerView7.setAdapter(c5811a);
                        c9249b.setView(linearLayout);
                        c9249b.m17612e(C6716m.m13320e(R.string.ui_done, this), new DialogInterfaceOnClickListenerC10505o(1));
                        Lifecycle.State state = Lifecycle.State.STARTED;
                        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C4828x32e9dc14(this, state, null, this), 3);
                        m10363o0().m10378r2("");
                        TokenViewModel tokenViewModelM10363o0 = m10363o0();
                        C7828f.m15570d(C8573r0.m16767w0(tokenViewModelM10363o0), tokenViewModelM10363o0.f31407I, null, new TokenViewModel$updateLanguageTags$1(tokenViewModelM10363o0, null), 2);
                        this.f31212J0 = c9249b.create();
                        C7828f.m15570d(C7499b.m14906H(this), null, null, new TokenFragment$onViewCreated$8(this, null), 3).mo15620r1(new InterfaceC2052l<Throwable, C9072e>() { // from class: com.lingq.ui.token.TokenFragment$onViewCreated$9
                            {
                                super(1);
                            }

                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(Throwable th2) {
                                InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
                                this.f31362b.m10363o0().mo9745u0(true);
                                return C9072e.f47360a;
                            }
                        });
                        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C4800x8abdca4c(this, state, null, this), 3);
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i12)));
    }

    /* JADX INFO: renamed from: n0 */
    public final C8371v1 m10362n0() {
        return (C8371v1) this.f31205C0.m10489a(this, f31202R0[0]);
    }

    /* JADX INFO: renamed from: o0 */
    public final TokenViewModel m10363o0() {
        return (TokenViewModel) this.f31206D0.getValue();
    }

    /* JADX INFO: renamed from: p0 */
    public final void m10364p0(View view, int i10, Integer num) {
        new C5574p(view, i10, num, TokenControllerType.Lesson, new InterfaceC2052l<TokenStatusMenuItem, C9072e>() { // from class: com.lingq.ui.token.TokenFragment$showStatusPopup$1

            /* JADX INFO: renamed from: com.lingq.ui.token.TokenFragment$showStatusPopup$1$a */
            public /* synthetic */ class C4831a {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ int[] f31378a;

                static {
                    int[] iArr = new int[TokenStatusMenuItem.values().length];
                    try {
                        iArr[TokenStatusMenuItem.Ignore.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[TokenStatusMenuItem.New.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[TokenStatusMenuItem.Recognized.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[TokenStatusMenuItem.Familiar.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[TokenStatusMenuItem.Learned.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[TokenStatusMenuItem.Known.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    f31378a = iArr;
                }
            }

            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(TokenStatusMenuItem tokenStatusMenuItem) {
                TokenStatusMenuItem tokenStatusMenuItem2 = tokenStatusMenuItem;
                C5207g.m11111f(tokenStatusMenuItem2, "item");
                int i11 = C4831a.f31378a[tokenStatusMenuItem2.ordinal()];
                TokenFragment tokenFragment = this.f31377b;
                switch (i11) {
                    case 1:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
                        TokenViewModel.m10375y2(tokenFragment.m10363o0(), CardStatus.Ignored.getValue());
                        break;
                    case 2:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = TokenFragment.f31202R0;
                        TokenViewModel.m10375y2(tokenFragment.m10363o0(), CardStatus.New.getValue());
                        break;
                    case 3:
                        InterfaceC6727j<Object>[] interfaceC6727jArr3 = TokenFragment.f31202R0;
                        TokenViewModel.m10375y2(tokenFragment.m10363o0(), CardStatus.Recognized.getValue());
                        break;
                    case 4:
                        InterfaceC6727j<Object>[] interfaceC6727jArr4 = TokenFragment.f31202R0;
                        TokenViewModel.m10375y2(tokenFragment.m10363o0(), CardStatus.Familiar.getValue());
                        break;
                    case 5:
                        InterfaceC6727j<Object>[] interfaceC6727jArr5 = TokenFragment.f31202R0;
                        TokenViewModel.m10375y2(tokenFragment.m10363o0(), CardStatus.Learned.getValue());
                        break;
                    case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr6 = TokenFragment.f31202R0;
                        TokenViewModel.m10375y2(tokenFragment.m10363o0(), CardStatus.Known.getValue());
                        break;
                }
                return C9072e.f47360a;
            }
        });
    }
}
