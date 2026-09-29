package p000;

import android.content.Context;
import android.util.Pair;
import com.airbnb.lottie.network.FileExtension;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class il5 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44257a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f44258b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f44259c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f44260d;

    public /* synthetic */ il5(int i, Context context, String str, String str2) {
        this.f44257a = i;
        this.f44258b = context;
        this.f44259c = str;
        this.f44260d = str2;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00a0  */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        gl5 gl5Var;
        zl5 zl5Var;
        gl5 gl5Var2;
        Pair pair;
        zl5 zl5VarM16356i;
        vj6 vj6Var;
        switch (this.f44257a) {
            case 0:
                Context context = this.f44258b;
                String str = this.f44259c;
                String str2 = this.f44260d;
                ck6 ck6Var = wk4.f66963b;
                int i = 0;
                if (ck6Var == null) {
                    synchronized (ck6.class) {
                        try {
                            ck6Var = wk4.f66963b;
                            if (ck6Var == null) {
                                Context applicationContext = context.getApplicationContext();
                                vj6 vj6Var2 = wk4.f66964c;
                                if (vj6Var2 == null) {
                                    synchronized (vj6.class) {
                                        try {
                                            vj6Var = wk4.f66964c;
                                            if (vj6Var == null) {
                                                vj6Var = new vj6(new C3440oy(applicationContext, 20), i);
                                                wk4.f66964c = vj6Var;
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                        break;
                                    }
                                    vj6Var2 = vj6Var;
                                }
                                ck6Var = new ck6(vj6Var2, new n58(6));
                                wk4.f66963b = ck6Var;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                AutoCloseable autoCloseable = null;
                if (str2 != null) {
                    try {
                        File fileM23345u = ((vj6) ck6Var.f10194b).m23345u(str);
                        if (fileM23345u == null) {
                            pair = null;
                        } else {
                            FileInputStream fileInputStream = new FileInputStream(fileM23345u);
                            FileExtension fileExtension = fileM23345u.getAbsolutePath().endsWith(".zip") ? FileExtension.ZIP : fileM23345u.getAbsolutePath().endsWith(".gz") ? FileExtension.GZIP : FileExtension.JSON;
                            fileM23345u.getAbsolutePath();
                            tj5.m22149a();
                            pair = new Pair(fileExtension, fileInputStream);
                        }
                    } catch (FileNotFoundException unused) {
                    }
                    if (pair == null) {
                        gl5Var = null;
                    } else {
                        FileExtension fileExtension2 = (FileExtension) pair.first;
                        InputStream inputStream = (InputStream) pair.second;
                        int i2 = bk6.f8641a[fileExtension2.ordinal()];
                        if (i2 == 1) {
                            zl5VarM16356i = ll5.m16356i(context, new ZipInputStream(inputStream), str2);
                        } else if (i2 != 2) {
                            zl5VarM16356i = ll5.m16352e(r46.m20369L(inputStream), str2);
                        } else {
                            try {
                                zl5VarM16356i = ll5.m16352e(r46.m20369L(new GZIPInputStream(inputStream)), str2);
                            } catch (IOException e) {
                                zl5VarM16356i = new zl5(e);
                            }
                        }
                        gl5Var = zl5VarM16356i.f71701a;
                        if (gl5Var == null) {
                            gl5Var = null;
                        }
                    }
                    break;
                } else {
                    gl5Var = null;
                }
                if (gl5Var == null) {
                    tj5.m22149a();
                    tj5.m22149a();
                    try {
                        try {
                            i72 i72VarM17232i = n58.m17232i(str);
                            HttpURLConnection httpURLConnection = (HttpURLConnection) i72VarM17232i.f43617b;
                            try {
                                if (httpURLConnection.getResponseCode() / 100 == 2) {
                                    i = 1;
                                }
                            } catch (IOException unused2) {
                            }
                            if (i != 0) {
                                zl5Var = ck6Var.m4807p(context, str, httpURLConnection.getInputStream(), httpURLConnection.getContentType(), str2);
                                gl5 gl5Var3 = zl5Var.f71701a;
                                tj5.m22149a();
                            } else {
                                zl5Var = new zl5(new IllegalArgumentException(i72VarM17232i.m13707a()));
                            }
                            try {
                                i72VarM17232i.close();
                            } catch (IOException e2) {
                                tj5.m22152d("LottieFetchResult close failed ", e2);
                            }
                            break;
                        } catch (Throwable th3) {
                            if (0 == 0) {
                                throw th3;
                            }
                            try {
                                autoCloseable.close();
                                throw th3;
                            } catch (IOException e3) {
                                tj5.m22152d("LottieFetchResult close failed ", e3);
                                throw th3;
                            }
                        }
                    } catch (Exception e4) {
                        zl5 zl5Var2 = new zl5(e4);
                        if (0 != 0) {
                            try {
                                autoCloseable.close();
                            } catch (IOException e5) {
                                tj5.m22152d("LottieFetchResult close failed ", e5);
                            }
                        }
                        zl5Var = zl5Var2;
                        break;
                    }
                } else {
                    zl5Var = new zl5(gl5Var);
                }
                if (str2 != null && (gl5Var2 = zl5Var.f71701a) != null) {
                    hl5.f42577b.f42578a.m240f(str2, gl5Var2);
                }
                return zl5Var;
            default:
                return ll5.m16349b(this.f44258b, this.f44259c, this.f44260d);
        }
    }
}
