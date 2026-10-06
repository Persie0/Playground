package p000;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.gBCSQzBeB;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class atf extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    int f2297a;

    /* JADX INFO: renamed from: b */
    atr f2298b;

    /* JADX INFO: renamed from: c */
    public AnimatorSet f2299c;

    /* JADX INFO: renamed from: d */
    ArrayList f2300d;

    /* JADX INFO: renamed from: e */
    C1109wy f2301e;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException(gBCSQzBeB.dOruPIeoh);
    }
}
