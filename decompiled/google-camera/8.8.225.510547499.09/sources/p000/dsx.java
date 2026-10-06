package p000;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.Paint;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.preference.Preference;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthResult;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dsx {

    /* JADX INFO: renamed from: a */
    public final Object f12521a;

    /* JADX INFO: renamed from: b */
    public final Object f12522b;

    public dsx() {
        this.f12521a = new HashMap();
        this.f12522b = new HashMap();
    }

    public dsx(Context context, hst hstVar) {
        this.f12521a = context;
        this.f12522b = hstVar;
    }

    public dsx(Context context, jvd jvdVar) {
        this.f12521a = context;
        this.f12522b = jvdVar;
    }

    public dsx(Paint paint, Paint paint2) {
        this.f12521a = paint;
        this.f12522b = paint2;
    }

    public dsx(Preference preference) {
        this.f12521a = "camera.onscreen_logcat_filter";
        this.f12522b = preference;
    }

    public dsx(androidx.preference.Preference preference) {
        this.f12521a = "camera.onscreen_logcat_filter";
        this.f12522b = preference;
    }

    public dsx(bko bkoVar, hai haiVar, byte[] bArr, byte[] bArr2) {
        this.f12521a = bkoVar;
        this.f12522b = haiVar;
    }

    public dsx(bti btiVar, btg btgVar) {
        this.f12522b = btiVar;
        this.f12521a = btgVar;
    }

    public dsx(bzq bzqVar, byte[] bArr) {
        this.f12521a = new HashMap();
        this.f12522b = bzqVar;
    }

    public dsx(cny cnyVar, cnw cnwVar, int i) {
        long millis;
        long millis2;
        ArrayList arrayList = new ArrayList();
        this.f12522b = arrayList;
        StringBuilder sb = new StringBuilder();
        long jLongValue = cnwVar.f6397a == 1 ? ((Long) cnwVar.f6398b).longValue() : 0L;
        sb.append("session_id");
        if (jLongValue > 0) {
            sb.append(" < ?");
        } else {
            sb.append(" > ?");
        }
        arrayList.add(Long.toString(jLongValue));
        nzw nzwVar = cnyVar.f6406e;
        long j = (nzwVar == null ? nzw.f45101c : nzwVar).f45103a;
        nzw nzwVar2 = cnyVar.f6407f;
        long j2 = (nzwVar2 == null ? nzw.f45101c : nzwVar2).f45103a;
        if (j == 0) {
            millis = 0;
        } else {
            long millis3 = TimeUnit.SECONDS.toMillis(j);
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            nzw nzwVar3 = cnyVar.f6406e;
            millis = millis3 + timeUnit.toMillis((nzwVar3 == null ? nzw.f45101c : nzwVar3).f45104b);
        }
        if (j2 == 0) {
            millis2 = Long.MAX_VALUE;
        } else {
            long millis4 = TimeUnit.SECONDS.toMillis(j2);
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            nzw nzwVar4 = cnyVar.f6407f;
            millis2 = timeUnit2.toMillis((nzwVar4 == null ? nzw.f45101c : nzwVar4).f45104b) + millis4;
        }
        sb.append(" AND (time BETWEEN CAST(? as INTEGER) AND CAST(? as INTEGER))");
        arrayList.add(String.valueOf(millis));
        arrayList.add(String.valueOf(millis2));
        sb.append(" ORDER BY session_id LIMIT ?");
        arrayList.add(String.valueOf(i));
        this.f12521a = String.format("%s WHERE %s", "SELECT session_id,value FROM session", sb);
    }

    public dsx(DynamicDepthResult dynamicDepthResult, gug gugVar) {
        this.f12521a = dynamicDepthResult;
        this.f12522b = gugVar;
    }

    public dsx(czs czsVar, crh crhVar) {
        this.f12521a = czsVar;
        this.f12522b = crhVar;
    }

    public dsx(dhv dhvVar, kpb kpbVar) {
        this.f12521a = dhvVar;
        this.f12522b = kpbVar;
    }

    public dsx(fcp fcpVar, mpx mpxVar, byte[] bArr) {
        this.f12522b = fcpVar;
        this.f12521a = mpxVar;
    }

    public dsx(imu imuVar, kbc kbcVar) {
        this.f12521a = imuVar;
        this.f12522b = kbcVar;
    }

    public dsx(Class cls, bqf bqfVar) {
        this.f12521a = cls;
        this.f12522b = bqfVar;
    }

    public dsx(Class cls, bqu bquVar) {
        this.f12522b = cls;
        this.f12521a = bquVar;
    }

    public dsx(String str, String str2) {
        str.getClass();
        this.f12522b = str;
        this.f12521a = str2;
    }

    public dsx(List list, btg btgVar) {
        this.f12522b = list;
        this.f12521a = btgVar;
    }

    public dsx(jww jwwVar) {
        this.f12521a = jwwVar;
        this.f12522b = "off";
    }

    public dsx(oju ojuVar, cwd cwdVar) {
        this.f12521a = ojuVar;
        this.f12522b = cwdVar;
    }

    public dsx(byte[] bArr, byte[] bArr2) {
        this.f12522b = new AtomicReference();
        this.f12521a = new C1109wy();
    }

    public dsx(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f12521a = new HashMap();
        this.f12522b = new HashMap();
    }

    public dsx(float[] fArr, int[] iArr) {
        this.f12521a = fArr;
        this.f12522b = iArr;
    }

    private dsx(String[] strArr, pba pbaVar) {
        this.f12522b = strArr;
        this.f12521a = pbaVar;
    }

    /* JADX INFO: renamed from: A */
    public static final boolean m6673A(ImageHeaderParser$ImageType imageHeaderParser$ImageType) {
        return imageHeaderParser$ImageType == ImageHeaderParser$ImageType.ANIMATED_WEBP;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003c A[Catch: IOException -> 0x029a, TryCatch #0 {IOException -> 0x029a, blocks: (B:3:0x0002, B:4:0x000c, B:6:0x0011, B:8:0x0020, B:10:0x0028, B:20:0x003c, B:21:0x003f, B:22:0x004b, B:24:0x0050, B:25:0x0053, B:31:0x006c, B:33:0x007e, B:32:0x0075, B:34:0x0083, B:35:0x0099, B:36:0x009a, B:38:0x00af, B:39:0x00b2, B:41:0x00ba, B:42:0x00c7, B:44:0x00dc, B:51:0x00f6, B:53:0x0104, B:56:0x010a, B:58:0x0110, B:57:0x010d, B:59:0x011e, B:60:0x013f, B:61:0x0140, B:62:0x0161, B:63:0x0162, B:66:0x0170, B:68:0x0176, B:69:0x017f, B:71:0x0185, B:73:0x0198, B:75:0x01a2, B:77:0x01b8, B:78:0x01bf, B:79:0x01c2, B:80:0x01dc, B:82:0x01e0, B:83:0x01fa, B:85:0x0202, B:87:0x0214, B:89:0x021c, B:91:0x022e, B:97:0x0287, B:92:0x0250, B:94:0x027a, B:95:0x0284, B:98:0x028c, B:99:0x0291, B:100:0x0292, B:101:0x0299), top: B:106:0x0002 }] */
    /* JADX INFO: renamed from: J */
    public static dsx m6674J(String... strArr) {
        int iM19259b;
        int i;
        pax paxVar;
        String str;
        try {
            int length = strArr.length;
            pax[] paxVarArr = new pax[length];
            pau pauVar = new pau();
            int i2 = 0;
            for (int i3 = 0; i3 < strArr.length; i3++) {
                String str2 = strArr[i3];
                String[] strArr2 = blt.f3707a;
                pauVar.mo19274q();
                int length2 = str2.length();
                int i4 = 0;
                for (int i5 = 0; i5 < length2; i5++) {
                    char cCharAt = str2.charAt(i5);
                    if (cCharAt < 128) {
                        str = strArr2[cCharAt];
                        if (str != null) {
                            if (i4 < i5) {
                                pauVar.m19276s(str2, i4, i5);
                            }
                            str.getClass();
                            pauVar.m19276s(str, 0, str.length());
                            i4 = i5 + 1;
                        }
                    } else {
                        if (cCharAt == 8232) {
                            str = "\\u2028";
                        } else if (cCharAt == 8233) {
                            str = "\\u2029";
                        }
                        if (i4 < i5) {
                            pauVar.m19276s(str2, i4, i5);
                        }
                        str.getClass();
                        pauVar.m19276s(str, 0, str.length());
                        i4 = i5 + 1;
                    }
                }
                if (i4 < length2) {
                    pauVar.m19276s(str2, i4, length2);
                }
                pauVar.mo19274q();
                pauVar.m19259b();
                long j = pauVar.f47299b;
                if (j < 0 || j > 2147483647L) {
                    throw new IllegalArgumentException("byteCount: " + j);
                }
                if (j >= 4096) {
                    paxVar = pauVar.m19266i((int) j);
                    pauVar.m19269l(j);
                } else {
                    paxVar = new pax(pauVar.m19271n(j));
                }
                paxVarArr[i3] = paxVar;
            }
            String[] strArr3 = (String[]) strArr.clone();
            lku lkuVar = pba.f47307c;
            List listM18688ab = omn.m18688ab(paxVarArr);
            int i6 = 1;
            if (listM18688ab.size() > 1) {
                Collections.sort(listM18688ab);
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i7 = 0; i7 < length; i7++) {
                pax paxVar2 = paxVarArr[i7];
                arrayList.add(-1);
            }
            Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[0]);
            List listM18669I = omn.m18669I(Arrays.copyOf(numArr, numArr.length));
            int i8 = 0;
            int i9 = 0;
            while (i8 < length) {
                pax paxVar3 = paxVarArr[i8];
                int i10 = i9 + 1;
                int size = listM18688ab.size();
                int size2 = listM18688ab.size();
                if (size < 0) {
                    throw new IllegalArgumentException("fromIndex (0) is greater than toIndex (" + size + ").");
                }
                if (size > size2) {
                    throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
                }
                int i11 = size - 1;
                int i12 = 0;
                while (true) {
                    if (i12 > i11) {
                        i = -(i12 + 1);
                        break;
                    }
                    i = (i12 + i11) >>> i6;
                    int iM18711p = omn.m18711p((Comparable) listM18688ab.get(i), paxVar3);
                    if (iM18711p >= 0) {
                        if (iM18711p <= 0) {
                            break;
                        }
                        i11 = i - 1;
                    } else {
                        i12 = i + 1;
                    }
                    i6 = 1;
                }
                listM18669I.set(i, Integer.valueOf(i9));
                i8++;
                i9 = i10;
                i6 = 1;
            }
            if (((pax) listM18688ab.get(0)).mo19280b() <= 0) {
                throw new IllegalArgumentException("the empty byte string is not a supported option");
            }
            int i13 = 0;
            while (i13 < listM18688ab.size()) {
                pax paxVar4 = (pax) listM18688ab.get(i13);
                int i14 = i13 + 1;
                int i15 = i14;
                while (i15 < listM18688ab.size()) {
                    pax paxVar5 = (pax) listM18688ab.get(i15);
                    paxVar4.getClass();
                    if (!paxVar5.mo19284g(paxVar4, paxVar4.mo19280b())) {
                        break;
                    }
                    if (paxVar5.mo19280b() == paxVar4.mo19280b()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("duplicate option: ");
                        sb.append(paxVar5);
                        throw new IllegalArgumentException("duplicate option: ".concat(String.valueOf(paxVar5)));
                    }
                    if (((Number) listM18669I.get(i15)).intValue() > ((Number) listM18669I.get(i13)).intValue()) {
                        listM18688ab.remove(i15);
                        listM18669I.remove(i15);
                    } else {
                        i15++;
                    }
                }
                i13 = i14;
            }
            pau pauVar2 = new pau();
            lkuVar.m15673V(0L, pauVar2, 0, listM18688ab, 0, listM18688ab.size(), listM18669I);
            int[] iArr = new int[(int) lku.m15627W(pauVar2)];
            while (true) {
                long j2 = pauVar2.f47299b;
                if (j2 == 0) {
                    Object[] objArrCopyOf = Arrays.copyOf(paxVarArr, length);
                    objArrCopyOf.getClass();
                    return new dsx(strArr3, new pba((pax[]) objArrCopyOf, iArr));
                }
                int i16 = i2 + 1;
                if (j2 < 4) {
                    throw new EOFException();
                }
                pbd pbdVar = pauVar2.f47298a;
                pbdVar.getClass();
                int i17 = pbdVar.f47315b;
                int i18 = pbdVar.f47316c;
                if (i18 - i17 < 4) {
                    iM19259b = ((pauVar2.m19259b() & 255) << 24) | ((pauVar2.m19259b() & 255) << 16) | ((pauVar2.m19259b() & 255) << 8) | (pauVar2.m19259b() & 255);
                } else {
                    byte[] bArr = pbdVar.f47314a;
                    int i19 = i17 + 1;
                    int i20 = (bArr[i17] & 255) << 24;
                    int i21 = i19 + 1;
                    int i22 = ((bArr[i19] & 255) << 16) | i20;
                    int i23 = i21 + 1;
                    int i24 = i22 | ((bArr[i21] & 255) << 8);
                    int i25 = i23 + 1;
                    int i26 = (bArr[i23] & 255) | i24;
                    pauVar2.f47299b = j2 - 4;
                    if (i25 == i18) {
                        pauVar2.f47298a = pbdVar.m19287a();
                        pbe.m19292b(pbdVar);
                    } else {
                        pbdVar.f47315b = i25;
                    }
                    iM19259b = i26;
                }
                iArr[i2] = iM19259b;
                i2 = i16;
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: K */
    private static final gug m6675K(Future future) {
        if (future == null) {
            return null;
        }
        if (!future.isDone()) {
            future.cancel(true);
            return null;
        }
        try {
            return (gug) future.get();
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            if (!(e instanceof InterruptedException)) {
                return null;
            }
            Thread.currentThread().interrupt();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: L */
    private final synchronized List m6676L(String str) {
        List arrayList;
        if (!this.f12521a.contains(str)) {
            this.f12521a.add(str);
        }
        arrayList = (List) this.f12522b.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f12522b.put(str, arrayList);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: z */
    public static final bsz m6677z(ImageDecoder.Source source, int i, int i2, bqr bqrVar) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new bwe(i, i2, bqrVar));
        if (drawableDecodeDrawable instanceof AnimatedImageDrawable) {
            return new bxz((AnimatedImageDrawable) drawableDecodeDrawable, 2);
        }
        throw new IOException("Received unexpected drawable type for animated webp, failing: ".concat(String.valueOf(String.valueOf(drawableDecodeDrawable))));
    }

    /* JADX INFO: renamed from: B */
    public final synchronized List m6678B(Class cls) {
        return ((bvq) this.f12522b).m3102c(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: C */
    public final synchronized List m6679C(Class cls) {
        Object obj;
        List listUnmodifiableList;
        bko bkoVar = (bko) ((bko) this.f12521a).f3652a.get(cls);
        if (bkoVar == null) {
            listUnmodifiableList = 0;
        } else {
            obj = bkoVar.f3652a;
        }
        if (listUnmodifiableList == 0) {
            listUnmodifiableList = obj;
            listUnmodifiableList = Collections.unmodifiableList(((bvq) this.f12522b).m3101b(cls));
            if (((bko) ((bko) this.f12521a).f3652a.put(cls, new bko(listUnmodifiableList))) != null) {
                throw new IllegalStateException("Already cached loaders for model: ".concat(String.valueOf(String.valueOf(cls))));
            }
        }
        return listUnmodifiableList;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: D */
    public final synchronized void m6680D(Class cls, Class cls2, bvm bvmVar) {
        ((bvq) this.f12522b).m3103d(cls, cls2, bvmVar);
        ((bko) this.f12521a).f3652a.clear();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [aed, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [aed, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [aed, java.lang.Object] */
    /* JADX INFO: renamed from: E */
    public final String m6681E(bqn bqnVar) {
        String str;
        synchronized (this.f12522b) {
            str = (String) ((cbe) this.f12522b).m3372f(bqnVar);
        }
        if (str == null) {
            bue bueVar = (bue) this.f12521a.mo320a();
            bzq.m3278r(bueVar);
            try {
                bqnVar.mo2922a(bueVar.f4476a);
                byte[] bArrDigest = bueVar.f4476a.digest();
                synchronized (cbi.f4956b) {
                    char[] cArr = cbi.f4956b;
                    for (int i = 0; i < bArrDigest.length; i++) {
                        int i2 = bArrDigest[i] & 255;
                        int i3 = i + i;
                        char[] cArr2 = cbi.f4955a;
                        cArr[i3] = cArr2[i2 >>> 4];
                        cArr[i3 + 1] = cArr2[i2 & 15];
                    }
                    str = new String(cArr);
                }
                this.f12521a.mo321b(bueVar);
            } catch (Throwable th) {
                this.f12521a.mo321b(bueVar);
                throw th;
            }
        }
        synchronized (this.f12522b) {
            ((cbe) this.f12522b).m3373g(bqnVar, str);
        }
        return str;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.concurrent.locks.Lock] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, java.util.Queue] */
    /* JADX INFO: renamed from: F */
    public final void m6682F(String str) {
        msg msgVar;
        synchronized (this) {
            msgVar = (msg) this.f12522b.get(str);
            bzq.m3278r(msgVar);
            int i = msgVar.f41540a;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + i);
            }
            int i2 = i - 1;
            msgVar.f41540a = i2;
            if (i2 == 0) {
                msg msgVar2 = (msg) this.f12522b.remove(str);
                if (!msgVar2.equals(msgVar)) {
                    throw new IllegalStateException("Removed the wrong lock, expected to remove: " + msgVar.toString() + ", but actually removed: " + String.valueOf(msgVar2) + ", safeKey: " + str);
                }
                Object obj = this.f12521a;
                synchronized (((bkn) obj).f3651a) {
                    if (((bkn) obj).f3651a.size() < 10) {
                        ((bkn) obj).f3651a.offer(msgVar2);
                    }
                }
            }
        }
        msgVar.f41541b.unlock();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: G */
    public final Map m6683G(boolean z) {
        return z ? this.f12522b : this.f12521a;
    }

    /* JADX INFO: renamed from: H */
    public final void m6684H(bqn bqnVar, bsr bsrVar) {
        Map mapM6683G = m6683G(bsrVar.f4350d);
        if (bsrVar.equals(mapM6683G.get(bqnVar))) {
            mapM6683G.remove(bqnVar);
        }
    }

    /* JADX INFO: renamed from: I */
    public final int m6685I() {
        return ((int[]) this.f12522b).length;
    }

    /* JADX INFO: renamed from: a */
    public final mrm m6686a(gyu gyuVar) {
        Future future;
        Future future2;
        synchronized (this) {
            future = (Future) ((HashMap) this.f12521a).get(gyuVar);
            future2 = (Future) ((HashMap) this.f12522b).get(gyuVar);
        }
        try {
            if (future != null) {
                try {
                    mrm mrmVarM16829i = mrm.m16829i(new dsx((DynamicDepthResult) future.get(), m6675K(future2)));
                    synchronized (this) {
                        ((HashMap) this.f12521a).remove(gyuVar);
                        ((HashMap) this.f12522b).remove(gyuVar);
                    }
                    return mrmVarM16829i;
                } catch (InterruptedException | CancellationException | ExecutionException e) {
                    if (e instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    synchronized (this) {
                        ((HashMap) this.f12521a).remove(gyuVar);
                        ((HashMap) this.f12522b).remove(gyuVar);
                    }
                }
            }
            return mqu.f41450a;
        } catch (Throwable th) {
            synchronized (this) {
                ((HashMap) this.f12521a).remove(gyuVar);
                ((HashMap) this.f12522b).remove(gyuVar);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m6687b(gyu gyuVar) {
        ((HashMap) this.f12521a).put(gyuVar, nqf.m17621g());
        ((HashMap) this.f12522b).put(gyuVar, nqf.m17621g());
    }

    /* JADX INFO: renamed from: c */
    public final void m6688c(gyu gyuVar, mrm mrmVar) {
        nqf nqfVar;
        synchronized (this) {
            nqfVar = (nqf) ((HashMap) this.f12521a).get(gyuVar);
        }
        if (nqfVar == null) {
            throw new NoSuchElementException("Shot not found: ".concat(String.valueOf(String.valueOf(gyuVar))));
        }
        if (mrmVar.mo16813g()) {
            nqfVar.mo14894e((DynamicDepthResult) mrmVar.mo16809c());
            return;
        }
        synchronized (this) {
            ((HashMap) this.f12521a).remove(gyuVar);
            gug gugVarM6675K = m6675K((nqf) ((HashMap) this.f12522b).remove(gyuVar));
            if (gugVarM6675K != null) {
                gugVarM6675K.close();
            }
        }
        nqfVar.cancel(true);
    }

    /* JADX INFO: renamed from: d */
    public final void m6689d(gyu gyuVar, gug gugVar) {
        nqf nqfVar;
        synchronized (this) {
            nqfVar = (nqf) ((HashMap) this.f12522b).get(gyuVar);
        }
        if (nqfVar != null) {
            nqfVar.mo14894e(gugVar);
        } else if (gugVar != null) {
            gugVar.close();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [gug, java.lang.Object] */
    /* JADX INFO: renamed from: e */
    public final void m6690e() {
        ((DynamicDepthResult) this.f12521a).close();
        ?? r0 = this.f12522b;
        if (r0 != 0) {
            r0.close();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m6691f(String str) {
        Object objCreateWindowContext;
        try {
            DisplayManager displayManager = (DisplayManager) ((Context) this.f12521a).getSystemService("display");
            if (displayManager == null) {
                objCreateWindowContext = this.f12521a;
            } else {
                objCreateWindowContext = ((Context) this.f12521a).createDisplayContext(displayManager.getDisplay(0)).createWindowContext(2, null);
            }
        } catch (RuntimeException e) {
            objCreateWindowContext = this.f12521a;
        }
        ((jvd) this.f12522b).execute(new dgq((Context) objCreateWindowContext, str, 5));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [dhv, java.lang.Object] */
    /* JADX INFO: renamed from: g */
    public final boolean m6692g() {
        return this.f12521a.mo6184l(dii.f11534j) && this.f12521a.mo6184l(dii.f11533i) && !((kpb) this.f12522b).f36768a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dhv, java.lang.Object] */
    /* JADX INFO: renamed from: h */
    public final boolean m6693h() {
        return this.f12521a.mo6184l(dij.f11590n) && m6692g();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dhv, java.lang.Object] */
    /* JADX INFO: renamed from: i */
    public final boolean m6694i() {
        return this.f12521a.mo6184l(dii.f11547w);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dhv, java.lang.Object] */
    /* JADX INFO: renamed from: j */
    public final void m6695j() {
        ?? r0 = this.f12521a;
        dhw dhwVar = dir.f11704a;
        r0.mo6176d();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [dhv, java.lang.Object] */
    /* JADX INFO: renamed from: k */
    public final void m6696k() {
        ?? r0 = this.f12521a;
        dhx dhxVar = dii.f11525a;
        r0.mo6175c();
        ?? r1 = this.f12521a;
        dhw dhwVar = dij.f11577a;
        r1.mo6177e();
    }

    /* JADX INFO: renamed from: l */
    public final void m6697l() {
        ((hst) this.f12522b).m10708g();
    }

    /* JADX INFO: renamed from: m */
    public final void m6698m(int i, Object... objArr) {
        m6699n(((Context) this.f12521a).getString(i, objArr));
    }

    /* JADX INFO: renamed from: n */
    public final void m6699n(String str) {
        ((jvd) this.f12522b).execute(new cuq(this, str, 19, null, null));
    }

    /* JADX INFO: renamed from: o */
    public final void m6700o() {
        m6699n(((Context) this.f12521a).getString(C0100R.string.error_app_not_found));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: p */
    public final boolean m6701p(jxn jxnVar, jxp jxpVar) {
        List list = (List) this.f12522b.get(jxnVar);
        list.getClass();
        return list.contains(jxpVar);
    }

    /* JADX INFO: renamed from: q */
    public final String[] m6702q() {
        return (String[]) ((ArrayList) this.f12522b).toArray(new String[0]);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [hai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [hai, java.lang.Object] */
    /* JADX INFO: renamed from: r */
    public final void m6703r() {
        Intent intentM2611e = ((bko) this.f12521a).m2611e();
        if (intentM2611e == null || !intentM2611e.hasExtra("com.google.assistant.extra.CAMERA_FLASH_MODE")) {
            return;
        }
        if (cds.m3511j(intentM2611e)) {
            this.f12522b.mo10033e(gzy.f27061t, cds.m3504c(intentM2611e).f24251d);
        } else {
            this.f12522b.mo10033e(gzy.f27060s, cds.m3504c(intentM2611e).f24251d);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: s */
    public final synchronized List m6704s(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f12521a.iterator();
        while (it.hasNext()) {
            List<djm> list = (List) this.f12522b.get((String) it.next());
            if (list != null) {
                for (djm djmVar : list) {
                    if (djmVar.m6243r(cls, cls2)) {
                        arrayList.add(djmVar.f11789c);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: t */
    public final synchronized List m6705t(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f12521a.iterator();
        while (it.hasNext()) {
            List<djm> list = (List) this.f12522b.get((String) it.next());
            if (list != null) {
                for (djm djmVar : list) {
                    if (djmVar.m6243r(cls, cls2) && !arrayList.contains(djmVar.f11788b)) {
                        arrayList.add(djmVar.f11788b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: u */
    public final synchronized void m6706u(String str, bqt bqtVar, Class cls, Class cls2) {
        m6676L(str).add(new djm(cls, cls2, bqtVar));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: v */
    public final synchronized void m6707v(List list) {
        ArrayList arrayList = new ArrayList((Collection) this.f12521a);
        this.f12521a.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f12521a.add((String) it.next());
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            if (!list.contains(str)) {
                this.f12521a.add(str);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bti, java.lang.Object] */
    /* JADX INFO: renamed from: w */
    public final void m6708w(Bitmap bitmap) {
        this.f12522b.mo3045d(bitmap);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [btg, java.lang.Object] */
    /* JADX INFO: renamed from: x */
    public final void m6709x(byte[] bArr) {
        this.f12521a.mo3036c(bArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [btg, java.lang.Object] */
    /* JADX INFO: renamed from: y */
    public final byte[] m6710y(int i) {
        return (byte[]) this.f12521a.mo3034a(i, byte[].class);
    }

    public dsx(bhy bhyVar) {
        this.f12521a = new ArrayList();
        this.f12522b = bhyVar;
    }

    public dsx(byte[] bArr) {
        this.f12521a = new ArrayList();
        this.f12522b = new HashMap();
    }

    public dsx(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f12522b = new HashMap();
        this.f12521a = new bkn((byte[]) null);
    }

    public dsx(char[] cArr) {
        this.f12522b = new cbe(1000L);
        this.f12521a = cbp.m3396b(10, new bud(0));
    }

    public dsx(aed aedVar) {
        bvq bvqVar = new bvq(aedVar);
        this.f12521a = new bko((byte[]) null, (byte[]) null);
        this.f12522b = bvqVar;
    }

    public dsx(fvu fvuVar, Map map) {
        this.f12521a = fvuVar;
        this.f12522b = map;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            map.get((jxn) it.next());
        }
    }
}
