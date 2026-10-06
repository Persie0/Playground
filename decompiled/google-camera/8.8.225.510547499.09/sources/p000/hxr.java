package p000;

import android.view.View;
import com.google.android.apps.camera.p014ui.eduimageview.EduImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hxr implements caa {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hxt f29836a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f29837b;

    public hxr(hxt hxtVar, int i) {
        this.f29837b = i;
        this.f29836a = hxtVar;
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: l */
    public final void mo3343l(bsv bsvVar) {
        switch (this.f29837b) {
            case 0:
                this.f29836a.f29840b.f7014a.setOnClickListener(new flr(this, 16));
                this.f29836a.m10840c();
                break;
            case 1:
                this.f29836a.f29840b.f7014a.setImportantForAccessibility(2);
                break;
            default:
                this.f29836a.f29840b.f7014a.setOnClickListener(new View.OnClickListener() { // from class: hxs
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        EduImageView.m4359d(view.getContext());
                    }
                });
                this.f29836a.m10840c();
                break;
        }
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void mo3344m(Object obj) {
        switch (this.f29837b) {
            case 0:
                this.f29836a.m10838a();
                break;
            case 1:
                this.f29836a.m10838a();
                break;
            default:
                this.f29836a.m10838a();
                break;
        }
    }
}
