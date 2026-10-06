package com.google.android.apps.camera.p014ui.popupmenu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.idq;
import p000.idr;
import p000.ilk;
import p000.jvh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class PopupMenuView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final LinearLayout f7093a;

    /* JADX INFO: renamed from: b */
    public final ImageButton f7094b;

    /* JADX INFO: renamed from: c */
    public View f7095c;

    /* JADX INFO: renamed from: d */
    private final Context f7096d;

    /* JADX INFO: renamed from: e */
    private ilk f7097e;

    /* JADX INFO: renamed from: f */
    private final LinearLayout f7098f;

    /* JADX INFO: renamed from: g */
    private final TextView f7099g;

    /* JADX INFO: renamed from: h */
    private int f7100h;

    /* JADX INFO: renamed from: i */
    private int f7101i;

    /* JADX INFO: renamed from: j */
    private idq f7102j;

    public PopupMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7097e = ilk.PORTRAIT;
        this.f7096d = context;
        super.onFinishInflate();
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(C0100R.layout.menu_layout, this);
        this.f7094b = (ImageButton) findViewById(C0100R.id.menu_help_button);
        this.f7093a = (LinearLayout) findViewById(C0100R.id.menu_inner_layout);
        this.f7098f = (LinearLayout) findViewById(C0100R.id.menu_background);
        this.f7099g = (TextView) findViewById(C0100R.id.menu_header_text);
    }

    /* JADX INFO: renamed from: a */
    public final void m4405a(ilk ilkVar) {
        this.f7097e = ilkVar;
        jvh.m13578z(this.f7093a, ilkVar);
        if (this.f7100h == 0 || this.f7101i == 0) {
            this.f7100h = this.f7098f.getWidth();
            int height = this.f7098f.getHeight();
            this.f7101i = height;
            if (this.f7100h == 0 || height == 0) {
                return;
            }
        }
        if (!ilkVar.equals(ilk.LANDSCAPE) && !ilkVar.equals(ilk.REVERSE_LANDSCAPE)) {
            ViewGroup.LayoutParams layoutParams = this.f7098f.getLayoutParams();
            layoutParams.height = this.f7101i;
            layoutParams.width = this.f7100h;
            this.f7098f.setLayoutParams(layoutParams);
            ViewGroup.LayoutParams layoutParams2 = this.f7093a.getLayoutParams();
            layoutParams2.height = this.f7101i;
            layoutParams2.width = this.f7100h;
            this.f7093a.setTranslationY(0.0f);
            this.f7093a.setTranslationX(0.0f);
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = this.f7098f.getLayoutParams();
        int iMin = Math.min(this.f7101i, getResources().getDisplayMetrics().heightPixels - ((ViewGroup.MarginLayoutParams) ((ViewGroup) this.f7098f.getParent()).getLayoutParams()).rightMargin);
        layoutParams3.height = this.f7100h;
        layoutParams3.width = iMin;
        this.f7098f.setLayoutParams(layoutParams3);
        ViewGroup.LayoutParams layoutParams4 = this.f7093a.getLayoutParams();
        layoutParams4.height = iMin;
        layoutParams4.width = this.f7100h;
        LinearLayout linearLayout = this.f7093a;
        linearLayout.setTranslationY((linearLayout.getWidth() - this.f7093a.getHeight()) / 2);
        LinearLayout linearLayout2 = this.f7093a;
        linearLayout2.setTranslationX((linearLayout2.getHeight() - this.f7093a.getWidth()) / 2);
    }

    /* JADX INFO: renamed from: b */
    public final void m4406b() {
        setVisibility(8);
    }

    /* JADX INFO: renamed from: c */
    public final void m4407c() {
        setVisibility(0);
        m4405a(this.f7097e);
        Context context = this.f7096d;
        idq idqVar = this.f7102j;
        idqVar.getClass();
        announceForAccessibility(context.getString(C0100R.string.menu_open_announce, this.f7099g.getText(), idqVar.m11129e().f30531b));
    }

    /* JADX INFO: renamed from: d */
    public final void m4408d(int i, idq idqVar) {
        ListView listView = (ListView) findViewById(C0100R.id.option_list);
        findViewById(C0100R.id.arrow_up);
        View viewFindViewById = findViewById(C0100R.id.arrow_down);
        this.f7102j = idqVar;
        viewFindViewById.setVisibility(0);
        this.f7095c = viewFindViewById;
        this.f7099g.setText(i);
        ImageButton imageButton = this.f7094b;
        Context context = this.f7096d;
        imageButton.setContentDescription(context.getString(C0100R.string.menu_help_button_announce, context.getString(i)));
        listView.setAdapter((ListAdapter) idqVar);
        listView.setOnItemClickListener(new idr(this, idqVar, 0));
        m4406b();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m4405a(this.f7097e);
        }
    }
}
