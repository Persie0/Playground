package p000;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import p021j$.nio.channels.DesugarChannels;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class kyg {

    /* JADX INFO: renamed from: a */
    public final mrm f37721a;

    static {
        ncg.m17327h("Mp4BoxFileSlicer");
    }

    public kyg(mrm mrmVar) {
        this.f37721a = mrmVar;
    }

    /* JADX INFO: renamed from: a */
    public static kyg m15049a() {
        return new kyg(mqu.f41450a);
    }

    /* JADX INFO: renamed from: c */
    public static kyg m15050c(FileInputStream fileInputStream) throws IOException {
        long size = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel()).size();
        return size < 0 ? m15049a() : new kyg(mrm.m16829i(new kyi(fileInputStream, 0L, size)));
    }

    /* JADX INFO: renamed from: d */
    public static kyg m15051d(kyi kyiVar) {
        return new kyg(mrm.m16829i(kyiVar));
    }

    /* JADX INFO: renamed from: b */
    public final kyg m15052b() throws kyf, IOException {
        mrm mrmVarM16829i;
        mrm mrmVar = this.f37721a;
        if (!mrmVar.mo16813g()) {
            return m15049a();
        }
        kyi kyiVar = (kyi) mrmVar.mo16809c();
        kyh kyhVarM16237p = lzd.m16237p(kyiVar);
        if (kyhVarM16237p.f37722a != kyiVar.m15056a()) {
            throw new kyf(String.format(Locale.US, "contents failed - argument has length %s but claims length of %s", Long.valueOf(kyiVar.m15056a()), Long.valueOf(kyhVarM16237p.f37722a)));
        }
        int i = true != kyhVarM16237p.f37723b ? 8 : 16;
        kyi kyiVarM15057b = kyiVar.m15057b();
        long j = kyiVar.f37727d + ((long) i);
        if (j <= kyiVarM15057b.f37728e) {
            kyiVarM15057b.m15060e(j);
            mrmVarM16829i = mrm.m16829i(kyiVarM15057b.m15058c());
        } else {
            mrmVarM16829i = mqu.f41450a;
        }
        return new kyg(mrmVarM16829i);
    }

    /* JADX INFO: renamed from: e */
    public final kyg m15053e(String str) {
        return m15052b().m15054f(str);
    }

    /* JADX INFO: renamed from: f */
    public final kyg m15054f(String str) throws kyj {
        mrm mrmVar = this.f37721a;
        if (!mrmVar.mo16813g()) {
            return m15049a();
        }
        kyi kyiVarM15057b = ((kyi) mrmVar.mo16809c()).m15057b();
        byte[] bArrM15061a = kyk.m15061a(str);
        kyi kyiVar = null;
        while (true) {
            kyi kyiVarM16238q = lzd.m16238q(kyiVarM15057b);
            if (kyiVarM16238q == null) {
                return kyiVar == null ? m15049a() : new kyg(mrm.m16829i(kyiVar));
            }
            if (Arrays.equals(lzd.m16239r(kyiVarM16238q), bArrM15061a)) {
                if (kyiVar != null) {
                    return m15049a();
                }
                kyiVar = kyiVarM16238q;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final kyi m15055g() {
        return (kyi) this.f37721a.mo16809c();
    }
}
