package com.lingq.p055ui.lesson.tutorial;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.fragment.app.Fragment;
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
import com.android.installreferrer.api.InstallReferrerClient;
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2238x;
import com.lingq.p055ui.lesson.LessonViewModel;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import li.C7378e;
import ni.C7796d;
import no.C7828f;
import p003a2.C0009a;
import p067d8.ViewOnClickListenerC5062d0;
import p199jd.ViewOnClickListenerC6464i;
import p225kk.C6704a;
import p225kk.C6716m;
import p254m2.C7472a;
import p260m8.C7499b;
import p265mj.C7567a;
import p265mj.C7570d;
import p274n8.ViewOnClickListenerC7718c;
import p301oh.C8043b;
import p322pd.C8228i;
import p338qd.C8573r0;
import p344qj.AbstractC8637b;
import p385sf.C9000b;
import p402u0.C9371n;
import p427v3.AbstractC9634a;
import p471x2.C10029b0;
import p471x2.C10049l0;
import ph.C8292h0;
import sl.C9072e;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/lesson/tutorial/LessonDealWithWordsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LessonDealWithWordsFragment extends AbstractC8637b {

    /* JADX INFO: renamed from: F0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f29086F0 = {C0204c.m857q(LessonDealWithWordsFragment.class, "getBinding()Lcom/lingq/databinding/FragmentLessonDealWithWordsBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final FragmentViewBindingDelegate f29087A0 = C4924a.m10477o0(this, LessonDealWithWordsFragment$binding$2.f29093j);

    /* JADX INFO: renamed from: B0 */
    public final C1038i0 f29088B0;

    /* JADX INFO: renamed from: C0 */
    public final C1038i0 f29089C0;

    /* JADX INFO: renamed from: D0 */
    public C6704a f29090D0;

    /* JADX INFO: renamed from: E0 */
    public C7796d f29091E0;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.tutorial.LessonDealWithWordsFragment$a */
    public static final class C4437a implements C4465a.c {
        public C4437a() {
        }

        @Override // com.lingq.p055ui.lesson.tutorial.C4465a.c
        /* JADX INFO: renamed from: a */
        public final void mo10227a(C7378e c7378e) {
            Object next;
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonDealWithWordsFragment.f29086F0;
            LessonDealWithWordsFragment lessonDealWithWordsFragment = LessonDealWithWordsFragment.this;
            Iterator<T> it = ((C7567a) ((List) lessonDealWithWordsFragment.m10225o0().f27427Q0.getValue()).get(lessonDealWithWordsFragment.m10226p0().f29150k == -1 ? lessonDealWithWordsFragment.m10225o0().m10147t2() : lessonDealWithWordsFragment.m10226p0().f29150k)).f41703c.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((C7570d) next).f41732l == c7378e.f41173g));
            C7570d c7570d = (C7570d) next;
            LessonDealWithWordsViewModel lessonDealWithWordsViewModelM10226p0 = lessonDealWithWordsFragment.m10226p0();
            int iM10152y2 = lessonDealWithWordsFragment.m10225o0().m10152y2();
            String str = lessonDealWithWordsFragment.m10225o0().m10148u2(lessonDealWithWordsFragment.m10226p0().f29150k == -1 ? lessonDealWithWordsFragment.m10225o0().m10147t2() : lessonDealWithWordsFragment.m10226p0().f29150k, c7570d != null ? C9000b.m17251q(c7570d) : EmptyList.f38032a).f27865a;
            C5207g.m11111f(str, "fragment");
            C7828f.m15570d(C8573r0.m16767w0(lessonDealWithWordsViewModelM10226p0), null, null, new LessonDealWithWordsViewModel$onAddMeaning$1(lessonDealWithWordsViewModelM10226p0, c7378e, iM10152y2, str, null), 3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.lingq.ui.lesson.tutorial.LessonDealWithWordsFragment$special$$inlined$viewModels$default$1] */
    public LessonDealWithWordsFragment() {
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.lesson.tutorial.LessonDealWithWordsFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(lazyThreadSafetyMode, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.lesson.tutorial.LessonDealWithWordsFragment$special$$inlined$viewModels$default$2
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
        this.f29088B0 = C8573r0.m16711Z(this, C5209i.m11118a(LessonDealWithWordsViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.lesson.tutorial.LessonDealWithWordsFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.lesson.tutorial.LessonDealWithWordsFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.lesson.tutorial.LessonDealWithWordsFragment$special$$inlined$viewModels$default$5
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
        final InterfaceC2041a<InterfaceC1048n0> interfaceC2041a = new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.lesson.tutorial.LessonDealWithWordsFragment$lessonViewModel$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return this.f29094b.m3579b0();
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b2 = C6740a.m13373b(lazyThreadSafetyMode, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.lesson.tutorial.LessonDealWithWordsFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return (InterfaceC1048n0) interfaceC2041a.mo807E();
            }
        });
        this.f29089C0 = C8573r0.m16711Z(this, C5209i.m11118a(LessonViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.lesson.tutorial.LessonDealWithWordsFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b2, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.lesson.tutorial.LessonDealWithWordsFragment$special$$inlined$viewModels$default$8
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b2);
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                AbstractC9634a abstractC9634aMo792j = interfaceC1037i != null ? interfaceC1037i.mo792j() : null;
                if (abstractC9634aMo792j == null) {
                    abstractC9634aMo792j = AbstractC9634a.a.f49330b;
                }
                return abstractC9634aMo792j;
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.lesson.tutorial.LessonDealWithWordsFragment$special$$inlined$viewModels$default$9
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
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        int i10 = 17;
        C9371n c9371n = new C9371n(i10, this);
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.i.m18727u(view, c9371n);
        C8228i c8228i = new C8228i(1, true);
        c8228i.f48293c = 300L;
        m3585f0(c8228i);
        C8228i c8228i2 = new C8228i(1, true);
        c8228i2.f48293c = 200L;
        m3587g0(c8228i2);
        C4465a c4465a = new C4465a(new C4437a());
        C6704a c6704a = this.f29090D0;
        if (c6704a == null) {
            C5207g.m11117l("appSettings");
            throw null;
        }
        SharedPreferences sharedPreferences = c6704a.f37891b;
        sharedPreferences.edit().putInt("pagingDealWithWordsTimes", sharedPreferences.getInt("pagingDealWithWordsTimes", 0) + 1).apply();
        C8292h0 c8292h0M10224n0 = m10224n0();
        C6704a c6704a2 = this.f29090D0;
        if (c6704a2 == null) {
            C5207g.m11117l("appSettings");
            throw null;
        }
        if (c6704a2.f37891b.getInt("pagingDealWithWordsTimes", 0) >= 2) {
            TextView textView = c8292h0M10224n0.f44836e;
            C5207g.m11110e(textView, "tvDontShowAgain");
            C4924a.m10457e0(textView);
            c8292h0M10224n0.f44836e.setOnClickListener(new ViewOnClickListenerC6464i(this, i10, c8292h0M10224n0));
        } else {
            TextView textView2 = c8292h0M10224n0.f44836e;
            C5207g.m11110e(textView2, "tvDontShowAgain");
            C4924a.m10442U(textView2);
        }
        c8292h0M10224n0.f44838g.setOnClickListener(new ViewOnClickListenerC7718c(25, this));
        c8292h0M10224n0.f44832a.setOnClickListener(new ViewOnClickListenerC5062d0(13, this));
        c8292h0M10224n0.f44833b.setOnClickListener(new ViewOnClickListenerC2238x(20, this));
        m3578a0();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        RecyclerView recyclerView = c8292h0M10224n0.f44835d;
        recyclerView.setLayoutManager(linearLayoutManager);
        Context contextM3578a0 = m3578a0();
        Object obj = C7472a.f41322a;
        Drawable drawableM14849b = C7472a.c.m14849b(contextM3578a0, R.drawable.dr_item_divider);
        List<Integer> list = C6716m.f37937a;
        recyclerView.m4199g(new C8043b(drawableM14849b, (int) C6716m.m13316a(16)));
        recyclerView.setAdapter(c4465a);
        C7828f.m15570d(C7499b.m14906H(this), null, null, new LessonDealWithWordsFragment$onViewCreated$5(this, null), 3).mo15620r1(new InterfaceC2052l<Throwable, C9072e>() { // from class: com.lingq.ui.lesson.tutorial.LessonDealWithWordsFragment$onViewCreated$6
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(Throwable th2) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = LessonDealWithWordsFragment.f29086F0;
                this.f29106b.m10225o0().mo9731b0(true);
                return C9072e.f47360a;
            }
        });
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C4438x8b9cc0f2(this, Lifecycle.State.STARTED, null, this, c4465a), 3);
    }

    /* JADX INFO: renamed from: n0 */
    public final C8292h0 m10224n0() {
        return (C8292h0) this.f29087A0.m10489a(this, f29086F0[0]);
    }

    /* JADX INFO: renamed from: o0 */
    public final LessonViewModel m10225o0() {
        return (LessonViewModel) this.f29089C0.getValue();
    }

    /* JADX INFO: renamed from: p0 */
    public final LessonDealWithWordsViewModel m10226p0() {
        return (LessonDealWithWordsViewModel) this.f29088B0.getValue();
    }
}
