package com.lingq.p055ui.upgrade;

import ae.C0062b;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.button.MaterialButton;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8258b2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class UpgradeGoPremiumFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8258b2> {

    /* JADX INFO: renamed from: j */
    public static final UpgradeGoPremiumFragment$binding$2 f32019j = new UpgradeGoPremiumFragment$binding$2();

    public UpgradeGoPremiumFragment$binding$2() {
        super(1, C8258b2.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentUpgradeGoPremiumBinding;", 0);
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8258b2 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.btnCloseUpgrade;
        ImageButton imageButton = (ImageButton) C0062b.m298P0(view2, R.id.btnCloseUpgrade);
        if (imageButton != null) {
            i10 = R.id.btnUpgrade;
            MaterialButton materialButton = (MaterialButton) C0062b.m298P0(view2, R.id.btnUpgrade);
            if (materialButton != null) {
                i10 = R.id.tv_desc;
                TextView textView = (TextView) C0062b.m298P0(view2, R.id.tv_desc);
                if (textView != null) {
                    i10 = R.id.tv_title;
                    if (((TextView) C0062b.m298P0(view2, R.id.tv_title)) != null) {
                        return new C8258b2(imageButton, materialButton, textView, (FrameLayout) view2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i10)));
    }
}
