package com.lingq.p055ui.goals;

import android.app.Dialog;
import android.content.ClipboardManager;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.activity.result.C0204c;
import androidx.activity.result.InterfaceC0202a;
import androidx.fragment.app.C0964m;
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
import com.google.android.material.imageview.ShapeableImageView;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import dm.C5207g;
import dm.C5209i;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import mo.C7661i;
import no.C7828f;
import p003a2.C0009a;
import p035c.C1643c;
import p067d8.ViewOnClickListenerC5062d0;
import p260m8.C7499b;
import p274n8.ViewOnClickListenerC7718c;
import p338qd.C8573r0;
import p343qi.AbstractC8633e;
import p427v3.AbstractC9634a;
import ph.C8250a0;
import sl.C9072e;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/goals/InstagramShareFragment;", "Landroidx/fragment/app/l;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class InstagramShareFragment extends AbstractC8633e {

    /* JADX INFO: renamed from: V0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f22618V0 = {C0204c.m857q(InstagramShareFragment.class, "getBinding()Lcom/lingq/databinding/FragmentInstagramShareBinding;")};

    /* JADX INFO: renamed from: Q0 */
    public final FragmentViewBindingDelegate f22619Q0 = C4924a.m10477o0(this, InstagramShareFragment$binding$2.f22625j);

    /* JADX INFO: renamed from: R0 */
    public final C1038i0 f22620R0;

    /* JADX INFO: renamed from: S0 */
    public ClipboardManager f22621S0;

    /* JADX INFO: renamed from: T0 */
    public Bitmap f22622T0;

    /* JADX INFO: renamed from: U0 */
    public C0964m f22623U0;

    /* JADX INFO: renamed from: com.lingq.ui.goals.InstagramShareFragment$a */
    public static final class C3456a implements InterfaceC0202a<Boolean> {
        public C3456a() {
        }

        @Override // androidx.activity.result.InterfaceC0202a
        /* JADX INFO: renamed from: a */
        public final void mo843a(Boolean bool) {
            if (bool.booleanValue()) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = InstagramShareFragment.f22618V0;
                InstagramShareViewModel instagramShareViewModelM9764v0 = InstagramShareFragment.this.m9764v0();
                instagramShareViewModelM9764v0.f22651g.mo14371k(instagramShareViewModelM9764v0.f22648d);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.lingq.ui.goals.InstagramShareFragment$special$$inlined$viewModels$default$1] */
    public InstagramShareFragment() {
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.goals.InstagramShareFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.goals.InstagramShareFragment$special$$inlined$viewModels$default$2
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
        this.f22620R0 = C8573r0.m16711Z(this, C5209i.m11118a(InstagramShareViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.goals.InstagramShareFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.goals.InstagramShareFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.goals.InstagramShareFragment$special$$inlined$viewModels$default$5
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
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        String string;
        String string2;
        Window window;
        C5207g.m11111f(view, "view");
        Dialog dialog = this.f6328G0;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Object systemService = m3576Y().getSystemService("clipboard");
        C5207g.m11109d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f22621S0 = (ClipboardManager) systemService;
        this.f22623U0 = m3575X(new C3456a(), new C1643c());
        C8250a0 c8250a0M9763u0 = m9763u0();
        Bundle bundle2 = this.f6101g;
        if (bundle2 != null && (string2 = bundle2.getString("title")) != null) {
            m9763u0().f44552e.setText(string2);
        }
        Bundle bundle3 = this.f6101g;
        if (bundle3 != null && (string = bundle3.getString("imageUrl")) != null) {
            if (C7661i.m15256V2(string, "http", false)) {
                ShapeableImageView shapeableImageView = m9763u0().f44551d;
                C5207g.m11110e(shapeableImageView, "binding.ivLessonImage");
                C4924a.m10437P(shapeableImageView, string, new InterfaceC2052l<Bitmap, C9072e>() { // from class: com.lingq.ui.goals.InstagramShareFragment$onViewCreated$2$2$1
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(Bitmap bitmap) {
                        Bitmap bitmap2 = bitmap;
                        C5207g.m11111f(bitmap2, "bitmap");
                        this.f22632b.f22622T0 = bitmap2;
                        return C9072e.f47360a;
                    }
                });
            } else {
                int identifier = m3599s().getIdentifier(string, "drawable", m3578a0().getPackageName());
                ShapeableImageView shapeableImageView2 = m9763u0().f44551d;
                C5207g.m11110e(shapeableImageView2, "binding.ivLessonImage");
                C4924a.m10437P(shapeableImageView2, Integer.valueOf(identifier), new InterfaceC2052l<Bitmap, C9072e>() { // from class: com.lingq.ui.goals.InstagramShareFragment$onViewCreated$2$2$2
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(Bitmap bitmap) {
                        Bitmap bitmap2 = bitmap;
                        C5207g.m11111f(bitmap2, "bitmap");
                        InstagramShareFragment instagramShareFragment = this.f22633b;
                        instagramShareFragment.f22622T0 = bitmap2;
                        instagramShareFragment.m9763u0().f44551d.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        return C9072e.f47360a;
                    }
                });
            }
        }
        c8250a0M9763u0.f44549b.setOnClickListener(new ViewOnClickListenerC2239y(9, this));
        c8250a0M9763u0.f44550c.setOnClickListener(new ViewOnClickListenerC7718c(5, this));
        c8250a0M9763u0.f44548a.setOnClickListener(new ViewOnClickListenerC5062d0(5, this));
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C3457x83529ae0(this, Lifecycle.State.STARTED, null, this), 3);
    }

    /* JADX INFO: renamed from: u0 */
    public final C8250a0 m9763u0() {
        return (C8250a0) this.f22619Q0.m10489a(this, f22618V0[0]);
    }

    /* JADX INFO: renamed from: v0 */
    public final InstagramShareViewModel m9764v0() {
        return (InstagramShareViewModel) this.f22620R0.getValue();
    }
}
