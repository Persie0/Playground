package p000;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dqc implements gff {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f12288a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f12289b;

    public /* synthetic */ dqc(czz czzVar, int i) {
        this.f12289b = i;
        this.f12288a = czzVar;
    }

    public /* synthetic */ dqc(dqk dqkVar, int i) {
        this.f12289b = i;
        this.f12288a = dqkVar;
    }

    public /* synthetic */ dqc(fls flsVar, int i) {
        this.f12289b = i;
        this.f12288a = flsVar;
    }

    public /* synthetic */ dqc(hjd hjdVar, int i) {
        this.f12289b = i;
        this.f12288a = hjdVar;
    }

    public /* synthetic */ dqc(mrm mrmVar, int i) {
        this.f12289b = i;
        this.f12288a = mrmVar;
    }

    public /* synthetic */ dqc(ohb ohbVar, int i) {
        this.f12289b = i;
        this.f12288a = ohbVar;
    }

    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.Object, ohb] */
    @Override // p000.gff
    /* JADX INFO: renamed from: a */
    public final void mo6580a(gfc gfcVar, boolean z) {
        switch (this.f12289b) {
            case 0:
                ((dqk) this.f12288a).m6594a(gfcVar);
                break;
            case 1:
                ((czz) this.f12288a).f10196a.m5763a();
                break;
            case 2:
                mrm mrmVar = (mrm) this.f12288a;
                if (mrmVar.mo16813g()) {
                    ((fdu) mrmVar.mo16809c()).mo8270a();
                }
                break;
            case 3:
                Object obj = this.f12288a;
                if (!z) {
                    jvd.m13538a();
                    fls flsVar = (fls) obj;
                    if (flsVar.f22520c == null) {
                        FrameLayout frameLayout = new FrameLayout(flsVar.f22519b);
                        View.inflate(flsVar.f22519b, C0100R.layout.motionphoto_disabled_sheet, frameLayout);
                        ((Button) frameLayout.findViewById(C0100R.id.what_is_button)).setOnClickListener(new flr(flsVar, 1));
                        flsVar.f22520c = frameLayout;
                    }
                    flsVar.f22518a.m10713l(7, C0100R.string.motion_photos_not_available_title, flsVar.f22520c);
                } else {
                    ((fls) obj).m8557a();
                }
                break;
            case 4:
                Object obj2 = this.f12288a;
                if (!z) {
                    hiz hizVar = ((hjd) obj2).f28009b;
                    jvd.m13538a();
                    hst hstVar = hizVar.f27966a;
                    View viewInflate = View.inflate(hizVar.f27967b, C0100R.layout.speech_btmsheet_disabled_content, null);
                    viewInflate.findViewById(C0100R.id.learn_more_about_speech_enhance).setOnClickListener(new flr(hizVar, 7));
                    hstVar.m10714m(10, C0100R.string.speech_btmsheet_not_available_title, viewInflate, null);
                } else {
                    ((hjd) obj2).f28009b.m10362a();
                }
                break;
            default:
                ?? r6 = this.f12288a;
                if (z && ((mrm) r6.get()).mo16813g()) {
                    ((ihk) ((mrm) r6.get()).mo16809c()).m11343k();
                    break;
                }
                break;
        }
    }
}
