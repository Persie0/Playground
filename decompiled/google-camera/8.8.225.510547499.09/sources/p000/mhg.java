package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mhg {

    /* JADX INFO: renamed from: a */
    public final MaterialButton f40490a;

    /* JADX INFO: renamed from: b */
    public mlc f40491b;

    /* JADX INFO: renamed from: c */
    public int f40492c;

    /* JADX INFO: renamed from: d */
    public int f40493d;

    /* JADX INFO: renamed from: e */
    public int f40494e;

    /* JADX INFO: renamed from: f */
    public int f40495f;

    /* JADX INFO: renamed from: g */
    public int f40496g;

    /* JADX INFO: renamed from: h */
    public int f40497h;

    /* JADX INFO: renamed from: i */
    public PorterDuff.Mode f40498i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f40499j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f40500k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f40501l;

    /* JADX INFO: renamed from: m */
    public Drawable f40502m;

    /* JADX INFO: renamed from: o */
    public boolean f40504o;

    /* JADX INFO: renamed from: q */
    public LayerDrawable f40506q;

    /* JADX INFO: renamed from: r */
    public int f40507r;

    /* JADX INFO: renamed from: n */
    public boolean f40503n = false;

    /* JADX INFO: renamed from: p */
    public boolean f40505p = true;

    public mhg(MaterialButton materialButton, mlc mlcVar) {
        this.f40490a = materialButton;
        this.f40491b = mlcVar;
    }

    /* JADX INFO: renamed from: e */
    private final mkx m16371e(boolean z) {
        LayerDrawable layerDrawable = this.f40506q;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (mkx) ((LayerDrawable) ((InsetDrawable) this.f40506q.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    /* JADX INFO: renamed from: f */
    private final mkx m16372f() {
        return m16371e(true);
    }

    /* JADX INFO: renamed from: a */
    public final mkx m16373a() {
        return m16371e(false);
    }

    /* JADX INFO: renamed from: b */
    public final mll m16374b() {
        LayerDrawable layerDrawable = this.f40506q;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f40506q.getNumberOfLayers() > 2 ? (mll) this.f40506q.getDrawable(2) : (mll) this.f40506q.getDrawable(1);
    }

    /* JADX INFO: renamed from: c */
    public final void m16375c() {
        this.f40503n = true;
        this.f40490a.m4828d(this.f40499j);
        this.f40490a.m4829e(this.f40498i);
    }

    /* JADX INFO: renamed from: d */
    public final void m16376d(mlc mlcVar) {
        this.f40491b = mlcVar;
        if (m16373a() != null) {
            m16373a().mo4827c(mlcVar);
        }
        if (m16372f() != null) {
            m16372f().mo4827c(mlcVar);
        }
        if (m16374b() != null) {
            m16374b().mo4827c(mlcVar);
        }
    }
}
