package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.C1100wp;
import p000.C1101wq;
import p000.C1102wr;
import p000.afn;
import p000.aid;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* JADX INFO: renamed from: e */
    private static final int[] f1437e = {R.attr.colorBackground};

    /* JADX INFO: renamed from: a */
    public boolean f1438a;

    /* JADX INFO: renamed from: b */
    public boolean f1439b;

    /* JADX INFO: renamed from: c */
    public final Rect f1440c;

    /* JADX INFO: renamed from: d */
    public final Rect f1441d;

    /* JADX INFO: renamed from: f */
    private final aid f1442f;

    public CardView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0100R.attr.cardViewStyle);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        int color;
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i);
        Rect rect = new Rect();
        this.f1440c = rect;
        this.f1441d = new Rect();
        aid aidVar = new aid(this);
        this.f1442f = aidVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1100wp.f47952a, i, C0100R.style.CardView);
        afn.m536c(this, context, C1100wp.f47952a, attributeSet, typedArrayObtainStyledAttributes, i, C0100R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f1437e);
            int color2 = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(C0100R.color.cardview_light_background);
            } else {
                color = getResources().getColor(C0100R.color.cardview_dark_background);
            }
            colorStateListValueOf = ColorStateList.valueOf(color);
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.f1438a = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.f1439b = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        C1101wq c1101wq = new C1101wq(colorStateListValueOf, dimension);
        aidVar.f424a = c1101wq;
        ((CardView) aidVar.f425b).setBackgroundDrawable(c1101wq);
        View view = (View) aidVar.f425b;
        view.setClipToOutline(true);
        view.setElevation(dimension2);
        Object obj = aidVar.f424a;
        boolean zM755c = aidVar.m755c();
        boolean zM754b = aidVar.m754b();
        C1101wq c1101wq2 = (C1101wq) obj;
        if (dimension3 != c1101wq2.f47954b || c1101wq2.f47955c != zM755c || c1101wq2.f47956d != zM754b) {
            c1101wq2.f47954b = dimension3;
            c1101wq2.f47955c = zM755c;
            c1101wq2.f47956d = zM754b;
            c1101wq2.m19530a(null);
            c1101wq2.invalidateSelf();
        }
        if (aidVar.m755c()) {
            C1101wq c1101wq3 = (C1101wq) aidVar.f424a;
            float f = c1101wq3.f47954b;
            float f2 = c1101wq3.f47953a;
            int iCeil = (int) Math.ceil(C1102wr.m19531a(f, f2, aidVar.m754b()));
            int iCeil2 = (int) Math.ceil(C1102wr.m19532b(f, f2, aidVar.m754b()));
            aidVar.m753a(iCeil, iCeil2, iCeil, iCeil2);
            return;
        }
        aidVar.m753a(0, 0, 0, 0);
    }
}
