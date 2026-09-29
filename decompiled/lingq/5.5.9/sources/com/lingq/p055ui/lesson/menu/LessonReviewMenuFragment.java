package com.lingq.p055ui.lesson.menu;

import android.os.Bundle;
import android.view.View;
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
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2239y;
import com.lingq.p055ui.lesson.AbstractC4269c;
import com.lingq.p055ui.lesson.LessonViewModel;
import com.lingq.p055ui.lesson.menu.LessonReviewMenuFragment;
import com.lingq.p055ui.tooltips.TooltipStep;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import dm.C5207g;
import dm.C5209i;
import java.util.WeakHashMap;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import no.C7828f;
import p003a2.C0009a;
import p067d8.ViewOnClickListenerC5062d0;
import p118fe.C5509a;
import p224kj.AbstractC6701c;
import p260m8.C7499b;
import p274n8.ViewOnClickListenerC7718c;
import p278nh.C7777d;
import p322pd.C8227h;
import p338qd.C8573r0;
import p427v3.AbstractC9634a;
import p471x2.C10029b0;
import p471x2.C10049l0;
import ph.C8340p0;
import sl.C9072e;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/lesson/menu/LessonReviewMenuFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LessonReviewMenuFragment extends AbstractC6701c {

    /* JADX INFO: renamed from: D0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f28270D0 = {C0204c.m857q(LessonReviewMenuFragment.class, "getBinding()Lcom/lingq/databinding/FragmentLessonReviewMenuBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final FragmentViewBindingDelegate f28271A0 = C4924a.m10477o0(this, LessonReviewMenuFragment$binding$2.f28274j);

    /* JADX INFO: renamed from: B0 */
    public final C1038i0 f28272B0;

    /* JADX INFO: renamed from: C0 */
    public final C1038i0 f28273C0;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.lingq.ui.lesson.menu.LessonReviewMenuFragment$special$$inlined$viewModels$default$1] */
    public LessonReviewMenuFragment() {
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.lesson.menu.LessonReviewMenuFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(lazyThreadSafetyMode, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.lesson.menu.LessonReviewMenuFragment$special$$inlined$viewModels$default$2
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
        this.f28272B0 = C8573r0.m16711Z(this, C5209i.m11118a(LessonReviewMenuViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.lesson.menu.LessonReviewMenuFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.lesson.menu.LessonReviewMenuFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.lesson.menu.LessonReviewMenuFragment$special$$inlined$viewModels$default$5
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
        final InterfaceC2041a<InterfaceC1048n0> interfaceC2041a = new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.lesson.menu.LessonReviewMenuFragment$lessonViewModel$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return this.f28275b.m3579b0();
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b2 = C6740a.m13373b(lazyThreadSafetyMode, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.lesson.menu.LessonReviewMenuFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return (InterfaceC1048n0) interfaceC2041a.mo807E();
            }
        });
        this.f28273C0 = C8573r0.m16711Z(this, C5209i.m11118a(LessonViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.lesson.menu.LessonReviewMenuFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b2, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.lesson.menu.LessonReviewMenuFragment$special$$inlined$viewModels$default$8
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
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.lesson.menu.LessonReviewMenuFragment$special$$inlined$viewModels$default$9
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
    /* JADX INFO: renamed from: O */
    public final void mo3566O() {
        this.f6090a0 = true;
        m10186p0().mo9722H1(TooltipStep.ReviewMenu);
        m10186p0().mo9724L();
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        C5509a c5509a = new C5509a(15, this);
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.i.m18727u(view, c5509a);
        C8227h c8227h = new C8227h();
        c8227h.f48293c = 200L;
        m3585f0(c8227h);
        C8227h c8227h2 = new C8227h();
        c8227h2.f48293c = 100L;
        m3587g0(c8227h2);
        C8340p0 c8340p0M10184n0 = m10184n0();
        final int i10 = 0;
        c8340p0M10184n0.f45132k.setOnClickListener(new View.OnClickListener(this) { // from class: kj.d

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LessonReviewMenuFragment f37889b;

            {
                this.f37889b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                LessonReviewMenuFragment lessonReviewMenuFragment = this.f37889b;
                switch (i11) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = LessonReviewMenuFragment.f28270D0;
                        C5207g.m11111f(lessonReviewMenuFragment, "this$0");
                        lessonReviewMenuFragment.m3598r().m3627S();
                        break;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = LessonReviewMenuFragment.f28270D0;
                        C5207g.m11111f(lessonReviewMenuFragment, "this$0");
                        lessonReviewMenuFragment.m3598r().m3627S();
                        lessonReviewMenuFragment.m10185o0().m10134A2(AbstractC4269c.h.f27856a);
                        break;
                }
            }
        });
        c8340p0M10184n0.f45127f.setOnClickListener(new ViewOnClickListenerC2239y(26, this));
        c8340p0M10184n0.f45126e.setOnClickListener(new ViewOnClickListenerC7718c(23, this));
        c8340p0M10184n0.f45125d.setOnClickListener(new ViewOnClickListenerC5062d0(11, this));
        boolean zM15481b = C7777d.m15481b(this);
        TextView textView = c8340p0M10184n0.f45128g;
        if (zM15481b) {
            C5207g.m11110e(textView, "tvVocabulary");
            C4924a.m10442U(textView);
        } else {
            final int i11 = 1;
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: kj.d

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ LessonReviewMenuFragment f37889b;

                {
                    this.f37889b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i12 = i11;
                    LessonReviewMenuFragment lessonReviewMenuFragment = this.f37889b;
                    switch (i12) {
                        case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonReviewMenuFragment.f28270D0;
                            C5207g.m11111f(lessonReviewMenuFragment, "this$0");
                            lessonReviewMenuFragment.m3598r().m3627S();
                            break;
                        default:
                            InterfaceC6727j<Object>[] interfaceC6727jArr2 = LessonReviewMenuFragment.f28270D0;
                            C5207g.m11111f(lessonReviewMenuFragment, "this$0");
                            lessonReviewMenuFragment.m3598r().m3627S();
                            lessonReviewMenuFragment.m10185o0().m10134A2(AbstractC4269c.h.f27856a);
                            break;
                    }
                }
            });
        }
        C7828f.m15570d(C7499b.m14906H(this), null, null, new LessonReviewMenuFragment$onViewCreated$5(this, null), 3).mo15620r1(new InterfaceC2052l<Throwable, C9072e>() { // from class: com.lingq.ui.lesson.menu.LessonReviewMenuFragment$onViewCreated$6
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(Throwable th2) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = LessonReviewMenuFragment.f28270D0;
                this.f28286b.m10185o0().mo9745u0(true);
                return C9072e.f47360a;
            }
        });
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C4326xd0ccf142(this, Lifecycle.State.STARTED, null, this), 3);
        LessonReviewMenuViewModel lessonReviewMenuViewModelM10186p0 = m10186p0();
        C7828f.m15570d(C8573r0.m16767w0(lessonReviewMenuViewModelM10186p0), null, null, new LessonReviewMenuViewModel$showReviewTooltip$1(lessonReviewMenuViewModelM10186p0, null), 3);
    }

    /* JADX INFO: renamed from: n0 */
    public final C8340p0 m10184n0() {
        return (C8340p0) this.f28271A0.m10489a(this, f28270D0[0]);
    }

    /* JADX INFO: renamed from: o0 */
    public final LessonViewModel m10185o0() {
        return (LessonViewModel) this.f28273C0.getValue();
    }

    /* JADX INFO: renamed from: p0 */
    public final LessonReviewMenuViewModel m10186p0() {
        return (LessonReviewMenuViewModel) this.f28272B0.getValue();
    }
}
