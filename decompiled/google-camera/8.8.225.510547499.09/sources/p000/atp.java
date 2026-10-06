package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class atp extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    int f2355a;

    /* JADX INFO: renamed from: b */
    ato f2356b;

    /* JADX INFO: renamed from: c */
    ColorStateList f2357c;

    /* JADX INFO: renamed from: d */
    PorterDuff.Mode f2358d;

    /* JADX INFO: renamed from: e */
    boolean f2359e;

    /* JADX INFO: renamed from: f */
    Bitmap f2360f;

    /* JADX INFO: renamed from: g */
    ColorStateList f2361g;

    /* JADX INFO: renamed from: h */
    PorterDuff.Mode f2362h;

    /* JADX INFO: renamed from: i */
    int f2363i;

    /* JADX INFO: renamed from: j */
    boolean f2364j;

    /* JADX INFO: renamed from: k */
    boolean f2365k;

    /* JADX INFO: renamed from: l */
    Paint f2366l;

    public atp() {
        this.f2357c = null;
        this.f2358d = atr.f2368a;
        this.f2356b = new ato();
    }

    /* JADX INFO: renamed from: a */
    public final void m1988a(int i, int i2) {
        this.f2360f.eraseColor(0);
        Canvas canvas = new Canvas(this.f2360f);
        ato atoVar = this.f2356b;
        atoVar.m1987a(atoVar.f2341d, ato.f2338a, canvas, i, i2);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1989b() {
        ato atoVar = this.f2356b;
        if (atoVar.f2348k == null) {
            atoVar.f2348k = Boolean.valueOf(atoVar.f2341d.mo1969b());
        }
        return atoVar.f2348k.booleanValue();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f2355a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new atr(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new atr(this);
    }

    public atp(atp atpVar) {
        this.f2357c = null;
        this.f2358d = atr.f2368a;
        if (atpVar != null) {
            this.f2355a = atpVar.f2355a;
            this.f2356b = new ato(atpVar.f2356b);
            Paint paint = atpVar.f2356b.f2340c;
            if (paint != null) {
                this.f2356b.f2340c = new Paint(paint);
            }
            Paint paint2 = atpVar.f2356b.f2339b;
            if (paint2 != null) {
                this.f2356b.f2339b = new Paint(paint2);
            }
            this.f2357c = atpVar.f2357c;
            this.f2358d = atpVar.f2358d;
            this.f2359e = atpVar.f2359e;
        }
    }
}
