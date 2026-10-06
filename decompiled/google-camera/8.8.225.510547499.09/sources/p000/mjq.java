package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mjq extends mjj {

    /* JADX INFO: renamed from: g */
    public final int f40766g;

    /* JADX INFO: renamed from: h */
    public final int f40767h;

    /* JADX INFO: renamed from: i */
    public final int f40768i;

    public mjq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C0100R.attr.circularProgressIndicatorStyle, C0100R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0100R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(C0100R.dimen.mtrl_progress_circular_inset_medium);
        TypedArray typedArrayM16438a = mjb.m16438a(context, attributeSet, mkj.f40840b, C0100R.attr.circularProgressIndicatorStyle, C0100R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        int iM16539c = mkv.m16539c(context, typedArrayM16438a, 2, dimensionPixelSize);
        int i = this.f40741a;
        this.f40766g = Math.max(iM16539c, i + i);
        this.f40767h = mkv.m16539c(context, typedArrayM16438a, 1, dimensionPixelSize2);
        this.f40768i = typedArrayM16438a.getInt(0, 0);
        typedArrayM16438a.recycle();
    }

    @Override // p000.mjj
    /* JADX INFO: renamed from: a */
    public final void mo16449a() {
    }
}
