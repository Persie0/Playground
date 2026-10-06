package com.google.android.apps.camera.p014ui.wirers;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.wear.ambient.AmbientModeSupport;
import p000.ipz;
import p000.iqh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class PreviewOverlay extends View {

    /* JADX INFO: renamed from: a */
    public GestureDetector f7297a;

    /* JADX INFO: renamed from: b */
    public View.OnTouchListener f7298b;

    /* JADX INFO: renamed from: c */
    public boolean f7299c;

    /* JADX INFO: renamed from: d */
    public boolean f7300d;

    /* JADX INFO: renamed from: e */
    public AmbientModeSupport.AmbientController f7301e;

    /* JADX INFO: renamed from: f */
    private final int[] f7302f;

    public PreviewOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7302f = new int[]{0, 0};
        this.f7297a = null;
        this.f7298b = null;
        this.f7299c = true;
        this.f7300d = true;
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getLocationInWindow(this.f7302f);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AmbientModeSupport.AmbientController ambientController;
        iqh iqhVar;
        int i;
        if (!this.f7299c) {
            return true;
        }
        if (!this.f7300d || (ambientController = this.f7301e) == null) {
            GestureDetector gestureDetector = this.f7297a;
            if (gestureDetector != null) {
                gestureDetector.onTouchEvent(motionEvent);
            }
            View.OnTouchListener onTouchListener = this.f7298b;
            if (onTouchListener != null) {
                onTouchListener.onTouch(this, motionEvent);
            }
            return true;
        }
        Object obj = ambientController.f1702a;
        switch (motionEvent.getActionMasked()) {
            case 0:
                iqh iqhVar2 = (iqh) obj;
                iqhVar2.f31774e.mo3421a(iqhVar2.m11602a(motionEvent));
                break;
            case 1:
                iqh iqhVar3 = (iqh) obj;
                iqhVar3.m11603b().mo3422b();
                iqhVar3.f31774e.mo3422b();
                iqhVar3.f31783n = 0.0f;
                iqhVar3.f31782m = 0.0f;
                iqhVar3.f31786q = 1;
                iqhVar3.f31780k = false;
                iqhVar3.f31781l = false;
                iqhVar3.f31784o = 0;
                break;
            case 3:
                iqh iqhVar4 = (iqh) obj;
                iqhVar4.m11603b().mo3423c();
                (iqhVar4.f31781l ? iqhVar4.f31774e : ipz.f31764A).mo3423c();
                iqhVar4.f31784o = 0;
                break;
            case 5:
                iqhVar = (iqh) obj;
                i = iqhVar.f31784o + 1;
                iqhVar.f31784o = i;
                break;
            case 6:
                iqhVar = (iqh) obj;
                i = iqhVar.f31784o - 1;
                iqhVar.f31784o = i;
                break;
        }
        iqh iqhVar5 = (iqh) obj;
        if (iqhVar5.f31780k) {
            iqhVar5.f31773d.onTouchEvent(motionEvent);
        } else if (iqhVar5.f31786q != 1 || iqhVar5.f31781l) {
            iqhVar5.f31772c.onTouchEvent(motionEvent);
        } else {
            iqhVar5.f31773d.onTouchEvent(motionEvent);
            iqhVar5.f31772c.onTouchEvent(motionEvent);
        }
        return true;
    }
}
