package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaFormat;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.libraries.lens.lenslite.api.arLu.YmzeHXaMYOLk;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class djq implements nph {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f11793a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f11794b;

    public djq(cqj cqjVar, int i) {
        this.f11794b = i;
        this.f11793a = cqjVar;
    }

    public djq(djr djrVar, int i) {
        this.f11794b = i;
        this.f11793a = djrVar;
    }

    public djq(evf evfVar, int i) {
        this.f11794b = i;
        this.f11793a = evfVar;
    }

    public djq(fcg fcgVar, int i) {
        this.f11794b = i;
        this.f11793a = fcgVar;
    }

    public djq(fhw fhwVar, int i) {
        this.f11794b = i;
        this.f11793a = fhwVar;
    }

    public djq(fyf fyfVar, int i) {
        this.f11794b = i;
        this.f11793a = fyfVar;
    }

    public djq(gwy gwyVar, int i) {
        this.f11794b = i;
        this.f11793a = gwyVar;
    }

    public djq(gxr gxrVar, int i) {
        this.f11794b = i;
        this.f11793a = gxrVar;
    }

    public djq(gxu gxuVar, int i) {
        this.f11794b = i;
        this.f11793a = gxuVar;
    }

    public djq(hmc hmcVar, int i) {
        this.f11794b = i;
        this.f11793a = hmcVar;
    }

    public djq(hmk hmkVar, int i) {
        this.f11794b = i;
        this.f11793a = hmkVar;
    }

    public djq(iak iakVar, int i) {
        this.f11794b = i;
        this.f11793a = iakVar;
    }

    public djq(jvb jvbVar, int i) {
        this.f11794b = i;
        this.f11793a = jvbVar;
    }

    public djq(jxj jxjVar, int i) {
        this.f11794b = i;
        this.f11793a = jxjVar;
    }

    @Override // p000.nph
    /* JADX INFO: renamed from: a */
    public final void mo3810a(Throwable th) {
        switch (this.f11794b) {
            case 0:
                ((nbe) ((nbe) ((nbe) djr.f11795a.m17252c()).mo17283h(th)).mo17276G((char) 894)).mo17290o("CameraFilmstripDataAdapter task failed.");
                break;
            case 1:
                break;
            case 2:
                ((nbe) ((nbe) ((nbe) evf.f20381a.m17251b()).mo17283h(th)).mo17276G((char) 1977)).mo17290o("Failed to get screenshot.");
                break;
            case 3:
                ((nbe) ((nbe) ((nbe) fcg.f21243a.m17251b()).mo17283h(th)).mo17276G((char) 2109)).mo17290o("getOptInOptions failed");
                break;
            case 4:
                if (!(th instanceof CancellationException)) {
                    nbe nbeVar = (nbe) ((nbe) ((nbe) fhx.f22082a.m17252c()).mo17283h(th)).mo17276G(2304);
                    fhw fhwVar = (fhw) this.f11793a;
                    nbeVar.mo17299x("%s: track id %d failed", fhwVar.f22079b.f22083b, fhwVar.f22078a);
                    break;
                }
                break;
            case 5:
                ((fyf) this.f11793a).f23886e.f23889a.mo13943e("Jpeg encoding result failed, not updating remote thumbnail.", th);
                break;
            case 6:
                ((fyf) this.f11793a).f23886e.f23889a.mo13943e("Failed to save image!", th);
                break;
            case 7:
                ((fyf) this.f11793a).f23886e.f23889a.mo13943e("Failed to generate thumbnail", th);
                break;
            case 8:
                ((fyf) this.f11793a).f23886e.f23889a.mo13943e("Failed to generate thumbnail", th);
                break;
            case 9:
                ((fyf) this.f11793a).f23886e.f23889a.mo13943e("Failed to generate thumbnails", th);
                break;
            case 10:
                ((jvb) this.f11793a).close();
                break;
            case 11:
                ((gwy) this.f11793a).m9895aa();
                break;
            case 12:
                ((gxl) this.f11793a).f26723b.m9914t();
                break;
            case 13:
                ((gxl) this.f11793a).f26723b.m9914t();
                break;
            case 14:
            case 15:
            case 16:
                break;
            case 17:
                ((iak) this.f11793a).m10986b();
                break;
            case 18:
                Iterator it = Collections.unmodifiableCollection(((jxj) this.f11793a).f35022c).iterator();
                while (it.hasNext()) {
                    ((jxe) it.next()).mo10569a(new IllegalStateException("Fail to pause", th));
                }
                break;
            default:
                Iterator it2 = Collections.unmodifiableCollection(((jxj) this.f11793a).f35022c).iterator();
                while (it2.hasNext()) {
                    ((jxe) it2.next()).mo10569a(new IllegalStateException("Fail to pause", th));
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Object, nps] */
    /* JADX WARN: Type inference failed for: r9v40, types: [java.lang.Object, nps] */
    @Override // p000.nph
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo3811b(Object obj) {
        int i = 7;
        int i2 = 0;
        byte[] bArr = null;
        switch (this.f11794b) {
            case 0:
                ((djr) this.f11793a).f11804j.mo14894e(null);
                ((djr) this.f11793a).f11796b.mo3727a();
                return;
            case 1:
                cuu cuuVar = (cuu) obj;
                synchronized (((cqj) this.f11793a).f8909d) {
                    ((cqj) this.f11793a).f8908c = cuuVar;
                    break;
                }
                return;
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    ((evf) this.f11793a).m7925b(bitmap, true);
                    return;
                }
                return;
            case 3:
                nax naxVar = (nax) obj;
                Object obj2 = this.f11793a;
                lku.m15662p(naxVar);
                ((fcg) obj2).m8121b(naxVar);
                return;
            case 4:
                MediaFormat mediaFormat = (MediaFormat) obj;
                mediaFormat.getClass();
                String.format(Locale.US, "id: %d %s resolution: %s", Integer.valueOf(((fhw) this.f11793a).f22078a), mediaFormat.getString("mime"), (mediaFormat.containsKey("width") && mediaFormat.containsKey("height")) ? String.format(Locale.US, "%d x %d", Integer.valueOf(mediaFormat.getInteger("width")), Integer.valueOf(mediaFormat.getInteger("height"))) : "N/A");
                return;
            case 5:
                fxt fxtVar = (fxt) obj;
                synchronized (((fyf) this.f11793a).f23886e.f23893e) {
                    int i3 = ((fyf) this.f11793a).f23886e.f23896h;
                    if (i3 == 0) {
                        throw null;
                    }
                    if (i3 == 3) {
                        return;
                    }
                    fxtVar.getClass();
                    byte[] bArr2 = fxtVar.f23818b;
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr2, 0, bArr2.length);
                    gyh gyhVar = ((fyf) this.f11793a).f23882a;
                    bitmapDecodeByteArray.getClass();
                    gyhVar.mo9892X(bitmapDecodeByteArray, fxtVar.f23819c);
                    ((fyf) this.f11793a).f23886e.f23896h = 2;
                    return;
                }
            case 6:
                fxt fxtVar2 = (fxt) obj;
                synchronized (((fyf) this.f11793a).f23886e.f23893e) {
                    fxtVar2.getClass();
                    fyg fygVar = ((fyf) this.f11793a).f23886e;
                    fygVar.f23896h = 2;
                    fygVar.f23889a.mo13946h(YmzeHXaMYOLk.DnOApNVd);
                    ((fyf) this.f11793a).f23886e.f23897i.m13108n(fxtVar2.f23820d);
                    hln hlnVar = new hln(krd.JPEG);
                    hlnVar.m10447a(fxtVar2.f23820d);
                    hlnVar.m10448b(kay.m13889b(fxtVar2.f23819c));
                    ((fyf) this.f11793a).f23882a.mo9912r(fxtVar2.f23818b, hlnVar);
                    ((fyf) this.f11793a).f23886e.f23889a.mo13946h("Done saving image");
                    break;
                }
                return;
            case 7:
                Bitmap bitmap2 = (Bitmap) obj;
                synchronized (((fyf) this.f11793a).f23886e.f23893e) {
                    Object obj3 = this.f11793a;
                    fyg fygVar2 = ((fyf) obj3).f23886e;
                    int i4 = fygVar2.f23896h;
                    if (i4 == 0) {
                        throw null;
                    }
                    if (i4 == 4) {
                        return;
                    }
                    fygVar2.f23896h = 3;
                    gyh gyhVar2 = ((fyf) obj3).f23882a;
                    gvw gvwVar = ((fyf) obj3).f23884c;
                    bitmap2.getClass();
                    gyhVar2.mo9893Y(gvwVar.mo9806b(bitmap2, 0, ((fyf) obj3).f23883b.f23576d));
                    return;
                }
            case 8:
                Bitmap bitmap3 = (Bitmap) obj;
                synchronized (((fyf) this.f11793a).f23886e.f23893e) {
                    Object obj4 = this.f11793a;
                    fyg fygVar3 = ((fyf) obj4).f23886e;
                    int i5 = fygVar3.f23896h;
                    if (i5 == 0) {
                        throw null;
                    }
                    if (i5 == 4) {
                        return;
                    }
                    fygVar3.f23896h = 3;
                    if (!((fyf) obj4).f23884c.mo9812h(((fyf) obj4).f23883b.f23576d)) {
                        kay kayVar = ((fyf) this.f11793a).f23885d;
                        kayVar.getClass();
                        i2 = kayVar.f35503e;
                    }
                    Object obj5 = this.f11793a;
                    gyh gyhVar3 = ((fyf) obj5).f23882a;
                    gvw gvwVar2 = ((fyf) obj5).f23884c;
                    bitmap3.getClass();
                    kay kayVar2 = ((fyf) obj5).f23885d;
                    kayVar2.getClass();
                    gyhVar3.mo9892X(gvwVar2.mo9806b(bitmap3, kayVar2.f35503e, ((fyf) obj5).f23883b.f23576d), i2);
                    return;
                }
            case 9:
                gtd gtdVar = (gtd) obj;
                gtdVar.getClass();
                kxk.m14975U(gtdVar.f26334a, new djq((fyf) this.f11793a, 7), not.INSTANCE);
                kxk.m14975U(gtdVar.f26335b, new djq((fyf) this.f11793a, 8), not.INSTANCE);
                return;
            case 10:
                ((jvb) this.f11793a).close();
                return;
            case 11:
                if (Boolean.TRUE.equals((Boolean) obj)) {
                    ((gwy) this.f11793a).f26676l = true;
                    return;
                } else {
                    ((gwy) this.f11793a).m9895aa();
                    return;
                }
            case 12:
                ((gxl) this.f11793a).m9936t().m9987g();
                return;
            case 13:
                ((gxl) this.f11793a).m9936t().m9987g();
                return;
            case 14:
                hmq hmqVar = (hmq) obj;
                if (hmqVar != null) {
                    hmc hmcVar = (hmc) this.f11793a;
                    hmcVar.f28301e = hmqVar;
                    hmcVar.m10456a();
                    return;
                }
                return;
            case 15:
                hmq hmqVar2 = (hmq) obj;
                if (hmqVar2 != null) {
                    hmk hmkVar = (hmk) this.f11793a;
                    hmkVar.f28325e = hmqVar2;
                    hmkVar.m10459b();
                    return;
                }
                return;
            case 16:
                ((iak) this.f11793a).f30151d.m13541c(new hri(this, (lrh) obj, i, bArr));
                return;
            case 17:
                lrh lrhVar = (lrh) obj;
                if (lrhVar == lrh.SETUP_COMPLETE) {
                    ((iak) this.f11793a).f30153f.mo10033e(gzy.f27036at, true);
                    return;
                }
                lrd lrdVar = ((iak) this.f11793a).f30164q;
                lrhVar.getClass();
                if (lrhVar == lrh.NEEDS_ONBOARDING) {
                    ((hst) lrdVar.f39058c).m10713l(9, -1, (View) lrdVar.f39059d);
                } else {
                    TextView textView = (TextView) ((FrameLayout) lrdVar.f39060e).findViewById(C0100R.id.ineligible_reason);
                    switch (lrhVar.ordinal()) {
                        case 2:
                            textView.setText(C0100R.string.mars_not_available_reason_account);
                            break;
                        case 6:
                            textView.setText(C0100R.string.mars_not_available_reason_work_profile);
                            break;
                    }
                    ((hst) lrdVar.f39058c).m10713l(9, C0100R.string.mars_not_available, (View) lrdVar.f39060e);
                }
                ((iak) this.f11793a).m10986b();
                return;
            case 18:
                Iterator it = Collections.unmodifiableCollection(((jxj) this.f11793a).f35022c).iterator();
                while (it.hasNext()) {
                    ((jxe) it.next()).mo10570b();
                }
                return;
            default:
                Iterator it2 = Collections.unmodifiableCollection(((jxj) this.f11793a).f35022c).iterator();
                while (it2.hasNext()) {
                    ((jxe) it2.next()).mo10571c();
                }
                return;
        }
    }
}
