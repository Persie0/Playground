package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.foundation.lazy.C0127b;
import androidx.compose.foundation.lazy.grid.C0129b;
import androidx.compose.foundation.lazy.staggeredgrid.C0144d;
import androidx.compose.p002ui.semantics.AbstractC0426f;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.navigation.R$id;
import com.lingq.core.domain.model.language.DictionaryLocale;
import com.lingq.core.domain.model.language.LanguageToLearn;
import com.lingq.core.domain.model.library.LibraryShelf;
import com.lingq.core.p012ui.library.CourseContextMenuItem;
import com.lingq.core.p012ui.library.LessonContextMenuItem;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.modules.C3268a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tf4 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62220a;

    public /* synthetic */ tf4(int i, hv4 hv4Var) {
        this.f62220a = 7;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        int i = this.f62220a;
        int i2 = 3;
        int i3 = 2;
        int i4 = 0;
        int i5 = 1;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                a31 a31Var = (a31) obj;
                a31Var.getClass();
                a31Var.m56a("JsonPrimitive", new wf4(new C3288l7(29)));
                a31Var.m56a("JsonNull", new wf4(new uf4(i4)));
                a31Var.m56a("JsonLiteral", new wf4(new uf4(i5)));
                a31Var.m56a("JsonObject", new wf4(new uf4(i3)));
                a31Var.m56a("JsonArray", new wf4(new uf4(i2)));
                return xfaVar;
            case 1:
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT `code`, `id`, `supported`, `title`, `lastUsed`, `knownWords`, `dictionaryLocaleActive`, `scheduledForDeletion` FROM (SELECT * FROM LanguageEntity)");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (ik8VarMo2873e0.mo2876a0()) {
                        String strMo2875L = ik8VarMo2873e0.mo2875L(0);
                        int i6 = (int) ik8VarMo2873e0.getLong(1);
                        arrayList.add(new LanguageToLearn(strMo2875L, ((int) ik8VarMo2873e0.getLong(2)) != 0, ik8VarMo2873e0.mo2875L(3), (int) ik8VarMo2873e0.getLong(5), i6, ik8VarMo2873e0.isNull(6) ? null : ik8VarMo2873e0.mo2875L(6), ik8VarMo2873e0.isNull(4) ? null : ik8VarMo2873e0.mo2875L(4), ((int) ik8VarMo2873e0.getLong(7)) != 0));
                        break;
                    }
                    return arrayList;
                } finally {
                    ik8VarMo2873e0.close();
                }
            case 2:
                List list = (List) obj;
                return new C0129b(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 3:
                ((Integer) obj).getClass();
                ss4 ss4Var = et4.f37825a;
                return EmptyList.f47638a;
            case 4:
                ((Integer) obj).getClass();
                ss4 ss4Var2 = et4.f37825a;
                return -1;
            case 5:
                ((Integer) obj).getClass();
                return null;
            case 6:
                List list2 = (List) obj;
                return new C0127b(((Number) list2.get(0)).intValue(), ((Number) list2.get(1)).intValue());
            case 7:
                return xfaVar;
            case 8:
                List list3 = (List) obj;
                return new C0144d((int[]) list3.get(0), (int[]) list3.get(1));
            case 9:
                return xfaVar;
            case 10:
                ((CourseContextMenuItem) obj).getClass();
                return xfaVar;
            case 11:
                ((LibraryShelf) obj).getClass();
                return xfaVar;
            case 12:
                ((LessonContextMenuItem) obj).getClass();
                return xfaVar;
            case 13:
                tv8 tv8Var = (tv8) obj;
                tv8Var.getClass();
                AbstractC0426f.m1860d(tv8Var, "lesson:item");
                return xfaVar;
            case 14:
                tv8 tv8Var2 = (tv8) obj;
                tv8Var2.getClass();
                AbstractC0426f.m1860d(tv8Var2, "lesson:list");
                return xfaVar;
            case 15:
                h95 h95Var = (h95) obj;
                h95Var.getClass();
                return h95Var.mo188a();
            case 16:
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                ik8 ik8VarMo2873e1 = bk8Var2.mo2873e0("\n    SELECT DISTINCT * FROM DictionaryLocaleEntity");
                try {
                    int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e1, "code");
                    int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e1, "title");
                    ArrayList arrayList2 = new ArrayList();
                    while (ik8VarMo2873e1.mo2876a0()) {
                        arrayList2.add(new DictionaryLocale(ik8VarMo2873e1.mo2875L(iM14108v), ik8VarMo2873e1.mo2875L(iM14108v2)));
                    }
                    ik8VarMo2873e1.close();
                    return arrayList2;
                } catch (Throwable th) {
                    ik8VarMo2873e1.close();
                    throw th;
                }
            case 17:
                bk8 bk8Var3 = (bk8) obj;
                bk8Var3.getClass();
                ik8 ik8VarMo2873e2 = bk8Var3.mo2873e0("\n    SELECT DISTINCT * FROM DictionaryLocaleEntity");
                try {
                    int iM14108v3 = AbstractC3122is.m14108v(ik8VarMo2873e2, "code");
                    int iM14108v4 = AbstractC3122is.m14108v(ik8VarMo2873e2, "title");
                    ArrayList arrayList3 = new ArrayList();
                    while (ik8VarMo2873e2.mo2876a0()) {
                        arrayList3.add(new DictionaryLocale(ik8VarMo2873e2.mo2875L(iM14108v3), ik8VarMo2873e2.mo2875L(iM14108v4)));
                    }
                    ik8VarMo2873e2.close();
                    return arrayList3;
                } catch (Throwable th2) {
                    ik8VarMo2873e2.close();
                    throw th2;
                }
            case 18:
                return Boolean.TRUE;
            case 19:
                f37 f37Var = (f37) obj;
                StringBuilder sb = new StringBuilder("[");
                sb.append(f37Var.f38359b);
                sb.append(", ");
                return wq1.m24122r(sb, f37Var.f38360c, ')');
            case 20:
                Context context = (Context) obj;
                context.getClass();
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 21:
                r86 r86Var = (r86) obj;
                r86Var.getClass();
                u86 u86Var = r86Var.f58882c;
                if (u86Var == null || u86Var.f63589g.f60816b != r86Var.f58881b.f57368b) {
                    return null;
                }
                return u86Var;
            case 22:
                r86 r86Var2 = (r86) obj;
                r86Var2.getClass();
                u86 u86Var2 = r86Var2.f58882c;
                if (u86Var2 == null || u86Var2.f63589g.f60816b != r86Var2.f58881b.f57368b) {
                    return null;
                }
                return u86Var2;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                r86 r86Var3 = (r86) obj;
                r86Var3.getClass();
                return Integer.valueOf(r86Var3.f58881b.f57368b);
            case 24:
                ((qr1) obj).getClass();
                return new i86();
            case 25:
                r86 r86Var4 = (r86) obj;
                r86Var4.getClass();
                return r86Var4.f58882c;
            case 26:
                View view = (View) obj;
                view.getClass();
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                View view2 = (View) obj;
                view2.getClass();
                Object tag = view2.getTag(R$id.nav_controller_view_tag);
                if (tag instanceof WeakReference) {
                    return (ud6) ((WeakReference) tag).get();
                }
                if (tag instanceof ud6) {
                    return (ud6) tag;
                }
                return null;
            case 28:
                if4 if4Var = (if4) obj;
                if4Var.getClass();
                if4Var.f44042c = true;
                if4Var.f44043d = true;
                if4Var.f44041b = false;
                if4Var.f44040a = true;
                C3268a c3268a = new C3268a();
                z21 z21VarM24933a = y38.m24933a(Date.class);
                wg8 wg8Var = wg8.f66797a;
                c3268a.m15629a(z21VarM24933a);
                if4Var.f44044e = new w41(c3268a.f48267a, c3268a.f48268b, c3268a.f48269c, c3268a.f48270d, c3268a.f48271e);
                return xfaVar;
            default:
                ((Long) obj).getClass();
                return xfaVar;
        }
    }

    public /* synthetic */ tf4(int i) {
        this.f62220a = i;
    }
}
