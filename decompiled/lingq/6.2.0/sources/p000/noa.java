package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class noa extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public int f53068a;

    /* JADX INFO: renamed from: b */
    public moa f53069b;

    /* JADX INFO: renamed from: c */
    public ColorStateList f53070c;

    /* JADX INFO: renamed from: d */
    public PorterDuff.Mode f53071d;

    /* JADX INFO: renamed from: e */
    public boolean f53072e;

    /* JADX INFO: renamed from: f */
    public Bitmap f53073f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f53074g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f53075h;

    /* JADX INFO: renamed from: i */
    public int f53076i;

    /* JADX INFO: renamed from: j */
    public boolean f53077j;

    /* JADX INFO: renamed from: k */
    public boolean f53078k;

    /* JADX INFO: renamed from: l */
    public Paint f53079l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f53068a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new poa(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new poa(this);
    }
}
