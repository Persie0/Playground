package p000;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p021j$.nio.channels.DesugarChannels;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cvr implements cre {

    /* JADX INFO: renamed from: a */
    public static final nbh f9820a = nbh.m17259h("com/google/android/apps/camera/camcorder/mediastore/CamcorderMediaStorePublisher");

    /* JADX INFO: renamed from: b */
    public final gye f9821b;

    /* JADX INFO: renamed from: c */
    public final Executor f9822c;

    /* JADX INFO: renamed from: d */
    public final hah f9823d;

    /* JADX INFO: renamed from: e */
    public final dlw f9824e;

    /* JADX INFO: renamed from: f */
    private final crh f9825f;

    /* JADX INFO: renamed from: g */
    private final ctn f9826g;

    public cvr(gye gyeVar, crh crhVar, ctn ctnVar, Executor executor, hah hahVar, dlw dlwVar) {
        this.f9821b = gyeVar;
        this.f9825f = crhVar;
        this.f9826g = ctnVar;
        this.f9822c = executor;
        this.f9823d = hahVar;
        this.f9824e = dlwVar;
    }

    /* JADX INFO: renamed from: a */
    public final kqf m5618a(gyv gyvVar, gyj gyjVar, gyw gywVar, gyx gyxVar, boolean z) {
        return new cvq(this, gywVar, gyjVar, gyvVar, z, gyxVar);
    }

    /* JADX INFO: renamed from: b */
    public final void m5619b(cti ctiVar) {
        this.f9822c.execute(new cuq(this, ctiVar, 3));
    }

    @Override // p000.cre
    /* JADX INFO: renamed from: bR */
    public final void mo5261bR() {
    }

    /* JADX INFO: renamed from: d */
    public final void m5620d(ctj ctjVar) {
        this.f9822c.execute(new cuq(this, ctjVar, 2));
    }

    @Override // p000.cre
    /* JADX INFO: renamed from: f */
    public final void mo5264f() {
    }

    @Override // p000.cre
    /* JADX INFO: renamed from: g */
    public final void mo5265g() {
    }

    @Override // p000.cre
    /* JADX INFO: renamed from: h */
    public final void mo5266h() {
    }

    @Override // p000.cre
    /* JADX INFO: renamed from: i */
    public final void mo5267i(boolean z) {
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.List] */
    @Override // p000.cre
    /* JADX INFO: renamed from: o */
    public final void mo5273o(fta ftaVar) {
        if (this.f9825f.mo5409o()) {
            Iterator it = ftaVar.f23538d.iterator();
            while (it.hasNext()) {
                m5620d((ctj) it.next());
            }
            Iterator it2 = ftaVar.f23536b.iterator();
            while (it2.hasNext()) {
                m5619b((cti) it2.next());
            }
            return;
        }
        Iterator it3 = ftaVar.f23538d.iterator();
        while (it3.hasNext()) {
            this.f9824e.mo6361i(((ctj) it3.next()).f9469t.f26876b);
        }
        Iterator it4 = ftaVar.f23536b.iterator();
        while (it4.hasNext()) {
            this.f9824e.mo6361i(((cti) it4.next()).f9445h.f26876b);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m5621e(gyw gywVar, mrm mrmVar, mrm mrmVar2, long j, String str, String str2, boolean z, gyv gyvVar) {
        ArrayList<kyi> arrayListM16498F;
        if (!mrmVar.mo16813g() || !mrmVar2.mo16813g()) {
            ((nbe) ((nbe) f9820a.m17251b()).mo17276G((char) 740)).mo17293r("No MediaGroup or MediaFile. Could not insert %s video into MediaStore failed", str);
            return;
        }
        ctn ctnVar = this.f9826g;
        kqc kqcVar = ((gyj) mrmVar2.mo16809c()).f26832a;
        kqc kqcVar2 = ((gyj) mrmVar2.mo16809c()).f26832a;
        if (ctnVar.f9487a.mo6184l(dhh.f11066S)) {
            ArrayList arrayList = new ArrayList();
            int iM5506a = ctn.m5506a(j);
            try {
                FileInputStream fileInputStreamMo14684d = kqcVar.mo14684d();
                try {
                    kyg kygVarM15054f = kyg.m15050c(fileInputStreamMo14684d).m15054f("moov");
                    kyg kygVarM15052b = kygVarM15054f.m15053e("mvhd").m15052b();
                    arrayList.add(Long.valueOf(kygVarM15052b.m15055g().f37725b + 4));
                    arrayList.add(Long.valueOf(kygVarM15052b.m15055g().f37725b + 8));
                    kyg kygVarM15052b2 = kygVarM15054f.m15052b();
                    byte[] bArrM15061a = kyk.m15061a("trak");
                    mrm mrmVar3 = kygVarM15052b2.f37721a;
                    if (mrmVar3.mo16813g()) {
                        kyi kyiVarM15057b = ((kyi) mrmVar3.mo16809c()).m15057b();
                        ArrayList arrayList2 = new ArrayList();
                        while (true) {
                            kyi kyiVarM16238q = lzd.m16238q(kyiVarM15057b);
                            if (kyiVarM16238q == null) {
                                break;
                            } else if (Arrays.equals(lzd.m16239r(kyiVarM16238q), bArrM15061a)) {
                                arrayList2.add(kyiVarM16238q);
                            }
                        }
                        arrayListM16498F = arrayList2;
                    } else {
                        arrayListM16498F = mkv.m16498F();
                    }
                    for (kyi kyiVar : arrayListM16498F) {
                        kyg kygVarM15052b3 = kyg.m15051d(kyiVar).m15053e("tkhd").m15052b();
                        arrayList.add(Long.valueOf(kygVarM15052b3.m15055g().f37725b + 4));
                        arrayList.add(Long.valueOf(kygVarM15052b3.m15055g().f37725b + 8));
                        kyg kygVarM15052b4 = kyg.m15051d(kyiVar).m15053e("mdia").m15053e("mdhd").m15052b();
                        arrayList.add(Long.valueOf(kygVarM15052b4.m15055g().f37725b + 4));
                        arrayList.add(Long.valueOf(kygVarM15052b4.m15055g().f37725b + 8));
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStreamMo14684d.getChannel()).position(((Long) it.next()).longValue());
                        int i = new DataInputStream(fileInputStreamMo14684d).readInt();
                        int i2 = i ^ Integer.MIN_VALUE;
                        if (dhk.m6164f(i2, iM5506a ^ Integer.MIN_VALUE) > 0) {
                            throw new ctm("Modification time already too large: " + i);
                        }
                        if (dhk.m6164f(Integer.MIN_VALUE ^ ctn.m5506a(j - TimeUnit.MILLISECONDS.convert(10L, TimeUnit.HOURS)), i2) > 0) {
                            throw new ctm("Existing modification time too early, won' fix: " + i);
                        }
                    }
                    fileInputStreamMo14684d.close();
                    FileOutputStream fileOutputStreamMo14685e = kqcVar2.mo14685e();
                    try {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileOutputStreamMo14685e.getChannel()).position(((Long) it2.next()).longValue());
                            new DataOutputStream(fileOutputStreamMo14685e).writeInt(iM5506a);
                        }
                        fileOutputStreamMo14685e.close();
                    } catch (Throwable th) {
                        try {
                            fileOutputStreamMo14685e.close();
                            throw th;
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        fileInputStreamMo14684d.close();
                        throw th3;
                    } catch (Throwable th4) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                        throw th3;
                    }
                }
            } catch (Exception e) {
                ctnVar.f9488b.mo13948j("Couldn't fix video duration", e);
            }
            ctnVar.f9488b.mo13940b("Successfully fixed creation time.");
        } else {
            ctnVar.f9488b.mo13940b("Not fixing creation time; disabled by flag.");
        }
        ((gyn) mrmVar.mo16809c()).m9985e(m5618a(gyvVar, (gyj) mrmVar2.mo16809c(), gywVar, ((Boolean) this.f9823d.mo10031c(gzy.f27036at)).booleanValue() ? gyx.MARS_STORE : gyx.MEDIA_STORE, z));
        if (!str2.isEmpty()) {
            ((gyj) mrmVar2.mo16809c()).f26832a.mo14688h(str2);
        }
        ((gyj) mrmVar2.mo16809c()).m9977b();
        ((gyn) mrmVar.mo16809c()).m9987g();
    }
}
