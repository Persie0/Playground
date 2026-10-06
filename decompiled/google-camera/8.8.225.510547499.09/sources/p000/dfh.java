package p000;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.libraries.barhopper.Barcode;
import java.util.regex.Pattern;
import p021j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dfh {

    /* JADX INFO: renamed from: a */
    public static final Pattern f10778a = Pattern.compile("MT:[A-Z0-9.-]{19,}((\\*[A-Z0-9.-]{19,})+)?");

    /* JADX INFO: renamed from: g */
    private static final nbh f10779g = nbh.m17259h("com/google/android/apps/camera/cameravisionkit/SpecialBarcodeProcessor");

    /* JADX INFO: renamed from: b */
    public final msi f10780b;

    /* JADX INFO: renamed from: c */
    public final Context f10781c;

    /* JADX INFO: renamed from: d */
    public int f10782d;

    /* JADX INFO: renamed from: e */
    public int f10783e;

    /* JADX INFO: renamed from: f */
    public oyo f10784f;

    /* JADX INFO: renamed from: h */
    private final dsx f10785h;

    public dfh(Context context, dsx dsxVar, dhv dhvVar, byte[] bArr, byte[] bArr2) {
        this.f10781c = context;
        this.f10785h = dsxVar;
        this.f10780b = lku.m15663q(new dfg(dhvVar, 0));
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m6052a(String str) {
        try {
            this.f10781c.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).setPackage("com.google.android.gms"));
        } catch (ActivityNotFoundException e) {
            ((nbe) ((nbe) ((nbe) f10779g.m17251b()).mo17283h(e)).mo17276G((char) 858)).mo17290o("Supporting Play Services version not available");
            this.f10785h.m6700o();
        }
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m6053b(String str) {
        try {
            this.f10781c.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e) {
            ((nbe) ((nbe) ((nbe) f10779g.m17251b()).mo17283h(e)).mo17276G((char) 859)).mo17290o("Application to handle intent was not found on device");
            this.f10785h.m6700o();
        }
    }

    /* JADX INFO: renamed from: c */
    public final deb m6054c(luz luzVar, long j, String str, Runnable runnable, Optional optional) {
        dea deaVarM5974a = deb.m5974a();
        deaVarM5974a.f10618a = str;
        deaVarM5974a.f10619b = runnable;
        deaVarM5974a.m5972f(j);
        deaVarM5974a.f10622e = 2;
        deaVarM5974a.m5971e(true);
        deaVarM5974a.f10623f = 2;
        deaVarM5974a.m5973g(SystemClock.elapsedRealtime());
        deaVarM5974a.m5970d(dez.m6041k(luzVar.mo16036A(), this.f10784f, this.f10782d, this.f10783e));
        optional.ifPresent(new dco(deaVarM5974a, 4));
        if (luzVar.mo16041d().mo16813g()) {
            deaVarM5974a.m5968b(((Barcode) luzVar.mo16041d().mo16809c()).format);
            deaVarM5974a.m5969c(((Barcode) luzVar.mo16041d().mo16809c()).valueFormat);
            deaVarM5974a.m5971e(((Barcode) luzVar.mo16041d().mo16809c()).format == 256);
        }
        return deaVarM5974a.m5967a();
    }
}
