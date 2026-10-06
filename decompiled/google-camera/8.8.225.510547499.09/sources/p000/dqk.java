package p000;

import android.content.Context;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.eduimageview.EduImageView;
import com.google.android.apps.camera.zoomui.view.WdNM.xPAWq;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dqk {

    /* JADX INFO: renamed from: a */
    public final Context f12320a;

    /* JADX INFO: renamed from: b */
    public final hst f12321b;

    /* JADX INFO: renamed from: c */
    public final jww f12322c;

    /* JADX INFO: renamed from: d */
    public gfc f12323d = gfc.BEAUTIFICATION_OFF;

    /* JADX INFO: renamed from: e */
    public int f12324e = -1;

    /* JADX INFO: renamed from: f */
    private final jvd f12325f;

    public dqk(Context context, hst hstVar, jvd jvdVar, jww jwwVar) {
        this.f12320a = context;
        this.f12321b = hstVar;
        this.f12325f = jvdVar;
        this.f12322c = jwwVar;
    }

    /* JADX INFO: renamed from: b */
    public static void m6590b(FrameLayout[] frameLayoutArr, gfc gfcVar) {
        int i;
        int i2 = 0;
        while (i2 < 3) {
            if (gfcVar == gfc.BEAUTIFICATION_OFF && i2 == 0) {
                i2 = 0;
            } else {
                if (gfcVar != gfc.BEAUTIFICATION_ON_LIGHT || i2 != 1) {
                    i = 8;
                    if (gfcVar == gfc.f24484L && i2 == 2) {
                        i = 0;
                    }
                }
                frameLayoutArr[i2].setVisibility(i);
                i2++;
            }
            i = 0;
            frameLayoutArr[i2].setVisibility(i);
            i2++;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m6591c(gfc gfcVar, ImageView imageView, ImageView imageView2, ImageView imageView3, int i, int i2) {
        if (imageView == null || imageView2 == null || imageView3 == null) {
            return;
        }
        imageView.setColorFilter(gfcVar == gfc.BEAUTIFICATION_OFF ? i : i2);
        imageView2.setColorFilter(gfcVar == gfc.BEAUTIFICATION_ON_LIGHT ? i : i2);
        if (gfcVar != gfc.f24484L) {
            i = i2;
        }
        imageView3.setColorFilter(i);
    }

    /* JADX INFO: renamed from: d */
    public static void m6592d(gfc gfcVar, TextView textView, TextView textView2, TextView textView3, int i, int i2) {
        if (textView == null || textView2 == null || textView3 == null) {
            return;
        }
        textView.setTextColor(gfcVar == gfc.BEAUTIFICATION_OFF ? i : i2);
        textView2.setTextColor(gfcVar == gfc.BEAUTIFICATION_ON_LIGHT ? i : i2);
        if (gfcVar != gfc.f24484L) {
            i = i2;
        }
        textView3.setTextColor(i);
    }

    /* JADX INFO: renamed from: e */
    public static void m6593e(gfc gfcVar, View view, View view2, View view3) {
        gfc gfcVar2 = gfc.BEAUTIFICATION_OFF;
        int i = C0100R.drawable.retouching_edu_option_selected;
        view.setBackgroundResource(gfcVar == gfcVar2 ? C0100R.drawable.retouching_edu_option_selected : C0100R.drawable.retouching_edu_option_unselected);
        view2.setBackgroundResource(gfcVar == gfc.BEAUTIFICATION_ON_LIGHT ? C0100R.drawable.retouching_edu_option_selected : C0100R.drawable.retouching_edu_option_unselected);
        if (gfcVar != gfc.f24484L) {
            i = C0100R.drawable.retouching_edu_option_unselected;
        }
        view3.setBackgroundResource(i);
    }

    /* JADX INFO: renamed from: a */
    public final void m6594a(final gfc gfcVar) {
        this.f12325f.m13541c(new Runnable() { // from class: dqi
            @Override // java.lang.Runnable
            public final void run() {
                String string;
                String str;
                final dqk dqkVar = this.f12304a;
                dqkVar.f12323d = gfcVar;
                final FrameLayout frameLayout = new FrameLayout(dqkVar.f12320a);
                View.inflate(dqkVar.f12320a, C0100R.layout.retouching_bottom_sheet_title, frameLayout);
                FrameLayout frameLayout2 = new FrameLayout(dqkVar.f12320a);
                View.inflate(dqkVar.f12320a, C0100R.layout.retouching_bottom_sheet, frameLayout2);
                FrameLayout frameLayout3 = (FrameLayout) frameLayout2.findViewById(C0100R.id.example_images_view);
                int i = 3;
                final FrameLayout[] frameLayoutArr = new FrameLayout[3];
                char c = 1;
                char c2 = 2;
                gfc[] gfcVarArr = {gfc.BEAUTIFICATION_OFF, gfc.BEAUTIFICATION_ON_LIGHT, gfc.f24484L};
                int i2 = 0;
                while (i2 < i) {
                    FrameLayout frameLayout4 = new FrameLayout(dqkVar.f12320a);
                    frameLayoutArr[i2] = frameLayout4;
                    View.inflate(dqkVar.f12320a, C0100R.layout.retouching_examples, frameLayout4);
                    Context context = dqkVar.f12320a;
                    FrameLayout frameLayout5 = frameLayoutArr[i2];
                    gfc gfcVar2 = gfcVarArr[i2];
                    EduImageView[] eduImageViewArr = new EduImageView[7];
                    eduImageViewArr[0] = (EduImageView) frameLayout5.findViewById(C0100R.id.retouching_edu_sample1);
                    eduImageViewArr[c] = (EduImageView) frameLayout5.findViewById(C0100R.id.retouching_edu_sample2);
                    eduImageViewArr[c2] = (EduImageView) frameLayout5.findViewById(C0100R.id.retouching_edu_sample3);
                    eduImageViewArr[3] = (EduImageView) frameLayout5.findViewById(C0100R.id.retouching_edu_sample4);
                    eduImageViewArr[4] = (EduImageView) frameLayout5.findViewById(C0100R.id.retouching_edu_sample5);
                    eduImageViewArr[5] = (EduImageView) frameLayout5.findViewById(C0100R.id.retouching_edu_sample6);
                    eduImageViewArr[6] = (EduImageView) frameLayout5.findViewById(C0100R.id.retouching_edu_sample7);
                    switch (gfcVar2.ordinal()) {
                        case 36:
                            string = context.getResources().getString(C0100R.string.retouching_edu_image_light_desc);
                            str = xPAWq.gfUiqur;
                            break;
                        case 37:
                        default:
                            string = context.getResources().getString(C0100R.string.retouching_edu_image_strong_desc);
                            str = "_strong.jpg";
                            break;
                        case 38:
                            string = context.getResources().getString(C0100R.string.retouching_edu_image_off_desc);
                            str = "_off.jpg";
                            break;
                    }
                    int i3 = 0;
                    while (i3 < 7) {
                        int i4 = i3 + 1;
                        eduImageViewArr[i3].m4362c("https://www.gstatic.com/aiux/gca/faceretouching/img" + i4 + str, string);
                        i3 = i4;
                    }
                    frameLayout3.addView(frameLayoutArr[i2]);
                    if (dqkVar.f12323d == gfcVarArr[i2]) {
                        frameLayoutArr[i2].setVisibility(0);
                    } else {
                        frameLayoutArr[i2].setVisibility(8);
                    }
                    i2++;
                    i = 3;
                    c = 1;
                    c2 = 2;
                }
                final FrameLayout frameLayout6 = new FrameLayout(dqkVar.f12320a);
                View.inflate(dqkVar.f12320a, C0100R.layout.retouching_level_selector, frameLayout6);
                final View viewFindViewById = frameLayout6.findViewById(C0100R.id.retouching_edu_off);
                final View viewFindViewById2 = frameLayout6.findViewById(C0100R.id.retouching_edu_light);
                final View viewFindViewById3 = frameLayout6.findViewById(C0100R.id.retouching_edu_strong);
                RippleDrawable rippleDrawable = (RippleDrawable) ((LinearLayout) frameLayout6.findViewById(C0100R.id.level_selector)).getBackground();
                if (rippleDrawable != null) {
                    rippleDrawable.setTint(kxk.m15009b(C0100R.dimen.gm3_sys_elevation_level2, dqkVar.f12320a));
                    rippleDrawable.getDrawable(0).setTint(kxk.m15009b(C0100R.dimen.gm3_sys_elevation_level2, dqkVar.f12320a));
                    rippleDrawable.getDrawable(1).setTint(kxk.m15009b(C0100R.dimen.gm3_sys_elevation_level2, dqkVar.f12320a));
                }
                final TextView textView = (TextView) viewFindViewById.findViewById(C0100R.id.retouching_edu_off_text);
                final TextView textView2 = (TextView) viewFindViewById2.findViewById(C0100R.id.retouching_edu_light_text);
                final TextView textView3 = (TextView) viewFindViewById3.findViewById(C0100R.id.retouching_edu_strong_text);
                final ImageView imageView = (ImageView) viewFindViewById.findViewById(C0100R.id.retouching_edu_off_icon);
                final ImageView imageView2 = (ImageView) viewFindViewById2.findViewById(C0100R.id.retouching_edu_light_icon);
                final ImageView imageView3 = (ImageView) viewFindViewById3.findViewById(C0100R.id.retouching_edu_strong_icon);
                if (dqkVar.f12324e == -1) {
                    dqkVar.f12324e = textView.getCurrentTextColor();
                }
                final int iM15024q = kxk.m15024q(frameLayout6, C0100R.attr.colorOnPrimaryContainer);
                final int i5 = dqkVar.f12324e;
                final int i6 = 1;
                viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: dqj
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i6) {
                            case 0:
                                dqk dqkVar2 = dqkVar;
                                View view2 = viewFindViewById;
                                View view3 = viewFindViewById2;
                                View view4 = viewFindViewById3;
                                TextView textView4 = textView;
                                TextView textView5 = textView2;
                                TextView textView6 = textView3;
                                int i7 = iM15024q;
                                int i8 = i5;
                                ImageView imageView4 = imageView;
                                ImageView imageView5 = imageView2;
                                ImageView imageView6 = imageView3;
                                FrameLayout[] frameLayoutArr2 = frameLayoutArr;
                                npk.m17604h(view);
                                dqkVar2.f12323d = gfc.BEAUTIFICATION_ON_LIGHT;
                                dqk.m6593e(dqkVar2.f12323d, view2, view3, view4);
                                dqk.m6592d(dqkVar2.f12323d, textView4, textView5, textView6, i7, i8);
                                dqk.m6591c(dqkVar2.f12323d, imageView4, imageView5, imageView6, i7, i8);
                                dqk.m6590b(frameLayoutArr2, dqkVar2.f12323d);
                                break;
                            case 1:
                                dqk dqkVar3 = dqkVar;
                                View view5 = viewFindViewById;
                                View view6 = viewFindViewById2;
                                View view7 = viewFindViewById3;
                                TextView textView7 = textView;
                                TextView textView8 = textView2;
                                TextView textView9 = textView3;
                                int i9 = iM15024q;
                                int i10 = i5;
                                ImageView imageView7 = imageView;
                                ImageView imageView8 = imageView2;
                                ImageView imageView9 = imageView3;
                                FrameLayout[] frameLayoutArr3 = frameLayoutArr;
                                npk.m17604h(view);
                                dqkVar3.f12323d = gfc.BEAUTIFICATION_OFF;
                                dqk.m6593e(dqkVar3.f12323d, view5, view6, view7);
                                dqk.m6592d(dqkVar3.f12323d, textView7, textView8, textView9, i9, i10);
                                dqk.m6591c(dqkVar3.f12323d, imageView7, imageView8, imageView9, i9, i10);
                                dqk.m6590b(frameLayoutArr3, dqkVar3.f12323d);
                                break;
                            default:
                                dqk dqkVar4 = dqkVar;
                                View view8 = viewFindViewById;
                                View view9 = viewFindViewById2;
                                View view10 = viewFindViewById3;
                                TextView textView10 = textView;
                                TextView textView11 = textView2;
                                TextView textView12 = textView3;
                                int i11 = iM15024q;
                                int i12 = i5;
                                ImageView imageView10 = imageView;
                                ImageView imageView11 = imageView2;
                                ImageView imageView12 = imageView3;
                                FrameLayout[] frameLayoutArr4 = frameLayoutArr;
                                npk.m17604h(view);
                                dqkVar4.f12323d = gfc.f24484L;
                                dqk.m6593e(dqkVar4.f12323d, view8, view9, view10);
                                dqk.m6592d(dqkVar4.f12323d, textView10, textView11, textView12, i11, i12);
                                dqk.m6591c(dqkVar4.f12323d, imageView10, imageView11, imageView12, i11, i12);
                                dqk.m6590b(frameLayoutArr4, dqkVar4.f12323d);
                                break;
                        }
                    }
                });
                final int i7 = 0;
                viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: dqj
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i7) {
                            case 0:
                                dqk dqkVar2 = dqkVar;
                                View view2 = viewFindViewById;
                                View view3 = viewFindViewById2;
                                View view4 = viewFindViewById3;
                                TextView textView4 = textView;
                                TextView textView5 = textView2;
                                TextView textView6 = textView3;
                                int i8 = iM15024q;
                                int i9 = i5;
                                ImageView imageView4 = imageView;
                                ImageView imageView5 = imageView2;
                                ImageView imageView6 = imageView3;
                                FrameLayout[] frameLayoutArr2 = frameLayoutArr;
                                npk.m17604h(view);
                                dqkVar2.f12323d = gfc.BEAUTIFICATION_ON_LIGHT;
                                dqk.m6593e(dqkVar2.f12323d, view2, view3, view4);
                                dqk.m6592d(dqkVar2.f12323d, textView4, textView5, textView6, i8, i9);
                                dqk.m6591c(dqkVar2.f12323d, imageView4, imageView5, imageView6, i8, i9);
                                dqk.m6590b(frameLayoutArr2, dqkVar2.f12323d);
                                break;
                            case 1:
                                dqk dqkVar3 = dqkVar;
                                View view5 = viewFindViewById;
                                View view6 = viewFindViewById2;
                                View view7 = viewFindViewById3;
                                TextView textView7 = textView;
                                TextView textView8 = textView2;
                                TextView textView9 = textView3;
                                int i10 = iM15024q;
                                int i11 = i5;
                                ImageView imageView7 = imageView;
                                ImageView imageView8 = imageView2;
                                ImageView imageView9 = imageView3;
                                FrameLayout[] frameLayoutArr3 = frameLayoutArr;
                                npk.m17604h(view);
                                dqkVar3.f12323d = gfc.BEAUTIFICATION_OFF;
                                dqk.m6593e(dqkVar3.f12323d, view5, view6, view7);
                                dqk.m6592d(dqkVar3.f12323d, textView7, textView8, textView9, i10, i11);
                                dqk.m6591c(dqkVar3.f12323d, imageView7, imageView8, imageView9, i10, i11);
                                dqk.m6590b(frameLayoutArr3, dqkVar3.f12323d);
                                break;
                            default:
                                dqk dqkVar4 = dqkVar;
                                View view8 = viewFindViewById;
                                View view9 = viewFindViewById2;
                                View view10 = viewFindViewById3;
                                TextView textView10 = textView;
                                TextView textView11 = textView2;
                                TextView textView12 = textView3;
                                int i12 = iM15024q;
                                int i13 = i5;
                                ImageView imageView10 = imageView;
                                ImageView imageView11 = imageView2;
                                ImageView imageView12 = imageView3;
                                FrameLayout[] frameLayoutArr4 = frameLayoutArr;
                                npk.m17604h(view);
                                dqkVar4.f12323d = gfc.f24484L;
                                dqk.m6593e(dqkVar4.f12323d, view8, view9, view10);
                                dqk.m6592d(dqkVar4.f12323d, textView10, textView11, textView12, i12, i13);
                                dqk.m6591c(dqkVar4.f12323d, imageView10, imageView11, imageView12, i12, i13);
                                dqk.m6590b(frameLayoutArr4, dqkVar4.f12323d);
                                break;
                        }
                    }
                });
                final int i8 = 2;
                viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: dqj
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i8) {
                            case 0:
                                dqk dqkVar2 = dqkVar;
                                View view2 = viewFindViewById;
                                View view3 = viewFindViewById2;
                                View view4 = viewFindViewById3;
                                TextView textView4 = textView;
                                TextView textView5 = textView2;
                                TextView textView6 = textView3;
                                int i9 = iM15024q;
                                int i10 = i5;
                                ImageView imageView4 = imageView;
                                ImageView imageView5 = imageView2;
                                ImageView imageView6 = imageView3;
                                FrameLayout[] frameLayoutArr2 = frameLayoutArr;
                                npk.m17604h(view);
                                dqkVar2.f12323d = gfc.BEAUTIFICATION_ON_LIGHT;
                                dqk.m6593e(dqkVar2.f12323d, view2, view3, view4);
                                dqk.m6592d(dqkVar2.f12323d, textView4, textView5, textView6, i9, i10);
                                dqk.m6591c(dqkVar2.f12323d, imageView4, imageView5, imageView6, i9, i10);
                                dqk.m6590b(frameLayoutArr2, dqkVar2.f12323d);
                                break;
                            case 1:
                                dqk dqkVar3 = dqkVar;
                                View view5 = viewFindViewById;
                                View view6 = viewFindViewById2;
                                View view7 = viewFindViewById3;
                                TextView textView7 = textView;
                                TextView textView8 = textView2;
                                TextView textView9 = textView3;
                                int i11 = iM15024q;
                                int i12 = i5;
                                ImageView imageView7 = imageView;
                                ImageView imageView8 = imageView2;
                                ImageView imageView9 = imageView3;
                                FrameLayout[] frameLayoutArr3 = frameLayoutArr;
                                npk.m17604h(view);
                                dqkVar3.f12323d = gfc.BEAUTIFICATION_OFF;
                                dqk.m6593e(dqkVar3.f12323d, view5, view6, view7);
                                dqk.m6592d(dqkVar3.f12323d, textView7, textView8, textView9, i11, i12);
                                dqk.m6591c(dqkVar3.f12323d, imageView7, imageView8, imageView9, i11, i12);
                                dqk.m6590b(frameLayoutArr3, dqkVar3.f12323d);
                                break;
                            default:
                                dqk dqkVar4 = dqkVar;
                                View view8 = viewFindViewById;
                                View view9 = viewFindViewById2;
                                View view10 = viewFindViewById3;
                                TextView textView10 = textView;
                                TextView textView11 = textView2;
                                TextView textView12 = textView3;
                                int i13 = iM15024q;
                                int i14 = i5;
                                ImageView imageView10 = imageView;
                                ImageView imageView11 = imageView2;
                                ImageView imageView12 = imageView3;
                                FrameLayout[] frameLayoutArr4 = frameLayoutArr;
                                npk.m17604h(view);
                                dqkVar4.f12323d = gfc.f24484L;
                                dqk.m6593e(dqkVar4.f12323d, view8, view9, view10);
                                dqk.m6592d(dqkVar4.f12323d, textView10, textView11, textView12, i13, i14);
                                dqk.m6591c(dqkVar4.f12323d, imageView10, imageView11, imageView12, i13, i14);
                                dqk.m6590b(frameLayoutArr4, dqkVar4.f12323d);
                                break;
                        }
                    }
                });
                dqk.m6593e(dqkVar.f12323d, viewFindViewById, viewFindViewById2, viewFindViewById3);
                dqk.m6592d(dqkVar.f12323d, textView, textView2, textView3, iM15024q, i5);
                dqk.m6591c(dqkVar.f12323d, imageView, imageView2, imageView3, iM15024q, i5);
                frameLayout2.findViewById(C0100R.id.apply_button).setOnClickListener(new ViewOnClickListenerC0250hu(dqkVar, 13));
                ((TextView) frameLayout2.findViewById(C0100R.id.disclaimer)).setText(" ".concat(String.valueOf(dqkVar.f12320a.getResources().getString(C0100R.string.retouching_edu_disc))));
                hst hstVar = dqkVar.f12321b;
                final View viewFindViewById4 = frameLayout.findViewById(C0100R.id.retouching_sheet_title);
                final ViewGroup viewGroup = (ViewGroup) frameLayout.findViewById(C0100R.id.title_level_selector);
                final ViewGroup viewGroup2 = (ViewGroup) frameLayout2.findViewById(C0100R.id.content_level_selector);
                viewGroup2.addView(frameLayout6);
                hstVar.f29442f = new View.OnScrollChangeListener() { // from class: dqh
                    @Override // android.view.View.OnScrollChangeListener
                    public final void onScrollChange(View view, int i9, int i10, int i11, int i12) {
                        View view2 = frameLayout;
                        ViewGroup viewGroup3 = viewGroup2;
                        View view3 = frameLayout6;
                        ViewGroup viewGroup4 = viewGroup;
                        View view4 = viewFindViewById4;
                        int[] iArr = new int[2];
                        int[] iArr2 = new int[2];
                        view2.getLocationInWindow(iArr);
                        viewGroup3.getLocationInWindow(iArr2);
                        if (iArr2[1] < iArr[1] + view2.getHeight()) {
                            if (viewGroup3.findViewById(C0100R.id.level_selector) != null) {
                                viewGroup3.removeView(view3);
                                viewGroup4.addView(view3);
                            }
                            view4.setVisibility(4);
                            return;
                        }
                        if (viewGroup4.findViewById(C0100R.id.level_selector) != null) {
                            viewGroup4.removeView(view3);
                            viewGroup3.addView(view3);
                        }
                        view4.setVisibility(0);
                    }
                };
                hst hstVar2 = dqkVar.f12321b;
                if (hstVar2.f29438b.mo6184l(dib.f11326bg)) {
                    return;
                }
                hstVar2.f29437a.execute(new gxn(hstVar2, frameLayout, frameLayout2, 11));
                hstVar2.f29446j = 5;
                hstVar2.f29444h = System.currentTimeMillis();
                hstVar2.f29447k = nhk.f42331e.m18137O();
                hstVar2.f29448l = null;
                hstVar2.m10712k(5);
            }
        });
    }
}
