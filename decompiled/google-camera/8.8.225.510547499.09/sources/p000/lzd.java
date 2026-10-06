package p000;

import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.smarts.ScBZ.IuyLAqNmW;
import com.google.android.apps.camera.util.p015ui.mfv.EArqVBjecl;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import p021j$.nio.channels.DesugarChannels;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class lzd {
    public lzd() {
    }

    public lzd(oqo oqoVar, lyz lyzVar, lzh lzhVar, ksi ksiVar, mav mavVar, mat matVar) {
        oqoVar.getClass();
        lyzVar.getClass();
        lzhVar.getClass();
        ksiVar.getClass();
        mavVar.getClass();
        matVar.getClass();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m16223a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: renamed from: b */
    public static lve m16224b(GoogleSignInAccount googleSignInAccount) {
        String str = googleSignInAccount.f7558b;
        if (str != null) {
            return new lve(str, googleSignInAccount.f7560d, googleSignInAccount.f7561e, googleSignInAccount.f7562f);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static double m16225c(double d) {
        double d2 = 0.0d;
        if (d >= 0.0d) {
            d2 = 0.99d;
            if (d <= 0.99d) {
                return d;
            }
        }
        return d2;
    }

    /* JADX INFO: renamed from: d */
    public static double m16226d(long j) {
        double d = j;
        if (d < 0.1d) {
            return 0.1d;
        }
        return d;
    }

    /* JADX INFO: renamed from: e */
    public static Object m16227e(mav mavVar, mea meaVar, oer oerVar, Throwable th, ols olsVar) {
        Object objM16285a = mavVar.m16285a(meaVar.f40163c.m16280a(omn.m18666F(meaVar.f40161a), meaVar.f40162b, oerVar, th), olsVar);
        return objM16285a == oma.COROUTINE_SUSPENDED ? objM16285a : oki.f46196a;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:29:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public static Object m16228f(mav mavVar, mea meaVar, oni oniVar, ols olsVar) throws Throwable {
        mdx mdxVar;
        List list;
        mau mauVar;
        List listM18668H;
        mav mavVar2;
        Throwable th;
        oer oerVar;
        lvo lvoVarM16280a;
        if (olsVar instanceof mdx) {
            mdxVar = (mdx) olsVar;
            int i = mdxVar.f40150c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mdxVar.f40150c = i - Integer.MIN_VALUE;
            } else {
                mdxVar = new mdx(olsVar);
            }
        } else {
            mdxVar = new mdx(olsVar);
        }
        Object objMo1803a = mdxVar.f40149b;
        Object obj = oma.COROUTINE_SUSPENDED;
        switch (mdxVar.f40150c) {
            case 0:
                lkm.m15592s(objMo1803a);
                lzb lzbVar = meaVar.f40161a;
                list = meaVar.f40162b;
                mauVar = meaVar.f40163c;
                oer oerVar2 = oer.ERROR_UPDATE;
                listM18668H = omn.m18668H(lzbVar);
                try {
                    mdxVar.f40148a = list;
                    mdxVar.f40151d = mauVar;
                    mdxVar.f40152e = oerVar2;
                    mdxVar.f40153f = mavVar;
                    mdxVar.f40154g = listM18668H;
                    mdxVar.f40150c = 1;
                    objMo1803a = oniVar.mo1803a(mdxVar);
                    return objMo1803a == obj ? obj : objMo1803a;
                } catch (Throwable th2) {
                    mavVar2 = mavVar;
                    th = th2;
                    oerVar = oerVar2;
                    if (!(th instanceof CancellationException)) {
                        throw th;
                    }
                    lvoVarM16280a = mauVar.m16280a(listM18668H, list, oerVar, th);
                    mdxVar.f40148a = th;
                    mdxVar.f40151d = null;
                    mdxVar.f40152e = null;
                    mdxVar.f40153f = null;
                    mdxVar.f40154g = null;
                    mdxVar.f40150c = 2;
                    if (mavVar2.m16285a(lvoVarM16280a, mdxVar) == obj) {
                        return obj;
                    }
                    throw th;
                }
            case 1:
                List list2 = mdxVar.f40154g;
                mavVar2 = mdxVar.f40153f;
                oerVar = mdxVar.f40152e;
                mauVar = mdxVar.f40151d;
                list = (List) mdxVar.f40148a;
                try {
                    lkm.m15592s(objMo1803a);
                } catch (Throwable th3) {
                    listM18668H = list2;
                    th = th3;
                    if (!(th instanceof CancellationException)) {
                        throw th;
                    }
                    lvoVarM16280a = mauVar.m16280a(listM18668H, list, oerVar, th);
                    mdxVar.f40148a = th;
                    mdxVar.f40151d = null;
                    mdxVar.f40152e = null;
                    mdxVar.f40153f = null;
                    mdxVar.f40154g = null;
                    mdxVar.f40150c = 2;
                    if (mavVar2.m16285a(lvoVarM16280a, mdxVar) == obj) {
                        return obj;
                    }
                    throw th;
                }
            case 2:
                Throwable th4 = (Throwable) mdxVar.f40148a;
                lkm.m15592s(objMo1803a);
                throw th4;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: g */
    public static Object m16229g(mav mavVar, mcf mcfVar, oer oerVar, Throwable th, ols olsVar) {
        Object objM16285a = mavVar.m16285a(mcfVar.f39937c.m16280a(omn.m18666F(mcfVar.f39935a), omn.m18666F(mcfVar.f39936b), oerVar, th), olsVar);
        return objM16285a == oma.COROUTINE_SUSPENDED ? objM16285a : oki.f46196a;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0079  */
    /* JADX WARN: Code duplicated, block: B:29:0x0091 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public static Object m16230h(mav mavVar, mcf mcfVar, oni oniVar, ols olsVar) {
        mdb mdbVar;
        mau mauVar;
        List listM18668H;
        mav mavVar2;
        Throwable th;
        List list;
        oer oerVar;
        lvo lvoVarM16280a;
        if (olsVar instanceof mdb) {
            mdbVar = (mdb) olsVar;
            int i = mdbVar.f40041c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mdbVar.f40041c = i - Integer.MIN_VALUE;
            } else {
                mdbVar = new mdb(olsVar);
            }
        } else {
            mdbVar = new mdb(olsVar);
        }
        Object objMo1803a = mdbVar.f40040b;
        Object obj = oma.COROUTINE_SUSPENDED;
        switch (mdbVar.f40041c) {
            case 0:
                lkm.m15592s(objMo1803a);
                lzb lzbVar = mcfVar.f39935a;
                lxm lxmVar = mcfVar.f39936b;
                mauVar = mcfVar.f39937c;
                oer oerVar2 = oer.ERROR_UPDATE;
                List listM18666F = omn.m18666F(lxmVar);
                listM18668H = omn.m18668H(lzbVar);
                try {
                    mdbVar.f40039a = mauVar;
                    mdbVar.f40042d = oerVar2;
                    mdbVar.f40043e = listM18666F;
                    mdbVar.f40044f = mavVar;
                    mdbVar.f40045g = listM18668H;
                    mdbVar.f40041c = 1;
                    objMo1803a = oniVar.mo1803a(mdbVar);
                    return objMo1803a == obj ? obj : objMo1803a;
                } catch (Throwable th2) {
                    mavVar2 = mavVar;
                    th = th2;
                    list = listM18666F;
                    oerVar = oerVar2;
                    if (!(th instanceof CancellationException)) {
                        throw th;
                    }
                    lvoVarM16280a = mauVar.m16280a(listM18668H, list, oerVar, th);
                    mdbVar.f40039a = th;
                    mdbVar.f40042d = null;
                    mdbVar.f40043e = null;
                    mdbVar.f40044f = null;
                    mdbVar.f40045g = null;
                    mdbVar.f40041c = 2;
                    if (mavVar2.m16285a(lvoVarM16280a, mdbVar) == obj) {
                        return obj;
                    }
                    throw th;
                }
            case 1:
                List list2 = mdbVar.f40045g;
                mavVar2 = mdbVar.f40044f;
                list = mdbVar.f40043e;
                oerVar = mdbVar.f40042d;
                mauVar = (mau) mdbVar.f40039a;
                try {
                    lkm.m15592s(objMo1803a);
                } catch (Throwable th3) {
                    listM18668H = list2;
                    th = th3;
                    if (!(th instanceof CancellationException)) {
                        throw th;
                    }
                    lvoVarM16280a = mauVar.m16280a(listM18668H, list, oerVar, th);
                    mdbVar.f40039a = th;
                    mdbVar.f40042d = null;
                    mdbVar.f40043e = null;
                    mdbVar.f40044f = null;
                    mdbVar.f40045g = null;
                    mdbVar.f40041c = 2;
                    if (mavVar2.m16285a(lvoVarM16280a, mdbVar) == obj) {
                        return obj;
                    }
                    throw th;
                }
            case 2:
                Throwable th4 = (Throwable) mdbVar.f40039a;
                lkm.m15592s(objMo1803a);
                throw th4;
            default:
                throw new IllegalStateException(IuyLAqNmW.OUe);
        }
    }

    /* JADX INFO: renamed from: j */
    public static lby m16231j(lby lbyVar) {
        return new lcv(lbyVar);
    }

    /* JADX INFO: renamed from: k */
    public static lby m16232k(leb lebVar, String str) {
        AmbientMode.AmbientController ambientControllerM16243v = m16243v();
        kzq kzqVarM15095b = kzq.m15095b(str, lqi.m15870o());
        kzqVarM15095b.m15096a();
        lcc lccVarM16233l = m16233l(kzqVarM15095b);
        lccVarM16233l.m15163m(new ldx(lccVarM16233l, lqi.m15863h(lccVarM16233l, new lcj(lebVar, ambientControllerM16243v, null, null, null, null)), null, null));
        return lccVarM16233l;
    }

    /* JADX INFO: renamed from: l */
    public static lcc m16233l(kzq kzqVar) {
        return new lci(kzqVar, kzqVar);
    }

    /* JADX INFO: renamed from: m */
    public static void m16234m(lby lbyVar) {
        lbyVar.mo15154f(fse.f23452g, lcg.f37916a);
        m16235n(lbyVar);
    }

    /* JADX INFO: renamed from: n */
    public static void m16235n(lby lbyVar) {
        ldb ldbVarMo15152d = lbyVar.mo15152d();
        try {
            ldbVarMo15152d.mo15194a();
            if (ldbVarMo15152d != null) {
                ldbVarMo15152d.close();
            }
        } catch (Throwable th) {
            if (ldbVarMo15152d != null) {
                try {
                    ldbVarMo15152d.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception e) {
                    }
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: o */
    public static lbl m16236o(lbl lblVar, kzi kziVar) {
        try {
            return lblVar.mo15142b(kziVar);
        } catch (ClassCastException e) {
            throw new AssertionError("Resizable layout returns wrong type!", e);
        }
    }

    /* JADX INFO: renamed from: p */
    public static kyh m16237p(kyi kyiVar) throws kyf, IOException {
        if (kyiVar.m15056a() < 8) {
            throw new kyf(String.format(Locale.US, "Box too small: remaining=%s", Long.valueOf(kyiVar.m15056a())));
        }
        m16240s(kyiVar.f37724a).position(kyiVar.f37725b + kyiVar.f37727d);
        long jM15056a = ((long) new DataInputStream(kyiVar.f37724a).readInt()) & 4294967295L;
        if (jM15056a != 1) {
            if (jM15056a == 0) {
                jM15056a = kyiVar.m15056a();
            }
            return new kyh(jM15056a, false);
        }
        if (kyiVar.m15056a() < 16) {
            throw new kyf(String.format(Locale.US, "64-bit box too small just %s bytes remaining", Long.valueOf(kyiVar.m15056a())));
        }
        m16240s(kyiVar.f37724a).position(kyiVar.f37725b + kyiVar.f37727d + 8);
        long j = new DataInputStream(kyiVar.f37724a).readLong();
        if (j >= 0) {
            return new kyh(j, true);
        }
        throw new kyf(String.format(Locale.US, "64-bit box size too large: 0x%x", Long.valueOf(j)));
    }

    /* JADX INFO: renamed from: q */
    public static kyi m16238q(kyi kyiVar) throws kyj {
        if (kyiVar.m15056a() == 0) {
            return null;
        }
        long j = m16237p(kyiVar).f37722a;
        if (j > kyiVar.m15056a()) {
            throw new kyj(j, kyiVar.m15056a());
        }
        kyi kyiVarM15057b = kyiVar.m15057b();
        kyiVarM15057b.m15059d(kyiVarM15057b.f37727d + j);
        kyiVar.m15060e(kyiVar.f37727d + j);
        return kyiVarM15057b.m15058c();
    }

    /* JADX INFO: renamed from: r */
    public static byte[] m16239r(kyi kyiVar) throws kyf, IOException {
        if (kyiVar.m15056a() < 8) {
            throw new kyf(String.format(Locale.US, EArqVBjecl.uhkVZgfwSis, Long.valueOf(kyiVar.m15056a())));
        }
        lku.m15669w(kyiVar.m15056a() >= 8);
        kyi kyiVarM15057b = kyiVar.m15057b();
        kyiVarM15057b.m15060e(kyiVar.f37727d + 4);
        kyiVarM15057b.m15059d(kyiVarM15057b.f37727d + 4);
        kyi kyiVarM15058c = kyiVarM15057b.m15058c();
        m16240s(kyiVarM15058c.f37724a).position(kyiVarM15058c.f37725b + kyiVarM15058c.f37727d);
        if (kyiVarM15058c.m15056a() >= 2147483647L) {
            throw new IOException("Can't read contents of a >2GB span");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) kyiVarM15058c.m15056a());
        int i = m16240s(kyiVarM15058c.f37724a).read(byteBufferAllocate);
        if (i == kyiVarM15058c.m15056a()) {
            byteBufferAllocate.rewind();
            byte[] bArr = new byte[4];
            byteBufferAllocate.get(bArr);
            return bArr;
        }
        throw new IOException("Was supposed to have " + kyiVarM15058c.m15056a() + " bytes remaining but only read " + i);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ FileChannel m16240s(FileInputStream fileInputStream) {
        return DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
    }

    /* JADX INFO: renamed from: v */
    public static AmbientMode.AmbientController m16243v() {
        return new AmbientMode.AmbientController(new lbm(kzi.m15087d(1, 1)));
    }

    /* JADX INFO: renamed from: i */
    public final our m16244i(oeh oehVar, String str, String str2) {
        return ook.m18782T(new mci(str, this, oehVar, str2, null, null, null, null));
    }

    public lzd(lij lijVar, byte[] bArr, byte[] bArr2) {
        lijVar.getClass();
    }
}
