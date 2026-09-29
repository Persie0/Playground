package p000;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class nba {

    /* JADX INFO: renamed from: e */
    public static volatile py1 f52574e;

    /* JADX INFO: renamed from: a */
    public final a41 f52575a;

    /* JADX INFO: renamed from: b */
    public final a41 f52576b;

    /* JADX INFO: renamed from: c */
    public final w72 f52577c;

    /* JADX INFO: renamed from: d */
    public final n16 f52578d;

    public nba(a41 a41Var, a41 a41Var2, w72 w72Var, n16 n16Var, ny8 ny8Var) {
        this.f52575a = a41Var;
        this.f52576b = a41Var2;
        this.f52577c = w72Var;
        this.f52578d = n16Var;
        ((Executor) ny8Var.f53414b).execute(new RunnableC0002a0(ny8Var, 21));
    }

    /* JADX INFO: renamed from: a */
    public static nba m17318a() {
        py1 py1Var = f52574e;
        if (py1Var != null) {
            return (nba) py1Var.f56975f.get();
        }
        C3386nv.m17633t("Not initialized!");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static void m17319b(Context context) {
        if (f52574e == null) {
            synchronized (nba.class) {
                try {
                    if (f52574e == null) {
                        C3002fi c3002fi = new C3002fi();
                        context.getClass();
                        c3002fi.f39115a = context;
                        f52574e = c3002fi.m11841c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final gba m17320c(al0 al0Var) {
        byte[] bytes;
        Set setUnmodifiableSet = al0Var instanceof al0 ? Collections.unmodifiableSet(al0.f792d) : Collections.singleton(new bs2("proto"));
        C3309ls c3309lsM19658a = q50.m19658a();
        al0Var.getClass();
        c3309lsM19658a.f50064b = "cct";
        String str = al0Var.f795a;
        String str2 = al0Var.f796b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = wq1.m24119o("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        c3309lsM19658a.f50065c = bytes;
        return new gba(setUnmodifiableSet, c3309lsM19658a.m16506f(), this);
    }
}
