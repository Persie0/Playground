package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class hhc extends ImageButton implements hhd {

    /* JADX INFO: renamed from: a */
    public TransitionDrawable f27789a;

    /* JADX INFO: renamed from: b */
    public View.OnClickListener f27790b;

    /* JADX INFO: renamed from: c */
    public View.OnClickListener f27791c;

    /* JADX INFO: renamed from: d */
    public AmbientModeSupport.AmbientController f27792d;

    /* JADX INFO: renamed from: e */
    private int f27793e;

    /* JADX INFO: renamed from: f */
    private final View.AccessibilityDelegate f27794f;

    public hhc(Context context) {
        super(context);
        this.f27794f = new hhb(this);
        this.f27793e = context.getResources().getDimensionPixelSize(C0100R.dimen.social_share_main_item_height);
    }

    /* JADX INFO: renamed from: a */
    public final Drawable m10285a(int i) {
        Drawable drawable = getContext().getDrawable(i);
        drawable.getClass();
        return drawable;
    }

    @Override // p000.hhd
    /* JADX INFO: renamed from: b */
    public final void mo10286b() {
        this.f27793e = getContext().getResources().getDimensionPixelSize(C0100R.dimen.social_share_outcrop_main_item_height);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(0, 0, 0, getResources().getDimensionPixelSize(C0100R.dimen.social_share_outcrop_main_item_bottom_margin));
        setLayoutParams(layoutParams);
        setAccessibilityDelegate(this.f27794f);
    }

    @Override // p000.hhd
    /* JADX INFO: renamed from: c */
    public final void mo10287c() {
        this.f27793e = getContext().getResources().getDimensionPixelSize(C0100R.dimen.social_share_main_item_height);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(0, 0, 0, 0);
        setLayoutParams(layoutParams);
        setAccessibilityDelegate(null);
    }

    @Override // p000.hhd
    /* JADX INFO: renamed from: d */
    public final void mo10288d() {
        this.f27793e = getContext().getResources().getDimensionPixelSize(C0100R.dimen.social_share_outcrop_main_item_height);
        setAccessibilityDelegate(this.f27794f);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), this.f27793e);
    }
}
