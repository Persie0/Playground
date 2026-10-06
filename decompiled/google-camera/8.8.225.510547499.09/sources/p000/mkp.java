package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.TypedValue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mkp {

    /* JADX INFO: renamed from: a */
    public final ColorStateList f40850a;

    /* JADX INFO: renamed from: b */
    public final String f40851b;

    /* JADX INFO: renamed from: c */
    public final int f40852c;

    /* JADX INFO: renamed from: d */
    public final int f40853d;

    /* JADX INFO: renamed from: e */
    public final float f40854e;

    /* JADX INFO: renamed from: f */
    public final float f40855f;

    /* JADX INFO: renamed from: g */
    public final float f40856g;

    /* JADX INFO: renamed from: h */
    public final float f40857h;

    /* JADX INFO: renamed from: i */
    public final ColorStateList f40858i;

    /* JADX INFO: renamed from: j */
    public final float f40859j;

    /* JADX INFO: renamed from: k */
    public Typeface f40860k;

    /* JADX INFO: renamed from: l */
    private final int f40861l;

    /* JADX INFO: renamed from: m */
    private boolean f40862m = false;

    public mkp(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, mkn.f40847b);
        this.f40859j = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f40858i = mkv.m16540d(context, typedArrayObtainStyledAttributes, 3);
        mkv.m16540d(context, typedArrayObtainStyledAttributes, 4);
        mkv.m16540d(context, typedArrayObtainStyledAttributes, 5);
        this.f40852c = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f40853d = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i2 = true != typedArrayObtainStyledAttributes.hasValue(15) ? 10 : 15;
        this.f40861l = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
        this.f40851b = typedArrayObtainStyledAttributes.getString(i2);
        typedArrayObtainStyledAttributes.getBoolean(17, false);
        this.f40850a = mkv.m16540d(context, typedArrayObtainStyledAttributes, 6);
        this.f40854e = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f40855f = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f40856g = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, mkn.f40846a);
        typedArrayObtainStyledAttributes2.hasValue(0);
        this.f40857h = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    /* JADX INFO: renamed from: e */
    private final void m16485e() {
        Typeface typeface;
        String str;
        if (this.f40860k == null && (str = this.f40851b) != null) {
            this.f40860k = Typeface.create(str, this.f40852c);
        }
        if (this.f40860k == null) {
            switch (this.f40853d) {
                case 1:
                    typeface = Typeface.SANS_SERIF;
                    this.f40860k = typeface;
                    break;
                case 2:
                    typeface = Typeface.SERIF;
                    this.f40860k = typeface;
                    break;
                case 3:
                    typeface = Typeface.MONOSPACE;
                    this.f40860k = typeface;
                    break;
                default:
                    this.f40860k = Typeface.DEFAULT;
                    break;
            }
            this.f40860k = Typeface.create(this.f40860k, this.f40852c);
        }
    }

    /* JADX INFO: renamed from: a */
    public final Typeface m16486a() {
        m16485e();
        return this.f40860k;
    }

    /* JADX INFO: renamed from: c */
    public final void m16487c(Context context) {
        if (this.f40862m) {
            return;
        }
        if (!context.isRestricted()) {
            try {
                int i = this.f40861l;
                ThreadLocal threadLocal = acn.f88a;
                Typeface typefaceM207b = context.isRestricted() ? null : acn.m207b(context, i, new TypedValue(), 0, null, false, false);
                this.f40860k = typefaceM207b;
                if (typefaceM207b != null) {
                    this.f40860k = Typeface.create(typefaceM207b, this.f40852c);
                }
            } catch (Resources.NotFoundException e) {
            } catch (UnsupportedOperationException e2) {
            } catch (Exception e3) {
            }
        }
        m16485e();
        this.f40862m = true;
    }

    /* JADX INFO: renamed from: d */
    public final void m16488d(Context context, bzm bzmVar) {
        Typeface typefaceM207b;
        int i = this.f40861l;
        if (i != 0) {
            ThreadLocal threadLocal = acn.f88a;
            typefaceM207b = context.isRestricted() ? null : acn.m207b(context, i, new TypedValue(), 0, null, false, true);
        } else {
            typefaceM207b = null;
        }
        if (typefaceM207b != null) {
            m16487c(context);
        } else {
            m16485e();
        }
        int i2 = this.f40861l;
        if (i2 == 0) {
            this.f40862m = true;
            i2 = 0;
        }
        if (this.f40862m) {
            bzmVar.m3222e(this.f40860k);
            return;
        }
        try {
            acn.m206a(context, i2, new mko(this, bzmVar, null));
        } catch (Resources.NotFoundException e) {
            this.f40862m = true;
            bzmVar.m3223f();
        } catch (Exception e2) {
            this.f40862m = true;
            bzmVar.m3223f();
        }
    }
}
