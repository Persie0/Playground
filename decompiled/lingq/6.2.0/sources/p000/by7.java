package p000;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.lingq.core.analytics.data.modules.LessonEngagedDataType;
import com.lingq.core.domain.model.lesson.TokenType;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.feature.reader.old.C2411m;
import com.lingq.feature.reader.old.ReaderPageFragment;
import java.util.List;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes3.dex */
public final class by7 extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ je9 f9175a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderPageFragment f9176b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xz7 f9177c;

    public by7(je9 je9Var, ReaderPageFragment readerPageFragment, xz7 xz7Var) {
        this.f9175a = je9Var;
        this.f9176b = readerPageFragment;
        this.f9177c = xz7Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        view.getClass();
        je9 je9Var = this.f9175a;
        boolean z = je9Var.f45486g;
        xz7 xz7Var = this.f9177c;
        ReaderPageFragment readerPageFragment = this.f9176b;
        if (z) {
            if (je9Var.f45489j) {
                vx7 vx7Var = ReaderPageFragment.Companion;
                readerPageFragment.m9299X0().mo49u1(LessonEngagedDataType.KnownWordsClicked, 1);
            } else {
                vx7 vx7Var2 = ReaderPageFragment.Companion;
                readerPageFragment.m9299X0().mo49u1(LessonEngagedDataType.BlueWordsClicked, 1);
            }
            readerPageFragment.m9299X0().m9312g3(xz7Var);
            return;
        }
        if (z) {
            gm5.m12750e();
            return;
        }
        int i = je9Var.f45487h;
        if (i == CardStatus.Known.getValue()) {
            vx7 vx7Var3 = ReaderPageFragment.Companion;
            readerPageFragment.m9299X0().mo49u1(LessonEngagedDataType.KnownWordsClicked, 1);
        } else if (i == CardStatus.Learned.getValue()) {
            vx7 vx7Var4 = ReaderPageFragment.Companion;
            readerPageFragment.m9299X0().mo49u1(LessonEngagedDataType.LingqsClicked, 1);
            readerPageFragment.m9299X0().mo49u1(LessonEngagedDataType.KnownWordsClicked, 1);
        } else {
            vx7 vx7Var5 = ReaderPageFragment.Companion;
            readerPageFragment.m9299X0().mo49u1(LessonEngagedDataType.LingqsClicked, 1);
        }
        C2411m c2411mM9299X0 = readerPageFragment.m9299X0();
        c2411mM9299X0.getClass();
        xz7Var.getClass();
        for (iy7 iy7Var : (List) ((C3244l) c2411mM9299X0.f29199D.f9311a).getValue()) {
            if (iy7Var.f44781c.get(xz7Var.f69008e) != null && c2411mM9299X0.m9306a3(iy7Var.f44779a, xz7Var)) {
                if (!iy7Var.equals(c2411mM9299X0.f29252t)) {
                    c2411mM9299X0.m9301V2(iy7Var);
                    return;
                } else if (xz7Var.equals(c2411mM9299X0.f29251s)) {
                    c2411mM9299X0.m9301V2(iy7Var);
                    return;
                } else {
                    c2411mM9299X0.m9302W2(xz7Var, TokenType.CardType);
                    return;
                }
            }
        }
        c2411mM9299X0.m9303X2();
        c2411mM9299X0.m9302W2(xz7Var, TokenType.CardType);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.getClass();
        textPaint.setUnderlineText(false);
    }
}
