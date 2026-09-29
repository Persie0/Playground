package p000;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class z28 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a */
    public o38 f70799a;

    /* JADX INFO: renamed from: b */
    public final Rect f70800b;

    /* JADX INFO: renamed from: c */
    public boolean f70801c;

    /* JADX INFO: renamed from: d */
    public boolean f70802d;

    public z28(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f70800b = new Rect();
        this.f70801c = true;
        this.f70802d = false;
    }

    public z28(int i, int i2) {
        super(i, i2);
        this.f70800b = new Rect();
        this.f70801c = true;
        this.f70802d = false;
    }

    public z28(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f70800b = new Rect();
        this.f70801c = true;
        this.f70802d = false;
    }

    public z28(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f70800b = new Rect();
        this.f70801c = true;
        this.f70802d = false;
    }

    public z28(z28 z28Var) {
        super((ViewGroup.LayoutParams) z28Var);
        this.f70800b = new Rect();
        this.f70801c = true;
        this.f70802d = false;
    }
}
