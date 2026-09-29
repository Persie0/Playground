package p000;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* JADX INFO: renamed from: nm */
/* JADX INFO: loaded from: classes2.dex */
public final class C3377nm extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public poa f52939a;

    /* JADX INFO: renamed from: b */
    public AnimatorSet f52940b;

    /* JADX INFO: renamed from: c */
    public ArrayList f52941c;

    /* JADX INFO: renamed from: d */
    public C3275kv f52942d;

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
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
