package p000;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.views.ToggleUi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hyo implements hze {

    /* JADX INFO: renamed from: a */
    public ToggleUi f29943a;

    /* JADX INFO: renamed from: a */
    public final void m10874a() {
        ToggleUi toggleUi = this.f29943a;
        if (toggleUi != null) {
            toggleUi.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10875b() {
        ToggleUi toggleUi = this.f29943a;
        if (toggleUi != null) {
            toggleUi.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m10876c(ViewStub viewStub) {
        if (this.f29943a == null) {
            this.f29943a = (ToggleUi) viewStub.inflate();
        }
        this.f29943a.m4484e(C0100R.drawable.help_button_background);
        Drawable drawable = this.f29943a.getResources().getDrawable(C0100R.drawable.quantum_gm_ic_help_outline_vd_theme_24, null);
        if (drawable != null) {
            drawable.mutate().setTint(jzn.m13801D(this.f29943a));
        }
        this.f29943a.m4485f(drawable);
        m10874a();
    }

    @Override // p000.hze
    public final /* synthetic */ void onLayoutUpdated(hzj hzjVar, ilk ilkVar) {
    }

    @Override // p000.hze
    public final void onLayoutUpdated(ilk ilkVar) {
        ToggleUi toggleUi = this.f29943a;
        if (toggleUi != null) {
            if (((View) toggleUi.getParent()).getRotation() == 0.0f) {
                jvh.m13577y(this.f29943a, ilkVar);
            }
            this.f29943a.m4480a(ilkVar);
        }
    }
}
