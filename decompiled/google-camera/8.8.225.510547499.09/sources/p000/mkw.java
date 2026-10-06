package p000;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mkw extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public mlc f40870a;

    /* JADX INFO: renamed from: b */
    public mhu f40871b;

    /* JADX INFO: renamed from: c */
    public ColorFilter f40872c;

    /* JADX INFO: renamed from: d */
    public ColorStateList f40873d;

    /* JADX INFO: renamed from: e */
    public ColorStateList f40874e;

    /* JADX INFO: renamed from: f */
    public ColorStateList f40875f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f40876g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f40877h;

    /* JADX INFO: renamed from: i */
    public Rect f40878i;

    /* JADX INFO: renamed from: j */
    public float f40879j;

    /* JADX INFO: renamed from: k */
    public float f40880k;

    /* JADX INFO: renamed from: l */
    public float f40881l;

    /* JADX INFO: renamed from: m */
    public int f40882m;

    /* JADX INFO: renamed from: n */
    public float f40883n;

    /* JADX INFO: renamed from: o */
    public float f40884o;

    /* JADX INFO: renamed from: p */
    public float f40885p;

    /* JADX INFO: renamed from: q */
    public int f40886q;

    /* JADX INFO: renamed from: r */
    public int f40887r;

    /* JADX INFO: renamed from: s */
    public int f40888s;

    /* JADX INFO: renamed from: t */
    public int f40889t;

    /* JADX INFO: renamed from: u */
    public boolean f40890u;

    /* JADX INFO: renamed from: v */
    public Paint.Style f40891v;

    public mkw(mkw mkwVar) {
        this.f40873d = null;
        this.f40874e = null;
        this.f40875f = null;
        this.f40876g = null;
        this.f40877h = PorterDuff.Mode.SRC_IN;
        this.f40878i = null;
        this.f40879j = 1.0f;
        this.f40880k = 1.0f;
        this.f40882m = 255;
        this.f40883n = 0.0f;
        this.f40884o = 0.0f;
        this.f40885p = 0.0f;
        this.f40886q = 0;
        this.f40887r = 0;
        this.f40888s = 0;
        this.f40889t = 0;
        this.f40890u = false;
        this.f40891v = Paint.Style.FILL_AND_STROKE;
        this.f40870a = mkwVar.f40870a;
        this.f40871b = mkwVar.f40871b;
        this.f40881l = mkwVar.f40881l;
        this.f40872c = mkwVar.f40872c;
        this.f40873d = mkwVar.f40873d;
        this.f40874e = mkwVar.f40874e;
        this.f40877h = mkwVar.f40877h;
        this.f40876g = mkwVar.f40876g;
        this.f40882m = mkwVar.f40882m;
        this.f40879j = mkwVar.f40879j;
        this.f40888s = mkwVar.f40888s;
        int i = mkwVar.f40886q;
        this.f40886q = 0;
        boolean z = mkwVar.f40890u;
        this.f40890u = false;
        this.f40880k = mkwVar.f40880k;
        this.f40883n = mkwVar.f40883n;
        this.f40884o = mkwVar.f40884o;
        float f = mkwVar.f40885p;
        this.f40885p = 0.0f;
        this.f40887r = mkwVar.f40887r;
        int i2 = mkwVar.f40889t;
        this.f40889t = 0;
        ColorStateList colorStateList = mkwVar.f40875f;
        this.f40875f = null;
        this.f40891v = mkwVar.f40891v;
        Rect rect = mkwVar.f40878i;
        if (rect != null) {
            this.f40878i = new Rect(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        mkx mkxVar = new mkx(this);
        mkxVar.f40897e = true;
        return mkxVar;
    }

    public mkw(mlc mlcVar) {
        this.f40873d = null;
        this.f40874e = null;
        this.f40875f = null;
        this.f40876g = null;
        this.f40877h = PorterDuff.Mode.SRC_IN;
        this.f40878i = null;
        this.f40879j = 1.0f;
        this.f40880k = 1.0f;
        this.f40882m = 255;
        this.f40883n = 0.0f;
        this.f40884o = 0.0f;
        this.f40885p = 0.0f;
        this.f40886q = 0;
        this.f40887r = 0;
        this.f40888s = 0;
        this.f40889t = 0;
        this.f40890u = false;
        this.f40891v = Paint.Style.FILL_AND_STROKE;
        this.f40870a = mlcVar;
        this.f40871b = null;
    }
}
