package com.lingq.p055ui.info;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
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
import com.android.installreferrer.api.InstallReferrerClient;
import com.bumptech.glide.ComponentCallbacks2C2080b;
import com.bumptech.glide.load.engine.GlideException;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.lingq.p055ui.home.HomeViewModel;
import com.lingq.shared.uimodel.library.LessonInfo;
import com.lingq.shared.uimodel.library.LibraryItemCounter;
import com.lingq.util.C4924a;
import com.lingq.util.ImageSize;
import com.lingq.util.ViewsUtilsKt;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import mo.C7661i;
import no.C7828f;
import p003a2.C0009a;
import p040c4.C1681f;
import p137gj.AbstractC5805a;
import p137gj.C5808d;
import p137gj.C5810f;
import p171i6.InterfaceC6201f;
import p260m8.C7499b;
import p338qd.C8573r0;
import p427v3.AbstractC9634a;
import ph.C8328n0;
import sl.C9072e;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/info/LessonInfoFragment;", "Lcom/google/android/material/bottomsheet/c;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LessonInfoFragment extends AbstractC5805a {

    /* JADX INFO: renamed from: X0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f26838X0 = {C0204c.m857q(LessonInfoFragment.class, "getBinding()Lcom/lingq/databinding/FragmentLessonInfoBinding;")};

    /* JADX INFO: renamed from: Q0 */
    public final FragmentViewBindingDelegate f26839Q0 = C4924a.m10477o0(this, LessonInfoFragment$binding$2.f26848j);

    /* JADX INFO: renamed from: R0 */
    public final C1038i0 f26840R0 = C8573r0.m16711Z(this, C5209i.m11118a(HomeViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.info.LessonInfoFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // cm.InterfaceC2041a
        /* JADX INFO: renamed from: E */
        public final C1046m0 mo807E() {
            C1046m0 c1046m0Mo796n = this.m3576Y().mo796n();
            C5207g.m11110e(c1046m0Mo796n, "requireActivity().viewModelStore");
            return c1046m0Mo796n;
        }
    }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.info.LessonInfoFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        @Override // cm.InterfaceC2041a
        /* JADX INFO: renamed from: E */
        public final AbstractC9634a mo807E() {
            return this.m3576Y().mo792j();
        }
    }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.info.LessonInfoFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // cm.InterfaceC2041a
        /* JADX INFO: renamed from: E */
        public final C1042k0.b mo807E() {
            C1042k0.b bVarMo470i = this.m3576Y().mo470i();
            C5207g.m11110e(bVarMo470i, "requireActivity().defaultViewModelProviderFactory");
            return bVarMo470i;
        }
    });

    /* JADX INFO: renamed from: S0 */
    public final C1038i0 f26841S0;

    /* JADX INFO: renamed from: T0 */
    public final C1681f f26842T0;

    /* JADX INFO: renamed from: U0 */
    public C5810f f26843U0;

    /* JADX INFO: renamed from: V0 */
    public boolean f26844V0;

    /* JADX INFO: renamed from: W0 */
    public boolean f26845W0;

    /* JADX INFO: renamed from: com.lingq.ui.info.LessonInfoFragment$a */
    public static final class C4133a implements InterfaceC6201f<Bitmap> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f26846a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LessonInfoFragment f26847b;

        public C4133a(String str, LessonInfoFragment lessonInfoFragment) {
            this.f26846a = str;
            this.f26847b = lessonInfoFragment;
        }

        @Override // p171i6.InterfaceC6201f
        /* JADX INFO: renamed from: c */
        public final void mo9953c(Object obj, Object obj2) {
            Bitmap bitmap = (Bitmap) obj;
            if (C5207g.m11106a(obj2, this.f26846a)) {
                LessonInfoFragment lessonInfoFragment = this.f26847b;
                if (lessonInfoFragment.f6112l0.f6681d.isAtLeast(Lifecycle.State.STARTED)) {
                    InterfaceC6727j<Object>[] interfaceC6727jArr = LessonInfoFragment.f26838X0;
                    ImageView imageView = lessonInfoFragment.m10098w0().f45049F;
                    C5207g.m11110e(imageView, "binding.viewBg");
                    C4924a.m10451b0(imageView, bitmap);
                }
            }
        }

        @Override // p171i6.InterfaceC6201f
        /* JADX INFO: renamed from: d */
        public final void mo9954d(GlideException glideException) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.lingq.ui.info.LessonInfoFragment$special$$inlined$viewModels$default$1] */
    public LessonInfoFragment() {
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.info.LessonInfoFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.info.LessonInfoFragment$special$$inlined$viewModels$default$2
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
        this.f26841S0 = C8573r0.m16711Z(this, C5209i.m11118a(LessonInfoViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.info.LessonInfoFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.info.LessonInfoFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.info.LessonInfoFragment$special$$inlined$viewModels$default$5
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
        this.f26842T0 = new C1681f(C5209i.m11118a(C5808d.class), new InterfaceC2041a<Bundle>() { // from class: com.lingq.ui.info.LessonInfoFragment$special$$inlined$navArgs$1
            {
                super(0);
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
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

    /* JADX INFO: renamed from: u0 */
    public static void m10096u0(LessonInfo lessonInfo, LibraryItemCounter libraryItemCounter, final LessonInfoFragment lessonInfoFragment) {
        C5207g.m11111f(lessonInfo, "$lesson");
        C5207g.m11111f(lessonInfoFragment, "this$0");
        String str = lessonInfo.f21969f;
        boolean z10 = true;
        if (C7661i.m15249O2(str, "private") || C7661i.m15249O2(str, "D")) {
            if (libraryItemCounter == null || libraryItemCounter.f22005b) {
                z10 = false;
            }
            if (z10) {
                ViewsUtilsKt.m10421g(lessonInfoFragment, new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.info.LessonInfoFragment$setupLesson$1$5$1
                    {
                        super(0);
                    }

                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final C9072e mo807E() {
                        InterfaceC6727j<Object>[] interfaceC6727jArr = LessonInfoFragment.f26838X0;
                        this.f26909b.m10099x0().m10105q2();
                        return C9072e.f47360a;
                    }
                });
                return;
            }
        }
        lessonInfoFragment.m10099x0().m10105q2();
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: I */
    public final View mo3561I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C5207g.m11111f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_lesson_info, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: Q */
    public final void mo3568Q() {
        this.f6090a0 = true;
        if (this.f26845W0) {
            this.f26845W0 = false;
            LessonInfoViewModel lessonInfoViewModelM10099x0 = m10099x0();
            C7828f.m15570d(C8573r0.m16767w0(lessonInfoViewModelM10099x0), null, null, new LessonInfoViewModel$updateUser$1(lessonInfoViewModelM10099x0, null), 3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        Dialog dialog = this.f6328G0;
        View viewFindViewById = dialog != null ? dialog.findViewById(R.id.design_bottom_sheet) : null;
        if (viewFindViewById != null) {
            BottomSheetBehavior bottomSheetBehaviorM8602w = BottomSheetBehavior.m8602w(viewFindViewById);
            C5207g.m11110e(bottomSheetBehaviorM8602w, "from(it)");
            DisplayMetrics displayMetrics = m3599s().getDisplayMetrics();
            bottomSheetBehaviorM8602w.m8605C(displayMetrics.heightPixels - 160);
            RelativeLayout relativeLayout = m10098w0().f45057a;
            C5207g.m11110e(relativeLayout, "binding.root");
            C4924a.m10444W(relativeLayout, displayMetrics.heightPixels - 160);
        }
        String str = m10097v0().f35089d;
        String strM10423B = C4924a.m10423B(m10097v0().f35089d, m10097v0().f35088c, ImageSize.Medium);
        boolean z10 = false;
        if (str == null || str.length() == 0) {
            m10098w0().f45068l.setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            m10098w0().f45068l.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        Context contextM3578a0 = m3578a0();
        ComponentCallbacks2C2080b.m6236b(contextM3578a0).m6375f(contextM3578a0).m6254c().m6247G(strM10423B).m6251z(new C4133a(strM10423B, this)).m6245E(m10098w0().f45068l);
        MaterialButton materialButton = m10098w0().f45064h;
        C5207g.m11110e(materialButton, "binding.btnOpenLesson");
        if (materialButton.getVisibility() != 8) {
            if (m10097v0().f35091f == LessonInfoParent.Lesson) {
                materialButton.setVisibility(8);
            }
        }
        LinearLayout linearLayout = m10098w0().f45060d;
        C5207g.m11110e(linearLayout, "binding.btnCourse");
        if (linearLayout.getVisibility() != 8) {
            if (m10097v0().f35091f == LessonInfoParent.CoursePlaylist || m10097v0().f35091f == LessonInfoParent.Course) {
                z10 = true;
            }
            if (z10) {
                linearLayout.setVisibility(8);
            }
        }
        TextView textView = m10098w0().f45076t;
        C5207g.m11110e(textView, "binding.tvLessonDescriptionTitle");
        if (textView.getVisibility() != 8 && C7661i.m15250P2(m10097v0().f35090e)) {
            textView.setVisibility(8);
        }
        TextView textView2 = m10098w0().f45075s;
        C5207g.m11110e(textView2, "binding.tvLessonDescription");
        if (textView2.getVisibility() != 8 && C7661i.m15250P2(m10097v0().f35090e)) {
            textView2.setVisibility(8);
        }
        m10098w0().f45079w.setText(m10097v0().f35087b);
        this.f26843U0 = new C5810f();
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C4134x874de259(this, Lifecycle.State.STARTED, null, this), 3);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l
    /* JADX INFO: renamed from: o0 */
    public final int mo3768o0() {
        return R.style.AppTheme_BottomSheetDialog;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v0 */
    public final C5808d m10097v0() {
        return (C5808d) this.f26842T0.getValue();
    }

    /* JADX INFO: renamed from: w0 */
    public final C8328n0 m10098w0() {
        return (C8328n0) this.f26839Q0.m10489a(this, f26838X0[0]);
    }

    /* JADX INFO: renamed from: x0 */
    public final LessonInfoViewModel m10099x0() {
        return (LessonInfoViewModel) this.f26841S0.getValue();
    }
}
