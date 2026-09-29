package p349qo;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.lingq.entity.ChallengeJoinedStats;
import com.lingq.entity.FastSearch;
import com.lingq.entity.Language;
import com.lingq.entity.Lesson;
import com.lingq.entity.LessonBookmark;
import com.lingq.entity.LessonTranslation;
import com.lingq.entity.LessonUserCompleted;
import com.lingq.entity.LessonUserLiked;
import com.lingq.entity.MediaSource;
import com.lingq.entity.SocialSettings;
import com.lingq.shared.download.DownloadItem;
import com.lingq.shared.download.SentenceDownloadItem;
import com.lingq.shared.network.result.FastSearchResult;
import com.lingq.shared.network.result.ResultChallenge;
import com.lingq.shared.network.result.ResultLesson;
import com.lingq.shared.network.result.ResultLessonBookmark;
import com.lingq.shared.uimodel.library.LibraryShelf;
import com.lingq.shared.uimodel.library.LibraryShelfType;
import com.lingq.shared.uimodel.library.LibraryTab;
import com.tonyodev.fetch2.Download;
import com.tonyodev.fetch2core.Downloader;
import dm.C5207g;
import dm.C5213m;
import java.io.File;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.StringWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import kotlin.collections.EmptyList;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.text.C7076b;
import mo.C7661i;
import ni.C7793a;
import org.json.JSONArray;
import org.json.JSONObject;
import p003a2.C0009a;
import p122fl.C5579b;
import p260m8.C7499b;
import p338qd.C8573r0;
import p367rh.C8788b;
import p375s0.C8939a;
import p375s0.C8943e;
import p420um.AbstractC9557b;
import p464wl.InterfaceC9968c;
import p464wl.InterfaceC9969d;
import p515yl.C10415b;
import p534zf.C10483a;
import p534zf.C10487e;
import p534zf.InterfaceC10484b;
import p534zf.InterfaceC10486d;
import p534zf.InterfaceC10488f;
import p541zn.InterfaceC10548l;
import p542zo.InterfaceC10577s;
import so.C9096n;
import so.InterfaceC9091i;

/* JADX INFO: renamed from: qo.b */
/* JADX INFO: loaded from: classes2.dex */
public class C8656b implements InterfaceC9091i, InterfaceC10548l, InterfaceC10577s {

    /* JADX INFO: renamed from: d */
    public static final InterfaceC9968c[] f46236d = new InterfaceC9968c[0];

    /* JADX INFO: renamed from: e */
    public static final C8656b f46237e = new C8656b();

    /* JADX INFO: renamed from: A */
    public static final InterfaceC9968c m16874A(InterfaceC9968c interfaceC9968c) {
        C5207g.m11111f(interfaceC9968c, "<this>");
        ContinuationImpl continuationImpl = interfaceC9968c instanceof ContinuationImpl ? (ContinuationImpl) interfaceC9968c : null;
        if (continuationImpl != null && (interfaceC9968c = continuationImpl.f38106c) == null) {
            InterfaceC9969d interfaceC9969d = (InterfaceC9969d) continuationImpl.mo2029e().mo1474w(InterfaceC9969d.a.f50692a);
            if (interfaceC9969d == null || (interfaceC9968c = interfaceC9969d.mo14311Q0(continuationImpl)) == null) {
                interfaceC9968c = continuationImpl;
            }
            continuationImpl.f38106c = interfaceC9968c;
        }
        return interfaceC9968c;
    }

