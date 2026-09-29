package com.google.android.play.core.assetpacks;

import java.io.File;
import java.util.concurrent.Executor;
import p289o5.RunnableC7933m;
import p338qd.C8553k1;
import p338qd.C8561n0;
import p338qd.C8567p0;
import p338qd.InterfaceC8589w1;
import td.InterfaceC9268p;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.n */
/* JADX INFO: loaded from: classes.dex */
public final class C3123n {

    /* JADX INFO: renamed from: a */
    public final C3112c f15957a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9268p f15958b;

    /* JADX INFO: renamed from: c */
    public final C3118i f15959c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC9268p f15960d;

    /* JADX INFO: renamed from: e */
    public final C8561n0 f15961e;

    public C3123n(C3112c c3112c, InterfaceC9268p interfaceC9268p, C3118i c3118i, InterfaceC9268p interfaceC9268p2, C8561n0 c8561n0) {
        this.f15957a = c3112c;
        this.f15958b = interfaceC9268p;
        this.f15959c = c3118i;
        this.f15960d = interfaceC9268p2;
        this.f15961e = c8561n0;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: a */
    public final void m8998a(C8553k1 c8553k1) {
        Object obj = c8553k1.f33657b;
        long j10 = c8553k1.f45904e;
        C3112c c3112c = this.f15957a;
        File fileM8974j = c3112c.m8974j((String) obj, c8553k1.f45902c, j10);
        if (!fileM8974j.exists()) {
            throw new zzck(String.format("Cannot find pack files to promote for pack %s at %s", (String) obj, fileM8974j.getAbsolutePath()), c8553k1.f33656a);
        }
        String str = (String) obj;
        int i10 = c8553k1.f45903d;
        File fileM8974j2 = c3112c.m8974j(str, i10, j10);
        fileM8974j2.mkdirs();
        if (!fileM8974j.renameTo(fileM8974j2)) {
            throw new zzck(String.format("Cannot promote pack %s from %s to %s", str, fileM8974j.getAbsolutePath(), fileM8974j2.getAbsolutePath()), c8553k1.f33656a);
        }
        ((Executor) this.f15960d.zza()).execute(new RunnableC7933m(this, 13, c8553k1));
        C3118i c3118i = this.f15959c;
        c3118i.getClass();
        c3118i.m8991d(new C8567p0(c3118i, str, i10, j10));
        this.f15961e.m16658a(str);
        ((InterfaceC8589w1) this.f15958b.zza()).mo8956b(str, c8553k1.f33656a);
    }
}
