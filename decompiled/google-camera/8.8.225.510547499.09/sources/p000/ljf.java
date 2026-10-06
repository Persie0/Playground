package p000;

import android.content.ContentProvider;
import android.content.Context;
import android.content.UriMatcher;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.ArrayMap;
import androidx.work.impl.WorkDatabase;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.focusindicator.EyesFocusIndicatorRectView;
import com.google.android.apps.camera.focusindicator.FocusIndicatorAccessoryView;
import com.google.android.apps.camera.focusindicator.FocusIndicatorRingView;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ljf {

    /* JADX INFO: renamed from: a */
    public final Object f38369a;

    /* JADX INFO: renamed from: b */
    public final Object f38370b;

    /* JADX INFO: renamed from: c */
    public final Object f38371c;

    /* JADX INFO: renamed from: d */
    public final Object f38372d;

    /* JADX INFO: renamed from: e */
    public final Object f38373e;

    /* JADX INFO: renamed from: f */
    public final Object f38374f;

    /* JADX INFO: renamed from: g */
    public final Object f38375g;

    public ljf() {
        this.f38370b = new ini();
        this.f38371c = new ini();
        this.f38373e = new ini();
        this.f38369a = new ini();
        this.f38375g = new jfs((byte[]) null);
        this.f38374f = new jfs((byte[]) null);
        this.f38372d = new ini();
    }

    public ljf(ContentProvider contentProvider, Context context, glk glkVar, cwd cwdVar, dzx dzxVar, UriMatcher uriMatcher, kbz kbzVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f38373e = contentProvider;
        this.f38372d = context;
        this.f38374f = glkVar;
        this.f38370b = cwdVar;
        this.f38371c = dzxVar;
        this.f38375g = uriMatcher;
        this.f38369a = kbzVar;
    }

    public ljf(Context context, FocusIndicatorView focusIndicatorView) {
        this.f38373e = context;
        this.f38369a = focusIndicatorView;
        this.f38372d = context.getResources();
        this.f38371c = (FocusIndicatorRingView) focusIndicatorView.findViewById(C0100R.id.focus_indicator_ring);
        this.f38375g = (EyesFocusIndicatorRectView) focusIndicatorView.findViewById(C0100R.id.eyes_focus_indicator_rect);
        this.f38370b = (FocusIndicatorAccessoryView) focusIndicatorView.findViewById(C0100R.id.focus_lock_view);
        this.f38374f = (FocusIndicatorAccessoryView) focusIndicatorView.findViewById(C0100R.id.focus_taxi_view);
    }

    public ljf(Context context, elx elxVar, ffq ffqVar, jww jwwVar, jwl jwlVar, byte[] bArr, byte[] bArr2) {
        this.f38370b = new ArrayDeque();
        this.f38375g = elxVar;
        this.f38371c = jwwVar;
        this.f38372d = ffqVar;
        this.f38374f = jwlVar;
        this.f38373e = jpd.m13426g(true, 3000, null, null, context.getResources().getString(C0100R.string.thermal_flash_disabled_chip_text), context, false, -1, 12);
        this.f38369a = jpd.m13426g(false, 3000, null, null, context.getResources().getString(C0100R.string.long_shot_record_failed_text), context, false, -1, 12);
    }

    public ljf(fcp fcpVar, djm djmVar, crh crhVar, hnw hnwVar, csm csmVar, hlg hlgVar, djm djmVar2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f38374f = fcpVar;
        this.f38372d = djmVar;
        this.f38369a = crhVar;
        this.f38370b = hnwVar;
        this.f38373e = csmVar;
        this.f38371c = hlgVar;
        this.f38375g = djmVar2;
    }

    public ljf(jww jwwVar, jww jwwVar2, jww jwwVar3, har harVar, djm djmVar, hah hahVar, hai haiVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f38369a = jwwVar;
        this.f38373e = jwwVar2;
        this.f38375g = jwwVar3;
        this.f38371c = harVar;
        this.f38372d = djmVar;
        this.f38370b = hahVar;
        this.f38374f = haiVar;
    }

    public ljf(kfk kfkVar, kho khoVar, kgg kggVar, fzu fzuVar, ghg ghgVar, kbz kbzVar, gib gibVar) {
        this.f38375g = kfkVar;
        this.f38372d = khoVar;
        this.f38371c = kggVar;
        this.f38370b = fzuVar;
        this.f38373e = ghgVar;
        this.f38374f = kbzVar;
        this.f38369a = gibVar;
    }

    public ljf(kro kroVar, lhz lhzVar, kqj kqjVar, kqv kqvVar, Executor executor, kbz kbzVar, kbo kboVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f38374f = kroVar;
        this.f38369a = lhzVar;
        this.f38370b = kqjVar;
        this.f38372d = kqvVar;
        this.f38373e = executor;
        this.f38371c = kbzVar;
        this.f38375g = kboVar.mo6314a("MediaGroup");
    }

    public ljf(mrm mrmVar, kba kbaVar, kfk kfkVar, gtd gtdVar, kmd kmdVar, AtomicBoolean atomicBoolean, dhv dhvVar, byte[] bArr, byte[] bArr2) {
        this.f38369a = kbaVar;
        this.f38371c = mrmVar;
        this.f38374f = kfkVar;
        this.f38373e = gtdVar;
        this.f38375g = kmdVar;
        this.f38372d = atomicBoolean;
        this.f38370b = dhvVar;
    }

    public ljf(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, byte[] bArr) {
        this.f38370b = ojuVar;
        this.f38374f = ojuVar2;
        this.f38369a = ojuVar3;
        this.f38375g = ojuVar4;
        this.f38371c = ojuVar5;
        this.f38372d = ojuVar6;
        this.f38373e = ojuVar7;
    }

    public ljf(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, byte[] bArr, byte[] bArr2) {
        ojuVar.getClass();
        this.f38371c = ojuVar;
        ojuVar2.getClass();
        this.f38374f = ojuVar2;
        ojuVar3.getClass();
        this.f38370b = ojuVar3;
        ojuVar4.getClass();
        this.f38373e = ojuVar4;
        ojuVar5.getClass();
        this.f38375g = ojuVar5;
        ojuVar6.getClass();
        this.f38372d = ojuVar6;
        ojuVar7.getClass();
        this.f38369a = ojuVar7;
    }

    public ljf(C1064vg c1064vg, C1058va c1058va) {
        this.f38375g = this;
        this.f38374f = c1064vg;
        this.f38373e = c1058va;
        this.f38371c = ohh.m18486b(new C1060vc(c1064vg, this, 1, null, null, null, null, null));
        this.f38369a = new C1060vc(c1064vg, this, 7, null, null, null, null, null);
        this.f38370b = ohh.m18486b(new C1060vc(c1064vg, this, 2, null, null, null, null, null));
        this.f38372d = ohh.m18486b(new C1060vc(c1064vg, this, 0, null, null, null, null, null));
    }

    /* JADX INFO: renamed from: j */
    public static final void m15523j(ini iniVar, jfs jfsVar) {
        double d;
        double dM11513a = ini.m11513a(iniVar, iniVar);
        double dSqrt = Math.sqrt(dM11513a);
        double dCos = 0.5d;
        if (dM11513a < 1.0E-8d) {
            d = 1.0d - (dM11513a * 0.1666666716337204d);
        } else if (dM11513a < 1.0E-6d) {
            dCos = 0.5d - (0.0416666679084301d * dM11513a);
            double d2 = dM11513a * 0.1666666716337204d;
            d = 1.0d - (d2 * (1.0d - d2));
        } else {
            double d3 = 1.0d / dSqrt;
            double dSin = Math.sin(dSqrt) * d3;
            dCos = (1.0d - Math.cos(dSqrt)) * d3 * d3;
            d = dSin;
        }
        double d4 = iniVar.f31594a;
        double d5 = d4 * d4;
        double d6 = iniVar.f31595b;
        double d7 = d6 * d6;
        double d8 = iniVar.f31596c;
        double d9 = d8 * d8;
        jfsVar.m13102h(0, 0, 1.0d - ((d7 + d9) * dCos));
        jfsVar.m13102h(1, 1, 1.0d - ((d9 + d5) * dCos));
        jfsVar.m13102h(2, 2, 1.0d - ((d5 + d7) * dCos));
        double d10 = iniVar.f31596c * d;
        double d11 = iniVar.f31594a * iniVar.f31595b * dCos;
        jfsVar.m13102h(0, 1, d11 - d10);
        jfsVar.m13102h(1, 0, d11 + d10);
        double d12 = iniVar.f31595b * d;
        double d13 = iniVar.f31594a * iniVar.f31596c * dCos;
        jfsVar.m13102h(0, 2, d13 + d12);
        jfsVar.m13102h(2, 0, d13 - d12);
        double d14 = d * iniVar.f31594a;
        double d15 = dCos * iniVar.f31595b * iniVar.f31596c;
        jfsVar.m13102h(1, 2, d15 - d14);
        jfsVar.m13102h(2, 1, d15 + d14);
    }

    /* JADX INFO: renamed from: n */
    public static int m15524n(ikw ikwVar, boolean z) {
        cxk cxkVar = cxk.OFF;
        jzf jzfVar = jzf.VIDEO_BUFFER_DELAY;
        ikw ikwVar2 = ikw.UNINITIALIZED;
        switch (ikwVar.ordinal()) {
            case 2:
                return z ? 10 : 9;
            case 5:
                return z ? 33 : 24;
            case 8:
                return 21;
            case 13:
                return z ? 34 : 11;
            case 19:
                return z ? 38 : 37;
            default:
                throw new IllegalArgumentException("Not a valid video mode: ".concat(String.valueOf(String.valueOf(ikwVar))));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object, nom] */
    /* JADX WARN: Type inference failed for: r4v28, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX INFO: renamed from: a */
    public final synchronized ltp m15525a(ltj ltjVar) {
        ltp ltpVar;
        Uri uri = ltjVar.f39165a;
        ltpVar = (ltp) this.f38370b.get(uri);
        boolean z = true;
        if (ltpVar == null) {
            Uri uri2 = ltjVar.f39165a;
            lku.m15607B(uri2.isHierarchical(), "Uri must be hierarchical: %s", uri2);
            String strM16831a = mro.m16831a(uri2.getLastPathSegment());
            int iLastIndexOf = strM16831a.lastIndexOf(46);
            lku.m15607B((iLastIndexOf == -1 ? "" : strM16831a.substring(iLastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", uri2);
            lku.m15670x(ltjVar.f39166b != null, "Proto schema cannot be null");
            lku.m15670x(ltjVar.f39167c != null, "Handler cannot be null");
            ltr ltrVar = (ltr) this.f38372d.get("singleproc");
            if (ltrVar == 0) {
                z = false;
            }
            lku.m15607B(z, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
            String strM16831a2 = mro.m16831a(ltjVar.f39165a.getLastPathSegment());
            int iLastIndexOf2 = strM16831a2.lastIndexOf(46);
            if (iLastIndexOf2 != -1) {
                strM16831a2 = strM16831a2.substring(0, iLastIndexOf2);
            }
            ltp ltpVar2 = new ltp(ltrVar.mo15972a(ltjVar, strM16831a2, this.f38371c, (C1058va) this.f38373e), nod.m17554j(kxk.m14965K(ltjVar.f39165a), this.f38369a, not.INSTANCE));
            mws mwsVar = ltjVar.f39168d;
            if (!mwsVar.isEmpty()) {
                ltpVar2.m15979c(new lth(mwsVar, this.f38371c));
            }
            this.f38370b.put(uri, ltpVar2);
            this.f38374f.put(uri, ltjVar);
            ltpVar = ltpVar2;
        } else {
            ltj ltjVar2 = (ltj) this.f38374f.get(uri);
            if (!ltjVar.equals(ltjVar2)) {
                String strM15665s = lku.m15665s("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", ltjVar.f39166b.getClass().getSimpleName(), ltjVar.f39165a);
                lku.m15607B(ltjVar.f39165a.equals(ltjVar2.f39165a), strM15665s, "uri");
                lku.m15607B(ltjVar.f39166b.equals(ltjVar2.f39166b), strM15665s, "schema");
                lku.m15607B(ltjVar.f39167c.equals(ltjVar2.f39167c), strM15665s, "handler");
                lku.m15607B(mkv.m16505M(ltjVar.f39168d, ltjVar2.f39168d), strM15665s, "migrations");
                lku.m15607B(ltjVar.f39170f.equals(ltjVar2.f39170f), strM15665s, "variantConfig");
                lku.m15607B(ltjVar.f39169e == ltjVar2.f39169e, strM15665s, "useGeneratedExtensionRegistry");
                lku.m15607B(true, strM15665s, "enableTracing");
                throw new IllegalArgumentException(lku.m15665s(strM15665s, "unknown"));
            }
        }
        return ltpVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, oju] */
    /* JADX INFO: renamed from: b */
    public final mbl m15526b(Executor executor, ohb ohbVar, oju ojuVar) {
        ljd ljdVar = (ljd) this.f38369a.get();
        ljdVar.getClass();
        ?? r3 = this.f38370b;
        lha lhaVar = (lha) this.f38371c.get();
        lhaVar.getClass();
        Object obj = this.f38372d.get();
        ?? r6 = this.f38373e;
        mrm mrmVar = (mrm) ((ohj) this.f38374f).f46012a;
        mrm mrmVar2 = (mrm) ((ohj) this.f38375g).f46012a;
        executor.getClass();
        ohbVar.getClass();
        return new mbl(ljdVar, r3, lhaVar, (lie) obj, r6, mrmVar, mrmVar2, executor, ohbVar, ojuVar, null, null);
    }

    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, kbo] */
    /* JADX INFO: renamed from: c */
    public final void m15527c(krn krnVar, lhz lhzVar, kqm kqmVar, kqe kqeVar) {
        String str;
        String str2;
        Object obj = this.f38369a;
        krd krdVarM14742a = krd.m14742a(kqeVar.f36838e.mo14768i().f37089e);
        StringBuilder sb = new StringBuilder();
        if (krdVarM14742a.m14743b()) {
            str = ((kqv) ((lhz) obj).f38277a).f36957b;
        } else {
            str = krdVarM14742a.m14744c() ? ((kqv) ((lhz) obj).f38277a).f36958c : ((kqv) ((lhz) obj).f38277a).f36956a;
        }
        sb.append(str);
        Date date = new Date(kqmVar.f36886b);
        lhz lhzVar2 = (lhz) obj;
        DateFormat dateFormat = ((kqv) lhzVar2.f38277a).f36966k;
        synchronized (dateFormat) {
            str2 = dateFormat.format(date);
        }
        sb.append(str2);
        if (!kqmVar.f36887c.isEmpty()) {
            sb.append(".");
            sb.append(kqmVar.f36887c);
        }
        Integer num = (Integer) ((ArrayMap) lhzVar.f38277a).get(kqeVar);
        int iIntValue = num == null ? 0 : num.intValue();
        if (iIntValue > 0) {
            String strM15666t = lku.m15666t(Integer.toString(iIntValue), ((kqv) lhzVar2.f38277a).f36962g);
            if (!((kqv) lhzVar2.f38277a).f36964i || kqmVar.f36887c.isEmpty()) {
                sb.append(".");
                sb.append(((kqv) lhzVar2.f38277a).f36960e);
                sb.append(strM15666t);
            } else {
                sb.append("-");
                sb.append(strM15666t);
            }
        }
        if (!kqeVar.f36836c.isEmpty()) {
            sb.append(".");
            sb.append(kqeVar.f36836c);
        }
        if (kqmVar.f36889e.size() > 1 && iIntValue > 0 && kqeVar == kqmVar.f36888d) {
            sb.append(".");
            sb.append(((kqv) lhzVar2.f38277a).f36961f);
        }
        String string = sb.toString();
        krt krtVarMo14768i = kqeVar.f36838e.mo14768i();
        this.f38375g.mo13940b("Renaming " + krtVarMo14768i.m14785c() + " to " + string + " based on info: " + kqmVar.toString());
        krnVar.mo14747b(kqeVar.f36838e, krt.m14783a(krtVarMo14768i.f37085a, krtVarMo14768i.f37086b, string, krtVarMo14768i.f37088d, krtVarMo14768i.f37089e), kqeVar.f36837d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [hah, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v14, types: [hai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v6, types: [hai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [hai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r1v1, types: [hah, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [hah, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [hah, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [hah, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [hah, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [hah, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [hah, java.lang.Object] */
    /* JADX INFO: renamed from: d */
    public final void m15528d() {
        if (((Boolean) this.f38370b.mo10031c(gzy.f27010V)).booleanValue()) {
            this.f38374f.mo10033e(gzy.f27010V, false);
        }
        this.f38369a.mo3415bf((Boolean) this.f38370b.mo10031c(gzy.f27012X));
        this.f38373e.mo3415bf((String) this.f38370b.mo10031c(gzy.f27013Y));
        this.f38374f.mo10033e(gzy.f27040ax, (Integer) this.f38370b.mo10031c(gzy.f27014Z));
        this.f38374f.mo10033e(gzy.f26990B, (Boolean) this.f38370b.mo10031c(gzy.f27017aa));
        this.f38375g.mo3415bf((Boolean) this.f38370b.mo10031c(gzy.f27018ab));
        ((jxd) this.f38371c).mo3415bf(gzr.m10020a((String) this.f38370b.mo10031c(gzy.f27019ac)));
        ((djm) this.f38372d).f11787a.mo3415bf(gzm.m10017a((String) this.f38370b.mo10031c(gzy.f27020ad)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [hah, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [hai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v13, types: [hai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [hai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v21, types: [hai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [hai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [hai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [hai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [hai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [hai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [hai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r3v6, types: [hah, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [hah, java.lang.Object] */
    /* JADX INFO: renamed from: e */
    public final void m15529e() {
        if (!((Boolean) this.f38370b.mo10031c(gzy.f27010V)).booleanValue()) {
            this.f38374f.mo10033e(gzy.f27010V, true);
        }
        this.f38374f.mo10033e(gzy.f27012X, (Boolean) this.f38369a.mo3831be());
        this.f38374f.mo10033e(gzy.f27013Y, (String) this.f38373e.mo3831be());
        this.f38374f.mo10033e(gzy.f27014Z, (Integer) this.f38370b.mo10031c(gzy.f27040ax));
        this.f38374f.mo10033e(gzy.f27017aa, (Boolean) this.f38370b.mo10031c(gzy.f26990B));
        this.f38374f.mo10033e(gzy.f27018ab, (Boolean) this.f38375g.mo3831be());
        this.f38374f.mo10033e(gzy.f27019ac, ((gzr) ((jxd) this.f38371c).mo3831be()).name());
        this.f38374f.mo10033e(gzy.f27020ad, ((gzm) ((djm) this.f38372d).f11787a.mo3831be()).name());
        this.f38369a.mo3415bf(false);
        this.f38373e.mo3415bf("medium");
        this.f38374f.mo10033e(gzy.f27040ax, 0);
        this.f38374f.mo10033e(gzy.f26990B, true);
        this.f38375g.mo3415bf(false);
        ((jxd) this.f38371c).mo3415bf(gzr.RES_1080P);
        ((djm) this.f38372d).f11787a.mo3415bf(gzm.FPS_30);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [hai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [hah, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [hah, java.lang.Object] */
    /* JADX INFO: renamed from: f */
    public final void m15530f(hmq hmqVar) {
        if (hmqVar.f28352b >= 1000000000 && ((Boolean) this.f38370b.mo10031c(gzy.f27010V)).booleanValue() && ((Boolean) this.f38370b.mo10031c(gzy.f27011W)).booleanValue()) {
            m15528d();
        }
        this.f38374f.mo10033e(gzy.f27011W, Boolean.valueOf(hmqVar.f28352b < 1000000000));
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kfk] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kgg] */
    /* JADX WARN: Type inference failed for: r7v0, types: [fzu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [gib, java.lang.Object] */
    /* JADX INFO: renamed from: g */
    public final gbi m15531g() {
        kgd kgdVarM14187a = kge.m14187a();
        kgdVarM14187a.m14183b(3);
        kgdVarM14187a.m14184c(4);
        kgdVarM14187a.m14186e(1);
        kgdVarM14187a.m14185d(true);
        kge kgeVarM14182a = kgdVarM14187a.m14182a();
        ?? r4 = this.f38375g;
        ?? r5 = this.f38371c;
        Object obj = this.f38372d;
        return new gbe(new gix(r4, r5, (kho) obj, this.f38370b, 1, this.f38369a, (ghg) this.f38373e, kgeVarM14182a, this.f38374f), 3, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kba] */
    /* JADX WARN: Type inference failed for: r0v4, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kmd] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kfk] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kmd] */
    /* JADX INFO: renamed from: h */
    public final void m15532h() {
        this.f38369a.close();
        ((AtomicBoolean) this.f38372d).set(false);
        if (gtd.m9733e() && this.f38370b.mo6184l(dil.f11624j) && this.f38375g.mo14558k().equals(kmq.BACK)) {
            HashSet hashSet = new HashSet();
            hashSet.add(kgq.m14215e(ivv.f32394c, true));
            hashSet.add(kgq.m14215e(ivv.f32393b, Integer.valueOf(((gtd) this.f38373e).m9740d(this.f38375g))));
            this.f38374f.mo14123j(hashSet);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m15533i(ini iniVar, ini iniVar2, jfs jfsVar) {
        jfsVar.m13105k();
        ini.m11514c(iniVar, iniVar2, (ini) this.f38371c);
        if (((ini) this.f38371c).m11515b() == 0.0d) {
            return;
        }
        ((ini) this.f38373e).m11518f(iniVar);
        ((ini) this.f38369a).m11518f(iniVar2);
        ((ini) this.f38371c).m11516d();
        ((ini) this.f38373e).m11516d();
        ((ini) this.f38369a).m11516d();
        jfs jfsVar2 = (jfs) this.f38375g;
        jfsVar2.m13104j(0, (ini) this.f38373e);
        jfsVar2.m13104j(1, (ini) this.f38371c);
        Object obj = this.f38371c;
        ini iniVar3 = (ini) obj;
        ini.m11514c(iniVar3, (ini) this.f38373e, (ini) this.f38370b);
        jfsVar2.m13104j(2, (ini) this.f38370b);
        jfs jfsVar3 = (jfs) this.f38374f;
        jfsVar3.m13104j(0, (ini) this.f38369a);
        jfsVar3.m13104j(1, (ini) this.f38371c);
        Object obj2 = this.f38371c;
        ini iniVar4 = (ini) obj2;
        ini.m11514c(iniVar4, (ini) this.f38369a, (ini) this.f38370b);
        jfsVar3.m13104j(2, (ini) this.f38370b);
        double[] dArr = (double[]) jfsVar2.f33914a;
        double d = dArr[1];
        dArr[1] = dArr[3];
        dArr[3] = d;
        double d2 = dArr[2];
        dArr[2] = dArr[6];
        dArr[6] = d2;
        double d3 = dArr[5];
        dArr[5] = dArr[7];
        dArr[7] = d3;
        jfs.m13068q(jfsVar3, jfsVar2, jfsVar);
    }

    /* JADX INFO: renamed from: k */
    public final ParcelFileDescriptor m15534k(Uri uri, int i) throws Throwable {
        Bitmap bitmapCreateBitmap;
        ParcelFileDescriptor parcelFileDescriptor;
        int i2 = Integer.parseInt(uri.getPathSegments().get(1));
        Object obj = this.f38370b;
        int dimensionPixelSize = ((Context) this.f38372d).getResources().getDimensionPixelSize(i);
        BufferedOutputStream bufferedOutputStream = null;
        Drawable drawable = ((Context) ((cwd) obj).f9866a).getResources().getDrawable(i2, null);
        if (drawable == null) {
            throw new FileNotFoundException("resource is not found for " + i2);
        }
        if (drawable instanceof BitmapDrawable) {
            bitmapCreateBitmap = ((BitmapDrawable) drawable).getBitmap();
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
        }
        bitmapCreateBitmap.getClass();
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, dimensionPixelSize, dimensionPixelSize, false);
        if (i == C0100R.dimen.photos_oemapi_dialog_icon_size) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateScaledBitmap.getWidth(), bitmapCreateScaledBitmap.getHeight(), bitmapCreateScaledBitmap.getConfig());
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            Paint paint = new Paint();
            paint.setColorFilter(new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
            canvas2.drawBitmap(bitmapCreateScaledBitmap, 0.0f, 0.0f, paint);
            bitmapCreateScaledBitmap = bitmapCreateBitmap2;
        }
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        try {
            ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
            ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptorArrCreatePipe[0];
            parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[1];
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(parcelFileDescriptor.getFileDescriptor()));
                try {
                    bitmapCreateScaledBitmap.compress(compressFormat, 100, bufferedOutputStream2);
                    bufferedOutputStream2.close();
                    try {
                        bufferedOutputStream2.close();
                    } catch (IOException e) {
                    }
                    if (parcelFileDescriptor != null) {
                        try {
                            parcelFileDescriptor.close();
                        } catch (IOException e2) {
                        }
                    }
                    return parcelFileDescriptor2;
                } catch (IOException e3) {
                    e = e3;
                    bufferedOutputStream = bufferedOutputStream2;
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException e4) {
                            e = e4;
                        }
                    }
                    if (parcelFileDescriptor != null) {
                        try {
                            parcelFileDescriptor.close();
                        } catch (IOException e5) {
                            e = e5;
                        }
                    }
                    String message = e.getMessage();
                    if (message != null) {
                        throw new FileNotFoundException(message);
                    }
                    throw new FileNotFoundException();
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream = bufferedOutputStream2;
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException e6) {
                        }
                    }
                    if (parcelFileDescriptor == null) {
                        throw th;
                    }
                    try {
                        parcelFileDescriptor.close();
                        throw th;
                    } catch (IOException e7) {
                        throw th;
                    }
                }
            } catch (IOException e8) {
                e = e8;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e9) {
            e = e9;
            parcelFileDescriptor = null;
        } catch (Throwable th3) {
            th = th3;
            parcelFileDescriptor = null;
        }
    }

    /* JADX WARN: Type inference failed for: r13v10, types: [crh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v19, types: [hnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [fcp, java.lang.Object] */
    /* JADX INFO: renamed from: l */
    public final void m15535l(Throwable th, kmq kmqVar) {
        int i;
        if (th instanceof TimeoutException) {
            i = 3;
        } else if (th instanceof IllegalStateException) {
            i = 4;
        } else {
            i = th instanceof IOException ? 5 : 1;
        }
        csl cslVarM5464a = ((csm) this.f38373e).m5464a();
        nxl nxlVarM18137O = nmj.f43826g.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nmj nmjVar = (nmj) nxlVarM18137O.f44974b;
        nmjVar.f43832e = i - 1;
        nmjVar.f43828a |= 8;
        this.f38374f.mo8178aw(m15524n(this.f38369a.mo5395a(), true), kmqVar, null, ((Float) cslVarM5464a.f9272b.mo3831be()).floatValue(), ((Boolean) ((jwf) cslVarM5464a.f9276f).f34942d).booleanValue(), -1.0f, (nmj) nxlVarM18137O.mo18103l(), this.f38370b.mo10518e().f28545j, false);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [crh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11, types: [hnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [fcp, java.lang.Object] */
    /* JADX INFO: renamed from: m */
    public final void m15536m(cti ctiVar, kmq kmqVar) {
        csl cslVarM5464a = ((csm) this.f38373e).m5464a();
        nxl nxlVarM18137O = nmj.f43826g.m18137O();
        int i = ctiVar.f9442e.f35518b;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nmj nmjVar = (nmj) nxqVar;
        nmjVar.f43828a |= 1;
        nmjVar.f43829b = i;
        int i2 = ctiVar.f9442e.f35517a;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar2 = nxlVarM18137O.f44974b;
        nmj nmjVar2 = (nmj) nxqVar2;
        nmjVar2.f43828a |= 2;
        nmjVar2.f43830c = i2;
        int i3 = ctiVar.f9444g;
        if (!nxqVar2.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar3 = nxlVarM18137O.f44974b;
        nmj nmjVar3 = (nmj) nxqVar3;
        nmjVar3.f43828a |= 4;
        nmjVar3.f43831d = i3;
        if (!nxqVar3.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar4 = nxlVarM18137O.f44974b;
        nmj nmjVar4 = (nmj) nxqVar4;
        nmjVar4.f43832e = 1;
        nmjVar4.f43828a |= 8;
        int i4 = (int) ctiVar.f9443f;
        if (!nxqVar4.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nmj nmjVar5 = (nmj) nxlVarM18137O.f44974b;
        nmjVar5.f43828a |= 16;
        nmjVar5.f43833f = i4;
        nmj nmjVar6 = (nmj) nxlVarM18137O.mo18103l();
        ?? r9 = this.f38374f;
        int iM15524n = m15524n(this.f38369a.mo5395a(), true);
        ctiVar.f9439b.getName();
        r9.mo8178aw(iM15524n, kmqVar, ctiVar.f9438a, ((Float) cslVarM5464a.f9272b.mo3831be()).floatValue(), ((Boolean) ((jwf) cslVarM5464a.f9276f).f34942d).booleanValue(), ctiVar.f9443f / 1000, nmjVar6, this.f38370b.mo10518e().f28545j, ctiVar.f9441d.f26853b == gyx.MARS_STORE);
    }

    /* JADX INFO: renamed from: o */
    public final synchronized void m15537o(bsr bsrVar, bqn bqnVar) {
        ((dsx) this.f38374f).m6684H(bqnVar, bsrVar);
    }

    /* JADX INFO: renamed from: p */
    public final synchronized void m15538p(bsr bsrVar, bqn bqnVar, bst bstVar) {
        if (bstVar != null) {
            if (bstVar.f4377a) {
                ((brw) this.f38373e).m2962b(bqnVar, bstVar);
            }
        }
        ((dsx) this.f38374f).m6684H(bqnVar, bsrVar);
    }

    public ljf(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7) {
        ojuVar.getClass();
        this.f38369a = ojuVar;
        ojuVar2.getClass();
        this.f38370b = ojuVar2;
        ojuVar3.getClass();
        this.f38371c = ojuVar3;
        ojuVar4.getClass();
        this.f38372d = ojuVar4;
        ojuVar5.getClass();
        this.f38373e = ojuVar5;
        ojuVar6.getClass();
        this.f38374f = ojuVar6;
        ojuVar7.getClass();
        this.f38375g = ojuVar7;
    }

    public ljf(Context context, axp axpVar, C1058va c1058va, bbp bbpVar, WorkDatabase workDatabase, bcv bcvVar, List list, byte[] bArr) {
        new C0159ek(null);
        this.f38373e = context.getApplicationContext();
        this.f38371c = c1058va;
        this.f38369a = bbpVar;
        this.f38375g = axpVar;
        this.f38374f = workDatabase;
        this.f38372d = bcvVar;
        this.f38370b = list;
    }

    public ljf(bub bubVar, bkn bknVar, buj bujVar, buj bujVar2, buj bujVar3, byte[] bArr, byte[] bArr2) {
        this.f38371c = bubVar;
        bsm bsmVar = new bsm(bknVar, null, null);
        this.f38370b = bsmVar;
        brw brwVar = new brw();
        this.f38373e = brwVar;
        synchronized (this) {
            synchronized (brwVar) {
            }
        }
        this.f38374f = new dsx((byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
        this.f38369a = new dfn(bujVar, bujVar2, bujVar3, this, this, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
        this.f38375g = new ilo(bsmVar);
        this.f38372d = new kbh();
        bubVar.f4471a = this;
    }

    public ljf(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, char[] cArr) {
        ojuVar.getClass();
        this.f38374f = ojuVar;
        ojuVar2.getClass();
        this.f38370b = ojuVar2;
        ojuVar3.getClass();
        this.f38369a = ojuVar3;
        ojuVar4.getClass();
        this.f38371c = ojuVar4;
        ojuVar5.getClass();
        this.f38372d = ojuVar5;
        ojuVar6.getClass();
        this.f38375g = ojuVar6;
        ojuVar7.getClass();
        this.f38373e = ojuVar7;
    }

    public ljf(Executor executor, C1058va c1058va, ltv ltvVar, Map map, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f38370b = new HashMap();
        this.f38374f = new HashMap();
        executor.getClass();
        this.f38371c = executor;
        c1058va.getClass();
        this.f38373e = c1058va;
        this.f38375g = ltvVar;
        this.f38372d = map;
        lku.m15669w(!map.isEmpty());
        this.f38369a = etv.f19883h;
    }

    public ljf(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        ojuVar.getClass();
        this.f38369a = ojuVar;
        this.f38371c = ojuVar2;
        ojuVar3.getClass();
        this.f38374f = ojuVar3;
        ojuVar4.getClass();
        this.f38373e = ojuVar4;
        ojuVar5.getClass();
        this.f38375g = ojuVar5;
        ojuVar6.getClass();
        this.f38370b = ojuVar6;
        ojuVar7.getClass();
        this.f38372d = ojuVar7;
    }

    public ljf(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, char[] cArr, byte[] bArr) {
        ojuVar.getClass();
        this.f38374f = ojuVar;
        this.f38375g = ojuVar2;
        ojuVar3.getClass();
        this.f38372d = ojuVar3;
        ojuVar4.getClass();
        this.f38373e = ojuVar4;
        ojuVar5.getClass();
        this.f38371c = ojuVar5;
        ojuVar6.getClass();
        this.f38369a = ojuVar6;
        ojuVar7.getClass();
        this.f38370b = ojuVar7;
    }
}
