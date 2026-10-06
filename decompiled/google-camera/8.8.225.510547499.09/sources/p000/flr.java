package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.compositevideoview.CompositeVideoView;
import com.google.android.apps.camera.toast.ToastView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class flr implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f22516a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f22517b;

    public /* synthetic */ flr(Context context, int i) {
        this.f22517b = i;
        this.f22516a = context;
    }

    public /* synthetic */ flr(AmbientModeSupport.AmbientController ambientController, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f22517b = i;
        this.f22516a = ambientController;
    }

    public /* synthetic */ flr(chk chkVar, int i) {
        this.f22517b = i;
        this.f22516a = chkVar;
    }

    public /* synthetic */ flr(ToastView toastView, int i) {
        this.f22517b = i;
        this.f22516a = toastView;
    }

    public /* synthetic */ flr(CompositeVideoView compositeVideoView, int i) {
        this.f22517b = i;
        this.f22516a = compositeVideoView;
    }

    public /* synthetic */ flr(fls flsVar, int i) {
        this.f22517b = i;
        this.f22516a = flsVar;
    }

    public /* synthetic */ flr(geh gehVar, int i) {
        this.f22517b = i;
        this.f22516a = gehVar;
    }

    public /* synthetic */ flr(geo geoVar, int i) {
        this.f22517b = i;
        this.f22516a = geoVar;
    }

    public /* synthetic */ flr(gey geyVar, int i) {
        this.f22517b = i;
        this.f22516a = geyVar;
    }

    public /* synthetic */ flr(gfa gfaVar, int i) {
        this.f22517b = i;
        this.f22516a = gfaVar;
    }

    public /* synthetic */ flr(hiz hizVar, int i) {
        this.f22517b = i;
        this.f22516a = hizVar;
    }

    public /* synthetic */ flr(hrl hrlVar, int i) {
        this.f22517b = i;
        this.f22516a = hrlVar;
    }

    public /* synthetic */ flr(hxr hxrVar, int i) {
        this.f22517b = i;
        this.f22516a = hxrVar;
    }

    public /* synthetic */ flr(iak iakVar, int i) {
        this.f22517b = i;
        this.f22516a = iakVar;
    }

    /* JADX WARN: Type inference failed for: r4v18, types: [gey, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v35, types: [chk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v36, types: [gfa, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f22517b) {
            case 0:
                fls flsVar = (fls) this.f22516a;
                flsVar.f22519b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(flsVar.f22519b.getString(C0100R.string.motion_photos_support_url))));
                break;
            case 1:
                ((fls) this.f22516a).m8557a();
                break;
            case 2:
                geh gehVar = (geh) this.f22516a;
                if (!((gfa) gehVar.f24377a.get()).mo9108G()) {
                    ((gfa) gehVar.f24377a.get()).mo9112L(1);
                } else {
                    ((gfa) gehVar.f24377a.get()).mo9113M();
                }
                break;
            case 3:
                geo geoVar = (geo) this.f22516a;
                geoVar.f24403g.mo3801a();
                geoVar.f24412p.f24419a = true;
                break;
            case 4:
                this.f22516a.mo3800a();
                break;
            case 5:
                ((AmbientModeSupport.AmbientController) this.f22516a).m1660j();
                break;
            case 6:
                ((hgk) ((hfu) ((AmbientModeSupport.AmbientController) this.f22516a).f1702a).f27587c.get()).mo10202k();
                break;
            case 7:
                ((hiz) this.f22516a).m10362a();
                break;
            case 8:
                ToastView toastView = (ToastView) this.f22516a;
                toastView.f6988l.run();
                toastView.f6986j.run();
                toastView.f6987k.run();
                break;
            case 9:
                ((hrl) this.f22516a).m10655a();
                break;
            case 10:
                this.f22516a.mo3703q();
                break;
            case 11:
                this.f22516a.mo9112L(10);
                break;
            case 12:
                ((fls) this.f22516a).m8557a();
                break;
            case 13:
                htq htqVar = ((CompositeVideoView) this.f22516a).f6998b;
                if (htqVar != null) {
                    htqVar.mo5750a();
                }
                break;
            case 14:
                htq htqVar2 = ((CompositeVideoView) this.f22516a).f6998b;
                if (htqVar2 != null) {
                    htqVar2.mo5752c();
                }
                break;
            case 15:
                CompositeVideoView compositeVideoView = (CompositeVideoView) this.f22516a;
                boolean zIsPlaying = compositeVideoView.f6997a.isPlaying();
                htq htqVar3 = compositeVideoView.f6998b;
                if (htqVar3 != null && zIsPlaying) {
                    htqVar3.mo5751b();
                    break;
                }
                break;
            case 16:
                ((hxr) this.f22516a).f29836a.m10839b(true);
                break;
            case 17:
                ((Context) this.f22516a).startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://support.google.com/photos/answer/10694388")));
                break;
            case 18:
                ((Context) this.f22516a).startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://support.google.com/photos/answer/10694388")));
                break;
            case 19:
                ((iak) this.f22516a).f30164q.m15912d();
                break;
            default:
                ((iak) this.f22516a).f30164q.m15912d();
                break;
        }
    }
}
