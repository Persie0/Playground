package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.camcorder.p008ui.modeslider.recordspeed.RecordSpeedSlider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dag implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f10242a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ mty f10243b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ int f10244c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ boolean f10245d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ dah f10246e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ int f10247f;

    public dag(dah dahVar, int i, mty mtyVar, int i2, int i3, boolean z) {
        this.f10246e = dahVar;
        this.f10242a = i;
        this.f10243b = mtyVar;
        this.f10247f = i2;
        this.f10244c = i3;
        this.f10245d = z;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        RecordSpeedSlider recordSpeedSlider = (RecordSpeedSlider) view;
        if (view.getWidth() != this.f10242a) {
            if (recordSpeedSlider.getLayoutParams().width == -2) {
                view.removeOnLayoutChangeListener(this);
                return;
            }
            return;
        }
        mty mtyVar = this.f10243b;
        int i11 = this.f10247f;
        int i12 = this.f10244c;
        int i13 = this.f10246e.f10260m;
        recordSpeedSlider.removeAllViews();
        recordSpeedSlider.f6575a.set(-1);
        Resources resources = recordSpeedSlider.getResources();
        recordSpeedSlider.f6577c = mtyVar;
        recordSpeedSlider.f6581g = i11;
        recordSpeedSlider.f6579e = i13;
        recordSpeedSlider.f6580f = i12;
        int size = mtyVar.mo16913r().size() + 1;
        int dimensionPixelSize = resources.getDimensionPixelSize(C0100R.dimen.record_speed_slider_knob_min_width);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C0100R.dimen.record_speed_slider_knob_max_width);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(C0100R.dimen.record_speed_slider_knob_min_width_medium);
        int dimensionPixelSize4 = resources.getDimensionPixelSize(C0100R.dimen.record_speed_slider_knob_max_width_medium);
        int dimensionPixelSize5 = resources.getDimensionPixelSize(C0100R.dimen.record_speed_slider_knob_min_width_large);
        int dimensionPixelSize6 = resources.getDimensionPixelSize(C0100R.dimen.record_speed_slider_knob_max_width_large);
        int dimensionPixelSize7 = resources.getDimensionPixelSize(C0100R.dimen.record_speed_slider_knob_height);
        float dimensionPixelSize8 = resources.getDimensionPixelSize(C0100R.dimen.record_speed_slider_text_size);
        float fM11430a = ill.m11430a(resources.getDimension(C0100R.dimen.record_speed_slider_text_letter_spacing));
        Drawable drawable = resources.getDrawable(C0100R.drawable.quantum_gm_ic_arrow_back_white_18, null);
        Drawable drawable2 = resources.getDrawable(C0100R.drawable.quantum_gm_ic_arrow_forward_white_18, null);
        int i14 = 0;
        while (true) {
            Drawable drawable3 = drawable2;
            if (i14 >= size) {
                int dimensionPixelSize9 = recordSpeedSlider.getResources().getDimensionPixelSize(C0100R.dimen.record_speed_slider_side_padding);
                recordSpeedSlider.setPadding(dimensionPixelSize9, 0, dimensionPixelSize9, 0);
                int iMin = Math.min(recordSpeedSlider.getRootView().getMeasuredWidth(), recordSpeedSlider.getRootView().getMeasuredHeight());
                if (!recordSpeedSlider.f6577c.m16915t()) {
                    int dimensionPixelSize10 = recordSpeedSlider.getResources().getDimensionPixelSize(C0100R.dimen.record_speed_slider_side_margin);
                    int i15 = iMin - (dimensionPixelSize10 + dimensionPixelSize10);
                    int size2 = recordSpeedSlider.f6577c.mo16913r().size() + 1;
                    int dimensionPixelSize11 = recordSpeedSlider.getResources().getDimensionPixelSize(C0100R.dimen.record_speed_slider_side_padding);
                    recordSpeedSlider.measure(0, 0);
                    if (recordSpeedSlider.getMeasuredWidth() > i15) {
                        int measuredWidth = ((recordSpeedSlider.getMeasuredWidth() - (dimensionPixelSize11 + dimensionPixelSize11)) - i15) / size2;
                        for (int i16 = 0; i16 < size2; i16++) {
                            TextView textView = (TextView) recordSpeedSlider.getChildAt(i16);
                            int minWidth = textView.getMinWidth();
                            int maxWidth = textView.getMaxWidth();
                            textView.setMinWidth(minWidth - measuredWidth);
                            textView.setMaxWidth(maxWidth - measuredWidth);
                        }
                    }
                }
                recordSpeedSlider.setOnTouchListener(new cln(recordSpeedSlider, 3));
                recordSpeedSlider.requestLayout();
                recordSpeedSlider.invalidate();
                for (int i17 = 0; i17 < ((mtm) this.f10243b).f41599b; i17++) {
                    this.f10246e.f10248a.add(i17, false);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) recordSpeedSlider.getLayoutParams();
                layoutParams.width = -2;
                recordSpeedSlider.setLayoutParams(layoutParams);
                recordSpeedSlider.f6578d = new daf(this, recordSpeedSlider);
                recordSpeedSlider.m4075f(this.f10246e.f10261n);
                return;
            }
            String str = i14 == recordSpeedSlider.f6579e ? "" : (String) recordSpeedSlider.f6577c.mo16885b(Integer.valueOf(recordSpeedSlider.m4071b(i14))).get(0);
            int i18 = recordSpeedSlider.f6581g;
            if (i18 == 0) {
                throw null;
            }
            int i19 = dimensionPixelSize3;
            String string = i18 == 1 ? i14 == recordSpeedSlider.f6579e ? recordSpeedSlider.getResources().getString(C0100R.string.accessibility_back_to_video_description) : (String) recordSpeedSlider.f6577c.mo16885b(Integer.valueOf(i14 - 1)).get(1) : i14 == recordSpeedSlider.f6579e ? recordSpeedSlider.getResources().getString(C0100R.string.accessibility_back_to_video_description) : (String) recordSpeedSlider.f6577c.mo16885b(Integer.valueOf(i14)).get(1);
            int i20 = dimensionPixelSize4;
            TextView textView2 = new TextView(recordSpeedSlider.getContext());
            int i21 = dimensionPixelSize5;
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, dimensionPixelSize7);
            layoutParams2.gravity = 8388627;
            textView2.setLayoutParams(layoutParams2);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setSingleLine(true);
            textView2.setBackgroundColor(0);
            textView2.setGravity(17);
            recordSpeedSlider.m4080k(textView2, kxk.m15024q(textView2, C0100R.attr.colorOnSurface));
            textView2.setTextAlignment(4);
            textView2.setTextSize(0, dimensionPixelSize8);
            textView2.setText(str);
            textView2.setLetterSpacing(fM11430a);
            textView2.setAlpha(0.0f);
            textView2.setContentDescription(string);
            textView2.setOnClickListener(new iav(recordSpeedSlider, i14, 1));
            if (str.length() > 3) {
                i10 = dimensionPixelSize6;
                i9 = i21;
            } else if (str.length() > 2) {
                i9 = i19;
                i10 = i20;
            } else {
                i9 = dimensionPixelSize;
                i10 = dimensionPixelSize2;
            }
            textView2.setMinWidth(i9);
            textView2.setMaxWidth(i10);
            if (i14 == i13) {
                int dimensionPixelSize12 = resources.getDimensionPixelSize(C0100R.dimen.record_speed_slider_arrow_min_width);
                int i22 = dimensionPixelSize12 / 2;
                int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                textView2.setMinWidth(dimensionPixelSize12);
                textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(i11 != 1 ? drawable3 : drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                textView2.setCompoundDrawablePadding(0);
                textView2.setPadding(i22 - intrinsicWidth, 0, 0, 0);
            } else {
                int i23 = recordSpeedSlider.f6576b;
                textView2.setPadding(i23, 0, i23, 0);
            }
            recordSpeedSlider.addView(textView2, i14);
            i14++;
            drawable2 = drawable3;
            size = size;
            dimensionPixelSize3 = i19;
            dimensionPixelSize4 = i20;
            dimensionPixelSize5 = i21;
        }
    }
}
