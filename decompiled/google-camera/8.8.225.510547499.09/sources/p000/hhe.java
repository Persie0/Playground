package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.ImageButton;
import com.google.android.apps.camera.bottombar.C0100R;
import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hhe extends ImageButton implements hhd {

    /* JADX INFO: renamed from: a */
    public static final ColorMatrixColorFilter f27795a;

    /* JADX INFO: renamed from: b */
    public final Duration f27796b;

    /* JADX INFO: renamed from: c */
    public final ResolveInfo f27797c;

    /* JADX INFO: renamed from: d */
    public final PackageManager f27798d;

    /* JADX INFO: renamed from: e */
    public boolean f27799e;

    /* JADX INFO: renamed from: f */
    private int f27800f;

    static {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        f27795a = new ColorMatrixColorFilter(colorMatrix);
    }

    public hhe(Context context, ResolveInfo resolveInfo) {
        super(context);
        this.f27799e = false;
        this.f27797c = resolveInfo;
        this.f27798d = context.getPackageManager();
        this.f27800f = context.getResources().getDimensionPixelSize(C0100R.dimen.social_share_menu_item_height);
        this.f27796b = Duration.ofMillis(context.getResources().getInteger(C0100R.integer.social_anim_duration_default));
    }

    /* JADX INFO: renamed from: a */
    public static String m10289a(ResolveInfo resolveInfo, PackageManager packageManager, Resources resources) {
        String string = resolveInfo.activityInfo.applicationInfo.loadLabel(packageManager).toString();
        String string2 = resolveInfo.loadLabel(packageManager).toString();
        if (string.equals(string2)) {
            return resources.getString(C0100R.string.share_starting, string);
        }
        return resources.getString(C0100R.string.share_starting, string + " " + string2);
    }

    @Override // p000.hhd
    /* JADX INFO: renamed from: b */
    public final void mo10286b() {
        this.f27799e = true;
        this.f27800f = getContext().getResources().getDimensionPixelSize(C0100R.dimen.social_share_outcrop_menu_item_height);
        setVisibility(0);
        setImportantForAccessibility(2);
        requestLayout();
    }

    @Override // p000.hhd
    /* JADX INFO: renamed from: c */
    public final void mo10287c() {
        this.f27799e = false;
        this.f27800f = getContext().getResources().getDimensionPixelSize(C0100R.dimen.social_share_menu_item_height);
        setVisibility(0);
        setImportantForAccessibility(1);
        requestLayout();
    }

    @Override // p000.hhd
    /* JADX INFO: renamed from: d */
    public final void mo10288d() {
        setVisibility(8);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), this.f27800f);
    }
}
