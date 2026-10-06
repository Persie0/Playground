package p000;

import android.view.View;
import com.google.android.apps.camera.smarts.SmartsChipView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iae implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f30133a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f30134b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f30135c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f30136d;

    public /* synthetic */ iae(SmartsChipView smartsChipView, heo heoVar, Runnable runnable, int i) {
        this.f30136d = i;
        this.f30134b = smartsChipView;
        this.f30133a = heoVar;
        this.f30135c = runnable;
    }

    public /* synthetic */ iae(lrd lrdVar, gvo gvoVar, oju ojuVar, int i, byte[] bArr) {
        this.f30136d = i;
        this.f30133a = lrdVar;
        this.f30134b = gvoVar;
        this.f30135c = ojuVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [gvo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Runnable] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f30136d) {
            case 0:
                Object obj = this.f30133a;
                ?? r0 = this.f30134b;
                ?? r1 = this.f30135c;
                if (!((lrd) obj).f39056a) {
                    ((dvv) r1.get()).mo6794a();
                } else {
                    r0.mo9797e();
                }
                break;
            default:
                Object obj2 = this.f30134b;
                Object obj3 = this.f30133a;
                ?? r2 = this.f30135c;
                hdl hdlVar = (hdl) obj3;
                hdlVar.f27354d.mo8160ae(5, hdlVar.f27351a.f27483a);
                r2.run();
                SmartsChipView smartsChipView = (SmartsChipView) obj2;
                if (smartsChipView.f6931e) {
                    smartsChipView.m4290b();
                }
                break;
        }
    }
}
