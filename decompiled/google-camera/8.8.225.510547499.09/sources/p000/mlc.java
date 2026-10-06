package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mlc {

    /* JADX INFO: renamed from: a */
    public static final mkt f40944a = new mkz(0.5f);

    /* JADX INFO: renamed from: b */
    public final mkt f40945b;

    /* JADX INFO: renamed from: c */
    final mkt f40946c;

    /* JADX INFO: renamed from: d */
    final mkt f40947d;

    /* JADX INFO: renamed from: e */
    final mkt f40948e;

    /* JADX INFO: renamed from: f */
    final mkv f40949f;

    /* JADX INFO: renamed from: g */
    final mkv f40950g;

    /* JADX INFO: renamed from: h */
    final mkv f40951h;

    /* JADX INFO: renamed from: i */
    final mkv f40952i;

    /* JADX INFO: renamed from: j */
    final mkv f40953j;

    /* JADX INFO: renamed from: k */
    final mkv f40954k;

    /* JADX INFO: renamed from: l */
    final mkv f40955l;

    /* JADX INFO: renamed from: m */
    final mkv f40956m;

    public mlc() {
        this.f40953j = mkv.m16549n();
        this.f40954k = mkv.m16549n();
        this.f40955l = mkv.m16549n();
        this.f40956m = mkv.m16549n();
        this.f40945b = new mkr(0.0f);
        this.f40946c = new mkr(0.0f);
        this.f40947d = new mkr(0.0f);
        this.f40948e = new mkr(0.0f);
        this.f40949f = mkv.m16543h();
        this.f40950g = mkv.m16543h();
        this.f40951h = mkv.m16543h();
        this.f40952i = mkv.m16543h();
    }

    public mlc(mlb mlbVar) {
        this.f40953j = mlbVar.f40940i;
        this.f40954k = mlbVar.f40941j;
        this.f40955l = mlbVar.f40942k;
        this.f40956m = mlbVar.f40943l;
        this.f40945b = mlbVar.f40932a;
        this.f40946c = mlbVar.f40933b;
        this.f40947d = mlbVar.f40934c;
        this.f40948e = mlbVar.f40935d;
        this.f40949f = mlbVar.f40936e;
        this.f40950g = mlbVar.f40937f;
        this.f40951h = mlbVar.f40938g;
        this.f40952i = mlbVar.f40939h;
    }

    /* JADX INFO: renamed from: a */
    public static mlb m16590a(Context context, AttributeSet attributeSet, int i, int i2) {
        return m16591b(context, attributeSet, i, i2, new mkr(0.0f));
    }

    /* JADX INFO: renamed from: b */
    public static mlb m16591b(Context context, AttributeSet attributeSet, int i, int i2, mkt mktVar) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mky.f40913a, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, resourceId2);
        }
        TypedArray typedArrayObtainStyledAttributes2 = contextThemeWrapper.obtainStyledAttributes(mky.f40914b);
        try {
            int i3 = typedArrayObtainStyledAttributes2.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes2.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes2.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes2.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes2.getInt(1, i3);
            mkt mktVarM16592f = m16592f(typedArrayObtainStyledAttributes2, 5, mktVar);
            mkt mktVarM16592f2 = m16592f(typedArrayObtainStyledAttributes2, 8, mktVarM16592f);
            mkt mktVarM16592f3 = m16592f(typedArrayObtainStyledAttributes2, 9, mktVarM16592f);
            mkt mktVarM16592f4 = m16592f(typedArrayObtainStyledAttributes2, 7, mktVarM16592f);
            mkt mktVarM16592f5 = m16592f(typedArrayObtainStyledAttributes2, 6, mktVarM16592f);
            mlb mlbVar = new mlb();
            mkv mkvVarM16548m = mkv.m16548m(i4);
            mlbVar.f40940i = mkvVarM16548m;
            mlb.m16588b(mkvVarM16548m);
            mlbVar.f40932a = mktVarM16592f2;
            mkv mkvVarM16548m2 = mkv.m16548m(i5);
            mlbVar.f40941j = mkvVarM16548m2;
            mlb.m16588b(mkvVarM16548m2);
            mlbVar.f40933b = mktVarM16592f3;
            mkv mkvVarM16548m3 = mkv.m16548m(i6);
            mlbVar.f40942k = mkvVarM16548m3;
            mlb.m16588b(mkvVarM16548m3);
            mlbVar.f40934c = mktVarM16592f4;
            mkv mkvVarM16548m4 = mkv.m16548m(i7);
            mlbVar.f40943l = mkvVarM16548m4;
            mlb.m16588b(mkvVarM16548m4);
            mlbVar.f40935d = mktVarM16592f5;
            return mlbVar;
        } finally {
            typedArrayObtainStyledAttributes2.recycle();
        }
    }

    /* JADX INFO: renamed from: f */
    private static mkt m16592f(TypedArray typedArray, int i, mkt mktVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue == null) {
            return mktVar;
        }
        if (typedValuePeekValue.type == 5) {
            return new mkr(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return typedValuePeekValue.type == 6 ? new mkz(typedValuePeekValue.getFraction(1.0f, 1.0f)) : mktVar;
    }

    /* JADX INFO: renamed from: c */
    public final mlb m16593c() {
        return new mlb(this);
    }

    /* JADX INFO: renamed from: d */
    public final mlc m16594d(float f) {
        mlb mlbVarM16593c = m16593c();
        mlbVarM16593c.f40932a = new mkr(f);
        mlbVarM16593c.f40933b = new mkr(f);
        mlbVarM16593c.f40934c = new mkr(f);
        mlbVarM16593c.f40935d = new mkr(f);
        return mlbVarM16593c.m16589a();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m16595e(RectF rectF) {
        boolean z = this.f40952i.getClass().equals(mkv.class) && this.f40950g.getClass().equals(mkv.class) && this.f40949f.getClass().equals(mkv.class) && this.f40951h.getClass().equals(mkv.class);
        float fMo16491a = this.f40945b.mo16491a(rectF);
        return z && ((this.f40946c.mo16491a(rectF) > fMo16491a ? 1 : (this.f40946c.mo16491a(rectF) == fMo16491a ? 0 : -1)) == 0 && (this.f40948e.mo16491a(rectF) > fMo16491a ? 1 : (this.f40948e.mo16491a(rectF) == fMo16491a ? 0 : -1)) == 0 && (this.f40947d.mo16491a(rectF) > fMo16491a ? 1 : (this.f40947d.mo16491a(rectF) == fMo16491a ? 0 : -1)) == 0) && ((this.f40954k instanceof mla) && (this.f40953j instanceof mla) && (this.f40955l instanceof mla) && (this.f40956m instanceof mla));
    }
}
