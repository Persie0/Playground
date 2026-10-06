package p000;

import android.app.Activity;
import android.graphics.RectF;
import androidx.work.impl.workers.NHKG.pIeXJQLZLfgIN;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.views.MainActivityLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class hzu {

    /* JADX INFO: renamed from: a */
    private static final nbh f30092a = nbh.m17259h("com/google/android/apps/camera/ui/layout/legacy/CaptureLayoutHelper");

    /* JADX INFO: renamed from: b */
    private final Activity f30093b;

    public hzu(Activity activity) {
        this.f30093b = activity;
    }

    /* JADX INFO: renamed from: a */
    public final RectF m10960a() {
        hzp hzpVar = (hzp) m10961b().f7264n.get();
        if (hzpVar == null) {
            ((nbe) ((nbe) f30092a.m17252c()).mo17276G((char) 4053)).mo17290o(pIeXJQLZLfgIN.FiJfOEVNVYVQ);
            return new RectF(0.0f, 0.0f, 1.0f, 1.0f);
        }
        hzj hzjVar = hzpVar.f30074a.f30073i;
        RectF rectF = new RectF();
        hzs hzsVar = hzpVar.f30077d;
        if (hzjVar.equals(hzj.PHONE_LAYOUT) || hzjVar.equals(hzj.SIMPLIFIED_LAYOUT)) {
            return new RectF(hzpVar.f30075b.f30041e);
        }
        return hzsVar == null ? rectF : new RectF(hzsVar.mo10909r(hzsVar.f30087h, hzsVar.f30086g));
    }

    /* JADX INFO: renamed from: b */
    public final MainActivityLayout m10961b() {
        return (MainActivityLayout) this.f30093b.findViewById(C0100R.id.activity_root_view);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m10962c() {
        return this.f30093b.isInMultiWindowMode();
    }
}
