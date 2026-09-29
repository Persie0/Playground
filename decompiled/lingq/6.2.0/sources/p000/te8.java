package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.core.p012ui.views.AdapterItemType;
import com.lingq.feature.review.R$id;
import com.lingq.feature.review.R$layout;
import com.lingq.feature.review.ReviewSessionCompleteAdapter$AdapterItemType;
import com.lingq.feature.token.R$drawable;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class te8 extends se5 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f62197e = 1;

    /* JADX INFO: renamed from: f */
    public final h90 f62198f;

    /* JADX INFO: renamed from: g */
    public final Object f62199g;

    public te8(h90 h90Var, gr9 gr9Var) {
        super(new ve2(4));
        this.f62198f = h90Var;
        this.f62199g = gr9Var;
    }

    @Override // p000.p28
    /* JADX INFO: renamed from: c */
    public final int mo8978c(int i) {
        switch (this.f62197e) {
            case 0:
                oe8 oe8Var = (oe8) m21308k(i);
                if (oe8Var instanceof me8) {
                    return ReviewSessionCompleteAdapter$AdapterItemType.TermStudied.ordinal();
                }
                if (oe8Var instanceof le8) {
                    return ReviewSessionCompleteAdapter$AdapterItemType.Header.ordinal();
                }
                if (oe8Var instanceof ne8) {
                    return ReviewSessionCompleteAdapter$AdapterItemType.Title.ordinal();
                }
                gm5.m12750e();
                return 0;
            default:
                if (((ar9) m21308k(i)) instanceof ar9) {
                    return AdapterItemType.Content.ordinal();
                }
                gm5.m12750e();
                return 0;
        }
    }

    @Override // p000.p28
    /* JADX INFO: renamed from: e */
    public final void mo6135e(o38 o38Var, int i) {
        switch (this.f62197e) {
            case 0:
                final se8 se8Var = (se8) o38Var;
                if (se8Var instanceof qe8) {
                    Object objM21308k = m21308k(i);
                    objM21308k.getClass();
                    le8 le8Var = (le8) objM21308k;
                    ((TextView) ((qe8) se8Var).f57658u.f37183b).setText(String.format(Locale.getDefault(), "%d/%d", Arrays.copyOf(new Object[]{Integer.valueOf(le8Var.f49559a), Integer.valueOf(le8Var.f49560b)}, 2)));
                } else if (se8Var instanceof re8) {
                    Object objM21308k2 = m21308k(i);
                    objM21308k2.getClass();
                    re8 re8Var = (re8) se8Var;
                    re8Var.f59164u.f35564b.setText(re8Var.f53781a.getContext().getString(((ne8) objM21308k2).f52654a));
                } else if (!(se8Var instanceof pe8)) {
                    gm5.m12750e();
                } else {
                    Object objM21308k3 = m21308k(i);
                    objM21308k3.getClass();
                    final me8 me8Var = (me8) objM21308k3;
                    pe8 pe8Var = (pe8) se8Var;
                    qf5 qf5Var = pe8Var.f56012u;
                    vs3 vs3Var = me8Var.f51212a;
                    LessonCard lessonCard = me8Var.f51213b;
                    int i2 = me8Var.f51214c;
                    int i3 = me8Var.f51215d;
                    View view = pe8Var.f53781a;
                    vs3Var.getClass();
                    TextView textView = qf5Var.f57698g;
                    TextView textView2 = qf5Var.f57697f;
                    ImageButton imageButton = qf5Var.f57693b;
                    textView.setText(lessonCard.f19178a);
                    qf5Var.f57696e.setText(t7d.m21897b(lessonCard.f19183f));
                    int i4 = lessonCard.f19188k;
                    Integer num = lessonCard.f19189l;
                    int iM24983b = y7d.m24983b(i4, num);
                    final int i5 = 1;
                    if (iM24983b == CardStatus.Ignored.getValue() || iM24983b == CardStatus.Known.getValue()) {
                        jfa.m14420c(textView2);
                        jfa.m14429l(imageButton);
                        Context context = view.getContext();
                        context.getClass();
                        ppc.m19444c(context, iM24983b, imageButton);
                        Context context2 = view.getContext();
                        context2.getClass();
                        ppc.m19445d(imageButton, jfa.m14431n(context2, ppc.m19442a(vs3Var, i4, num)));
                        imageButton.setActivated(true);
                    } else {
                        jfa.m14429l(textView2);
                        jfa.m14420c(imageButton);
                        if (iM24983b == CardStatus.New.getValue()) {
                            textView2.setText("1");
                        } else if (iM24983b == CardStatus.Recognized.getValue()) {
                            textView2.setText("2");
                        } else if (iM24983b == CardStatus.Familiar.getValue()) {
                            textView2.setText("3");
                        } else if (iM24983b == CardStatus.Learned.getValue()) {
                            textView2.setText("4");
                        }
                        Context context3 = view.getContext();
                        context3.getClass();
                        ppc.m19445d(textView2, jfa.m14431n(context3, ppc.m19442a(vs3Var, i4, num)));
                        textView2.setActivated(true);
                    }
                    qf5Var.f57694c.setText(String.format(Locale.getDefault(), "%d", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1)));
                    qf5Var.f57695d.setText(String.format(Locale.getDefault(), "%d", Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1)));
                    qf5Var.f57692a.setOnClickListener(new View.OnClickListener() { // from class: je8
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            if (((pe8) se8Var).m17783c() != -1) {
                                this.f62198f.mo10699a(me8Var.f51213b);
                            }
                        }
                    });
                    final int i6 = 0;
                    imageButton.setOnClickListener(new View.OnClickListener() { // from class: ke8
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i7 = i6;
                            te8 te8Var = this;
                            se8 se8Var2 = se8Var;
                            switch (i7) {
                                case 0:
                                    pe8 pe8Var2 = (pe8) se8Var2;
                                    if (pe8Var2.m17783c() != -1) {
                                        Object objM21308k4 = te8Var.m21308k(pe8Var2.m17783c());
                                        objM21308k4.getClass();
                                        me8 me8Var2 = (me8) objM21308k4;
                                        ue8 ue8Var = (ue8) te8Var.f62199g;
                                        if (ue8Var != null) {
                                            LessonCard lessonCard2 = me8Var2.f51213b;
                                            view2.getClass();
                                            ue8Var.m22715b(lessonCard2, view2);
                                        }
                                    }
                                    break;
                                default:
                                    pe8 pe8Var3 = (pe8) se8Var2;
                                    if (pe8Var3.m17783c() != -1) {
                                        Object objM21308k5 = te8Var.m21308k(pe8Var3.m17783c());
                                        objM21308k5.getClass();
                                        me8 me8Var3 = (me8) objM21308k5;
                                        ue8 ue8Var2 = (ue8) te8Var.f62199g;
                                        if (ue8Var2 != null) {
                                            LessonCard lessonCard3 = me8Var3.f51213b;
                                            view2.getClass();
                                            ue8Var2.m22715b(lessonCard3, view2);
                                        }
                                    }
                                    break;
                            }
                        }
                    });
                    textView2.setOnClickListener(new View.OnClickListener() { // from class: ke8
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i7 = i5;
                            te8 te8Var = this;
                            se8 se8Var2 = se8Var;
                            switch (i7) {
                                case 0:
                                    pe8 pe8Var2 = (pe8) se8Var2;
                                    if (pe8Var2.m17783c() != -1) {
                                        Object objM21308k4 = te8Var.m21308k(pe8Var2.m17783c());
                                        objM21308k4.getClass();
                                        me8 me8Var2 = (me8) objM21308k4;
                                        ue8 ue8Var = (ue8) te8Var.f62199g;
                                        if (ue8Var != null) {
                                            LessonCard lessonCard2 = me8Var2.f51213b;
                                            view2.getClass();
                                            ue8Var.m22715b(lessonCard2, view2);
                                        }
                                    }
                                    break;
                                default:
                                    pe8 pe8Var3 = (pe8) se8Var2;
                                    if (pe8Var3.m17783c() != -1) {
                                        Object objM21308k5 = te8Var.m21308k(pe8Var3.m17783c());
                                        objM21308k5.getClass();
                                        me8 me8Var3 = (me8) objM21308k5;
                                        ue8 ue8Var2 = (ue8) te8Var.f62199g;
                                        if (ue8Var2 != null) {
                                            LessonCard lessonCard3 = me8Var3.f51213b;
                                            view2.getClass();
                                            ue8Var2.m22715b(lessonCard3, view2);
                                        }
                                    }
                                    break;
                            }
                        }
                    });
                }
                break;
            default:
                fr9 fr9Var = (fr9) o38Var;
                if (fr9Var instanceof dr9) {
                    dr9 dr9Var = (dr9) fr9Var;
                    df5 df5Var = dr9Var.f36116u;
                    Object objM21308k4 = m21308k(dr9Var.m17783c());
                    objM21308k4.getClass();
                    ar9 ar9Var = (ar9) objM21308k4;
                    String str = ar9Var.f7405a;
                    boolean z = ar9Var.f7406b;
                    str.getClass();
                    df5Var.f35564b.setText(str);
                    TextView textView3 = df5Var.f35564b;
                    if (z) {
                        textView3.setBackgroundResource(R$drawable.dr_tag_filled_bg);
                    } else {
                        textView3.setBackgroundResource(R$drawable.dr_tag_bg);
                    }
                    df5Var.f35563a.setOnClickListener(new tr0(3, fr9Var, this));
                } else if (!(fr9Var instanceof er9)) {
                    gm5.m12750e();
                } else {
                    ((er9) fr9Var).f37759u.f59204a.setOnClickListener(new h31(this, 11));
                }
                break;
        }
    }

    @Override // p000.p28
    /* JADX INFO: renamed from: f */
    public final o38 mo6136f(ViewGroup viewGroup, int i) {
        o38 pe8Var;
        o38 er9Var;
        switch (this.f62197e) {
            case 0:
                if (i == ReviewSessionCompleteAdapter$AdapterItemType.Header.ordinal()) {
                    View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.list_header_review_session, viewGroup, false);
                    MaterialCardView materialCardView = (MaterialCardView) viewInflate;
                    int i2 = R$id.tv_result;
                    TextView textView = (TextView) lfa.m16159c(viewInflate, i2);
                    if (textView != null) {
                        i2 = R$id.tvTitle;
                        if (((TextView) lfa.m16159c(viewInflate, i2)) != null) {
                            i2 = R$id.viewLesson;
                            if (((LinearLayout) lfa.m16159c(viewInflate, i2)) != null) {
                                pe8Var = new qe8(new ef5(textView, materialCardView));
                            }
                        }
                    }
                    C3386nv.m17635v("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
                    return null;
                }
                if (i != ReviewSessionCompleteAdapter$AdapterItemType.Title.ordinal()) {
                    if (i != ReviewSessionCompleteAdapter$AdapterItemType.TermStudied.ordinal()) {
                        uk9.m22770c();
                        return null;
                    }
                    View viewInflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.list_item_review_term_studied, viewGroup, false);
                    int i3 = R$id.ibStatus;
                    ImageButton imageButton = (ImageButton) lfa.m16159c(viewInflate2, i3);
                    if (imageButton != null) {
                        i3 = R$id.tvCorrect;
                        TextView textView2 = (TextView) lfa.m16159c(viewInflate2, i3);
                        if (textView2 != null) {
                            i3 = R$id.tvIncorrect;
                            TextView textView3 = (TextView) lfa.m16159c(viewInflate2, i3);
                            if (textView3 != null) {
                                i3 = R$id.tvMeaning;
                                TextView textView4 = (TextView) lfa.m16159c(viewInflate2, i3);
                                if (textView4 != null) {
                                    i3 = R$id.tvStatus;
                                    TextView textView5 = (TextView) lfa.m16159c(viewInflate2, i3);
                                    if (textView5 != null) {
                                        i3 = R$id.tvTerm;
                                        TextView textView6 = (TextView) lfa.m16159c(viewInflate2, i3);
                                        if (textView6 != null) {
                                            pe8Var = new pe8(new qf5((ConstraintLayout) viewInflate2, imageButton, textView2, textView3, textView4, textView5, textView6));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    C3386nv.m17635v("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i3)));
                    return null;
                }
                View viewInflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.list_header_review_complete_title, viewGroup, false);
                if (viewInflate3 == null) {
                    C3386nv.m17635v("rootView");
                    return null;
                }
                TextView textView7 = (TextView) viewInflate3;
                pe8Var = new re8(new df5(textView7, textView7));
                return pe8Var;
            default:
                if (i == AdapterItemType.Content.ordinal()) {
                    View viewInflate4 = LayoutInflater.from(viewGroup.getContext()).inflate(com.lingq.feature.token.R$layout.list_item_tag, viewGroup, false);
                    if (viewInflate4 == null) {
                        C3386nv.m17635v("rootView");
                        return null;
                    }
                    TextView textView8 = (TextView) viewInflate4;
                    er9Var = new dr9(new df5(textView8, textView8));
                } else {
                    if (i != AdapterItemType.Header.ordinal()) {
                        uk9.m22770c();
                        return null;
                    }
                    View viewInflate5 = LayoutInflater.from(viewGroup.getContext()).inflate(com.lingq.feature.token.R$layout.list_item_tag_add, viewGroup, false);
                    if (viewInflate5 == null) {
                        C3386nv.m17635v("rootView");
                        return null;
                    }
                    er9Var = new er9(new rf5((TextView) viewInflate5));
                }
                return er9Var;
        }
    }

    public te8(h90 h90Var, ue8 ue8Var) {
        super(new ve2(3));
        this.f62198f = h90Var;
        this.f62199g = ue8Var;
    }
}
