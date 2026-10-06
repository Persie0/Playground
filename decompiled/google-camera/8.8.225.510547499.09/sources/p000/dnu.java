package p000;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dnu implements ciw {

    /* JADX INFO: renamed from: a */
    public final Object f12119a;

    /* JADX INFO: renamed from: b */
    private final jvd f12120b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f12121c;

    /* JADX INFO: renamed from: d */
    private final Object f12122d;

    /* JADX INFO: renamed from: e */
    private final Object f12123e;

    /* JADX INFO: renamed from: f */
    private final Object f12124f;

    public dnu(cwd cwdVar, dhv dhvVar, Context context, cej cejVar, jvd jvdVar, int i, byte[] bArr, byte[] bArr2) {
        this.f12121c = i;
        this.f12124f = cwdVar.m5648F();
        this.f12122d = dhvVar;
        this.f12123e = context;
        this.f12119a = cejVar;
        this.f12120b = jvdVar;
    }

    public dnu(dny dnyVar, cdu cduVar, fan fanVar, dnw dnwVar, jvd jvdVar, int i) {
        this.f12121c = i;
        this.f12119a = dnyVar;
        this.f12124f = cduVar;
        this.f12122d = fanVar;
        this.f12123e = dnwVar;
        this.f12120b = jvdVar;
    }

    @Override // p000.ciw
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String mo3539c() {
        switch (this.f12121c) {
            case 0:
                break;
        }
        return dez.m6039i(this);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [fbp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [doe, java.lang.Object] */
    @Override // p000.ciw
    /* JADX INFO: renamed from: bd */
    public final nps mo3538bd() {
        switch (this.f12121c) {
            case 0:
                fdh.m8265e(this.f12120b, (fba) this.f12122d, this.f12123e);
                jvb jvbVarM3529i = ((cdu) this.f12124f).m3529i();
                Object obj = this.f12119a;
                ?? r3 = this.f12123e;
                dny dnyVar = (dny) obj;
                dnyVar.f12144a.add(r3);
                jvbVarM3529i.m13537d(new cic(dnyVar, (doe) r3, 16));
                return kxk.m14965K(true);
            default:
                if (!this.f12122d.mo6184l(dib.f11359cm)) {
                    return kxk.m14965K(true);
                }
                boolean cameraDisabled = ((DevicePolicyManager) this.f12124f).getCameraDisabled(null);
                if (cameraDisabled) {
                    mhs mhsVar = new mhs((Context) this.f12123e, C0100R.style.Theme_Camera_MaterialAlertDialog);
                    TextView textView = new TextView((Context) this.f12123e);
                    int dimensionPixelSize = ((Context) this.f12123e).getResources().getDimensionPixelSize(C0100R.dimen.dialog_horizontal_padding);
                    int dimensionPixelSize2 = ((Context) this.f12123e).getResources().getDimensionPixelSize(C0100R.dimen.dialog_vertical_padding);
                    textView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
                    textView.setText(C0100R.string.camera_disabled_body);
                    mhsVar.m16391s(C0100R.string.camera_disabled_title);
                    mhsVar.m16393u(textView);
                    mhsVar.m16383k(false);
                    mhsVar.m16389q(C0100R.string.camera_disabled_close_app, new cdo(this, 0, (byte[]) null));
                    this.f12120b.execute(new baa(mhsVar, 17));
                }
                return kxk.m14965K(Boolean.valueOf(!cameraDisabled));
        }
    }
}
