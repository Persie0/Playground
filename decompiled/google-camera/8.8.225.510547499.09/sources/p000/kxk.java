package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.wearable.complications.rendering.p002EM.voNZjxiJou;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.webkit.MimeTypeMap;
import androidx.work.impl.workers.NHKG.pIeXJQLZLfgIN;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.clockwork.common.wearable.wearmaterial.selectioncontrol.eMjB.VzWFSVj;
import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.common.p019io.ByteStreams;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class kxk {
    public kxk() {
        Executors.newSingleThreadScheduledExecutor();
        new kyw();
        new kyw();
    }

    public kxk(byte[] bArr) {
    }

    /* JADX INFO: renamed from: A */
    public static npv m14955A(ScheduledExecutorService scheduledExecutorService) {
        return scheduledExecutorService instanceof npv ? (npv) scheduledExecutorService : new nqa(scheduledExecutorService);
    }

    /* JADX INFO: renamed from: B */
    public static Executor m14956B(Executor executor) {
        return new nqe(executor);
    }

    /* JADX INFO: renamed from: C */
    public static Executor m14957C(Executor executor, nnz nnzVar) {
        executor.getClass();
        return executor == not.INSTANCE ? executor : new kya(executor, nnzVar, 2);
    }

    /* JADX INFO: renamed from: D */
    public static npk m14958D(Iterable iterable) {
        return new npk(false, mws.m17094i(iterable));
    }

    @SafeVarargs
    /* JADX INFO: renamed from: E */
    public static npk m14959E(nps... npsVarArr) {
        return new npk(false, mws.m17096k(npsVarArr));
    }

    /* JADX INFO: renamed from: F */
    public static npk m14960F(Iterable iterable) {
        return new npk(true, mws.m17094i(iterable));
    }

    /* JADX INFO: renamed from: G */
    public static nps m14961G(Iterable iterable) {
        return new noo(mws.m17094i(iterable), true);
    }

    @SafeVarargs
    /* JADX INFO: renamed from: H */
    public static nps m14962H(nps... npsVarArr) {
        return new noo(mws.m17096k(npsVarArr), true);
    }

    /* JADX INFO: renamed from: I */
    public static nps m14963I() {
        npn npnVar = npn.f44030a;
        return npnVar != null ? npnVar : new npn();
    }

    /* JADX INFO: renamed from: J */
    public static nps m14964J(Throwable th) {
        th.getClass();
        return new npo(th);
    }

    /* JADX INFO: renamed from: K */
    public static nps m14965K(Object obj) {
        return obj == null ? npp.f44031a : new npp(obj);
    }

    /* JADX INFO: renamed from: L */
    public static nps m14966L(nps npsVar) {
        if (npsVar.isDone()) {
            return npsVar;
        }
        npl nplVar = new npl(npsVar);
        npsVar.mo2282d(nplVar, not.INSTANCE);
        return nplVar;
    }

    /* JADX INFO: renamed from: M */
    public static nps m14967M(nol nolVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        nqm nqmVarM17622g = nqm.m17622g(nolVar);
        nqmVarM17622g.mo2282d(new lmg(scheduledExecutorService.schedule(nqmVarM17622g, j, timeUnit), 16), not.INSTANCE);
        return nqmVarM17622g;
    }

    /* JADX INFO: renamed from: N */
    public static nps m14968N(Runnable runnable, Executor executor) {
        nqm nqmVarM17624i = nqm.m17624i(runnable, null);
        executor.execute(nqmVarM17624i);
        return nqmVarM17624i;
    }

    /* JADX INFO: renamed from: O */
    public static nps m14969O(Callable callable, Executor executor) {
        nqm nqmVarM17623h = nqm.m17623h(callable);
        executor.execute(nqmVarM17623h);
        return nqmVarM17623h;
    }

    /* JADX INFO: renamed from: P */
    public static nps m14970P(nol nolVar, Executor executor) {
        nqm nqmVarM17622g = nqm.m17622g(nolVar);
        executor.execute(nqmVarM17622g);
        return nqmVarM17622g;
    }

    /* JADX INFO: renamed from: Q */
    public static nps m14971Q(Iterable iterable) {
        return new noo(mws.m17094i(iterable), false);
    }

    /* JADX INFO: renamed from: R */
    public static nps m14972R(nps npsVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (npsVar.isDone()) {
            return npsVar;
        }
        nqj nqjVar = new nqj(npsVar);
        nqh nqhVar = new nqh(nqjVar);
        nqjVar.f44063b = scheduledExecutorService.schedule(nqhVar, j, timeUnit);
        npsVar.mo2282d(nqhVar, not.INSTANCE);
        return nqjVar;
    }

    /* JADX INFO: renamed from: S */
    public static Object m14973S(Future future) {
        lku.m15616K(future.isDone(), "Future was expected to be done: %s", future);
        return ntw.m17727m(future);
    }

    /* JADX INFO: renamed from: T */
    public static Object m14974T(Future future) {
        future.getClass();
        try {
            return ntw.m17727m(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new nou((Error) cause);
            }
            throw new nqn(cause);
        }
    }

    /* JADX INFO: renamed from: U */
    public static void m14975U(nps npsVar, nph nphVar, Executor executor) {
        nphVar.getClass();
        npsVar.mo2282d(new npi(npsVar, nphVar), executor);
    }

    /* JADX INFO: renamed from: V */
    public static void m14976V(nps npsVar, Future future) {
        if (npsVar instanceof nnz) {
            ((nnz) npsVar).m17546o(future);
        } else {
            if (npsVar == null || !npsVar.isCancelled() || future == null) {
                return;
            }
            future.cancel(false);
        }
    }

    /* JADX INFO: renamed from: W */
    public static int m14977W(long j) {
        int i = (int) j;
        lku.m15606A(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    /* JADX INFO: renamed from: X */
    public static int m14978X(int i, int i2, int i3) {
        lku.m15608C(i2 <= i3, pIeXJQLZLfgIN.shxvYDmUFe, i2, i3);
        return Math.min(Math.max(i, i2), i3);
    }

    /* JADX INFO: renamed from: Y */
    public static int m14979Y(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: Z */
    public static int m14980Z(int... iArr) {
        lku.m15669w(true);
        int i = iArr[0];
        for (int i2 = 1; i2 < 4; i2++) {
            int i3 = iArr[i2];
            if (i3 > i) {
                i = i3;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    public static int m14981a(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: aA */
    public static int m14982aA(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: aa */
    public static int m14983aa(int... iArr) {
        lku.m15669w(true);
        int i = iArr[0];
        for (int i2 = 1; i2 < 4; i2++) {
            int i3 = iArr[i2];
            if (i3 < i) {
                i = i3;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ab */
    public static int m14984ab(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    /* JADX INFO: renamed from: ac */
    public static List m14985ac(int... iArr) {
        int length = iArr.length;
        return length == 0 ? Collections.emptyList() : new nnc(iArr, 0, length);
    }

    /* JADX INFO: renamed from: ae */
    public static float m14987ae(float... fArr) {
        lku.m15669w(fArr.length > 0);
        float fMin = fArr[0];
        for (int i = 1; i < fArr.length; i++) {
            fMin = Math.min(fMin, fArr[i]);
        }
        return fMin;
    }

    /* JADX INFO: renamed from: af */
    public static int m14988af(float[] fArr, float f, int i, int i2) {
        while (i < i2) {
            if (fArr[i] == f) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ag */
    public static List m14989ag(float... fArr) {
        int length = fArr.length;
        return length == 0 ? Collections.emptyList() : new nna(fArr, 0, length);
    }

    /* JADX INFO: renamed from: ah */
    public static float[] m14990ah(Collection collection) {
        if (collection instanceof nna) {
            nna nnaVar = (nna) collection;
            return Arrays.copyOfRange(nnaVar.f43924a, nnaVar.f43925b, nnaVar.f43926c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            fArr[i] = ((Number) obj).floatValue();
        }
        return fArr;
    }

    /* JADX INFO: renamed from: ai */
    static void m14991ai(boolean z, String str, long j, long j2) {
        if (z) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + j + ", " + j2 + ")");
    }

    /* JADX INFO: renamed from: aj */
    public static void m14992aj(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    /* JADX INFO: renamed from: ak */
    public static int m14993ak(long j, int i) {
        long j2 = i;
        long j3 = j % j2;
        if (j3 < 0) {
            j3 += j2;
        }
        return (int) j3;
    }

    /* JADX INFO: renamed from: al */
    public static long m14994al(long j, long j2) {
        long j3 = j + j2;
        m14991ai(((j ^ j2) < 0) | ((j ^ j3) >= 0), VzWFSVj.AUrIRjRehh, j, j2);
        return j3;
    }

    /* JADX INFO: renamed from: am */
    public static long m14995am(long j, long j2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j) + Long.numberOfLeadingZeros(j ^ (-1)) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros((-1) ^ j2);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        m14991ai(iNumberOfLeadingZeros >= 64, "checkedMultiply", j, j2);
        m14991ai(true, "checkedMultiply", j, j2);
        long j3 = j * j2;
        m14991ai(j == 0 || j3 / j == j2, "checkedMultiply", j, j2);
        return j3;
    }

    /* JADX INFO: renamed from: an */
    public static long m14996an(long j, long j2) {
        long j3 = j - j2;
        m14991ai(((j ^ j2) >= 0) | ((j ^ j3) >= 0), "checkedSubtract", j, j2);
        return j3;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
    
        if (r8 != false) goto L28;
     */
    /* JADX INFO: renamed from: ao */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long m14997ao(long j, long j2, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j3 = j / j2;
        long j4 = j - (j2 * j3);
        if (j4 == 0) {
            return j3;
        }
        int i = (int) ((j ^ j2) >> 63);
        boolean z = true;
        int i2 = i | 1;
        switch (nmz.f43920a[roundingMode.ordinal()]) {
            case 1:
                m14992aj(false);
            case 2:
                return j3;
            case 3:
                if (i2 >= 0) {
                    z = false;
                }
                break;
            case 4:
                return j3 + ((long) i2);
            case 5:
                if (i2 <= 0) {
                    z = false;
                }
                break;
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j4);
                long jAbs2 = jAbs - (Math.abs(j2) - jAbs);
                if (jAbs2 != 0 ? jAbs2 <= 0 : roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j3) == 0)) {
                    z = false;
                }
                break;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004e, code lost:
    
        if (r3 != false) goto L31;
     */
    /* JADX INFO: renamed from: ap */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m14998ap(int i, int i2, RoundingMode roundingMode) {
        roundingMode.getClass();
        if (i2 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        boolean z = true;
        int i5 = ((i ^ i2) >> 31) | 1;
        switch (nmy.f43919a[roundingMode.ordinal()]) {
            case 1:
                m14992aj(false);
            case 2:
                return i3;
            case 3:
                if (i5 >= 0) {
                    z = false;
                }
                break;
            case 4:
                return i3 + i5;
            case 5:
                if (i5 <= 0) {
                    z = false;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i4);
                int iAbs2 = iAbs - (Math.abs(i2) - iAbs);
                if (iAbs2 != 0) {
                    if (iAbs2 <= 0) {
                        z = false;
                    }
                } else if (roundingMode != RoundingMode.HALF_UP) {
                    if (((roundingMode == RoundingMode.HALF_EVEN ? 1 : 0) & i3 & 1) == 0) {
                        z = false;
                    }
                }
                break;
            default:
                throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: aq */
    public static int m14999aq(int i, RoundingMode roundingMode) {
        if (i <= 0) {
            throw new IllegalArgumentException("x (" + i + ") must be > 0");
        }
        switch (nmy.f43919a[roundingMode.ordinal()]) {
            case 1:
                m14992aj(((i + (-1)) & i) == 0);
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                return (31 - iNumberOfLeadingZeros) + ((((-1257966797) >>> iNumberOfLeadingZeros) - i) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    /* JADX INFO: renamed from: ar */
    public static boolean m15000ar(double d) {
        return Math.getExponent(d) <= 1023;
    }

    /* JADX INFO: renamed from: as */
    public static nxl m15001as(Throwable th, boolean z) {
        StackTraceElement[] stackTrace;
        nxl nxlVarM18137O = nms.f43891f.m18137O();
        String name = th.getClass().getName();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nms nmsVar = (nms) nxlVarM18137O.f44974b;
        name.getClass();
        nmsVar.f43893a |= 1;
        nmsVar.f43894b = name;
        if (z && th.getMessage() != null) {
            String message = th.getMessage();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nms nmsVar2 = (nms) nxlVarM18137O.f44974b;
            message.getClass();
            nmsVar2.f43893a |= 2;
            nmsVar2.f43895c = message;
        }
        try {
            stackTrace = th.getStackTrace();
        } catch (NullPointerException e) {
            stackTrace = null;
        }
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                nxl nxlVarM18137O2 = nmr.f43883f.m18137O();
                if (stackTraceElement != null) {
                    String className = stackTraceElement.getClassName();
                    if (!nxlVarM18137O2.f44974b.m18142ac()) {
                        nxlVarM18137O2.mo18106p();
                    }
                    nmr nmrVar = (nmr) nxlVarM18137O2.f44974b;
                    className.getClass();
                    nmrVar.f43885a |= 1;
                    nmrVar.f43886b = className;
                    String methodName = stackTraceElement.getMethodName();
                    if (!nxlVarM18137O2.f44974b.m18142ac()) {
                        nxlVarM18137O2.mo18106p();
                    }
                    nmr nmrVar2 = (nmr) nxlVarM18137O2.f44974b;
                    methodName.getClass();
                    nmrVar2.f43885a |= 2;
                    nmrVar2.f43887c = methodName;
                    int lineNumber = stackTraceElement.getLineNumber();
                    if (!nxlVarM18137O2.f44974b.m18142ac()) {
                        nxlVarM18137O2.mo18106p();
                    }
                    nmr nmrVar3 = (nmr) nxlVarM18137O2.f44974b;
                    nmrVar3.f43885a |= 8;
                    nmrVar3.f43889e = lineNumber;
                    if (stackTraceElement.getFileName() != null) {
                        String fileName = stackTraceElement.getFileName();
                        if (!nxlVarM18137O2.f44974b.m18142ac()) {
                            nxlVarM18137O2.mo18106p();
                        }
                        nmr nmrVar4 = (nmr) nxlVarM18137O2.f44974b;
                        fileName.getClass();
                        nmrVar4.f43885a |= 4;
                        nmrVar4.f43888d = fileName;
                    }
                }
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nms nmsVar3 = (nms) nxlVarM18137O.f44974b;
                nmr nmrVar5 = (nmr) nxlVarM18137O2.mo18103l();
                nmrVar5.getClass();
                nxy nxyVar = nmsVar3.f43897e;
                if (!nxyVar.mo17770c()) {
                    nmsVar3.f43897e = nxq.m18127U(nxyVar);
                }
                nmsVar3.f43897e.add(nmrVar5);
            }
        }
        return nxlVarM18137O;
    }

    /* JADX INFO: renamed from: at */
    public static nxl m15002at(Throwable th) {
        nxl nxlVarM18137O = nmu.f43903e.m18137O();
        nxl nxlVarM15001as = m15001as(th, true);
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nmu nmuVar = (nmu) nxlVarM18137O.f44974b;
        nms nmsVar = (nms) nxlVarM15001as.mo18103l();
        nmsVar.getClass();
        nmuVar.f43906b = nmsVar;
        nmuVar.f43905a |= 1;
        return nxlVarM18137O;
    }

    /* JADX INFO: renamed from: au */
    public static int m15003au(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: av */
    public static int m15004av(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: aw */
    public static int m15005aw(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: ax */
    public static int m15006ax(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: ay */
    public static int m15007ay(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: az */
    public static int m15008az(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m15009b(int i, Context context) {
        return new mhu(context).m16394a(m15025r(context, C0100R.attr.colorSurface, 0), context.getResources().getDimension(i));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX INFO: renamed from: d */
    public static String m15011d(String str) {
        switch (str) {
            case "jpg":
            case "jpeg":
                return "image/jpeg";
            case "gif":
                return "image/gif";
            case "png":
                return "image/png";
            case "dng":
                return "image/x-adobe-dng";
            case "mp4":
                return "video/mp4";
            case "3gpp":
                return "video/3gpp";
            case "txt":
                return "text/plain";
            default:
                return MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m15012e(String str) {
        return str.startsWith("image/");
    }

    /* JADX INFO: renamed from: f */
    public static boolean m15013f(String str) {
        return str.startsWith("video/");
    }

    /* JADX INFO: renamed from: g */
    public static long m15014g(InputStream inputStream, kqc kqcVar) {
        return m15016i(inputStream, null, kqcVar);
    }

    /* JADX INFO: renamed from: h */
    public static long m15015h(byte[] bArr, kqc kqcVar) {
        return m15017j(bArr, null, kqcVar);
    }

    /* JADX INFO: renamed from: i */
    public static long m15016i(InputStream inputStream, ExifInterface exifInterface, kqc kqcVar) throws IllegalAccessException, IOException, InvocationTargetException {
        long jCopy;
        FileOutputStream fileOutputStreamMo14685e = kqcVar.mo14685e();
        try {
            if (exifInterface != null) {
                ngc ngcVar = new ngc(fileOutputStreamMo14685e);
                try {
                    OutputStream outputStreamM4688m = exifInterface.m4688m(ngcVar);
                    try {
                        ByteStreams.copy(inputStream, outputStreamM4688m);
                        outputStreamM4688m.close();
                        ngcVar.flush();
                        jCopy = ngcVar.f42212a;
                        ngcVar.close();
                    } catch (Throwable th) {
                        try {
                            outputStreamM4688m.close();
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        ngcVar.close();
                    } catch (Throwable th4) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                    }
                    throw th3;
                }
            } else {
                jCopy = ByteStreams.copy(inputStream, fileOutputStreamMo14685e);
            }
            fileOutputStreamMo14685e.flush();
            fileOutputStreamMo14685e.close();
            return jCopy;
        } catch (Throwable th5) {
            try {
                fileOutputStreamMo14685e.close();
            } catch (Throwable th6) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th5, th6);
            }
            throw th5;
        }
    }

    /* JADX INFO: renamed from: j */
    public static long m15017j(byte[] bArr, ExifInterface exifInterface, kqc kqcVar) {
        return m15016i(new ByteArrayInputStream(bArr), exifInterface, kqcVar);
    }

    /* JADX INFO: renamed from: k */
    public static long m15018k(InputStream inputStream, ExifInterface exifInterface, kqc kqcVar) {
        return exifInterface == null ? m15014g(inputStream, kqcVar) : m15019l(ByteStreams.toByteArray(inputStream), exifInterface, kqcVar);
    }

    /* JADX INFO: renamed from: l */
    public static long m15019l(byte[] bArr, ExifInterface exifInterface, kqc kqcVar) throws IllegalAccessException, IOException, InvocationTargetException {
        if (exifInterface == null) {
            return m15015h(bArr, kqcVar);
        }
        FileOutputStream fileOutputStreamMo14685e = kqcVar.mo14685e();
        try {
            OutputStream outputStreamM4688m = exifInterface.m4688m(fileOutputStreamMo14685e);
            try {
                mrn mrnVarM14798d = ksh.m14798d(bArr, (bfd) ksh.m14797c(exifInterface.f7918bA).mo16812f());
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ksh.m14807m(bArr, byteArrayOutputStream, (bfd) mrnVarM14798d.f41479a, (bfd) mrnVarM14798d.f41480b);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                outputStreamM4688m.write(byteArray);
                long length = byteArray.length;
                outputStreamM4688m.close();
                fileOutputStreamMo14685e.close();
                return length;
            } catch (Throwable th) {
                try {
                    outputStreamM4688m.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                fileOutputStreamMo14685e.close();
            } catch (Throwable th4) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m15020m(Window window, boolean z) {
        window.getDecorView();
        WindowInsetsController insetsController = window.getInsetsController();
        new C1117xf();
        if (z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            insetsController.setSystemBarsAppearance(8, 8);
        } else {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
            insetsController.setSystemBarsAppearance(0, 8);
        }
    }

    /* JADX INFO: renamed from: n */
    public static Drawable m15021n(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList == null) {
            return drawable;
        }
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            return drawableMutate;
        }
        acv.m239h(drawableMutate, mode);
        return drawableMutate;
    }

    /* JADX INFO: renamed from: p */
    public static int m15023p(int i, int i2) {
        return acp.m212d(i, (Color.alpha(i) * i2) / 255);
    }

    /* JADX INFO: renamed from: q */
    public static int m15024q(View view, int i) {
        return m15027t(view.getContext(), lij.m15395C(view.getContext(), i, view.getClass().getCanonicalName()));
    }

    /* JADX INFO: renamed from: r */
    public static int m15025r(Context context, int i, int i2) {
        TypedValue typedValueM15394B = lij.m15394B(context, i);
        return typedValueM15394B != null ? m15027t(context, typedValueM15394B) : i2;
    }

    /* JADX INFO: renamed from: s */
    public static int m15026s(int i, int i2, float f) {
        return acp.m211c(acp.m212d(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    /* JADX INFO: renamed from: t */
    public static int m15027t(Context context, TypedValue typedValue) {
        return typedValue.resourceId != 0 ? abu.m159a(context, typedValue.resourceId) : typedValue.data;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m15028u(int i) {
        return i != 0 && acp.m209a(i) > 0.5d;
    }

    /* JADX INFO: renamed from: v */
    public static void m15029v(AnimatorSet animatorSet, List list) {
        int size = list.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) list.get(i);
            jMax = Math.max(jMax, animator.getStartDelay() + animator.getDuration());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        list.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(list);
    }

    /* JADX INFO: renamed from: w */
    public static int m15030w(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: x */
    public static boolean m15031x(PointF pointF, PointF pointF2) {
        return lle.m15689i(pointF.x, pointF2.x) && lle.m15689i(pointF.y, pointF2.y);
    }

    /* JADX INFO: renamed from: y */
    public static npu m15032y(ExecutorService executorService) {
        if (executorService instanceof npu) {
            return (npu) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new nqa((ScheduledExecutorService) executorService) : new npx(executorService);
    }

    /* JADX INFO: renamed from: z */
    public static npu m15033z() {
        return new npw();
    }

    /* JADX INFO: renamed from: ad */
    public static float m14986ad(float f, float f2, float f3) {
        if (f2 <= f3) {
            return Math.min(Math.max(f, f2), f3);
        }
        throw new IllegalArgumentException(lku.m15665s(voNZjxiJou.RfgCcLDIMuBI, Float.valueOf(f2), Float.valueOf(f3)));
    }

    /* JADX INFO: renamed from: o */
    public static void m15022o(Drawable drawable, int i) {
        if (i != 0) {
            acv.m237f(drawable, i);
        } else {
            acv.m238g(drawable, null);
        }
    }

    public kxk(char[] cArr) {
    }
}
