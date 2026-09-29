package p000;

import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.compose.p002ui.semantics.AbstractC0426f;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.domain.model.vocabulary.VocabularySearchQuery;
import com.lingq.core.settings.theme.ThemeSettingsTab;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ow8 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55081a;

    public /* synthetic */ ow8(int i) {
        this.f55081a = i;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        String str;
        String str2;
        int i = this.f55081a;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                zaa zaaVar = (zaa) obj;
                zaaVar.getClass();
                return AbstractC3393o1.m17734i("note_", zaaVar.f71294a);
            case 1:
                q98 q98Var = (q98) obj;
                q98Var.getClass();
                q98Var.m19816f(false);
                return xfaVar;
            case 2:
                ((ia4) obj).getClass();
                return xfaVar;
            case 3:
                dx8 dx8Var = (dx8) obj;
                dx8Var.getClass();
                return Integer.valueOf(dx8Var.f36397a);
            case 4:
                tv8 tv8Var = (tv8) obj;
                tv8Var.getClass();
                AbstractC0426f.m1860d(tv8Var, "sentence:vocabulary");
                return xfaVar;
            case 5:
                if4 if4Var = (if4) obj;
                if4Var.getClass();
                if4Var.f44042c = true;
                return xfaVar;
            case 6:
                dr5 dr5Var = (dr5) obj;
                dr5Var.getClass();
                return Integer.valueOf(dr5Var.m10611b().f40379a);
            case 7:
                String str3 = (String) obj;
                str3.getClass();
                return str3;
            case 8:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 9:
                ((ThemeSettingsTab) obj).getClass();
                return xfaVar;
            case 10:
                ((ThemeSettingsTab) obj).getClass();
                return xfaVar;
            case 11:
                TokenMeaning tokenMeaning = (TokenMeaning) obj;
                return (tokenMeaning == null || (str = tokenMeaning.f19596c) == null) ? "" : str;
            case 12:
                TokenMeaning tokenMeaning2 = (TokenMeaning) obj;
                return (tokenMeaning2 == null || (str2 = tokenMeaning2.f19596c) == null) ? "" : str2;
            case 13:
                ((j3a) obj).getClass();
                return xfaVar;
            case 14:
                List list = (List) obj;
                return new l7a(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue(), ((Number) list.get(2)).floatValue());
            case 15:
                ol7 ol7Var = (ol7) obj;
                String str4 = ol7Var.f54547d;
                String str5 = ol7Var.f54544a;
                long j = ol7Var.f54545b;
                StringBuilder sb = new StringBuilder();
                sb.append(str4);
                sb.append("@");
                sb.append(str5);
                sb.append("(");
                return wq1.m24113i(j, ")", sb);
            case 16:
                ((InterfaceC0310a) obj).getClass();
                return xfaVar;
            case 17:
                return xfaVar;
            case 18:
                vu4 vu4Var = (vu4) obj;
                vu4Var.getClass();
                vu4.m23545g(vu4Var, null, drc.f36139s, 3);
                vu4.m23545g(vu4Var, null, drc.f36140t, 3);
                vu4.m23545g(vu4Var, null, drc.f36141u, 3);
                vu4.m23545g(vu4Var, null, drc.f36142v, 3);
                vu4.m23545g(vu4Var, null, drc.f36143w, 3);
                return xfaVar;
            case 19:
                hma hmaVar = (hma) obj;
                hmaVar.getClass();
                hma.m13336j(hmaVar);
                mad.m16723e(hmaVar, "", new ow8(23));
                return xfaVar;
            case 20:
                hma hmaVar2 = (hma) obj;
                hmaVar2.getClass();
                hma.m13335i(hmaVar2);
                mad.m16721c(hmaVar2, ':');
                hma.m13336j(hmaVar2);
                mad.m16723e(hmaVar2, "", new ow8(22));
                return xfaVar;
            case 21:
                hma hmaVar3 = (hma) obj;
                hmaVar3.getClass();
                hma.m13335i(hmaVar3);
                mad.m16723e(hmaVar3, "", new ow8(19));
                return xfaVar;
            case 22:
                hma hmaVar4 = (hma) obj;
                hmaVar4.getClass();
                mad.m16721c(hmaVar4, ':');
                hma.m13337k(hmaVar4);
                return xfaVar;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                hma hmaVar5 = (hma) obj;
                hmaVar5.getClass();
                hma.m13337k(hmaVar5);
                return xfaVar;
            case 24:
                hma hmaVar6 = (hma) obj;
                hmaVar6.getClass();
                hmaVar6.mo3730b().m23473o(new yi1("z"));
                return xfaVar;
            case 25:
                hma hmaVar7 = (hma) obj;
                hmaVar7.getClass();
                mad.m16723e(hmaVar7, "Z", new ow8(20));
                return xfaVar;
            case 26:
                hma hmaVar8 = (hma) obj;
                hmaVar8.getClass();
                hmaVar8.mo3730b().m23473o(new yi1("z"));
                return xfaVar;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                hma hmaVar9 = (hma) obj;
                hmaVar9.getClass();
                mad.m16723e(hmaVar9, "Z", new ow8(21));
                return xfaVar;
            case 28:
                VocabularySearchQuery vocabularySearchQuery = (VocabularySearchQuery) obj;
                vocabularySearchQuery.getClass();
                vocabularySearchQuery.f19865g = new ArrayList();
                return xfaVar;
            default:
                VocabularySearchQuery vocabularySearchQuery2 = (VocabularySearchQuery) obj;
                vocabularySearchQuery2.getClass();
                vocabularySearchQuery2.f19864f = "";
                return xfaVar;
        }
    }
}
