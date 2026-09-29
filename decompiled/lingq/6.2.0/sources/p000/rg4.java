package p000;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class rg4 extends u33 {
    @Override // p000.u33
    /* JADX INFO: renamed from: A */
    public final qg4 mo259A(d57 d57Var) {
        return new qg4(true, new RandomAccessFile(d57Var.toFile(), "rw"));
    }

    @Override // p000.u33
    /* JADX INFO: renamed from: J */
    public final t89 mo260J(d57 d57Var) {
        d57Var.getClass();
        return new v07(new FileOutputStream(d57Var.toFile(), false), new c1a());
    }

    @Override // p000.u33
    /* JADX INFO: renamed from: N */
    public final yd9 mo261N(d57 d57Var) {
        d57Var.getClass();
        return new f64(new FileInputStream(d57Var.toFile()), c1a.f9314d);
    }

    @Override // p000.u33
    /* JADX INFO: renamed from: a */
    public final t89 mo262a(d57 d57Var) {
        d57Var.getClass();
        return new v07(new FileOutputStream(d57Var.toFile(), true), new c1a());
    }

    @Override // p000.u33
    /* JADX INFO: renamed from: b */
    public void mo263b(d57 d57Var, d57 d57Var2) throws IOException {
        d57Var.getClass();
        d57Var2.getClass();
        if (d57Var.toFile().renameTo(d57Var2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + d57Var + " to " + d57Var2);
    }

    @Override // p000.u33
    /* JADX INFO: renamed from: e */
    public final void mo264e(d57 d57Var) throws IOException {
        d57Var.getClass();
        if (d57Var.toFile().mkdir()) {
            return;
        }
        sb2 sb2VarMo267x = mo267x(d57Var);
        if (sb2VarMo267x == null || !sb2VarMo267x.f60613c) {
            uk9.m22774h(d57Var, "failed to create directory: ");
        }
    }

    @Override // p000.u33
    /* JADX INFO: renamed from: n */
    public final void mo265n(d57 d57Var) throws IOException {
        d57Var.getClass();
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = d57Var.toFile();
        if (file.delete() || !file.exists()) {
            return;
        }
        uk9.m22774h(d57Var, "failed to delete ");
    }

    @Override // p000.u33
    /* JADX INFO: renamed from: r */
    public final List mo266r(d57 d57Var) throws IOException {
        File file = d57Var.toFile();
        String[] list = file.list();
        if (list == null) {
            if (file.exists()) {
                uk9.m22774h(d57Var, "failed to list ");
                return null;
            }
            ho2.m13387h(d57Var, "no such file: ");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            str.getClass();
            arrayList.add(d57Var.m10107e(str));
        }
        x91.m24413s0(arrayList);
        return arrayList;
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }

    @Override // p000.u33
    /* JADX INFO: renamed from: x */
    public sb2 mo267x(d57 d57Var) {
        d57Var.getClass();
        File file = d57Var.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (!zIsFile && !zIsDirectory && jLastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new sb2(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
    }

    @Override // p000.u33
    /* JADX INFO: renamed from: z */
    public final qg4 mo268z(d57 d57Var) {
        return new qg4(false, new RandomAccessFile(d57Var.toFile(), "r"));
    }
}
