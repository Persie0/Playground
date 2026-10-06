package com.google.android.apps.camera.optionsbar.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.fjv;
import p000.gfn;
import p000.gzl;
import p000.hzj;
import p000.ikw;
import p000.ilk;
import p000.jvh;
import p000.jzn;
import p021j$.util.DesugarArrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class LinearMinibarImpl extends LinearLayoutCompat implements gfn {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f6821a = 0;

    /* JADX INFO: renamed from: b */
    private static final int[] f6822b = {C0100R.id.minibar_item_ext1, C0100R.id.minibar_item_ext2, C0100R.id.minibar_item_ext3, C0100R.id.minibar_item_ext4};

    public LinearMinibarImpl(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: o */
    private final View m4212o() {
        return findViewById(C0100R.id.minibar_item_chevron);
    }

    /* JADX INFO: renamed from: u */
    private final View m4213u() {
        return findViewById(C0100R.id.minibar_item_face_light);
    }

    /* JADX INFO: renamed from: v */
    private final View m4214v() {
        return findViewById(C0100R.id.minibar_item_face_strong);
    }

    /* JADX INFO: renamed from: w */
    private final View m4215w() {
        return findViewById(C0100R.id.minibar_item_motion_on_always);
    }

    /* JADX INFO: renamed from: x */
    private final View m4216x() {
        return findViewById(C0100R.id.minibar_item_motion_on_auto);
    }

    /* JADX INFO: renamed from: y */
    private final ImageView m4217y() {
        return (ImageView) findViewById(C0100R.id.minibar_item_gear);
    }

    @Override // p000.gfn
    /* JADX INFO: renamed from: a */
    public final void mo4218a() {
        m4212o().setVisibility(8);
        m4217y().setVisibility(8);
    }

    @Override // p000.gfn
    /* JADX INFO: renamed from: b */
    public final void mo4219b(ilk ilkVar, hzj hzjVar) {
        if (hzjVar.equals(hzj.f30014d)) {
            ilkVar = ilkVar.m11429d();
        }
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != m4212o()) {
                jvh.m13578z(childAt, ilkVar);
            }
        }
    }

    @Override // p000.gfn
    /* JADX INFO: renamed from: c */
    public final void mo4220c() {
        m4212o().animate().rotationX(0.0f).setDuration(250L).start();
        m4212o().setContentDescription(getResources().getString(C0100R.string.options_menu_button_desc));
    }

    @Override // p000.gfn
    /* JADX INFO: renamed from: d */
    public final void mo4221d() {
        m4212o().animate().rotationX(180.0f).setDuration(250L).start();
        m4212o().setContentDescription(getResources().getString(C0100R.string.options_menu_close_desc));
    }

    @Override // p000.gfn
    /* JADX INFO: renamed from: e */
    public final void mo4222e(int i, boolean z, int i2, String str) {
        ImageView imageView = (ImageView) findViewById(f6822b[i]);
        if (!z) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setImageResource(i2);
        imageView.setContentDescription(str);
        imageView.setVisibility(0);
    }

    @Override // p000.gfn
    /* JADX INFO: renamed from: f */
    public final void mo4223f(gzl gzlVar) {
        ikw ikwVar = ikw.UNINITIALIZED;
        gzl gzlVar2 = gzl.OFF;
        switch (gzlVar) {
            case OFF:
                m4214v().setVisibility(8);
                m4213u().setVisibility(8);
                break;
            case ON_LIGHT:
                m4214v().setVisibility(8);
                m4213u().setVisibility(0);
                break;
            default:
                m4214v().setVisibility(0);
                m4213u().setVisibility(8);
                break;
        }
    }

    @Override // p000.gfn
    /* JADX INFO: renamed from: g */
    public final void mo4224g(ikw ikwVar) {
        ikw ikwVar2 = ikw.UNINITIALIZED;
        gzl gzlVar = gzl.OFF;
        switch (ikwVar.ordinal()) {
            case 1:
            case 7:
                m4217y().setImageResource(C0100R.drawable.ic_default_cam_settings_24);
                break;
            case 2:
            case 5:
            case 8:
            case 9:
            case 10:
            default:
                m4217y().setImageResource(C0100R.drawable.quantum_gm_ic_settings_white_24);
                break;
            case 3:
                m4217y().setImageResource(C0100R.drawable.ic_pano_settings_24);
                break;
            case 4:
                m4217y().setImageResource(C0100R.drawable.ic_sphere_settings_24);
                break;
            case 6:
                m4217y().setImageResource(C0100R.drawable.ic_portrait_settings_24);
                break;
            case 11:
                m4217y().setImageResource(C0100R.drawable.ic_mm_settings_24);
                break;
            case 12:
                m4217y().setImageResource(C0100R.drawable.ic_ns_settings_24);
                break;
        }
    }

    @Override // p000.gfn
    /* JADX INFO: renamed from: h */
    public final void mo4225h(boolean z) {
        m4217y().setVisibility(true != z ? 8 : 0);
    }

    @Override // p000.gfn
    /* JADX INFO: renamed from: i */
    public final void mo4226i() {
        m4212o().setVisibility(0);
    }

    @Override // p000.gfn
    /* JADX INFO: renamed from: j */
    public final void mo4227j(boolean z) {
        if (z) {
            m4216x().setVisibility(0);
            m4215w().setVisibility(8);
        } else {
            m4215w().setVisibility(0);
            m4216x().setVisibility(8);
        }
    }

    @Override // p000.gfn
    /* JADX INFO: renamed from: k */
    public final void mo4228k() {
        m4215w().setVisibility(8);
        m4216x().setVisibility(8);
    }

    @Override // p000.gfn
    /* JADX INFO: renamed from: l */
    public final boolean mo4229l() {
        return DesugarArrays.stream(new View[]{m4213u(), m4214v(), m4215w(), m4216x()}).noneMatch(fjv.f22315i);
    }

    @Override // p000.gfn
    /* JADX INFO: renamed from: m */
    public final boolean mo4230m() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() == 0 && !childAt.equals(m4212o())) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.gfn
    /* JADX INFO: renamed from: n */
    public final void mo4231n() {
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        setBackgroundTintList(ColorStateList.valueOf(jzn.m13802E(this)));
    }

    public LinearMinibarImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LinearMinibarImpl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
