package com.lingq.p055ui.home.library;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.activity.result.C0204c;
import androidx.fragment.app.Fragment;
import androidx.view.C1038i0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.InterfaceC1037i;
import androidx.view.InterfaceC1048n0;
import androidx.view.Lifecycle;
import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import no.C7828f;
import p003a2.C0009a;
import p040c4.C1681f;
import p067d8.ViewOnClickListenerC5062d0;
import p213k4.RunnableC6590j;
import p260m8.C7499b;
import p274n8.ViewOnClickListenerC7718c;
import p322pd.C8228i;
import p338qd.C8573r0;
import p427v3.AbstractC9634a;
import p512yi.AbstractC10384l;
import p512yi.C10387o;
import ph.C8334o0;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m13365d2 = {"Lcom/lingq/ui/home/library/LessonPreviewFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LessonPreviewFragment extends AbstractC10384l {

    /* JADX INFO: renamed from: D0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f24530D0 = {C0204c.m857q(LessonPreviewFragment.class, "getBinding()Lcom/lingq/databinding/FragmentLessonPreviewBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final FragmentViewBindingDelegate f24531A0;

    /* JADX INFO: renamed from: B0 */
    public final C1038i0 f24532B0;

    /* JADX INFO: renamed from: C0 */
    public final C1681f f24533C0;

    /* JADX INFO: renamed from: com.lingq.ui.home.library.LessonPreviewFragment$a */
    public final class C3744a extends WebViewClient {
        public C3744a() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonPreviewFragment.f24530D0;
            LessonPreviewFragment.this.m9931p0().f24576i.setValue(Boolean.FALSE);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonPreviewFragment.f24530D0;
            LessonPreviewFragment.this.m9931p0().f24576i.setValue(Boolean.TRUE);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.lingq.ui.home.library.LessonPreviewFragment$special$$inlined$viewModels$default$1] */
    public LessonPreviewFragment() {
        super(R.layout.fragment_lesson_preview);
        this.f24531A0 = C4924a.m10477o0(this, LessonPreviewFragment$binding$2.f24535j);
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.home.library.LessonPreviewFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.home.library.LessonPreviewFragment$special$$inlined$viewModels$default$2
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
        this.f24532B0 = C8573r0.m16711Z(this, C5209i.m11118a(LessonPreviewViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.home.library.LessonPreviewFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.home.library.LessonPreviewFragment$special$$inlined$viewModels$default$4
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
                return abstractC9634aMo792j == null ? AbstractC9634a.a.f49330b : abstractC9634aMo792j;
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.home.library.LessonPreviewFragment$special$$inlined$viewModels$default$5
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
        this.f24533C0 = new C1681f(C5209i.m11118a(C10387o.class), new InterfaceC2041a<Bundle>() { // from class: com.lingq.ui.home.library.LessonPreviewFragment$special$$inlined$navArgs$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Bundle mo807E() {
                Fragment fragment = this;
                Bundle bundle = fragment.f6101g;
                if (bundle != null) {
                    return bundle;
                }
                throw new IllegalStateException(C0166e.m764j("Fragment ", fragment, " has null arguments"));
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public static void m9929n0(LessonPreviewFragment lessonPreviewFragment) {
        C5207g.m11111f(lessonPreviewFragment, "this$0");
        LessonPreviewViewModel lessonPreviewViewModelM9931p0 = lessonPreviewFragment.m9931p0();
        C1681f c1681f = lessonPreviewFragment.f24533C0;
        int i10 = ((C10387o) c1681f.getValue()).f52177c;
        C10387o c10387o = (C10387o) c1681f.getValue();
        C10387o c10387o2 = (C10387o) c1681f.getValue();
        String str = c10387o.f52176b;
        C5207g.m11111f(str, "url");
        String str2 = c10387o2.f52175a;
        C5207g.m11111f(str2, "collectionTitle");
        C7828f.m15570d(C8573r0.m16767w0(lessonPreviewViewModelM9931p0), null, null, new LessonPreviewViewModel$importLesson$1(lessonPreviewViewModelM9931p0, str, str2, i10, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C8228i c8228iM29r = C0009a.m29r(view, "view", 1, true);
        c8228iM29r.f48293c = 300L;
        m3585f0(c8228iM29r);
        C8228i c8228i = new C8228i(1, true);
        c8228i.f48293c = 300L;
        m3587g0(c8228i);
        C8228i c8228i2 = new C8228i(1, false);
        c8228i2.f48293c = 300L;
        m3589h0(c8228i2);
        C8334o0 c8334o0M9930o0 = m9930o0();
        c8334o0M9930o0.f45097a.setOnClickListener(new ViewOnClickListenerC7718c(13, this));
        c8334o0M9930o0.f45098b.setOnClickListener(new ViewOnClickListenerC5062d0(7, this));
        view.postDelayed(new RunnableC6590j(c8334o0M9930o0, 16, this), 500L);
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C3745x6de2cf03(this, Lifecycle.State.STARTED, null, this), 3);
    }

    /* JADX INFO: renamed from: o0 */
    public final C8334o0 m9930o0() {
        return (C8334o0) this.f24531A0.m10489a(this, f24530D0[0]);
    }

    /* JADX INFO: renamed from: p0 */
    public final LessonPreviewViewModel m9931p0() {
        return (LessonPreviewViewModel) this.f24532B0.getValue();
    }
}
