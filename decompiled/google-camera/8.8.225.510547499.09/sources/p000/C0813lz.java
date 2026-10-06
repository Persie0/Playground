package p000;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: lz */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class C0813lz extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: c */
    public C0829mo f39585c;

    /* JADX INFO: renamed from: d */
    public final Rect f39586d;

    /* JADX INFO: renamed from: e */
    public boolean f39587e;

    /* JADX INFO: renamed from: f */
    boolean f39588f;

    public C0813lz(int i, int i2) {
        super(i, i2);
        this.f39586d = new Rect();
        this.f39587e = true;
        this.f39588f = false;
    }

    /* JADX INFO: renamed from: a */
    public final int m16218a() {
        return this.f39585c.m16675b();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m16219b() {
        return this.f39585c.m16697x();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m16220c() {
        return this.f39585c.m16694u();
    }

    public C0813lz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39586d = new Rect();
        this.f39587e = true;
        this.f39588f = false;
    }

    public C0813lz(C0813lz c0813lz) {
        super((ViewGroup.LayoutParams) c0813lz);
        this.f39586d = new Rect();
        this.f39587e = true;
        this.f39588f = false;
    }

    public C0813lz(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f39586d = new Rect();
        this.f39587e = true;
        this.f39588f = false;
    }

    public C0813lz(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f39586d = new Rect();
        this.f39587e = true;
        this.f39588f = false;
    }
}
