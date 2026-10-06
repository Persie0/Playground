package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.xRFdVyfdeve;
import com.google.android.clockwork.common.wearable.wearmaterial.picker.CenteredRecyclerView;
import com.google.android.clockwork.common.wearable.wearmaterial.slider.WearInlineSlider;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ith implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f32144a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f32145b;

    public ith(AmbientMode.AmbientController ambientController, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f32145b = i;
        this.f32144a = ambientController;
    }

    public /* synthetic */ ith(CenteredRecyclerView centeredRecyclerView, int i) {
        this.f32145b = i;
        this.f32144a = centeredRecyclerView;
    }

    public /* synthetic */ ith(WearInlineSlider wearInlineSlider, int i) {
        this.f32145b = i;
        this.f32144a = wearInlineSlider;
    }

    public ith(DataHolder dataHolder, int i) {
        this.f32145b = i;
        this.f32144a = dataHolder;
    }

    public /* synthetic */ ith(itx itxVar, int i) {
        this.f32145b = i;
        this.f32144a = itxVar;
    }

    public /* synthetic */ ith(ixr ixrVar, int i) {
        this.f32145b = i;
        this.f32144a = ixrVar;
    }

    public /* synthetic */ ith(ixw ixwVar, int i) {
        this.f32145b = i;
        this.f32144a = ixwVar;
    }

    public /* synthetic */ ith(iyi iyiVar, int i) {
        this.f32145b = i;
        this.f32144a = iyiVar;
    }

    public ith(izq izqVar, int i) {
        this.f32145b = i;
        this.f32144a = izqVar;
    }

    public ith(jaf jafVar, int i) {
        this.f32145b = i;
        this.f32144a = jafVar;
    }

    public ith(jai jaiVar, int i) {
        this.f32145b = i;
        this.f32144a = jaiVar;
    }

    public /* synthetic */ ith(Throwable th, int i) {
        this.f32145b = i;
        this.f32144a = th;
    }

    public ith(jfj jfjVar, int i) {
        this.f32145b = i;
        this.f32144a = jfjVar;
    }

    public ith(jgd jgdVar, int i) {
        this.f32145b = i;
        this.f32144a = jgdVar;
    }

    public /* synthetic */ ith(jpe jpeVar, int i) {
        this.f32145b = i;
        this.f32144a = jpeVar;
    }

    public ith(jph jphVar, int i) {
        this.f32145b = i;
        this.f32144a = jphVar;
    }

    public /* synthetic */ ith(jtm jtmVar, int i) {
        this.f32145b = i;
        this.f32144a = jtmVar;
    }

    public /* synthetic */ ith(jwl jwlVar, int i, byte[] bArr) {
        this.f32145b = i;
        this.f32144a = jwlVar;
    }

    /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, jpi] */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        AbstractC0812ly abstractC0812ly;
        View viewMo2046b;
        boolean zM12859d;
        int i = 1;
        int i2 = 0;
        switch (this.f32145b) {
            case 0:
                ((itx) this.f32144a).f32200l.setAccessibilityLiveRegion(0);
                return;
            case 1:
                ((itg) this.f32144a).mo11674a();
                return;
            case 2:
                ((itx) this.f32144a).m11781C();
                return;
            case 3:
                ixr ixrVar = (ixr) this.f32144a;
                CenteredRecyclerView centeredRecyclerView = ixrVar.f32601a;
                if (centeredRecyclerView != null) {
                    if (centeredRecyclerView.f7488ad) {
                        AbstractC0812ly abstractC0812ly2 = centeredRecyclerView.f1124n;
                        ixx ixxVar = (ixx) centeredRecyclerView.f1123m;
                        if (abstractC0812ly2 != null && ixxVar != null) {
                            centeredRecyclerView.m4611aD();
                            View viewMo1153M = abstractC0812ly2.mo1153M(-1);
                            if (viewMo1153M != null) {
                                iyb iybVar = centeredRecyclerView.f7486ab;
                                int iMo11892d = (iybVar.mo11892d(centeredRecyclerView) / 2) - iybVar.mo11890b(viewMo1153M);
                                if (iMo11892d == 0) {
                                    throw null;
                                }
                                iybVar.mo11893e(centeredRecyclerView, iMo11892d);
                                centeredRecyclerView.forceLayout();
                                centeredRecyclerView.invalidate();
                                throw null;
                            }
                        }
                    }
                    ixrVar.m11870c();
                    return;
                }
                return;
            case 4:
                Object obj2 = this.f32144a;
                CenteredRecyclerView centeredRecyclerView2 = (CenteredRecyclerView) obj2;
                View view = (View) obj2;
                int iMo11891c = centeredRecyclerView2.f7486ab.mo11891c(view);
                int i3 = centeredRecyclerView2.f7489ae;
                if (iMo11891c != i3) {
                    centeredRecyclerView2.f7486ab.mo11894f(view, i3);
                    i2 = 1;
                }
                if (centeredRecyclerView2.f7488ad && centeredRecyclerView2.f7490af == null) {
                    centeredRecyclerView2.f7490af = new ixs(centeredRecyclerView2.f7491ag, centeredRecyclerView2.f7492ah);
                } else {
                    i = i2;
                }
                RecyclerView recyclerView = (RecyclerView) obj2;
                if (((ixx) recyclerView.f1123m) != null) {
                    recyclerView.m1249ay(null);
                    ixs ixsVar = centeredRecyclerView2.f7490af;
                    if (ixsVar != null) {
                        ixsVar.mo11874e(null);
                    }
                    if (centeredRecyclerView2.f7488ad) {
                        recyclerView.m1247aw(null);
                        ixs ixsVar2 = centeredRecyclerView2.f7490af;
                        if (ixsVar2 != null) {
                            ixsVar2.mo11874e(recyclerView);
                        }
                    }
                }
                if (i != 0) {
                    centeredRecyclerView2.m4608aA();
                    return;
                }
                return;
            case 5:
                ixw ixwVar = (ixw) this.f32144a;
                if (ixwVar.f32617i != 0) {
                    ixwVar.f32612d.postDelayed(ixwVar.f32613e, 100L);
                    return;
                }
                ixwVar.f32612d.m4611aD();
                if (ixwVar.f32616h >= 0) {
                    ixwVar.f32612d.m4610aC(0);
                    return;
                }
                return;
            case 6:
                ixw ixwVar2 = (ixw) this.f32144a;
                if (ixwVar2.f32615g) {
                    if (ixwVar2.f32617i == 0) {
                        ixwVar2.f32615g = false;
                        return;
                    } else {
                        ixwVar2.f32612d.postDelayed(ixwVar2.f32614f, 100L);
                        return;
                    }
                }
                return;
            case 7:
                ((iyi) this.f32144a).f32646a.m1230ac(0, 1);
                return;
            case 8:
                jwl jwlVar = (jwl) this.f32144a;
                if (!jwlVar.f34954a || (obj = jwlVar.f34955b) == null || (abstractC0812ly = ((RecyclerView) jwlVar.f34956c).f1124n) == null || (viewMo2046b = ((C0789lb) obj).mo2046b(abstractC0812ly)) == null) {
                    return;
                }
                int[] iArrMo11872c = ((C0789lb) jwlVar.f34955b).mo11872c(abstractC0812ly, viewMo2046b);
                int i4 = iArrMo11872c[0];
                if (i4 != 0) {
                    i2 = i4;
                } else if (iArrMo11872c[1] == 0) {
                    return;
                }
                ((RecyclerView) jwlVar.f34956c).m1230ac(i2, iArrMo11872c[1]);
                return;
            case 9:
                ((WearInlineSlider) this.f32144a).m4630j();
                return;
            case 10:
                ((izq) this.f32144a).f32722a.m12767F();
                return;
            case 11:
                Object obj3 = this.f32144a;
                ((izs) obj3).m11946z();
                izo.m11916a();
                izr izrVar = (izr) obj3;
                Context context = izrVar.f32723b.f32728a;
                if (!jav.m12809a(context)) {
                    izrVar.m11939t("AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.");
                } else if (!ihk.m11327B(context)) {
                    izrVar.m11933n("AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.");
                }
                jib.m13205j(context);
                Boolean bool = izf.f32706a;
                if (bool != null) {
                    zM12859d = bool.booleanValue();
                } else {
                    zM12859d = jbx.m12859d(context, "com.google.android.gms.analytics.CampaignTrackingReceiver", true);
                    izf.f32706a = Boolean.valueOf(zM12859d);
                }
                if (!zM12859d) {
                    izrVar.m11939t("CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
                }
                jau jauVarM11930j = izrVar.m11930j();
                izo.m11916a();
                jauVarM11930j.m11946z();
                if (jauVarM11930j.f33625c == 0) {
                    long j = jauVarM11930j.f33624a.getLong(xRFdVyfdeve.YRdl, 0L);
                    if (j != 0) {
                        jauVarM11930j.f33625c = j;
                    } else {
                        jauVarM11930j.m11943y();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        SharedPreferences.Editor editorEdit = jauVarM11930j.f33624a.edit();
                        editorEdit.putLong("first_run", jCurrentTimeMillis);
                        if (!editorEdit.commit()) {
                            jauVarM11930j.m11939t("Failed to commit first run time");
                        }
                        jauVarM11930j.f33625c = jCurrentTimeMillis;
                    }
                }
                jaf jafVar = (jaf) obj3;
                if (!jafVar.m12768G("android.permission.ACCESS_NETWORK_STATE")) {
                    izrVar.m11933n("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
                    jafVar.m12766E();
                }
                if (!jafVar.m12768G("android.permission.INTERNET")) {
                    izrVar.m11933n("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
                    jafVar.m12766E();
                }
                if (ihk.m11327B(izrVar.m11924d())) {
                    izrVar.m11936q("AnalyticsService registered in the app manifest and enabled");
                } else {
                    izrVar.m11939t("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
                }
                if (!jafVar.f33558f && !jafVar.f33555c.m12758H()) {
                    jafVar.m12764C();
                }
                jafVar.m12767F();
                return;
            case 12:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    ((jai) this.f32144a).f33569b.m11949a().m11917b(this);
                    return;
                }
                boolean zM12783e = ((jai) this.f32144a).m12783e();
                ((jai) this.f32144a).f33571d = 0L;
                if (zM12783e) {
                    ((jai) this.f32144a).mo11953a();
                    return;
                }
                return;
            case 13:
                ((jfj) this.f32144a).m13029h();
                return;
            case 14:
                jdu jduVar = ((jfj) ((AmbientMode.AmbientController) this.f32144a).f1697a).f33870b;
                jduVar.m12943k(String.valueOf(jduVar.getClass().getName()).concat(" disconnecting because it was signed out."));
                return;
            case 15:
                ((jgd) this.f32144a).f33950f.m13038b(new jcu(4));
                return;
            case 16:
                throw new nqn((Throwable) this.f32144a);
            case 17:
                Object obj4 = this.f32144a;
                synchronized (((jpe) obj4).f34534b) {
                    if (((jpe) obj4).m13443b()) {
                        Log.e("WakeLock", ((jpe) obj4).f34542j + " ** IS FORCE-RELEASED ON TIMEOUT **");
                        ((jpe) obj4).m13442a();
                        if (((jpe) obj4).m13443b()) {
                            ((jpe) obj4).f34536d = 1;
                            ((jpe) obj4).m13445d();
                            return;
                        }
                        return;
                    }
                    return;
                }
            case 18:
                synchronized (((jph) this.f32144a).f34550a) {
                    ?? r1 = ((jph) this.f32144a).f34551b;
                    if (r1 != 0) {
                        r1.mo13447b();
                    }
                    break;
                }
                return;
            case 19:
                Object obj5 = this.f32144a;
                jqt jqtVar = new jqt(((jtm) obj5).f34782b, 0);
                try {
                    String str = ((jtm) obj5).f34781a;
                    jqtVar.mo12970ck();
                    return;
                } catch (Throwable th) {
                    try {
                        jqtVar.mo12970ck();
                        break;
                    } catch (Throwable th2) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            break;
                        } catch (Exception e) {
                        }
                    }
                    throw th;
                }
            default:
                new jqt((DataHolder) this.f32144a, 1, null).mo12970ck();
                return;
        }
    }
}
