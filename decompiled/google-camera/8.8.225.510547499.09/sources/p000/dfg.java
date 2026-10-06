package p000;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.camera.p014ui.shutterbutton.ShutterButton;
import com.google.android.apps.camera.p014ui.views.MainActivityLayout;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dfg implements msi {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f10776a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f10777b;

    public /* synthetic */ dfg(Activity activity, int i) {
        this.f10777b = i;
        this.f10776a = activity;
    }

    public /* synthetic */ dfg(Context context, int i) {
        this.f10777b = i;
        this.f10776a = context;
    }

    public /* synthetic */ dfg(FrameLayout frameLayout, int i) {
        this.f10777b = i;
        this.f10776a = frameLayout;
    }

    public /* synthetic */ dfg(ShutterButton shutterButton, int i) {
        this.f10777b = i;
        this.f10776a = shutterButton;
    }

    public /* synthetic */ dfg(MainActivityLayout mainActivityLayout, int i) {
        this.f10777b = i;
        this.f10776a = mainActivityLayout;
    }

    public /* synthetic */ dfg(dhv dhvVar, int i) {
        this.f10777b = i;
        this.f10776a = dhvVar;
    }

    public /* synthetic */ dfg(euh euhVar, int i) {
        this.f10777b = i;
        this.f10776a = euhVar;
    }

    public /* synthetic */ dfg(ixs ixsVar, int i) {
        this.f10777b = i;
        this.f10776a = ixsVar;
    }

    public /* synthetic */ dfg(AtomicReference atomicReference, int i) {
        this.f10777b = i;
        this.f10776a = atomicReference;
    }

    public /* synthetic */ dfg(jwy jwyVar, int i) {
        this.f10777b = i;
        this.f10776a = jwyVar;
    }

    public /* synthetic */ dfg(lby lbyVar, int i) {
        this.f10777b = i;
        this.f10776a = lbyVar;
    }

    public /* synthetic */ dfg(lji ljiVar, int i) {
        this.f10777b = i;
        this.f10776a = ljiVar;
    }

    public /* synthetic */ dfg(mrm mrmVar, int i) {
        this.f10777b = i;
        this.f10776a = mrmVar;
    }

    public /* synthetic */ dfg(nxl nxlVar, int i) {
        this.f10777b = i;
        this.f10776a = nxlVar;
    }

    public /* synthetic */ dfg(ohb ohbVar, int i) {
        this.f10777b = i;
        this.f10776a = ohbVar;
    }

    public /* synthetic */ dfg(oju ojuVar, int i) {
        this.f10777b = i;
        this.f10776a = ojuVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, lby] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, ohb] */
    /* JADX WARN: Type inference failed for: r0v6, types: [dhv, java.lang.Object] */
    @Override // p000.msi
    /* JADX INFO: renamed from: a */
    public final Object mo6051a() {
        switch (this.f10777b) {
            case 0:
                ?? r0 = this.f10776a;
                Pattern pattern = dfh.f10778a;
                String strMo6182j = r0.mo6182j(dig.f11486D);
                return strMo6182j != null ? msa.m16846b(',').m16849d(strMo6182j.toLowerCase(Locale.US)) : new ArrayList();
            case 1:
                return (Integer) this.f10776a.mo6173a(dib.f11225L).get();
            case 2:
                return Boolean.valueOf(((euh) this.f10776a).f20105c);
            case 3:
                return ((View) this.f10776a).getRootWindowInsets();
            case 4:
                return this.f10776a;
            case 5:
                return (hzp) ((AtomicReference) this.f10776a).get();
            case 6:
                return ((ShutterButton) this.f10776a).m4431xa95bd856();
            case 7:
                return ((View) this.f10776a).getRootWindowInsets();
            case 8:
                return Integer.valueOf(((ixs) this.f10776a).f32606b);
            case 9:
                return new jkn((Activity) this.f10776a);
            case 10:
                File file = new File(new File(((Context) this.f10776a).getFilesDir(), "wearos_assets"), "streamtmp");
                file.mkdirs();
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    for (File file2 : fileArrListFiles) {
                        file2.delete();
                    }
                }
                return file;
            case 11:
                return ((jwy) this.f10776a).f34974a;
            case 12:
                ?? r1 = this.f10776a;
                float[] fArr = ldg.f37978a;
                return kua.m14876o(lec.m15239e(r1, led.m15243a(ldg.f37978a), led.m15243a(ldg.f37979b)));
            case 13:
                return ((Context) this.f10776a).getSharedPreferences("primes", 0);
            case 14:
                return mws.m17103r(ned.f42088a, (Iterable) this.f10776a.get());
            case 15:
                return Long.valueOf(((kui) ((lji) this.f10776a).f38388f).m14891a().getTotalSpace() / 1024);
            case 16:
                return ((ljo) this.f10776a).get();
            case 17:
                return (SharedPreferences) ((mrm) this.f10776a).mo16809c();
            case 18:
                Object obj = this.f10776a;
                msi msiVar = ClearcutMetricSnapshotTransmitter.f7962a;
                return Boolean.valueOf(oir.f46122a.mo6051a().mo18561d((Context) obj));
            case 19:
                return Boolean.valueOf(oja.f46159a.mo6051a().mo18573c((Context) this.f10776a));
            default:
                return new liv(jok.m13408a((Context) this.f10776a));
        }
    }
}
