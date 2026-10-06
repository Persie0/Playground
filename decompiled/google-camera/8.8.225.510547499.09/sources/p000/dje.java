package p000;

import android.content.SharedPreferences;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import p021j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dje {

    /* JADX INFO: renamed from: a */
    public static final nbh f11767a = nbh.m17259h("com/google/android/apps/camera/configuration/impl/GcaConfigHelper");

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f11768b;

    /* JADX INFO: renamed from: c */
    public final cwd f11769c;

    /* JADX INFO: renamed from: d */
    private final Optional f11770d;

    /* JADX INFO: renamed from: e */
    private final khb f11771e;

    public dje(khb khbVar, SharedPreferences sharedPreferences, cwd cwdVar, dja djaVar, byte[] bArr, byte[] bArr2) throws Throwable {
        Optional optionalEmpty;
        this.f11769c = cwdVar;
        this.f11771e = khbVar;
        this.f11768b = sharedPreferences;
        if (djaVar.m6200b(dja.FISHFOOD)) {
            djh djhVar = new djh();
            djhVar.f11778a = dji.INSTANCE.m6210a();
            dji djiVar = dji.INSTANCE;
            boolean z = false;
            if (djiVar.m6210a()) {
                InputStreamReader inputStreamReader = null;
                try {
                    try {
                        try {
                            InputStreamReader inputStreamReader2 = new InputStreamReader(new FileInputStream(djiVar.f11782b));
                            try {
                                if (((char) inputStreamReader2.read()) == '1') {
                                    inputStreamReader2.close();
                                    z = true;
                                } else {
                                    inputStreamReader2.close();
                                }
                            } catch (FileNotFoundException e) {
                                inputStreamReader = inputStreamReader2;
                                if (inputStreamReader != null) {
                                    inputStreamReader.close();
                                } else {
                                    z = true;
                                }
                                djhVar.f11779b = z;
                                optionalEmpty = Optional.m12505of(djhVar);
                                this.f11770d = optionalEmpty;
                            } catch (IOException e2) {
                                inputStreamReader = inputStreamReader2;
                                if (inputStreamReader != null) {
                                    inputStreamReader.close();
                                }
                                djhVar.f11779b = z;
                                optionalEmpty = Optional.m12505of(djhVar);
                                this.f11770d = optionalEmpty;
                            } catch (Throwable th) {
                                th = th;
                                inputStreamReader = inputStreamReader2;
                                if (inputStreamReader != null) {
                                    try {
                                        inputStreamReader.close();
                                    } catch (IOException e3) {
                                    }
                                }
                                throw th;
                            }
                        } catch (IOException e4) {
                        }
                    } catch (FileNotFoundException e5) {
                    } catch (IOException e6) {
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e7) {
                }
            }
            djhVar.f11779b = z;
            optionalEmpty = Optional.m12505of(djhVar);
        } else {
            optionalEmpty = Optional.empty();
        }
        this.f11770d = optionalEmpty;
    }

    /* JADX INFO: renamed from: a */
    static lpv m6202a(dhw dhwVar, Float f) {
        if (dhwVar.f11211b == null) {
            return null;
        }
        f.getClass();
        Double dValueOf = Double.valueOf(f.floatValue());
        String str = dhwVar.f11211b;
        str.getClass();
        String str2 = dhwVar.f11210a;
        return new lpq(djd.f11766a, str + "__" + str2, Double.valueOf(dValueOf.doubleValue()));
    }

    /* JADX INFO: renamed from: b */
    static lpv m6203b(dhw dhwVar, Integer num) {
        String str = dhwVar.f11211b;
        if (str == null) {
            return null;
        }
        String str2 = dhwVar.f11210a;
        num.getClass();
        return new lpo(djd.f11766a, str + "__" + str2, Integer.valueOf(num.intValue()));
    }

    /* JADX INFO: renamed from: c */
    static lpv m6204c(dhw dhwVar, String str) {
        String str2 = dhwVar.f11211b;
        if (str2 == null) {
            return null;
        }
        String str3 = dhwVar.f11210a;
        str.getClass();
        return lpv.m15841d(djd.f11766a, str2 + "__" + str3, str, false);
    }

    /* JADX INFO: renamed from: d */
    static lpv m6205d(dhw dhwVar, boolean z) {
        String str = dhwVar.f11211b;
        if (str == null) {
            return null;
        }
        String str2 = dhwVar.f11210a;
        return djd.f11766a.m15835d(str + "__" + str2, z);
    }

    /* JADX INFO: renamed from: f */
    static boolean m6206f(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    final String m6207e(String str) {
        if (str == null) {
            return null;
        }
        String strM14249o = this.f11771e.m14249o(str);
        if (strM14249o != null) {
            return strM14249o;
        }
        if (this.f11770d.isPresent() && ((djh) this.f11770d.get()).f11778a && ((djh) this.f11770d.get()).f11779b) {
            return null;
        }
        return this.f11771e.m14249o("persist.".concat(str));
    }
}
