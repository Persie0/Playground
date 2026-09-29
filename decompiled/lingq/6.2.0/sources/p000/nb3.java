package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nb3 {

    /* JADX INFO: renamed from: a */
    public static final ab9 f52561a = new ab9(16);

    /* JADX INFO: renamed from: b */
    public static final ThreadPoolExecutor f52562b;

    /* JADX INFO: renamed from: c */
    public static final Object f52563c;

    /* JADX INFO: renamed from: d */
    public static final l79 f52564d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new e78());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f52562b = threadPoolExecutor;
        f52563c = new Object();
        f52564d = new l79(0);
    }

    /* JADX INFO: renamed from: a */
    public static String m17310a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((hb3) list.get(i2)).f42132g);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static mb3 m17311b(String str, Context context, List list, int i) {
        int i2;
        Typeface typefaceM17935a;
        ab9 ab9Var = f52561a;
        pvc.m19517m("getFontSync");
        try {
            Typeface typeface = (Typeface) ab9Var.m238d(str);
            if (typeface != null) {
                mb3 mb3Var = new mb3(typeface);
                Trace.endSection();
                return mb3Var;
            }
            try {
                ztb ztbVarM12460a = gb3.m12460a(context, list);
                List list2 = (List) ztbVarM12460a.f72162c;
                int i3 = ztbVarM12460a.f72161b;
                if (i3 == 0) {
                    dc3[] dc3VarArr = (dc3[]) list2.get(0);
                    if (dc3VarArr == null || dc3VarArr.length == 0) {
                        i2 = 1;
                    } else {
                        int length = dc3VarArr.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                i2 = 0;
                                break;
                            }
                            int i5 = dc3VarArr[i4].f35384f;
                            if (i5 != 0) {
                                if (i5 >= 0) {
                                    i2 = i5;
                                    break;
                                }
                                i2 = -3;
                                break;
                            }
                            i4++;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        i2 = -3;
                        break;
                    }
                    i2 = -2;
                }
                if (i2 != 0) {
                    mb3 mb3Var2 = new mb3(i2);
                    Trace.endSection();
                    return mb3Var2;
                }
                if (list2.size() > 1) {
                    e41 e41Var = oda.f54230a;
                    pvc.m19517m("TypefaceCompat.createFromFontInfoWithFallback");
                    try {
                        typefaceM17935a = oda.f54230a.m10840f(context, list2, i);
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    typefaceM17935a = oda.m17935a(context, (dc3[]) list2.get(0), i);
                }
                if (typefaceM17935a == null) {
                    mb3 mb3Var3 = new mb3(-3);
                    Trace.endSection();
                    return mb3Var3;
                }
                ab9Var.m240f(str, typefaceM17935a);
                mb3 mb3Var4 = new mb3(typefaceM17935a);
                Trace.endSection();
                return mb3Var4;
            } catch (PackageManager.NameNotFoundException unused) {
                mb3 mb3Var5 = new mb3(-1);
                Trace.endSection();
                return mb3Var5;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }
}
