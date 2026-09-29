package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.status.TokenStatus;
import com.lingq.core.domain.model.theme.TextHighlightStyle;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.domain.store.AudioUnderlineMode;
import com.lingq.core.settings.theme.ThemeSettingsTab;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cx8 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34690a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f34691b;

    public /* synthetic */ cx8(vi3 vi3Var, int i) {
        this.f34690a = i;
        this.f34691b = vi3Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f34690a;
        xfa xfaVar = xfa.f68157a;
        vi3 vi3Var = this.f34691b;
        switch (i) {
            case 0:
                zu8 zu8Var = (zu8) obj;
                zu8Var.getClass();
                vi3Var.invoke(new ira(zu8Var));
                break;
            case 1:
                zu8 zu8Var2 = (zu8) obj;
                zu8Var2.getClass();
                vi3Var.invoke(new bt7(zu8Var2));
                break;
            case 2:
                ia4 ia4Var = (ia4) obj;
                ia4Var.getClass();
                vi3Var.invoke(new cs7(ia4Var.f43855a, ia4Var.f43856b));
                break;
            case 3:
                w65 w65Var = (w65) obj;
                w65Var.getClass();
                vi3Var.invoke(new mt7(w65Var));
                break;
            case 4:
                LessonWord lessonWord = (LessonWord) obj;
                lessonWord.getClass();
                vi3Var.invoke(new ot7(lessonWord));
                break;
            case 5:
                w65 w65Var2 = (w65) obj;
                w65Var2.getClass();
                vi3Var.invoke(new nt7(w65Var2));
                break;
            case 6:
                vi3Var.invoke(new vs7(((Float) obj).floatValue()));
                break;
            case 7:
                vi3Var.invoke(new zqa(((Integer) obj).intValue() + 1));
                break;
            case 8:
                vi3Var.invoke(new ara(((Integer) obj).intValue() + 1));
                break;
            case 9:
                ThemeSettingsTab themeSettingsTab = (ThemeSettingsTab) obj;
                themeSettingsTab.getClass();
                vi3Var.invoke(themeSettingsTab);
                break;
            case 10:
                vi3Var.invoke(new oy9(((Boolean) obj).booleanValue()));
                break;
            case 11:
                vi3Var.invoke(new sy9(((Boolean) obj).booleanValue()));
                break;
            case 12:
                vi3Var.invoke(new ry9(((Boolean) obj).booleanValue()));
                break;
            case 13:
                vi3Var.invoke(new qy9(((Boolean) obj).booleanValue()));
                break;
            case 14:
                vi3Var.invoke(new py9(((Boolean) obj).booleanValue()));
                break;
            case 15:
                vi3Var.invoke(new vy9(((Boolean) obj).booleanValue()));
                break;
            case 16:
                vs3 vs3Var = (vs3) obj;
                vs3Var.getClass();
                vi3Var.invoke(new ly9(vs3Var));
                break;
            case 17:
                yz7 yz7Var = (yz7) obj;
                yz7Var.getClass();
                vi3Var.invoke(new ny9(yz7Var));
                break;
            case 18:
                vi3Var.invoke(new iy9(((Boolean) obj).booleanValue()));
                break;
            case 19:
                AudioUnderlineMode audioUnderlineMode = (AudioUnderlineMode) obj;
                audioUnderlineMode.getClass();
                vi3Var.invoke(new hy9(audioUnderlineMode));
                break;
            case 20:
                String str = (String) obj;
                str.getClass();
                vi3Var.invoke(new uy9(str));
                break;
            case 21:
                vi3Var.invoke(new ky9(((Integer) obj).intValue()));
                break;
            case 22:
                vi3Var.invoke(new my9(((Double) obj).doubleValue()));
                break;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                String str2 = (String) obj;
                str2.getClass();
                vi3Var.invoke(new wy9(str2));
                break;
            case 24:
                TextHighlightStyle textHighlightStyle = (TextHighlightStyle) obj;
                textHighlightStyle.getClass();
                vi3Var.invoke(new ty9(textHighlightStyle));
                break;
            case 25:
                vi3Var.invoke(gy9.f41534a);
                break;
            case 26:
                j3a j3aVar = (j3a) obj;
                j3aVar.getClass();
                vi3Var.invoke(j3aVar);
                break;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                if (((Float) obj).floatValue() == 0.0f) {
                    vi3Var.invoke(n2a.f52243a);
                }
                break;
            case 28:
                TokenStatus tokenStatus = (TokenStatus) obj;
                tokenStatus.getClass();
                vi3Var.invoke(new i3a(tokenStatus));
                break;
            default:
                TokenMeaning tokenMeaning = (TokenMeaning) obj;
                tokenMeaning.getClass();
                String str3 = tokenMeaning.f19595b;
                if (str3 == null) {
                    str3 = "";
                }
                vi3Var.invoke(new w2a(tokenMeaning, str3));
                break;
        }
        return xfaVar;
    }
}
