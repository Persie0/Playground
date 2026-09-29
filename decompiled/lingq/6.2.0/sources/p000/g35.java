package p000;

import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import com.lingq.core.domain.model.library.LibraryContentType;
import com.lingq.core.domain.model.library.LibraryShelf;
import com.lingq.core.domain.model.library.LibraryShelfType;
import com.lingq.core.domain.model.library.LibraryTab;
import com.lingq.core.p012ui.R$string;
import com.lingq.feature.lessoninfo.LessonInfoFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class g35 implements a35 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LessonInfoFragment f40112a;

    public g35(LessonInfoFragment lessonInfoFragment) {
        this.f40112a = lessonInfoFragment;
    }

    @Override // p000.a35
    /* JADX INFO: renamed from: g */
    public final void mo64g(String str) {
        LessonInfoFragment lessonInfoFragment = this.f40112a;
        w41 w41Var = lessonInfoFragment.f26343S0;
        if (w41Var == null) {
            fa4.m11636J("navGraphController");
            throw null;
        }
        String value = LibraryShelfType.SourceSearch.getValue();
        LibraryContentType libraryContentType = LibraryContentType.Lessons;
        LibraryShelf libraryShelf = new LibraryShelf(vz1.m23605K(new LibraryTab("Lessons", libraryContentType.getValue(), -1, true, 0, "/search/lessons"), new LibraryTab("Courses", LibraryContentType.Courses.getValue(), -1, false, 1, "/search/courses")), value);
        LibraryTab libraryTab = new LibraryTab("Lessons", libraryContentType.getValue(), -1, true, 0, "/search/lessons");
        String strM2111m = lessonInfoFragment.m2111m(R$string.search_search);
        strM2111m.getClass();
        w41Var.m23737z(new ma6(libraryShelf, libraryTab, strM2111m, str));
    }

    @Override // p000.a35
    /* JADX INFO: renamed from: h */
    public final void mo65h(String str) {
        str.getClass();
        LessonInfoFragment lessonInfoFragment = this.f40112a;
        id3 id3VarM2089Q = lessonInfoFragment.m2089Q();
        b34.m3244j(lessonInfoFragment);
        mbd.m16755c(id3VarM2089Q, str, null, 26);
    }

    @Override // p000.a35
    /* JADX INFO: renamed from: i */
    public final void mo66i(c55 c55Var) {
        boolean z = c55Var.f9577d;
        LessonInfoFragment lessonInfoFragment = this.f40112a;
        w41 w41Var = lessonInfoFragment.f26343S0;
        LqAnalyticsValues$LessonPath.LessonInfo lessonInfo = LqAnalyticsValues$LessonPath.LessonInfo.f14309a;
        if (!z) {
            if (w41Var != null) {
                w41Var.m23737z(new ja6(c55Var.f9574a, c55Var.f9575b, c55Var.f9576c, lessonInfo));
                return;
            } else {
                fa4.m11636J("navGraphController");
                throw null;
            }
        }
        if (w41Var == null) {
            fa4.m11636J("navGraphController");
            throw null;
        }
        String str = c55Var.f9579f;
        String str2 = str == null ? "" : str;
        String str3 = c55Var.f9578e;
        w41Var.m23737z(new ea6(str2, str3 == null ? "" : str3, c55Var.f9574a, lessonInfo, ((i35) lessonInfoFragment.f26342R0.getValue()).f43406g, c55Var.f9580g, c55Var.f9581h, c55Var.f9582i, c55Var.f9583j, c55Var.f9584k));
    }

    @Override // p000.a35
    /* JADX INFO: renamed from: k */
    public final void mo67k(int i) {
        LessonInfoFragment lessonInfoFragment = this.f40112a;
        w41 w41Var = lessonInfoFragment.f26343S0;
        if (w41Var == null) {
            fa4.m11636J("navGraphController");
            throw null;
        }
        w41Var.m23737z(new s96(i, LqAnalyticsValues$LessonPath.LessonInfo.f14309a, ((i35) lessonInfoFragment.f26342R0.getValue()).f43406g, ""));
    }

    @Override // p000.a35
    public final void onDismiss() {
        b34.m3244j(this.f40112a).m22689f();
    }
}
