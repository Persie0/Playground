package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.lens.sdk.LensApi;
import java.io.File;
import java.util.List;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dks implements msi {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f11900a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f11901b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f11902c;

    public /* synthetic */ dks(dhv dhvVar, Context context, int i) {
        this.f11902c = i;
        this.f11900a = dhvVar;
        this.f11901b = context;
    }

    public /* synthetic */ dks(dky dkyVar, dkx dkxVar, int i) {
        this.f11902c = i;
        this.f11900a = dkyVar;
        this.f11901b = dkxVar;
    }

    public /* synthetic */ dks(dwc dwcVar, chp chpVar, int i) {
        this.f11902c = i;
        this.f11900a = dwcVar;
        this.f11901b = chpVar;
    }

    public /* synthetic */ dks(edk edkVar, eby ebyVar, int i) {
        this.f11902c = i;
        this.f11900a = edkVar;
        this.f11901b = ebyVar;
    }

    public /* synthetic */ dks(kbz kbzVar, Context context, int i) {
        this.f11902c = i;
        this.f11900a = kbzVar;
        this.f11901b = context;
    }

    public /* synthetic */ dks(liv livVar, ohb ohbVar, int i, byte[] bArr) {
        this.f11902c = i;
        this.f11901b = livVar;
        this.f11900a = ohbVar;
    }

    public /* synthetic */ dks(ljm ljmVar, Context context, int i) {
        this.f11902c = i;
        this.f11900a = ljmVar;
        this.f11901b = context;
    }

    public /* synthetic */ dks(lla llaVar, oju ojuVar, int i) {
        this.f11902c = i;
        this.f11901b = llaVar;
        this.f11900a = ojuVar;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x019b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r0v4, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dkx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, ohb] */
    /* JADX WARN: Type inference failed for: r2v5, types: [chp, java.lang.Object] */
    @Override // p000.msi
    /* JADX INFO: renamed from: a */
    public final Object mo6051a() {
        String str;
        Object objM16829i;
        int i = 3;
        boolean z = true;
        boolean z2 = false;
        switch (this.f11902c) {
            case 0:
                return ((dky) this.f11900a).m6322a(this.f11901b, true, dky.f11909b);
            case 1:
                ?? r0 = this.f11900a;
                Object obj = this.f11901b;
                nbh nbhVar = det.f10737a;
                String strMo6182j = r0.mo6182j(dig.f11485C);
                if (!mro.m16832b(strMo6182j)) {
                    int length = strMo6182j.length();
                    int iCharCount = 0;
                    while (iCharCount < length) {
                        int iCodePointAt = strMo6182j.codePointAt(iCharCount);
                        if (!Character.isWhitespace(iCodePointAt)) {
                            try {
                                str = ((Context) obj).getPackageManager().getPackageInfo("com.google.android.apps.docs", 0).versionName;
                                break;
                            } catch (PackageManager.NameNotFoundException e) {
                                str = "";
                            }
                            Matcher matcher = det.f10738b.matcher(str);
                            if (!matcher.find() || matcher.groupCount() < 3) {
                                z = false;
                            } else {
                                try {
                                    String strGroup = matcher.group(1);
                                    strGroup.getClass();
                                    int i2 = Integer.parseInt(strGroup);
                                    String strGroup2 = matcher.group(2);
                                    strGroup2.getClass();
                                    int i3 = Integer.parseInt(strGroup2);
                                    String strGroup3 = matcher.group(3);
                                    strGroup3.getClass();
                                    int i4 = Integer.parseInt(strGroup3);
                                    List listM16851f = msa.m16846b('.').m16851f(strMo6182j);
                                    if (listM16851f.size() >= 3) {
                                        int i5 = Integer.parseInt((String) listM16851f.get(0));
                                        int i6 = Integer.parseInt((String) listM16851f.get(1));
                                        int i7 = Integer.parseInt((String) listM16851f.get(2));
                                        if (i2 <= i5 && ((i2 != i5 || i3 <= i6) && (i2 != i5 || i3 != i6 || i4 < i7))) {
                                            z = false;
                                        }
                                    } else {
                                        z = false;
                                    }
                                } catch (NumberFormatException e2) {
                                    ((nbe) ((nbe) ((nbe) det.f10737a.m17252c()).mo17283h(e2)).mo17276G((char) 853)).mo17290o("Error parsing Drive version information");
                                    z = false;
                                }
                            }
                            try {
                                z2 = ((Context) obj).getPackageManager().getApplicationInfo("com.google.android.apps.docs", 0).enabled;
                                break;
                            } catch (PackageManager.NameNotFoundException e3) {
                            }
                            return Boolean.valueOf(z & z2);
                        }
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return false;
            case 2:
                Object obj2 = this.f11900a;
                ?? r2 = this.f11901b;
                ((nbe) ((nbe) dwc.f12703a.m17252c()).mo17276G((char) 1146)).mo17290o("Thumbnail is null when startLaunchingPhotos. Launch Photos Anyway.");
                dwc dwcVar = (dwc) obj2;
                return kxk.m14970P(new cnn(dwcVar, (chp) r2, i), dwcVar.f12708f);
            case 3:
                Object obj3 = this.f11900a;
                Object obj4 = this.f11901b;
                if (obj3 != edk.LONG_EXPOSURE && !((Boolean) ((eby) obj4).f13316b.mo3831be()).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                ?? r1 = this.f11900a;
                Object obj5 = this.f11901b;
                try {
                    r1.mo13961e("LensUtil.LensApi");
                    return new LensApi(((Context) obj5).getApplicationContext());
                } finally {
                    r1.mo13962f();
                }
            case 5:
                Object obj6 = this.f11900a;
                Object obj7 = this.f11901b;
                synchronized (obj6) {
                    String strM15376a = lib.m15376a();
                    String str2 = strM15376a + ".trace";
                    File file = new File(((Context) obj7).getFilesDir(), "primes_profiling_" + strM15376a);
                    if (file.exists() || file.mkdir()) {
                        File file2 = new File(file, str2);
                        file2.deleteOnExit();
                        try {
                            if (file2.exists()) {
                                file2.delete();
                            }
                            break;
                        } catch (RuntimeException e4) {
                        }
                        objM16829i = mrm.m16829i(file2);
                    } else {
                        objM16829i = mqu.f41450a;
                    }
                }
                return objM16829i;
            case 6:
                return ((lla) this.f11901b).m15681b(this.f11900a);
            default:
                Object obj8 = this.f11901b;
                ?? r3 = this.f11900a;
                int i8 = lnd.f38738a;
                return ((liv) obj8).m15478a(((lnb) r3.get()).f38734a);
        }
    }
}