    /* JADX INFO: renamed from: B */
    public static boolean m16875B(Object obj, Object obj2) {
        if (obj != null && obj == obj2) {
            return true;
        }
        if ((obj instanceof String) && (obj2 instanceof String)) {
            return obj.equals(obj2);
        }
        if ((obj instanceof Boolean) && (obj2 instanceof Boolean)) {
            return obj.equals(obj2);
        }
        if ((obj instanceof Integer) && (obj2 instanceof Integer)) {
            return obj.equals(obj2);
        }
        if ((obj instanceof Long) && (obj2 instanceof Long)) {
            return obj.equals(obj2);
        }
        if ((obj instanceof Float) && (obj2 instanceof Float)) {
            return ((double) Math.abs(((Float) obj).floatValue() - ((Float) obj2).floatValue())) < 1.0E-4d;
        }
        if ((obj instanceof Double) && (obj2 instanceof Double)) {
            return Math.abs(((Double) obj).doubleValue() - ((Double) obj2).doubleValue()) < 1.0E-6d;
        }
        if ((obj instanceof InterfaceC10488f) && (obj2 instanceof InterfaceC10488f)) {
            return obj.equals(obj2);
        }
        if ((obj instanceof InterfaceC10484b) && (obj2 instanceof InterfaceC10484b)) {
            return obj.equals(obj2);
        }
        if ((obj instanceof InterfaceC10486d) && (obj2 instanceof InterfaceC10486d)) {
            return obj.equals(obj2);
        }
        return (obj instanceof Number) && (obj2 instanceof Number) && Math.abs(((Number) obj).doubleValue() - ((Number) obj2).doubleValue()) < 1.0E-4d;
    }

