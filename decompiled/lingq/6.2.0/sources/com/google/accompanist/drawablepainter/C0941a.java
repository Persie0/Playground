package com.google.accompanist.drawablepainter;

import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.compose.p002ui.node.C0358h;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.AbstractC0278f;
import kotlin.AbstractC3192a;
import p000.AbstractC3497qg;
import p000.C3303lm;
import p000.C3459pg;
import p000.an0;
import p000.cs4;
import p000.do7;
import p000.fa1;
import p000.gm5;
import p000.l70;
import p000.rl2;
import p000.ss5;
import p000.t66;
import p000.ui3;
import p000.x48;
import p000.x89;
import p000.xc9;
import p000.y27;
import p000.ym0;

/* JADX INFO: renamed from: com.google.accompanist.drawablepainter.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C0941a extends y27 implements x48 {

    /* JADX INFO: renamed from: e */
    public final Drawable f11532e;

    /* JADX INFO: renamed from: f */
    public final t66 f11533f;

    /* JADX INFO: renamed from: g */
    public final t66 f11534g;

    /* JADX INFO: renamed from: h */
    public final cs4 f11535h;

    public C0941a(Drawable drawable) {
        drawable.getClass();
        this.f11532e = drawable;
        this.f11533f = AbstractC0278f.m1260j(0);
        cs4 cs4Var = AbstractC0942b.f11536a;
        this.f11534g = AbstractC0278f.m1260j(new x89((drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? 9205357640488583168L : do7.m10528d(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())));
        this.f11535h = AbstractC3192a.m15356a(new ui3() { // from class: com.google.accompanist.drawablepainter.DrawablePainter$callback$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return new C3303lm(this.f11530b, 1);
            }
        });
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // p000.y27
    /* JADX INFO: renamed from: a */
    public final void mo1443a(float f) {
        this.f11532e.setAlpha(l70.m15945h(ss5.m21693T(f * 255.0f), 0, 255));
    }

    @Override // p000.y27
    /* JADX INFO: renamed from: b */
    public final void mo1444b(fa1 fa1Var) {
        this.f11532e.setColorFilter(fa1Var != null ? fa1Var.f38699a : null);
    }

    @Override // p000.y27
    /* JADX INFO: renamed from: c */
    public final void mo5262c(LayoutDirection layoutDirection) {
        layoutDirection.getClass();
        int i = rl2.f59469a[layoutDirection.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            gm5.m12750e();
            return;
        }
        this.f11532e.setLayoutDirection(i2);
    }

    @Override // p000.x48
    /* JADX INFO: renamed from: d */
    public final void mo1245d() {
        mo1246f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.x48
    /* JADX INFO: renamed from: f */
    public final void mo1246f() {
        Drawable drawable = this.f11532e;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.x48
    /* JADX INFO: renamed from: g */
    public final void mo1247g() {
        Drawable.Callback callback = (Drawable.Callback) this.f11535h.getValue();
        Drawable drawable = this.f11532e;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // p000.y27
    /* JADX INFO: renamed from: i */
    public final long mo1445i() {
        return ((x89) ((xc9) this.f11534g).getValue()).f67935a;
    }

    @Override // p000.y27
    /* JADX INFO: renamed from: j */
    public final void mo1446j(C0358h c0358h) {
        an0 an0Var = c0358h.f4358a;
        ym0 ym0VarM16515r = an0Var.f853b.m16515r();
        ((Number) ((xc9) this.f11533f).getValue()).intValue();
        int iM21693T = ss5.m21693T(x89.m24407d(an0Var.mo1422h()));
        int iM21693T2 = ss5.m21693T(x89.m24405b(an0Var.mo1422h()));
        Drawable drawable = this.f11532e;
        drawable.setBounds(0, 0, iM21693T, iM21693T2);
        try {
            ym0VarM16515r.mo17016h();
            Canvas canvas = AbstractC3497qg.f57736a;
            drawable.draw(((C3459pg) ym0VarM16515r).f56079a);
        } finally {
            ym0VarM16515r.mo17024p();
        }
    }
}
