package com.amplitude.android.internal.gestures;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.amplitude.android.internal.AbstractC0885b;
import com.amplitude.android.internal.C0884a;
import com.amplitude.android.internal.ViewTarget$Type;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Pair;
import p000.kva;
import p000.pj5;
import p000.s84;
import p000.ui3;
import p000.v50;
import p000.vi3;
import p000.zi3;

/* JADX INFO: renamed from: com.amplitude.android.internal.gestures.a */
/* JADX INFO: loaded from: classes.dex */
public final class GestureDetectorOnGestureListenerC0886a implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: a */
    public final String f10836a;

    /* JADX INFO: renamed from: b */
    public final zi3 f10837b;

    /* JADX INFO: renamed from: c */
    public final pj5 f10838c;

    /* JADX INFO: renamed from: d */
    public final List f10839d;

    /* JADX INFO: renamed from: e */
    public final ui3 f10840e;

    /* JADX INFO: renamed from: f */
    public vi3 f10841f;

    /* JADX INFO: renamed from: g */
    public final WeakReference f10842g;

    public GestureDetectorOnGestureListenerC0886a(View view, String str, zi3 zi3Var, pj5 pj5Var, List list, ui3 ui3Var) {
        view.getClass();
        pj5Var.getClass();
        list.getClass();
        this.f10836a = str;
        this.f10837b = zi3Var;
        this.f10838c = pj5Var;
        this.f10839d = list;
        this.f10840e = ui3Var;
        this.f10841f = null;
        this.f10842g = new WeakReference(view);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        motionEvent.getClass();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        motionEvent2.getClass();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        motionEvent.getClass();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        motionEvent2.getClass();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
        motionEvent.getClass();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        motionEvent.getClass();
        ui3 ui3Var = this.f10840e;
        if (!((v50) ui3Var.mo0a()).f64878e.isEmpty()) {
            View view = (View) this.f10842g.get();
            pj5 pj5Var = this.f10838c;
            if (view == null) {
                pj5Var.mo16255a("DecorView is null in onSingleTapUp()");
                return false;
            }
            Pair pair = new Pair(Float.valueOf(motionEvent.getX()), Float.valueOf(motionEvent.getY()));
            kva kvaVarM5072b = C0884a.m5072b(pj5Var, view, ViewTarget$Type.Clickable, this.f10839d, pair);
            if (kvaVarM5072b == null) {
                pj5Var.mo16257c("Unable to find click target. No event captured.");
                return false;
            }
            vi3 vi3Var = this.f10841f;
            if (vi3Var != null) {
                ((AutocaptureWindowCallback$2) vi3Var).invoke(kvaVarM5072b);
            }
            if (((v50) ui3Var.mo0a()).f64878e.contains(s84.f60508a)) {
                this.f10837b.invoke("[Amplitude] Element Interacted", AbstractC0885b.m5073a(kvaVarM5072b, this.f10836a));
            }
        }
        return false;
    }
}
