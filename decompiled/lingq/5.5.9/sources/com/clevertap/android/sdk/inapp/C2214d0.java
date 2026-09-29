package com.clevertap.android.sdk.inapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.util.TypedValue;
import android.webkit.WebView;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.d0 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
public final class C2214d0 extends WebView {

    /* JADX INFO: renamed from: a */
    public final Point f11190a;

    /* JADX INFO: renamed from: b */
    public final int f11191b;

    /* JADX INFO: renamed from: c */
    public final int f11192c;

    /* JADX INFO: renamed from: d */
    public final int f11193d;

    /* JADX INFO: renamed from: e */
    public final int f11194e;

    @SuppressLint({"ResourceType"})
    public C2214d0(Context context, int i10, int i11, int i12, int i13) {
        super(context);
        this.f11190a = new Point();
        this.f11193d = i10;
        this.f11191b = i11;
        this.f11194e = i12;
        this.f11192c = i13;
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setHorizontalFadingEdgeEnabled(false);
        setVerticalFadingEdgeEnabled(false);
        setOverScrollMode(2);
        setBackgroundColor(0);
        setId(188293);
    }

    /* JADX INFO: renamed from: a */
    public final void m6526a() {
        Point point = this.f11190a;
        int i10 = this.f11193d;
        if (i10 != 0) {
            point.x = (int) TypedValue.applyDimension(1, i10, getResources().getDisplayMetrics());
        } else {
            point.x = (int) ((getResources().getDisplayMetrics().widthPixels * this.f11194e) / 100.0f);
        }
        int i11 = this.f11191b;
        if (i11 != 0) {
            point.y = (int) TypedValue.applyDimension(1, i11, getResources().getDisplayMetrics());
        } else {
            point.y = (int) ((getResources().getDisplayMetrics().heightPixels * this.f11192c) / 100.0f);
        }
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        m6526a();
        Point point = this.f11190a;
        setMeasuredDimension(point.x, point.y);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return super.performClick();
    }
}
