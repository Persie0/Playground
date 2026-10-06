package com.google.android.apps.camera.p014ui.eduimageview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.fns;
import p000.hxt;
import p000.jfo;
import p000.mhs;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class EduImageView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f7014a;

    /* JADX INFO: renamed from: b */
    public TextView f7015b;

    public EduImageView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public static void m4359d(Context context) {
        Resources resources = context.getResources();
        mhs mhsVar = new mhs(context, C0100R.style.Theme_Camera_MaterialAlertDialog);
        mhsVar.m16392t(resources.getString(C0100R.string.internet_required));
        mhsVar.m16385m(resources.getString(C0100R.string.connect_internet_for_examples));
        mhsVar.m16390r(resources.getString(C0100R.string.dialog_ok_cased), fns.f22803a);
        mhsVar.m7257c();
    }

    /* JADX INFO: renamed from: a */
    public final void m4360a() {
        this.f7014a.setBackgroundColor(0);
    }

    /* JADX INFO: renamed from: b */
    public final void m4361b(Drawable drawable, String str) {
        this.f7014a.setImageDrawable(drawable);
        this.f7014a.setContentDescription(str);
        this.f7014a.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    /* JADX INFO: renamed from: c */
    public final void m4362c(String str, String str2) {
        m4363e(str, str2, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m4363e(String str, String str2, jfo jfoVar) {
        new hxt(this, getContext(), str, str2, jfoVar, null).m10839b(false);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(C0100R.layout.eduimageview, this);
        this.f7014a = (ImageView) findViewById(C0100R.id.imageview);
        this.f7015b = (TextView) findViewById(C0100R.id.textview_offline);
    }

    public EduImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public EduImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
