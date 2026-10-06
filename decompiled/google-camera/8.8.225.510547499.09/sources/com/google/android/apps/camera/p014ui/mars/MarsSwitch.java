package com.google.android.apps.camera.p014ui.mars;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.popupmenu.PopupMenuView;
import p000.ilk;
import p000.jvh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class MarsSwitch extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final PopupMenuView f7048a;

    /* JADX INFO: renamed from: b */
    public View f7049b;

    /* JADX INFO: renamed from: c */
    private ilk f7050c;

    public MarsSwitch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7050c = ilk.PORTRAIT;
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(C0100R.layout.mars_menu, this);
        this.f7048a = (PopupMenuView) findViewById(C0100R.id.mars_menu_view);
    }

    /* JADX INFO: renamed from: a */
    public final void m4373a() {
        View view = this.f7049b;
        if (view == null) {
            return;
        }
        float fMin = Math.min(view.getWidth() / 2.0f, 200.0f);
        PopupMenuView popupMenuView = this.f7048a;
        View viewFindViewById = popupMenuView.f7095c;
        if (viewFindViewById == null) {
            viewFindViewById = popupMenuView.findViewById(C0100R.id.arrow_down);
        }
        viewFindViewById.setTranslationX(-fMin);
        PopupMenuView popupMenuView2 = this.f7048a;
        View view2 = this.f7049b;
        view2.getClass();
        popupMenuView2.setTranslationY(-view2.getHeight());
    }

    /* JADX INFO: renamed from: b */
    public final void m4374b(ilk ilkVar) {
        this.f7050c = ilkVar;
        jvh.m13577y(this, ilkVar);
        this.f7048a.m4405a(ilkVar);
        m4373a();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m4374b(this.f7050c);
        }
    }
}
