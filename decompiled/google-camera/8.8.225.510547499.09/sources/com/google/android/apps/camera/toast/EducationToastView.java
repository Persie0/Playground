package com.google.android.apps.camera.toast;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.Space;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.cln;
import p000.hde;
import p000.hrg;
import p000.ilk;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class EducationToastView extends ToastView {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f6973c = 0;

    /* JADX INFO: renamed from: a */
    public Runnable f6974a;

    /* JADX INFO: renamed from: b */
    public Runnable f6975b;

    /* JADX INFO: renamed from: o */
    private PopupWindow f6976o;

    /* JADX INFO: renamed from: p */
    private ilk f6977p;

    /* JADX INFO: renamed from: q */
    private ImageView f6978q;

    public EducationToastView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6974a = hde.f27299a;
        this.f6975b = hde.f27300b;
        this.f6977p = ilk.PORTRAIT;
    }

    /* JADX INFO: renamed from: a */
    public static EducationToastView m4307a(hrg hrgVar) {
        ViewGroup viewGroup = hrgVar.f29275a;
        View.inflate(viewGroup.getContext(), C0100R.layout.education_toast_view_layout, viewGroup);
        EducationToastView educationToastView = (EducationToastView) viewGroup.findViewById(C0100R.id.edu_toast_layout);
        educationToastView.mo4309b(hrgVar);
        return educationToastView;
    }

    /* JADX INFO: renamed from: i */
    private final void m4308i(ImageView imageView) {
        ilk ilkVar = ilk.PORTRAIT;
        switch (this.f6977p.ordinal()) {
            case 1:
                imageView.setImageResource(C0100R.drawable.ic_swipe_right_option);
                break;
            case 2:
                imageView.setImageResource(C0100R.drawable.ic_swipe_left_option);
                break;
            default:
                imageView.setImageResource(C0100R.drawable.ic_swipe_down_option);
                break;
        }
    }

    @Override // com.google.android.apps.camera.toast.ToastView
    /* JADX INFO: renamed from: b */
    public final void mo4309b(hrg hrgVar) {
        m4308i(this.f6978q);
        this.f6978q.setVisibility(0);
        ((Space) findViewById(C0100R.id.edu_toast_icon_space)).setVisibility(8);
        m4314g(hrgVar);
        this.f6976o = m4312e();
        this.f6974a = hrgVar.f29277c;
        this.f6975b = hrgVar.f29278d;
    }

    @Override // com.google.android.apps.camera.toast.ToastView
    /* JADX INFO: renamed from: c */
    public final void mo4310c() {
        this.f6976o.setTouchInterceptor(new cln(this, 15));
    }

    @Override // com.google.android.apps.camera.toast.ToastView
    /* JADX INFO: renamed from: d */
    public final void mo4311d(ilk ilkVar) {
        this.f6977p = ilkVar;
        ImageView imageView = this.f6978q;
        if (imageView != null) {
            m4308i(imageView);
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.f6978q = (ImageView) findViewById(C0100R.id.edu_toast_icon);
    }
}
