package p000;

import android.view.View;
import android.widget.PopupWindow;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.p012ui.LessonInfoSource;
import com.lingq.feature.reader.old.ReaderFragment;
import com.lingq.feature.review.activities.ReviewActivityFlashcardFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class qw7 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58289a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractComponentCallbacksC0635c f58290b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f58291c;

    public /* synthetic */ qw7(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, Object obj, int i) {
        this.f58289a = i;
        this.f58290b = abstractComponentCallbacksC0635c;
        this.f58291c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f58289a;
        Object obj = this.f58291c;
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = this.f58290b;
        switch (i) {
            case 0:
                ReaderFragment readerFragment = (ReaderFragment) abstractComponentCallbacksC0635c;
                PopupWindow popupWindow = readerFragment.f28223G0;
                if (popupWindow == null) {
                    fa4.m11636J("popupSettings");
                    throw null;
                }
                popupWindow.dismiss();
                w41 w41VarM9289V0 = readerFragment.m9289V0();
                Lesson lesson = (Lesson) obj;
                int i2 = lesson.f19142a;
                String str = lesson.f19143b;
                String str2 = lesson.f19146e;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = lesson.f19145d;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = lesson.f19144c;
                w41VarM9289V0.m23737z(new da6(i2, str, str2, str3, str4 == null ? "" : str4, LessonInfoSource.Lesson, ""));
                return;
            default:
                bh4[] bh4VarArr = ReviewActivityFlashcardFragment.f31913H0;
                sca.m21224J0(((ReviewActivityFlashcardFragment) abstractComponentCallbacksC0635c).m9539U0(), ((LessonCard) obj).f19178a, false, 12);
                return;
        }
    }
}
