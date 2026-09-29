package com.lingq.p055ui.lesson.edit;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
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
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import java.util.Comparator;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlowImpl;
import no.C7828f;
import p003a2.C0009a;
import p204jj.AbstractC6482c;
import p225kk.C6716m;
import p260m8.C7499b;
import p274n8.DialogInterfaceOnClickListenerC7720e;
import p301oh.C8049h;
import p338qd.C8573r0;
import p427v3.AbstractC9634a;
import ph.C8310k0;
import sl.InterfaceC9070c;
import tc.C9249b;
import vi.DialogInterfaceOnClickListenerC9729d;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m13365d2 = {"Lcom/lingq/ui/lesson/edit/SentenceEditPageFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class SentenceEditPageFragment extends AbstractC6482c {

    /* JADX INFO: renamed from: A0 */
    public final FragmentViewBindingDelegate f27988A0 = C4924a.m10477o0(this, SentenceEditPageFragment$binding$2.f27993j);

    /* JADX INFO: renamed from: B0 */
    public final C1038i0 f27989B0;

    /* JADX INFO: renamed from: C0 */
    public SentenceEditPageAdapter f27990C0;

    /* JADX INFO: renamed from: D0 */
    public ArrayAdapter<String> f27991D0;

    /* JADX INFO: renamed from: F0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f27987F0 = {C0204c.m857q(SentenceEditPageFragment.class, "getBinding()Lcom/lingq/databinding/FragmentLessonEditSentenceBinding;")};

    /* JADX INFO: renamed from: E0 */
    public static final C4294a f27986E0 = new C4294a();

    /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.SentenceEditPageFragment$a */
    public static final class C4294a {
    }

    /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.SentenceEditPageFragment$b */
    public static final class C4295b implements SentenceEditPageAdapter.InterfaceC4293d {
        public C4295b() {
        }

        @Override // com.lingq.p055ui.lesson.edit.SentenceEditPageAdapter.InterfaceC4293d
        /* JADX INFO: renamed from: a */
        public final void mo10166a(int i10) {
            C4294a c4294a = SentenceEditPageFragment.f27986E0;
            SentenceEditPageViewModel sentenceEditPageViewModelM10179o0 = SentenceEditPageFragment.this.m10179o0();
            C7828f.m15570d(C8573r0.m16767w0(sentenceEditPageViewModelM10179o0), null, null, new SentenceEditPageViewModel$editAudio$1(sentenceEditPageViewModelM10179o0, i10, 0, null), 3);
        }

        @Override // com.lingq.p055ui.lesson.edit.SentenceEditPageAdapter.InterfaceC4293d
        /* JADX INFO: renamed from: b */
        public final void mo10167b(int i10) {
            C4294a c4294a = SentenceEditPageFragment.f27986E0;
            SentenceEditPageViewModel sentenceEditPageViewModelM10179o0 = SentenceEditPageFragment.this.m10179o0();
            C7828f.m15570d(C8573r0.m16767w0(sentenceEditPageViewModelM10179o0), null, null, new SentenceEditPageViewModel$setAudioTimestamp$1(sentenceEditPageViewModelM10179o0, i10, 0, null), 3);
        }

        @Override // com.lingq.p055ui.lesson.edit.SentenceEditPageAdapter.InterfaceC4293d
        /* JADX INFO: renamed from: c */
        public final void mo10168c(String str) {
            C4294a c4294a = SentenceEditPageFragment.f27986E0;
            SentenceEditPageViewModel sentenceEditPageViewModelM10179o0 = SentenceEditPageFragment.this.m10179o0();
            C4924a.m10450b(sentenceEditPageViewModelM10179o0.f28018K);
            sentenceEditPageViewModelM10179o0.f28018K = C7828f.m15570d(C8573r0.m16767w0(sentenceEditPageViewModelM10179o0), null, null, new SentenceEditPageViewModel$editNotes$1(sentenceEditPageViewModelM10179o0, str, null), 3);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // com.lingq.p055ui.lesson.edit.SentenceEditPageAdapter.InterfaceC4293d
        /* JADX INFO: renamed from: d */
        public final void mo10169d() {
            C4294a c4294a = SentenceEditPageFragment.f27986E0;
            SentenceEditPageFragment sentenceEditPageFragment = SentenceEditPageFragment.this;
            C9249b c9249b = new C9249b(sentenceEditPageFragment.m3578a0());
            List<Integer> list = C6716m.f37937a;
            c9249b.setTitle(C6716m.m13320e(R.string.settings_dictionary_languages, sentenceEditPageFragment));
            c9249b.m17610c(C6716m.m13320e(R.string.ui_cancel, sentenceEditPageFragment), new DialogInterfaceOnClickListenerC9729d(1));
            ArrayAdapter<String> arrayAdapter = sentenceEditPageFragment.f27991D0;
            if (arrayAdapter == null) {
                C5207g.m11117l("localesAdapter");
                throw null;
            }
            c9249b.m17613f(arrayAdapter, 0, new DialogInterfaceOnClickListenerC7720e(2, sentenceEditPageFragment));
            c9249b.m876a();
        }

        @Override // com.lingq.p055ui.lesson.edit.SentenceEditPageAdapter.InterfaceC4293d
        /* JADX INFO: renamed from: e */
        public final void mo10170e(String str) {
            C4294a c4294a = SentenceEditPageFragment.f27986E0;
            SentenceEditPageViewModel sentenceEditPageViewModelM10179o0 = SentenceEditPageFragment.this.m10179o0();
            C4924a.m10450b(sentenceEditPageViewModelM10179o0.f28018K);
            sentenceEditPageViewModelM10179o0.f28018K = C7828f.m15570d(C8573r0.m16767w0(sentenceEditPageViewModelM10179o0), null, null, new SentenceEditPageViewModel$editSentence$1(sentenceEditPageViewModelM10179o0, str, null), 3);
        }

        @Override // com.lingq.p055ui.lesson.edit.SentenceEditPageAdapter.InterfaceC4293d
        /* JADX INFO: renamed from: f */
        public final void mo10171f() {
            C4294a c4294a = SentenceEditPageFragment.f27986E0;
            StateFlowImpl stateFlowImpl = SentenceEditPageFragment.this.m10179o0().f28015H;
            stateFlowImpl.setValue(Boolean.valueOf(!((Boolean) stateFlowImpl.getValue()).booleanValue()));
        }

        @Override // com.lingq.p055ui.lesson.edit.SentenceEditPageAdapter.InterfaceC4293d
        /* JADX INFO: renamed from: g */
        public final void mo10172g(int i10) {
            C4294a c4294a = SentenceEditPageFragment.f27986E0;
            SentenceEditPageViewModel sentenceEditPageViewModelM10179o0 = SentenceEditPageFragment.this.m10179o0();
            C7828f.m15570d(C8573r0.m16767w0(sentenceEditPageViewModelM10179o0), null, null, new SentenceEditPageViewModel$setAudioTimestamp$1(sentenceEditPageViewModelM10179o0, i10, 1, null), 3);
        }

        @Override // com.lingq.p055ui.lesson.edit.SentenceEditPageAdapter.InterfaceC4293d
        /* JADX INFO: renamed from: h */
        public final void mo10173h(int i10) {
            C4294a c4294a = SentenceEditPageFragment.f27986E0;
            SentenceEditPageViewModel sentenceEditPageViewModelM10179o0 = SentenceEditPageFragment.this.m10179o0();
            C7828f.m15570d(C8573r0.m16767w0(sentenceEditPageViewModelM10179o0), null, null, new SentenceEditPageViewModel$editAudio$1(sentenceEditPageViewModelM10179o0, i10, 1, null), 3);
        }

        @Override // com.lingq.p055ui.lesson.edit.SentenceEditPageAdapter.InterfaceC4293d
        /* JADX INFO: renamed from: i */
        public final void mo10174i(String str, String str2) {
            C5207g.m11111f(str, "language");
            C4294a c4294a = SentenceEditPageFragment.f27986E0;
            SentenceEditPageFragment.this.m10179o0().m10180l2(str, str2);
        }

        @Override // com.lingq.p055ui.lesson.edit.SentenceEditPageAdapter.InterfaceC4293d
        /* JADX INFO: renamed from: j */
        public final void mo10175j() {
            C4294a c4294a = SentenceEditPageFragment.f27986E0;
            SentenceEditPageViewModel sentenceEditPageViewModelM10179o0 = SentenceEditPageFragment.this.m10179o0();
            C7828f.m15570d(C8573r0.m16767w0(sentenceEditPageViewModelM10179o0), null, null, new SentenceEditPageViewModel$copyPrevious$1(sentenceEditPageViewModelM10179o0, null), 3);
        }

        @Override // com.lingq.p055ui.lesson.edit.SentenceEditPageAdapter.InterfaceC4293d
        /* JADX INFO: renamed from: k */
        public final void mo10176k() {
            C4294a c4294a = SentenceEditPageFragment.f27986E0;
            SentenceEditPageViewModel sentenceEditPageViewModelM10179o0 = SentenceEditPageFragment.this.m10179o0();
            C7828f.m15570d(C8573r0.m16767w0(sentenceEditPageViewModelM10179o0), null, null, new SentenceEditPageViewModel$startPlusThree$1(sentenceEditPageViewModelM10179o0, null), 3);
        }

        @Override // com.lingq.p055ui.lesson.edit.SentenceEditPageAdapter.InterfaceC4293d
        /* JADX INFO: renamed from: l */
        public final void mo10177l() {
            C4294a c4294a = SentenceEditPageFragment.f27986E0;
            SentenceEditPageViewModel sentenceEditPageViewModelM10179o0 = SentenceEditPageFragment.this.m10179o0();
            StateFlowImpl stateFlowImpl = sentenceEditPageViewModelM10179o0.f28016I;
            stateFlowImpl.setValue(Boolean.valueOf(!((Boolean) stateFlowImpl.getValue()).booleanValue()));
            C7828f.m15570d(C8573r0.m16767w0(sentenceEditPageViewModelM10179o0), null, null, new SentenceEditPageViewModel$onAudioClicked$1(sentenceEditPageViewModelM10179o0, null), 3);
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.SentenceEditPageFragment$c */
    public static final class C4296c implements Comparator {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC2056p f27994a;

        public C4296c(InterfaceC2056p interfaceC2056p) {
            C5207g.m11111f(interfaceC2056p, "function");
            this.f27994a = interfaceC2056p;
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((Number) this.f27994a.mo1337m0(obj, obj2)).intValue();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.lingq.ui.lesson.edit.SentenceEditPageFragment$special$$inlined$viewModels$default$1] */
    public SentenceEditPageFragment() {
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.lesson.edit.SentenceEditPageFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.lesson.edit.SentenceEditPageFragment$special$$inlined$viewModels$default$2
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
        this.f27989B0 = C8573r0.m16711Z(this, C5209i.m11118a(SentenceEditPageViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.lesson.edit.SentenceEditPageFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.lesson.edit.SentenceEditPageFragment$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b);
                AbstractC9634a abstractC9634aMo792j = null;
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                if (interfaceC1037i != null) {
                    abstractC9634aMo792j = interfaceC1037i.mo792j();
                }
                if (abstractC9634aMo792j == null) {
                    abstractC9634aMo792j = AbstractC9634a.a.f49330b;
                }
                return abstractC9634aMo792j;
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.lesson.edit.SentenceEditPageFragment$special$$inlined$viewModels$default$5
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
        m10179o0().f28024f.mo9336K();
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        RecyclerView.AbstractC1117j itemAnimator = m10178n0().f44947a.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f7080f = 0L;
        }
        m10178n0().f44947a.setItemAnimator(null);
        RecyclerView recyclerView = m10178n0().f44947a;
        m3578a0();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        RecyclerView recyclerView2 = m10178n0().f44947a;
        List<Integer> list = C6716m.f37937a;
        recyclerView2.m4199g(new C8049h((int) C6716m.m13316a(16)));
        this.f27990C0 = new SentenceEditPageAdapter(new C4295b());
        RecyclerView recyclerView3 = m10178n0().f44947a;
        SentenceEditPageAdapter sentenceEditPageAdapter = this.f27990C0;
        if (sentenceEditPageAdapter == null) {
            C5207g.m11117l("adapter");
            throw null;
        }
        recyclerView3.setAdapter(sentenceEditPageAdapter);
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C4297x390f3c0f(this, Lifecycle.State.STARTED, null, this), 3);
    }

    /* JADX INFO: renamed from: n0 */
    public final C8310k0 m10178n0() {
        return (C8310k0) this.f27988A0.m10489a(this, f27987F0[0]);
    }

    /* JADX INFO: renamed from: o0 */
    public final SentenceEditPageViewModel m10179o0() {
        return (SentenceEditPageViewModel) this.f27989B0.getValue();
    }
}
