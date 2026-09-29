package com.lingq.p055ui.token;

import ae.C0062b;
import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.LanguageLearnBeta;
import com.lingq.shared.uimodel.language.UserDictionaryLocale;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lk.C7385a;
import no.C7828f;
import no.InterfaceC7882z;
import p003a2.C0009a;
import p096ei.C5408a;
import p225kk.C6716m;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenFragment$onViewCreated$10$10", m19206f = "TokenFragment.kt", m19207l = {702}, m19208m = "invokeSuspend")
public final class TokenFragment$onViewCreated$10$10 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31245e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TokenFragment f31246f;

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenFragment$onViewCreated$10$10$1 */
    @Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052$\u0010\u0004\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Triple;", "", "Lcom/lingq/shared/uimodel/language/UserDictionaryLocale;", "", "<name for destructuring parameter 0>", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenFragment$onViewCreated$10$10$1", m19206f = "TokenFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C48021 extends SuspendLambda implements InterfaceC2056p<Triple<? extends List<? extends UserDictionaryLocale>, ? extends List<? extends String>, ? extends String>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f31247e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ TokenFragment f31248f;

        /* JADX INFO: renamed from: com.lingq.ui.token.TokenFragment$onViewCreated$10$10$1$a */
        public static final class a implements AdapterView.OnItemSelectedListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ TokenFragment f31249a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ List<String> f31250b;

            public a(TokenFragment tokenFragment, List<String> list) {
                this.f31249a = tokenFragment;
                this.f31250b = list;
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
                View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
                TextView textView = childAt instanceof TextView ? (TextView) childAt : null;
                TokenFragment tokenFragment = this.f31249a;
                if (textView != null) {
                    List<Integer> list = C6716m.f37937a;
                    textView.setTextColor(C6716m.m13333r(R.attr.primaryTextColor, tokenFragment.m3578a0()));
                }
                String str = this.f31250b.get(i10);
                InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
                TokenViewModel tokenViewModelM10363o0 = tokenFragment.m10363o0();
                C5207g.m11111f(str, "selected");
                C7828f.m15570d(C8573r0.m16767w0(tokenViewModelM10363o0), null, null, new TokenViewModel$onPopularMeaningsLocaleChanged$1(tokenViewModelM10363o0, str, null), 3);
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onNothingSelected(AdapterView<?> adapterView) {
                C5207g.m11111f(adapterView, "adapterView");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48021(TokenFragment tokenFragment, InterfaceC9968c<? super C48021> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f31248f = tokenFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C48021 c48021 = new C48021(this.f31248f, interfaceC9968c);
            c48021.f31247e = obj;
            return c48021;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Triple<? extends List<? extends UserDictionaryLocale>, ? extends List<? extends String>, ? extends String> triple, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C48021) mo1336a(triple, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Triple triple = (Triple) this.f31247e;
            List<String> list = (List) triple.f38022b;
            String str = (String) triple.f38023c;
            int size = list.size();
            TokenFragment tokenFragment = this.f31248f;
            if (size > 1) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
                LinearLayout linearLayout = tokenFragment.m10362n0().f45403y;
                C5207g.m11110e(linearLayout, "binding.spinnerLayout");
                C4924a.m10457e0(linearLayout);
                Context contextM3578a0 = tokenFragment.m3578a0();
                ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
                for (String str2 : list) {
                    if (C5207g.m11106a(str2, C5408a.m11570c(LanguageLearnBeta.ChineseTraditional))) {
                        str2 = "zh_t";
                    }
                    C0009a.m30s(tokenFragment.m3578a0().getResources().getIdentifier(C0204c.m852k("ic_flag_", str2), "drawable", tokenFragment.m3578a0().getPackageName()), arrayList);
                }
                Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[0]);
                ArrayList arrayList2 = new ArrayList(C9325m.m17681z(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(C4924a.m10439R(tokenFragment.m3578a0(), (String) it.next()));
                }
                C7385a c7385a = new C7385a(contextM3578a0, numArr, arrayList2);
                c7385a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                tokenFragment.m10362n0().f45402x.setAdapter((SpinnerAdapter) c7385a);
                tokenFragment.m10362n0().f45402x.setSelection(list.indexOf(str));
                tokenFragment.m10362n0().f45402x.setOnItemSelectedListener(new a(tokenFragment, list));
            } else {
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = TokenFragment.f31202R0;
                LinearLayout linearLayout2 = tokenFragment.m10362n0().f45403y;
                C5207g.m11110e(linearLayout2, "binding.spinnerLayout");
                C4924a.m10442U(linearLayout2);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenFragment$onViewCreated$10$10(TokenFragment tokenFragment, InterfaceC9968c<? super TokenFragment$onViewCreated$10$10> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31246f = tokenFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new TokenFragment$onViewCreated$10$10(this.f31246f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((TokenFragment$onViewCreated$10$10) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31245e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
            TokenFragment tokenFragment = this.f31246f;
            TokenViewModel tokenViewModelM10363o0 = tokenFragment.m10363o0();
            C48021 c48021 = new C48021(tokenFragment, null);
            this.f31245e = 1;
            if (C0062b.m369m0(tokenViewModelM10363o0.f31466r0, c48021, this) == coroutineSingletons) {
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
