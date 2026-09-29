package p000;

import com.lingq.core.p012ui.library.CourseContextMenuItem;
import com.lingq.core.p012ui.library.LessonContextMenuItem;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c85 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9703a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f9704b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f9705c;

    public /* synthetic */ c85(vi3 vi3Var, t66 t66Var, int i) {
        this.f9703a = i;
        this.f9704b = vi3Var;
        this.f9705c = t66Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f9703a;
        xfa xfaVar = xfa.f68157a;
        t66 t66Var = this.f9705c;
        vi3 vi3Var = this.f9704b;
        switch (i) {
            case 0:
                CourseContextMenuItem courseContextMenuItem = (CourseContextMenuItem) obj;
                courseContextMenuItem.getClass();
                vi3Var.invoke(courseContextMenuItem);
                t66Var.setValue(Boolean.FALSE);
                break;
            default:
                LessonContextMenuItem lessonContextMenuItem = (LessonContextMenuItem) obj;
                lessonContextMenuItem.getClass();
                vi3Var.invoke(lessonContextMenuItem);
                t66Var.setValue(Boolean.FALSE);
                break;
        }
        return xfaVar;
    }
}
