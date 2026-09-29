package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import dm.C5206f;
import p283o.C7884a;
import p309p.C8158b;
import p309p.InterfaceC8157a;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* JADX INFO: renamed from: f */
    public static final int[] f1413f = {R.attr.colorBackground};

    /* JADX INFO: renamed from: g */
    public static final C5206f f1414g = new C5206f();

    /* JADX INFO: renamed from: a */
    public boolean f1415a;

    /* JADX INFO: renamed from: b */
    public boolean f1416b;

    /* JADX INFO: renamed from: c */
    public final Rect f1417c;

    /* JADX INFO: renamed from: d */
    public final Rect f1418d;

    /* JADX INFO: renamed from: e */
    public final C0356a f1419e;

    /* JADX INFO: renamed from: androidx.cardview.widget.CardView$a */
    public class C0356a implements InterfaceC8157a {

        /* JADX INFO: renamed from: a */
        public Drawable f1420a;

        public C0356a() {
        }

        /* JADX INFO: renamed from: a */
        public final void m1327a(int i10, int i11, int i12, int i13) {
            CardView cardView = CardView.this;
            cardView.f1418d.set(i10, i11, i12, i13);
            Rect rect = cardView.f1417c;
            CardView.super.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.linguist.R.attr.cardViewStyle);
    }

    public CardView(Context context, AttributeSet attributeSet, int i10) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i10);
        Rect rect = new Rect();
        this.f1417c = rect;
        this.f1418d = new Rect();
        C0356a c0356a = new C0356a();
        this.f1419e = c0356a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7884a.f42988a, i10, com.linguist.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f1413f);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.linguist.R.color.cardview_light_background) : getResources().getColor(com.linguist.R.color.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.f1415a = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.f1416b = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        C5206f c5206f = f1414g;
        C8158b c8158b = new C8158b(dimension, colorStateListValueOf);
        c0356a.f1420a = c8158b;
        setBackgroundDrawable(c8158b);
        setClipToOutline(true);
        setElevation(dimension2);
        c5206f.m11095r1(c0356a, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((C8158b) this.f1419e.f1420a).f44278h;
    }

    public float getCardElevation() {
        return CardView.this.getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f1417c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f1417c.left;
    }

    public int getContentPaddingRight() {
        return this.f1417c.right;
    }

    public int getContentPaddingTop() {
        return this.f1417c.top;
    }

    public float getMaxCardElevation() {
        return ((C8158b) this.f1419e.f1420a).f44275e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f1416b;
    }

    public float getRadius() {
        return ((C8158b) this.f1419e.f1420a).f44271a;
    }

    public boolean getUseCompatPadding() {
        return this.f1415a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i10);
        C8158b c8158b = (C8158b) this.f1419e.f1420a;
        c8158b.m16183b(colorStateListValueOf);
        c8158b.invalidateSelf();
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        C8158b c8158b = (C8158b) this.f1419e.f1420a;
        c8158b.m16183b(colorStateList);
        c8158b.invalidateSelf();
    }

    public void setCardElevation(float f3) {
        CardView.this.setElevation(f3);
    }

    public void setMaxCardElevation(float f3) {
        f1414g.m11095r1(this.f1419e, f3);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        super.setMinimumWidth(i10);
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f1416b) {
            this.f1416b = z10;
            C5206f c5206f = f1414g;
            C0356a c0356a = this.f1419e;
            c5206f.m11095r1(c0356a, ((C8158b) c0356a.f1420a).f44275e);
        }
    }

    public void setRadius(float f3) {
        C8158b c8158b = (C8158b) this.f1419e.f1420a;
        if (f3 == c8158b.f44271a) {
            return;
        }
        c8158b.f44271a = f3;
        c8158b.m16184c(null);
        c8158b.invalidateSelf();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void setUseCompatPadding(boolean z10) {
        if (this.f1415a != z10) {
            this.f1415a = z10;
            C5206f c5206f = f1414g;
            C0356a c0356a = this.f1419e;
            c5206f.m11095r1(c0356a, ((C8158b) c0356a.f1420a).f44275e);
        }
    }
}
