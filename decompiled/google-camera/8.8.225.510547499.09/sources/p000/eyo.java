package p000;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.legacy.lightcycle.p012ui.PhotoSphereMessageOverlay;
import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eyo implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ boolean f20997a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ int f20998b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Object f20999c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f21000d;

    public /* synthetic */ eyo(View view, boolean z, int i, int i2) {
        this.f21000d = i2;
        this.f20999c = view;
        this.f20997a = z;
        this.f20998b = i;
    }

    public /* synthetic */ eyo(cee ceeVar, int i, boolean z, int i2) {
        this.f21000d = i2;
        this.f20999c = ceeVar;
        this.f20998b = i;
        this.f20997a = z;
    }

    public eyo(PhotoSphereMessageOverlay photoSphereMessageOverlay, boolean z, int i, int i2) {
        this.f21000d = i2;
        this.f20999c = photoSphereMessageOverlay;
        this.f20997a = z;
        this.f20998b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21000d) {
            case 0:
                TextView textView = (TextView) ((PhotoSphereMessageOverlay) this.f20999c).findViewById(C0100R.id.long_message_overlay);
                if (this.f20997a) {
                    textView.setVisibility(0);
                    switch (this.f20998b) {
                        case 0:
                            textView.setText(C0100R.string.photosphere_calibration_step_one);
                            break;
                        case 1:
                            textView.setText(C0100R.string.photosphere_calibration_step_two);
                            break;
                        case 2:
                            textView.setText(C0100R.string.photosphere_calibration_step_three);
                            break;
                        case 3:
                            textView.setText(C0100R.string.photosphere_calibration_finished);
                            break;
                    }
                } else {
                    textView.setVisibility(4);
                    break;
                }
                break;
            case 1:
                Object obj = this.f20999c;
                int i = this.f20998b;
                boolean z = this.f20997a;
                cee ceeVar = (cee) obj;
                csq csqVar = new csq(ceeVar, 1);
                final DialogInterface.OnClickListener onClickListener = ceeVar.f5419d;
                DialogInterface.OnClickListener onClickListener2 = z ? null : ceeVar.f5420e;
                jvd.m13538a();
                ceeVar.m3548d();
                if (ceeVar.f5418c.get() == 0) {
                    mhs mhsVar = new mhs(ceeVar.f5416a, C0100R.style.Theme_Camera_MaterialAlertDialog);
                    mhsVar.m16392t(ceeVar.f5416a.getString(C0100R.string.camera_permissions_error_title));
                    mhsVar.m16385m(ceeVar.f5416a.getString(i));
                    mhsVar.m16383k(false);
                    mhsVar.m16388p(new DialogInterface.OnKeyListener() { // from class: ced
                        @Override // android.content.DialogInterface.OnKeyListener
                        public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
                            DialogInterface.OnClickListener onClickListener3 = onClickListener;
                            if (i2 != 4) {
                                return false;
                            }
                            onClickListener3.onClick(dialogInterface, -2);
                            return true;
                        }
                    });
                    mhsVar.f13785a.f13174l = csqVar;
                    mhsVar.m16387o(ceeVar.f5416a.getString(C0100R.string.dialog_dismiss), onClickListener);
                    if (onClickListener2 != null) {
                        mhsVar.m16390r(ceeVar.f5416a.getString(C0100R.string.camera_menu_settings_label), onClickListener2);
                    }
                    ceeVar.f5422g = mhsVar.m7257c();
                } else {
                    ceeVar.f5418c.get();
                }
                break;
            default:
                Object obj2 = this.f20999c;
                boolean z2 = this.f20997a;
                int i2 = this.f20998b;
                Duration duration = inw.f31616a;
                View view = (View) obj2;
                view.setClickable(z2);
                view.setVisibility(i2);
                break;
        }
    }
}
