package androidx.sqlite.driver;

import android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000.AbstractC3695vr;
import p000.C3386nv;
import p000.cs4;
import p000.do9;
import p000.gm5;
import p000.xg3;

/* JADX INFO: renamed from: androidx.sqlite.driver.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0765c extends do9 {

    /* JADX INFO: renamed from: d */
    public final SupportSQLiteStatement$Companion$TransactionOperation f7071d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0765c(xg3 xg3Var, String str, SupportSQLiteStatement$Companion$TransactionOperation supportSQLiteStatement$Companion$TransactionOperation) {
        super(xg3Var, str);
        xg3Var.getClass();
        str.getClass();
        this.f7071d = supportSQLiteStatement$Companion$TransactionOperation;
    }

    @Override // p000.ik8
    /* JADX INFO: renamed from: C */
    public final void mo2874C(int i, String str) {
        str.getClass();
        m10551a();
        AbstractC3695vr.m23485C(25, "column index out of range");
        throw null;
    }

    @Override // p000.ik8
    /* JADX INFO: renamed from: L */
    public final String mo2875L(int i) {
        m10551a();
        AbstractC3695vr.m23485C(21, "no row");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005d  */
    @Override // p000.ik8
    /* JADX INFO: renamed from: a0 */
    public final boolean mo2876a0() throws IllegalAccessException, InvocationTargetException {
        int i = AbstractC0764b.f7070a[this.f7071d.ordinal()];
        xg3 xg3Var = this.f35967a;
        if (i == 1) {
            xg3Var.m24502u();
            xg3Var.m24497e();
        } else if (i == 2) {
            xg3Var.m24497e();
        } else if (i == 3) {
            xg3Var.m24494a();
        } else if (i == 4) {
            xg3Var.m24495b();
        } else {
            if (i != 5) {
                gm5.m12750e();
                return false;
            }
            SQLiteDatabase sQLiteDatabase = xg3Var.f68178a;
            cs4 cs4Var = xg3.f68177e;
            if (((Method) cs4Var.getValue()) != null) {
                cs4 cs4Var2 = xg3.f68176d;
                if (((Method) cs4Var2.getValue()) != null) {
                    Method method = (Method) cs4Var.getValue();
                    method.getClass();
                    Method method2 = (Method) cs4Var2.getValue();
                    method2.getClass();
                    Object objInvoke = method2.invoke(sQLiteDatabase, null);
                    if (objInvoke != null) {
                        method.invoke(objInvoke, 0, null, 0, null);
                    } else {
                        C3386nv.m17633t("Required value was null.");
                    }
                } else {
                    xg3Var.m24494a();
                }
            } else {
                xg3Var.m24494a();
            }
        }
        return false;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f35969c = true;
    }

    @Override // p000.ik8
    /* JADX INFO: renamed from: g */
    public final void mo2877g(int i, double d) {
        m10551a();
        AbstractC3695vr.m23485C(25, "column index out of range");
        throw null;
    }

    @Override // p000.ik8
    public final byte[] getBlob(int i) {
        m10551a();
        AbstractC3695vr.m23485C(21, "no row");
        throw null;
    }

    @Override // p000.ik8
    public final int getColumnCount() {
        m10551a();
        return 0;
    }

    @Override // p000.ik8
    public final String getColumnName(int i) {
        m10551a();
        AbstractC3695vr.m23485C(21, "no row");
        throw null;
    }

    @Override // p000.ik8
    public final double getDouble(int i) {
        m10551a();
        AbstractC3695vr.m23485C(21, "no row");
        throw null;
    }

    @Override // p000.ik8
    public final long getLong(int i) {
        m10551a();
        AbstractC3695vr.m23485C(21, "no row");
        throw null;
    }

    @Override // p000.ik8
    public final boolean isNull(int i) {
        m10551a();
        AbstractC3695vr.m23485C(21, "no row");
        throw null;
    }

    @Override // p000.ik8
    /* JADX INFO: renamed from: j */
    public final void mo2878j(int i, long j) {
        m10551a();
        AbstractC3695vr.m23485C(25, "column index out of range");
        throw null;
    }

    @Override // p000.ik8
    /* JADX INFO: renamed from: k */
    public final void mo2879k(int i, byte[] bArr) {
        m10551a();
        AbstractC3695vr.m23485C(25, "column index out of range");
        throw null;
    }

    @Override // p000.ik8
    /* JADX INFO: renamed from: m */
    public final void mo2880m(int i) {
        m10551a();
        AbstractC3695vr.m23485C(25, "column index out of range");
        throw null;
    }
}
