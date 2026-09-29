package p000;

import android.view.View;
import androidx.compose.p002ui.focus.C0302d;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.semantics.C0423c;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.recyclerview.widget.RecyclerView;
import com.iterable.iterableapi.C1212h;
import com.lingq.core.domain.model.chat.ChatHistoryOld;
import com.lingq.core.domain.model.cup.CupPrize;
import com.lingq.core.domain.model.language.DictionaryLocale;
import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.lesson.LessonTranslationSentence;
import com.lingq.core.domain.model.milestones.Badge;
import com.lingq.feature.reader.tracking.TrackingPauseReason;
import java.io.File;
import java.util.Comparator;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlinx.datetime.LocalDateTime;

/* JADX INFO: loaded from: classes.dex */
public final class ma3 implements Comparator {

    /* JADX INFO: renamed from: b */
    public static final ma3 f50829b = new ma3(0);

    /* JADX INFO: renamed from: c */
    public static final ma3 f50830c = new ma3(1);

    /* JADX INFO: renamed from: d */
    public static final ma3 f50831d = new ma3(2);

    /* JADX INFO: renamed from: e */
    public static final ma3 f50832e = new ma3(3);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50833a;

    public /* synthetic */ ma3(int i) {
        this.f50833a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f50833a) {
            case 0:
                C0302d c0302d = (C0302d) obj;
                C0302d c0302d2 = (C0302d) obj2;
                if (AbstractC3695vr.m23511v(c0302d) && AbstractC3695vr.m23511v(c0302d2)) {
                    C0357g c0357gM21979L = te1.m21979L(c0302d);
                    C0357g c0357gM21979L2 = te1.m21979L(c0302d2);
                    if (!fa4.m11650l(c0357gM21979L, c0357gM21979L2)) {
                        Object[] objArr = new C0357g[16];
                        int i = 0;
                        while (c0357gM21979L != null) {
                            int i2 = i + 1;
                            if (objArr.length < i2) {
                                int length = objArr.length;
                                Object[] objArr2 = new Object[Math.max(i2, length * 2)];
                                System.arraycopy(objArr, 0, objArr2, 0, length);
                                objArr = objArr2;
                            }
                            if (i != 0) {
                                System.arraycopy(objArr, 0, objArr, 0 + 1, i + 0);
                            }
                            objArr[0] = c0357gM21979L;
                            i++;
                            c0357gM21979L = c0357gM21979L.m1610w();
                        }
                        Object[] objArr3 = new C0357g[16];
                        int i3 = 0;
                        while (c0357gM21979L2 != null) {
                            int i4 = i3 + 1;
                            if (objArr3.length < i4) {
                                int length2 = objArr3.length;
                                Object[] objArr4 = new Object[Math.max(i4, length2 * 2)];
                                System.arraycopy(objArr3, 0, objArr4, 0, length2);
                                objArr3 = objArr4;
                            }
                            if (i3 != 0) {
                                System.arraycopy(objArr3, 0, objArr3, 0 + 1, i3 + 0);
                            }
                            objArr3[0] = c0357gM21979L2;
                            i3++;
                            c0357gM21979L2 = c0357gM21979L2.m1610w();
                        }
                        int iMin = Math.min(i - 1, i3 - 1);
                        if (iMin >= 0) {
                            int i5 = 0;
                            while (fa4.m11650l(objArr[i5], objArr3[i5])) {
                                if (i5 != iMin) {
                                    i5++;
                                }
                            }
                            return fa4.m11651m(((C0357g) objArr[i5]).m1612y(), ((C0357g) objArr3[i5]).m1612y());
                        }
                        C3386nv.m17633t("Could not find a common ancestor between the two FocusModifiers.");
                    }
                } else {
                    if (AbstractC3695vr.m23511v(c0302d)) {
                        return -1;
                    }
                    if (AbstractC3695vr.m23511v(c0302d2)) {
                        return 1;
                    }
                }
                return 0;
            case 1:
                e28 e28VarM1847h = ((C0423c) obj).m1847h();
                e28 e28VarM1847h2 = ((C0423c) obj2).m1847h();
                int iCompare = Float.compare(e28VarM1847h.f36620a, e28VarM1847h2.f36620a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(e28VarM1847h.f36621b, e28VarM1847h2.f36621b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(e28VarM1847h.f36623d, e28VarM1847h2.f36623d);
                return iCompare3 != 0 ? iCompare3 : Float.compare(e28VarM1847h.f36622c, e28VarM1847h2.f36622c);
            case 2:
                e28 e28VarM1847h3 = ((C0423c) obj).m1847h();
                e28 e28VarM1847h4 = ((C0423c) obj2).m1847h();
                int iCompare4 = Float.compare(e28VarM1847h4.f36622c, e28VarM1847h3.f36622c);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(e28VarM1847h3.f36621b, e28VarM1847h4.f36621b);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(e28VarM1847h3.f36623d, e28VarM1847h4.f36623d);
                return iCompare6 != 0 ? iCompare6 : Float.compare(e28VarM1847h4.f36620a, e28VarM1847h3.f36620a);
            case 3:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                int iCompare7 = Float.compare(((e28) pair.f47623a).f36621b, ((e28) pair2.f47623a).f36621b);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((e28) pair.f47623a).f36623d, ((e28) pair2.f47623a).f36623d);
            case 4:
                return ((int[]) obj)[0] - ((int[]) obj2)[0];
            case 5:
                return ss5.m21718o((String) ((Pair) obj).f47624b, (String) ((Pair) obj2).f47624b);
            case 6:
                return ss5.m21718o(Double.valueOf(((hr0) obj).f42817b), Double.valueOf(((hr0) obj2).f42817b));
            case 7:
                zh5 zh5Var = LocalDateTime.Companion;
                return ss5.m21718o(zh5.m25656a(zh5Var, ((ChatHistoryOld) obj2).f18918d), zh5.m25656a(zh5Var, ((ChatHistoryOld) obj).f18918d));
            case 8:
                return ((ba1) obj2).m3502b() - ((ba1) obj).m3502b();
            case 9:
                WeakHashMap weakHashMap = dta.f36217a;
                float z = ((View) obj).getZ();
                float z2 = ((View) obj2).getZ();
                if (z > z2) {
                    return -1;
                }
                return z < z2 ? 1 : 0;
            case 10:
                return ss5.m21718o(((CupPrize) obj2).f18987a, ((CupPrize) obj).f18987a);
            case 11:
                return ss5.m21718o(Integer.valueOf(((xw1) obj).f68886f), Integer.valueOf(((xw1) obj2).f68886f));
            case 12:
                return ss5.m21718o(Integer.valueOf(((xw1) obj).f68886f), Integer.valueOf(((xw1) obj2).f68886f));
            case 13:
                return ss5.m21718o(((File) obj).getName(), ((File) obj2).getName());
            case 14:
                return ss5.m21718o(((DictionaryLocale) obj).f19022b, ((DictionaryLocale) obj2).f19022b);
            case 15:
                return ((ag2) obj).f597a - ((ag2) obj2).f597a;
            case 16:
                yj3 yj3Var = (yj3) obj;
                yj3 yj3Var2 = (yj3) obj2;
                RecyclerView recyclerView = yj3Var.f69908d;
                if ((recyclerView == null) == (yj3Var2.f69908d == null)) {
                    boolean z3 = yj3Var.f69905a;
                    if (z3 == yj3Var2.f69905a) {
                        int i6 = yj3Var2.f69906b - yj3Var.f69906b;
                        if (i6 != 0) {
                            return i6;
                        }
                        int i7 = yj3Var.f69907c - yj3Var2.f69907c;
                        if (i7 != 0) {
                            return i7;
                        }
                        return 0;
                    }
                    if (!z3) {
                        return 1;
                    }
                } else if (recyclerView == null) {
                    return 1;
                }
                return -1;
            case 17:
                return ss5.m21718o(((Badge) obj).f19512f, ((Badge) obj2).f19512f);
            case 18:
                return ss5.m21718o(Integer.valueOf(((Badge) obj).f19511e), Integer.valueOf(((Badge) obj2).f19511e));
            case 19:
                return ((ch9) obj).f10098d - ((ch9) obj2).f10098d;
            case 20:
                C1212h c1212h = (C1212h) obj;
                C1212h c1212h2 = (C1212h) obj2;
                if (c1212h.m6925h() < c1212h2.m6925h()) {
                    return -1;
                }
                return c1212h.m6925h() == c1212h2.m6925h() ? 0 : 1;
            case 21:
                return Integer.compare(((xh4) obj).f68201a, ((xh4) obj2).f68201a);
            case 22:
                return ss5.m21718o(((Badge) obj).f19512f, ((Badge) obj2).f19512f);
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return ss5.m21718o(Integer.valueOf(((h55) obj).f41803b), Integer.valueOf(((h55) obj2).f41803b));
            case 24:
                return ss5.m21718o(Integer.valueOf(((e55) obj).f36725a), Integer.valueOf(((e55) obj2).f36725a));
            case 25:
                return ss5.m21718o(Integer.valueOf(((LessonTranslationSentence) obj).f19292a), Integer.valueOf(((LessonTranslationSentence) obj2).f19292a));
            case 26:
                return ss5.m21718o(((TrackingPauseReason) obj).name(), ((TrackingPauseReason) obj2).name());
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                return ss5.m21718o(((w65) obj).mo8037d(), ((w65) obj2).mo8037d());
            case 28:
                return ss5.m21718o(((Language) obj).f19029f, ((Language) obj2).f19029f);
            default:
                return ss5.m21718o(Integer.valueOf(((m47) obj2).f50580a), Integer.valueOf(((m47) obj).f50580a));
        }
    }
}
