package p000;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.util.ArrayMap;
import android.util.Log;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.legacy.lightcycle.storage.LocalSessionStorage;
import com.google.android.libraries.lens.lenslite.api.KeyguardDismisser;
import com.google.android.libraries.lens.lenslite.api.LinkChipResult;
import com.google.android.libraries.lens.lenslite.api.LinkConfig;
import com.google.android.libraries.lens.lenslite.api.LinkEventListener;
import com.google.android.libraries.lens.lenslite.dynamicloading.ApiVersion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fya {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f23857a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f23858b;

    public /* synthetic */ fya(bkn bknVar, dvg dvgVar, byte[] bArr, byte[] bArr2) {
        this.f23857a = bknVar;
        this.f23858b = dvgVar;
    }

    public /* synthetic */ fya(eem eemVar, nsp nspVar) {
        this.f23858b = eemVar;
        this.f23857a = nspVar;
    }

    public /* synthetic */ fya(ezi eziVar, hew hewVar) {
        this.f23858b = eziVar;
        this.f23857a = hewVar;
    }

    public fya(foc focVar, LocalSessionStorage localSessionStorage) {
        this.f23857a = focVar;
        this.f23858b = localSessionStorage;
    }

    public fya(fyb fybVar, fzt fztVar) {
        this.f23858b = fybVar;
        this.f23857a = fztVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [hew, java.lang.Object] */
    /* JADX INFO: renamed from: a */
    public final void m8945a(final hzw hzwVar) {
        Object obj = this.f23858b;
        final ?? r1 = this.f23857a;
        final ezi eziVar = (ezi) obj;
        eziVar.f21048d.execute(new Runnable() { // from class: ezb
            /* JADX WARN: Code duplicated, block: B:23:0x008f  */
            /* JADX WARN: Type inference failed for: r0v107, types: [com.google.android.libraries.lens.lenslite.dynamicloading.DLEngineApi, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v89, types: [com.google.android.libraries.lens.lenslite.dynamicloading.DLEngineApi, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v92, types: [com.google.android.libraries.lens.lenslite.dynamicloading.DLEngineApi, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v94, types: [com.google.android.libraries.lens.lenslite.dynamicloading.DLEngineApi, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v98, types: [com.google.android.libraries.lens.lenslite.dynamicloading.DLEngineApi, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v13, types: [com.google.android.libraries.lens.lenslite.dynamicloading.DLEngineApi, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                int i;
                boolean z;
                boolean z2;
                boolean zM5643y;
                final ezi eziVar2 = eziVar;
                hzw hzwVar2 = hzwVar;
                final hew hewVar = r1;
                final LinkConfig.Builder builder = LinkConfig.builder();
                kvr kvrVar = (kvr) builder;
                kvrVar.f37414q = 2;
                kvrVar.f37407j = 10;
                if (eziVar2.f21047c.mo6184l(dig.f11493g)) {
                    i = 1;
                } else {
                    eziVar2.f21047c.mo6177e();
                    i = 0;
                }
                kvrVar.f37404g = Integer.valueOf(i ^ 1);
                kvrVar.f37410m = true;
                kvrVar.f37412o = Boolean.valueOf(eziVar2.f21047c.mo6184l(dig.f11495i) && hzwVar2.f30099a);
                kvrVar.f37403f = hzwVar2.f30100b;
                if (eziVar2.f21047c.mo6184l(dig.f11496j)) {
                    kwt kwtVarM8062c = eziVar2.m8062c();
                    if (kwtVarM8062c == kwt.PLAYGROUND_ONLY) {
                        zM5643y = cwd.m5643y(eziVar2.f21041A.m5676x(), 2, 10);
                    } else if (kwtVarM8062c == kwt.ARCORE_ONLY) {
                        zM5643y = cwd.m5643y(eziVar2.f21041A.m5675w("com.google.ar.core"), 1, 18);
                    } else {
                        z = false;
                    }
                    z = zM5643y;
                } else {
                    z = false;
                }
                kvrVar.f37391B = Boolean.valueOf(z);
                kvrVar.f37392C = Boolean.valueOf(eziVar2.f21047c.mo6184l(dig.f11500n));
                kvrVar.f37398a = Boolean.valueOf(eziVar2.f21047c.mo6184l(dig.f11494h));
                if (eziVar2.f21047c.mo6184l(dig.f11483A)) {
                    z2 = eziVar2.m8066g();
                } else {
                    eziVar2.f21047c.mo6177e();
                    z2 = false;
                }
                kvrVar.f37417t = Boolean.valueOf(!z2);
                kvrVar.f37408k = Boolean.valueOf(eziVar2.f21047c.mo6184l(dig.f11497k));
                kvrVar.f37400c = Boolean.valueOf(eziVar2.f21052h);
                kvrVar.f37409l = eziVar2.f21054j.mo6082br();
                kvrVar.f37393D = Boolean.valueOf(eziVar2.f21051g);
                kvrVar.f37411n = true;
                kvrVar.f37413p = true;
                builder.mo4698a(eziVar2.m8062c());
                kvrVar.f37415r = Boolean.valueOf(eziVar2.m8062c() == kwt.ARCORE_ONLY);
                kvrVar.f37420w = Long.valueOf(eziVar2.f21047c.mo6173a(dig.f11488b).isPresent() ? ((Integer) eziVar2.f21047c.mo6173a(dig.f11488b).get()).intValue() : 0L);
                try {
                    Context context = eziVar2.f21045a;
                    kvt kvtVar = new kvt() { // from class: ezd
                        @Override // p000.kvt
                        /* JADX INFO: renamed from: a */
                        public final LinkConfig mo8060a() {
                            return builder.build();
                        }
                    };
                    Context applicationContext = context.getApplicationContext();
                    applicationContext.getClass();
                    lkm.m15599z(applicationContext, Context.class);
                    lkm.m15599z(kvtVar, kvt.class);
                    ohi ohiVarM18487a = ohj.m18487a(applicationContext);
                    kib kibVar = new kib(ohj.m18487a(kvtVar), 11);
                    ohi ohiVar = ohm.f46015a;
                    List listM15562C = lkm.m15562C(1);
                    List listM15562C2 = lkm.m15562C(0);
                    lkm.m15598y(kibVar, listM15562C);
                    ohm ohmVarM15596w = lkm.m15596w(listM15562C, listM15562C2);
                    String[] strArr = kwr.f37526a;
                    kwp kwpVar = new kwp(applicationContext, new lpe(ohiVarM18487a, ohmVarM15596w), kvtVar, null, null, null);
                    ArrayList arrayList = new ArrayList();
                    kwt kwtVar = ((kvs) kvtVar.mo8060a()).f37431a;
                    mrm mrmVarM16829i = mqu.f41450a;
                    if (kwtVar == kwt.ARCORE_ONLY) {
                        Collections.addAll(arrayList, kwr.f37526a);
                        arrayList.add("com.google.ar.core");
                    } else if (kwtVar == kwt.PLAYGROUND_ONLY) {
                        Collections.addAll(arrayList, kwr.f37526a);
                        arrayList.add("com.google.vr.apps.ornament");
                    } else if (kwtVar == kwt.ENABLED) {
                        Collections.addAll(arrayList, kwr.f37526a);
                        arrayList.add("com.google.vr.apps.ornament");
                        arrayList.add("com.google.ar.core");
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                Log.w("EngineApiLoaderContr", "All remote package attempts fail.");
                                mrmVarM16829i = mqu.f41450a;
                                break;
                            }
                            String str = (String) it.next();
                            try {
                                try {
                                    mrm mrmVarM16829i2 = mrm.m16829i(kwq.m14948a(kwpVar.mo14947a(str), str));
                                    String.format("EngineApi loaded from %s", str);
                                    mrmVarM16829i = mrmVarM16829i2;
                                    break;
                                } catch (kwn e) {
                                    String.format("No package found: %s.", str);
                                }
                            } catch (kwm e2) {
                                String.format("Failed to load engine api from remote package: %1$s. %2$s. ", str, e2.getMessage());
                            }
                        }
                    }
                    if (!mrmVarM16829i.mo16813g()) {
                        try {
                            mrmVarM16829i = mrm.m16829i(kwq.m14948a(kwpVar.mo14947a(applicationContext.getPackageName()), applicationContext.getPackageName()));
                        } catch (kwm e3) {
                        }
                    }
                    if (!mrmVarM16829i.mo16813g()) {
                        Log.w("EngineApiLoaderContr", "EngineApi implementation not found");
                    }
                    if (!mrmVarM16829i.mo16813g()) {
                        throw new RuntimeException("No engine implementation found");
                    }
                    eziVar2.f21043C = new C1058va(((kwq) mrmVarM16829i.mo16809c()).f37524a, context.getApplicationContext(), ((kwq) mrmVarM16829i.mo16809c()).f37525b);
                    String str2 = "";
                    if (eziVar2.f21047c.mo6184l(dig.f11501o)) {
                        C1058va c1058va = eziVar2.f21043C;
                        c1058va.getClass();
                        eziVar2.f21065u = String.valueOf(c1058va.m19469H() >= ((long) ApiVersion.VERSION_8.getVersionCode()) ? c1058va.f47803b.startLinkLogging("", 6) : null);
                    }
                    fcp fcpVar = eziVar2.f21056l;
                    nxl nxlVarM18137O = nke.f43182f.m18137O();
                    String str3 = eziVar2.f21065u;
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    nke nkeVar = (nke) nxlVarM18137O.f44974b;
                    str3.getClass();
                    nkeVar.f43184a |= 8;
                    nkeVar.f43188e = str3;
                    nxl nxlVarM18137O2 = nkf.f43189f.m18137O();
                    if (!nxlVarM18137O2.f44974b.m18142ac()) {
                        nxlVarM18137O2.mo18106p();
                    }
                    nkf nkfVar = (nkf) nxlVarM18137O2.f44974b;
                    nkfVar.f43192b = 1;
                    nkfVar.f43191a |= 1;
                    int i2 = true != eziVar2.f21047c.mo6184l(dig.f11496j) ? 3 : 2;
                    if (!nxlVarM18137O2.f44974b.m18142ac()) {
                        nxlVarM18137O2.mo18106p();
                    }
                    nxq nxqVar = nxlVarM18137O2.f44974b;
                    nkf nkfVar2 = (nkf) nxqVar;
                    nkfVar2.f43193c = i2 - 1;
                    nkfVar2.f43191a |= 2;
                    Object obj2 = eziVar2.f21043C.f47804c;
                    if (!nxqVar.m18142ac()) {
                        nxlVarM18137O2.mo18106p();
                    }
                    nkf nkfVar3 = (nkf) nxlVarM18137O2.f44974b;
                    nkfVar3.f43191a |= 4;
                    nkfVar3.f43194d = (String) obj2;
                    C1058va c1058va2 = eziVar2.f21043C;
                    try {
                        str2 = ((Context) c1058va2.f47802a).getPackageManager().getPackageInfo((String) c1058va2.f47804c, 0).versionName;
                    } catch (PackageManager.NameNotFoundException e4) {
                        Object[] objArr = new Object[0];
                        if (Log.isLoggable("LinkEngineApi", 6)) {
                            Log.e("LinkEngineApi", lme.m15722h("Read host package version name failure", objArr), e4);
                        }
                    }
                    if (!nxlVarM18137O2.f44974b.m18142ac()) {
                        nxlVarM18137O2.mo18106p();
                    }
                    nkf nkfVar4 = (nkf) nxlVarM18137O2.f44974b;
                    str2.getClass();
                    nkfVar4.f43191a |= 8;
                    nkfVar4.f43195e = str2;
                    nkf nkfVar5 = (nkf) nxlVarM18137O2.mo18103l();
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    nke nkeVar2 = (nke) nxlVarM18137O.f44974b;
                    nkfVar5.getClass();
                    nkeVar2.f43185b = nkfVar5;
                    nkeVar2.f43184a |= 1;
                    fcpVar.mo8203w((nke) nxlVarM18137O.mo18103l());
                    eziVar2.f21043C.f47803b.setKeyguardDismisser(new KeyguardDismisser() { // from class: eze
                        @Override // com.google.android.libraries.lens.lenslite.api.KeyguardDismisser
                        public final void dismissKeyguard(KeyguardManager.KeyguardDismissCallback keyguardDismissCallback) {
                            ezi eziVar3 = eziVar2;
                            eziVar3.f21055k.mo9794b(eziVar3.f21050f, keyguardDismissCallback);
                        }
                    });
                    C1058va c1058va3 = eziVar2.f21043C;
                    Activity activity = eziVar2.f21050f;
                    if (c1058va3.m19469H() >= ApiVersion.VERSION_7.getVersionCode()) {
                        c1058va3.f47803b.setActivity(activity);
                        c1058va3.f47803b.setAlertDialogBuilder(new AlertDialog.Builder(activity, C0100R.style.AlertDialogTheme));
                    }
                    eziVar2.f21043C.f47803b.setEventListener(new LinkEventListener() { // from class: ezf
                        @Override // com.google.android.libraries.lens.lenslite.api.LinkEventListener
                        public final void onEvent(int i3, int i4) {
                            ezi eziVar3 = eziVar2;
                            eziVar3.f21048d.execute(new bbt(eziVar3, i3, 19));
                        }
                    }, null);
                    C1058va c1058va4 = eziVar2.f21043C;
                    kvv kvvVar = new kvv() { // from class: ezg
                        @Override // p000.kvv
                        /* JADX INFO: renamed from: a */
                        public final void mo8061a(kvu kvuVar) {
                            Runnable cggVar;
                            ezi eziVar3 = eziVar2;
                            hew hewVar2 = hewVar;
                            kwe kweVar = kvuVar.f37457a;
                            if ((kweVar.f37498a & 4) != 0) {
                                ArrayMap arrayMap = new ArrayMap();
                                kwb kwbVar = kweVar.f37501d;
                                if (kwbVar == null) {
                                    kwbVar = kwb.f37483b;
                                }
                                for (kwa kwaVar : kwbVar.f37485a) {
                                    kvz kvzVar = kwaVar.f37481c;
                                    if (kvzVar == null) {
                                        kvzVar = kvz.f37474b;
                                    }
                                    if (!kvzVar.f37476a.isEmpty()) {
                                        kvz kvzVar2 = kwaVar.f37481c;
                                        if (kvzVar2 == null) {
                                            kvzVar2 = kvz.f37474b;
                                        }
                                        for (kvy kvyVar : kvzVar2.f37476a) {
                                            arrayMap.put(kvyVar.f37471a, Float.valueOf(kvyVar.f37472b));
                                        }
                                    }
                                }
                                if (!arrayMap.isEmpty()) {
                                    dgn dgnVar = eziVar3.f21054j;
                                    kwd kwdVar = kweVar.f37499b;
                                    if (kwdVar == null) {
                                        kwdVar = kwd.f37492b;
                                    }
                                    dgnVar.mo6081bq(kwdVar.f37494a, arrayMap);
                                }
                            }
                            kwc kwcVar = kweVar.f37500c;
                            if (kwcVar == null) {
                                kwcVar = kwc.f37486d;
                            }
                            if ((kwcVar.f37488a & 4) != 0) {
                                ArrayMap arrayMap2 = new ArrayMap();
                                kwc kwcVar2 = kweVar.f37500c;
                                if (kwcVar2 == null) {
                                    kwcVar2 = kwc.f37486d;
                                }
                                mfq mfqVar = kwcVar2.f37490c;
                                if (mfqVar == null) {
                                    mfqVar = mfq.f40377b;
                                }
                                for (mfp mfpVar : mfqVar.f40379a) {
                                    mfr mfrVar = mfpVar.f40374a;
                                    if (mfrVar == null) {
                                        mfrVar = mfr.f40380b;
                                    }
                                    nxv nxvVar = mfrVar.f40382a;
                                    if (!nxvVar.isEmpty()) {
                                        arrayMap2.put(Long.valueOf(mfpVar.f40375b), nxvVar);
                                    }
                                }
                                if (!arrayMap2.isEmpty()) {
                                    dgg dggVar = eziVar3.f21053i;
                                    kwd kwdVar2 = kweVar.f37499b;
                                    if (kwdVar2 == null) {
                                        kwdVar2 = kwd.f37492b;
                                    }
                                    dggVar.mo3954g(kwdVar2.f37494a, arrayMap2);
                                }
                            }
                            kwc kwcVar3 = kweVar.f37500c;
                            if (kwcVar3 == null) {
                                kwcVar3 = kwc.f37486d;
                            }
                            mfg mfgVar = kwcVar3.f37489b;
                            if (mfgVar == null) {
                                mfgVar = mfg.f40322b;
                            }
                            if (mfgVar.f40324a.size() <= 0 || !eziVar3.m8066g()) {
                                List list = kvuVar.f37458b;
                                kvw kvwVar = kvuVar.f37459c;
                                if (list.isEmpty()) {
                                    return;
                                }
                                LinkChipResult linkChipResult = (LinkChipResult) list.get(0);
                                mrm mrmVarM16829i3 = kvwVar.f37462a.size() > 0 ? mrm.m16829i((nvg) kvwVar.f37462a.get(0)) : mqu.f41450a;
                                linkChipResult.getClass();
                                switch (linkChipResult.getActionType()) {
                                    case 0:
                                        break;
                                    case 3:
                                        if (eziVar3.f21066v.mo16813g() && ((LinkChipResult) eziVar3.f21066v.mo16809c()).getId() == linkChipResult.getId()) {
                                            eziVar3.f21066v = mqu.f41450a;
                                            hewVar2.mo10130a();
                                            break;
                                        }
                                        break;
                                    default:
                                        heu heuVarM10165a = hev.m10165a();
                                        if (linkChipResult.getText() != null) {
                                            String text = linkChipResult.getText();
                                            text.getClass();
                                            heuVarM10165a.f27492a = text;
                                        }
                                        if (linkChipResult.getIcon() != null) {
                                            Drawable icon = linkChipResult.getIcon();
                                            icon.getClass();
                                            heuVarM10165a.f27493b = icon;
                                        }
                                        if (linkChipResult.getActionType() == 1) {
                                            cggVar = linkChipResult.getOnChipClickListener();
                                        } else if (linkChipResult.getActionType() == 2) {
                                            LinkChipResult.BitmapProvider bitmapProvider = linkChipResult.getBitmapProvider();
                                            bitmapProvider.getClass();
                                            cggVar = new cgg(eziVar3, linkChipResult, mrmVarM16829i3, kweVar, bitmapProvider, 9);
                                        } else {
                                            cggVar = null;
                                        }
                                        if (cggVar != null) {
                                            heuVarM10165a.f27494c = new apv(eziVar3, cggVar, linkChipResult, kweVar, 9);
                                        }
                                        if (linkChipResult.getChipContentDescription() != null) {
                                            String chipContentDescription = linkChipResult.getChipContentDescription();
                                            chipContentDescription.getClass();
                                            heuVarM10165a.f27496e = chipContentDescription;
                                        }
                                        if (linkChipResult.getOnCloseButtonClickListener() != null) {
                                            heuVarM10165a.f27497f = new epm(eziVar3, linkChipResult, kweVar, 5);
                                        }
                                        heuVarM10165a.m10164e(linkChipResult.getTimeout());
                                        heuVarM10165a.f27498g = new epm(eziVar3, linkChipResult, kweVar, 6);
                                        heuVarM10165a.f27499h = new ewo(eziVar3, linkChipResult, 4);
                                        hev hevVarM10160a = heuVarM10165a.m10160a();
                                        if (eziVar3.f21066v.mo16813g() && ((LinkChipResult) eziVar3.f21066v.mo16809c()).getId() == linkChipResult.getId()) {
                                            hewVar2.mo10132c(hevVarM10160a);
                                        } else {
                                            eziVar3.f21066v = mrm.m16829i(linkChipResult);
                                            hewVar2.mo10131b(hevVarM10160a);
                                        }
                                        break;
                                }
                            }
                        }
                    };
                    ?? r0 = c1058va4.f47803b;
                    nxf nxfVar = kwi.f37510a;
                    nxfVar.getClass();
                    r0.setResultListener(new kwh(nxfVar, kvvVar));
                    jvb jvbVar = eziVar2.f21049e;
                    C1058va c1058va5 = eziVar2.f21043C;
                    c1058va5.getClass();
                    jvbVar.m13537d(new eds(c1058va5, 19, null, null, null, null));
                    eziVar2.f21049e.m13537d(eziVar2.f21046b.mo3830a(new euz(eziVar2, 12), eziVar2.f21048d));
                    jvb jvbVar2 = eziVar2.f21049e;
                    C1058va c1058va6 = eziVar2.f21043C;
                    c1058va6.getClass();
                    jvbVar2.m13537d(new eds(c1058va6, 20, null, null, null, null));
                    eziVar2.f21058n = true;
                    eziVar2.m8064e();
                } catch (RuntimeException e5) {
                    fcp fcpVar2 = eziVar2.f21056l;
                    nxl nxlVarM18137O3 = nke.f43182f.m18137O();
                    String str4 = eziVar2.f21065u;
                    if (!nxlVarM18137O3.f44974b.m18142ac()) {
                        nxlVarM18137O3.mo18106p();
                    }
                    nke nkeVar3 = (nke) nxlVarM18137O3.f44974b;
                    str4.getClass();
                    nkeVar3.f43184a |= 8;
                    nkeVar3.f43188e = str4;
                    nxl nxlVarM18137O4 = nkf.f43189f.m18137O();
                    if (!nxlVarM18137O4.f44974b.m18142ac()) {
                        nxlVarM18137O4.mo18106p();
                    }
                    nkf nkfVar6 = (nkf) nxlVarM18137O4.f44974b;
                    nkfVar6.f43192b = 2;
                    nkfVar6.f43191a |= 1;
                    nkf nkfVar7 = (nkf) nxlVarM18137O4.mo18103l();
                    if (!nxlVarM18137O3.f44974b.m18142ac()) {
                        nxlVarM18137O3.mo18106p();
                    }
                    nke nkeVar4 = (nke) nxlVarM18137O3.f44974b;
                    nkfVar7.getClass();
                    nkeVar4.f43185b = nkfVar7;
                    nkeVar4.f43184a |= 1;
                    fcpVar2.mo8203w((nke) nxlVarM18137O3.mo18103l());
                }
            }
        });
    }
}
