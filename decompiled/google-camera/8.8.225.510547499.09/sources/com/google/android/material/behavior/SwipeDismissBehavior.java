package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p000.aai;
import p000.afb;
import p000.afq;
import p000.agr;
import p000.ahz;
import p000.aia;
import p000.auo;
import p000.mgq;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior extends aai {

    /* JADX INFO: renamed from: a */
    public aia f8068a;

    /* JADX INFO: renamed from: b */
    public boolean f8069b;

    /* JADX INFO: renamed from: f */
    private boolean f8073f;

    /* JADX INFO: renamed from: c */
    public int f8070c = 2;

    /* JADX INFO: renamed from: d */
    public float f8071d = 0.0f;

    /* JADX INFO: renamed from: e */
    public float f8072e = 0.5f;

    /* JADX INFO: renamed from: g */
    private final ahz f8074g = new mgq(this);

    /* JADX INFO: renamed from: v */
    public static float m4791v(float f) {
        return Math.min(Math.max(0.0f, f), 1.0f);
    }

    @Override // p000.aai
    /* JADX INFO: renamed from: d */
    public boolean mo7d(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zM1427k = this.f8073f;
        switch (motionEvent.getActionMasked()) {
            case 0:
                zM1427k = coordinatorLayout.m1427k(view, (int) motionEvent.getX(), (int) motionEvent.getY());
                this.f8073f = zM1427k;
                break;
            case 1:
            case 3:
                this.f8073f = false;
                break;
        }
        if (zM1427k) {
            if (this.f8068a == null) {
                this.f8068a = aia.m728b(coordinatorLayout, this.f8074g);
            }
            if (!this.f8069b && this.f8068a.m749j(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.aai
    /* JADX INFO: renamed from: e */
    public final boolean mo8e(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (afb.m420a(view) != 0) {
            return false;
        }
        afb.m434o(view, 1);
        afq.m546f(view, 1048576);
        if (!mo4792u(view)) {
            return false;
        }
        afq.m549i(view, agr.f345u, new auo(this, 2));
        return false;
    }

    @Override // p000.aai
    /* JADX INFO: renamed from: g */
    public final boolean mo10g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f8068a == null) {
            return false;
        }
        if (this.f8069b && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f8068a.m744e(motionEvent);
        return true;
    }

    /* JADX INFO: renamed from: u */
    public boolean mo4792u(View view) {
        return true;
    }
}
