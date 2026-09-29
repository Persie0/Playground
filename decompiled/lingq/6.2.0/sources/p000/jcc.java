package p000;

import android.app.Application;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class jcc implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45423a = 1;

    /* JADX INFO: renamed from: b */
    public final int f45424b;

    /* JADX INFO: renamed from: c */
    public final String f45425c;

    /* JADX INFO: renamed from: d */
    public final Object f45426d;

    /* JADX INFO: renamed from: e */
    public final Object f45427e;

    /* JADX INFO: renamed from: f */
    public final Object f45428f;

    /* JADX INFO: renamed from: g */
    public final Object f45429g;

    public /* synthetic */ jcc(String str, idc idcVar, int i, IOException iOException, byte[] bArr, Map map) {
        lda.m16130p(idcVar);
        this.f45426d = idcVar;
        this.f45424b = i;
        this.f45427e = iOException;
        this.f45428f = bArr;
        this.f45425c = str;
        this.f45429g = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f45423a) {
            case 0:
                xcc xccVar = (xcc) this.f45429g;
                qfc qfcVar = ((kjc) xccVar.f60774a).f47437e;
                kjc.m15278j(qfcVar);
                if (!qfcVar.f54663b) {
                    Log.println(6, xccVar.m24457N(), "Persisted config not initialized. Not logging error/warn");
                    return;
                }
                if (xccVar.f68077c == 0) {
                    cmb cmbVar = ((kjc) xccVar.f60774a).f47436d;
                    if (cmbVar.f10290e == null) {
                        synchronized (cmbVar) {
                            try {
                                if (cmbVar.f10290e == null) {
                                    kjc kjcVar = (kjc) cmbVar.f60774a;
                                    ApplicationInfo applicationInfo = kjcVar.f47433a.getApplicationInfo();
                                    if (AbstractC3423or.f54777o == null) {
                                        AbstractC3423or.f54777o = Application.getProcessName();
                                    }
                                    String str = AbstractC3423or.f54777o;
                                    if (applicationInfo != null) {
                                        String str2 = applicationInfo.processName;
                                        cmbVar.f10290e = Boolean.valueOf(str2 != null && str2.equals(str));
                                    }
                                    if (cmbVar.f10290e == null) {
                                        cmbVar.f10290e = Boolean.TRUE;
                                        xcc xccVar2 = kjcVar.f47438f;
                                        kjc.m15280l(xccVar2);
                                        xccVar2.f68080f.m17923a("My process not in the list of running processes");
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (cmbVar.f10290e.booleanValue()) {
                        xccVar.f68077c = 'C';
                    } else {
                        xccVar.f68077c = 'c';
                    }
                    break;
                }
                if (xccVar.f68078d < 0) {
                    ((kjc) xccVar.f60774a).f47436d.m4864J();
                    xccVar.f68078d = 161000L;
                }
                int i = this.f45424b;
                char c = xccVar.f68077c;
                long j = xccVar.f68078d;
                String str3 = this.f45425c;
                Object obj = this.f45426d;
                Object obj2 = this.f45427e;
                Object obj3 = this.f45428f;
                char cCharAt = "01VDIWEA?".charAt(i);
                String strM24450O = xcc.m24450O(true, str3, obj, obj2, obj3);
                StringBuilder sb = new StringBuilder(String.valueOf(cCharAt).length() + 1 + String.valueOf(c).length() + String.valueOf(j).length() + 1 + strM24450O.length());
                sb.append("2");
                sb.append(cCharAt);
                sb.append(c);
                sb.append(j);
                sb.append(":");
                sb.append(strM24450O);
                String string = sb.toString();
                if (string.length() > 1024) {
                    string = str3.substring(0, 1024);
                }
                pz2 pz2Var = qfcVar.f57727e;
                if (pz2Var != null) {
                    String str4 = (String) pz2Var.f57025d;
                    qfc qfcVar2 = (qfc) pz2Var.f57026e;
                    qfcVar2.mo12359D();
                    if (((qfc) pz2Var.f57026e).m19930H().getLong((String) pz2Var.f57023b, 0L) == 0) {
                        pz2Var.m19575f();
                    }
                    SharedPreferences sharedPreferencesM19930H = qfcVar2.m19930H();
                    String str5 = (String) pz2Var.f57024c;
                    long j2 = sharedPreferencesM19930H.getLong(str5, 0L);
                    if (j2 <= 0) {
                        SharedPreferences.Editor editorEdit = qfcVar2.m19930H().edit();
                        editorEdit.putString(str4, string);
                        editorEdit.putLong(str5, 1L);
                        editorEdit.apply();
                        return;
                    }
                    rad radVar = ((kjc) qfcVar2.f60774a).f47441i;
                    kjc.m15278j(radVar);
                    long jNextLong = radVar.m20516B0().nextLong() & Long.MAX_VALUE;
                    long j3 = j2 + 1;
                    long j4 = Long.MAX_VALUE / j3;
                    SharedPreferences.Editor editorEdit2 = qfcVar2.m19930H().edit();
                    if (jNextLong < j4) {
                        editorEdit2.putString(str4, string);
                    }
                    editorEdit2.putLong(str5, j3);
                    editorEdit2.apply();
                    return;
                }
                return;
            default:
                ((idc) this.f45426d).mo12445h(this.f45425c, this.f45424b, (Throwable) this.f45427e, (byte[]) this.f45428f, (Map) this.f45429g);
                return;
        }
    }

    public jcc(xcc xccVar, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f45424b = i;
        this.f45425c = str;
        this.f45426d = obj;
        this.f45427e = obj2;
        this.f45428f = obj3;
        this.f45429g = xccVar;
    }
}
