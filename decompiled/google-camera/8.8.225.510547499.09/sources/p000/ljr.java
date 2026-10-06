package p000;

import com.google.android.material.behavior.iWN.zuAgeeF;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ljr {

    /* JADX INFO: renamed from: a */
    public static final nbh f38414a = nbh.m17259h("com/google/android/libraries/performance/primes/metrics/crash/CrashCounter");

    /* JADX INFO: renamed from: b */
    public final File f38415b;

    /* JADX INFO: renamed from: c */
    public int f38416c = 0;

    /* JADX INFO: renamed from: d */
    public boolean f38417d = false;

    /* JADX INFO: renamed from: e */
    private final String f38418e;

    /* JADX INFO: renamed from: f */
    private File f38419f;

    public ljr(File file, String str) {
        this.f38415b = file;
        this.f38418e = str;
    }

    /* JADX INFO: renamed from: a */
    public final int m15544a() {
        if (m15546c()) {
            return this.f38416c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final File m15545b() {
        if (this.f38419f == null) {
            this.f38419f = new File(this.f38415b, this.f38418e.concat("_crash_counter_storage.pb"));
        }
        return this.f38419f;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m15546c() throws IllegalAccessException, nyb, InvocationTargetException {
        if (this.f38417d) {
            return true;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(m15545b());
            try {
                nxf nxfVarM18011a = nxf.m18011a();
                ljv ljvVar = ljv.f38439c;
                nww nwwVarM17876I = nww.m17876I(fileInputStream);
                nxq nxqVarM18138P = ljvVar.m18138P();
                try {
                    try {
                        try {
                            nzm nzmVarM18260b = nzf.f45060a.m18260b(nxqVarM18138P);
                            nzmVarM18260b.mo18252h(nxqVarM18138P, nwx.m17885p(nwwVarM17876I), nxfVarM18011a);
                            nzmVarM18260b.mo18250f(nxqVarM18138P);
                            nxq.m18132ae(nxqVarM18138P);
                            this.f38416c = ((ljv) nxqVarM18138P).f38442b;
                            fileInputStream.close();
                        } catch (IOException e) {
                            if (e.getCause() instanceof nyb) {
                                throw ((nyb) e.getCause());
                            }
                            throw new nyb(e);
                        }
                    } catch (RuntimeException e2) {
                        if (e2.getCause() instanceof nyb) {
                            throw ((nyb) e2.getCause());
                        }
                        throw e2;
                    }
                } catch (nyb e3) {
                    if (e3.f44994a) {
                        throw new nyb(e3);
                    }
                    throw e3;
                } catch (nzx e4) {
                    throw e4.m18328a();
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod(zuAgeeF.EVopU, Throwable.class).invoke(th, th2);
                }
                throw th;
            }
        } catch (FileNotFoundException e5) {
            this.f38416c = 0;
        } catch (IOException e6) {
            ((nbe) ((nbe) ((nbe) f38414a.m17252c()).mo17283h(e6)).mo17276G((char) 4516)).mo17290o("failed to read counter from disk.");
            return false;
        }
        this.f38417d = true;
        return true;
    }
}
