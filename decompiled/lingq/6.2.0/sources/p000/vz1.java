package p000;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.compose.foundation.lazy.layout.C0134c;
import androidx.compose.foundation.text.contextmenu.provider.C0175a;
import androidx.compose.p002ui.draw.C0298e;
import androidx.compose.p002ui.node.AbstractC0359i;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.p002ui.platform.C0411w;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.AbstractC0279g;
import androidx.compose.runtime.internal.C0282a;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import com.google.android.material.R$attr;
import com.google.common.util.concurrent.AbstractC1112b;
import com.lingq.core.designsystem.R$bool;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.AbstractC3208a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class vz1 {

    /* JADX INFO: renamed from: a */
    public static final C3551rw f66107a = new C3551rw();

    /* JADX INFO: renamed from: b */
    public static final C0134c[] f66108b = new C0134c[0];

    /* JADX INFO: renamed from: c */
    public static final lz5 f66109c = new lz5(27);

    /* JADX INFO: renamed from: d */
    public static final iw6 f66110d = new iw6(1);

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f66111e = 0;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f66112f = 0;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f66113g = 0;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int f66114h = 0;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ int f66115i = 0;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ int f66116j = 0;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int f66117k = 0;

    /* JADX INFO: renamed from: A */
    public static final void m23597A(un1 un1Var) {
        AbstractC3208a.m15439f(un1Var.mo1309x());
    }

    /* JADX INFO: renamed from: B */
    public static final void m23598B(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        bs5 bs5Var = new bs5();
        bs5Var.f35332d = r46.m20365H(abstractComponentCallbacksC0635c.m2090R(), R$attr.motionEasingEmphasizedDecelerateInterpolator, new qz2(1));
        bs5Var.f35331c = r46.m20364G(abstractComponentCallbacksC0635c.m2090R(), R$attr.motionDurationShort3, 150);
        abstractComponentCallbacksC0635c.m2096X(bs5Var);
    }

    /* JADX INFO: renamed from: C */
    public static final Object m23599C(Object obj) {
        if (obj instanceof JSONObject) {
            return m23634h0((JSONObject) obj);
        }
        if (!(obj instanceof JSONArray)) {
            if (obj instanceof BigDecimal) {
                return Double.valueOf(((BigDecimal) obj).doubleValue());
            }
            if (fa4.m11650l(obj, JSONObject.NULL)) {
                return null;
            }
            return obj;
        }
        JSONArray jSONArray = (JSONArray) obj;
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(m23599C(jSONArray.get(i)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: D */
    public static final void m23600D(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        abstractComponentCallbacksC0635c.getClass();
        is5 is5Var = new is5(2, true);
        is5Var.f35332d = r46.m20365H(abstractComponentCallbacksC0635c.m2090R(), R$attr.motionEasingEmphasizedInterpolator, new qz2(1));
        is5Var.f35331c = r46.m20364G(abstractComponentCallbacksC0635c.m2090R(), R$attr.motionDurationLong2, 500);
        abstractComponentCallbacksC0635c.m2096X(is5Var);
        is5 is5Var2 = new is5(2, true);
        is5Var2.f35332d = r46.m20365H(abstractComponentCallbacksC0635c.m2090R(), R$attr.motionEasingEmphasizedAccelerateInterpolator, new qz2(1));
        is5Var2.f35331c = r46.m20364G(abstractComponentCallbacksC0635c.m2090R(), R$attr.motionDurationShort4, 200);
        abstractComponentCallbacksC0635c.m2104f().f37049i = is5Var2;
        is5 is5Var3 = new is5(2, false);
        is5Var3.f35332d = r46.m20365H(abstractComponentCallbacksC0635c.m2090R(), R$attr.motionEasingEmphasizedInterpolator, new qz2(1));
        is5Var3.f35331c = r46.m20364G(abstractComponentCallbacksC0635c.m2090R(), R$attr.motionDurationLong2, 500);
        abstractComponentCallbacksC0635c.m2098Z(is5Var3);
        is5 is5Var4 = new is5(2, false);
        is5Var4.f35332d = r46.m20365H(abstractComponentCallbacksC0635c.m2090R(), R$attr.motionEasingEmphasizedAccelerateInterpolator, new qz2(1));
        is5Var4.f35331c = r46.m20364G(abstractComponentCallbacksC0635c.m2090R(), R$attr.motionDurationShort4, 200);
        abstractComponentCallbacksC0635c.m2104f().f37050j = is5Var4;
    }

    /* JADX INFO: renamed from: G */
    public static i84 m23601G(Collection collection) {
        collection.getClass();
        return new i84(0, collection.size() - 1, 1);
    }

    /* JADX INFO: renamed from: H */
    public static int m23602H(List list) {
        list.getClass();
        return list.size() - 1;
    }

    /* JADX INFO: renamed from: I */
    public static final boolean m23603I(un1 un1Var) {
        cd4 cd4Var = (cd4) un1Var.mo1309x().get(nj0.f52795N);
        if (cd4Var != null) {
            return cd4Var.mo4538b();
        }
        return true;
    }

    /* JADX INFO: renamed from: J */
    public static List m23604J(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }

    /* JADX INFO: renamed from: K */
    public static List m23605K(Object... objArr) {
        objArr.getClass();
        if (objArr.length <= 0) {
            return EmptyList.f47638a;
        }
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    /* JADX INFO: renamed from: L */
    public static final int[] m23606L(List list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = d32.m10042h0(((aa1) list.get(i)).f414a);
        }
        return iArr;
    }

    /* JADX INFO: renamed from: M */
    public static final float[] m23607M(List list, List list2) {
        if (list != null) {
            return u91.m22619k1(list);
        }
        return null;
    }

    /* JADX INFO: renamed from: N */
    public static ArrayList m23608N(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C3772xu(objArr, true));
    }

    /* JADX INFO: renamed from: O */
    public static final String m23609O(String str, String str2) {
        str.getClass();
        str2.getClass();
        Locale localeForLanguageTag = Locale.forLanguageTag(str2);
        localeForLanguageTag.getClass();
        String lowerCase = str.toLowerCase(localeForLanguageTag);
        lowerCase.getClass();
        return lowerCase;
    }

    /* JADX INFO: renamed from: P */
    public static final String m23610P(String str, Locale locale) {
        str.getClass();
        locale.getClass();
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        return lowerCase;
    }

    /* JADX INFO: renamed from: Q */
    public static final List m23611Q(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : m23604J(list.get(0));
        }
        return EmptyList.f47638a;
    }

    /* JADX INFO: renamed from: R */
    public static final String m23612R(int i, int i2, Object[] objArr, ye1 ye1Var) {
        return ((Resources) ((tj3) ye1Var).m22128k(AbstractC0394f.f4762c)).getQuantityString(i, i2, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX INFO: renamed from: T */
    public static final void m23613T(Bundle bundle, String str, List list) {
        List list2 = list;
        bundle.putStringArrayList(str, list2 instanceof ArrayList ? (ArrayList) list2 : new ArrayList<>(list2));
    }

    /* JADX INFO: renamed from: V */
    public static final void m23614V(int i, int i2) {
        if (i2 < 0) {
            C3386nv.m17626m(ux5.m22989l("fromIndex (0) is greater than toIndex (", i2, ")."));
        } else {
            if (i2 <= i) {
                return;
            }
            v63.m23143u(ux5.m22987j(i2, i, "toIndex (", ") is greater than size (", ")."));
        }
    }

    /* JADX INFO: renamed from: W */
    public static final vx9 m23615W(vx9 vx9Var, LayoutDirection layoutDirection) {
        he9 he9Var = vx9Var.f66065a;
        xv9 xv9Var = ie9.f44030d;
        xv9 xv9Var2 = he9Var.f42264a;
        if (xv9Var2.equals(wv9.f67395a)) {
            xv9Var2 = ie9.f44030d;
        }
        xv9 xv9Var3 = xv9Var2;
        long j = he9Var.f42265b;
        ay9[] ay9VarArr = zx9.f72358b;
        if ((j & 1095216660480L) == 0) {
            j = ie9.f44027a;
        }
        long j2 = j;
        bc3 bc3Var = he9Var.f42266c;
        if (bc3Var == null) {
            bc3Var = bc3.f8321g;
        }
        bc3 bc3Var2 = bc3Var;
        wb3 wb3Var = he9Var.f42267d;
        wb3 wb3Var2 = new wb3(wb3Var != null ? wb3Var.f66583a : 0);
        xb3 xb3Var = he9Var.f42268e;
        xb3 xb3Var2 = new xb3(xb3Var != null ? xb3Var.f68021a : 65535);
        xa3 xa3Var = he9Var.f42269f;
        if (xa3Var == null) {
            xa3Var = xa3.f67989a;
        }
        xa3 xa3Var2 = xa3Var;
        String str = he9Var.f42270g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j3 = he9Var.f42271h;
        if ((j3 & 1095216660480L) == 0) {
            j3 = ie9.f44028b;
        }
        long j4 = j3;
        oa0 oa0Var = he9Var.f42272i;
        float f = oa0Var != null ? oa0Var.f54096a : 0.0f;
        oa0 oa0Var2 = new oa0(Float.isNaN(f) ? 0.0f : f);
        yv9 yv9Var = he9Var.f42273j;
        if (yv9Var == null) {
            yv9Var = yv9.f70559c;
        }
        yv9 yv9Var2 = yv9Var;
        xi5 xi5VarM16516s = he9Var.f42274k;
        if (xi5VarM16516s == null) {
            xi5 xi5Var = xi5.f68250c;
            xi5VarM16516s = z87.f71091a.m16516s();
        }
        xi5 xi5Var2 = xi5VarM16516s;
        long j5 = he9Var.f42275l;
        if (j5 == 16) {
            j5 = ie9.f44029c;
        }
        long j6 = j5;
        rt9 rt9Var = he9Var.f42276m;
        if (rt9Var == null) {
            rt9Var = rt9.f59801b;
        }
        rt9 rt9Var2 = rt9Var;
        l39 l39Var = he9Var.f42277n;
        if (l39Var == null) {
            l39Var = l39.f48992d;
        }
        l39 l39Var2 = l39Var;
        g97 g97Var = he9Var.f42278o;
        ml2 ml2Var = he9Var.f42279p;
        if (ml2Var == null) {
            ml2Var = w33.f66328a;
        }
        he9 he9Var2 = new he9(xv9Var3, j2, bc3Var2, wb3Var2, xb3Var2, xa3Var2, str2, j4, oa0Var2, yv9Var2, xi5Var2, j6, rt9Var2, l39Var2, g97Var, ml2Var);
        j37 j37Var = vx9Var.f66066b;
        int i = k37.f46626b;
        int i2 = j37Var.f45012a;
        int i3 = 5;
        if (i2 == 0) {
            i2 = 5;
        }
        int i4 = j37Var.f45013b;
        if (i4 == 3) {
            int i5 = wx9.f67488a[layoutDirection.ordinal()];
            if (i5 == 1) {
                i3 = 4;
            } else if (i5 != 2) {
                gm5.m12750e();
                return null;
            }
            i4 = i3;
        } else if (i4 == 0) {
            int i6 = wx9.f67488a[layoutDirection.ordinal()];
            if (i6 == 1) {
                i4 = 1;
            } else {
                if (i6 != 2) {
                    gm5.m12750e();
                    return null;
                }
                i4 = 2;
            }
        }
        long j7 = j37Var.f45014c;
        if ((j7 & 1095216660480L) == 0) {
            j7 = k37.f46625a;
        }
        aw9 aw9Var = j37Var.f45015d;
        if (aw9Var == null) {
            aw9Var = aw9.f7624c;
        }
        a97 a97Var = j37Var.f45016e;
        rc5 rc5Var = j37Var.f45017f;
        int i7 = j37Var.f45018g;
        if (i7 == 0) {
            i7 = hc5.f42171b;
        }
        int i8 = j37Var.f45019h;
        if (i8 == 0) {
            i8 = 1;
        }
        ax9 ax9Var = j37Var.f45020i;
        if (ax9Var == null) {
            ax9Var = ax9.f7649c;
        }
        return new vx9(he9Var2, new j37(i2, i4, j7, aw9Var, a97Var, rc5Var, i7, i8, ax9Var), vx9Var.f66067c);
    }

    /* JADX INFO: renamed from: X */
    public static e16 m23616X(e16 e16Var, float f, o39 o39Var, long j, long j2, int i) {
        if ((i & 2) != 0) {
            o39Var = ss5.f61356d;
        }
        o39 o39Var2 = o39Var;
        boolean z = false;
        if ((i & 4) != 0 && xj2.m24559a(f, 0.0f) > 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            j = rp3.f59679a;
        }
        long j3 = j;
        if ((i & 16) != 0) {
            j2 = rp3.f59679a;
        }
        return (xj2.m24559a(f, 0.0f) > 0 || z2) ? e16Var.mo3161g(new C0298e(f, o39Var2, z2, j3, j2)) : e16Var;
    }

    /* JADX INFO: renamed from: Y */
    public static final void m23617Y(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        is5 is5Var = new is5(1, true);
        is5Var.f35332d = r46.m20365H(abstractComponentCallbacksC0635c.m2090R(), R$attr.motionEasingEmphasizedDecelerateInterpolator, new qz2(1));
        is5Var.f35331c = r46.m20364G(abstractComponentCallbacksC0635c.m2090R(), R$attr.motionDurationLong2, 500);
        abstractComponentCallbacksC0635c.m2096X(is5Var);
        bs5 bs5Var = new bs5();
        bs5Var.f35332d = r46.m20365H(abstractComponentCallbacksC0635c.m2090R(), R$attr.motionEasingEmphasizedAccelerateInterpolator, new qz2(1));
        bs5Var.f35331c = r46.m20364G(abstractComponentCallbacksC0635c.m2090R(), R$attr.motionDurationShort4, 200);
        abstractComponentCallbacksC0635c.m2098Z(bs5Var);
    }

    /* JADX INFO: renamed from: Z */
    public static final String m23618Z(int i, Object[] objArr, ye1 ye1Var) {
        return ((Resources) ((tj3) ye1Var).m22128k(AbstractC0394f.f4762c)).getString(i, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX INFO: renamed from: a */
    public static final vl1 m23619a(kn1 kn1Var) {
        if (kn1Var.get(nj0.f52795N) == null) {
            kn1Var = kn1Var.plus(AbstractC3208a.m15434a());
        }
        return new vl1(kn1Var);
    }

    /* JADX INFO: renamed from: a0 */
    public static final String m23620a0(ye1 ye1Var, int i) {
        return ((Resources) ((tj3) ye1Var).m22128k(AbstractC0394f.f4762c)).getString(i);
    }

    /* JADX INFO: renamed from: b */
    public static ib2 m23621b() {
        return new ib2(1.0f, 1.0f);
    }

    /* JADX INFO: renamed from: b0 */
    public static final Set m23622b0() {
        return AbstractC3550rv.m20855w0(new String[]{"text/plain", "application/pdf", "application/epub+zip", "application/x-subrip", "application/x-mobipocket-ebook", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "audio/mpeg", "audio/mp4", "audio/x-m4a", "audio/x-wav", "text/ttml", "application/ttml+xml", "application/txt", "application/octet-stream"});
    }

    /* JADX INFO: renamed from: c */
    public static final void m23623c(e16 e16Var, AbstractC0279g abstractC0279g, C0282a c0282a, ye1 ye1Var, int i) {
        int i2;
        C0282a c0282a2 = ci8.f10117a;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-714464401);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22120g(abstractC0279g) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(c0282a2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var.m22124i(c0282a) ? 2048 : 1024;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            Object objM22097O = tj3Var.m22097O();
            if (objM22097O == we1.f66679a) {
                objM22097O = AbstractC0278f.m1259i(null, s46.f60289d);
                tj3Var.m22131l0(objM22097O);
            }
            C0175a c0175aM23631g = m23631g(c0282a2, tj3Var, (i2 >> 6) & 14);
            pvc.m19507c(abstractC0279g.mo1265a(c0175aM23631g), ci8.m4703P(274270255, new C2919d9(e16Var, (t66) objM22097O, c0282a, c0175aM23631g, 1), tj3Var), tj3Var, 56);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2956e9(i, 3, e16Var, abstractC0279g, c0282a);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static final e16 m23624c0(e16 e16Var, String str) {
        return e16Var.mo3161g(new ds9(str));
    }

    /* JADX INFO: renamed from: d */
    public static final int m23625d(AbstractC0359i abstractC0359i, AbstractC3608te abstractC3608te) {
        AbstractC0359i abstractC0359iMo1618E0 = abstractC0359i.mo1618E0();
        if (abstractC0359iMo1618E0 == null) {
            i54.m13663b("Child of " + abstractC0359i + " cannot be null when calculating alignment line");
        }
        if (abstractC0359i.mo1624N0().mo10624b().containsKey(abstractC3608te)) {
            Integer num = (Integer) abstractC0359i.mo1624N0().mo10624b().get(abstractC3608te);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iMo1630V = abstractC0359iMo1618E0.mo1630V(abstractC3608te);
            if (iMo1630V != Integer.MIN_VALUE) {
                boolean z = abstractC0359i.f4366j;
                boolean z2 = abstractC0359i.f4367k;
                abstractC0359iMo1618E0.f4366j = true;
                abstractC0359i.f4367k = true;
                abstractC0359i.mo1629T0();
                abstractC0359iMo1618E0.f4366j = z;
                abstractC0359i.f4367k = z2;
                return iMo1630V + ((int) (abstractC3608te instanceof iv3 ? abstractC0359iMo1618E0.mo1626P0() & 4294967295L : abstractC0359iMo1618E0.mo1626P0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: d0 */
    public static void m23626d0() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    /* JADX INFO: renamed from: e */
    public static ArrayList m23627e(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C3772xu(objArr, true));
    }

    /* JADX INFO: renamed from: e0 */
    public static void m23628e0() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    /* JADX INFO: renamed from: f */
    public static final String m23629f(Object obj, String str) {
        str.getClass();
        return obj + "_" + str;
    }

    /* JADX INFO: renamed from: f0 */
    public static final Object m23630f0(Object obj) {
        if (obj instanceof Map) {
            return m23632g0((Map) obj);
        }
        if (obj instanceof Collection) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(m23630f0(it.next()));
            }
            return jSONArray;
        }
        if (!(obj instanceof Object[])) {
            return obj;
        }
        Object[] objArr = (Object[]) obj;
        JSONArray jSONArray2 = new JSONArray();
        int i = 0;
        while (true) {
            if (!(i < objArr.length)) {
                return jSONArray2;
            }
            int i2 = i + 1;
            try {
                jSONArray2.put(m23630f0(objArr[i]));
                i = i2;
            } catch (ArrayIndexOutOfBoundsException e) {
                uk9.m22775i(e.getMessage());
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static final C0175a m23631g(C0282a c0282a, ye1 ye1Var, int i) {
        boolean z = (((i & 14) ^ 6) > 4 && ((tj3) ye1Var).m22120g(c0282a)) || (i & 6) == 4;
        tj3 tj3Var = (tj3) ye1Var;
        Object objM22097O = tj3Var.m22097O();
        p84 p84Var = we1.f66679a;
        if (z || objM22097O == p84Var) {
            objM22097O = new C0175a(c0282a);
            tj3Var.m22131l0(objM22097O);
        }
        C0175a c0175a = (C0175a) objM22097O;
        boolean zM22120g = tj3Var.m22120g(c0175a);
        Object objM22097O2 = tj3Var.m22097O();
        if (zM22120g || objM22097O2 == p84Var) {
            objM22097O2 = new C0011a9(c0175a, 3);
            tj3Var.m22131l0(objM22097O2);
        }
        d32.m10041h(c0175a, (vi3) objM22097O2, tj3Var);
        return c0175a;
    }

    /* JADX INFO: renamed from: g0 */
    public static final JSONObject m23632g0(Map map) throws JSONException {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            String str = key instanceof String ? (String) key : null;
            if (str != null) {
                jSONObject.put(str, m23630f0(entry.getValue()));
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: h */
    public static int m23633h(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        arrayList.getClass();
        m23614V(arrayList.size(), size);
        int i = size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int iM21718o = ss5.m21718o((Comparable) arrayList.get(i3), comparable);
            if (iM21718o < 0) {
                i2 = i3 + 1;
            } else {
                if (iM21718o <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: renamed from: h0 */
    public static final LinkedHashMap m23634h0(JSONObject jSONObject) {
        jSONObject.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        itKeys.getClass();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            next.getClass();
            linkedHashMap.put(next, m23599C(jSONObject.get(next)));
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: i */
    public static ListBuilder m23635i(List list) {
        list.getClass();
        ListBuilder listBuilder = (ListBuilder) list;
        listBuilder.m15378j();
        listBuilder.f47653c = true;
        return listBuilder.f47652b > 0 ? listBuilder : ListBuilder.f47650d;
    }

    /* JADX INFO: renamed from: i0 */
    public static final void m23636i0(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        zy2 zy2Var = new zy2();
        zy2Var.f35332d = r46.m20365H(abstractComponentCallbacksC0635c.m2090R(), R$attr.motionEasingEmphasizedDecelerateInterpolator, new qz2(1));
        zy2Var.f35331c = r46.m20364G(abstractComponentCallbacksC0635c.m2090R(), R$attr.motionDurationLong2, 200);
        abstractComponentCallbacksC0635c.m2096X(zy2Var);
        zy2 zy2Var2 = new zy2();
        zy2Var2.f35332d = r46.m20365H(abstractComponentCallbacksC0635c.m2090R(), R$attr.motionEasingEmphasizedDecelerateInterpolator, new qz2(1));
        zy2Var2.f35331c = r46.m20364G(abstractComponentCallbacksC0635c.m2090R(), R$attr.motionDurationLong2, 100);
        abstractComponentCallbacksC0635c.m2098Z(zy2Var2);
    }

    /* JADX INFO: renamed from: j */
    public static final void m23637j(un1 un1Var, CancellationException cancellationException) {
        cd4 cd4Var = (cd4) un1Var.mo1309x().get(nj0.f52795N);
        if (cd4Var != null) {
            cd4Var.mo4537a(cancellationException);
        } else {
            C3386nv.m17632s(un1Var, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static final void m23638j0(int i, AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        is5 is5Var = new is5(2, true);
        is5Var.f35332d = r46.m20365H(abstractComponentCallbacksC0635c.m2090R(), R$attr.motionEasingEmphasizedInterpolator, new qz2(1));
        is5Var.f35331c = i;
        abstractComponentCallbacksC0635c.m2096X(is5Var);
    }

    /* JADX INFO: renamed from: l0 */
    public static final void m23640l0(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        abstractComponentCallbacksC0635c.getClass();
        is5 is5Var = new is5(0, true);
        is5Var.f35332d = r46.m20365H(abstractComponentCallbacksC0635c.m2090R(), R$attr.motionEasingEmphasizedDecelerateInterpolator, new qz2(1));
        is5Var.f35331c = r46.m20364G(abstractComponentCallbacksC0635c.m2090R(), R$attr.motionDurationLong2, 500);
        abstractComponentCallbacksC0635c.m2096X(is5Var);
        is5 is5Var2 = new is5(0, false);
        is5Var2.f35332d = r46.m20365H(abstractComponentCallbacksC0635c.m2090R(), R$attr.motionEasingEmphasizedDecelerateInterpolator, new qz2(1));
        is5Var2.f35331c = r46.m20364G(abstractComponentCallbacksC0635c.m2090R(), R$attr.motionDurationLong2, 500);
        abstractComponentCallbacksC0635c.m2104f().f37050j = is5Var2;
        is5 is5Var3 = new is5(0, true);
        is5Var3.f35332d = r46.m20365H(abstractComponentCallbacksC0635c.m2090R(), R$attr.motionEasingEmphasizedAccelerateInterpolator, new qz2(1));
        is5Var3.f35331c = r46.m20364G(abstractComponentCallbacksC0635c.m2090R(), R$attr.motionDurationShort4, 200);
        abstractComponentCallbacksC0635c.m2104f().f37049i = is5Var3;
        is5 is5Var4 = new is5(0, false);
        is5Var4.f35332d = r46.m20365H(abstractComponentCallbacksC0635c.m2090R(), R$attr.motionEasingEmphasizedAccelerateInterpolator, new qz2(1));
        is5Var4.f35331c = r46.m20364G(abstractComponentCallbacksC0635c.m2090R(), R$attr.motionDurationShort4, 200);
        abstractComponentCallbacksC0635c.m2098Z(is5Var4);
    }

    /* JADX INFO: renamed from: m0 */
    public static final void m23641m0(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        abstractComponentCallbacksC0635c.getClass();
        is5 is5Var = new is5(1, true);
        is5Var.f35332d = r46.m20365H(abstractComponentCallbacksC0635c.m2090R(), R$attr.motionEasingEmphasizedDecelerateInterpolator, new qz2(1));
        is5Var.f35331c = r46.m20364G(abstractComponentCallbacksC0635c.m2090R(), R$attr.motionDurationLong2, 500);
        abstractComponentCallbacksC0635c.m2096X(is5Var);
        is5 is5Var2 = new is5(1, false);
        is5Var2.f35332d = r46.m20365H(abstractComponentCallbacksC0635c.m2090R(), R$attr.motionEasingEmphasizedAccelerateInterpolator, new qz2(1));
        is5Var2.f35331c = r46.m20364G(abstractComponentCallbacksC0635c.m2090R(), R$attr.motionDurationShort4, 200);
        abstractComponentCallbacksC0635c.m2104f().f37050j = is5Var2;
        is5 is5Var3 = new is5(1, true);
        is5Var3.f35332d = r46.m20365H(abstractComponentCallbacksC0635c.m2090R(), R$attr.motionEasingEmphasizedAccelerateInterpolator, new qz2(1));
        is5Var3.f35331c = r46.m20364G(abstractComponentCallbacksC0635c.m2090R(), R$attr.motionDurationShort4, 200);
        abstractComponentCallbacksC0635c.m2104f().f37049i = is5Var3;
        is5 is5Var4 = new is5(1, false);
        is5Var4.f35332d = r46.m20365H(abstractComponentCallbacksC0635c.m2090R(), R$attr.motionEasingEmphasizedAccelerateInterpolator, new qz2(1));
        is5Var4.f35331c = r46.m20364G(abstractComponentCallbacksC0635c.m2090R(), R$attr.motionDurationShort4, 200);
        abstractComponentCallbacksC0635c.m2098Z(is5Var4);
    }

    /* JADX INFO: renamed from: n */
    public static final void m23642n(int i, int i2) {
        if (i < 0 || i >= i2) {
            v63.m23143u(wq1.m24115k("index: ", i, i2, ", size: "));
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static void m23643n0(String str) {
        throw new IllegalArgumentException(wq1.m24119o("Unsupported type: ", str, ". ", wq1.m24118n("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }

    /* JADX INFO: renamed from: o */
    public static final void m23644o(int i, int i2) {
        if (i < 0 || i > i2) {
            v63.m23143u(wq1.m24115k("index: ", i, i2, ", size: "));
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static final void m23645o0(List list, List list2) {
        if (list2 == null) {
            if (list.size() >= 2) {
                return;
            }
            C3386nv.m17626m("colors must have length of at least 2 if colorStops is omitted.");
        } else {
            if (list.size() == list2.size()) {
                return;
            }
            C3386nv.m17626m("colors and colorStops arguments must have equal length.");
        }
    }

    /* JADX INFO: renamed from: p */
    public static final void m23646p(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            ij6.m13949f(i3, ux5.m22994q(i, i2, "fromIndex: ", ", toIndex: ", ", size: "));
        } else {
            if (i <= i2) {
                return;
            }
            C3386nv.m17626m(wq1.m24115k("fromIndex: ", i, i2, " > toIndex: "));
        }
    }

    /* JADX INFO: renamed from: p0 */
    public static final void m23647p0(e04 e04Var) {
        Object obj = e04Var.f36503b;
        if (obj instanceof d04) {
            C3386nv.m17626m("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
            return;
        }
        if (obj instanceof C3185ki) {
            m23643n0("ImageBitmap");
            throw null;
        }
        if (obj instanceof p04) {
            m23643n0("ImageVector");
            throw null;
        }
        if (obj instanceof y27) {
            m23643n0("Painter");
            throw null;
        }
        if (e04Var.f36504c == null) {
            return;
        }
        C3386nv.m17626m("request.target must be null.");
    }

    /* JADX INFO: renamed from: r */
    public static final ComposeView m23648r(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, C0282a c0282a) {
        abstractComponentCallbacksC0635c.getClass();
        ComposeView composeView = new ComposeView(abstractComponentCallbacksC0635c.m2090R(), null, 0, 6, null);
        composeView.setTransitionGroup(true);
        composeView.setViewCompositionStrategy(C0411w.f4868a);
        composeView.setContent(new C0282a(961192004, true, new zn0(c0282a, 2)));
        return composeView;
    }

    /* JADX INFO: renamed from: s */
    public static final Object m23649s(zi3 zi3Var, Continuation continuation) {
        cn8 cn8Var = new cn8(continuation.getContext(), continuation);
        Object objM19112b = pfa.m19112b(cn8Var, true, cn8Var, zi3Var);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM19112b;
    }

    /* JADX INFO: renamed from: t */
    public static ListBuilder m23650t() {
        return new ListBuilder(10);
    }

    /* JADX INFO: renamed from: u */
    public static final LinkedHashMap m23651u(Map map) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map.size());
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put((String) entry.getKey(), m23652v(entry.getValue()));
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: v */
    public static final Object m23652v(Object obj) {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            LinkedHashMap linkedHashMap = new LinkedHashMap(map.size());
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), m23652v(entry.getValue()));
            }
            return linkedHashMap;
        }
        if (!(obj instanceof Collection)) {
            return obj;
        }
        ArrayList arrayList = new ArrayList(((Collection) obj).size());
        Iterator it = ((Iterable) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(m23652v(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: w */
    public static final boolean m23653w(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        abstractComponentCallbacksC0635c.getClass();
        Context contextM2090R = abstractComponentCallbacksC0635c.m2090R();
        return !contextM2090R.getResources().getBoolean(R$bool.is_phone) && contextM2090R.getResources().getConfiguration().orientation == 2;
    }

    /* JADX INFO: renamed from: x */
    public static final e16 m23654x(e16 e16Var, vi3 vi3Var) {
        return e16Var.mo3161g(new jl2(vi3Var));
    }

    /* JADX INFO: renamed from: y */
    public static final e16 m23655y(e16 e16Var, vi3 vi3Var) {
        return e16Var.mo3161g(new ol2(vi3Var));
    }

    /* JADX INFO: renamed from: z */
    public static final e16 m23656z(e16 e16Var, vi3 vi3Var) {
        return e16Var.mo3161g(new pl2(vi3Var));
    }

    /* JADX INFO: renamed from: E */
    public abstract C3095i0 mo14229E(AbstractC1112b abstractC1112b);

    /* JADX INFO: renamed from: F */
    public abstract C3594t0 mo14230F(AbstractC1112b abstractC1112b);

    /* JADX INFO: renamed from: S */
    public abstract void mo14231S(C3594t0 c3594t0, C3594t0 c3594t1);

    /* JADX INFO: renamed from: U */
    public abstract void mo14232U(C3594t0 c3594t0, Thread thread);

    /* JADX INFO: renamed from: k */
    public abstract boolean mo14233k(AbstractC1112b abstractC1112b, C3095i0 c3095i0, C3095i0 c3095i1);

    /* JADX INFO: renamed from: l */
    public abstract boolean mo14234l(AbstractC1112b abstractC1112b, Object obj, Object obj2);

    /* JADX INFO: renamed from: m */
    public abstract boolean mo14235m(AbstractC1112b abstractC1112b, C3594t0 c3594t0, C3594t0 c3594t1);

    /* JADX INFO: renamed from: q */
    public abstract List mo19836q(String str, List list);
}