    /* JADX INFO: renamed from: C */
    public static final String m16876C(LibraryTab libraryTab) {
        Object next;
        C5207g.m11111f(libraryTab, "<this>");
        String str = libraryTab.f22065f;
        String str2 = null;
        if (C7076b.m14278X2(str, "isPersonal", false)) {
            Iterator it = C7076b.m14299s3(str, new String[]{"&"}, 0, 6).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!C7076b.m14278X2((String) next, "isPersonal", false));
            String str3 = (String) next;
            if (str3 != null) {
                str2 = (String) C6752c.m13432Z(C7076b.m14299s3(str3, new String[]{"="}, 0, 6));
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: D */
    public static final boolean m16877D(C8943e c8943e) {
        C5207g.m11111f(c8943e, "<this>");
        long j10 = c8943e.f46902e;
        if (C8939a.m17157b(j10) == C8939a.m17158c(j10)) {
            float fM17157b = C8939a.m17157b(j10);
            long j11 = c8943e.f46903f;
            if (fM17157b == C8939a.m17157b(j11)) {
                if (C8939a.m17157b(j10) == C8939a.m17158c(j11)) {
                    float fM17157b2 = C8939a.m17157b(j10);
                    long j12 = c8943e.f46904g;
                    if (fM17157b2 == C8939a.m17157b(j12)) {
                        if (C8939a.m17157b(j10) == C8939a.m17158c(j12)) {
                            float fM17157b3 = C8939a.m17157b(j10);
                            long j13 = c8943e.f46905h;
                            if (fM17157b3 == C8939a.m17157b(j13)) {
                                if (C8939a.m17157b(j10) == C8939a.m17158c(j13)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: E */
    public static boolean m16878E(Uri uri) {
        return (uri == null || Uri.EMPTY.equals(uri)) ? false : true;
    }

    /* JADX INFO: renamed from: F */
    public static String[] m16879F(InterfaceC10484b interfaceC10484b) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < interfaceC10484b.length(); i10++) {
            String strMo19431a = interfaceC10484b.mo19431a(i10);
            if (strMo19431a != null) {
                arrayList.add(strMo19431a);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX INFO: renamed from: G */
    public static final String m16880G(LibraryShelf libraryShelf, LibraryTab libraryTab) {
        C5207g.m11111f(libraryShelf, "<this>");
        String strM16876C = null;
        String str = libraryTab != null ? libraryTab.f22061b : null;
        Integer num = libraryTab != null ? libraryTab.f22064e : null;
        String strM16898f = libraryTab != null ? m16898f(libraryTab) : null;
        if (libraryTab != null) {
            strM16876C = m16876C(libraryTab);
        }
        StringBuilder sb2 = new StringBuilder();
        C0166e.m777x(sb2, libraryShelf.f22050c, "_type=", str, "_level=");
        sb2.append(num);
        sb2.append("accent=");
        sb2.append(strM16898f);
        sb2.append("isPersonal=");
        sb2.append(strM16876C);
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX WARN: Code duplicated, block: B:24:0x0067  */
    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX INFO: renamed from: H */
    public static Boolean m16881H(Object obj, Boolean bool) {
        Boolean bool2;
        Number number;
        if (obj instanceof Boolean) {
            bool2 = (Boolean) obj;
        } else if (obj instanceof String) {
            String str = (String) obj;
            if (Boolean.toString(true).equalsIgnoreCase(str) || Integer.toString(1).equalsIgnoreCase(str)) {
                bool2 = Boolean.TRUE;
            } else if (Boolean.toString(false).equalsIgnoreCase(str) || Integer.toString(0).equalsIgnoreCase(str)) {
                bool2 = Boolean.FALSE;
            } else if (obj instanceof Number) {
                number = (Number) obj;
                if (1 == number.intValue()) {
                    bool2 = Boolean.TRUE;
                } else if (number.intValue() == 0) {
                    bool2 = Boolean.FALSE;
                } else {
                    bool2 = null;
                }
            } else {
                bool2 = null;
            }
        } else if (obj instanceof Number) {
            number = (Number) obj;
            if (1 == number.intValue()) {
                bool2 = Boolean.TRUE;
            } else if (number.intValue() == 0) {
                bool2 = Boolean.FALSE;
            } else {
                bool2 = null;
            }
        } else {
            bool2 = null;
        }
        return bool2 != null ? bool2 : bool;
    }

    /* JADX INFO: renamed from: I */
    public static Double m16882I(Object obj, Double d10) {
        Double dValueOf;
        if (obj instanceof Double) {
            dValueOf = (Double) obj;
        } else if (obj instanceof Number) {
            dValueOf = Double.valueOf(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            try {
                dValueOf = Double.valueOf(Double.parseDouble((String) obj));
            } catch (Throwable unused) {
                dValueOf = null;
            }
        } else {
            dValueOf = null;
        }
        return dValueOf != null ? dValueOf : d10;
    }

    /* JADX INFO: renamed from: J */
    public static Integer m16883J(Object obj) {
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof String) {
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    public static InterfaceC10484b m16884K(Object obj) {
        InterfaceC10484b interfaceC10484bM16885L = m16885L(obj);
        if (interfaceC10484bM16885L == null) {
            interfaceC10484bM16885L = C10483a.m19430i();
        }
        return interfaceC10484bM16885L;
    }

    /* JADX INFO: renamed from: L */
    public static InterfaceC10484b m16885L(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof InterfaceC10484b) {
            return (InterfaceC10484b) obj;
        }
        if (obj instanceof JSONArray) {
            return new C10483a((JSONArray) obj);
        }
        try {
            if (obj instanceof Collection) {
                return new C10483a(new JSONArray((Collection) obj));
            }
            if (obj instanceof String) {
                return new C10483a(new JSONArray((String) obj));
            }
            if (obj.getClass().isArray()) {
                JSONArray jSONArray = new JSONArray();
                int length = Array.getLength(obj);
                for (int i10 = 0; i10 < length; i10++) {
                    jSONArray.put(Array.get(obj, i10));
                }
                return new C10483a(jSONArray);
            }
            return null;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: M */
    public static InterfaceC10488f m16886M(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof InterfaceC10488f) {
            return (InterfaceC10488f) obj;
        }
        if (obj instanceof JSONObject) {
            return new C10487e((JSONObject) obj);
        }
        try {
            if (obj instanceof String) {
                return new C10487e(new JSONObject((String) obj));
            }
            if (obj instanceof Map) {
                return new C10487e(new JSONObject((Map) obj));
            }
            if (obj instanceof Bundle) {
                return new C10487e(new JSONObject(m16905m((Bundle) obj)));
            }
            return null;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: N */
    public static InterfaceC10488f m16887N(Object obj, boolean z10) {
        InterfaceC10488f interfaceC10488fM16886M = m16886M(obj);
        if (interfaceC10488fM16886M == null && z10) {
            interfaceC10488fM16886M = C10487e.m19445u();
        }
        return interfaceC10488fM16886M;
    }

    /* JADX INFO: renamed from: O */
    public static Long m16888O(Object obj, Long l10) {
        Long lValueOf;
        if (obj instanceof Number) {
            lValueOf = Long.valueOf(((Number) obj).longValue());
        } else if (obj instanceof String) {
            try {
                lValueOf = Long.valueOf(Long.parseLong((String) obj));
            } catch (Throwable unused) {
                lValueOf = null;
            }
        } else {
            lValueOf = null;
        }
        return lValueOf != null ? lValueOf : l10;
    }

    /* JADX INFO: renamed from: P */
    public static String m16889P(Object obj, String str) {
        String string;
        if (obj instanceof String) {
            string = (String) obj;
        } else {
            string = ((obj instanceof InterfaceC10488f) || (obj instanceof InterfaceC10484b)) ? obj.toString() : null;
        }
        return string != null ? string : str;
    }

    /* JADX INFO: renamed from: Q */
    public static Uri m16890Q(String str, Uri uri) {
        Uri uri2 = null;
        if (str instanceof String) {
            try {
                uri2 = Uri.parse(str);
            } catch (Exception unused) {
            }
        }
        return uri2 != null ? uri2 : uri;
    }

    /* JADX INFO: renamed from: R */
    public static final void m16891R(int i10, int i11, Object[] objArr) {
        C5207g.m11111f(objArr, "<this>");
        while (i10 < i11) {
            objArr[i10] = null;
            i10++;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: S */
    public static final void m16892S(String str, int i10, int i11) {
        C5207g.m11112g(str, "fileTempDir");
        try {
            String strM16914v = m16914v(str, i10);
            long j10 = i11;
            C5207g.m11112g(strM16914v, "filePath");
            File fileM11817i = C5579b.m11817i(strM16914v);
            if (fileM11817i.exists()) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(fileM11817i, "rw");
                try {
                    randomAccessFile.seek(0L);
                    randomAccessFile.setLength(0L);
                    randomAccessFile.writeLong(j10);
                } catch (Exception unused) {
                } catch (Throwable th2) {
                    try {
                        randomAccessFile.close();
                    } catch (Exception unused2) {
                    }
                    throw th2;
                }
                randomAccessFile.close();
            }
        } catch (Exception unused3) {
        }
    }

    /* JADX INFO: renamed from: T */
    public static final String m16893T(LibraryShelf libraryShelf, String str, LibraryTab libraryTab) {
        C5207g.m11111f(libraryShelf, "<this>");
        C5207g.m11111f(str, "language");
        String value = LibraryShelfType.MyLessons.getValue();
        String str2 = libraryShelf.f22050c;
        if (C5207g.m11106a(str2, value)) {
            if (C5207g.m11106a(libraryTab != null ? m16876C(libraryTab) : null, "true")) {
                return C7793a.m15498b(str, str2 + "_my_imports_");
            }
        }
        return C7793a.m15498b(str, str2);
    }

    /* JADX INFO: renamed from: U */
    public static final String m16894U(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        exc.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        C5207g.m11110e(string, "sw.toString()");
        return string;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: V */
    public static C10483a m16895V(String[] strArr) {
        C10483a c10483aM19430i = C10483a.m19430i();
        for (String str : strArr) {
            if (str != null) {
                synchronized (c10483aM19430i) {
                    try {
                        c10483aM19430i.m19437g(str);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        return c10483aM19430i;
    }

    /* JADX INFO: renamed from: W */
    public static ArrayList m16896W(List list) {
        ArrayList arrayList;
        synchronized (list) {
            arrayList = new ArrayList(list);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static final C8943e m16897e(float f3, float f10, float f11, float f12, long j10) {
        long jM16741n = C8573r0.m16741n(C8939a.m17157b(j10), C8939a.m17158c(j10));
        return new C8943e(f3, f10, f11, f12, jM16741n, jM16741n, jM16741n, jM16741n);
    }

    /* JADX INFO: renamed from: f */
    public static final String m16898f(LibraryTab libraryTab) {
        Object next;
        C5207g.m11111f(libraryTab, "<this>");
        String str = libraryTab.f22065f;
        String str2 = null;
        if (C7076b.m14278X2(str, "accent", false)) {
            Iterator it = C7076b.m14299s3(str, new String[]{"&"}, 0, 6).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!C7076b.m14278X2((String) next, "accent", false));
            String str3 = (String) next;
            if (str3 != null) {
                str2 = (String) C6752c.m13432Z(C7076b.m14299s3(str3, new String[]{"="}, 0, 6));
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: g */
    public static final void m16899g(Throwable th2, Throwable th3) {
        C5207g.m11111f(th2, "<this>");
        C5207g.m11111f(th3, "exception");
        if (th2 != th3) {
            C10415b.f52219a.mo19395a(th2, th3);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final Object[] m16900h(int i10) {
        if (i10 >= 0) {
            return new Object[i10];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    /* JADX INFO: renamed from: i */
    public static final FastSearch m16901i(FastSearchResult fastSearchResult, String str, String str2) {
        C5207g.m11111f(fastSearchResult, "<this>");
        C5207g.m11111f(str, "language");
        C5207g.m11111f(str2, "query");
        return new FastSearch(String.valueOf(fastSearchResult.f18255a), str, str2, fastSearchResult.f18257c, fastSearchResult.f18256b);
    }

    /* JADX INFO: renamed from: j */
    public static final Lesson m16902j(ResultLesson resultLesson) {
        C5207g.m11111f(resultLesson, "<this>");
        int i10 = resultLesson.f18520a;
        String str = resultLesson.f18522b;
        int i11 = resultLesson.f18524c;
        String str2 = resultLesson.f18526d;
        String str3 = resultLesson.f18528e;
        String str4 = resultLesson.f18530f;
        String str5 = resultLesson.f18532g;
        String str6 = resultLesson.f18534h;
        int i12 = resultLesson.f18536i;
        String str7 = resultLesson.f18538j;
        String str8 = resultLesson.f18540k;
        String str9 = resultLesson.f18542l;
        int i13 = resultLesson.f18544m;
        int i14 = resultLesson.f18546n;
        int i15 = resultLesson.f18551q;
        double d10 = resultLesson.f18552r;
        double d11 = resultLesson.f18553s;
        int i16 = resultLesson.f18554t;
        String str10 = resultLesson.f18555u;
        LessonUserLiked lessonUserLiked = resultLesson.f18560z;
        LessonUserCompleted lessonUserCompleted = resultLesson.f18494A;
        LessonTranslation lessonTranslation = resultLesson.f18495B;
        String str11 = resultLesson.f18496C;
        MediaSource mediaSource = resultLesson.f18497D;
        Integer num = resultLesson.f18498E;
        Integer num2 = resultLesson.f18499F;
        double d12 = resultLesson.f18500G;
        double d13 = resultLesson.f18501H;
        boolean z10 = resultLesson.f18502I;
        int i17 = resultLesson.f18503J;
        int i18 = resultLesson.f18504K;
        boolean z11 = resultLesson.f18505L;
        String str12 = resultLesson.f18506M;
        int i19 = resultLesson.f18507N;
        boolean z12 = resultLesson.f18508O;
        double d14 = resultLesson.f18509P;
        String str13 = resultLesson.f18510Q;
        String str14 = resultLesson.f18527d0;
        boolean z13 = resultLesson.f18511R;
        String str15 = resultLesson.f18512S;
        String str16 = resultLesson.f18513T;
        String str17 = resultLesson.f18514U;
        String str18 = resultLesson.f18515V;
        int i20 = resultLesson.f18516W;
        String str19 = resultLesson.f18518Y;
        String str20 = resultLesson.f18519Z;
        String str21 = resultLesson.f18523b0;
        String str22 = resultLesson.f18529e0;
        boolean z14 = resultLesson.f18533g0;
        boolean z15 = resultLesson.f18535h0;
        boolean z16 = resultLesson.f18537i0;
        Integer num3 = resultLesson.f18539j0;
        return new Lesson(i10, null, str, i11, str2, str3, str4, str5, str6, i12, str7, str8, str9, i13, i14, i15, d10, d11, i16, str10, lessonUserLiked, lessonUserCompleted, lessonTranslation, null, null, str11, mediaSource, num, num2, d12, d13, z10, i17, i18, z11, str12, i19, z12, d14, str13, z13, str15, str16, str17, str18, i20, null, str19, str20, resultLesson.f18521a0, str21, resultLesson.f18525c0, str14, str22, resultLesson.f18531f0, z14, z15, z16, (num3 != null ? num3.intValue() : 0) > 0, resultLesson.f18541k0, resultLesson.f18543l0, resultLesson.f18545m0, resultLesson.f18547n0, 0, null, EmptyList.f38032a, null, null, null, Boolean.FALSE, 0.0d, 0, null, null, null, Boolean.valueOf(resultLesson.f18549o0), 25165826, -2147467264, 1793, null);
    }

    /* JADX INFO: renamed from: k */
    public static final C8788b m16903k(ResultChallenge resultChallenge, String str, boolean z10, int i10) {
        Language language;
        Integer num;
        C5207g.m11111f(resultChallenge, "<this>");
        C5207g.m11111f(str, "language");
        int i11 = resultChallenge.f18311a;
        String str2 = resultChallenge.f18312b;
        String str3 = resultChallenge.f18313c;
        String str4 = resultChallenge.f18314d;
        String str5 = resultChallenge.f18315e;
        String str6 = resultChallenge.f18316f;
        String str7 = resultChallenge.f18317g;
        String str8 = resultChallenge.f18318h;
        String str9 = resultChallenge.f18320j;
        boolean z11 = resultChallenge.f18321k;
        int i12 = resultChallenge.f18322l;
        boolean z12 = resultChallenge.f18323m;
        boolean z13 = resultChallenge.f18324n;
        String str10 = resultChallenge.f18325o;
        String str11 = resultChallenge.f18326p;
        int i13 = resultChallenge.f18327q;
        int i14 = resultChallenge.f18328r;
        String str12 = resultChallenge.f18329s;
        SocialSettings socialSettings = resultChallenge.f18330t;
        ChallengeJoinedStats challengeJoinedStats = resultChallenge.f18332v;
        return new C8788b(i11, str2, str3, str4, str5, str6, str7, str8, str, str9, z11, i12, z12, z13, str10, str11, i13, i14, str12, socialSettings, challengeJoinedStats != null ? challengeJoinedStats.f16892j : false, z10, challengeJoinedStats != null, challengeJoinedStats != null ? challengeJoinedStats.f16888f : 0, i10, (challengeJoinedStats == null || (language = challengeJoinedStats.f16890h) == null || (num = language.f16985e) == null) ? 0 : num.intValue(), resultChallenge.f18319i);
    }

    /* JADX INFO: renamed from: l */
    public static final DownloadItem m16904l(SentenceDownloadItem sentenceDownloadItem) {
        C5207g.m11111f(sentenceDownloadItem, "<this>");
        return new DownloadItem(sentenceDownloadItem.f17982a, sentenceDownloadItem.f17983b, sentenceDownloadItem.f17984c, false);
    }

    /* JADX INFO: renamed from: m */
    public static HashMap m16905m(Bundle bundle) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                map.put(str, m16905m((Bundle) obj));
            } else {
                map.put(str, obj);
            }
        }
        return map;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: n */
    public static final void m16906n(int i10, int i11) {
        if (i10 > i11) {
            throw new IndexOutOfBoundsException(C0009a.m20h("toIndex (", i10, ") is greater than size (", i11, ")."));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public static final InterfaceC9968c m16907o(final InterfaceC2052l interfaceC2052l, final InterfaceC9968c interfaceC9968c) {
        C5207g.m11111f(interfaceC2052l, "<this>");
        C5207g.m11111f(interfaceC9968c, "completion");
        if (interfaceC2052l instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) interfaceC2052l).mo1353s(interfaceC9968c);
        }
        final CoroutineContext coroutineContextMo2029e = interfaceC9968c.mo2029e();
        return coroutineContextMo2029e == EmptyCoroutineContext.f38093a ? new RestrictedContinuationImpl(interfaceC9968c) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1

            /* JADX INFO: renamed from: b */
            public int f38094b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(interfaceC9968c);
                C5207g.m11109d(interfaceC9968c, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                int i10 = this.f38094b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("This coroutine had already completed".toString());
                    }
                    this.f38094b = 2;
                    C7499b.m14977z0(obj);
                    return obj;
                }
                this.f38094b = 1;
                C7499b.m14977z0(obj);
                InterfaceC2052l interfaceC2052l2 = this.f38095c;
                C5207g.m11109d(interfaceC2052l2, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
                C5213m.m11200e(1, interfaceC2052l2);
                return interfaceC2052l2.mo528n(this);
            }
        } : new ContinuationImpl(interfaceC9968c, coroutineContextMo2029e, interfaceC2052l) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2

            /* JADX INFO: renamed from: d */
            public int f38096d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ InterfaceC2052l f38097e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(interfaceC9968c, coroutineContextMo2029e);
                this.f38097e = interfaceC2052l;
                C5207g.m11109d(interfaceC9968c, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                int i10 = this.f38096d;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("This coroutine had already completed".toString());
                    }
                    this.f38096d = 2;
                    C7499b.m14977z0(obj);
                    return obj;
                }
                this.f38096d = 1;
                C7499b.m14977z0(obj);
                InterfaceC2052l interfaceC2052l2 = this.f38097e;
                C5207g.m11109d(interfaceC2052l2, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
                C5213m.m11200e(1, interfaceC2052l2);
                return interfaceC2052l2.mo528n(this);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static final InterfaceC9968c m16908p(final InterfaceC2056p interfaceC2056p, final Object obj, final InterfaceC9968c interfaceC9968c) {
        C5207g.m11111f(interfaceC2056p, "<this>");
        C5207g.m11111f(interfaceC9968c, "completion");
        if (interfaceC2056p instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) interfaceC2056p).mo1336a(obj, interfaceC9968c);
        }
        final CoroutineContext coroutineContextMo2029e = interfaceC9968c.mo2029e();
        return coroutineContextMo2029e == EmptyCoroutineContext.f38093a ? new RestrictedContinuationImpl(obj, interfaceC9968c) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3

            /* JADX INFO: renamed from: b */
            public int f38098b;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ Object f38100d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(interfaceC9968c);
                C5207g.m11109d(interfaceC9968c, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj2) throws Throwable {
                int i10 = this.f38098b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("This coroutine had already completed".toString());
                    }
                    this.f38098b = 2;
                    C7499b.m14977z0(obj2);
                    return obj2;
                }
                this.f38098b = 1;
                C7499b.m14977z0(obj2);
                InterfaceC2056p interfaceC2056p2 = this.f38099c;
                C5207g.m11109d(interfaceC2056p2, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                C5213m.m11200e(2, interfaceC2056p2);
                return interfaceC2056p2.mo1337m0(this.f38100d, this);
            }
        } : new ContinuationImpl(interfaceC9968c, coroutineContextMo2029e, interfaceC2056p, obj) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4

            /* JADX INFO: renamed from: d */
            public int f38101d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ InterfaceC2056p f38102e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ Object f38103f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(interfaceC9968c, coroutineContextMo2029e);
                this.f38102e = interfaceC2056p;
                this.f38103f = obj;
                C5207g.m11109d(interfaceC9968c, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj2) throws Throwable {
                int i10 = this.f38101d;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("This coroutine had already completed".toString());
                    }
                    this.f38101d = 2;
                    C7499b.m14977z0(obj2);
                    return obj2;
                }
                this.f38101d = 1;
                C7499b.m14977z0(obj2);
                InterfaceC2056p interfaceC2056p2 = this.f38102e;
                C5207g.m11109d(interfaceC2056p2, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                C5213m.m11200e(2, interfaceC2056p2);
                return interfaceC2056p2.mo1337m0(this.f38103f, this);
            }
        };
    }

    /* JADX INFO: renamed from: q */
    public static final void m16909q(String str, int i10) {
        File[] fileArrListFiles;
        C5207g.m11112g(str, "fileTempDir");
        try {
            File file = new File(str);
            if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
                ArrayList<File> arrayList = new ArrayList();
                for (File file2 : fileArrListFiles) {
                    C5207g.m11107b(file2, "file");
                    String name = file2.getName();
                    C5207g.m11110e(name, "name");
                    String strM14276A3 = C7076b.m14276A3(name, name);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i10);
                    sb2.append('.');
                    if (C7661i.m15256V2(strM14276A3, sb2.toString(), false)) {
                        arrayList.add(file2);
                    }
                }
                for (File file3 : arrayList) {
                    if (file3.exists()) {
                        file3.delete();
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: r */
    public static final LessonBookmark m16910r(ResultLessonBookmark resultLessonBookmark, int i10) {
        C5207g.m11111f(resultLessonBookmark, "<this>");
        return new LessonBookmark(i10, resultLessonBookmark.f18561a, resultLessonBookmark.f18562b, resultLessonBookmark.f18563c, resultLessonBookmark.f18564d);
    }

    /* JADX INFO: renamed from: s */
    public static final String m16911s(String str, int i10, int i11) {
        C5207g.m11112g(str, "fileTempDir");
        return str + '/' + i10 + '.' + i11 + ".data";
    }

    /* JADX INFO: renamed from: t */
    public static final String m16912t(SentenceDownloadItem sentenceDownloadItem) {
        C5207g.m11111f(sentenceDownloadItem, "<this>");
        return (String) C6752c.m13432Z(C7076b.m14299s3(sentenceDownloadItem.f17984c, new String[]{"/"}, 0, 6));
    }

    /* JADX INFO: renamed from: u */
    public static String m16913u(String str, String str2, String... strArr) {
        if (str != null) {
            return str;
        }
        if (str2 != null) {
            return str2;
        }
        for (String str3 : strArr) {
            if (str3 != null) {
                return str3;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public static final String m16914v(String str, int i10) {
        C5207g.m11112g(str, "fileTempDir");
        return str + '/' + i10 + ".meta.data";
    }

    /* JADX INFO: renamed from: w */
    public static final int m16915w(int i10, int i11, int i12) {
        if (i12 > 0) {
            if (i10 >= i11) {
                return i11;
            }
            int i13 = i11 % i12;
            if (i13 < 0) {
                i13 += i12;
            }
            int i14 = i10 % i12;
            if (i14 < 0) {
                i14 += i12;
            }
            int i15 = (i13 - i14) % i12;
            if (i15 < 0) {
                i15 += i12;
            }
            return i11 - i15;
        }
        if (i12 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        if (i10 <= i11) {
            return i11;
        }
        int i16 = -i12;
        int i17 = i10 % i16;
        if (i17 < 0) {
            i17 += i16;
        }
        int i18 = i11 % i16;
        if (i18 < 0) {
            i18 += i16;
        }
        int i19 = (i17 - i18) % i16;
        if (i19 < 0) {
            i19 += i16;
        }
        return i11 + i19;
    }

    /* JADX INFO: renamed from: x */
    public static final Downloader.C4980b m16916x(Download download, String str) {
        C5207g.m11112g(download, "download");
        C5207g.m11112g(str, "requestMethod");
        return m16917y(download, -1L, -1L, str, 0, 16);
    }

    /* JADX INFO: renamed from: y */
    public static Downloader.C4980b m16917y(Download download, long j10, long j11, String str, int i10, int i11) {
        long j12 = (i11 & 2) != 0 ? -1L : j10;
        long j13 = (i11 & 4) != 0 ? -1L : j11;
        String str2 = (i11 & 8) != 0 ? "GET" : str;
        int i12 = (i11 & 16) != 0 ? 1 : i10;
        C5207g.m11112g(download, "download");
        C5207g.m11112g(str2, "requestMethod");
        if (j12 == -1) {
            j12 = 0;
        }
        String strValueOf = j13 == -1 ? "" : String.valueOf(j13);
        LinkedHashMap linkedHashMapM13467T0 = C6753d.m13467T0(download.mo10587i());
        linkedHashMapM13467T0.put("Range", "bytes=" + j12 + '-' + strValueOf);
        return new Downloader.C4980b(download.getF32331a(), download.mo10577L(), linkedHashMapM13467T0, download.mo10582V(), C5579b.m11820l(download.mo10582V()), download.mo10586g(), download.getF32324K(), str2, download.mo10589o(), "", i12);
    }

    /* JADX INFO: renamed from: z */
    public static int m16918z(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    @Override // so.InterfaceC9091i
    /* JADX INFO: renamed from: a */
    public List mo16919a(C9096n c9096n) {
        C5207g.m11111f(c9096n, "url");
        return EmptyList.f38032a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p541zn.InterfaceC10548l
    /* JADX INFO: renamed from: b */
    public void mo16920b(AbstractC9557b abstractC9557b, ArrayList arrayList) {
        C5207g.m11111f(abstractC9557b, "descriptor");
        throw new IllegalStateException("Incomplete hierarchy for class " + abstractC9557b.mo11874a() + ", unresolved classes " + arrayList);
    }

    @Override // p541zn.InterfaceC10548l
    /* JADX INFO: renamed from: c */
    public void mo16921c(CallableMemberDescriptor callableMemberDescriptor) {
        C5207g.m11111f(callableMemberDescriptor, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + callableMemberDescriptor);
    }

    @Override // so.InterfaceC9091i
    /* JADX INFO: renamed from: d */
    public void mo16922d(C9096n c9096n, List list) {
        C5207g.m11111f(c9096n, "url");
    }
}
