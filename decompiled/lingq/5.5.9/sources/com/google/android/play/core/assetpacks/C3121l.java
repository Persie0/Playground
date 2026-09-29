package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;
import p115fb.RunnableC5493i;
import p115fb.RunnableC5494j;
import p338qd.C8538f1;
import p338qd.C8544h1;
import p338qd.C8561n0;
import p338qd.C8567p0;
import p338qd.InterfaceC8589w1;
import sd.C8990a;
import td.InterfaceC9268p;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.l */
/* JADX INFO: loaded from: classes.dex */
public final class C3121l {

    /* JADX INFO: renamed from: a */
    public final C3112c f15947a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9268p f15948b;

    /* JADX INFO: renamed from: c */
    public final C3118i f15949c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC9268p f15950d;

    /* JADX INFO: renamed from: e */
    public final C8561n0 f15951e;

    /* JADX INFO: renamed from: f */
    public final C8990a f15952f;

    /* JADX INFO: renamed from: g */
    public final C8544h1 f15953g;

    public C3121l(C3112c c3112c, InterfaceC9268p interfaceC9268p, C3118i c3118i, InterfaceC9268p interfaceC9268p2, C8561n0 c8561n0, C8990a c8990a, C8544h1 c8544h1) {
        this.f15947a = c3112c;
        this.f15948b = interfaceC9268p;
        this.f15949c = c3118i;
        this.f15950d = interfaceC9268p2;
        this.f15951e = c8561n0;
        this.f15952f = c8990a;
        this.f15953g = c8544h1;
    }

    /* JADX INFO: renamed from: a */
    public final void m8996a(C8538f1 c8538f1) {
        Object obj = c8538f1.f33657b;
        int i10 = c8538f1.f45842c;
        long j10 = c8538f1.f45843d;
        C3112c c3112c = this.f15947a;
        c3112c.getClass();
        File file = new File(c3112c.m8969c((String) obj, i10, j10), "_packs");
        String str = (String) obj;
        File file2 = new File(new File(c3112c.m8969c(str, i10, j10), "_slices"), "_metadata");
        if (!file.exists() || !file2.exists()) {
            throw new zzck(String.format("Cannot find pack files to move for pack %s.", str), c8538f1.f33656a);
        }
        File fileM8974j = c3112c.m8974j(str, i10, j10);
        fileM8974j.mkdirs();
        if (!file.renameTo(fileM8974j)) {
            throw new zzck("Cannot move merged pack files to final location.", c8538f1.f33656a);
        }
        new File(c3112c.m8974j(str, i10, j10), "merge.tmp").delete();
        File file3 = new File(c3112c.m8974j(str, i10, j10), "_metadata");
        file3.mkdirs();
        if (!file2.renameTo(file3)) {
            throw new zzck("Cannot move metadata files to final location.", c8538f1.f33656a);
        }
        boolean zM17232a = this.f15952f.m17232a();
        InterfaceC9268p interfaceC9268p = this.f15950d;
        if (zM17232a) {
            try {
                this.f15953g.m16651b((String) obj, c8538f1.f45842c, c8538f1.f45843d, c8538f1.f45844e);
                ((Executor) interfaceC9268p.zza()).execute(new RunnableC5494j(this, 9, c8538f1));
            } catch (IOException e10) {
                throw new zzck(String.format("Could not write asset pack version tag for pack %s: %s", str, e10.getMessage()), c8538f1.f33656a);
            }
        } else {
            ((Executor) interfaceC9268p.zza()).execute(new RunnableC5493i(5, c3112c));
        }
        C3118i c3118i = this.f15949c;
        c3118i.getClass();
        c3118i.m8991d(new C8567p0(c3118i, str, i10, j10));
        this.f15951e.m16658a(str);
        ((InterfaceC8589w1) this.f15948b.zza()).mo8956b(str, c8538f1.f33656a);
    }
}
