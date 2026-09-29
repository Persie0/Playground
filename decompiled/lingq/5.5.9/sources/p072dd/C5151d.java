package p072dd;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v4.media.AbstractC0140a;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import p153hc.C6031a;
import p286o2.C7906f;

/* JADX INFO: renamed from: dd.d */
/* JADX INFO: loaded from: classes.dex */
public final class C5151d {

    /* JADX INFO: renamed from: a */
    public final ColorStateList f33127a;

    /* JADX INFO: renamed from: b */
    public final String f33128b;

    /* JADX INFO: renamed from: c */
    public final int f33129c;

    /* JADX INFO: renamed from: d */
    public final int f33130d;

    /* JADX INFO: renamed from: e */
    public final float f33131e;

    /* JADX INFO: renamed from: f */
    public final float f33132f;

    /* JADX INFO: renamed from: g */
    public final float f33133g;

    /* JADX INFO: renamed from: h */
    public final boolean f33134h;

    /* JADX INFO: renamed from: i */
    public final float f33135i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f33136j;

    /* JADX INFO: renamed from: k */
    public float f33137k;

    /* JADX INFO: renamed from: l */
    public final int f33138l;

    /* JADX INFO: renamed from: m */
    public boolean f33139m = false;

    /* JADX INFO: renamed from: n */
    public Typeface f33140n;

    /* JADX INFO: renamed from: dd.d$a */
    public class a extends C7906f.e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC0140a f33141a;

        public a(AbstractC0140a abstractC0140a) {
            this.f33141a = abstractC0140a;
        }

        @Override // p286o2.C7906f.e
        /* JADX INFO: renamed from: c */
        public final void mo1296c(int i10) {
            C5151d.this.f33139m = true;
            this.f33141a.mo586X(i10);
        }

        @Override // p286o2.C7906f.e
        /* JADX INFO: renamed from: d */
        public final void mo1297d(Typeface typeface) {
            C5151d c5151d = C5151d.this;
            c5151d.f33140n = Typeface.create(typeface, c5151d.f33129c);
            c5151d.f33139m = true;
            this.f33141a.mo587Y(c5151d.f33140n, false);
        }
    }

    public C5151d(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, C6031a.f35646O);
        this.f33137k = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f33136j = C5150c.m10925a(context, typedArrayObtainStyledAttributes, 3);
        C5150c.m10925a(context, typedArrayObtainStyledAttributes, 4);
        C5150c.m10925a(context, typedArrayObtainStyledAttributes, 5);
        this.f33129c = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f33130d = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i11 = 12;
        if (!typedArrayObtainStyledAttributes.hasValue(12)) {
            i11 = 10;
        }
        this.f33138l = typedArrayObtainStyledAttributes.getResourceId(i11, 0);
        this.f33128b = typedArrayObtainStyledAttributes.getString(i11);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f33127a = C5150c.m10925a(context, typedArrayObtainStyledAttributes, 6);
        this.f33131e = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f33132f = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f33133g = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i10, C6031a.f35676z);
        this.f33134h = typedArrayObtainStyledAttributes2.hasValue(0);
        this.f33135i = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final void m10930a() {
        String str;
        Typeface typeface = this.f33140n;
        int i10 = this.f33129c;
        if (typeface == null && (str = this.f33128b) != null) {
            this.f33140n = Typeface.create(str, i10);
        }
        if (this.f33140n == null) {
            int i11 = this.f33130d;
            if (i11 == 1) {
                this.f33140n = Typeface.SANS_SERIF;
            } else if (i11 == 2) {
                this.f33140n = Typeface.SERIF;
            } else if (i11 != 3) {
                this.f33140n = Typeface.DEFAULT;
            } else {
                this.f33140n = Typeface.MONOSPACE;
            }
            this.f33140n = Typeface.create(this.f33140n, i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Typeface m10931b(Context context) {
        if (this.f33139m) {
            return this.f33140n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM15674a = C7906f.m15674a(this.f33138l, context);
                this.f33140n = typefaceM15674a;
                if (typefaceM15674a != null) {
                    this.f33140n = Typeface.create(typefaceM15674a, this.f33129c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                Log.d("TextAppearance", "Error loading font " + this.f33128b, e10);
            }
        }
        m10930a();
        this.f33139m = true;
        return this.f33140n;
    }

    /* JADX INFO: renamed from: c */
    public final void m10932c(Context context, AbstractC0140a abstractC0140a) {
        if (m10933d(context)) {
            m10931b(context);
        } else {
            m10930a();
        }
        int i10 = this.f33138l;
        if (i10 == 0) {
            this.f33139m = true;
        }
        if (this.f33139m) {
            abstractC0140a.mo587Y(this.f33140n, true);
            return;
        }
        try {
            a aVar = new a(abstractC0140a);
            ThreadLocal<TypedValue> threadLocal = C7906f.f43056a;
            if (context.isRestricted()) {
                aVar.m15680a(-4);
            } else {
                C7906f.m15675b(context, i10, new TypedValue(), 0, aVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f33139m = true;
            abstractC0140a.mo586X(1);
        } catch (Exception e10) {
            Log.d("TextAppearance", "Error loading font " + this.f33128b, e10);
            this.f33139m = true;
            abstractC0140a.mo586X(-3);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m10933d(Context context) {
        Typeface typefaceM15675b;
        int i10 = this.f33138l;
        if (i10 != 0) {
            ThreadLocal<TypedValue> threadLocal = C7906f.f43056a;
            typefaceM15675b = context.isRestricted() ? null : C7906f.m15675b(context, i10, new TypedValue(), 0, null, false, true);
        }
        return typefaceM15675b != null;
    }

    /* JADX INFO: renamed from: e */
    public final void m10934e(Context context, TextPaint textPaint, AbstractC0140a abstractC0140a) {
        m10935f(context, textPaint, abstractC0140a);
        ColorStateList colorStateList = this.f33136j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f33127a;
        textPaint.setShadowLayer(this.f33133g, this.f33131e, this.f33132f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* JADX INFO: renamed from: f */
    public final void m10935f(Context context, TextPaint textPaint, AbstractC0140a abstractC0140a) {
        if (m10933d(context)) {
            m10936g(context, textPaint, m10931b(context));
            return;
        }
        m10930a();
        m10936g(context, textPaint, this.f33140n);
        m10932c(context, new C5152e(this, context, textPaint, abstractC0140a));
    }

    /* JADX INFO: renamed from: g */
    public final void m10936g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceM10937a = C5153f.m10937a(context.getResources().getConfiguration(), typeface);
        if (typefaceM10937a != null) {
            typeface = typefaceM10937a;
        }
        textPaint.setTypeface(typeface);
        int i10 = (~typeface.getStyle()) & this.f33129c;
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f33137k);
        if (this.f33134h) {
            textPaint.setLetterSpacing(this.f33135i);
        }
    }
}
