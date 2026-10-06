package p000;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.database.ContentObserver;
import android.media.MediaCodec;
import android.net.Uri;
import android.util.Log;
import java.io.FileDescriptor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lpe {

    /* JADX INFO: renamed from: a */
    public static lpe f38882a;

    /* JADX INFO: renamed from: b */
    public final Object f38883b;

    /* JADX INFO: renamed from: c */
    public final Object f38884c;

    public lpe() {
        this.f38884c = null;
        this.f38883b = null;
    }

    public lpe(Context context) {
        this.f38884c = context;
        lpd lpdVar = new lpd();
        this.f38883b = lpdVar;
        context.getContentResolver().registerContentObserver(jum.f34836a, true, lpdVar);
    }

    public lpe(Context context, dsx dsxVar, byte[] bArr, byte[] bArr2) {
        this.f38884c = context;
        this.f38883b = dsxVar;
    }

    public lpe(Context context, byte[] bArr) {
        this.f38883b = new lim();
        this.f38884c = context;
    }

    public lpe(Uri uri, ProviderInfo providerInfo) {
        this.f38883b = uri;
        this.f38884c = providerInfo;
    }

    private lpe(String str) {
        this.f38883b = str;
        this.f38884c = "brella";
    }

    public lpe(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.f38884c = byteBuffer;
        this.f38883b = bufferInfo;
    }

    public lpe(ByteBuffer byteBuffer, List list) {
        this.f38883b = byteBuffer;
        this.f38884c = list;
    }

    public lpe(List list, List list2) {
        this.f38883b = list;
        this.f38884c = list2;
    }

    public lpe(kol kolVar) {
        this.f38883b = kolVar;
        this.f38884c = new kja(this, null, null, null, null);
    }

    public lpe(ktz ktzVar, byte[] bArr) {
        this.f38884c = ktzVar;
        koc[] kocVarArr = (koc[]) ktzVar.f37200c;
        Comparator[] comparatorArr = new Comparator[kocVarArr.length];
        for (int i = 0; i < kocVarArr.length; i++) {
            Class cls = kocVarArr[i].f36675b;
            if (cls == String.class) {
                comparatorArr[i] = amx.f754r;
            } else if (cls == Integer.class) {
                comparatorArr[i] = amx.f755s;
            } else if (cls == Boolean.class) {
                comparatorArr[i] = amx.f756t;
            }
        }
        this.f38883b = new TreeMap(new koe(comparatorArr));
    }

    public lpe(kvt kvtVar, lme lmeVar, byte[] bArr, byte[] bArr2) {
        this.f38883b = kvtVar;
        this.f38884c = lmeVar;
    }

    public lpe(lby lbyVar) {
        this.f38883b = lqi.m15871p(2);
        this.f38884c = lbyVar;
    }

    public lpe(mrm mrmVar) {
        this.f38883b = new ArrayList();
        this.f38884c = mrmVar;
    }

    public lpe(oju ojuVar, oju ojuVar2) {
        this.f38883b = ojuVar;
        this.f38884c = ojuVar2;
    }

    public lpe(byte[] bArr) {
        this.f38883b = new HashMap();
        this.f38884c = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    static synchronized void m15801a() {
        Object obj;
        lpe lpeVar = f38882a;
        if (lpeVar != null && (obj = lpeVar.f38884c) != null && lpeVar.f38883b != null) {
            ((Context) obj).getContentResolver().unregisterContentObserver((ContentObserver) f38882a.f38883b);
        }
        f38882a = null;
    }

    /* JADX INFO: renamed from: e */
    public static lpe m15802e(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
        byteBufferAllocateDirect.put(byteBufferDuplicate);
        return new lpe(byteBufferAllocateDirect, bufferInfo2);
    }

    /* JADX INFO: renamed from: s */
    public static lpe m15803s(String str) {
        return new lpe(str);
    }

    /* JADX INFO: renamed from: b */
    public final void m15804b(lgb lgbVar) {
        ((kzd) this.f38883b).add(lgbVar);
    }

    /* JADX INFO: renamed from: c */
    public final List m15805c(kyo kyoVar) {
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = kyoVar.f37737a;
        int i3 = kyoVar.f37738b;
        while (true) {
            i = kyoVar.f37737a + kyoVar.f37738b;
            boolean z = true;
            if (i2 >= i) {
                break;
            }
            kyl kylVar = new kyl(this, new kyo(i2, i3), null, null, null);
            int i4 = ((kyo) kylVar.f37731c).f37738b + kylVar.f37729a;
            i3 -= i4;
            if (i3 < 0) {
                z = false;
            }
            lku.m15613H(z);
            arrayList.add(kylVar);
            i2 += i4;
        }
        lku.m15613H(i2 == i);
        lku.m15613H(i3 == 0);
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, lby] */
    /* JADX INFO: renamed from: d */
    public final ldx m15806d() {
        ?? r1 = this.f38884c;
        return new ldx(r1, lcf.m15165d(r1, new lbv(this, 3, null, null)), null);
    }

    /* JADX INFO: renamed from: f */
    public final kyn m15807f(kym kymVar) throws kyp {
        lku.m15669w(((mrm) this.f38884c).mo16813g());
        lku.m15669w(((String) ((kyl) ((mrm) this.f38884c).mo16809c()).f37730b).equals(kymVar.f37734b));
        if (((kyo) ((kyl) ((mrm) this.f38884c).mo16809c()).f37731c).f37738b < kymVar.f37733a + 4) {
            throw new kyp(String.format(Locale.US, "Trying to look up offset %d in box %s but the box is only %d bytes long", Integer.valueOf(kymVar.f37733a), ((kyl) ((mrm) this.f38884c).mo16809c()).f37730b, Integer.valueOf(((kyo) ((kyl) ((mrm) this.f38884c).mo16809c()).f37731c).f37738b)));
        }
        kyl kylVar = (kyl) ((mrm) this.f38884c).mo16809c();
        return new kyn((lpe) kylVar.f37732d, ((kyo) kylVar.f37731c).f37737a + kymVar.f37733a, null, null, null);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: g */
    public final List m15808g(String str) {
        ArrayList arrayList = new ArrayList();
        for (lpe lpeVar : this.f38883b) {
            lku.m15613H(((mrm) lpeVar.f38884c).mo16813g());
            if (((String) ((kyl) ((mrm) lpeVar.f38884c).mo16809c()).f37730b).equals(str)) {
                arrayList.add(lpeVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public final void m15809h(String str) {
        m15811j(Level.FINE, (String) this.f38883b, null, str, new Object[0]);
    }

    /* JADX INFO: renamed from: i */
    public final void m15810i(String str, Object... objArr) {
        m15811j(Level.FINE, (String) this.f38883b, null, str, objArr);
    }

    /* JADX INFO: renamed from: j */
    public final void m15811j(Level level, String str, Throwable th, String str2, Object... objArr) {
        int i;
        if (level.equals(Level.SEVERE)) {
            i = 6;
        } else if (level.equals(Level.WARNING)) {
            i = 5;
        } else if (level.equals(Level.INFO)) {
            i = 4;
        } else {
            i = level.equals(Level.FINE) ? 3 : 5;
        }
        if (objArr.length > 0) {
            str2 = String.format(str2, objArr);
        }
        if (th != null) {
            str2 = str2 + "\n" + Log.getStackTraceString(th);
        }
        Log.println(i, ((String) this.f38884c) + "." + str, str2);
    }

    /* JADX INFO: renamed from: k */
    public final void m15812k(Intent intent) {
        try {
            ((Context) this.f38884c).startActivity(intent);
        } catch (ActivityNotFoundException e) {
            lvd.f39383a.m16090d(this, "Could not find application for intent fulfillment.", new Object[0]);
            ((dsx) this.f38883b).m6700o();
        }
    }

    /* JADX INFO: renamed from: l */
    public final String m15813l() {
        return (String) ((ktz) this.f38884c).f37199b;
    }

    /* JADX INFO: renamed from: m */
    public final koc[] m15814m() {
        return (koc[]) ((ktz) this.f38884c).f37200c;
    }

    /* JADX INFO: renamed from: n */
    public final void m15815n(String str, int i, int i2) {
        ((kja) this.f38884c).f36237c.m14852d(str, Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: o */
    public final void m15816o(int i, boolean z) {
        ((kja) this.f38884c).f36240f.m14852d(Integer.valueOf(i), Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: p */
    public final void m15817p(String str, String str2, int i, int i2, int i3, int i4) {
        ((kja) this.f38884c).f36242h.m14852d(str, str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: q */
    public final void m15818q(lpe lpeVar, List list) {
        lpe lpeVar2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kyl kylVar = (kyl) it.next();
            if (this.f38884c.contains(kylVar.f37730b)) {
                lpeVar2 = new lpe(mrm.m16829i(kylVar));
                m15818q(lpeVar2, m15805c((kyo) kylVar.f37731c));
            } else {
                lpeVar2 = new lpe(mrm.m16829i(kylVar));
            }
            mrm.m16829i(lpeVar);
            lpeVar.f38883b.add(lpeVar2);
        }
    }

    /* JADX INFO: renamed from: r */
    public final lpe m15819r(String str) throws kyp {
        List listM15808g = m15808g(str);
        if (listM15808g.size() == 1) {
            return (lpe) listM15808g.get(0);
        }
        mrm mrmVar = (mrm) this.f38884c;
        throw new kyp(String.format(Locale.US, "Looking for a unique %s box in a %s box but found %d of them", str, mrmVar.mo16813g() ? ((kyl) mrmVar.mo16809c()).f37730b : "n/a", Integer.valueOf(listM15808g.size())));
    }

    public lpe(FileDescriptor fileDescriptor) {
        this.f38883b = mrm.m16829i(fileDescriptor);
        this.f38884c = mqu.f41450a;
    }
}
