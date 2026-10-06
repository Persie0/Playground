package p000;

import android.content.Context;
import android.util.Pair;
import androidx.wear.ambient.AmbientMode;
import com.google.android.clockwork.common.wearable.wearmaterial.time.HuCi.yTyWiTtGtnBhy;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bgn implements Callable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f3185a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f3186b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ String f3187c;

    public bgn(Context context, String str, String str2) {
        this.f3185a = context;
        this.f3186b = str;
        this.f3187c = str2;
    }

    /* JADX WARN: Code duplicated, block: B:157:0x0292 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Throwable {
        Pair pair;
        Object obj;
        bhb bhbVar;
        bkm bkmVar;
        bhb bhbVarM2424e;
        bkn bknVar;
        Context context = this.f3185a;
        bko bkoVar = bgh.f3158a;
        bkl bklVar = null;
        String message = null;
        bklVar = null;
        if (bkoVar == null) {
            synchronized (bko.class) {
                bkoVar = bgh.f3158a;
                if (bkoVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    bkn bknVar2 = bgh.f3159b;
                    if (bknVar2 == null) {
                        synchronized (bkn.class) {
                            bknVar = bgh.f3159b;
                            if (bknVar == null) {
                                bknVar = new bkn(new AmbientMode.AmbientController(applicationContext), (byte[]) null, (byte[]) null);
                                bgh.f3159b = bknVar;
                            }
                        }
                        bknVar2 = bknVar;
                    }
                    bkoVar = new bko(bknVar2);
                    bgh.f3158a = bkoVar;
                }
            }
        }
        String str = this.f3186b;
        String str2 = this.f3187c;
        if (str2 == null) {
            obj = null;
        } else {
            Object obj2 = bkoVar.f3652a;
            try {
                File file = new File(((bkn) obj2).m2577a(), bkn.m2551c(str, bkm.JSON, false));
                if (!file.exists()) {
                    file = new File(((bkn) obj2).m2577a(), bkn.m2551c(str, bkm.ZIP, false));
                    if (!file.exists()) {
                        file = null;
                    }
                }
                if (file == null) {
                    pair = null;
                } else {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    bkm bkmVar2 = file.getAbsolutePath().endsWith(".zip") ? bkm.ZIP : bkm.JSON;
                    file.getAbsolutePath();
                    int i = blx.f3726a;
                    pair = new Pair(bkmVar2, fileInputStream);
                }
            } catch (FileNotFoundException e) {
                pair = null;
            }
            if (pair == null) {
                obj = null;
            } else {
                bkm bkmVar3 = (bkm) pair.first;
                InputStream inputStream = (InputStream) pair.second;
                obj = (bkmVar3 == bkm.ZIP ? bgp.m2424e(new ZipInputStream(inputStream), str) : bgp.m2421b(inputStream, str)).f3263a;
                if (obj == null) {
                    obj = null;
                }
            }
        }
        if (obj != null) {
            bhbVar = new bhb(obj);
        } else {
            int i2 = blx.f3726a;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.connect();
                bkl bklVar2 = new bkl(httpURLConnection);
                try {
                    try {
                        if (bklVar2.m2548a()) {
                            InputStream inputStream2 = bklVar2.f3646a.getInputStream();
                            String contentType = bklVar2.f3646a.getContentType();
                            if (contentType == null) {
                                contentType = "application/json";
                            }
                            if (contentType.contains("application/zip") || str.split("\\?")[0].endsWith(".lottie")) {
                                bkmVar = bkm.ZIP;
                                bhbVarM2424e = str2 == null ? bgp.m2424e(new ZipInputStream(inputStream2), null) : bgp.m2424e(new ZipInputStream(new FileInputStream(((bkn) bkoVar.f3652a).m2582b(str, inputStream2, bkmVar))), str);
                            } else {
                                bkmVar = bkm.JSON;
                                bhbVarM2424e = str2 == null ? bgp.m2421b(inputStream2, null) : bgp.m2421b(new FileInputStream(new File(((bkn) bkoVar.f3652a).m2582b(str, inputStream2, bkmVar).getAbsolutePath())), str);
                            }
                            if (str2 != null && bhbVarM2424e.f3263a != null) {
                                File file2 = new File(((bkn) bkoVar.f3652a).m2577a(), bkn.m2551c(str, bkmVar, true));
                                File file3 = new File(file2.getAbsolutePath().replace(".temp", ""));
                                boolean zRenameTo = file2.renameTo(file3);
                                file3.toString();
                                if (!zRenameTo) {
                                    blx.m2680a("Unable to rename cache file " + file2.getAbsolutePath() + " to " + file3.getAbsolutePath() + yTyWiTtGtnBhy.pqIli);
                                }
                            }
                            try {
                                bklVar2.close();
                            } catch (IOException e2) {
                                blx.m2681b("LottieFetchResult close failed ", e2);
                            }
                            bhbVar = bhbVarM2424e;
                        } else {
                            try {
                                if (!bklVar2.m2548a()) {
                                    String strValueOf = String.valueOf(bklVar2.f3646a.getURL());
                                    int responseCode = bklVar2.f3646a.getResponseCode();
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(bklVar2.f3646a.getErrorStream()));
                                    StringBuilder sb = new StringBuilder();
                                    while (true) {
                                        try {
                                            try {
                                                String line = bufferedReader.readLine();
                                                if (line != null) {
                                                    sb.append(line);
                                                    sb.append('\n');
                                                } else {
                                                    try {
                                                        break;
                                                    } catch (Exception e3) {
                                                    }
                                                }
                                            } catch (Exception e4) {
                                                throw e4;
                                            }
                                        } catch (Throwable th) {
                                            bufferedReader.close();
                                            throw th;
                                        }
                                        try {
                                            bufferedReader.close();
                                        } catch (Exception e5) {
                                        }
                                        throw th;
                                    }
                                    bufferedReader.close();
                                    message = "Unable to fetch " + strValueOf + ". Failed with " + responseCode + "\n" + sb.toString();
                                }
                            } catch (IOException e6) {
                                blx.m2681b("get error failed ", e6);
                                message = e6.getMessage();
                            }
                            bhbVar = new bhb((Throwable) new IllegalArgumentException(message));
                            try {
                                bklVar2.close();
                            } catch (IOException e7) {
                                blx.m2681b("LottieFetchResult close failed ", e7);
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bklVar = bklVar2;
                        if (bklVar != null) {
                            try {
                                bklVar.close();
                            } catch (IOException e8) {
                                blx.m2681b("LottieFetchResult close failed ", e8);
                            }
                        }
                        throw th;
                    }
                } catch (Exception e9) {
                    e = e9;
                    bklVar = bklVar2;
                    try {
                        bhb bhbVar2 = new bhb((Throwable) e);
                        if (bklVar != null) {
                            try {
                                bklVar.close();
                            } catch (IOException e10) {
                                blx.m2681b("LottieFetchResult close failed ", e10);
                            }
                        }
                        bhbVar = bhbVar2;
                    } catch (Throwable th3) {
                        th = th3;
                        if (bklVar != null) {
                            bklVar.close();
                        }
                        throw th;
                    }
                }
            } catch (Exception e11) {
                e = e11;
            } catch (Throwable th4) {
                th = th4;
            }
        }
        if (this.f3187c != null && bhbVar.f3263a != null) {
            biy.f3467a.m2522a(this.f3187c, (bgm) bhbVar.f3263a);
        }
        return bhbVar;
    }
}
