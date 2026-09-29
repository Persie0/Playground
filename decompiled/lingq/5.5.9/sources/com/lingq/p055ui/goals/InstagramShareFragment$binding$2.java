package com.lingq.p055ui.goals;

import ae.C0062b;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8250a0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class InstagramShareFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8250a0> {

    /* JADX INFO: renamed from: j */
    public static final InstagramShareFragment$binding$2 f22625j = new InstagramShareFragment$binding$2();

    public InstagramShareFragment$binding$2() {
        super(1, C8250a0.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentInstagramShareBinding;", 0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8250a0 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.btnClose;
        ImageButton imageButton = (ImageButton) C0062b.m298P0(view2, R.id.btnClose);
        if (imageButton != null) {
            i10 = R.id.btnCopy;
            MaterialButton materialButton = (MaterialButton) C0062b.m298P0(view2, R.id.btnCopy);
            if (materialButton != null) {
                i10 = R.id.btnDownload;
                ImageButton imageButton2 = (ImageButton) C0062b.m298P0(view2, R.id.btnDownload);
                if (imageButton2 != null) {
                    i10 = R.id.ivLessonImage;
                    ShapeableImageView shapeableImageView = (ShapeableImageView) C0062b.m298P0(view2, R.id.ivLessonImage);
                    if (shapeableImageView != null) {
                        i10 = R.id.tvDescription;
                        if (((TextView) C0062b.m298P0(view2, R.id.tvDescription)) != null) {
                            i10 = R.id.tvLesson;
                            TextView textView = (TextView) C0062b.m298P0(view2, R.id.tvLesson);
                            if (textView != null) {
                                i10 = R.id.tvTitle;
                                if (((TextView) C0062b.m298P0(view2, R.id.tvTitle)) != null) {
                                    return new C8250a0(imageButton, materialButton, imageButton2, shapeableImageView, textView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i10)));
    }
}
