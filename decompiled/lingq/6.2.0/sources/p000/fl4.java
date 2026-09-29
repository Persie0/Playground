package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import com.lingq.core.p012ui.library.LessonContextMenuItem;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fl4 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39247a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f39248b;

    public /* synthetic */ fl4(vi3 vi3Var, int i) {
        this.f39247a = i;
        this.f39248b = vi3Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f39247a;
        oqa oqaVar = oqa.f54761a;
        rm4 rm4Var = rm4.f59535a;
        zm4 zm4Var = zm4.f71763a;
        l35 l35Var = l35.f48987a;
        xfa xfaVar = xfa.f68157a;
        vi3 vi3Var = this.f39248b;
        switch (i) {
            case 0:
                vi3Var.invoke(mqa.f51747a);
                break;
            case 1:
                vi3Var.invoke(oqaVar);
                break;
            case 2:
                vi3Var.invoke(oqaVar);
                break;
            case 3:
                vi3Var.invoke(rm4Var);
                break;
            case 4:
                vi3Var.invoke(rm4Var);
                break;
            case 5:
                vi3Var.invoke(zm4Var);
                break;
            case 6:
                vi3Var.invoke(zm4Var);
                break;
            case 7:
                vi3Var.invoke(LanguageProgressPeriod.Today);
                break;
            case 8:
                vi3Var.invoke(LanguageProgressPeriod.AllTime);
                break;
            case 9:
                vi3Var.invoke(oja.f54468a);
                break;
            case 10:
                vi3Var.invoke(pja.f56325a);
                break;
            case 11:
                vi3Var.invoke(q1b.f57133a);
                break;
            case 12:
                vi3Var.invoke(r1b.f58498a);
                break;
            case 13:
                vi3Var.invoke(LessonContextMenuItem.Like);
                break;
            case 14:
                vi3Var.invoke(LessonContextMenuItem.OpenLesson);
                break;
            case 15:
                vi3Var.invoke(LessonContextMenuItem.ViewCourse);
                break;
            case 16:
                vi3Var.invoke(LessonContextMenuItem.UpdateIsTaken);
                break;
            case 17:
                vi3Var.invoke(LessonContextMenuItem.LessonInfo);
                break;
            case 18:
                vi3Var.invoke(LessonContextMenuItem.BlacklistSource);
                break;
            case 19:
                vi3Var.invoke(LessonContextMenuItem.Archive);
                break;
            case 20:
                vi3Var.invoke(LessonContextMenuItem.Report);
                break;
            case 21:
                vi3Var.invoke(LessonContextMenuItem.Subscribe);
                break;
            case 22:
                vi3Var.invoke(LessonContextMenuItem.AddToPlaylist);
                break;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                vi3Var.invoke(i45.f43484a);
                break;
            case 24:
                vi3Var.invoke(j45.f45041a);
                break;
            case 25:
                vi3Var.invoke(k45.f46692a);
                break;
            case 26:
                vi3Var.invoke(l35Var);
                break;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                vi3Var.invoke(l35Var);
                break;
            case 28:
                vi3Var.invoke(l35Var);
                break;
            default:
                vi3Var.invoke(Double.valueOf(-0.1d));
                break;
        }
        return xfaVar;
    }
}
