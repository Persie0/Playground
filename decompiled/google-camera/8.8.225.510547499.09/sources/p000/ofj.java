package p000;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Size;
import android.view.Display;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ofj implements ofm {

    /* JADX INFO: renamed from: a */
    private final Context f45852a;

    static {
        ofj.class.getSimpleName();
    }

    public ofj(Context context) {
        this.f45852a = context.getApplicationContext();
    }

    @Override // p000.ofm
    /* JADX INFO: renamed from: a */
    public final ngy mo18450a(ofx ofxVar) {
        return null;
    }

    @Override // p000.ofm
    /* JADX INFO: renamed from: b */
    public final ofu mo18451b() {
        Context context = this.f45852a;
        String str = oex.f45816a;
        return (ofu) oex.m18446a(ofu.f45881a.m18137O(), "current_device_params", 894990891, true, context);
    }

    @Override // p000.ofm
    /* JADX INFO: renamed from: c */
    public final ofv mo18452c() {
        ArrayList arrayList;
        ofk ofkVar;
        Context context = this.f45852a;
        String str = oex.f45816a;
        ofv ofvVar = (ofv) oex.m18446a(ofv.f45883e.m18137O(), "phone_params", 779508118, false, context);
        if (ofvVar != null) {
            return ofvVar;
        }
        Context context2 = this.f45852a;
        ArrayList arrayList2 = ofl.f45860a;
        nxl nxlVarM18137O = ofv.f45883e.m18137O();
        List list = ofl.f45861b;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.DEVICE;
        String str4 = Build.MODEL;
        String str5 = Build.HARDWARE;
        String strM18466a = ofl.m18466a(str3);
        Iterator it = list.iterator();
        do {
            arrayList = null;
            if (!it.hasNext()) {
                return null;
            }
            ofkVar = (ofk) it.next();
            if (ofkVar.m18464a(str2, str3, str4, str5)) {
                break;
            }
        } while (!ofkVar.m18464a(str2, strM18466a, str4, str5));
        String.format("Found override: {MANUFACTURER=%s, DEVICE=%s, MODEL=%s, HARDWARE=%s} : x_ppi=%f, y_ppi=%f, bottom_bezel_height=%f)", ofkVar.f45853a, ofkVar.f45854b, ofkVar.f45855c, ofkVar.f45856d, ofkVar.f45857e, ofkVar.f45858f, ofkVar.f45859g);
        Object obj = ofkVar.f45857e;
        if (obj != null) {
            float fFloatValue = ((Float) obj).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ofv ofvVar2 = (ofv) nxlVarM18137O.f44974b;
            ofvVar2.f45885a |= 1;
            ofvVar2.f45886b = fFloatValue;
        }
        Object obj2 = ofkVar.f45858f;
        if (obj2 != null) {
            float fFloatValue2 = ((Float) obj2).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ofv ofvVar3 = (ofv) nxlVarM18137O.f44974b;
            ofvVar3.f45885a |= 2;
            ofvVar3.f45887c = fFloatValue2;
        }
        Object obj3 = ofkVar.f45859g;
        if (obj3 != null) {
            float fFloatValue3 = ((Float) obj3).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ofv ofvVar4 = (ofv) nxlVarM18137O.f44974b;
            ofvVar4.f45885a = 4 | ofvVar4.f45885a;
            ofvVar4.f45888d = fFloatValue3;
        }
        if ("samsung".equals(Build.MANUFACTURER)) {
            Display displayM15404L = lij.m15404L(context2);
            DisplayMetrics displayMetricsM15403K = lij.m15403K(displayM15404L);
            int iMax = displayMetricsM15403K.widthPixels;
            if (displayM15404L != null && (arrayList = ofl.f45860a) == null) {
                ofl.f45860a = new ArrayList();
                Display.Mode[] supportedModes = displayM15404L.getSupportedModes();
                if (supportedModes != null) {
                    for (Display.Mode mode : supportedModes) {
                        ofl.f45860a.add(new Size(mode.getPhysicalWidth(), mode.getPhysicalHeight()));
                    }
                }
                arrayList = ofl.f45860a;
            }
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Size size2 = (Size) arrayList.get(i);
                    iMax = Math.max(iMax, Math.max(size2.getWidth(), size2.getHeight()));
                }
                if (displayMetricsM15403K.widthPixels != iMax) {
                    float f = displayMetricsM15403K.widthPixels;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Non-native screen resolution; scaling DPI by: ");
                    float f2 = f / iMax;
                    sb.append(f2);
                    nxq nxqVar = nxlVarM18137O.f44974b;
                    float f3 = ((ofv) nxqVar).f45886b * f2;
                    if (!nxqVar.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    nxq nxqVar2 = nxlVarM18137O.f44974b;
                    ofv ofvVar5 = (ofv) nxqVar2;
                    ofvVar5.f45885a = 1 | ofvVar5.f45885a;
                    ofvVar5.f45886b = f3;
                    float f4 = ofvVar5.f45887c * f2;
                    if (!nxqVar2.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    ofv ofvVar6 = (ofv) nxlVarM18137O.f44974b;
                    ofvVar6.f45885a |= 2;
                    ofvVar6.f45887c = f4;
                }
            }
        }
        return (ofv) nxlVarM18137O.mo18103l();
    }

    @Override // p000.ofm
    /* JADX INFO: renamed from: d */
    public final ofw mo18453d() {
        return null;
    }

    @Override // p000.ofm
    /* JADX INFO: renamed from: e */
    public final void mo18454e() {
    }

    @Override // p000.ofm
    /* JADX INFO: renamed from: f */
    public final boolean mo18455f(ofu ofuVar) throws Throwable {
        boolean zDelete = true;
        boolean z = false;
        if (ofuVar == null) {
            Context context = this.f45852a;
            String str = oex.f45816a;
            try {
                File fileM18447b = oex.m18447b("current_device_params", context);
                if (fileM18447b.exists()) {
                    zDelete = fileM18447b.delete();
                }
            } catch (IllegalStateException e) {
                Log.w(oex.f45816a, "Error clearing device parameters: ".concat(e.toString()));
                zDelete = false;
            }
            if (!zDelete) {
                Log.e(oex.f45816a, "Could not clear Cardboard parameters from storage.");
            }
            return zDelete;
        }
        Context context2 = this.f45852a;
        String str2 = oex.f45816a;
        byte[] bArrMo17760J = ofuVar.mo17760J();
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                try {
                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(oex.m18447b("current_device_params", context2)));
                    try {
                        try {
                            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                            byteBufferAllocate.putInt(894990891);
                            byteBufferAllocate.putInt(bArrMo17760J.length);
                            bufferedOutputStream2.write(byteBufferAllocate.array());
                            bufferedOutputStream2.write(bArrMo17760J);
                        } catch (IOException e2) {
                            try {
                                Log.w(oex.f45816a, "Error writing parameters: ".concat(String.valueOf(e2.toString())));
                                zDelete = false;
                            } catch (FileNotFoundException e3) {
                                e = e3;
                                bufferedOutputStream = bufferedOutputStream2;
                                Log.e(oex.f45816a, "Parameters file not found for writing: " + e.toString());
                                if (bufferedOutputStream != null) {
                                    bufferedOutputStream.close();
                                }
                            }
                        }
                        try {
                            bufferedOutputStream2.close();
                        } catch (IOException e4) {
                        }
                        z = zDelete;
                    } catch (IllegalStateException e5) {
                        e = e5;
                        bufferedOutputStream = bufferedOutputStream2;
                        Log.w(oex.f45816a, "Error writing parameters: " + e.toString());
                        if (bufferedOutputStream != null) {
                            bufferedOutputStream.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedOutputStream = bufferedOutputStream2;
                        if (bufferedOutputStream != null) {
                            try {
                                bufferedOutputStream.close();
                            } catch (IOException e6) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException e7) {
                }
            } catch (FileNotFoundException e8) {
                e = e8;
            } catch (IllegalStateException e9) {
                e = e9;
            } catch (Throwable th2) {
                th = th2;
            }
            if (!z) {
                Log.e(oex.f45816a, "Could not write Cardboard parameters to storage.");
            }
            return z;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
