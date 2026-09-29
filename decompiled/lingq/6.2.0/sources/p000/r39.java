package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.google.android.material.R$styleable;

/* JADX INFO: loaded from: classes.dex */
public final class r39 implements p39 {

    /* JADX INFO: renamed from: m */
    public static final p48 f58561m = new p48(0.5f);

    /* JADX INFO: renamed from: a */
    public i9d f58562a = new vi8();

    /* JADX INFO: renamed from: b */
    public i9d f58563b = new vi8();

    /* JADX INFO: renamed from: c */
    public i9d f58564c = new vi8();

    /* JADX INFO: renamed from: d */
    public i9d f58565d = new vi8();

    /* JADX INFO: renamed from: e */
    public fn1 f58566e = new C3479q(0.0f);

    /* JADX INFO: renamed from: f */
    public fn1 f58567f = new C3479q(0.0f);

    /* JADX INFO: renamed from: g */
    public fn1 f58568g = new C3479q(0.0f);

    /* JADX INFO: renamed from: h */
    public fn1 f58569h = new C3479q(0.0f);

    /* JADX INFO: renamed from: i */
    public to2 f58570i = new to2();

    /* JADX INFO: renamed from: j */
    public to2 f58571j = new to2();

    /* JADX INFO: renamed from: k */
    public to2 f58572k = new to2();

    /* JADX INFO: renamed from: l */
    public to2 f58573l = new to2();

    /* JADX INFO: renamed from: g */
    public static q39 m20280g(Context context, int i, int i2) {
        C3479q c3479q = new C3479q(0.0f);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i2, true);
        }
        return m20282i(contextThemeWrapper.obtainStyledAttributes(R$styleable.ShapeAppearance), c3479q);
    }

    /* JADX INFO: renamed from: h */
    public static q39 m20281h(Context context, AttributeSet attributeSet, int i, int i2) {
        C3479q c3479q = new C3479q(0.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MaterialShape, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialShape_shapeAppearance, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialShape_shapeAppearanceOverlay, 0);
        typedArrayObtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        return m20282i(contextThemeWrapper.obtainStyledAttributes(R$styleable.ShapeAppearance), c3479q);
    }

    /* JADX INFO: renamed from: i */
    public static q39 m20282i(TypedArray typedArray, fn1 fn1Var) {
        try {
            int i = typedArray.getInt(R$styleable.ShapeAppearance_cornerFamily, 0);
            int i2 = typedArray.getInt(R$styleable.ShapeAppearance_cornerFamilyTopLeft, i);
            int i3 = typedArray.getInt(R$styleable.ShapeAppearance_cornerFamilyTopRight, i);
            int i4 = typedArray.getInt(R$styleable.ShapeAppearance_cornerFamilyBottomRight, i);
            int i5 = typedArray.getInt(R$styleable.ShapeAppearance_cornerFamilyBottomLeft, i);
            fn1 fn1VarM20283j = m20283j(typedArray, R$styleable.ShapeAppearance_cornerSize, fn1Var);
            fn1 fn1VarM20283j2 = m20283j(typedArray, R$styleable.ShapeAppearance_cornerSizeTopLeft, fn1VarM20283j);
            fn1 fn1VarM20283j3 = m20283j(typedArray, R$styleable.ShapeAppearance_cornerSizeTopRight, fn1VarM20283j);
            fn1 fn1VarM20283j4 = m20283j(typedArray, R$styleable.ShapeAppearance_cornerSizeBottomRight, fn1VarM20283j);
            fn1 fn1VarM20283j5 = m20283j(typedArray, R$styleable.ShapeAppearance_cornerSizeBottomLeft, fn1VarM20283j);
            q39 q39Var = new q39();
            q39Var.f57196a = AbstractC3184kh.m15216j(i2);
            q39Var.f57200e = fn1VarM20283j2;
            q39Var.f57197b = AbstractC3184kh.m15216j(i3);
            q39Var.f57201f = fn1VarM20283j3;
            q39Var.f57198c = AbstractC3184kh.m15216j(i4);
            q39Var.f57202g = fn1VarM20283j4;
            q39Var.f57199d = AbstractC3184kh.m15216j(i5);
            q39Var.f57203h = fn1VarM20283j5;
            return q39Var;
        } finally {
            typedArray.recycle();
        }
    }

    /* JADX INFO: renamed from: j */
    public static fn1 m20283j(TypedArray typedArray, int i, fn1 fn1Var) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new C3479q(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new p48(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return fn1Var;
    }

    @Override // p000.p39
    /* JADX INFO: renamed from: a */
    public final r39 mo13917a(float f) {
        q39 q39VarM20285l = m20285l();
        q39VarM20285l.m19628b(f);
        return q39VarM20285l.m19627a();
    }

    @Override // p000.p39
    /* JADX INFO: renamed from: b */
    public final r39 mo13918b(int[] iArr) {
        return this;
    }

    @Override // p000.p39
    /* JADX INFO: renamed from: c */
    public final r39[] mo13919c() {
        return new r39[]{this};
    }

    @Override // p000.p39
    /* JADX INFO: renamed from: d */
    public final r39 mo13920d() {
        return this;
    }

    @Override // p000.p39
    /* JADX INFO: renamed from: e */
    public final r39 mo13921e(p48 p48Var) {
        q39 q39VarM20285l = m20285l();
        q39VarM20285l.f57200e = p48Var;
        q39VarM20285l.f57201f = p48Var;
        q39VarM20285l.f57202g = p48Var;
        q39VarM20285l.f57203h = p48Var;
        return q39VarM20285l.m19627a();
    }

    @Override // p000.p39
    /* JADX INFO: renamed from: f */
    public final boolean mo13922f() {
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m20284k(RectF rectF) {
        boolean z = this.f58573l.getClass().equals(to2.class) && this.f58571j.getClass().equals(to2.class) && this.f58570i.getClass().equals(to2.class) && this.f58572k.getClass().equals(to2.class);
        float fMo11947a = this.f58566e.mo11947a(rectF);
        return z && ((this.f58567f.mo11947a(rectF) > fMo11947a ? 1 : (this.f58567f.mo11947a(rectF) == fMo11947a ? 0 : -1)) == 0 && (this.f58569h.mo11947a(rectF) > fMo11947a ? 1 : (this.f58569h.mo11947a(rectF) == fMo11947a ? 0 : -1)) == 0 && (this.f58568g.mo11947a(rectF) > fMo11947a ? 1 : (this.f58568g.mo11947a(rectF) == fMo11947a ? 0 : -1)) == 0) && (this.f58563b instanceof vi8) && (this.f58562a instanceof vi8) && (this.f58564c instanceof vi8) && (this.f58565d instanceof vi8);
    }

    /* JADX INFO: renamed from: l */
    public final q39 m20285l() {
        q39 q39Var = new q39();
        q39Var.f57196a = this.f58562a;
        q39Var.f57197b = this.f58563b;
        q39Var.f57198c = this.f58564c;
        q39Var.f57199d = this.f58565d;
        q39Var.f57200e = this.f58566e;
        q39Var.f57201f = this.f58567f;
        q39Var.f57202g = this.f58568g;
        q39Var.f57203h = this.f58569h;
        q39Var.f57204i = this.f58570i;
        q39Var.f57205j = this.f58571j;
        q39Var.f57206k = this.f58572k;
        q39Var.f57207l = this.f58573l;
        return q39Var;
    }

    public final String toString() {
        return "[" + this.f58566e + ", " + this.f58567f + ", " + this.f58568g + ", " + this.f58569h + "]";
    }
}
