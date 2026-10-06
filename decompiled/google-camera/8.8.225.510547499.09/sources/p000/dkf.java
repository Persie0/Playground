package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dkf extends djx {

    /* JADX INFO: renamed from: h */
    private static final nbh f11880h = nbh.m17259h("com/google/android/apps/camera/data/PhotoItem");

    /* JADX INFO: renamed from: g */
    public mrm f11881g;

    /* JADX INFO: renamed from: i */
    private final hlp f11882i;

    public dkf(Context context, djy djyVar, chq chqVar, hlp hlpVar, gyx gyxVar) {
        super(context, djyVar, chqVar, gyxVar);
        this.f11881g = mqu.f41450a;
        this.f11882i = hlpVar;
    }

    @Override // p000.chp
    /* JADX INFO: renamed from: a */
    public final View mo3732a(mrm mrmVar, ViewGroup viewGroup) {
        View viewM6264j;
        djw djwVarK;
        if (mrmVar.mo16813g()) {
            viewM6264j = (View) mrmVar.mo16809c();
            djwVarK = m6262k(viewM6264j);
        } else {
            viewM6264j = null;
            djwVarK = null;
        }
        if (djwVarK == null) {
            viewM6264j = m6264j(viewGroup);
            djwVarK = m6262k(viewM6264j);
            djwVarK.getClass();
        }
        viewM6264j.getClass();
        viewM6264j.setTag(C0100R.id.mediadata_tag_viewtype, Integer.valueOf(chr.PHOTO.ordinal()));
        djwVarK.f11826b.setVisibility(8);
        if (this.f11833e.f21569h && djwVarK.f11827c.isClickable()) {
            djwVarK.f11827c.setVisibility(0);
        } else {
            djwVarK.f11827c.setVisibility(8);
        }
        m6265l(viewM6264j);
        ImageView imageView = djwVarK.f11825a;
        if (this.f11832d.mo3750j()) {
            imageView.setContentDescription(this.f11830b.getResources().getString(C0100R.string.media_processing_content_description));
        } else {
            fes fesVar = this.f11833e;
            boolean z = fesVar.f21567f;
            int i = C0100R.string.panorama_date_content_description;
            if (!z && !fesVar.f21568g) {
                i = fesVar.f21569h ? C0100R.string.photosphere_date_content_description : C0100R.string.photo_date_content_description;
            }
            imageView.setContentDescription(this.f11830b.getResources().getString(i, f11828a.format(this.f11832d.mo3748h())));
        }
        return viewM6264j;
    }

    @Override // p000.chp
    /* JADX INFO: renamed from: c */
    public final chr mo3734c() {
        return chr.PHOTO;
    }

    @Override // p000.chp
    /* JADX INFO: renamed from: i */
    public final kym mo3740i(int i, int i2) {
        chq chqVar = this.f11832d;
        if (chqVar.mo3750j()) {
            gyu gyuVarMo3744d = chqVar.mo3744d();
            gyuVarMo3744d.getClass();
            Bitmap bitmapM10449a = this.f11882i.m10449a(gyuVarMo3744d);
            Integer numM10450b = this.f11882i.m10450b(gyuVarMo3744d);
            mrm mrmVarM16828h = mrm.m16828h(bitmapM10449a);
            ilj iljVar = ilj.PLACEHOLDER;
            return new kym(mrmVarM16828h, numM10450b != null ? numM10450b.intValue() : 0);
        }
        kbc kbcVar = new kbc(i, i2);
        chqVar.mo3743c();
        try {
            Bitmap bitmap = (Bitmap) this.f11831c.m6270a().mo2855h(this.f11831c.m6272c(m6263n(chqVar), kbcVar)).m2852e(chqVar.mo3743c()).m2857j().get();
            chqVar.mo3743c();
            bitmap.getWidth();
            bitmap.getHeight();
            mrm mrmVarM16829i = mrm.m16829i(bitmap);
            ilj iljVar2 = ilj.PLACEHOLDER;
            return new kym(mrmVarM16829i);
        } catch (InterruptedException | ExecutionException e) {
            ((nbe) ((nbe) ((nbe) f11880h.m17251b()).mo17283h(e)).mo17276G((char) 951)).mo17293r("Failed to generate thumbnail for %s", chqVar.mo3743c());
            mqu mquVar = mqu.f41450a;
            ilj iljVar3 = ilj.PLACEHOLDER;
            return new kym(mquVar);
        }
    }

    @Override // p000.djx
    /* JADX INFO: renamed from: m */
    protected final void mo6266m(djw djwVar) {
        bpn bpnVarM2852e;
        if (this.f11832d.mo3750j()) {
            gyu gyuVarMo3744d = this.f11832d.mo3744d();
            gyuVarMo3744d.getClass();
            ImageView imageView = djwVar.f11825a;
            Bitmap bitmapM10449a = this.f11882i.m10449a(gyuVarMo3744d);
            Integer numM10450b = this.f11882i.m10450b(gyuVarMo3744d);
            if (bitmapM10449a == null) {
                ((nbe) ((nbe) f11880h.m17252c()).mo17276G((char) 952)).mo17290o("renderThumbnail: No placeholder. Use default resource.");
                imageView.setImageResource(C0100R.color.photo_placeholder);
                return;
            } else {
                if (numM10450b != null && numM10450b.intValue() != 0) {
                    bitmapM10449a = jvh.m13543A(bitmapM10449a, numM10450b.intValue());
                }
                imageView.setImageBitmap(bitmapM10449a);
                return;
            }
        }
        Uri uriMo3743c = this.f11832d.mo3743c();
        cab cabVarM6272c = this.f11831c.m6272c(m6263n(this.f11832d), this.f11834f);
        chq chqVar = this.f11832d;
        if (chqVar != null && krd.m14742a(chqVar.mo3749i()) == krd.GIF) {
            cabVarM6272c = (cab) cabVarM6272c.m3310p();
        }
        if (this.f11881g.mo16813g()) {
            bpnVarM2852e = this.f11831c.m6271b().mo2855h((cab) cabVarM6272c.m3316v((Drawable) this.f11881g.mo16809c())).m2852e(uriMo3743c);
        } else {
            bpn bpnVarMo2855h = this.f11831c.m6271b().mo2855h(cabVarM6272c);
            djy djyVar = this.f11831c;
            bqn bqnVarN = m6263n(this.f11832d);
            kbc kbcVarM6267d = djy.m6267d(djyVar.f11838a, djyVar.f11839b, djy.m6268e());
            bpnVarM2852e = bpnVarMo2855h.m2854g(this.f11831c.m6271b().mo2855h((cab) ((cab) ((cab) ((cab) ((cab) new cab().m3320z(bqnVarN)).m3301K()).m3311q()).m3315u(kbcVarM6267d.f35517a, kbcVarM6267d.f35518b)).m3319y(byo.f4776b, true)).m2852e(uriMo3743c)).m2852e(uriMo3743c);
        }
        bpnVarM2852e.m2858k(djwVar.f11825a);
    }

    public final String toString() {
        return "PhotoItem: ".concat(String.valueOf(String.valueOf(this.f11832d)));
    }
}
