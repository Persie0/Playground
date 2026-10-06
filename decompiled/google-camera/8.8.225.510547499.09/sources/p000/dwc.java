package p000;

import android.R;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.bottombar.RoundedThumbnailView;
import com.google.android.apps.camera.filmstrip.transition.FilmstripTransitionLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dwc implements dvv {

    /* JADX INFO: renamed from: a */
    public static final nbh f12703a = nbh.m17259h("com/google/android/apps/camera/filmstrip/photos/PhotosReviewLauncherImpl");

    /* JADX INFO: renamed from: b */
    static final int f12704b = C0100R.dimen.rounded_thumbnail_diameter_normal;

    /* JADX INFO: renamed from: c */
    public final ohb f12705c;

    /* JADX INFO: renamed from: d */
    public final FilmstripTransitionLayout f12706d;

    /* JADX INFO: renamed from: e */
    public final RoundedThumbnailView f12707e;

    /* JADX INFO: renamed from: f */
    public final jvd f12708f;

    /* JADX INFO: renamed from: g */
    public final hah f12709g;

    /* JADX INFO: renamed from: h */
    public nps f12710h = kxk.m14965K(Boolean.FALSE);

    /* JADX INFO: renamed from: i */
    private final Context f12711i;

    /* JADX INFO: renamed from: j */
    private final boolean f12712j;

    /* JADX INFO: renamed from: k */
    private final huf f12713k;

    /* JADX INFO: renamed from: l */
    private final djb f12714l;

    /* JADX INFO: renamed from: m */
    private final gxz f12715m;

    /* JADX INFO: renamed from: n */
    private final fcp f12716n;

    /* JADX INFO: renamed from: o */
    private final ink f12717o;

    /* JADX INFO: renamed from: p */
    private final htf f12718p;

    /* JADX INFO: renamed from: q */
    private final ohb f12719q;

    /* JADX INFO: renamed from: r */
    private final Activity f12720r;

    /* JADX INFO: renamed from: s */
    private final cdv f12721s;

    /* JADX INFO: renamed from: t */
    private gvn f12722t;

    /* JADX INFO: renamed from: u */
    private final bko f12723u;

    /* JADX INFO: renamed from: v */
    private final bko f12724v;

    public dwc(Context context, boolean z, ohb ohbVar, huf hufVar, djb djbVar, bko bkoVar, gxz gxzVar, fcp fcpVar, Activity activity, jvd jvdVar, ink inkVar, djm djmVar, htf htfVar, ohb ohbVar2, bko bkoVar2, cdv cdvVar, hah hahVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f12711i = context;
        this.f12712j = z;
        this.f12705c = ohbVar;
        this.f12713k = hufVar;
        this.f12714l = djbVar;
        this.f12723u = bkoVar;
        this.f12715m = gxzVar;
        this.f12716n = fcpVar;
        this.f12708f = jvdVar;
        this.f12721s = cdvVar;
        this.f12720r = activity;
        this.f12717o = inkVar;
        this.f12706d = (FilmstripTransitionLayout) ((jfs) djmVar.f11789c).m13100f(C0100R.id.filmstrip_transition_layout);
        this.f12707e = (RoundedThumbnailView) ((jfs) djmVar.f11789c).m13100f(C0100R.id.thumbnail_button);
        this.f12718p = htfVar;
        this.f12719q = ohbVar2;
        this.f12724v = bkoVar2;
        this.f12709g = hahVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00b8  */
    /* JADX INFO: renamed from: i */
    private final nps m6800i(Intent intent) {
        if (intent.resolveActivity(this.f12711i.getPackageManager()) == null) {
            ((dvx) this.f12719q.get()).mo3523bF();
            this.f12707e.setVisibility(0);
            return kxk.m14964J(new CancellationException("Photos is disabled."));
        }
        this.f12713k.mo10383c();
        this.f12721s.f5344e = 3;
        Long lMo10736d = this.f12718p.mo10736d();
        if (lMo10736d != null) {
            intent.putExtra("photos_review_launch_timestamp", lMo10736d.longValue());
        }
        intent.putExtra("shared_element_return_transition", true);
        intent.putExtra("return_transition_thumbnail_diameter", this.f12720r.getResources().getDimension(f12704b));
        PackageInfo packageInfoM11522a = this.f12717o.m11522a();
        if (packageInfoM11522a == null) {
            bko bkoVar = this.f12723u;
            ((Activity) bkoVar.f3652a).startActivityForResult(intent, 0);
            ((Activity) bkoVar.f3652a).overridePendingTransition(C0100R.anim.photos_transition_noanim, C0100R.anim.photos_transition_noanim);
        } else {
            String str = packageInfoM11522a.versionName;
            if (!str.equals("DEVELOPMENT")) {
                try {
                    if (new inj(str).compareTo(new inj("6.12")) < 0) {
                        bko bkoVar2 = this.f12723u;
                        ((Activity) bkoVar2.f3652a).startActivityForResult(intent, 0);
                        ((Activity) bkoVar2.f3652a).overridePendingTransition(C0100R.anim.photos_transition_noanim, C0100R.anim.photos_transition_noanim);
                    }
                } catch (IllegalArgumentException e) {
                    ((nbe) ((nbe) ink.f31598a.m17251b()).mo17276G(4353)).mo17301z("Fail to check the version between %s and %s", str, "6.12");
                }
            }
            mrm mrmVarMo10734b = this.f12718p.mo10734b();
            if (mrmVarMo10734b.mo16813g()) {
                this.f12720r.setExitSharedElementCallback(new dwb((Bitmap) mrmVarMo10734b.mo16809c()));
                intent.putExtra("use_shared_element_snapshot_for_thumbnail", true);
            }
            ActivityOptions activityOptionsMakeSceneTransitionAnimation = ActivityOptions.makeSceneTransitionAnimation(this.f12720r, this.f12707e, "photos:filmstrip_transition_view");
            bko bkoVar3 = this.f12723u;
            Bundle bundle = activityOptionsMakeSceneTransitionAnimation.toBundle();
            bundle.getClass();
            ((Activity) bkoVar3.f3652a).startActivityForResult(intent, 0, bundle);
        }
        return kxk.m14965K(Boolean.TRUE);
    }

    @Override // p000.dvv
    /* JADX INFO: renamed from: a */
    public final nps mo6794a() {
        Intent intentM3266f = bzq.m3266f(this.f12712j, true, this.f12720r.isVoiceInteractionRoot(), new long[0]);
        intentM3266f.setData(lrg.f39076a);
        gvn gvnVar = this.f12722t;
        if (gvnVar != null) {
            gvnVar.mo7778A();
        }
        return m6800i(intentM3266f);
    }

    @Override // p000.dvv
    /* JADX INFO: renamed from: b */
    public final void mo6795b() {
        jvd.m13538a();
        if (mo6798e()) {
            return;
        }
        if (this.f12717o.m11522a() == null) {
            ((nbe) ((nbe) f12703a.m17252c()).mo17276G((char) 1159)).mo17290o("Cannot find Photos package info. Canceling.");
            bko bkoVar = this.f12724v;
            mhs mhsVar = new mhs((Context) bkoVar.f3652a, C0100R.style.Theme_Camera_MaterialAlertDialog);
            mhsVar.m16391s(C0100R.string.photos_required_title);
            mhsVar.m16384l(C0100R.string.photos_required_message);
            mhsVar.m16389q(C0100R.string.play_store_button, new cdo(bkoVar, 7, (byte[]) null, (byte[]) null, (byte[]) null));
            mhsVar.m16386n(R.string.cancel, null);
            mhsVar.m7257c();
            return;
        }
        try {
            int applicationEnabledSetting = this.f12717o.f31599b.getPackageManager().getApplicationEnabledSetting("com.google.android.apps.photos");
            if (applicationEnabledSetting == 0 || applicationEnabledSetting == 1) {
                try {
                    if (this.f12717o.f31599b.getPackageManager().isPackageSuspended("com.google.android.apps.photos")) {
                        ((nbe) ((nbe) f12703a.m17252c()).mo17276G((char) 1157)).mo17290o("Photos is suspended. Canceling.");
                        Intent intent = (Intent) bzq.m3267g(this.f12711i).mo16812f();
                        intent.getClass();
                        this.f12723u.m2612f(intent);
                        return;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    ((nbe) ((nbe) ((nbe) ink.f31598a.m17252c()).mo17283h(e)).mo17276G((char) 4352)).mo17290o("Photos app package not found.");
                }
                int i = 0;
                this.f12720r.getWindow().setSharedElementsUseOverlay(false);
                lku.m15613H(!mo6798e());
                chp chpVarM6801f = m6801f((chv) this.f12705c.get());
                nps npsVarM17523i = nnj.m17523i((chpVarM6801f == null && this.f12712j) ? kxk.m14964J(new CancellationException("FilmstripDataAdapter is empty in secure activity")) : (nps) this.f12718p.mo10734b().mo16808b(new dvz(this, chpVarM6801f, i)).mo16810d(new dks(this, chpVarM6801f, 2)), CancellationException.class, ddu.f10590g, not.INSTANCE);
                this.f12710h = npsVarM17523i;
                kxk.m14975U(npsVarM17523i, new cod(2), not.INSTANCE);
                return;
            }
        } catch (IllegalArgumentException e2) {
            ((nbe) ((nbe) ((nbe) ink.f31598a.m17252c()).mo17283h(e2)).mo17276G((char) 4351)).mo17290o("Photos app package not found.");
        }
        ((nbe) ((nbe) f12703a.m17252c()).mo17276G((char) 1158)).mo17290o("Photos is disabled. Canceling.");
        bko bkoVar2 = this.f12724v;
        mhs mhsVar2 = new mhs((Context) bkoVar2.f3652a, C0100R.style.Theme_Camera_MaterialAlertDialog);
        mhsVar2.m16391s(C0100R.string.photos_disabled_title);
        mhsVar2.m16384l(C0100R.string.photos_disabled_message);
        mhsVar2.m16389q(C0100R.string.settings_button, new cdo(bkoVar2, 8, (byte[]) null, (byte[]) null, (byte[]) null));
        mhsVar2.m16386n(R.string.cancel, null);
        mhsVar2.m7257c();
    }

    @Override // p000.dvv
    /* JADX INFO: renamed from: c */
    public final void mo6796c() {
        if (mo6798e()) {
            ((cht) this.f12719q.get()).mo3754f();
            this.f12710h.cancel(false);
            this.f12710h = kxk.m14965K(Boolean.FALSE);
        }
    }

    @Override // p000.dvv
    /* JADX INFO: renamed from: d */
    public final void mo6797d(gvn gvnVar) {
        this.f12722t = gvnVar;
    }

    @Override // p000.dvv
    /* JADX INFO: renamed from: e */
    public final boolean mo6798e() {
        if (!this.f12710h.isDone()) {
            return true;
        }
        Boolean bool = (Boolean) jvh.m13560h(this.f12710h);
        lku.m15662p(bool);
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: f */
    final chp m6801f(chv chvVar) {
        Iterator it = chvVar.iterator();
        while (it.hasNext()) {
            chp chpVar = (chp) it.next();
            chpVar.getClass();
            if (!chpVar.mo3733b().mo3750j()) {
                return chpVar;
            }
            gyu gyuVarMo3744d = chpVar.mo3733b().mo3744d();
            String.format(Locale.ROOT, "Null ShotId encountered for item: %s", chpVar.mo3733b());
            gyuVarMo3744d.getClass();
            if (!this.f12715m.f26782a.contains(gyuVarMo3744d)) {
                return chpVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final nps m6802g(chp chpVar) {
        String str;
        gyw gywVar;
        gyw gywVar2;
        String str2;
        int i;
        lku.m15613H(!this.f12710h.isDone());
        boolean z = this.f12712j;
        boolean zBooleanValue = ((Boolean) this.f12709g.mo10031c(gzy.f27036at)).booleanValue();
        boolean zIsVoiceInteractionRoot = this.f12720r.isVoiceInteractionRoot();
        cho<chp> choVar = (cho) this.f12705c.get();
        choVar.mo3728a();
        ArrayList arrayList = new ArrayList();
        for (chp chpVar2 : choVar) {
            mws mwsVarMo3746f = chpVar2.mo3733b().mo3746f();
            if (mwsVarMo3746f.isEmpty()) {
                arrayList.add(Long.valueOf(chpVar2.mo3733b().mo3742b()));
            } else {
                int size = mwsVarMo3746f.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Long l = (Long) mwsVarMo3746f.get(i2);
                    if (l.longValue() != -1) {
                        arrayList.add(l);
                    }
                }
            }
        }
        Object[] array = arrayList.toArray();
        int length = array.length;
        long[] jArr = new long[length];
        for (int i3 = 0; i3 < length; i3++) {
            Object obj = array[i3];
            obj.getClass();
            jArr[i3] = ((Number) obj).longValue();
        }
        arrayList.size();
        Arrays.toString(jArr);
        Intent intentM3266f = bzq.m3266f(z, zBooleanValue, zIsVoiceInteractionRoot, jArr);
        long jMo8152a = this.f12716n.mo8152a();
        lku.m15672z(true, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", 10);
        if (jMo8152a == 0) {
            str = "0";
        } else if (jMo8152a > 0) {
            str = Long.toString(jMo8152a, 10);
        } else {
            long j = (jMo8152a >>> 1) / 5;
            char[] cArr = new char[64];
            int i4 = 63;
            cArr[63] = Character.forDigit((int) (jMo8152a - (j * 10)), 10);
            for (long j2 = 0; j > j2; j2 = 0) {
                i4--;
                cArr[i4] = Character.forDigit((int) (j % 10), 10);
                j /= 10;
            }
            str = new String(cArr, i4, 64 - i4);
        }
        intentM3266f.putExtra("external_session_id", str);
        fes fesVarMo3735d = chpVar.mo3735d();
        if (fesVarMo3735d == null) {
            gywVar = gyw.UNKNOWN;
        } else if (fesVarMo3735d.f21567f) {
            gywVar = gyw.PANORAMA;
        } else if (fesVarMo3735d.f21568g) {
            gywVar = gyw.PHOTOSPHERE;
        } else {
            gywVar = (fesVarMo3735d.f21566e <= 0 || fesVarMo3735d.f21563b <= 0 || fesVarMo3735d.f21564c <= 0 || fesVarMo3735d.f21565d.length() <= 0) ? gyw.UNKNOWN : gyw.VIDEO;
        }
        chq chqVarMo3733b = chpVar.mo3733b();
        if (((Boolean) this.f12709g.mo10031c(gzy.f27036at)).booleanValue() || !chqVarMo3733b.mo3750j() || chqVarMo3733b.mo3744d() == null) {
            lku.m15614I(true ^ chqVarMo3733b.mo3743c().equals(Uri.EMPTY), "Item is no longer in progress but data doesn't have a valid URI.");
            intentM3266f.setData(chqVarMo3733b.mo3743c());
            gywVar2 = gywVar;
        } else {
            gxz gxzVar = this.f12715m;
            gyu gyuVarMo3744d = chqVarMo3733b.mo3744d();
            gyuVarMo3744d.getClass();
            gyp gypVar = (gyp) gxzVar.f26783b.get(gyuVarMo3744d);
            if (gypVar != null) {
                gywVar = gypVar.f26867c;
            }
            Uri uriMo3743c = gypVar != null ? gypVar.f26866b : chpVar.mo3733b().mo3743c();
            intentM3266f.setDataAndType(uriMo3743c, krd.JPEG.f37021i);
            intentM3266f.putExtra("processing_uri_intent_extra", new Uri.Builder().scheme("content").authority(this.f12714l.f11764e).appendPath("processing").appendPath(uriMo3743c.getLastPathSegment()).build());
            gywVar2 = gywVar;
        }
        PackageInfo packageInfoM11522a = this.f12717o.m11522a();
        if (packageInfoM11522a != null) {
            str2 = packageInfoM11522a.versionName;
            i = packageInfoM11522a.versionCode;
        } else {
            str2 = null;
            i = 0;
        }
        this.f12716n.mo8130E(str, chpVar.mo3733b().mo3750j(), gywVar2, str2, i);
        return m6800i(intentM3266f);
    }

    /* JADX INFO: renamed from: h */
    public final nps m6803h(chp chpVar) {
        lku.m15613H(!this.f12710h.isDone());
        if (chpVar != null) {
            return m6802g(chpVar);
        }
        final nqf nqfVarM17621g = nqf.m17621g();
        ((chv) this.f12705c.get()).mo3763g().mo2282d(new Runnable() { // from class: dvy
            @Override // java.lang.Runnable
            public final void run() {
                dwc dwcVar = this.f12693a;
                nqf nqfVar = nqfVarM17621g;
                if (dwcVar.f12710h.isDone()) {
                    CancellationException cancellationException = new CancellationException("Photos Launch was already cancelled.");
                    ((nbe) ((nbe) ((nbe) dwc.f12703a.m17252c()).mo17283h(cancellationException)).mo17276G((char) 1156)).mo17290o("launchPhotos");
                    nqfVar.mo8566a(cancellationException);
                    return;
                }
                chp chpVarM6801f = dwcVar.m6801f((chv) dwcVar.f12705c.get());
                if (chpVarM6801f != null) {
                    nqfVar.mo16665f(dwcVar.m6802g(chpVarM6801f));
                } else {
                    if (((Boolean) dwcVar.f12709g.mo10031c(gzy.f27036at)).booleanValue()) {
                        nqfVar.mo16665f(dwcVar.mo6794a());
                        return;
                    }
                    CancellationException cancellationException2 = new CancellationException("filmstrip item was null");
                    ((nbe) ((nbe) ((nbe) dwc.f12703a.m17251b()).mo17283h(cancellationException2)).mo17276G((char) 1155)).mo17290o("launchPhotos");
                    nqfVar.mo8566a(cancellationException2);
                }
            }
        }, this.f12708f);
        return nqfVarM17621g;
    }
}
