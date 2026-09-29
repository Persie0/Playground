package com.lingq.p055ui.lesson.page;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.lingq.shared.uimodel.token.TokenType;
import dm.C5207g;
import java.util.List;
import p265mj.C7568b;
import p265mj.C7569c;
import p265mj.C7570d;

/* JADX INFO: renamed from: com.lingq.ui.lesson.page.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C4387c extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7569c f28714a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonPageFragment f28715b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C7570d f28716c;

    public C4387c(C7569c c7569c, LessonPageFragment lessonPageFragment, C7570d c7570d) {
        this.f28714a = c7569c;
        this.f28715b = lessonPageFragment;
        this.f28716c = c7570d;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C5207g.m11111f(view, "widget");
        boolean z10 = this.f28714a.f41719f;
        C7570d c7570d = this.f28716c;
        LessonPageFragment lessonPageFragment = this.f28715b;
        if (z10) {
            LessonPageFragment.C4337a c4337a = LessonPageFragment.f28335M0;
            lessonPageFragment.m10193t0().m10207v2(c7570d);
            return;
        }
        if (!z10) {
            LessonPageFragment.C4337a c4337a2 = LessonPageFragment.f28335M0;
            LessonPageViewModel lessonPageViewModelM10193t0 = lessonPageFragment.m10193t0();
            C5207g.m11111f(c7570d, "token");
            for (C7568b c7568b : (List) lessonPageViewModelM10193t0.f28539U.getValue()) {
                if (c7568b.f41712c.get(c7570d.f41725e) != null && lessonPageViewModelM10193t0.m10201o2(c7568b.f41710a, c7570d)) {
                    if (!C5207g.m11106a(c7568b, lessonPageViewModelM10193t0.f28529K)) {
                        lessonPageViewModelM10193t0.m10199m2(c7568b);
                        return;
                    } else if (C5207g.m11106a(c7570d, lessonPageViewModelM10193t0.f28528J)) {
                        lessonPageViewModelM10193t0.m10199m2(c7568b);
                        return;
                    } else {
                        lessonPageViewModelM10193t0.m10200n2(c7570d, TokenType.CardType);
                        return;
                    }
                }
            }
            lessonPageViewModelM10193t0.m10198g();
            lessonPageViewModelM10193t0.m10200n2(c7570d, TokenType.CardType);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C5207g.m11111f(textPaint, "ds");
        textPaint.setUnderlineText(false);
    }
}
