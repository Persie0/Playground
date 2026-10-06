package p000;

import android.content.res.Resources;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.views.MainActivityLayout;
import com.google.android.apps.camera.p014ui.widget.ReviewImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fds {

    /* JADX INFO: renamed from: a */
    public final ReviewImageView f21482a;

    /* JADX INFO: renamed from: b */
    public final ImageView f21483b;

    /* JADX INFO: renamed from: c */
    public boolean f21484c;

    /* JADX INFO: renamed from: d */
    public boolean f21485d;

    /* JADX INFO: renamed from: e */
    public int f21486e;

    /* JADX INFO: renamed from: f */
    public int f21487f;

    /* JADX INFO: renamed from: h */
    private final ggm f21489h;

    /* JADX INFO: renamed from: i */
    private final gye f21490i;

    /* JADX INFO: renamed from: j */
    private final FrameLayout f21491j;

    /* JADX INFO: renamed from: k */
    private final jwn f21492k;

    /* JADX INFO: renamed from: g */
    public int f21488g = 178;

    /* JADX INFO: renamed from: l */
    private final gyi f21493l = new fdr(this);

    public fds(chk chkVar, Resources resources, ggm ggmVar, gye gyeVar, jwn jwnVar) {
        this.f21489h = ggmVar;
        this.f21490i = gyeVar;
        MainActivityLayout mainActivityLayout = ((ciq) chkVar.mo3693g()).f5840f;
        this.f21491j = (FrameLayout) mainActivityLayout.findViewById(C0100R.id.module_layout);
        this.f21482a = new ReviewImageView(mainActivityLayout.getContext());
        ImageView imageView = new ImageView(mainActivityLayout.getContext());
        this.f21483b = imageView;
        this.f21492k = jwnVar;
        imageView.setImageDrawable(resources.getDrawable(C0100R.drawable.review_image_overlay, null));
        imageView.setVisibility(8);
    }

    /* JADX INFO: renamed from: a */
    public final void m8280a() {
        m8282c();
        this.f21491j.removeAllViews();
        this.f21490i.m9973h(this.f21493l);
    }

    /* JADX INFO: renamed from: b */
    public final void m8281b() {
        if (this.f21482a.getParent() == null) {
            this.f21491j.addView(this.f21482a, 0);
        }
        if (this.f21483b.getParent() == null) {
            this.f21491j.addView(this.f21483b, 1);
        }
        this.f21490i.m9973h(this.f21493l);
        this.f21490i.m9966a(this.f21493l);
    }

    /* JADX INFO: renamed from: c */
    public final void m8282c() {
        this.f21485d = false;
        this.f21483b.setVisibility(8);
        this.f21482a.m4503a();
        this.f21484c = false;
    }

    /* JADX INFO: renamed from: d */
    public final void m8283d() {
        this.f21485d = true;
        this.f21486e = this.f21489h.mo9216f().f35503e;
        this.f21487f = ((Integer) this.f21492k.mo3831be()).intValue();
    }

    /* JADX INFO: renamed from: e */
    public final void m8284e(int i) {
        this.f21488g = i;
        this.f21483b.setVisibility(0);
        this.f21483b.setImageAlpha(i);
    }
}
